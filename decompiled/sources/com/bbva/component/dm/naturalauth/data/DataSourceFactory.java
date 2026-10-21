package com.bbva.component.dm.naturalauth.data;

import com.bbva.component.dm.naturalauth.data.mapper.common.request.AuthenticationRequestBodyMapper;
import com.bbva.component.dm.naturalauth.data.mapper.common.request.DeleteBodyMapper;
import com.bbva.component.dm.naturalauth.data.mapper.common.request.DeleteQueryParamsMapper;
import com.bbva.component.dm.naturalauth.data.mapper.common.request.GetAuthenticatorsParamsMapper;
import com.bbva.component.dm.naturalauth.data.mapper.common.request.RegisterRequestBodyMapper;
import com.bbva.component.dm.naturalauth.data.mapper.common.response.AuthenticationResponseMapper;
import com.bbva.component.dm.naturalauth.data.mapper.common.response.GetAuthenticatorsResponseMapper;
import com.bbva.component.dm.naturalauth.data.mapper.common.response.MessageResponseMapper;
import com.bbva.component.dm.naturalauth.domain.model.NaturalAuthEndpoints;
import com.bbva.component.dm.naturalauth.domain.model.ServiceType;
import com.bbva.network.NetworkWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DataSourceFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\b¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/DataSourceFactory;", "", "Lcom/bbva/component/dm/naturalauth/data/ListAuthenticatorsDataSource;", "getListAuthenticatorsDataSource", "Lcom/bbva/component/dm/naturalauth/data/RegisterDataSource;", "getRegisterAuthDataSource", "Lcom/bbva/component/dm/naturalauth/data/AuthDataSource;", "getAuthDataSource", "Lcom/bbva/component/dm/naturalauth/data/DeleteDataSource;", "getDeleteDataSource", "Lcom/bbva/component/dm/naturalauth/domain/model/ServiceType;", "serviceType", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "Lcom/bbva/component/dm/naturalauth/domain/model/NaturalAuthEndpoints;", "endpoints", "<init>", "(Lcom/bbva/component/dm/naturalauth/domain/model/ServiceType;Lcom/bbva/network/NetworkWorker;Lcom/bbva/component/dm/naturalauth/domain/model/NaturalAuthEndpoints;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class DataSourceFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ServiceType f27794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final NaturalAuthEndpoints f27796c;

    public DataSourceFactory(@NotNull ServiceType serviceType, @NotNull NetworkWorker networkWorker, @NotNull NaturalAuthEndpoints endpoints) {
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(endpoints, "endpoints");
        this.f27794a = serviceType;
        this.f27795b = networkWorker;
        this.f27796c = endpoints;
    }

    @NotNull
    public final AuthDataSource getAuthDataSource() {
        ServiceType serviceType = this.f27794a;
        return new AuthDataSource(this.f27795b, this.f27796c, new AuthenticationRequestBodyMapper(serviceType), new AuthenticationResponseMapper(serviceType));
    }

    @NotNull
    public final DeleteDataSource getDeleteDataSource() {
        NetworkWorker networkWorker = this.f27795b;
        NaturalAuthEndpoints naturalAuthEndpoints = this.f27796c;
        ServiceType serviceType = this.f27794a;
        return new DeleteDataSource(networkWorker, naturalAuthEndpoints, new DeleteQueryParamsMapper(serviceType.getVersion()), new DeleteBodyMapper(serviceType.getVersion()), new MessageResponseMapper());
    }

    @NotNull
    public final ListAuthenticatorsDataSource getListAuthenticatorsDataSource() {
        return new ListAuthenticatorsDataSource(this.f27795b, this.f27796c, new GetAuthenticatorsParamsMapper(), new GetAuthenticatorsResponseMapper(this.f27794a.getVersion()));
    }

    @NotNull
    public final RegisterDataSource getRegisterAuthDataSource() {
        return new RegisterDataSource(this.f27795b, this.f27796c, new RegisterRequestBodyMapper(this.f27794a.getVersion()), new MessageResponseMapper());
    }
}
