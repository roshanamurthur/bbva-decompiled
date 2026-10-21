package com.bbva.glomohybrid.shortcuts.filter;

import com.bbva.glomohybrid.shortcuts.model.AppShortcut;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AppShortcutFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/shortcuts/filter/AppShortcutFilter;", "", "validate", "", "Lcom/bbva/glomohybrid/shortcuts/model/AppShortcut;", "shortcuts", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AppShortcutFilter {
    @NotNull
    List<AppShortcut> validate(@NotNull List<AppShortcut> shortcuts);
}
