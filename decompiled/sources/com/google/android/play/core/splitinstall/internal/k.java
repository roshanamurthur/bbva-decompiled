package com.google.android.play.core.splitinstall.internal;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzef;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToObservable;
import io.reactivex.rxjava3.internal.operators.single.SingleToObservable;
import java.io.File;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class k implements zzan, zzef {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(Observable observable, Function function, CompletableObserver completableObserver) {
        CompletableSource completableSource;
        if (!(observable instanceof Supplier)) {
            return false;
        }
        try {
            Object obj = ((Supplier) observable).get();
            if (obj != null) {
                Object objApply = function.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                completableSource = (CompletableSource) objApply;
            } else {
                completableSource = null;
            }
            if (completableSource == null) {
                EmptyDisposable.complete(completableObserver);
            } else {
                completableSource.subscribe(completableObserver);
            }
            return true;
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, completableObserver);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(Observable observable, Function function, Observer observer) {
        MaybeSource maybeSource;
        if (!(observable instanceof Supplier)) {
            return false;
        }
        try {
            Object obj = ((Supplier) observable).get();
            if (obj != null) {
                Object objApply = function.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                maybeSource = (MaybeSource) objApply;
            } else {
                maybeSource = null;
            }
            if (maybeSource == null) {
                EmptyDisposable.complete((Observer<?>) observer);
            } else {
                maybeSource.subscribe(MaybeToObservable.create(observer));
            }
            return true;
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, (Observer<?>) observer);
            return true;
        }
    }

    public static boolean d(ObservableSource observableSource, Function function, Observer observer) {
        SingleSource singleSource;
        if (!(observableSource instanceof Supplier)) {
            return false;
        }
        try {
            Object obj = ((Supplier) observableSource).get();
            if (obj != null) {
                Object objApply = function.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null SingleSource");
                singleSource = (SingleSource) objApply;
            } else {
                singleSource = null;
            }
            if (singleSource == null) {
                EmptyDisposable.complete((Observer<?>) observer);
            } else {
                singleSource.subscribe(SingleToObservable.create(observer));
            }
            return true;
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, (Observer<?>) observer);
            return true;
        }
    }

    public static boolean e(ClassLoader classLoader, File file, File file2, boolean z10) {
        return f.a(classLoader, file, file2, z10, new af.b(), "path", new j());
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public void zza(ClassLoader classLoader, Set set) {
        af.d.b(classLoader, set, new i());
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public boolean zzb(ClassLoader classLoader, File file, File file2, boolean z10) {
        return e(classLoader, file, file2, z10);
    }

    public void a() {
    }
}
