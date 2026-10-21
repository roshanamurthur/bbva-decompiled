package com.bbva.glomohybrid.base.deeplink.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.model.constants.BanxicoConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SalesforceDeepLinkModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BR\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0019\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001c\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000bHÆ\u0003Jb\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000bHÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR$\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006("}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/model/SalesforceDeepLinkModel;", "Landroid/os/Parcelable;", "app", "", "trackingCode", "country", "type", "subtype", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "", "", "Lkotlinx/parcelize/RawValue;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getApp", "()Ljava/lang/String;", "getCountry", "getPayload", "()Ljava/util/Map;", "getSubtype", "getTrackingCode", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SalesforceDeepLinkModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SalesforceDeepLinkModel> CREATOR = new Creator();

    @Nullable
    private final String app;

    @Nullable
    private final String country;

    @Nullable
    private final Map<String, Object> payload;

    @Nullable
    private final String subtype;

    @Nullable
    private final String trackingCode;

    @Nullable
    private final String type;

    /* JADX INFO: compiled from: SalesforceDeepLinkModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SalesforceDeepLinkModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SalesforceDeepLinkModel createFromParcel(@NotNull Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readValue(SalesforceDeepLinkModel.class.getClassLoader()));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new SalesforceDeepLinkModel(string, string2, string3, string4, string5, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SalesforceDeepLinkModel[] newArray(int i10) {
            return new SalesforceDeepLinkModel[i10];
        }
    }

    public SalesforceDeepLinkModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Map<String, ? extends Object> map) {
        this.app = str;
        this.trackingCode = str2;
        this.country = str3;
        this.type = str4;
        this.subtype = str5;
        this.payload = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SalesforceDeepLinkModel copy$default(SalesforceDeepLinkModel salesforceDeepLinkModel, String str, String str2, String str3, String str4, String str5, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = salesforceDeepLinkModel.app;
        }
        if ((i10 & 2) != 0) {
            str2 = salesforceDeepLinkModel.trackingCode;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = salesforceDeepLinkModel.country;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = salesforceDeepLinkModel.type;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = salesforceDeepLinkModel.subtype;
        }
        String str9 = str5;
        if ((i10 & 32) != 0) {
            map = salesforceDeepLinkModel.payload;
        }
        return salesforceDeepLinkModel.copy(str, str6, str7, str8, str9, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApp() {
        return this.app;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTrackingCode() {
        return this.trackingCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    @Nullable
    public final Map<String, Object> component6() {
        return this.payload;
    }

    @NotNull
    public final SalesforceDeepLinkModel copy(@Nullable String app, @Nullable String trackingCode, @Nullable String country, @Nullable String type, @Nullable String subtype, @Nullable Map<String, ? extends Object> payload) {
        return new SalesforceDeepLinkModel(app, trackingCode, country, type, subtype, payload);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SalesforceDeepLinkModel)) {
            return false;
        }
        SalesforceDeepLinkModel salesforceDeepLinkModel = (SalesforceDeepLinkModel) other;
        return Intrinsics.areEqual(this.app, salesforceDeepLinkModel.app) && Intrinsics.areEqual(this.trackingCode, salesforceDeepLinkModel.trackingCode) && Intrinsics.areEqual(this.country, salesforceDeepLinkModel.country) && Intrinsics.areEqual(this.type, salesforceDeepLinkModel.type) && Intrinsics.areEqual(this.subtype, salesforceDeepLinkModel.subtype) && Intrinsics.areEqual(this.payload, salesforceDeepLinkModel.payload);
    }

    @Nullable
    public final String getApp() {
        return this.app;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final Map<String, Object> getPayload() {
        return this.payload;
    }

    @Nullable
    public final String getSubtype() {
        return this.subtype;
    }

    @Nullable
    public final String getTrackingCode() {
        return this.trackingCode;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.app;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.trackingCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subtype;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, Object> map = this.payload;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.app;
        String str2 = this.trackingCode;
        String str3 = this.country;
        String str4 = this.type;
        String str5 = this.subtype;
        Map<String, Object> map = this.payload;
        StringBuilder sbC = a.c("SalesforceDeepLinkModel(app=", str, ", trackingCode=", str2, ", country=");
        k.e(sbC, str3, ", type=", str4, ", subtype=");
        sbC.append(str5);
        sbC.append(", payload=");
        sbC.append(map);
        sbC.append(")");
        return sbC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.app);
        parcel.writeString(this.trackingCode);
        parcel.writeString(this.country);
        parcel.writeString(this.type);
        parcel.writeString(this.subtype);
        Map<String, Object> map = this.payload;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeValue(entry.getValue());
        }
    }
}
