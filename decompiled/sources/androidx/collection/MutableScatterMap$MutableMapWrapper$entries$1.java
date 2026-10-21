package androidx.collection;

import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0010#\n\u0002\u0010'\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0016J\"\u0010\n\u001a\u00020\b2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001d\u0010\u000f\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002J\"\u0010\u0010\u001a\u00020\b2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\u001b\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0013H\u0096\u0002J\u001c\u0010\u0014\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0016J\"\u0010\u0015\u001a\u00020\b2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016J\"\u0010\u0016\u001a\u00020\b2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$entries$1", "", "", "size", "", "getSize", "()I", "add", "", "element", "addAll", "elements", "", ClearCommand.ID, "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "containsAll", "isEmpty", "iterator", "", RemoveCommand.ID, "removeAll", "retainAll", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n1726#2,3:1835\n363#3,6:1838\n373#3,3:1845\n376#3,9:1849\n363#3,6:1858\n373#3,3:1865\n376#3,9:1869\n633#3:1878\n634#3:1882\n636#3,2:1884\n638#3,4:1887\n642#3:1894\n643#3:1898\n644#3:1900\n645#3,4:1903\n651#3:1908\n652#3,8:1910\n1810#4:1844\n1672#4:1848\n1810#4:1864\n1672#4:1868\n1589#4,3:1879\n1603#4:1883\n1599#4:1886\n1779#4,3:1891\n1793#4,3:1895\n1717#4:1899\n1705#4:1901\n1699#4:1902\n1712#4:1907\n1802#4:1909\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1\n*L\n1342#1:1835,3\n1360#1:1838,6\n1360#1:1845,3\n1360#1:1849,9\n1382#1:1858,6\n1382#1:1865,3\n1382#1:1869,9\n1397#1:1878\n1397#1:1882\n1397#1:1884,2\n1397#1:1887,4\n1397#1:1894\n1397#1:1898\n1397#1:1900\n1397#1:1903,4\n1397#1:1908\n1397#1:1910,8\n1360#1:1844\n1360#1:1848\n1382#1:1864\n1382#1:1868\n1397#1:1879,3\n1397#1:1883\n1397#1:1886\n1397#1:1891,3\n1397#1:1895,3\n1397#1:1899\n1397#1:1901\n1397#1:1902\n1397#1:1907\n1397#1:1909\n*E\n"})
public final class MutableScatterMap$MutableMapWrapper$entries$1<K, V> implements Set<Map.Entry<K, V>>, KMutableSet {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MutableScatterMap<K, V> f2427p0;

    public MutableScatterMap$MutableMapWrapper$entries$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.f2427p0 = mutableScatterMap;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends Map.Entry<K, V>> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f2427p0.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (TypeIntrinsics.isMutableMapEntry(obj)) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!Intrinsics.areEqual(this.f2427p0.get((K) entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.f2427p0._size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f2427p0.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return new MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(this.f2427p0);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (TypeIntrinsics.isMutableMapEntry(obj)) {
            return remove((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        boolean z10;
        int i10;
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.f2427p0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            boolean z11 = false;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            Iterator<? extends Object> it = elements.iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                if (Intrinsics.areEqual(entry.getKey(), mutableScatterMap.keys[i15]) && Intrinsics.areEqual(entry.getValue(), mutableScatterMap.values[i15])) {
                                    mutableScatterMap.removeValueAt(i15);
                                    z11 = true;
                                    break;
                                }
                            }
                            i10 = 8;
                        } else {
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                    }
                    if (i13 != i12) {
                        return z11;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    z10 = z11;
                }
            }
        } else {
            z10 = false;
        }
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        boolean z10;
        int i10;
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.f2427p0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            boolean z11 = false;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            Iterator<? extends Object> it = elements.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    mutableScatterMap.removeValueAt(i15);
                                    z11 = true;
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                if (Intrinsics.areEqual(entry.getKey(), mutableScatterMap.keys[i15]) && Intrinsics.areEqual(entry.getValue(), mutableScatterMap.values[i15])) {
                                    break;
                                }
                            }
                            i10 = 8;
                        } else {
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                    }
                    if (i13 != i12) {
                        return z11;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    z10 = z11;
                }
            }
        } else {
            z10 = false;
        }
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(@NotNull Map.Entry<K, V> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    public boolean contains(@NotNull Map.Entry<K, V> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return Intrinsics.areEqual(this.f2427p0.get(element.getKey()), element.getValue());
    }

    public boolean remove(@NotNull Map.Entry<K, V> element) {
        int iNumberOfTrailingZeros;
        Intrinsics.checkNotNullParameter(element, "element");
        K key = element.getKey();
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        MutableScatterMap<K, V> mutableScatterMap = this.f2427p0;
        int i12 = mutableScatterMap._capacity;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = mutableScatterMap.metadata;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (Intrinsics.areEqual(mutableScatterMap.keys[iNumberOfTrailingZeros], key)) {
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
        if (iNumberOfTrailingZeros < 0 || !Intrinsics.areEqual(mutableScatterMap.values[iNumberOfTrailingZeros], element.getValue())) {
            return false;
        }
        mutableScatterMap.removeValueAt(iNumberOfTrailingZeros);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
