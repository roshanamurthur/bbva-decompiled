package com.bbva.component.ui.welcome.pager;

import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Mode.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\b\u0080\b\u0018\u0000 ,2\u00020\u0001:\u0001,B\u001d\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\u0004\b)\u0010*B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b)\u0010+J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J!\u0010\r\u001a\u00020\u00002\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\nHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0017\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006-"}, d2 = {"Lcom/bbva/component/ui/welcome/pager/Mode;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "describeContents", "", "", "", "map", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "p0", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "q0", "Ljava/lang/Boolean;", "getAutoMovement", "()Ljava/lang/Boolean;", "autoMovement", "", "r0", "Ljava/lang/Long;", "getMovementDelay", "()Ljava/lang/Long;", "movementDelay", "", "s0", "Ljava/util/List;", "getPages", "()Ljava/util/List;", "pages", "<init>", "(Ljava/util/Map;)V", "(Landroid/os/Parcel;)V", "CREATOR", "component-ui-welcome_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class Mode implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Boolean autoMovement;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long movementDelay;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> pages;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Map<String, Object> f28800t0;

    /* JADX INFO: renamed from: com.bbva.component.ui.welcome.pager.Mode$CREATOR, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Mode.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/component/ui/welcome/pager/Mode$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bbva/component/ui/welcome/pager/Mode;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bbva/component/ui/welcome/pager/Mode;", "component-ui-welcome_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion implements Parcelable.Creator<Mode> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Mode createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Mode(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Mode[] newArray(int size) {
            return new Mode[size];
        }
    }

    public Mode(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f28800t0 = map;
        Object obj = map.get("name");
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.name = (String) obj;
        this.autoMovement = (Boolean) map.get("autoMovement");
        Double d2 = (Double) map.get("movementDelay");
        this.movementDelay = d2 != null ? Long.valueOf((long) d2.doubleValue()) : null;
        Object obj2 = map.get("pages");
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        }
        this.pages = (List) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Mode copy$default(Mode mode, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = mode.f28800t0;
        }
        return mode.copy(map);
    }

    @NotNull
    public final Mode copy(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new Mode(map);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof Mode) && Intrinsics.areEqual(this.f28800t0, ((Mode) other).f28800t0);
        }
        return true;
    }

    @Nullable
    public final Boolean getAutoMovement() {
        return this.autoMovement;
    }

    @Nullable
    public final Long getMovementDelay() {
        return this.movementDelay;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<String> getPages() {
        return this.pages;
    }

    public int hashCode() {
        Map<String, Object> map = this.f28800t0;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "Mode(map=" + this.f28800t0 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeMap(this.f28800t0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Mode(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        HashMap hashMap = parcel.readHashMap(Mode.class.getClassLoader());
        if (hashMap == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        }
        this(hashMap);
    }
}
