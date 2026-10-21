package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\n\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\rH'¢\u0006\u0004\b\n\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\rH&¢\u0006\u0004\b\u0012\u0010\u0014J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u0015R\u0014\u0010\n\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/mypinpad/tsdk/i/zu;", "", "", "setCompoundDrawableTintBlendMode", "()V", "Lcom/mypinpad/tsdk/i/yk;", "p0", "", "p1", "Lcom/mypinpad/tsdk/i/aco;", "setX", "(Lcom/mypinpad/tsdk/i/yk;J)Lcom/mypinpad/tsdk/i/aco;", "setY", "Lcom/mypinpad/tsdk/i/yr;", "Lcom/mypinpad/tsdk/i/acp;", "(Lcom/mypinpad/tsdk/i/yr;)Lcom/mypinpad/tsdk/i/acp;", "", "Lcom/mypinpad/tsdk/i/yr$setDividerPadding;", "setOnFocusChangeListener", "(Z)Lcom/mypinpad/tsdk/i/yr$setDividerPadding;", "(Lcom/mypinpad/tsdk/i/yr;)J", "(Lcom/mypinpad/tsdk/i/yk;)V", "Lcom/mypinpad/tsdk/i/zi;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/zi;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface zu {

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f62456a;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.zu$setDividerPadding, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f62456a = new Companion();

        static {
            int i10 = (1 & (-82)) | ((~1) & 81);
            int i11 = (1 & 81) << 1;
            int i12 = (i10 & i11) + (i11 | i10);
            int i13 = i12 % 128;
            int i14 = i12 % 2;
        }
    }

    void setCompoundDrawableTintBlendMode();

    @JvmName(name = "setDividerPadding")
    @NotNull
    zi setDividerPadding();

    long setOnFocusChangeListener(@NotNull yr p4) throws IOException;

    @Nullable
    yr.setDividerPadding setOnFocusChangeListener(boolean p4) throws IOException;

    @NotNull
    aco setX(@NotNull yk p4, long p10) throws IOException;

    @NotNull
    acp setX(@NotNull yr p4) throws IOException;

    void setX() throws IOException;

    void setX(@NotNull yk p4) throws IOException;

    void setY() throws IOException;
}
