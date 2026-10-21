package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;
import xe.u;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzs {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.play.core.splitinstall.internal.zzu f46369c = new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallInfoProvider");
    public static final /* synthetic */ int zza = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46371b;

    public zzs(Context context, String str) {
        this.f46370a = context;
        this.f46371b = str;
    }

    public static final HashSet b(PackageInfo packageInfo) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        com.google.android.play.core.splitinstall.internal.zzu zzuVar = f46369c;
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                zzuVar.zza("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            zzuVar.zza("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            zzuVar.zza("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        zzq zzqVar = (zzq) zzr.f46368a.get();
        if (zzqVar != null) {
            hashSet.addAll(zzqVar.zza());
        }
        return hashSet;
    }

    public static String zzb(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    public static boolean zze(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final Set zzf(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        for (String str : b(packageInfo)) {
            if (!zze(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    @Nullable
    public final PackageInfo a() {
        try {
            return this.f46370a.getPackageManager().getPackageInfo(this.f46371b, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            f46369c.zzb("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    @Nullable
    public final zzk zza(@Nullable Bundle bundle) {
        zzk zzkVarZzb = null;
        com.google.android.play.core.splitinstall.internal.zzu zzuVar = f46369c;
        if (bundle == null) {
            zzuVar.zze("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i10 = bundle.getInt("com.android.vending.splits");
        if (i10 == 0) {
            zzuVar.zze("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            XmlResourceParser xml = this.f46370a.getResources().getXml(i10);
            zzi zziVar = new zzi();
            while (xml.next() != 1) {
                try {
                    if (xml.getEventType() == 2) {
                        if (xml.getName().equals("splits")) {
                            while (xml.next() != 3) {
                                if (xml.getEventType() == 2) {
                                    if (xml.getName().equals("module")) {
                                        String strA = u.a("name", xml);
                                        if (strA != null) {
                                            while (xml.next() != 3) {
                                                if (xml.getEventType() == 2) {
                                                    if (xml.getName().equals("language")) {
                                                        while (xml.next() != 3) {
                                                            if (xml.getEventType() == 2) {
                                                                if (xml.getName().equals("entry")) {
                                                                    String strA2 = u.a("key", xml);
                                                                    String strA3 = u.a("split", xml);
                                                                    u.b(xml);
                                                                    if (strA2 != null && strA3 != null) {
                                                                        zziVar.zza(strA, strA2, strA3);
                                                                    }
                                                                } else {
                                                                    u.b(xml);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        u.b(xml);
                                                    }
                                                }
                                            }
                                        } else {
                                            u.b(xml);
                                        }
                                    } else {
                                        u.b(xml);
                                    }
                                }
                            }
                        } else {
                            u.b(xml);
                        }
                    }
                } catch (IOException | IllegalStateException | XmlPullParserException unused) {
                }
            }
            zzkVarZzb = zziVar.zzb();
            if (zzkVarZzb == null) {
                zzuVar.zze("Can't parse languages metadata.", new Object[0]);
            }
            return zzkVarZzb;
        } catch (Resources.NotFoundException unused2) {
            zzuVar.zze("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    public final Set zzc() {
        PackageInfo packageInfoA = a();
        return (packageInfoA == null || packageInfoA.applicationInfo == null) ? new HashSet() : zzf(packageInfoA);
    }

    @Nullable
    public final Set zzd() {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfoA = a();
        HashSet hashSet = null;
        if (packageInfoA != null && (applicationInfo = packageInfoA.applicationInfo) != null) {
            zzk zzkVarZza = zza(applicationInfo.metaData);
            if (zzkVarZza == null) {
                return null;
            }
            hashSet = new HashSet();
            HashSet hashSetB = b(packageInfoA);
            hashSetB.add("");
            Set setZzf = zzf(packageInfoA);
            setZzf.add("");
            for (Map.Entry entry : zzkVarZza.zza(setZzf).entrySet()) {
                if (hashSetB.containsAll((Collection) entry.getValue())) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        return hashSet;
    }

    public zzs(Context context) {
        this.f46370a = context;
        this.f46371b = context.getPackageName();
    }
}
