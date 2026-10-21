package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.datastore.core.DataMigration;
import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SharedPreferencesMigration.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001dBz\b\u0017\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012$\b\u0002\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011\u0012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0015ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018B|\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012$\b\u0002\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011\u0012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0015ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u001cJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/DataMigration;", "currentData", "", "shouldMigrate", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "migrate", "", "cleanUp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "produceSharedPreferences", "", "", "keysToMigrate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "shouldRunMigration", "Lkotlin/Function3;", "Landroidx/datastore/migrations/SharedPreferencesView;", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "Landroid/content/Context;", "context", "sharedPreferencesName", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "d", "datastore_release"}, k = 1, mv = {1, 5, 1})
public final class SharedPreferencesMigration<T> implements DataMigration<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function2<T, Continuation<? super Boolean>, Object> f20746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function3<SharedPreferencesView, T, Continuation<? super T>, Object> f20747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Context f20748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f20749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f20750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Set<String> f20751f;

    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<T, Continuation<? super Boolean>, Object> {
        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
            return ((a) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(true);
        }
    }

    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<T, Continuation<? super Boolean>, Object> {
        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
            return ((b) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(true);
        }
    }

    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    public static final class c extends Lambda implements Function0<SharedPreferences> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f20752p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f20753q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str) {
            super(0);
            this.f20752p0 = context;
            this.f20753q0 = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f20752p0.getSharedPreferences(this.f20753q0, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    @RequiresApi(24)
    public static final class d {
        @JvmStatic
        @DoNotInline
        public static final boolean a(@NotNull Context context, @NotNull String name) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX INFO: compiled from: SharedPreferencesMigration.kt */
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.kt", i = {0}, l = {147}, m = "shouldMigrate", n = {"this"}, s = {"L$0"})
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SharedPreferencesMigration f20754p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f20755q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SharedPreferencesMigration<T> f20756r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f20757s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SharedPreferencesMigration<T> sharedPreferencesMigration, Continuation<? super e> continuation) {
            super(continuation);
            this.f20756r0 = sharedPreferencesMigration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20755q0 = obj;
            this.f20757s0 |= Integer.MIN_VALUE;
            return this.f20756r0.shouldMigrate(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SharedPreferencesMigration(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Set<String> keysToMigrate, @NotNull Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(context, sharedPreferencesName, keysToMigrate, null, migrate, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    @Override // androidx.datastore.core.DataMigration
    @Nullable
    public Object cleanUp(@NotNull Continuation<? super Unit> continuation) throws IOException {
        Unit unit;
        Context context;
        String str;
        Lazy lazy = this.f20750e;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) lazy.getValue()).edit();
        Set<String> set = this.f20751f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (((SharedPreferences) lazy.getValue()).getAll().isEmpty() && (context = this.f20748c) != null && (str = this.f20749d) != null) {
            if (Build.VERSION.SDK_INT < 24) {
                File file = new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), Intrinsics.stringPlus(str, ".xml"));
                File file2 = new File(Intrinsics.stringPlus(file.getPath(), ".bak"));
                file.delete();
                file2.delete();
            } else if (!d.a(context, str)) {
                throw new IOException(Intrinsics.stringPlus("Unable to delete SharedPreferences: ", str));
            }
        }
        if (set == null) {
            unit = null;
        } else {
            set.clear();
            unit = Unit.INSTANCE;
        }
        return unit == ek.a.getCOROUTINE_SUSPENDED() ? unit : Unit.INSTANCE;
    }

    @Override // androidx.datastore.core.DataMigration
    @Nullable
    public Object migrate(T t10, @NotNull Continuation<? super T> continuation) {
        return this.f20747b.invoke(new SharedPreferencesView((SharedPreferences) this.f20750e.getValue(), this.f20751f), t10, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.DataMigration
    @Nullable
    public Object shouldMigrate(T t10, @NotNull Continuation<? super Boolean> continuation) {
        e eVar;
        SharedPreferencesMigration<T> sharedPreferencesMigration;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f20757s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f20757s0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, continuation);
            }
        } else {
            eVar = new e(this, continuation);
        }
        Object objInvoke = eVar.f20755q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f20757s0;
        boolean z10 = true;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            eVar.f20754p0 = this;
            eVar.f20757s0 = 1;
            objInvoke = this.f20746a.invoke(t10, eVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            sharedPreferencesMigration = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sharedPreferencesMigration = eVar.f20754p0;
            ResultKt.throwOnFailure(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boxing.boxBoolean(false);
        }
        Set<String> set = sharedPreferencesMigration.f20751f;
        Lazy lazy = sharedPreferencesMigration.f20750e;
        if (set == null) {
            Map<String, ?> all = ((SharedPreferences) lazy.getValue()).getAll();
            Intrinsics.checkNotNullExpressionValue(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z10 = false;
            }
        } else {
            Set<String> set2 = set;
            SharedPreferences sharedPreferences = (SharedPreferences) lazy.getValue();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z10 = false;
            } else {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (Boxing.boxBoolean(sharedPreferences.contains((String) it.next())).booleanValue()) {
                    }
                }
                z10 = false;
            }
        }
        return Boxing.boxBoolean(z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SharedPreferencesMigration(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(context, sharedPreferencesName, null, null, migrate, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SharedPreferencesMigration(@NotNull Function0<? extends SharedPreferences> produceSharedPreferences, @NotNull Set<String> keysToMigrate, @NotNull Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, (Function2) null, migrate, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SharedPreferencesMigration(@NotNull Function0<? extends SharedPreferences> produceSharedPreferences, @NotNull Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, (Set) null, (Function2) null, migrate, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SharedPreferencesMigration(Function0<? extends SharedPreferences> function0, Set<String> set, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> function3, Context context, String str) {
        this.f20746a = function2;
        this.f20747b = function3;
        this.f20748c = context;
        this.f20749d = str;
        this.f20750e = LazyKt__LazyJVMKt.lazy(function0);
        this.f20751f = set == SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS() ? null : CollectionsKt___CollectionsKt.toMutableSet(set);
    }

    public SharedPreferencesMigration(Function0 function0, Set set, Function2 function2, Function3 function3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((Function0<? extends SharedPreferences>) function0, (Set<String>) ((i10 & 2) != 0 ? SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS() : set), (i10 & 4) != 0 ? new a(2, null) : function2, function3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SharedPreferencesMigration(@NotNull Function0<? extends SharedPreferences> produceSharedPreferences, @NotNull Set<String> keysToMigrate, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> shouldRunMigration, @NotNull Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, shouldRunMigration, migrate, (Context) null, (String) null);
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    public SharedPreferencesMigration(Context context, String str, Set set, Function2 function2, Function3 function3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS() : set, (i10 & 8) != 0 ? new b(2, null) : function2, function3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SharedPreferencesMigration(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Set<String> keysToMigrate, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> shouldRunMigration, @NotNull Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(new c(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }
}
