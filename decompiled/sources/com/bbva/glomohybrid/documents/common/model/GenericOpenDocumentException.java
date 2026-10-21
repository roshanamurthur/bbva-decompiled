package com.bbva.glomohybrid.documents.common.model;

import bk.q;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Models.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/model/GenericOpenDocumentException;", "Lcom/bbva/glomohybrid/documents/common/model/OpenDocumentException;", "code", "", "body", "", "headers", "", "(ILjava/lang/String;Ljava/util/Map;)V", "gl-documents_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GenericOpenDocumentException extends OpenDocumentException {
    public /* synthetic */ GenericOpenDocumentException(int i10, String str, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? q.emptyMap() : map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericOpenDocumentException(int i10, @Nullable String str, @NotNull Map<String, String> headers) {
        super(i10, str, headers, null);
        Intrinsics.checkNotNullParameter(headers, "headers");
    }
}
