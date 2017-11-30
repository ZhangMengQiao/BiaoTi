package mvpframework.bwie.com.biaoti;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/11/30.
 */

public class TitleView extends LinearLayout{

    private TextView back;
    private TextView option;
    private TextView title;

    public TitleView(Context context) {
        this(context,null);
    }

    public TitleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        back = (TextView) findViewById(R.id.back);
        option = (TextView) findViewById(R.id.option);
        title = (TextView) findViewById(R.id.title);
        back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "点击返回，可在此处调用finish()", Toast.LENGTH_SHORT).show();
            }
        });
        option.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "我是提交按钮", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();

            }
        });
    }

    public void setContent(String str){
        title.setText(str);
    }

}
