package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextRange.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u0000 *2\u00020\u0001:\u0001*B\u0014\b\u0000\u0012\u0006\u0010'\u001a\u00020&ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\u001b\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u001c\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u001e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010%\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0012\u0088\u0001'\u0092\u0001\u00020&ø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/compose/ui/text/TextRange;", "", "other", "", "intersects-5zc-tL8", "(JJ)Z", "intersects", "contains-5zc-tL8", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", TypedValues.CycleType.S_WAVE_OFFSET, "contains-impl", "(JI)Z", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getStart-impl", EventDataKeys.Lifecycle.LIFECYCLE_START, "getEnd-impl", "end", "getMin-impl", "min", "getMax-impl", VDVideoSelfieConfiguration.MAX, "getCollapsed-impl", "(J)Z", "collapsed", "getReversed-impl", "reversed", "getLength-impl", "length", "", "packedValue", "constructor-impl", "(J)J", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,128:1\n55#2:129\n62#2:130\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n*L\n48#1:129\n50#1:130\n*E\n"})
public final class TextRange {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f17767b = TextRangeKt.TextRange(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17768a;

    /* JADX INFO: compiled from: TextRange.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/TextRange$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/text/TextRange;", "getZero-d9O1mEE", "()J", "J", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m3972getZerod9O1mEE() {
            return TextRange.f17767b;
        }
    }

    public /* synthetic */ TextRange(long j10) {
        this.f17768a = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextRange m3955boximpl(long j10) {
        return new TextRange(j10);
    }

    /* JADX INFO: renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m3957contains5zctL8(long j10, long j11) {
        return m3965getMinimpl(j10) <= m3965getMinimpl(j11) && m3964getMaximpl(j11) <= m3964getMaximpl(j10);
    }

    /* JADX INFO: renamed from: contains-impl, reason: not valid java name */
    public static final boolean m3958containsimpl(long j10, int i10) {
        return i10 < m3964getMaximpl(j10) && m3965getMinimpl(j10) <= i10;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3959equalsimpl(long j10, Object obj) {
        return (obj instanceof TextRange) && j10 == ((TextRange) obj).getF17768a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3960equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m3961getCollapsedimpl(long j10) {
        return m3967getStartimpl(j10) == m3962getEndimpl(j10);
    }

    /* JADX INFO: renamed from: getEnd-impl, reason: not valid java name */
    public static final int m3962getEndimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* JADX INFO: renamed from: getLength-impl, reason: not valid java name */
    public static final int m3963getLengthimpl(long j10) {
        return m3964getMaximpl(j10) - m3965getMinimpl(j10);
    }

    /* JADX INFO: renamed from: getMax-impl, reason: not valid java name */
    public static final int m3964getMaximpl(long j10) {
        return m3967getStartimpl(j10) > m3962getEndimpl(j10) ? m3967getStartimpl(j10) : m3962getEndimpl(j10);
    }

    /* JADX INFO: renamed from: getMin-impl, reason: not valid java name */
    public static final int m3965getMinimpl(long j10) {
        return m3967getStartimpl(j10) > m3962getEndimpl(j10) ? m3962getEndimpl(j10) : m3967getStartimpl(j10);
    }

    /* JADX INFO: renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m3966getReversedimpl(long j10) {
        return m3967getStartimpl(j10) > m3962getEndimpl(j10);
    }

    /* JADX INFO: renamed from: getStart-impl, reason: not valid java name */
    public static final int m3967getStartimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3968hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m3969intersects5zctL8(long j10, long j11) {
        return m3965getMinimpl(j10) < m3964getMaximpl(j11) && m3965getMinimpl(j11) < m3964getMaximpl(j10);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3970toStringimpl(long j10) {
        return "TextRange(" + m3967getStartimpl(j10) + ", " + m3962getEndimpl(j10) + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m3959equalsimpl(this.f17768a, obj);
    }

    public int hashCode() {
        return m3968hashCodeimpl(this.f17768a);
    }

    @NotNull
    public String toString() {
        return m3970toStringimpl(this.f17768a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF17768a() {
        return this.f17768a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3956constructorimpl(long j10) {
        return j10;
    }
}
