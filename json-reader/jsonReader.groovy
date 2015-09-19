import groovy.json.JsonSlurper

def textJson = new File('data.json').text
def jsonSlurper = new JsonSlurper();

def list = jsonSlurper.parseText(textJson)

def printout = { item ->
	println item.name + ' - ' + item.email	
}

list.each printout