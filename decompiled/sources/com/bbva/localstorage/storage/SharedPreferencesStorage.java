package com.bbva.localstorage.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.bbva.localstorage.backup.NoBackupProperties;
import com.bbva.localstorage.cipher.LocalStorageCipher;
import com.bbva.localstorage.extension.StringKt;
import com.bbva.localstorage.logger.LoggerKt;
import com.bbva.nativesettings.common.Constants;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SharedPreferencesStorage.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0006\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010'\u001a\u00020\u0006¢\u0006\u0004\b(\u0010)J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J&\u0010\t\u001a\u00020\u00062\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J)\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0019\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020\u0006H\u0016J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006*"}, d2 = {"Lcom/bbva/localstorage/storage/SharedPreferencesStorage;", "Lcom/bbva/localstorage/storage/Storage;", "", "key", "", "value", "", "encrypt", "", SetCommand.ID, "", "", "", "entries", "default", "decrypt", "getInt", "(Ljava/lang/String;IZ)Ljava/lang/Integer;", "getBoolean", "(Ljava/lang/String;ZZ)Ljava/lang/Boolean;", "getLong", "(Ljava/lang/String;JZ)Ljava/lang/Long;", "getFloat", "(Ljava/lang/String;FZ)Ljava/lang/Float;", "getString", RemoveCommand.ID, "", "keys", "", Constants.SYNC, ClearCommand.ID, "isEmpty", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "Landroid/content/Context;", "context", "fileName", "ignoreBackup", "Lcom/bbva/localstorage/storage/Cipher;", "cipher", "syncChanges", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLcom/bbva/localstorage/storage/Cipher;Z)V", "local-storage_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSharedPreferencesStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesStorage.kt\ncom/bbva/localstorage/storage/SharedPreferencesStorage\n+ 2 SharedPreferences.kt\ncom/bbva/localstorage/extension/SharedPreferencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,197:1\n14#2,7:198\n14#2,7:205\n14#2,7:212\n14#2,7:219\n14#2,7:230\n14#2,7:238\n1549#3:226\n1620#3,3:227\n1#4:237\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesStorage.kt\ncom/bbva/localstorage/storage/SharedPreferencesStorage\n*L\n56#1:198,7\n63#1:205,7\n116#1:212,7\n123#1:219,7\n137#1:230,7\n157#1:238,7\n133#1:226\n133#1:227,3\n*E\n"})
public final class SharedPreferencesStorage implements Storage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Cipher f35045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f35046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f35047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final NoBackupProperties f35048e;

    public SharedPreferencesStorage(@NotNull Context context, @NotNull String fileName, boolean z10, @NotNull Cipher cipher, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        this.f35044a = z10;
        this.f35045b = cipher;
        this.f35046c = z11;
        SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        this.f35047d = sharedPreferences;
        this.f35048e = new NoBackupProperties(context, fileName);
        LoggerKt.log("Init shared preferences storage");
    }

    public final String a(Object obj, String str, Object obj2) {
        String strDecrypt;
        b();
        SharedPreferences sharedPreferences = this.f35047d;
        if (obj != null) {
            strDecrypt = obj.toString();
            set(str, strDecrypt, true);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.remove(str);
            if (this.f35046c) {
                editor.commit();
            } else {
                editor.apply();
            }
        } else {
            strDecrypt = this.f35045b.decrypt(sharedPreferences.getString(StringKt.obfuscate(str), null));
        }
        if (strDecrypt != null) {
            return strDecrypt;
        }
        if (obj2 != null) {
            return obj2.toString();
        }
        return null;
    }

    public final void b() {
        if (this.f35044a) {
            NoBackupProperties noBackupProperties = this.f35048e;
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
        SharedPreferences.Editor editor = this.f35047d.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.clear();
        if (this.f35046c) {
            editor.commit();
        } else {
            editor.apply();
        }
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String strObfuscate = StringKt.obfuscate(key);
        SharedPreferences sharedPreferences = this.f35047d;
        return sharedPreferences.contains(key) || sharedPreferences.contains(strObfuscate);
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public Boolean getBoolean(@NotNull String key, boolean z10, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        SharedPreferences sharedPreferences = this.f35047d;
        if (sharedPreferences.contains(key)) {
            String strA = a(Boolean.valueOf(sharedPreferences.getBoolean(key, z10)), key, Boolean.valueOf(z10));
            if (strA != null) {
                return Boolean.valueOf(Boolean.parseBoolean(strA));
            }
            return null;
        }
        String strA2 = a(null, key, Boolean.valueOf(z10));
        if (strA2 != null) {
            return Boolean.valueOf(Boolean.parseBoolean(strA2));
        }
        return null;
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public Float getFloat(@NotNull String key, float f6, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        SharedPreferences sharedPreferences = this.f35047d;
        if (sharedPreferences.contains(key)) {
            String strA = a(Float.valueOf(sharedPreferences.getFloat(key, f6)), key, Float.valueOf(f6));
            if (strA != null) {
                return Float.valueOf(Float.parseFloat(strA));
            }
            return null;
        }
        String strA2 = a(null, key, Float.valueOf(f6));
        if (strA2 != null) {
            return Float.valueOf(Float.parseFloat(strA2));
        }
        return null;
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public Integer getInt(@NotNull String key, int i10, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        SharedPreferences sharedPreferences = this.f35047d;
        if (sharedPreferences.contains(key)) {
            String strA = a(Integer.valueOf(sharedPreferences.getInt(key, i10)), key, Integer.valueOf(i10));
            if (strA != null) {
                return Integer.valueOf(Integer.parseInt(strA));
            }
            return null;
        }
        String strA2 = a(null, key, Integer.valueOf(i10));
        if (strA2 != null) {
            return Integer.valueOf(Integer.parseInt(strA2));
        }
        return null;
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public Long getLong(@NotNull String key, long j10, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        SharedPreferences sharedPreferences = this.f35047d;
        if (sharedPreferences.contains(key)) {
            String strA = a(Long.valueOf(sharedPreferences.getLong(key, j10)), key, Long.valueOf(j10));
            if (strA != null) {
                return Long.valueOf(Long.parseLong(strA));
            }
            return null;
        }
        String strA2 = a(null, key, Long.valueOf(j10));
        if (strA2 != null) {
            return Long.valueOf(Long.parseLong(strA2));
        }
        return null;
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public String getString(@NotNull String key, @Nullable String str, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        return a(this.f35047d.getString(key, null), key, str);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean isEmpty() {
        return this.f35047d.getAll().isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // com.bbva.localstorage.storage.Storage
    @NotNull
    public Set<String> keys() {
        Object objM5535constructorimpl;
        Set<String> setKeySet = this.f35047d.getAll().keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            ?? key = (String) it.next();
            Intrinsics.checkNotNullExpressionValue(key, "key");
            try {
                Result.Companion companion = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(StringKt.deobfuscate(key));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            if (!Result.m5540isFailureimpl(objM5535constructorimpl)) {
                key = objM5535constructorimpl;
            }
            arrayList.add((String) key);
        }
        return CollectionsKt___CollectionsKt.toSet(arrayList);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String strObfuscate = StringKt.obfuscate(key);
        SharedPreferences.Editor editor = this.f35047d.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.remove(key);
        editor.remove(strObfuscate);
        if (this.f35046c) {
            editor.commit();
        } else {
            editor.apply();
        }
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, int value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        set(key, String.valueOf(value), true);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, boolean value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        set(key, String.valueOf(value), true);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, long value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        set(key, String.valueOf(value), true);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, float value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        set(key, String.valueOf(value), true);
    }

    public /* synthetic */ SharedPreferencesStorage(Context context, String str, boolean z10, Cipher cipher, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? "local.storage.irl" : str, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? new LocalStorageCipher(context) : cipher, (i10 & 16) != 0 ? false : z11);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean remove(@NotNull List<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        SharedPreferences.Editor editor = this.f35047d.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        for (String str : keys) {
            String strObfuscate = StringKt.obfuscate(str);
            editor.remove(str);
            editor.remove(strObfuscate);
        }
        if (this.f35046c) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, @Nullable String value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        String strObfuscate = StringKt.obfuscate(key);
        String strEncrypt = this.f35045b.encrypt(value);
        SharedPreferences.Editor editor = this.f35047d.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(strObfuscate, strEncrypt);
        if (this.f35046c) {
            editor.commit();
        } else {
            editor.apply();
        }
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean set(@NotNull Map<String, String> entries, boolean encrypt) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        b();
        SharedPreferences.Editor editor = this.f35047d.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        for (Map.Entry<String, String> entry : entries.entrySet()) {
            editor.putString(StringKt.obfuscate(entry.getKey()), this.f35045b.encrypt(entry.getValue()));
        }
        if (this.f35046c) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }
}
