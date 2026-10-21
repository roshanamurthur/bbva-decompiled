package bc.org.bouncycastle.crypto.paddings;

import bc.org.bouncycastle.crypto.InvalidCipherTextException;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.p0;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public class PKCS7Padding implements p0 {
    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.p0
    public int addPadding(byte[] bArr, int i10) {
        byte length = (byte) (bArr.length - i10);
        while (i10 < bArr.length) {
            bArr[i10] = length;
            i10++;
        }
        return length;
    }

    public String getPaddingName() {
        return "PKCS7";
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.p0
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int i10 = bArr[bArr.length - 1] & 255;
        byte b10 = (byte) i10;
        boolean z10 = (i10 > bArr.length) | (i10 == 0);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            z10 |= (bArr.length - i11 <= i10) & (bArr[i11] != b10);
        }
        if (z10) {
            throw new InvalidCipherTextException("pad block corrupted");
        }
        return i10;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.p0
    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
    }
}
