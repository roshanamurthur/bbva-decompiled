package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class AEADParameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f89183p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f89184q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final KeyParameter f89185r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f89186s0;

    public AEADParameters(KeyParameter keyParameter, int i10, byte[] bArr) {
        this(keyParameter, i10, bArr, null);
    }

    public byte[] getAssociatedText() {
        return Arrays.clone(this.f89183p0);
    }

    public KeyParameter getKey() {
        return this.f89185r0;
    }

    public int getMacSize() {
        return this.f89186s0;
    }

    public byte[] getNonce() {
        return Arrays.clone(this.f89184q0);
    }

    public AEADParameters(KeyParameter keyParameter, int i10, byte[] bArr, byte[] bArr2) {
        this.f89185r0 = keyParameter;
        this.f89184q0 = Arrays.clone(bArr);
        this.f89186s0 = i10;
        this.f89183p0 = Arrays.clone(bArr2);
    }
}
