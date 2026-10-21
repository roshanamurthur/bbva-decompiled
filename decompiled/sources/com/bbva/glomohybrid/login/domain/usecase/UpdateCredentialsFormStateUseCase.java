package com.bbva.glomohybrid.login.domain.usecase;

import com.bbva.component.ui.login.model.DocumentItem;
import com.bbva.component.ui.login.model.LoginState;
import com.bbva.glomohybrid.login.domain.model.CredentialsViewState;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UpdateCredentialsFormStateUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/usecase/UpdateCredentialsFormStateUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "Lcom/bbva/component/ui/login/model/DocumentItem;", "Lcom/bbva/component/ui/login/model/LoginState;", "params", "execute", "Lcom/bbva/glomohybrid/login/domain/model/CredentialsViewState;", "credentialsViewState", "<init>", "(Lcom/bbva/glomohybrid/login/domain/model/CredentialsViewState;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class UpdateCredentialsFormStateUseCase implements UseCaseWithParams<DocumentItem, LoginState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CredentialsViewState f33450a;

    public UpdateCredentialsFormStateUseCase(@NotNull CredentialsViewState credentialsViewState) {
        Intrinsics.checkNotNullParameter(credentialsViewState, "credentialsViewState");
        this.f33450a = credentialsViewState;
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    @NotNull
    public LoginState execute(@NotNull DocumentItem params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f33450a.update(params);
    }
}
