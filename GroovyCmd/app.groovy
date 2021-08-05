//Create an instance of developer
Developer d  = new Developer();

//Initialize the instance variable
d.firstName="John"
d.lastName ="Hopkin"
//Adding a language to list
d.languages << "Groovy"
d.languages << "Java"
// Print the object
println d
// calling the method
d.work()