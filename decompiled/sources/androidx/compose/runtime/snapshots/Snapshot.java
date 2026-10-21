package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.ExperimentalComposeApi;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.sharedstorage.ConstantsKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 Y2\u00020\u0001:\u0001YJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0006\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H&J\b\u0010\b\u001a\u00020\u0007H&J$\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086\b¢\u0006\u0004\b\f\u0010\rJ\n\u0010\u000e\u001a\u0004\u0018\u00010\u0000H\u0011J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0000H\u0011J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0007J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0007J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0000H ¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0000H ¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H ¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0002H ¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010$\u001a\u00020\u0002H\u0010¢\u0006\u0004\b#\u0010\u001fJ\u000f\u0010&\u001a\u00020\u0002H\u0010¢\u0006\u0004\b%\u0010\u001fJ\u000f\u0010(\u001a\u00020\u0002H\u0000¢\u0006\u0004\b'\u0010\u001fJ\u000f\u0010*\u001a\u00020\u0002H\u0000¢\u0006\u0004\b)\u0010\u001fJ\u000f\u0010.\u001a\u00020+H\u0000¢\u0006\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010=\u001a\u00020+2\u0006\u00107\u001a\u00020+8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010-\"\u0004\b;\u0010<R\"\u0010D\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010H\u001a\u00020+2\u0006\u0010E\u001a\u00020+8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bF\u0010-\"\u0004\bG\u0010<R\u0014\u0010K\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010AR\u0015\u0010O\u001a\u00020\u00078À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010AR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048 X¡\u0004¢\u0006\f\u0012\u0004\bR\u0010\u001f\u001a\u0004\bP\u0010QR\"\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048 X \u0004¢\u0006\u0006\u001a\u0004\bS\u0010QR\u001c\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010U8 X \u0004¢\u0006\u0006\u001a\u0004\bV\u0010W\u0082\u0001\u0004Z[\\]¨\u0006^"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot;", "", "", "dispose", "Lkotlin/Function1;", "readObserver", "takeNestedSnapshot", "", "hasPendingChanges", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "block", "enter", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "makeCurrent", "snapshot", "restoreCurrent", "unsafeEnter", "oldSnapshot", "unsafeLeave", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "closeAndReleasePinning$runtime_release", "closeAndReleasePinning", "closeLocked$runtime_release", "closeLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "releasePinnedSnapshotsForCloseLocked", "validateNotDisposed$runtime_release", "validateNotDisposed", "releasePinnedSnapshotLocked$runtime_release", "releasePinnedSnapshotLocked", "", "takeoverPinnedSnapshot$runtime_release", "()I", "takeoverPinnedSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "a", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "<set-?>", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "setId$runtime_release", "(I)V", "id", "c", "Z", "getDisposed$runtime_release", "()Z", "setDisposed$runtime_release", "(Z)V", "disposed", "value", "getWriteCount$runtime_release", "setWriteCount$runtime_release", "writeCount", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "getReadOnly", "readOnly", "isPinned$runtime_release", "isPinned", "getReadObserver", "()Lkotlin/jvm/functions/Function1;", "getReadObserver$annotations", "getWriteObserver$runtime_release", "writeObserver", "Landroidx/collection/MutableScatterSet;", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "modified", "Companion", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2431:1\n1843#2:2432\n1843#2:2441\n89#3:2433\n89#3:2442\n50#4,7:2434\n33#4,7:2443\n1#5:2450\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n100#1:2432\n251#1:2441\n100#1:2433\n251#1:2442\n186#1:2434,7\n280#1:2443,7\n*E\n"})
public abstract class Snapshot {
    public static final int PreexistingSnapshotId = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public SnapshotIdSet invalid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean disposed;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15269d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public Snapshot(int i10, SnapshotIdSet snapshotIdSet, DefaultConstructorMarker defaultConstructorMarker) {
        this.invalid = snapshotIdSet;
        this.id = i10;
        this.f15269d = i10 != 0 ? SnapshotKt.trackPinning(i10, getInvalid()) : -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Snapshot takeNestedSnapshot$default(Snapshot snapshot, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        return snapshot.takeNestedSnapshot(function1);
    }

    public final void closeAndReleasePinning$runtime_release() {
        synchronized (SnapshotKt.getLock()) {
            closeLocked$runtime_release();
            releasePinnedSnapshotsForCloseLocked$runtime_release();
            Unit unit = Unit.INSTANCE;
        }
    }

    public void closeLocked$runtime_release() {
        SnapshotKt.f15292d = SnapshotKt.f15292d.clear(getId());
    }

    public void dispose() {
        this.disposed = true;
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final <T> T enter(@NotNull Function0<? extends T> block) {
        Snapshot snapshotMakeCurrent = makeCurrent();
        try {
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            restoreCurrent(snapshotMakeCurrent);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: getDisposed$runtime_release, reason: from getter */
    public final boolean getDisposed() {
        return this.disposed;
    }

    public int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: getInvalid$runtime_release, reason: from getter */
    public SnapshotIdSet getInvalid() {
        return this.invalid;
    }

    @Nullable
    public abstract MutableScatterSet<StateObject> getModified$runtime_release();

    @Nullable
    public abstract Function1<Object, Unit> getReadObserver();

    public abstract boolean getReadOnly();

    @NotNull
    public abstract Snapshot getRoot();

    public int getWriteCount$runtime_release() {
        return 0;
    }

    @Nullable
    public abstract Function1<Object, Unit> getWriteObserver$runtime_release();

    public abstract boolean hasPendingChanges();

    public final boolean isPinned$runtime_release() {
        return this.f15269d >= 0;
    }

    @PublishedApi
    @Nullable
    public Snapshot makeCurrent() {
        Snapshot snapshot = (Snapshot) SnapshotKt.f15290b.get();
        SnapshotKt.f15290b.set(this);
        return snapshot;
    }

    /* JADX INFO: renamed from: nestedActivated$runtime_release */
    public abstract void mo2166nestedActivated$runtime_release(@NotNull Snapshot snapshot);

    /* JADX INFO: renamed from: nestedDeactivated$runtime_release */
    public abstract void mo2167nestedDeactivated$runtime_release(@NotNull Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime_release();

    /* JADX INFO: renamed from: recordModified$runtime_release */
    public abstract void mo2168recordModified$runtime_release(@NotNull StateObject state);

    public final void releasePinnedSnapshotLocked$runtime_release() {
        int i10 = this.f15269d;
        if (i10 >= 0) {
            SnapshotKt.releasePinningLocked(i10);
            this.f15269d = -1;
        }
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePinnedSnapshotLocked$runtime_release();
    }

    @PublishedApi
    public void restoreCurrent(@Nullable Snapshot snapshot) {
        SnapshotKt.f15290b.set(snapshot);
    }

    public final void setDisposed$runtime_release(boolean z10) {
        this.disposed = z10;
    }

    public void setId$runtime_release(int i10) {
        this.id = i10;
    }

    public void setInvalid$runtime_release(@NotNull SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
    }

    public void setWriteCount$runtime_release(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    @NotNull
    public abstract Snapshot takeNestedSnapshot(@Nullable Function1<Object, Unit> readObserver);

    public final int takeoverPinnedSnapshot$runtime_release() {
        int i10 = this.f15269d;
        this.f15269d = -1;
        return i10;
    }

    @ExperimentalComposeApi
    @Nullable
    public final Snapshot unsafeEnter() {
        return makeCurrent();
    }

    @ExperimentalComposeApi
    public final void unsafeLeave(@Nullable Snapshot oldSnapshot) {
        if (!(SnapshotKt.f15290b.get() == this)) {
            PreconditionsKt.throwIllegalStateException("Cannot leave snapshot; " + this + " is not the current snapshot");
        }
        restoreCurrent(oldSnapshot);
    }

    public final void validateNotDisposed$runtime_release() {
        if (!this.disposed) {
            return;
        }
        PreconditionsKt.throwIllegalArgumentException("Cannot use a disposed snapshot");
    }

    /* JADX INFO: compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b4\u0010/J\u001e\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J6\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J$\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\b¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\b¢\u0006\u0004\b\u0010\u0010\u000eJQ\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0005H\u0001J\u0012\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0001J0\u0010\u0018\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0001J6\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\b\u0019H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u001a\u0010\u000eJ&\u0010\u001e\u001a\u00020\u001d2\u001e\u0010\u0017\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u001bJ\u001a\u0010\u001f\u001a\u00020\u001d2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010 \u001a\u00020\u0003J\u0006\u0010!\u001a\u00020\u0003J\b\u0010#\u001a\u00020\"H\u0007J\n\u0010$\u001a\u0004\u0018\u00010\u0005H\u0001J\u0012\u0010%\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0001R\u0011\u0010(\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010*\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b,\u0010+R\u001c\u00100\u001a\u0004\u0018\u00010\u00058@X\u0081\u0004¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010'R\u001a\u00101\u001a\u00020\"8\u0006X\u0086T¢\u0006\f\n\u0004\b1\u00102\u0012\u0004\b3\u0010/¨\u00065"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "", "Lkotlin/Function1;", "", "readObserver", "Landroidx/compose/runtime/snapshots/Snapshot;", "takeSnapshot", "writeObserver", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "takeMutableSnapshot", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "block", ConstantsKt.SCOPE_DEFAULT, "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "R", "withMutableSnapshot", "observe", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "createNonObservableSnapshot", "previous", "makeCurrentNonObservable", "nonObservable", "observer", "restoreNonObservable", "Landroidx/compose/runtime/DisallowComposableCalls;", "withoutReadObservation", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "registerApplyObserver", "registerGlobalWriteObserver", "notifyObjectsInitialized", "sendApplyNotifications", "", "openSnapshotCount", "removeCurrent", "restoreCurrent", "getCurrent", "()Landroidx/compose/runtime/snapshots/Snapshot;", "current", "", "isInSnapshot", "()Z", "isApplyObserverNotificationPending", "getCurrentThreadSnapshot", "getCurrentThreadSnapshot$annotations", "()V", "currentThreadSnapshot", "PreexistingSnapshotId", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPreexistingSnapshotId$annotations", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2431:1\n547#1:2438\n547#1:2444\n550#1:2445\n1#2:2432\n138#3,5:2433\n138#3,5:2439\n1843#4:2446\n1843#4:2448\n1843#4:2450\n1843#4:2452\n1843#4:2454\n89#5:2447\n89#5:2449\n89#5:2451\n89#5:2453\n89#5:2455\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n493#1:2438\n555#1:2444\n559#1:2445\n462#1:2433,5\n529#1:2439,5\n623#1:2446\n650#1:2448\n688#1:2450\n627#1:2452\n655#1:2454\n623#1:2447\n650#1:2449\n688#1:2451\n627#1:2453\n655#1:2455\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object observe$default(Companion companion, Function1 function1, Function1 function2, Function0 function0, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                function1 = null;
            }
            if ((i10 & 2) != 0) {
                function2 = null;
            }
            return companion.observe(function1, function2, function0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MutableSnapshot takeMutableSnapshot$default(Companion companion, Function1 function1, Function1 function2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                function1 = null;
            }
            if ((i10 & 2) != 0) {
                function2 = null;
            }
            return companion.takeMutableSnapshot(function1, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Snapshot takeSnapshot$default(Companion companion, Function1 function1, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                function1 = null;
            }
            return companion.takeSnapshot(function1);
        }

        @PublishedApi
        @NotNull
        public final Snapshot createNonObservableSnapshot() {
            return SnapshotKt.c((Snapshot) SnapshotKt.f15290b.get(), null, false);
        }

        @NotNull
        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        @Nullable
        public final Snapshot getCurrentThreadSnapshot() {
            return (Snapshot) SnapshotKt.f15290b.get();
        }

        public final <T> T global(@NotNull Function0<? extends T> block) {
            Snapshot snapshotRemoveCurrent = removeCurrent();
            T tInvoke = block.invoke();
            Snapshot.INSTANCE.restoreCurrent(snapshotRemoveCurrent);
            return tInvoke;
        }

        public final boolean isApplyObserverNotificationPending() {
            return SnapshotKt.f15300l.get() > 0;
        }

        public final boolean isInSnapshot() {
            return SnapshotKt.f15290b.get() != null;
        }

        @PublishedApi
        @NotNull
        public final Snapshot makeCurrentNonObservable(@Nullable Snapshot previous) {
            if (previous instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot = (TransparentObserverMutableSnapshot) previous;
                if (transparentObserverMutableSnapshot.getThreadId() == ActualJvm_jvmKt.currentThreadId()) {
                    transparentObserverMutableSnapshot.setReadObserver(null);
                    return previous;
                }
            }
            if (previous instanceof TransparentObserverSnapshot) {
                TransparentObserverSnapshot transparentObserverSnapshot = (TransparentObserverSnapshot) previous;
                if (transparentObserverSnapshot.getThreadId() == ActualJvm_jvmKt.currentThreadId()) {
                    transparentObserverSnapshot.setReadObserver(null);
                    return previous;
                }
            }
            Snapshot snapshotC = SnapshotKt.c(previous, null, false);
            snapshotC.makeCurrent();
            return snapshotC;
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime_release();
        }

        public final <T> T observe(@Nullable Function1<Object, Unit> readObserver, @Nullable Function1<Object, Unit> writeObserver, @NotNull Function0<? extends T> block) {
            Snapshot transparentObserverMutableSnapshot;
            if (readObserver == null && writeObserver == null) {
                return block.invoke();
            }
            Snapshot snapshot = (Snapshot) SnapshotKt.f15290b.get();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.getThreadId() == ActualJvm_jvmKt.currentThreadId()) {
                    Function1<Object, Unit> readObserver$runtime_release = transparentObserverMutableSnapshot2.getReadObserver();
                    Function1<Object, Unit> writeObserver$runtime_release = transparentObserverMutableSnapshot2.getWriteObserver$runtime_release();
                    try {
                        ((TransparentObserverMutableSnapshot) snapshot).setReadObserver(SnapshotKt.d(readObserver, readObserver$runtime_release));
                        ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver(SnapshotKt.access$mergedWriteObserver(writeObserver, writeObserver$runtime_release));
                        return block.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.setReadObserver(readObserver$runtime_release);
                        transparentObserverMutableSnapshot2.setWriteObserver(writeObserver$runtime_release);
                    }
                }
            }
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, readObserver, writeObserver, true, false);
            } else {
                if (readObserver == null) {
                    return block.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(readObserver);
            }
            try {
                Snapshot snapshotMakeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    T tInvoke = block.invoke();
                    transparentObserverMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    transparentObserverMutableSnapshot.dispose();
                    return tInvoke;
                } catch (Throwable th2) {
                    transparentObserverMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th2;
                }
            } catch (Throwable th3) {
                transparentObserverMutableSnapshot.dispose();
                throw th3;
            }
        }

        @InternalComposeApi
        public final int openSnapshotCount() {
            return CollectionsKt___CollectionsKt.toList(SnapshotKt.f15292d).size();
        }

        @NotNull
        public final ObserverHandle registerApplyObserver(@NotNull final Function2<? super Set<? extends Object>, ? super Snapshot, Unit> observer) {
            SnapshotKt.a(SnapshotKt.f15289a);
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.f15296h = CollectionsKt___CollectionsKt.plus((Collection<? extends Function2<? super Set<? extends Object>, ? super Snapshot, Unit>>) SnapshotKt.f15296h, observer);
                Unit unit = Unit.INSTANCE;
            }
            return new ObserverHandle() { // from class: s0.a
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Function2 function2 = observer;
                    synchronized (SnapshotKt.getLock()) {
                        SnapshotKt.f15296h = CollectionsKt___CollectionsKt.minus(SnapshotKt.f15296h, function2);
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            };
        }

        @NotNull
        public final ObserverHandle registerGlobalWriteObserver(@NotNull final Function1<Object, Unit> observer) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.f15297i = CollectionsKt___CollectionsKt.plus((Collection<? extends Function1<Object, Unit>>) SnapshotKt.f15297i, observer);
                Unit unit = Unit.INSTANCE;
            }
            SnapshotKt.a(s0.c.f93119p0);
            return new ObserverHandle() { // from class: s0.b
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Function1 function1 = observer;
                    synchronized (SnapshotKt.getLock()) {
                        SnapshotKt.f15297i = CollectionsKt___CollectionsKt.minus(SnapshotKt.f15297i, function1);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    SnapshotKt.a(c.f93119p0);
                }
            };
        }

        @PublishedApi
        @Nullable
        public final Snapshot removeCurrent() {
            Snapshot snapshot = (Snapshot) SnapshotKt.f15290b.get();
            if (snapshot != null) {
                SnapshotKt.f15290b.set(null);
            }
            return snapshot;
        }

        @PublishedApi
        public final void restoreCurrent(@Nullable Snapshot previous) {
            if (previous != null) {
                SnapshotKt.f15290b.set(previous);
            }
        }

        @PublishedApi
        public final void restoreNonObservable(@Nullable Snapshot previous, @NotNull Snapshot nonObservable, @Nullable Function1<Object, Unit> observer) {
            if (previous != nonObservable) {
                nonObservable.restoreCurrent(previous);
                nonObservable.dispose();
            } else if (previous instanceof TransparentObserverMutableSnapshot) {
                ((TransparentObserverMutableSnapshot) previous).setReadObserver(observer);
            } else if (previous instanceof TransparentObserverSnapshot) {
                ((TransparentObserverSnapshot) previous).setReadObserver(observer);
            } else {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + previous).toString());
            }
        }

        public final void sendApplyNotifications() {
            boolean z10;
            synchronized (SnapshotKt.getLock()) {
                MutableScatterSet<StateObject> modified$runtime_release = ((GlobalSnapshot) SnapshotKt.f15298j.get()).getModified$runtime_release();
                z10 = false;
                if (modified$runtime_release != null && modified$runtime_release.isNotEmpty()) {
                    z10 = true;
                }
            }
            if (z10) {
                SnapshotKt.a(s0.c.f93119p0);
            }
        }

        @NotNull
        public final MutableSnapshot takeMutableSnapshot(@Nullable Function1<Object, Unit> readObserver, @Nullable Function1<Object, Unit> writeObserver) {
            MutableSnapshot mutableSnapshotTakeNestedMutableSnapshot;
            Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot = snapshotCurrentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshotCurrentSnapshot : null;
            if (mutableSnapshot == null || (mutableSnapshotTakeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(readObserver, writeObserver)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            return mutableSnapshotTakeNestedMutableSnapshot;
        }

        @NotNull
        public final Snapshot takeSnapshot(@Nullable Function1<Object, Unit> readObserver) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(readObserver);
        }

        public final <R> R withMutableSnapshot(@NotNull Function0<? extends R> block) {
            MutableSnapshot mutableSnapshotTakeMutableSnapshot$default = takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot$default.makeCurrent();
                try {
                    R rInvoke = block.invoke();
                    InlineMarker.finallyStart(1);
                    mutableSnapshotTakeMutableSnapshot$default.restoreCurrent(snapshotMakeCurrent);
                    InlineMarker.finallyEnd(1);
                    mutableSnapshotTakeMutableSnapshot$default.apply().check();
                    InlineMarker.finallyStart(1);
                    mutableSnapshotTakeMutableSnapshot$default.dispose();
                    return rInvoke;
                } finally {
                    InlineMarker.finallyStart(1);
                    mutableSnapshotTakeMutableSnapshot$default.restoreCurrent(snapshotMakeCurrent);
                    InlineMarker.finallyEnd(1);
                }
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                mutableSnapshotTakeMutableSnapshot$default.dispose();
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }

        public final <T> T withoutReadObservation(@NotNull Function0<? extends T> block) {
            Snapshot currentThreadSnapshot = getCurrentThreadSnapshot();
            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = makeCurrentNonObservable(currentThreadSnapshot);
            try {
                return block.invoke();
            } finally {
                InlineMarker.finallyStart(1);
                restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                InlineMarker.finallyEnd(1);
            }
        }

        @PublishedApi
        public static /* synthetic */ void getCurrentThreadSnapshot$annotations() {
        }

        public static /* synthetic */ void getPreexistingSnapshotId$annotations() {
        }
    }

    @PublishedApi
    public static /* synthetic */ void getReadObserver$annotations() {
    }
}
