package androidx.compose.foundation.lazy.layout;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Lazy.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcelable;", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
final /* data */ class DefaultLazyKey implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f4923p0;

    static {
        new Companion(null);
        CREATOR = new Parcelable.Creator<DefaultLazyKey>() { // from class: androidx.compose.foundation.lazy.layout.DefaultLazyKey$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public DefaultLazyKey createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DefaultLazyKey(parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public DefaultLazyKey[] newArray(int size) {
                return new DefaultLazyKey[size];
            }
        };
    }

    public DefaultLazyKey(int i10) {
        this.f4923p0 = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.f4923p0 == ((DefaultLazyKey) obj).f4923p0;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF4923p0() {
        return this.f4923p0;
    }

    @NotNull
    public final String toString() {
        return androidx.activity.a.d(new StringBuilder("DefaultLazyKey(index="), this.f4923p0, RootService.CLOSE_BRACKET);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i10) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.f4923p0);
    }

    /* JADX INFO: compiled from: Lazy.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "getCREATOR$annotations", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
