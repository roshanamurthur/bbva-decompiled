package com.bbva.ethermobilesdk.plugin.command.symmetric;

import bk.q;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.cipher.factory.SecureElementFactoryKt;
import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.ethermobilesdk.cipher.model.CipherResultKt;
import com.bbva.ethermobilesdk.cipher.model.SymmetricAlgorithm;
import com.bbva.ethermobilesdk.cipher.token.model.SecretKeyBundle;
import com.bbva.ethermobilesdk.cipher.token.model.SecretKeyGeneratorAttributes;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.plugin.extension.ExtensionKt;
import com.bbva.ethermobilesdk.plugin.extension.StringKt;
import com.bbva.ethermobilesdk.plugin.param.SymmetricKeyParam;
import com.bbva.ethermobilesdk.plugin.util.ParamsValidator;
import com.bbva.ethermobilesdk.token.constant.ConstantKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: SymmetricKeyCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/command/symmetric/SymmetricKeyCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/ethermobilesdk/plugin/param/SymmetricKeyParam;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "<init>", "()V", "Companion", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class SymmetricKeyCommand extends AbstractCommand<SymmetricKeyParam> {

    @NotNull
    public static final String ID = "symmetrickey";

    @NotNull
    public static final String KEY = "key";

    @NotNull
    public static final String SALT = "salt";

    public SymmetricKeyCommand() {
        super(SymmetricKeyParam.class, new ParamsValidator());
    }

    public static CipherResult a(SymmetricKeyParam symmetricKeyParam, SymmetricAlgorithm symmetricAlgorithm) {
        Integer saltLength = symmetricKeyParam.getSaltLength();
        int iIntValue = saltLength != null ? saltLength.intValue() : 16;
        byte[] bArr = (byte[]) CipherResultKt.getOrThrow(SecureElementFactoryKt.saltOf$default(iIntValue, null, 2, null));
        String password = symmetricKeyParam.getPassword();
        Intrinsics.checkNotNull(password);
        String keySpecAlg = symmetricAlgorithm.getKeySpecAlg();
        int keyLength = symmetricAlgorithm.getKeyLength();
        Integer iterations = symmetricKeyParam.getIterations();
        return SecureElementFactoryKt.secretKeyOf(password, new SecretKeyGeneratorAttributes(ConstantKt.PWD_KEYFACTORY_ALGORITHM, keySpecAlg, keyLength, iterations != null ? iterations.intValue() : 1000, iIntValue, bArr));
    }

    public static Map b(SecretKeyBundle secretKeyBundle) {
        byte[] encoded = secretKeyBundle.getKey().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "secretKeyBundle.key.encoded");
        return q.mapOf(TuplesKt.to("key", EncodingUtilsKt.toBase64(encoded)), TuplesKt.to("salt", EncodingUtilsKt.toBase64(secretKeyBundle.getSalt())));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0054 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:3:0x000a, B:5:0x001d, B:7:0x0036, B:10:0x003f, B:13:0x0058, B:12:0x0054), top: B:22:0x000a }] */
    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull SymmetricKeyParam params, @NotNull CommandCallback callback) {
        Object objM5535constructorimpl;
        CipherResult<SecretKeyBundle> cipherResultA;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            String alg = params.getAlg();
            Intrinsics.checkNotNull(alg);
            SymmetricAlgorithm symmetricKeyAlgorithm = StringKt.toSymmetricKeyAlgorithm(alg);
            if (params.getSalt() != null) {
                String password = params.getPassword();
                Intrinsics.checkNotNull(password);
                String keySpecAlg = symmetricKeyAlgorithm.getKeySpecAlg();
                int keyLength = symmetricKeyAlgorithm.getKeyLength();
                Integer iterations = params.getIterations();
                int iIntValue = iterations != null ? iterations.intValue() : 1000;
                String salt = params.getSalt();
                Intrinsics.checkNotNull(salt);
                cipherResultA = SecureElementFactoryKt.secretKeyOf(password, new SecretKeyGeneratorAttributes(ConstantKt.PWD_KEYFACTORY_ALGORITHM, keySpecAlg, keyLength, iIntValue, EncodingUtilsKt.base64ToByteArray(salt)));
                if (cipherResultA == null) {
                    cipherResultA = a(params, symmetricKeyAlgorithm);
                }
            } else {
                cipherResultA = a(params, symmetricKeyAlgorithm);
            }
            callback.sendEvent(new JSONObject(b((SecretKeyBundle) CipherResultKt.getOrThrow(cipherResultA))));
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
