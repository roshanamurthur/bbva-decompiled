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

/* JADX INFO: compiled from: DeleteBodyMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/mapper/common/request/DeleteBodyMapper;", "Lcom/bbva/glomoutils/Mapper;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/DeleteParams;", "", "", "", "input", "map", "Lcom/bbva/component/dm/naturalauth/domain/model/Version;", "version", "<init>", "(Lcom/bbva/component/dm/naturalauth/domain/model/Version;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class DeleteBodyMapper implements Mapper<DeleteParams, Map<String, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Version f27821a;

    public DeleteBodyMapper(@NotNull Version version) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.f27821a = version;
    }

    @Override // com.bbva.glomoutils.Mapper
    @NotNull
    public Map<String, Object> map(@NotNull DeleteParams input) {
        Map mapMapOf;
        Intrinsics.checkNotNullParameter(input, "input");
        Version.V0 v0 = Version.V0.INSTANCE;
        Version version = this.f27821a;
        if (!Intrinsics.areEqual(version, v0)) {
            if (Intrinsics.areEqual(version, Version.V1.INSTANCE)) {
                return q.emptyMap();
            }
            throw new NoWhenBranchMatchedException();
        }
        Map mapMapOf2 = q.mapOf(TuplesKt.to(Constants.originAppId, input.getF27873b()), TuplesKt.to("deviceId", input.getDeviceId()));
        if (input instanceof DeleteParams.DeleteOneAuthenticatorParams) {
            mapMapOf = q.mapOf(TuplesKt.to(Constants.registrationId, ((DeleteParams.DeleteOneAuthenticatorParams) input).getAuthenticator()), TuplesKt.to(Constants.deleteAll, 0));
        } else if (input instanceof DeleteParams.DeleteAllAuthenticators) {
            mapMapOf = q.mapOf(TuplesKt.to("message", ((DeleteParams.DeleteAllAuthenticators) input).getMessage()), TuplesKt.to(Constants.deleteAll, 1));
        } else {
            if (!(input instanceof DeleteParams.DeleteAllAuthenticatorsFromDevice)) {
                throw new NoWhenBranchMatchedException();
            }
            mapMapOf = p.mapOf(TuplesKt.to(Constants.deleteAll, 1));
        }
        return q.plus(mapMapOf2, mapMapOf);
    }
}
