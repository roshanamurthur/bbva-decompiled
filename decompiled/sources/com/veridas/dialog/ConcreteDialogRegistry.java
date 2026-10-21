package com.veridas.dialog;

import android.app.Dialog;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DialogRegistry.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/veridas/dialog/ConcreteDialogRegistry;", "Lcom/veridas/dialog/DialogRegistry;", "Landroid/app/Dialog;", "dialog", "", "add", "Lcom/veridas/dialog/AlertDialogBuilder;", "createAlertDialogBuilder", "discard", "<init>", "()V", "common-core_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDialogRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogRegistry.kt\ncom/veridas/dialog/ConcreteDialogRegistry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1855#2,2:36\n*S KotlinDebug\n*F\n+ 1 DialogRegistry.kt\ncom/veridas/dialog/ConcreteDialogRegistry\n*L\n24#1:36,2\n*E\n"})
public final class ConcreteDialogRegistry implements DialogRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList f67078a = new ArrayList();

    @Override // com.veridas.dialog.DialogRegistry
    public void add(@NotNull Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f67078a.add(dialog);
    }

    @Override // com.veridas.dialog.DialogRegistry
    @NotNull
    public AlertDialogBuilder createAlertDialogBuilder() {
        return new ConcreteAlertDialogBuilder(null, null, null, 0, null, null, null, null, null, null, null, null, null, this, null, null, 0, null, 253951, null);
    }

    @Override // com.veridas.dialog.DialogRegistry
    public void discard() {
        for (Dialog dialog : this.f67078a) {
            if (dialog.isShowing()) {
                dialog.cancel();
            }
            dialog.dismiss();
        }
    }
}
