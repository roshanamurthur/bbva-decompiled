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

/* JADX INFO: compiled from: GetRenewKeyBySlotAndTerminalUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lmx/openpay/library/domain/usecase/eglobal/GetRenewKeyBySlotAndTerminalUseCaseImpl;", "Lmx/openpay/library/domain/usecase/eglobal/GetRenewKeyBySlotAndTerminalUseCase;", "", "slotKey", "", "serial", "invoke", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/repository/EglobalRepository;", "repository", "<init>", "(Lmx/openpay/library/domain/repository/EglobalRepository;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class GetRenewKeyBySlotAndTerminalUseCaseImpl implements GetRenewKeyBySlotAndTerminalUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final EglobalRepository f84237a;

    /* JADX INFO: compiled from: GetRenewKeyBySlotAndTerminalUseCase.kt */
    @DebugMetadata(c = "mx.openpay.library.domain.usecase.eglobal.GetRenewKeyBySlotAndTerminalUseCaseImpl$invoke$2", f = "GetRenewKeyBySlotAndTerminalUseCase.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f84238p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f84240r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f84241s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f84240r0 = i10;
            this.f84241s0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GetRenewKeyBySlotAndTerminalUseCaseImpl.this.new a(this.f84240r0, this.f84241s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f84238p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                EglobalRepository eglobalRepository = GetRenewKeyBySlotAndTerminalUseCaseImpl.this.f84237a;
                this.f84238p0 = 1;
                obj = eglobalRepository.getLocalRenewKeyBySlotAndTerminal(this.f84240r0, this.f84241s0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public GetRenewKeyBySlotAndTerminalUseCaseImpl(@NotNull EglobalRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f84237a = repository;
    }

    @Override // mx.openpay.library.domain.usecase.eglobal.GetRenewKeyBySlotAndTerminalUseCase
    @Nullable
    public Object invoke(int i10, @NotNull String str, @NotNull Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(i10, str, null), continuation);
    }
}
