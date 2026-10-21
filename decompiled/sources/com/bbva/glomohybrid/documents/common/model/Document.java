package com.bbva.glomohybrid.documents.common.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import bk.q;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.documents.common.repository.dataSource.FilenameFormatter;
import com.bbva.glomohybrid.documents.common.repository.dataSource.FilenameFormatters;
import com.bbva.network.constant.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Models.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003J\u007f\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006*"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/model/Document;", "", "value", "", "mimeType", "fileName", "method", "Lcom/bbva/network/constant/Method;", "headers", "", "queryParams", "body", "formatter", "Lcom/bbva/glomohybrid/documents/common/repository/dataSource/FilenameFormatter;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/network/constant/Method;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/bbva/glomohybrid/documents/common/repository/dataSource/FilenameFormatter;)V", "getBody", "()Ljava/util/Map;", "getFileName", "()Ljava/lang/String;", "getFormatter", "()Lcom/bbva/glomohybrid/documents/common/repository/dataSource/FilenameFormatter;", "getHeaders", "getMethod", "()Lcom/bbva/network/constant/Method;", "getMimeType", "getQueryParams", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "gl-documents_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Document {

    @Nullable
    private final Map<String, Object> body;

    @NotNull
    private final String fileName;

    @NotNull
    private final FilenameFormatter formatter;

    @NotNull
    private final Map<String, String> headers;

    @NotNull
    private final Method method;

    @NotNull
    private final String mimeType;

    @NotNull
    private final Map<String, String> queryParams;

    @NotNull
    private final String value;

    public Document(@NotNull String value, @NotNull String mimeType, @NotNull String fileName, @NotNull Method method, @NotNull Map<String, String> headers, @NotNull Map<String, String> queryParams, @Nullable Map<String, ? extends Object> map, @NotNull FilenameFormatter formatter) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.value = value;
        this.mimeType = mimeType;
        this.fileName = fileName;
        this.method = method;
        this.headers = headers;
        this.queryParams = queryParams;
        this.body = map;
        this.formatter = formatter;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Method getMethod() {
        return this.method;
    }

    @NotNull
    public final Map<String, String> component5() {
        return this.headers;
    }

    @NotNull
    public final Map<String, String> component6() {
        return this.queryParams;
    }

    @Nullable
    public final Map<String, Object> component7() {
        return this.body;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final FilenameFormatter getFormatter() {
        return this.formatter;
    }

    @NotNull
    public final Document copy(@NotNull String value, @NotNull String mimeType, @NotNull String fileName, @NotNull Method method, @NotNull Map<String, String> headers, @NotNull Map<String, String> queryParams, @Nullable Map<String, ? extends Object> body, @NotNull FilenameFormatter formatter) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new Document(value, mimeType, fileName, method, headers, queryParams, body, formatter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Document)) {
            return false;
        }
        Document document = (Document) other;
        return Intrinsics.areEqual(this.value, document.value) && Intrinsics.areEqual(this.mimeType, document.mimeType) && Intrinsics.areEqual(this.fileName, document.fileName) && this.method == document.method && Intrinsics.areEqual(this.headers, document.headers) && Intrinsics.areEqual(this.queryParams, document.queryParams) && Intrinsics.areEqual(this.body, document.body) && Intrinsics.areEqual(this.formatter, document.formatter);
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
    public final FilenameFormatter getFormatter() {
        return this.formatter;
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
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    public final Map<String, String> getQueryParams() {
        return this.queryParams;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = (this.queryParams.hashCode() + ((this.headers.hashCode() + ((this.method.hashCode() + n1.c(this.fileName, n1.c(this.mimeType, this.value.hashCode() * 31, 31), 31)) * 31)) * 31)) * 31;
        Map<String, Object> map = this.body;
        return this.formatter.hashCode() + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.value;
        String str2 = this.mimeType;
        String str3 = this.fileName;
        Method method = this.method;
        Map<String, String> map = this.headers;
        Map<String, String> map2 = this.queryParams;
        Map<String, Object> map3 = this.body;
        FilenameFormatter filenameFormatter = this.formatter;
        StringBuilder sbC = a.c("Document(value=", str, ", mimeType=", str2, ", fileName=");
        sbC.append(str3);
        sbC.append(", method=");
        sbC.append(method);
        sbC.append(", headers=");
        sbC.append(map);
        sbC.append(", queryParams=");
        sbC.append(map2);
        sbC.append(", body=");
        sbC.append(map3);
        sbC.append(", formatter=");
        sbC.append(filenameFormatter);
        sbC.append(")");
        return sbC.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Document(String str, String str2, String str3, Method method, Map map, Map map2, Map map3, FilenameFormatter filenameFormatter, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        if ((i10 & 4) != 0) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            str4 = string;
        } else {
            str4 = str3;
        }
        this(str, str2, str4, (i10 & 8) != 0 ? Method.GET : method, (i10 & 16) != 0 ? q.emptyMap() : map, (i10 & 32) != 0 ? q.emptyMap() : map2, (i10 & 64) != 0 ? q.emptyMap() : map3, (i10 & 128) != 0 ? FilenameFormatters.INSTANCE.getNoSpaceOrAscciFormatter() : filenameFormatter);
    }
}
