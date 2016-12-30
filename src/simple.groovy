import groovy.text.SimpleTemplateEngine
import groovy.text.Template

// 3 components to building a dynamic template:

// 1. Engine (SimpleTemplateEngine)
// 2. Template (The email)
// 3. Data Bindings (The data to insert into the dynamic portions of our email.)

SimpleTemplateEngine engine = new SimpleTemplateEngine()
Template template = engine.createTemplate(new File("dynamic-email.txt"))

// data binding
Map bindings = [
        firstName: "Groovy",
        lastName: "K-A",
        commits: 25,
        repos: [
                [name: "Groovy Builder", url: "https://github.com/kelly-ann/GroovyBuilders"],
                [name: "Groovy Database", url: "https://github.com/kelly-ann/GroovyDatabase"],
                [name: "Groovy AWS Lambda Microservice", url: "https://github.com/kelly-ann/GroovyAWSLambda"],
                [name: "Groovy Dates", url: "https://github.com/kelly-ann/GroovyDates"]
        ]
]

println template.make(bindings)
