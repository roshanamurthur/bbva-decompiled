package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Dp.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u0000 $2\u00020\u0001:\u0001$B\u0014\b\u0000\u0012\u0006\u0010!\u001a\u00020 ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J'\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0019\u001a\u00020\u00162\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0003\u001a\u00020\u00028FX\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0004\u001a\u00020\u00028FX\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001b\u0088\u0001!\u0092\u0001\u00020 ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/ui/unit/DpOffset;", "", "Landroidx/compose/ui/unit/Dp;", "x", "y", "copy-tPigGR8", "(JFF)J", "copy", "other", "minus-CB-Mgk4", "(JJ)J", "minus", "plus-CB-Mgk4", "plus", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getX-D9Ej5fM", "(J)F", "getX-D9Ej5fM$annotations", "()V", "getY-D9Ej5fM", "getY-D9Ej5fM$annotations", "", "packedValue", "constructor-impl", "(J)J", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n34#2:558\n41#2:560\n174#3:559\n174#3:561\n337#3:564\n154#3:565\n58#4:562\n51#4:563\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n*L\n273#1:558\n286#1:560\n273#1:559\n286#1:561\n311#1:564\n321#1:565\n300#1:562\n307#1:563\n*E\n"})
public final class DpOffset {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f18301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f18302c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18303a;

    /* JADX INFO: compiled from: Dp.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/unit/DpOffset$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpOffset;", "getUnspecified-RKDOV3M", "()J", "J", "Zero", "getZero-RKDOV3M", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m4459getUnspecifiedRKDOV3M() {
            return DpOffset.f18302c;
        }

        /* JADX INFO: renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m4460getZeroRKDOV3M() {
            return DpOffset.f18301b;
        }
    }

    static {
        float f6 = 0;
        f18301b = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f6), Dp.m4389constructorimpl(f6));
        Dp.Companion companion = Dp.INSTANCE;
        f18302c = DpKt.m4410DpOffsetYgX7TsA(companion.m4409getUnspecifiedD9Ej5fM(), companion.m4409getUnspecifiedD9Ej5fM());
    }

    public /* synthetic */ DpOffset(long j10) {
        this.f18303a = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpOffset m4444boximpl(long j10) {
        return new DpOffset(j10);
    }

    /* JADX INFO: renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m4446copytPigGR8(long j10, float f6, float f10) {
        return DpKt.m4410DpOffsetYgX7TsA(f6, f10);
    }

    /* JADX INFO: renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m4447copytPigGR8$default(long j10, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = m4450getXD9Ej5fM(j10);
        }
        if ((i10 & 2) != 0) {
            f10 = m4452getYD9Ej5fM(j10);
        }
        return m4446copytPigGR8(j10, f6, f10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4448equalsimpl(long j10, Object obj) {
        return (obj instanceof DpOffset) && j10 == ((DpOffset) obj).getF18303a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4449equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m4450getXD9Ej5fM(long j10) {
        if (j10 == f18302c) {
            throw new IllegalStateException("DpOffset is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Dp.m4389constructorimpl(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    /* JADX INFO: renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m4452getYD9Ej5fM(long j10) {
        if (j10 == f18302c) {
            throw new IllegalStateException("DpOffset is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Dp.m4389constructorimpl(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4454hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    @Stable
    /* JADX INFO: renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m4455minusCBMgk4(long j10, long j11) {
        return DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(m4450getXD9Ej5fM(j10) - m4450getXD9Ej5fM(j11)), Dp.m4389constructorimpl(m4452getYD9Ej5fM(j10) - m4452getYD9Ej5fM(j11)));
    }

    @Stable
    /* JADX INFO: renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m4456plusCBMgk4(long j10, long j11) {
        return DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(m4450getXD9Ej5fM(j11) + m4450getXD9Ej5fM(j10)), Dp.m4389constructorimpl(m4452getYD9Ej5fM(j11) + m4452getYD9Ej5fM(j10)));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4457toStringimpl(long j10) {
        if (j10 == INSTANCE.m4459getUnspecifiedRKDOV3M()) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) Dp.m4400toStringimpl(m4450getXD9Ej5fM(j10))) + ", " + ((Object) Dp.m4400toStringimpl(m4452getYD9Ej5fM(j10))) + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m4448equalsimpl(this.f18303a, obj);
    }

    public int hashCode() {
        return m4454hashCodeimpl(this.f18303a);
    }

    @Stable
    @NotNull
    public String toString() {
        return m4457toStringimpl(this.f18303a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF18303a() {
        return this.f18303a;
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4451getXD9Ej5fM$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4453getYD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4445constructorimpl(long j10) {
        return j10;
    }
}
