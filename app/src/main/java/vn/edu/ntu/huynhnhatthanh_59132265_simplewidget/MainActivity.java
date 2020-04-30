package vn.edu.ntu.huynhnhatthanh_59132265_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,birth,fav;
    RadioGroup radioGroup;
    CheckBox flim,music,cafe,home,cook;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi ="";
                chuoi = chuoi + name.getText().toString();
                chuoi = chuoi +"\nNgày sinh: " +birth.getText().toString();

                switch (radioGroup.getCheckedRadioButtonId())
                {
                    case R.id.nam : chuoi = chuoi + "\nGiới tính: Nam";break;
                    case R.id.nu : chuoi = chuoi + "\nGiới tính: Nữ";break;
                }

                if(flim.isChecked()){
                    chuoi = chuoi +flim.getText().toString();
                }
                if(music.isChecked()){
                    chuoi = chuoi + " ; " + music.getText().toString();
                }
                if(cafe.isChecked()){
                    chuoi = chuoi + " ; " + cafe.getText().toString();
                }
                if(home.isChecked()){
                    chuoi = chuoi + " ; " + home.getText().toString();
                }
                if(cook.isChecked()){
                    chuoi = chuoi + " ; " + cook.getText().toString();
                }

                chuoi = chuoi + fav.getText().toString();

                Toast.makeText(getApplicationContext(),chuoi,Toast.LENGTH_LONG).show();
            }
        });

    }

    private void anhxa() {
        name = (EditText) findViewById(R.id.ten);
        birth = (EditText) findViewById(R.id.ngaysinh);
        fav = (EditText) findViewById(R.id.sothichkhac);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        flim = (CheckBox) findViewById(R.id.xemphim);
        music = (CheckBox) findViewById(R.id.Nghenhac);
        cafe = (CheckBox) findViewById(R.id.dicfvoibanbe);
        home = (CheckBox) findViewById(R.id.onhamotminh);
        cook = (CheckBox) findViewById(R.id.vaobepnauan);
        submit = (Button) findViewById(R.id.nutbam);
    }

}
