package com.bbva.google.pay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bbva.google.pay.utils.ExtensionsKt;
import com.google.android.gms.tapandpay.TapAndPay;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.UserAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GooglePayActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J0\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006J\"\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J0\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bbva/google/pay/GooglePayActivity;", "Landroid/app/Activity;", "()V", "pushTokenizeRequest", "Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;", "requestCode", "", "fPanLastFour", GoogleTapAndPay.KEY_PAN, "generatePushTokenizeRequest", GoogleTapAndPay.KEY_OPC, "", GoogleTapAndPay.KEY_CARD_NETWORK, "", GoogleTapAndPay.KEY_TSP, GoogleTapAndPay.KEY_ALIAS, "getExtras", "", "nexStep", "onActivityResult", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "sendData", "activationData", "google-pay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GooglePayActivity extends Activity {

    @Nullable
    private PushTokenizeRequest pushTokenizeRequest;

    @NotNull
    private String requestCode = "";

    private final String fPanLastFour(String pan) {
        if (pan.length() <= 0 || !(ExtensionsKt.isAmex(pan) || ExtensionsKt.isVisaOrMc(pan))) {
            return "";
        }
        String strSubstring = pan.substring(pan.length() - 4, pan.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    private final PushTokenizeRequest generatePushTokenizeRequest(byte[] opc, int cardNetwork, int tokenServiceProvider, String alias, String pan) {
        PushTokenizeRequest pushTokenizeRequestBuild = new PushTokenizeRequest.Builder().setOpaquePaymentCard(opc).setNetwork(cardNetwork).setTokenServiceProvider(tokenServiceProvider).setDisplayName(alias).setLastDigits(fPanLastFour(pan)).setUserAddress(UserAddress.newBuilder().build()).build();
        Intrinsics.checkNotNullExpressionValue(pushTokenizeRequestBuild, "Builder()\n            .s…d())\n            .build()");
        return pushTokenizeRequestBuild;
    }

    private final void getExtras() {
        String strValueOf = String.valueOf(getIntent().getStringExtra("requestCode"));
        this.requestCode = strValueOf;
        if (!l.isBlank(strValueOf) && Intrinsics.areEqual(this.requestCode, "REQUEST_CODE_PUSH_TOKENIZE")) {
            String stringExtra = getIntent().getStringExtra(GoogleTapAndPay.KEY_OPC);
            int intExtra = getIntent().getIntExtra(GoogleTapAndPay.KEY_CARD_NETWORK, -1);
            int intExtra2 = getIntent().getIntExtra(GoogleTapAndPay.KEY_TSP, -1);
            String stringExtra2 = getIntent().getStringExtra(GoogleTapAndPay.KEY_ALIAS);
            String stringExtra3 = getIntent().getStringExtra(GoogleTapAndPay.KEY_PAN);
            if (stringExtra == null || stringExtra2 == null || stringExtra3 == null) {
                return;
            }
            sendData(stringExtra, intExtra, intExtra2, stringExtra2, stringExtra3);
        }
    }

    private final void sendData(String activationData, int cardNetwork, int tokenServiceProvider, String alias, String pan) {
        if (cardNetwork == 4) {
            activationData = ExtensionsKt.decode(activationData);
        }
        byte[] bytes = activationData.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        this.pushTokenizeRequest = generatePushTokenizeRequest(bytes, cardNetwork, tokenServiceProvider, alias, pan);
    }

    public final void nexStep(@NotNull String requestCode) {
        PushTokenizeRequest pushTokenizeRequest;
        Intrinsics.checkNotNullParameter(requestCode, "requestCode");
        if (Intrinsics.areEqual(requestCode, "REQUEST_CREATE_WALLET")) {
            TapAndPay.getClient(getApplicationContext()).createWallet(this, GoogleTapAndPay.REQUEST_CREATE_WALLET);
        } else {
            if (!Intrinsics.areEqual(requestCode, "REQUEST_CODE_PUSH_TOKENIZE") || (pushTokenizeRequest = this.pushTokenizeRequest) == null) {
                return;
            }
            TapAndPay.getClient(getApplicationContext()).pushTokenize(this, pushTokenizeRequest, GoogleTapAndPay.REQUEST_CODE_PUSH_TOKENIZE);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        setResult(resultCode, data);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            getExtras();
            nexStep(this.requestCode);
        } catch (Exception unused) {
            finish();
        }
    }
}
