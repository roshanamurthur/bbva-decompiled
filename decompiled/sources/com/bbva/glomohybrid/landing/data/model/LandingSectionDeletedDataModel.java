package com.bbva.glomohybrid.landing.data.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingSectionDeletedDataModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B3\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB#\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÇ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lcom/bbva/glomohybrid/landing/data/model/LandingSectionDeletedDataModel;", "", "seen1", "", "cacheDeletedDate", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/bbva/glomohybrid/landing/data/model/LandingSectionItemDeletedDataModel;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/List;)V", "getCacheDeletedDate", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
public final /* data */ class LandingSectionDeletedDataModel {

    @Nullable
    private final String cacheDeletedDate;

    @Nullable
    private final List<LandingSectionItemDeletedDataModel> items;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(LandingSectionItemDeletedDataModel$$serializer.INSTANCE)};

    /* JADX INFO: compiled from: LandingSectionDeletedDataModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/landing/data/model/LandingSectionDeletedDataModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/glomohybrid/landing/data/model/LandingSectionDeletedDataModel;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<LandingSectionDeletedDataModel> serializer() {
            return LandingSectionDeletedDataModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LandingSectionDeletedDataModel() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LandingSectionDeletedDataModel copy$default(LandingSectionDeletedDataModel landingSectionDeletedDataModel, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = landingSectionDeletedDataModel.cacheDeletedDate;
        }
        if ((i10 & 2) != 0) {
            list = landingSectionDeletedDataModel.items;
        }
        return landingSectionDeletedDataModel.copy(str, list);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(LandingSectionDeletedDataModel self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.cacheDeletedDate != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.cacheDeletedDate);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.items == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, kSerializerArr[1], self.items);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCacheDeletedDate() {
        return this.cacheDeletedDate;
    }

    @Nullable
    public final List<LandingSectionItemDeletedDataModel> component2() {
        return this.items;
    }

    @NotNull
    public final LandingSectionDeletedDataModel copy(@Nullable String cacheDeletedDate, @Nullable List<LandingSectionItemDeletedDataModel> items) {
        return new LandingSectionDeletedDataModel(cacheDeletedDate, items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingSectionDeletedDataModel)) {
            return false;
        }
        LandingSectionDeletedDataModel landingSectionDeletedDataModel = (LandingSectionDeletedDataModel) other;
        return Intrinsics.areEqual(this.cacheDeletedDate, landingSectionDeletedDataModel.cacheDeletedDate) && Intrinsics.areEqual(this.items, landingSectionDeletedDataModel.items);
    }

    @Nullable
    public final String getCacheDeletedDate() {
        return this.cacheDeletedDate;
    }

    @Nullable
    public final List<LandingSectionItemDeletedDataModel> getItems() {
        return this.items;
    }

    public int hashCode() {
        String str = this.cacheDeletedDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<LandingSectionItemDeletedDataModel> list = this.items;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LandingSectionDeletedDataModel(cacheDeletedDate=" + this.cacheDeletedDate + ", items=" + this.items + ")";
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ LandingSectionDeletedDataModel(int i10, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.cacheDeletedDate = null;
        } else {
            this.cacheDeletedDate = str;
        }
        if ((i10 & 2) == 0) {
            this.items = null;
        } else {
            this.items = list;
        }
    }

    public LandingSectionDeletedDataModel(@Nullable String str, @Nullable List<LandingSectionItemDeletedDataModel> list) {
        this.cacheDeletedDate = str;
        this.items = list;
    }

    public /* synthetic */ LandingSectionDeletedDataModel(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : list);
    }
}
