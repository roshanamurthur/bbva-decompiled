package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.RoomDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RelationUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aR\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0006\u0012\u0004\u0012\u00020\u00010\n\u001ar\u0010\u000b\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u00042\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\fj\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0004`\r2\u0006\u0010\u0007\u001a\u00020\b2.\u0010\t\u001a*\u0012 \u0012\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\fj\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0004`\r\u0012\u0004\u0012\u00020\u00010\n\u001a<\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000f\u0012\u0004\u0012\u00020\u00010\n¨\u0006\u0010"}, d2 = {"recursiveFetchArrayMap", "", "K", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "map", "Landroidx/collection/ArrayMap;", "isRelationCollection", "", "fetchBlock", "Lkotlin/Function1;", "recursiveFetchHashMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "recursiveFetchLongSparseArray", "Landroidx/collection/LongSparseArray;", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@JvmName(name = "RelationUtil")
public final class RelationUtil {
    public static final <K, V> void recursiveFetchArrayMap(@NotNull ArrayMap<K, V> map, boolean z10, @NotNull Function1<? super ArrayMap<K, V>, Unit> fetchBlock) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        ArrayMap arrayMap = new ArrayMap(RoomDatabase.MAX_BIND_PARAMETER_CNT);
        int size = map.getSize();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (z10) {
                arrayMap.put(map.keyAt(i10), map.valueAt(i10));
            } else {
                arrayMap.put(map.keyAt(i10), null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                fetchBlock.invoke(arrayMap);
                if (!z10) {
                    map.putAll((Map) arrayMap);
                }
                arrayMap.clear();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            fetchBlock.invoke(arrayMap);
            if (z10) {
                return;
            }
            map.putAll((Map) arrayMap);
        }
    }

    public static final <K, V> void recursiveFetchHashMap(@NotNull HashMap<K, V> map, boolean z10, @NotNull Function1<? super HashMap<K, V>, Unit> fetchBlock) {
        int i10;
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        HashMap map2 = new HashMap(RoomDatabase.MAX_BIND_PARAMETER_CNT);
        Iterator<K> it = map.keySet().iterator();
        loop0: while (true) {
            i10 = 0;
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                K key = it.next();
                if (z10) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map2.put(key, map.get(key));
                } else {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map2.put(key, null);
                }
                i10++;
            } while (i10 != 999);
            fetchBlock.invoke(map2);
            if (!z10) {
                map.putAll(map2);
            }
            map2.clear();
        }
        if (i10 > 0) {
            fetchBlock.invoke(map2);
            if (z10) {
                return;
            }
            map.putAll(map2);
        }
    }

    public static final <V> void recursiveFetchLongSparseArray(@NotNull LongSparseArray<V> map, boolean z10, @NotNull Function1<? super LongSparseArray<V>, Unit> fetchBlock) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        LongSparseArray<? extends V> longSparseArray = new LongSparseArray<>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
        int size = map.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (z10) {
                longSparseArray.put(map.keyAt(i10), map.valueAt(i10));
            } else {
                longSparseArray.put(map.keyAt(i10), null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                fetchBlock.invoke(longSparseArray);
                if (!z10) {
                    map.putAll(longSparseArray);
                }
                longSparseArray.clear();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            fetchBlock.invoke(longSparseArray);
            if (z10) {
                return;
            }
            map.putAll(longSparseArray);
        }
    }
}
