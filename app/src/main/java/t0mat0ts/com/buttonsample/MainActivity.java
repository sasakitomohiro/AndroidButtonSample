package t0mat0ts.com.buttonsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import t0mat0ts.com.buttonsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
//        implements View.OnClickListener

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        // data binding
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setActivityMain(this);

        // implements onClick()
//        Button button = (Button) findViewById(R.id.button);
//        button.setOnClickListener(this);

        // basic
//        Button button = (Button) findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.e("button", "clicked");
//            }
//        });
    }

    // second
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.button:
//                Log.e("button", "clicked");
//                break;
//        }
//    }

    public void button() {
        Log.e("button", "clicked");
    }
}
