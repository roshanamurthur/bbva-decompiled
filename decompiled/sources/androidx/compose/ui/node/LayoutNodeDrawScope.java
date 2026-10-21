package androidx.compose.ui.node;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LayoutNodeDrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\n\b\u0002\u0010\u009f\u0001\u001a\u00030\u009e\u0001¢\u0006\u0006\b \u0001\u0010¡\u0001Jt\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017Jt\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\\\u0010!\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\\\u0010!\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#JR\u0010(\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'Jp\u0010(\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020)2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100Jz\u0010(\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020)2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u00102\u001a\u000201H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104Jn\u0010>\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u0002082\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=Jn\u0010>\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u0002082\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010@J\\\u0010C\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u0010BJ\\\u0010C\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010EJP\u0010J\u001a\u00020\u00152\u0006\u0010G\u001a\u00020F2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010IJP\u0010J\u001a\u00020\u00152\u0006\u0010G\u001a\u00020F2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bK\u0010LJt\u0010S\u001a\u00020\u00152\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\n0M2\u0006\u0010P\u001a\u00020O2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u0002082\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bQ\u0010RJt\u0010S\u001a\u00020\u00152\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\n0M2\u0006\u0010P\u001a\u00020O2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u0002082\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010UJ\\\u0010W\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bV\u0010BJ\\\u0010W\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bX\u0010EJf\u0010]\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010Z\u001a\u00020Y2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b[\u0010\\Jf\u0010]\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010Z\u001a\u00020Y2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b^\u0010_J\u001a\u0010d\u001a\u00020a*\u00020`H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bb\u0010cJ\u001a\u0010d\u001a\u00020a*\u00020eH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bf\u0010gJ\u001a\u0010j\u001a\u00020`*\u00020eH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bh\u0010iJ\u001d\u0010j\u001a\u00020`*\u00020\u0005H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bk\u0010lJ\u001d\u0010j\u001a\u00020`*\u00020aH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bk\u0010mJ\u001a\u0010q\u001a\u00020n*\u00020\fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bo\u0010pJ\u001a\u0010s\u001a\u00020\u0005*\u00020`H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\br\u0010lJ\u001a\u0010s\u001a\u00020\u0005*\u00020eH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bt\u0010iJ\r\u0010w\u001a\u00020v*\u00020uH\u0097\u0001J\u001a\u0010y\u001a\u00020\f*\u00020nH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bx\u0010pJ\u001a\u0010|\u001a\u00020e*\u00020`H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bz\u0010{J\u001d\u0010|\u001a\u00020e*\u00020\u0005H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b}\u0010{J\u001d\u0010|\u001a\u00020e*\u00020aH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b}\u0010~J\b\u0010\u007f\u001a\u00020\u0015H\u0016J\u0016\u0010\u0083\u0001\u001a\u00020\u0015*\u00030\u0080\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001J>\u0010\u008a\u0001\u001a\u00020\u00152\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0085\u0001\u001a\u00030\u0084\u00012\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J>\u0010\u008d\u0001\u001a\u00020\u00152\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0085\u0001\u001a\u00030\u0084\u00012\b\u0010\u0087\u0001\u001a\u00030\u0080\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001f\u0010\u001e\u001a\u00020\n8VX\u0096\u0005ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0017\u0010\u0092\u0001\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0093\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0017\u0010\u0098\u0001\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0091\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u0099\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001f\u0010\r\u001a\u00020\f8VX\u0096\u0005ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u008f\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006¢\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "startAngle", "sweepAngle", "", "useCenter", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", "size", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "style", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "Landroidx/compose/ui/graphics/Color;", "color", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "radius", "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", AuthConstants.IMAGE, "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", "path", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", "points", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect-AsUm42w", "drawRect", "drawRect-n-J9OG0", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "drawContent", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "performDraw", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/Modifier$Node;", "drawNode", "draw-x_KDEd0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/Modifier$Node;)V", "draw", "drawDirect-x_KDEd0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/node/DrawModifierNode;)V", "drawDirect", "getCenter-F1C5BW0", "()J", "getDensity", "()F", "density", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "getFontScale", "fontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getSize-NH-jbRc", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "<init>", "(Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,127:1\n245#2:128\n74#3:129\n74#3:173\n74#3:174\n74#3:175\n383#4,6:130\n393#4,2:137\n395#4,8:142\n403#4,9:153\n412#4,8:165\n383#4,6:176\n393#4,2:183\n395#4,8:188\n403#4,9:199\n412#4,8:211\n261#5:136\n261#5:182\n234#6,3:139\n237#6,3:162\n234#6,3:185\n237#6,3:208\n1182#7:150\n1161#7,2:151\n1182#7:196\n1161#7,2:197\n558#8,17:219\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n*L\n46#1:128\n54#1:129\n61#1:173\n73#1:174\n85#1:175\n54#1:130,6\n54#1:137,2\n54#1:142,8\n54#1:153,9\n54#1:165,8\n85#1:176,6\n85#1:183,2\n85#1:188,8\n85#1:199,9\n85#1:211,8\n54#1:136\n85#1:182\n54#1:139,3\n54#1:162,3\n85#1:185,3\n85#1:208,3\n54#1:150\n54#1:151,2\n85#1:196\n85#1:197,2\n98#1:219,17\n*E\n"})
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final CanvasDrawScope f16814p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public DrawModifierNode f16815q0;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNodeDrawScope() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: draw-x_KDEd0$ui_release, reason: not valid java name */
    public final void m3678drawx_KDEd0$ui_release(@NotNull Canvas canvas, long size, @NotNull NodeCoordinator coordinator, @NotNull Modifier.Node drawNode) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(drawNode, "drawNode");
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(4);
        MutableVector mutableVector = null;
        while (drawNode != null) {
            if (drawNode instanceof DrawModifierNode) {
                m3679drawDirectx_KDEd0$ui_release(canvas, size, coordinator, (DrawModifierNode) drawNode);
            } else if ((drawNode.getKindSet() & iM3725constructorimpl) != 0 && (drawNode instanceof DelegatingNode)) {
                int i10 = 0;
                for (Modifier.Node delegate = ((DelegatingNode) drawNode).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & iM3725constructorimpl) != 0) {
                        i10++;
                        if (i10 == 1) {
                            drawNode = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (drawNode != null) {
                                mutableVector.add(drawNode);
                                drawNode = null;
                            }
                            mutableVector.add(delegate);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            drawNode = DelegatableNodeKt.access$pop(mutableVector);
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-illE91I */
    public void mo2889drawArcillE91I(@NotNull Brush brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f16814p0.mo2889drawArcillE91I(brush, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-yD3GUKo */
    public void mo2890drawArcyD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f16814p0.mo2890drawArcyD3GUKo(color, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-V9BoPsw */
    public void mo2891drawCircleV9BoPsw(@NotNull Brush brush, float radius, long center, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f16814p0.mo2891drawCircleV9BoPsw(brush, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-VaOC9Bg */
    public void mo2892drawCircleVaOC9Bg(long color, float radius, long center, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f16814p0.mo2892drawCircleVaOC9Bg(color, radius, center, alpha, style, colorFilter, blendMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    @Override // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        Canvas canvas = getDrawContext().getCanvas();
        DrawModifierNode drawModifierNode = this.f16815q0;
        Intrinsics.checkNotNull(drawModifierNode);
        Modifier.Node nodeAccess$nextDrawNode = LayoutNodeDrawScopeKt.access$nextDrawNode(drawModifierNode);
        if (nodeAccess$nextDrawNode == 0) {
            NodeCoordinator nodeCoordinatorM3653requireCoordinator64DMado = DelegatableNodeKt.m3653requireCoordinator64DMado(drawModifierNode, NodeKind.m3725constructorimpl(4));
            if (nodeCoordinatorM3653requireCoordinator64DMado.getTail() == drawModifierNode.getNode()) {
                nodeCoordinatorM3653requireCoordinator64DMado = nodeCoordinatorM3653requireCoordinator64DMado.getWrapped();
                Intrinsics.checkNotNull(nodeCoordinatorM3653requireCoordinator64DMado);
            }
            nodeCoordinatorM3653requireCoordinator64DMado.performDraw(canvas);
            return;
        }
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(4);
        MutableVector mutableVector = null;
        while (nodeAccess$nextDrawNode != 0) {
            if (nodeAccess$nextDrawNode instanceof DrawModifierNode) {
                performDraw((DrawModifierNode) nodeAccess$nextDrawNode, canvas);
            } else if ((nodeAccess$nextDrawNode.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$nextDrawNode instanceof DelegatingNode)) {
                Modifier.Node delegate = ((DelegatingNode) nodeAccess$nextDrawNode).getDelegate();
                int i10 = 0;
                nodeAccess$nextDrawNode = nodeAccess$nextDrawNode;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iM3725constructorimpl) != 0) {
                        i10++;
                        if (i10 == 1) {
                            nodeAccess$nextDrawNode = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (nodeAccess$nextDrawNode != 0) {
                                mutableVector.add(nodeAccess$nextDrawNode);
                                nodeAccess$nextDrawNode = 0;
                            }
                            mutableVector.add(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    nodeAccess$nextDrawNode = nodeAccess$nextDrawNode;
                }
                if (i10 == 1) {
                }
            }
            nodeAccess$nextDrawNode = DelegatableNodeKt.access$pop(mutableVector);
        }
    }

    /* JADX INFO: renamed from: drawDirect-x_KDEd0$ui_release, reason: not valid java name */
    public final void m3679drawDirectx_KDEd0$ui_release(@NotNull Canvas canvas, long size, @NotNull NodeCoordinator coordinator, @NotNull DrawModifierNode drawNode) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(drawNode, "drawNode");
        DrawModifierNode drawModifierNode = this.f16815q0;
        this.f16815q0 = drawNode;
        LayoutDirection layoutDirection = coordinator.getLayoutDirection();
        CanvasDrawScope canvasDrawScope = this.f16814p0;
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density densityComponent1 = drawParams.getDensity();
        LayoutDirection layoutDirectionComponent2 = drawParams.getLayoutDirection();
        Canvas canvasComponent3 = drawParams.getCanvas();
        long jM2911component4NHjbRc = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(coordinator);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m2914setSizeuvyYCjk(size);
        canvas.save();
        drawNode.draw(this);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m2914setSizeuvyYCjk(jM2911component4NHjbRc);
        this.f16815q0 = drawModifierNode;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* JADX INFO: renamed from: drawImage-9jGpkUE */
    public /* synthetic */ void mo2893drawImage9jGpkUE(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f16814p0.mo2893drawImage9jGpkUE(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-AZ2fEMs */
    public void mo2894drawImageAZ2fEMs(@NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode, int filterQuality) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f16814p0.mo2894drawImageAZ2fEMs(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-gbVJVH8 */
    public void mo2895drawImagegbVJVH8(@NotNull ImageBitmap image, long topLeft, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f16814p0.mo2895drawImagegbVJVH8(image, topLeft, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-1RTmtNc */
    public void mo2896drawLine1RTmtNc(@NotNull Brush brush, long start, long end, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.f16814p0.mo2896drawLine1RTmtNc(brush, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-NGM6Ib0 */
    public void mo2897drawLineNGM6Ib0(long color, long start, long end, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        this.f16814p0.mo2897drawLineNGM6Ib0(color, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-AsUm42w */
    public void mo2898drawOvalAsUm42w(@NotNull Brush brush, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f16814p0.mo2898drawOvalAsUm42w(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-n-J9OG0 */
    public void mo2899drawOvalnJ9OG0(long color, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f16814p0.mo2899drawOvalnJ9OG0(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-GBMwjPU */
    public void mo2900drawPathGBMwjPU(@NotNull Path path, @NotNull Brush brush, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f16814p0.mo2900drawPathGBMwjPU(path, brush, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-LG529CI */
    public void mo2901drawPathLG529CI(@NotNull Path path, long color, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f16814p0.mo2901drawPathLG529CI(path, color, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-F8ZwMP8 */
    public void mo2902drawPointsF8ZwMP8(@NotNull List<Offset> points, int pointMode, long color, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.f16814p0.mo2902drawPointsF8ZwMP8(points, pointMode, color, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-Gsft0Ws */
    public void mo2903drawPointsGsft0Ws(@NotNull List<Offset> points, int pointMode, @NotNull Brush brush, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.f16814p0.mo2903drawPointsGsft0Ws(points, pointMode, brush, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-AsUm42w */
    public void mo2904drawRectAsUm42w(@NotNull Brush brush, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f16814p0.mo2904drawRectAsUm42w(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-n-J9OG0 */
    public void mo2905drawRectnJ9OG0(long color, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f16814p0.mo2905drawRectnJ9OG0(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ */
    public void mo2906drawRoundRectZuiqVtQ(@NotNull Brush brush, long topLeft, long size, long cornerRadius, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f16814p0.mo2906drawRoundRectZuiqVtQ(brush, topLeft, size, cornerRadius, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA */
    public void mo2907drawRoundRectuAw5IA(long color, long topLeft, long size, long cornerRadius, @NotNull DrawStyle style, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f16814p0.mo2907drawRoundRectuAw5IA(color, topLeft, size, cornerRadius, style, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: getCenter-F1C5BW0 */
    public long mo2908getCenterF1C5BW0() {
        CanvasDrawScope canvasDrawScope = this.f16814p0;
        canvasDrawScope.getClass();
        return a1.b.b(canvasDrawScope);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.f16814p0.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @NotNull
    public DrawContext getDrawContext() {
        return this.f16814p0.getDrawContext();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.f16814p0.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.f16814p0.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: getSize-NH-jbRc */
    public long mo2909getSizeNHjbRc() {
        CanvasDrawScope canvasDrawScope = this.f16814p0;
        canvasDrawScope.getClass();
        return a1.b.c(canvasDrawScope);
    }

    public final void performDraw(@NotNull DrawModifierNode drawModifierNode, @NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(drawModifierNode, "<this>");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        NodeCoordinator nodeCoordinatorM3653requireCoordinator64DMado = DelegatableNodeKt.m3653requireCoordinator64DMado(drawModifierNode, NodeKind.m3725constructorimpl(4));
        nodeCoordinatorM3653requireCoordinator64DMado.getLayoutNode().getMDrawScope$ui_release().m3679drawDirectx_KDEd0$ui_release(canvas, IntSizeKt.m4559toSizeozmzZPI(nodeCoordinatorM3653requireCoordinator64DMado.mo3581getSizeYbymL2g()), nodeCoordinatorM3653requireCoordinator64DMado, drawModifierNode);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public int mo412roundToPxR2X_6o(long j10) {
        CanvasDrawScope canvasDrawScope = this.f16814p0;
        canvasDrawScope.getClass();
        return x1.a.a(canvasDrawScope, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public int mo413roundToPx0680j_4(float f6) {
        CanvasDrawScope canvasDrawScope = this.f16814p0;
        canvasDrawScope.getClass();
        return x1.a.b(canvasDrawScope, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo404toDpGaN1DYA(long j10) {
        CanvasDrawScope canvasDrawScope = this.f16814p0;
        canvasDrawScope.getClass();
        return x1.a.c(canvasDrawScope, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo405toDpu2uoSUM(float f6) {
        CanvasDrawScope canvasDrawScope = this.f16814p0;
        canvasDrawScope.getClass();
        return x1.a.d(canvasDrawScope, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public long mo407toDpSizekrfVVM(long j10) {
        CanvasDrawScope canvasDrawScope = this.f16814p0;
        canvasDrawScope.getClass();
        return x1.a.f(canvasDrawScope, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public float mo414toPxR2X_6o(long j10) {
        CanvasDrawScope canvasDrawScope = this.f16814p0;
        canvasDrawScope.getClass();
        return x1.a.g(canvasDrawScope, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public float mo415toPx0680j_4(float f6) {
        CanvasDrawScope canvasDrawScope = this.f16814p0;
        canvasDrawScope.getClass();
        return x1.a.h(canvasDrawScope, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        CanvasDrawScope canvasDrawScope = this.f16814p0;
        canvasDrawScope.getClass();
        return x1.a.i(canvasDrawScope, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public long mo408toSizeXkaWNTQ(long j10) {
        CanvasDrawScope canvasDrawScope = this.f16814p0;
        canvasDrawScope.getClass();
        return x1.a.j(canvasDrawScope, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo409toSp0xMU5do(float f6) {
        CanvasDrawScope canvasDrawScope = this.f16814p0;
        canvasDrawScope.getClass();
        return x1.a.k(canvasDrawScope, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo410toSpkPz2Gy4(float f6) {
        CanvasDrawScope canvasDrawScope = this.f16814p0;
        canvasDrawScope.getClass();
        return x1.a.l(canvasDrawScope, f6);
    }

    public LayoutNodeDrawScope(@NotNull CanvasDrawScope canvasDrawScope) {
        Intrinsics.checkNotNullParameter(canvasDrawScope, "canvasDrawScope");
        this.f16814p0 = canvasDrawScope;
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo406toDpu2uoSUM(int i10) {
        CanvasDrawScope canvasDrawScope = this.f16814p0;
        canvasDrawScope.getClass();
        return x1.a.e(canvasDrawScope, i10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo411toSpkPz2Gy4(int i10) {
        CanvasDrawScope canvasDrawScope = this.f16814p0;
        canvasDrawScope.getClass();
        return x1.a.m(canvasDrawScope, i10);
    }

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
