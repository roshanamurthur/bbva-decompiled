package com.bbva.glomohybrid.shortcuts.filter;

import com.bbva.glomohybrid.shortcuts.model.AppShortcut;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AppShortcutFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0005"}, d2 = {"applyTo", "", "Lcom/bbva/glomohybrid/shortcuts/model/AppShortcut;", "Lcom/bbva/glomohybrid/shortcuts/filter/AppShortcutFilter;", "shortcuts", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppShortcutFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppShortcutFilter.kt\ncom/bbva/glomohybrid/shortcuts/filter/AppShortcutFilterKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,15:1\n1789#2,3:16\n*S KotlinDebug\n*F\n+ 1 AppShortcutFilter.kt\ncom/bbva/glomohybrid/shortcuts/filter/AppShortcutFilterKt\n*L\n11#1:16,3\n*E\n"})
public final class AppShortcutFilterKt {
    @NotNull
    public static final List<AppShortcut> applyTo(@NotNull List<? extends AppShortcutFilter> list, @NotNull List<AppShortcut> shortcuts) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(shortcuts, "shortcuts");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            shortcuts = ((AppShortcutFilter) it.next()).validate(shortcuts);
        }
        return shortcuts;
    }
}
