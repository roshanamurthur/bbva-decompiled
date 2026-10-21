package com.bbva.component.dm.naturalauth.data.mapper.service.type.aso;

import bk.d;
import bk.q;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.dm.naturalauth.domain.model.params.AuthenticationParams;
import com.bbva.glomoutils.Mapper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AsoRequestBodyMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/mapper/service/type/aso/AsoRequestBodyMapper;", "Lcom/bbva/glomoutils/Mapper;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/AuthenticationParams;", "", "", "", "input", "map", "<init>", "()V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class AsoRequestBodyMapper implements Mapper<AuthenticationParams, Map<String, ? extends Object>> {
    public static Map a(String str, String str2) {
        return q.mapOf(TuplesKt.to(Constants.idAuthenticationData, str), TuplesKt.to(Constants.authenticationData, d.listOf(str2)));
    }

    @Override // com.bbva.glomoutils.Mapper
    @NotNull
    public Map<String, Object> map(@NotNull AuthenticationParams input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Pair[] pairArr = new Pair[2];
        Pair[] pairArr2 = new Pair[4];
        pairArr2[0] = TuplesKt.to("userID", input.getOriginUserId());
        pairArr2[1] = TuplesKt.to("consumerID", input.getCom.bbva.component.dm.naturalauth.Constants.originAppId java.lang.String());
        pairArr2[2] = TuplesKt.to(Constants.authenticationType, input.getF27865c());
        Object[] objArr = new Object[2];
        objArr[0] = a("message", input.getMessage());
        objArr[1] = Intrinsics.areEqual(input.getF27865c(), Constants.authTypeAsoRequestQuickLogin) ? a(Constants.internalDeviceId, input.getDeviceId()) : a("deviceId", input.getDeviceId());
        pairArr2[3] = TuplesKt.to(Constants.authenticationData, CollectionsKt__CollectionsKt.listOf(objArr));
        Map mapMapOf = q.mapOf(pairArr2);
        if (!(input instanceof AuthenticationParams.Init)) {
            if (!(input instanceof AuthenticationParams.Finish)) {
                throw new NoWhenBranchMatchedException();
            }
            mapMapOf = q.plus(mapMapOf, TuplesKt.to("multistepProcessId", ((AuthenticationParams.Finish) input).getMultiStepProcessId()));
        }
        pairArr[0] = TuplesKt.to("authentication", mapMapOf);
        pairArr[1] = TuplesKt.to(Constants.backendUserRequest, q.mapOf(TuplesKt.to(Constants.backendRequestUserId, ""), TuplesKt.to(Constants.accessCode, input.getOriginUserId()), TuplesKt.to(Constants.dialogId, "")));
        return q.mapOf(pairArr);
    }
}
