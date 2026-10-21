package androidx.compose.runtime;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class GroupKind {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Companion f14562a = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f14563b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14564c = 2;

    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/GroupKind$Companion;", "", "()V", "Group", "Landroidx/compose/runtime/GroupKind;", "getGroup-ULZAiWs", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Node", "getNode-ULZAiWs", "ReusableNode", "getReusableNode-ULZAiWs", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getGroup-ULZAiWs, reason: not valid java name */
        public final int m2062getGroupULZAiWs() {
            Companion companion = GroupKind.f14562a;
            return 0;
        }

        /* JADX INFO: renamed from: getNode-ULZAiWs, reason: not valid java name */
        public final int m2063getNodeULZAiWs() {
            return GroupKind.f14563b;
        }

        /* JADX INFO: renamed from: getReusableNode-ULZAiWs, reason: not valid java name */
        public final int m2064getReusableNodeULZAiWs() {
            return GroupKind.f14564c;
        }
    }
}
