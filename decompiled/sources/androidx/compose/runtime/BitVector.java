package androidx.compose.runtime;

import androidx.appcompat.app.i;
import androidx.compose.runtime.internal.StabilityInferred;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0011\u0010\u0012\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/BitVector;", "", "", FirebaseAnalytics.Param.INDEX, "", "get", "value", "", SetCommand.ID, "nextSet", "nextClear", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "setRange", "", "toString", "getSize", "()I", "size", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/BitVector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4151:1\n1#2:4152\n*E\n"})
public final class BitVector {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public long[] f14433c;

    public final boolean get(int index) {
        int i10;
        if (index < 0 || index >= getSize()) {
            throw new IllegalStateException(("Index " + index + " out of bound").toString());
        }
        if (index < 64) {
            return ((1 << index) & this.f14431a) != 0;
        }
        if (index < 128) {
            return ((1 << (index - 64)) & this.f14432b) != 0;
        }
        long[] jArr = this.f14433c;
        if (jArr != null && (i10 = (index / 64) - 2) < jArr.length) {
            return ((1 << (index % 64)) & jArr[i10]) != 0;
        }
        return false;
    }

    public final int getSize() {
        long[] jArr = this.f14433c;
        if (jArr != null) {
            return (jArr.length + 2) * 64;
        }
        return 128;
    }

    public final int nextClear(int index) {
        int size = getSize();
        while (index < size) {
            if (!get(index)) {
                return index;
            }
            index++;
        }
        return Integer.MAX_VALUE;
    }

    public final int nextSet(int index) {
        int size = getSize();
        while (index < size) {
            if (get(index)) {
                return index;
            }
            index++;
        }
        return Integer.MAX_VALUE;
    }

    public final void set(int index, boolean value) {
        if (index < 64) {
            long j10 = 1 << index;
            this.f14431a = value ? this.f14431a | j10 : this.f14431a & (~j10);
            return;
        }
        if (index < 128) {
            long j11 = 1 << (index - 64);
            this.f14432b = value ? this.f14432b | j11 : this.f14432b & (~j11);
            return;
        }
        int i10 = index / 64;
        int i11 = i10 - 2;
        long j12 = 1 << (index % 64);
        long[] jArrCopyOf = this.f14433c;
        if (jArrCopyOf == null) {
            jArrCopyOf = new long[i10 - 1];
            this.f14433c = jArrCopyOf;
        }
        if (i11 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10 - 1);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.f14433c = jArrCopyOf;
        }
        long j13 = jArrCopyOf[i11];
        jArrCopyOf[i11] = value ? j12 | j13 : (~j12) & j13;
    }

    public final void setRange(int start, int end) {
        while (start < end) {
            set(start, true);
            start++;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BitVector [");
        int size = getSize();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            if (get(i10)) {
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(i10);
                z10 = false;
            }
        }
        return i.b(sb2, AbstractJsonLexerKt.END_LIST, "StringBuilder().apply(builderAction).toString()");
    }
}
