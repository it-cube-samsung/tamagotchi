package com.example.tamagotchi

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel: ViewModel() {
    private var _hungry = MutableLiveData<Int>()
    private var _tired = MutableLiveData<Int>()
    private var _bored = MutableLiveData<Int>()
    private var _coins = MutableLiveData<Int>()
    private var _currentAction = MutableLiveData<String>("sleep")

    val hungry: LiveData<Int>
        get() = _hungry
    val tired: LiveData<Int>
        get() = _tired
    val bored: LiveData<Int>
        get() = _bored
    val coins: LiveData<Int>
        get() = _coins

    val currentAction: LiveData<String>
        get() = _currentAction

    fun nextAction(action: String) {
        _currentAction.value = action
    }
}