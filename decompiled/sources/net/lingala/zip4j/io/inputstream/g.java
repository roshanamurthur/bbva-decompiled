package net.lingala.zip4j.io.inputstream;

import java.io.IOException;
import net.lingala.zip4j.crypto.Decrypter;
import net.lingala.zip4j.crypto.StandardDecrypter;
import net.lingala.zip4j.model.LocalFileHeader;

/* JADX INFO: compiled from: ZipStandardCipherInputStream.java */
/* JADX INFO: loaded from: classes12.dex */
public final class g extends b<StandardDecrypter> {
    @Override // net.lingala.zip4j.io.inputstream.b
    public final Decrypter b(LocalFileHeader localFileHeader, char[] cArr) throws IOException {
        long crc = localFileHeader.getCrc();
        long lastModifiedTime = localFileHeader.getLastModifiedTime();
        byte[] bArr = new byte[12];
        c(bArr);
        return new StandardDecrypter(cArr, crc, lastModifiedTime, bArr);
    }
}
