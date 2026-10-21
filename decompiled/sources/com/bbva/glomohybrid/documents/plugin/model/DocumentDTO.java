package com.bbva.glomohybrid.documents.plugin.model;

import androidx.annotation.Keep;
import bk.q;
import com.bbva.glomohybrid.documents.common.repository.dataSource.FilenameFormatter;
import com.bbva.glomohybrid.documents.common.repository.dataSource.FilenameFormatters;
import com.bbva.glomohybrid.documents.common.repository.dataSource.NoOpFormatter;
import com.bbva.glomohybrid.documents.common.repository.dataSource.NoSpaceOrAscciFormatter;
import com.bbva.network.constant.Method;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DocumentDTO.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u0006\u0010\u001b\u001a\u00020\u001cR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/bbva/glomohybrid/documents/plugin/model/DocumentDTO;", "", "value", "", "mimeType", "title", "method", "headers", "", "queryParams", "body", "formatter", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "getBody", "()Ljava/util/Map;", "filenameFormatter", "Lcom/bbva/glomohybrid/documents/common/repository/dataSource/FilenameFormatter;", "getFilenameFormatter", "()Lcom/bbva/glomohybrid/documents/common/repository/dataSource/FilenameFormatter;", "getFormatter", "()Ljava/lang/String;", "getHeaders", "getMethod", "getMimeType", "getQueryParams", "getTitle", "getValue", "getRequestMethod", "Lcom/bbva/network/constant/Method;", "Companion", "gl-documents_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentDTO {

    @NotNull
    private static final String METHOD_GET = "get";

    @NotNull
    private static final String METHOD_POST = "post";

    @NotNull
    private final Map<String, Object> body;

    @Nullable
    private final String formatter;

    @Nullable
    private final Map<String, String> headers;

    @Nullable
    private final String method;

    @NotNull
    private final String mimeType;

    @Nullable
    private final Map<String, String> queryParams;

    @Nullable
    private final String title;

    @NotNull
    private final String value;

    public DocumentDTO(@NotNull String value, @NotNull String mimeType, @Nullable String str, @Nullable String str2, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @NotNull Map<String, ? extends Object> body, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(body, "body");
        this.value = value;
        this.mimeType = mimeType;
        this.title = str;
        this.method = str2;
        this.headers = map;
        this.queryParams = map2;
        this.body = body;
        this.formatter = str3;
    }

    @NotNull
    public final Map<String, Object> getBody() {
        return this.body;
    }

    @NotNull
    public final FilenameFormatter getFilenameFormatter() {
        return Intrinsics.areEqual(this.formatter, NoOpFormatter.ID) ? FilenameFormatters.INSTANCE.getNoOpFormatter() : FilenameFormatters.INSTANCE.getNoSpaceOrAscciFormatter();
    }

    @Nullable
    public final String getFormatter() {
        return this.formatter;
    }

    @Nullable
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @Nullable
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    @Nullable
    public final Map<String, String> getQueryParams() {
        return this.queryParams;
    }

    @NotNull
    public final Method getRequestMethod() {
        String lowerCase;
        String str = this.method;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            lowerCase = null;
        }
        return Intrinsics.areEqual(lowerCase, "post") ? Method.POST : Method.GET;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public /* synthetic */ DocumentDTO(String str, String str2, String str3, String str4, Map map, Map map2, Map map3, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? UUID.randomUUID().toString() : str3, (i10 & 8) != 0 ? "get" : str4, (i10 & 16) != 0 ? q.emptyMap() : map, (i10 & 32) != 0 ? q.emptyMap() : map2, (i10 & 64) != 0 ? q.emptyMap() : map3, (i10 & 128) != 0 ? NoSpaceOrAscciFormatter.ID : str5);
    }
}
