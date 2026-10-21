package com.bbva.glomohybrid.documents.common.model;

import com.bbva.network.constant.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FileRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/model/OtherRequest;", "Lcom/bbva/glomohybrid/documents/common/model/FileRequest;", "", "g", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "Lcom/bbva/network/constant/Method;", "method", "fileType", "fileName", "", "headers", "queryParams", "", "body", "<init>", "(Ljava/lang/String;Lcom/bbva/network/constant/Method;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
public final class OtherRequest extends FileRequest {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtherRequest(@NotNull String url, @NotNull Method method, @NotNull String fileType, @NotNull String fileName, @NotNull Map<String, String> headers, @NotNull Map<String, String> queryParams, @Nullable Map<String, ? extends Object> map) {
        super(method, fileType, fileName, headers, queryParams, map, null);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        this.url = url;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }
}
