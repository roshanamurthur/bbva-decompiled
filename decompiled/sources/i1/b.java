package i1;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NodeKind.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements FocusProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f69478a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static Boolean f69479b;

    @Override // androidx.compose.ui.focus.FocusProperties
    public final boolean getCanFocus() {
        Boolean bool = f69479b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getDown() {
        return androidx.compose.ui.focus.a.a(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getEnd() {
        return androidx.compose.ui.focus.a.b(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ Function1 getEnter() {
        return androidx.compose.ui.focus.a.c(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ Function1 getExit() {
        return androidx.compose.ui.focus.a.d(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getLeft() {
        return androidx.compose.ui.focus.a.e(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getNext() {
        return androidx.compose.ui.focus.a.f(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getPrevious() {
        return androidx.compose.ui.focus.a.g(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getRight() {
        return androidx.compose.ui.focus.a.h(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getStart() {
        return androidx.compose.ui.focus.a.i(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getUp() {
        return androidx.compose.ui.focus.a.j(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final void setCanFocus(boolean z10) {
        f69479b = Boolean.valueOf(z10);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setDown(FocusRequester focusRequester) {
        androidx.compose.ui.focus.a.k(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setEnd(FocusRequester focusRequester) {
        androidx.compose.ui.focus.a.l(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setEnter(Function1 function1) {
        androidx.compose.ui.focus.a.m(this, function1);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setExit(Function1 function1) {
        androidx.compose.ui.focus.a.n(this, function1);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setLeft(FocusRequester focusRequester) {
        androidx.compose.ui.focus.a.o(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setNext(FocusRequester focusRequester) {
        androidx.compose.ui.focus.a.p(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setPrevious(FocusRequester focusRequester) {
        androidx.compose.ui.focus.a.q(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setRight(FocusRequester focusRequester) {
        androidx.compose.ui.focus.a.r(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setStart(FocusRequester focusRequester) {
        androidx.compose.ui.focus.a.s(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setUp(FocusRequester focusRequester) {
        androidx.compose.ui.focus.a.t(this, focusRequester);
    }
}
