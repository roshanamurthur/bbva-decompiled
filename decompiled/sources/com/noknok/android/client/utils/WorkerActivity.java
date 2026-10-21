package com.noknok.android.client.utils;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes11.dex */
public class WorkerActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ActivityProxy f63491a = null;

    public ActivityProxy getActivityProxy() {
        return this.f63491a;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f63491a = ActivityProxy.onActivityCreate(this, bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ActivityProxy activityProxy = this.f63491a;
        if (activityProxy == null) {
            Logger.e("WorkerActivity", "Activity recreated after proxy removed");
        } else {
            activityProxy.onActivityDestroy(this);
        }
    }
}
