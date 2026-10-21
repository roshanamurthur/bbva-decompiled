package androidx.camera.camera2.internal;

import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import org.bouncycastle.crypto.digests.RIPEMD320Digest;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n1 {
    public static int a(int i10, int i11, int i12, int i13) {
        return RIPEMD320Digest.a(i10 + i11, i12) + i13;
    }

    public static int b(String str, int i10) {
        return String.valueOf(str).length() + i10;
    }

    public static int c(String str, int i10, int i11) {
        return (str.hashCode() + i10) * i11;
    }

    public static long d(long j10, long j11, long j12, long j13, long j14) {
        return (((j10 + j11) + j12) - j13) + j14;
    }

    public static String e(String str, int i10, String str2, int i11) {
        return str + i10 + str2 + i11;
    }

    public static String f(char[] cArr) {
        return new String(cArr).intern();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    public static IntIterator g(int i10, int i11) {
        return new IntRange(i10, i11).iterator();
    }

    public static void h(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, SurfaceCombination surfaceCombination, SurfaceConfig.ConfigType configType2, SurfaceConfig.ConfigSize configSize2) {
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
    }
}
