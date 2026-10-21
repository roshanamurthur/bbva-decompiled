package com.bbva.ethermobilesdk.tokencompat.storage.local;

import android.content.Context;
import android.content.SharedPreferences;
import bk.v;
import bk.w;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.token.storage.Storage;
import com.bbva.ethermobilesdk.tokencompat.service.RelayedService;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SharedPrefsStorage.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0019\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\tJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/storage/local/SharedPrefsStorage;", "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "", "key", "value", "", "add", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constants.deleteAll, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "", RelayedService.KEY_IDS, "p0", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Companion", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSharedPrefsStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPrefsStorage.kt\ncom/bbva/ethermobilesdk/tokencompat/storage/local/SharedPrefsStorage\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,162:1\n526#2:163\n511#2,2:164\n513#2,4:169\n526#2:175\n511#2,2:176\n513#2,4:181\n1747#3,3:166\n1747#3,3:178\n215#4,2:173\n215#4,2:185\n*S KotlinDebug\n*F\n+ 1 SharedPrefsStorage.kt\ncom/bbva/ethermobilesdk/tokencompat/storage/local/SharedPrefsStorage\n*L\n46#1:163\n46#1:164,2\n46#1:169,4\n70#1:175\n70#1:176,2\n70#1:181,4\n46#1:166,3\n70#1:178,3\n47#1:173,2\n71#1:185,2\n*E\n"})
public final class SharedPrefsStorage implements Storage {

    @NotNull
    public static final String SERIALIZED_TOKEN_KEY = "key";

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f30649q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final byte[] f30650r0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String VERSION_KEY = "v";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final Set<String> f30646s0 = v.setOf(VERSION_KEY);

    @NotNull
    public static final String REPOSITORY_ID_KEY = "repoId";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final Set<String> f30647t0 = w.setOf((Object[]) new String[]{"key", REPOSITORY_ID_KEY});

    /* JADX INFO: compiled from: SharedPrefsStorage.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/storage/local/SharedPrefsStorage$Companion;", "", "()V", "REPOSITORY_ID_KEY", "", "SERIALIZED_TOKEN_KEY", "VERSION_KEY", "listEncryptedKeys", "", "getListEncryptedKeys$ethertoken_compat_release", "()Ljava/util/Set;", "listPlainKeys", "getListPlainKeys$ethertoken_compat_release", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<String> getListEncryptedKeys$ethertoken_compat_release() {
            return SharedPrefsStorage.f30647t0;
        }

        @NotNull
        public final Set<String> getListPlainKeys$ethertoken_compat_release() {
            return SharedPrefsStorage.f30646s0;
        }
    }

    public SharedPrefsStorage(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        SharedPreferences sharedPreferences = context.getSharedPreferences(name, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        this.f30649q0 = sharedPreferences;
        this.f30650r0 = EncodingUtilsKt.base64ToByteArray(SharedPrefsStorageKt.access$deriveFromSecretKey(context, SharedPrefsStorageKt.generateSuperSecretKey(context)));
    }

    public final LinkedHashMap a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, ?> all = this.f30649q0.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "sharedPreferences.all");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            Set<String> set = f30646s0;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (!Intrinsics.areEqual(entry.getKey(), (String) it.next())) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                        break;
                    }
                }
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Object key = entry2.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            byte[] bArr = this.f30650r0;
            String strAccess$decrypt = SharedPrefsStorageKt.access$decrypt((String) key, bArr);
            Object value = entry2.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put(strAccess$decrypt, SharedPrefsStorageKt.access$decrypt((String) value, bArr));
        }
        return linkedHashMap;
    }

    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object add(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
        SharedPreferences.Editor editorEdit = this.f30649q0.edit();
        byte[] bArr = this.f30650r0;
        editorEdit.putString(SharedPrefsStorageKt.access$encrypt(str, bArr), SharedPrefsStorageKt.access$encrypt(str2, bArr)).apply();
        return Unit.INSTANCE;
    }

    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object delete(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        SharedPreferences sharedPreferences = this.f30649q0;
        Map<String, ?> all = sharedPreferences.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "sharedPreferences.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            Set<String> set = f30646s0;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (!Intrinsics.areEqual(entry.getKey(), (String) it.next())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                        break;
                    }
                }
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!Intrinsics.areEqual(str, entry2.getKey())) {
                Object key = entry2.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "it.key");
                if (Intrinsics.areEqual(str, SharedPrefsStorageKt.access$decrypt((String) key, this.f30650r0))) {
                }
            }
            sharedPreferences.edit().remove((String) entry2.getKey()).apply();
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object deleteAll(@NotNull Continuation<? super Unit> continuation) {
        this.f30649q0.edit().clear().apply();
        return Unit.INSTANCE;
    }

    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object get(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return a().get(str);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object ids(@NotNull Continuation<? super Set<String>> continuation) {
        return CollectionsKt___CollectionsKt.toMutableSet(CollectionsKt___CollectionsKt.subtract(a().keySet(), f30647t0));
    }

    public /* synthetic */ SharedPrefsStorage(Context context, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? "STORE_PREFS" : str);
    }
}
