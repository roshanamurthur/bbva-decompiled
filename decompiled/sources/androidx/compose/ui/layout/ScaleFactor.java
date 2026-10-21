package androidx.compose.ui.layout;

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

/* JADX INFO: compiled from: ScaleFactor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u0000 )2\u00020\u0001:\u0001)B\u0014\b\u0000\u0012\u0006\u0010&\u001a\u00020%ø\u0001\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0006\u0010\u0004J*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0004\u0088\u0001&\u0092\u0001\u00020%ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/compose/ui/layout/ScaleFactor;", "", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "scaleX", "scaleY", "copy-8GGzs04", "(JFF)J", "copy", "operand", "times-44nBxM0", "(JF)J", "times", "div-44nBxM0", "div", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getScaleX-impl", "getScaleX$annotations", "()V", "getScaleY-impl", "getScaleY$annotations", "", "packedValue", "constructor-impl", "(J)J", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,197:1\n34#2:198\n41#2:199\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n*L\n51#1:198\n65#1:199\n*E\n"})
public final class ScaleFactor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f16659b = ScaleFactorKt.ScaleFactor(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16660a;

    public /* synthetic */ ScaleFactor(long j10) {
        this.f16660a = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ScaleFactor m3621boximpl(long j10) {
        return new ScaleFactor(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m3622component1impl(long j10) {
        return m3630getScaleXimpl(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m3623component2impl(long j10) {
        return m3631getScaleYimpl(j10);
    }

    /* JADX INFO: renamed from: copy-8GGzs04, reason: not valid java name */
    public static final long m3625copy8GGzs04(long j10, float f6, float f10) {
        return ScaleFactorKt.ScaleFactor(f6, f10);
    }

    /* JADX INFO: renamed from: copy-8GGzs04$default, reason: not valid java name */
    public static /* synthetic */ long m3626copy8GGzs04$default(long j10, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = m3630getScaleXimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f10 = m3631getScaleYimpl(j10);
        }
        return m3625copy8GGzs04(j10, f6, f10);
    }

    @Stable
    /* JADX INFO: renamed from: div-44nBxM0, reason: not valid java name */
    public static final long m3627div44nBxM0(long j10, float f6) {
        return ScaleFactorKt.ScaleFactor(m3630getScaleXimpl(j10) / f6, m3631getScaleYimpl(j10) / f6);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3628equalsimpl(long j10, Object obj) {
        return (obj instanceof ScaleFactor) && j10 == ((ScaleFactor) obj).getF16660a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3629equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getScaleX-impl, reason: not valid java name */
    public static final float m3630getScaleXimpl(long j10) {
        if (j10 == f16659b) {
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: getScaleY-impl, reason: not valid java name */
    public static final float m3631getScaleYimpl(long j10) {
        if (j10 == f16659b) {
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3632hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    @Stable
    /* JADX INFO: renamed from: times-44nBxM0, reason: not valid java name */
    public static final long m3633times44nBxM0(long j10, float f6) {
        return ScaleFactorKt.ScaleFactor(m3630getScaleXimpl(j10) * f6, m3631getScaleYimpl(j10) * f6);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3634toStringimpl(long j10) {
        return "ScaleFactor(" + ScaleFactorKt.access$roundToTenths(m3630getScaleXimpl(j10)) + ", " + ScaleFactorKt.access$roundToTenths(m3631getScaleYimpl(j10)) + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m3628equalsimpl(this.f16660a, obj);
    }

    public int hashCode() {
        return m3632hashCodeimpl(this.f16660a);
    }

    @NotNull
    public String toString() {
        return m3634toStringimpl(this.f16660a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF16660a() {
        return this.f16660a;
    }

    /* JADX INFO: compiled from: ScaleFactor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/layout/ScaleFactor$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/layout/ScaleFactor;", "getUnspecified-_hLwfpc$annotations", "getUnspecified-_hLwfpc", "()J", "J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getUnspecified-_hLwfpc, reason: not valid java name */
        public final long m3637getUnspecified_hLwfpc() {
            return ScaleFactor.f16659b;
        }

        @Stable
        /* JADX INFO: renamed from: getUnspecified-_hLwfpc$annotations, reason: not valid java name */
        public static /* synthetic */ void m3636getUnspecified_hLwfpc$annotations() {
        }
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getScaleX$annotations() {
    }

    @Stable
    public static /* synthetic */ void getScaleY$annotations() {
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3624constructorimpl(long j10) {
        return j10;
    }
}
