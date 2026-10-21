package com.bbva.component.dm.login.data.datasource.contract;

import com.bbva.component.dm.login.data.model.response.LoginResponse;
import com.bbva.component.dm.login.domain.model.LoginCredentials;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoginDataSourceContract.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/dm/login/data/datasource/contract/LoginDataSourceContract;", "", "blockedUserCodes", "", "", "getBlockedUserCodes", "()Ljava/util/List;", "expiredPasswordCodes", "getExpiredPasswordCodes", "invalidCredentialsCodes", "getInvalidCredentialsCodes", "unauthorizedAccessCodes", "getUnauthorizedAccessCodes", "userNotAllowedCodes", "getUserNotAllowedCodes", "anonymousLogin", "Lcom/bbva/component/dm/login/data/model/response/LoginResponse;", "login", "credentials", "Lcom/bbva/component/dm/login/domain/model/LoginCredentials;", "logout", "", "component-dm-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface LoginDataSourceContract {
    @NotNull
    LoginResponse anonymousLogin();

    @NotNull
    List<String> getBlockedUserCodes();

    @NotNull
    List<String> getExpiredPasswordCodes();

    @NotNull
    List<String> getInvalidCredentialsCodes();

    @NotNull
    List<String> getUnauthorizedAccessCodes();

    @NotNull
    List<String> getUserNotAllowedCodes();

    @NotNull
    LoginResponse login(@NotNull LoginCredentials credentials);

    void logout();
}
