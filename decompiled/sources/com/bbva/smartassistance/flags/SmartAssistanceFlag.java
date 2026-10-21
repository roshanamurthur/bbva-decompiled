package com.bbva.smartassistance.flags;

import android.os.Bundle;
import com.bbva.smartassistance.constants.SmartAssistanceConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SmartAssistanceFlag.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/bbva/smartassistance/flags/SmartAssistanceFlag;", "", "Landroid/os/Bundle;", "bundle", "getFlags", "", "a", "Z", "isFirstTimeDigital", "()Z", "setFirstTimeDigital", "(Z)V", "b", "isFirstTimePhysical", "setFirstTimePhysical", "<init>", "(ZZ)V", "gl-smart-assistance_release"}, k = 1, mv = {1, 9, 0})
public final class SmartAssistanceFlag {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean isFirstTimeDigital;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean isFirstTimePhysical;

    /* JADX WARN: Illegal instructions before constructor call */
    public SmartAssistanceFlag() {
        boolean z10 = false;
        this(z10, z10, 3, null);
    }

    @NotNull
    public final SmartAssistanceFlag getFlags(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new SmartAssistanceFlag(bundle.getBoolean(SmartAssistanceConstants.FIRST_TIME_DIGITAL), bundle.getBoolean(SmartAssistanceConstants.FIRST_TIME_PHYSICAL));
    }

    /* JADX INFO: renamed from: isFirstTimeDigital, reason: from getter */
    public final boolean getIsFirstTimeDigital() {
        return this.isFirstTimeDigital;
    }

    /* JADX INFO: renamed from: isFirstTimePhysical, reason: from getter */
    public final boolean getIsFirstTimePhysical() {
        return this.isFirstTimePhysical;
    }

    public final void setFirstTimeDigital(boolean z10) {
        this.isFirstTimeDigital = z10;
    }

    public final void setFirstTimePhysical(boolean z10) {
        this.isFirstTimePhysical = z10;
    }

    public SmartAssistanceFlag(boolean z10, boolean z11) {
        this.isFirstTimeDigital = z10;
        this.isFirstTimePhysical = z11;
    }

    public /* synthetic */ SmartAssistanceFlag(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11);
    }
}
