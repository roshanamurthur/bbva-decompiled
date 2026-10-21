package com.bbva.plugin.permissions.command;

import android.app.Activity;
import androidx.room.a;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.androidtoolkit.plugin.response.SimpleResponse;
import com.bbva.plugin.permissions.Injector;
import com.bbva.plugin.permissions.PermissionHandler;
import com.bbva.plugin.permissions.PermissionState;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CheckPermissionStateCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/permissions/command/CheckPermissionStateCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/permissions/command/PermissionRequestDTO;", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "permissions-plugin_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CheckPermissionStateCommand extends AbstractCommand<PermissionRequestDTO> {

    @NotNull
    public static final String ID = "checkstate";

    public CheckPermissionStateCommand() {
        super(PermissionRequestDTO.class, new RequestValidator());
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull PermissionRequestDTO params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activity = this.mActivityContainer.get().get();
        if (activity == null) {
            callback.sendError(Errors.ErrorNotAvailable);
            return;
        }
        PermissionHandler permissionHandler = Injector.INSTANCE.getPermissionHandler();
        String name = params.getName();
        Intrinsics.checkNotNull(name);
        PermissionState permissionStateCheckState = permissionHandler.checkState(activity, name);
        if (permissionStateCheckState == PermissionState.UNKNOWN) {
            callback.sendError(Errors.ErrorNotSupported);
            return;
        }
        String strName = permissionStateCheckState.name();
        Locale locale = Locale.ROOT;
        callback.sendEvent(SimpleResponse.toJson("state", a.d(locale, "ROOT", strName, locale, "this as java.lang.String).toLowerCase(locale)")));
    }
}
