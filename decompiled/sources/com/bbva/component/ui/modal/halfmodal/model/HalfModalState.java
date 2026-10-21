package com.bbva.component.ui.modal.halfmodal.model;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HalfModalState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBW\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b>\u0010?Bi\b\u0017\u0012\u0006\u0010@\u001a\u00020\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\b>\u0010CJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u0012\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0013HÆ\u0003Jh\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\rHÖ\u0001J\u0013\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0018\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0010R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010,R\u0017\u0010\u001b\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b6\u0010*\u001a\u0004\b7\u0010,R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;¨\u0006F"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/model/HalfModalState;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "Lcom/bbva/component/ui/modal/halfmodal/model/HalfModalType;", "component1", "", "component2", "", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "Lcom/bbva/component/ui/modal/halfmodal/model/ButtonConfig;", "component7", "component8", "type", "title", "actionIcon", AuthConstants.IMAGE, "legend", "message", "primaryButtonText", "secondaryButtonText", "copy", "(Lcom/bbva/component/ui/modal/halfmodal/model/HalfModalType;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/component/ui/modal/halfmodal/model/ButtonConfig;Lcom/bbva/component/ui/modal/halfmodal/model/ButtonConfig;)Lcom/bbva/component/ui/modal/halfmodal/model/HalfModalState;", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/component/ui/modal/halfmodal/model/HalfModalType;", "getType", "()Lcom/bbva/component/ui/modal/halfmodal/model/HalfModalType;", "b", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getActionIcon", "()I", "d", "Ljava/lang/Integer;", "getImage", "e", "getLegend", "f", "getMessage", "g", "Lcom/bbva/component/ui/modal/halfmodal/model/ButtonConfig;", "getPrimaryButtonText", "()Lcom/bbva/component/ui/modal/halfmodal/model/ButtonConfig;", "h", "getSecondaryButtonText", "<init>", "(Lcom/bbva/component/ui/modal/halfmodal/model/HalfModalType;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/component/ui/modal/halfmodal/model/ButtonConfig;Lcom/bbva/component/ui/modal/halfmodal/model/ButtonConfig;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/component/ui/modal/halfmodal/model/HalfModalType;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/component/ui/modal/halfmodal/model/ButtonConfig;Lcom/bbva/component/ui/modal/halfmodal/model/ButtonConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class HalfModalState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final KSerializer<Object>[] f28697i = {EnumsKt.createSimpleEnumSerializer("com.bbva.component.ui.modal.halfmodal.model.HalfModalType", HalfModalType.values()), null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HalfModalType type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int actionIcon;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer image;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String legend;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ButtonConfig primaryButtonText;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ButtonConfig secondaryButtonText;

    /* JADX INFO: compiled from: HalfModalState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/model/HalfModalState$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/modal/halfmodal/model/HalfModalState;", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<HalfModalState> serializer() {
            return HalfModalState$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ HalfModalState(int i10, HalfModalType halfModalType, String str, int i11, Integer num, String str2, String str3, ButtonConfig buttonConfig, ButtonConfig buttonConfig2, SerializationConstructorMarker serializationConstructorMarker) {
        if (39 != (i10 & 39)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 39, HalfModalState$$serializer.INSTANCE.getDescriptor());
        }
        this.type = halfModalType;
        this.title = str;
        this.actionIcon = i11;
        if ((i10 & 8) == 0) {
            this.image = null;
        } else {
            this.image = num;
        }
        if ((i10 & 16) == 0) {
            this.legend = null;
        } else {
            this.legend = str2;
        }
        this.message = str3;
        if ((i10 & 64) == 0) {
            this.primaryButtonText = null;
        } else {
            this.primaryButtonText = buttonConfig;
        }
        if ((i10 & 128) == 0) {
            this.secondaryButtonText = null;
        } else {
            this.secondaryButtonText = buttonConfig2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(HalfModalState self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, f28697i[0], self.type);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeIntElement(serialDesc, 2, self.actionIcon);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 3);
        Integer num = self.image;
        if (zShouldEncodeElementDefault || num != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, num);
        }
        boolean zShouldEncodeElementDefault2 = output.shouldEncodeElementDefault(serialDesc, 4);
        String str = self.legend;
        if (zShouldEncodeElementDefault2 || str != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str);
        }
        output.encodeStringElement(serialDesc, 5, self.message);
        boolean zShouldEncodeElementDefault3 = output.shouldEncodeElementDefault(serialDesc, 6);
        ButtonConfig buttonConfig = self.primaryButtonText;
        if (zShouldEncodeElementDefault3 || buttonConfig != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, ButtonConfig$$serializer.INSTANCE, buttonConfig);
        }
        boolean zShouldEncodeElementDefault4 = output.shouldEncodeElementDefault(serialDesc, 7);
        ButtonConfig buttonConfig2 = self.secondaryButtonText;
        if (!zShouldEncodeElementDefault4 && buttonConfig2 == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, ButtonConfig$$serializer.INSTANCE, buttonConfig2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HalfModalType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getActionIcon() {
        return this.actionIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getImage() {
        return this.image;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLegend() {
        return this.legend;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ButtonConfig getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ButtonConfig getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    @NotNull
    public final HalfModalState copy(@NotNull HalfModalType type, @NotNull String title, int actionIcon, @Nullable Integer image, @Nullable String legend, @NotNull String message, @Nullable ButtonConfig primaryButtonText, @Nullable ButtonConfig secondaryButtonText) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        return new HalfModalState(type, title, actionIcon, image, legend, message, primaryButtonText, secondaryButtonText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HalfModalState)) {
            return false;
        }
        HalfModalState halfModalState = (HalfModalState) other;
        return this.type == halfModalState.type && Intrinsics.areEqual(this.title, halfModalState.title) && this.actionIcon == halfModalState.actionIcon && Intrinsics.areEqual(this.image, halfModalState.image) && Intrinsics.areEqual(this.legend, halfModalState.legend) && Intrinsics.areEqual(this.message, halfModalState.message) && Intrinsics.areEqual(this.primaryButtonText, halfModalState.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, halfModalState.secondaryButtonText);
    }

    public final int getActionIcon() {
        return this.actionIcon;
    }

    @Nullable
    public final Integer getImage() {
        return this.image;
    }

    @Nullable
    public final String getLegend() {
        return this.legend;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final ButtonConfig getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    @Nullable
    public final ButtonConfig getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final HalfModalType getType() {
        return this.type;
    }

    public int hashCode() {
        int iC = (n1.c(this.title, this.type.hashCode() * 31, 31) + this.actionIcon) * 31;
        Integer num = this.image;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.legend;
        int iC2 = n1.c(this.message, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        ButtonConfig buttonConfig = this.primaryButtonText;
        int iHashCode2 = (iC2 + (buttonConfig == null ? 0 : buttonConfig.hashCode())) * 31;
        ButtonConfig buttonConfig2 = this.secondaryButtonText;
        return iHashCode2 + (buttonConfig2 != null ? buttonConfig2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HalfModalState(type=" + this.type + ", title=" + this.title + ", actionIcon=" + this.actionIcon + ", image=" + this.image + ", legend=" + this.legend + ", message=" + this.message + ", primaryButtonText=" + this.primaryButtonText + ", secondaryButtonText=" + this.secondaryButtonText + ")";
    }

    public HalfModalState(@NotNull HalfModalType type, @NotNull String title, int i10, @Nullable Integer num, @Nullable String str, @NotNull String message, @Nullable ButtonConfig buttonConfig, @Nullable ButtonConfig buttonConfig2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.type = type;
        this.title = title;
        this.actionIcon = i10;
        this.image = num;
        this.legend = str;
        this.message = message;
        this.primaryButtonText = buttonConfig;
        this.secondaryButtonText = buttonConfig2;
    }

    public /* synthetic */ HalfModalState(HalfModalType halfModalType, String str, int i10, Integer num, String str2, String str3, ButtonConfig buttonConfig, ButtonConfig buttonConfig2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(halfModalType, str, i10, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : str2, str3, (i11 & 64) != 0 ? null : buttonConfig, (i11 & 128) != 0 ? null : buttonConfig2);
    }
}
