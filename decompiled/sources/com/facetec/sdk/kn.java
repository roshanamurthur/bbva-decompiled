package com.facetec.sdk;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class kn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42111b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f42112e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final String f42113i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f42109d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f42108c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    private kn(String str, String str2, String str3, @Nullable String str4) {
        this.f42112e = str;
        this.f42110a = str2;
        this.f42111b = str3;
        this.f42113i = str4;
    }

    public static kn a(String str) {
        Matcher matcher = f42109d.matcher(str);
        if (!matcher.lookingAt()) {
            StringBuilder sb2 = new StringBuilder("No subtype found for: \"");
            sb2.append(str);
            sb2.append('\"');
            throw new IllegalArgumentException(sb2.toString());
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f42108c.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb3 = new StringBuilder("Parameter is not formatted correctly: \"");
                sb3.append(str.substring(iEnd));
                sb3.append("\" for: \"");
                sb3.append(str);
                sb3.append('\"');
                throw new IllegalArgumentException(sb3.toString());
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 != null && strGroup2.equalsIgnoreCase("charset")) {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = androidx.databinding.e.c(strGroup3, 1, 1);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("Multiple charsets defined: \"", str2, "\" and: \"", strGroup3, "\" for: \"");
                    sbC.append(str);
                    sbC.append('\"');
                    throw new IllegalArgumentException(sbC.toString());
                }
                str2 = strGroup3;
            }
        }
        return new kn(str, lowerCase, lowerCase2, str2);
    }

    @Nullable
    public static kn e(String str) {
        try {
            return a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof kn) && ((kn) obj).f42112e.equals(this.f42112e);
    }

    public final int hashCode() {
        return this.f42112e.hashCode();
    }

    public final String toString() {
        return this.f42112e;
    }

    @Nullable
    public final Charset a() {
        return a((Charset) null);
    }

    @Nullable
    public final Charset a(@Nullable Charset charset) {
        try {
            String str = this.f42113i;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
