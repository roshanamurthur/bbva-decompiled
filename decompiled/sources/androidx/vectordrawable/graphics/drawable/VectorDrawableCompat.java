package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class VectorDrawableCompat extends androidx.vectordrawable.graphics.drawable.b {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final PorterDuff.Mode f23770y0 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public g f23771q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public PorterDuffColorFilter f23772r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ColorFilter f23773s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f23774t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f23775u0;
    public final float[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Matrix f23776w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Rect f23777x0;

    public static class a extends e {
    }

    public static class b extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ComplexColorCompat f23778e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ComplexColorCompat f23780g;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f23779f = 0.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f23781h = 1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f23782i = 1.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f23783j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f23784k = 1.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f23785l = 0.0f;
        public Paint.Cap m = Paint.Cap.BUTT;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Paint.Join f23786n = Paint.Join.MITER;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f23787o = 4.0f;

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.d
        public final boolean a() {
            return this.f23780g.isStateful() || this.f23778e.isStateful();
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.d
        public final boolean b(int[] iArr) {
            return this.f23778e.onStateChanged(iArr) | this.f23780g.onStateChanged(iArr);
        }

        public float getFillAlpha() {
            return this.f23782i;
        }

        @ColorInt
        public int getFillColor() {
            return this.f23780g.getColor();
        }

        public float getStrokeAlpha() {
            return this.f23781h;
        }

        @ColorInt
        public int getStrokeColor() {
            return this.f23778e.getColor();
        }

        public float getStrokeWidth() {
            return this.f23779f;
        }

        public float getTrimPathEnd() {
            return this.f23784k;
        }

        public float getTrimPathOffset() {
            return this.f23785l;
        }

        public float getTrimPathStart() {
            return this.f23783j;
        }

        public void setFillAlpha(float f6) {
            this.f23782i = f6;
        }

        public void setFillColor(int i10) {
            this.f23780g.setColor(i10);
        }

        public void setStrokeAlpha(float f6) {
            this.f23781h = f6;
        }

        public void setStrokeColor(int i10) {
            this.f23778e.setColor(i10);
        }

        public void setStrokeWidth(float f6) {
            this.f23779f = f6;
        }

        public void setTrimPathEnd(float f6) {
            this.f23784k = f6;
        }

        public void setTrimPathOffset(float f6) {
            this.f23785l = f6;
        }

        public void setTrimPathStart(float f6) {
            this.f23783j = f6;
        }
    }

    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public static class g extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f23820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorStateList f23821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f23822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f23823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Bitmap f23824f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ColorStateList f23825g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f23826h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f23827i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f23828j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f23829k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Paint f23830l;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f23819a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }
    }

    public VectorDrawableCompat() {
        this.f23775u0 = true;
        this.v0 = new float[9];
        this.f23776w0 = new Matrix();
        this.f23777x0 = new Rect();
        g gVar = new g();
        gVar.f23821c = null;
        gVar.f23822d = f23770y0;
        gVar.f23820b = new f();
        this.f23771q0 = gVar;
    }

    @Nullable
    public static VectorDrawableCompat create(@NonNull Resources resources, @DrawableRes int i10, @Nullable Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f23844p0 = ResourcesCompat.getDrawable(resources, i10, theme);
            new h(vectorDrawableCompat.f23844p0.getConstantState());
            return vectorDrawableCompat;
        }
        try {
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return createFromXmlInner(resources, (XmlPullParser) xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public static VectorDrawableCompat createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return vectorDrawableCompat;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f23844p0;
        if (drawable == null) {
            return false;
        }
        DrawableCompat.canApplyTheme(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f23777x0;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f23773s0;
        if (colorFilter == null) {
            colorFilter = this.f23772r0;
        }
        Matrix matrix = this.f23776w0;
        canvas.getMatrix(matrix);
        float[] fArr = this.v0;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && DrawableCompat.getLayoutDirection(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        g gVar = this.f23771q0;
        Bitmap bitmap = gVar.f23824f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != gVar.f23824f.getHeight()) {
            gVar.f23824f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            gVar.f23829k = true;
        }
        if (this.f23775u0) {
            g gVar2 = this.f23771q0;
            if (gVar2.f23829k || gVar2.f23825g != gVar2.f23821c || gVar2.f23826h != gVar2.f23822d || gVar2.f23828j != gVar2.f23823e || gVar2.f23827i != gVar2.f23820b.getRootAlpha()) {
                g gVar3 = this.f23771q0;
                gVar3.f23824f.eraseColor(0);
                Canvas canvas2 = new Canvas(gVar3.f23824f);
                f fVar = gVar3.f23820b;
                fVar.a(fVar.f23811g, f.f23804p, canvas2, iMin, iMin2);
                g gVar4 = this.f23771q0;
                gVar4.f23825g = gVar4.f23821c;
                gVar4.f23826h = gVar4.f23822d;
                gVar4.f23827i = gVar4.f23820b.getRootAlpha();
                gVar4.f23828j = gVar4.f23823e;
                gVar4.f23829k = false;
            }
        } else {
            g gVar5 = this.f23771q0;
            gVar5.f23824f.eraseColor(0);
            Canvas canvas3 = new Canvas(gVar5.f23824f);
            f fVar2 = gVar5.f23820b;
            fVar2.a(fVar2.f23811g, f.f23804p, canvas3, iMin, iMin2);
        }
        g gVar6 = this.f23771q0;
        if (gVar6.f23820b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (gVar6.f23830l == null) {
                Paint paint2 = new Paint();
                gVar6.f23830l = paint2;
                paint2.setFilterBitmap(true);
            }
            gVar6.f23830l.setAlpha(gVar6.f23820b.getRootAlpha());
            gVar6.f23830l.setColorFilter(colorFilter);
            paint = gVar6.f23830l;
        }
        canvas.drawBitmap(gVar6.f23824f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f23844p0;
        return drawable != null ? DrawableCompat.getAlpha(drawable) : this.f23771q0.f23820b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f23844p0;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f23771q0.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f23844p0;
        return drawable != null ? DrawableCompat.getColorFilter(drawable) : this.f23773s0;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f23844p0 != null && Build.VERSION.SDK_INT >= 24) {
            return new h(this.f23844p0.getConstantState());
        }
        this.f23771q0.f23819a = getChangingConfigurations();
        return this.f23771q0;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f23844p0;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f23771q0.f23820b.f23813i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f23844p0;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f23771q0.f23820b.f23812h;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public float getPixelSize() {
        f fVar;
        g gVar = this.f23771q0;
        if (gVar == null || (fVar = gVar.f23820b) == null) {
            return 1.0f;
        }
        float f6 = fVar.f23812h;
        if (f6 == 0.0f) {
            return 1.0f;
        }
        float f10 = fVar.f23813i;
        if (f10 == 0.0f) {
            return 1.0f;
        }
        float f11 = fVar.f23815k;
        if (f11 == 0.0f) {
            return 1.0f;
        }
        float f12 = fVar.f23814j;
        if (f12 == 0.0f) {
            return 1.0f;
        }
        return Math.min(f12 / f6, f11 / f10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f23844p0;
        return drawable != null ? DrawableCompat.isAutoMirrored(drawable) : this.f23771q0.f23823e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            g gVar = this.f23771q0;
            if (gVar != null) {
                f fVar = gVar.f23820b;
                if (fVar.f23817n == null) {
                    fVar.f23817n = Boolean.valueOf(fVar.f23811g.a());
                }
                if (fVar.f23817n.booleanValue() || ((colorStateList = this.f23771q0.f23821c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f23774t0 && super.mutate() == this) {
            g gVar = this.f23771q0;
            g gVar2 = new g();
            gVar2.f23821c = null;
            gVar2.f23822d = f23770y0;
            if (gVar != null) {
                gVar2.f23819a = gVar.f23819a;
                f fVar = new f(gVar.f23820b);
                gVar2.f23820b = fVar;
                if (gVar.f23820b.f23809e != null) {
                    fVar.f23809e = new Paint(gVar.f23820b.f23809e);
                }
                if (gVar.f23820b.f23808d != null) {
                    gVar2.f23820b.f23808d = new Paint(gVar.f23820b.f23808d);
                }
                gVar2.f23821c = gVar.f23821c;
                gVar2.f23822d = gVar.f23822d;
                gVar2.f23823e = gVar.f23823e;
            }
            this.f23771q0 = gVar2;
            this.f23774t0 = true;
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        g gVar = this.f23771q0;
        ColorStateList colorStateList = gVar.f23821c;
        if (colorStateList == null || (mode = gVar.f23822d) == null) {
            z10 = false;
        } else {
            this.f23772r0 = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        f fVar = gVar.f23820b;
        if (fVar.f23817n == null) {
            fVar.f23817n = Boolean.valueOf(fVar.f23811g.a());
        }
        if (fVar.f23817n.booleanValue()) {
            boolean zB = gVar.f23820b.f23811g.b(iArr);
            gVar.f23829k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f23771q0.f23820b.getRootAlpha() != i10) {
            this.f23771q0.f23820b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            DrawableCompat.setAutoMirrored(drawable, z10);
        } else {
            this.f23771q0.f23823e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f6, float f10) {
        super.setHotspot(f6, f10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i10) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            DrawableCompat.setTint(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
            return;
        }
        g gVar = this.f23771q0;
        if (gVar.f23821c != colorStateList) {
            gVar.f23821c = colorStateList;
            this.f23772r0 = a(colorStateList, gVar.f23822d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            DrawableCompat.setTintMode(drawable, mode);
            return;
        }
        g gVar = this.f23771q0;
        if (gVar.f23822d != mode) {
            gVar.f23822d = mode;
            this.f23772r0 = a(gVar.f23821c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f23844p0;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @RequiresApi(24)
    public static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f23831a;

        public h(Drawable.ConstantState constantState) {
            this.f23831a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f23831a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f23831a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f23844p0 = (VectorDrawable) this.f23831a.newDrawable();
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f23844p0 = (VectorDrawable) this.f23831a.newDrawable(resources);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f23844p0 = (VectorDrawable) this.f23831a.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f23773s0 = colorFilter;
            invalidateSelf();
        }
    }

    public static abstract class e extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PathParser.PathDataNode[] f23800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f23801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f23803d;

        public e() {
            this.f23800a = null;
            this.f23802c = 0;
        }

        public PathParser.PathDataNode[] getPathData() {
            return this.f23800a;
        }

        public String getPathName() {
            return this.f23801b;
        }

        public void setPathData(PathParser.PathDataNode[] pathDataNodeArr) {
            if (PathParser.canMorph(this.f23800a, pathDataNodeArr)) {
                PathParser.updateNodes(this.f23800a, pathDataNodeArr);
            } else {
                this.f23800a = PathParser.deepCopyNodes(pathDataNodeArr);
            }
        }

        public e(e eVar) {
            this.f23800a = null;
            this.f23802c = 0;
            this.f23801b = eVar.f23801b;
            this.f23803d = eVar.f23803d;
            this.f23800a = PathParser.deepCopyNodes(eVar.f23800a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        byte b10;
        int i10;
        ArrayDeque arrayDeque;
        int i11;
        boolean z10;
        int i12;
        TypedArray typedArray;
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            DrawableCompat.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        g gVar = this.f23771q0;
        gVar.f23820b = new f();
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23832a);
        g gVar2 = this.f23771q0;
        f fVar = gVar2.f23820b;
        byte b11 = -1;
        int namedInt = TypedArrayUtils.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i13 = 3;
        if (namedInt == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (namedInt != 5) {
            if (namedInt != 9) {
                switch (namedInt) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        gVar2.f23822d = mode;
        int i14 = 1;
        ColorStateList namedColorStateList = TypedArrayUtils.getNamedColorStateList(typedArrayObtainAttributes, xmlPullParser, theme, "tint", 1);
        if (namedColorStateList != null) {
            gVar2.f23821c = namedColorStateList;
        }
        gVar2.f23823e = TypedArrayUtils.getNamedBoolean(typedArrayObtainAttributes, xmlPullParser, "autoMirrored", 5, gVar2.f23823e);
        fVar.f23814j = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "viewportWidth", 7, fVar.f23814j);
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "viewportHeight", 8, fVar.f23815k);
        fVar.f23815k = namedFloat;
        if (fVar.f23814j <= 0.0f) {
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (namedFloat > 0.0f) {
            fVar.f23812h = typedArrayObtainAttributes.getDimension(3, fVar.f23812h);
            int i15 = 2;
            float dimension = typedArrayObtainAttributes.getDimension(2, fVar.f23813i);
            fVar.f23813i = dimension;
            if (fVar.f23812h <= 0.0f) {
                throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                fVar.setAlpha(TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "alpha", 4, fVar.getAlpha()));
                int i16 = 0;
                String string = typedArrayObtainAttributes.getString(0);
                if (string != null) {
                    fVar.m = string;
                    fVar.f23818o.put(string, fVar);
                }
                typedArrayObtainAttributes.recycle();
                gVar.f23819a = getChangingConfigurations();
                gVar.f23829k = true;
                g gVar3 = this.f23771q0;
                f fVar2 = gVar3.f23820b;
                ArrayDeque arrayDeque2 = new ArrayDeque();
                arrayDeque2.push(fVar2.f23811g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                while (eventType != i14 && (xmlPullParser.getDepth() >= depth || eventType != i13)) {
                    if (eventType == i15) {
                        String name = xmlPullParser.getName();
                        c cVar = (c) arrayDeque2.peek();
                        boolean zEquals = "path".equals(name);
                        ArrayMap<String, Object> arrayMap = fVar2.f23818o;
                        if (zEquals) {
                            b bVar = new b();
                            TypedArray typedArrayObtainAttributes2 = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23834c);
                            if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                                String string2 = typedArrayObtainAttributes2.getString(i16);
                                if (string2 != null) {
                                    bVar.f23801b = string2;
                                }
                                String string3 = typedArrayObtainAttributes2.getString(2);
                                if (string3 != null) {
                                    bVar.f23800a = PathParser.createNodesFromPathData(string3);
                                }
                                bVar.f23780g = TypedArrayUtils.getNamedComplexColor(typedArrayObtainAttributes2, xmlPullParser, theme, "fillColor", 1, 0);
                                bVar.f23782i = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes2, xmlPullParser, "fillAlpha", 12, bVar.f23782i);
                                int namedInt2 = TypedArrayUtils.getNamedInt(typedArrayObtainAttributes2, xmlPullParser, "strokeLineCap", 8, -1);
                                Paint.Cap cap = bVar.m;
                                if (namedInt2 == 0) {
                                    i12 = 2;
                                    cap = Paint.Cap.BUTT;
                                } else if (namedInt2 != 1) {
                                    i12 = 2;
                                    if (namedInt2 == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                } else {
                                    i12 = 2;
                                    cap = Paint.Cap.ROUND;
                                }
                                bVar.m = cap;
                                int namedInt3 = TypedArrayUtils.getNamedInt(typedArrayObtainAttributes2, xmlPullParser, "strokeLineJoin", 9, -1);
                                Paint.Join join = bVar.f23786n;
                                if (namedInt3 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (namedInt3 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (namedInt3 == i12) {
                                    join = Paint.Join.BEVEL;
                                }
                                bVar.f23786n = join;
                                bVar.f23787o = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes2, xmlPullParser, "strokeMiterLimit", 10, bVar.f23787o);
                                b10 = -1;
                                typedArray = typedArrayObtainAttributes2;
                                bVar.f23778e = TypedArrayUtils.getNamedComplexColor(typedArrayObtainAttributes2, xmlPullParser, theme, "strokeColor", 3, 0);
                                bVar.f23781h = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeAlpha", 11, bVar.f23781h);
                                bVar.f23779f = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeWidth", 4, bVar.f23779f);
                                bVar.f23784k = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathEnd", 6, bVar.f23784k);
                                bVar.f23785l = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathOffset", 7, bVar.f23785l);
                                bVar.f23783j = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathStart", 5, bVar.f23783j);
                                bVar.f23802c = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "fillType", 13, bVar.f23802c);
                            } else {
                                b10 = -1;
                                typedArray = typedArrayObtainAttributes2;
                            }
                            typedArray.recycle();
                            cVar.f23789b.add(bVar);
                            if (bVar.getPathName() != null) {
                                arrayMap.put(bVar.getPathName(), bVar);
                            }
                            gVar3.f23819a |= bVar.f23803d;
                            arrayDeque = arrayDeque2;
                            i16 = 0;
                            i10 = 1;
                            z10 = false;
                        } else {
                            ArrayDeque arrayDeque3 = arrayDeque2;
                            fVar2 = fVar2;
                            depth = depth;
                            b10 = -1;
                            if ("clip-path".equals(name)) {
                                a aVar = new a();
                                if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayObtainAttributes3 = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23835d);
                                    i16 = 0;
                                    String string4 = typedArrayObtainAttributes3.getString(0);
                                    if (string4 != null) {
                                        aVar.f23801b = string4;
                                    }
                                    String string5 = typedArrayObtainAttributes3.getString(1);
                                    if (string5 != null) {
                                        aVar.f23800a = PathParser.createNodesFromPathData(string5);
                                    }
                                    aVar.f23802c = TypedArrayUtils.getNamedInt(typedArrayObtainAttributes3, xmlPullParser, "fillType", 2, 0);
                                    typedArrayObtainAttributes3.recycle();
                                } else {
                                    i16 = 0;
                                }
                                cVar.f23789b.add(aVar);
                                if (aVar.getPathName() != null) {
                                    arrayMap.put(aVar.getPathName(), aVar);
                                }
                                gVar3.f23819a = aVar.f23803d | gVar3.f23819a;
                            } else {
                                i16 = 0;
                                if ("group".equals(name)) {
                                    c cVar2 = new c();
                                    TypedArray typedArrayObtainAttributes4 = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23833b);
                                    cVar2.f23790c = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes4, xmlPullParser, Key.ROTATION, 5, cVar2.f23790c);
                                    i10 = 1;
                                    cVar2.f23791d = typedArrayObtainAttributes4.getFloat(1, cVar2.f23791d);
                                    cVar2.f23792e = typedArrayObtainAttributes4.getFloat(2, cVar2.f23792e);
                                    cVar2.f23793f = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes4, xmlPullParser, "scaleX", 3, cVar2.f23793f);
                                    cVar2.f23794g = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes4, xmlPullParser, "scaleY", 4, cVar2.f23794g);
                                    cVar2.f23795h = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes4, xmlPullParser, "translateX", 6, cVar2.f23795h);
                                    cVar2.f23796i = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes4, xmlPullParser, "translateY", 7, cVar2.f23796i);
                                    String string6 = typedArrayObtainAttributes4.getString(0);
                                    if (string6 != null) {
                                        cVar2.f23799l = string6;
                                    }
                                    cVar2.c();
                                    typedArrayObtainAttributes4.recycle();
                                    cVar.f23789b.add(cVar2);
                                    arrayDeque = arrayDeque3;
                                    arrayDeque.push(cVar2);
                                    if (cVar2.getGroupName() != null) {
                                        arrayMap.put(cVar2.getGroupName(), cVar2);
                                    }
                                    gVar3.f23819a = cVar2.f23798k | gVar3.f23819a;
                                }
                                z10 = z11;
                            }
                            arrayDeque = arrayDeque3;
                            i10 = 1;
                            z10 = z11;
                        }
                        z11 = z10;
                        i11 = 3;
                    } else {
                        fVar2 = fVar2;
                        depth = depth;
                        b10 = b11;
                        i10 = 1;
                        arrayDeque = arrayDeque2;
                        i11 = i13;
                        if (eventType == i11 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i13 = i11;
                    arrayDeque2 = arrayDeque;
                    i14 = i10;
                    b11 = b10;
                    depth = depth;
                    fVar2 = fVar2;
                    i15 = 2;
                }
                if (!z11) {
                    this.f23772r0 = a(gVar.f23821c, gVar.f23822d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public static class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f23788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<d> f23789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f23790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f23791d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f23792e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f23793f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f23794g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f23795h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f23796i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Matrix f23797j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f23798k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f23799l;

        public c() {
            this.f23788a = new Matrix();
            this.f23789b = new ArrayList<>();
            this.f23790c = 0.0f;
            this.f23791d = 0.0f;
            this.f23792e = 0.0f;
            this.f23793f = 1.0f;
            this.f23794g = 1.0f;
            this.f23795h = 0.0f;
            this.f23796i = 0.0f;
            this.f23797j = new Matrix();
            this.f23799l = null;
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.d
        public final boolean a() {
            int i10 = 0;
            while (true) {
                ArrayList<d> arrayList = this.f23789b;
                if (i10 >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i10).a()) {
                    return true;
                }
                i10++;
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.d
        public final boolean b(int[] iArr) {
            int i10 = 0;
            boolean zB = false;
            while (true) {
                ArrayList<d> arrayList = this.f23789b;
                if (i10 >= arrayList.size()) {
                    return zB;
                }
                zB |= arrayList.get(i10).b(iArr);
                i10++;
            }
        }

        public final void c() {
            Matrix matrix = this.f23797j;
            matrix.reset();
            matrix.postTranslate(-this.f23791d, -this.f23792e);
            matrix.postScale(this.f23793f, this.f23794g);
            matrix.postRotate(this.f23790c, 0.0f, 0.0f);
            matrix.postTranslate(this.f23795h + this.f23791d, this.f23796i + this.f23792e);
        }

        public String getGroupName() {
            return this.f23799l;
        }

        public Matrix getLocalMatrix() {
            return this.f23797j;
        }

        public float getPivotX() {
            return this.f23791d;
        }

        public float getPivotY() {
            return this.f23792e;
        }

        public float getRotation() {
            return this.f23790c;
        }

        public float getScaleX() {
            return this.f23793f;
        }

        public float getScaleY() {
            return this.f23794g;
        }

        public float getTranslateX() {
            return this.f23795h;
        }

        public float getTranslateY() {
            return this.f23796i;
        }

        public void setPivotX(float f6) {
            if (f6 != this.f23791d) {
                this.f23791d = f6;
                c();
            }
        }

        public void setPivotY(float f6) {
            if (f6 != this.f23792e) {
                this.f23792e = f6;
                c();
            }
        }

        public void setRotation(float f6) {
            if (f6 != this.f23790c) {
                this.f23790c = f6;
                c();
            }
        }

        public void setScaleX(float f6) {
            if (f6 != this.f23793f) {
                this.f23793f = f6;
                c();
            }
        }

        public void setScaleY(float f6) {
            if (f6 != this.f23794g) {
                this.f23794g = f6;
                c();
            }
        }

        public void setTranslateX(float f6) {
            if (f6 != this.f23795h) {
                this.f23795h = f6;
                c();
            }
        }

        public void setTranslateY(float f6) {
            if (f6 != this.f23796i) {
                this.f23796i = f6;
                c();
            }
        }

        public c(c cVar, ArrayMap<String, Object> arrayMap) {
            e aVar;
            this.f23788a = new Matrix();
            this.f23789b = new ArrayList<>();
            this.f23790c = 0.0f;
            this.f23791d = 0.0f;
            this.f23792e = 0.0f;
            this.f23793f = 1.0f;
            this.f23794g = 1.0f;
            this.f23795h = 0.0f;
            this.f23796i = 0.0f;
            Matrix matrix = new Matrix();
            this.f23797j = matrix;
            this.f23799l = null;
            this.f23790c = cVar.f23790c;
            this.f23791d = cVar.f23791d;
            this.f23792e = cVar.f23792e;
            this.f23793f = cVar.f23793f;
            this.f23794g = cVar.f23794g;
            this.f23795h = cVar.f23795h;
            this.f23796i = cVar.f23796i;
            String str = cVar.f23799l;
            this.f23799l = str;
            this.f23798k = cVar.f23798k;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(cVar.f23797j);
            ArrayList<d> arrayList = cVar.f23789b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                d dVar = arrayList.get(i10);
                if (dVar instanceof c) {
                    this.f23789b.add(new c((c) dVar, arrayMap));
                } else {
                    if (dVar instanceof b) {
                        b bVar = (b) dVar;
                        b bVar2 = new b(bVar);
                        bVar2.f23779f = 0.0f;
                        bVar2.f23781h = 1.0f;
                        bVar2.f23782i = 1.0f;
                        bVar2.f23783j = 0.0f;
                        bVar2.f23784k = 1.0f;
                        bVar2.f23785l = 0.0f;
                        bVar2.m = Paint.Cap.BUTT;
                        bVar2.f23786n = Paint.Join.MITER;
                        bVar2.f23787o = 4.0f;
                        bVar2.f23778e = bVar.f23778e;
                        bVar2.f23779f = bVar.f23779f;
                        bVar2.f23781h = bVar.f23781h;
                        bVar2.f23780g = bVar.f23780g;
                        bVar2.f23802c = bVar.f23802c;
                        bVar2.f23782i = bVar.f23782i;
                        bVar2.f23783j = bVar.f23783j;
                        bVar2.f23784k = bVar.f23784k;
                        bVar2.f23785l = bVar.f23785l;
                        bVar2.m = bVar.m;
                        bVar2.f23786n = bVar.f23786n;
                        bVar2.f23787o = bVar.f23787o;
                        aVar = bVar2;
                    } else if (dVar instanceof a) {
                        aVar = new a((a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f23789b.add(aVar);
                    String str2 = aVar.f23801b;
                    if (str2 != null) {
                        arrayMap.put(str2, aVar);
                    }
                }
            }
        }
    }

    public VectorDrawableCompat(@NonNull g gVar) {
        this.f23775u0 = true;
        this.v0 = new float[9];
        this.f23776w0 = new Matrix();
        this.f23777x0 = new Rect();
        this.f23771q0 = gVar;
        this.f23772r0 = a(gVar.f23821c, gVar.f23822d);
    }

    public static class f {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final Matrix f23804p = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Path f23805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f23806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Matrix f23807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Paint f23808d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f23809e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public PathMeasure f23810f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c f23811g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f23812h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f23813i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f23814j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f23815k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f23816l;
        public String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Boolean f23817n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final ArrayMap<String, Object> f23818o;

        public f() {
            this.f23807c = new Matrix();
            this.f23812h = 0.0f;
            this.f23813i = 0.0f;
            this.f23814j = 0.0f;
            this.f23815k = 0.0f;
            this.f23816l = 255;
            this.m = null;
            this.f23817n = null;
            this.f23818o = new ArrayMap<>();
            this.f23811g = new c();
            this.f23805a = new Path();
            this.f23806b = new Path();
        }

        public final void a(c cVar, Matrix matrix, Canvas canvas, int i10, int i11) {
            int i12;
            float f6;
            cVar.f23788a.set(matrix);
            Matrix matrix2 = cVar.f23797j;
            Matrix matrix3 = cVar.f23788a;
            matrix3.preConcat(matrix2);
            canvas.save();
            char c10 = 0;
            int i13 = 0;
            while (true) {
                ArrayList<d> arrayList = cVar.f23789b;
                if (i13 >= arrayList.size()) {
                    canvas.restore();
                    return;
                }
                d dVar = arrayList.get(i13);
                if (dVar instanceof c) {
                    a((c) dVar, matrix3, canvas, i10, i11);
                } else {
                    if (dVar instanceof e) {
                        e eVar = (e) dVar;
                        float f10 = i10 / this.f23814j;
                        float f11 = i11 / this.f23815k;
                        float fMin = Math.min(f10, f11);
                        Matrix matrix4 = this.f23807c;
                        matrix4.set(matrix3);
                        matrix4.postScale(f10, f11);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix3.mapVectors(fArr);
                        float fHypot = (float) Math.hypot(fArr[c10], fArr[1]);
                        i12 = i13;
                        float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                        float f12 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                        float fMax = Math.max(fHypot, fHypot2);
                        float fAbs = fMax > 0.0f ? Math.abs(f12) / fMax : 0.0f;
                        if (fAbs != 0.0f) {
                            eVar.getClass();
                            Path path = this.f23805a;
                            path.reset();
                            PathParser.PathDataNode[] pathDataNodeArr = eVar.f23800a;
                            if (pathDataNodeArr != null) {
                                PathParser.PathDataNode.nodesToPath(pathDataNodeArr, path);
                            }
                            Path path2 = this.f23806b;
                            path2.reset();
                            if (eVar instanceof a) {
                                path2.setFillType(eVar.f23802c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                path2.addPath(path, matrix4);
                                canvas.clipPath(path2);
                            } else {
                                b bVar = (b) eVar;
                                float f13 = bVar.f23783j;
                                if (f13 != 0.0f || bVar.f23784k != 1.0f) {
                                    float f14 = bVar.f23785l;
                                    float f15 = (f13 + f14) % 1.0f;
                                    float f16 = (bVar.f23784k + f14) % 1.0f;
                                    if (this.f23810f == null) {
                                        this.f23810f = new PathMeasure();
                                    }
                                    this.f23810f.setPath(path, false);
                                    float length = this.f23810f.getLength();
                                    float f17 = f15 * length;
                                    float f18 = f16 * length;
                                    path.reset();
                                    if (f17 > f18) {
                                        this.f23810f.getSegment(f17, length, path, true);
                                        f6 = 0.0f;
                                        this.f23810f.getSegment(0.0f, f18, path, true);
                                    } else {
                                        f6 = 0.0f;
                                        this.f23810f.getSegment(f17, f18, path, true);
                                    }
                                    path.rLineTo(f6, f6);
                                }
                                path2.addPath(path, matrix4);
                                if (bVar.f23780g.willDraw()) {
                                    ComplexColorCompat complexColorCompat = bVar.f23780g;
                                    if (this.f23809e == null) {
                                        Paint paint = new Paint(1);
                                        this.f23809e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = this.f23809e;
                                    if (complexColorCompat.isGradient()) {
                                        Shader shader = complexColorCompat.getShader();
                                        shader.setLocalMatrix(matrix4);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(bVar.f23782i * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int color = complexColorCompat.getColor();
                                        float f19 = bVar.f23782i;
                                        PorterDuff.Mode mode = VectorDrawableCompat.f23770y0;
                                        paint2.setColor((color & ViewCompat.MEASURED_SIZE_MASK) | (((int) (Color.alpha(color) * f19)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    path2.setFillType(bVar.f23802c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    canvas.drawPath(path2, paint2);
                                }
                                if (bVar.f23778e.willDraw()) {
                                    ComplexColorCompat complexColorCompat2 = bVar.f23778e;
                                    if (this.f23808d == null) {
                                        Paint paint3 = new Paint(1);
                                        this.f23808d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    }
                                    Paint paint4 = this.f23808d;
                                    Paint.Join join = bVar.f23786n;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = bVar.m;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(bVar.f23787o);
                                    if (complexColorCompat2.isGradient()) {
                                        Shader shader2 = complexColorCompat2.getShader();
                                        shader2.setLocalMatrix(matrix4);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(bVar.f23781h * 255.0f));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(255);
                                        int color2 = complexColorCompat2.getColor();
                                        float f20 = bVar.f23781h;
                                        PorterDuff.Mode mode2 = VectorDrawableCompat.f23770y0;
                                        paint4.setColor((color2 & ViewCompat.MEASURED_SIZE_MASK) | (((int) (Color.alpha(color2) * f20)) << 24));
                                    }
                                    paint4.setColorFilter(null);
                                    paint4.setStrokeWidth(bVar.f23779f * fAbs * fMin);
                                    canvas.drawPath(path2, paint4);
                                }
                            }
                        }
                    }
                    i13 = i12 + 1;
                    c10 = 0;
                }
                i12 = i13;
                i13 = i12 + 1;
                c10 = 0;
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f23816l;
        }

        public void setAlpha(float f6) {
            setRootAlpha((int) (f6 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f23816l = i10;
        }

        public f(f fVar) {
            this.f23807c = new Matrix();
            this.f23812h = 0.0f;
            this.f23813i = 0.0f;
            this.f23814j = 0.0f;
            this.f23815k = 0.0f;
            this.f23816l = 255;
            this.m = null;
            this.f23817n = null;
            ArrayMap<String, Object> arrayMap = new ArrayMap<>();
            this.f23818o = arrayMap;
            this.f23811g = new c(fVar.f23811g, arrayMap);
            this.f23805a = new Path(fVar.f23805a);
            this.f23806b = new Path(fVar.f23806b);
            this.f23812h = fVar.f23812h;
            this.f23813i = fVar.f23813i;
            this.f23814j = fVar.f23814j;
            this.f23815k = fVar.f23815k;
            this.f23816l = fVar.f23816l;
            this.m = fVar.m;
            String str = fVar.m;
            if (str != null) {
                arrayMap.put(str, this);
            }
            this.f23817n = fVar.f23817n;
        }
    }
}
