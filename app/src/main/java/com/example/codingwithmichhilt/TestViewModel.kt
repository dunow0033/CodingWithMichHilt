package com.example.codingwithmichhilt

import javax.inject.Named
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel

class TestViewModel @ViewModelInject constructor(
    @Named("String2")
    testString2: String
) : ViewModel() {
}