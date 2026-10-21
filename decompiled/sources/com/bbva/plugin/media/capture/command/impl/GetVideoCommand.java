package com.bbva.plugin.media.capture.command.impl;

import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityLauncher;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.media.capture.command.response.ErrorsMediaCapture;
import com.bbva.plugin.media.capture.media.video.VideoController;
import com.bbva.plugin.media.capture.media.video.VideoControllerFactory;
import hb.g;
import hb.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetVideoCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\f"}, d2 = {"Lcom/bbva/plugin/media/capture/command/impl/GetVideoCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Ljava/lang/Void;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/plugin/media/capture/media/video/VideoController;", "controller", "<init>", "(Lcom/bbva/plugin/media/capture/media/video/VideoController;)V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class GetVideoCommand extends AbstractCommand<Void> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CommandCallback f35819p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final VideoController f35820q0;

    /* JADX WARN: Multi-variable type inference failed */
    public GetVideoCommand() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final void access$onCancel(GetVideoCommand getVideoCommand) {
        CommandCallback commandCallback = getVideoCommand.f35819p0;
        if (commandCallback != null) {
            commandCallback.sendError(ErrorsMediaCapture.ErrorCaptureCancelled);
        }
    }

    public static final void access$onSuccess(GetVideoCommand getVideoCommand) {
        CommandCallback commandCallback;
        Application mApplication = getVideoCommand.mApplication;
        Intrinsics.checkNotNullExpressionValue(mApplication, "mApplication");
        ContentResolver contentResolver = mApplication.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "mApplication.contentResolver");
        String path = getVideoCommand.f35820q0.getPath(contentResolver);
        if (path == null || (commandCallback = getVideoCommand.f35819p0) == null) {
            return;
        }
        commandCallback.sendEvent(path);
    }

    public /* synthetic */ GetVideoCommand(VideoController videoController, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? VideoControllerFactory.INSTANCE.create() : videoController);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Optional<Activity> activityOptional = this.mActivityContainer.get();
        Intrinsics.checkNotNullExpressionValue(activityOptional, "activityOptional");
        if (!activityOptional.isPresent()) {
            callback.sendError(Errors.ErrorNotAvailable);
            return;
        }
        Activity activity = activityOptional.get();
        this.f35819p0 = callback;
        Intrinsics.checkNotNullExpressionValue(activity, "activity");
        new ActivityLauncher().create(new g(this.f35820q0.createVideoFile(activity, callback))).listen(new h(this)).launch(activity);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetVideoCommand(@NotNull VideoController controller) {
        super(Void.class, 2);
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f35820q0 = controller;
    }
}
