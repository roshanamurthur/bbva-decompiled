package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.DrawableCompat;

/* JADX INFO: loaded from: classes.dex */
public class DrawableContainerCompat extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int G0 = 0;
    public long E0;
    public b F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public c f752p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Rect f753q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Drawable f754r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Drawable f755s0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f757u0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f758w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public a f759x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public long f760y0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f756t0 = 255;
    public int v0 = -1;

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DrawableContainerCompat f761p0;

        public a(StateListDrawableCompat stateListDrawableCompat) {
            this.f761p0 = stateListDrawableCompat;
        }

        @Override // java.lang.Runnable
        public final void run() {
            DrawableContainerCompat drawableContainerCompat = this.f761p0;
            drawableContainerCompat.a(true);
            drawableContainerCompat.invalidateSelf();
        }
    }

    public static abstract class c extends Drawable.ConstantState {
        public int A;
        public boolean B;
        public ColorFilter C;
        public boolean D;
        public ColorStateList E;
        public PorterDuff.Mode F;
        public boolean G;
        public boolean H;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DrawableContainerCompat f763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Resources f764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f765c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f766d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f767e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f768f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Drawable[] f769g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f770h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f771i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f772j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Rect f773k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f774l;
        public boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f775n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f776o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f777p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f778q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f779r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f780s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f781t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f782u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f783v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f784w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f785x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f786y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f787z;

        public c(c cVar, DrawableContainerCompat drawableContainerCompat, Resources resources) {
            this.f771i = false;
            this.f774l = false;
            this.f785x = true;
            this.f787z = 0;
            this.A = 0;
            this.f763a = drawableContainerCompat;
            this.f764b = resources != null ? resources : cVar != null ? cVar.f764b : null;
            int i10 = cVar != null ? cVar.f765c : 0;
            int i11 = DrawableContainerCompat.G0;
            i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
            i10 = i10 == 0 ? 160 : i10;
            this.f765c = i10;
            if (cVar == null) {
                this.f769g = new Drawable[10];
                this.f770h = 0;
                return;
            }
            this.f766d = cVar.f766d;
            this.f767e = cVar.f767e;
            this.f783v = true;
            this.f784w = true;
            this.f771i = cVar.f771i;
            this.f774l = cVar.f774l;
            this.f785x = cVar.f785x;
            this.f786y = cVar.f786y;
            this.f787z = cVar.f787z;
            this.A = cVar.A;
            this.B = cVar.B;
            this.C = cVar.C;
            this.D = cVar.D;
            this.E = cVar.E;
            this.F = cVar.F;
            this.G = cVar.G;
            this.H = cVar.H;
            if (cVar.f765c == i10) {
                if (cVar.f772j) {
                    this.f773k = cVar.f773k != null ? new Rect(cVar.f773k) : null;
                    this.f772j = true;
                }
                if (cVar.m) {
                    this.f775n = cVar.f775n;
                    this.f776o = cVar.f776o;
                    this.f777p = cVar.f777p;
                    this.f778q = cVar.f778q;
                    this.m = true;
                }
            }
            if (cVar.f779r) {
                this.f780s = cVar.f780s;
                this.f779r = true;
            }
            if (cVar.f781t) {
                this.f782u = cVar.f782u;
                this.f781t = true;
            }
            Drawable[] drawableArr = cVar.f769g;
            this.f769g = new Drawable[drawableArr.length];
            this.f770h = cVar.f770h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f768f;
            if (sparseArray != null) {
                this.f768f = sparseArray.clone();
            } else {
                this.f768f = new SparseArray<>(this.f770h);
            }
            int i12 = this.f770h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f768f.put(i13, constantState);
                    } else {
                        this.f769g[i13] = drawableArr[i13];
                    }
                }
            }
        }

        public final int a(Drawable drawable) {
            int i10 = this.f770h;
            if (i10 >= this.f769g.length) {
                int i11 = i10 + 10;
                StateListDrawableCompat.a aVar = (StateListDrawableCompat.a) this;
                Drawable[] drawableArr = new Drawable[i11];
                Drawable[] drawableArr2 = aVar.f769g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
                }
                aVar.f769g = drawableArr;
                int[][] iArr = new int[i11][];
                System.arraycopy(aVar.I, 0, iArr, 0, i10);
                aVar.I = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f763a);
            this.f769g[i10] = drawable;
            this.f770h++;
            this.f767e = drawable.getChangingConfigurations() | this.f767e;
            this.f779r = false;
            this.f781t = false;
            this.f773k = null;
            this.f772j = false;
            this.m = false;
            this.f783v = false;
            return i10;
        }

        public final void b() {
            this.m = true;
            c();
            int i10 = this.f770h;
            Drawable[] drawableArr = this.f769g;
            this.f776o = -1;
            this.f775n = -1;
            this.f778q = 0;
            this.f777p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f775n) {
                    this.f775n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f776o) {
                    this.f776o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f777p) {
                    this.f777p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f778q) {
                    this.f778q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f768f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    int iKeyAt = this.f768f.keyAt(i10);
                    Drawable.ConstantState constantStateValueAt = this.f768f.valueAt(i10);
                    Drawable[] drawableArr = this.f769g;
                    Drawable drawableNewDrawable = constantStateValueAt.newDrawable(this.f764b);
                    DrawableCompat.setLayoutDirection(drawableNewDrawable, this.f786y);
                    Drawable drawableMutate = drawableNewDrawable.mutate();
                    drawableMutate.setCallback(this.f763a);
                    drawableArr[iKeyAt] = drawableMutate;
                }
                this.f768f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @RequiresApi(21)
        public final boolean canApplyTheme() {
            int i10 = this.f770h;
            Drawable[] drawableArr = this.f769g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f768f.get(i11);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (DrawableCompat.canApplyTheme(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public final Drawable d(int i10) {
            int iIndexOfKey;
            Drawable drawable = this.f769g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f768f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable drawableNewDrawable = this.f768f.valueAt(iIndexOfKey).newDrawable(this.f764b);
            DrawableCompat.setLayoutDirection(drawableNewDrawable, this.f786y);
            Drawable drawableMutate = drawableNewDrawable.mutate();
            drawableMutate.setCallback(this.f763a);
            this.f769g[i10] = drawableMutate;
            this.f768f.removeAt(iIndexOfKey);
            if (this.f768f.size() == 0) {
                this.f768f = null;
            }
            return drawableMutate;
        }

        public abstract void e();

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f766d | this.f767e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void a(boolean z10) {
        boolean z11;
        Drawable drawable;
        long j10;
        boolean z12 = true;
        this.f757u0 = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f754r0;
        if (drawable2 != null) {
            long j11 = this.f760y0;
            if (j11 != 0) {
                if (j11 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f756t0);
                    this.f760y0 = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j11 - jUptimeMillis) * 255)) / this.f752p0.f787z)) * this.f756t0) / 255);
                    z11 = true;
                }
            }
            drawable = this.f755s0;
            if (drawable != null) {
                j10 = this.E0;
                if (j10 == 0) {
                    if (j10 <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f755s0 = null;
                        this.E0 = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j10 - jUptimeMillis) * 255)) / this.f752p0.A) * this.f756t0) / 255);
                    }
                }
                if (z10 || !z12) {
                }
                scheduleSelf(this.f759x0, jUptimeMillis + 16);
                return;
            }
            this.E0 = 0L;
            z12 = z11;
            if (z10) {
            }
        }
        this.f760y0 = 0L;
        z11 = false;
        drawable = this.f755s0;
        if (drawable != null) {
            j10 = this.E0;
            if (j10 == 0) {
                if (j10 <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f755s0 = null;
                    this.E0 = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j10 - jUptimeMillis) * 255)) / this.f752p0.A) * this.f756t0) / 255);
                }
            }
            if (z10) {
            }
        }
        this.E0 = 0L;
        z12 = z11;
        if (z10) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void applyTheme(@NonNull Resources.Theme theme) {
        c cVar = this.f752p0;
        if (theme == null) {
            cVar.getClass();
            return;
        }
        cVar.c();
        int i10 = cVar.f770h;
        Drawable[] drawableArr = cVar.f769g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null && DrawableCompat.canApplyTheme(drawable)) {
                DrawableCompat.applyTheme(drawableArr[i11], theme);
                cVar.f767e |= drawableArr[i11].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            cVar.f764b = resources;
            int i12 = resources.getDisplayMetrics().densityDpi;
            if (i12 == 0) {
                i12 = 160;
            }
            int i13 = cVar.f765c;
            cVar.f765c = i12;
            if (i13 != i12) {
                cVar.m = false;
                cVar.f772j = false;
            }
        }
    }

    public c b() {
        return this.f752p0;
    }

    public final void c(Drawable drawable) {
        if (this.F0 == null) {
            this.F0 = new b();
        }
        b bVar = this.F0;
        bVar.f762p0 = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f752p0.f787z <= 0 && this.f757u0) {
                drawable.setAlpha(this.f756t0);
            }
            c cVar = this.f752p0;
            if (cVar.D) {
                drawable.setColorFilter(cVar.C);
            } else {
                if (cVar.G) {
                    DrawableCompat.setTintList(drawable, cVar.E);
                }
                c cVar2 = this.f752p0;
                if (cVar2.H) {
                    DrawableCompat.setTintMode(drawable, cVar2.F);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f752p0.f785x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
            DrawableCompat.setAutoMirrored(drawable, this.f752p0.B);
            Rect rect = this.f753q0;
            if (rect != null) {
                DrawableCompat.setHotspotBounds(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            b bVar2 = this.F0;
            Drawable.Callback callback = bVar2.f762p0;
            bVar2.f762p0 = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public boolean canApplyTheme() {
        return this.f752p0.canApplyTheme();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    public final boolean d(int i10) {
        if (i10 == this.v0) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f752p0.A > 0) {
            Drawable drawable = this.f755s0;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f754r0;
            if (drawable2 != null) {
                this.f755s0 = drawable2;
                this.E0 = ((long) this.f752p0.A) + jUptimeMillis;
            } else {
                this.f755s0 = null;
                this.E0 = 0L;
            }
        } else {
            Drawable drawable3 = this.f754r0;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i10 >= 0) {
            c cVar = this.f752p0;
            if (i10 < cVar.f770h) {
                Drawable drawableD = cVar.d(i10);
                this.f754r0 = drawableD;
                this.v0 = i10;
                if (drawableD != null) {
                    int i11 = this.f752p0.f787z;
                    if (i11 > 0) {
                        this.f760y0 = jUptimeMillis + ((long) i11);
                    }
                    c(drawableD);
                }
            } else {
                this.f754r0 = null;
                this.v0 = -1;
            }
        } else {
            this.f754r0 = null;
            this.v0 = -1;
        }
        if (this.f760y0 != 0 || this.E0 != 0) {
            a aVar = this.f759x0;
            if (aVar == null) {
                this.f759x0 = new a((StateListDrawableCompat) this);
            } else {
                unscheduleSelf(aVar);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable = this.f754r0;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f755s0;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(c cVar) {
        this.f752p0 = cVar;
        int i10 = this.v0;
        if (i10 >= 0) {
            Drawable drawableD = cVar.d(i10);
            this.f754r0 = drawableD;
            if (drawableD != null) {
                c(drawableD);
            }
        }
        this.f755s0 = null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f756t0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f752p0.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        c cVar = this.f752p0;
        if (!cVar.f783v) {
            cVar.c();
            cVar.f783v = true;
            int i10 = cVar.f770h;
            Drawable[] drawableArr = cVar.f769g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    cVar.f784w = false;
                    return null;
                }
            }
            cVar.f784w = true;
        } else if (!cVar.f784w) {
            return null;
        }
        this.f752p0.f766d = getChangingConfigurations();
        return this.f752p0;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.f754r0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@NonNull Rect rect) {
        Rect rect2 = this.f753q0;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        c cVar = this.f752p0;
        if (cVar.f774l) {
            if (!cVar.m) {
                cVar.b();
            }
            return cVar.f776o;
        }
        Drawable drawable = this.f754r0;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        c cVar = this.f752p0;
        if (cVar.f774l) {
            if (!cVar.m) {
                cVar.b();
            }
            return cVar.f775n;
        }
        Drawable drawable = this.f754r0;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        c cVar = this.f752p0;
        if (cVar.f774l) {
            if (!cVar.m) {
                cVar.b();
            }
            return cVar.f778q;
        }
        Drawable drawable = this.f754r0;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        c cVar = this.f752p0;
        if (cVar.f774l) {
            if (!cVar.m) {
                cVar.b();
            }
            return cVar.f777p;
        }
        Drawable drawable = this.f754r0;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f754r0;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.f752p0;
        if (cVar.f779r) {
            return cVar.f780s;
        }
        cVar.c();
        int i10 = cVar.f770h;
        Drawable[] drawableArr = cVar.f769g;
        int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i11 = 1; i11 < i10; i11++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
        }
        cVar.f780s = opacity;
        cVar.f779r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void getOutline(@NonNull Outline outline) {
        Drawable drawable = this.f754r0;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        c cVar = this.f752p0;
        boolean padding = false;
        Rect rect2 = null;
        if (!cVar.f771i) {
            Rect rect3 = cVar.f773k;
            if (rect3 != null || cVar.f772j) {
                rect2 = rect3;
            } else {
                cVar.c();
                Rect rect4 = new Rect();
                int i10 = cVar.f770h;
                Drawable[] drawableArr = cVar.f769g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                cVar.f772j = true;
                cVar.f773k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f754r0;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (isAutoMirrored() && DrawableCompat.getLayoutDirection(this) == 1) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        c cVar = this.f752p0;
        if (cVar != null) {
            cVar.f779r = false;
            cVar.f781t = false;
        }
        if (drawable != this.f754r0 || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f752p0.B;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        c cVar = this.f752p0;
        if (cVar.f781t) {
            return cVar.f782u;
        }
        cVar.c();
        int i10 = cVar.f770h;
        Drawable[] drawableArr = cVar.f769g;
        boolean z10 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            if (drawableArr[i11].isStateful()) {
                z10 = true;
                break;
            }
        }
        cVar.f782u = z10;
        cVar.f781t = true;
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f755s0;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f755s0 = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f754r0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f757u0) {
                this.f754r0.setAlpha(this.f756t0);
            }
        }
        if (this.E0 != 0) {
            this.E0 = 0L;
        } else {
            z11 = z10;
        }
        if (this.f760y0 != 0) {
            this.f760y0 = 0L;
        } else if (!z11) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f758w0 && super.mutate() == this) {
            c cVarB = b();
            cVarB.e();
            e(cVarB);
            this.f758w0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f755s0;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f754r0;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        c cVar = this.f752p0;
        int i11 = this.v0;
        int i12 = cVar.f770h;
        Drawable[] drawableArr = cVar.f769g;
        boolean z10 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                boolean layoutDirection = DrawableCompat.setLayoutDirection(drawable, i10);
                if (i13 == i11) {
                    z10 = layoutDirection;
                }
            }
        }
        cVar.f786y = i10;
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f755s0;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f754r0;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        Drawable drawable = this.f755s0;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f754r0;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
        if (drawable != this.f754r0 || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f757u0 && this.f756t0 == i10) {
            return;
        }
        this.f757u0 = true;
        this.f756t0 = i10;
        Drawable drawable = this.f754r0;
        if (drawable != null) {
            if (this.f760y0 == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        c cVar = this.f752p0;
        if (cVar.B != z10) {
            cVar.B = z10;
            Drawable drawable = this.f754r0;
            if (drawable != null) {
                DrawableCompat.setAutoMirrored(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f752p0;
        cVar.D = true;
        if (cVar.C != colorFilter) {
            cVar.C = colorFilter;
            Drawable drawable = this.f754r0;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        c cVar = this.f752p0;
        if (cVar.f785x != z10) {
            cVar.f785x = z10;
            Drawable drawable = this.f754r0;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    public void setEnterFadeDuration(int i10) {
        this.f752p0.f787z = i10;
    }

    public void setExitFadeDuration(int i10) {
        this.f752p0.A = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f6, float f10) {
        Drawable drawable = this.f754r0;
        if (drawable != null) {
            DrawableCompat.setHotspot(drawable, f6, f10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f753q0;
        if (rect == null) {
            this.f753q0 = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f754r0;
        if (drawable != null) {
            DrawableCompat.setHotspotBounds(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@ColorInt int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f752p0;
        cVar.G = true;
        if (cVar.E != colorStateList) {
            cVar.E = colorStateList;
            DrawableCompat.setTintList(this.f754r0, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        c cVar = this.f752p0;
        cVar.H = true;
        if (cVar.F != mode) {
            cVar.F = mode;
            DrawableCompat.setTintMode(this.f754r0, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f755s0;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f754r0;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        if (drawable != this.f754r0 || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    public static class b implements Drawable.Callback {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Drawable.Callback f762p0;

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
            Drawable.Callback callback = this.f762p0;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            Drawable.Callback callback = this.f762p0;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(@NonNull Drawable drawable) {
        }
    }
}
