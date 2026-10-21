package androidx.compose.ui.node;

import android.view.View;
import androidx.camera.core.impl.d0;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import i1.m;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LayoutNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000 ô\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\bô\u0002õ\u0002ö\u0002÷\u0002B\u001f\u0012\t\b\u0002\u0010ñ\u0002\u001a\u00020G\u0012\t\b\u0002\u0010\u0094\u0001\u001a\u00020\u0010¢\u0006\u0006\bò\u0002\u0010ó\u0002J\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\fH\u0086\bø\u0001\u0000J&\u0010\u0011\u001a\u00020\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u000fH\u0086\bø\u0001\u0000J\u0010\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0017J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001a\u0010\nJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010!\u001a\u00020\bH\u0000¢\u0006\u0004\b \u0010\nJ'\u0010&\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0010H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010(\u001a\u00020\bH\u0000¢\u0006\u0004\b'\u0010\nJ\u0017\u0010-\u001a\u00020\b2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010/\u001a\u00020\bH\u0000¢\u0006\u0004\b.\u0010\nJ\b\u00101\u001a\u000200H\u0016J\u000f\u00103\u001a\u00020\bH\u0000¢\u0006\u0004\b2\u0010\nJ\u000f\u00105\u001a\u00020\bH\u0000¢\u0006\u0004\b4\u0010\nJ\u001f\u00109\u001a\u00020\b2\u0006\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0010H\u0000¢\u0006\u0004\b8\u0010\u001eJ\u000f\u0010;\u001a\u00020\bH\u0000¢\u0006\u0004\b:\u0010\nJ\u000f\u0010=\u001a\u00020\bH\u0000¢\u0006\u0004\b<\u0010\nJ\u0017\u0010B\u001a\u00020\b2\u0006\u0010?\u001a\u00020>H\u0000¢\u0006\u0004\b@\u0010AJ9\u0010L\u001a\u00020\b2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\b\b\u0002\u0010H\u001a\u00020G2\b\b\u0002\u0010I\u001a\u00020GH\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bJ\u0010KJ9\u0010O\u001a\u00020\b2\u0006\u0010D\u001a\u00020C2\u0006\u0010M\u001a\u00020E2\b\b\u0002\u0010H\u001a\u00020G2\b\b\u0002\u0010I\u001a\u00020GH\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bN\u0010KJ\u0017\u0010S\u001a\u00020\b2\u0006\u0010P\u001a\u00020\u0000H\u0000¢\u0006\u0004\bQ\u0010RJ#\u0010X\u001a\u00020\b2\b\b\u0002\u0010T\u001a\u00020G2\b\b\u0002\u0010U\u001a\u00020GH\u0000¢\u0006\u0004\bV\u0010WJ#\u0010Z\u001a\u00020\b2\b\b\u0002\u0010T\u001a\u00020G2\b\b\u0002\u0010U\u001a\u00020GH\u0000¢\u0006\u0004\bY\u0010WJ\u000f\u0010\\\u001a\u00020\bH\u0000¢\u0006\u0004\b[\u0010\nJ!\u0010`\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0]H\u0080\bø\u0001\u0000¢\u0006\u0004\b^\u0010_J\u0019\u0010c\u001a\u00020\b2\b\b\u0002\u0010T\u001a\u00020GH\u0000¢\u0006\u0004\ba\u0010bJ\u0019\u0010e\u001a\u00020\b2\b\b\u0002\u0010T\u001a\u00020GH\u0000¢\u0006\u0004\bd\u0010bJ\u000f\u0010g\u001a\u00020\bH\u0000¢\u0006\u0004\bf\u0010\nJ\u000e\u0010j\u001a\b\u0012\u0004\u0012\u00020i0hH\u0016J\u000f\u0010l\u001a\u00020\bH\u0000¢\u0006\u0004\bk\u0010\nJ!\u0010q\u001a\u00020G2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010mH\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bo\u0010pJ!\u0010s\u001a\u00020G2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010mH\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\br\u0010pJ\u000f\u0010u\u001a\u00020\bH\u0000¢\u0006\u0004\bt\u0010\nJ\u000f\u0010w\u001a\u00020\bH\u0000¢\u0006\u0004\bv\u0010\nJ\u000f\u0010y\u001a\u00020\bH\u0000¢\u0006\u0004\bx\u0010\nJ\u0010\u0010{\u001a\u00020\b2\b\b\u0002\u0010z\u001a\u00020GJ\u000f\u0010}\u001a\u00020\bH\u0000¢\u0006\u0004\b|\u0010\nJ\b\u0010~\u001a\u00020\bH\u0016J\b\u0010\u007f\u001a\u00020\bH\u0016J+\u0010\u0083\u0001\u001a\u00020\b2\u0013\u0010\r\u001a\u000f\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0004\u0012\u00020\b0\fH\u0080\bø\u0001\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J+\u0010\u0086\u0001\u001a\u00020\b2\u0013\u0010\r\u001a\u000f\u0012\u0005\u0012\u00030\u0084\u0001\u0012\u0004\u0012\u00020\b0\fH\u0080\bø\u0001\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0082\u0001J\u0011\u0010\u0088\u0001\u001a\u00020\bH\u0000¢\u0006\u0005\b\u0087\u0001\u0010\nJ\u0011\u0010\u008a\u0001\u001a\u00020\bH\u0000¢\u0006\u0005\b\u0089\u0001\u0010\nJ\t\u0010\u008b\u0001\u001a\u00020\bH\u0016J\t\u0010\u008c\u0001\u001a\u00020\bH\u0016J\t\u0010\u008d\u0001\u001a\u00020\bH\u0016R)\u0010\u0094\u0001\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R9\u0010\u009a\u0001\u001a\u00020\u00102\u0007\u0010\u0095\u0001\u001a\u00020\u00108W@WX\u0097\u000e¢\u0006\u001f\n\u0006\b\u0096\u0001\u0010\u008f\u0001\u0012\u0005\b\u0099\u0001\u0010\n\u001a\u0006\b\u0097\u0001\u0010\u0091\u0001\"\u0006\b\u0098\u0001\u0010\u0093\u0001R(\u0010 \u0001\u001a\u00020G8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0005\b\u009f\u0001\u0010bR5\u0010§\u0001\u001a\u0004\u0018\u00010\u00002\t\u0010¡\u0001\u001a\u0004\u0018\u00010\u00008\u0000@BX\u0080\u000e¢\u0006\u0017\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0005\b¦\u0001\u0010RR-\u0010*\u001a\u0004\u0018\u00010)2\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010)8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R3\u0010´\u0001\u001a\f\u0018\u00010¬\u0001j\u0005\u0018\u0001`\u00ad\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R)\u0010¸\u0001\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bµ\u0001\u0010\u008f\u0001\u001a\u0006\b¶\u0001\u0010\u0091\u0001\"\u0006\b·\u0001\u0010\u0093\u0001R4\u0010Á\u0001\u001a\u00030¹\u00012\b\u0010º\u0001\u001a\u00030¹\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R \u0010Ç\u0001\u001a\u00030Â\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001R4\u0010Ï\u0001\u001a\u00030È\u00012\b\u0010º\u0001\u001a\u00030È\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R4\u0010×\u0001\u001a\u00030Ð\u00012\b\u0010º\u0001\u001a\u00030Ð\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R4\u0010ß\u0001\u001a\u00030Ø\u00012\b\u0010º\u0001\u001a\u00030Ø\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R4\u0010ç\u0001\u001a\u00030à\u00012\b\u0010º\u0001\u001a\u00030à\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bá\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R*\u0010ï\u0001\u001a\u00030è\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bé\u0001\u0010ê\u0001\u001a\u0006\bë\u0001\u0010ì\u0001\"\u0006\bí\u0001\u0010î\u0001R/\u0010ô\u0001\u001a\u00020G8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\bð\u0001\u0010\u009c\u0001\u0012\u0005\bó\u0001\u0010\n\u001a\u0006\bñ\u0001\u0010\u009e\u0001\"\u0005\bò\u0001\u0010bR \u0010ú\u0001\u001a\u00030õ\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001R \u0010\u0080\u0002\u001a\u00030û\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bü\u0001\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010ÿ\u0001R,\u0010\u0088\u0002\u001a\u0005\u0018\u00010\u0081\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R(\u0010\u008c\u0002\u001a\u00020G8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0089\u0002\u0010\u009c\u0001\u001a\u0006\b\u008a\u0002\u0010\u009e\u0001\"\u0005\b\u008b\u0002\u0010bR4\u0010\u0094\u0002\u001a\u00030\u008d\u00022\b\u0010º\u0001\u001a\u00030\u008d\u00028\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u008e\u0002\u0010\u008f\u0002\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002\"\u0006\b\u0092\u0002\u0010\u0093\u0002R7\u0010\u009a\u0002\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\b\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0095\u0002\u0010\u0096\u0002\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002\"\u0006\b\u0099\u0002\u0010\u0082\u0001R7\u0010\u009e\u0002\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\b\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009b\u0002\u0010\u0096\u0002\u001a\u0006\b\u009c\u0002\u0010\u0098\u0002\"\u0006\b\u009d\u0002\u0010\u0082\u0001R(\u0010¢\u0002\u001a\u00020G8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u009f\u0002\u0010\u009c\u0001\u001a\u0006\b \u0002\u0010\u009e\u0001\"\u0005\b¡\u0002\u0010bR\u0016\u0010£\u0002\u001a\u0004\u0018\u00010G8F¢\u0006\b\u001a\u0006\b£\u0002\u0010¤\u0002R\u001d\u0010§\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000h8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¥\u0002\u0010¦\u0002R\u001e\u0010ª\u0002\u001a\t\u0012\u0005\u0012\u00030¨\u00020h8@X\u0080\u0004¢\u0006\b\u001a\u0006\b©\u0002\u0010¦\u0002R\u001e\u0010¬\u0002\u001a\t\u0012\u0005\u0012\u00030¨\u00020h8@X\u0080\u0004¢\u0006\b\u001a\u0006\b«\u0002\u0010¦\u0002R\u001e\u0010°\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u00ad\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b®\u0002\u0010¯\u0002R\u001d\u0010²\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000h8@X\u0080\u0004¢\u0006\b\u001a\u0006\b±\u0002\u0010¦\u0002R\u0019\u0010´\u0002\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\b³\u0002\u0010¥\u0001R\u0017\u0010µ\u0002\u001a\u00020G8VX\u0096\u0004¢\u0006\b\u001a\u0006\bµ\u0002\u0010\u009e\u0001R\u0018\u0010¹\u0002\u001a\u00030¶\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b·\u0002\u0010¸\u0002R\u001f\u0010½\u0002\u001a\n\u0018\u00010º\u0002R\u00030û\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b»\u0002\u0010¼\u0002R\u001d\u0010Á\u0002\u001a\b0¾\u0002R\u00030û\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¿\u0002\u0010À\u0002R\u001a\u0010Å\u0002\u001a\u0005\u0018\u00010Â\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÃ\u0002\u0010Ä\u0002R%\u0010È\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u00ad\u00028@X\u0081\u0004¢\u0006\u000f\u0012\u0005\bÇ\u0002\u0010\n\u001a\u0006\bÆ\u0002\u0010¯\u0002R\u0017\u0010É\u0002\u001a\u00020G8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÉ\u0002\u0010\u009e\u0001R\u0017\u0010Ë\u0002\u001a\u00020G8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÊ\u0002\u0010\u009e\u0001R\u0017\u0010Í\u0002\u001a\u00020\u00108VX\u0096\u0004¢\u0006\b\u001a\u0006\bÌ\u0002\u0010\u0091\u0001R\u0017\u0010Ï\u0002\u001a\u00020\u00108VX\u0096\u0004¢\u0006\b\u001a\u0006\bÎ\u0002\u0010\u0091\u0001R\u0017\u0010Ñ\u0002\u001a\u00020G8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÐ\u0002\u0010\u009e\u0001R\u0018\u0010Õ\u0002\u001a\u00030Ò\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÓ\u0002\u0010Ô\u0002R\u0017\u0010Ö\u0002\u001a\u00020G8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÖ\u0002\u0010\u009e\u0001R\u0017\u0010Ø\u0002\u001a\u00020\u00108@X\u0080\u0004¢\u0006\b\u001a\u0006\b×\u0002\u0010\u0091\u0001R\u0018\u0010Ú\u0002\u001a\u00030è\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÙ\u0002\u0010ì\u0001R\u0018\u0010Ü\u0002\u001a\u00030è\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÛ\u0002\u0010ì\u0001R\u0018\u0010ß\u0002\u001a\u00030\u0084\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÝ\u0002\u0010Þ\u0002R\u0018\u0010á\u0002\u001a\u00030\u0084\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bà\u0002\u0010Þ\u0002R\u0018\u0010å\u0002\u001a\u00030â\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bã\u0002\u0010ä\u0002R\u0017\u0010ç\u0002\u001a\u00020G8@X\u0080\u0004¢\u0006\b\u001a\u0006\bæ\u0002\u0010\u009e\u0001R\u0017\u0010é\u0002\u001a\u00020G8@X\u0080\u0004¢\u0006\b\u001a\u0006\bè\u0002\u0010\u009e\u0001R\u0017\u0010ë\u0002\u001a\u00020G8@X\u0080\u0004¢\u0006\b\u001a\u0006\bê\u0002\u0010\u009e\u0001R\u0017\u0010í\u0002\u001a\u00020G8@X\u0080\u0004¢\u0006\b\u001a\u0006\bì\u0002\u0010\u009e\u0001R\u0019\u0010ð\u0002\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bî\u0002\u0010ï\u0002\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006ø\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/node/InteroperableComposeUiNode;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "", "updateChildrenIfDirty$ui_release", "()V", "updateChildrenIfDirty", "Lkotlin/Function1;", "block", "forEachChild", "Lkotlin/Function2;", "", "forEachChildIndexed", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", FirebaseAnalytics.Param.INDEX, "instance", "insertAt$ui_release", "(ILandroidx/compose/ui/node/LayoutNode;)V", "insertAt", "onZSortedChildrenInvalidated$ui_release", "onZSortedChildrenInvalidated", "count", "removeAt$ui_release", "(II)V", "removeAt", "removeAll$ui_release", "removeAll", "from", TypedValues.TransitionType.S_TO, "move$ui_release", "(III)V", "move", "invalidateSemantics$ui_release", "invalidateSemantics", "Landroidx/compose/ui/node/Owner;", "owner", "attach$ui_release", "(Landroidx/compose/ui/node/Owner;)V", "attach", "detach$ui_release", "detach", "", "toString", "invalidateLayer$ui_release", "invalidateLayer", "invalidateParentData$ui_release", "invalidateParentData", "x", "y", "place$ui_release", "place", "replace$ui_release", "replace", "lookaheadReplace$ui_release", "lookaheadReplace", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "draw$ui_release", "(Landroidx/compose/ui/graphics/Canvas;)V", "draw", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "", "isTouchEvent", "isInLayer", "hitTest-M_7yMNQ$ui_release", "(JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTest", "hitSemanticsEntities", "hitTestSemantics-M_7yMNQ$ui_release", "hitTestSemantics", "it", "rescheduleRemeasureOrRelayout$ui_release", "(Landroidx/compose/ui/node/LayoutNode;)V", "rescheduleRemeasureOrRelayout", "forceRequest", "scheduleMeasureAndLayout", "requestRemeasure$ui_release", "(ZZ)V", "requestRemeasure", "requestLookaheadRemeasure$ui_release", "requestLookaheadRemeasure", "invalidateMeasurements$ui_release", "invalidateMeasurements", "Lkotlin/Function0;", "ignoreRemeasureRequests$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "ignoreRemeasureRequests", "requestRelayout$ui_release", "(Z)V", "requestRelayout", "requestLookaheadRelayout$ui_release", "requestLookaheadRelayout", "dispatchOnPositionedCallbacks$ui_release", "dispatchOnPositionedCallbacks", "", "Landroidx/compose/ui/layout/ModifierInfo;", "getModifierInfo", "invalidateLayers$ui_release", "invalidateLayers", "Landroidx/compose/ui/unit/Constraints;", "constraints", "lookaheadRemeasure-_Sx5XlM$ui_release", "(Landroidx/compose/ui/unit/Constraints;)Z", "lookaheadRemeasure", "remeasure-_Sx5XlM$ui_release", "remeasure", "markLayoutPending$ui_release", "markLayoutPending", "markMeasurePending$ui_release", "markMeasurePending", "markLookaheadLayoutPending$ui_release", "markLookaheadLayoutPending", "isRootOfInvalidation", "invalidateSubtree", "markLookaheadMeasurePending$ui_release", "markLookaheadMeasurePending", "forceRemeasure", "onLayoutComplete", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "forEachCoordinator$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "forEachCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "forEachCoordinatorIncludingInner$ui_release", "forEachCoordinatorIncludingInner", "clearSubtreeIntrinsicsUsage$ui_release", "clearSubtreeIntrinsicsUsage", "resetSubtreeIntrinsicsUsage$ui_release", "resetSubtreeIntrinsicsUsage", "onReuse", "onDeactivate", "onRelease", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSemanticsId", "()I", "setSemanticsId", "(I)V", "semanticsId", "<set-?>", "r0", "getCompositeKeyHash", "setCompositeKeyHash", "getCompositeKeyHash$annotations", "compositeKeyHash", "s0", "Z", "isVirtualLookaheadRoot$ui_release", "()Z", "setVirtualLookaheadRoot$ui_release", "isVirtualLookaheadRoot", "newRoot", "t0", "Landroidx/compose/ui/node/LayoutNode;", "getLookaheadRoot$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "e", "lookaheadRoot", "E0", "Landroidx/compose/ui/node/Owner;", "getOwner$ui_release", "()Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "F0", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "getInteropViewFactoryHolder$ui_release", "()Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "setInteropViewFactoryHolder$ui_release", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "interopViewFactoryHolder", "G0", "getDepth$ui_release", "setDepth$ui_release", "depth", "Landroidx/compose/ui/layout/MeasurePolicy;", "value", "L0", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "measurePolicy", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "M0", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "getIntrinsicsPolicy$ui_release", "()Landroidx/compose/ui/node/IntrinsicsPolicy;", "intrinsicsPolicy", "Landroidx/compose/ui/unit/Density;", "N0", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "O0", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Landroidx/compose/ui/platform/ViewConfiguration;", "P0", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "viewConfiguration", "Landroidx/compose/runtime/CompositionLocalMap;", "Q0", "Landroidx/compose/runtime/CompositionLocalMap;", "getCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setCompositionLocalMap", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "compositionLocalMap", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "R0", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getIntrinsicsUsageByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setIntrinsicsUsageByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "intrinsicsUsageByParent", "T0", "getCanMultiMeasure$ui_release", "setCanMultiMeasure$ui_release", "getCanMultiMeasure$ui_release$annotations", "canMultiMeasure", "Landroidx/compose/ui/node/NodeChain;", "U0", "Landroidx/compose/ui/node/NodeChain;", "getNodes$ui_release", "()Landroidx/compose/ui/node/NodeChain;", "nodes", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "V0", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "getLayoutDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutDelegate", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "W0", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "getSubcompositionsState$ui_release", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "setSubcompositionsState$ui_release", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "subcompositionsState", "Y0", "getInnerLayerCoordinatorIsDirty$ui_release", "setInnerLayerCoordinatorIsDirty$ui_release", "innerLayerCoordinatorIsDirty", "Landroidx/compose/ui/Modifier;", "Z0", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "modifier", "a1", "Lkotlin/jvm/functions/Function1;", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnAttach$ui_release", "onAttach", "b1", "getOnDetach$ui_release", "setOnDetach$ui_release", "onDetach", "c1", "getNeedsOnPositionedDispatch$ui_release", "setNeedsOnPositionedDispatch$ui_release", "needsOnPositionedDispatch", "isPlacedInLookahead", "()Ljava/lang/Boolean;", "getFoldedChildren$ui_release", "()Ljava/util/List;", "foldedChildren", "Landroidx/compose/ui/layout/Measurable;", "getChildMeasurables$ui_release", "childMeasurables", "getChildLookaheadMeasurables$ui_release", "childLookaheadMeasurables", "Landroidx/compose/runtime/collection/MutableVector;", "get_children$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "_children", "getChildren$ui_release", "children", "getParent$ui_release", "parent", "isAttached", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "getLookaheadPassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getCollapsedSemantics$ui_release", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "collapsedSemantics", "getZSortedChildren", "getZSortedChildren$annotations", "zSortedChildren", "isValidOwnerScope", "getHasFixedInnerContentConstraints$ui_release", "hasFixedInnerContentConstraints", "getWidth", "width", "getHeight", "height", "getAlignmentLinesRequired$ui_release", "alignmentLinesRequired", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getMDrawScope$ui_release", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "mDrawScope", "isPlaced", "getPlaceOrder$ui_release", "placeOrder", "getMeasuredByParent$ui_release", "measuredByParent", "getMeasuredByParentInLookahead$ui_release", "measuredByParentInLookahead", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "getOuterCoordinator$ui_release", "outerCoordinator", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "getMeasurePending$ui_release", "measurePending", "getLayoutPending$ui_release", "layoutPending", "getLookaheadMeasurePending$ui_release", "lookaheadMeasurePending", "getLookaheadLayoutPending$ui_release", "lookaheadLayoutPending", "getParentInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "parentInfo", "isVirtual", "<init>", "(ZI)V", "Companion", "LayoutState", "NoIntrinsicsMeasurePolicy", "UsageByParent", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 10 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 11 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n+ 12 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 13 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 14 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,1461:1\n1242#1,7:1468\n1242#1,7:1540\n1067#1,2:1548\n1069#1,2:1562\n197#1:1565\n1230#1,7:1963\n197#1:2138\n197#1:2150\n197#1:2162\n1242#1,7:2174\n1182#2:1462\n1161#2,2:1463\n1182#2:1465\n1161#2,2:1466\n1182#2:1475\n1161#2,2:1476\n1182#2:1611\n1161#2,2:1612\n1182#2:1675\n1161#2,2:1676\n1182#2:1749\n1161#2,2:1750\n1182#2:1860\n1161#2,2:1861\n1182#2:1924\n1161#2,2:1925\n1182#2:2006\n1161#2,2:2007\n1182#2:2091\n1161#2,2:2092\n48#3:1478\n48#3:1513\n48#3:1528\n48#3:1550\n460#4,7:1479\n146#4:1486\n467#4,4:1487\n460#4,11:1491\n476#4,11:1502\n460#4,11:1514\n460#4,11:1529\n460#4,11:1551\n146#4:1564\n460#4,11:1566\n460#4,11:2045\n460#4,11:2139\n460#4,11:2151\n460#4,11:2163\n76#5:1525\n76#5:1527\n76#5:1547\n78#5:1577\n78#5:1640\n101#5:1714\n88#5:1788\n90#5,3:1804\n94#5:1808\n90#5:1813\n92#5,3:1815\n90#5:1821\n86#5:1888\n86#5:1908\n72#5:1970\n72#5:1990\n84#5:2056\n74#5:2125\n72#5:2126\n72#5:2130\n72#5:2132\n74#5:2133\n1#6:1526\n700#7,8:1578\n723#7,3:1586\n708#7,2:1589\n711#7,2:1634\n726#7,3:1636\n713#7:1639\n700#7,8:1641\n723#7,3:1649\n708#7,2:1652\n701#7:1654\n702#7,11:1698\n726#7,3:1709\n713#7:1712\n703#7:1713\n700#7,8:1715\n723#7,3:1723\n708#7,2:1726\n701#7:1728\n702#7,11:1772\n726#7,3:1783\n713#7:1786\n703#7:1787\n723#7,3:1810\n726#7,3:1818\n739#7,18:1822\n757#7,3:1883\n751#7:1886\n742#7:1887\n700#7,8:1889\n723#7,3:1897\n708#7,2:1900\n701#7:1902\n702#7,11:1947\n726#7,3:1958\n713#7:1961\n703#7:1962\n700#7,8:1971\n723#7,3:1979\n708#7,2:1982\n701#7:1984\n702#7,11:2029\n726#7,3:2040\n713#7:2043\n703#7:2044\n723#7,3:2127\n726#7,3:2135\n383#8,6:1591\n393#8,2:1598\n395#8,8:1603\n403#8,9:1614\n412#8,8:1626\n383#8,6:1655\n393#8,2:1662\n395#8,8:1667\n403#8,9:1678\n412#8,8:1690\n383#8,6:1729\n393#8,2:1736\n395#8,8:1741\n403#8,9:1752\n412#8,8:1764\n383#8,6:1840\n393#8,2:1847\n395#8,8:1852\n403#8,9:1863\n412#8,8:1875\n383#8,5:1903\n388#8:1909\n393#8,2:1911\n395#8,8:1916\n403#8,9:1927\n412#8,8:1939\n383#8,5:1985\n388#8:1991\n393#8,2:1993\n395#8,8:1998\n403#8,9:2009\n412#8,8:2021\n383#8,6:2071\n393#8,2:2078\n395#8,8:2083\n403#8,9:2094\n412#8,8:2106\n261#9:1597\n261#9:1661\n261#9:1735\n261#9:1814\n261#9:1846\n261#9:1910\n261#9:1992\n261#9:2077\n261#9:2131\n261#9:2134\n234#10,3:1600\n237#10,3:1623\n234#10,3:1664\n237#10,3:1687\n234#10,3:1738\n237#10,3:1761\n234#10,3:1849\n237#10,3:1872\n234#10,3:1913\n237#10,3:1936\n234#10,3:1995\n237#10,3:2018\n234#10,3:2080\n237#10,3:2103\n365#11,15:1789\n47#12:1807\n52#13:1809\n107#14:2057\n96#14,13:2058\n109#14:2114\n101#14,10:2115\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n114#1:1468,7\n490#1:1540,7\n524#1:1548,2\n524#1:1562,2\n593#1:1565\n1110#1:1963,7\n1278#1:2138\n1300#1:2150\n1312#1:2162\n1348#1:2174,7\n128#1:1462\n128#1:1463,2\n539#1:1465\n539#1:1466,2\n140#1:1475\n140#1:1476,2\n656#1:1611\n656#1:1612,2\n678#1:1675\n678#1:1676,2\n690#1:1749\n690#1:1750,2\n1058#1:1860\n1058#1:1861,2\n1094#1:1924\n1094#1:1925,2\n1192#1:2006\n1192#1:2007,2\n1221#1:2091\n1221#1:2092,2\n144#1:1478\n368#1:1513\n480#1:1528\n525#1:1550\n144#1:1479,7\n146#1:1486\n144#1:1487,4\n197#1:1491,11\n199#1:1502,11\n368#1:1514,11\n480#1:1529,11\n525#1:1551,11\n555#1:1564\n593#1:1566,11\n1196#1:2045,11\n1278#1:2139,11\n1300#1:2151,11\n1312#1:2163,11\n416#1:1525\n463#1:1527\n520#1:1547\n656#1:1577\n678#1:1640\n690#1:1714\n846#1:1788\n1048#1:1804,3\n1048#1:1808\n1050#1:1813\n1050#1:1815,3\n1058#1:1821\n1094#1:1888\n1095#1:1908\n1192#1:1970\n1193#1:1990\n1221#1:2056\n1251#1:2125\n1251#1:2126\n1253#1:2130\n1254#1:2132\n1258#1:2133\n656#1:1578,8\n656#1:1586,3\n656#1:1589,2\n656#1:1634,2\n656#1:1636,3\n656#1:1639\n678#1:1641,8\n678#1:1649,3\n678#1:1652,2\n678#1:1654\n678#1:1698,11\n678#1:1709,3\n678#1:1712\n678#1:1713\n690#1:1715,8\n690#1:1723,3\n690#1:1726,2\n690#1:1728\n690#1:1772,11\n690#1:1783,3\n690#1:1786\n690#1:1787\n1049#1:1810,3\n1049#1:1818,3\n1058#1:1822,18\n1058#1:1883,3\n1058#1:1886\n1058#1:1887\n1094#1:1889,8\n1094#1:1897,3\n1094#1:1900,2\n1094#1:1902\n1094#1:1947,11\n1094#1:1958,3\n1094#1:1961\n1094#1:1962\n1192#1:1971,8\n1192#1:1979,3\n1192#1:1982,2\n1192#1:1984\n1192#1:2029,11\n1192#1:2040,3\n1192#1:2043\n1192#1:2044\n1252#1:2127,3\n1252#1:2135,3\n656#1:1591,6\n656#1:1598,2\n656#1:1603,8\n656#1:1614,9\n656#1:1626,8\n678#1:1655,6\n678#1:1662,2\n678#1:1667,8\n678#1:1678,9\n678#1:1690,8\n690#1:1729,6\n690#1:1736,2\n690#1:1741,8\n690#1:1752,9\n690#1:1764,8\n1058#1:1840,6\n1058#1:1847,2\n1058#1:1852,8\n1058#1:1863,9\n1058#1:1875,8\n1094#1:1903,5\n1094#1:1909\n1094#1:1911,2\n1094#1:1916,8\n1094#1:1927,9\n1094#1:1939,8\n1192#1:1985,5\n1192#1:1991\n1192#1:1993,2\n1192#1:1998,8\n1192#1:2009,9\n1192#1:2021,8\n1221#1:2071,6\n1221#1:2078,2\n1221#1:2083,8\n1221#1:2094,9\n1221#1:2106,8\n656#1:1597\n678#1:1661\n690#1:1735\n1050#1:1814\n1058#1:1846\n1094#1:1910\n1192#1:1992\n1221#1:2077\n1253#1:2131\n1258#1:2134\n656#1:1600,3\n656#1:1623,3\n678#1:1664,3\n678#1:1687,3\n690#1:1738,3\n690#1:1761,3\n1058#1:1849,3\n1058#1:1872,3\n1094#1:1913,3\n1094#1:1936,3\n1192#1:1995,3\n1192#1:2018,3\n1221#1:2080,3\n1221#1:2103,3\n891#1:1789,15\n1048#1:1807\n1048#1:1809\n1221#1:2057\n1221#1:2058,13\n1221#1:2114\n1221#1:2115,10\n*E\n"})
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @Nullable
    public Owner owner;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    @Nullable
    public AndroidViewHolder interopViewFactoryHolder;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public int depth;
    public boolean H0;

    @Nullable
    public SemanticsConfiguration I0;

    @NotNull
    public final MutableVector<LayoutNode> J0;
    public boolean K0;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @NotNull
    public MeasurePolicy measurePolicy;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @NotNull
    public final IntrinsicsPolicy intrinsicsPolicy;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @NotNull
    public Density density;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @NotNull
    public LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    @NotNull
    public ViewConfiguration viewConfiguration;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    @NotNull
    public CompositionLocalMap compositionLocalMap;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    @NotNull
    public UsageByParent intrinsicsUsageByParent;

    @NotNull
    public UsageByParent S0;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public boolean canMultiMeasure;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    @NotNull
    public final NodeChain nodes;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    @NotNull
    public final LayoutNodeLayoutDelegate layoutDelegate;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    @Nullable
    public LayoutNodeSubcompositionsState subcompositionsState;

    @Nullable
    public NodeCoordinator X0;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    public boolean innerLayerCoordinatorIsDirty;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    @NotNull
    public Modifier modifier;

    /* JADX INFO: renamed from: a1, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Owner, Unit> onAttach;

    /* JADX INFO: renamed from: b1, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Owner, Unit> onDetach;

    /* JADX INFO: renamed from: c1, reason: collision with root package name and from kotlin metadata */
    public boolean needsOnPositionedDispatch;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f16799d1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f16800p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public int semanticsId;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public int compositeKeyHash;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public boolean isVirtualLookaheadRoot;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LayoutNode lookaheadRoot;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f16805u0;

    @NotNull
    public final MutableVectorWithMutationTracking<LayoutNode> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public MutableVector<LayoutNode> f16806w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f16807x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public LayoutNode f16808y0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    @NotNull
    public static final LayoutNode$Companion$ErrorMeasurePolicy$1 f16792e1 = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* JADX INFO: renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ MeasureResult mo113measure3p2s80s(MeasureScope measureScope, List list, long j10) {
            return (MeasureResult) m3673measure3p2s80s(measureScope, (List<? extends Measurable>) list, j10);
        }

        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
        public Void m3673measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    };

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    @NotNull
    public static final a f16793f1 = a.f16810p0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    @NotNull
    public static final LayoutNode$Companion$DummyViewConfiguration$1 f16794g1 = new ViewConfiguration() { // from class: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1
        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapMinTimeMillis() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapTimeoutMillis() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getLongPressTimeoutMillis() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        /* JADX INFO: renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public long mo3672getMinimumTouchTargetSizeMYxV2XQ() {
            return DpSize.INSTANCE.m4497getZeroMYxV2XQ();
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public float getTouchSlop() {
            return 16.0f;
        }
    };

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    @NotNull
    public static final d0 f16795h1 = new d0(1);

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "()V", "Constructor", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "getConstructor$ui_release", "()Lkotlin/jvm/functions/Function0;", "DummyViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getDummyViewConfiguration$ui_release", "()Landroidx/compose/ui/platform/ViewConfiguration;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "NotPlacedPlaceOrder", "", "ZComparator", "Ljava/util/Comparator;", "getZComparator$ui_release", "()Ljava/util/Comparator;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function0<LayoutNode> getConstructor$ui_release() {
            return LayoutNode.f16793f1;
        }

        @NotNull
        public final ViewConfiguration getDummyViewConfiguration$ui_release() {
            return LayoutNode.f16794g1;
        }

        @NotNull
        public final Comparator<LayoutNode> getZComparator$ui_release() {
            return LayoutNode.f16795h1;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class LayoutState {
        private static final /* synthetic */ LayoutState[] $VALUES;
        public static final LayoutState Idle;
        public static final LayoutState LayingOut;
        public static final LayoutState LookaheadLayingOut;
        public static final LayoutState LookaheadMeasuring;
        public static final LayoutState Measuring;

        static {
            LayoutState layoutState = new LayoutState("Measuring", 0);
            Measuring = layoutState;
            LayoutState layoutState2 = new LayoutState("LookaheadMeasuring", 1);
            LookaheadMeasuring = layoutState2;
            LayoutState layoutState3 = new LayoutState("LayingOut", 2);
            LayingOut = layoutState3;
            LayoutState layoutState4 = new LayoutState("LookaheadLayingOut", 3);
            LookaheadLayingOut = layoutState4;
            LayoutState layoutState5 = new LayoutState("Idle", 4);
            Idle = layoutState5;
            $VALUES = new LayoutState[]{layoutState, layoutState2, layoutState3, layoutState4, layoutState5};
        }

        public LayoutState() {
            throw null;
        }

        public static LayoutState valueOf(String str) {
            return (LayoutState) Enum.valueOf(LayoutState.class, str);
        }

        public static LayoutState[] values() {
            return (LayoutState[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u000b\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\"\u0010\f\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\r\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "height", "", "minIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "", "error", "<init>", "(Ljava/lang/String;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f16809a;

        public NoIntrinsicsMeasurePolicy(@NotNull String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f16809a = error;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m3674maxIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m3675maxIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m3676minIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m3677minIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        @NotNull
        /* JADX INFO: renamed from: maxIntrinsicHeight, reason: collision with other method in class */
        public Void m3674maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.f16809a.toString());
        }

        @NotNull
        /* JADX INFO: renamed from: maxIntrinsicWidth, reason: collision with other method in class */
        public Void m3675maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.f16809a.toString());
        }

        @NotNull
        /* JADX INFO: renamed from: minIntrinsicHeight, reason: collision with other method in class */
        public Void m3676minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.f16809a.toString());
        }

        @NotNull
        /* JADX INFO: renamed from: minIntrinsicWidth, reason: collision with other method in class */
        public Void m3677minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.f16809a.toString());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class UsageByParent {
        private static final /* synthetic */ UsageByParent[] $VALUES;
        public static final UsageByParent InLayoutBlock;
        public static final UsageByParent InMeasureBlock;
        public static final UsageByParent NotUsed;

        static {
            UsageByParent usageByParent = new UsageByParent("InMeasureBlock", 0);
            InMeasureBlock = usageByParent;
            UsageByParent usageByParent2 = new UsageByParent("InLayoutBlock", 1);
            InLayoutBlock = usageByParent2;
            UsageByParent usageByParent3 = new UsageByParent("NotUsed", 2);
            NotUsed = usageByParent3;
            $VALUES = new UsageByParent[]{usageByParent, usageByParent2, usageByParent3};
        }

        public UsageByParent() {
            throw null;
        }

        public static UsageByParent valueOf(String str) {
            return (UsageByParent) Enum.valueOf(UsageByParent.class, str);
        }

        public static UsageByParent[] values() {
            return (UsageByParent[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    public static final class a extends Lambda implements Function0<LayoutNode> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f16810p0 = new a(0);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final LayoutNode invoke() {
            int i10 = 3;
            return new LayoutNode(false, 0 == true ? 1 : 0, i10, null);
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            LayoutNode.this.getLayoutDelegate().markChildrenDirty();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @SourceDebugExtension({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode$collapsedSemantics$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1461:1\n76#2:1462\n739#3,18:1463\n757#3,3:1525\n383#4,5:1481\n388#4:1487\n393#4,2:1489\n395#4,8:1494\n403#4,9:1505\n412#4,8:1517\n1#5:1486\n261#6:1488\n234#7,3:1491\n237#7,3:1514\n1182#8:1502\n1161#8,2:1503\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode$collapsedSemantics$1\n*L\n422#1:1462\n422#1:1463,18\n422#1:1525,3\n422#1:1481,5\n422#1:1487\n422#1:1489,2\n422#1:1494,8\n422#1:1505,9\n422#1:1517,8\n422#1:1488\n422#1:1491,3\n422#1:1514,3\n422#1:1502\n422#1:1503,2\n*E\n"})
    public static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<SemanticsConfiguration> f16813q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlin.jvm.internal.Ref.ObjectRef<SemanticsConfiguration> objectRef) {
            super(0);
            this.f16813q0 = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r5v7, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
        /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
            	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
            	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
            */
        @Override // kotlin.jvm.functions.Function0
        public final kotlin.Unit invoke() {
            /*
                r10 = this;
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNode.this
                androidx.compose.ui.node.NodeChain r0 = r0.getNodes()
                r1 = 8
                int r1 = androidx.compose.ui.node.NodeKind.m3725constructorimpl(r1)
                int r2 = androidx.compose.ui.node.NodeChain.access$getAggregateChildKindSet(r0)
                r2 = r2 & r1
                if (r2 == 0) goto L9d
                androidx.compose.ui.Modifier$Node r0 = r0.getTail$ui_release()
            L17:
                if (r0 == 0) goto L9d
                int r2 = r0.getKindSet()
                r2 = r2 & r1
                if (r2 == 0) goto L97
                r2 = 0
                r3 = r0
                r4 = r2
            L23:
                if (r3 == 0) goto L97
                boolean r5 = r3 instanceof androidx.compose.ui.node.SemanticsModifierNode
                r6 = 1
                if (r5 == 0) goto L53
                androidx.compose.ui.node.SemanticsModifierNode r3 = (androidx.compose.ui.node.SemanticsModifierNode) r3
                boolean r5 = r3.getIsClearingSemantics()
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.semantics.SemanticsConfiguration> r7 = r10.f16813q0
                if (r5 == 0) goto L3e
                androidx.compose.ui.semantics.SemanticsConfiguration r5 = new androidx.compose.ui.semantics.SemanticsConfiguration
                r5.<init>()
                r7.element = r5
                r5.setClearingSemantics(r6)
            L3e:
                boolean r5 = r3.getShouldMergeDescendantSemantics()
                if (r5 == 0) goto L4b
                T r5 = r7.element
                androidx.compose.ui.semantics.SemanticsConfiguration r5 = (androidx.compose.ui.semantics.SemanticsConfiguration) r5
                r5.setMergingSemanticsOfDescendants(r6)
            L4b:
                T r5 = r7.element
                androidx.compose.ui.semantics.SemanticsConfiguration r5 = (androidx.compose.ui.semantics.SemanticsConfiguration) r5
                r3.applySemantics(r5)
                goto L92
            L53:
                int r5 = r3.getKindSet()
                r5 = r5 & r1
                if (r5 == 0) goto L92
                boolean r5 = r3 instanceof androidx.compose.ui.node.DelegatingNode
                if (r5 == 0) goto L92
                r5 = r3
                androidx.compose.ui.node.DelegatingNode r5 = (androidx.compose.ui.node.DelegatingNode) r5
                androidx.compose.ui.Modifier$Node r5 = r5.getDelegate()
                r7 = 0
                r8 = r7
            L67:
                if (r5 == 0) goto L8f
                int r9 = r5.getKindSet()
                r9 = r9 & r1
                if (r9 == 0) goto L8a
                int r8 = r8 + 1
                if (r8 != r6) goto L76
                r3 = r5
                goto L8a
            L76:
                if (r4 != 0) goto L81
                androidx.compose.runtime.collection.MutableVector r4 = new androidx.compose.runtime.collection.MutableVector
                r9 = 16
                androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r9]
                r4.<init>(r9, r7)
            L81:
                if (r3 == 0) goto L87
                r4.add(r3)
                r3 = r2
            L87:
                r4.add(r5)
            L8a:
                androidx.compose.ui.Modifier$Node r5 = r5.getChild()
                goto L67
            L8f:
                if (r8 != r6) goto L92
                goto L23
            L92:
                androidx.compose.ui.Modifier$Node r3 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r4)
                goto L23
            L97:
                androidx.compose.ui.Modifier$Node r0 = r0.getParent()
                goto L17
            L9d:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.c.invoke():java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNode() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    /* JADX INFO: renamed from: hitTest-M_7yMNQ$ui_release$default, reason: not valid java name */
    public static /* synthetic */ void m3664hitTestM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j10, HitTestResult hitTestResult, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        layoutNode.m3668hitTestM_7yMNQ$ui_release(j10, hitTestResult, z12, z11);
    }

    public static /* synthetic */ void invalidateSubtree$default(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        layoutNode.invalidateSubtree(z10);
    }

    /* JADX INFO: renamed from: lookaheadRemeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m3666lookaheadRemeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m3683getLastLookaheadConstraintsDWUhwKw();
        }
        return layoutNode.m3670lookaheadRemeasure_Sx5XlM$ui_release(constraints);
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m3667remeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m3682getLastConstraintsDWUhwKw();
        }
        return layoutNode.m3671remeasure_Sx5XlM$ui_release(constraints);
    }

    public static /* synthetic */ void requestLookaheadRelayout$ui_release$default(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.requestLookaheadRelayout$ui_release(z10);
    }

    public static /* synthetic */ void requestLookaheadRemeasure$ui_release$default(LayoutNode layoutNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        layoutNode.requestLookaheadRemeasure$ui_release(z10, z11);
    }

    public static /* synthetic */ void requestRelayout$ui_release$default(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.requestRelayout$ui_release(z10);
    }

    public static /* synthetic */ void requestRemeasure$ui_release$default(LayoutNode layoutNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        layoutNode.requestRemeasure$ui_release(z10, z11);
    }

    public final void a() {
        this.S0 = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode = content[i10];
                if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                    layoutNode.a();
                }
                i10++;
            } while (i10 < size);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void attach$ui_release(@NotNull Owner owner) {
        LayoutNode layoutNode;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.owner != null) {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + b(0)).toString());
        }
        LayoutNode layoutNode2 = this.f16808y0;
        if (layoutNode2 != null && !Intrinsics.areEqual(layoutNode2.owner, owner)) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(owner);
            sb2.append(") than the parent's owner(");
            LayoutNode parent$ui_release = getParent$ui_release();
            sb2.append(parent$ui_release != null ? parent$ui_release.owner : null);
            sb2.append("). This tree: ");
            sb2.append(b(0));
            sb2.append(" Parent tree: ");
            LayoutNode layoutNode3 = this.f16808y0;
            sb2.append(layoutNode3 != null ? layoutNode3.b(0) : null);
            throw new IllegalStateException(sb2.toString().toString());
        }
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 == null) {
            getMeasurePassDelegate$ui_release().setPlaced$ui_release(true);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.setPlaced(true);
            }
        }
        getOuterCoordinator$ui_release().setWrappedBy$ui_release(parent$ui_release2 != null ? parent$ui_release2.getInnerCoordinator$ui_release() : null);
        this.owner = owner;
        this.depth = (parent$ui_release2 != null ? parent$ui_release2.depth : -1) + 1;
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(8);
        NodeChain nodeChain = this.nodes;
        if (nodeChain.m3698hasH91voCI$ui_release(iM3725constructorimpl)) {
            invalidateSemantics$ui_release();
        }
        owner.onAttach(this);
        if (this.isVirtualLookaheadRoot) {
            e(this);
        } else {
            LayoutNode layoutNode4 = this.f16808y0;
            if (layoutNode4 == null || (layoutNode = layoutNode4.lookaheadRoot) == null) {
                layoutNode = this.lookaheadRoot;
            }
            e(layoutNode);
        }
        if (!this.f16799d1) {
            nodeChain.markAsAttached();
        }
        MutableVector<LayoutNode> vector = this.v0.getVector();
        int size = vector.getSize();
        if (size > 0) {
            LayoutNode[] content = vector.getContent();
            int i10 = 0;
            do {
                content[i10].attach$ui_release(owner);
                i10++;
            } while (i10 < size);
        }
        if (!this.f16799d1) {
            nodeChain.runAttachLifecycle();
        }
        invalidateMeasurements$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateMeasurements$ui_release();
        }
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            outerCoordinator$ui_release.onLayoutNodeAttach();
        }
        Function1<? super Owner, Unit> function1 = this.onAttach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        this.layoutDelegate.updateParentData();
        if (this.f16799d1 || !nodeChain.has$ui_release(NodeKind.m3725constructorimpl(1024) | NodeKind.m3725constructorimpl(2048) | NodeKind.m3725constructorimpl(4096))) {
            return;
        }
        for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
            if ((((NodeKind.m3725constructorimpl(1024) & head.getKindSet()) != 0) | ((NodeKind.m3725constructorimpl(2048) & head.getKindSet()) != 0) ? 1 : 0) | ((NodeKind.m3725constructorimpl(4096) & head.getKindSet()) != 0)) {
                NodeKindKt.autoInvalidateInsertedNode(head);
            }
        }
    }

    public final String b(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i12 = 0;
            do {
                sb2.append(content[i12].b(i10 + 1));
                i12++;
            } while (i12 < size);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "tree.toString()");
        if (i10 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final void c() {
        LayoutNode layoutNode;
        if (this.f16805u0 > 0) {
            this.f16807x0 = true;
        }
        if (!this.f16800p0 || (layoutNode = this.f16808y0) == null) {
            return;
        }
        layoutNode.c();
    }

    public final void clearSubtreeIntrinsicsUsage$ui_release() {
        this.S0 = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode = content[i10];
                if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                    layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
                }
                i10++;
            } while (i10 < size);
        }
    }

    public final void d(LayoutNode layoutNode) {
        if (layoutNode.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.owner != null) {
            layoutNode.detach$ui_release();
        }
        layoutNode.f16808y0 = null;
        layoutNode.getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
        if (layoutNode.f16800p0) {
            this.f16805u0--;
            MutableVector<LayoutNode> vector = layoutNode.v0.getVector();
            int size = vector.getSize();
            if (size > 0) {
                LayoutNode[] content = vector.getContent();
                int i10 = 0;
                do {
                    content[i10].getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
                    i10++;
                } while (i10 < size);
            }
        }
        c();
        onZSortedChildrenInvalidated$ui_release();
    }

    public final void detach$ui_release() {
        Owner owner = this.owner;
        if (owner == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui_release = getParent$ui_release();
            sb2.append(parent$ui_release != null ? parent$ui_release.b(0) : null);
            throw new IllegalStateException(sb2.toString().toString());
        }
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
        NodeChain nodeChain = this.nodes;
        if ((NodeChain.access$getAggregateChildKindSet(nodeChain) & iM3725constructorimpl) != 0) {
            for (Modifier.Node tail$ui_release = nodeChain.getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent()) {
                if ((tail$ui_release.getKindSet() & iM3725constructorimpl) != 0) {
                    MutableVector mutableVector = null;
                    Modifier.Node nodeAccess$pop = tail$ui_release;
                    while (nodeAccess$pop != null) {
                        if (nodeAccess$pop instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) nodeAccess$pop;
                            if (focusTargetNode.getFocusState().isFocused()) {
                                LayoutNodeKt.requireOwner(this).getFocusOwner().clearFocus(true, false);
                                focusTargetNode.scheduleInvalidationForFocusEvents$ui_release();
                            }
                        } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                            int i10 = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                                if ((delegate$ui_release.getKindSet() & iM3725constructorimpl) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        nodeAccess$pop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodeAccess$pop != null) {
                                            mutableVector.add(nodeAccess$pop);
                                            nodeAccess$pop = null;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        nodeAccess$pop = DelegatableNodeKt.access$pop(mutableVector);
                    }
                }
            }
        }
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateLayer$ui_release();
            parent$ui_release2.invalidateMeasurements$ui_release();
            LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate$ui_release = getMeasurePassDelegate$ui_release();
            UsageByParent usageByParent = UsageByParent.NotUsed;
            measurePassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
            }
        }
        this.layoutDelegate.resetAlignmentLines();
        Function1<? super Owner, Unit> function1 = this.onDetach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        if (nodeChain.m3698hasH91voCI$ui_release(NodeKind.m3725constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        nodeChain.runDetachLifecycle$ui_release();
        this.H0 = true;
        MutableVector<LayoutNode> vector = this.v0.getVector();
        int size = vector.getSize();
        if (size > 0) {
            LayoutNode[] content = vector.getContent();
            int i11 = 0;
            do {
                content[i11].detach$ui_release();
                i11++;
            } while (i11 < size);
        }
        this.H0 = false;
        nodeChain.markAsDetached$ui_release();
        owner.onDetach(this);
        this.owner = null;
        e(null);
        this.depth = 0;
        getMeasurePassDelegate$ui_release().onNodeDetached();
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release2 != null) {
            lookaheadPassDelegate$ui_release2.onNodeDetached();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void dispatchOnPositionedCallbacks$ui_release() {
        if (getLayoutState$ui_release() != LayoutState.Idle || getLayoutPending$ui_release() || getMeasurePending$ui_release() || !isPlaced()) {
            return;
        }
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(256);
        NodeChain nodeChain = this.nodes;
        if ((NodeChain.access$getAggregateChildKindSet(nodeChain) & iM3725constructorimpl) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM3725constructorimpl) != 0) {
                    Modifier.Node nodeAccess$pop = head;
                    MutableVector mutableVector = null;
                    while (nodeAccess$pop != 0) {
                        if (nodeAccess$pop instanceof GlobalPositionAwareModifierNode) {
                            GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) nodeAccess$pop;
                            globalPositionAwareModifierNode.onGloballyPositioned(DelegatableNodeKt.m3653requireCoordinator64DMado(globalPositionAwareModifierNode, NodeKind.m3725constructorimpl(256)));
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
                if ((head.getAggregateChildKindSet() & iM3725constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    public final void draw$ui_release(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getOuterCoordinator$ui_release().draw(canvas);
    }

    public final void e(LayoutNode layoutNode) {
        if (Intrinsics.areEqual(layoutNode, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = layoutNode;
        if (layoutNode != null) {
            this.layoutDelegate.ensureLookaheadDelegateCreated$ui_release();
            NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
            for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
                outerCoordinator$ui_release.ensureLookaheadDelegateCreated();
            }
        }
        invalidateMeasurements$ui_release();
    }

    public final void forEachChild(@NotNull Function1<? super LayoutNode, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                block.invoke(content[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    public final void forEachChildIndexed(@NotNull Function2<? super Integer, ? super LayoutNode, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                block.invoke(Integer.valueOf(i10), content[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    public final void forEachCoordinator$ui_release(@NotNull Function1<? super LayoutModifierNodeCoordinator, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            block.invoke(layoutModifierNodeCoordinator);
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped();
        }
    }

    public final void forEachCoordinatorIncludingInner$ui_release(@NotNull Function1<? super NodeCoordinator, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            block.invoke(outerCoordinator$ui_release);
        }
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public void forceRemeasure() {
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, 1, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, 1, null);
        }
        Constraints constraintsM3682getLastConstraintsDWUhwKw = this.layoutDelegate.m3682getLastConstraintsDWUhwKw();
        if (constraintsM3682getLastConstraintsDWUhwKw != null) {
            Owner owner = this.owner;
            if (owner != null) {
                owner.mo3780measureAndLayout0kLqBqw(this, constraintsM3682getLastConstraintsDWUhwKw.getF18296a());
                return;
            }
            return;
        }
        Owner owner2 = this.owner;
        if (owner2 != null) {
            m.f(owner2, false, 1, null);
        }
    }

    public final boolean getAlignmentLinesRequired$ui_release() {
        AlignmentLines alignmentLines;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        if (layoutNodeLayoutDelegate.getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release()) {
            return true;
        }
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNodeLayoutDelegate.getLookaheadAlignmentLinesOwner$ui_release();
        return (lookaheadAlignmentLinesOwner$ui_release == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release()) ? false : true;
    }

    /* JADX INFO: renamed from: getCanMultiMeasure$ui_release, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    @NotNull
    public final List<Measurable> getChildLookaheadMeasurables$ui_release() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.getChildDelegates$ui_release();
    }

    @NotNull
    public final List<Measurable> getChildMeasurables$ui_release() {
        return getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
    }

    @NotNull
    public final List<LayoutNode> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
    @Nullable
    public final SemanticsConfiguration getCollapsedSemantics$ui_release() {
        if (!this.nodes.m3698hasH91voCI$ui_release(NodeKind.m3725constructorimpl(8)) || this.I0 != null) {
            return this.I0;
        }
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = new SemanticsConfiguration();
        LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeSemanticsReads$ui_release(this, new c(objectRef));
        T t10 = objectRef.element;
        this.I0 = (SemanticsConfiguration) t10;
        return (SemanticsConfiguration) t10;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @ExperimentalComposeUiApi
    public int getCompositeKeyHash() {
        return this.compositeKeyHash;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public CompositionLocalMap getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return getInnerCoordinator$ui_release();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public Density getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: getDepth$ui_release, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    @NotNull
    public final List<LayoutNode> getFoldedChildren$ui_release() {
        return this.v0.asList();
    }

    public final boolean getHasFixedInnerContentConstraints$ui_release() {
        long jM3710getLastMeasurementConstraintsmsEJaDk$ui_release = getInnerCoordinator$ui_release().m3710getLastMeasurementConstraintsmsEJaDk$ui_release();
        return Constraints.m4355getHasFixedWidthimpl(jM3710getLastMeasurementConstraintsmsEJaDk$ui_release) && Constraints.m4354getHasFixedHeightimpl(jM3710getLastMeasurementConstraintsmsEJaDk$ui_release);
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getHeight() {
        return this.layoutDelegate.getHeight$ui_release();
    }

    @NotNull
    public final NodeCoordinator getInnerCoordinator$ui_release() {
        return this.nodes.getInnerCoordinator();
    }

    /* JADX INFO: renamed from: getInnerLayerCoordinatorIsDirty$ui_release, reason: from getter */
    public final boolean getInnerLayerCoordinatorIsDirty() {
        return this.innerLayerCoordinatorIsDirty;
    }

    @Override // androidx.compose.ui.node.InteroperableComposeUiNode
    @InternalComposeUiApi
    @Nullable
    public View getInteropView() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            return androidViewHolder.getView();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getInteropViewFactoryHolder$ui_release, reason: from getter */
    public final AndroidViewHolder getInteropViewFactoryHolder() {
        return this.interopViewFactoryHolder;
    }

    @NotNull
    /* JADX INFO: renamed from: getIntrinsicsPolicy$ui_release, reason: from getter */
    public final IntrinsicsPolicy getIntrinsicsPolicy() {
        return this.intrinsicsPolicy;
    }

    @NotNull
    /* JADX INFO: renamed from: getIntrinsicsUsageByParent$ui_release, reason: from getter */
    public final UsageByParent getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutDelegate$ui_release, reason: from getter */
    public final LayoutNodeLayoutDelegate getLayoutDelegate() {
        return this.layoutDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutDelegate.getLayoutPending();
    }

    @NotNull
    public final LayoutState getLayoutState$ui_release() {
        return this.layoutDelegate.getLayoutState();
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.layoutDelegate.getLookaheadLayoutPending();
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.layoutDelegate.getLookaheadMeasurePending();
    }

    @Nullable
    public final LayoutNodeLayoutDelegate.LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.layoutDelegate.getLookaheadPassDelegate();
    }

    @Nullable
    /* JADX INFO: renamed from: getLookaheadRoot$ui_release, reason: from getter */
    public final LayoutNode getLookaheadRoot() {
        return this.lookaheadRoot;
    }

    @NotNull
    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    @NotNull
    public final LayoutNodeLayoutDelegate.MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.layoutDelegate.getMeasurePassDelegate();
    }

    public final boolean getMeasurePending$ui_release() {
        return this.layoutDelegate.getMeasurePending();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @NotNull
    public final UsageByParent getMeasuredByParent$ui_release() {
        return getMeasurePassDelegate$ui_release().getMeasuredByParent();
    }

    @NotNull
    public final UsageByParent getMeasuredByParentInLookahead$ui_release() {
        UsageByParent measuredByParent$ui_release;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        return (lookaheadPassDelegate$ui_release == null || (measuredByParent$ui_release = lookaheadPassDelegate$ui_release.getMeasuredByParent()) == null) ? UsageByParent.NotUsed : measuredByParent$ui_release;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @NotNull
    public List<ModifierInfo> getModifierInfo() {
        return this.nodes.getModifierInfo();
    }

    /* JADX INFO: renamed from: getNeedsOnPositionedDispatch$ui_release, reason: from getter */
    public final boolean getNeedsOnPositionedDispatch() {
        return this.needsOnPositionedDispatch;
    }

    @NotNull
    /* JADX INFO: renamed from: getNodes$ui_release, reason: from getter */
    public final NodeChain getNodes() {
        return this.nodes;
    }

    @Nullable
    public final Function1<Owner, Unit> getOnAttach$ui_release() {
        return this.onAttach;
    }

    @Nullable
    public final Function1<Owner, Unit> getOnDetach$ui_release() {
        return this.onDetach;
    }

    @NotNull
    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.nodes.getOuterCoordinator();
    }

    @Nullable
    /* JADX INFO: renamed from: getOwner$ui_release, reason: from getter */
    public final Owner getOwner() {
        return this.owner;
    }

    @Nullable
    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this.f16808y0;
        while (layoutNode != null && layoutNode.f16800p0) {
            layoutNode = layoutNode.f16808y0;
        }
        return layoutNode;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @Nullable
    public LayoutInfo getParentInfo() {
        return getParent$ui_release();
    }

    public final int getPlaceOrder$ui_release() {
        return getMeasurePassDelegate$ui_release().getPlaceOrder();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getSemanticsId() {
        return this.semanticsId;
    }

    @Nullable
    /* JADX INFO: renamed from: getSubcompositionsState$ui_release, reason: from getter */
    public final LayoutNodeSubcompositionsState getSubcompositionsState() {
        return this.subcompositionsState;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getWidth() {
        return this.layoutDelegate.getWidth$ui_release();
    }

    @NotNull
    public final MutableVector<LayoutNode> getZSortedChildren() {
        boolean z10 = this.K0;
        MutableVector<LayoutNode> mutableVector = this.J0;
        if (z10) {
            mutableVector.clear();
            mutableVector.addAll(mutableVector.getSize(), get_children$ui_release());
            mutableVector.sortWith(f16795h1);
            this.K0 = false;
        }
        return mutableVector;
    }

    @NotNull
    public final MutableVector<LayoutNode> get_children$ui_release() {
        updateChildrenIfDirty$ui_release();
        if (this.f16805u0 == 0) {
            return this.v0.getVector();
        }
        MutableVector<LayoutNode> mutableVector = this.f16806w0;
        Intrinsics.checkNotNull(mutableVector);
        return mutableVector;
    }

    /* JADX INFO: renamed from: hitTest-M_7yMNQ$ui_release, reason: not valid java name */
    public final void m3668hitTestM_7yMNQ$ui_release(long pointerPosition, @NotNull HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        getOuterCoordinator$ui_release().m3713hitTestYqVAtuI(NodeCoordinator.INSTANCE.getPointerInputSource(), getOuterCoordinator$ui_release().m3709fromParentPositionMKHz9U(pointerPosition), hitTestResult, isTouchEvent, isInLayer);
    }

    /* JADX INFO: renamed from: hitTestSemantics-M_7yMNQ$ui_release, reason: not valid java name */
    public final void m3669hitTestSemanticsM_7yMNQ$ui_release(long pointerPosition, @NotNull HitTestResult hitSemanticsEntities, boolean isTouchEvent, boolean isInLayer) {
        Intrinsics.checkNotNullParameter(hitSemanticsEntities, "hitSemanticsEntities");
        getOuterCoordinator$ui_release().m3713hitTestYqVAtuI(NodeCoordinator.INSTANCE.getSemanticsSource(), getOuterCoordinator$ui_release().m3709fromParentPositionMKHz9U(pointerPosition), hitSemanticsEntities, true, isInLayer);
    }

    public final void ignoreRemeasureRequests$ui_release(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.H0 = true;
        block.invoke();
        this.H0 = false;
    }

    public final void insertAt$ui_release(int index, @NotNull LayoutNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (instance.f16808y0 != null) {
            StringBuilder sb2 = new StringBuilder("Cannot insert ");
            sb2.append(instance);
            sb2.append(" because it already has a parent. This tree: ");
            sb2.append(b(0));
            sb2.append(" Other tree: ");
            LayoutNode layoutNode = instance.f16808y0;
            sb2.append(layoutNode != null ? layoutNode.b(0) : null);
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (instance.owner != null) {
            throw new IllegalStateException(("Cannot insert " + instance + " because it already has an owner. This tree: " + b(0) + " Other tree: " + instance.b(0)).toString());
        }
        instance.f16808y0 = this;
        this.v0.add(index, instance);
        onZSortedChildrenInvalidated$ui_release();
        if (instance.f16800p0) {
            this.f16805u0++;
        }
        c();
        Owner owner = this.owner;
        if (owner != null) {
            instance.attach$ui_release(owner);
        }
        if (instance.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() + 1);
        }
    }

    public final void invalidateLayer$ui_release() {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
            NodeCoordinator wrappedBy = getOuterCoordinator$ui_release().getWrappedBy();
            this.X0 = null;
            while (!Intrinsics.areEqual(innerCoordinator$ui_release, wrappedBy)) {
                if ((innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getLayer() : null) != null) {
                    this.X0 = innerCoordinator$ui_release;
                    break;
                }
                innerCoordinator$ui_release = innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getWrappedBy() : null;
            }
        }
        NodeCoordinator nodeCoordinator = this.X0;
        if (nodeCoordinator != null && nodeCoordinator.getLayer() == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public final void invalidateLayers$ui_release() {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            OwnedLayer layer = layoutModifierNodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped();
        }
        OwnedLayer layer2 = getInnerCoordinator$ui_release().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void invalidateMeasurements$ui_release() {
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, 3, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, 3, null);
        }
    }

    public final void invalidateParentData$ui_release() {
        this.layoutDelegate.invalidateParentData();
    }

    public final void invalidateSemantics$ui_release() {
        this.I0 = null;
        LayoutNodeKt.requireOwner(this).onSemanticsChange();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public final void invalidateSubtree(boolean r11) {
        /*
            r10 = this;
            if (r11 == 0) goto Lb
            androidx.compose.ui.node.LayoutNode r11 = r10.getParent$ui_release()
            if (r11 == 0) goto Lb
            r11.invalidateLayer$ui_release()
        Lb:
            r10.invalidateSemantics$ui_release()
            r11 = 3
            r0 = 0
            r1 = 0
            requestRemeasure$ui_release$default(r10, r0, r0, r11, r1)
            r11 = 2
            int r2 = androidx.compose.ui.node.NodeKind.m3725constructorimpl(r11)
            androidx.compose.ui.node.NodeChain r3 = r10.nodes
            int r4 = androidx.compose.ui.node.NodeChain.access$getAggregateChildKindSet(r3)
            r4 = r4 & r2
            r5 = 1
            if (r4 == 0) goto L9b
            androidx.compose.ui.Modifier$Node r3 = r3.getHead()
        L27:
            if (r3 == 0) goto L9b
            int r4 = r3.getKindSet()
            r4 = r4 & r2
            if (r4 == 0) goto L8f
            r6 = r1
            r4 = r3
        L32:
            if (r4 == 0) goto L8f
            boolean r7 = r4 instanceof androidx.compose.ui.node.LayoutModifierNode
            if (r7 == 0) goto L4c
            androidx.compose.ui.node.LayoutModifierNode r4 = (androidx.compose.ui.node.LayoutModifierNode) r4
            int r7 = androidx.compose.ui.node.NodeKind.m3725constructorimpl(r11)
            androidx.compose.ui.node.NodeCoordinator r4 = androidx.compose.ui.node.DelegatableNodeKt.m3653requireCoordinator64DMado(r4, r7)
            androidx.compose.ui.node.OwnedLayer r4 = r4.getLayer()
            if (r4 == 0) goto L8a
            r4.invalidate()
            goto L8a
        L4c:
            int r7 = r4.getKindSet()
            r7 = r7 & r2
            if (r7 == 0) goto L8a
            boolean r7 = r4 instanceof androidx.compose.ui.node.DelegatingNode
            if (r7 == 0) goto L8a
            r7 = r4
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate()
            r8 = r0
        L5f:
            if (r7 == 0) goto L87
            int r9 = r7.getKindSet()
            r9 = r9 & r2
            if (r9 == 0) goto L82
            int r8 = r8 + 1
            if (r8 != r5) goto L6e
            r4 = r7
            goto L82
        L6e:
            if (r6 != 0) goto L79
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            r9 = 16
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r9]
            r6.<init>(r9, r0)
        L79:
            if (r4 == 0) goto L7f
            r6.add(r4)
            r4 = r1
        L7f:
            r6.add(r7)
        L82:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild()
            goto L5f
        L87:
            if (r8 != r5) goto L8a
            goto L32
        L8a:
            androidx.compose.ui.Modifier$Node r4 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r6)
            goto L32
        L8f:
            int r4 = r3.getAggregateChildKindSet()
            r4 = r4 & r2
            if (r4 == 0) goto L9b
            androidx.compose.ui.Modifier$Node r3 = r3.getChild()
            goto L27
        L9b:
            androidx.compose.runtime.collection.MutableVector r11 = r10.get_children$ui_release()
            int r1 = r11.getSize()
            if (r1 <= 0) goto Lb4
            java.lang.Object[] r11 = r11.getContent()
            r2 = r0
        Laa:
            r3 = r11[r2]
            androidx.compose.ui.node.LayoutNode r3 = (androidx.compose.ui.node.LayoutNode) r3
            r3.invalidateSubtree(r0)
            int r2 = r2 + r5
            if (r2 < r1) goto Laa
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.invalidateSubtree(boolean):void");
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isAttached() {
        return this.owner != null;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isPlaced() {
        return getMeasurePassDelegate$ui_release().getIsPlaced();
    }

    @Nullable
    public final Boolean isPlacedInLookahead() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            return Boolean.valueOf(lookaheadPassDelegate$ui_release.getIsPlaced());
        }
        return null;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    /* JADX INFO: renamed from: isVirtualLookaheadRoot$ui_release, reason: from getter */
    public final boolean getIsVirtualLookaheadRoot() {
        return this.isVirtualLookaheadRoot;
    }

    /* JADX INFO: renamed from: lookaheadRemeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m3670lookaheadRemeasure_Sx5XlM$ui_release(@Nullable Constraints constraints) {
        if (constraints == null || this.lookaheadRoot == null) {
            return false;
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.m3686remeasureBRTryo0(constraints.getF18296a());
    }

    public final void lookaheadReplace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            a();
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        lookaheadPassDelegate$ui_release.replace();
    }

    public final void markLayoutPending$ui_release() {
        this.layoutDelegate.markLayoutPending$ui_release();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.layoutDelegate.markLookaheadLayoutPending$ui_release();
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.layoutDelegate.markLookaheadMeasurePending$ui_release();
    }

    public final void markMeasurePending$ui_release() {
        this.layoutDelegate.markMeasurePending$ui_release();
    }

    public final void move$ui_release(int from, int to, int count) {
        if (from == to) {
            return;
        }
        for (int i10 = 0; i10 < count; i10++) {
            int i11 = from > to ? from + i10 : from;
            int i12 = from > to ? to + i10 : (to + count) - 2;
            MutableVectorWithMutationTracking<LayoutNode> mutableVectorWithMutationTracking = this.v0;
            mutableVectorWithMutationTracking.add(i12, mutableVectorWithMutationTracking.removeAt(i11));
        }
        onZSortedChildrenInvalidated$ui_release();
        c();
        invalidateMeasurements$ui_release();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onDeactivate();
        }
        this.f16799d1 = true;
        this.nodes.resetState$ui_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public void onLayoutComplete() {
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(128);
        boolean zM3734getIncludeSelfInTraversalH91voCI = NodeKindKt.m3734getIncludeSelfInTraversalH91voCI(iM3725constructorimpl);
        Modifier.Node tail = innerCoordinator$ui_release.getTail();
        if (!zM3734getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeD = innerCoordinator$ui_release.d(zM3734getIncludeSelfInTraversalH91voCI); nodeD != null && (nodeD.getAggregateChildKindSet() & iM3725constructorimpl) != 0; nodeD = nodeD.getChild()) {
            if ((nodeD.getKindSet() & iM3725constructorimpl) != 0) {
                Modifier.Node nodeAccess$pop = nodeD;
                MutableVector mutableVector = null;
                while (nodeAccess$pop != 0) {
                    if (nodeAccess$pop instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) nodeAccess$pop).onPlaced(getInnerCoordinator$ui_release());
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

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onRelease();
        }
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            outerCoordinator$ui_release.onRelease();
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (!isAttached()) {
            throw new IllegalArgumentException("onReuse is only expected on attached node".toString());
        }
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onReuse();
        }
        boolean z10 = this.f16799d1;
        NodeChain nodeChain = this.nodes;
        if (z10) {
            this.f16799d1 = false;
        } else {
            nodeChain.resetState$ui_release();
        }
        setSemanticsId(SemanticsModifierKt.generateSemanticsId());
        nodeChain.markAsAttached();
        nodeChain.runAttachLifecycle();
    }

    public final void onZSortedChildrenInvalidated$ui_release() {
        if (!this.f16800p0) {
            this.K0 = true;
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.onZSortedChildrenInvalidated$ui_release();
        }
    }

    public final void place$ui_release(int x4, int y7) {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            a();
        }
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate$ui_release = getMeasurePassDelegate$ui_release();
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
        int measuredWidth = measurePassDelegate$ui_release.getMeasuredWidth();
        LayoutDirection layoutDirection = getLayoutDirection();
        LayoutNode parent$ui_release = getParent$ui_release();
        NodeCoordinator innerCoordinator$ui_release = parent$ui_release != null ? parent$ui_release.getInnerCoordinator$ui_release() : null;
        LayoutCoordinates layoutCoordinates = Placeable.PlacementScope.f16651c;
        int parentWidth = companion.getParentWidth();
        LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.f16652d;
        Placeable.PlacementScope.f16650b = measuredWidth;
        Placeable.PlacementScope.f16649a = layoutDirection;
        boolean zAccess$configureForPlacingForAlignment = Placeable.PlacementScope.Companion.access$configureForPlacingForAlignment(companion, innerCoordinator$ui_release);
        Placeable.PlacementScope.placeRelative$default(companion, measurePassDelegate$ui_release, x4, y7, 0.0f, 4, null);
        if (innerCoordinator$ui_release != null) {
            innerCoordinator$ui_release.setPlacingForAlignment$ui_release(zAccess$configureForPlacingForAlignment);
        }
        Placeable.PlacementScope.f16650b = parentWidth;
        Placeable.PlacementScope.f16649a = parentLayoutDirection;
        Placeable.PlacementScope.f16651c = layoutCoordinates;
        Placeable.PlacementScope.f16652d = layoutNodeLayoutDelegate;
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m3671remeasure_Sx5XlM$ui_release(@Nullable Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreeIntrinsicsUsage$ui_release();
        }
        return getMeasurePassDelegate$ui_release().m3688remeasureBRTryo0(constraints.getF18296a());
    }

    public final void removeAll$ui_release() {
        MutableVectorWithMutationTracking<LayoutNode> mutableVectorWithMutationTracking = this.v0;
        int size = mutableVectorWithMutationTracking.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                mutableVectorWithMutationTracking.clear();
                return;
            }
            d(mutableVectorWithMutationTracking.get(size));
        }
    }

    public final void removeAt$ui_release(int index, int count) {
        if (count < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("count (", count, ") must be greater than 0").toString());
        }
        int i10 = (count + index) - 1;
        if (index > i10) {
            return;
        }
        while (true) {
            d(this.v0.removeAt(i10));
            if (i10 == index) {
                return;
            } else {
                i10--;
            }
        }
    }

    public final void replace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            a();
        }
        getMeasurePassDelegate$ui_release().replace();
    }

    public final void requestLookaheadRelayout$ui_release(boolean forceRequest) {
        Owner owner;
        if (this.f16800p0 || (owner = this.owner) == null) {
            return;
        }
        owner.onRequestRelayout(this, true, forceRequest);
    }

    public final void requestLookaheadRemeasure$ui_release(boolean forceRequest, boolean scheduleMeasureAndLayout) {
        if (this.lookaheadRoot == null) {
            throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
        }
        Owner owner = this.owner;
        if (owner == null || this.H0 || this.f16800p0) {
            return;
        }
        owner.onRequestMeasure(this, true, forceRequest, scheduleMeasureAndLayout);
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        lookaheadPassDelegate$ui_release.invalidateIntrinsicsParent(forceRequest);
    }

    public final void requestRelayout$ui_release(boolean forceRequest) {
        Owner owner;
        if (this.f16800p0 || (owner = this.owner) == null) {
            return;
        }
        m.h(owner, this, false, forceRequest, 2, null);
    }

    public final void requestRemeasure$ui_release(boolean forceRequest, boolean scheduleMeasureAndLayout) {
        Owner owner;
        if (this.H0 || this.f16800p0 || (owner = this.owner) == null) {
            return;
        }
        m.g(owner, this, false, forceRequest, scheduleMeasureAndLayout, 2, null);
        getMeasurePassDelegate$ui_release().invalidateIntrinsicsParent(forceRequest);
    }

    public final void rescheduleRemeasureOrRelayout$ui_release(@NotNull LayoutNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (WhenMappings.$EnumSwitchMapping$0[it.getLayoutState$ui_release().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + it.getLayoutState$ui_release());
        }
        if (it.getMeasurePending$ui_release()) {
            requestRemeasure$ui_release$default(it, true, false, 2, null);
            return;
        }
        if (it.getLayoutPending$ui_release()) {
            it.requestRelayout$ui_release(true);
        } else if (it.getLookaheadMeasurePending$ui_release()) {
            requestLookaheadRemeasure$ui_release$default(it, true, false, 2, null);
        } else if (it.getLookaheadLayoutPending$ui_release()) {
            it.requestLookaheadRelayout$ui_release(true);
        }
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode = content[i10];
                UsageByParent usageByParent = layoutNode.S0;
                layoutNode.intrinsicsUsageByParent = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                }
                i10++;
            } while (i10 < size);
        }
    }

    public final void setCanMultiMeasure$ui_release(boolean z10) {
        this.canMultiMeasure = z10;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @ExperimentalComposeUiApi
    public void setCompositeKeyHash(int i10) {
        this.compositeKeyHash = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setCompositionLocalMap(@org.jetbrains.annotations.NotNull androidx.compose.runtime.CompositionLocalMap r10) {
        /*
            r9 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r9.compositionLocalMap = r10
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r0 = r10.get(r0)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
            r9.setDensity(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r0 = r10.get(r0)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.ui.unit.LayoutDirection) r0
            r9.setLayoutDirection(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r10 = r10.get(r0)
            androidx.compose.ui.platform.ViewConfiguration r10 = (androidx.compose.ui.platform.ViewConfiguration) r10
            r9.setViewConfiguration(r10)
            r10 = 32768(0x8000, float:4.5918E-41)
            int r10 = androidx.compose.ui.node.NodeKind.m3725constructorimpl(r10)
            androidx.compose.ui.node.NodeChain r0 = r9.nodes
            int r1 = androidx.compose.ui.node.NodeChain.access$getAggregateChildKindSet(r0)
            r1 = r1 & r10
            if (r1 == 0) goto Lba
            androidx.compose.ui.Modifier$Node r0 = r0.getHead()
        L43:
            if (r0 == 0) goto Lba
            int r1 = r0.getKindSet()
            r1 = r1 & r10
            if (r1 == 0) goto Lae
            r1 = 0
            r2 = r0
            r3 = r1
        L4f:
            if (r2 == 0) goto Lae
            boolean r4 = r2 instanceof androidx.compose.ui.node.CompositionLocalConsumerModifierNode
            r5 = 1
            if (r4 == 0) goto L6a
            androidx.compose.ui.node.CompositionLocalConsumerModifierNode r2 = (androidx.compose.ui.node.CompositionLocalConsumerModifierNode) r2
            androidx.compose.ui.Modifier$Node r2 = r2.getNode()
            boolean r4 = r2.getIsAttached()
            if (r4 == 0) goto L66
            androidx.compose.ui.node.NodeKindKt.autoInvalidateUpdatedNode(r2)
            goto La9
        L66:
            r2.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(r5)
            goto La9
        L6a:
            int r4 = r2.getKindSet()
            r4 = r4 & r10
            if (r4 == 0) goto La9
            boolean r4 = r2 instanceof androidx.compose.ui.node.DelegatingNode
            if (r4 == 0) goto La9
            r4 = r2
            androidx.compose.ui.node.DelegatingNode r4 = (androidx.compose.ui.node.DelegatingNode) r4
            androidx.compose.ui.Modifier$Node r4 = r4.getDelegate()
            r6 = 0
            r7 = r6
        L7e:
            if (r4 == 0) goto La6
            int r8 = r4.getKindSet()
            r8 = r8 & r10
            if (r8 == 0) goto La1
            int r7 = r7 + 1
            if (r7 != r5) goto L8d
            r2 = r4
            goto La1
        L8d:
            if (r3 != 0) goto L98
            androidx.compose.runtime.collection.MutableVector r3 = new androidx.compose.runtime.collection.MutableVector
            r8 = 16
            androidx.compose.ui.Modifier$Node[] r8 = new androidx.compose.ui.Modifier.Node[r8]
            r3.<init>(r8, r6)
        L98:
            if (r2 == 0) goto L9e
            r3.add(r2)
            r2 = r1
        L9e:
            r3.add(r4)
        La1:
            androidx.compose.ui.Modifier$Node r4 = r4.getChild()
            goto L7e
        La6:
            if (r7 != r5) goto La9
            goto L4f
        La9:
            androidx.compose.ui.Modifier$Node r2 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r3)
            goto L4f
        Lae:
            int r1 = r0.getAggregateChildKindSet()
            r1 = r1 & r10
            if (r1 == 0) goto Lba
            androidx.compose.ui.Modifier$Node r0 = r0.getChild()
            goto L43
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.setCompositionLocalMap(androidx.compose.runtime.CompositionLocalMap):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setDensity(@NotNull Density value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.density, value)) {
            return;
        }
        this.density = value;
        invalidateMeasurements$ui_release();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(16);
        NodeChain nodeChain = this.nodes;
        if ((NodeChain.access$getAggregateChildKindSet(nodeChain) & iM3725constructorimpl) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM3725constructorimpl) != 0) {
                    Modifier.Node nodeAccess$pop = head;
                    MutableVector mutableVector = null;
                    while (nodeAccess$pop != 0) {
                        if (nodeAccess$pop instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) nodeAccess$pop).onDensityChange();
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
                if ((head.getAggregateChildKindSet() & iM3725constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    public final void setDepth$ui_release(int i10) {
        this.depth = i10;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui_release(boolean z10) {
        this.innerLayerCoordinatorIsDirty = z10;
    }

    public final void setInteropViewFactoryHolder$ui_release(@Nullable AndroidViewHolder androidViewHolder) {
        this.interopViewFactoryHolder = androidViewHolder;
    }

    public final void setIntrinsicsUsageByParent$ui_release(@NotNull UsageByParent usageByParent) {
        Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
        this.intrinsicsUsageByParent = usageByParent;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setLayoutDirection(@NotNull LayoutDirection value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.layoutDirection != value) {
            this.layoutDirection = value;
            invalidateMeasurements$ui_release();
            LayoutNode parent$ui_release = getParent$ui_release();
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
            invalidateLayers$ui_release();
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setMeasurePolicy(@NotNull MeasurePolicy value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.measurePolicy, value)) {
            return;
        }
        this.measurePolicy = value;
        this.intrinsicsPolicy.updateFrom(getMeasurePolicy());
        invalidateMeasurements$ui_release();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setModifier(@NotNull Modifier value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f16800p0 && getModifier() != Modifier.INSTANCE) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        this.modifier = value;
        NodeChain nodeChain = this.nodes;
        nodeChain.updateFrom$ui_release(value);
        this.layoutDelegate.updateParentData();
        if (nodeChain.m3698hasH91voCI$ui_release(NodeKind.m3725constructorimpl(512)) && this.lookaheadRoot == null) {
            e(this);
        }
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z10) {
        this.needsOnPositionedDispatch = z10;
    }

    public final void setOnAttach$ui_release(@Nullable Function1<? super Owner, Unit> function1) {
        this.onAttach = function1;
    }

    public final void setOnDetach$ui_release(@Nullable Function1<? super Owner, Unit> function1) {
        this.onDetach = function1;
    }

    public void setSemanticsId(int i10) {
        this.semanticsId = i10;
    }

    public final void setSubcompositionsState$ui_release(@Nullable LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setViewConfiguration(@NotNull ViewConfiguration value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.viewConfiguration, value)) {
            return;
        }
        this.viewConfiguration = value;
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(16);
        NodeChain nodeChain = this.nodes;
        if ((NodeChain.access$getAggregateChildKindSet(nodeChain) & iM3725constructorimpl) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM3725constructorimpl) != 0) {
                    Modifier.Node nodeAccess$pop = head;
                    MutableVector mutableVector = null;
                    while (nodeAccess$pop != 0) {
                        if (nodeAccess$pop instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) nodeAccess$pop).onViewConfigurationChange();
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
                if ((head.getAggregateChildKindSet() & iM3725constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    public final void setVirtualLookaheadRoot$ui_release(boolean z10) {
        this.isVirtualLookaheadRoot = z10;
    }

    @NotNull
    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final void updateChildrenIfDirty$ui_release() {
        if (this.f16805u0 <= 0 || !this.f16807x0) {
            return;
        }
        int i10 = 0;
        this.f16807x0 = false;
        MutableVector<LayoutNode> mutableVector = this.f16806w0;
        if (mutableVector == null) {
            mutableVector = new MutableVector<>(new LayoutNode[16], 0);
            this.f16806w0 = mutableVector;
        }
        mutableVector.clear();
        MutableVector<LayoutNode> vector = this.v0.getVector();
        int size = vector.getSize();
        if (size > 0) {
            LayoutNode[] content = vector.getContent();
            do {
                LayoutNode layoutNode = content[i10];
                if (layoutNode.f16800p0) {
                    mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui_release());
                } else {
                    mutableVector.add(layoutNode);
                }
                i10++;
            } while (i10 < size);
        }
        this.layoutDelegate.markChildrenDirty();
    }

    public LayoutNode(boolean z10, int i10) {
        this.f16800p0 = z10;
        this.semanticsId = i10;
        this.v0 = new MutableVectorWithMutationTracking<>(new MutableVector(new LayoutNode[16], 0), new b());
        this.J0 = new MutableVector<>(new LayoutNode[16], 0);
        this.K0 = true;
        this.measurePolicy = f16792e1;
        this.intrinsicsPolicy = new IntrinsicsPolicy(this);
        this.density = LayoutNodeKt.f16816a;
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = f16794g1;
        this.compositionLocalMap = CompositionLocalMap.INSTANCE.getEmpty();
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.intrinsicsUsageByParent = usageByParent;
        this.S0 = usageByParent;
        this.nodes = new NodeChain(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this.modifier = Modifier.INSTANCE;
    }

    @Deprecated(message = "Temporary API to support ConstraintLayout prototyping.")
    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getCompositeKeyHash$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    public /* synthetic */ LayoutNode(boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? SemanticsModifierKt.generateSemanticsId() : i10);
    }
}
