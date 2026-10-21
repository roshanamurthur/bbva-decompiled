package defpackage;

import com.bbva.component.ui.welcome.footer.ButtonConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ViewExtensionsKt, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ViewExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"androidVisibility", "", "Lcom/bbva/component/ui/welcome/footer/ButtonConfig;", "component-ui-welcome_release"}, k = 2, mv = {1, 4, 0})
public final class androidVisibility {

    /* JADX INFO: renamed from: ViewExtensionsKt$WhenMappings */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonConfig.Visibility.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ButtonConfig.Visibility.GONE.ordinal()] = 1;
            iArr[ButtonConfig.Visibility.INVISIBLE.ordinal()] = 2;
            iArr[ButtonConfig.Visibility.VISIBLE.ordinal()] = 3;
        }
    }

    public static final int androidVisibility(@NotNull ButtonConfig androidVisibility) {
        Intrinsics.checkNotNullParameter(androidVisibility, "$this$androidVisibility");
        int i10 = WhenMappings.$EnumSwitchMapping$0[androidVisibility.getVisibility().ordinal()];
        if (i10 == 1) {
            return 8;
        }
        if (i10 == 2) {
            return 4;
        }
        if (i10 == 3) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
