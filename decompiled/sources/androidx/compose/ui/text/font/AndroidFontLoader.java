package androidx.compose.ui.text.font;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidFontLoader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "Landroidx/compose/ui/text/font/Font;", "font", "Landroid/graphics/Typeface;", "loadBlocking", "awaitLoad", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cacheKey", "Ljava/lang/Object;", "getCacheKey", "()Ljava/lang/Object;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class AndroidFontLoader implements PlatformFontLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17888a;

    /* JADX INFO: compiled from: AndroidFontLoader.android.kt */
    @DebugMetadata(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", i = {1, 1}, l = {61, 62}, m = "awaitLoad", n = {"this", "font"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public AndroidFontLoader f17889p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Font f17890q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f17891r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f17893t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17891r0 = obj;
            this.f17893t0 |= Integer.MIN_VALUE;
            return AndroidFontLoader.this.awaitLoad(null, this);
        }
    }

    public AndroidFontLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17888a = context.getApplicationContext();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @Nullable
    public Object awaitLoad(@NotNull Font font, @NotNull Continuation<? super android.graphics.Typeface> continuation) {
        a aVar;
        AndroidFontLoader androidFontLoader;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f17893t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f17893t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.f17891r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f17893t0;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(objWithContext);
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            font = aVar.f17890q0;
            androidFontLoader = aVar.f17889p0;
            ResultKt.throwOnFailure(objWithContext);
            FontVariation.Settings variationSettings = ((ResourceFont) font).getVariationSettings();
            Context context = androidFontLoader.f17888a;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            return PlatformTypefacesKt.setFontVariationSettings((android.graphics.Typeface) objWithContext, variationSettings, context);
        }
        ResultKt.throwOnFailure(objWithContext);
        boolean z10 = font instanceof AndroidFont;
        Context context2 = this.f17888a;
        if (z10) {
            AndroidFont androidFont = (AndroidFont) font;
            AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            aVar.f17893t0 = 1;
            objWithContext = typefaceLoader.awaitLoad(context2, androidFont, aVar);
            return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
        }
        if (!(font instanceof ResourceFont)) {
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        aVar.f17889p0 = this;
        aVar.f17890q0 = font;
        aVar.f17893t0 = 2;
        objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new p1.a((ResourceFont) font, context2, null), aVar);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        androidFontLoader = this;
        FontVariation.Settings variationSettings2 = ((ResourceFont) font).getVariationSettings();
        Context context3 = androidFontLoader.f17888a;
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        return PlatformTypefacesKt.setFontVariationSettings((android.graphics.Typeface) objWithContext, variationSettings2, context3);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @Nullable
    public Object getCacheKey() {
        return null;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @Nullable
    public android.graphics.Typeface loadBlocking(@NotNull Font font) {
        Object objM5535constructorimpl;
        android.graphics.Typeface typefaceAccess$load;
        Intrinsics.checkNotNullParameter(font, "font");
        boolean z10 = font instanceof AndroidFont;
        Context context = this.f17888a;
        if (z10) {
            AndroidFont androidFont = (AndroidFont) font;
            AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            return typefaceLoader.loadBlocking(context, androidFont);
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int loadingStrategy = font.getLoadingStrategy();
        FontLoadingStrategy.Companion companion = FontLoadingStrategy.INSTANCE;
        if (FontLoadingStrategy.m4049equalsimpl0(loadingStrategy, companion.m4054getBlockingPKNRLFQ())) {
            Intrinsics.checkNotNullExpressionValue(context, "context");
            typefaceAccess$load = AndroidFontLoader_androidKt.access$load((ResourceFont) font, context);
        } else {
            if (!FontLoadingStrategy.m4049equalsimpl0(loadingStrategy, companion.m4055getOptionalLocalPKNRLFQ())) {
                if (FontLoadingStrategy.m4049equalsimpl0(loadingStrategy, companion.m4053getAsyncPKNRLFQ())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) FontLoadingStrategy.m4051toStringimpl(font.getLoadingStrategy())));
            }
            try {
                Result.Companion companion2 = Result.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                objM5535constructorimpl = Result.m5535constructorimpl(AndroidFontLoader_androidKt.access$load((ResourceFont) font, context));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            typefaceAccess$load = (android.graphics.Typeface) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
        }
        FontVariation.Settings variationSettings = ((ResourceFont) font).getVariationSettings();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return PlatformTypefacesKt.setFontVariationSettings(typefaceAccess$load, variationSettings, context);
    }
}
