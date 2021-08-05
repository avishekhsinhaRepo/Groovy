@groovy.transform.ToString()
class Developer{
    String firstName
    String lastName
    def languages=[]
    
    void work(){
        println "Developer Name is $firstName $lastName"
    }
}

