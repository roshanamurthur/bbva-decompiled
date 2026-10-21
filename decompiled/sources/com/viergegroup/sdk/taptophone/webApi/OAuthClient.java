package com.viergegroup.sdk.taptophone.webApi;

import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import com.viergegroup.sdk.taptophone.R;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.SdkTapOnPhoneVierge;
import com.viergegroup.sdk.taptophone.vierge.models.TokenInfo;
import java.time.LocalDateTime;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class OAuthClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f67977a = SdkTapOnPhoneVierge.getContext().getString(R.string.CLIENT_ID);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f67978b = SdkTapOnPhoneVierge.getContext().getString(R.string.CLIENT_SECRET);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f67979c = SdkTapOnPhoneVierge.getContext().getString(R.string.AUTHORIZATION_GRANT_TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f67980d = SdkTapOnPhoneVierge.getContext().getString(R.string.SCOPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f67981e = SdkTapOnPhoneVierge.getContext().getString(R.string.ACCESS_TOKEN_URI);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final OkHttpClient f67982f = new OkHttpClient();

    public static TokenInfo getAccessToken() throws Exception {
        Response responseExecute = f67982f.newCall(new Request.Builder().url(f67981e).post(new FormBody.Builder().add("grant_type", f67979c).add(IAppSDKPlus.EXTRA_KEY_CLIENT_ID, f67977a).add("client_secret", f67978b).add("scope", f67980d).build()).build()).execute();
        try {
            if (!responseExecute.isSuccessful()) {
                throw new Exception("Unexpected code ".concat(String.valueOf(responseExecute)));
            }
            JSONObject jSONObject = new JSONObject(responseExecute.body().string());
            TokenInfo tokenInfo = new TokenInfo(jSONObject.getString("access_token"), LocalDateTime.now().plusSeconds(jSONObject.getInt("expires_in")));
            responseExecute.close();
            return tokenInfo;
        } catch (Throwable th2) {
            if (responseExecute != null) {
                try {
                    responseExecute.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
