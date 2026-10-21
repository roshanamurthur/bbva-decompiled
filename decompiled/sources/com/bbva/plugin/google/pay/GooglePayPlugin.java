package com.bbva.plugin.google.pay;

import android.content.Context;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.google.pay.GoogleTapAndPay;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GooglePayPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/google/pay/GooglePayPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "createCommandFactory", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "getId", "", "Companion", "google-pay-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GooglePayPlugin extends Plugin {

    @NotNull
    public static final String ID = "GooglePayPlugin";

    public GooglePayPlugin(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        GooglePayLibInjector.INSTANCE.initialize(new GoogleTapAndPay(context));
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new GooglePayCommandFactory();
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return ID;
    }
}
