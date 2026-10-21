package com.bbva.glomohybrid.base.datasource;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UserStoredDatasource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/base/datasource/UserStoredDatasource;", "", "", "isLogged", "Landroid/content/SharedPreferences;", "preferences", "<init>", "(Landroid/content/SharedPreferences;)V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class UserStoredDatasource {

    @NotNull
    public static final String ID = "user-store-datasource";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f31236a;

    public UserStoredDatasource(@NotNull SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f31236a = preferences;
        preferences.edit().putBoolean("user-is-logged", false).apply();
    }

    public final boolean isLogged() {
        return this.f31236a.getBoolean("user-is-logged", false);
    }
}
