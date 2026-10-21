package com.bbva.component.dm.naturalauth.data.mapper.common.request;

import com.bbva.component.dm.naturalauth.data.mapper.service.type.aso.AsoRequestBodyMapper;
import com.bbva.component.dm.naturalauth.data.mapper.service.type.jwt.JwtRequestBodyMapper;
import com.bbva.component.dm.naturalauth.domain.model.ServiceType;
import com.bbva.component.dm.naturalauth.domain.model.params.AuthenticationParams;
import com.bbva.glomoutils.Mapper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AuthenticationRequestBodyMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/mapper/common/request/AuthenticationRequestBodyMapper;", "Lcom/bbva/glomoutils/Mapper;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/AuthenticationParams;", "", "", "", "input", "map", "Lcom/bbva/component/dm/naturalauth/domain/model/ServiceType;", "serviceType", "<init>", "(Lcom/bbva/component/dm/naturalauth/domain/model/ServiceType;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class AuthenticationRequestBodyMapper implements Mapper<AuthenticationParams, Map<String, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ServiceType f27820a;

    public AuthenticationRequestBodyMapper(@NotNull ServiceType serviceType) {
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        this.f27820a = serviceType;
    }

    @Override // com.bbva.glomoutils.Mapper
    @NotNull
    public Map<String, Object> map(@NotNull AuthenticationParams input) {
        Mapper jwtRequestBodyMapper;
        Intrinsics.checkNotNullParameter(input, "input");
        ServiceType serviceType = this.f27820a;
        if (serviceType instanceof ServiceType.AsoServiceType) {
            jwtRequestBodyMapper = new AsoRequestBodyMapper();
        } else {
            if (!(serviceType instanceof ServiceType.JwtServiceType)) {
                throw new NoWhenBranchMatchedException();
            }
            jwtRequestBodyMapper = new JwtRequestBodyMapper();
        }
        return (Map) jwtRequestBodyMapper.map(input);
    }
}
