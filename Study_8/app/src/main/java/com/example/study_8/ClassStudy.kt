package com.example.study_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ClassStudy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_study)
    }
}

fun main(array:Array<String>){
    Car("v8 engine","big")
    val bigCar = Car("v7 engine", "big")
    val bigCar1 :Car = Car("v7 engine", "big")
    SuperCar("good", "big", "white")

    val runableCar:RunableCar= RunableCar("simple engine","simple body")

    runableCar.ride()
    runableCar.run()
    runableCar.navi("서울")

    val runableCar2:RunableCar2= RunableCar2("engine2","body2","door2")
    println(runableCar2.engine)
    println(runableCar2.body)
}

class Car(var engine: String, var body: String){
}

/*
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(Engine: String, Body: String, Door: String) {
        this.engine = Engine
        this.body = Body
        this.door = Door
    }
}

class Car1(engine: String, body: String)
{
    var door: String  = ""

    constructor(engine: String, body: String, door: String) : this(engine, body)
    {
        this.door = door
    }
}

class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(Engine: String, Body: String) {
        this.engine = Engine
        this.body = Body
    }

    constructor(Engine: String, Body: String, Door: String) {
        this.engine = Engine
        this.body = Body
        this.door = Door
    }
}

class RunableCar(engine: String, body: String) {
    fun ride() {
        println("탑승하겠습니다.")
    }

    fun run() {
        println("달립니다.")

    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

class RunableCar2{
    var engine:String
    var body:String
    var door:String

    constructor(Engine: String,Body: String,Door: String){
        this.engine=Engine
        this.body=Body
        this.door=Door
    }
}
*/
