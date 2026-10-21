package com.bbva.plugin.showinfo.manager;

import android.content.Context;
import com.bbva.plugin.showinfo.command.HideCommand;
import com.bbva.plugin.showinfo.data.HideDTO;
import com.bbva.plugin.showinfo.data.NotificationDTO;
import com.bbva.plugin.showinfo.data.SnackBarDTO;
import com.bbva.plugin.showinfo.data.ToastDTO;
import com.bbva.plugin.showinfo.data.TooltipDTO;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfoManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH&J>\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011H&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0013H&J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0015H&¨\u0006\u0017"}, d2 = {"Lcom/bbva/plugin/showinfo/manager/InfoHandler;", "", HideCommand.ID, "", "context", "Landroid/content/Context;", "info", "Lcom/bbva/plugin/showinfo/data/HideDTO;", "showNotification", "Lcom/bbva/plugin/showinfo/data/NotificationDTO;", "showSnackBar", "Lcom/bbva/plugin/showinfo/data/SnackBarDTO;", "snackBarImages", "", "", "", "onTapButtonListener", "Lkotlin/Function0;", "showToast", "Lcom/bbva/plugin/showinfo/data/ToastDTO;", "showTooltip", "Lcom/bbva/plugin/showinfo/data/TooltipDTO;", "Companion", "showinfo-plugin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface InfoHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f36024a;
    public static final int DURATION_INDEFINITE = -1;

    @NotNull
    public static final String NOTIFICATION = "notification";

    @NotNull
    public static final String SNACKBAR = "snackbar";

    /* JADX INFO: compiled from: InfoManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bbva/plugin/showinfo/manager/InfoHandler$Companion;", "", "()V", "DURATION_INDEFINITE", "", "NOTIFICATION", "", "SNACKBAR", "showinfo-plugin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static final int DURATION_INDEFINITE = -1;

        @NotNull
        public static final String NOTIFICATION = "notification";

        @NotNull
        public static final String SNACKBAR = "snackbar";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f36024a = new Companion();
    }

    /* JADX INFO: compiled from: InfoManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showSnackBar$default(InfoHandler infoHandler, Context context, SnackBarDTO snackBarDTO, Map map, Function0 function0, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSnackBar");
            }
            if ((i10 & 8) != 0) {
                function0 = null;
            }
            infoHandler.showSnackBar(context, snackBarDTO, map, function0);
        }
    }

    void hide(@NotNull Context context, @NotNull HideDTO info);

    void showNotification(@NotNull Context context, @NotNull NotificationDTO info);

    void showSnackBar(@NotNull Context context, @NotNull SnackBarDTO info, @NotNull Map<String, Integer> snackBarImages, @Nullable Function0<Unit> onTapButtonListener);

    void showToast(@NotNull Context context, @NotNull ToastDTO info);

    void showTooltip(@NotNull Context context, @NotNull TooltipDTO info);
}
