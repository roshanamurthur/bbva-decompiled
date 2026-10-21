package bc.org.bouncycastle.math.ec.custom.sec;

import com.google.android.gms.measurement.internal.zzfr;
import java.util.List;
import org.bouncycastle.crypto.digests.RIPEMD320Digest;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a {
    public static int a(int i10, int i11, int i12, int i13, int i14) {
        return RIPEMD320Digest.a(i10 + i11 + i12, i13) + i14;
    }

    public static long b(long j10, long j11, long j12, long j13, long j14) {
        return ((j10 + j11) - j12) + j13 + j14;
    }

    public static String c(StringBuilder sb2, List list, char c10) {
        sb2.append(list);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String d(StringBuilder sb2, boolean z10, char c10) {
        sb2.append(z10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static void e(zzfr zzfrVar, String str) {
        zzfrVar.zzay().zzd().zza(str);
    }
}
