package lf;

import androidx.annotation.RequiresApi;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.subtle.RewindableReadableByteChannel;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: StreamingAeadHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements StreamingAead {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PrimitiveSet<StreamingAead> f83209a;

    @Override // com.google.crypto.tink.StreamingAead
    public final ReadableByteChannel newDecryptingChannel(ReadableByteChannel readableByteChannel, byte[] bArr) throws GeneralSecurityException, IOException {
        b bVar = new b();
        bVar.f83198p0 = null;
        bVar.f83199q0 = null;
        bVar.f83201s0 = new ArrayDeque();
        Iterator<PrimitiveSet.Entry<StreamingAead>> it = this.f83209a.getRawPrimitives().iterator();
        while (it.hasNext()) {
            bVar.f83201s0.add(it.next().getPrimitive());
        }
        bVar.f83200r0 = new RewindableReadableByteChannel(readableByteChannel);
        bVar.f83202t0 = (byte[]) bArr.clone();
        return bVar;
    }

    @Override // com.google.crypto.tink.StreamingAead
    public final InputStream newDecryptingStream(InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        a aVar = new a();
        aVar.f83193p0 = false;
        aVar.f83194q0 = null;
        aVar.f83196s0 = this.f83209a;
        if (inputStream.markSupported()) {
            aVar.f83195r0 = inputStream;
        } else {
            aVar.f83195r0 = new BufferedInputStream(inputStream);
        }
        aVar.f83195r0.mark(Integer.MAX_VALUE);
        aVar.f83197t0 = (byte[]) bArr.clone();
        return aVar;
    }

    @Override // com.google.crypto.tink.StreamingAead
    public final WritableByteChannel newEncryptingChannel(WritableByteChannel writableByteChannel, byte[] bArr) throws GeneralSecurityException, IOException {
        return this.f83209a.getPrimary().getPrimitive().newEncryptingChannel(writableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public final OutputStream newEncryptingStream(OutputStream outputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        return this.f83209a.getPrimary().getPrimitive().newEncryptingStream(outputStream, bArr);
    }

    @Override // com.google.crypto.tink.StreamingAead
    @RequiresApi(24)
    public final SeekableByteChannel newSeekableDecryptingChannel(SeekableByteChannel seekableByteChannel, byte[] bArr) throws GeneralSecurityException, IOException {
        c cVar = new c();
        cVar.f83203p0 = null;
        cVar.f83204q0 = null;
        cVar.f83208u0 = new ArrayDeque();
        Iterator<PrimitiveSet.Entry<StreamingAead>> it = this.f83209a.getRawPrimitives().iterator();
        while (it.hasNext()) {
            cVar.f83208u0.add(it.next().getPrimitive());
        }
        cVar.f83205r0 = seekableByteChannel;
        cVar.f83206s0 = -1L;
        cVar.f83207t0 = seekableByteChannel.position();
        cVar.v0 = (byte[]) bArr.clone();
        return cVar;
    }
}
