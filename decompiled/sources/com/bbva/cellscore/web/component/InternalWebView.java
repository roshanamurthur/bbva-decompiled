package com.bbva.cellscore.web.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.ReplaySubject;
import k4.d;

/* JADX INFO: loaded from: classes2.dex */
public class InternalWebView extends WebView {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f27069t0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f27070p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f27071q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f27072r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ReplaySubject<Boolean> f27073s0;

    public InternalWebView(Context context) {
        super(context);
        this.f27073s0 = ReplaySubject.createWithSize(1);
    }

    @Override // android.view.View
    public Bitmap getDrawingCache() {
        Bitmap drawingCache = this.f27072r0 ? super.getDrawingCache() : null;
        this.f27072r0 = true;
        return drawingCache;
    }

    public View getLoadingView(Context context) {
        int i10 = this.f27070p0;
        if (i10 != 0) {
            return View.inflate(context, i10, null);
        }
        return null;
    }

    public Disposable loadRoute(Consumer<Boolean> consumer) {
        return this.f27073s0.subscribe(consumer);
    }

    public Observable<Boolean> observeRouteLoaded() {
        return this.f27073s0.filter(new d(0));
    }

    public void routeLoaded(String str) {
        if (str.equals(this.f27071q0)) {
            this.f27073s0.onNext(Boolean.TRUE);
        }
    }

    public void routeUnloaded(String str) {
        if (str.equals(this.f27071q0)) {
            this.f27073s0.onNext(Boolean.FALSE);
        }
    }

    public void setLoadingLayoutId(int i10) {
        this.f27070p0 = i10;
    }

    public void setRoute(String str) {
        String str2 = this.f27071q0;
        boolean z10 = str2 == null || str2.equals(str);
        this.f27072r0 = z10;
        if (!z10) {
            destroyDrawingCache();
        }
        this.f27071q0 = str;
    }

    public void unbind() {
        ((ViewGroup) getParent()).removeView(this);
    }
}
