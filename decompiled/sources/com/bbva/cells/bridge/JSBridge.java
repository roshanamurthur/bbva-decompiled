package com.bbva.cells.bridge;

import android.webkit.JavascriptInterface;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.ReplaySubject;
import io.reactivex.subjects.Subject;

/* JADX INFO: loaded from: classes2.dex */
public class JSBridge<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsMessageDeserializer<T> f26664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Subject<T> f26665b;

    public JSBridge(JsMessageDeserializer<T> jsMessageDeserializer, boolean z10) {
        this.f26665b = z10 ? ReplaySubject.createWithSize(1) : PublishSubject.create();
        this.f26664a = jsMessageDeserializer;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        this.f26665b.onNext(this.f26664a.deserialize(str));
    }

    public Disposable subscribe(Consumer<T> consumer) {
        return this.f26665b.observeOn(AndroidSchedulers.mainThread()).subscribe(consumer);
    }
}
