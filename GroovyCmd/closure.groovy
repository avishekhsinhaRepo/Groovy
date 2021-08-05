// Simple Closure Instance 
def c ={}
c instanceof Closure

//Passing Paramter to Closure
def sayHello ={ name ->
    println "Hello ! $name"
}
sayHello("John")

// Default Parammeter
def greet ={ 
    println it
}
greet()
greet("Hi")

// Iteration using default parameter
def empList = ["Alex","john","Rob"]
empList.each({
    println "Student Name=$it"
})
// Iteration using named parameter
empList.each({ name ->
    println "Student Name=$name"
})

// Passing closures


def multiplyNums(num, closure){
    closure(num)
}
multiplyNums(5, { num -> println num*2})
multiplyNums(5,{ num -> println num*3})


multiplyNums(6){
         num -> println num*2
}
multiplyNums(6){
         num -> println num*3
}


def tenTimes(num, clo){
    clo(num*10)
}
tenTimes(2,{ print it })
tenTimes(4,{ print it })



// No Param closures
def noParamClosure = { ->
    println "No Param closure"
}
noParamClosure()

//Default Parameter value in closure

def greeting ={ name, message ="Hello" ->
    println "$message !! $name "    
}

greeting("John")
greeting("Rob","Bye")

// Var args
def varArgsClosure ={ ...args ->
   println args.join(",")    
}
varArgsClosure("Alex", "Rob")
varArgsClosure("Max", "Mike","Mac")

// Closure Metadata

def closureMetadata = { c ->
   println c.	getMaximumNumberOfParameters()
   println c.	parameterTypes
}

def add = {int x, int y -> x+y }

closureMetadata(add)


