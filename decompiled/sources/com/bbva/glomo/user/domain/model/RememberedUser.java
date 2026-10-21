package com.bbva.glomo.user.domain.model;

import ad.d;
import androidx.autofill.HintConstants;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.a;
import com.bbva.component.dm.customer.data.repository.response.customer.CustomerLoginsParser;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RememberedUser.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010'J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003JK\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u000e\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001a¨\u0006("}, d2 = {"Lcom/bbva/glomo/user/domain/model/RememberedUser;", "", "", "getFullName", "component1", "component2", "component3", "", "component4", "component5", "component6", HintConstants.AUTOFILL_HINT_USERNAME, "document", CustomerLoginsParser.LAST_NAME, LocalStorageConstantsKt.IS_BUSINESS_USER_KEY, CustomerIdInterceptor.FAKE_CUSTOMER_ID, "avatarUrl", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", "b", "getDocument", "c", "getLastName", "d", "Z", "()Z", "e", "getCustomerId", "f", "getAvatarUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class RememberedUser {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String username;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String document;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String lastName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean isBusinessUser;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String customerId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String avatarUrl;

    public RememberedUser(@NotNull String username, @NotNull String document, @Nullable String str, boolean z10, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(document, "document");
        this.username = username;
        this.document = document;
        this.lastName = str;
        this.isBusinessUser = z10;
        this.customerId = str2;
        this.avatarUrl = str3;
    }

    public static /* synthetic */ RememberedUser copy$default(RememberedUser rememberedUser, String str, String str2, String str3, boolean z10, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rememberedUser.username;
        }
        if ((i10 & 2) != 0) {
            str2 = rememberedUser.document;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = rememberedUser.lastName;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            z10 = rememberedUser.isBusinessUser;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            str4 = rememberedUser.customerId;
        }
        String str8 = str4;
        if ((i10 & 32) != 0) {
            str5 = rememberedUser.avatarUrl;
        }
        return rememberedUser.copy(str, str6, str7, z11, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDocument() {
        return this.document;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsBusinessUser() {
        return this.isBusinessUser;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    public final RememberedUser copy(@NotNull String username, @NotNull String document, @Nullable String lastName, boolean isBusinessUser, @Nullable String customerId, @Nullable String avatarUrl) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(document, "document");
        return new RememberedUser(username, document, lastName, isBusinessUser, customerId, avatarUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RememberedUser)) {
            return false;
        }
        RememberedUser rememberedUser = (RememberedUser) other;
        return Intrinsics.areEqual(this.username, rememberedUser.username) && Intrinsics.areEqual(this.document, rememberedUser.document) && Intrinsics.areEqual(this.lastName, rememberedUser.lastName) && this.isBusinessUser == rememberedUser.isBusinessUser && Intrinsics.areEqual(this.customerId, rememberedUser.customerId) && Intrinsics.areEqual(this.avatarUrl, rememberedUser.avatarUrl);
    }

    @Nullable
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @NotNull
    public final String getDocument() {
        return this.document;
    }

    @NotNull
    public final String getFullName() {
        String strB;
        String str = this.username;
        String str2 = this.lastName;
        return (str2 == null || (strB = a.b(str, " ", str2)) == null) ? str : strB;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public int hashCode() {
        int iC = n1.c(this.document, this.username.hashCode() * 31, 31);
        String str = this.lastName;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        boolean z10 = this.isBusinessUser;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int i10 = (iHashCode + r3) * 31;
        String str2 = this.customerId;
        int iHashCode2 = (i10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatarUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isBusinessUser() {
        return this.isBusinessUser;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RememberedUser(username=");
        sb2.append(this.username);
        sb2.append(", document=");
        sb2.append(this.document);
        sb2.append(", lastName=");
        sb2.append(this.lastName);
        sb2.append(", isBusinessUser=");
        sb2.append(this.isBusinessUser);
        sb2.append(", customerId=");
        sb2.append(this.customerId);
        sb2.append(", avatarUrl=");
        return d.f(sb2, this.avatarUrl, ")");
    }

    public /* synthetic */ RememberedUser(String str, String str2, String str3, boolean z10, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5);
    }
}
