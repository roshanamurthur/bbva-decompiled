package kotlin.collections;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UArraySorting.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/UByteArray;", "array", "", "fromIndex", "toIndex", "", "sortArray-4UcCI2c", "([BII)V", "sortArray", "Lkotlin/UShortArray;", "sortArray-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "sortArray-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "sortArray--nroSd4", "([JII)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    public static final void a(long[] jArr, int i10, int i11) {
        long j10;
        long jM5608getsVKNKU = ULongArray.m5608getsVKNKU(jArr, (i10 + i11) / 2);
        int i12 = i10;
        int i13 = i11;
        while (i12 <= i13) {
            while (true) {
                j10 = jM5608getsVKNKU ^ Long.MIN_VALUE;
                if (Long.compare(ULongArray.m5608getsVKNKU(jArr, i12) ^ Long.MIN_VALUE, j10) >= 0) {
                    break;
                } else {
                    i12++;
                }
            }
            while (Long.compare(ULongArray.m5608getsVKNKU(jArr, i13) ^ Long.MIN_VALUE, j10) > 0) {
                i13--;
            }
            if (i12 <= i13) {
                long jM5608getsVKNKU2 = ULongArray.m5608getsVKNKU(jArr, i12);
                ULongArray.m5613setk8EXiF4(jArr, i12, ULongArray.m5608getsVKNKU(jArr, i13));
                ULongArray.m5613setk8EXiF4(jArr, i13, jM5608getsVKNKU2);
                i12++;
                i13--;
            }
        }
        int i14 = i12 - 1;
        if (i10 < i14) {
            a(jArr, i10, i14);
        }
        if (i12 < i11) {
            a(jArr, i12, i11);
        }
    }

    @ExperimentalUnsignedTypes
    public static final void b(int i10, int i11, byte[] bArr) {
        int i12;
        byte bM5558getw2LRezQ = UByteArray.m5558getw2LRezQ(bArr, (i10 + i11) / 2);
        int i13 = i10;
        int i14 = i11;
        while (i13 <= i14) {
            while (true) {
                i12 = bM5558getw2LRezQ & 255;
                if (Intrinsics.compare(UByteArray.m5558getw2LRezQ(bArr, i13) & 255, i12) >= 0) {
                    break;
                } else {
                    i13++;
                }
            }
            while (Intrinsics.compare(UByteArray.m5558getw2LRezQ(bArr, i14) & 255, i12) > 0) {
                i14--;
            }
            if (i13 <= i14) {
                byte bM5558getw2LRezQ2 = UByteArray.m5558getw2LRezQ(bArr, i13);
                UByteArray.m5563setVurrAj0(bArr, i13, UByteArray.m5558getw2LRezQ(bArr, i14));
                UByteArray.m5563setVurrAj0(bArr, i14, bM5558getw2LRezQ2);
                i13++;
                i14--;
            }
        }
        int i15 = i13 - 1;
        if (i10 < i15) {
            b(i10, i15, bArr);
        }
        if (i13 < i11) {
            b(i13, i11, bArr);
        }
    }

    @ExperimentalUnsignedTypes
    public static final void c(short[] sArr, int i10, int i11) {
        int i12;
        short sM5633getMh2AYeg = UShortArray.m5633getMh2AYeg(sArr, (i10 + i11) / 2);
        int i13 = i10;
        int i14 = i11;
        while (i13 <= i14) {
            while (true) {
                int iM5633getMh2AYeg = UShortArray.m5633getMh2AYeg(sArr, i13) & UShort.MAX_VALUE;
                i12 = sM5633getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM5633getMh2AYeg, i12) >= 0) {
                    break;
                } else {
                    i13++;
                }
            }
            while (Intrinsics.compare(UShortArray.m5633getMh2AYeg(sArr, i14) & UShort.MAX_VALUE, i12) > 0) {
                i14--;
            }
            if (i13 <= i14) {
                short sM5633getMh2AYeg2 = UShortArray.m5633getMh2AYeg(sArr, i13);
                UShortArray.m5638set01HTLdE(sArr, i13, UShortArray.m5633getMh2AYeg(sArr, i14));
                UShortArray.m5638set01HTLdE(sArr, i14, sM5633getMh2AYeg2);
                i13++;
                i14--;
            }
        }
        int i15 = i13 - 1;
        if (i10 < i15) {
            c(sArr, i10, i15);
        }
        if (i13 < i11) {
            c(sArr, i13, i11);
        }
    }

    @ExperimentalUnsignedTypes
    public static final void d(int i10, int i11, int[] iArr) {
        int i12;
        int iM5583getpVg5ArA = UIntArray.m5583getpVg5ArA(iArr, (i10 + i11) / 2);
        int i13 = i10;
        int i14 = i11;
        while (i13 <= i14) {
            while (true) {
                i12 = iM5583getpVg5ArA ^ Integer.MIN_VALUE;
                if (Integer.compare(UIntArray.m5583getpVg5ArA(iArr, i13) ^ Integer.MIN_VALUE, i12) >= 0) {
                    break;
                } else {
                    i13++;
                }
            }
            while (Integer.compare(UIntArray.m5583getpVg5ArA(iArr, i14) ^ Integer.MIN_VALUE, i12) > 0) {
                i14--;
            }
            if (i13 <= i14) {
                int iM5583getpVg5ArA2 = UIntArray.m5583getpVg5ArA(iArr, i13);
                UIntArray.m5588setVXSXFK8(iArr, i13, UIntArray.m5583getpVg5ArA(iArr, i14));
                UIntArray.m5588setVXSXFK8(iArr, i14, iM5583getpVg5ArA2);
                i13++;
                i14--;
            }
        }
        int i15 = i13 - 1;
        if (i10 < i15) {
            d(i10, i15, iArr);
        }
        if (i13 < i11) {
            d(i13, i11, iArr);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m5664sortArraynroSd4(@NotNull long[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        a(array, i10, i11 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m5665sortArray4UcCI2c(@NotNull byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        b(i10, i11 - 1, array);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m5666sortArrayAa5vz7o(@NotNull short[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        c(array, i10, i11 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m5667sortArrayoBK06Vg(@NotNull int[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        d(i10, i11 - 1, array);
    }
}
