package com.example.wallpaperpicker.Listeners;

import com.example.wallpaperpicker.Models.CuratedApiResponse;

public interface CuratedResponseListener {

    void onFetch(CuratedApiResponse response, String message);
    void onError(String message);
}
