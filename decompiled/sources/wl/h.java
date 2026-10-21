package wl;

import java.io.IOException;
import net.lingala.zip4j.crypto.Encrypter;
import net.lingala.zip4j.crypto.StandardEncrypter;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jUtil;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: ZipStandardCipherOutputStream.java */
/* JADX INFO: loaded from: classes12.dex */
public final class h extends b<StandardEncrypter> {
    @Override // wl.b
    public final Encrypter c(ZipParameters zipParameters, char[] cArr) throws IOException {
        StandardEncrypter standardEncrypter = new StandardEncrypter(cArr, zipParameters.isWriteExtendedLocalFileHeader() ? (Zip4jUtil.epochToExtendedDosTime(zipParameters.getLastModifiedFileTime()) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16 : zipParameters.getEntryCRC());
        byte[] headerBytes = standardEncrypter.getHeaderBytes();
        g gVar = this.f94287p0;
        gVar.getClass();
        gVar.write(headerBytes, 0, headerBytes.length);
        return standardEncrypter;
    }

    @Override // wl.b, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        super.write(bArr, 0, bArr.length);
    }

    @Override // wl.b, java.io.OutputStream
    public final void write(int i10) throws IOException {
        super.write(new byte[]{(byte) i10}, 0, 1);
    }

    @Override // wl.b, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        super.write(bArr, i10, i11);
    }
}
