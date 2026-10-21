package com.bbva.plugin.media.capture.media.video;

import android.app.Activity;
import android.content.ContentResolver;
import android.net.Uri;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VideoController.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/bbva/plugin/media/capture/media/video/VideoController;", "", "createVideoFile", "Landroid/net/Uri;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "getPath", "", "contentResolver", "Landroid/content/ContentResolver;", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public interface VideoController {
    @Nullable
    Uri createVideoFile(@NotNull Activity activity, @NotNull CommandCallback callback);

    @Nullable
    String getPath(@NotNull ContentResolver contentResolver);
}
