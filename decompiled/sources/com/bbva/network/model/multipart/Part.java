package com.bbva.network.model.multipart;

import bk.q;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MultiPart.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010B%\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0015B+\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u000f\u0010\u0019R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/bbva/network/model/multipart/Part;", "", "", "", "a", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "headers", "Lcom/bbva/network/model/multipart/PartBody;", "b", "Lcom/bbva/network/model/multipart/PartBody;", "getBody", "()Lcom/bbva/network/model/multipart/PartBody;", "body", "<init>", "(Ljava/util/Map;Lcom/bbva/network/model/multipart/PartBody;)V", "name", "", "value", "contentType", "(Ljava/lang/String;[BLjava/lang/String;)V", "filename", "Ljava/io/File;", "file", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V", "network_release"}, k = 1, mv = {1, 8, 0})
public final class Part {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> headers;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PartBody body;

    public Part(@NotNull Map<String, String> headers, @NotNull PartBody body) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        this.headers = headers;
        this.body = body;
    }

    @NotNull
    public final PartBody getBody() {
        return this.body;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public /* synthetic */ Part(Map map, PartBody partBody, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? q.emptyMap() : map, partBody);
    }

    public /* synthetic */ Part(String str, byte[] bArr, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bArr, (i10 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Part(@NotNull String name, @NotNull byte[] value, @Nullable String str) {
        this(MultiPartKt.access$headersFromFilename(name, null), new PartBody.ByteArrayBody(value, str));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Part(@NotNull String name, @NotNull String filename, @Nullable String str, @NotNull File file) {
        this(MultiPartKt.access$headersFromFilename(name, filename), new PartBody.FileBody(file, str));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(file, "file");
    }
}
