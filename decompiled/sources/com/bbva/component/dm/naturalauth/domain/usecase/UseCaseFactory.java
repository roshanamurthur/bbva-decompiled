package com.bbva.component.dm.naturalauth.domain.usecase;

import com.bbva.component.dm.naturalauth.data.DataSourceFactory;
import com.bbva.component.dm.naturalauth.domain.model.NaturalAuthEndpoints;
import com.bbva.component.dm.naturalauth.domain.model.ServiceType;
import com.bbva.component.dm.naturalauth.persistence.NaturalAuthRepository;
import com.bbva.network.NetworkWorker;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UseCaseFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\b¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/usecase/UseCaseFactory;", "", "Lcom/bbva/component/dm/naturalauth/domain/usecase/ListAuthenticatorsUseCase;", "getListAuthenticatorsUseCase", "Lcom/bbva/component/dm/naturalauth/domain/usecase/RegisterUseCase;", "getRegisterUseCase", "Lcom/bbva/component/dm/naturalauth/domain/usecase/AuthenticateUseCase;", "getAuthenticateUseCase", "Lcom/bbva/component/dm/naturalauth/domain/usecase/DeleteUseCase;", "getDeleteUseCase", "Lcom/bbva/component/dm/naturalauth/domain/model/ServiceType;", "serviceType", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "Lcom/bbva/component/dm/naturalauth/domain/model/NaturalAuthEndpoints;", "endpoints", "<init>", "(Lcom/bbva/component/dm/naturalauth/domain/model/ServiceType;Lcom/bbva/network/NetworkWorker;Lcom/bbva/component/dm/naturalauth/domain/model/NaturalAuthEndpoints;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class UseCaseFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ServiceType f27894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final NaturalAuthEndpoints f27896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f27897d;

    /* JADX INFO: compiled from: UseCaseFactory.kt */
    public static final class a extends Lambda implements Function0<NaturalAuthRepository> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final NaturalAuthRepository invoke() {
            UseCaseFactory useCaseFactory = UseCaseFactory.this;
            return new NaturalAuthRepository(new DataSourceFactory(useCaseFactory.f27894a, useCaseFactory.f27895b, useCaseFactory.f27896c));
        }
    }

    public UseCaseFactory(@NotNull ServiceType serviceType, @NotNull NetworkWorker networkWorker, @NotNull NaturalAuthEndpoints endpoints) {
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(endpoints, "endpoints");
        this.f27894a = serviceType;
        this.f27895b = networkWorker;
        this.f27896c = endpoints;
        this.f27897d = LazyKt__LazyJVMKt.lazy(new a());
    }

    @NotNull
    public final AuthenticateUseCase getAuthenticateUseCase() {
        return new AuthenticateUseCase((NaturalAuthRepository) this.f27897d.getValue());
    }

    @NotNull
    public final DeleteUseCase getDeleteUseCase() {
        return new DeleteUseCase((NaturalAuthRepository) this.f27897d.getValue());
    }

    @NotNull
    public final ListAuthenticatorsUseCase getListAuthenticatorsUseCase() {
        return new ListAuthenticatorsUseCase((NaturalAuthRepository) this.f27897d.getValue());
    }

    @NotNull
    public final RegisterUseCase getRegisterUseCase() {
        return new RegisterUseCase((NaturalAuthRepository) this.f27897d.getValue());
    }
}
