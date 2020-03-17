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
object ClassFxTraits_23 extends App {


  // 23: In this Scala exercise, we will reuse most of the constructs from the previous exercise,
  // and extend it to focus on one - out of the many - built-in patterns for dependency injection
  // in Scala. Therefore, keep in mind the previous classes and traits from the earlier section - that is,
  // abstract class Vehicle, case class Car, case class Bike, trait VehicleDatabaseService,
  // trait VehicleInventory, and class VehicleInventorySystem. With the above-mentioned defined,
  // you will need to create a new trait named VehicleSystem that has a type parameter for all
  // sub-types of Vehicle. This new trait will also define a value of type VehicleInventorySystem,
  // but leaving the right-hand-side object instantiation of the latter empty or undefined. You
  // can think of this particular VehicleSystem trait acting as a business layer and with business
  // friendly method names, such as, a checkVehicleStock() method with an input parameter of the
  // same type as the trait's type parameter. The method will basically call the VehicleInventorySystem's
  // read() method. Next, define an object, or instance, of the VehicleSystem for Vehicle types,
  // and override its VehicleInventorySystem with an actual object, or instance, of VehicleInventorySystem
  // of type Vehicle. Thereafter, call the checkVehicleStock() method for a given Car "mazda 3 series",
  // and a Bike "Honda bike firestorm". The output should be as follows:
  // Output:
//  Checking vehicle stock for vehicle = Car(mazda 3 series)
//  Read vehicle = Car(mazda 3 series)
//  Getting vehicle = Car(mazda 3 series)
//  Checking vehicle stock for vehicle = Bike(honda bike firestorm)
//  Read vehicle = Bike(honda bike firestorm)
//  Getting vehicle = Bike(honda bike firestorm)

  abstract class Vehicle(name: String)
  case class Car(name: String) extends Vehicle(name)
  case class Bike(name: String) extends Vehicle(name)

  trait VehicleDatabaseService[V <: Vehicle] {
    protected def addOrUpdate(vehicle: V): Unit = {
      println(s"Adding or updating vehicle = $vehicle")
    }

    protected def get(vehicle: V): Unit = {
      println(s"Getting vehicle = $vehicle")
    }

    protected def remove(vehicle: V): Unit = {
      println(s"Removing vehicle = $vehicle")
    }
  }

  trait VehicleInventory[V <: Vehicle] {
    def create(vehicle: V): Unit
    def read(vehicle: V): Unit
    def update(vehicle: V): Unit
    def delete(vehicle: V): Unit
  }

  class VehicleInvetorySystem[V <: Vehicle]
    extends VehicleInventory[V]
      with VehicleDatabaseService[V] {

    override def create(vehicle: V): Unit = {
      println(s"Create vehicle = $vehicle")
      addOrUpdate(vehicle)
    }

    override def read(vehicle: V): Unit = {
      println(s"Read vehicle = $vehicle")
      get(vehicle)
    }

    override def update(vehicle: V): Unit = {
      println(s"Update vehicle = $vehicle")
      addOrUpdate(vehicle)
    }

    override def delete(vehicle: V): Unit = {
      println(s"Delete vehicle = $vehicle")
      remove(vehicle)
    }
  }


  // acts as a business layer
  trait VehicleSystem[V <: Vehicle] {
    val vehicleInventorySystem: VehicleInvetorySystem[V]

    def checkVehicleStock(vehicle: V): Unit = {
      println(s"Checking vehicle stock for vehicle = $vehicle")
      vehicleInventorySystem.read(vehicle)
    }
  }


  val vehicleSystem = new VehicleSystem[Vehicle] {
    override val vehicleInventorySystem: VehicleInvetorySystem[Vehicle] = new VehicleInvetorySystem[Vehicle]
  }

  vehicleSystem.checkVehicleStock(Car("mazda 3 series"))
  vehicleSystem.checkVehicleStock(Bike("honda bike firestorm"))

}
