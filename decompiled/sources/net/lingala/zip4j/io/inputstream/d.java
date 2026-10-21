package net.lingala.zip4j.io.inputstream;

import net.lingala.zip4j.crypto.Decrypter;
import net.lingala.zip4j.model.LocalFileHeader;

/* JADX INFO: compiled from: NoCipherInputStream.java */
/* JADX INFO: loaded from: classes12.dex */
public final class d extends b {
    @Override // net.lingala.zip4j.io.inputstream.b
    public final Decrypter b(LocalFileHeader localFileHeader, char[] cArr) {
        return new a();
    }

    /* JADX INFO: compiled from: NoCipherInputStream.java */
    public static class a implements Decrypter {
        @Override // net.lingala.zip4j.crypto.Decrypter
        public final int decryptData(byte[] bArr, int i10, int i11) {
            return i11;
        }
    }
}
