package com.veridas.metadata.entities;

import androidx.annotation.Keep;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntegrityCalculation.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/veridas/metadata/entities/IntegrityCalculation;", "", "()V", "Companion", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IntegrityCalculation {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: IntegrityCalculation.kt */
    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000b"}, d2 = {"Lcom/veridas/metadata/entities/IntegrityCalculation$Companion;", "", "()V", "generateMac", "", "key", "data", "algorithm", "", "hashString", "input", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final byte[] generateMac(@NotNull byte[] key, @NotNull byte[] data, @NotNull String algorithm) throws NoSuchAlgorithmException, InvalidKeyException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(algorithm, "algorithm");
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key, algorithm));
            byte[] bArrDoFinal = mac.doFinal(data);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "run(...)");
            return bArrDoFinal;
        }

        @JvmStatic
        @NotNull
        public final byte[] hashString(@NotNull byte[] input, @NotNull String algorithm) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(algorithm, "algorithm");
            byte[] bArrDigest = MessageDigest.getInstance(algorithm).digest(input);
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
            return bArrDigest;
        }
    }

    @JvmStatic
    @NotNull
    public static final byte[] generateMac(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull String str) {
        return INSTANCE.generateMac(bArr, bArr2, str);
    }

    @JvmStatic
    @NotNull
    public static final byte[] hashString(@NotNull byte[] bArr, @NotNull String str) {
        return INSTANCE.hashString(bArr, str);
    }
}
