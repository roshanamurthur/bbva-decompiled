package com.bbva.localstorage.cipher;

import android.content.Context;
import com.bbva.ethermobilesdk.cipher.keystore.KeyStoreCipher;
import com.bbva.localstorage.extension.ResultKt;
import com.bbva.localstorage.storage.Cipher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocalStorageCipher.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/localstorage/cipher/LocalStorageCipher;", "Lcom/bbva/localstorage/storage/Cipher;", "", "text", "encrypt", "decrypt", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "local-storage_release"}, k = 1, mv = {1, 8, 0})
public final class LocalStorageCipher implements Cipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KeyStoreCipher f34987a;

    public LocalStorageCipher(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34987a = new KeyStoreCipher(context);
    }

    @Override // com.bbva.localstorage.storage.Cipher
    @Nullable
    public String decrypt(@Nullable String text) {
        return text == null ? text : (String) ResultKt.valueOrNull(this.f34987a.decrypt(text));
    }

    @Override // com.bbva.localstorage.storage.Cipher
    @Nullable
    public String encrypt(@Nullable String text) {
        return text == null ? text : (String) ResultKt.valueOrNull(this.f34987a.encrypt(text));
    }
}
