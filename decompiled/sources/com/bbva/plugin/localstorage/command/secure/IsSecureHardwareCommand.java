package com.bbva.plugin.localstorage.command.secure;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.localstorage.storage.StorageSecure;
import com.bbva.plugin.localstorage.util.FunctionKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IsSecureHardwareCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/localstorage/command/secure/IsSecureHardwareCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IsSecureHardwareCommand extends AbstractCommand {

    @NotNull
    public static final String ID = "issecurehardware";

    /* JADX INFO: compiled from: IsSecureHardwareCommand.kt */
    public static final class a extends Lambda implements Function1<StorageSecure, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35789p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CommandCallback commandCallback) {
            super(1);
            this.f35789p0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(StorageSecure storageSecure) {
            StorageSecure it = storageSecure;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f35789p0.sendEvent(it.isSecureHardware());
            return Unit.INSTANCE;
        }
    }

    public IsSecureHardwareCommand() {
        super(Void.class);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        FunctionKt.runSecureClient(callback, new a(callback));
    }
}
