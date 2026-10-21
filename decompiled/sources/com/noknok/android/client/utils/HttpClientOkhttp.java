package com.noknok.android.client.utils;

import android.util.Base64;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.tls.HandshakeCertificates;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(21)
public class HttpClientOkhttp extends HttpClient {
    @Override // com.noknok.android.client.utils.HttpClient
    public HttpClient sendRequest() throws IOException, CertificateEncodingException {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j10 = this.defaultConnectionTimeout;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient.Builder builderFollowRedirects = builder.connectTimeout(j10, timeUnit).readTimeout(this.defaultSocketTimeout, timeUnit).followRedirects(this.mFollowRedirects);
        if (this.mAllowedSslProtocols != null) {
            builderFollowRedirects.sslSocketFactory(new TlsSocketFactory().setAllowedSslProtocols(this.mAllowedSslProtocols), new HandshakeCertificates.Builder().addPlatformTrustedCertificates().build().trustManager());
        }
        OkHttpClient okHttpClientBuild = builderFollowRedirects.build();
        Request.Builder builder2 = new Request.Builder();
        builder2.url(this.mURL);
        String str = this.mMessage;
        builder2.method(this.mHttpMethod.name(), str != null ? RequestBody.create(str, (MediaType) null) : null);
        Map<String, String> map = this.mHeaders;
        if (map != null) {
            for (String str2 : map.keySet()) {
                builder2.addHeader(str2, this.mHeaders.get(str2));
            }
        }
        Request requestBuild = builder2.build();
        Logger.d("HttpClientOkhttp", String.format("The request headers:\n%s %s\n%s", requestBuild.method(), requestBuild.url(), requestBuild.headers()));
        if (this.mMessage != null) {
            Logger.d("HttpClientOkhttp", "The request message: " + this.mMessage);
        }
        Response responseExecute = okHttpClientBuild.newCall(requestBuild).execute();
        this.mStatus = responseExecute.code();
        ResponseBody responseBodyBody = responseExecute.body();
        this.mResponse = responseBodyBody != null ? responseBodyBody.string() : "";
        List<Certificate> listPeerCertificates = responseExecute.handshake().peerCertificates();
        if (listPeerCertificates.size() > 0) {
            setTlsCert(Base64.encodeToString(listPeerCertificates.get(0).getEncoded(), 10));
        }
        Logger.d("HttpClientOkhttp", "The response headers:\n" + responseExecute.headers());
        if (this.mResponse != null) {
            Logger.d("HttpClientOkhttp", "The response message: " + this.mResponse);
        }
        return this;
    }
}
