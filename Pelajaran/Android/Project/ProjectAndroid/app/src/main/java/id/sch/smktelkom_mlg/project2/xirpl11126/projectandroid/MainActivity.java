package id.sch.smktelkom_mlg.project2.xirpl11126.projectandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.Thoharoh).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ThoharohActivity.class));
            }
        });

        findViewById(R.id.Wudhu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WudhuActivity.class));
            }
        });
        findViewById(R.id.Siwak).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SiwakActivity.class));
            }
        });
        findViewById(R.id.Mandi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MandiActivity.class));
            }
        });

    }

    public void Wudhu(View v) {
        switch (v.getId()) {
            case R.id.ibWudhu:
                startActivity(new Intent(MainActivity.this, WudhuActivity.class));
                break;
        }
    }
}
