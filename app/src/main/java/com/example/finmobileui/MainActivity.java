package com.example.finmobileui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoginListener ear=new LoginListener();
        setContentView(R.layout.login_page);
        Login=findViewById(R.id.button);
        Login.setOnClickListener(ear);

    }

    public class LoginListener implements OnClickListener{
        @Override
        public void onClick(View view) {
            Intent next=new Intent(getApplicationContext(),DashBoard.class);
            startActivity(next);
        }
    }
}
