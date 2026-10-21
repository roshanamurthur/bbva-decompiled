package androidx.compose.runtime.saveable;

import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ListSaver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a}\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000422\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000b0\u0006¢\u0006\u0002\b\f2)\u0010\r\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00040\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000f\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000e¨\u0006\u0010"}, d2 = {"listSaver", "Landroidx/compose/runtime/saveable/Saver;", "Original", "", "Saveable", "save", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", "name", "value", "", "Lkotlin/ExtensionFunctionType;", "restore", "Lkotlin/Function1;", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ListSaverKt {

    /* JADX INFO: Add missing generic type declarations: [Original] */
    /* JADX INFO: compiled from: ListSaver.kt */
    @SourceDebugExtension({"SMAP\nListSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListSaver.kt\nandroidx/compose/runtime/saveable/ListSaverKt$listSaver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
    public static final class a<Original> extends Lambda implements Function2<SaverScope, Original, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<SaverScope, Original, List<Saveable>> f15195p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super SaverScope, ? super Original, ? extends List<? extends Saveable>> function2) {
            super(2);
            this.f15195p0 = function2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, Object obj) {
            SaverScope saverScope2 = saverScope;
            List list = (List) this.f15195p0.invoke(saverScope2, (Original) obj);
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                if (obj2 != null && !saverScope2.canBeSaved(obj2)) {
                    throw new IllegalArgumentException("item can't be saved".toString());
                }
            }
            List list2 = list;
            if (!list2.isEmpty()) {
                return new ArrayList(list2);
            }
            return null;
        }
    }

    @NotNull
    public static final <Original, Saveable> Saver<Original, Object> listSaver(@NotNull Function2<? super SaverScope, ? super Original, ? extends List<? extends Saveable>> function2, @NotNull Function1<? super List<? extends Saveable>, ? extends Original> function1) {
        a aVar = new a(function2);
        Intrinsics.checkNotNull(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return SaverKt.Saver(aVar, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1));
    }
}
