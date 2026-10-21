package com.bbva.glomohybrid.login.presentation.viewmodel.handler;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceManagerHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/viewmodel/handler/DeviceManagerHandler;", "", "", "onLoginSuccess", "onFetchCustomerSuccess", "Lkotlinx/coroutines/flow/Flow;", "", "isLoginCompleted", "<init>", "()V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class DeviceManagerHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f33747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f33748b;

    /* JADX INFO: compiled from: DeviceManagerHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.handler.DeviceManagerHandler$isLoginCompleted$1", f = "DeviceManagerHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ boolean f33749p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ boolean f33750q0;

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            a aVar = new a(3, continuation);
            aVar.f33749p0 = zBooleanValue;
            aVar.f33750q0 = zBooleanValue2;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.f33749p0 && this.f33750q0);
        }
    }

    public DeviceManagerHandler() {
        Boolean bool = Boolean.FALSE;
        this.f33747a = StateFlowKt.MutableStateFlow(bool);
        this.f33748b = StateFlowKt.MutableStateFlow(bool);
    }

    @NotNull
    public final Flow<Boolean> isLoginCompleted() {
        return FlowKt.flowCombine(this.f33747a, this.f33748b, new a(3, null));
    }

    public final void onFetchCustomerSuccess() {
        this.f33748b.setValue(Boolean.TRUE);
    }

    public final void onLoginSuccess() {
        this.f33747a.setValue(Boolean.TRUE);
    }
}
