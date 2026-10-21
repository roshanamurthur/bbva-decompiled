package com.bbva.actionlauncher.plugin.commands;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.actionlauncher.plugin.extensions.CommandsExtensionsKt;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.cells.validator.ValidatorChecker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActionLauncherCommand.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/bbva/actionlauncher/plugin/commands/ActionLauncherCommand;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "(Ljava/lang/Object;Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;)V", "", "executeInternal", "(Ljava/lang/Object;)Z", "Lcom/bbva/actionlauncher/ActionLauncher;", "p0", "Lcom/bbva/actionlauncher/ActionLauncher;", "getActionLauncher", "()Lcom/bbva/actionlauncher/ActionLauncher;", "actionLauncher", "Ljava/lang/Class;", "clazz", "Lcom/cells/validator/ValidatorChecker;", "validator", "<init>", "(Ljava/lang/Class;Lcom/bbva/actionlauncher/ActionLauncher;Lcom/cells/validator/ValidatorChecker;)V", "actionlauncher-plugin_release"}, k = 1, mv = {1, 8, 0})
public abstract class ActionLauncherCommand<T> extends AbstractCommand<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ActionLauncher actionLauncher;

    /* JADX INFO: compiled from: ActionLauncherCommand.kt */
    public static final class a extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ActionLauncherCommand<T> f26464p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T f26465q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ActionLauncherCommand<T> actionLauncherCommand, T t10) {
            super(0);
            this.f26464p0 = actionLauncherCommand;
            this.f26465q0 = t10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f26464p0.executeInternal(this.f26465q0));
        }
    }

    public /* synthetic */ ActionLauncherCommand(Class cls, ActionLauncher actionLauncher, ValidatorChecker validatorChecker, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, actionLauncher, (i10 & 4) != 0 ? null : validatorChecker);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(T params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        CommandsExtensionsKt.notifyResult(callback, new a(this, params));
    }

    public abstract boolean executeInternal(T params);

    @NotNull
    public final ActionLauncher getActionLauncher() {
        return this.actionLauncher;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionLauncherCommand(@NotNull Class<T> clazz, @NotNull ActionLauncher actionLauncher, @Nullable ValidatorChecker<T> validatorChecker) {
        super(clazz, validatorChecker);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(actionLauncher, "actionLauncher");
        this.actionLauncher = actionLauncher;
    }
}
