package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.h0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.internal.view.SupportMenu;
import androidx.core.provider.FontsContractCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.tohu.android.core.response.Result;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.bea.xml.stream.MXParser;
import com.fasterxml.jackson.core.JsonPointer;
import com.mastercard.sonic.StatusCode;
import com.mastercard.sonic.androidsvg.CSSParser;
import com.mastercard.sonic.androidsvg.SVGParser;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import kotlinx.coroutines.DebugKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.simpleframework.xml.strategy.Name;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: SVGParser.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39185d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SVG f39182a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SVG.i0 f39183b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39184c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39186e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f39187f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public StringBuilder f39188g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f39189h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public StringBuilder f39190i = null;

    /* JADX INFO: compiled from: SVGParser.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f39192b;

        static {
            int[] iArr = new int[g.values().length];
            f39192b = iArr;
            try {
                iArr[g.f39200x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39192b[g.f39203y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39192b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39192b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39192b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39192b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39192b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39192b[g.f39198d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39192b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f39192b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f39192b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f39192b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f39192b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f39192b[g.f39199r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f39192b[g.f39201x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f39192b[g.f39204y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f39192b[g.f39202x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f39192b[g.f39205y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f39192b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f39192b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f39192b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f39192b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f39192b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f39192b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f39192b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f39192b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f39192b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f39192b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f39192b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f39192b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f39192b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f39192b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f39192b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f39192b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f39192b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f39192b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f39192b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f39192b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f39192b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f39192b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f39192b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f39192b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f39192b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f39192b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f39192b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f39192b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f39192b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f39192b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f39192b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f39192b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f39192b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f39192b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f39192b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f39192b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f39192b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f39192b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f39192b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f39192b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f39192b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f39192b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f39192b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f39192b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f39192b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f39192b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f39192b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f39192b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f39192b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f39192b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f39192b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f39192b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f39192b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f39192b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f39192b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f39192b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f39192b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f39192b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f39192b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f39192b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f39192b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f39192b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f39192b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f39192b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f39192b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f39192b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f39192b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f39192b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f39192b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f39192b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f39192b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            f39191a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f39191a[h.f39207g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f39191a[h.f39206a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f39191a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f39191a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f39191a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f39191a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f39191a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f39191a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f39191a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f39191a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f39191a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f39191a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f39191a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f39191a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f39191a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f39191a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f39191a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f39191a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f39191a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f39191a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f39191a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f39191a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f39191a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f39191a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f39191a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f39191a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f39191a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f39191a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f39191a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f39191a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    /* JADX INFO: compiled from: SVGParser.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap f39193a;

        static {
            HashMap map = new HashMap(10);
            f39193a = map;
            map.put("none", PreserveAspectRatio.Alignment.none);
            map.put("xMinYMin", PreserveAspectRatio.Alignment.xMinYMin);
            map.put("xMidYMin", PreserveAspectRatio.Alignment.xMidYMin);
            map.put("xMaxYMin", PreserveAspectRatio.Alignment.xMaxYMin);
            map.put("xMinYMid", PreserveAspectRatio.Alignment.xMinYMid);
            map.put("xMidYMid", PreserveAspectRatio.Alignment.xMidYMid);
            map.put("xMaxYMid", PreserveAspectRatio.Alignment.xMaxYMid);
            map.put("xMinYMax", PreserveAspectRatio.Alignment.xMinYMax);
            map.put("xMidYMax", PreserveAspectRatio.Alignment.xMidYMax);
            map.put("xMaxYMax", PreserveAspectRatio.Alignment.xMaxYMax);
        }
    }

    /* JADX INFO: renamed from: com.caverock.androidsvg.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SVGParser.java */
    public static class C0183c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap f39194a;

        static {
            HashMap map = new HashMap(47);
            f39194a = map;
            ad.e.f(-984833, map, "aliceblue", -332841, "antiquewhite");
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            ad.e.f(-983041, map, "azure", -657956, "beige");
            ad.e.f(-6972, map, "bisque", ViewCompat.MEASURED_STATE_MASK, "black");
            ad.e.f(-5171, map, "blanchedalmond", -16776961, "blue");
            ad.e.f(-7722014, map, "blueviolet", -5952982, "brown");
            ad.e.f(-2180985, map, "burlywood", -10510688, "cadetblue");
            ad.e.f(-8388864, map, "chartreuse", -2987746, "chocolate");
            ad.e.f(-32944, map, "coral", -10185235, "cornflowerblue");
            ad.e.f(-1828, map, "cornsilk", -2354116, "crimson");
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            ad.e.f(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            ad.e.f(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
            ad.e.f(-29696, map, "darkorange", -6737204, "darkorchid");
            ad.e.f(-7667712, map, "darkred", -1468806, "darksalmon");
            ad.e.f(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            ad.e.f(-60269, map, "deeppink", -16728065, "deepskyblue");
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            ad.e.f(-1296, map, "floralwhite", -14513374, "forestgreen");
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            ad.e.f(-460545, map, "ghostwhite", -10496, "gold");
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            ad.e.f(-16744448, map, "green", -5374161, "greenyellow");
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            ad.e.f(-38476, map, "hotpink", -3318692, "indianred");
            ad.e.f(-11861886, map, "indigo", -16, "ivory");
            ad.e.f(-989556, map, "khaki", -1644806, "lavender");
            ad.e.f(-3851, map, "lavenderblush", -8586240, "lawngreen");
            ad.e.f(-1331, map, "lemonchiffon", -5383962, "lightblue");
            ad.e.f(-1015680, map, "lightcoral", -2031617, "lightcyan");
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            ad.e.f(-18751, map, "lightpink", -24454, "lightsalmon");
            ad.e.f(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            ad.e.f(-16711936, map, "lime", -13447886, "limegreen");
            map.put("linen", -331546);
            map.put("magenta", -65281);
            ad.e.f(-8388608, map, "maroon", -10039894, "mediumaquamarine");
            ad.e.f(-16777011, map, "mediumblue", -4565549, "mediumorchid");
            ad.e.f(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
            ad.e.f(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
            ad.e.f(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
            ad.e.f(-15132304, map, "midnightblue", -655366, "mintcream");
            ad.e.f(-6943, map, "mistyrose", -6987, "moccasin");
            ad.e.f(-8531, map, "navajowhite", -16777088, "navy");
            ad.e.f(-133658, map, "oldlace", -8355840, "olive");
            ad.e.f(-9728477, map, "olivedrab", -23296, "orange");
            ad.e.f(-47872, map, "orangered", -2461482, "orchid");
            ad.e.f(-1120086, map, "palegoldenrod", -6751336, "palegreen");
            ad.e.f(-5247250, map, "paleturquoise", -2396013, "palevioletred");
            ad.e.f(-4139, map, "papayawhip", -9543, "peachpuff");
            ad.e.f(-3308225, map, "peru", -16181, "pink");
            ad.e.f(-2252579, map, "plum", -5185306, "powderblue");
            ad.e.f(-8388480, map, "purple", -10079335, "rebeccapurple");
            ad.e.f(SupportMenu.CATEGORY_MASK, map, "red", -4419697, "rosybrown");
            ad.e.f(-12490271, map, "royalblue", -7650029, "saddlebrown");
            ad.e.f(-360334, map, "salmon", -744352, "sandybrown");
            ad.e.f(-13726889, map, "seagreen", -2578, "seashell");
            ad.e.f(-6270419, map, "sienna", -4144960, "silver");
            ad.e.f(-7876885, map, "skyblue", -9807155, "slateblue");
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            ad.e.f(-12156236, map, "steelblue", -2968436, "tan");
            ad.e.f(-16744320, map, "teal", -2572328, "thistle");
            ad.e.f(-40121, map, "tomato", -12525360, "turquoise");
            ad.e.f(-1146130, map, "violet", -663885, "wheat");
            ad.e.f(-1, map, "white", -657931, "whitesmoke");
            ad.e.f(InputDeviceCompat.SOURCE_ANY, map, "yellow", -6632142, "yellowgreen");
            map.put("transparent", 0);
        }
    }

    /* JADX INFO: compiled from: SVGParser.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap f39195a;

        static {
            HashMap map = new HashMap(9);
            f39195a = map;
            SVG.c1 c1Var = SVG.c1.pt;
            map.put("xx-small", new SVG.p(0.694f, c1Var));
            map.put("x-small", new SVG.p(0.833f, c1Var));
            map.put("small", new SVG.p(10.0f, c1Var));
            map.put("medium", new SVG.p(12.0f, c1Var));
            map.put("large", new SVG.p(14.4f, c1Var));
            map.put("x-large", new SVG.p(17.3f, c1Var));
            map.put("xx-large", new SVG.p(20.7f, c1Var));
            SVG.c1 c1Var2 = SVG.c1.percent;
            map.put("smaller", new SVG.p(83.33f, c1Var2));
            map.put("larger", new SVG.p(120.0f, c1Var2));
        }
    }

    /* JADX INFO: compiled from: SVGParser.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap f39196a;

        static {
            HashMap map = new HashMap(13);
            f39196a = map;
            map.put("normal", 400);
            map.put("bold", 700);
            ad.e.f(1, map, "bolder", -1, "lighter");
            ad.e.f(100, map, "100", 200, Result.OK_RESPONSE_CODE);
            map.put("300", 300);
            map.put("400", 400);
            ad.e.f(500, map, Result.INTERNAL_ERROR_RESPONSE_CODE, 600, "600");
            map.put("700", 700);
            map.put("800", Integer.valueOf(StatusCode.SUCCESS));
            map.put("900", Integer.valueOf(TypedValues.Custom.TYPE_INT));
        }
    }

    /* JADX INFO: compiled from: SVGParser.java */
    public class f extends DefaultHandler2 {
        public f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void characters(char[] cArr, int i10, int i11) throws SAXException {
            c.this.K(new String(cArr, i10, i11));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endDocument() throws SAXException {
            c.this.getClass();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endElement(String str, String str2, String str3) throws SAXException {
            c.this.c(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void processingInstruction(String str, String str2) throws SAXException {
            i iVar = new i(str2);
            c cVar = c.this;
            cVar.getClass();
            cVar.d(str, c.C(iVar));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startDocument() throws SAXException {
            c cVar = c.this;
            cVar.getClass();
            cVar.f39182a = new SVG();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            c.this.I(str, str2, str3, attributes);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: SVGParser.java */
    public static final class g {
        public static final g CLASS = new g("CLASS", 0);
        public static final g clip = new g("clip", 1);
        public static final g clip_path = new g("clip_path", 2);
        public static final g clipPathUnits = new g("clipPathUnits", 3);
        public static final g clip_rule = new g("clip_rule", 4);
        public static final g color = new g("color", 5);
        public static final g cx = new g("cx", 6);
        public static final g cy = new g("cy", 7);
        public static final g direction = new g("direction", 8);
        public static final g dx = new g("dx", 9);
        public static final g dy = new g("dy", 10);
        public static final g fx = new g("fx", 11);
        public static final g fy = new g("fy", 12);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final g f39198d = new g("d", 13);
        public static final g display = new g("display", 14);
        public static final g fill = new g("fill", 15);
        public static final g fill_rule = new g("fill_rule", 16);
        public static final g fill_opacity = new g("fill_opacity", 17);
        public static final g font = new g("font", 18);
        public static final g font_family = new g("font_family", 19);
        public static final g font_size = new g("font_size", 20);
        public static final g font_weight = new g(FontsContractCompat.Columns.WEIGHT, 21);
        public static final g font_style = new g("font_style", 22);
        public static final g gradientTransform = new g("gradientTransform", 23);
        public static final g gradientUnits = new g("gradientUnits", 24);
        public static final g height = new g("height", 25);
        public static final g href = new g(SVGParser.XML_STYLESHEET_ATTR_HREF, 26);
        public static final g image_rendering = new g("image_rendering", 27);
        public static final g marker = new g("marker", 28);
        public static final g marker_start = new g("marker_start", 29);
        public static final g marker_mid = new g("marker_mid", 30);
        public static final g marker_end = new g("marker_end", 31);
        public static final g markerHeight = new g("markerHeight", 32);
        public static final g markerUnits = new g("markerUnits", 33);
        public static final g markerWidth = new g("markerWidth", 34);
        public static final g mask = new g("mask", 35);
        public static final g maskContentUnits = new g("maskContentUnits", 36);
        public static final g maskUnits = new g("maskUnits", 37);
        public static final g media = new g(SVGParser.XML_STYLESHEET_ATTR_MEDIA, 38);
        public static final g offset = new g(TypedValues.CycleType.S_WAVE_OFFSET, 39);
        public static final g opacity = new g("opacity", 40);
        public static final g orient = new g("orient", 41);
        public static final g overflow = new g("overflow", 42);
        public static final g pathLength = new g("pathLength", 43);
        public static final g patternContentUnits = new g("patternContentUnits", 44);
        public static final g patternTransform = new g("patternTransform", 45);
        public static final g patternUnits = new g("patternUnits", 46);
        public static final g points = new g("points", 47);
        public static final g preserveAspectRatio = new g("preserveAspectRatio", 48);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final g f39199r = new g("r", 49);
        public static final g refX = new g("refX", 50);
        public static final g refY = new g("refY", 51);
        public static final g requiredFeatures = new g("requiredFeatures", 52);
        public static final g requiredExtensions = new g("requiredExtensions", 53);
        public static final g requiredFormats = new g("requiredFormats", 54);
        public static final g requiredFonts = new g("requiredFonts", 55);
        public static final g rx = new g("rx", 56);
        public static final g ry = new g("ry", 57);
        public static final g solid_color = new g("solid_color", 58);
        public static final g solid_opacity = new g("solid_opacity", 59);
        public static final g spreadMethod = new g("spreadMethod", 60);
        public static final g startOffset = new g("startOffset", 61);
        public static final g stop_color = new g("stop_color", 62);
        public static final g stop_opacity = new g("stop_opacity", 63);
        public static final g stroke = new g("stroke", 64);
        public static final g stroke_dasharray = new g("stroke_dasharray", 65);
        public static final g stroke_dashoffset = new g("stroke_dashoffset", 66);
        public static final g stroke_linecap = new g("stroke_linecap", 67);
        public static final g stroke_linejoin = new g("stroke_linejoin", 68);
        public static final g stroke_miterlimit = new g("stroke_miterlimit", 69);
        public static final g stroke_opacity = new g("stroke_opacity", 70);
        public static final g stroke_width = new g("stroke_width", 71);
        public static final g style = new g("style", 72);
        public static final g systemLanguage = new g("systemLanguage", 73);
        public static final g text_anchor = new g("text_anchor", 74);
        public static final g text_decoration = new g("text_decoration", 75);
        public static final g transform = new g("transform", 76);
        public static final g type = new g("type", 77);
        public static final g vector_effect = new g("vector_effect", 78);
        public static final g version = new g("version", 79);
        public static final g viewBox = new g("viewBox", 80);
        public static final g width = new g("width", 81);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final g f39200x = new g("x", 82);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final g f39203y = new g("y", 83);

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        public static final g f39201x1 = new g("x1", 84);

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        public static final g f39204y1 = new g("y1", 85);

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public static final g f39202x2 = new g("x2", 86);

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        public static final g f39205y2 = new g("y2", 87);
        public static final g viewport_fill = new g("viewport_fill", 88);
        public static final g viewport_fill_opacity = new g("viewport_fill_opacity", 89);
        public static final g visibility = new g("visibility", 90);
        public static final g UNSUPPORTED = new g("UNSUPPORTED", 91);
        private static final /* synthetic */ g[] $VALUES = {CLASS, clip, clip_path, clipPathUnits, clip_rule, color, cx, cy, direction, dx, dy, fx, fy, f39198d, display, fill, fill_rule, fill_opacity, font, font_family, font_size, font_weight, font_style, gradientTransform, gradientUnits, height, href, image_rendering, marker, marker_start, marker_mid, marker_end, markerHeight, markerUnits, markerWidth, mask, maskContentUnits, maskUnits, media, offset, opacity, orient, overflow, pathLength, patternContentUnits, patternTransform, patternUnits, points, preserveAspectRatio, f39199r, refX, refY, requiredFeatures, requiredExtensions, requiredFormats, requiredFonts, rx, ry, solid_color, solid_opacity, spreadMethod, startOffset, stop_color, stop_opacity, stroke, stroke_dasharray, stroke_dashoffset, stroke_linecap, stroke_linejoin, stroke_miterlimit, stroke_opacity, stroke_width, style, systemLanguage, text_anchor, text_decoration, transform, type, vector_effect, version, viewBox, width, f39200x, f39203y, f39201x1, f39204y1, f39202x2, f39205y2, viewport_fill, viewport_fill_opacity, visibility, UNSUPPORTED};
        private static final Map<String, g> cache = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    cache.put(Name.LABEL, gVar);
                } else {
                    if (gVar != UNSUPPORTED) {
                        cache.put(gVar.name().replace('_', '-'), gVar);
                    }
                }
            }
        }

        public g() {
            throw null;
        }

        public static g a(String str) {
            g gVar = cache.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: SVGParser.java */
    public static final class h {
        private static final /* synthetic */ h[] $VALUES;
        public static final h SWITCH;
        public static final h UNSUPPORTED;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f39206a;
        private static final Map<String, h> cache;
        public static final h circle;
        public static final h clipPath;
        public static final h defs;
        public static final h desc;
        public static final h ellipse;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final h f39207g;
        public static final h image;
        public static final h line;
        public static final h linearGradient;
        public static final h marker;
        public static final h mask;
        public static final h path;
        public static final h pattern;
        public static final h polygon;
        public static final h polyline;
        public static final h radialGradient;
        public static final h rect;
        public static final h solidColor;
        public static final h stop;
        public static final h style;
        public static final h svg;
        public static final h symbol;
        public static final h text;
        public static final h textPath;
        public static final h title;
        public static final h tref;
        public static final h tspan;
        public static final h use;
        public static final h view;

        static {
            h hVar = new h("svg", 0);
            svg = hVar;
            h hVar2 = new h("a", 1);
            f39206a = hVar2;
            h hVar3 = new h("circle", 2);
            circle = hVar3;
            h hVar4 = new h("clipPath", 3);
            clipPath = hVar4;
            h hVar5 = new h("defs", 4);
            defs = hVar5;
            h hVar6 = new h("desc", 5);
            desc = hVar6;
            h hVar7 = new h("ellipse", 6);
            ellipse = hVar7;
            h hVar8 = new h("g", 7);
            f39207g = hVar8;
            h hVar9 = new h(AuthConstants.IMAGE, 8);
            image = hVar9;
            h hVar10 = new h("line", 9);
            line = hVar10;
            h hVar11 = new h("linearGradient", 10);
            linearGradient = hVar11;
            h hVar12 = new h("marker", 11);
            marker = hVar12;
            h hVar13 = new h("mask", 12);
            mask = hVar13;
            h hVar14 = new h("path", 13);
            path = hVar14;
            h hVar15 = new h("pattern", 14);
            pattern = hVar15;
            h hVar16 = new h("polygon", 15);
            polygon = hVar16;
            h hVar17 = new h("polyline", 16);
            polyline = hVar17;
            h hVar18 = new h("radialGradient", 17);
            radialGradient = hVar18;
            h hVar19 = new h("rect", 18);
            rect = hVar19;
            h hVar20 = new h("solidColor", 19);
            solidColor = hVar20;
            h hVar21 = new h("stop", 20);
            stop = hVar21;
            h hVar22 = new h("style", 21);
            style = hVar22;
            h hVar23 = new h("SWITCH", 22);
            SWITCH = hVar23;
            h hVar24 = new h("symbol", 23);
            symbol = hVar24;
            h hVar25 = new h("text", 24);
            text = hVar25;
            h hVar26 = new h("textPath", 25);
            textPath = hVar26;
            h hVar27 = new h("title", 26);
            title = hVar27;
            h hVar28 = new h("tref", 27);
            tref = hVar28;
            h hVar29 = new h("tspan", 28);
            tspan = hVar29;
            h hVar30 = new h("use", 29);
            use = hVar30;
            h hVar31 = new h("view", 30);
            view = hVar31;
            h hVar32 = new h("UNSUPPORTED", 31);
            UNSUPPORTED = hVar32;
            $VALUES = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14, hVar15, hVar16, hVar17, hVar18, hVar19, hVar20, hVar21, hVar22, hVar23, hVar24, hVar25, hVar26, hVar27, hVar28, hVar29, hVar30, hVar31, hVar32};
            cache = new HashMap();
            for (h hVar33 : values()) {
                if (hVar33 == SWITCH) {
                    cache.put("switch", hVar33);
                } else if (hVar33 != UNSUPPORTED) {
                    cache.put(hVar33.name(), hVar33);
                }
            }
        }

        public h() {
            throw null;
        }

        public static h a(String str) {
            h hVar = cache.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: SVGParser.java */
    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39208a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f39210c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f39209b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ad.c f39211d = new ad.c();

        public i(String str) {
            this.f39210c = 0;
            String strTrim = str.trim();
            this.f39208a = strTrim;
            this.f39210c = strTrim.length();
        }

        public static boolean g(int i10) {
            return i10 == 32 || i10 == 10 || i10 == 13 || i10 == 9;
        }

        public final int a() {
            int i10 = this.f39209b;
            int i11 = this.f39210c;
            if (i10 == i11) {
                return -1;
            }
            int i12 = i10 + 1;
            this.f39209b = i12;
            if (i12 < i11) {
                return this.f39208a.charAt(i12);
            }
            return -1;
        }

        public final Boolean b(Object obj) {
            if (obj == null) {
                return null;
            }
            p();
            int i10 = this.f39209b;
            if (i10 == this.f39210c) {
                return null;
            }
            char cCharAt = this.f39208a.charAt(i10);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.f39209b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        public final float c(float f6) {
            if (Float.isNaN(f6)) {
                return Float.NaN;
            }
            p();
            return i();
        }

        public final boolean d(char c10) {
            int i10 = this.f39209b;
            boolean z10 = i10 < this.f39210c && this.f39208a.charAt(i10) == c10;
            if (z10) {
                this.f39209b++;
            }
            return z10;
        }

        public final boolean e(String str) {
            int length = str.length();
            int i10 = this.f39209b;
            boolean z10 = i10 <= this.f39210c - length && this.f39208a.substring(i10, i10 + length).equals(str);
            if (z10) {
                this.f39209b += length;
            }
            return z10;
        }

        public final boolean f() {
            return this.f39209b == this.f39210c;
        }

        public final Integer h() {
            int i10 = this.f39209b;
            if (i10 == this.f39210c) {
                return null;
            }
            this.f39209b = i10 + 1;
            return Integer.valueOf(this.f39208a.charAt(i10));
        }

        public final float i() {
            int i10 = this.f39209b;
            int i11 = this.f39210c;
            ad.c cVar = this.f39211d;
            float fA = cVar.a(this.f39208a, i10, i11);
            if (!Float.isNaN(fA)) {
                this.f39209b = cVar.f221a;
            }
            return fA;
        }

        public final SVG.p j() {
            float fI = i();
            if (Float.isNaN(fI)) {
                return null;
            }
            SVG.c1 c1VarN = n();
            return c1VarN == null ? new SVG.p(fI, SVG.c1.px) : new SVG.p(fI, c1VarN);
        }

        public final String k() {
            if (f()) {
                return null;
            }
            int i10 = this.f39209b;
            String str = this.f39208a;
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iA = a();
            while (iA != -1 && iA != cCharAt) {
                iA = a();
            }
            if (iA == -1) {
                this.f39209b = i10;
                return null;
            }
            int i11 = this.f39209b;
            this.f39209b = i11 + 1;
            return str.substring(i10 + 1, i11);
        }

        public final String l() {
            return m(' ', false);
        }

        public final String m(char c10, boolean z10) {
            if (f()) {
                return null;
            }
            int i10 = this.f39209b;
            String str = this.f39208a;
            char cCharAt = str.charAt(i10);
            if ((!z10 && g(cCharAt)) || cCharAt == c10) {
                return null;
            }
            int i11 = this.f39209b;
            int iA = a();
            while (iA != -1 && iA != c10 && (z10 || !g(iA))) {
                iA = a();
            }
            return str.substring(i11, this.f39209b);
        }

        public final SVG.c1 n() {
            if (f()) {
                return null;
            }
            int i10 = this.f39209b;
            String str = this.f39208a;
            if (str.charAt(i10) == '%') {
                this.f39209b++;
                return SVG.c1.percent;
            }
            int i11 = this.f39209b;
            if (i11 > this.f39210c - 2) {
                return null;
            }
            try {
                SVG.c1 c1VarValueOf = SVG.c1.valueOf(str.substring(i11, i11 + 2).toLowerCase(Locale.US));
                this.f39209b += 2;
                return c1VarValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final float o() {
            p();
            int i10 = this.f39209b;
            int i11 = this.f39210c;
            ad.c cVar = this.f39211d;
            float fA = cVar.a(this.f39208a, i10, i11);
            if (!Float.isNaN(fA)) {
                this.f39209b = cVar.f221a;
            }
            return fA;
        }

        public final boolean p() {
            q();
            int i10 = this.f39209b;
            if (i10 == this.f39210c || this.f39208a.charAt(i10) != ',') {
                return false;
            }
            this.f39209b++;
            q();
            return true;
        }

        public final void q() {
            while (true) {
                int i10 = this.f39209b;
                if (i10 >= this.f39210c || !g(this.f39208a.charAt(i10))) {
                    return;
                } else {
                    this.f39209b++;
                }
            }
        }
    }

    /* JADX INFO: compiled from: SVGParser.java */
    public class j implements Attributes {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public XmlPullParser f39212a;

        @Override // org.xml.sax.Attributes
        public final int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final int getLength() {
            return this.f39212a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public final String getLocalName(int i10) {
            return this.f39212a.getAttributeName(i10);
        }

        @Override // org.xml.sax.Attributes
        public final String getQName(int i10) {
            XmlPullParser xmlPullParser = this.f39212a;
            String attributeName = xmlPullParser.getAttributeName(i10);
            if (xmlPullParser.getAttributePrefix(i10) == null) {
                return attributeName;
            }
            return xmlPullParser.getAttributePrefix(i10) + AbstractJsonLexerKt.COLON + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(int i10) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getURI(int i10) {
            return this.f39212a.getAttributeNamespace(i10);
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(int i10) {
            return this.f39212a.getAttributeValue(i10);
        }
    }

    public static SVG.n0 A(String str) {
        if (!str.startsWith("url(")) {
            return q(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new SVG.u(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new SVG.u(strTrim, strTrim2.length() > 0 ? q(strTrim2) : null);
    }

    public static PreserveAspectRatio B(String str) throws SVGParseException {
        PreserveAspectRatio.Scale scale;
        i iVar = new i(str);
        iVar.q();
        String strL = iVar.l();
        if ("defer".equals(strL)) {
            iVar.q();
            strL = iVar.l();
        }
        PreserveAspectRatio.Alignment alignment = (PreserveAspectRatio.Alignment) b.f39193a.get(strL);
        iVar.q();
        if (iVar.f()) {
            scale = null;
        } else {
            String strL2 = iVar.l();
            strL2.getClass();
            if (strL2.equals("meet")) {
                scale = PreserveAspectRatio.Scale.meet;
            } else {
                if (!strL2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: ".concat(str));
                }
                scale = PreserveAspectRatio.Scale.slice;
            }
        }
        return new PreserveAspectRatio(alignment, scale);
    }

    public static HashMap C(i iVar) {
        HashMap map = new HashMap();
        iVar.q();
        String strM = iVar.m('=', false);
        while (strM != null) {
            iVar.d('=');
            map.put(strM, iVar.k());
            iVar.q();
            strM = iVar.m('=', false);
        }
        return map;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Matrix D(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        i iVar = new i(str);
        iVar.q();
        while (!iVar.f()) {
            String strSubstring = null;
            if (!iVar.f()) {
                int i10 = iVar.f39209b;
                String str2 = iVar.f39208a;
                int iCharAt = str2.charAt(i10);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = iVar.a();
                    }
                }
                int i11 = iVar.f39209b;
                while (i.g(iCharAt)) {
                    iCharAt = iVar.a();
                }
                if (iCharAt == 40) {
                    iVar.f39209b++;
                    strSubstring = str2.substring(i10, i11);
                } else {
                    iVar.f39209b = i10;
                }
            }
            if (strSubstring == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: ".concat(str));
            }
            byte b10 = -1;
            switch (strSubstring.hashCode()) {
                case -1081239615:
                    if (strSubstring.equals("matrix")) {
                        b10 = 0;
                    }
                    break;
                case -925180581:
                    if (strSubstring.equals("rotate")) {
                        b10 = 1;
                    }
                    break;
                case 109250890:
                    if (strSubstring.equals(ImageScaleTypeHandler.ID)) {
                        b10 = 2;
                    }
                    break;
                case 109493390:
                    if (strSubstring.equals("skewX")) {
                        b10 = 3;
                    }
                    break;
                case 109493391:
                    if (strSubstring.equals("skewY")) {
                        b10 = 4;
                    }
                    break;
                case 1052832078:
                    if (strSubstring.equals("translate")) {
                        b10 = 5;
                    }
                    break;
            }
            if (b10 == 0) {
                iVar.q();
                float fI = iVar.i();
                iVar.p();
                float fI2 = iVar.i();
                iVar.p();
                float fI3 = iVar.i();
                iVar.p();
                float fI4 = iVar.i();
                iVar.p();
                float fI5 = iVar.i();
                iVar.p();
                float fI6 = iVar.i();
                iVar.q();
                if (Float.isNaN(fI6) || !iVar.d(RootService.CLOSE_BRACKET)) {
                    throw new SVGParseException("Invalid transform list: ".concat(str));
                }
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{fI, fI3, fI5, fI2, fI4, fI6, 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
            } else if (b10 == 1) {
                iVar.q();
                float fI7 = iVar.i();
                float fO = iVar.o();
                float fO2 = iVar.o();
                iVar.q();
                if (Float.isNaN(fI7) || !iVar.d(RootService.CLOSE_BRACKET)) {
                    throw new SVGParseException("Invalid transform list: ".concat(str));
                }
                if (Float.isNaN(fO)) {
                    matrix.preRotate(fI7);
                } else {
                    if (Float.isNaN(fO2)) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    matrix.preRotate(fI7, fO, fO2);
                }
            } else if (b10 == 2) {
                iVar.q();
                float fI8 = iVar.i();
                float fO3 = iVar.o();
                iVar.q();
                if (Float.isNaN(fI8) || !iVar.d(RootService.CLOSE_BRACKET)) {
                    throw new SVGParseException("Invalid transform list: ".concat(str));
                }
                if (Float.isNaN(fO3)) {
                    matrix.preScale(fI8, fI8);
                } else {
                    matrix.preScale(fI8, fO3);
                }
            } else if (b10 == 3) {
                iVar.q();
                float fI9 = iVar.i();
                iVar.q();
                if (Float.isNaN(fI9) || !iVar.d(RootService.CLOSE_BRACKET)) {
                    throw new SVGParseException("Invalid transform list: ".concat(str));
                }
                matrix.preSkew((float) Math.tan(Math.toRadians(fI9)), 0.0f);
            } else if (b10 == 4) {
                iVar.q();
                float fI10 = iVar.i();
                iVar.q();
                if (Float.isNaN(fI10) || !iVar.d(RootService.CLOSE_BRACKET)) {
                    throw new SVGParseException("Invalid transform list: ".concat(str));
                }
                matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fI10)));
            } else {
                if (b10 != 5) {
                    throw new SVGParseException(h0.b("Invalid transform list fn: ", strSubstring, ")"));
                }
                iVar.q();
                float fI11 = iVar.i();
                float fO4 = iVar.o();
                iVar.q();
                if (Float.isNaN(fI11) || !iVar.d(RootService.CLOSE_BRACKET)) {
                    throw new SVGParseException("Invalid transform list: ".concat(str));
                }
                if (Float.isNaN(fO4)) {
                    matrix.preTranslate(fI11, 0.0f);
                } else {
                    matrix.preTranslate(fI11, fO4);
                }
            }
            if (iVar.f()) {
                return matrix;
            }
            iVar.p();
        }
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x029c  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:170:0x034f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0159  */
    public static void H(SVG.Style style, String str, String str2) {
        SVG.p pVarW;
        SVG.Style.LineCap lineCap;
        SVG.Style.LineJoin lineJoin;
        SVG.p pVarJ;
        SVG.p[] pVarArr;
        String strM;
        SVG.p pVarW2;
        String strSubstring;
        SVG.Style.TextDecoration textDecoration;
        SVG.Style.TextAnchor textAnchor;
        Boolean bool;
        SVG.c cVar;
        SVG.Style.RenderQuality renderQuality;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int i10 = a.f39192b[g.a(str).ordinal()];
        SVG.g gVar = SVG.g.f39005p0;
        try {
            switch (i10) {
                case 47:
                    SVG.n0 n0VarA = A(str2);
                    style.f38958q0 = n0VarA;
                    if (n0VarA != null) {
                        style.f38957p0 |= 1;
                    }
                    break;
                case 48:
                    SVG.Style.FillRule fillRule = "nonzero".equals(str2) ? SVG.Style.FillRule.NonZero : "evenodd".equals(str2) ? SVG.Style.FillRule.EvenOdd : null;
                    style.f38959r0 = fillRule;
                    if (fillRule != null) {
                        style.f38957p0 |= 2;
                    }
                    break;
                case 49:
                    Float fZ = z(str2);
                    style.f38960s0 = fZ;
                    if (fZ != null) {
                        style.f38957p0 |= 4;
                    }
                    break;
                case 50:
                    SVG.n0 n0VarA2 = A(str2);
                    style.f38961t0 = n0VarA2;
                    if (n0VarA2 != null) {
                        style.f38957p0 |= 8;
                    }
                    break;
                case 51:
                    Float fZ2 = z(str2);
                    style.f38962u0 = fZ2;
                    if (fZ2 != null) {
                        style.f38957p0 |= 16;
                    }
                    break;
                case 52:
                    style.v0 = w(str2);
                    style.f38957p0 |= 32;
                    break;
                case 53:
                    if ("butt".equals(str2)) {
                        lineCap = SVG.Style.LineCap.Butt;
                    } else if ("round".equals(str2)) {
                        lineCap = SVG.Style.LineCap.Round;
                    } else {
                        lineCap = "square".equals(str2) ? SVG.Style.LineCap.Square : null;
                    }
                    style.f38963w0 = lineCap;
                    if (lineCap != null) {
                        style.f38957p0 |= 64;
                    }
                    break;
                case 54:
                    if ("miter".equals(str2)) {
                        lineJoin = SVG.Style.LineJoin.Miter;
                    } else if ("round".equals(str2)) {
                        lineJoin = SVG.Style.LineJoin.Round;
                    } else {
                        lineJoin = "bevel".equals(str2) ? SVG.Style.LineJoin.Bevel : null;
                    }
                    style.f38964x0 = lineJoin;
                    if (lineJoin != null) {
                        style.f38957p0 |= 128;
                    }
                    break;
                case 55:
                    style.f38965y0 = Float.valueOf(s(str2));
                    style.f38957p0 |= 256;
                    break;
                case 56:
                    if (!"none".equals(str2)) {
                        i iVar = new i(str2);
                        iVar.q();
                        if (iVar.f() || (pVarJ = iVar.j()) == null || pVarJ.f()) {
                            pVarArr = null;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(pVarJ);
                            float f6 = pVarJ.f39044p0;
                            while (true) {
                                if (!iVar.f()) {
                                    iVar.p();
                                    SVG.p pVarJ2 = iVar.j();
                                    if (pVarJ2 != null && !pVarJ2.f()) {
                                        arrayList.add(pVarJ2);
                                        f6 += pVarJ2.f39044p0;
                                    }
                                } else if (f6 != 0.0f) {
                                    pVarArr = (SVG.p[]) arrayList.toArray(new SVG.p[arrayList.size()]);
                                }
                                pVarArr = null;
                            }
                        }
                        style.E0 = pVarArr;
                        if (pVarArr != null) {
                            style.f38957p0 |= 512;
                        }
                    } else {
                        style.E0 = null;
                        style.f38957p0 |= 512;
                    }
                    break;
                case 57:
                    style.F0 = w(str2);
                    style.f38957p0 |= 1024;
                    break;
                case 58:
                    style.G0 = z(str2);
                    style.f38957p0 |= SvgConstantsKt.SPECIFIED_OPACITY;
                    break;
                case 59:
                    style.H0 = p(str2);
                    style.f38957p0 |= SvgConstantsKt.SPECIFIED_COLOR;
                    break;
                case 60:
                    if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                        i iVar2 = new i(str2);
                        Integer num = null;
                        SVG.Style.FontStyle fontStyleU = null;
                        String str3 = null;
                        while (true) {
                            strM = iVar2.m(JsonPointer.SEPARATOR, false);
                            iVar2.q();
                            if (strM == null) {
                                break;
                            } else if (num == null || fontStyleU == null) {
                                if (!strM.equals("normal") && (num != null || (num = (Integer) e.f39196a.get(strM)) == null)) {
                                    if (fontStyleU != null || (fontStyleU = u(strM)) == null) {
                                        if (str3 == null && strM.equals("small-caps")) {
                                            str3 = strM;
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            pVarW2 = (SVG.p) d.f39195a.get(strM);
                            if (pVarW2 == null) {
                                pVarW2 = w(strM);
                            }
                        } catch (SVGParseException unused) {
                            pVarW2 = null;
                        }
                        if (iVar2.d(JsonPointer.SEPARATOR)) {
                            iVar2.q();
                            String strL = iVar2.l();
                            if (strL != null) {
                                w(strL);
                            }
                            iVar2.q();
                        }
                        if (iVar2.f()) {
                            strSubstring = null;
                        } else {
                            int i11 = iVar2.f39209b;
                            iVar2.f39209b = iVar2.f39210c;
                            strSubstring = iVar2.f39208a.substring(i11);
                        }
                        style.I0 = t(strSubstring);
                        style.J0 = pVarW2;
                        style.K0 = Integer.valueOf(num == null ? 400 : num.intValue());
                        if (fontStyleU == null) {
                            fontStyleU = SVG.Style.FontStyle.Normal;
                        }
                        style.L0 = fontStyleU;
                        style.f38957p0 |= 122880;
                        break;
                    }
                    break;
                case 61:
                    ArrayList arrayListT = t(str2);
                    style.I0 = arrayListT;
                    if (arrayListT != null) {
                        style.f38957p0 |= SvgConstantsKt.SPECIFIED_FONT_FAMILY;
                    }
                    break;
                case 62:
                    try {
                        SVG.p pVar = (SVG.p) d.f39195a.get(str2);
                        pVarW = pVar == null ? w(str2) : pVar;
                    } catch (SVGParseException unused2) {
                        pVarW = null;
                    }
                    style.J0 = pVarW;
                    if (pVarW != null) {
                        style.f38957p0 |= 16384;
                    }
                    break;
                case 63:
                    Integer num2 = (Integer) e.f39196a.get(str2);
                    style.K0 = num2;
                    if (num2 != null) {
                        style.f38957p0 |= SvgConstantsKt.SPECIFIED_FONT_WEIGHT;
                    }
                    break;
                case 64:
                    SVG.Style.FontStyle fontStyleU2 = u(str2);
                    style.L0 = fontStyleU2;
                    if (fontStyleU2 != null) {
                        style.f38957p0 |= SvgConstantsKt.SPECIFIED_FONT_STYLE;
                    }
                    break;
                case 65:
                    switch (str2) {
                        case "line-through":
                            textDecoration = SVG.Style.TextDecoration.LineThrough;
                            break;
                        case "underline":
                            textDecoration = SVG.Style.TextDecoration.Underline;
                            break;
                        case "none":
                            textDecoration = SVG.Style.TextDecoration.None;
                            break;
                        case "blink":
                            textDecoration = SVG.Style.TextDecoration.Blink;
                            break;
                        case "overline":
                            textDecoration = SVG.Style.TextDecoration.Overline;
                            break;
                        default:
                            textDecoration = null;
                            break;
                    }
                    style.M0 = textDecoration;
                    if (textDecoration != null) {
                        style.f38957p0 |= SvgConstantsKt.SPECIFIED_TEXT_DECORATION;
                    }
                    break;
                case 66:
                    SVG.Style.TextDirection textDirection = str2.equals("ltr") ? SVG.Style.TextDirection.LTR : !str2.equals("rtl") ? null : SVG.Style.TextDirection.RTL;
                    style.N0 = textDirection;
                    if (textDirection != null) {
                        style.f38957p0 |= SvgConstantsKt.SPECIFIED_DIRECTION;
                    }
                    break;
                case 67:
                    switch (str2) {
                        case "middle":
                            textAnchor = SVG.Style.TextAnchor.Middle;
                            break;
                        case "end":
                            textAnchor = SVG.Style.TextAnchor.End;
                            break;
                        case "start":
                            textAnchor = SVG.Style.TextAnchor.Start;
                            break;
                        default:
                            textAnchor = null;
                            break;
                    }
                    style.O0 = textAnchor;
                    if (textAnchor != null) {
                        style.f38957p0 |= SvgConstantsKt.SPECIFIED_TEXT_ANCHOR;
                    }
                    break;
                case 68:
                    switch (str2) {
                        case "hidden":
                        case "scroll":
                            bool = Boolean.FALSE;
                            break;
                        case "auto":
                        case "visible":
                            bool = Boolean.TRUE;
                            break;
                        default:
                            bool = null;
                            break;
                    }
                    style.P0 = bool;
                    if (bool != null) {
                        style.f38957p0 |= SvgConstantsKt.SPECIFIED_OVERFLOW;
                    }
                    break;
                case 69:
                    String strV = v(str2);
                    style.R0 = strV;
                    style.S0 = strV;
                    style.T0 = strV;
                    style.f38957p0 |= 14680064;
                    break;
                case 70:
                    style.R0 = v(str2);
                    style.f38957p0 |= SvgConstantsKt.SPECIFIED_MARKER_START;
                    break;
                case 71:
                    style.S0 = v(str2);
                    style.f38957p0 |= SvgConstantsKt.SPECIFIED_MARKER_MID;
                    break;
                case 72:
                    style.T0 = v(str2);
                    style.f38957p0 |= SvgConstantsKt.SPECIFIED_MARKER_END;
                    break;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                            style.U0 = Boolean.valueOf(!str2.equals("none"));
                            style.f38957p0 |= SvgConstantsKt.SPECIFIED_DISPLAY;
                            break;
                        }
                    }
                    break;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                            style.V0 = Boolean.valueOf(str2.equals("visible"));
                            style.f38957p0 |= SvgConstantsKt.SPECIFIED_VISIBILITY;
                            break;
                        }
                    }
                    break;
                case 75:
                    if (str2.equals("currentColor")) {
                        style.W0 = gVar;
                    } else {
                        try {
                            style.W0 = p(str2);
                        } catch (SVGParseException e5) {
                            Log.w("SVGParser", e5.getMessage());
                            return;
                        }
                    }
                    style.f38957p0 |= SvgConstantsKt.SPECIFIED_STOP_COLOR;
                    break;
                case 76:
                    style.X0 = z(str2);
                    style.f38957p0 |= SvgConstantsKt.SPECIFIED_STOP_OPACITY;
                    break;
                case 77:
                    if (!DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str2) && str2.startsWith("rect(")) {
                        i iVar3 = new i(str2.substring(5));
                        iVar3.q();
                        SVG.p pVarY = y(iVar3);
                        iVar3.p();
                        SVG.p pVarY2 = y(iVar3);
                        iVar3.p();
                        SVG.p pVarY3 = y(iVar3);
                        iVar3.p();
                        SVG.p pVarY4 = y(iVar3);
                        iVar3.q();
                        if (iVar3.d(RootService.CLOSE_BRACKET) || iVar3.f()) {
                            cVar = new SVG.c();
                            cVar.f38978a = pVarY;
                            cVar.f38979b = pVarY2;
                            cVar.f38980c = pVarY3;
                            cVar.f38981d = pVarY4;
                        } else {
                            cVar = null;
                        }
                    } else {
                        cVar = null;
                    }
                    style.Q0 = cVar;
                    if (cVar != null) {
                        style.f38957p0 |= 1048576;
                    }
                    break;
                case 78:
                    style.Y0 = v(str2);
                    style.f38957p0 |= SvgConstantsKt.SPECIFIED_CLIP_PATH;
                    break;
                case 79:
                    style.Z0 = "nonzero".equals(str2) ? SVG.Style.FillRule.NonZero : "evenodd".equals(str2) ? SVG.Style.FillRule.EvenOdd : null;
                    style.f38957p0 |= SvgConstantsKt.SPECIFIED_CLIP_RULE;
                    break;
                case 80:
                    style.f38950a1 = v(str2);
                    style.f38957p0 |= SvgConstantsKt.SPECIFIED_MASK;
                    break;
                case 81:
                    if (str2.equals("currentColor")) {
                        style.f38951b1 = gVar;
                    } else {
                        try {
                            style.f38951b1 = p(str2);
                        } catch (SVGParseException e7) {
                            Log.w("SVGParser", e7.getMessage());
                            return;
                        }
                    }
                    style.f38957p0 |= SvgConstantsKt.SPECIFIED_SOLID_COLOR;
                    break;
                case 82:
                    style.f38952c1 = z(str2);
                    style.f38957p0 |= SvgConstantsKt.SPECIFIED_SOLID_OPACITY;
                    break;
                case 83:
                    if (str2.equals("currentColor")) {
                        style.f38953d1 = gVar;
                    } else {
                        try {
                            style.f38953d1 = p(str2);
                        } catch (SVGParseException e10) {
                            Log.w("SVGParser", e10.getMessage());
                            return;
                        }
                    }
                    style.f38957p0 |= SvgConstantsKt.SPECIFIED_VIEWPORT_FILL;
                    break;
                case 84:
                    style.f38954e1 = z(str2);
                    style.f38957p0 |= SvgConstantsKt.SPECIFIED_VIEWPORT_FILL_OPACITY;
                    break;
                case 85:
                    SVG.Style.VectorEffect vectorEffect = str2.equals("none") ? SVG.Style.VectorEffect.None : !str2.equals("non-scaling-stroke") ? null : SVG.Style.VectorEffect.NonScalingStroke;
                    style.f38955f1 = vectorEffect;
                    if (vectorEffect != null) {
                        style.f38957p0 |= SvgConstantsKt.SPECIFIED_VECTOR_EFFECT;
                    }
                    break;
                case 86:
                    switch (str2) {
                        case "optimizeQuality":
                            renderQuality = SVG.Style.RenderQuality.optimizeQuality;
                            break;
                        case "auto":
                            renderQuality = SVG.Style.RenderQuality.auto;
                            break;
                        case "optimizeSpeed":
                            renderQuality = SVG.Style.RenderQuality.optimizeSpeed;
                            break;
                        default:
                            renderQuality = null;
                            break;
                    }
                    style.f38956g1 = renderQuality;
                    if (renderQuality != null) {
                        style.f38957p0 |= SvgConstantsKt.SPECIFIED_IMAGE_RENDERING;
                    }
                    break;
            }
        } catch (SVGParseException unused3) {
        }
    }

    public static int b(float f6) {
        if (f6 < 0.0f) {
            return 0;
        }
        if (f6 > 255.0f) {
            return 255;
        }
        return Math.round(f6);
    }

    public static int e(float f6, float f10, float f11) {
        float f12 = 0.0f;
        float f13 = f6 % 360.0f;
        if (f6 < 0.0f) {
            f13 += 360.0f;
        }
        float f14 = f13 / 60.0f;
        float f15 = f10 / 100.0f;
        float f16 = f11 / 100.0f;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        } else if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        if (f16 >= 0.0f) {
            f12 = f16 > 1.0f ? 1.0f : f16;
        }
        float f17 = f12 <= 0.5f ? (f15 + 1.0f) * f12 : (f12 + f15) - (f15 * f12);
        float f18 = (f12 * 2.0f) - f17;
        return b(f(f18, f17, f14 - 2.0f) * 256.0f) | (b(f(f18, f17, f14 + 2.0f) * 256.0f) << 16) | (b(f(f18, f17, f14) * 256.0f) << 8);
    }

    public static float f(float f6, float f10, float f11) {
        if (f11 < 0.0f) {
            f11 += 6.0f;
        }
        if (f11 >= 6.0f) {
            f11 -= 6.0f;
        }
        if (f11 < 1.0f) {
            return androidx.datastore.preferences.protobuf.e.a(f10, f6, f11, f6);
        }
        if (f11 < 3.0f) {
            return f10;
        }
        return f11 < 4.0f ? androidx.datastore.preferences.protobuf.e.a(4.0f, f11, f10 - f6, f6) : f6;
    }

    public static void h(SVG.f0 f0Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f39192b[ad.d.a(attributes, i10)]) {
                case 21:
                    i iVar = new i(strTrim);
                    HashSet hashSet = new HashSet();
                    while (!iVar.f()) {
                        String strL = iVar.l();
                        if (strL.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                            hashSet.add(strL.substring(35));
                        } else {
                            hashSet.add("UNSUPPORTED");
                        }
                        iVar.q();
                    }
                    f0Var.a(hashSet);
                    break;
                case 22:
                    f0Var.setRequiredExtensions(strTrim);
                    break;
                case 23:
                    i iVar2 = new i(strTrim);
                    HashSet hashSet2 = new HashSet();
                    while (!iVar2.f()) {
                        String strL2 = iVar2.l();
                        int iIndexOf = strL2.indexOf(45);
                        if (iIndexOf != -1) {
                            strL2 = strL2.substring(0, iIndexOf);
                        }
                        hashSet2.add(new Locale(strL2, "", "").getLanguage());
                        iVar2.q();
                    }
                    f0Var.b(hashSet2);
                    break;
                case 24:
                    i iVar3 = new i(strTrim);
                    HashSet hashSet3 = new HashSet();
                    while (!iVar3.f()) {
                        hashSet3.add(iVar3.l());
                        iVar3.q();
                    }
                    f0Var.e(hashSet3);
                    break;
                case 25:
                    ArrayList arrayListT = t(strTrim);
                    f0Var.d(arrayListT != null ? new HashSet(arrayListT) : new HashSet(0));
                    break;
            }
        }
    }

    public static void i(SVG.k0 k0Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String qName = attributes.getQName(i10);
            if (qName.equals("id") || qName.equals("xml:id")) {
                k0Var.f39025c = attributes.getValue(i10).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i10).trim();
                if ("default".equals(strTrim)) {
                    k0Var.f39026d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new SVGParseException(androidx.camera.core.processing.f.d("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    k0Var.f39026d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public static void j(SVG.j jVar, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f39192b[ad.d.a(attributes, i10)];
            if (i11 != 6) {
                switch (i11) {
                    case 32:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new SVGParseException("Invalid value for attribute gradientUnits");
                            }
                            jVar.f39020i = Boolean.TRUE;
                        } else {
                            jVar.f39020i = Boolean.FALSE;
                        }
                        break;
                    case 33:
                        jVar.f39021j = D(strTrim);
                        break;
                    case 34:
                        try {
                            jVar.f39022k = SVG.k.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new SVGParseException(h0.b("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                        }
                        break;
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                jVar.f39023l = strTrim;
            }
        }
    }

    public static void k(SVG.z zVar, Attributes attributes, String str) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.a(attributes.getLocalName(i10)) == g.points) {
                i iVar = new i(attributes.getValue(i10));
                ArrayList arrayList = new ArrayList();
                iVar.q();
                while (!iVar.f()) {
                    float fI = iVar.i();
                    if (Float.isNaN(fI)) {
                        throw new SVGParseException(h0.b("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    iVar.p();
                    float fI2 = iVar.i();
                    if (Float.isNaN(fI2)) {
                        throw new SVGParseException(h0.b("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    iVar.p();
                    arrayList.add(Float.valueOf(fI));
                    arrayList.add(Float.valueOf(fI2));
                }
                zVar.f39087o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    zVar.f39087o[i11] = ((Float) it.next()).floatValue();
                    i11++;
                }
            }
        }
    }

    public static void l(SVG.k0 k0Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (strTrim.length() != 0) {
                int i11 = a.f39192b[ad.d.a(attributes, i10)];
                if (i11 == 45) {
                    i iVar = new i(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strM = iVar.m(AbstractJsonLexerKt.COLON, false);
                        iVar.q();
                        if (!iVar.d(AbstractJsonLexerKt.COLON)) {
                            break;
                        }
                        iVar.q();
                        String strM2 = iVar.m(';', true);
                        if (strM2 == null) {
                            break;
                        }
                        iVar.q();
                        if (iVar.f() || iVar.d(';')) {
                            if (k0Var.f39028f == null) {
                                k0Var.f39028f = new SVG.Style();
                            }
                            H(k0Var.f39028f, strM, strM2);
                            iVar.q();
                        }
                    }
                } else if (i11 != 46) {
                    if (k0Var.f39027e == null) {
                        k0Var.f39027e = new SVG.Style();
                    }
                    H(k0Var.f39027e, attributes.getLocalName(i10), attributes.getValue(i10).trim());
                } else {
                    com.caverock.androidsvg.a.d dVar = new com.caverock.androidsvg.a.d(strTrim);
                    ArrayList arrayList = null;
                    while (!dVar.f()) {
                        String strL = dVar.l();
                        if (strL != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strL);
                            dVar.q();
                        }
                    }
                    k0Var.f39029g = arrayList;
                }
            }
        }
    }

    public static void m(SVG.z0 z0Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f39192b[ad.d.a(attributes, i10)];
            if (i11 == 1) {
                z0Var.f39088o = x(strTrim);
            } else if (i11 == 2) {
                z0Var.f39089p = x(strTrim);
            } else if (i11 == 19) {
                z0Var.f39090q = x(strTrim);
            } else if (i11 == 20) {
                z0Var.f39091r = x(strTrim);
            }
        }
    }

    public static void n(SVG.n nVar, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.a(attributes.getLocalName(i10)) == g.transform) {
                nVar.setTransform(D(attributes.getValue(i10)));
            }
        }
    }

    public static void o(SVG.q0 q0Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f39192b[ad.d.a(attributes, i10)];
            if (i11 == 7) {
                q0Var.f39043o = B(strTrim);
            } else if (i11 != 87) {
                continue;
            } else {
                i iVar = new i(strTrim);
                iVar.q();
                float fI = iVar.i();
                iVar.p();
                float fI2 = iVar.i();
                iVar.p();
                float fI3 = iVar.i();
                iVar.p();
                float fI4 = iVar.i();
                if (Float.isNaN(fI) || Float.isNaN(fI2) || Float.isNaN(fI3) || Float.isNaN(fI4)) {
                    throw new SVGParseException("Invalid viewBox definition - should have four numbers");
                }
                if (fI3 < 0.0f) {
                    throw new SVGParseException("Invalid viewBox. width cannot be negative");
                }
                if (fI4 < 0.0f) {
                    throw new SVGParseException("Invalid viewBox. height cannot be negative");
                }
                q0Var.f39054p = new SVG.b(fI, fI2, fI3, fI4);
            }
        }
    }

    public static SVG.f p(String str) throws SVGParseException {
        long j10;
        int i10;
        if (str.charAt(0) == '#') {
            int length = str.length();
            ad.b bVar = null;
            if (1 < length) {
                long j11 = 0;
                int i11 = 1;
                while (true) {
                    if (i11 < length) {
                        char cCharAt = str.charAt(i11);
                        if (cCharAt < '0' || cCharAt > '9') {
                            if (cCharAt >= 'A' && cCharAt <= 'F') {
                                j10 = j11 * 16;
                                i10 = cCharAt - 'A';
                            } else if (cCharAt >= 'a' && cCharAt <= 'f') {
                                j10 = j11 * 16;
                                i10 = cCharAt - 'a';
                            }
                            j11 = j10 + ((long) i10) + 10;
                        } else {
                            j11 = (j11 * 16) + ((long) (cCharAt - '0'));
                        }
                        if (j11 <= 4294967295L) {
                            i11++;
                        }
                    }
                    if (i11 != 1) {
                        bVar = new ad.b(j11, i11);
                    }
                }
            }
            if (bVar == null) {
                throw new SVGParseException("Bad hex colour value: ".concat(str));
            }
            long j12 = bVar.f218b;
            int i12 = bVar.f217a;
            if (i12 == 4) {
                int i13 = (int) j12;
                int i14 = i13 & 3840;
                int i15 = i13 & 240;
                int i16 = i13 & 15;
                return new SVG.f(i16 | (i14 << 8) | (-16777216) | (i14 << 12) | (i15 << 8) | (i15 << 4) | (i16 << 4));
            }
            if (i12 != 5) {
                if (i12 == 7) {
                    return new SVG.f(((int) j12) | ViewCompat.MEASURED_STATE_MASK);
                }
                if (i12 != 9) {
                    throw new SVGParseException("Bad hex colour value: ".concat(str));
                }
                int i17 = (int) j12;
                return new SVG.f((i17 >>> 8) | (i17 << 24));
            }
            int i18 = (int) j12;
            int i19 = 61440 & i18;
            int i20 = i18 & 3840;
            int i21 = i18 & 240;
            int i22 = i18 & 15;
            return new SVG.f((i22 << 24) | (i22 << 28) | (i19 << 8) | (i19 << 4) | (i20 << 4) | i20 | i21 | (i21 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            i iVar = new i(str.substring(zStartsWith ? 5 : 4));
            iVar.q();
            float fI = iVar.i();
            if (!Float.isNaN(fI) && iVar.d('%')) {
                fI = (fI * 256.0f) / 100.0f;
            }
            float fC = iVar.c(fI);
            if (!Float.isNaN(fC) && iVar.d('%')) {
                fC = (fC * 256.0f) / 100.0f;
            }
            float fC2 = iVar.c(fC);
            if (!Float.isNaN(fC2) && iVar.d('%')) {
                fC2 = (fC2 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                iVar.q();
                if (Float.isNaN(fC2) || !iVar.d(RootService.CLOSE_BRACKET)) {
                    throw new SVGParseException("Bad rgb() colour value: ".concat(str));
                }
                return new SVG.f((b(fI) << 16) | ViewCompat.MEASURED_STATE_MASK | (b(fC) << 8) | b(fC2));
            }
            float fC3 = iVar.c(fC2);
            iVar.q();
            if (Float.isNaN(fC3) || !iVar.d(RootService.CLOSE_BRACKET)) {
                throw new SVGParseException("Bad rgba() colour value: ".concat(str));
            }
            return new SVG.f((b(fC3 * 256.0f) << 24) | (b(fI) << 16) | (b(fC) << 8) | b(fC2));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) C0183c.f39194a.get(lowerCase);
            if (num != null) {
                return new SVG.f(num.intValue());
            }
            throw new SVGParseException("Invalid colour keyword: ".concat(lowerCase));
        }
        i iVar2 = new i(str.substring(zStartsWith2 ? 5 : 4));
        iVar2.q();
        float fI2 = iVar2.i();
        float fC4 = iVar2.c(fI2);
        if (!Float.isNaN(fC4)) {
            iVar2.d('%');
        }
        float fC5 = iVar2.c(fC4);
        if (!Float.isNaN(fC5)) {
            iVar2.d('%');
        }
        if (!zStartsWith2) {
            iVar2.q();
            if (Float.isNaN(fC5) || !iVar2.d(RootService.CLOSE_BRACKET)) {
                throw new SVGParseException("Bad hsl() colour value: ".concat(str));
            }
            return new SVG.f(e(fI2, fC4, fC5) | ViewCompat.MEASURED_STATE_MASK);
        }
        float fC6 = iVar2.c(fC5);
        iVar2.q();
        if (Float.isNaN(fC6) || !iVar2.d(RootService.CLOSE_BRACKET)) {
            throw new SVGParseException("Bad hsla() colour value: ".concat(str));
        }
        return new SVG.f((b(fC6 * 256.0f) << 24) | e(fI2, fC4, fC5));
    }

    public static SVG.n0 q(String str) {
        str.getClass();
        if (str.equals("none")) {
            return SVG.f.f39003r0;
        }
        if (str.equals("currentColor")) {
            return SVG.g.f39005p0;
        }
        try {
            return p(str);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static float r(int i10, String str) throws SVGParseException {
        float fA = new ad.c().a(str, 0, i10);
        if (Float.isNaN(fA)) {
            throw new SVGParseException(androidx.camera.core.processing.f.d("Invalid float value: ", str));
        }
        return fA;
    }

    public static float s(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return r(length, str);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    public static ArrayList t(String str) {
        i iVar = new i(str);
        ArrayList arrayList = null;
        do {
            String strK = iVar.k();
            if (strK == null) {
                strK = iVar.m(AbstractJsonLexerKt.COMMA, true);
            }
            if (strK == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strK);
            iVar.p();
        } while (!iVar.f());
        return arrayList;
    }

    public static SVG.Style.FontStyle u(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return SVG.Style.FontStyle.Oblique;
            case "italic":
                return SVG.Style.FontStyle.Italic;
            case "normal":
                return SVG.Style.FontStyle.Normal;
            default:
                return null;
        }
    }

    public static String v(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static SVG.p w(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length value (empty string)");
        }
        int length = str.length();
        SVG.c1 c1VarValueOf = SVG.c1.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            c1VarValueOf = SVG.c1.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                c1VarValueOf = SVG.c1.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new SVG.p(r(length, str), c1VarValueOf);
        } catch (NumberFormatException e5) {
            throw new SVGParseException("Invalid length value: ".concat(str), e5);
        }
    }

    public static ArrayList x(String str) throws SVGParseException {
        String str2;
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        i iVar = new i(str);
        iVar.q();
        while (!iVar.f()) {
            float fI = iVar.i();
            if (Float.isNaN(fI)) {
                StringBuilder sb2 = new StringBuilder("Invalid length list value: ");
                int i10 = iVar.f39209b;
                while (true) {
                    boolean zF = iVar.f();
                    str2 = iVar.f39208a;
                    if (zF || i.g(str2.charAt(iVar.f39209b))) {
                        break;
                    }
                    iVar.f39209b++;
                }
                String strSubstring = str2.substring(i10, iVar.f39209b);
                iVar.f39209b = i10;
                sb2.append(strSubstring);
                throw new SVGParseException(sb2.toString());
            }
            SVG.c1 c1VarN = iVar.n();
            if (c1VarN == null) {
                c1VarN = SVG.c1.px;
            }
            arrayList.add(new SVG.p(fI, c1VarN));
            iVar.p();
        }
        return arrayList;
    }

    public static SVG.p y(i iVar) {
        return iVar.e(DebugKt.DEBUG_PROPERTY_VALUE_AUTO) ? new SVG.p(0.0f) : iVar.j();
    }

    public static Float z(String str) {
        try {
            float fS = s(str);
            float f6 = 0.0f;
            if (fS < 0.0f) {
                fS = f6;
            } else {
                f6 = 1.0f;
                if (fS > 1.0f) {
                    fS = f6;
                }
            }
            return Float.valueOf(fS);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public final void E(InputStream inputStream) throws SVGParseException {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            f fVar = new f();
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e5) {
            throw new SVGParseException("Stream error", e5);
        } catch (ParserConfigurationException e7) {
            throw new SVGParseException("XML parser problem", e7);
        } catch (SAXException e10) {
            throw new SVGParseException("SVG parse error", e10);
        }
    }

    public final void F(InputStream inputStream, boolean z10) throws SVGParseException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                j jVar = new j();
                jVar.f39212a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature(MXParser.FEATURE_PROCESS_DOCDECL, false);
                xmlPullParserNewPullParser.setFeature(MXParser.FEATURE_PROCESS_NAMESPACES, true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        this.f39182a = new SVG();
                    } else if (eventType == 8) {
                        xmlPullParserNewPullParser.getText();
                        i iVar = new i(xmlPullParserNewPullParser.getText());
                        d(iVar.l(), C(iVar));
                    } else if (eventType == 10) {
                        if (z10 && this.f39182a.f38944a == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                inputStream.reset();
                                E(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + AbstractJsonLexerKt.COLON + name;
                        }
                        I(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, jVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + AbstractJsonLexerKt.COLON + name2;
                        }
                        c(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        J(iArr[0], xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[1]);
                    } else if (eventType == 5) {
                        K(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (IOException e5) {
                throw new SVGParseException("Stream error", e5);
            }
        } catch (XmlPullParserException e7) {
            throw new SVGParseException("XML parser problem", e7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x026b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0272  */
    /* JADX WARN: Code duplicated, block: B:145:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x0290 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final void G(Attributes attributes) throws SVGParseException {
        float fI;
        int i10;
        char cCharAt;
        if (this.f39183b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.v vVar = new SVG.v();
        vVar.f39035a = this.f39182a;
        vVar.f39036b = this.f39183b;
        i(vVar, attributes);
        l(vVar, attributes);
        n(vVar, attributes);
        h(vVar, attributes);
        int i11 = 0;
        int i12 = 0;
        while (i12 < attributes.getLength()) {
            String strTrim = attributes.getValue(i12).trim();
            int i13 = a.f39192b[ad.d.a(attributes, i12)];
            float f6 = 0.0f;
            if (i13 == 8) {
                i iVar = new i(strTrim);
                SVG.w wVar = new SVG.w();
                wVar.f39073b = i11;
                wVar.f39075d = i11;
                wVar.f39072a = new byte[8];
                wVar.f39074c = new float[16];
                if (!iVar.f()) {
                    int iIntValue = iVar.h().intValue();
                    int i14 = 109;
                    if (iIntValue == 77 || iIntValue == 109) {
                        float f10 = 0.0f;
                        float fI2 = 0.0f;
                        float f11 = 0.0f;
                        float fC = 0.0f;
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        while (true) {
                            iVar.q();
                            switch (iIntValue) {
                                case 65:
                                case 97:
                                    float fI3 = iVar.i();
                                    float fC2 = iVar.c(fI3);
                                    float fC3 = iVar.c(fC2);
                                    Boolean boolB = iVar.b(Float.valueOf(fC3));
                                    Boolean boolB2 = iVar.b(boolB);
                                    if (boolB2 == null) {
                                        fI = Float.NaN;
                                    } else {
                                        iVar.p();
                                        fI = iVar.i();
                                    }
                                    float fC4 = iVar.c(fI);
                                    if (!Float.isNaN(fC4) && fI3 >= f6 && fC2 >= f6) {
                                        if (iIntValue == 97) {
                                            fI += f10;
                                            fC4 += f11;
                                        }
                                        float f14 = fI;
                                        float f15 = fC4;
                                        wVar.arcTo(fI3, fC2, fC3, boolB.booleanValue(), boolB2.booleanValue(), f14, f15);
                                        f10 = f14;
                                        fI2 = f10;
                                        f11 = f15;
                                        fC = f11;
                                        iVar.p();
                                        if (iVar.f()) {
                                            i10 = iVar.f39209b;
                                            if (i10 != iVar.f39210c && (((cCharAt = iVar.f39208a.charAt(i10)) >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                                                iIntValue = iVar.h().intValue();
                                            }
                                            f6 = 0.0f;
                                            i14 = 109;
                                        }
                                    }
                                    break;
                                case 67:
                                case 99:
                                    float fI4 = iVar.i();
                                    float fC5 = iVar.c(fI4);
                                    float fC6 = iVar.c(fC5);
                                    float fC7 = iVar.c(fC6);
                                    float fC8 = iVar.c(fC7);
                                    float fC9 = iVar.c(fC8);
                                    if (!Float.isNaN(fC9)) {
                                        if (iIntValue == 99) {
                                            fC8 += f10;
                                            fC9 += f11;
                                            fI4 += f10;
                                            fC5 += f11;
                                            fC6 += f10;
                                            fC7 += f11;
                                        }
                                        float f16 = fC7;
                                        float f17 = fC8;
                                        float f18 = fC9;
                                        float f19 = fC6;
                                        wVar.cubicTo(fI4, fC5, f19, f16, f17, f18);
                                        f10 = f17;
                                        fI2 = f19;
                                        f11 = f18;
                                        fC = f16;
                                        iVar.p();
                                        if (iVar.f()) {
                                            i10 = iVar.f39209b;
                                            if (i10 != iVar.f39210c) {
                                                iIntValue = iVar.h().intValue();
                                            }
                                            f6 = 0.0f;
                                            i14 = 109;
                                        }
                                    }
                                    break;
                                case 72:
                                case 104:
                                    float fI5 = iVar.i();
                                    if (!Float.isNaN(fI5)) {
                                        if (iIntValue == 104) {
                                            fI5 += f10;
                                        }
                                        f10 = fI5;
                                        wVar.lineTo(f10, f11);
                                        fI2 = f10;
                                        iVar.p();
                                        if (iVar.f()) {
                                            i10 = iVar.f39209b;
                                            if (i10 != iVar.f39210c) {
                                                iIntValue = iVar.h().intValue();
                                            }
                                            f6 = 0.0f;
                                            i14 = 109;
                                        }
                                    }
                                    break;
                                case 76:
                                case 108:
                                    float fI6 = iVar.i();
                                    float fC10 = iVar.c(fI6);
                                    if (!Float.isNaN(fC10)) {
                                        if (iIntValue == 108) {
                                            fI6 += f10;
                                            fC10 += f11;
                                        }
                                        f10 = fI6;
                                        f11 = fC10;
                                        wVar.lineTo(f10, f11);
                                        fI2 = f10;
                                        fC = f11;
                                        iVar.p();
                                        if (iVar.f()) {
                                            i10 = iVar.f39209b;
                                            if (i10 != iVar.f39210c) {
                                                iIntValue = iVar.h().intValue();
                                            }
                                            f6 = 0.0f;
                                            i14 = 109;
                                        }
                                    }
                                    break;
                                case 77:
                                case 109:
                                    int i15 = i14;
                                    float fI7 = iVar.i();
                                    float fC11 = iVar.c(fI7);
                                    if (!Float.isNaN(fC11)) {
                                        if (iIntValue == i15 && wVar.f39073b != 0) {
                                            fI7 += f10;
                                            fC11 += f11;
                                        }
                                        f10 = fI7;
                                        f11 = fC11;
                                        wVar.moveTo(f10, f11);
                                        fI2 = f10;
                                        f12 = fI2;
                                        fC = f11;
                                        f13 = fC;
                                        iIntValue = iIntValue != i15 ? 76 : 108;
                                        iVar.p();
                                        if (iVar.f()) {
                                            i10 = iVar.f39209b;
                                            if (i10 != iVar.f39210c) {
                                                iIntValue = iVar.h().intValue();
                                            }
                                            f6 = 0.0f;
                                            i14 = 109;
                                        }
                                    }
                                    break;
                                case 81:
                                case 113:
                                    fI2 = iVar.i();
                                    fC = iVar.c(fI2);
                                    float fC12 = iVar.c(fC);
                                    float fC13 = iVar.c(fC12);
                                    if (!Float.isNaN(fC13)) {
                                        if (iIntValue == 113) {
                                            fC12 += f10;
                                            fC13 += f11;
                                            fI2 += f10;
                                            fC += f11;
                                        }
                                        f10 = fC12;
                                        f11 = fC13;
                                        wVar.quadTo(fI2, fC, f10, f11);
                                        iVar.p();
                                        if (iVar.f()) {
                                            i10 = iVar.f39209b;
                                            if (i10 != iVar.f39210c) {
                                                iIntValue = iVar.h().intValue();
                                            }
                                            f6 = 0.0f;
                                            i14 = 109;
                                        }
                                    }
                                    break;
                                case 83:
                                case 115:
                                    float f20 = (f10 * 2.0f) - fI2;
                                    float f21 = (2.0f * f11) - fC;
                                    float fI8 = iVar.i();
                                    float fC14 = iVar.c(fI8);
                                    float fC15 = iVar.c(fC14);
                                    float fC16 = iVar.c(fC15);
                                    if (!Float.isNaN(fC16)) {
                                        if (iIntValue == 115) {
                                            fC15 += f10;
                                            fC16 += f11;
                                            fI8 += f10;
                                            fC14 += f11;
                                        }
                                        float f22 = fI8;
                                        float f23 = fC14;
                                        float f24 = fC16;
                                        float f25 = fC15;
                                        wVar.cubicTo(f20, f21, f22, f23, f25, f24);
                                        f10 = f25;
                                        fI2 = f22;
                                        f11 = f24;
                                        fC = f23;
                                        iVar.p();
                                        if (iVar.f()) {
                                            i10 = iVar.f39209b;
                                            if (i10 != iVar.f39210c) {
                                                iIntValue = iVar.h().intValue();
                                            }
                                            f6 = 0.0f;
                                            i14 = 109;
                                        }
                                    }
                                    break;
                                case 84:
                                case 116:
                                    fI2 = (f10 * 2.0f) - fI2;
                                    fC = (2.0f * f11) - fC;
                                    float fI9 = iVar.i();
                                    float fC17 = iVar.c(fI9);
                                    if (!Float.isNaN(fC17)) {
                                        if (iIntValue == 116) {
                                            fI9 += f10;
                                            fC17 += f11;
                                        }
                                        f10 = fI9;
                                        f11 = fC17;
                                        wVar.quadTo(fI2, fC, f10, f11);
                                        iVar.p();
                                        if (iVar.f()) {
                                            i10 = iVar.f39209b;
                                            if (i10 != iVar.f39210c) {
                                                iIntValue = iVar.h().intValue();
                                            }
                                            f6 = 0.0f;
                                            i14 = 109;
                                        }
                                    }
                                    break;
                                case 86:
                                case 118:
                                    float fI10 = iVar.i();
                                    if (!Float.isNaN(fI10)) {
                                        if (iIntValue == 118) {
                                            fI10 += f11;
                                        }
                                        f11 = fI10;
                                        wVar.lineTo(f10, f11);
                                        fC = f11;
                                        iVar.p();
                                        if (iVar.f()) {
                                            i10 = iVar.f39209b;
                                            if (i10 != iVar.f39210c) {
                                                iIntValue = iVar.h().intValue();
                                            }
                                            f6 = 0.0f;
                                            i14 = 109;
                                        }
                                    }
                                    break;
                                case 90:
                                case 122:
                                    wVar.close();
                                    f10 = f12;
                                    fI2 = f10;
                                    f11 = f13;
                                    fC = f11;
                                    iVar.p();
                                    if (iVar.f()) {
                                        i10 = iVar.f39209b;
                                        if (i10 != iVar.f39210c) {
                                            iIntValue = iVar.h().intValue();
                                        }
                                        f6 = 0.0f;
                                        i14 = 109;
                                    }
                                    break;
                            }
                        }
                    }
                }
                vVar.f39070o = wVar;
            } else if (i13 == 9 && Float.valueOf(s(strTrim)).floatValue() < 0.0f) {
                throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
            }
            i12++;
            i11 = 0;
        }
        this.f39183b.c(vVar);
    }

    public final void I(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        boolean z10;
        if (this.f39184c) {
            this.f39185d++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            h hVarA = h.a(str2.length() > 0 ? str2 : str3);
            switch (a.f39191a[hVarA.ordinal()]) {
                case 1:
                    SVG.e0 e0Var = new SVG.e0();
                    e0Var.f39035a = this.f39182a;
                    e0Var.f39036b = this.f39183b;
                    i(e0Var, attributes);
                    l(e0Var, attributes);
                    h(e0Var, attributes);
                    o(e0Var, attributes);
                    for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                        String strTrim = attributes.getValue(i10).trim();
                        int i11 = a.f39192b[ad.d.a(attributes, i10)];
                        if (i11 == 1) {
                            e0Var.f38997q = w(strTrim);
                        } else if (i11 == 2) {
                            e0Var.f38998r = w(strTrim);
                        } else if (i11 == 3) {
                            SVG.p pVarW = w(strTrim);
                            e0Var.f38999s = pVarW;
                            if (pVarW.f()) {
                                throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                            }
                        } else if (i11 == 4) {
                            SVG.p pVarW2 = w(strTrim);
                            e0Var.f39000t = pVarW2;
                            if (pVarW2.f()) {
                                throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                            }
                        } else if (i11 == 5) {
                            e0Var.f39001u = strTrim;
                        }
                    }
                    SVG.i0 i0Var = this.f39183b;
                    if (i0Var == null) {
                        this.f39182a.f38944a = e0Var;
                    } else {
                        i0Var.c(e0Var);
                    }
                    this.f39183b = e0Var;
                    return;
                case 2:
                case 3:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.m mVar = new SVG.m();
                    mVar.f39035a = this.f39182a;
                    mVar.f39036b = this.f39183b;
                    i(mVar, attributes);
                    l(mVar, attributes);
                    n(mVar, attributes);
                    h(mVar, attributes);
                    this.f39183b.c(mVar);
                    this.f39183b = mVar;
                    return;
                case 4:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.h hVar = new SVG.h();
                    hVar.f39035a = this.f39182a;
                    hVar.f39036b = this.f39183b;
                    i(hVar, attributes);
                    l(hVar, attributes);
                    n(hVar, attributes);
                    this.f39183b.c(hVar);
                    this.f39183b = hVar;
                    return;
                case 5:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.d1 d1Var = new SVG.d1();
                    d1Var.f39035a = this.f39182a;
                    d1Var.f39036b = this.f39183b;
                    i(d1Var, attributes);
                    l(d1Var, attributes);
                    n(d1Var, attributes);
                    h(d1Var, attributes);
                    for (int i12 = 0; i12 < attributes.getLength(); i12++) {
                        String strTrim2 = attributes.getValue(i12).trim();
                        int i13 = a.f39192b[ad.d.a(attributes, i12)];
                        if (i13 == 1) {
                            d1Var.f38992q = w(strTrim2);
                        } else if (i13 == 2) {
                            d1Var.f38993r = w(strTrim2);
                        } else if (i13 == 3) {
                            SVG.p pVarW3 = w(strTrim2);
                            d1Var.f38994s = pVarW3;
                            if (pVarW3.f()) {
                                throw new SVGParseException("Invalid <use> element. width cannot be negative");
                            }
                        } else if (i13 == 4) {
                            SVG.p pVarW4 = w(strTrim2);
                            d1Var.f38995t = pVarW4;
                            if (pVarW4.f()) {
                                throw new SVGParseException("Invalid <use> element. height cannot be negative");
                            }
                        } else if (i13 == 6 && ("".equals(attributes.getURI(i12)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i12)))) {
                            d1Var.f38991p = strTrim2;
                        }
                    }
                    this.f39183b.c(d1Var);
                    this.f39183b = d1Var;
                    return;
                case 6:
                    G(attributes);
                    return;
                case 7:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.b0 b0Var = new SVG.b0();
                    b0Var.f39035a = this.f39182a;
                    b0Var.f39036b = this.f39183b;
                    i(b0Var, attributes);
                    l(b0Var, attributes);
                    n(b0Var, attributes);
                    h(b0Var, attributes);
                    for (int i14 = 0; i14 < attributes.getLength(); i14++) {
                        String strTrim3 = attributes.getValue(i14).trim();
                        int i15 = a.f39192b[ad.d.a(attributes, i14)];
                        if (i15 == 1) {
                            b0Var.f38971o = w(strTrim3);
                        } else if (i15 == 2) {
                            b0Var.f38972p = w(strTrim3);
                        } else if (i15 == 3) {
                            SVG.p pVarW5 = w(strTrim3);
                            b0Var.f38973q = pVarW5;
                            if (pVarW5.f()) {
                                throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                            }
                        } else if (i15 == 4) {
                            SVG.p pVarW6 = w(strTrim3);
                            b0Var.f38974r = pVarW6;
                            if (pVarW6.f()) {
                                throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                            }
                        } else if (i15 == 10) {
                            SVG.p pVarW7 = w(strTrim3);
                            b0Var.f38975s = pVarW7;
                            if (pVarW7.f()) {
                                throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                            }
                        } else if (i15 != 11) {
                            continue;
                        } else {
                            SVG.p pVarW8 = w(strTrim3);
                            b0Var.f38976t = pVarW8;
                            if (pVarW8.f()) {
                                throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                            }
                        }
                    }
                    this.f39183b.c(b0Var);
                    return;
                case 8:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.d dVar = new SVG.d();
                    dVar.f39035a = this.f39182a;
                    dVar.f39036b = this.f39183b;
                    i(dVar, attributes);
                    l(dVar, attributes);
                    n(dVar, attributes);
                    h(dVar, attributes);
                    for (int i16 = 0; i16 < attributes.getLength(); i16++) {
                        String strTrim4 = attributes.getValue(i16).trim();
                        switch (a.f39192b[ad.d.a(attributes, i16)]) {
                            case 12:
                                dVar.f38987o = w(strTrim4);
                                break;
                            case 13:
                                dVar.f38988p = w(strTrim4);
                                break;
                            case 14:
                                SVG.p pVarW9 = w(strTrim4);
                                dVar.f38989q = pVarW9;
                                if (pVarW9.f()) {
                                    throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                                }
                                break;
                                break;
                        }
                    }
                    this.f39183b.c(dVar);
                    return;
                case 9:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.i iVar = new SVG.i();
                    iVar.f39035a = this.f39182a;
                    iVar.f39036b = this.f39183b;
                    i(iVar, attributes);
                    l(iVar, attributes);
                    n(iVar, attributes);
                    h(iVar, attributes);
                    for (int i17 = 0; i17 < attributes.getLength(); i17++) {
                        String strTrim5 = attributes.getValue(i17).trim();
                        switch (a.f39192b[ad.d.a(attributes, i17)]) {
                            case 10:
                                SVG.p pVarW10 = w(strTrim5);
                                iVar.f39017q = pVarW10;
                                if (pVarW10.f()) {
                                    throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                                }
                                break;
                                break;
                            case 11:
                                SVG.p pVarW11 = w(strTrim5);
                                iVar.f39018r = pVarW11;
                                if (pVarW11.f()) {
                                    throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                                }
                                break;
                                break;
                            case 12:
                                iVar.f39015o = w(strTrim5);
                                break;
                            case 13:
                                iVar.f39016p = w(strTrim5);
                                break;
                        }
                    }
                    this.f39183b.c(iVar);
                    return;
                case 10:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.q qVar = new SVG.q();
                    qVar.f39035a = this.f39182a;
                    qVar.f39036b = this.f39183b;
                    i(qVar, attributes);
                    l(qVar, attributes);
                    n(qVar, attributes);
                    h(qVar, attributes);
                    for (int i18 = 0; i18 < attributes.getLength(); i18++) {
                        String strTrim6 = attributes.getValue(i18).trim();
                        switch (a.f39192b[ad.d.a(attributes, i18)]) {
                            case 15:
                                qVar.f39050o = w(strTrim6);
                                break;
                            case 16:
                                qVar.f39051p = w(strTrim6);
                                break;
                            case 17:
                                qVar.f39052q = w(strTrim6);
                                break;
                            case 18:
                                qVar.f39053r = w(strTrim6);
                                break;
                        }
                    }
                    this.f39183b.c(qVar);
                    return;
                case 11:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.z zVar = new SVG.z();
                    zVar.f39035a = this.f39182a;
                    zVar.f39036b = this.f39183b;
                    i(zVar, attributes);
                    l(zVar, attributes);
                    n(zVar, attributes);
                    h(zVar, attributes);
                    k(zVar, attributes, "polyline");
                    this.f39183b.c(zVar);
                    return;
                case 12:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.a0 a0Var = new SVG.a0();
                    a0Var.f39035a = this.f39182a;
                    a0Var.f39036b = this.f39183b;
                    i(a0Var, attributes);
                    l(a0Var, attributes);
                    n(a0Var, attributes);
                    h(a0Var, attributes);
                    k(a0Var, attributes, "polygon");
                    this.f39183b.c(a0Var);
                    return;
                case 13:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.v0 v0Var = new SVG.v0();
                    v0Var.f39035a = this.f39182a;
                    v0Var.f39036b = this.f39183b;
                    i(v0Var, attributes);
                    l(v0Var, attributes);
                    n(v0Var, attributes);
                    h(v0Var, attributes);
                    m(v0Var, attributes);
                    this.f39183b.c(v0Var);
                    this.f39183b = v0Var;
                    return;
                case 14:
                    SVG.i0 i0Var2 = this.f39183b;
                    if (i0Var2 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    if (!(i0Var2 instanceof SVG.x0)) {
                        throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                    }
                    SVG.u0 u0Var = new SVG.u0();
                    u0Var.f39035a = this.f39182a;
                    u0Var.f39036b = this.f39183b;
                    i(u0Var, attributes);
                    l(u0Var, attributes);
                    h(u0Var, attributes);
                    m(u0Var, attributes);
                    this.f39183b.c(u0Var);
                    this.f39183b = u0Var;
                    SVG.i0 i0Var3 = u0Var.f39036b;
                    if (i0Var3 instanceof SVG.a1) {
                        u0Var.f39069s = (SVG.a1) i0Var3;
                        return;
                    } else {
                        u0Var.f39069s = ((SVG.w0) i0Var3).getTextRoot();
                        return;
                    }
                case 15:
                    SVG.i0 i0Var4 = this.f39183b;
                    if (i0Var4 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    if (!(i0Var4 instanceof SVG.x0)) {
                        throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                    }
                    SVG.t0 t0Var = new SVG.t0();
                    t0Var.f39035a = this.f39182a;
                    t0Var.f39036b = this.f39183b;
                    i(t0Var, attributes);
                    l(t0Var, attributes);
                    h(t0Var, attributes);
                    for (int i19 = 0; i19 < attributes.getLength(); i19++) {
                        String strTrim7 = attributes.getValue(i19).trim();
                        if (a.f39192b[ad.d.a(attributes, i19)] == 6 && ("".equals(attributes.getURI(i19)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i19)))) {
                            t0Var.f39065o = strTrim7;
                        }
                    }
                    this.f39183b.c(t0Var);
                    SVG.i0 i0Var5 = t0Var.f39036b;
                    if (i0Var5 instanceof SVG.a1) {
                        t0Var.f39066p = (SVG.a1) i0Var5;
                        return;
                    } else {
                        t0Var.f39066p = ((SVG.w0) i0Var5).getTextRoot();
                        return;
                    }
                case 16:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.r0 r0Var = new SVG.r0();
                    r0Var.f39035a = this.f39182a;
                    r0Var.f39036b = this.f39183b;
                    i(r0Var, attributes);
                    l(r0Var, attributes);
                    n(r0Var, attributes);
                    h(r0Var, attributes);
                    this.f39183b.c(r0Var);
                    this.f39183b = r0Var;
                    return;
                case 17:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.s0 s0Var = new SVG.s0();
                    s0Var.f39035a = this.f39182a;
                    s0Var.f39036b = this.f39183b;
                    i(s0Var, attributes);
                    l(s0Var, attributes);
                    h(s0Var, attributes);
                    o(s0Var, attributes);
                    this.f39183b.c(s0Var);
                    this.f39183b = s0Var;
                    return;
                case 18:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.r rVar = new SVG.r();
                    rVar.f39035a = this.f39182a;
                    rVar.f39036b = this.f39183b;
                    i(rVar, attributes);
                    l(rVar, attributes);
                    h(rVar, attributes);
                    o(rVar, attributes);
                    for (int i20 = 0; i20 < attributes.getLength(); i20++) {
                        String strTrim8 = attributes.getValue(i20).trim();
                        switch (a.f39192b[ad.d.a(attributes, i20)]) {
                            case 26:
                                rVar.f39056r = w(strTrim8);
                                continue;
                                break;
                            case 27:
                                rVar.f39057s = w(strTrim8);
                                continue;
                                break;
                            case 28:
                                SVG.p pVarW12 = w(strTrim8);
                                rVar.f39058t = pVarW12;
                                if (pVarW12.f()) {
                                    throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                                }
                                continue;
                                break;
                                break;
                            case 29:
                                SVG.p pVarW13 = w(strTrim8);
                                rVar.f39059u = pVarW13;
                                if (pVarW13.f()) {
                                    throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                                }
                                continue;
                                break;
                                break;
                            case 30:
                                if ("strokeWidth".equals(strTrim8)) {
                                    rVar.f39055q = false;
                                    continue;
                                } else {
                                    if (!"userSpaceOnUse".equals(strTrim8)) {
                                        throw new SVGParseException("Invalid value for attribute markerUnits");
                                    }
                                    rVar.f39055q = true;
                                }
                                break;
                            case 31:
                                if (DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(strTrim8)) {
                                    rVar.f39060v = Float.valueOf(Float.NaN);
                                } else {
                                    rVar.f39060v = Float.valueOf(s(strTrim8));
                                }
                                break;
                        }
                    }
                    this.f39183b.c(rVar);
                    this.f39183b = rVar;
                    return;
                case 19:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.l0 l0Var = new SVG.l0();
                    l0Var.f39035a = this.f39182a;
                    l0Var.f39036b = this.f39183b;
                    i(l0Var, attributes);
                    l(l0Var, attributes);
                    j(l0Var, attributes);
                    for (int i21 = 0; i21 < attributes.getLength(); i21++) {
                        String strTrim9 = attributes.getValue(i21).trim();
                        switch (a.f39192b[ad.d.a(attributes, i21)]) {
                            case 15:
                                l0Var.m = w(strTrim9);
                                break;
                            case 16:
                                l0Var.f39031n = w(strTrim9);
                                break;
                            case 17:
                                l0Var.f39032o = w(strTrim9);
                                break;
                            case 18:
                                l0Var.f39033p = w(strTrim9);
                                break;
                        }
                    }
                    this.f39183b.c(l0Var);
                    this.f39183b = l0Var;
                    return;
                case 20:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.p0 p0Var = new SVG.p0();
                    p0Var.f39035a = this.f39182a;
                    p0Var.f39036b = this.f39183b;
                    i(p0Var, attributes);
                    l(p0Var, attributes);
                    j(p0Var, attributes);
                    for (int i22 = 0; i22 < attributes.getLength(); i22++) {
                        String strTrim10 = attributes.getValue(i22).trim();
                        int i23 = a.f39192b[ad.d.a(attributes, i22)];
                        if (i23 == 35) {
                            p0Var.f39048p = w(strTrim10);
                        } else if (i23 != 36) {
                            switch (i23) {
                                case 12:
                                    p0Var.m = w(strTrim10);
                                    break;
                                case 13:
                                    p0Var.f39046n = w(strTrim10);
                                    break;
                                case 14:
                                    SVG.p pVarW14 = w(strTrim10);
                                    p0Var.f39047o = pVarW14;
                                    if (pVarW14.f()) {
                                        throw new SVGParseException("Invalid <radialGradient> element. r cannot be negative");
                                    }
                                    break;
                                    break;
                            }
                        } else {
                            p0Var.f39049q = w(strTrim10);
                        }
                    }
                    this.f39183b.c(p0Var);
                    this.f39183b = p0Var;
                    return;
                case 21:
                    SVG.i0 i0Var6 = this.f39183b;
                    if (i0Var6 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    if (!(i0Var6 instanceof SVG.j)) {
                        throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                    }
                    SVG.d0 d0Var = new SVG.d0();
                    d0Var.f39035a = this.f39182a;
                    d0Var.f39036b = this.f39183b;
                    i(d0Var, attributes);
                    l(d0Var, attributes);
                    for (int i24 = 0; i24 < attributes.getLength(); i24++) {
                        String strTrim11 = attributes.getValue(i24).trim();
                        if (a.f39192b[ad.d.a(attributes, i24)] == 37) {
                            if (strTrim11.length() == 0) {
                                throw new SVGParseException("Invalid offset value in <stop> (empty string)");
                            }
                            int length = strTrim11.length();
                            if (strTrim11.charAt(strTrim11.length() - 1) == '%') {
                                length--;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            try {
                                float fR = r(length, strTrim11);
                                float f6 = 100.0f;
                                if (z10) {
                                    fR /= 100.0f;
                                }
                                if (fR < 0.0f) {
                                    f6 = 0.0f;
                                } else if (fR <= 100.0f) {
                                    f6 = fR;
                                }
                                d0Var.f38990h = Float.valueOf(f6);
                            } catch (NumberFormatException e5) {
                                throw new SVGParseException("Invalid offset value in <stop>: ".concat(strTrim11), e5);
                            }
                        }
                    }
                    this.f39183b.c(d0Var);
                    this.f39183b = d0Var;
                    return;
                case 22:
                case 23:
                    this.f39186e = true;
                    this.f39187f = hVarA;
                    return;
                case 24:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.e eVar = new SVG.e();
                    eVar.f39035a = this.f39182a;
                    eVar.f39036b = this.f39183b;
                    i(eVar, attributes);
                    l(eVar, attributes);
                    n(eVar, attributes);
                    h(eVar, attributes);
                    for (int i25 = 0; i25 < attributes.getLength(); i25++) {
                        String strTrim12 = attributes.getValue(i25).trim();
                        if (a.f39192b[ad.d.a(attributes, i25)] == 38) {
                            if ("objectBoundingBox".equals(strTrim12)) {
                                eVar.f38996p = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim12)) {
                                    throw new SVGParseException("Invalid value for attribute clipPathUnits");
                                }
                                eVar.f38996p = Boolean.TRUE;
                            }
                        }
                    }
                    this.f39183b.c(eVar);
                    this.f39183b = eVar;
                    return;
                case 25:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.y0 y0Var = new SVG.y0();
                    y0Var.f39035a = this.f39182a;
                    y0Var.f39036b = this.f39183b;
                    i(y0Var, attributes);
                    l(y0Var, attributes);
                    h(y0Var, attributes);
                    for (int i26 = 0; i26 < attributes.getLength(); i26++) {
                        String strTrim13 = attributes.getValue(i26).trim();
                        int i27 = a.f39192b[ad.d.a(attributes, i26)];
                        if (i27 != 6) {
                            if (i27 == 39) {
                                y0Var.f39085p = w(strTrim13);
                            }
                        } else if ("".equals(attributes.getURI(i26)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i26))) {
                            y0Var.f39084o = strTrim13;
                        }
                    }
                    this.f39183b.c(y0Var);
                    this.f39183b = y0Var;
                    SVG.i0 i0Var7 = y0Var.f39036b;
                    if (i0Var7 instanceof SVG.a1) {
                        y0Var.f39086q = (SVG.a1) i0Var7;
                        return;
                    } else {
                        y0Var.f39086q = ((SVG.w0) i0Var7).getTextRoot();
                        return;
                    }
                case 26:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.y yVar = new SVG.y();
                    yVar.f39035a = this.f39182a;
                    yVar.f39036b = this.f39183b;
                    i(yVar, attributes);
                    l(yVar, attributes);
                    h(yVar, attributes);
                    o(yVar, attributes);
                    for (int i28 = 0; i28 < attributes.getLength(); i28++) {
                        String strTrim14 = attributes.getValue(i28).trim();
                        int i29 = a.f39192b[ad.d.a(attributes, i28)];
                        if (i29 == 1) {
                            yVar.f39079t = w(strTrim14);
                        } else if (i29 == 2) {
                            yVar.f39080u = w(strTrim14);
                        } else if (i29 == 3) {
                            SVG.p pVarW15 = w(strTrim14);
                            yVar.f39081v = pVarW15;
                            if (pVarW15.f()) {
                                throw new SVGParseException("Invalid <pattern> element. width cannot be negative");
                            }
                        } else if (i29 == 4) {
                            SVG.p pVarW16 = w(strTrim14);
                            yVar.f39082w = pVarW16;
                            if (pVarW16.f()) {
                                throw new SVGParseException("Invalid <pattern> element. height cannot be negative");
                            }
                        } else if (i29 != 6) {
                            switch (i29) {
                                case 40:
                                    if (!"objectBoundingBox".equals(strTrim14)) {
                                        if (!"userSpaceOnUse".equals(strTrim14)) {
                                            throw new SVGParseException("Invalid value for attribute patternUnits");
                                        }
                                        yVar.f39076q = Boolean.TRUE;
                                    } else {
                                        yVar.f39076q = Boolean.FALSE;
                                    }
                                    break;
                                case 41:
                                    if (!"objectBoundingBox".equals(strTrim14)) {
                                        if (!"userSpaceOnUse".equals(strTrim14)) {
                                            throw new SVGParseException("Invalid value for attribute patternContentUnits");
                                        }
                                        yVar.f39077r = Boolean.TRUE;
                                    } else {
                                        yVar.f39077r = Boolean.FALSE;
                                    }
                                    break;
                                case 42:
                                    yVar.f39078s = D(strTrim14);
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i28)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i28))) {
                            yVar.f39083x = strTrim14;
                        }
                    }
                    this.f39183b.c(yVar);
                    this.f39183b = yVar;
                    return;
                case 27:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.o oVar = new SVG.o();
                    oVar.f39035a = this.f39182a;
                    oVar.f39036b = this.f39183b;
                    i(oVar, attributes);
                    l(oVar, attributes);
                    n(oVar, attributes);
                    h(oVar, attributes);
                    for (int i30 = 0; i30 < attributes.getLength(); i30++) {
                        String strTrim15 = attributes.getValue(i30).trim();
                        int i31 = a.f39192b[ad.d.a(attributes, i30)];
                        if (i31 == 1) {
                            oVar.f39038q = w(strTrim15);
                        } else if (i31 == 2) {
                            oVar.f39039r = w(strTrim15);
                        } else if (i31 == 3) {
                            SVG.p pVarW17 = w(strTrim15);
                            oVar.f39040s = pVarW17;
                            if (pVarW17.f()) {
                                throw new SVGParseException("Invalid <use> element. width cannot be negative");
                            }
                        } else if (i31 == 4) {
                            SVG.p pVarW18 = w(strTrim15);
                            oVar.f39041t = pVarW18;
                            if (pVarW18.f()) {
                                throw new SVGParseException("Invalid <use> element. height cannot be negative");
                            }
                        } else if (i31 != 6) {
                            if (i31 == 7) {
                                oVar.f39043o = B(strTrim15);
                            }
                        } else if ("".equals(attributes.getURI(i30)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i30))) {
                            oVar.f39037p = strTrim15;
                        }
                    }
                    this.f39183b.c(oVar);
                    this.f39183b = oVar;
                    return;
                case 28:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.e1 e1Var = new SVG.e1();
                    e1Var.f39035a = this.f39182a;
                    e1Var.f39036b = this.f39183b;
                    i(e1Var, attributes);
                    h(e1Var, attributes);
                    o(e1Var, attributes);
                    this.f39183b.c(e1Var);
                    this.f39183b = e1Var;
                    return;
                case 29:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.s sVar = new SVG.s();
                    sVar.f39035a = this.f39182a;
                    sVar.f39036b = this.f39183b;
                    i(sVar, attributes);
                    l(sVar, attributes);
                    h(sVar, attributes);
                    for (int i32 = 0; i32 < attributes.getLength(); i32++) {
                        String strTrim16 = attributes.getValue(i32).trim();
                        int i33 = a.f39192b[ad.d.a(attributes, i32)];
                        if (i33 == 1) {
                            w(strTrim16);
                        } else if (i33 == 2) {
                            w(strTrim16);
                        } else if (i33 == 3) {
                            SVG.p pVarW19 = w(strTrim16);
                            sVar.f39063q = pVarW19;
                            if (pVarW19.f()) {
                                throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                            }
                        } else if (i33 == 4) {
                            SVG.p pVarW20 = w(strTrim16);
                            sVar.f39064r = pVarW20;
                            if (pVarW20.f()) {
                                throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                            }
                        } else if (i33 != 43) {
                            if (i33 != 44) {
                                continue;
                            } else if ("objectBoundingBox".equals(strTrim16)) {
                                sVar.f39062p = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim16)) {
                                    throw new SVGParseException("Invalid value for attribute maskContentUnits");
                                }
                                sVar.f39062p = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(strTrim16)) {
                            sVar.f39061o = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(strTrim16)) {
                                throw new SVGParseException("Invalid value for attribute maskUnits");
                            }
                            sVar.f39061o = Boolean.TRUE;
                        }
                    }
                    this.f39183b.c(sVar);
                    this.f39183b = sVar;
                    return;
                case 30:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    String str4 = SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL;
                    boolean zEquals = true;
                    for (int i34 = 0; i34 < attributes.getLength(); i34++) {
                        String strTrim17 = attributes.getValue(i34).trim();
                        int i35 = a.f39192b[ad.d.a(attributes, i34)];
                        if (i35 == 88) {
                            zEquals = strTrim17.equals(CSSParser.CSS_MIME_TYPE);
                        } else if (i35 == 89) {
                            str4 = strTrim17;
                        }
                    }
                    if (zEquals) {
                        com.caverock.androidsvg.a.f fVar = com.caverock.androidsvg.a.f.screen;
                        com.caverock.androidsvg.a.d dVar2 = new com.caverock.androidsvg.a.d(str4);
                        dVar2.q();
                        if (com.caverock.androidsvg.a.b(com.caverock.androidsvg.a.e(dVar2), fVar)) {
                            this.f39189h = true;
                            return;
                        }
                    }
                    this.f39184c = true;
                    this.f39185d = 1;
                    return;
                case 31:
                    if (this.f39183b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.c0 c0Var = new SVG.c0();
                    c0Var.f39035a = this.f39182a;
                    c0Var.f39036b = this.f39183b;
                    i(c0Var, attributes);
                    l(c0Var, attributes);
                    this.f39183b.c(c0Var);
                    this.f39183b = c0Var;
                    return;
                default:
                    this.f39184c = true;
                    this.f39185d = 1;
                    return;
            }
        }
    }

    public final void J(int i10, char[] cArr, int i11) throws SVGParseException {
        if (this.f39184c) {
            return;
        }
        if (this.f39186e) {
            if (this.f39188g == null) {
                this.f39188g = new StringBuilder(i11);
            }
            this.f39188g.append(cArr, i10, i11);
        } else if (this.f39189h) {
            if (this.f39190i == null) {
                this.f39190i = new StringBuilder(i11);
            }
            this.f39190i.append(cArr, i10, i11);
        } else if (this.f39183b instanceof SVG.x0) {
            a(new String(cArr, i10, i11));
        }
    }

    public final void K(String str) throws SVGParseException {
        if (this.f39184c) {
            return;
        }
        if (this.f39186e) {
            if (this.f39188g == null) {
                this.f39188g = new StringBuilder(str.length());
            }
            this.f39188g.append(str);
        } else if (this.f39189h) {
            if (this.f39190i == null) {
                this.f39190i = new StringBuilder(str.length());
            }
            this.f39190i.append(str);
        } else if (this.f39183b instanceof SVG.x0) {
            a(str);
        }
    }

    public final void a(String str) throws SVGParseException {
        SVG.g0 g0Var = (SVG.g0) this.f39183b;
        int size = g0Var.f39006i.size();
        SVG.m0 m0Var = size == 0 ? null : g0Var.f39006i.get(size - 1);
        if (m0Var instanceof SVG.b1) {
            SVG.b1 b1Var = (SVG.b1) m0Var;
            b1Var.f38977c = ad.d.f(new StringBuilder(), b1Var.f38977c, str);
        } else {
            SVG.i0 i0Var = this.f39183b;
            SVG.b1 b1Var2 = new SVG.b1();
            b1Var2.f38977c = str;
            i0Var.c(b1Var2);
        }
    }

    public final void c(String str, String str2, String str3) throws SVGParseException {
        if (this.f39184c) {
            int i10 = this.f39185d - 1;
            this.f39185d = i10;
            if (i10 == 0) {
                this.f39184c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i11 = a.f39191a[h.a(str2).ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 4 && i11 != 5 && i11 != 13 && i11 != 14) {
                switch (i11) {
                    case 22:
                    case 23:
                        this.f39186e = false;
                        StringBuilder sb2 = this.f39188g;
                        if (sb2 != null) {
                            h hVar = this.f39187f;
                            if (hVar == h.title) {
                                this.f39182a.f38945b = sb2.toString();
                            } else if (hVar == h.desc) {
                                this.f39182a.f38946c = sb2.toString();
                            }
                            this.f39188g.setLength(0);
                        }
                        break;
                    case 30:
                        StringBuilder sb3 = this.f39190i;
                        if (sb3 != null) {
                            this.f39189h = false;
                            String string = sb3.toString();
                            com.caverock.androidsvg.a aVar = new com.caverock.androidsvg.a(com.caverock.androidsvg.a.f.screen, com.caverock.androidsvg.a.u.Document);
                            SVG svg = this.f39182a;
                            svg.f38948e.b(aVar.c(string));
                            this.f39190i.setLength(0);
                        }
                        break;
                }
                return;
            }
            this.f39183b = ((SVG.m0) this.f39183b).f39036b;
        }
    }

    public final void d(String str, HashMap map) {
        String str2;
        String strResolveCSSStyleSheet;
        if (!str.equals("xml-stylesheet") || SVG.f38942g == null) {
            return;
        }
        if (((String) map.get("type")) == null || CSSParser.CSS_MIME_TYPE.equals(map.get("type"))) {
            if ((((String) map.get(SVGParser.XML_STYLESHEET_ATTR_ALTERNATE)) != null && !SVGParser.XML_STYLESHEET_ATTR_ALTERNATE_NO.equals(map.get(SVGParser.XML_STYLESHEET_ATTR_ALTERNATE))) || (str2 = (String) map.get(SVGParser.XML_STYLESHEET_ATTR_HREF)) == null || (strResolveCSSStyleSheet = SVG.f38942g.resolveCSSStyleSheet(str2)) == null) {
                return;
            }
            String str3 = (String) map.get(SVGParser.XML_STYLESHEET_ATTR_MEDIA);
            if (str3 != null && !SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL.equals(str3.trim())) {
                strResolveCSSStyleSheet = u.g("@media ", str3, " { ", strResolveCSSStyleSheet, "}");
            }
            com.caverock.androidsvg.a aVar = new com.caverock.androidsvg.a(com.caverock.androidsvg.a.f.screen, com.caverock.androidsvg.a.u.Document);
            this.f39182a.f38948e.b(aVar.c(strResolveCSSStyleSheet));
        }
    }

    public final SVG g(InputStream inputStream, boolean z10) throws SVGParseException {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i10 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i10 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            F(inputStream, z10);
            return this.f39182a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
    }
}
