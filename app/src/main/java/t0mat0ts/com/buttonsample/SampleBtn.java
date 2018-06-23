package t0mat0ts.com.buttonsample;

import android.content.Intent;
import android.util.Log;

public class SampleBtn {
    private Listener listener;

    public void onClickButton() {
        if (listener != null) {
            listener.onClickButton();
        }
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public interface Listener {
        void onClickButton();
    }
}
