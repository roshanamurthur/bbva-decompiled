package com.mypinpad.tsdk.isolation;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/setVisibility;", "", "Lkotlin/Function0;", "", "block", "execute", "(Lkotlin/jvm/functions/Function0;)V", "", "throwable", "exceptionHandler", "(Ljava/lang/Throwable;)V", "<init>", "()V", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
public abstract class setVisibility {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/setVisibility$setDividerPadding;", "Lcom/mypinpad/tsdk/i/getDynamicButtonIconTextSpacingDp;", "r0", "setOnFocusChangeListener"}, k = 1, mv = {1, 5, 1})
    public static final class setDividerPadding implements getDynamicButtonIconTextSpacingDp {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        @NotNull
        public static final AtomicInteger f60816s0 = new AtomicInteger(0);

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f60817t0 = 0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f60818u0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final Function0<Unit> f60819p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public final String f60820q0;

        static {
            int i10 = f60818u0 + 7;
            f60817t0 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 52 / 0;
            }
        }

        public setDividerPadding(Function0 function0, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i10 & 2) != 0) {
                str = Integer.toString(f60816s0.addAndGet(1), CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(str, "");
            }
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.f60819p0 = function0;
            this.f60820q0 = str;
        }

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ((~(i10 | i11)) * (-495)) + (i11 * (-494)) + (i10 * (-494));
            int i14 = (~i12) | i10;
            int i15 = (((~((~i10) | (~i11))) | (~i14)) * 495) + (i14 * 495) + i13;
            if (i15 == 1) {
                setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
                int i16 = f60818u0;
                int i17 = ((i16 & (-86)) | ((~i16) & 85)) + ((i16 & 85) << 1);
                f60817t0 = i17 % 128;
                int i18 = i17 % 2;
                String str = setdividerpadding.f60820q0;
                int i19 = i16 & 87;
                int i20 = (i16 ^ 87) | i19;
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                f60817t0 = i21 % 128;
                if (i21 % 2 == 0) {
                    return str;
                }
                int i22 = 97 / 0;
                return str;
            }
            if (i15 != 2) {
                setDividerPadding setdividerpadding2 = (setDividerPadding) objArr[0];
                int i23 = f60817t0;
                int i24 = ((i23 ^ 91) - (~(-(-((i23 & 91) << 1))))) - 1;
                f60818u0 = i24 % 128;
                int i25 = i24 % 2;
                Function0<Unit> function0 = setdividerpadding2.f60819p0;
                int i26 = ((i23 | 13) << 1) - (i23 ^ 13);
                f60818u0 = i26 % 128;
                if (i26 % 2 != 0) {
                    return function0;
                }
                int i27 = 81 / 0;
                return function0;
            }
            setDividerPadding setdividerpadding3 = (setDividerPadding) objArr[0];
            int i28 = f60818u0;
            int i29 = ((i28 ^ 69) - (~((i28 & 69) << 1))) - 1;
            int i30 = i29 % 128;
            f60817t0 = i30;
            int i31 = i29 % 2;
            String str2 = setdividerpadding3.f60820q0;
            int i32 = i30 | 105;
            int i33 = ((i32 << 1) - (~(-((~(i30 & 105)) & i32)))) - 1;
            f60818u0 = i33 % 128;
            int i34 = i33 % 2;
            return str2;
        }

        @Override // com.mypinpad.tsdk.isolation.getDynamicButtonIconTextSpacingDp
        @NotNull
        public final String setX() {
            return (String) a(new Object[]{this}, 766258743, -766258742, System.identityHashCode(this));
        }

        @NotNull
        public final String toString() {
            return (String) a(new Object[]{this}, 615295128, -615295126, System.identityHashCode(this));
        }
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        setVisibility setvisibility = (setVisibility) objArr[0];
        setDividerPadding setdividerpadding = (setDividerPadding) objArr[1];
        try {
            ((Function0) setDividerPadding.a(new Object[]{setdividerpadding}, 853139600, -853139600, System.identityHashCode(setdividerpadding))).invoke();
            return null;
        } catch (Throwable th2) {
            setvisibility.exceptionHandler(th2);
            return null;
        }
    }

    public abstract void exceptionHandler(@NotNull Throwable throwable);

    public final void execute(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "");
        setY(new Object[]{this, new setDividerPadding(block, null, 2, null)}, -299234794, 299234794, System.identityHashCode(this));
    }
}
