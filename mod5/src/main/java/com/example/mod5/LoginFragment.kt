package com.example.mod5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation
import androidx.navigation.findNavController

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button).apply {
            setOnClickListener {
                //Navigation.findNavController(view).navigate(R.id.action_login_to_home)
                LoginFragmentDirections.actionLoginToHome(
                    view.findViewById<EditText>(R.id.editTextTextEmailAddress).text.toString()
                ).apply {
                    findNavController().navigate(this)
                }
            }
        }
    }

}