package com.veridas.lib.entities.resources;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.veridas.lib.entities.resources.bidicode.BidiCode;
import com.veridas.lib.entities.resources.bidicode.BidiCode$$serializer;
import com.veridas.lib.entities.resources.mrz.Mrz;
import com.veridas.lib.entities.resources.mrz.Mrz$$serializer;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DocumentFace.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002XWBc\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\bQ\u0010RB}\b\u0011\u0012\u0006\u0010S\u001a\u00020\u001d\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010U\u001a\u0004\u0018\u00010T¢\u0006\u0004\bQ\u0010VJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003Ji\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00022\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001dHÖ\u0001J\u0013\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J(\u0010)\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$HÁ\u0001¢\u0006\u0004\b'\u0010(R \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010/\u001a\u0004\b2\u00103R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010/\u001a\u0004\b7\u00108R\"\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010/\u001a\u0004\b<\u0010=R\"\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010@\u0012\u0004\bC\u0010/\u001a\u0004\bA\u0010BR \u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u00101\u0012\u0004\bF\u0010/\u001a\u0004\bE\u00103R(\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bG\u0010H\u0012\u0004\bK\u0010/\u001a\u0004\bI\u0010JR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bL\u0010M\u0012\u0004\bP\u0010/\u001a\u0004\bN\u0010O¨\u0006Y"}, d2 = {"Lcom/veridas/lib/entities/resources/DocumentFace;", "", "", "isIntelligent", "Lcom/veridas/lib/entities/resources/Side;", "component1", "component2", "Lcom/veridas/lib/entities/resources/PersonFace;", "component3", "", "component4", "Lcom/veridas/lib/entities/resources/mrz/Mrz;", "component5", "component6", "", "Lcom/veridas/lib/entities/resources/bidicode/BidiCode;", "component7", "Lcom/veridas/lib/entities/resources/DetectionParameters;", "component8", "side", "mandatory", "personFace", "stencilName", "mrz", "flash", "bidiCodes", "detectionParameters", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$common_core_jvm", "(Lcom/veridas/lib/entities/resources/DocumentFace;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "a", "Lcom/veridas/lib/entities/resources/Side;", "getSide", "()Lcom/veridas/lib/entities/resources/Side;", "getSide$annotations", "()V", "b", "Z", "getMandatory", "()Z", "getMandatory$annotations", "c", "Lcom/veridas/lib/entities/resources/PersonFace;", "getPersonFace", "()Lcom/veridas/lib/entities/resources/PersonFace;", "getPersonFace$annotations", "d", "Ljava/lang/String;", "getStencilName", "()Ljava/lang/String;", "getStencilName$annotations", "e", "Lcom/veridas/lib/entities/resources/mrz/Mrz;", "getMrz", "()Lcom/veridas/lib/entities/resources/mrz/Mrz;", "getMrz$annotations", "f", "getFlash", "getFlash$annotations", "g", "Ljava/util/List;", "getBidiCodes", "()Ljava/util/List;", "getBidiCodes$annotations", "h", "Lcom/veridas/lib/entities/resources/DetectionParameters;", "getDetectionParameters", "()Lcom/veridas/lib/entities/resources/DetectionParameters;", "getDetectionParameters$annotations", "<init>", "(Lcom/veridas/lib/entities/resources/Side;ZLcom/veridas/lib/entities/resources/PersonFace;Ljava/lang/String;Lcom/veridas/lib/entities/resources/mrz/Mrz;ZLjava/util/List;Lcom/veridas/lib/entities/resources/DetectionParameters;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/veridas/lib/entities/resources/Side;ZLcom/veridas/lib/entities/resources/PersonFace;Ljava/lang/String;Lcom/veridas/lib/entities/resources/mrz/Mrz;ZLjava/util/List;Lcom/veridas/lib/entities/resources/DetectionParameters;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "common-core-jvm"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class DocumentFace {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final KSerializer<Object>[] f67188i = {Side.INSTANCE.serializer(), null, null, null, null, null, new ArrayListSerializer(BidiCode$$serializer.INSTANCE), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Side side;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean mandatory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PersonFace personFace;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String stencilName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Mrz mrz;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean flash;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<BidiCode> bidiCodes;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final DetectionParameters detectionParameters;

    /* JADX INFO: compiled from: DocumentFace.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/veridas/lib/entities/resources/DocumentFace$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/veridas/lib/entities/resources/DocumentFace;", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<DocumentFace> serializer() {
            return DocumentFace$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DocumentFace(int i10, @SerialName("s") Side side, @SerialName("m") boolean z10, @SerialName("p") PersonFace personFace, @SerialName("t") String str, @SerialName("z") Mrz mrz, @SerialName("f") boolean z11, @SerialName("b") List list, @SerialName("d") DetectionParameters detectionParameters, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, DocumentFace$$serializer.INSTANCE.getDescriptor());
        }
        this.side = side;
        this.mandatory = z10;
        if ((i10 & 4) == 0) {
            this.personFace = null;
        } else {
            this.personFace = personFace;
        }
        if ((i10 & 8) == 0) {
            this.stencilName = null;
        } else {
            this.stencilName = str;
        }
        if ((i10 & 16) == 0) {
            this.mrz = null;
        } else {
            this.mrz = mrz;
        }
        if ((i10 & 32) == 0) {
            this.flash = false;
        } else {
            this.flash = z11;
        }
        if ((i10 & 64) == 0) {
            this.bidiCodes = null;
        } else {
            this.bidiCodes = list;
        }
        if ((i10 & 128) == 0) {
            this.detectionParameters = null;
        } else {
            this.detectionParameters = detectionParameters;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$common_core_jvm(DocumentFace self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = f67188i;
        output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.side);
        output.encodeBooleanElement(serialDesc, 1, self.mandatory);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 2);
        PersonFace personFace = self.personFace;
        if (zShouldEncodeElementDefault || personFace != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, PersonFace$$serializer.INSTANCE, personFace);
        }
        boolean zShouldEncodeElementDefault2 = output.shouldEncodeElementDefault(serialDesc, 3);
        String str = self.stencilName;
        if (zShouldEncodeElementDefault2 || str != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
        }
        boolean zShouldEncodeElementDefault3 = output.shouldEncodeElementDefault(serialDesc, 4);
        Mrz mrz = self.mrz;
        if (zShouldEncodeElementDefault3 || mrz != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, Mrz$$serializer.INSTANCE, mrz);
        }
        boolean zShouldEncodeElementDefault4 = output.shouldEncodeElementDefault(serialDesc, 5);
        boolean z10 = self.flash;
        if (zShouldEncodeElementDefault4 || z10) {
            output.encodeBooleanElement(serialDesc, 5, z10);
        }
        boolean zShouldEncodeElementDefault5 = output.shouldEncodeElementDefault(serialDesc, 6);
        List<BidiCode> list = self.bidiCodes;
        if (zShouldEncodeElementDefault5 || list != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, kSerializerArr[6], list);
        }
        boolean zShouldEncodeElementDefault6 = output.shouldEncodeElementDefault(serialDesc, 7);
        DetectionParameters detectionParameters = self.detectionParameters;
        if (!zShouldEncodeElementDefault6 && detectionParameters == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, DetectionParameters$$serializer.INSTANCE, detectionParameters);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Side getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getMandatory() {
        return this.mandatory;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PersonFace getPersonFace() {
        return this.personFace;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStencilName() {
        return this.stencilName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Mrz getMrz() {
        return this.mrz;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getFlash() {
        return this.flash;
    }

    @Nullable
    public final List<BidiCode> component7() {
        return this.bidiCodes;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DetectionParameters getDetectionParameters() {
        return this.detectionParameters;
    }

    @NotNull
    public final DocumentFace copy(@NotNull Side side, boolean mandatory, @Nullable PersonFace personFace, @Nullable String stencilName, @Nullable Mrz mrz, boolean flash, @Nullable List<BidiCode> bidiCodes, @Nullable DetectionParameters detectionParameters) {
        Intrinsics.checkNotNullParameter(side, "side");
        return new DocumentFace(side, mandatory, personFace, stencilName, mrz, flash, bidiCodes, detectionParameters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentFace)) {
            return false;
        }
        DocumentFace documentFace = (DocumentFace) other;
        return this.side == documentFace.side && this.mandatory == documentFace.mandatory && Intrinsics.areEqual(this.personFace, documentFace.personFace) && Intrinsics.areEqual(this.stencilName, documentFace.stencilName) && Intrinsics.areEqual(this.mrz, documentFace.mrz) && this.flash == documentFace.flash && Intrinsics.areEqual(this.bidiCodes, documentFace.bidiCodes) && Intrinsics.areEqual(this.detectionParameters, documentFace.detectionParameters);
    }

    @Nullable
    public final List<BidiCode> getBidiCodes() {
        return this.bidiCodes;
    }

    @Nullable
    public final DetectionParameters getDetectionParameters() {
        return this.detectionParameters;
    }

    public final boolean getFlash() {
        return this.flash;
    }

    public final boolean getMandatory() {
        return this.mandatory;
    }

    @Nullable
    public final Mrz getMrz() {
        return this.mrz;
    }

    @Nullable
    public final PersonFace getPersonFace() {
        return this.personFace;
    }

    @NotNull
    public final Side getSide() {
        return this.side;
    }

    @Nullable
    public final String getStencilName() {
        return this.stencilName;
    }

    public int hashCode() {
        int iHashCode = ((this.side.hashCode() * 31) + (this.mandatory ? 1231 : 1237)) * 31;
        PersonFace personFace = this.personFace;
        int iHashCode2 = (iHashCode + (personFace == null ? 0 : personFace.hashCode())) * 31;
        String str = this.stencilName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Mrz mrz = this.mrz;
        int iHashCode4 = (((iHashCode3 + (mrz == null ? 0 : mrz.hashCode())) * 31) + (this.flash ? 1231 : 1237)) * 31;
        List<BidiCode> list = this.bidiCodes;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        DetectionParameters detectionParameters = this.detectionParameters;
        return iHashCode5 + (detectionParameters != null ? detectionParameters.hashCode() : 0);
    }

    public final boolean isIntelligent() {
        DetectionParameters detectionParameters = this.detectionParameters;
        return (detectionParameters == null || detectionParameters.getRectangles()) ? false : true;
    }

    @NotNull
    public String toString() {
        return "DocumentFace(side=" + this.side + ", mandatory=" + this.mandatory + ", personFace=" + this.personFace + ", stencilName=" + this.stencilName + ", mrz=" + this.mrz + ", flash=" + this.flash + ", bidiCodes=" + this.bidiCodes + ", detectionParameters=" + this.detectionParameters + ")";
    }

    public DocumentFace(@NotNull Side side, boolean z10, @Nullable PersonFace personFace, @Nullable String str, @Nullable Mrz mrz, boolean z11, @Nullable List<BidiCode> list, @Nullable DetectionParameters detectionParameters) {
        Intrinsics.checkNotNullParameter(side, "side");
        this.side = side;
        this.mandatory = z10;
        this.personFace = personFace;
        this.stencilName = str;
        this.mrz = mrz;
        this.flash = z11;
        this.bidiCodes = list;
        this.detectionParameters = detectionParameters;
    }

    public /* synthetic */ DocumentFace(Side side, boolean z10, PersonFace personFace, String str, Mrz mrz, boolean z11, List list, DetectionParameters detectionParameters, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(side, z10, (i10 & 4) != 0 ? null : personFace, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : mrz, (i10 & 32) != 0 ? false : z11, (i10 & 64) != 0 ? null : list, (i10 & 128) != 0 ? null : detectionParameters);
    }

    @SerialName("b")
    public static /* synthetic */ void getBidiCodes$annotations() {
    }

    @SerialName("d")
    public static /* synthetic */ void getDetectionParameters$annotations() {
    }

    @SerialName("f")
    public static /* synthetic */ void getFlash$annotations() {
    }

    @SerialName("m")
    public static /* synthetic */ void getMandatory$annotations() {
    }

    @SerialName("z")
    public static /* synthetic */ void getMrz$annotations() {
    }

    @SerialName("p")
    public static /* synthetic */ void getPersonFace$annotations() {
    }

    @SerialName("s")
    public static /* synthetic */ void getSide$annotations() {
    }

    @SerialName("t")
    public static /* synthetic */ void getStencilName$annotations() {
    }
}
