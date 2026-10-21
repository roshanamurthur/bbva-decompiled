package com.bbva.plugin.zoomauthp;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import j6.b;
import j6.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PluginCommandFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bbva/plugin/zoomauthp/PluginCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "Companion", "zoomauth-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PluginCommandFactory extends CommandFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ZOOM_AUTHENTICATION_COMMAND = "sign_authentication";

    @NotNull
    public static final String ZOOM_UPDATE_COMMAND = "register_update";

    /* JADX INFO: compiled from: PluginCommandFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bbva/plugin/zoomauthp/PluginCommandFactory$Companion;", "", "()V", "ZOOM_AUTHENTICATION_COMMAND", "", "ZOOM_UPDATE_COMMAND", "zoomauth-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PluginCommandFactory() {
        addCommandProvider(ZOOM_AUTHENTICATION_COMMAND, new b(5));
        addCommandProvider(ZOOM_UPDATE_COMMAND, new c(4));
    }
}
