package org.bouncycastle.crypto.macs;

import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.digests.SkeinEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.SkeinParameters;

/* JADX INFO: loaded from: classes4.dex */
public class SkeinMac implements Mac {
    public static final int SKEIN_1024 = 1024;
    public static final int SKEIN_256 = 256;
    public static final int SKEIN_512 = 512;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SkeinEngine f88927a;

    public SkeinMac(int i10, int i11) {
        this.f88927a = new SkeinEngine(i10, i11);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) {
        return this.f88927a.doFinal(bArr, i10);
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        StringBuilder sb2 = new StringBuilder("Skein-MAC-");
        SkeinEngine skeinEngine = this.f88927a;
        sb2.append(skeinEngine.getBlockSize() * 8);
        sb2.append(Constant.DASH_STRING);
        sb2.append(skeinEngine.getOutputSize() * 8);
        return sb2.toString();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.f88927a.getOutputSize();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        SkeinParameters skeinParametersBuild;
        if (cipherParameters instanceof SkeinParameters) {
            skeinParametersBuild = (SkeinParameters) cipherParameters;
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "Invalid parameter passed to Skein MAC init - "));
            }
            skeinParametersBuild = new SkeinParameters.Builder().setKey(((KeyParameter) cipherParameters).getKey()).build();
        }
        if (skeinParametersBuild.getKey() == null) {
            throw new IllegalArgumentException("Skein MAC requires a key parameter.");
        }
        this.f88927a.init(skeinParametersBuild);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.f88927a.reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) {
        this.f88927a.update(b10);
    }

    public SkeinMac(SkeinMac skeinMac) {
        this.f88927a = new SkeinEngine(skeinMac.f88927a);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) {
        this.f88927a.update(bArr, i10, i11);
    }
}
