package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidAccessibilityManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "Landroidx/compose/ui/platform/AccessibilityManager;", "", "originalTimeoutMillis", "", "containsIcons", "containsText", "containsControls", "calculateRecommendedTimeoutMillis", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidAccessibilityManager implements AccessibilityManager {

    @Deprecated
    public static final int FlagContentControls = 4;

    @Deprecated
    public static final int FlagContentIcons = 1;

    @Deprecated
    public static final int FlagContentText = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final android.view.accessibility.AccessibilityManager f16984a;

    public AndroidAccessibilityManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(Constants.ACCESSIBILITY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f16984a = (android.view.accessibility.AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.ui.platform.AccessibilityManager
    public long calculateRecommendedTimeoutMillis(long originalTimeoutMillis, boolean containsIcons, boolean containsText, boolean containsControls) {
        int i10;
        int i11 = containsIcons;
        if (originalTimeoutMillis >= 2147483647L) {
            return originalTimeoutMillis;
        }
        if (containsText) {
            i10 = (containsIcons ? 1 : 0) | 2;
        }
        if (containsControls) {
            i11 = i10;
            i11 = (i11 == true ? 1 : 0) | 4;
        }
        i11 = i10;
        int i12 = Build.VERSION.SDK_INT;
        android.view.accessibility.AccessibilityManager accessibilityManager = this.f16984a;
        if (i12 >= 29) {
            int recommendedTimeoutMillis = Api29Impl.INSTANCE.getRecommendedTimeoutMillis(accessibilityManager, (int) originalTimeoutMillis, i11);
            if (recommendedTimeoutMillis != Integer.MAX_VALUE) {
                return recommendedTimeoutMillis;
            }
        } else if (!containsControls || !accessibilityManager.isTouchExplorationEnabled()) {
            return originalTimeoutMillis;
        }
        return Long.MAX_VALUE;
    }
}
