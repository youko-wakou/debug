package techacademy.wakou.youko.debug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.textView);
        Log.d("ANDROID",textView.toString());

//        textView = null;
        Log.d("ANDROID",textView.toString());
        textView.setText("Hello Android");
    }
}
