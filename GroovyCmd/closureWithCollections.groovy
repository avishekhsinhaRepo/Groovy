List students =["Alex","Rob","Ram"]
students.each{ student ->
    println student
}
students.eachWithIndex{ student , index ->
    println "$index : $student"
}

println students.findAll({
    student -> student.startsWith("R")})
    
println students.findAll{
   it.startsWith("R")}
  
List nums =[10,20,30,40]
println nums.collect{ it*2 }