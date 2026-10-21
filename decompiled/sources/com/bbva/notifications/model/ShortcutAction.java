package com.bbva.notifications.model;

import ad.d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationShortcutItemModel.kt */
/* JADX INFO: loaded from: classes7.dex */
@Parcelize
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/notifications/model/ShortcutAction;", "Landroid/os/Parcelable;", "", "p0", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "action", "ActionCall", "ActionUnknown", "Lcom/bbva/notifications/model/ShortcutAction$ActionCall;", "Lcom/bbva/notifications/model/ShortcutAction$ActionUnknown;", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public abstract class ShortcutAction implements Parcelable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String action;

    /* JADX INFO: compiled from: NotificationShortcutItemModel.kt */
    @Parcelize
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/notifications/model/ShortcutAction$ActionCall;", "Lcom/bbva/notifications/model/ShortcutAction;", "", "component1", "phone", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "q0", "Ljava/lang/String;", "getPhone", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class ActionCall extends ShortcutAction {

        @NotNull
        public static final Parcelable.Creator<ActionCall> CREATOR = new Creator();

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String phone;

        /* JADX INFO: compiled from: NotificationShortcutItemModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ActionCall> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ActionCall createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActionCall(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ActionCall[] newArray(int i10) {
                return new ActionCall[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionCall(@NotNull String phone) {
            super(NotificationCompat.CATEGORY_CALL, null);
            Intrinsics.checkNotNullParameter(phone, "phone");
            this.phone = phone;
        }

        public static /* synthetic */ ActionCall copy$default(ActionCall actionCall, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = actionCall.phone;
            }
            return actionCall.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        @NotNull
        public final ActionCall copy(@NotNull String phone) {
            Intrinsics.checkNotNullParameter(phone, "phone");
            return new ActionCall(phone);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActionCall) && Intrinsics.areEqual(this.phone, ((ActionCall) other).phone);
        }

        @NotNull
        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            return this.phone.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("ActionCall(phone="), this.phone, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.phone);
        }
    }

    /* JADX INFO: compiled from: NotificationShortcutItemModel.kt */
    @Parcelize
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/notifications/model/ShortcutAction$ActionUnknown;", "Lcom/bbva/notifications/model/ShortcutAction;", "", "component1", "message", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "q0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class ActionUnknown extends ShortcutAction {

        @NotNull
        public static final Parcelable.Creator<ActionUnknown> CREATOR = new Creator();

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX INFO: compiled from: NotificationShortcutItemModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ActionUnknown> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ActionUnknown createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActionUnknown(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ActionUnknown[] newArray(int i10) {
                return new ActionUnknown[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ActionUnknown() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ActionUnknown copy$default(ActionUnknown actionUnknown, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = actionUnknown.message;
            }
            return actionUnknown.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final ActionUnknown copy(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ActionUnknown(message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActionUnknown) && Intrinsics.areEqual(this.message, ((ActionUnknown) other).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("ActionUnknown(message="), this.message, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.message);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionUnknown(@NotNull String message) {
            super("unknown", null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public /* synthetic */ ActionUnknown(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    public ShortcutAction(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.action = str;
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }
}
