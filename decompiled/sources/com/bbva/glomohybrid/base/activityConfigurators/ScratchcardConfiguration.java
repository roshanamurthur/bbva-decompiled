package com.bbva.glomohybrid.base.activityConfigurators;

import ad.d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScratchcardConfiguration.kt */
/* JADX INFO: loaded from: classes5.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002FGBq\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012Bc\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0002\u0010\u0013J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003Jl\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u00103J\t\u00104\u001a\u00020\u0003HÖ\u0001J\u0013\u00105\u001a\u00020\b2\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\u0006\u00108\u001a\u00020\u0005J\t\u00109\u001a\u00020\u0003HÖ\u0001J\t\u0010:\u001a\u00020\u0005HÖ\u0001J!\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AHÇ\u0001J\u0019\u0010B\u001a\u00020<2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R!\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018¨\u0006H"}, d2 = {"Lcom/bbva/glomohybrid/base/activityConfigurators/ScratchcardConfiguration;", "Landroid/os/Parcelable;", "seen1", "", "titleModal", "", "titleScreen", "status", "", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "currency", PushConstants.AMOUNT, "", "textButton", "titleButton", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrency", "()Ljava/lang/String;", "formatter", "Ljava/text/DecimalFormat;", "getFormatter$annotations", "()V", "getFormatter", "()Ljava/text/DecimalFormat;", "formatter$delegate", "Lkotlin/Lazy;", "getStatus", "()Z", "getSubtitle", "getTextButton", "getTitle", "getTitleButton", "getTitleModal", "getTitleScreen", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/bbva/glomohybrid/base/activityConfigurators/ScratchcardConfiguration;", "describeContents", "equals", "other", "", "getFormattedCurrency", GenerateActivationFormCommand.HASH_CODE, "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
public final /* data */ class ScratchcardConfiguration implements Parcelable {

    @NotNull
    public static final String SCRATCHCARD_CONFIG_KEY = "SCRATCHCARD_CONFIG_KEY";

    @Nullable
    private final Double amount;

    @Nullable
    private final String currency;

    /* JADX INFO: renamed from: formatter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy formatter;
    private final boolean status;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String textButton;

    @NotNull
    private final String title;

    @NotNull
    private final String titleButton;

    @NotNull
    private final String titleModal;

    @NotNull
    private final String titleScreen;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ScratchcardConfiguration> CREATOR = new Creator();

    /* JADX INFO: compiled from: ScratchcardConfiguration.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nHÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/activityConfigurators/ScratchcardConfiguration$Companion;", "", "()V", ScratchcardConfiguration.SCRATCHCARD_CONFIG_KEY, "", "from", "Lcom/bbva/glomohybrid/base/activityConfigurators/ScratchcardConfiguration;", "bundle", "Landroid/os/Bundle;", "serializer", "Lkotlinx/serialization/KSerializer;", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ScratchcardConfiguration from(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String string = bundle.getString("titleModal", "");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = bundle.getString("titleScreen", "");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            boolean z10 = bundle.getBoolean("status", false);
            String string3 = bundle.getString("title", "");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = bundle.getString(NotificationMessage.NOTIF_KEY_SUB_TITLE, "");
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            String string5 = bundle.getString("currency");
            Double dValueOf = Double.valueOf(bundle.getDouble(PushConstants.AMOUNT));
            String string6 = bundle.getString("textButton", "");
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            String string7 = bundle.getString("titleButton", "");
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            return new ScratchcardConfiguration(string, string2, z10, string3, string4, string5, dValueOf, string6, string7);
        }

        @NotNull
        public final KSerializer<ScratchcardConfiguration> serializer() {
            return ScratchcardConfiguration$$serializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ScratchcardConfiguration.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ScratchcardConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ScratchcardConfiguration createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScratchcardConfiguration(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ScratchcardConfiguration[] newArray(int i10) {
            return new ScratchcardConfiguration[i10];
        }
    }

    /* JADX INFO: compiled from: ScratchcardConfiguration.kt */
    public static final class a extends Lambda implements Function0<DecimalFormat> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f31042p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final DecimalFormat invoke() {
            return new DecimalFormat("#,###", new DecimalFormatSymbols(new Locale("es")));
        }
    }

    public ScratchcardConfiguration() {
        this((String) null, (String) null, false, (String) null, (String) null, (String) null, (Double) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
    }

    private final DecimalFormat getFormatter() {
        return (DecimalFormat) this.formatter.getValue();
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(ScratchcardConfiguration self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.titleModal, "")) {
            output.encodeStringElement(serialDesc, 0, self.titleModal);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.titleScreen, "")) {
            output.encodeStringElement(serialDesc, 1, self.titleScreen);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.status) {
            output.encodeBooleanElement(serialDesc, 2, self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.title, "")) {
            output.encodeStringElement(serialDesc, 3, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual(self.subtitle, "")) {
            output.encodeStringElement(serialDesc, 4, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.currency != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.currency);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.amount != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, DoubleSerializer.INSTANCE, self.amount);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !Intrinsics.areEqual(self.textButton, "")) {
            output.encodeStringElement(serialDesc, 7, self.textButton);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && Intrinsics.areEqual(self.titleButton, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 8, self.titleButton);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleModal() {
        return this.titleModal;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleScreen() {
        return this.titleScreen;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTextButton() {
        return this.textButton;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTitleButton() {
        return this.titleButton;
    }

    @NotNull
    public final ScratchcardConfiguration copy(@NotNull String titleModal, @NotNull String titleScreen, boolean status, @NotNull String title, @NotNull String subtitle, @Nullable String currency, @Nullable Double amount, @NotNull String textButton, @NotNull String titleButton) {
        Intrinsics.checkNotNullParameter(titleModal, "titleModal");
        Intrinsics.checkNotNullParameter(titleScreen, "titleScreen");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(textButton, "textButton");
        Intrinsics.checkNotNullParameter(titleButton, "titleButton");
        return new ScratchcardConfiguration(titleModal, titleScreen, status, title, subtitle, currency, amount, textButton, titleButton);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScratchcardConfiguration)) {
            return false;
        }
        ScratchcardConfiguration scratchcardConfiguration = (ScratchcardConfiguration) other;
        return Intrinsics.areEqual(this.titleModal, scratchcardConfiguration.titleModal) && Intrinsics.areEqual(this.titleScreen, scratchcardConfiguration.titleScreen) && this.status == scratchcardConfiguration.status && Intrinsics.areEqual(this.title, scratchcardConfiguration.title) && Intrinsics.areEqual(this.subtitle, scratchcardConfiguration.subtitle) && Intrinsics.areEqual(this.currency, scratchcardConfiguration.currency) && Intrinsics.areEqual((Object) this.amount, (Object) scratchcardConfiguration.amount) && Intrinsics.areEqual(this.textButton, scratchcardConfiguration.textButton) && Intrinsics.areEqual(this.titleButton, scratchcardConfiguration.titleButton);
    }

    @Nullable
    public final Double getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getFormattedCurrency() {
        String str;
        Double d2 = this.amount;
        if (d2 != null) {
            try {
                str = getFormatter().format(d2.doubleValue());
            } catch (Exception unused) {
                str = "";
            }
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    public final boolean getStatus() {
        return this.status;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTextButton() {
        return this.textButton;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getTitleButton() {
        return this.titleButton;
    }

    @NotNull
    public final String getTitleModal() {
        return this.titleModal;
    }

    @NotNull
    public final String getTitleScreen() {
        return this.titleScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    public int hashCode() {
        int iC = n1.c(this.titleScreen, this.titleModal.hashCode() * 31, 31);
        boolean z10 = this.status;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int iC2 = n1.c(this.subtitle, n1.c(this.title, (iC + r3) * 31, 31), 31);
        String str = this.currency;
        int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.amount;
        return this.titleButton.hashCode() + n1.c(this.textButton, (iHashCode + (d2 != null ? d2.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.titleModal;
        String str2 = this.titleScreen;
        boolean z10 = this.status;
        String str3 = this.title;
        String str4 = this.subtitle;
        String str5 = this.currency;
        Double d2 = this.amount;
        String str6 = this.textButton;
        String str7 = this.titleButton;
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("ScratchcardConfiguration(titleModal=", str, ", titleScreen=", str2, ", status=");
        sbC.append(z10);
        sbC.append(", title=");
        sbC.append(str3);
        sbC.append(", subtitle=");
        k.e(sbC, str4, ", currency=", str5, ", amount=");
        sbC.append(d2);
        sbC.append(", textButton=");
        sbC.append(str6);
        sbC.append(", titleButton=");
        return d.f(sbC, str7, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.titleModal);
        parcel.writeString(this.titleScreen);
        parcel.writeInt(this.status ? 1 : 0);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.currency);
        Double d2 = this.amount;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        parcel.writeString(this.textButton);
        parcel.writeString(this.titleButton);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ScratchcardConfiguration(int i10, String str, String str2, boolean z10, String str3, String str4, String str5, Double d2, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.titleModal = "";
        } else {
            this.titleModal = str;
        }
        if ((i10 & 2) == 0) {
            this.titleScreen = "";
        } else {
            this.titleScreen = str2;
        }
        if ((i10 & 4) == 0) {
            this.status = false;
        } else {
            this.status = z10;
        }
        if ((i10 & 8) == 0) {
            this.title = "";
        } else {
            this.title = str3;
        }
        if ((i10 & 16) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str4;
        }
        if ((i10 & 32) == 0) {
            this.currency = null;
        } else {
            this.currency = str5;
        }
        if ((i10 & 64) == 0) {
            this.amount = null;
        } else {
            this.amount = d2;
        }
        if ((i10 & 128) == 0) {
            this.textButton = "";
        } else {
            this.textButton = str6;
        }
        if ((i10 & 256) == 0) {
            this.titleButton = "";
        } else {
            this.titleButton = str7;
        }
        this.formatter = LazyKt__LazyJVMKt.lazy(a.f31042p0);
    }

    public ScratchcardConfiguration(@NotNull String titleModal, @NotNull String titleScreen, boolean z10, @NotNull String title, @NotNull String subtitle, @Nullable String str, @Nullable Double d2, @NotNull String textButton, @NotNull String titleButton) {
        Intrinsics.checkNotNullParameter(titleModal, "titleModal");
        Intrinsics.checkNotNullParameter(titleScreen, "titleScreen");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(textButton, "textButton");
        Intrinsics.checkNotNullParameter(titleButton, "titleButton");
        this.titleModal = titleModal;
        this.titleScreen = titleScreen;
        this.status = z10;
        this.title = title;
        this.subtitle = subtitle;
        this.currency = str;
        this.amount = d2;
        this.textButton = textButton;
        this.titleButton = titleButton;
        this.formatter = LazyKt__LazyJVMKt.lazy(a.f31042p0);
    }

    public /* synthetic */ ScratchcardConfiguration(String str, String str2, boolean z10, String str3, String str4, String str5, Double d2, String str6, String str7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? "" : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) == 0 ? d2 : null, (i10 & 128) != 0 ? "" : str6, (i10 & 256) == 0 ? str7 : "");
    }

    private static /* synthetic */ void getFormatter$annotations() {
    }
}
