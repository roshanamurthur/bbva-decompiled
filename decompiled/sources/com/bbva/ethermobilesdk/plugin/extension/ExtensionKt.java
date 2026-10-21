package com.bbva.ethermobilesdk.plugin.extension;

import android.view.KeyCharacterMap;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.ethermobilesdk.cipher.pincipher.exception.PinCipherException;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.plugin.Injector;
import com.bbva.ethermobilesdk.plugin.command.pincipher.PinCipherDecryptCommand;
import com.bbva.ethermobilesdk.plugin.command.pincipher.PinCipherDecryptCommandKt;
import com.bbva.ethermobilesdk.plugin.command.pincipher.PinCipherEncryptCommand;
import com.bbva.ethermobilesdk.plugin.command.pincipher.PinCipherEncryptCommandKt;
import com.bbva.ethermobilesdk.plugin.command.pincipher.PinCipherEncryptFromConfigCommand;
import com.bbva.ethermobilesdk.plugin.command.pincipher.PinCipherEncryptFromConfigCommandKt;
import com.bbva.ethermobilesdk.plugin.command.pincipher.PinCipherGenerateKeyPairCommand;
import com.bbva.ethermobilesdk.plugin.command.pincipher.PinCipherGenerateKeyPairCommandKt;
import com.bbva.ethermobilesdk.plugin.model.PluginCipherError;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extension.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\f\u0010\n\u001a\u00020\u0004*\u00020\u000bH\u0000\u001a\f\u0010\f\u001a\u00020\u0004*\u00020\u000bH\u0000\u001a\u001d\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000fH\u0000¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"manage", "Lcom/bbva/ethermobilesdk/plugin/model/PluginCipherError;", "Lcom/bbva/ethermobilesdk/cipher/pincipher/exception/PinCipherException;", "commandId", "", "manageException", "", "", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "toBase64", "Ljava/math/BigInteger;", "toBase64UrlSafe", "valueOrException", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;", "(Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;)Ljava/lang/Object;", "cipher-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExtensionKt {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final PluginCipherError manage(@NotNull PinCipherException pinCipherException, @Nullable String str) {
        Intrinsics.checkNotNullParameter(pinCipherException, "<this>");
        if (Intrinsics.areEqual(pinCipherException.getF29329p0(), String.valueOf(PluginCipherError.CLIENT_NOT_INITIALIZED.getF29159p0()))) {
            return Injector.INSTANCE.toInitializationError(pinCipherException);
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1196567631:
                    if (str.equals(PinCipherEncryptFromConfigCommand.ID)) {
                        return PinCipherEncryptFromConfigCommandKt.toEncryptFromConfigError(pinCipherException);
                    }
                    break;
                case -1073626491:
                    if (str.equals(PinCipherEncryptCommand.ID)) {
                        return PinCipherEncryptCommandKt.toEncryptError(pinCipherException);
                    }
                    break;
                case 815761729:
                    if (str.equals(PinCipherGenerateKeyPairCommand.ID)) {
                        return PinCipherGenerateKeyPairCommandKt.toGenerateKeyPairError(pinCipherException);
                    }
                    break;
                case 2076174765:
                    if (str.equals(PinCipherDecryptCommand.ID)) {
                        return PinCipherDecryptCommandKt.toDecryptError(pinCipherException);
                    }
                    break;
            }
        }
        return PluginCipherError.UNKNOWN_ERROR;
    }

    public static final void manageException(@NotNull Throwable th2, @NotNull String commandId, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (th2 instanceof PinCipherException) {
            callback.sendError(manage((PinCipherException) th2, commandId));
            return;
        }
        if ((th2 instanceof NoSuchAlgorithmException) || (th2 instanceof InvalidAlgorithmParameterException)) {
            callback.sendError(PluginCipherError.INVALID_ALGORITHM);
            return;
        }
        if (th2 instanceof KeyCharacterMap.UnavailableException) {
            callback.sendError(PluginCipherError.INVALID_KEY_PAIR);
        } else if (th2 instanceof ParseException) {
            callback.sendError(PluginCipherError.INVALID_BASE_64);
        } else {
            callback.sendError(Errors.ErrorDefault);
        }
    }

    @NotNull
    public static final String toBase64(@NotNull BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        byte[] byteArray = bigInteger.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray()");
        return EncodingUtilsKt.toBase64(byteArray);
    }

    @NotNull
    public static final String toBase64UrlSafe(@NotNull BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        byte[] byteArray = bigInteger.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray()");
        return EncodingUtilsKt.toBase64UrlSafe(byteArray);
    }

    public static final <T> T valueOrException(@NotNull CipherResult<T> cipherResult) throws Throwable {
        Intrinsics.checkNotNullParameter(cipherResult, "<this>");
        if (cipherResult instanceof CipherResult.Success) {
            return (T) ((CipherResult.Success) cipherResult).getValue();
        }
        if (cipherResult instanceof CipherResult.Error) {
            throw ((CipherResult.Error) cipherResult).getException();
        }
        throw new NoWhenBranchMatchedException();
    }
}
