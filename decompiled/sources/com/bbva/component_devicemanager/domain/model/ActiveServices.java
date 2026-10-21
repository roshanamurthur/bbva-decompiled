package com.bbva.component_devicemanager.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceManagerData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0004\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/bbva/component_devicemanager/domain/model/ActiveServices;", "", "", "component1", "isDiscreetModeActive", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "()Z", "<init>", "(Z)V", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class ActiveServices {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isDiscreetModeActive;

    public ActiveServices(boolean z10) {
        this.isDiscreetModeActive = z10;
    }

    public static /* synthetic */ ActiveServices copy$default(ActiveServices activeServices, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = activeServices.isDiscreetModeActive;
        }
        return activeServices.copy(z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsDiscreetModeActive() {
        return this.isDiscreetModeActive;
    }

    @NotNull
    public final ActiveServices copy(boolean isDiscreetModeActive) {
        return new ActiveServices(isDiscreetModeActive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ActiveServices) && this.isDiscreetModeActive == ((ActiveServices) other).isDiscreetModeActive;
    }

    public int hashCode() {
        boolean z10 = this.isDiscreetModeActive;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final boolean isDiscreetModeActive() {
        return this.isDiscreetModeActive;
    }

    @NotNull
    public String toString() {
        return "ActiveServices(isDiscreetModeActive=" + this.isDiscreetModeActive + ")";
    }
}
