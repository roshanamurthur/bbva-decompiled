package com.bbva.ethermobilesdk.plugin.command.jwe;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.cipher.factory.RSAKeyPair;
import com.bbva.ethermobilesdk.cipher.factory.SecureElementFactoryKt;
import com.bbva.ethermobilesdk.cipher.jwe.CipherAlgorithm;
import com.bbva.ethermobilesdk.cipher.jwe.JweCipher;
import com.bbva.ethermobilesdk.cipher.jwe.jwk.Jwk;
import com.bbva.ethermobilesdk.cipher.jwe.jwk.JwkFactoryKt;
import com.bbva.ethermobilesdk.cipher.model.CipherResultKt;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.plugin.InjectorKt;
import com.bbva.ethermobilesdk.plugin.extension.ExtensionKt;
import com.bbva.ethermobilesdk.plugin.extension.StringKt;
import com.bbva.ethermobilesdk.plugin.param.JweKeyPairParam;
import com.bbva.ethermobilesdk.plugin.util.ParamsValidator;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: JweRSAKeyPairCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/command/jwe/JweRSAKeyPairCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/ethermobilesdk/plugin/param/JweKeyPairParam;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "<init>", "()V", "Companion", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class JweRSAKeyPairCommand extends AbstractCommand<JweKeyPairParam> {

    @NotNull
    public static final String EXPONENT = "exponent";

    @NotNull
    public static final String ID = "jwegeneratersajwk";

    @NotNull
    public static final String JWK = "jwk";

    @NotNull
    public static final String KEY = "key";

    @NotNull
    public static final String MODULUS = "modulus";

    @NotNull
    public static final String PRIVATE = "private";

    @NotNull
    public static final String PUBLIC = "public";

    @NotNull
    public static final String RSA = "rsa";

    /* JADX INFO: compiled from: JweRSAKeyPairCommand.kt */
    public static final class a extends Lambda implements Function1<JweCipher, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ JweKeyPairParam f29910p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f29911q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ JweRSAKeyPairCommand f29912r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JweKeyPairParam jweKeyPairParam, CommandCallback commandCallback, JweRSAKeyPairCommand jweRSAKeyPairCommand) {
            super(1);
            this.f29910p0 = jweKeyPairParam;
            this.f29911q0 = commandCallback;
            this.f29912r0 = jweRSAKeyPairCommand;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(JweCipher jweCipher) throws JSONException {
            JweCipher it = jweCipher;
            Intrinsics.checkNotNullParameter(it, "it");
            Integer length = this.f29910p0.getLength();
            Intrinsics.checkNotNull(length);
            RSAKeyPair rSAKeyPair = (RSAKeyPair) CipherResultKt.getOrThrow(SecureElementFactoryKt.rsaKeyPairOf$default(length.intValue(), null, 2, null));
            this.f29911q0.sendEvent(JweRSAKeyPairCommand.access$toResponse(this.f29912r0, rSAKeyPair, JwkFactoryKt.jwkOf$default(rSAKeyPair.getPublic(), null, null, 6, null)));
            return Unit.INSTANCE;
        }
    }

    public JweRSAKeyPairCommand() {
        super(JweKeyPairParam.class, new ParamsValidator());
    }

    public static final JSONObject access$toResponse(JweRSAKeyPairCommand jweRSAKeyPairCommand, RSAKeyPair rSAKeyPair, Jwk jwk) throws JSONException {
        jweRSAKeyPairCommand.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        BigInteger modulus = rSAKeyPair.getPublic().getModulus();
        Intrinsics.checkNotNullExpressionValue(modulus, "rsaKeyPair.public.modulus");
        jSONObject2.put("modulus", ExtensionKt.toBase64(modulus));
        RSAPrivateKey rSAPrivateKey = rSAKeyPair.getPrivate();
        JSONObject jSONObject3 = new JSONObject();
        byte[] encoded = rSAPrivateKey.getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "rsaPrivateKey.encoded");
        jSONObject3.put("key", EncodingUtilsKt.toBase64(encoded));
        jSONObject2.put("private", jSONObject3);
        RSAPublicKey rSAPublicKey = rSAKeyPair.getPublic();
        JSONObject jSONObject4 = new JSONObject();
        byte[] encoded2 = rSAPublicKey.getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded2, "rsaPublicKey.encoded");
        jSONObject4.put("key", EncodingUtilsKt.toBase64(encoded2));
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        Intrinsics.checkNotNullExpressionValue(publicExponent, "rsaPublicKey.publicExponent");
        jSONObject4.put("exponent", ExtensionKt.toBase64(publicExponent));
        jSONObject2.put("public", jSONObject4);
        jSONObject.put(RSA, jSONObject2);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("public", EncodingUtilsKt.toBase64UrlSafe(l.encodeToByteArray(jwk.toJSONString())));
        jSONObject.put(JWK, jSONObject5);
        return jSONObject;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull JweKeyPairParam params, @NotNull CommandCallback callback) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            String keyAlgorithm = params.getKeyAlgorithm();
            Intrinsics.checkNotNull(keyAlgorithm);
            String jweRsaKeyPairKeyAlgorithm = StringKt.toJweRsaKeyPairKeyAlgorithm(keyAlgorithm);
            String contentAlgorithm = params.getContentAlgorithm();
            Intrinsics.checkNotNull(contentAlgorithm);
            InjectorKt.runJweCipherClient(new CipherAlgorithm(jweRsaKeyPairKeyAlgorithm, StringKt.toJweRsaKeyPairContentAlgorithm(contentAlgorithm)), ID, callback, new a(params, callback, this));
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return;
        }
        ExtensionKt.manageException(thM5538exceptionOrNullimpl, ID, callback);
    }
}
