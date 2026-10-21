package androidx.collection;

import androidx.annotation.IntRange;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0001J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0001H\u0086\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0011\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0011\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0001J\u0011\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0001H\u0086\u0002J\u0006\u0010\u000e\u001a\u00020\u0006J\b\u0010\u000f\u001a\u00020\u0002H\u0007¨\u0006\u0013"}, d2 = {"Landroidx/collection/MutableIntSet;", "Landroidx/collection/IntSet;", "", "element", "", "add", "", "plusAssign", "", "elements", "addAll", RemoveCommand.ID, "minusAssign", "removeAll", ClearCommand.ID, "trim", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/MutableIntSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 IntSet.kt\nandroidx/collection/IntSet\n+ 6 IntSet.kt\nandroidx/collection/IntSetKt\n*L\n1#1,837:1\n816#1,2:981\n820#1,5:989\n816#1,2:1020\n820#1,5:1028\n816#1,2:1045\n820#1,5:1053\n1#2:838\n1656#3,6:839\n1810#3:858\n1672#3:862\n1603#3:879\n1599#3:882\n1779#3,3:886\n1793#3,3:890\n1717#3:894\n1705#3:896\n1699#3:897\n1712#3:902\n1802#3:904\n1603#3:918\n1599#3:921\n1779#3,3:925\n1793#3,3:929\n1717#3:933\n1705#3:935\n1699#3:936\n1712#3:941\n1802#3:943\n1810#3:965\n1672#3:969\n1656#3,6:983\n1656#3,6:994\n1599#3:1003\n1603#3:1004\n1779#3,3:1005\n1793#3,3:1008\n1717#3:1011\n1705#3:1012\n1699#3:1013\n1712#3:1014\n1802#3:1015\n1666#3:1016\n1645#3:1017\n1664#3:1018\n1645#3:1019\n1656#3,6:1022\n1779#3,3:1033\n1810#3:1036\n1699#3:1037\n1669#3:1038\n1645#3:1039\n1599#3:1043\n1603#3:1044\n1656#3,6:1047\n1656#3,6:1058\n1656#3,6:1064\n13600#4,2:845\n13600#4,2:952\n262#5,4:847\n232#5,7:851\n243#5,3:859\n246#5,2:863\n266#5,2:865\n249#5,6:867\n268#5:873\n442#5:874\n443#5:878\n445#5,2:880\n447#5,3:883\n450#5:889\n451#5:893\n452#5:895\n453#5,4:898\n459#5:903\n460#5,8:905\n442#5:913\n443#5:917\n445#5,2:919\n447#5,3:922\n450#5:928\n451#5:932\n452#5:934\n453#5,4:937\n459#5:942\n460#5,8:944\n262#5,4:954\n232#5,7:958\n243#5,3:966\n246#5,2:970\n266#5,2:972\n249#5,6:974\n268#5:980\n833#6,3:875\n833#6,3:914\n833#6,3:1000\n833#6,3:1040\n*S KotlinDebug\n*F\n+ 1 IntSet.kt\nandroidx/collection/MutableIntSet\n*L\n673#1:981,2\n673#1:989,5\n731#1:1020,2\n731#1:1028,5\n804#1:1045,2\n804#1:1053,5\n526#1:839,6\n595#1:858\n595#1:862\n607#1:879\n607#1:882\n607#1:886,3\n607#1:890,3\n607#1:894\n607#1:896\n607#1:897\n607#1:902\n607#1:904\n620#1:918\n620#1:921\n620#1:925,3\n620#1:929,3\n620#1:933\n620#1:935\n620#1:936\n620#1:941\n620#1:943\n663#1:965\n663#1:969\n673#1:983,6\n683#1:994,6\n697#1:1003\n698#1:1004\n705#1:1005,3\n706#1:1008,3\n707#1:1011\n708#1:1012\n708#1:1013\n712#1:1014\n715#1:1015\n724#1:1016\n724#1:1017\n730#1:1018\n730#1:1019\n731#1:1022,6\n745#1:1033,3\n746#1:1036\n748#1:1037\n799#1:1038\n799#1:1039\n802#1:1043\n804#1:1044\n804#1:1047,6\n817#1:1058,6\n823#1:1064,6\n573#1:845,2\n642#1:952,2\n595#1:847,4\n595#1:851,7\n595#1:859,3\n595#1:863,2\n595#1:865,2\n595#1:867,6\n595#1:873\n607#1:874\n607#1:878\n607#1:880,2\n607#1:883,3\n607#1:889\n607#1:893\n607#1:895\n607#1:898,4\n607#1:903\n607#1:905,8\n620#1:913\n620#1:917\n620#1:919,2\n620#1:922,3\n620#1:928\n620#1:932\n620#1:934\n620#1:937,4\n620#1:942\n620#1:944,8\n663#1:954,4\n663#1:958,7\n663#1:966,3\n663#1:970,2\n663#1:972,2\n663#1:974,6\n663#1:980\n607#1:875,3\n620#1:914,3\n696#1:1000,3\n801#1:1040,3\n*E\n"})
public final class MutableIntSet extends IntSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2409a;

    public MutableIntSet() {
        this(0, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b4  */
    public final int a(int i10) {
        int i11 = ScatterMapKt.MurmurHashC1 * i10;
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this._capacity;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j10 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j11 = i14;
            int i20 = i17;
            long j12 = j10 ^ (j11 * ScatterMapKt.BitmaskLsb);
            for (long j13 = (~j12) & (j12 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j13) >> 3)) & i15;
                if (this.elements[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iB = b(i13);
                if (this.f2409a == 0 && ((this.metadata[iB >> 3] >> ((iB & 7) << 3)) & 255) != 254) {
                    if (this._capacity <= 8) {
                        e(ScatterMapKt.nextCapacity(this._capacity));
                    } else if (Long.compare(f.a(this._size, 32L) ^ Long.MIN_VALUE, f.a(this._capacity, 25L) ^ Long.MIN_VALUE) <= 0) {
                        e(ScatterMapKt.nextCapacity(this._capacity));
                    } else {
                        e(ScatterMapKt.nextCapacity(this._capacity));
                    }
                    iB = b(i13);
                }
                this._size++;
                int i21 = this.f2409a;
                long[] jArr2 = this.metadata;
                int i22 = iB >> 3;
                long j14 = jArr2[i22];
                int i23 = (iB & 7) << 3;
                this.f2409a = i21 - (((j14 >> i23) & 255) == 128 ? 1 : 0);
                jArr2[i22] = (j14 & (~(255 << i23))) | (j11 << i23);
                int i24 = this._capacity;
                int i25 = ((iB - 7) & i24) + (i24 & 7);
                int i26 = i25 >> 3;
                int i27 = (i25 & 7) << 3;
                jArr2[i26] = ((~(255 << i27)) & jArr2[i26]) | (j11 << i27);
                return iB;
            }
            i17 = i20 + 8;
            i16 = (i16 + i17) & i15;
        }
    }

    public final boolean add(int element) {
        int i10 = this._size;
        this.elements[a(element)] = element;
        return this._size != i10;
    }

    public final boolean addAll(@NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        plusAssign(elements);
        return i10 != this._size;
    }

    public final int b(int i10) {
        int i11 = this._capacity;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final void c(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i10)) : 0;
        this._capacity = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.metadata = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f2409a = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
        this.elements = new int[iMax];
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.metadata;
            int i10 = this._capacity;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        this.f2409a = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    public final void d(int i10) {
        this._size--;
        long[] jArr = this.metadata;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this._capacity;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
    }

    public final void e(int i10) {
        long[] jArr = this.metadata;
        int[] iArr = this.elements;
        int i11 = this._capacity;
        c(i10);
        int[] iArr2 = this.elements;
        int i12 = 0;
        while (i12 < i11) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                int i13 = iArr[i12];
                int i14 = ScatterMapKt.MurmurHashC1 * i13;
                int i15 = i14 ^ (i14 << 16);
                int iB = b(i15 >>> 7);
                long j10 = i15 & 127;
                long[] jArr2 = this.metadata;
                int i16 = iB >> 3;
                int i17 = (iB & 7) << 3;
                jArr2[i16] = ((~(255 << i17)) & jArr2[i16]) | (j10 << i17);
                int i18 = this._capacity;
                int i19 = ((iB - 7) & i18) + (i18 & 7);
                int i20 = i19 >> 3;
                int i21 = (i19 & 7) << 3;
                jArr2[i20] = ((~(255 << i21)) & jArr2[i20]) | (j10 << i21);
                iArr2[iB] = i13;
            }
            i12++;
            jArr = jArr;
            iArr = iArr;
        }
    }

    public final void minusAssign(int element) {
        int iNumberOfTrailingZeros;
        int i10 = ScatterMapKt.MurmurHashC1 * element;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this._capacity;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.elements[iNumberOfTrailingZeros] == element) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i15 += 8;
                i14 = (i14 + i15) & i13;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            d(iNumberOfTrailingZeros);
        }
    }

    public final void plusAssign(int element) {
        this.elements[a(element)] = element;
    }

    public final boolean remove(int element) {
        int iNumberOfTrailingZeros;
        int i10 = ScatterMapKt.MurmurHashC1 * element;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this._capacity;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.elements[iNumberOfTrailingZeros] == element) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            d(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final boolean removeAll(@NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        minusAssign(elements);
        return i10 != this._size;
    }

    @IntRange(from = 0)
    public final int trim() {
        int i10 = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i10) {
            return 0;
        }
        e(iNormalizeCapacity);
        return i10 - this._capacity;
    }

    public /* synthetic */ MutableIntSet(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public MutableIntSet(int i10) {
        super(null);
        if (i10 >= 0) {
            c(ScatterMapKt.unloadedCapacity(i10));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void plusAssign(@NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (int i10 : elements) {
            plusAssign(i10);
        }
    }

    public final boolean addAll(@NotNull IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        plusAssign(elements);
        return i10 != this._size;
    }

    public final boolean removeAll(@NotNull IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this._size;
        minusAssign(elements);
        return i10 != this._size;
    }

    public final void plusAssign(@NotNull IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int[] iArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        plusAssign(iArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void minusAssign(@NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (int i10 : elements) {
            minusAssign(i10);
        }
    }

    public final void minusAssign(@NotNull IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int[] iArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        minusAssign(iArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }
}
