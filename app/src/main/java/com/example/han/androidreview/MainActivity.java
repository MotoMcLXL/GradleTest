package com.example.han.androidreview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 不做处理，默认缩放。
        BitmapFactory.Options options = new BitmapFactory.Options();
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.timg, options);
        Log.i(TAG, "bitmap：ByteCount = " + bitmap.getByteCount() + ":::bitmap：AllocationByteCount = " + bitmap.getAllocationByteCount());
        Log.i(TAG, "width:" + bitmap.getWidth() + ":::height:" + bitmap.getHeight());
        Log.i(TAG, "inDensity:" + options.inDensity + ":::inTargetDensity:" + options.inTargetDensity+" format = "+options.outConfig.name());

        Log.i(TAG,"===========================================================================");

        // 手动设置inDensity与inTargetDensity，影响缩放比例。
        BitmapFactory.Options options_setParams = new BitmapFactory.Options();
        options_setParams.inDensity = 320;
        options_setParams.inTargetDensity = 320;
        Bitmap bitmap_setParams = BitmapFactory.decodeResource(getResources(), R.mipmap.timg, options_setParams);
        Log.i(TAG, "bitmap_setParams：ByteCount = " + bitmap_setParams.getByteCount() + ":::bitmap_setParams：AllocationByteCount = " + bitmap_setParams.getAllocationByteCount());
        Log.i(TAG, "width:" + bitmap_setParams.getWidth() + ":::height:" + bitmap_setParams.getHeight());
        Log.i(TAG, "inDensity:" + options_setParams.inDensity + ":::inTargetDensity:" + options_setParams.inTargetDensity);

    }
}
