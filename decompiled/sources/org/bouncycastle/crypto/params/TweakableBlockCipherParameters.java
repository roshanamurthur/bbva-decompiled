package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class TweakableBlockCipherParameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f89385p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final KeyParameter f89386q0;

    public TweakableBlockCipherParameters(KeyParameter keyParameter, byte[] bArr) {
        this.f89386q0 = keyParameter;
        this.f89385p0 = Arrays.clone(bArr);
    }

    public KeyParameter getKey() {
        return this.f89386q0;
    }

    public byte[] getTweak() {
        return this.f89385p0;
    }
}
