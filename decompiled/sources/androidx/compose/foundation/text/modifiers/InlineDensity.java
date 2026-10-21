package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.Density;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InlineDensity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001c\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016B\u0014\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0018J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0088\u0001\u001a\u0092\u0001\u00020\u001bø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text/modifiers/InlineDensity;", "", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "getDensity-impl", "(J)F", "density", "getFontScale-impl", "fontScale", "constructor-impl", "(FF)J", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)J", "Companion", "packedValue", "", "foundation_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
@SourceDebugExtension({"SMAP\nInlineDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineDensity.kt\nandroidx/compose/foundation/text/modifiers/InlineDensity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,50:1\n25#2,3:51\n34#2:54\n41#2:55\n*S KotlinDebug\n*F\n+ 1 InlineDensity.kt\nandroidx/compose/foundation/text/modifiers/InlineDensity\n*L\n32#1:51,3\n37#1:54\n40#1:55\n*E\n"})
public final class InlineDensity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f6159b = m564constructorimpl(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6160a;

    /* JADX INFO: compiled from: InlineDensity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/modifiers/InlineDensity$Companion;", "", "()V", "Unspecified", "Landroidx/compose/foundation/text/modifiers/InlineDensity;", "getUnspecified-L26CHvs", "()J", "J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getUnspecified-L26CHvs, reason: not valid java name */
        public final long m573getUnspecifiedL26CHvs() {
            return InlineDensity.f6159b;
        }
    }

    public /* synthetic */ InlineDensity(long j10) {
        this.f6160a = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InlineDensity m563boximpl(long j10) {
        return new InlineDensity(j10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m565constructorimpl(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return m564constructorimpl(density.getDensity(), density.getFontScale());
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m566equalsimpl(long j10, Object obj) {
        return (obj instanceof InlineDensity) && j10 == ((InlineDensity) obj).getF6160a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m567equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getDensity-impl, reason: not valid java name */
    public static final float m568getDensityimpl(long j10) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: getFontScale-impl, reason: not valid java name */
    public static final float m569getFontScaleimpl(long j10) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m570hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m571toStringimpl(long j10) {
        return "InlineDensity(density=" + m568getDensityimpl(j10) + ", fontScale=" + m569getFontScaleimpl(j10) + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m566equalsimpl(this.f6160a, obj);
    }

    public int hashCode() {
        return m570hashCodeimpl(this.f6160a);
    }

    @NotNull
    public String toString() {
        return m571toStringimpl(this.f6160a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF6160a() {
        return this.f6160a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m564constructorimpl(float f6, float f10) {
        return (((long) Float.floatToIntBits(f10)) & 4294967295L) | (Float.floatToIntBits(f6) << 32);
    }
}
