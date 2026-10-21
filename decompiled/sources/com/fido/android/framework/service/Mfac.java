package com.fido.android.framework.service;

import android.content.Context;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.ConformanceTest;

/* JADX INFO: loaded from: classes9.dex */
public class Mfac {
    protected static Mfac mFido;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43535a;

    public Mfac(Context context) {
        this.f43535a = context;
        ConformanceTest.init(context);
    }

    public static Mfac Instance() {
        return mFido;
    }

    public static void init(Context context) {
        if (mFido == null) {
            mFido = new Mfac(context);
        }
    }

    public AppSDKConfig getConfig() {
        return AppSDKConfig.getInstance(this.f43535a);
    }

    public Context getContext() {
        return this.f43535a;
    }

    public boolean isEnabled() {
        return true;
    }

    public void showEulaDialog() {
    }
}
