# SEAS ontologies

This project contains the sources of the [ITEA 2 SEAS](http://the-smart-energy.com) Knowledge Model, and the sources of the website that exposes this Knowledge Model. This website is conform with the specifications described in SEAS deliverable 2.2. Among other: 

 1. SEAS Ontologies are modularized and versioned;
 1. There is only one namespace for ontologies and every SEAS resource. this namespace is very simple: https://w3id.org/seas/ ;
 1. ALL of the important good practices promoted by the W3C consortium are met. 

The current SEAS ontologies and the resources are already accessible at their URIs. Try for instance the following URIs in your browser or in [Protégé](http://protege.stanford.edu/):

 - https://w3id.org/seas/ (the main ontology)
 - https://w3id.org/seas/BuildingOntology  (a module ontology)
 - https://w3id.org/seas/BuildingOntology-0.9  (a module ontology in a specific version)
 - https://w3id.org/seas/EndNode   (a resource defined by the ArchitectureOntology module)


## How to Get Involved

### Report issues

* Use the issue tracker to propose examples, additions, or report bugs - http://github.com/thesmartenergy/seas/issues

### Web-site based Pull-Request

* [Fork](https://github.com/thesmartenergy/seas#fork-destination-box) the `thesmartenergy/seas` repository into your own account (button in the top right corner)
* Navigate to a file in your master branch that you want to change (e.g.,   https://github.com/{your-account}/seas/edit/master/src/main/ontop/ActorOntology-0.9.ttl)
* Click the edit icon in the upper right (pen next to Raw/Blame/History)
* Make your edits (e.g., directly in the online editor or by copying the text to your favorite editor and back)
* Give a meaningful commit message (i.e., do not leave "Update ...")
* Choose *Create a new branch for this commit and start a pull request* and give a proper name (e.g., `enhancing-documentation-DSO`)
* Click *Propose file change*
* Skip the form, since you do not want to create a PR to your fork. Instead, go to https://github.com/thesmartenergy/seas, where GitHub will have found your new branch and will offer to open a pull-request (base fork: `thesmartenergy/seas`, base: `master` ... head fork: `{your-account}/wot`, compare: `{your-branch}`).
* If you have a separate change proposal for the same file, go back to your master branch and repeat the process from clicking the edit icon.
* If the pull-request discussion expects you to update your change proposal, go to your branch corresponding to the PR, click the edit icon, and commit directly to that branch.

### Command-line based Pull-Request

* [Fork](https://github.com/thesmartenergy/seas#fork-destination-box) the `thesmartenergy/seas` repository into your own account
* Create a branch in your fork for one particular topic (e.g., a single IG scope item) with a proper name (e.g., `enhancing-documentation-actors`)
* Make your edits and commit
* Push the new branch to your own repository fork
* GitHub will automatically offer to open a pull-request to `thesmartenergy/seas` (from your new branch to master)

### Github Help

* https://help.github.com/articles/using-pull-requests/ provides a tutorial on GitHub pull-requests.

