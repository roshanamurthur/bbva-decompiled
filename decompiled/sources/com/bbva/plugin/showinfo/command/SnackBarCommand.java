package com.bbva.plugin.showinfo.command;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.showinfo.SnackBarValidator;
import com.bbva.plugin.showinfo.data.SnackBarActionButtonPayloadDTO;
import com.bbva.plugin.showinfo.data.SnackBarDTO;
import com.bbva.plugin.showinfo.manager.InfoHandler;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnackBarCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B#\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u0011"}, d2 = {"Lcom/bbva/plugin/showinfo/command/SnackBarCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/showinfo/data/SnackBarDTO;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "", "", "", "images", "Lcom/bbva/plugin/showinfo/manager/InfoHandler;", "infoHandler", "<init>", "(Ljava/util/Map;Lcom/bbva/plugin/showinfo/manager/InfoHandler;)V", "Companion", "showinfo-plugin_release"}, k = 1, mv = {1, 9, 0})
public final class SnackBarCommand extends AbstractCommand<SnackBarDTO> {

    @NotNull
    public static final String ID = "snackbar";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Map<String, Integer> f36004p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final InfoHandler f36005q0;

    /* JADX INFO: compiled from: SnackBarCommand.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        public a(Object obj) {
            super(0, obj, SnackBarCommand.class, "dispatchMessageOnActionButtonTap", "dispatchMessageOnActionButtonTap()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SnackBarCommand.access$dispatchMessageOnActionButtonTap((SnackBarCommand) this.receiver);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackBarCommand(@NotNull Map<String, Integer> images, @NotNull InfoHandler infoHandler) {
        super(SnackBarDTO.class, new SnackBarValidator());
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(infoHandler, "infoHandler");
        this.f36004p0 = images;
        this.f36005q0 = infoHandler;
    }

    public static final void access$dispatchMessageOnActionButtonTap(SnackBarCommand snackBarCommand) {
        snackBarCommand.mPostMessenger.postMessage(SnackBarActionButtonPayloadDTO.action, new SnackBarActionButtonPayloadDTO());
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull SnackBarDTO params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activity = this.mActivityContainer.get().get();
        if (activity != null) {
            this.f36005q0.showSnackBar(activity, params, this.f36004p0, new a(this));
            callback.sendEvent();
        }
    }
}
