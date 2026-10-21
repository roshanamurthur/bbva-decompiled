package com.bbva.ethermobilesdk.cipher.pincipher.utils;

import com.bbva.ethermobilesdk.cipher.pincipher.exception.PinCipherException;
import com.bbva.ethermobilesdk.cipher.pincipher.model.ByteHostData;
import com.bbva.ethermobilesdk.cipher.pincipher.model.HostData;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EncodingUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/pincipher/model/HostData;", "Lcom/bbva/ethermobilesdk/cipher/pincipher/model/ByteHostData;", "toByteHostData", "", "toHexHostData", "cipher_release"}, k = 2, mv = {1, 8, 0})
public final class EncodingUtilsKt {
    @NotNull
    public static final ByteHostData toByteHostData(@NotNull HostData hostData) throws PinCipherException {
        Intrinsics.checkNotNullParameter(hostData, "<this>");
        try {
            byte[] bArrHexStringToByteArray$default = com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt.hexStringToByteArray$default(hostData.getIndex(), null, 1, null);
            byte[] bArrHexStringToByteArray$default2 = com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt.hexStringToByteArray$default(hostData.getVersion(), null, 1, null);
            String firstSegment = hostData.getFirstSegment();
            Locale locale = Locale.ROOT;
            String upperCase = firstSegment.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            byte[] bArrHexStringToByteArray$default3 = com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt.hexStringToByteArray$default(upperCase, null, 1, null);
            String upperCase2 = hostData.getSecondSegment().toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return new ByteHostData(bArrHexStringToByteArray$default, bArrHexStringToByteArray$default2, bArrHexStringToByteArray$default3, com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt.hexStringToByteArray$default(upperCase2, null, 1, null));
        } catch (Exception e5) {
            throw new PinCipherException(e5, "ERROR_CONVERTING_TYPES", "Error converting types.");
        }
    }

    @NotNull
    public static final HostData toHexHostData(@NotNull String str) throws PinCipherException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String strSubstring = str.substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strSubstring2 = str.substring(2, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            String strSubstring3 = str.substring(4, LibMCryptConstants.IND_HEX_SEGMENTO2);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
            String strSubstring4 = str.substring(LibMCryptConstants.IND_HEX_SEGMENTO2);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String).substring(startIndex)");
            return new HostData(strSubstring, strSubstring2, strSubstring3, strSubstring4);
        } catch (Exception e5) {
            throw new PinCipherException(e5, "ERROR_INVALID_LENGTH", "Invalid data length to convert types.");
        }
    }
}
