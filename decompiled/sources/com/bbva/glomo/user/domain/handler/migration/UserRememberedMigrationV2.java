package com.bbva.glomo.user.domain.handler.migration;

import android.content.SharedPreferences;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.glomo.user.domain.handler.MigratorHandler;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UserRememberedMigrationV2.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomo/user/domain/handler/migration/UserRememberedMigrationV2;", "Lcom/bbva/glomo/user/domain/handler/MigratorHandler;", "", "execute", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Landroid/content/SharedPreferences;Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUserRememberedMigrationV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserRememberedMigrationV2.kt\ncom/bbva/glomo/user/domain/handler/migration/UserRememberedMigrationV2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public final class UserRememberedMigrationV2 implements MigratorHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f30779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MainStorage f30780b;

    public UserRememberedMigrationV2(@NotNull SharedPreferences sharedPreferences, @NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30779a = sharedPreferences;
        this.f30780b = storage;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    @Override // com.bbva.glomo.user.domain.handler.MigratorHandler
    public void execute() {
        String str;
        SharedPreferences sharedPreferences = this.f30779a;
        RememberedUser rememberedUser = null;
        String string = sharedPreferences.getString("pref_customer_name", null);
        if (string == null) {
            str = null;
        } else {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                if (StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) " ", false, 2, (Object) null)) {
                    string = string.substring(0, StringsKt__StringsKt.indexOf$default((CharSequence) string, ' ', 0, false, 6, (Object) null));
                    Intrinsics.checkNotNullExpressionValue(string, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str = string;
            } else {
                str = null;
            }
        }
        if (str != null) {
            String string2 = sharedPreferences.getString("pref_user_id", null);
            String str2 = (string2 == null || string2.length() <= 0) ? null : string2;
            if (str2 != null) {
                rememberedUser = new RememberedUser(str, str2, null, false, null, null, 52, null);
            }
        }
        if (rememberedUser != null) {
            TargetStorage targetStorage = TargetStorage.Local;
            String username = rememberedUser.getUsername();
            MainStorage mainStorage = this.f30780b;
            mainStorage.put("remembered_username", username, true, targetStorage);
            mainStorage.put("remembered_user_document", rememberedUser.getDocument(), true, targetStorage);
            mainStorage.put(RememberedUserDataSource.REMEMBERED_IS_BUSINESS_USER, rememberedUser.isBusinessUser() ? "1" : "0", true, targetStorage);
            sharedPreferences.edit().remove("pref_customer_name").apply();
            sharedPreferences.edit().remove("pref_user_id").apply();
        }
    }
}
