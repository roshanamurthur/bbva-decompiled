package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class DeferrableSurfaces {
    private DeferrableSurfaces() {
    }

    public static void decrementAll(@NonNull List<DeferrableSurface> list) {
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().decrementUseCount();
        }
    }

    public static void incrementAll(@NonNull List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        if (list.isEmpty()) {
            return;
        }
        int i10 = 0;
        do {
            try {
                list.get(i10).incrementUseCount();
                i10++;
            } catch (DeferrableSurface.SurfaceClosedException e5) {
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    list.get(i11).decrementUseCount();
                }
                throw e5;
            }
        } while (i10 < list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$surfaceListWithTimeout$0(ListenableFuture listenableFuture, CallbackToFutureAdapter.Completer completer, long j10) {
        if (listenableFuture.isDone()) {
            return;
        }
        completer.setException(new TimeoutException(v.c("Cannot complete surfaceList within ", j10)));
        listenableFuture.cancel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$surfaceListWithTimeout$1(Executor executor, final ListenableFuture listenableFuture, final CallbackToFutureAdapter.Completer completer, final long j10) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.impl.r
            @Override // java.lang.Runnable
            public final void run() {
                DeferrableSurfaces.lambda$surfaceListWithTimeout$0(listenableFuture, completer, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$surfaceListWithTimeout$3(List list, ScheduledExecutorService scheduledExecutorService, final Executor executor, final long j10, final boolean z10, final CallbackToFutureAdapter.Completer completer) throws Exception {
        final ListenableFuture listenableFutureSuccessfulAsList = Futures.successfulAsList(list);
        final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: androidx.camera.core.impl.s
            @Override // java.lang.Runnable
            public final void run() {
                DeferrableSurfaces.lambda$surfaceListWithTimeout$1(executor, listenableFutureSuccessfulAsList, completer, j10);
            }
        }, j10, TimeUnit.MILLISECONDS);
        completer.addCancellationListener(new t(listenableFutureSuccessfulAsList, 0), executor);
        Futures.addCallback(listenableFutureSuccessfulAsList, new FutureCallback<List<Surface>>() { // from class: androidx.camera.core.impl.DeferrableSurfaces.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                completer.set(Collections.unmodifiableList(Collections.emptyList()));
                scheduledFutureSchedule.cancel(true);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable List<Surface> list2) {
                ArrayList arrayList = new ArrayList(list2);
                if (z10) {
                    arrayList.removeAll(Collections.singleton(null));
                }
                completer.set(arrayList);
                scheduledFutureSchedule.cancel(true);
            }
        }, executor);
        return "surfaceList";
    }

    @NonNull
    public static ListenableFuture<List<Surface>> surfaceListWithTimeout(@NonNull Collection<DeferrableSurface> collection, final boolean z10, final long j10, @NonNull final Executor executor, @NonNull final ScheduledExecutorService scheduledExecutorService) {
        final ArrayList arrayList = new ArrayList();
        Iterator<DeferrableSurface> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Futures.nonCancellationPropagating(it.next().getSurface()));
        }
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.u
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return DeferrableSurfaces.lambda$surfaceListWithTimeout$3(arrayList, scheduledExecutorService, executor, j10, z10, completer);
            }
        });
    }

    public static boolean tryIncrementAll(@NonNull List<DeferrableSurface> list) {
        try {
            incrementAll(list);
            return true;
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            return false;
        }
    }
}
