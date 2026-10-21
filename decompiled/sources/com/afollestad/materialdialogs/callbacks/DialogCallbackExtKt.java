package com.afollestad.materialdialogs.callbacks;

import android.content.DialogInterface;
import com.afollestad.materialdialogs.MaterialDialog;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DialogCallbackExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a*\u0010\u0000\u001a\u00020\u0001*\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u00050\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a\"\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0005\u001a\"\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0005\u001a\"\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0005\u001a\"\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0005¨\u0006\f"}, d2 = {"invokeAll", "", "", "Lkotlin/Function1;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Lcom/afollestad/materialdialogs/DialogCallback;", "dialog", "onCancel", "callback", "onDismiss", "onPreShow", "onShow", "com.afollestad.material-dialogs.core"}, k = 2, mv = {1, 1, 15})
public final class DialogCallbackExtKt {

    /* JADX INFO: compiled from: DialogCallbackExt.kt */
    public static final class a implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MaterialDialog f25465p0;

        public a(MaterialDialog materialDialog) {
            this.f25465p0 = materialDialog;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            MaterialDialog materialDialog = this.f25465p0;
            DialogCallbackExtKt.invokeAll(materialDialog.getCancelListeners$com_afollestad_material_dialogs_core(), materialDialog);
        }
    }

    /* JADX INFO: compiled from: DialogCallbackExt.kt */
    public static final class b implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MaterialDialog f25466p0;

        public b(MaterialDialog materialDialog) {
            this.f25466p0 = materialDialog;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            MaterialDialog materialDialog = this.f25466p0;
            DialogCallbackExtKt.invokeAll(materialDialog.getDismissListeners$com_afollestad_material_dialogs_core(), materialDialog);
        }
    }

    /* JADX INFO: compiled from: DialogCallbackExt.kt */
    public static final class c implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MaterialDialog f25467a;

        public c(MaterialDialog materialDialog) {
            this.f25467a = materialDialog;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public final void onShow(DialogInterface dialogInterface) {
            MaterialDialog materialDialog = this.f25467a;
            DialogCallbackExtKt.invokeAll(materialDialog.getShowListeners$com_afollestad_material_dialogs_core(), materialDialog);
        }
    }

    public static final void invokeAll(@NotNull List<Function1<MaterialDialog, Unit>> list, @NotNull MaterialDialog materialDialog) {
        Iterator<Function1<MaterialDialog, Unit>> it = list.iterator();
        while (it.hasNext()) {
            it.next().invoke(materialDialog);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final MaterialDialog onCancel(@NotNull MaterialDialog materialDialog, @NotNull Function1<? super MaterialDialog, Unit> function1) {
        materialDialog.getCancelListeners$com_afollestad_material_dialogs_core().add(function1);
        materialDialog.setOnCancelListener(new a(materialDialog));
        return materialDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final MaterialDialog onDismiss(@NotNull MaterialDialog materialDialog, @NotNull Function1<? super MaterialDialog, Unit> function1) {
        materialDialog.getDismissListeners$com_afollestad_material_dialogs_core().add(function1);
        materialDialog.setOnDismissListener(new b(materialDialog));
        return materialDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final MaterialDialog onPreShow(@NotNull MaterialDialog materialDialog, @NotNull Function1<? super MaterialDialog, Unit> function1) {
        materialDialog.getPreShowListeners$com_afollestad_material_dialogs_core().add(function1);
        return materialDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final MaterialDialog onShow(@NotNull MaterialDialog materialDialog, @NotNull Function1<? super MaterialDialog, Unit> function1) {
        materialDialog.getShowListeners$com_afollestad_material_dialogs_core().add(function1);
        if (materialDialog.isShowing()) {
            invokeAll(materialDialog.getShowListeners$com_afollestad_material_dialogs_core(), materialDialog);
        }
        materialDialog.setOnShowListener(new c(materialDialog));
        return materialDialog;
    }
}
