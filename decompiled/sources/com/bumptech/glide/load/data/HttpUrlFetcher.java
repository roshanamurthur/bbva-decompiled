package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.processing.f;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.util.ContentLengthInputStream;
import com.bumptech.glide.util.LogTime;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class HttpUrlFetcher implements DataFetcher<InputStream> {

    @VisibleForTesting
    public static final a v0 = new a();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final GlideUrl f38152p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f38153q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final b f38154r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public HttpURLConnection f38155s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public InputStream f38156t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public volatile boolean f38157u0;

    public static class a implements b {
    }

    public interface b {
    }

    public HttpUrlFetcher(GlideUrl glideUrl, int i10) {
        a aVar = v0;
        this.f38152p0 = glideUrl;
        this.f38153q0 = i10;
        this.f38154r0 = aVar;
    }

    public final InputStream a(URL url, int i10, URL url2, Map<String, String> map) throws HttpException {
        int responseCode;
        int responseCode2 = -1;
        if (i10 >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            ((a) this.f38154r0).getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            int i11 = this.f38153q0;
            httpURLConnection.setConnectTimeout(i11);
            httpURLConnection.setReadTimeout(i11);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f38155s0 = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f38156t0 = this.f38155s0.getInputStream();
                if (this.f38157u0) {
                    return null;
                }
                try {
                    responseCode = this.f38155s0.getResponseCode();
                } catch (IOException unused2) {
                    responseCode = -1;
                }
                int i12 = responseCode / 100;
                if (i12 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f38155s0;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f38156t0 = ContentLengthInputStream.obtain(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                httpURLConnection2.getContentEncoding();
                            }
                            this.f38156t0 = httpURLConnection2.getInputStream();
                        }
                        return this.f38156t0;
                    } catch (IOException e5) {
                        try {
                            responseCode2 = httpURLConnection2.getResponseCode();
                        } catch (IOException unused3) {
                        }
                        throw new HttpException("Failed to obtain InputStream", responseCode2, e5);
                    }
                }
                if (i12 != 3) {
                    if (responseCode == -1) {
                        throw new HttpException(responseCode);
                    }
                    try {
                        throw new HttpException(this.f38155s0.getResponseMessage(), responseCode);
                    } catch (IOException e7) {
                        throw new HttpException("Failed to get a response message", responseCode, e7);
                    }
                }
                String headerField = this.f38155s0.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException("Received empty or null redirect url", responseCode);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    cleanup();
                    return a(url3, i10 + 1, url, map);
                } catch (MalformedURLException e10) {
                    throw new HttpException(f.d("Bad redirect url: ", headerField), responseCode, e10);
                }
            } catch (IOException e11) {
                try {
                    responseCode2 = this.f38155s0.getResponseCode();
                } catch (IOException unused4) {
                }
                throw new HttpException("Failed to connect or obtain data", responseCode2, e11);
            }
        } catch (IOException e12) {
            throw new HttpException("URL.openConnection threw", 0, e12);
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
        this.f38157u0 = true;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        InputStream inputStream = this.f38156t0;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f38155s0;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f38155s0 = null;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public DataSource getDataSource() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super InputStream> dataCallback) {
        GlideUrl glideUrl = this.f38152p0;
        long logTime = LogTime.getLogTime();
        try {
            dataCallback.onDataReady(a(glideUrl.toURL(), 0, null, glideUrl.getHeaders()));
        } catch (IOException e5) {
            dataCallback.onLoadFailed(e5);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                LogTime.getElapsedMillis(logTime);
            }
        }
    }
}
