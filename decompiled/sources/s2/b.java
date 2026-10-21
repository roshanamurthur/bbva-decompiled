package s2;

import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.Preferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SharedPreferencesMigration.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<Preferences, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ Object f93143p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Set<String> f93144q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Set<String> set, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f93144q0 = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        b bVar = new b(this.f93144q0, continuation);
        bVar.f93143p0 = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Preferences preferences, Continuation<? super Boolean> continuation) {
        return ((b) create(preferences, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Set<Preferences.Key<?>> setKeySet = ((Preferences) this.f93143p0).asMap().keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Preferences.Key) it.next()).getName());
        }
        Set<String> migrate_all_keys = SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS();
        Set<String> set = this.f93144q0;
        boolean z10 = true;
        if (set != migrate_all_keys) {
            Set<String> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z10 = false;
            } else {
                Iterator<T> it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (Boxing.boxBoolean(!arrayList.contains((String) it2.next())).booleanValue()) {
                    }
                }
                z10 = false;
            }
        }
        return Boxing.boxBoolean(z10);
    }
}
