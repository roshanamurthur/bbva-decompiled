package com.bbva.plugin.google.pay.command;

import android.app.Activity;
import androidx.appcompat.widget.s1;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.google.pay.command.validator.PushProvisioningValidator;
import com.bbva.plugin.google.pay.request.PushProvisioningRequest;
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

/* JADX INFO: compiled from: PushProvisioningCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/google/pay/command/PushProvisioningCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/google/pay/request/PushProvisioningRequest;", "request", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "commandCallback", "", "execute", "<init>", "()V", "Companion", "google-pay-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class PushProvisioningCommand extends AbstractCommand<PushProvisioningRequest> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "pushprovisioning";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f35700p0;

    /* JADX INFO: compiled from: PushProvisioningCommand.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/plugin/google/pay/command/PushProvisioningCommand$Companion;", "", "()V", "ID", "", "google-pay-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: PushProvisioningCommand.kt */
    public static final class a extends Lambda implements Function1<Activity, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PushProvisioningRequest f35702q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35703r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PushProvisioningRequest pushProvisioningRequest, CommandCallback commandCallback) {
            super(1);
            this.f35702q0 = pushProvisioningRequest;
            this.f35703r0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Activity activity) {
            BuildersKt__Builders_commonKt.launch$default(PushProvisioningCommand.this.f35700p0, null, null, new c(this.f35702q0, activity, this.f35703r0, PushProvisioningCommand.this, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public PushProvisioningCommand() {
        super(PushProvisioningRequest.class, PushProvisioningValidator.INSTANCE);
        this.f35700p0 = CoroutineScopeKt.MainScope();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull PushProvisioningRequest request, @NotNull CommandCallback commandCallback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(commandCallback, "commandCallback");
        this.mActivityContainer.get().ifPresentOrElse(new gb.a(new a(request, commandCallback)), new s1(commandCallback, 3));
    }
}
