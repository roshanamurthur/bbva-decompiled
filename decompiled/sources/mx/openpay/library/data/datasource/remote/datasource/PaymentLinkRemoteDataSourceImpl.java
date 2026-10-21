package mx.openpay.library.data.datasource.remote.datasource;

import ek.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import mx.openpay.library.data.datasource.remote.OpenPayAPI;
import mx.openpay.library.data.datasource.remote.model.request.EmptyRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.paymentlink.CreatePaymentLinkRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.paymentlink.UpdatePaymentLinkRequestDto;
import mx.openpay.library.data.datasource.remote.model.response.TransactionResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.paymentlink.PaymentLinkResponseDto;
import mx.openpay.library.data.mapper.paymentlink.PaymentLinkMapperKt;
import mx.openpay.library.data.mapper.transaction.TransactionMapperKt;
import mx.openpay.library.domain.datasource.PaymentLinkRemoteDataSource;
import mx.openpay.library.domain.model.Error;
import mx.openpay.library.domain.model.IntegratorTags;
import mx.openpay.library.domain.model.link.CreatePaymentLink;
import mx.openpay.library.domain.model.link.PaymentLink;
import mx.openpay.library.domain.model.link.PaymentLinkFilter;
import mx.openpay.library.domain.model.link.PaymentLinkStatus;
import mx.openpay.library.domain.model.link.UpdatePaymentLink;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.util.Constant;
import mx.openpay.library.domain.util.ErrorHandler;
import mx.openpay.library.domain.util.Result;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* JADX INFO: compiled from: PaymentLinkRemoteDataSourceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0019\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lmx/openpay/library/data/datasource/remote/datasource/PaymentLinkRemoteDataSourceImpl;", "Lmx/openpay/library/domain/datasource/PaymentLinkRemoteDataSource;", "openPayAPI", "Lmx/openpay/library/data/datasource/remote/OpenPayAPI;", "errorHandler", "Lmx/openpay/library/domain/util/ErrorHandler;", "integratorTags", "Lmx/openpay/library/domain/model/IntegratorTags;", "(Lmx/openpay/library/data/datasource/remote/OpenPayAPI;Lmx/openpay/library/domain/util/ErrorHandler;Lmx/openpay/library/domain/model/IntegratorTags;)V", "checkPaymentLink", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/link/PaymentLink;", "paymentLinkId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentLink", "Lmx/openpay/library/domain/model/link/CreatePaymentLink;", "(Lmx/openpay/library/domain/model/link/CreatePaymentLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPaymentLinks", "", "paymentLinkFilter", "Lmx/openpay/library/domain/model/link/PaymentLinkFilter;", "(Lmx/openpay/library/domain/model/link/PaymentLinkFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refundPaymentLink", "Lmx/openpay/library/domain/model/transaction/Transaction;", "transactionId", "updatePaymentLink", "Lmx/openpay/library/domain/model/link/UpdatePaymentLink;", "(Lmx/openpay/library/domain/model/link/UpdatePaymentLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentLinkStatus", "status", "Lmx/openpay/library/domain/model/link/PaymentLinkStatus;", "(Ljava/lang/String;Lmx/openpay/library/domain/model/link/PaymentLinkStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaymentLinkRemoteDataSourceImpl implements PaymentLinkRemoteDataSource {
    private static final int ERROR_CODE_404 = 404;

    @NotNull
    private final ErrorHandler errorHandler;

    @NotNull
    private final IntegratorTags integratorTags;

    @NotNull
    private final OpenPayAPI openPayAPI;

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.PaymentLinkRemoteDataSourceImpl$checkPaymentLink$1, reason: invalid class name */
    /* JADX INFO: compiled from: PaymentLinkRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.PaymentLinkRemoteDataSourceImpl", f = "PaymentLinkRemoteDataSourceImpl.kt", i = {0}, l = {148}, m = "checkPaymentLink", n = {"this"}, s = {"L$0"})
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
            return PaymentLinkRemoteDataSourceImpl.this.checkPaymentLink(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.PaymentLinkRemoteDataSourceImpl$createPaymentLink$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PaymentLinkRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.PaymentLinkRemoteDataSourceImpl", f = "PaymentLinkRemoteDataSourceImpl.kt", i = {0}, l = {33}, m = "createPaymentLink", n = {"this"}, s = {"L$0"})
    public static final class C07681 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07681(Continuation<? super C07681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentLinkRemoteDataSourceImpl.this.createPaymentLink(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.PaymentLinkRemoteDataSourceImpl$getAllPaymentLinks$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PaymentLinkRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.PaymentLinkRemoteDataSourceImpl", f = "PaymentLinkRemoteDataSourceImpl.kt", i = {0}, l = {66}, m = "getAllPaymentLinks", n = {"this"}, s = {"L$0"})
    public static final class C07691 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07691(Continuation<? super C07691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentLinkRemoteDataSourceImpl.this.getAllPaymentLinks(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.PaymentLinkRemoteDataSourceImpl$refundPaymentLink$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PaymentLinkRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.PaymentLinkRemoteDataSourceImpl", f = "PaymentLinkRemoteDataSourceImpl.kt", i = {0}, l = {168}, m = "refundPaymentLink", n = {"this"}, s = {"L$0"})
    public static final class C07701 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07701(Continuation<? super C07701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentLinkRemoteDataSourceImpl.this.refundPaymentLink(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.PaymentLinkRemoteDataSourceImpl$updatePaymentLink$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PaymentLinkRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.PaymentLinkRemoteDataSourceImpl", f = "PaymentLinkRemoteDataSourceImpl.kt", i = {0}, l = {124}, m = "updatePaymentLink", n = {"this"}, s = {"L$0"})
    public static final class C07711 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07711(Continuation<? super C07711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentLinkRemoteDataSourceImpl.this.updatePaymentLink(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.PaymentLinkRemoteDataSourceImpl$updatePaymentLinkStatus$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PaymentLinkRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.PaymentLinkRemoteDataSourceImpl", f = "PaymentLinkRemoteDataSourceImpl.kt", i = {0}, l = {100}, m = "updatePaymentLinkStatus", n = {"this"}, s = {"L$0"})
    public static final class C07721 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07721(Continuation<? super C07721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentLinkRemoteDataSourceImpl.this.updatePaymentLinkStatus(null, null, this);
        }
    }

    public PaymentLinkRemoteDataSourceImpl(@NotNull OpenPayAPI openPayAPI, @NotNull ErrorHandler errorHandler, @NotNull IntegratorTags integratorTags) {
        Intrinsics.checkNotNullParameter(openPayAPI, "openPayAPI");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(integratorTags, "integratorTags");
        this.openPayAPI = openPayAPI;
        this.errorHandler = errorHandler;
        this.integratorTags = integratorTags;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0058 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c A[Catch: Exception -> 0x002d, TRY_ENTER, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.PaymentLinkRemoteDataSource
    @Nullable
    public Object checkPaymentLink(@NotNull String str, @NotNull Continuation<? super Result<PaymentLink>> continuation) {
        AnonymousClass1 anonymousClass1;
        PaymentLinkRemoteDataSourceImpl paymentLinkRemoteDataSourceImpl;
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
        Object objCheckPaymentLink = anonymousClass1.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentLinkRemoteDataSourceImpl = (PaymentLinkRemoteDataSourceImpl) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(objCheckPaymentLink);
                response = (Response) objCheckPaymentLink;
                if (response.isSuccessful()) {
                    PaymentLinkResponseDto paymentLinkResponseDto = (PaymentLinkResponseDto) response.body();
                    return paymentLinkResponseDto != null ? new Result.Success(PaymentLinkMapperKt.mapToLocalPaymentLink(paymentLinkResponseDto), null, 2, null) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                ErrorHandler errorHandler = paymentLinkRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(paymentLinkRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(objCheckPaymentLink);
        try {
            OpenPayAPI openPayAPI = this.openPayAPI;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objCheckPaymentLink = openPayAPI.checkPaymentLink(str, anonymousClass1);
            if (objCheckPaymentLink == coroutine_suspended) {
                return coroutine_suspended;
            }
            paymentLinkRemoteDataSourceImpl = this;
            response = (Response) objCheckPaymentLink;
            if (response.isSuccessful()) {
                PaymentLinkResponseDto paymentLinkResponseDto2 = (PaymentLinkResponseDto) response.body();
                if (paymentLinkResponseDto2 != null) {
                }
            }
            ErrorHandler errorHandler2 = paymentLinkRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            paymentLinkRemoteDataSourceImpl = this;
            return new Result.Failure(paymentLinkRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0056 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004e, B:25:0x0056, B:27:0x005e, B:31:0x0072, B:33:0x007c, B:36:0x0084), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x005e A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004e, B:25:0x0056, B:27:0x005e, B:31:0x0072, B:33:0x007c, B:36:0x0084), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[Catch: Exception -> 0x002d, TRY_ENTER, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004e, B:25:0x0056, B:27:0x005e, B:31:0x0072, B:33:0x007c, B:36:0x0084), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.PaymentLinkRemoteDataSource
    @Nullable
    public Object createPaymentLink(@NotNull CreatePaymentLink createPaymentLink, @NotNull Continuation<? super Result<PaymentLink>> continuation) {
        C07681 c07681;
        PaymentLinkRemoteDataSourceImpl paymentLinkRemoteDataSourceImpl;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof C07681) {
            c07681 = (C07681) continuation;
            int i10 = c07681.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07681.label = i10 - Integer.MIN_VALUE;
            } else {
                c07681 = new C07681(continuation);
            }
        } else {
            c07681 = new C07681(continuation);
        }
        Object objCreatePaymentLink = c07681.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07681.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentLinkRemoteDataSourceImpl = (PaymentLinkRemoteDataSourceImpl) c07681.L$0;
            try {
                ResultKt.throwOnFailure(objCreatePaymentLink);
                response = (Response) objCreatePaymentLink;
                if (response.isSuccessful()) {
                    PaymentLinkResponseDto paymentLinkResponseDto = (PaymentLinkResponseDto) response.body();
                    return paymentLinkResponseDto != null ? new Result.Success(PaymentLinkMapperKt.mapToLocalPaymentLink(paymentLinkResponseDto), null, 2, null) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                ErrorHandler errorHandler = paymentLinkRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(paymentLinkRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(objCreatePaymentLink);
        try {
            OpenPayAPI openPayAPI = this.openPayAPI;
            CreatePaymentLinkRequestDto createPaymentLinkRequestDtoMapToCreatePaymentLinkRequestDto = PaymentLinkMapperKt.mapToCreatePaymentLinkRequestDto(createPaymentLink, this.integratorTags);
            c07681.L$0 = this;
            c07681.label = 1;
            objCreatePaymentLink = openPayAPI.createPaymentLink(createPaymentLinkRequestDtoMapToCreatePaymentLinkRequestDto, c07681);
            if (objCreatePaymentLink == coroutine_suspended) {
                return coroutine_suspended;
            }
            paymentLinkRemoteDataSourceImpl = this;
            response = (Response) objCreatePaymentLink;
            if (response.isSuccessful()) {
                PaymentLinkResponseDto paymentLinkResponseDto2 = (PaymentLinkResponseDto) response.body();
                if (paymentLinkResponseDto2 != null) {
                }
            }
            ErrorHandler errorHandler2 = paymentLinkRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            paymentLinkRemoteDataSourceImpl = this;
            return new Result.Failure(paymentLinkRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ce A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:13:0x0030, B:38:0x00c5, B:40:0x00ce, B:42:0x00d6, B:46:0x00e8, B:48:0x00f0, B:50:0x00fa, B:52:0x0104, B:55:0x010c), top: B:61:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6 A[Catch: Exception -> 0x0035, TRY_LEAVE, TryCatch #1 {Exception -> 0x0035, blocks: (B:13:0x0030, B:38:0x00c5, B:40:0x00ce, B:42:0x00d6, B:46:0x00e8, B:48:0x00f0, B:50:0x00fa, B:52:0x0104, B:55:0x010c), top: B:61:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e8 A[Catch: Exception -> 0x0035, TRY_ENTER, TryCatch #1 {Exception -> 0x0035, blocks: (B:13:0x0030, B:38:0x00c5, B:40:0x00ce, B:42:0x00d6, B:46:0x00e8, B:48:0x00f0, B:50:0x00fa, B:52:0x0104, B:55:0x010c), top: B:61:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0 A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:13:0x0030, B:38:0x00c5, B:40:0x00ce, B:42:0x00d6, B:46:0x00e8, B:48:0x00f0, B:50:0x00fa, B:52:0x0104, B:55:0x010c), top: B:61:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:13:0x0030, B:38:0x00c5, B:40:0x00ce, B:42:0x00d6, B:46:0x00e8, B:48:0x00f0, B:50:0x00fa, B:52:0x0104, B:55:0x010c), top: B:61:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // mx.openpay.library.domain.datasource.PaymentLinkRemoteDataSource
    @Nullable
    public Object getAllPaymentLinks(@NotNull PaymentLinkFilter paymentLinkFilter, @NotNull Continuation<? super Result<? extends List<PaymentLink>>> continuation) {
        C07691 c07691;
        PaymentLinkRemoteDataSourceImpl paymentLinkRemoteDataSourceImpl;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof C07691) {
            c07691 = (C07691) continuation;
            int i10 = c07691.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07691.label = i10 - Integer.MIN_VALUE;
            } else {
                c07691 = new C07691(continuation);
            }
        } else {
            c07691 = new C07691(continuation);
        }
        C07691 c07692 = c07691;
        Object allPaymentLinks = c07692.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07692.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentLinkRemoteDataSourceImpl = (PaymentLinkRemoteDataSourceImpl) c07692.L$0;
            try {
                ResultKt.throwOnFailure(allPaymentLinks);
                response = (Response) allPaymentLinks;
                if (response.isSuccessful()) {
                    List list = (List) response.body();
                    return list != null ? new Result.Success(PaymentLinkMapperKt.mapToLocalPaymentLinkList(list), null, 2, null) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                if (response.code() == 404) {
                    return new Result.Success(CollectionsKt__CollectionsKt.emptyList(), null, 2, null);
                }
                ErrorHandler errorHandler = paymentLinkRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(paymentLinkRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(allPaymentLinks);
        try {
            String strReplace$default = paymentLinkFilter.getStatus() != null ? l.replace$default(l.replace$default(l.replace$default(String.valueOf(paymentLinkFilter.getStatus()), Constant.BRACKET_OPEN, "", false, 4, (Object) null), Constant.BRACKET_CLOSE, "", false, 4, (Object) null), " ", "", false, 4, (Object) null) : null;
            OpenPayAPI openPayAPI = this.openPayAPI;
            String startDate = paymentLinkFilter.getStartDate();
            String strReplace$default2 = startDate != null ? l.replace$default(startDate, Constant.DASH_STRING, "", false, 4, (Object) null) : null;
            String endDate = paymentLinkFilter.getEndDate();
            String strReplace$default3 = endDate != null ? l.replace$default(endDate, Constant.DASH_STRING, "", false, 4, (Object) null) : null;
            String nameOrLastName = paymentLinkFilter.getNameOrLastName();
            Integer limit = paymentLinkFilter.getLimit();
            Integer offset = paymentLinkFilter.getOffset();
            c07692.L$0 = this;
            c07692.label = 1;
            allPaymentLinks = openPayAPI.getAllPaymentLinks(strReplace$default2, strReplace$default3, nameOrLastName, limit, offset, strReplace$default, c07692);
            if (allPaymentLinks == coroutine_suspended) {
                return coroutine_suspended;
            }
            paymentLinkRemoteDataSourceImpl = this;
            response = (Response) allPaymentLinks;
            if (response.isSuccessful()) {
                List list2 = (List) response.body();
                if (list2 != null) {
                }
            }
            if (response.code() == 404) {
                return new Result.Success(CollectionsKt__CollectionsKt.emptyList(), null, 2, null);
            }
            ErrorHandler errorHandler2 = paymentLinkRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            paymentLinkRemoteDataSourceImpl = this;
            return new Result.Failure(paymentLinkRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004d, B:25:0x0055, B:27:0x005d, B:31:0x0071, B:33:0x007b, B:36:0x0083), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x005d A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004d, B:25:0x0055, B:27:0x005d, B:31:0x0071, B:33:0x007b, B:36:0x0083), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[Catch: Exception -> 0x002d, TRY_ENTER, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004d, B:25:0x0055, B:27:0x005d, B:31:0x0071, B:33:0x007b, B:36:0x0083), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.PaymentLinkRemoteDataSource
    @Nullable
    public Object refundPaymentLink(@NotNull String str, @NotNull Continuation<? super Result<Transaction>> continuation) {
        C07701 c07701;
        PaymentLinkRemoteDataSourceImpl paymentLinkRemoteDataSourceImpl;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof C07701) {
            c07701 = (C07701) continuation;
            int i10 = c07701.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07701.label = i10 - Integer.MIN_VALUE;
            } else {
                c07701 = new C07701(continuation);
            }
        } else {
            c07701 = new C07701(continuation);
        }
        Object objRefundCharge = c07701.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07701.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentLinkRemoteDataSourceImpl = (PaymentLinkRemoteDataSourceImpl) c07701.L$0;
            try {
                ResultKt.throwOnFailure(objRefundCharge);
                response = (Response) objRefundCharge;
                if (response.isSuccessful()) {
                    TransactionResponseDto transactionResponseDto = (TransactionResponseDto) response.body();
                    return transactionResponseDto != null ? new Result.Success(TransactionMapperKt.mapToLocalTransaction(transactionResponseDto), null, 2, null) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                ErrorHandler errorHandler = paymentLinkRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(paymentLinkRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(objRefundCharge);
        try {
            OpenPayAPI openPayAPI = this.openPayAPI;
            EmptyRequestDto emptyRequestDto = new EmptyRequestDto();
            c07701.L$0 = this;
            c07701.label = 1;
            objRefundCharge = openPayAPI.refundCharge(str, emptyRequestDto, c07701);
            if (objRefundCharge == coroutine_suspended) {
                return coroutine_suspended;
            }
            paymentLinkRemoteDataSourceImpl = this;
            response = (Response) objRefundCharge;
            if (response.isSuccessful()) {
                TransactionResponseDto transactionResponseDto2 = (TransactionResponseDto) response.body();
                if (transactionResponseDto2 != null) {
                }
            }
            ErrorHandler errorHandler2 = paymentLinkRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            paymentLinkRemoteDataSourceImpl = this;
            return new Result.Failure(paymentLinkRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0058, B:25:0x0060, B:27:0x0068, B:31:0x007c, B:33:0x0086, B:36:0x008e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0058, B:25:0x0060, B:27:0x0068, B:31:0x007c, B:33:0x0086, B:36:0x008e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[Catch: Exception -> 0x002d, TRY_ENTER, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0058, B:25:0x0060, B:27:0x0068, B:31:0x007c, B:33:0x0086, B:36:0x008e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.PaymentLinkRemoteDataSource
    @Nullable
    public Object updatePaymentLink(@NotNull UpdatePaymentLink updatePaymentLink, @NotNull Continuation<? super Result<PaymentLink>> continuation) {
        C07711 c07711;
        PaymentLinkRemoteDataSourceImpl paymentLinkRemoteDataSourceImpl;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof C07711) {
            c07711 = (C07711) continuation;
            int i10 = c07711.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07711.label = i10 - Integer.MIN_VALUE;
            } else {
                c07711 = new C07711(continuation);
            }
        } else {
            c07711 = new C07711(continuation);
        }
        Object objUpdatePaymentLink = c07711.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07711.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentLinkRemoteDataSourceImpl = (PaymentLinkRemoteDataSourceImpl) c07711.L$0;
            try {
                ResultKt.throwOnFailure(objUpdatePaymentLink);
                response = (Response) objUpdatePaymentLink;
                if (response.isSuccessful()) {
                    PaymentLinkResponseDto paymentLinkResponseDto = (PaymentLinkResponseDto) response.body();
                    return paymentLinkResponseDto != null ? new Result.Success(PaymentLinkMapperKt.mapToLocalPaymentLink(paymentLinkResponseDto), null, 2, null) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                ErrorHandler errorHandler = paymentLinkRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(paymentLinkRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(objUpdatePaymentLink);
        try {
            OpenPayAPI openPayAPI = this.openPayAPI;
            String id = updatePaymentLink.getId();
            String strValueOf = String.valueOf(updatePaymentLink.getStatus());
            UpdatePaymentLinkRequestDto updatePaymentLinkRequestDtoMapToUpdatePaymentLinkRequestDto = PaymentLinkMapperKt.mapToUpdatePaymentLinkRequestDto(updatePaymentLink);
            c07711.L$0 = this;
            c07711.label = 1;
            objUpdatePaymentLink = openPayAPI.updatePaymentLink(id, strValueOf, updatePaymentLinkRequestDtoMapToUpdatePaymentLinkRequestDto, c07711);
            if (objUpdatePaymentLink == coroutine_suspended) {
                return coroutine_suspended;
            }
            paymentLinkRemoteDataSourceImpl = this;
            response = (Response) objUpdatePaymentLink;
            if (response.isSuccessful()) {
                PaymentLinkResponseDto paymentLinkResponseDto2 = (PaymentLinkResponseDto) response.body();
                if (paymentLinkResponseDto2 != null) {
                }
            }
            ErrorHandler errorHandler2 = paymentLinkRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            paymentLinkRemoteDataSourceImpl = this;
            return new Result.Failure(paymentLinkRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059 A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0051, B:25:0x0059, B:27:0x0061, B:31:0x0075, B:33:0x007f, B:36:0x0087), top: B:44:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0051, B:25:0x0059, B:27:0x0061, B:31:0x0075, B:33:0x007f, B:36:0x0087), top: B:44:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075 A[Catch: Exception -> 0x002d, TRY_ENTER, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0051, B:25:0x0059, B:27:0x0061, B:31:0x0075, B:33:0x007f, B:36:0x0087), top: B:44:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.PaymentLinkRemoteDataSource
    @Nullable
    public Object updatePaymentLinkStatus(@NotNull String str, @NotNull PaymentLinkStatus paymentLinkStatus, @NotNull Continuation<? super Result<PaymentLink>> continuation) {
        C07721 c07721;
        PaymentLinkRemoteDataSourceImpl paymentLinkRemoteDataSourceImpl;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof C07721) {
            c07721 = (C07721) continuation;
            int i10 = c07721.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07721.label = i10 - Integer.MIN_VALUE;
            } else {
                c07721 = new C07721(continuation);
            }
        } else {
            c07721 = new C07721(continuation);
        }
        Object objUpdatePaymentLinkStatus = c07721.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07721.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentLinkRemoteDataSourceImpl = (PaymentLinkRemoteDataSourceImpl) c07721.L$0;
            try {
                ResultKt.throwOnFailure(objUpdatePaymentLinkStatus);
                response = (Response) objUpdatePaymentLinkStatus;
                if (response.isSuccessful()) {
                    PaymentLinkResponseDto paymentLinkResponseDto = (PaymentLinkResponseDto) response.body();
                    return paymentLinkResponseDto != null ? new Result.Success(PaymentLinkMapperKt.mapToLocalPaymentLink(paymentLinkResponseDto), null, 2, null) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                ErrorHandler errorHandler = paymentLinkRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(paymentLinkRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(objUpdatePaymentLinkStatus);
        try {
            OpenPayAPI openPayAPI = this.openPayAPI;
            String string = paymentLinkStatus.toString();
            EmptyRequestDto emptyRequestDto = new EmptyRequestDto();
            c07721.L$0 = this;
            c07721.label = 1;
            objUpdatePaymentLinkStatus = openPayAPI.updatePaymentLinkStatus(str, string, emptyRequestDto, c07721);
            if (objUpdatePaymentLinkStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
            paymentLinkRemoteDataSourceImpl = this;
            response = (Response) objUpdatePaymentLinkStatus;
            if (response.isSuccessful()) {
                PaymentLinkResponseDto paymentLinkResponseDto2 = (PaymentLinkResponseDto) response.body();
                if (paymentLinkResponseDto2 != null) {
                }
            }
            ErrorHandler errorHandler2 = paymentLinkRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            paymentLinkRemoteDataSourceImpl = this;
            return new Result.Failure(paymentLinkRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }
}
