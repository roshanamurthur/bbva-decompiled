package com.bbva.localstorage.storage;

import android.content.Context;
import com.bbva.localstorage.cipher.LocalStorageCipher;
import com.bbva.localstorage.extension.StringKt;
import com.bbva.localstorage.logger.LoggerKt;
import com.bbva.nativesettings.common.Constants;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.ArrayList;
import java.util.HashMap;
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

/* JADX INFO: compiled from: VolatileStorage.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J&\u0010\t\u001a\u00020\u00062\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J)\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0019\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020\u0006H\u0016J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006'"}, d2 = {"Lcom/bbva/localstorage/storage/VolatileStorage;", "Lcom/bbva/localstorage/storage/Storage;", "", "key", "", "value", "", "encrypt", "", SetCommand.ID, "", "", "", "entries", "default", "decrypt", "getInt", "(Ljava/lang/String;IZ)Ljava/lang/Integer;", "getBoolean", "(Ljava/lang/String;ZZ)Ljava/lang/Boolean;", "getLong", "(Ljava/lang/String;JZ)Ljava/lang/Long;", "getFloat", "(Ljava/lang/String;FZ)Ljava/lang/Float;", "getString", RemoveCommand.ID, "", "keys", "", Constants.SYNC, ClearCommand.ID, "isEmpty", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "Landroid/content/Context;", "context", "Lcom/bbva/localstorage/storage/Cipher;", "cipher", "<init>", "(Landroid/content/Context;Lcom/bbva/localstorage/storage/Cipher;)V", "local-storage_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVolatileStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VolatileStorage.kt\ncom/bbva/localstorage/storage/VolatileStorage\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n215#2,2:121\n1855#3,2:123\n1549#3:125\n1620#3,3:126\n1#4:129\n*S KotlinDebug\n*F\n+ 1 VolatileStorage.kt\ncom/bbva/localstorage/storage/VolatileStorage\n*L\n58#1:121,2\n93#1:123,2\n98#1:125\n98#1:126,3\n*E\n"})
public final class VolatileStorage implements Storage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Cipher f35049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Object> f35050b;

    public VolatileStorage(@NotNull Context context, @NotNull Cipher cipher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        this.f35049a = cipher;
        this.f35050b = new HashMap<>();
        LoggerKt.log("Init volatile storage");
        if (cipher instanceof LocalStorageCipher) {
            LoggerKt.log("No cipher option provided. Using default option when encrypt or decrypt are enabled");
        }
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void clear(boolean sync) {
        this.f35050b.clear();
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String strObfuscate = StringKt.obfuscate(key);
        HashMap<String, Object> map = this.f35050b;
        return map.containsKey(key) || map.containsKey(strObfuscate);
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public Boolean getBoolean(@NotNull String key, boolean z10, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string = getString(key, String.valueOf(z10), decrypt);
        if (string != null) {
            return Boolean.valueOf(Boolean.parseBoolean(string));
        }
        return null;
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public Float getFloat(@NotNull String key, float f6, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string = getString(key, String.valueOf(f6), decrypt);
        if (string != null) {
            return Float.valueOf(Float.parseFloat(string));
        }
        return null;
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public Integer getInt(@NotNull String key, int i10, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string = getString(key, String.valueOf(i10), decrypt);
        if (string != null) {
            return Integer.valueOf(Integer.parseInt(string));
        }
        return null;
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public Long getLong(@NotNull String key, long j10, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string = getString(key, String.valueOf(j10), decrypt);
        if (string != null) {
            return Long.valueOf(Long.parseLong(string));
        }
        return null;
    }

    @Override // com.bbva.localstorage.storage.Storage
    @Nullable
    public String getString(@NotNull String key, @Nullable String str, boolean decrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        HashMap<String, Object> map = this.f35050b;
        if (!decrypt) {
            return (String) map.get(key);
        }
        String strDecrypt = this.f35049a.decrypt((String) map.get(StringKt.obfuscate(key)));
        if (strDecrypt != null) {
            return strDecrypt;
        }
        if (str != null) {
            return str.toString();
        }
        return null;
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean isEmpty() {
        return this.f35050b.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // com.bbva.localstorage.storage.Storage
    @NotNull
    public Set<String> keys() {
        Object objM5535constructorimpl;
        Set<String> setKeySet = this.f35050b.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "volatile\n        .keys");
        Set<String> set = setKeySet;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        Iterator it = set.iterator();
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
        HashMap<String, Object> map = this.f35050b;
        map.remove(key);
        map.remove(strObfuscate);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, int value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        set(key, String.valueOf(value), encrypt);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, boolean value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        set(key, String.valueOf(value), encrypt);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, long value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        set(key, String.valueOf(value), encrypt);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean remove(@NotNull List<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            remove((String) it.next());
        }
        return true;
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, float value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        set(key, String.valueOf(value), encrypt);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public void set(@NotNull String key, @Nullable String value, boolean encrypt) {
        Intrinsics.checkNotNullParameter(key, "key");
        HashMap<String, Object> map = this.f35050b;
        if (encrypt) {
            map.put(StringKt.obfuscate(key), this.f35049a.encrypt(value));
        } else {
            map.put(key, value);
        }
    }

    public /* synthetic */ VolatileStorage(Context context, Cipher cipher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? new LocalStorageCipher(context) : cipher);
    }

    @Override // com.bbva.localstorage.storage.Storage
    public boolean set(@NotNull Map<String, String> entries, boolean encrypt) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        for (Map.Entry<String, String> entry : entries.entrySet()) {
            set(entry.getKey(), entry.getValue(), encrypt);
        }
        return true;
    }
}
