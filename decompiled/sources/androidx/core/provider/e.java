package androidx.core.provider;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: FontRequestWorker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Callable<i.a> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f20053p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Context f20054q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ FontRequest f20055r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f20056s0;

    public e(String str, Context context, FontRequest fontRequest, int i10) {
        this.f20053p0 = str;
        this.f20054q0 = context;
        this.f20055r0 = fontRequest;
        this.f20056s0 = i10;
    }

    @Override // java.util.concurrent.Callable
    public final i.a call() throws Exception {
        return i.a(this.f20053p0, this.f20054q0, this.f20055r0, this.f20056s0);
    }
}
