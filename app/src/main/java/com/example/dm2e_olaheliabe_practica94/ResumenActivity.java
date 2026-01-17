package com.example.dm2e_olaheliabe_practica94;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.dm2e_olaheliabe_practica94.mislibros.ResumenLibroFragment;

public class ResumenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (getResources().getConfiguration().orientation ==
                android.content.res.Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        ResumenLibroFragment rlf = (ResumenLibroFragment) getSupportFragmentManager()
                .findFragmentById(R.id.resumenFragment);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            rlf.setLibro(extras.getString("titulo"),
                    extras.getString("autor"),
                    extras.getString("resumen"));
        }
    }

}