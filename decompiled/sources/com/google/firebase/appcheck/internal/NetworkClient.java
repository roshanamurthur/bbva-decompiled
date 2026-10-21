package com.google.firebase.appcheck.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.appcheck.FirebaseAppCheck;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public class NetworkClient {
    public static final int DEBUG = 2;
    public static final int PLAY_INTEGRITY = 3;
    public static final int SAFETY_NET = 1;
    public static final int UNKNOWN = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider<HeartBeatController> f47624e;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AttestationTokenType {
    }

    @VisibleForTesting
    public NetworkClient() {
        throw null;
    }

    public NetworkClient(@NonNull FirebaseApp firebaseApp) {
        Context applicationContext = firebaseApp.getApplicationContext();
        FirebaseOptions options = firebaseApp.getOptions();
        Provider<HeartBeatController> provider = ((DefaultFirebaseAppCheck) FirebaseAppCheck.getInstance(firebaseApp)).f47601b;
        Preconditions.checkNotNull(applicationContext);
        Preconditions.checkNotNull(options);
        Preconditions.checkNotNull(provider);
        this.f47620a = applicationContext;
        this.f47621b = options.getApiKey();
        this.f47622c = options.getApplicationId();
        String projectId = options.getProjectId();
        this.f47623d = projectId;
        if (projectId == null) {
            throw new IllegalArgumentException("FirebaseOptions#getProjectId cannot be null.");
        }
        this.f47624e = provider;
    }

    public final String a(@NonNull URL url, @NonNull byte[] bArr, @NonNull RetryManager retryManager) throws FirebaseException, JSONException, IOException {
        String str;
        BufferedOutputStream bufferedOutputStream;
        StringBuilder sb2;
        BufferedReader bufferedReader;
        Context context = this.f47620a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        try {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.setRequestProperty(DigipassManagerConstants.KEY_CONTENT_TYPE, "application/json");
            HeartBeatController heartBeatController = this.f47624e.get();
            String strBytesToStringUppercase = null;
            if (heartBeatController != null) {
                try {
                    str = (String) Tasks.await(heartBeatController.getHeartBeatsHeader());
                } catch (Exception unused) {
                    Log.w("com.google.firebase.appcheck.internal.NetworkClient", "Unable to get heartbeats!");
                    str = null;
                }
            } else {
                str = null;
            }
            if (str != null) {
                httpURLConnection.setRequestProperty("X-Firebase-Client", str);
            }
            httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
            try {
                try {
                    byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
                    if (packageCertificateHashBytes == null) {
                        context.getPackageName();
                    } else {
                        strBytesToStringUppercase = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
                    }
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb2.append(line);
                        } catch (Throwable th2) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    context.getPackageName();
                }
                bufferedOutputStream.write(bArr, 0, bArr.length);
                bufferedOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                InputStream errorStream = (responseCode < 200 || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                sb2 = new StringBuilder();
                bufferedReader = new BufferedReader(new InputStreamReader(errorStream, "UTF-8"));
                bufferedReader.close();
                String string = sb2.toString();
                if (responseCode >= 200 && responseCode < 300) {
                    retryManager.resetBackoffOnSuccess();
                    httpURLConnection.disconnect();
                    return string;
                }
                retryManager.updateBackoffOnFailure(responseCode);
                HttpErrorResponse httpErrorResponseFromJsonString = HttpErrorResponse.fromJsonString(string);
                throw new FirebaseException("Error returned from API. code: " + httpErrorResponseFromJsonString.getErrorCode() + " body: " + httpErrorResponseFromJsonString.getErrorMessage());
            } catch (Throwable th4) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
            httpURLConnection.setRequestProperty("X-Android-Cert", strBytesToStringUppercase);
            bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bArr.length);
        } catch (Throwable th6) {
            httpURLConnection.disconnect();
            throw th6;
        }
    }

    @NonNull
    public AppCheckTokenResponse exchangeAttestationForAppCheckToken(@NonNull byte[] bArr, int i10, @NonNull RetryManager retryManager) throws FirebaseException, JSONException, IOException {
        String str;
        if (!retryManager.canRetry()) {
            throw new FirebaseException("Too many attempts.");
        }
        if (i10 == 1) {
            str = "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangeSafetyNetToken?key=%s";
        } else if (i10 == 2) {
            str = "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangeDebugToken?key=%s";
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException("Unknown token type.");
            }
            str = "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangePlayIntegrityToken?key=%s";
        }
        return AppCheckTokenResponse.fromJsonString(a(new URL(String.format(str, this.f47623d, this.f47622c, this.f47621b)), bArr, retryManager));
    }

    @NonNull
    public String generatePlayIntegrityChallenge(@NonNull byte[] bArr, @NonNull RetryManager retryManager) throws FirebaseException, JSONException, IOException {
        if (retryManager.canRetry()) {
            return a(new URL(String.format("https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:generatePlayIntegrityChallenge?key=%s", this.f47623d, this.f47622c, this.f47621b)), bArr, retryManager);
        }
        throw new FirebaseException("Too many attempts.");
    }
}
