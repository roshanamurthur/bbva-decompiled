package u;

import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i implements PressGestureScope, Density {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Density f93656p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f93657q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f93658r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Mutex f93659s0;

    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {}, l = {363}, m = "awaitRelease", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f93660p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f93662r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f93660p0 = obj;
            this.f93662r0 |= Integer.MIN_VALUE;
            return i.this.awaitRelease(this);
        }
    }

    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {0}, l = {357}, m = "reset", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public i f93663p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f93664q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f93666s0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f93664q0 = obj;
            this.f93666s0 |= Integer.MIN_VALUE;
            return i.this.a(this);
        }
    }

    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {0}, l = {370}, m = "tryAwaitRelease", n = {"this"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public i f93667p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f93668q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f93670s0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f93668q0 = obj;
            this.f93670s0 |= Integer.MIN_VALUE;
            return i.this.tryAwaitRelease(this);
        }
    }

    public i(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f93656p0 = density;
        this.f93659s0 = MutexKt.Mutex(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull Continuation<? super Unit> continuation) {
        b bVar;
        i iVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f93666s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f93666s0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f93664q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f93666s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            bVar.f93663p0 = this;
            bVar.f93666s0 = 1;
            if (Mutex.DefaultImpls.lock$default(this.f93659s0, null, bVar, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            iVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = bVar.f93663p0;
            ResultKt.throwOnFailure(obj);
        }
        iVar.f93657q0 = false;
        iVar.f93658r0 = false;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    @Nullable
    public final Object awaitRelease(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f93662r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f93662r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objTryAwaitRelease = aVar.f93660p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f93662r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objTryAwaitRelease);
            aVar.f93662r0 = 1;
            objTryAwaitRelease = tryAwaitRelease(aVar);
            if (objTryAwaitRelease == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTryAwaitRelease);
        }
        if (((Boolean) objTryAwaitRelease).booleanValue()) {
            return Unit.INSTANCE;
        }
        throw new GestureCancellationException("The press gesture was canceled.");
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.f93656p0.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getFontScale() {
        return this.f93656p0.getFontScale();
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public final int mo412roundToPxR2X_6o(long j10) {
        return this.f93656p0.mo412roundToPxR2X_6o(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public final int mo413roundToPx0680j_4(float f6) {
        return this.f93656p0.mo413roundToPx0680j_4(f6);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public final float mo404toDpGaN1DYA(long j10) {
        return this.f93656p0.mo404toDpGaN1DYA(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo405toDpu2uoSUM(float f6) {
        return this.f93656p0.mo405toDpu2uoSUM(f6);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public final long mo407toDpSizekrfVVM(long j10) {
        return this.f93656p0.mo407toDpSizekrfVVM(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public final float mo414toPxR2X_6o(long j10) {
        return this.f93656p0.mo414toPxR2X_6o(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public final float mo415toPx0680j_4(float f6) {
        return this.f93656p0.mo415toPx0680j_4(f6);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public final Rect toRect(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.f93656p0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public final long mo408toSizeXkaWNTQ(long j10) {
        return this.f93656p0.mo408toSizeXkaWNTQ(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public final long mo409toSp0xMU5do(float f6) {
        return this.f93656p0.mo409toSp0xMU5do(f6);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo410toSpkPz2Gy4(float f6) {
        return this.f93656p0.mo410toSpkPz2Gy4(f6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    @Nullable
    public final Object tryAwaitRelease(@NotNull Continuation<? super Boolean> continuation) {
        c cVar;
        i iVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f93670s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f93670s0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f93668q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f93670s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f93657q0 || this.f93658r0) {
                iVar = this;
            } else {
                cVar.f93667p0 = this;
                cVar.f93670s0 = 1;
                if (Mutex.DefaultImpls.lock$default(this.f93659s0, null, cVar, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                iVar = this;
            }
            return Boxing.boxBoolean(iVar.f93657q0);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iVar = cVar.f93667p0;
        ResultKt.throwOnFailure(obj);
        Mutex.DefaultImpls.unlock$default(iVar.f93659s0, null, 1, null);
        return Boxing.boxBoolean(iVar.f93657q0);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo406toDpu2uoSUM(int i10) {
        return this.f93656p0.mo406toDpu2uoSUM(i10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo411toSpkPz2Gy4(int i10) {
        return this.f93656p0.mo411toSpkPz2Gy4(i10);
    }
}
