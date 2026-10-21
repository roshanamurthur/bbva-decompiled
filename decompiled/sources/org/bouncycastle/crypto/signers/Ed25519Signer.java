package org.bouncycastle.crypto.signers;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class Ed25519Signer implements Signer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f89515a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f89516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ed25519PrivateKeyParameters f89517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ed25519PublicKeyParameters f89518d;

    public static class a extends ByteArrayOutputStream {
        public final synchronized byte[] a(Ed25519PrivateKeyParameters ed25519PrivateKeyParameters) {
            byte[] bArr;
            bArr = new byte[64];
            ed25519PrivateKeyParameters.sign(0, null, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, bArr, 0);
            reset();
            return bArr;
        }

        public final synchronized boolean b(Ed25519PublicKeyParameters ed25519PublicKeyParameters, byte[] bArr) {
            if (64 != bArr.length) {
                return false;
            }
            boolean zVerify = Ed25519.verify(bArr, 0, ed25519PublicKeyParameters.getEncoded(), 0, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            reset();
            return zVerify;
        }

        @Override // java.io.ByteArrayOutputStream
        public final synchronized void reset() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
            ((ByteArrayOutputStream) this).count = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        Ed25519PrivateKeyParameters ed25519PrivateKeyParameters;
        if (!this.f89516b || (ed25519PrivateKeyParameters = this.f89517c) == null) {
            throw new IllegalStateException("Ed25519Signer not initialised for signature generation.");
        }
        return this.f89515a.a(ed25519PrivateKeyParameters);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f89516b = z10;
        if (z10) {
            this.f89517c = (Ed25519PrivateKeyParameters) cipherParameters;
            this.f89518d = null;
        } else {
            this.f89517c = null;
            this.f89518d = (Ed25519PublicKeyParameters) cipherParameters;
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.f89515a.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b10) throws IOException {
        this.f89515a.write(b10);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        Ed25519PublicKeyParameters ed25519PublicKeyParameters;
        if (this.f89516b || (ed25519PublicKeyParameters = this.f89518d) == null) {
            throw new IllegalStateException("Ed25519Signer not initialised for verification");
        }
        return this.f89515a.b(ed25519PublicKeyParameters, bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i10, int i11) throws IOException {
        this.f89515a.write(bArr, i10, i11);
    }
}
