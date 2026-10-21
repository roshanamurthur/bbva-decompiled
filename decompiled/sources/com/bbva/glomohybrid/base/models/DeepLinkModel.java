package com.bbva.glomohybrid.base.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeepLinkModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003JI\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, d2 = {"Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "Landroid/os/Parcelable;", "key", "", "action", "args", "", "localArgs", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "getAction", "()Ljava/lang/String;", "getArgs", "()Ljava/util/List;", "getKey", "getLocalArgs", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DeepLinkModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeepLinkModel> CREATOR = new Creator();

    @Nullable
    private final String action;

    @NotNull
    private final List<String> args;

    @Nullable
    private final String key;

    @Nullable
    private final Map<String, String> localArgs;

    /* JADX INFO: compiled from: DeepLinkModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeepLinkModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DeepLinkModel createFromParcel(@NotNull Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new DeepLinkModel(string, string2, arrayListCreateStringArrayList, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DeepLinkModel[] newArray(int i10) {
            return new DeepLinkModel[i10];
        }
    }

    public DeepLinkModel(@Nullable String str, @Nullable String str2, @NotNull List<String> args, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(args, "args");
        this.key = str;
        this.action = str2;
        this.args = args;
        this.localArgs = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeepLinkModel copy$default(DeepLinkModel deepLinkModel, String str, String str2, List list, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deepLinkModel.key;
        }
        if ((i10 & 2) != 0) {
            str2 = deepLinkModel.action;
        }
        if ((i10 & 4) != 0) {
            list = deepLinkModel.args;
        }
        if ((i10 & 8) != 0) {
            map = deepLinkModel.localArgs;
        }
        return deepLinkModel.copy(str, str2, list, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final List<String> component3() {
        return this.args;
    }

    @Nullable
    public final Map<String, String> component4() {
        return this.localArgs;
    }

    @NotNull
    public final DeepLinkModel copy(@Nullable String key, @Nullable String action, @NotNull List<String> args, @Nullable Map<String, String> localArgs) {
        Intrinsics.checkNotNullParameter(args, "args");
        return new DeepLinkModel(key, action, args, localArgs);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeepLinkModel)) {
            return false;
        }
        DeepLinkModel deepLinkModel = (DeepLinkModel) other;
        return Intrinsics.areEqual(this.key, deepLinkModel.key) && Intrinsics.areEqual(this.action, deepLinkModel.action) && Intrinsics.areEqual(this.args, deepLinkModel.args) && Intrinsics.areEqual(this.localArgs, deepLinkModel.localArgs);
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final List<String> getArgs() {
        return this.args;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final Map<String, String> getLocalArgs() {
        return this.localArgs;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.action;
        int iA = a.a(this.args, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Map<String, String> map = this.localArgs;
        return iA + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.key;
        String str2 = this.action;
        List<String> list = this.args;
        Map<String, String> map = this.localArgs;
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("DeepLinkModel(key=", str, ", action=", str2, ", args=");
        sbC.append(list);
        sbC.append(", localArgs=");
        sbC.append(map);
        sbC.append(")");
        return sbC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.key);
        parcel.writeString(this.action);
        parcel.writeStringList(this.args);
        Map<String, String> map = this.localArgs;
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

    public /* synthetic */ DeepLinkModel(String str, String str2, List list, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 8) != 0 ? null : map);
    }
}
