package com.bbva.plugin.media.capture.media.video;

import android.app.Activity;
import android.content.ContentResolver;
import android.net.Uri;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.plugin.media.capture.model.MediaSource;
import com.bbva.plugin.media.capture.model.TempFile;
import com.bbva.plugin.media.capture.util.FileUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VideoControllerPreAndroidQ.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/plugin/media/capture/media/video/VideoControllerPreAndroidQ;", "Lcom/bbva/plugin/media/capture/media/video/VideoController;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "Landroid/net/Uri;", "createVideoFile", "Landroid/content/ContentResolver;", "contentResolver", "", "getPath", "<init>", "()V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class VideoControllerPreAndroidQ implements VideoController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TempFile f35854a;

    @Override // com.bbva.plugin.media.capture.media.video.VideoController
    @Nullable
    public Uri createVideoFile(@NotNull Activity activity, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        TempFile tempFileCreateTempFile$media_capture_plugin_release = FileUtils.INSTANCE.createTempFile$media_capture_plugin_release(activity, MediaSource.Video);
        this.f35854a = tempFileCreateTempFile$media_capture_plugin_release;
        if (tempFileCreateTempFile$media_capture_plugin_release != null) {
            return tempFileCreateTempFile$media_capture_plugin_release.getUri();
        }
        return null;
    }

    @Override // com.bbva.plugin.media.capture.media.video.VideoController
    @Nullable
    public String getPath(@NotNull ContentResolver contentResolver) {
        File file;
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        TempFile tempFile = this.f35854a;
        if (tempFile == null || (file = tempFile.getFile()) == null) {
            return null;
        }
        return file.getAbsolutePath();
    }
}
