package com.bbva.component.ui.carousel.cards.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.google.firebase.dynamiclinks.DynamicLink;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CarouselCardItem.kt */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B3\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b'\u0010(BM\b\u0017\u0012\u0006\u0010)\u001a\u00020\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b'\u0010,J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\tHÆ\u0001J\t\u0010\u0015\u001a\u00020\tHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001e¨\u0006/"}, d2 = {"Lcom/bbva/component/ui/carousel/cards/model/CarouselCardItem;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "id", GoogleTapAndPay.KEY_PAN, AuthConstants.IMAGE, DynamicLink.Builder.KEY_LINK, "accessibilityLabel", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getPan", "c", "getImage", "d", "getLink", "e", "getAccessibilityLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0})
@Serializable
public final /* data */ class CarouselCardItem {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String pan;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String image;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String link;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String accessibilityLabel;

    /* JADX INFO: compiled from: CarouselCardItem.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/carousel/cards/model/CarouselCardItem$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/carousel/cards/model/CarouselCardItem;", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<CarouselCardItem> serializer() {
            return CarouselCardItem$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ CarouselCardItem(int i10, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i10 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 31, CarouselCardItem$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.pan = str2;
        this.image = str3;
        this.link = str4;
        this.accessibilityLabel = str5;
    }

    public static /* synthetic */ CarouselCardItem copy$default(CarouselCardItem carouselCardItem, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = carouselCardItem.id;
        }
        if ((i10 & 2) != 0) {
            str2 = carouselCardItem.pan;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = carouselCardItem.image;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = carouselCardItem.link;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = carouselCardItem.accessibilityLabel;
        }
        return carouselCardItem.copy(str, str6, str7, str8, str5);
    }

    @JvmStatic
    public static final void write$Self(@NotNull CarouselCardItem self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.pan);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.image);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.link);
        output.encodeStringElement(serialDesc, 4, self.accessibilityLabel);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPan() {
        return this.pan;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    @NotNull
    public final CarouselCardItem copy(@NotNull String id, @NotNull String pan, @Nullable String image, @Nullable String link, @NotNull String accessibilityLabel) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(pan, "pan");
        Intrinsics.checkNotNullParameter(accessibilityLabel, "accessibilityLabel");
        return new CarouselCardItem(id, pan, image, link, accessibilityLabel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselCardItem)) {
            return false;
        }
        CarouselCardItem carouselCardItem = (CarouselCardItem) other;
        return Intrinsics.areEqual(this.id, carouselCardItem.id) && Intrinsics.areEqual(this.pan, carouselCardItem.pan) && Intrinsics.areEqual(this.image, carouselCardItem.image) && Intrinsics.areEqual(this.link, carouselCardItem.link) && Intrinsics.areEqual(this.accessibilityLabel, carouselCardItem.accessibilityLabel);
    }

    @NotNull
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getPan() {
        return this.pan;
    }

    public int hashCode() {
        int iC = n1.c(this.pan, this.id.hashCode() * 31, 31);
        String str = this.image;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.link;
        return this.accessibilityLabel.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CarouselCardItem(id=");
        sb2.append(this.id);
        sb2.append(", pan=");
        sb2.append(this.pan);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", link=");
        sb2.append(this.link);
        sb2.append(", accessibilityLabel=");
        return d.f(sb2, this.accessibilityLabel, ")");
    }

    public CarouselCardItem(@NotNull String id, @NotNull String pan, @Nullable String str, @Nullable String str2, @NotNull String accessibilityLabel) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(pan, "pan");
        Intrinsics.checkNotNullParameter(accessibilityLabel, "accessibilityLabel");
        this.id = id;
        this.pan = pan;
        this.image = str;
        this.link = str2;
        this.accessibilityLabel = accessibilityLabel;
    }
}
