package com.bbva.component_devicemanager.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceManagerData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003JY\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u000b\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\f\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\r\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u000e\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u000f\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\u0010\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b\u0011\u0010\u001cR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b\u0012\u0010\u001c¨\u0006&"}, d2 = {"Lcom/bbva/component_devicemanager/domain/model/AlertsInfo;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "isRootJailbrokenActive", "isDebugModeActive", "isMalwareActive", "isDeveloperModeActive", "isUnsecuredWifiActive", "isStoreCredentialsActive", "isActivationAccountClipboardActive", "isScreenLockActive", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "()Z", "b", "c", "d", "e", "f", "g", "h", "<init>", "(ZZZZZZZZ)V", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class AlertsInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isRootJailbrokenActive;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean isDebugModeActive;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean isMalwareActive;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean isDeveloperModeActive;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean isUnsecuredWifiActive;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean isStoreCredentialsActive;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean isActivationAccountClipboardActive;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final boolean isScreenLockActive;

    public AlertsInfo(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.isRootJailbrokenActive = z10;
        this.isDebugModeActive = z11;
        this.isMalwareActive = z12;
        this.isDeveloperModeActive = z13;
        this.isUnsecuredWifiActive = z14;
        this.isStoreCredentialsActive = z15;
        this.isActivationAccountClipboardActive = z16;
        this.isScreenLockActive = z17;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsRootJailbrokenActive() {
        return this.isRootJailbrokenActive;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsDebugModeActive() {
        return this.isDebugModeActive;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsMalwareActive() {
        return this.isMalwareActive;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsDeveloperModeActive() {
        return this.isDeveloperModeActive;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsUnsecuredWifiActive() {
        return this.isUnsecuredWifiActive;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsStoreCredentialsActive() {
        return this.isStoreCredentialsActive;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsActivationAccountClipboardActive() {
        return this.isActivationAccountClipboardActive;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsScreenLockActive() {
        return this.isScreenLockActive;
    }

    @NotNull
    public final AlertsInfo copy(boolean isRootJailbrokenActive, boolean isDebugModeActive, boolean isMalwareActive, boolean isDeveloperModeActive, boolean isUnsecuredWifiActive, boolean isStoreCredentialsActive, boolean isActivationAccountClipboardActive, boolean isScreenLockActive) {
        return new AlertsInfo(isRootJailbrokenActive, isDebugModeActive, isMalwareActive, isDeveloperModeActive, isUnsecuredWifiActive, isStoreCredentialsActive, isActivationAccountClipboardActive, isScreenLockActive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertsInfo)) {
            return false;
        }
        AlertsInfo alertsInfo = (AlertsInfo) other;
        return this.isRootJailbrokenActive == alertsInfo.isRootJailbrokenActive && this.isDebugModeActive == alertsInfo.isDebugModeActive && this.isMalwareActive == alertsInfo.isMalwareActive && this.isDeveloperModeActive == alertsInfo.isDeveloperModeActive && this.isUnsecuredWifiActive == alertsInfo.isUnsecuredWifiActive && this.isStoreCredentialsActive == alertsInfo.isStoreCredentialsActive && this.isActivationAccountClipboardActive == alertsInfo.isActivationAccountClipboardActive && this.isScreenLockActive == alertsInfo.isScreenLockActive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public int hashCode() {
        boolean z10 = this.isRootJailbrokenActive;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = r1 * 31;
        boolean z11 = this.isDebugModeActive;
        ?? r3 = z11;
        if (z11) {
            r3 = 1;
        }
        int i11 = (i10 + r3) * 31;
        boolean z12 = this.isMalwareActive;
        ?? r4 = z12;
        if (z12) {
            r4 = 1;
        }
        int i12 = (i11 + r4) * 31;
        boolean z13 = this.isDeveloperModeActive;
        ?? r10 = z13;
        if (z13) {
            r10 = 1;
        }
        int i13 = (i12 + r10) * 31;
        boolean z14 = this.isUnsecuredWifiActive;
        ?? r11 = z14;
        if (z14) {
            r11 = 1;
        }
        int i14 = (i13 + r11) * 31;
        boolean z15 = this.isStoreCredentialsActive;
        ?? r12 = z15;
        if (z15) {
            r12 = 1;
        }
        int i15 = (i14 + r12) * 31;
        boolean z16 = this.isActivationAccountClipboardActive;
        ?? r13 = z16;
        if (z16) {
            r13 = 1;
        }
        int i16 = (i15 + r13) * 31;
        boolean z17 = this.isScreenLockActive;
        return i16 + (z17 ? 1 : z17);
    }

    public final boolean isActivationAccountClipboardActive() {
        return this.isActivationAccountClipboardActive;
    }

    public final boolean isDebugModeActive() {
        return this.isDebugModeActive;
    }

    public final boolean isDeveloperModeActive() {
        return this.isDeveloperModeActive;
    }

    public final boolean isMalwareActive() {
        return this.isMalwareActive;
    }

    public final boolean isRootJailbrokenActive() {
        return this.isRootJailbrokenActive;
    }

    public final boolean isScreenLockActive() {
        return this.isScreenLockActive;
    }

    public final boolean isStoreCredentialsActive() {
        return this.isStoreCredentialsActive;
    }

    public final boolean isUnsecuredWifiActive() {
        return this.isUnsecuredWifiActive;
    }

    @NotNull
    public String toString() {
        return "AlertsInfo(isRootJailbrokenActive=" + this.isRootJailbrokenActive + ", isDebugModeActive=" + this.isDebugModeActive + ", isMalwareActive=" + this.isMalwareActive + ", isDeveloperModeActive=" + this.isDeveloperModeActive + ", isUnsecuredWifiActive=" + this.isUnsecuredWifiActive + ", isStoreCredentialsActive=" + this.isStoreCredentialsActive + ", isActivationAccountClipboardActive=" + this.isActivationAccountClipboardActive + ", isScreenLockActive=" + this.isScreenLockActive + ")";
    }
}
