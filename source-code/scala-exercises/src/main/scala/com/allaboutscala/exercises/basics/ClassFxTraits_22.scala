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

object ClassFxTraits_22 extends App {

  // 22. Write a Scala program and use an abstract class to model a Vehicle type with a name property.
  // Using the Vehicle type as the base class, create two case classes, namely, Bike and Car, to model
  // a given bike or car object, respectively. Next, use a trait with type parameters with a constraint
  // to sub-classes of the Vehicle type and name it trait VehicleDatabaseService. This particular trait
  // will act as the underlying feature to interact with some underlying storage layer and, as such,
  // it will have the following methods: addOrUpdate(), get(), and remove(). Each of the aforementioned
  // method will have as input a Vehicle type and with no return type. They should, however, be only
  // visible to sub-types of the VehicleDatabaseService. Each of the methods should further
  // simply output some print statements of its respective operations as per the output below.
  // Then, create another trait named VehicleInventory
  // that also has a type parameter constraint to sub-types of the Vehicle type. It further
  // defines the following methods: create(), read(), update(), delete(), and each of the methods
  // have a Vehicle type as input parameter, and with no return type. These methods will, however, not
  // provide any implementation details. Next, create a class named VehicleInventory with a type parameter
  // constrained to sub-types of the Vehicle type, and adds the features of the VehicleInventory and
  // the VehicleDatabaseService traits. Its create(), read(), update(), and delete()
  // methods should merely wire in the corresponding methods of the VehicleDatabaseService, such as,
  // addOrUpdate(), get(), and remove(). Finally, create an object, or instance, of the VehicleInventorSystem
  // and call the create(), read(), update(), and delete() methods by passing through a "bmw 3 series" car,
  // "mazda 3 series" car, a "honda bike firestorm", and a "bmw bike r 2000".
  // Output:
//  Create vehicle = Car(bmw 3 series)
//  Adding or updating vehicle = Car(bmw 3 series)
//  Read vehicle = Car(mazda 3 series)
//  Getting vehicle = Car(mazda 3 series)
//  Update vehicle = Bike(honda bike firestorm)
//  Adding or updating vehicle = Bike(honda bike firestorm)
//  Delete vehicle = Bike(bmw bike r 2000)
//  Removing vehicle = Bike(bmw bike r 2000)


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

  val vehicleInventorySystem = new VehicleInvetorySystem[Vehicle]()
  vehicleInventorySystem.create(Car("bmw 3 series"))
  vehicleInventorySystem.read(Car("mazda 3 series"))
  vehicleInventorySystem.update(Bike("honda bike firestorm"))
  vehicleInventorySystem.delete(Bike("bmw bike r 2000"))

}
