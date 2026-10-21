package com.bbva.glomohybrid.cellsweb.view.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.a;
import bk.q;
import com.bbva.component.dm.storage.Mappable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.android.gms.stats.CodePackage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SettingsDialogType.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B'\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b&\u0010(B\u001f\b\u0016\u0012\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0003¢\u0006\u0004\b&\u0010*J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001f¨\u0006,"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/view/dialog/SettingsDialogType;", "Lcom/bbva/component/dm/storage/Mappable;", "Landroid/os/Parcelable;", "", "", "", "toMap", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "describeContents", "component1", "component2", "component3", "component4", "resTitleId", "resMessageId", "resPositiveBtnId", "resNegativeBtnId", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getResTitleId", "()I", "q0", "getResMessageId", "r0", "getResPositiveBtnId", "s0", "getResNegativeBtnId", "<init>", "(IIII)V", "(Landroid/os/Parcel;)V", "map", "(Ljava/util/Map;)V", "Companion", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class SettingsDialogType implements Mappable, Parcelable {

    @NotNull
    public static final String CALENDAR = "calendar";

    @NotNull
    public static final String LOCATION = "geolocation";

    @NotNull
    public static final String LOCATION_AND_PUSH = "geolocation_and_push";

    @NotNull
    public static final String LOCATION_SERVICE = "geolocation_service";

    @NotNull
    public static final String NOTIFICATIONS = "push";

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int resTitleId;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final int resMessageId;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final int resPositiveBtnId;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public final int resNegativeBtnId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<SettingsDialogType> CREATOR = new Parcelable.Creator<SettingsDialogType>() { // from class: com.bbva.glomohybrid.cellsweb.view.dialog.SettingsDialogType$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SettingsDialogType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SettingsDialogType(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SettingsDialogType[] newArray(int size) {
            return new SettingsDialogType[size];
        }
    };

    public SettingsDialogType(int i10, int i11, int i12, int i13) {
        this.resTitleId = i10;
        this.resMessageId = i11;
        this.resPositiveBtnId = i12;
        this.resNegativeBtnId = i13;
    }

    public static /* synthetic */ SettingsDialogType copy$default(SettingsDialogType settingsDialogType, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = settingsDialogType.resTitleId;
        }
        if ((i14 & 2) != 0) {
            i11 = settingsDialogType.resMessageId;
        }
        if ((i14 & 4) != 0) {
            i12 = settingsDialogType.resPositiveBtnId;
        }
        if ((i14 & 8) != 0) {
            i13 = settingsDialogType.resNegativeBtnId;
        }
        return settingsDialogType.copy(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResTitleId() {
        return this.resTitleId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getResMessageId() {
        return this.resMessageId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getResPositiveBtnId() {
        return this.resPositiveBtnId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getResNegativeBtnId() {
        return this.resNegativeBtnId;
    }

    @NotNull
    public final SettingsDialogType copy(int resTitleId, int resMessageId, int resPositiveBtnId, int resNegativeBtnId) {
        return new SettingsDialogType(resTitleId, resMessageId, resPositiveBtnId, resNegativeBtnId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingsDialogType)) {
            return false;
        }
        SettingsDialogType settingsDialogType = (SettingsDialogType) other;
        return this.resTitleId == settingsDialogType.resTitleId && this.resMessageId == settingsDialogType.resMessageId && this.resPositiveBtnId == settingsDialogType.resPositiveBtnId && this.resNegativeBtnId == settingsDialogType.resNegativeBtnId;
    }

    public final int getResMessageId() {
        return this.resMessageId;
    }

    public final int getResNegativeBtnId() {
        return this.resNegativeBtnId;
    }

    public final int getResPositiveBtnId() {
        return this.resPositiveBtnId;
    }

    public final int getResTitleId() {
        return this.resTitleId;
    }

    public int hashCode() {
        return (((((this.resTitleId * 31) + this.resMessageId) * 31) + this.resPositiveBtnId) * 31) + this.resNegativeBtnId;
    }

    @Override // com.bbva.component.dm.storage.Mappable
    @NotNull
    public Map<String, Integer> toMap() {
        return q.mapOf(TuplesKt.to("resTitleId", Integer.valueOf(this.resTitleId)), TuplesKt.to("resMessageId", Integer.valueOf(this.resMessageId)), TuplesKt.to("resPositiveBtnId", Integer.valueOf(this.resPositiveBtnId)), TuplesKt.to("resNegativeBtnId", Integer.valueOf(this.resNegativeBtnId)));
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SettingsDialogType(resTitleId=");
        sb2.append(this.resTitleId);
        sb2.append(", resMessageId=");
        sb2.append(this.resMessageId);
        sb2.append(", resPositiveBtnId=");
        sb2.append(this.resPositiveBtnId);
        sb2.append(", resNegativeBtnId=");
        return a.c(sb2, this.resNegativeBtnId, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.resTitleId);
        parcel.writeInt(this.resMessageId);
        parcel.writeInt(this.resPositiveBtnId);
        parcel.writeInt(this.resNegativeBtnId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SettingsDialogType(@NotNull Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SettingsDialogType(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        Object obj = map.get("resTitleId");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = map.get("resMessageId");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) obj2).intValue();
        Object obj3 = map.get("resPositiveBtnId");
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue3 = ((Integer) obj3).intValue();
        Object obj4 = map.get("resNegativeBtnId");
        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
        this(iIntValue, iIntValue2, iIntValue3, ((Integer) obj4).intValue());
    }

    /* JADX INFO: compiled from: SettingsDialogType.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/view/dialog/SettingsDialogType$Companion;", "", "()V", "CALENDAR", "", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/bbva/glomohybrid/cellsweb/view/dialog/SettingsDialogType;", "getCREATOR$annotations", CodePackage.LOCATION, "LOCATION_AND_PUSH", "LOCATION_SERVICE", "NOTIFICATIONS", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
