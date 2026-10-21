package com.bbva.ethermobilesdk.deviceuid.utils;

import android.os.Build;
import com.bbva.ethermobilesdk.cipher.model.CipherResultKt;
import com.bbva.ethermobilesdk.cipher.token.generator.HashGenerator;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Crypto.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\b\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\b\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u001a\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"SHA_256", "", "SHA_512", "generateUID", "generateUIDKey", "hashAsHex", "algorithm", "text", "deviceuid_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CryptoKt {

    @NotNull
    public static final String SHA_256 = "SHA-256";

    @NotNull
    public static final String SHA_512 = "SHA-512";

    @NotNull
    public static final String generateUID() {
        return hashAsHex$default(null, UUID.randomUUID().toString() + System.currentTimeMillis(), 1, null);
    }

    @NotNull
    public static final String generateUIDKey() {
        try {
            return hashAsHex("SHA-256", Build.MODEL + Build.MANUFACTURER);
        } catch (Exception e5) {
            LogKt.logError("generateUIDKey", e5);
            return Build.MODEL + Build.MANUFACTURER;
        }
    }

    @NotNull
    public static final String hashAsHex(@NotNull String algorithm, @NotNull String text) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(text, "text");
        return EncodingUtilsKt.toHex$default((byte[]) CipherResultKt.getOrThrow(HashGenerator.INSTANCE.generateHash(text, algorithm)), null, 1, null);
    }

    public static /* synthetic */ String hashAsHex$default(String str, String str2, int i10, Object obj) throws NoSuchAlgorithmException {
        if ((i10 & 1) != 0) {
            str = "SHA-512";
        }
        return hashAsHex(str, str2);
    }
}
