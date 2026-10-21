package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\br\u00104R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\bR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR \u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020*0\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020*0\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR&\u00105\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010\u0006\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\bR\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002060\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020:0\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020:0\u00028\u0006¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\b?\u0010\bR\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\bE\u0010\bR \u0010J\u001a\b\u0012\u0004\u0012\u00020G0\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bH\u0010\u0006\u001a\u0004\bI\u0010\bR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR#\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0\u00030\u00028\u0006¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020N0\u00028\u0006¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\bR \u0010X\u001a\b\u0012\u0004\u0012\u00020U0\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bV\u0010\u0006\u001a\u0004\bW\u0010\bR \u0010\\\u001a\b\u0012\u0004\u0012\u00020Y0\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bZ\u0010\u0006\u001a\u0004\b[\u0010\bR\u001d\u0010_\u001a\b\u0012\u0004\u0012\u00020*0\u00028\u0006¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\b^\u0010\bR\u001d\u0010c\u001a\b\u0012\u0004\u0012\u00020`0\u00028\u0006¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bb\u0010\bR\u001d\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006¢\u0006\f\n\u0004\bd\u0010\u0006\u001a\u0004\be\u0010\bR\u001d\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR)\u0010n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020k0j0\u00028\u0006¢\u0006\f\n\u0004\bl\u0010\u0006\u001a\u0004\bm\u0010\bR \u0010q\u001a\b\u0012\u0004\u0012\u00020*0\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\bp\u00104\u001a\u0004\bo\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006s"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "", "a", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getContentDescription", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "ContentDescription", "b", "getStateDescription", "StateDescription", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "c", "getProgressBarRangeInfo", "ProgressBarRangeInfo", "d", "getPaneTitle", "PaneTitle", "", "e", "getSelectableGroup", "SelectableGroup", "Landroidx/compose/ui/semantics/CollectionInfo;", "f", "getCollectionInfo", "CollectionInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "g", "getCollectionItemInfo", "CollectionItemInfo", "h", "getHeading", "Heading", "i", "getDisabled", "Disabled", "Landroidx/compose/ui/semantics/LiveRegionMode;", "j", "getLiveRegion", "LiveRegion", "", "k", "getFocused", "Focused", "l", "getIsTraversalGroup", "IsTraversalGroup", "m", "getInvisibleToUser", "getInvisibleToUser$annotations", "()V", "InvisibleToUser", "", "n", "getTraversalIndex", "TraversalIndex", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "o", "getHorizontalScrollAxisRange", "HorizontalScrollAxisRange", "p", "getVerticalScrollAxisRange", "VerticalScrollAxisRange", "q", "getIsPopup", "IsPopup", "r", "getIsDialog", "IsDialog", "Landroidx/compose/ui/semantics/Role;", "s", "getRole", "Role", "t", "getTestTag", "TestTag", "Landroidx/compose/ui/text/AnnotatedString;", "u", "getText", "Text", SharedPrefsStorage.VERSION_KEY, "getEditableText", "EditableText", "Landroidx/compose/ui/text/TextRange;", "w", "getTextSelectionRange", "TextSelectionRange", "Landroidx/compose/ui/text/input/ImeAction;", "x", "getImeAction", "ImeAction", "y", "getSelected", "Selected", "Landroidx/compose/ui/state/ToggleableState;", "z", "getToggleableState", "ToggleableState", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getPassword", "Password", "B", "getError", "Error", "Lkotlin/Function1;", "", "C", "getIndexForKey", "IndexForKey", "getIsContainer", "getIsContainer$annotations", "IsContainer", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class SemanticsProperties {
    public static final int $stable = 0;

    @NotNull
    public static final SemanticsProperties INSTANCE = new SemanticsProperties();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<List<String>> ContentDescription = new SemanticsPropertyKey<>("ContentDescription", a.f17556p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<String> StateDescription = new SemanticsPropertyKey<>("StateDescription", null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<ProgressBarRangeInfo> ProgressBarRangeInfo = new SemanticsPropertyKey<>("ProgressBarRangeInfo", null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<String> PaneTitle = new SemanticsPropertyKey<>("PaneTitle", e.f17560p0);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<Unit> SelectableGroup = new SemanticsPropertyKey<>("SelectableGroup", null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<CollectionInfo> CollectionInfo = new SemanticsPropertyKey<>("CollectionInfo", null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<CollectionItemInfo> CollectionItemInfo = new SemanticsPropertyKey<>("CollectionItemInfo", null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<Unit> Heading = new SemanticsPropertyKey<>("Heading", null, 2, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<Unit> Disabled = new SemanticsPropertyKey<>("Disabled", null, 2, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<LiveRegionMode> LiveRegion = new SemanticsPropertyKey<>("LiveRegion", null, 2, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<Boolean> Focused = new SemanticsPropertyKey<>("Focused", null, 2, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<Boolean> IsTraversalGroup = new SemanticsPropertyKey<>("IsTraversalGroup", null, 2, null);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<Unit> InvisibleToUser = new SemanticsPropertyKey<>("InvisibleToUser", b.f17557p0);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<Float> TraversalIndex = new SemanticsPropertyKey<>("TraversalIndex", i.f17564p0);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<ScrollAxisRange> HorizontalScrollAxisRange = new SemanticsPropertyKey<>("HorizontalScrollAxisRange", null, 2, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<ScrollAxisRange> VerticalScrollAxisRange = new SemanticsPropertyKey<>("VerticalScrollAxisRange", null, 2, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<Unit> IsPopup = new SemanticsPropertyKey<>("IsPopup", d.f17559p0);

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<Unit> IsDialog = new SemanticsPropertyKey<>("IsDialog", c.f17558p0);

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<Role> Role = new SemanticsPropertyKey<>("Role", f.f17561p0);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<String> TestTag = new SemanticsPropertyKey<>("TestTag", g.f17562p0);

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<List<AnnotatedString>> Text = new SemanticsPropertyKey<>("Text", h.f17563p0);

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<AnnotatedString> EditableText = new SemanticsPropertyKey<>("EditableText", null, 2, null);

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<TextRange> TextSelectionRange = new SemanticsPropertyKey<>("TextSelectionRange", null, 2, null);

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<ImeAction> ImeAction = new SemanticsPropertyKey<>("ImeAction", null, 2, null);

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<Boolean> Selected = new SemanticsPropertyKey<>("Selected", null, 2, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<ToggleableState> ToggleableState = new SemanticsPropertyKey<>("ToggleableState", null, 2, null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<Unit> Password = new SemanticsPropertyKey<>("Password", null, 2, null);

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<String> Error = new SemanticsPropertyKey<>("Error", null, 2, null);

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<Function1<Object, Integer>> IndexForKey = new SemanticsPropertyKey<>("IndexForKey", null, 2, null);

    /* JADX INFO: compiled from: SemanticsProperties.kt */
    @SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsProperties$ContentDescription$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1291:1\n1#2:1292\n*E\n"})
    public static final class a extends Lambda implements Function2<List<? extends String>, List<? extends String>, List<? extends String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f17556p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
            List<? extends String> mutableList;
            List<? extends String> list3 = list;
            List<? extends String> childValue = list2;
            Intrinsics.checkNotNullParameter(childValue, "childValue");
            if (list3 == null || (mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list3)) == null) {
                return childValue;
            }
            mutableList.addAll(childValue);
            return mutableList;
        }
    }

    /* JADX INFO: compiled from: SemanticsProperties.kt */
    public static final class b extends Lambda implements Function2<Unit, Unit, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f17557p0 = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Unit unit, Unit unit2) {
            Unit unit3 = unit;
            Intrinsics.checkNotNullParameter(unit2, "<anonymous parameter 1>");
            return unit3;
        }
    }

    /* JADX INFO: compiled from: SemanticsProperties.kt */
    public static final class c extends Lambda implements Function2<Unit, Unit, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f17558p0 = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Unit unit, Unit unit2) {
            Intrinsics.checkNotNullParameter(unit2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    /* JADX INFO: compiled from: SemanticsProperties.kt */
    public static final class d extends Lambda implements Function2<Unit, Unit, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f17559p0 = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Unit unit, Unit unit2) {
            Intrinsics.checkNotNullParameter(unit2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    /* JADX INFO: compiled from: SemanticsProperties.kt */
    public static final class e extends Lambda implements Function2<String, String, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f17560p0 = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, String str2) {
            Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    /* JADX INFO: compiled from: SemanticsProperties.kt */
    public static final class f extends Lambda implements Function2<Role, Role, Role> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f17561p0 = new f(2);

        @Override // kotlin.jvm.functions.Function2
        public final Role invoke(Role role, Role role2) {
            Role role3 = role;
            role2.getF17490a();
            return role3;
        }
    }

    /* JADX INFO: compiled from: SemanticsProperties.kt */
    public static final class g extends Lambda implements Function2<String, String, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f17562p0 = new g(2);

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, String str2) {
            String str3 = str;
            Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 1>");
            return str3;
        }
    }

    /* JADX INFO: compiled from: SemanticsProperties.kt */
    @SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsProperties$Text$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1291:1\n1#2:1292\n*E\n"})
    public static final class h extends Lambda implements Function2<List<? extends AnnotatedString>, List<? extends AnnotatedString>, List<? extends AnnotatedString>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f17563p0 = new h(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends AnnotatedString> invoke(List<? extends AnnotatedString> list, List<? extends AnnotatedString> list2) {
            List<? extends AnnotatedString> mutableList;
            List<? extends AnnotatedString> list3 = list;
            List<? extends AnnotatedString> childValue = list2;
            Intrinsics.checkNotNullParameter(childValue, "childValue");
            if (list3 == null || (mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list3)) == null) {
                return childValue;
            }
            mutableList.addAll(childValue);
            return mutableList;
        }
    }

    /* JADX INFO: compiled from: SemanticsProperties.kt */
    public static final class i extends Lambda implements Function2<Float, Float, Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f17564p0 = new i(2);

        @Override // kotlin.jvm.functions.Function2
        public final Float invoke(Float f6, Float f10) {
            Float f11 = f6;
            f10.floatValue();
            return f11;
        }
    }

    @NotNull
    public final SemanticsPropertyKey<CollectionInfo> getCollectionInfo() {
        return CollectionInfo;
    }

    @NotNull
    public final SemanticsPropertyKey<CollectionItemInfo> getCollectionItemInfo() {
        return CollectionItemInfo;
    }

    @NotNull
    public final SemanticsPropertyKey<List<String>> getContentDescription() {
        return ContentDescription;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getDisabled() {
        return Disabled;
    }

    @NotNull
    public final SemanticsPropertyKey<AnnotatedString> getEditableText() {
        return EditableText;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getError() {
        return Error;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getFocused() {
        return Focused;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getHeading() {
        return Heading;
    }

    @NotNull
    public final SemanticsPropertyKey<ScrollAxisRange> getHorizontalScrollAxisRange() {
        return HorizontalScrollAxisRange;
    }

    @NotNull
    public final SemanticsPropertyKey<ImeAction> getImeAction() {
        return ImeAction;
    }

    @NotNull
    public final SemanticsPropertyKey<Function1<Object, Integer>> getIndexForKey() {
        return IndexForKey;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getInvisibleToUser() {
        return InvisibleToUser;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getIsContainer() {
        return IsTraversalGroup;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getIsDialog() {
        return IsDialog;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getIsPopup() {
        return IsPopup;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getIsTraversalGroup() {
        return IsTraversalGroup;
    }

    @NotNull
    public final SemanticsPropertyKey<LiveRegionMode> getLiveRegion() {
        return LiveRegion;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getPaneTitle() {
        return PaneTitle;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getPassword() {
        return Password;
    }

    @NotNull
    public final SemanticsPropertyKey<ProgressBarRangeInfo> getProgressBarRangeInfo() {
        return ProgressBarRangeInfo;
    }

    @NotNull
    public final SemanticsPropertyKey<Role> getRole() {
        return Role;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getSelectableGroup() {
        return SelectableGroup;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getSelected() {
        return Selected;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getStateDescription() {
        return StateDescription;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getTestTag() {
        return TestTag;
    }

    @NotNull
    public final SemanticsPropertyKey<List<AnnotatedString>> getText() {
        return Text;
    }

    @NotNull
    public final SemanticsPropertyKey<TextRange> getTextSelectionRange() {
        return TextSelectionRange;
    }

    @NotNull
    public final SemanticsPropertyKey<ToggleableState> getToggleableState() {
        return ToggleableState;
    }

    @NotNull
    public final SemanticsPropertyKey<Float> getTraversalIndex() {
        return TraversalIndex;
    }

    @NotNull
    public final SemanticsPropertyKey<ScrollAxisRange> getVerticalScrollAxisRange() {
        return VerticalScrollAxisRange;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getInvisibleToUser$annotations() {
    }

    @Deprecated(message = "Use `isTraversalGroup` instead.", replaceWith = @ReplaceWith(expression = "IsTraversalGroup", imports = {}))
    public static /* synthetic */ void getIsContainer$annotations() {
    }
}
