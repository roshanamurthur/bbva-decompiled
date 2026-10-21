package com.bbva.ethermobilesdk.tokencompat.plugin.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.tokencompat.TokenCompat;
import com.bbva.ethermobilesdk.tokencompat.plugin.InjectorKt;
import com.bbva.ethermobilesdk.tokencompat.plugin.param.GetTokenParam;
import com.bbva.ethermobilesdk.tokencompat.plugin.util.ParamsValidator;
import com.bbva.ethermobilesdk.tokencompat.plugin.util.ResponseMapperKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: GetTokenCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/plugin/command/GetTokenCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/ethermobilesdk/tokencompat/plugin/param/GetTokenParam;", "Lkotlinx/coroutines/CoroutineScope;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompat;", "tokenCompat", "<init>", "(Lcom/bbva/ethermobilesdk/tokencompat/TokenCompat;)V", "Companion", "ethertoken-compat-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class GetTokenCommand extends AbstractCommand<GetTokenParam> implements CoroutineScope {

    @NotNull
    public static final String ID = "get";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final TokenCompat f30621p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f30622q0;

    /* JADX INFO: compiled from: GetTokenCommand.kt */
    public static final class a extends Lambda implements Function1<TokenCompat, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ GetTokenParam f30623p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f30624q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GetTokenParam getTokenParam, CommandCallback commandCallback) {
            super(1);
            this.f30623p0 = getTokenParam;
            this.f30624q0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TokenCompat tokenCompat) {
            TokenCompat it = tokenCompat;
            Intrinsics.checkNotNullParameter(it, "it");
            String refToken = this.f30623p0.getRefToken();
            Intrinsics.checkNotNull(refToken);
            this.f30624q0.sendEvent(new JSONObject(ResponseMapperKt.toMap(it.getToken(refToken))));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenCommand(@NotNull TokenCompat tokenCompat) {
        super(GetTokenParam.class, new ParamsValidator());
        Intrinsics.checkNotNullParameter(tokenCompat, "tokenCompat");
        this.f30621p0 = tokenCompat;
        this.f30622q0 = CoroutineScopeKt.MainScope();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f30622q0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull GetTokenParam params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InjectorKt.runClient(callback, this.f30621p0, new a(params, callback));
    }
}
