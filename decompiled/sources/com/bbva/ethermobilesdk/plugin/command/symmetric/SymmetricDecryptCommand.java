package com.bbva.ethermobilesdk.plugin.command.symmetric;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.cipher.model.CipherResultKt;
import com.bbva.ethermobilesdk.cipher.softcipher.SoftCipher;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.plugin.InjectorKt;
import com.bbva.ethermobilesdk.plugin.extension.StringKt;
import com.bbva.ethermobilesdk.plugin.param.SymmetricEncDecParam;
import com.bbva.ethermobilesdk.plugin.util.ParamsValidator;
import com.fasterxml.jackson.core.JsonPointer;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SymmetricDecryptCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/command/symmetric/SymmetricDecryptCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/ethermobilesdk/plugin/param/SymmetricEncDecParam;", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SymmetricDecryptCommand extends AbstractCommand<SymmetricEncDecParam> {

    @NotNull
    public static final String ID = "decrypt";

    /* JADX INFO: compiled from: SymmetricDecryptCommand.kt */
    public static final class a extends Lambda implements Function1<SoftCipher, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SymmetricEncDecParam f29924p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f29925q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SymmetricEncDecParam symmetricEncDecParam, CommandCallback commandCallback) {
            super(1);
            this.f29924p0 = symmetricEncDecParam;
            this.f29925q0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SoftCipher softCipher) throws NoSuchAlgorithmException {
            SoftCipher it = softCipher;
            Intrinsics.checkNotNullParameter(it, "it");
            SymmetricEncDecParam symmetricEncDecParam = this.f29924p0;
            String alg = symmetricEncDecParam.getAlg();
            Intrinsics.checkNotNull(alg);
            String symmetricAlgorithm = StringKt.toSymmetricAlgorithm(alg);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(symmetricEncDecParam.getAlg());
            sb2.append(JsonPointer.SEPARATOR);
            String mode = symmetricEncDecParam.getMode();
            Intrinsics.checkNotNull(mode);
            sb2.append(mode);
            String symmetricAlgorithmTransformation = StringKt.toSymmetricAlgorithmTransformation(sb2.toString());
            String data = symmetricEncDecParam.getData();
            Intrinsics.checkNotNull(data);
            byte[] bArrBase64ToByteArray = EncodingUtilsKt.base64ToByteArray(data);
            String key = symmetricEncDecParam.getKey();
            Intrinsics.checkNotNull(key);
            byte[] bArrBase64ToByteArray2 = EncodingUtilsKt.base64ToByteArray(key);
            String iv = symmetricEncDecParam.getIv();
            byte[] decrypt = (byte[]) CipherResultKt.getOrThrow(it.decrypt(bArrBase64ToByteArray, bArrBase64ToByteArray2, symmetricAlgorithm, symmetricAlgorithmTransformation, iv != null ? EncodingUtilsKt.base64ToByteArray(iv) : null));
            Intrinsics.checkNotNullExpressionValue(decrypt, "decrypt");
            this.f29925q0.sendEvent(new String(decrypt, Charsets.UTF_8));
            return Unit.INSTANCE;
        }
    }

    public SymmetricDecryptCommand() {
        super(SymmetricEncDecParam.class, new ParamsValidator());
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull SymmetricEncDecParam params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InjectorKt.runSoftCipherClient("decrypt", callback, new a(params, callback));
    }
}
