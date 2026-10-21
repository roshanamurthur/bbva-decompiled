package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.processing.f;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.veridas.contextualdata.ContextualDataConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class FirebaseInstallationServiceClient {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f48489d = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f48490e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<HeartBeatController> f48492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jg.a f48493c = new jg.a();

    public FirebaseInstallationServiceClient(@NonNull Context context, @NonNull Provider<HeartBeatController> provider) {
        this.f48491a = context;
        this.f48492b = provider;
    }

    public static URL a(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", ConfigConstantsKt.CUSTOMERS_API_VERSION, str));
        } catch (MalformedURLException e5) {
            throw new FirebaseInstallationsException(e5.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    public static void b(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f48490e));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    sb2.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
            } catch (IOException unused) {
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        objArr[2] = TextUtils.isEmpty(str) ? "" : f.d(", ", str);
        Log.w("Firebase-Installations", String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr));
    }

    @VisibleForTesting
    public static long d(String str) {
        Preconditions.checkArgument(f48489d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static InstallationResponse e(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f48490e));
        TokenResult.Builder builder = TokenResult.builder();
        InstallationResponse.Builder builder2 = InstallationResponse.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                builder2.setUri(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                builder2.setFid(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                builder2.setRefreshToken(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        builder.setToken(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        builder.setTokenExpirationTimestamp(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                builder2.setAuthToken(builder.build());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder2.setResponseCode(InstallationResponse.ResponseCode.OK).build();
    }

    public static TokenResult f(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f48490e));
        TokenResult.Builder builder = TokenResult.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                builder.setToken(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                builder.setTokenExpirationTimestamp(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder.setResponseCode(TokenResult.ResponseCode.OK).build();
    }

    public static void g(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put(ContextualDataConstants.CD_SDK_VERSION, "a:17.2.0");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ContextualDataConstants.CD_SDK_VERSION, "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public final HttpURLConnection c(URL url, String str) throws FirebaseInstallationsException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty(DigipassManagerConstants.KEY_CONTENT_TYPE, "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.f48491a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            HeartBeatController heartBeatController = this.f48492b.get();
            if (heartBeatController != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(heartBeatController.getHeartBeatsHeader()));
                } catch (InterruptedException e5) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e5);
                } catch (ExecutionException e7) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e7);
                }
            }
            String strBytesToStringUppercase = null;
            try {
                byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
                if (packageCertificateHashBytes == null) {
                    context.getPackageName();
                } else {
                    strBytesToStringUppercase = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                context.getPackageName();
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", strBytesToStringUppercase);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused2) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    @NonNull
    public InstallationResponse createFirebaseInstallation(@NonNull String str, @Nullable String str2, @NonNull String str3, @NonNull String str4, @Nullable String str5) throws FirebaseInstallationsException {
        InstallationResponse installationResponseBuild;
        jg.a aVar = this.f48493c;
        if (!aVar.b()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        URL urlA = a(String.format("projects/%s/installations", str3));
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    g(httpURLConnectionC, str2, str4);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    aVar.d(responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        b(httpURLConnectionC, str4, str, str3);
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            installationResponseBuild = InstallationResponse.builder().setResponseCode(InstallationResponse.ResponseCode.BAD_CONFIG).build();
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    } else {
                        installationResponseBuild = e(httpURLConnectionC);
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return installationResponseBuild;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th2) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @NonNull
    public void deleteFirebaseInstallation(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) throws FirebaseInstallationsException {
        int i10 = 0;
        URL urlA = a(String.format("projects/%s/installations/%s", str3, str2));
        while (i10 <= 1) {
            TrafficStats.setThreadStatsTag(32770);
            HttpURLConnection httpURLConnectionC = c(urlA, str);
            try {
                httpURLConnectionC.setRequestMethod("DELETE");
                httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                int responseCode = httpURLConnectionC.getResponseCode();
                if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                    b(httpURLConnectionC, null, str, str3);
                    if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                        throw new FirebaseInstallationsException("Bad config while trying to delete FID", FirebaseInstallationsException.Status.BAD_CONFIG);
                    }
                    i10++;
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                return;
            } catch (IOException unused) {
            } catch (Throwable th2) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @NonNull
    public TokenResult generateAuthToken(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) throws FirebaseInstallationsException {
        TokenResult tokenResultBuild;
        jg.a aVar = this.f48493c;
        if (!aVar.b()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        URL urlA = a(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    aVar.d(responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        b(httpURLConnectionC, null, str, str3);
                        if (responseCode == 401 || responseCode == 404) {
                            tokenResultBuild = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.AUTH_ERROR).build();
                        } else {
                            if (responseCode == 429) {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                tokenResultBuild = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.BAD_CONFIG).build();
                            }
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    } else {
                        tokenResultBuild = f(httpURLConnectionC);
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return tokenResultBuild;
                } catch (Throwable th2) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused) {
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }
}
