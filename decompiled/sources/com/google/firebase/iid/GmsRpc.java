package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.GmsRpc;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class GmsRpc {

    @KeepForSdk
    public static final String ERROR_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";

    @KeepForSdk
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f48414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Metadata f48415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rpc f48416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<UserAgentPublisher> f48417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider<HeartBeatInfo> f48418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FirebaseInstallationsApi f48419f;

    @VisibleForTesting
    public GmsRpc() {
        throw null;
    }

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        Rpc rpc = new Rpc(firebaseApp.getApplicationContext());
        this.f48414a = firebaseApp;
        this.f48415b = metadata;
        this.f48416c = rpc;
        this.f48417d = provider;
        this.f48418e = provider2;
        this.f48419f = firebaseInstallationsApi;
    }

    public final Task<String> a(Task<Bundle> task) {
        return task.continueWith(hg.a.f69423p0, new Continuation(this) { // from class: hg.h

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final GmsRpc f69436p0;

            {
                this.f69436p0 = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) throws IOException {
                this.f69436p0.getClass();
                Bundle bundle = (Bundle) task2.getResult(IOException.class);
                if (bundle == null) {
                    throw new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE);
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                String strValueOf = String.valueOf(bundle);
                Log.w("FirebaseInstanceId", ad.d.f(new StringBuilder(strValueOf.length() + 21), "Unexpected response: ", strValueOf), new Throwable());
                throw new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE);
            }
        });
    }

    public final Task b(String str, String str2, Bundle bundle, String str3) {
        String strEncodeToString;
        HeartBeatInfo.HeartBeat heartBeatCode;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        FirebaseApp firebaseApp = this.f48414a;
        bundle.putString("gmp_app_id", firebaseApp.getOptions().getApplicationId());
        Metadata metadata = this.f48415b;
        bundle.putString("gmsv", Integer.toString(metadata.getGmsVersionCode()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", metadata.getAppVersionCode());
        bundle.putString("app_ver_name", metadata.getAppVersionName());
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1).digest(firebaseApp.getName().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String token = ((InstallationTokenResult) Tasks.await(this.f48419f.getToken(false))).getToken();
            if (TextUtils.isEmpty(token)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", token);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("cliv", "fiid-21.1.0");
        HeartBeatInfo heartBeatInfo = this.f48418e.get();
        UserAgentPublisher userAgentPublisher = this.f48417d.get();
        if (heartBeatInfo != null && userAgentPublisher != null && (heartBeatCode = heartBeatInfo.getHeartBeatCode("fire-iid")) != HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatCode.getCode()));
            bundle.putString("Firebase-Client", userAgentPublisher.getUserAgent());
        }
        return this.f48416c.send(bundle);
    }

    public Task<?> deleteInstanceId(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("iid-operation", "delete");
        bundle.putString("delete", "1");
        return a(b(str, ProxyConfig.MATCH_ALL_SCHEMES, bundle, ProxyConfig.MATCH_ALL_SCHEMES));
    }

    public Task<?> deleteToken(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return a(b(str, str2, bundle, str3));
    }

    public Task<String> getToken(String str, String str2, String str3) {
        return a(b(str, str2, new Bundle(), str3));
    }

    @KeepForSdk
    public Task<?> subscribeToTopic(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        String strValueOf2 = String.valueOf(str3);
        return a(b(str, str2, bundle, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/")));
    }

    @KeepForSdk
    public Task<?> unsubscribeFromTopic(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String strValueOf2 = String.valueOf(str3);
        return a(b(str, str2, bundle, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/")));
    }
}
