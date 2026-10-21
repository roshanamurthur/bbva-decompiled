package com.bbva.glomo.user.domain.handler.migration;

import android.content.Context;
import android.content.SharedPreferences;
import com.bbva.glomo.user.domain.handler.MigratorHandler;
import com.bbva.glomo.user.domain.model.LegacyRememberedUser;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import com.google.gson.Gson;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UserRememberedMigrationV0.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/glomo/user/domain/handler/migration/UserRememberedMigrationV0;", "Lcom/bbva/glomo/user/domain/handler/MigratorHandler;", "", "execute", "Landroid/content/Context;", "context", "Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;", "rememberedUserDataSource", "", "storageName", "<init>", "(Landroid/content/Context;Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;Ljava/lang/String;)V", "Companion", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class UserRememberedMigrationV0 implements MigratorHandler {

    @NotNull
    public static final String REMEMBERED_USER = "remembered-user";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f30773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RememberedUserDataSource f30774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f30775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f30776d;

    /* JADX INFO: compiled from: UserRememberedMigrationV0.kt */
    public static final class a extends Lambda implements Function0<Gson> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f30777p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Gson invoke() {
            return new Gson();
        }
    }

    public UserRememberedMigrationV0(@NotNull Context context, @NotNull RememberedUserDataSource rememberedUserDataSource, @NotNull String storageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rememberedUserDataSource, "rememberedUserDataSource");
        Intrinsics.checkNotNullParameter(storageName, "storageName");
        this.f30773a = context;
        this.f30774b = rememberedUserDataSource;
        this.f30775c = storageName;
        this.f30776d = LazyKt__LazyJVMKt.lazy(a.f30777p0);
    }

    @Override // com.bbva.glomo.user.domain.handler.MigratorHandler
    public void execute() {
        Context context = this.f30773a;
        String str = this.f30775c;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        String string = sharedPreferences.getString("remembered-user", null);
        LegacyRememberedUser legacyRememberedUser = string != null ? (LegacyRememberedUser) ((Gson) this.f30776d.getValue()).fromJson(string, LegacyRememberedUser.class) : null;
        if (legacyRememberedUser != null) {
            this.f30774b.storeRememberedUser(legacyRememberedUser.getFirstName(), legacyRememberedUser.getUsername(), false);
            SharedPreferences sharedPreferences2 = context.getSharedPreferences(str, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(...)");
            if (sharedPreferences2.contains("remembered-user")) {
                SharedPreferences sharedPreferences3 = context.getSharedPreferences(str, 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences3, "getSharedPreferences(...)");
                sharedPreferences3.edit().remove("remembered-user").apply();
            }
        }
    }
}
