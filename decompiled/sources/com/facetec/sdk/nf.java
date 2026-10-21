package com.facetec.sdk;

import androidx.webkit.ProxyConfig;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class nf implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nf f42683a = new nf();

    private nf() {
    }

    private static boolean a(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator<String> it = b(x509Certificate, 2).iterator();
        while (it.hasNext()) {
            if (e(lowerCase, it.next())) {
                return true;
            }
        }
        return false;
    }

    private static List<String> b(X509Certificate x509Certificate, int i10) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i10 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    public static boolean d(String str, X509Certificate x509Certificate) {
        return kz.d(str) ? e(str, x509Certificate) : a(str, x509Certificate);
    }

    private static boolean e(String str, X509Certificate x509Certificate) {
        List<String> listB = b(x509Certificate, 7);
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (str.equalsIgnoreCase(listB.get(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return d(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    public static List<String> e(X509Certificate x509Certificate) {
        List<String> listB = b(x509Certificate, 7);
        List<String> listB2 = b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listB2.size() + listB.size());
        arrayList.addAll(listB);
        arrayList.addAll(listB2);
        return arrayList;
    }

    private static boolean e(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(Constant.DOT_STRING) && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(Constant.DOT_STRING) && !str2.endsWith("..")) {
            if (!str.endsWith(Constant.DOT_STRING)) {
                str = str.concat(Constant.DOT_STRING);
            }
            if (!str2.endsWith(Constant.DOT_STRING)) {
                str2 = str2.concat(Constant.DOT_STRING);
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains(ProxyConfig.MATCH_ALL_SCHEMES)) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String strSubstring = lowerCase.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }
}
