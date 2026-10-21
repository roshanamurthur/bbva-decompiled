package com.bbva.plugin.showinfo.command;

import android.app.Application;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.showinfo.ToastValidator;
import com.bbva.plugin.showinfo.data.ToastDTO;
import com.bbva.plugin.showinfo.manager.InfoHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ToastCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/plugin/showinfo/command/ToastCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/showinfo/data/ToastDTO;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/plugin/showinfo/manager/InfoHandler;", "infoHandler", "<init>", "(Lcom/bbva/plugin/showinfo/manager/InfoHandler;)V", "Companion", "showinfo-plugin_release"}, k = 1, mv = {1, 9, 0})
public final class ToastCommand extends AbstractCommand<ToastDTO> {

    @NotNull
    public static final String ID = "toast";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final InfoHandler f36006p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastCommand(@NotNull InfoHandler infoHandler) {
        super(ToastDTO.class, new ToastValidator());
        Intrinsics.checkNotNullParameter(infoHandler, "infoHandler");
        this.f36006p0 = infoHandler;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull ToastDTO params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Application mApplication = this.mApplication;
        Intrinsics.checkNotNullExpressionValue(mApplication, "mApplication");
        this.f36006p0.showToast(mApplication, params);
        callback.sendEvent();
    }
}
