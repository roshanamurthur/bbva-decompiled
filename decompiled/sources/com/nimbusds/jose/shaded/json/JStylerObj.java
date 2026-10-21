package com.nimbusds.jose.shaded.json;

import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public final class JStylerObj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f62769a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f62770b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f62771c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f62772d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f62773e = new a();

    public interface MustProtect {
        boolean mustBeProtect(String str);
    }

    public interface StringProtector {
        void escape(String str, Appendable appendable);
    }

    public static class a implements StringProtector {
        @Override // com.nimbusds.jose.shaded.json.JStylerObj.StringProtector
        public final void escape(String str, Appendable appendable) {
            try {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '\f') {
                        appendable.append("\\f");
                    } else if (cCharAt == '\r') {
                        appendable.append("\\r");
                    } else if (cCharAt == '\"') {
                        appendable.append("\\\"");
                    } else if (cCharAt == '/') {
                        appendable.append("\\/");
                    } else if (cCharAt != '\\') {
                        switch (cCharAt) {
                            case '\b':
                                appendable.append("\\b");
                                break;
                            case '\t':
                                appendable.append("\\t");
                                break;
                            case '\n':
                                appendable.append("\\n");
                                break;
                            default:
                                if ((cCharAt < 0 || cCharAt > 31) && ((cCharAt < 127 || cCharAt > 159) && (cCharAt < 8192 || cCharAt > 8447))) {
                                    appendable.append(cCharAt);
                                } else {
                                    appendable.append("\\u");
                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> '\f') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> '\b') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> 4) & 15));
                                    appendable.append("0123456789ABCDEF".charAt(cCharAt & 15));
                                }
                                break;
                        }
                    } else {
                        appendable.append("\\\\");
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Error");
            }
        }
    }

    public static class b implements StringProtector {
        @Override // com.nimbusds.jose.shaded.json.JStylerObj.StringProtector
        public final void escape(String str, Appendable appendable) {
            try {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '\f') {
                        appendable.append("\\f");
                    } else if (cCharAt == '\r') {
                        appendable.append("\\r");
                    } else if (cCharAt == '\"') {
                        appendable.append("\\\"");
                    } else if (cCharAt != '\\') {
                        switch (cCharAt) {
                            case '\b':
                                appendable.append("\\b");
                                break;
                            case '\t':
                                appendable.append("\\t");
                                break;
                            case '\n':
                                appendable.append("\\n");
                                break;
                            default:
                                if ((cCharAt < 0 || cCharAt > 31) && ((cCharAt < 127 || cCharAt > 159) && (cCharAt < 8192 || cCharAt > 8447))) {
                                    appendable.append(cCharAt);
                                } else {
                                    appendable.append("\\u");
                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> '\f') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> '\b') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> 4) & 15));
                                    appendable.append("0123456789ABCDEF".charAt(cCharAt & 15));
                                }
                                break;
                        }
                    } else {
                        appendable.append("\\\\");
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Exeption");
            }
        }
    }

    public static class c implements MustProtect {
        @Override // com.nimbusds.jose.shaded.json.JStylerObj.MustProtect
        public final boolean mustBeProtect(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0 || str.trim() != str) {
                return true;
            }
            char cCharAt = str.charAt(0);
            if (JStylerObj.b(cCharAt) || JStylerObj.c(cCharAt)) {
                return true;
            }
            for (int i10 = 1; i10 < length; i10++) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 == '}' || cCharAt2 == ']' || cCharAt2 == ',' || cCharAt2 == ':' || JStylerObj.c(cCharAt2)) {
                    return true;
                }
            }
            if (JStylerObj.a(str)) {
                return true;
            }
            char cCharAt3 = str.charAt(0);
            if ((cCharAt3 >= '0' && cCharAt3 <= '9') || cCharAt3 == '-') {
                int i11 = 1;
                while (i11 < length) {
                    cCharAt3 = str.charAt(i11);
                    if (cCharAt3 < '0' || cCharAt3 > '9') {
                        break;
                    }
                    i11++;
                }
                if (i11 == length) {
                    return true;
                }
                if (cCharAt3 == '.') {
                    i11++;
                }
                while (i11 < length) {
                    cCharAt3 = str.charAt(i11);
                    if (cCharAt3 < '0' || cCharAt3 > '9') {
                        break;
                    }
                    i11++;
                }
                if (i11 == length) {
                    return true;
                }
                if (cCharAt3 == 'E' || cCharAt3 == 'e') {
                    int i12 = i11 + 1;
                    if (i12 == length) {
                        return false;
                    }
                    char cCharAt4 = str.charAt(i12);
                    if (cCharAt4 == '+' || cCharAt4 == '-') {
                        i11 += 2;
                        str.charAt(i11);
                    } else {
                        i11 = i12;
                    }
                }
                if (i11 == length) {
                    return false;
                }
                while (i11 < length) {
                    char cCharAt5 = str.charAt(i11);
                    if (cCharAt5 < '0' || cCharAt5 > '9') {
                        break;
                    }
                    i11++;
                }
                if (i11 == length) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class d implements MustProtect {
        @Override // com.nimbusds.jose.shaded.json.JStylerObj.MustProtect
        public final boolean mustBeProtect(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0 || str.trim() != str) {
                return true;
            }
            char cCharAt = str.charAt(0);
            if ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '-') {
                return true;
            }
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 == '\r' || cCharAt2 == '\n' || cCharAt2 == '\t' || cCharAt2 == ' ' || JStylerObj.b(cCharAt2) || cCharAt2 == '\b' || cCharAt2 == '\f' || cCharAt2 == '\n' || JStylerObj.c(cCharAt2)) {
                    return true;
                }
            }
            return JStylerObj.a(str);
        }
    }

    public static class e implements MustProtect {
        @Override // com.nimbusds.jose.shaded.json.JStylerObj.MustProtect
        public final boolean mustBeProtect(String str) {
            return true;
        }
    }

    public static boolean a(String str) {
        if (str.length() < 3) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'n') {
            return str.equals(AbstractJsonLexerKt.NULL);
        }
        if (cCharAt == 't') {
            return str.equals("true");
        }
        if (cCharAt == 'f') {
            return str.equals("false");
        }
        if (cCharAt == 'N') {
            return str.equals("NaN");
        }
        return false;
    }

    public static boolean b(char c10) {
        return c10 == '{' || c10 == '[' || c10 == ',' || c10 == '}' || c10 == ']' || c10 == ':' || c10 == '\'' || c10 == '\"';
    }

    public static boolean c(char c10) {
        return (c10 >= 0 && c10 <= 31) || (c10 >= 127 && c10 <= 159) || (c10 >= 8192 && c10 <= 8447);
    }
}
