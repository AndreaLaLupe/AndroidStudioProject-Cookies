package com.example.cookies;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        ImageView imagen=(ImageView) findViewById(R.id.android_cookie_image_view);
        imagen.setImageResource(R.drawable.cookies2);

        TextView texto= (TextView) findViewById((R.id.status_text_view));
        texto.setText("I'm so full");

        // TODO: Find a reference to the ImageView in the layout. Change the image.

        // TODO: Find a reference to the TextView in the layout. Change the text.

    }
}