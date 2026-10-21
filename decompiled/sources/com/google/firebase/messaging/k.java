package com.google.firebase.messaging;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: compiled from: GmsRpc.java */
/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f48636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f48637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rpc f48638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<UserAgentPublisher> f48639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider<HeartBeatInfo> f48640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FirebaseInstallationsApi f48641f;

    public k(FirebaseApp firebaseApp, l lVar, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        Rpc rpc = new Rpc(firebaseApp.getApplicationContext());
        this.f48636a = firebaseApp;
        this.f48637b = lVar;
        this.f48638c = rpc;
        this.f48639d = provider;
        this.f48640e = provider2;
        this.f48641f = firebaseInstallationsApi;
    }

    public final Task<String> a(Task<Bundle> task) {
        return task.continueWith(new d(), new fa.a(this));
    }

    public final void b(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        int i10;
        String strEncodeToString;
        HeartBeatInfo.HeartBeat heartBeatCode;
        PackageInfo packageInfoD;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f48636a.getOptions().getApplicationId());
        l lVar = this.f48637b;
        synchronized (lVar) {
            try {
                if (lVar.f48645d == 0 && (packageInfoD = lVar.d("com.google.android.gms")) != null) {
                    lVar.f48645d = packageInfoD.versionCode;
                }
                i10 = lVar.f48645d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f48637b.a());
        bundle.putString("app_ver_name", this.f48637b.b());
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1).digest(this.f48636a.getName().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String token = ((InstallationTokenResult) Tasks.await(this.f48641f.getToken(false))).getToken();
            if (TextUtils.isEmpty(token)) {
                Log.w(Constants.TAG, "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", token);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("appid", (String) Tasks.await(this.f48641f.getId()));
        bundle.putString("cliv", "fcm-23.1.2");
        HeartBeatInfo heartBeatInfo = this.f48640e.get();
        UserAgentPublisher userAgentPublisher = this.f48639d.get();
        if (heartBeatInfo == null || userAgentPublisher == null || (heartBeatCode = heartBeatInfo.getHeartBeatCode("fire-iid")) == HeartBeatInfo.HeartBeat.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatCode.getCode()));
        bundle.putString("Firebase-Client", userAgentPublisher.getUserAgent());
    }

    public final Task<Bundle> c(String str, String str2, Bundle bundle) {
        try {
            b(str, str2, bundle);
            return this.f48638c.send(bundle);
        } catch (InterruptedException | ExecutionException e5) {
            return Tasks.forException(e5);
        }
    }
}
