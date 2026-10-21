package com.bbva.glomo.user.domain.mapper.mobileservices;

import com.bbva.glomo.user.domain.model.MobileServicesType;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MobileServicesTypeMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/bbva/glomo/user/domain/mapper/mobileservices/MobileServicesTypeMapper;", "", "Lcom/bbva/glomo/user/domain/model/MobileServicesType;", "mobileServiceType", "", "convert", "Lcom/google/gson/Gson;", "typeAdapterGson", "<init>", "(Lcom/google/gson/Gson;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class MobileServicesTypeMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Gson f30781a;

    public MobileServicesTypeMapper(@NotNull Gson typeAdapterGson) {
        Intrinsics.checkNotNullParameter(typeAdapterGson, "typeAdapterGson");
        this.f30781a = typeAdapterGson;
    }

    @NotNull
    public final String convert(@NotNull MobileServicesType mobileServiceType) {
        Intrinsics.checkNotNullParameter(mobileServiceType, "mobileServiceType");
        String json = this.f30781a.toJson(mobileServiceType);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }
}
