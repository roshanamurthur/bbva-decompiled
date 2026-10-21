package com.bbva.glomohybrid.mobilepayment.lib.model;

import ad.d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallbackErrors;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parceler;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TohuData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B+\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010!J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006#"}, d2 = {"Lcom/bbva/glomohybrid/mobilepayment/lib/model/TohuData;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", TohuCallbackErrors.CARD_UNIQUE_REFERENCE_KEY, "state", "value", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "Ljava/lang/String;", "getCardUniqueReference", "()Ljava/lang/String;", "q0", "getState", "r0", "getValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "Companion", "library_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class TohuData implements Parcelable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TohuCallbackErrors.CARD_UNIQUE_REFERENCE_KEY)
    @Nullable
    private final String cardUniqueReference;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("state")
    @Nullable
    private final String state;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    @Nullable
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<TohuData> CREATOR = new Creator();

    /* JADX INFO: compiled from: TohuData.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/mobilepayment/lib/model/TohuData$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/bbva/glomohybrid/mobilepayment/lib/model/TohuData;", "()V", "create", "parcel", "Landroid/os/Parcel;", "write", "", "flags", "", "library_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements Parceler<TohuData> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        @NotNull
        public TohuData[] newArray(int i10) {
            return (TohuData[]) Parceler.DefaultImpls.newArray(this, i10);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        @NotNull
        public TohuData create(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TohuData(parcel);
        }

        @Override // kotlinx.parcelize.Parceler
        public void write(@NotNull TohuData tohuData, @NotNull Parcel parcel, int i10) {
            Intrinsics.checkNotNullParameter(tohuData, "<this>");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(tohuData.getCardUniqueReference());
            parcel.writeString(tohuData.getState());
            parcel.writeString(tohuData.getValue());
        }
    }

    /* JADX INFO: compiled from: TohuData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TohuData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final TohuData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return TohuData.INSTANCE.create(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final TohuData[] newArray(int i10) {
            return new TohuData[i10];
        }
    }

    public TohuData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ TohuData copy$default(TohuData tohuData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tohuData.cardUniqueReference;
        }
        if ((i10 & 2) != 0) {
            str2 = tohuData.state;
        }
        if ((i10 & 4) != 0) {
            str3 = tohuData.value;
        }
        return tohuData.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final TohuData copy(@Nullable String cardUniqueReference, @Nullable String state, @Nullable String value) {
        return new TohuData(cardUniqueReference, state, value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TohuData)) {
            return false;
        }
        TohuData tohuData = (TohuData) other;
        return Intrinsics.areEqual(this.cardUniqueReference, tohuData.cardUniqueReference) && Intrinsics.areEqual(this.state, tohuData.state) && Intrinsics.areEqual(this.value, tohuData.value);
    }

    @Nullable
    public final String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    @Nullable
    public final String getState() {
        return this.state;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.cardUniqueReference;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.state;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.cardUniqueReference;
        String str2 = this.state;
        return d.f(a.c("TohuData(cardUniqueReference=", str, ", state=", str2, ", value="), this.value, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        INSTANCE.write(this, parcel, flags);
    }

    public TohuData(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.cardUniqueReference = str;
        this.state = str2;
        this.value = str3;
    }

    public /* synthetic */ TohuData(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TohuData(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
