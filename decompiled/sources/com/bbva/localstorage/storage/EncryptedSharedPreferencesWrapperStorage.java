package com.bbva.localstorage.storage;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import bk.x;
import com.bbva.localstorage.logger.LoggerKt;
import com.bbva.nativesettings.common.Constants;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EncryptedSharedPreferencesWrapperStorage.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010+\u001a\u00020\u0002\u0012\b\b\u0002\u0010,\u001a\u00020\u0006\u0012\u0006\u0010-\u001a\u00020\u0001¢\u0006\u0004\b.\u0010/J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J&\u0010\t\u001a\u00020\u00062\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J)\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0019\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020\u0006H\u0016J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R \u0010(\u001a\u00020!8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%¨\u00060"}, d2 = {"Lcom/bbva/localstorage/storage/EncryptedSharedPreferencesWrapperStorage;", "Lcom/bbva/localstorage/storage/Storage;", "", "key", "", "value", "", "encrypt", "", SetCommand.ID, "", "", "", "entries", "default", "decrypt", "getInt", "(Ljava/lang/String;IZ)Ljava/lang/Integer;", "getBoolean", "(Ljava/lang/String;ZZ)Ljava/lang/Boolean;", "getLong", "(Ljava/lang/String;JZ)Ljava/lang/Long;", "getFloat", "(Ljava/lang/String;FZ)Ljava/lang/Float;", "getString", RemoveCommand.ID, "", "keys", "", Constants.SYNC, ClearCommand.ID, "isEmpty", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "Lcom/bbva/localstorage/storage/EncryptedSharedPreferencesStorage;", "b", "Lcom/bbva/localstorage/storage/EncryptedSharedPreferencesStorage;", "getNewStorage$local_storage_release", "()Lcom/bbva/localstorage/storage/EncryptedSharedPreferencesStorage;", "getNewStorage$local_storage_release$annotations", "()V", "newStorage", "Landroid/content/Context;", "context", "filename", "ignoreBackup", "oldStorage", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLcom/bbva/localstorage/storage/Storage;)V", "local-storage_release"}, k = 1, mv = {1, 8, 0})
public final class EncryptedSharedPreferencesWrapperStorage implements Storage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Storage f35012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final EncryptedSharedPreferencesStorage newStorage;

    public EncryptedSharedPreferencesWrapperStorage(@NotNull Context context, @NotNull String filename, boolean z10, @NotNull Storage oldStorage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(oldStorage, "oldStorage");
        this.f35012a = oldStorage;
        this.newStorage = new EncryptedSharedPreferencesStorage(context, filename, z10, false, 8, null);
        LoggerKt.log("Init encrypted shared preferences wrapper storage");
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void clear(boolean sync) {
        this.newStorage.clear(sync);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.newStorage.contains(key) || this.f35012a.contains(key);
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public synchronized Boolean getBoolean(@NotNull String key, boolean z10, boolean decrypt) {
        Boolean boolValueOf;
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            if (this.newStorage.contains(key)) {
                boolValueOf = Storage.DefaultImpls.getBoolean$default(this.newStorage, key, z10, false, 4, null);
            } else {
                Boolean bool = this.f35012a.getBoolean(key, z10, decrypt);
                if (bool != null) {
                    this.newStorage.set(key, bool.booleanValue(), true);
                    this.f35012a.remove(key);
                    z10 = bool.booleanValue();
                }
                boolValueOf = Boolean.valueOf(z10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return boolValueOf;
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public synchronized Float getFloat(@NotNull String key, float f6, boolean decrypt) {
        Float fValueOf;
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            if (this.newStorage.contains(key)) {
                fValueOf = Storage.DefaultImpls.getFloat$default(this.newStorage, key, f6, false, 4, null);
            } else {
                Float f10 = this.f35012a.getFloat(key, f6, decrypt);
                if (f10 != null) {
                    this.newStorage.set(key, f10.floatValue(), true);
                    this.f35012a.remove(key);
                    f6 = f10.floatValue();
                }
                fValueOf = Float.valueOf(f6);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return fValueOf;
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public synchronized Integer getInt(@NotNull String key, int i10, boolean decrypt) {
        Integer numValueOf;
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            if (this.newStorage.contains(key)) {
                numValueOf = Storage.DefaultImpls.getInt$default(this.newStorage, key, i10, false, 4, null);
            } else {
                Integer num = this.f35012a.getInt(key, i10, decrypt);
                if (num != null) {
                    this.newStorage.set(key, num.intValue(), true);
                    this.f35012a.remove(key);
                    i10 = num.intValue();
                }
                numValueOf = Integer.valueOf(i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return numValueOf;
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public synchronized Long getLong(@NotNull String key, long j10, boolean decrypt) {
        Long lValueOf;
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            if (this.newStorage.contains(key)) {
                lValueOf = Storage.DefaultImpls.getLong$default(this.newStorage, key, j10, false, 4, null);
            } else {
                Long l6 = this.f35012a.getLong(key, j10, decrypt);
                if (l6 != null) {
                    this.newStorage.set(key, l6.longValue(), true);
                    this.f35012a.remove(key);
                    j10 = l6.longValue();
                }
                lValueOf = Long.valueOf(j10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return lValueOf;
    }

    @NotNull
    /* JADX INFO: renamed from: getNewStorage$local_storage_release, reason: from getter */
    public final EncryptedSharedPreferencesStorage getNewStorage() {
        return this.newStorage;
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public synchronized String getString(@NotNull String key, @Nullable String str, boolean decrypt) {
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            if (this.newStorage.contains(key)) {
                str = Storage.DefaultImpls.getString$default(this.newStorage, key, str, false, 4, null);
            } else {
                String string = this.f35012a.getString(key, str, decrypt);
                if (string != null) {
                    this.newStorage.set(key, string, true);
                    this.f35012a.remove(key);
                    str = string;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return str;
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean isEmpty() {
        return this.newStorage.isEmpty() && this.f35012a.isEmpty();
    }

    @Override // com.bbva.localstorage.storage.Storage
    @NotNull
    public Set<String> keys() {
        return x.plus((Set) this.newStorage.keys(), (Iterable) this.f35012a.keys());
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f35012a.remove(key);
        this.newStorage.remove(key);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, int value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Storage.DefaultImpls.set$default((Storage) this.newStorage, key, value, false, 4, (Object) null);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, boolean value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Storage.DefaultImpls.set$default((Storage) this.newStorage, key, value, false, 4, (Object) null);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean remove(@NotNull List<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        return this.f35012a.remove(keys) && this.newStorage.remove(keys);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, long value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Storage.DefaultImpls.set$default((Storage) this.newStorage, key, value, false, 4, (Object) null);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, float value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Storage.DefaultImpls.set$default((Storage) this.newStorage, key, value, false, 4, (Object) null);
    }

    public /* synthetic */ EncryptedSharedPreferencesWrapperStorage(Context context, String str, boolean z10, Storage storage, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? "local.storage.irl" : str, (i10 & 4) != 0 ? false : z10, storage);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, @Nullable String value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Storage.DefaultImpls.set$default((Storage) this.newStorage, key, value, false, 4, (Object) null);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean set(@NotNull Map<String, String> entries, boolean encrypt) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return this.newStorage.set(entries, encrypt);
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getNewStorage$local_storage_release$annotations() {
    }
}
