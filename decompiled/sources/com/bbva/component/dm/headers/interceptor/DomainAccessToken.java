package com.bbva.component.dm.headers.interceptor;

import ad.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.firebase.dynamiclinks.DynamicLink;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DomainAccessToken.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%B'\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010!B\u0019\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010$J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006&"}, d2 = {"Lcom/bbva/component/dm/headers/interceptor/DomainAccessToken;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "describeContents", "", "component1", "component2", "component3", "token", "type", DynamicLink.Builder.KEY_DOMAIN, "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "q0", "getType", "r0", "getDomain", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "Lcom/bbva/component/dm/headers/interceptor/AccessToken;", "accessToken", "(Lcom/bbva/component/dm/headers/interceptor/AccessToken;Ljava/lang/String;)V", "CREATOR", "component-ic-token_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class DomainAccessToken implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String token;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String type;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String domain;

    /* JADX INFO: renamed from: com.bbva.component.dm.headers.interceptor.DomainAccessToken$CREATOR, reason: from kotlin metadata */
    /* JADX INFO: compiled from: DomainAccessToken.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/component/dm/headers/interceptor/DomainAccessToken$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bbva/component/dm/headers/interceptor/DomainAccessToken;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bbva/component/dm/headers/interceptor/DomainAccessToken;", "component-ic-token_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<DomainAccessToken> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public DomainAccessToken createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DomainAccessToken(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public DomainAccessToken[] newArray(int size) {
            return new DomainAccessToken[size];
        }
    }

    public DomainAccessToken(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.token = str;
        this.type = str2;
        this.domain = str3;
    }

    public static /* synthetic */ DomainAccessToken copy$default(DomainAccessToken domainAccessToken, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = domainAccessToken.token;
        }
        if ((i10 & 2) != 0) {
            str2 = domainAccessToken.type;
        }
        if ((i10 & 4) != 0) {
            str3 = domainAccessToken.domain;
        }
        return domainAccessToken.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    public final DomainAccessToken copy(@Nullable String token, @Nullable String type, @Nullable String domain) {
        return new DomainAccessToken(token, type, domain);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DomainAccessToken)) {
            return false;
        }
        DomainAccessToken domainAccessToken = (DomainAccessToken) other;
        return Intrinsics.areEqual(this.token, domainAccessToken.token) && Intrinsics.areEqual(this.type, domainAccessToken.type) && Intrinsics.areEqual(this.domain, domainAccessToken.domain);
    }

    @Nullable
    public final String getDomain() {
        return this.domain;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.token;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.domain;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DomainAccessToken(token=");
        sb2.append(this.token);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", domain=");
        return d.f(sb2, this.domain, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.token);
        parcel.writeString(this.type);
        parcel.writeString(this.domain);
    }

    public /* synthetic */ DomainAccessToken(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DomainAccessToken(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DomainAccessToken(@NotNull AccessToken accessToken, @NotNull String domain) {
        this(accessToken.getToken(), accessToken.getType(), domain);
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(domain, "domain");
    }
}
