package com.noknok.android.client.utils;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

/* JADX INFO: loaded from: classes11.dex */
public class HelperActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (ActivityInOutParams.onActivityCreate(this)) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 0);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ActivityInOutParams.setResult(this, null);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        finish();
        ActivityInOutParams.setResult(this, null);
    }
}
