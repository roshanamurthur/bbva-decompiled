package com.facetec.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
abstract class bh extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    RelativeLayout f40568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Handler f40569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    View f40570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    cc f40571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final AtomicBoolean f40572e = new AtomicBoolean(false);

    public enum b {
        NOT_GRANTED,
        DENIED_ALWAYS,
        GRANTED
    }

    private synchronized void v() {
        if (!a() && !isFinishing()) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        if (hasWindowFocus()) {
            return;
        }
        v();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public abstract void b();

    public abstract void b(int i10);

    public abstract void b(String str);

    public final void c() {
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.CAMERA"}, 0);
        a(true);
    }

    public abstract void d();

    @NonNull
    public final b e() {
        if (ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") != 0) {
            return (!((SharedPreferences) bg.a(new Object[]{this}, 1435759663, -1435759656, (int) System.currentTimeMillis())).getBoolean("cameraPermissionsShown", false) || ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.CAMERA")) ? b.NOT_GRANTED : b.DENIED_ALWAYS;
        }
        return b.GRANTED;
    }

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (bg.an_(configuration)) {
            q();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.f40569b;
        if (handler != null) {
            handler.removeCallbacks(null);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() throws Throwable {
        try {
            super.onResume();
            this.f40569b.postDelayed(new b2(this, 1), 1000L);
        } catch (Throwable unused) {
            t.c(this, e.ON_RESUME_ERROR, "Error detected in onResume(). Ending the session.");
            b(ak.f40306x);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void t();

    public final boolean a() {
        return this.f40572e.get();
    }

    public final void a(boolean z10) {
        this.f40572e.set(z10);
    }
}
