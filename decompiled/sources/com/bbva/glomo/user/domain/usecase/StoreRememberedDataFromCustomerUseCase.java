package com.bbva.glomo.user.domain.usecase;

import com.bbva.glomo.StorageExtensionsKt;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StoreRememberedDataFromCustomerUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/glomo/user/domain/usecase/StoreRememberedDataFromCustomerUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "Lcom/bbva/glomo/user/domain/usecase/RememberedUserData;", "", "params", "execute", "Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;", "rememberedUserDataSource", "Lcom/bbva/glomo/storage/MainStorage;", "dataSource", "<init>", "(Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;Lcom/bbva/glomo/storage/MainStorage;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStoreRememberedDataFromCustomerUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreRememberedDataFromCustomerUseCase.kt\ncom/bbva/glomo/user/domain/usecase/StoreRememberedDataFromCustomerUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class StoreRememberedDataFromCustomerUseCase implements UseCaseWithParams<RememberedUserData, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RememberedUserDataSource f30855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MainStorage f30856b;

    public StoreRememberedDataFromCustomerUseCase(@NotNull RememberedUserDataSource rememberedUserDataSource, @NotNull MainStorage dataSource) {
        Intrinsics.checkNotNullParameter(rememberedUserDataSource, "rememberedUserDataSource");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f30855a = rememberedUserDataSource;
        this.f30856b = dataSource;
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    public /* bridge */ /* synthetic */ Unit execute(RememberedUserData rememberedUserData) {
        execute2(rememberedUserData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: execute, reason: avoid collision after fix types in other method */
    public void execute2(@NotNull RememberedUserData params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String str = params.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME java.lang.String();
        RememberedUserDataSource rememberedUserDataSource = this.f30855a;
        rememberedUserDataSource.storeUsername(str);
        String str2 = params.getCom.bbva.component.dm.customer.data.repository.response.customer.CustomerLoginsParser.LAST_NAME java.lang.String();
        if (str2 != null) {
            rememberedUserDataSource.storeLastName(str2);
        }
        rememberedUserDataSource.storeBusinessUser(params.getCom.bbva.glomo.localstorage.LocalStorageConstantsKt.IS_BUSINESS_USER_KEY java.lang.String());
        String str3 = params.getCom.bbva.component.request.header.customerid.CustomerIdInterceptor.FAKE_CUSTOMER_ID java.lang.String();
        if (str3 != null) {
            rememberedUserDataSource.storeCustomerId(str3);
        }
        String avatarUrl = params.getAvatarUrl();
        if (avatarUrl != null) {
            rememberedUserDataSource.storeAvatarUrl(avatarUrl);
        }
        JsonObject asJson$default = StorageExtensionsKt.getAsJson$default(this.f30856b, LocalStorageConstantsKt.IS_BUSINESS_USER_KEY, false, null, 6, null);
        asJson$default.addProperty(LocalStorageConstantsKt.IS_BUSINESS_USER_KEY, Boolean.valueOf(params.getCom.bbva.glomo.localstorage.LocalStorageConstantsKt.IS_BUSINESS_USER_KEY java.lang.String()));
        String string = asJson$default.toString();
        TargetStorage targetStorage = TargetStorage.Local;
        MainStorage mainStorage = this.f30856b;
        mainStorage.put(LocalStorageConstantsKt.IS_BUSINESS_USER_KEY, string, true, targetStorage);
        JsonObject asJson$default2 = StorageExtensionsKt.getAsJson$default(this.f30856b, LocalStorageConstantsKt.SOFTTOKEN_USER_ID_KEY, false, null, 6, null);
        String str4 = params.getCom.bbva.component.request.header.customerid.CustomerIdInterceptor.FAKE_CUSTOMER_ID java.lang.String();
        if (str4 == null) {
            str4 = "";
        }
        asJson$default2.addProperty(LocalStorageConstantsKt.SOFTTOKEN_USER_ID_KEY, str4);
        mainStorage.put(LocalStorageConstantsKt.SOFTTOKEN_USER_ID_KEY, asJson$default2.toString(), true, targetStorage);
    }
}
