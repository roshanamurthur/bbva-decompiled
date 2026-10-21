package com.bbva.plugin.showinfo.manager;

import android.content.Context;
import com.bbva.plugin.showinfo.MapperKt;
import com.bbva.plugin.showinfo.command.HideCommand;
import com.bbva.plugin.showinfo.data.HideDTO;
import com.bbva.plugin.showinfo.data.NotificationDTO;
import com.bbva.plugin.showinfo.data.SnackBarDTO;
import com.bbva.plugin.showinfo.data.ToastDTO;
import com.bbva.plugin.showinfo.data.TooltipDTO;
import com.bbva.showinfo.ShowInfoKt;
import com.bbva.showinfo.model.InfoElement;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfoManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nH\u0016J<\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, d2 = {"Lcom/bbva/plugin/showinfo/manager/BasicInfoHandler;", "Lcom/bbva/plugin/showinfo/manager/InfoHandler;", "()V", HideCommand.ID, "", "context", "Landroid/content/Context;", "info", "Lcom/bbva/plugin/showinfo/data/HideDTO;", "showNotification", "Lcom/bbva/plugin/showinfo/data/NotificationDTO;", "showSnackBar", "Lcom/bbva/plugin/showinfo/data/SnackBarDTO;", "snackBarImages", "", "", "", "onTapButtonListener", "Lkotlin/Function0;", "showToast", "Lcom/bbva/plugin/showinfo/data/ToastDTO;", "showTooltip", "Lcom/bbva/plugin/showinfo/data/TooltipDTO;", "showinfo-plugin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BasicInfoHandler implements InfoHandler {

    /* JADX INFO: compiled from: InfoManager.kt */
    public static final class a extends Lambda implements Function0<InfoElement> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ InfoElement f36016p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InfoElement infoElement) {
            super(0);
            this.f36016p0 = infoElement;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InfoElement invoke() {
            return this.f36016p0;
        }
    }

    /* JADX INFO: compiled from: InfoManager.kt */
    public static final class b extends Lambda implements Function0<InfoElement> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ NotificationDTO f36017p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Context f36018q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, NotificationDTO notificationDTO) {
            super(0);
            this.f36017p0 = notificationDTO;
            this.f36018q0 = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InfoElement invoke() {
            return ShowInfoKt.notification(new com.bbva.plugin.showinfo.manager.a(this.f36018q0, this.f36017p0));
        }
    }

    /* JADX INFO: compiled from: InfoManager.kt */
    public static final class c extends Lambda implements Function0<InfoElement> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SnackBarDTO f36019p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Map<String, Integer> f36020q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f36021r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SnackBarDTO snackBarDTO, Map<String, Integer> map, Function0<Unit> function0) {
            super(0);
            this.f36019p0 = snackBarDTO;
            this.f36020q0 = map;
            this.f36021r0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InfoElement invoke() {
            return ShowInfoKt.snackBar(new com.bbva.plugin.showinfo.manager.b(this.f36019p0, this.f36020q0, this.f36021r0));
        }
    }

    /* JADX INFO: compiled from: InfoManager.kt */
    public static final class d extends Lambda implements Function0<InfoElement> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ToastDTO f36022p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ToastDTO toastDTO) {
            super(0);
            this.f36022p0 = toastDTO;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InfoElement invoke() {
            return ShowInfoKt.toast(new com.bbva.plugin.showinfo.manager.c(this.f36022p0));
        }
    }

    /* JADX INFO: compiled from: InfoManager.kt */
    public static final class e extends Lambda implements Function0<InfoElement> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TooltipDTO f36023p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(TooltipDTO tooltipDTO) {
            super(0);
            this.f36023p0 = tooltipDTO;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InfoElement invoke() {
            return ShowInfoKt.tooltip(new com.bbva.plugin.showinfo.manager.d(this.f36023p0));
        }
    }

    @Override // com.bbva.plugin.showinfo.manager.InfoHandler
    public void hide(@NotNull Context context, @NotNull HideDTO info) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        InfoElement infoElementCreateInfoElement = MapperKt.createInfoElement(info);
        if (infoElementCreateInfoElement != null) {
            ShowInfoKt.hide(context, new a(infoElementCreateInfoElement));
        }
    }

    @Override // com.bbva.plugin.showinfo.manager.InfoHandler
    public void showNotification(@NotNull Context context, @NotNull NotificationDTO info) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        ShowInfoKt.show(context, new b(context, info));
    }

    @Override // com.bbva.plugin.showinfo.manager.InfoHandler
    public void showSnackBar(@NotNull Context context, @NotNull SnackBarDTO info, @NotNull Map<String, Integer> snackBarImages, @Nullable Function0<Unit> onTapButtonListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(snackBarImages, "snackBarImages");
        ShowInfoKt.show(context, new c(info, snackBarImages, onTapButtonListener));
    }

    @Override // com.bbva.plugin.showinfo.manager.InfoHandler
    public void showToast(@NotNull Context context, @NotNull ToastDTO info) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        ShowInfoKt.show(context, new d(info));
    }

    @Override // com.bbva.plugin.showinfo.manager.InfoHandler
    public void showTooltip(@NotNull Context context, @NotNull TooltipDTO info) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        ShowInfoKt.show(context, new e(info));
    }
}
