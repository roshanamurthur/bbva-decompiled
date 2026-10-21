package com.bbva.proguarded.android.sslpinning;

import androidx.camera.camera2.internal.h0;
import androidx.webkit.ProxyConfig;
import com.bbva.sl.ar.android.sslpinning.result.CheckResult;
import com.bbva.sl.ar.android.sslpinning.result.ResultLevel;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes8.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f36169a;

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        f36169a = strArr;
        Arrays.sort(strArr);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x012e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final CheckResult a(String str, String[] strArr, String[] strArr2, boolean z10) {
        boolean zEndsWith;
        String str2;
        LinkedList linkedList = new LinkedList();
        if (strArr != null && strArr.length > 0 && (str2 = strArr[0]) != null) {
            linkedList.add(str2);
        }
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                if (str3 != null) {
                    linkedList.add(str3);
                }
            }
        }
        if (linkedList.isEmpty()) {
            return new CheckResult(ResultLevel.FAILED, 602, h0.b("Certificate for host [", str, "] doesn't contain CN or DNS subjectAlt"));
        }
        StringBuilder sb2 = new StringBuilder();
        String lowerCase = str.trim().toLowerCase(Locale.US);
        if (lowerCase != null && s.b(lowerCase)) {
            try {
                lowerCase = InetAddress.getByName(lowerCase).getHostAddress();
            } catch (UnknownHostException unused) {
            }
        }
        Iterator it = linkedList.iterator();
        boolean zEquals = false;
        while (it.hasNext()) {
            String lowerCase2 = ((String) it.next()).toLowerCase(Locale.US);
            sb2.append(" <");
            sb2.append(lowerCase2);
            sb2.append(Typography.greater);
            if (it.hasNext()) {
                sb2.append(" OR");
            }
            String[] strArrSplit = lowerCase2.split("\\.");
            if (strArrSplit.length < 3 || !strArrSplit[0].endsWith(ProxyConfig.MATCH_ALL_SCHEMES)) {
                if (s.b(lowerCase2)) {
                    try {
                        lowerCase2 = InetAddress.getByName(lowerCase2).getHostAddress();
                    } catch (UnknownHostException unused2) {
                    }
                }
                zEquals = lowerCase.equals(lowerCase2);
            } else {
                String[] strArrSplit2 = lowerCase2.split("\\.");
                if ((strArrSplit2.length == 3 && strArrSplit2[2].length() == 2 && Arrays.binarySearch(f36169a, strArrSplit2[1]) >= 0) || s.a(str) || s.b(str)) {
                    if (s.b(lowerCase2)) {
                        lowerCase2 = InetAddress.getByName(lowerCase2).getHostAddress();
                    }
                    zEquals = lowerCase.equals(lowerCase2);
                } else {
                    String str4 = strArrSplit[0];
                    if (str4.length() > 1) {
                        String strC = androidx.databinding.e.c(str4, 1, 0);
                        zEndsWith = lowerCase.startsWith(strC) && lowerCase.substring(strC.length()).endsWith(lowerCase2.substring(str4.length()));
                    } else {
                        zEndsWith = lowerCase.endsWith(lowerCase2.substring(1));
                    }
                    if (zEndsWith && z10) {
                        int i10 = 0;
                        for (int i11 = 0; i11 < lowerCase.length(); i11++) {
                            if (lowerCase.charAt(i11) == '.') {
                                i10++;
                            }
                        }
                        int i12 = 0;
                        for (int i13 = 0; i13 < lowerCase2.length(); i13++) {
                            if (lowerCase2.charAt(i13) == '.') {
                                i12++;
                            }
                        }
                        zEndsWith = i10 == i12;
                    }
                    zEquals = zEndsWith;
                }
            }
            if (zEquals) {
                break;
            }
        }
        if (zEquals) {
            return CheckResult.OK();
        }
        return new CheckResult(ResultLevel.FAILED, 601, "Hostname verification failed for host [" + str + "] against [" + ((Object) sb2) + "].");
    }

    public static String[] a(X509Certificate x509Certificate) {
        LinkedList linkedList = new LinkedList();
        StringTokenizer stringTokenizer = new StringTokenizer(x509Certificate.getSubjectX500Principal().toString(), ",+");
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if (strTrim.length() > 3 && strTrim.substring(0, 3).equalsIgnoreCase("CN=")) {
                linkedList.add(strTrim.substring(3));
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    public static String[] a(X509Certificate x509Certificate, String str) {
        Collection<List<?>> subjectAlternativeNames;
        int i10 = (str == null || !(s.a(str) || s.b(str))) ? 2 : 7;
        LinkedList linkedList = new LinkedList();
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
            subjectAlternativeNames = null;
        }
        if (subjectAlternativeNames != null) {
            for (List<?> list : subjectAlternativeNames) {
                if (((Integer) list.get(0)).intValue() == i10) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }
}
