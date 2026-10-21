package androidx.lifecycle.viewmodel.internal;

import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import bk.g;
import com.bbva.plugin.localstorage.command.ClearCommand;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewModelImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010B\u001d\b\u0016\u0012\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0011\"\u00020\u0006¢\u0006\u0004\b\f\u0010\u0013B%\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0011\"\u00020\u0006¢\u0006\u0004\b\f\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J!\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "", "", ClearCommand.ID, "", "key", "Ljava/lang/AutoCloseable;", "closeable", "addCloseable", ExifInterface.GPS_DIRECTION_TRUE, "getCloseable", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "<init>", "()V", "Lkotlinx/coroutines/CoroutineScope;", "viewModelScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "closeables", "([Ljava/lang/AutoCloseable;)V", "(Lkotlinx/coroutines/CoroutineScope;[Ljava/lang/AutoCloseable;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nViewModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelImpl.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelImpl\n+ 2 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n*L\n1#1,136:1\n36#2,2:137\n36#2,2:140\n36#2,2:143\n36#2,2:146\n23#3:139\n23#3:142\n23#3:145\n23#3:148\n*S KotlinDebug\n*F\n+ 1 ViewModelImpl.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelImpl\n*L\n83#1:137,2\n106#1:140,2\n120#1:143,2\n126#1:146,2\n83#1:139\n106#1:142\n120#1:145\n126#1:148\n*E\n"})
public final class ViewModelImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SynchronizedObject f22197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f22198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet f22199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f22200d;

    public ViewModelImpl() {
        this.f22197a = new SynchronizedObject();
        this.f22198b = new LinkedHashMap();
        this.f22199c = new LinkedHashSet();
    }

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    public static final /* synthetic */ void access$closeWithRuntimeException(ViewModelImpl viewModelImpl, AutoCloseable autoCloseable) {
        viewModelImpl.getClass();
        a(autoCloseable);
    }

    public final void addCloseable(@NotNull String key, @NotNull AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (this.f22200d) {
            a(closeable);
            return;
        }
        synchronized (this.f22197a) {
            autoCloseable = (AutoCloseable) this.f22198b.put(key, closeable);
        }
        a(autoCloseable);
    }

    @MainThread
    public final void clear() {
        if (this.f22200d) {
            return;
        }
        this.f22200d = true;
        synchronized (this.f22197a) {
            try {
                Iterator it = this.f22198b.values().iterator();
                while (it.hasNext()) {
                    access$closeWithRuntimeException(this, (AutoCloseable) it.next());
                }
                Iterator it2 = this.f22199c.iterator();
                while (it2.hasNext()) {
                    access$closeWithRuntimeException(this, (AutoCloseable) it2.next());
                }
                this.f22199c.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public final <T extends AutoCloseable> T getCloseable(@NotNull String key) {
        T t10;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f22197a) {
            t10 = (T) this.f22198b.get(key);
        }
        return t10;
    }

    public ViewModelImpl(@NotNull CoroutineScope viewModelScope) {
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        this.f22197a = new SynchronizedObject();
        this.f22198b = new LinkedHashMap();
        this.f22199c = new LinkedHashSet();
        addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, CloseableCoroutineScopeKt.asCloseable(viewModelScope));
    }

    public final void addCloseable(@NotNull AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (this.f22200d) {
            a(closeable);
            return;
        }
        synchronized (this.f22197a) {
            this.f22199c.add(closeable);
            Unit unit = Unit.INSTANCE;
        }
    }

    public ViewModelImpl(@NotNull AutoCloseable... closeables) {
        Intrinsics.checkNotNullParameter(closeables, "closeables");
        this.f22197a = new SynchronizedObject();
        this.f22198b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f22199c = linkedHashSet;
        g.addAll(linkedHashSet, closeables);
    }

    public ViewModelImpl(@NotNull CoroutineScope viewModelScope, @NotNull AutoCloseable... closeables) {
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(closeables, "closeables");
        this.f22197a = new SynchronizedObject();
        this.f22198b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f22199c = linkedHashSet;
        addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, CloseableCoroutineScopeKt.asCloseable(viewModelScope));
        g.addAll(linkedHashSet, closeables);
    }
}
