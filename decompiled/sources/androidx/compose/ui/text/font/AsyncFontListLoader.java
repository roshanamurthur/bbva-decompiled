package androidx.compose.ui.text.font;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0013\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u0002*\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR+\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Landroidx/compose/runtime/State;", "", "", "load", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/Font;", "loadWithTimeoutOrNull$ui_text_release", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithTimeoutOrNull", "<set-?>", "u0", "Landroidx/compose/runtime/MutableState;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "", "v0", "Z", "getCacheable$ui_text_release", "()Z", "setCacheable$ui_text_release", "(Z)V", "cacheable", "", "fontList", "initialType", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "onCompletion", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "<init>", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/font/PlatformFontLoader;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,427:1\n81#2:428\n107#2,2:429\n33#3,6:431\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n*L\n252#1:428\n252#1:429,2\n259#1:431,6\n*E\n"})
public final class AsyncFontListLoader implements State<Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final List<Font> f17899p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final TypefaceRequest f17900q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final AsyncTypefaceCache f17901r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Function1<TypefaceResult.Immutable, Unit> f17902s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final PlatformFontLoader f17903t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState value;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public boolean cacheable;

    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {268, 281}, m = "load", n = {"this", "$this$fastForEach$iv", "font", "index$iv", "this", "$this$fastForEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public AsyncFontListLoader f17905p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public List f17906q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Font f17907r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f17908s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f17909t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public /* synthetic */ Object f17910u0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f17911w0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17910u0 = obj;
            this.f17911w0 |= Integer.MIN_VALUE;
            return AsyncFontListLoader.this.load(this);
        }
    }

    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f17912p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Font f17914r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Font font, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f17914r0 = font;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return AsyncFontListLoader.this.new b(this.f17914r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Object> continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f17912p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f17912p0 = 1;
                obj = AsyncFontListLoader.this.loadWithTimeoutOrNull$ui_text_release(this.f17914r0, this);
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

    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0}, l = {300}, m = "loadWithTimeoutOrNull$ui_text_release", n = {"$this$loadWithTimeoutOrNull"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Font f17915p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f17916q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f17918s0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17916q0 = obj;
            this.f17918s0 |= Integer.MIN_VALUE;
            return AsyncFontListLoader.this.loadWithTimeoutOrNull$ui_text_release(null, this);
        }
    }

    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {301}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f17919p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Font f17921r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Font font, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f17921r0 = font;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AsyncFontListLoader.this.new d(this.f17921r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f17919p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PlatformFontLoader platformFontLoader = AsyncFontListLoader.this.f17903t0;
                this.f17919p0 = 1;
                obj = platformFontLoader.awaitLoad(this.f17921r0, this);
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

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(@NotNull List<? extends Font> fontList, @NotNull Object initialType, @NotNull TypefaceRequest typefaceRequest, @NotNull AsyncTypefaceCache asyncTypefaceCache, @NotNull Function1<? super TypefaceResult.Immutable, Unit> onCompletion, @NotNull PlatformFontLoader platformFontLoader) {
        Intrinsics.checkNotNullParameter(fontList, "fontList");
        Intrinsics.checkNotNullParameter(initialType, "initialType");
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        Intrinsics.checkNotNullParameter(asyncTypefaceCache, "asyncTypefaceCache");
        Intrinsics.checkNotNullParameter(onCompletion, "onCompletion");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        this.f17899p0 = fontList;
        this.f17900q0 = typefaceRequest;
        this.f17901r0 = asyncTypefaceCache;
        this.f17902s0 = onCompletion;
        this.f17903t0 = platformFontLoader;
        this.value = SnapshotStateKt.mutableStateOf$default(initialType, null, 2, null);
        this.cacheable = true;
    }

    /* JADX INFO: renamed from: getCacheable$ui_text_release, reason: from getter */
    public final boolean getCacheable() {
        return this.cacheable;
    }

    @Override // androidx.compose.runtime.State
    @NotNull
    public Object getValue() {
        return this.value.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084 A[Catch: all -> 0x0100, TRY_LEAVE, TryCatch #0 {all -> 0x0100, blocks: (B:28:0x006d, B:30:0x0084), top: B:52:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3 A[Catch: all -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x003e, blocks: (B:13:0x0038, B:35:0x00b3, B:38:0x00e5), top: B:58:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5 A[Catch: all -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x003e, blocks: (B:13:0x0038, B:35:0x00b3, B:38:0x00e5), top: B:58:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00fb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f9 -> B:41:0x00fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0103 -> B:45:0x0105). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object load(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.load(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object loadWithTimeoutOrNull$ui_text_release(@NotNull Font font, @NotNull Continuation<Object> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f17918s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f17918s0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objWithTimeoutOrNull = cVar.f17916q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f17918s0;
        Object obj = null;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                d dVar = new d(font, null);
                cVar.f17915p0 = font;
                cVar.f17918s0 = 1;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, dVar, cVar);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                font = cVar.f17915p0;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            obj = objWithTimeoutOrNull;
            return obj;
        } catch (CancellationException e5) {
            if (JobKt.isActive(cVar.getF79378p0())) {
                return obj;
            }
            throw e5;
        } catch (Exception e7) {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) cVar.getF79378p0().get(CoroutineExceptionHandler.INSTANCE);
            if (coroutineExceptionHandler == null) {
                return obj;
            }
            coroutineExceptionHandler.handleException(cVar.getF79378p0(), new IllegalStateException("Unable to load font " + font, e7));
            return obj;
        }
    }

    public final void setCacheable$ui_text_release(boolean z10) {
        this.cacheable = z10;
    }
}
