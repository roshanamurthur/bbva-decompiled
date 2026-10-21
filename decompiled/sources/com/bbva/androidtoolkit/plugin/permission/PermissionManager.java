package com.bbva.androidtoolkit.plugin.permission;

import android.app.Activity;
import android.content.Intent;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Collections;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class PermissionManager {
    private static final /* synthetic */ PermissionManager[] $VALUES;
    public static final PermissionManager INSTANCE;
    private PermissionResultListener mListener;

    static {
        PermissionManager permissionManager = new PermissionManager("INSTANCE", 0);
        INSTANCE = permissionManager;
        $VALUES = new PermissionManager[]{permissionManager};
    }

    public PermissionManager() {
        throw null;
    }

    public static ArrayList a(Activity activity, String[] strArr, boolean z10) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new Permission(str, !z10 ? !ActivityCompat.shouldShowRequestPermissionRationale(activity, str) : false));
        }
        return arrayList;
    }

    public static synchronized void request(Activity activity, String[] strArr, PermissionResultListener permissionResultListener) {
        try {
            INSTANCE.mListener = permissionResultListener;
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (ContextCompat.checkSelfPermission(activity, str) != 0) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                INSTANCE.onActivityResult(new PermissionReport(a(activity, strArr, true), Collections.emptyList()));
            } else {
                Intent intent = new Intent(activity, (Class<?>) PermissionActivity.class);
                intent.putExtra("permissions", (String[]) arrayList.toArray(new String[arrayList.size()]));
                activity.startActivity(intent);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static PermissionManager valueOf(String str) {
        return (PermissionManager) Enum.valueOf(PermissionManager.class, str);
    }

    public static PermissionManager[] values() {
        return (PermissionManager[]) $VALUES.clone();
    }

    public void onActivityResult(PermissionReport permissionReport) {
        PermissionResultListener permissionResultListener = this.mListener;
        if (permissionResultListener != null) {
            this.mListener = null;
            permissionResultListener.onRequestPermissionFinish(permissionReport);
        }
    }
}
