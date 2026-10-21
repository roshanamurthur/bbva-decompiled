package com.bbva.semaas;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Cipher.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/semaas/TextPlain;", "Lcom/bbva/semaas/Cipher;", "()V", "decrypt", "", "content", "encrypt", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextPlain implements Cipher {
    @Override // com.bbva.semaas.Cipher
    @NotNull
    public String decrypt(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return content;
    }

    @Override // com.bbva.semaas.Cipher
    @NotNull
    public String encrypt(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return content;
    }
}
