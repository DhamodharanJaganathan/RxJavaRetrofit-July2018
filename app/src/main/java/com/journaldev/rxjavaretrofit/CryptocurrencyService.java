package com.journaldev.rxjavaretrofit;

import com.journaldev.rxjavaretrofit.pojo.Crypto;
import com.journaldev.rxjavaretrofit.pojo.Example;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CryptocurrencyService {


    String BASE_URL = "https://raw.githubusercontent.com/DhamodharanJaganathan/Movie-Webservice/master/Tamil%20movie%20list/";

    @GET("{coin}.json")
    Observable<Example> getCoinData(@Path("coin") String coin);
}
