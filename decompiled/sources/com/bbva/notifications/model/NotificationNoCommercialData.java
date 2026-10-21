package com.bbva.notifications.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationNoCommercialData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\b\u0010$\u001a\u00020%H\u0016J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\b\u0010*\u001a\u0004\u0018\u00010\u0003J\b\u0010+\u001a\u0004\u0018\u00010\u0003J\b\u0010,\u001a\u0004\u0018\u00010\u0003J\t\u0010-\u001a\u00020%HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020%HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u00064"}, d2 = {"Lcom/bbva/notifications/model/NotificationNoCommercialData;", "Landroid/os/Parcelable;", "description", "", "productType", PushConstants.AMOUNT, "date", "hour", "currency", "concept", PushConstants.NOTIFICATION_TYPE, "category", "timer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCategory", "getConcept", "getCurrency", "getDate", "getDescription", "getHour", "getNotificationType", "getProductType", "getTimer", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "getAmountAndCurrency", "getCurrencySymbol", "getDateAndHour", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotificationNoCommercialData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationNoCommercialData.kt\ncom/bbva/notifications/model/NotificationNoCommercialData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"})
public final /* data */ class NotificationNoCommercialData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NotificationNoCommercialData> CREATOR = new Creator();

    @Nullable
    private final String amount;

    @Nullable
    private final String category;

    @Nullable
    private final String concept;

    @Nullable
    private final String currency;

    @Nullable
    private final String date;

    @Nullable
    private final String description;

    @Nullable
    private final String hour;

    @Nullable
    private final String notificationType;

    @Nullable
    private final String productType;

    @Nullable
    private final String timer;

    /* JADX INFO: compiled from: NotificationNoCommercialData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NotificationNoCommercialData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NotificationNoCommercialData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NotificationNoCommercialData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NotificationNoCommercialData[] newArray(int i10) {
            return new NotificationNoCommercialData[i10];
        }
    }

    public NotificationNoCommercialData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.description = str;
        this.productType = str2;
        this.amount = str3;
        this.date = str4;
        this.hour = str5;
        this.currency = str6;
        this.concept = str7;
        this.notificationType = str8;
        this.category = str9;
        this.timer = str10;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTimer() {
        return this.timer;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHour() {
        return this.hour;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getConcept() {
        return this.concept;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNotificationType() {
        return this.notificationType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final NotificationNoCommercialData copy(@Nullable String description, @Nullable String productType, @Nullable String amount, @Nullable String date, @Nullable String hour, @Nullable String currency, @Nullable String concept, @Nullable String notificationType, @Nullable String category, @Nullable String timer) {
        return new NotificationNoCommercialData(description, productType, amount, date, hour, currency, concept, notificationType, category, timer);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationNoCommercialData)) {
            return false;
        }
        NotificationNoCommercialData notificationNoCommercialData = (NotificationNoCommercialData) other;
        return Intrinsics.areEqual(this.description, notificationNoCommercialData.description) && Intrinsics.areEqual(this.productType, notificationNoCommercialData.productType) && Intrinsics.areEqual(this.amount, notificationNoCommercialData.amount) && Intrinsics.areEqual(this.date, notificationNoCommercialData.date) && Intrinsics.areEqual(this.hour, notificationNoCommercialData.hour) && Intrinsics.areEqual(this.currency, notificationNoCommercialData.currency) && Intrinsics.areEqual(this.concept, notificationNoCommercialData.concept) && Intrinsics.areEqual(this.notificationType, notificationNoCommercialData.notificationType) && Intrinsics.areEqual(this.category, notificationNoCommercialData.category) && Intrinsics.areEqual(this.timer, notificationNoCommercialData.timer);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getAmountAndCurrency() {
        CurrencyData.Companion companion = CurrencyData.INSTANCE;
        String str = this.currency;
        if (str == null) {
            str = "";
        }
        CurrencyData currency = companion.getCurrency(str);
        if (this.currency == null) {
            return null;
        }
        CurrencyPositionData position = currency.getPosition();
        if (position instanceof CurrencyPositionLeft) {
            return u.f(currency.getSymbol(), this.amount);
        }
        if (position instanceof CurrencyPositionRight) {
            return u.f(this.amount, currency.getSymbol());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getConcept() {
        return this.concept;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencySymbol() {
        if (this.amount == null) {
            return null;
        }
        CurrencyData.Companion companion = CurrencyData.INSTANCE;
        String str = this.currency;
        if (str == null) {
            str = "";
        }
        return companion.getCurrency(str).getSymbol();
    }

    @Nullable
    public final String getDate() {
        return this.date;
    }

    @Nullable
    public final String getDateAndHour() {
        String str;
        String str2 = this.date;
        if (str2 == null || (str = this.hour) == null) {
            return null;
        }
        String str3 = StringsKt__StringsKt.contains((CharSequence) str, (CharSequence) "h", true) ? "" : null;
        if (str3 == null) {
            str3 = " h";
        }
        return str2 + ", " + str + str3;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getHour() {
        return this.hour;
    }

    @Nullable
    public final String getNotificationType() {
        return this.notificationType;
    }

    @Nullable
    public final String getProductType() {
        return this.productType;
    }

    @Nullable
    public final String getTimer() {
        return this.timer;
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.amount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.date;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hour;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.currency;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.concept;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.notificationType;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.category;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.timer;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.description;
        String str2 = this.productType;
        String str3 = this.amount;
        String str4 = this.date;
        String str5 = this.hour;
        String str6 = this.currency;
        String str7 = this.concept;
        String str8 = this.notificationType;
        String str9 = this.category;
        String str10 = this.timer;
        StringBuilder sbC = a.c("NotificationNoCommercialData(description=", str, ", productType=", str2, ", amount=");
        k.e(sbC, str3, ", date=", str4, ", hour=");
        k.e(sbC, str5, ", currency=", str6, ", concept=");
        k.e(sbC, str7, ", notificationType=", str8, ", category=");
        return c.b(sbC, str9, ", timer=", str10, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.description);
        parcel.writeString(this.productType);
        parcel.writeString(this.amount);
        parcel.writeString(this.date);
        parcel.writeString(this.hour);
        parcel.writeString(this.currency);
        parcel.writeString(this.concept);
        parcel.writeString(this.notificationType);
        parcel.writeString(this.category);
        parcel.writeString(this.timer);
    }

    public /* synthetic */ NotificationNoCommercialData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, (i10 & 512) != 0 ? null : str10);
    }
}
