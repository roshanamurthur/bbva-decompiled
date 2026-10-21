package com.bbva.ethermobilesdk.cipher;

import android.content.Context;
import javax.crypto.Cipher;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PlatformCipherProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/PlatformCipherProvider;", "", "toCipherForDecryption", "Ljavax/crypto/Cipher;", "context", "Landroid/content/Context;", "data", "", "seed", "toCipherForEncryption", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PlatformCipherProvider {

    /* JADX INFO: compiled from: PlatformCipherProvider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Cipher toCipherForDecryption$default(PlatformCipherProvider platformCipherProvider, Context context, String str, String str2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCipherForDecryption");
            }
            if ((i10 & 4) != 0) {
                str2 = null;
            }
            return platformCipherProvider.toCipherForDecryption(context, str, str2);
        }

        public static /* synthetic */ Cipher toCipherForEncryption$default(PlatformCipherProvider platformCipherProvider, Context context, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCipherForEncryption");
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            return platformCipherProvider.toCipherForEncryption(context, str);
        }
    }

    @NotNull
    Cipher toCipherForDecryption(@NotNull Context context, @NotNull String data, @Nullable String seed);

    @NotNull
    Cipher toCipherForEncryption(@NotNull Context context, @Nullable String seed);
}
