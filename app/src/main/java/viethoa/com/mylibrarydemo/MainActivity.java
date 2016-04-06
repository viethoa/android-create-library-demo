package viethoa.com.mylibrarydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import viethoa.com.demolibrary.ToastUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_library_demo);

        ToastUtils.showMessage(this, "Hoàn thành bài học này rồi :D");
    }
}
