package com.mypinpad.tsdk.isolation;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setTranslationZ {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60797f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60798g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ReceiveChannel<setSystemGestureExclusionRects> f60799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final component20 f60800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final setCompoundDrawableTintList f60801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayList f60802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f60803e;

    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f60804s0 = 0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f60805t0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public List f60806p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f60807q0;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0171  */
        /* JADX WARN: Code duplicated, block: B:47:0x0196 A[Catch: component22 -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {component22 -> 0x007d, blocks: (B:10:0x005f, B:23:0x00ed, B:28:0x00ff, B:30:0x0105, B:32:0x0119, B:33:0x011a, B:35:0x011e, B:41:0x0143, B:43:0x014f, B:59:0x0239, B:62:0x024a, B:65:0x028a, B:17:0x009d, B:47:0x0196, B:50:0x01bb, B:52:0x01d9, B:55:0x0211), top: B:77:0x005f }] */
        /* JADX WARN: Code duplicated, block: B:49:0x01a0  */
        /* JADX WARN: Code duplicated, block: B:50:0x01bb A[Catch: component22 -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {component22 -> 0x007d, blocks: (B:10:0x005f, B:23:0x00ed, B:28:0x00ff, B:30:0x0105, B:32:0x0119, B:33:0x011a, B:35:0x011e, B:41:0x0143, B:43:0x014f, B:59:0x0239, B:62:0x024a, B:65:0x028a, B:17:0x009d, B:47:0x0196, B:50:0x01bb, B:52:0x01d9, B:55:0x0211), top: B:77:0x005f }] */
        /* JADX WARN: Code duplicated, block: B:54:0x01f4  */
        /* JADX WARN: Code duplicated, block: B:61:0x023d  */
        /* JADX WARN: Code duplicated, block: B:64:0x0277  */
        /* JADX WARN: Code duplicated, block: B:79:0x02f0 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ce -> B:23:0x00ed). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static /* synthetic */ java.lang.Object a(java.lang.Object[] r17, int r18, int r19, int r20) {
            /*
                Method dump skipped, instruction units count: 1085
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.setTranslationZ.a.a(java.lang.Object[], int, int, int):java.lang.Object");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return (Continuation) a(new Object[]{this, obj, continuation}, 496508233, -496508230, System.identityHashCode(this));
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return a(new Object[]{this, coroutineScope, continuation}, -1782647341, 1782647343, System.identityHashCode(this));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            return a(new Object[]{this, obj}, -3953607, 3953607, System.identityHashCode(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setTranslationZ(@NotNull ReceiveChannel<? extends setSystemGestureExclusionRects> receiveChannel, @NotNull component20 component20Var, @NotNull setCompoundDrawableTintList setcompounddrawabletintlist) {
        Intrinsics.checkNotNullParameter(receiveChannel, "");
        Intrinsics.checkNotNullParameter(component20Var, "");
        Intrinsics.checkNotNullParameter(setcompounddrawabletintlist, "");
        this.f60799a = receiveChannel;
        this.f60800b = component20Var;
        this.f60801c = setcompounddrawabletintlist;
        this.f60802d = new ArrayList();
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = (i11 * (-657)) + (i10 * 659);
        int i14 = ~((~i10) | i11);
        int i15 = ~((~i11) | i10);
        int i16 = ~(i10 | i12);
        int i17 = ((i14 | i15 | i16) * (-658)) + i13;
        switch (((i16 | i15) * 658) + (i15 * 658) + i17) {
            case 1:
                setTranslationZ settranslationz = (setTranslationZ) objArr[0];
                int i18 = (-2) - ((f60797f + 120) ^ (-1));
                f60798g = i18 % 128;
                if (i18 % 2 != 0) {
                    return settranslationz.f60801c;
                }
                setCompoundDrawableTintList setcompounddrawabletintlist = settranslationz.f60801c;
                throw null;
            case 2:
                setTranslationZ settranslationz2 = (setTranslationZ) objArr[0];
                int i19 = f60798g;
                int i20 = ((i19 & (-80)) | ((~i19) & 79)) + ((i19 & 79) << 1);
                f60797f = i20 % 128;
                int i21 = i20 % 2;
                obj = settranslationz2.f60800b;
                if (i21 != 0) {
                    int i22 = 13 / 0;
                }
                break;
            case 3:
                setTranslationZ settranslationz3 = (setTranslationZ) objArr[0];
                CoroutineScope coroutineScope = (CoroutineScope) objArr[1];
                Intrinsics.checkNotNullParameter(coroutineScope, "");
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, settranslationz3.new a(null), 3, null);
                int i23 = f60797f + 17;
                f60798g = i23 % 128;
                int i24 = i23 % 2;
                return null;
            case 4:
                setTranslationZ settranslationz4 = (setTranslationZ) objArr[0];
                int i25 = f60797f;
                int i26 = i25 ^ 45;
                int i27 = -(-((i25 & 45) << 1));
                int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                f60798g = i28 % 128;
                int i29 = i28 % 2;
                obj = settranslationz4.f60799a;
                if (i29 == 0) {
                    int i30 = 48 / 0;
                }
                break;
            case 5:
                setTranslationZ settranslationz5 = (setTranslationZ) objArr[0];
                int i31 = f60797f;
                int i32 = i31 & 27;
                int i33 = ((((i31 ^ 27) | i32) << 1) - (~(-((i31 | 27) & (~i32))))) - 1;
                int i34 = i33 % 128;
                f60798g = i34;
                int i35 = i33 % 2;
                ArrayList arrayList = settranslationz5.f60802d;
                int i36 = (((i34 & (-62)) | ((~i34) & 61)) - (~(-(-((i34 & 61) << 1))))) - 1;
                f60797f = i36 % 128;
                int i37 = i36 % 2;
                return arrayList;
            case 6:
                setTranslationZ settranslationz6 = (setTranslationZ) objArr[0];
                int i38 = f60798g;
                int i39 = i38 + 61;
                f60797f = i39 % 128;
                int i40 = i39 % 2;
                int i41 = settranslationz6.f60803e;
                if (i40 != 0) {
                    throw null;
                }
                int i42 = i38 ^ 11;
                int i43 = (i38 & 11) << 1;
                int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                f60797f = i44 % 128;
                int i45 = i44 % 2;
                return Integer.valueOf(i41);
            default:
                setTranslationZ settranslationz7 = (setTranslationZ) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i46 = f60798g;
                int i47 = i46 ^ 89;
                int i48 = (i46 & 89) << 1;
                int i49 = (i47 & i48) + (i47 | i48);
                f60797f = i49 % 128;
                int i50 = i49 % 2;
                settranslationz7.f60803e = iIntValue;
                int i51 = i46 & 117;
                int i52 = ((i46 ^ 117) | i51) << 1;
                int i53 = -((~i51) & (i46 | 117));
                int i54 = (i52 ^ i53) + ((i52 & i53) << 1);
                f60797f = i54 % 128;
                int i55 = i54 % 2;
                return null;
        }
        return obj;
    }

    public static final /* synthetic */ setCompoundDrawableTintList setOnFocusChangeListener(setTranslationZ settranslationz) {
        return (setCompoundDrawableTintList) setDividerPadding(new Object[]{settranslationz}, -857419582, 857419583, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ ReceiveChannel setX(setTranslationZ settranslationz) {
        return (ReceiveChannel) setDividerPadding(new Object[]{settranslationz}, -36678187, 36678191, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ List setY(setTranslationZ settranslationz) {
        return (List) setDividerPadding(new Object[]{settranslationz}, 1856887604, -1856887599, (int) System.currentTimeMillis());
    }

    public final void setY(@NotNull CoroutineScope coroutineScope) {
        setDividerPadding(new Object[]{this, coroutineScope}, -175372226, 175372229, System.identityHashCode(this));
    }

    public static final /* synthetic */ component20 setDividerPadding(setTranslationZ settranslationz) {
        return (component20) setDividerPadding(new Object[]{settranslationz}, -596661320, 596661322, (int) System.currentTimeMillis());
    }
}
