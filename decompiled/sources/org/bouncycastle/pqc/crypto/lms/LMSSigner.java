package org.bouncycastle.pqc.crypto.lms;

import androidx.camera.core.impl.a;
import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.crypto.MessageSigner;
import um.e;
import um.f;

/* JADX INFO: loaded from: classes13.dex */
public class LMSSigner implements MessageSigner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LMSPrivateKeyParameters f91116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LMSPublicKeyParameters f91117b;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        try {
            return e.b(this.f91116a, bArr).getEncoded();
        } catch (IOException e5) {
            throw new IllegalStateException(a.d(e5, new StringBuilder("unable to encode signature: ")));
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (z10) {
            this.f91116a = (LMSPrivateKeyParameters) cipherParameters;
        } else {
            this.f91117b = (LMSPublicKeyParameters) cipherParameters;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        try {
            return e.c(this.f91117b, f.a(bArr2), bArr);
        } catch (IOException e5) {
            throw new IllegalStateException(a.d(e5, new StringBuilder("unable to decode signature: ")));
        }
    }
}
