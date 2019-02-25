package com.hades.romcontrol.v2.utils;

import android.app.Activity;
import android.os.Bundle;
import android.os.PowerManager;

public class GoToRecovery extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((PowerManager) getSystemService("power")).reboot("recovery");
    }
}