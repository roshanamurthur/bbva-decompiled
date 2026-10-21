package com.bbva.glomo.storage.local;

import bk.x;
import com.bbva.localstorage.storage.Storage;
import com.bbva.nativesettings.common.Constants;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StorageCoordinator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020\u0001\u0012\u0006\u0010\"\u001a\u00020\u0001¢\u0006\u0004\b#\u0010$J)\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0017\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016J \u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J \u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J \u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J \u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J\"\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J&\u0010\u001b\u001a\u00020\u00042\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0004H\u0016¨\u0006%"}, d2 = {"Lcom/bbva/glomo/storage/local/StorageCoordinator;", "Lcom/bbva/localstorage/storage/Storage;", "", "key", "", "default", "decrypt", "getBoolean", "(Ljava/lang/String;ZZ)Ljava/lang/Boolean;", "", "getFloat", "(Ljava/lang/String;FZ)Ljava/lang/Float;", "", "getInt", "(Ljava/lang/String;IZ)Ljava/lang/Integer;", "", "getLong", "(Ljava/lang/String;JZ)Ljava/lang/Long;", "getString", "isEmpty", "", "keys", "", RemoveCommand.ID, "", "value", "encrypt", SetCommand.ID, "", "entries", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, Constants.SYNC, ClearCommand.ID, "oldStorage", "newStorage", "<init>", "(Lcom/bbva/localstorage/storage/Storage;Lcom/bbva/localstorage/storage/Storage;)V", "gl-local-storage_release"}, k = 1, mv = {1, 9, 0})
public final class StorageCoordinator implements Storage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Storage f30770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Storage f30771b;

    public StorageCoordinator(@NotNull Storage oldStorage, @NotNull Storage newStorage) {
        Intrinsics.checkNotNullParameter(oldStorage, "oldStorage");
        Intrinsics.checkNotNullParameter(newStorage, "newStorage");
        this.f30770a = oldStorage;
        this.f30771b = newStorage;
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void clear(boolean sync) {
        this.f30770a.clear(sync);
        this.f30771b.clear(sync);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f30770a.contains(key) || this.f30771b.contains(key);
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public Boolean getBoolean(@NotNull String key, boolean z10, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Storage storage = this.f30771b;
        if (storage.contains(key)) {
            return storage.getBoolean(key, z10, decrypt);
        }
        Boolean bool = this.f30770a.getBoolean(key, z10, decrypt);
        if (bool != null) {
            storage.set(key, bool.booleanValue(), decrypt);
            z10 = bool.booleanValue();
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public Float getFloat(@NotNull String key, float f6, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Storage storage = this.f30771b;
        if (storage.contains(key)) {
            return storage.getFloat(key, f6, decrypt);
        }
        Float f10 = this.f30770a.getFloat(key, f6, decrypt);
        if (f10 != null) {
            storage.set(key, f10.floatValue(), decrypt);
            f6 = f10.floatValue();
        }
        return Float.valueOf(f6);
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public Integer getInt(@NotNull String key, int i10, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Storage storage = this.f30771b;
        if (storage.contains(key)) {
            return storage.getInt(key, i10, decrypt);
        }
        Integer num = this.f30770a.getInt(key, i10, decrypt);
        if (num != null) {
            storage.set(key, num.intValue(), decrypt);
            i10 = num.intValue();
        }
        return Integer.valueOf(i10);
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public Long getLong(@NotNull String key, long j10, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Storage storage = this.f30771b;
        if (storage.contains(key)) {
            return storage.getLong(key, j10, decrypt);
        }
        Long l6 = this.f30770a.getLong(key, j10, decrypt);
        if (l6 != null) {
            storage.set(key, l6.longValue(), decrypt);
            j10 = l6.longValue();
        }
        return Long.valueOf(j10);
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public String getString(@NotNull String key, @Nullable String str, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Storage storage = this.f30771b;
        if (storage.contains(key)) {
            return storage.getString(key, str, decrypt);
        }
        String string = this.f30770a.getString(key, str, decrypt);
        if (string == null) {
            return str;
        }
        storage.set(key, string, decrypt);
        return string;
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean isEmpty() {
        return this.f30771b.isEmpty() && this.f30770a.isEmpty();
    }

    @Override // com.bbva.localstorage.storage.Storage
    @NotNull
    public Set<String> keys() {
        return x.plus((Set) this.f30771b.keys(), (Iterable) this.f30770a.keys());
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f30770a.remove(key);
        this.f30771b.remove(key);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, boolean value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f30771b.set(key, value, encrypt);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, float value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f30771b.set(key, value, encrypt);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean remove(@NotNull List<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        return this.f30770a.remove(keys) && this.f30771b.remove(keys);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, int value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f30771b.set(key, value, encrypt);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, long value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f30771b.set(key, value, encrypt);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, @Nullable String value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f30771b.set(key, value, encrypt);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean set(@NotNull Map<String, String> entries, boolean encrypt) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return this.f30771b.set(entries, encrypt);
    }
}
