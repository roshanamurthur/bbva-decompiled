package com.bbva.bridge.navigate;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebNavigateDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.bbva.bridge.navigate.WebNavigateDispatcher$navigationFlow$2", f = "WebNavigateDispatcher.kt", i = {0}, l = {77}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
public final class a extends SuspendLambda implements Function3<FlowCollector<? super WebNavigationState>, String, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f26654p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f26655q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public /* synthetic */ String f26656r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ String f26657s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, Continuation<? super a> continuation) {
        super(3, continuation);
        this.f26657s0 = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super WebNavigationState> flowCollector, String str, Continuation<? super Boolean> continuation) {
        a aVar = new a(this.f26657s0, continuation);
        aVar.f26655q0 = flowCollector;
        aVar.f26656r0 = str;
        return aVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String str;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f26654p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f26655q0;
            String str2 = this.f26656r0;
            WebNavigationState.Loaded loaded = new WebNavigationState.Loaded(str2);
            this.f26655q0 = str2;
            this.f26654p0 = 1;
            if (flowCollector.emit(loaded, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.f26655q0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(!Intrinsics.areEqual(str, this.f26657s0));
    }
}
