package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class AsymmetricKeyParameter implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f89205p0;

    public AsymmetricKeyParameter(boolean z10) {
        this.f89205p0 = z10;
    }

    public boolean isPrivate() {
        return this.f89205p0;
    }
}
