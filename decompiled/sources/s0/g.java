package s0;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Set;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class g<K, V, E> implements Set<E>, KMutableSet {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SnapshotStateMap<K, V> f93125p0;

    public g(@NotNull SnapshotStateMap<K, V> snapshotStateMap) {
        this.f93125p0 = snapshotStateMap;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f93125p0.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f93125p0.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f93125p0.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }
}
