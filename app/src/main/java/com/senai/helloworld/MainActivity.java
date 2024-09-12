package com.senai.helloworld;

import androidx.appcompat.app.AppCompatActivity;

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
        EditText editTextName = findViewById(R.id.inputName);
        EditText editTextEmail = findViewById(R.id.inputEmail);
        EditText editTextPass = findViewById(R.id.inputPass);

        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.resultText);
                //Evento de click no botão Enviar para mostrar uma mensagem  de boas vindas
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Capturar o nome
                String name = editTextName.getText().toString();
                //Capturar o email
               String email = editTextEmail.getText().toString();
               //Capturar a senha
                String pass = editTextPass.getText().toString();
                //Adicionar um texto no campo textView no xml
                textView.setText(String.format("Nome do Usuário: %s\n" +
                        "Email: %s\n" +
                        "Password: %s", name, email, pass));
            }

                                  }




        );
    }
}