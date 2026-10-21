package com.bbva.selfiecapture.plugin.di;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.selfiecapture.plugin.command.SelfieCapturable;
import com.bbva.selfiecapture.plugin.command.params.response.SelfieCaptureErrors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0000¨\u0006\u0007"}, d2 = {"withSelfieCapture", "", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "block", "Lkotlin/Function1;", "Lcom/bbva/selfiecapture/plugin/command/SelfieCapturable;", "selfie-capture-plugin_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InjectorKt {
    public static final void withSelfieCapture(@NotNull CommandCallback callback, @NotNull Function1<? super SelfieCapturable, Unit> block) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(block, "block");
        SelfieCapturable scapture$selfie_capture_plugin_release = Injector.INSTANCE.getScapture$selfie_capture_plugin_release();
        if (scapture$selfie_capture_plugin_release == null) {
            callback.sendError(SelfieCaptureErrors.SELFIE_CAPTURE_NOT_INITIALIZED);
            return;
        }
        try {
            block.invoke(scapture$selfie_capture_plugin_release);
        } catch (Exception unused) {
            callback.sendError(Errors.ErrorDefault);
        }
    }
}
