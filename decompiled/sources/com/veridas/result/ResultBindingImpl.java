package com.veridas.result;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Binding.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J#\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0001\u0010\u000b*\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0002\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/veridas/result/ResultBindingImpl;", ExifInterface.LONGITUDE_EAST, "Lcom/veridas/result/ResultBinding;", "()V", "error", "Lcom/veridas/result/Err;", "getError", "()Lcom/veridas/result/Err;", "setError", "(Lcom/veridas/result/Err;)V", "bind", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/veridas/result/Result;", "(Lcom/veridas/result/Result;)Ljava/lang/Object;", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
@PublishedApi
public final class ResultBindingImpl<E> implements ResultBinding<E> {
    public Err<? extends E> error;

    @Override // com.veridas.result.ResultBinding
    public <V> V bind(@NotNull Result<? extends V, ? extends E> result) throws BindException {
        Intrinsics.checkNotNullParameter(result, "<this>");
        if (result instanceof Ok) {
            return (V) ((Ok) result).getValue();
        }
        if (!(result instanceof Err)) {
            throw new NoWhenBranchMatchedException();
        }
        setError((Err) result);
        throw BindException.INSTANCE;
    }

    @NotNull
    public final Err<E> getError() {
        Err<? extends E> err = this.error;
        if (err != null) {
            return err;
        }
        Intrinsics.throwUninitializedPropertyAccessException("error");
        return null;
    }

    public final void setError(@NotNull Err<? extends E> err) {
        Intrinsics.checkNotNullParameter(err, "<set-?>");
        this.error = err;
    }
}
