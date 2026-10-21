package com.bbva.plugin.digipassmanager.commands;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityCreatorRequest;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResult;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResultRequest;
import com.bbva.androidtoolkit.plugin.activity.result.LaunchResultCallback;
import com.bbva.androidtoolkit.plugin.command.PermissionCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.library.digipassmanager.helpers.DigipassManagerHelper;
import com.bbva.plugin.digipassmanager.commands.errors.CustomErrors;
import com.bbva.plugin.digipassmanager.constants.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: OpenQRScannerCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/digipassmanager/commands/OpenQRScannerCommand;", "Lcom/bbva/androidtoolkit/plugin/command/PermissionCommand;", "", "", "executeWithPermissionsGranted", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityCreatorRequest;", "activityLauncher", "<init>", "(Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityCreatorRequest;)V", "Companion", "OpenQRScannerCommandJson", "digipassmanager-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class OpenQRScannerCommand extends PermissionCommand {

    @NotNull
    public static final String EXTRA_OUTPUT_CODE_TYPE = "output_code_type";

    @NotNull
    public static final String EXTRA_OUTPUT_OUTPUT_RESULT = "output_result";

    @NotNull
    public static final String ID = "open_qr_scanner";
    public static final int RESULT_OK = -1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ActivityCreatorRequest f35628q0;

    /* JADX INFO: compiled from: OpenQRScannerCommand.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/plugin/digipassmanager/commands/OpenQRScannerCommand$OpenQRScannerCommandJson;", "", "(Lcom/bbva/plugin/digipassmanager/commands/OpenQRScannerCommand;)V", "getSuccessJson", "Lorg/json/JSONObject;", "data", "", "digipassmanager-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class OpenQRScannerCommandJson {
        public OpenQRScannerCommandJson(OpenQRScannerCommand openQRScannerCommand) {
        }

        @NotNull
        public final JSONObject getSuccessJson(@NotNull String data) throws JSONException {
            Intrinsics.checkNotNullParameter(data, "data");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.QR_DATA, data);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: OpenQRScannerCommand.kt */
    public static final class a extends Lambda implements Function1<ActivityResultRequest.Builder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f35629p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResultRequest.Builder builder) {
            ActivityResultRequest.Builder create = builder;
            Intrinsics.checkNotNullParameter(create, "$this$create");
            create.setTarget(DigipassManagerHelper.INSTANCE.getInstance().getQRCodeScannerTarget());
            Bundle bundle = new Bundle();
            bundle.putBoolean("extra_vibrate", true);
            bundle.putInt("extra_code_type", 3);
            create.setExtras(bundle);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: OpenQRScannerCommand.kt */
    public static final class b extends Lambda implements Function1<ActivityResult, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResult activityResult) {
            ActivityResult it = activityResult;
            Intrinsics.checkNotNullParameter(it, "it");
            boolean z10 = it instanceof ActivityResult.Success;
            OpenQRScannerCommand openQRScannerCommand = OpenQRScannerCommand.this;
            if (z10) {
                ActivityResult.Success success = (ActivityResult.Success) it;
                int resultCode = success.getResultCode();
                Intent intent = success.getIntent();
                CommandCallback mCommandCallback = ((PermissionCommand) openQRScannerCommand).mCommandCallback;
                Intrinsics.checkNotNullExpressionValue(mCommandCallback, "mCommandCallback");
                OpenQRScannerCommand.access$processResult(openQRScannerCommand, resultCode, intent, mCommandCallback);
            } else if (it instanceof ActivityResult.Cancel) {
                ((PermissionCommand) openQRScannerCommand).mCommandCallback.sendError(CustomErrors.ScanCancelled);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenQRScannerCommand(@NotNull ActivityCreatorRequest activityLauncher) {
        super(Void.class, "android.permission.CAMERA");
        Intrinsics.checkNotNullParameter(activityLauncher, "activityLauncher");
        this.f35628q0 = activityLauncher;
    }

    public static final void access$processResult(OpenQRScannerCommand openQRScannerCommand, int i10, Intent intent, CommandCallback commandCallback) {
        openQRScannerCommand.getClass();
        if (i10 != -1) {
            commandCallback.sendError(CustomErrors.InternalError);
            return;
        }
        if (intent.getIntExtra("output_code_type", 0) != 2) {
            commandCallback.sendError(CustomErrors.NotQRCronto);
            return;
        }
        String stringExtra = intent.getStringExtra("output_result");
        if (stringExtra == null || stringExtra.length() <= 0) {
            commandCallback.sendError(CustomErrors.InternalError);
        } else {
            commandCallback.sendEvent(new OpenQRScannerCommandJson(openQRScannerCommand).getSuccessJson(stringExtra));
        }
    }

    @Override // com.bbva.androidtoolkit.plugin.command.PermissionCommand
    public void executeWithPermissionsGranted() {
        Optional<Activity> optional = this.mActivityContainer.get();
        if (!optional.isPresent()) {
            this.mCommandCallback.sendError(CustomErrors.InternalError);
            return;
        }
        try {
            LaunchResultCallback launchResultCallbackListen = this.f35628q0.create(a.f35629p0).listen(new b());
            Activity activity = optional.get();
            Intrinsics.checkNotNullExpressionValue(activity, "optionalActivity.get()");
            launchResultCallbackListen.launch(activity);
        } catch (Exception unused) {
            this.mCommandCallback.sendError(CustomErrors.InternalError);
        }
    }
}
