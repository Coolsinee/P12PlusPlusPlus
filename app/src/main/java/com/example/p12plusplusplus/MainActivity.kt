package com.example.p12plusplusplus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.serpro69.kfaker.Faker
import com.example.p12plusplusplus.ui.theme.P12PlusPlusPlusTheme

data class City(
    val name: String,
    val temp: Double
)

class MainActivity : ComponentActivity() {
    val vm: MyViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //MyScreen(vm.citiz)
            MyScreen(vm.people)
        }
    }
}

//@Composable
//fun MyScreen(citiz: List<City>) {
//    LazyColumn(
//        verticalArrangement = Arrangement.spacedBy(3.dp),
//        contentPadding = PaddingValues(16.dp),
//
//        modifier = Modifier
//            .border(3.dp, Color.Gray)
//            .padding(10.dp)
//    ) {
//        item {//если хотим по строчке
//            Row {
//                Text(text = "City", Modifier.fillMaxWidth(0.7f), textAlign = TextAlign.Center)
//                Text(text = "Temp", textAlign = TextAlign.Center)
//            }
//        }
//        items(citiz) {
//            CityItem(it)
//        }
//    }
//}
//
//@Composable
//fun CityItem(cityModel: City) {
//    OutlinedCard(
//        modifier = Modifier
//            .fillMaxWidth(), elevation = CardDefaults.cardElevation(10.dp)
//    ) {
//        Row(horizontalArrangement = Arrangement.SpaceAround) {
//            Text(
//                text = cityModel.name,
//                modifier = Modifier.fillMaxWidth(0.7f),
//                fontSize = 20.sp,
//                textAlign = TextAlign.Center
//            )
//            Text(text = cityModel.temp.toString(), fontSize = 20.sp, textAlign = TextAlign.Right)
//        }
//    }
//}

//@Composable
//fun CityItem(cityModel: City) {
//    OutlinedCard(
//        modifier = Modifier
//            .fillMaxWidth(), elevation = CardDefaults.cardElevation(10.dp)
//    ) {
//        Row(horizontalArrangement = Arrangement.SpaceAround) {
//            Text(
//                text = cityModel.name,
//                modifier = Modifier.fillMaxWidth(0.7f),
//                fontSize = 20.sp,
//                textAlign = TextAlign.Center,
//                color = Color.Red // Изменение цвета текста на красный
//            )
//            Text(text = cityModel.temp.toString(), fontSize = 20.sp, textAlign = TextAlign.Right)
//        }
//    }
//}

//@Composable
//fun CityItem(cityModel: City) {
//    OutlinedCard(
//        modifier = Modifier
//            .fillMaxWidth(), elevation = CardDefaults.cardElevation(10.dp)
//    ) {
//        Row(horizontalArrangement = Arrangement.SpaceAround) {
//            Text(
//                text = cityModel.name,
//                modifier = Modifier.fillMaxWidth(0.7f),
//                fontSize = 20.sp,
//                textAlign = TextAlign.Center,
//                color = Color.Red // Изменение цвета текста на красный
//            )
//            Text(text = cityModel.temp.toString(), fontSize = 20.sp, textAlign = TextAlign.Right)
//        }
//    }
//}

//@Composable
//fun CityItem(cityModel: City) {
//    OutlinedCard(
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(Color.LightGray), // Изменение фона на светло-серый
//        elevation = CardDefaults.cardElevation(10.dp)
//    ) {
//        Row(horizontalArrangement = Arrangement.SpaceAround) {
//            Text(
//                text = cityModel.name,
//                modifier = Modifier.fillMaxWidth(0.7f),
//                fontSize = 20.sp,
//                textAlign = TextAlign.Center
//            )
//            Text(text = cityModel.temp.toString(), fontSize = 20.sp, textAlign = TextAlign.Right)
//        }
//    }
//}

//БРЕННЫЕ ЛЮДИ ГЕНЕРИРУЮЦА В МАЕЙ ПРАГРАМЕ=)
@Composable
fun MyScreen(people: List<Person>) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(3.dp),
        contentPadding = PaddingValues(16.dp),

        modifier = Modifier
            .border(3.dp, Color.Gray)
            .padding(10.dp)
    ) {
        item {
            Row {
                Text(text = "Name", Modifier.fillMaxWidth(0.7f), textAlign = TextAlign.Center)
                Text(text = "Age", textAlign = TextAlign.Center)
            }
        }
        items(people) {
            PersonItem(it)
        }
    }
}

@Composable
fun PersonItem(person: Person) {
    OutlinedCard(
        modifier = Modifier
            .fillMaxWidth(), elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Row(horizontalArrangement = Arrangement.SpaceAround) {
            Text(
                text = person.name,
                modifier = Modifier.fillMaxWidth(0.7f),
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )
            Text(text = person.age.toString(), fontSize = 20.sp, textAlign = TextAlign.Right)
        }
    }
}
