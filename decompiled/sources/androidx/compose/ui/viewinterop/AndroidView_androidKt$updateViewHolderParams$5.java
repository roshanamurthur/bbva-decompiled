package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidView_androidKt$updateViewHolderParams$5 extends Lambda implements Function2<LayoutNode, LayoutDirection, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final AndroidView_androidKt$updateViewHolderParams$5 f18392p0 = new AndroidView_androidKt$updateViewHolderParams$5(2);

    /* JADX INFO: compiled from: AndroidView.android.kt */
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

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(LayoutNode layoutNode, LayoutDirection layoutDirection) {
        LayoutNode set = layoutNode;
        LayoutDirection it = layoutDirection;
        Intrinsics.checkNotNullParameter(set, "$this$set");
        Intrinsics.checkNotNullParameter(it, "it");
        ViewFactoryHolder viewFactoryHolderAccess$requireViewFactoryHolder = AndroidView_androidKt.access$requireViewFactoryHolder(set);
        int i10 = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        viewFactoryHolderAccess$requireViewFactoryHolder.setLayoutDirection(i11);
        return Unit.INSTANCE;
    }
}
