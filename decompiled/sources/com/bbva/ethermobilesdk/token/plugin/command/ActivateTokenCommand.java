package com.bbva.ethermobilesdk.token.plugin.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.model.TokenActivation;
import com.bbva.ethermobilesdk.token.plugin.InjectorKt;
import com.bbva.ethermobilesdk.token.plugin.param.ActivateTokenParam;
import com.bbva.ethermobilesdk.token.plugin.util.ParamsValidator;
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

/* JADX INFO: compiled from: ActivateTokenCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0014R\u0012\u0010\u0005\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/token/plugin/command/ActivateTokenCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/ethermobilesdk/token/plugin/param/ActivateTokenParam;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "ethertoken-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ActivateTokenCommand extends AbstractCommand<ActivateTokenParam> implements CoroutineScope {

    @NotNull
    public static final String ID = "activatetoken";

    @NotNull
    public static final String TOKEN_ID = "tokenId";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f30128p0;

    /* JADX INFO: compiled from: ActivateTokenCommand.kt */
    public static final class a extends Lambda implements Function1<EtherToken, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TokenActivation f30130q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f30131r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TokenActivation tokenActivation, CommandCallback commandCallback) {
            super(1);
            this.f30130q0 = tokenActivation;
            this.f30131r0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(EtherToken etherToken) {
            EtherToken it = etherToken;
            Intrinsics.checkNotNullParameter(it, "it");
            BuildersKt__Builders_commonKt.launch$default(ActivateTokenCommand.this, null, null, new com.bbva.ethermobilesdk.token.plugin.command.a(it, this.f30130q0, this.f30131r0, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public ActivateTokenCommand() {
        super(ActivateTokenParam.class, new ParamsValidator());
        this.f30128p0 = CoroutineScopeKt.MainScope();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f30128p0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull ActivateTokenParam params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            String tokenId = params.getTokenId();
            Intrinsics.checkNotNull(tokenId);
            String data = params.getData();
            Intrinsics.checkNotNull(data);
            String configuration = params.getConfiguration();
            Intrinsics.checkNotNull(configuration);
            String seed = params.getSeed();
            Intrinsics.checkNotNull(seed);
            Long timestamp = params.getTimestamp();
            Intrinsics.checkNotNull(timestamp);
            InjectorKt.withClient(callback, new a(new TokenActivation(tokenId, data, configuration, seed, timestamp.longValue()), callback));
        } catch (Exception unused) {
            callback.sendError(Errors.ErrorDefault);
        }
    }
}
