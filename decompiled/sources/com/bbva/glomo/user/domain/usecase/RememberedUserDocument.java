package com.bbva.glomo.user.domain.usecase;

import com.bbva.glomoutils.usecase.UseCaseParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StoreRememberedUserDocumentUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/glomo/user/domain/usecase/RememberedUserDocument;", "Lcom/bbva/glomoutils/usecase/UseCaseParams;", "", "a", "Ljava/lang/String;", "getDocument", "()Ljava/lang/String;", "document", "<init>", "(Ljava/lang/String;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class RememberedUserDocument implements UseCaseParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String document;

    public RememberedUserDocument(@NotNull String document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.document = document;
    }

    @NotNull
    public final String getDocument() {
        return this.document;
    }
}
