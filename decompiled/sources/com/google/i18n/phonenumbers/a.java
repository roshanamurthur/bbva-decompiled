package com.google.i18n.phonenumbers;

import androidx.camera.core.processing.f;
import androidx.collection.k;
import com.google.i18n.phonenumbers.internal.RegexCache;
import com.google.i18n.phonenumbers.metadata.DefaultMetadataDependenciesProvider;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: PhoneNumberMatcher.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements Iterator<PhoneNumberMatch> {
    public static final Pattern K0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final Pattern f49331y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final PhoneNumberUtil f49332p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CharSequence f49333q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f49334r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final PhoneNumberUtil.Leniency f49335s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public long f49336t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public b f49337u0 = b.NOT_READY;
    public PhoneNumberMatch v0 = null;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f49338w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final RegexCache f49339x0 = new RegexCache(32);
    public static final Pattern E0 = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    public static final Pattern F0 = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    public static final Pattern G0 = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$");
    public static final Pattern H0 = Pattern.compile(":[0-5]\\d");
    public static final Pattern[] J0 = {Pattern.compile("/+(.*)"), Pattern.compile("(\\([^(]*)"), Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"), Pattern.compile("[‒-―－]\\p{Z}*(.+)"), Pattern.compile("\\.+\\p{Z}*([^.]+)"), Pattern.compile("\\p{Z}+(\\P{Z}+)")};
    public static final Pattern I0 = Pattern.compile("(?:[(\\[（［])?(?:[^(\\[（［)\\]）］]+[)\\]）］])?[^(\\[（［)\\]）］]+(?:[(\\[（［][^(\\[（［)\\]）］]+[)\\]）］])" + f(0, 3) + "[^(\\[（［)\\]）］]*");

    /* JADX INFO: renamed from: com.google.i18n.phonenumbers.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PhoneNumberMatcher.java */
    public interface InterfaceC0220a {
        boolean a(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb2, String[] strArr);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: PhoneNumberMatcher.java */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b DONE;
        public static final b NOT_READY;
        public static final b READY;

        static {
            b bVar = new b("NOT_READY", 0);
            NOT_READY = bVar;
            b bVar2 = new b("READY", 1);
            READY = bVar2;
            b bVar3 = new b("DONE", 2);
            DONE = bVar3;
            $VALUES = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    static {
        String strF = f(0, 2);
        String strF2 = f(0, 4);
        String strF3 = f(0, 20);
        String strD = f.d("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]", strF2);
        String str = "\\p{Nd}" + f(1, 20);
        K0 = Pattern.compile("[(\\[（［+＋]");
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("(?:[(\\[（［+＋]", strD, ")", strF, str);
        k.e(sbC, "(?:", strD, str, ")");
        sbC.append(strF3);
        sbC.append("(?:");
        sbC.append(PhoneNumberUtil.f49247x);
        sbC.append(")?");
        f49331y0 = Pattern.compile(sbC.toString(), 66);
    }

    public a(PhoneNumberUtil phoneNumberUtil, String str, String str2, PhoneNumberUtil.Leniency leniency, long j10) {
        if (phoneNumberUtil == null || leniency == null) {
            throw null;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException();
        }
        this.f49332p0 = phoneNumberUtil;
        this.f49333q0 = str == null ? "" : str;
        this.f49334r0 = str2;
        this.f49335s0 = leniency;
        this.f49336t0 = j10;
    }

    public static boolean b(Phonenumber.PhoneNumber phoneNumber, String str) {
        int iIndexOf;
        int iIndexOf2 = str.indexOf(47);
        if (iIndexOf2 < 0 || (iIndexOf = str.indexOf(47, iIndexOf2 + 1)) < 0) {
            return false;
        }
        if ((phoneNumber.getCountryCodeSource() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN || phoneNumber.getCountryCodeSource() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN) && PhoneNumberUtil.normalizeDigitsOnly(str.substring(0, iIndexOf2)).equals(Integer.toString(phoneNumber.getCountryCode()))) {
            return str.substring(iIndexOf + 1).contains("/");
        }
        return true;
    }

    public static boolean c(Phonenumber.PhoneNumber phoneNumber, String str, PhoneNumberUtil phoneNumberUtil) {
        int i10 = 0;
        while (i10 < str.length() - 1) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == 'x' || cCharAt == 'X') {
                int i11 = i10 + 1;
                char cCharAt2 = str.charAt(i11);
                if (cCharAt2 == 'x' || cCharAt2 == 'X') {
                    if (phoneNumberUtil.isNumberMatch(phoneNumber, str.substring(i11)) != PhoneNumberUtil.MatchType.NSN_MATCH) {
                        return false;
                    }
                    i10 = i11;
                } else if (!PhoneNumberUtil.normalizeDigitsOnly(str.substring(i10)).equals(phoneNumber.getExtension())) {
                    return false;
                }
            }
            i10++;
        }
        return true;
    }

    public static boolean d(char c10) {
        if (!Character.isLetter(c10) && Character.getType(c10) != 6) {
            return false;
        }
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(c10);
        return unicodeBlockOf.equals(Character.UnicodeBlock.BASIC_LATIN) || unicodeBlockOf.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || unicodeBlockOf.equals(Character.UnicodeBlock.LATIN_EXTENDED_A) || unicodeBlockOf.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || unicodeBlockOf.equals(Character.UnicodeBlock.LATIN_EXTENDED_B) || unicodeBlockOf.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS);
    }

    public static boolean e(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber) {
        Phonemetadata.PhoneMetadata phoneMetadataM;
        Phonemetadata.NumberFormat numberFormatA;
        if (phoneNumber.getCountryCodeSource() != Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY || (phoneMetadataM = phoneNumberUtil.m(phoneNumberUtil.getRegionCodeForCountryCode(phoneNumber.getCountryCode()))) == null || (numberFormatA = phoneNumberUtil.a(phoneNumberUtil.getNationalSignificantNumber(phoneNumber), phoneMetadataM.getNumberFormatList())) == null || numberFormatA.getNationalPrefixFormattingRule().length() <= 0 || numberFormatA.getNationalPrefixOptionalWhenFormatting() || PhoneNumberUtil.j(numberFormatA.getNationalPrefixFormattingRule())) {
            return true;
        }
        return phoneNumberUtil.y(new StringBuilder(PhoneNumberUtil.normalizeDigitsOnly(phoneNumber.getRawInput())), phoneMetadataM, null);
    }

    public static String f(int i10, int i11) {
        if (i10 < 0 || i11 <= 0 || i11 < i10) {
            throw new IllegalArgumentException();
        }
        return k.c("{", i10, ",", i11, "}");
    }

    public static CharSequence h(Pattern pattern, CharSequence charSequence) {
        Matcher matcher = pattern.matcher(charSequence);
        return matcher.find() ? charSequence.subSequence(0, matcher.start()) : charSequence;
    }

    public final boolean a(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, InterfaceC0220a interfaceC0220a) {
        StringBuilder sbA = PhoneNumberUtil.A(charSequence, true);
        String str = phoneNumberUtil.format(phoneNumber, PhoneNumberUtil.PhoneNumberFormat.RFC3966);
        int iIndexOf = str.indexOf(59);
        if (iIndexOf < 0) {
            iIndexOf = str.length();
        }
        if (interfaceC0220a.a(phoneNumberUtil, phoneNumber, sbA, str.substring(str.indexOf(45) + 1, iIndexOf).split(Constant.DASH_STRING))) {
            return true;
        }
        Phonemetadata.PhoneMetadata formattingMetadataForCountryCallingCode = DefaultMetadataDependenciesProvider.getInstance().getAlternateFormatsMetadataSource().getFormattingMetadataForCountryCallingCode(phoneNumber.getCountryCode());
        String nationalSignificantNumber = phoneNumberUtil.getNationalSignificantNumber(phoneNumber);
        if (formattingMetadataForCountryCallingCode != null) {
            for (Phonemetadata.NumberFormat numberFormat : formattingMetadataForCountryCallingCode.getNumberFormatList()) {
                if (numberFormat.getLeadingDigitsPatternCount() <= 0 || this.f49339x0.getPatternForRegex(numberFormat.getLeadingDigitsPattern(0)).matcher(nationalSignificantNumber).lookingAt()) {
                    if (interfaceC0220a.a(phoneNumberUtil, phoneNumber, sbA, phoneNumberUtil.i(phoneNumberUtil.getNationalSignificantNumber(phoneNumber), numberFormat, PhoneNumberUtil.PhoneNumberFormat.RFC3966, null).split(Constant.DASH_STRING))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (d(r5) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.i18n.phonenumbers.PhoneNumberMatch g(int r9, java.lang.CharSequence r10) {
        /*
            r8 = this;
            com.google.i18n.phonenumbers.PhoneNumberUtil r0 = r8.f49332p0
            com.google.i18n.phonenumbers.PhoneNumberUtil$Leniency r1 = r8.f49335s0
            r2 = 0
            java.util.regex.Pattern r3 = com.google.i18n.phonenumbers.a.I0     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            java.util.regex.Matcher r3 = r3.matcher(r10)     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            boolean r3 = r3.matches()     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            if (r3 == 0) goto L8f
            java.util.regex.Pattern r3 = com.google.i18n.phonenumbers.a.E0     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            java.util.regex.Matcher r3 = r3.matcher(r10)     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            boolean r3 = r3.find()     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            if (r3 == 0) goto L1f
            goto L8f
        L1f:
            com.google.i18n.phonenumbers.PhoneNumberUtil$Leniency r3 = com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency.VALID     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            int r3 = r1.compareTo(r3)     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            if (r3 < 0) goto L70
            r3 = 26
            r4 = 37
            java.lang.CharSequence r5 = r8.f49333q0
            if (r9 <= 0) goto L51
            java.util.regex.Pattern r6 = com.google.i18n.phonenumbers.a.K0     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            java.util.regex.Matcher r6 = r6.matcher(r10)     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            boolean r6 = r6.lookingAt()     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            if (r6 != 0) goto L51
            int r6 = r9 + (-1)
            char r6 = r5.charAt(r6)     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            if (r6 == r4) goto L50
            int r7 = java.lang.Character.getType(r6)     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            if (r7 != r3) goto L4a
            goto L50
        L4a:
            boolean r6 = d(r6)     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            if (r6 == 0) goto L51
        L50:
            return r2
        L51:
            int r6 = r10.length()     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            int r6 = r6 + r9
            int r7 = r5.length()     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            if (r6 >= r7) goto L70
            char r5 = r5.charAt(r6)     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            if (r5 == r4) goto L6f
            int r4 = java.lang.Character.getType(r5)     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            if (r4 != r3) goto L69
            goto L6f
        L69:
            boolean r3 = d(r5)     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            if (r3 == 0) goto L70
        L6f:
            return r2
        L70:
            java.lang.String r3 = r8.f49334r0     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            com.google.i18n.phonenumbers.Phonenumber$PhoneNumber r3 = r0.parseAndKeepRawInput(r10, r3)     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            boolean r0 = r1.a(r3, r10, r0, r8)     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            if (r0 == 0) goto L8f
            r3.clearCountryCodeSource()     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            r3.clearRawInput()     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            r3.clearPreferredDomesticCarrierCode()     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            com.google.i18n.phonenumbers.PhoneNumberMatch r0 = new com.google.i18n.phonenumbers.PhoneNumberMatch     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            java.lang.String r10 = r10.toString()     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            r0.<init>(r9, r10, r3)     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L8f
            return r0
        L8f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.a.g(int, java.lang.CharSequence):com.google.i18n.phonenumbers.PhoneNumberMatch");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042 A[PHI: r5
      0x0042: PHI (r5v17 java.lang.CharSequence) = (r5v3 java.lang.CharSequence), (r5v6 java.lang.CharSequence), (r5v3 java.lang.CharSequence) binds: [B:10:0x0040, B:56:0x0042, B:16:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x006d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0042 A[SYNTHETIC] */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z10;
        PhoneNumberMatch phoneNumberMatch;
        PhoneNumberMatch phoneNumberMatchG;
        Pattern[] patternArr;
        int length;
        int i10;
        Matcher matcher;
        CharSequence charSequence;
        int i11 = 0;
        if (this.f49337u0 == b.NOT_READY) {
            int length2 = this.f49338w0;
            Pattern pattern = f49331y0;
            CharSequence charSequence2 = this.f49333q0;
            Matcher matcher2 = pattern.matcher(charSequence2);
            while (true) {
                phoneNumberMatch = null;
                if (this.f49336t0 <= 0 || !matcher2.find(length2)) {
                    z10 = true;
                    break;
                }
                int iStart = matcher2.start();
                CharSequence charSequenceH = h(PhoneNumberUtil.f49244u, charSequence2.subSequence(iStart, matcher2.end()));
                if (!F0.matcher(charSequenceH).find()) {
                    if (!G0.matcher(charSequenceH).find()) {
                        phoneNumberMatchG = g(iStart, charSequenceH);
                        if (phoneNumberMatchG != null) {
                            charSequence = charSequence2;
                            phoneNumberMatch = phoneNumberMatchG;
                        } else {
                            patternArr = J0;
                            length = patternArr.length;
                            i10 = i11;
                            while (true) {
                                if (i10 < length) {
                                    matcher = patternArr[i10].matcher(charSequenceH);
                                    int i12 = 1;
                                    while (true) {
                                        charSequence = charSequence2;
                                        if (matcher.find()) {
                                        }
                                        i10++;
                                        charSequence2 = charSequence;
                                        i11 = 0;
                                        this.f49336t0--;
                                        charSequence2 = charSequence;
                                        i11 = 0;
                                    }
                                } else {
                                    charSequence = charSequence2;
                                }
                            }
                        }
                        z10 = true;
                        break;
                    } else {
                        if (!H0.matcher(charSequence2.toString().substring(charSequenceH.length() + iStart)).lookingAt()) {
                            phoneNumberMatchG = g(iStart, charSequenceH);
                            if (phoneNumberMatchG != null) {
                                charSequence = charSequence2;
                                phoneNumberMatch = phoneNumberMatchG;
                            } else {
                                patternArr = J0;
                                length = patternArr.length;
                                i10 = i11;
                                while (true) {
                                    if (i10 < length) {
                                        matcher = patternArr[i10].matcher(charSequenceH);
                                        int i13 = 1;
                                        while (true) {
                                            charSequence = charSequence2;
                                            if (matcher.find() || this.f49336t0 <= 0) {
                                                i10++;
                                                charSequence2 = charSequence;
                                                i11 = 0;
                                            } else {
                                                if (i13 != 0) {
                                                    PhoneNumberMatch phoneNumberMatchG2 = g(iStart, h(PhoneNumberUtil.f49245v, charSequenceH.subSequence(i11, matcher.start())));
                                                    if (phoneNumberMatchG2 != null) {
                                                        phoneNumberMatch = phoneNumberMatchG2;
                                                    } else {
                                                        this.f49336t0--;
                                                        i13 = i11;
                                                    }
                                                }
                                                z10 = true;
                                                PhoneNumberMatch phoneNumberMatchG3 = g(matcher.start(1) + iStart, h(PhoneNumberUtil.f49245v, matcher.group(1)));
                                                if (phoneNumberMatchG3 != null) {
                                                    phoneNumberMatch = phoneNumberMatchG3;
                                                    break;
                                                }
                                                this.f49336t0--;
                                                charSequence2 = charSequence;
                                                i11 = 0;
                                            }
                                        }
                                    } else {
                                        charSequence = charSequence2;
                                    }
                                }
                            }
                            z10 = true;
                            break;
                        } else {
                            charSequence = charSequence2;
                            z10 = true;
                            break;
                        }
                    }
                } else {
                    charSequence = charSequence2;
                    z10 = true;
                    break;
                }
                if (phoneNumberMatch != null) {
                    break;
                }
                length2 = iStart + charSequenceH.length();
                this.f49336t0--;
                charSequence2 = charSequence;
                i11 = 0;
            }
            this.v0 = phoneNumberMatch;
            if (phoneNumberMatch == null) {
                this.f49337u0 = b.DONE;
            } else {
                this.f49338w0 = phoneNumberMatch.end();
                this.f49337u0 = b.READY;
            }
        } else {
            z10 = true;
        }
        if (this.f49337u0 == b.READY) {
            return z10;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final PhoneNumberMatch next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        PhoneNumberMatch phoneNumberMatch = this.v0;
        this.v0 = null;
        this.f49337u0 = b.NOT_READY;
        return phoneNumberMatch;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
