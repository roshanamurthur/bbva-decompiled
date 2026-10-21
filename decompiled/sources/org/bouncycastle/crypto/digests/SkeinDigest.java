package org.bouncycastle.crypto.digests;

import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.params.SkeinParameters;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes2.dex */
public class SkeinDigest implements ExtendedDigest, Memoable {
    public static final int SKEIN_1024 = 1024;
    public static final int SKEIN_256 = 256;
    public static final int SKEIN_512 = 512;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SkeinEngine f88175a;

    public SkeinDigest(int i10, int i11) {
        this.f88175a = new SkeinEngine(i10, i11);
        init(null);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SkeinDigest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        return this.f88175a.doFinal(bArr, i10);
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        StringBuilder sb2 = new StringBuilder("Skein-");
        SkeinEngine skeinEngine = this.f88175a;
        sb2.append(skeinEngine.getBlockSize() * 8);
        sb2.append(Constant.DASH_STRING);
        sb2.append(skeinEngine.getOutputSize() * 8);
        return sb2.toString();
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.f88175a.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.f88175a.getOutputSize();
    }

    public void init(SkeinParameters skeinParameters) {
        this.f88175a.init(skeinParameters);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.f88175a.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        this.f88175a.update(b10);
    }

    public SkeinDigest(SkeinDigest skeinDigest) {
        this.f88175a = new SkeinEngine(skeinDigest.f88175a);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        this.f88175a.reset(((SkeinDigest) memoable).f88175a);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        this.f88175a.update(bArr, i10, i11);
    }
}
