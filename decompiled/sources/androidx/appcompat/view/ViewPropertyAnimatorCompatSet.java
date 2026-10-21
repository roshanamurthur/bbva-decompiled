package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ViewPropertyAnimatorCompatSet {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewPropertyAnimatorListener f860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f861e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f858b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f862f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<ViewPropertyAnimatorCompat> f857a = new ArrayList<>();

    public class a extends ViewPropertyAnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f863a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f864b = 0;

        public a() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd(View view) {
            int i10 = this.f864b + 1;
            this.f864b = i10;
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = ViewPropertyAnimatorCompatSet.this;
            if (i10 == viewPropertyAnimatorCompatSet.f857a.size()) {
                ViewPropertyAnimatorListener viewPropertyAnimatorListener = viewPropertyAnimatorCompatSet.f860d;
                if (viewPropertyAnimatorListener != null) {
                    viewPropertyAnimatorListener.onAnimationEnd(null);
                }
                this.f864b = 0;
                this.f863a = false;
                viewPropertyAnimatorCompatSet.f861e = false;
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationStart(View view) {
            if (this.f863a) {
                return;
            }
            this.f863a = true;
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = ViewPropertyAnimatorCompatSet.this.f860d;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.onAnimationStart(null);
            }
        }
    }

    public void cancel() {
        if (this.f861e) {
            Iterator<ViewPropertyAnimatorCompat> it = this.f857a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f861e = false;
        }
    }

    public ViewPropertyAnimatorCompatSet play(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        if (!this.f861e) {
            this.f857a.add(viewPropertyAnimatorCompat);
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet playSequentially(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2) {
        ArrayList<ViewPropertyAnimatorCompat> arrayList = this.f857a;
        arrayList.add(viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompat2.setStartDelay(viewPropertyAnimatorCompat.getDuration());
        arrayList.add(viewPropertyAnimatorCompat2);
        return this;
    }

    public ViewPropertyAnimatorCompatSet setDuration(long j10) {
        if (!this.f861e) {
            this.f858b = j10;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setInterpolator(Interpolator interpolator) {
        if (!this.f861e) {
            this.f859c = interpolator;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setListener(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (!this.f861e) {
            this.f860d = viewPropertyAnimatorListener;
        }
        return this;
    }

    public void start() {
        if (this.f861e) {
            return;
        }
        for (ViewPropertyAnimatorCompat viewPropertyAnimatorCompat : this.f857a) {
            long j10 = this.f858b;
            if (j10 >= 0) {
                viewPropertyAnimatorCompat.setDuration(j10);
            }
            Interpolator interpolator = this.f859c;
            if (interpolator != null) {
                viewPropertyAnimatorCompat.setInterpolator(interpolator);
            }
            if (this.f860d != null) {
                viewPropertyAnimatorCompat.setListener(this.f862f);
            }
            viewPropertyAnimatorCompat.start();
        }
        this.f861e = true;
    }
}
