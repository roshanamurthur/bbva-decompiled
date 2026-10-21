package com.facetec.sdk;

import android.app.Activity;
import android.content.res.Resources;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
final class dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Resources f41160a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashMap<Integer, String> f41161c;

    public static void a(Activity activity) {
        if (f41160a == null) {
            f41160a = activity.getApplicationContext().getResources();
        }
    }

    public static void bv_(TextView textView, @StringRes int i10) {
        if (textView == null) {
            return;
        }
        textView.setText(c(i10));
    }

    @NonNull
    public static String c(@StringRes int i10) {
        if (i10 == 0) {
            return "";
        }
        HashMap<Integer, String> map = f41161c;
        String str = map != null ? map.get(Integer.valueOf(i10)) : null;
        return str != null ? str : f41160a.getString(i10);
    }

    public static synchronized void c(Map<Integer, String> map) {
        f41161c = new HashMap<>(map);
    }
}
