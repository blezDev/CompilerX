package com.blez.compilerx.ui.compiler

import androidx.lifecycle.ViewModel
import com.blez.compilerx.repository.CompilerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class CompilerViewModel @Inject constructor(repo : CompilerRepository) : ViewModel() {

    sealed class SetupEvent{
        object nothing : SetupEvent()

        object Loading : SetupEvent()




    }

    private val _uiState = MutableStateFlow<SetupEvent>(SetupEvent.nothing)
    val uiState : StateFlow<SetupEvent>
    get() = _uiState

}