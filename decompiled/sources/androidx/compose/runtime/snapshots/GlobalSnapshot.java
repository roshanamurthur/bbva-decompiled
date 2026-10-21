package androidx.compose.runtime.snapshots;

import androidx.collection.h;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\nH\u0010¢\u0006\u0002\b\u0013J4\u0010\u0014\u001a\u00020\u00012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u00162\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016H\u0016J\u001e\u0010\u0019\u001a\u00020\u000e2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016H\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "dispose", "", "nestedActivated", "", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "takeNestedMutableSnapshot", "readObserver", "Lkotlin/Function1;", "", "writeObserver", "takeNestedSnapshot", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2431:1\n1843#2:2432\n1843#2:2434\n89#3:2433\n89#3:2435\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n*L\n1444#1:2432\n1490#1:2434\n1444#1:2433\n1490#1:2435\n*E\n"})
public final class GlobalSnapshot extends MutableSnapshot {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: Snapshot.kt */
    @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,2431:1\n33#2,6:2432\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$1$1$1\n*L\n1447#1:2432,6\n*E\n"})
    public static final class a extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List<Function1<Object, Unit>> f15246p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends Function1<Object, Unit>> list) {
            super(1);
            this.f15246p0 = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            List<Function1<Object, Unit>> list = this.f15246p0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).invoke(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Snapshot.kt */
    @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedMutableSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2431:1\n1843#2:2432\n89#3:2433\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedMutableSnapshot$1\n*L\n1467#1:2432\n1467#1:2433\n*E\n"})
    public static final class b extends Lambda implements Function1<SnapshotIdSet, MutableSnapshot> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Object, Unit> f15247p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Object, Unit> f15248q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
            super(1);
            this.f15247p0 = function1;
            this.f15248q0 = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final MutableSnapshot invoke(SnapshotIdSet snapshotIdSet) {
            int i10;
            SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
            synchronized (SnapshotKt.getLock()) {
                i10 = SnapshotKt.f15293e;
                SnapshotKt.f15293e = i10 + 1;
            }
            return new MutableSnapshot(i10, snapshotIdSet2, this.f15247p0, this.f15248q0);
        }
    }

    /* JADX INFO: compiled from: Snapshot.kt */
    @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2431:1\n1843#2:2432\n89#3:2433\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedSnapshot$1\n*L\n1456#1:2432\n1456#1:2433\n*E\n"})
    public static final class c extends Lambda implements Function1<SnapshotIdSet, ReadonlySnapshot> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Object, Unit> f15249p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1<Object, Unit> function1) {
            super(1);
            this.f15249p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ReadonlySnapshot invoke(SnapshotIdSet snapshotIdSet) {
            int i10;
            SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
            synchronized (SnapshotKt.getLock()) {
                i10 = SnapshotKt.f15293e;
                SnapshotKt.f15293e = i10 + 1;
            }
            return new ReadonlySnapshot(i10, snapshotIdSet2, this.f15249p0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GlobalSnapshot(int i10, @NotNull SnapshotIdSet snapshotIdSet) {
        Function1 aVar;
        synchronized (SnapshotKt.getLock()) {
            List list = SnapshotKt.f15297i;
            aVar = (Function1) CollectionsKt___CollectionsKt.singleOrNull(list);
            aVar = aVar == null ? new a(list) : aVar;
        }
        super(i10, snapshotIdSet, null, aVar);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @NotNull
    public SnapshotApplyResult apply() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    /* JADX INFO: renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2166nestedActivated$runtime_release(@NotNull Snapshot snapshot) {
        throw h.f();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2167nestedDeactivated$runtime_release(@NotNull Snapshot snapshot) {
        throw h.f();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        SnapshotKt.a(s0.c.f93119p0);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @NotNull
    public MutableSnapshot takeNestedMutableSnapshot(@Nullable Function1<Object, Unit> readObserver, @Nullable Function1<Object, Unit> writeObserver) {
        return (MutableSnapshot) SnapshotKt.access$takeNewSnapshot(new b(readObserver, writeObserver));
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot takeNestedSnapshot(@Nullable Function1<Object, Unit> readObserver) {
        return SnapshotKt.access$takeNewSnapshot(new c(readObserver));
    }
}
