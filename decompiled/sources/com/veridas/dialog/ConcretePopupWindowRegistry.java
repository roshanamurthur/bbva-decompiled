package com.veridas.dialog;

import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PopupWindowRegistry.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/veridas/dialog/ConcretePopupWindowRegistry;", "Lcom/veridas/dialog/PopupWindowRegistry;", "Landroid/widget/PopupWindow;", "dialog", "", "add", "Lcom/veridas/dialog/PopupWindowBuilder;", "createPopupWindowBuilder", "discard", "<init>", "()V", "common-core_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPopupWindowRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PopupWindowRegistry.kt\ncom/veridas/dialog/ConcretePopupWindowRegistry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n1855#2,2:30\n*S KotlinDebug\n*F\n+ 1 PopupWindowRegistry.kt\ncom/veridas/dialog/ConcretePopupWindowRegistry\n*L\n24#1:30,2\n*E\n"})
public final class ConcretePopupWindowRegistry implements PopupWindowRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList f67095a = new ArrayList();

    @Override // com.veridas.dialog.PopupWindowRegistry
    public void add(@NotNull PopupWindow dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f67095a.add(dialog);
    }

    @Override // com.veridas.dialog.PopupWindowRegistry
    @NotNull
    public PopupWindowBuilder createPopupWindowBuilder() {
        return new ConcretePopupWindowBuilder(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this, 65535, null);
    }

    @Override // com.veridas.dialog.PopupWindowRegistry
    public void discard() {
        Iterator it = this.f67095a.iterator();
        while (it.hasNext()) {
            ((PopupWindow) it.next()).dismiss();
        }
    }
}
