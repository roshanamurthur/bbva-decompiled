package org.bouncycastle.pqc.crypto.lms;

import androidx.camera.core.impl.a;
import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.crypto.MessageSigner;
import um.b;

/* JADX INFO: loaded from: classes13.dex */
public class HSSSigner implements MessageSigner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HSSPrivateKeyParameters f91089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HSSPublicKeyParameters f91090b;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        try {
            return b.a(this.f91089a, bArr).getEncoded();
        } catch (IOException e5) {
            throw new IllegalStateException(a.d(e5, new StringBuilder("unable to encode signature: ")));
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (z10) {
            this.f91089a = (HSSPrivateKeyParameters) cipherParameters;
        } else {
            this.f91090b = (HSSPublicKeyParameters) cipherParameters;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        try {
            HSSPublicKeyParameters hSSPublicKeyParameters = this.f91090b;
            return b.c(hSSPublicKeyParameters, HSSSignature.getInstance(bArr2, hSSPublicKeyParameters.getL()), bArr);
        } catch (IOException e5) {
            throw new IllegalStateException(a.d(e5, new StringBuilder("unable to decode signature: ")));
        }
    }
}
