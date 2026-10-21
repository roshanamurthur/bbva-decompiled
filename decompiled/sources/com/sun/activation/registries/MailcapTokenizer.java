package com.sun.activation.registries;

import com.adobe.marketing.mobile.EventDataKeys;

/* JADX INFO: loaded from: classes9.dex */
public class MailcapTokenizer {
    public static final int EOI_TOKEN = 5;
    public static final int EQUALS_TOKEN = 61;
    public static final int SEMICOLON_TOKEN = 59;
    public static final int SLASH_TOKEN = 47;
    public static final int START_TOKEN = 1;
    public static final int STRING_TOKEN = 2;
    public static final int UNKNOWN_TOKEN = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65211a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f65213c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f65212b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f65214d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f65215e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f65216f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final char f65217g = ';';

    public MailcapTokenizer(String str) {
        this.f65211a = str;
        this.f65213c = str.length();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0028 A[FALL_THROUGH, ORIG_RETURN, RETURN] */
    public static boolean a(char c10) {
        if (c10 != '\"' && c10 != ',' && c10 != '/' && c10 != '(' && c10 != ')') {
            switch (c10) {
                default:
                    switch (c10) {
                        default:
                            if (!Character.isISOControl(c10) && !Character.isWhitespace(c10)) {
                                return true;
                            }
                        case '[':
                        case '\\':
                        case ']':
                            return false;
                    }
                case ':':
                case ';':
                case '<':
                case '=':
                case '>':
                case '?':
                case '@':
                    return false;
            }
        }
        return false;
    }

    public static String nameForToken(int i10) {
        if (i10 == 0) {
            return "unknown";
        }
        if (i10 == 1) {
            return EventDataKeys.Lifecycle.LIFECYCLE_START;
        }
        if (i10 == 2) {
            return "string";
        }
        if (i10 == 5) {
            return "EOI";
        }
        if (i10 == 47) {
            return "'/'";
        }
        if (i10 != 59) {
            return i10 != 61 ? "really unknown" : "'='";
        }
        return "';'";
    }

    public int getCurrentToken() {
        return this.f65214d;
    }

    public String getCurrentTokenValue() {
        return this.f65215e;
    }

    public int nextToken() {
        String str;
        int i10;
        int i11 = this.f65212b;
        int i12 = this.f65213c;
        if (i11 < i12) {
            while (true) {
                int i13 = this.f65212b;
                str = this.f65211a;
                if (i13 >= i12 || !Character.isWhitespace(str.charAt(i13))) {
                    break;
                }
                this.f65212b++;
            }
            int i14 = this.f65212b;
            if (i14 < i12) {
                char cCharAt = str.charAt(i14);
                int i15 = 0;
                if (this.f65216f) {
                    if (cCharAt == ';' || cCharAt == '=') {
                        this.f65214d = cCharAt;
                        this.f65215e = new Character(cCharAt).toString();
                        this.f65212b++;
                    } else {
                        int i16 = this.f65212b;
                        boolean z10 = false;
                        while (true) {
                            i10 = this.f65212b;
                            if (i10 >= i12 || z10) {
                                break;
                            }
                            if (str.charAt(i10) != this.f65217g) {
                                this.f65212b++;
                            } else {
                                z10 = true;
                            }
                        }
                        this.f65214d = 2;
                        String strSubstring = str.substring(i16, i10);
                        int length = strSubstring.length();
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.ensureCapacity(length);
                        while (i15 < length) {
                            char cCharAt2 = strSubstring.charAt(i15);
                            if (cCharAt2 != '\\') {
                                stringBuffer.append(cCharAt2);
                            } else if (i15 < length - 1) {
                                i15++;
                                stringBuffer.append(strSubstring.charAt(i15));
                            } else {
                                stringBuffer.append(cCharAt2);
                            }
                            i15++;
                        }
                        this.f65215e = stringBuffer.toString();
                    }
                } else if (a(cCharAt)) {
                    int i17 = this.f65212b;
                    while (true) {
                        int i18 = this.f65212b;
                        if (i18 >= i12 || !a(str.charAt(i18))) {
                            break;
                        }
                        this.f65212b++;
                    }
                    this.f65214d = 2;
                    this.f65215e = str.substring(i17, this.f65212b);
                } else if (cCharAt == '/' || cCharAt == ';' || cCharAt == '=') {
                    this.f65214d = cCharAt;
                    this.f65215e = new Character(cCharAt).toString();
                    this.f65212b++;
                } else {
                    this.f65214d = 0;
                    this.f65215e = new Character(cCharAt).toString();
                    this.f65212b++;
                }
            } else {
                this.f65214d = 5;
                this.f65215e = null;
            }
        } else {
            this.f65214d = 5;
            this.f65215e = null;
        }
        return this.f65214d;
    }

    public void setIsAutoquoting(boolean z10) {
        this.f65216f = z10;
    }
}
