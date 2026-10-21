package com.bbva.plugin.signaturepad;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import z6.h;

/* JADX INFO: compiled from: PluginCommandFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bbva/plugin/signaturepad/PluginCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "Companion", "signaturepad-plugin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PluginCommandFactory extends CommandFactory {

    @NotNull
    public static final String CAPTURE_SIGNATURE_COMMAND = "capturesignature";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: PluginCommandFactory.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/plugin/signaturepad/PluginCommandFactory$Companion;", "", "()V", "CAPTURE_SIGNATURE_COMMAND", "", "signaturepad-plugin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PluginCommandFactory() {
        addCommandProvider(CAPTURE_SIGNATURE_COMMAND, new h(5));
    }
}
