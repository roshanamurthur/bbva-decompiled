package com.bbva.ethermobilesdk.cipher.token.generator.impl;

import androidx.annotation.VisibleForTesting;
import com.bbva.ethermobilesdk.cipher.token.exception.TokenException;
import com.bbva.ethermobilesdk.cipher.token.utils.OCRAUtils;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.cipher.utils.HexadecimalCharacters;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OCRAGeneratorImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0010"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/generator/impl/OCRAGeneratorImpl;", "", "", ClientData.KEY_CHALLENGE, "", "seed", "", "timeIncrement", "timeDrift", "ocraSuite", "", "currentTimeInMillis", "getOcra", "<init>", "()V", "Companion", "cipher_release"}, k = 1, mv = {1, 8, 0})
public final class OCRAGeneratorImpl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ERROR_GENERATING_OCRA = "ERROR_GENERATING_OCRA";

    @NotNull
    public final String getOcra(@NotNull String challenge, @NotNull byte[] seed, int timeIncrement, int timeDrift, @NotNull String ocraSuite, long currentTimeInMillis) throws TokenException {
        String message;
        String strGenerateOCRA;
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(seed, "seed");
        Intrinsics.checkNotNullParameter(ocraSuite, "ocraSuite");
        long j10 = ((currentTimeInMillis + ((long) ((timeDrift * timeIncrement) * 1000))) / ((long) 1000)) / ((long) timeIncrement);
        HexadecimalCharacters hexadecimalCharacters = HexadecimalCharacters.LOWERCASE;
        String hex = EncodingUtilsKt.toHex(seed, hexadecimalCharacters);
        try {
            if (StringsKt__StringsKt.contains$default((CharSequence) ocraSuite, (CharSequence) "QN", false, 2, (Object) null)) {
                String string = new BigInteger(challenge).toString(16);
                String string2 = Long.toString(j10, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string2, "toString(this, checkRadix(radix))");
                strGenerateOCRA = OCRAUtils.generateOCRA(ocraSuite, hex, "", string, "", "", string2);
            } else {
                byte[] bytes = challenge.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                String hex2 = EncodingUtilsKt.toHex(bytes, hexadecimalCharacters);
                String string3 = Long.toString(j10, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string3, "toString(this, checkRadix(radix))");
                strGenerateOCRA = OCRAUtils.generateOCRA(ocraSuite, hex, "", hex2, "", "", string3);
            }
            Intrinsics.checkNotNullExpressionValue(strGenerateOCRA, "{\n            if (ocraSu…)\n            }\n        }");
            return strGenerateOCRA;
        } catch (Exception e5) {
            if ((e5 instanceof NoSuchAlgorithmException) || (e5 instanceof IllegalArgumentException) || (e5 instanceof InvalidKeyException)) {
                message = e5.getMessage();
                if (message == null) {
                    message = "Error generating OCRA.";
                }
            } else {
                message = e5.getMessage();
                if (message == null) {
                    message = "Unknown error.";
                }
            }
            throw new TokenException(e5, ERROR_GENERATING_OCRA, message);
        }
    }

    /* JADX INFO: compiled from: OCRAGeneratorImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/generator/impl/OCRAGeneratorImpl$Companion;", "", "()V", OCRAGeneratorImpl.ERROR_GENERATING_OCRA, "", "getERROR_GENERATING_OCRA$cipher_release$annotations", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getERROR_GENERATING_OCRA$cipher_release$annotations() {
        }
    }
}
