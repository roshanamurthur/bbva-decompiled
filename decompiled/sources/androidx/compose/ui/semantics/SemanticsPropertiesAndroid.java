package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SemanticsProperties.android.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\tR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertiesAndroid;", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "a", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getTestTagsAsResourceId", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getTestTagsAsResourceId$annotations", "()V", "TestTagsAsResourceId", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class SemanticsPropertiesAndroid {
    public static final int $stable = 0;

    @NotNull
    public static final SemanticsPropertiesAndroid INSTANCE = new SemanticsPropertiesAndroid();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SemanticsPropertyKey<Boolean> TestTagsAsResourceId = new SemanticsPropertyKey<>("TestTagsAsResourceId", a.f17566p0);

    /* JADX INFO: compiled from: SemanticsProperties.android.kt */
    public static final class a extends Lambda implements Function2<Boolean, Boolean, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f17566p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Boolean bool, Boolean bool2) {
            Boolean bool3 = bool;
            bool2.booleanValue();
            return bool3;
        }
    }

    @ExperimentalComposeUiApi
    @NotNull
    public final SemanticsPropertyKey<Boolean> getTestTagsAsResourceId() {
        return TestTagsAsResourceId;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getTestTagsAsResourceId$annotations() {
    }
}
