package com.bbva.push.firebase;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FirebasePushHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b<TResult> implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Continuation<Boolean> f36231a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Continuation<? super Boolean> continuation) {
        this.f36231a = continuation;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NotNull Task<Void> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        boolean zIsSuccessful = task.isSuccessful();
        Continuation<Boolean> continuation = this.f36231a;
        if (zIsSuccessful) {
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5535constructorimpl(Boolean.FALSE));
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            continuation.resumeWith(Result.m5535constructorimpl(Boolean.TRUE));
        }
    }
}
