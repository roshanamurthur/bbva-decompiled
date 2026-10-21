package com.mypinpad.tsdk.isolation;

import bk.q;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\f\u0012\u0006\u0010\u0005\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0097@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/mypinpad/tsdk/i/configBeepVolume;", "Lcom/mypinpad/tsdk/i/setNextFocusForwardId;", "Lcom/mypinpad/tsdk/i/setPictureListener;", "p0", "Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "p1", "p2", "Lcom/mypinpad/tsdk/i/values;", "p3", "Lcom/mypinpad/tsdk/i/setScreenReaderFocusable;", "setY", "(Lcom/mypinpad/tsdk/i/setPictureListener;Lcom/mypinpad/tsdk/i/getBeepOnFailure;Lcom/mypinpad/tsdk/i/getBeepOnFailure;Lcom/mypinpad/tsdk/i/values;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/mypinpad/tsdk/i/getValue;", "Lcom/mypinpad/tsdk/i/setTextKeepState;", "Lcom/mypinpad/tsdk/i/eu;", "<init>", "(Lcom/mypinpad/tsdk/i/getValue;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/eu;)V"}, k = 1, mv = {1, 5, 1})
public final class configBeepVolume implements setNextFocusForwardId {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Map<String, String> f54983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final List<String> f54984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f54985f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f54986g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final getValue f54987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTextKeepState f54988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final eu f54989c;

    public static final class a extends ContinuationImpl {
        public static int E0 = 1;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static int f54990y0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public configBeepVolume f54991p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public setPictureListener f54992q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public getBeepOnFailure f54993r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public getBeepOnFailure f54994s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public values f54995t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public byte[] f54996u0;
        public /* synthetic */ Object v0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f54998x0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Exception {
            Object[] objArr = {this, obj};
            System.identityHashCode(this);
            a aVar = (a) objArr[0];
            Object obj2 = objArr[1];
            int i10 = f54990y0 + 75;
            E0 = i10 % 128;
            int i11 = i10 % 2;
            aVar.v0 = obj2;
            aVar.f54998x0 |= Integer.MIN_VALUE;
            configBeepVolume configbeepvolume = configBeepVolume.this;
            Object x4 = configBeepVolume.setX(new Object[]{configbeepvolume, null, null, null, null, aVar}, -1128952360, 1128952365, System.identityHashCode(configbeepvolume));
            int i12 = E0;
            int i13 = i12 & 35;
            int i14 = -(-(i12 | 35));
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            f54990y0 = i15 % 128;
            if (i15 % 2 == 0) {
                return x4;
            }
            throw null;
        }
    }

    static {
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis());
        String str = (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed));
        TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
        Object[] objArr = {transactionFailed2};
        TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
        String str2 = (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3));
        TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
        Object[] objArr2 = {transactionFailed4};
        TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[0], 1723373489, -1723373305, (int) System.currentTimeMillis());
        String str3 = (String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5));
        TransactionFailed transactionFailed6 = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
        TransactionFailed smoothScrollbarEnabled = setAnimation.setSmoothScrollbarEnabled();
        String str4 = (String) TransactionFailed.setX(new Object[]{smoothScrollbarEnabled}, 1914607362, -1914607356, System.identityHashCode(smoothScrollbarEnabled));
        TransactionFailed transactionFailed7 = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
        Object[] objArr3 = {transactionFailed7};
        TransactionFailed transactionFailed8 = (TransactionFailed) setAnimation.setY(new Object[0], -817759528, 817759728, (int) System.currentTimeMillis());
        String str5 = (String) TransactionFailed.setX(new Object[]{transactionFailed8}, 1914607362, -1914607356, System.identityHashCode(transactionFailed8));
        TransactionFailed transactionFailed9 = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
        Object[] objArr4 = {transactionFailed9};
        TransactionFailed transactionFailed10 = (TransactionFailed) setAnimation.setY(new Object[0], -2052046062, 2052046231, (int) System.currentTimeMillis());
        String str6 = (String) TransactionFailed.setX(new Object[]{transactionFailed10}, 1914607362, -1914607356, System.identityHashCode(transactionFailed10));
        TransactionFailed transactionFailed11 = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
        Object[] objArr5 = {transactionFailed11};
        TransactionFailed transactionFailed12 = (TransactionFailed) setAnimation.setY(new Object[0], -1333173903, 1333173904, (int) System.currentTimeMillis());
        String str7 = (String) TransactionFailed.setX(new Object[]{transactionFailed12}, 1914607362, -1914607356, System.identityHashCode(transactionFailed12));
        TransactionFailed transactionFailed13 = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
        TransactionFailed transactionFailed14 = (TransactionFailed) setAnimation.setY(new Object[0], -1711803826, 1711803947, (int) System.currentTimeMillis());
        String str8 = (String) TransactionFailed.setX(new Object[]{transactionFailed14}, 1914607362, -1914607356, System.identityHashCode(transactionFailed14));
        TransactionFailed transactionFailed15 = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
        Object[] objArr6 = {transactionFailed15};
        TransactionFailed transactionFailedCardScheme = setAnimation.CardScheme();
        String str9 = (String) TransactionFailed.setX(new Object[]{transactionFailedCardScheme}, 1914607362, -1914607356, System.identityHashCode(transactionFailedCardScheme));
        TransactionFailed transactionFailed16 = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
        Object[] objArr7 = {transactionFailed16};
        TransactionFailed transactionFailed17 = (TransactionFailed) setAnimation.setY(new Object[0], -1250792699, 1250792864, (int) System.currentTimeMillis());
        String str10 = (String) TransactionFailed.setX(new Object[]{transactionFailed17}, 1914607362, -1914607356, System.identityHashCode(transactionFailed17));
        TransactionFailed transactionFailedCardScheme2 = setAnimation.CardScheme();
        Object[] objArr8 = {transactionFailedCardScheme2};
        TransactionFailed transactionFailed18 = (TransactionFailed) setAnimation.setY(new Object[0], -1412794821, 1412794991, (int) System.currentTimeMillis());
        String str11 = (String) TransactionFailed.setX(new Object[]{transactionFailed18}, 1914607362, -1914607356, System.identityHashCode(transactionFailed18));
        TransactionFailed transactionFailedCardScheme3 = setAnimation.CardScheme();
        f54983d = q.mapOf(TuplesKt.to(str, (String) TransactionFailed.setX(objArr, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))), TuplesKt.to(str2, (String) TransactionFailed.setX(objArr2, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))), TuplesKt.to(str3, (String) TransactionFailed.setX(new Object[]{transactionFailed6}, 1914607362, -1914607356, System.identityHashCode(transactionFailed6))), TuplesKt.to(str4, (String) TransactionFailed.setX(objArr3, 1914607362, -1914607356, System.identityHashCode(transactionFailed7))), TuplesKt.to(str5, (String) TransactionFailed.setX(objArr4, 1914607362, -1914607356, System.identityHashCode(transactionFailed9))), TuplesKt.to(str6, (String) TransactionFailed.setX(objArr5, 1914607362, -1914607356, System.identityHashCode(transactionFailed11))), TuplesKt.to(str7, (String) TransactionFailed.setX(new Object[]{transactionFailed13}, 1914607362, -1914607356, System.identityHashCode(transactionFailed13))), TuplesKt.to(str8, (String) TransactionFailed.setX(objArr6, 1914607362, -1914607356, System.identityHashCode(transactionFailed15))), TuplesKt.to(str9, (String) TransactionFailed.setX(objArr7, 1914607362, -1914607356, System.identityHashCode(transactionFailed16))), TuplesKt.to(str10, (String) TransactionFailed.setX(objArr8, 1914607362, -1914607356, System.identityHashCode(transactionFailedCardScheme2))), TuplesKt.to(str11, (String) TransactionFailed.setX(new Object[]{transactionFailedCardScheme3}, 1914607362, -1914607356, System.identityHashCode(transactionFailedCardScheme3))));
        TransactionFailed transactionFailed19 = (TransactionFailed) setAnimation.setY(new Object[0], -1711803826, 1711803947, (int) System.currentTimeMillis());
        String str12 = (String) TransactionFailed.setX(new Object[]{transactionFailed19}, 1914607362, -1914607356, System.identityHashCode(transactionFailed19));
        TransactionFailed transactionFailed20 = (TransactionFailed) setAnimation.setY(new Object[0], 1723373489, -1723373305, (int) System.currentTimeMillis());
        String str13 = (String) TransactionFailed.setX(new Object[]{transactionFailed20}, 1914607362, -1914607356, System.identityHashCode(transactionFailed20));
        TransactionFailed transactionFailed21 = (TransactionFailed) setAnimation.setY(new Object[0], -817759528, 817759728, (int) System.currentTimeMillis());
        String str14 = (String) TransactionFailed.setX(new Object[]{transactionFailed21}, 1914607362, -1914607356, System.identityHashCode(transactionFailed21));
        TransactionFailed transactionFailed22 = (TransactionFailed) setAnimation.setY(new Object[0], -1333173903, 1333173904, (int) System.currentTimeMillis());
        f54984e = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str12, str13, str14, (String) TransactionFailed.setX(new Object[]{transactionFailed22}, 1914607362, -1914607356, System.identityHashCode(transactionFailed22))});
        int i10 = f54985f;
        int i11 = i10 & 115;
        int i12 = ((i10 ^ 115) | i11) << 1;
        int i13 = -((i10 | 115) & (~i11));
        int i14 = (i12 & i13) + (i13 | i12);
        f54986g = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public configBeepVolume(@NotNull getValue getvalue, @NotNull setTextKeepState settextkeepstate, @NotNull eu euVar) {
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(euVar, "");
        this.f54987a = getvalue;
        this.f54988b = settextkeepstate;
        this.f54989c = euVar;
    }

    public static /* synthetic */ Boolean a(Object[] objArr) throws Exception {
        configBeepVolume configbeepvolume = (configBeepVolume) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        int i10 = f54986g;
        int i11 = i10 | 27;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 27)) & i11);
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        int i15 = i14 % 128;
        f54985f = i15;
        int i16 = i14 % 2;
        if (getbeeponfailure == null) {
            int i17 = i15 & 15;
            int i18 = (~i17) & (i15 | 15);
            int i19 = i17 << 1;
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            f54986g = i20 % 128;
            int i21 = i20 % 2;
            int i22 = i15 + 95;
            f54986g = i22 % 128;
            if (i22 % 2 != 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1532855682, 1532855827, (int) System.currentTimeMillis());
        setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
        if (!Intrinsics.areEqual((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)), (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, new m3(configbeepvolume)}, -2036793125, 2036793133, System.identityHashCode(getbeeponfailure));
            int i23 = f54985f;
            int i24 = ((i23 ^ 37) | (i23 & 37)) << 1;
            int i25 = -(((~i23) & 37) | (i23 & (-38)));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            f54986g = i26 % 128;
            int i27 = i26 % 2;
            return Boolean.TRUE;
        }
        int i28 = f54985f;
        int i29 = i28 & 69;
        int i30 = ((((i28 ^ 69) | i29) << 1) - (~(-((i28 | 69) & (~i29))))) - 1;
        f54986g = i30 % 128;
        int i31 = i30 % 2;
        if (!(!((setFindListener) TransactionFailed.setX(new Object[]{transactionFailed}, -570885530, 570885532, System.identityHashCode(transactionFailed))).setX((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))))) {
            int i32 = f54986g + 27;
            f54985f = i32 % 128;
            int i33 = i32 % 2;
            byte b10 = ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))[0];
            if (11 <= b10) {
                int i34 = f54986g;
                int i35 = i34 & 81;
                int i36 = (~i35) & (i34 | 81);
                int i37 = i35 << 1;
                int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                int i39 = i38 % 128;
                f54985f = i39;
                if (i38 % 2 == 0 ? b10 <= 30 : b10 <= 73) {
                    int i40 = i34 & 23;
                    int i41 = i40 + ((i34 ^ 23) | i40);
                    int i42 = i41 % 128;
                    f54985f = i42;
                    int i43 = i41 % 2;
                    int i44 = i42 & 57;
                    int i45 = (i42 ^ 57) | i44;
                    int i46 = (i44 ^ i45) + ((i44 & i45) << 1);
                    int i47 = i46 % 128;
                    f54986g = i47;
                    int i48 = i46 % 2;
                    int i49 = i47 ^ 121;
                    int i50 = ((i47 & 121) | i49) << 1;
                    int i51 = -i49;
                    int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
                    f54985f = i52 % 128;
                    return Boolean.valueOf(i52 % 2 == 0);
                }
                int i53 = (i39 & 61) + (i39 | 61);
                f54986g = i53 % 128;
                int i54 = i53 % 2;
            } else {
                int i55 = f54986g;
                int i56 = i55 & 101;
                int i57 = i56 + ((i55 ^ 101) | i56);
                f54985f = i57 % 128;
                int i58 = i57 % 2;
            }
        }
        int i59 = f54986g + 53;
        f54985f = i59 % 128;
        int i60 = i59 % 2;
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0375  */
    /* JADX WARN: Code duplicated, block: B:7:0x0035  */
    public static Object b(Object[] objArr) throws Exception {
        a aVar;
        configBeepVolume configbeepvolume;
        byte[] bArr;
        char c10;
        getDetailsFieldTextSizeSp getdetailsfieldtextsizesp;
        getDetailsFieldTextSizeSp getdetailsfieldtextsizesp2;
        char c11;
        getDetailsFieldTextSizeSp getdetailsfieldtextsizesp3;
        getDetailsFieldTextSizeSp getdetailsfieldtextsizesp4;
        byte[] onFocusChangeListener;
        getDetailsFieldTextSizeSp navigationOnClickListener;
        configBeepVolume configbeepvolume2 = (configBeepVolume) objArr[0];
        setPictureListener setpicturelistener = (setPictureListener) objArr[1];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[2];
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[3];
        values valuesVar = (values) objArr[4];
        Continuation continuation = (Continuation) objArr[5];
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f54998x0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f54998x0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = configbeepvolume2.new a(continuation);
            }
        } else {
            aVar = configbeepvolume2.new a(continuation);
        }
        Object onFocusChangeListener2 = aVar.v0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f54998x0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(onFocusChangeListener2);
            setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
            setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.KERNEL_2}, -157457190, 157457205, (int) System.currentTimeMillis());
            byte[] bArr2 = (byte[]) setPictureListener.setY(new Object[]{setpicturelistener}, -87887370, 87887376, System.identityHashCode(setpicturelistener));
            byte[] bArr3 = (((byte[]) setPictureListener.setY(new Object[]{setpicturelistener}, 2106619938, -2106619931, System.identityHashCode(setpicturelistener))) == null || !((Boolean) setPictureListener.setY(new Object[]{setpicturelistener}, -800777879, 800777887, System.identityHashCode(setpicturelistener))).booleanValue()) ? new byte[0] : (byte[]) setPictureListener.setY(new Object[]{setpicturelistener}, 2106619938, -2106619931, System.identityHashCode(setpicturelistener));
            Intrinsics.checkNotNull(bArr3);
            byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(bArr2, bArr3);
            getValue getvalue = configbeepvolume2.f54987a;
            writeReplace writereplace = new writeReplace(bArrPlus);
            aVar.f54991p0 = configbeepvolume2;
            aVar.f54992q0 = setpicturelistener;
            aVar.f54993r0 = getbeeponfailure;
            aVar.f54994s0 = getbeeponfailure2;
            aVar.f54995t0 = valuesVar;
            aVar.f54996u0 = bArrPlus;
            aVar.f54998x0 = 1;
            onFocusChangeListener2 = getvalue.setOnFocusChangeListener(writereplace, aVar);
            if (onFocusChangeListener2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            configbeepvolume = configbeepvolume2;
            bArr = bArrPlus;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = aVar.f54996u0;
            valuesVar = aVar.f54995t0;
            getbeeponfailure2 = aVar.f54994s0;
            getbeeponfailure = aVar.f54993r0;
            setpicturelistener = aVar.f54992q0;
            configbeepvolume = aVar.f54991p0;
            ResultKt.throwOnFailure(onFocusChangeListener2);
        }
        setRotationX setrotationx = (setRotationX) onFocusChangeListener2;
        setScreenReaderFocusable setscreenreaderfocusable = new setScreenReaderFocusable((setTextColor) setX(new Object[0], 72416936, -72416930, (int) System.currentTimeMillis()), setrotationx.setNavigationOnClickListener());
        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
        getDetailsFieldTextSizeSp[] getdetailsfieldtextsizespArr = new getDetailsFieldTextSizeSp[3];
        getdetailsfieldtextsizespArr[0] = setInputExtras.setNavigationOnClickListener(bArr);
        setTextColor settextcolor = (setTextColor) setScreenReaderFocusable.setCompoundDrawableTintBlendMode(new Object[]{setscreenreaderfocusable}, 1596125392, -1596125390, System.identityHashCode(setscreenreaderfocusable));
        setMaxLines setmaxlines = (setMaxLines) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1588451735, 1588451749, System.identityHashCode(settextcolor));
        getdetailsfieldtextsizespArr[1] = setmaxlines == null ? null : getCause.setDividerPadding(setmaxlines);
        getdetailsfieldtextsizespArr[2] = setInputExtras.setNavigationOnClickListener(setrotationx.setCompoundDrawableTintBlendMode());
        SouthPacificEndpoint.setX(new Object[]{10011, new TerminalLogger(getdetailsfieldtextsizespArr, null, 2, null), 4}, 1336485880, -1336485874, 10011);
        if (!((Boolean) setRotationX.setX(new Object[]{setrotationx}, -268504199, 268504206, System.identityHashCode(setrotationx))).booleanValue()) {
            if (getbeeponfailure != null || getbeeponfailure2 != null) {
                setX(new Object[]{configbeepvolume, (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, 1286654426, -1286654423, System.identityHashCode(configbeepvolume));
                return null;
            }
            if (((setItemChecked) setRotationX.setX(new Object[]{setrotationx}, 2020716727, -2020716721, System.identityHashCode(setrotationx))) == setItemChecked.setDividerPadding) {
                return setscreenreaderfocusable;
            }
            return null;
        }
        setTitleMarginTop settitlemargintop = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener));
        Terminal terminal = (Terminal) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop}, 2113948533, -2113948530, System.identityHashCode(settitlemargintop));
        setTitleMarginTop settitlemargintop2 = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener));
        setFontFeatureSettings setfontfeaturesettings = (setFontFeatureSettings) values.setY(new Object[]{valuesVar, terminal, (setBackgroundTintList) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop2}, 423062029, -423062025, System.identityHashCode(settitlemargintop2)), (md) setPictureListener.setY(new Object[]{setpicturelistener}, 1661100660, -1661100656, System.identityHashCode(setpicturelistener))}, -1159783560, 1159783561, System.identityHashCode(valuesVar));
        getDetailsFieldTextSizeSp[] getdetailsfieldtextsizespArr2 = new getDetailsFieldTextSizeSp[7];
        if (setfontfeaturesettings == null) {
            getdetailsfieldtextsizesp = null;
            c10 = 0;
        } else {
            c10 = 0;
            getdetailsfieldtextsizesp = (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings}, -1512289586, 1512289586, System.identityHashCode(setfontfeaturesettings))).booleanValue())}, -772901588, 772901588, (int) System.currentTimeMillis());
        }
        getdetailsfieldtextsizespArr2[c10] = getdetailsfieldtextsizesp;
        if (setfontfeaturesettings == null) {
            getdetailsfieldtextsizesp2 = null;
        } else {
            Object[] objArr2 = new Object[1];
            objArr2[c10] = setfontfeaturesettings;
            Object[] objArr3 = new Object[1];
            objArr3[c10] = Boolean.valueOf(((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(objArr2, -1570467641, 1570467643, System.identityHashCode(setfontfeaturesettings))).booleanValue());
            getdetailsfieldtextsizesp2 = (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(objArr3, -772901588, 772901588, (int) System.currentTimeMillis());
        }
        getdetailsfieldtextsizespArr2[1] = getdetailsfieldtextsizesp2;
        if (setfontfeaturesettings == null) {
            getdetailsfieldtextsizesp3 = null;
            c11 = 0;
        } else {
            c11 = 0;
            getdetailsfieldtextsizesp3 = (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings}, 1612421959, -1612421951, System.identityHashCode(setfontfeaturesettings))).booleanValue())}, -772901588, 772901588, (int) System.currentTimeMillis());
        }
        getdetailsfieldtextsizespArr2[2] = getdetailsfieldtextsizesp3;
        if (setfontfeaturesettings == null) {
            getdetailsfieldtextsizesp4 = null;
        } else {
            Object[] objArr4 = new Object[1];
            objArr4[c11] = setfontfeaturesettings;
            Object[] objArr5 = new Object[1];
            objArr5[c11] = Boolean.valueOf(((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(objArr4, -2133249192, 2133249203, System.identityHashCode(setfontfeaturesettings))).booleanValue());
            getdetailsfieldtextsizesp4 = (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(objArr5, -772901588, 772901588, (int) System.currentTimeMillis());
        }
        getdetailsfieldtextsizespArr2[3] = getdetailsfieldtextsizesp4;
        if (setfontfeaturesettings == null) {
            navigationOnClickListener = null;
        } else {
            Object[] objArr6 = new Object[1];
            objArr6[c11] = setfontfeaturesettings;
            cs csVar = (cs) setFontFeatureSettings.setCompoundDrawableTintBlendMode(objArr6, -1608275827, 1608275837, System.identityHashCode(setfontfeaturesettings));
            if (csVar == null || (onFocusChangeListener = csVar.setOnFocusChangeListener()) == null) {
                navigationOnClickListener = null;
            } else {
                navigationOnClickListener = setInputExtras.setNavigationOnClickListener(onFocusChangeListener);
            }
        }
        getdetailsfieldtextsizespArr2[4] = navigationOnClickListener;
        setTitleMarginTop settitlemargintop3 = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener));
        getdetailsfieldtextsizespArr2[5] = setInputExtras.setNavigationOnClickListener(((setBackgroundTintList) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop3}, 423062029, -423062025, System.identityHashCode(settitlemargintop3))).setY());
        setTitleMarginTop settitlemargintop4 = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener));
        getdetailsfieldtextsizespArr2[6] = setLogo.setX(((Terminal) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop4}, 2113948533, -2113948530, System.identityHashCode(settitlemargintop4))).setY());
        SouthPacificEndpoint.setX(new Object[]{10007, new TerminalLogger(getdetailsfieldtextsizespArr2, null, 2, null), 4}, 1336485880, -1336485874, 10007);
        if (setfontfeaturesettings != null && ((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings}, 173483714, -173483711, System.identityHashCode(setfontfeaturesettings))).booleanValue()) {
            return setscreenreaderfocusable;
        }
        getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScreenReaderFocusable.setCompoundDrawableTintBlendMode(new Object[]{setscreenreaderfocusable}, 2060907440, -2060907440, System.identityHashCode(setscreenreaderfocusable));
        if (getbeeponfailure3 != null) {
            setTitleMarginTop settitlemargintop5 = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener));
            setX(new Object[]{configbeepvolume, getbeeponfailure3}, -1376515749, 1376515758, System.identityHashCode(configbeepvolume));
        }
        getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setScreenReaderFocusable.setCompoundDrawableTintBlendMode(new Object[]{setscreenreaderfocusable}, 2060907440, -2060907440, System.identityHashCode(setscreenreaderfocusable));
        setTitleMarginTop settitlemargintop6 = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener));
        if (!((Boolean) setX(new Object[]{configbeepvolume, getbeeponfailure4, (Terminal) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop6}, 2113948533, -2113948530, System.identityHashCode(settitlemargintop6))}, 858221461, -858221450, System.identityHashCode(configbeepvolume))).booleanValue()) {
            SouthPacificEndpoint.setX(new Object[]{10013, null, 6}, 1336485880, -1336485874, 10013);
            setX(new Object[]{configbeepvolume, setContentCaptureSession.setNavigationOnClickListener}, -1258759379, 1258759386, System.identityHashCode(configbeepvolume));
            return null;
        }
        if (!((Boolean) setX(new Object[]{setscreenreaderfocusable}, 1751709398, -1751709398, (int) System.currentTimeMillis())).booleanValue()) {
            SouthPacificEndpoint.setX(new Object[]{10014, null, 6}, 1336485880, -1336485874, 10014);
            setX(new Object[]{configbeepvolume, setContentCaptureSession.setOnFocusChangeListener}, -1258759379, 1258759386, System.identityHashCode(configbeepvolume));
            return null;
        }
        getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) setScreenReaderFocusable.setCompoundDrawableTintBlendMode(new Object[]{setscreenreaderfocusable}, 2060907440, -2060907440, System.identityHashCode(setscreenreaderfocusable));
        Intrinsics.checkNotNull(getbeeponfailure5);
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis());
        getBeepOnFailure getbeeponfailure6 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 1895833701, -1895833678, System.identityHashCode(getbeeponfailure5));
        Intrinsics.checkNotNull(getbeeponfailure6);
        byte[] bArr4 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 252497730, -252497710, System.identityHashCode(getbeeponfailure6));
        if (((Boolean) setX(new Object[]{bArr4, bArr}, -1735170600, 1735170608, (int) System.currentTimeMillis())).booleanValue()) {
            setTextColor settextcolor2 = new setTextColor(null, null, null, null, false, false, null, null, false, null, setMaxLines.setDividerPadding, false, null, null, 15359, null);
            getBeepOnFailure getbeeponfailure7 = (getBeepOnFailure) setScreenReaderFocusable.setCompoundDrawableTintBlendMode(new Object[]{setscreenreaderfocusable}, 2060907440, -2060907440, System.identityHashCode(setscreenreaderfocusable));
            Intrinsics.checkNotNull(getbeeponfailure7);
            return new setScreenReaderFocusable(settextcolor2, getbeeponfailure7.setOnLongClickListener());
        }
        SouthPacificEndpoint.setX(new Object[]{10015, new TerminalLogger(new getDetailsFieldTextSizeSp[]{setInputExtras.setNavigationOnClickListener(bArr), setInputExtras.setNavigationOnClickListener(bArr4)}, null, 2, null), 4}, 1336485880, -1336485874, 10015);
        StringBuilder sb2 = new StringBuilder("Select ADF[");
        sb2.append((String) setInputExtras.setDividerPadding(new Object[]{bArr}, 1609250238, -1609250236, (int) System.currentTimeMillis()));
        sb2.append("] is different from ADF[");
        sb2.append((String) setInputExtras.setDividerPadding(new Object[]{bArr4}, 1609250238, -1609250236, (int) System.currentTimeMillis()));
        sb2.append("] from response");
        SouthPacificEndpoint.setX(new Object[]{sb2.toString()}, -1475632754, 1475632759, (int) System.currentTimeMillis());
        setX(new Object[]{configbeepvolume, null}, 1286654426, -1286654423, System.identityHashCode(configbeepvolume));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x05da  */
    /* JADX WARN: Code duplicated, block: B:124:0x0733  */
    /* JADX WARN: Code duplicated, block: B:126:0x073e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0756  */
    /* JADX WARN: Code duplicated, block: B:131:0x0765  */
    /* JADX WARN: Code duplicated, block: B:132:0x0769  */
    /* JADX WARN: Code duplicated, block: B:133:0x076a  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x029e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0146  */
    /* JADX WARN: Code duplicated, block: B:22:0x0160  */
    /* JADX WARN: Code duplicated, block: B:24:0x019c  */
    /* JADX WARN: Code duplicated, block: B:27:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:28:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:31:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:34:0x0208  */
    /* JADX WARN: Code duplicated, block: B:35:0x021b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0230  */
    /* JADX WARN: Code duplicated, block: B:40:0x0248  */
    /* JADX WARN: Code duplicated, block: B:43:0x024e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0250 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0252  */
    /* JADX WARN: Code duplicated, block: B:47:0x026f  */
    /* JADX WARN: Code duplicated, block: B:49:0x027e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0280  */
    /* JADX WARN: Code duplicated, block: B:53:0x0284 A[LOOP:0: B:20:0x0159->B:53:0x0284, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x0336  */
    /* JADX WARN: Code duplicated, block: B:72:0x0352  */
    /* JADX WARN: Code duplicated, block: B:74:0x0366  */
    /* JADX WARN: Code duplicated, block: B:76:0x036d  */
    /* JADX WARN: Code duplicated, block: B:77:0x037a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0447  */
    /* JADX WARN: Code duplicated, block: B:80:0x044e  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Exception {
        boolean zBooleanValue;
        setContentCaptureSession setcontentcapturesession;
        int i13;
        int i14;
        Boolean boolValueOf;
        getBeepOnFailure getbeeponfailure;
        getBeepOnFailure getbeeponfailure2;
        int i15;
        int i16;
        int i17;
        int i18;
        Iterator it;
        getBeepOnFailure getbeeponfailure3;
        String str;
        boolean z10;
        boolean z11;
        boolean zAreEqual;
        int i19;
        boolean z12;
        int i20;
        setScrollContainer setscrollcontainer;
        int i21;
        int i22;
        int i23 = ~i11;
        int i24 = i23 | i10;
        int i25 = (((~(i10 | i12)) | (~(i23 | i12)) | (~i24)) * 623) + (((~(i11 | (~i10))) | (~i12)) * (-623)) + ((~(i24 | i12)) * 623) + (i11 * (-622)) + (i10 * 624);
        int i26 = 888877739;
        int i27 = -888877733;
        int i28 = -865402437;
        int i29 = 6;
        switch (i25) {
            case 1:
                configBeepVolume configbeepvolume = (configBeepVolume) objArr[0];
                getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) objArr[1];
                int i30 = f54986g + 112;
                int i31 = (i30 ^ (-1)) + (i30 << 1);
                f54985f = i31 % 128;
                if (i31 % 2 != 0) {
                    zBooleanValue = ((Boolean) setX(new Object[]{configbeepvolume, getbeeponfailure4}, -812676317, 812676321, System.identityHashCode(configbeepvolume))).booleanValue();
                    int i32 = 63 / 0;
                } else {
                    zBooleanValue = ((Boolean) setX(new Object[]{configbeepvolume, getbeeponfailure4}, -812676317, 812676321, System.identityHashCode(configbeepvolume))).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 2:
                configBeepVolume configbeepvolume2 = (configBeepVolume) objArr[0];
                setContentCaptureSession setcontentcapturesession2 = (setContentCaptureSession) objArr[1];
                byte[] bArr = (byte[]) objArr[2];
                eu euVar = configbeepvolume2.f54989c;
                setHighlightColor sethighlightcolor = new setHighlightColor();
                fd fdVar = fd.END_APPLICATION;
                activateSession activatesession = activateSession.ERROR_OTHER_CARD;
                int i33 = f54985f;
                int i34 = i33 & 113;
                int i35 = (i33 ^ 113) | i34;
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                f54986g = i36 % 128;
                int i37 = i36 % 2;
                return null;
            case 3:
                configBeepVolume configbeepvolume3 = (configBeepVolume) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int i38 = f54986g + 19;
                int i39 = i38 % 128;
                f54985f = i39;
                int i40 = i38 % 2;
                if (bArr2 != null) {
                    int i41 = i39 & 63;
                    int i42 = ((i39 ^ 63) | i41) << 1;
                    int i43 = -((i39 | 63) & (~i41));
                    int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
                    f54986g = i44 % 128;
                    if (i44 % 2 == 0) {
                        setContentCaptureSession.Companion companion = setContentCaptureSession.INSTANCE;
                        throw null;
                    }
                    setcontentcapturesession = setContentCaptureSession.setLayoutAnimation;
                } else {
                    setcontentcapturesession = setContentCaptureSession.setOnLongClickListener;
                    int i45 = f54985f;
                    int i46 = ((i45 ^ 9) | (i45 & 9)) << 1;
                    int i47 = -(((~i45) & 9) | (i45 & (-10)));
                    int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                    f54986g = i48 % 128;
                    int i49 = i48 % 2;
                }
                setX(new Object[]{configbeepvolume3, setcontentcapturesession, bArr2}, -2049919950, 2049919952, System.identityHashCode(configbeepvolume3));
                int i50 = f54985f;
                int i51 = ((i50 & 50) + (i50 | 50)) - 1;
                f54986g = i51 % 128;
                int i52 = i51 % 2;
                return null;
            case 4:
                return a(objArr);
            case 5:
                return b(objArr);
            case 6:
                setTextColor settextcolor = new setTextColor(null, null, null, null, false, false, null, null, false, null, setMaxLines.setX, false, null, null, 15359, null);
                int i53 = f54986g;
                int i54 = ((i53 ^ 52) + ((i53 & 52) << 1)) - 1;
                f54985f = i54 % 128;
                if (i54 % 2 == 0) {
                    return settextcolor;
                }
                int i55 = 24 / 0;
                return settextcolor;
            case 7:
                configBeepVolume configbeepvolume4 = (configBeepVolume) objArr[0];
                setContentCaptureSession setcontentcapturesession3 = (setContentCaptureSession) objArr[1];
                eu euVar2 = configbeepvolume4.f54989c;
                int i56 = f54986g;
                int i57 = i56 & 31;
                int i58 = -(-(i56 | 31));
                int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                f54985f = i59 % 128;
                int i60 = i59 % 2;
                return null;
            case 8:
                byte[] bArr3 = (byte[]) objArr[0];
                byte[] bArr4 = (byte[]) objArr[1];
                int i61 = f54986g;
                int i62 = i61 ^ 17;
                int i63 = (((i61 & 17) | i62) << 1) - i62;
                f54985f = i63 % 128;
                if (i63 % 2 != 0) {
                    int i64 = 36 / 0;
                    if (!((Boolean) setInputExtras.setDividerPadding(new Object[]{bArr3, bArr4}, -481646848, 481646868, (int) System.currentTimeMillis())).booleanValue()) {
                        i13 = f54985f + 101;
                        f54986g = i13 % 128;
                        if (i13 % 2 != 0) {
                            ((Boolean) setInputExtras.setDividerPadding(new Object[]{bArr4, bArr3}, -481646848, 481646868, (int) System.currentTimeMillis())).booleanValue();
                            throw null;
                        }
                        if (((Boolean) setInputExtras.setDividerPadding(new Object[]{bArr4, bArr3}, -481646848, 481646868, (int) System.currentTimeMillis())).booleanValue()) {
                            int i65 = f54985f;
                            i14 = (i65 ^ 109) + ((i65 & 109) << 1);
                            f54986g = i14 % 128;
                            if (i14 % 2 != 0) {
                                throw null;
                            }
                            boolValueOf = Boolean.FALSE;
                            break;
                        }
                    }
                } else if (!((Boolean) setInputExtras.setDividerPadding(new Object[]{bArr3, bArr4}, -481646848, 481646868, (int) System.currentTimeMillis())).booleanValue()) {
                    i13 = f54985f + 101;
                    f54986g = i13 % 128;
                    if (i13 % 2 != 0) {
                        ((Boolean) setInputExtras.setDividerPadding(new Object[]{bArr4, bArr3}, -481646848, 481646868, (int) System.currentTimeMillis())).booleanValue();
                        throw null;
                    }
                    if (((Boolean) setInputExtras.setDividerPadding(new Object[]{bArr4, bArr3}, -481646848, 481646868, (int) System.currentTimeMillis())).booleanValue()) {
                        int i66 = f54985f;
                        i14 = (i66 ^ 109) + ((i66 & 109) << 1);
                        f54986g = i14 % 128;
                        if (i14 % 2 != 0) {
                            throw null;
                        }
                        boolValueOf = Boolean.FALSE;
                        break;
                    }
                }
                int i67 = f54985f + 27;
                f54986g = i67 % 128;
                int i68 = i67 % 2;
                boolValueOf = Boolean.TRUE;
                break;
            case 9:
                configBeepVolume configbeepvolume5 = (configBeepVolume) objArr[0];
                getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) objArr[1];
                int i69 = f54986g;
                int i70 = ((i69 & 38) + (i69 | 38)) - 1;
                f54985f = i70 % 128;
                if (i70 % 2 != 0) {
                    setAnimation setanimation = setAnimation.INSTANCE;
                    throw null;
                }
                setAnimation setanimation2 = setAnimation.INSTANCE;
                getBeepOnFailure getbeeponfailure6 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5, (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis())}, -990392770, 990392791, System.identityHashCode(getbeeponfailure5));
                if (getbeeponfailure6 != null) {
                    int i71 = f54985f;
                    int i72 = i71 & 67;
                    int i73 = ((((i71 ^ 67) | i72) << 1) - (~(-((i71 | 67) & (~i72))))) - 1;
                    f54986g = i73 % 128;
                    int i74 = i73 % 2;
                    getBeepOnFailure getbeeponfailure7 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure6, setAnimation.CardScheme()}, -990392770, 990392791, System.identityHashCode(getbeeponfailure6));
                    if (getbeeponfailure7 != null) {
                        int i75 = f54986g;
                        int i76 = i75 & 123;
                        int i77 = ((i75 ^ 123) | i76) << 1;
                        int i78 = -((i75 | 123) & (~i76));
                        int i79 = (i77 & i78) + (i78 | i77);
                        f54985f = i79 % 128;
                        int i80 = i79 % 2;
                        getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure7, n3.f57193p0}, -2036793125, 2036793133, System.identityHashCode(getbeeponfailure7));
                        int i81 = f54985f;
                        int i82 = i81 & 17;
                        int i83 = (i81 ^ 17) | i82;
                        int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                        f54986g = i84 % 128;
                        int i85 = i84 % 2;
                    }
                }
                ((Boolean) setX(new Object[]{configbeepvolume5, getbeeponfailure5}, -812676317, 812676321, System.identityHashCode(configbeepvolume5))).booleanValue();
                int i86 = f54986g;
                int i87 = i86 & 103;
                int i88 = (i86 | 103) & (~i87);
                int i89 = i87 << 1;
                int i90 = (i88 & i89) + (i88 | i89);
                f54985f = i90 % 128;
                int i91 = i90 % 2;
                return null;
            case 10:
                setScreenReaderFocusable setscreenreaderfocusable = (setScreenReaderFocusable) objArr[0];
                int i92 = f54985f;
                int i93 = i92 ^ 91;
                int i94 = (i92 & 91) << 1;
                int i95 = (i93 & i94) + (i94 | i93);
                f54986g = i95 % 128;
                int i96 = i95 % 2;
                getBeepOnFailure getbeeponfailure8 = (getBeepOnFailure) setScreenReaderFocusable.setCompoundDrawableTintBlendMode(new Object[]{setscreenreaderfocusable}, 2060907440, -2060907440, System.identityHashCode(setscreenreaderfocusable));
                if (getbeeponfailure8 == null) {
                    int i97 = f54985f + 91;
                    f54986g = i97 % 128;
                    if (i97 % 2 == 0) {
                        int i98 = 46 / 0;
                    }
                    getbeeponfailure = null;
                } else {
                    setAnimation setanimation3 = setAnimation.INSTANCE;
                    getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure8, (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis())}, -990392770, 990392791, System.identityHashCode(getbeeponfailure8));
                    int i99 = f54986g + 20;
                    int i100 = (i99 ^ (-1)) + (i99 << 1);
                    f54985f = i100 % 128;
                    int i101 = i100 % 2;
                }
                if (getbeeponfailure8 == null) {
                    int i102 = f54986g;
                    int i103 = (-2) - ((((i102 | 14) << 1) - (i102 ^ 14)) ^ (-1));
                    f54985f = i103 % 128;
                    if (i103 % 2 != 0) {
                        int i104 = 1 / 0;
                    }
                    getbeeponfailure2 = null;
                } else {
                    setAnimation setanimation4 = setAnimation.INSTANCE;
                    getbeeponfailure2 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure8, (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis())}, -990392770, 990392791, System.identityHashCode(getbeeponfailure8));
                    int i105 = f54985f + 45;
                    f54986g = i105 % 128;
                    int i106 = i105 % 2;
                }
                if (getbeeponfailure8 == null) {
                    int i107 = f54985f;
                    int i108 = (i107 ^ 91) + ((i107 & 91) << 1);
                    f54986g = i108 % 128;
                    int i109 = i108 % 2;
                    boolValueOf = Boolean.FALSE;
                } else {
                    int i110 = f54985f + 83;
                    f54986g = i110 % 128;
                    if (i110 % 2 == 0) {
                        setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure8}, 865402441, -865402437, System.identityHashCode(getbeeponfailure8));
                        String str2 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2));
                        setAnimation setanimation5 = setAnimation.INSTANCE;
                        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                        Intrinsics.areEqual(str2, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)));
                        throw null;
                    }
                    setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure8}, 865402441, -865402437, System.identityHashCode(getbeeponfailure8));
                    String str3 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3));
                    setAnimation setanimation6 = setAnimation.INSTANCE;
                    TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                    if ((!Intrinsics.areEqual(str3, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)))) || getbeeponfailure == null) {
                        int i1010 = f54985f;
                        int i1011 = (i1010 ^ 91) + ((i1010 & 91) << 1);
                        f54986g = i1011 % 128;
                        int i1012 = i1011 % 2;
                        boolValueOf = Boolean.FALSE;
                    } else {
                        int i111 = f54986g;
                        int i112 = i111 & 49;
                        int i113 = ((i111 ^ 49) | i112) << 1;
                        int i114 = -((i111 | 49) & (~i112));
                        int i115 = (i113 ^ i114) + ((i114 & i113) << 1);
                        int i116 = i115 % 128;
                        f54985f = i116;
                        int i117 = i115 % 2;
                        if (getbeeponfailure2 == null) {
                            int i1013 = f54985f;
                            int i1014 = (i1013 ^ 91) + ((i1013 & 91) << 1);
                            f54986g = i1014 % 128;
                            int i1015 = i1014 % 2;
                            boolValueOf = Boolean.FALSE;
                        } else {
                            int i118 = ((i116 ^ 114) + ((i116 & 114) << 1)) - 1;
                            f54986g = i118 % 128;
                            int i119 = i118 % 2;
                            boolValueOf = Boolean.TRUE;
                        }
                    }
                }
                break;
            case 11:
                configBeepVolume configbeepvolume6 = (configBeepVolume) objArr[0];
                getBeepOnFailure getbeeponfailure9 = (getBeepOnFailure) objArr[1];
                Terminal terminal = (Terminal) objArr[2];
                int i120 = f54986g;
                int i121 = ((i120 | 81) << 1) - (i120 ^ 81);
                int i122 = i121 % 128;
                f54985f = i122;
                int i123 = i121 % 2;
                if (getbeeponfailure9 == null) {
                    int iIdentityHashCode = System.identityHashCode(configbeepvolume6);
                    int i124 = ~(772197988 | iIdentityHashCode);
                    int i125 = ((~i124) & (-275146670)) | (275146669 & i124);
                    int i126 = i124 & (-275146670);
                    int i127 = ((i126 & i125) | (i125 ^ i126)) * (-658);
                    int i128 = (((-1852241194) | i127) << 1) - (i127 ^ (-1852241194));
                    int i129 = i128 & (-1687466428);
                    int i130 = ((-1687466428) | i128) & (~i129);
                    int i131 = i129 << 1;
                    int i132 = ((i130 | i131) << 1) - (i130 ^ i131);
                    int i133 = (iIdentityHashCode & 772197988) | (772197988 ^ iIdentityHashCode);
                    int i134 = ~i133;
                    int i135 = (i133 | i134) & i134;
                    int i136 = (-1046933486) & i135;
                    int i137 = (i135 | (-1046933486)) & (~i136);
                    i15 = (-2) - ((i132 - (~(((i137 & i136) | (i137 ^ i136)) * 658))) ^ (-1));
                    int iIdentityHashCode2 = System.identityHashCode(configbeepvolume6);
                    int i138 = ~iIdentityHashCode2;
                    int i139 = ((~i138) & 1943425143) | (i138 & (-1943425144));
                    int i140 = 1943425143 & i138;
                    int i141 = ~((i139 & i140) | (i139 ^ i140));
                    int i142 = (-397267179) & i141;
                    int i143 = -(-((((i141 | (-397267179)) & (~i142)) | i142) * (-90)));
                    int i144 = (((-297664458) ^ i143) - (~((i143 & (-297664458)) << 1))) - 1;
                    int i145 = 1943425143 | iIdentityHashCode2;
                    int i146 = ~i145;
                    int i147 = (i145 | i146) & i146;
                    int i148 = i147 & 327438434;
                    int i149 = (i147 | 327438434) & (~i148);
                    int i150 = ((i149 & i148) | (i149 ^ i148)) * (-45);
                    i16 = ((((~i150) & i144) | ((~i144) & i150)) - (~(-(-((i150 & i144) << 1))))) - 1;
                    int i151 = ~((iIdentityHashCode2 & 397267178) | (397267178 ^ iIdentityHashCode2));
                    int i152 = ((~i151) & 1943425143) | ((-1943425144) & i151);
                    int i153 = i151 & 1943425143;
                    int i154 = (i153 & i152) | (i152 ^ i153);
                    int i155 = i138 ^ (-397267179);
                    int i156 = i138 & (-397267179);
                    int i157 = (i156 & i155) | (i155 ^ i156);
                    int i158 = ~i157;
                    int i159 = (i157 | i158) & i158;
                    int i160 = ((~i159) & i154) | ((~i154) & i159);
                    int i161 = i154 & i159;
                    i17 = -(-(((i161 & i160) | (i160 ^ i161)) * 45));
                    i18 = i16 ^ i17;
                    if (i15 <= ((((i17 & i16) | i18) << 1) - (~(-i18))) - 1) {
                        boolValueOf = Boolean.FALSE;
                    } else {
                        int i162 = 23 / 0;
                        boolValueOf = Boolean.FALSE;
                    }
                } else {
                    int i163 = (((i122 ^ 67) | (i122 & 67)) << 1) - (((~i122) & 67) | (i122 & (-68)));
                    f54986g = i163 % 128;
                    int i164 = i163 % 2;
                    List<String> list = f54984e;
                    if (i164 == 0) {
                        int i165 = 0 / 0;
                        if (!((Boolean) getEnterButtonIconDrawableId.setX(new Object[]{getbeeponfailure9, terminal, list}, 1151046421, -1151046420, (int) System.currentTimeMillis())).booleanValue()) {
                            int iIdentityHashCode3 = System.identityHashCode(configbeepvolume6);
                            int i1210 = ~(772197988 | iIdentityHashCode3);
                            int i1211 = ((~i1210) & (-275146670)) | (275146669 & i1210);
                            int i1212 = i1210 & (-275146670);
                            int i1213 = ((i1212 & i1211) | (i1211 ^ i1212)) * (-658);
                            int i1214 = (((-1852241194) | i1213) << 1) - (i1213 ^ (-1852241194));
                            int i1215 = i1214 & (-1687466428);
                            int i1310 = ((-1687466428) | i1214) & (~i1215);
                            int i1311 = i1215 << 1;
                            int i1312 = ((i1310 | i1311) << 1) - (i1310 ^ i1311);
                            int i1313 = (iIdentityHashCode3 & 772197988) | (772197988 ^ iIdentityHashCode3);
                            int i1314 = ~i1313;
                            int i1315 = (i1313 | i1314) & i1314;
                            int i1316 = (-1046933486) & i1315;
                            int i1317 = (i1315 | (-1046933486)) & (~i1316);
                            i15 = (-2) - ((i1312 - (~(((i1317 & i1316) | (i1317 ^ i1316)) * 658))) ^ (-1));
                            int iIdentityHashCode4 = System.identityHashCode(configbeepvolume6);
                            int i1318 = ~iIdentityHashCode4;
                            int i1319 = ((~i1318) & 1943425143) | (i1318 & (-1943425144));
                            int i1410 = 1943425143 & i1318;
                            int i1411 = ~((i1319 & i1410) | (i1319 ^ i1410));
                            int i1412 = (-397267179) & i1411;
                            int i1413 = -(-((((i1411 | (-397267179)) & (~i1412)) | i1412) * (-90)));
                            int i1414 = (((-297664458) ^ i1413) - (~((i1413 & (-297664458)) << 1))) - 1;
                            int i1415 = 1943425143 | iIdentityHashCode4;
                            int i1416 = ~i1415;
                            int i1417 = (i1415 | i1416) & i1416;
                            int i1418 = i1417 & 327438434;
                            int i1419 = (i1417 | 327438434) & (~i1418);
                            int i1510 = ((i1419 & i1418) | (i1419 ^ i1418)) * (-45);
                            i16 = ((((~i1510) & i1414) | ((~i1414) & i1510)) - (~(-(-((i1510 & i1414) << 1))))) - 1;
                            int i1511 = ~((iIdentityHashCode4 & 397267178) | (397267178 ^ iIdentityHashCode4));
                            int i1512 = ((~i1511) & 1943425143) | ((-1943425144) & i1511);
                            int i1513 = i1511 & 1943425143;
                            int i1514 = (i1513 & i1512) | (i1512 ^ i1513);
                            int i1515 = i1318 ^ (-397267179);
                            int i1516 = i1318 & (-397267179);
                            int i1517 = (i1516 & i1515) | (i1515 ^ i1516);
                            int i1518 = ~i1517;
                            int i1519 = (i1517 | i1518) & i1518;
                            int i166 = ((~i1519) & i1514) | ((~i1514) & i1519);
                            int i167 = i1514 & i1519;
                            i17 = -(-(((i167 & i166) | (i166 ^ i167)) * 45));
                            i18 = i16 ^ i17;
                            if (i15 <= ((((i17 & i16) | i18) << 1) - (~(-i18))) - 1) {
                                boolValueOf = Boolean.FALSE;
                            } else {
                                int i168 = 23 / 0;
                                boolValueOf = Boolean.FALSE;
                            }
                        } else if (((Boolean) setX(new Object[]{configbeepvolume6, getbeeponfailure9}, 149991031, -149991019, System.identityHashCode(configbeepvolume6))).booleanValue()) {
                            int i169 = f54986g + 25;
                            f54985f = i169 % 128;
                            int i170 = i169 % 2;
                            boolValueOf = Boolean.TRUE;
                        } else {
                            int i171 = f54985f;
                            int i172 = i171 ^ 13;
                            int i173 = ((i171 & 13) | i172) << 1;
                            int i174 = -i172;
                            int i175 = ((i173 | i174) << 1) - (i173 ^ i174);
                            f54986g = i175 % 128;
                            boolValueOf = Boolean.valueOf(i175 % 2 == 0);
                        }
                    } else if (!((Boolean) getEnterButtonIconDrawableId.setX(new Object[]{getbeeponfailure9, terminal, list}, 1151046421, -1151046420, (int) System.currentTimeMillis())).booleanValue()) {
                        int iIdentityHashCode5 = System.identityHashCode(configbeepvolume6);
                        int i1216 = ~(772197988 | iIdentityHashCode5);
                        int i1217 = ((~i1216) & (-275146670)) | (275146669 & i1216);
                        int i1218 = i1216 & (-275146670);
                        int i1219 = ((i1218 & i1217) | (i1217 ^ i1218)) * (-658);
                        int i12110 = (((-1852241194) | i1219) << 1) - (i1219 ^ (-1852241194));
                        int i12111 = i12110 & (-1687466428);
                        int i13110 = ((-1687466428) | i12110) & (~i12111);
                        int i13111 = i12111 << 1;
                        int i13112 = ((i13110 | i13111) << 1) - (i13110 ^ i13111);
                        int i13113 = (iIdentityHashCode5 & 772197988) | (772197988 ^ iIdentityHashCode5);
                        int i13114 = ~i13113;
                        int i13115 = (i13113 | i13114) & i13114;
                        int i13116 = (-1046933486) & i13115;
                        int i13117 = (i13115 | (-1046933486)) & (~i13116);
                        i15 = (-2) - ((i13112 - (~(((i13117 & i13116) | (i13117 ^ i13116)) * 658))) ^ (-1));
                        int iIdentityHashCode6 = System.identityHashCode(configbeepvolume6);
                        int i13118 = ~iIdentityHashCode6;
                        int i13119 = ((~i13118) & 1943425143) | (i13118 & (-1943425144));
                        int i14110 = 1943425143 & i13118;
                        int i14111 = ~((i13119 & i14110) | (i13119 ^ i14110));
                        int i14112 = (-397267179) & i14111;
                        int i14113 = -(-((((i14111 | (-397267179)) & (~i14112)) | i14112) * (-90)));
                        int i14114 = (((-297664458) ^ i14113) - (~((i14113 & (-297664458)) << 1))) - 1;
                        int i14115 = 1943425143 | iIdentityHashCode6;
                        int i14116 = ~i14115;
                        int i14117 = (i14115 | i14116) & i14116;
                        int i14118 = i14117 & 327438434;
                        int i14119 = (i14117 | 327438434) & (~i14118);
                        int i15110 = ((i14119 & i14118) | (i14119 ^ i14118)) * (-45);
                        i16 = ((((~i15110) & i14114) | ((~i14114) & i15110)) - (~(-(-((i15110 & i14114) << 1))))) - 1;
                        int i15111 = ~((iIdentityHashCode6 & 397267178) | (397267178 ^ iIdentityHashCode6));
                        int i15112 = ((~i15111) & 1943425143) | ((-1943425144) & i15111);
                        int i15113 = i15111 & 1943425143;
                        int i15114 = (i15113 & i15112) | (i15112 ^ i15113);
                        int i15115 = i13118 ^ (-397267179);
                        int i15116 = i13118 & (-397267179);
                        int i15117 = (i15116 & i15115) | (i15115 ^ i15116);
                        int i15118 = ~i15117;
                        int i15119 = (i15117 | i15118) & i15118;
                        int i1610 = ((~i15119) & i15114) | ((~i15114) & i15119);
                        int i1611 = i15114 & i15119;
                        i17 = -(-(((i1611 & i1610) | (i1610 ^ i1611)) * 45));
                        i18 = i16 ^ i17;
                        if (i15 <= ((((i17 & i16) | i18) << 1) - (~(-i18))) - 1) {
                            boolValueOf = Boolean.FALSE;
                        } else {
                            int i1612 = 23 / 0;
                            boolValueOf = Boolean.FALSE;
                        }
                    } else if (((Boolean) setX(new Object[]{configbeepvolume6, getbeeponfailure9}, 149991031, -149991019, System.identityHashCode(configbeepvolume6))).booleanValue()) {
                        int i176 = f54985f;
                        int i177 = i176 ^ 13;
                        int i178 = ((i176 & 13) | i177) << 1;
                        int i179 = -i177;
                        int i1710 = ((i178 | i179) << 1) - (i178 ^ i179);
                        f54986g = i1710 % 128;
                        boolValueOf = Boolean.valueOf(i1710 % 2 == 0);
                    } else {
                        int i1613 = f54986g + 25;
                        f54985f = i1613 % 128;
                        int i1711 = i1613 % 2;
                        boolValueOf = Boolean.TRUE;
                    }
                }
                break;
            case 12:
                configBeepVolume configbeepvolume7 = (configBeepVolume) objArr[0];
                getBeepOnFailure getbeeponfailure10 = (getBeepOnFailure) objArr[1];
                int i180 = f54985f + 51;
                f54986g = i180 % 128;
                int i181 = i180 % 2;
                setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure10}, 865402441, -865402437, System.identityHashCode(getbeeponfailure10));
                String str4 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4));
                TransactionFailed transactionFailedCardScheme = setAnimation.CardScheme();
                boolean zAreEqual2 = Intrinsics.areEqual(str4, (String) TransactionFailed.setX(new Object[]{transactionFailedCardScheme}, 1914607362, -1914607356, System.identityHashCode(transactionFailedCardScheme)));
                setScrollContainer setscrollcontainer5 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure10}, 865402441, -865402437, System.identityHashCode(getbeeponfailure10));
                String str5 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer5}, -888877733, 888877739, System.identityHashCode(setscrollcontainer5));
                List list2 = (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure10}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure10));
                if (!(list2 instanceof Collection)) {
                    it = list2.iterator();
                    int i182 = f54985f;
                    int i183 = ((i182 & (-4)) | ((~i182) & 3)) + ((i182 & 3) << 1);
                    f54986g = i183 % 128;
                    int i184 = i183 % 2;
                    while (true) {
                        if (!it.hasNext()) {
                            int i185 = f54985f;
                            i22 = (i185 & 117) + (i185 | 117);
                            f54986g = i22 % 128;
                            if (i22 % 2 == 0) {
                                int i186 = 80 / 0;
                            }
                            boolValueOf = Boolean.TRUE;
                        } else {
                            int i187 = f54985f;
                            int i188 = i187 & 85;
                            int i189 = (i187 ^ 85) | i188;
                            int i190 = (i188 & i189) + (i189 | i188);
                            f54986g = i190 % 128;
                            int i191 = i190 % 2;
                            getbeeponfailure3 = (getBeepOnFailure) it.next();
                            setScrollContainer setscrollcontainer6 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, i28, System.identityHashCode(getbeeponfailure3));
                            str = f54983d.get((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer6}, i27, i26, System.identityHashCode(setscrollcontainer6)));
                            if (str == null) {
                                i21 = (-2) - ((f54986g + 10) ^ (-1));
                                f54985f = i21 % 128;
                                if (i21 % 2 == 0) {
                                    z10 = true;
                                }
                                if (zAreEqual2) {
                                    int i192 = f54985f;
                                    int i193 = ((i192 ^ 64) + ((i192 & 64) << 1)) - 1;
                                    f54986g = i193 % 128;
                                    int i194 = i193 % 2;
                                    z11 = true;
                                } else {
                                    int i195 = f54986g;
                                    int i196 = ((i195 ^ 6) + ((i195 & i29) << 1)) - 1;
                                    f54985f = i196 % 128;
                                    int i197 = i196 % 2;
                                    setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                                    setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, i28, System.identityHashCode(getbeeponfailure3));
                                    if (!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, i27, i26, System.identityHashCode(setscrollcontainer)), Terminal.KERNEL_2}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue()) {
                                        int i198 = f54985f;
                                        int i199 = ((i198 ^ 64) + ((i198 & 64) << 1)) - 1;
                                        f54986g = i199 % 128;
                                        int i1910 = i199 % 2;
                                        z11 = true;
                                    } else {
                                        int i200 = f54985f;
                                        int i201 = (i200 ^ 126) + ((i200 & 126) << 1);
                                        int i202 = (i201 ^ (-1)) + (i201 << 1);
                                        f54986g = i202 % 128;
                                        int i203 = i202 % 2;
                                        z11 = false;
                                    }
                                }
                                zAreEqual = Intrinsics.areEqual(str5, str);
                                if (z10) {
                                    int i204 = f54985f;
                                    int i205 = (i204 | 75) << 1;
                                    int i206 = -(((~i204) & 75) | (i204 & (-76)));
                                    i20 = (i205 ^ i206) + ((i206 & i205) << 1);
                                    f54986g = i20 % 128;
                                    if (i20 % 2 == 0) {
                                        if (!z11) {
                                            if (zAreEqual) {
                                            }
                                        }
                                        int i207 = f54986g;
                                        int i208 = i207 | 27;
                                        int i209 = ((i208 << 1) - (~(-((~(i207 & 27)) & i208)))) - 1;
                                        f54985f = i209 % 128;
                                        int i210 = i209 % 2;
                                        boolValueOf = Boolean.FALSE;
                                    } else {
                                        int i211 = 70 / 0;
                                        if (!z11) {
                                            if (zAreEqual) {
                                            }
                                        }
                                        int i2010 = f54986g;
                                        int i2011 = i2010 | 27;
                                        int i2012 = ((i2011 << 1) - (~(-((~(i2010 & 27)) & i2011)))) - 1;
                                        f54985f = i2012 % 128;
                                        int i212 = i2012 % 2;
                                        boolValueOf = Boolean.FALSE;
                                    }
                                    if (!(!((Boolean) setX(new Object[]{configbeepvolume7, getbeeponfailure3}, 149991031, -149991019, System.identityHashCode(configbeepvolume7))).booleanValue())) {
                                        int i213 = f54985f;
                                        i19 = ((i213 | 21) << 1) - (i213 ^ 21);
                                        f54986g = i19 % 128;
                                        if (i19 % 2 == 0) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (!z12) {
                                            i26 = 888877739;
                                            i27 = -888877733;
                                            i28 = -865402437;
                                            i29 = 6;
                                        }
                                    }
                                    int i2013 = f54986g;
                                    int i2014 = i2013 | 27;
                                    int i2015 = ((i2014 << 1) - (~(-((~(i2013 & 27)) & i2014)))) - 1;
                                    f54985f = i2015 % 128;
                                    int i214 = i2015 % 2;
                                    boolValueOf = Boolean.FALSE;
                                    break;
                                } else if (zAreEqual) {
                                    if (!(!((Boolean) setX(new Object[]{configbeepvolume7, getbeeponfailure3}, 149991031, -149991019, System.identityHashCode(configbeepvolume7))).booleanValue())) {
                                        int i215 = f54985f;
                                        i19 = ((i215 | 21) << 1) - (i215 ^ 21);
                                        f54986g = i19 % 128;
                                        if (i19 % 2 == 0) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (!z12) {
                                            i26 = 888877739;
                                            i27 = -888877733;
                                            i28 = -865402437;
                                            i29 = 6;
                                        }
                                    }
                                    int i2016 = f54986g;
                                    int i2017 = i2016 | 27;
                                    int i2018 = ((i2017 << 1) - (~(-((~(i2016 & 27)) & i2017)))) - 1;
                                    f54985f = i2018 % 128;
                                    int i216 = i2018 % 2;
                                    boolValueOf = Boolean.FALSE;
                                    break;
                                }
                                int i217 = f54986g;
                                int i218 = i217 ^ 59;
                                int i219 = (((i217 & 59) | i218) << 1) - i218;
                                f54985f = i219 % 128;
                                int i220 = i219 % 2;
                                int i2019 = f54986g;
                                int i20110 = i2019 | 27;
                                int i20111 = ((i20110 << 1) - (~(-((~(i2019 & 27)) & i20110)))) - 1;
                                f54985f = i20111 % 128;
                                int i2110 = i20111 % 2;
                                boolValueOf = Boolean.FALSE;
                            } else {
                                int i221 = f54986g + 43;
                                f54985f = i221 % 128;
                                int i222 = i221 % 2;
                            }
                            z10 = false;
                            if (zAreEqual2) {
                                int i1911 = f54986g;
                                int i1912 = ((i1911 ^ 6) + ((i1911 & i29) << 1)) - 1;
                                f54985f = i1912 % 128;
                                int i1913 = i1912 % 2;
                                setOnGenericMotionListener setongenericmotionlistener2 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                                setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, i28, System.identityHashCode(getbeeponfailure3));
                                if (!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, i27, i26, System.identityHashCode(setscrollcontainer)), Terminal.KERNEL_2}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue()) {
                                    int i1914 = f54985f;
                                    int i1915 = ((i1914 ^ 64) + ((i1914 & 64) << 1)) - 1;
                                    f54986g = i1915 % 128;
                                    int i1916 = i1915 % 2;
                                    z11 = true;
                                } else {
                                    int i2020 = f54985f;
                                    int i2021 = (i2020 ^ 126) + ((i2020 & 126) << 1);
                                    int i2022 = (i2021 ^ (-1)) + (i2021 << 1);
                                    f54986g = i2022 % 128;
                                    int i2023 = i2022 % 2;
                                    z11 = false;
                                }
                            } else {
                                int i1917 = f54985f;
                                int i1918 = ((i1917 ^ 64) + ((i1917 & 64) << 1)) - 1;
                                f54986g = i1918 % 128;
                                int i1919 = i1918 % 2;
                                z11 = true;
                            }
                            zAreEqual = Intrinsics.areEqual(str5, str);
                            if (z10) {
                                int i2024 = f54985f;
                                int i2025 = (i2024 | 75) << 1;
                                int i2026 = -(((~i2024) & 75) | (i2024 & (-76)));
                                i20 = (i2025 ^ i2026) + ((i2026 & i2025) << 1);
                                f54986g = i20 % 128;
                                if (i20 % 2 == 0) {
                                    if (!z11) {
                                        if (zAreEqual) {
                                        }
                                    }
                                    int i20112 = f54986g;
                                    int i20113 = i20112 | 27;
                                    int i20114 = ((i20113 << 1) - (~(-((~(i20112 & 27)) & i20113)))) - 1;
                                    f54985f = i20114 % 128;
                                    int i2111 = i20114 % 2;
                                    boolValueOf = Boolean.FALSE;
                                } else {
                                    int i2112 = 70 / 0;
                                    if (!z11) {
                                        if (zAreEqual) {
                                        }
                                    }
                                    int i20115 = f54986g;
                                    int i20116 = i20115 | 27;
                                    int i20117 = ((i20116 << 1) - (~(-((~(i20115 & 27)) & i20116)))) - 1;
                                    f54985f = i20117 % 128;
                                    int i2113 = i20117 % 2;
                                    boolValueOf = Boolean.FALSE;
                                }
                                if (!(!((Boolean) setX(new Object[]{configbeepvolume7, getbeeponfailure3}, 149991031, -149991019, System.identityHashCode(configbeepvolume7))).booleanValue())) {
                                    int i2114 = f54985f;
                                    i19 = ((i2114 | 21) << 1) - (i2114 ^ 21);
                                    f54986g = i19 % 128;
                                    if (i19 % 2 == 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (!z12) {
                                        i26 = 888877739;
                                        i27 = -888877733;
                                        i28 = -865402437;
                                        i29 = 6;
                                    }
                                }
                                int i20118 = f54986g;
                                int i20119 = i20118 | 27;
                                int i201110 = ((i20119 << 1) - (~(-((~(i20118 & 27)) & i20119)))) - 1;
                                f54985f = i201110 % 128;
                                int i2115 = i201110 % 2;
                                boolValueOf = Boolean.FALSE;
                                break;
                            } else if (zAreEqual) {
                                if (!(!((Boolean) setX(new Object[]{configbeepvolume7, getbeeponfailure3}, 149991031, -149991019, System.identityHashCode(configbeepvolume7))).booleanValue())) {
                                    int i2116 = f54985f;
                                    i19 = ((i2116 | 21) << 1) - (i2116 ^ 21);
                                    f54986g = i19 % 128;
                                    if (i19 % 2 == 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (!z12) {
                                        i26 = 888877739;
                                        i27 = -888877733;
                                        i28 = -865402437;
                                        i29 = 6;
                                    }
                                }
                                int i201111 = f54986g;
                                int i201112 = i201111 | 27;
                                int i201113 = ((i201112 << 1) - (~(-((~(i201111 & 27)) & i201112)))) - 1;
                                f54985f = i201113 % 128;
                                int i2117 = i201113 % 2;
                                boolValueOf = Boolean.FALSE;
                                break;
                            }
                            int i2118 = f54986g;
                            int i2119 = i2118 ^ 59;
                            int i2120 = (((i2118 & 59) | i2119) << 1) - i2119;
                            f54985f = i2120 % 128;
                            int i223 = i2120 % 2;
                            int i201114 = f54986g;
                            int i201115 = i201114 | 27;
                            int i201116 = ((i201115 << 1) - (~(-((~(i201114 & 27)) & i201115)))) - 1;
                            f54985f = i201116 % 128;
                            int i21110 = i201116 % 2;
                            boolValueOf = Boolean.FALSE;
                        }
                    }
                } else {
                    int i224 = f54986g;
                    int i225 = i224 & 123;
                    int i226 = (i224 | 123) & (~i225);
                    int i227 = i225 << 1;
                    int i228 = (i226 ^ i227) + ((i226 & i227) << 1);
                    f54985f = i228 % 128;
                    if (i228 % 2 != 0) {
                        int i229 = 45 / 0;
                        if (!list2.isEmpty()) {
                            it = list2.iterator();
                            int i1810 = f54985f;
                            int i1811 = ((i1810 & (-4)) | ((~i1810) & 3)) + ((i1810 & 3) << 1);
                            f54986g = i1811 % 128;
                            int i1812 = i1811 % 2;
                            while (true) {
                                if (!it.hasNext()) {
                                    int i1813 = f54985f;
                                    int i1814 = i1813 & 85;
                                    int i1815 = (i1813 ^ 85) | i1814;
                                    int i1920 = (i1814 & i1815) + (i1815 | i1814);
                                    f54986g = i1920 % 128;
                                    int i1921 = i1920 % 2;
                                    getbeeponfailure3 = (getBeepOnFailure) it.next();
                                    setScrollContainer setscrollcontainer7 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, i28, System.identityHashCode(getbeeponfailure3));
                                    str = f54983d.get((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer7}, i27, i26, System.identityHashCode(setscrollcontainer7)));
                                    if (str == null) {
                                        i21 = (-2) - ((f54986g + 10) ^ (-1));
                                        f54985f = i21 % 128;
                                        if (i21 % 2 == 0) {
                                            z10 = true;
                                        }
                                        if (zAreEqual2) {
                                            int i19110 = f54986g;
                                            int i19111 = ((i19110 ^ 6) + ((i19110 & i29) << 1)) - 1;
                                            f54985f = i19111 % 128;
                                            int i19112 = i19111 % 2;
                                            setOnGenericMotionListener setongenericmotionlistener3 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                                            setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, i28, System.identityHashCode(getbeeponfailure3));
                                            if (!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, i27, i26, System.identityHashCode(setscrollcontainer)), Terminal.KERNEL_2}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue()) {
                                                int i19113 = f54985f;
                                                int i19114 = ((i19113 ^ 64) + ((i19113 & 64) << 1)) - 1;
                                                f54986g = i19114 % 128;
                                                int i19115 = i19114 % 2;
                                                z11 = true;
                                            } else {
                                                int i2027 = f54985f;
                                                int i2028 = (i2027 ^ 126) + ((i2027 & 126) << 1);
                                                int i2029 = (i2028 ^ (-1)) + (i2028 << 1);
                                                f54986g = i2029 % 128;
                                                int i20210 = i2029 % 2;
                                                z11 = false;
                                            }
                                        } else {
                                            int i19116 = f54985f;
                                            int i19117 = ((i19116 ^ 64) + ((i19116 & 64) << 1)) - 1;
                                            f54986g = i19117 % 128;
                                            int i19118 = i19117 % 2;
                                            z11 = true;
                                        }
                                        zAreEqual = Intrinsics.areEqual(str5, str);
                                        if (z10) {
                                            int i20211 = f54985f;
                                            int i20212 = (i20211 | 75) << 1;
                                            int i20213 = -(((~i20211) & 75) | (i20211 & (-76)));
                                            i20 = (i20212 ^ i20213) + ((i20213 & i20212) << 1);
                                            f54986g = i20 % 128;
                                            if (i20 % 2 == 0) {
                                                if (!z11) {
                                                    if (zAreEqual) {
                                                    }
                                                }
                                                int i201117 = f54986g;
                                                int i201118 = i201117 | 27;
                                                int i201119 = ((i201118 << 1) - (~(-((~(i201117 & 27)) & i201118)))) - 1;
                                                f54985f = i201119 % 128;
                                                int i21111 = i201119 % 2;
                                                boolValueOf = Boolean.FALSE;
                                            } else {
                                                int i21112 = 70 / 0;
                                                if (!z11) {
                                                    if (zAreEqual) {
                                                    }
                                                }
                                                int i2011110 = f54986g;
                                                int i2011111 = i2011110 | 27;
                                                int i2011112 = ((i2011111 << 1) - (~(-((~(i2011110 & 27)) & i2011111)))) - 1;
                                                f54985f = i2011112 % 128;
                                                int i21113 = i2011112 % 2;
                                                boolValueOf = Boolean.FALSE;
                                            }
                                            if (!(!((Boolean) setX(new Object[]{configbeepvolume7, getbeeponfailure3}, 149991031, -149991019, System.identityHashCode(configbeepvolume7))).booleanValue())) {
                                                int i21114 = f54985f;
                                                i19 = ((i21114 | 21) << 1) - (i21114 ^ 21);
                                                f54986g = i19 % 128;
                                                if (i19 % 2 == 0) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if (!z12) {
                                                    i26 = 888877739;
                                                    i27 = -888877733;
                                                    i28 = -865402437;
                                                    i29 = 6;
                                                }
                                            }
                                            int i2011113 = f54986g;
                                            int i2011114 = i2011113 | 27;
                                            int i2011115 = ((i2011114 << 1) - (~(-((~(i2011113 & 27)) & i2011114)))) - 1;
                                            f54985f = i2011115 % 128;
                                            int i21115 = i2011115 % 2;
                                            boolValueOf = Boolean.FALSE;
                                            break;
                                        } else if (zAreEqual) {
                                            if (!(!((Boolean) setX(new Object[]{configbeepvolume7, getbeeponfailure3}, 149991031, -149991019, System.identityHashCode(configbeepvolume7))).booleanValue())) {
                                                int i21116 = f54985f;
                                                i19 = ((i21116 | 21) << 1) - (i21116 ^ 21);
                                                f54986g = i19 % 128;
                                                if (i19 % 2 == 0) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if (!z12) {
                                                    i26 = 888877739;
                                                    i27 = -888877733;
                                                    i28 = -865402437;
                                                    i29 = 6;
                                                }
                                            }
                                            int i2011116 = f54986g;
                                            int i2011117 = i2011116 | 27;
                                            int i2011118 = ((i2011117 << 1) - (~(-((~(i2011116 & 27)) & i2011117)))) - 1;
                                            f54985f = i2011118 % 128;
                                            int i21117 = i2011118 % 2;
                                            boolValueOf = Boolean.FALSE;
                                            break;
                                        }
                                        int i21118 = f54986g;
                                        int i21119 = i21118 ^ 59;
                                        int i2121 = (((i21118 & 59) | i21119) << 1) - i21119;
                                        f54985f = i2121 % 128;
                                        int i2210 = i2121 % 2;
                                        int i2011119 = f54986g;
                                        int i20111110 = i2011119 | 27;
                                        int i20111111 = ((i20111110 << 1) - (~(-((~(i2011119 & 27)) & i20111110)))) - 1;
                                        f54985f = i20111111 % 128;
                                        int i211110 = i20111111 % 2;
                                        boolValueOf = Boolean.FALSE;
                                    } else {
                                        int i2211 = f54986g + 43;
                                        f54985f = i2211 % 128;
                                        int i2212 = i2211 % 2;
                                    }
                                    z10 = false;
                                    if (zAreEqual2) {
                                        int i19119 = f54986g;
                                        int i191110 = ((i19119 ^ 6) + ((i19119 & i29) << 1)) - 1;
                                        f54985f = i191110 % 128;
                                        int i191111 = i191110 % 2;
                                        setOnGenericMotionListener setongenericmotionlistener4 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                                        setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, i28, System.identityHashCode(getbeeponfailure3));
                                        if (!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, i27, i26, System.identityHashCode(setscrollcontainer)), Terminal.KERNEL_2}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue()) {
                                            int i191112 = f54985f;
                                            int i191113 = ((i191112 ^ 64) + ((i191112 & 64) << 1)) - 1;
                                            f54986g = i191113 % 128;
                                            int i191114 = i191113 % 2;
                                            z11 = true;
                                        } else {
                                            int i20214 = f54985f;
                                            int i20215 = (i20214 ^ 126) + ((i20214 & 126) << 1);
                                            int i20216 = (i20215 ^ (-1)) + (i20215 << 1);
                                            f54986g = i20216 % 128;
                                            int i20217 = i20216 % 2;
                                            z11 = false;
                                        }
                                    } else {
                                        int i191115 = f54985f;
                                        int i191116 = ((i191115 ^ 64) + ((i191115 & 64) << 1)) - 1;
                                        f54986g = i191116 % 128;
                                        int i191117 = i191116 % 2;
                                        z11 = true;
                                    }
                                    zAreEqual = Intrinsics.areEqual(str5, str);
                                    if (z10) {
                                        int i20218 = f54985f;
                                        int i20219 = (i20218 | 75) << 1;
                                        int i202110 = -(((~i20218) & 75) | (i20218 & (-76)));
                                        i20 = (i20219 ^ i202110) + ((i202110 & i20219) << 1);
                                        f54986g = i20 % 128;
                                        if (i20 % 2 == 0) {
                                            if (!z11) {
                                                if (zAreEqual) {
                                                }
                                            }
                                            int i20111112 = f54986g;
                                            int i20111113 = i20111112 | 27;
                                            int i20111114 = ((i20111113 << 1) - (~(-((~(i20111112 & 27)) & i20111113)))) - 1;
                                            f54985f = i20111114 % 128;
                                            int i211111 = i20111114 % 2;
                                            boolValueOf = Boolean.FALSE;
                                        } else {
                                            int i211112 = 70 / 0;
                                            if (!z11) {
                                                if (zAreEqual) {
                                                }
                                            }
                                            int i20111115 = f54986g;
                                            int i20111116 = i20111115 | 27;
                                            int i20111117 = ((i20111116 << 1) - (~(-((~(i20111115 & 27)) & i20111116)))) - 1;
                                            f54985f = i20111117 % 128;
                                            int i211113 = i20111117 % 2;
                                            boolValueOf = Boolean.FALSE;
                                        }
                                        if (!(!((Boolean) setX(new Object[]{configbeepvolume7, getbeeponfailure3}, 149991031, -149991019, System.identityHashCode(configbeepvolume7))).booleanValue())) {
                                            int i211114 = f54985f;
                                            i19 = ((i211114 | 21) << 1) - (i211114 ^ 21);
                                            f54986g = i19 % 128;
                                            if (i19 % 2 == 0) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (!z12) {
                                                i26 = 888877739;
                                                i27 = -888877733;
                                                i28 = -865402437;
                                                i29 = 6;
                                            }
                                        }
                                        int i20111118 = f54986g;
                                        int i20111119 = i20111118 | 27;
                                        int i201111110 = ((i20111119 << 1) - (~(-((~(i20111118 & 27)) & i20111119)))) - 1;
                                        f54985f = i201111110 % 128;
                                        int i211115 = i201111110 % 2;
                                        boolValueOf = Boolean.FALSE;
                                        break;
                                    } else if (zAreEqual) {
                                        if (!(!((Boolean) setX(new Object[]{configbeepvolume7, getbeeponfailure3}, 149991031, -149991019, System.identityHashCode(configbeepvolume7))).booleanValue())) {
                                            int i211116 = f54985f;
                                            i19 = ((i211116 | 21) << 1) - (i211116 ^ 21);
                                            f54986g = i19 % 128;
                                            if (i19 % 2 == 0) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (!z12) {
                                                i26 = 888877739;
                                                i27 = -888877733;
                                                i28 = -865402437;
                                                i29 = 6;
                                            }
                                        }
                                        int i201111111 = f54986g;
                                        int i201111112 = i201111111 | 27;
                                        int i201111113 = ((i201111112 << 1) - (~(-((~(i201111111 & 27)) & i201111112)))) - 1;
                                        f54985f = i201111113 % 128;
                                        int i211117 = i201111113 % 2;
                                        boolValueOf = Boolean.FALSE;
                                        break;
                                    }
                                    int i211118 = f54986g;
                                    int i211119 = i211118 ^ 59;
                                    int i2122 = (((i211118 & 59) | i211119) << 1) - i211119;
                                    f54985f = i2122 % 128;
                                    int i2213 = i2122 % 2;
                                    int i201111114 = f54986g;
                                    int i201111115 = i201111114 | 27;
                                    int i201111116 = ((i201111115 << 1) - (~(-((~(i201111114 & 27)) & i201111115)))) - 1;
                                    f54985f = i201111116 % 128;
                                    int i2111110 = i201111116 % 2;
                                    boolValueOf = Boolean.FALSE;
                                    break;
                                }
                            }
                        }
                    } else if (!list2.isEmpty()) {
                        it = list2.iterator();
                        int i1816 = f54985f;
                        int i1817 = ((i1816 & (-4)) | ((~i1816) & 3)) + ((i1816 & 3) << 1);
                        f54986g = i1817 % 128;
                        int i1818 = i1817 % 2;
                        while (true) {
                            if (!it.hasNext()) {
                                int i1819 = f54985f;
                                int i18110 = i1819 & 85;
                                int i18111 = (i1819 ^ 85) | i18110;
                                int i1922 = (i18110 & i18111) + (i18111 | i18110);
                                f54986g = i1922 % 128;
                                int i1923 = i1922 % 2;
                                getbeeponfailure3 = (getBeepOnFailure) it.next();
                                setScrollContainer setscrollcontainer8 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, i28, System.identityHashCode(getbeeponfailure3));
                                str = f54983d.get((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer8}, i27, i26, System.identityHashCode(setscrollcontainer8)));
                                if (str == null) {
                                    i21 = (-2) - ((f54986g + 10) ^ (-1));
                                    f54985f = i21 % 128;
                                    if (i21 % 2 == 0) {
                                        z10 = true;
                                    }
                                    if (zAreEqual2) {
                                        int i191118 = f54986g;
                                        int i191119 = ((i191118 ^ 6) + ((i191118 & i29) << 1)) - 1;
                                        f54985f = i191119 % 128;
                                        int i1911110 = i191119 % 2;
                                        setOnGenericMotionListener setongenericmotionlistener5 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                                        setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, i28, System.identityHashCode(getbeeponfailure3));
                                        if (!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, i27, i26, System.identityHashCode(setscrollcontainer)), Terminal.KERNEL_2}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue()) {
                                            int i1911111 = f54985f;
                                            int i1911112 = ((i1911111 ^ 64) + ((i1911111 & 64) << 1)) - 1;
                                            f54986g = i1911112 % 128;
                                            int i1911113 = i1911112 % 2;
                                            z11 = true;
                                        } else {
                                            int i202111 = f54985f;
                                            int i202112 = (i202111 ^ 126) + ((i202111 & 126) << 1);
                                            int i202113 = (i202112 ^ (-1)) + (i202112 << 1);
                                            f54986g = i202113 % 128;
                                            int i202114 = i202113 % 2;
                                            z11 = false;
                                        }
                                    } else {
                                        int i1911114 = f54985f;
                                        int i1911115 = ((i1911114 ^ 64) + ((i1911114 & 64) << 1)) - 1;
                                        f54986g = i1911115 % 128;
                                        int i1911116 = i1911115 % 2;
                                        z11 = true;
                                    }
                                    zAreEqual = Intrinsics.areEqual(str5, str);
                                    if (z10) {
                                        int i202115 = f54985f;
                                        int i202116 = (i202115 | 75) << 1;
                                        int i202117 = -(((~i202115) & 75) | (i202115 & (-76)));
                                        i20 = (i202116 ^ i202117) + ((i202117 & i202116) << 1);
                                        f54986g = i20 % 128;
                                        if (i20 % 2 == 0) {
                                            if (!z11) {
                                                if (zAreEqual) {
                                                }
                                            }
                                            int i201111117 = f54986g;
                                            int i201111118 = i201111117 | 27;
                                            int i201111119 = ((i201111118 << 1) - (~(-((~(i201111117 & 27)) & i201111118)))) - 1;
                                            f54985f = i201111119 % 128;
                                            int i2111111 = i201111119 % 2;
                                            boolValueOf = Boolean.FALSE;
                                        } else {
                                            int i2111112 = 70 / 0;
                                            if (!z11) {
                                                if (zAreEqual) {
                                                }
                                            }
                                            int i2011111110 = f54986g;
                                            int i2011111111 = i2011111110 | 27;
                                            int i2011111112 = ((i2011111111 << 1) - (~(-((~(i2011111110 & 27)) & i2011111111)))) - 1;
                                            f54985f = i2011111112 % 128;
                                            int i2111113 = i2011111112 % 2;
                                            boolValueOf = Boolean.FALSE;
                                        }
                                        if (!(!((Boolean) setX(new Object[]{configbeepvolume7, getbeeponfailure3}, 149991031, -149991019, System.identityHashCode(configbeepvolume7))).booleanValue())) {
                                            int i2111114 = f54985f;
                                            i19 = ((i2111114 | 21) << 1) - (i2111114 ^ 21);
                                            f54986g = i19 % 128;
                                            if (i19 % 2 == 0) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (!z12) {
                                                i26 = 888877739;
                                                i27 = -888877733;
                                                i28 = -865402437;
                                                i29 = 6;
                                            }
                                        }
                                        int i2011111113 = f54986g;
                                        int i2011111114 = i2011111113 | 27;
                                        int i2011111115 = ((i2011111114 << 1) - (~(-((~(i2011111113 & 27)) & i2011111114)))) - 1;
                                        f54985f = i2011111115 % 128;
                                        int i2111115 = i2011111115 % 2;
                                        boolValueOf = Boolean.FALSE;
                                        break;
                                    } else if (zAreEqual) {
                                        if (!(!((Boolean) setX(new Object[]{configbeepvolume7, getbeeponfailure3}, 149991031, -149991019, System.identityHashCode(configbeepvolume7))).booleanValue())) {
                                            int i2111116 = f54985f;
                                            i19 = ((i2111116 | 21) << 1) - (i2111116 ^ 21);
                                            f54986g = i19 % 128;
                                            if (i19 % 2 == 0) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (!z12) {
                                                i26 = 888877739;
                                                i27 = -888877733;
                                                i28 = -865402437;
                                                i29 = 6;
                                            }
                                        }
                                        int i2011111116 = f54986g;
                                        int i2011111117 = i2011111116 | 27;
                                        int i2011111118 = ((i2011111117 << 1) - (~(-((~(i2011111116 & 27)) & i2011111117)))) - 1;
                                        f54985f = i2011111118 % 128;
                                        int i2111117 = i2011111118 % 2;
                                        boolValueOf = Boolean.FALSE;
                                        break;
                                    }
                                    int i2111118 = f54986g;
                                    int i2111119 = i2111118 ^ 59;
                                    int i2123 = (((i2111118 & 59) | i2111119) << 1) - i2111119;
                                    f54985f = i2123 % 128;
                                    int i2214 = i2123 % 2;
                                    int i2011111119 = f54986g;
                                    int i20111111110 = i2011111119 | 27;
                                    int i20111111111 = ((i20111111110 << 1) - (~(-((~(i2011111119 & 27)) & i20111111110)))) - 1;
                                    f54985f = i20111111111 % 128;
                                    int i21111110 = i20111111111 % 2;
                                    boolValueOf = Boolean.FALSE;
                                } else {
                                    int i2215 = f54986g + 43;
                                    f54985f = i2215 % 128;
                                    int i2216 = i2215 % 2;
                                }
                                z10 = false;
                                if (zAreEqual2) {
                                    int i1911117 = f54986g;
                                    int i1911118 = ((i1911117 ^ 6) + ((i1911117 & i29) << 1)) - 1;
                                    f54985f = i1911118 % 128;
                                    int i1911119 = i1911118 % 2;
                                    setOnGenericMotionListener setongenericmotionlistener6 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                                    setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, i28, System.identityHashCode(getbeeponfailure3));
                                    if (!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, i27, i26, System.identityHashCode(setscrollcontainer)), Terminal.KERNEL_2}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue()) {
                                        int i19111110 = f54985f;
                                        int i19111111 = ((i19111110 ^ 64) + ((i19111110 & 64) << 1)) - 1;
                                        f54986g = i19111111 % 128;
                                        int i19111112 = i19111111 % 2;
                                        z11 = true;
                                    } else {
                                        int i202118 = f54985f;
                                        int i202119 = (i202118 ^ 126) + ((i202118 & 126) << 1);
                                        int i2021110 = (i202119 ^ (-1)) + (i202119 << 1);
                                        f54986g = i2021110 % 128;
                                        int i2021111 = i2021110 % 2;
                                        z11 = false;
                                    }
                                } else {
                                    int i19111113 = f54985f;
                                    int i19111114 = ((i19111113 ^ 64) + ((i19111113 & 64) << 1)) - 1;
                                    f54986g = i19111114 % 128;
                                    int i19111115 = i19111114 % 2;
                                    z11 = true;
                                }
                                zAreEqual = Intrinsics.areEqual(str5, str);
                                if (z10) {
                                    int i2021112 = f54985f;
                                    int i2021113 = (i2021112 | 75) << 1;
                                    int i2021114 = -(((~i2021112) & 75) | (i2021112 & (-76)));
                                    i20 = (i2021113 ^ i2021114) + ((i2021114 & i2021113) << 1);
                                    f54986g = i20 % 128;
                                    if (i20 % 2 == 0) {
                                        if (!z11) {
                                            if (zAreEqual) {
                                            }
                                        }
                                        int i20111111112 = f54986g;
                                        int i20111111113 = i20111111112 | 27;
                                        int i20111111114 = ((i20111111113 << 1) - (~(-((~(i20111111112 & 27)) & i20111111113)))) - 1;
                                        f54985f = i20111111114 % 128;
                                        int i21111111 = i20111111114 % 2;
                                        boolValueOf = Boolean.FALSE;
                                    } else {
                                        int i21111112 = 70 / 0;
                                        if (!z11) {
                                            if (zAreEqual) {
                                            }
                                        }
                                        int i20111111115 = f54986g;
                                        int i20111111116 = i20111111115 | 27;
                                        int i20111111117 = ((i20111111116 << 1) - (~(-((~(i20111111115 & 27)) & i20111111116)))) - 1;
                                        f54985f = i20111111117 % 128;
                                        int i21111113 = i20111111117 % 2;
                                        boolValueOf = Boolean.FALSE;
                                    }
                                    if (!(!((Boolean) setX(new Object[]{configbeepvolume7, getbeeponfailure3}, 149991031, -149991019, System.identityHashCode(configbeepvolume7))).booleanValue())) {
                                        int i21111114 = f54985f;
                                        i19 = ((i21111114 | 21) << 1) - (i21111114 ^ 21);
                                        f54986g = i19 % 128;
                                        if (i19 % 2 == 0) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (!z12) {
                                            i26 = 888877739;
                                            i27 = -888877733;
                                            i28 = -865402437;
                                            i29 = 6;
                                        }
                                    }
                                    int i20111111118 = f54986g;
                                    int i20111111119 = i20111111118 | 27;
                                    int i201111111110 = ((i20111111119 << 1) - (~(-((~(i20111111118 & 27)) & i20111111119)))) - 1;
                                    f54985f = i201111111110 % 128;
                                    int i21111115 = i201111111110 % 2;
                                    boolValueOf = Boolean.FALSE;
                                    break;
                                } else if (zAreEqual) {
                                    if (!(!((Boolean) setX(new Object[]{configbeepvolume7, getbeeponfailure3}, 149991031, -149991019, System.identityHashCode(configbeepvolume7))).booleanValue())) {
                                        int i21111116 = f54985f;
                                        i19 = ((i21111116 | 21) << 1) - (i21111116 ^ 21);
                                        f54986g = i19 % 128;
                                        if (i19 % 2 == 0) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (!z12) {
                                            i26 = 888877739;
                                            i27 = -888877733;
                                            i28 = -865402437;
                                            i29 = 6;
                                        }
                                    }
                                    int i201111111111 = f54986g;
                                    int i201111111112 = i201111111111 | 27;
                                    int i201111111113 = ((i201111111112 << 1) - (~(-((~(i201111111111 & 27)) & i201111111112)))) - 1;
                                    f54985f = i201111111113 % 128;
                                    int i21111117 = i201111111113 % 2;
                                    boolValueOf = Boolean.FALSE;
                                    break;
                                }
                                int i21111118 = f54986g;
                                int i21111119 = i21111118 ^ 59;
                                int i2124 = (((i21111118 & 59) | i21111119) << 1) - i21111119;
                                f54985f = i2124 % 128;
                                int i2217 = i2124 % 2;
                                int i201111111114 = f54986g;
                                int i201111111115 = i201111111114 | 27;
                                int i201111111116 = ((i201111111115 << 1) - (~(-((~(i201111111114 & 27)) & i201111111115)))) - 1;
                                f54985f = i201111111116 % 128;
                                int i211111110 = i201111111116 % 2;
                                boolValueOf = Boolean.FALSE;
                                break;
                            }
                        }
                    }
                    int i1820 = f54985f;
                    i22 = (i1820 & 117) + (i1820 | 117);
                    f54986g = i22 % 128;
                    if (i22 % 2 == 0) {
                        int i1821 = 80 / 0;
                    }
                    boolValueOf = Boolean.TRUE;
                }
                break;
            default:
                setScreenReaderFocusable setscreenreaderfocusable2 = (setScreenReaderFocusable) objArr[0];
                int i230 = (-2) - ((f54985f + 8) ^ (-1));
                f54986g = i230 % 128;
                if (i230 % 2 == 0) {
                    ((Boolean) setX(new Object[]{setscreenreaderfocusable2}, -1762800330, 1762800340, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                boolean zBooleanValue2 = ((Boolean) setX(new Object[]{setscreenreaderfocusable2}, -1762800330, 1762800340, (int) System.currentTimeMillis())).booleanValue();
                int i231 = f54986g;
                int i232 = i231 & 91;
                int i233 = (i231 | 91) & (~i232);
                int i234 = i232 << 1;
                int i235 = (i233 ^ i234) + ((i233 & i234) << 1);
                f54985f = i235 % 128;
                int i236 = i235 % 2;
                return Boolean.valueOf(zBooleanValue2);
        }
        return boolValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.setNextFocusForwardId
    @Nullable
    public final Object setY(@NotNull setPictureListener setpicturelistener, @Nullable getBeepOnFailure getbeeponfailure, @Nullable getBeepOnFailure getbeeponfailure2, @NotNull values valuesVar, @NotNull Continuation<? super setScreenReaderFocusable> continuation) {
        return setX(new Object[]{this, setpicturelistener, getbeeponfailure, getbeeponfailure2, valuesVar, continuation}, -1128952360, 1128952365, System.identityHashCode(this));
    }
}
