package mx.edu.tesoem.isc.ala.a7s212021prac4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class UrlActivity extends AppCompatActivity {

    ImageView MiImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        MiImagen = findViewById(R.id.miimagen);

        Picasso.get()
                .load("https://assets.show.news/__export/1572322396138/sites/debate/img/2019/10/28/1_8_crop1572322327064.jpg_1130588308.jpg")
                .fit()
                .error(R.mipmap.ic_launcher_round)
                .into(MiImagen);
    }
}