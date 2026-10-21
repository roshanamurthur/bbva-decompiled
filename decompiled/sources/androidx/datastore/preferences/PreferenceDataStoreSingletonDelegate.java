package androidx.datastore.preferences;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PreferenceDataStoreDelegate.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u000e0\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0096\u0002¨\u0006\u0015"}, d2 = {"Landroidx/datastore/preferences/PreferenceDataStoreSingletonDelegate;", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "", "name", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "corruptionHandler", "Lkotlin/Function1;", "", "Landroidx/datastore/core/DataMigration;", "produceMigrations", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Ljava/lang/String;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;)V", "datastore-preferences_release"}, k = 1, mv = {1, 5, 1})
public final class PreferenceDataStoreSingletonDelegate implements ReadOnlyProperty<Context, DataStore<Preferences>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f20762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ReplaceFileCorruptionHandler<Preferences> f20763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<Context, List<DataMigration<Preferences>>> f20764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f20765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Object f20766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("lock")
    @Nullable
    public volatile DataStore<Preferences> f20767f;

    /* JADX INFO: compiled from: PreferenceDataStoreDelegate.kt */
    public static final class a extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f20768p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PreferenceDataStoreSingletonDelegate f20769q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, PreferenceDataStoreSingletonDelegate preferenceDataStoreSingletonDelegate) {
            super(0);
            this.f20768p0 = context;
            this.f20769q0 = preferenceDataStoreSingletonDelegate;
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            Context applicationContext = this.f20768p0;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return PreferenceDataStoreFile.preferencesDataStoreFile(applicationContext, this.f20769q0.f20762a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreSingletonDelegate(@NotNull String name, @Nullable ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @NotNull Function1<? super Context, ? extends List<? extends DataMigration<Preferences>>> produceMigrations, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f20762a = name;
        this.f20763b = replaceFileCorruptionHandler;
        this.f20764c = produceMigrations;
        this.f20765d = scope;
        this.f20766e = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ DataStore<Preferences> getValue(Context context, KProperty kProperty) {
        return getValue2(context, (KProperty<?>) kProperty);
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public DataStore<Preferences> getValue2(@NotNull Context thisRef, @NotNull KProperty<?> property) {
        DataStore<Preferences> dataStore;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        DataStore<Preferences> dataStore2 = this.f20767f;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.f20766e) {
            try {
                if (this.f20767f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.INSTANCE;
                    ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler = this.f20763b;
                    Function1<Context, List<DataMigration<Preferences>>> function1 = this.f20764c;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f20767f = preferenceDataStoreFactory.create(replaceFileCorruptionHandler, function1.invoke(applicationContext), this.f20765d, new a(applicationContext, this));
                }
                dataStore = this.f20767f;
                Intrinsics.checkNotNull(dataStore);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dataStore;
    }
}
