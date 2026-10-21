package com.bbva.glomohybrid.base.cells.components;

import bk.d;
import bk.g;
import bk.q;
import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.notifications.model.constants.BanxicoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ZipActionsComponent.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J!\u0010\n\u001a\u00020\u00062\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b\"\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000f\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rJ*\u0010\u0013\u001a\u00020\u00062\"\u0010\u0012\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0010J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0002¨\u0006\u001a"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/components/ZipActionsComponent;", "Lcom/bbva/cells/component/kit/common/ReactiveComponent;", "", "getId", "Lcom/bbva/glomohybrid/base/cells/components/ZipAction;", "action", "", "addAction", "", "actions", "addActions", "([Lcom/bbva/glomohybrid/base/cells/components/ZipAction;)V", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "onActionPerformed", "Lkotlin/Function1;", "", "func", "onCompletionReturn", "actionId", "removeAction", "id", "<init>", "(Ljava/lang/String;)V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nZipActionsComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipActionsComponent.kt\ncom/bbva/glomohybrid/base/cells/components/ZipActionsComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,78:1\n1#2:79\n800#3,11:80\n1360#3:91\n1446#3,5:92\n766#3:97\n857#3,2:98\n819#3:100\n847#3,2:101\n1726#3,3:103\n800#3,11:106\n1747#3,3:117\n*S KotlinDebug\n*F\n+ 1 ZipActionsComponent.kt\ncom/bbva/glomohybrid/base/cells/components/ZipActionsComponent\n*L\n65#1:80,11\n66#1:91\n66#1:92,5\n67#1:97\n67#1:98,2\n71#1:100\n71#1:101,2\n72#1:103,3\n75#1:106,11\n76#1:117,3\n*E\n"})
public final class ZipActionsComponent extends ReactiveComponent {

    @NotNull
    public static final String ID = "component-zip-actions";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f31202p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Function1<? super Map<String, ? extends Object>, ? extends Object> f31203q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet f31204r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f31205s0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Map<String, Object>> f31200t0 = new ActionSpec<>("on-actions-completed");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<String> f31201u0 = new ActionSpec<>("zip-action-performed");

    @NotNull
    public static final ActionSpec<Map<String, Object>> v0 = new ActionSpec<>("on-actions-error");

    /* JADX INFO: compiled from: ZipActionsComponent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R%\u0010\u0003\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u000e\u0010\r\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/components/ZipActionsComponent$Companion;", "", "()V", "ACTION_COMPLETED", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "", "", "getACTION_COMPLETED", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ACTION_ERROR", "getACTION_ERROR", "ACTION_PERFORMED", "getACTION_PERFORMED", "ID", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<Map<String, Object>> getACTION_COMPLETED() {
            return ZipActionsComponent.f31200t0;
        }

        @NotNull
        public final ActionSpec<Map<String, Object>> getACTION_ERROR() {
            return ZipActionsComponent.v0;
        }

        @NotNull
        public final ActionSpec<String> getACTION_PERFORMED() {
            return ZipActionsComponent.f31201u0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ZipActionsComponent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void onActionPerformed$default(ZipActionsComponent zipActionsComponent, ActionSpec actionSpec, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        zipActionsComponent.onActionPerformed(actionSpec, obj);
    }

    public final void addAction(@NotNull ZipAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f31204r0.add(action);
    }

    public final void addActions(@NotNull ZipAction... actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        g.addAll(this.f31204r0, actions);
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId, reason: from getter */
    public String getK0() {
        return this.f31202p0;
    }

    public final void onActionPerformed(@NotNull ActionSpec<?> action, @Nullable Object payload) {
        Intrinsics.checkNotNullParameter(action, "action");
        LinkedHashMap linkedHashMap = this.f31205s0;
        String id = action.getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        linkedHashMap.put(id, payload);
        fire(f31201u0, action.getId());
        List<String> list = CollectionsKt___CollectionsKt.toList(linkedHashMap.keySet());
        LinkedHashSet linkedHashSet = this.f31204r0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (obj instanceof ZipAction.ErrorAction) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((ZipAction.ErrorAction) it.next()).isSatisfied(list)) {
                    fire(v0, q.toMap(linkedHashMap));
                    linkedHashMap.clear();
                    return;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : linkedHashSet) {
            if (!(((ZipAction) obj2) instanceof ZipAction.ErrorAction)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (!((ZipAction) it2.next()).isSatisfied(list)) {
                    return;
                }
            }
        }
        fire(f31200t0, q.toMap(linkedHashMap));
        linkedHashMap.clear();
    }

    public final void onCompletionReturn(@NotNull Function1<? super Map<String, ? extends Object>, ? extends Object> func) {
        Intrinsics.checkNotNullParameter(func, "func");
        this.f31203q0 = func;
    }

    public final void removeAction(@NotNull String actionId) {
        Object next;
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        LinkedHashSet linkedHashSet = this.f31204r0;
        Iterator it = linkedHashSet.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ZipAction) next).isSatisfied(d.listOf(actionId)));
        ZipAction zipAction = (ZipAction) next;
        if (zipAction != null) {
            linkedHashSet.remove(zipAction);
        }
    }

    public ZipActionsComponent(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f31202p0 = id;
        this.f31204r0 = new LinkedHashSet();
        this.f31205s0 = new LinkedHashMap();
    }

    public /* synthetic */ ZipActionsComponent(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? ID : str);
    }
}
