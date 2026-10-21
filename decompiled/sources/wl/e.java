package wl;

import java.io.IOException;
import net.lingala.zip4j.crypto.Encrypter;
import net.lingala.zip4j.model.ZipParameters;

/* JADX INFO: compiled from: NoCipherOutputStream.java */
/* JADX INFO: loaded from: classes12.dex */
public final class e extends b<a> {

    /* JADX INFO: compiled from: NoCipherOutputStream.java */
    public static class a implements Encrypter {
        @Override // net.lingala.zip4j.crypto.Encrypter
        public final int encryptData(byte[] bArr, int i10, int i11) {
            return i11;
        }

        @Override // net.lingala.zip4j.crypto.Encrypter
        public final int encryptData(byte[] bArr) {
            return bArr.length;
        }
    }

    @Override // wl.b
    public final Encrypter c(ZipParameters zipParameters, char[] cArr) throws IOException {
        return new a();
    }
}
