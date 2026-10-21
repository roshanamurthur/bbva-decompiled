package com.bbva.plugin.localstorage.command.secure;

import android.content.Context;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.localstorage.extension.StringKt;
import com.bbva.plugin.localstorage.params.IsBiometricAvailableParam;
import com.bbva.plugin.localstorage.storage.StorageSecure;
import com.bbva.plugin.localstorage.util.FunctionKt;
import com.bbva.plugin.localstorage.util.ParamsValidator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IsBiometricAvailableCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/localstorage/command/secure/IsBiometricAvailableCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/localstorage/params/IsBiometricAvailableParam;", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IsBiometricAvailableCommand extends AbstractCommand<IsBiometricAvailableParam> {

    @NotNull
    public static final String ID = "isbiometricavailable";

    /* JADX INFO: compiled from: IsBiometricAvailableCommand.kt */
    public static final class a extends Lambda implements Function1<StorageSecure, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35786p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ IsBiometricAvailableCommand f35787q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ IsBiometricAvailableParam f35788r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CommandCallback commandCallback, IsBiometricAvailableCommand isBiometricAvailableCommand, IsBiometricAvailableParam isBiometricAvailableParam) {
            super(1);
            this.f35786p0 = commandCallback;
            this.f35787q0 = isBiometricAvailableCommand;
            this.f35788r0 = isBiometricAvailableParam;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(StorageSecure storageSecure) {
            StorageSecure it = storageSecure;
            Intrinsics.checkNotNullParameter(it, "it");
            Context applicationContext = ((AbstractCommand) this.f35787q0).mApplication.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "mApplication.applicationContext");
            String authenticationType = this.f35788r0.getAuthenticationType();
            Intrinsics.checkNotNull(authenticationType);
            this.f35786p0.sendEvent(it.isBiometricAvailable(applicationContext, StringKt.toAuthenticationType(authenticationType)));
            return Unit.INSTANCE;
        }
    }

    public IsBiometricAvailableCommand() {
        super(IsBiometricAvailableParam.class, new ParamsValidator());
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull IsBiometricAvailableParam params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FunctionKt.runSecureClient(callback, new a(callback, this, params));
    }
}
