package mx.openpay.library.data.datasource.remote.datasource;

import ek.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.OpenPayAPI;
import mx.openpay.library.data.datasource.remote.model.request.taponphone.RegisterSmartphoneRequestDto;
import mx.openpay.library.data.mapper.taponphone.RegisterSmartphoneMapperKt;
import mx.openpay.library.domain.datasource.TapOnPhoneDataSource;
import mx.openpay.library.domain.model.taponphone.RegisterSmartphoneRequest;
import mx.openpay.library.domain.util.ErrorHandler;
import mx.openpay.library.domain.util.Result;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* JADX INFO: compiled from: TapOnPhoneDataSourceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lmx/openpay/library/data/datasource/remote/datasource/TapOnPhoneDataSourceImpl;", "Lmx/openpay/library/domain/datasource/TapOnPhoneDataSource;", "openPayAPI", "Lmx/openpay/library/data/datasource/remote/OpenPayAPI;", "errorHandler", "Lmx/openpay/library/domain/util/ErrorHandler;", "(Lmx/openpay/library/data/datasource/remote/OpenPayAPI;Lmx/openpay/library/domain/util/ErrorHandler;)V", "registerSmartphone", "Lmx/openpay/library/domain/util/Result;", "", "registerSmartphoneRequest", "Lmx/openpay/library/domain/model/taponphone/RegisterSmartphoneRequest;", "(Lmx/openpay/library/domain/model/taponphone/RegisterSmartphoneRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TapOnPhoneDataSourceImpl implements TapOnPhoneDataSource {

    @NotNull
    private final ErrorHandler errorHandler;

    @NotNull
    private final OpenPayAPI openPayAPI;

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.TapOnPhoneDataSourceImpl$registerSmartphone$1, reason: invalid class name */
    /* JADX INFO: compiled from: TapOnPhoneDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.TapOnPhoneDataSourceImpl", f = "TapOnPhoneDataSourceImpl.kt", i = {0}, l = {18}, m = "registerSmartphone", n = {"this"}, s = {"L$0"})
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
            return TapOnPhoneDataSourceImpl.this.registerSmartphone(null, this);
        }
    }

    public TapOnPhoneDataSourceImpl(@NotNull OpenPayAPI openPayAPI, @NotNull ErrorHandler errorHandler) {
        Intrinsics.checkNotNullParameter(openPayAPI, "openPayAPI");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.openPayAPI = openPayAPI;
        this.errorHandler = errorHandler;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004c, B:25:0x0054, B:26:0x0060, B:28:0x0066, B:31:0x006e), top: B:38:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004c, B:25:0x0054, B:26:0x0060, B:28:0x0066, B:31:0x006e), top: B:38:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.TapOnPhoneDataSource
    @Nullable
    public Object registerSmartphone(@NotNull RegisterSmartphoneRequest registerSmartphoneRequest, @NotNull Continuation<? super Result<Boolean>> continuation) {
        AnonymousClass1 anonymousClass1;
        TapOnPhoneDataSourceImpl tapOnPhoneDataSourceImpl;
        Result.Failure failure;
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
        Object objRegisterSmartphone = anonymousClass1.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objRegisterSmartphone);
            try {
                OpenPayAPI openPayAPI = this.openPayAPI;
                RegisterSmartphoneRequestDto registerSmartphoneRequestDtoMapToRequestDto = RegisterSmartphoneMapperKt.mapToRequestDto(registerSmartphoneRequest);
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                objRegisterSmartphone = openPayAPI.registerSmartphone(registerSmartphoneRequestDtoMapToRequestDto, anonymousClass1);
                if (objRegisterSmartphone == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneDataSourceImpl = this;
                response = (Response) objRegisterSmartphone;
                if (response.isSuccessful()) {
                    return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                }
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null) {
                    strString = "";
                } else {
                    strString = "";
                }
                failure = new Result.Failure(tapOnPhoneDataSourceImpl.errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                tapOnPhoneDataSourceImpl = this;
                failure = new Result.Failure(tapOnPhoneDataSourceImpl.errorHandler.getError(e));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tapOnPhoneDataSourceImpl = (TapOnPhoneDataSourceImpl) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(objRegisterSmartphone);
                response = (Response) objRegisterSmartphone;
                if (response.isSuccessful()) {
                    return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                }
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                failure = new Result.Failure(tapOnPhoneDataSourceImpl.errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e7) {
                e = e7;
                failure = new Result.Failure(tapOnPhoneDataSourceImpl.errorHandler.getError(e));
            }
        }
        return failure;
    }
}
