package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/at;", "", "", "setX", "()V", "Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "p0", "<init>", "(Lcom/mypinpad/tsdk/i/getBeepOnFailure;)V", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
public final class at {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final List<String> f53796b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final getBeepOnFailure f53797a;

    public static final class a extends Lambda implements Function1<getBeepOnFailure, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f53798p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f53799q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f53800r0 = 1;

        static {
            int i10 = f53800r0 + 87;
            f53799q0 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ((i10 | (~(i11 | (~i12)))) * 56) + ((~(i10 | i11)) * (-56)) + (((~(i10 | i12)) | i11) * 56) + (i11 * (-55)) + (i10 * (-55));
            boolean z10 = false;
            if (i13 == 1) {
                Object obj = objArr[1];
                int i14 = f53800r0;
                int i15 = i14 ^ 97;
                int i16 = ((i14 & 97) | i15) << 1;
                int i17 = -i15;
                int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
                f53799q0 = i18 % 128;
                int i19 = i18 % 2;
                Boolean boolA = a(new Object[]{(getBeepOnFailure) obj}, -1775514767, 1775514767, (int) System.currentTimeMillis());
                int i20 = f53799q0;
                int i21 = i20 & 117;
                int i22 = (i20 ^ 117) | i21;
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                f53800r0 = i23 % 128;
                int i24 = i23 % 2;
                return boolA;
            }
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
            int i25 = (-2) - ((f53799q0 + 46) ^ (-1));
            f53800r0 = i25 % 128;
            if (i25 % 2 == 0) {
                Intrinsics.checkNotNullParameter(getbeeponfailure, "");
                List list = (List) at.setOnFocusChangeListener(new Object[0], -400508260, 400508261, (int) System.currentTimeMillis());
                setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                list.contains((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)));
                throw null;
            }
            Intrinsics.checkNotNullParameter(getbeeponfailure, "");
            List list2 = (List) at.setOnFocusChangeListener(new Object[0], -400508260, 400508261, (int) System.currentTimeMillis());
            setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            if (list2.contains((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)))) {
                int i26 = f53799q0;
                int i27 = (i26 & 11) + (i26 | 11);
                f53800r0 = i27 % 128;
                int i28 = i27 % 2;
            } else {
                int i29 = f53799q0;
                int i30 = i29 & 119;
                int i31 = ((i29 ^ 119) | i30) << 1;
                int i32 = -((i29 | 119) & (~i30));
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                f53800r0 = i33 % 128;
                int i34 = i33 % 2;
                z10 = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            int i35 = f53799q0;
            int i36 = (((i35 ^ 103) | (i35 & 103)) << 1) - (((~i35) & 103) | (i35 & (-104)));
            f53800r0 = i36 % 128;
            int i37 = i36 % 2;
            return boolValueOf;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Boolean invoke(getBeepOnFailure getbeeponfailure) {
            return a(new Object[]{this, getbeeponfailure}, -1814851198, 1814851199, System.identityHashCode(this));
        }
    }

    static {
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 1723373489, -1723373305, (int) System.currentTimeMillis());
        String str = (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed));
        TransactionFailed smoothScrollbarEnabled = setAnimation.setSmoothScrollbarEnabled();
        String str2 = (String) TransactionFailed.setX(new Object[]{smoothScrollbarEnabled}, 1914607362, -1914607356, System.identityHashCode(smoothScrollbarEnabled));
        TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -817759528, 817759728, (int) System.currentTimeMillis());
        String str3 = (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2));
        TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], -2052046062, 2052046231, (int) System.currentTimeMillis());
        String str4 = (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3));
        TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], -1333173903, 1333173904, (int) System.currentTimeMillis());
        String str5 = (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4));
        TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[0], -1711803826, 1711803947, (int) System.currentTimeMillis());
        String str6 = (String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5));
        TransactionFailed transactionFailedCardScheme = setAnimation.CardScheme();
        f53796b = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str, str2, str3, str4, str5, str6, (String) TransactionFailed.setX(new Object[]{transactionFailedCardScheme}, 1914607362, -1914607356, System.identityHashCode(transactionFailedCardScheme))});
        int i10 = (~0) & 123;
        int i11 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public at(@NotNull getBeepOnFailure getbeeponfailure) {
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
        this.f53797a = getbeeponfailure;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Exception {
        int i13 = ~i11;
        int i14 = ((i10 | i13) * (-988)) + (i11 * (-493)) + (i10 * 495);
        int i15 = ~i10;
        int i16 = ~i12;
        if ((((~(i10 | i11)) | (~(i16 | i11)) | (~(i13 | i15))) * 494) + ((i11 | i15 | i16) * 494) + i14 == 1) {
            return f53796b;
        }
        getBeepOnFailure getbeeponfailure = ((at) objArr[0]).f53797a;
        getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, a.f53798p0}, -2036793125, 2036793133, System.identityHashCode(getbeeponfailure));
        return null;
    }

    public static final /* synthetic */ List setY() {
        return (List) setOnFocusChangeListener(new Object[0], -400508260, 400508261, (int) System.currentTimeMillis());
    }

    public final void setX() throws Exception {
        setOnFocusChangeListener(new Object[]{this}, -1365675383, 1365675383, System.identityHashCode(this));
    }
}
