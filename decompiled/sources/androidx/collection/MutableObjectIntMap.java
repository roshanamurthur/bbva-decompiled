package androidx.collection;

import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ObjectIntMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010%\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'J)\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\fJ%\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000fJ\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0017\u0010\u0012\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\nJ\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0013\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0016J&\u0010\u0019\u001a\u00020\n2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001a\u001a\u00020\n2\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001bH\u0086\n¢\u0006\u0004\b\u001a\u0010\u001dJ\u0017\u0010\u001a\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\nJ\u0017\u0010\u001a\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\nJ\u0017\u0010\u001a\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0086\nJ\u0010\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0005H\u0001J\u0006\u0010#\u001a\u00020\nJ\u0006\u0010$\u001a\u00020\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"Landroidx/collection/MutableObjectIntMap;", "K", "Landroidx/collection/ObjectIntMap;", "key", "Lkotlin/Function0;", "", "defaultValue", "getOrPut", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)I", "value", "", SetCommand.ID, "(Ljava/lang/Object;I)V", PutCommand.ID, "default", "(Ljava/lang/Object;II)I", "from", "putAll", "plusAssign", RemoveCommand.ID, "(Ljava/lang/Object;)V", "", "(Ljava/lang/Object;I)Z", "Lkotlin/Function2;", "predicate", "removeIf", "minusAssign", "", "keys", "([Ljava/lang/Object;)V", "", "Lkotlin/sequences/Sequence;", "Landroidx/collection/ScatterSet;", FirebaseAnalytics.Param.INDEX, "removeValueAt", ClearCommand.ID, "trim", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nObjectIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,1058:1\n1048#1,2:1139\n1052#1,5:1147\n1048#1,2:1178\n1052#1,5:1186\n1048#1,2:1203\n1052#1,5:1211\n1#2:1059\n1656#3,6:1060\n1810#3:1076\n1672#3:1080\n1810#3:1098\n1672#3:1102\n1810#3:1123\n1672#3:1127\n1656#3,6:1141\n1656#3,6:1152\n1589#3,3:1158\n1599#3:1161\n1603#3:1162\n1779#3,3:1163\n1793#3,3:1166\n1717#3:1169\n1705#3:1170\n1699#3:1171\n1712#3:1172\n1802#3:1173\n1666#3:1174\n1645#3:1175\n1664#3:1176\n1645#3:1177\n1656#3,6:1180\n1779#3,3:1191\n1810#3:1194\n1699#3:1195\n1669#3:1196\n1645#3:1197\n1589#3,3:1198\n1599#3:1201\n1603#3:1202\n1656#3,6:1205\n1656#3,6:1216\n1656#3,6:1222\n401#4,4:1066\n373#4,6:1070\n383#4,3:1077\n386#4,2:1081\n406#4,2:1083\n389#4,6:1085\n408#4:1091\n373#4,6:1092\n383#4,3:1099\n386#4,9:1103\n267#5,4:1112\n237#5,7:1116\n248#5,3:1124\n251#5,2:1128\n272#5,2:1130\n254#5,6:1132\n274#5:1138\n*S KotlinDebug\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n*L\n900#1:1139,2\n900#1:1147,5\n960#1:1178,2\n960#1:1186,5\n1035#1:1203,2\n1035#1:1211,5\n728#1:1060,6\n804#1:1076\n804#1:1080\n843#1:1098\n843#1:1102\n889#1:1123\n889#1:1127\n900#1:1141,6\n911#1:1152,6\n925#1:1158,3\n926#1:1161\n927#1:1162\n934#1:1163,3\n935#1:1166,3\n936#1:1169\n937#1:1170\n937#1:1171\n941#1:1172\n944#1:1173\n953#1:1174\n953#1:1175\n959#1:1176\n959#1:1177\n960#1:1180,6\n975#1:1191,3\n976#1:1194\n978#1:1195\n1030#1:1196\n1030#1:1197\n1032#1:1198,3\n1033#1:1201\n1035#1:1202\n1035#1:1205,6\n1049#1:1216,6\n1055#1:1222,6\n804#1:1066,4\n804#1:1070,6\n804#1:1077,3\n804#1:1081,2\n804#1:1083,2\n804#1:1085,6\n804#1:1091\n843#1:1092,6\n843#1:1099,3\n843#1:1103,9\n889#1:1112,4\n889#1:1116,7\n889#1:1124,3\n889#1:1128,2\n889#1:1130,2\n889#1:1132,6\n889#1:1138\n*E\n"})
public final class MutableObjectIntMap<K> extends ObjectIntMap<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2416a;

    public MutableObjectIntMap() {
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

    /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
    public final int b(K k10) {
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i10 = iHashCode ^ (iHashCode << 16);
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
            int i18 = i12;
            long j12 = j10 ^ (j11 * ScatterMapKt.BitmaskLsb);
            for (long j13 = (~j12) & (j12 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], k10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iA = a(i11);
                if (this.f2416a == 0 && ((this.metadata[iA >> 3] >> ((iA & 7) << 3)) & 255) != 254) {
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
                int i19 = this.f2416a;
                long[] jArr2 = this.metadata;
                int i20 = iA >> 3;
                long j14 = jArr2[i20];
                int i21 = (iA & 7) << 3;
                this.f2416a = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                jArr2[i20] = (j14 & (~(255 << i21))) | (j11 << i21);
                int i22 = this._capacity;
                int i23 = ((iA - 7) & i22) + (i22 & 7);
                int i24 = i23 >> 3;
                int i25 = (i23 & 7) << 3;
                jArr2[i24] = ((~(255 << i25)) & jArr2[i24]) | (j11 << i25);
                return ~iA;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
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
        this.f2416a = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
        this.keys = new Object[iMax];
        this.values = new int[iMax];
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
        ArraysKt___ArraysJvmKt.fill(this.keys, (Object) null, 0, this._capacity);
        this.f2416a = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    public final void d(int i10) {
        int i11;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int i12 = this._capacity;
        c(i10);
        Object[] objArr2 = this.keys;
        int[] iArr2 = this.values;
        int i13 = 0;
        while (i13 < i12) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iA = a(i14 >>> 7);
                long j10 = i14 & 127;
                long[] jArr2 = this.metadata;
                int i15 = iA >> 3;
                int i16 = (iA & 7) << 3;
                i11 = i13;
                jArr2[i15] = (jArr2[i15] & (~(255 << i16))) | (j10 << i16);
                int i17 = this._capacity;
                int i18 = ((iA - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i20 = (i18 & 7) << 3;
                jArr2[i19] = (jArr2[i19] & (~(255 << i20))) | (j10 << i20);
                objArr2[iA] = obj;
                iArr2[iA] = iArr[i11];
            } else {
                i11 = i13;
            }
            i13 = i11 + 1;
        }
    }

    public final int getOrPut(K key, @NotNull Function0<Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        int iIntValue = defaultValue.invoke().intValue();
        set(key, iIntValue);
        return iIntValue;
    }

    public final void minusAssign(K key) {
        remove(key);
    }

    public final void plusAssign(@NotNull ObjectIntMap<K> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void put(K key, int value) {
        set(key, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@NotNull ObjectIntMap<K> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.keys;
        int[] iArr = from.values;
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
                        set(objArr[i13], iArr[i13]);
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

    public final void remove(K key) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final void removeIf(@NotNull Function2<? super K, ? super Integer, Boolean> predicate) {
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
                        if (predicate.invoke(this.keys[i13], Integer.valueOf(this.values[i13])).booleanValue()) {
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
        this.keys[index] = null;
    }

    public final void set(K key, int value) {
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

    public /* synthetic */ MutableObjectIntMap(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public final void minusAssign(@NotNull K[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (K k10 : keys) {
            remove(k10);
        }
    }

    public final int put(K key, int value, int i10) {
        int iB = b(key);
        if (iB < 0) {
            iB = ~iB;
        } else {
            i10 = this.values[iB];
        }
        this.keys[iB] = key;
        this.values[iB] = value;
        return i10;
    }

    public MutableObjectIntMap(int i10) {
        super(null);
        if (i10 >= 0) {
            c(ScatterMapKt.unloadedCapacity(i10));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final boolean remove(K key, int value) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != value) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void minusAssign(@NotNull Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(@NotNull Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ScatterSet<K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.elements;
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
                        remove(objArr[(i10 << 3) + i12]);
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
