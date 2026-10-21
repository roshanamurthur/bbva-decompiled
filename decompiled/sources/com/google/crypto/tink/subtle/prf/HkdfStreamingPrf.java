package com.google.crypto.tink.subtle.prf;

import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.Enums;
import com.google.errorprone.annotations.Immutable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public class HkdfStreamingPrf implements StreamingPrf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enums.HashType f47506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f47507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f47508c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47509a;

        static {
            int[] iArr = new int[Enums.HashType.values().length];
            f47509a = iArr;
            try {
                iArr[Enums.HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47509a[Enums.HashType.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47509a[Enums.HashType.SHA384.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47509a[Enums.HashType.SHA512.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public HkdfStreamingPrf(Enums.HashType hashType, byte[] bArr, byte[] bArr2) {
        this.f47506a = hashType;
        this.f47507b = Arrays.copyOf(bArr, bArr.length);
        this.f47508c = Arrays.copyOf(bArr2, bArr2.length);
    }

    public static String a(Enums.HashType hashType) throws GeneralSecurityException {
        int i10 = a.f47509a[hashType.ordinal()];
        if (i10 == 1) {
            return "HmacSha1";
        }
        if (i10 == 2) {
            return "HmacSha256";
        }
        if (i10 == 3) {
            return "HmacSha384";
        }
        if (i10 == 4) {
            return "HmacSha512";
        }
        throw new GeneralSecurityException("No getJavaxHmacName for given hash " + hashType + " known");
    }

    @Override // com.google.crypto.tink.subtle.prf.StreamingPrf
    public InputStream computePrf(byte[] bArr) {
        return new b(bArr);
    }

    public class b extends InputStream {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final byte[] f47510p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Mac f47511q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public byte[] f47512r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public ByteBuffer f47513s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f47514t0 = -1;

        public b(byte[] bArr) {
            this.f47510p0 = Arrays.copyOf(bArr, bArr.length);
        }

        public final void b() throws GeneralSecurityException, IOException {
            HkdfStreamingPrf hkdfStreamingPrf = HkdfStreamingPrf.this;
            try {
                Mac engineFactory = EngineFactory.MAC.getInstance(HkdfStreamingPrf.a(hkdfStreamingPrf.f47506a));
                this.f47511q0 = engineFactory;
                byte[] bArr = hkdfStreamingPrf.f47508c;
                if (bArr == null || bArr.length == 0) {
                    engineFactory.init(new SecretKeySpec(new byte[this.f47511q0.getMacLength()], HkdfStreamingPrf.a(hkdfStreamingPrf.f47506a)));
                } else {
                    engineFactory.init(new SecretKeySpec(hkdfStreamingPrf.f47508c, HkdfStreamingPrf.a(hkdfStreamingPrf.f47506a)));
                }
                this.f47511q0.update(hkdfStreamingPrf.f47507b);
                this.f47512r0 = this.f47511q0.doFinal();
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
                this.f47513s0 = byteBufferAllocateDirect;
                byteBufferAllocateDirect.mark();
                this.f47514t0 = 0;
            } catch (GeneralSecurityException e5) {
                throw new IOException("Creating HMac failed", e5);
            }
        }

        public final void e() throws GeneralSecurityException, IOException {
            this.f47511q0.init(new SecretKeySpec(this.f47512r0, HkdfStreamingPrf.a(HkdfStreamingPrf.this.f47506a)));
            this.f47513s0.reset();
            this.f47511q0.update(this.f47513s0);
            this.f47511q0.update(this.f47510p0);
            int i10 = this.f47514t0 + 1;
            this.f47514t0 = i10;
            this.f47511q0.update((byte) i10);
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f47511q0.doFinal());
            this.f47513s0 = byteBufferWrap;
            byteBufferWrap.mark();
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            byte[] bArr = new byte[1];
            int i10 = read(bArr, 0, 1);
            if (i10 == 1) {
                return bArr[0] & 255;
            }
            if (i10 == -1) {
                return i10;
            }
            throw new IOException("Reading failed");
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr) throws IOException {
            return read(bArr, 0, bArr.length);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            try {
                if (this.f47514t0 == -1) {
                    b();
                }
                int i12 = 0;
                while (i12 < i11) {
                    if (!this.f47513s0.hasRemaining()) {
                        if (this.f47514t0 == 255) {
                            return i12;
                        }
                        e();
                    }
                    int iMin = Math.min(i11 - i12, this.f47513s0.remaining());
                    this.f47513s0.get(bArr, i10, iMin);
                    i10 += iMin;
                    i12 += iMin;
                }
                return i12;
            } catch (GeneralSecurityException e5) {
                this.f47511q0 = null;
                throw new IOException("HkdfInputStream failed", e5);
            }
        }
    }
}
