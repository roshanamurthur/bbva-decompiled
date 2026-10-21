package androidx.compose.ui.autofill;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Autofill.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B9\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0004\b#\u0010$J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R%\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\"\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Landroidx/compose/ui/autofill/AutofillNode;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "Landroidx/compose/ui/autofill/AutofillType;", "a", "Ljava/util/List;", "getAutofillTypes", "()Ljava/util/List;", "autofillTypes", "Landroidx/compose/ui/geometry/Rect;", "b", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "()Landroidx/compose/ui/geometry/Rect;", "setBoundingBox", "(Landroidx/compose/ui/geometry/Rect;)V", "boundingBox", "Lkotlin/Function1;", "", "", "c", "Lkotlin/jvm/functions/Function1;", "getOnFill", "()Lkotlin/jvm/functions/Function1;", "onFill", "d", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "()I", "id", "<init>", "(Ljava/util/List;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class AutofillNode {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f15427e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<AutofillType> autofillTypes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Rect boundingBox;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function1<String, Unit> onFill;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int id;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: Autofill.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/autofill/AutofillNode$Companion;", "", "", "previousId", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAutofill.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,104:1\n34#2:105\n*S KotlinDebug\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n*L\n82#1:105\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final int access$generateId(Companion companion) {
            int i10;
            synchronized (companion) {
                AutofillNode.f15427e++;
                i10 = AutofillNode.f15427e;
            }
            return i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutofillNode(@NotNull List<? extends AutofillType> autofillTypes, @Nullable Rect rect, @Nullable Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(autofillTypes, "autofillTypes");
        this.autofillTypes = autofillTypes;
        this.boundingBox = rect;
        this.onFill = function1;
        this.id = Companion.access$generateId(INSTANCE);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutofillNode)) {
            return false;
        }
        AutofillNode autofillNode = (AutofillNode) other;
        return Intrinsics.areEqual(this.autofillTypes, autofillNode.autofillTypes) && Intrinsics.areEqual(this.boundingBox, autofillNode.boundingBox) && Intrinsics.areEqual(this.onFill, autofillNode.onFill);
    }

    @NotNull
    public final List<AutofillType> getAutofillTypes() {
        return this.autofillTypes;
    }

    @Nullable
    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Function1<String, Unit> getOnFill() {
        return this.onFill;
    }

    public int hashCode() {
        int iHashCode = this.autofillTypes.hashCode() * 31;
        Rect rect = this.boundingBox;
        int iHashCode2 = (iHashCode + (rect != null ? rect.hashCode() : 0)) * 31;
        Function1<String, Unit> function1 = this.onFill;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public final void setBoundingBox(@Nullable Rect rect) {
        this.boundingBox = rect;
    }

    public /* synthetic */ AutofillNode(List list, Rect rect, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 2) != 0 ? null : rect, function1);
    }
}
