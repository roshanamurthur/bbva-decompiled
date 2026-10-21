package com.bbva.component.dm.naturalauth.data.mapper.common.response;

import com.bbva.component.dm.naturalauth.data.mapper.service.type.aso.AsoAuthenticationResponseMapper;
import com.bbva.component.dm.naturalauth.data.mapper.service.type.jwt.JwtAuthenticationResponseMapper;
import com.bbva.component.dm.naturalauth.domain.model.AuthenticationResponse;
import com.bbva.component.dm.naturalauth.domain.model.ServiceType;
import com.bbva.glomoutils.Mapper;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AuthenticationResponseMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/mapper/common/response/AuthenticationResponseMapper;", "Lcom/bbva/glomoutils/Mapper;", "", "Lcom/bbva/component/dm/naturalauth/domain/model/AuthenticationResponse;", "input", "map", "Lcom/bbva/component/dm/naturalauth/domain/model/ServiceType;", "serviceType", "<init>", "(Lcom/bbva/component/dm/naturalauth/domain/model/ServiceType;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class AuthenticationResponseMapper implements Mapper<String, AuthenticationResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ServiceType f27824a;

    public AuthenticationResponseMapper(@NotNull ServiceType serviceType) {
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        this.f27824a = serviceType;
    }

    @Override // com.bbva.glomoutils.Mapper
    @NotNull
    public AuthenticationResponse map(@NotNull String input) {
        Mapper jwtAuthenticationResponseMapper;
        Intrinsics.checkNotNullParameter(input, "input");
        ServiceType serviceType = this.f27824a;
        if (serviceType instanceof ServiceType.AsoServiceType) {
            jwtAuthenticationResponseMapper = new AsoAuthenticationResponseMapper();
        } else {
            if (!(serviceType instanceof ServiceType.JwtServiceType)) {
                throw new NoWhenBranchMatchedException();
            }
            jwtAuthenticationResponseMapper = new JwtAuthenticationResponseMapper(null, 1, null);
        }
        return (AuthenticationResponse) jwtAuthenticationResponseMapper.map(input);
    }
}
