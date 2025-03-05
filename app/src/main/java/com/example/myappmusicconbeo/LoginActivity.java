package com.example.myappmusicconbeo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText edtEmail, edtPassword;
    private Button btnLogin;
    private TextView txtForgotPassword, txtRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // Đảm bảo file XML có tên login_activity.xml

        // Ánh xạ view
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        txtForgotPassword = findViewById(R.id.txtForgotPassword);
        txtRegister = findViewById(R.id.txtRegister);

        // Xử lý sự kiện đăng nhập
        btnLogin.setOnClickListener(v -> {
            String email = edtEmail.getText().toString().trim();
            String password = edtPassword.getText().toString().trim();

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(LoginActivity.this, "Vui lòng nhập đầy đủ thông tin!", Toast.LENGTH_SHORT).show();
            } else {
                // Chuyển đến màn hình chính sau khi đăng nhập thành công
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Xử lý sự kiện quên mật khẩu
        txtForgotPassword.setOnClickListener(v ->
                Toast.makeText(LoginActivity.this, "Chức năng đang phát triển!", Toast.LENGTH_SHORT).show()
        );

        // Xử lý sự kiện đăng ký
        txtRegister.setOnClickListener(v ->
                Toast.makeText(LoginActivity.this, "Chuyển đến trang Đăng ký!", Toast.LENGTH_SHORT).show()
        );
    }
}
