package com.bbva.showinfo.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.showinfo.nativemodal.modal.Item;
import com.bbva.showinfo.nativemodal.modal.NativeListModalConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfoElement.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0019\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003J/\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R2\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/bbva/showinfo/model/InfoNativeListModal;", "Lcom/bbva/showinfo/model/InfoElement;", "Lcom/bbva/showinfo/nativemodal/modal/NativeListModalConfiguration;", "component1", "Lkotlin/Function1;", "Lcom/bbva/showinfo/nativemodal/modal/Item;", "", "component2", "config", "onActionClickListener", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/showinfo/nativemodal/modal/NativeListModalConfiguration;", "getConfig", "()Lcom/bbva/showinfo/nativemodal/modal/NativeListModalConfiguration;", "setConfig", "(Lcom/bbva/showinfo/nativemodal/modal/NativeListModalConfiguration;)V", "b", "Lkotlin/jvm/functions/Function1;", "getOnActionClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnActionClickListener", "(Lkotlin/jvm/functions/Function1;)V", "<init>", "(Lcom/bbva/showinfo/nativemodal/modal/NativeListModalConfiguration;Lkotlin/jvm/functions/Function1;)V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class InfoNativeListModal extends InfoElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public NativeListModalConfiguration config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Item, Unit> onActionClickListener;

    /* JADX WARN: Multi-variable type inference failed */
    public InfoNativeListModal() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InfoNativeListModal copy$default(InfoNativeListModal infoNativeListModal, NativeListModalConfiguration nativeListModalConfiguration, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nativeListModalConfiguration = infoNativeListModal.config;
        }
        if ((i10 & 2) != 0) {
            function1 = infoNativeListModal.onActionClickListener;
        }
        return infoNativeListModal.copy(nativeListModalConfiguration, function1);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NativeListModalConfiguration getConfig() {
        return this.config;
    }

    @Nullable
    public final Function1<Item, Unit> component2() {
        return this.onActionClickListener;
    }

    @NotNull
    public final InfoNativeListModal copy(@Nullable NativeListModalConfiguration config, @Nullable Function1<? super Item, Unit> onActionClickListener) {
        return new InfoNativeListModal(config, onActionClickListener);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoNativeListModal)) {
            return false;
        }
        InfoNativeListModal infoNativeListModal = (InfoNativeListModal) other;
        return Intrinsics.areEqual(this.config, infoNativeListModal.config) && Intrinsics.areEqual(this.onActionClickListener, infoNativeListModal.onActionClickListener);
    }

    @Nullable
    public final NativeListModalConfiguration getConfig() {
        return this.config;
    }

    @Nullable
    public final Function1<Item, Unit> getOnActionClickListener() {
        return this.onActionClickListener;
    }

    public int hashCode() {
        NativeListModalConfiguration nativeListModalConfiguration = this.config;
        int iHashCode = (nativeListModalConfiguration == null ? 0 : nativeListModalConfiguration.hashCode()) * 31;
        Function1<? super Item, Unit> function1 = this.onActionClickListener;
        return iHashCode + (function1 != null ? function1.hashCode() : 0);
    }

    public final void setConfig(@Nullable NativeListModalConfiguration nativeListModalConfiguration) {
        this.config = nativeListModalConfiguration;
    }

    public final void setOnActionClickListener(@Nullable Function1<? super Item, Unit> function1) {
        this.onActionClickListener = function1;
    }

    @NotNull
    public String toString() {
        return "InfoNativeListModal(config=" + this.config + ", onActionClickListener=" + this.onActionClickListener + ")";
    }

    public /* synthetic */ InfoNativeListModal(NativeListModalConfiguration nativeListModalConfiguration, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : nativeListModalConfiguration, (i10 & 2) != 0 ? null : function1);
    }

    public InfoNativeListModal(@Nullable NativeListModalConfiguration nativeListModalConfiguration, @Nullable Function1<? super Item, Unit> function1) {
        super(null);
        this.config = nativeListModalConfiguration;
        this.onActionClickListener = function1;
    }
}
