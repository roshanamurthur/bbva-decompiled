package okhttp3;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.constant.ConstantsKt;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MultipartBody.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0003%$&B'\b\u0000\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\n\u0010\tR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0011\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010¨\u0006'"}, d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "", FirebaseAnalytics.Param.INDEX, "Lokhttp3/MultipartBody$Part;", "part", "Lokhttp3/MediaType;", "contentType", "-deprecated_type", "()Lokhttp3/MediaType;", "type", "", "-deprecated_boundary", "()Ljava/lang/String;", "boundary", "-deprecated_size", "()I", "size", "", "-deprecated_parts", "()Ljava/util/List;", "parts", "", "contentLength", "Lokio/BufferedSink;", "sink", "", "writeTo", "b", "Lokhttp3/MediaType;", "c", "Ljava/util/List;", "Lokio/ByteString;", "boundaryByteString", "<init>", "(Lokio/ByteString;Lokhttp3/MediaType;Ljava/util/List;)V", "Companion", "Builder", "Part", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class MultipartBody extends RequestBody {

    @JvmField
    @NotNull
    public static final MediaType ALTERNATIVE;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final MediaType DIGEST;

    @JvmField
    @NotNull
    public static final MediaType FORM;

    @JvmField
    @NotNull
    public static final MediaType MIXED;

    @JvmField
    @NotNull
    public static final MediaType PARALLEL;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final byte[] f85581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final byte[] f85582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final byte[] f85583h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ByteString f85584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MediaType type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Part> parts;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MediaType f85587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f85588e;

    /* JADX INFO: compiled from: MultipartBody.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ \u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0011¨\u0006\u0016"}, d2 = {"Lokhttp3/MultipartBody$Builder;", "", "Lokhttp3/MediaType;", "type", "setType", "Lokhttp3/RequestBody;", "body", "addPart", "Lokhttp3/Headers;", "headers", "", "name", "value", "addFormDataPart", "filename", "Lokhttp3/MultipartBody$Part;", "part", "Lokhttp3/MultipartBody;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "boundary", "<init>", "(Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ByteString f85589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public MediaType f85590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ArrayList f85591c;

        /* JADX WARN: Multi-variable type inference failed */
        @JvmOverloads
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final Builder addFormDataPart(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            addPart(Part.INSTANCE.createFormData(name, value));
            return this;
        }

        @NotNull
        public final Builder addPart(@NotNull RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            addPart(Part.INSTANCE.create(body));
            return this;
        }

        @NotNull
        public final MultipartBody build() {
            ArrayList arrayList = this.f85591c;
            if (!(!arrayList.isEmpty())) {
                throw new IllegalStateException("Multipart body must have at least one part.".toString());
            }
            return new MultipartBody(this.f85589a, this.f85590b, Util.toImmutableList(arrayList));
        }

        @NotNull
        public final Builder setType(@NotNull MediaType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.areEqual(type.type(), "multipart")) {
                this.f85590b = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        @JvmOverloads
        public Builder(@NotNull String boundary) {
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            this.f85589a = ByteString.INSTANCE.encodeUtf8(boundary);
            this.f85590b = MultipartBody.MIXED;
            this.f85591c = new ArrayList();
        }

        @NotNull
        public final Builder addFormDataPart(@NotNull String name, @Nullable String filename, @NotNull RequestBody body) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(body, "body");
            addPart(Part.INSTANCE.createFormData(name, filename, body));
            return this;
        }

        @NotNull
        public final Builder addPart(@Nullable Headers headers, @NotNull RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            addPart(Part.INSTANCE.create(headers, body));
            return this;
        }

        @NotNull
        public final Builder addPart(@NotNull Part part) {
            Intrinsics.checkNotNullParameter(part, "part");
            this.f85591c.add(part);
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Builder(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i10 & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            this(str);
        }
    }

    /* JADX INFO: compiled from: MultipartBody.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\r\u001a\u00020\u000e*\u00060\u000fj\u0002`\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/MultipartBody$Companion;", "", "()V", "ALTERNATIVE", "Lokhttp3/MediaType;", "COLONSPACE", "", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "appendQuotedString", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "key", "", "appendQuotedString$okhttp", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void appendQuotedString$okhttp(@NotNull StringBuilder sb2, @NotNull String key) {
            Intrinsics.checkNotNullParameter(sb2, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            sb2.append('\"');
            int length = key.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = key.charAt(i10);
                if (cCharAt == '\n') {
                    sb2.append(ConstantsKt.ENTER);
                } else if (cCharAt == '\r') {
                    sb2.append(ConstantsKt.RETURN);
                } else if (cCharAt == '\"') {
                    sb2.append(ConstantsKt.QUOTATION);
                } else {
                    sb2.append(cCharAt);
                }
            }
            sb2.append('\"');
        }
    }

    /* JADX INFO: compiled from: MultipartBody.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\b¨\u0006\u000f"}, d2 = {"Lokhttp3/MultipartBody$Part;", "", "Lokhttp3/Headers;", "-deprecated_headers", "()Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "-deprecated_body", "()Lokhttp3/RequestBody;", "body", "a", "Lokhttp3/Headers;", "b", "Lokhttp3/RequestBody;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Part {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Headers headers;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final RequestBody body;

        /* JADX INFO: compiled from: MultipartBody.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000e"}, d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "()V", "create", "Lokhttp3/MultipartBody$Part;", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "createFormData", "name", "", "value", "filename", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Part$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final Part create(@NotNull RequestBody body) {
                Intrinsics.checkNotNullParameter(body, "body");
                return create(null, body);
            }

            @JvmStatic
            @NotNull
            public final Part createFormData(@NotNull String name, @NotNull String value) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                return createFormData(name, null, RequestBody.Companion.create$default(RequestBody.INSTANCE, value, (MediaType) null, 1, (Object) null));
            }

            @JvmStatic
            @NotNull
            public final Part create(@Nullable Headers headers, @NotNull RequestBody body) {
                Intrinsics.checkNotNullParameter(body, "body");
                if ((headers != null ? headers.get(DigipassManagerConstants.KEY_CONTENT_TYPE) : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((headers != null ? headers.get("Content-Length") : null) == null) {
                    return new Part(headers, body, null);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            @JvmStatic
            @NotNull
            public final Part createFormData(@NotNull String name, @Nullable String filename, @NotNull RequestBody body) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(body, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(ConstantsKt.FORM_DATA_NAME);
                Companion companion = MultipartBody.INSTANCE;
                companion.appendQuotedString$okhttp(sb2, name);
                if (filename != null) {
                    sb2.append(ConstantsKt.FILENAME);
                    companion.appendQuotedString$okhttp(sb2, filename);
                }
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return create(new Headers.Builder().addUnsafeNonAscii(ConstantsKt.CONTENT_DISPOSITION, string).build(), body);
            }
        }

        public Part(Headers headers, RequestBody requestBody, DefaultConstructorMarker defaultConstructorMarker) {
            this.headers = headers;
            this.body = requestBody;
        }

        @JvmStatic
        @NotNull
        public static final Part create(@Nullable Headers headers, @NotNull RequestBody requestBody) {
            return INSTANCE.create(headers, requestBody);
        }

        @JvmStatic
        @NotNull
        public static final Part createFormData(@NotNull String str, @NotNull String str2) {
            return INSTANCE.createFormData(str, str2);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "body", imports = {}))
        @JvmName(name = "-deprecated_body")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name and from getter */
        public final RequestBody getBody() {
            return this.body;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
        @JvmName(name = "-deprecated_headers")
        @Nullable
        /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name and from getter */
        public final Headers getHeaders() {
            return this.headers;
        }

        @JvmName(name = "body")
        @NotNull
        public final RequestBody body() {
            return this.body;
        }

        @JvmName(name = "headers")
        @Nullable
        public final Headers headers() {
            return this.headers;
        }

        @JvmStatic
        @NotNull
        public static final Part create(@NotNull RequestBody requestBody) {
            return INSTANCE.create(requestBody);
        }

        @JvmStatic
        @NotNull
        public static final Part createFormData(@NotNull String str, @Nullable String str2, @NotNull RequestBody requestBody) {
            return INSTANCE.createFormData(str, str2, requestBody);
        }
    }

    static {
        MediaType.Companion companion = MediaType.INSTANCE;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
        f85581f = new byte[]{58, 32};
        f85582g = new byte[]{13, 10};
        f85583h = new byte[]{45, 45};
    }

    public MultipartBody(@NotNull ByteString boundaryByteString, @NotNull MediaType type, @NotNull List<Part> parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f85584a = boundaryByteString;
        this.type = type;
        this.parts = parts;
        this.f85587d = MediaType.INSTANCE.get(type + "; boundary=" + boundary());
        this.f85588e = -1L;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "boundary", imports = {}))
    @JvmName(name = "-deprecated_boundary")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_boundary, reason: not valid java name */
    public final String m6140deprecated_boundary() {
        return boundary();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "parts", imports = {}))
    @JvmName(name = "-deprecated_parts")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_parts, reason: not valid java name */
    public final List<Part> m6141deprecated_parts() {
        return this.parts;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    @JvmName(name = "-deprecated_size")
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m6142deprecated_size() {
        return size();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "type", imports = {}))
    @JvmName(name = "-deprecated_type")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name and from getter */
    public final MediaType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(BufferedSink bufferedSink, boolean z10) throws IOException {
        Buffer buffer;
        BufferedSink buffer2;
        if (z10) {
            buffer2 = new Buffer();
            buffer = buffer2;
        } else {
            buffer = 0;
            buffer2 = bufferedSink;
        }
        List<Part> list = this.parts;
        int size = list.size();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            ByteString byteString = this.f85584a;
            byte[] bArr = f85583h;
            byte[] bArr2 = f85582g;
            if (i10 >= size) {
                Intrinsics.checkNotNull(buffer2);
                buffer2.write(bArr);
                buffer2.write(byteString);
                buffer2.write(bArr);
                buffer2.write(bArr2);
                if (!z10) {
                    return j10;
                }
                Intrinsics.checkNotNull(buffer);
                long size2 = j10 + buffer.size();
                buffer.clear();
                return size2;
            }
            Part part = list.get(i10);
            Headers headers = part.headers();
            RequestBody requestBodyBody = part.body();
            Intrinsics.checkNotNull(buffer2);
            buffer2.write(bArr);
            buffer2.write(byteString);
            buffer2.write(bArr2);
            if (headers != null) {
                int size3 = headers.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    buffer2.writeUtf8(headers.name(i11)).write(f85581f).writeUtf8(headers.value(i11)).write(bArr2);
                }
            }
            MediaType f85587d = requestBodyBody.getF85648a();
            if (f85587d != null) {
                buffer2.writeUtf8("Content-Type: ").writeUtf8(f85587d.getF85577a()).write(bArr2);
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                buffer2.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(bArr2);
            } else if (z10) {
                Intrinsics.checkNotNull(buffer);
                buffer.clear();
                return -1L;
            }
            buffer2.write(bArr2);
            if (z10) {
                j10 += jContentLength;
            } else {
                requestBodyBody.writeTo(buffer2);
            }
            buffer2.write(bArr2);
            i10++;
        }
    }

    @JvmName(name = "boundary")
    @NotNull
    public final String boundary() {
        return this.f85584a.utf8();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j10 = this.f85588e;
        if (j10 != -1) {
            return j10;
        }
        long jA = a(null, true);
        this.f85588e = jA;
        return jA;
    }

    @Override // okhttp3.RequestBody
    @NotNull
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public MediaType getF85648a() {
        return this.f85587d;
    }

    @NotNull
    public final Part part(int index) {
        return this.parts.get(index);
    }

    @JvmName(name = "parts")
    @NotNull
    public final List<Part> parts() {
        return this.parts;
    }

    @JvmName(name = "size")
    public final int size() {
        return this.parts.size();
    }

    @JvmName(name = "type")
    @NotNull
    public final MediaType type() {
        return this.type;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }
}
