package okhttp3;

import androidx.camera.core.impl.utils.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MediaType.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000f\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\tJ\b\u0010\r\u001a\u00020\u0005H\u0016J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\n\u0010\tR\u0017\u0010\f\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lokhttp3/MediaType;", "", "Ljava/nio/charset/Charset;", "defaultValue", "charset", "", "name", "parameter", "-deprecated_type", "()Ljava/lang/String;", "type", "-deprecated_subtype", "subtype", "toString", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "b", "Ljava/lang/String;", "c", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class MediaType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f85575e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f85576f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f85577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String subtype;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String[] f85580d;

    /* JADX INFO: compiled from: MediaType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u000fJ\u0011\u0010\u0010\u001a\u00020\u000b*\u00020\u0007H\u0007¢\u0006\u0002\b\nJ\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b*\u00020\u0007H\u0007¢\u0006\u0002\b\u000eR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/MediaType$Companion;", "", "()V", "PARAMETER", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "QUOTED", "", "TOKEN", "TYPE_SUBTYPE", "get", "Lokhttp3/MediaType;", "mediaType", "-deprecated_get", "parse", "-deprecated_parse", "toMediaType", "toMediaTypeOrNull", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMediaType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,181:1\n1#2:182\n37#3,2:183\n*S KotlinDebug\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n*L\n148#1:183,2\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        @JvmName(name = "-deprecated_get")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final MediaType m6138deprecated_get(@NotNull String mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            return get(mediaType);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        @JvmName(name = "-deprecated_parse")
        @Nullable
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final MediaType m6139deprecated_parse(@NotNull String mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            return parse(mediaType);
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        public final MediaType get(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Matcher matcher = MediaType.f85575e.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(a.a("No subtype found for: \"", str, '\"').toString());
            }
            String strGroup = matcher.group(1);
            Intrinsics.checkNotNullExpressionValue(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            String strD = androidx.room.a.d(US, "US", strGroup, US, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            Intrinsics.checkNotNullExpressionValue(strGroup2, "typeSubtype.group(2)");
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strGroup2.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = MediaType.f85576f.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb2.append(strSubstring);
                    sb2.append("\" for: \"");
                    throw new IllegalArgumentException(y2.b(sb2, str, '\"').toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (l.startsWith$default(strGroup4, "'", false, 2, null) && l.endsWith$default(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new MediaType(str, strD, lowerCase, (String[]) arrayList.toArray(new String[0]), null);
        }

        @JvmStatic
        @JvmName(name = "parse")
        @Nullable
        public final MediaType parse(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public MediaType(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f85577a = str;
        this.type = str2;
        this.subtype = str3;
        this.f85580d = strArr;
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    public static final MediaType get(@NotNull String str) {
        return INSTANCE.get(str);
    }

    @JvmStatic
    @JvmName(name = "parse")
    @Nullable
    public static final MediaType parse(@NotNull String str) {
        return INSTANCE.parse(str);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "subtype", imports = {}))
    @JvmName(name = "-deprecated_subtype")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_subtype, reason: not valid java name and from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "type", imports = {}))
    @JvmName(name = "-deprecated_type")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name and from getter */
    public final String getType() {
        return this.type;
    }

    @JvmOverloads
    @Nullable
    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof MediaType) && Intrinsics.areEqual(((MediaType) other).f85577a, this.f85577a);
    }

    public int hashCode() {
        return this.f85577a.hashCode();
    }

    @Nullable
    public final String parameter(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.f85580d;
        int i10 = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, strArr.length - 1, 2);
        if (progressionLastElement < 0) {
            return null;
        }
        while (!l.equals(strArr[i10], name, true)) {
            if (i10 == progressionLastElement) {
                return null;
            }
            i10 += 2;
        }
        return strArr[i10 + 1];
    }

    @JvmName(name = "subtype")
    @NotNull
    public final String subtype() {
        return this.subtype;
    }

    @NotNull
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getF85577a() {
        return this.f85577a;
    }

    @JvmName(name = "type")
    @NotNull
    public final String type() {
        return this.type;
    }

    @JvmOverloads
    @Nullable
    public final Charset charset(@Nullable Charset defaultValue) {
        String strParameter = parameter("charset");
        if (strParameter == null) {
            return defaultValue;
        }
        try {
            return Charset.forName(strParameter);
        } catch (IllegalArgumentException unused) {
            return defaultValue;
        }
    }
}
