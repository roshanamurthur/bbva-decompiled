package com.huawei.hms.feature.f.b;

import android.text.TextUtils;
import com.huawei.hms.feature.utils.Logger;
import com.huawei.secure.android.common.util.SafeString;
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
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50276a = "X509CertUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50277b = "X.509";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f50278c = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f50279d = "OU";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f50280e = "CN";

    private static String a(String str, String str2) {
        int iIndexOf = str.toUpperCase(Locale.getDefault()).indexOf(str2 + "=");
        if (iIndexOf == -1) {
            return null;
        }
        int iIndexOf2 = str.indexOf(",", iIndexOf);
        int length = str2.length() + iIndexOf + 1;
        return iIndexOf2 != -1 ? SafeString.substring(str, length, iIndexOf2) : SafeString.substring(str, length);
    }

    public static List<X509Certificate> b(String str) {
        return TextUtils.isEmpty(str) ? new ArrayList() : b(c(str));
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
            Logger.e(f50276a, "Failed to getCertChain,JSONException:", e5);
            return Collections.emptyList();
        }
    }

    private static X509Certificate a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(a.a(str));
    }

    private static List<X509Certificate> b(List<String> list) {
        if (list == null) {
            Logger.w(f50276a, "base64 CertChain is null.");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            X509Certificate x509CertificateA = a(it.next());
            if (x509CertificateA == null) {
                Logger.e(f50276a, "Failed to get cert from CertChain");
            } else {
                arrayList.add(x509CertificateA);
            }
        }
        return arrayList;
    }

    public static X509Certificate a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
            if (certificateGenerateCertificate instanceof X509Certificate) {
                return (X509Certificate) certificateGenerateCertificate;
            }
        } catch (CertificateException e5) {
            Logger.e(f50276a, "Failed to get cert,CertificateException:", e5);
        }
        return null;
    }

    public static boolean b(X509Certificate x509Certificate, String str) {
        return a(x509Certificate, f50279d, str);
    }

    private static boolean a(X509Certificate x509Certificate) {
        if (x509Certificate == null || x509Certificate.getBasicConstraints() == -1) {
            return false;
        }
        return x509Certificate.getKeyUsage()[5];
    }

    public static boolean a(X509Certificate x509Certificate, String str) {
        return a(x509Certificate, "CN", str);
    }

    private static boolean a(X509Certificate x509Certificate, String str, String str2) {
        if (x509Certificate == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str2.equals(a(x509Certificate.getSubjectDN().getName(), str));
    }

    public static boolean a(X509Certificate x509Certificate, List<X509Certificate> list) {
        String str;
        if (list.size() == 0 || x509Certificate == null) {
            return false;
        }
        try {
            x509Certificate.checkValidity();
            PublicKey publicKey = x509Certificate.getPublicKey();
            for (int size = list.size() - 1; size >= 0; size--) {
                try {
                    X509Certificate x509Certificate2 = list.get(size);
                    x509Certificate2.verify(publicKey);
                    x509Certificate2.checkValidity();
                    publicKey = x509Certificate2.getPublicKey();
                } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException | CertificateException e5) {
                    e = e5;
                    str = "verify failed,Exception:";
                    Logger.e(f50276a, str, e);
                    return false;
                }
            }
            return a(list);
        } catch (CertificateExpiredException | CertificateNotYetValidException e7) {
            e = e7;
            str = "verifyCertChain Exception:";
        }
    }

    public static boolean a(X509Certificate x509Certificate, byte[] bArr, byte[] bArr2) {
        if (x509Certificate == null || bArr == null || bArr2 == null) {
            Logger.w(f50276a, "checkSignature parameter is null");
            return false;
        }
        try {
            Signature signature = Signature.getInstance(x509Certificate.getSigAlgName());
            signature.initVerify(x509Certificate.getPublicKey());
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e5) {
            Logger.e(f50276a, "failed checkSignature,Exception:", e5);
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
