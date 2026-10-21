package com.bbva.selfiecapture.plugin;

import android.content.Context;
import com.bbva.selfiecapture.plugin.command.SelfieCapturable;
import com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SelfieCaptureController.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J \u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0010j\b\u0012\u0004\u0012\u00020\f`\u00112\u0006\u0010\b\u001a\u00020\tH\u0016J\u0015\u0010\u0012\u001a\n \u0013*\u0004\u0018\u00010\f0\fH\u0016¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\fH\u0016¨\u0006\u0017"}, d2 = {"Lcom/bbva/selfiecapture/plugin/SelfieCaptureController;", "Lcom/bbva/selfiecapture/plugin/command/SelfieCapturable;", "<init>", "()V", "startSelfieCapture", "", "delegate", "Lcom/dasnano/vdphotoselfiecapture/VDPhotoSelfieCapture$IVDPhotoSelfieCapture;", "context", "Landroid/content/Context;", "configuration", "", "", "stopSelfieCaptureProcess", "getVersion", "getConfigurationKeys", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getNextChallenge", "kotlin.jvm.PlatformType", "()Ljava/lang/String;", "updateChallenge", ClientData.KEY_CHALLENGE, "selfie-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelfieCaptureController implements SelfieCapturable {
    @Override // com.bbva.selfiecapture.plugin.command.SelfieCapturable
    @NotNull
    public ArrayList<String> getConfigurationKeys(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList<String> configurationKeys = VDPhotoSelfieCapture.getConfigurationKeys(context);
        Intrinsics.checkNotNullExpressionValue(configurationKeys, "getConfigurationKeys(...)");
        return configurationKeys;
    }

    @Override // com.bbva.selfiecapture.plugin.command.SelfieCapturable
    public String getNextChallenge() {
        return VDPhotoSelfieCapture.getNextChallenge();
    }

    @Override // com.bbva.selfiecapture.plugin.command.SelfieCapturable
    @NotNull
    public String getVersion() {
        String version = VDPhotoSelfieCapture.getVersion();
        Intrinsics.checkNotNullExpressionValue(version, "getVersion(...)");
        return version;
    }

    @Override // com.bbva.selfiecapture.plugin.command.SelfieCapturable
    public void startSelfieCapture(@NotNull VDPhotoSelfieCapture.IVDPhotoSelfieCapture delegate, @NotNull Context context, @Nullable Map<String, String> configuration) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(context, "context");
        if (VDPhotoSelfieCapture.isStarted()) {
            return;
        }
        if (configuration != null) {
            VDPhotoSelfieCapture.start(delegate, context, configuration);
        } else {
            VDPhotoSelfieCapture.start(delegate, context);
        }
    }

    @Override // com.bbva.selfiecapture.plugin.command.SelfieCapturable
    public void stopSelfieCaptureProcess(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        VDPhotoSelfieCapture.stop(context);
    }

    @Override // com.bbva.selfiecapture.plugin.command.SelfieCapturable
    public void updateChallenge(@NotNull String challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        VDPhotoSelfieCapture.updateChallenge(challenge);
    }
}
