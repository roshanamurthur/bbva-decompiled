package com.bbva.glomo.user.repository.datasource;

import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.domain.model.UserTypeKt;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserTypeDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0007J\u0013\u0010\u000b\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomo/user/repository/datasource/UserTypeDataSource;", "Lcom/bbva/glomo/user/repository/datasource/UserDataStore;", "Lcom/bbva/glomo/user/domain/model/UserType;", "type", "", "storeUserType", "getUserType", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "storeIsSelectorActive", "isSelectorActive", ClearCommand.ID, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class UserTypeDataSource implements UserDataStore {

    @NotNull
    public static final String USER_TYPE = "user_type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f30899a;

    public UserTypeDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30899a = storage;
    }

    @Override // com.bbva.glomo.user.repository.datasource.UserDataStore
    @Nullable
    public Object clear(@NotNull Continuation<? super Unit> continuation) {
        this.f30899a.remove(TargetStorage.Local, USER_TYPE);
        return Unit.INSTANCE;
    }

    @NotNull
    public final UserType getUserType() {
        String string$default = MainStorage.getString$default(this.f30899a, USER_TYPE, "PERSONAL", false, null, 12, null);
        if ((string$default != null ? UserTypeKt.toUserType(string$default) : null) == null) {
            string$default = null;
        }
        return string$default == null ? UserType.PERSONAL : UserType.valueOf(string$default);
    }

    public final boolean isSelectorActive() {
        return MainStorage.getBoolean$default(this.f30899a, LocalStorageConstantsKt.SELECTOR_ACTIVE_KEY, false, null, 4, null);
    }

    public final void storeIsSelectorActive(boolean active) {
        MainStorage.putBoolean$default(this.f30899a, LocalStorageConstantsKt.SELECTOR_ACTIVE_KEY, active, null, 4, null);
    }

    public final void storeUserType(@NotNull UserType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        MainStorage.put$default(this.f30899a, USER_TYPE, type.name(), false, null, 12, null);
    }
}
