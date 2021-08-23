package com.course
l = ['Max', 'Ryan','Brad']
l.each {println it}

def studentList= []
def studentMap1 =[:]
def studentMap2 =[:]

studentMap1.put("id", "1")
studentMap1.put("name", "Max")
studentList << studentMap1

studentMap2.put("id", "2")
studentMap2.put("name", "Ryan")
studentList << studentMap2

studentList.each { println "Student Id=${it.id} : Student Name=${it.name}"}