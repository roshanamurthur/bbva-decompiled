package okhttp3;

import androidx.camera.camera2.internal.n1;
import androidx.room.a;
import bk.q;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.util.EglobalUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Challenge.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u001b\u0010\u001cB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001dJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00050\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\r\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u0017\u0010\b\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\b\u0010\u0007R%\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00050\t8G¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001e"}, d2 = {"Lokhttp3/Challenge;", "", "Ljava/nio/charset/Charset;", "charset", "withCharset", "", "-deprecated_scheme", "()Ljava/lang/String;", "scheme", "", "-deprecated_authParams", "()Ljava/util/Map;", "authParams", "-deprecated_realm", "realm", "-deprecated_charset", "()Ljava/nio/charset/Charset;", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "toString", "a", "Ljava/lang/String;", "b", "Ljava/util/Map;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class Challenge {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String scheme;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> authParams;

    public Challenge(@NotNull String scheme, @NotNull Map<String, String> authParams) {
        String strD;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.scheme = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                strD = a.d(locale, "US", key, locale, "this as java.lang.String).toLowerCase(locale)");
            } else {
                strD = null;
            }
            linkedHashMap.put(strD, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = mapUnmodifiableMap;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "authParams", imports = {}))
    @JvmName(name = "-deprecated_authParams")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_authParams, reason: not valid java name */
    public final Map<String, String> m6084deprecated_authParams() {
        return this.authParams;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "charset", imports = {}))
    @JvmName(name = "-deprecated_charset")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_charset, reason: not valid java name */
    public final Charset m6085deprecated_charset() {
        return charset();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "realm", imports = {}))
    @JvmName(name = "-deprecated_realm")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_realm, reason: not valid java name */
    public final String m6086deprecated_realm() {
        return realm();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "scheme", imports = {}))
    @JvmName(name = "-deprecated_scheme")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @JvmName(name = "authParams")
    @NotNull
    public final Map<String, String> authParams() {
        return this.authParams;
    }

    @JvmName(name = "charset")
    @NotNull
    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof Challenge) {
            Challenge challenge = (Challenge) other;
            if (Intrinsics.areEqual(challenge.scheme, this.scheme) && Intrinsics.areEqual(challenge.authParams, this.authParams)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.authParams.hashCode() + n1.c(this.scheme, EglobalUtils.DOUBLE_AUTH_ERROR_CODE, 31);
    }

    @JvmName(name = "realm")
    @Nullable
    public final String realm() {
        return this.authParams.get("realm");
    }

    @JvmName(name = "scheme")
    @NotNull
    public final String scheme() {
        return this.scheme;
    }

    @NotNull
    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    @NotNull
    public final Challenge withCharset(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        Map mutableMap = q.toMutableMap(this.authParams);
        String strName = charset.name();
        Intrinsics.checkNotNullExpressionValue(strName, "charset.name()");
        mutableMap.put("charset", strName);
        return new Challenge(this.scheme, (Map<String, String>) mutableMap);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Challenge(@NotNull String scheme, @NotNull String realm) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(realm, "realm");
        Map mapSingletonMap = Collections.singletonMap("realm", realm);
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "singletonMap(\"realm\", realm)");
        this(scheme, (Map<String, String>) mapSingletonMap);
    }
}
