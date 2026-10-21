package com.bbva.component.dm.naturalauth.data.mapper.common.request;

import bk.q;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.dm.naturalauth.domain.model.params.ListAuthenticatorsParams;
import com.bbva.glomoutils.Mapper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetAuthenticatorsParamsMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/mapper/common/request/GetAuthenticatorsParamsMapper;", "Lcom/bbva/glomoutils/Mapper;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/ListAuthenticatorsParams;", "", "", "()V", "map", "input", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GetAuthenticatorsParamsMapper implements Mapper<ListAuthenticatorsParams, Map<String, ? extends String>> {
    @Override // com.bbva.glomoutils.Mapper
    @NotNull
    public Map<String, String> map(@NotNull ListAuthenticatorsParams input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return q.mutableMapOf(TuplesKt.to(Constants.originAppId, input.getF27883a()));
    }
}
