package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/PrioritySet;", "", "", "value", "", "add", "", "isEmpty", "isNotEmpty", "peek", "takeMax", "validateHeap", "", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "<init>", "(Ljava/util/List;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,4151:1\n4553#2,7:4152\n61#3,7:4159\n61#3,7:4166\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n*L\n4092#1:4152,7\n4140#1:4159,7\n4141#1:4166,7\n*E\n"})
public final class PrioritySet {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<Integer> f14630a;

    /* JADX WARN: Multi-variable type inference failed */
    public PrioritySet() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void add(int value) {
        List<Integer> list = this.f14630a;
        if ((!list.isEmpty()) && (list.get(0).intValue() == value || ((Number) androidx.emoji2.text.flatbuffer.a.b(list, 1)).intValue() == value)) {
            return;
        }
        int size = list.size();
        list.add(Integer.valueOf(value));
        while (size > 0) {
            int i10 = ((size + 1) >>> 1) - 1;
            int iIntValue = list.get(i10).intValue();
            if (value <= iIntValue) {
                break;
            }
            list.set(size, Integer.valueOf(iIntValue));
            size = i10;
        }
        list.set(size, Integer.valueOf(value));
    }

    public final boolean isEmpty() {
        return this.f14630a.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.f14630a.isEmpty();
    }

    public final int peek() {
        return ((Number) CollectionsKt___CollectionsKt.first((List) this.f14630a)).intValue();
    }

    public final int takeMax() {
        int iIntValue;
        List<Integer> list = this.f14630a;
        if (!(list.size() > 0)) {
            ComposerKt.composeImmediateRuntimeError("Set is empty");
        }
        int iIntValue2 = list.get(0).intValue();
        while ((!list.isEmpty()) && list.get(0).intValue() == iIntValue2) {
            list.set(0, (Integer) CollectionsKt___CollectionsKt.last((List) list));
            list.remove(list.size() - 1);
            int size = list.size();
            int size2 = list.size() >>> 1;
            int i10 = 0;
            while (i10 < size2) {
                int iIntValue3 = list.get(i10).intValue();
                int i11 = (i10 + 1) * 2;
                int i12 = i11 - 1;
                int iIntValue4 = list.get(i12).intValue();
                if (i11 < size && (iIntValue = list.get(i11).intValue()) > iIntValue4) {
                    if (iIntValue <= iIntValue3) {
                        break;
                    }
                    list.set(i10, Integer.valueOf(iIntValue));
                    list.set(i11, Integer.valueOf(iIntValue3));
                    i10 = i11;
                } else {
                    if (iIntValue4 <= iIntValue3) {
                        break;
                    }
                    list.set(i10, Integer.valueOf(iIntValue4));
                    list.set(i12, Integer.valueOf(iIntValue3));
                    i10 = i12;
                }
            }
        }
        return iIntValue2;
    }

    public final void validateHeap() {
        List<Integer> list = this.f14630a;
        int size = list.size();
        int i10 = size / 2;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i11 + 1;
            int i13 = i12 * 2;
            boolean z10 = true;
            if (!(list.get(i11).intValue() >= list.get(i13 + (-1)).intValue())) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            if (i13 < size && list.get(i11).intValue() < list.get(i13).intValue()) {
                z10 = false;
            }
            if (!z10) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            i11 = i12;
        }
    }

    public PrioritySet(@NotNull List<Integer> list) {
        this.f14630a = list;
    }

    public /* synthetic */ PrioritySet(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }
}
