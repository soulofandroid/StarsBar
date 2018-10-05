# StarsBar
自定义星星评分控件，可以设置实现只显示实心星星数，也可以一部分显示实心一部分显示空心星星数.
# YStarView
可以半星显示，支持半星显示


## StarBar

```
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
```

## YStarView

使用方法 xml的：

```
 <com.starsbar.YStarView
            android:id="@+id/starBar4"
            android:layout_marginTop="50dp"
            android:layout_gravity="center_horizontal"
            android:layout_width="200dp"
            android:layout_height="50dp"  />
```
只要宽高，自己调就好

Activity里面找到控件后：

 ```
       yStarView = (YStarView) findViewById(R.id.starBar4);
        yStarView.setStarCount(5);//星星总数
        yStarView.setRating(3);//设置星星亮的颗数
        yStarView.setChange(true);//设置星星是否可以点击和滑动改变
        yStarView.setHalf(true);//设置半星
        yStarView.setStar(R.drawable.ic_full,R.drawable.ic_empty);//设置星星显示样式
        
         star.getRating()//获取亮星星的颗数
 ```
   
不设置就会使用默认的 不能再简单了·····
