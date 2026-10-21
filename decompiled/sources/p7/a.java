package p7;

import android.content.Context;
import com.bbva.ethermobilesdk.cipher.keystore.KeyStoreCipher;
import com.bbva.ethermobilesdk.token.local.storage.extension.CipherKt;
import com.bbva.localstorage.storage.Cipher;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TokenPreferencesStorage.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements Cipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KeyStoreCipher f92581a;

    public a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f92581a = new KeyStoreCipher(context);
    }

    @Override // com.bbva.localstorage.storage.Cipher
    @Nullable
    public final String decrypt(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return (String) CipherKt.valueOrNull(this.f92581a.decrypt(str));
    }

    @Override // com.bbva.localstorage.storage.Cipher
    @Nullable
    public final String encrypt(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return (String) CipherKt.valueOrNull(this.f92581a.encrypt(str));
    }
}
