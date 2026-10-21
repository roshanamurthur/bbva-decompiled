package com.bbva.glomo.localstorage;

import android.content.Context;
import com.bbva.localstorage.storage.Cipher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LocalStorageCipherFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/bbva/glomo/localstorage/LocalStorageCipherFactory;", "", "Landroid/content/Context;", "context", "Lcom/bbva/localstorage/storage/Cipher;", "Lcom/bbva/glomo/localstorage/StorageCipher;", "create", "<init>", "()V", "gl-local-storage_release"}, k = 1, mv = {1, 9, 0})
public final class LocalStorageCipherFactory {

    @NotNull
    public static final LocalStorageCipherFactory INSTANCE = new LocalStorageCipherFactory();

    @NotNull
    public final Cipher create(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new LocalStorageCipherImplV23(null, 1, null);
    }
}
