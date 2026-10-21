package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.ui.R;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DisposableSaveableStateRegistry.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0000¨\u0006\t"}, d2 = {"Landroid/view/View;", "view", "Landroidx/savedstate/SavedStateRegistryOwner;", "owner", "Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", "DisposableSaveableStateRegistry", "", "id", "savedStateRegistryOwner", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDisposableSaveableStateRegistry.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,190:1\n1855#2,2:191\n215#3,2:193\n*S KotlinDebug\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n*L\n172#1:191,2\n181#1:193,2\n*E\n"})
public final class DisposableSaveableStateRegistry_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Class<? extends Object>[] f17214a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: compiled from: DisposableSaveableStateRegistry.android.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f17215p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SavedStateRegistry f17216q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f17217r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, SavedStateRegistry savedStateRegistry, String str) {
            super(0);
            this.f17215p0 = z10;
            this.f17216q0 = savedStateRegistry;
            this.f17217r0 = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (this.f17215p0) {
                this.f17216q0.unregisterSavedStateProvider(this.f17217r0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DisposableSaveableStateRegistry.android.kt */
    public static final class b implements SavedStateRegistry.SavedStateProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SaveableStateRegistry f17218a;

        public b(SaveableStateRegistry saveableStateRegistry) {
            this.f17218a = saveableStateRegistry;
        }

        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
        @NotNull
        public final Bundle saveState() {
            return DisposableSaveableStateRegistry_androidKt.access$toBundle(this.f17218a.performSave());
        }
    }

    /* JADX INFO: compiled from: DisposableSaveableStateRegistry.android.kt */
    public static final class c extends Lambda implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f17219p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(DisposableSaveableStateRegistry_androidKt.a(it));
        }
    }

    @NotNull
    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(@NotNull View view, @NotNull SavedStateRegistryOwner owner) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Object parent = view.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(R.id.compose_view_saveable_id_tag);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return DisposableSaveableStateRegistry(strValueOf, owner);
    }

    public static final boolean a(Object obj) {
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() != SnapshotStateKt.neverEqualPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.structuralEqualityPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.referentialEqualityPolicy()) {
                return false;
            }
            T value = snapshotMutableState.getValue();
            if (value == 0) {
                return true;
            }
            return a(value);
        }
        if ((obj instanceof Function) && (obj instanceof Serializable)) {
            return false;
        }
        Class<? extends Object>[] clsArr = f17214a;
        for (int i10 = 0; i10 < 7; i10++) {
            if (clsArr[i10].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public static final Bundle access$toBundle(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        return bundle;
    }

    @NotNull
    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(@NotNull String id, @NotNull SavedStateRegistryOwner savedStateRegistryOwner) {
        LinkedHashMap linkedHashMap;
        boolean z10;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "savedStateRegistryOwner");
        String str = "SaveableStateRegistry:" + id;
        SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        Bundle bundleConsumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey(str);
        if (bundleConsumeRestoredStateForKey != null) {
            linkedHashMap = new LinkedHashMap();
            Set<String> setKeySet = bundleConsumeRestoredStateForKey.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "this.keySet()");
            for (String key : setKeySet) {
                ArrayList parcelableArrayList = bundleConsumeRestoredStateForKey.getParcelableArrayList(key);
                Intrinsics.checkNotNull(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                Intrinsics.checkNotNullExpressionValue(key, "key");
                linkedHashMap.put(key, parcelableArrayList);
            }
        } else {
            linkedHashMap = null;
        }
        SaveableStateRegistry SaveableStateRegistry = SaveableStateRegistryKt.SaveableStateRegistry(linkedHashMap, c.f17219p0);
        try {
            savedStateRegistry.registerSavedStateProvider(str, new b(SaveableStateRegistry));
            z10 = true;
        } catch (IllegalArgumentException unused) {
            z10 = false;
        }
        return new DisposableSaveableStateRegistry(SaveableStateRegistry, new a(z10, savedStateRegistry, str));
    }
}
