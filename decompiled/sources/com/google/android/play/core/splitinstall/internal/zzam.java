package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.Nullable;
import com.google.android.play.core.splitcompat.zza;
import com.google.android.play.core.splitcompat.zze;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zze f46303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f46304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzal f46305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public PackageInfo f46306d;

    public zzam(Context context, zze zzeVar, zzah zzahVar) {
        zzal zzalVar = new zzal(new zza(zzeVar));
        this.f46303a = zzeVar;
        this.f46304b = context;
        this.f46305c = zzalVar;
    }

    @Nullable
    public final PackageInfo a() {
        Context context = this.f46304b;
        if (this.f46306d == null) {
            try {
                this.f46306d = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.f46306d;
    }

    public final boolean zza(File[] fileArr) throws XmlPullParserException, IOException {
        zzal zzalVar;
        PackageInfo packageInfoA = a();
        long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfoA.getLongVersionCode() : packageInfoA.versionCode;
        AssetManager assetManager = (AssetManager) zzbk.zzc(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            File file = fileArr[length];
            zzalVar = this.f46305c;
            zzalVar.zzb(assetManager, file);
        } while (longVersionCode == zzalVar.zza());
        return false;
    }

    public final boolean zzb(List list) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.f46303a.zzg(((Intent) it.next()).getStringExtra(com.huawei.hms.feature.model.b.f50442l)).exists()) {
                return false;
            }
        }
        return true;
    }

    public final boolean zzc(File[] fileArr) {
        X509Certificate x509Certificate;
        PackageInfo packageInfoA = a();
        ArrayList<X509Certificate> arrayList = null;
        if (packageInfoA != null && packageInfoA.signatures != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Signature signature : packageInfoA.signatures) {
                try {
                    x509Certificate = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                } catch (CertificateException unused) {
                    x509Certificate = null;
                }
                if (x509Certificate != null) {
                    arrayList2.add(x509Certificate);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                X509Certificate[][] x509CertificateArrZza = zzi.zza(fileArr[length].getAbsolutePath());
                if (x509CertificateArrZza == null || x509CertificateArrZza.length == 0 || x509CertificateArrZza[0].length == 0 || arrayList.isEmpty()) {
                    break;
                    break;
                    break;
                    break;
                }
                for (X509Certificate x509Certificate2 : arrayList) {
                    for (X509Certificate[] x509CertificateArr : x509CertificateArrZza) {
                        if (!x509CertificateArr[0].equals(x509Certificate2)) {
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }
}
