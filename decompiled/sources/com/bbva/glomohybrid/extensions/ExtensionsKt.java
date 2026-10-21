package com.bbva.glomohybrid.extensions;

import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.helper.Supplier;
import com.bbva.cellscore.reactor.GlobalReaction;
import com.bbva.cellscore.reactor.PageReaction;
import com.bbva.cellscore.reactor.PageReactionManager;
import com.bbva.glomohybrid.provider.DependenciesProvider;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\t\u001a$\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u0004¨\u0006\f"}, d2 = {"addAll", "", "Lcom/bbva/cellscore/reactor/PageReactionManager;", "map", "", "", "Lkotlin/Function0;", "Lcom/bbva/cellscore/reactor/PageReaction;", "addComponents", "Lcom/bbva/glomohybrid/provider/DependenciesProvider;", "addGlobalReactions", "Lcom/bbva/cellscore/reactor/GlobalReaction;", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncom/bbva/glomohybrid/extensions/ExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,26:1\n1855#2,2:27\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\ncom/bbva/glomohybrid/extensions/ExtensionsKt\n*L\n22#1:27,2\n*E\n"})
public final class ExtensionsKt {
    public static final void addAll(@NotNull PageReactionManager pageReactionManager, @NotNull Map<String, ? extends Function0<? extends PageReaction>> map) {
        Intrinsics.checkNotNullParameter(pageReactionManager, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        for (final Map.Entry<String, ? extends Function0<? extends PageReaction>> entry : map.entrySet()) {
            pageReactionManager.add(entry.getKey(), new Supplier() { // from class: r8.b
                @Override // com.bbva.cellscore.helper.Supplier
                public final Object get() {
                    Map.Entry entry2 = entry;
                    Intrinsics.checkNotNullParameter(entry2, "$entry");
                    return (PageReaction) ((Function0) entry2.getValue()).invoke();
                }
            });
        }
    }

    public static final void addComponents(@NotNull DependenciesProvider dependenciesProvider) {
        Intrinsics.checkNotNullParameter(dependenciesProvider, "<this>");
        Iterator<T> it = dependenciesProvider.components().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ComponentManager.add((String) entry.getKey(), entry.getValue());
        }
    }

    public static final void addGlobalReactions(@NotNull PageReactionManager pageReactionManager, @NotNull Map<String, ? extends Function0<? extends GlobalReaction>> map) {
        Intrinsics.checkNotNullParameter(pageReactionManager, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        for (final Map.Entry<String, ? extends Function0<? extends GlobalReaction>> entry : map.entrySet()) {
            pageReactionManager.addGlobal(entry.getKey(), new Supplier() { // from class: r8.a
                @Override // com.bbva.cellscore.helper.Supplier
                public final Object get() {
                    Map.Entry entry2 = entry;
                    Intrinsics.checkNotNullParameter(entry2, "$entry");
                    return (GlobalReaction) ((Function0) entry2.getValue()).invoke();
                }
            });
        }
    }
}
