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
object ClassFxTraits_08 extends App {

  // 8: Write a Scala program and use an abstract class to define a student that
  // is required to have a name of type String, and an age of type Int. Each
  // Student type should also have a printName() method with Unit as the return type. Thereafter
  // create two sub classes of the Student class, namely, a PrimaryStudent, and a SecondaryStudent.
  // Each sub class should provide its own implmentation of the printName() method. You should
  // also define the respective companion objects for the PrimaryStudent and the SecondaryStudent
  // types. Next, create the following students:
  // - John who is a primary student and is 8 years old.
  // - Jill who is a primary student and is 10 years old.
  // - James who is a secondary student and is 13 years old.
  // - Joe who is a secondary student and is 14 years old.
  // - Jack who is a secondary student and is 11 years old.
  // Next, use an appropriate data structure to store the above-mentioned students. And,
  // create a method name listStudents that will have input your collection of students
  /// and call the printName() name for each one.
  // Output:
//  name = Jill, age = 10
//  name = John, age = 8
//  name = Jack, age = 11
//  name = James, age = 13
//  name = Joe, age = 14

  abstract class Student(name: String, age: Int) {
    def printName(): Unit
  }

  class PrimaryStudent(name: String, age: Int) extends Student(name, age) {
    override def printName(): Unit = println(s"name = $name, age = $age")
  }

  object PrimaryStudent {
    def apply(name: String, age: Int): PrimaryStudent = new PrimaryStudent(name, age)
  }

  class SecondaryStudent(name: String, age: Int) extends Student(name, age) {
    override def printName(): Unit = println(s"name = $name, age = $age")
  }

  object SecondaryStudent {
    def apply(name: String, age: Int): SecondaryStudent = new SecondaryStudent(name, age)
  }


  val pStudentJohn = PrimaryStudent("John", 8)
  val pStudentJill = PrimaryStudent("Jill", 10)
  val sStudentJames = SecondaryStudent("James", 13)
  val sStudentJoe = SecondaryStudent("Joe", 14)
  val sStudentJack = SecondaryStudent("Jack", 11)

  val students = List(pStudentJill, pStudentJohn, sStudentJack, sStudentJames, sStudentJoe)

  def listStudents(students: List[Student]): Unit = {
    students.foreach(student => student.printName())
  }

  listStudents(students)

}
