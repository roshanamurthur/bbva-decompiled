package com.bbva.plugin.google.pay.command;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.google.pay.command.validator.GetCardStatusValidator;
import com.bbva.plugin.google.pay.request.GetCardStatusRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetCardStatusCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/google/pay/command/GetCardStatusCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/google/pay/request/GetCardStatusRequest;", "getCardStatusRequest", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "commandCallback", "", "execute", "<init>", "()V", "Companion", "google-pay-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class GetCardStatusCommand extends AbstractCommand<GetCardStatusRequest> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "getcardstatus";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f35692p0;

    /* JADX INFO: compiled from: GetCardStatusCommand.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/plugin/google/pay/command/GetCardStatusCommand$Companion;", "", "()V", "ID", "", "google-pay-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: GetCardStatusCommand.kt */
    public static final class a extends Lambda implements Function1<Activity, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ GetCardStatusRequest f35694q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35695r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GetCardStatusRequest getCardStatusRequest, CommandCallback commandCallback) {
            super(1);
            this.f35694q0 = getCardStatusRequest;
            this.f35695r0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Activity activity) {
            BuildersKt__Builders_commonKt.launch$default(GetCardStatusCommand.this.f35692p0, null, null, new com.bbva.plugin.google.pay.command.a(this.f35694q0, activity, this.f35695r0, GetCardStatusCommand.this, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public GetCardStatusCommand() {
        super(GetCardStatusRequest.class, GetCardStatusValidator.INSTANCE);
        this.f35692p0 = CoroutineScopeKt.MainScope();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull GetCardStatusRequest getCardStatusRequest, @NotNull CommandCallback commandCallback) {
        Intrinsics.checkNotNullParameter(getCardStatusRequest, "getCardStatusRequest");
        Intrinsics.checkNotNullParameter(commandCallback, "commandCallback");
        this.mActivityContainer.get().ifPresentOrElse(new q8.a(new a(getCardStatusRequest, commandCallback), 1), new q8.b(1, commandCallback));
    }
}
