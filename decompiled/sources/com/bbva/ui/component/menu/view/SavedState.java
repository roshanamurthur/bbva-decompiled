package com.bbva.ui.component.menu.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SavedState.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/bbva/ui/component/menu/view/SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcel;", "outParcel", "", "flags", "", "writeToParcel", "", "p0", "Z", "isMenuOpened", "()Z", "setMenuOpened", "(Z)V", "Landroid/os/Parcelable;", "superState", "<init>", "(Landroid/os/Parcelable;)V", "Companion", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0})
public final class SavedState extends View.BaseSavedState {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public boolean isMenuOpened;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.bbva.ui.component.menu.view.SavedState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SavedState createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new SavedState(source, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SavedState[] newArray(int size) {
            return new SavedState[size];
        }
    };

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedState(@NotNull Parcelable superState) {
        super(superState);
        Intrinsics.checkNotNullParameter(superState, "superState");
    }

    /* JADX INFO: renamed from: isMenuOpened, reason: from getter */
    public final boolean getIsMenuOpened() {
        return this.isMenuOpened;
    }

    public final void setMenuOpened(boolean z10) {
        this.isMenuOpened = z10;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel outParcel, int flags) {
        Intrinsics.checkNotNullParameter(outParcel, "outParcel");
        super.writeToParcel(outParcel, flags);
        outParcel.writeByte(this.isMenuOpened ? (byte) 1 : (byte) 0);
    }

    public SavedState(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        super(parcel);
        this.isMenuOpened = parcel.readByte() == 1;
    }

    /* JADX INFO: compiled from: SavedState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/bbva/ui/component/menu/view/SavedState$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/bbva/ui/component/menu/view/SavedState;", "getCREATOR$annotations", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
