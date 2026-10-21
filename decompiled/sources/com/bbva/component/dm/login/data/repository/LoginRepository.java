package com.bbva.component.dm.login.data.repository;

import com.bbva.component.dm.login.data.datasource.contract.LoginDataSourceContract;
import com.bbva.component.dm.login.data.model.response.LoginResponse;
import com.bbva.component.dm.login.domain.boundary.LoginBoundary;
import com.bbva.component.dm.login.domain.model.LoginCredentials;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoginRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/component/dm/login/data/repository/LoginRepository;", "Lcom/bbva/component/dm/login/domain/boundary/LoginBoundary;", "Lcom/bbva/component/dm/login/domain/model/LoginCredentials;", "loginDTO", "Lcom/bbva/component/dm/login/data/model/response/LoginResponse;", "login", "anonymousLogin", "", "logout", "Lcom/bbva/component/dm/login/data/datasource/contract/LoginDataSourceContract;", "loginDataSource", "<init>", "(Lcom/bbva/component/dm/login/data/datasource/contract/LoginDataSourceContract;)V", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
public final class LoginRepository implements LoginBoundary {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LoginDataSourceContract f27709a;

    public LoginRepository(@NotNull LoginDataSourceContract loginDataSource) {
        Intrinsics.checkNotNullParameter(loginDataSource, "loginDataSource");
        this.f27709a = loginDataSource;
    }

    @Override // com.bbva.component.dm.login.domain.boundary.LoginBoundary
    @NotNull
    public LoginResponse anonymousLogin() {
        return this.f27709a.anonymousLogin();
    }

    @Override // com.bbva.component.dm.login.domain.boundary.LoginBoundary
    @NotNull
    public LoginResponse login(@NotNull LoginCredentials loginDTO) {
        Intrinsics.checkNotNullParameter(loginDTO, "loginDTO");
        return this.f27709a.login(loginDTO);
    }

    @Override // com.bbva.component.dm.login.domain.boundary.LoginBoundary
    public void logout() {
        this.f27709a.logout();
    }
}
