package com.bbva.securesharing.plugin;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r7.e;
import r7.f;
import r7.g;
import r7.h;
import sa.d;

/* JADX INFO: compiled from: SecureSharingCommandFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/bbva/securesharing/plugin/SecureSharingCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "sSharingClient", "Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;", "(Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;)V", "Companion", "securesharing-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SecureSharingCommandFactory extends CommandFactory {

    @NotNull
    public static final String ACTION_CLEAN_ALL_VALUE = "cleanall";

    @NotNull
    public static final String ACTION_CONTAINS_VALUE = "contains";

    @NotNull
    public static final String ACTION_GET_VALUE = "getvalue";

    @NotNull
    public static final String ACTION_PUT_VALUE = "putvalue";

    @NotNull
    public static final String ACTION_REMOVE_VALUE = "removekey";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: SecureSharingCommandFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bbva/securesharing/plugin/SecureSharingCommandFactory$Companion;", "", "()V", "ACTION_CLEAN_ALL_VALUE", "", "ACTION_CONTAINS_VALUE", "ACTION_GET_VALUE", "ACTION_PUT_VALUE", "ACTION_REMOVE_VALUE", "securesharing-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SecureSharingCommandFactory(@NotNull SecureSharing sSharingClient) {
        Intrinsics.checkNotNullParameter(sSharingClient, "sSharingClient");
        int i10 = 2;
        addCommandProvider(ACTION_PUT_VALUE, new e(sSharingClient, i10));
        addCommandProvider(ACTION_GET_VALUE, new d(sSharingClient, i10));
        int i11 = 3;
        addCommandProvider(ACTION_CONTAINS_VALUE, new f(sSharingClient, i11));
        addCommandProvider(ACTION_REMOVE_VALUE, new g(sSharingClient, i11));
        addCommandProvider(ACTION_CLEAN_ALL_VALUE, new h(sSharingClient, 4));
    }
}
