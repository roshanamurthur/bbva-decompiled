package com.bbva.glomo.user.domain.usecase;

import androidx.autofill.HintConstants;
import com.bbva.component.dm.customer.data.repository.response.customer.CustomerLoginsParser;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomoutils.usecase.UseCaseParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StoreRememberedDataFromCustomerUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0018"}, d2 = {"Lcom/bbva/glomo/user/domain/usecase/RememberedUserData;", "Lcom/bbva/glomoutils/usecase/UseCaseParams;", "", "a", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", HintConstants.AUTOFILL_HINT_USERNAME, "b", "getLastName", CustomerLoginsParser.LAST_NAME, "", "c", "Z", LocalStorageConstantsKt.IS_BUSINESS_USER_KEY, "()Z", "d", "getCustomerId", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "e", "getAvatarUrl", "avatarUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class RememberedUserData implements UseCaseParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String username;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String lastName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean isBusinessUser;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String customerId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String avatarUrl;

    public RememberedUserData(@NotNull String username, @Nullable String str, boolean z10, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(username, "username");
        this.username = username;
        this.lastName = str;
        this.isBusinessUser = z10;
        this.customerId = str2;
        this.avatarUrl = str3;
    }

    @Nullable
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: isBusinessUser, reason: from getter */
    public final boolean getIsBusinessUser() {
        return this.isBusinessUser;
    }
}
