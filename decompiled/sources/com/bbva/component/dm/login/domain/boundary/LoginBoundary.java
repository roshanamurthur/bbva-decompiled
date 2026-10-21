package com.bbva.component.dm.login.domain.boundary;

import com.bbva.component.dm.login.data.model.response.LoginResponse;
import com.bbva.component.dm.login.domain.model.LoginCredentials;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoginBoundary.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/bbva/component/dm/login/domain/boundary/LoginBoundary;", "", "anonymousLogin", "Lcom/bbva/component/dm/login/data/model/response/LoginResponse;", "login", "loginDTO", "Lcom/bbva/component/dm/login/domain/model/LoginCredentials;", "logout", "", "component-dm-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface LoginBoundary {
    @NotNull
    LoginResponse anonymousLogin();

    @NotNull
    LoginResponse login(@NotNull LoginCredentials loginDTO);

    void logout();
}
