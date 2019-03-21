package com.example.aventus.eathere;

import android.app.Activity;
import android.content.Intent;
import android.location.LocationManager;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.IOException;
import java.util.Random;

public class MapCategoryActivity extends Activity {

    private ImageButton KorRestaurant;
    private ImageButton JapRestaurant;
    private ImageButton ChiRestaurant;
    private ImageButton WesterRestaurant;

    private ImageButton Cafe;
    private ImageButton Dessert;

    private ImageButton Chimac;
    private ImageButton Soju;
    private ImageButton Pub;
    private ImageButton Bar;

    LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_category);

        KorRestaurant = (ImageButton) findViewById(R.id.btn_ko);
        JapRestaurant = (ImageButton) findViewById(R.id.btn_jp);
        ChiRestaurant = (ImageButton) findViewById(R.id.btn_ch);
        WesterRestaurant = (ImageButton) findViewById(R.id.btn_west);

        Cafe = (ImageButton) findViewById(R.id.btn_cafe);
        Dessert = (ImageButton) findViewById(R.id.btn_dessert);

        Chimac = (ImageButton) findViewById(R.id.btn_chimac);
        Soju = (ImageButton) findViewById(R.id.btn_soju);
        Pub = (ImageButton) findViewById(R.id.btn_pub);
        Bar = (ImageButton) findViewById(R.id.btn_bar);

        KorRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMap(v,"Kor");
            }
        });

        JapRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMap(v,"jap");
            }
        });

        ChiRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMap(v,"chi");
            }
        });

        WesterRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMap(v,"west");
            }
        });

        Pub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMap(v,"pub");
            }
        });

        Bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMap(v,"bar");
            }
        });

        Soju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMap(v,"soju");
            }
        });

        Cafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMap(v,"cafe");
            }
        });

        Dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMap(v,"Dessert");
            }
        });

        Chimac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMap(v,"Chimac");
            }
        });
    }

    // If user pressed BackButton, then move to MainActivity.
    public void onBackPressed(){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void showMSG(View v) {
        Random random = new Random();
        int msgNo = random.nextInt(67);


        String msg[] = {
                "칼국수 먹고 싶다",
                "잠 좀 재워 주세요",
                "배고파요?",
                "맛있게 먹어요",
                "돈까스 먹자",
                "국시촌을 갑시다",
                "일미 닭갈비도 괜찮아요",
                "일미 닭갈비는 체인점입니다",
                "라면 먹고 갈래?",
                "3일째 크런치 입니다",
                "이래서 과로사를 하는 군요",
                "굴 먹고 싶다",
                "안녕하세요",
                "반가워요",
                "개발자입니다",
                "이거 누르면 개발자가 먹고 싶은 메뉴 추천해요",
                "이거 이스터 에그에요",
                "인스타는 위대했다",
                "git 어려워요",
                "랜덤 메세지도 쉬운게 아니네요",
                "윤성욱 교수님 사랑합니다",
                "삼겹살 먹고 싶어요",
                "나는 언제 잘 수 있죠",
                "안드로이드 재밌어요",
                "사람이 잠을 못자면 식욕이 떨어집니다",
                "뭘 했다고 5월이 간거죠",
                "5월은 과제의 달입니다",
                "가까운 거리는 건강을 위해 걸어 다니세요",
                "스팀을 즐기세요",
                "개발자가 유머가 부족합니다",
                "개발자에게 먹을 것을 주세요",
                "몬스터는 사랑입니다",
                "카페인 도핑은 최고입니다",
                "어 메시지가 잘나오네요 왜잘나오지..?",
                "개강하고 엠티갔다가 중간고사보고 과제했더니 기말고사래요 한학기참빠르죠?",
                "자바 재밌다",
                "오라클이 이겼는데 이제 코틀린을 하나요?",
                "방학 하면 시간이 더 없을거 같은건 왜 일까요?",
                "개발자 둘 다 솔로입니다",
                "집에 있는 고양이 보고 싶어요",
                "고양이 키우세요~ 꼭!",
                "기말고사로 GAZUAAAAAAA",
                "인생을 짧습니다, 밤샘 과제를 즐기세요",
                "살려줘어어어어어어",
                "어....음....좋아요",
                "점점점으로 무엇을 만들까?",
                "신호 케이블 연결상태 확인",
                "STAPLES 스테플 33호침",
                "튀김우동 (컵)",
                "동아리방...방충망...안닫힘...",
                "야...이건...좀...",
                "개발자가 둘인데 한명은 군인이고 한명은 예비군인이에요",
                "군대가기 싫어요",
                "이거 재밌지 않아요",
                "개발자에게 유머를!!",
                "오렌지를 먹은 지 얼마나 오랜지?",
                "인천앞바다의 반댓말은? 인천 엄마다",
                "돼지를 한 번에 구우려거든 플러그를 돼지코에 꽂으면 된다.",
                "여러분 과제하세요 두 번 하세요!!",
                "솔로 개발자들의 유일한 데이트 윈도우 업데이트!!",
                "우유가 아프면? 앙팡!",
                "등쳐먹고 사는 사람은? 안마사!",
                "딸기가 회사에서 짤리면? 딸기실업!",
                "할아버지가 제일 좋아하는 돈은? 할머니!!",
                "개발자에게 유머집을 사주세요",
                "개발자는 밥을 사주면 좋아합니다",
                "GitHub를 배우세요"
        };

        Toast.makeText(getApplicationContext(), msg[msgNo], Toast.LENGTH_SHORT).show();
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

    public void showMap(View v, String cat) {
        String filename = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath() +"/MBD/" + cat +"/"+ cat +"_2018.jpg";

        String lati;
        String longi;
        try{
            ExifInterface exif = new ExifInterface(filename);
            //showExif(exif);

            lati = getTagString(ExifInterface.TAG_GPS_LATITUDE,exif);
            longi =getTagString(ExifInterface.TAG_GPS_LONGITUDE,exif);

            Log.v("lati","" + lati);
            Log.v("longi", "" + longi);

            String la = getDegrees(lati);
            String loti = getDegrees(longi);

            double lat = Double.parseDouble(la);  //Double.parseDouble(lati);
            double longitude = Double.parseDouble(loti); //Double.parseDouble(longi);

            Log.v("lati","" + lat);
            Log.v("longi", "" + longitude);

            Uri uri = Uri.parse(String.format("geo:%f,%f?z=10",lat,longitude));
            startActivity(new Intent(Intent.ACTION_VIEW, uri));
        }catch (IOException e){
            e.printStackTrace();
        }
    }




    /**
     * Dummy data
     * EXIF 태그 값 확인 및 파싱에 사용
     * */
    /**
     //    private void showExif(ExifInterface exif) {
     //
     //        String myAttribute = "[Exif information] \n\n";
     //
     //        myAttribute += getTagString(ExifInterface.TAG_DATETIME, exif);
     //        myAttribute += getTagString(ExifInterface.TAG_FLASH, exif);
     //        myAttribute += getTagString(ExifInterface.TAG_GPS_LATITUDE, exif);
     //        myAttribute += getTagString(ExifInterface.TAG_GPS_LATITUDE_REF, exif);
     //        myAttribute += getTagString(ExifInterface.TAG_GPS_LONGITUDE, exif);
     //        myAttribute += getTagString(ExifInterface.TAG_GPS_LONGITUDE_REF, exif);
     //        myAttribute += getTagString(ExifInterface.TAG_IMAGE_LENGTH, exif);
     //        myAttribute += getTagString(ExifInterface.TAG_IMAGE_WIDTH, exif);
     //        myAttribute += getTagString(ExifInterface.TAG_MAKE, exif);
     //        myAttribute += getTagString(ExifInterface.TAG_MODEL, exif);
     //        myAttribute += getTagString(ExifInterface.TAG_ORIENTATION, exif);
     //        myAttribute += getTagString(ExifInterface.TAG_WHITE_BALANCE, exif);
     //
     //        Log.v("info",myAttribute);
     //
     ////        Log.v("exif",getTagString(ExifInterface.TAG_GPS_LATITUDE, exif));
     ////        Log.v("exif",getTagString(ExifInterface.TAG_GPS_LONGITUDE, exif));
     //
     //
     //    }
     */

    private String getTagString(String tag, ExifInterface exif) {
        //return (tag + " : " + exif.getAttribute(tag) + "\n");
        return exif.getAttribute(tag);
    }

    private String getDegrees(String Degrees){
        String s1[] = Degrees.split("/");
        String s2[] = s1[1].split(",");
        String s3[] = s1[2].split(",");

        //위도 경도 값  double형으로 만들기
        String dg = s1[0] +"." +s2[1]+s3[1];
        Log.v("Location",""+dg);

        return dg;
    }
    public void mOnGPSClick(View v) {
        //GPS가 켜져있는지 체크
        if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            //GPS 설정화면으로 이동
            Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            intent.addCategory(Intent.CATEGORY_DEFAULT);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "GPS가 켜져 있습니다", Toast.LENGTH_SHORT).show();
        }
    }
}
