package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.androidtoolkit.utils.PluginUtils;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000  2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0002:\u0001 B/\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ@\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0019\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0002\b\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "direction", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "block", "layout-o7g1Pn8", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", PluginUtils.IDENTIFIER_LAYOUT, "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "getValue", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "value", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "", "reverseLayout", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/gestures/Orientation;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyLayoutBeyondBoundsModifierLocal implements ModifierLocalProvider<BeyondBoundsLayout>, BeyondBoundsLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1 f4963f = new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1
        @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
        public boolean getHasMoreContent() {
            return false;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyLayoutBeyondBoundsState f4964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LazyLayoutBeyondBoundsInfo f4965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LayoutDirection f4967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Orientation f4968e;

    /* JADX INFO: compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LazyLayoutBeyondBoundsModifierLocal(@NotNull LazyLayoutBeyondBoundsState state, @NotNull LazyLayoutBeyondBoundsInfo beyondBoundsInfo, boolean z10, @NotNull LayoutDirection layoutDirection, @NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(beyondBoundsInfo, "beyondBoundsInfo");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f4964a = state;
        this.f4965b = beyondBoundsInfo;
        this.f4966c = z10;
        this.f4967d = layoutDirection;
        this.f4968e = orientation;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return u0.f.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return u0.f.b(this, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r3 == androidx.compose.foundation.gestures.Orientation.Vertical) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r3 == androidx.compose.foundation.gestures.Orientation.Horizontal) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval r5, int r6) {
        /*
            r4 = this;
            androidx.compose.ui.layout.BeyondBoundsLayout$LayoutDirection$Companion r0 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE
            int r1 = r0.m3563getAbovehoxUOeE()
            boolean r1 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m3559equalsimpl0(r6, r1)
            r2 = 0
            androidx.compose.foundation.gestures.Orientation r3 = r4.f4968e
            if (r1 == 0) goto L10
            goto L1a
        L10:
            int r1 = r0.m3566getBelowhoxUOeE()
            boolean r1 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m3559equalsimpl0(r6, r1)
            if (r1 == 0) goto L1f
        L1a:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
            if (r3 != r0) goto L4e
            goto L38
        L1f:
            int r1 = r0.m3567getLefthoxUOeE()
            boolean r1 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m3559equalsimpl0(r6, r1)
            if (r1 == 0) goto L2a
            goto L34
        L2a:
            int r1 = r0.m3568getRighthoxUOeE()
            boolean r1 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m3559equalsimpl0(r6, r1)
            if (r1 == 0) goto L39
        L34:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r3 != r0) goto L4e
        L38:
            return r2
        L39:
            int r1 = r0.m3565getBeforehoxUOeE()
            boolean r1 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m3559equalsimpl0(r6, r1)
            if (r1 == 0) goto L44
            goto L4e
        L44:
            int r0 = r0.m3564getAfterhoxUOeE()
            boolean r0 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m3559equalsimpl0(r6, r0)
            if (r0 == 0) goto L6c
        L4e:
            boolean r6 = r4.d(r6)
            r0 = 1
            if (r6 == 0) goto L64
            int r5 = r5.getEnd()
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState r6 = r4.f4964a
            int r6 = r6.getItemCount()
            int r6 = r6 - r0
            if (r5 >= r6) goto L6b
        L62:
            r2 = r0
            goto L6b
        L64:
            int r5 = r5.getStart()
            if (r5 <= 0) goto L6b
            goto L62
        L6b:
            return r2
        L6c:
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.access$unsupportedDirection()
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.c(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo$Interval, int):boolean");
    }

    public final boolean d(int i10) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.INSTANCE;
        if (BeyondBoundsLayout.LayoutDirection.m3559equalsimpl0(i10, companion.m3565getBeforehoxUOeE())) {
            return false;
        }
        if (!BeyondBoundsLayout.LayoutDirection.m3559equalsimpl0(i10, companion.m3564getAfterhoxUOeE())) {
            boolean zM3559equalsimpl0 = BeyondBoundsLayout.LayoutDirection.m3559equalsimpl0(i10, companion.m3563getAbovehoxUOeE());
            boolean z10 = this.f4966c;
            if (!zM3559equalsimpl0) {
                if (!BeyondBoundsLayout.LayoutDirection.m3559equalsimpl0(i10, companion.m3566getBelowhoxUOeE())) {
                    boolean zM3559equalsimpl1 = BeyondBoundsLayout.LayoutDirection.m3559equalsimpl0(i10, companion.m3567getLefthoxUOeE());
                    LayoutDirection layoutDirection = this.f4967d;
                    if (zM3559equalsimpl1) {
                        int i11 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (z10) {
                                return false;
                            }
                        }
                    } else {
                        if (!BeyondBoundsLayout.LayoutDirection.m3559equalsimpl0(i10, companion.m3568getRighthoxUOeE())) {
                            LazyLayoutBeyondBoundsModifierLocalKt.access$unsupportedDirection();
                            throw new KotlinNothingValueException();
                        }
                        int i12 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
                        if (i12 != 1) {
                            if (i12 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z10) {
                            return false;
                        }
                    }
                } else if (z10) {
                    return false;
                }
            }
            return z10;
        }
        return true;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return u0.f.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return u0.f.d(this, obj, function2);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public ProvidableModifierLocal<BeyondBoundsLayout> getKey() {
        return BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public BeyondBoundsLayout getValue() {
        return this;
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    @Nullable
    /* JADX INFO: renamed from: layout-o7g1Pn8, reason: not valid java name */
    public <T> T mo401layouto7g1Pn8(final int direction, @NotNull Function1<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState = this.f4964a;
        if (lazyLayoutBeyondBoundsState.getItemCount() <= 0 || !lazyLayoutBeyondBoundsState.getHasVisibleItems()) {
            return block.invoke(f4963f);
        }
        int lastPlacedIndex = d(direction) ? lazyLayoutBeyondBoundsState.getLastPlacedIndex() : lazyLayoutBeyondBoundsState.getFirstPlacedIndex();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo = this.f4965b;
        objectRef.element = (T) lazyLayoutBeyondBoundsInfo.addInterval(lastPlacedIndex, lastPlacedIndex);
        T tInvoke = null;
        while (tInvoke == null && c((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element, direction)) {
            LazyLayoutBeyondBoundsInfo.Interval interval = (LazyLayoutBeyondBoundsInfo.Interval) objectRef.element;
            int start = interval.getStart();
            int end = interval.getEnd();
            if (d(direction)) {
                end++;
            } else {
                start--;
            }
            T t10 = (T) lazyLayoutBeyondBoundsInfo.addInterval(start, end);
            lazyLayoutBeyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element);
            objectRef.element = t10;
            lazyLayoutBeyondBoundsState.remeasure();
            tInvoke = block.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$layout$2
                @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                public boolean getHasMoreContent() {
                    return this.f4969a.c(objectRef.element, direction);
                }
            });
        }
        lazyLayoutBeyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element);
        lazyLayoutBeyondBoundsState.remeasure();
        return tInvoke;
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return u0.e.a(this, modifier);
    }
}
