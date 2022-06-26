package com.example.todopractice.page.create

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.todopractice.R
import com.example.todopractice.page.edit.EditToDoViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreateToDoFragment: Fragment(R.layout.create_todo_fragment) {
    private val vm: CreateToDoViewModel by viewModels()
}