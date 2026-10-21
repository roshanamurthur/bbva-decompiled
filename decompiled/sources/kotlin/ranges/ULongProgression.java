package kotlin.ranges;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ULongRange.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = SvgConstantsKt.VERSION)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\b\u0017\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB!\b\u0000\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0086\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001f"}, d2 = {"Lkotlin/ranges/ULongProgression;", "", "Lkotlin/ULong;", "", "iterator", "", "isEmpty", "", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "p0", "J", "getFirst-s-VKNKU", "()J", "first", "q0", "getLast-s-VKNKU", "last", "", "r0", "getStep", "step", EventDataKeys.Lifecycle.LIFECYCLE_START, "endInclusive", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public class ULongProgression implements Iterable<ULong>, KMappedMarker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final long first;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final long last;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final long step;

    /* JADX INFO: compiled from: ULongRange.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/ranges/ULongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/ULongProgression;", "rangeStart", "Lkotlin/ULong;", "rangeEnd", "step", "", "fromClosedRange-7ftBX0g", "(JJJ)Lkotlin/ranges/ULongProgression;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: fromClosedRange-7ftBX0g, reason: not valid java name */
        public final ULongProgression m5734fromClosedRange7ftBX0g(long rangeStart, long rangeEnd, long step) {
            return new ULongProgression(rangeStart, rangeEnd, step, null);
        }
    }

    public ULongProgression(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = j10;
        this.last = UProgressionUtilKt.m5713getProgressionLastElement7ftBX0g(j10, j11, j12);
        this.step = j12;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof ULongProgression) {
            if (!isEmpty() || !((ULongProgression) other).isEmpty()) {
                ULongProgression uLongProgression = (ULongProgression) other;
                if (this.first != uLongProgression.first || this.last != uLongProgression.last || this.step != uLongProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: getFirst-s-VKNKU, reason: not valid java name and from getter */
    public final long getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: getLast-s-VKNKU, reason: not valid java name and from getter */
    public final long getLast() {
        return this.last;
    }

    public final long getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = this.first;
        int iM5595constructorimpl = ((int) ULong.m5595constructorimpl(j10 ^ ULong.m5595constructorimpl(j10 >>> 32))) * 31;
        long j11 = this.last;
        int iM5595constructorimpl2 = (iM5595constructorimpl + ((int) ULong.m5595constructorimpl(j11 ^ ULong.m5595constructorimpl(j11 >>> 32)))) * 31;
        long j12 = this.step;
        return iM5595constructorimpl2 + ((int) ((j12 >>> 32) ^ j12));
    }

    public boolean isEmpty() {
        long j10 = this.step;
        long j11 = this.last;
        long j12 = this.first ^ Long.MIN_VALUE;
        long j13 = Long.MIN_VALUE ^ j11;
        if (j10 > 0) {
            if (Long.compare(j12, j13) <= 0) {
                return false;
            }
        } else if (Long.compare(j12, j13) >= 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<ULong> iterator() {
        return new e(this.first, this.last, this.step, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        long j10 = this.step;
        long j11 = this.last;
        long j12 = this.first;
        if (j10 > 0) {
            sb2 = new StringBuilder();
            sb2.append((Object) ULong.m5599toStringimpl(j12));
            sb2.append("..");
            sb2.append((Object) ULong.m5599toStringimpl(j11));
            sb2.append(" step ");
            sb2.append(j10);
        } else {
            sb2 = new StringBuilder();
            sb2.append((Object) ULong.m5599toStringimpl(j12));
            sb2.append(" downTo ");
            sb2.append((Object) ULong.m5599toStringimpl(j11));
            sb2.append(" step ");
            sb2.append(-j10);
        }
        return sb2.toString();
    }
}
