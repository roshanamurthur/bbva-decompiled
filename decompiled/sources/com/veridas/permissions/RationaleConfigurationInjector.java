package com.veridas.permissions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RationaleConfigurationInjector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/veridas/permissions/RationaleConfigurationInjector;", "", "Lcom/veridas/permissions/IRationaleConfigurationProvider;", "permissionsRationaleConfigurationProvider", "", "init", "getConfiguration", "<init>", "()V", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class RationaleConfigurationInjector {

    @NotNull
    public static final RationaleConfigurationInjector INSTANCE = new RationaleConfigurationInjector();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static IRationaleConfigurationProvider f67279a;

    @NotNull
    public final IRationaleConfigurationProvider getConfiguration() {
        IRationaleConfigurationProvider iRationaleConfigurationProvider = f67279a;
        if (iRationaleConfigurationProvider == null) {
            throw new IllegalStateException("Permissions rationale configuration has not been yet initialized (RationaleConfigurationInjector.kt)");
        }
        if (iRationaleConfigurationProvider != null) {
            return iRationaleConfigurationProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rationaleConfiguration");
        return null;
    }

    public final void init(@NotNull IRationaleConfigurationProvider permissionsRationaleConfigurationProvider) {
        Intrinsics.checkNotNullParameter(permissionsRationaleConfigurationProvider, "permissionsRationaleConfigurationProvider");
        f67279a = permissionsRationaleConfigurationProvider;
    }
}
