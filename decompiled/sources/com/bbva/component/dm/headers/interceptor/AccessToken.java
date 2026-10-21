package com.bbva.component.dm.headers.interceptor;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.utils.c;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AccessToken.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0002 !B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B-\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0016H\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\""}, d2 = {"Lcom/bbva/component/dm/headers/interceptor/AccessToken;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "token", "", "type", DynamicLink.Builder.KEY_DOMAIN, "id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getId", "getToken", "getType", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "flags", "Companion", UUIDPreferences.TYPE_KEY, "component-ic-token_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AccessToken implements Parcelable {

    @NotNull
    public static final String TYPE_JWT = "jwt";

    @NotNull
    public static final String TYPE_TSEC = "tsec";

    @Nullable
    private final String domain;

    @Nullable
    private final String id;

    @Nullable
    private final String token;

    @Nullable
    private final String type;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<AccessToken> CREATOR = new Parcelable.Creator<AccessToken>() { // from class: com.bbva.component.dm.headers.interceptor.AccessToken$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public AccessToken createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccessToken(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public AccessToken[] newArray(int size) {
            return new AccessToken[size];
        }
    };

    /* JADX INFO: compiled from: AccessToken.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/bbva/component/dm/headers/interceptor/AccessToken$Type;", "", "component-ic-token_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Type {
    }

    public AccessToken(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.token = str;
        this.type = str2;
        this.domain = str3;
        this.id = str4;
    }

    public static /* synthetic */ AccessToken copy$default(AccessToken accessToken, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = accessToken.token;
        }
        if ((i10 & 2) != 0) {
            str2 = accessToken.type;
        }
        if ((i10 & 4) != 0) {
            str3 = accessToken.domain;
        }
        if ((i10 & 8) != 0) {
            str4 = accessToken.id;
        }
        return accessToken.copy(str, str2, str3, str4);
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

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final AccessToken copy(@Nullable String token, @Nullable String type, @Nullable String domain, @Nullable String id) {
        return new AccessToken(token, type, domain, id);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) other;
        return Intrinsics.areEqual(this.token, accessToken.token) && Intrinsics.areEqual(this.type, accessToken.type) && Intrinsics.areEqual(this.domain, accessToken.domain) && Intrinsics.areEqual(this.id, accessToken.id);
    }

    @Nullable
    public final String getDomain() {
        return this.domain;
    }

    @Nullable
    public final String getId() {
        return this.id;
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
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.id;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.token;
        String str2 = this.type;
        return c.b(androidx.constraintlayout.core.parser.a.c("AccessToken(token=", str, ", type=", str2, ", domain="), this.domain, ", id=", this.id, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.token);
        parcel.writeString(this.type);
        parcel.writeString(this.domain);
        parcel.writeString(this.id);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccessToken(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
