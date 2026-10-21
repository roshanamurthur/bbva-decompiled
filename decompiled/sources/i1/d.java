package i1;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HitTestResult.kt */
/* JADX INFO: loaded from: classes.dex */
@JvmInline
@SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndInLayer\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,341:1\n34#2:342\n62#2:343\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndInLayer\n*L\n320#1:342\n323#1:343\n*E\n"})
public final class d {
    public static final int a(long j10, long j11) {
        boolean z10 = ((int) (j10 & 4294967295L)) != 0;
        if (z10 != (((int) (4294967295L & j11)) != 0)) {
            return z10 ? -1 : 1;
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return (int) Math.signum(Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32)));
    }
}
