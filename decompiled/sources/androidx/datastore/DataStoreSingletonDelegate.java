package androidx.datastore;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.exifinterface.media.ExifInterface;
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

/* JADX INFO: compiled from: DataStoreDelegate.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002BW\b\u0000\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\u0012\u001e\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u00100\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0096\u0002¨\u0006\u0017"}, d2 = {"Landroidx/datastore/DataStoreSingletonDelegate;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "", "fileName", "Landroidx/datastore/core/Serializer;", "serializer", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "corruptionHandler", "Lkotlin/Function1;", "", "Landroidx/datastore/core/DataMigration;", "produceMigrations", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Ljava/lang/String;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;)V", "datastore_release"}, k = 1, mv = {1, 5, 1})
public final class DataStoreSingletonDelegate<T> implements ReadOnlyProperty<Context, DataStore<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f20633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Serializer<T> f20634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ReplaceFileCorruptionHandler<T> f20635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function1<Context, List<DataMigration<T>>> f20636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f20637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Object f20638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @GuardedBy("lock")
    @Nullable
    public volatile DataStore<T> f20639g;

    /* JADX INFO: compiled from: DataStoreDelegate.kt */
    public static final class a extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f20640p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DataStoreSingletonDelegate<T> f20641q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, DataStoreSingletonDelegate<T> dataStoreSingletonDelegate) {
            super(0);
            this.f20640p0 = context;
            this.f20641q0 = dataStoreSingletonDelegate;
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            Context applicationContext = this.f20640p0;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return DataStoreFile.dataStoreFile(applicationContext, this.f20641q0.f20633a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreSingletonDelegate(@NotNull String fileName, @NotNull Serializer<T> serializer, @Nullable ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, @NotNull Function1<? super Context, ? extends List<? extends DataMigration<T>>> produceMigrations, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f20633a = fileName;
        this.f20634b = serializer;
        this.f20635c = replaceFileCorruptionHandler;
        this.f20636d = produceMigrations;
        this.f20637e = scope;
        this.f20638f = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Context context, KProperty kProperty) {
        return getValue2(context, (KProperty<?>) kProperty);
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public DataStore<T> getValue2(@NotNull Context thisRef, @NotNull KProperty<?> property) {
        DataStore<T> dataStore;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        DataStore<T> dataStore2 = this.f20639g;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.f20638f) {
            try {
                if (this.f20639g == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    Serializer<T> serializer = this.f20634b;
                    ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler = this.f20635c;
                    Function1<Context, List<DataMigration<T>>> function1 = this.f20636d;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f20639g = DataStoreFactory.INSTANCE.create(serializer, replaceFileCorruptionHandler, function1.invoke(applicationContext), this.f20637e, new a(applicationContext, this));
                }
                dataStore = this.f20639g;
                Intrinsics.checkNotNull(dataStore);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dataStore;
    }
}
