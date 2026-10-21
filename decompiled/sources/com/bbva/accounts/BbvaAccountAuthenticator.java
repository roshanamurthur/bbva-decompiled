package com.bbva.accounts;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BbvaAccountAuthenticator.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016JI\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016J2\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016J2\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016J7\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u001c"}, d2 = {"Lcom/bbva/accounts/BbvaAccountAuthenticator;", "Landroid/accounts/AbstractAccountAuthenticator;", "Landroid/accounts/AccountAuthenticatorResponse;", DigipassManagerConstants.KEY_RESPONSE, "", "accountType", "Landroid/os/Bundle;", "editProperties", "authTokenType", "", "requiredFeatures", "options", "addAccount", "(Landroid/accounts/AccountAuthenticatorResponse;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", "Landroid/accounts/Account;", "account", "confirmCredentials", "getAuthToken", "getAuthTokenLabel", "updateCredentials", "features", "hasFeatures", "(Landroid/accounts/AccountAuthenticatorResponse;Landroid/accounts/Account;[Ljava/lang/String;)Landroid/os/Bundle;", "getAccountRemovalAllowed", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "accounts_release"}, k = 1, mv = {1, 8, 0})
public final class BbvaAccountAuthenticator extends AbstractAccountAuthenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f26424a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BbvaAccountAuthenticator(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26424a = context;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    @NotNull
    public Bundle addAccount(@Nullable AccountAuthenticatorResponse response, @Nullable String accountType, @Nullable String authTokenType, @Nullable String[] requiredFeatures, @Nullable Bundle options) {
        Intent launchIntentForPackage;
        Context context = this.f26424a;
        List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(128);
        Intrinsics.checkNotNullExpressionValue(installedApplications, "context.packageManager.g…ageManager.GET_META_DATA)");
        String string = context.getString(R.string.bbva_package_name_prefix);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…bbva_package_name_prefix)");
        Iterator<ApplicationInfo> it = installedApplications.iterator();
        while (true) {
            launchIntentForPackage = null;
            if (!it.hasNext()) {
                break;
            }
            ApplicationInfo next = it.next();
            String str = next.packageName;
            Intrinsics.checkNotNullExpressionValue(str, "packageInfo.packageName");
            if (l.startsWith$default(str, string, false, 2, null)) {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(next.packageName);
                break;
            }
        }
        Bundle bundle = new Bundle();
        if (launchIntentForPackage != null) {
            bundle.putParcelable("intent", launchIntentForPackage);
        } else {
            bundle.putInt("errorCode", -1);
        }
        return bundle;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    @Nullable
    public Bundle confirmCredentials(@Nullable AccountAuthenticatorResponse response, @Nullable Account account, @Nullable Bundle options) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    @Nullable
    public Bundle editProperties(@Nullable AccountAuthenticatorResponse response, @Nullable String accountType) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    @NotNull
    public Bundle getAccountRemovalAllowed(@Nullable AccountAuthenticatorResponse response, @Nullable Account account) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("booleanResult", false);
        return bundle;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    @Nullable
    public Bundle getAuthToken(@Nullable AccountAuthenticatorResponse response, @Nullable Account account, @Nullable String authTokenType, @Nullable Bundle options) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    @Nullable
    public String getAuthTokenLabel(@Nullable String authTokenType) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    @Nullable
    public Bundle hasFeatures(@Nullable AccountAuthenticatorResponse response, @Nullable Account account, @Nullable String[] features) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    @Nullable
    public Bundle updateCredentials(@Nullable AccountAuthenticatorResponse response, @Nullable Account account, @Nullable String authTokenType, @Nullable Bundle options) {
        return null;
    }
}
