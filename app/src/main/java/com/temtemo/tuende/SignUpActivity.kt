package com.temtemo.tuende

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.temtemo.tuende.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth = FirebaseAuth.getInstance()

        binding.buttonSignUp.setOnClickListener {
            val email = binding.emailSignup.text.toString()
            val password = binding.passSignup.text.toString()
            val confirmpass = binding.confirmpasswordSignUp.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty() && confirmpass.isNotEmpty()){
                if (password == confirmpass){
                    firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
                      if (it.isSuccessful)  {
                          val intent = Intent(this, SignInActivity::class.java)
                          startActivity(intent)

                      }else{
                          Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                      }

                    }
                }else
                    Toast.makeText(this, "Mismatched passwords", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this, "Empty fields not allowed", Toast.LENGTH_SHORT).show()

            }

        }

            }
}