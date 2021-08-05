@groovy.transform.ToString()
class User {
	 Long Id
	 String firstName
	 String lastName
	 Date dob
 
	 void printFullName() {
		println "First Name: $firstName Last Name: $lastName";
	}
}

//Named Parameters
User user = new User(Id:"1",firstName:"John",lastName:"Hopkin",dob:new Date(1900,10,19))
// toString on an object
println user
//Calling a method
user.printFullName()