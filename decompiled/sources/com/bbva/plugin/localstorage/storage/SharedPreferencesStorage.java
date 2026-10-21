package com.bbva.plugin.localstorage.storage;

import com.bbva.nativesettings.common.Constants;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Storage.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0016R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/bbva/plugin/localstorage/storage/SharedPreferencesStorage;", "Lcom/bbva/plugin/localstorage/storage/Storage;", "", "key", "value", "", "encrypt", "", "save", "decrypt", "get", RemoveCommand.ID, Constants.SYNC, ClearCommand.ID, "Lkotlin/Function0;", "Lcom/bbva/localstorage/storage/Storage;", "a", "Lkotlin/jvm/functions/Function0;", "getBlock", "()Lkotlin/jvm/functions/Function0;", "block", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class SharedPreferencesStorage implements Storage {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<com.bbva.localstorage.storage.Storage> block;

    /* JADX WARN: Multi-variable type inference failed */
    public SharedPreferencesStorage(@NotNull Function0<? extends com.bbva.localstorage.storage.Storage> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
    }

    @Override // com.bbva.plugin.localstorage.storage.Storage
    public void clear(boolean sync) {
        this.block.invoke().clear(sync);
    }

    @Override // com.bbva.plugin.localstorage.storage.Storage
    @Nullable
    public String get(@NotNull String key, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.block.invoke().getString(key, null, decrypt);
    }

    @NotNull
    public final Function0<com.bbva.localstorage.storage.Storage> getBlock() {
        return this.block;
    }

    @Override // com.bbva.plugin.localstorage.storage.Storage
    public void remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.block.invoke().remove(key);
    }

    @Override // com.bbva.plugin.localstorage.storage.Storage
    public void save(@NotNull String key, @NotNull String value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.block.invoke().set(key, value, encrypt);
    }
}
