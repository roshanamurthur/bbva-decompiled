package com.bbva.accounts;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BbvaAccountManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002J \u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002J \u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\u0015"}, d2 = {"Lcom/bbva/accounts/BbvaAccountManager;", "", "", "name", "Lcom/bbva/accounts/BbvaAccount;", "createAccount", "getDefaultAccount", "key", "value", "", "addDefaultAccountData", "account", "addAccountData", "accountName", "getAccountData", "getDefaultAccountData", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "accounts_release"}, k = 1, mv = {1, 8, 0})
public final class BbvaAccountManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountManager f26425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f26426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Account f26427c;

    public BbvaAccountManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26425a = AccountManager.get(context);
        String string = context.getString(R.string.bbva_account_type);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.bbva_account_type)");
        this.f26426b = string;
    }

    public final void addAccountData(@NotNull BbvaAccount account, @NotNull String key, @Nullable String value) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f26425a.setUserData(new Account(account.getName(), this.f26426b), key, value);
    }

    public final void addDefaultAccountData(@NotNull String key, @Nullable String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Account account = this.f26427c;
        AccountManager accountManager = this.f26425a;
        if (account == null) {
            Account account2 = new Account("BBVA_Account", this.f26426b);
            this.f26427c = account2;
            accountManager.addAccountExplicitly(account2, null, null);
        }
        accountManager.setUserData(this.f26427c, key, value);
    }

    @NotNull
    public final BbvaAccount createAccount(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String str = this.f26426b;
        this.f26425a.addAccountExplicitly(new Account(name, str), null, null);
        return new BbvaAccount(name, str);
    }

    @Nullable
    public final String getAccountData(@NotNull String accountName, @NotNull String key) {
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(key, "key");
        return getAccountData(new BbvaAccount(accountName, this.f26426b), key);
    }

    @NotNull
    public final BbvaAccount getDefaultAccount() {
        return new BbvaAccount("BBVA_Account", this.f26426b);
    }

    @Nullable
    public final String getDefaultAccountData(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Account account = this.f26427c;
        AccountManager accountManager = this.f26425a;
        if (account == null) {
            Account account2 = new Account("BBVA_Account", this.f26426b);
            this.f26427c = account2;
            accountManager.addAccountExplicitly(account2, null, null);
        }
        return accountManager.getUserData(this.f26427c, key);
    }

    @Nullable
    public final String getAccountData(@NotNull BbvaAccount account, @NotNull String key) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f26425a.getUserData(new Account(account.getName(), account.getType()), key);
    }

    public final void addAccountData(@NotNull String accountName, @NotNull String key, @Nullable String value) {
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f26425a.setUserData(new Account(accountName, this.f26426b), key, value);
    }
}
