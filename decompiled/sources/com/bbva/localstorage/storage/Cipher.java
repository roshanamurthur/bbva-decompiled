package com.bbva.localstorage.storage;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Storage.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/bbva/localstorage/storage/Cipher;", "", "decrypt", "", "text", "encrypt", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Cipher {
    @Nullable
    String decrypt(@Nullable String text);

    @Nullable
    String encrypt(@Nullable String text);
}
