package com.bbva.glomohybrid.landing.domain.sections.model;

import androidx.appcompat.app.i;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingSettingsModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B'\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b \u0010!B5\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0015\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J0\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u000f\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u001d¨\u0006("}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceSettingsModel;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "isActive", "isActiveByDefault", "hasCards", "copy", "(Ljava/lang/Boolean;ZZ)Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceSettingsModel;", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/Boolean;", "b", "Z", "()Z", "c", "getHasCards", "<init>", "(Ljava/lang/Boolean;ZZ)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class LandingECommerceSettingsModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Boolean isActive;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean isActiveByDefault;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean hasCards;

    /* JADX INFO: compiled from: LandingSettingsModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceSettingsModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceSettingsModel;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<LandingECommerceSettingsModel> serializer() {
            return LandingECommerceSettingsModel$$serializer.INSTANCE;
        }
    }

    public LandingECommerceSettingsModel() {
        this((Boolean) null, false, false, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LandingECommerceSettingsModel copy$default(LandingECommerceSettingsModel landingECommerceSettingsModel, Boolean bool, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = landingECommerceSettingsModel.isActive;
        }
        if ((i10 & 2) != 0) {
            z10 = landingECommerceSettingsModel.isActiveByDefault;
        }
        if ((i10 & 4) != 0) {
            z11 = landingECommerceSettingsModel.hasCards;
        }
        return landingECommerceSettingsModel.copy(bool, z10, z11);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(LandingECommerceSettingsModel self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.isActive != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.isActive);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.isActiveByDefault) {
            output.encodeBooleanElement(serialDesc, 1, self.isActiveByDefault);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.hasCards) {
            output.encodeBooleanElement(serialDesc, 2, self.hasCards);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsActiveByDefault() {
        return this.isActiveByDefault;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasCards() {
        return this.hasCards;
    }

    @NotNull
    public final LandingECommerceSettingsModel copy(@Nullable Boolean isActive, boolean isActiveByDefault, boolean hasCards) {
        return new LandingECommerceSettingsModel(isActive, isActiveByDefault, hasCards);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingECommerceSettingsModel)) {
            return false;
        }
        LandingECommerceSettingsModel landingECommerceSettingsModel = (LandingECommerceSettingsModel) other;
        return Intrinsics.areEqual(this.isActive, landingECommerceSettingsModel.isActive) && this.isActiveByDefault == landingECommerceSettingsModel.isActiveByDefault && this.hasCards == landingECommerceSettingsModel.hasCards;
    }

    public final boolean getHasCards() {
        return this.hasCards;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        Boolean bool = this.isActive;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        boolean z10 = this.isActiveByDefault;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int i10 = (iHashCode + r3) * 31;
        boolean z11 = this.hasCards;
        return i10 + (z11 ? 1 : z11);
    }

    @Nullable
    public final Boolean isActive() {
        return this.isActive;
    }

    public final boolean isActiveByDefault() {
        return this.isActiveByDefault;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LandingECommerceSettingsModel(isActive=");
        sb2.append(this.isActive);
        sb2.append(", isActiveByDefault=");
        sb2.append(this.isActiveByDefault);
        sb2.append(", hasCards=");
        return i.c(sb2, this.hasCards, ")");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ LandingECommerceSettingsModel(int i10, Boolean bool, boolean z10, boolean z11, SerializationConstructorMarker serializationConstructorMarker) {
        this.isActive = (i10 & 1) == 0 ? null : bool;
        if ((i10 & 2) == 0) {
            this.isActiveByDefault = false;
        } else {
            this.isActiveByDefault = z10;
        }
        if ((i10 & 4) == 0) {
            this.hasCards = false;
        } else {
            this.hasCards = z11;
        }
    }

    public LandingECommerceSettingsModel(@Nullable Boolean bool, boolean z10, boolean z11) {
        this.isActive = bool;
        this.isActiveByDefault = z10;
        this.hasCards = z11;
    }

    public /* synthetic */ LandingECommerceSettingsModel(Boolean bool, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11);
    }
}
