package com.huawei.hms.feature.broadcast;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.huawei.hms.feature.utils.Logger;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50199a = "LocalApk-FeatureCompat";

    private static X509Certificate a(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e5) {
            Logger.e("LocalApk-FeatureCompat", "Get X509Certificate failed.", e5);
            return null;
        }
    }

    public static ArrayList<X509Certificate> b(Context context) {
        ArrayList<X509Certificate> arrayList = new ArrayList<>();
        Signature[] signatureArrA = a(context);
        if (signatureArrA == null) {
            Logger.e("LocalApk-FeatureCompat", "signatures is null");
            return arrayList;
        }
        for (Signature signature : signatureArrA) {
            arrayList.add(a(signature));
        }
        return arrayList;
    }

    public static boolean a(Context context, com.huawei.hms.feature.dynamicinstall.h hVar) throws IOException {
        String str;
        File fileH = hVar.h();
        if (fileH == null) {
            str = "Unverified directory is null.";
        } else {
            ArrayList<X509Certificate> arrayListB = b(context);
            if (arrayListB.isEmpty()) {
                str = "App certificates is empty";
            } else {
                File[] fileArrListFiles = fileH.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        Logger.d("LocalApk-FeatureCompat", "check signature " + file.getName());
                        try {
                            if (!a(file.getCanonicalPath(), arrayListB)) {
                                Logger.e("LocalApk-FeatureCompat", "Split verification failed. delete the apkfile: " + file.getName());
                                file.delete();
                                return false;
                            }
                            File fileB = hVar.b(file);
                            Logger.d("LocalApk-FeatureCompat", "rename file dest " + fileB.getCanonicalPath());
                            if (!file.renameTo(fileB)) {
                                str = "Write verified split failed.";
                            }
                        } catch (Exception unused) {
                            Logger.e("LocalApk-FeatureCompat", "Split verification failed. delete the apkfile: " + file.getName());
                            if (file.exists()) {
                                file.delete();
                            }
                            return false;
                        }
                    }
                    return true;
                }
                str = "get unVerifyDir files failed";
            }
        }
        Logger.e("LocalApk-FeatureCompat", str);
        return false;
    }

    public static boolean a(Context context, File file) {
        if (file == null) {
            Logger.i("LocalApk-FeatureCompat", "begin check split apk file, split apk file is null");
            return false;
        }
        Logger.i("LocalApk-FeatureCompat", "begin check split apk file " + file.getName());
        try {
            return a(file.getCanonicalPath(), b(context));
        } catch (IOException e5) {
            Logger.w("LocalApk-FeatureCompat", "begin check split apk file, get path failed", e5);
            return false;
        }
    }

    public static final boolean a(com.huawei.hms.feature.dynamicinstall.h hVar, List<Intent> list) throws IOException {
        Iterator<Intent> it = list.iterator();
        while (it.hasNext()) {
            String stringExtra = it.next().getStringExtra(com.huawei.hms.feature.model.b.f50442l);
            if (!TextUtils.isEmpty(stringExtra) && !hVar.i(stringExtra).exists()) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(String str, List<X509Certificate> list) {
        try {
            X509Certificate[][] x509CertificateArrA = com.huawei.hms.feature.h.c.a(str);
            if (x509CertificateArrA == null || x509CertificateArrA.length == 0 || x509CertificateArrA[0].length == 0) {
                Logger.e("LocalApk-FeatureCompat", "Downloaded split " + str + " is not signed.");
                return false;
            }
            if (list.isEmpty()) {
                Logger.e("LocalApk-FeatureCompat", "No certificates found for app.");
                return false;
            }
            for (X509Certificate x509Certificate : list) {
                int length = x509CertificateArrA.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        Logger.i("LocalApk-FeatureCompat", "The split signature is not match with app");
                        return false;
                    }
                    if (x509CertificateArrA[i10][0].equals(x509Certificate)) {
                        break;
                    }
                    i10++;
                }
            }
            return true;
        } catch (Exception unused) {
            Logger.e("LocalApk-FeatureCompat", "Downloaded split " + str + " is not signed.");
            return false;
        }
    }

    private static Signature[] a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
        } catch (PackageManager.NameNotFoundException | RuntimeException e5) {
            Logger.e("LocalApk-FeatureCompat", "Get Signatures failed.", e5);
            return null;
        }
    }
}
