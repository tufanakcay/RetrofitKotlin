package com.tufanakcay.retrofitkotlin.service



import com.tufanakcay.retrofitkotlin.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    //GET, POST, UPDATE, DELETE

    //https://raw.githubusercontent.com/
    // tufanakcay/JSONDataSet/main/crypto.json

    //https://api.nomics.com/v1/
    // prices?key=2187154b76945f2373394aa34f7dc98a

    @GET("tufanakcay/JSONDataSet/main/crypto.json")
    fun getData(): Observable<List<CryptoModel>>

    //fun getData(): Call<List<CryptoModel>>


}