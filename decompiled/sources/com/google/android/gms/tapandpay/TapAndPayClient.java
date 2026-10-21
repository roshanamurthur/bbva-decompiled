package com.google.android.gms.tapandpay;

import android.app.Activity;
import android.app.PendingIntent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tapandpay.issuer.CreatePushProvisionSessionRequest;
import com.google.android.gms.tapandpay.issuer.IsTokenizedRequest;
import com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.TokenStatus;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
public interface TapAndPayClient extends HasApiKey<Api.ApiOptions.NotRequiredOptions> {

    @NonNull
    public static final String DATA_CHANGED_LISTENER_KEY = "tapAndPayDataChangedListener";

    @NonNull
    Task<PushProvisionSessionContext> createPushProvisionSession(@NonNull CreatePushProvisionSessionRequest createPushProvisionSessionRequest);

    void createWallet(@NonNull Activity activity, int i10);

    @NonNull
    Task<String> getActiveWalletId();

    @NonNull
    Task<String> getEnvironment();

    @NonNull
    Task<String> getLinkingToken(@NonNull String str);

    @NonNull
    Task<String> getStableHardwareId();

    @NonNull
    Task<TokenStatus> getTokenStatus(int i10, @NonNull String str);

    @NonNull
    Task<Boolean> isTokenized(@NonNull IsTokenizedRequest isTokenizedRequest);

    @NonNull
    Task<List<TokenInfo>> listTokens();

    void pushTokenize(@NonNull Activity activity, @NonNull PushTokenizeRequest pushTokenizeRequest, int i10);

    @NonNull
    Task<Void> registerDataChangedListener(@NonNull TapAndPay.DataChangedListener dataChangedListener);

    @NonNull
    Task<Void> removeDataChangedListener(@NonNull TapAndPay.DataChangedListener dataChangedListener);

    void requestDeleteToken(@NonNull Activity activity, @NonNull String str, int i10, int i11);

    void requestSelectToken(@NonNull Activity activity, @NonNull String str, int i10, int i11);

    void serverPushProvision(@NonNull Activity activity, @NonNull ServerPushProvisionRequest serverPushProvisionRequest, int i10);

    void tokenize(@NonNull Activity activity, @NonNull String str, int i10, @NonNull String str2, int i11, int i12);

    @NonNull
    Task<PendingIntent> viewToken(@NonNull ViewTokenRequest viewTokenRequest);
}
