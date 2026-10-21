package androidx.camera.core.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
class ListFuture<V> implements ListenableFuture<List<V>> {
    private final boolean mAllMustSucceed;

    @Nullable
    List<? extends ListenableFuture<? extends V>> mFutures;

    @NonNull
    private final AtomicInteger mRemaining;

    @NonNull
    private final ListenableFuture<List<V>> mResult = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver<List<V>>() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.1
        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
        public Object attachCompleter(@NonNull CallbackToFutureAdapter.Completer<List<V>> completer) {
            Preconditions.checkState(ListFuture.this.mResultNotifier == null, "The result can only set once!");
            ListFuture.this.mResultNotifier = completer;
            return "ListFuture[" + this + Constant.BRACKET_CLOSE;
        }
    });
    CallbackToFutureAdapter.Completer<List<V>> mResultNotifier;

    @Nullable
    List<V> mValues;

    public ListFuture(@NonNull List<? extends ListenableFuture<? extends V>> list, boolean z10, @NonNull Executor executor) {
        this.mFutures = (List) Preconditions.checkNotNull(list);
        this.mValues = new ArrayList(list.size());
        this.mAllMustSucceed = z10;
        this.mRemaining = new AtomicInteger(list.size());
        init(executor);
    }

    private void callAllGets() throws InterruptedException {
        List<? extends ListenableFuture<? extends V>> list = this.mFutures;
        if (list == null || isDone()) {
            return;
        }
        for (ListenableFuture<? extends V> listenableFuture : list) {
            while (!listenableFuture.isDone()) {
                try {
                    listenableFuture.get();
                } catch (Error e5) {
                    throw e5;
                } catch (InterruptedException e7) {
                    throw e7;
                } catch (Throwable unused) {
                    if (this.mAllMustSucceed) {
                        return;
                    }
                }
            }
        }
    }

    private void init(@NonNull Executor executor) {
        addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.2
            @Override // java.lang.Runnable
            public void run() {
                ListFuture listFuture = ListFuture.this;
                listFuture.mValues = null;
                listFuture.mFutures = null;
            }
        }, CameraXExecutors.directExecutor());
        if (this.mFutures.isEmpty()) {
            this.mResultNotifier.set(new ArrayList(this.mValues));
            return;
        }
        for (int i10 = 0; i10 < this.mFutures.size(); i10++) {
            this.mValues.add(null);
        }
        List<? extends ListenableFuture<? extends V>> list = this.mFutures;
        for (final int i11 = 0; i11 < list.size(); i11++) {
            final ListenableFuture<? extends V> listenableFuture = list.get(i11);
            listenableFuture.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.3
                @Override // java.lang.Runnable
                public void run() {
                    ListFuture.this.setOneValue(i11, listenableFuture);
                }
            }, executor);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.mResult.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        List<? extends ListenableFuture<? extends V>> list = this.mFutures;
        if (list != null) {
            Iterator<? extends ListenableFuture<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z10);
            }
        }
        return this.mResult.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.mResult.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mResult.isDone();
    }

    public void setOneValue(int i10, @NonNull Future<? extends V> future) {
        List<V> list;
        CallbackToFutureAdapter.Completer<List<V>> completer;
        ArrayList arrayList;
        List<V> list2;
        List<V> list3;
        List<V> list4;
        List<V> list5;
        List<V> list6 = this.mValues;
        if (isDone() || list6 == null) {
            Preconditions.checkState(this.mAllMustSucceed, "Future was done before all dependencies completed");
            return;
        }
        try {
            Preconditions.checkState(future.isDone(), "Tried to set value from future which is not done");
            list6.set(i10, (V) Futures.getUninterruptibly(future));
            int iDecrementAndGet = this.mRemaining.decrementAndGet();
            Preconditions.checkState(iDecrementAndGet >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet == 0) {
                if (list5 != null) {
                    completer = this.mResultNotifier;
                    arrayList = new ArrayList(list5);
                    completer.set(arrayList);
                }
            }
        } catch (RuntimeException e5) {
            if (this.mAllMustSucceed) {
                this.mResultNotifier.setException(e5);
            }
            int iDecrementAndGet2 = this.mRemaining.decrementAndGet();
            Preconditions.checkState(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet2 == 0) {
                if (list4 != null) {
                    completer = this.mResultNotifier;
                    arrayList = new ArrayList(list4);
                }
            }
        } catch (ExecutionException e7) {
            if (this.mAllMustSucceed) {
                this.mResultNotifier.setException(e7.getCause());
            }
            int iDecrementAndGet3 = this.mRemaining.decrementAndGet();
            Preconditions.checkState(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet3 == 0) {
                if (list3 != null) {
                    completer = this.mResultNotifier;
                    arrayList = new ArrayList(list3);
                }
            }
        } catch (Error e10) {
            this.mResultNotifier.setException(e10);
            int iDecrementAndGet4 = this.mRemaining.decrementAndGet();
            Preconditions.checkState(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet4 == 0) {
                if (list2 != null) {
                    completer = this.mResultNotifier;
                    arrayList = new ArrayList(list2);
                }
            }
        } catch (CancellationException unused) {
            if (this.mAllMustSucceed) {
                cancel(false);
            }
            int iDecrementAndGet5 = this.mRemaining.decrementAndGet();
            Preconditions.checkState(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet5 == 0) {
                if (list != null) {
                    completer = this.mResultNotifier;
                    arrayList = new ArrayList(list);
                }
            }
        } finally {
            int iDecrementAndGet6 = this.mRemaining.decrementAndGet();
            Preconditions.checkState(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet6 == 0) {
                List<V> list7 = this.mValues;
                if (list7 != null) {
                    this.mResultNotifier.set(new ArrayList(list7));
                } else {
                    Preconditions.checkState(isDone());
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public List<V> get() throws ExecutionException, InterruptedException {
        callAllGets();
        return this.mResult.get();
    }

    @Override // java.util.concurrent.Future
    public List<V> get(long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.mResult.get(j10, timeUnit);
    }
}
