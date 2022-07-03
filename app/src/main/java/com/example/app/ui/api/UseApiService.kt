package com.example.app.ui.api

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.app.ui.api.models.Characters
import com.example.app.ui.api.models.Games
import com.example.app.ui.api.models.Platforms
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.net.HttpURLConnection.HTTP_OK


/**
 * Get all game !
 *
 * @return the list of all game
 */
fun getAllGames(): LiveData<MutableList<Games>> {
    val liveProduct = MutableLiveData<MutableList<Games>>()

    CoroutineScope(Dispatchers.IO).launch {

        val res = USE_API.getAllGames()

        if (res.code() == HTTP_OK) {
            liveProduct.postValue(res?.body()!!.toMutableList())
        }
    }
    return liveProduct
}

/**
 * Get all platform
 *
 * @return the list of all platform
 */
fun getAllPlatforms(): LiveData<MutableList<Platforms>> {
    val liveProduct = MutableLiveData<MutableList<Platforms>>()

    CoroutineScope(Dispatchers.IO).launch {

        val res = USE_API.getAllPlatforms()

        if (res.code() == HTTP_OK) {
            liveProduct.postValue(res?.body()!!.toMutableList())
        }
    }
    return liveProduct
}

/**
 * Get the platform of the game
 *
 * @param id the platform id
 * @return the platform
 */
fun getGamePlatform(id: Int): LiveData<Platforms> {
    val liveProduct = MutableLiveData<Platforms>()

    CoroutineScope(Dispatchers.IO).launch {

        val res = USE_API.getGamePlatform(id)

        if (res.code() == HTTP_OK) {
            liveProduct.postValue(res?.body() as Platforms)
        }
    }
    return liveProduct
}


/**
 * Get all characters
 *
 * @return the list of all characters
 */
fun getAllCharacters(): LiveData<MutableList<Characters>> {
    val liveProduct = MutableLiveData<MutableList<Characters>>()

    CoroutineScope(Dispatchers.IO).launch {

        val res = USE_API.getAllCharacters()

        if (res.code() == HTTP_OK) {
            liveProduct.postValue(res?.body()!!.toMutableList())
        }
    }
    return liveProduct
}


///**
// * Get the character of the game
// *
// * @param id the character id
// * @return the character
// */
//fun getGameCharacters(id: String?): LiveData<Characters> {
//    val liveProduct = MutableLiveData<Characters>()
//
//    CoroutineScope(Dispatchers.IO).launch {
//
//        val res = USE_API.getGameCharacters(id)
//
//        if (res.code() == HTTP_OK) {
//            println(res?.body())
//            var list = res?.body() as Characters
//            liveProduct.postValue(list)
//        }
//    }
//
//    return liveProduct
//}