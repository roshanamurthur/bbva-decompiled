package com.bbva.plugin.media.capture;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.plugin.media.capture.command.impl.GetAudioCommand;
import com.bbva.plugin.media.capture.command.impl.GetPictureCommand;
import com.bbva.plugin.media.capture.command.impl.GetVideoCommand;
import com.bbva.plugin.media.capture.command.impl.StartRecordingAudioCommand;
import com.bbva.plugin.media.capture.command.impl.StopRecordingAudioCommand;
import com.bbva.plugin.media.capture.media.audio.MediaRecorderController;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MediaCaptureCommandFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/bbva/plugin/media/capture/MediaCaptureCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "controller", "Lcom/bbva/plugin/media/capture/media/audio/MediaRecorderController;", "(Lcom/bbva/plugin/media/capture/media/audio/MediaRecorderController;)V", "Companion", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class MediaCaptureCommandFactory extends CommandFactory {

    @NotNull
    public static final String ACTION_GETAUDIO = "getaudio";

    @NotNull
    public static final String ACTION_GETPICTURE = "getpicture";

    @NotNull
    public static final String ACTION_GETVIDEO = "getvideo";

    @NotNull
    public static final String ACTION_STARTRECORDINGAUDIO = "startrecordingaudio";

    @NotNull
    public static final String ACTION_STOPRECORDINGAUDIO = "stoprecordingaudio";

    /* JADX INFO: compiled from: MediaCaptureCommandFactory.kt */
    public static final class a implements CommandProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35807a = new a();

        @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
        public final AbstractCommand<Object> create() {
            return new GetVideoCommand(null, 1, null);
        }
    }

    /* JADX INFO: compiled from: MediaCaptureCommandFactory.kt */
    public static final class b implements CommandProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f35808a = new b();

        @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
        public final AbstractCommand<Object> create() {
            return new GetPictureCommand();
        }
    }

    /* JADX INFO: compiled from: MediaCaptureCommandFactory.kt */
    public static final class c implements CommandProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f35809a = new c();

        @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
        public final AbstractCommand<Object> create() {
            return new GetAudioCommand();
        }
    }

    /* JADX INFO: compiled from: MediaCaptureCommandFactory.kt */
    public static final class d implements CommandProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MediaRecorderController f35810a;

        public d(MediaRecorderController mediaRecorderController) {
            this.f35810a = mediaRecorderController;
        }

        @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
        public final AbstractCommand<Object> create() {
            return new StartRecordingAudioCommand(this.f35810a);
        }
    }

    /* JADX INFO: compiled from: MediaCaptureCommandFactory.kt */
    public static final class e implements CommandProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MediaRecorderController f35811a;

        public e(MediaRecorderController mediaRecorderController) {
            this.f35811a = mediaRecorderController;
        }

        @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
        public final AbstractCommand<Object> create() {
            return new StopRecordingAudioCommand(this.f35811a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaCaptureCommandFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ MediaCaptureCommandFactory(MediaRecorderController mediaRecorderController, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new MediaRecorderController(null, 1, null) : mediaRecorderController);
    }

    public MediaCaptureCommandFactory(@NotNull MediaRecorderController controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        addCommandProvider(ACTION_GETVIDEO, a.f35807a);
        addCommandProvider(ACTION_GETPICTURE, b.f35808a);
        addCommandProvider(ACTION_GETAUDIO, c.f35809a);
        addCommandProvider(ACTION_STARTRECORDINGAUDIO, new d(controller));
        addCommandProvider(ACTION_STOPRECORDINGAUDIO, new e(controller));
    }
}
