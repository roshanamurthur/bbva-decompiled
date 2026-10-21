package com.bbva.ethermobilesdk.passchecker.util;

import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Hash.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0004"}, d2 = {"shaOf", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "data", "passchecker_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HashKt {
    @NotNull
    public static final Result<byte[]> shaOf(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            byte[] bArrDigest = MessageDigest.getInstance(new String(EncodingUtilsKt.base64ToByteArray("U0hBLTE="), Charsets.UTF_8)).digest(data);
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "getInstance(String(\"U0hB…yteArray())).digest(data)");
            return new Result.Success(bArrDigest);
        } catch (Exception e5) {
            return new Result.Error(e5);
        }
    }
}
