package mx.edu.tesoem.isc.ala.a7s212021prac4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void  btnpng(View view) {
        Intent intent = new Intent(this,PngActivity.class);
        startActivity(intent);
    }

    public void  btnjpg(View view) {
        Intent intent = new Intent(this, JpgActivity.class);
        startActivity(intent);
    }
    public void  btnurl(View view) {
        Intent intent = new Intent(this, UrlActivity.class);
        startActivity(intent);
    }

}