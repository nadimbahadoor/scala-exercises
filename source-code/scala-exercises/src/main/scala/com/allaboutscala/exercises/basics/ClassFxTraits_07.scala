package com.allaboutscala.exercises.basics

/**
  * Created by Nadim Bahadoor on 01/20/2020.
  *
  * Tutorial: Source code for the scala-exercises section at http://allaboutscala.com
  *
  * [[http://allaboutscala.com/tutorials/scala-exercises/]]
  *
  *
  * Copyright 2016 Nadim Bahadoor (http://allaboutscala.com)
  *
  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
  * use this file except in compliance with the License. You may obtain a copy of
  * the License at
  *
  *  [http://www.apache.org/licenses/LICENSE-2.0]
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  * License for the specific language governing permissions and limitations under
  * the License.
  */
object ClassFxTraits_07 extends App {

  // 7: Write a Scala program and use a case class structure to represent the following
  // students: (1) John who is 7 years old, (2) Jack who is 13 years old, (3) Joe who is
  // 15 years old, (4) Jill who is 15 years old, and (5) James who is 11 years old. Use
  // an appropriate data structure, and store the above-mentioned students. Next, write
  // a recursive method that will walk-through your data structure and output true for
  // the first student that is of 15 years old. If no students are found matching this
  // particular criteria, the recursive function should return false.
  // Output:
//  Student(John,7)
//  Student(Jack,13)
//  Student(Joe,15)
//  Student(Jill,15)
//  Student(James,11)
//  Is there a student who is 15 years old = true


  final case class Student(name: String, age: Int)

  val john = Student(name = "John", age = 7)
  val jack = Student(name = "Jack", age = 13)
  val joe = Student(name = "Joe", age = 15)
  val jill = Student(name = "Jill", age = 15)
  val james = Student(name = "James", age = 11)

  val students = Vector(john, jack, joe, jill, james)
  println(students.mkString("\n"))


  @annotation.tailrec
  def findStudentAge15(student: Student, students: Vector[Student], index: Int): Boolean = {
    if(students.length == index)
      false
    else if (students(index).age == student.age)
      true
    else
      findStudentAge15(student, students, index + 1)
  }


  val foundStudent = findStudentAge15(Student("", 15), students, 0)
  println(s"Is there a student who is 15 years old = $foundStudent")

}
