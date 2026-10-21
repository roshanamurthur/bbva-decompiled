package com.google.firebase.crashlytics.internal.network;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.a;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes10.dex */
public class HttpGetRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f48274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f48275c = new HashMap();

    public HttpGetRequest(String str, Map<String, String> map) {
        this.f48273a = str;
        this.f48274b = map;
    }

    public static String a(String str, Map map) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb2.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return a.b(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return u.f(str, string);
    }

    public HttpResponse execute() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            String strA = a(this.f48273a, this.f48274b);
            Logger.getLogger().v("GET Request URL: " + strA);
            httpsURLConnection = (HttpsURLConnection) new URL(strA).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.f48275c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int i10 = bufferedReader.read(cArr);
                            if (i10 == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, i10);
                        }
                        string = sb2.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new HttpResponse(responseCode, string);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }

    public HttpGetRequest header(String str, String str2) {
        this.f48275c.put(str, str2);
        return this;
    }

    public HttpGetRequest header(Map.Entry<String, String> entry) {
        return header(entry.getKey(), entry.getValue());
    }
}
