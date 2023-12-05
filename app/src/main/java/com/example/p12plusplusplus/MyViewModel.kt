package com.example.p12plusplusplus

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import io.github.serpro69.kfaker.Faker
import java.math.BigDecimal
import java.math.RoundingMode

//class MyViewModel : ViewModel() {
//    val citiz: MutableList<City> = (1..100).map {
//        City(
//            Faker().address.city(),
//            Faker().random.nextDouble().let {
//                BigDecimal(it).setScale(1, RoundingMode.HALF_EVEN).toDouble()
//            }
//        )
//    }.toMutableStateList()
//}
// Файл: MyViewModel.kt
class MyViewModel : ViewModel() {
    val people: MutableList<Person> = (1..100).map {
        Person(
            Faker().name.firstName(),
            Faker().random.nextInt(1, 100)
        )
    }.toMutableList()
}