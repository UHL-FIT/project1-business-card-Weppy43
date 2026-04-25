package com.baitap.danh_thiep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
    import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.baitap.danh_thiep.ui.theme.Danh_ThiepTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Danh_ThiepTheme {
                   CreateDanhThiep(
                        "Nguyễn Minh Đức",
                        "Sinh Viên Công Nghệ Thông Tin CT1B",
                        "0815836855",
                        "@ASwCT1B",
                        "ducnguyenminh2511@gmail.com"
                   )
            }
        }
    }
}

@Composable
fun CreateDanhThiep(fname: String, tieude: String, sdt: String, share: String, email: String) {
    var sdtin="+84 (0)"
    var cnt=0
    for (i in sdt.slice(1..9))
    {
        if(cnt==3){
            sdtin+=" "
            cnt=0
        }
            sdtin+=i
            cnt++
    }
    Column(
            modifier= Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement =Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(150.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement =Arrangement.SpaceBetween,

        ) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = "logo",
                Modifier
                    .background(Color.Black)
                    .size(140.dp)
            )
            Text(
                text = fname,
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp,
                modifier = Modifier.padding(top = 10.dp, bottom = 15.dp)
            )
            Text(
                text = tieude,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color(0xFF3ddc84)
            )
        }

        Spacer(modifier = Modifier.height(350.dp))

        Column(
            modifier = Modifier.width(350.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            //verticalArrangement =Arrangement.SpaceEvenly
        ) {
                Row(
                    modifier = Modifier.fillMaxWidth()
                                        .padding(start = 20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = "phone",
                        Modifier.size(22.dp),
                        tint = Color(0xFF3ddc84)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = sdtin,
                        fontSize = 18.sp

                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    modifier = Modifier.fillMaxWidth()
                                        .padding(start = 20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        Modifier.size(22.dp),
                        tint = Color(0xFF3ddc84)
                    )

                    Spacer(modifier = Modifier.width(15.dp))

                    Text(
                        text = share,
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    modifier = Modifier.fillMaxWidth()
                                        .padding(start = 20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "email",
                        Modifier.size(22.dp),
                        tint = Color(0xFF3ddc84)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = email,
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center
                    )
                }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Danh_ThiepTheme {
        CreateDanhThiep("Nguyễn Minh Đức",
            "Sinh viên lớp CT1B",
            "0815836855",
            "@ASwCT1B",
            "ducnguyenminh2511@gmail.com")
    }
}

