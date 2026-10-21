package com.bbva.plugin.push.command.inbox;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.push.command.inbox.params.InboxParams;
import com.bbva.plugin.push.command.validator.InboxParamsValidator;
import com.bbva.plugin.push.extension.PushManagerKt;
import com.bbva.push.PushManager;
import com.bbva.push.inbox.Inbox;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetReadMessagesCountCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/bbva/plugin/push/command/inbox/GetReadMessagesCountCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/push/command/inbox/params/InboxParams;", "Lkotlinx/coroutines/CoroutineScope;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/push/PushManager;", "pushManager", "<init>", "(Lcom/bbva/push/PushManager;)V", "Companion", "push-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class GetReadMessagesCountCommand extends AbstractCommand<InboxParams> implements CoroutineScope {

    @NotNull
    public static final String ID = "getreadmessagescount";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final PushManager f35951p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f35952q0;

    /* JADX INFO: compiled from: GetReadMessagesCountCommand.kt */
    public static final class a extends Lambda implements Function1<Inbox, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35954q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CommandCallback commandCallback) {
            super(1);
            this.f35954q0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Inbox inbox) {
            Inbox it = inbox;
            Intrinsics.checkNotNullParameter(it, "it");
            BuildersKt__Builders_commonKt.launch$default(GetReadMessagesCountCommand.this, null, null, new c(this.f35954q0, it, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetReadMessagesCountCommand(@NotNull PushManager pushManager) {
        super(InboxParams.class, new InboxParamsValidator());
        Intrinsics.checkNotNullParameter(pushManager, "pushManager");
        this.f35951p0 = pushManager;
        this.f35952q0 = CoroutineScopeKt.MainScope();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f35952q0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable InboxParams params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        String serviceId = params != null ? params.getServiceId() : null;
        Intrinsics.checkNotNull(serviceId);
        PushManagerKt.executeWithInbox(this.f35951p0, serviceId, callback, new a(callback));
    }
}
