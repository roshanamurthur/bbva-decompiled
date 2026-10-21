package km;

import java.util.Hashtable;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Hashtable f79375a;

    static {
        Hashtable hashtable = new Hashtable();
        f79375a = hashtable;
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA1, Integers.valueOf(128));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA224, Integers.valueOf(192));
        hashtable.put("SHA-256", Integers.valueOf(256));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA384, Integers.valueOf(256));
        hashtable.put("SHA-512", Integers.valueOf(256));
        hashtable.put("SHA-512/224", Integers.valueOf(192));
        hashtable.put(SPHINCSKeyParameters.SHA512_256, Integers.valueOf(256));
    }

    public static byte[] a(Digest digest, int i10, byte[] bArr) {
        int i11 = (i10 + 7) / 8;
        byte[] bArr2 = new byte[i11];
        int digestSize = i11 / digest.getDigestSize();
        int digestSize2 = digest.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        int i12 = 1;
        int i13 = 0;
        for (int i14 = 0; i14 <= digestSize; i14++) {
            digest.update((byte) i12);
            digest.update((byte) (i10 >> 24));
            digest.update((byte) (i10 >> 16));
            digest.update((byte) (i10 >> 8));
            digest.update((byte) i10);
            digest.update(bArr, 0, bArr.length);
            digest.doFinal(bArr3, 0);
            int i15 = i14 * digestSize2;
            int i16 = i11 - i15;
            if (i16 > digestSize2) {
                i16 = digestSize2;
            }
            System.arraycopy(bArr3, 0, bArr2, i15, i16);
            i12++;
        }
        int i17 = i10 % 8;
        if (i17 != 0) {
            int i18 = 8 - i17;
            int i19 = 0;
            while (i13 != i11) {
                int i20 = bArr2[i13] & 255;
                bArr2[i13] = (byte) ((i19 << (8 - i18)) | (i20 >>> i18));
                i13++;
                i19 = i20;
            }
        }
        return bArr2;
    }
}
