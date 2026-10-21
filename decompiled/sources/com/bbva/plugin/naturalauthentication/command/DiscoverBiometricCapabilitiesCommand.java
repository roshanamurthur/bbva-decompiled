package com.bbva.plugin.naturalauthentication.command;

import android.app.Activity;
import androidx.core.view.b0;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.optional.function.Consumer;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthentication;
import com.bbva.plugin.naturalauthentication.command.DiscoverBiometricCapabilitiesCommand;
import com.bbva.plugin.naturalauthentication.command.provider.FidoCallbackProvider;
import ib.d;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DiscoverBiometricCapabilitiesCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\f"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/DiscoverBiometricCapabilitiesCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/plugin/naturalauthentication/command/provider/FidoCallbackProvider;", "provider", "<init>", "(Lcom/bbva/plugin/naturalauthentication/command/provider/FidoCallbackProvider;)V", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class DiscoverBiometricCapabilitiesCommand extends AbstractCommand {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final FidoCallbackProvider f35863p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Lazy f35864q0;

    /* JADX WARN: Multi-variable type inference failed */
    public DiscoverBiometricCapabilitiesCommand() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DiscoverBiometricCapabilitiesCommand(FidoCallbackProvider fidoCallbackProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new FidoCallbackProvider() : fidoCallbackProvider);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ib.e] */
    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull final CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Optional<Activity> optional = this.mActivityContainer.get();
            final ?? r1 = new Function1() { // from class: ib.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Activity activity = (Activity) obj;
                    DiscoverBiometricCapabilitiesCommand this$0 = this.f69546p0;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    CommandCallback callback2 = callback;
                    Intrinsics.checkNotNullParameter(callback2, "$callback");
                    NaturalAuthentication naturalAuthentication = (NaturalAuthentication) this$0.f35864q0.getValue();
                    Intrinsics.checkNotNull(activity);
                    naturalAuthentication.discoverBiometricCapabilities(activity, this$0.f35863p0.getFidoDiscoverBiometricCapabilitiesCallback(callback2));
                    return Unit.INSTANCE;
                }
            };
            optional.ifPresentOrElse(new Consumer() { // from class: ib.f
                @Override // com.bbva.androidtoolkit.optional.function.Consumer
                public final void accept(Object obj) {
                    Function1 tmp0 = r1;
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }
            }, new b0(callback, 4));
        } catch (Exception unused) {
            callback.sendError(CommandError.ErrorDiscoverBiometricCapabilities);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoverBiometricCapabilitiesCommand(@NotNull FidoCallbackProvider provider) {
        super(Void.class);
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f35863p0 = provider;
        this.f35864q0 = LazyKt__LazyJVMKt.lazy(new d(0));
    }
}
