package com.example.criptocarteira.activitis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.criptocarteira.R;

public class LoginActivity extends AppCompatActivity {
private EditText userEdt, passEdt;
private Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
        setVariable();
    }
    private void initView(){
        userEdt=findViewById(R.id.editTextTextUsername);
        passEdt=findViewById(R.id.editTextTextSenha);
        loginBtn=findViewById(R.id.loginBtn);
    }
    private void setVariable(){
        loginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (userEdt.getText().toString().isEmpty() || passEdt.getText().toString().isEmpty()){
                    Toast.makeText(LoginActivity.this, "Por favor preencha o formulario de login", Toast.LENGTH_SHORT).show();
                } else if (userEdt.getText().toString().equals("admin")&& passEdt.getText().toString().equals("admin")) {
                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                }
            }
        });
    }
}