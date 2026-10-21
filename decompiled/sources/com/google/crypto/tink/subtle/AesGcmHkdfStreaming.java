package com.google.crypto.tink.subtle;

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
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import mf.e;

/* JADX INFO: loaded from: classes10.dex */
public final class AesGcmHkdfStreaming extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f47408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f47409f;

    public class a implements StreamSegmentDecrypter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SecretKeySpec f47410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Cipher f47411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f47412c;

        public a() {
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public final synchronized void decryptSegment(ByteBuffer byteBuffer, int i10, boolean z10, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            this.f47411b.init(2, this.f47410a, AesGcmHkdfStreaming.a(this.f47412c, i10, z10));
            this.f47411b.doFinal(byteBuffer, byteBuffer2);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public final synchronized void init(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
            if (byteBuffer.remaining() != AesGcmHkdfStreaming.this.getHeaderLength()) {
                throw new InvalidAlgorithmParameterException("Invalid header length");
            }
            if (byteBuffer.get() != AesGcmHkdfStreaming.this.getHeaderLength()) {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
            this.f47412c = new byte[7];
            byte[] bArr2 = new byte[AesGcmHkdfStreaming.this.f47404a];
            byteBuffer.get(bArr2);
            byteBuffer.get(this.f47412c);
            AesGcmHkdfStreaming aesGcmHkdfStreaming = AesGcmHkdfStreaming.this;
            this.f47410a = new SecretKeySpec(Hkdf.computeHkdf(aesGcmHkdfStreaming.f47408e, aesGcmHkdfStreaming.f47409f, bArr2, bArr, aesGcmHkdfStreaming.f47404a), "AES");
            this.f47411b = EngineFactory.CIPHER.getInstance("AES/GCM/NoPadding");
        }
    }

    public AesGcmHkdfStreaming(byte[] bArr, String str, int i10, int i11, int i12) throws InvalidAlgorithmParameterException {
        if (bArr.length < 16 || bArr.length < i10) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, i10));
        }
        Validators.validateAesKeySize(i10);
        if (i11 <= getHeaderLength() + i12 + 16) {
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
        this.f47409f = Arrays.copyOf(bArr, bArr.length);
        this.f47408e = str;
        this.f47404a = i10;
        this.f47405b = i11;
        this.f47407d = i12;
        this.f47406c = i11 - 16;
    }

    public static GCMParameterSpec a(byte[] bArr, long j10, boolean z10) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(bArr);
        SubtleUtil.putAsUnsigedInt(byteBufferAllocate, j10);
        byteBufferAllocate.put(z10 ? (byte) 1 : (byte) 0);
        return new GCMParameterSpec(128, byteBufferAllocate.array());
    }

    public long expectedCiphertextSize(long j10) {
        long ciphertextOffset = j10 + ((long) getCiphertextOffset());
        int i10 = this.f47406c;
        long j11 = (ciphertextOffset / ((long) i10)) * ((long) this.f47405b);
        long j12 = ciphertextOffset % ((long) i10);
        return j12 > 0 ? j11 + j12 + 16 : j11;
    }

    @Override // mf.e
    public int getCiphertextOffset() {
        return getHeaderLength() + this.f47407d;
    }

    @Override // mf.e
    public int getCiphertextOverhead() {
        return 16;
    }

    @Override // mf.e
    public int getCiphertextSegmentSize() {
        return this.f47405b;
    }

    public int getFirstSegmentOffset() {
        return this.f47407d;
    }

    @Override // mf.e
    public int getHeaderLength() {
        return this.f47404a + 8;
    }

    @Override // mf.e
    public int getPlaintextSegmentSize() {
        return this.f47406c;
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
        return new b(this, bArr);
    }

    public class b implements StreamSegmentEncrypter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SecretKeySpec f47414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Cipher f47415b = EngineFactory.CIPHER.getInstance("AES/GCM/NoPadding");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f47416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ByteBuffer f47417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f47418e;

        public b(AesGcmHkdfStreaming aesGcmHkdfStreaming, byte[] bArr) throws GeneralSecurityException {
            this.f47418e = 0L;
            this.f47418e = 0L;
            byte[] bArrRandBytes = Random.randBytes(aesGcmHkdfStreaming.f47404a);
            byte[] bArrRandBytes2 = Random.randBytes(7);
            this.f47416c = bArrRandBytes2;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(aesGcmHkdfStreaming.getHeaderLength());
            this.f47417d = byteBufferAllocate;
            byteBufferAllocate.put((byte) aesGcmHkdfStreaming.getHeaderLength());
            byteBufferAllocate.put(bArrRandBytes);
            byteBufferAllocate.put(bArrRandBytes2);
            byteBufferAllocate.flip();
            this.f47414a = new SecretKeySpec(Hkdf.computeHkdf(aesGcmHkdfStreaming.f47408e, aesGcmHkdfStreaming.f47409f, bArrRandBytes, bArr, aesGcmHkdfStreaming.f47404a), "AES");
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public final synchronized void encryptSegment(ByteBuffer byteBuffer, boolean z10, ByteBuffer byteBuffer2) throws GeneralSecurityException {
            this.f47415b.init(1, this.f47414a, AesGcmHkdfStreaming.a(this.f47416c, this.f47418e, z10));
            this.f47418e++;
            this.f47415b.doFinal(byteBuffer, byteBuffer2);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public final ByteBuffer getHeader() {
            return this.f47417d.asReadOnlyBuffer();
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public final synchronized void encryptSegment(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z10, ByteBuffer byteBuffer3) throws GeneralSecurityException {
            try {
                this.f47415b.init(1, this.f47414a, AesGcmHkdfStreaming.a(this.f47416c, this.f47418e, z10));
                this.f47418e++;
                if (byteBuffer2.hasRemaining()) {
                    this.f47415b.update(byteBuffer, byteBuffer3);
                    this.f47415b.doFinal(byteBuffer2, byteBuffer3);
                } else {
                    this.f47415b.doFinal(byteBuffer, byteBuffer3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
