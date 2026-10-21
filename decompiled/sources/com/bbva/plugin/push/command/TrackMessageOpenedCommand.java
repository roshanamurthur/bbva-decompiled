package com.bbva.plugin.push.command;

import bk.q;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.push.command.error.ActionTrackerNotImplementedError;
import com.bbva.plugin.push.command.params.TrackInboxMessageParams;
import com.bbva.plugin.push.command.validator.TrackMessageParamValidator;
import com.bbva.plugin.push.extension.PushManagerKt;
import com.bbva.push.PushManager;
import com.bbva.push.inbox.Inbox;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TrackMessageOpenedCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/plugin/push/command/TrackMessageOpenedCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/push/command/params/TrackInboxMessageParams;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/push/PushManager;", "pushManager", "<init>", "(Lcom/bbva/push/PushManager;)V", "Companion", "push-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class TrackMessageOpenedCommand extends AbstractCommand<TrackInboxMessageParams> {

    @NotNull
    public static final String ACTION = "open";

    @NotNull
    public static final String ID = "trackmessageopened";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final PushManager f35924p0;

    /* JADX INFO: compiled from: TrackMessageOpenedCommand.kt */
    public static final class a extends Lambda implements Function1<Inbox, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TrackInboxMessageParams f35925p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35926q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TrackMessageOpenedCommand trackMessageOpenedCommand, TrackInboxMessageParams trackInboxMessageParams, CommandCallback commandCallback) {
            super(1);
            this.f35925p0 = trackInboxMessageParams;
            this.f35926q0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Inbox inbox) {
            Object objM5535constructorimpl;
            Inbox it = inbox;
            Intrinsics.checkNotNullParameter(it, "it");
            TrackInboxMessageParams trackInboxMessageParams = this.f35925p0;
            try {
                Result.Companion companion = Result.INSTANCE;
                String messageId = trackInboxMessageParams.getMessageId();
                Intrinsics.checkNotNull(messageId);
                Map<String, Object> data = trackInboxMessageParams.getData();
                if (data == null) {
                    data = q.emptyMap();
                }
                it.track(messageId, TrackMessageOpenedCommand.ACTION, data);
                objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            boolean zM5541isSuccessimpl = Result.m5541isSuccessimpl(objM5535constructorimpl);
            CommandCallback commandCallback = this.f35926q0;
            if (zM5541isSuccessimpl) {
                commandCallback.sendEvent();
            }
            Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            if (thM5538exceptionOrNullimpl != null) {
                if (thM5538exceptionOrNullimpl instanceof NotImplementedError) {
                    commandCallback.sendError(new ActionTrackerNotImplementedError("Action: open"));
                } else {
                    commandCallback.sendError(Errors.ErrorDefault);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackMessageOpenedCommand(@NotNull PushManager pushManager) {
        super(TrackInboxMessageParams.class, new TrackMessageParamValidator());
        Intrinsics.checkNotNullParameter(pushManager, "pushManager");
        this.f35924p0 = pushManager;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable TrackInboxMessageParams params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        String serviceId = params != null ? params.getServiceId() : null;
        Intrinsics.checkNotNull(serviceId);
        PushManagerKt.executeWithInbox(this.f35924p0, serviceId, callback, new a(this, params, callback));
    }
}
