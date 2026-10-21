package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableMap;
import s0.i;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010'\n\u0002\b\r\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0017\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00028\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b\"\u0004\b\u0003\u0010\f¨\u0006\u000e"}, d2 = {"androidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "p0", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "q0", "getValue", "(Ljava/lang/Object;)V", "value", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n317#2,4:373\n1#3:377\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n*L\n334#1:373,4\n334#1:377\n*E\n"})
public final class StateMapMutableEntriesIterator$next$1 implements Map.Entry<Object, Object>, KMutableMap.Entry {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final Object key;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public Object value;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ i<Object, Object> f15347r0;

    public StateMapMutableEntriesIterator$next$1(i<Object, Object> iVar) {
        this.f15347r0 = iVar;
        Map.Entry<? extends Object, ? extends Object> entry = iVar.f93133s0;
        Intrinsics.checkNotNull(entry);
        this.key = entry.getKey();
        Map.Entry<? extends Object, ? extends Object> entry2 = iVar.f93133s0;
        Intrinsics.checkNotNull(entry2);
        this.value = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object newValue) {
        i<Object, Object> iVar = this.f15347r0;
        if (iVar.f93130p0.getModification$runtime_release() != iVar.f93132r0) {
            throw new ConcurrentModificationException();
        }
        Object value = getValue();
        iVar.f93130p0.put(getKey(), newValue);
        setValue(newValue);
        return value;
    }

    @Override // java.util.Map.Entry
    public void setValue(Object obj) {
        this.value = obj;
    }
}
