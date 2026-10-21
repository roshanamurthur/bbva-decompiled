package androidx.compose.runtime.snapshots;

import androidx.appcompat.widget.o1;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: compiled from: SnapshotDoubleIndexHeap.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\n\u001a\u00020\bH\u0007J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007R$\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "", "default", "lowestOrDefault", "value", "add", "handle", "", RemoveCommand.ID, "validate", "validateHandle", "<set-?>", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSize", "()I", "size", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class SnapshotDoubleIndexHeap {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public int[] f15274b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public int[] f15275c = new int[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public int[] f15276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15277e;

    public SnapshotDoubleIndexHeap() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.f15276d = iArr;
    }

    public static /* synthetic */ int lowestOrDefault$default(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return snapshotDoubleIndexHeap.lowestOrDefault(i10);
    }

    public final void a(int i10, int i11) {
        int[] iArr = this.f15274b;
        int[] iArr2 = this.f15275c;
        int[] iArr3 = this.f15276d;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = iArr2[i10];
        iArr2[i10] = iArr2[i11];
        iArr2[i11] = i13;
        iArr3[iArr2[i10]] = i10;
        iArr3[iArr2[i11]] = i11;
    }

    public final int add(int value) {
        int i10 = this.size + 1;
        int[] iArr = this.f15274b;
        int length = iArr.length;
        if (i10 > length) {
            int i11 = length * 2;
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            ArraysKt___ArraysJvmKt.copyInto$default(iArr, iArr2, 0, 0, 0, 14, (Object) null);
            ArraysKt___ArraysJvmKt.copyInto$default(this.f15275c, iArr3, 0, 0, 0, 14, (Object) null);
            this.f15274b = iArr2;
            this.f15275c = iArr3;
        }
        int i12 = this.size;
        this.size = i12 + 1;
        int length2 = this.f15276d.length;
        if (this.f15277e >= length2) {
            int i13 = length2 * 2;
            int[] iArr4 = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                iArr4[i14] = i15;
                i14 = i15;
            }
            ArraysKt___ArraysJvmKt.copyInto$default(this.f15276d, iArr4, 0, 0, 0, 14, (Object) null);
            this.f15276d = iArr4;
        }
        int i16 = this.f15277e;
        int[] iArr5 = this.f15276d;
        this.f15277e = iArr5[i16];
        int[] iArr6 = this.f15274b;
        iArr6[i12] = value;
        this.f15275c[i12] = i16;
        iArr5[i16] = i12;
        int i17 = iArr6[i12];
        while (i12 > 0) {
            int i18 = ((i12 + 1) >> 1) - 1;
            if (iArr6[i18] <= i17) {
                break;
            }
            a(i18, i12);
            i12 = i18;
        }
        return i16;
    }

    public final int getSize() {
        return this.size;
    }

    public final int lowestOrDefault(int i10) {
        return this.size > 0 ? this.f15274b[0] : i10;
    }

    public final void remove(int handle) {
        int i10;
        int i11 = this.f15276d[handle];
        a(i11, this.size - 1);
        this.size--;
        int[] iArr = this.f15274b;
        int i12 = iArr[i11];
        int i13 = i11;
        while (i13 > 0) {
            int i14 = ((i13 + 1) >> 1) - 1;
            if (iArr[i14] <= i12) {
                break;
            }
            a(i14, i13);
            i13 = i14;
        }
        int[] iArr2 = this.f15274b;
        int i15 = this.size >> 1;
        while (i11 < i15) {
            int i16 = (i11 + 1) << 1;
            int i17 = i16 - 1;
            if (i16 < this.size && (i10 = iArr2[i16]) < iArr2[i17]) {
                if (i10 >= iArr2[i11]) {
                    break;
                }
                a(i16, i11);
                i11 = i16;
            } else {
                if (iArr2[i17] >= iArr2[i11]) {
                    break;
                }
                a(i17, i11);
                i11 = i17;
            }
        }
        this.f15276d[handle] = this.f15277e;
        this.f15277e = handle;
    }

    @TestOnly
    public final void validate() {
        int i10 = this.size;
        int i11 = 1;
        while (i11 < i10) {
            int i12 = i11 + 1;
            int[] iArr = this.f15274b;
            if (iArr[(i12 >> 1) - 1] > iArr[i11]) {
                throw new IllegalStateException(("Index " + i11 + " is out of place").toString());
            }
            i11 = i12;
        }
    }

    @TestOnly
    public final void validateHandle(int handle, int value) {
        int i10 = this.f15276d[handle];
        if (this.f15275c[i10] != handle) {
            throw new IllegalStateException(("Index for handle " + handle + " is corrupted").toString());
        }
        if (this.f15274b[i10] == value) {
            return;
        }
        StringBuilder sbC = o1.c("Value for handle ", handle, " was ");
        sbC.append(this.f15274b[i10]);
        sbC.append(" but was supposed to be ");
        sbC.append(value);
        throw new IllegalStateException(sbC.toString().toString());
    }
}
