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
object ClassFxTraits_20 extends App {

  // 20: Write a Scala program and use a trait to define a Vehicle type with an abstract method named
  // printName() that has no return type. Using this new Vehicle type, create a new class named
  // Car with a name property of type String that is a sub-class of the former Vehicle type. Likewise,
  // use this new Car type to create two subsequent classes, namely, a BmwCar, and a MazdaCar class.
  // In addition, create a new type named Bike with a name property of type String that is a sub-class of the Vehicle trait.
  // Using this new Bike class, create two further sub-classes, namely, a HondaBike, and a BmwBike, class.
  // Next, create a class named VehicleMaker which has a type parameter V that acts as a constraint
  // to the Vehicle type, and therefore, also has a vehicle of type V as its constructor argument.
  // The VehicleMaker class should have a make() method with a generic return type V - that is, of course,
  // based from and relative to its class type parameter. In the body of the make() method, you can
  // simply access and call the printName() method for a given Vehicle type. With the above defined and
  // in scope, use a List data structure to create a "bmw car 5 series" and a "mazda car 3 series". Similarly,
  // create another List data structure with a "honda bike firestorm" and a "bmw bike r 2000". Thereafter,
  // merge the two List data structures into a single one and use Scala's built-in map() method to call
  // the VehicleMaker's make() method for each vehicle in the List.
  // Output:
//  Making vehicle = bmw car 5 series
//    Making vehicle = mazda car 3 series
//    Making vehicle = honda bike firestorm
//  Making vehicle = bmw bike r 2000


  trait Vehicle {
    def printName(): Unit
  }

  class Car(name: String) extends Vehicle {
    override def printName(): Unit = println(name)
  }

  class BmwCar(name: String) extends Car(name) {
    override def printName(): Unit = println(name)
  }

  class MazdaCar(name: String) extends Car(name) {
    override def printName(): Unit = println(name)
  }

  class Bike(name: String) extends Vehicle{
    override def printName(): Unit = println(name)
  }

  class HondaBike(name: String) extends Bike(name) {
    override def printName(): Unit = println(name)
  }

  class BmwBike(name: String) extends Bike(name) {
    override def printName(): Unit = println(name)
  }


  class VehicleMaker[V <: Vehicle](val vehicle: V) {
    def make(): V = {
      print("Making vehicle = ")
      vehicle.printName()
      vehicle
    }
  }


  val carsToMake = List(new BmwCar("bmw car 5 series"), new MazdaCar("mazda car 3 series"))
  val bikesToMake = List(new HondaBike("honda bike firestorm"), new BmwBike("bmw bike r 2000"))
  val vehiclesToMake = carsToMake ++ bikesToMake

  vehiclesToMake.map { v =>
    new VehicleMaker[Vehicle](v).make()
  }




}
