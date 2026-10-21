package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import xf.u;

/* JADX INFO: loaded from: classes10.dex */
public class IdManager implements InstallIdProvider {
    public static final String DEFAULT_VERSION_NAME = "0.0";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f47763g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f47764h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f47765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f47766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseInstallationsApi f47768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DataCollectionArbiter f47769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InstallIdProvider.InstallIds f47770f;

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionArbiter dataCollectionArbiter) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f47766b = context;
        this.f47767c = str;
        this.f47768d = firebaseInstallationsApi;
        this.f47769e = dataCollectionArbiter;
        this.f47765a = new u();
    }

    @NonNull
    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        String string = UUID.randomUUID().toString();
        lowerCase = string == null ? null : f47763g.matcher(string).replaceAll("").toLowerCase(Locale.US);
        Logger.getLogger().v("Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    @Nullable
    @VisibleForTesting(otherwise = 3)
    public String fetchTrueFid() {
        try {
            return (String) Utils.awaitEvenIfOnMainThread(this.f47768d.getId());
        } catch (Exception e5) {
            Logger.getLogger().w("Failed to retrieve Firebase Installation ID.", e5);
            return null;
        }
    }

    public String getAppIdentifier() {
        return this.f47767c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider
    @NonNull
    public synchronized InstallIdProvider.InstallIds getInstallIds() {
        InstallIdProvider.InstallIds installIds = this.f47770f;
        if (installIds != null && (installIds.getFirebaseInstallationId() != null || !this.f47769e.isAutomaticDataCollectionEnabled())) {
            return this.f47770f;
        }
        Logger.getLogger().v("Determining Crashlytics installation ID...");
        SharedPreferences sharedPrefs = CommonUtils.getSharedPrefs(this.f47766b);
        String string = sharedPrefs.getString("firebase.installation.id", null);
        Logger.getLogger().v("Cached Firebase Installation ID: " + string);
        if (this.f47769e.isAutomaticDataCollectionEnabled()) {
            String strFetchTrueFid = fetchTrueFid();
            Logger.getLogger().v("Fetched Firebase Installation ID: " + strFetchTrueFid);
            if (strFetchTrueFid == null) {
                if (string == null) {
                    strFetchTrueFid = "SYN_" + UUID.randomUUID().toString();
                } else {
                    strFetchTrueFid = string;
                }
            }
            if (strFetchTrueFid.equals(string)) {
                this.f47770f = new a(sharedPrefs.getString("crashlytics.installation.id", null), strFetchTrueFid);
            } else {
                this.f47770f = new a(a(sharedPrefs, strFetchTrueFid), strFetchTrueFid);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f47770f = InstallIdProvider.InstallIds.createWithoutFid(a(sharedPrefs, "SYN_" + UUID.randomUUID().toString()));
        } else {
            this.f47770f = InstallIdProvider.InstallIds.createWithoutFid(sharedPrefs.getString("crashlytics.installation.id", null));
        }
        Logger.getLogger().v("Install IDs: " + this.f47770f);
        return this.f47770f;
    }

    public String getInstallerPackageName() {
        String str;
        u uVar = this.f47765a;
        Context context = this.f47766b;
        synchronized (uVar) {
            try {
                if (uVar.f94639a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    uVar.f94639a = installerPackageName;
                }
                str = "".equals(uVar.f94639a) ? null : uVar.f94639a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public String getModelName() {
        Locale locale = Locale.US;
        String str = Build.MANUFACTURER;
        String str2 = f47764h;
        return String.format(locale, "%s/%s", str.replaceAll(str2, ""), Build.MODEL.replaceAll(str2, ""));
    }

    public String getOsBuildVersionString() {
        return Build.VERSION.INCREMENTAL.replaceAll(f47764h, "");
    }

    public String getOsDisplayVersionString() {
        return Build.VERSION.RELEASE.replaceAll(f47764h, "");
    }
}
