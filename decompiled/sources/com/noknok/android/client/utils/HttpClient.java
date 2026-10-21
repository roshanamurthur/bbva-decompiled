package com.noknok.android.client.utils;

import android.content.Context;
import android.util.Base64;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes11.dex */
public class HttpClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Factory f63446a = new Factory();
    protected static final String cid_pubkey = "cid_pubkey";
    protected static final String serverEndPoint = "serverEndPoint";
    protected static final String tlsServerCertificate = "tlsServerCertificate";
    protected static final String tlsUnique = "tlsUnique";
    protected int defaultConnectionTimeout;
    protected int defaultSocketTimeout;
    protected Map<String, String> mHeaders;
    protected String mMessage;
    protected Map<String, List<String>> mResponseHeaders;
    protected int mStatus;
    protected URL mURL;
    protected HttpMethod mHttpMethod = HttpMethod.POST;
    protected String mResponse = "";
    protected boolean mFollowRedirects = true;
    protected Map<String, String> mChannelBindings = null;
    protected String[] mAllowedSslProtocols = null;

    public static class Factory {
        public HttpClient createInstance() {
            return new HttpClient();
        }
    }

    public enum HttpMethod {
        GET,
        POST
    }

    private void a(HttpURLConnection httpURLConnection) {
        Logger.d("HttpClient", "The request headers: " + httpURLConnection.getRequestMethod() + " " + httpURLConnection.getURL() + " " + httpURLConnection.getRequestProperties());
        if (this.mMessage != null) {
            Logger.d("HttpClient", "The request message: " + this.mMessage);
        }
    }

    private void b(HttpURLConnection httpURLConnection) {
        Logger.d("HttpClient", "The response headers: " + httpURLConnection.getHeaderFields());
        if (this.mResponse != null) {
            Logger.d("HttpClient", "The response message: " + this.mResponse);
        }
    }

    public static synchronized HttpClient createInstance(Context context) {
        HttpClient httpClientCreateInstance;
        int asInt;
        httpClientCreateInstance = f63446a.createInstance();
        asInt = AppSDKConfig.getInstance(context).get(AppSDKConfig.Key.requestTimeout).getAsInt();
        return httpClientCreateInstance.setTimeout(asInt, asInt);
    }

    public static synchronized void setFactory(Factory factory) {
        f63446a = factory;
    }

    public HttpClient addCookies(String str) {
        Map<String, String> map = this.mHeaders;
        if (map == null) {
            this.mHeaders = new HashMap();
        } else if (map.containsKey("Cookie")) {
            str = androidx.camera.core.impl.utils.a.b(str, ReplenishLogic.ID_SEPARATOR, this.mHeaders.get("Cookie"));
        }
        this.mHeaders.put("Cookie", str);
        return this;
    }

    public HttpClient addHeader(String str, String str2) {
        if (this.mHeaders == null) {
            this.mHeaders = new HashMap();
        }
        this.mHeaders.put(str, str2);
        return this;
    }

    public Map<String, String> createChannelBindings() {
        HashMap map = new HashMap();
        this.mChannelBindings = map;
        map.put(serverEndPoint, null);
        this.mChannelBindings.put(tlsServerCertificate, null);
        this.mChannelBindings.put("cid_pubkey", null);
        this.mChannelBindings.put(tlsUnique, null);
        return this.mChannelBindings;
    }

    public Map<String, String> getChannelBindings() {
        return this.mChannelBindings;
    }

    public String getHeader(String str, int i10) {
        List<String> list;
        Map<String, List<String>> map = this.mResponseHeaders;
        if (map == null || (list = map.get(str)) == null || list.size() <= i10) {
            return null;
        }
        return list.get(i10);
    }

    public String getResponse() {
        return this.mResponse;
    }

    public int getStatusCode() {
        return this.mStatus;
    }

    public String getTlsCert() {
        return this.mChannelBindings.get(tlsServerCertificate);
    }

    public HttpClient sendRequest() throws Throwable {
        HttpURLConnection httpURLConnection;
        Throwable th2;
        try {
            httpURLConnection = (HttpURLConnection) this.mURL.openConnection();
            try {
                if ((httpURLConnection instanceof HttpsURLConnection) && this.mAllowedSslProtocols != null) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(new TlsSocketFactory().setAllowedSslProtocols(this.mAllowedSslProtocols));
                }
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(this.defaultConnectionTimeout);
                httpURLConnection.setReadTimeout(this.defaultSocketTimeout);
                httpURLConnection.setRequestMethod(this.mHttpMethod.name());
                httpURLConnection.setInstanceFollowRedirects(this.mFollowRedirects);
                Map<String, String> map = this.mHeaders;
                if (map != null) {
                    for (String str : map.keySet()) {
                        httpURLConnection.setRequestProperty(str, this.mHeaders.get(str));
                    }
                }
                a(httpURLConnection);
                String str2 = this.mMessage;
                if (str2 != null && str2.length() > 0 && this.mHttpMethod != HttpMethod.GET) {
                    httpURLConnection.setDoOutput(true);
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(this.mMessage.getBytes());
                    dataOutputStream.flush();
                    dataOutputStream.close();
                }
                this.mStatus = httpURLConnection.getResponseCode();
                this.mResponseHeaders = httpURLConnection.getHeaderFields();
                int i10 = this.mStatus;
                if (i10 == 200 || i10 == 400 || i10 == 500 || i10 == 401) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.mStatus == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream(), Charsets.utf8Charset));
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                    }
                    bufferedReader.close();
                    this.mResponse = sb2.toString();
                } else {
                    Logger.e("HttpClient", "HTTPs request failed with error code: " + this.mStatus + " : " + this.mURL.toString());
                    this.mResponse = "";
                }
                if (httpURLConnection instanceof HttpsURLConnection) {
                    setTlsCert(Base64.encodeToString(((HttpsURLConnection) httpURLConnection).getServerCertificates()[0].getEncoded(), 8).replaceAll("\\r\\n|\\n\\r|\\n|\\r", ""));
                }
                b(httpURLConnection);
                httpURLConnection.disconnect();
                return this;
            } catch (Throwable th3) {
                th2 = th3;
                if (httpURLConnection == null) {
                    throw th2;
                }
                httpURLConnection.disconnect();
                throw th2;
            }
        } catch (Throwable th4) {
            httpURLConnection = null;
            th2 = th4;
        }
    }

    public HttpClient setAllowedSSLProtocols(String[] strArr) {
        this.mAllowedSslProtocols = strArr;
        return this;
    }

    public HttpClient setCookies(String str) {
        return addHeader("Cookie", str);
    }

    public HttpClient setFollowRedirects(boolean z10) {
        this.mFollowRedirects = z10;
        return this;
    }

    public HttpClient setMessage(String str) {
        this.mMessage = str;
        return this;
    }

    public HttpClient setMethod(HttpMethod httpMethod) {
        this.mHttpMethod = httpMethod;
        return this;
    }

    public HttpClient setTimeout(int i10, int i11) {
        this.defaultConnectionTimeout = i10;
        this.defaultSocketTimeout = i10;
        return this;
    }

    public void setTlsCert(String str) {
        createChannelBindings().put(tlsServerCertificate, str);
    }

    public HttpClient setUrl(String str) throws MalformedURLException {
        this.mURL = new URL(str);
        return this;
    }

    public List<String> getHeader(String str) {
        Map<String, List<String>> map = this.mResponseHeaders;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
