package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.internal.RegexCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class AsYouTypeFormatter {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Phonemetadata.PhoneMetadata f49202w = Phonemetadata.PhoneMetadata.newBuilder().setId("<ignored>").setInternationalPrefix("NA").build();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f49203x = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*\\$1[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)*");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f49204y = Pattern.compile("[- ]");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f49205z = Pattern.compile("\u2008");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f49206a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f49207b = new StringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f49208c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StringBuilder f49209d = new StringBuilder();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StringBuilder f49210e = new StringBuilder();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f49211f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f49212g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f49213h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f49214i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PhoneNumberUtil f49215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f49216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Phonemetadata.PhoneMetadata f49217l;
    public Phonemetadata.PhoneMetadata m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f49218n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f49219o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f49220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final StringBuilder f49221q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f49222r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f49223s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final StringBuilder f49224t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f49225u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RegexCache f49226v;

    public AsYouTypeFormatter(String str) {
        PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
        this.f49215j = phoneNumberUtil;
        this.f49218n = 0;
        this.f49219o = 0;
        this.f49220p = 0;
        this.f49221q = new StringBuilder();
        this.f49222r = false;
        this.f49223s = "";
        this.f49224t = new StringBuilder();
        this.f49225u = new ArrayList();
        this.f49226v = new RegexCache(64);
        this.f49216k = str;
        Phonemetadata.PhoneMetadata phoneMetadataM = phoneNumberUtil.m(phoneNumberUtil.getRegionCodeForCountryCode(phoneNumberUtil.getCountryCodeForRegion(str)));
        phoneMetadataM = phoneMetadataM == null ? f49202w : phoneMetadataM;
        this.m = phoneMetadataM;
        this.f49217l = phoneMetadataM;
    }

    public final String a(String str) {
        StringBuilder sb2 = this.f49221q;
        int length = sb2.length();
        if (!this.f49222r || length <= 0 || sb2.charAt(length - 1) == ' ') {
            return ((Object) sb2) + str;
        }
        return new String(sb2) + ' ' + str;
    }

    public final String b() {
        StringBuilder sb2 = this.f49224t;
        if (sb2.length() < 3) {
            return a(sb2.toString());
        }
        String string = sb2.toString();
        for (Phonemetadata.NumberFormat numberFormat : (this.f49213h && this.f49223s.length() == 0 && this.m.getIntlNumberFormatCount() > 0) ? this.m.getIntlNumberFormatList() : this.m.getNumberFormatList()) {
            if (this.f49223s.length() <= 0 || !PhoneNumberUtil.j(numberFormat.getNationalPrefixFormattingRule()) || numberFormat.getNationalPrefixOptionalWhenFormatting() || numberFormat.hasDomesticCarrierCodeFormattingRule()) {
                if (this.f49223s.length() != 0 || this.f49213h || PhoneNumberUtil.j(numberFormat.getNationalPrefixFormattingRule()) || numberFormat.getNationalPrefixOptionalWhenFormatting()) {
                    if (f49203x.matcher(numberFormat.getFormat()).matches()) {
                        this.f49225u.add(numberFormat);
                    }
                }
            }
        }
        j(string);
        String strE = e();
        if (strE.length() > 0) {
            return strE;
        }
        return i() ? f() : this.f49209d.toString();
    }

    public final boolean c() {
        StringBuilder sb2;
        PhoneNumberUtil phoneNumberUtil;
        int iF;
        StringBuilder sb3 = this.f49224t;
        if (sb3.length() == 0 || (iF = (phoneNumberUtil = this.f49215j).f(sb3, (sb2 = new StringBuilder()))) == 0) {
            return false;
        }
        sb3.setLength(0);
        sb3.append((CharSequence) sb2);
        String regionCodeForCountryCode = phoneNumberUtil.getRegionCodeForCountryCode(iF);
        if ("001".equals(regionCodeForCountryCode)) {
            this.m = phoneNumberUtil.l(iF);
        } else if (!regionCodeForCountryCode.equals(this.f49216k)) {
            Phonemetadata.PhoneMetadata phoneMetadataM = phoneNumberUtil.m(phoneNumberUtil.getRegionCodeForCountryCode(phoneNumberUtil.getCountryCodeForRegion(regionCodeForCountryCode)));
            if (phoneMetadataM == null) {
                phoneMetadataM = f49202w;
            }
            this.m = phoneMetadataM;
        }
        String string = Integer.toString(iF);
        StringBuilder sb4 = this.f49221q;
        sb4.append(string);
        sb4.append(' ');
        this.f49223s = "";
        return true;
    }

    public void clear() {
        this.f49206a = "";
        this.f49209d.setLength(0);
        this.f49210e.setLength(0);
        this.f49207b.setLength(0);
        this.f49218n = 0;
        this.f49208c = "";
        this.f49221q.setLength(0);
        this.f49223s = "";
        this.f49224t.setLength(0);
        this.f49211f = true;
        this.f49212g = false;
        this.f49220p = 0;
        this.f49219o = 0;
        this.f49213h = false;
        this.f49214i = false;
        this.f49225u.clear();
        this.f49222r = false;
        if (this.m.equals(this.f49217l)) {
            return;
        }
        String str = this.f49216k;
        PhoneNumberUtil phoneNumberUtil = this.f49215j;
        Phonemetadata.PhoneMetadata phoneMetadataM = phoneNumberUtil.m(phoneNumberUtil.getRegionCodeForCountryCode(phoneNumberUtil.getCountryCodeForRegion(str)));
        if (phoneMetadataM == null) {
            phoneMetadataM = f49202w;
        }
        this.m = phoneMetadataM;
    }

    public final boolean d() {
        Pattern patternForRegex = this.f49226v.getPatternForRegex("\\+|" + this.m.getInternationalPrefix());
        StringBuilder sb2 = this.f49210e;
        Matcher matcher = patternForRegex.matcher(sb2);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.f49213h = true;
        int iEnd = matcher.end();
        StringBuilder sb3 = this.f49224t;
        sb3.setLength(0);
        sb3.append(sb2.substring(iEnd));
        StringBuilder sb4 = this.f49221q;
        sb4.setLength(0);
        sb4.append(sb2.substring(0, iEnd));
        if (sb2.charAt(0) != '+') {
            sb4.append(' ');
        }
        return true;
    }

    public final String e() {
        for (Phonemetadata.NumberFormat numberFormat : this.f49225u) {
            Matcher matcher = this.f49226v.getPatternForRegex(numberFormat.getPattern()).matcher(this.f49224t);
            if (matcher.matches()) {
                this.f49222r = f49204y.matcher(numberFormat.getNationalPrefixFormattingRule()).find();
                String strA = a(matcher.replaceAll(numberFormat.getFormat()));
                if (PhoneNumberUtil.normalizeDiallableCharsOnly(strA).contentEquals(this.f49210e)) {
                    return strA;
                }
            }
        }
        return "";
    }

    public final String f() {
        StringBuilder sb2 = this.f49224t;
        int length = sb2.length();
        if (length <= 0) {
            return this.f49221q.toString();
        }
        String strG = "";
        for (int i10 = 0; i10 < length; i10++) {
            strG = g(sb2.charAt(i10));
        }
        return this.f49211f ? a(strG) : this.f49209d.toString();
    }

    public final String g(char c10) {
        StringBuilder sb2 = this.f49207b;
        Matcher matcher = f49205z.matcher(sb2);
        if (!matcher.find(this.f49218n)) {
            if (this.f49225u.size() == 1) {
                this.f49211f = false;
            }
            this.f49208c = "";
            return this.f49209d.toString();
        }
        String strReplaceFirst = matcher.replaceFirst(Character.toString(c10));
        sb2.replace(0, strReplaceFirst.length(), strReplaceFirst);
        int iStart = matcher.start();
        this.f49218n = iStart;
        return sb2.substring(0, iStart + 1);
    }

    public int getRememberedPosition() {
        if (!this.f49211f) {
            return this.f49219o;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f49220p && i11 < this.f49206a.length()) {
            if (this.f49210e.charAt(i10) == this.f49206a.charAt(i11)) {
                i10++;
            }
            i11++;
        }
        return i11;
    }

    public final String h(char c10, boolean z10) {
        StringBuilder sb2 = this.f49209d;
        sb2.append(c10);
        if (z10) {
            this.f49219o = sb2.length();
        }
        boolean zIsDigit = Character.isDigit(c10);
        StringBuilder sb3 = this.f49210e;
        StringBuilder sb4 = this.f49224t;
        if (zIsDigit || (sb2.length() == 1 && PhoneNumberUtil.f49240q.matcher(Character.toString(c10)).matches())) {
            if (c10 == '+') {
                sb3.append(c10);
            } else {
                c10 = Character.forDigit(Character.digit(c10, 10), 10);
                sb3.append(c10);
                sb4.append(c10);
            }
            if (z10) {
                this.f49220p = sb3.length();
            }
        } else {
            this.f49211f = false;
            this.f49212g = true;
        }
        boolean z11 = this.f49211f;
        StringBuilder sb5 = this.f49221q;
        if (!z11) {
            if (this.f49212g) {
                return sb2.toString();
            }
            if (!d()) {
                if (this.f49223s.length() > 0) {
                    sb4.insert(0, this.f49223s);
                    sb5.setLength(sb5.lastIndexOf(this.f49223s));
                }
                if (!this.f49223s.equals(k())) {
                    sb5.append(' ');
                    this.f49211f = true;
                    this.f49214i = false;
                    this.f49225u.clear();
                    this.f49218n = 0;
                    this.f49207b.setLength(0);
                    this.f49208c = "";
                    return b();
                }
            } else if (c()) {
                this.f49211f = true;
                this.f49214i = false;
                this.f49225u.clear();
                this.f49218n = 0;
                this.f49207b.setLength(0);
                this.f49208c = "";
                return b();
            }
            return sb2.toString();
        }
        int length = sb3.length();
        if (length == 0 || length == 1 || length == 2) {
            return sb2.toString();
        }
        if (length == 3) {
            if (!d()) {
                this.f49223s = k();
                return b();
            }
            this.f49214i = true;
        }
        if (this.f49214i) {
            if (c()) {
                this.f49214i = false;
            }
            return ((Object) sb5) + sb4.toString();
        }
        if (this.f49225u.size() <= 0) {
            return b();
        }
        String strG = g(c10);
        String strE = e();
        if (strE.length() > 0) {
            return strE;
        }
        j(sb4.toString());
        if (i()) {
            return f();
        }
        return this.f49211f ? a(strG) : sb2.toString();
    }

    public final boolean i() {
        Iterator it = this.f49225u.iterator();
        while (it.hasNext()) {
            Phonemetadata.NumberFormat numberFormat = (Phonemetadata.NumberFormat) it.next();
            String pattern = numberFormat.getPattern();
            if (this.f49208c.equals(pattern)) {
                return false;
            }
            String pattern2 = numberFormat.getPattern();
            StringBuilder sb2 = this.f49207b;
            sb2.setLength(0);
            String format = numberFormat.getFormat();
            Matcher matcher = this.f49226v.getPatternForRegex(pattern2).matcher("999999999999999");
            matcher.find();
            String strGroup = matcher.group();
            String strReplaceAll = strGroup.length() < this.f49224t.length() ? "" : strGroup.replaceAll(pattern2, format).replaceAll("9", "\u2008");
            if (strReplaceAll.length() > 0) {
                sb2.append(strReplaceAll);
                this.f49208c = pattern;
                this.f49222r = f49204y.matcher(numberFormat.getNationalPrefixFormattingRule()).find();
                this.f49218n = 0;
                return true;
            }
            it.remove();
        }
        this.f49211f = false;
        return false;
    }

    public String inputDigit(char c10) {
        String strH = h(c10, false);
        this.f49206a = strH;
        return strH;
    }

    public String inputDigitAndRememberPosition(char c10) {
        String strH = h(c10, true);
        this.f49206a = strH;
        return strH;
    }

    public final void j(String str) {
        int length = str.length() - 3;
        Iterator it = this.f49225u.iterator();
        while (it.hasNext()) {
            Phonemetadata.NumberFormat numberFormat = (Phonemetadata.NumberFormat) it.next();
            if (numberFormat.getLeadingDigitsPatternCount() != 0) {
                if (!this.f49226v.getPatternForRegex(numberFormat.getLeadingDigitsPattern(Math.min(length, numberFormat.getLeadingDigitsPatternCount() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    public final String k() {
        int countryCode = this.m.getCountryCode();
        StringBuilder sb2 = this.f49221q;
        int iEnd = 1;
        StringBuilder sb3 = this.f49224t;
        if (countryCode == 1 && sb3.charAt(0) == '1' && sb3.charAt(1) != '0' && sb3.charAt(1) != '1') {
            sb2.append('1');
            sb2.append(' ');
            this.f49213h = true;
        } else if (this.m.hasNationalPrefixForParsing()) {
            Matcher matcher = this.f49226v.getPatternForRegex(this.m.getNationalPrefixForParsing()).matcher(sb3);
            if (!matcher.lookingAt() || matcher.end() <= 0) {
                iEnd = 0;
            } else {
                this.f49213h = true;
                iEnd = matcher.end();
                sb2.append(sb3.substring(0, iEnd));
            }
        } else {
            iEnd = 0;
        }
        String strSubstring = sb3.substring(0, iEnd);
        sb3.delete(0, iEnd);
        return strSubstring;
    }
}
