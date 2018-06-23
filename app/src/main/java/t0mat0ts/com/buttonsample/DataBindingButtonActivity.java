package t0mat0ts.com.buttonsample;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import t0mat0ts.com.buttonsample.databinding.ActivityDatabindingButtonBinding;

public class DataBindingButtonActivity extends AppCompatActivity implements SampleBtn.Listener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDatabindingButtonBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_databinding_button);
        SampleBtn sampleBtn = new SampleBtn();
        sampleBtn.setListener(this);
        binding.setSampleBtn(sampleBtn);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }

    @Override
    public void onClickButton() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
