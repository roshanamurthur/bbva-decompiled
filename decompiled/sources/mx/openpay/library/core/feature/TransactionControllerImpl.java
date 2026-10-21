package mx.openpay.library.core.feature;

import androidx.compose.runtime.internal.StabilityInferred;
import c.l;
import c.m;
import ek.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.core.mapper.OpenPayErrorMapperKt;
import mx.openpay.library.core.mapper.SendVoucherMapperKt;
import mx.openpay.library.core.mapper.TransactionFilterMapperKt;
import mx.openpay.library.core.mapper.TransactionMapperKt;
import mx.openpay.library.core.model.OpenPayError;
import mx.openpay.library.core.model.OpenPayResult;
import mx.openpay.library.core.model.OpenPaySendVoucher;
import mx.openpay.library.core.model.OpenPayTransaction;
import mx.openpay.library.core.model.OpenPayTransactionFilter;
import mx.openpay.library.domain.model.transaction.SendVoucher;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.model.transaction.TransactionFilter;
import mx.openpay.library.domain.usecase.transaction.GetAllTransactionsUseCase;
import mx.openpay.library.domain.usecase.transaction.SendVoucherUseCase;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lmx/openpay/library/core/feature/TransactionControllerImpl;", "Lmx/openpay/library/core/feature/TransactionController;", "Lmx/openpay/library/core/model/OpenPayTransactionFilter;", "openPayTransactionFilter", "Lmx/openpay/library/core/model/OpenPayResult;", "", "Lmx/openpay/library/core/model/OpenPayTransaction;", "getTransactions", "(Lmx/openpay/library/core/model/OpenPayTransactionFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/core/model/OpenPaySendVoucher;", "openPaySendVoucher", "", "sendVoucher", "(Lmx/openpay/library/core/model/OpenPaySendVoucher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/usecase/transaction/GetAllTransactionsUseCase;", "getAllTransactionsUseCase", "Lmx/openpay/library/domain/usecase/transaction/SendVoucherUseCase;", "sendVoucherUseCase", "<init>", "(Lmx/openpay/library/domain/usecase/transaction/GetAllTransactionsUseCase;Lmx/openpay/library/domain/usecase/transaction/SendVoucherUseCase;)V", "library_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionController.kt\nmx/openpay/library/core/feature/TransactionControllerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1549#2:56\n1620#2,3:57\n*S KotlinDebug\n*F\n+ 1 TransactionController.kt\nmx/openpay/library/core/feature/TransactionControllerImpl\n*L\n35#1:56\n35#1:57,3\n*E\n"})
public final class TransactionControllerImpl implements TransactionController {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetAllTransactionsUseCase f83533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SendVoucherUseCase f83534b;

    public TransactionControllerImpl(@NotNull GetAllTransactionsUseCase getAllTransactionsUseCase, @NotNull SendVoucherUseCase sendVoucherUseCase) {
        Intrinsics.checkNotNullParameter(getAllTransactionsUseCase, "getAllTransactionsUseCase");
        Intrinsics.checkNotNullParameter(sendVoucherUseCase, "sendVoucherUseCase");
        this.f83533a = getAllTransactionsUseCase;
        this.f83534b = sendVoucherUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.core.feature.TransactionController
    @Nullable
    public Object getTransactions(@NotNull OpenPayTransactionFilter openPayTransactionFilter, @NotNull Continuation<? super OpenPayResult<? extends List<OpenPayTransaction>>> continuation) {
        l lVar;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i10 = lVar.f25315c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f25315c = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, continuation);
            }
        } else {
            lVar = new l(this, continuation);
        }
        Object objInvoke = lVar.f25313a;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = lVar.f25315c;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            GetAllTransactionsUseCase getAllTransactionsUseCase = this.f83533a;
            TransactionFilter transactionFilterMapToLibraryModel = TransactionFilterMapperKt.mapToLibraryModel(openPayTransactionFilter);
            lVar.f25315c = 1;
            objInvoke = getAllTransactionsUseCase.invoke(transactionFilterMapToLibraryModel, lVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        Result result = (Result) objInvoke;
        if (!(result instanceof Result.Success)) {
            if (result instanceof Result.Failure) {
                return new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) result).getError()));
            }
            throw new NoWhenBranchMatchedException();
        }
        Result.Success success = (Result.Success) result;
        if (success.getData() == null) {
            return new OpenPayResult.Failure(OpenPayError.InternalError.INSTANCE);
        }
        Object data = success.getData();
        Intrinsics.checkNotNull(data);
        Iterable iterable = (Iterable) data;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(TransactionMapperKt.mapToLibraryModel((Transaction) it.next()));
        }
        return new OpenPayResult.Success(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.core.feature.TransactionController
    @Nullable
    public Object sendVoucher(@NotNull OpenPaySendVoucher openPaySendVoucher, @NotNull Continuation<? super OpenPayResult<Boolean>> continuation) {
        m mVar;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i10 = mVar.f25318c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f25318c = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, continuation);
            }
        } else {
            mVar = new m(this, continuation);
        }
        Object objInvoke = mVar.f25316a;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = mVar.f25318c;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            SendVoucherUseCase sendVoucherUseCase = this.f83534b;
            SendVoucher sendVoucherMapToDomainModel = SendVoucherMapperKt.mapToDomainModel(openPaySendVoucher);
            mVar.f25318c = 1;
            objInvoke = sendVoucherUseCase.invoke(sendVoucherMapToDomainModel, mVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        Result result = (Result) objInvoke;
        if (result instanceof Result.Success) {
            return new OpenPayResult.Success(Boxing.boxBoolean(true));
        }
        if (result instanceof Result.Failure) {
            return new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) result).getError()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
