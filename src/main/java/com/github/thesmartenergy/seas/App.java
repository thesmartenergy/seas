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
package com.github.thesmartenergy.seas;

import com.github.thesmartenergy.ontop.BaseURI;
import com.github.thesmartenergy.ontop.DevelopmentBaseURI;
import javax.enterprise.inject.Produces;

/**
 *
 * @author Maxime Lefrançois <maxime.lefrancois at emse.fr>
 */
public class App {
    
    static final boolean DEV = false;
            
    @Produces
    @BaseURI
    static final String BASE = "https://w3id.org/seas/";
    
    @Produces
    @DevelopmentBaseURI
    static final String DEV_BASE = DEV ? "http://localhost:8080/seas/" : BASE; 
    
}
