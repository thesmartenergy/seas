/*
 * Copyright 2016 ITEA 12004 SEAS Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.thesmartenergy.seas.filters;

import com.github.thesmartenergy.seas.App;
import com.github.thesmartenergy.seas.entities.OntologyVersion;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import static org.apache.jena.sparql.vocabulary.TestManifestUpdate_11.request;
import static org.glassfish.jersey.process.internal.Stages.chain;

/**
 * This class filters the calls to ontologies, and dispatches to the ontology
 * resource
 *
 * @author maxime.lefrancois
 */
@WebFilter(urlPatterns = {"/*"})
public class OntologyFilter implements Filter {

    @Inject
    App app;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = ((HttpServletRequest) request);
        String requestURI = req.getRequestURI();
//        System.out.println("filter " + this.getClass().getSimpleName() + " for requestURI:" + requestURI);

        // filter calls to one of the ontologies
        if (requestURI.startsWith("/seas/")) {
            String ontoName = requestURI.substring(6);
            if (Pattern.matches("^([a-zA-Z]*)$", ontoName)) {
                OntologyVersion version = app.getVersion(ontoName);
                if(version != null) { 
                    String newURI = "/ontology/" + ontoName + "/" + version.getMajor() + "." + version.getMinor();
//                    System.out.println("filter " + this.getClass().getSimpleName() + " dispatching  to " + newURI);
                    req.getRequestDispatcher(newURI).forward(req, response);
                    return;
                }
            }
        }
//        System.out.println("filter " + this.getClass().getSimpleName() + " chaining");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
}
