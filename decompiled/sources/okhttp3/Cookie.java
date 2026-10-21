package okhttp3;

import androidx.camera.camera2.internal.n1;
import androidx.camera.core.processing.f;
import androidx.room.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.nulabinc.zxcvbn.Guess;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Cookie.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001f\u0018\u0000 12\u00020\u0001:\u000221J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0017J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000f\u0010\u000e\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001d\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010!\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\u0012J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010$R\u0017\u0010\u000e\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u001d\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b\u001d\u0010\rR\u0017\u0010!\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b!\u0010\u0012R\u0017\u0010\u001f\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b\u0019\u0010\u0012¨\u00063"}, d2 = {"Lokhttp3/Cookie;", "", "Lokhttp3/HttpUrl;", "url", "", "matches", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "-deprecated_name", "()Ljava/lang/String;", "name", "-deprecated_value", "value", "-deprecated_persistent", "()Z", "persistent", "", "-deprecated_expiresAt", "()J", "expiresAt", "-deprecated_hostOnly", "hostOnly", "-deprecated_domain", DynamicLink.Builder.KEY_DOMAIN, "-deprecated_path", "path", "-deprecated_httpOnly", "httpOnly", "-deprecated_secure", "secure", "forObsoleteRfc2965", "toString$okhttp", "(Z)Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "c", "J", "d", "e", "f", "Z", "g", "h", "i", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class Cookie {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f85508j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f85509k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f85510l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long expiresAt;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String domain;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String path;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean secure;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean httpOnly;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final boolean persistent;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final boolean hostOnly;

    /* JADX INFO: compiled from: Cookie.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\r\u001a\u00020\f¨\u0006\u0010"}, d2 = {"Lokhttp3/Cookie$Builder;", "", "", "name", "value", "", "expiresAt", DynamicLink.Builder.KEY_DOMAIN, "hostOnlyDomain", "path", "secure", "httpOnly", "Lokhttp3/Cookie;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCookie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cookie.kt\nokhttp3/Cookie$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,614:1\n1#2:615\n*E\n"})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f85520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f85521b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public String f85523d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f85525f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f85526g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f85527h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f85528i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f85522c = DatesKt.MAX_DATE;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public String f85524e = "/";

        @NotNull
        public final Cookie build() {
            String str = this.f85520a;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.f85521b;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j10 = this.f85522c;
            String str3 = this.f85523d;
            if (str3 != null) {
                return new Cookie(str, str2, j10, str3, this.f85524e, this.f85525f, this.f85526g, this.f85527h, this.f85528i, null);
            }
            throw new NullPointerException("builder.domain == null");
        }

        @NotNull
        public final Builder domain(@NotNull String domain) {
            Intrinsics.checkNotNullParameter(domain, "domain");
            String canonicalHost = HostnamesKt.toCanonicalHost(domain);
            if (canonicalHost == null) {
                throw new IllegalArgumentException(f.d("unexpected domain: ", domain));
            }
            this.f85523d = canonicalHost;
            this.f85528i = false;
            return this;
        }

        @NotNull
        public final Builder expiresAt(long expiresAt) {
            if (expiresAt <= 0) {
                expiresAt = Long.MIN_VALUE;
            }
            if (expiresAt > DatesKt.MAX_DATE) {
                expiresAt = 253402300799999L;
            }
            this.f85522c = expiresAt;
            this.f85527h = true;
            return this;
        }

        @NotNull
        public final Builder hostOnlyDomain(@NotNull String domain) {
            Intrinsics.checkNotNullParameter(domain, "domain");
            String canonicalHost = HostnamesKt.toCanonicalHost(domain);
            if (canonicalHost == null) {
                throw new IllegalArgumentException(f.d("unexpected domain: ", domain));
            }
            this.f85523d = canonicalHost;
            this.f85528i = true;
            return this;
        }

        @NotNull
        public final Builder httpOnly() {
            this.f85526g = true;
            return this;
        }

        @NotNull
        public final Builder name(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (!Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) name).toString(), name)) {
                throw new IllegalArgumentException("name is not trimmed".toString());
            }
            this.f85520a = name;
            return this;
        }

        @NotNull
        public final Builder path(@NotNull String path) {
            Intrinsics.checkNotNullParameter(path, "path");
            if (!l.startsWith$default(path, "/", false, 2, null)) {
                throw new IllegalArgumentException("path must start with '/'".toString());
            }
            this.f85524e = path;
            return this;
        }

        @NotNull
        public final Builder secure() {
            this.f85525f = true;
            return this;
        }

        @NotNull
        public final Builder value(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) value).toString(), value)) {
                throw new IllegalArgumentException("value is not trimmed".toString());
            }
            this.f85521b = value;
            return this;
        }
    }

    /* JADX INFO: compiled from: Cookie.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J)\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0007R\u001c\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0015\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0016\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lokhttp3/Cookie$Companion;", "", "Lokhttp3/HttpUrl;", "url", "", "setCookie", "Lokhttp3/Cookie;", "parse", "", "currentTimeMillis", "parse$okhttp", "(JLokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;", "Lokhttp3/Headers;", "headers", "", "parseAll", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static int a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        public static final /* synthetic */ boolean access$domainMatch(Companion companion, String str, String str2) {
            companion.getClass();
            return b(str, str2);
        }

        public static final boolean access$pathMatch(Companion companion, HttpUrl httpUrl, String str) {
            companion.getClass();
            String strEncodedPath = httpUrl.encodedPath();
            if (Intrinsics.areEqual(strEncodedPath, str)) {
                return true;
            }
            return l.startsWith$default(strEncodedPath, str, false, 2, null) && (l.endsWith$default(str, "/", false, 2, null) || strEncodedPath.charAt(str.length()) == '/');
        }

        public static boolean b(String str, String str2) {
            if (Intrinsics.areEqual(str, str2)) {
                return true;
            }
            return l.endsWith$default(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.canParseAsIpAddress(str);
        }

        public static long c(int i10, String str) {
            int iA = a(str, 0, i10, false);
            Matcher matcher = Cookie.m.matcher(str);
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int iIndexOf$default = -1;
            int i14 = -1;
            int i15 = -1;
            while (iA < i10) {
                int iA2 = a(str, iA + 1, i10, true);
                matcher.region(iA, iA2);
                if (i12 == -1 && matcher.usePattern(Cookie.m).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                    i14 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                    i15 = Integer.parseInt(strGroup3);
                } else if (i13 == -1 && matcher.usePattern(Cookie.f85510l).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup4);
                } else if (iIndexOf$default == -1 && matcher.usePattern(Cookie.f85509k).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    String strD = a.d(locale, "US", strGroup5, locale, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = Cookie.f85509k.pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                    iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strPattern, strD, 0, false, 6, (Object) null) / 4;
                } else if (i11 == -1 && matcher.usePattern(Cookie.f85508j).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                    i11 = Integer.parseInt(strGroup6);
                }
                iA = a(str, iA2 + 1, i10, false);
            }
            if (70 <= i11 && i11 < 100) {
                i11 += ReturnCode.ERR_REPOSITORY;
            }
            if (i11 >= 0 && i11 < 70) {
                i11 += Guess.REFERENCE_YEAR;
            }
            if (i11 < 1601) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (iIndexOf$default == -1) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (1 > i13 || i13 >= 32) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i12 < 0 || i12 >= 24) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i14 < 0 || i14 >= 60) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i11);
            gregorianCalendar.set(2, iIndexOf$default - 1);
            gregorianCalendar.set(5, i13);
            gregorianCalendar.set(11, i12);
            gregorianCalendar.set(12, i14);
            gregorianCalendar.set(13, i15);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        @JvmStatic
        @Nullable
        public final Cookie parse(@NotNull HttpUrl url, @NotNull String setCookie) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            return parse$okhttp(System.currentTimeMillis(), url, setCookie);
        }

        @Nullable
        public final Cookie parse$okhttp(long currentTimeMillis, @NotNull HttpUrl url, @NotNull String setCookie) {
            String str;
            String str2;
            boolean z10;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            int iDelimiterOffset$default = Util.delimiterOffset$default(setCookie, ';', 0, 0, 6, (Object) null);
            int iDelimiterOffset$default2 = Util.delimiterOffset$default(setCookie, '=', 0, iDelimiterOffset$default, 2, (Object) null);
            if (iDelimiterOffset$default2 == iDelimiterOffset$default) {
                return null;
            }
            boolean z11 = true;
            String strTrimSubstring$default = Util.trimSubstring$default(setCookie, 0, iDelimiterOffset$default2, 1, null);
            if (strTrimSubstring$default.length() == 0 || Util.indexOfControlOrNonAscii(strTrimSubstring$default) != -1) {
                return null;
            }
            String strTrimSubstring = Util.trimSubstring(setCookie, iDelimiterOffset$default2 + 1, iDelimiterOffset$default);
            if (Util.indexOfControlOrNonAscii(strTrimSubstring) != -1) {
                return null;
            }
            int i10 = iDelimiterOffset$default + 1;
            int length = setCookie.length();
            String str3 = null;
            String str4 = null;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = true;
            long j10 = -1;
            long jC = DatesKt.MAX_DATE;
            while (true) {
                long j11 = Long.MIN_VALUE;
                if (i10 >= length) {
                    if (j10 != Long.MIN_VALUE) {
                        if (j10 != -1) {
                            long j12 = currentTimeMillis + (j10 <= 9223372036854775L ? j10 * ((long) 1000) : Long.MAX_VALUE);
                            j11 = (j12 < currentTimeMillis || j12 > DatesKt.MAX_DATE) ? 253402300799999L : j12;
                        } else {
                            j11 = jC;
                        }
                    }
                    String strHost = url.host();
                    String str5 = str3;
                    if (str5 == null) {
                        str = strHost;
                    } else {
                        if (!b(strHost, str5)) {
                            return null;
                        }
                        str = str5;
                    }
                    if (strHost.length() != str.length() && PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(str) == null) {
                        return null;
                    }
                    String strSubstring = "/";
                    String str6 = str4;
                    if (str6 == null || !l.startsWith$default(str6, "/", false, 2, null)) {
                        String strEncodedPath = url.encodedPath();
                        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) strEncodedPath, JsonPointer.SEPARATOR, 0, false, 6, (Object) null);
                        if (iLastIndexOf$default != 0) {
                            strSubstring = strEncodedPath.substring(0, iLastIndexOf$default);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        str2 = strSubstring;
                    } else {
                        str2 = str6;
                    }
                    return new Cookie(strTrimSubstring$default, strTrimSubstring, j11, str, str2, z12, z13, z14, z15, null);
                }
                int iDelimiterOffset = Util.delimiterOffset(setCookie, ';', i10, length);
                int iDelimiterOffset2 = Util.delimiterOffset(setCookie, '=', i10, iDelimiterOffset);
                String strTrimSubstring2 = Util.trimSubstring(setCookie, i10, iDelimiterOffset2);
                String strTrimSubstring3 = iDelimiterOffset2 < iDelimiterOffset ? Util.trimSubstring(setCookie, iDelimiterOffset2 + 1, iDelimiterOffset) : "";
                if (l.equals(strTrimSubstring2, "expires", z11)) {
                    try {
                        jC = c(strTrimSubstring3.length(), strTrimSubstring3);
                        z10 = z11;
                        z14 = z10;
                    } catch (IllegalArgumentException unused) {
                        z10 = z11;
                    }
                } else if (l.equals(strTrimSubstring2, "max-age", z11)) {
                    try {
                        long j13 = Long.parseLong(strTrimSubstring3);
                        j10 = j13 > 0 ? j13 : Long.MIN_VALUE;
                    } catch (NumberFormatException e5) {
                        try {
                            if (!new Regex("-?\\d+").matches(strTrimSubstring3)) {
                                throw e5;
                            }
                            j10 = l.startsWith$default(strTrimSubstring3, Constant.DASH_STRING, false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                        } catch (NumberFormatException | IllegalArgumentException unused2) {
                            z10 = true;
                        }
                    }
                    z10 = true;
                    z14 = true;
                } else if (!l.equals(strTrimSubstring2, DynamicLink.Builder.KEY_DOMAIN, true)) {
                    z10 = true;
                    if (l.equals(strTrimSubstring2, "path", true)) {
                        str4 = strTrimSubstring3;
                    } else if (l.equals(strTrimSubstring2, "secure", true)) {
                        z12 = true;
                    } else if (l.equals(strTrimSubstring2, "httponly", true)) {
                        z13 = true;
                    }
                } else {
                    if (!(!l.endsWith$default(strTrimSubstring3, Constant.DOT_STRING, false, 2, null))) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    String canonicalHost = HostnamesKt.toCanonicalHost(StringsKt__StringsKt.removePrefix(strTrimSubstring3, (CharSequence) Constant.DOT_STRING));
                    if (canonicalHost == null) {
                        throw new IllegalArgumentException();
                    }
                    str3 = canonicalHost;
                    z15 = false;
                    z10 = true;
                }
                i10 = iDelimiterOffset + 1;
                z11 = z10;
            }
        }

        @JvmStatic
        @NotNull
        public final List<Cookie> parseAll(@NotNull HttpUrl url, @NotNull Headers headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List<String> listValues = headers.values("Set-Cookie");
            int size = listValues.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                Cookie cookie = parse(url, listValues.get(i10));
                if (cookie != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cookie);
                }
            }
            if (arrayList == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            List<Cookie> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }
    }

    public Cookie(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j10;
        this.domain = str3;
        this.path = str4;
        this.secure = z10;
        this.httpOnly = z11;
        this.persistent = z12;
        this.hostOnly = z13;
    }

    @JvmStatic
    @Nullable
    public static final Cookie parse(@NotNull HttpUrl httpUrl, @NotNull String str) {
        return INSTANCE.parse(httpUrl, str);
    }

    @JvmStatic
    @NotNull
    public static final List<Cookie> parseAll(@NotNull HttpUrl httpUrl, @NotNull Headers headers) {
        return INSTANCE.parseAll(httpUrl, headers);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = DynamicLink.Builder.KEY_DOMAIN, imports = {}))
    @JvmName(name = "-deprecated_domain")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_domain, reason: not valid java name and from getter */
    public final String getDomain() {
        return this.domain;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "expiresAt", imports = {}))
    @JvmName(name = "-deprecated_expiresAt")
    /* JADX INFO: renamed from: -deprecated_expiresAt, reason: not valid java name and from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hostOnly", imports = {}))
    @JvmName(name = "-deprecated_hostOnly")
    /* JADX INFO: renamed from: -deprecated_hostOnly, reason: not valid java name and from getter */
    public final boolean getHostOnly() {
        return this.hostOnly;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "httpOnly", imports = {}))
    @JvmName(name = "-deprecated_httpOnly")
    /* JADX INFO: renamed from: -deprecated_httpOnly, reason: not valid java name and from getter */
    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "name", imports = {}))
    @JvmName(name = "-deprecated_name")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_name, reason: not valid java name and from getter */
    public final String getName() {
        return this.name;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "path", imports = {}))
    @JvmName(name = "-deprecated_path")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_path, reason: not valid java name and from getter */
    public final String getPath() {
        return this.path;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "persistent", imports = {}))
    @JvmName(name = "-deprecated_persistent")
    /* JADX INFO: renamed from: -deprecated_persistent, reason: not valid java name and from getter */
    public final boolean getPersistent() {
        return this.persistent;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "secure", imports = {}))
    @JvmName(name = "-deprecated_secure")
    /* JADX INFO: renamed from: -deprecated_secure, reason: not valid java name and from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "value", imports = {}))
    @JvmName(name = "-deprecated_value")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_value, reason: not valid java name and from getter */
    public final String getValue() {
        return this.value;
    }

    @JvmName(name = DynamicLink.Builder.KEY_DOMAIN)
    @NotNull
    public final String domain() {
        return this.domain;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof Cookie) {
            Cookie cookie = (Cookie) other;
            if (Intrinsics.areEqual(cookie.name, this.name) && Intrinsics.areEqual(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && Intrinsics.areEqual(cookie.domain, this.domain) && Intrinsics.areEqual(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    @JvmName(name = "expiresAt")
    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        int iC = n1.c(this.value, n1.c(this.name, 527, 31), 31);
        long j10 = this.expiresAt;
        return ((((((n1.c(this.path, n1.c(this.domain, (iC + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31), 31) + (this.secure ? 1231 : 1237)) * 31) + (this.httpOnly ? 1231 : 1237)) * 31) + (this.persistent ? 1231 : 1237)) * 31) + (this.hostOnly ? 1231 : 1237);
    }

    @JvmName(name = "hostOnly")
    public final boolean hostOnly() {
        return this.hostOnly;
    }

    @JvmName(name = "httpOnly")
    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(@NotNull HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        boolean z10 = this.hostOnly;
        String str = this.domain;
        if ((z10 ? Intrinsics.areEqual(url.host(), str) : Companion.access$domainMatch(INSTANCE, url.host(), str)) && Companion.access$pathMatch(INSTANCE, url, this.path)) {
            return !this.secure || url.getIsHttps();
        }
        return false;
    }

    @JvmName(name = "name")
    @NotNull
    public final String name() {
        return this.name;
    }

    @JvmName(name = "path")
    @NotNull
    public final String path() {
        return this.path;
    }

    @JvmName(name = "persistent")
    public final boolean persistent() {
        return this.persistent;
    }

    @JvmName(name = "secure")
    public final boolean secure() {
        return this.secure;
    }

    @NotNull
    public String toString() {
        return toString$okhttp(false);
    }

    @NotNull
    public final String toString$okhttp(boolean forObsoleteRfc2965) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.name);
        sb2.append('=');
        sb2.append(this.value);
        if (this.persistent) {
            long j10 = this.expiresAt;
            if (j10 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(DatesKt.toHttpDateString(new Date(j10)));
            }
        }
        if (!this.hostOnly) {
            sb2.append("; domain=");
            if (forObsoleteRfc2965) {
                sb2.append(Constant.DOT_STRING);
            }
            sb2.append(this.domain);
        }
        sb2.append("; path=");
        sb2.append(this.path);
        if (this.secure) {
            sb2.append("; secure");
        }
        if (this.httpOnly) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    @JvmName(name = "value")
    @NotNull
    public final String value() {
        return this.value;
    }
}
