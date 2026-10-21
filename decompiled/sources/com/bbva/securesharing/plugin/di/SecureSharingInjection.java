package com.bbva.securesharing.plugin.di;

import android.content.Context;
import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SecureSharingInjection.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/securesharing/plugin/di/SecureSharingInjection;", "Lcom/bbva/securesharing/plugin/di/Injections;", "()V", "createClient", "Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;", "context", "Landroid/content/Context;", "configFilePath", "", "securesharing-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SecureSharingInjection implements Injections {

    @NotNull
    public static final SecureSharingInjection INSTANCE = new SecureSharingInjection();

    @Override // com.bbva.securesharing.plugin.di.Injections
    @NotNull
    public SecureSharing createClient(@NotNull Context context, @Nullable String configFilePath) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new SecureSharing(context);
    }
}
