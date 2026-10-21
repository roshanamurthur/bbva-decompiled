package androidx.compose.ui.text.font;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJB\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\fH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamily;", "family", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "resourceLoader", "", "preload", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "platformFontLoader", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "onAsyncCompletion", "", "createDefaultTypeface", "Landroidx/compose/ui/text/font/TypefaceResult;", "resolve", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Lkotlin/coroutines/CoroutineContext;", "injectedContext", "<init>", "(Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/coroutines/CoroutineContext;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,427:1\n35#2,3:428\n38#2,2:435\n40#2:438\n56#2,4:450\n60#2,3:458\n63#2:462\n33#3,4:431\n38#3:437\n151#3,3:439\n33#3,4:442\n154#3,2:446\n38#3:448\n156#3:449\n33#3,4:454\n38#3:461\n33#3,6:463\n49#4,4:469\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n*L\n68#1:428,3\n68#1:435,2\n68#1:438\n70#1:450,4\n70#1:458,3\n70#1:462\n68#1:431,4\n68#1:437\n69#1:439,3\n69#1:442,4\n69#1:446,2\n69#1:448\n69#1:449\n70#1:454,4\n70#1:461\n74#1:463,6\n155#1:469,4\n*E\n"})
public final class FontListFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final FontMatcher f17964c = new FontMatcher();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1 f17965d = new FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AsyncTypefaceCache f17966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f17967b;

    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$Companion;", "", "()V", "DropExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getDropExceptionHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CoroutineExceptionHandler getDropExceptionHandler() {
            return FontListFontFamilyTypefaceAdapter.f17965d;
        }

        @NotNull
        public final FontMatcher getFontMatcher() {
            return FontListFontFamilyTypefaceAdapter.f17964c;
        }
    }

    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    public static final class a extends Lambda implements Function1<TypefaceRequest, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f17968p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TypefaceRequest typefaceRequest) {
            TypefaceRequest it = typefaceRequest;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @DebugMetadata(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$preload$3\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,427:1\n56#2,4:428\n60#2,3:436\n63#2:440\n33#3,4:432\n38#3:439\n151#3,3:441\n33#3,4:444\n154#3,2:448\n38#3:450\n156#3:451\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$preload$3\n*L\n100#1:428,4\n100#1:436,3\n100#1:440\n100#1:432,4\n100#1:439\n101#1:441,3\n101#1:444,4\n101#1:448,2\n101#1:450\n101#1:451\n*E\n"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f17969p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f17970q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ List<Font> f17971r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ FontListFontFamilyTypefaceAdapter f17972s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ PlatformFontLoader f17973t0;

        /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
        @DebugMetadata(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f17974p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ FontListFontFamilyTypefaceAdapter f17975q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Font f17976r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ PlatformFontLoader f17977s0;

            /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
            @DebugMetadata(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0067a extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public int f17978p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ Font f17979q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ PlatformFontLoader f17980r0;

                /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$b$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
                @DebugMetadata(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
                public static final class C0068a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {

                    /* JADX INFO: renamed from: p0, reason: collision with root package name */
                    public int f17981p0;

                    /* JADX INFO: renamed from: q0, reason: collision with root package name */
                    public final /* synthetic */ PlatformFontLoader f17982q0;

                    /* JADX INFO: renamed from: r0, reason: collision with root package name */
                    public final /* synthetic */ Font f17983r0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0068a(Font font, PlatformFontLoader platformFontLoader, Continuation continuation) {
                        super(2, continuation);
                        this.f17982q0 = platformFontLoader;
                        this.f17983r0 = font;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C0068a(this.f17983r0, this.f17982q0, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
                        return ((C0068a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                        int i10 = this.f17981p0;
                        if (i10 == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.f17981p0 = 1;
                            obj = this.f17982q0.awaitLoad(this.f17983r0, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return obj;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0067a(Font font, PlatformFontLoader platformFontLoader, Continuation<? super C0067a> continuation) {
                    super(1, continuation);
                    this.f17979q0 = font;
                    this.f17980r0 = platformFontLoader;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new C0067a(this.f17979q0, this.f17980r0, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Continuation<? super Object> continuation) {
                    return ((C0067a) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f17978p0;
                    Font font = this.f17979q0;
                    try {
                        if (i10 == 0) {
                            ResultKt.throwOnFailure(obj);
                            C0068a c0068a = new C0068a(font, this.f17980r0, null);
                            this.f17978p0 = 1;
                            obj = TimeoutKt.withTimeout(15000L, c0068a, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        if (obj != null) {
                            return obj;
                        }
                        throw new IllegalStateException("Unable to load font " + font);
                    } catch (Exception e5) {
                        throw new IllegalStateException("Unable to load font " + font, e5);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, Font font, PlatformFontLoader platformFontLoader, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f17975q0 = fontListFontFamilyTypefaceAdapter;
                this.f17976r0 = font;
                this.f17977s0 = platformFontLoader;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f17975q0, this.f17976r0, this.f17977s0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f17974p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AsyncTypefaceCache asyncTypefaceCache = this.f17975q0.f17966a;
                    Font font = this.f17976r0;
                    PlatformFontLoader platformFontLoader = this.f17977s0;
                    C0067a c0067a = new C0067a(font, platformFontLoader, null);
                    this.f17974p0 = 1;
                    obj = asyncTypefaceCache.runCached(font, platformFontLoader, true, c0067a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<Font> list, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontLoader platformFontLoader, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f17971r0 = list;
            this.f17972s0 = fontListFontFamilyTypefaceAdapter;
            this.f17973t0 = platformFontLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.f17971r0, this.f17972s0, this.f17973t0, continuation);
            bVar.f17970q0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f17969p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f17970q0;
                List<Font> list = this.f17971r0;
                HashSet hashSet = new HashSet(list.size());
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Font font = list.get(i11);
                    if (hashSet.add(font)) {
                        arrayList.add(font);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size2 = arrayList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    arrayList2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new a(this.f17972s0, (Font) arrayList.get(i12), this.f17973t0, null), 3, null));
                }
                this.f17969p0 = 1;
                if (AwaitKt.joinAll(arrayList2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @DebugMetadata(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f17984p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AsyncFontListLoader f17985q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AsyncFontListLoader asyncFontListLoader, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f17985q0 = asyncFontListLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.f17985q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f17984p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f17984p0 = 1;
                if (this.f17985q0.load(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamilyTypefaceAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final Object preload(@NotNull FontFamily fontFamily, @NotNull PlatformFontLoader platformFontLoader, @NotNull Continuation<? super Unit> continuation) {
        if (!(fontFamily instanceof FontListFontFamily)) {
            return Unit.INSTANCE;
        }
        FontListFontFamily fontListFontFamily = (FontListFontFamily) fontFamily;
        List<Font> fonts = fontListFontFamily.getFonts();
        List<Font> fonts2 = fontListFontFamily.getFonts();
        ArrayList arrayList = new ArrayList(fonts2.size());
        int size = fonts2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Font font = fonts2.get(i10);
            if (FontLoadingStrategy.m4049equalsimpl0(font.getLoadingStrategy(), FontLoadingStrategy.INSTANCE.m4053getAsyncPKNRLFQ())) {
                arrayList.add(font);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Font font2 = (Font) arrayList.get(i11);
            arrayList2.add(TuplesKt.to(font2.getWeight(), FontStyle.m4059boximpl(font2.getStyle())));
        }
        HashSet hashSet = new HashSet(arrayList2.size());
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size3 = arrayList2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Object obj = arrayList2.get(i12);
            if (hashSet.add((Pair) obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size4 = arrayList3.size();
        for (int i13 = 0; i13 < size4; i13++) {
            Pair pair = (Pair) arrayList3.get(i13);
            FontWeight fontWeight = (FontWeight) pair.component1();
            int iM4065unboximpl = ((FontStyle) pair.component2()).m4065unboximpl();
            List list = (List) FontListFontFamilyTypefaceAdapterKt.access$firstImmediatelyAvailable(f17964c.m4058matchFontRetOiIg(fonts, fontWeight, iM4065unboximpl), new TypefaceRequest(fontFamily, fontWeight, iM4065unboximpl, FontSynthesis.INSTANCE.m4077getAllGVVA2EU(), platformFontLoader.getCacheKey(), null), this.f17966a, platformFontLoader, a.f17968p0).component1();
            if (list != null) {
                arrayList4.add(CollectionsKt___CollectionsKt.first(list));
            }
        }
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new b(arrayList4, this, platformFontLoader, null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    @Nullable
    public TypefaceResult resolve(@NotNull TypefaceRequest typefaceRequest, @NotNull PlatformFontLoader platformFontLoader, @NotNull Function1<? super TypefaceResult.Immutable, Unit> onAsyncCompletion, @NotNull Function1<? super TypefaceRequest, ? extends Object> createDefaultTypeface) {
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        Intrinsics.checkNotNullParameter(onAsyncCompletion, "onAsyncCompletion");
        Intrinsics.checkNotNullParameter(createDefaultTypeface, "createDefaultTypeface");
        if (!(typefaceRequest.getFontFamily() instanceof FontListFontFamily)) {
            return null;
        }
        Pair pairAccess$firstImmediatelyAvailable = FontListFontFamilyTypefaceAdapterKt.access$firstImmediatelyAvailable(f17964c.m4058matchFontRetOiIg(((FontListFontFamily) typefaceRequest.getFontFamily()).getFonts(), typefaceRequest.getFontWeight(), typefaceRequest.m4096getFontStyle_LCdwA()), typefaceRequest, this.f17966a, platformFontLoader, createDefaultTypeface);
        List list = (List) pairAccess$firstImmediatelyAvailable.component1();
        Object objComponent2 = pairAccess$firstImmediatelyAvailable.component2();
        if (list == null) {
            return new TypefaceResult.Immutable(objComponent2, false, 2, null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, objComponent2, typefaceRequest, this.f17966a, onAsyncCompletion, platformFontLoader);
        BuildersKt__Builders_commonKt.launch$default(this.f17967b, null, CoroutineStart.UNDISPATCHED, new c(asyncFontListLoader, null), 1, null);
        return new TypefaceResult.Async(asyncFontListLoader);
    }

    public FontListFontFamilyTypefaceAdapter(@NotNull AsyncTypefaceCache asyncTypefaceCache, @NotNull CoroutineContext injectedContext) {
        Intrinsics.checkNotNullParameter(asyncTypefaceCache, "asyncTypefaceCache");
        Intrinsics.checkNotNullParameter(injectedContext, "injectedContext");
        this.f17966a = asyncTypefaceCache;
        this.f17967b = CoroutineScopeKt.CoroutineScope(f17965d.plus(injectedContext).plus(SupervisorKt.SupervisorJob((Job) injectedContext.get(Job.INSTANCE))));
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, CoroutineContext coroutineContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i10 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext);
    }
}
