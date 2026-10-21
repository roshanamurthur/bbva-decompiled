package mx.openpay.library.domain.usecase.eglobal;

import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.model.eglobal.LocalTransaction;
import mx.openpay.library.domain.model.eglobal.TerminalCapacity;
import mx.openpay.library.domain.repository.EglobalRepository;
import mx.openpay.library.domain.repository.TransactionRepository;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CheckTerminalCapacityDataUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lmx/openpay/library/domain/usecase/eglobal/CheckTerminalCapacityDataUseCaseImpl;", "Lmx/openpay/library/domain/usecase/eglobal/CheckTerminalCapacityDataUseCase;", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/repository/EglobalRepository;", "eglobalRepository", "Lmx/openpay/library/domain/repository/TransactionRepository;", "transactionRepository", "<init>", "(Lmx/openpay/library/domain/repository/EglobalRepository;Lmx/openpay/library/domain/repository/TransactionRepository;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class CheckTerminalCapacityDataUseCaseImpl implements CheckTerminalCapacityDataUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final EglobalRepository f84203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TransactionRepository f84204b;

    /* JADX INFO: compiled from: CheckTerminalCapacityDataUseCase.kt */
    @DebugMetadata(c = "mx.openpay.library.domain.usecase.eglobal.CheckTerminalCapacityDataUseCaseImpl", f = "CheckTerminalCapacityDataUseCase.kt", i = {0, 1}, l = {20, 25, 33}, m = "invoke", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public CheckTerminalCapacityDataUseCaseImpl f84205p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f84206q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f84208s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f84206q0 = obj;
            this.f84208s0 |= Integer.MIN_VALUE;
            return CheckTerminalCapacityDataUseCaseImpl.this.invoke(this);
        }
    }

    public CheckTerminalCapacityDataUseCaseImpl(@NotNull EglobalRepository eglobalRepository, @NotNull TransactionRepository transactionRepository) {
        Intrinsics.checkNotNullParameter(eglobalRepository, "eglobalRepository");
        Intrinsics.checkNotNullParameter(transactionRepository, "transactionRepository");
        this.f84203a = eglobalRepository;
        this.f84204b = transactionRepository;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x0091, please report this as an issue */
    @Override // mx.openpay.library.domain.usecase.eglobal.CheckTerminalCapacityDataUseCase
    @Nullable
    public Object invoke(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        CheckTerminalCapacityDataUseCaseImpl checkTerminalCapacityDataUseCaseImpl;
        Result result;
        TransactionRepository transactionRepository;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f84208s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f84208s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object localTransaction = aVar.f84206q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f84208s0;
        if (i11 != 0) {
            if (i11 == 1) {
                checkTerminalCapacityDataUseCaseImpl = aVar.f84205p0;
                ResultKt.throwOnFailure(localTransaction);
            } else if (i11 == 2) {
                checkTerminalCapacityDataUseCaseImpl = aVar.f84205p0;
                ResultKt.throwOnFailure(localTransaction);
                result = (Result) localTransaction;
                if (result instanceof Result.Success) {
                    transactionRepository = checkTerminalCapacityDataUseCaseImpl.f84204b;
                    aVar.f84205p0 = null;
                    aVar.f84208s0 = 3;
                    if (transactionRepository.updateLocalTerminalCapacityDataSent(aVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (result instanceof Result.Failure) {
                    Logger.getLogger(CheckTerminalCapacityDataUseCaseImpl.class.getName()).info("updateTerminalCapacity - FAILURE -- " + ((Result.Failure) result).getError());
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(localTransaction);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(localTransaction);
        aVar.f84205p0 = this;
        aVar.f84208s0 = 1;
        localTransaction = this.f84204b.getLocalTransaction(aVar);
        if (localTransaction == coroutine_suspended) {
            return coroutine_suspended;
        }
        checkTerminalCapacityDataUseCaseImpl = this;
        LocalTransaction localTransaction2 = (LocalTransaction) localTransaction;
        if (localTransaction2 != null && !localTransaction2.getTcDataSent()) {
            EglobalRepository eglobalRepository = checkTerminalCapacityDataUseCaseImpl.f84203a;
            TerminalCapacity terminalCapacity = new TerminalCapacity(localTransaction2.getIdTransaction(), localTransaction2.getTc());
            aVar.f84205p0 = checkTerminalCapacityDataUseCaseImpl;
            aVar.f84208s0 = 2;
            localTransaction = eglobalRepository.updateTerminalCapacity(terminalCapacity, aVar);
            if (localTransaction == coroutine_suspended) {
                return coroutine_suspended;
            }
            result = (Result) localTransaction;
            if (result instanceof Result.Success) {
                transactionRepository = checkTerminalCapacityDataUseCaseImpl.f84204b;
                aVar.f84205p0 = null;
                aVar.f84208s0 = 3;
                if (transactionRepository.updateLocalTerminalCapacityDataSent(aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (result instanceof Result.Failure) {
                Logger.getLogger(CheckTerminalCapacityDataUseCaseImpl.class.getName()).info("updateTerminalCapacity - FAILURE -- " + ((Result.Failure) result).getError());
            }
        }
        return Unit.INSTANCE;
    }
}
