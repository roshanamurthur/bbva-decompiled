package mx.openpay.library.domain.usecase.eglobal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import mx.openpay.library.domain.bluetooth.BluetoothController;
import mx.openpay.library.domain.model.Error;
import mx.openpay.library.domain.model.common.ChargeCallback;
import mx.openpay.library.domain.model.common.ChargeRequest;
import mx.openpay.library.domain.model.eglobal.Charge;
import mx.openpay.library.domain.repository.TransactionRepository;
import mx.openpay.library.domain.util.Constant;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExecuteChargeUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096Bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lmx/openpay/library/domain/usecase/eglobal/ExecuteChargeUseCaseImpl;", "Lmx/openpay/library/domain/usecase/eglobal/ExecuteChargeUseCase;", "Lmx/openpay/library/domain/bluetooth/BluetoothController;", "bluetoothController", "Lmx/openpay/library/domain/model/common/ChargeRequest;", "chargeRequest", "Lmx/openpay/library/domain/model/common/ChargeCallback;", "chargeCallback", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/eglobal/Charge;", "invoke", "(Lmx/openpay/library/domain/bluetooth/BluetoothController;Lmx/openpay/library/domain/model/common/ChargeRequest;Lmx/openpay/library/domain/model/common/ChargeCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/repository/TransactionRepository;", "transactionsRepository", "Lmx/openpay/library/domain/usecase/eglobal/CheckTerminalCapacityDataUseCase;", "checkTerminalCapacityDataUseCase", "<init>", "(Lmx/openpay/library/domain/repository/TransactionRepository;Lmx/openpay/library/domain/usecase/eglobal/CheckTerminalCapacityDataUseCase;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class ExecuteChargeUseCaseImpl implements ExecuteChargeUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TransactionRepository f84213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CheckTerminalCapacityDataUseCase f84214b;

    /* JADX INFO: compiled from: ExecuteChargeUseCase.kt */
    @DebugMetadata(c = "mx.openpay.library.domain.usecase.eglobal.ExecuteChargeUseCaseImpl$invoke$2", f = "ExecuteChargeUseCase.kt", i = {}, l = {37, 39, 41}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Charge>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f84215p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ BluetoothController f84217r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ ChargeRequest f84218s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ ChargeCallback f84219t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BluetoothController bluetoothController, ChargeRequest chargeRequest, ChargeCallback chargeCallback, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f84217r0 = bluetoothController;
            this.f84218s0 = chargeRequest;
            this.f84219t0 = chargeCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ExecuteChargeUseCaseImpl.this.new a(this.f84217r0, this.f84218s0, this.f84219t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Charge>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0052 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f84215p0;
            ExecuteChargeUseCaseImpl executeChargeUseCaseImpl = ExecuteChargeUseCaseImpl.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i10 == 2) {
                    ResultKt.throwOnFailure(obj);
                    this.f84215p0 = 3;
                    obj = this.f84217r0.createCharge(this.f84218s0, this.f84219t0, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            CheckTerminalCapacityDataUseCase checkTerminalCapacityDataUseCase = executeChargeUseCaseImpl.f84214b;
            this.f84215p0 = 1;
            if (checkTerminalCapacityDataUseCase.invoke(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            TransactionRepository transactionRepository = executeChargeUseCaseImpl.f84213a;
            this.f84215p0 = 2;
            if (transactionRepository.deleteAllLocalTransaction(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f84215p0 = 3;
            obj = this.f84217r0.createCharge(this.f84218s0, this.f84219t0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return obj;
        }
    }

    public ExecuteChargeUseCaseImpl(@NotNull TransactionRepository transactionsRepository, @NotNull CheckTerminalCapacityDataUseCase checkTerminalCapacityDataUseCase) {
        Intrinsics.checkNotNullParameter(transactionsRepository, "transactionsRepository");
        Intrinsics.checkNotNullParameter(checkTerminalCapacityDataUseCase, "checkTerminalCapacityDataUseCase");
        this.f84213a = transactionsRepository;
        this.f84214b = checkTerminalCapacityDataUseCase;
    }

    @Override // mx.openpay.library.domain.usecase.eglobal.ExecuteChargeUseCase
    @Nullable
    public Object invoke(@NotNull BluetoothController bluetoothController, @NotNull ChargeRequest chargeRequest, @NotNull ChargeCallback chargeCallback, @NotNull Continuation<? super Result<Charge>> continuation) {
        String string = chargeRequest.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String().toString();
        Intrinsics.checkNotNullExpressionValue(string, "chargeRequest.amount.toString()");
        return StringsKt__StringsKt.substringAfterLast(string, Constant.DOT_STRING, "").length() <= 2 ? BuildersKt.withContext(Dispatchers.getIO(), new a(bluetoothController, chargeRequest, chargeCallback, null), continuation) : new Result.Failure(new Error.InvalidAmount(null, 1, null));
    }
}
