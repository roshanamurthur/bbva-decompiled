package com.bbva.glomo.localstorage;

import android.util.Base64;
import com.bbva.localstorage.storage.Cipher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CryptoExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00060\u0002j\u0002`\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u001a\u001c\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b*\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\u00010\u0001*\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b*\n\u0010\r\"\u00020\u000e2\u00020\u000e*\n\u0010\u000f\"\u00020\u00022\u00020\u0002¨\u0006\u0010"}, d2 = {"applyCipher", "", "Lcom/bbva/localstorage/storage/Cipher;", "Lcom/bbva/glomo/localstorage/StorageCipher;", "value", "block", "Lkotlin/Function1;", "fromBase64", "", "kotlin.jvm.PlatformType", "mode", "", "toBase64", "AndroidCipher", "Ljavax/crypto/Cipher;", "StorageCipher", "gl-local-storage_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CryptoExtensionsKt {
    @Nullable
    public static final String applyCipher(@NotNull Cipher cipher, @Nullable String str, @NotNull Function1<? super String, String> block) {
        Intrinsics.checkNotNullParameter(cipher, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (str == null) {
            return null;
        }
        return str.length() == 0 ? str : block.invoke(str);
    }

    public static final byte[] fromBase64(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Base64.decode(str, i10);
    }

    public static /* synthetic */ byte[] fromBase64$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return fromBase64(str, i10);
    }

    public static final String toBase64(@NotNull byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return Base64.encodeToString(bArr, i10);
    }

    public static /* synthetic */ String toBase64$default(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return toBase64(bArr, i10);
    }
}
