package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.internal.BaseGmsClient;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IntentSenderRequest.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002\"!B1\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eB\u0011\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006#"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "Landroid/content/IntentSender;", "p0", "Landroid/content/IntentSender;", "getIntentSender", "()Landroid/content/IntentSender;", "intentSender", "Landroid/content/Intent;", "q0", "Landroid/content/Intent;", "getFillInIntent", "()Landroid/content/Intent;", "fillInIntent", "r0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFlagsMask", "()I", "flagsMask", "s0", "getFlagsValues", "flagsValues", "<init>", "(Landroid/content/IntentSender;Landroid/content/Intent;II)V", "parcel", "(Landroid/os/Parcel;)V", "Companion", "Builder", "activity_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final IntentSender intentSender;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Intent fillInIntent;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final int flagsMask;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public final int flagsValues;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new Parcelable.Creator<IntentSenderRequest>() { // from class: androidx.activity.result.IntentSenderRequest$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public IntentSenderRequest createFromParcel(@NotNull Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new IntentSenderRequest(inParcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public IntentSenderRequest[] newArray(int size) {
            return new IntentSenderRequest[size];
        }
    };

    /* JADX INFO: compiled from: IntentSenderRequest.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\t¨\u0006\u0012"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Builder;", "", "Landroid/content/Intent;", "fillInIntent", "setFillInIntent", "", "values", "mask", "setFlags", "Landroidx/activity/result/IntentSenderRequest;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Landroid/content/IntentSender;", "intentSender", "<init>", "(Landroid/content/IntentSender;)V", "Landroid/app/PendingIntent;", BaseGmsClient.KEY_PENDING_INTENT, "(Landroid/app/PendingIntent;)V", "activity_release"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final IntentSender f493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Intent f494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f496d;

        public Builder(@NotNull IntentSender intentSender) {
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            this.f493a = intentSender;
        }

        @NotNull
        public final IntentSenderRequest build() {
            return new IntentSenderRequest(this.f493a, this.f494b, this.f495c, this.f496d);
        }

        @NotNull
        public final Builder setFillInIntent(@Nullable Intent fillInIntent) {
            this.f494b = fillInIntent;
            return this;
        }

        @NotNull
        public final Builder setFlags(int values, int mask) {
            this.f496d = values;
            this.f495c = mask;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(@NotNull PendingIntent pendingIntent) {
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }
    }

    public IntentSenderRequest(@NotNull IntentSender intentSender, @Nullable Intent intent, int i10, int i11) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.intentSender = intentSender;
        this.fillInIntent = intent;
        this.flagsMask = i10;
        this.flagsValues = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Intent getFillInIntent() {
        return this.fillInIntent;
    }

    public final int getFlagsMask() {
        return this.flagsMask;
    }

    public final int getFlagsValues() {
        return this.flagsValues;
    }

    @NotNull
    public final IntentSender getIntentSender() {
        return this.intentSender;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.intentSender, flags);
        dest.writeParcelable(this.fillInIntent, flags);
        dest.writeInt(this.flagsMask);
        dest.writeInt(this.flagsValues);
    }

    public /* synthetic */ IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(intentSender, (i12 & 2) != 0 ? null : intent, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntentSenderRequest(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        Intrinsics.checkNotNull(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    /* JADX INFO: compiled from: IntentSenderRequest.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002¨\u0006\u0007"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Landroidx/activity/result/IntentSenderRequest;", "getCREATOR$annotations", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
