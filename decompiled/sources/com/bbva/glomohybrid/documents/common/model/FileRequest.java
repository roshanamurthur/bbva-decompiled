package com.bbva.glomohybrid.documents.common.model;

import bk.q;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.constant.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FileRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001J\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R%\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016\u0082\u0001\u0002\u001e\u001f¨\u0006 "}, d2 = {"Lcom/bbva/glomohybrid/documents/common/model/FileRequest;", "", "", "", "withAppendedHeaders", "Lcom/bbva/network/constant/Method;", "a", "Lcom/bbva/network/constant/Method;", "getMethod", "()Lcom/bbva/network/constant/Method;", "method", "b", "Ljava/lang/String;", "getFileType", "()Ljava/lang/String;", "fileType", "c", "getFileName", "fileName", "d", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "headers", "e", "getQueryParams", "queryParams", "f", "getBody", "body", "Lcom/bbva/glomohybrid/documents/common/model/DocumentRequest;", "Lcom/bbva/glomohybrid/documents/common/model/OtherRequest;", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
public abstract class FileRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Method method;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fileType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fileName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> headers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> queryParams;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Map<String, Object> body;

    public FileRequest(Method method, String str, String str2, Map map, Map map2, Map map3, DefaultConstructorMarker defaultConstructorMarker) {
        this.method = method;
        this.fileType = str;
        this.fileName = str2;
        this.headers = map;
        this.queryParams = map2;
        this.body = map3;
    }

    @Nullable
    public final Map<String, Object> getBody() {
        return this.body;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final String getFileType() {
        return this.fileType;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final Method getMethod() {
        return this.method;
    }

    @NotNull
    public final Map<String, String> getQueryParams() {
        return this.queryParams;
    }

    @NotNull
    public final Map<String, String> withAppendedHeaders() {
        Map<String, String> map = this.headers;
        if (!map.containsKey(DigipassManagerConstants.KEY_CONTENT_TYPE)) {
            q.plus(map, TuplesKt.to(DigipassManagerConstants.KEY_CONTENT_TYPE, this.fileType));
        }
        return map;
    }
}
