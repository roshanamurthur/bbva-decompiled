package androidx.compose.ui.semantics;

import androidx.camera.core.impl.utils.c;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SemanticsProperties.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\"5\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018G@GX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b*\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"<set-?>", "", "testTagsAsResourceId", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "getTestTagsAsResourceId$annotations", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "getTestTagsAsResourceId$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "getTestTagsAsResourceId", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", "setTestTagsAsResourceId", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SemanticsProperties_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f17568a = {c.e(SemanticsProperties_androidKt.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)};

    static {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId();
    }

    @ExperimentalComposeUiApi
    public static final boolean getTestTagsAsResourceId(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().getValue(semanticsPropertyReceiver, f17568a[0]).booleanValue();
    }

    @ExperimentalComposeUiApi
    public static final void setTestTagsAsResourceId(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z10) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().setValue(semanticsPropertyReceiver, f17568a[0], Boolean.valueOf(z10));
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getTestTagsAsResourceId$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }
}
