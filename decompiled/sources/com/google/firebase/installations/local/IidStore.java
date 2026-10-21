package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.ProxyConfig;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.FirebaseApp;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class IidStore {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f48470c = {ProxyConfig.MATCH_ALL_SCHEMES, "FCM", CodePackage.GCM, ""};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @GuardedBy("iidPrefs")
    public final SharedPreferences f48471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48472b;

    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    public IidStore(@NonNull FirebaseApp firebaseApp) {
        this.f48471a = firebaseApp.getApplicationContext().getSharedPreferences("com.google.android.gms.appid", 0);
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId == null) {
            gcmSenderId = firebaseApp.getOptions().getApplicationId();
            if (gcmSenderId.startsWith("1:") || gcmSenderId.startsWith("2:")) {
                String[] strArrSplit = gcmSenderId.split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                if (strArrSplit.length != 4) {
                    gcmSenderId = null;
                } else {
                    gcmSenderId = strArrSplit[1];
                    if (gcmSenderId.isEmpty()) {
                        gcmSenderId = null;
                    }
                }
            }
        }
        this.f48472b = gcmSenderId;
    }

    @Nullable
    public final String a() {
        String string;
        synchronized (this.f48471a) {
            string = this.f48471a.getString("|S|id", null);
        }
        return string;
    }

    @Nullable
    public final String b() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f48471a) {
            String strEncodeToString = null;
            String string = this.f48471a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e5) {
                Log.w("ContentValues", "Invalid key stored " + e5);
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }

    @Nullable
    public String readIid() {
        synchronized (this.f48471a) {
            try {
                String strA = a();
                if (strA != null) {
                    return strA;
                }
                return b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public String readToken() {
        synchronized (this.f48471a) {
            try {
                String[] strArr = f48470c;
                int i10 = 0;
                while (true) {
                    String string = null;
                    if (i10 >= 4) {
                        return null;
                    }
                    String str = strArr[i10];
                    String string2 = this.f48471a.getString("|T|" + this.f48472b + "|" + str, null);
                    if (string2 != null && !string2.isEmpty()) {
                        if (string2.startsWith("{")) {
                            try {
                                string = new JSONObject(string2).getString("token");
                            } catch (JSONException unused) {
                            }
                            string2 = string;
                        }
                        return string2;
                    }
                    i10++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public IidStore(@NonNull SharedPreferences sharedPreferences, @Nullable String str) {
        this.f48471a = sharedPreferences;
        this.f48472b = str;
    }
}
