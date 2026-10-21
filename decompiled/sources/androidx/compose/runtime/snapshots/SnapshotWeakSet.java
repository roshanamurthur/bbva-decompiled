package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.WeakReference;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: compiled from: SnapshotWeakSet.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0007H\u0086\bJ\u000f\u0010\r\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR0\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f0\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006)"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "", ExifInterface.GPS_DIRECTION_TRUE, "value", "", "add", "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "block", "", "removeIf", "isValid$runtime_release", "()Z", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSize$runtime_release", "()I", "setSize$runtime_release", "(I)V", "size", "", "b", "[I", "getHashes$runtime_release", "()[I", "setHashes$runtime_release", "([I)V", "hashes", "", "Landroidx/compose/runtime/WeakReference;", "c", "[Landroidx/compose/runtime/WeakReference;", "getValues$runtime_release", "()[Landroidx/compose/runtime/WeakReference;", "setValues$runtime_release", "([Landroidx/compose/runtime/WeakReference;)V", "values", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class SnapshotWeakSet<T> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public int[] hashes = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public WeakReference<T>[] values = new WeakReference[16];

    public final boolean add(@NotNull T value) {
        int i10 = this.size;
        int iIdentityHashCode = ActualJvm_jvmKt.identityHashCode(value);
        int i11 = -1;
        if (i10 > 0) {
            int i12 = this.size - 1;
            int i13 = 0;
            while (true) {
                if (i13 <= i12) {
                    int i14 = (i13 + i12) >>> 1;
                    int i15 = this.hashes[i14];
                    if (i15 >= iIdentityHashCode) {
                        if (i15 <= iIdentityHashCode) {
                            WeakReference<T> weakReference = this.values[i14];
                            if (value != (weakReference != null ? weakReference.get() : null)) {
                                int i16 = i14 - 1;
                                while (true) {
                                    if (-1 >= i16 || this.hashes[i16] != iIdentityHashCode) {
                                        int i17 = this.size;
                                        i16 = i14 + 1;
                                        while (true) {
                                            if (i16 >= i17) {
                                                i16 = -(this.size + 1);
                                                break;
                                            }
                                            if (this.hashes[i16] != iIdentityHashCode) {
                                                i16 = -(i16 + 1);
                                                break;
                                            }
                                            WeakReference<T> weakReference2 = this.values[i16];
                                            if ((weakReference2 != null ? weakReference2.get() : null) == value) {
                                                break;
                                            }
                                            i16++;
                                        }
                                    } else {
                                        WeakReference<T> weakReference3 = this.values[i16];
                                        if ((weakReference3 != null ? weakReference3.get() : null) == value) {
                                            break;
                                        }
                                        i16--;
                                    }
                                }
                                i11 = i16;
                                break;
                            }
                            i11 = i14;
                            break;
                        }
                        i12 = i14 - 1;
                    } else {
                        i13 = i14 + 1;
                    }
                } else {
                    i11 = -(i13 + 1);
                    break;
                }
            }
            if (i11 >= 0) {
                return false;
            }
        }
        int i18 = -(i11 + 1);
        WeakReference<T>[] weakReferenceArr = this.values;
        int length = weakReferenceArr.length;
        if (i10 == length) {
            int i19 = length * 2;
            WeakReference<T>[] weakReferenceArr2 = new WeakReference[i19];
            int[] iArr = new int[i19];
            int i20 = i18 + 1;
            ArraysKt___ArraysJvmKt.copyInto(weakReferenceArr, weakReferenceArr2, i20, i18, i10);
            ArraysKt___ArraysJvmKt.copyInto$default(this.values, weakReferenceArr2, 0, 0, i18, 6, (Object) null);
            ArraysKt___ArraysJvmKt.copyInto(this.hashes, iArr, i20, i18, i10);
            ArraysKt___ArraysJvmKt.copyInto$default(this.hashes, iArr, 0, 0, i18, 6, (Object) null);
            this.values = weakReferenceArr2;
            this.hashes = iArr;
        } else {
            int i21 = i18 + 1;
            ArraysKt___ArraysJvmKt.copyInto(weakReferenceArr, weakReferenceArr, i21, i18, i10);
            int[] iArr2 = this.hashes;
            ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr2, i21, i18, i10);
        }
        this.values[i18] = new WeakReference<>(value);
        this.hashes[i18] = iIdentityHashCode;
        this.size++;
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: getHashes$runtime_release, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    /* JADX INFO: renamed from: getSize$runtime_release, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final WeakReference<T>[] getValues$runtime_release() {
        return this.values;
    }

    @TestOnly
    public final boolean isValid$runtime_release() {
        WeakReference<T> weakReference;
        int i10 = this.size;
        WeakReference<T>[] weakReferenceArr = this.values;
        int[] iArr = this.hashes;
        int length = weakReferenceArr.length;
        if (i10 > length) {
            return false;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        while (i12 < i10) {
            int i13 = iArr[i12];
            if (i13 < i11 || (weakReference = weakReferenceArr[i12]) == null) {
                return false;
            }
            T t10 = weakReference.get();
            if (t10 != null && i13 != ActualJvm_jvmKt.identityHashCode(t10)) {
                return false;
            }
            i12++;
            i11 = i13;
        }
        while (i10 < length) {
            if (iArr[i10] != 0 || weakReferenceArr[i10] != null) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public final void removeIf(@NotNull Function1<? super T, Boolean> block) {
        int size = getSize();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            WeakReference<T> weakReference = getValues$runtime_release()[i10];
            T t10 = weakReference != null ? weakReference.get() : null;
            if (t10 != null && !block.invoke(t10).booleanValue()) {
                if (i11 != i10) {
                    getValues$runtime_release()[i11] = weakReference;
                    getHashes()[i11] = getHashes()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < size; i12++) {
            getValues$runtime_release()[i12] = null;
            getHashes()[i12] = 0;
        }
        if (i11 != size) {
            setSize$runtime_release(i11);
        }
    }

    public final void setHashes$runtime_release(@NotNull int[] iArr) {
        this.hashes = iArr;
    }

    public final void setSize$runtime_release(int i10) {
        this.size = i10;
    }

    public final void setValues$runtime_release(@NotNull WeakReference<T>[] weakReferenceArr) {
        this.values = weakReferenceArr;
    }
}
