package com.google.firebase.storage.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.emulators.EmulatedServiceSettings;
import com.google.firebase.storage.StorageException;
import com.google.firebase.storage.internal.StorageReferenceUri;
import com.google.firebase.storage.network.connection.HttpURLConnectionFactoryImpl;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class NetworkRequest {
    public static final int INITIALIZATION_EXCEPTION = -1;
    public static final int NETWORK_UNAVAILABLE = -2;
    public static final Uri PROD_BASE_URL = Uri.parse("https://firebasestorage.googleapis.com/v0");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HttpURLConnectionFactoryImpl f49166j = new HttpURLConnectionFactoryImpl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StorageReferenceUri f49167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f49168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, List<String>> f49169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f49171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f49172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f49173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HttpURLConnection f49174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f49175i = new HashMap();
    protected Exception mException;

    public NetworkRequest(@NonNull StorageReferenceUri storageReferenceUri, @NonNull FirebaseApp firebaseApp) {
        Preconditions.checkNotNull(storageReferenceUri);
        Preconditions.checkNotNull(firebaseApp);
        this.f49167a = storageReferenceUri;
        this.f49168b = firebaseApp.getApplicationContext();
        setCustomHeader("x-firebase-gmpid", firebaseApp.getOptions().getApplicationId());
    }

    @NonNull
    public static Uri getBaseUrl(@Nullable EmulatedServiceSettings emulatedServiceSettings) {
        if (emulatedServiceSettings == null) {
            return PROD_BASE_URL;
        }
        return Uri.parse("http://" + emulatedServiceSettings.getHost() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + emulatedServiceSettings.getPort() + "/v0");
    }

    public final void a(@NonNull HttpURLConnection httpURLConnection, @Nullable String str, @Nullable String str2) throws IOException {
        byte[] outputRaw;
        int outputRawSize;
        OutputStream outputStream;
        Preconditions.checkNotNull(httpURLConnection);
        if (TextUtils.isEmpty(str)) {
            Log.w("NetworkRequest", "no auth token for request");
        } else {
            httpURLConnection.setRequestProperty("Authorization", "Firebase " + str);
        }
        if (TextUtils.isEmpty(str2)) {
            Log.w("NetworkRequest", "No App Check token for request.");
        } else {
            httpURLConnection.setRequestProperty("x-firebase-appcheck", str2);
        }
        httpURLConnection.setRequestProperty("X-Firebase-Storage-Version", "Android/21.0.1");
        for (Map.Entry entry : this.f49175i.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        JSONObject outputJSON = getOutputJSON();
        if (outputJSON != null) {
            outputRaw = outputJSON.toString().getBytes("UTF-8");
            outputRawSize = outputRaw.length;
        } else {
            outputRaw = getOutputRaw();
            outputRawSize = getOutputRawSize();
            if (outputRawSize == 0 && outputRaw != null) {
                outputRawSize = outputRaw.length;
            }
        }
        if (outputRaw == null || outputRaw.length <= 0) {
            httpURLConnection.setRequestProperty("Content-Length", "0");
        } else {
            if (outputJSON != null) {
                httpURLConnection.setRequestProperty(DigipassManagerConstants.KEY_CONTENT_TYPE, "application/json");
            }
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(outputRawSize));
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (outputRaw == null || outputRaw.length <= 0 || (outputStream = httpURLConnection.getOutputStream()) == null) {
            return;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        try {
            bufferedOutputStream.write(outputRaw, 0, outputRawSize);
        } finally {
            bufferedOutputStream.close();
        }
    }

    public final HttpURLConnection b() throws IOException {
        Uri url = getURL();
        Map<String, String> queryParameters = getQueryParameters();
        if (queryParameters != null) {
            Uri.Builder builderBuildUpon = url.buildUpon();
            for (Map.Entry<String, String> entry : queryParameters.entrySet()) {
                builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            url = builderBuildUpon.build();
        }
        return f49166j.createInstance(new URL(url.toString()));
    }

    public final void c(@Nullable InputStream inputStream) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else {
                        sb2.append(line);
                    }
                } catch (Throwable th2) {
                    bufferedReader.close();
                    throw th2;
                }
            }
            bufferedReader.close();
        }
        this.f49171e = sb2.toString();
        if (isResultSuccess()) {
            return;
        }
        this.mException = new IOException(this.f49171e);
    }

    public <TResult> void completeTask(TaskCompletionSource<TResult> taskCompletionSource, TResult tresult) {
        Exception exception = getException();
        if (isResultSuccess() && exception == null) {
            taskCompletionSource.setResult(tresult);
        } else {
            taskCompletionSource.setException(StorageException.fromExceptionAndHttpCode(exception, getResultCode()));
        }
    }

    @NonNull
    public abstract String getAction();

    @Nullable
    public Exception getException() {
        return this.mException;
    }

    @Nullable
    public JSONObject getOutputJSON() {
        return null;
    }

    @Nullable
    public byte[] getOutputRaw() {
        return null;
    }

    public int getOutputRawSize() {
        return 0;
    }

    @Nullable
    public Map<String, String> getQueryParameters() {
        return null;
    }

    @Nullable
    public String getRawResult() {
        return this.f49171e;
    }

    public JSONObject getResultBody() {
        if (TextUtils.isEmpty(this.f49171e)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(this.f49171e);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public int getResultCode() {
        return this.f49170d;
    }

    @NonNull
    public Map<String, String> getResultHeaders() {
        return this.f49175i;
    }

    @Nullable
    public Map<String, List<String>> getResultHeadersImpl() {
        return this.f49169c;
    }

    @Nullable
    public String getResultString(String str) {
        List<String> list;
        Map<String, List<String>> resultHeadersImpl = getResultHeadersImpl();
        if (resultHeadersImpl == null || (list = resultHeadersImpl.get(str)) == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public int getResultingContentLength() {
        return this.f49172f;
    }

    @NonNull
    public StorageReferenceUri getStorageReferenceUri() {
        return this.f49167a;
    }

    public InputStream getStream() {
        return this.f49173g;
    }

    @NonNull
    @VisibleForTesting
    public Uri getURL() {
        return this.f49167a.getHttpUri();
    }

    public boolean isResultSuccess() {
        int i10 = this.f49170d;
        return i10 >= 200 && i10 < 300;
    }

    public void parseErrorResponse(@Nullable InputStream inputStream) throws IOException {
        c(inputStream);
    }

    public void parseSuccessulResponse(@Nullable InputStream inputStream) throws IOException {
        c(inputStream);
    }

    public void performRequest(@Nullable String str, @Nullable String str2, @NonNull Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.mException = new SocketException("Network subsystem is unavailable");
            this.f49170d = -2;
            return;
        }
        performRequestStart(str, str2);
        try {
            if (isResultSuccess()) {
                parseSuccessulResponse(this.f49173g);
            } else {
                parseErrorResponse(this.f49173g);
            }
        } catch (IOException e5) {
            Log.w("NetworkRequest", "error sending network request " + getAction() + " " + getURL(), e5);
            this.mException = e5;
            this.f49170d = -2;
        }
        performRequestEnd();
    }

    public void performRequestEnd() {
        HttpURLConnection httpURLConnection = this.f49174h;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void performRequestStart(@Nullable String str, @Nullable String str2) {
        if (this.mException != null) {
            this.f49170d = -1;
            return;
        }
        if (Log.isLoggable("NetworkRequest", 3)) {
            getAction();
            Objects.toString(getURL());
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f49168b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f49170d = -2;
            this.mException = new SocketException("Network subsystem is unavailable");
            return;
        }
        try {
            HttpURLConnection httpURLConnectionB = b();
            this.f49174h = httpURLConnectionB;
            httpURLConnectionB.setRequestMethod(getAction());
            a(this.f49174h, str, str2);
            HttpURLConnection httpURLConnection = this.f49174h;
            Preconditions.checkNotNull(httpURLConnection);
            this.f49170d = httpURLConnection.getResponseCode();
            this.f49169c = httpURLConnection.getHeaderFields();
            this.f49172f = httpURLConnection.getContentLength();
            if (isResultSuccess()) {
                this.f49173g = httpURLConnection.getInputStream();
            } else {
                this.f49173g = httpURLConnection.getErrorStream();
            }
        } catch (IOException e5) {
            Log.w("NetworkRequest", "error sending network request " + getAction() + " " + getURL(), e5);
            this.mException = e5;
            this.f49170d = -2;
        }
    }

    public final void reset() {
        this.mException = null;
        this.f49170d = 0;
    }

    public void setCustomHeader(String str, String str2) {
        this.f49175i.put(str, str2);
    }
}
