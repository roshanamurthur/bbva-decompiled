package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface Observable<T> {

    public interface Observer<T> {
        void onError(@NonNull Throwable th2);

        void onNewData(@Nullable T t10);
    }

    void addObserver(@NonNull Executor executor, @NonNull Observer<? super T> observer);

    @NonNull
    ListenableFuture<T> fetchData();

    void removeObserver(@NonNull Observer<? super T> observer);
}
