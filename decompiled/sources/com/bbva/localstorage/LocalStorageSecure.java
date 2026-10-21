package com.bbva.localstorage;

import android.content.Context;
import com.bbva.localstorage.storage.SecureBiometricsStorage;
import com.bbva.localstorage.storage.StorageSecure;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocalStorageSecure.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/bbva/localstorage/LocalStorageSecure;", "", "Landroid/content/Context;", "context", "", "ignoreBackup", "Lcom/bbva/localstorage/storage/StorageSecure;", "storage", Constants.SYNC, "", "warmUp", "Lcom/bbva/localstorage/storage/StorageSecure;", "getStorage", "()Lcom/bbva/localstorage/storage/StorageSecure;", "setStorage", "(Lcom/bbva/localstorage/storage/StorageSecure;)V", "<init>", "()V", "local-storage_release"}, k = 1, mv = {1, 8, 0})
public final class LocalStorageSecure {

    @NotNull
    public static final LocalStorageSecure INSTANCE = new LocalStorageSecure();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f34984a;
    public static StorageSecure storage;

    public static /* synthetic */ void warmUp$default(LocalStorageSecure localStorageSecure, Context context, boolean z10, StorageSecure storageSecure, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            storageSecure = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        localStorageSecure.warmUp(context, z10, storageSecure, z11);
    }

    @NotNull
    public final StorageSecure getStorage() {
        StorageSecure storageSecure = storage;
        if (storageSecure != null) {
            return storageSecure;
        }
        Intrinsics.throwUninitializedPropertyAccessException("storage");
        return null;
    }

    public final void setStorage(@NotNull StorageSecure storageSecure) {
        Intrinsics.checkNotNullParameter(storageSecure, "<set-?>");
        storage = storageSecure;
    }

    public final void warmUp(@NotNull Context context, boolean ignoreBackup, @Nullable StorageSecure storage2, boolean sync) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f34984a) {
            return;
        }
        if (storage2 == null) {
            storage2 = new SecureBiometricsStorage(context, null, ignoreBackup, sync, 2, null);
        }
        setStorage(storage2);
        f34984a = true;
    }
}
