package p1;

import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter;
import androidx.compose.ui.text.font.PlatformFontLoader;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.font.TypefaceResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Lambda implements Function1<Function1<? super TypefaceResult, ? extends Unit>, TypefaceResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ FontFamilyResolverImpl f92550p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TypefaceRequest f92551q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FontFamilyResolverImpl fontFamilyResolverImpl, TypefaceRequest typefaceRequest) {
        super(1);
        this.f92550p0 = fontFamilyResolverImpl;
        this.f92551q0 = typefaceRequest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final TypefaceResult invoke(Function1<? super TypefaceResult, ? extends Unit> function1) {
        Function1<? super TypefaceResult, ? extends Unit> onAsyncCompletion = function1;
        Intrinsics.checkNotNullParameter(onAsyncCompletion, "onAsyncCompletion");
        FontFamilyResolverImpl fontFamilyResolverImpl = this.f92550p0;
        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = fontFamilyResolverImpl.f17951d;
        PlatformFontLoader platformFontLoader = fontFamilyResolverImpl.getPlatformFontLoader();
        Function1 function2 = fontFamilyResolverImpl.f17953f;
        TypefaceRequest typefaceRequest = this.f92551q0;
        TypefaceResult typefaceResultResolve = fontListFontFamilyTypefaceAdapter.resolve(typefaceRequest, platformFontLoader, onAsyncCompletion, function2);
        if (typefaceResultResolve == null && (typefaceResultResolve = fontFamilyResolverImpl.f17952e.resolve(typefaceRequest, fontFamilyResolverImpl.getPlatformFontLoader(), onAsyncCompletion, fontFamilyResolverImpl.f17953f)) == null) {
            throw new IllegalStateException("Could not load font");
        }
        return typefaceResultResolve;
    }
}
