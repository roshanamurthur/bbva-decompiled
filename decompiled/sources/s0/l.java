package s0;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l<K, V> extends j<K, V> implements Iterator<V>, KMutableIterator {
    @Override // java.util.Iterator
    public final V next() {
        Map.Entry<? extends K, ? extends V> entry = this.f93134t0;
        if (entry == null) {
            throw new IllegalStateException();
        }
        a();
        return entry.getValue();
    }
}
