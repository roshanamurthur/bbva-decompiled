package com.bbva.component.dm.naturalauth.data.mapper.common.request;

import bk.p;
import bk.q;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.dm.naturalauth.domain.model.Version;
import com.bbva.component.dm.naturalauth.domain.model.params.DeleteParams;
import com.bbva.glomoutils.Mapper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeleteQueryParamsMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/mapper/common/request/DeleteQueryParamsMapper;", "Lcom/bbva/glomoutils/Mapper;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/DeleteParams;", "", "", "input", "map", "Lcom/bbva/component/dm/naturalauth/domain/model/Version;", "version", "<init>", "(Lcom/bbva/component/dm/naturalauth/domain/model/Version;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class DeleteQueryParamsMapper implements Mapper<DeleteParams, Map<String, ? extends String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Version f27822a;

    public DeleteQueryParamsMapper(@NotNull Version version) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.f27822a = version;
    }

    @Override // com.bbva.glomoutils.Mapper
    @NotNull
    public Map<String, String> map(@NotNull DeleteParams input) {
        Map mapEmptyMap;
        Intrinsics.checkNotNullParameter(input, "input");
        Version.V0 v0 = Version.V0.INSTANCE;
        Version version = this.f27822a;
        if (Intrinsics.areEqual(version, v0)) {
            return q.emptyMap();
        }
        if (!Intrinsics.areEqual(version, Version.V1.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        Map mapMapOf = q.mapOf(TuplesKt.to(Constants.originAppId, input.getF27873b()), TuplesKt.to(Constants.internalDeviceId, input.getDeviceId()));
        if (input instanceof DeleteParams.DeleteOneAuthenticatorParams) {
            mapEmptyMap = p.mapOf(TuplesKt.to(Constants.registrationId, ((DeleteParams.DeleteOneAuthenticatorParams) input).getAuthenticator()));
        } else if (input instanceof DeleteParams.DeleteAllAuthenticators) {
            mapEmptyMap = p.mapOf(TuplesKt.to("message", ((DeleteParams.DeleteAllAuthenticators) input).getMessage()));
        } else {
            if (!(input instanceof DeleteParams.DeleteAllAuthenticatorsFromDevice)) {
                throw new NoWhenBranchMatchedException();
            }
            mapEmptyMap = q.emptyMap();
        }
        return q.plus(mapMapOf, mapEmptyMap);
    }
}
