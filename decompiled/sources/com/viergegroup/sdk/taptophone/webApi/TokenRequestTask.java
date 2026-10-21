package com.viergegroup.sdk.taptophone.webApi;

import android.os.AsyncTask;
import com.viergegroup.sdk.taptophone.vierge.models.TokenInfo;
import java.lang.ref.WeakReference;
import java.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: classes7.dex */
public class TokenRequestTask extends AsyncTask<Void, Void, TokenInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<TokenResponse> f67986a;

    public TokenRequestTask(TokenResponse tokenResponse) {
        this.f67986a = new WeakReference<>(tokenResponse);
    }

    @Override // android.os.AsyncTask
    public TokenInfo doInBackground(Void... voidArr) {
        try {
            return OAuthClient.getAccessToken();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(TokenInfo tokenInfo) {
        TokenResponse tokenResponse = this.f67986a.get();
        if (tokenResponse == null) {
            return;
        }
        if (tokenInfo == null) {
            tokenResponse.getTokenOAth(new TokenInfo("Error obtener token", null));
            return;
        }
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        tokenInfo.getToken();
        tokenInfo.getTokenExpiryTime().format(dateTimeFormatterOfPattern);
        tokenResponse.getTokenOAth(tokenInfo);
    }
}
