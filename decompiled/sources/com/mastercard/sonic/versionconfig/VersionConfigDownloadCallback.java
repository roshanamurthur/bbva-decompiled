package com.mastercard.sonic.versionconfig;

import com.mastercard.sonic.model.VersionConfig;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VersionConfigDownloadCallback.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lcom/mastercard/sonic/versionconfig/VersionConfigDownloadCallback;", "", "onError", "", "error", "", "onSuccess", "versionConfig", "", "Lcom/mastercard/sonic/model/VersionConfig;", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface VersionConfigDownloadCallback {
    void onError(@NotNull String error);

    void onSuccess(@NotNull List<VersionConfig> versionConfig);
}
