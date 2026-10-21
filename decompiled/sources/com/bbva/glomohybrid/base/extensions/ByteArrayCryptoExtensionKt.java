package com.bbva.glomohybrid.base.extensions;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ByteArrayCryptoExtension.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"decryptByte", "", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ByteArrayCryptoExtensionKt {
    @Nullable
    public static final byte[] decryptByte(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{99, Constants.FCI_TEMPLATE, 100, 105, 110, 103, Constants.DIRECTORY_ENTRY, 102, 102, Constants.DIRECTORY_ENTRY, 105, 114, 115, 99, Constants.FCI_TEMPLATE, 109}, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(2, secretKeySpec);
            return cipher.doFinal(bArr);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
                objM5535constructorimpl = null;
            }
            return (byte[]) objM5535constructorimpl;
        }
    }
}
