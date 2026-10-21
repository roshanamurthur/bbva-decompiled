package com.bbva.ethermobilesdk.token.plugin.command;

import bk.q;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.model.TokenActivationForm;
import com.bbva.ethermobilesdk.token.plugin.InjectorKt;
import com.bbva.ethermobilesdk.token.plugin.param.GenerateActivationFormParam;
import com.bbva.ethermobilesdk.token.plugin.util.ParamsValidator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GenerateActivationFormCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/bbva/ethermobilesdk/token/plugin/command/GenerateActivationFormCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/ethermobilesdk/token/plugin/param/GenerateActivationFormParam;", "Lkotlinx/coroutines/CoroutineScope;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "Companion", "ethertoken-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class GenerateActivationFormCommand extends AbstractCommand<GenerateActivationFormParam> implements CoroutineScope {

    @NotNull
    public static final String DATA = "data";

    @NotNull
    public static final String HASH_CODE = "hashCode";

    @NotNull
    public static final String ID = "generateactivationform";

    @NotNull
    public static final String SALT = "salt";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f30132p0;

    /* JADX INFO: compiled from: GenerateActivationFormCommand.kt */
    public static final class a extends Lambda implements Function1<EtherToken, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ GenerateActivationFormParam f30134q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f30135r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GenerateActivationFormParam generateActivationFormParam, CommandCallback commandCallback) {
            super(1);
            this.f30134q0 = generateActivationFormParam;
            this.f30135r0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(EtherToken etherToken) {
            EtherToken it = etherToken;
            Intrinsics.checkNotNullParameter(it, "it");
            GenerateActivationFormCommand generateActivationFormCommand = GenerateActivationFormCommand.this;
            BuildersKt__Builders_commonKt.launch$default(generateActivationFormCommand, null, null, new b(it, this.f30134q0, this.f30135r0, generateActivationFormCommand, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public GenerateActivationFormCommand() {
        super(GenerateActivationFormParam.class, new ParamsValidator());
        this.f30132p0 = CoroutineScopeKt.MainScope();
    }

    public static final Map access$toMap(GenerateActivationFormCommand generateActivationFormCommand, TokenActivationForm tokenActivationForm) {
        generateActivationFormCommand.getClass();
        return q.mapOf(TuplesKt.to("data", tokenActivationForm.getData()), TuplesKt.to(HASH_CODE, tokenActivationForm.getHashCode()), TuplesKt.to("salt", tokenActivationForm.getSalt()));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f30132p0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull GenerateActivationFormParam params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InjectorKt.withClient(callback, new a(params, callback));
    }
}
