package mx.openpay.library.domain.usecase.transaction;

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
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.repository.TransactionRepository;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InsertTransactionUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lmx/openpay/library/domain/usecase/transaction/InsertTransactionUseCaseImpl;", "Lmx/openpay/library/domain/usecase/transaction/InsertTransactionUseCase;", "Lmx/openpay/library/domain/model/CreateCharge;", "chargeRequest", "", "idTransaction", "", "invoke", "(Lmx/openpay/library/domain/model/CreateCharge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/repository/TransactionRepository;", "repository", "<init>", "(Lmx/openpay/library/domain/repository/TransactionRepository;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class InsertTransactionUseCaseImpl implements InsertTransactionUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TransactionRepository f84302a;

    /* JADX INFO: compiled from: InsertTransactionUseCase.kt */
    @DebugMetadata(c = "mx.openpay.library.domain.usecase.transaction.InsertTransactionUseCaseImpl$invoke$2", f = "InsertTransactionUseCase.kt", i = {}, l = {16}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f84303p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CreateCharge f84305r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f84306s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CreateCharge createCharge, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f84305r0 = createCharge;
            this.f84306s0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InsertTransactionUseCaseImpl.this.new a(this.f84305r0, this.f84306s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f84303p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                TransactionRepository transactionRepository = InsertTransactionUseCaseImpl.this.f84302a;
                this.f84303p0 = 1;
                if (transactionRepository.insertTransaction(this.f84305r0, this.f84306s0, this) == coroutine_suspended) {
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

    public InsertTransactionUseCaseImpl(@NotNull TransactionRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f84302a = repository;
    }

    @Override // mx.openpay.library.domain.usecase.transaction.InsertTransactionUseCase
    @Nullable
    public Object invoke(@NotNull CreateCharge createCharge, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new a(createCharge, str, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
