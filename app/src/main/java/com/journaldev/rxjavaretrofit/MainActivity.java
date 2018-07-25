package com.journaldev.rxjavaretrofit;

import static com.journaldev.rxjavaretrofit.CryptocurrencyService.BASE_URL;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.journaldev.rxjavaretrofit.pojo.Example;
import com.journaldev.rxjavaretrofit.pojo.Item;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

  RecyclerView recyclerView;
  Retrofit retrofit;
  RecyclerViewAdapter recyclerViewAdapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    recyclerView = findViewById(R.id.recyclerView);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    recyclerViewAdapter = new RecyclerViewAdapter();
    recyclerView.setAdapter(recyclerViewAdapter);

    HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
    interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
    OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

    Gson gson = new GsonBuilder()
        .setLenient()
        .create();

    retrofit = new Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(client)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build();

    callEndpoints();
  }

  private void callEndpoints() {

    CryptocurrencyService cryptocurrencyService = retrofit.create(CryptocurrencyService.class);

    //Single call
    Observable<Example> cryptoObservable = cryptocurrencyService.getCoinData("test");
    cryptoObservable.subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread())
        .map(result -> result.getItems()).subscribe(this::handleResults, this::handleError);

  }


  private void handleResults(List<Item> marketList) {
    if (marketList != null && marketList.size() != 0) {
      recyclerViewAdapter.setData(marketList);


    } else {
      Toast.makeText(this, "NO RESULTS FOUND",
          Toast.LENGTH_LONG).show();
    }
  }

  private void handleError(Throwable t) {

    Toast.makeText(this, "ERROR IN FETCHING API RESPONSE. Try again",
        Toast.LENGTH_LONG).show();
  }

}
