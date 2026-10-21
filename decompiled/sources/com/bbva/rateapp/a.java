package com.bbva.rateapp;

import com.bbva.ethermobile.help.kit.result.Result;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InAppReview.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a<TResult> implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Continuation<Result<Unit>> f36365a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Continuation<? super Result<Unit>> continuation) {
        this.f36365a = continuation;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NotNull Task<Void> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        boolean zIsSuccessful = it.isSuccessful();
        Continuation<Result<Unit>> continuation = this.f36365a;
        if (zIsSuccessful) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m5535constructorimpl(new Result.Success(Unit.INSTANCE)));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m5535constructorimpl(new Result.Error(new Throwable(it.getException()))));
        }
    }
}
