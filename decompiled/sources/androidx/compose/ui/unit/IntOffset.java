package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.databinding.f;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import mk.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntOffset.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087@\u0018\u0000 22\u00020\u0001:\u00012B\u0014\b\u0000\u0012\u0006\u00100\u001a\u00020/ø\u0001\u0002¢\u0006\u0004\b1\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0006\u0010\u0004J*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0015\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u0019J!\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010#\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010\"J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0004J\u001a\u0010)\u001a\u00020&2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\b\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u0004\u0088\u00010\u0092\u0001\u00020/ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00063"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "", "", "component1-impl", "(J)I", "component1", "component2-impl", "component2", "x", "y", "copy-iSbpLlY", "(JII)J", "copy", "other", "minus-qkQi6aY", "(JJ)J", "minus", "plus-qkQi6aY", "plus", "unaryMinus-nOcc-ac", "(J)J", "unaryMinus", "", "operand", "times-Bjo55l4", "(JF)J", "times", "div-Bjo55l4", "div", "rem-Bjo55l4", "(JI)J", "rem", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", GenerateActivationFormCommand.HASH_CODE, "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getX-impl", "getX$annotations", "()V", "getY-impl", "getY$annotations", "", "packedValue", "constructor-impl", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,179:1\n55#2:180\n62#2:181\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n53#1:180\n60#1:181\n*E\n"})
public final class IntOffset {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f18311b = IntOffsetKt.IntOffset(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18312a;

    /* JADX INFO: compiled from: IntOffset.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/ui/unit/IntOffset$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/IntOffset;", "getZero-nOcc-ac", "()J", "J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m4517getZeronOccac() {
            return IntOffset.f18311b;
        }
    }

    public /* synthetic */ IntOffset(long j10) {
        this.f18312a = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntOffset m4498boximpl(long j10) {
        return new IntOffset(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m4499component1impl(long j10) {
        return m4507getXimpl(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m4500component2impl(long j10) {
        return m4508getYimpl(j10);
    }

    /* JADX INFO: renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m4502copyiSbpLlY(long j10, int i10, int i11) {
        return IntOffsetKt.IntOffset(i10, i11);
    }

    /* JADX INFO: renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m4503copyiSbpLlY$default(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = m4507getXimpl(j10);
        }
        if ((i12 & 2) != 0) {
            i11 = m4508getYimpl(j10);
        }
        return m4502copyiSbpLlY(j10, i10, i11);
    }

    @Stable
    /* JADX INFO: renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m4504divBjo55l4(long j10, float f6) {
        return IntOffsetKt.IntOffset(c.roundToInt(m4507getXimpl(j10) / f6), c.roundToInt(m4508getYimpl(j10) / f6));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4505equalsimpl(long j10, Object obj) {
        return (obj instanceof IntOffset) && j10 == ((IntOffset) obj).getF18312a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4506equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final int m4507getXimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final int m4508getYimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4509hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    @Stable
    /* JADX INFO: renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m4510minusqkQi6aY(long j10, long j11) {
        return IntOffsetKt.IntOffset(m4507getXimpl(j10) - m4507getXimpl(j11), m4508getYimpl(j10) - m4508getYimpl(j11));
    }

    @Stable
    /* JADX INFO: renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m4511plusqkQi6aY(long j10, long j11) {
        return f.b(j11, m4508getYimpl(j10), m4507getXimpl(j11) + m4507getXimpl(j10));
    }

    @Stable
    /* JADX INFO: renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m4512remBjo55l4(long j10, int i10) {
        return IntOffsetKt.IntOffset(m4507getXimpl(j10) % i10, m4508getYimpl(j10) % i10);
    }

    @Stable
    /* JADX INFO: renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m4513timesBjo55l4(long j10, float f6) {
        return IntOffsetKt.IntOffset(c.roundToInt(m4507getXimpl(j10) * f6), c.roundToInt(m4508getYimpl(j10) * f6));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4514toStringimpl(long j10) {
        return "(" + m4507getXimpl(j10) + ", " + m4508getYimpl(j10) + RootService.CLOSE_BRACKET;
    }

    @Stable
    /* JADX INFO: renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m4515unaryMinusnOccac(long j10) {
        return IntOffsetKt.IntOffset(-m4507getXimpl(j10), -m4508getYimpl(j10));
    }

    public boolean equals(Object obj) {
        return m4505equalsimpl(this.f18312a, obj);
    }

    public int hashCode() {
        return m4509hashCodeimpl(this.f18312a);
    }

    @Stable
    @NotNull
    public String toString() {
        return m4514toStringimpl(this.f18312a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF18312a() {
        return this.f18312a;
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4501constructorimpl(long j10) {
        return j10;
    }
}
