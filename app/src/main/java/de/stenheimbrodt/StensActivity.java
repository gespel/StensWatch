package de.stenheimbrodt;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import de.stenheimbrodt.core.Test;

public class StensActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for(int i = 0; i < 10; i++) {
            Log.d("Test", "Dies ist eine Testnachricht von meiner Watch!");
        }
        setContentView(R.layout.stensactivity);

        Button button = findViewById(R.id.button);
        EditText out = findViewById(R.id.out);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Lina", "Ich liebe dich!");
                out.setText("Ich liebe dich Lina!");
                Test t = new Test();
            }
        });

    }
}
