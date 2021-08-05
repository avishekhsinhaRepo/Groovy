class User {
    String userName
    String id
    void getUserDetails(){
        println "The user id= $id and name $userName"
    }
}

User user = new User(id:"U001",userName:"John")
user.getUserDetails()
