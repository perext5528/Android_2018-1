package com.example.aventus.eathere;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private ImageButton ToCam;
    private ImageButton ToAlb;
    private ImageButton ToMap;

    private final long FINISH_INTERVAL_TIME = 2000;
    private long backPressedTime=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Move To Cam "Activity", Alb Application, Map Application
        ToCam = (ImageButton)findViewById(R.id.btn_cam);
        ToAlb = (ImageButton)findViewById(R.id.btn_alb);
        ToMap = (ImageButton)findViewById(R.id.btn_map);

        ToCam.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CamCategoryActivity.class);
                startActivity(intent);
                finish();
            }
        });


        ToAlb.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType(android.provider.MediaStore.Images.Media.CONTENT_TYPE);
                intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
                startActivityForResult(intent,1);
            }
        });


        ToMap.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MapCategoryActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    // If user pressed BackButton twice, then this Application close.
    public void onBackPressed(){
        long tempTime = System.currentTimeMillis();
        long intervalTime = tempTime-backPressedTime;

        if(0<=intervalTime && FINISH_INTERVAL_TIME >=intervalTime){
            super.onBackPressed();
        }else{
            backPressedTime = tempTime;
            Toast.makeText(this, "뒤로 버튼을 한 번 더 누르시면 종료됩니다.",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void showMenu(View v){

        Random random = new Random();
        int menuNo = random.nextInt(100);

        String menu[] = {
                "탕수육",
                "깐풍기",
                "칠리새우",
                "짬뽕",
                "짜장면",
                "유린기",
                "북경식 탕수육",
                "초밥",
                "돈부리",
                "참치회",
                "뚝배기 불고기",
                "닭갈비",
                "돈부리",
                "참치회",
                "오코노미야끼",
                "우동",
                "장어덮밥",
                "라멘",
                "돈까스",
                "소바",
                "삽겹살",
                "갈비",
                "갈매기살",
                "항정살",
                "가브리살",
                "등심",
                "안심",
                "스테이크",
                "비빔면",
                "신라면",
                "너구리",
                "안성탕면",
                "참깨라면",
                "왕뚜껑",
                "삼양라면",
                "불닭볶음면",
                "진라면",
                "파스타",
                "훈제오리",
                "쌀국수",
                "비빔밥",
                "카레",
                "만두",
                "새우튀김",
                "피자",
                "햄버거",
                "냉면",
                "설렁탕",
                "닭도리탕",
                "김치찌개",
                "곱창",
                "불고기백반",
                "낙지",
                "간장게장",
                "양념게장",
                "갈비탕",
                "비빔냉면",
                "교촌치킨",
                "호식이 두마리 치킨",
                "굽네치킨",
                "KFC",
                "파파이스",
                "네네치킨",
                "BBQ",
                "김밥",
                "해장국",
                "감자탕",
                "순대국",
                "만두국",
                "조개탕",
                "보쌈",
                "족발",
                "오징어회",
                "김치 볶음밥",
                "회",
                "육회",
                "연어",
                "문어 숙회",
                "전",
                "해물파전",
                "양장피",
                "김밥",
                "쫄면",
                "삼각김밥",
                "도시락",
                "치킨마요",
                "뼈다귀 해장국",
                "개발자는 소고고가 먹고 싶습니다. 이걸 보시면 한 번 더 눌러요",
                "대게",
                "대하",
                "삼계탕",
                "양꼬치",
                "해물탕",
                "해물찜",
                "찜닭",
                "아구찜",
                "찹 스테이크",
                "전복죽",
                "팬케이크",
                "에그 베네딕트"
        };
        Toast.makeText(getApplicationContext(), menu[menuNo], Toast.LENGTH_SHORT).show();
    }


}

