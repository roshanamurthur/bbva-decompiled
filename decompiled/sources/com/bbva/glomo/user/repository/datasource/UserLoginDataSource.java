package com.bbva.glomo.user.repository.datasource;

import com.bbva.glomo.StorageExtensionsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.glomo.user.domain.usecase.LoginData;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserLoginDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomo/user/repository/datasource/UserLoginDataSource;", "Lcom/bbva/glomo/user/repository/datasource/UserDataStore;", "Lcom/bbva/glomo/user/domain/usecase/LoginData;", "loginData", "", "storeLoginData", "", "isActive", "storeIsGlobalUser", "", "valueApp", "storeAapGlobalUser", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class UserLoginDataSource implements UserDataStore {

    @NotNull
    public static final String IS_ACTIVE_GLOBAL_USER = "isGlobalUser";

    @NotNull
    public static final String LOGIN_DATA = "loginData";

    @NotNull
    public static final String VALUE_PERSONAL_GLOBAL_USER_AAP = "personalProfileAap";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f30889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f30890b;

    /* JADX INFO: compiled from: UserLoginDataSource.kt */
    public static final class a extends Lambda implements Function0<Gson> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f30891p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Gson invoke() {
            return new Gson();
        }
    }

    public UserLoginDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30889a = storage;
        this.f30890b = LazyKt__LazyJVMKt.lazy(a.f30891p0);
    }

    @Override // com.bbva.glomo.user.repository.datasource.UserDataStore
    @Nullable
    public Object clear(@NotNull Continuation<? super Unit> continuation) {
        return UserDataStore.DefaultImpls.clear(this, continuation);
    }

    public final void storeAapGlobalUser(@NotNull String valueApp) {
        Intrinsics.checkNotNullParameter(valueApp, "valueApp");
        JsonObject asJson$default = StorageExtensionsKt.getAsJson$default(this.f30889a, VALUE_PERSONAL_GLOBAL_USER_AAP, false, null, 6, null);
        asJson$default.addProperty(VALUE_PERSONAL_GLOBAL_USER_AAP, valueApp);
        this.f30889a.put(VALUE_PERSONAL_GLOBAL_USER_AAP, asJson$default.toString(), true, TargetStorage.Local);
    }

    public final void storeIsGlobalUser(boolean isActive) {
        JsonObject asJson$default = StorageExtensionsKt.getAsJson$default(this.f30889a, IS_ACTIVE_GLOBAL_USER, false, null, 6, null);
        asJson$default.addProperty(IS_ACTIVE_GLOBAL_USER, Boolean.valueOf(isActive));
        this.f30889a.put(IS_ACTIVE_GLOBAL_USER, asJson$default.toString(), true, TargetStorage.Local);
    }

    public final void storeLoginData(@NotNull LoginData loginData) {
        Intrinsics.checkNotNullParameter(loginData, "loginData");
        this.f30889a.put("loginData", ((Gson) this.f30890b.getValue()).toJson(loginData), true, TargetStorage.Local);
    }
}
