package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00050\u0004J(\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004J\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequestCache;", "", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult;", "", "resolveTypeface", "Landroidx/compose/runtime/State;", "runCached", "", "typefaceRequests", "preWarmCache", "get$ui_text_release", "(Landroidx/compose/ui/text/font/TypefaceRequest;)Landroidx/compose/ui/text/font/TypefaceResult;", "get", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "a", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "getLock$ui_text_release", "()Landroidx/compose/ui/text/platform/SynchronizedObject;", "lock", "", "getSize$ui_text_release", "()I", "size", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,248:1\n24#2:249\n24#2:250\n24#2:251\n24#2:252\n24#2:253\n24#2:254\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n*L\n165#1:249\n202#1:250\n219#1:251\n232#1:252\n239#1:253\n245#1:254\n*E\n"})
public final class TypefaceRequestCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SynchronizedObject lock = Synchronization_jvmKt.createSynchronizedObject();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LruCache<TypefaceRequest, TypefaceResult> f18030b = new LruCache<>(16);

    /* JADX INFO: compiled from: FontFamilyResolver.kt */
    @SourceDebugExtension({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache$runCached$currentTypefaceResult$1\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,248:1\n24#2:249\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache$runCached$currentTypefaceResult$1\n*L\n191#1:249\n*E\n"})
    public static final class a extends Lambda implements Function1<TypefaceResult, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TypefaceRequest f18032q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TypefaceRequest typefaceRequest) {
            super(1);
            this.f18032q0 = typefaceRequest;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TypefaceResult typefaceResult) {
            TypefaceResult finalResult = typefaceResult;
            Intrinsics.checkNotNullParameter(finalResult, "finalResult");
            SynchronizedObject lock = TypefaceRequestCache.this.getLock();
            TypefaceRequestCache typefaceRequestCache = TypefaceRequestCache.this;
            TypefaceRequest typefaceRequest = this.f18032q0;
            synchronized (lock) {
                try {
                    if (finalResult.getCacheable()) {
                        typefaceRequestCache.f18030b.put(typefaceRequest, finalResult);
                    } else {
                        typefaceRequestCache.f18030b.remove(typefaceRequest);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Nullable
    public final TypefaceResult get$ui_text_release(@NotNull TypefaceRequest typefaceRequest) {
        TypefaceResult typefaceResult;
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        synchronized (this.lock) {
            typefaceResult = this.f18030b.get(typefaceRequest);
        }
        return typefaceResult;
    }

    @NotNull
    /* JADX INFO: renamed from: getLock$ui_text_release, reason: from getter */
    public final SynchronizedObject getLock() {
        return this.lock;
    }

    public final int getSize$ui_text_release() {
        int size;
        synchronized (this.lock) {
            size = this.f18030b.size();
        }
        return size;
    }

    public final void preWarmCache(@NotNull List<TypefaceRequest> typefaceRequests, @NotNull Function1<? super TypefaceRequest, ? extends TypefaceResult> resolveTypeface) {
        TypefaceResult typefaceResult;
        Intrinsics.checkNotNullParameter(typefaceRequests, "typefaceRequests");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        int size = typefaceRequests.size();
        for (int i10 = 0; i10 < size; i10++) {
            TypefaceRequest typefaceRequest = typefaceRequests.get(i10);
            synchronized (this.lock) {
                typefaceResult = this.f18030b.get(typefaceRequest);
            }
            if (typefaceResult == null) {
                try {
                    TypefaceResult typefaceResultInvoke = resolveTypeface.invoke(typefaceRequest);
                    if (typefaceResultInvoke instanceof TypefaceResult.Async) {
                        continue;
                    } else {
                        synchronized (this.lock) {
                            this.f18030b.put(typefaceRequest, typefaceResultInvoke);
                        }
                    }
                } catch (Exception e5) {
                    throw new IllegalStateException("Could not load font", e5);
                }
            }
        }
    }

    @NotNull
    public final State<Object> runCached(@NotNull TypefaceRequest typefaceRequest, @NotNull Function1<? super Function1<? super TypefaceResult, Unit>, ? extends TypefaceResult> resolveTypeface) {
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        synchronized (this.lock) {
            TypefaceResult typefaceResult = this.f18030b.get(typefaceRequest);
            if (typefaceResult != null) {
                if (typefaceResult.getCacheable()) {
                    return typefaceResult;
                }
                this.f18030b.remove(typefaceRequest);
            }
            try {
                TypefaceResult typefaceResultInvoke = resolveTypeface.invoke(new a(typefaceRequest));
                synchronized (this.lock) {
                    try {
                        if (this.f18030b.get(typefaceRequest) == null && typefaceResultInvoke.getCacheable()) {
                            this.f18030b.put(typefaceRequest, typefaceResultInvoke);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return typefaceResultInvoke;
            } catch (Exception e5) {
                throw new IllegalStateException("Could not load font", e5);
            }
        }
    }
}
