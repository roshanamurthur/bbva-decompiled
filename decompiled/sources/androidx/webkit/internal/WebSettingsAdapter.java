package androidx.webkit.internal;

import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class WebSettingsAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebSettingsBoundaryInterface f24080a;

    public WebSettingsAdapter(@NonNull WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f24080a = webSettingsBoundaryInterface;
    }

    public int getDisabledActionModeMenuItems() {
        return this.f24080a.getDisabledActionModeMenuItems();
    }

    public boolean getEnterpriseAuthenticationAppLinkPolicyEnabled() {
        return this.f24080a.getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    public int getForceDark() {
        return this.f24080a.getForceDark();
    }

    public int getForceDarkStrategy() {
        return this.f24080a.getForceDarkBehavior();
    }

    public boolean getOffscreenPreRaster() {
        return this.f24080a.getOffscreenPreRaster();
    }

    public int getRequestedWithHeaderMode() {
        return this.f24080a.getRequestedWithHeaderMode();
    }

    public boolean getSafeBrowsingEnabled() {
        return this.f24080a.getSafeBrowsingEnabled();
    }

    public boolean isAlgorithmicDarkeningAllowed() {
        return this.f24080a.isAlgorithmicDarkeningAllowed();
    }

    public void setAlgorithmicDarkeningAllowed(boolean z10) {
        this.f24080a.setAlgorithmicDarkeningAllowed(z10);
    }

    public void setDisabledActionModeMenuItems(int i10) {
        this.f24080a.setDisabledActionModeMenuItems(i10);
    }

    public void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z10) {
        this.f24080a.setEnterpriseAuthenticationAppLinkPolicyEnabled(z10);
    }

    public void setForceDark(int i10) {
        this.f24080a.setForceDark(i10);
    }

    public void setForceDarkStrategy(int i10) {
        this.f24080a.setForceDarkBehavior(i10);
    }

    public void setOffscreenPreRaster(boolean z10) {
        this.f24080a.setOffscreenPreRaster(z10);
    }

    public void setRequestedWithHeaderMode(int i10) {
        this.f24080a.setRequestedWithHeaderMode(i10);
    }

    public void setSafeBrowsingEnabled(boolean z10) {
        this.f24080a.setSafeBrowsingEnabled(z10);
    }

    public void setWillSuppressErrorPage(boolean z10) {
        this.f24080a.setWillSuppressErrorPage(z10);
    }

    public boolean willSuppressErrorPage() {
        return this.f24080a.getWillSuppressErrorPage();
    }
}
