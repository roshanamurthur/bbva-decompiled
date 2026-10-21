package com.bbva.plugin.media.capture.media.audio;

import android.content.Context;
import android.media.MediaRecorder;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.plugin.media.capture.model.MediaSource;
import com.bbva.plugin.media.capture.model.TempFile;
import com.bbva.plugin.media.capture.util.FileUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MediaRecorderController.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R(\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/bbva/plugin/media/capture/media/audio/MediaRecorderController;", "", "Landroid/content/Context;", "context", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "Lcom/bbva/plugin/media/capture/model/TempFile;", "<set-?>", "a", "Lcom/bbva/plugin/media/capture/model/TempFile;", "getCurrentOutput", "()Lcom/bbva/plugin/media/capture/model/TempFile;", "currentOutput", "b", "Z", "isRecording", "()Z", "Landroid/media/MediaRecorder;", "mMediaRecorder", "<init>", "(Landroid/media/MediaRecorder;)V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class MediaRecorderController {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TempFile currentOutput;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean isRecording;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaRecorder f35833c;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaRecorderController() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final TempFile getCurrentOutput() {
        return this.currentOutput;
    }

    /* JADX INFO: renamed from: isRecording, reason: from getter */
    public final boolean getIsRecording() {
        return this.isRecording;
    }

    public final boolean start(@NotNull Context context) {
        Object objM5535constructorimpl;
        File file;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.isRecording) {
            return false;
        }
        this.isRecording = true;
        this.currentOutput = FileUtils.INSTANCE.createTempFile$media_capture_plugin_release(context, MediaSource.Audio);
        MediaRecorder mediaRecorder = this.f35833c;
        mediaRecorder.setAudioSource(1);
        mediaRecorder.setOutputFormat(2);
        mediaRecorder.setAudioEncoder(3);
        TempFile tempFile = this.currentOutput;
        mediaRecorder.setOutputFile((tempFile == null || (file = tempFile.getFile()) == null) ? null : file.getPath());
        try {
            Result.Companion companion = Result.INSTANCE;
            mediaRecorder.prepare();
            mediaRecorder.start();
            objM5535constructorimpl = Result.m5535constructorimpl(Boolean.TRUE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            thM5538exceptionOrNullimpl.printStackTrace();
            this.isRecording = false;
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = bool;
        }
        return ((Boolean) objM5535constructorimpl).booleanValue();
    }

    public final boolean stop() {
        Object objM5535constructorimpl;
        MediaRecorder mediaRecorder = this.f35833c;
        try {
            Result.Companion companion = Result.INSTANCE;
            mediaRecorder.stop();
            this.isRecording = false;
            objM5535constructorimpl = Result.m5535constructorimpl(Boolean.TRUE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            mediaRecorder.reset();
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = bool;
        }
        return ((Boolean) objM5535constructorimpl).booleanValue();
    }

    public MediaRecorderController(@NotNull MediaRecorder mMediaRecorder) {
        Intrinsics.checkNotNullParameter(mMediaRecorder, "mMediaRecorder");
        this.f35833c = mMediaRecorder;
    }

    public /* synthetic */ MediaRecorderController(MediaRecorder mediaRecorder, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new MediaRecorder() : mediaRecorder);
    }
}
