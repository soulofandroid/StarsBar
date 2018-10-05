package com.starsbar;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    StarBar starBar1;
    StarBar starBar2;
    StarBar starBar3;
    YStarView yStarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //可选择的starBar
        starBar1=findViewById(R.id.starBar1);
        starBar1.getStarMark();//获取星数

        //不可选择的starBar，只做显示用  不显示空心
        starBar2=findViewById(R.id.starBar2);

        starBar2.setClickAble(false);
        starBar2.setStarCount(3);
        starBar2.setRating(3);

        //不可选择的starBar，只做显示用 显示空心
        starBar3=findViewById(R.id.starBar3);
        starBar3.setClickAble(false);//设置星星是否可以点击和滑动改变
//        starBar3.setIntegerMark(true);// 设置是否需要整数评分
        starBar3.setStarMark(3);//设置星数



        yStarView = (YStarView) findViewById(R.id.starBar4);
        yStarView.setStarCount(5);//星星总数
        yStarView.setRating(3);//设置星星亮的颗数
        yStarView.setChange(true);//设置星星是否可以点击和滑动改变
        yStarView.setHalf(true);//设置半星
        yStarView.setStar(R.drawable.ic_full,R.drawable.ic_empty);//设置星星显示样式
        // yStarView.getRating()+"颗星"




    }
}
