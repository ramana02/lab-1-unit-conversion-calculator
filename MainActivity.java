package com.example.ramana;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    EditText e3,e4,e5,e6,e7,e8;
    EditText e9,e10,e11,e12,e13,e14,e15;
    EditText e16,e17,e18,e19,e20;
    Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e3 = (EditText) findViewById(R.id.editText3);
        e4 = (EditText) findViewById(R.id.editText4);
        e5 = (EditText) findViewById(R.id.editText5);
        e6 = (EditText) findViewById(R.id.editText6);
        e7 = (EditText) findViewById(R.id.editText7);
        e8 = (EditText) findViewById(R.id.editText8);
        e9 = (EditText) findViewById(R.id.editText9);
        e10 = (EditText) findViewById(R.id.editText10);
        e11 = (EditText) findViewById(R.id.editText11);
        e12 = (EditText) findViewById(R.id.editText12);
        e13 = (EditText) findViewById(R.id.editText13);
        e14 = (EditText) findViewById(R.id.editText14);
        e15 = (EditText) findViewById(R.id.editText15);
        e16 = (EditText) findViewById(R.id.editText16);
        e17 = (EditText) findViewById(R.id.editText17);
        e18 = (EditText) findViewById(R.id.editText18);
        e19 = (EditText) findViewById(R.id.editText19);
        e20 = (EditText) findViewById(R.id.editText20);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);


        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (e3.isFocused()) {
                    double m = Double.parseDouble(e3.getText().toString());
                    double in = m * 39.37;
                    double f = m * 3.280;
                    double y = m * 1.094;
                    double mi = m / 1609.344;
                    double nm = m / 1852;
                    e3.setText("" + m);
                    e4.setText("" + in);
                    e5.setText("" + f);
                    e6.setText("" + y);
                    e7.setText("" + mi);
                    e8.setText("" + nm);

                } else if (e4.isFocused()) {
                    double in = Double.parseDouble(e4.getText().toString());
                    double m = in / 39.37;
                    double f = in / 12;
                    double y = in / 36;
                    double mi = in / 63360;
                    double nm = in / 72913.386;
                    e3.setText("" + m);
                    e4.setText("" + in);
                    e5.setText("" + f);
                    e6.setText("" + y);
                    e7.setText("" + mi);
                    e8.setText("" + nm);
                } else if (e5.isFocused()) {
                    double f = Double.parseDouble(e5.getText().toString());
                    double m = f / 3.281;
                    double in = f / 12;
                    double y = f / 3;
                    double mi = f / 5280;
                    double nm = f / 6076.115;
                    e3.setText("" + m);
                    e4.setText("" + in);
                    e5.setText("" + f);
                    e6.setText("" + y);
                    e7.setText("" + mi);
                    e8.setText("" + nm);

                } else if (e6.isFocused()) {
                    double y = Double.parseDouble(e6.getText().toString());
                    double m = y / 1.094;
                    double in = y * 36;
                    double f = y * 3;
                    double mi = y / 1760;
                    double nm = y / 2025.372;
                    e3.setText("" + m);
                    e4.setText("" + in);
                    e5.setText("" + f);
                    e6.setText("" + y);
                    e7.setText("" + mi);
                    e8.setText("" + nm);
                }
                else if (e7.isFocused()) {
                double mi= Double.parseDouble(e7.getText().toString());
                double m = mi*1609.34;
                double in = mi*63360;
                double f = mi*5280;
                double y = mi*1760;
                double nm = mi/1.151;
                e3.setText("" + m);
                e4.setText("" + in);
                e5.setText("" + f);
                e6.setText("" + y);
                e7.setText("" + mi);
                e8.setText("" + nm);
            }
                else if (e8.isFocused()) {
                    double nm = Double.parseDouble(e8.getText().toString());
                    double m = nm * 1852;
                    double in = nm * 72913.386;
                    double f = nm * 6076.115;
                    double y = nm * 2025.372;
                    double mi = nm * 1.1517;
                    e3.setText("" + m);
                    e4.setText("" + in);
                    e5.setText("" + f);
                    e6.setText("" + y);
                    e7.setText("" + mi);
                    e8.setText("" + nm);
                }

            }


            });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e3.setText("" );
                e4.setText("" );
                e5.setText("" );
                e6.setText("" );
                e7.setText("");
                e8.setText("");

            }
        });




        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (e9.isFocused()) {
                    double k = Double.parseDouble(e9.getText().toString());
                    double o = k * 35.274;
                    double p = k * 2.205;
                    double tp = k * 2.67;
                    double s = k / 6.35;
                    double st = k / 907.185;
                    double lt = k / 1016.047;
                    e9.setText("" + k);
                    e10.setText("" + o);
                    e11.setText("" + p);
                    e12.setText("" + tp);
                    e13.setText("" + s);
                    e14.setText("" + st);
                    e15.setText("" + lt);

                }else if (e10.isFocused()) {
                    double o = Double.parseDouble(e10.getText().toString());
                    double k = o*35.274;
                    double p = o * 16;
                    double tp = o* 13.166;
                    double s = o/224;
                    double st = o/32000;
                    double lt = o/35840;
                    e9.setText("" + k);
                    e10.setText("" + o);
                    e11.setText("" + p);
                    e12.setText("" + tp);
                    e13.setText("" + s);
                    e14.setText("" + st);
                    e15.setText("" + lt);

                } else if (e11.isFocused()) {
                double p = Double.parseDouble(e11.getText().toString());
                    double k = p/2.205;
                    double o = p * 16;
                    double tp = p*1.215;
                    double s = p/14;
                    double st = p/2000;
                    double lt = p/2240;
                    e9.setText("" + k);
                    e10.setText("" + o);
                    e11.setText("" + p);
                    e12.setText("" + tp);
                    e13.setText("" + s);
                    e14.setText("" + st);
                    e15.setText("" + lt);

                } else if (e12.isFocused()) {
                    double tp = Double.parseDouble(e12.getText().toString());
                    double k = tp/2.679;
                    double o = tp *13.166;
                    double p = tp*1.215;
                    double s = tp/17.014;
                    double st = tp/2430.556;
                    double lt = tp/2722.222;
                    e9.setText("" + k);
                    e10.setText("" + o);
                    e11.setText("" + p);
                    e12.setText("" + tp);
                    e13.setText("" + s);
                    e14.setText("" + st);
                    e15.setText("" + lt);

                } else if (e13.isFocused()) {
                    double s = Double.parseDouble(e13.getText().toString());
                    double k = s*6.35;
                    double o = s*224;
                    double p = s*14;
                    double tp = s*17.014;
                    double st = s/142.857;
                    double lt = s/160;
                    e9.setText("" + k);
                    e10.setText("" + o);
                    e11.setText("" + p);
                    e12.setText("" + tp);
                    e13.setText("" + s);
                    e14.setText("" + st);
                    e15.setText("" + lt);

                } else if (e14.isFocused()) {
                    double st = Double.parseDouble(e14.getText().toString());
                    double k = st*907.185;
                    double o = st*32000;
                    double p = st*2000;
                    double tp = st*2430.556;
                    double s = st*142.857;
                    double lt = st/1.12;
                    e9.setText("" + k);
                    e10.setText("" + o);
                    e11.setText("" + p);
                    e12.setText("" + tp);
                    e13.setText("" + s);
                    e14.setText("" + st);
                    e15.setText("" + lt);

                } else if (e15.isFocused()) {
                    double lt = Double.parseDouble(e15.getText().toString());
                    double k = lt * 1016.047;
                    double o = lt * 35840;
                    double p = lt * 2240;
                    double tp = lt * 2722.222;
                    double s = lt * 160;
                    double st = lt * 1.12;
                    e9.setText("" + k);
                    e10.setText("" + o);
                    e11.setText("" + p);
                    e12.setText("" + tp);
                    e13.setText("" + s);
                    e14.setText("" + st);
                    e15.setText("" + lt);
                }


                }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e9.setText("" );
                e10.setText("" );
                e11.setText("" );
                e12.setText("" );
                e13.setText("");
                e14.setText("");
                e15.setText("");

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (e16.isFocused()) {
                    double li = Double.parseDouble(e16.getText().toString());
                    double fo = li * 33.814;
                    double q = li * 1.057;
                    double g = li / 3.785;
                    double ig = li / 4.546;
                    e16.setText("" + li);
                    e17.setText("" + fo);
                    e18.setText("" + q);
                    e19.setText("" + g);
                    e20.setText("" + ig);

                } else if (e17.isFocused()) {
                    double fo = Double.parseDouble(e17.getText().toString());
                    double li = fo /33.814;
                    double q = fo/32;
                    double g = fo/128;
                    double ig = fo/153.722;
                    e16.setText("" + li);
                    e17.setText("" + fo);
                    e18.setText("" + q);
                    e19.setText("" + g);
                    e20.setText("" + ig);

                }else if (e18.isFocused()) {
                    double q = Double.parseDouble(e18.getText().toString());
                    double li = q/1.057;
                    double fo = q*32;
                    double g = q/4;
                    double ig = q/4.804;
                    e16.setText("" + li);
                    e17.setText("" + fo);
                    e18.setText("" + q);
                    e19.setText("" + g);
                    e20.setText("" + ig);

                }else if (e19.isFocused()) {
                    double g = Double.parseDouble(e19.getText().toString());
                    double li = g*3.785;
                    double fo = g*128;
                    double q = g*4;
                    double ig = g/1.201;
                    e16.setText("" + li);
                    e17.setText("" + fo);
                    e18.setText("" + q);
                    e19.setText("" + g);
                    e20.setText("" + ig);

                }else if (e20.isFocused()) {
                    double ig = Double.parseDouble(e20.getText().toString());
                    double li = ig * 4.546;
                    double fo = ig * 153.722;
                    double q = ig * 4.804;
                    double g = ig * 1.201;
                    e16.setText("" + li);
                    e17.setText("" + fo);
                    e18.setText("" + q);
                    e19.setText("" + g);
                    e20.setText("" + ig);
                }

            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e16.setText("" );
                e17.setText("" );
                e18.setText("" );
                e19.setText("" );
                e20.setText("");


            }
        });





    }


    }




