package com.bbva.androidtoolkit.plugin.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ActivityResultManager {
    private static final /* synthetic */ ActivityResultManager[] $VALUES;
    public static final ActivityResultManager INSTANCE;
    private ActivityResultListener mListener;

    static {
        ActivityResultManager activityResultManager = new ActivityResultManager("INSTANCE", 0);
        INSTANCE = activityResultManager;
        $VALUES = new ActivityResultManager[]{activityResultManager};
    }

    public ActivityResultManager() {
        throw null;
    }

    public static void startActivityForResult(Activity activity, Intent intent) {
    }

    public static ActivityResultManager valueOf(String str) {
        return (ActivityResultManager) Enum.valueOf(ActivityResultManager.class, str);
    }

    public static ActivityResultManager[] values() {
        return (ActivityResultManager[]) $VALUES.clone();
    }

    public void onActivityResultCancelled() {
        ActivityResultListener activityResultListener = this.mListener;
        if (activityResultListener != null) {
            this.mListener = null;
            activityResultListener.onCancel();
        }
    }

    public void onActivityResultSuccess(Intent intent) {
        ActivityResultListener activityResultListener = this.mListener;
        if (activityResultListener != null) {
            this.mListener = null;
            activityResultListener.onSuccess(intent);
        }
    }

    public void setListener(ActivityResultListener activityResultListener) {
        this.mListener = activityResultListener;
    }

    public static void startActivityForResult(Activity activity, Class<? extends Activity> cls, @Nullable Bundle bundle, List<String> list) {
        Intent intent = new Intent(activity, (Class<?>) ResultHandlerActivity.class);
        intent.putExtra("target", cls);
        intent.putExtra("extras", bundle);
        if (!list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                intent.addCategory(it.next());
            }
        }
        activity.startActivity(intent);
    }

    public static void startActivityForResult(Activity activity, String str, String str2, @Nullable Uri uri, @Nullable Bundle bundle, List<String> list) {
        Intent intent = new Intent(activity, (Class<?>) ResultHandlerActivity.class);
        intent.putExtra("type", str);
        intent.putExtra("action", str2);
        intent.putExtra("uri", uri);
        intent.putExtra("extras", bundle);
        if (!list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                intent.addCategory(it.next());
            }
        }
        activity.startActivity(intent);
    }
}
