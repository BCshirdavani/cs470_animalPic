package com.example.shymacbook.animals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    public static String picNAME;
    RadioButton lion_butt = findViewById(R.id.LION);
    RadioButton duck_butt = findViewById(R.id.DUCK);
    RadioButton parrot_butt = findViewById(R.id.PAROT);
    RadioButton bunny_butt = findViewById(R.id.BUNNY);
    ImageView pic = findViewById(R.id.imageSPOT);
    boolean LION = lion_butt.callOnClick();
    boolean DUCK = duck_butt.callOnClick();
    boolean PARROT = parrot_butt.callOnClick();
    boolean BUNNY = bunny_butt.callOnClick();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        public static String picNAME;
//        RadioButton lion_butt = findViewById(R.id.LION);
//        RadioButton duck_butt = findViewById(R.id.DUCK);
//        RadioButton parrot_butt = findViewById(R.id.PAROT);
//        RadioButton bunny_butt = findViewById(R.id.BUNNY);
//        ImageView pic = findViewById(R.id.imageSPOT);

//        public void picswap(View view) {
//            boolean LION = lion_butt.callOnClick();
//            boolean DUCK = duck_butt.callOnClick();
//            boolean PARROT = parrot_butt.callOnClick();
//            boolean BUNNY = bunny_butt.callOnClick();
//
//            if(LION){
//                pic.setImageResource(R.drawable.lion);
//            }
//            else if (DUCK){
//                pic.setImageResource(R.drawable.duck);
//            }
//            else if (PARROT){
//                pic.setImageResource(R.drawable.parrot);
//            }
//            else if (BUNNY){
//                pic.setImageResource(R.drawable.bunny);
//            }
//        }



    }

//    public void picswap(View view) {
////        boolean LION = lion_butt.callOnClick();
////        boolean DUCK = duck_butt.callOnClick();
////        boolean PARROT = parrot_butt.callOnClick();
////        boolean BUNNY = bunny_butt.callOnClick();
//
//        if(LION){
//            pic.setImageResource(R.drawable.lion);
//        }
//        else if (DUCK){
//            pic.setImageResource(R.drawable.duck);
//        }
//        else if (PARROT){
//            pic.setImageResource(R.drawable.parrot);
//        }
//        else if (BUNNY){
//            pic.setImageResource(R.drawable.bunny);
//        }
//    }


}
