package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {

    /* JADX INFO: renamed from: androidx.compose.ui.focus.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FocusProperties.kt */
    public static final class C0059a extends Lambda implements Function1<FocusDirection, FocusRequester> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final C0059a f15522p0 = new C0059a(1);

        @Override // kotlin.jvm.functions.Function1
        public final FocusRequester invoke(FocusDirection focusDirection) {
            focusDirection.getF15475a();
            return FocusRequester.INSTANCE.getDefault();
        }
    }

    /* JADX INFO: compiled from: FocusProperties.kt */
    public static final class b extends Lambda implements Function1<FocusDirection, FocusRequester> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f15523p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final FocusRequester invoke(FocusDirection focusDirection) {
            focusDirection.getF15475a();
            return FocusRequester.INSTANCE.getDefault();
        }
    }

    @NotNull
    public static FocusRequester a(FocusProperties focusProperties) {
        return FocusRequester.INSTANCE.getDefault();
    }

    @NotNull
    public static FocusRequester b(FocusProperties focusProperties) {
        return FocusRequester.INSTANCE.getDefault();
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static Function1 c(FocusProperties focusProperties) {
        return C0059a.f15522p0;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static Function1 d(FocusProperties focusProperties) {
        return b.f15523p0;
    }

    @NotNull
    public static FocusRequester e(FocusProperties focusProperties) {
        return FocusRequester.INSTANCE.getDefault();
    }

    @NotNull
    public static FocusRequester f(FocusProperties focusProperties) {
        return FocusRequester.INSTANCE.getDefault();
    }

    @NotNull
    public static FocusRequester g(FocusProperties focusProperties) {
        return FocusRequester.INSTANCE.getDefault();
    }

    @NotNull
    public static FocusRequester h(FocusProperties focusProperties) {
        return FocusRequester.INSTANCE.getDefault();
    }

    @NotNull
    public static FocusRequester i(FocusProperties focusProperties) {
        return FocusRequester.INSTANCE.getDefault();
    }

    @NotNull
    public static FocusRequester j(FocusProperties focusProperties) {
        return FocusRequester.INSTANCE.getDefault();
    }

    public static void k(FocusProperties focusProperties, @NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    public static void l(FocusProperties focusProperties, @NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    @ExperimentalComposeUiApi
    public static void m(FocusProperties focusProperties, @NotNull Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<anonymous parameter 0>");
    }

    @ExperimentalComposeUiApi
    public static void n(FocusProperties focusProperties, @NotNull Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<anonymous parameter 0>");
    }

    public static void o(FocusProperties focusProperties, @NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    public static void p(FocusProperties focusProperties, @NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    public static void q(FocusProperties focusProperties, @NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    public static void r(FocusProperties focusProperties, @NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    public static void s(FocusProperties focusProperties, @NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    public static void t(FocusProperties focusProperties, @NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void u() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void v() {
    }
}
