package com.facetec.sdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.Timer;

/* JADX INFO: loaded from: classes9.dex */
final class bv implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Timer f40719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f40720b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Timer f40722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private WeakReference<c> f40723e = new WeakReference<>(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private WeakReference<cc> f40727j = new WeakReference<>(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f40725g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f40726i = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f40724f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Sensor f40721c = aQ_().getDefaultSensor(5);

    @FunctionalInterface
    public interface c {
        void onDarkLightDetected();
    }

    public bv(Context context) {
        this.f40720b = context.getApplicationContext();
    }

    private SensorManager aQ_() {
        return (SensorManager) this.f40720b.getSystemService("sensor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aR_(Sensor sensor) {
        aQ_().unregisterListener(this, sensor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(bv bvVar) {
        aQ_().registerListener(bvVar, this.f40721c, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        cc.d dVarJ;
        byte[] bArr;
        this.f40724f++;
        cc ccVar = this.f40727j.get();
        if (ccVar != null) {
            if ((this.f40726i && this.f40724f <= 1) || (dVarJ = ccVar.j()) == null || (bArr = dVarJ.f40835d) == null) {
                return;
            }
            int i10 = dVarJ.f40834b * dVarJ.f40836e;
            int i11 = i10 / 4;
            float f6 = 0.0f;
            int i12 = 0;
            for (int i13 = 1; i13 <= i10; i13 += 4) {
                i12 += bArr[i13 - 1] & 255;
                if (i13 % 8421504 == 0) {
                    f6 = (i12 / i11) + f6;
                    i12 = 0;
                }
            }
            if (((int) ((i12 / i11) + f6)) < 75.0f) {
                e();
            } else {
                c();
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f40725g) {
            return;
        }
        this.f40724f = 0;
        if (sensorEvent.values[0] < 3.0f) {
            e();
        } else {
            c();
        }
    }

    private void c() {
        Timer timer = this.f40722d;
        if (timer != null) {
            timer.cancel();
            this.f40722d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        c cVar = this.f40723e.get();
        if (cVar != null) {
            cVar.onDarkLightDetected();
            a();
        }
    }

    public final void a() {
        this.f40725g = true;
        final Sensor sensor = this.f40721c;
        if (sensor != null) {
            this.f40721c = null;
            cx.d(new Runnable() { // from class: com.facetec.sdk.d6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41140p0.aR_(sensor);
                }
            });
        }
        c();
        Timer timer = this.f40719a;
        if (timer != null) {
            timer.cancel();
            this.f40719a = null;
        }
        this.f40723e.clear();
    }

    public final synchronized void b(c cVar, cc ccVar) {
        try {
            this.f40723e = new WeakReference<>(cVar);
            this.f40727j = new WeakReference<>(ccVar);
            if (this.f40721c != null) {
                new Handler().postDelayed(new e6(this, this, 0), 50L);
                this.f40726i = true;
            }
            cw cwVar = new cw(new b2(this, 2));
            Timer timer = new Timer();
            this.f40719a = timer;
            try {
                timer.scheduleAtFixedRate(cwVar, 500L, 1000L);
            } catch (IllegalStateException unused) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void e() {
        if (this.f40722d == null) {
            Timer timer = new Timer();
            this.f40722d = timer;
            try {
                timer.schedule(new cw(new i1(this, 2)), 200L);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
