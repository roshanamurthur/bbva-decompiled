package androidx.core.provider;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: FontRequestWorker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements Callable<i.a> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f20058p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Context f20059q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ FontRequest f20060r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f20061s0;

    public g(String str, Context context, FontRequest fontRequest, int i10) {
        this.f20058p0 = str;
        this.f20059q0 = context;
        this.f20060r0 = fontRequest;
        this.f20061s0 = i10;
    }

    @Override // java.util.concurrent.Callable
    public final i.a call() throws Exception {
        try {
            return i.a(this.f20058p0, this.f20059q0, this.f20060r0, this.f20061s0);
        } catch (Throwable unused) {
            return new i.a(-3);
        }
    }
}
