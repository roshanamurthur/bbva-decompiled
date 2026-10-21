package com.vasco.digipass.sdk.utils.utilities.obfuscated;

/* JADX INFO: loaded from: classes9.dex */
public class t extends IllegalStateException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private Throwable f66372p0;

    public t(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f66372p0;
    }

    public t(String str, Throwable th2) {
        super(str);
        this.f66372p0 = th2;
    }
}
