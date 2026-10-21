package com.bbva.glomohybrid.base.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.camera.core.imagecapture.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShortcutModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J1\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/bbva/glomohybrid/base/models/ShortcutModel;", "Landroid/os/Parcelable;", "key", "", "action", "args", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAction", "()Ljava/lang/String;", "getArgs", "()Ljava/util/List;", "getKey", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ShortcutModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShortcutModel> CREATOR = new Creator();

    @Nullable
    private final String action;

    @NotNull
    private final List<String> args;

    @Nullable
    private final String key;

    /* JADX INFO: compiled from: ShortcutModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ShortcutModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ShortcutModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShortcutModel(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ShortcutModel[] newArray(int i10) {
            return new ShortcutModel[i10];
        }
    }

    public ShortcutModel(@Nullable String str, @Nullable String str2, @NotNull List<String> args) {
        Intrinsics.checkNotNullParameter(args, "args");
        this.key = str;
        this.action = str2;
        this.args = args;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShortcutModel copy$default(ShortcutModel shortcutModel, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = shortcutModel.key;
        }
        if ((i10 & 2) != 0) {
            str2 = shortcutModel.action;
        }
        if ((i10 & 4) != 0) {
            list = shortcutModel.args;
        }
        return shortcutModel.copy(str, str2, list);
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

    @NotNull
    public final ShortcutModel copy(@Nullable String key, @Nullable String action, @NotNull List<String> args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return new ShortcutModel(key, action, args);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortcutModel)) {
            return false;
        }
        ShortcutModel shortcutModel = (ShortcutModel) other;
        return Intrinsics.areEqual(this.key, shortcutModel.key) && Intrinsics.areEqual(this.action, shortcutModel.action) && Intrinsics.areEqual(this.args, shortcutModel.args);
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

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.action;
        return this.args.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.key;
        String str2 = this.action;
        return a.c(androidx.constraintlayout.core.parser.a.c("ShortcutModel(key=", str, ", action=", str2, ", args="), this.args, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.key);
        parcel.writeString(this.action);
        parcel.writeStringList(this.args);
    }

    public /* synthetic */ ShortcutModel(String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
