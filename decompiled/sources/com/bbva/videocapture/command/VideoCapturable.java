package com.bbva.videocapture.command;

import android.content.Context;
import com.bbva.videocapture.command.params.LaunchVideoCaptureParams;
import com.dasnano.vdvideoselfiecapture.VDVideoSelfieCapture;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VideoCapturable.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\fH&J \u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000ej\b\u0012\u0004\u0012\u00020\f`\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u0010"}, d2 = {"Lcom/bbva/videocapture/command/VideoCapturable;", "", "startVideoCapture", "", "delegate", "Lcom/dasnano/vdvideoselfiecapture/VDVideoSelfieCapture$IVDVideoSelfieCapture;", "context", "Landroid/content/Context;", "params", "Lcom/bbva/videocapture/command/params/LaunchVideoCaptureParams;", "stopVideoCaptureProcess", "getVersion", "", "getConfigurationKeys", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "video-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface VideoCapturable {
    @NotNull
    ArrayList<String> getConfigurationKeys(@NotNull Context context);

    @NotNull
    String getVersion();

    void startVideoCapture(@NotNull VDVideoSelfieCapture.IVDVideoSelfieCapture delegate, @NotNull Context context, @NotNull LaunchVideoCaptureParams params);

    void stopVideoCaptureProcess(@NotNull Context context);
}
