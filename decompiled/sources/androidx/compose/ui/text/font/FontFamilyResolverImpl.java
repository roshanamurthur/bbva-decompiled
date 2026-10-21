package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J=\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "", "preload", "(Landroidx/compose/ui/text/font/FontFamily;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/runtime/State;", "", "resolve-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "resolve", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "a", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "getPlatformFontLoader$ui_text_release", "()Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "platformResolveInterceptor", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "typefaceRequestCache", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "fontListFontFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "platformFamilyTypefaceAdapter", "<init>", "(Landroidx/compose/ui/text/font/PlatformFontLoader;Landroidx/compose/ui/text/font/PlatformResolveInterceptor;Landroidx/compose/ui/text/font/TypefaceRequestCache;Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,248:1\n151#2,3:249\n33#2,4:252\n154#2,2:256\n38#2:258\n156#2:259\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n*L\n47#1:249,3\n47#1:252,4\n47#1:256,2\n47#1:258\n47#1:259\n*E\n"})
public final class FontFamilyResolverImpl implements FontFamily.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PlatformFontLoader platformFontLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlatformResolveInterceptor f17949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TypefaceRequestCache f17950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final FontListFontFamilyTypefaceAdapter f17951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PlatformFontFamilyTypefaceAdapter f17952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final a f17953f;

    /* JADX INFO: compiled from: FontFamilyResolver.kt */
    public static final class a extends Lambda implements Function1<TypefaceRequest, Object> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(TypefaceRequest typefaceRequest) {
            TypefaceRequest it = typefaceRequest;
            Intrinsics.checkNotNullParameter(it, "it");
            return FontFamilyResolverImpl.access$resolve(FontFamilyResolverImpl.this, TypefaceRequest.m4092copye1PVR60$default(it, null, null, 0, 0, null, 30, null)).getValue();
        }
    }

    /* JADX INFO: compiled from: FontFamilyResolver.kt */
    @DebugMetadata(c = "androidx.compose.ui.text.font.FontFamilyResolverImpl", f = "FontFamilyResolver.kt", i = {0, 0}, l = {45}, m = "preload", n = {"this", "fontFamily"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public FontFamilyResolverImpl f17955p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public FontFamily f17956q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f17957r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f17959t0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17957r0 = obj;
            this.f17959t0 |= Integer.MIN_VALUE;
            return FontFamilyResolverImpl.this.preload(null, this);
        }
    }

    /* JADX INFO: compiled from: FontFamilyResolver.kt */
    public static final class c extends Lambda implements Function1<TypefaceRequest, TypefaceResult> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final TypefaceResult invoke(TypefaceRequest typefaceRequest) {
            TypefaceRequest typeRequest = typefaceRequest;
            Intrinsics.checkNotNullParameter(typeRequest, "typeRequest");
            FontFamilyResolverImpl fontFamilyResolverImpl = FontFamilyResolverImpl.this;
            TypefaceResult typefaceResultResolve = fontFamilyResolverImpl.f17951d.resolve(typeRequest, fontFamilyResolverImpl.getPlatformFontLoader(), androidx.compose.ui.text.font.c.f18040p0, fontFamilyResolverImpl.f17953f);
            if (typefaceResultResolve == null && (typefaceResultResolve = fontFamilyResolverImpl.f17952e.resolve(typeRequest, fontFamilyResolverImpl.getPlatformFontLoader(), d.f18041p0, fontFamilyResolverImpl.f17953f)) == null) {
                throw new IllegalStateException("Could not load font");
            }
            return typefaceResultResolve;
        }
    }

    public FontFamilyResolverImpl(@NotNull PlatformFontLoader platformFontLoader, @NotNull PlatformResolveInterceptor platformResolveInterceptor, @NotNull TypefaceRequestCache typefaceRequestCache, @NotNull FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, @NotNull PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter) {
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        Intrinsics.checkNotNullParameter(platformResolveInterceptor, "platformResolveInterceptor");
        Intrinsics.checkNotNullParameter(typefaceRequestCache, "typefaceRequestCache");
        Intrinsics.checkNotNullParameter(fontListFontFamilyTypefaceAdapter, "fontListFontFamilyTypefaceAdapter");
        Intrinsics.checkNotNullParameter(platformFamilyTypefaceAdapter, "platformFamilyTypefaceAdapter");
        this.platformFontLoader = platformFontLoader;
        this.f17949b = platformResolveInterceptor;
        this.f17950c = typefaceRequestCache;
        this.f17951d = fontListFontFamilyTypefaceAdapter;
        this.f17952e = platformFamilyTypefaceAdapter;
        this.f17953f = new a();
    }

    public static final State access$resolve(FontFamilyResolverImpl fontFamilyResolverImpl, TypefaceRequest typefaceRequest) {
        fontFamilyResolverImpl.getClass();
        return fontFamilyResolverImpl.f17950c.runCached(typefaceRequest, new p1.d(fontFamilyResolverImpl, typefaceRequest));
    }

    @NotNull
    /* JADX INFO: renamed from: getPlatformFontLoader$ui_text_release, reason: from getter */
    public final PlatformFontLoader getPlatformFontLoader() {
        return this.platformFontLoader;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    @Nullable
    public Object preload(@NotNull FontFamily fontFamily, @NotNull Continuation<? super Unit> continuation) {
        b bVar;
        FontFamilyResolverImpl fontFamilyResolverImpl;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f17959t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f17959t0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f17957r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f17959t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!(fontFamily instanceof FontListFontFamily)) {
                return Unit.INSTANCE;
            }
            bVar.f17955p0 = this;
            bVar.f17956q0 = fontFamily;
            bVar.f17959t0 = 1;
            if (this.f17951d.preload(fontFamily, this.platformFontLoader, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            fontFamilyResolverImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fontFamily = bVar.f17956q0;
            fontFamilyResolverImpl = bVar.f17955p0;
            ResultKt.throwOnFailure(obj);
        }
        List<Font> fonts = ((FontListFontFamily) fontFamily).getFonts();
        ArrayList arrayList = new ArrayList(fonts.size());
        int size = fonts.size();
        for (int i12 = 0; i12 < size; i12++) {
            Font font = fonts.get(i12);
            FontFamily fontFamilyInterceptFontFamily = fontFamilyResolverImpl.f17949b.interceptFontFamily(fontFamily);
            FontWeight weight = font.getWeight();
            PlatformResolveInterceptor platformResolveInterceptor = fontFamilyResolverImpl.f17949b;
            arrayList.add(new TypefaceRequest(fontFamilyInterceptFontFamily, platformResolveInterceptor.interceptFontWeight(weight), platformResolveInterceptor.mo4016interceptFontStyleT2F_aPo(font.getStyle()), FontSynthesis.INSTANCE.m4077getAllGVVA2EU(), fontFamilyResolverImpl.platformFontLoader.getCacheKey(), null));
        }
        fontFamilyResolverImpl.f17950c.preWarmCache(arrayList, fontFamilyResolverImpl.new c());
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    @NotNull
    /* JADX INFO: renamed from: resolve-DPcqOEQ */
    public State<Object> mo4038resolveDPcqOEQ(@Nullable FontFamily fontFamily, @NotNull FontWeight fontWeight, int fontStyle, int fontSynthesis) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        PlatformResolveInterceptor platformResolveInterceptor = this.f17949b;
        TypefaceRequest typefaceRequest = new TypefaceRequest(platformResolveInterceptor.interceptFontFamily(fontFamily), platformResolveInterceptor.interceptFontWeight(fontWeight), platformResolveInterceptor.mo4016interceptFontStyleT2F_aPo(fontStyle), platformResolveInterceptor.mo4017interceptFontSynthesisMscr08Y(fontSynthesis), this.platformFontLoader.getCacheKey(), null);
        return this.f17950c.runCached(typefaceRequest, new p1.d(this, typefaceRequest));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(platformFontLoader, (i10 & 2) != 0 ? PlatformResolveInterceptor.INSTANCE.getDefault$ui_text_release() : platformResolveInterceptor, (i10 & 4) != 0 ? FontFamilyResolverKt.getGlobalTypefaceRequestCache() : typefaceRequestCache, (i10 & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), null, 2, 0 == true ? 1 : 0) : fontListFontFamilyTypefaceAdapter, (i10 & 16) != 0 ? new PlatformFontFamilyTypefaceAdapter() : platformFontFamilyTypefaceAdapter);
    }
}
