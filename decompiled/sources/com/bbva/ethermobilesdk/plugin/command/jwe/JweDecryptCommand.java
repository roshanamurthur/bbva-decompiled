package com.bbva.ethermobilesdk.plugin.command.jwe;

import android.view.KeyCharacterMap;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobile.help.kit.result.ResultKt;
import com.bbva.ethermobilesdk.cipher.extension.StringKt;
import com.bbva.ethermobilesdk.cipher.jwe.JweCipher;
import com.bbva.ethermobilesdk.cipher.jwe.jwk.JwkFactoryKt;
import com.bbva.ethermobilesdk.cipher.model.CipherResultKt;
import com.bbva.ethermobilesdk.plugin.Injector;
import com.bbva.ethermobilesdk.plugin.extension.ExtensionKt;
import com.bbva.ethermobilesdk.plugin.param.JweDecryptParam;
import com.bbva.ethermobilesdk.plugin.util.ParamsValidator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JweDecryptCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/command/jwe/JweDecryptCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/ethermobilesdk/plugin/param/JweDecryptParam;", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JweDecryptCommand extends AbstractCommand<JweDecryptParam> {

    @NotNull
    public static final String ID = "jwedecrypt";

    public JweDecryptCommand() {
        super(JweDecryptParam.class, new ParamsValidator());
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull JweDecryptParam params, @NotNull CommandCallback callback) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            JweCipher jweCipher = Injector.INSTANCE.getJweCipher();
            Unit unit = null;
            if (jweCipher != null) {
                String privateKey = params.getPrivateKey();
                Intrinsics.checkNotNull(privateKey);
                Object orThrow = ResultKt.getOrThrow(StringKt.toPrivateKey$default(privateKey, null, 1, null));
                Intrinsics.checkNotNull(orThrow, "null cannot be cast to non-null type java.security.interfaces.RSAPrivateKey");
                String publicKey = params.getPublicKey();
                Intrinsics.checkNotNull(publicKey);
                Object orThrow2 = ResultKt.getOrThrow(StringKt.toPublicKey$default(publicKey, null, 1, null));
                Intrinsics.checkNotNull(orThrow2, "null cannot be cast to non-null type java.security.interfaces.RSAPublicKey");
                String data = params.getData();
                Intrinsics.checkNotNull(data);
                callback.sendEvent((String) CipherResultKt.getOrThrow(jweCipher.decrypt(data, JwkFactoryKt.jwkOf$default((RSAPublicKey) orThrow2, (RSAPrivateKey) orThrow, null, 4, null))));
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                throw new KeyCharacterMap.UnavailableException("JWE Cipher is not available");
            }
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
            Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            if (thM5538exceptionOrNullimpl == null) {
                return;
            }
            ExtensionKt.manageException(thM5538exceptionOrNullimpl, ID, callback);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
    }
}
