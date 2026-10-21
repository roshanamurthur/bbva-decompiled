package com.bbva.ethermobilesdk.plugin.command.rsa;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.SimpleResponse;
import com.bbva.ethermobilesdk.cipher.factory.SecureElementFactoryKt;
import com.bbva.ethermobilesdk.cipher.model.CipherResultKt;
import com.bbva.ethermobilesdk.cipher.pincipher.utils.CryptoUtils;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.plugin.model.PluginCipherError;
import com.bbva.ethermobilesdk.plugin.param.RsaEncryptParam;
import com.bbva.ethermobilesdk.plugin.util.ParamsValidator;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.fasterxml.jackson.core.JsonPointer;
import java.security.interfaces.RSAPublicKey;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RsaEncryptCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/command/rsa/RsaEncryptCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/ethermobilesdk/plugin/param/RsaEncryptParam;", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RsaEncryptCommand extends AbstractCommand<RsaEncryptParam> {

    @NotNull
    public static final String ID = "rsaencrypt";

    public RsaEncryptCommand() {
        super(RsaEncryptParam.class, new ParamsValidator());
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull RsaEncryptParam params, @NotNull CommandCallback callback) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            try {
                Result.Companion companion = Result.INSTANCE;
                String publicKey = params.getPublicKey();
                Intrinsics.checkNotNull(publicKey);
                objM5535constructorimpl = Result.m5535constructorimpl((RSAPublicKey) CipherResultKt.getOrThrow(SecureElementFactoryKt.rsaPublicKeyOf(publicKey)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
                callback.sendError(PluginCipherError.INVALID_RSA_KEY);
            }
            if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
                objM5535constructorimpl = null;
            }
            RSAPublicKey rSAPublicKey = (RSAPublicKey) objM5535constructorimpl;
            if (rSAPublicKey == null) {
                return;
            }
            CryptoUtils cryptoUtils = CryptoUtils.INSTANCE;
            String data = params.getData();
            Intrinsics.checkNotNull(data);
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            callback.sendEvent(EncodingUtilsKt.toBase64(cryptoUtils.rsaEncrypt(bytes, rSAPublicKey, "RSA/" + params.getMode() + JsonPointer.SEPARATOR + params.getPadding())));
        } catch (Throwable th3) {
            String message = th3.getMessage();
            if (message == null) {
                message = "There's been an error during data encryption";
            }
            callback.sendError(SimpleResponse.error(ReturnCode.ERR_INIT_DEVICEID_ALREADY_DEFINED, message));
        }
    }
}
