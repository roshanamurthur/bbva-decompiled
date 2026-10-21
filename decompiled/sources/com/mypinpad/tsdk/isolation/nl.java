package com.mypinpad.tsdk.isolation;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nHostCsprng.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HostCsprng.kt\ncom/mypinpad/tsdk/internal/host/HostCsprngKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,14:1\n1#2:15\n*E\n"})
public final class nl {
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        no noVar = (no) objArr[0];
        Intrinsics.checkNotNullParameter(noVar, "");
        byte[] bArr = new byte[8];
        noVar.setX(bArr);
        byte[] bArr2 = new byte[8];
        noVar.setX(bArr2);
        return new UUID(((Long) ux.setCompoundDrawableTintBlendMode(new Object[]{bArr}, -515644978, 515644982, (int) System.currentTimeMillis())).longValue(), ((Long) ux.setCompoundDrawableTintBlendMode(new Object[]{bArr2}, -515644978, 515644982, (int) System.currentTimeMillis())).longValue());
    }

    @NotNull
    public static final UUID setCompoundDrawableTintBlendMode(@NotNull no noVar) {
        return (UUID) setCompoundDrawableTintBlendMode(new Object[]{noVar}, -1221210430, 1221210430, (int) System.currentTimeMillis());
    }
}
