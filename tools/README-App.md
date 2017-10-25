Steps to build the app

*  ember new bookstore
*  ember serve : verify that we work
*  cp ../../websitev2/ember-bookstore/public/books.json public/ : copy json file
*  ember serve
*  ember g model book
*  ember generate route shop

The thing I was missing was that I was not following JSON API. I needed a data and Attributes section.

My next project is to write a script (Ruby? Groovy?) to convert my XML to a JSON API compliant form.

the code in xmlSrc/xmlToJson.groovy does the conversion. It's not quite there, as it has attributes as lists, not maps.

It may be better to use JSONBuilder syntax rather than mapping Object to JSON


# New Site Site Steps
* Migrate old index page
* look into styling
* Look into build
* Copy site to domain in a sub dir


## Note:
Ember new creates a git repo. Who knew?
