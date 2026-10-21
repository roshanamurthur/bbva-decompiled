package com.bbva.glomo.user.domain.usecase;

import androidx.autofill.HintConstants;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomoutils.usecase.UseCaseParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StoreRememberedUserUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomo/user/domain/usecase/RememberedUserParams;", "Lcom/bbva/glomoutils/usecase/UseCaseParams;", "", "a", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", HintConstants.AUTOFILL_HINT_USERNAME, "b", "getDocument", "document", "", "c", "Z", LocalStorageConstantsKt.IS_BUSINESS_USER_KEY, "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class RememberedUserParams implements UseCaseParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String username;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String document;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean isBusinessUser;

    public RememberedUserParams(@NotNull String username, @NotNull String document, boolean z10) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(document, "document");
        this.username = username;
        this.document = document;
        this.isBusinessUser = z10;
    }

    @NotNull
    public final String getDocument() {
        return this.document;
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: isBusinessUser, reason: from getter */
    public final boolean getIsBusinessUser() {
        return this.isBusinessUser;
    }

    public /* synthetic */ RememberedUserParams(String str, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? false : z10);
    }
}
