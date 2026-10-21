package com.bbva.discreetmode.plugin.commands;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.discreetmode.DiscreetMode;
import com.bbva.discreetmode.plugin.commands.models.DiscreetModeStateDTO;
import com.bbva.discreetmode.plugin.commands.models.StartMonitoringParams;
import com.bbva.discreetmode.plugin.commands.validators.StartMonitoringParamsValidator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StartMonitoringCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/discreetmode/plugin/commands/StartMonitoringCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/discreetmode/plugin/commands/models/StartMonitoringParams;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/discreetmode/DiscreetMode;", "discreetMode", "<init>", "(Lcom/bbva/discreetmode/DiscreetMode;)V", "Companion", "discreetmode-plugin_release"}, k = 1, mv = {1, 5, 1})
public final class StartMonitoringCommand extends AbstractCommand<StartMonitoringParams> {

    @NotNull
    public static final String ID = "startmonitoring";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final DiscreetMode f29087p0;

    /* JADX INFO: compiled from: StartMonitoringCommand.kt */
    public static final class a extends Lambda implements Function1<DiscreetMode.State, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DiscreetMode.State state) {
            DiscreetMode.State it = state;
            Intrinsics.checkNotNullParameter(it, "it");
            StartMonitoringCommand.access$notifyDiscreetModeState(StartMonitoringCommand.this, it);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartMonitoringCommand(@NotNull DiscreetMode discreetMode) {
        super(StartMonitoringParams.class, new StartMonitoringParamsValidator());
        Intrinsics.checkNotNullParameter(discreetMode, "discreetMode");
        this.f29087p0 = discreetMode;
    }

    public static final void access$notifyDiscreetModeState(StartMonitoringCommand startMonitoringCommand, DiscreetMode.State state) {
        startMonitoringCommand.mPostMessenger.postMessage(DiscreetModeStateDTO.action, DiscreetModeStateDTO.INSTANCE.create(state));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull StartMonitoringParams params, @Nullable CommandCallback callback) {
        DiscreetMode.Type type;
        Intrinsics.checkNotNullParameter(params, "params");
        String type2 = params.getType();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        if (type2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = type2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        int iHashCode = lowerCase.hashCode();
        AppCompatActivity appCompatActivity = null;
        if (iHashCode != -1395242759) {
            if (iHashCode != 3029889) {
                if (iHashCode == 3135069 && lowerCase.equals("face")) {
                    type = DiscreetMode.Type.CAMERA;
                } else {
                    type = null;
                }
            } else if (lowerCase.equals("both")) {
                type = DiscreetMode.Type.BOTH;
            } else {
                type = null;
            }
        } else if (lowerCase.equals("proximitysensor")) {
            type = DiscreetMode.Type.PROXIMITY;
        } else {
            type = null;
        }
        if (type == null) {
            if (callback == null) {
                return;
            }
            callback.sendError(Errors.ErrorMalformedParam);
            return;
        }
        Optional<Activity> optional = this.mActivityContainer.get();
        if (optional.isPresent()) {
            Activity activity = optional.get();
            if (activity instanceof AppCompatActivity) {
                appCompatActivity = (AppCompatActivity) activity;
            }
        }
        if (appCompatActivity == null) {
            if (callback == null) {
                return;
            }
            callback.sendError(Errors.ErrorNotAvailable);
        } else {
            this.f29087p0.startMonitoring(appCompatActivity, type, new a());
            if (callback == null) {
                return;
            }
            callback.sendEvent();
        }
    }
}
