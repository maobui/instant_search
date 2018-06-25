package com.me.bui.instantsearch.network;

import com.me.bui.instantsearch.network.model.Contact;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mao.bui on 6/25/2018.
 */
public interface ApiService {
    @GET("contacts.php")
    Single<List<Contact>> getContacts(@Query("source") String source, @Query("search") String query);
}
