package com.bbva.glomohybrid.base.viewmodel;

import ad.d;
import androidx.camera.core.imagecapture.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.service.RelayedService;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Action.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/base/viewmodel/Action;", "", "()V", "isSatisfied", "", RelayedService.KEY_IDS, "", "", "AnyAction", "BothActions", "ErrorAction", "JustAction", "Lcom/bbva/glomohybrid/base/viewmodel/Action$AnyAction;", "Lcom/bbva/glomohybrid/base/viewmodel/Action$BothActions;", "Lcom/bbva/glomohybrid/base/viewmodel/Action$ErrorAction;", "Lcom/bbva/glomohybrid/base/viewmodel/Action$JustAction;", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Action {

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0003HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/bbva/glomohybrid/base/viewmodel/Action$AnyAction;", "Lcom/bbva/glomohybrid/base/viewmodel/Action;", "", "", RelayedService.KEY_IDS, "", "isSatisfied", "component1", "actions", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "a", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Action.kt\ncom/bbva/glomohybrid/base/viewmodel/Action$AnyAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1747#2,3:42\n*S KotlinDebug\n*F\n+ 1 Action.kt\ncom/bbva/glomohybrid/base/viewmodel/Action$AnyAction\n*L\n14#1:42,3\n*E\n"})
    public static final /* data */ class AnyAction extends Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<String> actions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnyAction(@NotNull List<String> actions) {
            super(null);
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.actions = actions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AnyAction copy$default(AnyAction anyAction, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = anyAction.actions;
            }
            return anyAction.copy(list);
        }

        @NotNull
        public final List<String> component1() {
            return this.actions;
        }

        @NotNull
        public final AnyAction copy(@NotNull List<String> actions) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            return new AnyAction(actions);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AnyAction) && Intrinsics.areEqual(this.actions, ((AnyAction) other).actions);
        }

        @NotNull
        public final List<String> getActions() {
            return this.actions;
        }

        public int hashCode() {
            return this.actions.hashCode();
        }

        @Override // com.bbva.glomohybrid.base.viewmodel.Action
        public boolean isSatisfied(@NotNull List<String> ids) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            List<String> list = this.actions;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (ids.contains((String) it.next())) {
                    return true;
                }
            }
            return false;
        }

        @NotNull
        public String toString() {
            return a.c(new StringBuilder("AnyAction(actions="), this.actions, ")");
        }
    }

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0003HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/bbva/glomohybrid/base/viewmodel/Action$BothActions;", "Lcom/bbva/glomohybrid/base/viewmodel/Action;", "", "", RelayedService.KEY_IDS, "", "isSatisfied", "component1", "actions", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "a", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class BothActions extends Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<String> actions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BothActions(@NotNull List<String> actions) {
            super(null);
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.actions = actions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BothActions copy$default(BothActions bothActions, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = bothActions.actions;
            }
            return bothActions.copy(list);
        }

        @NotNull
        public final List<String> component1() {
            return this.actions;
        }

        @NotNull
        public final BothActions copy(@NotNull List<String> actions) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            return new BothActions(actions);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BothActions) && Intrinsics.areEqual(this.actions, ((BothActions) other).actions);
        }

        @NotNull
        public final List<String> getActions() {
            return this.actions;
        }

        public int hashCode() {
            return this.actions.hashCode();
        }

        @Override // com.bbva.glomohybrid.base.viewmodel.Action
        public boolean isSatisfied(@NotNull List<String> ids) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            return ids.containsAll(this.actions);
        }

        @NotNull
        public String toString() {
            return a.c(new StringBuilder("BothActions(actions="), this.actions, ")");
        }
    }

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0003HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/bbva/glomohybrid/base/viewmodel/Action$ErrorAction;", "Lcom/bbva/glomohybrid/base/viewmodel/Action;", "", "", RelayedService.KEY_IDS, "", "isSatisfied", "component1", "actions", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "a", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Action.kt\ncom/bbva/glomohybrid/base/viewmodel/Action$ErrorAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1747#2,3:42\n*S KotlinDebug\n*F\n+ 1 Action.kt\ncom/bbva/glomohybrid/base/viewmodel/Action$ErrorAction\n*L\n27#1:42,3\n*E\n"})
    public static final /* data */ class ErrorAction extends Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<String> actions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorAction(@NotNull List<String> actions) {
            super(null);
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.actions = actions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ErrorAction copy$default(ErrorAction errorAction, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = errorAction.actions;
            }
            return errorAction.copy(list);
        }

        @NotNull
        public final List<String> component1() {
            return this.actions;
        }

        @NotNull
        public final ErrorAction copy(@NotNull List<String> actions) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            return new ErrorAction(actions);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorAction) && Intrinsics.areEqual(this.actions, ((ErrorAction) other).actions);
        }

        @NotNull
        public final List<String> getActions() {
            return this.actions;
        }

        public int hashCode() {
            return this.actions.hashCode();
        }

        @Override // com.bbva.glomohybrid.base.viewmodel.Action
        public boolean isSatisfied(@NotNull List<String> ids) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            List<String> list = this.actions;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (ids.contains((String) it.next())) {
                    return true;
                }
            }
            return false;
        }

        @NotNull
        public String toString() {
            return a.c(new StringBuilder("ErrorAction(actions="), this.actions, ")");
        }
    }

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u0003HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/bbva/glomohybrid/base/viewmodel/Action$JustAction;", "Lcom/bbva/glomohybrid/base/viewmodel/Action;", "", "", RelayedService.KEY_IDS, "", "isSatisfied", "component1", "action", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "a", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class JustAction extends Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JustAction(@NotNull String action) {
            super(null);
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        public static /* synthetic */ JustAction copy$default(JustAction justAction, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = justAction.action;
            }
            return justAction.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @NotNull
        public final JustAction copy(@NotNull String action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new JustAction(action);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof JustAction) && Intrinsics.areEqual(this.action, ((JustAction) other).action);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        @Override // com.bbva.glomohybrid.base.viewmodel.Action
        public boolean isSatisfied(@NotNull List<String> ids) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            return ids.contains(this.action);
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("JustAction(action="), this.action, ")");
        }
    }

    public Action() {
    }

    public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean isSatisfied(@NotNull List<String> ids);
}
