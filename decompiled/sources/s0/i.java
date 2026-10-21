package s0;

import androidx.compose.runtime.snapshots.StateMapMutableEntriesIterator$next$1;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i<K, V> extends j<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
    @Override // java.util.Iterator
    public final Object next() {
        a();
        if (this.f93133s0 != null) {
            return new StateMapMutableEntriesIterator$next$1(this);
        }
        throw new IllegalStateException();
    }
}
