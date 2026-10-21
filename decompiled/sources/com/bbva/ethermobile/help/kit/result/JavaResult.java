package com.bbva.ethermobile.help.kit.result;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobile.help.kit.callback.EtherCallback;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JavaResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/bbva/ethermobile/help/kit/result/JavaResult;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", "q0", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "Lcom/bbva/ethermobile/help/kit/callback/EtherCallback;", "callback", "<init>", "(Lcom/bbva/ethermobile/help/kit/callback/EtherCallback;)V", "help-kit_release"}, k = 1, mv = {1, 9, 0})
public final class JavaResult<T> implements Continuation<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final EtherCallback<T> f29272p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    public JavaResult(@NotNull EtherCallback<T> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f29272p0 = callback;
        this.context = CoroutineScopeKt.MainScope().getCoroutineContext();
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.context;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object result) {
        if (kotlin.Result.m5540isFailureimpl(result)) {
            result = null;
        }
        if (result != null) {
            this.f29272p0.success((T) result);
        }
    }
}
