package com.airbnb.lottie.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.utils.Logger;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class DefaultLottieFetchResult implements LottieFetchResult {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final HttpURLConnection f26133p0;

    public DefaultLottieFetchResult(@NonNull HttpURLConnection httpURLConnection) {
        this.f26133p0 = httpURLConnection;
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    @NonNull
    public InputStream bodyByteStream() throws IOException {
        return this.f26133p0.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26133p0.disconnect();
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    @Nullable
    public String contentType() {
        return this.f26133p0.getContentType();
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    @Nullable
    public String error() {
        HttpURLConnection httpURLConnection = this.f26133p0;
        try {
            if (isSuccessful()) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to fetch ");
            sb2.append(httpURLConnection.getURL());
            sb2.append(". Failed with ");
            sb2.append(httpURLConnection.getResponseCode());
            sb2.append(RootService.LINE_BREAK);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb3 = new StringBuilder();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb3.append(line);
                        sb3.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused2) {
                    }
                    throw th2;
                }
            }
            bufferedReader.close();
            sb2.append(sb3.toString());
            return sb2.toString();
        } catch (IOException e5) {
            Logger.warning("get error failed ", e5);
            return e5.getMessage();
        }
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public boolean isSuccessful() {
        try {
            return this.f26133p0.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
