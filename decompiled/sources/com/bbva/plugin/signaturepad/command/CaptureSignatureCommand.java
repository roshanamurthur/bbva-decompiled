package com.bbva.plugin.signaturepad.command;

import android.app.Activity;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityCreatorRequest;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResult;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResultRequest;
import com.bbva.androidtoolkit.plugin.activity.result.LaunchResultCallback;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.signaturepad.ui.SignaturePadActivity;
import com.bbva.signaturepad.util.AuxCache;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CaptureSignatureCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/plugin/signaturepad/command/CaptureSignatureCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityCreatorRequest;", "activityLauncher", "<init>", "(Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityCreatorRequest;)V", "Companion", "signaturepad-plugin_release"}, k = 1, mv = {1, 9, 0})
public final class CaptureSignatureCommand extends AbstractCommand {
    public static final int RESULT_ERROR = -2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ActivityCreatorRequest f36032p0;

    /* JADX INFO: compiled from: CaptureSignatureCommand.kt */
    public static final class a extends Lambda implements Function1<ActivityResultRequest.Builder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f36033p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResultRequest.Builder builder) {
            ActivityResultRequest.Builder create = builder;
            Intrinsics.checkNotNullParameter(create, "$this$create");
            create.setTarget(SignaturePadActivity.class);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CaptureSignatureCommand.kt */
    public static final class b extends Lambda implements Function1<ActivityResult, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f36035q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CommandCallback commandCallback) {
            super(1);
            this.f36035q0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResult activityResult) {
            ActivityResult it = activityResult;
            Intrinsics.checkNotNullParameter(it, "it");
            boolean z10 = it instanceof ActivityResult.Success;
            CommandCallback commandCallback = this.f36035q0;
            if (z10) {
                CaptureSignatureCommand.access$processResult(CaptureSignatureCommand.this, ((ActivityResult.Success) it).getResultCode(), commandCallback);
            } else if (it instanceof ActivityResult.Cancel) {
                commandCallback.sendError(Errors.ErrorCanceled);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureSignatureCommand(@NotNull ActivityCreatorRequest activityLauncher) {
        super(Void.class);
        Intrinsics.checkNotNullParameter(activityLauncher, "activityLauncher");
        this.f36032p0 = activityLauncher;
    }

    public static final void access$processResult(CaptureSignatureCommand captureSignatureCommand, int i10, CommandCallback commandCallback) {
        captureSignatureCommand.getClass();
        if (i10 != -2) {
            AuxCache auxCache = AuxCache.INSTANCE;
            if (auxCache.getSUCCESS_DIGITAL_SIGN_DATA().length() != 0) {
                commandCallback.sendEvent(auxCache.getSUCCESS_DIGITAL_SIGN_DATA());
                auxCache.setSUCCESS_DIGITAL_SIGN_DATA("");
                return;
            }
        }
        commandCallback.sendError(Errors.ErrorDefault);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Optional<Activity> optional = this.mActivityContainer.get();
        if (!optional.isPresent()) {
            callback.sendError(Errors.ErrorDefault);
            return;
        }
        try {
            LaunchResultCallback launchResultCallbackListen = this.f36032p0.create(a.f36033p0).listen(new b(callback));
            Activity activity = optional.get();
            Intrinsics.checkNotNullExpressionValue(activity, "get(...)");
            launchResultCallbackListen.launch(activity);
        } catch (Exception unused) {
            callback.sendError(Errors.ErrorDefault);
        }
    }
}
