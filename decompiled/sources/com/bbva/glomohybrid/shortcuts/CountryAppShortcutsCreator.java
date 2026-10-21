package com.bbva.glomohybrid.shortcuts;

import android.content.Context;
import androidx.core.content.pm.ShortcutManagerCompat;
import com.bbva.glomohybrid.base.behaviors.AppShortcutsCreator;
import com.bbva.glomohybrid.shortcuts.filter.AppShortcutFilter;
import com.bbva.glomohybrid.shortcuts.filter.AppShortcutFilterKt;
import com.bbva.glomohybrid.shortcuts.model.AppShortcut;
import com.bbva.glomohybrid.shortcuts.model.AppShortcutModelKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountryAppShortcutsCreator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/shortcuts/CountryAppShortcutsCreator;", "Lcom/bbva/glomohybrid/base/behaviors/AppShortcutsCreator;", "", "create", "Landroid/content/Context;", "context", "", "Lcom/bbva/glomohybrid/shortcuts/filter/AppShortcutFilter;", "filters", "Lcom/bbva/glomohybrid/shortcuts/model/AppShortcut;", "shortcutsItems", "<init>", "(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCountryAppShortcutsCreator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryAppShortcutsCreator.kt\ncom/bbva/glomohybrid/shortcuts/CountryAppShortcutsCreator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,28:1\n1549#2:29\n1620#2,3:30\n*S KotlinDebug\n*F\n+ 1 CountryAppShortcutsCreator.kt\ncom/bbva/glomohybrid/shortcuts/CountryAppShortcutsCreator\n*L\n24#1:29\n24#1:30,3\n*E\n"})
public final class CountryAppShortcutsCreator implements AppShortcutsCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f34473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<AppShortcutFilter> f34474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<AppShortcut> f34475c;

    /* JADX WARN: Multi-variable type inference failed */
    public CountryAppShortcutsCreator(@NotNull Context context, @NotNull List<? extends AppShortcutFilter> filters, @NotNull List<AppShortcut> shortcutsItems) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(shortcutsItems, "shortcutsItems");
        this.f34473a = context;
        this.f34474b = filters;
        this.f34475c = shortcutsItems;
    }

    @Override // com.bbva.glomohybrid.base.behaviors.AppShortcutsCreator
    public void create() {
        List<AppShortcut> listApplyTo = AppShortcutFilterKt.applyTo(this.f34474b, this.f34475c);
        Context context = this.f34473a;
        List listTake = CollectionsKt___CollectionsKt.take(listApplyTo, ShortcutManagerCompat.getMaxShortcutCountPerActivity(context));
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listTake, 10));
        Iterator it = listTake.iterator();
        while (it.hasNext()) {
            arrayList.add(AppShortcutModelKt.toShortcutInfoCompat((AppShortcut) it.next(), context));
        }
        ShortcutManagerCompat.setDynamicShortcuts(context, arrayList);
    }
}
