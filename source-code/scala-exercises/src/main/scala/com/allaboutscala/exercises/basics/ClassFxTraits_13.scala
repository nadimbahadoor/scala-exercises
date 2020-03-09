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
object ClassFxTraits_13 extends App {

  // 13: Write a Scala program that will model a very basic student to school abstract data type.
  // For instance, define a base abstract class named Student with a name property of type String,
  // and an age property of type Int. This particular base class should also define the method
  // signature for a method named studentId() that will have no return type, and no implementation,
  // as the actual implementation details will be left to the subsequent sub-classes. As such,
  // create two sub-classes of the Student abstract class, namely, a PrimarySchoolStudent, and a
  // SecondarySchoolStudent, and you can conveniently use a case class to represent these two sub-classes.
  // Next, create a class named PrimarySchool that has a constructor input parameter for a List of students
  // and should also further restrict and accept only List items that are derived from the abstract
  // Student class. For your Scala program, you can thereafter define the following students, and while
  // explicitly defining their types:
  // Jill is a primary school student of 8 years old and whose type should be the PrimarySchoolStudent class.
  // Joe is a primary school student of 7 years old and whose type should be the PrimarySchoolStudent class.
  // Jack is a secondary school student of 15 years old and whose type should be the SecondarySchoolStudent class.
  // James is a secondary school student of 10 years old and whose type should be the SecondarySchoolStudent class.
  // John is a secondary school student of 11 years old and whose type should be the SecondarySchoolStudent class.
  // Use a List data structure from Scala's collection type to store the above students. Next, create an instance
  // of the School class and call its printStudents() method that will output both the primary and secondary
  // students. As a hint or tip, you should keep in mind that the type parameter for the School class
  // should make use of Scala's built-in variance features in order to restrict only types and sub-types
  // of the abstract Student class.
  // Output:
  // [SecondarySchoolStudent] - name: Jack - age: 15
  // [SecondarySchoolStudent] - name: James - age: 10
  // [SecondarySchoolStudent] - name: John - age: 11
  // [PrimarySchoolStudent] - name: Jill - age: 8
  // [PrimarySchoolStudent] - name: Joe - age: 7



  abstract class Student(name: String, age: Int) {
    def studentId(): Unit
  }

  case class PrimarySchoolStudent(name: String, age: Int) extends Student(name, age) {
    override def studentId(): Unit = {
      println(s"[${this.getClass.getSimpleName}] - name: $name - age: $age")
    }
  }


  case class SecondarySchoolStudent(name: String, age: Int) extends Student(name, age) {
    override def studentId(): Unit = {
      println(s"[${this.getClass.getSimpleName}] - name: $name - age: $age")
    }
  }


  class School[+S <: Student](students: List[S]) {
    def printStudents(): Unit = {
      students.foreach(_.studentId())
    }
  }


  val jill: PrimarySchoolStudent = PrimarySchoolStudent("Jill", 8)
  val joe: PrimarySchoolStudent = PrimarySchoolStudent("Joe", 7)
  val jack: SecondarySchoolStudent = SecondarySchoolStudent("Jack", 15)
  val james: Student = SecondarySchoolStudent("James", 10)
  val john: Student = SecondarySchoolStudent("John", 11)

  val students = List(jack, james, john, jill, joe)

  val primarySchool = new School(students)
  primarySchool.printStudents()
}
