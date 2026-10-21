package com.mastercard.sonic.androidsvg;

import ai.a;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.Log;
import androidx.camera.camera2.internal.h0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.noknok.android.client.metrics.Tabulator;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.l;
import kotlinx.coroutines.DebugKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SVG.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bA\b\u0000\u0018\u0000 ^2\u00020\u0001:T_`abcd^efghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001B\t\b\u0000¢\u0006\u0004\b\\\u0010]J\u0014\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J \u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u001c\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\u0012\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fJ\"\u0010\u0012\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0014\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0015\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\tJ&\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\tJ\u0010\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fJ\u0006\u0010#\u001a\u00020\"J\u0006\u0010$\u001a\u00020\u0010J\u000e\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\tJ\u000e\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\tJ\u0012\u0010+\u001a\u0004\u0018\u00010*2\b\u0010)\u001a\u0004\u0018\u00010\tR$\u00103\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010:\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0011\u0010=\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0011\u0010?\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0013\u0010A\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b@\u0010<R\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\t0B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR$\u0010H\u001a\u00020\u00162\u0006\u0010F\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u00107\"\u0004\b\u0014\u00109R$\u0010J\u001a\u00020\u00162\u0006\u0010F\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u00107\"\u0004\b\u0015\u00109R\u0013\u0010M\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bK\u0010LR(\u0010T\u001a\u0004\u0018\u00010N2\b\u0010O\u001a\u0004\u0018\u00010N8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0011\u0010V\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bU\u00107R\u001b\u0010[\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010X\u0018\u00010W8F¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006\u0099\u0001"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG;", "", "Lcom/mastercard/sonic/androidsvg/RenderOptions;", "renderOptions", "Landroid/graphics/Picture;", "renderToPicture", "", "widthInPixels", "heightInPixels", "", "viewId", "renderViewToPicture", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/RectF;", "viewPort", "", "renderToCanvas", "renderViewToCanvas", "value", "setDocumentWidth", "setDocumentHeight", "", "minX", "minY", "width", "height", "setDocumentViewBox", "iri", "Lcom/mastercard/sonic/androidsvg/SVG$SvgObject;", "resolveIRI", "Lcom/mastercard/sonic/androidsvg/CSSParser$Ruleset;", "ruleset", "addCSSRules", "", "hasCSSRules", "clearRenderCSSRules", "title", "setTitle", "desc", "setDesc", "id", "Lcom/mastercard/sonic/androidsvg/SVG$SvgElementBase;", "getElementById", "Lcom/mastercard/sonic/androidsvg/SVG$Svg;", "a", "Lcom/mastercard/sonic/androidsvg/SVG$Svg;", "getRootElement", "()Lcom/mastercard/sonic/androidsvg/SVG$Svg;", "setRootElement", "(Lcom/mastercard/sonic/androidsvg/SVG$Svg;)V", "rootElement", "d", "F", "getRenderDPI", "()F", "setRenderDPI", "(F)V", "renderDPI", "getDocumentTitle", "()Ljava/lang/String;", "documentTitle", "getDocumentDescription", "documentDescription", "getDocumentSVGVersion", "documentSVGVersion", "", "getViewList", "()Ljava/util/Set;", "viewList", "pixels", "getDocumentWidth", "documentWidth", "getDocumentHeight", "documentHeight", "getDocumentViewBox", "()Landroid/graphics/RectF;", "documentViewBox", "Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio;", "preserveAspectRatio", "getDocumentPreserveAspectRatio", "()Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio;", "setDocumentPreserveAspectRatio", "(Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio;)V", "documentPreserveAspectRatio", "getDocumentAspectRatio", "documentAspectRatio", "", "Lcom/mastercard/sonic/androidsvg/CSSParser$Rule;", "getCSSRules", "()Ljava/util/List;", "cSSRules", "<init>", "()V", "Companion", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Box", "CSSClipRect", "Circle", "ClipPath", "Colour", "CurrentColor", "Defs", "Ellipse", "GradientElement", "GradientSpread", "GraphicsElement", "Group", "HasTransform", "Image", "Length", "Line", "Marker", "Mask", "NotDirectlyRendered", "PaintReference", "Path", "PathDefinition", "PathInterface", "Pattern", "PolyLine", "Polygon", "Rect", "SolidColor", "Stop", "Style", "Svg", "SvgConditional", "SvgConditionalContainer", "SvgConditionalElement", "SvgContainer", "SvgElement", "SvgElementBase", "SvgLinearGradient", "SvgObject", "SvgPaint", "SvgPreserveAspectRatioContainer", "SvgRadialGradient", "SvgViewBoxContainer", "Switch", "Symbol", "TRef", "TSpan", "Text", "TextChild", "TextContainer", "TextPath", "TextPositionedContainer", "TextRoot", "TextSequence", "Unit", "Use", "View", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSVG.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SVG.kt\ncom/mastercard/sonic/androidsvg/SVG\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1975:1\n1#2:1976\n*E\n"})
public final class SVG {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static SVGExternalFileResolver f51178g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Svg rootElement;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f51181b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f51182c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float renderDPI = 96.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CSSParser.Ruleset f51184e = new CSSParser.Ruleset();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final HashMap f51185f = new HashMap();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f51179h = true;

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$A;", "Lcom/mastercard/sonic/androidsvg/SVG$Group;", "", "p", "Ljava/lang/String;", "getHref", "()Ljava/lang/String;", "setHref", "(Ljava/lang/String;)V", SVGParser.XML_STYLESHEET_ATTR_HREF, "getNodeName", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class A extends Group {

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String href;

        @Nullable
        public final String getHref() {
            return this.href;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.Group, com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "a";
        }

        public final void setHref(@Nullable String str) {
            this.href = str;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B/\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$CSSClipRect;", "", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "a", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "getTop", "()Lcom/mastercard/sonic/androidsvg/SVG$Length;", "setTop", "(Lcom/mastercard/sonic/androidsvg/SVG$Length;)V", "top", "b", "getRight", "setRight", Parameters.DIRECTION.RIGHT, "c", "getBottom", "setBottom", "bottom", "d", "getLeft", "setLeft", Parameters.DIRECTION.LEFT, "<init>", "(Lcom/mastercard/sonic/androidsvg/SVG$Length;Lcom/mastercard/sonic/androidsvg/SVG$Length;Lcom/mastercard/sonic/androidsvg/SVG$Length;Lcom/mastercard/sonic/androidsvg/SVG$Length;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class CSSClipRect {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length top;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length right;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length bottom;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length left;

        public CSSClipRect(@Nullable Length length, @Nullable Length length2, @Nullable Length length3, @Nullable Length length4) {
            this.top = length;
            this.right = length2;
            this.bottom = length3;
            this.left = length4;
        }

        @Nullable
        public final Length getBottom() {
            return this.bottom;
        }

        @Nullable
        public final Length getLeft() {
            return this.left;
        }

        @Nullable
        public final Length getRight() {
            return this.right;
        }

        @Nullable
        public final Length getTop() {
            return this.top;
        }

        public final void setBottom(@Nullable Length length) {
            this.bottom = length;
        }

        public final void setLeft(@Nullable Length length) {
            this.left = length;
        }

        public final void setRight(@Nullable Length length) {
            this.right = length;
        }

        public final void setTop(@Nullable Length length) {
            this.top = length;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Circle;", "Lcom/mastercard/sonic/androidsvg/SVG$GraphicsElement;", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "o", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "getCx", "()Lcom/mastercard/sonic/androidsvg/SVG$Length;", "setCx", "(Lcom/mastercard/sonic/androidsvg/SVG$Length;)V", "cx", "p", "getCy", "setCy", "cy", "q", "getR", "setR", "r", "", "getNodeName", "()Ljava/lang/String;", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Circle extends GraphicsElement {

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length cx;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length cy;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length r;

        @Nullable
        public final Length getCx() {
            return this.cx;
        }

        @Nullable
        public final Length getCy() {
            return this.cy;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "circle";
        }

        @Nullable
        public final Length getR() {
            return this.r;
        }

        public final void setCx(@Nullable Length length) {
            this.cx = length;
        }

        public final void setCy(@Nullable Length length) {
            this.cy = length;
        }

        public final void setR(@Nullable Length length) {
            this.r = length;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$ClipPath;", "Lcom/mastercard/sonic/androidsvg/SVG$Group;", "Lcom/mastercard/sonic/androidsvg/SVG$NotDirectlyRendered;", "", "p", "Ljava/lang/Boolean;", "getClipPathUnitsAreUser", "()Ljava/lang/Boolean;", "setClipPathUnitsAreUser", "(Ljava/lang/Boolean;)V", "clipPathUnitsAreUser", "", "getNodeName", "()Ljava/lang/String;", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class ClipPath extends Group implements NotDirectlyRendered {

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Boolean clipPathUnitsAreUser;

        @Nullable
        public final Boolean getClipPathUnitsAreUser() {
            return this.clipPathUnitsAreUser;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.Group, com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "clipPath";
        }

        public final void setClipPathUnitsAreUser(@Nullable Boolean bool) {
            this.clipPathUnitsAreUser = bool;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Colour;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgPaint;", "", "toString", "", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getColour", "()I", "setColour", "(I)V", "colour", "<init>", "Companion", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Colour extends SvgPaint {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public static final Colour f51199q0 = new Colour(ViewCompat.MEASURED_STATE_MASK);

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @NotNull
        public static final Colour f51200r0 = new Colour(0);

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public int colour;

        /* JADX INFO: compiled from: SVG.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Colour$Companion;", "", "()V", "BLACK", "Lcom/mastercard/sonic/androidsvg/SVG$Colour;", "getBLACK", "()Lcom/mastercard/sonic/androidsvg/SVG$Colour;", "TRANSPARENT", "getTRANSPARENT", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Colour getBLACK() {
                return Colour.f51199q0;
            }

            @NotNull
            public final Colour getTRANSPARENT() {
                return Colour.f51200r0;
            }
        }

        public Colour(int i10) {
            this.colour = i10;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgPaint
        @NotNull
        public Object clone() {
            return super.clone();
        }

        public final int getColour() {
            return this.colour;
        }

        public final void setColour(int i10) {
            this.colour = i10;
        }

        @NotNull
        public String toString() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return a.i(new Object[]{Integer.valueOf(this.colour)}, 1, "#%08x", "format(format, *args)");
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$CurrentColor;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgPaint;", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CurrentColor extends SvgPaint {

        @NotNull
        public static final CurrentColor INSTANCE = new CurrentColor();

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgPaint
        @NotNull
        public Object clone() {
            return super.clone();
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Defs;", "Lcom/mastercard/sonic/androidsvg/SVG$Group;", "Lcom/mastercard/sonic/androidsvg/SVG$NotDirectlyRendered;", "()V", "nodeName", "", "getNodeName", "()Ljava/lang/String;", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Defs extends Group implements NotDirectlyRendered {
        @Override // com.mastercard.sonic.androidsvg.SVG.Group, com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "defs";
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Ellipse;", "Lcom/mastercard/sonic/androidsvg/SVG$GraphicsElement;", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "o", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "getCx", "()Lcom/mastercard/sonic/androidsvg/SVG$Length;", "setCx", "(Lcom/mastercard/sonic/androidsvg/SVG$Length;)V", "cx", "p", "getCy", "setCy", "cy", "q", "getRx", "setRx", "rx", "r", "getRy", "setRy", "ry", "", "getNodeName", "()Ljava/lang/String;", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Ellipse extends GraphicsElement {

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length cx;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length cy;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length rx;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length ry;

        @Nullable
        public final Length getCx() {
            return this.cx;
        }

        @Nullable
        public final Length getCy() {
            return this.cy;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "ellipse";
        }

        @Nullable
        public final Length getRx() {
            return this.rx;
        }

        @Nullable
        public final Length getRy() {
            return this.ry;
        }

        public final void setCx(@Nullable Length length) {
            this.cx = length;
        }

        public final void setCy(@Nullable Length length) {
            this.cy = length;
        }

        public final void setRx(@Nullable Length length) {
            this.rx = length;
        }

        public final void setRy(@Nullable Length length) {
            this.ry = length;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b/\u00100J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R*\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$GradientElement;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgElementBase;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgObject;", "elem", "", "addChild", "", "h", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "children", "", "i", "Ljava/lang/Boolean;", "getGradientUnitsAreUser", "()Ljava/lang/Boolean;", "setGradientUnitsAreUser", "(Ljava/lang/Boolean;)V", "gradientUnitsAreUser", "Landroid/graphics/Matrix;", "j", "Landroid/graphics/Matrix;", "getGradientTransform", "()Landroid/graphics/Matrix;", "setGradientTransform", "(Landroid/graphics/Matrix;)V", "gradientTransform", "Lcom/mastercard/sonic/androidsvg/SVG$GradientSpread;", "k", "Lcom/mastercard/sonic/androidsvg/SVG$GradientSpread;", "getSpreadMethod", "()Lcom/mastercard/sonic/androidsvg/SVG$GradientSpread;", "setSpreadMethod", "(Lcom/mastercard/sonic/androidsvg/SVG$GradientSpread;)V", "spreadMethod", "", "l", "Ljava/lang/String;", "getHref", "()Ljava/lang/String;", "setHref", "(Ljava/lang/String;)V", SVGParser.XML_STYLESHEET_ATTR_HREF, "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class GradientElement extends SvgElementBase implements SvgContainer {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public List<SvgObject> children = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Boolean gradientUnitsAreUser;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Matrix gradientTransform;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public GradientSpread spreadMethod;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String href;

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgContainer
        public void addChild(@NotNull SvgObject elem) throws SVGParseException {
            Intrinsics.checkNotNullParameter(elem, "elem");
            if (elem instanceof Stop) {
                getChildren().add(elem);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + elem + " elements.", null, 2, null);
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgContainer
        @NotNull
        public List<SvgObject> getChildren() {
            return this.children;
        }

        @Nullable
        public final Matrix getGradientTransform() {
            return this.gradientTransform;
        }

        @Nullable
        public final Boolean getGradientUnitsAreUser() {
            return this.gradientUnitsAreUser;
        }

        @Nullable
        public final String getHref() {
            return this.href;
        }

        @Nullable
        public final GradientSpread getSpreadMethod() {
            return this.spreadMethod;
        }

        public void setChildren(@NotNull List<SvgObject> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.children = list;
        }

        public final void setGradientTransform(@Nullable Matrix matrix) {
            this.gradientTransform = matrix;
        }

        public final void setGradientUnitsAreUser(@Nullable Boolean bool) {
            this.gradientUnitsAreUser = bool;
        }

        public final void setHref(@Nullable String str) {
            this.href = str;
        }

        public final void setSpreadMethod(@Nullable GradientSpread gradientSpread) {
            this.spreadMethod = gradientSpread;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$GradientSpread;", "", "pad", "reflect", VDPhotoSelfieCapture.LOG_TAG_REPEAT, "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class GradientSpread {
        private static final /* synthetic */ GradientSpread[] $VALUES;
        public static final GradientSpread pad;
        public static final GradientSpread reflect;
        public static final GradientSpread repeat;

        static {
            GradientSpread gradientSpread = new GradientSpread("pad", 0);
            pad = gradientSpread;
            GradientSpread gradientSpread2 = new GradientSpread("reflect", 1);
            reflect = gradientSpread2;
            GradientSpread gradientSpread3 = new GradientSpread(VDPhotoSelfieCapture.LOG_TAG_REPEAT, 2);
            repeat = gradientSpread3;
            $VALUES = new GradientSpread[]{gradientSpread, gradientSpread2, gradientSpread3};
        }

        public GradientSpread() {
            throw null;
        }

        public static GradientSpread valueOf(String str) {
            return (GradientSpread) Enum.valueOf(GradientSpread.class, str);
        }

        public static GradientSpread[] values() {
            return (GradientSpread[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000b\u0010\fR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$GraphicsElement;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgConditionalElement;", "Lcom/mastercard/sonic/androidsvg/SVG$HasTransform;", "Landroid/graphics/Matrix;", "n", "Landroid/graphics/Matrix;", "getTransform", "()Landroid/graphics/Matrix;", "setTransform", "(Landroid/graphics/Matrix;)V", "transform", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class GraphicsElement extends SvgConditionalElement implements HasTransform {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Matrix transform;

        @Override // com.mastercard.sonic.androidsvg.SVG.HasTransform
        @Nullable
        public Matrix getTransform() {
            return this.transform;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.HasTransform
        public void setTransform(@Nullable Matrix matrix) {
            this.transform = matrix;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Group;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgConditionalContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$HasTransform;", "Landroid/graphics/Matrix;", "o", "Landroid/graphics/Matrix;", "getTransform", "()Landroid/graphics/Matrix;", "setTransform", "(Landroid/graphics/Matrix;)V", "transform", "", "getNodeName", "()Ljava/lang/String;", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static class Group extends SvgConditionalContainer implements HasTransform {

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Matrix transform;

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "group";
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.HasTransform
        @Nullable
        public Matrix getTransform() {
            return this.transform;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.HasTransform
        public void setTransform(@Nullable Matrix matrix) {
            this.transform = matrix;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$HasTransform;", "", "transform", "Landroid/graphics/Matrix;", "getTransform", "()Landroid/graphics/Matrix;", "setTransform", "(Landroid/graphics/Matrix;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface HasTransform {
        @Nullable
        Matrix getTransform();

        void setTransform(@Nullable Matrix matrix);
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b)\u0010*R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R$\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0007¨\u0006+"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Image;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgPreserveAspectRatioContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$HasTransform;", "", "p", "Ljava/lang/String;", "getHref", "()Ljava/lang/String;", "setHref", "(Ljava/lang/String;)V", SVGParser.XML_STYLESHEET_ATTR_HREF, "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "q", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "getX", "()Lcom/mastercard/sonic/androidsvg/SVG$Length;", "setX", "(Lcom/mastercard/sonic/androidsvg/SVG$Length;)V", "x", "r", "getY", "setY", "y", "s", "getWidth", "setWidth", "width", "t", "getHeight", "setHeight", "height", "Landroid/graphics/Matrix;", "u", "Landroid/graphics/Matrix;", "getTransform", "()Landroid/graphics/Matrix;", "setTransform", "(Landroid/graphics/Matrix;)V", "transform", "getNodeName", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Image extends SvgPreserveAspectRatioContainer implements HasTransform {

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String href;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length x;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length y;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length width;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length height;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Matrix transform;

        @Nullable
        public final Length getHeight() {
            return this.height;
        }

        @Nullable
        public final String getHref() {
            return this.href;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return AuthConstants.IMAGE;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.HasTransform
        @Nullable
        public Matrix getTransform() {
            return this.transform;
        }

        @Nullable
        public final Length getWidth() {
            return this.width;
        }

        @Nullable
        public final Length getX() {
            return this.x;
        }

        @Nullable
        public final Length getY() {
            return this.y;
        }

        public final void setHeight(@Nullable Length length) {
            this.height = length;
        }

        public final void setHref(@Nullable String str) {
            this.href = str;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.HasTransform
        public void setTransform(@Nullable Matrix matrix) {
            this.transform = matrix;
        }

        public final void setWidth(@Nullable Length length) {
            this.width = length;
        }

        public final void setX(@Nullable Length length) {
            this.x = length;
        }

        public final void setY(@Nullable Length length) {
            this.y = length;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Length;", "", "", "floatValue", "Lcom/mastercard/sonic/androidsvg/SVGAndroidRenderer;", "renderer", "floatValueX", "floatValueY", VDVideoSelfieConfiguration.MAX, "dpi", "", "toString", "p0", "F", "getValue", "()F", "setValue", "(F)V", "value", "Lcom/mastercard/sonic/androidsvg/SVG$Unit;", "q0", "Lcom/mastercard/sonic/androidsvg/SVG$Unit;", "getUnit", "()Lcom/mastercard/sonic/androidsvg/SVG$Unit;", "setUnit", "(Lcom/mastercard/sonic/androidsvg/SVG$Unit;)V", Tabulator.KEY_UNIT, "", "isZero", "()Z", "isNegative", "<init>", "(FLcom/mastercard/sonic/androidsvg/SVG$Unit;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Length implements Cloneable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public float value;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Unit unit;

        /* JADX INFO: compiled from: SVG.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Unit.values().length];
                try {
                    iArr[Unit.px.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Unit.f51322em.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Unit.ex.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Unit.f51323in.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Unit.f51321cm.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Unit.f51324mm.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Unit.pt.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Unit.f51325pc.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Unit.percent.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Length(float f6, @NotNull Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.value = f6;
            this.unit = unit;
        }

        @NotNull
        public Object clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: floatValue, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        public final float floatValueX(@NotNull SVGAndroidRenderer renderer) {
            float f6;
            float currentFontSize;
            float dpi;
            float f10;
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            switch (WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()]) {
                case 1:
                    return this.value;
                case 2:
                    f6 = this.value;
                    currentFontSize = renderer.getCurrentFontSize();
                    return currentFontSize * f6;
                case 3:
                    f6 = this.value;
                    currentFontSize = renderer.getCurrentFontXHeight();
                    return currentFontSize * f6;
                case 4:
                    f6 = this.value;
                    currentFontSize = renderer.getDpi();
                    return currentFontSize * f6;
                case 5:
                    dpi = renderer.getDpi() * this.value;
                    f10 = 2.54f;
                    return dpi / f10;
                case 6:
                    dpi = renderer.getDpi() * this.value;
                    f10 = 25.4f;
                    return dpi / f10;
                case 7:
                    dpi = renderer.getDpi() * this.value;
                    f10 = 72.0f;
                    return dpi / f10;
                case 8:
                    dpi = renderer.getDpi() * this.value;
                    f10 = 6.0f;
                    return dpi / f10;
                case 9:
                    Box currentViewPortInUserUnits = renderer.getCurrentViewPortInUserUnits();
                    if (currentViewPortInUserUnits == null) {
                        return this.value;
                    }
                    dpi = currentViewPortInUserUnits.getWidth() * this.value;
                    f10 = 100.0f;
                    return dpi / f10;
                default:
                    return this.value;
            }
        }

        public final float floatValueY(@NotNull SVGAndroidRenderer renderer) {
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            if (this.unit != Unit.percent) {
                return floatValueX(renderer);
            }
            Box currentViewPortInUserUnits = renderer.getCurrentViewPortInUserUnits();
            if (currentViewPortInUserUnits == null) {
                return this.value;
            }
            return (currentViewPortInUserUnits.getHeight() * this.value) / 100.0f;
        }

        @NotNull
        public final Unit getUnit() {
            return this.unit;
        }

        public final float getValue() {
            return this.value;
        }

        public final boolean isNegative() {
            return this.value < 0.0f;
        }

        public final boolean isZero() {
            return this.value == 0.0f;
        }

        public final void setUnit(@NotNull Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "<set-?>");
            this.unit = unit;
        }

        public final void setValue(float f6) {
            this.value = f6;
        }

        @NotNull
        public String toString() {
            float f6 = this.value;
            Unit unit = this.unit;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f6);
            sb2.append(unit);
            return sb2.toString();
        }

        public final float floatValue(@NotNull SVGAndroidRenderer renderer) {
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            if (this.unit != Unit.percent) {
                return floatValueX(renderer);
            }
            Box currentViewPortInUserUnits = renderer.getCurrentViewPortInUserUnits();
            if (currentViewPortInUserUnits == null) {
                return this.value;
            }
            float width = currentViewPortInUserUnits.getWidth();
            float height = currentViewPortInUserUnits.getHeight();
            if (width == height) {
                return (this.value * width) / 100.0f;
            }
            double d2 = height;
            return (this.value * ((float) (Math.sqrt((d2 * d2) + ((double) (width * width))) / 1.414213562373095d))) / 100.0f;
        }

        public Length(float f6) {
            this.value = f6;
            this.unit = Unit.px;
        }

        public final float floatValue(@NotNull SVGAndroidRenderer renderer, float max) {
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            if (this.unit == Unit.percent) {
                return (this.value * max) / 100.0f;
            }
            return floatValueX(renderer);
        }

        public final float floatValue(float dpi) {
            float f6;
            float f10;
            switch (WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()]) {
                case 1:
                    return this.value;
                case 2:
                case 3:
                case 9:
                    return this.value;
                case 4:
                    return dpi * this.value;
                case 5:
                    f6 = this.value * dpi;
                    f10 = 2.54f;
                    break;
                case 6:
                    f6 = this.value * dpi;
                    f10 = 25.4f;
                    break;
                case 7:
                    f6 = this.value * dpi;
                    f10 = 72.0f;
                    break;
                case 8:
                    f6 = this.value * dpi;
                    f10 = 6.0f;
                    break;
                default:
                    return this.value;
            }
            return f6 / f10;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Line;", "Lcom/mastercard/sonic/androidsvg/SVG$GraphicsElement;", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "o", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "getX1", "()Lcom/mastercard/sonic/androidsvg/SVG$Length;", "setX1", "(Lcom/mastercard/sonic/androidsvg/SVG$Length;)V", "x1", "p", "getY1", "setY1", "y1", "q", "getX2", "setX2", "x2", "r", "getY2", "setY2", "y2", "", "getNodeName", "()Ljava/lang/String;", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Line extends GraphicsElement {

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length x1;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length y1;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length x2;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length y2;

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "line";
        }

        @Nullable
        public final Length getX1() {
            return this.x1;
        }

        @Nullable
        public final Length getX2() {
            return this.x2;
        }

        @Nullable
        public final Length getY1() {
            return this.y1;
        }

        @Nullable
        public final Length getY2() {
            return this.y2;
        }

        public final void setX1(@Nullable Length length) {
            this.x1 = length;
        }

        public final void setX2(@Nullable Length length) {
            this.x2 = length;
        }

        public final void setY1(@Nullable Length length) {
            this.y1 = length;
        }

        public final void setY2(@Nullable Length length) {
            this.y2 = length;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b+\u0010,R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R$\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Marker;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgViewBoxContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$NotDirectlyRendered;", "", "q", "Z", "getMarkerUnitsAreUser", "()Z", "setMarkerUnitsAreUser", "(Z)V", "markerUnitsAreUser", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "r", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "getRefX", "()Lcom/mastercard/sonic/androidsvg/SVG$Length;", "setRefX", "(Lcom/mastercard/sonic/androidsvg/SVG$Length;)V", "refX", "s", "getRefY", "setRefY", "refY", "t", "getMarkerWidth", "setMarkerWidth", "markerWidth", "u", "getMarkerHeight", "setMarkerHeight", "markerHeight", "", SharedPrefsStorage.VERSION_KEY, "Ljava/lang/Float;", "getOrient", "()Ljava/lang/Float;", "setOrient", "(Ljava/lang/Float;)V", "orient", "", "getNodeName", "()Ljava/lang/String;", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Marker extends SvgViewBoxContainer implements NotDirectlyRendered {

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        public boolean markerUnitsAreUser;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length refX;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length refY;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length markerWidth;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length markerHeight;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Float orient;

        @Nullable
        public final Length getMarkerHeight() {
            return this.markerHeight;
        }

        public final boolean getMarkerUnitsAreUser() {
            return this.markerUnitsAreUser;
        }

        @Nullable
        public final Length getMarkerWidth() {
            return this.markerWidth;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "marker";
        }

        @Nullable
        public final Float getOrient() {
            return this.orient;
        }

        @Nullable
        public final Length getRefX() {
            return this.refX;
        }

        @Nullable
        public final Length getRefY() {
            return this.refY;
        }

        public final void setMarkerHeight(@Nullable Length length) {
            this.markerHeight = length;
        }

        public final void setMarkerUnitsAreUser(boolean z10) {
            this.markerUnitsAreUser = z10;
        }

        public final void setMarkerWidth(@Nullable Length length) {
            this.markerWidth = length;
        }

        public final void setOrient(@Nullable Float f6) {
            this.orient = f6;
        }

        public final void setRefX(@Nullable Length length) {
            this.refX = length;
        }

        public final void setRefY(@Nullable Length length) {
            this.refY = length;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b'\u0010(R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R$\u0010\"\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Mask;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgConditionalContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$NotDirectlyRendered;", "", "o", "Ljava/lang/Boolean;", "getMaskUnitsAreUser", "()Ljava/lang/Boolean;", "setMaskUnitsAreUser", "(Ljava/lang/Boolean;)V", "maskUnitsAreUser", "p", "getMaskContentUnitsAreUser", "setMaskContentUnitsAreUser", "maskContentUnitsAreUser", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "q", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "getX", "()Lcom/mastercard/sonic/androidsvg/SVG$Length;", "setX", "(Lcom/mastercard/sonic/androidsvg/SVG$Length;)V", "x", "r", "getY", "setY", "y", "s", "getWidth", "setWidth", "width", "t", "getHeight", "setHeight", "height", "", "getNodeName", "()Ljava/lang/String;", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Mask extends SvgConditionalContainer implements NotDirectlyRendered {

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Boolean maskUnitsAreUser;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Boolean maskContentUnitsAreUser;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length x;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length y;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length width;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length height;

        @Nullable
        public final Length getHeight() {
            return this.height;
        }

        @Nullable
        public final Boolean getMaskContentUnitsAreUser() {
            return this.maskContentUnitsAreUser;
        }

        @Nullable
        public final Boolean getMaskUnitsAreUser() {
            return this.maskUnitsAreUser;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "mask";
        }

        @Nullable
        public final Length getWidth() {
            return this.width;
        }

        @Nullable
        public final Length getX() {
            return this.x;
        }

        @Nullable
        public final Length getY() {
            return this.y;
        }

        public final void setHeight(@Nullable Length length) {
            this.height = length;
        }

        public final void setMaskContentUnitsAreUser(@Nullable Boolean bool) {
            this.maskContentUnitsAreUser = bool;
        }

        public final void setMaskUnitsAreUser(@Nullable Boolean bool) {
            this.maskUnitsAreUser = bool;
        }

        public final void setWidth(@Nullable Length length) {
            this.width = length;
        }

        public final void setX(@Nullable Length length) {
            this.x = length;
        }

        public final void setY(@Nullable Length length) {
            this.y = length;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$NotDirectlyRendered;", "", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface NotDirectlyRendered {
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$PaintReference;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgPaint;", "", "toString", "p0", "Ljava/lang/String;", "getHref", "()Ljava/lang/String;", "setHref", "(Ljava/lang/String;)V", SVGParser.XML_STYLESHEET_ATTR_HREF, "q0", "Lcom/mastercard/sonic/androidsvg/SVG$SvgPaint;", "getFallback", "()Lcom/mastercard/sonic/androidsvg/SVG$SvgPaint;", "setFallback", "(Lcom/mastercard/sonic/androidsvg/SVG$SvgPaint;)V", "fallback", "<init>", "(Ljava/lang/String;Lcom/mastercard/sonic/androidsvg/SVG$SvgPaint;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class PaintReference extends SvgPaint {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String href;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public SvgPaint fallback;

        public PaintReference(@NotNull String href, @Nullable SvgPaint svgPaint) {
            Intrinsics.checkNotNullParameter(href, "href");
            this.href = href;
            this.fallback = svgPaint;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgPaint
        @NotNull
        public Object clone() {
            return super.clone();
        }

        @Nullable
        public final SvgPaint getFallback() {
            return this.fallback;
        }

        @NotNull
        public final String getHref() {
            return this.href;
        }

        public final void setFallback(@Nullable SvgPaint svgPaint) {
            this.fallback = svgPaint;
        }

        public final void setHref(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.href = str;
        }

        @NotNull
        public String toString() {
            return this.href + " " + this.fallback;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Path;", "Lcom/mastercard/sonic/androidsvg/SVG$GraphicsElement;", "Lcom/mastercard/sonic/androidsvg/SVG$PathDefinition;", "o", "Lcom/mastercard/sonic/androidsvg/SVG$PathDefinition;", "getD", "()Lcom/mastercard/sonic/androidsvg/SVG$PathDefinition;", "setD", "(Lcom/mastercard/sonic/androidsvg/SVG$PathDefinition;)V", "d", "", "p", "Ljava/lang/Float;", "getPathLength", "()Ljava/lang/Float;", "setPathLength", "(Ljava/lang/Float;)V", "pathLength", "", "getNodeName", "()Ljava/lang/String;", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Path extends GraphicsElement {

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public PathDefinition d;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Float pathLength;

        @Nullable
        public final PathDefinition getD() {
            return this.d;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "path";
        }

        @Nullable
        public final Float getPathLength() {
            return this.pathLength;
        }

        public final void setD(@Nullable PathDefinition pathDefinition) {
            this.d = pathDefinition;
        }

        public final void setPathLength(@Nullable Float f6) {
            this.pathLength = f6;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J8\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016J(\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J@\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0001R\u0011\u0010\u001a\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$PathDefinition;", "Lcom/mastercard/sonic/androidsvg/SVG$PathInterface;", "", "x", "y", "", "moveTo", "lineTo", "x1", "y1", "x2", "y2", "x3", "y3", "cubicTo", "quadTo", "rx", "ry", "xAxisRotation", "", "largeArcFlag", "sweepFlag", "arcTo", HearingDisabilitiesConstants.CLOSE_MODAL, "handler", "enumeratePath", "isEmpty", "()Z", "<init>", "()V", "Companion", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class PathDefinition implements PathInterface {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f51242b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f51244d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public byte[] f51241a = new byte[8];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public float[] f51243c = new float[16];

        public final void a(byte b10) {
            int i10 = this.f51242b;
            byte[] bArr = this.f51241a;
            if (i10 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f51241a = bArr2;
            }
            byte[] bArr3 = this.f51241a;
            int i11 = this.f51242b;
            this.f51242b = i11 + 1;
            bArr3[i11] = b10;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.PathInterface
        public void arcTo(float rx, float ry, float xAxisRotation, boolean largeArcFlag, boolean sweepFlag, float x4, float y7) {
            a((byte) ((largeArcFlag ? 2 : 0) | 4 | (sweepFlag ? 1 : 0)));
            b(5);
            float[] fArr = this.f51243c;
            int i10 = this.f51244d;
            fArr[i10] = rx;
            fArr[i10 + 1] = ry;
            fArr[i10 + 2] = xAxisRotation;
            fArr[i10 + 3] = x4;
            this.f51244d = i10 + 5;
            fArr[i10 + 4] = y7;
        }

        public final void b(int i10) {
            float[] fArr = this.f51243c;
            if (fArr.length < this.f51244d + i10) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f51243c = fArr2;
            }
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.PathInterface
        public void close() {
            a((byte) 8);
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.PathInterface
        public void cubicTo(float x4, float y7, float x6, float y10, float x7, float y11) {
            a((byte) 2);
            b(6);
            float[] fArr = this.f51243c;
            int i10 = this.f51244d;
            fArr[i10] = x4;
            fArr[i10 + 1] = y7;
            fArr[i10 + 2] = x6;
            fArr[i10 + 3] = y10;
            fArr[i10 + 4] = x7;
            this.f51244d = i10 + 6;
            fArr[i10 + 5] = y11;
        }

        public final void enumeratePath(@NotNull PathInterface handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            int i10 = this.f51242b;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                byte b10 = this.f51241a[i12];
                if (b10 == 0) {
                    float[] fArr = this.f51243c;
                    int i13 = i11 + 1;
                    float f6 = fArr[i11];
                    i11 += 2;
                    handler.moveTo(f6, fArr[i13]);
                } else if (b10 == 1) {
                    float[] fArr2 = this.f51243c;
                    int i14 = i11 + 1;
                    float f10 = fArr2[i11];
                    i11 += 2;
                    handler.lineTo(f10, fArr2[i14]);
                } else if (b10 == 2) {
                    float[] fArr3 = this.f51243c;
                    handler.cubicTo(fArr3[i11], fArr3[i11 + 1], fArr3[i11 + 2], fArr3[i11 + 3], fArr3[i11 + 4], fArr3[i11 + 5]);
                    i11 += 6;
                } else if (b10 == 3) {
                    float[] fArr4 = this.f51243c;
                    float f11 = fArr4[i11];
                    float f12 = fArr4[i11 + 1];
                    int i15 = i11 + 3;
                    float f13 = fArr4[i11 + 2];
                    i11 += 4;
                    handler.quadTo(f11, f12, f13, fArr4[i15]);
                } else if (b10 == 8) {
                    handler.close();
                } else {
                    boolean z10 = (b10 & 2) != 0;
                    boolean z11 = (b10 & 1) != 0;
                    float[] fArr5 = this.f51243c;
                    handler.arcTo(fArr5[i11], fArr5[i11 + 1], fArr5[i11 + 2], z10, z11, fArr5[i11 + 3], fArr5[i11 + 4]);
                    i11 += 5;
                }
            }
        }

        public final boolean isEmpty() {
            return this.f51242b == 0;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.PathInterface
        public void lineTo(float x4, float y7) {
            a((byte) 1);
            b(2);
            float[] fArr = this.f51243c;
            int i10 = this.f51244d;
            fArr[i10] = x4;
            this.f51244d = i10 + 2;
            fArr[i10 + 1] = y7;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.PathInterface
        public void moveTo(float x4, float y7) {
            a((byte) 0);
            b(2);
            float[] fArr = this.f51243c;
            int i10 = this.f51244d;
            fArr[i10] = x4;
            this.f51244d = i10 + 2;
            fArr[i10 + 1] = y7;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.PathInterface
        public void quadTo(float x4, float y7, float x6, float y10) {
            a((byte) 3);
            b(4);
            float[] fArr = this.f51243c;
            int i10 = this.f51244d;
            fArr[i10] = x4;
            fArr[i10 + 1] = y7;
            fArr[i10 + 2] = x6;
            this.f51244d = i10 + 4;
            fArr[i10 + 3] = y10;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b`\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0003H&J8\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H&J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H&J(\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H&¨\u0006\u0018"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$PathInterface;", "", "arcTo", "", "rx", "", "ry", "xAxisRotation", "largeArcFlag", "", "sweepFlag", "x", "y", HearingDisabilitiesConstants.CLOSE_MODAL, "cubicTo", "x1", "y1", "x2", "y2", "x3", "y3", "lineTo", "moveTo", "quadTo", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface PathInterface {
        void arcTo(float rx, float ry, float xAxisRotation, boolean largeArcFlag, boolean sweepFlag, float x4, float y7);

        void close();

        void cubicTo(float x4, float y7, float x6, float y10, float x7, float y11);

        void lineTo(float x4, float y7);

        void moveTo(float x4, float y7);

        void quadTo(float x4, float y7, float x6, float y10);
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b4\u00105R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR$\u0010*\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR$\u00101\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00103\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010.¨\u00066"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Pattern;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgViewBoxContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$NotDirectlyRendered;", "", "q", "Ljava/lang/Boolean;", "getPatternUnitsAreUser", "()Ljava/lang/Boolean;", "setPatternUnitsAreUser", "(Ljava/lang/Boolean;)V", "patternUnitsAreUser", "r", "getPatternContentUnitsAreUser", "setPatternContentUnitsAreUser", "patternContentUnitsAreUser", "Landroid/graphics/Matrix;", "s", "Landroid/graphics/Matrix;", "getPatternTransform", "()Landroid/graphics/Matrix;", "setPatternTransform", "(Landroid/graphics/Matrix;)V", "patternTransform", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "t", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "getX", "()Lcom/mastercard/sonic/androidsvg/SVG$Length;", "setX", "(Lcom/mastercard/sonic/androidsvg/SVG$Length;)V", "x", "u", "getY", "setY", "y", SharedPrefsStorage.VERSION_KEY, "getWidth", "setWidth", "width", "w", "getHeight", "setHeight", "height", "", "Ljava/lang/String;", "getHref", "()Ljava/lang/String;", "setHref", "(Ljava/lang/String;)V", SVGParser.XML_STYLESHEET_ATTR_HREF, "getNodeName", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Pattern extends SvgViewBoxContainer implements NotDirectlyRendered {

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Boolean patternUnitsAreUser;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Boolean patternContentUnitsAreUser;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Matrix patternTransform;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length x;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length y;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length width;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length height;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String href;

        @Nullable
        public final Length getHeight() {
            return this.height;
        }

        @Nullable
        public final String getHref() {
            return this.href;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "pattern";
        }

        @Nullable
        public final Boolean getPatternContentUnitsAreUser() {
            return this.patternContentUnitsAreUser;
        }

        @Nullable
        public final Matrix getPatternTransform() {
            return this.patternTransform;
        }

        @Nullable
        public final Boolean getPatternUnitsAreUser() {
            return this.patternUnitsAreUser;
        }

        @Nullable
        public final Length getWidth() {
            return this.width;
        }

        @Nullable
        public final Length getX() {
            return this.x;
        }

        @Nullable
        public final Length getY() {
            return this.y;
        }

        public final void setHeight(@Nullable Length length) {
            this.height = length;
        }

        public final void setHref(@Nullable String str) {
            this.href = str;
        }

        public final void setPatternContentUnitsAreUser(@Nullable Boolean bool) {
            this.patternContentUnitsAreUser = bool;
        }

        public final void setPatternTransform(@Nullable Matrix matrix) {
            this.patternTransform = matrix;
        }

        public final void setPatternUnitsAreUser(@Nullable Boolean bool) {
            this.patternUnitsAreUser = bool;
        }

        public final void setWidth(@Nullable Length length) {
            this.width = length;
        }

        public final void setX(@Nullable Length length) {
            this.x = length;
        }

        public final void setY(@Nullable Length length) {
            this.y = length;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$PolyLine;", "Lcom/mastercard/sonic/androidsvg/SVG$GraphicsElement;", "", "o", "[F", "getPoints", "()[F", "setPoints", "([F)V", "points", "", "getNodeName", "()Ljava/lang/String;", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static class PolyLine extends GraphicsElement {

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public float[] points;

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "polyline";
        }

        @Nullable
        public final float[] getPoints() {
            return this.points;
        }

        public final void setPoints(@Nullable float[] fArr) {
            this.points = fArr;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Polygon;", "Lcom/mastercard/sonic/androidsvg/SVG$PolyLine;", "()V", "nodeName", "", "getNodeName", "()Ljava/lang/String;", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Polygon extends PolyLine {
        @Override // com.mastercard.sonic.androidsvg.SVG.PolyLine, com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "polygon";
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Rect;", "Lcom/mastercard/sonic/androidsvg/SVG$GraphicsElement;", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "o", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "getX", "()Lcom/mastercard/sonic/androidsvg/SVG$Length;", "setX", "(Lcom/mastercard/sonic/androidsvg/SVG$Length;)V", "x", "p", "getY", "setY", "y", "q", "getWidth", "setWidth", "width", "r", "getHeight", "setHeight", "height", "s", "getRx", "setRx", "rx", "t", "getRy", "setRy", "ry", "", "getNodeName", "()Ljava/lang/String;", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Rect extends GraphicsElement {

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length x;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length y;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length width;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length height;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length rx;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length ry;

        @Nullable
        public final Length getHeight() {
            return this.height;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "rect";
        }

        @Nullable
        public final Length getRx() {
            return this.rx;
        }

        @Nullable
        public final Length getRy() {
            return this.ry;
        }

        @Nullable
        public final Length getWidth() {
            return this.width;
        }

        @Nullable
        public final Length getX() {
            return this.x;
        }

        @Nullable
        public final Length getY() {
            return this.y;
        }

        public final void setHeight(@Nullable Length length) {
            this.height = length;
        }

        public final void setRx(@Nullable Length length) {
            this.rx = length;
        }

        public final void setRy(@Nullable Length length) {
            this.ry = length;
        }

        public final void setWidth(@Nullable Length length) {
            this.width = length;
        }

        public final void setX(@Nullable Length length) {
            this.x = length;
        }

        public final void setY(@Nullable Length length) {
            this.y = length;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$SolidColor;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgElementBase;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgContainer;", "()V", "children", "", "Lcom/mastercard/sonic/androidsvg/SVG$SvgObject;", "getChildren", "()Ljava/util/List;", "nodeName", "", "getNodeName", "()Ljava/lang/String;", "addChild", "", "elem", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SolidColor extends SvgElementBase implements SvgContainer {
        @Override // com.mastercard.sonic.androidsvg.SVG.SvgContainer
        public void addChild(@NotNull SvgObject elem) {
            Intrinsics.checkNotNullParameter(elem, "elem");
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgContainer
        @NotNull
        public List<SvgObject> getChildren() {
            return CollectionsKt__CollectionsKt.emptyList();
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "solidColor";
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Stop;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgElementBase;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgObject;", "elem", "", "addChild", "", "h", "Ljava/lang/Float;", "getOffset", "()Ljava/lang/Float;", "setOffset", "(Ljava/lang/Float;)V", TypedValues.CycleType.S_WAVE_OFFSET, "", "getChildren", "()Ljava/util/List;", "children", "", "getNodeName", "()Ljava/lang/String;", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Stop extends SvgElementBase implements SvgContainer {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Float offset;

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgContainer
        public void addChild(@NotNull SvgObject elem) {
            Intrinsics.checkNotNullParameter(elem, "elem");
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgContainer
        @NotNull
        public List<SvgObject> getChildren() {
            return CollectionsKt__CollectionsKt.emptyList();
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "stop";
        }

        @Nullable
        public final Float getOffset() {
            return this.offset;
        }

        public final void setOffset(@Nullable Float f6) {
            this.offset = f6;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001a¨\u0006\""}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Svg;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgViewBoxContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "q", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "getX", "()Lcom/mastercard/sonic/androidsvg/SVG$Length;", "setX", "(Lcom/mastercard/sonic/androidsvg/SVG$Length;)V", "x", "r", "getY", "setY", "y", "s", "getWidth", "setWidth", "width", "t", "getHeight", "setHeight", "height", "", "u", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "setVersion", "(Ljava/lang/String;)V", "version", "getNodeName", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Svg extends SvgViewBoxContainer {

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length x;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length y;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length width;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length height;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String version;

        @Nullable
        public final Length getHeight() {
            return this.height;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "svg";
        }

        @Nullable
        public final String getVersion() {
            return this.version;
        }

        @Nullable
        public final Length getWidth() {
            return this.width;
        }

        @Nullable
        public final Length getX() {
            return this.x;
        }

        @Nullable
        public final Length getY() {
            return this.y;
        }

        public final void setHeight(@Nullable Length length) {
            this.height = length;
        }

        public final void setVersion(@Nullable String str) {
            this.version = str;
        }

        public final void setWidth(@Nullable Length length) {
            this.width = length;
        }

        public final void setX(@Nullable Length length) {
            this.x = length;
        }

        public final void setY(@Nullable Length length) {
            this.y = length;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u000e\b`\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\"\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$SvgConditional;", "", "requiredExtensions", "", "getRequiredExtensions", "()Ljava/lang/String;", "setRequiredExtensions", "(Ljava/lang/String;)V", "requiredFeatures", "", "getRequiredFeatures", "()Ljava/util/Set;", "setRequiredFeatures", "(Ljava/util/Set;)V", "requiredFonts", "getRequiredFonts", "setRequiredFonts", "requiredFormats", "getRequiredFormats", "setRequiredFormats", "systemLanguage", "getSystemLanguage", "setSystemLanguage", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface SvgConditional {
        @Nullable
        String getRequiredExtensions();

        @Nullable
        Set<String> getRequiredFeatures();

        @Nullable
        Set<String> getRequiredFonts();

        @Nullable
        Set<String> getRequiredFormats();

        @Nullable
        Set<String> getSystemLanguage();

        void setRequiredExtensions(@Nullable String str);

        void setRequiredFeatures(@Nullable Set<String> set);

        void setRequiredFonts(@Nullable Set<String> set);

        void setRequiredFormats(@Nullable Set<String> set);

        void setSystemLanguage(@Nullable Set<String> set);
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u001d\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R*\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u0004\u0018\u00010\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR,\u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00108V@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R,\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R,\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\u0015\"\u0004\b*\u0010\u0017¨\u0006."}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$SvgConditionalContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgElement;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgConditional;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgObject;", "elem", "", "addChild", "", "i", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "children", "", "", "j", "Ljava/util/Set;", "getRequiredFeatures", "()Ljava/util/Set;", "setRequiredFeatures", "(Ljava/util/Set;)V", "requiredFeatures", "k", "Ljava/lang/String;", "getRequiredExtensions", "()Ljava/lang/String;", "setRequiredExtensions", "(Ljava/lang/String;)V", "requiredExtensions", "l", "getSystemLanguage", "setSystemLanguage", "systemLanguage", "m", "getRequiredFormats", "setRequiredFormats", "requiredFormats", "n", "getRequiredFonts", "setRequiredFonts", "requiredFonts", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class SvgConditionalContainer extends SvgElement implements SvgContainer, SvgConditional {

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public List<SvgObject> children = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Set<String> requiredFeatures;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String requiredExtensions;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Set<String> systemLanguage;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public Set<String> requiredFormats;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Set<String> requiredFonts;

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgContainer
        public void addChild(@NotNull SvgObject elem) throws SVGParseException {
            Intrinsics.checkNotNullParameter(elem, "elem");
            getChildren().add(elem);
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgContainer
        @NotNull
        public List<SvgObject> getChildren() {
            return this.children;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        @Nullable
        public String getRequiredExtensions() {
            return this.requiredExtensions;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        @Nullable
        public Set<String> getRequiredFeatures() {
            return this.requiredFeatures;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        @Nullable
        public Set<String> getRequiredFonts() {
            return this.requiredFonts;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        @Nullable
        public Set<String> getRequiredFormats() {
            return this.requiredFormats;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        @Nullable
        public Set<String> getSystemLanguage() {
            return null;
        }

        public void setChildren(@NotNull List<SvgObject> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.children = list;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        public void setRequiredExtensions(@Nullable String str) {
            this.requiredExtensions = str;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        public void setRequiredFeatures(@Nullable Set<String> set) {
            this.requiredFeatures = set;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        public void setRequiredFonts(@Nullable Set<String> set) {
            this.requiredFonts = set;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        public void setRequiredFormats(@Nullable Set<String> set) {
            this.requiredFormats = set;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        public void setSystemLanguage(@Nullable Set<String> set) {
            this.systemLanguage = set;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u001d\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001f\u0010 R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R,\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\nR,\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR,\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\n¨\u0006!"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$SvgConditionalElement;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgElement;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgConditional;", "", "", "i", "Ljava/util/Set;", "getRequiredFeatures", "()Ljava/util/Set;", "setRequiredFeatures", "(Ljava/util/Set;)V", "requiredFeatures", "j", "Ljava/lang/String;", "getRequiredExtensions", "()Ljava/lang/String;", "setRequiredExtensions", "(Ljava/lang/String;)V", "requiredExtensions", "k", "getSystemLanguage", "setSystemLanguage", "systemLanguage", "l", "getRequiredFormats", "setRequiredFormats", "requiredFormats", "m", "getRequiredFonts", "setRequiredFonts", "requiredFonts", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class SvgConditionalElement extends SvgElement implements SvgConditional {

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Set<String> requiredFeatures;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String requiredExtensions;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Set<String> systemLanguage;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Set<String> requiredFormats;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public Set<String> requiredFonts;

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        @Nullable
        public String getRequiredExtensions() {
            return this.requiredExtensions;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        @Nullable
        public Set<String> getRequiredFeatures() {
            return this.requiredFeatures;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        @Nullable
        public Set<String> getRequiredFonts() {
            return this.requiredFonts;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        @Nullable
        public Set<String> getRequiredFormats() {
            return this.requiredFormats;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        @Nullable
        public Set<String> getSystemLanguage() {
            return this.systemLanguage;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        public void setRequiredExtensions(@Nullable String str) {
            this.requiredExtensions = str;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        public void setRequiredFeatures(@Nullable Set<String> set) {
            this.requiredFeatures = set;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        public void setRequiredFonts(@Nullable Set<String> set) {
            this.requiredFonts = set;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        public void setRequiredFormats(@Nullable Set<String> set) {
            this.requiredFormats = set;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditional
        public void setSystemLanguage(@Nullable Set<String> set) {
            this.systemLanguage = set;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H&R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$SvgContainer;", "", "children", "", "Lcom/mastercard/sonic/androidsvg/SVG$SvgObject;", "getChildren", "()Ljava/util/List;", "addChild", "", "elem", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface SvgContainer {
        void addChild(@NotNull SvgObject elem) throws SVGParseException;

        @NotNull
        List<SvgObject> getChildren();
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$SvgElement;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgElementBase;", "Lcom/mastercard/sonic/androidsvg/SVG$Box;", "h", "Lcom/mastercard/sonic/androidsvg/SVG$Box;", "getBoundingBox", "()Lcom/mastercard/sonic/androidsvg/SVG$Box;", "setBoundingBox", "(Lcom/mastercard/sonic/androidsvg/SVG$Box;)V", "boundingBox", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class SvgElement extends SvgElementBase {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Box boundingBox;

        @Nullable
        public final Box getBoundingBox() {
            return this.boundingBox;
        }

        public final void setBoundingBox(@Nullable Box box) {
            this.boundingBox = box;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001e\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R*\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$SvgElementBase;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgObject;", "", "toString", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "id", "", "d", "Ljava/lang/Boolean;", "getSpacePreserve", "()Ljava/lang/Boolean;", "setSpacePreserve", "(Ljava/lang/Boolean;)V", "spacePreserve", "Lcom/mastercard/sonic/androidsvg/SVG$Style;", "e", "Lcom/mastercard/sonic/androidsvg/SVG$Style;", "getBaseStyle", "()Lcom/mastercard/sonic/androidsvg/SVG$Style;", "setBaseStyle", "(Lcom/mastercard/sonic/androidsvg/SVG$Style;)V", "baseStyle", "f", "getStyle", "setStyle", "style", "", "g", "Ljava/util/List;", "getClassNames", "()Ljava/util/List;", "setClassNames", "(Ljava/util/List;)V", "classNames", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class SvgElementBase extends SvgObject {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String id;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Boolean spacePreserve;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Style baseStyle;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Style style;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<String> classNames;

        @Nullable
        public final Style getBaseStyle() {
            return this.baseStyle;
        }

        @Nullable
        public final List<String> getClassNames() {
            return this.classNames;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final Boolean getSpacePreserve() {
            return this.spacePreserve;
        }

        @Nullable
        public final Style getStyle() {
            return this.style;
        }

        public final void setBaseStyle(@Nullable Style style) {
            this.baseStyle = style;
        }

        public final void setClassNames(@Nullable List<String> list) {
            this.classNames = list;
        }

        public final void setId(@Nullable String str) {
            this.id = str;
        }

        public final void setSpacePreserve(@Nullable Boolean bool) {
            this.spacePreserve = bool;
        }

        public final void setStyle(@Nullable Style style) {
            this.style = style;
        }

        @NotNull
        public String toString() {
            return getNodeName();
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$SvgLinearGradient;", "Lcom/mastercard/sonic/androidsvg/SVG$GradientElement;", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "m", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "getX1", "()Lcom/mastercard/sonic/androidsvg/SVG$Length;", "setX1", "(Lcom/mastercard/sonic/androidsvg/SVG$Length;)V", "x1", "n", "getY1", "setY1", "y1", "o", "getX2", "setX2", "x2", "p", "getY2", "setY2", "y2", "", "getNodeName", "()Ljava/lang/String;", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class SvgLinearGradient extends GradientElement {

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public Length x1;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length y1;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length x2;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length y2;

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "linearGradient";
        }

        @Nullable
        public final Length getX1() {
            return this.x1;
        }

        @Nullable
        public final Length getX2() {
            return this.x2;
        }

        @Nullable
        public final Length getY1() {
            return this.y1;
        }

        @Nullable
        public final Length getY2() {
            return this.y2;
        }

        public final void setX1(@Nullable Length length) {
            this.x1 = length;
        }

        public final void setX2(@Nullable Length length) {
            this.x2 = length;
        }

        public final void setY1(@Nullable Length length) {
            this.y1 = length;
        }

        public final void setY2(@Nullable Length length) {
            this.y2 = length;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$SvgObject;", "", "Lcom/mastercard/sonic/androidsvg/SVG;", "a", "Lcom/mastercard/sonic/androidsvg/SVG;", "getDocument", "()Lcom/mastercard/sonic/androidsvg/SVG;", "setDocument", "(Lcom/mastercard/sonic/androidsvg/SVG;)V", "document", "Lcom/mastercard/sonic/androidsvg/SVG$SvgContainer;", "b", "Lcom/mastercard/sonic/androidsvg/SVG$SvgContainer;", "getParent", "()Lcom/mastercard/sonic/androidsvg/SVG$SvgContainer;", "setParent", "(Lcom/mastercard/sonic/androidsvg/SVG$SvgContainer;)V", "parent", "", "getNodeName", "()Ljava/lang/String;", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static class SvgObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public SVG document;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public SvgContainer parent;

        @Nullable
        public final SVG getDocument() {
            return this.document;
        }

        @NotNull
        public String getNodeName() {
            return "";
        }

        @Nullable
        public final SvgContainer getParent() {
            return this.parent;
        }

        public final void setDocument(@Nullable SVG svg) {
            this.document = svg;
        }

        public final void setParent(@Nullable SvgContainer svgContainer) {
            this.parent = svgContainer;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$SvgPaint;", "", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class SvgPaint implements Cloneable {
        @NotNull
        public Object clone() {
            return super.clone();
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$SvgPreserveAspectRatioContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgConditionalContainer;", "Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio;", "o", "Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio;", "getPreserveAspectRatio", "()Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio;", "setPreserveAspectRatio", "(Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio;)V", "preserveAspectRatio", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class SvgPreserveAspectRatioContainer extends SvgConditionalContainer {

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public PreserveAspectRatio preserveAspectRatio;

        @Nullable
        public final PreserveAspectRatio getPreserveAspectRatio() {
            return this.preserveAspectRatio;
        }

        public final void setPreserveAspectRatio(@Nullable PreserveAspectRatio preserveAspectRatio) {
            this.preserveAspectRatio = preserveAspectRatio;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$SvgRadialGradient;", "Lcom/mastercard/sonic/androidsvg/SVG$GradientElement;", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "m", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "getCx", "()Lcom/mastercard/sonic/androidsvg/SVG$Length;", "setCx", "(Lcom/mastercard/sonic/androidsvg/SVG$Length;)V", "cx", "n", "getCy", "setCy", "cy", "o", "getR", "setR", "r", "p", "getFx", "setFx", "fx", "q", "getFy", "setFy", "fy", "", "getNodeName", "()Ljava/lang/String;", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class SvgRadialGradient extends GradientElement {

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public Length cx;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length cy;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length r;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length fx;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length fy;

        @Nullable
        public final Length getCx() {
            return this.cx;
        }

        @Nullable
        public final Length getCy() {
            return this.cy;
        }

        @Nullable
        public final Length getFx() {
            return this.fx;
        }

        @Nullable
        public final Length getFy() {
            return this.fy;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "radialGradient";
        }

        @Nullable
        public final Length getR() {
            return this.r;
        }

        public final void setCx(@Nullable Length length) {
            this.cx = length;
        }

        public final void setCy(@Nullable Length length) {
            this.cy = length;
        }

        public final void setFx(@Nullable Length length) {
            this.fx = length;
        }

        public final void setFy(@Nullable Length length) {
            this.fy = length;
        }

        public final void setR(@Nullable Length length) {
            this.r = length;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$SvgViewBoxContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgPreserveAspectRatioContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$Box;", "p", "Lcom/mastercard/sonic/androidsvg/SVG$Box;", "getViewBox", "()Lcom/mastercard/sonic/androidsvg/SVG$Box;", "setViewBox", "(Lcom/mastercard/sonic/androidsvg/SVG$Box;)V", "viewBox", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class SvgViewBoxContainer extends SvgPreserveAspectRatioContainer {

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Box viewBox;

        @Nullable
        public final Box getViewBox() {
            return this.viewBox;
        }

        public final void setViewBox(@Nullable Box box) {
            this.viewBox = box;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Switch;", "Lcom/mastercard/sonic/androidsvg/SVG$Group;", "()V", "nodeName", "", "getNodeName", "()Ljava/lang/String;", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Switch extends Group {
        @Override // com.mastercard.sonic.androidsvg.SVG.Group, com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "switch";
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Symbol;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgViewBoxContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$NotDirectlyRendered;", "()V", "nodeName", "", "getNodeName", "()Ljava/lang/String;", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Symbol extends SvgViewBoxContainer implements NotDirectlyRendered {
        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "symbol";
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$TRef;", "Lcom/mastercard/sonic/androidsvg/SVG$TextContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$TextChild;", "", "o", "Ljava/lang/String;", "getHref", "()Ljava/lang/String;", "setHref", "(Ljava/lang/String;)V", SVGParser.XML_STYLESHEET_ATTR_HREF, "Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;", "p", "Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;", "getTextRoot", "()Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;", "setTextRoot", "(Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;)V", "textRoot", "getNodeName", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class TRef extends TextContainer implements TextChild {

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String href;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public TextRoot textRoot;

        @Nullable
        public final String getHref() {
            return this.href;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "tref";
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.TextChild
        @Nullable
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        public final void setHref(@Nullable String str) {
            this.href = str;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.TextChild
        public void setTextRoot(@Nullable TextRoot textRoot) {
            this.textRoot = textRoot;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$TSpan;", "Lcom/mastercard/sonic/androidsvg/SVG$TextPositionedContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$TextChild;", "Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;", "s", "Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;", "getTextRoot", "()Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;", "setTextRoot", "(Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;)V", "textRoot", "", "getNodeName", "()Ljava/lang/String;", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class TSpan extends TextPositionedContainer implements TextChild {

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public TextRoot textRoot;

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "tspan";
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.TextChild
        @Nullable
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.TextChild
        public void setTextRoot(@Nullable TextRoot textRoot) {
            this.textRoot = textRoot;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Text;", "Lcom/mastercard/sonic/androidsvg/SVG$TextPositionedContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;", "Lcom/mastercard/sonic/androidsvg/SVG$HasTransform;", "Landroid/graphics/Matrix;", "s", "Landroid/graphics/Matrix;", "getTransform", "()Landroid/graphics/Matrix;", "setTransform", "(Landroid/graphics/Matrix;)V", "transform", "", "getNodeName", "()Ljava/lang/String;", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Text extends TextPositionedContainer implements TextRoot, HasTransform {

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Matrix transform;

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "text";
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.HasTransform
        @Nullable
        public Matrix getTransform() {
            return this.transform;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.HasTransform
        public void setTransform(@Nullable Matrix matrix) {
            this.transform = matrix;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$TextChild;", "", "textRoot", "Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;", "getTextRoot", "()Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;", "setTextRoot", "(Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface TextChild {
        @Nullable
        TextRoot getTextRoot();

        void setTextRoot(@Nullable TextRoot textRoot);
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$TextContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgConditionalContainer;", "()V", "addChild", "", "elem", "Lcom/mastercard/sonic/androidsvg/SVG$SvgObject;", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class TextContainer extends SvgConditionalContainer {
        @Override // com.mastercard.sonic.androidsvg.SVG.SvgConditionalContainer, com.mastercard.sonic.androidsvg.SVG.SvgContainer
        public void addChild(@NotNull SvgObject elem) throws SVGParseException {
            Intrinsics.checkNotNullParameter(elem, "elem");
            if (elem instanceof TextChild) {
                getChildren().add(elem);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + elem + " elements.", null, 2, null);
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$TextPath;", "Lcom/mastercard/sonic/androidsvg/SVG$TextContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$TextChild;", "", "o", "Ljava/lang/String;", "getHref", "()Ljava/lang/String;", "setHref", "(Ljava/lang/String;)V", SVGParser.XML_STYLESHEET_ATTR_HREF, "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "p", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "getStartOffset", "()Lcom/mastercard/sonic/androidsvg/SVG$Length;", "setStartOffset", "(Lcom/mastercard/sonic/androidsvg/SVG$Length;)V", "startOffset", "Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;", "q", "Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;", "getTextRoot", "()Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;", "setTextRoot", "(Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;)V", "textRoot", "getNodeName", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class TextPath extends TextContainer implements TextChild {

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String href;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length startOffset;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public TextRoot textRoot;

        @Nullable
        public final String getHref() {
            return this.href;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "textPath";
        }

        @Nullable
        public final Length getStartOffset() {
            return this.startOffset;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.TextChild
        @Nullable
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        public final void setHref(@Nullable String str) {
            this.href = str;
        }

        public final void setStartOffset(@Nullable Length length) {
            this.startOffset = length;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.TextChild
        public void setTextRoot(@Nullable TextRoot textRoot) {
            this.textRoot = textRoot;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$TextPositionedContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$TextContainer;", "", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "o", "Ljava/util/List;", "getX", "()Ljava/util/List;", "setX", "(Ljava/util/List;)V", "x", "p", "getY", "setY", "y", "q", "getDx", "setDx", "dx", "r", "getDy", "setDy", "dy", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class TextPositionedContainer extends TextContainer {

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<Length> x;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<Length> y;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<Length> dx;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<Length> dy;

        @Nullable
        public final List<Length> getDx() {
            return this.dx;
        }

        @Nullable
        public final List<Length> getDy() {
            return this.dy;
        }

        @Nullable
        public final List<Length> getX() {
            return this.x;
        }

        @Nullable
        public final List<Length> getY() {
            return this.y;
        }

        public final void setDx(@Nullable List<Length> list) {
            this.dx = list;
        }

        public final void setDy(@Nullable List<Length> list) {
            this.dy = list;
        }

        public final void setX(@Nullable List<Length> list) {
            this.x = list;
        }

        public final void setY(@Nullable List<Length> list) {
            this.y = list;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;", "", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface TextRoot {
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$TextSequence;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgObject;", "Lcom/mastercard/sonic/androidsvg/SVG$TextChild;", "", "toString", "c", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;", "d", "Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;", "getTextRoot", "()Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;", "setTextRoot", "(Lcom/mastercard/sonic/androidsvg/SVG$TextRoot;)V", "textRoot", "<init>", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class TextSequence extends SvgObject implements TextChild {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String text;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public TextRoot textRoot;

        public TextSequence(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.TextChild
        @Nullable
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        public final void setText(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.text = str;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.TextChild
        public void setTextRoot(@Nullable TextRoot textRoot) {
            this.textRoot = textRoot;
        }

        @NotNull
        public String toString() {
            return h0.b("TextChild: '", this.text, "'");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Unit;", "", "px", "em", "ex", "in", "cm", "mm", DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT, "pc", "percent", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Unit {
        private static final /* synthetic */ Unit[] $VALUES;

        /* JADX INFO: renamed from: cm, reason: collision with root package name */
        public static final Unit f51321cm;

        /* JADX INFO: renamed from: em, reason: collision with root package name */
        public static final Unit f51322em;
        public static final Unit ex;

        /* JADX INFO: renamed from: in, reason: collision with root package name */
        public static final Unit f51323in;

        /* JADX INFO: renamed from: mm, reason: collision with root package name */
        public static final Unit f51324mm;

        /* JADX INFO: renamed from: pc, reason: collision with root package name */
        public static final Unit f51325pc;
        public static final Unit percent;
        public static final Unit pt;
        public static final Unit px;

        static {
            Unit unit = new Unit("px", 0);
            px = unit;
            Unit unit2 = new Unit("em", 1);
            f51322em = unit2;
            Unit unit3 = new Unit("ex", 2);
            ex = unit3;
            Unit unit4 = new Unit("in", 3);
            f51323in = unit4;
            Unit unit5 = new Unit("cm", 4);
            f51321cm = unit5;
            Unit unit6 = new Unit("mm", 5);
            f51324mm = unit6;
            Unit unit7 = new Unit(DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT, 6);
            pt = unit7;
            Unit unit8 = new Unit("pc", 7);
            f51325pc = unit8;
            Unit unit9 = new Unit("percent", 8);
            percent = unit9;
            $VALUES = new Unit[]{unit, unit2, unit3, unit4, unit5, unit6, unit7, unit8, unit9};
        }

        public Unit() {
            throw null;
        }

        public static Unit valueOf(String str) {
            return (Unit) Enum.valueOf(Unit.class, str);
        }

        public static Unit[] values() {
            return (Unit[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R$\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u0014\u0010\u001f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0006¨\u0006\""}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Use;", "Lcom/mastercard/sonic/androidsvg/SVG$Group;", "", "p", "Ljava/lang/String;", "getHref", "()Ljava/lang/String;", "setHref", "(Ljava/lang/String;)V", SVGParser.XML_STYLESHEET_ATTR_HREF, "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "q", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "getX", "()Lcom/mastercard/sonic/androidsvg/SVG$Length;", "setX", "(Lcom/mastercard/sonic/androidsvg/SVG$Length;)V", "x", "r", "getY", "setY", "y", "s", "getWidth", "setWidth", "width", "t", "getHeight", "setHeight", "height", "getNodeName", "nodeName", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Use extends Group {

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String href;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length x;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length y;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length width;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Length height;

        @Nullable
        public final Length getHeight() {
            return this.height;
        }

        @Nullable
        public final String getHref() {
            return this.href;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.Group, com.mastercard.sonic.androidsvg.SVG.SvgObject
        @NotNull
        public String getNodeName() {
            return "use";
        }

        @Nullable
        public final Length getWidth() {
            return this.width;
        }

        @Nullable
        public final Length getX() {
            return this.x;
        }

        @Nullable
        public final Length getY() {
            return this.y;
        }

        public final void setHeight(@Nullable Length length) {
            this.height = length;
        }

        public final void setHref(@Nullable String str) {
            this.href = str;
        }

        public final void setWidth(@Nullable Length length) {
            this.width = length;
        }

        public final void setX(@Nullable Length length) {
            this.x = length;
        }

        public final void setY(@Nullable Length length) {
            this.y = length;
        }
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$View;", "Lcom/mastercard/sonic/androidsvg/SVG$SvgViewBoxContainer;", "Lcom/mastercard/sonic/androidsvg/SVG$NotDirectlyRendered;", "()V", "Companion", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class View extends SvgViewBoxContainer implements NotDirectlyRendered {

        @NotNull
        public static final String nodeName = "view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SvgElementBase b(SvgContainer svgContainer, String str) {
        SvgElementBase svgElementBaseB;
        SvgElementBase svgElementBase = (SvgElementBase) svgContainer;
        Intrinsics.checkNotNull(svgElementBase);
        if (Intrinsics.areEqual(str, svgElementBase.getId())) {
            return svgElementBase;
        }
        Intrinsics.checkNotNull(svgContainer);
        for (Object obj : svgContainer.getChildren()) {
            if (obj instanceof SvgElementBase) {
                SvgElementBase svgElementBase2 = (SvgElementBase) obj;
                if (Intrinsics.areEqual(str, svgElementBase2.getId())) {
                    return svgElementBase2;
                }
                if ((obj instanceof SvgContainer) && (svgElementBaseB = b((SvgContainer) obj, str)) != null) {
                    return svgElementBaseB;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(ArrayList arrayList, SvgObject svgObject) {
        Intrinsics.checkNotNull(svgObject);
        if (Intrinsics.areEqual(svgObject.getNodeName(), "view")) {
            arrayList.add(svgObject);
        }
        if (svgObject instanceof SvgContainer) {
            Iterator<SvgObject> it = ((SvgContainer) svgObject).getChildren().iterator();
            while (it.hasNext()) {
                c(arrayList, it.next());
            }
        }
    }

    @JvmStatic
    public static final void deregisterExternalFileResolver() {
        INSTANCE.deregisterExternalFileResolver();
    }

    @Nullable
    public static final SVGExternalFileResolver getExternalFileResolver() {
        return INSTANCE.getExternalFileResolver();
    }

    @JvmStatic
    @Nullable
    public static final SVG getFromAsset(@NotNull AssetManager assetManager, @Nullable String str) throws SVGParseException, IOException {
        return INSTANCE.getFromAsset(assetManager, str);
    }

    @JvmStatic
    @Nullable
    public static final SVG getFromInputStream(@NotNull InputStream inputStream) throws SVGParseException {
        return INSTANCE.getFromInputStream(inputStream);
    }

    @JvmStatic
    @Nullable
    public static final SVG getFromResource(@NotNull Context context, int i10) throws SVGParseException {
        return INSTANCE.getFromResource(context, i10);
    }

    @JvmStatic
    @Nullable
    public static final SVG getFromString(@NotNull String str) throws SVGParseException {
        return INSTANCE.getFromString(str);
    }

    public static final boolean isInternalEntitiesEnabled() {
        return INSTANCE.isInternalEntitiesEnabled();
    }

    @JvmStatic
    @Nullable
    public static final android.graphics.Path parsePath(@Nullable String str) {
        return INSTANCE.parsePath(str);
    }

    @JvmStatic
    public static final void registerExternalFileResolver(@Nullable SVGExternalFileResolver sVGExternalFileResolver) {
        INSTANCE.registerExternalFileResolver(sVGExternalFileResolver);
    }

    public static /* synthetic */ void renderToCanvas$default(SVG svg, Canvas canvas, RenderOptions renderOptions, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            renderOptions = null;
        }
        svg.renderToCanvas(canvas, renderOptions);
    }

    public static /* synthetic */ Picture renderToPicture$default(SVG svg, RenderOptions renderOptions, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            renderOptions = null;
        }
        return svg.renderToPicture(renderOptions);
    }

    public static final void setInternalEntitiesEnabled(boolean z10) {
        INSTANCE.setInternalEntitiesEnabled(z10);
    }

    public final Box a(float f6) {
        float width;
        Svg svg = this.rootElement;
        Intrinsics.checkNotNull(svg);
        Length width2 = svg.getWidth();
        Svg svg2 = this.rootElement;
        Intrinsics.checkNotNull(svg2);
        Length height = svg2.getHeight();
        if (width2 != null && !width2.isZero()) {
            Unit unit = width2.getUnit();
            Unit unit2 = Unit.percent;
            if (unit != unit2) {
                Unit unit3 = width2.getUnit();
                Unit unit4 = Unit.f51322em;
                if (unit3 != unit4) {
                    Unit unit5 = width2.getUnit();
                    Unit unit6 = Unit.ex;
                    if (unit5 != unit6) {
                        float fFloatValue = width2.floatValue(f6);
                        if (height == null) {
                            Svg svg3 = this.rootElement;
                            Intrinsics.checkNotNull(svg3);
                            if (svg3.getViewBox() != null) {
                                Svg svg4 = this.rootElement;
                                Intrinsics.checkNotNull(svg4);
                                Box viewBox = svg4.getViewBox();
                                Intrinsics.checkNotNull(viewBox);
                                float height2 = viewBox.getHeight() * fFloatValue;
                                Svg svg5 = this.rootElement;
                                Intrinsics.checkNotNull(svg5);
                                Box viewBox2 = svg5.getViewBox();
                                Intrinsics.checkNotNull(viewBox2);
                                width = height2 / viewBox2.getWidth();
                            } else {
                                width = fFloatValue;
                            }
                        } else {
                            if (height.isZero() || height.getUnit() == unit2 || height.getUnit() == unit4 || height.getUnit() == unit6) {
                                return new Box(-1.0f, -1.0f, -1.0f, -1.0f);
                            }
                            width = height.floatValue(f6);
                        }
                        return new Box(0.0f, 0.0f, fFloatValue, width);
                    }
                }
            }
        }
        return new Box(-1.0f, -1.0f, -1.0f, -1.0f);
    }

    public final void addCSSRules(@Nullable CSSParser.Ruleset ruleset) {
        this.f51184e.addAll(ruleset);
    }

    public final void clearRenderCSSRules() {
        this.f51184e.removeFromSource(CSSParser.Source.RenderOptions);
    }

    @Nullable
    public final List<CSSParser.Rule> getCSSRules() {
        return this.f51184e.getRules();
    }

    public final float getDocumentAspectRatio() {
        Svg svg = this.rootElement;
        if (svg == null) {
            throw new IllegalArgumentException("SVG document is empty".toString());
        }
        Intrinsics.checkNotNull(svg);
        Length width = svg.getWidth();
        Svg svg2 = this.rootElement;
        Intrinsics.checkNotNull(svg2);
        Length height = svg2.getHeight();
        if (width != null && height != null) {
            Unit unit = width.getUnit();
            Unit unit2 = Unit.percent;
            if (unit != unit2 && height.getUnit() != unit2) {
                if (width.isZero() || height.isZero()) {
                    return -1.0f;
                }
                return width.floatValue(this.renderDPI) / height.floatValue(this.renderDPI);
            }
        }
        Svg svg3 = this.rootElement;
        Intrinsics.checkNotNull(svg3);
        if (svg3.getViewBox() == null) {
            return -1.0f;
        }
        Svg svg4 = this.rootElement;
        Intrinsics.checkNotNull(svg4);
        Box viewBox = svg4.getViewBox();
        Intrinsics.checkNotNull(viewBox);
        if (viewBox.getWidth() == 0.0f) {
            return -1.0f;
        }
        Svg svg5 = this.rootElement;
        Intrinsics.checkNotNull(svg5);
        Box viewBox2 = svg5.getViewBox();
        Intrinsics.checkNotNull(viewBox2);
        if (viewBox2.getHeight() == 0.0f) {
            return -1.0f;
        }
        Svg svg6 = this.rootElement;
        Intrinsics.checkNotNull(svg6);
        Box viewBox3 = svg6.getViewBox();
        Intrinsics.checkNotNull(viewBox3);
        float width2 = viewBox3.getWidth();
        Svg svg7 = this.rootElement;
        Intrinsics.checkNotNull(svg7);
        Box viewBox4 = svg7.getViewBox();
        Intrinsics.checkNotNull(viewBox4);
        return width2 / viewBox4.getHeight();
    }

    @NotNull
    public final String getDocumentDescription() {
        if (this.rootElement != null) {
            return this.f51182c;
        }
        throw new IllegalArgumentException("SVG document is empty".toString());
    }

    public final float getDocumentHeight() {
        if (this.rootElement != null) {
            return a(this.renderDPI).getHeight();
        }
        throw new IllegalArgumentException("SVG document is empty".toString());
    }

    @Nullable
    public final PreserveAspectRatio getDocumentPreserveAspectRatio() {
        Svg svg = this.rootElement;
        if (svg == null) {
            throw new IllegalArgumentException("SVG document is empty".toString());
        }
        Intrinsics.checkNotNull(svg);
        if (svg.getPreserveAspectRatio() == null) {
            return null;
        }
        Svg svg2 = this.rootElement;
        Intrinsics.checkNotNull(svg2);
        return svg2.getPreserveAspectRatio();
    }

    @Nullable
    public final String getDocumentSVGVersion() {
        Svg svg = this.rootElement;
        if (svg == null) {
            throw new IllegalArgumentException("SVG document is empty".toString());
        }
        Intrinsics.checkNotNull(svg);
        return svg.getVersion();
    }

    @NotNull
    public final String getDocumentTitle() {
        if (this.rootElement != null) {
            return this.f51181b;
        }
        throw new IllegalArgumentException("SVG document is empty".toString());
    }

    @Nullable
    public final RectF getDocumentViewBox() {
        Svg svg = this.rootElement;
        if (svg == null) {
            throw new IllegalArgumentException("SVG document is empty".toString());
        }
        Intrinsics.checkNotNull(svg);
        if (svg.getViewBox() == null) {
            return null;
        }
        Svg svg2 = this.rootElement;
        Intrinsics.checkNotNull(svg2);
        Box viewBox = svg2.getViewBox();
        Intrinsics.checkNotNull(viewBox);
        return viewBox.toRectF();
    }

    public final float getDocumentWidth() {
        if (this.rootElement != null) {
            return a(this.renderDPI).getWidth();
        }
        throw new IllegalArgumentException("SVG document is empty".toString());
    }

    @Nullable
    public final SvgElementBase getElementById(@Nullable String id) {
        if (id == null || id.length() == 0) {
            return null;
        }
        Svg svg = this.rootElement;
        Intrinsics.checkNotNull(svg);
        if (Intrinsics.areEqual(id, svg.getId())) {
            return this.rootElement;
        }
        HashMap map = this.f51185f;
        if (map.containsKey(id)) {
            return (SvgElementBase) map.get(id);
        }
        SvgElementBase svgElementBaseB = b(this.rootElement, id);
        map.put(id, svgElementBaseB);
        return svgElementBaseB;
    }

    public final float getRenderDPI() {
        return this.renderDPI;
    }

    @Nullable
    public final Svg getRootElement() {
        return this.rootElement;
    }

    @NotNull
    public final Set<String> getViewList() {
        if (this.rootElement == null) {
            throw new IllegalArgumentException("SVG document is empty".toString());
        }
        ArrayList arrayList = new ArrayList();
        c(arrayList, this.rootElement);
        HashSet hashSet = new HashSet(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) ((SvgObject) it.next());
            Intrinsics.checkNotNull(view);
            if (view.getId() != null) {
                String id = view.getId();
                Intrinsics.checkNotNull(id);
                hashSet.add(id);
            } else {
                Log.w("AndroidSVG", "getViewList(): found a <view> without an id attribute");
            }
        }
        return hashSet;
    }

    public final boolean hasCSSRules() {
        return !this.f51184e.isEmpty();
    }

    @JvmOverloads
    public final void renderToCanvas(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        renderToCanvas$default(this, canvas, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final Picture renderToPicture() {
        return renderToPicture$default(this, null, 1, null);
    }

    public final void renderViewToCanvas(@Nullable String viewId, @NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        renderToCanvas(canvas, RenderOptions.INSTANCE.create().view(viewId));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Picture renderViewToPicture(@Nullable String viewId, int widthInPixels, int heightInPixels) {
        RenderOptions renderOptions = new RenderOptions(null, 1, 0 == true ? 1 : 0);
        renderOptions.view(viewId).viewPort(0.0f, 0.0f, widthInPixels, heightInPixels);
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(widthInPixels, heightInPixels);
        Intrinsics.checkNotNullExpressionValue(canvasBeginRecording, "picture.beginRecording(w…InPixels, heightInPixels)");
        new SVGAndroidRenderer(canvasBeginRecording, this.renderDPI).renderDocument(this, renderOptions);
        picture.endRecording();
        return picture;
    }

    @Nullable
    public final SvgObject resolveIRI(@Nullable String iri) {
        String strReplace$default = iri;
        if (strReplace$default == null) {
            return null;
        }
        if (l.startsWith$default(strReplace$default, "\"", false, 2, null) && l.endsWith$default(strReplace$default, "\"", false, 2, null)) {
            String strSubstring = strReplace$default.substring(1, iri.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            strReplace$default = l.replace$default(strSubstring, "\\\"", "\"", false, 4, (Object) null);
        } else if (l.startsWith$default(strReplace$default, "'", false, 2, null) && l.endsWith$default(strReplace$default, "'", false, 2, null)) {
            String strSubstring2 = strReplace$default.substring(1, iri.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            strReplace$default = l.replace$default(strSubstring2, "\\'", "'", false, 4, (Object) null);
        }
        String strReplace$default2 = l.replace$default(l.replace$default(strReplace$default, "\\\n", "", false, 4, (Object) null), RootService.DELIMITER_A, RootService.LINE_BREAK, false, 4, (Object) null);
        if (strReplace$default2.length() <= 1 || !l.startsWith$default(strReplace$default2, "#", false, 2, null)) {
            return null;
        }
        String strSubstring3 = strReplace$default2.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
        return getElementById(strSubstring3);
    }

    public final void setDesc(@NotNull String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.f51182c = desc;
    }

    public final void setDocumentHeight(float f6) {
        Svg svg = this.rootElement;
        if (svg == null) {
            throw new IllegalArgumentException("SVG document is empty".toString());
        }
        Intrinsics.checkNotNull(svg);
        svg.setHeight(new Length(f6));
    }

    public final void setDocumentPreserveAspectRatio(@Nullable PreserveAspectRatio preserveAspectRatio) {
        Svg svg = this.rootElement;
        if (svg == null) {
            throw new IllegalArgumentException("SVG document is empty".toString());
        }
        Intrinsics.checkNotNull(svg);
        svg.setPreserveAspectRatio(preserveAspectRatio);
    }

    public final void setDocumentViewBox(float minX, float minY, float width, float height) {
        Svg svg = this.rootElement;
        if (svg == null) {
            throw new IllegalArgumentException("SVG document is empty".toString());
        }
        Intrinsics.checkNotNull(svg);
        svg.setViewBox(new Box(minX, minY, width, height));
    }

    public final void setDocumentWidth(float f6) {
        Svg svg = this.rootElement;
        if (svg == null) {
            throw new IllegalArgumentException("SVG document is empty".toString());
        }
        Intrinsics.checkNotNull(svg);
        svg.setWidth(new Length(f6));
    }

    public final void setRenderDPI(float f6) {
        this.renderDPI = f6;
    }

    public final void setRootElement(@Nullable Svg svg) {
        this.rootElement = svg;
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f51181b = title;
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0012\u0010!\u001a\u0004\u0018\u00010\u00122\u0006\u0010\"\u001a\u00020\u0016H\u0007J\u0014\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010\u0016H\u0007J\u0012\u0010&\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007R*\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\t\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006("}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Companion;", "", "()V", "<set-?>", "Lcom/mastercard/sonic/androidsvg/SVGExternalFileResolver;", "externalFileResolver", "getExternalFileResolver$annotations", "getExternalFileResolver", "()Lcom/mastercard/sonic/androidsvg/SVGExternalFileResolver;", "isInternalEntitiesEnabled", "", "isInternalEntitiesEnabled$annotations", "()Z", "setInternalEntitiesEnabled", "(Z)V", "deregisterExternalFileResolver", "", "getFromAsset", "Lcom/mastercard/sonic/androidsvg/SVG;", "assetManager", "Landroid/content/res/AssetManager;", "filename", "", "getFromInputStream", "is", "Ljava/io/InputStream;", "getFromResource", "context", "Landroid/content/Context;", "resourceId", "", "resources", "Landroid/content/res/Resources;", "getFromString", "svg", "parsePath", "Landroid/graphics/Path;", "pathDefinition", "registerExternalFileResolver", "fileResolver", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void deregisterExternalFileResolver() {
            SVG.f51178g = null;
        }

        @Nullable
        public final SVGExternalFileResolver getExternalFileResolver() {
            return SVG.f51178g;
        }

        @JvmStatic
        @Nullable
        public final SVG getFromAsset(@NotNull AssetManager assetManager, @Nullable String filename) throws SVGParseException, IOException {
            Intrinsics.checkNotNullParameter(assetManager, "assetManager");
            SVGParser sVGParser = new SVGParser();
            Intrinsics.checkNotNull(filename);
            InputStream inputStreamOpen = assetManager.open(filename);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "assetManager.open(filename!!)");
            try {
                return sVGParser.parse(inputStreamOpen, isInternalEntitiesEnabled());
            } finally {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused) {
                }
            }
        }

        @JvmStatic
        @Nullable
        public final SVG getFromInputStream(@NotNull InputStream is) throws SVGParseException {
            Intrinsics.checkNotNullParameter(is, "is");
            return new SVGParser().parse(is, isInternalEntitiesEnabled());
        }

        @JvmStatic
        @Nullable
        public final SVG getFromResource(@NotNull Context context, int resourceId) throws SVGParseException {
            Intrinsics.checkNotNullParameter(context, "context");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
            return getFromResource(resources, resourceId);
        }

        @JvmStatic
        @Nullable
        public final SVG getFromString(@NotNull String svg) throws SVGParseException {
            Intrinsics.checkNotNullParameter(svg, "svg");
            SVGParser sVGParser = new SVGParser();
            byte[] bytes = svg.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return sVGParser.parse(new ByteArrayInputStream(bytes), isInternalEntitiesEnabled());
        }

        public final boolean isInternalEntitiesEnabled() {
            return SVG.f51179h;
        }

        @JvmStatic
        @Nullable
        public final android.graphics.Path parsePath(@Nullable String pathDefinition) {
            return new SVGAndroidRenderer.PathConverter(SVGParser.INSTANCE.parsePath(pathDefinition)).getPath();
        }

        @JvmStatic
        public final void registerExternalFileResolver(@Nullable SVGExternalFileResolver fileResolver) {
            SVG.f51178g = fileResolver;
        }

        public final void setInternalEntitiesEnabled(boolean z10) {
            SVG.f51179h = z10;
        }

        @JvmStatic
        @Nullable
        public final SVG getFromResource(@NotNull Resources resources, int resourceId) throws SVGParseException {
            Intrinsics.checkNotNullParameter(resources, "resources");
            SVGParser sVGParser = new SVGParser();
            InputStream inputStreamOpenRawResource = resources.openRawResource(resourceId);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "resources.openRawResource(resourceId)");
            try {
                return sVGParser.parse(inputStreamOpenRawResource, isInternalEntitiesEnabled());
            } finally {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused) {
                }
            }
        }

        @JvmStatic
        public static /* synthetic */ void getExternalFileResolver$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void isInternalEntitiesEnabled$annotations() {
        }
    }

    @JvmStatic
    @Nullable
    public static final SVG getFromResource(@NotNull Resources resources, int i10) throws SVGParseException {
        return INSTANCE.getFromResource(resources, i10);
    }

    public static /* synthetic */ Picture renderToPicture$default(SVG svg, int i10, int i11, RenderOptions renderOptions, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            renderOptions = null;
        }
        return svg.renderToPicture(i10, i11, renderOptions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void renderToCanvas(@NotNull Canvas canvas, @Nullable RectF viewPort) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        RenderOptions renderOptions = new RenderOptions(null, 1, 0 == true ? 1 : 0);
        if (viewPort != null) {
            renderOptions.viewPort(viewPort.left, viewPort.top, viewPort.width(), viewPort.height());
        } else {
            renderOptions.viewPort(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new SVGAndroidRenderer(canvas, this.renderDPI).renderDocument(this, renderOptions);
    }

    @JvmOverloads
    @NotNull
    public final Picture renderToPicture(int i10, int i11) {
        return renderToPicture$default(this, i10, i11, null, 4, null);
    }

    @JvmOverloads
    @NotNull
    public final Picture renderToPicture(@Nullable RenderOptions renderOptions) {
        Box viewBox;
        if (renderOptions == null || !renderOptions.hasViewBox()) {
            Svg svg = this.rootElement;
            Intrinsics.checkNotNull(svg);
            viewBox = svg.getViewBox();
        } else {
            viewBox = renderOptions.getViewBox();
        }
        if (renderOptions != null && renderOptions.hasViewPort()) {
            Box viewPort = renderOptions.getViewPort();
            Intrinsics.checkNotNull(viewPort);
            float fMaxX = viewPort.maxX();
            Box viewPort2 = renderOptions.getViewPort();
            Intrinsics.checkNotNull(viewPort2);
            return renderToPicture((int) Math.ceil(fMaxX), (int) Math.ceil(viewPort2.maxY()), renderOptions);
        }
        Svg svg2 = this.rootElement;
        Intrinsics.checkNotNull(svg2);
        if (svg2.getWidth() != null) {
            Svg svg3 = this.rootElement;
            Intrinsics.checkNotNull(svg3);
            Length width = svg3.getWidth();
            Intrinsics.checkNotNull(width);
            Unit unit = width.getUnit();
            Unit unit2 = Unit.percent;
            if (unit != unit2) {
                Svg svg4 = this.rootElement;
                Intrinsics.checkNotNull(svg4);
                if (svg4.getHeight() != null) {
                    Svg svg5 = this.rootElement;
                    Intrinsics.checkNotNull(svg5);
                    Length height = svg5.getHeight();
                    Intrinsics.checkNotNull(height);
                    if (height.getUnit() != unit2) {
                        Svg svg6 = this.rootElement;
                        Intrinsics.checkNotNull(svg6);
                        Length width2 = svg6.getWidth();
                        Intrinsics.checkNotNull(width2);
                        float fFloatValue = width2.floatValue(this.renderDPI);
                        Svg svg7 = this.rootElement;
                        Intrinsics.checkNotNull(svg7);
                        Length height2 = svg7.getHeight();
                        Intrinsics.checkNotNull(height2);
                        return renderToPicture((int) Math.ceil(fFloatValue), (int) Math.ceil(height2.floatValue(this.renderDPI)), renderOptions);
                    }
                }
            }
        }
        Svg svg8 = this.rootElement;
        Intrinsics.checkNotNull(svg8);
        if (svg8.getWidth() != null && viewBox != null) {
            Svg svg9 = this.rootElement;
            Intrinsics.checkNotNull(svg9);
            Length width3 = svg9.getWidth();
            Intrinsics.checkNotNull(width3);
            float fFloatValue2 = width3.floatValue(this.renderDPI);
            return renderToPicture((int) Math.ceil(fFloatValue2), (int) Math.ceil((viewBox.getHeight() * fFloatValue2) / viewBox.getWidth()), renderOptions);
        }
        Svg svg10 = this.rootElement;
        Intrinsics.checkNotNull(svg10);
        if (svg10.getHeight() != null && viewBox != null) {
            Svg svg11 = this.rootElement;
            Intrinsics.checkNotNull(svg11);
            Length height3 = svg11.getHeight();
            Intrinsics.checkNotNull(height3);
            float fFloatValue3 = height3.floatValue(this.renderDPI);
            return renderToPicture((int) Math.ceil((viewBox.getWidth() * fFloatValue3) / viewBox.getHeight()), (int) Math.ceil(fFloatValue3), renderOptions);
        }
        return renderToPicture(512, 512, renderOptions);
    }

    public final void renderViewToCanvas(@Nullable String viewId, @NotNull Canvas canvas, @Nullable RectF viewPort) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        RenderOptions renderOptionsView = RenderOptions.INSTANCE.create().view(viewId);
        if (viewPort != null) {
            renderOptionsView.viewPort(viewPort.left, viewPort.top, viewPort.width(), viewPort.height());
        }
        renderToCanvas(canvas, renderOptionsView);
    }

    public final void setDocumentHeight(@Nullable String value) throws SVGParseException {
        Svg svg = this.rootElement;
        if (svg != null) {
            Intrinsics.checkNotNull(svg);
            svg.setHeight(SVGParser.INSTANCE.parseLength(value));
            return;
        }
        throw new IllegalArgumentException("SVG document is empty".toString());
    }

    public final void setDocumentWidth(@Nullable String value) throws SVGParseException {
        Svg svg = this.rootElement;
        if (svg != null) {
            Intrinsics.checkNotNull(svg);
            svg.setWidth(SVGParser.INSTANCE.parseLength(value));
            return;
        }
        throw new IllegalArgumentException("SVG document is empty".toString());
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B)\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 B\u0013\b\u0016\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u001f\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0000J\b\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\"\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011¨\u0006$"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Box;", "", "Landroid/graphics/RectF;", "toRectF", "", "maxX", "maxY", "other", "", "union", "", "toString", "a", "F", "getMinX", "()F", "setMinX", "(F)V", "minX", "b", "getMinY", "setMinY", "minY", "c", "getWidth", "setWidth", "width", "d", "getHeight", "setHeight", "height", "<init>", "(FFFF)V", "copy", "(Lcom/mastercard/sonic/androidsvg/SVG$Box;)V", "Companion", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Box {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public float minX;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public float minY;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public float width;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public float height;

        /* JADX INFO: compiled from: SVG.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0007¨\u0006\n"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Box$Companion;", "", "()V", "fromLimits", "Lcom/mastercard/sonic/androidsvg/SVG$Box;", "minX", "", "minY", "maxX", "maxY", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final Box fromLimits(float minX, float minY, float maxX, float maxY) {
                return new Box(minX, minY, maxX - minX, maxY - minY);
            }
        }

        public Box(float f6, float f10, float f11, float f12) {
            this.minX = f6;
            this.minY = f10;
            this.width = f11;
            this.height = f12;
        }

        @JvmStatic
        @NotNull
        public static final Box fromLimits(float f6, float f10, float f11, float f12) {
            return INSTANCE.fromLimits(f6, f10, f11, f12);
        }

        public final float getHeight() {
            return this.height;
        }

        public final float getMinX() {
            return this.minX;
        }

        public final float getMinY() {
            return this.minY;
        }

        public final float getWidth() {
            return this.width;
        }

        public final float maxX() {
            return this.minX + this.width;
        }

        public final float maxY() {
            return this.minY + this.height;
        }

        public final void setHeight(float f6) {
            this.height = f6;
        }

        public final void setMinX(float f6) {
            this.minX = f6;
        }

        public final void setMinY(float f6) {
            this.minY = f6;
        }

        public final void setWidth(float f6) {
            this.width = f6;
        }

        @NotNull
        public final RectF toRectF() {
            return new RectF(this.minX, this.minY, maxX(), maxY());
        }

        @NotNull
        public String toString() {
            return Constant.BRACKET_OPEN + this.minX + " " + this.minY + " " + this.width + " " + this.height + Constant.BRACKET_CLOSE;
        }

        public final void union(@NotNull Box other) {
            Intrinsics.checkNotNullParameter(other, "other");
            float f6 = other.minX;
            if (f6 < this.minX) {
                this.minX = f6;
            }
            float f10 = other.minY;
            if (f10 < this.minY) {
                this.minY = f10;
            }
            if (other.maxX() > maxX()) {
                this.width = other.maxX() - this.minX;
            }
            if (other.maxY() > maxY()) {
                this.height = other.maxY() - this.minY;
            }
        }

        public Box(@Nullable Box box) {
            Intrinsics.checkNotNull(box);
            this.minX = box.minX;
            this.minY = box.minY;
            this.width = box.width;
            this.height = box.height;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public final void renderToCanvas(@NotNull Canvas canvas, @Nullable RenderOptions renderOptions) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (renderOptions == null) {
            renderOptions = new RenderOptions(null, 1, 0 == true ? 1 : 0);
        }
        if (!renderOptions.hasViewPort()) {
            renderOptions.viewPort(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new SVGAndroidRenderer(canvas, this.renderDPI).renderDocument(this, renderOptions);
    }

    /* JADX INFO: compiled from: SVG.kt */
    @Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 õ\u00012\u00020\u0001:\u0014õ\u0001ö\u0001÷\u0001ø\u0001ù\u0001ú\u0001û\u0001ü\u0001ý\u0001þ\u0001B\t¢\u0006\u0006\bó\u0001\u0010ô\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010+\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0012\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R$\u0010/\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010?\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010G\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010K\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\"\u001a\u0004\bI\u0010$\"\u0004\bJ\u0010&R,\u0010S\u001a\f\u0012\u0006\u0012\u0004\u0018\u000100\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010W\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u00102\u001a\u0004\bU\u00104\"\u0004\bV\u00106R$\u0010[\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010\"\u001a\u0004\bY\u0010$\"\u0004\bZ\u0010&R$\u0010c\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR*\u0010l\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010p\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u00102\u001a\u0004\bn\u00104\"\u0004\bo\u00106R$\u0010x\u001a\u0004\u0018\u00010q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR%\u0010\u0080\u0001\u001a\u0004\u0018\u00010y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR,\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R,\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R,\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R+\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R,\u0010§\u0001\u001a\u0005\u0018\u00010 \u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R+\u0010®\u0001\u001a\u0004\u0018\u00010e8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R+\u0010²\u0001\u001a\u0004\u0018\u00010e8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¯\u0001\u0010©\u0001\u001a\u0006\b°\u0001\u0010«\u0001\"\u0006\b±\u0001\u0010\u00ad\u0001R+\u0010¶\u0001\u001a\u0004\u0018\u00010e8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010©\u0001\u001a\u0006\b´\u0001\u0010«\u0001\"\u0006\bµ\u0001\u0010\u00ad\u0001R+\u0010º\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010\u009a\u0001\u001a\u0006\b¸\u0001\u0010\u009c\u0001\"\u0006\b¹\u0001\u0010\u009e\u0001R+\u0010¾\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b»\u0001\u0010\u009a\u0001\u001a\u0006\b¼\u0001\u0010\u009c\u0001\"\u0006\b½\u0001\u0010\u009e\u0001R(\u0010Â\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¿\u0001\u0010\u0012\u001a\u0005\bÀ\u0001\u0010\u0014\"\u0005\bÁ\u0001\u0010\u0016R(\u0010Æ\u0001\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÃ\u0001\u0010\"\u001a\u0005\bÄ\u0001\u0010$\"\u0005\bÅ\u0001\u0010&R+\u0010Ê\u0001\u001a\u0004\u0018\u00010e8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÇ\u0001\u0010©\u0001\u001a\u0006\bÈ\u0001\u0010«\u0001\"\u0006\bÉ\u0001\u0010\u00ad\u0001R(\u0010Î\u0001\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bË\u0001\u0010\u001a\u001a\u0005\bÌ\u0001\u0010\u001c\"\u0005\bÍ\u0001\u0010\u001eR+\u0010Ò\u0001\u001a\u0004\u0018\u00010e8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÏ\u0001\u0010©\u0001\u001a\u0006\bÐ\u0001\u0010«\u0001\"\u0006\bÑ\u0001\u0010\u00ad\u0001R(\u0010Ö\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÓ\u0001\u0010\u0012\u001a\u0005\bÔ\u0001\u0010\u0014\"\u0005\bÕ\u0001\u0010\u0016R(\u0010Ú\u0001\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b×\u0001\u0010\"\u001a\u0005\bØ\u0001\u0010$\"\u0005\bÙ\u0001\u0010&R(\u0010Þ\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÛ\u0001\u0010\u0012\u001a\u0005\bÜ\u0001\u0010\u0014\"\u0005\bÝ\u0001\u0010\u0016R(\u0010â\u0001\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bß\u0001\u0010\"\u001a\u0005\bà\u0001\u0010$\"\u0005\bá\u0001\u0010&R,\u0010ê\u0001\u001a\u0005\u0018\u00010ã\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bä\u0001\u0010å\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001\"\u0006\bè\u0001\u0010é\u0001R,\u0010ò\u0001\u001a\u0005\u0018\u00010ë\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bì\u0001\u0010í\u0001\u001a\u0006\bî\u0001\u0010ï\u0001\"\u0006\bð\u0001\u0010ñ\u0001¨\u0006ÿ\u0001"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Style;", "", "", "isRootSVG", "", "resetNonInheritingProperties", "", "clone", "", "p0", "J", "getSpecifiedFlags", "()J", "setSpecifiedFlags", "(J)V", "specifiedFlags", "Lcom/mastercard/sonic/androidsvg/SVG$SvgPaint;", "q0", "Lcom/mastercard/sonic/androidsvg/SVG$SvgPaint;", "getFill", "()Lcom/mastercard/sonic/androidsvg/SVG$SvgPaint;", "setFill", "(Lcom/mastercard/sonic/androidsvg/SVG$SvgPaint;)V", "fill", "Lcom/mastercard/sonic/androidsvg/SVG$Style$FillRule;", "r0", "Lcom/mastercard/sonic/androidsvg/SVG$Style$FillRule;", "getFillRule", "()Lcom/mastercard/sonic/androidsvg/SVG$Style$FillRule;", "setFillRule", "(Lcom/mastercard/sonic/androidsvg/SVG$Style$FillRule;)V", "fillRule", "", "s0", "Ljava/lang/Float;", "getFillOpacity", "()Ljava/lang/Float;", "setFillOpacity", "(Ljava/lang/Float;)V", "fillOpacity", "t0", "getStroke", "setStroke", "stroke", "u0", "getStrokeOpacity", "setStrokeOpacity", "strokeOpacity", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "v0", "Lcom/mastercard/sonic/androidsvg/SVG$Length;", "getStrokeWidth", "()Lcom/mastercard/sonic/androidsvg/SVG$Length;", "setStrokeWidth", "(Lcom/mastercard/sonic/androidsvg/SVG$Length;)V", "strokeWidth", "Lcom/mastercard/sonic/androidsvg/SVG$Style$LineCap;", "w0", "Lcom/mastercard/sonic/androidsvg/SVG$Style$LineCap;", "getStrokeLineCap", "()Lcom/mastercard/sonic/androidsvg/SVG$Style$LineCap;", "setStrokeLineCap", "(Lcom/mastercard/sonic/androidsvg/SVG$Style$LineCap;)V", "strokeLineCap", "Lcom/mastercard/sonic/androidsvg/SVG$Style$LineJoin;", "x0", "Lcom/mastercard/sonic/androidsvg/SVG$Style$LineJoin;", "getStrokeLineJoin", "()Lcom/mastercard/sonic/androidsvg/SVG$Style$LineJoin;", "setStrokeLineJoin", "(Lcom/mastercard/sonic/androidsvg/SVG$Style$LineJoin;)V", "strokeLineJoin", "y0", "getStrokeMiterLimit", "setStrokeMiterLimit", "strokeMiterLimit", "", "E0", "[Lcom/mastercard/sonic/androidsvg/SVG$Length;", "getStrokeDashArray", "()[Lcom/mastercard/sonic/androidsvg/SVG$Length;", "setStrokeDashArray", "([Lcom/mastercard/sonic/androidsvg/SVG$Length;)V", "strokeDashArray", "F0", "getStrokeDashOffset", "setStrokeDashOffset", "strokeDashOffset", "G0", "getOpacity", "setOpacity", "opacity", "Lcom/mastercard/sonic/androidsvg/SVG$Colour;", "H0", "Lcom/mastercard/sonic/androidsvg/SVG$Colour;", "getColor", "()Lcom/mastercard/sonic/androidsvg/SVG$Colour;", "setColor", "(Lcom/mastercard/sonic/androidsvg/SVG$Colour;)V", "color", "", "", "I0", "Ljava/util/List;", "getFontFamily", "()Ljava/util/List;", "setFontFamily", "(Ljava/util/List;)V", "fontFamily", "J0", "getFontSize", "setFontSize", "fontSize", "", "K0", "Ljava/lang/Integer;", "getFontWeight", "()Ljava/lang/Integer;", "setFontWeight", "(Ljava/lang/Integer;)V", "fontWeight", "Lcom/mastercard/sonic/androidsvg/SVG$Style$FontStyle;", "L0", "Lcom/mastercard/sonic/androidsvg/SVG$Style$FontStyle;", "getFontStyle", "()Lcom/mastercard/sonic/androidsvg/SVG$Style$FontStyle;", "setFontStyle", "(Lcom/mastercard/sonic/androidsvg/SVG$Style$FontStyle;)V", "fontStyle", "Lcom/mastercard/sonic/androidsvg/SVG$Style$TextDecoration;", "M0", "Lcom/mastercard/sonic/androidsvg/SVG$Style$TextDecoration;", "getTextDecoration", "()Lcom/mastercard/sonic/androidsvg/SVG$Style$TextDecoration;", "setTextDecoration", "(Lcom/mastercard/sonic/androidsvg/SVG$Style$TextDecoration;)V", "textDecoration", "Lcom/mastercard/sonic/androidsvg/SVG$Style$TextDirection;", "N0", "Lcom/mastercard/sonic/androidsvg/SVG$Style$TextDirection;", "getDirection", "()Lcom/mastercard/sonic/androidsvg/SVG$Style$TextDirection;", "setDirection", "(Lcom/mastercard/sonic/androidsvg/SVG$Style$TextDirection;)V", "direction", "Lcom/mastercard/sonic/androidsvg/SVG$Style$TextAnchor;", "O0", "Lcom/mastercard/sonic/androidsvg/SVG$Style$TextAnchor;", "getTextAnchor", "()Lcom/mastercard/sonic/androidsvg/SVG$Style$TextAnchor;", "setTextAnchor", "(Lcom/mastercard/sonic/androidsvg/SVG$Style$TextAnchor;)V", "textAnchor", "P0", "Ljava/lang/Boolean;", "getOverflow", "()Ljava/lang/Boolean;", "setOverflow", "(Ljava/lang/Boolean;)V", "overflow", "Lcom/mastercard/sonic/androidsvg/SVG$CSSClipRect;", "Q0", "Lcom/mastercard/sonic/androidsvg/SVG$CSSClipRect;", "getClip", "()Lcom/mastercard/sonic/androidsvg/SVG$CSSClipRect;", "setClip", "(Lcom/mastercard/sonic/androidsvg/SVG$CSSClipRect;)V", "clip", "R0", "Ljava/lang/String;", "getMarkerStart", "()Ljava/lang/String;", "setMarkerStart", "(Ljava/lang/String;)V", "markerStart", "S0", "getMarkerMid", "setMarkerMid", "markerMid", "T0", "getMarkerEnd", "setMarkerEnd", "markerEnd", "U0", "getDisplay", "setDisplay", "display", "V0", "getVisibility", "setVisibility", "visibility", "W0", "getStopColor", "setStopColor", "stopColor", "X0", "getStopOpacity", "setStopOpacity", "stopOpacity", "Y0", "getClipPath", "setClipPath", "clipPath", "Z0", "getClipRule", "setClipRule", "clipRule", "a1", "getMask", "setMask", "mask", "b1", "getSolidColor", "setSolidColor", "solidColor", "c1", "getSolidOpacity", "setSolidOpacity", "solidOpacity", "d1", "getViewportFill", "setViewportFill", "viewportFill", "e1", "getViewportFillOpacity", "setViewportFillOpacity", "viewportFillOpacity", "Lcom/mastercard/sonic/androidsvg/SVG$Style$VectorEffect;", "f1", "Lcom/mastercard/sonic/androidsvg/SVG$Style$VectorEffect;", "getVectorEffect", "()Lcom/mastercard/sonic/androidsvg/SVG$Style$VectorEffect;", "setVectorEffect", "(Lcom/mastercard/sonic/androidsvg/SVG$Style$VectorEffect;)V", "vectorEffect", "Lcom/mastercard/sonic/androidsvg/SVG$Style$RenderQuality;", "g1", "Lcom/mastercard/sonic/androidsvg/SVG$Style$RenderQuality;", "getImageRendering", "()Lcom/mastercard/sonic/androidsvg/SVG$Style$RenderQuality;", "setImageRendering", "(Lcom/mastercard/sonic/androidsvg/SVG$Style$RenderQuality;)V", "imageRendering", "<init>", "()V", "Companion", "FillRule", "FontStyle", "LineCap", "LineJoin", "RenderQuality", "TextAnchor", "TextDecoration", "TextDirection", "VectorEffect", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Style implements Cloneable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
        @Nullable
        public Length[] strokeDashArray;

        /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
        @Nullable
        public Length strokeDashOffset;

        /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
        @Nullable
        public Float opacity;

        /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
        @Nullable
        public Colour color;

        /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
        @Nullable
        public List<String> fontFamily;

        /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
        @Nullable
        public Length fontSize;

        /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
        @Nullable
        public Integer fontWeight;

        /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
        @Nullable
        public FontStyle fontStyle;

        /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
        @Nullable
        public TextDecoration textDecoration;

        /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
        @Nullable
        public TextDirection direction;

        /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
        @Nullable
        public TextAnchor textAnchor;

        /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
        @Nullable
        public Boolean overflow;

        /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
        @Nullable
        public CSSClipRect clip;

        /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
        @Nullable
        public String markerStart;

        /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
        @Nullable
        public String markerMid;

        /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
        @Nullable
        public String markerEnd;

        /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
        @Nullable
        public Boolean display;

        /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
        @Nullable
        public Boolean visibility;

        /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
        @Nullable
        public SvgPaint stopColor;

        /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
        @Nullable
        public Float stopOpacity;

        /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
        @Nullable
        public String clipPath;

        /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
        @Nullable
        public FillRule clipRule;

        /* JADX INFO: renamed from: a1, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String mask;

        /* JADX INFO: renamed from: b1, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public SvgPaint solidColor;

        /* JADX INFO: renamed from: c1, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Float solidOpacity;

        /* JADX INFO: renamed from: d1, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public SvgPaint viewportFill;

        /* JADX INFO: renamed from: e1, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Float viewportFillOpacity;

        /* JADX INFO: renamed from: f1, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public VectorEffect vectorEffect;

        /* JADX INFO: renamed from: g1, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public RenderQuality imageRendering;

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public long specifiedFlags;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public SvgPaint fill;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public FillRule fillRule;

        /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Float fillOpacity;

        /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public SvgPaint stroke;

        /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Float strokeOpacity;

        /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
        @Nullable
        public Length strokeWidth;

        /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public LineCap strokeLineCap;

        /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public LineJoin strokeLineJoin;

        /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Float strokeMiterLimit;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: SVG.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Style$FillRule;", "", "NonZero", "EvenOdd", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
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
        /* JADX INFO: compiled from: SVG.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Style$FontStyle;", "", "Normal", "Italic", "Oblique", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
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
        /* JADX INFO: compiled from: SVG.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Style$LineCap;", "", "Butt", "Round", "Square", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
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
        /* JADX INFO: compiled from: SVG.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Style$LineJoin;", "", "Miter", "Round", "Bevel", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
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
        /* JADX INFO: compiled from: SVG.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Style$RenderQuality;", "", DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "optimizeQuality", "optimizeSpeed", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
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
        /* JADX INFO: compiled from: SVG.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Style$TextAnchor;", "", "Start", "Middle", "End", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
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
        /* JADX INFO: compiled from: SVG.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Style$TextDecoration;", "", "None", "Underline", "Overline", "LineThrough", "Blink", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
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
        /* JADX INFO: compiled from: SVG.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Style$TextDirection;", "", "LTR", "RTL", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
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
        /* JADX INFO: compiled from: SVG.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Style$VectorEffect;", "", "None", "NonScalingStroke", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
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

        @NotNull
        public static final Style getDefaultStyle() {
            return INSTANCE.getDefaultStyle();
        }

        @NotNull
        public Object clone() throws CloneNotSupportedException {
            Object objClone = super.clone();
            Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.Style");
            Style style = (Style) objClone;
            Length[] lengthArr = this.strokeDashArray;
            if (lengthArr != null) {
                Intrinsics.checkNotNull(lengthArr);
                style.strokeDashArray = (Length[]) lengthArr.clone();
            }
            return style;
        }

        @Nullable
        public final CSSClipRect getClip() {
            return this.clip;
        }

        @Nullable
        public final String getClipPath() {
            return this.clipPath;
        }

        @Nullable
        public final FillRule getClipRule() {
            return this.clipRule;
        }

        @Nullable
        public final Colour getColor() {
            return this.color;
        }

        @Nullable
        public final TextDirection getDirection() {
            return this.direction;
        }

        @Nullable
        public final Boolean getDisplay() {
            return this.display;
        }

        @Nullable
        public final SvgPaint getFill() {
            return this.fill;
        }

        @Nullable
        public final Float getFillOpacity() {
            return this.fillOpacity;
        }

        @Nullable
        public final FillRule getFillRule() {
            return this.fillRule;
        }

        @Nullable
        public final List<String> getFontFamily() {
            return this.fontFamily;
        }

        @Nullable
        public final Length getFontSize() {
            return this.fontSize;
        }

        @Nullable
        public final FontStyle getFontStyle() {
            return this.fontStyle;
        }

        @Nullable
        public final Integer getFontWeight() {
            return this.fontWeight;
        }

        @Nullable
        public final RenderQuality getImageRendering() {
            return this.imageRendering;
        }

        @Nullable
        public final String getMarkerEnd() {
            return this.markerEnd;
        }

        @Nullable
        public final String getMarkerMid() {
            return this.markerMid;
        }

        @Nullable
        public final String getMarkerStart() {
            return this.markerStart;
        }

        @Nullable
        public final String getMask() {
            return this.mask;
        }

        @Nullable
        public final Float getOpacity() {
            return this.opacity;
        }

        @Nullable
        public final Boolean getOverflow() {
            return this.overflow;
        }

        @Nullable
        public final SvgPaint getSolidColor() {
            return this.solidColor;
        }

        @Nullable
        public final Float getSolidOpacity() {
            return this.solidOpacity;
        }

        public final long getSpecifiedFlags() {
            return this.specifiedFlags;
        }

        @Nullable
        public final SvgPaint getStopColor() {
            return this.stopColor;
        }

        @Nullable
        public final Float getStopOpacity() {
            return this.stopOpacity;
        }

        @Nullable
        public final SvgPaint getStroke() {
            return this.stroke;
        }

        @Nullable
        public final Length[] getStrokeDashArray() {
            return this.strokeDashArray;
        }

        @Nullable
        public final Length getStrokeDashOffset() {
            return this.strokeDashOffset;
        }

        @Nullable
        public final LineCap getStrokeLineCap() {
            return this.strokeLineCap;
        }

        @Nullable
        public final LineJoin getStrokeLineJoin() {
            return this.strokeLineJoin;
        }

        @Nullable
        public final Float getStrokeMiterLimit() {
            return this.strokeMiterLimit;
        }

        @Nullable
        public final Float getStrokeOpacity() {
            return this.strokeOpacity;
        }

        @Nullable
        public final Length getStrokeWidth() {
            return this.strokeWidth;
        }

        @Nullable
        public final TextAnchor getTextAnchor() {
            return this.textAnchor;
        }

        @Nullable
        public final TextDecoration getTextDecoration() {
            return this.textDecoration;
        }

        @Nullable
        public final VectorEffect getVectorEffect() {
            return this.vectorEffect;
        }

        @Nullable
        public final SvgPaint getViewportFill() {
            return this.viewportFill;
        }

        @Nullable
        public final Float getViewportFillOpacity() {
            return this.viewportFillOpacity;
        }

        @Nullable
        public final Boolean getVisibility() {
            return this.visibility;
        }

        public final void resetNonInheritingProperties(boolean isRootSVG) {
            Boolean bool = Boolean.TRUE;
            this.display = bool;
            if (!isRootSVG) {
                bool = Boolean.FALSE;
            }
            this.overflow = bool;
            this.clip = null;
            this.clipPath = null;
            this.opacity = Float.valueOf(1.0f);
            this.stopColor = Colour.INSTANCE.getBLACK();
            this.stopOpacity = Float.valueOf(1.0f);
            this.mask = null;
            this.solidColor = null;
            this.solidOpacity = Float.valueOf(1.0f);
            this.viewportFill = null;
            this.viewportFillOpacity = Float.valueOf(1.0f);
            this.vectorEffect = VectorEffect.None;
        }

        public final void setClip(@Nullable CSSClipRect cSSClipRect) {
            this.clip = cSSClipRect;
        }

        public final void setClipPath(@Nullable String str) {
            this.clipPath = str;
        }

        public final void setClipRule(@Nullable FillRule fillRule) {
            this.clipRule = fillRule;
        }

        public final void setColor(@Nullable Colour colour) {
            this.color = colour;
        }

        public final void setDirection(@Nullable TextDirection textDirection) {
            this.direction = textDirection;
        }

        public final void setDisplay(@Nullable Boolean bool) {
            this.display = bool;
        }

        public final void setFill(@Nullable SvgPaint svgPaint) {
            this.fill = svgPaint;
        }

        public final void setFillOpacity(@Nullable Float f6) {
            this.fillOpacity = f6;
        }

        public final void setFillRule(@Nullable FillRule fillRule) {
            this.fillRule = fillRule;
        }

        public final void setFontFamily(@Nullable List<String> list) {
            this.fontFamily = list;
        }

        public final void setFontSize(@Nullable Length length) {
            this.fontSize = length;
        }

        public final void setFontStyle(@Nullable FontStyle fontStyle) {
            this.fontStyle = fontStyle;
        }

        public final void setFontWeight(@Nullable Integer num) {
            this.fontWeight = num;
        }

        public final void setImageRendering(@Nullable RenderQuality renderQuality) {
            this.imageRendering = renderQuality;
        }

        public final void setMarkerEnd(@Nullable String str) {
            this.markerEnd = str;
        }

        public final void setMarkerMid(@Nullable String str) {
            this.markerMid = str;
        }

        public final void setMarkerStart(@Nullable String str) {
            this.markerStart = str;
        }

        public final void setMask(@Nullable String str) {
            this.mask = str;
        }

        public final void setOpacity(@Nullable Float f6) {
            this.opacity = f6;
        }

        public final void setOverflow(@Nullable Boolean bool) {
            this.overflow = bool;
        }

        public final void setSolidColor(@Nullable SvgPaint svgPaint) {
            this.solidColor = svgPaint;
        }

        public final void setSolidOpacity(@Nullable Float f6) {
            this.solidOpacity = f6;
        }

        public final void setSpecifiedFlags(long j10) {
            this.specifiedFlags = j10;
        }

        public final void setStopColor(@Nullable SvgPaint svgPaint) {
            this.stopColor = svgPaint;
        }

        public final void setStopOpacity(@Nullable Float f6) {
            this.stopOpacity = f6;
        }

        public final void setStroke(@Nullable SvgPaint svgPaint) {
            this.stroke = svgPaint;
        }

        public final void setStrokeDashArray(@Nullable Length[] lengthArr) {
            this.strokeDashArray = lengthArr;
        }

        public final void setStrokeDashOffset(@Nullable Length length) {
            this.strokeDashOffset = length;
        }

        public final void setStrokeLineCap(@Nullable LineCap lineCap) {
            this.strokeLineCap = lineCap;
        }

        public final void setStrokeLineJoin(@Nullable LineJoin lineJoin) {
            this.strokeLineJoin = lineJoin;
        }

        public final void setStrokeMiterLimit(@Nullable Float f6) {
            this.strokeMiterLimit = f6;
        }

        public final void setStrokeOpacity(@Nullable Float f6) {
            this.strokeOpacity = f6;
        }

        public final void setStrokeWidth(@Nullable Length length) {
            this.strokeWidth = length;
        }

        public final void setTextAnchor(@Nullable TextAnchor textAnchor) {
            this.textAnchor = textAnchor;
        }

        public final void setTextDecoration(@Nullable TextDecoration textDecoration) {
            this.textDecoration = textDecoration;
        }

        public final void setVectorEffect(@Nullable VectorEffect vectorEffect) {
            this.vectorEffect = vectorEffect;
        }

        public final void setViewportFill(@Nullable SvgPaint svgPaint) {
            this.viewportFill = svgPaint;
        }

        public final void setViewportFillOpacity(@Nullable Float f6) {
            this.viewportFillOpacity = f6;
        }

        public final void setVisibility(@Nullable Boolean bool) {
            this.visibility = bool;
        }

        /* JADX INFO: compiled from: SVG.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVG$Style$Companion;", "", "()V", "defaultStyle", "Lcom/mastercard/sonic/androidsvg/SVG$Style;", "getDefaultStyle$annotations", "getDefaultStyle", "()Lcom/mastercard/sonic/androidsvg/SVG$Style;", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Style getDefaultStyle() {
                Style style = new Style();
                style.setSpecifiedFlags(-1L);
                Colour.Companion companion = Colour.INSTANCE;
                style.setFill(companion.getBLACK());
                FillRule fillRule = FillRule.NonZero;
                style.setFillRule(fillRule);
                Float fValueOf = Float.valueOf(1.0f);
                style.setFillOpacity(fValueOf);
                style.setStroke(null);
                style.setStrokeOpacity(fValueOf);
                style.setStrokeWidth(new Length(1.0f));
                style.setStrokeLineCap(LineCap.Butt);
                style.setStrokeLineJoin(LineJoin.Miter);
                style.setStrokeMiterLimit(Float.valueOf(4.0f));
                style.setStrokeDashArray(null);
                style.setStrokeDashOffset(new Length(0.0f));
                style.setOpacity(fValueOf);
                style.setColor(companion.getBLACK());
                style.setFontFamily(null);
                style.setFontSize(new Length(12.0f, Unit.pt));
                style.setFontWeight(400);
                style.setFontStyle(FontStyle.Normal);
                style.setTextDecoration(TextDecoration.None);
                style.setDirection(TextDirection.LTR);
                style.setTextAnchor(TextAnchor.Start);
                Boolean bool = Boolean.TRUE;
                style.setOverflow(bool);
                style.setClip(null);
                style.setMarkerStart(null);
                style.setMarkerMid(null);
                style.setMarkerEnd(null);
                style.setDisplay(bool);
                style.setVisibility(bool);
                style.setStopColor(companion.getBLACK());
                style.setStopOpacity(fValueOf);
                style.setClipPath(null);
                style.setClipRule(fillRule);
                style.setMask(null);
                style.setSolidColor(null);
                style.setSolidOpacity(fValueOf);
                style.setViewportFill(null);
                style.setViewportFillOpacity(fValueOf);
                style.setVectorEffect(VectorEffect.None);
                style.setImageRendering(RenderQuality.auto);
                return style;
            }

            @JvmStatic
            public static /* synthetic */ void getDefaultStyle$annotations() {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    @NotNull
    public final Picture renderToPicture(int widthInPixels, int heightInPixels, @Nullable RenderOptions renderOptions) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(widthInPixels, heightInPixels);
        Intrinsics.checkNotNullExpressionValue(canvasBeginRecording, "picture.beginRecording(w…InPixels, heightInPixels)");
        if (renderOptions == null || renderOptions.getViewPort() == null) {
            if (renderOptions != null) {
                renderOptions = new RenderOptions(renderOptions);
            } else {
                renderOptions = new RenderOptions(null, 1, 0 == true ? 1 : 0);
            }
            renderOptions.viewPort(0.0f, 0.0f, widthInPixels, heightInPixels);
        }
        new SVGAndroidRenderer(canvasBeginRecording, this.renderDPI).renderDocument(this, renderOptions);
        picture.endRecording();
        return picture;
    }
}
