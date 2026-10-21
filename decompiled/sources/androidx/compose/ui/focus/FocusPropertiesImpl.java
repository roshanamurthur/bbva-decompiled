package androidx.compose.ui.focus;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b>\u00107R\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0019\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\"\u0010\u001d\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\"\u0010!\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\"\u0010%\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R\"\u0010)\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010\f\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R\"\u0010-\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010\f\u001a\u0004\b+\u0010\u000e\"\u0004\b,\u0010\u0010R7\u00108\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n0.8\u0016@\u0016X\u0096\u000eø\u0001\u0000¢\u0006\u0018\n\u0004\b0\u00101\u0012\u0004\b6\u00107\u001a\u0004\b2\u00103\"\u0004\b4\u00105R7\u0010=\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n0.8\u0016@\u0016X\u0096\u000eø\u0001\u0000¢\u0006\u0018\n\u0004\b9\u00101\u0012\u0004\b<\u00107\u001a\u0004\b:\u00103\"\u0004\b;\u00105\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesImpl;", "Landroidx/compose/ui/focus/FocusProperties;", "", "a", "Z", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/FocusRequester;", "b", "Landroidx/compose/ui/focus/FocusRequester;", "getNext", "()Landroidx/compose/ui/focus/FocusRequester;", "setNext", "(Landroidx/compose/ui/focus/FocusRequester;)V", "next", "c", "getPrevious", "setPrevious", "previous", "d", "getUp", "setUp", "up", "e", "getDown", "setDown", "down", "f", "getLeft", "setLeft", Parameters.DIRECTION.LEFT, "g", "getRight", "setRight", Parameters.DIRECTION.RIGHT, "h", "getStart", "setStart", EventDataKeys.Lifecycle.LIFECYCLE_START, "i", "getEnd", "setEnd", "end", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", "j", "Lkotlin/jvm/functions/Function1;", "getEnter", "()Lkotlin/jvm/functions/Function1;", "setEnter", "(Lkotlin/jvm/functions/Function1;)V", "getEnter$annotations", "()V", "enter", "k", "getExit", "setExit", "getExit$annotations", HearingDisabilitiesConstants.EXIT_VIDEO_CALL, "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class FocusPropertiesImpl implements FocusProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean canFocus = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public FocusRequester next;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public FocusRequester previous;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public FocusRequester up;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public FocusRequester down;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public FocusRequester left;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public FocusRequester right;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public FocusRequester start;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public FocusRequester end;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function1<? super FocusDirection, FocusRequester> enter;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function1<? super FocusDirection, FocusRequester> exit;

    /* JADX INFO: compiled from: FocusProperties.kt */
    public static final class a extends Lambda implements Function1<FocusDirection, FocusRequester> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f15504p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final FocusRequester invoke(FocusDirection focusDirection) {
            focusDirection.getF15475a();
            return FocusRequester.INSTANCE.getDefault();
        }
    }

    /* JADX INFO: compiled from: FocusProperties.kt */
    public static final class b extends Lambda implements Function1<FocusDirection, FocusRequester> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f15505p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final FocusRequester invoke(FocusDirection focusDirection) {
            focusDirection.getF15475a();
            return FocusRequester.INSTANCE.getDefault();
        }
    }

    public FocusPropertiesImpl() {
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        this.next = companion.getDefault();
        this.previous = companion.getDefault();
        this.up = companion.getDefault();
        this.down = companion.getDefault();
        this.left = companion.getDefault();
        this.right = companion.getDefault();
        this.start = companion.getDefault();
        this.end = companion.getDefault();
        this.enter = a.f15504p0;
        this.exit = b.f15505p0;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public FocusRequester getDown() {
        return this.down;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public FocusRequester getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public Function1<FocusDirection, FocusRequester> getEnter() {
        return this.enter;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public Function1<FocusDirection, FocusRequester> getExit() {
        return this.exit;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public FocusRequester getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public FocusRequester getNext() {
        return this.next;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public FocusRequester getPrevious() {
        return this.previous;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public FocusRequester getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public FocusRequester getStart() {
        return this.start;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public FocusRequester getUp() {
        return this.up;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setCanFocus(boolean z10) {
        this.canFocus = z10;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setDown(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.down = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setEnd(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.end = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setEnter(@NotNull Function1<? super FocusDirection, FocusRequester> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.enter = function1;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setExit(@NotNull Function1<? super FocusDirection, FocusRequester> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.exit = function1;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setLeft(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.left = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setNext(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.next = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setPrevious(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.previous = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setRight(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.right = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setStart(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.start = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setUp(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.up = focusRequester;
    }

    public static /* synthetic */ void getEnter$annotations() {
    }

    public static /* synthetic */ void getExit$annotations() {
    }
}
