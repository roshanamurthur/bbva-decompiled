package kotlinx.coroutines;

import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\r\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/NodeList;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/Incomplete;", "()V", "isActive", "", "()Z", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "getList", "()Lkotlinx/coroutines/NodeList;", "getString", "", "state", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1454:1\n341#2,6:1455\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n*L\n1364#1:1455,6\n*E\n"})
public final class NodeList extends LockFreeLinkedListHead implements Incomplete {
    @NotNull
    public final String getString(@NotNull String state) {
        StringBuilder sbD = ci.a.d("List{", state, "}[");
        Object next = getNext();
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        boolean z10 = true;
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !Intrinsics.areEqual(nextNode, this); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof JobNode) {
                JobNode jobNode = (JobNode) nextNode;
                if (z10) {
                    z10 = false;
                } else {
                    sbD.append(", ");
                }
                sbD.append(jobNode);
            }
        }
        sbD.append(Constant.BRACKET_CLOSE);
        String string = sbD.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // kotlinx.coroutines.Incomplete
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        return super.toString();
    }

    @Override // kotlinx.coroutines.Incomplete
    @NotNull
    public NodeList getList() {
        return this;
    }
}
