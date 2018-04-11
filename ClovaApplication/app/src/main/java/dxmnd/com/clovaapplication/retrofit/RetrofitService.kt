package dxmnd.com.clovaapplication.retrofit

import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface RetrofitService {

    @FormUrlEncoded
    @POST("v1/voice/tts.bin")
    fun requestCss(

    )
}