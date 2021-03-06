package com.example.android.testing.espresso

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.testing.espresso.fragmentscenario.R
import kotlinx.android.synthetic.main.fragment_sample.*


class LoginFragment : Fragment() {

    var viewmodel: LoginViewModel = LoginViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sample, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        loginButton.isEnabled = true

        loginButton.setOnClickListener{v ->
            logIn()
        }
    }

    fun logIn () {
        loginButton.isEnabled = false
        viewmodel.logIn()

        val intent = Intent(context, LoggedInActivity::class.java).apply {  }
        startActivity(intent)
    }

}
