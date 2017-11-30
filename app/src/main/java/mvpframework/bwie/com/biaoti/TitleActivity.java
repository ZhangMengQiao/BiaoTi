package mvpframework.bwie.com.biaoti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
        TitleView titleView = (TitleView) findViewById(R.id.titleView);
        titleView.setContent("标题");
    }
}
