package net.lingala.zip4j.crypto.PBKDF2;

import net.lingala.zip4j.util.Zip4jUtil;

/* JADX INFO: loaded from: classes12.dex */
public class PBKDF2Engine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PBKDF2Parameters f84918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f84919b;

    public PBKDF2Engine(PBKDF2Parameters pBKDF2Parameters) {
        this(pBKDF2Parameters, null);
    }

    public void INT(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 / 16777216);
        bArr[i10 + 1] = (byte) (i11 / 65536);
        bArr[i10 + 2] = (byte) (i11 / 256);
        bArr[i10 + 3] = (byte) i11;
    }

    public byte[] deriveKey(char[] cArr) {
        return deriveKey(cArr, 0);
    }

    public PBKDF2Parameters getParameters() {
        return this.f84918a;
    }

    public a getPseudoRandomFunction() {
        return this.f84919b;
    }

    public void setParameters(PBKDF2Parameters pBKDF2Parameters) {
        this.f84918a = pBKDF2Parameters;
    }

    public void setPseudoRandomFunction(a aVar) {
        this.f84919b = aVar;
    }

    public boolean verifyKey(char[] cArr) {
        byte[] bArrDeriveKey;
        byte[] derivedKey = getParameters().getDerivedKey();
        if (derivedKey == null || derivedKey.length == 0 || (bArrDeriveKey = deriveKey(cArr, derivedKey.length)) == null || bArrDeriveKey.length != derivedKey.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArrDeriveKey.length; i10++) {
            if (bArrDeriveKey[i10] != derivedKey[i10]) {
                return false;
            }
        }
        return true;
    }

    public PBKDF2Engine(PBKDF2Parameters pBKDF2Parameters, a aVar) {
        this.f84918a = pBKDF2Parameters;
        this.f84919b = aVar;
    }

    public byte[] deriveKey(char[] cArr, int i10) {
        PBKDF2Engine pBKDF2Engine = this;
        cArr.getClass();
        byte[] bArrConvertCharArrayToByteArray = Zip4jUtil.convertCharArrayToByteArray(cArr);
        if (pBKDF2Engine.f84919b == null) {
            pBKDF2Engine.f84919b = new MacBasedPRF(pBKDF2Engine.f84918a.getHashAlgorithm());
        }
        pBKDF2Engine.f84919b.init(bArrConvertCharArrayToByteArray);
        int hLen = i10 == 0 ? pBKDF2Engine.f84919b.getHLen() : i10;
        a aVar = pBKDF2Engine.f84919b;
        byte[] salt = pBKDF2Engine.f84918a.getSalt();
        int iterationCount = pBKDF2Engine.f84918a.getIterationCount();
        int i11 = 0;
        if (salt == null) {
            salt = new byte[0];
        }
        int hLen2 = aVar.getHLen();
        int i12 = 1;
        int i13 = (hLen / hLen2) + (hLen % hLen2 > 0 ? 1 : 0);
        int i14 = hLen - ((i13 - 1) * hLen2);
        byte[] bArr = new byte[i13 * hLen2];
        int i15 = 0;
        while (i12 <= i13) {
            int hLen3 = aVar.getHLen();
            byte[] bArr2 = new byte[hLen3];
            byte[] bArrDoFinal = new byte[salt.length + 4];
            System.arraycopy(salt, i11, bArrDoFinal, i11, salt.length);
            pBKDF2Engine.INT(bArrDoFinal, salt.length, i12);
            int i16 = i11;
            while (i16 < iterationCount) {
                bArrDoFinal = aVar.doFinal(bArrDoFinal);
                while (i11 < hLen3) {
                    bArr2[i11] = (byte) (bArr2[i11] ^ bArrDoFinal[i11]);
                    i11++;
                }
                i16++;
                i11 = 0;
            }
            int i17 = i11;
            System.arraycopy(bArr2, i17, bArr, i15, hLen3);
            i15 += hLen2;
            i12++;
            i11 = i17;
            pBKDF2Engine = this;
        }
        int i18 = i11;
        if (i14 >= hLen2) {
            return bArr;
        }
        byte[] bArr3 = new byte[hLen];
        System.arraycopy(bArr, i18, bArr3, i18, hLen);
        return bArr3;
    }
}
