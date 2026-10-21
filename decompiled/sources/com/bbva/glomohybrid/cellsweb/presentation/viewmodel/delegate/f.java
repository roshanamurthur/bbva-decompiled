package com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate;

import com.bbva.glomo.user.domain.usecase.DeleteUserDataUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserTypeCellsWebViewModelDelegate.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.UserTypeCellsWebViewModelDelegate$resetRememberedUser$2", f = "UserTypeCellsWebViewModelDelegate.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
public final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f32001p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ UserTypeCellsWebViewModelDelegate f32002q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(UserTypeCellsWebViewModelDelegate userTypeCellsWebViewModelDelegate, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f32002q0 = userTypeCellsWebViewModelDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new f(this.f32002q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f32001p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            DeleteUserDataUseCase deleteUser = this.f32002q0.getDeleteUser();
            this.f32001p0 = 1;
            if (deleteUser.execute(this) == coroutine_suspended) {
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
