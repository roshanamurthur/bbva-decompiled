package com.veridas.lib.entities.resources;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.android.gms.measurement.internal.a;
import com.veridas.vdlibraryimageprocessing.VDConstantDefinition;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
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

/* JADX INFO: compiled from: Document.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b&\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 V2\u00020\u0001:\u0002WVBU\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bP\u0010QBy\b\u0011\u0012\u0006\u0010R\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0013\u001a\u00020\t\u0012\b\b\u0001\u0010\u0014\u001a\u00020\t\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\b\u0010T\u001a\u0004\u0018\u00010S¢\u0006\u0004\bP\u0010UJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003Jc\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J(\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fHÁ\u0001¢\u0006\u0004\b\"\u0010#R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010*\u001a\u0004\b-\u0010.R \u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010*\u001a\u0004\b2\u00103R \u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00101\u0012\u0004\b7\u0010*\u001a\u0004\b6\u00103R \u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010*\u001a\u0004\b:\u0010;R \u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u00109\u0012\u0004\b?\u0010*\u001a\u0004\b>\u0010;R\"\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010*\u001a\u0004\bB\u0010CR\"\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010A\u0012\u0004\bG\u0010*\u001a\u0004\bF\u0010CR\u0011\u0010K\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010M\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bL\u0010(R\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\f0\u00048F¢\u0006\u0006\u001a\u0004\bN\u0010.¨\u0006X"}, d2 = {"Lcom/veridas/lib/entities/resources/Document;", "", "", "component1", "", "component2", "", "component3", "component4", "", "component5", "component6", "Lcom/veridas/lib/entities/resources/DocumentFace;", "component7", "component8", "id", "groupIds", "width", "height", "mustBePasseAlone", "hasNfc", "obverse", "reverse", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$common_core_jvm", "(Lcom/veridas/lib/entities/resources/Document;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "b", "Ljava/util/List;", "getGroupIds", "()Ljava/util/List;", "getGroupIds$annotations", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getWidth", "()I", "getWidth$annotations", "d", "getHeight", "getHeight$annotations", "e", "Z", "getMustBePasseAlone", "()Z", "getMustBePasseAlone$annotations", "f", "getHasNfc", "getHasNfc$annotations", "g", "Lcom/veridas/lib/entities/resources/DocumentFace;", "getObverse", "()Lcom/veridas/lib/entities/resources/DocumentFace;", "getObverse$annotations", "h", "getReverse", "getReverse$annotations", "", "getAspectRatio", "()D", "aspectRatio", "getCountryIsoCode", "countryIsoCode", "getDocumentFaces", "documentFaces", "<init>", "(Ljava/lang/String;Ljava/util/List;IIZZLcom/veridas/lib/entities/resources/DocumentFace;Lcom/veridas/lib/entities/resources/DocumentFace;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;IIZZLcom/veridas/lib/entities/resources/DocumentFace;Lcom/veridas/lib/entities/resources/DocumentFace;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "common-core-jvm"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class Document {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final KSerializer<Object>[] f67178i = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> groupIds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int width;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int height;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean mustBePasseAlone;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean hasNfc;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final DocumentFace obverse;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final DocumentFace reverse;

    /* JADX INFO: compiled from: Document.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/veridas/lib/entities/resources/Document$Companion;", "", "()V", "PASSPORT_ID", "", "isPassport", "", "documentId", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/veridas/lib/entities/resources/Document;", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean isPassport(@NotNull String documentId) {
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            return l.equals(documentId, VDConstantDefinition.PASSPORT, true);
        }

        @NotNull
        public final KSerializer<Document> serializer() {
            return Document$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Document(int i10, @SerialName("i") String str, @SerialName("g") List list, @SerialName("w") int i11, @SerialName("h") int i12, @SerialName("mbpa") boolean z10, @SerialName("n") boolean z11, @SerialName("o") DocumentFace documentFace, @SerialName("r") DocumentFace documentFace2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i10 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 63, Document$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.groupIds = list;
        this.width = i11;
        this.height = i12;
        this.mustBePasseAlone = z10;
        this.hasNfc = z11;
        if ((i10 & 64) == 0) {
            this.obverse = null;
        } else {
            this.obverse = documentFace;
        }
        if ((i10 & 128) == 0) {
            this.reverse = null;
        } else {
            this.reverse = documentFace2;
        }
    }

    @JvmStatic
    public static final boolean isPassport(@NotNull String str) {
        return INSTANCE.isPassport(str);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$common_core_jvm(Document self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, f67178i[1], self.groupIds);
        output.encodeIntElement(serialDesc, 2, self.width);
        output.encodeIntElement(serialDesc, 3, self.height);
        output.encodeBooleanElement(serialDesc, 4, self.mustBePasseAlone);
        output.encodeBooleanElement(serialDesc, 5, self.hasNfc);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 6);
        DocumentFace documentFace = self.obverse;
        if (zShouldEncodeElementDefault || documentFace != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, DocumentFace$$serializer.INSTANCE, documentFace);
        }
        boolean zShouldEncodeElementDefault2 = output.shouldEncodeElementDefault(serialDesc, 7);
        DocumentFace documentFace2 = self.reverse;
        if (!zShouldEncodeElementDefault2 && documentFace2 == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, DocumentFace$$serializer.INSTANCE, documentFace2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<String> component2() {
        return this.groupIds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getMustBePasseAlone() {
        return this.mustBePasseAlone;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getHasNfc() {
        return this.hasNfc;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DocumentFace getObverse() {
        return this.obverse;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DocumentFace getReverse() {
        return this.reverse;
    }

    @NotNull
    public final Document copy(@NotNull String id, @NotNull List<String> groupIds, int width, int height, boolean mustBePasseAlone, boolean hasNfc, @Nullable DocumentFace obverse, @Nullable DocumentFace reverse) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(groupIds, "groupIds");
        return new Document(id, groupIds, width, height, mustBePasseAlone, hasNfc, obverse, reverse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Document)) {
            return false;
        }
        Document document = (Document) other;
        return Intrinsics.areEqual(this.id, document.id) && Intrinsics.areEqual(this.groupIds, document.groupIds) && this.width == document.width && this.height == document.height && this.mustBePasseAlone == document.mustBePasseAlone && this.hasNfc == document.hasNfc && Intrinsics.areEqual(this.obverse, document.obverse) && Intrinsics.areEqual(this.reverse, document.reverse);
    }

    public final double getAspectRatio() {
        return ((double) this.width) / ((double) this.height);
    }

    @NotNull
    public final String getCountryIsoCode() {
        return (String) StringsKt__StringsKt.split$default((CharSequence) this.id, new String[]{PushConstants.GE_PARAMS_SEPARATOR}, false, 0, 6, (Object) null).get(0);
    }

    @NotNull
    public final List<DocumentFace> getDocumentFaces() {
        return CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new DocumentFace[]{this.obverse, this.reverse});
    }

    @NotNull
    public final List<String> getGroupIds() {
        return this.groupIds;
    }

    public final boolean getHasNfc() {
        return this.hasNfc;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final boolean getMustBePasseAlone() {
        return this.mustBePasseAlone;
    }

    @Nullable
    public final DocumentFace getObverse() {
        return this.obverse;
    }

    @Nullable
    public final DocumentFace getReverse() {
        return this.reverse;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iA = (((((((a.a(this.groupIds, this.id.hashCode() * 31, 31) + this.width) * 31) + this.height) * 31) + (this.mustBePasseAlone ? 1231 : 1237)) * 31) + (this.hasNfc ? 1231 : 1237)) * 31;
        DocumentFace documentFace = this.obverse;
        int iHashCode = (iA + (documentFace == null ? 0 : documentFace.hashCode())) * 31;
        DocumentFace documentFace2 = this.reverse;
        return iHashCode + (documentFace2 != null ? documentFace2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Document(id=" + this.id + ", groupIds=" + this.groupIds + ", width=" + this.width + ", height=" + this.height + ", mustBePasseAlone=" + this.mustBePasseAlone + ", hasNfc=" + this.hasNfc + ", obverse=" + this.obverse + ", reverse=" + this.reverse + ")";
    }

    public Document(@NotNull String id, @NotNull List<String> groupIds, int i10, int i11, boolean z10, boolean z11, @Nullable DocumentFace documentFace, @Nullable DocumentFace documentFace2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(groupIds, "groupIds");
        this.id = id;
        this.groupIds = groupIds;
        this.width = i10;
        this.height = i11;
        this.mustBePasseAlone = z10;
        this.hasNfc = z11;
        this.obverse = documentFace;
        this.reverse = documentFace2;
    }

    public /* synthetic */ Document(String str, List list, int i10, int i11, boolean z10, boolean z11, DocumentFace documentFace, DocumentFace documentFace2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i10, i11, z10, z11, (i12 & 64) != 0 ? null : documentFace, (i12 & 128) != 0 ? null : documentFace2);
    }

    @SerialName("g")
    public static /* synthetic */ void getGroupIds$annotations() {
    }

    @SerialName("n")
    public static /* synthetic */ void getHasNfc$annotations() {
    }

    @SerialName("h")
    public static /* synthetic */ void getHeight$annotations() {
    }

    @SerialName("i")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("mbpa")
    public static /* synthetic */ void getMustBePasseAlone$annotations() {
    }

    @SerialName("o")
    public static /* synthetic */ void getObverse$annotations() {
    }

    @SerialName("r")
    public static /* synthetic */ void getReverse$annotations() {
    }

    @SerialName("w")
    public static /* synthetic */ void getWidth$annotations() {
    }
}
