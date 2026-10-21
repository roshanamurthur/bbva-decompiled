package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes2.dex */
public enum PasswordConverter implements CharToByteConverter {
    ASCII { // from class: org.bouncycastle.crypto.PasswordConverter.a
        @Override // org.bouncycastle.crypto.CharToByteConverter
        public final byte[] convert(char[] cArr) {
            return PBEParametersGenerator.PKCS5PasswordToBytes(cArr);
        }

        @Override // org.bouncycastle.crypto.CharToByteConverter
        public final String getType() {
            return "ASCII";
        }
    },
    UTF8 { // from class: org.bouncycastle.crypto.PasswordConverter.b
        @Override // org.bouncycastle.crypto.CharToByteConverter
        public final byte[] convert(char[] cArr) {
            return PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(cArr);
        }

        @Override // org.bouncycastle.crypto.CharToByteConverter
        public final String getType() {
            return "UTF8";
        }
    },
    PKCS12 { // from class: org.bouncycastle.crypto.PasswordConverter.c
        @Override // org.bouncycastle.crypto.CharToByteConverter
        public final byte[] convert(char[] cArr) {
            return PBEParametersGenerator.PKCS12PasswordToBytes(cArr);
        }

        @Override // org.bouncycastle.crypto.CharToByteConverter
        public final String getType() {
            return "PKCS12";
        }
    };

    PasswordConverter() {
        throw null;
    }
}
