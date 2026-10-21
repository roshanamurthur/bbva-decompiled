package com.bbva.plugin.analyticsdata.command;

import com.adobe.marketing.mobile.MobilePrivacyStatus;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.analyticsdata.command.params.SetPrivacyStatusParams;
import com.bbva.plugin.analyticsdata.command.validator.ParamsValidator;
import com.bbva.plugin.analyticsdata.controller.Analytics;
import com.bbva.plugin.analyticsdata.di.InjectorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SetPrivacyStatusCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/analyticsdata/command/SetPrivacyStatusCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/analyticsdata/command/params/SetPrivacyStatusParams;", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "analyticsdata-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SetPrivacyStatusCommand extends AbstractCommand<SetPrivacyStatusParams> {

    @NotNull
    public static final String ID = "setprivacystatus";

    /* JADX INFO: compiled from: SetPrivacyStatusCommand.kt */
    public static final class a extends Lambda implements Function1<Analytics, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SetPrivacyStatusParams f35575p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35576q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SetPrivacyStatusParams setPrivacyStatusParams, CommandCallback commandCallback) {
            super(1);
            this.f35575p0 = setPrivacyStatusParams;
            this.f35576q0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Analytics analytics) {
            Analytics it = analytics;
            Intrinsics.checkNotNullParameter(it, "it");
            int status = this.f35575p0.getStatus();
            if (status == 0) {
                it.setPrivacyStatus(MobilePrivacyStatus.OPT_IN);
            } else if (status == 1) {
                it.setPrivacyStatus(MobilePrivacyStatus.OPT_OUT);
            } else if (status == 2) {
                it.setPrivacyStatus(MobilePrivacyStatus.UNKNOWN);
            }
            this.f35576q0.sendEvent();
            return Unit.INSTANCE;
        }
    }

    public SetPrivacyStatusCommand() {
        super(SetPrivacyStatusParams.class, new ParamsValidator(), 2);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable SetPrivacyStatusParams params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (params == null) {
            callback.sendError(Errors.ErrorMalformedParam);
        } else {
            InjectorKt.withAnalytics(callback, new a(params, callback));
        }
    }
}
