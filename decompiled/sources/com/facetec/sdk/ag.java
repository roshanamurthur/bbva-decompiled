package com.facetec.sdk;

import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes9.dex */
abstract class ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f40231a = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static an f40232c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f40233d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static an f40234e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static an f40235f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static float f40236g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static float f40237h = -1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static int f40238i = 0;
    private static an m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static /* synthetic */ boolean f40239n = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f40240b = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f40241j = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected boolean f40242l = false;

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final String[] f40248d = {"SM-J", "SM-G570", "SM-G611", "SM-G615", "SM-G532", "SM-G610", "SM-S767VL", "SM-A23", "SM-S236DL", "SM-C710", "SM-A105", "SM-A115", "SM-A205", "SM-A207", "SM-A236", "SM-A260", "SM-A305", "SM-A325", "SM-A730", "LM-G900", "220333QAG", "PRA-LA1", "23026RN54G", "23028RN4DG", "220733SG", "220733SI", "220733SL", "220743FI", "220733SH", "23028RNCAG", "RMX3710"};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final String[] f40249e = {"LM-X210", "LM-X410", "LG-K200", "Moto E (4)", "moto e5 play", "23026RN54G"};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final String[] f40247b = {"22111317PG", "LG-M250"};

        public static boolean e(String[] strArr) {
            for (String str : strArr) {
                if (Build.MODEL.contains(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static synchronized void b(Context context) {
        try {
            if (m == null) {
                try {
                    m = d(context).booleanValue() ? ai.h(context) : al.l();
                } catch (Exception e5) {
                    t.c(context, e.CAMERA_ERROR, e5.toString());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void e(Context context) {
        if (f40234e == null) {
            try {
                if (d(context).booleanValue()) {
                    f40234e = ai.f(context);
                } else {
                    if (bg.c(context) == FaceTecSDK.CameraPermissionStatus.GRANTED) {
                        f40234e = al.k();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static float f() throws am {
        an anVar = f40234e;
        if (anVar != null) {
            return anVar.f40333a / anVar.f40334c;
        }
        return 1.7777778f;
    }

    @Nullable
    public static synchronized an g() {
        return f40234e;
    }

    private static Boolean i() {
        try {
            return Boolean.FALSE;
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
    }

    @Nullable
    public static synchronized an j() {
        return m;
    }

    public static ag q_(ViewGroup viewGroup, Activity activity, boolean z10) throws am {
        ag agVarA;
        f40233d = z10;
        if (!z10) {
            av.c(activity);
        }
        if (bd.f40494c) {
            b(activity);
            if (!f40239n && m == null) {
                throw new AssertionError();
            }
        } else {
            e(activity);
            if (!f40239n && f40234e == null) {
                throw new AssertionError();
            }
        }
        if (i().booleanValue()) {
            agVarA = new ae();
        } else if (z10) {
            agVarA = al.a(activity, true);
        } else if (d(activity).booleanValue()) {
            ai aiVar = new ai(activity);
            l.f42225a = 2;
            agVarA = aiVar;
        } else {
            agVarA = al.a(activity, false);
            l.f42225a = 1;
        }
        View viewA = agVarA.a();
        viewGroup.addView(viewA);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        viewA.setLayoutParams(layoutParams);
        if (Build.VERSION.SDK_INT < 24) {
            viewA.setBackgroundColor(0);
        }
        return agVarA;
    }

    public abstract void E_(boolean z10, ViewGroup viewGroup);

    public abstract void F_(ViewGroup viewGroup);

    public abstract void J_(Camera.PictureCallback pictureCallback);

    public abstract View a();

    public abstract void b();

    public abstract void b(boolean z10);

    public abstract void c();

    public abstract void c(boolean z10);

    public void d() {
    }

    public abstract void e();

    public static Boolean d(Context context) throws am {
        for (String str : b.f40248d) {
            if (Build.MODEL.contains(str)) {
                return Boolean.FALSE;
            }
        }
        return !bd.f40494c ? Boolean.valueOf(ai.a(context)) : Boolean.valueOf(ai.c(context));
    }

    public final void e(@NonNull final Runnable runnable) {
        final Timer timer = new Timer();
        final Handler handler = new Handler(Looper.getMainLooper());
        final TimerTask timerTask = new TimerTask() { // from class: com.facetec.sdk.ag.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                if (ag.this.f40240b) {
                    synchronized (timer) {
                        cancel();
                        handler.removeCallbacksAndMessages(null);
                        handler.post(runnable);
                    }
                }
            }
        };
        timer.scheduleAtFixedRate(timerTask, 0L, 100L);
        handler.postDelayed(new Runnable() { // from class: com.facetec.sdk.o0
            @Override // java.lang.Runnable
            public final void run() {
                ag.e(timer, timerTask, runnable);
            }
        }, 8000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Timer timer, TimerTask timerTask, Runnable runnable) {
        synchronized (timer) {
            timerTask.cancel();
            runnable.run();
        }
    }
}
