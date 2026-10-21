package com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone;

import android.app.Application;
import android.content.Context;
import android.database.SQLException;
import androidx.annotation.NonNull;
import com.mypinpad.tsdk.api.TerminalSdk;
import com.mypinpad.tsdk.api.TsdkManualInitializer;
import com.viergegroup.sdk.taptophone.DeviceNfcStatus;
import com.viergegroup.sdk.taptophone.UtilsKt;
import com.viergegroup.sdk.taptophone.terminal.TerminalProvider;
import com.viergegroup.sdk.taptophone.vierge.database.DBUtils;
import com.viergegroup.sdk.taptophone.vierge.database.DbHelper;
import com.viergegroup.sdk.taptophone.vierge.domain.BackendViergeManager;
import com.viergegroup.sdk.taptophone.vierge.models.ApiVersion;
import com.viergegroup.sdk.taptophone.vierge.models.BackendViergeResponseData;
import com.viergegroup.sdk.taptophone.vierge.models.CalculateHashResponse;
import com.viergegroup.sdk.taptophone.vierge.models.MessageLectureType;
import com.viergegroup.sdk.taptophone.vierge.models.SearchTxnResponse;
import com.viergegroup.sdk.taptophone.vierge.models.SearchTxnResponseOpenPay;
import com.viergegroup.sdk.taptophone.vierge.models.SendTransactionResponse;
import com.viergegroup.sdk.taptophone.vierge.models.TokenInfo;
import com.viergegroup.sdk.taptophone.vierge.models.TransactionBackendParameters;
import com.viergegroup.sdk.taptophone.webApi.ErrorCatalog;
import com.viergegroup.sdk.taptophone.webApi.ServiceViergeBackEnd;
import com.viergegroup.sdk.taptophone.webApi.TokenRequestTask;
import com.viergegroup.sdk.taptophone.webApi.TokenResponse;
import com.viergegroup.sdk.taptophone.webApi.TransactionsApi;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import mx.openpay.library.domain.util.Constant;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes7.dex */
public class SdkTapOnPhoneVierge {
    private static DbHelper dbHelper = null;
    public static boolean isInitializeApp = false;
    public static TsdkLogger logger;
    private static SdkTapOnPhoneVierge selfInstance;
    static String serialNumber;
    private static TsdkManualInitializer tsdkManualInitializer;
    String TokenApi;
    BackendViergeManager backendViergeManager;
    private Context context;
    boolean isKeyLoaded = false;
    private TerminalProvider terminalProvider;

    public class a implements TokenResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f67626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f67627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f67628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f67629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f67630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ResponseClosePosTip f67631f;

        /* JADX INFO: renamed from: com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.SdkTapOnPhoneVierge$a$a, reason: collision with other inner class name */
        public class C0277a implements Callback<SendTransactionResponse> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ a f67633a;

            @Override // retrofit2.Callback
            public final void onFailure(Call<SendTransactionResponse> call, Throwable th2) {
                this.f67633a.f67631f.responseClosePosTip(new SendTransactionResponse());
            }

            @Override // retrofit2.Callback
            public final void onResponse(@NonNull Call<SendTransactionResponse> call, Response<SendTransactionResponse> response) {
                ErrorCatalog errorCatalogValueOf;
                a aVar = this.f67633a;
                try {
                    new SendTransactionResponse();
                    response.code();
                    if (response.isSuccessful()) {
                        aVar.f67631f.responseClosePosTip(response.body());
                        return;
                    }
                    SendTransactionResponse sendTransactionResponse = new SendTransactionResponse();
                    sendTransactionResponse.setErrorCode(response.code());
                    if (response.code() >= 400 && response.code() < 600) {
                        sendTransactionResponse.setErrorMessage(ErrorCatalog.HostUnreachable.getSetInjectedTransactionParameters());
                    }
                    aVar.f67631f.responseClosePosTip(sendTransactionResponse);
                } catch (HttpException e5) {
                    e5.getMessage();
                    SendTransactionResponse sendTransactionResponse2 = new SendTransactionResponse();
                    if (response.code() < 400 || response.code() >= 600) {
                        try {
                            errorCatalogValueOf = ErrorCatalog.valueOf(Integer.toString(response.code()));
                        } catch (IllegalArgumentException unused) {
                            errorCatalogValueOf = ErrorCatalog.Error;
                        }
                    } else {
                        errorCatalogValueOf = ErrorCatalog.HostUnreachable;
                    }
                    sendTransactionResponse2.setErrorCode(errorCatalogValueOf.getBOD());
                    sendTransactionResponse2.setErrorMessage(errorCatalogValueOf.getSetInjectedTransactionParameters());
                    aVar.f67631f.responseClosePosTip(sendTransactionResponse2);
                }
            }
        }

        public a(String str, String str2, String str3, String str4, String str5, ResponseClosePosTip responseClosePosTip) {
            this.f67626a = str;
            this.f67627b = str2;
            this.f67628c = str3;
            this.f67629d = str4;
            this.f67630e = str5;
            this.f67631f = responseClosePosTip;
        }

        @Override // com.viergegroup.sdk.taptophone.webApi.TokenResponse
        public final void getTokenOAth(TokenInfo tokenInfo) {
            tokenInfo.getToken();
            ServiceViergeBackEnd.setToken(tokenInfo.getToken());
            Call<SendTransactionResponse> callSendTransaction = ((TransactionsApi) ServiceViergeBackEnd.getRetrofitInstance(1).create(TransactionsApi.class)).sendTransaction(SdkTapOnPhoneVierge.this.getJsonSendTransactionCloseTipRequest(this.f67626a, this.f67627b, "ClosePosTip", this.f67628c, this.f67629d, this.f67630e, ApiVersion.Version2));
            C0277a c0277a = new C0277a();
            c0277a.f67633a = this;
            callSendTransaction.enqueue(c0277a);
        }
    }

    public class b implements TokenResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f67634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f67635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f67636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f67637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f67638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f67639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f67640g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ResponseSaleDataOpenPay f67641h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ProcessMessageLectureCard f67642i;

        public class a implements Function1<MessageLectureType, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public /* synthetic */ b f67644p0;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
                this.f67644p0.f67642i.processMessageFromLectureCard(messageLectureType);
                return null;
            }
        }

        /* JADX INFO: renamed from: com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.SdkTapOnPhoneVierge$b$b, reason: collision with other inner class name */
        public class C0278b implements Callback<SearchTxnResponseOpenPay> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ ResponseSaleDataOpenPay f67645a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ b f67646b;

            @Override // retrofit2.Callback
            public final void onFailure(Call<SearchTxnResponseOpenPay> call, Throwable th2) {
                th2.getMessage();
                SearchTxnResponseOpenPay searchTxnResponseOpenPay = new SearchTxnResponseOpenPay();
                th2.getMessage();
                ErrorCatalog errorCatalog = ErrorCatalog.HostUnreachable;
                searchTxnResponseOpenPay.setErrorCode(errorCatalog.getBOD());
                searchTxnResponseOpenPay.setErrorMessage(errorCatalog.getSetInjectedTransactionParameters());
                this.f67645a.responseSaleTransaction(searchTxnResponseOpenPay);
            }

            @Override // retrofit2.Callback
            public final void onResponse(Call<SearchTxnResponseOpenPay> call, Response<SearchTxnResponseOpenPay> response) {
                ErrorCatalog errorCatalogValueOf;
                SearchTxnResponseOpenPay searchTxnResponseOpenPay;
                ResponseSaleDataOpenPay responseSaleDataOpenPay = this.f67645a;
                response.code();
                try {
                    response.code();
                    boolean zIsSuccessful = response.isSuccessful();
                    b bVar = this.f67646b;
                    if (zIsSuccessful) {
                        searchTxnResponseOpenPay = response.body();
                        Integer.toString(searchTxnResponseOpenPay.getErrorCode());
                        response.body().getTransactionDto().getRrn();
                        searchTxnResponseOpenPay.getTransactionDto().getRrn();
                        response.body().getTransactionDto().getRrn();
                        ErrorCatalog errorFromCatalog = SdkTapOnPhoneVierge.this.getErrorFromCatalog(Integer.valueOf(searchTxnResponseOpenPay.getErrorCode()));
                        searchTxnResponseOpenPay.setErrorCode(errorFromCatalog.getBOD());
                        searchTxnResponseOpenPay.setErrorMessage(errorFromCatalog.getSetInjectedTransactionParameters());
                    } else {
                        searchTxnResponseOpenPay = new SearchTxnResponseOpenPay();
                        if (SdkTapOnPhoneVierge.this.isErrorInCatalog(Integer.valueOf(response.code()))) {
                            ErrorCatalog errorFromCatalog2 = SdkTapOnPhoneVierge.this.getErrorFromCatalog(Integer.valueOf(response.code()));
                            searchTxnResponseOpenPay.setErrorCode(errorFromCatalog2.getBOD());
                            searchTxnResponseOpenPay.setErrorMessage(errorFromCatalog2.getSetInjectedTransactionParameters());
                        } else {
                            searchTxnResponseOpenPay.setErrorCode(response.code());
                            searchTxnResponseOpenPay.setErrorMessage(response.message());
                        }
                    }
                    responseSaleDataOpenPay.responseSaleTransaction(searchTxnResponseOpenPay);
                } catch (HttpException e5) {
                    e5.getMessage();
                    SearchTxnResponseOpenPay searchTxnResponseOpenPay2 = new SearchTxnResponseOpenPay();
                    if (response.code() < 400 || response.code() >= 600) {
                        try {
                            errorCatalogValueOf = ErrorCatalog.valueOf(Integer.toString(response.code()));
                        } catch (IllegalArgumentException unused) {
                            errorCatalogValueOf = ErrorCatalog.Error;
                        }
                    } else {
                        errorCatalogValueOf = ErrorCatalog.HostUnreachable;
                    }
                    searchTxnResponseOpenPay2.setErrorCode(errorCatalogValueOf.getBOD());
                    searchTxnResponseOpenPay2.setErrorMessage(errorCatalogValueOf.getSetInjectedTransactionParameters());
                    responseSaleDataOpenPay.responseSaleTransaction(searchTxnResponseOpenPay2);
                }
            }
        }

        public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, ResponseSaleDataOpenPay responseSaleDataOpenPay, ProcessMessageLectureCard processMessageLectureCard) {
            this.f67634a = str;
            this.f67635b = str2;
            this.f67636c = str3;
            this.f67637d = str4;
            this.f67638e = str5;
            this.f67639f = str6;
            this.f67640g = str7;
            this.f67641h = responseSaleDataOpenPay;
            this.f67642i = processMessageLectureCard;
        }

        @Override // com.viergegroup.sdk.taptophone.webApi.TokenResponse
        public final void getTokenOAth(TokenInfo tokenInfo) {
            String token = tokenInfo.getToken();
            SdkTapOnPhoneVierge sdkTapOnPhoneVierge = SdkTapOnPhoneVierge.this;
            sdkTapOnPhoneVierge.TokenApi = token;
            final TransactionBackendParameters transactionBackendParameters = new TransactionBackendParameters(this.f67634a, this.f67635b, "Sale", this.f67636c, "", ApiVersion.Version2, this.f67637d, this.f67638e, this.f67639f, this.f67640g);
            transactionBackendParameters.getTransactionAmount();
            String serialNumber = DBUtils.getSerialNumber();
            "serial Number DB: ".concat(String.valueOf(serialNumber));
            if (serialNumber.isEmpty()) {
                DBUtils.updateSerialNumber(SdkTapOnPhoneVierge.serialNumber);
            } else {
                SdkTapOnPhoneVierge.serialNumber = serialNumber;
            }
            transactionBackendParameters.setTerminalSerialNumber(SdkTapOnPhoneVierge.padLeft(SdkTapOnPhoneVierge.serialNumber, 20));
            BackendViergeManager backendViergeManager = sdkTapOnPhoneVierge.backendViergeManager;
            final String str = this.f67634a;
            final ResponseSaleDataOpenPay responseSaleDataOpenPay = this.f67641h;
            Function1<? super BackendViergeResponseData, Unit> function1 = new Function1() { // from class: com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    BackendViergeResponseData backendViergeResponseData = (BackendViergeResponseData) obj;
                    SdkTapOnPhoneVierge.b bVar = this.f67749p0;
                    SdkTapOnPhoneVierge sdkTapOnPhoneVierge2 = SdkTapOnPhoneVierge.this;
                    ServiceViergeBackEnd.setToken(sdkTapOnPhoneVierge2.TokenApi);
                    TransactionsApi transactionsApi = (TransactionsApi) ServiceViergeBackEnd.getRetrofitInstance(1).create(TransactionsApi.class);
                    int f67869a = backendViergeResponseData.getF67869a();
                    TransactionBackendParameters transactionBackendParameters2 = transactionBackendParameters;
                    ResponseSaleDataOpenPay responseSaleDataOpenPay2 = responseSaleDataOpenPay;
                    if (f67869a == 0) {
                        Call<SearchTxnResponseOpenPay> callSearchTxnOpenPay = transactionsApi.searchTxnOpenPay(sdkTapOnPhoneVierge2.getJsonSearchRequest(SdkTapOnPhoneVierge.padLeft(transactionBackendParameters2.getTerminalSerialNumber(), 20), transactionBackendParameters2.getRrn(), ApiVersion.Version2, str));
                        SdkTapOnPhoneVierge.b.C0278b c0278b = new SdkTapOnPhoneVierge.b.C0278b();
                        c0278b.f67646b = bVar;
                        c0278b.f67645a = responseSaleDataOpenPay2;
                        callSearchTxnOpenPay.enqueue(c0278b);
                        return null;
                    }
                    backendViergeResponseData.getF67873b();
                    backendViergeResponseData.getF67869a();
                    SearchTxnResponseOpenPay searchTxnResponseOpenPay = new SearchTxnResponseOpenPay();
                    transactionBackendParameters2.getRrn();
                    searchTxnResponseOpenPay.setErrorCode(backendViergeResponseData.getF67869a());
                    searchTxnResponseOpenPay.setErrorMessage(backendViergeResponseData.getF67873b());
                    responseSaleDataOpenPay2.responseSaleTransaction(searchTxnResponseOpenPay);
                    return null;
                }
            };
            a aVar = new a();
            aVar.f67644p0 = this;
            backendViergeManager.executeTransaction(transactionBackendParameters, function1, aVar);
        }
    }

    public class c implements TokenResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f67647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f67648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f67649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ResponseReverseData f67650d;

        public class a implements Callback<SendTransactionResponse> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ c f67652a;

            @Override // retrofit2.Callback
            public final void onFailure(Call<SendTransactionResponse> call, Throwable th2) {
                th2.getMessage();
                SendTransactionResponse sendTransactionResponse = new SendTransactionResponse();
                sendTransactionResponse.setErrorMessage(th2.getMessage());
                sendTransactionResponse.setErrorCode(th2.hashCode());
                this.f67652a.f67650d.responseReverseData(sendTransactionResponse);
            }

            @Override // retrofit2.Callback
            public final void onResponse(Call<SendTransactionResponse> call, Response<SendTransactionResponse> response) {
                c cVar = this.f67652a;
                SendTransactionResponse sendTransactionResponse = new SendTransactionResponse();
                try {
                    if (response.isSuccessful()) {
                        cVar.f67650d.responseReverseData(response.body());
                    } else {
                        sendTransactionResponse.setErrorCode(response.code());
                        sendTransactionResponse.setErrorMessage(response.message());
                        cVar.f67650d.responseReverseData(sendTransactionResponse);
                    }
                } catch (HttpException e5) {
                    SendTransactionResponse sendTransactionResponse2 = new SendTransactionResponse();
                    sendTransactionResponse2.setErrorCode(e5.hashCode());
                    sendTransactionResponse2.setErrorMessage(e5.getMessage());
                    cVar.f67650d.responseReverseData(sendTransactionResponse2);
                }
            }
        }

        public c(String str, String str2, String str3, ResponseReverseData responseReverseData) {
            this.f67647a = str;
            this.f67648b = str2;
            this.f67649c = str3;
            this.f67650d = responseReverseData;
        }

        @Override // com.viergegroup.sdk.taptophone.webApi.TokenResponse
        public final void getTokenOAth(TokenInfo tokenInfo) {
            String token = tokenInfo.getToken();
            SdkTapOnPhoneVierge sdkTapOnPhoneVierge = SdkTapOnPhoneVierge.this;
            sdkTapOnPhoneVierge.TokenApi = token;
            String str = sdkTapOnPhoneVierge.TokenApi;
            String serialNumber = DBUtils.getSerialNumber();
            "serial Number DB: ".concat(String.valueOf(serialNumber));
            if (serialNumber.isEmpty()) {
                DBUtils.updateSerialNumber(SdkTapOnPhoneVierge.serialNumber);
            } else {
                SdkTapOnPhoneVierge.serialNumber = serialNumber;
            }
            String strPadLeft = SdkTapOnPhoneVierge.padLeft(SdkTapOnPhoneVierge.serialNumber, 20);
            String str2 = this.f67647a;
            ServiceViergeBackEnd.setToken(sdkTapOnPhoneVierge.TokenApi);
            Call<SendTransactionResponse> callSendTransaction = ((TransactionsApi) ServiceViergeBackEnd.getRetrofitInstance(1).create(TransactionsApi.class)).sendTransaction(SdkTapOnPhoneVierge.this.getJsonSendTransactionRequest(this.f67648b, this.f67649c, "Reverse", strPadLeft, str2, ApiVersion.Version2));
            a aVar = new a();
            aVar.f67652a = this;
            callSendTransaction.enqueue(aVar);
        }
    }

    public class d implements TokenResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f67653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f67654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f67655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ResponseSaleData f67656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ProcessMessageLectureCard f67657e;

        public class a implements Callback<SearchTxnResponse> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ ResponseSaleData f67659a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ d f67660b;

            @Override // retrofit2.Callback
            public final void onFailure(Call<SearchTxnResponse> call, Throwable th2) {
                th2.getMessage();
                SearchTxnResponse searchTxnResponse = new SearchTxnResponse();
                th2.getMessage();
                ErrorCatalog errorCatalog = ErrorCatalog.HostUnreachable;
                searchTxnResponse.setErrorCode(errorCatalog.getBOD());
                searchTxnResponse.setErrorMessage(errorCatalog.getSetInjectedTransactionParameters());
                this.f67659a.responseSaleTransaction(searchTxnResponse);
            }

            @Override // retrofit2.Callback
            public final void onResponse(Call<SearchTxnResponse> call, Response<SearchTxnResponse> response) {
                ErrorCatalog errorCatalogValueOf;
                SearchTxnResponse searchTxnResponse;
                ResponseSaleData responseSaleData = this.f67659a;
                response.code();
                try {
                    response.code();
                    boolean zIsSuccessful = response.isSuccessful();
                    d dVar = this.f67660b;
                    if (zIsSuccessful) {
                        searchTxnResponse = response.body();
                        Integer.toString(searchTxnResponse.getF67972a());
                        response.body().getF67974c().getRrn();
                        searchTxnResponse.getF67974c().getRrn();
                        response.body().getF67974c().getRrn();
                        ErrorCatalog errorFromCatalog = SdkTapOnPhoneVierge.this.getErrorFromCatalog(Integer.valueOf(searchTxnResponse.getF67972a()));
                        searchTxnResponse.setErrorCode(errorFromCatalog.getBOD());
                        searchTxnResponse.setErrorMessage(errorFromCatalog.getSetInjectedTransactionParameters());
                    } else {
                        searchTxnResponse = new SearchTxnResponse();
                        if (SdkTapOnPhoneVierge.this.isErrorInCatalog(Integer.valueOf(response.code()))) {
                            ErrorCatalog errorFromCatalog2 = SdkTapOnPhoneVierge.this.getErrorFromCatalog(Integer.valueOf(response.code()));
                            searchTxnResponse.setErrorCode(errorFromCatalog2.getBOD());
                            searchTxnResponse.setErrorMessage(errorFromCatalog2.getSetInjectedTransactionParameters());
                        } else {
                            searchTxnResponse.setErrorCode(response.code());
                            searchTxnResponse.setErrorMessage(response.message());
                        }
                    }
                    responseSaleData.responseSaleTransaction(searchTxnResponse);
                } catch (HttpException e5) {
                    e5.getMessage();
                    SearchTxnResponse searchTxnResponse2 = new SearchTxnResponse();
                    if (response.code() < 400 || response.code() >= 600) {
                        try {
                            errorCatalogValueOf = ErrorCatalog.valueOf(Integer.toString(response.code()));
                        } catch (IllegalArgumentException unused) {
                            errorCatalogValueOf = ErrorCatalog.Error;
                        }
                    } else {
                        errorCatalogValueOf = ErrorCatalog.HostUnreachable;
                    }
                    searchTxnResponse2.setErrorCode(errorCatalogValueOf.getBOD());
                    searchTxnResponse2.setErrorMessage(errorCatalogValueOf.getSetInjectedTransactionParameters());
                    responseSaleData.responseSaleTransaction(searchTxnResponse2);
                }
            }
        }

        public class b implements Function1<MessageLectureType, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public /* synthetic */ d f67661p0;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
                this.f67661p0.f67657e.processMessageFromLectureCard(messageLectureType);
                return null;
            }
        }

        public d(String str, String str2, String str3, ResponseSaleData responseSaleData, ProcessMessageLectureCard processMessageLectureCard) {
            this.f67653a = str;
            this.f67654b = str2;
            this.f67655c = str3;
            this.f67656d = responseSaleData;
            this.f67657e = processMessageLectureCard;
        }

        @Override // com.viergegroup.sdk.taptophone.webApi.TokenResponse
        public final void getTokenOAth(TokenInfo tokenInfo) {
            String token = tokenInfo.getToken();
            SdkTapOnPhoneVierge sdkTapOnPhoneVierge = SdkTapOnPhoneVierge.this;
            sdkTapOnPhoneVierge.TokenApi = token;
            final TransactionBackendParameters transactionBackendParameters = new TransactionBackendParameters(this.f67653a, this.f67654b, "Sale", this.f67655c, "", ApiVersion.Version2);
            transactionBackendParameters.getTransactionAmount();
            String serialNumber = DBUtils.getSerialNumber();
            "serial Number DB: ".concat(String.valueOf(serialNumber));
            if (serialNumber.isEmpty()) {
                DBUtils.updateSerialNumber(SdkTapOnPhoneVierge.serialNumber);
            } else {
                SdkTapOnPhoneVierge.serialNumber = serialNumber;
            }
            transactionBackendParameters.setTerminalSerialNumber(SdkTapOnPhoneVierge.padLeft(SdkTapOnPhoneVierge.serialNumber, 20));
            BackendViergeManager backendViergeManager = sdkTapOnPhoneVierge.backendViergeManager;
            final String str = this.f67653a;
            final ResponseSaleData responseSaleData = this.f67656d;
            Function1<? super BackendViergeResponseData, Unit> function1 = new Function1() { // from class: com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    BackendViergeResponseData backendViergeResponseData = (BackendViergeResponseData) obj;
                    SdkTapOnPhoneVierge.d dVar = this.f67753p0;
                    SdkTapOnPhoneVierge sdkTapOnPhoneVierge2 = SdkTapOnPhoneVierge.this;
                    ServiceViergeBackEnd.setToken(sdkTapOnPhoneVierge2.TokenApi);
                    TransactionsApi transactionsApi = (TransactionsApi) ServiceViergeBackEnd.getRetrofitInstance(1).create(TransactionsApi.class);
                    int f67869a = backendViergeResponseData.getF67869a();
                    TransactionBackendParameters transactionBackendParameters2 = transactionBackendParameters;
                    ResponseSaleData responseSaleData2 = responseSaleData;
                    if (f67869a == 0) {
                        Call<SearchTxnResponse> callSearchTxn = transactionsApi.searchTxn(sdkTapOnPhoneVierge2.getJsonSearchRequest(SdkTapOnPhoneVierge.padLeft(transactionBackendParameters2.getTerminalSerialNumber(), 20), transactionBackendParameters2.getRrn(), ApiVersion.Version2, str));
                        SdkTapOnPhoneVierge.d.a aVar = new SdkTapOnPhoneVierge.d.a();
                        aVar.f67660b = dVar;
                        aVar.f67659a = responseSaleData2;
                        callSearchTxn.enqueue(aVar);
                        return null;
                    }
                    backendViergeResponseData.getF67873b();
                    SearchTxnResponse searchTxnResponse = new SearchTxnResponse();
                    transactionBackendParameters2.getRrn();
                    searchTxnResponse.setErrorCode(backendViergeResponseData.getF67869a());
                    searchTxnResponse.setErrorMessage(backendViergeResponseData.getF67873b());
                    responseSaleData2.responseSaleTransaction(searchTxnResponse);
                    return null;
                }
            };
            b bVar = new b();
            bVar.f67661p0 = this;
            backendViergeManager.executeTransaction(transactionBackendParameters, function1, bVar);
        }
    }

    public class e implements TokenResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f67662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f67663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f67664c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f67665d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ResponseVoidData f67666e;

        public class a implements Callback<SendTransactionResponse> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ e f67668a;

            @Override // retrofit2.Callback
            public final void onFailure(Call<SendTransactionResponse> call, Throwable th2) {
                this.f67668a.f67666e.responseVoid(new SendTransactionResponse());
            }

            @Override // retrofit2.Callback
            public final void onResponse(@NonNull Call<SendTransactionResponse> call, Response<SendTransactionResponse> response) {
                ErrorCatalog errorCatalogValueOf;
                e eVar = this.f67668a;
                try {
                    new SendTransactionResponse();
                    response.code();
                    if (response.isSuccessful()) {
                        eVar.f67666e.responseVoid(response.body());
                        return;
                    }
                    SendTransactionResponse sendTransactionResponse = new SendTransactionResponse();
                    sendTransactionResponse.setErrorCode(response.code());
                    if (response.code() >= 400 && response.code() < 600) {
                        sendTransactionResponse.setErrorMessage(ErrorCatalog.HostUnreachable.getSetInjectedTransactionParameters());
                    }
                    eVar.f67666e.responseVoid(sendTransactionResponse);
                } catch (HttpException e5) {
                    e5.getMessage();
                    SendTransactionResponse sendTransactionResponse2 = new SendTransactionResponse();
                    if (response.code() < 400 || response.code() >= 600) {
                        try {
                            errorCatalogValueOf = ErrorCatalog.valueOf(Integer.toString(response.code()));
                        } catch (IllegalArgumentException unused) {
                            errorCatalogValueOf = ErrorCatalog.Error;
                        }
                    } else {
                        errorCatalogValueOf = ErrorCatalog.HostUnreachable;
                    }
                    sendTransactionResponse2.setErrorCode(errorCatalogValueOf.getBOD());
                    sendTransactionResponse2.setErrorMessage(errorCatalogValueOf.getSetInjectedTransactionParameters());
                    eVar.f67666e.responseVoid(sendTransactionResponse2);
                }
            }
        }

        public e(String str, String str2, String str3, String str4, ResponseVoidData responseVoidData) {
            this.f67662a = str;
            this.f67663b = str2;
            this.f67664c = str3;
            this.f67665d = str4;
            this.f67666e = responseVoidData;
        }

        @Override // com.viergegroup.sdk.taptophone.webApi.TokenResponse
        public final void getTokenOAth(TokenInfo tokenInfo) {
            tokenInfo.getToken();
            ServiceViergeBackEnd.setToken(tokenInfo.getToken());
            Call<SendTransactionResponse> callSendTransaction = ((TransactionsApi) ServiceViergeBackEnd.getRetrofitInstance(1).create(TransactionsApi.class)).sendTransaction(SdkTapOnPhoneVierge.this.getJsonSendTransactionRequest(this.f67662a, this.f67663b, "Cancellation", this.f67664c, this.f67665d, ApiVersion.Version2));
            a aVar = new a();
            aVar.f67668a = this;
            callSendTransaction.enqueue(aVar);
        }
    }

    public class f implements TokenResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f67669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ResponseCommTest f67670b;

        public class a implements Callback<SendTransactionResponse> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ f f67672a;

            @Override // retrofit2.Callback
            public final void onFailure(Call<SendTransactionResponse> call, Throwable th2) {
                th2.getMessage();
                SendTransactionResponse sendTransactionResponse = new SendTransactionResponse();
                sendTransactionResponse.setErrorMessage(th2.getMessage());
                sendTransactionResponse.setErrorCode(th2.hashCode());
                this.f67672a.f67670b.responseCommTest(sendTransactionResponse);
            }

            @Override // retrofit2.Callback
            public final void onResponse(Call<SendTransactionResponse> call, Response<SendTransactionResponse> response) {
                f fVar = this.f67672a;
                SendTransactionResponse sendTransactionResponse = new SendTransactionResponse();
                try {
                    if (response.isSuccessful()) {
                        fVar.f67670b.responseCommTest(response.body());
                    } else {
                        sendTransactionResponse.setErrorCode(response.code());
                        sendTransactionResponse.setErrorMessage(response.message());
                        fVar.f67670b.responseCommTest(sendTransactionResponse);
                    }
                } catch (HttpException e5) {
                    SendTransactionResponse sendTransactionResponse2 = new SendTransactionResponse();
                    sendTransactionResponse2.setErrorCode(e5.hashCode());
                    sendTransactionResponse2.setErrorMessage(e5.getMessage());
                    fVar.f67670b.responseCommTest(sendTransactionResponse2);
                }
            }
        }

        public f(String str, ResponseCommTest responseCommTest) {
            this.f67669a = str;
            this.f67670b = responseCommTest;
        }

        @Override // com.viergegroup.sdk.taptophone.webApi.TokenResponse
        public final void getTokenOAth(TokenInfo tokenInfo) {
            "sendTestComunication ".concat(String.valueOf(tokenInfo));
            ServiceViergeBackEnd.setToken(tokenInfo.getToken());
            SdkTapOnPhoneVierge.serialNumber = "R58RA29SJ3E";
            String serialNumber = DBUtils.getSerialNumber();
            "serial Number DB: ".concat(String.valueOf(serialNumber));
            if (serialNumber.isEmpty()) {
                DBUtils.updateSerialNumber(SdkTapOnPhoneVierge.serialNumber);
            } else {
                SdkTapOnPhoneVierge.serialNumber = serialNumber;
            }
            SdkTapOnPhoneVierge sdkTapOnPhoneVierge = SdkTapOnPhoneVierge.this;
            String strGenerateRrn = sdkTapOnPhoneVierge.generateRrn();
            Call<SendTransactionResponse> callCommTest = ((TransactionsApi) ServiceViergeBackEnd.getRetrofitInstance(1).create(TransactionsApi.class)).commTest(sdkTapOnPhoneVierge.getJsonTestComunication(this.f67669a, SdkTapOnPhoneVierge.padLeft(SdkTapOnPhoneVierge.serialNumber, 20), strGenerateRrn));
            a aVar = new a();
            aVar.f67672a = this;
            callCommTest.enqueue(aVar);
        }
    }

    public class g implements TokenResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f67673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f67674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ResponseSaleData f67675c;

        public class a implements Callback<SearchTxnResponse> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ g f67677a;

            @Override // retrofit2.Callback
            public final void onFailure(Call<SearchTxnResponse> call, Throwable th2) {
                th2.getMessage();
                SearchTxnResponse searchTxnResponse = new SearchTxnResponse();
                th2.getMessage();
                ErrorCatalog errorCatalog = ErrorCatalog.HostUnreachable;
                searchTxnResponse.setErrorCode(errorCatalog.getBOD());
                searchTxnResponse.setErrorMessage(errorCatalog.getSetInjectedTransactionParameters());
                this.f67677a.f67675c.responseSaleTransaction(searchTxnResponse);
            }

            @Override // retrofit2.Callback
            public final void onResponse(Call<SearchTxnResponse> call, Response<SearchTxnResponse> response) {
                ErrorCatalog errorCatalogValueOf;
                SearchTxnResponse searchTxnResponse;
                g gVar = this.f67677a;
                response.code();
                try {
                    response.code();
                    if (response.isSuccessful()) {
                        searchTxnResponse = response.body();
                        Integer.toString(searchTxnResponse.getF67972a());
                        ErrorCatalog errorFromCatalog = SdkTapOnPhoneVierge.this.getErrorFromCatalog(Integer.valueOf(searchTxnResponse.getF67972a()));
                        searchTxnResponse.setErrorCode(errorFromCatalog.getBOD());
                        searchTxnResponse.setErrorMessage(errorFromCatalog.getSetInjectedTransactionParameters());
                    } else {
                        searchTxnResponse = new SearchTxnResponse();
                        if (SdkTapOnPhoneVierge.this.isErrorInCatalog(Integer.valueOf(response.code()))) {
                            ErrorCatalog errorFromCatalog2 = SdkTapOnPhoneVierge.this.getErrorFromCatalog(Integer.valueOf(response.code()));
                            searchTxnResponse.setErrorCode(errorFromCatalog2.getBOD());
                            searchTxnResponse.setErrorMessage(errorFromCatalog2.getSetInjectedTransactionParameters());
                        } else {
                            searchTxnResponse.setErrorCode(response.code());
                            searchTxnResponse.setErrorMessage(response.message());
                        }
                    }
                    gVar.f67675c.responseSaleTransaction(searchTxnResponse);
                } catch (HttpException e5) {
                    e5.getMessage();
                    SearchTxnResponse searchTxnResponse2 = new SearchTxnResponse();
                    if (response.code() < 400 || response.code() >= 600) {
                        try {
                            errorCatalogValueOf = ErrorCatalog.valueOf(Integer.toString(response.code()));
                        } catch (IllegalArgumentException unused) {
                            errorCatalogValueOf = ErrorCatalog.Error;
                        }
                    } else {
                        errorCatalogValueOf = ErrorCatalog.HostUnreachable;
                    }
                    searchTxnResponse2.setErrorCode(errorCatalogValueOf.getBOD());
                    searchTxnResponse2.setErrorMessage(errorCatalogValueOf.getSetInjectedTransactionParameters());
                    gVar.f67675c.responseSaleTransaction(searchTxnResponse2);
                }
            }
        }

        public g(String str, String str2, ResponseSaleData responseSaleData) {
            this.f67673a = str;
            this.f67674b = str2;
            this.f67675c = responseSaleData;
        }

        @Override // com.viergegroup.sdk.taptophone.webApi.TokenResponse
        public final void getTokenOAth(TokenInfo tokenInfo) {
            String token = tokenInfo.getToken();
            SdkTapOnPhoneVierge sdkTapOnPhoneVierge = SdkTapOnPhoneVierge.this;
            sdkTapOnPhoneVierge.TokenApi = token;
            String str = sdkTapOnPhoneVierge.TokenApi;
            String serialNumber = DBUtils.getSerialNumber();
            "serial Number DB: ".concat(String.valueOf(serialNumber));
            if (serialNumber.isEmpty()) {
                DBUtils.updateSerialNumber(SdkTapOnPhoneVierge.serialNumber);
            } else {
                SdkTapOnPhoneVierge.serialNumber = serialNumber;
            }
            String strPadLeft = SdkTapOnPhoneVierge.padLeft(SdkTapOnPhoneVierge.serialNumber, 20);
            ServiceViergeBackEnd.setToken(sdkTapOnPhoneVierge.TokenApi);
            Call<SearchTxnResponse> callSearchTxn = ((TransactionsApi) ServiceViergeBackEnd.getRetrofitInstance(1).create(TransactionsApi.class)).searchTxn(sdkTapOnPhoneVierge.getJsonSearchRequest(strPadLeft, this.f67673a, ApiVersion.Version2, this.f67674b));
            a aVar = new a();
            aVar.f67677a = this;
            callSearchTxn.enqueue(aVar);
        }
    }

    public class h implements TokenResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f67678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f67679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f67680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f67681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ResponseSaleWithTip f67682e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ProcessMessageLectureCard f67683f;

        public class a implements Callback<SearchTxnResponse> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ ResponseSaleWithTip f67685a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ h f67686b;

            @Override // retrofit2.Callback
            public final void onFailure(Call<SearchTxnResponse> call, Throwable th2) {
                SearchTxnResponse searchTxnResponse = new SearchTxnResponse();
                th2.getMessage();
                ErrorCatalog errorCatalog = ErrorCatalog.HostUnreachable;
                searchTxnResponse.setErrorCode(errorCatalog.getBOD());
                searchTxnResponse.setErrorMessage(errorCatalog.getSetInjectedTransactionParameters());
                this.f67685a.responseSaleWithTip(searchTxnResponse);
            }

            @Override // retrofit2.Callback
            public final void onResponse(Call<SearchTxnResponse> call, Response<SearchTxnResponse> response) {
                ErrorCatalog errorCatalogValueOf;
                SearchTxnResponse searchTxnResponse;
                ResponseSaleWithTip responseSaleWithTip = this.f67685a;
                try {
                    response.code();
                    boolean zIsSuccessful = response.isSuccessful();
                    h hVar = this.f67686b;
                    if (zIsSuccessful) {
                        searchTxnResponse = response.body();
                        Integer.toString(searchTxnResponse.getF67972a());
                        ErrorCatalog errorFromCatalog = SdkTapOnPhoneVierge.this.getErrorFromCatalog(Integer.valueOf(searchTxnResponse.getF67972a()));
                        searchTxnResponse.setErrorCode(errorFromCatalog.getBOD());
                        searchTxnResponse.setErrorMessage(errorFromCatalog.getSetInjectedTransactionParameters());
                    } else {
                        searchTxnResponse = new SearchTxnResponse();
                        ErrorCatalog errorFromCatalog2 = SdkTapOnPhoneVierge.this.getErrorFromCatalog(Integer.valueOf(response.code()));
                        searchTxnResponse.setErrorCode(errorFromCatalog2.getBOD());
                        searchTxnResponse.setErrorMessage(errorFromCatalog2.getSetInjectedTransactionParameters());
                    }
                    responseSaleWithTip.responseSaleWithTip(searchTxnResponse);
                } catch (HttpException e5) {
                    e5.getMessage();
                    SearchTxnResponse searchTxnResponse2 = new SearchTxnResponse();
                    if (response.code() < 400 || response.code() >= 600) {
                        try {
                            errorCatalogValueOf = ErrorCatalog.valueOf(Integer.toString(response.code()));
                        } catch (IllegalArgumentException unused) {
                            errorCatalogValueOf = ErrorCatalog.Error;
                        }
                    } else {
                        errorCatalogValueOf = ErrorCatalog.HostUnreachable;
                    }
                    searchTxnResponse2.setErrorCode(errorCatalogValueOf.getBOD());
                    searchTxnResponse2.setErrorMessage(errorCatalogValueOf.getSetInjectedTransactionParameters());
                    responseSaleWithTip.responseSaleWithTip(searchTxnResponse2);
                }
            }
        }

        public class b implements Function1<MessageLectureType, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public /* synthetic */ h f67687p0;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
                this.f67687p0.f67683f.processMessageFromLectureCard(messageLectureType);
                return null;
            }
        }

        public h(String str, String str2, String str3, String str4, ResponseSaleWithTip responseSaleWithTip, ProcessMessageLectureCard processMessageLectureCard) {
            this.f67678a = str;
            this.f67679b = str2;
            this.f67680c = str3;
            this.f67681d = str4;
            this.f67682e = responseSaleWithTip;
            this.f67683f = processMessageLectureCard;
        }

        @Override // com.viergegroup.sdk.taptophone.webApi.TokenResponse
        public final void getTokenOAth(TokenInfo tokenInfo) {
            String token = tokenInfo.getToken();
            SdkTapOnPhoneVierge sdkTapOnPhoneVierge = SdkTapOnPhoneVierge.this;
            sdkTapOnPhoneVierge.TokenApi = token;
            final TransactionBackendParameters transactionBackendParameters = new TransactionBackendParameters(this.f67678a, this.f67679b, "SaleWithTip", this.f67680c, "", Double.parseDouble(this.f67681d), ApiVersion.Version2);
            SdkTapOnPhoneVierge.serialNumber = "R58RA29SJ3E";
            String serialNumber = DBUtils.getSerialNumber();
            "serial Number DB: ".concat(String.valueOf(serialNumber));
            if (serialNumber.isEmpty()) {
                DBUtils.updateSerialNumber(SdkTapOnPhoneVierge.serialNumber);
            } else {
                SdkTapOnPhoneVierge.serialNumber = serialNumber;
            }
            transactionBackendParameters.setTerminalSerialNumber(SdkTapOnPhoneVierge.padLeft(SdkTapOnPhoneVierge.serialNumber, 20));
            BackendViergeManager backendViergeManager = sdkTapOnPhoneVierge.backendViergeManager;
            final String str = this.f67678a;
            final ResponseSaleWithTip responseSaleWithTip = this.f67682e;
            Function1<? super BackendViergeResponseData, Unit> function1 = new Function1() { // from class: com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    BackendViergeResponseData backendViergeResponseData = (BackendViergeResponseData) obj;
                    SdkTapOnPhoneVierge.h hVar = this.f67757p0;
                    SdkTapOnPhoneVierge sdkTapOnPhoneVierge2 = SdkTapOnPhoneVierge.this;
                    ServiceViergeBackEnd.setToken(sdkTapOnPhoneVierge2.TokenApi);
                    TransactionsApi transactionsApi = (TransactionsApi) ServiceViergeBackEnd.getRetrofitInstance(1).create(TransactionsApi.class);
                    int f67869a = backendViergeResponseData.getF67869a();
                    ResponseSaleWithTip responseSaleWithTip2 = responseSaleWithTip;
                    if (f67869a != 0) {
                        SearchTxnResponse searchTxnResponse = new SearchTxnResponse();
                        searchTxnResponse.setErrorCode(backendViergeResponseData.getF67869a());
                        searchTxnResponse.setErrorMessage(backendViergeResponseData.getF67873b());
                        responseSaleWithTip2.responseSaleWithTip(searchTxnResponse);
                        return null;
                    }
                    TransactionBackendParameters transactionBackendParameters2 = transactionBackendParameters;
                    Call<SearchTxnResponse> callSearchTxn = transactionsApi.searchTxn(sdkTapOnPhoneVierge2.getJsonSearchRequest(SdkTapOnPhoneVierge.padLeft(transactionBackendParameters2.getTerminalSerialNumber(), 20), transactionBackendParameters2.getRrn(), ApiVersion.Version2, str));
                    SdkTapOnPhoneVierge.h.a aVar = new SdkTapOnPhoneVierge.h.a();
                    aVar.f67686b = hVar;
                    aVar.f67685a = responseSaleWithTip2;
                    callSearchTxn.enqueue(aVar);
                    return null;
                }
            };
            b bVar = new b();
            bVar.f67687p0 = this;
            backendViergeManager.executeTransactionSaleWithTip(transactionBackendParameters, function1, bVar);
        }
    }

    public class j implements TokenResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f67698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f67699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f67700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f67701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f67702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ResponseRefundData f67703f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ProcessMessageLectureCard f67704g;

        public class a implements Function1<MessageLectureType, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public /* synthetic */ j f67706p0;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
                this.f67706p0.f67704g.processMessageFromLectureCard(messageLectureType);
                return null;
            }
        }

        public class b implements Callback<SearchTxnResponse> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ ResponseRefundData f67707a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ j f67708b;

            @Override // retrofit2.Callback
            public final void onFailure(Call<SearchTxnResponse> call, Throwable th2) {
                SearchTxnResponse searchTxnResponse = new SearchTxnResponse();
                th2.getMessage();
                ErrorCatalog errorCatalog = ErrorCatalog.HostUnreachable;
                searchTxnResponse.setErrorCode(errorCatalog.getBOD());
                searchTxnResponse.setErrorMessage(errorCatalog.getSetInjectedTransactionParameters());
                this.f67707a.responseRefund(searchTxnResponse);
            }

            @Override // retrofit2.Callback
            public final void onResponse(Call<SearchTxnResponse> call, Response<SearchTxnResponse> response) {
                ErrorCatalog errorCatalogValueOf;
                SearchTxnResponse searchTxnResponse;
                ResponseRefundData responseRefundData = this.f67707a;
                try {
                    response.code();
                    boolean zIsSuccessful = response.isSuccessful();
                    j jVar = this.f67708b;
                    if (!zIsSuccessful) {
                        searchTxnResponse = new SearchTxnResponse();
                        ErrorCatalog errorFromCatalog = SdkTapOnPhoneVierge.this.getErrorFromCatalog(Integer.valueOf(response.code()));
                        searchTxnResponse.setErrorCode(errorFromCatalog.getBOD());
                        searchTxnResponse.setErrorMessage(errorFromCatalog.getSetInjectedTransactionParameters());
                    } else if (response.body() != null) {
                        searchTxnResponse = response.body();
                        Integer.toString(searchTxnResponse.getF67972a());
                        ErrorCatalog errorFromCatalog2 = SdkTapOnPhoneVierge.this.getErrorFromCatalog(Integer.valueOf(searchTxnResponse.getF67972a()));
                        searchTxnResponse.setErrorCode(errorFromCatalog2.getBOD());
                        searchTxnResponse.setErrorMessage(errorFromCatalog2.getSetInjectedTransactionParameters());
                    } else {
                        searchTxnResponse = new SearchTxnResponse();
                        searchTxnResponse.setErrorCode(response.code());
                        searchTxnResponse.setErrorMessage(response.message());
                    }
                    responseRefundData.responseRefund(searchTxnResponse);
                } catch (HttpException e5) {
                    e5.getMessage();
                    SearchTxnResponse searchTxnResponse2 = new SearchTxnResponse();
                    if (response.code() < 400 || response.code() >= 600) {
                        try {
                            errorCatalogValueOf = ErrorCatalog.valueOf(Integer.toString(response.code()));
                        } catch (IllegalArgumentException unused) {
                            errorCatalogValueOf = ErrorCatalog.Error;
                        }
                    } else {
                        errorCatalogValueOf = ErrorCatalog.HostUnreachable;
                    }
                    searchTxnResponse2.setErrorCode(errorCatalogValueOf.getBOD());
                    searchTxnResponse2.setErrorMessage(errorCatalogValueOf.getSetInjectedTransactionParameters());
                    responseRefundData.responseRefund(searchTxnResponse2);
                }
            }
        }

        public j(String str, String str2, String str3, String str4, String str5, ResponseRefundData responseRefundData, ProcessMessageLectureCard processMessageLectureCard) {
            this.f67698a = str;
            this.f67699b = str2;
            this.f67700c = str3;
            this.f67701d = str4;
            this.f67702e = str5;
            this.f67703f = responseRefundData;
            this.f67704g = processMessageLectureCard;
        }

        @Override // com.viergegroup.sdk.taptophone.webApi.TokenResponse
        public final void getTokenOAth(TokenInfo tokenInfo) {
            String token = tokenInfo.getToken();
            SdkTapOnPhoneVierge sdkTapOnPhoneVierge = SdkTapOnPhoneVierge.this;
            sdkTapOnPhoneVierge.TokenApi = token;
            final TransactionBackendParameters transactionBackendParameters = new TransactionBackendParameters(this.f67698a, this.f67699b, "Refund", this.f67700c, this.f67701d, this.f67702e, ApiVersion.Version2);
            String serialNumber = DBUtils.getSerialNumber();
            "serial Number DB: ".concat(String.valueOf(serialNumber));
            serialNumber.getClass();
            transactionBackendParameters.setTerminalSerialNumber(SdkTapOnPhoneVierge.padLeft(serialNumber, 20));
            BackendViergeManager backendViergeManager = sdkTapOnPhoneVierge.backendViergeManager;
            final String str = this.f67698a;
            final ResponseRefundData responseRefundData = this.f67703f;
            Function1<? super BackendViergeResponseData, Unit> function1 = new Function1() { // from class: com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    BackendViergeResponseData backendViergeResponseData = (BackendViergeResponseData) obj;
                    SdkTapOnPhoneVierge.j jVar = this.f67765p0;
                    SdkTapOnPhoneVierge sdkTapOnPhoneVierge2 = SdkTapOnPhoneVierge.this;
                    ServiceViergeBackEnd.setToken(sdkTapOnPhoneVierge2.TokenApi);
                    TransactionsApi transactionsApi = (TransactionsApi) ServiceViergeBackEnd.getRetrofitInstance(1).create(TransactionsApi.class);
                    int f67869a = backendViergeResponseData.getF67869a();
                    ResponseRefundData responseRefundData2 = responseRefundData;
                    if (f67869a != 0) {
                        SearchTxnResponse searchTxnResponse = new SearchTxnResponse();
                        searchTxnResponse.setErrorCode(backendViergeResponseData.getF67869a());
                        searchTxnResponse.setErrorMessage(backendViergeResponseData.getF67873b());
                        responseRefundData2.responseRefund(searchTxnResponse);
                        return null;
                    }
                    TransactionBackendParameters transactionBackendParameters2 = transactionBackendParameters;
                    Call<SearchTxnResponse> callSearchTxn = transactionsApi.searchTxn(sdkTapOnPhoneVierge2.getJsonSearchRequest(SdkTapOnPhoneVierge.padLeft(transactionBackendParameters2.getTerminalSerialNumber(), 20), transactionBackendParameters2.getRrn(), ApiVersion.Version2, str));
                    SdkTapOnPhoneVierge.j.b bVar = new SdkTapOnPhoneVierge.j.b();
                    bVar.f67708b = jVar;
                    bVar.f67707a = responseRefundData2;
                    callSearchTxn.enqueue(bVar);
                    return null;
                }
            };
            a aVar = new a();
            aVar.f67706p0 = this;
            backendViergeManager.executeTransactionRefound(transactionBackendParameters, function1, aVar);
        }
    }

    public class k implements TokenResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f67709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f67710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f67711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ResponseResquestKeyLoad f67712d;

        public class a implements Callback<SendTransactionResponse> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ k f67714a;

            @Override // retrofit2.Callback
            public final void onFailure(Call<SendTransactionResponse> call, Throwable th2) {
                SendTransactionResponse sendTransactionResponse = new SendTransactionResponse();
                sendTransactionResponse.setErrorMessage(th2.getMessage());
                sendTransactionResponse.setErrorCode(-1);
                this.f67714a.f67712d.responseKeyLoad(sendTransactionResponse);
            }

            @Override // retrofit2.Callback
            public final void onResponse(@NonNull Call<SendTransactionResponse> call, Response<SendTransactionResponse> response) {
                ErrorCatalog errorCatalogValueOf;
                k kVar = this.f67714a;
                try {
                    new SendTransactionResponse();
                    kVar.getClass();
                    response.code();
                    if (response.isSuccessful()) {
                        kVar.getClass();
                        if (response.body() != null && response.body().getErrorCode() == 0) {
                            SdkTapOnPhoneVierge.this.isKeyLoaded = true;
                        }
                        kVar.f67712d.responseKeyLoad(response.body());
                        return;
                    }
                    SendTransactionResponse sendTransactionResponse = new SendTransactionResponse();
                    sendTransactionResponse.setErrorCode(response.code());
                    if (response.code() >= 400 && response.code() < 600) {
                        sendTransactionResponse.setErrorMessage(ErrorCatalog.HostUnreachable.getSetInjectedTransactionParameters());
                    }
                    kVar.f67712d.responseKeyLoad(sendTransactionResponse);
                } catch (HttpException e5) {
                    e5.getMessage();
                    SendTransactionResponse sendTransactionResponse2 = new SendTransactionResponse();
                    if (response.code() < 400 || response.code() >= 600) {
                        try {
                            errorCatalogValueOf = ErrorCatalog.valueOf(Integer.toString(response.code()));
                        } catch (IllegalArgumentException unused) {
                            errorCatalogValueOf = ErrorCatalog.Error;
                        }
                    } else {
                        errorCatalogValueOf = ErrorCatalog.HostUnreachable;
                    }
                    sendTransactionResponse2.setErrorCode(errorCatalogValueOf.getBOD());
                    sendTransactionResponse2.setErrorMessage(errorCatalogValueOf.getSetInjectedTransactionParameters());
                    kVar.f67712d.responseKeyLoad(sendTransactionResponse2);
                }
            }
        }

        public k(String str, String str2, String str3, ResponseResquestKeyLoad responseResquestKeyLoad) {
            this.f67709a = str;
            this.f67710b = str2;
            this.f67711c = str3;
            this.f67712d = responseResquestKeyLoad;
        }

        @Override // com.viergegroup.sdk.taptophone.webApi.TokenResponse
        public final void getTokenOAth(TokenInfo tokenInfo) {
            String token = tokenInfo.getToken();
            SdkTapOnPhoneVierge sdkTapOnPhoneVierge = SdkTapOnPhoneVierge.this;
            sdkTapOnPhoneVierge.TokenApi = token;
            ServiceViergeBackEnd.setToken(sdkTapOnPhoneVierge.TokenApi);
            Call<SendTransactionResponse> callSendTransaction = ((TransactionsApi) ServiceViergeBackEnd.getRetrofitInstance(1).create(TransactionsApi.class)).sendTransaction(SdkTapOnPhoneVierge.this.getJsonSendTransactionRequest(this.f67709a, this.f67710b, "KeyLoad", this.f67711c, "", ApiVersion.Version2));
            a aVar = new a();
            aVar.f67714a = this;
            callSendTransaction.enqueue(aVar);
        }
    }

    public class l implements TokenResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f67715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f67716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f67717c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ResponseRequestCalculateHash f67718d;

        public class a implements Callback<CalculateHashResponse> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ l f67720a;

            @Override // retrofit2.Callback
            public final void onFailure(Call<CalculateHashResponse> call, Throwable th2) {
                CalculateHashResponse calculateHashResponse = new CalculateHashResponse();
                calculateHashResponse.setErrorMessage(th2.getMessage());
                calculateHashResponse.setErrorCode(-1);
                this.f67720a.f67718d.responseCalculateHash(calculateHashResponse);
            }

            @Override // retrofit2.Callback
            public final void onResponse(Call<CalculateHashResponse> call, Response<CalculateHashResponse> response) {
                ErrorCatalog errorCatalogValueOf;
                l lVar = this.f67720a;
                try {
                    new CalculateHashResponse();
                    lVar.getClass();
                    response.code();
                    if (!response.isSuccessful()) {
                        CalculateHashResponse calculateHashResponse = new CalculateHashResponse();
                        calculateHashResponse.setErrorCode(response.code());
                        if (response.code() >= 400 && response.code() < 600) {
                            calculateHashResponse.setErrorMessage(ErrorCatalog.HostUnreachable.getSetInjectedTransactionParameters());
                        }
                        lVar.f67718d.responseCalculateHash(calculateHashResponse);
                        return;
                    }
                    lVar.getClass();
                    lVar.getClass();
                    Objects.toString(response.raw());
                    lVar.getClass();
                    Objects.toString(response.body().getTransactionResponse());
                    lVar.getClass();
                    response.body().getHash();
                    lVar.getClass();
                    response.body().getExpectedHash();
                    lVar.getClass();
                    response.body().getkcv();
                    lVar.f67718d.responseCalculateHash(response.body());
                } catch (HttpException e5) {
                    e5.getMessage();
                    CalculateHashResponse calculateHashResponse2 = new CalculateHashResponse();
                    if (response.code() < 400 || response.code() >= 600) {
                        try {
                            errorCatalogValueOf = ErrorCatalog.valueOf(Integer.toString(response.code()));
                        } catch (IllegalArgumentException unused) {
                            errorCatalogValueOf = ErrorCatalog.Error;
                        }
                    } else {
                        errorCatalogValueOf = ErrorCatalog.HostUnreachable;
                    }
                    calculateHashResponse2.setErrorCode(errorCatalogValueOf.getBOD());
                    calculateHashResponse2.setErrorMessage(errorCatalogValueOf.getSetInjectedTransactionParameters());
                    lVar.f67718d.responseCalculateHash(calculateHashResponse2);
                }
            }
        }

        public l(String str, String str2, String str3, ResponseRequestCalculateHash responseRequestCalculateHash) {
            this.f67715a = str;
            this.f67716b = str2;
            this.f67717c = str3;
            this.f67718d = responseRequestCalculateHash;
        }

        @Override // com.viergegroup.sdk.taptophone.webApi.TokenResponse
        public final void getTokenOAth(TokenInfo tokenInfo) {
            String token = tokenInfo.getToken();
            SdkTapOnPhoneVierge sdkTapOnPhoneVierge = SdkTapOnPhoneVierge.this;
            sdkTapOnPhoneVierge.TokenApi = token;
            ServiceViergeBackEnd.setToken(sdkTapOnPhoneVierge.TokenApi);
            Call<CalculateHashResponse> callCalculateHash = ((TransactionsApi) ServiceViergeBackEnd.getRetrofitInstance(1).create(TransactionsApi.class)).calculateHash(sdkTapOnPhoneVierge.getJsonSendCalculate_RSA(this.f67715a, sdkTapOnPhoneVierge.generateRrn(), this.f67716b, this.f67717c));
            a aVar = new a();
            aVar.f67720a = this;
            callCalculateHash.enqueue(aVar);
        }
    }

    public class m implements TokenResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f67721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f67722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f67723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f67724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ResponseResquestKeyLoadOpenPay f67725e;

        public class a implements Callback<SendTransactionResponse> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ m f67727a;

            @Override // retrofit2.Callback
            public final void onFailure(Call<SendTransactionResponse> call, Throwable th2) {
                SendTransactionResponse sendTransactionResponse = new SendTransactionResponse();
                sendTransactionResponse.setErrorMessage(th2.getMessage());
                sendTransactionResponse.setErrorCode(-1);
                this.f67727a.f67725e.responseKeyLoad(sendTransactionResponse);
            }

            @Override // retrofit2.Callback
            public final void onResponse(@NonNull Call<SendTransactionResponse> call, Response<SendTransactionResponse> response) {
                ErrorCatalog errorCatalogValueOf;
                m mVar = this.f67727a;
                try {
                    new SendTransactionResponse();
                    mVar.getClass();
                    response.code();
                    if (response.isSuccessful()) {
                        mVar.getClass();
                        if (response.body() != null && response.body().getErrorCode() == 0) {
                            SdkTapOnPhoneVierge.this.isKeyLoaded = true;
                        }
                        mVar.f67725e.responseKeyLoad(response.body());
                        return;
                    }
                    SendTransactionResponse sendTransactionResponse = new SendTransactionResponse();
                    sendTransactionResponse.setErrorCode(response.code());
                    if (response.code() >= 400 && response.code() < 600) {
                        sendTransactionResponse.setErrorMessage(ErrorCatalog.HostUnreachable.getSetInjectedTransactionParameters());
                    }
                    mVar.f67725e.responseKeyLoad(sendTransactionResponse);
                } catch (HttpException e5) {
                    e5.getMessage();
                    SendTransactionResponse sendTransactionResponse2 = new SendTransactionResponse();
                    if (response.code() < 400 || response.code() >= 600) {
                        try {
                            errorCatalogValueOf = ErrorCatalog.valueOf(Integer.toString(response.code()));
                        } catch (IllegalArgumentException unused) {
                            errorCatalogValueOf = ErrorCatalog.Error;
                        }
                    } else {
                        errorCatalogValueOf = ErrorCatalog.HostUnreachable;
                    }
                    sendTransactionResponse2.setErrorCode(errorCatalogValueOf.getBOD());
                    sendTransactionResponse2.setErrorMessage(errorCatalogValueOf.getSetInjectedTransactionParameters());
                    mVar.f67725e.responseKeyLoad(sendTransactionResponse2);
                }
            }
        }

        public m(String str, String str2, String str3, String str4, ResponseResquestKeyLoadOpenPay responseResquestKeyLoadOpenPay) {
            this.f67721a = str;
            this.f67722b = str2;
            this.f67723c = str3;
            this.f67724d = str4;
            this.f67725e = responseResquestKeyLoadOpenPay;
        }

        @Override // com.viergegroup.sdk.taptophone.webApi.TokenResponse
        public final void getTokenOAth(TokenInfo tokenInfo) {
            String token = tokenInfo.getToken();
            SdkTapOnPhoneVierge sdkTapOnPhoneVierge = SdkTapOnPhoneVierge.this;
            sdkTapOnPhoneVierge.TokenApi = token;
            ServiceViergeBackEnd.setToken(sdkTapOnPhoneVierge.TokenApi);
            Call<SendTransactionResponse> callSendTransaction = ((TransactionsApi) ServiceViergeBackEnd.getRetrofitInstance(1).create(TransactionsApi.class)).sendTransaction(SdkTapOnPhoneVierge.this.getJsonSendTransactionKeyLoadRequest(this.f67721a, this.f67722b, "KeyLoad", this.f67723c, this.f67724d));
            a aVar = new a();
            aVar.f67727a = this;
            callSendTransaction.enqueue(aVar);
        }
    }

    public class n implements TokenResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f67728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f67729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f67730c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f67731d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f67732e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f67733f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ResponseRequestKeyLoadConfirmOpenPay f67734g;

        public class a implements Callback<SendTransactionResponse> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ n f67736a;

            @Override // retrofit2.Callback
            public final void onFailure(Call<SendTransactionResponse> call, Throwable th2) {
                SendTransactionResponse sendTransactionResponse = new SendTransactionResponse();
                sendTransactionResponse.setErrorMessage(th2.getMessage());
                sendTransactionResponse.setErrorCode(-1);
                this.f67736a.f67734g.responseKeyLoadConfirm(sendTransactionResponse);
            }

            @Override // retrofit2.Callback
            public final void onResponse(@NonNull Call<SendTransactionResponse> call, Response<SendTransactionResponse> response) {
                ErrorCatalog errorCatalogValueOf;
                n nVar = this.f67736a;
                try {
                    new SendTransactionResponse();
                    nVar.getClass();
                    response.code();
                    if (!response.isSuccessful()) {
                        SendTransactionResponse sendTransactionResponse = new SendTransactionResponse();
                        sendTransactionResponse.setErrorCode(response.code());
                        if (response.code() >= 400 && response.code() < 600) {
                            sendTransactionResponse.setErrorMessage(ErrorCatalog.HostUnreachable.getSetInjectedTransactionParameters());
                        }
                        nVar.f67734g.responseKeyLoadConfirm(sendTransactionResponse);
                        return;
                    }
                    nVar.getClass();
                    nVar.getClass();
                    Objects.toString(response.raw());
                    nVar.getClass();
                    Objects.toString(response.body());
                    nVar.f67734g.responseKeyLoadConfirm(response.body());
                } catch (HttpException e5) {
                    e5.getMessage();
                    SendTransactionResponse sendTransactionResponse2 = new SendTransactionResponse();
                    if (response.code() < 400 || response.code() >= 600) {
                        try {
                            errorCatalogValueOf = ErrorCatalog.valueOf(Integer.toString(response.code()));
                        } catch (IllegalArgumentException unused) {
                            errorCatalogValueOf = ErrorCatalog.Error;
                        }
                    } else {
                        errorCatalogValueOf = ErrorCatalog.HostUnreachable;
                    }
                    sendTransactionResponse2.setErrorCode(errorCatalogValueOf.getBOD());
                    sendTransactionResponse2.setErrorMessage(errorCatalogValueOf.getSetInjectedTransactionParameters());
                    nVar.f67734g.responseKeyLoadConfirm(sendTransactionResponse2);
                }
            }
        }

        public n(String str, String str2, String str3, String str4, String str5, String str6, ResponseRequestKeyLoadConfirmOpenPay responseRequestKeyLoadConfirmOpenPay) {
            this.f67728a = str;
            this.f67729b = str2;
            this.f67730c = str3;
            this.f67731d = str4;
            this.f67732e = str5;
            this.f67733f = str6;
            this.f67734g = responseRequestKeyLoadConfirmOpenPay;
        }

        @Override // com.viergegroup.sdk.taptophone.webApi.TokenResponse
        public final void getTokenOAth(TokenInfo tokenInfo) {
            String token = tokenInfo.getToken();
            SdkTapOnPhoneVierge sdkTapOnPhoneVierge = SdkTapOnPhoneVierge.this;
            sdkTapOnPhoneVierge.TokenApi = token;
            String str = sdkTapOnPhoneVierge.TokenApi;
            ServiceViergeBackEnd.setToken(tokenInfo.getToken());
            Call<SendTransactionResponse> callSaveDUKPData = ((TransactionsApi) ServiceViergeBackEnd.getRetrofitInstance(1).create(TransactionsApi.class)).saveDUKPData(SdkTapOnPhoneVierge.this.getJsonSendSaveDukptData(this.f67728a, this.f67729b, sdkTapOnPhoneVierge.generateRrn(), this.f67730c, this.f67731d, this.f67732e, this.f67733f));
            a aVar = new a();
            aVar.f67736a = this;
            callSaveDUKPData.enqueue(aVar);
        }
    }

    public class o implements TokenResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f67737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f67738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f67739c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f67740d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f67741e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ResponseRequestKeyLoadConfirmOpenPay f67742f;

        public class a implements Callback<SendTransactionResponse> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ o f67744a;

            @Override // retrofit2.Callback
            public final void onFailure(Call<SendTransactionResponse> call, Throwable th2) {
                SendTransactionResponse sendTransactionResponse = new SendTransactionResponse();
                sendTransactionResponse.setErrorMessage(th2.getMessage());
                sendTransactionResponse.setErrorCode(-1);
                this.f67744a.f67742f.responseKeyLoadConfirm(sendTransactionResponse);
            }

            @Override // retrofit2.Callback
            public final void onResponse(@NonNull Call<SendTransactionResponse> call, Response<SendTransactionResponse> response) {
                ErrorCatalog errorCatalogValueOf;
                o oVar = this.f67744a;
                try {
                    new SendTransactionResponse();
                    oVar.getClass();
                    response.code();
                    if (response.isSuccessful()) {
                        oVar.getClass();
                        oVar.f67742f.responseKeyLoadConfirm(response.body());
                    } else {
                        SendTransactionResponse sendTransactionResponse = new SendTransactionResponse();
                        sendTransactionResponse.setErrorCode(response.code());
                        if (response.code() >= 400 && response.code() < 600) {
                            sendTransactionResponse.setErrorMessage(ErrorCatalog.HostUnreachable.getSetInjectedTransactionParameters());
                        }
                        oVar.f67742f.responseKeyLoadConfirm(sendTransactionResponse);
                    }
                } catch (HttpException e5) {
                    e5.getMessage();
                    SendTransactionResponse sendTransactionResponse2 = new SendTransactionResponse();
                    if (response.code() < 400 || response.code() >= 600) {
                        try {
                            errorCatalogValueOf = ErrorCatalog.valueOf(Integer.toString(response.code()));
                        } catch (IllegalArgumentException unused) {
                            errorCatalogValueOf = ErrorCatalog.Error;
                        }
                    } else {
                        errorCatalogValueOf = ErrorCatalog.HostUnreachable;
                    }
                    sendTransactionResponse2.setErrorCode(errorCatalogValueOf.getBOD());
                    sendTransactionResponse2.setErrorMessage(errorCatalogValueOf.getSetInjectedTransactionParameters());
                    oVar.f67742f.responseKeyLoadConfirm(sendTransactionResponse2);
                }
            }
        }

        public o(String str, String str2, String str3, String str4, String str5, ResponseRequestKeyLoadConfirmOpenPay responseRequestKeyLoadConfirmOpenPay) {
            this.f67737a = str;
            this.f67738b = str2;
            this.f67739c = str3;
            this.f67740d = str4;
            this.f67741e = str5;
            this.f67742f = responseRequestKeyLoadConfirmOpenPay;
        }

        @Override // com.viergegroup.sdk.taptophone.webApi.TokenResponse
        public final void getTokenOAth(TokenInfo tokenInfo) {
            String token = tokenInfo.getToken();
            SdkTapOnPhoneVierge sdkTapOnPhoneVierge = SdkTapOnPhoneVierge.this;
            sdkTapOnPhoneVierge.TokenApi = token;
            ServiceViergeBackEnd.setToken(sdkTapOnPhoneVierge.TokenApi);
            Call<SendTransactionResponse> callSendTransaction = ((TransactionsApi) ServiceViergeBackEnd.getRetrofitInstance(1).create(TransactionsApi.class)).sendTransaction(SdkTapOnPhoneVierge.this.getJsonSendTransactionKeyLoadConfirmRequest(this.f67737a, this.f67738b, "KeyLoadConfirm", this.f67739c, this.f67740d, this.f67741e));
            a aVar = new a();
            aVar.f67744a = this;
            callSendTransaction.enqueue(aVar);
        }
    }

    public SdkTapOnPhoneVierge(Context context) {
        this.context = context;
    }

    public static Context getContext() {
        return selfInstance.context;
    }

    public static DbHelper getDatabaseHelper() {
        return dbHelper;
    }

    public static SdkTapOnPhoneVierge getSelfInstance(Context context) {
        if (selfInstance == null) {
            selfInstance = new SdkTapOnPhoneVierge(context);
        }
        DbHelper dbHelper2 = new DbHelper();
        dbHelper = dbHelper2;
        try {
            dbHelper2.createDataBase();
        } catch (SQLException | IOException unused) {
        }
        logger = new TsdkLogger(getContext());
        return selfInstance;
    }

    private static String getTag(String str, String str2) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        int length = lowerCase.length();
        int length2 = lowerCase2.length();
        String str3 = "";
        int i10 = 0;
        while (i10 < length) {
            if (lowerCase.charAt(i10) == lowerCase2.charAt(0)) {
                Boolean bool = Boolean.TRUE;
                for (int i11 = 0; i11 < length2; i11++) {
                    if (lowerCase.charAt(i10 + i11) != lowerCase2.charAt(i11)) {
                        bool = Boolean.FALSE;
                        break;
                    }
                }
                if (bool.booleanValue()) {
                    int i12 = i10 + length2;
                    int i13 = i12 + 2;
                    String strSubstring = lowerCase.substring(i12, i13);
                    String strSubstring2 = lowerCase.substring(i13, (((strSubstring.charAt(1) - '0') + ((strSubstring.charAt(0) - '0') << 4)) << 1) + i13);
                    i10 = i13;
                    str3 = strSubstring2;
                }
            }
            i10++;
        }
        return str3;
    }

    public static boolean isApplicationInitAllowed() {
        return TerminalSdk.isApplicationInitAllowed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit lambda$initializeTerminal$0(ResponseData responseData, BackendViergeResponseData backendViergeResponseData) {
        Integer.toString(backendViergeResponseData.getF67869a());
        if (backendViergeResponseData.getF67869a() == 0) {
            isInitializeApp = true;
        }
        responseData.responseInitilizeTerminal(backendViergeResponseData);
        return null;
    }

    public static String padLeft(String str, int i10) {
        StringBuilder sb2 = new StringBuilder("%");
        sb2.append(i10);
        sb2.append("s");
        return String.format(sb2.toString(), str).replace(' ', '0');
    }

    public void SendClosePosTip(String str, String str2, String str3, String str4, ResponseClosePosTip responseClosePosTip) {
        String serialNumber2 = DBUtils.getSerialNumber();
        serialNumber2.getClass();
        new TokenRequestTask(new a(str, str2, serialNumber2, str3, str4, responseClosePosTip)).execute(new Void[0]);
    }

    public void SendVoid(String str, String str2, String str3, ResponseVoidData responseVoidData) {
        String serialNumber2 = DBUtils.getSerialNumber();
        serialNumber2.getClass();
        new TokenRequestTask(new e(str, str2, serialNumber2, str3, responseVoidData)).execute(new Void[0]);
    }

    public DeviceNfcStatus checkNfcStatus() {
        return UtilsKt.deviceNfcStatus(this.context);
    }

    public void deactiveSession() {
        this.backendViergeManager.deactiveSesion();
    }

    public void executeZ12Command(String str, String str2, String str3, String str4, String str5, String str6, ResponseRequestKeyLoadConfirmOpenPay responseRequestKeyLoadConfirmOpenPay) {
        String str7;
        "Inicio ".concat("executeZ12Command");
        String str8 = serialNumber;
        if (str8 == null) {
            str8 = str3;
        }
        "serial Number: ".concat(String.valueOf(str8));
        String strPadLeft = padLeft(str8, 20);
        String serialNumber2 = DBUtils.getSerialNumber();
        "serial Number DB: ".concat(String.valueOf(serialNumber2));
        if (serialNumber2.isEmpty()) {
            DBUtils.updateSerialNumber(strPadLeft);
            str7 = strPadLeft;
        } else {
            str7 = serialNumber2;
        }
        new TokenRequestTask(new n(str2, str, str7, str4, str6, str5, responseRequestKeyLoadConfirmOpenPay)).execute(new Void[0]);
        "FIN ".concat("executeZ12Command");
    }

    public void executeZ13Command(String str, String str2, String str3, ResponseRequestCalculateHash responseRequestCalculateHash) {
        String str4;
        "Inicio ".concat("executeZ13command");
        String str5 = serialNumber;
        if (str5 != null) {
            str2 = str5;
        }
        "serial Number: ".concat(String.valueOf(str2));
        String strPadLeft = padLeft(str2, 20);
        String serialNumber2 = DBUtils.getSerialNumber();
        "serial Number DB: ".concat(String.valueOf(serialNumber2));
        if (serialNumber2.isEmpty()) {
            DBUtils.updateSerialNumber(strPadLeft);
            str4 = strPadLeft;
        } else {
            str4 = serialNumber2;
        }
        new TokenRequestTask(new l(str, str4, str3, responseRequestCalculateHash)).execute(new Void[0]);
        "FIN ".concat("executeZ13command");
    }

    public String generateRrn() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMddHHmmss"));
    }

    public void getDataSaleTransaction(String str, String str2, String str3, ResponseSaleData responseSaleData) {
        String str4 = serialNumber;
        if (str4 == null || str4.isEmpty()) {
            serialNumber = str2;
        }
        new TokenRequestTask(new g(str, str3, responseSaleData)).execute(new Void[0]);
    }

    public ErrorCatalog getErrorFromCatalog(Integer num) {
        ErrorCatalog errorCatalog = ErrorCatalog.Undefined;
        for (ErrorCatalog errorCatalog2 : ErrorCatalog.values()) {
            if (errorCatalog2.getBOD() == num.intValue()) {
                errorCatalog = errorCatalog2;
            }
        }
        return errorCatalog;
    }

    public RequestBody getJsonSearchRequest(String str, String str2, ApiVersion apiVersion, String str3) {
        String str4 = String.format("{\n\"hostType\": \"%s\",\n\"apiVersion\": \"%s\",\n\"terminalSerialNumber\": \"%s\",\n\"rrn\": \"%s\"\n}", str3, apiVersion.getInject(), padLeft(str, 20), str2);
        MediaType mediaType = MediaType.parse("application/json");
        "getPayload: ".concat(String.valueOf(str4));
        return RequestBody.create(mediaType, str4);
    }

    public RequestBody getJsonSendCalculate_RSA(String str, String str2, String str3, String str4) {
        String str5 = String.format("{\n\"hostType\": \"%s\",\n\"rrn\": \"%s\",\n\"terminalSerialNumber\": \"%s\",\n\"keyId\": \"%s\"\n}", str, str2, padLeft(str3, 20), str4.toUpperCase());
        MediaType mediaType = MediaType.parse("application/json");
        "getPayload: ".concat(String.valueOf(str5));
        return RequestBody.create(mediaType, str5);
    }

    public RequestBody getJsonSendSaveDukptData(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = String.format("{\n\"hostType\": \"%s\",\n\"rrn\": \"%s\",\n\"terminalSerialNumber\": \"%s\",\n\"merchantType\": \"%s\",\n\"keyId\": \"%s\",\n\"tk\": \"%s\",\n\"ksn\": \"%s\",\n\"ipek\": \"%s\"\n}", str, str3, padLeft(str4, 20), str2, str5.toUpperCase(), str7, str6, str7);
        MediaType mediaType = MediaType.parse("application/json");
        "getPayload: ".concat(String.valueOf(str8));
        return RequestBody.create(mediaType, str8);
    }

    public RequestBody getJsonSendTransactionCloseTipRequest(String str, String str2, String str3, String str4, String str5, String str6, ApiVersion apiVersion) {
        String str7 = String.format("{\n\"hostType\": \"%s\",\n\"merchantType\": \"%s\",\n\"transactionType\": \"%s\",\n\"apiVersion\": \"%s\",\n\"otherAmount\": \"%s\",\n\"terminalSerialNumber\": \"%s\",\n\"authorizationIdResponse\": \"%s\"\n}", str, str2, str3, apiVersion, padLeft(str6.replace(Constant.DOT_STRING, ""), 12), padLeft(str4, 20), str5);
        MediaType mediaType = MediaType.parse("application/json");
        "getPayload: ".concat(String.valueOf(str7));
        return RequestBody.create(mediaType, str7);
    }

    public RequestBody getJsonSendTransactionKeyLoadConfirmRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7 = String.format("{\n\"hostType\": \"%s\",\n\"merchantType\": \"%s\",\n\"transactionType\": \"%s\",\n\"terminalSerialNumber\": \"%s\",\n\"keyId\": \"%s\",\n\"tokenEX\": \"%s\"\n}", str, str2, str3, padLeft(str4, 20), str5.toUpperCase(), str6);
        MediaType mediaType = MediaType.parse("application/json");
        "getPayload: ".concat(String.valueOf(str7));
        return RequestBody.create(mediaType, str7);
    }

    public RequestBody getJsonSendTransactionKeyLoadRequest(String str, String str2, String str3, String str4, String str5) {
        String str6 = String.format("{\n\"hostType\": \"%s\",\n\"merchantType\": \"%s\",\n\"transactionType\": \"%s\",\n\"terminalSerialNumber\": \"%s\",\n\"keyId\": \"%s\"\n}", str, str2, str3, padLeft(str4, 20), str5.toUpperCase());
        MediaType mediaType = MediaType.parse("application/json");
        "getPayload: ".concat(String.valueOf(str6));
        return RequestBody.create(mediaType, str6);
    }

    public RequestBody getJsonSendTransactionRequest(String str, String str2, String str3, String str4, String str5, ApiVersion apiVersion) {
        String str6 = String.format("{\n\"hostType\": \"%s\",\n\"merchantType\": \"%s\",\n\"transactionType\": \"%s\",\n\"apiVersion\": \"%s\",\n\"terminalSerialNumber\": \"%s\",\n\"authorizationIdResponse\": \"%s\"\n}", str, str2, str3, apiVersion, padLeft(str4, 20), str5);
        MediaType mediaType = MediaType.parse("application/json");
        "getPayload: ".concat(String.valueOf(str6));
        return RequestBody.create(mediaType, str6);
    }

    public RequestBody getJsonTestComunication(String str, String str2, String str3) {
        String str4 = String.format("{\n\"hostName\": \"%s\",\n\"rrn\": \"%s\",\n\"terminalSerialNumber\": \"%s\"\n}", str, str3, padLeft(str2, 20));
        MediaType mediaType = MediaType.parse("application/json");
        "getPayload: ".concat(String.valueOf(str4));
        return RequestBody.create(mediaType, str4);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void initializeTerminal(Application application, ResponseData responseData) {
        "Inicio ".concat("initializeApp");
        if (this.terminalProvider == null) {
            this.terminalProvider = new TerminalProvider(getContext());
        }
        TerminalSdk.setLogger(logger);
        TerminalSdk.setRedactedLogger(logger);
        BackendViergeManager backendViergeManager = new BackendViergeManager(application);
        this.backendViergeManager = backendViergeManager;
        backendViergeManager.initalize(new eb.a(responseData, 1));
        "Inicio ".concat("initializeApp");
    }

    public boolean isErrorInCatalog(Integer num) {
        Integer.toString(num.intValue());
        boolean z10 = false;
        for (ErrorCatalog errorCatalog : ErrorCatalog.values()) {
            errorCatalog.getBOD();
            if (errorCatalog.getBOD() - num.intValue() == 0) {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean isKeyLoaded() {
        return this.isKeyLoaded;
    }

    public void requestKeyLoadConfirmOpenPay(String str, String str2, String str3, String str4, String str5, ResponseRequestKeyLoadConfirmOpenPay responseRequestKeyLoadConfirmOpenPay) {
        String str6;
        "Inicio ".concat("requestLoadKeyConfirmOpenPay-Z11");
        String str7 = serialNumber;
        if (str7 == null) {
            str7 = str3;
        }
        "serial Number: ".concat(String.valueOf(str7));
        String strPadLeft = padLeft(str7, 20);
        String serialNumber2 = DBUtils.getSerialNumber();
        "serial Number DB: ".concat(String.valueOf(serialNumber2));
        if (serialNumber2.isEmpty()) {
            DBUtils.updateSerialNumber(strPadLeft);
            str6 = strPadLeft;
        } else {
            str6 = serialNumber2;
        }
        new TokenRequestTask(new o(str2, str, str6, str4, str5, responseRequestKeyLoadConfirmOpenPay)).execute(new Void[0]);
        "FIN ".concat("requestLoadKeyConfirmOpenPay-Z11");
    }

    public void requestLoadKey(String str, String str2, String str3, ResponseResquestKeyLoad responseResquestKeyLoad) {
        String str4;
        "Inicio ".concat("requestLoadKey");
        String str5 = serialNumber;
        if (str5 != null) {
            str3 = str5;
        }
        "serial Number: ".concat(String.valueOf(str3));
        String strPadLeft = padLeft(str3, 20);
        String serialNumber2 = DBUtils.getSerialNumber();
        "serial Number DB: ".concat(String.valueOf(serialNumber2));
        if (serialNumber2.isEmpty()) {
            DBUtils.updateSerialNumber(strPadLeft);
            str4 = strPadLeft;
        } else {
            str4 = serialNumber2;
        }
        new TokenRequestTask(new k(str2, str, str4, responseResquestKeyLoad)).execute(new Void[0]);
        "FIN ".concat("requestLoadKey");
    }

    public void requestLoadKeyOpenPay(String str, String str2, String str3, String str4, ResponseResquestKeyLoadOpenPay responseResquestKeyLoadOpenPay) {
        String str5;
        "Inicio ".concat("requestLoadKeyOpenPay-Z10");
        String str6 = serialNumber;
        if (str6 != null) {
            str3 = str6;
        }
        "serial Number: ".concat(String.valueOf(str3));
        String strPadLeft = padLeft(str3, 20);
        String serialNumber2 = DBUtils.getSerialNumber();
        "serial Number DB: ".concat(String.valueOf(serialNumber2));
        if (serialNumber2.isEmpty()) {
            DBUtils.updateSerialNumber(strPadLeft);
            str5 = strPadLeft;
        } else {
            str5 = serialNumber2;
        }
        new TokenRequestTask(new m(str2, str, str5, str4, responseResquestKeyLoadOpenPay)).execute(new Void[0]);
        "FIN ".concat("requestLoadKeyOpenPay-Z10");
    }

    public void sendRefund(String str, String str2, String str3, String str4, String str5, ResponseRefundData responseRefundData, ProcessMessageLectureCard processMessageLectureCard) {
        new TokenRequestTask(new j(str4, str, str2, str5, str3, responseRefundData, processMessageLectureCard)).execute(new Void[0]);
    }

    public void sendReverse(String str, String str2, String str3, String str4, ResponseReverseData responseReverseData) {
        String str5 = serialNumber;
        if (str5 == null || str5.isEmpty()) {
            serialNumber = str2;
        }
        new TokenRequestTask(new c(str, str3, str4, responseReverseData)).execute(new Void[0]);
    }

    public void sendSale(String str, String str2, String str3, String str4, ResponseSaleData responseSaleData, ProcessMessageLectureCard processMessageLectureCard) {
        String str5 = serialNumber;
        if (str5 == null || str5.isEmpty()) {
            serialNumber = str4;
        }
        new TokenRequestTask(new d(str3, str, str2, responseSaleData, processMessageLectureCard)).execute(new Void[0]);
    }

    public void sendSaleOpenPay(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ResponseSaleDataOpenPay responseSaleDataOpenPay, ProcessMessageLectureCard processMessageLectureCard) {
        String str9 = serialNumber;
        if (str9 == null || str9.isEmpty()) {
            serialNumber = str4;
        }
        new TokenRequestTask(new b(str3, str, str2, str5, str6, str7, str8, responseSaleDataOpenPay, processMessageLectureCard)).execute(new Void[0]);
    }

    public void sendSalePosTip(String str, String str2, String str3, String str4, ResponseSalePosTip responseSalePosTip, ProcessMessageLectureCard processMessageLectureCard) {
        new TokenRequestTask(new i(str3, str, str2, str4, responseSalePosTip, processMessageLectureCard)).execute(new Void[0]);
    }

    public void sendSaleWithTip(String str, String str2, String str3, String str4, ResponseSaleWithTip responseSaleWithTip, ProcessMessageLectureCard processMessageLectureCard) {
        new TokenRequestTask(new h(str3, str, str2, str4, responseSaleWithTip, processMessageLectureCard)).execute(new Void[0]);
    }

    public void sendTestComunication(String str, ResponseCommTest responseCommTest) {
        new TokenRequestTask(new f(str, responseCommTest)).execute(new Void[0]);
    }

    public void setSerialNumber(String str) {
        serialNumber = str;
    }

    private void updateUIMessageDialog(String str) {
    }

    public class i implements TokenResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f67688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f67689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f67690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f67691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ResponseSalePosTip f67692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ProcessMessageLectureCard f67693f;

        public class a implements Function1<MessageLectureType, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public /* synthetic */ i f67695p0;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
                this.f67695p0.f67693f.processMessageFromLectureCard(messageLectureType);
                return null;
            }
        }

        public i(String str, String str2, String str3, String str4, ResponseSalePosTip responseSalePosTip, ProcessMessageLectureCard processMessageLectureCard) {
            this.f67688a = str;
            this.f67689b = str2;
            this.f67690c = str3;
            this.f67691d = str4;
            this.f67692e = responseSalePosTip;
            this.f67693f = processMessageLectureCard;
        }

        @Override // com.viergegroup.sdk.taptophone.webApi.TokenResponse
        public final void getTokenOAth(TokenInfo tokenInfo) {
            String token = tokenInfo.getToken();
            SdkTapOnPhoneVierge sdkTapOnPhoneVierge = SdkTapOnPhoneVierge.this;
            sdkTapOnPhoneVierge.TokenApi = token;
            final TransactionBackendParameters transactionBackendParameters = new TransactionBackendParameters(this.f67688a, this.f67689b, "SalePosTip", this.f67690c, "", ApiVersion.Version2);
            if (SdkTapOnPhoneVierge.serialNumber == null) {
                SdkTapOnPhoneVierge.serialNumber = this.f67691d;
            }
            String serialNumber = DBUtils.getSerialNumber();
            "serial Number DB: ".concat(String.valueOf(serialNumber));
            if (serialNumber.isEmpty()) {
                DBUtils.updateSerialNumber(SdkTapOnPhoneVierge.serialNumber);
            } else {
                SdkTapOnPhoneVierge.serialNumber = serialNumber;
            }
            transactionBackendParameters.setTerminalSerialNumber(SdkTapOnPhoneVierge.padLeft(SdkTapOnPhoneVierge.serialNumber, 20));
            BackendViergeManager backendViergeManager = sdkTapOnPhoneVierge.backendViergeManager;
            final String str = this.f67688a;
            final ResponseSalePosTip responseSalePosTip = this.f67692e;
            Function1<? super BackendViergeResponseData, Unit> function1 = new Function1() { // from class: com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    BackendViergeResponseData backendViergeResponseData = (BackendViergeResponseData) obj;
                    SdkTapOnPhoneVierge.i iVar = this.f67761p0;
                    SdkTapOnPhoneVierge sdkTapOnPhoneVierge2 = SdkTapOnPhoneVierge.this;
                    ServiceViergeBackEnd.setToken(sdkTapOnPhoneVierge2.TokenApi);
                    TransactionsApi transactionsApi = (TransactionsApi) ServiceViergeBackEnd.getRetrofitInstance(1).create(TransactionsApi.class);
                    int f67869a = backendViergeResponseData.getF67869a();
                    ResponseSalePosTip responseSalePosTip2 = responseSalePosTip;
                    if (f67869a != 0) {
                        SearchTxnResponse searchTxnResponse = new SearchTxnResponse();
                        searchTxnResponse.setErrorCode(backendViergeResponseData.getF67869a());
                        searchTxnResponse.setErrorMessage(backendViergeResponseData.getF67873b());
                        responseSalePosTip2.responseSalePosTip(searchTxnResponse);
                        return null;
                    }
                    TransactionBackendParameters transactionBackendParameters2 = transactionBackendParameters;
                    Call<SearchTxnResponse> callSearchTxn = transactionsApi.searchTxn(sdkTapOnPhoneVierge2.getJsonSearchRequest(SdkTapOnPhoneVierge.padLeft(transactionBackendParameters2.getTerminalSerialNumber(), 20), transactionBackendParameters2.getRrn(), ApiVersion.Version2, str));
                    SdkTapOnPhoneVierge.i.b bVar = new SdkTapOnPhoneVierge.i.b();
                    bVar.f67697b = iVar;
                    bVar.f67696a = responseSalePosTip2;
                    callSearchTxn.enqueue(bVar);
                    return null;
                }
            };
            a aVar = new a();
            aVar.f67695p0 = this;
            backendViergeManager.selectorOfExecuteTransaction("SalePosTip", transactionBackendParameters, function1, aVar);
        }

        public class b implements Callback<SearchTxnResponse> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ ResponseSalePosTip f67696a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ i f67697b;

            @Override // retrofit2.Callback
            public final void onResponse(Call<SearchTxnResponse> call, Response<SearchTxnResponse> response) {
                SearchTxnResponse searchTxnResponse;
                try {
                    response.code();
                    boolean zIsSuccessful = response.isSuccessful();
                    i iVar = this.f67697b;
                    if (zIsSuccessful) {
                        searchTxnResponse = response.body();
                        Integer.toString(searchTxnResponse.getF67972a());
                        ErrorCatalog errorFromCatalog = SdkTapOnPhoneVierge.this.getErrorFromCatalog(Integer.valueOf(searchTxnResponse.getF67972a()));
                        searchTxnResponse.setErrorCode(errorFromCatalog.getBOD());
                        searchTxnResponse.setErrorMessage(errorFromCatalog.getSetInjectedTransactionParameters());
                    } else {
                        response.code();
                        searchTxnResponse = new SearchTxnResponse();
                        ErrorCatalog errorFromCatalog2 = SdkTapOnPhoneVierge.this.getErrorFromCatalog(Integer.valueOf(response.code()));
                        if (errorFromCatalog2 != ErrorCatalog.Undefined) {
                            searchTxnResponse.setErrorCode(errorFromCatalog2.getBOD());
                            searchTxnResponse.setErrorMessage(errorFromCatalog2.getSetInjectedTransactionParameters());
                        } else {
                            searchTxnResponse = new SearchTxnResponse();
                            searchTxnResponse.setErrorCode(response.code());
                            searchTxnResponse.setErrorMessage(response.message());
                        }
                    }
                    this.f67696a.responseSalePosTip(searchTxnResponse);
                } catch (HttpException e5) {
                    e5.getMessage();
                    SearchTxnResponse searchTxnResponse2 = new SearchTxnResponse();
                    searchTxnResponse2.setErrorCode(e5.code());
                    searchTxnResponse2.setErrorMessage(e5.getMessage());
                }
            }

            @Override // retrofit2.Callback
            public final void onFailure(Call<SearchTxnResponse> call, Throwable th2) {
            }
        }
    }
}
