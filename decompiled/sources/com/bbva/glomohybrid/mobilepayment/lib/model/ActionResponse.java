package com.bbva.glomohybrid.mobilepayment.lib.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parceler;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActionResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u001f\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010 J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/bbva/glomohybrid/mobilepayment/lib/model/ActionResponse;", "Landroid/os/Parcelable;", "", "component1", "Lcom/bbva/glomohybrid/mobilepayment/lib/model/TohuData;", "component2", "result", "data", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "Ljava/lang/String;", "getResult", "()Ljava/lang/String;", "q0", "Lcom/bbva/glomohybrid/mobilepayment/lib/model/TohuData;", "getData", "()Lcom/bbva/glomohybrid/mobilepayment/lib/model/TohuData;", "<init>", "(Ljava/lang/String;Lcom/bbva/glomohybrid/mobilepayment/lib/model/TohuData;)V", "(Landroid/os/Parcel;)V", "Companion", "library_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class ActionResponse implements Parcelable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("result")
    @Nullable
    private final String result;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("data")
    @Nullable
    private final TohuData data;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ActionResponse> CREATOR = new Creator();

    /* JADX INFO: compiled from: ActionResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/mobilepayment/lib/model/ActionResponse$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/bbva/glomohybrid/mobilepayment/lib/model/ActionResponse;", "()V", "create", "parcel", "Landroid/os/Parcel;", "write", "", "flags", "", "library_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements Parceler<ActionResponse> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        @NotNull
        public ActionResponse[] newArray(int i10) {
            return (ActionResponse[]) Parceler.DefaultImpls.newArray(this, i10);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        @NotNull
        public ActionResponse create(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ActionResponse(parcel);
        }

        @Override // kotlinx.parcelize.Parceler
        public void write(@NotNull ActionResponse actionResponse, @NotNull Parcel parcel, int i10) {
            Intrinsics.checkNotNullParameter(actionResponse, "<this>");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(actionResponse.getResult());
            parcel.writeParcelable(actionResponse.getData(), i10);
        }
    }

    /* JADX INFO: compiled from: ActionResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ActionResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ActionResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return ActionResponse.INSTANCE.create(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ActionResponse[] newArray(int i10) {
            return new ActionResponse[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ActionResponse copy$default(ActionResponse actionResponse, String str, TohuData tohuData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = actionResponse.result;
        }
        if ((i10 & 2) != 0) {
            tohuData = actionResponse.data;
        }
        return actionResponse.copy(str, tohuData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TohuData getData() {
        return this.data;
    }

    @NotNull
    public final ActionResponse copy(@Nullable String result, @Nullable TohuData data) {
        return new ActionResponse(result, data);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionResponse)) {
            return false;
        }
        ActionResponse actionResponse = (ActionResponse) other;
        return Intrinsics.areEqual(this.result, actionResponse.result) && Intrinsics.areEqual(this.data, actionResponse.data);
    }

    @Nullable
    public final TohuData getData() {
        return this.data;
    }

    @Nullable
    public final String getResult() {
        return this.result;
    }

    public int hashCode() {
        String str = this.result;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TohuData tohuData = this.data;
        return iHashCode + (tohuData != null ? tohuData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ActionResponse(result=" + this.result + ", data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        INSTANCE.write(this, parcel, flags);
    }

    public ActionResponse(@Nullable String str, @Nullable TohuData tohuData) {
        this.result = str;
        this.data = tohuData;
    }

    public /* synthetic */ ActionResponse(String str, TohuData tohuData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : tohuData);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionResponse(@NotNull Parcel parcel) {
        this(parcel.readString(), (TohuData) parcel.readParcelable(TohuData.class.getClassLoader()));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
