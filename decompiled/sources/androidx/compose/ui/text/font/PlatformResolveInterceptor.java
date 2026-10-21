package androidx.compose.ui.text.font;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "", "interceptFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "interceptFontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "interceptFontStyle-T2F_aPo", "(I)I", "interceptFontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "interceptFontSynthesis-Mscr08Y", "interceptFontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PlatformResolveInterceptor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f18017a;

    /* JADX INFO: compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/font/PlatformResolveInterceptor$Companion;", "", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "b", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "getDefault$ui_text_release", "()Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "Default", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f18017a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PlatformResolveInterceptor$Companion$Default$1 f18018b = new PlatformResolveInterceptor() { // from class: androidx.compose.ui.text.font.PlatformResolveInterceptor$Companion$Default$1
            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            public final /* synthetic */ FontFamily interceptFontFamily(FontFamily fontFamily) {
                return p1.e.a(this, fontFamily);
            }

            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            /* JADX INFO: renamed from: interceptFontStyle-T2F_aPo */
            public final /* synthetic */ int mo4016interceptFontStyleT2F_aPo(int i10) {
                return p1.e.b(this, i10);
            }

            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            /* JADX INFO: renamed from: interceptFontSynthesis-Mscr08Y */
            public final /* synthetic */ int mo4017interceptFontSynthesisMscr08Y(int i10) {
                return p1.e.c(this, i10);
            }

            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            public final /* synthetic */ FontWeight interceptFontWeight(FontWeight fontWeight) {
                return p1.e.d(this, fontWeight);
            }
        };

        @NotNull
        public final PlatformResolveInterceptor getDefault$ui_text_release() {
            return f18018b;
        }
    }

    @Nullable
    FontFamily interceptFontFamily(@Nullable FontFamily fontFamily);

    /* JADX INFO: renamed from: interceptFontStyle-T2F_aPo */
    int mo4016interceptFontStyleT2F_aPo(int fontStyle);

    /* JADX INFO: renamed from: interceptFontSynthesis-Mscr08Y */
    int mo4017interceptFontSynthesisMscr08Y(int fontSynthesis);

    @NotNull
    FontWeight interceptFontWeight(@NotNull FontWeight fontWeight);
}
