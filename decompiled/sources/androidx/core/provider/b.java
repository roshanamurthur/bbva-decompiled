package androidx.core.provider;

/* JADX INFO: compiled from: CallbackWithHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ FontsContractCompat.FontRequestCallback f20048p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f20049q0;

    public b(FontsContractCompat.FontRequestCallback fontRequestCallback, int i10) {
        this.f20048p0 = fontRequestCallback;
        this.f20049q0 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20048p0.onTypefaceRequestFailed(this.f20049q0);
    }
}
