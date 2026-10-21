package s0;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n317#1,4:373\n1#2:377\n1#2:378\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n*L\n298#1:373,4\n298#1:377\n*E\n"})
public abstract class j<K, V> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SnapshotStateMap<K, V> f93130p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Iterator<Map.Entry<K, V>> f93131q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f93132r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public Map.Entry<? extends K, ? extends V> f93133s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public Map.Entry<? extends K, ? extends V> f93134t0;

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull SnapshotStateMap<K, V> snapshotStateMap, @NotNull Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.f93130p0 = snapshotStateMap;
        this.f93131q0 = it;
        this.f93132r0 = snapshotStateMap.getModification$runtime_release();
        a();
    }

    public final void a() {
        this.f93133s0 = this.f93134t0;
        Iterator<Map.Entry<K, V>> it = this.f93131q0;
        this.f93134t0 = it.hasNext() ? it.next() : null;
    }

    public final boolean hasNext() {
        return this.f93134t0 != null;
    }

    public final void remove() {
        SnapshotStateMap<K, V> snapshotStateMap = this.f93130p0;
        if (snapshotStateMap.getModification$runtime_release() != this.f93132r0) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.f93133s0;
        if (entry == null) {
            throw new IllegalStateException();
        }
        snapshotStateMap.remove(entry.getKey());
        this.f93133s0 = null;
        Unit unit = Unit.INSTANCE;
        this.f93132r0 = snapshotStateMap.getModification$runtime_release();
    }
}
