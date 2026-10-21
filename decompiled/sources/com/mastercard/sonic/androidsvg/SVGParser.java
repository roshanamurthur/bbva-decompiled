package com.mastercard.sonic.androidsvg;

import android.util.Log;
import android.util.Xml;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.h0;
import androidx.collection.k;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.internal.view.SupportMenu;
import androidx.core.provider.FontsContractCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.tohu.android.core.response.Result;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.ui.component.menu.model.BaseMenuItem;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.bea.xml.stream.MXParser;
import com.fasterxml.jackson.core.JsonPointer;
import com.mastercard.sonic.StatusCode;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import kotlinx.coroutines.DebugKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.strategy.Name;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: SVGParser.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \n2\u00020\u0001:\n\u000b\f\n\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0014"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVGParser;", "", "Ljava/io/InputStream;", "is", "", "enableInternalEntities", "Lcom/mastercard/sonic/androidsvg/SVG;", "parse", "<init>", "()V", "Companion", "a", "b", "c", "d", "e", "SVGAttr", "SVGElem", "TextScanner", "f", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSVGParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SVGParser.kt\ncom/mastercard/sonic/androidsvg/SVGParser\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4171:1\n107#2:4172\n79#2,22:4173\n107#2:4195\n79#2,22:4196\n107#2:4218\n79#2,22:4219\n107#2:4241\n79#2,22:4242\n107#2:4264\n79#2,22:4265\n107#2:4287\n79#2,22:4288\n107#2:4310\n79#2,22:4311\n107#2:4333\n79#2,22:4334\n107#2:4356\n79#2,22:4357\n107#2:4379\n79#2,22:4380\n107#2:4402\n79#2,22:4403\n107#2:4425\n79#2,22:4426\n107#2:4448\n79#2,22:4449\n107#2:4472\n79#2,22:4473\n107#2:4495\n79#2,22:4496\n107#2:4518\n79#2,22:4519\n107#2:4541\n79#2,22:4542\n107#2:4564\n79#2,22:4565\n107#2:4587\n79#2,22:4588\n107#2:4610\n79#2,22:4611\n107#2:4633\n79#2,22:4634\n107#2:4656\n79#2,22:4657\n107#2:4679\n79#2,22:4680\n107#2:4702\n79#2,22:4703\n107#2:4725\n79#2,22:4726\n107#2:4748\n79#2,22:4749\n107#2:4771\n79#2,22:4772\n107#2:4794\n79#2,22:4795\n1#3:4471\n*S KotlinDebug\n*F\n+ 1 SVGParser.kt\ncom/mastercard/sonic/androidsvg/SVGParser\n*L\n890#1:4172\n890#1:4173,22\n964#1:4195\n964#1:4196,22\n1051#1:4218\n1051#1:4219,22\n1093#1:4241\n1093#1:4242,22\n1154#1:4264\n1154#1:4265,22\n1218#1:4287\n1218#1:4288,22\n1263#1:4310\n1263#1:4311,22\n1329#1:4333\n1329#1:4334,22\n1375#1:4356\n1375#1:4357,22\n1427#1:4379\n1427#1:4380,22\n1552#1:4402\n1552#1:4403,22\n1622#1:4425\n1622#1:4426,22\n1664#1:4448\n1664#1:4449,22\n1733#1:4472\n1733#1:4473,22\n1800#1:4495\n1800#1:4496,22\n1839#1:4518\n1839#1:4519,22\n1883#1:4541\n1883#1:4542,22\n1935#1:4564\n1935#1:4565,22\n2012#1:4587\n2012#1:4588,22\n2057#1:4610\n2057#1:4611,22\n2102#1:4633\n2102#1:4634,22\n2195#1:4656\n2195#1:4657,22\n2567#1:4679\n2567#1:4680,22\n2570#1:4702\n2570#1:4703,22\n2592#1:4725\n2592#1:4726,22\n2613#1:4748\n2613#1:4749,22\n2626#1:4771\n2626#1:4772,22\n2779#1:4794\n2779#1:4795,22\n*E\n"})
public final class SVGParser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int ENTITY_WATCH_BUFFER_SIZE = 4096;

    @NotNull
    public static final String XML_STYLESHEET_ATTR_ALTERNATE = "alternate";

    @NotNull
    public static final String XML_STYLESHEET_ATTR_ALTERNATE_NO = "no";

    @NotNull
    public static final String XML_STYLESHEET_ATTR_HREF = "href";

    @NotNull
    public static final String XML_STYLESHEET_ATTR_MEDIA = "media";

    @NotNull
    public static final String XML_STYLESHEET_ATTR_MEDIA_ALL = "all";

    @NotNull
    public static final String XML_STYLESHEET_ATTR_TYPE = "type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public SVG f51386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public SVG.SvgContainer f51387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f51388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f51390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public SVGElem f51391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public StringBuilder f51392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f51393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public StringBuilder f51394i;

    /* JADX INFO: compiled from: SVGParser.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\"\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0010R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0010R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0010¨\u0006$"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVGParser$Companion;", "", "Lcom/mastercard/sonic/androidsvg/SVG$Style;", "style", "", "localName", "val", "", "processStyleProperty", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "parseLength", "Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio;", "parsePreserveAspectRatio", "Lcom/mastercard/sonic/androidsvg/SVG$PathDefinition;", "parsePath", "CURRENTCOLOR", "Ljava/lang/String;", "", "ENTITY_WATCH_BUFFER_SIZE", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "FEATURE_STRING_PREFIX", ExpectedUserActionOnPoiTypes.NONE, "SVG_NAMESPACE", "TAG", "VALID_DISPLAY_VALUES", "VALID_VISIBILITY_VALUES", "XLINK_NAMESPACE", "XML_STYLESHEET_ATTR_ALTERNATE", "XML_STYLESHEET_ATTR_ALTERNATE_NO", "XML_STYLESHEET_ATTR_HREF", "XML_STYLESHEET_ATTR_MEDIA", "XML_STYLESHEET_ATTR_MEDIA_ALL", "XML_STYLESHEET_ATTR_TYPE", "XML_STYLESHEET_PROCESSING_INSTRUCTION", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSVGParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SVGParser.kt\ncom/mastercard/sonic/androidsvg/SVGParser$Companion\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,4171:1\n107#2:4172\n79#2,22:4173\n107#2:4195\n79#2,22:4196\n107#2:4218\n79#2,22:4219\n107#2:4243\n79#2,29:4244\n37#3,2:4241\n*S KotlinDebug\n*F\n+ 1 SVGParser.kt\ncom/mastercard/sonic/androidsvg/SVGParser$Companion\n*L\n3370#1:4172\n3370#1:4173,22\n3372#1:4195\n3372#1:4196,22\n3379#1:4218\n3379#1:4219,22\n4167#1:4243\n4167#1:4244,29\n3760#1:4241,2\n*E\n"})
    public static final class Companion {

        /* JADX INFO: compiled from: SVGParser.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SVGAttr.values().length];
                try {
                    iArr[SVGAttr.fill.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SVGAttr.fill_rule.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SVGAttr.fill_opacity.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SVGAttr.stroke.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[SVGAttr.stroke_opacity.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[SVGAttr.stroke_width.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[SVGAttr.stroke_linecap.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[SVGAttr.stroke_linejoin.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[SVGAttr.stroke_miterlimit.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[SVGAttr.stroke_dasharray.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[SVGAttr.stroke_dashoffset.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[SVGAttr.opacity.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[SVGAttr.color.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[SVGAttr.font.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[SVGAttr.font_family.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[SVGAttr.font_size.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[SVGAttr.font_weight.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[SVGAttr.font_style.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[SVGAttr.text_decoration.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[SVGAttr.direction.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[SVGAttr.text_anchor.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[SVGAttr.overflow.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[SVGAttr.marker.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[SVGAttr.marker_start.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[SVGAttr.marker_mid.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[SVGAttr.marker_end.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[SVGAttr.display.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[SVGAttr.visibility.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[SVGAttr.stop_color.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[SVGAttr.stop_opacity.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[SVGAttr.clip.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[SVGAttr.clip_path.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[SVGAttr.clip_rule.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[SVGAttr.mask.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[SVGAttr.solid_color.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[SVGAttr.solid_opacity.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[SVGAttr.viewport_fill.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[SVGAttr.viewport_fill_opacity.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[SVGAttr.vector_effect.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[SVGAttr.image_rendering.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static int a(float f6) {
            if (f6 < 0.0f) {
                return 0;
            }
            if (f6 > 255.0f) {
                return 255;
            }
            return Math.round(f6);
        }

        public static final /* synthetic */ float access$parseFloat(Companion companion, String str) {
            companion.getClass();
            return g(str);
        }

        public static final /* synthetic */ List access$parseFontFamily(Companion companion, String str) {
            companion.getClass();
            return h(str);
        }

        public static final List access$parseLengthList(Companion companion, String str) throws SVGParseException {
            companion.getClass();
            if (str.length() == 0) {
                throw new SVGParseException("Invalid length list (empty string)", null, 2, null);
            }
            ArrayList arrayList = new ArrayList(1);
            TextScanner textScanner = new TextScanner(str);
            textScanner.skipWhitespace();
            while (!textScanner.empty()) {
                float fNextFloat = textScanner.nextFloat();
                if (Float.isNaN(fNextFloat)) {
                    throw new SVGParseException(androidx.camera.core.processing.f.d("Invalid length list value: ", textScanner.ahead()), null, 2, null);
                }
                SVG.Unit unitNextUnit = textScanner.nextUnit();
                if (unitNextUnit == null) {
                    unitNextUnit = SVG.Unit.px;
                }
                arrayList.add(new SVG.Length(fNextFloat, unitNextUnit));
                textScanner.skipCommaWhitespace();
            }
            return arrayList;
        }

        public static final void access$parsePreserveAspectRatio(Companion companion, SVG.SvgPreserveAspectRatioContainer svgPreserveAspectRatioContainer, String str) {
            svgPreserveAspectRatioContainer.setPreserveAspectRatio(companion.parsePreserveAspectRatio(str));
        }

        public static final Set access$parseRequiredFeatures(Companion companion, String str) {
            companion.getClass();
            TextScanner textScanner = new TextScanner(str);
            HashSet hashSet = new HashSet();
            while (!textScanner.empty()) {
                String strNextToken$default = TextScanner.nextToken$default(textScanner, (char) 0, false, 3, null);
                Intrinsics.checkNotNull(strNextToken$default);
                if (l.startsWith$default(strNextToken$default, "http://www.w3.org/TR/SVG11/feature#", false, 2, null)) {
                    String strSubstring = strNextToken$default.substring(35);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    hashSet.add(strSubstring);
                } else {
                    hashSet.add("UNSUPPORTED");
                }
                textScanner.skipWhitespace();
            }
            return hashSet;
        }

        public static final Set access$parseRequiredFormats(Companion companion, String str) {
            companion.getClass();
            TextScanner textScanner = new TextScanner(str);
            HashSet hashSet = new HashSet();
            while (!textScanner.empty()) {
                hashSet.add(TextScanner.nextToken$default(textScanner, (char) 0, false, 3, null));
                textScanner.skipWhitespace();
            }
            return hashSet;
        }

        public static final void access$parseStyle(Companion companion, SVG.SvgElementBase svgElementBase, String str) {
            companion.getClass();
            CSSParser.CSSTextScanner cSSTextScanner = new CSSParser.CSSTextScanner(new Regex("/\\*.*?\\*/").replace(str, ""));
            while (!cSSTextScanner.empty()) {
                cSSTextScanner.skipWhitespace();
                String strNextIdentifier = cSSTextScanner.nextIdentifier();
                cSSTextScanner.skipWhitespace();
                if (!cSSTextScanner.consume(';')) {
                    if (!cSSTextScanner.consume(AbstractJsonLexerKt.COLON)) {
                        return;
                    }
                    cSSTextScanner.skipWhitespace();
                    String strNextPropertyValue = cSSTextScanner.nextPropertyValue();
                    if (strNextPropertyValue != null) {
                        cSSTextScanner.skipWhitespace();
                        if (cSSTextScanner.empty() || cSSTextScanner.consume(';')) {
                            if (svgElementBase.getStyle() == null) {
                                svgElementBase.setStyle(new SVG.Style());
                            }
                            companion.processStyleProperty(svgElementBase.getStyle(), strNextIdentifier, strNextPropertyValue);
                            cSSTextScanner.skipWhitespace();
                        }
                    }
                }
            }
        }

        public static final Set access$parseSystemLanguage(Companion companion, String str) {
            companion.getClass();
            TextScanner textScanner = new TextScanner(str);
            HashSet hashSet = new HashSet();
            while (!textScanner.empty()) {
                String strNextToken$default = TextScanner.nextToken$default(textScanner, (char) 0, false, 3, null);
                Intrinsics.checkNotNull(strNextToken$default);
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strNextToken$default, '-', 0, false, 6, (Object) null);
                if (iIndexOf$default != -1) {
                    strNextToken$default = strNextToken$default.substring(0, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strNextToken$default, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                hashSet.add(new Locale(strNextToken$default, "", "").getLanguage());
                textScanner.skipWhitespace();
            }
            return hashSet;
        }

        public static final SVG.Box access$parseViewBox(Companion companion, String str) throws SVGParseException {
            companion.getClass();
            TextScanner textScanner = new TextScanner(str);
            textScanner.skipWhitespace();
            float fNextFloat = textScanner.nextFloat();
            textScanner.skipCommaWhitespace();
            float fNextFloat2 = textScanner.nextFloat();
            textScanner.skipCommaWhitespace();
            float fNextFloat3 = textScanner.nextFloat();
            textScanner.skipCommaWhitespace();
            float fNextFloat4 = textScanner.nextFloat();
            if (Float.isNaN(fNextFloat) || Float.isNaN(fNextFloat2) || Float.isNaN(fNextFloat3) || Float.isNaN(fNextFloat4)) {
                throw new SVGParseException("Invalid viewBox definition - should have four numbers", null, 2, null);
            }
            if (fNextFloat3 < 0.0f) {
                throw new SVGParseException("Invalid viewBox. width cannot be negative", null, 2, null);
            }
            if (fNextFloat4 >= 0.0f) {
                return new SVG.Box(fNextFloat, fNextFloat2, fNextFloat3, fNextFloat4);
            }
            throw new SVGParseException("Invalid viewBox. height cannot be negative", null, 2, null);
        }

        public static int b(float f6, float f10, float f11) {
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
            return a(c(f18, f17, f14 - 2.0f) * 256.0f) | (a(c(f18, f17, f14 + 2.0f) * 256.0f) << 16) | (a(c(f18, f17, f14) * 256.0f) << 8);
        }

        public static float c(float f6, float f10, float f11) {
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

        public static SVG.Colour d(String str) throws SVGParseException {
            if (str.charAt(0) == '#') {
                IntegerParser hex = IntegerParser.INSTANCE.parseHex(str, 1, str.length());
                if (hex == null) {
                    throw new SVGParseException("Bad hex colour value: ".concat(str), null, 2, null);
                }
                int endPos = hex.getEndPos();
                if (endPos == 4) {
                    int iValue = hex.value();
                    int i10 = iValue & 3840;
                    int i11 = iValue & 240;
                    int i12 = iValue & 15;
                    return new SVG.Colour(i12 | (i10 << 8) | (i10 << 12) | ViewCompat.MEASURED_STATE_MASK | (i11 << 8) | (i11 << 4) | (i12 << 4));
                }
                if (endPos != 5) {
                    if (endPos == 7) {
                        return new SVG.Colour(hex.value() | ViewCompat.MEASURED_STATE_MASK);
                    }
                    if (endPos == 9) {
                        return new SVG.Colour((hex.value() | (hex.value() << 24)) >>> 8);
                    }
                    throw new SVGParseException("Bad hex colour value: ".concat(str), null, 2, null);
                }
                int iValue2 = hex.value();
                int i13 = 61440 & iValue2;
                int i14 = iValue2 & 3840;
                int i15 = iValue2 & 240;
                int i16 = iValue2 & 15;
                return new SVG.Colour((i16 << 24) | (i16 << 28) | (i13 << 8) | (i13 << 4) | (i14 << 4) | i14 | i15 | (i15 >> 4));
            }
            Locale locale = Locale.US;
            String colourName = androidx.room.a.d(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            boolean zStartsWith$default = l.startsWith$default(colourName, "rgba(", false, 2, null);
            if (zStartsWith$default || l.startsWith$default(colourName, "rgb(", false, 2, null)) {
                String strSubstring = str.substring(zStartsWith$default ? 5 : 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                TextScanner textScanner = new TextScanner(strSubstring);
                textScanner.skipWhitespace();
                float fNextFloat = textScanner.nextFloat();
                if (!Float.isNaN(fNextFloat) && textScanner.consume('%')) {
                    fNextFloat = (fNextFloat * 256) / 100;
                }
                float fCheckedNextFloat = textScanner.checkedNextFloat(fNextFloat);
                if (!Float.isNaN(fCheckedNextFloat) && textScanner.consume('%')) {
                    fCheckedNextFloat = (fCheckedNextFloat * 256) / 100;
                }
                float fCheckedNextFloat2 = textScanner.checkedNextFloat(fCheckedNextFloat);
                if (!Float.isNaN(fCheckedNextFloat2) && textScanner.consume('%')) {
                    fCheckedNextFloat2 = (fCheckedNextFloat2 * 256) / 100;
                }
                if (!zStartsWith$default) {
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fCheckedNextFloat2) || !textScanner.consume(RootService.CLOSE_BRACKET)) {
                        throw new SVGParseException("Bad rgb() colour value: ".concat(str), null, 2, null);
                    }
                    return new SVG.Colour((a(fNextFloat) << 16) | ViewCompat.MEASURED_STATE_MASK | (a(fCheckedNextFloat) << 8) | a(fCheckedNextFloat2));
                }
                float fCheckedNextFloat3 = textScanner.checkedNextFloat(fCheckedNextFloat2);
                textScanner.skipWhitespace();
                if (Float.isNaN(fCheckedNextFloat3) || !textScanner.consume(RootService.CLOSE_BRACKET)) {
                    throw new SVGParseException("Bad rgba() colour value: ".concat(str), null, 2, null);
                }
                return new SVG.Colour((a(fCheckedNextFloat3 * 256) << 24) | (a(fNextFloat) << 16) | (a(fCheckedNextFloat) << 8) | a(fCheckedNextFloat2));
            }
            boolean zStartsWith$default2 = l.startsWith$default(colourName, "hsla(", false, 2, null);
            if (!zStartsWith$default2 && !l.startsWith$default(colourName, "hsl(", false, 2, null)) {
                HashMap map = b.f51410a;
                Intrinsics.checkNotNullParameter(colourName, "colourName");
                Integer num = (Integer) b.f51410a.get(colourName);
                if (num != null) {
                    return new SVG.Colour(num.intValue());
                }
                throw new SVGParseException("Invalid colour keyword: ".concat(colourName), null, 2, null);
            }
            String strSubstring2 = str.substring(zStartsWith$default2 ? 5 : 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            TextScanner textScanner2 = new TextScanner(strSubstring2);
            textScanner2.skipWhitespace();
            float fNextFloat2 = textScanner2.nextFloat();
            float fCheckedNextFloat4 = textScanner2.checkedNextFloat(fNextFloat2);
            if (!Float.isNaN(fCheckedNextFloat4)) {
                textScanner2.consume('%');
            }
            float fCheckedNextFloat5 = textScanner2.checkedNextFloat(fCheckedNextFloat4);
            if (!Float.isNaN(fCheckedNextFloat5)) {
                textScanner2.consume('%');
            }
            if (!zStartsWith$default2) {
                textScanner2.skipWhitespace();
                if (Float.isNaN(fCheckedNextFloat5) || !textScanner2.consume(RootService.CLOSE_BRACKET)) {
                    throw new SVGParseException("Bad hsl() colour value: ".concat(str), null, 2, null);
                }
                return new SVG.Colour(b(fNextFloat2, fCheckedNextFloat4, fCheckedNextFloat5) | ViewCompat.MEASURED_STATE_MASK);
            }
            float fCheckedNextFloat6 = textScanner2.checkedNextFloat(fCheckedNextFloat5);
            textScanner2.skipWhitespace();
            if (Float.isNaN(fCheckedNextFloat6) || !textScanner2.consume(RootService.CLOSE_BRACKET)) {
                throw new SVGParseException("Bad hsla() colour value: ".concat(str), null, 2, null);
            }
            return new SVG.Colour((a(fCheckedNextFloat6 * 256) << 24) | b(fNextFloat2, fCheckedNextFloat4, fCheckedNextFloat5));
        }

        public static SVG.SvgPaint e(String str) {
            if (Intrinsics.areEqual(str, "none")) {
                return SVG.Colour.INSTANCE.getTRANSPARENT();
            }
            if (Intrinsics.areEqual(str, "currentColor")) {
                return SVG.CurrentColor.INSTANCE;
            }
            try {
                return d(str);
            } catch (SVGParseException unused) {
                return null;
            }
        }

        public static float f(int i10, int i11, String str) throws SVGParseException {
            float number = new NumberParser().parseNumber(str, i10, i11);
            if (Float.isNaN(number)) {
                throw new SVGParseException(androidx.camera.core.processing.f.d("Invalid float value: ", str), null, 2, null);
            }
            return number;
        }

        public static float g(String str) throws SVGParseException {
            int length = str.length();
            if (length != 0) {
                return f(0, length, str);
            }
            throw new SVGParseException("Invalid float value (empty string)", null, 2, null);
        }

        public static ArrayList h(String str) {
            TextScanner textScanner = new TextScanner(str);
            ArrayList arrayList = null;
            do {
                String strNextQuotedString = textScanner.nextQuotedString();
                if (strNextQuotedString == null) {
                    strNextQuotedString = textScanner.nextTokenWithWhitespace(AbstractJsonLexerKt.COMMA);
                }
                if (strNextQuotedString == null) {
                    break;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strNextQuotedString);
                textScanner.skipCommaWhitespace();
            } while (!textScanner.empty());
            return arrayList;
        }

        public static SVG.Style.FontStyle j(String str) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1657669071) {
                if (iHashCode != -1178781136) {
                    if (iHashCode == -1039745817 && str.equals("normal")) {
                        return SVG.Style.FontStyle.Normal;
                    }
                } else if (str.equals("italic")) {
                    return SVG.Style.FontStyle.Italic;
                }
            } else if (str.equals("oblique")) {
                return SVG.Style.FontStyle.Oblique;
            }
            return null;
        }

        public static String k(String str) {
            if (Intrinsics.areEqual(str, "none") || !l.startsWith$default(str, "url(", false, 2, null)) {
                return null;
            }
            if (!l.endsWith$default(str, ")", false, 2, null)) {
                String strSubstring = str.substring(4);
                int iF = ai.a.f(strSubstring, "this as java.lang.String).substring(startIndex)", 1);
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= iF) {
                    boolean z11 = Intrinsics.compare((int) strSubstring.charAt(!z10 ? i10 : iF), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        iF--;
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                return k.b(iF, 1, strSubstring, i10);
            }
            String strSubstring2 = str.substring(4, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = strSubstring2.length() - 1;
            int i11 = 0;
            boolean z12 = false;
            while (i11 <= length) {
                boolean z13 = Intrinsics.compare((int) strSubstring2.charAt(!z12 ? i11 : length), 32) <= 0;
                if (z12) {
                    if (!z13) {
                        break;
                    }
                    length--;
                } else if (z13) {
                    i11++;
                } else {
                    z12 = true;
                }
            }
            return k.b(length, 1, strSubstring2, i11);
        }

        public static SVG.Length l(TextScanner textScanner) {
            return textScanner.consume(DebugKt.DEBUG_PROPERTY_VALUE_AUTO) ? new SVG.Length(0.0f) : textScanner.nextLength();
        }

        public static Float m(String str) {
            try {
                float fG = g(str);
                float f6 = 0.0f;
                if (fG < 0.0f) {
                    fG = f6;
                } else {
                    f6 = 1.0f;
                    if (fG > 1.0f) {
                        fG = f6;
                    }
                }
                return Float.valueOf(fG);
            } catch (SVGParseException unused) {
                return null;
            }
        }

        public static SVG.SvgPaint n(String str) {
            if (!l.startsWith$default(str, "url(", false, 2, null)) {
                return e(str);
            }
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ")", 0, false, 6, (Object) null);
            if (iIndexOf$default == -1) {
                String strSubstring = str.substring(4);
                int iF = ai.a.f(strSubstring, "this as java.lang.String).substring(startIndex)", 1);
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= iF) {
                    boolean z11 = Intrinsics.compare((int) strSubstring.charAt(!z10 ? i10 : iF), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        iF--;
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                return new SVG.PaintReference(k.b(iF, 1, strSubstring, i10), null);
            }
            String strSubstring2 = str.substring(4, iIndexOf$default);
            int iF2 = ai.a.f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)", 1);
            int i11 = 0;
            boolean z12 = false;
            while (i11 <= iF2) {
                boolean z13 = Intrinsics.compare((int) strSubstring2.charAt(!z12 ? i11 : iF2), 32) <= 0;
                if (z12) {
                    if (!z13) {
                        break;
                    }
                    iF2--;
                } else if (z13) {
                    i11++;
                } else {
                    z12 = true;
                }
            }
            String strB = k.b(iF2, 1, strSubstring2, i11);
            String strSubstring3 = str.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            int length = strSubstring3.length() - 1;
            int i12 = 0;
            boolean z14 = false;
            while (i12 <= length) {
                boolean z15 = Intrinsics.compare((int) strSubstring3.charAt(!z14 ? i12 : length), 32) <= 0;
                if (z14) {
                    if (!z15) {
                        break;
                    }
                    length--;
                } else if (z15) {
                    i12++;
                } else {
                    z14 = true;
                }
            }
            String strB2 = k.b(length, 1, strSubstring3, i12);
            return new SVG.PaintReference(strB, strB2.length() > 0 ? e(strB2) : null);
        }

        public final SVG.Length i(String str) {
            try {
                SVG.Length length = (SVG.Length) c.f51411a.get(str);
                return length == null ? parseLength(str) : length;
            } catch (SVGParseException unused) {
                return null;
            }
        }

        @NotNull
        public final SVG.Length parseLength(@Nullable String val) throws SVGParseException {
            Intrinsics.checkNotNull(val);
            if (val.length() == 0) {
                throw new SVGParseException("Invalid length value (empty string)", null, 2, null);
            }
            int length = val.length();
            SVG.Unit unitValueOf = SVG.Unit.px;
            char cCharAt = val.charAt(length - 1);
            if (cCharAt == '%') {
                length--;
                unitValueOf = SVG.Unit.percent;
            } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(val.charAt(length - 2))) {
                length -= 2;
                String strSubstring = val.substring(length);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                try {
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = strSubstring.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    unitValueOf = SVG.Unit.valueOf(lowerCase);
                } catch (IllegalArgumentException unused) {
                    throw new SVGParseException("Invalid length unit specifier: ".concat(val), null, 2, null);
                }
            }
            try {
                return new SVG.Length(f(0, length, val), unitValueOf);
            } catch (NumberFormatException e5) {
                throw new SVGParseException("Invalid length value: ".concat(val), e5);
            }
        }

        @NotNull
        public final SVG.PathDefinition parsePath(@Nullable String val) {
            float f6;
            TextScanner textScanner = new TextScanner(val);
            SVG.PathDefinition pathDefinition = new SVG.PathDefinition();
            if (textScanner.empty()) {
                return pathDefinition;
            }
            Integer numNextChar = textScanner.nextChar();
            Character chValueOf = numNextChar != null ? Character.valueOf((char) numNextChar.intValue()) : null;
            char c10 = 'M';
            char c11 = 'm';
            if ((chValueOf == null || chValueOf.charValue() != 'M') && (chValueOf == null || chValueOf.charValue() != 'm')) {
                return pathDefinition;
            }
            Character chValueOf2 = chValueOf;
            float f10 = 0.0f;
            float f11 = 0.0f;
            float fNextFloat = 0.0f;
            float fCheckedNextFloat = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            while (true) {
                textScanner.skipWhitespace();
                if ((chValueOf2 != null && chValueOf2.charValue() == c10) || (chValueOf2 != null && chValueOf2.charValue() == c11)) {
                    float fNextFloat2 = textScanner.nextFloat();
                    float fCheckedNextFloat2 = textScanner.checkedNextFloat(fNextFloat2);
                    if (Float.isNaN(fCheckedNextFloat2)) {
                        chValueOf2.charValue();
                        return pathDefinition;
                    }
                    if (chValueOf2 != null && chValueOf2.charValue() == c11 && !pathDefinition.isEmpty()) {
                        fNextFloat2 += f10;
                        fCheckedNextFloat2 += f11;
                    }
                    f10 = fNextFloat2;
                    f11 = fCheckedNextFloat2;
                    pathDefinition.moveTo(f10, f11);
                    f12 = f10;
                    fCheckedNextFloat = f11;
                    f13 = fCheckedNextFloat;
                    chValueOf2 = (chValueOf2 != null && chValueOf2.charValue() == c11) ? 'l' : Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT);
                    fNextFloat = f12;
                } else {
                    if ((chValueOf2 != null && chValueOf2.charValue() == 'L') || (chValueOf2 != null && chValueOf2.charValue() == 'l')) {
                        float fNextFloat3 = textScanner.nextFloat();
                        float fCheckedNextFloat3 = textScanner.checkedNextFloat(fNextFloat3);
                        if (Float.isNaN(fCheckedNextFloat3)) {
                            chValueOf2.charValue();
                            return pathDefinition;
                        }
                        if (chValueOf2 != null && chValueOf2.charValue() == 'l') {
                            fNextFloat3 += f10;
                            fCheckedNextFloat3 += f11;
                        }
                        f10 = fNextFloat3;
                        f11 = fCheckedNextFloat3;
                        pathDefinition.lineTo(f10, f11);
                        fNextFloat = f10;
                    } else {
                        if ((chValueOf2 != null && chValueOf2.charValue() == 'C') || (chValueOf2 != null && chValueOf2.charValue() == 'c')) {
                            float fNextFloat4 = textScanner.nextFloat();
                            float fCheckedNextFloat4 = textScanner.checkedNextFloat(fNextFloat4);
                            float fCheckedNextFloat5 = textScanner.checkedNextFloat(fCheckedNextFloat4);
                            float fCheckedNextFloat6 = textScanner.checkedNextFloat(fCheckedNextFloat5);
                            float fCheckedNextFloat7 = textScanner.checkedNextFloat(fCheckedNextFloat6);
                            float fCheckedNextFloat8 = textScanner.checkedNextFloat(fCheckedNextFloat7);
                            if (Float.isNaN(fCheckedNextFloat8)) {
                                return pathDefinition;
                            }
                            if (chValueOf2 != null && chValueOf2.charValue() == 'c') {
                                fCheckedNextFloat7 += f10;
                                fCheckedNextFloat8 += f11;
                                fNextFloat4 += f10;
                                fCheckedNextFloat4 += f11;
                                fCheckedNextFloat5 += f10;
                                fCheckedNextFloat6 += f11;
                            }
                            float f14 = fCheckedNextFloat5;
                            f6 = fCheckedNextFloat6;
                            pathDefinition.cubicTo(fNextFloat4, fCheckedNextFloat4, f14, f6, fCheckedNextFloat7, fCheckedNextFloat8);
                            f10 = fCheckedNextFloat7;
                            fNextFloat = f14;
                            f11 = fCheckedNextFloat8;
                        } else if ((chValueOf2 != null && chValueOf2.charValue() == 'S') || (chValueOf2 != null && chValueOf2.charValue() == 's')) {
                            float f15 = 2;
                            float f16 = (f15 * f10) - fNextFloat;
                            float f17 = (f15 * f11) - fCheckedNextFloat;
                            float fNextFloat5 = textScanner.nextFloat();
                            float fCheckedNextFloat9 = textScanner.checkedNextFloat(fNextFloat5);
                            float fCheckedNextFloat10 = textScanner.checkedNextFloat(fCheckedNextFloat9);
                            float fCheckedNextFloat11 = textScanner.checkedNextFloat(fCheckedNextFloat10);
                            if (Float.isNaN(fCheckedNextFloat11)) {
                                chValueOf2.charValue();
                                return pathDefinition;
                            }
                            if (chValueOf2 != null && chValueOf2.charValue() == 's') {
                                fCheckedNextFloat10 += f10;
                                fCheckedNextFloat11 += f11;
                                fNextFloat5 += f10;
                                fCheckedNextFloat9 += f11;
                            }
                            float f18 = fNextFloat5;
                            f6 = fCheckedNextFloat9;
                            pathDefinition.cubicTo(f16, f17, f18, f6, fCheckedNextFloat10, fCheckedNextFloat11);
                            f10 = fCheckedNextFloat10;
                            f11 = fCheckedNextFloat11;
                            fNextFloat = f18;
                        } else if ((chValueOf2 != null && chValueOf2.charValue() == 'Z') || (chValueOf2 != null && chValueOf2.charValue() == 'z')) {
                            pathDefinition.close();
                            f10 = f12;
                            fNextFloat = f10;
                            f11 = f13;
                        } else if ((chValueOf2 != null && chValueOf2.charValue() == 'H') || (chValueOf2 != null && chValueOf2.charValue() == 'h')) {
                            float fNextFloat6 = textScanner.nextFloat();
                            if (Float.isNaN(fNextFloat6)) {
                                chValueOf2.charValue();
                                return pathDefinition;
                            }
                            if (chValueOf2 != null && chValueOf2.charValue() == 'h') {
                                fNextFloat6 += f10;
                            }
                            f10 = fNextFloat6;
                            pathDefinition.lineTo(f10, f11);
                            fNextFloat = f10;
                        } else if ((chValueOf2 != null && chValueOf2.charValue() == 'V') || (chValueOf2 != null && chValueOf2.charValue() == 'v')) {
                            float fNextFloat7 = textScanner.nextFloat();
                            if (Float.isNaN(fNextFloat7)) {
                                chValueOf2.charValue();
                                return pathDefinition;
                            }
                            if (chValueOf2 != null && chValueOf2.charValue() == 'v') {
                                fNextFloat7 += f11;
                            }
                            f11 = fNextFloat7;
                            pathDefinition.lineTo(f10, f11);
                        } else if ((chValueOf2 != null && chValueOf2.charValue() == 'Q') || (chValueOf2 != null && chValueOf2.charValue() == 'q')) {
                            fNextFloat = textScanner.nextFloat();
                            fCheckedNextFloat = textScanner.checkedNextFloat(fNextFloat);
                            float fCheckedNextFloat12 = textScanner.checkedNextFloat(fCheckedNextFloat);
                            float fCheckedNextFloat13 = textScanner.checkedNextFloat(fCheckedNextFloat12);
                            if (Float.isNaN(fCheckedNextFloat13)) {
                                return pathDefinition;
                            }
                            if (chValueOf2 != null && chValueOf2.charValue() == 'q') {
                                fCheckedNextFloat12 += f10;
                                fCheckedNextFloat13 += f11;
                                fNextFloat += f10;
                                fCheckedNextFloat += f11;
                            }
                            f10 = fCheckedNextFloat12;
                            f11 = fCheckedNextFloat13;
                            pathDefinition.quadTo(fNextFloat, fCheckedNextFloat, f10, f11);
                        } else {
                            if ((chValueOf2 == null || chValueOf2.charValue() != 'T') && (chValueOf2 == null || chValueOf2.charValue() != 't')) {
                                if ((chValueOf2 != null && chValueOf2.charValue() == 'A') || (chValueOf2 != null && chValueOf2.charValue() == 'a')) {
                                    float fNextFloat8 = textScanner.nextFloat();
                                    float fCheckedNextFloat14 = textScanner.checkedNextFloat(fNextFloat8);
                                    float fCheckedNextFloat15 = textScanner.checkedNextFloat(fCheckedNextFloat14);
                                    Boolean boolCheckedNextFlag = textScanner.checkedNextFlag(Float.valueOf(fCheckedNextFloat15));
                                    Boolean boolCheckedNextFlag2 = textScanner.checkedNextFlag(boolCheckedNextFlag);
                                    float fCheckedNextFloat16 = textScanner.checkedNextFloat(boolCheckedNextFlag2);
                                    float fCheckedNextFloat17 = textScanner.checkedNextFloat(fCheckedNextFloat16);
                                    if (Float.isNaN(fCheckedNextFloat17) || fNextFloat8 < 0.0f || fCheckedNextFloat14 < 0.0f) {
                                        chValueOf2.charValue();
                                    } else {
                                        if (chValueOf2 != null && chValueOf2.charValue() == 'a') {
                                            fCheckedNextFloat16 += f10;
                                            fCheckedNextFloat17 += f11;
                                        }
                                        Intrinsics.checkNotNull(boolCheckedNextFlag);
                                        boolean zBooleanValue = boolCheckedNextFlag.booleanValue();
                                        Intrinsics.checkNotNull(boolCheckedNextFlag2);
                                        pathDefinition.arcTo(fNextFloat8, fCheckedNextFloat14, fCheckedNextFloat15, zBooleanValue, boolCheckedNextFlag2.booleanValue(), fCheckedNextFloat16, fCheckedNextFloat17);
                                        f10 = fCheckedNextFloat16;
                                        fNextFloat = f10;
                                        f11 = fCheckedNextFloat17;
                                    }
                                }
                                return pathDefinition;
                            }
                            float f19 = 2;
                            fNextFloat = (f19 * f10) - fNextFloat;
                            fCheckedNextFloat = (f19 * f11) - fCheckedNextFloat;
                            float fNextFloat9 = textScanner.nextFloat();
                            float fCheckedNextFloat18 = textScanner.checkedNextFloat(fNextFloat9);
                            if (Float.isNaN(fCheckedNextFloat18)) {
                                return pathDefinition;
                            }
                            if (chValueOf2 != null && chValueOf2.charValue() == 't') {
                                fNextFloat9 += f10;
                                fCheckedNextFloat18 += f11;
                            }
                            f10 = fNextFloat9;
                            f11 = fCheckedNextFloat18;
                            pathDefinition.quadTo(fNextFloat, fCheckedNextFloat, f10, f11);
                        }
                        fCheckedNextFloat = f6;
                    }
                    fCheckedNextFloat = f11;
                }
                textScanner.skipCommaWhitespace();
                if (textScanner.empty()) {
                    return pathDefinition;
                }
                if (textScanner.hasLetter()) {
                    Integer numNextChar2 = textScanner.nextChar();
                    chValueOf2 = numNextChar2 != null ? Character.valueOf((char) numNextChar2.intValue()) : null;
                }
                c10 = 'M';
                c11 = 'm';
            }
        }

        @NotNull
        public final PreserveAspectRatio parsePreserveAspectRatio(@NotNull String val) throws SVGParseException {
            PreserveAspectRatio.Scale scale;
            Intrinsics.checkNotNullParameter(val, "val");
            TextScanner textScanner = new TextScanner(val);
            textScanner.skipWhitespace();
            PreserveAspectRatio.Scale scale2 = null;
            String strNextToken$default = TextScanner.nextToken$default(textScanner, (char) 0, false, 3, null);
            if (Intrinsics.areEqual("defer", strNextToken$default)) {
                textScanner.skipWhitespace();
                strNextToken$default = TextScanner.nextToken$default(textScanner, (char) 0, false, 3, null);
            }
            PreserveAspectRatio.Alignment alignment = (PreserveAspectRatio.Alignment) a.f51409a.get(strNextToken$default);
            textScanner.skipWhitespace();
            if (!textScanner.empty()) {
                String strNextToken$default2 = TextScanner.nextToken$default(textScanner, (char) 0, false, 3, null);
                if (Intrinsics.areEqual(strNextToken$default2, "meet")) {
                    scale = PreserveAspectRatio.Scale.meet;
                } else {
                    if (!Intrinsics.areEqual(strNextToken$default2, "slice")) {
                        throw new SVGParseException(androidx.camera.core.processing.f.d("Invalid preserveAspectRatio definition: ", val), null, 2, null);
                    }
                    scale = PreserveAspectRatio.Scale.slice;
                }
                scale2 = scale;
            }
            return new PreserveAspectRatio(alignment, scale2);
        }

        /* JADX WARN: Code duplicated, block: B:114:0x037f  */
        /* JADX WARN: Code duplicated, block: B:121:0x0394  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void processStyleProperty(@Nullable SVG.Style style, @Nullable String localName, @NotNull String val) {
            SVG.Style.LineCap lineCap;
            SVG.Style.LineJoin lineJoin;
            SVG.Length lengthNextLength;
            String fontWeight;
            Intrinsics.checkNotNullParameter(val, "val");
            if (val.length() == 0 || Intrinsics.areEqual(val, "inherit")) {
                return;
            }
            renderQuality = null;
            renderQuality = null;
            renderQuality = null;
            SVG.Style.RenderQuality renderQuality = null;
            SVG.Style.VectorEffect vectorEffect = null;
            cSSClipRect = null;
            cSSClipRect = null;
            SVG.CSSClipRect cSSClipRect = null;
            bool = null;
            bool = null;
            bool = null;
            bool = null;
            Boolean bool = null;
            textAnchor = null;
            textAnchor = null;
            textAnchor = null;
            SVG.Style.TextAnchor textAnchor = null;
            SVG.Style.TextDirection textDirection = null;
            textDecoration = null;
            textDecoration = null;
            textDecoration = null;
            textDecoration = null;
            textDecoration = null;
            SVG.Style.TextDecoration textDecoration = null;
            lengthArr = null;
            lengthArr = null;
            lengthArr = null;
            lengthArr = null;
            lengthArr = null;
            SVG.Length[] lengthArr = null;
            try {
                switch (WhenMappings.$EnumSwitchMapping$0[SVGAttr.Companion.fromString(localName).ordinal()]) {
                    case 1:
                        Intrinsics.checkNotNull(style);
                        style.setFill(n(val));
                        if (style.getFill() != null) {
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | 1);
                        }
                        break;
                    case 2:
                        Intrinsics.checkNotNull(style);
                        style.setFillRule(Intrinsics.areEqual("nonzero", val) ? SVG.Style.FillRule.NonZero : Intrinsics.areEqual("evenodd", val) ? SVG.Style.FillRule.EvenOdd : null);
                        if (style.getFillRule() != null) {
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | 2);
                        }
                        break;
                    case 3:
                        Intrinsics.checkNotNull(style);
                        style.setFillOpacity(m(val));
                        if (style.getFillOpacity() != null) {
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | 4);
                        }
                        break;
                    case 4:
                        Intrinsics.checkNotNull(style);
                        style.setStroke(n(val));
                        if (style.getStroke() != null) {
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | 8);
                        }
                        break;
                    case 5:
                        Intrinsics.checkNotNull(style);
                        style.setStrokeOpacity(m(val));
                        if (style.getStrokeOpacity() != null) {
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | 16);
                        }
                        break;
                    case 6:
                        Intrinsics.checkNotNull(style);
                        style.setStrokeWidth(parseLength(val));
                        style.setSpecifiedFlags(style.getSpecifiedFlags() | 32);
                        break;
                    case 7:
                        Intrinsics.checkNotNull(style);
                        if (Intrinsics.areEqual("butt", val)) {
                            lineCap = SVG.Style.LineCap.Butt;
                        } else if (Intrinsics.areEqual("round", val)) {
                            lineCap = SVG.Style.LineCap.Round;
                        } else {
                            lineCap = Intrinsics.areEqual("square", val) ? SVG.Style.LineCap.Square : null;
                        }
                        style.setStrokeLineCap(lineCap);
                        if (style.getStrokeLineCap() != null) {
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | 64);
                        }
                        break;
                    case 8:
                        Intrinsics.checkNotNull(style);
                        if (Intrinsics.areEqual("miter", val)) {
                            lineJoin = SVG.Style.LineJoin.Miter;
                        } else if (Intrinsics.areEqual("round", val)) {
                            lineJoin = SVG.Style.LineJoin.Round;
                        } else {
                            lineJoin = Intrinsics.areEqual("bevel", val) ? SVG.Style.LineJoin.Bevel : null;
                        }
                        style.setStrokeLineJoin(lineJoin);
                        if (style.getStrokeLineJoin() != null) {
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | 128);
                        }
                        break;
                    case 9:
                        Intrinsics.checkNotNull(style);
                        style.setStrokeMiterLimit(Float.valueOf(g(val)));
                        style.setSpecifiedFlags(style.getSpecifiedFlags() | 256);
                        break;
                    case 10:
                        if (!Intrinsics.areEqual("none", val)) {
                            Intrinsics.checkNotNull(style);
                            TextScanner textScanner = new TextScanner(val);
                            textScanner.skipWhitespace();
                            if (!textScanner.empty() && (lengthNextLength = textScanner.nextLength()) != null && !lengthNextLength.isNegative()) {
                                float value = lengthNextLength.getValue();
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(lengthNextLength);
                                while (true) {
                                    if (!textScanner.empty()) {
                                        textScanner.skipCommaWhitespace();
                                        SVG.Length lengthNextLength2 = textScanner.nextLength();
                                        if (lengthNextLength2 != null && !lengthNextLength2.isNegative()) {
                                            arrayList.add(lengthNextLength2);
                                            value += lengthNextLength2.getValue();
                                        }
                                    } else if (value != 0.0f) {
                                        lengthArr = (SVG.Length[]) arrayList.toArray(new SVG.Length[0]);
                                    }
                                }
                            }
                            style.setStrokeDashArray(lengthArr);
                            if (style.getStrokeDashArray() != null) {
                                style.setSpecifiedFlags(style.getSpecifiedFlags() | 512);
                            }
                        } else {
                            Intrinsics.checkNotNull(style);
                            style.setStrokeDashArray(null);
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | 512);
                        }
                        break;
                    case 11:
                        Intrinsics.checkNotNull(style);
                        style.setStrokeDashOffset(parseLength(val));
                        style.setSpecifiedFlags(style.getSpecifiedFlags() | 1024);
                        break;
                    case 12:
                        Intrinsics.checkNotNull(style);
                        style.setOpacity(m(val));
                        style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_OPACITY);
                        break;
                    case 13:
                        Intrinsics.checkNotNull(style);
                        style.setColor(d(val));
                        style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_COLOR);
                        break;
                    case 14:
                        if (StringsKt__StringsKt.contains$default((CharSequence) "|caption|icon|menu|message-box|small-caption|status-bar|", (CharSequence) h0.b("|", val, "|"), false, 2, (Object) null)) {
                            TextScanner textScanner2 = new TextScanner(val);
                            Integer num = null;
                            SVG.Style.FontStyle fontStyleJ = null;
                            String str = null;
                            while (true) {
                                fontWeight = TextScanner.nextToken$default(textScanner2, JsonPointer.SEPARATOR, false, 2, null);
                                textScanner2.skipWhitespace();
                                if (fontWeight == null) {
                                    break;
                                } else if (num == null || fontStyleJ == null) {
                                    if (!Intrinsics.areEqual(fontWeight, "normal")) {
                                        if (num == null) {
                                            HashMap map = d.f51412a;
                                            Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
                                            num = (Integer) d.f51412a.get(fontWeight);
                                            if (num != null) {
                                                continue;
                                            }
                                        }
                                        if (fontStyleJ != null || (fontStyleJ = j(fontWeight)) == null) {
                                            if (str == null && Intrinsics.areEqual(fontWeight, "small-caps")) {
                                                str = fontWeight;
                                            }
                                        }
                                    }
                                }
                            }
                            SVG.Length lengthI = i(fontWeight);
                            if (textScanner2.consume(JsonPointer.SEPARATOR)) {
                                textScanner2.skipWhitespace();
                                String strNextToken$default = TextScanner.nextToken$default(textScanner2, (char) 0, false, 3, null);
                                if (strNextToken$default != null) {
                                    parseLength(strNextToken$default);
                                }
                                textScanner2.skipWhitespace();
                            }
                            Intrinsics.checkNotNull(style);
                            style.setFontFamily(h(textScanner2.restOfText()));
                            style.setFontSize(lengthI);
                            if (num == null) {
                                num = 400;
                            }
                            style.setFontWeight(num);
                            if (fontStyleJ == null) {
                                fontStyleJ = SVG.Style.FontStyle.Normal;
                            }
                            style.setFontStyle(fontStyleJ);
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | 122880);
                            break;
                        }
                        break;
                    case 15:
                        Intrinsics.checkNotNull(style);
                        style.setFontFamily(h(val));
                        if (style.getFontFamily() != null) {
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_FONT_FAMILY);
                        }
                        break;
                    case 16:
                        Intrinsics.checkNotNull(style);
                        style.setFontSize(i(val));
                        if (style.getFontSize() != null) {
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | 16384);
                        }
                        break;
                    case 17:
                        Intrinsics.checkNotNull(style);
                        HashMap map2 = d.f51412a;
                        Intrinsics.checkNotNullParameter(val, "fontWeight");
                        style.setFontWeight((Integer) d.f51412a.get(val));
                        if (style.getFontWeight() != null) {
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_FONT_WEIGHT);
                        }
                        break;
                    case 18:
                        Intrinsics.checkNotNull(style);
                        style.setFontStyle(j(val));
                        if (style.getFontStyle() != null) {
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_FONT_STYLE);
                        }
                        break;
                    case 19:
                        Intrinsics.checkNotNull(style);
                        switch (val.hashCode()) {
                            case -1171789332:
                                if (val.equals("line-through")) {
                                    textDecoration = SVG.Style.TextDecoration.LineThrough;
                                }
                                break;
                            case -1026963764:
                                if (val.equals("underline")) {
                                    textDecoration = SVG.Style.TextDecoration.Underline;
                                }
                                break;
                            case 3387192:
                                if (val.equals("none")) {
                                    textDecoration = SVG.Style.TextDecoration.None;
                                }
                                break;
                            case 93826908:
                                if (val.equals("blink")) {
                                    textDecoration = SVG.Style.TextDecoration.Blink;
                                }
                                break;
                            case 529818312:
                                if (val.equals("overline")) {
                                    textDecoration = SVG.Style.TextDecoration.Overline;
                                }
                                break;
                        }
                        style.setTextDecoration(textDecoration);
                        if (style.getTextDecoration() != null) {
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_TEXT_DECORATION);
                        }
                        break;
                    case 20:
                        Intrinsics.checkNotNull(style);
                        if (Intrinsics.areEqual(val, "ltr")) {
                            textDirection = SVG.Style.TextDirection.LTR;
                        } else if (Intrinsics.areEqual(val, "rtl")) {
                            textDirection = SVG.Style.TextDirection.RTL;
                        }
                        style.setDirection(textDirection);
                        if (style.getDirection() != null) {
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_DIRECTION);
                        }
                        break;
                    case 21:
                        Intrinsics.checkNotNull(style);
                        int iHashCode = val.hashCode();
                        if (iHashCode != -1074341483) {
                            if (iHashCode != 100571) {
                                if (iHashCode == 109757538 && val.equals(EventDataKeys.Lifecycle.LIFECYCLE_START)) {
                                    textAnchor = SVG.Style.TextAnchor.Start;
                                }
                            } else if (val.equals("end")) {
                                textAnchor = SVG.Style.TextAnchor.End;
                            }
                        } else if (val.equals("middle")) {
                            textAnchor = SVG.Style.TextAnchor.Middle;
                        }
                        style.setTextAnchor(textAnchor);
                        if (style.getTextAnchor() != null) {
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_TEXT_ANCHOR);
                        }
                        break;
                    case 22:
                        Intrinsics.checkNotNull(style);
                        switch (val.hashCode()) {
                            case -1217487446:
                                if (val.equals(BaseMenuItem.STATE_HIDDEN)) {
                                    bool = Boolean.FALSE;
                                }
                                break;
                            case -907680051:
                                if (val.equals("scroll")) {
                                    bool = Boolean.FALSE;
                                }
                                break;
                            case 3005871:
                                if (val.equals(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                                    bool = Boolean.TRUE;
                                }
                                break;
                            case 466743410:
                                if (val.equals("visible")) {
                                    bool = Boolean.TRUE;
                                }
                                break;
                        }
                        style.setOverflow(bool);
                        if (style.getOverflow() != null) {
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_OVERFLOW);
                        }
                        break;
                    case 23:
                        Intrinsics.checkNotNull(style);
                        style.setMarkerStart(k(val));
                        style.setMarkerMid(style.getMarkerStart());
                        style.setMarkerEnd(style.getMarkerStart());
                        style.setSpecifiedFlags(style.getSpecifiedFlags() | 14680064);
                        break;
                    case 24:
                        Intrinsics.checkNotNull(style);
                        style.setMarkerStart(k(val));
                        style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_MARKER_START);
                        break;
                    case 25:
                        Intrinsics.checkNotNull(style);
                        style.setMarkerMid(k(val));
                        style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_MARKER_MID);
                        break;
                    case 26:
                        Intrinsics.checkNotNull(style);
                        style.setMarkerEnd(k(val));
                        style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_MARKER_END);
                        break;
                    case 27:
                        if (StringsKt__StringsKt.indexOf$default((CharSequence) val, '|', 0, false, 6, (Object) null) < 0 && StringsKt__StringsKt.contains$default((CharSequence) "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|", (CharSequence) h0.b("|", val, "|"), false, 2, (Object) null)) {
                            Intrinsics.checkNotNull(style);
                            style.setDisplay(Boolean.valueOf(!Intrinsics.areEqual(val, "none")));
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_DISPLAY);
                            break;
                        }
                        break;
                    case 28:
                        if (StringsKt__StringsKt.indexOf$default((CharSequence) val, '|', 0, false, 6, (Object) null) < 0 && StringsKt__StringsKt.contains$default((CharSequence) "|visible|hidden|collapse|", (CharSequence) h0.b("|", val, "|"), false, 2, (Object) null)) {
                            Intrinsics.checkNotNull(style);
                            style.setVisibility(Boolean.valueOf(Intrinsics.areEqual(val, "visible")));
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_VISIBILITY);
                            break;
                        }
                        break;
                    case 29:
                        if (Intrinsics.areEqual(val, "currentColor")) {
                            Intrinsics.checkNotNull(style);
                            style.setStopColor(SVG.CurrentColor.INSTANCE);
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_STOP_COLOR);
                        } else {
                            try {
                                Intrinsics.checkNotNull(style);
                                style.setStopColor(d(val));
                                style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_STOP_COLOR);
                            } catch (SVGParseException e5) {
                                String message = e5.getMessage();
                                Intrinsics.checkNotNull(message);
                                Log.w("SVGParser", message);
                                return;
                            }
                        }
                        break;
                    case 30:
                        Intrinsics.checkNotNull(style);
                        style.setStopOpacity(m(val));
                        style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_STOP_OPACITY);
                        break;
                    case 31:
                        Intrinsics.checkNotNull(style);
                        if (!Intrinsics.areEqual(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, val) && l.startsWith$default(val, "rect(", false, 2, null)) {
                            String strSubstring = val.substring(5);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                            TextScanner textScanner3 = new TextScanner(strSubstring);
                            textScanner3.skipWhitespace();
                            SVG.Length lengthL = l(textScanner3);
                            textScanner3.skipCommaWhitespace();
                            SVG.Length lengthL2 = l(textScanner3);
                            textScanner3.skipCommaWhitespace();
                            SVG.Length lengthL3 = l(textScanner3);
                            textScanner3.skipCommaWhitespace();
                            SVG.Length lengthL4 = l(textScanner3);
                            textScanner3.skipWhitespace();
                            if (textScanner3.consume(RootService.CLOSE_BRACKET) || textScanner3.empty()) {
                                cSSClipRect = new SVG.CSSClipRect(lengthL, lengthL2, lengthL3, lengthL4);
                            }
                        }
                        style.setClip(cSSClipRect);
                        if (style.getClip() != null) {
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | 1048576);
                        }
                        break;
                    case 32:
                        Intrinsics.checkNotNull(style);
                        style.setClipPath(k(val));
                        style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_CLIP_PATH);
                        break;
                    case 33:
                        Intrinsics.checkNotNull(style);
                        style.setClipRule(Intrinsics.areEqual("nonzero", val) ? SVG.Style.FillRule.NonZero : Intrinsics.areEqual("evenodd", val) ? SVG.Style.FillRule.EvenOdd : null);
                        style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_CLIP_RULE);
                        break;
                    case 34:
                        Intrinsics.checkNotNull(style);
                        style.setMask(k(val));
                        style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_MASK);
                        break;
                    case 35:
                        if (Intrinsics.areEqual(val, "currentColor")) {
                            Intrinsics.checkNotNull(style);
                            style.setSolidColor(SVG.CurrentColor.INSTANCE);
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_SOLID_COLOR);
                        } else {
                            try {
                                Intrinsics.checkNotNull(style);
                                style.setSolidColor(d(val));
                                style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_SOLID_COLOR);
                            } catch (SVGParseException e7) {
                                String message2 = e7.getMessage();
                                Intrinsics.checkNotNull(message2);
                                Log.w("SVGParser", message2);
                                return;
                            }
                        }
                        break;
                    case 36:
                        Intrinsics.checkNotNull(style);
                        style.setSolidOpacity(m(val));
                        style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_SOLID_OPACITY);
                        break;
                    case 37:
                        if (Intrinsics.areEqual(val, "currentColor")) {
                            Intrinsics.checkNotNull(style);
                            style.setViewportFill(SVG.CurrentColor.INSTANCE);
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_VIEWPORT_FILL);
                        } else {
                            try {
                                Intrinsics.checkNotNull(style);
                                style.setViewportFill(d(val));
                                style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_VIEWPORT_FILL);
                            } catch (SVGParseException e10) {
                                String message3 = e10.getMessage();
                                Intrinsics.checkNotNull(message3);
                                Log.w("SVGParser", message3);
                                return;
                            }
                        }
                        break;
                    case 38:
                        Intrinsics.checkNotNull(style);
                        style.setViewportFillOpacity(m(val));
                        style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_VIEWPORT_FILL_OPACITY);
                        break;
                    case 39:
                        Intrinsics.checkNotNull(style);
                        if (Intrinsics.areEqual(val, "none")) {
                            vectorEffect = SVG.Style.VectorEffect.None;
                        } else if (Intrinsics.areEqual(val, "non-scaling-stroke")) {
                            vectorEffect = SVG.Style.VectorEffect.NonScalingStroke;
                        }
                        style.setVectorEffect(vectorEffect);
                        if (style.getVectorEffect() != null) {
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_VECTOR_EFFECT);
                        }
                        break;
                    case 40:
                        Intrinsics.checkNotNull(style);
                        int iHashCode2 = val.hashCode();
                        if (iHashCode2 != -933002398) {
                            if (iHashCode2 != 3005871) {
                                if (iHashCode2 == 362741610 && val.equals("optimizeSpeed")) {
                                    renderQuality = SVG.Style.RenderQuality.optimizeSpeed;
                                }
                            } else if (val.equals(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                                renderQuality = SVG.Style.RenderQuality.auto;
                            }
                        } else if (val.equals("optimizeQuality")) {
                            renderQuality = SVG.Style.RenderQuality.optimizeQuality;
                        }
                        style.setImageRendering(renderQuality);
                        if (style.getImageRendering() != null) {
                            style.setSpecifiedFlags(style.getSpecifiedFlags() | SvgConstantsKt.SPECIFIED_IMAGE_RENDERING);
                        }
                        break;
                }
            } catch (SVGParseException unused) {
            }
        }

        public static final /* synthetic */ float access$parseFloat(Companion companion, String str, int i10, int i11) {
            companion.getClass();
            return f(i10, i11, str);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: SVGParser.kt */
    public static final class SVGAttr {
        public static final SVGAttr CLASS = new SVGAttr("CLASS", 0);
        public static final SVGAttr clip = new SVGAttr("clip", 1);
        public static final SVGAttr clip_path = new SVGAttr("clip_path", 2);
        public static final SVGAttr clipPathUnits = new SVGAttr("clipPathUnits", 3);
        public static final SVGAttr clip_rule = new SVGAttr("clip_rule", 4);
        public static final SVGAttr color = new SVGAttr("color", 5);
        public static final SVGAttr cx = new SVGAttr("cx", 6);
        public static final SVGAttr cy = new SVGAttr("cy", 7);
        public static final SVGAttr direction = new SVGAttr("direction", 8);
        public static final SVGAttr dx = new SVGAttr("dx", 9);
        public static final SVGAttr dy = new SVGAttr("dy", 10);
        public static final SVGAttr fx = new SVGAttr("fx", 11);
        public static final SVGAttr fy = new SVGAttr("fy", 12);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final SVGAttr f51395d = new SVGAttr("d", 13);
        public static final SVGAttr display = new SVGAttr("display", 14);
        public static final SVGAttr fill = new SVGAttr("fill", 15);
        public static final SVGAttr fill_rule = new SVGAttr("fill_rule", 16);
        public static final SVGAttr fill_opacity = new SVGAttr("fill_opacity", 17);
        public static final SVGAttr font = new SVGAttr("font", 18);
        public static final SVGAttr font_family = new SVGAttr("font_family", 19);
        public static final SVGAttr font_size = new SVGAttr("font_size", 20);
        public static final SVGAttr font_weight = new SVGAttr(FontsContractCompat.Columns.WEIGHT, 21);
        public static final SVGAttr font_style = new SVGAttr("font_style", 22);
        public static final SVGAttr gradientTransform = new SVGAttr("gradientTransform", 23);
        public static final SVGAttr gradientUnits = new SVGAttr("gradientUnits", 24);
        public static final SVGAttr height = new SVGAttr("height", 25);
        public static final SVGAttr href = new SVGAttr(SVGParser.XML_STYLESHEET_ATTR_HREF, 26);
        public static final SVGAttr image_rendering = new SVGAttr("image_rendering", 27);
        public static final SVGAttr marker = new SVGAttr("marker", 28);
        public static final SVGAttr marker_start = new SVGAttr("marker_start", 29);
        public static final SVGAttr marker_mid = new SVGAttr("marker_mid", 30);
        public static final SVGAttr marker_end = new SVGAttr("marker_end", 31);
        public static final SVGAttr markerHeight = new SVGAttr("markerHeight", 32);
        public static final SVGAttr markerUnits = new SVGAttr("markerUnits", 33);
        public static final SVGAttr markerWidth = new SVGAttr("markerWidth", 34);
        public static final SVGAttr mask = new SVGAttr("mask", 35);
        public static final SVGAttr maskContentUnits = new SVGAttr("maskContentUnits", 36);
        public static final SVGAttr maskUnits = new SVGAttr("maskUnits", 37);
        public static final SVGAttr media = new SVGAttr(SVGParser.XML_STYLESHEET_ATTR_MEDIA, 38);
        public static final SVGAttr offset = new SVGAttr(TypedValues.CycleType.S_WAVE_OFFSET, 39);
        public static final SVGAttr opacity = new SVGAttr("opacity", 40);
        public static final SVGAttr orient = new SVGAttr("orient", 41);
        public static final SVGAttr overflow = new SVGAttr("overflow", 42);
        public static final SVGAttr pathLength = new SVGAttr("pathLength", 43);
        public static final SVGAttr patternContentUnits = new SVGAttr("patternContentUnits", 44);
        public static final SVGAttr patternTransform = new SVGAttr("patternTransform", 45);
        public static final SVGAttr patternUnits = new SVGAttr("patternUnits", 46);
        public static final SVGAttr points = new SVGAttr("points", 47);
        public static final SVGAttr preserveAspectRatio = new SVGAttr("preserveAspectRatio", 48);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final SVGAttr f51396r = new SVGAttr("r", 49);
        public static final SVGAttr refX = new SVGAttr("refX", 50);
        public static final SVGAttr refY = new SVGAttr("refY", 51);
        public static final SVGAttr requiredFeatures = new SVGAttr("requiredFeatures", 52);
        public static final SVGAttr requiredExtensions = new SVGAttr("requiredExtensions", 53);
        public static final SVGAttr requiredFormats = new SVGAttr("requiredFormats", 54);
        public static final SVGAttr requiredFonts = new SVGAttr("requiredFonts", 55);
        public static final SVGAttr rx = new SVGAttr("rx", 56);
        public static final SVGAttr ry = new SVGAttr("ry", 57);
        public static final SVGAttr solid_color = new SVGAttr("solid_color", 58);
        public static final SVGAttr solid_opacity = new SVGAttr("solid_opacity", 59);
        public static final SVGAttr spreadMethod = new SVGAttr("spreadMethod", 60);
        public static final SVGAttr startOffset = new SVGAttr("startOffset", 61);
        public static final SVGAttr stop_color = new SVGAttr("stop_color", 62);
        public static final SVGAttr stop_opacity = new SVGAttr("stop_opacity", 63);
        public static final SVGAttr stroke = new SVGAttr("stroke", 64);
        public static final SVGAttr stroke_dasharray = new SVGAttr("stroke_dasharray", 65);
        public static final SVGAttr stroke_dashoffset = new SVGAttr("stroke_dashoffset", 66);
        public static final SVGAttr stroke_linecap = new SVGAttr("stroke_linecap", 67);
        public static final SVGAttr stroke_linejoin = new SVGAttr("stroke_linejoin", 68);
        public static final SVGAttr stroke_miterlimit = new SVGAttr("stroke_miterlimit", 69);
        public static final SVGAttr stroke_opacity = new SVGAttr("stroke_opacity", 70);
        public static final SVGAttr stroke_width = new SVGAttr("stroke_width", 71);
        public static final SVGAttr style = new SVGAttr("style", 72);
        public static final SVGAttr systemLanguage = new SVGAttr("systemLanguage", 73);
        public static final SVGAttr text_anchor = new SVGAttr("text_anchor", 74);
        public static final SVGAttr text_decoration = new SVGAttr("text_decoration", 75);
        public static final SVGAttr transform = new SVGAttr("transform", 76);
        public static final SVGAttr type = new SVGAttr("type", 77);
        public static final SVGAttr vector_effect = new SVGAttr("vector_effect", 78);
        public static final SVGAttr version = new SVGAttr("version", 79);
        public static final SVGAttr viewBox = new SVGAttr("viewBox", 80);
        public static final SVGAttr width = new SVGAttr("width", 81);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final SVGAttr f51397x = new SVGAttr("x", 82);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final SVGAttr f51400y = new SVGAttr("y", 83);

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        public static final SVGAttr f51398x1 = new SVGAttr("x1", 84);

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        public static final SVGAttr f51401y1 = new SVGAttr("y1", 85);

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public static final SVGAttr f51399x2 = new SVGAttr("x2", 86);

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        public static final SVGAttr f51402y2 = new SVGAttr("y2", 87);
        public static final SVGAttr viewport_fill = new SVGAttr("viewport_fill", 88);
        public static final SVGAttr viewport_fill_opacity = new SVGAttr("viewport_fill_opacity", 89);
        public static final SVGAttr visibility = new SVGAttr("visibility", 90);
        public static final SVGAttr UNSUPPORTED = new SVGAttr("UNSUPPORTED", 91);
        private static final /* synthetic */ SVGAttr[] $VALUES = {CLASS, clip, clip_path, clipPathUnits, clip_rule, color, cx, cy, direction, dx, dy, fx, fy, f51395d, display, fill, fill_rule, fill_opacity, font, font_family, font_size, font_weight, font_style, gradientTransform, gradientUnits, height, href, image_rendering, marker, marker_start, marker_mid, marker_end, markerHeight, markerUnits, markerWidth, mask, maskContentUnits, maskUnits, media, offset, opacity, orient, overflow, pathLength, patternContentUnits, patternTransform, patternUnits, points, preserveAspectRatio, f51396r, refX, refY, requiredFeatures, requiredExtensions, requiredFormats, requiredFonts, rx, ry, solid_color, solid_opacity, spreadMethod, startOffset, stop_color, stop_opacity, stroke, stroke_dasharray, stroke_dashoffset, stroke_linecap, stroke_linejoin, stroke_miterlimit, stroke_opacity, stroke_width, style, systemLanguage, text_anchor, text_decoration, transform, type, vector_effect, version, viewBox, width, f51397x, f51400y, f51398x1, f51401y1, f51399x2, f51402y2, viewport_fill, viewport_fill_opacity, visibility, UNSUPPORTED};

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private static final Map<String, SVGAttr> cache = new HashMap();

        /* JADX INFO: compiled from: SVGParser.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u001c\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVGParser$SVGAttr$Companion;", "", "()V", "cache", "", "", "Lcom/mastercard/sonic/androidsvg/SVGParser$SVGAttr;", "fromString", "str", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final SVGAttr fromString(@Nullable String str) {
                SVGAttr sVGAttr = (SVGAttr) SVGAttr.cache.get(str);
                return sVGAttr == null ? SVGAttr.UNSUPPORTED : sVGAttr;
            }
        }

        static {
            for (SVGAttr sVGAttr : values()) {
                if (sVGAttr == CLASS) {
                    cache.put(Name.LABEL, sVGAttr);
                } else if (sVGAttr != UNSUPPORTED) {
                    cache.put(l.replace$default(sVGAttr.name(), '_', '-', false, 4, (Object) null), sVGAttr);
                }
            }
        }

        public SVGAttr() {
            throw null;
        }

        public static SVGAttr valueOf(String str) {
            return (SVGAttr) Enum.valueOf(SVGAttr.class, str);
        }

        public static SVGAttr[] values() {
            return (SVGAttr[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: SVGParser.kt */
    public static final class SVGElem {
        private static final /* synthetic */ SVGElem[] $VALUES;

        @NotNull
        public static final Companion Companion;
        public static final SVGElem SWITCH;
        public static final SVGElem UNSUPPORTED;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SVGElem f51403a;

        @NotNull
        private static final Map<String, SVGElem> cache;
        public static final SVGElem circle;
        public static final SVGElem clipPath;
        public static final SVGElem defs;
        public static final SVGElem desc;
        public static final SVGElem ellipse;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final SVGElem f51404g;
        public static final SVGElem image;
        public static final SVGElem line;
        public static final SVGElem linearGradient;
        public static final SVGElem marker;
        public static final SVGElem mask;
        public static final SVGElem path;
        public static final SVGElem pattern;
        public static final SVGElem polygon;
        public static final SVGElem polyline;
        public static final SVGElem radialGradient;
        public static final SVGElem rect;
        public static final SVGElem solidColor;
        public static final SVGElem stop;
        public static final SVGElem style;
        public static final SVGElem svg;
        public static final SVGElem symbol;
        public static final SVGElem text;
        public static final SVGElem textPath;
        public static final SVGElem title;
        public static final SVGElem tref;
        public static final SVGElem tspan;
        public static final SVGElem use;
        public static final SVGElem view;

        /* JADX INFO: compiled from: SVGParser.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVGParser$SVGElem$Companion;", "", "()V", "cache", "", "", "Lcom/mastercard/sonic/androidsvg/SVGParser$SVGElem;", "fromString", "str", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final SVGElem fromString(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "str");
                SVGElem sVGElem = (SVGElem) SVGElem.cache.get(str);
                return sVGElem == null ? SVGElem.UNSUPPORTED : sVGElem;
            }
        }

        static {
            SVGElem sVGElem = new SVGElem("svg", 0);
            svg = sVGElem;
            SVGElem sVGElem2 = new SVGElem("a", 1);
            f51403a = sVGElem2;
            SVGElem sVGElem3 = new SVGElem("circle", 2);
            circle = sVGElem3;
            SVGElem sVGElem4 = new SVGElem("clipPath", 3);
            clipPath = sVGElem4;
            SVGElem sVGElem5 = new SVGElem("defs", 4);
            defs = sVGElem5;
            SVGElem sVGElem6 = new SVGElem("desc", 5);
            desc = sVGElem6;
            SVGElem sVGElem7 = new SVGElem("ellipse", 6);
            ellipse = sVGElem7;
            SVGElem sVGElem8 = new SVGElem("g", 7);
            f51404g = sVGElem8;
            SVGElem sVGElem9 = new SVGElem(AuthConstants.IMAGE, 8);
            image = sVGElem9;
            SVGElem sVGElem10 = new SVGElem("line", 9);
            line = sVGElem10;
            SVGElem sVGElem11 = new SVGElem("linearGradient", 10);
            linearGradient = sVGElem11;
            SVGElem sVGElem12 = new SVGElem("marker", 11);
            marker = sVGElem12;
            SVGElem sVGElem13 = new SVGElem("mask", 12);
            mask = sVGElem13;
            SVGElem sVGElem14 = new SVGElem("path", 13);
            path = sVGElem14;
            SVGElem sVGElem15 = new SVGElem("pattern", 14);
            pattern = sVGElem15;
            SVGElem sVGElem16 = new SVGElem("polygon", 15);
            polygon = sVGElem16;
            SVGElem sVGElem17 = new SVGElem("polyline", 16);
            polyline = sVGElem17;
            SVGElem sVGElem18 = new SVGElem("radialGradient", 17);
            radialGradient = sVGElem18;
            SVGElem sVGElem19 = new SVGElem("rect", 18);
            rect = sVGElem19;
            SVGElem sVGElem20 = new SVGElem("solidColor", 19);
            solidColor = sVGElem20;
            SVGElem sVGElem21 = new SVGElem("stop", 20);
            stop = sVGElem21;
            SVGElem sVGElem22 = new SVGElem("style", 21);
            style = sVGElem22;
            SVGElem sVGElem23 = new SVGElem("SWITCH", 22);
            SWITCH = sVGElem23;
            SVGElem sVGElem24 = new SVGElem("symbol", 23);
            symbol = sVGElem24;
            SVGElem sVGElem25 = new SVGElem("text", 24);
            text = sVGElem25;
            SVGElem sVGElem26 = new SVGElem("textPath", 25);
            textPath = sVGElem26;
            SVGElem sVGElem27 = new SVGElem("title", 26);
            title = sVGElem27;
            SVGElem sVGElem28 = new SVGElem("tref", 27);
            tref = sVGElem28;
            SVGElem sVGElem29 = new SVGElem("tspan", 28);
            tspan = sVGElem29;
            SVGElem sVGElem30 = new SVGElem("use", 29);
            use = sVGElem30;
            SVGElem sVGElem31 = new SVGElem("view", 30);
            view = sVGElem31;
            SVGElem sVGElem32 = new SVGElem("UNSUPPORTED", 31);
            UNSUPPORTED = sVGElem32;
            $VALUES = new SVGElem[]{sVGElem, sVGElem2, sVGElem3, sVGElem4, sVGElem5, sVGElem6, sVGElem7, sVGElem8, sVGElem9, sVGElem10, sVGElem11, sVGElem12, sVGElem13, sVGElem14, sVGElem15, sVGElem16, sVGElem17, sVGElem18, sVGElem19, sVGElem20, sVGElem21, sVGElem22, sVGElem23, sVGElem24, sVGElem25, sVGElem26, sVGElem27, sVGElem28, sVGElem29, sVGElem30, sVGElem31, sVGElem32};
            Companion = new Companion(null);
            cache = new HashMap();
            for (SVGElem sVGElem33 : values()) {
                if (sVGElem33 == SWITCH) {
                    cache.put("switch", sVGElem33);
                } else if (sVGElem33 != UNSUPPORTED) {
                    cache.put(sVGElem33.name(), sVGElem33);
                }
            }
        }

        public SVGElem() {
            throw null;
        }

        public static SVGElem valueOf(String str) {
            return (SVGElem) Enum.valueOf(SVGElem.class, str);
        }

        public static SVGElem[] values() {
            return (SVGElem[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: SVGParser.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0010\u0018\u00002\u00020\u0001B\u0011\u0012\b\u00101\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b<\u00100J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u0004J\u0010\u0010 \u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u0019J\u001e\u0010\"\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u0002H\u0007J\b\u0010#\u001a\u0004\u0018\u00010\u001cJ\b\u0010$\u001a\u0004\u0018\u00010\u001cJ\u0006\u0010%\u001a\u00020\u001cJ\b\u0010'\u001a\u0004\u0018\u00010&J\u0006\u0010(\u001a\u00020\u0002J\b\u0010)\u001a\u0004\u0018\u00010\u001cJ\b\u0010*\u001a\u0004\u0018\u00010\u001cR\"\u00101\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00108\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010;\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00103\u001a\u0004\b9\u00105\"\u0004\b:\u00107¨\u0006="}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVGParser$TextScanner;", "", "", "empty", "", "c", "isWhitespace", "", "skipWhitespace", "isEOL", "skipCommaWhitespace", "", "nextFloat", "possibleNextFloat", "lastRead", "checkedNextFloat", "(Ljava/lang/Boolean;)F", "nextChar", "()Ljava/lang/Integer;", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "nextLength", "nextFlag", "()Ljava/lang/Boolean;", "checkedNextFlag", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "", "ch", "consume", "", "str", "advanceChar", "terminator", "nextTokenWithWhitespace", "allowWhitespace", "nextToken", "nextWord", "nextFunction", "ahead", "Lcom/mastercard/sonic/androidsvg/SVG$Unit;", "nextUnit", "hasLetter", "nextQuotedString", "restOfText", "a", "Ljava/lang/String;", "getInput", "()Ljava/lang/String;", "setInput", "(Ljava/lang/String;)V", "input", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPosition", "()I", "setPosition", "(I)V", "position", "getInputLength", "setInputLength", "inputLength", "<init>", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSVGParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SVGParser.kt\ncom/mastercard/sonic/androidsvg/SVGParser$TextScanner\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,4171:1\n107#2:4172\n79#2,22:4173\n*S KotlinDebug\n*F\n+ 1 SVGParser.kt\ncom/mastercard/sonic/androidsvg/SVGParser$TextScanner\n*L\n2551#1:4172\n2551#1:4173,22\n*E\n"})
    public static class TextScanner {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String input;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public int position;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int inputLength;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final NumberParser f51408d = new NumberParser();

        public TextScanner(@Nullable String str) {
            Intrinsics.checkNotNull(str);
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = Intrinsics.compare((int) str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            String string = str.subSequence(i10, length + 1).toString();
            this.input = string;
            this.inputLength = string.length();
        }

        public static /* synthetic */ String nextToken$default(TextScanner textScanner, char c10, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextToken");
            }
            if ((i10 & 1) != 0) {
                c10 = ' ';
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return textScanner.nextToken(c10, z10);
        }

        public final int advanceChar() {
            int i10 = this.position;
            int i11 = this.inputLength;
            if (i10 == i11) {
                return -1;
            }
            int i12 = i10 + 1;
            this.position = i12;
            if (i12 < i11) {
                return this.input.charAt(i12);
            }
            return -1;
        }

        @NotNull
        public final String ahead() {
            int i10 = this.position;
            while (!empty() && !isWhitespace(this.input.charAt(this.position))) {
                this.position++;
            }
            String strSubstring = this.input.substring(i10, this.position);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            this.position = i10;
            return strSubstring;
        }

        @Nullable
        public final Boolean checkedNextFlag(@Nullable Object lastRead) {
            if (lastRead == null) {
                return null;
            }
            skipCommaWhitespace();
            return nextFlag();
        }

        public final float checkedNextFloat(float lastRead) {
            if (Float.isNaN(lastRead)) {
                return Float.NaN;
            }
            skipCommaWhitespace();
            return nextFloat();
        }

        public final boolean consume(char ch2) {
            int i10 = this.position;
            boolean z10 = i10 < this.inputLength && this.input.charAt(i10) == ch2;
            if (z10) {
                this.position++;
            }
            return z10;
        }

        public final boolean empty() {
            return this.position == this.inputLength;
        }

        @NotNull
        public final String getInput() {
            return this.input;
        }

        public final int getInputLength() {
            return this.inputLength;
        }

        public final int getPosition() {
            return this.position;
        }

        public final boolean hasLetter() {
            int i10 = this.position;
            if (i10 == this.inputLength) {
                return false;
            }
            char cCharAt = this.input.charAt(i10);
            return (Intrinsics.compare((int) cCharAt, 97) >= 0 && Intrinsics.compare((int) cCharAt, 122) <= 0) || (Intrinsics.compare((int) cCharAt, 65) >= 0 && Intrinsics.compare((int) cCharAt, 90) <= 0);
        }

        public final boolean isEOL(int c10) {
            return c10 == 10 || c10 == 13;
        }

        public final boolean isWhitespace(int c10) {
            return c10 == 32 || c10 == 10 || c10 == 13 || c10 == 9;
        }

        @Nullable
        public final Integer nextChar() {
            int i10 = this.position;
            if (i10 == this.inputLength) {
                return null;
            }
            String str = this.input;
            this.position = i10 + 1;
            return Integer.valueOf(str.charAt(i10));
        }

        @Nullable
        public final Boolean nextFlag() {
            int i10 = this.position;
            if (i10 == this.inputLength) {
                return null;
            }
            char cCharAt = this.input.charAt(i10);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.position++;
            return Boolean.valueOf(cCharAt == '1');
        }

        public final float nextFloat() {
            String str = this.input;
            int i10 = this.position;
            int i11 = this.inputLength;
            NumberParser numberParser = this.f51408d;
            float number = numberParser.parseNumber(str, i10, i11);
            if (!Float.isNaN(number)) {
                this.position = numberParser.getEndPos();
            }
            return number;
        }

        @Nullable
        public final String nextFunction() {
            if (empty()) {
                return null;
            }
            int i10 = this.position;
            int iCharAt = this.input.charAt(i10);
            while (true) {
                if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                    break;
                }
                iCharAt = advanceChar();
            }
            int i11 = this.position;
            while (isWhitespace(iCharAt)) {
                iCharAt = advanceChar();
            }
            if (iCharAt != 40) {
                this.position = i10;
                return null;
            }
            this.position++;
            String strSubstring = this.input.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        @Nullable
        public final SVG.Length nextLength() {
            float fNextFloat = nextFloat();
            if (Float.isNaN(fNextFloat)) {
                return null;
            }
            SVG.Unit unitNextUnit = nextUnit();
            return unitNextUnit == null ? new SVG.Length(fNextFloat, SVG.Unit.px) : new SVG.Length(fNextFloat, unitNextUnit);
        }

        @Nullable
        public final String nextQuotedString() {
            if (empty()) {
                return null;
            }
            int i10 = this.position;
            char cCharAt = this.input.charAt(i10);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iAdvanceChar = advanceChar();
            while (iAdvanceChar != -1 && iAdvanceChar != cCharAt) {
                iAdvanceChar = advanceChar();
            }
            if (iAdvanceChar == -1) {
                this.position = i10;
                return null;
            }
            int i11 = this.position;
            this.position = i11 + 1;
            String strSubstring = this.input.substring(i10 + 1, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        @JvmOverloads
        @Nullable
        public final String nextToken() {
            return nextToken$default(this, (char) 0, false, 3, null);
        }

        @Nullable
        public final String nextTokenWithWhitespace(char terminator) {
            return nextToken(terminator, true);
        }

        @Nullable
        public final SVG.Unit nextUnit() {
            if (empty()) {
                return null;
            }
            if (this.input.charAt(this.position) == '%') {
                this.position++;
                return SVG.Unit.percent;
            }
            int i10 = this.position;
            if (i10 > this.inputLength - 2) {
                return null;
            }
            try {
                String strSubstring = this.input.substring(i10, i10 + 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = strSubstring.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                SVG.Unit unitValueOf = SVG.Unit.valueOf(lowerCase);
                this.position += 2;
                return unitValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Nullable
        public final String nextWord() {
            if (empty()) {
                return null;
            }
            int i10 = this.position;
            char cCharAt = this.input.charAt(i10);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                this.position = i10;
                return null;
            }
            int iAdvanceChar = advanceChar();
            while (true) {
                if ((iAdvanceChar < 65 || iAdvanceChar > 90) && (iAdvanceChar < 97 || iAdvanceChar > 122)) {
                    break;
                }
                iAdvanceChar = advanceChar();
            }
            String strSubstring = this.input.substring(i10, this.position);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final float possibleNextFloat() {
            skipCommaWhitespace();
            String str = this.input;
            int i10 = this.position;
            int i11 = this.inputLength;
            NumberParser numberParser = this.f51408d;
            float number = numberParser.parseNumber(str, i10, i11);
            if (!Float.isNaN(number)) {
                this.position = numberParser.getEndPos();
            }
            return number;
        }

        @Nullable
        public final String restOfText() {
            if (empty()) {
                return null;
            }
            int i10 = this.position;
            this.position = this.inputLength;
            String strSubstring = this.input.substring(i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }

        public final void setInput(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.input = str;
        }

        public final void setInputLength(int i10) {
            this.inputLength = i10;
        }

        public final void setPosition(int i10) {
            this.position = i10;
        }

        public final boolean skipCommaWhitespace() {
            skipWhitespace();
            int i10 = this.position;
            if (i10 == this.inputLength || this.input.charAt(i10) != ',') {
                return false;
            }
            this.position++;
            skipWhitespace();
            return true;
        }

        public final void skipWhitespace() {
            while (true) {
                int i10 = this.position;
                if (i10 >= this.inputLength || !isWhitespace(this.input.charAt(i10))) {
                    return;
                } else {
                    this.position++;
                }
            }
        }

        @JvmOverloads
        @Nullable
        public final String nextToken(char c10) {
            return nextToken$default(this, c10, false, 2, null);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0025  */
        public final boolean consume(@NotNull String str) {
            boolean z10;
            Intrinsics.checkNotNullParameter(str, "str");
            int length = str.length();
            int i10 = this.position;
            if (i10 <= this.inputLength - length) {
                String strSubstring = this.input.substring(i10, i10 + length);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                if (Intrinsics.areEqual(strSubstring, str)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (z10) {
                this.position += length;
            }
            return z10;
        }

        @JvmOverloads
        @Nullable
        public final String nextToken(char terminator, boolean allowWhitespace) {
            if (empty()) {
                return null;
            }
            char cCharAt = this.input.charAt(this.position);
            if ((!allowWhitespace && isWhitespace(cCharAt)) || cCharAt == terminator) {
                return null;
            }
            int i10 = this.position;
            int iAdvanceChar = advanceChar();
            while (iAdvanceChar != -1 && iAdvanceChar != terminator && (allowWhitespace || !isWhitespace(iAdvanceChar))) {
                iAdvanceChar = advanceChar();
            }
            String strSubstring = this.input.substring(i10, this.position);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final float checkedNextFloat(@Nullable Boolean lastRead) {
            if (lastRead == null) {
                return Float.NaN;
            }
            skipCommaWhitespace();
            return nextFloat();
        }
    }

    /* JADX INFO: compiled from: SVGParser.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SVGElem.values().length];
            try {
                iArr[SVGElem.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SVGElem.f51404g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SVGElem.defs.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SVGElem.f51403a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SVGElem.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SVGElem.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SVGElem.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SVGElem.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SVGElem.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SVGElem.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SVGElem.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SVGElem.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SVGElem.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SVGElem.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SVGElem.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SVGElem.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SVGElem.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SVGElem.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[SVGElem.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[SVGElem.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[SVGElem.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[SVGElem.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[SVGElem.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[SVGElem.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[SVGElem.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[SVGElem.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[SVGElem.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[SVGElem.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[SVGElem.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[SVGElem.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[SVGElem.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SVGAttr.values().length];
            try {
                iArr2[SVGAttr.f51397x.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[SVGAttr.f51400y.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[SVGAttr.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[SVGAttr.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[SVGAttr.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[SVGAttr.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[SVGAttr.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[SVGAttr.f51395d.ordinal()] = 8;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr2[SVGAttr.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr2[SVGAttr.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr2[SVGAttr.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr2[SVGAttr.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr2[SVGAttr.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr2[SVGAttr.f51396r.ordinal()] = 14;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr2[SVGAttr.f51398x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr2[SVGAttr.f51401y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr2[SVGAttr.f51399x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr2[SVGAttr.f51402y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr2[SVGAttr.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr2[SVGAttr.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr2[SVGAttr.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr2[SVGAttr.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr2[SVGAttr.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr2[SVGAttr.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr2[SVGAttr.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr2[SVGAttr.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr2[SVGAttr.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr2[SVGAttr.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr2[SVGAttr.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr2[SVGAttr.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr2[SVGAttr.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr2[SVGAttr.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr2[SVGAttr.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr2[SVGAttr.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr2[SVGAttr.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr2[SVGAttr.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr2[SVGAttr.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr2[SVGAttr.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr2[SVGAttr.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr2[SVGAttr.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr2[SVGAttr.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr2[SVGAttr.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr2[SVGAttr.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr2[SVGAttr.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr2[SVGAttr.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr2[SVGAttr.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr2[SVGAttr.viewBox.ordinal()] = 47;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr2[SVGAttr.type.ordinal()] = 48;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr2[SVGAttr.media.ordinal()] = 49;
            } catch (NoSuchFieldError unused80) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: compiled from: SVGParser.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final HashMap f51409a;

        static {
            HashMap map = new HashMap(10);
            f51409a = map;
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

    /* JADX INFO: compiled from: SVGParser.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final HashMap f51410a;

        static {
            HashMap map = new HashMap(47);
            f51410a = map;
            ad.e.f(-984833, map, "aliceblue", -332841, "antiquewhite");
            ad.e.f(-16711681, map, "aqua", -8388652, "aquamarine");
            ad.e.f(-983041, map, "azure", -657956, "beige");
            ad.e.f(-6972, map, "bisque", ViewCompat.MEASURED_STATE_MASK, "black");
            ad.e.f(-5171, map, "blanchedalmond", -16776961, "blue");
            ad.e.f(-7722014, map, "blueviolet", -5952982, "brown");
            ad.e.f(-2180985, map, "burlywood", -10510688, "cadetblue");
            ad.e.f(-8388864, map, "chartreuse", -2987746, "chocolate");
            ad.e.f(-32944, map, "coral", -10185235, "cornflowerblue");
            ad.e.f(-1828, map, "cornsilk", -2354116, "crimson");
            ad.e.f(-16711681, map, "cyan", -16777077, "darkblue");
            ad.e.f(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
            ad.e.f(-5658199, map, "darkgray", -16751616, "darkgreen");
            ad.e.f(-5658199, map, "darkgrey", -4343957, "darkkhaki");
            ad.e.f(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
            ad.e.f(-29696, map, "darkorange", -6737204, "darkorchid");
            ad.e.f(-7667712, map, "darkred", -1468806, "darksalmon");
            ad.e.f(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
            ad.e.f(-13676721, map, "darkslategray", -13676721, "darkslategrey");
            ad.e.f(-16724271, map, "darkturquoise", -7077677, "darkviolet");
            ad.e.f(-60269, map, "deeppink", -16728065, "deepskyblue");
            ad.e.f(-9868951, map, "dimgray", -9868951, "dimgrey");
            ad.e.f(-14774017, map, "dodgerblue", -5103070, "firebrick");
            ad.e.f(-1296, map, "floralwhite", -14513374, "forestgreen");
            ad.e.f(-65281, map, "fuchsia", -2302756, "gainsboro");
            ad.e.f(-460545, map, "ghostwhite", -10496, "gold");
            ad.e.f(-2448096, map, "goldenrod", -8355712, "gray");
            ad.e.f(-16744448, map, "green", -5374161, "greenyellow");
            ad.e.f(-8355712, map, "grey", -983056, "honeydew");
            ad.e.f(-38476, map, "hotpink", -3318692, "indianred");
            ad.e.f(-11861886, map, "indigo", -16, "ivory");
            ad.e.f(-989556, map, "khaki", -1644806, "lavender");
            ad.e.f(-3851, map, "lavenderblush", -8586240, "lawngreen");
            ad.e.f(-1331, map, "lemonchiffon", -5383962, "lightblue");
            ad.e.f(-1015680, map, "lightcoral", -2031617, "lightcyan");
            ad.e.f(-329006, map, "lightgoldenrodyellow", -2894893, "lightgray");
            ad.e.f(-7278960, map, "lightgreen", -2894893, "lightgrey");
            ad.e.f(-18751, map, "lightpink", -24454, "lightsalmon");
            ad.e.f(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
            ad.e.f(-8943463, map, "lightslategray", -8943463, "lightslategrey");
            ad.e.f(-5192482, map, "lightsteelblue", -32, "lightyellow");
            ad.e.f(-16711936, map, "lime", -13447886, "limegreen");
            ad.e.f(-331546, map, "linen", -65281, "magenta");
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
            ad.e.f(-9404272, map, "slategray", -9404272, "slategrey");
            ad.e.f(-1286, map, "snow", -16711809, "springgreen");
            ad.e.f(-12156236, map, "steelblue", -2968436, "tan");
            ad.e.f(-16744320, map, "teal", -2572328, "thistle");
            ad.e.f(-40121, map, "tomato", -12525360, "turquoise");
            ad.e.f(-1146130, map, "violet", -663885, "wheat");
            ad.e.f(-1, map, "white", -657931, "whitesmoke");
            ad.e.f(InputDeviceCompat.SOURCE_ANY, map, "yellow", -6632142, "yellowgreen");
            map.put("transparent", 0);
        }
    }

    /* JADX INFO: compiled from: SVGParser.kt */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final HashMap f51411a;

        static {
            HashMap map = new HashMap(9);
            f51411a = map;
            SVG.Unit unit = SVG.Unit.pt;
            map.put("xx-small", new SVG.Length(0.694f, unit));
            map.put("x-small", new SVG.Length(0.833f, unit));
            map.put("small", new SVG.Length(10.0f, unit));
            map.put("medium", new SVG.Length(12.0f, unit));
            map.put("large", new SVG.Length(14.4f, unit));
            map.put("x-large", new SVG.Length(17.3f, unit));
            map.put("xx-large", new SVG.Length(20.7f, unit));
            SVG.Unit unit2 = SVG.Unit.percent;
            map.put("smaller", new SVG.Length(83.33f, unit2));
            map.put("larger", new SVG.Length(120.0f, unit2));
        }
    }

    /* JADX INFO: compiled from: SVGParser.kt */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final HashMap f51412a;

        static {
            HashMap map = new HashMap(13);
            f51412a = map;
            ad.e.f(400, map, "normal", 700, "bold");
            ad.e.f(1, map, "bolder", -1, "lighter");
            ad.e.f(100, map, "100", 200, Result.OK_RESPONSE_CODE);
            ad.e.f(300, map, "300", 400, "400");
            ad.e.f(500, map, Result.INTERNAL_ERROR_RESPONSE_CODE, 600, "600");
            ad.e.f(700, map, "700", StatusCode.SUCCESS, "800");
            map.put("900", Integer.valueOf(TypedValues.Custom.TYPE_INT));
        }
    }

    /* JADX INFO: compiled from: SVGParser.kt */
    public final class e extends DefaultHandler2 {
        public e() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void characters(@NotNull char[] ch2, int i10, int i11) throws SAXException {
            Intrinsics.checkNotNullParameter(ch2, "ch");
            SVGParser.this.C(new String(ch2, i10, i11));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endDocument() throws SAXException {
            SVGParser.this.getClass();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endElement(@NotNull String uri, @NotNull String localName, @NotNull String qName) throws SAXException {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(localName, "localName");
            Intrinsics.checkNotNullParameter(qName, "qName");
            SVGParser.this.f(uri, localName, qName);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void processingInstruction(@NotNull String target, @NotNull String data) throws SAXException {
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(data, "data");
            TextScanner textScanner = new TextScanner(data);
            SVGParser sVGParser = SVGParser.this;
            sVGParser.h(target, SVGParser.access$parseProcessingInstructionAttributes(sVGParser, textScanner));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startDocument() throws SAXException {
            SVGParser.access$startDocument(SVGParser.this);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startElement(@NotNull String uri, @NotNull String localName, @NotNull String qName, @NotNull Attributes attributes) throws SAXException {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(localName, "localName");
            Intrinsics.checkNotNullParameter(qName, "qName");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            SVGParser.this.z(uri, localName, qName, attributes);
        }
    }

    /* JADX INFO: compiled from: SVGParser.kt */
    public final class f implements Attributes {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final XmlPullParser f51414a;

        public f(@NotNull XmlPullParser parser) {
            Intrinsics.checkNotNullParameter(parser, "parser");
            this.f51414a = parser;
        }

        @Override // org.xml.sax.Attributes
        public final int getIndex(@NotNull String qName) {
            Intrinsics.checkNotNullParameter(qName, "qName");
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final int getLength() {
            return this.f51414a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        @NotNull
        public final String getLocalName(int i10) {
            String attributeName = this.f51414a.getAttributeName(i10);
            Intrinsics.checkNotNullExpressionValue(attributeName, "parser.getAttributeName(index)");
            return attributeName;
        }

        @Override // org.xml.sax.Attributes
        @NotNull
        public final String getQName(int i10) {
            XmlPullParser xmlPullParser = this.f51414a;
            String qName = xmlPullParser.getAttributeName(i10);
            if (xmlPullParser.getAttributePrefix(i10) != null) {
                qName = androidx.camera.core.impl.utils.a.b(xmlPullParser.getAttributePrefix(i10), DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, qName);
            }
            Intrinsics.checkNotNullExpressionValue(qName, "qName");
            return qName;
        }

        @Override // org.xml.sax.Attributes
        @Nullable
        public final String getType(int i10) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        @NotNull
        public final String getURI(int i10) {
            String attributeNamespace = this.f51414a.getAttributeNamespace(i10);
            Intrinsics.checkNotNullExpressionValue(attributeNamespace, "parser.getAttributeNamespace(index)");
            return attributeNamespace;
        }

        @Override // org.xml.sax.Attributes
        @Nullable
        public final String getValue(@NotNull String qName) {
            Intrinsics.checkNotNullParameter(qName, "qName");
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final int getIndex(@NotNull String uri, @NotNull String localName) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(localName, "localName");
            return -1;
        }

        @Override // org.xml.sax.Attributes
        @Nullable
        public final String getType(@NotNull String qName) {
            Intrinsics.checkNotNullParameter(qName, "qName");
            return null;
        }

        @Override // org.xml.sax.Attributes
        @Nullable
        public final String getValue(@NotNull String uri, @NotNull String localName) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(localName, "localName");
            return null;
        }

        @Override // org.xml.sax.Attributes
        @Nullable
        public final String getType(@NotNull String uri, @NotNull String localName) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(localName, "localName");
            return null;
        }

        @Override // org.xml.sax.Attributes
        @NotNull
        public final String getValue(int i10) {
            String attributeValue = this.f51414a.getAttributeValue(i10);
            Intrinsics.checkNotNullExpressionValue(attributeValue, "parser.getAttributeValue(index)");
            return attributeValue;
        }
    }

    public static final /* synthetic */ Map access$parseProcessingInstructionAttributes(SVGParser sVGParser, TextScanner textScanner) {
        sVGParser.getClass();
        return r(textScanner);
    }

    public static final void access$startDocument(SVGParser sVGParser) {
        sVGParser.getClass();
        sVGParser.f51386a = new SVG();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:40:0x008f A[DONT_GENERATE, SYNTHETIC] */
    public static void j(SVG.SvgConditional svgConditional, Attributes attributes) throws SVGParseException {
        String strB;
        List listAccess$parseFontFamily;
        HashSet hashSet;
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            String value = attributes.getValue(i10);
            int iF = ai.a.f(value, "attributes.getValue(i)", 1);
            int i11 = 0;
            boolean z10 = false;
            while (i11 <= iF) {
                boolean z11 = Intrinsics.compare((int) value.charAt(!z10 ? i11 : iF), 32) <= 0;
                if (z10) {
                    if (z11) {
                        iF--;
                    } else {
                        strB = k.b(iF, 1, value, i11);
                        switch (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i10)).ordinal()]) {
                            case 21:
                                svgConditional.setRequiredFeatures(Companion.access$parseRequiredFeatures(INSTANCE, strB));
                                break;
                            case 22:
                                svgConditional.setRequiredExtensions(strB);
                                break;
                            case 23:
                                svgConditional.setSystemLanguage(Companion.access$parseSystemLanguage(INSTANCE, strB));
                                break;
                            case 24:
                                svgConditional.setRequiredFormats(Companion.access$parseRequiredFormats(INSTANCE, strB));
                                break;
                            case 25:
                                listAccess$parseFontFamily = Companion.access$parseFontFamily(INSTANCE, strB);
                                if (listAccess$parseFontFamily != null) {
                                    hashSet = new HashSet(listAccess$parseFontFamily);
                                } else {
                                    hashSet = new HashSet(0);
                                }
                                svgConditional.setRequiredFonts(hashSet);
                                break;
                        }
                    }
                } else if (z11) {
                    i11++;
                } else {
                    z10 = true;
                }
            }
            strB = k.b(iF, 1, value, i11);
            switch (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case 21:
                    svgConditional.setRequiredFeatures(Companion.access$parseRequiredFeatures(INSTANCE, strB));
                    break;
                case 22:
                    svgConditional.setRequiredExtensions(strB);
                    break;
                case 23:
                    svgConditional.setSystemLanguage(Companion.access$parseSystemLanguage(INSTANCE, strB));
                    break;
                case 24:
                    svgConditional.setRequiredFormats(Companion.access$parseRequiredFormats(INSTANCE, strB));
                    break;
                case 25:
                    listAccess$parseFontFamily = Companion.access$parseFontFamily(INSTANCE, strB);
                    if (listAccess$parseFontFamily != null) {
                        hashSet = new HashSet(listAccess$parseFontFamily);
                    } else {
                        hashSet = new HashSet(0);
                    }
                    svgConditional.setRequiredFonts(hashSet);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:84:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00cd A[EDGE_INSN: B:89:0x00cd->B:62:0x00cd BREAK  A[LOOP:2: B:47:0x00aa->B:90:0x00aa], SYNTHETIC] */
    public static void k(SVG.SvgElementBase svgElementBase, Attributes attributes) throws SVGParseException {
        String value;
        int iF;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int length = attributes.getLength();
        for (int i12 = 0; i12 < length; i12++) {
            String qName = attributes.getQName(i12);
            if (qName != null) {
                int iHashCode = qName.hashCode();
                if (iHashCode == -755528866) {
                    if (qName.equals("xml:id")) {
                        value = attributes.getValue(i12);
                        iF = ai.a.f(value, "attributes.getValue(i)", 1);
                        i10 = 0;
                        z10 = false;
                        while (i10 <= iF) {
                            if (z10) {
                                i11 = i10;
                            } else {
                                i11 = iF;
                            }
                            if (Intrinsics.compare((int) value.charAt(i11), 32) <= 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z10) {
                                if (!z11) {
                                    break;
                                    break;
                                }
                                iF--;
                            } else if (z11) {
                                z10 = true;
                            } else {
                                i10++;
                            }
                        }
                        svgElementBase.setId(value.subSequence(i10, iF + 1).toString());
                        return;
                    }
                } else if (iHashCode != 3355) {
                    if (iHashCode == 1972840419 && qName.equals("xml:space")) {
                        String value2 = attributes.getValue(i12);
                        int iF2 = ai.a.f(value2, "attributes.getValue(i)", 1);
                        int i13 = 0;
                        boolean z12 = false;
                        while (i13 <= iF2) {
                            boolean z13 = Intrinsics.compare((int) value2.charAt(!z12 ? i13 : iF2), 32) <= 0;
                            if (z12) {
                                if (!z13) {
                                    break;
                                } else {
                                    iF2--;
                                }
                            } else if (z13) {
                                i13++;
                            } else {
                                z12 = true;
                            }
                        }
                        String strB = k.b(iF2, 1, value2, i13);
                        if (Intrinsics.areEqual("default", strB)) {
                            svgElementBase.setSpacePreserve(Boolean.FALSE);
                            return;
                        } else {
                            if (!Intrinsics.areEqual("preserve", strB)) {
                                throw new SVGParseException(androidx.camera.core.processing.f.d("Invalid value for \"xml:space\" attribute: ", strB), null, 2, null);
                            }
                            svgElementBase.setSpacePreserve(Boolean.TRUE);
                            return;
                        }
                    }
                } else if (qName.equals("id")) {
                    value = attributes.getValue(i12);
                    iF = ai.a.f(value, "attributes.getValue(i)", 1);
                    i10 = 0;
                    z10 = false;
                    while (i10 <= iF) {
                        if (z10) {
                            i11 = iF;
                        } else {
                            i11 = i10;
                        }
                        if (Intrinsics.compare((int) value.charAt(i11), 32) <= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z10) {
                            if (!z11) {
                                break;
                            } else {
                                iF--;
                            }
                        } else if (z11) {
                            i10++;
                        } else {
                            z10 = true;
                        }
                    }
                    svgElementBase.setId(value.subSequence(i10, iF + 1).toString());
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7 A[DONT_GENERATE, SYNTHETIC] */
    public static void l(SVG.GradientElement gradientElement, Attributes attributes) throws SVGParseException {
        String strB;
        int i10;
        int length = attributes.getLength();
        for (int i11 = 0; i11 < length; i11++) {
            String value = attributes.getValue(i11);
            int iF = ai.a.f(value, "attributes.getValue(i)", 1);
            int i12 = 0;
            boolean z10 = false;
            while (i12 <= iF) {
                boolean z11 = Intrinsics.compare((int) value.charAt(!z10 ? i12 : iF), 32) <= 0;
                if (z10) {
                    if (z11) {
                        iF--;
                    } else {
                        strB = k.b(iF, 1, value, i12);
                        i10 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i11)).ordinal()];
                        if (i10 != 6) {
                            switch (i10) {
                                case 32:
                                    if (Intrinsics.areEqual("objectBoundingBox", strB)) {
                                        if (Intrinsics.areEqual("userSpaceOnUse", strB)) {
                                            throw new SVGParseException("Invalid value for attribute gradientUnits", null, 2, null);
                                        }
                                        gradientElement.setGradientUnitsAreUser(Boolean.TRUE);
                                    } else {
                                        gradientElement.setGradientUnitsAreUser(Boolean.FALSE);
                                    }
                                    break;
                                case 33:
                                    gradientElement.setGradientTransform(s(strB));
                                    break;
                                case 34:
                                    try {
                                        gradientElement.setSpreadMethod(SVG.GradientSpread.valueOf(strB));
                                    } catch (IllegalArgumentException unused) {
                                        throw new SVGParseException(h0.b("Invalid spreadMethod attribute. \"", strB, "\" is not a valid value."), null, 2, null);
                                    }
                                    break;
                            }
                        } else if (Intrinsics.areEqual("", attributes.getURI(i11)) || Intrinsics.areEqual("http://www.w3.org/1999/xlink", attributes.getURI(i11))) {
                            gradientElement.setHref(strB);
                        }
                    }
                } else if (z11) {
                    i12++;
                } else {
                    z10 = true;
                }
            }
            strB = k.b(iF, 1, value, i12);
            i10 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i11)).ordinal()];
            if (i10 != 6) {
                switch (i10) {
                    case 32:
                        if (Intrinsics.areEqual("objectBoundingBox", strB)) {
                            if (Intrinsics.areEqual("userSpaceOnUse", strB)) {
                                throw new SVGParseException("Invalid value for attribute gradientUnits", null, 2, null);
                            }
                            gradientElement.setGradientUnitsAreUser(Boolean.TRUE);
                        } else {
                            gradientElement.setGradientUnitsAreUser(Boolean.FALSE);
                        }
                        break;
                    case 33:
                        gradientElement.setGradientTransform(s(strB));
                        break;
                    case 34:
                        gradientElement.setSpreadMethod(SVG.GradientSpread.valueOf(strB));
                        break;
                }
            } else if (Intrinsics.areEqual("", attributes.getURI(i11))) {
                gradientElement.setHref(strB);
            } else {
                gradientElement.setHref(strB);
            }
        }
    }

    public static void m(SVG.PolyLine polyLine, Attributes attributes, String str) throws SVGParseException {
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            if (SVGAttr.Companion.fromString(attributes.getLocalName(i10)) == SVGAttr.points) {
                TextScanner textScanner = new TextScanner(attributes.getValue(i10));
                ArrayList arrayList = new ArrayList();
                textScanner.skipWhitespace();
                while (!textScanner.empty()) {
                    float fNextFloat = textScanner.nextFloat();
                    if (Float.isNaN(fNextFloat)) {
                        throw new SVGParseException(h0.b("Invalid <", str, "> points attribute. Non-coordinate content found in list."), null, 2, null);
                    }
                    textScanner.skipCommaWhitespace();
                    float fNextFloat2 = textScanner.nextFloat();
                    if (Float.isNaN(fNextFloat2)) {
                        throw new SVGParseException(h0.b("Invalid <", str, "> points attribute. There should be an even number of coordinates."), null, 2, null);
                    }
                    textScanner.skipCommaWhitespace();
                    arrayList.add(Float.valueOf(fNextFloat));
                    arrayList.add(Float.valueOf(fNextFloat2));
                }
                polyLine.setPoints(new float[arrayList.size()]);
                Iterator it = arrayList.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    float fFloatValue = ((Number) it.next()).floatValue();
                    float[] points = polyLine.getPoints();
                    Intrinsics.checkNotNull(points);
                    points[i11] = fFloatValue;
                    i11++;
                }
            }
        }
    }

    public static void n(SVG.SvgElementBase svgElementBase, Attributes attributes) throws SVGParseException {
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            String value = attributes.getValue(i10);
            int iF = ai.a.f(value, "attributes.getValue(i)", 1);
            int i11 = 0;
            boolean z10 = false;
            while (i11 <= iF) {
                boolean z11 = Intrinsics.compare((int) value.charAt(!z10 ? i11 : iF), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        iF--;
                    }
                } else if (z11) {
                    i11++;
                } else {
                    z10 = true;
                }
            }
            String strB = k.b(iF, 1, value, i11);
            if (strB.length() != 0) {
                int i12 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i10)).ordinal()];
                if (i12 == 45) {
                    Companion.access$parseStyle(INSTANCE, svgElementBase, strB);
                } else if (i12 != 46) {
                    if (svgElementBase.getBaseStyle() == null) {
                        svgElementBase.setBaseStyle(new SVG.Style());
                    }
                    Companion companion = INSTANCE;
                    SVG.Style baseStyle = svgElementBase.getBaseStyle();
                    String localName = attributes.getLocalName(i10);
                    String value2 = attributes.getValue(i10);
                    int iF2 = ai.a.f(value2, "attributes.getValue(i)", 1);
                    int i13 = 0;
                    boolean z12 = false;
                    while (i13 <= iF2) {
                        boolean z13 = Intrinsics.compare((int) value2.charAt(!z12 ? i13 : iF2), 32) <= 0;
                        if (z12) {
                            if (!z13) {
                                break;
                            } else {
                                iF2--;
                            }
                        } else if (z13) {
                            i13++;
                        } else {
                            z12 = true;
                        }
                    }
                    companion.processStyleProperty(baseStyle, localName, k.b(iF2, 1, value2, i13));
                } else {
                    svgElementBase.setClassNames(CSSParser.Companion.parseClassAttribute(strB));
                }
            }
        }
    }

    public static void o(SVG.TextPositionedContainer textPositionedContainer, Attributes attributes) throws SVGParseException {
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            String value = attributes.getValue(i10);
            int iF = ai.a.f(value, "attributes.getValue(i)", 1);
            int i11 = 0;
            boolean z10 = false;
            while (i11 <= iF) {
                boolean z11 = Intrinsics.compare((int) value.charAt(!z10 ? i11 : iF), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        iF--;
                    }
                } else if (z11) {
                    i11++;
                } else {
                    z10 = true;
                }
            }
            String strB = k.b(iF, 1, value, i11);
            int i12 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i12 == 1) {
                textPositionedContainer.setX(Companion.access$parseLengthList(INSTANCE, strB));
            } else if (i12 == 2) {
                textPositionedContainer.setY(Companion.access$parseLengthList(INSTANCE, strB));
            } else if (i12 == 19) {
                textPositionedContainer.setDx(Companion.access$parseLengthList(INSTANCE, strB));
            } else if (i12 == 20) {
                textPositionedContainer.setDy(Companion.access$parseLengthList(INSTANCE, strB));
            }
        }
    }

    public static void p(SVG.HasTransform hasTransform, Attributes attributes) throws SVGParseException {
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            if (SVGAttr.Companion.fromString(attributes.getLocalName(i10)) == SVGAttr.transform) {
                String value = attributes.getValue(i10);
                Intrinsics.checkNotNullExpressionValue(value, "attributes.getValue(i)");
                hasTransform.setTransform(s(value));
            }
        }
    }

    public static void q(SVG.SvgViewBoxContainer svgViewBoxContainer, Attributes attributes) throws SVGParseException {
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            String value = attributes.getValue(i10);
            int iF = ai.a.f(value, "attributes.getValue(i)", 1);
            int i11 = 0;
            boolean z10 = false;
            while (i11 <= iF) {
                boolean z11 = Intrinsics.compare((int) value.charAt(!z10 ? i11 : iF), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        iF--;
                    }
                } else if (z11) {
                    i11++;
                } else {
                    z10 = true;
                }
            }
            String strB = k.b(iF, 1, value, i11);
            int i12 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i12 == 7) {
                Companion.access$parsePreserveAspectRatio(INSTANCE, svgViewBoxContainer, strB);
            } else if (i12 == 47) {
                svgViewBoxContainer.setViewBox(Companion.access$parseViewBox(INSTANCE, strB));
            }
        }
    }

    public static HashMap r(TextScanner textScanner) {
        HashMap map = new HashMap();
        textScanner.skipWhitespace();
        String strNextToken$default = TextScanner.nextToken$default(textScanner, '=', false, 2, null);
        while (strNextToken$default != null) {
            textScanner.consume('=');
            map.put(strNextToken$default, textScanner.nextQuotedString());
            textScanner.skipWhitespace();
            strNextToken$default = TextScanner.nextToken$default(textScanner, '=', false, 2, null);
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01d2 A[LOOP:0: B:3:0x000d->B:77:0x01d2, LOOP_END] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static android.graphics.Matrix s(String str) throws SVGParseException {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        while (!textScanner.empty()) {
            String strNextFunction = textScanner.nextFunction();
            if (strNextFunction == null) {
                throw new SVGParseException(androidx.camera.core.processing.f.d("Bad transform function encountered in transform list: ", str), null, 2, null);
            }
            switch (strNextFunction.hashCode()) {
                case -1081239615:
                    if (!strNextFunction.equals("matrix")) {
                        throw new SVGParseException(h0.b("Invalid transform list fn: ", strNextFunction, ")"), null, 2, null);
                    }
                    textScanner.skipWhitespace();
                    float fNextFloat = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float fNextFloat2 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float fNextFloat3 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float fNextFloat4 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float fNextFloat5 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float fNextFloat6 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fNextFloat6) || !textScanner.consume(RootService.CLOSE_BRACKET)) {
                        throw new SVGParseException(androidx.camera.core.processing.f.d("Invalid transform list: ", str), null, 2, null);
                    }
                    android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                    matrix2.setValues(new float[]{fNextFloat, fNextFloat3, fNextFloat5, fNextFloat2, fNextFloat4, fNextFloat6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    if (!textScanner.empty()) {
                        return matrix;
                    }
                    textScanner.skipCommaWhitespace();
                    break;
                    break;
                case -925180581:
                    if (!strNextFunction.equals("rotate")) {
                        throw new SVGParseException(h0.b("Invalid transform list fn: ", strNextFunction, ")"), null, 2, null);
                    }
                    textScanner.skipWhitespace();
                    float fNextFloat7 = textScanner.nextFloat();
                    float fPossibleNextFloat = textScanner.possibleNextFloat();
                    float fPossibleNextFloat2 = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fNextFloat7) || !textScanner.consume(RootService.CLOSE_BRACKET)) {
                        throw new SVGParseException(androidx.camera.core.processing.f.d("Invalid transform list: ", str), null, 2, null);
                    }
                    if (Float.isNaN(fPossibleNextFloat)) {
                        matrix.preRotate(fNextFloat7);
                    } else {
                        if (Float.isNaN(fPossibleNextFloat2)) {
                            throw new SVGParseException(androidx.camera.core.processing.f.d("Invalid transform list: ", str), null, 2, null);
                        }
                        matrix.preRotate(fNextFloat7, fPossibleNextFloat, fPossibleNextFloat2);
                    }
                    if (!textScanner.empty()) {
                        return matrix;
                    }
                    textScanner.skipCommaWhitespace();
                    break;
                    break;
                case 109250890:
                    if (!strNextFunction.equals(ImageScaleTypeHandler.ID)) {
                        throw new SVGParseException(h0.b("Invalid transform list fn: ", strNextFunction, ")"), null, 2, null);
                    }
                    textScanner.skipWhitespace();
                    float fNextFloat8 = textScanner.nextFloat();
                    float fPossibleNextFloat3 = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fNextFloat8) || !textScanner.consume(RootService.CLOSE_BRACKET)) {
                        throw new SVGParseException(androidx.camera.core.processing.f.d("Invalid transform list: ", str), null, 2, null);
                    }
                    if (Float.isNaN(fPossibleNextFloat3)) {
                        matrix.preScale(fNextFloat8, fNextFloat8);
                    } else {
                        matrix.preScale(fNextFloat8, fPossibleNextFloat3);
                    }
                    if (!textScanner.empty()) {
                        return matrix;
                    }
                    textScanner.skipCommaWhitespace();
                    break;
                    break;
                case 109493390:
                    if (!strNextFunction.equals("skewX")) {
                        throw new SVGParseException(h0.b("Invalid transform list fn: ", strNextFunction, ")"), null, 2, null);
                    }
                    textScanner.skipWhitespace();
                    float fNextFloat9 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fNextFloat9) || !textScanner.consume(RootService.CLOSE_BRACKET)) {
                        throw new SVGParseException(androidx.camera.core.processing.f.d("Invalid transform list: ", str), null, 2, null);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fNextFloat9)), 0.0f);
                    if (!textScanner.empty()) {
                        return matrix;
                    }
                    textScanner.skipCommaWhitespace();
                    break;
                    break;
                case 109493391:
                    if (!strNextFunction.equals("skewY")) {
                        throw new SVGParseException(h0.b("Invalid transform list fn: ", strNextFunction, ")"), null, 2, null);
                    }
                    textScanner.skipWhitespace();
                    float fNextFloat10 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fNextFloat10) || !textScanner.consume(RootService.CLOSE_BRACKET)) {
                        throw new SVGParseException(androidx.camera.core.processing.f.d("Invalid transform list: ", str), null, 2, null);
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fNextFloat10)));
                    if (!textScanner.empty()) {
                        return matrix;
                    }
                    textScanner.skipCommaWhitespace();
                    break;
                    break;
                case 1052832078:
                    if (!strNextFunction.equals("translate")) {
                        throw new SVGParseException(h0.b("Invalid transform list fn: ", strNextFunction, ")"), null, 2, null);
                    }
                    textScanner.skipWhitespace();
                    float fNextFloat11 = textScanner.nextFloat();
                    float fPossibleNextFloat4 = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fNextFloat11) || !textScanner.consume(RootService.CLOSE_BRACKET)) {
                        throw new SVGParseException(androidx.camera.core.processing.f.d("Invalid transform list: ", str), null, 2, null);
                    }
                    if (Float.isNaN(fPossibleNextFloat4)) {
                        matrix.preTranslate(fNextFloat11, 0.0f);
                    } else {
                        matrix.preTranslate(fNextFloat11, fPossibleNextFloat4);
                    }
                    if (!textScanner.empty()) {
                        return matrix;
                    }
                    textScanner.skipCommaWhitespace();
                    break;
                    break;
                default:
                    throw new SVGParseException(h0.b("Invalid transform list fn: ", strNextFunction, ")"), null, 2, null);
            }
        }
        return matrix;
    }

    public final void A(Attributes attributes) throws SVGParseException {
        SVG.Svg svg = new SVG.Svg();
        svg.setDocument(this.f51386a);
        svg.setParent(this.f51387b);
        k(svg, attributes);
        n(svg, attributes);
        j(svg, attributes);
        q(svg, attributes);
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            String value = attributes.getValue(i10);
            int iF = ai.a.f(value, "attributes.getValue(i)", 1);
            int i11 = 0;
            boolean z10 = false;
            while (i11 <= iF) {
                boolean z11 = Intrinsics.compare((int) value.charAt(!z10 ? i11 : iF), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        iF--;
                    }
                } else if (z11) {
                    i11++;
                } else {
                    z10 = true;
                }
            }
            String strB = k.b(iF, 1, value, i11);
            int i12 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i12 == 1) {
                svg.setX(INSTANCE.parseLength(strB));
            } else if (i12 == 2) {
                svg.setY(INSTANCE.parseLength(strB));
            } else if (i12 == 3) {
                svg.setWidth(INSTANCE.parseLength(strB));
                SVG.Length width = svg.getWidth();
                Intrinsics.checkNotNull(width);
                if (width.isNegative()) {
                    throw new SVGParseException("Invalid <svg> element. width cannot be negative", null, 2, null);
                }
            } else if (i12 == 4) {
                svg.setHeight(INSTANCE.parseLength(strB));
                SVG.Length height = svg.getHeight();
                Intrinsics.checkNotNull(height);
                if (height.isNegative()) {
                    throw new SVGParseException("Invalid <svg> element. height cannot be negative", null, 2, null);
                }
            } else if (i12 == 5) {
                svg.setVersion(strB);
            }
        }
        SVG.SvgContainer svgContainer = this.f51387b;
        if (svgContainer == null) {
            SVG svg2 = this.f51386a;
            Intrinsics.checkNotNull(svg2);
            svg2.setRootElement(svg);
        } else {
            Intrinsics.checkNotNull(svgContainer);
            svgContainer.addChild(svg);
        }
        this.f51387b = svg;
    }

    public final void B(int i10, char[] cArr, int i11) throws SVGParseException {
        if (this.f51388c) {
            return;
        }
        if (this.f51390e) {
            if (this.f51392g == null) {
                this.f51392g = new StringBuilder(i11);
            }
            StringBuilder sb2 = this.f51392g;
            Intrinsics.checkNotNull(sb2);
            sb2.append(cArr, i10, i11);
            return;
        }
        if (!this.f51393h) {
            if (this.f51387b instanceof SVG.TextContainer) {
                b(new String(cArr, i10, i11));
            }
        } else {
            if (this.f51394i == null) {
                this.f51394i = new StringBuilder(i11);
            }
            StringBuilder sb3 = this.f51394i;
            Intrinsics.checkNotNull(sb3);
            sb3.append(cArr, i10, i11);
        }
    }

    public final void C(String str) throws SVGParseException {
        if (this.f51388c) {
            return;
        }
        if (this.f51390e) {
            if (this.f51392g == null) {
                this.f51392g = new StringBuilder(str.length());
            }
            StringBuilder sb2 = this.f51392g;
            Intrinsics.checkNotNull(sb2);
            sb2.append(str);
            return;
        }
        if (!this.f51393h) {
            if (this.f51387b instanceof SVG.TextContainer) {
                b(str);
            }
        } else {
            if (this.f51394i == null) {
                this.f51394i = new StringBuilder(str.length());
            }
            StringBuilder sb3 = this.f51394i;
            Intrinsics.checkNotNull(sb3);
            sb3.append(str);
        }
    }

    public final void D(Attributes attributes) throws SVGParseException {
        if (this.f51387b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
        }
        SVG.Use use = new SVG.Use();
        use.setDocument(this.f51386a);
        use.setParent(this.f51387b);
        k(use, attributes);
        n(use, attributes);
        p(use, attributes);
        j(use, attributes);
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            String value = attributes.getValue(i10);
            int iF = ai.a.f(value, "attributes.getValue(i)", 1);
            int i11 = 0;
            boolean z10 = false;
            while (i11 <= iF) {
                boolean z11 = Intrinsics.compare((int) value.charAt(!z10 ? i11 : iF), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        iF--;
                    }
                } else if (z11) {
                    i11++;
                } else {
                    z10 = true;
                }
            }
            String strB = k.b(iF, 1, value, i11);
            int i12 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i12 == 1) {
                use.setX(INSTANCE.parseLength(strB));
            } else if (i12 == 2) {
                use.setY(INSTANCE.parseLength(strB));
            } else if (i12 == 3) {
                use.setWidth(INSTANCE.parseLength(strB));
                SVG.Length width = use.getWidth();
                Intrinsics.checkNotNull(width);
                if (width.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative", null, 2, null);
                }
            } else if (i12 == 4) {
                use.setHeight(INSTANCE.parseLength(strB));
                SVG.Length height = use.getHeight();
                Intrinsics.checkNotNull(height);
                if (height.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative", null, 2, null);
                }
            } else if (i12 == 6 && (Intrinsics.areEqual("", attributes.getURI(i10)) || Intrinsics.areEqual("http://www.w3.org/1999/xlink", attributes.getURI(i10)))) {
                use.setHref(strB);
            }
        }
        SVG.SvgContainer svgContainer = this.f51387b;
        Intrinsics.checkNotNull(svgContainer);
        svgContainer.addChild(use);
        this.f51387b = use;
    }

    public final void a(Attributes attributes) throws SVGParseException {
        if (this.f51387b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
        }
        SVG.A a10 = new SVG.A();
        a10.setDocument(this.f51386a);
        a10.setParent(this.f51387b);
        k(a10, attributes);
        n(a10, attributes);
        p(a10, attributes);
        j(a10, attributes);
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            String value = attributes.getValue(i10);
            int iF = ai.a.f(value, "attributes.getValue(i)", 1);
            int i11 = 0;
            boolean z10 = false;
            while (i11 <= iF) {
                boolean z11 = Intrinsics.compare((int) value.charAt(!z10 ? i11 : iF), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        iF--;
                    }
                } else if (z11) {
                    i11++;
                } else {
                    z10 = true;
                }
            }
            String strB = k.b(iF, 1, value, i11);
            if (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i10)).ordinal()] == 6 && (Intrinsics.areEqual("", attributes.getURI(i10)) || Intrinsics.areEqual("http://www.w3.org/1999/xlink", attributes.getURI(i10)))) {
                a10.setHref(strB);
            }
        }
        SVG.SvgContainer svgContainer = this.f51387b;
        Intrinsics.checkNotNull(svgContainer);
        svgContainer.addChild(a10);
        this.f51387b = a10;
    }

    public final void b(String str) throws SVGParseException {
        SVG.SvgConditionalContainer svgConditionalContainer = (SVG.SvgConditionalContainer) this.f51387b;
        Intrinsics.checkNotNull(svgConditionalContainer);
        int size = svgConditionalContainer.getChildren().size();
        SVG.SvgObject svgObject = size == 0 ? null : svgConditionalContainer.getChildren().get(size - 1);
        if (!(svgObject instanceof SVG.TextSequence)) {
            SVG.SvgContainer svgContainer = this.f51387b;
            Intrinsics.checkNotNull(svgContainer);
            svgContainer.addChild(new SVG.TextSequence(str));
        } else {
            SVG.TextSequence textSequence = (SVG.TextSequence) svgObject;
            textSequence.setText(textSequence.getText() + str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[SYNTHETIC] */
    public final void c(Attributes attributes) throws SVGParseException {
        String strB;
        SVG.Length r3;
        if (this.f51387b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
        }
        SVG.Circle circle = new SVG.Circle();
        circle.setDocument(this.f51386a);
        circle.setParent(this.f51387b);
        k(circle, attributes);
        n(circle, attributes);
        p(circle, attributes);
        j(circle, attributes);
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            String value = attributes.getValue(i10);
            int iF = ai.a.f(value, "attributes.getValue(i)", 1);
            int i11 = 0;
            boolean z10 = false;
            while (i11 <= iF) {
                boolean z11 = Intrinsics.compare((int) value.charAt(!z10 ? i11 : iF), 32) <= 0;
                if (z10) {
                    if (z11) {
                        iF--;
                    } else {
                        strB = k.b(iF, 1, value, i11);
                        switch (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i10)).ordinal()]) {
                            case 12:
                                circle.setCx(INSTANCE.parseLength(strB));
                                break;
                            case 13:
                                circle.setCy(INSTANCE.parseLength(strB));
                                break;
                            case 14:
                                circle.setR(INSTANCE.parseLength(strB));
                                r3 = circle.getR();
                                Intrinsics.checkNotNull(r3);
                                if (!r3.isNegative()) {
                                    throw new SVGParseException("Invalid <circle> element. r cannot be negative", null, 2, null);
                                }
                                break;
                                break;
                        }
                    }
                } else if (z11) {
                    i11++;
                } else {
                    z10 = true;
                }
            }
            strB = k.b(iF, 1, value, i11);
            switch (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case 12:
                    circle.setCx(INSTANCE.parseLength(strB));
                    break;
                case 13:
                    circle.setCy(INSTANCE.parseLength(strB));
                    break;
                case 14:
                    circle.setR(INSTANCE.parseLength(strB));
                    r3 = circle.getR();
                    Intrinsics.checkNotNull(r3);
                    if (!r3.isNegative()) {
                        throw new SVGParseException("Invalid <circle> element. r cannot be negative", null, 2, null);
                    }
                    break;
                    break;
            }
        }
        SVG.SvgContainer svgContainer = this.f51387b;
        Intrinsics.checkNotNull(svgContainer);
        svgContainer.addChild(circle);
    }

    public final void d(Attributes attributes) throws SVGParseException {
        if (this.f51387b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
        }
        SVG.Defs defs = new SVG.Defs();
        defs.setDocument(this.f51386a);
        defs.setParent(this.f51387b);
        k(defs, attributes);
        n(defs, attributes);
        p(defs, attributes);
        SVG.SvgContainer svgContainer = this.f51387b;
        Intrinsics.checkNotNull(svgContainer);
        svgContainer.addChild(defs);
        this.f51387b = defs;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf A[SYNTHETIC] */
    public final void e(Attributes attributes) throws SVGParseException {
        String strB;
        SVG.Length rx;
        SVG.Length ry;
        if (this.f51387b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
        }
        SVG.Ellipse ellipse = new SVG.Ellipse();
        ellipse.setDocument(this.f51386a);
        ellipse.setParent(this.f51387b);
        k(ellipse, attributes);
        n(ellipse, attributes);
        p(ellipse, attributes);
        j(ellipse, attributes);
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            String value = attributes.getValue(i10);
            int iF = ai.a.f(value, "attributes.getValue(i)", 1);
            int i11 = 0;
            boolean z10 = false;
            while (i11 <= iF) {
                boolean z11 = Intrinsics.compare((int) value.charAt(!z10 ? i11 : iF), 32) <= 0;
                if (z10) {
                    if (z11) {
                        iF--;
                    } else {
                        strB = k.b(iF, 1, value, i11);
                        switch (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i10)).ordinal()]) {
                            case 10:
                                ellipse.setRx(INSTANCE.parseLength(strB));
                                rx = ellipse.getRx();
                                Intrinsics.checkNotNull(rx);
                                if (!rx.isNegative()) {
                                    throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative", null, 2, null);
                                }
                                break;
                                break;
                            case 11:
                                ellipse.setRy(INSTANCE.parseLength(strB));
                                ry = ellipse.getRy();
                                Intrinsics.checkNotNull(ry);
                                if (!ry.isNegative()) {
                                    throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative", null, 2, null);
                                }
                                break;
                                break;
                            case 12:
                                ellipse.setCx(INSTANCE.parseLength(strB));
                                break;
                            case 13:
                                ellipse.setCy(INSTANCE.parseLength(strB));
                                break;
                        }
                    }
                } else if (z11) {
                    i11++;
                } else {
                    z10 = true;
                }
            }
            strB = k.b(iF, 1, value, i11);
            switch (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case 10:
                    ellipse.setRx(INSTANCE.parseLength(strB));
                    rx = ellipse.getRx();
                    Intrinsics.checkNotNull(rx);
                    if (!rx.isNegative()) {
                        throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative", null, 2, null);
                    }
                    break;
                    break;
                case 11:
                    ellipse.setRy(INSTANCE.parseLength(strB));
                    ry = ellipse.getRy();
                    Intrinsics.checkNotNull(ry);
                    if (!ry.isNegative()) {
                        throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative", null, 2, null);
                    }
                    break;
                    break;
                case 12:
                    ellipse.setCx(INSTANCE.parseLength(strB));
                    break;
                case 13:
                    ellipse.setCy(INSTANCE.parseLength(strB));
                    break;
            }
        }
        SVG.SvgContainer svgContainer = this.f51387b;
        Intrinsics.checkNotNull(svgContainer);
        svgContainer.addChild(ellipse);
    }

    public final void f(String str, String str2, String str3) throws SVGParseException {
        if (this.f51388c) {
            int i10 = this.f51389d - 1;
            this.f51389d = i10;
            if (i10 == 0) {
                this.f51388c = false;
                return;
            }
            return;
        }
        if (Intrinsics.areEqual("http://www.w3.org/2000/svg", str) || Intrinsics.areEqual("", str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i11 = WhenMappings.$EnumSwitchMapping$0[SVGElem.Companion.fromString(str2).ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5 && i11 != 13 && i11 != 14) {
                switch (i11) {
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 31:
                        break;
                    case 22:
                    case 23:
                        this.f51390e = false;
                        if (this.f51392g != null) {
                            SVGElem sVGElem = this.f51391f;
                            if (sVGElem == SVGElem.title) {
                                SVG svg = this.f51386a;
                                Intrinsics.checkNotNull(svg);
                                svg.setTitle(String.valueOf(this.f51392g));
                            } else if (sVGElem == SVGElem.desc) {
                                SVG svg2 = this.f51386a;
                                Intrinsics.checkNotNull(svg2);
                                svg2.setDesc(String.valueOf(this.f51392g));
                            }
                            StringBuilder sb2 = this.f51392g;
                            Intrinsics.checkNotNull(sb2);
                            sb2.setLength(0);
                            return;
                        }
                        return;
                    case 30:
                        StringBuilder sb3 = this.f51394i;
                        if (sb3 != null) {
                            this.f51393h = false;
                            String strValueOf = String.valueOf(sb3);
                            CSSParser cSSParser = new CSSParser(CSSParser.MediaType.screen, CSSParser.Source.Document);
                            SVG svg3 = this.f51386a;
                            Intrinsics.checkNotNull(svg3);
                            svg3.addCSSRules(cSSParser.parse(strValueOf));
                            StringBuilder sb4 = this.f51394i;
                            Intrinsics.checkNotNull(sb4);
                            sb4.setLength(0);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
            Object obj = this.f51387b;
            if (obj == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                throw new SVGParseException(ai.a.i(new Object[]{str2}, 1, "Unbalanced end element </%s> found", "format(format, *args)"), null, 2, null);
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.SvgObject");
            this.f51387b = ((SVG.SvgObject) obj).getParent();
        }
    }

    public final void g(Attributes attributes) throws SVGParseException {
        if (this.f51387b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
        }
        SVG.Group group = new SVG.Group();
        group.setDocument(this.f51386a);
        group.setParent(this.f51387b);
        k(group, attributes);
        n(group, attributes);
        p(group, attributes);
        j(group, attributes);
        SVG.SvgContainer svgContainer = this.f51387b;
        Intrinsics.checkNotNull(svgContainer);
        svgContainer.addChild(group);
        this.f51387b = group;
    }

    public final void h(String str, Map<String, String> map) {
        String str2;
        if (Intrinsics.areEqual(str, "xml-stylesheet")) {
            SVG.Companion companion = SVG.INSTANCE;
            if (companion.getExternalFileResolver() != null) {
                if (map.get("type") == null || Intrinsics.areEqual(CSSParser.CSS_MIME_TYPE, map.get("type"))) {
                    if ((map.get(XML_STYLESHEET_ATTR_ALTERNATE) == null || Intrinsics.areEqual(XML_STYLESHEET_ATTR_ALTERNATE_NO, map.get(XML_STYLESHEET_ATTR_ALTERNATE))) && (str2 = map.get(XML_STYLESHEET_ATTR_HREF)) != null) {
                        SVGExternalFileResolver externalFileResolver = companion.getExternalFileResolver();
                        Intrinsics.checkNotNull(externalFileResolver);
                        String strResolveCSSStyleSheet = externalFileResolver.resolveCSSStyleSheet(str2);
                        if (strResolveCSSStyleSheet == null) {
                            return;
                        }
                        String str3 = map.get(XML_STYLESHEET_ATTR_MEDIA);
                        if (str3 != null) {
                            int length = str3.length() - 1;
                            int i10 = 0;
                            boolean z10 = false;
                            while (i10 <= length) {
                                boolean z11 = Intrinsics.compare((int) str3.charAt(!z10 ? i10 : length), 32) <= 0;
                                if (z10) {
                                    if (!z11) {
                                        break;
                                    } else {
                                        length--;
                                    }
                                } else if (z11) {
                                    i10++;
                                } else {
                                    z10 = true;
                                }
                            }
                            if (!Intrinsics.areEqual(XML_STYLESHEET_ATTR_MEDIA_ALL, str3.subSequence(i10, length + 1).toString())) {
                                strResolveCSSStyleSheet = u.g("@media ", str3, " { ", strResolveCSSStyleSheet, "}");
                            }
                        }
                        CSSParser cSSParser = new CSSParser(CSSParser.MediaType.screen, CSSParser.Source.Document);
                        SVG svg = this.f51386a;
                        Intrinsics.checkNotNull(svg);
                        svg.addCSSRules(cSSParser.parse(strResolveCSSStyleSheet));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b A[DONT_GENERATE, SYNTHETIC] */
    public final void i(Attributes attributes) throws SVGParseException {
        String strB;
        if (this.f51387b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
        }
        SVG.Line line = new SVG.Line();
        line.setDocument(this.f51386a);
        line.setParent(this.f51387b);
        k(line, attributes);
        n(line, attributes);
        p(line, attributes);
        j(line, attributes);
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            String value = attributes.getValue(i10);
            int iF = ai.a.f(value, "attributes.getValue(i)", 1);
            int i11 = 0;
            boolean z10 = false;
            while (i11 <= iF) {
                boolean z11 = Intrinsics.compare((int) value.charAt(!z10 ? i11 : iF), 32) <= 0;
                if (z10) {
                    if (z11) {
                        iF--;
                    } else {
                        strB = k.b(iF, 1, value, i11);
                        switch (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i10)).ordinal()]) {
                            case 15:
                                line.setX1(INSTANCE.parseLength(strB));
                                break;
                            case 16:
                                line.setY1(INSTANCE.parseLength(strB));
                                break;
                            case 17:
                                line.setX2(INSTANCE.parseLength(strB));
                                break;
                            case 18:
                                line.setY2(INSTANCE.parseLength(strB));
                                break;
                        }
                    }
                } else if (z11) {
                    i11++;
                } else {
                    z10 = true;
                }
            }
            strB = k.b(iF, 1, value, i11);
            switch (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    line.setX1(INSTANCE.parseLength(strB));
                    break;
                case 16:
                    line.setY1(INSTANCE.parseLength(strB));
                    break;
                case 17:
                    line.setX2(INSTANCE.parseLength(strB));
                    break;
                case 18:
                    line.setY2(INSTANCE.parseLength(strB));
                    break;
            }
        }
        SVG.SvgContainer svgContainer = this.f51387b;
        Intrinsics.checkNotNull(svgContainer);
        svgContainer.addChild(line);
    }

    @Nullable
    public final SVG parse(@NotNull InputStream is, boolean enableInternalEntities) throws SVGParseException {
        SVG svg;
        Intrinsics.checkNotNullParameter(is, "is");
        if (!is.markSupported()) {
            is = new BufferedInputStream(is);
        }
        try {
            is.mark(3);
            int i10 = is.read() + (is.read() << 8);
            is.reset();
            if (i10 == 35615) {
                is = new BufferedInputStream(new GZIPInputStream(is));
            }
        } catch (IOException unused) {
        }
        try {
            if (enableInternalEntities) {
                try {
                    is.mark(4096);
                    byte[] bArr = new byte[4096];
                    String str = new String(bArr, 0, is.read(bArr), Charsets.UTF_8);
                    is.reset();
                    if (StringsKt__StringsKt.indexOf$default((CharSequence) str, "<!ENTITY ", 0, false, 6, (Object) null) >= 0) {
                        t(is);
                        return this.f51386a;
                    }
                    u(is);
                    svg = this.f51386a;
                } catch (IOException unused2) {
                    u(is);
                    svg = this.f51386a;
                }
            } else {
                u(is);
                svg = this.f51386a;
            }
            return svg;
        } finally {
            try {
                is.close();
            } catch (IOException unused3) {
            }
        }
    }

    public final void t(InputStream inputStream) throws SVGParseException {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            e eVar = new e();
            xMLReader.setContentHandler(eVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", eVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e5) {
            throw new SVGParseException("Stream error", e5);
        } catch (ParserConfigurationException e7) {
            throw new SVGParseException("XML parser problem", e7);
        } catch (SAXException e10) {
            throw new SVGParseException("SVG parse error", e10);
        }
    }

    public final void u(InputStream inputStream) throws SVGParseException {
        try {
            XmlPullParser parser = Xml.newPullParser();
            Intrinsics.checkNotNullExpressionValue(parser, "parser");
            f fVar = new f(parser);
            parser.setFeature(MXParser.FEATURE_PROCESS_DOCDECL, false);
            parser.setFeature(MXParser.FEATURE_PROCESS_NAMESPACES, true);
            parser.setInput(inputStream, null);
            for (int eventType = parser.getEventType(); eventType != 1; eventType = parser.nextToken()) {
                if (eventType == 0) {
                    this.f51386a = new SVG();
                } else if (eventType == 8) {
                    TextScanner textScanner = new TextScanner(parser.getText());
                    h(TextScanner.nextToken$default(textScanner, (char) 0, false, 3, null), r(textScanner));
                } else if (eventType == 2) {
                    String name = parser.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "parser.name");
                    if (parser.getPrefix() != null) {
                        name = parser.getPrefix() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + name;
                    }
                    String namespace = parser.getNamespace();
                    Intrinsics.checkNotNullExpressionValue(namespace, "parser.namespace");
                    String name2 = parser.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "parser.name");
                    z(namespace, name2, name, fVar);
                } else if (eventType == 3) {
                    String name3 = parser.getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "parser.name");
                    if (parser.getPrefix() != null) {
                        name3 = parser.getPrefix() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + name3;
                    }
                    String namespace2 = parser.getNamespace();
                    Intrinsics.checkNotNullExpressionValue(namespace2, "parser.namespace");
                    String name4 = parser.getName();
                    Intrinsics.checkNotNullExpressionValue(name4, "parser.name");
                    f(namespace2, name4, name3);
                } else if (eventType == 4) {
                    int[] iArr = new int[2];
                    char[] text = parser.getTextCharacters(iArr);
                    Intrinsics.checkNotNullExpressionValue(text, "text");
                    B(iArr[0], text, iArr[1]);
                } else if (eventType != 5) {
                    continue;
                } else {
                    String text2 = parser.getText();
                    Intrinsics.checkNotNullExpressionValue(text2, "parser.text");
                    C(text2);
                }
            }
        } catch (IOException e5) {
            throw new SVGParseException("Stream error", e5);
        } catch (XmlPullParserException e7) {
            throw new SVGParseException("XML parser problem", e7);
        }
    }

    public final void v(Attributes attributes) throws SVGParseException {
        if (this.f51387b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
        }
        SVG.Path path = new SVG.Path();
        path.setDocument(this.f51386a);
        path.setParent(this.f51387b);
        k(path, attributes);
        n(path, attributes);
        p(path, attributes);
        j(path, attributes);
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            String value = attributes.getValue(i10);
            int iF = ai.a.f(value, "attributes.getValue(i)", 1);
            int i11 = 0;
            boolean z10 = false;
            while (i11 <= iF) {
                boolean z11 = Intrinsics.compare((int) value.charAt(!z10 ? i11 : iF), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        iF--;
                    }
                } else if (z11) {
                    i11++;
                } else {
                    z10 = true;
                }
            }
            String strB = k.b(iF, 1, value, i11);
            int i12 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i12 == 8) {
                path.setD(INSTANCE.parsePath(strB));
            } else if (i12 != 9) {
                continue;
            } else {
                path.setPathLength(Float.valueOf(Companion.access$parseFloat(INSTANCE, strB)));
                Float pathLength = path.getPathLength();
                Intrinsics.checkNotNull(pathLength);
                if (pathLength.floatValue() < 0.0f) {
                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative", null, 2, null);
                }
            }
        }
        SVG.SvgContainer svgContainer = this.f51387b;
        Intrinsics.checkNotNull(svgContainer);
        svgContainer.addChild(path);
    }

    public final void w(Attributes attributes) throws SVGParseException {
        if (this.f51387b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
        }
        SVG.Polygon polygon = new SVG.Polygon();
        polygon.setDocument(this.f51386a);
        polygon.setParent(this.f51387b);
        k(polygon, attributes);
        n(polygon, attributes);
        p(polygon, attributes);
        j(polygon, attributes);
        m(polygon, attributes, "polygon");
        SVG.SvgContainer svgContainer = this.f51387b;
        Intrinsics.checkNotNull(svgContainer);
        svgContainer.addChild(polygon);
    }

    public final void x(Attributes attributes) throws SVGParseException {
        if (this.f51387b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
        }
        SVG.PolyLine polyLine = new SVG.PolyLine();
        polyLine.setDocument(this.f51386a);
        polyLine.setParent(this.f51387b);
        k(polyLine, attributes);
        n(polyLine, attributes);
        p(polyLine, attributes);
        j(polyLine, attributes);
        m(polyLine, attributes, "polyline");
        SVG.SvgContainer svgContainer = this.f51387b;
        Intrinsics.checkNotNull(svgContainer);
        svgContainer.addChild(polyLine);
    }

    public final void y(Attributes attributes) throws SVGParseException {
        if (this.f51387b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
        }
        SVG.Rect rect = new SVG.Rect();
        rect.setDocument(this.f51386a);
        rect.setParent(this.f51387b);
        k(rect, attributes);
        n(rect, attributes);
        p(rect, attributes);
        j(rect, attributes);
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            String value = attributes.getValue(i10);
            int iF = ai.a.f(value, "attributes.getValue(i)", 1);
            int i11 = 0;
            boolean z10 = false;
            while (i11 <= iF) {
                boolean z11 = Intrinsics.compare((int) value.charAt(!z10 ? i11 : iF), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        iF--;
                    }
                } else if (z11) {
                    i11++;
                } else {
                    z10 = true;
                }
            }
            String strB = k.b(iF, 1, value, i11);
            int i12 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i12 == 1) {
                rect.setX(INSTANCE.parseLength(strB));
            } else if (i12 == 2) {
                rect.setY(INSTANCE.parseLength(strB));
            } else if (i12 == 3) {
                rect.setWidth(INSTANCE.parseLength(strB));
                SVG.Length width = rect.getWidth();
                Intrinsics.checkNotNull(width);
                if (width.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. width cannot be negative", null, 2, null);
                }
            } else if (i12 == 4) {
                rect.setHeight(INSTANCE.parseLength(strB));
                SVG.Length height = rect.getHeight();
                Intrinsics.checkNotNull(height);
                if (height.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. height cannot be negative", null, 2, null);
                }
            } else if (i12 == 10) {
                rect.setRx(INSTANCE.parseLength(strB));
                SVG.Length rx = rect.getRx();
                Intrinsics.checkNotNull(rx);
                if (rx.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. rx cannot be negative", null, 2, null);
                }
            } else if (i12 != 11) {
                continue;
            } else {
                rect.setRy(INSTANCE.parseLength(strB));
                SVG.Length ry = rect.getRy();
                Intrinsics.checkNotNull(ry);
                if (ry.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. ry cannot be negative", null, 2, null);
                }
            }
        }
        SVG.SvgContainer svgContainer = this.f51387b;
        Intrinsics.checkNotNull(svgContainer);
        svgContainer.addChild(rect);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:117:0x0206  */
    /* JADX WARN: Code duplicated, block: B:118:0x0210  */
    /* JADX WARN: Code duplicated, block: B:150:0x02cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:153:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:160:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:166:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:171:0x031b  */
    /* JADX WARN: Code duplicated, block: B:176:0x033b  */
    /* JADX WARN: Code duplicated, block: B:177:0x0345  */
    /* JADX WARN: Code duplicated, block: B:205:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:207:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:209:0x03db  */
    /* JADX WARN: Code duplicated, block: B:211:0x03de  */
    /* JADX WARN: Code duplicated, block: B:213:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:215:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:216:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:218:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:219:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:221:0x0402  */
    /* JADX WARN: Code duplicated, block: B:224:0x0413  */
    /* JADX WARN: Code duplicated, block: B:226:0x0419  */
    /* JADX WARN: Code duplicated, block: B:227:0x0420  */
    /* JADX WARN: Code duplicated, block: B:229:0x0426  */
    /* JADX WARN: Code duplicated, block: B:232:0x0437  */
    /* JADX WARN: Code duplicated, block: B:236:0x044b  */
    /* JADX WARN: Code duplicated, block: B:237:0x044f  */
    /* JADX WARN: Code duplicated, block: B:242:0x0470  */
    /* JADX WARN: Code duplicated, block: B:247:0x0492  */
    /* JADX WARN: Code duplicated, block: B:248:0x049e  */
    /* JADX WARN: Code duplicated, block: B:275:0x052f  */
    /* JADX WARN: Code duplicated, block: B:278:0x0534  */
    /* JADX WARN: Code duplicated, block: B:279:0x053e  */
    /* JADX WARN: Code duplicated, block: B:283:0x0552  */
    /* JADX WARN: Code duplicated, block: B:313:0x0602  */
    /* JADX WARN: Code duplicated, block: B:315:0x0608  */
    /* JADX WARN: Code duplicated, block: B:316:0x060e  */
    /* JADX WARN: Code duplicated, block: B:318:0x0614  */
    /* JADX WARN: Code duplicated, block: B:350:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:352:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:354:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:355:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:358:0x06d8 A[Catch: NumberFormatException -> 0x06e3, TryCatch #0 {NumberFormatException -> 0x06e3, blocks: (B:356:0x06cd, B:358:0x06d8, B:361:0x06de, B:366:0x06e9, B:367:0x06f0), top: B:579:0x06cd }] */
    /* JADX WARN: Code duplicated, block: B:361:0x06de A[Catch: NumberFormatException -> 0x06e3, TryCatch #0 {NumberFormatException -> 0x06e3, blocks: (B:356:0x06cd, B:358:0x06d8, B:361:0x06de, B:366:0x06e9, B:367:0x06f0), top: B:579:0x06cd }] */
    /* JADX WARN: Code duplicated, block: B:364:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:366:0x06e9 A[Catch: NumberFormatException -> 0x06e3, TryCatch #0 {NumberFormatException -> 0x06e3, blocks: (B:356:0x06cd, B:358:0x06d8, B:361:0x06de, B:366:0x06e9, B:367:0x06f0), top: B:579:0x06cd }] */
    /* JADX WARN: Code duplicated, block: B:367:0x06f0 A[Catch: NumberFormatException -> 0x06e3, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x06e3, blocks: (B:356:0x06cd, B:358:0x06d8, B:361:0x06de, B:366:0x06e9, B:367:0x06f0), top: B:579:0x06cd }] */
    /* JADX WARN: Code duplicated, block: B:401:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:403:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:405:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:410:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:411:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:412:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:413:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:441:0x087a  */
    /* JADX WARN: Code duplicated, block: B:442:0x0884  */
    /* JADX WARN: Code duplicated, block: B:443:0x088e  */
    /* JADX WARN: Code duplicated, block: B:444:0x0898  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:472:0x0929  */
    /* JADX WARN: Code duplicated, block: B:474:0x0931  */
    /* JADX WARN: Code duplicated, block: B:475:0x093b  */
    /* JADX WARN: Code duplicated, block: B:476:0x0949  */
    /* JADX WARN: Code duplicated, block: B:478:0x0951  */
    /* JADX WARN: Code duplicated, block: B:479:0x0956  */
    /* JADX WARN: Code duplicated, block: B:481:0x095d  */
    /* JADX WARN: Code duplicated, block: B:484:0x096c  */
    /* JADX WARN: Code duplicated, block: B:489:0x098e  */
    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX WARN: Code duplicated, block: B:494:0x09b0  */
    /* JADX WARN: Code duplicated, block: B:495:0x09bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:584:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x0312 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x034e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x034e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x034e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:0x0409 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x042d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x0466 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x04a9 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x0555 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x061a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x0624 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x070e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x0718 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:0x07c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:710:0x07f6 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:0x07f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:0x08a1 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:0x0962 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:0x0984 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:0x09a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:0x09c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:0x09c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0172  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:86:0x0178  */
    /* JADX WARN: Code duplicated, block: B:88:0x017c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0182  */
    /* JADX WARN: Code duplicated, block: B:93:0x0188  */
    /* JADX WARN: Code duplicated, block: B:94:0x018f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0195  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a5  */
    public final void z(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        String strB;
        SVG.Length markerWidth;
        SVG.Length markerHeight;
        String strB2;
        String strB3;
        int i10;
        SVG.Length r3;
        String strB4;
        int length;
        int i11;
        boolean z10;
        float fAccess$parseFloat;
        Object objValueOf;
        String strB5;
        String strB6;
        int i12;
        String strB7;
        int i13;
        SVG.Length width;
        SVG.Length height;
        String strB8;
        int i14;
        SVG.Length width2;
        SVG.Length height2;
        String strB9;
        int i15;
        SVG.Length width3;
        SVG.Length height3;
        String strB10;
        int i16;
        int i17 = 1;
        if (this.f51388c) {
            this.f51389d++;
            return;
        }
        if (Intrinsics.areEqual("http://www.w3.org/2000/svg", str) || Intrinsics.areEqual("", str)) {
            SVGElem sVGElemFromString = SVGElem.Companion.fromString(str2.length() > 0 ? str2 : str3);
            switch (WhenMappings.$EnumSwitchMapping$0[sVGElemFromString.ordinal()]) {
                case 1:
                    A(attributes);
                    return;
                case 2:
                    g(attributes);
                    return;
                case 3:
                    d(attributes);
                    return;
                case 4:
                    a(attributes);
                    return;
                case 5:
                    D(attributes);
                    return;
                case 6:
                    v(attributes);
                    return;
                case 7:
                    y(attributes);
                    return;
                case 8:
                    c(attributes);
                    return;
                case 9:
                    e(attributes);
                    return;
                case 10:
                    i(attributes);
                    return;
                case 11:
                    x(attributes);
                    return;
                case 12:
                    w(attributes);
                    return;
                case 13:
                    if (this.f51387b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
                    }
                    SVG.Text text = new SVG.Text();
                    text.setDocument(this.f51386a);
                    text.setParent(this.f51387b);
                    k(text, attributes);
                    n(text, attributes);
                    p(text, attributes);
                    j(text, attributes);
                    o(text, attributes);
                    SVG.SvgContainer svgContainer = this.f51387b;
                    Intrinsics.checkNotNull(svgContainer);
                    svgContainer.addChild(text);
                    this.f51387b = text;
                    return;
                case 14:
                    SVG.SvgContainer svgContainer2 = this.f51387b;
                    if (svgContainer2 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
                    }
                    if (!(svgContainer2 instanceof SVG.TextContainer)) {
                        throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.", null, 2, null);
                    }
                    SVG.TSpan tSpan = new SVG.TSpan();
                    tSpan.setDocument(this.f51386a);
                    tSpan.setParent(this.f51387b);
                    k(tSpan, attributes);
                    n(tSpan, attributes);
                    j(tSpan, attributes);
                    o(tSpan, attributes);
                    SVG.SvgContainer svgContainer3 = this.f51387b;
                    Intrinsics.checkNotNull(svgContainer3);
                    svgContainer3.addChild(tSpan);
                    this.f51387b = tSpan;
                    if (tSpan.getParent() instanceof SVG.TextRoot) {
                        SVG.SvgContainer parent = tSpan.getParent();
                        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.TextRoot");
                        tSpan.setTextRoot((SVG.TextRoot) parent);
                        return;
                    } else {
                        SVG.SvgContainer parent2 = tSpan.getParent();
                        Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.TextChild");
                        tSpan.setTextRoot(((SVG.TextChild) parent2).getTextRoot());
                        return;
                    }
                case 15:
                    int i18 = 0;
                    SVG.SvgContainer svgContainer4 = this.f51387b;
                    if (svgContainer4 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
                    }
                    if (!(svgContainer4 instanceof SVG.TextContainer)) {
                        throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.", null, 2, null);
                    }
                    SVG.TRef tRef = new SVG.TRef();
                    tRef.setDocument(this.f51386a);
                    tRef.setParent(this.f51387b);
                    k(tRef, attributes);
                    n(tRef, attributes);
                    j(tRef, attributes);
                    int length2 = attributes.getLength();
                    int i19 = 0;
                    while (i19 < length2) {
                        String value = attributes.getValue(i19);
                        int i20 = i18;
                        int iF = ai.a.f(value, "attributes.getValue(i)", 1);
                        int i21 = i20;
                        while (i21 <= iF) {
                            boolean z11 = Intrinsics.compare((int) value.charAt(i20 == 0 ? i21 : iF), 32) <= 0;
                            if (i20 == 0) {
                                if (z11) {
                                    i21++;
                                } else {
                                    i20 = 1;
                                }
                            } else if (z11) {
                                iF--;
                            } else {
                                String strB11 = k.b(iF, 1, value, i21);
                                if (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i19)).ordinal()] != 6 && (Intrinsics.areEqual("", attributes.getURI(i19)) || Intrinsics.areEqual("http://www.w3.org/1999/xlink", attributes.getURI(i19)))) {
                                    tRef.setHref(strB11);
                                }
                                i19++;
                                i18 = 0;
                            }
                        }
                        String strB12 = k.b(iF, 1, value, i21);
                        if (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i19)).ordinal()] != 6) {
                        }
                        i19++;
                        i18 = 0;
                    }
                    SVG.SvgContainer svgContainer5 = this.f51387b;
                    Intrinsics.checkNotNull(svgContainer5);
                    svgContainer5.addChild(tRef);
                    if (tRef.getParent() instanceof SVG.TextRoot) {
                        SVG.SvgContainer parent3 = tRef.getParent();
                        Intrinsics.checkNotNull(parent3, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.TextRoot");
                        tRef.setTextRoot((SVG.TextRoot) parent3);
                        return;
                    } else {
                        SVG.SvgContainer parent4 = tRef.getParent();
                        Intrinsics.checkNotNull(parent4, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.TextChild");
                        tRef.setTextRoot(((SVG.TextChild) parent4).getTextRoot());
                        return;
                    }
                case 16:
                    if (this.f51387b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
                    }
                    SVG.Switch r1 = new SVG.Switch();
                    r1.setDocument(this.f51386a);
                    r1.setParent(this.f51387b);
                    k(r1, attributes);
                    n(r1, attributes);
                    p(r1, attributes);
                    j(r1, attributes);
                    SVG.SvgContainer svgContainer6 = this.f51387b;
                    Intrinsics.checkNotNull(svgContainer6);
                    svgContainer6.addChild(r1);
                    this.f51387b = r1;
                    return;
                case 17:
                    if (this.f51387b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
                    }
                    SVG.Symbol symbol = new SVG.Symbol();
                    symbol.setDocument(this.f51386a);
                    symbol.setParent(this.f51387b);
                    k(symbol, attributes);
                    n(symbol, attributes);
                    j(symbol, attributes);
                    q(symbol, attributes);
                    SVG.SvgContainer svgContainer7 = this.f51387b;
                    Intrinsics.checkNotNull(svgContainer7);
                    svgContainer7.addChild(symbol);
                    this.f51387b = symbol;
                    return;
                case 18:
                    if (this.f51387b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
                    }
                    SVG.Marker marker = new SVG.Marker();
                    marker.setDocument(this.f51386a);
                    marker.setParent(this.f51387b);
                    k(marker, attributes);
                    n(marker, attributes);
                    j(marker, attributes);
                    q(marker, attributes);
                    int length3 = attributes.getLength();
                    for (int i22 = 0; i22 < length3; i22++) {
                        String value2 = attributes.getValue(i22);
                        int iF2 = ai.a.f(value2, "attributes.getValue(i)", 1);
                        int i23 = 0;
                        boolean z12 = false;
                        while (i23 <= iF2) {
                            boolean z13 = Intrinsics.compare((int) value2.charAt(!z12 ? i23 : iF2), 32) <= 0;
                            if (z12) {
                                if (z13) {
                                    iF2--;
                                } else {
                                    strB = k.b(iF2, 1, value2, i23);
                                    switch (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i22)).ordinal()]) {
                                        case 26:
                                            marker.setRefX(INSTANCE.parseLength(strB));
                                            continue;
                                            continue;
                                            break;
                                        case 27:
                                            marker.setRefY(INSTANCE.parseLength(strB));
                                            continue;
                                            continue;
                                            break;
                                        case 28:
                                            marker.setMarkerWidth(INSTANCE.parseLength(strB));
                                            markerWidth = marker.getMarkerWidth();
                                            Intrinsics.checkNotNull(markerWidth);
                                            if (!markerWidth.isNegative()) {
                                                throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative", null, 2, null);
                                            }
                                            continue;
                                            continue;
                                            break;
                                            break;
                                        case 29:
                                            marker.setMarkerHeight(INSTANCE.parseLength(strB));
                                            markerHeight = marker.getMarkerHeight();
                                            Intrinsics.checkNotNull(markerHeight);
                                            if (!markerHeight.isNegative()) {
                                                throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative", null, 2, null);
                                            }
                                            continue;
                                            continue;
                                            break;
                                            break;
                                        case 30:
                                            if (Intrinsics.areEqual("strokeWidth", strB)) {
                                                marker.setMarkerUnitsAreUser(false);
                                                continue;
                                                continue;
                                            } else {
                                                if (Intrinsics.areEqual("userSpaceOnUse", strB)) {
                                                    throw new SVGParseException("Invalid value for attribute markerUnits", null, 2, null);
                                                }
                                                marker.setMarkerUnitsAreUser(true);
                                            }
                                            break;
                                        case 31:
                                            if (Intrinsics.areEqual(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, strB)) {
                                                marker.setOrient(Float.valueOf(Float.NaN));
                                            } else {
                                                marker.setOrient(Float.valueOf(Companion.access$parseFloat(INSTANCE, strB)));
                                            }
                                            break;
                                    }
                                }
                            } else if (z13) {
                                i23++;
                            } else {
                                z12 = true;
                            }
                        }
                        strB = k.b(iF2, 1, value2, i23);
                        switch (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i22)).ordinal()]) {
                            case 26:
                                marker.setRefX(INSTANCE.parseLength(strB));
                                continue;
                                continue;
                                break;
                            case 27:
                                marker.setRefY(INSTANCE.parseLength(strB));
                                continue;
                                continue;
                                break;
                            case 28:
                                marker.setMarkerWidth(INSTANCE.parseLength(strB));
                                markerWidth = marker.getMarkerWidth();
                                Intrinsics.checkNotNull(markerWidth);
                                if (!markerWidth.isNegative()) {
                                    throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative", null, 2, null);
                                }
                                continue;
                                continue;
                                break;
                                break;
                            case 29:
                                marker.setMarkerHeight(INSTANCE.parseLength(strB));
                                markerHeight = marker.getMarkerHeight();
                                Intrinsics.checkNotNull(markerHeight);
                                if (!markerHeight.isNegative()) {
                                    throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative", null, 2, null);
                                }
                                continue;
                                continue;
                                break;
                                break;
                            case 30:
                                if (Intrinsics.areEqual("strokeWidth", strB)) {
                                    marker.setMarkerUnitsAreUser(false);
                                    continue;
                                    continue;
                                } else {
                                    if (Intrinsics.areEqual("userSpaceOnUse", strB)) {
                                        throw new SVGParseException("Invalid value for attribute markerUnits", null, 2, null);
                                    }
                                    marker.setMarkerUnitsAreUser(true);
                                }
                                break;
                            case 31:
                                if (Intrinsics.areEqual(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, strB)) {
                                    marker.setOrient(Float.valueOf(Float.NaN));
                                } else {
                                    marker.setOrient(Float.valueOf(Companion.access$parseFloat(INSTANCE, strB)));
                                }
                                break;
                        }
                    }
                    SVG.SvgContainer svgContainer8 = this.f51387b;
                    Intrinsics.checkNotNull(svgContainer8);
                    svgContainer8.addChild(marker);
                    this.f51387b = marker;
                    return;
                case 19:
                    if (this.f51387b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
                    }
                    SVG.SvgLinearGradient svgLinearGradient = new SVG.SvgLinearGradient();
                    svgLinearGradient.setDocument(this.f51386a);
                    svgLinearGradient.setParent(this.f51387b);
                    k(svgLinearGradient, attributes);
                    n(svgLinearGradient, attributes);
                    l(svgLinearGradient, attributes);
                    int length4 = attributes.getLength();
                    for (int i24 = 0; i24 < length4; i24++) {
                        String value3 = attributes.getValue(i24);
                        int iF3 = ai.a.f(value3, "attributes.getValue(i)", 1);
                        int i25 = 0;
                        boolean z14 = false;
                        while (i25 <= iF3) {
                            boolean z15 = Intrinsics.compare((int) value3.charAt(!z14 ? i25 : iF3), 32) <= 0;
                            if (z14) {
                                if (z15) {
                                    iF3--;
                                } else {
                                    strB2 = k.b(iF3, 1, value3, i25);
                                    switch (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i24)).ordinal()]) {
                                        case 15:
                                            svgLinearGradient.setX1(INSTANCE.parseLength(strB2));
                                            break;
                                        case 16:
                                            svgLinearGradient.setY1(INSTANCE.parseLength(strB2));
                                            break;
                                        case 17:
                                            svgLinearGradient.setX2(INSTANCE.parseLength(strB2));
                                            break;
                                        case 18:
                                            svgLinearGradient.setY2(INSTANCE.parseLength(strB2));
                                            break;
                                    }
                                }
                            } else if (z15) {
                                i25++;
                            } else {
                                z14 = true;
                            }
                        }
                        strB2 = k.b(iF3, 1, value3, i25);
                        switch (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i24)).ordinal()]) {
                            case 15:
                                svgLinearGradient.setX1(INSTANCE.parseLength(strB2));
                                break;
                            case 16:
                                svgLinearGradient.setY1(INSTANCE.parseLength(strB2));
                                break;
                            case 17:
                                svgLinearGradient.setX2(INSTANCE.parseLength(strB2));
                                break;
                            case 18:
                                svgLinearGradient.setY2(INSTANCE.parseLength(strB2));
                                break;
                        }
                    }
                    SVG.SvgContainer svgContainer9 = this.f51387b;
                    Intrinsics.checkNotNull(svgContainer9);
                    svgContainer9.addChild(svgLinearGradient);
                    this.f51387b = svgLinearGradient;
                    return;
                case 20:
                    if (this.f51387b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
                    }
                    SVG.SvgRadialGradient svgRadialGradient = new SVG.SvgRadialGradient();
                    svgRadialGradient.setDocument(this.f51386a);
                    svgRadialGradient.setParent(this.f51387b);
                    k(svgRadialGradient, attributes);
                    n(svgRadialGradient, attributes);
                    l(svgRadialGradient, attributes);
                    int length5 = attributes.getLength();
                    for (int i26 = 0; i26 < length5; i26++) {
                        String value4 = attributes.getValue(i26);
                        int iF4 = ai.a.f(value4, "attributes.getValue(i)", 1);
                        int i27 = 0;
                        boolean z16 = false;
                        while (i27 <= iF4) {
                            boolean z17 = Intrinsics.compare((int) value4.charAt(!z16 ? i27 : iF4), 32) <= 0;
                            if (z16) {
                                if (z17) {
                                    iF4--;
                                } else {
                                    strB3 = k.b(iF4, 1, value4, i27);
                                    i10 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i26)).ordinal()];
                                    if (i10 != 35) {
                                        svgRadialGradient.setFx(INSTANCE.parseLength(strB3));
                                    } else if (i10 != 36) {
                                        switch (i10) {
                                            case 12:
                                                svgRadialGradient.setCx(INSTANCE.parseLength(strB3));
                                                break;
                                            case 13:
                                                svgRadialGradient.setCy(INSTANCE.parseLength(strB3));
                                                break;
                                            case 14:
                                                svgRadialGradient.setR(INSTANCE.parseLength(strB3));
                                                r3 = svgRadialGradient.getR();
                                                Intrinsics.checkNotNull(r3);
                                                if (!r3.isNegative()) {
                                                    throw new SVGParseException("Invalid <radialGradient> element. r cannot be negative", null, 2, null);
                                                }
                                                break;
                                                break;
                                        }
                                    } else {
                                        svgRadialGradient.setFy(INSTANCE.parseLength(strB3));
                                    }
                                }
                            } else if (z17) {
                                i27++;
                            } else {
                                z16 = true;
                            }
                        }
                        strB3 = k.b(iF4, 1, value4, i27);
                        i10 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i26)).ordinal()];
                        if (i10 != 35) {
                            svgRadialGradient.setFx(INSTANCE.parseLength(strB3));
                        } else if (i10 != 36) {
                            switch (i10) {
                                case 12:
                                    svgRadialGradient.setCx(INSTANCE.parseLength(strB3));
                                    break;
                                case 13:
                                    svgRadialGradient.setCy(INSTANCE.parseLength(strB3));
                                    break;
                                case 14:
                                    svgRadialGradient.setR(INSTANCE.parseLength(strB3));
                                    r3 = svgRadialGradient.getR();
                                    Intrinsics.checkNotNull(r3);
                                    if (!r3.isNegative()) {
                                        throw new SVGParseException("Invalid <radialGradient> element. r cannot be negative", null, 2, null);
                                    }
                                    break;
                                    break;
                            }
                        } else {
                            svgRadialGradient.setFy(INSTANCE.parseLength(strB3));
                        }
                    }
                    SVG.SvgContainer svgContainer10 = this.f51387b;
                    Intrinsics.checkNotNull(svgContainer10);
                    svgContainer10.addChild(svgRadialGradient);
                    this.f51387b = svgRadialGradient;
                    return;
                case 21:
                    SVG.SvgContainer svgContainer11 = this.f51387b;
                    if (svgContainer11 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
                    }
                    if (!(svgContainer11 instanceof SVG.GradientElement)) {
                        throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.", null, 2, null);
                    }
                    SVG.Stop stop = new SVG.Stop();
                    stop.setDocument(this.f51386a);
                    stop.setParent(this.f51387b);
                    k(stop, attributes);
                    n(stop, attributes);
                    int length6 = attributes.getLength();
                    for (int i28 = 0; i28 < length6; i28++) {
                        String value5 = attributes.getValue(i28);
                        int iF5 = ai.a.f(value5, "attributes.getValue(i)", 1);
                        int i29 = 0;
                        boolean z18 = false;
                        while (i29 <= iF5) {
                            boolean z19 = Intrinsics.compare((int) value5.charAt(!z18 ? i29 : iF5), 32) <= 0;
                            if (z18) {
                                if (z19) {
                                    iF5--;
                                } else {
                                    strB4 = k.b(iF5, 1, value5, i29);
                                    if (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i28)).ordinal()] != 37) {
                                        if (strB4.length() != 0) {
                                            throw new SVGParseException("Invalid offset value in <stop> (empty string)", null, 2, null);
                                        }
                                        length = strB4.length();
                                        if (strB4.charAt(strB4.length() - 1) == '%') {
                                            i11 = length - 1;
                                            z10 = true;
                                        } else {
                                            i11 = length;
                                            z10 = false;
                                        }
                                        try {
                                            fAccess$parseFloat = Companion.access$parseFloat(INSTANCE, strB4, 0, i11);
                                            if (z10) {
                                                fAccess$parseFloat /= 100.0f;
                                            }
                                            if (fAccess$parseFloat < 0.0f) {
                                                objValueOf = 0;
                                            } else if (fAccess$parseFloat > 100.0f) {
                                                objValueOf = 100;
                                            } else {
                                                objValueOf = Float.valueOf(fAccess$parseFloat);
                                            }
                                            stop.setOffset(Float.valueOf(((Float) objValueOf).floatValue()));
                                        } catch (NumberFormatException e5) {
                                            throw new SVGParseException("Invalid offset value in <stop>: ".concat(strB4), e5);
                                        }
                                    }
                                }
                            } else if (z19) {
                                i29++;
                            } else {
                                z18 = true;
                            }
                        }
                        strB4 = k.b(iF5, 1, value5, i29);
                        if (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i28)).ordinal()] != 37) {
                            if (strB4.length() != 0) {
                                throw new SVGParseException("Invalid offset value in <stop> (empty string)", null, 2, null);
                            }
                            length = strB4.length();
                            if (strB4.charAt(strB4.length() - 1) == '%') {
                                i11 = length - 1;
                                z10 = true;
                            } else {
                                i11 = length;
                                z10 = false;
                            }
                            fAccess$parseFloat = Companion.access$parseFloat(INSTANCE, strB4, 0, i11);
                            if (z10) {
                                fAccess$parseFloat /= 100.0f;
                            }
                            if (fAccess$parseFloat < 0.0f) {
                                objValueOf = 0;
                            } else if (fAccess$parseFloat > 100.0f) {
                                objValueOf = 100;
                            } else {
                                objValueOf = Float.valueOf(fAccess$parseFloat);
                            }
                            stop.setOffset(Float.valueOf(((Float) objValueOf).floatValue()));
                        }
                    }
                    SVG.SvgContainer svgContainer12 = this.f51387b;
                    Intrinsics.checkNotNull(svgContainer12);
                    svgContainer12.addChild(stop);
                    this.f51387b = stop;
                    return;
                case 22:
                case 23:
                    this.f51390e = true;
                    this.f51391f = sVGElemFromString;
                    return;
                case 24:
                    if (this.f51387b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
                    }
                    SVG.ClipPath clipPath = new SVG.ClipPath();
                    clipPath.setDocument(this.f51386a);
                    clipPath.setParent(this.f51387b);
                    k(clipPath, attributes);
                    n(clipPath, attributes);
                    p(clipPath, attributes);
                    j(clipPath, attributes);
                    int length7 = attributes.getLength();
                    for (int i30 = 0; i30 < length7; i30++) {
                        String value6 = attributes.getValue(i30);
                        int iF6 = ai.a.f(value6, "attributes.getValue(i)", 1);
                        int i31 = 0;
                        boolean z20 = false;
                        while (i31 <= iF6) {
                            boolean z21 = Intrinsics.compare((int) value6.charAt(!z20 ? i31 : iF6), 32) <= 0;
                            if (z20) {
                                if (z21) {
                                    iF6--;
                                } else {
                                    strB5 = k.b(iF6, 1, value6, i31);
                                    if (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i30)).ordinal()] != 38) {
                                        if (Intrinsics.areEqual("objectBoundingBox", strB5)) {
                                            clipPath.setClipPathUnitsAreUser(Boolean.FALSE);
                                        } else {
                                            if (Intrinsics.areEqual("userSpaceOnUse", strB5)) {
                                                throw new SVGParseException("Invalid value for attribute clipPathUnits", null, 2, null);
                                            }
                                            clipPath.setClipPathUnitsAreUser(Boolean.TRUE);
                                        }
                                    }
                                }
                            } else if (z21) {
                                i31++;
                            } else {
                                z20 = true;
                            }
                        }
                        strB5 = k.b(iF6, 1, value6, i31);
                        if (WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i30)).ordinal()] != 38) {
                            if (Intrinsics.areEqual("objectBoundingBox", strB5)) {
                                clipPath.setClipPathUnitsAreUser(Boolean.FALSE);
                            } else {
                                if (Intrinsics.areEqual("userSpaceOnUse", strB5)) {
                                    throw new SVGParseException("Invalid value for attribute clipPathUnits", null, 2, null);
                                }
                                clipPath.setClipPathUnitsAreUser(Boolean.TRUE);
                            }
                        }
                    }
                    SVG.SvgContainer svgContainer13 = this.f51387b;
                    Intrinsics.checkNotNull(svgContainer13);
                    svgContainer13.addChild(clipPath);
                    this.f51387b = clipPath;
                    return;
                case 25:
                    if (this.f51387b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
                    }
                    SVG.TextPath textPath = new SVG.TextPath();
                    textPath.setDocument(this.f51386a);
                    textPath.setParent(this.f51387b);
                    k(textPath, attributes);
                    n(textPath, attributes);
                    j(textPath, attributes);
                    int length8 = attributes.getLength();
                    for (int i32 = 0; i32 < length8; i32++) {
                        String value7 = attributes.getValue(i32);
                        int iF7 = ai.a.f(value7, "attributes.getValue(i)", 1);
                        int i33 = 0;
                        boolean z22 = false;
                        while (i33 <= iF7) {
                            boolean z23 = Intrinsics.compare((int) value7.charAt(!z22 ? i33 : iF7), 32) <= 0;
                            if (z22) {
                                if (z23) {
                                    iF7--;
                                } else {
                                    strB6 = k.b(iF7, 1, value7, i33);
                                    i12 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i32)).ordinal()];
                                    if (i12 != 6) {
                                        if (i12 != 39) {
                                            textPath.setStartOffset(INSTANCE.parseLength(strB6));
                                        }
                                    } else if (Intrinsics.areEqual("", attributes.getURI(i32)) || Intrinsics.areEqual("http://www.w3.org/1999/xlink", attributes.getURI(i32))) {
                                        textPath.setHref(strB6);
                                    }
                                }
                            } else if (z23) {
                                i33++;
                            } else {
                                z22 = true;
                            }
                        }
                        strB6 = k.b(iF7, 1, value7, i33);
                        i12 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i32)).ordinal()];
                        if (i12 != 6) {
                            if (i12 != 39) {
                                textPath.setStartOffset(INSTANCE.parseLength(strB6));
                            }
                        } else if (Intrinsics.areEqual("", attributes.getURI(i32))) {
                            textPath.setHref(strB6);
                        } else {
                            textPath.setHref(strB6);
                        }
                    }
                    SVG.SvgContainer svgContainer14 = this.f51387b;
                    Intrinsics.checkNotNull(svgContainer14);
                    svgContainer14.addChild(textPath);
                    this.f51387b = textPath;
                    if (textPath.getParent() instanceof SVG.TextRoot) {
                        SVG.SvgContainer parent5 = textPath.getParent();
                        Intrinsics.checkNotNull(parent5, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.TextRoot");
                        textPath.setTextRoot((SVG.TextRoot) parent5);
                        return;
                    } else {
                        SVG.SvgContainer parent6 = textPath.getParent();
                        Intrinsics.checkNotNull(parent6, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.TextChild");
                        textPath.setTextRoot(((SVG.TextChild) parent6).getTextRoot());
                        return;
                    }
                case 26:
                    if (this.f51387b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
                    }
                    SVG.Pattern pattern = new SVG.Pattern();
                    pattern.setDocument(this.f51386a);
                    pattern.setParent(this.f51387b);
                    k(pattern, attributes);
                    n(pattern, attributes);
                    j(pattern, attributes);
                    q(pattern, attributes);
                    int length9 = attributes.getLength();
                    int i34 = 0;
                    while (i34 < length9) {
                        String value8 = attributes.getValue(i34);
                        int iF8 = ai.a.f(value8, "attributes.getValue(i)", i17);
                        int i35 = 0;
                        boolean z24 = false;
                        while (i35 <= iF8) {
                            boolean z25 = Intrinsics.compare((int) value8.charAt(!z24 ? i35 : iF8), 32) <= 0;
                            if (z24) {
                                if (z25) {
                                    iF8--;
                                } else {
                                    strB7 = k.b(iF8, 1, value8, i35);
                                    i13 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i34)).ordinal()];
                                    if (i13 != 1) {
                                        pattern.setX(INSTANCE.parseLength(strB7));
                                    } else if (i13 != 2) {
                                        pattern.setY(INSTANCE.parseLength(strB7));
                                    } else if (i13 != 3) {
                                        pattern.setWidth(INSTANCE.parseLength(strB7));
                                        width = pattern.getWidth();
                                        Intrinsics.checkNotNull(width);
                                        if (!width.isNegative()) {
                                            throw new SVGParseException("Invalid <pattern> element. width cannot be negative", null, 2, null);
                                        }
                                    } else if (i13 != 4) {
                                        pattern.setHeight(INSTANCE.parseLength(strB7));
                                        height = pattern.getHeight();
                                        Intrinsics.checkNotNull(height);
                                        if (!height.isNegative()) {
                                            throw new SVGParseException("Invalid <pattern> element. height cannot be negative", null, 2, null);
                                        }
                                    } else if (i13 != 6) {
                                        switch (i13) {
                                            case 40:
                                                if (Intrinsics.areEqual("objectBoundingBox", strB7)) {
                                                    if (Intrinsics.areEqual("userSpaceOnUse", strB7)) {
                                                        throw new SVGParseException("Invalid value for attribute patternUnits", null, 2, null);
                                                    }
                                                    pattern.setPatternUnitsAreUser(Boolean.TRUE);
                                                } else {
                                                    pattern.setPatternUnitsAreUser(Boolean.FALSE);
                                                }
                                                break;
                                            case 41:
                                                if (Intrinsics.areEqual("objectBoundingBox", strB7)) {
                                                    if (Intrinsics.areEqual("userSpaceOnUse", strB7)) {
                                                        throw new SVGParseException("Invalid value for attribute patternContentUnits", null, 2, null);
                                                    }
                                                    pattern.setPatternContentUnitsAreUser(Boolean.TRUE);
                                                } else {
                                                    pattern.setPatternContentUnitsAreUser(Boolean.FALSE);
                                                }
                                                break;
                                            case 42:
                                                pattern.setPatternTransform(s(strB7));
                                                break;
                                        }
                                    } else if (Intrinsics.areEqual("", attributes.getURI(i34)) || Intrinsics.areEqual("http://www.w3.org/1999/xlink", attributes.getURI(i34))) {
                                        pattern.setHref(strB7);
                                    }
                                    i34++;
                                    i17 = 1;
                                }
                            } else if (z25) {
                                i35++;
                            } else {
                                z24 = true;
                            }
                        }
                        strB7 = k.b(iF8, 1, value8, i35);
                        i13 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i34)).ordinal()];
                        if (i13 != 1) {
                            pattern.setX(INSTANCE.parseLength(strB7));
                        } else if (i13 != 2) {
                            pattern.setY(INSTANCE.parseLength(strB7));
                        } else if (i13 != 3) {
                            pattern.setWidth(INSTANCE.parseLength(strB7));
                            width = pattern.getWidth();
                            Intrinsics.checkNotNull(width);
                            if (!width.isNegative()) {
                                throw new SVGParseException("Invalid <pattern> element. width cannot be negative", null, 2, null);
                            }
                        } else if (i13 != 4) {
                            pattern.setHeight(INSTANCE.parseLength(strB7));
                            height = pattern.getHeight();
                            Intrinsics.checkNotNull(height);
                            if (!height.isNegative()) {
                                throw new SVGParseException("Invalid <pattern> element. height cannot be negative", null, 2, null);
                            }
                        } else if (i13 != 6) {
                            switch (i13) {
                                case 40:
                                    if (Intrinsics.areEqual("objectBoundingBox", strB7)) {
                                        if (Intrinsics.areEqual("userSpaceOnUse", strB7)) {
                                            throw new SVGParseException("Invalid value for attribute patternUnits", null, 2, null);
                                        }
                                        pattern.setPatternUnitsAreUser(Boolean.TRUE);
                                    } else {
                                        pattern.setPatternUnitsAreUser(Boolean.FALSE);
                                    }
                                    break;
                                case 41:
                                    if (Intrinsics.areEqual("objectBoundingBox", strB7)) {
                                        if (Intrinsics.areEqual("userSpaceOnUse", strB7)) {
                                            throw new SVGParseException("Invalid value for attribute patternContentUnits", null, 2, null);
                                        }
                                        pattern.setPatternContentUnitsAreUser(Boolean.TRUE);
                                    } else {
                                        pattern.setPatternContentUnitsAreUser(Boolean.FALSE);
                                    }
                                    break;
                                case 42:
                                    pattern.setPatternTransform(s(strB7));
                                    break;
                            }
                        } else if (Intrinsics.areEqual("", attributes.getURI(i34))) {
                            pattern.setHref(strB7);
                        } else {
                            pattern.setHref(strB7);
                        }
                        i34++;
                        i17 = 1;
                    }
                    SVG.SvgContainer svgContainer15 = this.f51387b;
                    Intrinsics.checkNotNull(svgContainer15);
                    svgContainer15.addChild(pattern);
                    this.f51387b = pattern;
                    return;
                case 27:
                    if (this.f51387b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
                    }
                    SVG.Image image = new SVG.Image();
                    image.setDocument(this.f51386a);
                    image.setParent(this.f51387b);
                    k(image, attributes);
                    n(image, attributes);
                    p(image, attributes);
                    j(image, attributes);
                    int length10 = attributes.getLength();
                    for (int i36 = 0; i36 < length10; i36++) {
                        String value9 = attributes.getValue(i36);
                        int iF9 = ai.a.f(value9, "attributes.getValue(i)", 1);
                        int i37 = 0;
                        boolean z26 = false;
                        while (i37 <= iF9) {
                            boolean z27 = Intrinsics.compare((int) value9.charAt(!z26 ? i37 : iF9), 32) <= 0;
                            if (z26) {
                                if (z27) {
                                    iF9--;
                                } else {
                                    strB8 = k.b(iF9, 1, value9, i37);
                                    i14 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i36)).ordinal()];
                                    if (i14 != 1) {
                                        image.setX(INSTANCE.parseLength(strB8));
                                    } else if (i14 != 2) {
                                        image.setY(INSTANCE.parseLength(strB8));
                                    } else if (i14 != 3) {
                                        image.setWidth(INSTANCE.parseLength(strB8));
                                        width2 = image.getWidth();
                                        Intrinsics.checkNotNull(width2);
                                        if (!width2.isNegative()) {
                                            throw new SVGParseException("Invalid <use> element. width cannot be negative", null, 2, null);
                                        }
                                    } else if (i14 != 4) {
                                        image.setHeight(INSTANCE.parseLength(strB8));
                                        height2 = image.getHeight();
                                        Intrinsics.checkNotNull(height2);
                                        if (!height2.isNegative()) {
                                            throw new SVGParseException("Invalid <use> element. height cannot be negative", null, 2, null);
                                        }
                                    } else if (i14 != 6) {
                                        if (i14 != 7) {
                                            Companion.access$parsePreserveAspectRatio(INSTANCE, image, strB8);
                                        }
                                    } else if (Intrinsics.areEqual("", attributes.getURI(i36)) || Intrinsics.areEqual("http://www.w3.org/1999/xlink", attributes.getURI(i36))) {
                                        image.setHref(strB8);
                                    }
                                }
                            } else if (z27) {
                                i37++;
                            } else {
                                z26 = true;
                            }
                        }
                        strB8 = k.b(iF9, 1, value9, i37);
                        i14 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i36)).ordinal()];
                        if (i14 != 1) {
                            image.setX(INSTANCE.parseLength(strB8));
                        } else if (i14 != 2) {
                            image.setY(INSTANCE.parseLength(strB8));
                        } else if (i14 != 3) {
                            image.setWidth(INSTANCE.parseLength(strB8));
                            width2 = image.getWidth();
                            Intrinsics.checkNotNull(width2);
                            if (!width2.isNegative()) {
                                throw new SVGParseException("Invalid <use> element. width cannot be negative", null, 2, null);
                            }
                        } else if (i14 != 4) {
                            image.setHeight(INSTANCE.parseLength(strB8));
                            height2 = image.getHeight();
                            Intrinsics.checkNotNull(height2);
                            if (!height2.isNegative()) {
                                throw new SVGParseException("Invalid <use> element. height cannot be negative", null, 2, null);
                            }
                        } else if (i14 != 6) {
                            if (i14 != 7) {
                                Companion.access$parsePreserveAspectRatio(INSTANCE, image, strB8);
                            }
                        } else if (Intrinsics.areEqual("", attributes.getURI(i36))) {
                            image.setHref(strB8);
                        } else {
                            image.setHref(strB8);
                        }
                    }
                    SVG.SvgContainer svgContainer16 = this.f51387b;
                    Intrinsics.checkNotNull(svgContainer16);
                    svgContainer16.addChild(image);
                    this.f51387b = image;
                    return;
                case 28:
                    if (this.f51387b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
                    }
                    SVG.View view = new SVG.View();
                    view.setDocument(this.f51386a);
                    view.setParent(this.f51387b);
                    k(view, attributes);
                    j(view, attributes);
                    q(view, attributes);
                    SVG.SvgContainer svgContainer17 = this.f51387b;
                    Intrinsics.checkNotNull(svgContainer17);
                    svgContainer17.addChild(view);
                    this.f51387b = view;
                    return;
                case 29:
                    if (this.f51387b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
                    }
                    SVG.Mask mask = new SVG.Mask();
                    mask.setDocument(this.f51386a);
                    mask.setParent(this.f51387b);
                    k(mask, attributes);
                    n(mask, attributes);
                    j(mask, attributes);
                    int length11 = attributes.getLength();
                    for (int i38 = 0; i38 < length11; i38++) {
                        String value10 = attributes.getValue(i38);
                        int iF10 = ai.a.f(value10, "attributes.getValue(i)", 1);
                        int i39 = 0;
                        boolean z28 = false;
                        while (i39 <= iF10) {
                            boolean z29 = Intrinsics.compare((int) value10.charAt(!z28 ? i39 : iF10), 32) <= 0;
                            if (z28) {
                                if (z29) {
                                    iF10--;
                                } else {
                                    strB9 = k.b(iF10, 1, value10, i39);
                                    i15 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i38)).ordinal()];
                                    if (i15 != 1) {
                                        mask.setX(INSTANCE.parseLength(strB9));
                                    } else if (i15 != 2) {
                                        mask.setY(INSTANCE.parseLength(strB9));
                                    } else if (i15 != 3) {
                                        mask.setWidth(INSTANCE.parseLength(strB9));
                                        width3 = mask.getWidth();
                                        Intrinsics.checkNotNull(width3);
                                        if (!width3.isNegative()) {
                                            throw new SVGParseException("Invalid <mask> element. width cannot be negative", null, 2, null);
                                        }
                                    } else if (i15 != 4) {
                                        mask.setHeight(INSTANCE.parseLength(strB9));
                                        height3 = mask.getHeight();
                                        Intrinsics.checkNotNull(height3);
                                        if (!height3.isNegative()) {
                                            throw new SVGParseException("Invalid <mask> element. height cannot be negative", null, 2, null);
                                        }
                                    } else if (i15 != 43) {
                                        if (i15 == 44) {
                                            continue;
                                        } else if (Intrinsics.areEqual("objectBoundingBox", strB9)) {
                                            mask.setMaskContentUnitsAreUser(Boolean.FALSE);
                                        } else {
                                            if (Intrinsics.areEqual("userSpaceOnUse", strB9)) {
                                                throw new SVGParseException("Invalid value for attribute maskContentUnits", null, 2, null);
                                            }
                                            mask.setMaskContentUnitsAreUser(Boolean.TRUE);
                                        }
                                    } else if (Intrinsics.areEqual("objectBoundingBox", strB9)) {
                                        mask.setMaskUnitsAreUser(Boolean.FALSE);
                                    } else {
                                        if (Intrinsics.areEqual("userSpaceOnUse", strB9)) {
                                            throw new SVGParseException("Invalid value for attribute maskUnits", null, 2, null);
                                        }
                                        mask.setMaskUnitsAreUser(Boolean.TRUE);
                                    }
                                }
                            } else if (z29) {
                                i39++;
                            } else {
                                z28 = true;
                            }
                        }
                        strB9 = k.b(iF10, 1, value10, i39);
                        i15 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i38)).ordinal()];
                        if (i15 != 1) {
                            mask.setX(INSTANCE.parseLength(strB9));
                        } else if (i15 != 2) {
                            mask.setY(INSTANCE.parseLength(strB9));
                        } else if (i15 != 3) {
                            mask.setWidth(INSTANCE.parseLength(strB9));
                            width3 = mask.getWidth();
                            Intrinsics.checkNotNull(width3);
                            if (!width3.isNegative()) {
                                throw new SVGParseException("Invalid <mask> element. width cannot be negative", null, 2, null);
                            }
                        } else if (i15 != 4) {
                            mask.setHeight(INSTANCE.parseLength(strB9));
                            height3 = mask.getHeight();
                            Intrinsics.checkNotNull(height3);
                            if (!height3.isNegative()) {
                                throw new SVGParseException("Invalid <mask> element. height cannot be negative", null, 2, null);
                            }
                        } else if (i15 != 43) {
                            if (i15 == 44) {
                                continue;
                            } else if (Intrinsics.areEqual("objectBoundingBox", strB9)) {
                                mask.setMaskContentUnitsAreUser(Boolean.FALSE);
                            } else {
                                if (Intrinsics.areEqual("userSpaceOnUse", strB9)) {
                                    throw new SVGParseException("Invalid value for attribute maskContentUnits", null, 2, null);
                                }
                                mask.setMaskContentUnitsAreUser(Boolean.TRUE);
                            }
                        } else if (Intrinsics.areEqual("objectBoundingBox", strB9)) {
                            mask.setMaskUnitsAreUser(Boolean.FALSE);
                        } else {
                            if (Intrinsics.areEqual("userSpaceOnUse", strB9)) {
                                throw new SVGParseException("Invalid value for attribute maskUnits", null, 2, null);
                            }
                            mask.setMaskUnitsAreUser(Boolean.TRUE);
                        }
                    }
                    SVG.SvgContainer svgContainer18 = this.f51387b;
                    Intrinsics.checkNotNull(svgContainer18);
                    svgContainer18.addChild(mask);
                    this.f51387b = mask;
                    return;
                case 30:
                    if (this.f51387b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
                    }
                    int length12 = attributes.getLength();
                    String str4 = XML_STYLESHEET_ATTR_MEDIA_ALL;
                    boolean zAreEqual = true;
                    for (int i40 = 0; i40 < length12; i40++) {
                        String value11 = attributes.getValue(i40);
                        int iF11 = ai.a.f(value11, "attributes.getValue(i)", 1);
                        int i41 = 0;
                        boolean z30 = false;
                        while (i41 <= iF11) {
                            boolean z31 = Intrinsics.compare((int) value11.charAt(!z30 ? i41 : iF11), 32) <= 0;
                            if (z30) {
                                if (z31) {
                                    iF11--;
                                } else {
                                    strB10 = k.b(iF11, 1, value11, i41);
                                    i16 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i40)).ordinal()];
                                    if (i16 != 48) {
                                        zAreEqual = Intrinsics.areEqual(strB10, CSSParser.CSS_MIME_TYPE);
                                    } else if (i16 != 49) {
                                        str4 = strB10;
                                    }
                                }
                            } else if (z31) {
                                i41++;
                            } else {
                                z30 = true;
                            }
                        }
                        strB10 = k.b(iF11, 1, value11, i41);
                        i16 = WhenMappings.$EnumSwitchMapping$1[SVGAttr.Companion.fromString(attributes.getLocalName(i40)).ordinal()];
                        if (i16 != 48) {
                            zAreEqual = Intrinsics.areEqual(strB10, CSSParser.CSS_MIME_TYPE);
                        } else if (i16 != 49) {
                            str4 = strB10;
                        }
                    }
                    if (zAreEqual && CSSParser.Companion.mediaMatches(str4, CSSParser.MediaType.screen)) {
                        this.f51393h = true;
                        return;
                    } else {
                        this.f51388c = true;
                        this.f51389d = 1;
                        return;
                    }
                case 31:
                    if (this.f51387b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>", null, 2, null);
                    }
                    SVG.SolidColor solidColor = new SVG.SolidColor();
                    solidColor.setDocument(this.f51386a);
                    solidColor.setParent(this.f51387b);
                    k(solidColor, attributes);
                    n(solidColor, attributes);
                    SVG.SvgContainer svgContainer19 = this.f51387b;
                    Intrinsics.checkNotNull(svgContainer19);
                    svgContainer19.addChild(solidColor);
                    this.f51387b = solidColor;
                    return;
                default:
                    this.f51388c = true;
                    this.f51389d = 1;
                    return;
            }
        }
    }
}
