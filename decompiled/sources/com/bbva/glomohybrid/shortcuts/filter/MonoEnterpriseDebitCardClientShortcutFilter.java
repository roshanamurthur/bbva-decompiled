package com.bbva.glomohybrid.shortcuts.filter;

import bk.d;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomohybrid.shortcuts.model.AppShortcut;
import com.bbva.glomohybrid.shortcuts.model.AppShortcutsIds;
import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MonoEnterpriseDebitCardClientShortcutFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/shortcuts/filter/MonoEnterpriseDebitCardClientShortcutFilter;", "Lcom/bbva/glomohybrid/shortcuts/filter/AppShortcutFilter;", "", "Lcom/bbva/glomohybrid/shortcuts/model/AppShortcut;", "shortcuts", "validate", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMonoEnterpriseDebitCardClientShortcutFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonoEnterpriseDebitCardClientShortcutFilter.kt\ncom/bbva/glomohybrid/shortcuts/filter/MonoEnterpriseDebitCardClientShortcutFilter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n1#2:30\n766#3:31\n857#3,2:32\n*S KotlinDebug\n*F\n+ 1 MonoEnterpriseDebitCardClientShortcutFilter.kt\ncom/bbva/glomohybrid/shortcuts/filter/MonoEnterpriseDebitCardClientShortcutFilter\n*L\n23#1:31\n23#1:32,2\n*E\n"})
public final class MonoEnterpriseDebitCardClientShortcutFilter implements AppShortcutFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f34481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<AppShortcutsIds> f34482b;

    public MonoEnterpriseDebitCardClientShortcutFilter(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f34481a = storage;
        this.f34482b = d.listOf(AppShortcutsIds.CREDIT_CARD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.glomohybrid.shortcuts.filter.AppShortcutFilter
    @NotNull
    public List<AppShortcut> validate(@NotNull List<AppShortcut> shortcuts) {
        Intrinsics.checkNotNullParameter(shortcuts, "shortcuts");
        JsonElement jsonElement = MainStorage.getJson$default(this.f34481a, LocalStorageConstantsKt.KEY_USER_MONO_ENTERPRISE_DEBIT_CARD, false, null, 6, null).get("value");
        Object obj = (jsonElement == null || !jsonElement.getAsBoolean()) ? null : shortcuts;
        if (obj != null) {
            shortcuts = new ArrayList<>();
            for (Object obj2 : (Iterable) obj) {
                if (this.f34482b.contains(((AppShortcut) obj2).getId())) {
                    shortcuts.add(obj2);
                }
            }
        }
        return shortcuts;
    }
}
