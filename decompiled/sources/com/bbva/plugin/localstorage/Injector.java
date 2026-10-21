package com.bbva.plugin.localstorage;

import com.bbva.plugin.localstorage.serializer.JsonSerializer;
import com.bbva.plugin.localstorage.serializer.Serializer;
import com.bbva.plugin.localstorage.storage.Storage;
import com.bbva.plugin.localstorage.storage.StorageSecure;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u001aJ\u001f\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u001dJ\u001f\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u001fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006 "}, d2 = {"Lcom/bbva/plugin/localstorage/Injector;", "", "()V", "secureStorage", "Lcom/bbva/plugin/localstorage/storage/StorageSecure;", "getSecureStorage$local_storage_plugin_release", "()Lcom/bbva/plugin/localstorage/storage/StorageSecure;", "setSecureStorage$local_storage_plugin_release", "(Lcom/bbva/plugin/localstorage/storage/StorageSecure;)V", "serializer", "Lcom/bbva/plugin/localstorage/serializer/Serializer;", "getSerializer", "()Lcom/bbva/plugin/localstorage/serializer/Serializer;", "setSerializer", "(Lcom/bbva/plugin/localstorage/serializer/Serializer;)V", "storage", "Lcom/bbva/plugin/localstorage/storage/Storage;", "getStorage$local_storage_plugin_release", "()Lcom/bbva/plugin/localstorage/storage/Storage;", "setStorage$local_storage_plugin_release", "(Lcom/bbva/plugin/localstorage/storage/Storage;)V", "storageVolatile", "getStorageVolatile$local_storage_plugin_release", "setStorageVolatile$local_storage_plugin_release", "warmUp", "", "warmUp$local_storage_plugin_release", "warmUpSecure", "storageSecure", "warmUpSecure$local_storage_plugin_release", "warmUpVolatile", "warmUpVolatile$local_storage_plugin_release", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();
    public static StorageSecure secureStorage;
    public static Serializer serializer;
    public static Storage storage;
    public static Storage storageVolatile;

    public static /* synthetic */ void warmUp$local_storage_plugin_release$default(Injector injector, Storage storage2, Serializer serializer2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            serializer2 = new JsonSerializer();
        }
        injector.warmUp$local_storage_plugin_release(storage2, serializer2);
    }

    public static /* synthetic */ void warmUpSecure$local_storage_plugin_release$default(Injector injector, StorageSecure storageSecure, Serializer serializer2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            serializer2 = new JsonSerializer();
        }
        injector.warmUpSecure$local_storage_plugin_release(storageSecure, serializer2);
    }

    public static /* synthetic */ void warmUpVolatile$local_storage_plugin_release$default(Injector injector, Storage storage2, Serializer serializer2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            serializer2 = new JsonSerializer();
        }
        injector.warmUpVolatile$local_storage_plugin_release(storage2, serializer2);
    }

    @NotNull
    public final StorageSecure getSecureStorage$local_storage_plugin_release() {
        StorageSecure storageSecure = secureStorage;
        if (storageSecure != null) {
            return storageSecure;
        }
        Intrinsics.throwUninitializedPropertyAccessException("secureStorage");
        return null;
    }

    @NotNull
    public final Serializer getSerializer() {
        Serializer serializer2 = serializer;
        if (serializer2 != null) {
            return serializer2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("serializer");
        return null;
    }

    @NotNull
    public final Storage getStorage$local_storage_plugin_release() {
        Storage storage2 = storage;
        if (storage2 != null) {
            return storage2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("storage");
        return null;
    }

    @NotNull
    public final Storage getStorageVolatile$local_storage_plugin_release() {
        Storage storage2 = storageVolatile;
        if (storage2 != null) {
            return storage2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("storageVolatile");
        return null;
    }

    public final void setSecureStorage$local_storage_plugin_release(@NotNull StorageSecure storageSecure) {
        Intrinsics.checkNotNullParameter(storageSecure, "<set-?>");
        secureStorage = storageSecure;
    }

    public final void setSerializer(@NotNull Serializer serializer2) {
        Intrinsics.checkNotNullParameter(serializer2, "<set-?>");
        serializer = serializer2;
    }

    public final void setStorage$local_storage_plugin_release(@NotNull Storage storage2) {
        Intrinsics.checkNotNullParameter(storage2, "<set-?>");
        storage = storage2;
    }

    public final void setStorageVolatile$local_storage_plugin_release(@NotNull Storage storage2) {
        Intrinsics.checkNotNullParameter(storage2, "<set-?>");
        storageVolatile = storage2;
    }

    public final void warmUp$local_storage_plugin_release(@NotNull Storage storage2, @NotNull Serializer serializer2) {
        Intrinsics.checkNotNullParameter(storage2, "storage");
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        setStorage$local_storage_plugin_release(storage2);
        setSerializer(serializer2);
    }

    public final void warmUpSecure$local_storage_plugin_release(@NotNull StorageSecure storageSecure, @NotNull Serializer serializer2) {
        Intrinsics.checkNotNullParameter(storageSecure, "storageSecure");
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        setSecureStorage$local_storage_plugin_release(storageSecure);
        setSerializer(serializer2);
    }

    public final void warmUpVolatile$local_storage_plugin_release(@NotNull Storage storage2, @NotNull Serializer serializer2) {
        Intrinsics.checkNotNullParameter(storage2, "storage");
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        setStorageVolatile$local_storage_plugin_release(storage2);
        setSerializer(serializer2);
    }
}
