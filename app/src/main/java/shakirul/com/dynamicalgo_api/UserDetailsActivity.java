package shakirul.com.dynamicalgo_api;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UserDetailsActivity extends AppCompatActivity {

    TextView BackBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);
        //getSupportActionBar().setTitle("Add User");

        BackBTN=findViewById(R.id.backBTN);

        BackBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UserDetailsActivity.this, MainActivity.class);
                onBackPressed();
            }
        });
    }
}
