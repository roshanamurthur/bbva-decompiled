package androidx.datastore.preferences.protobuf;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import bc.org.bouncycastle.crypto.digests.MD5Digest;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e {
    public static float a(float f6, float f10, float f11, float f12) {
        return ((f6 - f10) * f11) + f12;
    }

    public static int b(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    public static int c(int i10, int i11, int i12, int i13, int i14) {
        return MD5Digest.b(i10 + i11 + i12, i13) + i14;
    }

    public static int d(Number number, Transition.Segment segment, String str, Composer composer, int i10) {
        int iIntValue = number.intValue();
        Intrinsics.checkNotNullParameter(segment, str);
        composer.startReplaceableGroup(i10);
        return iIntValue;
    }

    public static String e(Class cls, StringBuilder sb2, String str) {
        sb2.append(cls.getName());
        sb2.append(str);
        return sb2.toString();
    }

    public static String f(String str, long j10, String str2) {
        return str + j10 + str2;
    }

    public static String g(StringBuilder sb2, Map map, char c10) {
        sb2.append(map);
        sb2.append(c10);
        return sb2.toString();
    }
}
