package androidx.room;

import android.annotation.SuppressLint;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.camera.core.imagecapture.m;
import androidx.camera.core.z;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RoomTrackingLiveData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B?\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0012\u0012\u000e\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020:09¢\u0006\u0004\b<\u0010=J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0005\u001a\u00020\u0003H\u0014R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010&\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u0017\u0010)\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u00102\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R\u0011\u00106\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006>"}, d2 = {"Landroidx/room/RoomTrackingLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "", "onActive", "onInactive", "Landroidx/room/RoomDatabase;", "a", "Landroidx/room/RoomDatabase;", "getDatabase", "()Landroidx/room/RoomDatabase;", "database", "", "c", "Z", "getInTransaction", "()Z", "inTransaction", "Ljava/util/concurrent/Callable;", "d", "Ljava/util/concurrent/Callable;", "getComputeFunction", "()Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/room/InvalidationTracker$Observer;", "e", "Landroidx/room/InvalidationTracker$Observer;", "getObserver", "()Landroidx/room/InvalidationTracker$Observer;", "observer", "Ljava/util/concurrent/atomic/AtomicBoolean;", "f", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInvalid", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", "g", "getComputing", "computing", "h", "getRegisteredObserver", "registeredObserver", "Ljava/lang/Runnable;", "i", "Ljava/lang/Runnable;", "getRefreshRunnable", "()Ljava/lang/Runnable;", "refreshRunnable", "j", "getInvalidationRunnable", "invalidationRunnable", "Ljava/util/concurrent/Executor;", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "queryExecutor", "Landroidx/room/InvalidationLiveDataContainer;", "container", "", "", "tableNames", "<init>", "(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationLiveDataContainer;ZLjava/util/concurrent/Callable;[Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"RestrictedApi"})
public final class RoomTrackingLiveData<T> extends LiveData<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f23331k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RoomDatabase database;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InvalidationLiveDataContainer f23333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean inTransaction;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Callable<T> computeFunction;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final RoomTrackingLiveData$observer$1 f23336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean invalid;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean computing;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean registeredObserver;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final z f23340i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final m f23341j;

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.room.RoomTrackingLiveData$observer$1] */
    public RoomTrackingLiveData(@NotNull RoomDatabase database, @NotNull InvalidationLiveDataContainer container, boolean z10, @NotNull Callable<T> computeFunction, @NotNull String[] tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.database = database;
        this.f23333b = container;
        this.inTransaction = z10;
        this.computeFunction = computeFunction;
        this.f23336e = new InvalidationTracker.Observer(tableNames) { // from class: androidx.room.RoomTrackingLiveData$observer$1
            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(@NotNull Set<String> tables) {
                Intrinsics.checkNotNullParameter(tables, "tables");
                ArchTaskExecutor.getInstance().executeOnMainThread(this.getInvalidationRunnable());
            }
        };
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.registeredObserver = new AtomicBoolean(false);
        this.f23340i = new z(this, 1);
        this.f23341j = new m(this, 1);
    }

    @NotNull
    public final Callable<T> getComputeFunction() {
        return this.computeFunction;
    }

    @NotNull
    public final AtomicBoolean getComputing() {
        return this.computing;
    }

    @NotNull
    public final RoomDatabase getDatabase() {
        return this.database;
    }

    public final boolean getInTransaction() {
        return this.inTransaction;
    }

    @NotNull
    public final AtomicBoolean getInvalid() {
        return this.invalid;
    }

    @NotNull
    public final Runnable getInvalidationRunnable() {
        return this.f23341j;
    }

    @NotNull
    public final InvalidationTracker.Observer getObserver() {
        return this.f23336e;
    }

    @NotNull
    public final Executor getQueryExecutor() {
        boolean z10 = this.inTransaction;
        RoomDatabase roomDatabase = this.database;
        return z10 ? roomDatabase.getTransactionExecutor() : roomDatabase.getQueryExecutor();
    }

    @NotNull
    public final Runnable getRefreshRunnable() {
        return this.f23340i;
    }

    @NotNull
    public final AtomicBoolean getRegisteredObserver() {
        return this.registeredObserver;
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        this.f23333b.onActive(this);
        getQueryExecutor().execute(this.f23340i);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        this.f23333b.onInactive(this);
    }
}
