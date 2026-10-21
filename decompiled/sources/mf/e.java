package mf;

import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.subtle.StreamSegmentDecrypter;
import com.google.crypto.tink.subtle.StreamSegmentEncrypter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: NonceBasedStreamingAead.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class e implements StreamingAead {
    public abstract int getCiphertextOffset();

    public abstract int getCiphertextOverhead();

    public abstract int getCiphertextSegmentSize();

    public abstract int getHeaderLength();

    public abstract int getPlaintextSegmentSize();

    @Override // com.google.crypto.tink.StreamingAead
    public ReadableByteChannel newDecryptingChannel(ReadableByteChannel readableByteChannel, byte[] bArr) throws GeneralSecurityException, IOException {
        return new f(this, readableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public InputStream newDecryptingStream(InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return new g(this, inputStream, bArr);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public WritableByteChannel newEncryptingChannel(WritableByteChannel writableByteChannel, byte[] bArr) throws GeneralSecurityException, IOException {
        h hVar = new h();
        hVar.f83450u0 = true;
        hVar.f83445p0 = writableByteChannel;
        StreamSegmentEncrypter streamSegmentEncrypterNewStreamSegmentEncrypter = newStreamSegmentEncrypter(bArr);
        hVar.f83446q0 = streamSegmentEncrypterNewStreamSegmentEncrypter;
        int plaintextSegmentSize = getPlaintextSegmentSize();
        hVar.f83449t0 = plaintextSegmentSize;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(plaintextSegmentSize);
        hVar.f83447r0 = byteBufferAllocate;
        byteBufferAllocate.limit(plaintextSegmentSize - getCiphertextOffset());
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(getCiphertextSegmentSize());
        hVar.f83448s0 = byteBufferAllocate2;
        byteBufferAllocate2.put(streamSegmentEncrypterNewStreamSegmentEncrypter.getHeader());
        byteBufferAllocate2.flip();
        writableByteChannel.write(byteBufferAllocate2);
        return hVar;
    }

    @Override // com.google.crypto.tink.StreamingAead
    public OutputStream newEncryptingStream(OutputStream outputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return new i(this, outputStream, bArr);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public SeekableByteChannel newSeekableDecryptingChannel(SeekableByteChannel seekableByteChannel, byte[] bArr) throws GeneralSecurityException, IOException {
        return new j(this, seekableByteChannel, bArr);
    }

    public abstract StreamSegmentDecrypter newStreamSegmentDecrypter() throws GeneralSecurityException;

    public abstract StreamSegmentEncrypter newStreamSegmentEncrypter(byte[] bArr) throws GeneralSecurityException;
}
