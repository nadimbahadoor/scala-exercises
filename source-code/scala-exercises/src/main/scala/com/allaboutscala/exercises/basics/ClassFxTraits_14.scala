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
object ClassFxTraits_14 extends App {

  // 14: Write a Scala program that defines a base abstract class to model a Vehicle type
  // that has a public make property of type String. This particular Vehicle base class
  // will be extended by two sub-types, namely, a Car, and a Bike, case class, and will
  // wire accordingly the make property of type String from the Vehicle base class. Next,
  // create a singleton object named VehicleReport that will define a printVehicles method
  // that will have as input a List of Vehicle types, and any of its sub-types or sub-classes.
  // The printVehicles() method will simply iterate through each of the Vechicle type
  // and output its corresponding make property. Note that the printVehicles() method will
  // have no return type defined as such. You can use the following vehicle samples to model
  // your data points:
  // a car whose make is: bmw 3 series
  // a car whose make is: vw golf
  // a bike whose make is: bmw g 310 r bike
  // a bike whose make is: fire storm bike
  // Use the List data structure from Scala's collection type and store the above-mentioned
  // vehicles. And, finally, call the VehicleReport's printVehicles() method by passing
  // through your collection of vehicles as defined above.
  // Output:
//  bmw 3 series
//  vw golf
//  bmw g 310 r bike
//  fire storm bike

  abstract class Vehicle(val make: String)

  case class Car(override val make: String) extends Vehicle(make)

  case class Bike(override val make: String) extends Vehicle(make)

  object VehicleReport {
    def printVehicles[V <: Vehicle](vehicles: List[V]): Unit = {
      vehicles.foreach(v => println(v.make))
    }
  }


  val bmwCar = Car("bmw 3 series")
  val vwCar = Car("vw golf")
  val bmwBike = Bike("bmw g 310 r bike")
  val hondaBike = Bike("fire storm bike")
  val vehicles = List(bmwCar, vwCar, bmwBike, hondaBike)
  VehicleReport.printVehicles(vehicles)

}
