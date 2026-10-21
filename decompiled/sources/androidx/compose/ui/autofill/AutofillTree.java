package androidx.compose.ui.autofill;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AutofillTree.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u001f\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/autofill/AutofillTree;", "", "Landroidx/compose/ui/autofill/AutofillNode;", "autofillNode", "", "plusAssign", "", "id", "", "value", "performAutofill", "(ILjava/lang/String;)Lkotlin/Unit;", "", "a", "Ljava/util/Map;", "getChildren", "()Ljava/util/Map;", "children", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class AutofillTree {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f15432a = new LinkedHashMap();

    @NotNull
    public final Map<Integer, AutofillNode> getChildren() {
        return this.f15432a;
    }

    @Nullable
    public final Unit performAutofill(int id, @NotNull String value) {
        Function1<String, Unit> onFill;
        Intrinsics.checkNotNullParameter(value, "value");
        AutofillNode autofillNode = (AutofillNode) this.f15432a.get(Integer.valueOf(id));
        if (autofillNode == null || (onFill = autofillNode.getOnFill()) == null) {
            return null;
        }
        onFill.invoke(value);
        return Unit.INSTANCE;
    }

    public final void plusAssign(@NotNull AutofillNode autofillNode) {
        Intrinsics.checkNotNullParameter(autofillNode, "autofillNode");
        this.f15432a.put(Integer.valueOf(autofillNode.getId()), autofillNode);
    }
}
