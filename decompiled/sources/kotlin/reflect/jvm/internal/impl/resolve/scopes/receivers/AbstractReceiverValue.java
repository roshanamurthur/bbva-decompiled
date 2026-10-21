package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractReceiverValue implements ReceiverValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReceiverValue f81618a;
    protected final KotlinType receiverType;

    public AbstractReceiverValue(@NotNull KotlinType kotlinType, @Nullable ReceiverValue receiverValue) {
        if (kotlinType == null) {
            a(0);
            throw null;
        }
        this.receiverType = kotlinType;
        this.f81618a = receiverValue == null ? this : receiverValue;
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    @NotNull
    public KotlinType getType() {
        KotlinType kotlinType = this.receiverType;
        if (kotlinType != null) {
            return kotlinType;
        }
        a(1);
        throw null;
    }
}
