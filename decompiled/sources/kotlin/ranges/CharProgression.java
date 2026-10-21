package kotlin.ranges;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0016\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB!\b\u0000\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u001a\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lkotlin/ranges/CharProgression;", "", "", "Lkotlin/collections/CharIterator;", "iterator", "", "isEmpty", "", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "p0", "C", "getFirst", "()C", "first", "q0", "getLast", "last", "r0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getStep", "()I", "step", EventDataKeys.Lifecycle.LIFECYCLE_START, "endInclusive", "<init>", "(CCI)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public class CharProgression implements Iterable<Character>, KMappedMarker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final char first;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final char last;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final int step;

    /* JADX INFO: compiled from: Progressions.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lkotlin/ranges/CharProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/CharProgression;", "rangeStart", "", "rangeEnd", "step", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CharProgression fromClosedRange(char rangeStart, char rangeEnd, int step) {
            return new CharProgression(rangeStart, rangeEnd, step);
        }
    }

    public CharProgression(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = c10;
        this.last = (char) ProgressionUtilKt.getProgressionLastElement((int) c10, (int) c11, i10);
        this.step = i10;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof CharProgression) {
            if (!isEmpty() || !((CharProgression) other).isEmpty()) {
                CharProgression charProgression = (CharProgression) other;
                if (this.first != charProgression.first || this.last != charProgression.last || this.step != charProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    public final char getFirst() {
        return this.first;
    }

    public final char getLast() {
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
        char c10 = this.last;
        char c11 = this.first;
        if (i10 > 0) {
            if (Intrinsics.compare((int) c11, (int) c10) <= 0) {
                return false;
            }
        } else if (Intrinsics.compare((int) c11, (int) c10) >= 0) {
            return false;
        }
        return true;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        char c10 = this.last;
        char c11 = this.first;
        int i10 = this.step;
        if (i10 > 0) {
            sb2 = new StringBuilder();
            sb2.append(c11);
            sb2.append("..");
            sb2.append(c10);
            sb2.append(" step ");
            sb2.append(i10);
        } else {
            sb2 = new StringBuilder();
            sb2.append(c11);
            sb2.append(" downTo ");
            sb2.append(c10);
            sb2.append(" step ");
            sb2.append(-i10);
        }
        return sb2.toString();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Character> iterator() {
        return new CharProgressionIterator(this.first, this.last, this.step);
    }
}
