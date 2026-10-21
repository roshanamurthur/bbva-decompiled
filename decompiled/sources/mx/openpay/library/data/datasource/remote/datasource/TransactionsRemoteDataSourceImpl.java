package mx.openpay.library.data.datasource.remote.datasource;

import ek.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import mx.openpay.library.data.datasource.remote.OpenPayAPI;
import mx.openpay.library.data.datasource.remote.model.request.transaction.SendVoucherRequestDto;
import mx.openpay.library.data.datasource.remote.model.response.TransactionResponseDto;
import mx.openpay.library.data.mapper.transaction.SendVoucherMapperKt;
import mx.openpay.library.data.mapper.transaction.TransactionMapperKt;
import mx.openpay.library.domain.datasource.TransactionsRemoteDataSource;
import mx.openpay.library.domain.model.Error;
import mx.openpay.library.domain.model.IntegratorTags;
import mx.openpay.library.domain.model.transaction.ProductType;
import mx.openpay.library.domain.model.transaction.SendVoucher;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.model.transaction.TransactionFilter;
import mx.openpay.library.domain.util.Constant;
import mx.openpay.library.domain.util.ErrorHandler;
import mx.openpay.library.domain.util.Result;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* JADX INFO: compiled from: TransactionsRemoteDataSourceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0014\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lmx/openpay/library/data/datasource/remote/datasource/TransactionsRemoteDataSourceImpl;", "Lmx/openpay/library/domain/datasource/TransactionsRemoteDataSource;", "openPayAPI", "Lmx/openpay/library/data/datasource/remote/OpenPayAPI;", "errorHandler", "Lmx/openpay/library/domain/util/ErrorHandler;", "integratorTags", "Lmx/openpay/library/domain/model/IntegratorTags;", "(Lmx/openpay/library/data/datasource/remote/OpenPayAPI;Lmx/openpay/library/domain/util/ErrorHandler;Lmx/openpay/library/domain/model/IntegratorTags;)V", "getAllTransactions", "Lmx/openpay/library/domain/util/Result;", "", "Lmx/openpay/library/domain/model/transaction/Transaction;", "transactionFilter", "Lmx/openpay/library/domain/model/transaction/TransactionFilter;", "(Lmx/openpay/library/domain/model/transaction/TransactionFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransaction", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendVoucher", "", "Lmx/openpay/library/domain/model/transaction/SendVoucher;", "(Lmx/openpay/library/domain/model/transaction/SendVoucher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransactionsRemoteDataSourceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionsRemoteDataSourceImpl.kt\nmx/openpay/library/data/datasource/remote/datasource/TransactionsRemoteDataSourceImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
public final class TransactionsRemoteDataSourceImpl implements TransactionsRemoteDataSource {

    @NotNull
    private final ErrorHandler errorHandler;

    @NotNull
    private final IntegratorTags integratorTags;

    @NotNull
    private final OpenPayAPI openPayAPI;

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.TransactionsRemoteDataSourceImpl$getAllTransactions$1, reason: invalid class name */
    /* JADX INFO: compiled from: TransactionsRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.TransactionsRemoteDataSourceImpl", f = "TransactionsRemoteDataSourceImpl.kt", i = {0}, l = {46}, m = "getAllTransactions", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransactionsRemoteDataSourceImpl.this.getAllTransactions(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.TransactionsRemoteDataSourceImpl$getTransaction$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TransactionsRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.TransactionsRemoteDataSourceImpl", f = "TransactionsRemoteDataSourceImpl.kt", i = {0}, l = {76}, m = "getTransaction", n = {"this"}, s = {"L$0"})
    public static final class C07731 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07731(Continuation<? super C07731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransactionsRemoteDataSourceImpl.this.getTransaction(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.TransactionsRemoteDataSourceImpl$sendVoucher$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TransactionsRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.TransactionsRemoteDataSourceImpl", f = "TransactionsRemoteDataSourceImpl.kt", i = {0}, l = {98}, m = "sendVoucher", n = {"this"}, s = {"L$0"})
    public static final class C07741 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07741(Continuation<? super C07741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransactionsRemoteDataSourceImpl.this.sendVoucher(null, this);
        }
    }

    public TransactionsRemoteDataSourceImpl(@NotNull OpenPayAPI openPayAPI, @NotNull ErrorHandler errorHandler, @NotNull IntegratorTags integratorTags) {
        Intrinsics.checkNotNullParameter(openPayAPI, "openPayAPI");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(integratorTags, "integratorTags");
        this.openPayAPI = openPayAPI;
        this.errorHandler = errorHandler;
        this.integratorTags = integratorTags;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ee A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:13:0x0030, B:43:0x00e6, B:45:0x00ee, B:47:0x00f6, B:51:0x0109, B:53:0x0113, B:56:0x011b), top: B:60:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f6 A[Catch: Exception -> 0x0035, TRY_LEAVE, TryCatch #0 {Exception -> 0x0035, blocks: (B:13:0x0030, B:43:0x00e6, B:45:0x00ee, B:47:0x00f6, B:51:0x0109, B:53:0x0113, B:56:0x011b), top: B:60:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0101  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109 A[Catch: Exception -> 0x0035, TRY_ENTER, TryCatch #0 {Exception -> 0x0035, blocks: (B:13:0x0030, B:43:0x00e6, B:45:0x00ee, B:47:0x00f6, B:51:0x0109, B:53:0x0113, B:56:0x011b), top: B:60:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // mx.openpay.library.domain.datasource.TransactionsRemoteDataSource
    @Nullable
    public Object getAllTransactions(@NotNull TransactionFilter transactionFilter, @NotNull Continuation<? super Result<? extends List<Transaction>>> continuation) {
        AnonymousClass1 anonymousClass1;
        TransactionsRemoteDataSourceImpl transactionsRemoteDataSourceImpl;
        String strJoinToString$default;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object transactions = anonymousClass2.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = anonymousClass2.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transactionsRemoteDataSourceImpl = (TransactionsRemoteDataSourceImpl) anonymousClass2.L$0;
            try {
                ResultKt.throwOnFailure(transactions);
                response = (Response) transactions;
                if (response.isSuccessful()) {
                    List list = (List) response.body();
                    return list != null ? new Result.Success(TransactionMapperKt.mapToLocalTransactionList(list), null, 2, null) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                ErrorHandler errorHandler = transactionsRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(transactionsRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(transactions);
        try {
            String strValueOf = transactionFilter.getPaymentMethod() != null ? String.valueOf(transactionFilter.getPaymentMethod()) : null;
            String strReplace$default = transactionFilter.getStatus() != null ? l.replace$default(l.replace$default(l.replace$default(String.valueOf(transactionFilter.getStatus()), Constant.BRACKET_OPEN, "", false, 4, (Object) null), Constant.BRACKET_CLOSE, "", false, 4, (Object) null), " ", "", false, 4, (Object) null) : null;
            List<ProductType> productTypes = transactionFilter.getProductTypes();
            if (productTypes == null) {
                strJoinToString$default = null;
            } else {
                if (productTypes.isEmpty()) {
                    productTypes = null;
                }
                if (productTypes != null) {
                    strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(productTypes, ",", null, null, 0, null, null, 62, null);
                } else {
                    strJoinToString$default = null;
                }
            }
            OpenPayAPI openPayAPI = this.openPayAPI;
            String operationGte = transactionFilter.getOperationGte();
            String operationLte = transactionFilter.getOperationLte();
            Integer limit = transactionFilter.getLimit();
            Integer offset = transactionFilter.getOffset();
            String transactionId = transactionFilter.getTransactionId();
            String origin = this.integratorTags.getOrigin();
            anonymousClass2.L$0 = this;
            anonymousClass2.label = 1;
            transactions = openPayAPI.getTransactions(operationGte, operationLte, limit, offset, transactionId, strValueOf, strReplace$default, origin, strJoinToString$default, anonymousClass2);
            if (transactions == coroutine_suspended) {
                return coroutine_suspended;
            }
            transactionsRemoteDataSourceImpl = this;
            response = (Response) transactions;
            if (response.isSuccessful()) {
                List list2 = (List) response.body();
                if (list2 != null) {
                }
            }
            ErrorHandler errorHandler2 = transactionsRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            transactionsRemoteDataSourceImpl = this;
            return new Result.Failure(transactionsRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0057 A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004f, B:25:0x0057, B:27:0x005f, B:29:0x006a, B:31:0x0070, B:32:0x0075, B:35:0x0084, B:37:0x008e, B:40:0x0096), top: B:48:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x005f A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004f, B:25:0x0057, B:27:0x005f, B:29:0x006a, B:31:0x0070, B:32:0x0075, B:35:0x0084, B:37:0x008e, B:40:0x0096), top: B:48:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006a A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004f, B:25:0x0057, B:27:0x005f, B:29:0x006a, B:31:0x0070, B:32:0x0075, B:35:0x0084, B:37:0x008e, B:40:0x0096), top: B:48:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004f, B:25:0x0057, B:27:0x005f, B:29:0x006a, B:31:0x0070, B:32:0x0075, B:35:0x0084, B:37:0x008e, B:40:0x0096), top: B:48:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: Exception -> 0x002d, TRY_ENTER, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004f, B:25:0x0057, B:27:0x005f, B:29:0x006a, B:31:0x0070, B:32:0x0075, B:35:0x0084, B:37:0x008e, B:40:0x0096), top: B:48:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.TransactionsRemoteDataSource
    @Nullable
    public Object getTransaction(@NotNull String str, @NotNull Continuation<? super Result<Transaction>> continuation) {
        C07731 c07731;
        TransactionsRemoteDataSourceImpl transactionsRemoteDataSourceImpl;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        List list;
        TransactionResponseDto transactionResponseDto;
        Transaction transactionMapToLocalTransaction;
        if (continuation instanceof C07731) {
            c07731 = (C07731) continuation;
            int i10 = c07731.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07731.label = i10 - Integer.MIN_VALUE;
            } else {
                c07731 = new C07731(continuation);
            }
        } else {
            c07731 = new C07731(continuation);
        }
        Object transaction = c07731.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07731.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transactionsRemoteDataSourceImpl = (TransactionsRemoteDataSourceImpl) c07731.L$0;
            try {
                ResultKt.throwOnFailure(transaction);
                response = (Response) transaction;
                if (response.isSuccessful()) {
                    ErrorHandler errorHandler = transactionsRemoteDataSourceImpl.errorHandler;
                    responseBodyErrorBody = response.errorBody();
                    if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                        strString = "";
                    }
                    return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
                }
                list = (List) response.body();
                if (list != null) {
                    transactionResponseDto = (TransactionResponseDto) CollectionsKt___CollectionsKt.firstOrNull(list);
                    if (transactionResponseDto != null) {
                        transactionMapToLocalTransaction = TransactionMapperKt.mapToLocalTransaction(transactionResponseDto);
                    } else {
                        transactionMapToLocalTransaction = null;
                    }
                    new Result.Success(transactionMapToLocalTransaction, null, 2, null);
                } else {
                    new Result.Failure(Error.NotFound.INSTANCE);
                }
                return new Result.Failure(Error.Unknown.INSTANCE);
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(transactionsRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(transaction);
        try {
            OpenPayAPI openPayAPI = this.openPayAPI;
            String origin = this.integratorTags.getOrigin();
            c07731.L$0 = this;
            c07731.label = 1;
            transaction = openPayAPI.getTransaction(str, origin, c07731);
            if (transaction == coroutine_suspended) {
                return coroutine_suspended;
            }
            transactionsRemoteDataSourceImpl = this;
            response = (Response) transaction;
            if (response.isSuccessful()) {
                ErrorHandler errorHandler2 = transactionsRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null) {
                    strString = "";
                } else {
                    strString = "";
                }
                return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
            }
            list = (List) response.body();
            if (list != null) {
                transactionResponseDto = (TransactionResponseDto) CollectionsKt___CollectionsKt.firstOrNull(list);
                if (transactionResponseDto != null) {
                    transactionMapToLocalTransaction = TransactionMapperKt.mapToLocalTransaction(transactionResponseDto);
                } else {
                    transactionMapToLocalTransaction = null;
                }
                new Result.Success(transactionMapToLocalTransaction, null, 2, null);
            } else {
                new Result.Failure(Error.NotFound.INSTANCE);
            }
            return new Result.Failure(Error.Unknown.INSTANCE);
        } catch (Exception e7) {
            e = e7;
            transactionsRemoteDataSourceImpl = this;
            return new Result.Failure(transactionsRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004c, B:25:0x0054, B:26:0x0060, B:28:0x006a, B:31:0x0072), top: B:37:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004c, B:25:0x0054, B:26:0x0060, B:28:0x006a, B:31:0x0072), top: B:37:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.TransactionsRemoteDataSource
    @Nullable
    public Object sendVoucher(@NotNull SendVoucher sendVoucher, @NotNull Continuation<? super Result<Boolean>> continuation) {
        C07741 c07741;
        TransactionsRemoteDataSourceImpl transactionsRemoteDataSourceImpl;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof C07741) {
            c07741 = (C07741) continuation;
            int i10 = c07741.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07741.label = i10 - Integer.MIN_VALUE;
            } else {
                c07741 = new C07741(continuation);
            }
        } else {
            c07741 = new C07741(continuation);
        }
        Object objSendVoucher = c07741.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07741.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transactionsRemoteDataSourceImpl = (TransactionsRemoteDataSourceImpl) c07741.L$0;
            try {
                ResultKt.throwOnFailure(objSendVoucher);
                response = (Response) objSendVoucher;
                if (response.isSuccessful()) {
                    return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                }
                ErrorHandler errorHandler = transactionsRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(transactionsRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(objSendVoucher);
        try {
            OpenPayAPI openPayAPI = this.openPayAPI;
            SendVoucherRequestDto sendVoucherRequestDtoMapToSendVoucherRequestDto = SendVoucherMapperKt.mapToSendVoucherRequestDto(sendVoucher);
            c07741.L$0 = this;
            c07741.label = 1;
            objSendVoucher = openPayAPI.sendVoucher(sendVoucherRequestDtoMapToSendVoucherRequestDto, c07741);
            if (objSendVoucher == coroutine_suspended) {
                return coroutine_suspended;
            }
            transactionsRemoteDataSourceImpl = this;
            response = (Response) objSendVoucher;
            if (response.isSuccessful()) {
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            }
            ErrorHandler errorHandler2 = transactionsRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            transactionsRemoteDataSourceImpl = this;
            return new Result.Failure(transactionsRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }
}
