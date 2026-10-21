package com.bbva.localstorage.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.camera.camera2.internal.compat.u;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider;
import com.bbva.localstorage.backup.NoBackupProperties;
import com.bbva.localstorage.extension.ExceptionKt;
import com.bbva.localstorage.logger.LoggerKt;
import com.bbva.nativesettings.common.Constants;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EncryptedSharedPreferencesStorage.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 (2\u00020\u0001:\u0001(B-\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0006\u0012\b\b\u0002\u0010%\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J&\u0010\t\u001a\u00020\u00062\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J)\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0019\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020\u0006H\u0016J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006)"}, d2 = {"Lcom/bbva/localstorage/storage/EncryptedSharedPreferencesStorage;", "Lcom/bbva/localstorage/storage/Storage;", "", "key", "", "value", "", "encrypt", "", SetCommand.ID, "", "", "", "entries", "default", "decrypt", "getInt", "(Ljava/lang/String;IZ)Ljava/lang/Integer;", "getBoolean", "(Ljava/lang/String;ZZ)Ljava/lang/Boolean;", "getLong", "(Ljava/lang/String;JZ)Ljava/lang/Long;", "getFloat", "(Ljava/lang/String;FZ)Ljava/lang/Float;", "getString", RemoveCommand.ID, "", "keys", "", Constants.SYNC, ClearCommand.ID, "isEmpty", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "Landroid/content/Context;", "context", "fileName", "ignoreBackup", "syncChanges", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZZ)V", "Companion", "local-storage_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEncryptedSharedPreferencesStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EncryptedSharedPreferencesStorage.kt\ncom/bbva/localstorage/storage/EncryptedSharedPreferencesStorage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SharedPreferences.kt\ncom/bbva/localstorage/extension/SharedPreferencesKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n1#2:266\n14#3,7:267\n14#3,7:274\n14#3,7:281\n14#3,7:288\n14#3,7:295\n14#3,7:302\n14#3,2:309\n16#3,5:313\n14#3,7:318\n14#3,2:325\n16#3,5:329\n14#3,7:334\n215#4,2:311\n1855#5,2:327\n*S KotlinDebug\n*F\n+ 1 EncryptedSharedPreferencesStorage.kt\ncom/bbva/localstorage/storage/EncryptedSharedPreferencesStorage\n*L\n78#1:267,7\n92#1:274,7\n102#1:281,7\n112#1:288,7\n122#1:295,7\n132#1:302,7\n142#1:309,2\n142#1:313,5\n193#1:318,7\n202#1:325,2\n202#1:329,5\n218#1:334,7\n143#1:311,2\n203#1:327,2\n*E\n"})
public final class EncryptedSharedPreferencesStorage implements Storage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f35010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final NoBackupProperties f35011d;

    public EncryptedSharedPreferencesStorage(@NotNull Context context, @NotNull String fileName, boolean z10, boolean z11) throws Exception {
        SharedPreferences sharedPreferencesA;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.f35008a = z10;
        this.f35009b = z11;
        this.f35011d = new NoBackupProperties(context, fileName);
        LoggerKt.log("Init encrypted shared preferences storage");
        try {
            sharedPreferencesA = a(context, fileName);
        } catch (Exception e5) {
            if (!ExceptionKt.canRecover(e5)) {
                throw e5;
            }
            KeyStore keyStore = KeyStore.getInstance(KeyStoreProvider.ANDROID_KEYSTORE);
            keyStore.load(null);
            keyStore.deleteEntry(MasterKey.DEFAULT_MASTER_KEY_ALIAS);
            if (Build.VERSION.SDK_INT >= 24) {
                context.deleteSharedPreferences(fileName);
            } else {
                SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(fileName, MODE_PRIVATE)");
                SharedPreferences.Editor editor = sharedPreferences.edit();
                Intrinsics.checkNotNullExpressionValue(editor, "editor");
                editor.clear();
                if (this.f35009b) {
                    editor.commit();
                } else {
                    editor.apply();
                }
                new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), u.f(fileName, ".xml")).delete();
            }
            sharedPreferencesA = a(context, fileName);
        }
        this.f35010c = sharedPreferencesA;
    }

    public static SharedPreferences a(Context context, String str) throws GeneralSecurityException, IOException {
        MasterKey masterKeyBuild = new MasterKey.Builder(context).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build();
        Intrinsics.checkNotNullExpressionValue(masterKeyBuild, "Builder(context)\n       …GCM)\n            .build()");
        SharedPreferences sharedPreferencesCreate = EncryptedSharedPreferences.create(context, str, masterKeyBuild, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        Intrinsics.checkNotNullExpressionValue(sharedPreferencesCreate, "create(\n            cont…heme.AES256_GCM\n        )");
        return sharedPreferencesCreate;
    }

    public final void b() {
        if (this.f35008a) {
            NoBackupProperties noBackupProperties = this.f35011d;
            if (noBackupProperties.isEmpty() && !isEmpty()) {
                Storage.DefaultImpls.clear$default(this, false, 1, null);
                noBackupProperties.reset();
            } else if (isEmpty()) {
                noBackupProperties.reset();
            }
        }
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void clear(boolean sync) {
        SharedPreferences sharedPreferences = this.f35010c;
        if (sharedPreferences == null) {
            throw new IllegalArgumentException(SecureBiometricsStorage.REQUIRE_PREFS_INIT.toString());
        }
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferences");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.clear();
        if (sync) {
            editor.commit();
        } else {
            editor.apply();
        }
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPreferences = this.f35010c;
        if (sharedPreferences == null) {
            throw new IllegalArgumentException(SecureBiometricsStorage.REQUIRE_PREFS_INIT.toString());
        }
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferences");
            sharedPreferences = null;
        }
        return sharedPreferences.contains(key);
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public Boolean getBoolean(@NotNull String key, boolean z10, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f35010c == null) {
            throw new IllegalArgumentException(SecureBiometricsStorage.REQUIRE_PREFS_INIT.toString());
        }
        b();
        SharedPreferences sharedPreferences = this.f35010c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferences");
            sharedPreferences = null;
        }
        return Boolean.valueOf(sharedPreferences.getBoolean(key, z10));
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public Float getFloat(@NotNull String key, float f6, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f35010c == null) {
            throw new IllegalArgumentException(SecureBiometricsStorage.REQUIRE_PREFS_INIT.toString());
        }
        b();
        SharedPreferences sharedPreferences = this.f35010c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferences");
            sharedPreferences = null;
        }
        return Float.valueOf(sharedPreferences.getFloat(key, f6));
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public Integer getInt(@NotNull String key, int i10, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f35010c == null) {
            throw new IllegalArgumentException(SecureBiometricsStorage.REQUIRE_PREFS_INIT.toString());
        }
        b();
        SharedPreferences sharedPreferences = this.f35010c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferences");
            sharedPreferences = null;
        }
        return Integer.valueOf(sharedPreferences.getInt(key, i10));
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public Long getLong(@NotNull String key, long j10, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f35010c == null) {
            throw new IllegalArgumentException(SecureBiometricsStorage.REQUIRE_PREFS_INIT.toString());
        }
        b();
        SharedPreferences sharedPreferences = this.f35010c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferences");
            sharedPreferences = null;
        }
        return Long.valueOf(sharedPreferences.getLong(key, j10));
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public String getString(@NotNull String key, @Nullable String str, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f35010c == null) {
            throw new IllegalArgumentException(SecureBiometricsStorage.REQUIRE_PREFS_INIT.toString());
        }
        b();
        SharedPreferences sharedPreferences = this.f35010c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferences");
            sharedPreferences = null;
        }
        return sharedPreferences.getString(key, str);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean isEmpty() {
        SharedPreferences sharedPreferences = this.f35010c;
        if (sharedPreferences == null) {
            throw new IllegalArgumentException(SecureBiometricsStorage.REQUIRE_PREFS_INIT.toString());
        }
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferences");
            sharedPreferences = null;
        }
        return sharedPreferences.getAll().isEmpty();
    }

    @Override // com.bbva.localstorage.storage.Storage
    @NotNull
    public Set<String> keys() {
        SharedPreferences sharedPreferences = this.f35010c;
        if (sharedPreferences == null) {
            throw new IllegalArgumentException(SecureBiometricsStorage.REQUIRE_PREFS_INIT.toString());
        }
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferences");
            sharedPreferences = null;
        }
        return sharedPreferences.getAll().keySet();
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPreferences = this.f35010c;
        if (sharedPreferences == null) {
            throw new IllegalArgumentException(SecureBiometricsStorage.REQUIRE_PREFS_INIT.toString());
        }
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferences");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.remove(key);
        if (this.f35009b) {
            editor.commit();
        } else {
            editor.apply();
        }
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, int value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f35010c == null) {
            throw new IllegalArgumentException(SecureBiometricsStorage.REQUIRE_PREFS_INIT.toString());
        }
        b();
        SharedPreferences sharedPreferences = this.f35010c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferences");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putInt(key, value);
        if (this.f35009b) {
            editor.commit();
        } else {
            editor.apply();
        }
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean remove(@NotNull List<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        SharedPreferences sharedPreferences = this.f35010c;
        if (sharedPreferences != null) {
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preferences");
                sharedPreferences = null;
            }
            SharedPreferences.Editor editor = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            Iterator<T> it = keys.iterator();
            while (it.hasNext()) {
                editor.remove((String) it.next());
            }
            if (this.f35009b) {
                return editor.commit();
            }
            editor.apply();
            return true;
        }
        throw new IllegalArgumentException(SecureBiometricsStorage.REQUIRE_PREFS_INIT.toString());
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, boolean value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f35010c != null) {
            b();
            SharedPreferences sharedPreferences = this.f35010c;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preferences");
                sharedPreferences = null;
            }
            SharedPreferences.Editor editor = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.putBoolean(key, value);
            if (this.f35009b) {
                editor.commit();
                return;
            } else {
                editor.apply();
                return;
            }
        }
        throw new IllegalArgumentException(SecureBiometricsStorage.REQUIRE_PREFS_INIT.toString());
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, long value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f35010c != null) {
            b();
            SharedPreferences sharedPreferences = this.f35010c;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preferences");
                sharedPreferences = null;
            }
            SharedPreferences.Editor editor = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.putLong(key, value);
            if (this.f35009b) {
                editor.commit();
                return;
            } else {
                editor.apply();
                return;
            }
        }
        throw new IllegalArgumentException(SecureBiometricsStorage.REQUIRE_PREFS_INIT.toString());
    }

    public /* synthetic */ EncryptedSharedPreferencesStorage(Context context, String str, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? "local.storage.irl" : str, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, float value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f35010c != null) {
            b();
            SharedPreferences sharedPreferences = this.f35010c;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preferences");
                sharedPreferences = null;
            }
            SharedPreferences.Editor editor = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.putFloat(key, value);
            if (this.f35009b) {
                editor.commit();
                return;
            } else {
                editor.apply();
                return;
            }
        }
        throw new IllegalArgumentException(SecureBiometricsStorage.REQUIRE_PREFS_INIT.toString());
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, @Nullable String value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f35010c != null) {
            b();
            SharedPreferences sharedPreferences = this.f35010c;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preferences");
                sharedPreferences = null;
            }
            SharedPreferences.Editor editor = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.putString(key, value);
            if (this.f35009b) {
                editor.commit();
                return;
            } else {
                editor.apply();
                return;
            }
        }
        throw new IllegalArgumentException(SecureBiometricsStorage.REQUIRE_PREFS_INIT.toString());
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean set(@NotNull Map<String, String> entries, boolean encrypt) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        if (this.f35010c != null) {
            b();
            SharedPreferences sharedPreferences = this.f35010c;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preferences");
                sharedPreferences = null;
            }
            SharedPreferences.Editor editor = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            for (Map.Entry<String, String> entry : entries.entrySet()) {
                editor.putString(entry.getKey(), entry.getValue());
            }
            if (this.f35009b) {
                return editor.commit();
            }
            editor.apply();
            return true;
        }
        throw new IllegalArgumentException(SecureBiometricsStorage.REQUIRE_PREFS_INIT.toString());
    }
}
