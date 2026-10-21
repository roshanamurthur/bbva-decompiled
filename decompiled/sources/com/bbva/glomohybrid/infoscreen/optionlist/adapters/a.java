package com.bbva.glomohybrid.infoscreen.optionlist.adapters;

import com.bbva.glomohybrid.infoscreen.optionlist.OptionListContract;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OptionsAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.infoscreen.optionlist.adapters.OptionsAdapter$listener$1$1", f = "OptionsAdapter.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f32412p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ OptionsAdapter f32413q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ OptionListContract.Intent f32414r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(OptionsAdapter optionsAdapter, OptionListContract.Intent intent, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f32413q0 = optionsAdapter;
        this.f32414r0 = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f32413q0, this.f32414r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f32412p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel channel = this.f32413q0.f32408r0;
            this.f32412p0 = 1;
            if (channel.send(this.f32414r0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
