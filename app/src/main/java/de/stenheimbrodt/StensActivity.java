package de.stenheimbrodt;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;

import de.stenheimbrodt.core.CommandLine;

public class StensActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for(int i = 0; i < 10; i++) {
            Log.d("Test", "Dies ist eine Testnachricht von meiner Watch!");
        }
        CommandLine c = new CommandLine();
        setContentView(R.layout.stensactivity);

        Button button = findViewById(R.id.button);
        TextView output = findViewById(R.id.output);
        EditText input = findViewById(R.id.input);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cmd = input.getText().toString();
                try {
                    output.setText(c.interpret(cmd));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                input.setText("");
            }
        });
    }
}
