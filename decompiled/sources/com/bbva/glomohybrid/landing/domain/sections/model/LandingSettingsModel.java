package com.bbva.glomohybrid.landing.domain.sections.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingSettingsModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019B%\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingSettingsModel;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceSettingsModel;", "component1", "eCommerce", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceSettingsModel;", "getECommerce", "()Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceSettingsModel;", "<init>", "(Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceSettingsModel;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceSettingsModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class LandingSettingsModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LandingECommerceSettingsModel eCommerce;

    /* JADX INFO: compiled from: LandingSettingsModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingSettingsModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingSettingsModel;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<LandingSettingsModel> serializer() {
            return LandingSettingsModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LandingSettingsModel() {
        this((LandingECommerceSettingsModel) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ LandingSettingsModel copy$default(LandingSettingsModel landingSettingsModel, LandingECommerceSettingsModel landingECommerceSettingsModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            landingECommerceSettingsModel = landingSettingsModel.eCommerce;
        }
        return landingSettingsModel.copy(landingECommerceSettingsModel);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(LandingSettingsModel self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && Intrinsics.areEqual(self.eCommerce, new LandingECommerceSettingsModel((Boolean) null, false, false, 7, (DefaultConstructorMarker) null))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 0, LandingECommerceSettingsModel$$serializer.INSTANCE, self.eCommerce);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LandingECommerceSettingsModel getECommerce() {
        return this.eCommerce;
    }

    @NotNull
    public final LandingSettingsModel copy(@NotNull LandingECommerceSettingsModel eCommerce) {
        Intrinsics.checkNotNullParameter(eCommerce, "eCommerce");
        return new LandingSettingsModel(eCommerce);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LandingSettingsModel) && Intrinsics.areEqual(this.eCommerce, ((LandingSettingsModel) other).eCommerce);
    }

    @NotNull
    public final LandingECommerceSettingsModel getECommerce() {
        return this.eCommerce;
    }

    public int hashCode() {
        return this.eCommerce.hashCode();
    }

    @NotNull
    public String toString() {
        return "LandingSettingsModel(eCommerce=" + this.eCommerce + ")";
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ LandingSettingsModel(int i10, LandingECommerceSettingsModel landingECommerceSettingsModel, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.eCommerce = new LandingECommerceSettingsModel((Boolean) null, false, false, 7, (DefaultConstructorMarker) null);
        } else {
            this.eCommerce = landingECommerceSettingsModel;
        }
    }

    public LandingSettingsModel(@NotNull LandingECommerceSettingsModel eCommerce) {
        Intrinsics.checkNotNullParameter(eCommerce, "eCommerce");
        this.eCommerce = eCommerce;
    }

    public /* synthetic */ LandingSettingsModel(LandingECommerceSettingsModel landingECommerceSettingsModel, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LandingECommerceSettingsModel((Boolean) null, false, false, 7, (DefaultConstructorMarker) null) : landingECommerceSettingsModel);
    }
}
