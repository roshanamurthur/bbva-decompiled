package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.isolation.getInstallationId;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class TerminalSdkConfigurationCompanion<T extends getInstallationId> extends setScrollBarDefaultDelayBeforeFade {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static int f51849z = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Terminal f51850x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final T f51851y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TerminalSdkConfigurationCompanion(@NotNull setBackgroundTintList setbackgroundtintlist, @Nullable di diVar, @NotNull setChildIndicator setchildindicator, @NotNull Terminal terminal) {
        super(setbackgroundtintlist, diVar);
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        Intrinsics.checkNotNullParameter(setchildindicator, "");
        Intrinsics.checkNotNullParameter(terminal, "");
        this.f51850x = terminal;
        this.f51851y = (T) setchildindicator.setCompoundDrawableTintBlendMode(terminal);
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = (i11 * 825) + (i10 * 1649);
        int i14 = ~i11;
        if ((((~i10) | i14) * 824) + ((i11 | i10) * (-1648)) + ((i10 | i14) * (-824)) + i13 != 1) {
            TerminalSdkConfigurationCompanion terminalSdkConfigurationCompanion = (TerminalSdkConfigurationCompanion) objArr[0];
            int i15 = f51849z + 75;
            int i16 = i15 % 128;
            int i17 = i15 % 2;
            obj = terminalSdkConfigurationCompanion.f51851y;
            if (i17 != 0) {
                int i18 = 59 / 0;
            }
            int i19 = i16 + 61;
            f51849z = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = 80 / 0;
            }
        } else {
            TerminalSdkConfigurationCompanion terminalSdkConfigurationCompanion2 = (TerminalSdkConfigurationCompanion) objArr[0];
            int i21 = f51849z;
            int i22 = (i21 ^ 111) + ((i21 & 111) << 1);
            int i23 = i22 % 128;
            int i24 = i22 % 2;
            obj = terminalSdkConfigurationCompanion2.f51850x;
            if (i24 != 0) {
                throw null;
            }
            int i25 = i23 & 43;
            int i26 = (((i23 | 43) & (~i25)) - (~(i25 << 1))) - 1;
            f51849z = i26 % 128;
            int i27 = i26 % 2;
        }
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade
    @NotNull
    public final Terminal setDividerPadding() {
        return (Terminal) setX(new Object[]{this}, -956670166, 956670167, System.identityHashCode(this));
    }

    @NotNull
    public final T setX() {
        return (T) setX(new Object[]{this}, -2045879268, 2045879268, System.identityHashCode(this));
    }
}
