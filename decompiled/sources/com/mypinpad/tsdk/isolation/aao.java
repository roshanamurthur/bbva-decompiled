package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002"}, d2 = {"Lcom/mypinpad/tsdk/i/aao;", "", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface aao {

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f52193a;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.aao$setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f52193a = new Companion();

        /* JADX INFO: renamed from: com.mypinpad.tsdk.i.aao$setCompoundDrawableTintBlendMode$a */
        public static final class a implements aao {
            @NotNull
            public final String toString() {
                System.identityHashCode(this);
                return "FileSystem.SYSTEM";
            }
        }

        static {
            int i10 = ((83 << 1) - (~(-((~0) & 83)))) - 1;
            int i11 = i10 % 128;
            int i12 = i10 % 2;
        }
    }

    static {
        new Companion.a();
    }
}
