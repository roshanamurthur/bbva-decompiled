package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class OperationImpl implements Operation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableLiveData<Operation.State> f24351a = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SettableFuture<Operation.State.SUCCESS> f24352b = SettableFuture.create();

    public OperationImpl() {
        setState(Operation.IN_PROGRESS);
    }

    @Override // androidx.work.Operation
    @NonNull
    public ListenableFuture<Operation.State.SUCCESS> getResult() {
        return this.f24352b;
    }

    @Override // androidx.work.Operation
    @NonNull
    public LiveData<Operation.State> getState() {
        return this.f24351a;
    }

    public void setState(@NonNull Operation.State state) {
        this.f24351a.postValue(state);
        boolean z10 = state instanceof Operation.State.SUCCESS;
        SettableFuture<Operation.State.SUCCESS> settableFuture = this.f24352b;
        if (z10) {
            settableFuture.set((Operation.State.SUCCESS) state);
        } else if (state instanceof Operation.State.FAILURE) {
            settableFuture.setException(((Operation.State.FAILURE) state).getThrowable());
        }
    }
}
