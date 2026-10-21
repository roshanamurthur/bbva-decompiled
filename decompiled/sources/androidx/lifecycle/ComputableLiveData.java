package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ComputableLiveData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000f\u0010\u0005\u001a\u00028\u0000H%¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u0012\u0004\b\"\u0010 ¨\u0006%"}, d2 = {"Landroidx/lifecycle/ComputableLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "invalidate", "compute", "()Ljava/lang/Object;", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "getExecutor$lifecycle_livedata_release", "()Ljava/util/concurrent/Executor;", "executor", "Landroidx/lifecycle/LiveData;", "b", "Landroidx/lifecycle/LiveData;", "getLiveData", "()Landroidx/lifecycle/LiveData;", "liveData", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInvalid$lifecycle_livedata_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", "d", "getComputing$lifecycle_livedata_release", "computing", "Ljava/lang/Runnable;", "refreshRunnable", "Ljava/lang/Runnable;", "getRefreshRunnable$lifecycle_livedata_release$annotations", "()V", "invalidationRunnable", "getInvalidationRunnable$lifecycle_livedata_release$annotations", "<init>", "(Ljava/util/concurrent/Executor;)V", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class ComputableLiveData<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComputableLiveData$_liveData$1 f21825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean invalid;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean computing;

    @JvmField
    @NotNull
    public final Runnable invalidationRunnable;

    @JvmField
    @NotNull
    public final Runnable refreshRunnable;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ComputableLiveData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @WorkerThread
    public abstract T compute();

    @NotNull
    /* JADX INFO: renamed from: getComputing$lifecycle_livedata_release, reason: from getter */
    public final AtomicBoolean getComputing() {
        return this.computing;
    }

    @NotNull
    /* JADX INFO: renamed from: getExecutor$lifecycle_livedata_release, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    @NotNull
    /* JADX INFO: renamed from: getInvalid$lifecycle_livedata_release, reason: from getter */
    public final AtomicBoolean getInvalid() {
        return this.invalid;
    }

    @NotNull
    public LiveData<T> getLiveData() {
        return this.f21825b;
    }

    public void invalidate() {
        ArchTaskExecutor.getInstance().executeOnMainThread(this.invalidationRunnable);
    }

    @JvmOverloads
    public ComputableLiveData(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
        this.f21825b = new LiveData<T>(this) { // from class: androidx.lifecycle.ComputableLiveData$_liveData$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ComputableLiveData<T> f21828a;

            {
                this.f21828a = this;
            }

            @Override // androidx.lifecycle.LiveData
            public void onActive() {
                ComputableLiveData<T> computableLiveData = this.f21828a;
                computableLiveData.getExecutor().execute(computableLiveData.refreshRunnable);
            }
        };
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.refreshRunnable = new androidx.compose.ui.platform.j(this, 3);
        this.invalidationRunnable = new b(this, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ComputableLiveData(Executor executor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            executor = ArchTaskExecutor.getIOThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(executor, "getIOThreadExecutor()");
        }
        this(executor);
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata_release$annotations() {
    }
}
