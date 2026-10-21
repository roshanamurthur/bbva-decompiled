package androidx.compose.ui.text.font;

import androidx.compose.ui.text.platform.AndroidTypeface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PlatformFontFamilyTypefaceAdapter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJB\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0006H\u0016¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "onAsyncCompletion", "", "createDefaultTypeface", "Landroidx/compose/ui/text/font/TypefaceResult;", "resolve", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class PlatformFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PlatformTypefaces f18016a = PlatformTypefacesKt.PlatformTypefaces();

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    @Nullable
    public TypefaceResult resolve(@NotNull TypefaceRequest typefaceRequest, @NotNull PlatformFontLoader platformFontLoader, @NotNull Function1<? super TypefaceResult.Immutable, Unit> onAsyncCompletion, @NotNull Function1<? super TypefaceRequest, ? extends Object> createDefaultTypeface) {
        android.graphics.Typeface typefaceMo4084createDefaultFO1MlWM;
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        Intrinsics.checkNotNullParameter(onAsyncCompletion, "onAsyncCompletion");
        Intrinsics.checkNotNullParameter(createDefaultTypeface, "createDefaultTypeface");
        FontFamily fontFamily = typefaceRequest.getFontFamily();
        PlatformTypefaces platformTypefaces = this.f18016a;
        if (fontFamily == null || (fontFamily instanceof DefaultFontFamily)) {
            typefaceMo4084createDefaultFO1MlWM = platformTypefaces.mo4084createDefaultFO1MlWM(typefaceRequest.getFontWeight(), typefaceRequest.m4096getFontStyle_LCdwA());
        } else if (fontFamily instanceof GenericFontFamily) {
            typefaceMo4084createDefaultFO1MlWM = platformTypefaces.mo4085createNamedRetOiIg((GenericFontFamily) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.m4096getFontStyle_LCdwA());
        } else {
            if (!(fontFamily instanceof LoadedFontFamily)) {
                return null;
            }
            Typeface typeface = ((LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface();
            Intrinsics.checkNotNull(typeface, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typefaceMo4084createDefaultFO1MlWM = ((AndroidTypeface) typeface).mo4177getNativeTypefacePYhJU0U(typefaceRequest.getFontWeight(), typefaceRequest.m4096getFontStyle_LCdwA(), typefaceRequest.m4097getFontSynthesisGVVA2EU());
        }
        return new TypefaceResult.Immutable(typefaceMo4084createDefaultFO1MlWM, false, 2, null);
    }
}
