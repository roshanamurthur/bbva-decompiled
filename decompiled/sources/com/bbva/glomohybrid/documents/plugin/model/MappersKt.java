package com.bbva.glomohybrid.documents.plugin.model;

import bk.q;
import com.bbva.glomohybrid.documents.common.model.Document;
import com.bbva.network.constant.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Mappers.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"map", "Lcom/bbva/glomohybrid/documents/common/model/Document;", "documentDTO", "Lcom/bbva/glomohybrid/documents/plugin/model/DocumentDTO;", "gl-documents_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MappersKt {
    @NotNull
    public static final Document map(@NotNull DocumentDTO documentDTO) {
        Intrinsics.checkNotNullParameter(documentDTO, "documentDTO");
        String value = documentDTO.getValue();
        String mimeType = documentDTO.getMimeType();
        String title = documentDTO.getTitle();
        if (title == null) {
            title = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(title, "toString(...)");
        }
        String str = title;
        Method requestMethod = documentDTO.getRequestMethod();
        Map<String, String> headers = documentDTO.getHeaders();
        if (headers == null) {
            headers = q.emptyMap();
        }
        Map<String, String> map = headers;
        Map<String, String> queryParams = documentDTO.getQueryParams();
        if (queryParams == null) {
            queryParams = q.emptyMap();
        }
        return new Document(value, mimeType, str, requestMethod, map, queryParams, documentDTO.getBody(), documentDTO.getFilenameFormatter());
    }
}
