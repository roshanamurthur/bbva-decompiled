package com.bbva.videocapture;

import android.content.Context;
import com.bbva.videocapture.command.VideoCapturable;
import com.bbva.videocapture.command.params.LaunchVideoCaptureParams;
import com.dasnano.vdvideoselfiecapture.VDVideoSelfieCapture;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VideoCaptureController.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0010j\b\u0012\u0004\u0012\u00020\u000e`\u00112\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u0012"}, d2 = {"Lcom/bbva/videocapture/VideoCaptureController;", "Lcom/bbva/videocapture/command/VideoCapturable;", "<init>", "()V", "startVideoCapture", "", "delegate", "Lcom/dasnano/vdvideoselfiecapture/VDVideoSelfieCapture$IVDVideoSelfieCapture;", "context", "Landroid/content/Context;", "params", "Lcom/bbva/videocapture/command/params/LaunchVideoCaptureParams;", "stopVideoCaptureProcess", "getVersion", "", "getConfigurationKeys", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "video-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VideoCaptureController implements VideoCapturable {
    @Override // com.bbva.videocapture.command.VideoCapturable
    @NotNull
    public ArrayList<String> getConfigurationKeys(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList<String> configurationKeys = VDVideoSelfieCapture.getConfigurationKeys(context);
        Intrinsics.checkNotNullExpressionValue(configurationKeys, "getConfigurationKeys(...)");
        return configurationKeys;
    }

    @Override // com.bbva.videocapture.command.VideoCapturable
    @NotNull
    public String getVersion() {
        String version = VDVideoSelfieCapture.getVersion();
        Intrinsics.checkNotNullExpressionValue(version, "getVersion(...)");
        return version;
    }

    @Override // com.bbva.videocapture.command.VideoCapturable
    public void startVideoCapture(@NotNull VDVideoSelfieCapture.IVDVideoSelfieCapture delegate, @NotNull Context context, @NotNull LaunchVideoCaptureParams params) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        if (VDVideoSelfieCapture.isStarted()) {
            return;
        }
        String documentType = params.getDocumentType();
        if (documentType != null) {
            VDVideoSelfieCapture.setDocumentType(documentType, context);
        } else {
            VDVideoSelfieCapture.setDocumentType("", context);
        }
        Map<String, String> configuration = params.getConfiguration();
        if (configuration != null) {
            VDVideoSelfieCapture.start(delegate, context, configuration);
        } else {
            VDVideoSelfieCapture.start(delegate, context);
        }
    }

    @Override // com.bbva.videocapture.command.VideoCapturable
    public void stopVideoCaptureProcess(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        VDVideoSelfieCapture.stop(context);
    }
}
