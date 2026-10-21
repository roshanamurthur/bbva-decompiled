package com.mypinpad.tsdk.isolation;

import ak.b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class Iso4217Currency {
    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Throwable th2 = (Throwable) objArr[0];
        Intrinsics.checkNotNullParameter(th2, "");
        setY sety = new setY();
        sety.f51780a = th2;
        return sety;
    }

    @NotNull
    public static final getDetailsFieldTextSizeSp setDividerPadding(@NotNull Throwable th2) {
        return (getDetailsFieldTextSizeSp) setCompoundDrawableTintBlendMode(new Object[]{th2}, 940749687, -940749687, (int) System.currentTimeMillis());
    }

    public static final class setY implements getDetailsFieldTextSizeSp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Throwable f51780a;

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            Throwable th2 = ((setY) objArr[0]).f51780a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) th2.getMessage());
            sb2.append(AbstractJsonLexerKt.COMMA);
            sb2.append(b.stackTraceToString(th2));
            return sb2.toString();
        }

        @Override // com.mypinpad.tsdk.isolation.getDetailsFieldTextSizeSp
        @NotNull
        public final String setCompoundDrawableTintBlendMode() {
            return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 2050886157, -2050886157, System.identityHashCode(this));
        }
    }
}
