package com.bbva.notifications.activity;

import android.content.Intent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
@DebugMetadata(c = "com.bbva.notifications.activity.NotificationActivity$onNewIntent$1$1", f = "NotificationActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Intent f35327p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ NotificationActivity f35328q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Intent intent, NotificationActivity notificationActivity, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f35327p0 = intent;
        this.f35328q0 = notificationActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f35327p0, this.f35328q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f35327p0 != null) {
            NotificationActivity.access$handleDeepLink(this.f35328q0);
        }
        return Unit.INSTANCE;
    }
}
