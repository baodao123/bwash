package seven.witz.bwash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ChooseLocaltionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_choose_localtion);
        EditText etYourCity = findViewById(R.id.et_yourcity);

        EditText etYourAddress = findViewById(R.id.et_youraddress);

        Button btShowServices = findViewById(R.id.bt_showservices);
        btShowServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
