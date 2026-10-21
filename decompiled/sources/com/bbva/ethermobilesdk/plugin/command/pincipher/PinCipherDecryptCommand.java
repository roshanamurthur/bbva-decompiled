package com.bbva.ethermobilesdk.plugin.command.pincipher;

import android.content.Context;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.cipher.pincipher.PinCipher;
import com.bbva.ethermobilesdk.plugin.InjectorKt;
import com.bbva.ethermobilesdk.plugin.extension.ExtensionKt;
import com.bbva.ethermobilesdk.plugin.param.PinCipherDecryptParam;
import com.bbva.ethermobilesdk.plugin.util.ParamsValidator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PinCipherDecryptCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0014R\u0012\u0010\u0005\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/command/pincipher/PinCipherDecryptCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/ethermobilesdk/plugin/param/PinCipherDecryptParam;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PinCipherDecryptCommand extends AbstractCommand<PinCipherDecryptParam> implements CoroutineScope {

    @NotNull
    public static final String ID = "pincipherdecrypt";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f29913p0;

    /* JADX INFO: compiled from: PinCipherDecryptCommand.kt */
    public static final class a extends Lambda implements Function1<PinCipher, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PinCipherDecryptParam f29914p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f29915q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PinCipherDecryptParam pinCipherDecryptParam, CommandCallback commandCallback) {
            super(1);
            this.f29914p0 = pinCipherDecryptParam;
            this.f29915q0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PinCipher pinCipher) {
            PinCipher it = pinCipher;
            Intrinsics.checkNotNullParameter(it, "it");
            PinCipherDecryptParam pinCipherDecryptParam = this.f29914p0;
            String data = pinCipherDecryptParam.getData();
            Intrinsics.checkNotNull(data);
            Boolean asHexEncoded = pinCipherDecryptParam.getAsHexEncoded();
            Intrinsics.checkNotNull(asHexEncoded);
            this.f29915q0.sendEvent((String) ExtensionKt.valueOrException(it.decrypt(data, asHexEncoded.booleanValue())));
            return Unit.INSTANCE;
        }
    }

    public PinCipherDecryptCommand() {
        super(PinCipherDecryptParam.class, new ParamsValidator());
        this.f29913p0 = CoroutineScopeKt.MainScope();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f29913p0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull PinCipherDecryptParam params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Context applicationContext = this.mApplication.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "mApplication.applicationContext");
        InjectorKt.runPinCipherClient(applicationContext, ID, callback, new a(params, callback));
    }
}
