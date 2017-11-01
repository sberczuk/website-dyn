def xmlFile = new File("books.xml")
println xmlFile.size()


def parser = new XmlSlurper()
def books=parser.parse(xmlFile)
// get each node name and value
int i=0




// def jsonObject = [ data: books.book.collect {b->
//   [type: "book", id: i++,
//   attributes:
//   b.children().collect{ it->
//     if(it.children().size() == 0 ){
//     ["${it.name()}": it.text()] // add closure to handle nested
//   } else{
//     [(it.name()) : it.children().collect{ a->
//        [(a.name()): a.text()]
//       }]
//   }
//   }
//
//   ]}]

// only saves the last item!
def jsonObject = [ data: books.book.collect {b->
  [type: "book", id: b.isbn.text(),
  attributes:
  b.children().collectEntries{ it->
    if(it.children().size() == 0 ){
    ["${it.name()}": it.text()] // add closure to handle nested
  } else{
    [(it.name()) : it.children().collect{ a->
      a.text()
      }]
  }
  }

  ]}]
println jsonObject





//println books.book[0].each{v-> v.name v.value}
def json = new groovy.json.JsonBuilder(jsonObject)

println ">> Printing"
println json.toPrettyString()
def outFile = new File("books.json")
println ">> Printing"
println ">> Entries " + i

outFile.write json.toPrettyString()
// outFile.withWriter('UTF-8') { writer ->
//     writer.write(json.toPrettyString())
// }
