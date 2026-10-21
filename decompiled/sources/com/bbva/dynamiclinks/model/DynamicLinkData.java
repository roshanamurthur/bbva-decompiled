package com.bbva.dynamiclinks.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import bk.q;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/bbva/dynamiclinks/model/DynamicLinkData;", "Landroid/os/Parcelable;", "uri", "Landroid/net/Uri;", "data", "", "", "utmData", "Lcom/bbva/dynamiclinks/model/UtmData;", "(Landroid/net/Uri;Ljava/util/Map;Lcom/bbva/dynamiclinks/model/UtmData;)V", "getData", "()Ljava/util/Map;", "getUri", "()Landroid/net/Uri;", "getUtmData", "()Lcom/bbva/dynamiclinks/model/UtmData;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "dynamiclinks_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class DynamicLinkData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DynamicLinkData> CREATOR = new Creator();

    @NotNull
    private final Map<String, String> data;

    @NotNull
    private final Uri uri;

    @Nullable
    private final UtmData utmData;

    /* JADX INFO: compiled from: DataModel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DynamicLinkData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DynamicLinkData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Uri uri = (Uri) parcel.readParcelable(DynamicLinkData.class.getClassLoader());
            int i10 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new DynamicLinkData(uri, linkedHashMap, parcel.readInt() == 0 ? null : UtmData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DynamicLinkData[] newArray(int i10) {
            return new DynamicLinkData[i10];
        }
    }

    public DynamicLinkData(@NotNull Uri uri, @NotNull Map<String, String> data, @Nullable UtmData utmData) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(data, "data");
        this.uri = uri;
        this.data = data;
        this.utmData = utmData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DynamicLinkData copy$default(DynamicLinkData dynamicLinkData, Uri uri, Map map, UtmData utmData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uri = dynamicLinkData.uri;
        }
        if ((i10 & 2) != 0) {
            map = dynamicLinkData.data;
        }
        if ((i10 & 4) != 0) {
            utmData = dynamicLinkData.utmData;
        }
        return dynamicLinkData.copy(uri, map, utmData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UtmData getUtmData() {
        return this.utmData;
    }

    @NotNull
    public final DynamicLinkData copy(@NotNull Uri uri, @NotNull Map<String, String> data, @Nullable UtmData utmData) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(data, "data");
        return new DynamicLinkData(uri, data, utmData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicLinkData)) {
            return false;
        }
        DynamicLinkData dynamicLinkData = (DynamicLinkData) other;
        return Intrinsics.areEqual(this.uri, dynamicLinkData.uri) && Intrinsics.areEqual(this.data, dynamicLinkData.data) && Intrinsics.areEqual(this.utmData, dynamicLinkData.utmData);
    }

    @NotNull
    public final Map<String, String> getData() {
        return this.data;
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    @Nullable
    public final UtmData getUtmData() {
        return this.utmData;
    }

    public int hashCode() {
        int iHashCode = (this.data.hashCode() + (this.uri.hashCode() * 31)) * 31;
        UtmData utmData = this.utmData;
        return iHashCode + (utmData == null ? 0 : utmData.hashCode());
    }

    @NotNull
    public String toString() {
        return "DynamicLinkData(uri=" + this.uri + ", data=" + this.data + ", utmData=" + this.utmData + RootService.CLOSE_BRACKET;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.uri, flags);
        Map<String, String> map = this.data;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        UtmData utmData = this.utmData;
        if (utmData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            utmData.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ DynamicLinkData(Uri uri, Map map, UtmData utmData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, (i10 & 2) != 0 ? q.emptyMap() : map, (i10 & 4) != 0 ? null : utmData);
    }
}
