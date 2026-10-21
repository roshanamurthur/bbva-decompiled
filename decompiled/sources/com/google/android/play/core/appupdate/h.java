package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.play.core.appupdate.internal.zzi;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.android.play.core.appupdate.internal.zzz;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzm f46042e = new zzm("AppUpdateService");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Intent f46043f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    @VisibleForTesting
    public final zzx f46044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f46046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f46047d;

    public h(Context context, i iVar) {
        this.f46045b = context.getPackageName();
        this.f46046c = context;
        this.f46047d = iVar;
        if (com.google.android.play.core.appupdate.internal.zzab.zza(context)) {
            this.f46044a = new zzx(zzz.zza(context), f46042e, "AppUpdateService", f46043f, zzl.zza, null);
        }
    }

    public static /* bridge */ /* synthetic */ Bundle a(h hVar, String str) {
        Integer numValueOf;
        Context context = hVar.f46046c;
        Bundle bundle = new Bundle();
        bundle.putAll(b());
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f46042e.zzb("The current version of the app could not be retrieved", new Object[0]);
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }

    public static Bundle b() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Map mapZza = zzi.zza("app_update");
        bundle2.putInt("playcore_version_code", ((Integer) mapZza.get("java")).intValue());
        if (mapZza.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) mapZza.get("native")).intValue());
        }
        if (mapZza.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) mapZza.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }
}
