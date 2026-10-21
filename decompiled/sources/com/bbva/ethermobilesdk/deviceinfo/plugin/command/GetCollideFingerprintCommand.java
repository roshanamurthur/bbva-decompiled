package com.bbva.ethermobilesdk.deviceinfo.plugin.command;

import android.app.Application;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobilesdk.deviceinfo.DeviceInfo;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.params.CollideFingerprintParams;
import com.bbva.ethermobilesdk.deviceinfo.plugin.di.InjectorKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetCollideFingerprintCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/plugin/command/GetCollideFingerprintCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/ethermobilesdk/deviceinfo/plugin/command/params/CollideFingerprintParams;", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "deviceinfo-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetCollideFingerprintCommand extends AbstractCommand<CollideFingerprintParams> {

    /* JADX INFO: compiled from: GetCollideFingerprintCommand.kt */
    public static final class a extends Lambda implements Function1<DeviceInfo, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CollideFingerprintParams f29554p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f29555q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CollideFingerprintParams collideFingerprintParams, CommandCallback commandCallback, GetCollideFingerprintCommand getCollideFingerprintCommand) {
            super(1);
            this.f29554p0 = collideFingerprintParams;
            this.f29555q0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DeviceInfo deviceInfo) {
            Unit unit;
            Object objM5535constructorimpl;
            DeviceInfo deviceInfo2 = deviceInfo;
            Intrinsics.checkNotNullParameter(deviceInfo2, "deviceInfo");
            CommandCallback commandCallback = this.f29555q0;
            CollideFingerprintParams collideFingerprintParams = this.f29554p0;
            if (collideFingerprintParams != null) {
                if (collideFingerprintParams.getUserID().length() > 0) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        commandCallback.sendEvent(deviceInfo2.getCom.bbva.nativesettings.common.Constants.APPLICATION java.lang.String().getCollideFingerprint(collideFingerprintParams.getUserID()));
                        objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
                    }
                    if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
                        commandCallback.sendError(Errors.ErrorDefault);
                    }
                } else {
                    commandCallback.sendError(Errors.ErrorMalformedParam);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                commandCallback.sendError(Errors.ErrorMalformedParam);
            }
            return Unit.INSTANCE;
        }
    }

    public GetCollideFingerprintCommand() {
        super(CollideFingerprintParams.class);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable CollideFingerprintParams params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Application mApplication = this.mApplication;
        Intrinsics.checkNotNullExpressionValue(mApplication, "mApplication");
        InjectorKt.withDeviceInfoClient(mApplication, new a(params, callback, this));
    }
}
