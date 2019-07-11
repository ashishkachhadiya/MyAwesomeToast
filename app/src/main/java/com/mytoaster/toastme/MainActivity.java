package com.mytoaster.toastme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mytoaster.toaster.ToastMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastMessage.displayToast(this, "Hello");
    }
}
