package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u0000 /2\u00020\u0001:\u0001/B\u0014\b\u0000\u0012\u0006\u0010,\u001a\u00020+ø\u0001\u0001¢\u0006\u0004\b-\u0010.J'\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u0010\u001a\u00020\u0002H\u0087\nø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u0002H\u0087\nø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000fJ!\u0010\u0016\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0013H\u0087\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0017H\u0087\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0018J!\u0010\u001a\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0013H\u0087\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0015J!\u0010\u001a\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0017H\u0087\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001e\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010!\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010%\u001a\u00020\"2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R#\u0010\u0003\u001a\u00020\u00028FX\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u000fR#\u0010\u0004\u001a\u00020\u00028FX\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u000f\u0088\u0001,\u0092\u0001\u00020+ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/ui/unit/DpSize;", "", "Landroidx/compose/ui/unit/Dp;", "width", "height", "copy-DwJknco", "(JFF)J", "copy", "other", "minus-e_xh8Ic", "(JJ)J", "minus", "plus-e_xh8Ic", "plus", "component1-D9Ej5fM", "(J)F", "component1", "component2-D9Ej5fM", "component2", "", "times-Gh9hcWk", "(JI)J", "times", "", "(JF)J", "div-Gh9hcWk", "div", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getWidth-D9Ej5fM", "getWidth-D9Ej5fM$annotations", "()V", "getHeight-D9Ej5fM", "getHeight-D9Ej5fM$annotations", "", "packedValue", "constructor-impl", "(J)J", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n34#2:558\n41#2:560\n174#3:559\n174#3:561\n473#3:568\n154#3:569\n58#4:562\n51#4:563\n92#4:564\n88#4:565\n75#4:566\n71#4:567\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n*L\n391#1:558\n404#1:560\n391#1:559\n404#1:561\n447#1:568\n457#1:569\n418#1:562\n425#1:563\n434#1:564\n437#1:565\n440#1:566\n443#1:567\n*E\n"})
public final class DpSize {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f18308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f18309c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18310a;

    /* JADX INFO: compiled from: Dp.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/unit/DpSize$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpSize;", "getUnspecified-MYxV2XQ", "()J", "J", "Zero", "getZero-MYxV2XQ", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m4496getUnspecifiedMYxV2XQ() {
            return DpSize.f18309c;
        }

        /* JADX INFO: renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m4497getZeroMYxV2XQ() {
            return DpSize.f18308b;
        }
    }

    static {
        float f6 = 0;
        f18308b = DpKt.m4411DpSizeYgX7TsA(Dp.m4389constructorimpl(f6), Dp.m4389constructorimpl(f6));
        Dp.Companion companion = Dp.INSTANCE;
        f18309c = DpKt.m4411DpSizeYgX7TsA(companion.m4409getUnspecifiedD9Ej5fM(), companion.m4409getUnspecifiedD9Ej5fM());
    }

    public /* synthetic */ DpSize(long j10) {
        this.f18310a = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m4475boximpl(long j10) {
        return new DpSize(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m4476component1D9Ej5fM(long j10) {
        return m4487getWidthD9Ej5fM(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m4477component2D9Ej5fM(long j10) {
        return m4485getHeightD9Ej5fM(j10);
    }

    /* JADX INFO: renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m4479copyDwJknco(long j10, float f6, float f10) {
        return DpKt.m4411DpSizeYgX7TsA(f6, f10);
    }

    /* JADX INFO: renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m4480copyDwJknco$default(long j10, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = m4487getWidthD9Ej5fM(j10);
        }
        if ((i10 & 2) != 0) {
            f10 = m4485getHeightD9Ej5fM(j10);
        }
        return m4479copyDwJknco(j10, f6, f10);
    }

    @Stable
    /* JADX INFO: renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m4482divGh9hcWk(long j10, int i10) {
        float f6 = i10;
        return DpKt.m4411DpSizeYgX7TsA(Dp.m4389constructorimpl(m4487getWidthD9Ej5fM(j10) / f6), Dp.m4389constructorimpl(m4485getHeightD9Ej5fM(j10) / f6));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4483equalsimpl(long j10, Object obj) {
        return (obj instanceof DpSize) && j10 == ((DpSize) obj).getF18310a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4484equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m4485getHeightD9Ej5fM(long j10) {
        if (j10 == f18309c) {
            throw new IllegalStateException("DpSize is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Dp.m4389constructorimpl(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m4487getWidthD9Ej5fM(long j10) {
        if (j10 == f18309c) {
            throw new IllegalStateException("DpSize is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Dp.m4389constructorimpl(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4489hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    @Stable
    /* JADX INFO: renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m4490minuse_xh8Ic(long j10, long j11) {
        return DpKt.m4411DpSizeYgX7TsA(Dp.m4389constructorimpl(m4487getWidthD9Ej5fM(j10) - m4487getWidthD9Ej5fM(j11)), Dp.m4389constructorimpl(m4485getHeightD9Ej5fM(j10) - m4485getHeightD9Ej5fM(j11)));
    }

    @Stable
    /* JADX INFO: renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m4491pluse_xh8Ic(long j10, long j11) {
        return DpKt.m4411DpSizeYgX7TsA(Dp.m4389constructorimpl(m4487getWidthD9Ej5fM(j11) + m4487getWidthD9Ej5fM(j10)), Dp.m4389constructorimpl(m4485getHeightD9Ej5fM(j11) + m4485getHeightD9Ej5fM(j10)));
    }

    @Stable
    /* JADX INFO: renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m4493timesGh9hcWk(long j10, int i10) {
        float f6 = i10;
        return DpKt.m4411DpSizeYgX7TsA(Dp.m4389constructorimpl(m4487getWidthD9Ej5fM(j10) * f6), Dp.m4389constructorimpl(m4485getHeightD9Ej5fM(j10) * f6));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4494toStringimpl(long j10) {
        if (j10 == INSTANCE.m4496getUnspecifiedMYxV2XQ()) {
            return "DpSize.Unspecified";
        }
        return ((Object) Dp.m4400toStringimpl(m4487getWidthD9Ej5fM(j10))) + " x " + ((Object) Dp.m4400toStringimpl(m4485getHeightD9Ej5fM(j10)));
    }

    public boolean equals(Object obj) {
        return m4483equalsimpl(this.f18310a, obj);
    }

    public int hashCode() {
        return m4489hashCodeimpl(this.f18310a);
    }

    @Stable
    @NotNull
    public String toString() {
        return m4494toStringimpl(this.f18310a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF18310a() {
        return this.f18310a;
    }

    @Stable
    /* JADX INFO: renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m4481divGh9hcWk(long j10, float f6) {
        return DpKt.m4411DpSizeYgX7TsA(Dp.m4389constructorimpl(m4487getWidthD9Ej5fM(j10) / f6), Dp.m4389constructorimpl(m4485getHeightD9Ej5fM(j10) / f6));
    }

    @Stable
    /* JADX INFO: renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m4492timesGh9hcWk(long j10, float f6) {
        return DpKt.m4411DpSizeYgX7TsA(Dp.m4389constructorimpl(m4487getWidthD9Ej5fM(j10) * f6), Dp.m4389constructorimpl(m4485getHeightD9Ej5fM(j10) * f6));
    }

    @Stable
    /* JADX INFO: renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4486getHeightD9Ej5fM$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4488getWidthD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4478constructorimpl(long j10) {
        return j10;
    }
}
