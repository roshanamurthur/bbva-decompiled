package com.bbva.showinfo;

import android.content.Context;
import com.bbva.plugin.showinfo.command.HideCommand;
import com.bbva.plugin.showinfo.command.TooltipCommand;
import com.bbva.showinfo.generator.InfoNotificationGenerator;
import com.bbva.showinfo.generator.InfoSnackBarGenerator;
import com.bbva.showinfo.generator.InfoToastGenerator;
import com.bbva.showinfo.generator.InfoTooltipGenerator;
import com.bbva.showinfo.generator.NativeListModalGenerator;
import com.bbva.showinfo.model.InfoElement;
import com.bbva.showinfo.model.InfoNativeListModal;
import com.bbva.showinfo.model.InfoNotification;
import com.bbva.showinfo.model.InfoSnackBar;
import com.bbva.showinfo.model.InfoToast;
import com.bbva.showinfo.model.InfoTooltip;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ShowInfo.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a\u001f\u0010\u0007\u001a\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\n\u001a\u001f\u0010\u000b\u001a\u00020\f2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\n\u001a\u001c\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a\u001f\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\n\u001a\u001f\u0010\u0010\u001a\u00020\u00112\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\n\u001a\u001f\u0010\u0012\u001a\u00020\u00132\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\n¨\u0006\u0014"}, d2 = {HideCommand.ID, "", "context", "Landroid/content/Context;", "block", "Lkotlin/Function0;", "Lcom/bbva/showinfo/model/InfoElement;", "nativeListModal", "Lcom/bbva/showinfo/model/InfoNativeListModal;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "notification", "Lcom/bbva/showinfo/model/InfoNotification;", "show", "snackBar", "Lcom/bbva/showinfo/model/InfoSnackBar;", "toast", "Lcom/bbva/showinfo/model/InfoToast;", TooltipCommand.ID, "Lcom/bbva/showinfo/model/InfoTooltip;", "showinfo_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ShowInfoKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void hide(@NotNull Context context, @NotNull Function0<? extends InfoElement> block) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        InfoElement infoElementInvoke = block.invoke();
        if (infoElementInvoke instanceof InfoNotification) {
            InfoNotificationGenerator.INSTANCE.hide(context, (InfoNotification) infoElementInvoke);
        } else if (infoElementInvoke instanceof InfoSnackBar) {
            InfoSnackBarGenerator.INSTANCE.hide(context, (InfoSnackBar) infoElementInvoke);
        } else if (infoElementInvoke instanceof InfoToast) {
            InfoToastGenerator.INSTANCE.hide(context, (InfoToast) infoElementInvoke);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final InfoNativeListModal nativeListModal(@NotNull Function1<? super InfoNativeListModal, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        InfoNativeListModal infoNativeListModal = new InfoNativeListModal(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        block.invoke(infoNativeListModal);
        return infoNativeListModal;
    }

    @NotNull
    public static final InfoNotification notification(@NotNull Function1<? super InfoNotification, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        InfoNotification infoNotification = new InfoNotification(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null);
        block.invoke(infoNotification);
        return infoNotification;
    }

    public static final void show(@NotNull Context context, @NotNull Function0<? extends InfoElement> block) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        InfoElement infoElementInvoke = block.invoke();
        if (infoElementInvoke instanceof InfoNotification) {
            InfoNotificationGenerator.INSTANCE.create(context, (InfoNotification) infoElementInvoke);
            return;
        }
        if (infoElementInvoke instanceof InfoSnackBar) {
            InfoSnackBarGenerator.INSTANCE.create(context, (InfoSnackBar) infoElementInvoke);
            return;
        }
        if (infoElementInvoke instanceof InfoToast) {
            InfoToastGenerator.INSTANCE.create(context, (InfoToast) infoElementInvoke);
        } else if (infoElementInvoke instanceof InfoNativeListModal) {
            NativeListModalGenerator.INSTANCE.create(context, (InfoNativeListModal) infoElementInvoke);
        } else if (infoElementInvoke instanceof InfoTooltip) {
            InfoTooltipGenerator.INSTANCE.create(context, (InfoTooltip) infoElementInvoke);
        }
    }

    @NotNull
    public static final InfoSnackBar snackBar(@NotNull Function1<? super InfoSnackBar, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        InfoSnackBar infoSnackBar = new InfoSnackBar(null, null, null, null, null, null, null, null, null, false, null, null, 4095, null);
        block.invoke(infoSnackBar);
        return infoSnackBar;
    }

    @NotNull
    public static final InfoToast toast(@NotNull Function1<? super InfoToast, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        InfoToast infoToast = new InfoToast(null, null, 3, null);
        block.invoke(infoToast);
        return infoToast;
    }

    @NotNull
    public static final InfoTooltip tooltip(@NotNull Function1<? super InfoTooltip, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        InfoTooltip infoTooltip = new InfoTooltip(null, null, null, null, 0, 0, null, 127, null);
        block.invoke(infoTooltip);
        return infoTooltip;
    }
}
