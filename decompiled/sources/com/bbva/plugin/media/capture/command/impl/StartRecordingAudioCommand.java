package com.bbva.plugin.media.capture.command.impl;

import android.app.Application;
import com.bbva.androidtoolkit.plugin.command.PermissionCommand;
import com.bbva.plugin.media.capture.command.response.ErrorsMediaCapture;
import com.bbva.plugin.media.capture.media.audio.MediaRecorderController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StartRecordingAudioCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\t"}, d2 = {"Lcom/bbva/plugin/media/capture/command/impl/StartRecordingAudioCommand;", "Lcom/bbva/androidtoolkit/plugin/command/PermissionCommand;", "Ljava/lang/Void;", "", "executeWithPermissionsGranted", "Lcom/bbva/plugin/media/capture/media/audio/MediaRecorderController;", "mMediaRecorderController", "<init>", "(Lcom/bbva/plugin/media/capture/media/audio/MediaRecorderController;)V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class StartRecordingAudioCommand extends PermissionCommand<Void> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MediaRecorderController f35821q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartRecordingAudioCommand(@NotNull MediaRecorderController mMediaRecorderController) {
        super(Void.class, 2, "android.permission.RECORD_AUDIO");
        Intrinsics.checkNotNullParameter(mMediaRecorderController, "mMediaRecorderController");
        this.f35821q0 = mMediaRecorderController;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.PermissionCommand
    public void executeWithPermissionsGranted() {
        Application mApplication = this.mApplication;
        Intrinsics.checkNotNullExpressionValue(mApplication, "mApplication");
        if (this.f35821q0.start(mApplication)) {
            this.mCommandCallback.sendEvent();
        } else {
            this.mCommandCallback.sendError(ErrorsMediaCapture.ErrorCannotStart);
        }
    }
}
