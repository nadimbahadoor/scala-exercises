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
object ClassFxTraits_09 extends App {

  // 9: Write a Scala program and use a case class to represent a Student
  // with a name property of type String, an age property of type Int, and
  // an optional favoriteSnack property of type String. Use the above case
  // class and create the following student objects:
  // - Jack who is 15 years old and whose favorite snack is cupcake.
  // - Jill who is 10 years old and whose favorite snack is ice cream.
  // - Joe who is 7 years old and whose favorite snack is nothing!
  // - James who is 10 years old and whose favorite snack is chocolate.
  // - John who is 11 years old and whose favorite snack is nothing!
  // The student Joe now wants to add his favorite snack and it is a cupcake.
  // Next, define a method named listStudents that will have input a List
  // of Student types and output the details of each students as shown below.
  // You should of course also create a List data structure to store the above-mentioned
  // students.
  // Output:
//  name = Jack is 15 years old. Favorite snack is cupcake
//
//  name = Jill is 10 years old. Favorite snack is ice cream
//
//  name = Joe is 7 years old. Favorite snack is cupcake
//
//  name = James is 10 years old. Favorite snack is chocolate
//
//  name = John is 11 years old. Favorite snack is  nothing!


  final case class Student(name: String, age: Int, favoriteSnack: Option[String] = None)

  val jack = Student("Jack", 15, Some("cupcake"))
  val jill = Student("Jill", 10, Some("ice cream"))
  val joe = Student("Joe", 7, None)
  val james = Student("James", 10, Some("chocolate"))
  val john = Student("John", 11, None)


  val joeUpdated = joe.copy(favoriteSnack = Some("cupcake"))


  def listStudents(students: List[Student]): Unit = {
    students.foreach{ student=>
      print(s"name = ${student.name} is ${student.age} years old. ")
      print(s"Favorite snack is ${student.favoriteSnack.getOrElse(" nothing!")}")
      println("\n")
    }
  }

  listStudents(List(jack, jill, joeUpdated, james, john))
}
