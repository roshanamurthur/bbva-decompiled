package com.bbva.glomohybrid.base.store.model;

import android.os.Parcel;
import android.os.Parcelable;
import bk.p;
import com.bbva.component.dm.storage.Mappable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserIsLogged.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001dB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fB\u001f\b\u0016\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0007¢\u0006\u0004\b\u001e\u0010!J\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003J\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0004J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0013\u001a\u00020\bHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\"\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lcom/bbva/glomohybrid/base/store/model/UserIsLogged;", "Lcom/bbva/component/dm/storage/Mappable;", "Landroid/os/Parcelable;", "", "", "toInt", "toBoolean", "", "", "toMap", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "describeContents", "component1", "userIsLogged", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "p0", "Z", "getUserIsLogged", "()Z", "setUserIsLogged", "(Z)V", "<init>", "(Landroid/os/Parcel;)V", "map", "(Ljava/util/Map;)V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class UserIsLogged implements Mappable, Parcelable {

    @NotNull
    public static final String STORE_KEY = "user-is-logged";

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public boolean userIsLogged;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<UserIsLogged> CREATOR = new Parcelable.Creator<UserIsLogged>() { // from class: com.bbva.glomohybrid.base.store.model.UserIsLogged$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public UserIsLogged createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserIsLogged(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public UserIsLogged[] newArray(int size) {
            return new UserIsLogged[size];
        }
    };

    public UserIsLogged(boolean z10) {
        this.userIsLogged = z10;
    }

    public static /* synthetic */ UserIsLogged copy$default(UserIsLogged userIsLogged, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = userIsLogged.userIsLogged;
        }
        return userIsLogged.copy(z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getUserIsLogged() {
        return this.userIsLogged;
    }

    @NotNull
    public final UserIsLogged copy(boolean userIsLogged) {
        return new UserIsLogged(userIsLogged);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UserIsLogged) && this.userIsLogged == ((UserIsLogged) other).userIsLogged;
    }

    public final boolean getUserIsLogged() {
        return this.userIsLogged;
    }

    public int hashCode() {
        boolean z10 = this.userIsLogged;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final void setUserIsLogged(boolean z10) {
        this.userIsLogged = z10;
    }

    public final boolean toBoolean(int i10) {
        return i10 == 1;
    }

    @Override // com.bbva.component.dm.storage.Mappable
    @NotNull
    public Map<String, Boolean> toMap() {
        return p.mapOf(TuplesKt.to("userIsLogged", Boolean.valueOf(this.userIsLogged)));
    }

    @NotNull
    public String toString() {
        return "UserIsLogged(userIsLogged=" + this.userIsLogged + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(toInt(this.userIsLogged));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserIsLogged(@NotNull Parcel parcel) {
        this(parcel.readInt() == 1);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UserIsLogged(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        Object obj = map.get("userIsLogged");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        this(bool != null ? bool.booleanValue() : false);
    }

    /* JADX INFO: compiled from: UserIsLogged.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/base/store/model/UserIsLogged$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/bbva/glomohybrid/base/store/model/UserIsLogged;", "getCREATOR$annotations", "STORE_KEY", "", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }

    public final int toInt(boolean z10) {
        return z10 ? 1 : 0;
    }
}
