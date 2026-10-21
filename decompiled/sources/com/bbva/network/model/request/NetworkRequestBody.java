package com.bbva.network.model.request;

import bk.q;
import com.bbva.network.model.multipart.MultiPartType;
import com.bbva.network.model.multipart.NetworkMultiPartBody;
import com.bbva.network.model.multipart.Part;
import com.bbva.network.model.multipart.PartBody;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MutableNetworkRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/network/model/request/NetworkRequestBody;", "", "()V", "FormBody", "MultipartBody", "RequestBody", "Lcom/bbva/network/model/request/NetworkRequestBody$FormBody;", "Lcom/bbva/network/model/request/NetworkRequestBody$MultipartBody;", "Lcom/bbva/network/model/request/NetworkRequestBody$RequestBody;", "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class NetworkRequestBody {

    /* JADX INFO: compiled from: MutableNetworkRequest.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/bbva/network/model/request/NetworkRequestBody$FormBody;", "Lcom/bbva/network/model/request/NetworkRequestBody;", "", "", "a", "Ljava/util/Map;", "getValues", "()Ljava/util/Map;", "values", "<init>", "(Ljava/util/Map;)V", "network_release"}, k = 1, mv = {1, 8, 0})
    public static final class FormBody extends NetworkRequestBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, String> values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormBody(@NotNull Map<String, String> values) {
            super(null);
            Intrinsics.checkNotNullParameter(values, "values");
            this.values = values;
        }

        @NotNull
        public final Map<String, String> getValues() {
            return this.values;
        }
    }

    /* JADX INFO: compiled from: MutableNetworkRequest.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010 J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005J\"\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006J&\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/bbva/network/model/request/NetworkRequestBody$MultipartBody;", "Lcom/bbva/network/model/request/NetworkRequestBody;", "Lcom/bbva/network/model/multipart/NetworkMultiPartBody;", "", "content", "", "", "headers", "", "addPart", "name", "value", "contentType", "addFormPart", "filename", "Ljava/io/File;", "file", "Lcom/bbva/network/model/multipart/Part;", "part", "Lcom/bbva/network/model/multipart/MultiPartType;", "a", "Lcom/bbva/network/model/multipart/MultiPartType;", "getType", "()Lcom/bbva/network/model/multipart/MultiPartType;", "type", "", "b", "Ljava/util/List;", "getParts", "()Ljava/util/List;", "parts", "<init>", "(Lcom/bbva/network/model/multipart/MultiPartType;)V", "network_release"}, k = 1, mv = {1, 8, 0})
    public static final class MultipartBody extends NetworkRequestBody implements NetworkMultiPartBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final MultiPartType type;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ArrayList f35149b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipartBody(@NotNull MultiPartType type) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.f35149b = new ArrayList();
        }

        public static /* synthetic */ void addFormPart$default(MultipartBody multipartBody, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str3 = null;
            }
            multipartBody.addFormPart(str, str2, str3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void addPart$default(MultipartBody multipartBody, byte[] bArr, Map map, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                map = q.emptyMap();
            }
            multipartBody.addPart(bArr, map);
        }

        public final void addFormPart(@NotNull String name, @NotNull String value, @Nullable String contentType) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List<Part> parts = getParts();
            byte[] bytes = value.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            parts.add(new Part(name, bytes, contentType));
        }

        public final void addPart(@NotNull byte[] content, @NotNull Map<String, String> headers) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(headers, "headers");
            getParts().add(new Part(headers, new PartBody.ByteArrayBody(content, null, 2, null)));
        }

        @Override // com.bbva.network.model.multipart.NetworkMultiPartBody
        @NotNull
        public List<Part> getParts() {
            return this.f35149b;
        }

        @Override // com.bbva.network.model.multipart.NetworkMultiPartBody
        @NotNull
        public MultiPartType getType() {
            return this.type;
        }

        public final void addFormPart(@NotNull String name, @NotNull String filename, @NotNull String contentType, @NotNull File file) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(filename, "filename");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(file, "file");
            getParts().add(new Part(name, filename, contentType, file));
        }

        public final void addPart(@NotNull Part part) {
            Intrinsics.checkNotNullParameter(part, "part");
            getParts().add(part);
        }
    }

    /* JADX INFO: compiled from: MutableNetworkRequest.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/network/model/request/NetworkRequestBody$RequestBody;", "Lcom/bbva/network/model/request/NetworkRequestBody;", "", "a", "[B", "getBody", "()[B", "body", "", "b", "Ljava/lang/String;", "getContentType", "()Ljava/lang/String;", "contentType", "<init>", "([BLjava/lang/String;)V", "network_release"}, k = 1, mv = {1, 8, 0})
    public static final class RequestBody extends NetworkRequestBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final byte[] body;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String contentType;

        public /* synthetic */ RequestBody(byte[] bArr, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bArr, (i10 & 2) != 0 ? null : str);
        }

        @Nullable
        public final byte[] getBody() {
            return this.body;
        }

        @Nullable
        public final String getContentType() {
            return this.contentType;
        }

        public RequestBody(@Nullable byte[] bArr, @Nullable String str) {
            super(null);
            this.body = bArr;
            this.contentType = str;
        }
    }

    public NetworkRequestBody() {
    }

    public /* synthetic */ NetworkRequestBody(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
