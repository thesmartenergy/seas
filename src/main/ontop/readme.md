# ontop folder

This folder contains the SEAS ontology documents. 

Every ontology document must be a Turtle document, and be named as follows:

> NAME-MAJOR.MINOR.ttl

where:

- NAME matches `^[a-z]*$`
- MAJOR matches `^[0-9]+$`
- MINOR matches `^[0-9]+$`

see http://semver.org/ for semantic versioning specification.

## Ontology metadata

SEAS ontologies are modularized and versionned. An ontology instance uses the following metadata:

- type `owl:Ontology`;
- a `owl:versionIRI` equal to `<https://w3id.org/seas/NAME-MAJOR.MINOR>`;
- a `owl:versionInfo` that starts with `"vMAJOR.MINOR"`;
- potentially, a `owl:priorVersion`;
- zero or more `owl:import`s that point to other ontologies (potentially ontology version IRIs) to be imported.


Then every ontology instance must have the following recommended metadata:

- type `voaf:Vocabulary`;
- at least one `dcterms:title` with a language tag;
- at least one `dcterms:description` with a language tag (it SHOULD use the markdown syntax);
- a `dcterms:issued` (some `xsd:date`);
- a `dcterms:modified` (some `xsd:date`);
- a `dcterms:creator` (some `foaf:Person`);
- zero or more `dcterms:contributor` (some `foaf:Person`);
- a `cc:licence` equal to `<https://www.apache.org/licenses/LICENSE-2.0>`;
- a `vann:preferredNamespacePrefix` equal to `"seas"`;
- a `vann:preferredNamespaceUri` equal to `"https://w3id.org/seas/"`;

## Concept metadata

Every other resource in the ontology `<https://w3id.org/seas/SOME_RESOURCE>` must have the following metadata:

- at least one `rdfs:label` with a language tag;
- at least one `rdfs:comment` with a language tag (it SHOULD use the markdown syntax);
- a `vs:term_status`: one of `"unstable"`, `"testing"`, or `"stable"`;
- a `rdfs:isDefinedBy` equal to `<https://w3id.org/seas/NAME>`.

