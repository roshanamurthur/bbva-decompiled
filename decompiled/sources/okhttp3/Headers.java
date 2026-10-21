package okhttp3;

import androidx.camera.core.processing.f;
import androidx.room.a;
import bk.g;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\u0018\u0000 \"2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002#\"J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0014J\u001b\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0016H\u0096\u0002J\u0006\u0010\u0019\u001a\u00020\u0018J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120 R\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\r\u0010\f¨\u0006$"}, d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "name", "get", "Ljava/util/Date;", "getDate", "Ljava/time/Instant;", "getInstant", "", "-deprecated_size", "()I", "size", FirebaseAnalytics.Param.INDEX, "value", "", "names", "", "values", "", "byteCount", "", "iterator", "Lokhttp3/Headers$Builder;", "newBuilder", "", "other", "", "equals", GenerateActivationFormCommand.HASH_CODE, "toString", "", "toMultimap", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String[] f85551p0;

    /* JADX INFO: compiled from: Headers.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000eJ\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000fH\u0007J\u0019\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000eH\u0086\u0002J\u0019\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000fH\u0087\u0002J\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002J\u0019\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002J\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u0014\u001a\u00020\u000bR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lokhttp3/Headers$Builder;", "", "", "line", "addLenient$okhttp", "(Ljava/lang/String;)Lokhttp3/Headers$Builder;", "addLenient", "add", "name", "value", "addUnsafeNonAscii", "Lokhttp3/Headers;", "headers", "addAll", "Ljava/util/Date;", "Ljava/time/Instant;", SetCommand.ID, "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "removeAll", "get", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "a", "Ljava/util/List;", "getNamesAndValues$okhttp", "()Ljava/util/List;", "namesAndValues", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,458:1\n1#2:459\n37#3,2:460\n*S KotlinDebug\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n*L\n359#1:460,2\n*E\n"})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList f85552a = new ArrayList(20);

        @NotNull
        public final Builder add(@NotNull String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) line, AbstractJsonLexerKt.COLON, 0, false, 6, (Object) null);
            if (iIndexOf$default == -1) {
                throw new IllegalArgumentException(f.d("Unexpected header: ", line).toString());
            }
            String strSubstring = line.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = StringsKt__StringsKt.trim((CharSequence) strSubstring).toString();
            String strSubstring2 = line.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            add(string, strSubstring2);
            return this;
        }

        @NotNull
        public final Builder addAll(@NotNull Headers headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                addLenient$okhttp(headers.name(i10), headers.value(i10));
            }
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) line, AbstractJsonLexerKt.COLON, 1, false, 4, (Object) null);
            if (iIndexOf$default != -1) {
                String strSubstring = line.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(strSubstring, strSubstring2);
            } else if (line.charAt(0) == ':') {
                String strSubstring3 = line.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp("", strSubstring3);
            } else {
                addLenient$okhttp("", line);
            }
            return this;
        }

        @NotNull
        public final Builder addUnsafeNonAscii(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Companion.access$checkName(Headers.INSTANCE, name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Headers build() {
            return new Headers((String[]) this.f85552a.toArray(new String[0]), null);
        }

        @Nullable
        public final String get(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            ArrayList arrayList = this.f85552a;
            int size = arrayList.size() - 2;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(size, 0, -2);
            if (progressionLastElement > size) {
                return null;
            }
            while (!l.equals(name, (String) arrayList.get(size), true)) {
                if (size == progressionLastElement) {
                    return null;
                }
                size -= 2;
            }
            return (String) arrayList.get(size + 1);
        }

        @NotNull
        public final List<String> getNamesAndValues$okhttp() {
            return this.f85552a;
        }

        @NotNull
        public final Builder removeAll(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f85552a;
                if (i10 >= arrayList.size()) {
                    return this;
                }
                if (l.equals(name, (String) arrayList.get(i10), true)) {
                    arrayList.remove(i10);
                    arrayList.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
        }

        @NotNull
        public final Builder set(@NotNull String name, @NotNull Date value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            set(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder set(@NotNull String name, @NotNull Instant value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return set(name, new Date(value.toEpochMilli()));
        }

        @NotNull
        public final Builder set(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Companion companion = Headers.INSTANCE;
            Companion.access$checkName(companion, name);
            Companion.access$checkValue(companion, value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = this.f85552a;
            arrayList.add(name);
            arrayList.add(StringsKt__StringsKt.trim((CharSequence) value).toString());
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Companion companion = Headers.INSTANCE;
            Companion.access$checkName(companion, name);
            Companion.access$checkValue(companion, value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String name, @NotNull Date value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            add(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder add(@NotNull String name, @NotNull Instant value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            add(name, new Date(value.toEpochMilli()));
            return this;
        }
    }

    /* JADX INFO: compiled from: Headers.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\b\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\u0007J\u001f\u0010\f\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0004\b\u0006\u0010\u000bJ#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0004\b\t\u0010\u000b¨\u0006\u0010"}, d2 = {"Lokhttp3/Headers$Companion;", "", "", "", "namesAndValues", "Lokhttp3/Headers;", "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "headersOf", "-deprecated_of", "", "(Ljava/util/Map;)Lokhttp3/Headers;", "toHeaders", "headers", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,458:1\n1#2:459\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void a(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        public static final /* synthetic */ void access$checkName(Companion companion, String str) {
            companion.getClass();
            a(str);
        }

        public static final /* synthetic */ void access$checkValue(Companion companion, String str, String str2) {
            companion.getClass();
            b(str, str2);
        }

        public static final String access$get(Companion companion, String[] strArr, String str) {
            companion.getClass();
            int length = strArr.length - 2;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(length, 0, -2);
            if (progressionLastElement <= length) {
                while (!l.equals(str, strArr[length], true)) {
                    if (length != progressionLastElement) {
                        length -= 2;
                    }
                }
                return strArr[length + 1];
            }
            return null;
        }

        public static void b(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                    sb2.append(Util.isSensitiveHeader(str2) ? "" : ": ".concat(str));
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "function name changed", replaceWith = @ReplaceWith(expression = "headersOf(*namesAndValues)", imports = {}))
        @JvmName(name = "-deprecated_of")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m6112deprecated_of(@NotNull String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            return of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        @JvmStatic
        @JvmName(name = "of")
        @NotNull
        public final Headers of(@NotNull String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr[i11] = StringsKt__StringsKt.trim((CharSequence) str).toString();
            }
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, strArr.length - 1, 2);
            if (progressionLastElement >= 0) {
                while (true) {
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    a(str2);
                    b(str3, str2);
                    if (i10 == progressionLastElement) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new Headers(strArr, null);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "function moved to extension", replaceWith = @ReplaceWith(expression = "headers.toHeaders()", imports = {}))
        @JvmName(name = "-deprecated_of")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m6111deprecated_of(@NotNull Map<String, String> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            return of(headers);
        }

        @JvmStatic
        @JvmName(name = "of")
        @NotNull
        public final Headers of(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = StringsKt__StringsKt.trim((CharSequence) key).toString();
                String string2 = StringsKt__StringsKt.trim((CharSequence) value).toString();
                a(string);
                b(string2, string);
                strArr[i10] = string;
                strArr[i10 + 1] = string2;
                i10 += 2;
            }
            return new Headers(strArr, null);
        }
    }

    public Headers(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f85551p0 = strArr;
    }

    @JvmStatic
    @JvmName(name = "of")
    @NotNull
    public static final Headers of(@NotNull Map<String, String> map) {
        return INSTANCE.of(map);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    @JvmName(name = "-deprecated_size")
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m6110deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.f85551p0;
        long length = strArr.length * 2;
        for (String str : strArr) {
            length += (long) str.length();
        }
        return length;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof Headers) {
            if (Arrays.equals(this.f85551p0, ((Headers) other).f85551p0)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final String get(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Companion.access$get(INSTANCE, this.f85551p0, name);
    }

    @Nullable
    public final Date getDate(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String str = get(name);
        if (str != null) {
            return DatesKt.toHttpDateOrNull(str);
        }
        return null;
    }

    @IgnoreJRERequirement
    @Nullable
    public final Instant getInstant(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Date date = getDate(name);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f85551p0);
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = TuplesKt.to(name(i10), value(i10));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    @NotNull
    public final String name(int index) {
        return this.f85551p0[index * 2];
    }

    @NotNull
    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(l.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(name(i10));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder builder = new Builder();
        g.addAll(builder.getNamesAndValues$okhttp(), this.f85551p0);
        return builder;
    }

    @JvmName(name = "size")
    public final int size() {
        return this.f85551p0.length / 2;
    }

    @NotNull
    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(l.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strName = name(i10);
            Locale locale = Locale.US;
            String strD = a.d(locale, "US", strName, locale, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(strD);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(strD, arrayList);
            }
            arrayList.add(value(i10));
        }
        return treeMap;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strName = name(i10);
            String strValue = value(i10);
            sb2.append(strName);
            sb2.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb2.append(strValue);
            sb2.append(RootService.LINE_BREAK);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public final String value(int index) {
        return this.f85551p0[(index * 2) + 1];
    }

    @NotNull
    public final List<String> values(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (l.equals(name, name(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i10));
            }
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    @JvmStatic
    @JvmName(name = "of")
    @NotNull
    public static final Headers of(@NotNull String... strArr) {
        return INSTANCE.of(strArr);
    }
}
