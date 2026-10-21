package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013ø\u0001\u0001¢\u0006\u0004\b/\u00100J5\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\rHÆ\u0003ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\u001b\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003JF\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003R \u0010\u0016\u001a\u00020\r8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u000fR\u0017\u0010\u0017\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R)\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/material/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "Landroidx/compose/ui/unit/DpOffset;", "component1-RKDOV3M", "()J", "component1", "Landroidx/compose/ui/unit/Density;", "component2", "Lkotlin/Function2;", "", "component3", "contentOffset", "density", "onPositionCalculated", "copy-rOJDEFc", "(JLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function2;)Landroidx/compose/material/DropdownMenuPositionProvider;", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "J", "getContentOffset-RKDOV3M", "b", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "c", "Lkotlin/jvm/functions/Function2;", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "<init>", "(JLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "material_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/DropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,298:1\n1#2:299\n179#3,2:300\n179#3,2:302\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/DropdownMenuPositionProvider\n*L\n277#1:300,2\n286#1:302,2\n*E\n"})
public final /* data */ class DropdownMenuPositionProvider implements PopupPositionProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long contentOffset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Density density;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<IntRect, IntRect, Unit> onPositionCalculated;

    /* JADX INFO: compiled from: Menu.kt */
    public static final class a extends Lambda implements Function2<IntRect, IntRect, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7133p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(IntRect intRect, IntRect intRect2) {
            Intrinsics.checkNotNullParameter(intRect, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(intRect2, "<anonymous parameter 1>");
            return Unit.INSTANCE;
        }
    }

    public DropdownMenuPositionProvider() {
        throw null;
    }

    public DropdownMenuPositionProvider(long j10, Density density, Function2 onPositionCalculated, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(onPositionCalculated, "onPositionCalculated");
        this.contentOffset = j10;
        this.density = density;
        this.onPositionCalculated = onPositionCalculated;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-rOJDEFc$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m754copyrOJDEFc$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j10, Density density, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = dropdownMenuPositionProvider.contentOffset;
        }
        if ((i10 & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        if ((i10 & 4) != 0) {
            function2 = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m756copyrOJDEFc(j10, density, function2);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public long mo601calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long windowSize, @NotNull LayoutDirection layoutDirection, long popupContentSize) {
        Sequence sequenceSequenceOf;
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        float menuVerticalMargin = MenuKt.getMenuVerticalMargin();
        Density density = this.density;
        int iMo413roundToPx0680j_4 = density.mo413roundToPx0680j_4(menuVerticalMargin);
        long j10 = this.contentOffset;
        int iMo413roundToPx0680j_5 = density.mo413roundToPx0680j_4(DpOffset.m4450getXD9Ej5fM(j10));
        int iMo413roundToPx0680j_6 = density.mo413roundToPx0680j_4(DpOffset.m4452getYD9Ej5fM(j10));
        int left = anchorBounds.getLeft() + iMo413roundToPx0680j_5;
        int right = (anchorBounds.getRight() - iMo413roundToPx0680j_5) - IntSize.m4549getWidthimpl(popupContentSize);
        int iM4549getWidthimpl = IntSize.m4549getWidthimpl(windowSize) - IntSize.m4549getWidthimpl(popupContentSize);
        if (layoutDirection == LayoutDirection.Ltr) {
            Integer[] numArr = new Integer[3];
            numArr[0] = Integer.valueOf(left);
            numArr[1] = Integer.valueOf(right);
            if (anchorBounds.getLeft() < 0) {
                iM4549getWidthimpl = 0;
            }
            numArr[2] = Integer.valueOf(iM4549getWidthimpl);
            sequenceSequenceOf = SequencesKt__SequencesKt.sequenceOf(numArr);
        } else {
            Integer[] numArr2 = new Integer[3];
            numArr2[0] = Integer.valueOf(right);
            numArr2[1] = Integer.valueOf(left);
            if (anchorBounds.getRight() <= IntSize.m4549getWidthimpl(windowSize)) {
                iM4549getWidthimpl = 0;
            }
            numArr2[2] = Integer.valueOf(iM4549getWidthimpl);
            sequenceSequenceOf = SequencesKt__SequencesKt.sequenceOf(numArr2);
        }
        Iterator it = sequenceSequenceOf.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iIntValue = ((Number) next).intValue();
            if (iIntValue >= 0 && IntSize.m4549getWidthimpl(popupContentSize) + iIntValue <= IntSize.m4549getWidthimpl(windowSize)) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            right = num.intValue();
        }
        int iMax = Math.max(anchorBounds.getBottom() + iMo413roundToPx0680j_6, iMo413roundToPx0680j_4);
        int top = (anchorBounds.getTop() - iMo413roundToPx0680j_6) - IntSize.m4548getHeightimpl(popupContentSize);
        for (Object obj2 : SequencesKt__SequencesKt.sequenceOf(Integer.valueOf(iMax), Integer.valueOf(top), Integer.valueOf(anchorBounds.getTop() - (IntSize.m4548getHeightimpl(popupContentSize) / 2)), Integer.valueOf((IntSize.m4548getHeightimpl(windowSize) - IntSize.m4548getHeightimpl(popupContentSize)) - iMo413roundToPx0680j_4))) {
            int iIntValue2 = ((Number) obj2).intValue();
            if (iIntValue2 >= iMo413roundToPx0680j_4 && IntSize.m4548getHeightimpl(popupContentSize) + iIntValue2 <= IntSize.m4548getHeightimpl(windowSize) - iMo413roundToPx0680j_4) {
                obj = obj2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            top = num2.intValue();
        }
        this.onPositionCalculated.invoke(anchorBounds, new IntRect(right, top, IntSize.m4549getWidthimpl(popupContentSize) + right, IntSize.m4548getHeightimpl(popupContentSize) + top));
        return IntOffsetKt.IntOffset(right, top);
    }

    /* JADX INFO: renamed from: component1-RKDOV3M, reason: not valid java name and from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    @NotNull
    public final Function2<IntRect, IntRect, Unit> component3() {
        return this.onPositionCalculated;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-rOJDEFc, reason: not valid java name */
    public final DropdownMenuPositionProvider m756copyrOJDEFc(long contentOffset, @NotNull Density density, @NotNull Function2<? super IntRect, ? super IntRect, Unit> onPositionCalculated) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(onPositionCalculated, "onPositionCalculated");
        return new DropdownMenuPositionProvider(contentOffset, density, onPositionCalculated, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) other;
        return DpOffset.m4449equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && Intrinsics.areEqual(this.density, dropdownMenuPositionProvider.density) && Intrinsics.areEqual(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    /* JADX INFO: renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m757getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @NotNull
    public final Function2<IntRect, IntRect, Unit> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public int hashCode() {
        return this.onPositionCalculated.hashCode() + ((this.density.hashCode() + (DpOffset.m4454hashCodeimpl(this.contentOffset) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m4457toStringimpl(this.contentOffset)) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j10, Density density, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, density, (i10 & 4) != 0 ? a.f7133p0 : function2, null);
    }
}
