package s2;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SharedPreferencesMigration.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function3<SharedPreferencesView, Preferences, Continuation<? super Preferences>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ SharedPreferencesView f93141p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Preferences f93142q0;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(SharedPreferencesView sharedPreferencesView, Preferences preferences, Continuation<? super Preferences> continuation) {
        a aVar = new a(3, continuation);
        aVar.f93141p0 = sharedPreferencesView;
        aVar.f93142q0 = preferences;
        return aVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SharedPreferencesView sharedPreferencesView = this.f93141p0;
        Preferences preferences = this.f93142q0;
        Set<Preferences.Key<?>> setKeySet = preferences.asMap().keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Preferences.Key) it.next()).getName());
        }
        Map<String, Object> all = sharedPreferencesView.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : all.entrySet()) {
            if (Boxing.boxBoolean(!arrayList.contains(entry.getKey())).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        MutablePreferences mutablePreferences = preferences.toMutablePreferences();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Boolean) {
                mutablePreferences.set(PreferencesKeys.booleanKey(str), value);
            } else if (value instanceof Float) {
                mutablePreferences.set(PreferencesKeys.floatKey(str), value);
            } else if (value instanceof Integer) {
                mutablePreferences.set(PreferencesKeys.intKey(str), value);
            } else if (value instanceof Long) {
                mutablePreferences.set(PreferencesKeys.longKey(str), value);
            } else if (value instanceof String) {
                mutablePreferences.set(PreferencesKeys.stringKey(str), value);
            } else if (value instanceof Set) {
                Preferences.Key<Set<String>> keyStringSetKey = PreferencesKeys.stringSetKey(str);
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                }
                mutablePreferences.set(keyStringSetKey, (Set) value);
            } else {
                continue;
            }
        }
        return mutablePreferences.toPreferences();
    }
}
