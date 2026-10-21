package javax.mail.internet;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes12.dex */
public class HeaderTokenizer {
    public static final String MIME = "()<>@,;:\\\"\t []/?=";
    public static final String RFC822 = "()<>@,;:\\\"\t .[]";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Token f78956h = new Token(-4, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f78961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f78962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f78963g;

    public static class Token {
        public static final int ATOM = -1;
        public static final int COMMENT = -3;
        public static final int EOF = -4;
        public static final int QUOTEDSTRING = -2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f78964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f78965b;

        public Token(int i10, String str) {
            this.f78964a = i10;
            this.f78965b = str;
        }

        public int getType() {
            return this.f78964a;
        }

        public String getValue() {
            return this.f78965b;
        }
    }

    public HeaderTokenizer(String str, String str2, boolean z10) {
        str = str == null ? "" : str;
        this.f78957a = str;
        this.f78958b = z10;
        this.f78959c = str2;
        this.f78963g = 0;
        this.f78962f = 0;
        this.f78960d = 0;
        this.f78961e = str.length();
    }

    public static String b(String str, int i10, int i11, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = false;
        boolean z12 = false;
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\n' && z11) {
                z11 = false;
            } else if (z12) {
                if (z10) {
                    sb2.append(AbstractJsonLexerKt.STRING_ESC);
                }
                sb2.append(cCharAt);
                z11 = false;
                z12 = false;
            } else if (cCharAt == '\\') {
                z11 = false;
                z12 = true;
            } else if (cCharAt == '\r') {
                z11 = true;
            } else {
                sb2.append(cCharAt);
                z11 = false;
            }
            i10++;
        }
        return sb2.toString();
    }

    public static String e(String str) {
        int length = str.length() - 1;
        while (length >= 0) {
            char cCharAt = str.charAt(length);
            if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                break;
            }
            length--;
        }
        return length <= 0 ? "" : str.substring(0, length + 1);
    }

    public final Token a(char c10, boolean z10) throws ParseException {
        int i10 = this.f78960d;
        boolean z11 = false;
        while (true) {
            int i11 = this.f78960d;
            int i12 = this.f78961e;
            String str = this.f78957a;
            if (i11 >= i12) {
                if (c10 != '\"') {
                    return new Token(-2, e(z11 ? b(str, i10, i11, z10) : str.substring(i10, i11)));
                }
                throw new ParseException("Unbalanced quoted string");
            }
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\\') {
                this.f78960d++;
            } else {
                if (cCharAt != '\r') {
                    if (cCharAt == c10) {
                        int i13 = this.f78960d;
                        this.f78960d = i13 + 1;
                        String strB = z11 ? b(str, i10, i13, z10) : str.substring(i10, i13);
                        if (cCharAt != '\"') {
                            strB = e(strB);
                            this.f78960d--;
                        }
                        return new Token(-2, strB);
                    }
                }
                this.f78960d++;
            }
            z11 = true;
            this.f78960d++;
        }
    }

    public final Token c(char c10, boolean z10) throws ParseException {
        int i10 = this.f78960d;
        Token token = f78956h;
        int i11 = this.f78961e;
        if (i10 >= i11 || d() == -4) {
            return token;
        }
        int i12 = this.f78960d;
        String str = this.f78957a;
        char cCharAt = str.charAt(i12);
        boolean z11 = false;
        while (cCharAt == '(') {
            int i13 = this.f78960d + 1;
            this.f78960d = i13;
            int i14 = 1;
            while (i14 > 0) {
                int i15 = this.f78960d;
                if (i15 >= i11) {
                    break;
                }
                char cCharAt2 = str.charAt(i15);
                if (cCharAt2 == '\\') {
                    this.f78960d++;
                } else {
                    if (cCharAt2 != '\r') {
                        if (cCharAt2 == '(') {
                            i14++;
                        } else if (cCharAt2 == ')') {
                            i14--;
                        }
                    }
                    this.f78960d++;
                }
                z11 = true;
                this.f78960d++;
            }
            if (i14 != 0) {
                throw new ParseException("Unbalanced comments");
            }
            if (!this.f78958b) {
                return new Token(-3, z11 ? b(str, i13, this.f78960d - 1, z10) : str.substring(i13, this.f78960d - 1));
            }
            if (d() == -4) {
                return token;
            }
            cCharAt = str.charAt(this.f78960d);
        }
        if (cCharAt == '\"') {
            this.f78960d++;
            return a('\"', z10);
        }
        if (cCharAt >= ' ' && cCharAt < 127) {
            String str2 = this.f78959c;
            if (str2.indexOf(cCharAt) < 0) {
                int i16 = this.f78960d;
                while (true) {
                    int i17 = this.f78960d;
                    if (i17 >= i11) {
                        break;
                    }
                    char cCharAt3 = str.charAt(i17);
                    if (cCharAt3 < ' ' || cCharAt3 >= 127 || cCharAt3 == '(' || cCharAt3 == ' ' || cCharAt3 == '\"' || str2.indexOf(cCharAt3) >= 0) {
                        if (c10 <= 0 || cCharAt3 == c10) {
                            break;
                            break;
                        }
                        this.f78960d = i16;
                        return a(c10, z10);
                    }
                    this.f78960d++;
                }
                return new Token(-1, str.substring(i16, this.f78960d));
            }
        }
        if (c10 > 0 && cCharAt != c10) {
            return a(c10, z10);
        }
        this.f78960d++;
        return new Token(cCharAt, new String(new char[]{cCharAt}));
    }

    public final int d() {
        while (true) {
            int i10 = this.f78960d;
            if (i10 >= this.f78961e) {
                return -4;
            }
            char cCharAt = this.f78957a.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                return this.f78960d;
            }
            this.f78960d++;
        }
    }

    public String getRemainder() {
        int i10 = this.f78962f;
        String str = this.f78957a;
        if (i10 >= str.length()) {
            return null;
        }
        return str.substring(this.f78962f);
    }

    public Token next() throws ParseException {
        return next((char) 0, false);
    }

    public Token peek() throws ParseException {
        this.f78960d = this.f78963g;
        Token tokenC = c((char) 0, false);
        this.f78963g = this.f78960d;
        return tokenC;
    }

    public Token next(char c10) throws ParseException {
        return next(c10, false);
    }

    public Token next(char c10, boolean z10) throws ParseException {
        this.f78960d = this.f78962f;
        Token tokenC = c(c10, z10);
        int i10 = this.f78960d;
        this.f78963g = i10;
        this.f78962f = i10;
        return tokenC;
    }

    public HeaderTokenizer(String str, String str2) {
        this(str, str2, true);
    }

    public HeaderTokenizer(String str) {
        this(str, RFC822);
    }
}
