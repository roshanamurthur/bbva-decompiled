package com.mastercard.sonic.sonicasset;

import android.content.Context;
import com.mastercard.sonic.BuildConfig;
import com.mastercard.sonic.model.VersionConfig;
import com.mastercard.sonic.utils.FileDirUtils;
import com.mastercard.sonic.versionconfig.VersionConfigManager;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SonicUpgradeManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/mastercard/sonic/sonicasset/SonicUpgradeManager;", "", "", "cue", "", "isHapticsEnabled", "", "checkAndUpdateRemoteUpgrade$sonic_sdk_release", "(Ljava/lang/String;Z)V", "checkAndUpdateRemoteUpgrade", "c", "Z", "getRemoteUpgradeFound", "()Z", "setRemoteUpgradeFound", "(Z)V", "remoteUpgradeFound", "Lcom/mastercard/sonic/sonicasset/SonicAssetDownloadManager;", "d", "Lcom/mastercard/sonic/sonicasset/SonicAssetDownloadManager;", "getSonicAssetDownloadManager", "()Lcom/mastercard/sonic/sonicasset/SonicAssetDownloadManager;", "sonicAssetDownloadManager", "Lcom/mastercard/sonic/versionconfig/VersionConfigManager;", "e", "Lcom/mastercard/sonic/versionconfig/VersionConfigManager;", "getVersionConfigManager", "()Lcom/mastercard/sonic/versionconfig/VersionConfigManager;", "versionConfigManager", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class SonicUpgradeManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f51563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f51564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean remoteUpgradeFound;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SonicAssetDownloadManager sonicAssetDownloadManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final VersionConfigManager versionConfigManager;

    public SonicUpgradeManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51563a = BuildConfig.REMOTE_CONFIG_URL;
        this.f51564b = FileDirUtils.SONIC_SDK_VERSION_CONFIG_FILENAME;
        this.sonicAssetDownloadManager = new SonicAssetDownloadManager(context);
        this.versionConfigManager = new VersionConfigManager(context);
    }

    public final void checkAndUpdateRemoteUpgrade$sonic_sdk_release(@NotNull final String cue, final boolean isHapticsEnabled) {
        Intrinsics.checkNotNullParameter(cue, "cue");
        this.versionConfigManager.getVersionConfig(this.f51563a + this.f51564b, new VersionConfigManager.VersionConfigCallback() { // from class: com.mastercard.sonic.sonicasset.SonicUpgradeManager$checkAndUpdateRemoteUpgrade$1
            @Override // com.mastercard.sonic.versionconfig.VersionConfigManager.VersionConfigCallback
            public void onDownloadCompleted(@NotNull List<VersionConfig> versionConfig) throws IOException {
                Intrinsics.checkNotNullParameter(versionConfig, "versionConfig");
                SonicUpgradeManager sonicUpgradeManager = this.f51568a;
                if (sonicUpgradeManager.getSonicAssetDownloadManager().checkForDownload(BuildConfig.VERSION_NAME, cue, versionConfig)) {
                    sonicUpgradeManager.setRemoteUpgradeFound(true);
                    sonicUpgradeManager.getSonicAssetDownloadManager().downloadAssetsInParallel(isHapticsEnabled);
                }
            }
        });
    }

    public final boolean getRemoteUpgradeFound() {
        return this.remoteUpgradeFound;
    }

    @NotNull
    public final SonicAssetDownloadManager getSonicAssetDownloadManager() {
        return this.sonicAssetDownloadManager;
    }

    @NotNull
    public final VersionConfigManager getVersionConfigManager() {
        return this.versionConfigManager;
    }

    public final void setRemoteUpgradeFound(boolean z10) {
        this.remoteUpgradeFound = z10;
    }
}
