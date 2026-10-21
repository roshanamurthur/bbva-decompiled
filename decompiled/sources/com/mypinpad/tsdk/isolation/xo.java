package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/xo;", "", "Lcom/mypinpad/tsdk/i/yp;", "p0", "Lcom/mypinpad/tsdk/i/yr;", "p1", "Lcom/mypinpad/tsdk/i/yk;", "setY", "(Lcom/mypinpad/tsdk/i/yp;Lcom/mypinpad/tsdk/i/yr;)Lcom/mypinpad/tsdk/i/yk;", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface xo {

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f61879a;

    @JvmField
    @NotNull
    public static final xo setY = new Companion.a();

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.xo$setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f61879a = new Companion();

        /* JADX INFO: renamed from: com.mypinpad.tsdk.i.xo$setCompoundDrawableTintBlendMode$a */
        public static final class a implements xo {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static int f61880a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static int f61881b = 1;

            @Override // com.mypinpad.tsdk.isolation.xo
            @Nullable
            public final yk setY(@Nullable yp ypVar, @NotNull yr yrVar) {
                Object[] objArr = {this, ypVar, yrVar};
                System.identityHashCode(this);
                yr yrVar2 = (yr) objArr[2];
                int i10 = f61881b;
                int i11 = (i10 & 125) + (i10 | 125);
                f61880a = i11 % 128;
                int i12 = i11 % 2;
                Intrinsics.checkNotNullParameter(yrVar2, "");
                int i13 = f61880a;
                int i14 = ((i13 ^ 120) + ((i13 & 120) << 1)) - 1;
                f61881b = i14 % 128;
                if (i14 % 2 != 0) {
                    return null;
                }
                int i15 = 75 / 0;
                return null;
            }
        }

        static {
            int i10 = 37 % 128;
            int i11 = 37 % 2;
        }
    }

    static {
        new ys(null, 1, null);
    }

    @Nullable
    yk setY(@Nullable yp p4, @NotNull yr p10) throws IOException;
}
