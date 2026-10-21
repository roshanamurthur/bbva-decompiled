package com.bbva.ethermobilesdk.deviceinfo.plugin.command;

import android.app.Application;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobilesdk.deviceinfo.DeviceInfo;
import com.bbva.ethermobilesdk.deviceinfo.plugin.di.InjectorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IsWifiSecureCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/plugin/command/IsWifiSecureCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "deviceinfo-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IsWifiSecureCommand extends AbstractCommand {

    /* JADX INFO: compiled from: IsWifiSecureCommand.kt */
    public static final class a extends Lambda implements Function1<DeviceInfo, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f29596p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CommandCallback commandCallback) {
            super(1);
            this.f29596p0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DeviceInfo deviceInfo) {
            Unit unit;
            DeviceInfo it = deviceInfo;
            Intrinsics.checkNotNullParameter(it, "it");
            Boolean boolIsWifiSecure = it.getCom.bbva.appsflyer.DeepLinkListenerAdapter.Constants.ERROR_NETWORK java.lang.String().isWifiSecure();
            CommandCallback commandCallback = this.f29596p0;
            if (boolIsWifiSecure != null) {
                commandCallback.sendEvent(boolIsWifiSecure.booleanValue());
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                commandCallback.sendError(Errors.ErrorNotAvailable);
            }
            return Unit.INSTANCE;
        }
    }

    public IsWifiSecureCommand() {
        super(Void.class);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Application mApplication = this.mApplication;
        Intrinsics.checkNotNullExpressionValue(mApplication, "mApplication");
        InjectorKt.withDeviceInfoClient(mApplication, new a(callback));
    }
}
