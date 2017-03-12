package com.momo.aksu.getircontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.momo.aksu.getircontest.data.model.Post;
import com.momo.aksu.getircontest.data.remote.APIService;
import com.momo.aksu.getircontest.data.remote.APIUtils;
import com.momo.aksu.getircontest.view.DrawingView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";

    @InjectView(R.id.drawingView) DrawingView mDrawingView;
    private APIService mAPIService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        mAPIService = APIUtils.getAPIService();
    }

    @OnClick({ R.id.btn_send })
    public void sendMethod() {
        sendPost("hynaksu@gmail.com", "Huseyin Aksu", "5555555555");
    }

    public void sendPost(String email, String name, String gsm) {
        mAPIService.savePost(email, name, gsm).enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {

                if(response.isSuccessful()) {
                    showResponse(response.body());
                    Log.i(TAG, "post submitted to API." + response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                Log.e(TAG, "Unable to submit post to API.");
            }
        });
    }

    public void showResponse(Post response) {
        mDrawingView.initialize(response.getElements());
    }
}
