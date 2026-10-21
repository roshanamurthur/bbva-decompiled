package androidx.compose.ui.text.font;

import androidx.camera.core.impl.v;
import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.caches.SimpleArrayMap;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.networkplugin.command.impl.PutCommand;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007J(\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\rJM\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u001e\u0010\u0011\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0086@ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u0086\bø\u0001\u0003\u0082\u0002\u0016\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "", "Landroidx/compose/ui/text/font/Font;", "font", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "result", "", "forever", "", PutCommand.ID, "Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "get-1ASDuI8", "(Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;)Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "get", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "runCached", "(Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "runCachedBlocking", "<init>", "()V", "AsyncTypefaceResult", "Key", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,427:1\n24#2:428\n24#2:429\n24#2:430\n24#2:431\n24#2:432\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n*L\n365#1:428\n376#1:429\n388#1:430\n395#1:431\n416#1:432\n*E\n"})
public final class AsyncTypefaceCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Object f17922a = AsyncTypefaceResult.m4022constructorimpl(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LruCache<Key, AsyncTypefaceResult> f17923b = new LruCache<>(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SimpleArrayMap<Key, AsyncTypefaceResult> f17924c = new SimpleArrayMap<>(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SynchronizedObject f17925d = Synchronization_jvmKt.createSynchronizedObject();

    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;", "", "Landroidx/compose/ui/text/font/Font;", "component1", "component2", "font", "loaderKey", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Landroidx/compose/ui/text/font/Font;", "getFont", "()Landroidx/compose/ui/text/font/Font;", "b", "Ljava/lang/Object;", "getLoaderKey", "()Ljava/lang/Object;", "<init>", "(Landroidx/compose/ui/text/font/Font;Ljava/lang/Object;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Key {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Font font;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Object loaderKey;

        public Key(@NotNull Font font, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(font, "font");
            this.font = font;
            this.loaderKey = obj;
        }

        public static /* synthetic */ Key copy$default(Key key, Font font, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                font = key.font;
            }
            if ((i10 & 2) != 0) {
                obj = key.loaderKey;
            }
            return key.copy(font, obj);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Font getFont() {
            return this.font;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Object getLoaderKey() {
            return this.loaderKey;
        }

        @NotNull
        public final Key copy(@NotNull Font font, @Nullable Object loaderKey) {
            Intrinsics.checkNotNullParameter(font, "font");
            return new Key(font, loaderKey);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.areEqual(this.font, key.font) && Intrinsics.areEqual(this.loaderKey, key.loaderKey);
        }

        @NotNull
        public final Font getFont() {
            return this.font;
        }

        @Nullable
        public final Object getLoaderKey() {
            return this.loaderKey;
        }

        public int hashCode() {
            int iHashCode = this.font.hashCode() * 31;
            Object obj = this.loaderKey;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Key(font=");
            sb2.append(this.font);
            sb2.append(", loaderKey=");
            return v.d(sb2, this.loaderKey, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @DebugMetadata(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0}, l = {394}, m = "runCached", n = {"this", "key", "forever"}, s = {"L$0", "L$1", "Z$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public AsyncTypefaceCache f17929p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Key f17930q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f17931r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f17932s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f17934u0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17932s0 = obj;
            this.f17934u0 |= Integer.MIN_VALUE;
            return AsyncTypefaceCache.this.runCached(null, null, false, null, this);
        }
    }

    public static /* synthetic */ void put$default(AsyncTypefaceCache asyncTypefaceCache, Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        asyncTypefaceCache.put(font, platformFontLoader, obj, z10);
    }

    @Nullable
    /* JADX INFO: renamed from: get-1ASDuI8, reason: not valid java name */
    public final AsyncTypefaceResult m4020get1ASDuI8(@NotNull Font font, @NotNull PlatformFontLoader platformFontLoader) {
        AsyncTypefaceResult asyncTypefaceResult;
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.f17925d) {
            asyncTypefaceResult = this.f17923b.get(key);
            if (asyncTypefaceResult == null) {
                asyncTypefaceResult = this.f17924c.get(key);
            }
        }
        return asyncTypefaceResult;
    }

    public final void put(@NotNull Font font, @NotNull PlatformFontLoader platformFontLoader, @Nullable Object result, boolean forever) {
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.f17925d) {
            try {
                if (result == null) {
                    this.f17924c.put(key, AsyncTypefaceResult.m4021boximpl(this.f17922a));
                } else if (forever) {
                    this.f17924c.put(key, AsyncTypefaceResult.m4021boximpl(AsyncTypefaceResult.m4022constructorimpl(result)));
                } else {
                    this.f17923b.put(key, AsyncTypefaceResult.m4021boximpl(AsyncTypefaceResult.m4022constructorimpl(result)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object runCached(@NotNull Font font, @NotNull PlatformFontLoader platformFontLoader, boolean z10, @NotNull Function1<? super Continuation<Object>, ? extends Object> function1, @NotNull Continuation<Object> continuation) {
        a aVar;
        AsyncTypefaceCache asyncTypefaceCache;
        Key key;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f17934u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f17934u0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f17932s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f17934u0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Key key2 = new Key(font, platformFontLoader.getCacheKey());
            synchronized (this.f17925d) {
                try {
                    AsyncTypefaceResult asyncTypefaceResult = this.f17923b.get(key2);
                    if (asyncTypefaceResult == null) {
                        asyncTypefaceResult = this.f17924c.get(key2);
                    }
                    if (asyncTypefaceResult != null) {
                        return asyncTypefaceResult.m4028unboximpl();
                    }
                    Unit unit = Unit.INSTANCE;
                    aVar.f17929p0 = this;
                    aVar.f17930q0 = key2;
                    aVar.f17931r0 = z10;
                    aVar.f17934u0 = 1;
                    Object objInvoke = function1.invoke(aVar);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    asyncTypefaceCache = this;
                    obj = objInvoke;
                    key = key2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = aVar.f17931r0;
            key = aVar.f17930q0;
            asyncTypefaceCache = aVar.f17929p0;
            ResultKt.throwOnFailure(obj);
        }
        synchronized (asyncTypefaceCache.f17925d) {
            try {
                if (obj == null) {
                    asyncTypefaceCache.f17924c.put(key, AsyncTypefaceResult.m4021boximpl(asyncTypefaceCache.f17922a));
                } else if (z10) {
                    asyncTypefaceCache.f17924c.put(key, AsyncTypefaceResult.m4021boximpl(AsyncTypefaceResult.m4022constructorimpl(obj)));
                } else {
                    asyncTypefaceCache.f17923b.put(key, AsyncTypefaceResult.m4021boximpl(AsyncTypefaceResult.m4022constructorimpl(obj)));
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return obj;
    }

    @Nullable
    public final Object runCachedBlocking(@NotNull Font font, @NotNull PlatformFontLoader platformFontLoader, @NotNull Function0<? extends Object> block) {
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this.f17925d) {
            try {
                Key key = new Key(font, platformFontLoader.getCacheKey());
                AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceResult) this.f17923b.get(key);
                if (asyncTypefaceResult == null) {
                    asyncTypefaceResult = (AsyncTypefaceResult) this.f17924c.get(key);
                }
                if (asyncTypefaceResult != null) {
                    Object objM4028unboximpl = asyncTypefaceResult.m4028unboximpl();
                    InlineMarker.finallyStart(2);
                    InlineMarker.finallyEnd(2);
                    return objM4028unboximpl;
                }
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                Object objInvoke = block.invoke();
                put$default(this, font, platformFontLoader, objInvoke, false, 8, null);
                return objInvoke;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081@\u0018\u00002\u00020\u0001B\u0014\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0013\u0092\u0001\u0004\u0018\u00010\u0001ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/lang/Object;)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "equals", "a", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "result", "isPermanentFailure-impl", "(Ljava/lang/Object;)Z", "isPermanentFailure", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    @JvmInline
    public static final class AsyncTypefaceResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Object result;

        public /* synthetic */ AsyncTypefaceResult(Object obj) {
            this.result = obj;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ AsyncTypefaceResult m4021boximpl(Object obj) {
            return new AsyncTypefaceResult(obj);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m4023equalsimpl(Object obj, Object obj2) {
            return (obj2 instanceof AsyncTypefaceResult) && Intrinsics.areEqual(obj, ((AsyncTypefaceResult) obj2).m4028unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4024equalsimpl0(Object obj, Object obj2) {
            return Intrinsics.areEqual(obj, obj2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m4025hashCodeimpl(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* JADX INFO: renamed from: isPermanentFailure-impl, reason: not valid java name */
        public static final boolean m4026isPermanentFailureimpl(Object obj) {
            return obj == null;
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m4027toStringimpl(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + RootService.CLOSE_BRACKET;
        }

        public boolean equals(Object obj) {
            return m4023equalsimpl(this.result, obj);
        }

        @Nullable
        public final Object getResult() {
            return this.result;
        }

        public int hashCode() {
            return m4025hashCodeimpl(this.result);
        }

        public String toString() {
            return m4027toStringimpl(this.result);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Object m4028unboximpl() {
            return this.result;
        }

        @NotNull
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static Object m4022constructorimpl(@Nullable Object obj) {
            return obj;
        }
    }
}
