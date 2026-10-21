package com.salesforce.marketingcloud.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public abstract class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64339a;

    public g(@NonNull String str, @Nullable Object... objArr) {
        this.f64339a = "mcsdk_" + String.format(Locale.US, str, objArr);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f64339a);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
