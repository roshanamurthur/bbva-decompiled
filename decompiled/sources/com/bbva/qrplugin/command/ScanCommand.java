package com.bbva.qrplugin.command;

import android.app.Activity;
import android.os.Bundle;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResult;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResultRequest;
import com.bbva.androidtoolkit.plugin.activity.result.LaunchResultCallback;
import com.bbva.androidtoolkit.plugin.command.PermissionCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.androidtoolkit.utils.ResourceUtils;
import com.bbva.qr.activity.ScannerActivity;
import com.bbva.qr.model.input.CustomViewConfig;
import com.bbva.qr.model.input.ScannerSettings;
import com.bbva.qr.utils.ConstantsKt;
import com.bbva.qrplugin.di.Injector;
import com.bbva.qrplugin.extension.ActivityResultKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ScanCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\u0007"}, d2 = {"Lcom/bbva/qrplugin/command/ScanCommand;", "Lcom/bbva/androidtoolkit/plugin/command/PermissionCommand;", "Lcom/bbva/qr/model/input/ScannerSettings;", "", "executeWithPermissionsGranted", "<init>", "()V", "qr-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class ScanCommand extends PermissionCommand<ScannerSettings> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ScannerSettings f36350q0;

    /* JADX INFO: compiled from: ScanCommand.kt */
    @SourceDebugExtension({"SMAP\nScanCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanCommand.kt\ncom/bbva/qrplugin/command/ScanCommand$executeWithPermissionsGranted$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
    public static final class a extends Lambda implements Function1<ActivityResultRequest.Builder, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResultRequest.Builder builder) {
            ActivityResultRequest.Builder create = builder;
            Intrinsics.checkNotNullParameter(create, "$this$create");
            Bundle bundle = new Bundle();
            ScannerSettings scannerSettings = ScanCommand.this.f36350q0;
            if (scannerSettings == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scanParams");
                scannerSettings = null;
            }
            bundle.putParcelable(ConstantsKt.QR_INTENT_PARAMS, scannerSettings);
            create.setExtras(bundle);
            create.setTarget(ScannerActivity.class);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ScanCommand.kt */
    public static final class b extends Lambda implements Function1<ActivityResult, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResult activityResult) {
            ActivityResult it = activityResult;
            Intrinsics.checkNotNullParameter(it, "it");
            ScanCommand scanCommand = ScanCommand.this;
            CommandCallback mCommandCallback = ((PermissionCommand) scanCommand).mCommandCallback;
            Intrinsics.checkNotNullExpressionValue(mCommandCallback, "mCommandCallback");
            ScanCommand.access$processActivityResult(scanCommand, it, mCommandCallback);
            return Unit.INSTANCE;
        }
    }

    public ScanCommand() {
        super(ScannerSettings.class, 2, "android.permission.CAMERA");
    }

    public static final void access$processActivityResult(ScanCommand scanCommand, ActivityResult activityResult, CommandCallback commandCallback) {
        CommandCallback commandCallback2;
        scanCommand.getClass();
        if (!(activityResult instanceof ActivityResult.Success)) {
            if (!(activityResult instanceof ActivityResult.Cancel) || (commandCallback2 = scanCommand.mCommandCallback) == null) {
                return;
            }
            commandCallback2.sendError(Errors.ErrorCanceled);
            return;
        }
        ActivityResult.Success success = (ActivityResult.Success) activityResult;
        Bundle extras = success.getIntent().getExtras();
        if (extras != null) {
            if (!extras.containsKey(ConstantsKt.IS_TIMEOUT)) {
                commandCallback.sendEvent(ActivityResultKt.parseIntentData(success));
                return;
            }
            CommandCallback commandCallback3 = scanCommand.mCommandCallback;
            if (commandCallback3 != null) {
                commandCallback3.sendError("timeout");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.PermissionCommand
    public void executeWithPermissionsGranted() {
        ScannerSettings scannerSettingsCopy$default;
        Object objM5535constructorimpl;
        String name;
        Optional<Activity> optional = this.mActivityContainer.get();
        if (!optional.isPresent()) {
            this.mCommandCallback.sendError(Errors.ErrorDefault);
            return;
        }
        T t10 = this.mParams;
        if (t10 == 0) {
            CommandCallback commandCallback = this.mCommandCallback;
            if (commandCallback != null) {
                commandCallback.sendError(Errors.ErrorMalformedParam);
                return;
            }
            return;
        }
        CustomViewConfig customViewConfig = ((ScannerSettings) t10).getCustomViewConfig();
        if (customViewConfig == null || (name = customViewConfig.getName()) == null) {
            T mParams = this.mParams;
            Intrinsics.checkNotNullExpressionValue(mParams, "mParams");
            scannerSettingsCopy$default = (ScannerSettings) mParams;
        } else {
            T mParams2 = this.mParams;
            Intrinsics.checkNotNullExpressionValue(mParams2, "mParams");
            ScannerSettings scannerSettings = (ScannerSettings) mParams2;
            Integer numValueOf = Integer.valueOf(ResourceUtils.getLayoutId(this.mApplication.getApplicationContext(), name));
            CustomViewConfig customViewConfig2 = ((ScannerSettings) this.mParams).getCustomViewConfig();
            scannerSettingsCopy$default = ScannerSettings.copy$default(scannerSettings, null, null, new CustomViewConfig(numValueOf, null, customViewConfig2 != null ? customViewConfig2.getOptions() : null, 2, null), null, null, ((ScannerSettings) this.mParams).getCameraTimeout(), 27, null);
            if (scannerSettingsCopy$default == null) {
                T mParams3 = this.mParams;
                Intrinsics.checkNotNullExpressionValue(mParams3, "mParams");
                scannerSettingsCopy$default = (ScannerSettings) mParams3;
            }
        }
        this.f36350q0 = scannerSettingsCopy$default;
        try {
            Result.Companion companion = Result.INSTANCE;
            LaunchResultCallback launchResultCallbackListen = Injector.INSTANCE.getActivityLauncher().create(new a()).listen(new b());
            Activity activity = optional.get();
            Intrinsics.checkNotNullExpressionValue(activity, "activity.get()");
            launchResultCallbackListen.launch(activity);
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            this.mCommandCallback.sendError(Errors.ErrorDefault);
        }
    }
}
