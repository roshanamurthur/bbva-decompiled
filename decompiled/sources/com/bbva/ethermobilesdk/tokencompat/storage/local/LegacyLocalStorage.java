package com.bbva.ethermobilesdk.tokencompat.storage.local;

import android.content.Context;
import com.bbva.ethermobilesdk.tokencompat.storage.LegacyStorage;
import ek.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LegacyLocalStorage.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/storage/local/LegacyLocalStorage;", "Lcom/bbva/ethermobilesdk/tokencompat/storage/LegacyStorage;", "", "key", "value", "", "add", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "reset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/tokencompat/storage/local/UUIDPreferences;", "a", "Lcom/bbva/ethermobilesdk/tokencompat/storage/local/UUIDPreferences;", "getUuidPreferences", "()Lcom/bbva/ethermobilesdk/tokencompat/storage/local/UUIDPreferences;", "uuidPreferences", "Lcom/bbva/ethermobilesdk/tokencompat/storage/local/SharedPrefsStorage;", "b", "Lcom/bbva/ethermobilesdk/tokencompat/storage/local/SharedPrefsStorage;", "getSharedPrefsStorage", "()Lcom/bbva/ethermobilesdk/tokencompat/storage/local/SharedPrefsStorage;", "sharedPrefsStorage", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public final class LegacyLocalStorage implements LegacyStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UUIDPreferences uuidPreferences;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SharedPrefsStorage sharedPrefsStorage;

    public LegacyLocalStorage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.uuidPreferences = new UUIDPreferences(context, null, 2, null);
        this.sharedPrefsStorage = new SharedPrefsStorage(context, null, 2, null);
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.storage.LegacyStorage
    @Nullable
    public Object add(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
        Object objAdd = this.sharedPrefsStorage.add(str, str2, continuation);
        return objAdd == a.getCOROUTINE_SUSPENDED() ? objAdd : Unit.INSTANCE;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.storage.LegacyStorage
    @Nullable
    public Object delete(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objDelete = this.sharedPrefsStorage.delete(str, continuation);
        return objDelete == a.getCOROUTINE_SUSPENDED() ? objDelete : Unit.INSTANCE;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.storage.LegacyStorage
    @Nullable
    public Object get(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return this.sharedPrefsStorage.get(str, continuation);
    }

    @NotNull
    public final SharedPrefsStorage getSharedPrefsStorage() {
        return this.sharedPrefsStorage;
    }

    @NotNull
    public final UUIDPreferences getUuidPreferences() {
        return this.uuidPreferences;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.storage.LegacyStorage
    @Nullable
    public Object reset(@NotNull Continuation<? super Unit> continuation) {
        Object objDeleteAll = this.sharedPrefsStorage.deleteAll(continuation);
        return objDeleteAll == a.getCOROUTINE_SUSPENDED() ? objDeleteAll : Unit.INSTANCE;
    }
}
