package com.bbva.plugin.media.capture.command.impl;

import android.app.Activity;
import android.content.Intent;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityLauncher;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResult;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResultRequest;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.media.capture.command.response.ErrorsMediaCapture;
import com.bbva.plugin.media.capture.util.IOUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetAudioCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/media/capture/command/impl/GetAudioCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Ljava/lang/Void;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "<init>", "()V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class GetAudioCommand extends AbstractCommand<Void> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CommandCallback f35812p0;

    /* JADX INFO: compiled from: GetAudioCommand.kt */
    public static final class a extends Lambda implements Function1<ActivityResultRequest.Builder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f35813p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResultRequest.Builder builder) {
            ActivityResultRequest.Builder receiver = builder;
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            receiver.setAction("android.provider.MediaStore.RECORD_SOUND");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: GetAudioCommand.kt */
    public static final class b extends Lambda implements Function1<ActivityResult, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResult activityResult) {
            ActivityResult it = activityResult;
            Intrinsics.checkNotNullParameter(it, "it");
            boolean z10 = it instanceof ActivityResult.Success;
            GetAudioCommand getAudioCommand = GetAudioCommand.this;
            if (z10) {
                GetAudioCommand.access$onSuccess(getAudioCommand, ((ActivityResult.Success) it).getIntent());
            } else {
                GetAudioCommand.access$onCancel(getAudioCommand);
            }
            return Unit.INSTANCE;
        }
    }

    public GetAudioCommand() {
        super(Void.class);
    }

    public static final void access$onCancel(GetAudioCommand getAudioCommand) {
        CommandCallback commandCallback = getAudioCommand.f35812p0;
        if (commandCallback != null) {
            commandCallback.sendError(ErrorsMediaCapture.ErrorCaptureCancelled);
        }
    }

    public static final void access$onSuccess(GetAudioCommand getAudioCommand, Intent intent) {
        Optional<Activity> activityOptional = getAudioCommand.mActivityContainer.get();
        Intrinsics.checkNotNullExpressionValue(activityOptional, "activityOptional");
        if (!activityOptional.isPresent()) {
            CommandCallback commandCallback = getAudioCommand.f35812p0;
            if (commandCallback != null) {
                commandCallback.sendError(Errors.ErrorNotAvailable);
                return;
            }
            return;
        }
        Activity activity = activityOptional.get();
        Intrinsics.checkNotNullExpressionValue(activity, "activityOptional.get()");
        String base64StringFromIntent = IOUtils.getBase64StringFromIntent(intent, activity);
        if (base64StringFromIntent != null) {
            CommandCallback commandCallback2 = getAudioCommand.f35812p0;
            if (commandCallback2 != null) {
                commandCallback2.sendEvent(base64StringFromIntent);
                return;
            }
            return;
        }
        CommandCallback commandCallback3 = getAudioCommand.f35812p0;
        if (commandCallback3 != null) {
            commandCallback3.sendError(ErrorsMediaCapture.ErrorCaptureAudio);
        }
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f35812p0 = callback;
        Optional<Activity> activityOptional = this.mActivityContainer.get();
        Intrinsics.checkNotNullExpressionValue(activityOptional, "activityOptional");
        if (!activityOptional.isPresent()) {
            callback.sendError(Errors.ErrorNotAvailable);
            return;
        }
        Intent intent = new Intent("android.provider.MediaStore.RECORD_SOUND");
        Activity activity = activityOptional.get();
        Intrinsics.checkNotNullExpressionValue(activity, "activity");
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            new ActivityLauncher().create(a.f35813p0).listen(new b()).launch(activity);
        } else {
            callback.sendError(ErrorsMediaCapture.ErrorApplicationAudio);
        }
    }
}
