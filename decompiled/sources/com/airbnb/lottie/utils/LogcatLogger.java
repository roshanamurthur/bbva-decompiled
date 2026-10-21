package com.airbnb.lottie.utils;

import android.util.Log;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieLogger;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public class LogcatLogger implements LottieLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f26196a = new HashSet();

    @Override // com.airbnb.lottie.LottieLogger
    public void debug(String str) {
        debug(str, null);
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void error(String str, Throwable th2) {
        boolean z10 = L.DBG;
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void warning(String str) {
        warning(str, null);
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void debug(String str, Throwable th2) {
        boolean z10 = L.DBG;
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void warning(String str, Throwable th2) {
        HashSet hashSet = f26196a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w(L.TAG, str, th2);
        hashSet.add(str);
    }
}
