package com.course

import groovy.transform.ToString

@ToString
class User {
    Long userId
    String firstName
    String lastName
    void printDetails(){
        println "${firstName}: ${lastName}"
    }

}

User userDetails = new User(userId:1001,firstName:'Max',lastName:'Alex')
print userDetails



