package com.caverock.androidsvg;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import androidx.camera.camera2.internal.l0;
import androidx.core.view.ViewCompat;
import com.esotericsoftware.asm.Opcodes;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* JADX INFO: compiled from: SVGAndroidRenderer.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static HashSet<String> f39131i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Canvas f39132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f39133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SVG f39134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f39135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Stack<h> f39136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Stack<SVG.i0> f39137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Stack<Matrix> f39138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.caverock.androidsvg.a.q f39139h = null;

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f39141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f39142c;

        static {
            int[] iArr = new int[SVG.Style.LineJoin.values().length];
            f39142c = iArr;
            try {
                iArr[SVG.Style.LineJoin.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39142c[SVG.Style.LineJoin.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39142c[SVG.Style.LineJoin.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SVG.Style.LineCap.values().length];
            f39141b = iArr2;
            try {
                iArr2[SVG.Style.LineCap.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39141b[SVG.Style.LineCap.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39141b[SVG.Style.LineCap.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PreserveAspectRatio.Alignment.values().length];
            f39140a = iArr3;
            try {
                iArr3[PreserveAspectRatio.Alignment.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39140a[PreserveAspectRatio.Alignment.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39140a[PreserveAspectRatio.Alignment.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f39140a[PreserveAspectRatio.Alignment.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f39140a[PreserveAspectRatio.Alignment.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f39140a[PreserveAspectRatio.Alignment.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f39140a[PreserveAspectRatio.Alignment.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f39140a[PreserveAspectRatio.Alignment.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* JADX INFO: renamed from: com.caverock.androidsvg.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class C0182b implements SVG.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f39143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f39144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f39145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f39146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f39147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f39148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f39149g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f39150h;

        public C0182b(b bVar, SVG.w wVar) {
            ArrayList arrayList = new ArrayList();
            this.f39143a = arrayList;
            this.f39146d = null;
            this.f39147e = false;
            this.f39148f = true;
            this.f39149g = -1;
            if (wVar == null) {
                return;
            }
            wVar.c(this);
            if (this.f39150h) {
                this.f39146d.b((c) arrayList.get(this.f39149g));
                arrayList.set(this.f39149g, this.f39146d);
                this.f39150h = false;
            }
            c cVar = this.f39146d;
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void arcTo(float f6, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
            this.f39147e = true;
            this.f39148f = false;
            c cVar = this.f39146d;
            b.a(cVar.f39151a, cVar.f39152b, f6, f10, f11, z10, z11, f12, f13, this);
            this.f39148f = true;
            this.f39150h = false;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void close() {
            this.f39143a.add(this.f39146d);
            lineTo(this.f39144b, this.f39145c);
            this.f39150h = true;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void cubicTo(float f6, float f10, float f11, float f12, float f13, float f14) {
            if (this.f39148f || this.f39147e) {
                this.f39146d.a(f6, f10);
                this.f39143a.add(this.f39146d);
                this.f39147e = false;
            }
            this.f39146d = new c(f13, f14, f13 - f11, f14 - f12);
            this.f39150h = false;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void lineTo(float f6, float f10) {
            this.f39146d.a(f6, f10);
            this.f39143a.add(this.f39146d);
            c cVar = this.f39146d;
            this.f39146d = new c(f6, f10, f6 - cVar.f39151a, f10 - cVar.f39152b);
            this.f39150h = false;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void moveTo(float f6, float f10) {
            boolean z10 = this.f39150h;
            ArrayList arrayList = this.f39143a;
            if (z10) {
                this.f39146d.b((c) arrayList.get(this.f39149g));
                arrayList.set(this.f39149g, this.f39146d);
                this.f39150h = false;
            }
            c cVar = this.f39146d;
            if (cVar != null) {
                arrayList.add(cVar);
            }
            this.f39144b = f6;
            this.f39145c = f10;
            this.f39146d = new c(f6, f10, 0.0f, 0.0f);
            this.f39149g = arrayList.size();
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void quadTo(float f6, float f10, float f11, float f12) {
            this.f39146d.a(f6, f10);
            this.f39143a.add(this.f39146d);
            this.f39146d = new c(f11, f12, f11 - f6, f12 - f10);
            this.f39150h = false;
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f39151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f39152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f39153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f39154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f39155e = false;

        public c(float f6, float f10, float f11, float f12) {
            this.f39153c = 0.0f;
            this.f39154d = 0.0f;
            this.f39151a = f6;
            this.f39152b = f10;
            double dSqrt = Math.sqrt((f12 * f12) + (f11 * f11));
            if (dSqrt != 0.0d) {
                this.f39153c = (float) (((double) f11) / dSqrt);
                this.f39154d = (float) (((double) f12) / dSqrt);
            }
        }

        public final void a(float f6, float f10) {
            float f11 = f6 - this.f39151a;
            float f12 = f10 - this.f39152b;
            double dSqrt = Math.sqrt((f12 * f12) + (f11 * f11));
            if (dSqrt != 0.0d) {
                f11 = (float) (((double) f11) / dSqrt);
                f12 = (float) (((double) f12) / dSqrt);
            }
            float f13 = this.f39153c;
            if (f11 != (-f13) || f12 != (-this.f39154d)) {
                this.f39153c = f13 + f11;
                this.f39154d += f12;
            } else {
                this.f39155e = true;
                this.f39153c = -f12;
                this.f39154d = f11;
            }
        }

        public final void b(c cVar) {
            float f6 = cVar.f39153c;
            float f10 = this.f39153c;
            if (f6 == (-f10)) {
                float f11 = cVar.f39154d;
                if (f11 == (-this.f39154d)) {
                    this.f39155e = true;
                    this.f39153c = -f11;
                    this.f39154d = cVar.f39153c;
                    return;
                }
            }
            this.f39153c = f10 + f6;
            this.f39154d += cVar.f39154d;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(this.f39151a);
            sb2.append(",");
            sb2.append(this.f39152b);
            sb2.append(" ");
            sb2.append(this.f39153c);
            sb2.append(",");
            return l0.a(sb2, this.f39154d, ")");
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class d implements SVG.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Path f39156a = new Path();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f39157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f39158c;

        public d(SVG.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.c(this);
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void arcTo(float f6, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
            b.a(this.f39157b, this.f39158c, f6, f10, f11, z10, z11, f12, f13, this);
            this.f39157b = f12;
            this.f39158c = f13;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void close() {
            this.f39156a.close();
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void cubicTo(float f6, float f10, float f11, float f12, float f13, float f14) {
            this.f39156a.cubicTo(f6, f10, f11, f12, f13, f14);
            this.f39157b = f13;
            this.f39158c = f14;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void lineTo(float f6, float f10) {
            this.f39156a.lineTo(f6, f10);
            this.f39157b = f6;
            this.f39158c = f10;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void moveTo(float f6, float f10) {
            this.f39156a.moveTo(f6, f10);
            this.f39157b = f6;
            this.f39158c = f10;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void quadTo(float f6, float f10, float f11, float f12) {
            this.f39156a.quadTo(f6, f10, f11, f12);
            this.f39157b = f11;
            this.f39158c = f12;
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class e extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Path f39159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f39160e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f6, Path path, b bVar) {
            super(f6, 0.0f);
            this.f39160e = bVar;
            this.f39159d = path;
        }

        @Override // com.caverock.androidsvg.b.f, com.caverock.androidsvg.b.j
        public final void b(String str) {
            b bVar = this.f39160e;
            if (bVar.V()) {
                h hVar = bVar.f39135d;
                if (hVar.f39169b) {
                    bVar.f39132a.drawTextOnPath(str, this.f39159d, this.f39161a, this.f39162b, hVar.f39171d);
                }
                h hVar2 = bVar.f39135d;
                if (hVar2.f39170c) {
                    bVar.f39132a.drawTextOnPath(str, this.f39159d, this.f39161a, this.f39162b, hVar2.f39172e);
                }
            }
            this.f39161a = bVar.f39135d.f39171d.measureText(str) + this.f39161a;
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class f extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f39161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f39162b;

        public f(float f6, float f10) {
            this.f39161a = f6;
            this.f39162b = f10;
        }

        @Override // com.caverock.androidsvg.b.j
        public void b(String str) {
            b bVar = b.this;
            if (bVar.V()) {
                h hVar = bVar.f39135d;
                if (hVar.f39169b) {
                    bVar.f39132a.drawText(str, this.f39161a, this.f39162b, hVar.f39171d);
                }
                h hVar2 = bVar.f39135d;
                if (hVar2.f39170c) {
                    bVar.f39132a.drawText(str, this.f39161a, this.f39162b, hVar2.f39172e);
                }
            }
            this.f39161a = bVar.f39135d.f39171d.measureText(str) + this.f39161a;
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class g extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f39164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f39165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Path f39166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f39167d;

        public g(float f6, float f10, Path path, b bVar) {
            this.f39167d = bVar;
            this.f39164a = f6;
            this.f39165b = f10;
            this.f39166c = path;
        }

        @Override // com.caverock.androidsvg.b.j
        public final boolean a(SVG.x0 x0Var) {
            if (!(x0Var instanceof SVG.y0)) {
                return true;
            }
            Log.w("SVGAndroidRenderer", String.format("Using <textPath> elements in a clip path is not supported.", new Object[0]));
            return false;
        }

        @Override // com.caverock.androidsvg.b.j
        public final void b(String str) {
            b bVar = this.f39167d;
            if (bVar.V()) {
                Path path = new Path();
                bVar.f39135d.f39171d.getTextPath(str, 0, str.length(), this.f39164a, this.f39165b, path);
                this.f39166c.addPath(path);
            }
            this.f39164a = bVar.f39135d.f39171d.measureText(str) + this.f39164a;
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class i extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f39176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f39177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RectF f39178c = new RectF();

        public i(float f6, float f10) {
            this.f39176a = f6;
            this.f39177b = f10;
        }

        @Override // com.caverock.androidsvg.b.j
        public final boolean a(SVG.x0 x0Var) {
            if (!(x0Var instanceof SVG.y0)) {
                return true;
            }
            SVG.y0 y0Var = (SVG.y0) x0Var;
            SVG.k0 k0VarE = x0Var.f39035a.e(y0Var.f39084o);
            if (k0VarE == null) {
                String.format("TextPath path reference '%s' not found", y0Var.f39084o);
                return false;
            }
            SVG.v vVar = (SVG.v) k0VarE;
            Path path = new d(vVar.f39070o).f39156a;
            Matrix matrix = vVar.f39030n;
            if (matrix != null) {
                path.transform(matrix);
            }
            RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            this.f39178c.union(rectF);
            return false;
        }

        @Override // com.caverock.androidsvg.b.j
        public final void b(String str) {
            b bVar = b.this;
            if (bVar.V()) {
                Rect rect = new Rect();
                bVar.f39135d.f39171d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f39176a, this.f39177b);
                this.f39178c.union(rectF);
            }
            this.f39176a = bVar.f39135d.f39171d.measureText(str) + this.f39176a;
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public abstract class j {
        public boolean a(SVG.x0 x0Var) {
            return true;
        }

        public abstract void b(String str);
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class k extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f39180a = 0.0f;

        public k() {
        }

        @Override // com.caverock.androidsvg.b.j
        public final void b(String str) {
            this.f39180a = b.this.f39135d.f39171d.measureText(str) + this.f39180a;
        }
    }

    public b(Canvas canvas, float f6) {
        this.f39132a = canvas;
        this.f39133b = f6;
    }

    public static void N(h hVar, boolean z10, SVG.n0 n0Var) {
        int i10;
        SVG.Style style = hVar.f39168a;
        float fFloatValue = (z10 ? style.f38960s0 : style.f38962u0).floatValue();
        if (n0Var instanceof SVG.f) {
            i10 = ((SVG.f) n0Var).f39004p0;
        } else if (!(n0Var instanceof SVG.g)) {
            return;
        } else {
            i10 = hVar.f39168a.H0.f39004p0;
        }
        int i11 = i(fFloatValue, i10);
        if (z10) {
            hVar.f39171d.setColor(i11);
        } else {
            hVar.f39172e.setColor(i11);
        }
    }

    public static void a(float f6, float f10, float f11, float f12, float f13, boolean z10, boolean z11, float f14, float f15, SVG.x xVar) {
        if (f6 == f14 && f10 == f15) {
            return;
        }
        if (f11 == 0.0f || f12 == 0.0f) {
            xVar.lineTo(f14, f15);
            return;
        }
        float fAbs = Math.abs(f11);
        float fAbs2 = Math.abs(f12);
        double radians = Math.toRadians(((double) f13) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d2 = ((double) (f6 - f14)) / 2.0d;
        double d3 = ((double) (f10 - f15)) / 2.0d;
        double d7 = (dSin * d3) + (dCos * d2);
        double d10 = (d3 * dCos) + ((-dSin) * d2);
        double d11 = fAbs * fAbs;
        double d12 = fAbs2 * fAbs2;
        double d13 = d7 * d7;
        double d14 = d10 * d10;
        double d15 = (d14 / d12) + (d13 / d11);
        if (d15 > 0.99999d) {
            double dSqrt = Math.sqrt(d15) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d11 = fAbs * fAbs;
            d12 = fAbs2 * fAbs2;
        }
        double d16 = z10 == z11 ? -1.0d : 1.0d;
        double d17 = d11 * d12;
        double d18 = d11 * d14;
        double d19 = d12 * d13;
        double d20 = ((d17 - d18) - d19) / (d18 + d19);
        if (d20 < 0.0d) {
            d20 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d20) * d16;
        double d21 = fAbs;
        double d22 = fAbs2;
        double d23 = ((d21 * d10) / d22) * dSqrt2;
        float f16 = fAbs;
        float f17 = fAbs2;
        double d24 = dSqrt2 * (-((d22 * d7) / d21));
        double d25 = ((dCos * d23) - (dSin * d24)) + (((double) (f6 + f14)) / 2.0d);
        double d26 = (dCos * d24) + (dSin * d23) + (((double) (f10 + f15)) / 2.0d);
        double d27 = (d7 - d23) / d21;
        double d28 = (d10 - d24) / d22;
        double d29 = ((-d7) - d23) / d21;
        double d30 = ((-d10) - d24) / d22;
        double d31 = (d28 * d28) + (d27 * d27);
        double dAcos = Math.acos(d27 / Math.sqrt(d31)) * (d28 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = Math.sqrt(((d30 * d30) + (d29 * d29)) * d31);
        double d32 = (d28 * d30) + (d27 * d29);
        double d33 = d32 / dSqrt3;
        double dAcos2 = ((d27 * d30) - (d28 * d29) < 0.0d ? -1.0d : 1.0d) * (d33 < -1.0d ? 3.141592653589793d : d33 > 1.0d ? 0.0d : Math.acos(d33));
        if (!z11 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z11 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d34 = dAcos2 % 6.283185307179586d;
        double d35 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d34) * 2.0d) / 3.141592653589793d);
        double d36 = d34 / ((double) iCeil);
        double d37 = d36 / 2.0d;
        double dSin2 = (Math.sin(d37) * 1.3333333333333333d) / (Math.cos(d37) + 1.0d);
        int i10 = iCeil * 6;
        float[] fArr = new float[i10];
        int i11 = 0;
        int i12 = 0;
        while (i11 < iCeil) {
            double d38 = (((double) i11) * d36) + d35;
            double dCos2 = Math.cos(d38);
            double dSin3 = Math.sin(d38);
            fArr[i12] = (float) (dCos2 - (dSin2 * dSin3));
            int i13 = iCeil;
            fArr[i12 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d39 = d38 + d36;
            double dCos3 = Math.cos(d39);
            double dSin4 = Math.sin(d39);
            fArr[i12 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i12 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            int i14 = i12 + 5;
            fArr[i12 + 4] = (float) dCos3;
            i12 += 6;
            fArr[i14] = (float) dSin4;
            i11++;
            d26 = d26;
            i10 = i10;
            d35 = d35;
            iCeil = i13;
            d36 = d36;
        }
        int i15 = i10;
        Matrix matrix = new Matrix();
        matrix.postScale(f16, f17);
        matrix.postRotate(f13);
        matrix.postTranslate((float) d25, (float) d26);
        matrix.mapPoints(fArr);
        fArr[i15 - 2] = f14;
        fArr[i15 - 1] = f15;
        for (int i16 = 0; i16 < i15; i16 += 6) {
            xVar.cubicTo(fArr[i16], fArr[i16 + 1], fArr[i16 + 2], fArr[i16 + 3], fArr[i16 + 4], fArr[i16 + 5]);
        }
    }

    public static SVG.b c(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r11 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Matrix e(com.caverock.androidsvg.SVG.b r9, com.caverock.androidsvg.SVG.b r10, com.caverock.androidsvg.PreserveAspectRatio r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L9d
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = r11.getAlignment()
            if (r1 != 0) goto Lf
            goto L9d
        Lf:
            float r1 = r9.f38969c
            float r2 = r10.f38969c
            float r1 = r1 / r2
            float r2 = r9.f38970d
            float r3 = r10.f38970d
            float r2 = r2 / r3
            float r3 = r10.f38967a
            float r3 = -r3
            float r4 = r10.f38968b
            float r4 = -r4
            com.caverock.androidsvg.PreserveAspectRatio r5 = com.caverock.androidsvg.PreserveAspectRatio.STRETCH
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L35
            float r10 = r9.f38967a
            float r9 = r9.f38968b
            r0.preTranslate(r10, r9)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            com.caverock.androidsvg.PreserveAspectRatio$Scale r5 = r11.getScale()
            com.caverock.androidsvg.PreserveAspectRatio$Scale r6 = com.caverock.androidsvg.PreserveAspectRatio.Scale.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r9.f38969c
            float r2 = r2 / r1
            float r5 = r9.f38970d
            float r5 = r5 / r1
            int[] r6 = com.caverock.androidsvg.b.a.f39140a
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r7 = r11.getAlignment()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            float r7 = r10.f38969c
            float r7 = r7 - r2
        L61:
            float r3 = r3 - r7
            goto L68
        L63:
            float r7 = r10.f38969c
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L61
        L68:
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r11 = r11.getAlignment()
            int r11 = r11.ordinal()
            r11 = r6[r11]
            r2 = 2
            if (r11 == r2) goto L8b
            r2 = 3
            if (r11 == r2) goto L86
            r2 = 5
            if (r11 == r2) goto L8b
            r2 = 6
            if (r11 == r2) goto L86
            r2 = 7
            if (r11 == r2) goto L8b
            r2 = 8
            if (r11 == r2) goto L86
            goto L90
        L86:
            float r10 = r10.f38970d
            float r10 = r10 - r5
        L89:
            float r4 = r4 - r10
            goto L90
        L8b:
            float r10 = r10.f38970d
            float r10 = r10 - r5
            float r10 = r10 / r8
            goto L89
        L90:
            float r10 = r9.f38967a
            float r9 = r9.f38968b
            r0.preTranslate(r10, r9)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.b.e(com.caverock.androidsvg.SVG$b, com.caverock.androidsvg.SVG$b, com.caverock.androidsvg.PreserveAspectRatio):android.graphics.Matrix");
    }

    public static Typeface h(String str, Integer num, SVG.Style.FontStyle fontStyle) {
        int i10;
        boolean z10 = fontStyle == SVG.Style.FontStyle.Italic;
        if (num.intValue() > 500) {
            i10 = z10 ? 3 : 1;
        } else {
            i10 = z10 ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i10);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "serif":
                return Typeface.create(Typeface.SERIF, i10);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            default:
                return null;
        }
    }

    public static int i(float f6, int i10) {
        int i11 = 255;
        int iRound = Math.round(((i10 >> 24) & 255) * f6);
        if (iRound < 0) {
            i11 = 0;
        } else if (iRound <= 255) {
            i11 = iRound;
        }
        return (i11 << 24) | (i10 & ViewCompat.MEASURED_SIZE_MASK);
    }

    public static void p(SVG.j jVar, String str) {
        SVG.k0 k0VarE = jVar.f39035a.e(str);
        if (k0VarE == null) {
            Log.w("SVGAndroidRenderer", String.format("Gradient reference '%s' not found", str));
            return;
        }
        if (!(k0VarE instanceof SVG.j)) {
            String.format("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (k0VarE == jVar) {
            String.format("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        SVG.j jVar2 = (SVG.j) k0VarE;
        if (jVar.f39020i == null) {
            jVar.f39020i = jVar2.f39020i;
        }
        if (jVar.f39021j == null) {
            jVar.f39021j = jVar2.f39021j;
        }
        if (jVar.f39022k == null) {
            jVar.f39022k = jVar2.f39022k;
        }
        if (jVar.f39019h.isEmpty()) {
            jVar.f39019h = jVar2.f39019h;
        }
        try {
            if (jVar instanceof SVG.l0) {
                SVG.l0 l0Var = (SVG.l0) jVar;
                SVG.l0 l0Var2 = (SVG.l0) k0VarE;
                if (l0Var.m == null) {
                    l0Var.m = l0Var2.m;
                }
                if (l0Var.f39031n == null) {
                    l0Var.f39031n = l0Var2.f39031n;
                }
                if (l0Var.f39032o == null) {
                    l0Var.f39032o = l0Var2.f39032o;
                }
                if (l0Var.f39033p == null) {
                    l0Var.f39033p = l0Var2.f39033p;
                }
            } else {
                q((SVG.p0) jVar, (SVG.p0) k0VarE);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = jVar2.f39023l;
        if (str2 != null) {
            p(jVar, str2);
        }
    }

    public static void q(SVG.p0 p0Var, SVG.p0 p0Var2) {
        if (p0Var.m == null) {
            p0Var.m = p0Var2.m;
        }
        if (p0Var.f39046n == null) {
            p0Var.f39046n = p0Var2.f39046n;
        }
        if (p0Var.f39047o == null) {
            p0Var.f39047o = p0Var2.f39047o;
        }
        if (p0Var.f39048p == null) {
            p0Var.f39048p = p0Var2.f39048p;
        }
        if (p0Var.f39049q == null) {
            p0Var.f39049q = p0Var2.f39049q;
        }
    }

    public static void r(SVG.y yVar, String str) {
        SVG.k0 k0VarE = yVar.f39035a.e(str);
        if (k0VarE == null) {
            Log.w("SVGAndroidRenderer", String.format("Pattern reference '%s' not found", str));
            return;
        }
        if (!(k0VarE instanceof SVG.y)) {
            String.format("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (k0VarE == yVar) {
            String.format("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        SVG.y yVar2 = (SVG.y) k0VarE;
        if (yVar.f39076q == null) {
            yVar.f39076q = yVar2.f39076q;
        }
        if (yVar.f39077r == null) {
            yVar.f39077r = yVar2.f39077r;
        }
        if (yVar.f39078s == null) {
            yVar.f39078s = yVar2.f39078s;
        }
        if (yVar.f39079t == null) {
            yVar.f39079t = yVar2.f39079t;
        }
        if (yVar.f39080u == null) {
            yVar.f39080u = yVar2.f39080u;
        }
        if (yVar.f39081v == null) {
            yVar.f39081v = yVar2.f39081v;
        }
        if (yVar.f39082w == null) {
            yVar.f39082w = yVar2.f39082w;
        }
        if (yVar.f39006i.isEmpty()) {
            yVar.f39006i = yVar2.f39006i;
        }
        if (yVar.f39054p == null) {
            yVar.f39054p = yVar2.f39054p;
        }
        if (yVar.f39043o == null) {
            yVar.f39043o = yVar2.f39043o;
        }
        String str2 = yVar2.f39083x;
        if (str2 != null) {
            r(yVar, str2);
        }
    }

    public static boolean w(SVG.Style style, long j10) {
        return (style.f38957p0 & j10) != 0;
    }

    public static Path z(SVG.z zVar) {
        Path path = new Path();
        float[] fArr = zVar.f39087o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = zVar.f39087o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (zVar instanceof SVG.a0) {
            path.close();
        }
        if (zVar.f39024h == null) {
            zVar.f39024h = c(path);
        }
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    public final Path A(SVG.b0 b0Var) {
        float fD;
        float fE;
        float fMin;
        SVG.p pVar;
        float fD2;
        SVG.p pVar2;
        float fE2;
        float fD3;
        float fE3;
        float f6;
        float f10;
        Path path;
        Path path2;
        SVG.p pVar3 = b0Var.f38975s;
        if (pVar3 == null && b0Var.f38976t == null) {
            fD = 0.0f;
        } else {
            if (pVar3 != null) {
                if (b0Var.f38976t == null) {
                    fD = pVar3.d(this);
                } else {
                    fD = pVar3.d(this);
                    fE = b0Var.f38976t.e(this);
                }
                fMin = Math.min(fD, b0Var.f38973q.d(this) / 2.0f);
                float fMin2 = Math.min(fE, b0Var.f38974r.e(this) / 2.0f);
                pVar = b0Var.f38971o;
                if (pVar != null) {
                    fD2 = pVar.d(this);
                } else {
                    fD2 = 0.0f;
                }
                pVar2 = b0Var.f38972p;
                if (pVar2 != null) {
                    fE2 = pVar2.e(this);
                } else {
                    fE2 = 0.0f;
                }
                fD3 = b0Var.f38973q.d(this);
                fE3 = b0Var.f38974r.e(this);
                if (b0Var.f39024h == null) {
                    b0Var.f39024h = new SVG.b(fD2, fE2, fD3, fE3);
                }
                f6 = fD2 + fD3;
                f10 = fE2 + fE3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path2 = path;
                    path2.moveTo(fD2, fE2);
                    path2.lineTo(f6, fE2);
                    path2.lineTo(f6, f10);
                    path2.lineTo(fD2, f10);
                    path2.lineTo(fD2, fE2);
                } else {
                    float f11 = fMin * 0.5522848f;
                    float f12 = 0.5522848f * fMin2;
                    float f13 = fE2 + fMin2;
                    path.moveTo(fD2, f13);
                    float f14 = f13 - f12;
                    float f15 = fD2 + fMin;
                    float f16 = f15 - f11;
                    path.cubicTo(fD2, f14, f16, fE2, f15, fE2);
                    float f17 = f6 - fMin;
                    path.lineTo(f17, fE2);
                    float f18 = f17 + f11;
                    path.cubicTo(f18, fE2, f6, f14, f6, f13);
                    float f19 = f10 - fMin2;
                    path.lineTo(f6, f19);
                    float f20 = f19 + f12;
                    path2 = path;
                    path.cubicTo(f6, f20, f18, f10, f17, f10);
                    path2.lineTo(f15, f10);
                    path2.cubicTo(f16, f10, fD2, f20, fD2, f19);
                    path2.lineTo(fD2, f13);
                }
                path2.close();
                return path2;
            }
            fD = b0Var.f38976t.e(this);
        }
        fE = fD;
        fMin = Math.min(fD, b0Var.f38973q.d(this) / 2.0f);
        float fMin3 = Math.min(fE, b0Var.f38974r.e(this) / 2.0f);
        pVar = b0Var.f38971o;
        if (pVar != null) {
            fD2 = pVar.d(this);
        } else {
            fD2 = 0.0f;
        }
        pVar2 = b0Var.f38972p;
        if (pVar2 != null) {
            fE2 = pVar2.e(this);
        } else {
            fE2 = 0.0f;
        }
        fD3 = b0Var.f38973q.d(this);
        fE3 = b0Var.f38974r.e(this);
        if (b0Var.f39024h == null) {
            b0Var.f39024h = new SVG.b(fD2, fE2, fD3, fE3);
        }
        f6 = fD2 + fD3;
        f10 = fE2 + fE3;
        path = new Path();
        if (fMin != 0.0f) {
            path2 = path;
            path2.moveTo(fD2, fE2);
            path2.lineTo(f6, fE2);
            path2.lineTo(f6, f10);
            path2.lineTo(fD2, f10);
            path2.lineTo(fD2, fE2);
        } else {
            path2 = path;
            path2.moveTo(fD2, fE2);
            path2.lineTo(f6, fE2);
            path2.lineTo(f6, f10);
            path2.lineTo(fD2, f10);
            path2.lineTo(fD2, fE2);
        }
        path2.close();
        return path2;
    }

    public final SVG.b B(SVG.p pVar, SVG.p pVar2, SVG.p pVar3, SVG.p pVar4) {
        float fD = pVar != null ? pVar.d(this) : 0.0f;
        float fE = pVar2 != null ? pVar2.e(this) : 0.0f;
        h hVar = this.f39135d;
        SVG.b bVar = hVar.f39174g;
        if (bVar == null) {
            bVar = hVar.f39173f;
        }
        return new SVG.b(fD, fE, pVar3 != null ? pVar3.d(this) : bVar.f38969c, pVar4 != null ? pVar4.e(this) : bVar.f38970d);
    }

    @TargetApi(19)
    public final Path C(SVG.j0 j0Var, boolean z10) {
        Path pathZ;
        Path pathB;
        this.f39136e.push(this.f39135d);
        h hVar = new h(this.f39135d);
        this.f39135d = hVar;
        T(hVar, j0Var);
        if (!k() || !V()) {
            this.f39135d = this.f39136e.pop();
            return null;
        }
        if (j0Var instanceof SVG.d1) {
            if (!z10) {
                String.format("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            SVG.d1 d1Var = (SVG.d1) j0Var;
            SVG.k0 k0VarE = j0Var.f39035a.e(d1Var.f38991p);
            if (k0VarE == null) {
                String.format("Use reference '%s' not found", d1Var.f38991p);
                this.f39135d = this.f39136e.pop();
                return null;
            }
            if (!(k0VarE instanceof SVG.j0)) {
                this.f39135d = this.f39136e.pop();
                return null;
            }
            pathZ = C((SVG.j0) k0VarE, false);
            if (pathZ == null) {
                return null;
            }
            if (d1Var.f39024h == null) {
                d1Var.f39024h = c(pathZ);
            }
            Matrix matrix = d1Var.f39034o;
            if (matrix != null) {
                pathZ.transform(matrix);
            }
        } else if (j0Var instanceof SVG.l) {
            SVG.l lVar = (SVG.l) j0Var;
            if (j0Var instanceof SVG.v) {
                pathZ = new d(((SVG.v) j0Var).f39070o).f39156a;
                if (j0Var.f39024h == null) {
                    j0Var.f39024h = c(pathZ);
                }
            } else if (j0Var instanceof SVG.b0) {
                pathZ = A((SVG.b0) j0Var);
            } else if (j0Var instanceof SVG.d) {
                pathZ = x((SVG.d) j0Var);
            } else if (j0Var instanceof SVG.i) {
                pathZ = y((SVG.i) j0Var);
            } else {
                pathZ = j0Var instanceof SVG.z ? z((SVG.z) j0Var) : null;
            }
            if (pathZ == null) {
                return null;
            }
            if (lVar.f39024h == null) {
                lVar.f39024h = c(pathZ);
            }
            Matrix matrix2 = lVar.f39030n;
            if (matrix2 != null) {
                pathZ.transform(matrix2);
            }
            pathZ.setFillType(v());
        } else {
            if (!(j0Var instanceof SVG.v0)) {
                String.format("Invalid %s element found in clipPath definition", j0Var.f());
                return null;
            }
            SVG.v0 v0Var = (SVG.v0) j0Var;
            ArrayList arrayList = v0Var.f39088o;
            float fE = 0.0f;
            float fD = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((SVG.p) v0Var.f39088o.get(0)).d(this);
            ArrayList arrayList2 = v0Var.f39089p;
            float fE2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((SVG.p) v0Var.f39089p.get(0)).e(this);
            ArrayList arrayList3 = v0Var.f39090q;
            float fD2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((SVG.p) v0Var.f39090q.get(0)).d(this);
            ArrayList arrayList4 = v0Var.f39091r;
            if (arrayList4 != null && arrayList4.size() != 0) {
                fE = ((SVG.p) v0Var.f39091r.get(0)).e(this);
            }
            if (this.f39135d.f39168a.O0 != SVG.Style.TextAnchor.Start) {
                float fD3 = d(v0Var);
                if (this.f39135d.f39168a.O0 == SVG.Style.TextAnchor.Middle) {
                    fD3 /= 2.0f;
                }
                fD -= fD3;
            }
            if (v0Var.f39024h == null) {
                i iVar = new i(fD, fE2);
                n(v0Var, iVar);
                RectF rectF = iVar.f39178c;
                v0Var.f39024h = new SVG.b(rectF.left, rectF.top, rectF.width(), rectF.height());
            }
            Path path = new Path();
            n(v0Var, new g(fD + fD2, fE2 + fE, path, this));
            Matrix matrix3 = v0Var.f39071s;
            if (matrix3 != null) {
                path.transform(matrix3);
            }
            path.setFillType(v());
            pathZ = path;
        }
        if (this.f39135d.f39168a.Y0 != null && (pathB = b(j0Var, j0Var.f39024h)) != null) {
            pathZ.op(pathB, Path.Op.INTERSECT);
        }
        this.f39135d = this.f39136e.pop();
        return pathZ;
    }

    public final void D(SVG.b bVar) {
        if (this.f39135d.f39168a.f38950a1 != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            Canvas canvas = this.f39132a;
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            SVG.s sVar = (SVG.s) this.f39134c.e(this.f39135d.f39168a.f38950a1);
            L(sVar, bVar);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            L(sVar, bVar);
            canvas.restore();
            canvas.restore();
        }
        O();
    }

    public final boolean E() {
        SVG.k0 k0VarE;
        if (this.f39135d.f39168a.G0.floatValue() >= 1.0f && this.f39135d.f39168a.f38950a1 == null) {
            return false;
        }
        int iFloatValue = (int) (this.f39135d.f39168a.G0.floatValue() * 256.0f);
        if (iFloatValue < 0) {
            iFloatValue = 0;
        } else if (iFloatValue > 255) {
            iFloatValue = 255;
        }
        this.f39132a.saveLayerAlpha(null, iFloatValue, 31);
        this.f39136e.push(this.f39135d);
        h hVar = new h(this.f39135d);
        this.f39135d = hVar;
        String str = hVar.f39168a.f38950a1;
        if (str != null && ((k0VarE = this.f39134c.e(str)) == null || !(k0VarE instanceof SVG.s))) {
            String.format("Mask reference '%s' not found", this.f39135d.f39168a.f38950a1);
            this.f39135d.f39168a.f38950a1 = null;
        }
        return true;
    }

    public final void F(SVG.e0 e0Var, SVG.b bVar, SVG.b bVar2, PreserveAspectRatio preserveAspectRatio) {
        if (bVar.f38969c == 0.0f || bVar.f38970d == 0.0f) {
            return;
        }
        if (preserveAspectRatio == null && (preserveAspectRatio = e0Var.f39043o) == null) {
            preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
        }
        T(this.f39135d, e0Var);
        if (k()) {
            h hVar = this.f39135d;
            hVar.f39173f = bVar;
            if (!hVar.f39168a.P0.booleanValue()) {
                SVG.b bVar3 = this.f39135d.f39173f;
                M(bVar3.f38967a, bVar3.f38968b, bVar3.f38969c, bVar3.f38970d);
            }
            f(e0Var, this.f39135d.f39173f);
            Canvas canvas = this.f39132a;
            if (bVar2 != null) {
                canvas.concat(e(this.f39135d.f39173f, bVar2, preserveAspectRatio));
                this.f39135d.f39174g = e0Var.f39054p;
            } else {
                SVG.b bVar4 = this.f39135d.f39173f;
                canvas.translate(bVar4.f38967a, bVar4.f38968b);
            }
            boolean zE = E();
            U();
            H(e0Var, true);
            if (zE) {
                D(e0Var.f39024h);
            }
            R(e0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:200:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:201:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:209:0x03de  */
    /* JADX WARN: Code duplicated, block: B:212:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:213:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:216:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:217:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:220:0x0414  */
    /* JADX WARN: Code duplicated, block: B:224:0x0453  */
    /* JADX WARN: Code duplicated, block: B:227:0x045f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void G(SVG.m0 m0Var) {
        SVG.p pVar;
        String str;
        SVG.b bVar;
        Matrix matrix;
        Canvas canvas;
        SVG.p pVar2;
        float fD;
        SVG.p pVar3;
        float fE;
        h hVar;
        boolean zE;
        int iIndexOf;
        Set<String> systemLanguage;
        SVG.p pVar4;
        Boolean bool;
        if (m0Var instanceof SVG.t) {
            return;
        }
        P();
        if ((m0Var instanceof SVG.k0) && (bool = ((SVG.k0) m0Var).f39026d) != null) {
            this.f39135d.f39175h = bool.booleanValue();
        }
        if (m0Var instanceof SVG.e0) {
            SVG.e0 e0Var = (SVG.e0) m0Var;
            F(e0Var, B(e0Var.f38997q, e0Var.f38998r, e0Var.f38999s, e0Var.f39000t), e0Var.f39054p, e0Var.f39043o);
        } else {
            Bitmap bitmapResolveImage = null;
            float fE2 = 0.0f;
            if (m0Var instanceof SVG.d1) {
                SVG.d1 d1Var = (SVG.d1) m0Var;
                SVG.p pVar5 = d1Var.f38994s;
                if ((pVar5 == null || !pVar5.g()) && ((pVar4 = d1Var.f38995t) == null || !pVar4.g())) {
                    T(this.f39135d, d1Var);
                    if (k()) {
                        SVG.m0 m0VarE = d1Var.f39035a.e(d1Var.f38991p);
                        if (m0VarE == null) {
                            String.format("Use reference '%s' not found", d1Var.f38991p);
                        } else {
                            Matrix matrix2 = d1Var.f39034o;
                            Canvas canvas2 = this.f39132a;
                            if (matrix2 != null) {
                                canvas2.concat(matrix2);
                            }
                            SVG.p pVar6 = d1Var.f38992q;
                            float fD2 = pVar6 != null ? pVar6.d(this) : 0.0f;
                            SVG.p pVar7 = d1Var.f38993r;
                            canvas2.translate(fD2, pVar7 != null ? pVar7.e(this) : 0.0f);
                            f(d1Var, d1Var.f39024h);
                            boolean zE2 = E();
                            this.f39137f.push(d1Var);
                            this.f39138g.push(this.f39132a.getMatrix());
                            if (m0VarE instanceof SVG.e0) {
                                SVG.e0 e0Var2 = (SVG.e0) m0VarE;
                                SVG.b bVarB = B(null, null, d1Var.f38994s, d1Var.f38995t);
                                P();
                                F(e0Var2, bVarB, e0Var2.f39054p, e0Var2.f39043o);
                                O();
                            } else if (m0VarE instanceof SVG.s0) {
                                SVG.p pVar8 = d1Var.f38994s;
                                if (pVar8 == null) {
                                    pVar8 = new SVG.p(100.0f, SVG.c1.percent);
                                }
                                SVG.p pVar9 = d1Var.f38995t;
                                if (pVar9 == null) {
                                    pVar9 = new SVG.p(100.0f, SVG.c1.percent);
                                }
                                SVG.b bVarB2 = B(null, null, pVar8, pVar9);
                                P();
                                SVG.s0 s0Var = (SVG.s0) m0VarE;
                                if (bVarB2.f38969c != 0.0f && bVarB2.f38970d != 0.0f) {
                                    PreserveAspectRatio preserveAspectRatio = s0Var.f39043o;
                                    if (preserveAspectRatio == null) {
                                        preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
                                    }
                                    T(this.f39135d, s0Var);
                                    h hVar2 = this.f39135d;
                                    hVar2.f39173f = bVarB2;
                                    if (!hVar2.f39168a.P0.booleanValue()) {
                                        SVG.b bVar2 = this.f39135d.f39173f;
                                        M(bVar2.f38967a, bVar2.f38968b, bVar2.f38969c, bVar2.f38970d);
                                    }
                                    SVG.b bVar3 = s0Var.f39054p;
                                    if (bVar3 != null) {
                                        canvas2.concat(e(this.f39135d.f39173f, bVar3, preserveAspectRatio));
                                        this.f39135d.f39174g = s0Var.f39054p;
                                    } else {
                                        SVG.b bVar4 = this.f39135d.f39173f;
                                        canvas2.translate(bVar4.f38967a, bVar4.f38968b);
                                    }
                                    boolean zE3 = E();
                                    H(s0Var, true);
                                    if (zE3) {
                                        D(s0Var.f39024h);
                                    }
                                    R(s0Var);
                                }
                                O();
                            } else {
                                G(m0VarE);
                            }
                            this.f39137f.pop();
                            this.f39138g.pop();
                            if (zE2) {
                                D(d1Var.f39024h);
                            }
                            R(d1Var);
                        }
                    }
                }
            } else if (m0Var instanceof SVG.r0) {
                SVG.r0 r0Var = (SVG.r0) m0Var;
                T(this.f39135d, r0Var);
                if (k()) {
                    Matrix matrix3 = r0Var.f39034o;
                    if (matrix3 != null) {
                        this.f39132a.concat(matrix3);
                    }
                    f(r0Var, r0Var.f39024h);
                    boolean zE4 = E();
                    String language = Locale.getDefault().getLanguage();
                    SVGExternalFileResolver sVGExternalFileResolver = SVG.f38942g;
                    loop0: for (SVG.m0 m0Var2 : r0Var.f39006i) {
                        if (m0Var2 instanceof SVG.f0) {
                            SVG.f0 f0Var = (SVG.f0) m0Var2;
                            if (f0Var.getRequiredExtensions() == null && ((systemLanguage = f0Var.getSystemLanguage()) == null || (!systemLanguage.isEmpty() && systemLanguage.contains(language)))) {
                                Set<String> requiredFeatures = f0Var.getRequiredFeatures();
                                if (requiredFeatures != null) {
                                    if (f39131i == null) {
                                        synchronized (b.class) {
                                            HashSet<String> hashSet = new HashSet<>();
                                            f39131i = hashSet;
                                            hashSet.add("Structure");
                                            f39131i.add("BasicStructure");
                                            f39131i.add("ConditionalProcessing");
                                            f39131i.add("Image");
                                            f39131i.add("Style");
                                            f39131i.add("ViewportAttribute");
                                            f39131i.add("Shape");
                                            f39131i.add("BasicText");
                                            f39131i.add("PaintAttribute");
                                            f39131i.add("BasicPaintAttribute");
                                            f39131i.add("OpacityAttribute");
                                            f39131i.add("BasicGraphicsAttribute");
                                            f39131i.add("Marker");
                                            f39131i.add("Gradient");
                                            f39131i.add("Pattern");
                                            f39131i.add("Clip");
                                            f39131i.add("BasicClip");
                                            f39131i.add("Mask");
                                            f39131i.add("View");
                                        }
                                    }
                                    if (requiredFeatures.isEmpty() || !f39131i.containsAll(requiredFeatures)) {
                                    }
                                }
                                Set<String> requiredFormats = f0Var.getRequiredFormats();
                                if (requiredFormats != null) {
                                    if (!requiredFormats.isEmpty() && sVGExternalFileResolver != null) {
                                        Iterator<String> it = requiredFormats.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (!sVGExternalFileResolver.isFormatSupported(it.next())) {
                                                }
                                            }
                                        }
                                    }
                                }
                                Set<String> requiredFonts = f0Var.getRequiredFonts();
                                if (requiredFonts != null) {
                                    if (!requiredFonts.isEmpty() && sVGExternalFileResolver != null) {
                                        Iterator<String> it2 = requiredFonts.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                if (sVGExternalFileResolver.resolveFont(it2.next(), this.f39135d.f39168a.K0.intValue(), String.valueOf(this.f39135d.f39168a.L0)) == null) {
                                                }
                                            }
                                        }
                                    }
                                }
                                G(m0Var2);
                                break;
                            }
                        }
                    }
                    if (zE4) {
                        D(r0Var.f39024h);
                    }
                    R(r0Var);
                }
            } else if (m0Var instanceof SVG.m) {
                SVG.m mVar = (SVG.m) m0Var;
                T(this.f39135d, mVar);
                if (k()) {
                    Matrix matrix4 = mVar.f39034o;
                    if (matrix4 != null) {
                        this.f39132a.concat(matrix4);
                    }
                    f(mVar, mVar.f39024h);
                    boolean zE5 = E();
                    H(mVar, true);
                    if (zE5) {
                        D(mVar.f39024h);
                    }
                    R(mVar);
                }
            } else if (m0Var instanceof SVG.o) {
                SVG.o oVar = (SVG.o) m0Var;
                SVG.p pVar10 = oVar.f39040s;
                if (pVar10 != null && !pVar10.g() && (pVar = oVar.f39041t) != null && !pVar.g() && (str = oVar.f39037p) != null) {
                    PreserveAspectRatio preserveAspectRatio2 = oVar.f39043o;
                    if (preserveAspectRatio2 == null) {
                        preserveAspectRatio2 = PreserveAspectRatio.LETTERBOX;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        try {
                            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                            bitmapResolveImage = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        } catch (Exception unused) {
                        }
                    }
                    if (bitmapResolveImage == null) {
                        SVGExternalFileResolver sVGExternalFileResolver2 = SVG.f38942g;
                        if (sVGExternalFileResolver2 != null) {
                            bitmapResolveImage = sVGExternalFileResolver2.resolveImage(oVar.f39037p);
                            if (bitmapResolveImage == null) {
                                String.format("Could not locate image '%s'", oVar.f39037p);
                            } else {
                                bVar = new SVG.b(0.0f, 0.0f, bitmapResolveImage.getWidth(), bitmapResolveImage.getHeight());
                                T(this.f39135d, oVar);
                                if (k()) {
                                    matrix = oVar.f39042u;
                                    canvas = this.f39132a;
                                    if (matrix != null) {
                                        canvas.concat(matrix);
                                    }
                                    pVar2 = oVar.f39038q;
                                    if (pVar2 != null) {
                                        fD = pVar2.d(this);
                                    } else {
                                        fD = 0.0f;
                                    }
                                    pVar3 = oVar.f39039r;
                                    if (pVar3 != null) {
                                        fE = pVar3.e(this);
                                    } else {
                                        fE = 0.0f;
                                    }
                                    float fD3 = oVar.f39040s.d(this);
                                    float fD4 = oVar.f39041t.d(this);
                                    hVar = this.f39135d;
                                    hVar.f39173f = new SVG.b(fD, fE, fD3, fD4);
                                    if (!hVar.f39168a.P0.booleanValue()) {
                                        SVG.b bVar5 = this.f39135d.f39173f;
                                        M(bVar5.f38967a, bVar5.f38968b, bVar5.f38969c, bVar5.f38970d);
                                    }
                                    oVar.f39024h = this.f39135d.f39173f;
                                    R(oVar);
                                    f(oVar, oVar.f39024h);
                                    zE = E();
                                    U();
                                    canvas.save();
                                    canvas.concat(e(this.f39135d.f39173f, bVar, preserveAspectRatio2));
                                    canvas.drawBitmap(bitmapResolveImage, 0.0f, 0.0f, new Paint(this.f39135d.f39168a.f38956g1 != SVG.Style.RenderQuality.optimizeSpeed ? 2 : 0));
                                    canvas.restore();
                                    if (zE) {
                                        D(oVar.f39024h);
                                    }
                                }
                            }
                        }
                    } else if (bitmapResolveImage == null) {
                        String.format("Could not locate image '%s'", oVar.f39037p);
                    } else {
                        bVar = new SVG.b(0.0f, 0.0f, bitmapResolveImage.getWidth(), bitmapResolveImage.getHeight());
                        T(this.f39135d, oVar);
                        if (k() && V()) {
                            matrix = oVar.f39042u;
                            canvas = this.f39132a;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            pVar2 = oVar.f39038q;
                            if (pVar2 != null) {
                                fD = pVar2.d(this);
                            } else {
                                fD = 0.0f;
                            }
                            pVar3 = oVar.f39039r;
                            if (pVar3 != null) {
                                fE = pVar3.e(this);
                            } else {
                                fE = 0.0f;
                            }
                            float fD5 = oVar.f39040s.d(this);
                            float fD6 = oVar.f39041t.d(this);
                            hVar = this.f39135d;
                            hVar.f39173f = new SVG.b(fD, fE, fD5, fD6);
                            if (!hVar.f39168a.P0.booleanValue()) {
                                SVG.b bVar6 = this.f39135d.f39173f;
                                M(bVar6.f38967a, bVar6.f38968b, bVar6.f38969c, bVar6.f38970d);
                            }
                            oVar.f39024h = this.f39135d.f39173f;
                            R(oVar);
                            f(oVar, oVar.f39024h);
                            zE = E();
                            U();
                            canvas.save();
                            canvas.concat(e(this.f39135d.f39173f, bVar, preserveAspectRatio2));
                            canvas.drawBitmap(bitmapResolveImage, 0.0f, 0.0f, new Paint(this.f39135d.f39168a.f38956g1 != SVG.Style.RenderQuality.optimizeSpeed ? 2 : 0));
                            canvas.restore();
                            if (zE) {
                                D(oVar.f39024h);
                            }
                        }
                    }
                }
            } else if (m0Var instanceof SVG.v) {
                SVG.v vVar = (SVG.v) m0Var;
                if (vVar.f39070o != null) {
                    T(this.f39135d, vVar);
                    if (k() && V()) {
                        h hVar3 = this.f39135d;
                        if (hVar3.f39170c || hVar3.f39169b) {
                            Matrix matrix5 = vVar.f39030n;
                            if (matrix5 != null) {
                                this.f39132a.concat(matrix5);
                            }
                            Path path = new d(vVar.f39070o).f39156a;
                            if (vVar.f39024h == null) {
                                vVar.f39024h = c(path);
                            }
                            R(vVar);
                            g(vVar);
                            f(vVar, vVar.f39024h);
                            boolean zE6 = E();
                            h hVar4 = this.f39135d;
                            if (hVar4.f39169b) {
                                SVG.Style.FillRule fillRule = hVar4.f39168a.f38959r0;
                                path.setFillType((fillRule == null || fillRule != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                l(vVar, path);
                            }
                            if (this.f39135d.f39170c) {
                                m(path);
                            }
                            K(vVar);
                            if (zE6) {
                                D(vVar.f39024h);
                            }
                        }
                    }
                }
            } else if (m0Var instanceof SVG.b0) {
                SVG.b0 b0Var = (SVG.b0) m0Var;
                SVG.p pVar11 = b0Var.f38973q;
                if (pVar11 != null && b0Var.f38974r != null && !pVar11.g() && !b0Var.f38974r.g()) {
                    T(this.f39135d, b0Var);
                    if (k() && V()) {
                        Matrix matrix6 = b0Var.f39030n;
                        if (matrix6 != null) {
                            this.f39132a.concat(matrix6);
                        }
                        Path pathA = A(b0Var);
                        R(b0Var);
                        g(b0Var);
                        f(b0Var, b0Var.f39024h);
                        boolean zE7 = E();
                        if (this.f39135d.f39169b) {
                            l(b0Var, pathA);
                        }
                        if (this.f39135d.f39170c) {
                            m(pathA);
                        }
                        if (zE7) {
                            D(b0Var.f39024h);
                        }
                    }
                }
            } else if (m0Var instanceof SVG.d) {
                SVG.d dVar = (SVG.d) m0Var;
                SVG.p pVar12 = dVar.f38989q;
                if (pVar12 != null && !pVar12.g()) {
                    T(this.f39135d, dVar);
                    if (k() && V()) {
                        Matrix matrix7 = dVar.f39030n;
                        if (matrix7 != null) {
                            this.f39132a.concat(matrix7);
                        }
                        Path pathX = x(dVar);
                        R(dVar);
                        g(dVar);
                        f(dVar, dVar.f39024h);
                        boolean zE8 = E();
                        if (this.f39135d.f39169b) {
                            l(dVar, pathX);
                        }
                        if (this.f39135d.f39170c) {
                            m(pathX);
                        }
                        if (zE8) {
                            D(dVar.f39024h);
                        }
                    }
                }
            } else if (m0Var instanceof SVG.i) {
                SVG.i iVar = (SVG.i) m0Var;
                SVG.p pVar13 = iVar.f39017q;
                if (pVar13 != null && iVar.f39018r != null && !pVar13.g() && !iVar.f39018r.g()) {
                    T(this.f39135d, iVar);
                    if (k() && V()) {
                        Matrix matrix8 = iVar.f39030n;
                        if (matrix8 != null) {
                            this.f39132a.concat(matrix8);
                        }
                        Path pathY = y(iVar);
                        R(iVar);
                        g(iVar);
                        f(iVar, iVar.f39024h);
                        boolean zE9 = E();
                        if (this.f39135d.f39169b) {
                            l(iVar, pathY);
                        }
                        if (this.f39135d.f39170c) {
                            m(pathY);
                        }
                        if (zE9) {
                            D(iVar.f39024h);
                        }
                    }
                }
            } else if (m0Var instanceof SVG.q) {
                SVG.q qVar = (SVG.q) m0Var;
                T(this.f39135d, qVar);
                if (k() && V() && this.f39135d.f39170c) {
                    Matrix matrix9 = qVar.f39030n;
                    if (matrix9 != null) {
                        this.f39132a.concat(matrix9);
                    }
                    SVG.p pVar14 = qVar.f39050o;
                    float fD7 = pVar14 == null ? 0.0f : pVar14.d(this);
                    SVG.p pVar15 = qVar.f39051p;
                    float fE3 = pVar15 == null ? 0.0f : pVar15.e(this);
                    SVG.p pVar16 = qVar.f39052q;
                    float fD8 = pVar16 == null ? 0.0f : pVar16.d(this);
                    SVG.p pVar17 = qVar.f39053r;
                    fE2 = pVar17 != null ? pVar17.e(this) : 0.0f;
                    if (qVar.f39024h == null) {
                        qVar.f39024h = new SVG.b(Math.min(fD7, fD8), Math.min(fE3, fE2), Math.abs(fD8 - fD7), Math.abs(fE2 - fE3));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fD7, fE3);
                    path2.lineTo(fD8, fE2);
                    R(qVar);
                    g(qVar);
                    f(qVar, qVar.f39024h);
                    boolean zE10 = E();
                    m(path2);
                    K(qVar);
                    if (zE10) {
                        D(qVar.f39024h);
                    }
                }
            } else if (m0Var instanceof SVG.a0) {
                SVG.a0 a0Var = (SVG.a0) m0Var;
                T(this.f39135d, a0Var);
                if (k() && V()) {
                    h hVar5 = this.f39135d;
                    if (hVar5.f39170c || hVar5.f39169b) {
                        Matrix matrix10 = a0Var.f39030n;
                        if (matrix10 != null) {
                            this.f39132a.concat(matrix10);
                        }
                        if (a0Var.f39087o.length >= 2) {
                            Path pathZ = z(a0Var);
                            R(a0Var);
                            g(a0Var);
                            f(a0Var, a0Var.f39024h);
                            boolean zE11 = E();
                            if (this.f39135d.f39169b) {
                                l(a0Var, pathZ);
                            }
                            if (this.f39135d.f39170c) {
                                m(pathZ);
                            }
                            K(a0Var);
                            if (zE11) {
                                D(a0Var.f39024h);
                            }
                        }
                    }
                }
            } else if (m0Var instanceof SVG.z) {
                SVG.z zVar = (SVG.z) m0Var;
                T(this.f39135d, zVar);
                if (k() && V()) {
                    h hVar6 = this.f39135d;
                    if (hVar6.f39170c || hVar6.f39169b) {
                        Matrix matrix11 = zVar.f39030n;
                        if (matrix11 != null) {
                            this.f39132a.concat(matrix11);
                        }
                        if (zVar.f39087o.length >= 2) {
                            Path pathZ2 = z(zVar);
                            R(zVar);
                            SVG.Style.FillRule fillRule2 = this.f39135d.f39168a.f38959r0;
                            pathZ2.setFillType((fillRule2 == null || fillRule2 != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            g(zVar);
                            f(zVar, zVar.f39024h);
                            boolean zE12 = E();
                            if (this.f39135d.f39169b) {
                                l(zVar, pathZ2);
                            }
                            if (this.f39135d.f39170c) {
                                m(pathZ2);
                            }
                            K(zVar);
                            if (zE12) {
                                D(zVar.f39024h);
                            }
                        }
                    }
                }
            } else if (m0Var instanceof SVG.v0) {
                SVG.v0 v0Var = (SVG.v0) m0Var;
                T(this.f39135d, v0Var);
                if (k()) {
                    Matrix matrix12 = v0Var.f39071s;
                    if (matrix12 != null) {
                        this.f39132a.concat(matrix12);
                    }
                    ArrayList arrayList = v0Var.f39088o;
                    float fD9 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((SVG.p) v0Var.f39088o.get(0)).d(this);
                    ArrayList arrayList2 = v0Var.f39089p;
                    float fE4 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((SVG.p) v0Var.f39089p.get(0)).e(this);
                    ArrayList arrayList3 = v0Var.f39090q;
                    float fD10 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((SVG.p) v0Var.f39090q.get(0)).d(this);
                    ArrayList arrayList4 = v0Var.f39091r;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        fE2 = ((SVG.p) v0Var.f39091r.get(0)).e(this);
                    }
                    SVG.Style.TextAnchor textAnchorU = u();
                    if (textAnchorU != SVG.Style.TextAnchor.Start) {
                        float fD11 = d(v0Var);
                        if (textAnchorU == SVG.Style.TextAnchor.Middle) {
                            fD11 /= 2.0f;
                        }
                        fD9 -= fD11;
                    }
                    if (v0Var.f39024h == null) {
                        i iVar2 = new i(fD9, fE4);
                        n(v0Var, iVar2);
                        RectF rectF = iVar2.f39178c;
                        v0Var.f39024h = new SVG.b(rectF.left, rectF.top, rectF.width(), rectF.height());
                    }
                    R(v0Var);
                    g(v0Var);
                    f(v0Var, v0Var.f39024h);
                    boolean zE13 = E();
                    n(v0Var, new f(fD9 + fD10, fE4 + fE2));
                    if (zE13) {
                        D(v0Var.f39024h);
                    }
                }
            }
        }
        O();
    }

    public final void H(SVG.i0 i0Var, boolean z10) {
        if (z10) {
            this.f39137f.push(i0Var);
            this.f39138g.push(this.f39132a.getMatrix());
        }
        Iterator<SVG.m0> it = i0Var.getChildren().iterator();
        while (it.hasNext()) {
            G(it.next());
        }
        if (z10) {
            this.f39137f.pop();
            this.f39138g.pop();
        }
    }

    public final void I(SVG svg, RenderOptions renderOptions) {
        SVG.b bVar;
        PreserveAspectRatio preserveAspectRatio;
        this.f39134c = svg;
        SVG.e0 e0Var = svg.f38944a;
        if (e0Var == null) {
            Log.w("SVGAndroidRenderer", String.format("Nothing to render. Document is empty.", new Object[0]));
            return;
        }
        if (renderOptions.hasView()) {
            SVG.k0 k0VarC = this.f39134c.c(renderOptions.f38940e);
            if (k0VarC == null || !(k0VarC instanceof SVG.e1)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", renderOptions.f38940e));
                return;
            }
            SVG.e1 e1Var = (SVG.e1) k0VarC;
            bVar = e1Var.f39054p;
            if (bVar == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", renderOptions.f38940e));
                return;
            }
            preserveAspectRatio = e1Var.f39043o;
        } else {
            bVar = renderOptions.hasViewBox() ? renderOptions.f38939d : e0Var.f39054p;
            preserveAspectRatio = renderOptions.hasPreserveAspectRatio() ? renderOptions.f38937b : e0Var.f39043o;
        }
        if (renderOptions.hasCss()) {
            svg.f38948e.b(renderOptions.f38936a);
        }
        if (renderOptions.hasTarget()) {
            com.caverock.androidsvg.a.q qVar = new com.caverock.androidsvg.a.q();
            this.f39139h = qVar;
            qVar.f39123a = svg.c(renderOptions.f38938c);
        }
        this.f39135d = new h();
        this.f39136e = new Stack<>();
        S(this.f39135d, SVG.Style.a());
        h hVar = this.f39135d;
        hVar.f39173f = null;
        hVar.f39175h = false;
        this.f39136e.push(new h(hVar));
        this.f39138g = new Stack<>();
        this.f39137f = new Stack<>();
        Boolean bool = e0Var.f39026d;
        if (bool != null) {
            this.f39135d.f39175h = bool.booleanValue();
        }
        P();
        SVG.b bVar2 = new SVG.b(renderOptions.f38941f);
        SVG.p pVar = e0Var.f38999s;
        if (pVar != null) {
            bVar2.f38969c = pVar.c(this, bVar2.f38969c);
        }
        SVG.p pVar2 = e0Var.f39000t;
        if (pVar2 != null) {
            bVar2.f38970d = pVar2.c(this, bVar2.f38970d);
        }
        F(e0Var, bVar2, bVar, preserveAspectRatio);
        O();
        if (renderOptions.hasCss()) {
            com.caverock.androidsvg.a.u uVar = com.caverock.androidsvg.a.u.RenderOptions;
            ArrayList arrayList = svg.f38948e.f39124a;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((com.caverock.androidsvg.a.p) it.next()).f39122c == uVar) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r8 != 8) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(com.caverock.androidsvg.SVG.r r13, com.caverock.androidsvg.b.c r14) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.b.J(com.caverock.androidsvg.SVG$r, com.caverock.androidsvg.b$c):void");
    }

    public final void K(SVG.l lVar) {
        SVG.r rVar;
        SVG.r rVar2;
        SVG.r rVar3;
        float f6;
        float f10;
        ArrayList arrayList;
        int size;
        SVG.Style style = this.f39135d.f39168a;
        String str = style.R0;
        if (str == null && style.S0 == null && style.T0 == null) {
            return;
        }
        if (str == null) {
            rVar = null;
        } else {
            SVG.k0 k0VarE = lVar.f39035a.e(str);
            if (k0VarE != null) {
                rVar = (SVG.r) k0VarE;
            } else {
                String.format("Marker reference '%s' not found", this.f39135d.f39168a.R0);
                rVar = null;
            }
        }
        String str2 = this.f39135d.f39168a.S0;
        if (str2 == null) {
            rVar2 = null;
        } else {
            SVG.k0 k0VarE2 = lVar.f39035a.e(str2);
            if (k0VarE2 != null) {
                rVar2 = (SVG.r) k0VarE2;
            } else {
                String.format("Marker reference '%s' not found", this.f39135d.f39168a.S0);
                rVar2 = null;
            }
        }
        String str3 = this.f39135d.f39168a.T0;
        if (str3 == null) {
            rVar3 = null;
        } else {
            SVG.k0 k0VarE3 = lVar.f39035a.e(str3);
            if (k0VarE3 != null) {
                rVar3 = (SVG.r) k0VarE3;
            } else {
                String.format("Marker reference '%s' not found", this.f39135d.f39168a.T0);
                rVar3 = null;
            }
        }
        if (lVar instanceof SVG.v) {
            arrayList = new C0182b(this, ((SVG.v) lVar).f39070o).f39143a;
        } else if (lVar instanceof SVG.q) {
            SVG.q qVar = (SVG.q) lVar;
            SVG.p pVar = qVar.f39050o;
            float fD = pVar != null ? pVar.d(this) : 0.0f;
            SVG.p pVar2 = qVar.f39051p;
            float fE = pVar2 != null ? pVar2.e(this) : 0.0f;
            SVG.p pVar3 = qVar.f39052q;
            float fD2 = pVar3 != null ? pVar3.d(this) : 0.0f;
            SVG.p pVar4 = qVar.f39053r;
            float fE2 = pVar4 != null ? pVar4.e(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f11 = fD2 - fD;
            float f12 = fE2 - fE;
            arrayList2.add(new c(fD, fE, f11, f12));
            arrayList2.add(new c(fD2, fE2, f11, f12));
            arrayList = arrayList2;
        } else {
            SVG.z zVar = (SVG.z) lVar;
            int length = zVar.f39087o.length;
            if (length < 2) {
                arrayList = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = zVar.f39087o;
                c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
                int i10 = 2;
                float f13 = 0.0f;
                float f14 = 0.0f;
                while (true) {
                    f6 = cVar.f39152b;
                    f10 = cVar.f39151a;
                    if (i10 >= length) {
                        break;
                    }
                    float[] fArr2 = zVar.f39087o;
                    float f15 = fArr2[i10];
                    float f16 = fArr2[i10 + 1];
                    cVar.a(f15, f16);
                    arrayList3.add(cVar);
                    cVar = new c(f15, f16, f15 - f10, f16 - f6);
                    i10 += 2;
                    f14 = f16;
                    f13 = f15;
                }
                if (zVar instanceof SVG.a0) {
                    float[] fArr3 = zVar.f39087o;
                    float f17 = fArr3[0];
                    if (f13 != f17) {
                        float f18 = fArr3[1];
                        if (f14 != f18) {
                            cVar.a(f17, f18);
                            arrayList3.add(cVar);
                            c cVar2 = new c(f17, f18, f17 - f10, f18 - f6);
                            cVar2.b((c) arrayList3.get(0));
                            arrayList3.add(cVar2);
                            arrayList3.set(0, cVar2);
                        }
                    }
                } else {
                    arrayList3.add(cVar);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        SVG.Style style2 = this.f39135d.f39168a;
        style2.T0 = null;
        style2.S0 = null;
        style2.R0 = null;
        if (rVar != null) {
            J(rVar, (c) arrayList.get(0));
        }
        if (rVar2 != null && arrayList.size() > 2) {
            int i11 = 1;
            c cVar3 = (c) arrayList.get(0);
            c cVar4 = (c) arrayList.get(1);
            while (i11 < size - 1) {
                i11++;
                c cVar5 = (c) arrayList.get(i11);
                if (cVar4.f39155e) {
                    float f19 = cVar4.f39153c;
                    float f20 = cVar4.f39154d;
                    float f21 = cVar3.f39151a;
                    float f22 = cVar4.f39151a;
                    float f23 = cVar4.f39152b;
                    float f24 = ((f23 - cVar3.f39152b) * f20) + ((f22 - f21) * f19);
                    if (f24 == 0.0f) {
                        f24 = ((cVar5.f39151a - f22) * f19) + ((cVar5.f39152b - f23) * f20);
                    }
                    if (f24 <= 0.0f && (f24 != 0.0f || (f19 <= 0.0f && f20 < 0.0f))) {
                        cVar4.f39153c = -f19;
                        cVar4.f39154d = -f20;
                    }
                }
                J(rVar2, cVar4);
                cVar3 = cVar4;
                cVar4 = cVar5;
            }
        }
        if (rVar3 != null) {
            J(rVar3, (c) arrayList.get(size - 1));
        }
    }

    public final void L(SVG.s sVar, SVG.b bVar) {
        float fD;
        float fE;
        Boolean bool = sVar.f39061o;
        if (bool == null || !bool.booleanValue()) {
            SVG.p pVar = sVar.f39063q;
            float fC = pVar != null ? pVar.c(this, 1.0f) : 1.2f;
            SVG.p pVar2 = sVar.f39064r;
            float fC2 = pVar2 != null ? pVar2.c(this, 1.0f) : 1.2f;
            fD = fC * bVar.f38969c;
            fE = fC2 * bVar.f38970d;
        } else {
            SVG.p pVar3 = sVar.f39063q;
            fD = pVar3 != null ? pVar3.d(this) : bVar.f38969c;
            SVG.p pVar4 = sVar.f39064r;
            fE = pVar4 != null ? pVar4.e(this) : bVar.f38970d;
        }
        if (fD == 0.0f || fE == 0.0f) {
            return;
        }
        P();
        h hVarS = s(sVar);
        this.f39135d = hVarS;
        hVarS.f39168a.G0 = Float.valueOf(1.0f);
        boolean zE = E();
        Canvas canvas = this.f39132a;
        canvas.save();
        Boolean bool2 = sVar.f39062p;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(bVar.f38967a, bVar.f38968b);
            canvas.scale(bVar.f38969c, bVar.f38970d);
        }
        H(sVar, false);
        canvas.restore();
        if (zE) {
            D(bVar);
        }
        O();
    }

    public final void M(float f6, float f10, float f11, float f12) {
        float fD = f11 + f6;
        float fE = f12 + f10;
        SVG.c cVar = this.f39135d.f39168a.Q0;
        if (cVar != null) {
            f6 += cVar.f38981d.d(this);
            f10 += this.f39135d.f39168a.Q0.f38978a.e(this);
            fD -= this.f39135d.f39168a.Q0.f38979b.d(this);
            fE -= this.f39135d.f39168a.Q0.f38980c.e(this);
        }
        this.f39132a.clipRect(f6, f10, fD, fE);
    }

    public final void O() {
        this.f39132a.restore();
        this.f39135d = this.f39136e.pop();
    }

    public final void P() {
        this.f39132a.save();
        this.f39136e.push(this.f39135d);
        this.f39135d = new h(this.f39135d);
    }

    public final String Q(String str, boolean z10, boolean z11) {
        if (this.f39135d.f39175h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z10) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z11) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    public final void R(SVG.j0 j0Var) {
        if (j0Var.f39036b == null || j0Var.f39024h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.f39138g.peek().invert(matrix)) {
            SVG.b bVar = j0Var.f39024h;
            SVG.b bVar2 = j0Var.f39024h;
            SVG.b bVar3 = j0Var.f39024h;
            float[] fArr = {bVar.f38967a, bVar.f38968b, bVar.a(), bVar2.f38968b, bVar2.a(), j0Var.f39024h.b(), bVar3.f38967a, bVar3.b()};
            matrix.preConcat(this.f39132a.getMatrix());
            matrix.mapPoints(fArr);
            float f6 = fArr[0];
            float f10 = fArr[1];
            RectF rectF = new RectF(f6, f10, f6, f10);
            for (int i10 = 2; i10 <= 6; i10 += 2) {
                float f11 = fArr[i10];
                if (f11 < rectF.left) {
                    rectF.left = f11;
                }
                if (f11 > rectF.right) {
                    rectF.right = f11;
                }
                float f12 = fArr[i10 + 1];
                if (f12 < rectF.top) {
                    rectF.top = f12;
                }
                if (f12 > rectF.bottom) {
                    rectF.bottom = f12;
                }
            }
            SVG.j0 j0Var2 = (SVG.j0) this.f39137f.peek();
            SVG.b bVar4 = j0Var2.f39024h;
            if (bVar4 == null) {
                float f13 = rectF.left;
                float f14 = rectF.top;
                j0Var2.f39024h = new SVG.b(f13, f14, rectF.right - f13, rectF.bottom - f14);
                return;
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            float f17 = rectF.right - f15;
            float f18 = rectF.bottom - f16;
            if (f15 < bVar4.f38967a) {
                bVar4.f38967a = f15;
            }
            if (f16 < bVar4.f38968b) {
                bVar4.f38968b = f16;
            }
            if (f15 + f17 > bVar4.a()) {
                bVar4.f38969c = (f15 + f17) - bVar4.f38967a;
            }
            if (f16 + f18 > bVar4.b()) {
                bVar4.f38970d = (f16 + f18) - bVar4.f38968b;
            }
        }
    }

    public final void S(h hVar, SVG.Style style) {
        SVG.Style style2;
        if (w(style, SvgConstantsKt.SPECIFIED_COLOR)) {
            hVar.f39168a.H0 = style.H0;
        }
        if (w(style, SvgConstantsKt.SPECIFIED_OPACITY)) {
            hVar.f39168a.G0 = style.G0;
        }
        boolean zW = w(style, 1L);
        SVG.f fVar = SVG.f.f39003r0;
        if (zW) {
            hVar.f39168a.f38958q0 = style.f38958q0;
            SVG.n0 n0Var = style.f38958q0;
            hVar.f39169b = (n0Var == null || n0Var == fVar) ? false : true;
        }
        if (w(style, 4L)) {
            hVar.f39168a.f38960s0 = style.f38960s0;
        }
        if (w(style, 6149L)) {
            N(hVar, true, hVar.f39168a.f38958q0);
        }
        if (w(style, 2L)) {
            hVar.f39168a.f38959r0 = style.f38959r0;
        }
        if (w(style, 8L)) {
            hVar.f39168a.f38961t0 = style.f38961t0;
            SVG.n0 n0Var2 = style.f38961t0;
            hVar.f39170c = (n0Var2 == null || n0Var2 == fVar) ? false : true;
        }
        if (w(style, 16L)) {
            hVar.f39168a.f38962u0 = style.f38962u0;
        }
        if (w(style, 6168L)) {
            N(hVar, false, hVar.f39168a.f38961t0);
        }
        if (w(style, SvgConstantsKt.SPECIFIED_VECTOR_EFFECT)) {
            hVar.f39168a.f38955f1 = style.f38955f1;
        }
        if (w(style, 32L)) {
            SVG.Style style3 = hVar.f39168a;
            SVG.p pVar = style.v0;
            style3.v0 = pVar;
            hVar.f39172e.setStrokeWidth(pVar.b(this));
        }
        if (w(style, 64L)) {
            hVar.f39168a.f38963w0 = style.f38963w0;
            int i10 = a.f39141b[style.f38963w0.ordinal()];
            Paint paint = hVar.f39172e;
            if (i10 == 1) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (w(style, 128L)) {
            hVar.f39168a.f38964x0 = style.f38964x0;
            int i11 = a.f39142c[style.f38964x0.ordinal()];
            Paint paint2 = hVar.f39172e;
            if (i11 == 1) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (w(style, 256L)) {
            hVar.f39168a.f38965y0 = style.f38965y0;
            hVar.f39172e.setStrokeMiter(style.f38965y0.floatValue());
        }
        if (w(style, 512L)) {
            hVar.f39168a.E0 = style.E0;
        }
        if (w(style, 1024L)) {
            hVar.f39168a.F0 = style.F0;
        }
        Typeface typefaceH = null;
        if (w(style, 1536L)) {
            SVG.p[] pVarArr = hVar.f39168a.E0;
            Paint paint3 = hVar.f39172e;
            if (pVarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = pVarArr.length;
                int i12 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i12];
                int i13 = 0;
                float f6 = 0.0f;
                while (true) {
                    style2 = hVar.f39168a;
                    if (i13 >= i12) {
                        break;
                    }
                    float fB = style2.E0[i13 % length].b(this);
                    fArr[i13] = fB;
                    f6 += fB;
                    i13++;
                }
                if (f6 == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fB2 = style2.F0.b(this);
                    if (fB2 < 0.0f) {
                        fB2 = (fB2 % f6) + f6;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fB2));
                }
            }
        }
        if (w(style, 16384L)) {
            float textSize = this.f39135d.f39171d.getTextSize();
            hVar.f39168a.J0 = style.J0;
            hVar.f39171d.setTextSize(style.J0.c(this, textSize));
            hVar.f39172e.setTextSize(style.J0.c(this, textSize));
        }
        if (w(style, SvgConstantsKt.SPECIFIED_FONT_FAMILY)) {
            hVar.f39168a.I0 = style.I0;
        }
        if (w(style, SvgConstantsKt.SPECIFIED_FONT_WEIGHT)) {
            if (style.K0.intValue() == -1 && hVar.f39168a.K0.intValue() > 100) {
                SVG.Style style4 = hVar.f39168a;
                style4.K0 = Integer.valueOf(style4.K0.intValue() - 100);
            } else if (style.K0.intValue() != 1 || hVar.f39168a.K0.intValue() >= 900) {
                hVar.f39168a.K0 = style.K0;
            } else {
                SVG.Style style5 = hVar.f39168a;
                style5.K0 = Integer.valueOf(style5.K0.intValue() + 100);
            }
        }
        if (w(style, SvgConstantsKt.SPECIFIED_FONT_STYLE)) {
            hVar.f39168a.L0 = style.L0;
        }
        if (w(style, 106496L)) {
            SVG.Style style6 = hVar.f39168a;
            List<String> list = style6.I0;
            if (list != null && this.f39134c != null) {
                SVGExternalFileResolver sVGExternalFileResolver = SVG.f38942g;
                for (String str : list) {
                    Typeface typefaceH2 = h(str, style6.K0, style6.L0);
                    typefaceH = (typefaceH2 != null || sVGExternalFileResolver == null) ? typefaceH2 : sVGExternalFileResolver.resolveFont(str, style6.K0.intValue(), String.valueOf(style6.L0));
                    if (typefaceH != null) {
                        break;
                    }
                }
            }
            if (typefaceH == null) {
                typefaceH = h("serif", style6.K0, style6.L0);
            }
            hVar.f39171d.setTypeface(typefaceH);
            hVar.f39172e.setTypeface(typefaceH);
        }
        if (w(style, SvgConstantsKt.SPECIFIED_TEXT_DECORATION)) {
            hVar.f39168a.M0 = style.M0;
            Paint paint4 = hVar.f39171d;
            SVG.Style.TextDecoration textDecoration = style.M0;
            SVG.Style.TextDecoration textDecoration2 = SVG.Style.TextDecoration.LineThrough;
            paint4.setStrikeThruText(textDecoration == textDecoration2);
            SVG.Style.TextDecoration textDecoration3 = style.M0;
            SVG.Style.TextDecoration textDecoration4 = SVG.Style.TextDecoration.Underline;
            paint4.setUnderlineText(textDecoration3 == textDecoration4);
            Paint paint5 = hVar.f39172e;
            paint5.setStrikeThruText(style.M0 == textDecoration2);
            paint5.setUnderlineText(style.M0 == textDecoration4);
        }
        if (w(style, SvgConstantsKt.SPECIFIED_DIRECTION)) {
            hVar.f39168a.N0 = style.N0;
        }
        if (w(style, SvgConstantsKt.SPECIFIED_TEXT_ANCHOR)) {
            hVar.f39168a.O0 = style.O0;
        }
        if (w(style, SvgConstantsKt.SPECIFIED_OVERFLOW)) {
            hVar.f39168a.P0 = style.P0;
        }
        if (w(style, SvgConstantsKt.SPECIFIED_MARKER_START)) {
            hVar.f39168a.R0 = style.R0;
        }
        if (w(style, SvgConstantsKt.SPECIFIED_MARKER_MID)) {
            hVar.f39168a.S0 = style.S0;
        }
        if (w(style, SvgConstantsKt.SPECIFIED_MARKER_END)) {
            hVar.f39168a.T0 = style.T0;
        }
        if (w(style, SvgConstantsKt.SPECIFIED_DISPLAY)) {
            hVar.f39168a.U0 = style.U0;
        }
        if (w(style, SvgConstantsKt.SPECIFIED_VISIBILITY)) {
            hVar.f39168a.V0 = style.V0;
        }
        if (w(style, 1048576L)) {
            hVar.f39168a.Q0 = style.Q0;
        }
        if (w(style, SvgConstantsKt.SPECIFIED_CLIP_PATH)) {
            hVar.f39168a.Y0 = style.Y0;
        }
        if (w(style, SvgConstantsKt.SPECIFIED_CLIP_RULE)) {
            hVar.f39168a.Z0 = style.Z0;
        }
        if (w(style, SvgConstantsKt.SPECIFIED_MASK)) {
            hVar.f39168a.f38950a1 = style.f38950a1;
        }
        if (w(style, SvgConstantsKt.SPECIFIED_STOP_COLOR)) {
            hVar.f39168a.W0 = style.W0;
        }
        if (w(style, SvgConstantsKt.SPECIFIED_STOP_OPACITY)) {
            hVar.f39168a.X0 = style.X0;
        }
        if (w(style, SvgConstantsKt.SPECIFIED_VIEWPORT_FILL)) {
            hVar.f39168a.f38953d1 = style.f38953d1;
        }
        if (w(style, SvgConstantsKt.SPECIFIED_VIEWPORT_FILL_OPACITY)) {
            hVar.f39168a.f38954e1 = style.f38954e1;
        }
        if (w(style, SvgConstantsKt.SPECIFIED_IMAGE_RENDERING)) {
            hVar.f39168a.f38956g1 = style.f38956g1;
        }
    }

    public final void T(h hVar, SVG.k0 k0Var) {
        boolean z10 = k0Var.f39036b == null;
        SVG.Style style = hVar.f39168a;
        Boolean bool = Boolean.TRUE;
        style.U0 = bool;
        if (!z10) {
            bool = Boolean.FALSE;
        }
        style.P0 = bool;
        style.Q0 = null;
        style.Y0 = null;
        style.G0 = Float.valueOf(1.0f);
        style.W0 = SVG.f.f39002q0;
        style.X0 = Float.valueOf(1.0f);
        style.f38950a1 = null;
        style.f38951b1 = null;
        style.f38952c1 = Float.valueOf(1.0f);
        style.f38953d1 = null;
        style.f38954e1 = Float.valueOf(1.0f);
        style.f38955f1 = SVG.Style.VectorEffect.None;
        SVG.Style style2 = k0Var.f39027e;
        if (style2 != null) {
            S(hVar, style2);
        }
        ArrayList arrayList = this.f39134c.f38948e.f39124a;
        if (!(arrayList == null || arrayList.isEmpty())) {
            for (com.caverock.androidsvg.a.p pVar : this.f39134c.f38948e.f39124a) {
                if (com.caverock.androidsvg.a.i(this.f39139h, pVar.f39120a, k0Var)) {
                    S(hVar, pVar.f39121b);
                }
            }
        }
        SVG.Style style3 = k0Var.f39028f;
        if (style3 != null) {
            S(hVar, style3);
        }
    }

    public final void U() {
        int i10;
        SVG.Style style = this.f39135d.f39168a;
        SVG.n0 n0Var = style.f38953d1;
        if (n0Var instanceof SVG.f) {
            i10 = ((SVG.f) n0Var).f39004p0;
        } else if (!(n0Var instanceof SVG.g)) {
            return;
        } else {
            i10 = style.H0.f39004p0;
        }
        Float f6 = style.f38954e1;
        if (f6 != null) {
            i10 = i(f6.floatValue(), i10);
        }
        this.f39132a.drawColor(i10);
    }

    public final boolean V() {
        Boolean bool = this.f39135d.f39168a.V0;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @TargetApi(19)
    public final Path b(SVG.j0 j0Var, SVG.b bVar) {
        Path pathC;
        SVG.k0 k0VarE = j0Var.f39035a.e(this.f39135d.f39168a.Y0);
        if (k0VarE == null) {
            String.format("ClipPath reference '%s' not found", this.f39135d.f39168a.Y0);
            return null;
        }
        SVG.e eVar = (SVG.e) k0VarE;
        this.f39136e.push(this.f39135d);
        this.f39135d = s(eVar);
        Boolean bool = eVar.f38996p;
        boolean z10 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(bVar.f38967a, bVar.f38968b);
            matrix.preScale(bVar.f38969c, bVar.f38970d);
        }
        Matrix matrix2 = eVar.f39034o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (SVG.m0 m0Var : eVar.f39006i) {
            if ((m0Var instanceof SVG.j0) && (pathC = C((SVG.j0) m0Var, true)) != null) {
                path.op(pathC, Path.Op.UNION);
            }
        }
        if (this.f39135d.f39168a.Y0 != null) {
            if (eVar.f39024h == null) {
                eVar.f39024h = c(path);
            }
            Path pathB = b(eVar, eVar.f39024h);
            if (pathB != null) {
                path.op(pathB, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f39135d = this.f39136e.pop();
        return path;
    }

    public final float d(SVG.x0 x0Var) {
        k kVar = new k();
        n(x0Var, kVar);
        return kVar.f39180a;
    }

    public final void f(SVG.j0 j0Var, SVG.b bVar) {
        Path pathB;
        if (this.f39135d.f39168a.Y0 == null || (pathB = b(j0Var, bVar)) == null) {
            return;
        }
        this.f39132a.clipPath(pathB);
    }

    public final void g(SVG.j0 j0Var) {
        SVG.n0 n0Var = this.f39135d.f39168a.f38958q0;
        if (n0Var instanceof SVG.u) {
            j(true, j0Var.f39024h, (SVG.u) n0Var);
        }
        SVG.n0 n0Var2 = this.f39135d.f39168a.f38961t0;
        if (n0Var2 instanceof SVG.u) {
            j(false, j0Var.f39024h, (SVG.u) n0Var2);
        }
    }

    public final void j(boolean z10, SVG.b bVar, SVG.u uVar) {
        float f6;
        float fC;
        float f10;
        float fC2;
        float f11;
        float fC3;
        float f12;
        int i10;
        SVG.k0 k0VarE = this.f39134c.e(uVar.f39067p0);
        if (k0VarE == null) {
            Object[] objArr = new Object[2];
            objArr[0] = z10 ? "Fill" : "Stroke";
            objArr[1] = uVar.f39067p0;
            String.format("%s reference '%s' not found", objArr);
            SVG.n0 n0Var = uVar.f39068q0;
            if (n0Var != null) {
                N(this.f39135d, z10, n0Var);
                return;
            } else if (z10) {
                this.f39135d.f39169b = false;
                return;
            } else {
                this.f39135d.f39170c = false;
                return;
            }
        }
        boolean z11 = k0VarE instanceof SVG.l0;
        SVG.f fVar = SVG.f.f39002q0;
        if (z11) {
            SVG.l0 l0Var = (SVG.l0) k0VarE;
            String str = l0Var.f39023l;
            if (str != null) {
                p(l0Var, str);
            }
            Boolean bool = l0Var.f39020i;
            boolean z12 = bool != null && bool.booleanValue();
            h hVar = this.f39135d;
            Paint paint = z10 ? hVar.f39171d : hVar.f39172e;
            if (z12) {
                h hVar2 = this.f39135d;
                SVG.b bVar2 = hVar2.f39174g;
                if (bVar2 == null) {
                    bVar2 = hVar2.f39173f;
                }
                SVG.p pVar = l0Var.m;
                float fD = pVar != null ? pVar.d(this) : 0.0f;
                SVG.p pVar2 = l0Var.f39031n;
                fC2 = pVar2 != null ? pVar2.e(this) : 0.0f;
                SVG.p pVar3 = l0Var.f39032o;
                float fD2 = pVar3 != null ? pVar3.d(this) : bVar2.f38969c;
                SVG.p pVar4 = l0Var.f39033p;
                f12 = fD2;
                f11 = fD;
                fC3 = pVar4 != null ? pVar4.e(this) : 0.0f;
            } else {
                SVG.p pVar5 = l0Var.m;
                float fC4 = pVar5 != null ? pVar5.c(this, 1.0f) : 0.0f;
                SVG.p pVar6 = l0Var.f39031n;
                fC2 = pVar6 != null ? pVar6.c(this, 1.0f) : 0.0f;
                SVG.p pVar7 = l0Var.f39032o;
                float fC5 = pVar7 != null ? pVar7.c(this, 1.0f) : 1.0f;
                SVG.p pVar8 = l0Var.f39033p;
                f11 = fC4;
                fC3 = pVar8 != null ? pVar8.c(this, 1.0f) : 0.0f;
                f12 = fC5;
            }
            float f13 = fC2;
            P();
            this.f39135d = s(l0Var);
            Matrix matrix = new Matrix();
            if (!z12) {
                matrix.preTranslate(bVar.f38967a, bVar.f38968b);
                matrix.preScale(bVar.f38969c, bVar.f38970d);
            }
            Matrix matrix2 = l0Var.f39021j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = l0Var.f39019h.size();
            if (size == 0) {
                O();
                if (z10) {
                    this.f39135d.f39169b = false;
                    return;
                } else {
                    this.f39135d.f39170c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator<SVG.m0> it = l0Var.f39019h.iterator();
            int i11 = 0;
            float f14 = -1.0f;
            while (it.hasNext()) {
                SVG.d0 d0Var = (SVG.d0) it.next();
                Float f15 = d0Var.f38990h;
                float fFloatValue = f15 != null ? f15.floatValue() : 0.0f;
                if (i11 == 0 || fFloatValue >= f14) {
                    fArr[i11] = fFloatValue;
                    f14 = fFloatValue;
                } else {
                    fArr[i11] = f14;
                }
                P();
                T(this.f39135d, d0Var);
                SVG.Style style = this.f39135d.f39168a;
                SVG.f fVar2 = (SVG.f) style.W0;
                if (fVar2 == null) {
                    fVar2 = fVar;
                }
                iArr[i11] = i(style.X0.floatValue(), fVar2.f39004p0);
                i11++;
                O();
            }
            if ((f11 == f12 && f13 == fC3) || size == 1) {
                O();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            SVG.k kVar = l0Var.f39022k;
            if (kVar != null) {
                if (kVar == SVG.k.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (kVar == SVG.k.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            O();
            LinearGradient linearGradient = new LinearGradient(f11, f13, f12, fC3, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (this.f39135d.f39168a.f38960s0.floatValue() * 256.0f);
            if (iFloatValue < 0) {
                i10 = 0;
            } else {
                i10 = iFloatValue > 255 ? 255 : iFloatValue;
            }
            paint.setAlpha(i10);
            return;
        }
        if (!(k0VarE instanceof SVG.p0)) {
            if (k0VarE instanceof SVG.c0) {
                SVG.c0 c0Var = (SVG.c0) k0VarE;
                if (z10) {
                    if (w(c0Var.f39027e, SvgConstantsKt.SPECIFIED_SOLID_COLOR)) {
                        h hVar3 = this.f39135d;
                        SVG.Style style2 = hVar3.f39168a;
                        SVG.n0 n0Var2 = c0Var.f39027e.f38951b1;
                        style2.f38958q0 = n0Var2;
                        hVar3.f39169b = n0Var2 != null;
                    }
                    if (w(c0Var.f39027e, SvgConstantsKt.SPECIFIED_SOLID_OPACITY)) {
                        this.f39135d.f39168a.f38960s0 = c0Var.f39027e.f38952c1;
                    }
                    if (w(c0Var.f39027e, 6442450944L)) {
                        h hVar4 = this.f39135d;
                        N(hVar4, z10, hVar4.f39168a.f38958q0);
                        return;
                    }
                    return;
                }
                if (w(c0Var.f39027e, SvgConstantsKt.SPECIFIED_SOLID_COLOR)) {
                    h hVar5 = this.f39135d;
                    SVG.Style style3 = hVar5.f39168a;
                    SVG.n0 n0Var3 = c0Var.f39027e.f38951b1;
                    style3.f38961t0 = n0Var3;
                    hVar5.f39170c = n0Var3 != null;
                }
                if (w(c0Var.f39027e, SvgConstantsKt.SPECIFIED_SOLID_OPACITY)) {
                    this.f39135d.f39168a.f38962u0 = c0Var.f39027e.f38952c1;
                }
                if (w(c0Var.f39027e, 6442450944L)) {
                    h hVar6 = this.f39135d;
                    N(hVar6, z10, hVar6.f39168a.f38961t0);
                    return;
                }
                return;
            }
            return;
        }
        SVG.p0 p0Var = (SVG.p0) k0VarE;
        String str2 = p0Var.f39023l;
        if (str2 != null) {
            p(p0Var, str2);
        }
        Boolean bool2 = p0Var.f39020i;
        boolean z13 = bool2 != null && bool2.booleanValue();
        h hVar7 = this.f39135d;
        Paint paint2 = z10 ? hVar7.f39171d : hVar7.f39172e;
        if (z13) {
            SVG.p pVar9 = new SVG.p(50.0f, SVG.c1.percent);
            SVG.p pVar10 = p0Var.m;
            float fD3 = pVar10 != null ? pVar10.d(this) : pVar9.d(this);
            SVG.p pVar11 = p0Var.f39046n;
            float fE = pVar11 != null ? pVar11.e(this) : pVar9.e(this);
            SVG.p pVar12 = p0Var.f39047o;
            fC = pVar12 != null ? pVar12.b(this) : pVar9.b(this);
            f6 = fD3;
            f10 = fE;
        } else {
            SVG.p pVar13 = p0Var.m;
            float fC6 = pVar13 != null ? pVar13.c(this, 1.0f) : 0.5f;
            SVG.p pVar14 = p0Var.f39046n;
            float fC7 = pVar14 != null ? pVar14.c(this, 1.0f) : 0.5f;
            SVG.p pVar15 = p0Var.f39047o;
            f6 = fC6;
            fC = pVar15 != null ? pVar15.c(this, 1.0f) : 0.5f;
            f10 = fC7;
        }
        P();
        this.f39135d = s(p0Var);
        Matrix matrix3 = new Matrix();
        if (!z13) {
            matrix3.preTranslate(bVar.f38967a, bVar.f38968b);
            matrix3.preScale(bVar.f38969c, bVar.f38970d);
        }
        Matrix matrix4 = p0Var.f39021j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = p0Var.f39019h.size();
        if (size2 == 0) {
            O();
            if (z10) {
                this.f39135d.f39169b = false;
                return;
            } else {
                this.f39135d.f39170c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator<SVG.m0> it2 = p0Var.f39019h.iterator();
        int i12 = 0;
        float f16 = -1.0f;
        while (it2.hasNext()) {
            SVG.d0 d0Var2 = (SVG.d0) it2.next();
            Float f17 = d0Var2.f38990h;
            float fFloatValue2 = f17 != null ? f17.floatValue() : 0.0f;
            if (i12 == 0 || fFloatValue2 >= f16) {
                fArr2[i12] = fFloatValue2;
                f16 = fFloatValue2;
            } else {
                fArr2[i12] = f16;
            }
            P();
            T(this.f39135d, d0Var2);
            SVG.Style style4 = this.f39135d.f39168a;
            SVG.f fVar3 = (SVG.f) style4.W0;
            if (fVar3 == null) {
                fVar3 = fVar;
            }
            iArr2[i12] = i(style4.X0.floatValue(), fVar3.f39004p0);
            i12++;
            O();
        }
        if (fC == 0.0f || size2 == 1) {
            O();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        SVG.k kVar2 = p0Var.f39022k;
        if (kVar2 != null) {
            if (kVar2 == SVG.k.reflect) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (kVar2 == SVG.k.repeat) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        O();
        RadialGradient radialGradient = new RadialGradient(f6, f10, fC, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (this.f39135d.f39168a.f38960s0.floatValue() * 256.0f);
        if (iFloatValue2 < 0) {
            iFloatValue2 = 0;
        } else if (iFloatValue2 > 255) {
            iFloatValue2 = 255;
        }
        paint2.setAlpha(iFloatValue2);
    }

    public final boolean k() {
        Boolean bool = this.f39135d.f39168a.U0;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void l(SVG.j0 j0Var, Path path) {
        float fD;
        float fE;
        float fE2;
        float fD2;
        SVG.n0 n0Var = this.f39135d.f39168a.f38958q0;
        boolean z10 = n0Var instanceof SVG.u;
        Canvas canvas = this.f39132a;
        if (z10) {
            SVG.k0 k0VarE = this.f39134c.e(((SVG.u) n0Var).f39067p0);
            if (k0VarE instanceof SVG.y) {
                SVG.y yVar = (SVG.y) k0VarE;
                Boolean bool = yVar.f39076q;
                boolean z11 = bool != null && bool.booleanValue();
                String str = yVar.f39083x;
                if (str != null) {
                    r(yVar, str);
                }
                if (z11) {
                    SVG.p pVar = yVar.f39079t;
                    fD = pVar != null ? pVar.d(this) : 0.0f;
                    SVG.p pVar2 = yVar.f39080u;
                    fE2 = pVar2 != null ? pVar2.e(this) : 0.0f;
                    SVG.p pVar3 = yVar.f39081v;
                    fD2 = pVar3 != null ? pVar3.d(this) : 0.0f;
                    SVG.p pVar4 = yVar.f39082w;
                    fE = pVar4 != null ? pVar4.e(this) : 0.0f;
                } else {
                    SVG.p pVar5 = yVar.f39079t;
                    float fC = pVar5 != null ? pVar5.c(this, 1.0f) : 0.0f;
                    SVG.p pVar6 = yVar.f39080u;
                    float fC2 = pVar6 != null ? pVar6.c(this, 1.0f) : 0.0f;
                    SVG.p pVar7 = yVar.f39081v;
                    float fC3 = pVar7 != null ? pVar7.c(this, 1.0f) : 0.0f;
                    SVG.p pVar8 = yVar.f39082w;
                    float fC4 = pVar8 != null ? pVar8.c(this, 1.0f) : 0.0f;
                    SVG.b bVar = j0Var.f39024h;
                    float f6 = bVar.f38967a;
                    float f10 = bVar.f38969c;
                    fD = (fC * f10) + f6;
                    float f11 = bVar.f38968b;
                    float f12 = bVar.f38970d;
                    float f13 = fC3 * f10;
                    fE = fC4 * f12;
                    fE2 = (fC2 * f12) + f11;
                    fD2 = f13;
                }
                if (fD2 == 0.0f || fE == 0.0f) {
                    return;
                }
                PreserveAspectRatio preserveAspectRatio = yVar.f39043o;
                if (preserveAspectRatio == null) {
                    preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
                }
                P();
                canvas.clipPath(path);
                h hVar = new h();
                S(hVar, SVG.Style.a());
                hVar.f39168a.P0 = Boolean.FALSE;
                t(yVar, hVar);
                this.f39135d = hVar;
                SVG.b bVar2 = j0Var.f39024h;
                Matrix matrix = yVar.f39078s;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (yVar.f39078s.invert(matrix2)) {
                        SVG.b bVar3 = j0Var.f39024h;
                        SVG.b bVar4 = j0Var.f39024h;
                        SVG.b bVar5 = j0Var.f39024h;
                        float[] fArr = {bVar3.f38967a, bVar3.f38968b, bVar3.a(), bVar4.f38968b, bVar4.a(), j0Var.f39024h.b(), bVar5.f38967a, bVar5.b()};
                        matrix2.mapPoints(fArr);
                        float f14 = fArr[0];
                        float f15 = fArr[1];
                        RectF rectF = new RectF(f14, f15, f14, f15);
                        for (int i10 = 2; i10 <= 6; i10 += 2) {
                            float f16 = fArr[i10];
                            if (f16 < rectF.left) {
                                rectF.left = f16;
                            }
                            if (f16 > rectF.right) {
                                rectF.right = f16;
                            }
                            float f17 = fArr[i10 + 1];
                            if (f17 < rectF.top) {
                                rectF.top = f17;
                            }
                            if (f17 > rectF.bottom) {
                                rectF.bottom = f17;
                            }
                        }
                        float f18 = rectF.left;
                        float f19 = rectF.top;
                        bVar2 = new SVG.b(f18, f19, rectF.right - f18, rectF.bottom - f19);
                    }
                }
                float fFloor = (((float) Math.floor((bVar2.f38967a - fD) / fD2)) * fD2) + fD;
                float fA = bVar2.a();
                float fB = bVar2.b();
                SVG.b bVar6 = new SVG.b(0.0f, 0.0f, fD2, fE);
                boolean zE = E();
                for (float fFloor2 = (((float) Math.floor((bVar2.f38968b - fE2) / fE)) * fE) + fE2; fFloor2 < fB; fFloor2 += fE) {
                    float f20 = fFloor;
                    while (f20 < fA) {
                        bVar6.f38967a = f20;
                        bVar6.f38968b = fFloor2;
                        P();
                        if (!this.f39135d.f39168a.P0.booleanValue()) {
                            M(bVar6.f38967a, bVar6.f38968b, bVar6.f38969c, bVar6.f38970d);
                        }
                        SVG.b bVar7 = yVar.f39054p;
                        if (bVar7 != null) {
                            canvas.concat(e(bVar6, bVar7, preserveAspectRatio));
                        } else {
                            Boolean bool2 = yVar.f39077r;
                            boolean z12 = bool2 == null || bool2.booleanValue();
                            canvas.translate(f20, fFloor2);
                            if (!z12) {
                                SVG.b bVar8 = j0Var.f39024h;
                                canvas.scale(bVar8.f38969c, bVar8.f38970d);
                            }
                        }
                        Iterator<SVG.m0> it = yVar.f39006i.iterator();
                        while (it.hasNext()) {
                            G(it.next());
                        }
                        O();
                        f20 += fD2;
                        fB = fB;
                        fFloor = fFloor;
                    }
                }
                if (zE) {
                    D(yVar.f39024h);
                }
                O();
                return;
            }
        }
        canvas.drawPath(path, this.f39135d.f39171d);
    }

    public final void m(Path path) {
        h hVar = this.f39135d;
        SVG.Style.VectorEffect vectorEffect = hVar.f39168a.f38955f1;
        SVG.Style.VectorEffect vectorEffect2 = SVG.Style.VectorEffect.NonScalingStroke;
        Canvas canvas = this.f39132a;
        if (vectorEffect != vectorEffect2) {
            canvas.drawPath(path, hVar.f39172e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = this.f39135d.f39172e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, this.f39135d.f39172e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final void n(SVG.x0 x0Var, j jVar) {
        float f6;
        float fE;
        float fD;
        SVG.Style.TextAnchor textAnchorU;
        if (k()) {
            Iterator<SVG.m0> it = x0Var.f39006i.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                SVG.m0 next = it.next();
                if (next instanceof SVG.b1) {
                    jVar.b(Q(((SVG.b1) next).f38977c, z10, !it.hasNext()));
                } else if (jVar.a((SVG.x0) next)) {
                    float fE2 = 0.0f;
                    if (next instanceof SVG.y0) {
                        P();
                        SVG.y0 y0Var = (SVG.y0) next;
                        T(this.f39135d, y0Var);
                        if (k() && V()) {
                            SVG.k0 k0VarE = y0Var.f39035a.e(y0Var.f39084o);
                            if (k0VarE == null) {
                                String.format("TextPath reference '%s' not found", y0Var.f39084o);
                            } else {
                                SVG.v vVar = (SVG.v) k0VarE;
                                Path path = new d(vVar.f39070o).f39156a;
                                Matrix matrix = vVar.f39030n;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                SVG.p pVar = y0Var.f39085p;
                                fE2 = pVar != null ? pVar.c(this, pathMeasure.getLength()) : 0.0f;
                                SVG.Style.TextAnchor textAnchorU2 = u();
                                if (textAnchorU2 != SVG.Style.TextAnchor.Start) {
                                    float fD2 = d(y0Var);
                                    if (textAnchorU2 == SVG.Style.TextAnchor.Middle) {
                                        fD2 /= 2.0f;
                                    }
                                    fE2 -= fD2;
                                }
                                g((SVG.j0) y0Var.f39086q);
                                boolean zE = E();
                                n(y0Var, new e(fE2, path, this));
                                if (zE) {
                                    D(y0Var.f39024h);
                                }
                            }
                        }
                        O();
                    } else if (next instanceof SVG.u0) {
                        P();
                        SVG.u0 u0Var = (SVG.u0) next;
                        T(this.f39135d, u0Var);
                        if (k()) {
                            ArrayList arrayList = u0Var.f39088o;
                            boolean z11 = arrayList != null && arrayList.size() > 0;
                            boolean z12 = jVar instanceof f;
                            if (z12) {
                                float fD3 = !z11 ? ((f) jVar).f39161a : ((SVG.p) u0Var.f39088o.get(0)).d(this);
                                ArrayList arrayList2 = u0Var.f39089p;
                                fE = (arrayList2 == null || arrayList2.size() == 0) ? ((f) jVar).f39162b : ((SVG.p) u0Var.f39089p.get(0)).e(this);
                                ArrayList arrayList3 = u0Var.f39090q;
                                fD = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((SVG.p) u0Var.f39090q.get(0)).d(this);
                                ArrayList arrayList4 = u0Var.f39091r;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fE2 = ((SVG.p) u0Var.f39091r.get(0)).e(this);
                                }
                                float f10 = fD3;
                                f6 = fE2;
                                fE2 = f10;
                            } else {
                                f6 = 0.0f;
                                fE = 0.0f;
                                fD = 0.0f;
                            }
                            if (z11 && (textAnchorU = u()) != SVG.Style.TextAnchor.Start) {
                                float fD4 = d(u0Var);
                                if (textAnchorU == SVG.Style.TextAnchor.Middle) {
                                    fD4 /= 2.0f;
                                }
                                fE2 -= fD4;
                            }
                            g((SVG.j0) u0Var.f39069s);
                            if (z12) {
                                f fVar = (f) jVar;
                                fVar.f39161a = fE2 + fD;
                                fVar.f39162b = fE + f6;
                            }
                            boolean zE2 = E();
                            n(u0Var, jVar);
                            if (zE2) {
                                D(u0Var.f39024h);
                            }
                        }
                        O();
                    } else if (next instanceof SVG.t0) {
                        P();
                        SVG.t0 t0Var = (SVG.t0) next;
                        T(this.f39135d, t0Var);
                        if (k()) {
                            g((SVG.j0) t0Var.f39066p);
                            SVG.k0 k0VarE2 = next.f39035a.e(t0Var.f39065o);
                            if (k0VarE2 == null || !(k0VarE2 instanceof SVG.x0)) {
                                String.format("Tref reference '%s' not found", t0Var.f39065o);
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                o((SVG.x0) k0VarE2, sb2);
                                if (sb2.length() > 0) {
                                    jVar.b(sb2.toString());
                                }
                            }
                        }
                        O();
                    }
                }
                z10 = false;
            }
        }
    }

    public final void o(SVG.x0 x0Var, StringBuilder sb2) {
        Iterator<SVG.m0> it = x0Var.f39006i.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            SVG.m0 next = it.next();
            if (next instanceof SVG.x0) {
                o((SVG.x0) next, sb2);
            } else if (next instanceof SVG.b1) {
                sb2.append(Q(((SVG.b1) next).f38977c, z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    public final h s(SVG.m0 m0Var) {
        h hVar = new h();
        S(hVar, SVG.Style.a());
        t(m0Var, hVar);
        return hVar;
    }

    public final void t(SVG.m0 m0Var, h hVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (m0Var instanceof SVG.k0) {
                arrayList.add(0, (SVG.k0) m0Var);
            }
            Object obj = m0Var.f39036b;
            if (obj == null) {
                break;
            } else {
                m0Var = (SVG.m0) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            T(hVar, (SVG.k0) it.next());
        }
        h hVar2 = this.f39135d;
        hVar.f39174g = hVar2.f39174g;
        hVar.f39173f = hVar2.f39173f;
    }

    public final SVG.Style.TextAnchor u() {
        SVG.Style.TextAnchor textAnchor;
        SVG.Style style = this.f39135d.f39168a;
        if (style.N0 == SVG.Style.TextDirection.LTR || (textAnchor = style.O0) == SVG.Style.TextAnchor.Middle) {
            return style.O0;
        }
        SVG.Style.TextAnchor textAnchor2 = SVG.Style.TextAnchor.Start;
        return textAnchor == textAnchor2 ? SVG.Style.TextAnchor.End : textAnchor2;
    }

    public final Path.FillType v() {
        SVG.Style.FillRule fillRule = this.f39135d.f39168a.Z0;
        return (fillRule == null || fillRule != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final Path x(SVG.d dVar) {
        SVG.p pVar = dVar.f38987o;
        float fD = pVar != null ? pVar.d(this) : 0.0f;
        SVG.p pVar2 = dVar.f38988p;
        float fE = pVar2 != null ? pVar2.e(this) : 0.0f;
        float fB = dVar.f38989q.b(this);
        float f6 = fD - fB;
        float f10 = fE - fB;
        float f11 = fD + fB;
        float f12 = fE + fB;
        if (dVar.f39024h == null) {
            float f13 = 2.0f * fB;
            dVar.f39024h = new SVG.b(f6, f10, f13, f13);
        }
        float f14 = 0.5522848f * fB;
        Path path = new Path();
        path.moveTo(fD, f10);
        float f15 = fD + f14;
        float f16 = fE - f14;
        path.cubicTo(f15, f10, f11, f16, f11, fE);
        float f17 = fE + f14;
        path.cubicTo(f11, f17, f15, f12, fD, f12);
        float f18 = fD - f14;
        path.cubicTo(f18, f12, f6, f17, f6, fE);
        path.cubicTo(f6, f16, f18, f10, fD, f10);
        path.close();
        return path;
    }

    public final Path y(SVG.i iVar) {
        SVG.p pVar = iVar.f39015o;
        float fD = pVar != null ? pVar.d(this) : 0.0f;
        SVG.p pVar2 = iVar.f39016p;
        float fE = pVar2 != null ? pVar2.e(this) : 0.0f;
        float fD2 = iVar.f39017q.d(this);
        float fE2 = iVar.f39018r.e(this);
        float f6 = fD - fD2;
        float f10 = fE - fE2;
        float f11 = fD + fD2;
        float f12 = fE + fE2;
        if (iVar.f39024h == null) {
            iVar.f39024h = new SVG.b(f6, f10, fD2 * 2.0f, 2.0f * fE2);
        }
        float f13 = fD2 * 0.5522848f;
        float f14 = 0.5522848f * fE2;
        Path path = new Path();
        path.moveTo(fD, f10);
        float f15 = fD + f13;
        float f16 = fE - f14;
        path.cubicTo(f15, f10, f11, f16, f11, fE);
        float f17 = f14 + fE;
        path.cubicTo(f11, f17, f15, f12, fD, f12);
        float f18 = fD - f13;
        path.cubicTo(f18, f12, f6, f17, f6, fE);
        path.cubicTo(f6, f16, f18, f10, fD, f10);
        path.close();
        return path;
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.java */
    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SVG.Style f39168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f39169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f39170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Paint f39171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Paint f39172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SVG.b f39173f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public SVG.b f39174g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f39175h;

        public h() {
            Paint paint = new Paint();
            this.f39171d = paint;
            paint.setFlags(Opcodes.INSTANCEOF);
            paint.setHinting(0);
            paint.setStyle(Paint.Style.FILL);
            Typeface typeface = Typeface.DEFAULT;
            paint.setTypeface(typeface);
            Paint paint2 = new Paint();
            this.f39172e = paint2;
            paint2.setFlags(Opcodes.INSTANCEOF);
            paint2.setHinting(0);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setTypeface(typeface);
            this.f39168a = SVG.Style.a();
        }

        public h(h hVar) {
            this.f39169b = hVar.f39169b;
            this.f39170c = hVar.f39170c;
            this.f39171d = new Paint(hVar.f39171d);
            this.f39172e = new Paint(hVar.f39172e);
            SVG.b bVar = hVar.f39173f;
            if (bVar != null) {
                this.f39173f = new SVG.b(bVar);
            }
            SVG.b bVar2 = hVar.f39174g;
            if (bVar2 != null) {
                this.f39174g = new SVG.b(bVar2);
            }
            this.f39175h = hVar.f39175h;
            try {
                this.f39168a = (SVG.Style) hVar.f39168a.clone();
            } catch (CloneNotSupportedException unused) {
                this.f39168a = SVG.Style.a();
            }
        }
    }
}
