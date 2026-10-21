package androidx.compose.ui.graphics.drawscope;

import a1.b;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x1.a;

/* JADX INFO: compiled from: CanvasDrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0002\u0080\u0001B\u0007¢\u0006\u0004\b\u007f\u0010qJa\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014Ja\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019JO\u0010!\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 JO\u0010!\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#JG\u0010(\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J_\u0010(\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020+2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100Jg\u0010(\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020+2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104JW\u00109\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00106\u001a\u0002052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108JW\u00109\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00106\u001a\u0002052\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;JO\u0010@\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?JO\u0010@\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u0010BJO\u0010D\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010 JO\u0010D\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010#Jg\u0010L\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u00072\u0006\u0010I\u001a\u00020H2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010KJg\u0010L\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u00072\u0006\u0010I\u001a\u00020H2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bM\u0010NJG\u0010S\u001a\u00020\u00122\u0006\u0010P\u001a\u00020O2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bQ\u0010RJG\u0010S\u001a\u00020\u00122\u0006\u0010P\u001a\u00020O2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010UJg\u0010\\\u001a\u00020\u00122\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00040V2\u0006\u0010Y\u001a\u00020X2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bZ\u0010[Jg\u0010\\\u001a\u00020\u00122\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00040V2\u0006\u0010Y\u001a\u00020X2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b]\u0010^JR\u0010j\u001a\u00020\u00122\u0006\u0010`\u001a\u00020_2\u0006\u0010b\u001a\u00020a2\u0006\u0010d\u001a\u00020c2\u0006\u0010\u001c\u001a\u00020\u001b2\u0017\u0010g\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00120e¢\u0006\u0002\bfH\u0086\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bh\u0010iR \u0010r\u001a\u00020k8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bl\u0010m\u0012\u0004\bp\u0010q\u001a\u0004\bn\u0010oR\u001a\u0010x\u001a\u00020s8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u0014\u0010b\u001a\u00020a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010`\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010|\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u0081\u0001"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/geometry/Offset;", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "Landroidx/compose/ui/graphics/Color;", "color", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "topLeft", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "style", "drawRect-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", AuthConstants.IMAGE, "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "radius", "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-AsUm42w", "drawOval", "drawOval-n-J9OG0", "startAngle", "sweepAngle", "", "useCenter", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", "path", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", "points", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "draw-yzxVdVo", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "draw", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "p0", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams$annotations", "()V", "drawParams", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "q0", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getDensity", "()F", "getFontScale", "fontScale", "<init>", "DrawParams", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,804:1\n1#2:805\n*E\n"})
public final class CanvasDrawScope implements DrawScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final CanvasDrawScope$drawContext$1 f15850q0 = new DrawContext() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final DrawTransform transform = CanvasDrawScopeKt.access$asDrawTransform(this);

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        @NotNull
        public Canvas getCanvas() {
            return this.f15858b.getDrawParams().getCanvas();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public long mo2915getSizeNHjbRc() {
            return this.f15858b.getDrawParams().m2913getSizeNHjbRc();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        @NotNull
        public DrawTransform getTransform() {
            return this.transform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
        public void mo2916setSizeuvyYCjk(long j10) {
            this.f15858b.getDrawParams().m2914setSizeuvyYCjk(j10);
        }
    };

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Paint f15851r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public Paint f15852s0;

    public static Paint a(CanvasDrawScope canvasDrawScope, long j10, DrawStyle drawStyle, float f6, ColorFilter colorFilter, int i10) {
        int iM2940getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m2940getDefaultFilterQualityfv9h1I();
        Paint paintG = canvasDrawScope.g(drawStyle);
        if (f6 != 1.0f) {
            j10 = Color.m2507copywmQWz5c$default(j10, Color.m2510getAlphaimpl(j10) * f6, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (!Color.m2509equalsimpl0(paintG.mo2390getColor0d7_KjU(), j10)) {
            paintG.mo2396setColor8_81llA(j10);
        }
        if (paintG.getF15559c() != null) {
            paintG.setShader(null);
        }
        if (!Intrinsics.areEqual(paintG.getF15560d(), colorFilter)) {
            paintG.setColorFilter(colorFilter);
        }
        if (!BlendMode.m2428equalsimpl0(paintG.getF15558b(), i10)) {
            paintG.mo2395setBlendModes9anfk8(i10);
        }
        if (!FilterQuality.m2595equalsimpl0(paintG.mo2391getFilterQualityfv9h1I(), iM2940getDefaultFilterQualityfv9h1I)) {
            paintG.mo2397setFilterQualityvDHp3xo(iM2940getDefaultFilterQualityfv9h1I);
        }
        return paintG;
    }

    public static /* synthetic */ Paint c(CanvasDrawScope canvasDrawScope, Brush brush, DrawStyle drawStyle, float f6, ColorFilter colorFilter, int i10) {
        return canvasDrawScope.b(brush, drawStyle, f6, colorFilter, i10, DrawScope.INSTANCE.m2940getDefaultFilterQualityfv9h1I());
    }

    public static Paint d(CanvasDrawScope canvasDrawScope, long j10, float f6, int i10, int i11, PathEffect pathEffect, float f10, ColorFilter colorFilter, int i12) {
        int iM2940getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m2940getDefaultFilterQualityfv9h1I();
        Paint paintF = canvasDrawScope.f();
        long jM2507copywmQWz5c$default = f10 == 1.0f ? j10 : Color.m2507copywmQWz5c$default(j10, Color.m2510getAlphaimpl(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
        if (!Color.m2509equalsimpl0(paintF.mo2390getColor0d7_KjU(), jM2507copywmQWz5c$default)) {
            paintF.mo2396setColor8_81llA(jM2507copywmQWz5c$default);
        }
        if (paintF.getF15559c() != null) {
            paintF.setShader(null);
        }
        if (!Intrinsics.areEqual(paintF.getF15560d(), colorFilter)) {
            paintF.setColorFilter(colorFilter);
        }
        if (!BlendMode.m2428equalsimpl0(paintF.getF15558b(), i12)) {
            paintF.mo2395setBlendModes9anfk8(i12);
        }
        if (paintF.getStrokeWidth() != f6) {
            paintF.setStrokeWidth(f6);
        }
        if (paintF.getStrokeMiterLimit() != 4.0f) {
            paintF.setStrokeMiterLimit(4.0f);
        }
        if (!StrokeCap.m2804equalsimpl0(paintF.mo2392getStrokeCapKaPHkGw(), i10)) {
            paintF.mo2398setStrokeCapBeK7IIE(i10);
        }
        if (!StrokeJoin.m2814equalsimpl0(paintF.mo2393getStrokeJoinLxFBmk8(), i11)) {
            paintF.mo2399setStrokeJoinWw9F2mQ(i11);
        }
        if (!Intrinsics.areEqual(paintF.getPathEffect(), pathEffect)) {
            paintF.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m2595equalsimpl0(paintF.mo2391getFilterQualityfv9h1I(), iM2940getDefaultFilterQualityfv9h1I)) {
            paintF.mo2397setFilterQualityvDHp3xo(iM2940getDefaultFilterQualityfv9h1I);
        }
        return paintF;
    }

    public static Paint e(CanvasDrawScope canvasDrawScope, Brush brush, float f6, int i10, int i11, PathEffect pathEffect, float f10, ColorFilter colorFilter, int i12) {
        int iM2940getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m2940getDefaultFilterQualityfv9h1I();
        Paint paintF = canvasDrawScope.f();
        if (brush != null) {
            brush.mo2461applyToPq9zytI(b.c(canvasDrawScope), paintF, f10);
        } else if (paintF.getAlpha() != f10) {
            paintF.setAlpha(f10);
        }
        if (!Intrinsics.areEqual(paintF.getF15560d(), colorFilter)) {
            paintF.setColorFilter(colorFilter);
        }
        if (!BlendMode.m2428equalsimpl0(paintF.getF15558b(), i12)) {
            paintF.mo2395setBlendModes9anfk8(i12);
        }
        if (paintF.getStrokeWidth() != f6) {
            paintF.setStrokeWidth(f6);
        }
        if (paintF.getStrokeMiterLimit() != 4.0f) {
            paintF.setStrokeMiterLimit(4.0f);
        }
        if (!StrokeCap.m2804equalsimpl0(paintF.mo2392getStrokeCapKaPHkGw(), i10)) {
            paintF.mo2398setStrokeCapBeK7IIE(i10);
        }
        if (!StrokeJoin.m2814equalsimpl0(paintF.mo2393getStrokeJoinLxFBmk8(), i11)) {
            paintF.mo2399setStrokeJoinWw9F2mQ(i11);
        }
        if (!Intrinsics.areEqual(paintF.getPathEffect(), pathEffect)) {
            paintF.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m2595equalsimpl0(paintF.mo2391getFilterQualityfv9h1I(), iM2940getDefaultFilterQualityfv9h1I)) {
            paintF.mo2397setFilterQualityvDHp3xo(iM2940getDefaultFilterQualityfv9h1I);
        }
        return paintF;
    }

    public final Paint b(Brush brush, DrawStyle drawStyle, float f6, ColorFilter colorFilter, int i10, int i11) {
        Paint paintG = g(drawStyle);
        if (brush != null) {
            brush.mo2461applyToPq9zytI(b.c(this), paintG, f6);
        } else if (paintG.getAlpha() != f6) {
            paintG.setAlpha(f6);
        }
        if (!Intrinsics.areEqual(paintG.getF15560d(), colorFilter)) {
            paintG.setColorFilter(colorFilter);
        }
        if (!BlendMode.m2428equalsimpl0(paintG.getF15558b(), i10)) {
            paintG.mo2395setBlendModes9anfk8(i10);
        }
        if (!FilterQuality.m2595equalsimpl0(paintG.mo2391getFilterQualityfv9h1I(), i11)) {
            paintG.mo2397setFilterQualityvDHp3xo(i11);
        }
        return paintG;
    }

    /* JADX INFO: renamed from: draw-yzxVdVo, reason: not valid java name */
    public final void m2888drawyzxVdVo(@NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Canvas canvas, long size, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawParams drawParams = getDrawParams();
        Density density2 = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas2 = drawParams.getCanvas();
        long size2 = drawParams.getSize();
        DrawParams drawParams2 = getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m2914setSizeuvyYCjk(size);
        canvas.save();
        block.invoke(this);
        canvas.restore();
        DrawParams drawParams3 = getDrawParams();
        drawParams3.setDensity(density2);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas2);
        drawParams3.m2914setSizeuvyYCjk(size2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-illE91I, reason: not valid java name */
    public void mo2889drawArcillE91I(@NotNull Brush brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawArc(Offset.m2275getXimpl(topLeft), Offset.m2276getYimpl(topLeft), Size.m2344getWidthimpl(size) + Offset.m2275getXimpl(topLeft), Size.m2341getHeightimpl(size) + Offset.m2276getYimpl(topLeft), startAngle, sweepAngle, useCenter, c(this, brush, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-yD3GUKo, reason: not valid java name */
    public void mo2890drawArcyD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawArc(Offset.m2275getXimpl(topLeft), Offset.m2276getYimpl(topLeft), Size.m2344getWidthimpl(size) + Offset.m2275getXimpl(topLeft), Size.m2341getHeightimpl(size) + Offset.m2276getYimpl(topLeft), startAngle, sweepAngle, useCenter, a(this, color, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-V9BoPsw, reason: not valid java name */
    public void mo2891drawCircleV9BoPsw(@NotNull Brush brush, float radius, long center, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().mo2373drawCircle9KIMszo(center, radius, c(this, brush, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-VaOC9Bg, reason: not valid java name */
    public void mo2892drawCircleVaOC9Bg(long color, float radius, long center, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().mo2373drawCircle9KIMszo(center, radius, a(this, color, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* JADX INFO: renamed from: drawImage-9jGpkUE, reason: not valid java name */
    public /* synthetic */ void mo2893drawImage9jGpkUE(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().mo2375drawImageRectHPBpro0(image, srcOffset, srcSize, dstOffset, dstSize, c(this, null, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-AZ2fEMs, reason: not valid java name */
    public void mo2894drawImageAZ2fEMs(@NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode, int filterQuality) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().mo2375drawImageRectHPBpro0(image, srcOffset, srcSize, dstOffset, dstSize, b(null, style, alpha, colorFilter, blendMode, filterQuality));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-gbVJVH8, reason: not valid java name */
    public void mo2895drawImagegbVJVH8(@NotNull ImageBitmap image, long topLeft, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().mo2374drawImaged4ec7I(image, topLeft, c(this, null, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-1RTmtNc, reason: not valid java name */
    public void mo2896drawLine1RTmtNc(@NotNull Brush brush, long start, long end, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.drawParams.getCanvas().mo2376drawLineWko1d7g(start, end, e(this, brush, strokeWidth, cap, StrokeJoin.INSTANCE.m2819getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-NGM6Ib0, reason: not valid java name */
    public void mo2897drawLineNGM6Ib0(long color, long start, long end, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo2376drawLineWko1d7g(start, end, d(this, color, strokeWidth, cap, StrokeJoin.INSTANCE.m2819getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-AsUm42w, reason: not valid java name */
    public void mo2898drawOvalAsUm42w(@NotNull Brush brush, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawOval(Offset.m2275getXimpl(topLeft), Offset.m2276getYimpl(topLeft), Size.m2344getWidthimpl(size) + Offset.m2275getXimpl(topLeft), Size.m2341getHeightimpl(size) + Offset.m2276getYimpl(topLeft), c(this, brush, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-n-J9OG0, reason: not valid java name */
    public void mo2899drawOvalnJ9OG0(long color, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawOval(Offset.m2275getXimpl(topLeft), Offset.m2276getYimpl(topLeft), Size.m2344getWidthimpl(size) + Offset.m2275getXimpl(topLeft), Size.m2341getHeightimpl(size) + Offset.m2276getYimpl(topLeft), a(this, color, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-GBMwjPU, reason: not valid java name */
    public void mo2900drawPathGBMwjPU(@NotNull Path path, @NotNull Brush brush, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawPath(path, c(this, brush, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-LG529CI, reason: not valid java name */
    public void mo2901drawPathLG529CI(@NotNull Path path, long color, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawPath(path, a(this, color, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-F8ZwMP8, reason: not valid java name */
    public void mo2902drawPointsF8ZwMP8(@NotNull List<Offset> points, int pointMode, long color, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.drawParams.getCanvas().mo2377drawPointsO7TthRY(pointMode, points, d(this, color, strokeWidth, cap, StrokeJoin.INSTANCE.m2819getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-Gsft0Ws, reason: not valid java name */
    public void mo2903drawPointsGsft0Ws(@NotNull List<Offset> points, int pointMode, @NotNull Brush brush, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.drawParams.getCanvas().mo2377drawPointsO7TthRY(pointMode, points, e(this, brush, strokeWidth, cap, StrokeJoin.INSTANCE.m2819getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-AsUm42w, reason: not valid java name */
    public void mo2904drawRectAsUm42w(@NotNull Brush brush, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawRect(Offset.m2275getXimpl(topLeft), Offset.m2276getYimpl(topLeft), Size.m2344getWidthimpl(size) + Offset.m2275getXimpl(topLeft), Size.m2341getHeightimpl(size) + Offset.m2276getYimpl(topLeft), c(this, brush, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-n-J9OG0, reason: not valid java name */
    public void mo2905drawRectnJ9OG0(long color, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawRect(Offset.m2275getXimpl(topLeft), Offset.m2276getYimpl(topLeft), Size.m2344getWidthimpl(size) + Offset.m2275getXimpl(topLeft), Size.m2341getHeightimpl(size) + Offset.m2276getYimpl(topLeft), a(this, color, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ, reason: not valid java name */
    public void mo2906drawRoundRectZuiqVtQ(@NotNull Brush brush, long topLeft, long size, long cornerRadius, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawRoundRect(Offset.m2275getXimpl(topLeft), Offset.m2276getYimpl(topLeft), Offset.m2275getXimpl(topLeft) + Size.m2344getWidthimpl(size), Offset.m2276getYimpl(topLeft) + Size.m2341getHeightimpl(size), CornerRadius.m2250getXimpl(cornerRadius), CornerRadius.m2251getYimpl(cornerRadius), c(this, brush, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA, reason: not valid java name */
    public void mo2907drawRoundRectuAw5IA(long color, long topLeft, long size, long cornerRadius, @NotNull DrawStyle style, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawRoundRect(Offset.m2275getXimpl(topLeft), Offset.m2276getYimpl(topLeft), Size.m2344getWidthimpl(size) + Offset.m2275getXimpl(topLeft), Size.m2341getHeightimpl(size) + Offset.m2276getYimpl(topLeft), CornerRadius.m2250getXimpl(cornerRadius), CornerRadius.m2251getYimpl(cornerRadius), a(this, color, style, alpha, colorFilter, blendMode));
    }

    public final Paint f() {
        Paint paint = this.f15852s0;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo2400setStylek9PVt8s(PaintingStyle.INSTANCE.m2736getStrokeTiuSbCo());
        this.f15852s0 = Paint;
        return Paint;
    }

    public final Paint g(DrawStyle drawStyle) {
        if (Intrinsics.areEqual(drawStyle, Fill.INSTANCE)) {
            Paint paint = this.f15851r0;
            if (paint != null) {
                return paint;
            }
            Paint Paint = AndroidPaint_androidKt.Paint();
            Paint.mo2400setStylek9PVt8s(PaintingStyle.INSTANCE.m2735getFillTiuSbCo());
            this.f15851r0 = Paint;
            return Paint;
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new NoWhenBranchMatchedException();
        }
        Paint paintF = f();
        Stroke stroke = (Stroke) drawStyle;
        if (paintF.getStrokeWidth() != stroke.getWidth()) {
            paintF.setStrokeWidth(stroke.getWidth());
        }
        if (!StrokeCap.m2804equalsimpl0(paintF.mo2392getStrokeCapKaPHkGw(), stroke.getCap())) {
            paintF.mo2398setStrokeCapBeK7IIE(stroke.getCap());
        }
        if (paintF.getStrokeMiterLimit() != stroke.getMiter()) {
            paintF.setStrokeMiterLimit(stroke.getMiter());
        }
        if (!StrokeJoin.m2814equalsimpl0(paintF.mo2393getStrokeJoinLxFBmk8(), stroke.getJoin())) {
            paintF.mo2399setStrokeJoinWw9F2mQ(stroke.getJoin());
        }
        if (!Intrinsics.areEqual(paintF.getPathEffect(), stroke.getPathEffect())) {
            paintF.setPathEffect(stroke.getPathEffect());
        }
        return paintF;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final /* synthetic */ long mo2908getCenterF1C5BW0() {
        return b.b(this);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.drawParams.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @NotNull
    public DrawContext getDrawContext() {
        return this.f15850q0;
    }

    @NotNull
    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.drawParams.getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final /* synthetic */ long mo2909getSizeNHjbRc() {
        return b.c(this);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public final /* synthetic */ int mo412roundToPxR2X_6o(long j10) {
        return a.a(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public final /* synthetic */ int mo413roundToPx0680j_4(float f6) {
        return a.b(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public final /* synthetic */ float mo404toDpGaN1DYA(long j10) {
        return a.c(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final /* synthetic */ float mo405toDpu2uoSUM(float f6) {
        return a.d(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public final /* synthetic */ long mo407toDpSizekrfVVM(long j10) {
        return a.f(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public final /* synthetic */ float mo414toPxR2X_6o(long j10) {
        return a.g(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public final /* synthetic */ float mo415toPx0680j_4(float f6) {
        return a.h(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    public final /* synthetic */ Rect toRect(DpRect dpRect) {
        return a.i(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public final /* synthetic */ long mo408toSizeXkaWNTQ(long j10) {
        return a.j(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public final /* synthetic */ long mo409toSp0xMU5do(float f6) {
        return a.k(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final /* synthetic */ long mo410toSpkPz2Gy4(float f6) {
        return a.l(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final /* synthetic */ float mo406toDpu2uoSUM(int i10) {
        return a.e(this, i10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final /* synthetic */ long mo411toSpkPz2Gy4(int i10) {
        return a.m(this, i10);
    }

    /* JADX INFO: compiled from: CanvasDrawScope.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001B2\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\bø\u0001\u0002¢\u0006\u0004\b1\u00102J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\n\"\u0004\b/\u00100\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00063"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "", "Landroidx/compose/ui/unit/Density;", "component1", "Landroidx/compose/ui/unit/LayoutDirection;", "component2", "Landroidx/compose/ui/graphics/Canvas;", "component3", "Landroidx/compose/ui/geometry/Size;", "component4-NH-jbRc", "()J", "component4", "density", "layoutDirection", "canvas", "size", "copy-Ug5Nnss", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;J)Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "b", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "c", "Landroidx/compose/ui/graphics/Canvas;", "getCanvas", "()Landroidx/compose/ui/graphics/Canvas;", "setCanvas", "(Landroidx/compose/ui/graphics/Canvas;)V", "d", "J", "getSize-NH-jbRc", "setSize-uvyYCjk", "(J)V", "<init>", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    @PublishedApi
    public static final /* data */ class DrawParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Density density;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public LayoutDirection layoutDirection;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Canvas canvas;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public long size;

        public DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.canvas = canvas;
            this.size = j10;
        }

        /* JADX INFO: renamed from: copy-Ug5Nnss$default, reason: not valid java name */
        public static /* synthetic */ DrawParams m2910copyUg5Nnss$default(DrawParams drawParams, Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                density = drawParams.density;
            }
            if ((i10 & 2) != 0) {
                layoutDirection = drawParams.layoutDirection;
            }
            LayoutDirection layoutDirection2 = layoutDirection;
            if ((i10 & 4) != 0) {
                canvas = drawParams.canvas;
            }
            Canvas canvas2 = canvas;
            if ((i10 & 8) != 0) {
                j10 = drawParams.size;
            }
            return drawParams.m2912copyUg5Nnss(density, layoutDirection2, canvas2, j10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Density getDensity() {
            return this.density;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Canvas getCanvas() {
            return this.canvas;
        }

        /* JADX INFO: renamed from: component4-NH-jbRc, reason: not valid java name and from getter */
        public final long getSize() {
            return this.size;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-Ug5Nnss, reason: not valid java name */
        public final DrawParams m2912copyUg5Nnss(@NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Canvas canvas, long size) {
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            return new DrawParams(density, layoutDirection, canvas, size, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) other;
            return Intrinsics.areEqual(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && Intrinsics.areEqual(this.canvas, drawParams.canvas) && Size.m2340equalsimpl0(this.size, drawParams.size);
        }

        @NotNull
        public final Canvas getCanvas() {
            return this.canvas;
        }

        @NotNull
        public final Density getDensity() {
            return this.density;
        }

        @NotNull
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m2913getSizeNHjbRc() {
            return this.size;
        }

        public int hashCode() {
            return Size.m2345hashCodeimpl(this.size) + ((this.canvas.hashCode() + ((this.layoutDirection.hashCode() + (this.density.hashCode() * 31)) * 31)) * 31);
        }

        public final void setCanvas(@NotNull Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "<set-?>");
            this.canvas = canvas;
        }

        public final void setDensity(@NotNull Density density) {
            Intrinsics.checkNotNullParameter(density, "<set-?>");
            this.density = density;
        }

        public final void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
            this.layoutDirection = layoutDirection;
        }

        /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m2914setSizeuvyYCjk(long j10) {
            this.size = j10;
        }

        @NotNull
        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) Size.m2348toStringimpl(this.size)) + RootService.CLOSE_BRACKET;
        }

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CanvasDrawScopeKt.f15859a : density, (i10 & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i10 & 4) != 0 ? new EmptyCanvas() : canvas, (i10 & 8) != 0 ? Size.INSTANCE.m2353getZeroNHjbRc() : j10, null);
        }
    }

    @PublishedApi
    public static /* synthetic */ void getDrawParams$annotations() {
    }
}
