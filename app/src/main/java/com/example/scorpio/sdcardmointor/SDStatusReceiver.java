package com.example.scorpio.sdcardmointor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Scorpio on 16/3/3.
 */
public class SDStatusReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"sd卡被移除，微信头像或图片暂时不能保存到sd卡",Toast.LENGTH_LONG).show();
    }
}
