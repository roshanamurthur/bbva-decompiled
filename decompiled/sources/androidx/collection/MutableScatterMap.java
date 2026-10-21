package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u00019B\u0011\u0012\b\b\u0002\u00106\u001a\u00020,¢\u0006\u0004\b7\u00108J)\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJU\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u000028\u0010\r\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00028\u00010\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\u00020\u00102\u001a\u0010\u0017\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u0018\u001a\u00020\u00102\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00160\u001aJ \u0010\u0018\u001a\u00020\u00102\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00160\u001bJ\u001a\u0010\u0018\u001a\u00020\u00102\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001cJ\u001a\u0010\u0018\u001a\u00020\u00102\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003J\u001d\u0010\u001f\u001a\u00020\u00102\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\u0086\nJ,\u0010\u001f\u001a\u00020\u00102\u001a\u0010\u0017\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00160\u0015H\u0086\n¢\u0006\u0004\b\u001f\u0010\u0019J#\u0010\u001f\u001a\u00020\u00102\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00160\u001aH\u0086\nJ#\u0010\u001f\u001a\u00020\u00102\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00160\u001bH\u0086\nJ\u001d\u0010\u001f\u001a\u00020\u00102\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001cH\u0086\nJ\u001d\u0010\u001f\u001a\u00020\u00102\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\nJ\u0017\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b \u0010!J\u001d\u0010 \u001a\u00020\"2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0004\b \u0010#J&\u0010%\u001a\u00020\u00102\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\"0\tH\u0086\bø\u0001\u0000J\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b&\u0010'J \u0010&\u001a\u00020\u00102\u000e\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015H\u0086\n¢\u0006\u0004\b&\u0010)J\u0017\u0010&\u001a\u00020\u00102\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\nJ\u0017\u0010&\u001a\u00020\u00102\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\nJ\u0017\u0010&\u001a\u00020\u00102\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0086\nJ\u0017\u0010&\u001a\u00020\u00102\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0086\nJ\u0019\u0010.\u001a\u0004\u0018\u00018\u00012\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b.\u0010/J\u0006\u00100\u001a\u00020\u0010J\u0017\u00101\u001a\u00020,2\u0006\u0010\u0004\u001a\u00028\u0000H\u0001¢\u0006\u0004\b1\u00102J\u0006\u00103\u001a\u00020,J\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006:"}, d2 = {"Landroidx/collection/MutableScatterMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/collection/ScatterMap;", "key", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "computeBlock", "compute", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "", SetCommand.ID, "(Ljava/lang/Object;Ljava/lang/Object;)V", PutCommand.ID, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/Pair;", "pairs", "putAll", "([Lkotlin/Pair;)V", "", "Lkotlin/sequences/Sequence;", "", "from", "pair", "plusAssign", RemoveCommand.ID, "(Ljava/lang/Object;)Ljava/lang/Object;", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "predicate", "removeIf", "minusAssign", "(Ljava/lang/Object;)V", "keys", "([Ljava/lang/Object;)V", "Landroidx/collection/ScatterSet;", "Landroidx/collection/ObjectList;", "", FirebaseAnalytics.Param.INDEX, "removeValueAt", "(I)Ljava/lang/Object;", ClearCommand.ID, "findInsertIndex", "(Ljava/lang/Object;)I", "trim", "", "asMutableMap", "initialCapacity", "<init>", "(I)V", "MutableMapWrapper", "collection"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1834:1\n1268#1,2:2003\n1272#1,5:2011\n1268#1,2:2042\n1272#1,5:2050\n1268#1,2:2067\n1272#1,5:2075\n1#2:1835\n1656#3,6:1836\n1810#3:1854\n1672#3:1858\n1589#3,3:1871\n1603#3:1875\n1599#3:1878\n1779#3,3:1883\n1793#3,3:1887\n1717#3:1891\n1705#3:1893\n1699#3:1894\n1712#3:1899\n1802#3:1901\n1589#3,3:1911\n1603#3:1915\n1599#3:1918\n1779#3,3:1923\n1793#3,3:1927\n1717#3:1931\n1705#3:1933\n1699#3:1934\n1712#3:1939\n1802#3:1941\n1810#3:1956\n1672#3:1960\n1810#3:1981\n1672#3:1985\n1656#3,6:2005\n1656#3,6:2016\n1589#3,3:2022\n1599#3:2025\n1603#3:2026\n1779#3,3:2027\n1793#3,3:2030\n1717#3:2033\n1705#3:2034\n1699#3:2035\n1712#3:2036\n1802#3:2037\n1666#3:2038\n1645#3:2039\n1664#3:2040\n1645#3:2041\n1656#3,6:2044\n1779#3,3:2055\n1810#3:2058\n1699#3:2059\n1669#3:2060\n1645#3:2061\n1589#3,3:2062\n1599#3:2065\n1603#3:2066\n1656#3,6:2069\n1656#3,6:2080\n1656#3,6:2086\n215#4,2:1842\n391#5,4:1844\n363#5,6:1848\n373#5,3:1855\n376#5,2:1859\n396#5,2:1861\n379#5,6:1863\n398#5:1869\n633#5:1870\n634#5:1874\n636#5,2:1876\n638#5,4:1879\n642#5:1886\n643#5:1890\n644#5:1892\n645#5,4:1895\n651#5:1900\n652#5,8:1902\n633#5:1910\n634#5:1914\n636#5,2:1916\n638#5,4:1919\n642#5:1926\n643#5:1930\n644#5:1932\n645#5,4:1935\n651#5:1940\n652#5,8:1942\n363#5,6:1950\n373#5,3:1957\n376#5,9:1961\n267#6,4:1970\n237#6,7:1974\n248#6,3:1982\n251#6,2:1986\n272#6,2:1988\n254#6,6:1990\n274#6:1996\n305#7,6:1997\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n*L\n1113#1:2003,2\n1113#1:2011,5\n1180#1:2042,2\n1180#1:2050,5\n1255#1:2067,2\n1255#1:2075,5\n848#1:1836,6\n972#1:1854\n972#1:1858\n1021#1:1871,3\n1021#1:1875\n1021#1:1878\n1021#1:1883,3\n1021#1:1887,3\n1021#1:1891\n1021#1:1893\n1021#1:1894\n1021#1:1899\n1021#1:1901\n1033#1:1911,3\n1033#1:1915\n1033#1:1918\n1033#1:1923,3\n1033#1:1927,3\n1033#1:1931\n1033#1:1933\n1033#1:1934\n1033#1:1939\n1033#1:1941\n1047#1:1956\n1047#1:1960\n1093#1:1981\n1093#1:1985\n1113#1:2005,6\n1129#1:2016,6\n1145#1:2022,3\n1146#1:2025\n1147#1:2026\n1154#1:2027,3\n1155#1:2030,3\n1156#1:2033\n1157#1:2034\n1157#1:2035\n1161#1:2036\n1164#1:2037\n1173#1:2038\n1173#1:2039\n1179#1:2040\n1179#1:2041\n1180#1:2044,6\n1195#1:2055,3\n1196#1:2058\n1198#1:2059\n1250#1:2060\n1250#1:2061\n1252#1:2062,3\n1253#1:2065\n1255#1:2066\n1255#1:2069,6\n1269#1:2080,6\n1275#1:2086,6\n963#1:1842,2\n972#1:1844,4\n972#1:1848,6\n972#1:1855,3\n972#1:1859,2\n972#1:1861,2\n972#1:1863,6\n972#1:1869\n1021#1:1870\n1021#1:1874\n1021#1:1876,2\n1021#1:1879,4\n1021#1:1886\n1021#1:1890\n1021#1:1892\n1021#1:1895,4\n1021#1:1900\n1021#1:1902,8\n1033#1:1910\n1033#1:1914\n1033#1:1916,2\n1033#1:1919,4\n1033#1:1926\n1033#1:1930\n1033#1:1932\n1033#1:1935,4\n1033#1:1940\n1033#1:1942,8\n1047#1:1950,6\n1047#1:1957,3\n1047#1:1961,9\n1093#1:1970,4\n1093#1:1974,7\n1093#1:1982,3\n1093#1:1986,2\n1093#1:1988,2\n1093#1:1990,6\n1093#1:1996\n1102#1:1997,6\n*E\n"})
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2425a;

    /* JADX INFO: compiled from: ScatterMap.kt */
    @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1834:1\n215#2,2:1835\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper\n*L\n1574#1:1835,2\n*E\n"})
    public final class MutableMapWrapper extends ScatterMap<K, V>.MapWrapper implements KMutableMap {
        public MutableMapWrapper() {
            super();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public final void clear() {
            MutableScatterMap.this.clear();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        @NotNull
        public final Set<Map.Entry<K, V>> getEntries() {
            return new MutableScatterMap$MutableMapWrapper$entries$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        @NotNull
        public final Set<K> getKeys() {
            return new MutableScatterMap$MutableMapWrapper$keys$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        @NotNull
        public final Collection<V> getValues() {
            return new MutableScatterMap$MutableMapWrapper$values$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        @Nullable
        public final V put(K k10, V v3) {
            return MutableScatterMap.this.put(k10, v3);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public final void putAll(@NotNull Map<? extends K, ? extends V> from) {
            Intrinsics.checkNotNullParameter(from, "from");
            for (Map.Entry<? extends K, ? extends V> entry : from.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        @Nullable
        public final V remove(Object obj) {
            return MutableScatterMap.this.remove(obj);
        }
    }

    public MutableScatterMap() {
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

    @NotNull
    public final Map<K, V> asMutableMap() {
        return new MutableMapWrapper();
    }

    public final void b(int i10) {
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
        this.f2425a = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
        this.keys = new Object[iMax];
        this.values = new Object[iMax];
    }

    public final void c(int i10) {
        int i11;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i12 = this._capacity;
        b(i10);
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
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
                objArr3[iA] = obj;
                objArr4[iA] = objArr2[i11];
            } else {
                i11 = i13;
            }
            i13 = i11 + 1;
        }
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
        ArraysKt___ArraysJvmKt.fill(this.values, (Object) null, 0, this._capacity);
        ArraysKt___ArraysJvmKt.fill(this.keys, (Object) null, 0, this._capacity);
        this.f2425a = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    public final V compute(K key, @NotNull Function2<? super K, ? super V, ? extends V> computeBlock) {
        Intrinsics.checkNotNullParameter(computeBlock, "computeBlock");
        int iFindInsertIndex = findInsertIndex(key);
        boolean z10 = iFindInsertIndex < 0;
        V vInvoke = computeBlock.invoke(key, z10 ? null : this.values[iFindInsertIndex]);
        if (z10) {
            int i10 = ~iFindInsertIndex;
            this.keys[i10] = key;
            this.values[i10] = vInvoke;
        } else {
            this.values[iFindInsertIndex] = vInvoke;
        }
        return vInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
    @PublishedApi
    public final int findInsertIndex(K key) {
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
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
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iA = a(i11);
                if (this.f2425a == 0 && ((this.metadata[iA >> 3] >> ((iA & 7) << 3)) & 255) != 254) {
                    if (this._capacity <= 8) {
                        c(ScatterMapKt.nextCapacity(this._capacity));
                    } else if (Long.compare(f.a(this._size, 32L) ^ Long.MIN_VALUE, f.a(this._capacity, 25L) ^ Long.MIN_VALUE) <= 0) {
                        c(ScatterMapKt.nextCapacity(this._capacity));
                    } else {
                        c(ScatterMapKt.nextCapacity(this._capacity));
                    }
                    iA = a(i11);
                }
                this._size++;
                int i19 = this.f2425a;
                long[] jArr2 = this.metadata;
                int i20 = iA >> 3;
                long j14 = jArr2[i20];
                int i21 = (iA & 7) << 3;
                this.f2425a = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
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

    public final V getOrPut(K key, @NotNull Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v3 = get(key);
        if (v3 != null) {
            return v3;
        }
        V vInvoke = defaultValue.invoke();
        set(key, vInvoke);
        return vInvoke;
    }

    public final void minusAssign(K key) {
        remove(key);
    }

    public final void plusAssign(@NotNull Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        set(pair.getFirst(), pair.getSecond());
    }

    @Nullable
    public final V put(K key, V value) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        Object[] objArr = this.values;
        V v3 = (V) objArr[iFindInsertIndex];
        this.keys[iFindInsertIndex] = key;
        objArr[iFindInsertIndex] = value;
        return v3;
    }

    public final void putAll(@NotNull Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    @Nullable
    public final V remove(K key) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this._capacity;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.metadata;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], key)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return removeValueAt(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final void removeIf(@NotNull Function2<? super K, ? super V, Boolean> predicate) {
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
                        if (predicate.invoke(this.keys[i13], this.values[i13]).booleanValue()) {
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
    @Nullable
    public final V removeValueAt(int index) {
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
        Object[] objArr = this.values;
        V v3 = (V) objArr[index];
        objArr[index] = null;
        return v3;
    }

    public final void set(K key, V value) {
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = key;
        this.values[iFindInsertIndex] = value;
    }

    public final int trim() {
        int i10 = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i10) {
            return 0;
        }
        c(iNormalizeCapacity);
        return i10 - this._capacity;
    }

    public /* synthetic */ MutableScatterMap(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public final void minusAssign(@NotNull K[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (K k10 : keys) {
            remove(k10);
        }
    }

    public final void plusAssign(@NotNull Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public MutableScatterMap(int i10) {
        super(null);
        if (i10 >= 0) {
            b(ScatterMapKt.unloadedCapacity(i10));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void plusAssign(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public final void putAll(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    public final void minusAssign(@NotNull Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(@NotNull Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void putAll(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    public final void minusAssign(@NotNull Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@NotNull ScatterMap<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void putAll(@NotNull Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            set(entry.getKey(), entry.getValue());
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

    public final boolean remove(K key, V value) {
        int iNumberOfTrailingZeros;
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this._capacity;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], key)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (iNumberOfTrailingZeros < 0 || !Intrinsics.areEqual(this.values[iNumberOfTrailingZeros], value)) {
            return false;
        }
        removeValueAt(iNumberOfTrailingZeros);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@NotNull ScatterMap<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
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
                        set(objArr[i13], objArr2[i13]);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ObjectList<K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.content;
        int i10 = keys._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(objArr[i11]);
        }
    }
}
