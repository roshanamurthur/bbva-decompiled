package com.bbva.glomo.user.domain.handler.migration;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.glomo.user.domain.handler.MigratorHandler;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UserRememberedMigrationV1.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/glomo/user/domain/handler/migration/UserRememberedMigrationV1;", "Lcom/bbva/glomo/user/domain/handler/MigratorHandler;", "", "execute", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class UserRememberedMigrationV1 implements MigratorHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f30778a;

    public UserRememberedMigrationV1(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30778a = storage;
    }

    @Override // com.bbva.glomo.user.domain.handler.MigratorHandler
    public void execute() {
        String string;
        TargetStorage targetStorage = TargetStorage.Local;
        MainStorage mainStorage = this.f30778a;
        if (mainStorage.getBoolean("is_migrated", false, targetStorage)) {
            return;
        }
        if (!mainStorage.getBoolean("is_migrated", false, targetStorage) && ((string = mainStorage.getString("remembered_username", "", true, TargetStorage.Shared)) == null || string.length() == 0)) {
            mainStorage.putBoolean("is_migrated", true, targetStorage);
            return;
        }
        TargetStorage targetStorage2 = TargetStorage.Shared;
        String string2 = mainStorage.getString("remembered_username", "", true, targetStorage2);
        String string3 = mainStorage.getString("remembered_user_document", "", true, targetStorage2);
        RememberedUser rememberedUser = (string2 == null || string2.length() == 0 || string3 == null || string3.length() == 0) ? null : new RememberedUser(string2, string3, MainStorage.getString$default(this.f30778a, RememberedUserDataSource.REMEMBERED_LAST_NAME, null, true, targetStorage2, 2, null), Intrinsics.areEqual(MainStorage.getString$default(this.f30778a, RememberedUserDataSource.REMEMBERED_IS_BUSINESS_USER, null, true, targetStorage2, 2, null), "1"), MainStorage.getString$default(this.f30778a, RememberedUserDataSource.REMEMBERED_CUSTOMER_ID, null, true, targetStorage2, 2, null), MainStorage.getString$default(this.f30778a, RememberedUserDataSource.AVATAR_URL, null, true, targetStorage2, 2, null));
        if (rememberedUser != null) {
            mainStorage.put("remembered_username", rememberedUser.getUsername(), true, targetStorage);
            mainStorage.put("remembered_user_document", rememberedUser.getDocument(), true, targetStorage);
            mainStorage.put(RememberedUserDataSource.REMEMBERED_LAST_NAME, rememberedUser.getLastName(), true, targetStorage);
            mainStorage.put(RememberedUserDataSource.REMEMBERED_IS_BUSINESS_USER, rememberedUser.isBusinessUser() ? "1" : "0", true, targetStorage);
            mainStorage.put(RememberedUserDataSource.REMEMBERED_CUSTOMER_ID, rememberedUser.getCustomerId(), true, targetStorage);
            mainStorage.put(RememberedUserDataSource.AVATAR_URL, rememberedUser.getAvatarUrl(), true, targetStorage);
            mainStorage.putBoolean("is_migrated", true, targetStorage);
        }
    }
}
