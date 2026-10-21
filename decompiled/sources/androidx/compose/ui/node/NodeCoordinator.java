package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinatesImpl;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import bk.w;
import com.bbva.networkplugin.command.impl.HeadCommand;
import i1.h;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0013\b \u0018\u0000 ó\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0004ó\u0001ô\u0001B\u0013\u0012\b\u0010\u008b\u0001\u001a\u00030\u0086\u0001¢\u0006\u0006\bñ\u0001\u0010ò\u0001J0\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0000JC\u0010\u000e\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u000f\u0018\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0017\u001a\u00020\nJ\u000f\u0010\u001a\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001b\u001a\u00020\u0007H&J\u0018\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0014J\u000f\u0010 \u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001f\u0010\u0019J1\u0010'\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u000e\b\u0004\u0010\r\u001a\b\u0012\u0004\u0012\u00020$0#H\u0084\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010&J\u0006\u0010(\u001a\u00020\u0007J@\u00102\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0019\u0010/\u001a\u0015\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b.H\u0014ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b0\u00101J>\u00104\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0019\u0010/\u001a\u0015\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b.ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b3\u00101J\u000e\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0006J\u0010\u00107\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0006H\u0016J\u0006\u00108\u001a\u00020\u0007J\u0011\u00109\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0006H\u0096\u0002J+\u0010;\u001a\u00020\u00072\u0019\u0010/\u001a\u0015\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b.2\b\b\u0002\u0010:\u001a\u00020\nJ;\u0010F\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\n2\u0006\u0010C\u001a\u00020\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bD\u0010EJ=\u0010H\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\n2\u0006\u0010C\u001a\u00020\nH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bG\u0010EJ\u0006\u0010J\u001a\u00020IJ\u001d\u0010N\u001a\u00020>2\u0006\u0010K\u001a\u00020>H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bL\u0010MJ\u001d\u0010Q\u001a\u00020>2\u0006\u0010O\u001a\u00020>H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bP\u0010MJ%\u0010V\u001a\u00020>2\u0006\u0010R\u001a\u00020\u00032\u0006\u0010S\u001a\u00020>H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bT\u0010UJ%\u0010[\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\u00032\u0006\u0010X\u001a\u00020WH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bY\u0010ZJ\u0018\u0010]\u001a\u00020I2\u0006\u0010R\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020\nH\u0016J\u001d\u0010_\u001a\u00020>2\u0006\u0010O\u001a\u00020>H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b^\u0010MJ(\u0010`\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0084\bø\u0001\u0000J\u001d\u0010b\u001a\u00020>2\u0006\u0010*\u001a\u00020>H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\ba\u0010MJ\u001d\u0010d\u001a\u00020>2\u0006\u0010*\u001a\u00020>H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bc\u0010MJ\u0018\u0010g\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00062\u0006\u0010f\u001a\u00020eH\u0004J\u0006\u0010h\u001a\u00020\u0007J\u0006\u0010i\u001a\u00020\u0007J)\u0010o\u001a\u00020\u00072\u0006\u0010k\u001a\u00020j2\u0006\u0010\\\u001a\u00020\n2\b\b\u0002\u0010l\u001a\u00020\nH\u0000¢\u0006\u0004\bm\u0010nJ\u001d\u0010r\u001a\u00020\n2\u0006\u0010?\u001a\u00020>H\u0004ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bp\u0010qJ\u001d\u0010t\u001a\u00020\n2\u0006\u0010?\u001a\u00020>H\u0004ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bs\u0010qJ\b\u0010u\u001a\u00020\u0007H\u0016J\u001b\u0010w\u001a\u00020\u00072\u0006\u0010v\u001a\u00020IH\u0096@ø\u0001\u0002¢\u0006\u0004\bw\u0010xJ\b\u0010y\u001a\u00020\u0007H\u0016J\u0017\u0010}\u001a\u00020\u00002\u0006\u0010z\u001a\u00020\u0000H\u0000¢\u0006\u0004\b{\u0010|J\u0006\u0010~\u001a\u00020\nJ \u0010\u0082\u0001\u001a\u00020\u007f2\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0004ø\u0001\u0001ø\u0001\u0002¢\u0006\u0005\b\u0081\u0001\u0010MJ)\u0010\u0085\u0001\u001a\u00020+2\u0006\u0010?\u001a\u00020>2\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0004ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001R \u0010\u008b\u0001\u001a\u00030\u0086\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R+\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R+\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u008d\u0001\u001a\u0006\b\u0094\u0001\u0010\u008f\u0001\"\u0006\b\u0095\u0001\u0010\u0091\u0001RO\u0010/\u001a\u0015\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b.2\u001a\u0010\u0097\u0001\u001a\u0015\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b.8\u0004@BX\u0084\u000e¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R:\u0010*\u001a\u00020)2\u0007\u0010\u0097\u0001\u001a\u00020)8\u0016@TX\u0096\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0003¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R1\u0010,\u001a\u00020+2\u0007\u0010\u0097\u0001\u001a\u00020+8\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010¬\u0001\u001a\u00020\n2\u0007\u0010\u0097\u0001\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R0\u0010²\u0001\u001a\u0005\u0018\u00010\u00ad\u00012\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R\u0017\u0010µ\u0001\u001a\u00020\f8&X¦\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R\u0018\u0010¹\u0001\u001a\u00030¶\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R\u0017\u0010»\u0001\u001a\u00020+8VX\u0096\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010¥\u0001R\u0017\u0010½\u0001\u001a\u00020+8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010¥\u0001R\u0019\u0010À\u0001\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0017\u0010Ã\u0001\u001a\u00020\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u001e\u0010Æ\u0001\u001a\u00030Ä\u00018Fø\u0001\u0002ø\u0001\u0001ø\u0001\u0003¢\u0006\b\u001a\u0006\bÅ\u0001\u0010\u009f\u0001R\u0018\u0010Ê\u0001\u001a\u00030Ç\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0019\u0010Ì\u0001\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010¿\u0001R\u0017\u0010Î\u0001\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010«\u0001R\u0017\u0010Ï\u0001\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010«\u0001R,\u0010Ö\u0001\u001a\u00030Ð\u00012\b\u0010Ñ\u0001\u001a\u00030Ð\u00018P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\bÒ\u0001\u0010Ó\u0001\"\u0006\bÔ\u0001\u0010Õ\u0001R0\u0010Ü\u0001\u001a\u0005\u0018\u00010×\u00012\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010×\u00018&@dX¦\u000e¢\u0006\u0010\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001R\u001f\u0010á\u0001\u001a\n\u0012\u0005\u0012\u00030Þ\u00010Ý\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bß\u0001\u0010à\u0001R\u001a\u0010å\u0001\u001a\u0005\u0018\u00010â\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bã\u0001\u0010ä\u0001R\u0016\u0010ç\u0001\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\bæ\u0001\u0010Â\u0001R\u0016\u0010é\u0001\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\bè\u0001\u0010Â\u0001R\u0017\u0010ì\u0001\u001a\u00020j8DX\u0084\u0004¢\u0006\b\u001a\u0006\bê\u0001\u0010ë\u0001R \u0010î\u0001\u001a\u00020!8@X\u0080\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0003¢\u0006\b\u001a\u0006\bí\u0001\u0010\u009f\u0001R\u0017\u0010ï\u0001\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010«\u0001R\u001d\u0010\u0080\u0001\u001a\u00020\u007f8Fø\u0001\u0002ø\u0001\u0001ø\u0001\u0003¢\u0006\b\u001a\u0006\bð\u0001\u0010\u009f\u0001\u0082\u0002\u0016\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006õ\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "", "mask", "", "includeTail", "Landroidx/compose/ui/Modifier$Node;", "block", "visitNodes", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/node/NodeKind;", "type", "visitNodes-aLcG6gQ", "(ILkotlin/jvm/functions/Function1;)V", "head-H91voCI", "(I)Landroidx/compose/ui/Modifier$Node;", HeadCommand.ID, "isTransparent", "replace$ui_release", "()V", "replace", "ensureLookaheadDelegateCreated", "width", "height", "onMeasureResultChanged", "onCoordinatesUsed$ui_release", "onCoordinatesUsed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/Placeable;", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "performingMeasure", "onMeasured", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "placeSelfApparentToRealOffset-f8xVGno", "placeSelfApparentToRealOffset", "canvas", "draw", "performDraw", "onPlaced", "invoke", "forceUpdateLayerParameters", "updateLayerBlock", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestSource", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "isTouchEvent", "isInLayer", "hitTest-YqVAtuI", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTest", "hitTestChild-YqVAtuI", "hitTestChild", "Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "relativeToWindow", "windowToLocal-MK-Hz9U", "(J)J", "windowToLocal", "relativeToLocal", "localToWindow-MK-Hz9U", "localToWindow", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFrom", "clipBounds", "localBoundingBoxOf", "localToRoot-MK-Hz9U", "localToRoot", "withPositionTranslation", "toParentPosition-MK-Hz9U", "toParentPosition", "fromParentPosition-MK-Hz9U", "fromParentPosition", "Landroidx/compose/ui/graphics/Paint;", "paint", "drawBorder", "onLayoutNodeAttach", "onRelease", "Landroidx/compose/ui/geometry/MutableRect;", "bounds", "clipToMinimumTouchTargetSize", "rectInParent$ui_release", "(Landroidx/compose/ui/geometry/MutableRect;ZZ)V", "rectInParent", "withinLayerBounds-k-4lQ0M", "(J)Z", "withinLayerBounds", "isPointerInBounds-k-4lQ0M", "isPointerInBounds", "invalidateLayer", "rect", "propagateRelocationRequest", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLayoutModifierNodeChanged", "other", "findCommonAncestor$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;", "findCommonAncestor", "shouldSharePointerInputWithSiblings", "Landroidx/compose/ui/geometry/Size;", "minimumTouchTargetSize", "calculateMinimumTouchTargetPadding-E7KxVPU", "calculateMinimumTouchTargetPadding", "distanceInMinimumTouchTarget-tz77jQw", "(JJ)F", "distanceInMinimumTouchTarget", "Landroidx/compose/ui/node/LayoutNode;", "w0", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "x0", "Landroidx/compose/ui/node/NodeCoordinator;", "getWrapped$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "setWrapped$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrapped", "y0", "getWrappedBy$ui_release", "setWrappedBy$ui_release", "wrappedBy", "<set-?>", "G0", "Lkotlin/jvm/functions/Function1;", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "M0", "J", "getPosition-nOcc-ac", "()J", "setPosition--gyyYBs", "(J)V", "N0", "F", "getZIndex", "()F", "setZIndex", "(F)V", "R0", "Z", "getLastLayerDrawingWasSkipped$ui_release", "()Z", "lastLayerDrawingWasSkipped", "Landroidx/compose/ui/node/OwnedLayer;", "S0", "Landroidx/compose/ui/node/OwnedLayer;", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "layer", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "tail", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "density", "getFontScale", "fontScale", "getParent", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "parent", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "getChild", "child", "getHasMeasureResult", "hasMeasureResult", "isAttached", "Landroidx/compose/ui/layout/MeasureResult;", "value", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "measureResult", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "lookaheadDelegate", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "", "getParentData", "()Ljava/lang/Object;", "parentData", "getParentLayoutCoordinates", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "rectCache", "getLastMeasurementConstraints-msEJaDk$ui_release", "lastMeasurementConstraints", "isValidOwnerScope", "getMinimumTouchTargetSize-NH-jbRc", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Companion", "HitTestSource", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 2 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 9 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 10 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 11 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 12 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,1351:1\n96#1,5:1352\n101#1,4:1400\n96#1,9:1404\n107#1:1415\n96#1,13:1416\n109#1:1472\n101#1,10:1473\n107#1:1545\n96#1,13:1546\n109#1:1602\n101#1,10:1603\n107#1:1618\n96#1,13:1619\n109#1:1675\n101#1,10:1676\n383#2,6:1357\n393#2,2:1364\n395#2,8:1369\n403#2,9:1380\n412#2,8:1392\n383#2,6:1429\n393#2,2:1436\n395#2,8:1441\n403#2,9:1452\n412#2,8:1464\n383#2,6:1490\n393#2,2:1497\n395#2,8:1502\n403#2,9:1513\n412#2,8:1525\n383#2,6:1559\n393#2,2:1566\n395#2,8:1571\n403#2,9:1582\n412#2,8:1594\n383#2,6:1632\n393#2,2:1639\n395#2,8:1644\n403#2,9:1655\n412#2,8:1667\n206#2:1688\n207#2,8:1690\n219#2:1700\n190#2:1701\n191#2,6:1703\n220#2:1709\n383#2,6:1710\n393#2,2:1717\n395#2,8:1722\n403#2,9:1733\n412#2,8:1745\n221#2:1753\n198#2,3:1754\n261#3:1363\n261#3:1435\n261#3:1488\n261#3:1496\n261#3:1565\n261#3:1638\n261#3:1716\n234#4,3:1366\n237#4,3:1389\n234#4,3:1438\n237#4,3:1461\n234#4,3:1499\n237#4,3:1522\n234#4,3:1568\n237#4,3:1591\n234#4,3:1641\n237#4,3:1664\n234#4,3:1719\n237#4,3:1742\n1182#5:1377\n1161#5,2:1378\n1182#5:1449\n1161#5,2:1450\n1182#5:1510\n1161#5,2:1511\n1182#5:1579\n1161#5,2:1580\n1182#5:1652\n1161#5,2:1653\n1182#5:1730\n1161#5,2:1731\n1#6:1413\n1#6:1689\n1#6:1702\n74#7:1414\n82#7:1483\n82#7:1487\n82#7:1489\n84#7:1536\n84#7:1544\n74#7:1616\n84#7:1617\n72#7:1686\n72#7:1687\n78#7:1698\n78#7:1699\n754#8,3:1484\n757#8,3:1533\n495#9,4:1537\n500#9:1614\n129#10,3:1541\n133#10:1613\n86#11:1615\n66#12,5:1757\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n107#1:1352,5\n107#1:1400,4\n117#1:1404,9\n215#1:1415\n215#1:1416,13\n215#1:1472\n215#1:1473,10\n294#1:1545\n294#1:1546,13\n294#1:1602\n294#1:1603,10\n374#1:1618\n374#1:1619,13\n374#1:1675\n374#1:1676,10\n108#1:1357,6\n108#1:1364,2\n108#1:1369,8\n108#1:1380,9\n108#1:1392,8\n215#1:1429,6\n215#1:1436,2\n215#1:1441,8\n215#1:1452,9\n215#1:1464,8\n239#1:1490,6\n239#1:1497,2\n239#1:1502,8\n239#1:1513,9\n239#1:1525,8\n294#1:1559,6\n294#1:1566,2\n294#1:1571,8\n294#1:1582,9\n294#1:1594,8\n374#1:1632,6\n374#1:1639,2\n374#1:1644,8\n374#1:1655,9\n374#1:1667,8\n1067#1:1688\n1067#1:1690,8\n1100#1:1700\n1100#1:1701\n1100#1:1703,6\n1100#1:1709\n1100#1:1710,6\n1100#1:1717,2\n1100#1:1722,8\n1100#1:1733,9\n1100#1:1745,8\n1100#1:1753\n1100#1:1754,3\n108#1:1363\n215#1:1435\n238#1:1488\n239#1:1496\n294#1:1565\n374#1:1638\n1100#1:1716\n108#1:1366,3\n108#1:1389,3\n215#1:1438,3\n215#1:1461,3\n239#1:1499,3\n239#1:1522,3\n294#1:1568,3\n294#1:1591,3\n374#1:1641,3\n374#1:1664,3\n1100#1:1719,3\n1100#1:1742,3\n108#1:1377\n108#1:1378,2\n215#1:1449\n215#1:1450,2\n239#1:1510\n239#1:1511,2\n294#1:1579\n294#1:1580,2\n374#1:1652\n374#1:1653,2\n1100#1:1730\n1100#1:1731,2\n1067#1:1689\n1100#1:1702\n215#1:1414\n231#1:1483\n238#1:1487\n239#1:1489\n292#1:1536\n294#1:1544\n360#1:1616\n374#1:1617\n667#1:1686\n1067#1:1687\n1099#1:1698\n1100#1:1699\n237#1:1484,3\n237#1:1533,3\n293#1:1537,4\n293#1:1614\n293#1:1541,3\n293#1:1613\n340#1:1615\n1142#1:1757,5\n*E\n"})
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope, Function1<Canvas, Unit> {

    @NotNull
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";

    @NotNull
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    public boolean E0;
    public boolean F0;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    @Nullable
    public Function1<? super GraphicsLayerScope, Unit> layerBlock;

    @NotNull
    public Density H0;

    @NotNull
    public LayoutDirection I0;
    public float J0;

    @Nullable
    public MeasureResult K0;

    @Nullable
    public LinkedHashMap L0;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public long position;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public float zIndex;

    @Nullable
    public MutableRect O0;

    @Nullable
    public h P0;

    @NotNull
    public final c Q0;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public boolean lastLayerDrawingWasSkipped;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    @Nullable
    public OwnedLayer layer;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LayoutNode layoutNode;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public NodeCoordinator wrapped;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public NodeCoordinator wrappedBy;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final b T0 = b.f16899p0;

    @NotNull
    public static final a U0 = a.f16898p0;

    @NotNull
    public static final ReusableGraphicsLayerScope V0 = new ReusableGraphicsLayerScope();

    @NotNull
    public static final h W0 = new h();

    @NotNull
    public static final float[] X0 = Matrix.m2700constructorimpl$default(null, 1, null);

    @NotNull
    public static final NodeCoordinator$Companion$PointerInputSource$1 Y0 = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: childHitTest-YqVAtuI, reason: not valid java name */
        public void mo3721childHitTestYqVAtuI(@NotNull LayoutNode layoutNode, long pointerPosition, @NotNull HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
            layoutNode.m3668hitTestM_7yMNQ$ui_release(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: entityType-OLwlOKw, reason: not valid java name */
        public int mo3722entityTypeOLwlOKw() {
            return NodeKind.m3725constructorimpl(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v7 */
        /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
            java.lang.NullPointerException
            */
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier.Node r10) {
            /*
                r9 = this;
                java.lang.String r0 = "node"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                r0 = 16
                int r1 = androidx.compose.ui.node.NodeKind.m3725constructorimpl(r0)
                r2 = 0
                r3 = r2
            Ld:
                r4 = 0
                if (r10 == 0) goto L5f
                boolean r5 = r10 instanceof androidx.compose.ui.node.PointerInputModifierNode
                r6 = 1
                if (r5 == 0) goto L1e
                androidx.compose.ui.node.PointerInputModifierNode r10 = (androidx.compose.ui.node.PointerInputModifierNode) r10
                boolean r10 = r10.interceptOutOfBoundsChildEvents()
                if (r10 == 0) goto L5a
                return r6
            L1e:
                int r5 = r10.getKindSet()
                r5 = r5 & r1
                if (r5 == 0) goto L5a
                boolean r5 = r10 instanceof androidx.compose.ui.node.DelegatingNode
                if (r5 == 0) goto L5a
                r5 = r10
                androidx.compose.ui.node.DelegatingNode r5 = (androidx.compose.ui.node.DelegatingNode) r5
                androidx.compose.ui.Modifier$Node r5 = r5.getDelegate()
                r7 = r4
            L31:
                if (r5 == 0) goto L57
                int r8 = r5.getKindSet()
                r8 = r8 & r1
                if (r8 == 0) goto L52
                int r7 = r7 + 1
                if (r7 != r6) goto L40
                r10 = r5
                goto L52
            L40:
                if (r3 != 0) goto L49
                androidx.compose.runtime.collection.MutableVector r3 = new androidx.compose.runtime.collection.MutableVector
                androidx.compose.ui.Modifier$Node[] r8 = new androidx.compose.ui.Modifier.Node[r0]
                r3.<init>(r8, r4)
            L49:
                if (r10 == 0) goto L4f
                r3.add(r10)
                r10 = r2
            L4f:
                r3.add(r5)
            L52:
                androidx.compose.ui.Modifier$Node r5 = r5.getChild()
                goto L31
            L57:
                if (r7 != r6) goto L5a
                goto Ld
            L5a:
                androidx.compose.ui.Modifier$Node r10 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r3)
                goto Ld
            L5f:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1.interceptOutOfBoundsChildEvents(androidx.compose.ui.Modifier$Node):boolean");
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(@NotNull LayoutNode parentLayoutNode) {
            Intrinsics.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
            return true;
        }
    };

    @NotNull
    public static final NodeCoordinator$Companion$SemanticsSource$1 Z0 = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: childHitTest-YqVAtuI */
        public void mo3721childHitTestYqVAtuI(@NotNull LayoutNode layoutNode, long pointerPosition, @NotNull HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
            layoutNode.m3669hitTestSemanticsM_7yMNQ$ui_release(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: entityType-OLwlOKw */
        public int mo3722entityTypeOLwlOKw() {
            return NodeKind.m3725constructorimpl(8);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(@NotNull Modifier.Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(@NotNull LayoutNode parentLayoutNode) {
            Intrinsics.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
            SemanticsConfiguration collapsedSemantics$ui_release = parentLayoutNode.getCollapsedSemantics$ui_release();
            boolean z10 = false;
            if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.getIsClearingSemantics()) {
                z10 = true;
            }
            return !z10;
        }
    };

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$Companion;", "", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "getPointerInputSource", "()Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "SemanticsSource", "getSemanticsSource", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "onCommitAffectingLayer", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLayerParams", "Li1/h;", "tmpLayerPositionalProperties", "Li1/h;", "Landroidx/compose/ui/graphics/Matrix;", "tmpMatrix", "[F", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.Y0;
        }

        @NotNull
        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.Z0;
        }
    }

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J=\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H&ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0005H&ø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "", "childHitTest", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "", "isInLayer", "childHitTest-YqVAtuI", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "entityType", "Landroidx/compose/ui/node/NodeKind;", "entityType-OLwlOKw", "()I", "interceptOutOfBoundsChildEvents", "node", "Landroidx/compose/ui/Modifier$Node;", "shouldHitTestChildren", "parentLayoutNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface HitTestSource {
        /* JADX INFO: renamed from: childHitTest-YqVAtuI */
        void mo3721childHitTestYqVAtuI(@NotNull LayoutNode layoutNode, long pointerPosition, @NotNull HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer);

        /* JADX INFO: renamed from: entityType-OLwlOKw */
        int mo3722entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(@NotNull Modifier.Node node);

        boolean shouldHitTestChildren(@NotNull LayoutNode parentLayoutNode);
    }

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    public static final class a extends Lambda implements Function1<NodeCoordinator, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f16898p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NodeCoordinator nodeCoordinator) {
            NodeCoordinator coordinator = nodeCoordinator;
            Intrinsics.checkNotNullParameter(coordinator, "coordinator");
            OwnedLayer layer = coordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    public static final class b extends Lambda implements Function1<NodeCoordinator, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f16899p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NodeCoordinator nodeCoordinator) {
            NodeCoordinator coordinator = nodeCoordinator;
            Intrinsics.checkNotNullParameter(coordinator, "coordinator");
            if (coordinator.isValidOwnerScope()) {
                h other = coordinator.P0;
                if (other == null) {
                    coordinator.i(true);
                } else {
                    h hVar = NodeCoordinator.W0;
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(other, "other");
                    hVar.f69483a = other.f69483a;
                    hVar.f69484b = other.f69484b;
                    hVar.f69485c = other.f69485c;
                    hVar.f69486d = other.f69486d;
                    hVar.f69487e = other.f69487e;
                    hVar.f69488f = other.f69488f;
                    hVar.f69489g = other.f69489g;
                    hVar.f69490h = other.f69490h;
                    hVar.f69491i = other.f69491i;
                    coordinator.i(true);
                    h hVar2 = NodeCoordinator.W0;
                    hVar2.getClass();
                    Intrinsics.checkNotNullParameter(other, "other");
                    if (hVar2.f69483a != other.f69483a || hVar2.f69484b != other.f69484b || hVar2.f69485c != other.f69485c || hVar2.f69486d != other.f69486d || hVar2.f69487e != other.f69487e || hVar2.f69488f != other.f69488f || hVar2.f69489g != other.f69489g || hVar2.f69490h != other.f69490h || !TransformOrigin.m2839equalsimpl0(hVar2.f69491i, other.f69491i)) {
                        LayoutNode layoutNode = coordinator.getLayoutNode();
                        LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                        if (layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                            if (layoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                                LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                            }
                            layoutDelegate.getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
                        }
                        Owner owner = layoutNode.getOwner();
                        if (owner != null) {
                            owner.requestOnPositionedCallback(layoutNode);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            NodeCoordinator wrappedBy = NodeCoordinator.this.getWrappedBy();
            if (wrappedBy != null) {
                wrappedBy.invalidateLayer();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    public static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Canvas f16902q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Canvas canvas) {
            super(0);
            this.f16902q0 = canvas;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            NodeCoordinator.access$drawContainedDrawModifiers(NodeCoordinator.this, this.f16902q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    @SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$speculativeHit$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1351:1\n72#2:1352\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$speculativeHit$1\n*L\n657#1:1352\n*E\n"})
    public static final class e extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier.Node f16904q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ HitTestSource f16905r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f16906s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ HitTestResult f16907t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f16908u0;
        public final /* synthetic */ boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ float f16909w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Modifier.Node node, HitTestSource hitTestSource, long j10, HitTestResult hitTestResult, boolean z10, boolean z11, float f6) {
            super(0);
            this.f16904q0 = node;
            this.f16905r0 = hitTestSource;
            this.f16906s0 = j10;
            this.f16907t0 = hitTestResult;
            this.f16908u0 = z10;
            this.v0 = z11;
            this.f16909w0 = f6;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            NodeCoordinator.this.f(NodeCoordinatorKt.m3723access$nextUntilhw7D004(this.f16904q0, this.f16905r0.mo3722entityTypeOLwlOKw(), NodeKind.m3725constructorimpl(2)), this.f16905r0, this.f16906s0, this.f16907t0, this.f16908u0, this.v0, this.f16909w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    public static final class f extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<GraphicsLayerScope, Unit> f16910p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super GraphicsLayerScope, Unit> function1) {
            super(0);
            this.f16910p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f16910p0.invoke(NodeCoordinator.V0);
            return Unit.INSTANCE;
        }
    }

    public NodeCoordinator(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        this.H0 = getLayoutNode().getDensity();
        this.I0 = getLayoutNode().getLayoutDirection();
        this.J0 = 0.8f;
        this.position = IntOffset.INSTANCE.m4517getZeronOccac();
        this.Q0 = new c();
    }

    public static final void access$drawContainedDrawModifiers(NodeCoordinator nodeCoordinator, Canvas canvas) {
        nodeCoordinator.getClass();
        Modifier.Node nodeM3712headH91voCI = nodeCoordinator.m3712headH91voCI(NodeKind.m3725constructorimpl(4));
        if (nodeM3712headH91voCI == null) {
            nodeCoordinator.performDraw(canvas);
        } else {
            nodeCoordinator.getLayoutNode().getMDrawScope$ui_release().m3678drawx_KDEd0$ui_release(canvas, IntSizeKt.m4559toSizeozmzZPI(nodeCoordinator.mo3581getSizeYbymL2g()), nodeCoordinator, nodeM3712headH91voCI);
        }
    }

    /* JADX INFO: renamed from: access$hit-1hIXUjU, reason: not valid java name */
    public static final void m3703access$hit1hIXUjU(NodeCoordinator nodeCoordinator, Modifier.Node node, HitTestSource hitTestSource, long j10, HitTestResult hitTestResult, boolean z10, boolean z11) {
        if (node == null) {
            nodeCoordinator.mo3663hitTestChildYqVAtuI(hitTestSource, j10, hitTestResult, z10, z11);
        } else {
            nodeCoordinator.getClass();
            hitTestResult.hit(node, z11, new androidx.compose.ui.node.f(nodeCoordinator, node, hitTestSource, j10, hitTestResult, z10, z11));
        }
    }

    /* JADX INFO: renamed from: access$hitNear-JHbHoSQ, reason: not valid java name */
    public static final void m3704access$hitNearJHbHoSQ(NodeCoordinator nodeCoordinator, Modifier.Node node, HitTestSource hitTestSource, long j10, HitTestResult hitTestResult, boolean z10, boolean z11, float f6) {
        if (node == null) {
            nodeCoordinator.mo3663hitTestChildYqVAtuI(hitTestSource, j10, hitTestResult, z10, z11);
        } else {
            nodeCoordinator.getClass();
            hitTestResult.hitInMinimumTouchTarget(node, f6, z11, new g(nodeCoordinator, node, hitTestSource, j10, hitTestResult, z10, z11, f6));
        }
    }

    public static NodeCoordinator g(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator coordinator;
        LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinatesImpl = layoutCoordinates instanceof LookaheadLayoutCoordinatesImpl ? (LookaheadLayoutCoordinatesImpl) layoutCoordinates : null;
        if (lookaheadLayoutCoordinatesImpl != null && (coordinator = lookaheadLayoutCoordinatesImpl.getCoordinator()) != null) {
            return coordinator;
        }
        Intrinsics.checkNotNull(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    public static /* synthetic */ void rectInParent$ui_release$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        nodeCoordinator.rectInParent$ui_release(mutableRect, z10, z11);
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, Function1 function1, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        nodeCoordinator.updateLayerBlock(function1, z10);
    }

    public final void b(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z10) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.b(nodeCoordinator, mutableRect, z10);
        }
        float fM4507getXimpl = IntOffset.m4507getXimpl(getPosition());
        mutableRect.setLeft(mutableRect.getCom.dasnano.vdphotoselfiecapture.api.model.Parameters.DIRECTION.LEFT java.lang.String() - fM4507getXimpl);
        mutableRect.setRight(mutableRect.getCom.dasnano.vdphotoselfiecapture.api.model.Parameters.DIRECTION.RIGHT java.lang.String() - fM4507getXimpl);
        float fM4508getYimpl = IntOffset.m4508getYimpl(getPosition());
        mutableRect.setTop(mutableRect.getTop() - fM4508getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() - fM4508getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(mutableRect, true);
            if (this.F0 && z10) {
                mutableRect.intersect(0.0f, 0.0f, IntSize.m4549getWidthimpl(mo3581getSizeYbymL2g()), IntSize.m4548getHeightimpl(mo3581getSizeYbymL2g()));
                mutableRect.isEmpty();
            }
        }
    }

    public final long c(NodeCoordinator nodeCoordinator, long j10) {
        if (nodeCoordinator == this) {
            return j10;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        return (nodeCoordinator2 == null || Intrinsics.areEqual(nodeCoordinator, nodeCoordinator2)) ? m3709fromParentPositionMKHz9U(j10) : m3709fromParentPositionMKHz9U(nodeCoordinator2.c(nodeCoordinator, j10));
    }

    /* JADX INFO: renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    public final long m3707calculateMinimumTouchTargetPaddingE7KxVPU(long minimumTouchTargetSize) {
        return SizeKt.Size(Math.max(0.0f, (Size.m2344getWidthimpl(minimumTouchTargetSize) - getMeasuredWidth()) / 2.0f), Math.max(0.0f, (Size.m2341getHeightimpl(minimumTouchTargetSize) - getMeasuredHeight()) / 2.0f));
    }

    public final Modifier.Node d(boolean z10) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (z10) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null && (tail = nodeCoordinator.getTail()) != null) {
                return tail.getChild();
            }
        } else {
            NodeCoordinator nodeCoordinator2 = this.wrappedBy;
            if (nodeCoordinator2 != null) {
                return nodeCoordinator2.getTail();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    public final float m3708distanceInMinimumTouchTargettz77jQw(long pointerPosition, long minimumTouchTargetSize) {
        if (getMeasuredWidth() >= Size.m2344getWidthimpl(minimumTouchTargetSize) && getMeasuredHeight() >= Size.m2341getHeightimpl(minimumTouchTargetSize)) {
            return Float.POSITIVE_INFINITY;
        }
        long jM3707calculateMinimumTouchTargetPaddingE7KxVPU = m3707calculateMinimumTouchTargetPaddingE7KxVPU(minimumTouchTargetSize);
        float fM2344getWidthimpl = Size.m2344getWidthimpl(jM3707calculateMinimumTouchTargetPaddingE7KxVPU);
        float fM2341getHeightimpl = Size.m2341getHeightimpl(jM3707calculateMinimumTouchTargetPaddingE7KxVPU);
        float fM2275getXimpl = Offset.m2275getXimpl(pointerPosition);
        float fMax = Math.max(0.0f, fM2275getXimpl < 0.0f ? -fM2275getXimpl : fM2275getXimpl - getMeasuredWidth());
        float fM2276getYimpl = Offset.m2276getYimpl(pointerPosition);
        long jOffset = OffsetKt.Offset(fMax, Math.max(0.0f, fM2276getYimpl < 0.0f ? -fM2276getYimpl : fM2276getYimpl - getMeasuredHeight()));
        if ((fM2344getWidthimpl > 0.0f || fM2341getHeightimpl > 0.0f) && Offset.m2275getXimpl(jOffset) <= fM2344getWidthimpl && Offset.m2276getYimpl(jOffset) <= fM2341getHeightimpl) {
            return Offset.m2274getDistanceSquaredimpl(jOffset);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas);
            return;
        }
        float fM4507getXimpl = IntOffset.m4507getXimpl(getPosition());
        float fM4508getYimpl = IntOffset.m4508getYimpl(getPosition());
        canvas.translate(fM4507getXimpl, fM4508getYimpl);
        Modifier.Node nodeM3712headH91voCI = m3712headH91voCI(NodeKind.m3725constructorimpl(4));
        if (nodeM3712headH91voCI == null) {
            performDraw(canvas);
        } else {
            getLayoutNode().getMDrawScope$ui_release().m3678drawx_KDEd0$ui_release(canvas, IntSizeKt.m4559toSizeozmzZPI(mo3581getSizeYbymL2g()), this, nodeM3712headH91voCI);
        }
        canvas.translate(-fM4507getXimpl, -fM4508getYimpl);
    }

    public final void drawBorder(@NotNull Canvas canvas, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawRect(new Rect(0.5f, 0.5f, IntSize.m4549getWidthimpl(getMeasuredSize()) - 0.5f, IntSize.m4548getHeightimpl(getMeasuredSize()) - 0.5f), paint);
    }

    public final void e(long j10, float f6, Function1<? super GraphicsLayerScope, Unit> function1) {
        updateLayerBlock$default(this, function1, false, 2, null);
        if (!IntOffset.m4506equalsimpl0(getPosition(), j10)) {
            m3717setPositiongyyYBs(j10);
            getLayoutNode().getLayoutDelegate().getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo3773movegyyYBs(j10);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner = getLayoutNode().getOwner();
            if (owner != null) {
                owner.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = f6;
    }

    public abstract void ensureLookaheadDelegateCreated();

    public final void f(Modifier.Node node, HitTestSource hitTestSource, long j10, HitTestResult hitTestResult, boolean z10, boolean z11, float f6) {
        if (node == null) {
            mo3663hitTestChildYqVAtuI(hitTestSource, j10, hitTestResult, z10, z11);
        } else if (hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            hitTestResult.speculativeHit(node, f6, z11, new e(node, hitTestSource, j10, hitTestResult, z10, z11, f6));
        } else {
            f(NodeCoordinatorKt.m3723access$nextUntilhw7D004(node, hitTestSource.mo3722entityTypeOLwlOKw(), NodeKind.m3725constructorimpl(2)), hitTestSource, j10, hitTestResult, z10, z11, f6);
        }
    }

    @NotNull
    public final NodeCoordinator findCommonAncestor$ui_release(@NotNull NodeCoordinator other) {
        Intrinsics.checkNotNullParameter(other, "other");
        LayoutNode layoutNode = other.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = other.getTail();
            Modifier.Node tail2 = getTail();
            int iM3725constructorimpl = NodeKind.m3725constructorimpl(2);
            if (!tail2.getNode().getIsAttached()) {
                throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
            }
            for (Modifier.Node parent = tail2.getNode().getParent(); parent != null; parent = parent.getParent()) {
                if ((parent.getKindSet() & iM3725constructorimpl) != 0 && parent == tail) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode);
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode2 == getLayoutNode()) {
            return this;
        }
        return layoutNode == other.getLayoutNode() ? other : layoutNode.getInnerCoordinator$ui_release();
    }

    /* JADX INFO: renamed from: fromParentPosition-MK-Hz9U, reason: not valid java name */
    public long m3709fromParentPositionMKHz9U(long position) {
        long jM4519minusNvtHpc = IntOffsetKt.m4519minusNvtHpc(position, getPosition());
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo3772mapOffset8S9VItk(jM4519minusNvtHpc, true) : jM4519minusNvtHpc;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate().getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this.K0 != null;
    }

    /* JADX INFO: renamed from: getLastLayerDrawingWasSkipped$ui_release, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    /* JADX INFO: renamed from: getLastMeasurementConstraints-msEJaDk$ui_release, reason: not valid java name */
    public final long m3710getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return getMeasurementConstraints();
    }

    @Nullable
    public final OwnedLayer getLayer() {
        return this.layer;
    }

    @Nullable
    public final Function1<GraphicsLayerScope, Unit> getLayerBlock() {
        return this.layerBlock;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    @NotNull
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Nullable
    public abstract LookaheadDelegate getLookaheadDelegate();

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this.K0;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError.toString());
    }

    /* JADX INFO: renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m3711getMinimumTouchTargetSizeNHjbRc() {
        return this.H0.mo408toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo3672getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @Nullable
    public final LayoutCoordinates getParentCoordinates() {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        onCoordinatesUsed$ui_release();
        return this.wrappedBy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        if (!getLayoutNode().getNodes().m3698hasH91voCI$ui_release(NodeKind.m3725constructorimpl(64))) {
            return null;
        }
        getTail();
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        for (Modifier.Node tail$ui_release = getLayoutNode().getNodes().getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent()) {
            if ((NodeKind.m3725constructorimpl(64) & tail$ui_release.getKindSet()) != 0) {
                int iM3725constructorimpl = NodeKind.m3725constructorimpl(64);
                MutableVector mutableVector = null;
                Modifier.Node nodeAccess$pop = tail$ui_release;
                while (nodeAccess$pop != 0) {
                    if (nodeAccess$pop instanceof ParentDataModifierNode) {
                        objectRef.element = ((ParentDataModifierNode) nodeAccess$pop).modifyParentData(getLayoutNode().getDensity(), objectRef.element);
                    } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release = ((DelegatingNode) nodeAccess$pop).getDelegate();
                        int i10 = 0;
                        nodeAccess$pop = nodeAccess$pop;
                        while (delegate$ui_release != null) {
                            if ((delegate$ui_release.getKindSet() & iM3725constructorimpl) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    nodeAccess$pop = delegate$ui_release;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (nodeAccess$pop != 0) {
                                        mutableVector.add(nodeAccess$pop);
                                        nodeAccess$pop = 0;
                                    }
                                    mutableVector.add(delegate$ui_release);
                                }
                            }
                            delegate$ui_release = delegate$ui_release.getChild();
                            nodeAccess$pop = nodeAccess$pop;
                        }
                        if (i10 == 1) {
                        }
                    }
                    nodeAccess$pop = DelegatableNodeKt.access$pop(mutableVector);
                }
            }
        }
        return objectRef.element;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @Nullable
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        onCoordinatesUsed$ui_release();
        return getLayoutNode().getOuterCoordinator$ui_release().wrappedBy;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: getPosition-nOcc-ac, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        LinkedHashSet linkedHashSet = null;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrapped) {
            MeasureResult measureResult = nodeCoordinator.K0;
            Map<AlignmentLine, Integer> alignmentLines = measureResult != null ? measureResult.getAlignmentLines() : null;
            if (alignmentLines != null && (!alignmentLines.isEmpty())) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(alignmentLines.keySet());
            }
        }
        return linkedHashSet == null ? w.emptySet() : linkedHashSet;
    }

    @NotNull
    public final MutableRect getRectCache() {
        MutableRect mutableRect = this.O0;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this.O0 = mutableRect2;
        return mutableRect2;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public final long mo3581getSizeYbymL2g() {
        return getMeasuredSize();
    }

    @NotNull
    public abstract Modifier.Node getTail();

    @Nullable
    /* JADX INFO: renamed from: getWrapped$ui_release, reason: from getter */
    public final NodeCoordinator getWrapped() {
        return this.wrapped;
    }

    @Nullable
    /* JADX INFO: renamed from: getWrappedBy$ui_release, reason: from getter */
    public final NodeCoordinator getWrappedBy() {
        return this.wrappedBy;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    public final void h(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (Intrinsics.areEqual(nodeCoordinator, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        Intrinsics.checkNotNull(nodeCoordinator2);
        nodeCoordinator2.h(nodeCoordinator, fArr);
        if (!IntOffset.m4506equalsimpl0(getPosition(), IntOffset.INSTANCE.m4517getZeronOccac())) {
            float[] fArr2 = X0;
            Matrix.m2709resetimpl(fArr2);
            Matrix.m2720translateimpl$default(fArr2, -IntOffset.m4507getXimpl(getPosition()), -IntOffset.m4508getYimpl(getPosition()), 0.0f, 4, null);
            Matrix.m2717timesAssign58bKbWc(fArr, fArr2);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo3770inverseTransform58bKbWc(fArr);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: head-H91voCI, reason: not valid java name */
    public final Modifier.Node m3712headH91voCI(int type) {
        boolean zM3734getIncludeSelfInTraversalH91voCI = NodeKindKt.m3734getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node tail = getTail();
        if (!zM3734getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return null;
        }
        for (Modifier.Node nodeD = d(zM3734getIncludeSelfInTraversalH91voCI); nodeD != null && (nodeD.getAggregateChildKindSet() & type) != 0; nodeD = nodeD.getChild()) {
            if ((nodeD.getKindSet() & type) != 0) {
                return nodeD;
            }
            if (nodeD == tail) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: hitTest-YqVAtuI, reason: not valid java name */
    public final void m3713hitTestYqVAtuI(@NotNull HitTestSource hitTestSource, long pointerPosition, @NotNull HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        Modifier.Node nodeM3712headH91voCI = m3712headH91voCI(hitTestSource.mo3722entityTypeOLwlOKw());
        if (!m3720withinLayerBoundsk4lQ0M(pointerPosition)) {
            if (isTouchEvent) {
                float fM3708distanceInMinimumTouchTargettz77jQw = m3708distanceInMinimumTouchTargettz77jQw(pointerPosition, m3711getMinimumTouchTargetSizeNHjbRc());
                if (Float.isInfinite(fM3708distanceInMinimumTouchTargettz77jQw) || Float.isNaN(fM3708distanceInMinimumTouchTargettz77jQw) || !hitTestResult.isHitInMinimumTouchTargetBetter(fM3708distanceInMinimumTouchTargettz77jQw, false)) {
                    return;
                }
                if (nodeM3712headH91voCI == null) {
                    mo3663hitTestChildYqVAtuI(hitTestSource, pointerPosition, hitTestResult, isTouchEvent, false);
                    return;
                } else {
                    hitTestResult.hitInMinimumTouchTarget(nodeM3712headH91voCI, fM3708distanceInMinimumTouchTargettz77jQw, false, new g(this, nodeM3712headH91voCI, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, false, fM3708distanceInMinimumTouchTargettz77jQw));
                    return;
                }
            }
            return;
        }
        if (nodeM3712headH91voCI == null) {
            mo3663hitTestChildYqVAtuI(hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        if (m3714isPointerInBoundsk4lQ0M(pointerPosition)) {
            hitTestResult.hit(nodeM3712headH91voCI, isInLayer, new androidx.compose.ui.node.f(this, nodeM3712headH91voCI, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer));
            return;
        }
        float fM3708distanceInMinimumTouchTargettz77jQw2 = !isTouchEvent ? Float.POSITIVE_INFINITY : m3708distanceInMinimumTouchTargettz77jQw(pointerPosition, m3711getMinimumTouchTargetSizeNHjbRc());
        if (Float.isInfinite(fM3708distanceInMinimumTouchTargettz77jQw2) || Float.isNaN(fM3708distanceInMinimumTouchTargettz77jQw2) || !hitTestResult.isHitInMinimumTouchTargetBetter(fM3708distanceInMinimumTouchTargettz77jQw2, isInLayer)) {
            f(nodeM3712headH91voCI, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fM3708distanceInMinimumTouchTargettz77jQw2);
        } else {
            hitTestResult.hitInMinimumTouchTarget(nodeM3712headH91voCI, fM3708distanceInMinimumTouchTargettz77jQw2, isInLayer, new g(this, nodeM3712headH91voCI, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fM3708distanceInMinimumTouchTargettz77jQw2));
        }
    }

    /* JADX INFO: renamed from: hitTestChild-YqVAtuI */
    public void mo3663hitTestChildYqVAtuI(@NotNull HitTestSource hitTestSource, long pointerPosition, @NotNull HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m3713hitTestYqVAtuI(hitTestSource, nodeCoordinator.m3709fromParentPositionMKHz9U(pointerPosition), hitTestResult, isTouchEvent, isInLayer);
        }
    }

    public final void i(boolean z10) {
        Owner owner;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer == null) {
            if (this.layerBlock != null) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            return;
        }
        Function1<? super GraphicsLayerScope, Unit> function1 = this.layerBlock;
        if (function1 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        ReusableGraphicsLayerScope scope = V0;
        scope.reset();
        scope.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
        scope.m2775setSizeuvyYCjk(IntSizeKt.m4559toSizeozmzZPI(mo3581getSizeYbymL2g()));
        LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver().observeReads$ui_release(this, T0, new f(function1));
        h hVar = this.P0;
        if (hVar == null) {
            hVar = new h();
            this.P0 = hVar;
        }
        Intrinsics.checkNotNullParameter(scope, "scope");
        hVar.f69483a = scope.getScaleX();
        hVar.f69484b = scope.getScaleY();
        hVar.f69485c = scope.getTranslationX();
        hVar.f69486d = scope.getTranslationY();
        hVar.f69487e = scope.getRotationX();
        hVar.f69488f = scope.getRotationY();
        hVar.f69489g = scope.getRotationZ();
        hVar.f69490h = scope.getCameraDistance();
        hVar.f69491i = scope.getTransformOrigin();
        ownedLayer.mo3776updateLayerPropertiesdDxrwY(scope.getScaleX(), scope.getScaleY(), scope.getAlpha(), scope.getTranslationX(), scope.getTranslationY(), scope.getShadowElevation(), scope.getRotationX(), scope.getRotationY(), scope.getRotationZ(), scope.getCameraDistance(), scope.getTransformOrigin(), scope.getShape(), scope.getClip(), scope.getRenderEffect(), scope.getAmbientShadowColor(), scope.getSpotShadowColor(), scope.getCompositingStrategy(), getLayoutNode().getLayoutDirection(), getLayoutNode().getDensity());
        this.F0 = scope.getClip();
        this.J0 = scope.getAlpha();
        if (!z10 || (owner = getLayoutNode().getOwner()) == null) {
            return;
        }
        owner.onLayoutChange(getLayoutNode());
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas) {
        invoke2(canvas);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return !this.E0 && getLayoutNode().isAttached();
    }

    /* JADX INFO: renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m3714isPointerInBoundsk4lQ0M(long pointerPosition) {
        float fM2275getXimpl = Offset.m2275getXimpl(pointerPosition);
        float fM2276getYimpl = Offset.m2276getYimpl(pointerPosition);
        return fM2275getXimpl >= 0.0f && fM2276getYimpl >= 0.0f && fM2275getXimpl < ((float) getMeasuredWidth()) && fM2276getYimpl < ((float) getMeasuredHeight());
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.J0 <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.layer != null && isAttached();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Rect localBoundingBoxOf(@NotNull LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        if (!sourceCoordinates.isAttached()) {
            throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        NodeCoordinator nodeCoordinatorG = g(sourceCoordinates);
        nodeCoordinatorG.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(nodeCoordinatorG);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight(IntSize.m4549getWidthimpl(sourceCoordinates.mo3581getSizeYbymL2g()));
        rectCache.setBottom(IntSize.m4548getHeightimpl(sourceCoordinates.mo3581getSizeYbymL2g()));
        while (nodeCoordinatorG != nodeCoordinatorFindCommonAncestor$ui_release) {
            rectInParent$ui_release$default(nodeCoordinatorG, rectCache, clipBounds, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            nodeCoordinatorG = nodeCoordinatorG.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinatorG);
        }
        b(nodeCoordinatorFindCommonAncestor$ui_release, rectCache, clipBounds);
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    public long mo3582localPositionOfR5De75A(@NotNull LayoutCoordinates sourceCoordinates, long relativeToSource) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (sourceCoordinates instanceof LookaheadLayoutCoordinatesImpl) {
            return Offset.m2284unaryMinusF1C5BW0(sourceCoordinates.mo3582localPositionOfR5De75A(this, Offset.m2284unaryMinusF1C5BW0(relativeToSource)));
        }
        NodeCoordinator nodeCoordinatorG = g(sourceCoordinates);
        nodeCoordinatorG.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(nodeCoordinatorG);
        while (nodeCoordinatorG != nodeCoordinatorFindCommonAncestor$ui_release) {
            relativeToSource = nodeCoordinatorG.m3718toParentPositionMKHz9U(relativeToSource);
            nodeCoordinatorG = nodeCoordinatorG.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinatorG);
        }
        return c(nodeCoordinatorFindCommonAncestor$ui_release, relativeToSource);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    public long mo3583localToRootMKHz9U(long relativeToLocal) {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        onCoordinatesUsed$ui_release();
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            relativeToLocal = nodeCoordinator.m3718toParentPositionMKHz9U(relativeToLocal);
        }
        return relativeToLocal;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    public long mo3584localToWindowMKHz9U(long relativeToLocal) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo3778calculatePositionInWindowMKHz9U(mo3583localToRootMKHz9U(relativeToLocal));
    }

    public final void onCoordinatesUsed$ui_release() {
        getLayoutNode().getLayoutDelegate().onCoordinatesUsed();
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onLayoutNodeAttach() {
        updateLayerBlock(this.layerBlock, true);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    public void onMeasureResultChanged(int width, int height) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo3774resizeozmzZPI(IntSizeKt.IntSize(width, height));
        } else {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                nodeCoordinator.invalidateLayer();
            }
        }
        m3609setMeasuredSizeozmzZPI(IntSizeKt.IntSize(width, height));
        i(false);
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(4);
        boolean zM3734getIncludeSelfInTraversalH91voCI = NodeKindKt.m3734getIncludeSelfInTraversalH91voCI(iM3725constructorimpl);
        Modifier.Node tail = getTail();
        if (zM3734getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
            for (Modifier.Node nodeD = d(zM3734getIncludeSelfInTraversalH91voCI); nodeD != null && (nodeD.getAggregateChildKindSet() & iM3725constructorimpl) != 0; nodeD = nodeD.getChild()) {
                if ((nodeD.getKindSet() & iM3725constructorimpl) != 0) {
                    Modifier.Node nodeAccess$pop = nodeD;
                    MutableVector mutableVector = null;
                    while (nodeAccess$pop != 0) {
                        if (nodeAccess$pop instanceof DrawModifierNode) {
                            ((DrawModifierNode) nodeAccess$pop).onMeasureResultChanged();
                        } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = ((DelegatingNode) nodeAccess$pop).getDelegate();
                            int i10 = 0;
                            nodeAccess$pop = nodeAccess$pop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet() & iM3725constructorimpl) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        nodeAccess$pop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodeAccess$pop != 0) {
                                            mutableVector.add(nodeAccess$pop);
                                            nodeAccess$pop = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild();
                                nodeAccess$pop = nodeAccess$pop;
                            }
                            if (i10 == 1) {
                            }
                        }
                        nodeAccess$pop = DelegatableNodeKt.access$pop(mutableVector);
                    }
                }
                if (nodeD == tail) {
                    break;
                }
            }
        }
        Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.onLayoutChange(getLayoutNode());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public final void onMeasured() {
        /*
            r13 = this;
            r0 = 128(0x80, float:1.8E-43)
            int r1 = androidx.compose.ui.node.NodeKind.m3725constructorimpl(r0)
            boolean r2 = androidx.compose.ui.node.NodeKindKt.m3734getIncludeSelfInTraversalH91voCI(r1)
            androidx.compose.ui.Modifier$Node r2 = r13.d(r2)
            if (r2 == 0) goto Lc4
            boolean r1 = androidx.compose.ui.node.DelegatableNodeKt.m3651has64DMado(r2, r1)
            r2 = 1
            if (r1 != r2) goto Lc4
            androidx.compose.runtime.snapshots.Snapshot$Companion r1 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE
            androidx.compose.runtime.snapshots.Snapshot r1 = r1.createNonObservableSnapshot()
            androidx.compose.runtime.snapshots.Snapshot r3 = r1.makeCurrent()     // Catch: java.lang.Throwable -> Lba
            int r0 = androidx.compose.ui.node.NodeKind.m3725constructorimpl(r0)     // Catch: java.lang.Throwable -> L30
            boolean r4 = androidx.compose.ui.node.NodeKindKt.m3734getIncludeSelfInTraversalH91voCI(r0)     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L33
            androidx.compose.ui.Modifier$Node r5 = r13.getTail()     // Catch: java.lang.Throwable -> L30
            goto L3f
        L30:
            r0 = move-exception
            goto Lbc
        L33:
            androidx.compose.ui.Modifier$Node r5 = r13.getTail()     // Catch: java.lang.Throwable -> L30
            androidx.compose.ui.Modifier$Node r5 = r5.getParent()     // Catch: java.lang.Throwable -> L30
            if (r5 != 0) goto L3f
            goto Lb1
        L3f:
            androidx.compose.ui.Modifier$Node r4 = access$headNode(r13, r4)     // Catch: java.lang.Throwable -> L30
        L43:
            if (r4 == 0) goto Lb1
            int r6 = r4.getAggregateChildKindSet()     // Catch: java.lang.Throwable -> L30
            r6 = r6 & r0
            if (r6 == 0) goto Lb1
            int r6 = r4.getKindSet()     // Catch: java.lang.Throwable -> L30
            r6 = r6 & r0
            if (r6 == 0) goto Laa
            r6 = 0
            r7 = r4
            r8 = r6
        L56:
            if (r7 == 0) goto Laa
            boolean r9 = r7 instanceof androidx.compose.ui.node.LayoutAwareModifierNode     // Catch: java.lang.Throwable -> L30
            if (r9 == 0) goto L66
            androidx.compose.ui.node.LayoutAwareModifierNode r7 = (androidx.compose.ui.node.LayoutAwareModifierNode) r7     // Catch: java.lang.Throwable -> L30
            long r9 = r13.getMeasuredSize()     // Catch: java.lang.Throwable -> L30
            r7.mo457onRemeasuredozmzZPI(r9)     // Catch: java.lang.Throwable -> L30
            goto La5
        L66:
            int r9 = r7.getKindSet()     // Catch: java.lang.Throwable -> L30
            r9 = r9 & r0
            if (r9 == 0) goto La5
            boolean r9 = r7 instanceof androidx.compose.ui.node.DelegatingNode     // Catch: java.lang.Throwable -> L30
            if (r9 == 0) goto La5
            r9 = r7
            androidx.compose.ui.node.DelegatingNode r9 = (androidx.compose.ui.node.DelegatingNode) r9     // Catch: java.lang.Throwable -> L30
            androidx.compose.ui.Modifier$Node r9 = r9.getDelegate()     // Catch: java.lang.Throwable -> L30
            r10 = 0
            r11 = r10
        L7a:
            if (r9 == 0) goto La2
            int r12 = r9.getKindSet()     // Catch: java.lang.Throwable -> L30
            r12 = r12 & r0
            if (r12 == 0) goto L9d
            int r11 = r11 + 1
            if (r11 != r2) goto L89
            r7 = r9
            goto L9d
        L89:
            if (r8 != 0) goto L94
            androidx.compose.runtime.collection.MutableVector r8 = new androidx.compose.runtime.collection.MutableVector     // Catch: java.lang.Throwable -> L30
            r12 = 16
            androidx.compose.ui.Modifier$Node[] r12 = new androidx.compose.ui.Modifier.Node[r12]     // Catch: java.lang.Throwable -> L30
            r8.<init>(r12, r10)     // Catch: java.lang.Throwable -> L30
        L94:
            if (r7 == 0) goto L9a
            r8.add(r7)     // Catch: java.lang.Throwable -> L30
            r7 = r6
        L9a:
            r8.add(r9)     // Catch: java.lang.Throwable -> L30
        L9d:
            androidx.compose.ui.Modifier$Node r9 = r9.getChild()     // Catch: java.lang.Throwable -> L30
            goto L7a
        La2:
            if (r11 != r2) goto La5
            goto L56
        La5:
            androidx.compose.ui.Modifier$Node r7 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r8)     // Catch: java.lang.Throwable -> L30
            goto L56
        Laa:
            if (r4 == r5) goto Lb1
            androidx.compose.ui.Modifier$Node r4 = r4.getChild()     // Catch: java.lang.Throwable -> L30
            goto L43
        Lb1:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L30
            r1.restoreCurrent(r3)     // Catch: java.lang.Throwable -> Lba
            r1.dispose()
            goto Lc4
        Lba:
            r0 = move-exception
            goto Lc0
        Lbc:
            r1.restoreCurrent(r3)     // Catch: java.lang.Throwable -> Lba
            throw r0     // Catch: java.lang.Throwable -> Lba
        Lc0:
            r1.dispose()
            throw r0
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.onMeasured():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void onPlaced() {
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(128);
        boolean zM3734getIncludeSelfInTraversalH91voCI = NodeKindKt.m3734getIncludeSelfInTraversalH91voCI(iM3725constructorimpl);
        Modifier.Node tail = getTail();
        if (!zM3734getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeD = d(zM3734getIncludeSelfInTraversalH91voCI); nodeD != null && (nodeD.getAggregateChildKindSet() & iM3725constructorimpl) != 0; nodeD = nodeD.getChild()) {
            if ((nodeD.getKindSet() & iM3725constructorimpl) != 0) {
                Modifier.Node nodeAccess$pop = nodeD;
                MutableVector mutableVector = null;
                while (nodeAccess$pop != 0) {
                    if (nodeAccess$pop instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) nodeAccess$pop).onPlaced(this);
                    } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release = ((DelegatingNode) nodeAccess$pop).getDelegate();
                        int i10 = 0;
                        nodeAccess$pop = nodeAccess$pop;
                        while (delegate$ui_release != null) {
                            if ((delegate$ui_release.getKindSet() & iM3725constructorimpl) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    nodeAccess$pop = delegate$ui_release;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (nodeAccess$pop != 0) {
                                        mutableVector.add(nodeAccess$pop);
                                        nodeAccess$pop = 0;
                                    }
                                    mutableVector.add(delegate$ui_release);
                                }
                            }
                            delegate$ui_release = delegate$ui_release.getChild();
                            nodeAccess$pop = nodeAccess$pop;
                        }
                        if (i10 == 1) {
                        }
                    }
                    nodeAccess$pop = DelegatableNodeKt.access$pop(mutableVector);
                }
            }
            if (nodeD == tail) {
                return;
            }
        }
    }

    public final void onRelease() {
        this.E0 = true;
        if (this.layer != null) {
            updateLayerBlock$default(this, null, false, 2, null);
        }
    }

    public void performDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m3715performingMeasureK40F9xA(long constraints, @NotNull Function0<? extends Placeable> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        m3610setMeasurementConstraintsBRTryo0(constraints);
        return block.invoke();
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo3579placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        e(position, zIndex, layerBlock);
    }

    /* JADX INFO: renamed from: placeSelfApparentToRealOffset-f8xVGno, reason: not valid java name */
    public final void m3716placeSelfApparentToRealOffsetf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        long apparentToRealOffset = getApparentToRealOffset();
        e(androidx.databinding.f.b(apparentToRealOffset, IntOffset.m4508getYimpl(position), IntOffset.m4507getXimpl(apparentToRealOffset) + IntOffset.m4507getXimpl(position)), zIndex, layerBlock);
    }

    @Nullable
    public Object propagateRelocationRequest(@NotNull Rect rect, @NotNull Continuation<? super Unit> continuation) {
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator == null) {
            return Unit.INSTANCE;
        }
        Object objPropagateRelocationRequest = nodeCoordinator.propagateRelocationRequest(rect.m2312translatek4lQ0M(nodeCoordinator.localBoundingBoxOf(this, false).m2310getTopLeftF1C5BW0()), continuation);
        return objPropagateRelocationRequest == ek.a.getCOROUTINE_SUSPENDED() ? objPropagateRelocationRequest : Unit.INSTANCE;
    }

    public final void rectInParent$ui_release(@NotNull MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.F0) {
                if (clipToMinimumTouchTargetSize) {
                    long jM3711getMinimumTouchTargetSizeNHjbRc = m3711getMinimumTouchTargetSizeNHjbRc();
                    float fM2344getWidthimpl = Size.m2344getWidthimpl(jM3711getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    float fM2341getHeightimpl = Size.m2341getHeightimpl(jM3711getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    bounds.intersect(-fM2344getWidthimpl, -fM2341getHeightimpl, IntSize.m4549getWidthimpl(mo3581getSizeYbymL2g()) + fM2344getWidthimpl, IntSize.m4548getHeightimpl(mo3581getSizeYbymL2g()) + fM2341getHeightimpl);
                } else if (clipBounds) {
                    bounds.intersect(0.0f, 0.0f, IntSize.m4549getWidthimpl(mo3581getSizeYbymL2g()), IntSize.m4548getHeightimpl(mo3581getSizeYbymL2g()));
                }
                if (bounds.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(bounds, false);
        }
        float fM4507getXimpl = IntOffset.m4507getXimpl(getPosition());
        bounds.setLeft(bounds.getCom.dasnano.vdphotoselfiecapture.api.model.Parameters.DIRECTION.LEFT java.lang.String() + fM4507getXimpl);
        bounds.setRight(bounds.getCom.dasnano.vdphotoselfiecapture.api.model.Parameters.DIRECTION.RIGHT java.lang.String() + fM4507getXimpl);
        float fM4508getYimpl = IntOffset.m4508getYimpl(getPosition());
        bounds.setTop(bounds.getTop() + fM4508getYimpl);
        bounds.setBottom(bounds.getBottom() + fM4508getYimpl);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo3579placeAtf8xVGno(getPosition(), this.zIndex, this.layerBlock);
    }

    public abstract void setLookaheadDelegate(@Nullable LookaheadDelegate lookaheadDelegate);

    public void setMeasureResult$ui_release(@NotNull MeasureResult value) {
        Intrinsics.checkNotNullParameter(value, "value");
        MeasureResult measureResult = this.K0;
        if (value != measureResult) {
            this.K0 = value;
            if (measureResult == null || value.getWidth() != measureResult.getWidth() || value.getHeight() != measureResult.getHeight()) {
                onMeasureResultChanged(value.getWidth(), value.getHeight());
            }
            LinkedHashMap linkedHashMap = this.L0;
            if (((linkedHashMap == null || linkedHashMap.isEmpty()) && !(!value.getAlignmentLines().isEmpty())) || Intrinsics.areEqual(value.getAlignmentLines(), this.L0)) {
                return;
            }
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            LinkedHashMap linkedHashMap2 = this.L0;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.L0 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(value.getAlignmentLines());
        }
    }

    /* JADX INFO: renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m3717setPositiongyyYBs(long j10) {
        this.position = j10;
    }

    public final void setWrapped$ui_release(@Nullable NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final void setWrappedBy$ui_release(@Nullable NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    public final void setZIndex(float f6) {
        this.zIndex = f6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public final boolean shouldSharePointerInputWithSiblings() {
        /*
            r11 = this;
            r0 = 16
            int r1 = androidx.compose.ui.node.NodeKind.m3725constructorimpl(r0)
            boolean r1 = androidx.compose.ui.node.NodeKindKt.m3734getIncludeSelfInTraversalH91voCI(r1)
            androidx.compose.ui.Modifier$Node r1 = r11.d(r1)
            r2 = 0
            if (r1 != 0) goto L12
            return r2
        L12:
            int r3 = androidx.compose.ui.node.NodeKind.m3725constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r4 = r1.getNode()
            boolean r4 = r4.getIsAttached()
            if (r4 == 0) goto L92
            androidx.compose.ui.Modifier$Node r1 = r1.getNode()
            int r4 = r1.getAggregateChildKindSet()
            r4 = r4 & r3
            if (r4 == 0) goto L91
            androidx.compose.ui.Modifier$Node r1 = r1.getChild()
        L2f:
            if (r1 == 0) goto L91
            int r4 = r1.getKindSet()
            r4 = r4 & r3
            if (r4 == 0) goto L8c
            r4 = 0
            r5 = r1
            r6 = r4
        L3b:
            if (r5 == 0) goto L8c
            boolean r7 = r5 instanceof androidx.compose.ui.node.PointerInputModifierNode
            r8 = 1
            if (r7 == 0) goto L4b
            androidx.compose.ui.node.PointerInputModifierNode r5 = (androidx.compose.ui.node.PointerInputModifierNode) r5
            boolean r5 = r5.sharePointerInputWithSiblings()
            if (r5 == 0) goto L87
            return r8
        L4b:
            int r7 = r5.getKindSet()
            r7 = r7 & r3
            if (r7 == 0) goto L87
            boolean r7 = r5 instanceof androidx.compose.ui.node.DelegatingNode
            if (r7 == 0) goto L87
            r7 = r5
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate()
            r9 = r2
        L5e:
            if (r7 == 0) goto L84
            int r10 = r7.getKindSet()
            r10 = r10 & r3
            if (r10 == 0) goto L7f
            int r9 = r9 + 1
            if (r9 != r8) goto L6d
            r5 = r7
            goto L7f
        L6d:
            if (r6 != 0) goto L76
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r0]
            r6.<init>(r10, r2)
        L76:
            if (r5 == 0) goto L7c
            r6.add(r5)
            r5 = r4
        L7c:
            r6.add(r7)
        L7f:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild()
            goto L5e
        L84:
            if (r9 != r8) goto L87
            goto L3b
        L87:
            androidx.compose.ui.Modifier$Node r5 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r6)
            goto L3b
        L8c:
            androidx.compose.ui.Modifier$Node r1 = r1.getChild()
            goto L2f
        L91:
            return r2
        L92:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "visitLocalDescendants called on an unattached node"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.shouldSharePointerInputWithSiblings():boolean");
    }

    /* JADX INFO: renamed from: toParentPosition-MK-Hz9U, reason: not valid java name */
    public long m3718toParentPositionMKHz9U(long position) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            position = ownedLayer.mo3772mapOffset8S9VItk(position, false);
        }
        return IntOffsetKt.m4521plusNvtHpc(position, getPosition());
    }

    @NotNull
    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.INSTANCE.getZero();
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long jM3707calculateMinimumTouchTargetPaddingE7KxVPU = m3707calculateMinimumTouchTargetPaddingE7KxVPU(m3711getMinimumTouchTargetSizeNHjbRc());
        rectCache.setLeft(-Size.m2344getWidthimpl(jM3707calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setTop(-Size.m2341getHeightimpl(jM3707calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setRight(Size.m2344getWidthimpl(jM3707calculateMinimumTouchTargetPaddingE7KxVPU) + getMeasuredWidth());
        rectCache.setBottom(Size.m2341getHeightimpl(jM3707calculateMinimumTouchTargetPaddingE7KxVPU) + getMeasuredHeight());
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != layoutCoordinatesFindRootCoordinates) {
            nodeCoordinator.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformFrom-EL8BTi8 */
    public void mo3585transformFromEL8BTi8(@NotNull LayoutCoordinates sourceCoordinates, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        NodeCoordinator nodeCoordinatorG = g(sourceCoordinates);
        nodeCoordinatorG.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(nodeCoordinatorG);
        Matrix.m2709resetimpl(matrix);
        while (!Intrinsics.areEqual(nodeCoordinatorG, nodeCoordinatorFindCommonAncestor$ui_release)) {
            OwnedLayer ownedLayer = nodeCoordinatorG.layer;
            if (ownedLayer != null) {
                ownedLayer.mo3775transform58bKbWc(matrix);
            }
            long position = nodeCoordinatorG.getPosition();
            if (!IntOffset.m4506equalsimpl0(position, IntOffset.INSTANCE.m4517getZeronOccac())) {
                float[] fArr = X0;
                Matrix.m2709resetimpl(fArr);
                Matrix.m2720translateimpl$default(fArr, IntOffset.m4507getXimpl(position), IntOffset.m4508getYimpl(position), 0.0f, 4, null);
                Matrix.m2717timesAssign58bKbWc(matrix, fArr);
            }
            nodeCoordinatorG = nodeCoordinatorG.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinatorG);
        }
        h(nodeCoordinatorFindCommonAncestor$ui_release, matrix);
    }

    public final void updateLayerBlock(@Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock, boolean forceUpdateLayerParameters) {
        Owner owner;
        LayoutNode layoutNode = getLayoutNode();
        boolean z10 = (!forceUpdateLayerParameters && this.layerBlock == layerBlock && Intrinsics.areEqual(this.H0, layoutNode.getDensity()) && this.I0 == layoutNode.getLayoutDirection()) ? false : true;
        this.layerBlock = layerBlock;
        this.H0 = layoutNode.getDensity();
        this.I0 = layoutNode.getLayoutDirection();
        boolean zIsAttached = isAttached();
        c cVar = this.Q0;
        if (!zIsAttached || layerBlock == null) {
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.destroy();
                layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
                cVar.invoke();
                if (isAttached() && (owner = layoutNode.getOwner()) != null) {
                    owner.onLayoutChange(layoutNode);
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        if (this.layer != null) {
            if (z10) {
                i(true);
                return;
            }
            return;
        }
        OwnedLayer ownedLayerCreateLayer = LayoutNodeKt.requireOwner(layoutNode).createLayer(this, cVar);
        ownedLayerCreateLayer.mo3774resizeozmzZPI(getMeasuredSize());
        ownedLayerCreateLayer.mo3773movegyyYBs(getPosition());
        this.layer = ownedLayerCreateLayer;
        i(true);
        layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
        cVar.invoke();
    }

    public final void visitNodes(int mask, boolean includeTail, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Modifier.Node tail = getTail();
        if (!includeTail && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeD = d(includeTail); nodeD != null && (nodeD.getAggregateChildKindSet() & mask) != 0; nodeD = nodeD.getChild()) {
            if ((nodeD.getKindSet() & mask) != 0) {
                block.invoke(nodeD);
            }
            if (nodeD == tail) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: visitNodes-aLcG6gQ, reason: not valid java name */
    public final /* synthetic */ <T> void m3719visitNodesaLcG6gQ(int type, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean zM3734getIncludeSelfInTraversalH91voCI = NodeKindKt.m3734getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node tail = getTail();
        if (!zM3734getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeD = d(zM3734getIncludeSelfInTraversalH91voCI); nodeD != null && (nodeD.getAggregateChildKindSet() & type) != 0; nodeD = nodeD.getChild()) {
            if ((nodeD.getKindSet() & type) != 0) {
                for (Modifier.Node nodeAccess$pop = nodeD; nodeAccess$pop != null; nodeAccess$pop = DelegatableNodeKt.access$pop(null)) {
                    Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                    block.invoke(nodeAccess$pop);
                }
            }
            if (nodeD == tail) {
                return;
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    public long mo3586windowToLocalMKHz9U(long relativeToWindow) {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        return mo3582localPositionOfR5De75A(layoutCoordinatesFindRootCoordinates, Offset.m2279minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo3777calculateLocalPositionMKHz9U(relativeToWindow), LayoutCoordinatesKt.positionInRoot(layoutCoordinatesFindRootCoordinates)));
    }

    public final void withPositionTranslation(@NotNull Canvas canvas, @NotNull Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(block, "block");
        float fM4507getXimpl = IntOffset.m4507getXimpl(getPosition());
        float fM4508getYimpl = IntOffset.m4508getYimpl(getPosition());
        canvas.translate(fM4507getXimpl, fM4508getYimpl);
        block.invoke(canvas);
        canvas.translate(-fM4507getXimpl, -fM4508getYimpl);
    }

    /* JADX INFO: renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m3720withinLayerBoundsk4lQ0M(long pointerPosition) {
        if (!OffsetKt.m2292isFinitek4lQ0M(pointerPosition)) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null || !this.F0 || ownedLayer.mo3771isInLayerk4lQ0M(pointerPosition);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!getLayoutNode().isPlaced()) {
            this.lastLayerDrawingWasSkipped = true;
            return;
        }
        LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver().observeReads$ui_release(this, U0, new d(canvas));
        this.lastLayerDrawingWasSkipped = false;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return this;
    }
}
