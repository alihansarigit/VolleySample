package com.androidedu.kodluyoruz.volleysample.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.androidedu.kodluyoruz.volleysample.R;

import org.json.JSONObject;

public class VolleyActivity extends AppCompatActivity implements Response.Listener<JSONObject>, Response.ErrorListener {

    private String apiURL = "https://api.myjson.com/bins/1guxr9";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volley);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, apiURL,
                null, this, this);

//        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest();
//
//        StringRequest stringRequest = new StringRequest();
    }

    @Override
    public void onResponse(JSONObject response) {

    }

    @Override
    public void onErrorResponse(VolleyError error) {

    }
}
