package com.bbva.ocrcardplugin.command.impl;

import android.app.Activity;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResult;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResultRequest;
import com.bbva.androidtoolkit.plugin.activity.result.LaunchResultCallback;
import com.bbva.androidtoolkit.plugin.command.PermissionCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ocrcard.command.params.ScanParams;
import com.bbva.ocrcard.extension.ScanParamsKt;
import com.bbva.ocrcardplugin.command.response.OCRErrors;
import com.bbva.ocrcardplugin.di.Injector;
import com.bbva.ocrcardplugin.extension.CreditCardKt;
import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ScanCommand.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\u0007"}, d2 = {"Lcom/bbva/ocrcardplugin/command/impl/ScanCommand;", "Lcom/bbva/androidtoolkit/plugin/command/PermissionCommand;", "Lcom/bbva/ocrcard/command/params/ScanParams;", "", "executeWithPermissionsGranted", "<init>", "()V", "ocrcard-plugin_release"}, k = 1, mv = {1, 5, 1})
public final class ScanCommand extends PermissionCommand<ScanParams> {

    /* JADX INFO: compiled from: ScanCommand.kt */
    public static final class a extends Lambda implements Function1<ActivityResultRequest.Builder, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResultRequest.Builder builder) {
            ActivityResultRequest.Builder create = builder;
            Intrinsics.checkNotNullParameter(create, "$this$create");
            Object mParams = ((PermissionCommand) ScanCommand.this).mParams;
            Intrinsics.checkNotNullExpressionValue(mParams, "mParams");
            create.setExtras(ScanParamsKt.toBundle(com.bbva.ocrcardplugin.extension.ScanParamsKt.checkUnsetForDefaults((ScanParams) mParams)));
            create.setTarget(CardIOActivity.class);
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
        super(ScanParams.class, 2, "android.permission.CAMERA");
    }

    public static final void access$processActivityResult(ScanCommand scanCommand, ActivityResult activityResult, CommandCallback commandCallback) {
        CommandCallback commandCallback2;
        Unit unit;
        scanCommand.getClass();
        if (!(activityResult instanceof ActivityResult.Success)) {
            if (!(activityResult instanceof ActivityResult.Cancel) || (commandCallback2 = scanCommand.mCommandCallback) == null) {
                return;
            }
            commandCallback2.sendError(Errors.ErrorCanceled);
            return;
        }
        CreditCard creditCard = (CreditCard) ((ActivityResult.Success) activityResult).getIntent().getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT);
        if (creditCard == null) {
            unit = null;
        } else {
            commandCallback.sendEvent(CreditCardKt.parseResponse(creditCard));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            commandCallback.sendError(OCRErrors.ERROR_SCANNED_BUT_NO_RESULT);
        }
    }

    @Override // com.bbva.androidtoolkit.plugin.command.PermissionCommand
    public void executeWithPermissionsGranted() {
        Object objM5535constructorimpl;
        if (this.mParams == 0) {
            CommandCallback commandCallback = this.mCommandCallback;
            if (commandCallback == null) {
                return;
            }
            commandCallback.sendError(Errors.ErrorMalformedParam);
            return;
        }
        Optional<Activity> optional = this.mActivityContainer.get();
        if (!optional.isPresent()) {
            this.mCommandCallback.sendError(Errors.ErrorDefault);
            return;
        }
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
