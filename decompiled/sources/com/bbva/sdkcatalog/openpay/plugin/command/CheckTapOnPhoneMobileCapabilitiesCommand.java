package com.bbva.sdkcatalog.openpay.plugin.command;

import android.app.Activity;
import android.content.Context;
import android.nfc.NfcAdapter;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.sdkcatalog.openpay.plugin.BuildHelper;
import com.bbva.sdkcatalog.openpay.plugin.CommandExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.data.response.CheckMobileCapabilitiesResponse;
import com.bbva.sdkcatalog.openpay.plugin.data.response.Reason;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CheckTapOnPhoneMobileCapabilitiesCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/command/CheckTapOnPhoneMobileCapabilitiesCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "", "<init>", "()V", "execute", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "(Lkotlin/Unit;Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;)V", "validateCapabilitiesWithReason", "Lcom/bbva/sdkcatalog/openpay/plugin/data/response/Reason;", "context", "Landroid/content/Context;", "checkMobileCapabilities", "Lkotlin/Result;", "checkMobileCapabilities-gIAlu-s", "(Landroid/content/Context;Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;)Ljava/lang/Object;", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckTapOnPhoneMobileCapabilitiesCommand extends AbstractCommand<Unit> {
    public CheckTapOnPhoneMobileCapabilitiesCommand() {
        super(Unit.class);
    }

    /* JADX INFO: renamed from: checkMobileCapabilities-gIAlu-s, reason: not valid java name */
    private final Object m4961checkMobileCapabilitiesgIAlus(Context context, CommandCallback callback) {
        Object objM5535constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Reason reasonValidateCapabilitiesWithReason = validateCapabilitiesWithReason(context);
            Gson mGson = this.mGson;
            Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
            CommandExtensionsKt.sendJsonObjectEvent(callback, mGson, new CheckMobileCapabilitiesResponse(reasonValidateCapabilitiesWithReason == null, reasonValidateCapabilitiesWithReason));
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            callback.sendError(Errors.ErrorDefault);
        }
        return objM5535constructorimpl;
    }

    private final Reason validateCapabilitiesWithReason(Context context) {
        BuildHelper buildHelper = BuildHelper.INSTANCE;
        if (buildHelper.getVersionCode() < 30) {
            return Reason.UNSUPPORTED_ANDROID_VERSION;
        }
        if (!buildHelper.isTapOnPhoneEnabled()) {
            return Reason.TAP_ON_PHONE_NOT_IMPLEMENTED;
        }
        if (NfcAdapter.getDefaultAdapter(context) == null) {
            return Reason.NO_NFC;
        }
        return null;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Unit params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Optional<Activity> optional = this.mActivityContainer.get();
        if (!optional.isPresent()) {
            callback.sendError(Errors.ErrorNotAvailable);
            return;
        }
        Activity activity = optional.get();
        Intrinsics.checkNotNullExpressionValue(activity, "get(...)");
        m4961checkMobileCapabilitiesgIAlus(activity, callback);
    }
}
