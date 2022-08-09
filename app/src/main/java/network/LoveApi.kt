package network

import com.geektech.lovecalculator.LoveModel
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {
    @GET("getPercentage")
    fun calculate(
        @Query("fname") firstName: String,
        @Query("sname") secondName: String,
        @Header("X-RapidAPI-Key") key: String = "25fd7b93dbmshbf168bab070b0f1p10636cjsn075510ed409b",
        @Header("X-RapidAPI-Host") host: String = "love-calculator.p.rapidapi.com",
    ): retrofit2.Call<LoveModel>

}