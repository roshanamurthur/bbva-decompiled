package com.bbva.androidtoolkit.plugin.activity;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class ActivityResultRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f26489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bundle f26490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f26493e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Class<? extends Activity> f26494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ActivityResultListener f26495g;

    public static ActivityResultRequest create() {
        return new ActivityResultRequest();
    }

    public ActivityResultRequest action(String str) {
        this.f26492d = str;
        return this;
    }

    public ActivityResultRequest addCategory(String str) {
        this.f26493e.add(str);
        return this;
    }

    public ActivityResultRequest extras(Bundle bundle) {
        this.f26490b = bundle;
        return this;
    }

    public ActivityResultRequest listener(ActivityResultListener activityResultListener) {
        this.f26495g = activityResultListener;
        return this;
    }

    public void start(Activity activity) {
        ActivityResultManager.INSTANCE.setListener(this.f26495g);
        String str = this.f26492d;
        ArrayList arrayList = this.f26493e;
        if (str != null) {
            ActivityResultManager.startActivityForResult(activity, this.f26491c, str, this.f26489a, this.f26490b, arrayList);
        } else {
            ActivityResultManager.startActivityForResult(activity, this.f26494f, this.f26490b, arrayList);
        }
    }

    public ActivityResultRequest target(Class<? extends Activity> cls) {
        this.f26494f = cls;
        return this;
    }

    public ActivityResultRequest type(String str) {
        this.f26491c = str;
        return this;
    }

    public ActivityResultRequest uri(Uri uri) {
        this.f26489a = uri;
        return this;
    }
}
