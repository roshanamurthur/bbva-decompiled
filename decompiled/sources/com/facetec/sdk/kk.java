package com.facetec.sdk;

import androidx.webkit.ProxyConfig;
import com.bbva.cellswidgets.MaskTextWatcher;
import com.fasterxml.jackson.core.JsonPointer;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes9.dex */
public final class kk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f42040d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f42041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f42042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final List<String> f42043c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f42044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f42045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f42046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final String f42047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f42048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f42049j;

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        String f42050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        String f42051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f42052c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f42053d = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42054e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final List<String> f42055f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        String f42056i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        List<String> f42057j;

        public e() {
            ArrayList arrayList = new ArrayList();
            this.f42055f = arrayList;
            arrayList.add("");
        }

        private static boolean a(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void d(String str, int i10, int i11) throws Throwable {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f42055f.clear();
                this.f42055f.add("");
                i10++;
            } else {
                List<String> list = this.f42055f;
                list.set(list.size() - 1, "");
            }
            while (i10 < i11) {
                int iA = kz.a(str, i10, i11, "/\\");
                boolean z10 = iA < i11;
                b(str, i10, iA, z10);
                if (z10) {
                    iA++;
                }
                i10 = iA;
            }
        }

        private static int h(String str, int i10, int i11) {
            try {
                int i12 = Integer.parseInt(kk.d(str, i10, i11, "", false, false, false, true, null));
                if (i12 <= 0 || i12 > 65535) {
                    return -1;
                }
                return i12;
            } catch (NumberFormatException unused) {
            }
        }

        public final int b() {
            int i10 = this.f42054e;
            return i10 != -1 ? i10 : kk.b(this.f42051b);
        }

        public final kk c() {
            if (this.f42051b == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f42050a != null) {
                return new kk(this);
            }
            throw new IllegalStateException("host == null");
        }

        public final e e(@Nullable String str) {
            this.f42057j = str != null ? kk.a(kk.d(str, HttpUrl.QUERY_ENCODE_SET, true, false, true, true)) : null;
            return this;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f42051b;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (!this.f42052c.isEmpty() || !this.f42053d.isEmpty()) {
                sb2.append(this.f42052c);
                if (!this.f42053d.isEmpty()) {
                    sb2.append(AbstractJsonLexerKt.COLON);
                    sb2.append(this.f42053d);
                }
                sb2.append('@');
            }
            String str2 = this.f42050a;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb2.append(this.f42050a);
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                } else {
                    sb2.append(this.f42050a);
                }
            }
            if (this.f42054e != -1 || this.f42051b != null) {
                int iB = b();
                String str3 = this.f42051b;
                if (str3 == null || iB != kk.b(str3)) {
                    sb2.append(AbstractJsonLexerKt.COLON);
                    sb2.append(iB);
                }
            }
            kk.b(sb2, this.f42055f);
            if (this.f42057j != null) {
                sb2.append('?');
                kk.e(sb2, this.f42057j);
            }
            if (this.f42056i != null) {
                sb2.append(MaskTextWatcher.WILDCARD);
                sb2.append(this.f42056i);
            }
            return sb2.toString();
        }

        private void b(String str, int i10, int i11, boolean z10) throws Throwable {
            String strD = kk.d(str, i10, i11, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, true, null);
            if (c(strD)) {
                return;
            }
            if (a(strD)) {
                a();
                return;
            }
            if (((String) androidx.emoji2.text.flatbuffer.a.b(this.f42055f, 1)).isEmpty()) {
                List<String> list = this.f42055f;
                list.set(list.size() - 1, strD);
            } else {
                this.f42055f.add(strD);
            }
            if (z10) {
                this.f42055f.add("");
            }
        }

        private static int e(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i10);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private void a() {
            List<String> list = this.f42055f;
            if (list.remove(list.size() - 1).isEmpty() && !this.f42055f.isEmpty()) {
                List<String> list2 = this.f42055f;
                list2.set(list2.size() - 1, "");
            } else {
                this.f42055f.add("");
            }
        }

        public final e c(@Nullable kk kkVar, String str) throws Throwable {
            int iA;
            int i10;
            int iB = kz.b(str, 0, str.length());
            int iC = kz.c(str, iB, str.length());
            int iE = e(str, iB, iC);
            if (iE != -1) {
                if (str.regionMatches(true, iB, "https:", 0, 6)) {
                    this.f42051b = ProxyConfig.MATCH_HTTPS;
                    iB += 6;
                } else if (str.regionMatches(true, iB, "http:", 0, 5)) {
                    this.f42051b = ProxyConfig.MATCH_HTTP;
                    iB += 5;
                } else {
                    StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    sb2.append(str.substring(0, iE));
                    sb2.append("'");
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else if (kkVar != null) {
                this.f42051b = kkVar.f42042b;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int iA2 = a(str, iB, iC);
            char c10 = '?';
            char c11 = MaskTextWatcher.WILDCARD;
            if (iA2 < 2 && kkVar != null && kkVar.f42042b.equals(this.f42051b)) {
                this.f42052c = kkVar.e();
                this.f42053d = kkVar.c();
                this.f42050a = kkVar.f42041a;
                this.f42054e = kkVar.f42044e;
                this.f42055f.clear();
                this.f42055f.addAll(kkVar.f());
                if (iB == iC || str.charAt(iB) == '#') {
                    e(kkVar.g());
                }
            } else {
                boolean z10 = false;
                boolean z11 = false;
                int i11 = iB + iA2;
                while (true) {
                    iA = kz.a(str, i11, iC, "@/\\?#");
                    byte bCharAt = iA != iC ? str.charAt(iA) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c11 || bCharAt == 47 || bCharAt == 92 || bCharAt == c10) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z10) {
                            int iB2 = kz.b(str, i11, iA, AbstractJsonLexerKt.COLON);
                            i10 = iA;
                            String strD = kk.d(str, i11, iB2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(this.f42052c);
                                sb3.append("%40");
                                sb3.append(strD);
                                strD = sb3.toString();
                            }
                            this.f42052c = strD;
                            if (iB2 != i10) {
                                this.f42053d = kk.d(str, iB2 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            }
                            z11 = true;
                        } else {
                            i10 = iA;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(this.f42053d);
                            sb4.append("%40");
                            sb4.append(kk.d(str, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f42053d = sb4.toString();
                        }
                        i11 = i10 + 1;
                        c10 = '?';
                        c11 = MaskTextWatcher.WILDCARD;
                    }
                }
                int iC2 = c(str, i11, iA);
                int i12 = iC2 + 1;
                if (i12 < iA) {
                    this.f42050a = b(str, i11, iC2);
                    int iH = h(str, i12, iA);
                    this.f42054e = iH;
                    if (iH == -1) {
                        StringBuilder sb5 = new StringBuilder("Invalid URL port: \"");
                        sb5.append(str.substring(i12, iA));
                        sb5.append('\"');
                        throw new IllegalArgumentException(sb5.toString());
                    }
                } else {
                    this.f42050a = b(str, i11, iC2);
                    this.f42054e = kk.b(this.f42051b);
                }
                if (this.f42050a == null) {
                    StringBuilder sb6 = new StringBuilder("Invalid URL host: \"");
                    sb6.append(str.substring(i11, iC2));
                    sb6.append('\"');
                    throw new IllegalArgumentException(sb6.toString());
                }
                iB = iA;
            }
            int iA3 = kz.a(str, iB, iC, "?#");
            d(str, iB, iA3);
            if (iA3 < iC && str.charAt(iA3) == '?') {
                int iB3 = kz.b(str, iA3, iC, MaskTextWatcher.WILDCARD);
                this.f42057j = kk.a(kk.d(str, iA3 + 1, iB3, HttpUrl.QUERY_ENCODE_SET, true, false, true, true, null));
                iA3 = iB3;
            }
            if (iA3 < iC && str.charAt(iA3) == '#') {
                this.f42056i = kk.d(str, 1 + iA3, iC, "", true, false, false, false, null);
            }
            return this;
        }

        private static int a(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        public static String b(String str, int i10, int i11) {
            return kz.b(kk.d(str, i10, i11, false));
        }

        private static boolean c(String str) {
            return str.equals(Constant.DOT_STRING) || str.equalsIgnoreCase("%2e");
        }

        private static int c(String str, int i10, int i11) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == ':') {
                    return i10;
                }
                if (cCharAt == '[') {
                    do {
                        i10++;
                        if (i10 >= i11) {
                            break;
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            return i11;
        }
    }

    public kk(e eVar) {
        this.f42042b = eVar.f42051b;
        this.f42049j = a(eVar.f42052c, false);
        this.f42046g = a(eVar.f42053d, false);
        this.f42041a = eVar.f42050a;
        this.f42044e = eVar.b();
        this.f42045f = b(eVar.f42055f, false);
        List<String> list = eVar.f42057j;
        this.f42043c = list != null ? b(list, true) : null;
        String str = eVar.f42056i;
        this.f42047h = str != null ? a(str, false) : null;
        this.f42048i = eVar.toString();
    }

    public final boolean a() {
        return this.f42042b.equals(ProxyConfig.MATCH_HTTPS);
    }

    public final String b() {
        return this.f42042b;
    }

    public final String c() {
        if (this.f42046g.isEmpty()) {
            return "";
        }
        return this.f42048i.substring(this.f42048i.indexOf(58, this.f42042b.length() + 3) + 1, this.f42048i.indexOf(64));
    }

    @Nullable
    public final e d(String str) {
        try {
            return new e().c(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String e() {
        if (this.f42049j.isEmpty()) {
            return "";
        }
        int length = this.f42042b.length() + 3;
        String str = this.f42048i;
        return this.f42048i.substring(length, kz.a(str, length, str.length(), ":@"));
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof kk) && ((kk) obj).f42048i.equals(this.f42048i);
    }

    public final List<String> f() {
        int iIndexOf = this.f42048i.indexOf(47, this.f42042b.length() + 3);
        String str = this.f42048i;
        int iA = kz.a(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iA) {
            int i10 = iIndexOf + 1;
            int iB = kz.b(this.f42048i, i10, iA, JsonPointer.SEPARATOR);
            arrayList.add(this.f42048i.substring(i10, iB));
            iIndexOf = iB;
        }
        return arrayList;
    }

    @Nullable
    public final String g() {
        if (this.f42043c == null) {
            return null;
        }
        int iIndexOf = this.f42048i.indexOf(63) + 1;
        String str = this.f42048i;
        return this.f42048i.substring(iIndexOf, kz.b(str, iIndexOf, str.length(), MaskTextWatcher.WILDCARD));
    }

    public final String h() {
        int iIndexOf = this.f42048i.indexOf(47, this.f42042b.length() + 3);
        String str = this.f42048i;
        return this.f42048i.substring(iIndexOf, kz.a(str, iIndexOf, str.length(), "?#"));
    }

    public final int hashCode() {
        return this.f42048i.hashCode();
    }

    public final String i() {
        return this.f42041a;
    }

    public final int j() {
        return this.f42044e;
    }

    public final String toString() {
        return this.f42048i;
    }

    public static List<String> a(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iIndexOf = str.indexOf(38, i10);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i10);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i10, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i10, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i10 = iIndexOf + 1;
        }
        return arrayList;
    }

    public static int b(String str) {
        if (str.equals(ProxyConfig.MATCH_HTTP)) {
            return 80;
        }
        return str.equals(ProxyConfig.MATCH_HTTPS) ? 443 : -1;
    }

    public static String d(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                nb nbVar = new nb();
                nbVar.b(str, i10, i12);
                e(nbVar, str, i12, i11, z10);
                return nbVar.m();
            }
        }
        return str.substring(i10, i11);
    }

    public static void b(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(JsonPointer.SEPARATOR);
            sb2.append(list.get(i10));
        }
    }

    private static boolean c(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && kz.d(str.charAt(i10 + 1)) != -1 && kz.d(str.charAt(i12)) != -1;
    }

    public static void e(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append(Typography.amp);
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
        }
    }

    private static List<String> b(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? a(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String d(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws Throwable {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i12 = 43;
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z10 && (!z11 || c(str, iCharCount, i11)))) && (iCodePointAt != 43 || !z12)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                nb nbVar = new nb();
                nbVar.b(str, i10, iCharCount);
                nb nbVar2 = null;
                while (iCharCount < i11) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z10 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == i12 && z12) {
                            nbVar.e(z10 ? "+" : "%2B");
                        } else if (iCodePointAt2 >= 32 && iCodePointAt2 != 127 && ((iCodePointAt2 < 128 || !z13) && str2.indexOf(iCodePointAt2) == -1 && (iCodePointAt2 != 37 || (z10 && (!z11 || c(str, iCharCount, i11)))))) {
                            nbVar.d(iCodePointAt2);
                        } else {
                            if (nbVar2 == null) {
                                nbVar2 = new nb();
                            }
                            if (charset != null && !charset.equals(kz.f42210e)) {
                                int iCharCount2 = Character.charCount(iCodePointAt2) + iCharCount;
                                if (iCharCount < 0) {
                                    throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(iCharCount)));
                                }
                                if (iCharCount2 >= iCharCount) {
                                    if (iCharCount2 <= str.length()) {
                                        if (charset.equals(nv.f42731c)) {
                                            nbVar2.b(str, iCharCount, iCharCount2);
                                        } else {
                                            byte[] bytes = str.substring(iCharCount, iCharCount2).getBytes(charset);
                                            nbVar2.c(bytes, 0, bytes.length);
                                        }
                                    } else {
                                        StringBuilder sbC = androidx.appcompat.widget.o1.c("endIndex > string.length: ", iCharCount2, " > ");
                                        sbC.append(str.length());
                                        throw new IllegalArgumentException(sbC.toString());
                                    }
                                } else {
                                    StringBuilder sb2 = new StringBuilder("endIndex < beginIndex: ");
                                    sb2.append(iCharCount2);
                                    sb2.append(" < ");
                                    sb2.append(iCharCount);
                                    throw new IllegalArgumentException(sb2.toString());
                                }
                            } else {
                                nbVar2.d(iCodePointAt2);
                            }
                            while (!nbVar2.c()) {
                                byte bF = nbVar2.f();
                                nbVar.h(37);
                                char[] cArr = f42040d;
                                nbVar.h((int) cArr[((bF & 255) >> 4) & 15]);
                                nbVar.h((int) cArr[bF & 15]);
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i12 = 43;
                }
                return nbVar.m();
            }
        }
        return str.substring(i10, i11);
    }

    private static String a(String str, boolean z10) {
        return d(str, 0, str.length(), z10);
    }

    public static kk e(String str) {
        return new e().c(null, str).c();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    private static void e(nb nbVar, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                int iD = kz.d(str.charAt(i10 + 1));
                int iD2 = kz.d(str.charAt(i12));
                if (iD != -1 && iD2 != -1) {
                    nbVar.h((iD << 4) + iD2);
                    i10 = i12;
                } else {
                    nbVar.d(iCodePointAt);
                }
            } else if (iCodePointAt == 43 && z10) {
                nbVar.h(32);
            } else {
                nbVar.d(iCodePointAt);
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static String e(String str, String str2, Charset charset) {
        return d(str, 0, str.length(), str2, false, false, true, true, charset);
    }

    public static String d(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return d(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }

    public final URI d() {
        e eVar = new e();
        eVar.f42051b = this.f42042b;
        eVar.f42052c = e();
        eVar.f42053d = c();
        eVar.f42050a = this.f42041a;
        eVar.f42054e = this.f42044e != b(this.f42042b) ? this.f42044e : -1;
        eVar.f42055f.clear();
        eVar.f42055f.addAll(f());
        eVar.e(g());
        eVar.f42056i = this.f42047h == null ? null : this.f42048i.substring(this.f42048i.indexOf(35) + 1);
        int size = eVar.f42055f.size();
        for (int i10 = 0; i10 < size; i10++) {
            eVar.f42055f.set(i10, d(eVar.f42055f.get(i10), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, true));
        }
        List<String> list = eVar.f42057j;
        if (list != null) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String str = eVar.f42057j.get(i11);
                if (str != null) {
                    eVar.f42057j.set(i11, d(str, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, true));
                }
            }
        }
        String str2 = eVar.f42056i;
        if (str2 != null) {
            eVar.f42056i = d(str2, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, false);
        }
        String string = eVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e5) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e5);
            }
        }
    }
}
