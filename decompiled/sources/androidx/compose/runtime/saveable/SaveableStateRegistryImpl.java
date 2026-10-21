package androidx.compose.runtime.saveable;

import bk.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SaveableStateRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSaveableStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,171:1\n1#2:172\n361#3,7:173\n215#4,2:180\n*S KotlinDebug\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n*L\n131#1:173,7\n146#1:180,2\n*E\n"})
public final class SaveableStateRegistryImpl implements SaveableStateRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<Object, Boolean> f15226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, List<Object>> f15227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f15228c;

    public SaveableStateRegistryImpl(@Nullable Map<String, ? extends List<? extends Object>> map, @NotNull Function1<Object, Boolean> function1) {
        Map<String, List<Object>> mutableMap;
        this.f15226a = function1;
        this.f15227b = (map == null || (mutableMap = q.toMutableMap(map)) == null) ? new LinkedHashMap<>() : mutableMap;
        this.f15228c = new LinkedHashMap();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean canBeSaved(@NotNull Object obj) {
        return this.f15226a.invoke(obj).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @Nullable
    public final Object consumeRestored(@NotNull String str) {
        Map<String, List<Object>> map = this.f15227b;
        List<Object> listRemove = map.remove(str);
        if (listRemove == null || !(!listRemove.isEmpty())) {
            return null;
        }
        if (listRemove.size() > 1) {
            map.put(str, listRemove.subList(1, listRemove.size()));
        }
        return listRemove.get(0);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @NotNull
    public final Map<String, List<Object>> performSave() {
        Map<String, List<Object>> mutableMap = q.toMutableMap(this.f15227b);
        for (Map.Entry entry : this.f15228c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object objInvoke = ((Function0) list.get(0)).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!canBeSaved(objInvoke)) {
                        throw new IllegalStateException(RememberSaveableKt.generateCannotBeSavedErrorMessage(objInvoke).toString());
                    }
                    mutableMap.put(str, CollectionsKt__CollectionsKt.arrayListOf(objInvoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object objInvoke2 = ((Function0) list.get(i10)).invoke();
                    if (objInvoke2 != null && !canBeSaved(objInvoke2)) {
                        throw new IllegalStateException(RememberSaveableKt.generateCannotBeSavedErrorMessage(objInvoke2).toString());
                    }
                    arrayList.add(objInvoke2);
                }
                mutableMap.put(str, arrayList);
            }
        }
        return mutableMap;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @NotNull
    public final SaveableStateRegistry.Entry registerProvider(@NotNull final String str, @NotNull final Function0<? extends Object> function0) {
        if (!(!SaveableStateRegistryKt.access$fastIsBlank(str))) {
            throw new IllegalArgumentException("Registered key is empty or blank".toString());
        }
        LinkedHashMap linkedHashMap = this.f15228c;
        Object arrayList = linkedHashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(str, arrayList);
        }
        ((List) arrayList).add(function0);
        return new SaveableStateRegistry.Entry() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl.registerProvider.3
            @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
            public void unregister() {
                SaveableStateRegistryImpl saveableStateRegistryImpl = SaveableStateRegistryImpl.this;
                LinkedHashMap linkedHashMap2 = saveableStateRegistryImpl.f15228c;
                String str2 = str;
                List list = (List) linkedHashMap2.remove(str2);
                if (list != null) {
                    list.remove(function0);
                }
                if (list == null || !(!list.isEmpty())) {
                    return;
                }
                saveableStateRegistryImpl.f15228c.put(str2, list);
            }
        };
    }
}
