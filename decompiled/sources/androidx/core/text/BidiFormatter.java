package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class BidiFormatter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f20105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f20106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f20107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BidiFormatter f20108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BidiFormatter f20109h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextDirectionHeuristicCompat f20112c;

    public static class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final byte[] f20116e = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharSequence f20117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20119c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public char f20120d;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f20116e[i10] = Character.getDirectionality(i10);
            }
        }

        public a(CharSequence charSequence) {
            this.f20117a = charSequence;
            this.f20118b = charSequence.length();
        }

        public final byte a() {
            int i10 = this.f20119c - 1;
            CharSequence charSequence = this.f20117a;
            char cCharAt = charSequence.charAt(i10);
            this.f20120d = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(charSequence, this.f20119c);
                this.f20119c -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f20119c--;
            char c10 = this.f20120d;
            return c10 < 1792 ? f20116e[c10] : Character.getDirectionality(c10);
        }
    }

    static {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        f20105d = textDirectionHeuristicCompat;
        f20106e = Character.toString((char) 8206);
        f20107f = Character.toString((char) 8207);
        f20108g = new BidiFormatter(false, 2, textDirectionHeuristicCompat);
        f20109h = new BidiFormatter(true, 2, textDirectionHeuristicCompat);
    }

    public BidiFormatter(boolean z10, int i10, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        this.f20110a = z10;
        this.f20111b = i10;
        this.f20112c = textDirectionHeuristicCompat;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.f20119c = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = aVar.f20119c;
            if (i13 < aVar.f20118b && i10 == 0) {
                CharSequence charSequence2 = aVar.f20117a;
                char cCharAt = charSequence2.charAt(i13);
                aVar.f20120d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, aVar.f20119c);
                    aVar.f20119c = Character.charCount(iCodePointAt) + aVar.f20119c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    aVar.f20119c++;
                    char c10 = aVar.f20120d;
                    directionality = c10 < 1792 ? a.f20116e[c10] : Character.getDirectionality(c10);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
        }
        if (i10 == 0) {
            return 0;
        }
        if (i11 != 0) {
            return i11;
        }
        while (aVar.f20119c > 0) {
            switch (aVar.a()) {
                case 14:
                case 15:
                    if (i10 == i12) {
                        return -1;
                    }
                    i12--;
                    break;
                case 16:
                case 17:
                    if (i10 == i12) {
                        return 1;
                    }
                    i12--;
                    break;
                case 18:
                    i12++;
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f20119c = aVar.f20118b;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            while (aVar.f20119c > 0) {
                byte bA = aVar.a();
                if (bA == 0) {
                    if (i10 == 0) {
                        return -1;
                    }
                    if (i11 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i10 == 0) {
                        return 1;
                    }
                    if (i11 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i11 == i10) {
                                return -1;
                            }
                            i10--;
                            break;
                        case 16:
                        case 17:
                            if (i11 == i10) {
                                return 1;
                            }
                            i10--;
                            break;
                        case 18:
                            i10++;
                            break;
                        default:
                            if (i11 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public static BidiFormatter getInstance() {
        return new Builder().build();
    }

    public boolean getStereoReset() {
        return (this.f20111b & 2) != 0;
    }

    public boolean isRtl(String str) {
        return isRtl((CharSequence) str);
    }

    public boolean isRtlContext() {
        return this.f20110a;
    }

    public String unicodeWrap(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z10) {
        if (str == null) {
            return null;
        }
        return unicodeWrap((CharSequence) str, textDirectionHeuristicCompat, z10).toString();
    }

    public static BidiFormatter getInstance(boolean z10) {
        return new Builder(z10).build();
    }

    public boolean isRtl(CharSequence charSequence) {
        return this.f20112c.isRtl(charSequence, 0, charSequence.length());
    }

    public CharSequence unicodeWrap(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z10) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean stereoReset = getStereoReset();
        String str2 = "";
        String str3 = f20107f;
        String str4 = f20106e;
        boolean z11 = this.f20110a;
        if (stereoReset && z10) {
            boolean zIsRtl2 = (zIsRtl ? TextDirectionHeuristicsCompat.RTL : TextDirectionHeuristicsCompat.LTR).isRtl(charSequence, 0, charSequence.length());
            if (z11 || !(zIsRtl2 || a(charSequence) == 1)) {
                str = (!z11 || (zIsRtl2 && a(charSequence) != -1)) ? "" : str3;
            } else {
                str = str4;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (zIsRtl != z11) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            boolean zIsRtl3 = (zIsRtl ? TextDirectionHeuristicsCompat.RTL : TextDirectionHeuristicsCompat.LTR).isRtl(charSequence, 0, charSequence.length());
            if (!z11 && (zIsRtl3 || b(charSequence) == 1)) {
                str2 = str4;
            } else if (z11 && (!zIsRtl3 || b(charSequence) == -1)) {
                str2 = str3;
            }
            spannableStringBuilder.append((CharSequence) str2);
        }
        return spannableStringBuilder;
    }

    public static BidiFormatter getInstance(Locale locale) {
        return new Builder(locale).build();
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f20113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextDirectionHeuristicCompat f20115c;

        public Builder() {
            Locale locale = Locale.getDefault();
            TextDirectionHeuristicCompat textDirectionHeuristicCompat = BidiFormatter.f20105d;
            this.f20113a = TextUtilsCompat.getLayoutDirectionFromLocale(locale) == 1;
            this.f20115c = BidiFormatter.f20105d;
            this.f20114b = 2;
        }

        public BidiFormatter build() {
            if (this.f20114b == 2 && this.f20115c == BidiFormatter.f20105d) {
                return this.f20113a ? BidiFormatter.f20109h : BidiFormatter.f20108g;
            }
            return new BidiFormatter(this.f20113a, this.f20114b, this.f20115c);
        }

        public Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
            this.f20115c = textDirectionHeuristicCompat;
            return this;
        }

        public Builder stereoReset(boolean z10) {
            if (z10) {
                this.f20114b |= 2;
            } else {
                this.f20114b &= -3;
            }
            return this;
        }

        public Builder(boolean z10) {
            this.f20113a = z10;
            this.f20115c = BidiFormatter.f20105d;
            this.f20114b = 2;
        }

        public Builder(Locale locale) {
            TextDirectionHeuristicCompat textDirectionHeuristicCompat = BidiFormatter.f20105d;
            this.f20113a = TextUtilsCompat.getLayoutDirectionFromLocale(locale) == 1;
            this.f20115c = BidiFormatter.f20105d;
            this.f20114b = 2;
        }
    }

    public String unicodeWrap(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        return unicodeWrap(str, textDirectionHeuristicCompat, true);
    }

    public CharSequence unicodeWrap(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        return unicodeWrap(charSequence, textDirectionHeuristicCompat, true);
    }

    public String unicodeWrap(String str, boolean z10) {
        return unicodeWrap(str, this.f20112c, z10);
    }

    public CharSequence unicodeWrap(CharSequence charSequence, boolean z10) {
        return unicodeWrap(charSequence, this.f20112c, z10);
    }

    public String unicodeWrap(String str) {
        return unicodeWrap(str, this.f20112c, true);
    }

    public CharSequence unicodeWrap(CharSequence charSequence) {
        return unicodeWrap(charSequence, this.f20112c, true);
    }
}
