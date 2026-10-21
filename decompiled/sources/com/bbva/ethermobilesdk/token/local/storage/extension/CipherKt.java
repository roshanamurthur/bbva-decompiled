package com.bbva.ethermobilesdk.token.local.storage.extension;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.ethermobilesdk.cipher.token.generator.HashGenerator;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.cipher.utils.HexadecimalCharacters;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Cipher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a!\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0000¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;", "valueOrNull", "(Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;)Ljava/lang/Object;", "", "sha256OrOriginal", "ethertoken-local-storage_release"}, k = 2, mv = {1, 8, 0})
public final class CipherKt {
    @NotNull
    public static final String sha256OrOriginal(@NotNull String str) {
        String hex;
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArr = (byte[]) valueOrNull(HashGenerator.INSTANCE.generateHash(str, "SHA-256"));
        return (bArr == null || (hex = EncodingUtilsKt.toHex(bArr, HexadecimalCharacters.LOWERCASE)) == null) ? str : hex;
    }

    @Nullable
    public static final <T> T valueOrNull(@NotNull CipherResult<T> cipherResult) {
        Intrinsics.checkNotNullParameter(cipherResult, "<this>");
        if (cipherResult instanceof CipherResult.Success) {
            return (T) ((CipherResult.Success) cipherResult).getValue();
        }
        if (cipherResult instanceof CipherResult.Error) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
