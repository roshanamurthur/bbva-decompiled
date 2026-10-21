package com.bbva.component.dm.login.data.datasource;

import com.bbva.component.dm.login.data.mapper.GrantingTicketRequestMapper;
import com.bbva.component.dm.login.data.mapper.LoginResponseMapper;
import com.bbva.component.dm.login.data.model.response.LoginResponse;
import com.bbva.component.dm.login.datamanager.config.GlobalLoginConfig;
import com.bbva.component.dm.login.datamanager.model.LoginException;
import com.bbva.component.dm.login.domain.model.LoginCredentials;
import com.bbva.network.NetworkWorker;
import com.bbva.network.constant.Method;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.exceptions.NotConnectionAvailable;
import com.bbva.network.model.response.NetworkResponse;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: GlobalLoginDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0013\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/bbva/component/dm/login/data/datasource/GlobalLoginDataSource;", "Lcom/bbva/component/dm/login/data/datasource/LoginDataSource;", "Lcom/bbva/component/dm/login/domain/model/LoginCredentials;", "credentials", "Lcom/bbva/component/dm/login/data/model/response/LoginResponse;", "login", "anonymousLogin", "", "logout", "Lorg/json/JSONObject;", "jsonObject", "", "fieldName", "", "parseJsonObject", "h", "Ljava/lang/String;", "getFieldCode", "()Ljava/lang/String;", "fieldCode", "i", "getFieldMessage", "fieldMessage", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "Lcom/bbva/component/dm/login/datamanager/config/GlobalLoginConfig;", "loginConfig", "<init>", "(Lcom/bbva/network/NetworkWorker;Lcom/bbva/component/dm/login/datamanager/config/GlobalLoginConfig;)V", "LoginResponseGlobalMapper", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
public class GlobalLoginDataSource extends LoginDataSource {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final GlobalLoginConfig f27674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fieldCode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fieldMessage;

    /* JADX INFO: compiled from: GlobalLoginDataSource.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/dm/login/data/datasource/GlobalLoginDataSource$LoginResponseGlobalMapper;", "Lcom/bbva/component/dm/login/data/datasource/LoginDataSource$Mapper;", "Lcom/bbva/network/model/response/NetworkResponse;", "Lcom/bbva/component/dm/login/data/model/response/LoginResponse;", "()V", "map", "input", "component-dm-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class LoginResponseGlobalMapper implements LoginDataSource.Mapper<NetworkResponse, LoginResponse> {
        @Override // com.bbva.component.dm.login.data.datasource.LoginDataSource.Mapper
        @NotNull
        public LoginResponse map(@NotNull NetworkResponse input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return LoginResponseMapper.INSTANCE.fromNetworkResponseToLoginResponseGlobal$component_dm_login_release(input);
        }
    }

    public GlobalLoginDataSource(@NotNull NetworkWorker networkWorker, @NotNull GlobalLoginConfig loginConfig) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        this.f27673f = networkWorker;
        this.f27674g = loginConfig;
        this.fieldCode = "error-code";
        this.fieldMessage = "error-message";
    }

    @Override // com.bbva.component.dm.login.data.datasource.contract.LoginDataSourceContract
    @NotNull
    public LoginResponse anonymousLogin() throws LoginException {
        Gson gson = new Gson();
        GrantingTicketRequestMapper grantingTicketRequestMapper = GrantingTicketRequestMapper.INSTANCE;
        GlobalLoginConfig globalLoginConfig = this.f27674g;
        String body = gson.toJson(grantingTicketRequestMapper.toAnonymousLoginDTO$component_dm_login_release(globalLoginConfig));
        Intrinsics.checkNotNullExpressionValue(body, "body");
        return executeRequest(this.f27673f, LoginDataSource.createRequest$default(this, Intrinsics.stringPlus(globalLoginConfig.getHost(), globalLoginConfig.getPath()), body, null, Method.POST, 4, null), new LoginResponseGlobalMapper());
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
    public LoginResponse login(@NotNull LoginCredentials credentials) throws LoginException {
        Intrinsics.checkNotNullParameter(credentials, "credentials");
        Gson gson = new Gson();
        GrantingTicketRequestMapper grantingTicketRequestMapper = GrantingTicketRequestMapper.INSTANCE;
        String username = credentials.getUsername();
        String password = credentials.getPassword();
        GlobalLoginConfig globalLoginConfig = this.f27674g;
        String body = gson.toJson(grantingTicketRequestMapper.toLoginDTO$component_dm_login_release(username, password, globalLoginConfig));
        Intrinsics.checkNotNullExpressionValue(body, "body");
        return executeRequest(this.f27673f, LoginDataSource.createRequest$default(this, Intrinsics.stringPlus(globalLoginConfig.getHost(), globalLoginConfig.getPath()), body, null, Method.POST, 4, null), new LoginResponseGlobalMapper());
    }

    @Override // com.bbva.component.dm.login.data.datasource.LoginDataSource, com.bbva.component.dm.login.data.datasource.contract.LoginDataSourceContract
    public void logout() throws NotConnectionAvailable, ConnectionException {
        GlobalLoginConfig globalLoginConfig = this.f27674g;
        this.f27673f.execute(LoginDataSource.createRequest$default(this, Intrinsics.stringPlus(globalLoginConfig.getHost(), globalLoginConfig.getPath()), null, null, Method.DELETE, 6, null));
    }

    @Override // com.bbva.component.dm.login.data.datasource.LoginDataSource
    @Nullable
    public Object parseJsonObject(@NotNull JSONObject jsonObject, @NotNull String fieldName) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        return jsonObject.opt(fieldName);
    }
}
