package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.p;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Objects;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes2.dex */
public final class LoaderManagerImpl extends LoaderManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f22201c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LifecycleOwner f22202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final b f22203b;

    public static class LoaderInfo<D> extends MutableLiveData<D> implements Loader.OnLoadCompleteListener<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Bundle f22205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final Loader<D> f22206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public LifecycleOwner f22207d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a<D> f22208e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Loader<D> f22209f;

        public LoaderInfo(int i10, @Nullable Bundle bundle, @NonNull Loader<D> loader, @Nullable Loader<D> loader2) {
            this.f22204a = i10;
            this.f22205b = bundle;
            this.f22206c = loader;
            this.f22209f = loader2;
            loader.registerListener(i10, this);
        }

        @MainThread
        public final Loader<D> a(boolean z10) {
            if (LoaderManagerImpl.f22201c) {
                toString();
            }
            Loader<D> loader = this.f22206c;
            loader.cancelLoad();
            loader.abandon();
            a<D> aVar = this.f22208e;
            if (aVar != null) {
                removeObserver(aVar);
                if (z10 && aVar.f22212c) {
                    boolean z11 = LoaderManagerImpl.f22201c;
                    Loader<D> loader2 = aVar.f22210a;
                    if (z11) {
                        Objects.toString(loader2);
                    }
                    aVar.f22211b.onLoaderReset(loader2);
                }
            }
            loader.unregisterListener(this);
            if ((aVar == null || aVar.f22212c) && !z10) {
                return loader;
            }
            loader.reset();
            return this.f22209f;
        }

        public final void b() {
            LifecycleOwner lifecycleOwner = this.f22207d;
            a<D> aVar = this.f22208e;
            if (lifecycleOwner == null || aVar == null) {
                return;
            }
            super.removeObserver(aVar);
            observe(lifecycleOwner, aVar);
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f22204a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f22205b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            Loader<D> loader = this.f22206c;
            printWriter.println(loader);
            loader.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f22208e != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f22208e);
                a<D> aVar = this.f22208e;
                aVar.getClass();
                printWriter.print(str + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(aVar.f22212c);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(loader.dataToString(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            if (LoaderManagerImpl.f22201c) {
                toString();
            }
            this.f22206c.startLoading();
        }

        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            if (LoaderManagerImpl.f22201c) {
                toString();
            }
            this.f22206c.stopLoading();
        }

        @Override // androidx.loader.content.Loader.OnLoadCompleteListener
        public void onLoadComplete(@NonNull Loader<D> loader, @Nullable D d2) {
            if (LoaderManagerImpl.f22201c) {
                toString();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d2);
                return;
            }
            if (LoaderManagerImpl.f22201c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            postValue(d2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void removeObserver(@NonNull Observer<? super D> observer) {
            super.removeObserver(observer);
            this.f22207d = null;
            this.f22208e = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(D d2) {
            super.setValue(d2);
            Loader<D> loader = this.f22209f;
            if (loader != null) {
                loader.reset();
                this.f22209f = null;
            }
        }

        @NonNull
        public String toString() {
            StringBuilder sbA = androidx.fragment.app.a.a(64, "LoaderInfo{");
            sbA.append(Integer.toHexString(System.identityHashCode(this)));
            sbA.append(" #");
            sbA.append(this.f22204a);
            sbA.append(" : ");
            Class<?> cls = this.f22206c.getClass();
            sbA.append(cls.getSimpleName());
            sbA.append("{");
            sbA.append(Integer.toHexString(System.identityHashCode(cls)));
            sbA.append("}}");
            return sbA.toString();
        }
    }

    public static class a<D> implements Observer<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Loader<D> f22210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final LoaderManager.LoaderCallbacks<D> f22211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f22212c = false;

        public a(@NonNull Loader<D> loader, @NonNull LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
            this.f22210a = loader;
            this.f22211b = loaderCallbacks;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@Nullable D d2) {
            boolean z10 = LoaderManagerImpl.f22201c;
            Loader<D> loader = this.f22210a;
            if (z10) {
                Objects.toString(loader);
                loader.dataToString(d2);
            }
            this.f22212c = true;
            this.f22211b.onLoadFinished(loader, d2);
        }

        @NonNull
        public final String toString() {
            return this.f22211b.toString();
        }
    }

    public static class b extends ViewModel {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final a f22213r0 = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SparseArrayCompat<LoaderInfo> f22214p0 = new SparseArrayCompat<>();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f22215q0 = false;

        public static class a implements ViewModelProvider.Factory {
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
                return p.b(this, cls, creationExtras);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(KClass kClass, CreationExtras creationExtras) {
                return p.c(this, kClass, creationExtras);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @NonNull
            public final <T extends ViewModel> T create(@NonNull Class<T> cls) {
                return new b();
            }
        }

        @Override // androidx.lifecycle.ViewModel
        public final void onCleared() {
            super.onCleared();
            SparseArrayCompat<LoaderInfo> sparseArrayCompat = this.f22214p0;
            int size = sparseArrayCompat.size();
            for (int i10 = 0; i10 < size; i10++) {
                sparseArrayCompat.valueAt(i10).a(true);
            }
            sparseArrayCompat.clear();
        }
    }

    public LoaderManagerImpl(@NonNull LifecycleOwner lifecycleOwner, @NonNull ViewModelStore viewModelStore) {
        this.f22202a = lifecycleOwner;
        this.f22203b = (b) new ViewModelProvider(viewModelStore, b.f22213r0).get(b.class);
    }

    @NonNull
    @MainThread
    public final <D> Loader<D> a(int i10, @Nullable Bundle bundle, @NonNull LoaderManager.LoaderCallbacks<D> loaderCallbacks, @Nullable Loader<D> loader) {
        b bVar = this.f22203b;
        try {
            bVar.f22215q0 = true;
            Loader<D> loaderOnCreateLoader = loaderCallbacks.onCreateLoader(i10, bundle);
            if (loaderOnCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (loaderOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(loaderOnCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + loaderOnCreateLoader);
            }
            LoaderInfo loaderInfo = new LoaderInfo(i10, bundle, loaderOnCreateLoader, loader);
            if (f22201c) {
                loaderInfo.toString();
            }
            bVar.f22214p0.put(i10, loaderInfo);
            bVar.f22215q0 = false;
            Loader<D> loader2 = loaderInfo.f22206c;
            a<D> aVar = new a<>(loader2, loaderCallbacks);
            LifecycleOwner lifecycleOwner = this.f22202a;
            loaderInfo.observe(lifecycleOwner, aVar);
            a<D> aVar2 = loaderInfo.f22208e;
            if (aVar2 != null) {
                loaderInfo.removeObserver(aVar2);
            }
            loaderInfo.f22207d = lifecycleOwner;
            loaderInfo.f22208e = aVar;
            return loader2;
        } catch (Throwable th2) {
            bVar.f22215q0 = false;
            throw th2;
        }
    }

    @Override // androidx.loader.app.LoaderManager
    @MainThread
    public final void destroyLoader(int i10) {
        b bVar = this.f22203b;
        if (bVar.f22215q0) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (f22201c) {
            toString();
        }
        LoaderInfo loaderInfo = bVar.f22214p0.get(i10);
        if (loaderInfo != null) {
            loaderInfo.a(true);
            bVar.f22214p0.remove(i10);
        }
    }

    @Override // androidx.loader.app.LoaderManager
    @Deprecated
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        SparseArrayCompat<LoaderInfo> sparseArrayCompat = this.f22203b.f22214p0;
        if (sparseArrayCompat.size() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i10 = 0; i10 < sparseArrayCompat.size(); i10++) {
                LoaderInfo loaderInfoValueAt = sparseArrayCompat.valueAt(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(sparseArrayCompat.keyAt(i10));
                printWriter.print(": ");
                printWriter.println(loaderInfoValueAt.toString());
                loaderInfoValueAt.dump(str2, fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // androidx.loader.app.LoaderManager
    @Nullable
    public final <D> Loader<D> getLoader(int i10) {
        b bVar = this.f22203b;
        if (bVar.f22215q0) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderInfo = bVar.f22214p0.get(i10);
        if (loaderInfo != null) {
            return loaderInfo.f22206c;
        }
        return null;
    }

    @Override // androidx.loader.app.LoaderManager
    public final boolean hasRunningLoaders() {
        a<D> aVar;
        SparseArrayCompat<LoaderInfo> sparseArrayCompat = this.f22203b.f22214p0;
        int size = sparseArrayCompat.size();
        for (int i10 = 0; i10 < size; i10++) {
            LoaderInfo loaderInfoValueAt = sparseArrayCompat.valueAt(i10);
            if (loaderInfoValueAt.hasActiveObservers() && (aVar = loaderInfoValueAt.f22208e) != 0 && !aVar.f22212c) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.loader.app.LoaderManager
    @NonNull
    @MainThread
    public final <D> Loader<D> initLoader(int i10, @Nullable Bundle bundle, @NonNull LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
        b bVar = this.f22203b;
        if (bVar.f22215q0) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        LoaderInfo loaderInfo = bVar.f22214p0.get(i10);
        if (f22201c) {
            toString();
            Objects.toString(bundle);
        }
        if (loaderInfo == null) {
            return a(i10, bundle, loaderCallbacks, null);
        }
        if (f22201c) {
            loaderInfo.toString();
        }
        Loader<D> loader = loaderInfo.f22206c;
        a<D> aVar = new a<>(loader, loaderCallbacks);
        LifecycleOwner lifecycleOwner = this.f22202a;
        loaderInfo.observe(lifecycleOwner, aVar);
        a<D> aVar2 = loaderInfo.f22208e;
        if (aVar2 != null) {
            loaderInfo.removeObserver(aVar2);
        }
        loaderInfo.f22207d = lifecycleOwner;
        loaderInfo.f22208e = aVar;
        return loader;
    }

    @Override // androidx.loader.app.LoaderManager
    public final void markForRedelivery() {
        SparseArrayCompat<LoaderInfo> sparseArrayCompat = this.f22203b.f22214p0;
        int size = sparseArrayCompat.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArrayCompat.valueAt(i10).b();
        }
    }

    @Override // androidx.loader.app.LoaderManager
    @NonNull
    @MainThread
    public final <D> Loader<D> restartLoader(int i10, @Nullable Bundle bundle, @NonNull LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
        b bVar = this.f22203b;
        if (bVar.f22215q0) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if (f22201c) {
            toString();
            Objects.toString(bundle);
        }
        LoaderInfo loaderInfo = bVar.f22214p0.get(i10);
        return a(i10, bundle, loaderCallbacks, loaderInfo != null ? loaderInfo.a(false) : null);
    }

    @NonNull
    public final String toString() {
        StringBuilder sbA = androidx.fragment.app.a.a(128, "LoaderManager{");
        sbA.append(Integer.toHexString(System.identityHashCode(this)));
        sbA.append(" in ");
        Class<?> cls = this.f22202a.getClass();
        sbA.append(cls.getSimpleName());
        sbA.append("{");
        sbA.append(Integer.toHexString(System.identityHashCode(cls)));
        sbA.append("}}");
        return sbA.toString();
    }
}
