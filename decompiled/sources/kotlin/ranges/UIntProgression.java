package kotlin.ranges;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.WasExperimental;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UIntRange.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = SvgConstantsKt.VERSION)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0017\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB!\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0086\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001e"}, d2 = {"Lkotlin/ranges/UIntProgression;", "", "Lkotlin/UInt;", "", "iterator", "", "isEmpty", "", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFirst-pVg5ArA", "()I", "first", "q0", "getLast-pVg5ArA", "last", "r0", "getStep", "step", EventDataKeys.Lifecycle.LIFECYCLE_START, "endInclusive", "<init>", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public class UIntProgression implements Iterable<UInt>, KMappedMarker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int first;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final int last;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final int step;

    /* JADX INFO: compiled from: UIntRange.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/ranges/UIntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/UIntProgression;", "rangeStart", "Lkotlin/UInt;", "rangeEnd", "step", "", "fromClosedRange-Nkh28Cs", "(III)Lkotlin/ranges/UIntProgression;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: fromClosedRange-Nkh28Cs, reason: not valid java name */
        public final UIntProgression m5726fromClosedRangeNkh28Cs(int rangeStart, int rangeEnd, int step) {
            return new UIntProgression(rangeStart, rangeEnd, step, null);
        }
    }

    public UIntProgression(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = i10;
        this.last = UProgressionUtilKt.m5714getProgressionLastElementNkh28Cs(i10, i11, i12);
        this.step = i12;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof UIntProgression) {
            if (!isEmpty() || !((UIntProgression) other).isEmpty()) {
                UIntProgression uIntProgression = (UIntProgression) other;
                if (this.first != uIntProgression.first || this.last != uIntProgression.last || this.step != uIntProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: getFirst-pVg5ArA, reason: not valid java name and from getter */
    public final int getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: getLast-pVg5ArA, reason: not valid java name and from getter */
    public final int getLast() {
        return this.last;
    }

    public final int getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }

    public boolean isEmpty() {
        int i10 = this.step;
        int i11 = this.last;
        int i12 = this.first;
        if (i10 > 0) {
            if (Integer.compare(i12 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11) <= 0) {
                return false;
            }
        } else if (Integer.compare(i12 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11) >= 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<UInt> iterator() {
        return new d(this.first, this.last, this.step, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        int i10 = this.last;
        int i11 = this.first;
        int i12 = this.step;
        if (i12 > 0) {
            sb2 = new StringBuilder();
            sb2.append((Object) UInt.m5574toStringimpl(i11));
            sb2.append("..");
            sb2.append((Object) UInt.m5574toStringimpl(i10));
            sb2.append(" step ");
            sb2.append(i12);
        } else {
            sb2 = new StringBuilder();
            sb2.append((Object) UInt.m5574toStringimpl(i11));
            sb2.append(" downTo ");
            sb2.append((Object) UInt.m5574toStringimpl(i10));
            sb2.append(" step ");
            sb2.append(-i12);
        }
        return sb2.toString();
    }
}
