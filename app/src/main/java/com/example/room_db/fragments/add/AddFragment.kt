package com.example.room_db.fragments.add

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.room_db.Model.User
import com.example.room_db.ViewModel.UserViewModel
import com.example.room_db.R

class addFragment : Fragment() {

    private lateinit var mUserViewModel: UserViewModel

    private lateinit var firstNameEditText: EditText
    private lateinit var lastNameEditText: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add, container, false)

        // Initialize the EditTexts using findViewById
        firstNameEditText = view.findViewById(R.id.add_first_name)
        lastNameEditText = view.findViewById(R.id.add_last_name)

        val addButton = view.findViewById<Button>(R.id.add_btn)

        // Initialize the UserViewModel
        mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        // Set click listener for the Add button
        addButton.setOnClickListener {
            insertDataToDatabase()
        }

        return view
    }

    private fun insertDataToDatabase() {
        val firstName = firstNameEditText.text.toString()
        val lastName = lastNameEditText.text.toString()

        if (inputCheck(firstName, lastName)) {
            // Create User object
            val user = User(0, firstName, lastName)

            // Add data to the database using ViewModel
            mUserViewModel.addUser(user)
            Toast.makeText(requireContext(), "Successfully Added!", Toast.LENGTH_LONG).show()

            // Navigate back to the list
            findNavController().navigate(R.id.action_addFragment_to_listFragment)
        } else {
            Toast.makeText(requireContext(), "Please fill out all fields!", Toast.LENGTH_LONG).show()
        }
    }

    private fun inputCheck(firstName: String, lastName: String): Boolean {
        return !(TextUtils.isEmpty(firstName) || TextUtils.isEmpty(lastName))
    }
}
