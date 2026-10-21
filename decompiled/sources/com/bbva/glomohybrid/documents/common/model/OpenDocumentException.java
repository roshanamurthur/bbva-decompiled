package com.bbva.glomohybrid.documents.common.model;

import bk.q;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: Models.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/model/OpenDocumentException;", "", "Lorg/json/JSONObject;", "getPayloadError", "", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "code", "", "q0", "Ljava/lang/String;", "getBody", "()Ljava/lang/String;", "body", "", "r0", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "headers", "Lcom/bbva/glomohybrid/documents/common/model/CannotOpenFileException;", "Lcom/bbva/glomohybrid/documents/common/model/DefaultOpenDocumentException;", "Lcom/bbva/glomohybrid/documents/common/model/FileNotFoundException;", "Lcom/bbva/glomohybrid/documents/common/model/GenericOpenDocumentException;", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
public abstract class OpenDocumentException extends Throwable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String body;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> headers;

    public OpenDocumentException() {
        throw null;
    }

    public /* synthetic */ OpenDocumentException(int i10, String str, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? q.emptyMap() : map, null);
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final JSONObject getPayloadError() {
        JSONObject jSONObject = new JSONObject(this.headers);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("code", Integer.valueOf(this.code));
        String str = this.body;
        if (str == null) {
            str = "";
        }
        pairArr[1] = TuplesKt.to("body", str);
        pairArr[2] = TuplesKt.to("headers", jSONObject);
        return new JSONObject(q.mapOf(pairArr));
    }

    public OpenDocumentException(int i10, String str, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        super(str);
        this.code = i10;
        this.body = str;
        this.headers = map;
    }
}
