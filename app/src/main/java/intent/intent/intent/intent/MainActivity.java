package intent.intent.intent.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnNavigation;
    private ArrayList<Berita> listBerita = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
        btnNavigation = findViewById(R.id.btn_navigation);
        btnNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                //Parceable


                //Searializable


                //Start Activity for Result
            }
        });
    }

    private void initList() {
        Berita berita1 = new Berita("A", "A", "A", "A", "A", "A");
        Berita berita2 = new Berita("b", "b", "b", "b", "b", "b");
        listBerita.add(berita1);
        listBerita.add(berita2);
    }
}
