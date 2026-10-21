package com.bbva.component.dm.naturalauth.data.mapper.common.request;

import bk.q;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.dm.naturalauth.data.mapper.service.version.v0.RegisterRequestBodyV0Mapper;
import com.bbva.component.dm.naturalauth.data.mapper.service.version.v1.RegisterRequestBodyV1Mapper;
import com.bbva.component.dm.naturalauth.domain.model.Version;
import com.bbva.component.dm.naturalauth.domain.model.params.RegisterParams;
import com.bbva.glomoutils.Mapper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RegisterRequestBodyMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/mapper/common/request/RegisterRequestBodyMapper;", "Lcom/bbva/glomoutils/Mapper;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/RegisterParams;", "", "", "", "input", "map", "Lcom/bbva/component/dm/naturalauth/domain/model/Version;", "version", "<init>", "(Lcom/bbva/component/dm/naturalauth/domain/model/Version;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class RegisterRequestBodyMapper implements Mapper<RegisterParams, Map<String, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Version f27823a;

    public RegisterRequestBodyMapper(@NotNull Version version) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.f27823a = version;
    }

    @Override // com.bbva.glomoutils.Mapper
    @NotNull
    public Map<String, Object> map(@NotNull RegisterParams input) {
        Mapper registerRequestBodyV1Mapper;
        Intrinsics.checkNotNullParameter(input, "input");
        Version.V0 v0 = Version.V0.INSTANCE;
        Version version = this.f27823a;
        if (Intrinsics.areEqual(version, v0)) {
            registerRequestBodyV1Mapper = new RegisterRequestBodyV0Mapper();
        } else {
            if (!Intrinsics.areEqual(version, Version.V1.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            registerRequestBodyV1Mapper = new RegisterRequestBodyV1Mapper();
        }
        return q.plus(q.mapOf(TuplesKt.to(Constants.originAppId, input.getConsumerId()), TuplesKt.to(Constants.policy, input.getPolicy()), TuplesKt.to("message", input.getMessage())), (Map) registerRequestBodyV1Mapper.map(input));
    }
}
