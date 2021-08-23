package com.course

int product(int x=2, int y=5){
    x*y;
}
def resultDefault = product 10
def result = product 30 ,10
println resultDefault
println result

void displayProductDetails(Map productDetails){
    println productDetails.id
    println productDetails.name
}
displayProductDetails([
        id:"P1",
        name:"Product 1"
])
displayProductDetails id:"P2",name:"Product 2"

// Method taking closure as input

void closureDemo(closureObj){
    closureObj()
}

closureDemo{
    print "hello world !"
}
