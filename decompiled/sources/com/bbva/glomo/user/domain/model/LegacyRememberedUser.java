package com.bbva.glomo.user.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.component.dm.customer.data.repository.response.customer.CustomerLoginsParser;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LegacyRememberedUser.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001dB\u001f\b\u0016\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001e¢\u0006\u0004\b\u001b\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\""}, d2 = {"Lcom/bbva/glomo/user/domain/model/LegacyRememberedUser;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "describeContents", "", "component1", "component2", HintConstants.AUTOFILL_HINT_USERNAME, CustomerLoginsParser.FIRST_NAME, "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", "q0", "getFirstName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "", "map", "(Ljava/util/Map;)V", "Companion", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LegacyRememberedUser implements Parcelable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @SerializedName(HintConstants.AUTOFILL_HINT_USERNAME)
    @NotNull
    private final String username;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @SerializedName(CustomerLoginsParser.FIRST_NAME)
    @NotNull
    private final String firstName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<LegacyRememberedUser> CREATOR = new Parcelable.Creator<LegacyRememberedUser>() { // from class: com.bbva.glomo.user.domain.model.LegacyRememberedUser$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public LegacyRememberedUser createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LegacyRememberedUser(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public LegacyRememberedUser[] newArray(int size) {
            return new LegacyRememberedUser[size];
        }
    };

    public LegacyRememberedUser(@NotNull String username, @NotNull String firstName) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.username = username;
        this.firstName = firstName;
    }

    public static /* synthetic */ LegacyRememberedUser copy$default(LegacyRememberedUser legacyRememberedUser, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = legacyRememberedUser.username;
        }
        if ((i10 & 2) != 0) {
            str2 = legacyRememberedUser.firstName;
        }
        return legacyRememberedUser.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    public final LegacyRememberedUser copy(@NotNull String username, @NotNull String firstName) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        return new LegacyRememberedUser(username, firstName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegacyRememberedUser)) {
            return false;
        }
        LegacyRememberedUser legacyRememberedUser = (LegacyRememberedUser) other;
        return Intrinsics.areEqual(this.username, legacyRememberedUser.username) && Intrinsics.areEqual(this.firstName, legacyRememberedUser.firstName);
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return this.firstName.hashCode() + (this.username.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return u.g("LegacyRememberedUser(username=", this.username, ", firstName=", this.firstName, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.username);
        parcel.writeString(this.firstName);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LegacyRememberedUser(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        string = string == null ? "" : string;
        String string2 = parcel.readString();
        this(string, string2 != null ? string2 : "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LegacyRememberedUser(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        Object obj = map.get(HintConstants.AUTOFILL_HINT_USERNAME);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = map.get(CustomerLoginsParser.FIRST_NAME);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        this((String) obj, (String) obj2);
    }

    /* JADX INFO: compiled from: LegacyRememberedUser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomo/user/domain/model/LegacyRememberedUser$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/bbva/glomo/user/domain/model/LegacyRememberedUser;", "getCREATOR$annotations", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }
}
