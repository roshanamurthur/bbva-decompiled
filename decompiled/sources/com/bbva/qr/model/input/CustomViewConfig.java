package com.bbva.qr.model.input;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScannerConfig.kt */
/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/bbva/qr/model/input/CustomViewConfig;", "Landroid/os/Parcelable;", "id", "", "name", "", "options", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "getOptions", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;)Lcom/bbva/qr/model/input/CustomViewConfig;", "describeContents", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "qr_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CustomViewConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CustomViewConfig> CREATOR = new Creator();

    @Nullable
    private final Integer id;

    @Nullable
    private final String name;

    @Nullable
    private final Map<String, String> options;

    /* JADX INFO: compiled from: ScannerConfig.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CustomViewConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CustomViewConfig createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LinkedHashMap linkedHashMap = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new CustomViewConfig(numValueOf, string, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CustomViewConfig[] newArray(int i10) {
            return new CustomViewConfig[i10];
        }
    }

    public CustomViewConfig() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomViewConfig copy$default(CustomViewConfig customViewConfig, Integer num, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = customViewConfig.id;
        }
        if ((i10 & 2) != 0) {
            str = customViewConfig.name;
        }
        if ((i10 & 4) != 0) {
            map = customViewConfig.options;
        }
        return customViewConfig.copy(num, str, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Map<String, String> component3() {
        return this.options;
    }

    @NotNull
    public final CustomViewConfig copy(@Nullable Integer id, @Nullable String name, @Nullable Map<String, String> options) {
        return new CustomViewConfig(id, name, options);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomViewConfig)) {
            return false;
        }
        CustomViewConfig customViewConfig = (CustomViewConfig) other;
        return Intrinsics.areEqual(this.id, customViewConfig.id) && Intrinsics.areEqual(this.name, customViewConfig.name) && Intrinsics.areEqual(this.options, customViewConfig.options);
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Map<String, String> getOptions() {
        return this.options;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.options;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CustomViewConfig(id=" + this.id + ", name=" + this.name + ", options=" + this.options + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.name);
        Map<String, String> map = this.options;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public CustomViewConfig(@Nullable Integer num, @Nullable String str, @Nullable Map<String, String> map) {
        this.id = num;
        this.name = str;
        this.options = map;
    }

    public /* synthetic */ CustomViewConfig(Integer num, String str, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : map);
    }
}
