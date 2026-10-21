package androidx.collection;

import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FloatFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\"\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0086\bø\u0001\u0000J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002J\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0001J\u0011\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0001H\u0086\nJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J&\u0010\u0013\u001a\u00020\b2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u0011H\u0086\bø\u0001\u0000J\u0011\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\nJ\u0011\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086\nJ\u0011\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0086\nJ\u0011\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0018H\u0086\nJ\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0001J\u0006\u0010\u001c\u001a\u00020\bJ\u0006\u0010\u001d\u001a\u00020\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {"Landroidx/collection/MutableFloatFloatMap;", "Landroidx/collection/FloatFloatMap;", "", "key", "Lkotlin/Function0;", "defaultValue", "getOrPut", "value", "", SetCommand.ID, PutCommand.ID, "default", "from", "putAll", "plusAssign", RemoveCommand.ID, "", "Lkotlin/Function2;", "predicate", "removeIf", "minusAssign", "", "keys", "Landroidx/collection/FloatSet;", "Landroidx/collection/FloatList;", "", FirebaseAnalytics.Param.INDEX, "removeValueAt", ClearCommand.ID, "trim", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFloatFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/MutableFloatFloatMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 FloatFloatMap.kt\nandroidx/collection/FloatFloatMap\n+ 5 FloatSet.kt\nandroidx/collection/FloatSet\n+ 6 FloatList.kt\nandroidx/collection/FloatList\n+ 7 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1031:1\n1021#1,2:1118\n1025#1,5:1126\n1021#1,2:1157\n1025#1,5:1165\n1021#1,2:1182\n1025#1,5:1190\n1#2:1032\n1656#3,6:1033\n1810#3:1049\n1672#3:1053\n1810#3:1071\n1672#3:1075\n1810#3:1096\n1672#3:1100\n1656#3,6:1120\n1656#3,6:1131\n1599#3:1140\n1603#3:1141\n1779#3,3:1142\n1793#3,3:1145\n1717#3:1148\n1705#3:1149\n1699#3:1150\n1712#3:1151\n1802#3:1152\n1666#3:1153\n1645#3:1154\n1664#3:1155\n1645#3:1156\n1656#3,6:1159\n1779#3,3:1170\n1810#3:1173\n1699#3:1174\n1669#3:1175\n1645#3:1176\n1599#3:1180\n1603#3:1181\n1656#3,6:1184\n1656#3,6:1195\n1656#3,6:1201\n385#4,4:1039\n357#4,6:1043\n367#4,3:1050\n370#4,2:1054\n389#4,2:1056\n373#4,6:1058\n391#4:1064\n357#4,6:1065\n367#4,3:1072\n370#4,9:1076\n262#5,4:1085\n232#5,7:1089\n243#5,3:1097\n246#5,2:1101\n266#5,2:1103\n249#5,6:1105\n268#5:1111\n253#6,6:1112\n833#7,3:1137\n833#7,3:1177\n*S KotlinDebug\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/MutableFloatFloatMap\n*L\n875#1:1118,2\n875#1:1126,5\n933#1:1157,2\n933#1:1165,5\n1008#1:1182,2\n1008#1:1190,5\n711#1:1033,6\n789#1:1049\n789#1:1053\n828#1:1071\n828#1:1075\n855#1:1096\n855#1:1100\n875#1:1120,6\n885#1:1131,6\n899#1:1140\n900#1:1141\n907#1:1142,3\n908#1:1145,3\n909#1:1148\n910#1:1149\n910#1:1150\n914#1:1151\n917#1:1152\n926#1:1153\n926#1:1154\n932#1:1155\n932#1:1156\n933#1:1159,6\n948#1:1170,3\n949#1:1173\n951#1:1174\n1003#1:1175\n1003#1:1176\n1006#1:1180\n1008#1:1181\n1008#1:1184,6\n1022#1:1195,6\n1028#1:1201,6\n789#1:1039,4\n789#1:1043,6\n789#1:1050,3\n789#1:1054,2\n789#1:1056,2\n789#1:1058,6\n789#1:1064\n828#1:1065,6\n828#1:1072,3\n828#1:1076,9\n855#1:1085,4\n855#1:1089,7\n855#1:1097,3\n855#1:1101,2\n855#1:1103,2\n855#1:1105,6\n855#1:1111\n864#1:1112,6\n898#1:1137,3\n1005#1:1177,3\n*E\n"})
public final class MutableFloatFloatMap extends FloatFloatMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2400a;

    public MutableFloatFloatMap() {
        this(0, 1, null);
    }

    public final int a(int i10) {
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

    /* JADX WARN: Code duplicated, block: B:22:0x00b6  */
    public final int b(float f6) {
        int iFloatToIntBits = Float.floatToIntBits(f6) * ScatterMapKt.MurmurHashC1;
        int i10 = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this._capacity;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i15;
            long j12 = j10 ^ (j11 * ScatterMapKt.BitmaskLsb);
            for (long j13 = (~j12) & (j12 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.keys[iNumberOfTrailingZeros] == f6) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iA = a(i11);
                if (this.f2400a == 0 && ((this.metadata[iA >> 3] >> ((iA & 7) << 3)) & 255) != 254) {
                    if (this._capacity <= 8) {
                        d(ScatterMapKt.nextCapacity(this._capacity));
                    } else if (Long.compare(f.a(this._size, 32L) ^ Long.MIN_VALUE, f.a(this._capacity, 25L) ^ Long.MIN_VALUE) <= 0) {
                        d(ScatterMapKt.nextCapacity(this._capacity));
                    } else {
                        d(ScatterMapKt.nextCapacity(this._capacity));
                    }
                    iA = a(i11);
                }
                this._size++;
                int i19 = this.f2400a;
                long[] jArr2 = this.metadata;
                int i20 = iA >> 3;
                long j14 = jArr2[i20];
                int i21 = (iA & 7) << 3;
                this.f2400a = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                jArr2[i20] = (j14 & (~(255 << i21))) | (j11 << i21);
                int i22 = this._capacity;
                int i23 = ((iA - 7) & i22) + (i22 & 7);
                int i24 = i23 >> 3;
                int i25 = (i23 & 7) << 3;
                jArr2[i24] = (jArr2[i24] & (~(255 << i25))) | (j11 << i25);
                return ~iA;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
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
        this.f2400a = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
        this.keys = new float[iMax];
        this.values = new float[iMax];
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
        this.f2400a = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    public final void d(int i10) {
        long[] jArr = this.metadata;
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
        int i11 = this._capacity;
        c(i10);
        float[] fArr3 = this.keys;
        float[] fArr4 = this.values;
        int i12 = 0;
        while (i12 < i11) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                float f6 = fArr[i12];
                int iFloatToIntBits = Float.floatToIntBits(f6) * ScatterMapKt.MurmurHashC1;
                int i13 = iFloatToIntBits ^ (iFloatToIntBits << 16);
                int iA = a(i13 >>> 7);
                long j10 = i13 & 127;
                long[] jArr2 = this.metadata;
                int i14 = iA >> 3;
                int i15 = (iA & 7) << 3;
                jArr2[i14] = (jArr2[i14] & (~(255 << i15))) | (j10 << i15);
                int i16 = this._capacity;
                int i17 = ((iA - 7) & i16) + (i16 & 7);
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                jArr2[i18] = ((~(255 << i19)) & jArr2[i18]) | (j10 << i19);
                fArr3[iA] = f6;
                fArr4[iA] = fArr2[i12];
            }
            i12++;
            jArr = jArr;
            fArr = fArr;
        }
    }

    public final float getOrPut(float key, @NotNull Function0<Float> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        float fFloatValue = defaultValue.invoke().floatValue();
        put(key, fFloatValue);
        return fFloatValue;
    }

    public final void minusAssign(float key) {
        remove(key);
    }

    public final void plusAssign(@NotNull FloatFloatMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void put(float key, float value) {
        set(key, value);
    }

    public final void putAll(@NotNull FloatFloatMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        float[] fArr = from.keys;
        float[] fArr2 = from.values;
        long[] jArr = from.metadata;
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
                        int i13 = (i10 << 3) + i12;
                        set(fArr[i13], fArr2[i13]);
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

    public final void remove(float key) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final void removeIf(@NotNull Function2<? super Float, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.metadata;
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
                        int i13 = (i10 << 3) + i12;
                        if (predicate.invoke(Float.valueOf(this.keys[i13]), Float.valueOf(this.values[i13])).booleanValue()) {
                            removeValueAt(i13);
                        }
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

    @PublishedApi
    public final void removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i10 = index >> 3;
        int i11 = (index & 7) << 3;
        jArr[i10] = (jArr[i10] & (~(255 << i11))) | (254 << i11);
        int i12 = this._capacity;
        int i13 = ((index - 7) & i12) + (i12 & 7);
        int i14 = i13 >> 3;
        int i15 = (i13 & 7) << 3;
        jArr[i14] = (jArr[i14] & (~(255 << i15))) | (254 << i15);
    }

    public final void set(float key, float value) {
        int iB = b(key);
        if (iB < 0) {
            iB = ~iB;
        }
        this.keys[iB] = key;
        this.values[iB] = value;
    }

    public final int trim() {
        int i10 = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i10) {
            return 0;
        }
        d(iNormalizeCapacity);
        return i10 - this._capacity;
    }

    public /* synthetic */ MutableFloatFloatMap(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public final void minusAssign(@NotNull float[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (float f6 : keys) {
            remove(f6);
        }
    }

    public final float put(float key, float value, float f6) {
        int iB = b(key);
        if (iB < 0) {
            iB = ~iB;
        } else {
            f6 = this.values[iB];
        }
        this.keys[iB] = key;
        this.values[iB] = value;
        return f6;
    }

    public MutableFloatFloatMap(int i10) {
        super(null);
        if (i10 >= 0) {
            c(ScatterMapKt.unloadedCapacity(i10));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final boolean remove(float key, float value) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != value) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void minusAssign(@NotNull FloatSet keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        float[] fArr = keys.elements;
        long[] jArr = keys.metadata;
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
                        remove(fArr[(i10 << 3) + i12]);
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

    public final void minusAssign(@NotNull FloatList keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        float[] fArr = keys.content;
        int i10 = keys._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(fArr[i11]);
        }
    }
}
