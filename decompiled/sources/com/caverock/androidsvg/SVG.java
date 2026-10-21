package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.Log;
import androidx.core.view.ViewCompat;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.DebugKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class SVG {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static SVGExternalFileResolver f38942g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f38943h = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e0 f38944a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38945b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38946c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f38947d = 96.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.caverock.androidsvg.a.r f38948e = new com.caverock.androidsvg.a.r();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f38949f = new HashMap();

    public static class Style implements Cloneable {
        public p[] E0;
        public p F0;
        public Float G0;
        public f H0;
        public List<String> I0;
        public p J0;
        public Integer K0;
        public FontStyle L0;
        public TextDecoration M0;
        public TextDirection N0;
        public TextAnchor O0;
        public Boolean P0;
        public c Q0;
        public String R0;
        public String S0;
        public String T0;
        public Boolean U0;
        public Boolean V0;
        public n0 W0;
        public Float X0;
        public String Y0;
        public FillRule Z0;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        public String f38950a1;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        public n0 f38951b1;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        public Float f38952c1;

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        public n0 f38953d1;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        public Float f38954e1;

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        public VectorEffect f38955f1;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        public RenderQuality f38956g1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public long f38957p0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public n0 f38958q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public FillRule f38959r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Float f38960s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public n0 f38961t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Float f38962u0;
        public p v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public LineCap f38963w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public LineJoin f38964x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Float f38965y0;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class FillRule {
            private static final /* synthetic */ FillRule[] $VALUES;
            public static final FillRule EvenOdd;
            public static final FillRule NonZero;

            static {
                FillRule fillRule = new FillRule("NonZero", 0);
                NonZero = fillRule;
                FillRule fillRule2 = new FillRule("EvenOdd", 1);
                EvenOdd = fillRule2;
                $VALUES = new FillRule[]{fillRule, fillRule2};
            }

            public FillRule() {
                throw null;
            }

            public static FillRule valueOf(String str) {
                return (FillRule) Enum.valueOf(FillRule.class, str);
            }

            public static FillRule[] values() {
                return (FillRule[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class FontStyle {
            private static final /* synthetic */ FontStyle[] $VALUES;
            public static final FontStyle Italic;
            public static final FontStyle Normal;
            public static final FontStyle Oblique;

            static {
                FontStyle fontStyle = new FontStyle("Normal", 0);
                Normal = fontStyle;
                FontStyle fontStyle2 = new FontStyle("Italic", 1);
                Italic = fontStyle2;
                FontStyle fontStyle3 = new FontStyle("Oblique", 2);
                Oblique = fontStyle3;
                $VALUES = new FontStyle[]{fontStyle, fontStyle2, fontStyle3};
            }

            public FontStyle() {
                throw null;
            }

            public static FontStyle valueOf(String str) {
                return (FontStyle) Enum.valueOf(FontStyle.class, str);
            }

            public static FontStyle[] values() {
                return (FontStyle[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class LineCap {
            private static final /* synthetic */ LineCap[] $VALUES;
            public static final LineCap Butt;
            public static final LineCap Round;
            public static final LineCap Square;

            static {
                LineCap lineCap = new LineCap("Butt", 0);
                Butt = lineCap;
                LineCap lineCap2 = new LineCap("Round", 1);
                Round = lineCap2;
                LineCap lineCap3 = new LineCap("Square", 2);
                Square = lineCap3;
                $VALUES = new LineCap[]{lineCap, lineCap2, lineCap3};
            }

            public LineCap() {
                throw null;
            }

            public static LineCap valueOf(String str) {
                return (LineCap) Enum.valueOf(LineCap.class, str);
            }

            public static LineCap[] values() {
                return (LineCap[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class LineJoin {
            private static final /* synthetic */ LineJoin[] $VALUES;
            public static final LineJoin Bevel;
            public static final LineJoin Miter;
            public static final LineJoin Round;

            static {
                LineJoin lineJoin = new LineJoin("Miter", 0);
                Miter = lineJoin;
                LineJoin lineJoin2 = new LineJoin("Round", 1);
                Round = lineJoin2;
                LineJoin lineJoin3 = new LineJoin("Bevel", 2);
                Bevel = lineJoin3;
                $VALUES = new LineJoin[]{lineJoin, lineJoin2, lineJoin3};
            }

            public LineJoin() {
                throw null;
            }

            public static LineJoin valueOf(String str) {
                return (LineJoin) Enum.valueOf(LineJoin.class, str);
            }

            public static LineJoin[] values() {
                return (LineJoin[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class RenderQuality {
            private static final /* synthetic */ RenderQuality[] $VALUES;
            public static final RenderQuality auto;
            public static final RenderQuality optimizeQuality;
            public static final RenderQuality optimizeSpeed;

            static {
                RenderQuality renderQuality = new RenderQuality(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, 0);
                auto = renderQuality;
                RenderQuality renderQuality2 = new RenderQuality("optimizeQuality", 1);
                optimizeQuality = renderQuality2;
                RenderQuality renderQuality3 = new RenderQuality("optimizeSpeed", 2);
                optimizeSpeed = renderQuality3;
                $VALUES = new RenderQuality[]{renderQuality, renderQuality2, renderQuality3};
            }

            public RenderQuality() {
                throw null;
            }

            public static RenderQuality valueOf(String str) {
                return (RenderQuality) Enum.valueOf(RenderQuality.class, str);
            }

            public static RenderQuality[] values() {
                return (RenderQuality[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class TextAnchor {
            private static final /* synthetic */ TextAnchor[] $VALUES;
            public static final TextAnchor End;
            public static final TextAnchor Middle;
            public static final TextAnchor Start;

            static {
                TextAnchor textAnchor = new TextAnchor("Start", 0);
                Start = textAnchor;
                TextAnchor textAnchor2 = new TextAnchor("Middle", 1);
                Middle = textAnchor2;
                TextAnchor textAnchor3 = new TextAnchor("End", 2);
                End = textAnchor3;
                $VALUES = new TextAnchor[]{textAnchor, textAnchor2, textAnchor3};
            }

            public TextAnchor() {
                throw null;
            }

            public static TextAnchor valueOf(String str) {
                return (TextAnchor) Enum.valueOf(TextAnchor.class, str);
            }

            public static TextAnchor[] values() {
                return (TextAnchor[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class TextDecoration {
            private static final /* synthetic */ TextDecoration[] $VALUES;
            public static final TextDecoration Blink;
            public static final TextDecoration LineThrough;
            public static final TextDecoration None;
            public static final TextDecoration Overline;
            public static final TextDecoration Underline;

            static {
                TextDecoration textDecoration = new TextDecoration("None", 0);
                None = textDecoration;
                TextDecoration textDecoration2 = new TextDecoration("Underline", 1);
                Underline = textDecoration2;
                TextDecoration textDecoration3 = new TextDecoration("Overline", 2);
                Overline = textDecoration3;
                TextDecoration textDecoration4 = new TextDecoration("LineThrough", 3);
                LineThrough = textDecoration4;
                TextDecoration textDecoration5 = new TextDecoration("Blink", 4);
                Blink = textDecoration5;
                $VALUES = new TextDecoration[]{textDecoration, textDecoration2, textDecoration3, textDecoration4, textDecoration5};
            }

            public TextDecoration() {
                throw null;
            }

            public static TextDecoration valueOf(String str) {
                return (TextDecoration) Enum.valueOf(TextDecoration.class, str);
            }

            public static TextDecoration[] values() {
                return (TextDecoration[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class TextDirection {
            private static final /* synthetic */ TextDirection[] $VALUES;
            public static final TextDirection LTR;
            public static final TextDirection RTL;

            static {
                TextDirection textDirection = new TextDirection("LTR", 0);
                LTR = textDirection;
                TextDirection textDirection2 = new TextDirection("RTL", 1);
                RTL = textDirection2;
                $VALUES = new TextDirection[]{textDirection, textDirection2};
            }

            public TextDirection() {
                throw null;
            }

            public static TextDirection valueOf(String str) {
                return (TextDirection) Enum.valueOf(TextDirection.class, str);
            }

            public static TextDirection[] values() {
                return (TextDirection[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class VectorEffect {
            private static final /* synthetic */ VectorEffect[] $VALUES;
            public static final VectorEffect NonScalingStroke;
            public static final VectorEffect None;

            static {
                VectorEffect vectorEffect = new VectorEffect("None", 0);
                None = vectorEffect;
                VectorEffect vectorEffect2 = new VectorEffect("NonScalingStroke", 1);
                NonScalingStroke = vectorEffect2;
                $VALUES = new VectorEffect[]{vectorEffect, vectorEffect2};
            }

            public VectorEffect() {
                throw null;
            }

            public static VectorEffect valueOf(String str) {
                return (VectorEffect) Enum.valueOf(VectorEffect.class, str);
            }

            public static VectorEffect[] values() {
                return (VectorEffect[]) $VALUES.clone();
            }
        }

        public static Style a() {
            Style style = new Style();
            style.f38957p0 = -1L;
            f fVar = f.f39002q0;
            style.f38958q0 = fVar;
            FillRule fillRule = FillRule.NonZero;
            style.f38959r0 = fillRule;
            Float fValueOf = Float.valueOf(1.0f);
            style.f38960s0 = fValueOf;
            style.f38961t0 = null;
            style.f38962u0 = fValueOf;
            style.v0 = new p(1.0f);
            style.f38963w0 = LineCap.Butt;
            style.f38964x0 = LineJoin.Miter;
            style.f38965y0 = Float.valueOf(4.0f);
            style.E0 = null;
            style.F0 = new p(0.0f);
            style.G0 = fValueOf;
            style.H0 = fVar;
            style.I0 = null;
            style.J0 = new p(12.0f, c1.pt);
            style.K0 = 400;
            style.L0 = FontStyle.Normal;
            style.M0 = TextDecoration.None;
            style.N0 = TextDirection.LTR;
            style.O0 = TextAnchor.Start;
            Boolean bool = Boolean.TRUE;
            style.P0 = bool;
            style.Q0 = null;
            style.R0 = null;
            style.S0 = null;
            style.T0 = null;
            style.U0 = bool;
            style.V0 = bool;
            style.W0 = fVar;
            style.X0 = fValueOf;
            style.Y0 = null;
            style.Z0 = fillRule;
            style.f38950a1 = null;
            style.f38951b1 = null;
            style.f38952c1 = fValueOf;
            style.f38953d1 = null;
            style.f38954e1 = fValueOf;
            style.f38955f1 = VectorEffect.None;
            style.f38956g1 = RenderQuality.auto;
            return style;
        }

        public final Object clone() throws CloneNotSupportedException {
            Style style = (Style) super.clone();
            p[] pVarArr = this.E0;
            if (pVarArr != null) {
                style.E0 = (p[]) pVarArr.clone();
            }
            return style;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38966a;

        static {
            int[] iArr = new int[c1.values().length];
            f38966a = iArr;
            try {
                iArr[c1.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38966a[c1.f38983em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38966a[c1.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38966a[c1.f38984in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38966a[c1.f38982cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38966a[c1.f38985mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38966a[c1.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38966a[c1.f38986pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f38966a[c1.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static class a0 extends z {
        @Override // com.caverock.androidsvg.SVG.z, com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "polygon";
        }
    }

    public interface a1 {
    }

    public static class b0 extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f38971o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f38972p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f38973q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f38974r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f38975s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f38976t;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "rect";
        }
    }

    public static class b1 extends m0 implements w0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f38977c;

        @Override // com.caverock.androidsvg.SVG.w0
        public final a1 getTextRoot() {
            return null;
        }

        public final String toString() {
            return ad.d.f(new StringBuilder("TextChild: '"), this.f38977c, "'");
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f38978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p f38979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p f38980c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p f38981d;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c1 {
        private static final /* synthetic */ c1[] $VALUES;

        /* JADX INFO: renamed from: cm, reason: collision with root package name */
        public static final c1 f38982cm;

        /* JADX INFO: renamed from: em, reason: collision with root package name */
        public static final c1 f38983em;
        public static final c1 ex;

        /* JADX INFO: renamed from: in, reason: collision with root package name */
        public static final c1 f38984in;

        /* JADX INFO: renamed from: mm, reason: collision with root package name */
        public static final c1 f38985mm;

        /* JADX INFO: renamed from: pc, reason: collision with root package name */
        public static final c1 f38986pc;
        public static final c1 percent;
        public static final c1 pt;
        public static final c1 px;

        static {
            c1 c1Var = new c1("px", 0);
            px = c1Var;
            c1 c1Var2 = new c1("em", 1);
            f38983em = c1Var2;
            c1 c1Var3 = new c1("ex", 2);
            ex = c1Var3;
            c1 c1Var4 = new c1("in", 3);
            f38984in = c1Var4;
            c1 c1Var5 = new c1("cm", 4);
            f38982cm = c1Var5;
            c1 c1Var6 = new c1("mm", 5);
            f38985mm = c1Var6;
            c1 c1Var7 = new c1(DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT, 6);
            pt = c1Var7;
            c1 c1Var8 = new c1("pc", 7);
            f38986pc = c1Var8;
            c1 c1Var9 = new c1("percent", 8);
            percent = c1Var9;
            $VALUES = new c1[]{c1Var, c1Var2, c1Var3, c1Var4, c1Var5, c1Var6, c1Var7, c1Var8, c1Var9};
        }

        public c1() {
            throw null;
        }

        public static c1 valueOf(String str) {
            return (c1) Enum.valueOf(c1.class, str);
        }

        public static c1[] values() {
            return (c1[]) $VALUES.clone();
        }
    }

    public static class d extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f38987o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f38988p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f38989q;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "circle";
        }
    }

    public static class d1 extends m {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f38991p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f38992q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f38993r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f38994s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f38995t;

        @Override // com.caverock.androidsvg.SVG.m, com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "use";
        }
    }

    public static class e extends m implements t {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f38996p;

        @Override // com.caverock.androidsvg.SVG.m, com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "clipPath";
        }
    }

    public static class e0 extends q0 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f38997q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f38998r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f38999s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f39000t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f39001u;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "svg";
        }
    }

    public static class e1 extends q0 implements t {
        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "view";
        }
    }

    public static class f extends n0 {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final f f39002q0 = new f(ViewCompat.MEASURED_STATE_MASK);

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final f f39003r0 = new f(0);

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f39004p0;

        public f(int i10) {
            this.f39004p0 = i10;
        }

        public final String toString() {
            return String.format("#%08x", Integer.valueOf(this.f39004p0));
        }
    }

    public interface f0 {
        void a(HashSet hashSet);

        void b(HashSet hashSet);

        void d(HashSet hashSet);

        void e(HashSet hashSet);

        String getRequiredExtensions();

        Set<String> getRequiredFeatures();

        Set<String> getRequiredFonts();

        Set<String> getRequiredFormats();

        Set<String> getSystemLanguage();

        void setRequiredExtensions(String str);
    }

    public static class g extends n0 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f39005p0 = new g();
    }

    public static class h extends m implements t {
        @Override // com.caverock.androidsvg.SVG.m, com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "defs";
        }
    }

    public static abstract class h0 extends j0 implements f0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Set<String> f39011i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f39012j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Set<String> f39013k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Set<String> f39014l = null;
        public Set<String> m = null;

        @Override // com.caverock.androidsvg.SVG.f0
        public final void a(HashSet hashSet) {
            this.f39011i = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final void b(HashSet hashSet) {
            this.f39013k = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final void d(HashSet hashSet) {
            this.m = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final void e(HashSet hashSet) {
            this.f39014l = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final String getRequiredExtensions() {
            return this.f39012j;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final Set<String> getRequiredFeatures() {
            return this.f39011i;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final Set<String> getRequiredFonts() {
            return this.m;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final Set<String> getRequiredFormats() {
            return this.f39014l;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final Set<String> getSystemLanguage() {
            return this.f39013k;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final void setRequiredExtensions(String str) {
            this.f39012j = str;
        }
    }

    public static class i extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f39015o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f39016p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f39017q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f39018r;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "ellipse";
        }
    }

    public interface i0 {
        void c(m0 m0Var) throws SVGParseException;

        List<m0> getChildren();
    }

    public static abstract class j extends k0 implements i0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<m0> f39019h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Boolean f39020i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Matrix f39021j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public k f39022k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f39023l;

        @Override // com.caverock.androidsvg.SVG.i0
        public final void c(m0 m0Var) throws SVGParseException {
            if (m0Var instanceof d0) {
                this.f39019h.add(m0Var);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + m0Var + " elements.");
        }

        @Override // com.caverock.androidsvg.SVG.i0
        public final List<m0> getChildren() {
            return this.f39019h;
        }
    }

    public static abstract class j0 extends k0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b f39024h = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class k {
        private static final /* synthetic */ k[] $VALUES;
        public static final k pad;
        public static final k reflect;
        public static final k repeat;

        static {
            k kVar = new k("pad", 0);
            pad = kVar;
            k kVar2 = new k("reflect", 1);
            reflect = kVar2;
            k kVar3 = new k(VDPhotoSelfieCapture.LOG_TAG_REPEAT, 2);
            repeat = kVar3;
            $VALUES = new k[]{kVar, kVar2, kVar3};
        }

        public k() {
            throw null;
        }

        public static k valueOf(String str) {
            return (k) Enum.valueOf(k.class, str);
        }

        public static k[] values() {
            return (k[]) $VALUES.clone();
        }
    }

    public static abstract class k0 extends m0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f39025c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f39026d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Style f39027e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Style f39028f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList f39029g = null;

        public final String toString() {
            return f();
        }
    }

    public static abstract class l extends h0 implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Matrix f39030n;

        @Override // com.caverock.androidsvg.SVG.n
        public final void setTransform(Matrix matrix) {
            this.f39030n = matrix;
        }
    }

    public static class l0 extends j {
        public p m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p f39031n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f39032o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f39033p;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "linearGradient";
        }
    }

    public static class m extends g0 implements n {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Matrix f39034o;

        @Override // com.caverock.androidsvg.SVG.m0
        public String f() {
            return "group";
        }

        @Override // com.caverock.androidsvg.SVG.n
        public final void setTransform(Matrix matrix) {
            this.f39034o = matrix;
        }
    }

    public static class m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SVG f39035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i0 f39036b;

        public String f() {
            return "";
        }
    }

    public interface n {
        void setTransform(Matrix matrix);
    }

    public static abstract class n0 implements Cloneable {
    }

    public static class o extends o0 implements n {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f39037p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f39038q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f39039r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f39040s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f39041t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Matrix f39042u;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return AuthConstants.IMAGE;
        }

        @Override // com.caverock.androidsvg.SVG.n
        public final void setTransform(Matrix matrix) {
            this.f39042u = matrix;
        }
    }

    public static abstract class o0 extends g0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public PreserveAspectRatio f39043o = null;
    }

    public static class p0 extends j {
        public p m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p f39046n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f39047o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f39048p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f39049q;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "radialGradient";
        }
    }

    public static class q extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f39050o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f39051p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f39052q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f39053r;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "line";
        }
    }

    public static abstract class q0 extends o0 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public b f39054p;
    }

    public static class r extends q0 implements t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f39055q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f39056r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p f39057s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f39058t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public p f39059u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Float f39060v;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "marker";
        }
    }

    public static class r0 extends m {
        @Override // com.caverock.androidsvg.SVG.m, com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "switch";
        }
    }

    public static class s extends g0 implements t {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Boolean f39061o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f39062p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f39063q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p f39064r;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "mask";
        }
    }

    public static class s0 extends q0 implements t {
        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "symbol";
        }
    }

    public interface t {
    }

    public static class t0 extends x0 implements w0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f39065o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public a1 f39066p;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "tref";
        }

        @Override // com.caverock.androidsvg.SVG.w0
        public final a1 getTextRoot() {
            return this.f39066p;
        }
    }

    public static class u extends n0 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final String f39067p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final n0 f39068q0;

        public u(String str, n0 n0Var) {
            this.f39067p0 = str;
            this.f39068q0 = n0Var;
        }

        public final String toString() {
            return this.f39067p0 + " " + this.f39068q0;
        }
    }

    public static class u0 extends z0 implements w0 {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public a1 f39069s;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "tspan";
        }

        @Override // com.caverock.androidsvg.SVG.w0
        public final a1 getTextRoot() {
            return this.f39069s;
        }
    }

    public static class v extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public w f39070o;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "path";
        }
    }

    public static class v0 extends z0 implements a1, n {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Matrix f39071s;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "text";
        }

        @Override // com.caverock.androidsvg.SVG.n
        public final void setTransform(Matrix matrix) {
            this.f39071s = matrix;
        }
    }

    public static class w implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f39072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f39073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f39074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f39075d;

        public final void a(byte b10) {
            int i10 = this.f39073b;
            byte[] bArr = this.f39072a;
            if (i10 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f39072a = bArr2;
            }
            byte[] bArr3 = this.f39072a;
            int i11 = this.f39073b;
            this.f39073b = i11 + 1;
            bArr3[i11] = b10;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void arcTo(float f6, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
            a((byte) ((z10 ? 2 : 0) | 4 | (z11 ? 1 : 0)));
            b(5);
            float[] fArr = this.f39074c;
            int i10 = this.f39075d;
            fArr[i10] = f6;
            fArr[i10 + 1] = f10;
            fArr[i10 + 2] = f11;
            fArr[i10 + 3] = f12;
            this.f39075d = i10 + 5;
            fArr[i10 + 4] = f13;
        }

        public final void b(int i10) {
            float[] fArr = this.f39074c;
            if (fArr.length < this.f39075d + i10) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f39074c = fArr2;
            }
        }

        public final void c(x xVar) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f39073b; i11++) {
                byte b10 = this.f39072a[i11];
                if (b10 == 0) {
                    float[] fArr = this.f39074c;
                    int i12 = i10 + 1;
                    float f6 = fArr[i10];
                    i10 += 2;
                    xVar.moveTo(f6, fArr[i12]);
                } else if (b10 == 1) {
                    float[] fArr2 = this.f39074c;
                    int i13 = i10 + 1;
                    float f10 = fArr2[i10];
                    i10 += 2;
                    xVar.lineTo(f10, fArr2[i13]);
                } else if (b10 == 2) {
                    float[] fArr3 = this.f39074c;
                    float f11 = fArr3[i10];
                    float f12 = fArr3[i10 + 1];
                    float f13 = fArr3[i10 + 2];
                    float f14 = fArr3[i10 + 3];
                    int i14 = i10 + 5;
                    float f15 = fArr3[i10 + 4];
                    i10 += 6;
                    xVar.cubicTo(f11, f12, f13, f14, f15, fArr3[i14]);
                } else if (b10 == 3) {
                    float[] fArr4 = this.f39074c;
                    float f16 = fArr4[i10];
                    float f17 = fArr4[i10 + 1];
                    int i15 = i10 + 3;
                    float f18 = fArr4[i10 + 2];
                    i10 += 4;
                    xVar.quadTo(f16, f17, f18, fArr4[i15]);
                } else if (b10 != 8) {
                    boolean z10 = (b10 & 2) != 0;
                    boolean z11 = (b10 & 1) != 0;
                    float[] fArr5 = this.f39074c;
                    float f19 = fArr5[i10];
                    float f20 = fArr5[i10 + 1];
                    float f21 = fArr5[i10 + 2];
                    int i16 = i10 + 4;
                    float f22 = fArr5[i10 + 3];
                    i10 += 5;
                    xVar.arcTo(f19, f20, f21, z10, z11, f22, fArr5[i16]);
                } else {
                    xVar.close();
                }
            }
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void close() {
            a((byte) 8);
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void cubicTo(float f6, float f10, float f11, float f12, float f13, float f14) {
            a((byte) 2);
            b(6);
            float[] fArr = this.f39074c;
            int i10 = this.f39075d;
            fArr[i10] = f6;
            fArr[i10 + 1] = f10;
            fArr[i10 + 2] = f11;
            fArr[i10 + 3] = f12;
            fArr[i10 + 4] = f13;
            this.f39075d = i10 + 6;
            fArr[i10 + 5] = f14;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void lineTo(float f6, float f10) {
            a((byte) 1);
            b(2);
            float[] fArr = this.f39074c;
            int i10 = this.f39075d;
            fArr[i10] = f6;
            this.f39075d = i10 + 2;
            fArr[i10 + 1] = f10;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void moveTo(float f6, float f10) {
            a((byte) 0);
            b(2);
            float[] fArr = this.f39074c;
            int i10 = this.f39075d;
            fArr[i10] = f6;
            this.f39075d = i10 + 2;
            fArr[i10 + 1] = f10;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void quadTo(float f6, float f10, float f11, float f12) {
            a((byte) 3);
            b(4);
            float[] fArr = this.f39074c;
            int i10 = this.f39075d;
            fArr[i10] = f6;
            fArr[i10 + 1] = f10;
            fArr[i10 + 2] = f11;
            this.f39075d = i10 + 4;
            fArr[i10 + 3] = f12;
        }
    }

    public interface w0 {
        a1 getTextRoot();
    }

    public interface x {
        void arcTo(float f6, float f10, float f11, boolean z10, boolean z11, float f12, float f13);

        void close();

        void cubicTo(float f6, float f10, float f11, float f12, float f13, float f14);

        void lineTo(float f6, float f10);

        void moveTo(float f6, float f10);

        void quadTo(float f6, float f10, float f11, float f12);
    }

    public static abstract class x0 extends g0 {
        @Override // com.caverock.androidsvg.SVG.g0, com.caverock.androidsvg.SVG.i0
        public final void c(m0 m0Var) throws SVGParseException {
            if (m0Var instanceof w0) {
                this.f39006i.add(m0Var);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + m0Var + " elements.");
        }
    }

    public static class y extends q0 implements t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Boolean f39076q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Boolean f39077r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Matrix f39078s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p f39079t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public p f39080u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public p f39081v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public p f39082w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f39083x;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "pattern";
        }
    }

    public static class y0 extends x0 implements w0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f39084o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p f39085p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public a1 f39086q;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "textPath";
        }

        @Override // com.caverock.androidsvg.SVG.w0
        public final a1 getTextRoot() {
            return this.f39086q;
        }
    }

    public static class z extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float[] f39087o;

        @Override // com.caverock.androidsvg.SVG.m0
        public String f() {
            return "polyline";
        }
    }

    public static abstract class z0 extends x0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public ArrayList f39088o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public ArrayList f39089p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public ArrayList f39090q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public ArrayList f39091r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k0 b(i0 i0Var, String str) {
        k0 k0VarB;
        k0 k0Var = (k0) i0Var;
        if (str.equals(k0Var.f39025c)) {
            return k0Var;
        }
        for (Object obj : i0Var.getChildren()) {
            if (obj instanceof k0) {
                k0 k0Var2 = (k0) obj;
                if (str.equals(k0Var2.f39025c)) {
                    return k0Var2;
                }
                if ((obj instanceof i0) && (k0VarB = b((i0) obj, str)) != null) {
                    return k0VarB;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(ArrayList arrayList, m0 m0Var) {
        if (m0Var.f().equals("view")) {
            arrayList.add(m0Var);
        }
        if (m0Var instanceof i0) {
            Iterator<m0> it = ((i0) m0Var).getChildren().iterator();
            while (it.hasNext()) {
                d(arrayList, it.next());
            }
        }
    }

    public static void deregisterExternalFileResolver() {
        f38942g = null;
    }

    public static SVG getFromAsset(AssetManager assetManager, String str) throws IOException, SVGParseException {
        com.caverock.androidsvg.c cVar = new com.caverock.androidsvg.c();
        InputStream inputStreamOpen = assetManager.open(str);
        try {
            return cVar.g(inputStreamOpen, f38943h);
        } finally {
            try {
                inputStreamOpen.close();
            } catch (IOException unused) {
            }
        }
    }

    public static SVG getFromInputStream(InputStream inputStream) throws SVGParseException {
        return new com.caverock.androidsvg.c().g(inputStream, f38943h);
    }

    public static SVG getFromResource(Context context, int i10) throws SVGParseException {
        return getFromResource(context.getResources(), i10);
    }

    public static SVG getFromString(String str) throws SVGParseException {
        return new com.caverock.androidsvg.c().g(new ByteArrayInputStream(str.getBytes()), f38943h);
    }

    public static String getVersion() {
        return "1.4";
    }

    public static boolean isInternalEntitiesEnabled() {
        return f38943h;
    }

    public static void registerExternalFileResolver(SVGExternalFileResolver sVGExternalFileResolver) {
        f38942g = sVGExternalFileResolver;
    }

    public static void setInternalEntitiesEnabled(boolean z10) {
        f38943h = z10;
    }

    public final b a(float f6) {
        c1 c1Var;
        c1 c1Var2;
        c1 c1Var3;
        c1 c1Var4;
        float fA;
        c1 c1Var5;
        e0 e0Var = this.f38944a;
        p pVar = e0Var.f38999s;
        p pVar2 = e0Var.f39000t;
        if (pVar == null || pVar.g() || (c1Var2 = pVar.f39045q0) == (c1Var = c1.percent) || c1Var2 == (c1Var3 = c1.f38983em) || c1Var2 == (c1Var4 = c1.ex)) {
            return new b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fA2 = pVar.a(f6);
        if (pVar2 == null) {
            b bVar = this.f38944a.f39054p;
            fA = bVar != null ? (bVar.f38970d * fA2) / bVar.f38969c : fA2;
        } else {
            if (pVar2.g() || (c1Var5 = pVar2.f39045q0) == c1Var || c1Var5 == c1Var3 || c1Var5 == c1Var4) {
                return new b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fA = pVar2.a(f6);
        }
        return new b(0.0f, 0.0f, fA2, fA);
    }

    public final k0 c(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f38944a.f39025c)) {
            return this.f38944a;
        }
        HashMap map = this.f38949f;
        if (map.containsKey(str)) {
            return (k0) map.get(str);
        }
        k0 k0VarB = b(this.f38944a, str);
        map.put(str, k0VarB);
        return k0VarB;
    }

    public final k0 e(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String strReplace = str.replace("\\\n", "").replace(RootService.DELIMITER_A, RootService.LINE_BREAK);
        if (strReplace.length() <= 1 || !strReplace.startsWith("#")) {
            return null;
        }
        return c(strReplace.substring(1));
    }

    public float getDocumentAspectRatio() {
        c1 c1Var;
        e0 e0Var = this.f38944a;
        if (e0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        p pVar = e0Var.f38999s;
        p pVar2 = e0Var.f39000t;
        if (pVar != null && pVar2 != null && pVar.f39045q0 != (c1Var = c1.percent) && pVar2.f39045q0 != c1Var) {
            if (pVar.g() || pVar2.g()) {
                return -1.0f;
            }
            return pVar.a(this.f38947d) / pVar2.a(this.f38947d);
        }
        b bVar = e0Var.f39054p;
        if (bVar != null) {
            float f6 = bVar.f38969c;
            if (f6 != 0.0f) {
                float f10 = bVar.f38970d;
                if (f10 != 0.0f) {
                    return f6 / f10;
                }
            }
        }
        return -1.0f;
    }

    public String getDocumentDescription() {
        if (this.f38944a != null) {
            return this.f38946c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public float getDocumentHeight() {
        if (this.f38944a != null) {
            return a(this.f38947d).f38970d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public PreserveAspectRatio getDocumentPreserveAspectRatio() {
        e0 e0Var = this.f38944a;
        if (e0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        PreserveAspectRatio preserveAspectRatio = e0Var.f39043o;
        if (preserveAspectRatio == null) {
            return null;
        }
        return preserveAspectRatio;
    }

    public String getDocumentSVGVersion() {
        e0 e0Var = this.f38944a;
        if (e0Var != null) {
            return e0Var.f39001u;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public String getDocumentTitle() {
        if (this.f38944a != null) {
            return this.f38945b;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF getDocumentViewBox() {
        e0 e0Var = this.f38944a;
        if (e0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        b bVar = e0Var.f39054p;
        if (bVar == null) {
            return null;
        }
        bVar.getClass();
        return new RectF(bVar.f38967a, bVar.f38968b, bVar.a(), bVar.b());
    }

    public float getDocumentWidth() {
        if (this.f38944a != null) {
            return a(this.f38947d).f38969c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public float getRenderDPI() {
        return this.f38947d;
    }

    public Set<String> getViewList() {
        if (this.f38944a == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        ArrayList arrayList = new ArrayList();
        d(arrayList, this.f38944a);
        HashSet hashSet = new HashSet(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((e1) ((m0) it.next())).f39025c;
            if (str != null) {
                hashSet.add(str);
            } else {
                Log.w("AndroidSVG", "getViewList(): found a <view> without an id attribute");
            }
        }
        return hashSet;
    }

    public void renderToCanvas(Canvas canvas) {
        renderToCanvas(canvas, (RenderOptions) null);
    }

    public Picture renderToPicture() {
        return renderToPicture(null);
    }

    public void renderViewToCanvas(String str, Canvas canvas) {
        renderToCanvas(canvas, RenderOptions.create().view(str));
    }

    public Picture renderViewToPicture(String str, int i10, int i11) {
        RenderOptions renderOptions = new RenderOptions();
        renderOptions.view(str).viewPort(0.0f, 0.0f, i10, i11);
        Picture picture = new Picture();
        new com.caverock.androidsvg.b(picture.beginRecording(i10, i11), this.f38947d).I(this, renderOptions);
        picture.endRecording();
        return picture;
    }

    public void setDocumentHeight(float f6) {
        e0 e0Var = this.f38944a;
        if (e0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        e0Var.f39000t = new p(f6);
    }

    public void setDocumentPreserveAspectRatio(PreserveAspectRatio preserveAspectRatio) {
        e0 e0Var = this.f38944a;
        if (e0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        e0Var.f39043o = preserveAspectRatio;
    }

    public void setDocumentViewBox(float f6, float f10, float f11, float f12) {
        e0 e0Var = this.f38944a;
        if (e0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        e0Var.f39054p = new b(f6, f10, f11, f12);
    }

    public void setDocumentWidth(float f6) {
        e0 e0Var = this.f38944a;
        if (e0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        e0Var.f38999s = new p(f6);
    }

    public void setRenderDPI(float f6) {
        this.f38947d = f6;
    }

    public static SVG getFromResource(Resources resources, int i10) throws SVGParseException {
        com.caverock.androidsvg.c cVar = new com.caverock.androidsvg.c();
        InputStream inputStreamOpenRawResource = resources.openRawResource(i10);
        try {
            return cVar.g(inputStreamOpenRawResource, f38943h);
        } finally {
            try {
                inputStreamOpenRawResource.close();
            } catch (IOException unused) {
            }
        }
    }

    public void renderToCanvas(Canvas canvas, RectF rectF) {
        RenderOptions renderOptions = new RenderOptions();
        if (rectF != null) {
            renderOptions.viewPort(rectF.left, rectF.top, rectF.width(), rectF.height());
        } else {
            renderOptions.viewPort(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new com.caverock.androidsvg.b(canvas, this.f38947d).I(this, renderOptions);
    }

    public Picture renderToPicture(int i10, int i11) {
        return renderToPicture(i10, i11, null);
    }

    public void renderViewToCanvas(String str, Canvas canvas, RectF rectF) {
        RenderOptions renderOptionsView = RenderOptions.create().view(str);
        if (rectF != null) {
            renderOptionsView.viewPort(rectF.left, rectF.top, rectF.width(), rectF.height());
        }
        renderToCanvas(canvas, renderOptionsView);
    }

    public static class p implements Cloneable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final float f39044p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final c1 f39045q0;

        public p(float f6, c1 c1Var) {
            this.f39044p0 = f6;
            this.f39045q0 = c1Var;
        }

        public final float a(float f6) {
            float f10;
            float f11;
            int i10 = a.f38966a[this.f39045q0.ordinal()];
            float f12 = this.f39044p0;
            if (i10 == 1) {
                return f12;
            }
            switch (i10) {
                case 4:
                    return f12 * f6;
                case 5:
                    f10 = f12 * f6;
                    f11 = 2.54f;
                    break;
                case 6:
                    f10 = f12 * f6;
                    f11 = 25.4f;
                    break;
                case 7:
                    f10 = f12 * f6;
                    f11 = 72.0f;
                    break;
                case 8:
                    f10 = f12 * f6;
                    f11 = 6.0f;
                    break;
                default:
                    return f12;
            }
            return f10 / f11;
        }

        public final float b(com.caverock.androidsvg.b bVar) {
            float fSqrt;
            if (this.f39045q0 != c1.percent) {
                return d(bVar);
            }
            com.caverock.androidsvg.b.h hVar = bVar.f39135d;
            b bVar2 = hVar.f39174g;
            if (bVar2 == null) {
                bVar2 = hVar.f39173f;
            }
            float f6 = this.f39044p0;
            if (bVar2 == null) {
                return f6;
            }
            float f10 = bVar2.f38969c;
            float f11 = bVar2.f38970d;
            if (f10 == f11) {
                fSqrt = f6 * f10;
            } else {
                fSqrt = f6 * ((float) (Math.sqrt((f11 * f11) + (f10 * f10)) / 1.414213562373095d));
            }
            return fSqrt / 100.0f;
        }

        public final float c(com.caverock.androidsvg.b bVar, float f6) {
            return this.f39045q0 == c1.percent ? (this.f39044p0 * f6) / 100.0f : d(bVar);
        }

        public final float d(com.caverock.androidsvg.b bVar) {
            float f6;
            float f10;
            int i10 = a.f38966a[this.f39045q0.ordinal()];
            float f11 = this.f39044p0;
            switch (i10) {
                case 2:
                    return bVar.f39135d.f39171d.getTextSize() * f11;
                case 3:
                    return (bVar.f39135d.f39171d.getTextSize() / 2.0f) * f11;
                case 4:
                    return f11 * bVar.f39133b;
                case 5:
                    f6 = f11 * bVar.f39133b;
                    f10 = 2.54f;
                    break;
                case 6:
                    f6 = f11 * bVar.f39133b;
                    f10 = 25.4f;
                    break;
                case 7:
                    f6 = f11 * bVar.f39133b;
                    f10 = 72.0f;
                    break;
                case 8:
                    f6 = f11 * bVar.f39133b;
                    f10 = 6.0f;
                    break;
                case 9:
                    com.caverock.androidsvg.b.h hVar = bVar.f39135d;
                    b bVar2 = hVar.f39174g;
                    if (bVar2 == null) {
                        bVar2 = hVar.f39173f;
                    }
                    if (bVar2 == null) {
                        return f11;
                    }
                    f6 = f11 * bVar2.f38969c;
                    f10 = 100.0f;
                    break;
                default:
                    return f11;
            }
            return f6 / f10;
        }

        public final float e(com.caverock.androidsvg.b bVar) {
            if (this.f39045q0 != c1.percent) {
                return d(bVar);
            }
            com.caverock.androidsvg.b.h hVar = bVar.f39135d;
            b bVar2 = hVar.f39174g;
            if (bVar2 == null) {
                bVar2 = hVar.f39173f;
            }
            float f6 = this.f39044p0;
            return bVar2 == null ? f6 : (f6 * bVar2.f38970d) / 100.0f;
        }

        public final boolean f() {
            return this.f39044p0 < 0.0f;
        }

        public final boolean g() {
            return this.f39044p0 == 0.0f;
        }

        public final String toString() {
            return String.valueOf(this.f39044p0) + this.f39045q0;
        }

        public p(float f6) {
            this.f39044p0 = f6;
            this.f39045q0 = c1.px;
        }
    }

    public Picture renderToPicture(RenderOptions renderOptions) {
        p pVar;
        b bVar = (renderOptions == null || !renderOptions.hasViewBox()) ? this.f38944a.f39054p : renderOptions.f38939d;
        if (renderOptions != null && renderOptions.hasViewPort()) {
            return renderToPicture((int) Math.ceil(renderOptions.f38941f.a()), (int) Math.ceil(renderOptions.f38941f.b()), renderOptions);
        }
        e0 e0Var = this.f38944a;
        p pVar2 = e0Var.f38999s;
        if (pVar2 != null) {
            c1 c1Var = pVar2.f39045q0;
            c1 c1Var2 = c1.percent;
            if (c1Var != c1Var2 && (pVar = e0Var.f39000t) != null && pVar.f39045q0 != c1Var2) {
                return renderToPicture((int) Math.ceil(pVar2.a(this.f38947d)), (int) Math.ceil(this.f38944a.f39000t.a(this.f38947d)), renderOptions);
            }
        }
        if (pVar2 != null && bVar != null) {
            float fA = pVar2.a(this.f38947d);
            return renderToPicture((int) Math.ceil(fA), (int) Math.ceil((bVar.f38970d * fA) / bVar.f38969c), renderOptions);
        }
        p pVar3 = e0Var.f39000t;
        if (pVar3 != null && bVar != null) {
            float fA2 = pVar3.a(this.f38947d);
            return renderToPicture((int) Math.ceil((bVar.f38969c * fA2) / bVar.f38970d), (int) Math.ceil(fA2), renderOptions);
        }
        return renderToPicture(512, 512, renderOptions);
    }

    public void setDocumentHeight(String str) throws SVGParseException {
        e0 e0Var = this.f38944a;
        if (e0Var != null) {
            e0Var.f39000t = com.caverock.androidsvg.c.w(str);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public void setDocumentWidth(String str) throws SVGParseException {
        e0 e0Var = this.f38944a;
        if (e0Var != null) {
            e0Var.f38999s = com.caverock.androidsvg.c.w(str);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f38967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f38968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f38969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f38970d;

        public b(float f6, float f10, float f11, float f12) {
            this.f38967a = f6;
            this.f38968b = f10;
            this.f38969c = f11;
            this.f38970d = f12;
        }

        public final float a() {
            return this.f38967a + this.f38969c;
        }

        public final float b() {
            return this.f38968b + this.f38970d;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(Constant.BRACKET_OPEN);
            sb2.append(this.f38967a);
            sb2.append(" ");
            sb2.append(this.f38968b);
            sb2.append(" ");
            sb2.append(this.f38969c);
            sb2.append(" ");
            return androidx.camera.camera2.internal.l0.a(sb2, this.f38970d, Constant.BRACKET_CLOSE);
        }

        public b(b bVar) {
            this.f38967a = bVar.f38967a;
            this.f38968b = bVar.f38968b;
            this.f38969c = bVar.f38969c;
            this.f38970d = bVar.f38970d;
        }
    }

    public void renderToCanvas(Canvas canvas, RenderOptions renderOptions) {
        if (renderOptions == null) {
            renderOptions = new RenderOptions();
        }
        if (!renderOptions.hasViewPort()) {
            renderOptions.viewPort(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new com.caverock.androidsvg.b(canvas, this.f38947d).I(this, renderOptions);
    }

    public Picture renderToPicture(int i10, int i11, RenderOptions renderOptions) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i10, i11);
        if (renderOptions == null || renderOptions.f38941f == null) {
            renderOptions = renderOptions == null ? new RenderOptions() : new RenderOptions(renderOptions);
            renderOptions.viewPort(0.0f, 0.0f, i10, i11);
        }
        new com.caverock.androidsvg.b(canvasBeginRecording, this.f38947d).I(this, renderOptions);
        picture.endRecording();
        return picture;
    }

    public static class c0 extends k0 implements i0 {
        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "solidColor";
        }

        @Override // com.caverock.androidsvg.SVG.i0
        public final List<m0> getChildren() {
            return Collections.emptyList();
        }

        @Override // com.caverock.androidsvg.SVG.i0
        public final void c(m0 m0Var) {
        }
    }

    public static class d0 extends k0 implements i0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Float f38990h;

        @Override // com.caverock.androidsvg.SVG.m0
        public final String f() {
            return "stop";
        }

        @Override // com.caverock.androidsvg.SVG.i0
        public final List<m0> getChildren() {
            return Collections.emptyList();
        }

        @Override // com.caverock.androidsvg.SVG.i0
        public final void c(m0 m0Var) {
        }
    }

    public static abstract class g0 extends j0 implements i0, f0 {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Set<String> f39009l;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<m0> f39006i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Set<String> f39007j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f39008k = null;
        public Set<String> m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Set<String> f39010n = null;

        @Override // com.caverock.androidsvg.SVG.f0
        public final void a(HashSet hashSet) {
            this.f39007j = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.i0
        public void c(m0 m0Var) throws SVGParseException {
            this.f39006i.add(m0Var);
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final void d(HashSet hashSet) {
            this.f39010n = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final void e(HashSet hashSet) {
            this.m = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.i0
        public final List<m0> getChildren() {
            return this.f39006i;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final String getRequiredExtensions() {
            return this.f39008k;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final Set<String> getRequiredFeatures() {
            return this.f39007j;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final Set<String> getRequiredFonts() {
            return this.f39010n;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final Set<String> getRequiredFormats() {
            return this.m;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final Set<String> getSystemLanguage() {
            return null;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final void setRequiredExtensions(String str) {
            this.f39008k = str;
        }

        @Override // com.caverock.androidsvg.SVG.f0
        public final void b(HashSet hashSet) {
        }
    }
}
