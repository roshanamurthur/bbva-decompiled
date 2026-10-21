package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0002\b\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/yl;", "", "Lcom/mypinpad/tsdk/i/yl$setCompoundDrawableTintBlendMode;", "p0", "Lcom/mypinpad/tsdk/i/yr;", "setX", "(Lcom/mypinpad/tsdk/i/yl$setCompoundDrawableTintBlendMode;)Lcom/mypinpad/tsdk/i/yr;", "setDividerPadding", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface yl {

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f62121a;

    public interface setCompoundDrawableTintBlendMode {
        @NotNull
        yk setCompoundDrawableTintBlendMode();

        @NotNull
        yr setDividerPadding(@NotNull yk ykVar) throws IOException;

        @NotNull
        xp setOnFocusChangeListener();

        @Nullable
        xx setY();
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.yl$setDividerPadding, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f62121a = new Companion();

        static {
            int i10 = (1 - (-43)) - 2;
            int i11 = i10 % 128;
            if (i10 % 2 != 0) {
                int i12 = 75 / 0;
            }
        }
    }

    @NotNull
    yr setX(@NotNull setCompoundDrawableTintBlendMode p4) throws IOException;
}
