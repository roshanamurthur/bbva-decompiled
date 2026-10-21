package com.bbva.component.dm.aem.data.model;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AEMResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014B'\b\u0017\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/bbva/component/dm/aem/data/model/AEMRoot;", "", "Lcom/bbva/component/dm/aem/data/model/AEMRootItems;", "component1", "rootItems", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/component/dm/aem/data/model/AEMRootItems;", "getRootItems", "()Lcom/bbva/component/dm/aem/data/model/AEMRootItems;", "getRootItems$annotations", "()V", "<init>", "(Lcom/bbva/component/dm/aem/data/model/AEMRootItems;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/component/dm/aem/data/model/AEMRootItems;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-dm-aem_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class AEMRoot {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final AEMRootItems rootItems;

    /* JADX INFO: compiled from: AEMResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/dm/aem/data/model/AEMRoot$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/dm/aem/data/model/AEMRoot;", "component-dm-aem_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<AEMRoot> serializer() {
            return AEMRoot$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ AEMRoot(int i10, @SerialName(":items") AEMRootItems aEMRootItems, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, AEMRoot$$serializer.INSTANCE.getDescriptor());
        }
        this.rootItems = aEMRootItems;
    }

    public static /* synthetic */ AEMRoot copy$default(AEMRoot aEMRoot, AEMRootItems aEMRootItems, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aEMRootItems = aEMRoot.rootItems;
        }
        return aEMRoot.copy(aEMRootItems);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AEMRootItems getRootItems() {
        return this.rootItems;
    }

    @NotNull
    public final AEMRoot copy(@Nullable AEMRootItems rootItems) {
        return new AEMRoot(rootItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AEMRoot) && Intrinsics.areEqual(this.rootItems, ((AEMRoot) other).rootItems);
    }

    @Nullable
    public final AEMRootItems getRootItems() {
        return this.rootItems;
    }

    public int hashCode() {
        AEMRootItems aEMRootItems = this.rootItems;
        if (aEMRootItems == null) {
            return 0;
        }
        return aEMRootItems.hashCode();
    }

    @NotNull
    public String toString() {
        return "AEMRoot(rootItems=" + this.rootItems + RootService.CLOSE_BRACKET;
    }

    public AEMRoot(@Nullable AEMRootItems aEMRootItems) {
        this.rootItems = aEMRootItems;
    }

    @SerialName(":items")
    public static /* synthetic */ void getRootItems$annotations() {
    }
}
