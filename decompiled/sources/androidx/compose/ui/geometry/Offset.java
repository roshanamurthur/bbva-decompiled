package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087@\u0018\u0000 92\u00020\u0001:\u00019B\u0014\b\u0000\u0012\u0006\u00107\u001a\u000206ø\u0001\u0002¢\u0006\u0004\b8\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0006\u0010\u0004J*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0004J\u0019\u0010\u0017\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ!\u0010!\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\"\u0010 J!\u0010%\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010 J\u000f\u0010)\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0010\u0010-\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001a\u0010\b\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u00103\u001a\u0004\b4\u0010\u0004\u0088\u00017\u0092\u0001\u000206ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006:"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "x", "y", "copy-dBAh8RU", "(JFF)J", "copy", "", "isValid-impl", "(J)Z", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "getDistance-impl", "getDistance", "getDistanceSquared-impl", "getDistanceSquared", "unaryMinus-F1C5BW0", "(J)J", "unaryMinus", "other", "minus-MK-Hz9U", "(JJ)J", "minus", "plus-MK-Hz9U", "plus", "operand", "times-tuRUvjQ", "(JF)J", "times", "div-tuRUvjQ", "div", "rem-tuRUvjQ", "rem", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getX-impl", "getX$annotations", "()V", "getY-impl", "getY$annotations", "", "packedValue", "constructor-impl", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,266:1\n34#2:267\n41#2:268\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n70#1:267\n80#1:268\n*E\n"})
public final class Offset {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f15530b = OffsetKt.Offset(0.0f, 0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f15531c = OffsetKt.Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f15532d = OffsetKt.Offset(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15533a;

    public /* synthetic */ Offset(long j10) {
        this.f15533a = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Offset m2264boximpl(long j10) {
        return new Offset(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m2265component1impl(long j10) {
        return m2275getXimpl(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m2266component2impl(long j10) {
        return m2276getYimpl(j10);
    }

    /* JADX INFO: renamed from: copy-dBAh8RU, reason: not valid java name */
    public static final long m2268copydBAh8RU(long j10, float f6, float f10) {
        return OffsetKt.Offset(f6, f10);
    }

    /* JADX INFO: renamed from: copy-dBAh8RU$default, reason: not valid java name */
    public static /* synthetic */ long m2269copydBAh8RU$default(long j10, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = m2275getXimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f10 = m2276getYimpl(j10);
        }
        return m2268copydBAh8RU(j10, f6, f10);
    }

    @Stable
    /* JADX INFO: renamed from: div-tuRUvjQ, reason: not valid java name */
    public static final long m2270divtuRUvjQ(long j10, float f6) {
        return OffsetKt.Offset(m2275getXimpl(j10) / f6, m2276getYimpl(j10) / f6);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2271equalsimpl(long j10, Object obj) {
        return (obj instanceof Offset) && j10 == ((Offset) obj).getF15533a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2272equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @Stable
    /* JADX INFO: renamed from: getDistance-impl, reason: not valid java name */
    public static final float m2273getDistanceimpl(long j10) {
        return (float) Math.sqrt((m2276getYimpl(j10) * m2276getYimpl(j10)) + (m2275getXimpl(j10) * m2275getXimpl(j10)));
    }

    @Stable
    /* JADX INFO: renamed from: getDistanceSquared-impl, reason: not valid java name */
    public static final float m2274getDistanceSquaredimpl(long j10) {
        return (m2276getYimpl(j10) * m2276getYimpl(j10)) + (m2275getXimpl(j10) * m2275getXimpl(j10));
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final float m2275getXimpl(long j10) {
        if (j10 == f15532d) {
            throw new IllegalStateException("Offset is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final float m2276getYimpl(long j10) {
        if (j10 == f15532d) {
            throw new IllegalStateException("Offset is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2277hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    @Stable
    /* JADX INFO: renamed from: isValid-impl, reason: not valid java name */
    public static final boolean m2278isValidimpl(long j10) {
        if (Float.isNaN(m2275getXimpl(j10)) || Float.isNaN(m2276getYimpl(j10))) {
            throw new IllegalStateException("Offset argument contained a NaN value.".toString());
        }
        return true;
    }

    @Stable
    /* JADX INFO: renamed from: minus-MK-Hz9U, reason: not valid java name */
    public static final long m2279minusMKHz9U(long j10, long j11) {
        return OffsetKt.Offset(m2275getXimpl(j10) - m2275getXimpl(j11), m2276getYimpl(j10) - m2276getYimpl(j11));
    }

    @Stable
    /* JADX INFO: renamed from: plus-MK-Hz9U, reason: not valid java name */
    public static final long m2280plusMKHz9U(long j10, long j11) {
        return OffsetKt.Offset(m2275getXimpl(j11) + m2275getXimpl(j10), m2276getYimpl(j11) + m2276getYimpl(j10));
    }

    @Stable
    /* JADX INFO: renamed from: rem-tuRUvjQ, reason: not valid java name */
    public static final long m2281remtuRUvjQ(long j10, float f6) {
        return OffsetKt.Offset(m2275getXimpl(j10) % f6, m2276getYimpl(j10) % f6);
    }

    @Stable
    /* JADX INFO: renamed from: times-tuRUvjQ, reason: not valid java name */
    public static final long m2282timestuRUvjQ(long j10, float f6) {
        return OffsetKt.Offset(m2275getXimpl(j10) * f6, m2276getYimpl(j10) * f6);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2283toStringimpl(long j10) {
        if (!OffsetKt.m2294isSpecifiedk4lQ0M(j10)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + GeometryUtilsKt.toStringAsFixed(m2275getXimpl(j10), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m2276getYimpl(j10), 1) + RootService.CLOSE_BRACKET;
    }

    @Stable
    /* JADX INFO: renamed from: unaryMinus-F1C5BW0, reason: not valid java name */
    public static final long m2284unaryMinusF1C5BW0(long j10) {
        return OffsetKt.Offset(-m2275getXimpl(j10), -m2276getYimpl(j10));
    }

    public boolean equals(Object obj) {
        return m2271equalsimpl(this.f15533a, obj);
    }

    public int hashCode() {
        return m2277hashCodeimpl(this.f15533a);
    }

    @NotNull
    public String toString() {
        return m2283toStringimpl(this.f15533a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF15533a() {
        return this.f15533a;
    }

    /* JADX INFO: compiled from: Offset.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/geometry/Offset$Companion;", "", "()V", "Infinite", "Landroidx/compose/ui/geometry/Offset;", "getInfinite-F1C5BW0$annotations", "getInfinite-F1C5BW0", "()J", "J", "Unspecified", "getUnspecified-F1C5BW0$annotations", "getUnspecified-F1C5BW0", "Zero", "getZero-F1C5BW0$annotations", "getZero-F1C5BW0", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getInfinite-F1C5BW0, reason: not valid java name */
        public final long m2289getInfiniteF1C5BW0() {
            return Offset.f15531c;
        }

        /* JADX INFO: renamed from: getUnspecified-F1C5BW0, reason: not valid java name */
        public final long m2290getUnspecifiedF1C5BW0() {
            return Offset.f15532d;
        }

        /* JADX INFO: renamed from: getZero-F1C5BW0, reason: not valid java name */
        public final long m2291getZeroF1C5BW0() {
            return Offset.f15530b;
        }

        @Stable
        /* JADX INFO: renamed from: getInfinite-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m2286getInfiniteF1C5BW0$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getUnspecified-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m2287getUnspecifiedF1C5BW0$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getZero-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m2288getZeroF1C5BW0$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m2267constructorimpl(long j10) {
        return j10;
    }
}
