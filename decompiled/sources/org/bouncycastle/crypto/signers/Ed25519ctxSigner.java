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
public class Ed25519ctxSigner implements Signer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f89519a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f89521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ed25519PrivateKeyParameters f89522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ed25519PublicKeyParameters f89523e;

    public static class a extends ByteArrayOutputStream {
        public final synchronized byte[] a(Ed25519PrivateKeyParameters ed25519PrivateKeyParameters, byte[] bArr) {
            byte[] bArr2;
            bArr2 = new byte[64];
            ed25519PrivateKeyParameters.sign(1, bArr, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, bArr2, 0);
            reset();
            return bArr2;
        }

        public final synchronized boolean b(Ed25519PublicKeyParameters ed25519PublicKeyParameters, byte[] bArr, byte[] bArr2) {
            if (64 != bArr2.length) {
                return false;
            }
            boolean zVerify = Ed25519.verify(bArr2, 0, ed25519PublicKeyParameters.getEncoded(), 0, bArr, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            reset();
            return zVerify;
        }

        @Override // java.io.ByteArrayOutputStream
        public final synchronized void reset() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
            ((ByteArrayOutputStream) this).count = 0;
        }
    }

    public Ed25519ctxSigner(byte[] bArr) {
        this.f89520b = Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        Ed25519PrivateKeyParameters ed25519PrivateKeyParameters;
        if (!this.f89521c || (ed25519PrivateKeyParameters = this.f89522d) == null) {
            throw new IllegalStateException("Ed25519ctxSigner not initialised for signature generation.");
        }
        return this.f89519a.a(ed25519PrivateKeyParameters, this.f89520b);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f89521c = z10;
        if (z10) {
            this.f89522d = (Ed25519PrivateKeyParameters) cipherParameters;
            this.f89523e = null;
        } else {
            this.f89522d = null;
            this.f89523e = (Ed25519PublicKeyParameters) cipherParameters;
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.f89519a.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b10) throws IOException {
        this.f89519a.write(b10);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        Ed25519PublicKeyParameters ed25519PublicKeyParameters;
        if (this.f89521c || (ed25519PublicKeyParameters = this.f89523e) == null) {
            throw new IllegalStateException("Ed25519ctxSigner not initialised for verification");
        }
        return this.f89519a.b(ed25519PublicKeyParameters, this.f89520b, bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i10, int i11) throws IOException {
        this.f89519a.write(bArr, i10, i11);
    }
}
