package com.bbva.glomo.user.domain.usecase;

import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.user.domain.mapper.mobileservices.MobileServicesTypeMapperProvider;
import com.bbva.glomo.user.domain.model.MobileServicesType;
import com.bbva.glomoutils.mobileservices.MobileServices;
import com.bbva.glomoutils.usecase.UseCase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PersistMobileServicesUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomo/user/domain/usecase/PersistMobileServicesUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "", "execute", "Lcom/bbva/glomoutils/mobileservices/MobileServices;", "mobileServices", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomoutils/mobileservices/MobileServices;Lcom/bbva/glomo/storage/MainStorage;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class PersistMobileServicesUseCase implements UseCase<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MobileServices f30836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MainStorage f30837b;

    public PersistMobileServicesUseCase(@NotNull MobileServices mobileServices, @NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(mobileServices, "mobileServices");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30836a = mobileServices;
        this.f30837b = storage;
    }

    @Override // com.bbva.glomoutils.usecase.UseCase
    public /* bridge */ /* synthetic */ Unit execute() {
        execute2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: execute, reason: avoid collision after fix types in other method */
    public void execute2() {
        MobileServices mobileServices = this.f30836a;
        MobileServicesType mobileServicesType = new MobileServicesType(mobileServices.getIsGoogle(), mobileServices.isHuawei(), mobileServices.isHuaweiOnly());
        MainStorage.put$default(this.f30837b, LocalStorageConstantsKt.MOBILE_SERVICES_KEY, new MobileServicesTypeMapperProvider().getMapper().convert(mobileServicesType), false, null, 12, null);
    }
}
