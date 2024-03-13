package ua.edu.lntu.cw_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ua.edu.lntu.cw_3.R
import ua.edu.lntu.cw_3.ui.theme.IPZ_CW_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CW_3Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WellnessLayout()
                }
            }
        }
    }
}

@Composable
fun WellnessLayout() {
    LazyColumn(
        modifier = Modifier.padding(16.dp)
    ) {
        item {
            Text(
                text = "30 днів рецептів",
                modifier = Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(modifier = Modifier.height(30.dp))
        }

        item {
            DayLayout(
                dayNumber = 1,
                title = "Романтична яєчня",
                imagePainter = painterResource(id = R.drawable.photo1),
                description = "Сосиски для рецепту вибирайте довгі. Розріжте кожну сосиску вздовж, але не до кінця. Залиште без розрізу приблизно 1 см. З двох половинок сосиски сформуйте серце і закріпіть знизу зубочисткою.\n" +
                        "\n" +
                        "Обсмажте сосиски-серця на розігрітій з олією сковороді з одного боку. Потім переверніть на інший бік і вбийте усередину кожної сосиски по одному яйцю. Зменшіть вогонь та готуйте страву під закритою кришкою 7-8 хвилин. При подачі витягніть зубочистку і за бажанням прикрасьте яєчню кетчупом або майонезом."
            )
            Spacer(modifier = Modifier.height(30.dp))
        }

        item {
            DayLayout(
                dayNumber = 2,
                title = "М'ясо по-королівськи",
                imagePainter = painterResource(id = R.drawable.photo2),
                description = "Наріжте порціями свинячу вирізку, відбийте, посоліть і поперчіть. Залиште на 30 хвилин маринуватися. Цибулю та помідори наріжте півкільцями, картоплю - тонкими часточками, а печериці - пластинками.\n" +
                        "\n" +
                        "У глибоку форму для запікання влийте олію та викладіть шматочки м'яса. Змастіть майонезом і покладіть цибулю. Посоліть і поперчіть. Потім викладіть картоплю, спеції, майонез, гриби, майонез, помідор і знову майонез. Посипте запіканку тертим сиром і запейкайте близько 1 години в духовці при 180 ."
            )
        }
    }
}

@Composable
fun DayLayout(dayNumber: Int, title: String, description: String, imagePainter: Painter) {
    Column {
        Text(
            text = "Day $dayNumber",
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            text = title,
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.bodyLarge
        )
        Image(
            painter = imagePainter,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth().height(200.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = description,
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Preview(showBackground = true)
@Composable
fun WellnessLayoutPreview() {
    IPZ_CW_3Theme {
        WellnessLayout()
    }
}
