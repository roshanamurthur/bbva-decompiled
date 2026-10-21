package af;

import com.google.android.play.core.splitinstall.internal.f;
import com.google.android.play.core.splitinstall.internal.zzan;
import java.io.File;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Set;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements zzan {
    public static BigInteger a(BigInteger bigInteger, SecureRandom secureRandom) {
        int iBitLength = bigInteger.bitLength();
        while (true) {
            BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(iBitLength, secureRandom);
            if (!bigIntegerCreateRandomBigInteger.equals(ECConstants.ZERO) && bigIntegerCreateRandomBigInteger.compareTo(bigInteger) < 0) {
                return bigIntegerCreateRandomBigInteger;
            }
        }
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public void zza(ClassLoader classLoader, Set set) {
        d.b(classLoader, set, new c());
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public boolean zzb(ClassLoader classLoader, File file, File file2, boolean z10) {
        return f.a(classLoader, file, file2, z10, new b(), "zip", new a());
    }
}
