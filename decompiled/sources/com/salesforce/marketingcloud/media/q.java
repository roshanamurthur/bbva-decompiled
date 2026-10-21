package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import androidx.webkit.ProxyConfig;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public class q extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f64531b = com.salesforce.marketingcloud.g.a("NetworkRequestHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f64532a;

    public q(r rVar) {
        this.f64532a = rVar;
    }

    private Bitmap a(String str, s sVar) throws IOException {
        InputStream inputStreamA = this.f64532a.a(str);
        Bitmap bitmapA = null;
        if (inputStreamA == null) {
            return null;
        }
        try {
            bitmapA = u.a(inputStreamA, sVar);
            com.salesforce.marketingcloud.util.g.a((Closeable) inputStreamA);
            return bitmapA;
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.a(f64531b, e5, "Failed to decode cache into Bitmap.", new Object[0]);
            return bitmapA;
        }
    }

    @Override // com.salesforce.marketingcloud.media.u
    public void a(o oVar, s sVar, u.a aVar) throws Throwable {
        String string = sVar.f64537a.toString();
        Bitmap bitmapA = a(string, sVar);
        if (bitmapA != null) {
            aVar.a(new u.b(bitmapA, o.b.DISK));
            return;
        }
        com.salesforce.marketingcloud.g.a("IMAGE", "Starting network request for image", new Object[0]);
        HttpURLConnection.setFollowRedirects(true);
        HttpsURLConnection httpsURLConnection = null;
        try {
            try {
                HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) new URL(string).openConnection();
                try {
                    httpsURLConnection2.setUseCaches(false);
                    httpsURLConnection2.setConnectTimeout(30000);
                    httpsURLConnection2.setRequestMethod("GET");
                    InputStream inputStream = httpsURLConnection2.getInputStream();
                    if (s.b.c(sVar.f64540d)) {
                        byte[] bArrA = com.salesforce.marketingcloud.util.g.a(inputStream);
                        com.salesforce.marketingcloud.util.g.a((Closeable) inputStream);
                        this.f64532a.a(string, new ByteArrayInputStream(bArrA));
                        inputStream = new ByteArrayInputStream(bArrA);
                    }
                    Bitmap bitmapA2 = u.a(inputStream, sVar);
                    com.salesforce.marketingcloud.util.g.a((Closeable) inputStream);
                    aVar.a(new u.b(bitmapA2, o.b.NETWORK));
                    httpsURLConnection2.disconnect();
                } catch (Exception e5) {
                    e = e5;
                    httpsURLConnection = httpsURLConnection2;
                    com.salesforce.marketingcloud.g.b("IMAGE", e, "Image network error for URL: %s", string);
                    aVar.onError(e);
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpsURLConnection = httpsURLConnection2;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.salesforce.marketingcloud.media.u
    public boolean a(s sVar) {
        try {
            String lowerCase = sVar.f64537a.getScheme().toLowerCase(Locale.ENGLISH);
            return ProxyConfig.MATCH_HTTP.equalsIgnoreCase(lowerCase) || ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(lowerCase);
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f64531b, e5, "Unable to get scheme from request.", new Object[0]);
            return false;
        }
    }
}
