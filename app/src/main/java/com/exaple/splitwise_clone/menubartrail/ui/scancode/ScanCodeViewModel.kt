package com.exaple.splitwise_clone.menubartrail.ui.scancode

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScanCodeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Scan Code Fragment"
    }
    val text: LiveData<String> = _text
}