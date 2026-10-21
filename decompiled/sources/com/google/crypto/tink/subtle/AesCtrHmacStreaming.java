package com.google.crypto.tink.subtle;

import androidx.appcompat.widget.g0;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import mf.e;

/* JADX INFO: loaded from: classes10.dex */
public final class AesCtrHmacStreaming extends e {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f47377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f47378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f47379h;

    public class a implements StreamSegmentDecrypter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SecretKeySpec f47380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SecretKeySpec f47381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Cipher f47382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Mac f47383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f47384e;

        public a() {
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public final synchronized void decryptSegment(ByteBuffer byteBuffer, int i10, boolean z10, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            int iPosition = byteBuffer.position();
            byte[] bArrA = AesCtrHmacStreaming.a(AesCtrHmacStreaming.this, this.f47384e, i10, z10);
            int iRemaining = byteBuffer.remaining();
            int i11 = AesCtrHmacStreaming.this.f47374c;
            if (iRemaining < i11) {
                throw new GeneralSecurityException("Ciphertext too short");
            }
            int i12 = (iRemaining - i11) + iPosition;
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.limit(i12);
            ByteBuffer byteBufferDuplicate2 = byteBuffer.duplicate();
            byteBufferDuplicate2.position(i12);
            this.f47383d.init(this.f47381b);
            this.f47383d.update(bArrA);
            this.f47383d.update(byteBufferDuplicate);
            byte[] bArrCopyOf = Arrays.copyOf(this.f47383d.doFinal(), AesCtrHmacStreaming.this.f47374c);
            byte[] bArr = new byte[AesCtrHmacStreaming.this.f47374c];
            byteBufferDuplicate2.get(bArr);
            if (!Bytes.equal(bArr, bArrCopyOf)) {
                throw new GeneralSecurityException("Tag mismatch");
            }
            byteBuffer.limit(i12);
            this.f47382c.init(1, this.f47380a, new IvParameterSpec(bArrA));
            this.f47382c.doFinal(byteBuffer, byteBuffer2);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public final synchronized void init(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
            if (byteBuffer.remaining() != AesCtrHmacStreaming.this.getHeaderLength()) {
                throw new InvalidAlgorithmParameterException("Invalid header length");
            }
            if (byteBuffer.get() != AesCtrHmacStreaming.this.getHeaderLength()) {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
            this.f47384e = new byte[7];
            byte[] bArr2 = new byte[AesCtrHmacStreaming.this.f47372a];
            byteBuffer.get(bArr2);
            byteBuffer.get(this.f47384e);
            AesCtrHmacStreaming aesCtrHmacStreaming = AesCtrHmacStreaming.this;
            byte[] bArrComputeHkdf = Hkdf.computeHkdf(aesCtrHmacStreaming.f47378g, aesCtrHmacStreaming.f47379h, bArr2, bArr, aesCtrHmacStreaming.f47372a + 32);
            AesCtrHmacStreaming aesCtrHmacStreaming2 = AesCtrHmacStreaming.this;
            aesCtrHmacStreaming2.getClass();
            this.f47380a = new SecretKeySpec(bArrComputeHkdf, 0, aesCtrHmacStreaming2.f47372a, "AES");
            AesCtrHmacStreaming aesCtrHmacStreaming3 = AesCtrHmacStreaming.this;
            aesCtrHmacStreaming3.getClass();
            this.f47381b = new SecretKeySpec(bArrComputeHkdf, aesCtrHmacStreaming3.f47372a, 32, aesCtrHmacStreaming3.f47373b);
            this.f47382c = EngineFactory.CIPHER.getInstance("AES/CTR/NoPadding");
            AesCtrHmacStreaming aesCtrHmacStreaming4 = AesCtrHmacStreaming.this;
            aesCtrHmacStreaming4.getClass();
            this.f47383d = EngineFactory.MAC.getInstance(aesCtrHmacStreaming4.f47373b);
        }
    }

    public AesCtrHmacStreaming(byte[] bArr, String str, int i10, String str2, int i11, int i12, int i13) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC streaming in FIPS-mode.");
        }
        int length = bArr.length;
        if (length < 16 || length < i10) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, i10));
        }
        Validators.validateAesKeySize(i10);
        if (i11 < 10) {
            throw new InvalidAlgorithmParameterException(g0.c("tag size too small ", i11));
        }
        if ((str2.equals("HmacSha1") && i11 > 20) || ((str2.equals("HmacSha256") && i11 > 32) || (str2.equals("HmacSha512") && i11 > 64))) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        if ((((i12 - i13) - i11) - i10) - 8 <= 0) {
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
        this.f47379h = Arrays.copyOf(bArr, bArr.length);
        this.f47378g = str;
        this.f47372a = i10;
        this.f47373b = str2;
        this.f47374c = i11;
        this.f47375d = i12;
        this.f47377f = i13;
        this.f47376e = i12 - i11;
    }

    public static byte[] a(AesCtrHmacStreaming aesCtrHmacStreaming, byte[] bArr, long j10, boolean z10) throws GeneralSecurityException {
        aesCtrHmacStreaming.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(bArr);
        SubtleUtil.putAsUnsigedInt(byteBufferAllocate, j10);
        byteBufferAllocate.put(z10 ? (byte) 1 : (byte) 0);
        byteBufferAllocate.putInt(0);
        return byteBufferAllocate.array();
    }

    public long expectedCiphertextSize(long j10) {
        long ciphertextOffset = j10 + ((long) getCiphertextOffset());
        int i10 = this.f47376e;
        long j11 = (ciphertextOffset / ((long) i10)) * ((long) this.f47375d);
        long j12 = ciphertextOffset % ((long) i10);
        return j12 > 0 ? j11 + j12 + ((long) this.f47374c) : j11;
    }

    @Override // mf.e
    public int getCiphertextOffset() {
        return getHeaderLength() + this.f47377f;
    }

    @Override // mf.e
    public int getCiphertextOverhead() {
        return this.f47374c;
    }

    @Override // mf.e
    public int getCiphertextSegmentSize() {
        return this.f47375d;
    }

    public int getFirstSegmentOffset() {
        return this.f47377f;
    }

    @Override // mf.e
    public int getHeaderLength() {
        return this.f47372a + 8;
    }

    @Override // mf.e
    public int getPlaintextSegmentSize() {
        return this.f47376e;
    }

    @Override // mf.e, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ ReadableByteChannel newDecryptingChannel(ReadableByteChannel readableByteChannel, byte[] bArr) throws GeneralSecurityException, IOException {
        return super.newDecryptingChannel(readableByteChannel, bArr);
    }

    @Override // mf.e, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ InputStream newDecryptingStream(InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return super.newDecryptingStream(inputStream, bArr);
    }

    @Override // mf.e, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ WritableByteChannel newEncryptingChannel(WritableByteChannel writableByteChannel, byte[] bArr) throws GeneralSecurityException, IOException {
        return super.newEncryptingChannel(writableByteChannel, bArr);
    }

    @Override // mf.e, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ OutputStream newEncryptingStream(OutputStream outputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return super.newEncryptingStream(outputStream, bArr);
    }

    @Override // mf.e, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ SeekableByteChannel newSeekableDecryptingChannel(SeekableByteChannel seekableByteChannel, byte[] bArr) throws GeneralSecurityException, IOException {
        return super.newSeekableDecryptingChannel(seekableByteChannel, bArr);
    }

    @Override // mf.e
    public a newStreamSegmentDecrypter() throws GeneralSecurityException {
        return new a();
    }

    @Override // mf.e
    public b newStreamSegmentEncrypter(byte[] bArr) throws GeneralSecurityException {
        return new b(bArr);
    }

    public class b implements StreamSegmentEncrypter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SecretKeySpec f47386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SecretKeySpec f47387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Cipher f47388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Mac f47389d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f47390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ByteBuffer f47391f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f47392g;

        public b(byte[] bArr) throws GeneralSecurityException {
            this.f47392g = 0L;
            TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility = AesCtrHmacStreaming.FIPS;
            this.f47388c = EngineFactory.CIPHER.getInstance("AES/CTR/NoPadding");
            AesCtrHmacStreaming.this.getClass();
            EngineFactory<EngineWrapper.TMac, Mac> engineFactory = EngineFactory.MAC;
            String str = AesCtrHmacStreaming.this.f47373b;
            this.f47389d = engineFactory.getInstance(str);
            this.f47392g = 0L;
            int i10 = AesCtrHmacStreaming.this.f47372a;
            byte[] bArrRandBytes = Random.randBytes(i10);
            byte[] bArrRandBytes2 = Random.randBytes(7);
            this.f47390e = bArrRandBytes2;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(AesCtrHmacStreaming.this.getHeaderLength());
            this.f47391f = byteBufferAllocate;
            byteBufferAllocate.put((byte) AesCtrHmacStreaming.this.getHeaderLength());
            byteBufferAllocate.put(bArrRandBytes);
            byteBufferAllocate.put(bArrRandBytes2);
            byteBufferAllocate.flip();
            byte[] bArrComputeHkdf = Hkdf.computeHkdf(AesCtrHmacStreaming.this.f47378g, AesCtrHmacStreaming.this.f47379h, bArrRandBytes, bArr, i10 + 32);
            this.f47386a = new SecretKeySpec(bArrComputeHkdf, 0, i10, "AES");
            this.f47387b = new SecretKeySpec(bArrComputeHkdf, i10, 32, str);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public final synchronized void encryptSegment(ByteBuffer byteBuffer, boolean z10, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            int iPosition = byteBuffer2.position();
            byte[] bArrA = AesCtrHmacStreaming.a(AesCtrHmacStreaming.this, this.f47390e, this.f47392g, z10);
            this.f47388c.init(1, this.f47386a, new IvParameterSpec(bArrA));
            this.f47392g++;
            this.f47388c.doFinal(byteBuffer, byteBuffer2);
            ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
            byteBufferDuplicate.flip();
            byteBufferDuplicate.position(iPosition);
            this.f47389d.init(this.f47387b);
            this.f47389d.update(bArrA);
            this.f47389d.update(byteBufferDuplicate);
            byteBuffer2.put(this.f47389d.doFinal(), 0, AesCtrHmacStreaming.this.f47374c);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public final ByteBuffer getHeader() {
            return this.f47391f.asReadOnlyBuffer();
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public final synchronized void encryptSegment(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z10, ByteBuffer byteBuffer3) throws GeneralSecurityException {
            int iPosition = byteBuffer3.position();
            byte[] bArrA = AesCtrHmacStreaming.a(AesCtrHmacStreaming.this, this.f47390e, this.f47392g, z10);
            this.f47388c.init(1, this.f47386a, new IvParameterSpec(bArrA));
            this.f47392g++;
            this.f47388c.update(byteBuffer, byteBuffer3);
            this.f47388c.doFinal(byteBuffer2, byteBuffer3);
            ByteBuffer byteBufferDuplicate = byteBuffer3.duplicate();
            byteBufferDuplicate.flip();
            byteBufferDuplicate.position(iPosition);
            this.f47389d.init(this.f47387b);
            this.f47389d.update(bArrA);
            this.f47389d.update(byteBufferDuplicate);
            byteBuffer3.put(this.f47389d.doFinal(), 0, AesCtrHmacStreaming.this.f47374c);
        }
    }
}
