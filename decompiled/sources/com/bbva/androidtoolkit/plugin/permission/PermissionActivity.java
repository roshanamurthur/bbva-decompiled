package com.bbva.androidtoolkit.plugin.permission;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class PermissionActivity extends Activity {
    public static final String PERMISSIONS = "permissions";

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityCompat.requestPermissions(this, getIntent().getStringArrayExtra("permissions"), 4726);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (iArr.length == 0) {
            arrayList2.addAll(Arrays.asList(strArr));
        } else if (i10 == 4726) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (iArr[i11] == 0) {
                    arrayList.add(strArr[i11]);
                } else {
                    arrayList2.add(strArr[i11]);
                }
            }
        }
        PermissionManager.INSTANCE.onActivityResult(new PermissionReport(PermissionManager.a(this, (String[]) arrayList.toArray(new String[arrayList.size()]), true), PermissionManager.a(this, (String[]) arrayList2.toArray(new String[arrayList2.size()]), false)));
        finish();
    }
}
