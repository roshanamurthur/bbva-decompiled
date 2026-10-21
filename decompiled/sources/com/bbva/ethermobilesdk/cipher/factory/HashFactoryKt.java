package com.bbva.ethermobilesdk.cipher.factory;

import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.cipher.extension.LongKt;
import com.bbva.ethermobilesdk.cipher.model.HashAlgorithm;
import com.bbva.ethermobilesdk.cipher.model.HmacAlgorithm;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HashFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002\u001a$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002\u001a\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0002\u001a\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f\u001a\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\r¨\u0006\u000e"}, d2 = {"hashOf", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "hashAlgorithm", "Lcom/bbva/ethermobilesdk/cipher/model/HashAlgorithm;", "data", "hmacOf", "hmacAlgorithm", "Lcom/bbva/ethermobilesdk/cipher/model/HmacAlgorithm;", "keyBytes", "sha256Of", "content", "", "", "cipher_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HashFactoryKt {
    @NotNull
    public static final Result<byte[]> hashOf(@NotNull HashAlgorithm hashAlgorithm, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(hashAlgorithm, "hashAlgorithm");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            byte[] bArrDigest = MessageDigest.getInstance(hashAlgorithm.getAlgorithm()).digest(data);
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "getInstance(hashAlgorithm.algorithm).digest(data)");
            return new Result.Success(bArrDigest);
        } catch (Exception e5) {
            return new Result.Error(e5);
        }
    }

    @NotNull
    public static final Result<byte[]> hmacOf(@NotNull HmacAlgorithm hmacAlgorithm, @NotNull byte[] keyBytes, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(hmacAlgorithm, "hmacAlgorithm");
        Intrinsics.checkNotNullParameter(keyBytes, "keyBytes");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Mac mac = Mac.getInstance(hmacAlgorithm.getAlgorithm());
            mac.init(new SecretKeySpec(keyBytes, hmacAlgorithm.getAlgorithm()));
            byte[] bArrDoFinal = mac.doFinal(data);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "getInstance(hmacAlgorith…  doFinal(data)\n        }");
            return new Result.Success(bArrDoFinal);
        } catch (Exception e5) {
            return new Result.Error(e5);
        }
    }

    @NotNull
    public static final Result<byte[]> sha256Of(@NotNull byte[] content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return hashOf(HashAlgorithm.SHA256, content);
    }

    @NotNull
    public static final Result<byte[]> sha256Of(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        HashAlgorithm hashAlgorithm = HashAlgorithm.SHA256;
        byte[] bytes = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return hashOf(hashAlgorithm, bytes);
    }

    @NotNull
    public static final Result<byte[]> sha256Of(long j10) {
        return hashOf(HashAlgorithm.SHA256, LongKt.toByteArray(j10));
    }
}
