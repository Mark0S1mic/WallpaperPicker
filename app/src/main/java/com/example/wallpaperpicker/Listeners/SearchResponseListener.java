package com.example.wallpaperpicker.Listeners;

import com.example.wallpaperpicker.Models.SearchApiResponse;

public interface SearchResponseListener {

    void onFetch(SearchApiResponse response, String message);
    void onError(String message);

}
