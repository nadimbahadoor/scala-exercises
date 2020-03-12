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

object ClassFxTraits_21 extends App {

  // 21: Write a Scala program that will model a basic Vehicle class system, or type hierarchy,
  // as per the previous Scala exercise. More precisely, you will have a base trait for a Vehicle
  // type and with an abstract printName() method. The Vehicle type has two sub-classes, namely,
  // a Car, and a Bike. The Car type itself has two further subsequent sub-types, namely, a BmeCar
  // and a MazdaCar. Likewise, the Bike type has two sub-classes, namely, a HondaBike, and a BmwBike.
  // Modify the VehicleMaker class from the previous Scala exercise, and make its constructor
  // argument optional, and do remember that the VehicleMaker had a type parameter with a
  // constraint to the Vehicle type. In the VehicleMaker class, create a method named
  // makeSimilarCars that will have as input parameters two vehicles whose types
  // are of course derived from the Vehicle type constraint. In addition, this particular
  // makeSimilarCars() method, as its name implies, should only accept objects that are of the same
  // types - for instance, you could pass-through two BmwCar objects, and not a BmwCar along with
  // a HondaBike. In addition, create another method named makeBikes() that also has two
  // input parameters for two Vehicle types. As its name implies, though, this particular
  // method will accept objects, say, a HondaBike with a BmwBike. As a hint to creating
  // the makeSimilarCars() and the makeBikes() methods, you will need to lift some types
  // into scope and generalize type constraints for the arguments using Scala's built-in implicit
  // evidence features.
  // Output:
//  Making two CAR vehicles:
//    vehicleA = bmw car 3 series
//    vehicleB = bmw car 5 series
//    Making two BIKE vehicles:
//    vehicleA = honda bike firestorm
//  vehicleB = bmw bike r 2000



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

  class Bike(name: String) extends Vehicle {
    override def printName(): Unit = println(name)
  }

  class HondaBike(name: String) extends Bike(name) {
    override def printName(): Unit = println(name)
  }

  class BmwBike(name: String) extends Bike(name) {
    override def printName(): Unit = println(name)
  }


  class VehicleMaker[V <: Vehicle](val vehicle: Option[V] = None) {
    def make(): Option[V] = {
      print("Making vehicle = ")
      vehicle.map { v =>
        v.printName()
        v
      }
    }

    def makeSimilarCars[A <: V, B <: V](vehicleA: A, vehicleB: B)(implicit ev: A =:= B): Unit = {
      println("Making two CAR vehicles: ")
      print("vehicleA = ")
      vehicleA.printName()
      print("vehicleB = ")
      vehicleB.printName()
    }

    def makeBikes[A <: V, B <: V](vehicleA: A, vehicleB: B)(implicit ev: A <:< V): Unit = {
      println("Making two BIKE vehicles: ")
      print("vehicleA = ")
      vehicleA.printName()
      print("vehicleB = ")
      vehicleB.printName()
    }

  }


  val bmw5Car = new BmwCar("bmw car 5 series")
  val bmw3Car = new BmwCar("bmw car 3 series")
  val hondaBike = new HondaBike("honda bike firestorm")
  val bmwBike = new BmwBike("bmw bike r 2000")

//  new VehicleMaker[Vehicle]().makeSimilarCars(bmwCar, hondaBike) //this will not compile
  new VehicleMaker[Vehicle]().makeSimilarCars(bmw3Car, bmw5Car)


//  new VehicleMaker[Vehicle]().makeBikes(hondaBike, mazdaCar) // this will not compile
  new VehicleMaker[Vehicle]().makeBikes(hondaBike, bmwBike)






}
