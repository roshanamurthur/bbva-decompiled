package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bY\u0010ZR5\u0010\f\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR)\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR)\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000bRS\u0010\u001c\u001a>\u0012:\u00128\u00124\u00122\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00070\u00140\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u000bR/\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001f\u0010\u000bR>\u0010$\u001a)\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b#\u0010\u000bR;\u0010(\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070%0\u00030\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\t\u001a\u0004\b'\u0010\u000bR/\u0010,\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\t\u001a\u0004\b+\u0010\u000bR/\u0010/\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\t\u001a\u0004\b.\u0010\u000bR)\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\t\u001a\u0004\b1\u0010\u000bR)\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\t\u001a\u0004\b4\u0010\u000bR)\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\t\u001a\u0004\b7\u0010\u000bR)\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\t\u001a\u0004\b:\u0010\u000bR)\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b<\u0010\t\u001a\u0004\b=\u0010\u000bR)\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b?\u0010\t\u001a\u0004\b@\u0010\u000bR)\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\bB\u0010\t\u001a\u0004\bC\u0010\u000bR)\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\bE\u0010\t\u001a\u0004\bF\u0010\u000bR#\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0H0\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010\t\u001a\u0004\bK\u0010\u000bR)\u0010O\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\bM\u0010\t\u001a\u0004\bN\u0010\u000bR)\u0010R\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\bP\u0010\t\u001a\u0004\bQ\u0010\u000bR)\u0010U\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\bS\u0010\t\u001a\u0004\bT\u0010\u000bR)\u0010X\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\bV\u0010\t\u001a\u0004\bW\u0010\u000b¨\u0006["}, d2 = {"Landroidx/compose/ui/semantics/SemanticsActions;", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "", "a", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getGetTextLayoutResult", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "GetTextLayoutResult", "Lkotlin/Function0;", "b", "getOnClick", "OnClick", "c", "getOnLongClick", "OnLongClick", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "x", "y", "d", "getScrollBy", "ScrollBy", "", "e", "getScrollToIndex", "ScrollToIndex", "progress", "f", "getSetProgress", "SetProgress", "Lkotlin/Function3;", "g", "getSetSelection", "SetSelection", "Landroidx/compose/ui/text/AnnotatedString;", "h", "getSetText", "SetText", "i", "getInsertTextAtCursor", "InsertTextAtCursor", "j", "getPerformImeAction", "PerformImeAction", "k", "getCopyText", "CopyText", "l", "getCutText", "CutText", "m", "getPasteText", "PasteText", "n", "getExpand", "Expand", "o", "getCollapse", "Collapse", "p", "getDismiss", "Dismiss", "q", "getRequestFocus", "RequestFocus", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "r", "getCustomActions", "CustomActions", "s", "getPageUp", "PageUp", "t", "getPageLeft", "PageLeft", "u", "getPageDown", "PageDown", SharedPrefsStorage.VERSION_KEY, "getPageRight", "PageRight", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n+ 2 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt\n*L\n1#1,1291:1\n462#2,3:1292\n462#2,3:1295\n462#2,3:1298\n462#2,3:1301\n462#2,3:1304\n462#2,3:1307\n462#2,3:1310\n462#2,3:1313\n462#2,3:1316\n462#2,3:1319\n462#2,3:1322\n462#2,3:1325\n462#2,3:1328\n462#2,3:1331\n462#2,3:1334\n462#2,3:1337\n462#2,3:1340\n462#2,3:1343\n462#2,3:1346\n462#2,3:1349\n462#2,3:1352\n*S KotlinDebug\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n*L\n258#1:1292,3\n263#1:1295,3\n268#1:1298,3\n273#1:1301,3\n278#1:1304,3\n283#1:1307,3\n288#1:1310,3\n293#1:1313,3\n298#1:1316,3\n303#1:1319,3\n308#1:1322,3\n313#1:1325,3\n318#1:1328,3\n323#1:1331,3\n328#1:1334,3\n333#1:1337,3\n338#1:1340,3\n349#1:1343,3\n354#1:1346,3\n359#1:1349,3\n364#1:1352,3\n*E\n"})
public final class SemanticsActions {
    public static final int $stable = 0;

    @NotNull
    public static final SemanticsActions INSTANCE = new SemanticsActions();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function1<List<TextLayoutResult>, Boolean>>> GetTextLayoutResult;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnClick;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnLongClick;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function2<Float, Float, Boolean>>> ScrollBy;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function1<Integer, Boolean>>> ScrollToIndex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function1<Float, Boolean>>> SetProgress;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function3<Integer, Integer, Boolean, Boolean>>> SetSelection;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> SetText;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> InsertTextAtCursor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PerformImeAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> CopyText;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> CutText;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PasteText;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Expand;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Collapse;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Dismiss;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> RequestFocus;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageUp;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageLeft;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageDown;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageRight;

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = new Function2<AccessibilityAction<Function<? extends Boolean>>, AccessibilityAction<Function<? extends Boolean>>, AccessibilityAction<Function<? extends Boolean>>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final AccessibilityAction<Function<? extends Boolean>> invoke(@Nullable AccessibilityAction<Function<? extends Boolean>> accessibilityAction, @NotNull AccessibilityAction<Function<? extends Boolean>> childValue) {
                String label;
                Function action;
                Intrinsics.checkNotNullParameter(childValue, "childValue");
                if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                    label = childValue.getLabel();
                }
                if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                    action = childValue.getAction();
                }
                return new AccessibilityAction<>(label, action);
            }
        };
        GetTextLayoutResult = new SemanticsPropertyKey<>("GetTextLayoutResult", semanticsPropertiesKt$ActionPropertyKey$1);
        OnClick = new SemanticsPropertyKey<>("OnClick", semanticsPropertiesKt$ActionPropertyKey$1);
        OnLongClick = new SemanticsPropertyKey<>("OnLongClick", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollBy = new SemanticsPropertyKey<>("ScrollBy", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollToIndex = new SemanticsPropertyKey<>("ScrollToIndex", semanticsPropertiesKt$ActionPropertyKey$1);
        SetProgress = new SemanticsPropertyKey<>("SetProgress", semanticsPropertiesKt$ActionPropertyKey$1);
        SetSelection = new SemanticsPropertyKey<>("SetSelection", semanticsPropertiesKt$ActionPropertyKey$1);
        SetText = new SemanticsPropertyKey<>("SetText", semanticsPropertiesKt$ActionPropertyKey$1);
        InsertTextAtCursor = new SemanticsPropertyKey<>("InsertTextAtCursor", semanticsPropertiesKt$ActionPropertyKey$1);
        PerformImeAction = new SemanticsPropertyKey<>("PerformImeAction", semanticsPropertiesKt$ActionPropertyKey$1);
        CopyText = new SemanticsPropertyKey<>("CopyText", semanticsPropertiesKt$ActionPropertyKey$1);
        CutText = new SemanticsPropertyKey<>("CutText", semanticsPropertiesKt$ActionPropertyKey$1);
        PasteText = new SemanticsPropertyKey<>("PasteText", semanticsPropertiesKt$ActionPropertyKey$1);
        Expand = new SemanticsPropertyKey<>("Expand", semanticsPropertiesKt$ActionPropertyKey$1);
        Collapse = new SemanticsPropertyKey<>("Collapse", semanticsPropertiesKt$ActionPropertyKey$1);
        Dismiss = new SemanticsPropertyKey<>("Dismiss", semanticsPropertiesKt$ActionPropertyKey$1);
        RequestFocus = new SemanticsPropertyKey<>("RequestFocus", semanticsPropertiesKt$ActionPropertyKey$1);
        CustomActions = new SemanticsPropertyKey<>("CustomActions", null, 2, null);
        PageUp = new SemanticsPropertyKey<>("PageUp", semanticsPropertiesKt$ActionPropertyKey$1);
        PageLeft = new SemanticsPropertyKey<>("PageLeft", semanticsPropertiesKt$ActionPropertyKey$1);
        PageDown = new SemanticsPropertyKey<>("PageDown", semanticsPropertiesKt$ActionPropertyKey$1);
        PageRight = new SemanticsPropertyKey<>("PageRight", semanticsPropertiesKt$ActionPropertyKey$1);
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getCollapse() {
        return Collapse;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getCopyText() {
        return CopyText;
    }

    @NotNull
    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> getCustomActions() {
        return CustomActions;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getCutText() {
        return CutText;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getDismiss() {
        return Dismiss;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getExpand() {
        return Expand;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function1<List<TextLayoutResult>, Boolean>>> getGetTextLayoutResult() {
        return GetTextLayoutResult;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> getInsertTextAtCursor() {
        return InsertTextAtCursor;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getOnClick() {
        return OnClick;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getOnLongClick() {
        return OnLongClick;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPageDown() {
        return PageDown;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPageLeft() {
        return PageLeft;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPageRight() {
        return PageRight;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPageUp() {
        return PageUp;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPasteText() {
        return PasteText;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPerformImeAction() {
        return PerformImeAction;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getRequestFocus() {
        return RequestFocus;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function2<Float, Float, Boolean>>> getScrollBy() {
        return ScrollBy;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function1<Integer, Boolean>>> getScrollToIndex() {
        return ScrollToIndex;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function1<Float, Boolean>>> getSetProgress() {
        return SetProgress;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function3<Integer, Integer, Boolean, Boolean>>> getSetSelection() {
        return SetSelection;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> getSetText() {
        return SetText;
    }
}
