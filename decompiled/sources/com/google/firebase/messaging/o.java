package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: SharedPreferencesQueue.java */
/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f48652a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f48656e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("internalQueue")
    @VisibleForTesting
    public final ArrayDeque<String> f48655d = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48653b = "topic_operation_queue";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48654c = ",";

    public o(SharedPreferences sharedPreferences, Executor executor) {
        this.f48652a = sharedPreferences;
        this.f48656e = executor;
    }

    @WorkerThread
    public static o b(SharedPreferences sharedPreferences, Executor executor) {
        o oVar = new o(sharedPreferences, executor);
        synchronized (oVar.f48655d) {
            try {
                oVar.f48655d.clear();
                String string = oVar.f48652a.getString(oVar.f48653b, "");
                if (!TextUtils.isEmpty(string) && string.contains(oVar.f48654c)) {
                    String[] strArrSplit = string.split(oVar.f48654c, -1);
                    int length = strArrSplit.length;
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            oVar.f48655d.add(str);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVar;
    }

    public final boolean a(@NonNull String str) {
        boolean zAdd;
        if (TextUtils.isEmpty(str) || str.contains(this.f48654c)) {
            return false;
        }
        synchronized (this.f48655d) {
            zAdd = this.f48655d.add(str);
            if (zAdd) {
                this.f48656e.execute(new androidx.room.h(this, 5));
            }
        }
        return zAdd;
    }

    @Nullable
    public final String c() {
        String strPeek;
        synchronized (this.f48655d) {
            strPeek = this.f48655d.peek();
        }
        return strPeek;
    }

    public final boolean d(@Nullable String str) {
        boolean zRemove;
        synchronized (this.f48655d) {
            zRemove = this.f48655d.remove(str);
            if (zRemove) {
                this.f48656e.execute(new androidx.room.h(this, 5));
            }
        }
        return zRemove;
    }
}
