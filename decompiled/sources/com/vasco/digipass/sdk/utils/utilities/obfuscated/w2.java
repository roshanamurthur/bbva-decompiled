package com.vasco.digipass.sdk.utils.utilities.obfuscated;

/* JADX INFO: loaded from: classes9.dex */
public class w2 extends IllegalStateException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private Throwable f66418p0;

    public w2(String str, Throwable th2) {
        super(str);
        this.f66418p0 = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f66418p0;
    }
}
