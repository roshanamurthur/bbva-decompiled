package androidx.compose.ui.geometry;

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

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u0000 22\u00020\u0001:\u00012B\u0014\b\u0000\u0012\u0006\u0010/\u001a\u00020.ø\u0001\u0002¢\u0006\u0004\b0\u00101J\u0010\u0010\u0005\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0006\u0010\u0004J*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\"\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u0004R\u001a\u0010*\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010\u0004R\u001a\u0010-\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010%\u001a\u0004\b+\u0010\u0004\u0088\u0001/\u0092\u0001\u00020.ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00063"}, d2 = {"Landroidx/compose/ui/geometry/Size;", "", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "width", "height", "copy-xjbvk4A", "(JFF)J", "copy", "", "isEmpty-impl", "(J)Z", "isEmpty", "operand", "times-7Ah8Wj8", "(JF)J", "times", "div-7Ah8Wj8", "div", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "other", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getWidth-impl", "getWidth$annotations", "()V", "getHeight-impl", "getHeight$annotations", "getMinDimension-impl", "getMinDimension$annotations", "minDimension", "getMaxDimension-impl", "getMaxDimension$annotations", "maxDimension", "", "packedValue", "constructor-impl", "(J)J", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,225:1\n34#2:226\n41#2:227\n152#3:228\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n51#1:226\n61#1:227\n138#1:228\n*E\n"})
public final class Size {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f15549b = SizeKt.Size(0.0f, 0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f15550c = SizeKt.Size(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15551a;

    public /* synthetic */ Size(long j10) {
        this.f15551a = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Size m2332boximpl(long j10) {
        return new Size(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m2333component1impl(long j10) {
        return m2344getWidthimpl(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m2334component2impl(long j10) {
        return m2341getHeightimpl(j10);
    }

    /* JADX INFO: renamed from: copy-xjbvk4A, reason: not valid java name */
    public static final long m2336copyxjbvk4A(long j10, float f6, float f10) {
        return SizeKt.Size(f6, f10);
    }

    /* JADX INFO: renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static /* synthetic */ long m2337copyxjbvk4A$default(long j10, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = m2344getWidthimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f10 = m2341getHeightimpl(j10);
        }
        return m2336copyxjbvk4A(j10, f6, f10);
    }

    @Stable
    /* JADX INFO: renamed from: div-7Ah8Wj8, reason: not valid java name */
    public static final long m2338div7Ah8Wj8(long j10, float f6) {
        return SizeKt.Size(m2344getWidthimpl(j10) / f6, m2341getHeightimpl(j10) / f6);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2339equalsimpl(long j10, Object obj) {
        return (obj instanceof Size) && j10 == ((Size) obj).getF15551a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2340equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getHeight-impl, reason: not valid java name */
    public static final float m2341getHeightimpl(long j10) {
        if (j10 == f15550c) {
            throw new IllegalStateException("Size is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m2342getMaxDimensionimpl(long j10) {
        return Math.max(Math.abs(m2344getWidthimpl(j10)), Math.abs(m2341getHeightimpl(j10)));
    }

    /* JADX INFO: renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m2343getMinDimensionimpl(long j10) {
        return Math.min(Math.abs(m2344getWidthimpl(j10)), Math.abs(m2341getHeightimpl(j10)));
    }

    /* JADX INFO: renamed from: getWidth-impl, reason: not valid java name */
    public static final float m2344getWidthimpl(long j10) {
        if (j10 == f15550c) {
            throw new IllegalStateException("Size is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2345hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    @Stable
    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m2346isEmptyimpl(long j10) {
        return m2344getWidthimpl(j10) <= 0.0f || m2341getHeightimpl(j10) <= 0.0f;
    }

    @Stable
    /* JADX INFO: renamed from: times-7Ah8Wj8, reason: not valid java name */
    public static final long m2347times7Ah8Wj8(long j10, float f6) {
        return SizeKt.Size(m2344getWidthimpl(j10) * f6, m2341getHeightimpl(j10) * f6);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2348toStringimpl(long j10) {
        if (j10 == INSTANCE.m2352getUnspecifiedNHjbRc()) {
            return "Size.Unspecified";
        }
        return "Size(" + GeometryUtilsKt.toStringAsFixed(m2344getWidthimpl(j10), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m2341getHeightimpl(j10), 1) + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m2339equalsimpl(this.f15551a, obj);
    }

    public int hashCode() {
        return m2345hashCodeimpl(this.f15551a);
    }

    @NotNull
    public String toString() {
        return m2348toStringimpl(this.f15551a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF15551a() {
        return this.f15551a;
    }

    /* JADX INFO: compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/geometry/Size$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/geometry/Size;", "getUnspecified-NH-jbRc$annotations", "getUnspecified-NH-jbRc", "()J", "J", "Zero", "getZero-NH-jbRc$annotations", "getZero-NH-jbRc", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getUnspecified-NH-jbRc, reason: not valid java name */
        public final long m2352getUnspecifiedNHjbRc() {
            return Size.f15550c;
        }

        /* JADX INFO: renamed from: getZero-NH-jbRc, reason: not valid java name */
        public final long m2353getZeroNHjbRc() {
            return Size.f15549b;
        }

        @Stable
        /* JADX INFO: renamed from: getUnspecified-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2350getUnspecifiedNHjbRc$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getZero-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2351getZeroNHjbRc$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    @Stable
    public static /* synthetic */ void getMinDimension$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m2335constructorimpl(long j10) {
        return j10;
    }
}
