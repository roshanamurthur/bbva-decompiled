package com.bbva.plugin.appsflyer;

import com.bbva.appsflyer.AppsFlyerAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injection.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00028\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/bbva/plugin/appsflyer/Injection;", "", "Lcom/bbva/appsflyer/AppsFlyerAdapter;", "appsFlyerAdapter", "", "initialize", "<set-?>", "a", "Lcom/bbva/appsflyer/AppsFlyerAdapter;", "getAppsFlyerAdapter", "()Lcom/bbva/appsflyer/AppsFlyerAdapter;", "<init>", "()V", "appsflyer-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class Injection {

    @NotNull
    public static final Injection INSTANCE = new Injection();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static AppsFlyerAdapter appsFlyerAdapter;

    @NotNull
    public final AppsFlyerAdapter getAppsFlyerAdapter() {
        AppsFlyerAdapter appsFlyerAdapter2 = appsFlyerAdapter;
        if (appsFlyerAdapter2 != null) {
            return appsFlyerAdapter2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appsFlyerAdapter");
        return null;
    }

    public final void initialize(@NotNull AppsFlyerAdapter appsFlyerAdapter2) {
        Intrinsics.checkNotNullParameter(appsFlyerAdapter2, "appsFlyerAdapter");
        appsFlyerAdapter = appsFlyerAdapter2;
    }
}
