package org.bouncycastle.crypto.signers;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.math.ec.rfc8032.Ed448;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class Ed448Signer implements Signer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f89529a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f89531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ed448PrivateKeyParameters f89532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ed448PublicKeyParameters f89533e;

    public static class a extends ByteArrayOutputStream {
        public final synchronized byte[] a(Ed448PrivateKeyParameters ed448PrivateKeyParameters, byte[] bArr) {
            byte[] bArr2;
            bArr2 = new byte[114];
            ed448PrivateKeyParameters.sign(0, bArr, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, bArr2, 0);
            reset();
            return bArr2;
        }

        public final synchronized boolean b(Ed448PublicKeyParameters ed448PublicKeyParameters, byte[] bArr, byte[] bArr2) {
            if (114 != bArr2.length) {
                return false;
            }
            boolean zVerify = Ed448.verify(bArr2, 0, ed448PublicKeyParameters.getEncoded(), 0, bArr, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            reset();
            return zVerify;
        }

        @Override // java.io.ByteArrayOutputStream
        public final synchronized void reset() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
            ((ByteArrayOutputStream) this).count = 0;
        }
    }

    public Ed448Signer(byte[] bArr) {
        this.f89530b = Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        Ed448PrivateKeyParameters ed448PrivateKeyParameters;
        if (!this.f89531c || (ed448PrivateKeyParameters = this.f89532d) == null) {
            throw new IllegalStateException("Ed448Signer not initialised for signature generation.");
        }
        return this.f89529a.a(ed448PrivateKeyParameters, this.f89530b);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f89531c = z10;
        if (z10) {
            this.f89532d = (Ed448PrivateKeyParameters) cipherParameters;
            this.f89533e = null;
        } else {
            this.f89532d = null;
            this.f89533e = (Ed448PublicKeyParameters) cipherParameters;
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.f89529a.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b10) throws IOException {
        this.f89529a.write(b10);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        Ed448PublicKeyParameters ed448PublicKeyParameters;
        if (this.f89531c || (ed448PublicKeyParameters = this.f89533e) == null) {
            throw new IllegalStateException("Ed448Signer not initialised for verification");
        }
        return this.f89529a.b(ed448PublicKeyParameters, this.f89530b, bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i10, int i11) throws IOException {
        this.f89529a.write(bArr, i10, i11);
    }
}
