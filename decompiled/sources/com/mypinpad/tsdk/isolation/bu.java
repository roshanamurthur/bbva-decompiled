package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class bu extends w<br> implements getRrn {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/br;", "", "setY", "(Lcom/mypinpad/tsdk/i/br;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<br, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f54730p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final int f54731q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f54732r0 = 1;

        static {
            int i10 = f54732r0;
            int i11 = i10 & 35;
            int i12 = i11 + ((i10 ^ 35) | i11);
            f54731q0 = i12 % 128;
            int i13 = i12 % 2;
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-712)) + (i10 * 714);
            int i14 = ~i10;
            int i15 = ~i12;
            int i16 = (~(i14 | i11)) | (~(i14 | i15));
            int i17 = ~i11;
            int i18 = ~(i10 | i17 | i12);
            int i19 = ((~(i17 | i15)) * 713) + (i18 * 1426) + ((i16 | i18) * (-713)) + i13;
            int i20 = f54731q0;
            if (i19 == 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i21 = (-2) - (((i20 & 100) + (i20 | 100)) ^ (-1));
                f54732r0 = i21 % 128;
                int i22 = i21 % 2;
                a(new Object[]{aVar, (br) obj}, -490053216, 490053216, System.identityHashCode(aVar));
                Unit unit = Unit.INSTANCE;
                int i23 = i20 & 95;
                int i24 = (i20 | 95) & (~i23);
                int i25 = i23 << 1;
                int i26 = (i24 & i25) + (i24 | i25);
                f54732r0 = i26 % 128;
                if (i26 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
            br brVar = (br) objArr[1];
            int i27 = i20 + 1;
            f54732r0 = i27 % 128;
            if (i27 % 2 == 0) {
                Intrinsics.checkNotNullParameter(brVar, "");
                setRemoteViewsAdapter.setX(new Object[]{(byte[]) br.setDividerPadding(new Object[]{brVar}, 852545853, -852545845, System.identityHashCode(brVar))}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                setRemoteViewsAdapter.setX(new Object[]{(byte[]) br.setDividerPadding(new Object[]{brVar}, -1105949976, 1105949985, System.identityHashCode(brVar))}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                throw null;
            }
            Intrinsics.checkNotNullParameter(brVar, "");
            setRemoteViewsAdapter.setX(new Object[]{(byte[]) br.setDividerPadding(new Object[]{brVar}, 852545853, -852545845, System.identityHashCode(brVar))}, 1811924153, -1811924153, (int) System.currentTimeMillis());
            setRemoteViewsAdapter.setX(new Object[]{(byte[]) br.setDividerPadding(new Object[]{brVar}, -1105949976, 1105949985, System.identityHashCode(brVar))}, 1811924153, -1811924153, (int) System.currentTimeMillis());
            int i28 = (i20 & (-22)) | ((~i20) & 21);
            int i29 = -(-((i20 & 21) << 1));
            int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
            f54732r0 = i30 % 128;
            int i31 = i30 % 2;
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(br brVar) {
            return a(new Object[]{this, brVar}, -962344207, 962344208, System.identityHashCode(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu(@NotNull getBeepOnFailure getbeeponfailure) {
        super(getbeeponfailure, setAnimation.TerminalErrorCodes(), new br());
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
        getRrn.Companion.setCompoundDrawableTintBlendMode(new Object[]{this}, 1708259647, -1708259646, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        bu buVar = (bu) objArr[0];
        super.getNavBarTitleString();
        buVar.setDividerPadding(a.f54730p0);
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.getRrn
    public final void setLayoutAnimation() throws Exception {
        setDividerPadding(new Object[]{this}, -513828331, 513828331, System.identityHashCode(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        super(setscrollbardefaultdelaybeforefade, setAnimation.TerminalErrorCodes(), new br());
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        getRrn.Companion.setCompoundDrawableTintBlendMode(new Object[]{this}, 1708259647, -1708259646, (int) System.currentTimeMillis());
    }
}
