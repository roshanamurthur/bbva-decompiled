package com.bbva.localstorage;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import bk.q;
import com.bbva.localstorage.cipher.LocalStorageCipher;
import com.bbva.localstorage.delegate.BooleanDelegate;
import com.bbva.localstorage.delegate.Delegate;
import com.bbva.localstorage.delegate.FloatDelegate;
import com.bbva.localstorage.delegate.IntDelegate;
import com.bbva.localstorage.delegate.LongDelegate;
import com.bbva.localstorage.delegate.StringDelegate;
import com.bbva.localstorage.extension.AnyKt;
import com.bbva.localstorage.logger.LoggerKt;
import com.bbva.localstorage.storage.Cipher;
import com.bbva.localstorage.storage.EncryptedSharedPreferencesStorage;
import com.bbva.localstorage.storage.EncryptedSharedPreferencesWrapperStorage;
import com.bbva.localstorage.storage.SharedPreferencesStorage;
import com.bbva.localstorage.storage.Storage;
import com.bbva.localstorage.storage.VolatileStorage;
import com.bbva.nativesettings.common.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocalStorage.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)Jq\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032W\u0010\u000e\u001aS\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u0005j\u0002`\rJ6\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0001J:\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\nJ\"\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\nJ\u001a\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u001a\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\nR\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$¨\u0006*"}, d2 = {"Lcom/bbva/localstorage/LocalStorage;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "key", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "default", "", "secure", "Lcom/bbva/localstorage/delegate/Delegate;", "Lcom/bbva/localstorage/DelegateCreator;", "creator", "", "addDelegate", "clazz", "get", "Landroid/content/Context;", "context", "Lcom/bbva/localstorage/storage/Cipher;", "cipher", "ignoreBackup", "Lcom/bbva/localstorage/storage/Storage;", "storage", Constants.SYNC, "warmUp", "warmUpEncrypted", "warmUpVolatile", "clearStorage", "reset", "Lcom/bbva/localstorage/storage/Storage;", "getStorage", "()Lcom/bbva/localstorage/storage/Storage;", "setStorage", "(Lcom/bbva/localstorage/storage/Storage;)V", "storageVolatile", "getStorageVolatile", "setStorageVolatile", "<init>", "()V", "local-storage_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLocalStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalStorage.kt\ncom/bbva/localstorage/LocalStorage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
public final class LocalStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f34977a;
    public static Storage storage;
    public static Storage storageVolatile;

    @NotNull
    public static final LocalStorage INSTANCE = new LocalStorage();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Map<KClass<?>, Function3<String, Object, Boolean, Delegate<?>>> f34978b = q.mutableMapOf(TuplesKt.to(Reflection.getOrCreateKotlinClass(String.class), a.f34979p0), TuplesKt.to(Reflection.getOrCreateKotlinClass(Boolean.TYPE), b.f34980p0), TuplesKt.to(Reflection.getOrCreateKotlinClass(Integer.TYPE), c.f34981p0), TuplesKt.to(Reflection.getOrCreateKotlinClass(Float.TYPE), d.f34982p0), TuplesKt.to(Reflection.getOrCreateKotlinClass(Long.TYPE), e.f34983p0));

    /* JADX INFO: compiled from: LocalStorage.kt */
    public static final class a extends Lambda implements Function3<String, Object, Boolean, Delegate<? extends Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34979p0 = new a(3);

        @Override // kotlin.jvm.functions.Function3
        public final Delegate<? extends Object> invoke(String str, Object obj, Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            return new StringDelegate(LocalStorage.INSTANCE.getStorage(), str, (String) obj, zBooleanValue);
        }
    }

    /* JADX INFO: compiled from: LocalStorage.kt */
    public static final class b extends Lambda implements Function3<String, Object, Boolean, Delegate<? extends Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f34980p0 = new b(3);

        @Override // kotlin.jvm.functions.Function3
        public final Delegate<? extends Object> invoke(String str, Object obj, Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            return new BooleanDelegate(LocalStorage.INSTANCE.getStorage(), str, ((Boolean) AnyKt.valueOrDefault(obj, Boolean.FALSE)).booleanValue(), zBooleanValue);
        }
    }

    /* JADX INFO: compiled from: LocalStorage.kt */
    public static final class c extends Lambda implements Function3<String, Object, Boolean, Delegate<? extends Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f34981p0 = new c(3);

        @Override // kotlin.jvm.functions.Function3
        public final Delegate<? extends Object> invoke(String str, Object obj, Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            return new IntDelegate(LocalStorage.INSTANCE.getStorage(), str, ((Number) AnyKt.valueOrDefault(obj, 0)).intValue(), zBooleanValue);
        }
    }

    /* JADX INFO: compiled from: LocalStorage.kt */
    public static final class d extends Lambda implements Function3<String, Object, Boolean, Delegate<? extends Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f34982p0 = new d(3);

        @Override // kotlin.jvm.functions.Function3
        public final Delegate<? extends Object> invoke(String str, Object obj, Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            return new FloatDelegate(LocalStorage.INSTANCE.getStorage(), str, ((Number) AnyKt.valueOrDefault(obj, Float.valueOf(0.0f))).floatValue(), zBooleanValue);
        }
    }

    /* JADX INFO: compiled from: LocalStorage.kt */
    public static final class e extends Lambda implements Function3<String, Object, Boolean, Delegate<? extends Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f34983p0 = new e(3);

        @Override // kotlin.jvm.functions.Function3
        public final Delegate<? extends Object> invoke(String str, Object obj, Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            return new LongDelegate(LocalStorage.INSTANCE.getStorage(), str, ((Number) AnyKt.valueOrDefault(obj, 0L)).longValue(), zBooleanValue);
        }
    }

    public static /* synthetic */ void reset$default(LocalStorage localStorage, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        localStorage.reset(z10, z11);
    }

    public static /* synthetic */ void warmUpEncrypted$default(LocalStorage localStorage, Context context, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        localStorage.warmUpEncrypted(context, z10, z11);
    }

    public static /* synthetic */ void warmUpVolatile$default(LocalStorage localStorage, Context context, Cipher cipher, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cipher = null;
        }
        localStorage.warmUpVolatile(context, cipher);
    }

    public final <T> void addDelegate(@NotNull KClass<?> key, @NotNull Function3<? super String, Object, ? super Boolean, ? extends Delegate<?>> creator) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(creator, "creator");
        f34978b.put(key, creator);
    }

    @PublishedApi
    @Nullable
    public final Delegate<?> get(@NotNull KClass<?> clazz, @Nullable String key, @Nullable Object obj, boolean secure) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Function3<String, Object, Boolean, Delegate<?>> function3 = f34978b.get(clazz);
        if (function3 != null) {
            return function3.invoke(key, obj, Boolean.valueOf(secure));
        }
        return null;
    }

    @NotNull
    public final Storage getStorage() {
        Storage storage2 = storage;
        if (storage2 != null) {
            return storage2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("storage");
        return null;
    }

    @NotNull
    public final Storage getStorageVolatile() {
        Storage storage2 = storageVolatile;
        if (storage2 != null) {
            return storage2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("storageVolatile");
        return null;
    }

    public final void reset(boolean clearStorage, boolean sync) {
        LoggerKt.log("Resetting local storage");
        f34977a = false;
        if (storage != null && clearStorage) {
            LoggerKt.log("Clearing local storage with sync = " + sync);
            getStorage().clear(sync);
        }
        if (storageVolatile == null || !clearStorage) {
            return;
        }
        LoggerKt.log("Clearing local storage volatile with sync = " + sync);
        getStorageVolatile().clear(sync);
    }

    public final void setStorage(@NotNull Storage storage2) {
        Intrinsics.checkNotNullParameter(storage2, "<set-?>");
        storage = storage2;
    }

    public final void setStorageVolatile(@NotNull Storage storage2) {
        Intrinsics.checkNotNullParameter(storage2, "<set-?>");
        storageVolatile = storage2;
    }

    public final void warmUp(@NotNull Context context, @Nullable Cipher cipher, boolean ignoreBackup, @Nullable Storage storage2, boolean sync) {
        Storage encryptedSharedPreferencesWrapperStorage;
        Intrinsics.checkNotNullParameter(context, "context");
        if (storage2 instanceof VolatileStorage) {
            warmUpVolatile(context, cipher);
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (f34977a) {
            return;
        }
        if (storage2 == null) {
            storage2 = new SharedPreferencesStorage(context, null, ignoreBackup, cipher == null ? new LocalStorageCipher(context) : cipher, sync, 2, null);
            if (cipher == null) {
                if (storage2.isEmpty()) {
                    encryptedSharedPreferencesWrapperStorage = new EncryptedSharedPreferencesStorage(context, null, ignoreBackup, sync, 2, null);
                } else if (!storage2.isEmpty()) {
                    encryptedSharedPreferencesWrapperStorage = new EncryptedSharedPreferencesWrapperStorage(context, null, ignoreBackup, storage2, 2, null);
                }
                storage2 = encryptedSharedPreferencesWrapperStorage;
            }
        }
        setStorage(storage2);
        f34977a = true;
    }

    public final void warmUpEncrypted(@NotNull Context context, boolean ignoreBackup, boolean sync) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f34977a) {
            return;
        }
        setStorage(new EncryptedSharedPreferencesStorage(context, null, ignoreBackup, sync, 2, null));
        f34977a = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void warmUpVolatile(@NotNull Context context, @Nullable Cipher cipher) {
        VolatileStorage volatileStorage;
        Intrinsics.checkNotNullParameter(context, "context");
        if (cipher != null) {
            volatileStorage = new VolatileStorage(context, cipher);
        } else {
            volatileStorage = new VolatileStorage(context, null, 2, 0 == true ? 1 : 0);
        }
        setStorageVolatile(volatileStorage);
    }
}
