package com.naji.movienaji.ui.details

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers
import com.naji.movienaji.data.model.Resource
import com.naji.movienaji.data.repository.NetworkRepository
import java.net.SocketTimeoutException


class ActorDetailsViewModel @ViewModelInject constructor(
    private val repository : NetworkRepository
): ViewModel() {

    fun getPerson(person_id : Int) = liveData(Dispatchers.IO) {
        emit(Resource.loading())
        try {
            // Fetch data from remote
            val apiResponse = repository.getPerson(person_id)
            emit(Resource.success(apiResponse))
        } catch (e: Exception) {
            if (e is SocketTimeoutException)
                emit(Resource.error("Something went wrong!"))
        }
    }

    fun getPersonMovieCredits(person_id : Int) = liveData(Dispatchers.IO) {
        emit(Resource.loading())
        try {
            // Fetch Data from Api
            val apiResponse = repository.getPersonMovieCredits(person_id)
            emit(Resource.success(apiResponse))
        } catch (e : Exception) {
            if (e is SocketTimeoutException) {
                emit(Resource.error("Something went wrong!"))
            }
        }

    }


}