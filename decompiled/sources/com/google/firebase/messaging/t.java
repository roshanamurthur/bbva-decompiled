package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import mx.openpay.library.data.util.CommandConstants;

/* JADX INFO: compiled from: TopicsStore.java */
/* JADX INFO: loaded from: classes10.dex */
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("TopicsStore.class")
    public static WeakReference<t> f48702d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f48703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f48704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f48705c;

    public t(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
        this.f48705c = scheduledExecutorService;
        this.f48703a = sharedPreferences;
    }

    @Nullable
    public final synchronized s a() {
        s sVar;
        String strC = this.f48704b.c();
        Pattern pattern = s.f48698d;
        sVar = null;
        if (!TextUtils.isEmpty(strC)) {
            String[] strArrSplit = strC.split(CommandConstants.Z11_EXCLAMATION_MARK, -1);
            if (strArrSplit.length == 2) {
                sVar = new s(strArrSplit[0], strArrSplit[1]);
            }
        }
        return sVar;
    }

    @WorkerThread
    public final synchronized void b() {
        this.f48704b = o.b(this.f48703a, this.f48705c);
    }

    public final synchronized void c(s sVar) {
        this.f48704b.d(sVar.f48701c);
    }
}
