package androidx.compose.ui.semantics;

import androidx.camera.core.impl.utils.c;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import bk.d;
import com.bbva.ui.component.menu.model.BaseMenuItem;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00020\b\u001a\u001e\u0010\u000f\u001a\u00020\u0001*\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u0000\u001a2\u0010\u0016\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u001a\u0010\u0015\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b\u001a&\u0010\u0018\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0017\u001a&\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0017\u001aP\u0010 \u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b28\u0010\u0015\u001a4\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001a\u001a*\u0010!\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\u000b\u001a,\u0010\"\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b\u001a,\u0010$\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b\u001a,\u0010%\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b\u001a&\u0010&\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0017\u001ae\u0010+\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2M\u0010\u0015\u001aI\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b()\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u0014\u0018\u00010'\u001a&\u0010,\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0017\u001a&\u0010-\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0017\u001a&\u0010.\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0017\u001a&\u0010/\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0017\u001a&\u00100\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0017\u001a&\u00101\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0017\u001a&\u00102\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0017\u001a&\u00103\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0017\u001a&\u00104\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0017\u001a&\u00105\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0017\u001a&\u00106\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0017\"(\u0010<\u001a\u00020\b*\u00020\u00002\u0006\u00107\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;\"/\u0010B\u001a\u00020\b*\u00020\u00002\u0006\u0010=\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b>\u00109\"\u0004\b?\u0010;*\u0004\b@\u0010A\"/\u0010I\u001a\u00020C*\u00020\u00002\u0006\u0010=\u001a\u00020C8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G*\u0004\bH\u0010A\"/\u0010M\u001a\u00020\b*\u00020\u00002\u0006\u0010=\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bJ\u00109\"\u0004\bK\u0010;*\u0004\bL\u0010A\"2\u0010T\u001a\u00020N*\u00020\u00002\u0006\u0010=\u001a\u00020N8F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0012\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R*\u0004\bS\u0010A\"/\u0010Z\u001a\u00020\u0014*\u00020\u00002\u0006\u0010=\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X*\u0004\bY\u0010A\"5\u0010[\u001a\u00020\u0014*\u00020\u00002\u0006\u0010=\u001a\u00020\u00148F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\b]\u0010^\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010X*\u0004\b_\u0010A\"/\u0010`\u001a\u00020\u0014*\u00020\u00002\u0006\u0010=\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b`\u0010V\"\u0004\ba\u0010X*\u0004\bb\u0010A\"/\u0010h\u001a\u00020\u001b*\u00020\u00002\u0006\u0010=\u001a\u00020\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bc\u0010d\"\u0004\be\u0010f*\u0004\bg\u0010A\"/\u0010o\u001a\u00020i*\u00020\u00002\u0006\u0010=\u001a\u00020i8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bj\u0010k\"\u0004\bl\u0010m*\u0004\bn\u0010A\"/\u0010s\u001a\u00020i*\u00020\u00002\u0006\u0010=\u001a\u00020i8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bp\u0010k\"\u0004\bq\u0010m*\u0004\br\u0010A\"2\u0010x\u001a\u00020t*\u00020\u00002\u0006\u0010=\u001a\u00020t8F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0012\u001a\u0004\bu\u0010P\"\u0004\bv\u0010R*\u0004\bw\u0010A\"/\u0010|\u001a\u00020\b*\u00020\u00002\u0006\u0010=\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\by\u00109\"\u0004\bz\u0010;*\u0004\b{\u0010A\")\u0010\u0080\u0001\u001a\u00020#*\u00020\u00002\u0006\u00107\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b}\u0010~\"\u0004\b$\u0010\u007f\"3\u0010\u0084\u0001\u001a\u00020#*\u00020\u00002\u0006\u0010=\u001a\u00020#8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0081\u0001\u0010~\"\u0005\b\u0082\u0001\u0010\u007f*\u0005\b\u0083\u0001\u0010A\":\u0010\u008b\u0001\u001a\u00030\u0085\u0001*\u00020\u00002\u0007\u0010=\u001a\u00030\u0085\u00018F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0017\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001*\u0005\b\u008a\u0001\u0010A\"8\u0010\u0090\u0001\u001a\u00030\u008c\u0001*\u00020\u00002\u0007\u0010=\u001a\u00030\u008c\u00018F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0015\u001a\u0005\b\u008d\u0001\u0010P\"\u0005\b\u008e\u0001\u0010R*\u0005\b\u008f\u0001\u0010A\"3\u0010\u0094\u0001\u001a\u00020\u0014*\u00020\u00002\u0006\u0010=\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0091\u0001\u0010V\"\u0005\b\u0092\u0001\u0010X*\u0005\b\u0093\u0001\u0010A\"7\u0010\u009b\u0001\u001a\u00030\u0095\u0001*\u00020\u00002\u0007\u0010=\u001a\u00030\u0095\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001*\u0005\b\u009a\u0001\u0010A\"7\u0010¢\u0001\u001a\u00030\u009c\u0001*\u00020\u00002\u0007\u0010=\u001a\u00030\u009c\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001*\u0005\b¡\u0001\u0010A\"7\u0010©\u0001\u001a\u00030£\u0001*\u00020\u00002\u0007\u0010=\u001a\u00030£\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001*\u0005\b¨\u0001\u0010A\"E\u0010±\u0001\u001a\n\u0012\u0005\u0012\u00030«\u00010ª\u0001*\u00020\u00002\u000e\u0010=\u001a\n\u0012\u0005\u0012\u00030«\u00010ª\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001*\u0005\b°\u0001\u0010A\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006²\u0001"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "heading", BaseMenuItem.STATE_DISABLED, "invisibleToUser", "popup", "dialog", "password", "", "description", "error", "Lkotlin/Function1;", "", "", "mapping", "indexForKey", "selectableGroup", "label", "", "Landroidx/compose/ui/text/TextLayoutResult;", "", "action", "getTextLayoutResult", "Lkotlin/Function0;", "onClick", "onLongClick", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "x", "y", "scrollBy", "scrollToIndex", "setProgress", "Landroidx/compose/ui/text/AnnotatedString;", "setText", "insertTextAtCursor", "performImeAction", "Lkotlin/Function3;", "startIndex", "endIndex", "relativeToOriginalText", "setSelection", "copyText", "cutText", "pasteText", "expand", "collapse", "dismiss", "requestFocus", "pageUp", "pageDown", "pageLeft", "pageRight", "value", "getContentDescription", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", "setContentDescription", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;)V", "contentDescription", "<set-?>", "getStateDescription", "setStateDescription", "getStateDescription$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "stateDescription", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "getProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "setProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ProgressBarRangeInfo;)V", "getProgressBarRangeInfo$delegate", "progressBarRangeInfo", "getPaneTitle", "setPaneTitle", "getPaneTitle$delegate", "paneTitle", "Landroidx/compose/ui/semantics/LiveRegionMode;", "getLiveRegion", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", "setLiveRegion-hR3wRGc", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;I)V", "getLiveRegion$delegate", "liveRegion", "getFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", "setFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V", "getFocused$delegate", "focused", "isContainer", "setContainer", "isContainer$annotations", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "isContainer$delegate", "isTraversalGroup", "setTraversalGroup", "isTraversalGroup$delegate", "getTraversalIndex", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", "setTraversalIndex", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;F)V", "getTraversalIndex$delegate", "traversalIndex", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "getHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", "setHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "getHorizontalScrollAxisRange$delegate", "horizontalScrollAxisRange", "getVerticalScrollAxisRange", "setVerticalScrollAxisRange", "getVerticalScrollAxisRange$delegate", "verticalScrollAxisRange", "Landroidx/compose/ui/semantics/Role;", "getRole", "setRole-kuIjeqM", "getRole$delegate", "role", "getTestTag", "setTestTag", "getTestTag$delegate", "testTag", "getText", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/text/AnnotatedString;)V", "text", "getEditableText", "setEditableText", "getEditableText$delegate", "editableText", "Landroidx/compose/ui/text/TextRange;", "getTextSelectionRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", "setTextSelectionRange-FDrldGo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;J)V", "getTextSelectionRange$delegate", "textSelectionRange", "Landroidx/compose/ui/text/input/ImeAction;", "getImeAction", "setImeAction-4L7nppU", "getImeAction$delegate", "imeAction", "getSelected", "setSelected", "getSelected$delegate", "selected", "Landroidx/compose/ui/semantics/CollectionInfo;", "getCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", "setCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionInfo;)V", "getCollectionInfo$delegate", "collectionInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "getCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", "setCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionItemInfo;)V", "getCollectionItemInfo$delegate", "collectionItemInfo", "Landroidx/compose/ui/state/ToggleableState;", "getToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", "setToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/state/ToggleableState;)V", "getToggleableState$delegate", "toggleableState", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "getCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", "setCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/util/List;)V", "getCustomActions$delegate", "customActions", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class SemanticsPropertiesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f17567a = {c.e(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), c.e(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), c.e(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), c.e(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), c.e(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), c.e(SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), c.e(SemanticsPropertiesKt.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), c.e(SemanticsPropertiesKt.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), c.e(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), c.e(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), c.e(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), c.e(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), c.e(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), c.e(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), c.e(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), c.e(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), c.e(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), c.e(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), c.e(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), c.e(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};

    static {
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        semanticsProperties.getStateDescription();
        semanticsProperties.getProgressBarRangeInfo();
        semanticsProperties.getPaneTitle();
        semanticsProperties.getLiveRegion();
        semanticsProperties.getFocused();
        semanticsProperties.getIsTraversalGroup();
        semanticsProperties.getIsTraversalGroup();
        semanticsProperties.getTraversalIndex();
        semanticsProperties.getHorizontalScrollAxisRange();
        semanticsProperties.getVerticalScrollAxisRange();
        semanticsProperties.getRole();
        semanticsProperties.getTestTag();
        semanticsProperties.getEditableText();
        semanticsProperties.getTextSelectionRange();
        semanticsProperties.getImeAction();
        semanticsProperties.getSelected();
        semanticsProperties.getCollectionInfo();
        semanticsProperties.getCollectionItemInfo();
        semanticsProperties.getToggleableState();
        SemanticsActions.INSTANCE.getCustomActions();
    }

    public static final Object access$throwSemanticsGetNotSupported() {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    public static final void collapse(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCollapse(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void collapse$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        collapse(semanticsPropertyReceiver, str, function0);
    }

    public static final void copyText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCopyText(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void copyText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        copyText(semanticsPropertyReceiver, str, function0);
    }

    public static final void cutText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCutText(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void cutText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        cutText(semanticsPropertyReceiver, str, function0);
    }

    public static final void dialog(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIsDialog(), Unit.INSTANCE);
    }

    public static final void disabled(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getDisabled(), Unit.INSTANCE);
    }

    public static final void dismiss(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getDismiss(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void dismiss$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        dismiss(semanticsPropertyReceiver, str, function0);
    }

    public static final void error(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String description) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(description, "description");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getError(), description);
    }

    public static final void expand(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getExpand(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void expand$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        expand(semanticsPropertyReceiver, str, function0);
    }

    @NotNull
    public static final CollectionInfo getCollectionInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getCollectionInfo().getValue(semanticsPropertyReceiver, f17567a[16]);
    }

    @NotNull
    public static final CollectionItemInfo getCollectionItemInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getCollectionItemInfo().getValue(semanticsPropertyReceiver, f17567a[17]);
    }

    @NotNull
    public static final String getContentDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    @NotNull
    public static final List<CustomAccessibilityAction> getCustomActions(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsActions.INSTANCE.getCustomActions().getValue(semanticsPropertyReceiver, f17567a[19]);
    }

    @NotNull
    public static final AnnotatedString getEditableText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getEditableText().getValue(semanticsPropertyReceiver, f17567a[12]);
    }

    public static final boolean getFocused(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getFocused().getValue(semanticsPropertyReceiver, f17567a[4]).booleanValue();
    }

    @NotNull
    public static final ScrollAxisRange getHorizontalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().getValue(semanticsPropertyReceiver, f17567a[8]);
    }

    public static final int getImeAction(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getImeAction().getValue(semanticsPropertyReceiver, f17567a[14]).getF18070a();
    }

    public static final int getLiveRegion(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getLiveRegion().getValue(semanticsPropertyReceiver, f17567a[3]).getF17479a();
    }

    @NotNull
    public static final String getPaneTitle(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getPaneTitle().getValue(semanticsPropertyReceiver, f17567a[2]);
    }

    @NotNull
    public static final ProgressBarRangeInfo getProgressBarRangeInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getProgressBarRangeInfo().getValue(semanticsPropertyReceiver, f17567a[1]);
    }

    public static final int getRole(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getRole().getValue(semanticsPropertyReceiver, f17567a[10]).getF17490a();
    }

    public static final boolean getSelected(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getSelected().getValue(semanticsPropertyReceiver, f17567a[15]).booleanValue();
    }

    @NotNull
    public static final String getStateDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getStateDescription().getValue(semanticsPropertyReceiver, f17567a[0]);
    }

    @NotNull
    public static final String getTestTag(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getTestTag().getValue(semanticsPropertyReceiver, f17567a[11]);
    }

    @NotNull
    public static final AnnotatedString getText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    public static final void getTextLayoutResult(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function1<? super List<TextLayoutResult>, Boolean> function1) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getGetTextLayoutResult(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void getTextLayoutResult$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        getTextLayoutResult(semanticsPropertyReceiver, str, function1);
    }

    public static final long getTextSelectionRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getTextSelectionRange().getValue(semanticsPropertyReceiver, f17567a[13]).getF17768a();
    }

    @NotNull
    public static final ToggleableState getToggleableState(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getToggleableState().getValue(semanticsPropertyReceiver, f17567a[18]);
    }

    public static final float getTraversalIndex(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getTraversalIndex().getValue(semanticsPropertyReceiver, f17567a[7]).floatValue();
    }

    @NotNull
    public static final ScrollAxisRange getVerticalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().getValue(semanticsPropertyReceiver, f17567a[9]);
    }

    public static final void heading(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getHeading(), Unit.INSTANCE);
    }

    public static final void indexForKey(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull Function1<Object, Integer> mapping) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIndexForKey(), mapping);
    }

    public static final void insertTextAtCursor(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function1<? super AnnotatedString, Boolean> function1) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getInsertTextAtCursor(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void insertTextAtCursor$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        insertTextAtCursor(semanticsPropertyReceiver, str, function1);
    }

    @ExperimentalComposeUiApi
    public static final void invisibleToUser(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getInvisibleToUser(), Unit.INSTANCE);
    }

    public static final boolean isContainer(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getIsTraversalGroup().getValue(semanticsPropertyReceiver, f17567a[5]).booleanValue();
    }

    public static final boolean isTraversalGroup(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getIsTraversalGroup().getValue(semanticsPropertyReceiver, f17567a[6]).booleanValue();
    }

    public static final void onClick(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnClick(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void onClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        onClick(semanticsPropertyReceiver, str, function0);
    }

    public static final void onLongClick(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnLongClick(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void onLongClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        onLongClick(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageDown(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageDown(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageDown$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        pageDown(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageLeft(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageLeft(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageLeft$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        pageLeft(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageRight(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageRight(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageRight$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        pageRight(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageUp(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageUp(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageUp$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        pageUp(semanticsPropertyReceiver, str, function0);
    }

    public static final void password(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getPassword(), Unit.INSTANCE);
    }

    public static final void pasteText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPasteText(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pasteText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        pasteText(semanticsPropertyReceiver, str, function0);
    }

    public static final void performImeAction(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPerformImeAction(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void performImeAction$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        performImeAction(semanticsPropertyReceiver, str, function0);
    }

    public static final void popup(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIsPopup(), Unit.INSTANCE);
    }

    public static final void requestFocus(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getRequestFocus(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void requestFocus$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        requestFocus(semanticsPropertyReceiver, str, function0);
    }

    public static final void scrollBy(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function2<? super Float, ? super Float, Boolean> function2) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollBy(), new AccessibilityAction(str, function2));
    }

    public static /* synthetic */ void scrollBy$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        scrollBy(semanticsPropertyReceiver, str, function2);
    }

    public static final void scrollToIndex(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @NotNull Function1<? super Integer, Boolean> action) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollToIndex(), new AccessibilityAction(str, action));
    }

    public static /* synthetic */ void scrollToIndex$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        scrollToIndex(semanticsPropertyReceiver, str, function1);
    }

    public static final void selectableGroup(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getSelectableGroup(), Unit.INSTANCE);
    }

    public static final void setCollectionInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull CollectionInfo collectionInfo) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(collectionInfo, "<set-?>");
        SemanticsProperties.INSTANCE.getCollectionInfo().setValue(semanticsPropertyReceiver, f17567a[16], collectionInfo);
    }

    public static final void setCollectionItemInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull CollectionItemInfo collectionItemInfo) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(collectionItemInfo, "<set-?>");
        SemanticsProperties.INSTANCE.getCollectionItemInfo().setValue(semanticsPropertyReceiver, f17567a[17], collectionItemInfo);
    }

    public static final void setContainer(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z10) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        SemanticsProperties.INSTANCE.getIsTraversalGroup().setValue(semanticsPropertyReceiver, f17567a[5], Boolean.valueOf(z10));
    }

    public static final void setContentDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String value) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getContentDescription(), d.listOf(value));
    }

    public static final void setCustomActions(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull List<CustomAccessibilityAction> list) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        SemanticsActions.INSTANCE.getCustomActions().setValue(semanticsPropertyReceiver, f17567a[19], list);
    }

    public static final void setEditableText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull AnnotatedString annotatedString) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(annotatedString, "<set-?>");
        SemanticsProperties.INSTANCE.getEditableText().setValue(semanticsPropertyReceiver, f17567a[12], annotatedString);
    }

    public static final void setFocused(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z10) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        SemanticsProperties.INSTANCE.getFocused().setValue(semanticsPropertyReceiver, f17567a[4], Boolean.valueOf(z10));
    }

    public static final void setHorizontalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull ScrollAxisRange scrollAxisRange) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(scrollAxisRange, "<set-?>");
        SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().setValue(semanticsPropertyReceiver, f17567a[8], scrollAxisRange);
    }

    /* JADX INFO: renamed from: setImeAction-4L7nppU, reason: not valid java name */
    public static final void m3841setImeAction4L7nppU(@NotNull SemanticsPropertyReceiver imeAction, int i10) {
        Intrinsics.checkNotNullParameter(imeAction, "$this$imeAction");
        SemanticsProperties.INSTANCE.getImeAction().setValue(imeAction, f17567a[14], ImeAction.m4101boximpl(i10));
    }

    /* JADX INFO: renamed from: setLiveRegion-hR3wRGc, reason: not valid java name */
    public static final void m3842setLiveRegionhR3wRGc(@NotNull SemanticsPropertyReceiver liveRegion, int i10) {
        Intrinsics.checkNotNullParameter(liveRegion, "$this$liveRegion");
        SemanticsProperties.INSTANCE.getLiveRegion().setValue(liveRegion, f17567a[3], LiveRegionMode.m3817boximpl(i10));
    }

    public static final void setPaneTitle(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String str) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        SemanticsProperties.INSTANCE.getPaneTitle().setValue(semanticsPropertyReceiver, f17567a[2], str);
    }

    public static final void setProgress(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function1<? super Float, Boolean> function1) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetProgress(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void setProgress$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        setProgress(semanticsPropertyReceiver, str, function1);
    }

    public static final void setProgressBarRangeInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull ProgressBarRangeInfo progressBarRangeInfo) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(progressBarRangeInfo, "<set-?>");
        SemanticsProperties.INSTANCE.getProgressBarRangeInfo().setValue(semanticsPropertyReceiver, f17567a[1], progressBarRangeInfo);
    }

    /* JADX INFO: renamed from: setRole-kuIjeqM, reason: not valid java name */
    public static final void m3843setRolekuIjeqM(@NotNull SemanticsPropertyReceiver role, int i10) {
        Intrinsics.checkNotNullParameter(role, "$this$role");
        SemanticsProperties.INSTANCE.getRole().setValue(role, f17567a[10], Role.m3825boximpl(i10));
    }

    public static final void setSelected(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z10) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        SemanticsProperties.INSTANCE.getSelected().setValue(semanticsPropertyReceiver, f17567a[15], Boolean.valueOf(z10));
    }

    public static final void setSelection(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function3<? super Integer, ? super Integer, ? super Boolean, Boolean> function3) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetSelection(), new AccessibilityAction(str, function3));
    }

    public static /* synthetic */ void setSelection$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function3 function3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        setSelection(semanticsPropertyReceiver, str, function3);
    }

    public static final void setStateDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String str) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        SemanticsProperties.INSTANCE.getStateDescription().setValue(semanticsPropertyReceiver, f17567a[0], str);
    }

    public static final void setTestTag(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String str) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        SemanticsProperties.INSTANCE.getTestTag().setValue(semanticsPropertyReceiver, f17567a[11], str);
    }

    public static final void setText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull AnnotatedString value) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getText(), d.listOf(value));
    }

    public static /* synthetic */ void setText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        setText(semanticsPropertyReceiver, str, function1);
    }

    /* JADX INFO: renamed from: setTextSelectionRange-FDrldGo, reason: not valid java name */
    public static final void m3844setTextSelectionRangeFDrldGo(@NotNull SemanticsPropertyReceiver textSelectionRange, long j10) {
        Intrinsics.checkNotNullParameter(textSelectionRange, "$this$textSelectionRange");
        SemanticsProperties.INSTANCE.getTextSelectionRange().setValue(textSelectionRange, f17567a[13], TextRange.m3955boximpl(j10));
    }

    public static final void setToggleableState(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull ToggleableState toggleableState) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(toggleableState, "<set-?>");
        SemanticsProperties.INSTANCE.getToggleableState().setValue(semanticsPropertyReceiver, f17567a[18], toggleableState);
    }

    public static final void setTraversalGroup(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z10) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        SemanticsProperties.INSTANCE.getIsTraversalGroup().setValue(semanticsPropertyReceiver, f17567a[6], Boolean.valueOf(z10));
    }

    public static final void setTraversalIndex(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, float f6) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        SemanticsProperties.INSTANCE.getTraversalIndex().setValue(semanticsPropertyReceiver, f17567a[7], Float.valueOf(f6));
    }

    public static final void setVerticalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull ScrollAxisRange scrollAxisRange) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(scrollAxisRange, "<set-?>");
        SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().setValue(semanticsPropertyReceiver, f17567a[9], scrollAxisRange);
    }

    public static final void setText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function1<? super AnnotatedString, Boolean> function1) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetText(), new AccessibilityAction(str, function1));
    }

    @Deprecated(message = "Use `isTraversalGroup` instead.", replaceWith = @ReplaceWith(expression = "isTraversalGroup", imports = {}))
    public static /* synthetic */ void isContainer$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }
}
