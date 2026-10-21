package androidx.compose.ui.text.style;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextForegroundStyle.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TextForegroundStyle.kt */
    public static final class C0069a extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextForegroundStyle f18288p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0069a(TextForegroundStyle textForegroundStyle) {
            super(0);
            this.f18288p0 = textForegroundStyle;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(this.f18288p0.getAlpha());
        }
    }

    /* JADX INFO: compiled from: TextForegroundStyle.kt */
    public static final class b extends Lambda implements Function0<TextForegroundStyle> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextForegroundStyle f18289p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TextForegroundStyle textForegroundStyle) {
            super(0);
            this.f18289p0 = textForegroundStyle;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextForegroundStyle invoke() {
            return this.f18289p0;
        }
    }

    @NotNull
    public static TextForegroundStyle a(TextForegroundStyle textForegroundStyle, @NotNull TextForegroundStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z10 = other instanceof u1.a;
        if (z10 && (textForegroundStyle instanceof u1.a)) {
            return new u1.a(((u1.a) other).f93715a, TextDrawStyleKt.access$takeOrElse(other.getAlpha(), new C0069a(textForegroundStyle)));
        }
        if (!z10 || (textForegroundStyle instanceof u1.a)) {
            return (z10 || !(textForegroundStyle instanceof u1.a)) ? other.takeOrElse(new b(textForegroundStyle)) : textForegroundStyle;
        }
        return other;
    }

    @NotNull
    public static TextForegroundStyle b(TextForegroundStyle textForegroundStyle, @NotNull Function0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return !Intrinsics.areEqual(textForegroundStyle, TextForegroundStyle.Unspecified.INSTANCE) ? textForegroundStyle : (TextForegroundStyle) other.invoke();
    }
}
