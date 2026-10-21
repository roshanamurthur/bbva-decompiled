package s0;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt$takeNewSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2431:1\n1843#2:2432\n89#3:2433\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt$takeNewSnapshot$1\n*L\n1965#1:2432\n1965#1:2433\n*E\n"})
public final class f extends Lambda implements Function1<SnapshotIdSet, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1<SnapshotIdSet, Object> f93124p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(Function1<? super SnapshotIdSet, Object> function1) {
        super(1);
        this.f93124p0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(SnapshotIdSet snapshotIdSet) {
        Snapshot snapshot = (Snapshot) this.f93124p0.invoke(snapshotIdSet);
        synchronized (SnapshotKt.getLock()) {
            SnapshotKt.f15292d = SnapshotKt.f15292d.set(snapshot.getId());
            Unit unit = Unit.INSTANCE;
        }
        return snapshot;
    }
}
