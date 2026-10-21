package com.bbva.plugin.permissions.command;

import android.app.Activity;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.permission.PermissionReport;
import com.bbva.androidtoolkit.plugin.permission.PermissionResultListener;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.permissions.Injector;
import com.bbva.plugin.permissions.PermissionHandler;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RequestPermissionCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/bbva/plugin/permissions/command/RequestPermissionCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/permissions/command/PermissionRequestDTO;", "Lcom/bbva/androidtoolkit/plugin/permission/PermissionResultListener;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/androidtoolkit/plugin/permission/PermissionReport;", "result", "onRequestPermissionFinish", "<init>", "()V", "Companion", "permissions-plugin_release"}, k = 1, mv = {1, 6, 0})
public final class RequestPermissionCommand extends AbstractCommand<PermissionRequestDTO> implements PermissionResultListener {

    @NotNull
    public static final String ID = "request";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CommandCallback f35891p0;

    public RequestPermissionCommand() {
        super(PermissionRequestDTO.class, new RequestValidator());
    }

    @Override // com.bbva.androidtoolkit.plugin.permission.PermissionResultListener
    public void onRequestPermissionFinish(@NotNull PermissionReport result) {
        Intrinsics.checkNotNullParameter(result, "result");
        CommandCallback commandCallback = null;
        if (result.areAllGranted()) {
            CommandCallback commandCallback2 = this.f35891p0;
            if (commandCallback2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("callback");
            } else {
                commandCallback = commandCallback2;
            }
            commandCallback.sendEvent();
            return;
        }
        boolean zHasPermanentlyDeniedAnyPermission = result.hasPermanentlyDeniedAnyPermission();
        if (zHasPermanentlyDeniedAnyPermission) {
            CommandCallback commandCallback3 = this.f35891p0;
            if (commandCallback3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("callback");
            } else {
                commandCallback = commandCallback3;
            }
            commandCallback.sendError(Errors.ErrorPermissionPermanentlyDenied);
            return;
        }
        if (zHasPermanentlyDeniedAnyPermission) {
            throw new NoWhenBranchMatchedException();
        }
        CommandCallback commandCallback4 = this.f35891p0;
        if (commandCallback4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
        } else {
            commandCallback = commandCallback4;
        }
        commandCallback.sendError(Errors.ErrorPermissionDenied);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull PermissionRequestDTO params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f35891p0 = callback;
        Optional<Activity> optional = this.mActivityContainer.get();
        if (!optional.isPresent()) {
            callback.sendError(Errors.ErrorNotAvailable);
            return;
        }
        PermissionHandler permissionHandler = Injector.INSTANCE.getPermissionHandler();
        Activity activity = optional.get();
        Intrinsics.checkNotNullExpressionValue(activity, "activityOptional.get()");
        String name = params.getName();
        Intrinsics.checkNotNull(name);
        permissionHandler.request(activity, name, this);
    }
}
