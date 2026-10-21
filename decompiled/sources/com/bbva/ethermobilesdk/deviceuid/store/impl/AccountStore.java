package com.bbva.ethermobilesdk.deviceuid.store.impl;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.bbva.accounts.BbvaAccountManager;
import com.bbva.ethermobilesdk.deviceuid.store.UIDStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AccountStore.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014R$\u0010\r\u001a\u0004\u0018\u00010\u00018\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00028\u0014@VX\u0094\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceuid/store/impl/AccountStore;", "Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;", "", "uid", "", "save", "get", "b", "Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;", "getNextStore", "()Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;", "setNextStore", "(Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;)V", "nextStore", "<set-?>", "c", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "key", "Landroid/content/Context;", "context", "Landroid/accounts/Account;", "customAccount", "<init>", "(Landroid/content/Context;Landroid/accounts/Account;Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;Ljava/lang/String;)V", "deviceuid_release"}, k = 1, mv = {1, 8, 0})
public final class AccountStore extends UIDStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Account f29757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public UIDStore nextStore;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String key;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BbvaAccountManager f29760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final AccountManager f29761e;

    public AccountStore(@NotNull Context context, @Nullable Account account, @Nullable UIDStore uIDStore, @NotNull String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f29757a = account;
        this.nextStore = uIDStore;
        this.key = key;
        this.f29760d = new BbvaAccountManager(context);
        this.f29761e = account == null ? null : AccountManager.get(context);
    }

    @Override // com.bbva.ethermobilesdk.deviceuid.store.UIDStore
    @Nullable
    public String get() {
        String defaultAccountData;
        UIDStore nextStore;
        Account account = this.f29757a;
        if (account != null) {
            AccountManager accountManager = this.f29761e;
            defaultAccountData = accountManager != null ? accountManager.getUserData(account, getKey()) : null;
        } else {
            defaultAccountData = this.f29760d.getDefaultAccountData(getKey());
        }
        UIDStore nextStore2 = getNextStore();
        if ((nextStore2 != null ? nextStore2.getUID() : null) == null && (nextStore = getNextStore()) != null) {
            nextStore.saveUID(defaultAccountData);
        }
        return defaultAccountData;
    }

    @Override // com.bbva.ethermobilesdk.deviceuid.store.UIDStore
    @NotNull
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
        AccountManager accountManager;
        Unit unit = null;
        Account account = this.f29757a;
        if (account != null && (accountManager = this.f29761e) != null) {
            accountManager.setUserData(account, getKey(), uid);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f29760d.addDefaultAccountData(getKey(), uid);
        }
    }

    public void setKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.key = str;
    }

    @Override // com.bbva.ethermobilesdk.deviceuid.store.UIDStore
    public void setNextStore(@Nullable UIDStore uIDStore) {
        this.nextStore = uIDStore;
    }
}
