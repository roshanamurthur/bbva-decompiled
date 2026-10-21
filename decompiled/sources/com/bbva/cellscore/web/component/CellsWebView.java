package com.bbva.cellscore.web.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bbva.cellscore.R;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.web.WebController;
import com.bbva.cellscore.web.component.CellsWebView;
import com.bbva.glomohybrid.base.webview.WebActions;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import k4.b;

/* JADX INFO: loaded from: classes2.dex */
public class CellsWebView extends FrameLayout implements LifecycleObserver, View.OnTouchListener {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f27063t0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f27064p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View f27065q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public CompositeDisposable f27066r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f27067s0;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f27068a;

        public a(View view) {
            this.f27068a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f27068a.setVisibility(8);
        }
    }

    public CellsWebView(Context context) {
        super(context);
        this.f27064p0 = true;
        a(context, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Context context, AttributeSet attributeSet, int i10) {
        this.f27066r0 = new CompositeDisposable();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.CellsWebView, i10, 0);
        try {
            this.f27067s0 = typedArrayObtainStyledAttributes.getInteger(R.styleable.CellsWebView_cells_loader_hide_delay, 0);
            if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.CellsWebView_activeCompatibilityMode, false) && Build.VERSION.SDK_INT >= 24) {
                this.f27064p0 = false;
            }
        } catch (Exception unused) {
            typedArrayObtainStyledAttributes.recycle();
        }
        ((LifecycleOwner) context).getLifecycle().addObserver(this);
    }

    public void hideLoadingView(View view) {
        view.animate().alpha(0.0f).setListener(new a(view)).start();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        InternalWebView webView = ((WebController) ComponentManager.get(WebActions.ID)).getWebView();
        if (webView != null && webView.getParent() != null && webView.getParent() == this) {
            webView.unbind();
            webView.setOnTouchListener(null);
        }
        ((LifecycleOwner) getContext()).getLifecycle().removeObserver(this);
        this.f27066r0.clear();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        if (this.f27064p0) {
            InternalWebView webView = ((WebController) ComponentManager.get(WebActions.ID)).getWebView();
            ViewGroup viewGroup = (ViewGroup) webView.getParent();
            if (viewGroup != null) {
                if (viewGroup == this) {
                    return;
                } else {
                    viewGroup.removeView(webView);
                }
            }
            webView.setBackgroundColor(-1);
            addView(webView, new FrameLayout.LayoutParams(-1, -1));
            if (this.f27064p0) {
                View loadingView = webView.getLoadingView(getContext());
                this.f27065q0 = loadingView;
                if (loadingView != null) {
                    addView(loadingView, new FrameLayout.LayoutParams(-1, -1));
                    this.f27066r0.add(Observable.zip(Observable.timer(this.f27067s0, TimeUnit.MILLISECONDS), webView.observeRouteLoaded(), new k4.a()).filter(new b(this)).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: k4.c
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            CellsWebView cellsWebView = this.f79187p0;
                            cellsWebView.hideLoadingView(cellsWebView.f27065q0);
                        }
                    }));
                }
            }
            webView.setOnTouchListener(this);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return !isEnabled();
    }

    public CellsWebView(Context context, boolean z10) {
        super(context);
        this.f27064p0 = true;
        a(context, null, 0);
        this.f27064p0 = z10;
    }

    public CellsWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27064p0 = true;
        a(context, attributeSet, 0);
    }

    public CellsWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27064p0 = true;
        a(context, attributeSet, i10);
    }

    @RequiresApi(api = 21)
    public CellsWebView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f27064p0 = true;
        a(context, attributeSet, i10);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
    }
}
