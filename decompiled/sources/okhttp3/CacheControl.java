package okhttp3;

import androidx.appcompat.widget.g0;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CacheControl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u0000 ,2\u00020\u0001:\u0002-,J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0013\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0005\u0010\u0004R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0007\u0010\u0004R\u0017\u0010\u000b\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u000b\u0010\nR\u0017\u0010\r\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\r\u0010\nR\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u0004R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u0004R\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b\u000f\u0010\u0004R\u0017\u0010\u0011\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0013\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b\u0015\u0010\u0004R\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b\u0017\u0010\u0004R\u0017\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b\u0019\u0010\u0004¨\u0006."}, d2 = {"Lokhttp3/CacheControl;", "", "", "-deprecated_noCache", "()Z", "noCache", "-deprecated_noStore", "noStore", "", "-deprecated_maxAgeSeconds", "()I", "maxAgeSeconds", "-deprecated_sMaxAgeSeconds", "sMaxAgeSeconds", "-deprecated_mustRevalidate", "mustRevalidate", "-deprecated_maxStaleSeconds", "maxStaleSeconds", "-deprecated_minFreshSeconds", "minFreshSeconds", "-deprecated_onlyIfCached", "onlyIfCached", "-deprecated_noTransform", "noTransform", "-deprecated_immutable", "immutable", "", "toString", "a", "Z", "b", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "d", "e", "isPrivate", "f", "isPublic", "g", "h", "i", "j", "k", "l", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class CacheControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean noCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean noStore;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int maxAgeSeconds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int sMaxAgeSeconds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean isPrivate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean isPublic;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean mustRevalidate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int maxStaleSeconds;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final int minFreshSeconds;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final boolean onlyIfCached;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final boolean noTransform;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final boolean immutable;

    @Nullable
    public String m;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();

    @JvmField
    @NotNull
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    /* JADX INFO: compiled from: CacheControl.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0003\u001a\u00020\u0000J\u0016\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u0000J\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u0011"}, d2 = {"Lokhttp3/CacheControl$Builder;", "", "noCache", "noStore", "", "maxAge", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "maxStale", "minFresh", "onlyIfCached", "noTransform", "immutable", "Lokhttp3/CacheControl;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCacheControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheControl.kt\nokhttp3/CacheControl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f85477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f85478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f85479c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f85480d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f85481e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f85482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f85483g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f85484h;

        @NotNull
        public final CacheControl build() {
            return new CacheControl(this.f85477a, this.f85478b, this.f85479c, -1, false, false, false, this.f85480d, this.f85481e, this.f85482f, this.f85483g, this.f85484h, null, null);
        }

        @NotNull
        public final Builder immutable() {
            this.f85484h = true;
            return this;
        }

        @NotNull
        public final Builder maxAge(int maxAge, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (maxAge < 0) {
                throw new IllegalArgumentException(g0.c("maxAge < 0: ", maxAge).toString());
            }
            long seconds = timeUnit.toSeconds(maxAge);
            this.f85479c = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        @NotNull
        public final Builder maxStale(int maxStale, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (maxStale < 0) {
                throw new IllegalArgumentException(g0.c("maxStale < 0: ", maxStale).toString());
            }
            long seconds = timeUnit.toSeconds(maxStale);
            this.f85480d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        @NotNull
        public final Builder minFresh(int minFresh, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (minFresh < 0) {
                throw new IllegalArgumentException(g0.c("minFresh < 0: ", minFresh).toString());
            }
            long seconds = timeUnit.toSeconds(minFresh);
            this.f85481e = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        @NotNull
        public final Builder noCache() {
            this.f85477a = true;
            return this;
        }

        @NotNull
        public final Builder noStore() {
            this.f85478b = true;
            return this;
        }

        @NotNull
        public final Builder noTransform() {
            this.f85483g = true;
            return this;
        }

        @NotNull
        public final Builder onlyIfCached() {
            this.f85482f = true;
            return this;
        }
    }

    /* JADX INFO: compiled from: CacheControl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lokhttp3/CacheControl$Companion;", "", "Lokhttp3/Headers;", "headers", "Lokhttp3/CacheControl;", "parse", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:100:0x007c A[EDGE_INSN: B:100:0x007c->B:23:0x007c BREAK  A[LOOP:2: B:16:0x004d->B:21:0x0067], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:15:0x0048  */
        /* JADX WARN: Code duplicated, block: B:18:0x0050  */
        /* JADX WARN: Code duplicated, block: B:21:0x0067 A[LOOP:2: B:16:0x004d->B:21:0x0067, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:46:0x012f  */
        /* JADX WARN: Code duplicated, block: B:50:0x013e  */
        /* JADX WARN: Code duplicated, block: B:52:0x0146  */
        /* JADX WARN: Code duplicated, block: B:53:0x014a  */
        /* JADX WARN: Code duplicated, block: B:55:0x0152  */
        /* JADX WARN: Code duplicated, block: B:57:0x015a  */
        /* JADX WARN: Code duplicated, block: B:59:0x0163  */
        /* JADX WARN: Code duplicated, block: B:60:0x0168  */
        /* JADX WARN: Code duplicated, block: B:62:0x0170  */
        /* JADX WARN: Code duplicated, block: B:63:0x0174  */
        /* JADX WARN: Code duplicated, block: B:65:0x017c  */
        /* JADX WARN: Code duplicated, block: B:66:0x0182  */
        /* JADX WARN: Code duplicated, block: B:68:0x018a  */
        /* JADX WARN: Code duplicated, block: B:69:0x018e  */
        /* JADX WARN: Code duplicated, block: B:71:0x0196  */
        /* JADX WARN: Code duplicated, block: B:72:0x019e  */
        /* JADX WARN: Code duplicated, block: B:74:0x01a6  */
        /* JADX WARN: Code duplicated, block: B:75:0x01ac  */
        /* JADX WARN: Code duplicated, block: B:77:0x01b5  */
        /* JADX WARN: Code duplicated, block: B:78:0x01bb  */
        /* JADX WARN: Code duplicated, block: B:80:0x01c3  */
        /* JADX WARN: Code duplicated, block: B:81:0x01c9  */
        /* JADX WARN: Code duplicated, block: B:83:0x01d3  */
        /* JADX WARN: Code duplicated, block: B:99:0x0072 A[SYNTHETIC] */
        @JvmStatic
        @NotNull
        public final CacheControl parse(@NotNull Headers headers) {
            int i10;
            boolean z10;
            boolean z11;
            int i11;
            int length;
            int length2;
            int i12;
            boolean z12;
            String str;
            String string;
            boolean z13;
            boolean z14;
            String string2;
            int i13;
            Headers headers2 = headers;
            Intrinsics.checkNotNullParameter(headers2, "headers");
            int size = headers.size();
            boolean z15 = true;
            boolean z16 = true;
            int i14 = 0;
            String str2 = null;
            boolean z17 = false;
            boolean z18 = false;
            int nonNegativeInt = -1;
            int nonNegativeInt2 = -1;
            boolean z19 = false;
            boolean z20 = false;
            boolean z21 = false;
            int nonNegativeInt3 = -1;
            int nonNegativeInt4 = -1;
            boolean z22 = false;
            boolean z23 = false;
            boolean z24 = false;
            while (i14 < size) {
                String strName = headers2.name(i14);
                String strValue = headers2.value(i14);
                if (l.equals(strName, "Cache-Control", z15)) {
                    if (str2 == null) {
                        str2 = strValue;
                    }
                    i11 = 0;
                    while (i11 < strValue.length()) {
                        length = strValue.length();
                        length2 = i11;
                        while (true) {
                            if (length2 < length) {
                                i12 = size;
                                z12 = z16;
                                str = str2;
                                length2 = strValue.length();
                                break;
                            }
                            i12 = size;
                            i13 = length;
                            z12 = z16;
                            str = str2;
                            if (StringsKt__StringsKt.contains$default((CharSequence) "=,;", strValue.charAt(length2), false, 2, (Object) null)) {
                                break;
                            }
                            length2++;
                            length = i13;
                            size = i12;
                            z16 = z12;
                            str2 = str;
                        }
                        String strSubstring = strValue.substring(i11, length2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = StringsKt__StringsKt.trim((CharSequence) strSubstring).toString();
                        if (length2 != strValue.length() || strValue.charAt(length2) == ',' || strValue.charAt(length2) == ';') {
                            z13 = z20;
                            z14 = z21;
                            i11 = length2 + 1;
                            string2 = null;
                        } else {
                            int iIndexOfNonWhitespace = Util.indexOfNonWhitespace(strValue, length2 + 1);
                            if (iIndexOfNonWhitespace >= strValue.length() || strValue.charAt(iIndexOfNonWhitespace) != '\"') {
                                int length3 = strValue.length();
                                int length4 = iIndexOfNonWhitespace;
                                while (true) {
                                    if (length4 >= length3) {
                                        z13 = z20;
                                        z14 = z21;
                                        length4 = strValue.length();
                                        break;
                                    }
                                    int i15 = length3;
                                    z13 = z20;
                                    z14 = z21;
                                    if (StringsKt__StringsKt.contains$default((CharSequence) ",;", strValue.charAt(length4), false, 2, (Object) null)) {
                                        break;
                                    }
                                    length4++;
                                    length3 = i15;
                                    z21 = z14;
                                    z20 = z13;
                                }
                                String strSubstring2 = strValue.substring(iIndexOfNonWhitespace, length4);
                                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                string2 = StringsKt__StringsKt.trim((CharSequence) strSubstring2).toString();
                                i11 = length4;
                            } else {
                                int i16 = iIndexOfNonWhitespace + 1;
                                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strValue, '\"', i16, false, 4, (Object) null);
                                string2 = strValue.substring(i16, iIndexOf$default);
                                Intrinsics.checkNotNullExpressionValue(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                i11 = iIndexOf$default + 1;
                                z13 = z20;
                                z14 = z21;
                            }
                        }
                        z15 = true;
                        if (l.equals("no-cache", string, true)) {
                            z17 = true;
                        } else if (l.equals("no-store", string, true)) {
                            z18 = true;
                        } else if (l.equals("max-age", string, true)) {
                            nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                        } else if (l.equals("s-maxage", string, true)) {
                            nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                        } else if (l.equals("private", string, true)) {
                            z19 = true;
                        } else {
                            if (l.equals("public", string, true)) {
                                z20 = true;
                                z21 = z14;
                            } else {
                                if (l.equals("must-revalidate", string, true)) {
                                    z21 = true;
                                } else if (l.equals("max-stale", string, true)) {
                                    nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                                } else if (l.equals("min-fresh", string, true)) {
                                    nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                                } else if (l.equals("only-if-cached", string, true)) {
                                    z22 = true;
                                } else if (l.equals("no-transform", string, true)) {
                                    z23 = true;
                                } else if (l.equals("immutable", string, true)) {
                                    z24 = true;
                                }
                                z20 = z13;
                            }
                            size = i12;
                            z16 = z12;
                            str2 = str;
                        }
                        z21 = z14;
                        z20 = z13;
                        size = i12;
                        z16 = z12;
                        str2 = str;
                    }
                    i10 = size;
                    z11 = z21;
                    z10 = z20;
                    i14++;
                    headers2 = headers;
                    z21 = z11;
                    z20 = z10;
                    size = i10;
                } else {
                    if (!l.equals(strName, "Pragma", z15)) {
                        i10 = size;
                        z10 = z20;
                        z11 = z21;
                    }
                    i14++;
                    headers2 = headers;
                    z21 = z11;
                    z20 = z10;
                    size = i10;
                }
                z16 = false;
                i11 = 0;
                while (i11 < strValue.length()) {
                    length = strValue.length();
                    length2 = i11;
                    while (true) {
                        if (length2 < length) {
                            i12 = size;
                            z12 = z16;
                            str = str2;
                            length2 = strValue.length();
                            break;
                        }
                        i12 = size;
                        i13 = length;
                        z12 = z16;
                        str = str2;
                        if (StringsKt__StringsKt.contains$default((CharSequence) "=,;", strValue.charAt(length2), false, 2, (Object) null)) {
                            break;
                            break;
                        }
                        length2++;
                        length = i13;
                        size = i12;
                        z16 = z12;
                        str2 = str;
                    }
                    String strSubstring3 = strValue.substring(i11, length2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = StringsKt__StringsKt.trim((CharSequence) strSubstring3).toString();
                    if (length2 != strValue.length()) {
                        z13 = z20;
                        z14 = z21;
                        i11 = length2 + 1;
                        string2 = null;
                    } else {
                        z13 = z20;
                        z14 = z21;
                        i11 = length2 + 1;
                        string2 = null;
                    }
                    z15 = true;
                    if (l.equals("no-cache", string, true)) {
                        z17 = true;
                    } else if (l.equals("no-store", string, true)) {
                        z18 = true;
                    } else if (l.equals("max-age", string, true)) {
                        nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                    } else if (l.equals("s-maxage", string, true)) {
                        nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                    } else if (l.equals("private", string, true)) {
                        z19 = true;
                    } else {
                        if (l.equals("public", string, true)) {
                            z20 = true;
                            z21 = z14;
                        } else {
                            if (l.equals("must-revalidate", string, true)) {
                                z21 = true;
                            } else if (l.equals("max-stale", string, true)) {
                                nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                            } else if (l.equals("min-fresh", string, true)) {
                                nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                            } else if (l.equals("only-if-cached", string, true)) {
                                z22 = true;
                            } else if (l.equals("no-transform", string, true)) {
                                z23 = true;
                            } else if (l.equals("immutable", string, true)) {
                                z24 = true;
                            }
                            z20 = z13;
                        }
                        size = i12;
                        z16 = z12;
                        str2 = str;
                    }
                    z21 = z14;
                    z20 = z13;
                    size = i12;
                    z16 = z12;
                    str2 = str;
                }
                i10 = size;
                z11 = z21;
                z10 = z20;
                i14++;
                headers2 = headers;
                z21 = z11;
                z20 = z10;
                size = i10;
            }
            return new CacheControl(z17, z18, nonNegativeInt, nonNegativeInt2, z19, z20, z21, nonNegativeInt3, nonNegativeInt4, z22, z23, z24, !z16 ? null : str2, null);
        }
    }

    public CacheControl(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.noCache = z10;
        this.noStore = z11;
        this.maxAgeSeconds = i10;
        this.sMaxAgeSeconds = i11;
        this.isPrivate = z12;
        this.isPublic = z13;
        this.mustRevalidate = z14;
        this.maxStaleSeconds = i12;
        this.minFreshSeconds = i13;
        this.onlyIfCached = z15;
        this.noTransform = z16;
        this.immutable = z17;
        this.m = str;
    }

    @JvmStatic
    @NotNull
    public static final CacheControl parse(@NotNull Headers headers) {
        return INSTANCE.parse(headers);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "immutable", imports = {}))
    @JvmName(name = "-deprecated_immutable")
    /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name and from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "maxAgeSeconds", imports = {}))
    @JvmName(name = "-deprecated_maxAgeSeconds")
    /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name and from getter */
    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "maxStaleSeconds", imports = {}))
    @JvmName(name = "-deprecated_maxStaleSeconds")
    /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name and from getter */
    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "minFreshSeconds", imports = {}))
    @JvmName(name = "-deprecated_minFreshSeconds")
    /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name and from getter */
    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "mustRevalidate", imports = {}))
    @JvmName(name = "-deprecated_mustRevalidate")
    /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name and from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noCache", imports = {}))
    @JvmName(name = "-deprecated_noCache")
    /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name and from getter */
    public final boolean getNoCache() {
        return this.noCache;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noStore", imports = {}))
    @JvmName(name = "-deprecated_noStore")
    /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name and from getter */
    public final boolean getNoStore() {
        return this.noStore;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noTransform", imports = {}))
    @JvmName(name = "-deprecated_noTransform")
    /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name and from getter */
    public final boolean getNoTransform() {
        return this.noTransform;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "onlyIfCached", imports = {}))
    @JvmName(name = "-deprecated_onlyIfCached")
    /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name and from getter */
    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sMaxAgeSeconds", imports = {}))
    @JvmName(name = "-deprecated_sMaxAgeSeconds")
    /* JADX INFO: renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name and from getter */
    public final int getSMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @JvmName(name = "immutable")
    public final boolean immutable() {
        return this.immutable;
    }

    /* JADX INFO: renamed from: isPrivate, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* JADX INFO: renamed from: isPublic, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    @JvmName(name = "maxAgeSeconds")
    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @JvmName(name = "maxStaleSeconds")
    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @JvmName(name = "minFreshSeconds")
    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @JvmName(name = "mustRevalidate")
    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    @JvmName(name = "noCache")
    public final boolean noCache() {
        return this.noCache;
    }

    @JvmName(name = "noStore")
    public final boolean noStore() {
        return this.noStore;
    }

    @JvmName(name = "noTransform")
    public final boolean noTransform() {
        return this.noTransform;
    }

    @JvmName(name = "onlyIfCached")
    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    @JvmName(name = "sMaxAgeSeconds")
    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @NotNull
    public String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.noCache) {
            sb2.append("no-cache, ");
        }
        if (this.noStore) {
            sb2.append("no-store, ");
        }
        int i10 = this.maxAgeSeconds;
        if (i10 != -1) {
            sb2.append("max-age=");
            sb2.append(i10);
            sb2.append(", ");
        }
        int i11 = this.sMaxAgeSeconds;
        if (i11 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i11);
            sb2.append(", ");
        }
        if (this.isPrivate) {
            sb2.append("private, ");
        }
        if (this.isPublic) {
            sb2.append("public, ");
        }
        if (this.mustRevalidate) {
            sb2.append("must-revalidate, ");
        }
        int i12 = this.maxStaleSeconds;
        if (i12 != -1) {
            sb2.append("max-stale=");
            sb2.append(i12);
            sb2.append(", ");
        }
        int i13 = this.minFreshSeconds;
        if (i13 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i13);
            sb2.append(", ");
        }
        if (this.onlyIfCached) {
            sb2.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb2.append("no-transform, ");
        }
        if (this.immutable) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.m = string;
        return string;
    }
}
