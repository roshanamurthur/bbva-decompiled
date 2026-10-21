package net.lingala.zip4j.crypto;

import java.util.Arrays;
import net.lingala.zip4j.crypto.PBKDF2.MacBasedPRF;
import net.lingala.zip4j.crypto.engine.AESEngine;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.AESExtraDataRecord;
import net.lingala.zip4j.model.enums.AesKeyStrength;

/* JADX INFO: loaded from: classes12.dex */
public class AESDecrypter implements Decrypter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AESEngine f84900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MacBasedPRF f84901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84902c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f84903d = new byte[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f84904e = new byte[16];

    public AESDecrypter(AESExtraDataRecord aESExtraDataRecord, char[] cArr, byte[] bArr, byte[] bArr2) throws ZipException {
        if (cArr == null || cArr.length <= 0) {
            throw new ZipException("empty or null password provided for AES decryption", ZipException.Type.WRONG_PASSWORD);
        }
        AesKeyStrength aesKeyStrength = aESExtraDataRecord.getAesKeyStrength();
        byte[] bArrDerivePasswordBasedKey = AesCipherUtil.derivePasswordBasedKey(bArr, cArr, aesKeyStrength);
        if (!Arrays.equals(bArr2, AesCipherUtil.derivePasswordVerifier(bArrDerivePasswordBasedKey, aesKeyStrength))) {
            throw new ZipException("Wrong Password", ZipException.Type.WRONG_PASSWORD);
        }
        this.f84900a = AesCipherUtil.getAESEngine(bArrDerivePasswordBasedKey, aesKeyStrength);
        this.f84901b = AesCipherUtil.getMacBasedPRF(bArrDerivePasswordBasedKey, aesKeyStrength);
    }

    @Override // net.lingala.zip4j.crypto.Decrypter
    public int decryptData(byte[] bArr, int i10, int i11) throws ZipException {
        int i12 = i10;
        while (true) {
            int i13 = i10 + i11;
            if (i12 >= i13) {
                return i11;
            }
            int i14 = i12 + 16;
            int i15 = i14 <= i13 ? 16 : i13 - i12;
            this.f84901b.update(bArr, i12, i15);
            int i16 = this.f84902c;
            byte[] bArr2 = this.f84903d;
            AesCipherUtil.prepareBuffAESIVBytes(bArr2, i16);
            AESEngine aESEngine = this.f84900a;
            byte[] bArr3 = this.f84904e;
            aESEngine.processBlock(bArr2, bArr3);
            for (int i17 = 0; i17 < i15; i17++) {
                int i18 = i12 + i17;
                bArr[i18] = (byte) (bArr[i18] ^ bArr3[i17]);
            }
            this.f84902c++;
            i12 = i14;
        }
    }

    public byte[] getCalculatedAuthenticationBytes() {
        return this.f84901b.doFinal();
    }
}
