package ca.kgb.caculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doMagic(View view) {
        try {
            EditText editText = (EditText) findViewById(R.id.numbInput);
            editText.append("1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void doMagic2(View view) {
        try {
            EditText editText = (EditText) findViewById(R.id.numbInput);
            editText.append("3");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void doMagic3(View view) {
        try {
            EditText editText = (EditText) findViewById(R.id.numbInput);
            editText.append("7");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void doMagic4(View view) {
        try {
            EditText editText = (EditText) findViewById(R.id.numbInput);
            editText.append("+");
            Button plusBtn = (Button) findViewById(R.id.btnAdd);
            plusBtn.setEnabled(false);
            Button minusBtn = (Button) findViewById(R.id.btnMinus);
            minusBtn.setEnabled(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void doMagic5(View view) {
        try {
            EditText editText = (EditText) findViewById(R.id.numbInput);
            editText.append("-");
            Button plusBtn = (Button) findViewById(R.id.btnAdd);
            plusBtn.setEnabled(false);
            Button minusBtn = (Button) findViewById(R.id.btnMinus);
            minusBtn.setEnabled(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void doMagic6(View view) {
        EditText editText = (EditText) findViewById(R.id.numbInput);
        String temp = editText.getText().toString();
        int leftNumb;
        int rightNumb;
        int total;
        if(temp.contains("-")){
            leftNumb = Integer.parseInt(temp.split("-")[0]);
            rightNumb = Integer.parseInt(temp.split("-")[1]);
            total = leftNumb - rightNumb;
            editText.setText(total + "");
        }else{
            leftNumb = Integer.parseInt(temp.split("\\+")[0]);
            rightNumb = Integer.parseInt(temp.split("\\+")[1]);
            total = leftNumb + rightNumb;
            editText.setText(total + "");
        }
        /*try {
            EditText editText = (EditText) findViewById(R.id.numbInput);
            editText.append("-");
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
