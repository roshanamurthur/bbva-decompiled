package com.bbva.plugin.media.capture.media.video;

import android.os.Build;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VideoControllerFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/plugin/media/capture/media/video/VideoControllerFactory;", "", "()V", "create", "Lcom/bbva/plugin/media/capture/media/video/VideoController;", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class VideoControllerFactory {

    @NotNull
    public static final VideoControllerFactory INSTANCE = new VideoControllerFactory();

    @NotNull
    public final VideoController create() {
        return Build.VERSION.SDK_INT >= 29 ? new VideoControllerAndroidQ() : new VideoControllerPreAndroidQ();
    }
}
