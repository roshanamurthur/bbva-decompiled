package com.bbva.plugin.media.capture.media.video;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.annotation.RequiresApi;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.plugin.media.capture.command.response.ErrorsMediaCapture;
import com.bbva.plugin.media.capture.model.MediaSource;
import com.bbva.plugin.media.capture.model.TempFile;
import com.bbva.plugin.media.capture.util.FileUtils;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VideoControllerAndroidQ.kt */
/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(api = 29)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/plugin/media/capture/media/video/VideoControllerAndroidQ;", "Lcom/bbva/plugin/media/capture/media/video/VideoController;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "Landroid/net/Uri;", "createVideoFile", "Landroid/content/ContentResolver;", "contentResolver", "", "getPath", "<init>", "()V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class VideoControllerAndroidQ implements VideoController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f35853a;

    @Override // com.bbva.plugin.media.capture.media.video.VideoController
    @Nullable
    public Uri createVideoFile(@NotNull Activity activity, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
        ContentResolver contentResolver = applicationContext.getContentResolver();
        Uri contentUri = MediaStore.Video.Media.getContentUri("external_primary");
        TempFile tempFileCreateTempFile$media_capture_plugin_release = FileUtils.INSTANCE.createTempFile$media_capture_plugin_release(activity, MediaSource.Video);
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", tempFileCreateTempFile$media_capture_plugin_release.getFile().getName());
        Uri uriInsert = contentResolver.insert(contentUri, contentValues);
        this.f35853a = uriInsert;
        if (uriInsert == null) {
            callback.sendError(ErrorsMediaCapture.ErrorCaptureVideo);
        }
        return this.f35853a;
    }

    @Override // com.bbva.plugin.media.capture.media.video.VideoController
    @Nullable
    public String getPath(@NotNull ContentResolver contentResolver) {
        Object objM5535constructorimpl;
        String string;
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Uri uri = this.f35853a;
        if (uri == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Cursor cursorQuery = contentResolver.query(uri, new String[]{"_data"}, null, null, null);
            if (cursorQuery != null) {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
                cursorQuery.moveToFirst();
                string = cursorQuery.getString(columnIndexOrThrow);
                cursorQuery.close();
            } else {
                string = null;
            }
            objM5535constructorimpl = Result.m5535constructorimpl(string);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return (String) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
    }
}
