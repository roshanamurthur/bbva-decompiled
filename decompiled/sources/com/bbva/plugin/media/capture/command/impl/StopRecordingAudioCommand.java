package com.bbva.plugin.media.capture.command.impl;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.utils.StringUtils;
import com.bbva.plugin.media.capture.command.response.ErrorsMediaCapture;
import com.bbva.plugin.media.capture.media.audio.MediaRecorderController;
import com.bbva.plugin.media.capture.model.TempFile;
import com.bbva.plugin.media.capture.util.FileUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StopRecordingAudioCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\f"}, d2 = {"Lcom/bbva/plugin/media/capture/command/impl/StopRecordingAudioCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Ljava/lang/Void;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/plugin/media/capture/media/audio/MediaRecorderController;", "mMediaRecorderController", "<init>", "(Lcom/bbva/plugin/media/capture/media/audio/MediaRecorderController;)V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class StopRecordingAudioCommand extends AbstractCommand<Void> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MediaRecorderController f35822p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopRecordingAudioCommand(@NotNull MediaRecorderController mMediaRecorderController) {
        super(Void.class);
        Intrinsics.checkNotNullParameter(mMediaRecorderController, "mMediaRecorderController");
        this.f35822p0 = mMediaRecorderController;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        MediaRecorderController mediaRecorderController = this.f35822p0;
        if (!mediaRecorderController.getIsRecording()) {
            callback.sendError(ErrorsMediaCapture.ErrorCannotStop);
            return;
        }
        if (!mediaRecorderController.stop()) {
            callback.sendError(ErrorsMediaCapture.ErrorCaptureCancelled);
            return;
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        TempFile currentOutput = mediaRecorderController.getCurrentOutput();
        String strConvertFileToBase64 = fileUtils.convertFileToBase64(currentOutput != null ? currentOutput.getFile() : null);
        if (StringUtils.isNullOrEmpty(strConvertFileToBase64)) {
            callback.sendError(ErrorsMediaCapture.ErrorRecordAudio);
        } else {
            Intrinsics.checkNotNull(strConvertFileToBase64);
            callback.sendEvent(strConvertFileToBase64);
        }
    }
}
