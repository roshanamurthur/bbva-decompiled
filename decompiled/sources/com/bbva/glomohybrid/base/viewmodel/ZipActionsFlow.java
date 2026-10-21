package com.bbva.glomohybrid.base.viewmodel;

import bk.d;
import bk.g;
import bk.q;
import com.bbva.notifications.model.constants.BanxicoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ZipActionsFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J!\u0010\b\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006\"\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001J\u001c\u0010\u0010\u001a\u00020\u00042\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rJ\u001c\u0010\u0012\u001a\u00020\u00042\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rJ\u001c\u0010\u0013\u001a\u00020\u00042\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rJ\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\n¨\u0006\u0018"}, d2 = {"Lcom/bbva/glomohybrid/base/viewmodel/ZipActionsFlow;", "", "Lcom/bbva/glomohybrid/base/viewmodel/Action;", "action", "", "addAction", "", "actions", "addActions", "([Lcom/bbva/glomohybrid/base/viewmodel/Action;)V", "", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "markAsPerformed", "Lkotlin/Function1;", "Lcom/bbva/glomohybrid/base/viewmodel/PerformedAction;", "func", "onActionPerformed", "Lcom/bbva/glomohybrid/base/viewmodel/OnCompleteAction;", "onComplete", "onError", "actionId", "removeAction", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nZipActionsFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipActionsFlow.kt\ncom/bbva/glomohybrid/base/viewmodel/ZipActionsFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1#2:76\n800#3,11:77\n1360#3:88\n1446#3,5:89\n766#3:94\n857#3,2:95\n819#3:97\n847#3,2:98\n1726#3,3:100\n800#3,11:103\n1747#3,3:114\n*S KotlinDebug\n*F\n+ 1 ZipActionsFlow.kt\ncom/bbva/glomohybrid/base/viewmodel/ZipActionsFlow\n*L\n62#1:77,11\n63#1:88\n63#1:89,5\n64#1:94\n64#1:95,2\n68#1:97\n68#1:98,2\n69#1:100,3\n72#1:103,11\n73#1:114,3\n*E\n"})
public final class ZipActionsFlow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet f31606a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f31607b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Function1<? super PerformedAction, Unit> f31608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Function1<? super OnCompleteAction, Unit> f31609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Function1<? super OnCompleteAction, Unit> f31610e;

    public static /* synthetic */ void markAsPerformed$default(ZipActionsFlow zipActionsFlow, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        zipActionsFlow.markAsPerformed(str, obj);
    }

    public final void addAction(@NotNull Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f31606a.add(action);
    }

    public final void addActions(@NotNull Action... actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        g.addAll(this.f31606a, actions);
    }

    public final void markAsPerformed(@NotNull String action, @Nullable Object payload) {
        Intrinsics.checkNotNullParameter(action, "action");
        LinkedHashMap linkedHashMap = this.f31607b;
        linkedHashMap.put(action, payload);
        Function1<? super PerformedAction, Unit> function1 = this.f31608c;
        if (function1 != null) {
            function1.invoke(new PerformedAction(action, q.toMap(linkedHashMap)));
        }
        List<String> list = CollectionsKt___CollectionsKt.toList(linkedHashMap.keySet());
        LinkedHashSet linkedHashSet = this.f31606a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (obj instanceof Action.ErrorAction) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Action.ErrorAction) it.next()).isSatisfied(list)) {
                    Function1<? super OnCompleteAction, Unit> function2 = this.f31610e;
                    if (function2 != null) {
                        function2.invoke(new OnCompleteAction(q.toMap(linkedHashMap)));
                    }
                    linkedHashMap.clear();
                    return;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : linkedHashSet) {
            if (!(((Action) obj2) instanceof Action.ErrorAction)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (!((Action) it2.next()).isSatisfied(list)) {
                    return;
                }
            }
        }
        Function1<? super OnCompleteAction, Unit> function3 = this.f31609d;
        if (function3 != null) {
            function3.invoke(new OnCompleteAction(q.toMap(linkedHashMap)));
        }
        linkedHashMap.clear();
    }

    public final void onActionPerformed(@Nullable Function1<? super PerformedAction, Unit> func) {
        this.f31608c = func;
    }

    public final void onComplete(@Nullable Function1<? super OnCompleteAction, Unit> func) {
        this.f31609d = func;
    }

    public final void onError(@Nullable Function1<? super OnCompleteAction, Unit> func) {
        this.f31610e = func;
    }

    public final void removeAction(@NotNull String actionId) {
        Object next;
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        LinkedHashSet linkedHashSet = this.f31606a;
        Iterator it = linkedHashSet.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Action) next).isSatisfied(d.listOf(actionId)));
        Action action = (Action) next;
        if (action != null) {
            linkedHashSet.remove(action);
        }
    }
}
