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

/* JADX INFO: compiled from: UpdateMerchantSlotKeyInjectedBySlotUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0096Bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lmx/openpay/library/domain/usecase/eglobal/UpdateMerchantSlotKeyInjectedBySlotUseCaseImpl;", "Lmx/openpay/library/domain/usecase/eglobal/UpdateMerchantSlotKeyInjectedBySlotUseCase;", "", "slotKey", "", "serial", "status", "", "invoke", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/repository/EglobalRepository;", "repository", "<init>", "(Lmx/openpay/library/domain/repository/EglobalRepository;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class UpdateMerchantSlotKeyInjectedBySlotUseCaseImpl implements UpdateMerchantSlotKeyInjectedBySlotUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final EglobalRepository f84270a;

    /* JADX INFO: compiled from: UpdateMerchantSlotKeyInjectedBySlotUseCase.kt */
    @DebugMetadata(c = "mx.openpay.library.domain.usecase.eglobal.UpdateMerchantSlotKeyInjectedBySlotUseCaseImpl$invoke$2", f = "UpdateMerchantSlotKeyInjectedBySlotUseCase.kt", i = {}, l = {16}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f84271p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f84273r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f84274s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f84275t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, String str, int i11, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f84273r0 = i10;
            this.f84274s0 = str;
            this.f84275t0 = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UpdateMerchantSlotKeyInjectedBySlotUseCaseImpl.this.new a(this.f84273r0, this.f84274s0, this.f84275t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f84271p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                EglobalRepository eglobalRepository = UpdateMerchantSlotKeyInjectedBySlotUseCaseImpl.this.f84270a;
                this.f84271p0 = 1;
                if (eglobalRepository.updateMerchantSlotKeyInjectedBySlot(this.f84273r0, this.f84274s0, this.f84275t0, this) == coroutine_suspended) {
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

    public UpdateMerchantSlotKeyInjectedBySlotUseCaseImpl(@NotNull EglobalRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f84270a = repository;
    }

    @Override // mx.openpay.library.domain.usecase.eglobal.UpdateMerchantSlotKeyInjectedBySlotUseCase
    @Nullable
    public Object invoke(int i10, @NotNull String str, int i11, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new a(i10, str, i11, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
