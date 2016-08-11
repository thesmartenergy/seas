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
package com.github.thesmartenergy.seas.entities;

import java.io.File;

/**
 *
 * @author Maxime Lefrançois <maxime.lefrancois at emse.fr>
 */
public class OntologyVersion implements Comparable<OntologyVersion> {

    final int major;
    final int minor;
    final File file;
    final String name;

    public OntologyVersion(int major, int minor, File file, String name) {
        this.major = major;
        this.minor = minor;
        this.file = file;
        this.name = name;
    }

    public int getMajor() {
        return major;
    }

    public int getMinor() {
        return minor;
    }

    public File getFile() {
        return file;
    }

    public String getName() {
        return name;
    }

    
    @Override
    public int compareTo(OntologyVersion o) {
        if (major < o.major) {
            return -1;
        }
        if (major == o.major) {
            if (minor < o.minor) {
                return -1;
            }
            if (minor == o.minor) {
                return 0;
            }
        }
        return 1;
    }

    @Override
    public int hashCode() {
        return minor + 157 * major;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof OntologyVersion)) {
            return false;
        }
        OntologyVersion v = (OntologyVersion) obj;
        return major == v.major && minor == v.minor;
    }
    

}
