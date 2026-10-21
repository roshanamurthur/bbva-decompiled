package com.bbva.plugin.push.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.push.command.error.HandlerNotFoundError;
import com.bbva.plugin.push.command.params.SetOptionsParams;
import com.bbva.plugin.push.command.validator.SetOptionsValidator;
import com.bbva.push.PushManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SetOptionsCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/plugin/push/command/SetOptionsCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/push/command/params/SetOptionsParams;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/push/PushManager;", "pushManager", "<init>", "(Lcom/bbva/push/PushManager;)V", "Companion", "push-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class SetOptionsCommand extends AbstractCommand<SetOptionsParams> {

    @NotNull
    public static final String ID = "setoptions";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final PushManager f35923p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetOptionsCommand(@NotNull PushManager pushManager) {
        super(SetOptionsParams.class, SetOptionsValidator.INSTANCE);
        Intrinsics.checkNotNullParameter(pushManager, "pushManager");
        this.f35923p0 = pushManager;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable SetOptionsParams params, @NotNull CommandCallback callback) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            PushManager pushManager = this.f35923p0;
            String serviceId = params != null ? params.getServiceId() : null;
            Intrinsics.checkNotNull(serviceId);
            Map<String, ? extends Object> options = params.getOptions();
            Intrinsics.checkNotNull(options);
            pushManager.configure(serviceId, options);
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
            callback.sendEvent();
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            callback.sendError(HandlerNotFoundError.INSTANCE);
        }
    }
}
