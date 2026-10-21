package com.bbva.component.dm.login.data.datasource;

import com.bbva.component.dm.login.data.datasource.legacy.UserValidation;
import com.bbva.component.dm.login.data.mapper.GrantingTicketRequestMapper;
import com.bbva.component.dm.login.data.mapper.LoginResponseMapper;
import com.bbva.component.dm.login.data.model.response.LoginResponse;
import com.bbva.component.dm.login.datamanager.config.GlobalLoginConfig;
import com.bbva.component.dm.login.domain.model.LoginCredentials;
import com.bbva.network.NetworkWorker;
import com.bbva.network.constant.Method;
import com.bbva.network.model.response.NetworkResponse;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AsoDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/bbva/component/dm/login/data/datasource/AsoDataSource;", "Lcom/bbva/component/dm/login/data/datasource/LoginDataSource;", "Lcom/bbva/component/dm/login/domain/model/LoginCredentials;", "credentials", "Lcom/bbva/component/dm/login/data/model/response/LoginResponse;", "login", "anonymousLogin", "", "logout", "", "h", "Ljava/lang/String;", "getFieldCode", "()Ljava/lang/String;", "fieldCode", "i", "getFieldMessage", "fieldMessage", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "Lcom/bbva/component/dm/login/datamanager/config/GlobalLoginConfig;", "loginConfig", "<init>", "(Lcom/bbva/network/NetworkWorker;Lcom/bbva/component/dm/login/datamanager/config/GlobalLoginConfig;)V", "LoginResponseASOMapper", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
public final class AsoDataSource extends LoginDataSource {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final GlobalLoginConfig f27670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fieldCode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fieldMessage;

    /* JADX INFO: compiled from: AsoDataSource.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/dm/login/data/datasource/AsoDataSource$LoginResponseASOMapper;", "Lcom/bbva/component/dm/login/data/datasource/LoginDataSource$Mapper;", "Lcom/bbva/network/model/response/NetworkResponse;", "Lcom/bbva/component/dm/login/data/model/response/LoginResponse;", "()V", "map", "input", "component-dm-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class LoginResponseASOMapper implements LoginDataSource.Mapper<NetworkResponse, LoginResponse> {
        @Override // com.bbva.component.dm.login.data.datasource.LoginDataSource.Mapper
        @NotNull
        public LoginResponse map(@NotNull NetworkResponse input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return LoginResponseMapper.INSTANCE.fromNetworkResponseToLoginResponseASO$component_dm_login_release(input);
        }
    }

    public AsoDataSource(@NotNull NetworkWorker networkWorker, @NotNull GlobalLoginConfig loginConfig) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        this.f27669f = networkWorker;
        this.f27670g = loginConfig;
        this.fieldCode = "error-code";
        this.fieldMessage = "error-message";
    }

    @Override // com.bbva.component.dm.login.data.datasource.contract.LoginDataSourceContract
    @NotNull
    public LoginResponse anonymousLogin() {
        throw new UnsupportedOperationException("AnonymousLogin not implemented in ASO services");
    }

    @Override // com.bbva.component.dm.login.data.datasource.LoginDataSource
    @NotNull
    public String getFieldCode() {
        return this.fieldCode;
    }

    @Override // com.bbva.component.dm.login.data.datasource.LoginDataSource
    @NotNull
    public String getFieldMessage() {
        return this.fieldMessage;
    }

    @Override // com.bbva.component.dm.login.data.datasource.LoginDataSource, com.bbva.component.dm.login.data.datasource.contract.LoginDataSourceContract
    @NotNull
    public LoginResponse login(@NotNull LoginCredentials credentials) {
        Intrinsics.checkNotNullParameter(credentials, "credentials");
        Gson gson = new Gson();
        GrantingTicketRequestMapper grantingTicketRequestMapper = GrantingTicketRequestMapper.INSTANCE;
        String formattedUserId = UserValidation.getFormattedUserId(credentials.getUsername());
        Intrinsics.checkNotNullExpressionValue(formattedUserId, "getFormattedUserId(credentials.username)");
        String password = credentials.getPassword();
        GlobalLoginConfig globalLoginConfig = this.f27670g;
        String body = gson.toJson(grantingTicketRequestMapper.toLoginDTO$component_dm_login_release(formattedUserId, password, globalLoginConfig));
        String strStringPlus = Intrinsics.stringPlus(globalLoginConfig.getHost(), globalLoginConfig.getPath());
        Intrinsics.checkNotNullExpressionValue(body, "body");
        return executeRequest(this.f27669f, LoginDataSource.createRequest$default(this, strStringPlus, body, null, Method.POST, 4, null), new LoginResponseASOMapper());
    }

    @Override // com.bbva.component.dm.login.data.datasource.LoginDataSource, com.bbva.component.dm.login.data.datasource.contract.LoginDataSourceContract
    public void logout() {
    }
}
