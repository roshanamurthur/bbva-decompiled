package com.huawei.appgallery.serviceverifykit.d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import java.io.ByteArrayInputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public class c {
    private static String a(String str, String str2) {
        int iIndexOf = str.toUpperCase(Locale.getDefault()).indexOf(str2 + "=");
        if (iIndexOf == -1) {
            return null;
        }
        int iIndexOf2 = str.indexOf(",", iIndexOf);
        int length = str2.length() + iIndexOf + 1;
        return iIndexOf2 != -1 ? str.substring(length, iIndexOf2) : str.substring(length);
    }

    public static List<X509Certificate> b(String str) {
        return b(c(str));
    }

    private static List<String> c(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 1) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(jSONArray.getString(i10));
            }
            return arrayList;
        } catch (JSONException e5) {
            com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("X509CertUtil", "Failed to getCertChain: " + e5.getMessage());
            return Collections.emptyList();
        }
    }

    public static X509Certificate a(Context context) {
        com.huawei.appgallery.serviceverifykit.d.d.b bVar;
        String str;
        ApplicationInfo applicationInfo;
        com.huawei.appgallery.serviceverifykit.d.d.b bVar2;
        String str2;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e5) {
            e = e5;
            bVar = com.huawei.appgallery.serviceverifykit.d.d.b.f50131b;
            str = "PackageInfo with NameNotFoundException:";
            bVar.a("X509CertUtil", str, e);
            applicationInfo = null;
        } catch (Exception e7) {
            e = e7;
            bVar = com.huawei.appgallery.serviceverifykit.d.d.b.f50131b;
            str = "PackageInfo with Exception:";
            bVar.a("X509CertUtil", str, e);
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null) {
                bVar2 = com.huawei.appgallery.serviceverifykit.d.d.b.f50131b;
                str2 = "failed getCBGRootCA metaData is null";
            } else {
                String string = bundle.getString("componentverify_ag_cbg_root");
                if (!TextUtils.isEmpty(string)) {
                    return a(string);
                }
                bVar2 = com.huawei.appgallery.serviceverifykit.d.d.b.f50131b;
                str2 = "failed getCBGRootCA sdkCbgRoot is null";
            }
        } else {
            bVar2 = com.huawei.appgallery.serviceverifykit.d.d.b.f50131b;
            str2 = "failed getCBGRootCA packageInfo is null";
        }
        bVar2.a("X509CertUtil", str2);
        return null;
    }

    private static List<X509Certificate> b(List<String> list) {
        if (list == null) {
            com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.c("X509CertUtil", "base64 CertChain is null.");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            X509Certificate x509CertificateA = a(it.next());
            if (x509CertificateA == null) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("X509CertUtil", "Failed to get cert from CertChain");
            } else {
                arrayList.add(x509CertificateA);
            }
        }
        return arrayList;
    }

    private static X509Certificate a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(a.a(str));
    }

    public static boolean b(X509Certificate x509Certificate, String str) {
        return a(x509Certificate, "OU", str);
    }

    private static X509Certificate a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                Certificate certificateGenerateCertificate = CertificateFactory.getInstance(ConstantKt.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(bArr));
                if (certificateGenerateCertificate instanceof X509Certificate) {
                    return (X509Certificate) certificateGenerateCertificate;
                }
            } catch (CertificateException e5) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("X509CertUtil", "Failed to get cert: " + e5.getMessage());
            }
        }
        return null;
    }

    private static boolean a(X509Certificate x509Certificate) {
        if (x509Certificate == null || x509Certificate.getBasicConstraints() == -1) {
            return false;
        }
        return x509Certificate.getKeyUsage()[5];
    }

    public static boolean a(X509Certificate x509Certificate, String str) {
        return a(x509Certificate, LoginHelperConstants.CLIENT_STATUS_CANCELLED_BY_BUSINESS, str);
    }

    private static boolean a(X509Certificate x509Certificate, String str, String str2) {
        if (x509Certificate == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str2.equals(a(x509Certificate.getSubjectDN().getName(), str));
    }

    public static boolean a(X509Certificate x509Certificate, List<X509Certificate> list) {
        if (list != null && list.size() != 0) {
            if (x509Certificate == null) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("X509CertUtil", "rootCert is null,verify failed ");
                return false;
            }
            try {
                x509Certificate.checkValidity();
                PublicKey publicKey = x509Certificate.getPublicKey();
                for (int size = list.size() - 1; size >= 0; size--) {
                    X509Certificate x509Certificate2 = list.get(size);
                    if (x509Certificate2 != null) {
                        try {
                            x509Certificate2.verify(publicKey);
                            x509Certificate2.checkValidity();
                            publicKey = x509Certificate2.getPublicKey();
                        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException | CertificateException e5) {
                            com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("X509CertUtil", "verify failed " + e5.getMessage());
                        }
                    }
                    return false;
                }
                return a(list);
            } catch (CertificateExpiredException | CertificateNotYetValidException e7) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("X509CertUtil", "verifyCertChain Exception:" + e7.getMessage());
            }
        }
        return false;
    }

    public static boolean a(X509Certificate x509Certificate, byte[] bArr, byte[] bArr2) {
        if (x509Certificate == null || bArr == null || bArr2 == null || bArr2.length == 0) {
            com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.c("X509CertUtil", "checkSignature parameter is null");
            return false;
        }
        try {
            Signature signature = Signature.getInstance(x509Certificate.getSigAlgName());
            signature.initVerify(x509Certificate.getPublicKey());
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e5) {
            com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("X509CertUtil", "failed checkSignature,Exception:", e5);
            return false;
        }
    }

    private static boolean a(List<X509Certificate> list) {
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (!a(list.get(i10))) {
                return false;
            }
        }
        return true;
    }
}
