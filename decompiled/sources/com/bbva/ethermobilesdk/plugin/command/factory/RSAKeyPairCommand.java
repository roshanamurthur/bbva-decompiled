package com.bbva.ethermobilesdk.plugin.command.factory;

import bk.p;
import bk.q;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.cipher.factory.RSAKeyPair;
import com.bbva.ethermobilesdk.cipher.factory.SecureElementFactoryKt;
import com.bbva.ethermobilesdk.cipher.model.CipherResultKt;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.plugin.extension.ExtensionKt;
import com.bbva.ethermobilesdk.plugin.model.PluginCipherError;
import com.bbva.ethermobilesdk.plugin.param.GenerateKeyPairParam;
import com.bbva.ethermobilesdk.plugin.util.ParamsValidator;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: RSAKeyPairCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/command/factory/RSAKeyPairCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/ethermobilesdk/plugin/param/GenerateKeyPairParam;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "<init>", "()V", "Companion", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class RSAKeyPairCommand extends AbstractCommand<GenerateKeyPairParam> {

    @NotNull
    public static final String EXPONENT = "exponent";

    @NotNull
    public static final String ID = "rsakeypair";

    @NotNull
    public static final String KEY = "key";

    @NotNull
    public static final String MODULUS = "modulus";

    @NotNull
    public static final String PRIVATE = "private";

    @NotNull
    public static final String PUBLIC = "public";

    public RSAKeyPairCommand() {
        super(GenerateKeyPairParam.class, new ParamsValidator());
    }

    public static JSONObject a(RSAKeyPair rSAKeyPair) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        BigInteger modulus = rSAKeyPair.getPublic().getModulus();
        Intrinsics.checkNotNullExpressionValue(modulus, "rsaKeyPair.public.modulus");
        jSONObject.put("modulus", ExtensionKt.toBase64(modulus));
        byte[] encoded = rSAKeyPair.getPrivate().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "rsaPrivateKey.encoded");
        jSONObject.put("private", p.mapOf(TuplesKt.to("key", EncodingUtilsKt.toBase64(encoded))));
        RSAPublicKey rSAPublicKey = rSAKeyPair.getPublic();
        byte[] encoded2 = rSAPublicKey.getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded2, "rsaPublicKey.encoded");
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        Intrinsics.checkNotNullExpressionValue(publicExponent, "rsaPublicKey.publicExponent");
        jSONObject.put("public", q.mapOf(TuplesKt.to("key", EncodingUtilsKt.toBase64(encoded2)), TuplesKt.to("exponent", ExtensionKt.toBase64(publicExponent))));
        return jSONObject;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull GenerateKeyPairParam params, @NotNull CommandCallback callback) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            Integer length = params.getLength();
            Intrinsics.checkNotNull(length);
            callback.sendEvent(a((RSAKeyPair) CipherResultKt.getOrThrow(SecureElementFactoryKt.rsaKeyPairOf$default(length.intValue(), null, 2, null))));
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) == null) {
            return;
        }
        callback.sendError(PluginCipherError.INVALID_KEY_PAIR);
    }
}
