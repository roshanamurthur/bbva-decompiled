package com.bbva.cellscore.web.navigation;

import android.app.Activity;
import com.bbva.cellscore.R;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class Route {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class<? extends Activity> f27184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27187d;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Class<? extends Activity> f27188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f27191d;

        public Builder activity(Class<? extends Activity> cls) {
            this.f27188a = cls;
            return this;
        }

        public Builder animationIn(int i10) {
            this.f27189b = i10;
            return this;
        }

        public Builder animationOut(int i10) {
            this.f27190c = i10;
            return this;
        }

        public Route build() {
            Route route = new Route();
            route.f27184a = this.f27188a;
            route.f27185b = this.f27189b;
            int i10 = this.f27190c;
            if (i10 == 0) {
                i10 = R.anim.none;
            }
            route.f27186c = i10;
            route.f27187d = this.f27191d;
            return route;
        }

        public Builder loadingLayout(int i10) {
            this.f27191d = i10;
            return this;
        }
    }

    public Route(Class<? extends Activity> cls) {
        this.f27184a = cls;
    }

    public Class<? extends Activity> getActivity() {
        return this.f27184a;
    }

    public int getAnimationIn() {
        return this.f27185b;
    }

    public int getAnimationOut() {
        return this.f27186c;
    }

    public int getLoadingLayout() {
        return this.f27187d;
    }

    public void init(Class<? extends Activity> cls, int i10, int i11) {
        this.f27184a = cls;
        this.f27185b = i10;
        this.f27186c = i11;
    }

    public String toString() {
        return "Route{activity=" + this.f27184a + AbstractJsonLexerKt.END_OBJ;
    }

    public Route(Class<? extends Activity> cls, int i10) {
        init(cls, i10, R.anim.none);
    }

    public Route(Class<? extends Activity> cls, int i10, int i11) {
        init(cls, i10, i11);
    }
}
