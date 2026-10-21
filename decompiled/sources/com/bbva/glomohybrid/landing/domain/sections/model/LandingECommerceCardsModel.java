package com.bbva.glomohybrid.landing.domain.sections.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingECommerceCardsModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b%\u0010&B=\b\u0017\u0012\u0006\u0010'\u001a\u00020\f\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006-"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceCardsModel;", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingSection;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceCardModel;", "component1", "", "component2", FirebaseAnalytics.Param.ITEMS, "sectionPriority", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSectionPriority", "()I", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "<init>", "(Ljava/util/List;I)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class LandingECommerceCardsModel implements LandingSection {

    @NotNull
    public static final String ID = "e-commerce-module";

    @NotNull
    public static final String SECTION_TYPE = "cvv-card";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<LandingECommerceCardModel> items;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int sectionPriority;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final KSerializer<Object>[] f32750d = {new ArrayListSerializer(LandingECommerceCardModel$$serializer.INSTANCE), null, null};

    /* JADX INFO: compiled from: LandingECommerceCardsModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceCardsModel$Companion;", "", "()V", "ID", "", "SECTION_TYPE", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceCardsModel;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<LandingECommerceCardsModel> serializer() {
            return LandingECommerceCardsModel$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ LandingECommerceCardsModel(int i10, List list, int i11, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, LandingECommerceCardsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.items = list;
        this.sectionPriority = i11;
        if ((i10 & 4) == 0) {
            this.id = ID;
        } else {
            this.id = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LandingECommerceCardsModel copy$default(LandingECommerceCardsModel landingECommerceCardsModel, List list, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = landingECommerceCardsModel.items;
        }
        if ((i11 & 2) != 0) {
            i10 = landingECommerceCardsModel.sectionPriority;
        }
        return landingECommerceCardsModel.copy(list, i10);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(LandingECommerceCardsModel self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, f32750d[0], self.items);
        output.encodeIntElement(serialDesc, 1, self.getSectionPriority());
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && Intrinsics.areEqual(self.getId(), ID)) {
            return;
        }
        output.encodeStringElement(serialDesc, 2, self.getId());
    }

    @NotNull
    public final List<LandingECommerceCardModel> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSectionPriority() {
        return this.sectionPriority;
    }

    @NotNull
    public final LandingECommerceCardsModel copy(@NotNull List<LandingECommerceCardModel> items, int sectionPriority) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new LandingECommerceCardsModel(items, sectionPriority);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingECommerceCardsModel)) {
            return false;
        }
        LandingECommerceCardsModel landingECommerceCardsModel = (LandingECommerceCardsModel) other;
        return Intrinsics.areEqual(this.items, landingECommerceCardsModel.items) && this.sectionPriority == landingECommerceCardsModel.sectionPriority;
    }

    @Override // com.bbva.glomohybrid.landing.domain.sections.model.LandingSection
    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public final List<LandingECommerceCardModel> getItems() {
        return this.items;
    }

    @Override // com.bbva.glomohybrid.landing.domain.sections.model.LandingSection
    public int getSectionPriority() {
        return this.sectionPriority;
    }

    public int hashCode() {
        return (this.items.hashCode() * 31) + this.sectionPriority;
    }

    @NotNull
    public String toString() {
        return "LandingECommerceCardsModel(items=" + this.items + ", sectionPriority=" + this.sectionPriority + ")";
    }

    public LandingECommerceCardsModel(@NotNull List<LandingECommerceCardModel> items, int i10) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.sectionPriority = i10;
        this.id = ID;
    }
}
