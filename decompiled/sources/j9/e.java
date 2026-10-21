package j9;

import com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase;
import com.bbva.glomohybrid.mobilepayment.commons.PaymentUnrollHandler;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RemoveUserDataUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase$unrollPaymentsCredentials$2", f = "RemoveUserDataUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ Object f78826p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ RemoveUserDataUseCase f78827q0;

    /* JADX INFO: compiled from: RemoveUserDataUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase$unrollPaymentsCredentials$2$1", f = "RemoveUserDataUseCase.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f78828p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ RemoveUserDataUseCase f78829q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RemoveUserDataUseCase removeUserDataUseCase, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f78829q0 = removeUserDataUseCase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f78829q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f78828p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentUnrollHandler paymentUnrollHandlerAccess$getPaymentUnrollHandler = RemoveUserDataUseCase.access$getPaymentUnrollHandler(this.f78829q0);
                if (paymentUnrollHandlerAccess$getPaymentUnrollHandler != null) {
                    this.f78828p0 = 1;
                    if (paymentUnrollHandlerAccess$getPaymentUnrollHandler.unroll(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RemoveUserDataUseCase removeUserDataUseCase, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f78827q0 = removeUserDataUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        e eVar = new e(this.f78827q0, continuation);
        eVar.f78826p0 = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f78826p0;
        RemoveUserDataUseCase removeUserDataUseCase = this.f78827q0;
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, removeUserDataUseCase.f32891b.io(), null, new a(removeUserDataUseCase, null), 2, null);
    }
}
