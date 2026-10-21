package com.bbva.component.dm.naturalauth.data.mapper.service.version.v1;

import bk.p;
import bk.q;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.dm.naturalauth.domain.model.params.RegisterParams;
import com.bbva.glomoutils.Mapper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RegisterRequestBodyV1Mapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/mapper/service/version/v1/RegisterRequestBodyV1Mapper;", "Lcom/bbva/glomoutils/Mapper;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/RegisterParams;", "", "", "", "()V", "map", "input", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RegisterRequestBodyV1Mapper implements Mapper<RegisterParams, Map<String, ? extends Object>> {
    @Override // com.bbva.glomoutils.Mapper
    @NotNull
    public Map<String, Object> map(@NotNull RegisterParams input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return p.mapOf(TuplesKt.to(Constants.device, q.mapOf(TuplesKt.to(Constants.internalDeviceId, input.getDeviceId()), TuplesKt.to("id", input.getExternalDeviceId()))));
    }
}
