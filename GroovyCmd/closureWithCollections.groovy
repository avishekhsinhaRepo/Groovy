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