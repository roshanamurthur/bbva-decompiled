package androidx.compose.ui.text;

import androidx.appcompat.widget.o1;
import androidx.collection.g;
import androidx.collection.h;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDrawKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.l;

/* JADX INFO: compiled from: MultiParagraph.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0017\u0012\u0006\u0010E\u001a\u00020@\u0012\b\b\u0002\u0010J\u001a\u00020\u001a\u0012\b\b\u0002\u0010m\u001a\u00020)\u0012\u0006\u0010T\u001a\u00020\u0016¢\u0006\u0004\bn\u0010oB[\b\u0017\u0012\u0006\u0010q\u001a\u00020p\u0012\u0006\u0010s\u001a\u00020r\u0012\u0014\b\u0002\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020u0t0[\u0012\b\b\u0002\u0010J\u001a\u00020\u001a\u0012\b\b\u0002\u0010m\u001a\u00020)\u0012\u0006\u0010T\u001a\u00020\u0016\u0012\u0006\u0010x\u001a\u00020w\u0012\u0006\u0010z\u001a\u00020y¢\u0006\u0004\bn\u0010{B[\b\u0017\u0012\u0006\u0010q\u001a\u00020p\u0012\u0006\u0010s\u001a\u00020r\u0012\u0006\u0010T\u001a\u00020\u0016\u0012\u0006\u0010x\u001a\u00020w\u0012\u0006\u0010}\u001a\u00020|\u0012\u0014\b\u0002\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020u0t0[\u0012\b\b\u0002\u0010J\u001a\u00020\u001a\u0012\b\b\u0002\u0010m\u001a\u00020)¢\u0006\u0004\bn\u0010~B0\u0012\u0006\u0010E\u001a\u00020@\u0012\u0007\u0010\u0080\u0001\u001a\u00020\u007f\u0012\b\b\u0002\u0010J\u001a\u00020\u001a\u0012\b\b\u0002\u0010m\u001a\u00020)ø\u0001\u0001¢\u0006\u0005\bn\u0010\u0081\u0001B`\b\u0016\u0012\u0006\u0010q\u001a\u00020p\u0012\u0006\u0010s\u001a\u00020r\u0012\u0007\u0010\u0080\u0001\u001a\u00020\u007f\u0012\u0006\u0010x\u001a\u00020w\u0012\u0006\u0010}\u001a\u00020|\u0012\u0014\b\u0002\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020u0t0[\u0012\b\b\u0002\u0010J\u001a\u00020\u001a\u0012\b\b\u0002\u0010m\u001a\u00020)ø\u0001\u0001¢\u0006\u0005\bn\u0010\u0082\u0001J?\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJS\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J[\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aJ\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0016J\u001b\u0010%\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u000e\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u001aJ\u0016\u0010+\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)J\u000e\u0010-\u001a\u00020,2\u0006\u0010&\u001a\u00020\u001aJ\u000e\u0010.\u001a\u00020,2\u0006\u0010&\u001a\u00020\u001aJ\u001e\u00102\u001a\u00020/2\u0006\u0010&\u001a\u00020\u001aø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u000e\u00103\u001a\u00020'2\u0006\u0010&\u001a\u00020\u001aJ\u000e\u00104\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001aJ\u000e\u00106\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u001aJ\u000e\u00107\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u001aJ\u000e\u00108\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u001aJ\u000e\u00109\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u001aJ\u000e\u0010:\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u001aJ\u000e\u0010;\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u001aJ\u000e\u0010<\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001aJ\u0018\u0010>\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001a2\b\b\u0002\u0010=\u001a\u00020)J\u000e\u0010?\u001a\u00020)2\u0006\u00105\u001a\u00020\u001aR\u0017\u0010E\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010J\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010O\u001a\u00020)8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010T\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010W\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bU\u0010Q\u001a\u0004\bV\u0010SR\u0017\u0010Z\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bX\u0010G\u001a\u0004\bY\u0010IR\u001f\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0[8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R \u0010d\u001a\b\u0012\u0004\u0012\u00020a0[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010]\u001a\u0004\bc\u0010_R\u0011\u0010f\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\be\u0010SR\u0011\u0010h\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bg\u0010SR\u0011\u0010j\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bi\u0010SR\u0011\u0010l\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bk\u0010S\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0083\u0001"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "decoration", "", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "vertical", "getLineForVerticalPosition", "Landroidx/compose/ui/geometry/Offset;", "position", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "", "usePrimaryDirection", "getHorizontalPosition", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "getBidiRunDirection", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "getCursorRect", "getLineForOffset", "lineIndex", "getLineLeft", "getLineRight", "getLineTop", "getLineBottom", "getLineHeight", "getLineWidth", "getLineStart", "visibleEnd", "getLineEnd", "isLineEllipsized", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "a", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "intrinsics", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMaxLines", "()I", "maxLines", "c", "Z", "getDidExceedMaxLines", "()Z", "didExceedMaxLines", "d", "F", "getWidth", "()F", "width", "e", "getHeight", "height", "f", "getLineCount", "lineCount", "", "g", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/text/ParagraphInfo;", "h", "getParagraphInfoList$ui_text_release", "paragraphInfoList", "getMinIntrinsicWidth", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "ellipsis", "<init>", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;IZF)V", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZ)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,982:1\n127#2,3:983\n130#2:990\n131#2,2:1002\n133#2:1005\n33#3,4:986\n151#3,3:991\n33#3,4:994\n154#3,2:998\n38#3:1000\n156#3:1001\n38#3:1004\n33#3,6:1007\n33#3,6:1013\n1#4:1006\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n*L\n371#1:983,3\n371#1:990\n371#1:1002,2\n371#1:1005\n371#1:986,4\n373#1:991,3\n373#1:994,4\n373#1:998,2\n373#1:1000\n373#1:1001\n371#1:1004\n399#1:1007,6\n416#1:1013,6\n*E\n"})
public final class MultiParagraph {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MultiParagraphIntrinsics intrinsics;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int maxLines;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean didExceedMaxLines;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float width;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final float height;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int lineCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Rect> placeholderRects;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final ArrayList f17620h;

    public MultiParagraph() {
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiParagraph(AnnotatedString annotatedString, TextStyle style, long j10, Density density, FontFamily.Resolver fontFamilyResolver, List placeholders, int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(new MultiParagraphIntrinsics(annotatedString, style, (List<AnnotatedString.Range<Placeholder>>) placeholders, density, fontFamilyResolver), j10, i10, z10, null);
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph multiParagraph, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return multiParagraph.getLineEnd(i10, z10);
    }

    /* JADX INFO: renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m3867paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Color.INSTANCE.m2544getUnspecified0d7_KjU();
        }
        multiParagraph.m3872paintRPmYEkk(canvas, j10, (i10 & 4) != 0 ? null : shadow, (i10 & 8) != 0 ? null : textDecoration);
    }

    public final void a(int i10) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.intrinsics;
        if (i10 < 0 || i10 > multiParagraphIntrinsics.getAnnotatedString().getText().length()) {
            StringBuilder sbC = o1.c("offset(", i10, ") is out of bounds [0, ");
            sbC.append(multiParagraphIntrinsics.getAnnotatedString().length());
            sbC.append(AbstractJsonLexerKt.END_LIST);
            throw new IllegalArgumentException(sbC.toString().toString());
        }
    }

    public final void b(int i10) {
        int i11 = this.lineCount;
        if (i10 < 0 || i10 >= i11) {
            throw new IllegalArgumentException(g.b("lineIndex(", i10, ") is out of bounds [0, ", i11, RootService.CLOSE_BRACKET).toString());
        }
    }

    @NotNull
    public final ResolvedTextDirection getBidiRunDirection(int offset) {
        a(offset);
        int length = this.intrinsics.getAnnotatedString().length();
        ArrayList arrayList = this.f17620h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(offset == length ? CollectionsKt__CollectionsKt.getLastIndex(arrayList) : MultiParagraphKt.findParagraphByIndex(arrayList, offset));
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(offset));
    }

    @NotNull
    public final Rect getBoundingBox(int offset) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.intrinsics;
        if (offset >= 0 && offset < multiParagraphIntrinsics.getAnnotatedString().getText().length()) {
            ArrayList arrayList = this.f17620h;
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.findParagraphByIndex(arrayList, offset));
            return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(offset)));
        }
        StringBuilder sbC = o1.c("offset(", offset, ") is out of bounds [0, ");
        sbC.append(multiParagraphIntrinsics.getAnnotatedString().length());
        sbC.append(RootService.CLOSE_BRACKET);
        throw new IllegalArgumentException(sbC.toString().toString());
    }

    @NotNull
    public final Rect getCursorRect(int offset) {
        a(offset);
        int length = this.intrinsics.getAnnotatedString().length();
        ArrayList arrayList = this.f17620h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(offset == length ? CollectionsKt__CollectionsKt.getLastIndex(arrayList) : MultiParagraphKt.findParagraphByIndex(arrayList, offset));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(offset)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getFirstBaseline() {
        ArrayList arrayList = this.f17620h;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        return ((ParagraphInfo) arrayList.get(0)).getParagraph().getFirstBaseline();
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
        a(offset);
        int length = this.intrinsics.getAnnotatedString().length();
        ArrayList arrayList = this.f17620h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(offset == length ? CollectionsKt__CollectionsKt.getLastIndex(arrayList) : MultiParagraphKt.findParagraphByIndex(arrayList, offset));
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(offset), usePrimaryDirection);
    }

    @NotNull
    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final float getLastBaseline() {
        ArrayList arrayList = this.f17620h;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) CollectionsKt___CollectionsKt.last((List) arrayList);
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final float getLineBottom(int lineIndex) {
        b(lineIndex);
        ArrayList arrayList = this.f17620h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.findParagraphByLineIndex(arrayList, lineIndex));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getLineEnd(int lineIndex, boolean visibleEnd) {
        b(lineIndex);
        ArrayList arrayList = this.f17620h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.findParagraphByLineIndex(arrayList, lineIndex));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(lineIndex), visibleEnd));
    }

    public final int getLineForOffset(int offset) {
        int iFindParagraphByIndex;
        int length = this.intrinsics.getAnnotatedString().length();
        ArrayList arrayList = this.f17620h;
        if (offset >= length) {
            iFindParagraphByIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
        } else {
            iFindParagraphByIndex = offset < 0 ? 0 : MultiParagraphKt.findParagraphByIndex(arrayList, offset);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(iFindParagraphByIndex);
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(offset)));
    }

    public final int getLineForVerticalPosition(float vertical) {
        int lastIndex;
        ArrayList arrayList = this.f17620h;
        if (vertical <= 0.0f) {
            lastIndex = 0;
        } else {
            lastIndex = vertical >= this.height ? CollectionsKt__CollectionsKt.getLastIndex(arrayList) : MultiParagraphKt.findParagraphByY(arrayList, vertical);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(lastIndex);
        return paragraphInfo.getLength() == 0 ? Math.max(0, paragraphInfo.getStartIndex() - 1) : paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(vertical)));
    }

    public final float getLineHeight(int lineIndex) {
        b(lineIndex);
        ArrayList arrayList = this.f17620h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.findParagraphByLineIndex(arrayList, lineIndex));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getLineLeft(int lineIndex) {
        b(lineIndex);
        ArrayList arrayList = this.f17620h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.findParagraphByLineIndex(arrayList, lineIndex));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getLineRight(int lineIndex) {
        b(lineIndex);
        ArrayList arrayList = this.f17620h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.findParagraphByLineIndex(arrayList, lineIndex));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final int getLineStart(int lineIndex) {
        b(lineIndex);
        ArrayList arrayList = this.f17620h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.findParagraphByLineIndex(arrayList, lineIndex));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final float getLineTop(int lineIndex) {
        b(lineIndex);
        ArrayList arrayList = this.f17620h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.findParagraphByLineIndex(arrayList, lineIndex));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final float getLineWidth(int lineIndex) {
        b(lineIndex);
        ArrayList arrayList = this.f17620h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.findParagraphByLineIndex(arrayList, lineIndex));
        return paragraphInfo.getParagraph().getLineWidth(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getMaxIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final float getMinIntrinsicWidth() {
        return this.intrinsics.getMinIntrinsicWidth();
    }

    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m3869getOffsetForPositionk4lQ0M(long position) {
        int lastIndex;
        float fM2276getYimpl = Offset.m2276getYimpl(position);
        ArrayList arrayList = this.f17620h;
        if (fM2276getYimpl <= 0.0f) {
            lastIndex = 0;
        } else {
            lastIndex = Offset.m2276getYimpl(position) >= this.height ? CollectionsKt__CollectionsKt.getLastIndex(arrayList) : MultiParagraphKt.findParagraphByY(arrayList, Offset.m2276getYimpl(position));
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(lastIndex);
        return paragraphInfo.getLength() == 0 ? Math.max(0, paragraphInfo.getStartIndex() - 1) : paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo3847getOffsetForPositionk4lQ0M(paragraphInfo.m3875toLocalMKHz9U(position)));
    }

    @NotNull
    public final ResolvedTextDirection getParagraphDirection(int offset) {
        a(offset);
        int length = this.intrinsics.getAnnotatedString().length();
        ArrayList arrayList = this.f17620h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(offset == length ? CollectionsKt__CollectionsKt.getLastIndex(arrayList) : MultiParagraphKt.findParagraphByIndex(arrayList, offset));
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(offset));
    }

    @NotNull
    public final List<ParagraphInfo> getParagraphInfoList$ui_text_release() {
        return this.f17620h;
    }

    @NotNull
    public final Path getPathForRange(int start, int end) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.intrinsics;
        if (start < 0 || start > end || end > multiParagraphIntrinsics.getAnnotatedString().getText().length()) {
            StringBuilder sbE = h.e("Start(", start, ") or End(", end, ") is out of range [0..");
            sbE.append(multiParagraphIntrinsics.getAnnotatedString().getText().length());
            sbE.append("), or start > end!");
            throw new IllegalArgumentException(sbE.toString().toString());
        }
        if (start == end) {
            return AndroidPath_androidKt.Path();
        }
        ArrayList arrayList = this.f17620h;
        Path Path = AndroidPath_androidKt.Path();
        int size = arrayList.size();
        for (int iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(arrayList, start); iFindParagraphByIndex < size; iFindParagraphByIndex++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(iFindParagraphByIndex);
            if (paragraphInfo.getStartIndex() >= end) {
                break;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                l.g(Path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(start), paragraphInfo.toLocalIndex(end))), 0L, 2, null);
            }
        }
        return Path;
    }

    @NotNull
    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m3870getWordBoundaryjx7JFs(int offset) {
        a(offset);
        int length = this.intrinsics.getAnnotatedString().length();
        ArrayList arrayList = this.f17620h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(offset == length ? CollectionsKt__CollectionsKt.getLastIndex(arrayList) : MultiParagraphKt.findParagraphByIndex(arrayList, offset));
        return paragraphInfo.m3874toGlobalGEjPoXI(paragraphInfo.getParagraph().mo3848getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(offset)));
    }

    public final boolean isLineEllipsized(int lineIndex) {
        b(lineIndex);
        ArrayList arrayList = this.f17620h;
        return ((ParagraphInfo) arrayList.get(MultiParagraphKt.findParagraphByLineIndex(arrayList, lineIndex))).getParagraph().isLineEllipsized(lineIndex);
    }

    /* JADX INFO: renamed from: paint-LG529CI, reason: not valid java name */
    public final void m3871paintLG529CI(@NotNull Canvas canvas, long color, @Nullable Shadow shadow, @Nullable TextDecoration decoration, @Nullable DrawStyle drawStyle, int blendMode) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        ArrayList arrayList = this.f17620h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i10);
            paragraphInfo.getParagraph().mo3849paintLG529CI(canvas, color, shadow, decoration, drawStyle, blendMode);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the new paint function that takes canvas as the only required parameter.")
    /* JADX INFO: renamed from: paint-RPmYEkk, reason: not valid java name */
    public final /* synthetic */ void m3872paintRPmYEkk(Canvas canvas, long color, Shadow shadow, TextDecoration decoration) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        ArrayList arrayList = this.f17620h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i10);
            paragraphInfo.getParagraph().mo3850paintRPmYEkk(canvas, color, shadow, decoration);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m3873painthn5TExg(@NotNull Canvas canvas, @NotNull Brush brush, float alpha, @Nullable Shadow shadow, @Nullable TextDecoration decoration, @Nullable DrawStyle drawStyle, int blendMode) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        AndroidMultiParagraphDrawKt.m4178drawMultiParagraph7AXcY_I(this, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
    }

    public MultiParagraph(MultiParagraphIntrinsics intrinsics, long j10, int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z11;
        int iM4356getMaxHeightimpl;
        Intrinsics.checkNotNullParameter(intrinsics, "intrinsics");
        this.intrinsics = intrinsics;
        this.maxLines = i10;
        if (Constraints.m4359getMinWidthimpl(j10) == 0 && Constraints.m4358getMinHeightimpl(j10) == 0) {
            ArrayList arrayList = new ArrayList();
            List<ParagraphIntrinsicInfo> infoList$ui_text_release = intrinsics.getInfoList$ui_text_release();
            int size = infoList$ui_text_release.size();
            int i11 = 0;
            int i12 = 0;
            float f6 = 0.0f;
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z11 = false;
                    break;
                }
                ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text_release.get(i13);
                ParagraphIntrinsics intrinsics2 = paragraphIntrinsicInfo.getIntrinsics();
                int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(j10);
                if (Constraints.m4352getHasBoundedHeightimpl(j10)) {
                    iM4356getMaxHeightimpl = c.coerceAtLeast(Constraints.m4356getMaxHeightimpl(j10) - ParagraphKt.ceilToInt(f6), i11);
                } else {
                    iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(j10);
                }
                Paragraph paragraphM3878Paragraph_EkL_Y = ParagraphKt.m3878Paragraph_EkL_Y(intrinsics2, ConstraintsKt.Constraints$default(0, iM4357getMaxWidthimpl, 0, iM4356getMaxHeightimpl, 5, null), this.maxLines - i12, z10);
                float height = paragraphM3878Paragraph_EkL_Y.getHeight() + f6;
                int lineCount = paragraphM3878Paragraph_EkL_Y.getLineCount() + i12;
                List<ParagraphIntrinsicInfo> list = infoList$ui_text_release;
                arrayList.add(new ParagraphInfo(paragraphM3878Paragraph_EkL_Y, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i12, lineCount, f6, height));
                if (paragraphM3878Paragraph_EkL_Y.getDidExceedMaxLines() || (lineCount == this.maxLines && i13 != CollectionsKt__CollectionsKt.getLastIndex(this.intrinsics.getInfoList$ui_text_release()))) {
                    z11 = true;
                    i12 = lineCount;
                    f6 = height;
                    break;
                } else {
                    i13++;
                    i12 = lineCount;
                    f6 = height;
                    i11 = 0;
                    infoList$ui_text_release = list;
                }
            }
            this.height = f6;
            this.lineCount = i12;
            this.didExceedMaxLines = z11;
            this.f17620h = arrayList;
            this.width = Constraints.m4357getMaxWidthimpl(j10);
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i14);
                List<Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
                ArrayList arrayList3 = new ArrayList(placeholderRects.size());
                int size3 = placeholderRects.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    Rect rect = placeholderRects.get(i15);
                    arrayList3.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
                }
                bk.g.addAll(arrayList2, arrayList3);
            }
            int size4 = arrayList2.size();
            List<Rect> listPlus = arrayList2;
            if (size4 < this.intrinsics.getPlaceholders().size()) {
                int size5 = this.intrinsics.getPlaceholders().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size5);
                for (int i16 = 0; i16 < size5; i16++) {
                    arrayList4.add(null);
                }
                listPlus = CollectionsKt___CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4);
            }
            this.placeholderRects = listPlus;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j10, (i11 & 4) != 0 ? Integer.MAX_VALUE : i10, (i11 & 8) != 0 ? false : z10, null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i10, boolean z10, float f6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, (i11 & 2) != 0 ? Integer.MAX_VALUE : i10, (i11 & 4) != 0 ? false : z10, f6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(@NotNull MultiParagraphIntrinsics intrinsics, int i10, boolean z10, float f6) {
        this(intrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f6), 0, 0, 13, null), i10, z10, null);
        Intrinsics.checkNotNullParameter(intrinsics, "intrinsics");
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List list, int i10, boolean z10, float f6, Density density, Font.ResourceLoader resourceLoader, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) ((i11 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list), (i11 & 8) != 0 ? Integer.MAX_VALUE : i10, (i11 & 16) != 0 ? false : z10, f6, density, resourceLoader);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public MultiParagraph(@NotNull AnnotatedString annotatedString, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, int i10, boolean z10, float f6, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader) {
        this(new MultiParagraphIntrinsics(annotatedString, style, placeholders, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader)), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f6), 0, 0, 13, null), i10, z10, null);
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f6, Density density, FontFamily.Resolver resolver, List list, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, f6, density, resolver, (List<AnnotatedString.Range<Placeholder>>) ((i11 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list), (i11 & 64) != 0 ? Integer.MAX_VALUE : i10, (i11 & 128) != 0 ? false : z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(@NotNull AnnotatedString annotatedString, @NotNull TextStyle style, float f6, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, int i10, boolean z10) {
        this(new MultiParagraphIntrinsics(annotatedString, style, placeholders, density, fontFamilyResolver), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f6), 0, 0, 13, null), i10, z10, null);
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List list, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j10, density, resolver, (i11 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i11 & 64) != 0 ? Integer.MAX_VALUE : i10, (i11 & 128) != 0 ? false : z10, null);
    }
}
