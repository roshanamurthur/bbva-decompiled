package com.mastercard.sonic.hapticsmanager.model;

import androidx.camera.core.imagecapture.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AHAPData.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/mastercard/sonic/hapticsmanager/model/AHAPData;", "", "", "component1", "Lcom/mastercard/sonic/hapticsmanager/model/Metadata;", "component2", "", "Lcom/mastercard/sonic/hapticsmanager/model/PatternItem;", "component3", "version", "metadata", "pattern", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getVersion", "()I", "b", "Lcom/mastercard/sonic/hapticsmanager/model/Metadata;", "getMetadata", "()Lcom/mastercard/sonic/hapticsmanager/model/Metadata;", "c", "Ljava/util/List;", "getPattern", "()Ljava/util/List;", "<init>", "(ILcom/mastercard/sonic/hapticsmanager/model/Metadata;Ljava/util/List;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class AHAPData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Version")
    private final int version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Metadata")
    @NotNull
    private final Metadata metadata;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Pattern")
    @NotNull
    private final List<PatternItem> pattern;

    public AHAPData(int i10, @NotNull Metadata metadata, @NotNull List<PatternItem> pattern) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        this.version = i10;
        this.metadata = metadata;
        this.pattern = pattern;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AHAPData copy$default(AHAPData aHAPData, int i10, Metadata metadata, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = aHAPData.version;
        }
        if ((i11 & 2) != 0) {
            metadata = aHAPData.metadata;
        }
        if ((i11 & 4) != 0) {
            list = aHAPData.pattern;
        }
        return aHAPData.copy(i10, metadata, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Metadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final List<PatternItem> component3() {
        return this.pattern;
    }

    @NotNull
    public final AHAPData copy(int version, @NotNull Metadata metadata, @NotNull List<PatternItem> pattern) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        return new AHAPData(version, metadata, pattern);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AHAPData)) {
            return false;
        }
        AHAPData aHAPData = (AHAPData) other;
        return this.version == aHAPData.version && Intrinsics.areEqual(this.metadata, aHAPData.metadata) && Intrinsics.areEqual(this.pattern, aHAPData.pattern);
    }

    @NotNull
    public final Metadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final List<PatternItem> getPattern() {
        return this.pattern;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.pattern.hashCode() + ((this.metadata.hashCode() + (this.version * 31)) * 31);
    }

    @NotNull
    public String toString() {
        int i10 = this.version;
        Metadata metadata = this.metadata;
        List<PatternItem> list = this.pattern;
        StringBuilder sb2 = new StringBuilder("AHAPData(version=");
        sb2.append(i10);
        sb2.append(", metadata=");
        sb2.append(metadata);
        sb2.append(", pattern=");
        return a.c(sb2, list, ")");
    }
}
