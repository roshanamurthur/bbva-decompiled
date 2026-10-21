package com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.mypinpad.tsdk.api.callbacks.TerminalLogger;
import com.viergegroup.sdk.taptophone.vierge.database.DBUtils;
import com.viergegroup.sdk.taptophone.vierge.models.TokenInfo;
import com.viergegroup.sdk.taptophone.webApi.LogRequestDto;
import com.viergegroup.sdk.taptophone.webApi.ServiceViergeBackEnd;
import com.viergegroup.sdk.taptophone.webApi.TokenRequestTask;
import com.viergegroup.sdk.taptophone.webApi.TokenResponse;
import com.viergegroup.sdk.taptophone.webApi.TransactionsApi;
import ie.g0;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes7.dex */
public class TsdkLogger implements TerminalLogger {
    public static Function<String, Void> DEFAULT_SINK = new ie.b(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f67745a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static LocalDateTime f67746b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f67747c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f67748d = "";
    public static boolean isActiveLogsToServer = true;
    public static boolean logSentSuccesfully = false;
    public Function<String, Void> sink = new g0(this, 2);

    public class b implements TokenResponse {
        @Override // com.viergegroup.sdk.taptophone.webApi.TokenResponse
        public final void getTokenOAth(TokenInfo tokenInfo) {
            TsdkLogger.f67745a = tokenInfo.getToken();
            TsdkLogger.f67746b = tokenInfo.getTokenExpiryTime();
        }
    }

    public TsdkLogger(Context context) {
        String serialNumber = DBUtils.getSerialNumber();
        f67747c = serialNumber;
        if (serialNumber == null || serialNumber.isEmpty()) {
            String strGenerateSerialNumber = PinPadSdk.generateSerialNumber();
            f67747c = strGenerateSerialNumber;
            DBUtils.updateSerialNumber(strGenerateSerialNumber);
            f67747c = SdkTapOnPhoneVierge.padLeft(f67747c, 20);
        }
        if (isActiveLogsToServer) {
            new TokenRequestTask(new b()).execute(new Void[0]);
        }
    }

    @Override // com.mypinpad.tsdk.api.callbacks.TerminalLogger
    public void log(@NonNull String str) {
        this.sink.apply(str);
    }

    public void sendLogToServer() {
        String str = f67748d;
        if (f67745a == null || f67746b == null || LocalDateTime.now().isAfter(f67746b)) {
            new TokenRequestTask(new b()).execute(new Void[0]);
        }
        String str2 = f67745a;
        if (str2 != null) {
            ServiceViergeBackEnd.setToken(str2);
            TransactionsApi transactionsApi = (TransactionsApi) ServiceViergeBackEnd.getRetrofitInstance(0).create(TransactionsApi.class);
            String str3 = f67747c;
            String str4 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmm"));
            LogRequestDto logRequestDto = new LogRequestDto();
            logRequestDto.setHostType("OpenPayProd");
            logRequestDto.setTerminalSerialNumber(str3);
            logRequestDto.setRrn(str4);
            logRequestDto.setLogData(str);
            transactionsApi.sendLogs(RequestBody.create(MediaType.parse("application/json"), new Gson().toJson(logRequestDto))).enqueue(new a());
        }
    }

    public class a implements Callback<String> {
        @Override // retrofit2.Callback
        public final void onFailure(Call<String> call, Throwable th2) {
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<String> call, Response<String> response) {
        }
    }
}
