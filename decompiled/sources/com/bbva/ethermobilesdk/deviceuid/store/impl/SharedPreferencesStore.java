package com.bbva.ethermobilesdk.deviceuid.store.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.bbva.ethermobilesdk.deviceuid.store.UIDStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SharedPreferencesStore.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB#\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014R$\u0010\r\u001a\u0004\u0018\u00010\u00018\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0014@VX\u0094\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceuid/store/impl/SharedPreferencesStore;", "Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;", "", "uid", "", "save", "get", "a", "Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;", "getNextStore", "()Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;", "setNextStore", "(Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;)V", "nextStore", "<set-?>", "b", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "key", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;Ljava/lang/String;)V", "Companion", "deviceuid_release"}, k = 1, mv = {1, 8, 0})
public final class SharedPreferencesStore extends UIDStore {

    @NotNull
    public static final String UID = "uid.id";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public UIDStore nextStore;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String key;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f29767c;

    public SharedPreferencesStore(@NotNull Context context, @Nullable UIDStore uIDStore, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.nextStore = uIDStore;
        this.key = str;
        this.f29767c = context.getSharedPreferences(UID, 0);
    }

    @Override // com.bbva.ethermobilesdk.deviceuid.store.UIDStore
    @Nullable
    public String get() {
        return this.f29767c.getString(getKey(), null);
    }

    @Override // com.bbva.ethermobilesdk.deviceuid.store.UIDStore
    @Nullable
    public String getKey() {
        return this.key;
    }

    @Override // com.bbva.ethermobilesdk.deviceuid.store.UIDStore
    @Nullable
    public UIDStore getNextStore() {
        return this.nextStore;
    }

    @Override // com.bbva.ethermobilesdk.deviceuid.store.UIDStore
    public void save(@Nullable String uid) {
        SharedPreferences.Editor editorEdit;
        if (uid == null || (editorEdit = this.f29767c.edit()) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(editorEdit, "edit()");
        editorEdit.putString(getKey(), uid);
        editorEdit.apply();
    }

    public void setKey(@Nullable String str) {
        this.key = str;
    }

    @Override // com.bbva.ethermobilesdk.deviceuid.store.UIDStore
    public void setNextStore(@Nullable UIDStore uIDStore) {
        this.nextStore = uIDStore;
    }
}
