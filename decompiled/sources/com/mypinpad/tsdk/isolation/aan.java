package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J/\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ-\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/mypinpad/tsdk/i/aan;", "", "", "p0", "Lcom/mypinpad/tsdk/i/aby;", "p1", "p2", "", "p3", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/aby;I)Z", "", "Lcom/mypinpad/tsdk/i/aab;", "setY", "(Ljava/util/List;)Z", "setX", "Lcom/mypinpad/tsdk/i/aac;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/aac;)V", "setOnFocusChangeListener"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface aan {

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f52190a;

    @JvmField
    @NotNull
    public static final aan setY = new Companion.a();

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.aan$setOnFocusChangeListener, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f52190a = new Companion();

        /* JADX INFO: renamed from: com.mypinpad.tsdk.i.aan$setOnFocusChangeListener$a */
        public static final class a implements aan {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static int f52191a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static int f52192b = 1;

            public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) throws IOException {
                int i13 = ((i10 | i11) * (-470)) + (i11 * 471) + (i10 * 471);
                int i14 = ~i10;
                int i15 = ~i11;
                int i16 = (~(i14 | i15)) | (~(i15 | i12));
                int i17 = ~(i11 | (~i12) | i10);
                int i18 = (((~(i10 | i15 | i12)) | i17) * 470) + ((i16 | i17) * (-470)) + i13;
                boolean z10 = false;
                if (i18 == 1) {
                    aac aacVar = (aac) objArr[1];
                    int i19 = f52192b;
                    int i20 = (i19 ^ 117) + ((i19 & 117) << 1);
                    f52191a = i20 % 128;
                    if (i20 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(aacVar, "");
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(aacVar, "");
                    int i21 = f52192b;
                    int i22 = ((i21 ^ 9) - (~(-(-((i21 & 9) << 1))))) - 1;
                    f52191a = i22 % 128;
                    if (i22 % 2 != 0) {
                        int i23 = 39 / 0;
                    }
                    return null;
                }
                if (i18 == 2) {
                    List list = (List) objArr[1];
                    int i24 = f52192b;
                    int i25 = (i24 & (-94)) | ((~i24) & 93);
                    int i26 = -(-((i24 & 93) << 1));
                    int i27 = (i25 & i26) + (i26 | i25);
                    f52191a = i27 % 128;
                    int i28 = i27 % 2;
                    Intrinsics.checkNotNullParameter(list, "");
                    int i29 = f52192b + 3;
                    f52191a = i29 % 128;
                    int i30 = i29 % 2;
                    return Boolean.TRUE;
                }
                if (i18 == 3) {
                    List list2 = (List) objArr[1];
                    int i31 = f52191a;
                    int i32 = (i31 & 25) + (i31 | 25);
                    f52192b = i32 % 128;
                    if (i32 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(list2, "");
                    } else {
                        Intrinsics.checkNotNullParameter(list2, "");
                        z10 = true;
                    }
                    return Boolean.valueOf(z10);
                }
                aby abyVar = (aby) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i33 = f52192b;
                int i34 = i33 & 49;
                int i35 = (i33 ^ 49) | i34;
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                f52191a = i36 % 128;
                if (i36 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(abyVar, "");
                    abyVar.setNavigationOnClickListener(iIntValue);
                } else {
                    Intrinsics.checkNotNullParameter(abyVar, "");
                    abyVar.setNavigationOnClickListener(iIntValue);
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }

            @Override // com.mypinpad.tsdk.isolation.aan
            public final void setCompoundDrawableTintBlendMode(@NotNull aac aacVar) throws IOException {
                a(new Object[]{this, aacVar}, -1863013498, 1863013499, System.identityHashCode(this));
            }

            @Override // com.mypinpad.tsdk.isolation.aan
            public final boolean setDividerPadding(@NotNull aby abyVar, int i10) throws IOException {
                return a(new Object[]{this, abyVar, Integer.valueOf(i10)}, -1474091120, 1474091120, i10).booleanValue();
            }

            @Override // com.mypinpad.tsdk.isolation.aan
            public final boolean setX(@NotNull List<aab> list) {
                return a(new Object[]{this, list}, -1317223971, 1317223973, System.identityHashCode(this)).booleanValue();
            }

            @Override // com.mypinpad.tsdk.isolation.aan
            public final boolean setY(@NotNull List<aab> list) {
                return a(new Object[]{this, list}, -807205492, 807205495, System.identityHashCode(this)).booleanValue();
            }
        }

        static {
            int i10 = 35 % 128;
            if (35 % 2 == 0) {
                throw null;
            }
        }
    }

    void setCompoundDrawableTintBlendMode(@NotNull aac aacVar);

    boolean setDividerPadding(@NotNull aby abyVar, int i10) throws IOException;

    boolean setX(@NotNull List<aab> list);

    boolean setY(@NotNull List<aab> list);
}
