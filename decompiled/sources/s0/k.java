package s0;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k<K, V> extends j<K, V> implements Iterator<K>, KMutableIterator {
    @Override // java.util.Iterator
    public final K next() {
        Map.Entry<? extends K, ? extends V> entry = this.f93134t0;
        if (entry == null) {
            throw new IllegalStateException();
        }
        a();
        return entry.getKey();
    }
}
