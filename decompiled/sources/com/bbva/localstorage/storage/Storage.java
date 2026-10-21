package com.bbva.localstorage.storage;

import com.bbva.nativesettings.common.Constants;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Storage.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J)\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H&¢\u0006\u0002\u0010\fJ)\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u000fJ)\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00112\b\b\u0002\u0010\u000b\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0012J)\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00142\b\b\u0002\u0010\u000b\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0015J&\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\u0017\u001a\u00020\u0005H&J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\u001a\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u001bH&J\"\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u0005H&J\"\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u0005H&J\"\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u0005H&J\"\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u0005H&J$\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001e\u001a\u00020\u0005H&J(\u0010\u001c\u001a\u00020\u00052\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0 2\b\b\u0002\u0010\u001e\u001a\u00020\u0005H&¨\u0006!"}, d2 = {"Lcom/bbva/localstorage/storage/Storage;", "", ClearCommand.ID, "", Constants.SYNC, "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "key", "", "getBoolean", "default", "decrypt", "(Ljava/lang/String;ZZ)Ljava/lang/Boolean;", "getFloat", "", "(Ljava/lang/String;FZ)Ljava/lang/Float;", "getInt", "", "(Ljava/lang/String;IZ)Ljava/lang/Integer;", "getLong", "", "(Ljava/lang/String;JZ)Ljava/lang/Long;", "getString", "isEmpty", "keys", "", RemoveCommand.ID, "", SetCommand.ID, "value", "encrypt", "entries", "", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Storage {

    /* JADX INFO: compiled from: Storage.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void clear$default(Storage storage, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clear");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            storage.clear(z10);
        }

        public static /* synthetic */ Boolean getBoolean$default(Storage storage, String str, boolean z10, boolean z11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBoolean");
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return storage.getBoolean(str, z10, z11);
        }

        public static /* synthetic */ Float getFloat$default(Storage storage, String str, float f6, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFloat");
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return storage.getFloat(str, f6, z10);
        }

        public static /* synthetic */ Integer getInt$default(Storage storage, String str, int i10, boolean z10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
            }
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            return storage.getInt(str, i10, z10);
        }

        public static /* synthetic */ Long getLong$default(Storage storage, String str, long j10, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return storage.getLong(str, j10, z10);
        }

        public static /* synthetic */ String getString$default(Storage storage, String str, String str2, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return storage.getString(str, str2, z10);
        }

        public static /* synthetic */ void set$default(Storage storage, String str, int i10, boolean z10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: set");
            }
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            storage.set(str, i10, z10);
        }

        public static /* synthetic */ void set$default(Storage storage, String str, boolean z10, boolean z11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: set");
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            storage.set(str, z10, z11);
        }

        public static /* synthetic */ void set$default(Storage storage, String str, long j10, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: set");
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            storage.set(str, j10, z10);
        }

        public static /* synthetic */ void set$default(Storage storage, String str, float f6, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: set");
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            storage.set(str, f6, z10);
        }

        public static /* synthetic */ void set$default(Storage storage, String str, String str2, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: set");
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            storage.set(str, str2, z10);
        }

        public static /* synthetic */ boolean set$default(Storage storage, Map map, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: set");
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return storage.set(map, z10);
        }
    }

    void clear(boolean sync);

    boolean contains(@NotNull String key);

    @Nullable
    Boolean getBoolean(@NotNull String key, boolean z10, boolean decrypt);

    @Nullable
    Float getFloat(@NotNull String key, float f6, boolean decrypt);

    @Nullable
    Integer getInt(@NotNull String key, int i10, boolean decrypt);

    @Nullable
    Long getLong(@NotNull String key, long j10, boolean decrypt);

    @Nullable
    String getString(@NotNull String key, @Nullable String str, boolean decrypt);

    boolean isEmpty();

    @NotNull
    Set<String> keys();

    void remove(@NotNull String key);

    boolean remove(@NotNull List<String> keys);

    void set(@NotNull String key, float value, boolean encrypt);

    void set(@NotNull String key, int value, boolean encrypt);

    void set(@NotNull String key, long value, boolean encrypt);

    void set(@NotNull String key, @Nullable String value, boolean encrypt);

    void set(@NotNull String key, boolean value, boolean encrypt);

    boolean set(@NotNull Map<String, String> entries, boolean encrypt);
}
