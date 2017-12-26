package com.example.android.calculator;

<<<<<<< HEAD
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
=======
<<<<<<< HEAD
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

=======
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
>>>>>>> updated MainActivity.java
>>>>>>> test mainactivity.java
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
Button plus,minus,multiply,divide;
TextView input_et;
TextView result_tv;
double a=0,res=0;
    boolean set=false;
char operation='0';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
=======
<<<<<<< HEAD

import android.widget.TextView;






import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;




public class MainActivity extends AppCompatActivity {
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private ShakerMethod mShakeDetector;
Button plus,minus,multiply,divide;
public static  TextView input_et;
public static TextView result_tv;
    double res=0,a=0,previousAnswer=0;
   // boolean set=false;
public static char operation='0';
    public static String expression;


=======
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {
    Button plus, minus, multiply, divide;
    TextView input_et;
    TextView result_tv;
    double a = 0, res = 0;
    int precision = 1;
    boolean set = false, dot = false,min=false;
    char operation = '0';
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
>>>>>>> updated MainActivity.java

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mAccelerometer = mSensorManager
                .getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mShakeDetector = new ShakerMethod();
        mShakeDetector.setOnShakeListener(new ShakerMethod.OnShakeListener() {

            @Override
            public void onShake(int count) {
                handleShakeEvent(count);
            }
        });
        expression="";
>>>>>>> test mainactivity.java
        setContentView(R.layout.activity_main);
        plus=(Button)findViewById(R.id.add);
        minus=(Button)findViewById(R.id.subtract);
        multiply=(Button)findViewById(R.id.multiply);
        divide=(Button)findViewById(R.id.divide);
        input_et=(TextView)findViewById(R.id.input_et);
        result_tv=(TextView)findViewById(R.id.result_tv);
    }
<<<<<<< HEAD
=======
    public void handleShakeEvent(int count){
        input_et.setText("0.0");
        result_tv.setText("0.0");
        expression="";
=======
        setContentView(R.layout.activity_main);
        plus = (Button) findViewById(R.id.add);
        minus = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        input_et = (TextView) findViewById(R.id.input_et);
        result_tv = (TextView) findViewById(R.id.result_tv);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
>>>>>>> updated MainActivity.java
    }
>>>>>>> test mainactivity.java

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
<<<<<<< HEAD
    public void display(View view) {
=======
<<<<<<< HEAD
    public void display(View view) throws ScriptException {
>>>>>>> test mainactivity.java
        switch(operation){
            case '+':
                res+=a;
                break;
            case '-':
                res-=a;
                break;
            case '*':
                res*=a;
                break;
            case '/':
                res/=a;
                break;
<<<<<<< HEAD
            default:
                break;
        }
        a=res;
        result_tv.setText(""+res);
    }

    public void clear(View view){
        res=0;
        a=0;
        set=false;
        operation= '0';
        result_tv.setText(""+res);
        input_et.setText(""+a);
    }
    public void add(View view){
        if(!set){
            res=a;
            result_tv.setText(""+res);
            set=true;
        }
      //  Toast.makeText(this,"Plus button clicked",Toast.LENGTH_SHORT).show();
      //  a=Float.parseFloat(input_et.getText().toString());
        a=0;
        operation='+';
        input_et.setText(""+a);
    }
    public void subtract(View view){
       if(!set){
           res=a;
           result_tv.setText(""+res);
           set=true;
       }
        //  Toast.makeText(this,"Plus button clicked",Toast.LENGTH_SHORT).show();
       // a=Float.parseFloat(input_et.getText().toString());
        a=0;
        operation='-';
        input_et.setText(""+a);
    }
    public void multiply(View view){
        if(!set){
            res=a;
            result_tv.setText(""+res);
            set=true;
        }
        //  Toast.makeText(this,"Plus button clicked",Toast.LENGTH_SHORT).show()
        a=0;
        operation='*';
        input_et.setText(""+a);
    }
    public void divide(View view){
        if(!set){
            res=a;
            result_tv.setText(""+res);
            set=true;
        }
        //  Toast.makeText(this,"Plus button clicked",Toast.LENGTH_SHORT).show();
      //  a=Float.parseFloat(input_et.getText().toString());
        a=0;
        operation='/';
        input_et.setText(""+a);
    }
    public void value1(View view){
        a*=10;
        a+=1;
        input_et.setText(""+a);
    }
    public void value2(View view){
        a*=10;
        a+=2;
        input_et.setText(""+a);
    }
    public void value3(View view){
        a*=10;
        a+=3;
        input_et.setText(""+a);
    }
    public void value4(View view){
        a*=10;
        a+=4;
        input_et.setText(""+a);
    }
    public void value5(View view){
        a*=10;
        a+=5;
        input_et.setText(""+a);
    }
    public void value6(View view){
        a*=10;
        a+=6;
        input_et.setText(""+a);
    }
    public void value7(View view){
        a*=10;
        a+=7;
        input_et.setText(""+a);
    }
    public void value8(View view){
        a*=10;
        a+=8;
        input_et.setText(""+a);
    }
    public void value9(View view){
        a*=10;
        a+=9;
        input_et.setText(""+a);
    }
    public void value0(View view){
        a*=10;
        input_et.setText(""+a);
    }


=======
            case '^':
                res=Math.pow(res,a);
            default:
                break;
        }
        try {
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
            res = (double) engine.eval(expression);
            a = res;
            result_tv.setText("" + res);
            input_et.setText("0.0");
        }
        catch (Exception e){
            return;
        }
    }

    public void addToMemory(View view){
        expression="";
        previousAnswer=res;
        result_tv.setText("Previous Answer "+previousAnswer);
        res=0;
        input_et.setText(Double.toString(res));
    }
    public void subtractFromMemory(View view){
        expression+= previousAnswer+" ";
        input_et.setText(expression);
    }


    public void power(View view){
        if(!(expression.charAt(expression.length()-1)=='^')) {
            res = a;
            result_tv.setText("" + res);
            a = 0;
            operation = '^';
            expression+=" "+operation+" ";

            input_et.setText(" " + expression);
        }

    }
    public void openBrace(View view){
        if(!(expression.charAt(expression.length()-1)=='(')) {
            res = a;
            result_tv.setText("" + res);
            //set=true;
            a = 0;
            expression+=" ( ";
            input_et.setText(" " + expression);
        }

    }
    public void closeBrace(View view){
        if(!(expression.charAt(expression.length()-1)==')')) {
            res = a;
            result_tv.setText("" + res);
            //set=true;
            a = 0;
            expression+=" ) ";
            input_et.setText(" " + expression);
        }

    }


    public void clear(View view){
        res=0;
        a=0;
        expression="";
        //set=false;
        operation= '0';
        result_tv.setText(""+res);
        input_et.setText(" "+expression);
    }
    public void add(View view){
        if(!(expression.charAt(expression.length()-1)=='+')) {
            res = a;
            result_tv.setText("" + res);
            //set=true;

            //  Toast.makeText(this,"Plus button clicked",Toast.LENGTH_SHORT).show();
            //  a=Float.parseFloat(input_et.getText().toString());
            a=0;
            operation = '+';
            expression+=" "+operation+" ";
            input_et.setText(" " + expression);
        }
    }
    public void subtract(View view){
       if(!(expression.charAt(expression.length()-1)=='-')) {
           res = a;
           result_tv.setText("" + res);
           //set=true;

           //  Toast.makeText(this,"Plus button clicked",Toast.LENGTH_SHORT).show();
           // a=Float.parseFloat(input_et.getText().toString());
           a = 0;
           operation = '-';
           expression+=" "+operation+" ";
           input_et.setText(" " + expression);
       }
    }
    public void multiply(View view){
        if(!(expression.charAt(expression.length()-1)=='*')) {
            res = a;
            result_tv.setText("" + res);
            //set=true;
            //  Toast.makeText(this,"Plus button clicked",Toast.LENGTH_SHORT).show()
            a = 0;
            operation = '*';
            expression+=" "+operation+" ";
            input_et.setText(" " + expression);
        }
    }
    public void divide(View view){
        if(!(expression.charAt(expression.length()-1)=='/')) {
            res = a;
            result_tv.setText("" + res);
            //set=true;
            //  Toast.makeText(this,"Plus button clicked",Toast.LENGTH_SHORT).show();
            //  a=Float.parseFloat(input_et.getText().toString());
            a = 0;
            operation = '/';
            expression+=" "+operation+" ";

            input_et.setText(" " + expression);
        }
    }
    public void value1(View view){
        //a*=10;
        a=1;
        expression+=(int)a;
        input_et.setText(" "+expression);
    }
    public void value2(View view){
        //a*=10;
        a=2;
        expression+=(int)a;

        input_et.setText(" "+expression);
    }
    public void value3(View view){
        //a*=10;
        a=3;
        expression+=(int)a;

        input_et.setText(" "+expression);
    }
    public void value4(View view){
        //a*=10;
        a=4;
        expression+=(int)a;

        input_et.setText(" "+expression);
    }
    public void value5(View view){
        //a*=10;
        a=5;
        expression+=(int)a;

        input_et.setText(" "+expression);
    }
    public void value6(View view){
        //a*=10;
        a=6;
        expression+=(int)a;

        input_et.setText(" "+expression);
    }
    public void value7(View view){
        //a*=10;
        a=7;
        expression+=(int)a;

        input_et.setText(" "+expression);
    }
    public void value8(View view){
        //a*=10;
        a=8;
        expression+=(int)a;

        input_et.setText(" "+expression);
    }
    public void value9(View view){
        //a*=10;
        a=9;
        expression+=(int)a;

        input_et.setText(" "+expression);
    }
    public void value0(View view){
        //a*=10;
        expression+='0';
        input_et.setText(" "+expression);
    }
    @Override
    public void onResume() {
        super.onResume();
        mSensorManager.registerListener(mShakeDetector, mAccelerometer,	SensorManager.SENSOR_DELAY_UI);
    }

    @Override
    public void onPause() {
        mSensorManager.unregisterListener(mShakeDetector);
        super.onPause();
    }


=======

    public void display(View view) {
        switch (operation) {
            case '+':
                res += a;
                break;
            case '-':
                res -= a;
                break;
            case '*':
                res *= a;
                break;
            case '/':
                res /= a;
                break;
            case '^':
                res = calculatepow(new BigDecimal(res), new BigDecimal(a));
                break;
            case '.':
                res = a;
                break;
            default:
                break;
        }
        a = res;
        operation = '0';
        dot = false;
        precision = 1;
        String.format("%.6f",res);
        result_tv.setText("" + res);
    }
    int sign(BigDecimal n2)
    {
        if(n2.doubleValue()<0)
            return -1;
        else
            return 1;
    }
    private double calculatepow(BigDecimal n1, BigDecimal n2) {
        BigDecimal result;
        int signOf2 = sign(n2);
            // Perform X^(A+B)=X^A*X^B (B = remainder)
            double dn1 = n1.doubleValue();
            n2 = n2.multiply(new BigDecimal(signOf2)); // n2 is now positive
            BigDecimal remainderOf2 = n2.remainder(BigDecimal.ONE);
            BigDecimal n2IntPart = n2.subtract(remainderOf2);
            // Calculate big part of the power using context -
            // bigger range and performance but lower accuracy
            BigDecimal intPow = n1.pow(n2IntPart.intValueExact());
            BigDecimal doublePow =
                    new BigDecimal(Math.pow(dn1, remainderOf2.doubleValue()));
            result = intPow.multiply(doublePow);
        // Fix negative power
        if (signOf2 == -1)
            result = BigDecimal.ONE.divide(result,RoundingMode.HALF_UP);
        return result.doubleValue();
    }

    public void clear(View view) {
        res = 0;
        a = 0;
        set = false;
        operation = '0';
        result_tv.setText("" + res);
        dot = false;
        precision = 1;
        input_et.setText("" + a);
    }

    public void add(View view) {
        if (!set) {
            res = a;
            String.format("%.6f",res);
            result_tv.setText("" + res);
            set = true;
        }
        //  Toast.makeText(this,"Plus button clicked",Toast.LENGTH_SHORT).show();
        //  a=Float.parseFloat(input_et.getText().toString());
        a = 0;
        operation = '+';
        dot = false;
        precision = 1;
        input_et.setText("" + a);
    }

    public void subtract(View view) {
        if(a==0)
        {
            input_et.setText("-");
            min=true;
        }
        if (!set) {
            res = a;
            if(min)
                result_tv.setText("-");
            String.format("%.6f",res);
            result_tv.setText("" + res);
            set = true;
        }
        //  Toast.makeText(this,"Plus button clicked",Toast.LENGTH_SHORT).show();
        // a=Float.parseFloat(input_et.getText().toString());
        a = 0;
        operation = '-';
        dot = false;
        precision = 1;
        input_et.setText("" + a);
    }

    public void power(View view) {
        if (!set) {
            res = a;
            String.format("%.6f",res);
            result_tv.setText("" + res);
            set = true;
        }
        //  Toast.makeText(this,"Plus button clicked",Toast.LENGTH_SHORT).show();
        // a=Float.parseFloat(input_et.getText().toString());
        a = 0;
        operation = '^';
        dot = false;
        precision = 1;
        input_et.setText("" + a);
    }

    public void multiply(View view) {
        if (!set) {
            res = a;
            String.format("%.6f",res);
            result_tv.setText("" + res);
            set = true;
        }
        //  Toast.makeText(this,"Plus button clicked",Toast.LENGTH_SHORT).show()
        a = 0;
        operation = '*';
        dot = false;
        precision = 1;
        input_et.setText("" + a);
    }

    public void divide(View view) {
        if (!set) {
            res = a;
            String.format("%.6f",res);
            result_tv.setText("" + res);
            set = true;
        }
        //  Toast.makeText(this,"Plus button clicked",Toast.LENGTH_SHORT).show();
        //  a=Float.parseFloat(input_et.getText().toString());
        a = 0;
        operation = '/';
        dot = false;
        precision = 1;
        input_et.setText("" + a);
    }

    public double fun(double v) {
        BigDecimal a = new BigDecimal(10);
        BigDecimal b = new BigDecimal(precision);
        v = v / calculatepow(a, b);
        precision++;
        return v;
    }

    public void value1(View view) {
        if (dot) {
            a += fun(1);
        } else {
            a *= 10;
            a += 1;
        }
        String.format("%.6f",a);
        input_et.setText("" + a);
    }

    public void value2(View view) {
        if (dot) {
            a += fun(2);
        } else {
            a *= 10;
            a += 2;
        }
        String.format("%.6f",a);
        input_et.setText("" + a);
    }

    public void value3(View view) {
        if (dot) {
            a += fun(3);
        } else {
            a *= 10;
            a += 3;
        }
        String.format("%.6f",a);
        input_et.setText("" + a);
    }

    public void value4(View view) {
        if (dot) {
            a += fun(4);
        } else {
            a *= 10;
            a += 4;
        }
        String.format("%.6f",a);
        input_et.setText("" + a);
    }

    public void value5(View view) {
        if (dot) {
            a += fun(5);
        } else {
            a *= 10;
            a += 5;
        }
        String.format("%.6f",a);
        input_et.setText("" + a);
    }

    public void value6(View view) {
        if (dot) {
            a += fun(6);
        } else {
            a *= 10;
            a += 6;
        }
        String.format("%.6f",a);
        input_et.setText("" + a);
    }

    public void value7(View view) {
        if (dot) {
            a += fun(7);
        } else {
            a *= 10;
            a += 7;
        }
        String.format("%.6f",a);
        input_et.setText("" + a);
    }

    public void value8(View view) {
        if (dot) {
            a += fun(8);
        } else {
            a *= 10;
            a += 8;
        }
        String.format("%.6f",a);
        input_et.setText("" + a);
    }

    public void value9(View view) {
        if (dot) {
            a += fun(9);
        } else {
            a *= 10;
            a += 9;
        }
        String.format("%.6f",a);
        input_et.setText("" + a);
    }

    public void value0(View view) {
        if (!dot) {
            a *= 10;
            a += 1;
        }
        String.format("%.6f",a);
        input_et.setText("" + a);
    }

    public void valuedot(View view) {
        if (dot == false) {
            dot = true;
            String.format("%.6f",a);
            input_et.setText("" + a);
        }
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
>>>>>>> updated MainActivity.java
>>>>>>> test mainactivity.java
}
