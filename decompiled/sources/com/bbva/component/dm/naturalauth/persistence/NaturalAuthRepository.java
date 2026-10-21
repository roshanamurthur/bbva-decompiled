package com.bbva.component.dm.naturalauth.persistence;

import com.bbva.component.dm.naturalauth.data.DataSourceFactory;
import com.bbva.component.dm.naturalauth.domain.model.AuthenticationResponse;
import com.bbva.component.dm.naturalauth.domain.model.params.AuthenticationParams;
import com.bbva.component.dm.naturalauth.domain.model.params.DeleteParams;
import com.bbva.component.dm.naturalauth.domain.model.params.ListAuthenticatorsParams;
import com.bbva.component.dm.naturalauth.domain.model.params.RegisterParams;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoDevice;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NaturalAuthRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\r¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/naturalauth/persistence/NaturalAuthRepository;", "", "Lcom/bbva/component/dm/naturalauth/domain/model/params/ListAuthenticatorsParams;", "params", "", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoDevice;", "listAuthenticators", "Lcom/bbva/component/dm/naturalauth/domain/model/params/RegisterParams;", "", "register", "Lcom/bbva/component/dm/naturalauth/domain/model/params/AuthenticationParams;", "Lcom/bbva/component/dm/naturalauth/domain/model/AuthenticationResponse;", NaturalAuthenticationCommandFactory.ACTION_AUTHENTICATE, "Lcom/bbva/component/dm/naturalauth/domain/model/params/DeleteParams;", "delete", "Lcom/bbva/component/dm/naturalauth/data/DataSourceFactory;", "dataSourceFactory", "<init>", "(Lcom/bbva/component/dm/naturalauth/data/DataSourceFactory;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class NaturalAuthRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DataSourceFactory f27899a;

    public NaturalAuthRepository(@NotNull DataSourceFactory dataSourceFactory) {
        Intrinsics.checkNotNullParameter(dataSourceFactory, "dataSourceFactory");
        this.f27899a = dataSourceFactory;
    }

    @NotNull
    public final AuthenticationResponse authenticate(@NotNull AuthenticationParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f27899a.getAuthDataSource().authenticate(params);
    }

    @NotNull
    public final String delete(@NotNull DeleteParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f27899a.getDeleteDataSource().delete(params);
    }

    @NotNull
    public final List<FidoDevice> listAuthenticators(@NotNull ListAuthenticatorsParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f27899a.getListAuthenticatorsDataSource().listAuthenticators(params);
    }

    @NotNull
    public final String register(@NotNull RegisterParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f27899a.getRegisterAuthDataSource().register(params);
    }
}
