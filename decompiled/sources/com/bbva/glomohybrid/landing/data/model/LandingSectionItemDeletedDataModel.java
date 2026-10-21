package com.bbva.glomohybrid.landing.data.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingSectionDeletedDataModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J!\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÇ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/bbva/glomohybrid/landing/data/model/LandingSectionItemDeletedDataModel;", "", "seen1", "", HashCommand.ID, "", "deletedDate", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeletedDate", "()Ljava/lang/String;", "getHash", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
public final /* data */ class LandingSectionItemDeletedDataModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String deletedDate;

    @NotNull
    private final String hash;

    /* JADX INFO: compiled from: LandingSectionDeletedDataModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/landing/data/model/LandingSectionItemDeletedDataModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/glomohybrid/landing/data/model/LandingSectionItemDeletedDataModel;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<LandingSectionItemDeletedDataModel> serializer() {
            return LandingSectionItemDeletedDataModel$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ LandingSectionItemDeletedDataModel(int i10, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, LandingSectionItemDeletedDataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.hash = str;
        this.deletedDate = str2;
    }

    public static /* synthetic */ LandingSectionItemDeletedDataModel copy$default(LandingSectionItemDeletedDataModel landingSectionItemDeletedDataModel, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = landingSectionItemDeletedDataModel.hash;
        }
        if ((i10 & 2) != 0) {
            str2 = landingSectionItemDeletedDataModel.deletedDate;
        }
        return landingSectionItemDeletedDataModel.copy(str, str2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(LandingSectionItemDeletedDataModel self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.hash);
        output.encodeStringElement(serialDesc, 1, self.deletedDate);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeletedDate() {
        return this.deletedDate;
    }

    @NotNull
    public final LandingSectionItemDeletedDataModel copy(@NotNull String hash, @NotNull String deletedDate) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(deletedDate, "deletedDate");
        return new LandingSectionItemDeletedDataModel(hash, deletedDate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingSectionItemDeletedDataModel)) {
            return false;
        }
        LandingSectionItemDeletedDataModel landingSectionItemDeletedDataModel = (LandingSectionItemDeletedDataModel) other;
        return Intrinsics.areEqual(this.hash, landingSectionItemDeletedDataModel.hash) && Intrinsics.areEqual(this.deletedDate, landingSectionItemDeletedDataModel.deletedDate);
    }

    @NotNull
    public final String getDeletedDate() {
        return this.deletedDate;
    }

    @NotNull
    public final String getHash() {
        return this.hash;
    }

    public int hashCode() {
        return this.deletedDate.hashCode() + (this.hash.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return u.g("LandingSectionItemDeletedDataModel(hash=", this.hash, ", deletedDate=", this.deletedDate, ")");
    }

    public LandingSectionItemDeletedDataModel(@NotNull String hash, @NotNull String deletedDate) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(deletedDate, "deletedDate");
        this.hash = hash;
        this.deletedDate = deletedDate;
    }
}
