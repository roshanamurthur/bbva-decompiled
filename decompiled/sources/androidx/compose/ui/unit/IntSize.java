package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u0000 #2\u00020\u0001:\u0001#B\u0014\b\u0000\u0012\u0006\u0010 \u001a\u00020\u001fø\u0001\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0006\u0010\u0004J!\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0004J\u001a\u0010\u0017\u001a\u00020\u00142\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u0004\u0088\u0001 \u0092\u0001\u00020\u001fø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "", "", "component1-impl", "(J)I", "component1", "component2-impl", "component2", "other", "times-YEO4UFw", "(JI)J", "times", "div-YEO4UFw", "div", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", GenerateActivationFormCommand.HASH_CODE, "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getWidth-impl", "getWidth$annotations", "()V", "width", "getHeight-impl", "getHeight$annotations", "height", "", "packedValue", "constructor-impl", "(J)J", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,111:1\n55#2:112\n62#2:113\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n46#1:112\n53#1:113\n*E\n"})
public final class IntSize {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f18318b = m4544constructorimpl(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18319a;

    /* JADX INFO: compiled from: IntSize.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/ui/unit/IntSize$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/IntSize;", "getZero-YbymL2g", "()J", "J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getZero-YbymL2g, reason: not valid java name */
        public final long m4554getZeroYbymL2g() {
            return IntSize.f18318b;
        }
    }

    public /* synthetic */ IntSize(long j10) {
        this.f18319a = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntSize m4541boximpl(long j10) {
        return new IntSize(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m4542component1impl(long j10) {
        return m4549getWidthimpl(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m4543component2impl(long j10) {
        return m4548getHeightimpl(j10);
    }

    @Stable
    /* JADX INFO: renamed from: div-YEO4UFw, reason: not valid java name */
    public static final long m4545divYEO4UFw(long j10, int i10) {
        return IntSizeKt.IntSize(m4549getWidthimpl(j10) / i10, m4548getHeightimpl(j10) / i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4546equalsimpl(long j10, Object obj) {
        return (obj instanceof IntSize) && j10 == ((IntSize) obj).getF18319a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4547equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getHeight-impl, reason: not valid java name */
    public static final int m4548getHeightimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* JADX INFO: renamed from: getWidth-impl, reason: not valid java name */
    public static final int m4549getWidthimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4550hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    @Stable
    /* JADX INFO: renamed from: times-YEO4UFw, reason: not valid java name */
    public static final long m4551timesYEO4UFw(long j10, int i10) {
        return IntSizeKt.IntSize(m4549getWidthimpl(j10) * i10, m4548getHeightimpl(j10) * i10);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4552toStringimpl(long j10) {
        return m4549getWidthimpl(j10) + " x " + m4548getHeightimpl(j10);
    }

    public boolean equals(Object obj) {
        return m4546equalsimpl(this.f18319a, obj);
    }

    public int hashCode() {
        return m4550hashCodeimpl(this.f18319a);
    }

    @Stable
    @NotNull
    public String toString() {
        return m4552toStringimpl(this.f18319a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF18319a() {
        return this.f18319a;
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4544constructorimpl(long j10) {
        return j10;
    }
}
