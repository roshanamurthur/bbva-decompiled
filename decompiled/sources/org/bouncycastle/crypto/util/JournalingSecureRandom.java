package org.bouncycastle.crypto.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class JournalingSecureRandom extends SecureRandom {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final byte[] f89629t0 = new byte[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SecureRandom f89630p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final a f89631q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f89632r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f89633s0;

    public class a extends ByteArrayOutputStream {
        public final void b() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, (byte) 0);
        }
    }

    public JournalingSecureRandom() {
        this(CryptoServicesRegistrar.getSecureRandom());
    }

    public void clear() {
        Arrays.fill(this.f89632r0, (byte) 0);
        this.f89631q0.b();
    }

    public byte[] getFullTranscript() {
        int i10 = this.f89633s0;
        byte[] bArr = this.f89632r0;
        return i10 == bArr.length ? this.f89631q0.toByteArray() : Arrays.clone(bArr);
    }

    public byte[] getTranscript() {
        return this.f89631q0.toByteArray();
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        int i10 = this.f89633s0;
        int length = this.f89632r0.length;
        SecureRandom secureRandom = this.f89630p0;
        if (i10 >= length) {
            secureRandom.nextBytes(bArr);
        } else {
            int i11 = 0;
            while (i11 != bArr.length) {
                int i12 = this.f89633s0;
                byte[] bArr2 = this.f89632r0;
                if (i12 >= bArr2.length) {
                    break;
                }
                this.f89633s0 = i12 + 1;
                bArr[i11] = bArr2[i12];
                i11++;
            }
            if (i11 != bArr.length) {
                int length2 = bArr.length - i11;
                byte[] bArr3 = new byte[length2];
                secureRandom.nextBytes(bArr3);
                System.arraycopy(bArr3, 0, bArr, i11, length2);
            }
        }
        try {
            this.f89631q0.write(bArr);
        } catch (IOException e5) {
            throw new IllegalStateException(androidx.camera.core.impl.a.d(e5, new StringBuilder("unable to record transcript: ")));
        }
    }

    public void reset() {
        this.f89633s0 = 0;
        int length = this.f89632r0.length;
        a aVar = this.f89631q0;
        if (length == 0) {
            this.f89632r0 = aVar.toByteArray();
        }
        aVar.reset();
    }

    public JournalingSecureRandom(SecureRandom secureRandom) {
        this.f89631q0 = new a();
        this.f89633s0 = 0;
        this.f89630p0 = secureRandom;
        this.f89632r0 = f89629t0;
    }

    public JournalingSecureRandom(byte[] bArr, SecureRandom secureRandom) {
        this.f89631q0 = new a();
        this.f89633s0 = 0;
        this.f89630p0 = secureRandom;
        this.f89632r0 = Arrays.clone(bArr);
    }
}
