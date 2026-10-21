package com.bbva.glomohybrid.landing.domain.sections.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
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

/* JADX INFO: compiled from: LandingECommerceCardsModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B#\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001f\u0010 B9\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0012\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006'"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceCardModel;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "id", GoogleTapAndPay.KEY_PAN, AuthConstants.IMAGE, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getPan", "c", "getImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class LandingECommerceCardModel {

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

    /* JADX INFO: compiled from: LandingECommerceCardsModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceCardModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceCardModel;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<LandingECommerceCardModel> serializer() {
            return LandingECommerceCardModel$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ LandingECommerceCardModel(int i10, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, LandingECommerceCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.pan = str2;
        if ((i10 & 4) == 0) {
            this.image = null;
        } else {
            this.image = str3;
        }
    }

    public static /* synthetic */ LandingECommerceCardModel copy$default(LandingECommerceCardModel landingECommerceCardModel, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = landingECommerceCardModel.id;
        }
        if ((i10 & 2) != 0) {
            str2 = landingECommerceCardModel.pan;
        }
        if ((i10 & 4) != 0) {
            str3 = landingECommerceCardModel.image;
        }
        return landingECommerceCardModel.copy(str, str2, str3);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(LandingECommerceCardModel self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.pan);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 2);
        String str = self.image;
        if (!zShouldEncodeElementDefault && str == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
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

    @NotNull
    public final LandingECommerceCardModel copy(@NotNull String id, @NotNull String pan, @Nullable String image) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(pan, "pan");
        return new LandingECommerceCardModel(id, pan, image);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingECommerceCardModel)) {
            return false;
        }
        LandingECommerceCardModel landingECommerceCardModel = (LandingECommerceCardModel) other;
        return Intrinsics.areEqual(this.id, landingECommerceCardModel.id) && Intrinsics.areEqual(this.pan, landingECommerceCardModel.pan) && Intrinsics.areEqual(this.image, landingECommerceCardModel.image);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getPan() {
        return this.pan;
    }

    public int hashCode() {
        int iC = n1.c(this.pan, this.id.hashCode() * 31, 31);
        String str = this.image;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LandingECommerceCardModel(id=");
        sb2.append(this.id);
        sb2.append(", pan=");
        sb2.append(this.pan);
        sb2.append(", image=");
        return d.f(sb2, this.image, ")");
    }

    public LandingECommerceCardModel(@NotNull String id, @NotNull String pan, @Nullable String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(pan, "pan");
        this.id = id;
        this.pan = pan;
        this.image = str;
    }

    public /* synthetic */ LandingECommerceCardModel(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3);
    }
}
