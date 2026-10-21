package mx.openpay.library.domain.usecase.eglobal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import mx.openpay.library.domain.repository.EglobalRepository;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UpdateRenewKeyBySlotAndTerminalUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096Bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lmx/openpay/library/domain/usecase/eglobal/UpdateRenewKeyBySlotAndTerminalUseCaseImpl;", "Lmx/openpay/library/domain/usecase/eglobal/UpdateRenewKeyBySlotAndTerminalUseCase;", "", "status", "slotKey", "", "serial", "", "invoke", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/repository/EglobalRepository;", "repository", "<init>", "(Lmx/openpay/library/domain/repository/EglobalRepository;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class UpdateRenewKeyBySlotAndTerminalUseCaseImpl implements UpdateRenewKeyBySlotAndTerminalUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final EglobalRepository f84276a;

    /* JADX INFO: compiled from: UpdateRenewKeyBySlotAndTerminalUseCase.kt */
    @DebugMetadata(c = "mx.openpay.library.domain.usecase.eglobal.UpdateRenewKeyBySlotAndTerminalUseCaseImpl$invoke$2", f = "UpdateRenewKeyBySlotAndTerminalUseCase.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f84277p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f84279r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f84280s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f84281t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f84279r0 = i10;
            this.f84280s0 = i11;
            this.f84281t0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UpdateRenewKeyBySlotAndTerminalUseCaseImpl.this.new a(this.f84279r0, this.f84280s0, this.f84281t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f84277p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                EglobalRepository eglobalRepository = UpdateRenewKeyBySlotAndTerminalUseCaseImpl.this.f84276a;
                this.f84277p0 = 1;
                if (eglobalRepository.updateLocalRenewKeyBySlotAndTerminal(this.f84279r0, this.f84280s0, this.f84281t0, this) == coroutine_suspended) {
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

    public UpdateRenewKeyBySlotAndTerminalUseCaseImpl(@NotNull EglobalRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f84276a = repository;
    }

    @Override // mx.openpay.library.domain.usecase.eglobal.UpdateRenewKeyBySlotAndTerminalUseCase
    @Nullable
    public Object invoke(int i10, int i11, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new a(i10, i11, str, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
