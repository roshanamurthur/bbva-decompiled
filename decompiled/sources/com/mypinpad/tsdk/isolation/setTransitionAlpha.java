package com.mypinpad.tsdk.isolation;

import bk.p;
import bk.q;
import java.util.ArrayList;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001=B\u001f\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\fH\u0002J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\fH\u0002J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\u001c\u0010#\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0018H\u0002J\u0012\u0010$\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010\u0018H\u0002J\u0012\u0010%\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J9\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u0012\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020(H\u0096@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0002J\u001a\u0010.\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020*H\u0002J\u0018\u00101\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010/\u001a\u00020*H\u0002R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/combinationselection/GenericApplicationSelection;", "Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/combinationselection/ApplicationSelection;", "Lcom/mypinpad/softpos/emv/terminal/entrypoint/model/TerminalProcessingOutcome;", "buildCombinationSelectionOutcome", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;", "tlv", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelId;", "kernelId", "", "checkFCIStructure", "checkFCITemplate", "", "Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/combinationselection/model/CandidateCombination;", "applicationCandidates", "getHighestPriorityCandidate", "", "tagLabel", "getKernelSpecificExpectedParent", "candidate", "isEftpos", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/response/SwEnum;", "swEnum", "isSelectNextWhenSelectADFFailed", "isVisa", "", "adfNameData", "finalAdfName", "matchAIDWithDFName", "tlvResponse", "", "normaliseApplicationSelectDataResponse", "postEmptyCandidateListOutcome", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/Level2Error;", "l2Error", "sw12", "postEndApplicationErrorOutcome", "postTryAnotherCardOutcome", "removeInvalidRelaxedTags", "issuerAuthData", "scriptData", "Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/preprocessing/PreProcessingResponse;", "preprocessingResponse", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/response/emv/EmvSelectApplicationResponse;", "selectCandidateApplication", "(Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/combinationselection/model/CandidateCombination;Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/preprocessing/PreProcessingResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectResponseValidationFailed", "validateApplicationSelectDataStructure", "selectResponse", "validateApplicationSelectionMandatoryFields", "validateApplicationSelectionResponse", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/CardProcessor;", "cardProcessor", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/CardProcessor;", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/KernelQ;", "kernelQ", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/KernelQ;", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/GenericOutcomeProcessor;", "outcomeProcessor", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/GenericOutcomeProcessor;", "<init>", "(Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/CardProcessor;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/KernelQ;Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/GenericOutcomeProcessor;)V", "Companion"}, k = 1, mv = {1, 5, 1})
public final class setTransitionAlpha implements setNextFocusForwardId {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Map<String, String> f60762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Map<String, String> f60763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Map<String, String> f60764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final List<String> f60765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60766h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f60767i = 1;

    @NotNull
    public static final setOnFocusChangeListener setOnFocusChangeListener = new setOnFocusChangeListener(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final getValue f60768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTextKeepState f60769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final eu f60770c;

    public static final class a extends ContinuationImpl {
        public static int E0 = 1;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static int f60771y0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public setTransitionAlpha f60772p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public setPictureListener f60773q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public getBeepOnFailure f60774r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public getBeepOnFailure f60775s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public values f60776t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public byte[] f60777u0;
        public /* synthetic */ Object v0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f60779x0;

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
            int i10 = E0;
            int i11 = (i10 & (-122)) | ((~i10) & 121);
            int i12 = -(-((i10 & 121) << 1));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f60771y0 = i13 % 128;
            int i14 = i13 % 2;
            aVar.v0 = obj2;
            int i15 = aVar.f60779x0;
            if (i14 != 0) {
                aVar.f60779x0 = i15 | Integer.MIN_VALUE;
                setTransitionAlpha settransitionalpha = setTransitionAlpha.this;
                setTransitionAlpha.setY(new Object[]{settransitionalpha, null, null, null, null, aVar}, -2098094371, 2098094374, System.identityHashCode(settransitionalpha));
                throw null;
            }
            int i16 = i15 & Integer.MIN_VALUE;
            int i17 = (i15 | Integer.MIN_VALUE) & (~i16);
            aVar.f60779x0 = (i17 & i16) | (i17 ^ i16);
            setTransitionAlpha settransitionalpha2 = setTransitionAlpha.this;
            Object y7 = setTransitionAlpha.setY(new Object[]{settransitionalpha2, null, null, null, null, aVar}, -2098094371, 2098094374, System.identityHashCode(settransitionalpha2));
            int i18 = f60771y0;
            int i19 = i18 ^ 17;
            int i20 = ((i18 & 17) | i19) << 1;
            int i21 = -i19;
            int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
            E0 = i22 % 128;
            int i23 = i22 % 2;
            return y7;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/i/setTransitionAlpha$setOnFocusChangeListener;", "", "", "", "setOnDragListener", "Ljava/util/List;", "setOnFocusChangeListener", "", "setY", "Ljava/util/Map;", "setX", "getNavBarTitleString", "setCompoundDrawableTintBlendMode", "setOnLongClickListener", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class setOnFocusChangeListener {
        public setOnFocusChangeListener() {
        }

        public /* synthetic */ setOnFocusChangeListener(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class setY {
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[Terminal.valuesCustom().length];
            iArr[Terminal.KERNEL_3.ordinal()] = 1;
            iArr[Terminal.KERNEL_13.ordinal()] = 2;
            setY = iArr;
            int i10 = ((97 << 1) - (~(-97))) - 1;
            int i11 = i10 % 128;
            int i12 = i10 % 2;
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
        f60762d = q.mapOf(TuplesKt.to(str, (String) TransactionFailed.setX(objArr, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))), TuplesKt.to(str2, (String) TransactionFailed.setX(objArr2, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))), TuplesKt.to(str3, (String) TransactionFailed.setX(new Object[]{transactionFailed6}, 1914607362, -1914607356, System.identityHashCode(transactionFailed6))), TuplesKt.to(str4, (String) TransactionFailed.setX(objArr3, 1914607362, -1914607356, System.identityHashCode(transactionFailed7))), TuplesKt.to(str5, (String) TransactionFailed.setX(objArr4, 1914607362, -1914607356, System.identityHashCode(transactionFailed9))), TuplesKt.to(str6, (String) TransactionFailed.setX(objArr5, 1914607362, -1914607356, System.identityHashCode(transactionFailed11))), TuplesKt.to(str7, (String) TransactionFailed.setX(new Object[]{transactionFailed13}, 1914607362, -1914607356, System.identityHashCode(transactionFailed13))), TuplesKt.to(str8, (String) TransactionFailed.setX(objArr6, 1914607362, -1914607356, System.identityHashCode(transactionFailed15))), TuplesKt.to(str9, (String) TransactionFailed.setX(objArr7, 1914607362, -1914607356, System.identityHashCode(transactionFailed16))), TuplesKt.to(str10, (String) TransactionFailed.setX(objArr8, 1914607362, -1914607356, System.identityHashCode(transactionFailedCardScheme2))), TuplesKt.to(str11, (String) TransactionFailed.setX(new Object[]{transactionFailedCardScheme3}, 1914607362, -1914607356, System.identityHashCode(transactionFailedCardScheme3))));
        TransactionFailed transactionFailed19 = (TransactionFailed) setAnimation.setY(new Object[0], -868842546, 868842628, (int) System.currentTimeMillis());
        String str12 = (String) TransactionFailed.setX(new Object[]{transactionFailed19}, 1914607362, -1914607356, System.identityHashCode(transactionFailed19));
        TransactionFailed transactionFailedCardScheme4 = setAnimation.CardScheme();
        f60763e = p.mapOf(TuplesKt.to(str12, (String) TransactionFailed.setX(new Object[]{transactionFailedCardScheme4}, 1914607362, -1914607356, System.identityHashCode(transactionFailedCardScheme4))));
        f60764f = q.emptyMap();
        TransactionFailed transactionFailed20 = (TransactionFailed) setAnimation.setY(new Object[0], -1711803826, 1711803947, (int) System.currentTimeMillis());
        String str13 = (String) TransactionFailed.setX(new Object[]{transactionFailed20}, 1914607362, -1914607356, System.identityHashCode(transactionFailed20));
        TransactionFailed transactionFailed21 = (TransactionFailed) setAnimation.setY(new Object[0], 1723373489, -1723373305, (int) System.currentTimeMillis());
        String str14 = (String) TransactionFailed.setX(new Object[]{transactionFailed21}, 1914607362, -1914607356, System.identityHashCode(transactionFailed21));
        TransactionFailed transactionFailed22 = (TransactionFailed) setAnimation.setY(new Object[0], -817759528, 817759728, (int) System.currentTimeMillis());
        String str15 = (String) TransactionFailed.setX(new Object[]{transactionFailed22}, 1914607362, -1914607356, System.identityHashCode(transactionFailed22));
        TransactionFailed transactionFailed23 = (TransactionFailed) setAnimation.setY(new Object[0], -1333173903, 1333173904, (int) System.currentTimeMillis());
        f60765g = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str13, str14, str15, (String) TransactionFailed.setX(new Object[]{transactionFailed23}, 1914607362, -1914607356, System.identityHashCode(transactionFailed23))});
        int i10 = f60766h;
        int i11 = ((i10 & 64) + (i10 | 64)) - 1;
        f60767i = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public setTransitionAlpha(@NotNull getValue getvalue, @NotNull setTextKeepState settextkeepstate, @NotNull eu euVar) {
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(euVar, "");
        this.f60768a = getvalue;
        this.f60769b = settextkeepstate;
        this.f60770c = euVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0197  */
    /* JADX WARN: Code duplicated, block: B:21:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:24:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:26:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:27:0x01c8  */
    public static /* synthetic */ Boolean a(Object[] objArr) {
        getBeepOnFailure getbeeponfailure;
        getBeepOnFailure getbeeponfailure2;
        int i10;
        int i11;
        int i12;
        setScreenReaderFocusable setscreenreaderfocusable = (setScreenReaderFocusable) objArr[0];
        int i13 = f60767i + 13;
        f60766h = i13 % 128;
        int i14 = i13 % 2;
        getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScreenReaderFocusable.setCompoundDrawableTintBlendMode(new Object[]{setscreenreaderfocusable}, 2060907440, -2060907440, System.identityHashCode(setscreenreaderfocusable));
        if (getbeeponfailure3 == null) {
            int i15 = f60767i;
            int i16 = ((i15 ^ 19) | (i15 & 19)) << 1;
            int i17 = -(((~i15) & 19) | (i15 & (-20)));
            int i18 = (i16 & i17) + (i17 | i16);
            int i19 = i18 % 128;
            f60766h = i19;
            int i20 = i18 % 2;
            int i21 = i19 & 7;
            int i22 = (i19 | 7) & (~i21);
            int i23 = i21 << 1;
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            f60767i = i24 % 128;
            int i25 = i24 % 2;
            getbeeponfailure = null;
        } else {
            setAnimation setanimation = setAnimation.INSTANCE;
            getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3, (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis())}, -990392770, 990392791, System.identityHashCode(getbeeponfailure3));
            int i26 = f60767i;
            int i27 = (i26 ^ 125) + ((i26 & 125) << 1);
            f60766h = i27 % 128;
            int i28 = i27 % 2;
        }
        if (getbeeponfailure3 == null) {
            int i29 = f60767i;
            int i30 = i29 & 101;
            int i31 = -(-((i29 ^ 101) | i30));
            int i32 = (i30 & i31) + (i30 | i31);
            f60766h = i32 % 128;
            int i33 = i32 % 2;
            int i34 = ((i29 ^ 87) | (i29 & 87)) << 1;
            int i35 = -(((~i29) & 87) | (i29 & (-88)));
            int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
            f60766h = i36 % 128;
            int i37 = i36 % 2;
            getbeeponfailure2 = null;
        } else {
            setAnimation setanimation2 = setAnimation.INSTANCE;
            getbeeponfailure2 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3, (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis())}, -990392770, 990392791, System.identityHashCode(getbeeponfailure3));
            int i38 = f60767i + 91;
            f60766h = i38 % 128;
            int i39 = i38 % 2;
        }
        if (getbeeponfailure3 != null) {
            int i40 = f60766h;
            int i41 = i40 & 5;
            int i42 = (i40 ^ 5) | i41;
            int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
            f60767i = i43 % 128;
            if (i43 % 2 == 0) {
                setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, -865402437, System.identityHashCode(getbeeponfailure3));
                String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                setAnimation setanimation3 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                int i44 = 72 / 0;
                if (Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                    if (getbeeponfailure != null) {
                        i10 = f60767i;
                        int i45 = i10 & 49;
                        int i46 = ((i10 ^ 49) | i45) << 1;
                        int i47 = -((~i45) & (i10 | 49));
                        i11 = (i46 & i47) + (i46 | i47);
                        f60766h = i11 % 128;
                        if (i11 % 2 == 0) {
                            throw null;
                        }
                        if (getbeeponfailure2 != null) {
                            int i48 = i10 ^ 19;
                            int i49 = -(-((i10 & 19) << 1));
                            i12 = (i48 ^ i49) + ((i49 & i48) << 1);
                            f60766h = i12 % 128;
                            if (i12 % 2 == 0) {
                                return Boolean.TRUE;
                            }
                            throw null;
                        }
                    }
                }
            } else {
                setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, -865402437, System.identityHashCode(getbeeponfailure3));
                String str2 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2));
                setAnimation setanimation4 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                if (Intrinsics.areEqual(str2, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)))) {
                    if (getbeeponfailure != null) {
                        i10 = f60767i;
                        int i410 = i10 & 49;
                        int i411 = ((i10 ^ 49) | i410) << 1;
                        int i412 = -((~i410) & (i10 | 49));
                        i11 = (i411 & i412) + (i411 | i412);
                        f60766h = i11 % 128;
                        if (i11 % 2 == 0) {
                            throw null;
                        }
                        if (getbeeponfailure2 != null) {
                            int i413 = i10 ^ 19;
                            int i414 = -(-((i10 & 19) << 1));
                            i12 = (i413 ^ i414) + ((i414 & i413) << 1);
                            f60766h = i12 % 128;
                            if (i12 % 2 == 0) {
                                return Boolean.TRUE;
                            }
                            throw null;
                        }
                    }
                }
            }
        }
        int i50 = f60766h + 47;
        f60767i = i50 % 128;
        int i51 = i50 % 2;
        return Boolean.FALSE;
    }

    public static setTextColor b() {
        return (setTextColor) setY(new Object[0], 59345209, -59345193, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Boolean c(Object[] objArr) {
        Terminal terminal = (Terminal) objArr[0];
        setScreenReaderFocusable setscreenreaderfocusable = (setScreenReaderFocusable) objArr[1];
        int i10 = f60767i;
        int i11 = (((i10 | 76) << 1) - (i10 ^ 76)) - 1;
        f60766h = i11 % 128;
        if (i11 % 2 != 0) {
            Terminal.Companion companion = Terminal.INSTANCE;
            throw null;
        }
        if (terminal == Terminal.KERNEL_3) {
            int i12 = f60767i;
            int i13 = (-2) - (((i12 ^ 50) + ((i12 & 50) << 1)) ^ (-1));
            f60766h = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScreenReaderFocusable.setCompoundDrawableTintBlendMode(new Object[]{setscreenreaderfocusable}, 891387550, -891387549, System.identityHashCode(setscreenreaderfocusable));
            if (getbeeponfailure == null) {
                int i14 = f60767i;
                int i15 = (i14 | 79) << 1;
                int i16 = -(((~i14) & 79) | (i14 & (-80)));
                int i17 = (i15 & i16) + (i16 | i15);
                f60766h = i17 % 128;
                int i18 = i17 % 2;
                return Boolean.FALSE;
            }
            bj bjVar = new bj(getbeeponfailure);
            bo boVar = (bo) ((setImageTintList) w.setX(new Object[]{bjVar}, 1693919772, -1693919769, System.identityHashCode(bjVar)));
            setMaxWidth setmaxwidth = (setMaxWidth) ((List) bo.setY(new Object[]{boVar}, -1194860115, 1194860115, System.identityHashCode(boVar)));
            setAnimation setanimation = setAnimation.INSTANCE;
            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -692948779, 692948802, (int) System.currentTimeMillis());
            if (((getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -480651882, 480651889, System.identityHashCode(setmaxwidth))) == null) {
                int i19 = f60766h;
                int i20 = (i19 & 67) + (i19 | 67);
                int i21 = i20 % 128;
                f60767i = i21;
                int i22 = i20 % 2;
                int i23 = i21 & 7;
                int i24 = (i21 | 7) & (~i23);
                int i25 = i23 << 1;
                int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                f60766h = i26 % 128;
                int i27 = i26 % 2;
                return Boolean.FALSE;
            }
        }
        boolean zBooleanValue = ((Boolean) setY(new Object[]{setscreenreaderfocusable}, 1328981852, -1328981841, (int) System.currentTimeMillis())).booleanValue();
        int i28 = f60766h + 123;
        f60767i = i28 % 128;
        int i29 = i28 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ Boolean d(Object[] objArr) {
        setTransitionAlpha settransitionalpha = (setTransitionAlpha) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        int i10 = f60767i;
        int i11 = (-2) - ((((i10 | 98) << 1) - (i10 ^ 98)) ^ (-1));
        f60766h = i11 % 128;
        int i12 = i11 % 2;
        boolean zBooleanValue = ((Boolean) setY(new Object[]{settransitionalpha, getbeeponfailure}, -504629490, 504629499, System.identityHashCode(settransitionalpha))).booleanValue();
        int i13 = f60767i;
        int i14 = (((i13 & (-34)) | ((~i13) & 33)) - (~(-(-((i13 & 33) << 1))))) - 1;
        f60766h = i14 % 128;
        if (i14 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    public static /* synthetic */ Boolean e(Object[] objArr) throws Exception {
        setTransitionAlpha settransitionalpha = (setTransitionAlpha) objArr[0];
        Boolean bool = Boolean.TRUE;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        int i10 = f60767i;
        int i11 = (i10 | 11) << 1;
        int i12 = -((i10 & (-12)) | ((~i10) & 11));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        f60766h = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        if (getbeeponfailure == null) {
            int i14 = (i10 & 65) + (i10 | 65);
            f60766h = i14 % 128;
            if (i14 % 2 == 0) {
                return bool;
            }
            throw null;
        }
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1532855682, 1532855827, (int) System.currentTimeMillis());
        setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
        if (!Intrinsics.areEqual((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)), (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, new f9(settransitionalpha)}, -2036793125, 2036793133, System.identityHashCode(getbeeponfailure));
            int i15 = f60767i;
            int i16 = i15 & 37;
            int i17 = (i16 - (~((i15 ^ 37) | i16))) - 1;
            f60766h = i17 % 128;
            int i18 = i17 % 2;
            return bool;
        }
        int i19 = f60766h;
        int i20 = i19 & 81;
        int i21 = -(-(i19 | 81));
        int i22 = (i20 & i21) + (i21 | i20);
        f60767i = i22 % 128;
        int i23 = i22 % 2;
        if (((setFindListener) TransactionFailed.setX(new Object[]{transactionFailed}, -570885530, 570885532, System.identityHashCode(transactionFailed))).setX((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))) {
            int i24 = f60766h;
            int i25 = (i24 & 21) + (i24 | 21);
            f60767i = i25 % 128;
            int i26 = i25 % 2;
            byte b10 = ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))[0];
            if (11 <= b10) {
                int i27 = f60767i;
                int i28 = i27 + 21;
                int i29 = i28 % 128;
                f60766h = i29;
                if (i28 % 2 == 0 ? b10 <= 30 : b10 <= 60) {
                    int i30 = i29 + 115;
                    int i31 = i30 % 128;
                    f60767i = i31;
                    int i32 = i30 % 2;
                    int i33 = ((i31 | 67) << 1) - (i31 ^ 67);
                    f60766h = i33 % 128;
                    int i34 = i33 % 2;
                    int i35 = ((i31 ^ 70) + ((i31 & 70) << 1)) - 1;
                    f60766h = i35 % 128;
                    if (i35 % 2 != 0) {
                        int i36 = 69 / 0;
                    }
                    return bool;
                }
                int i37 = i27 + 75;
                f60766h = i37 % 128;
                int i38 = i37 % 2;
            } else {
                int i39 = f60767i;
                int i40 = ((i39 ^ 105) - (~(-(-((i39 & 105) << 1))))) - 1;
                f60766h = i40 % 128;
                int i41 = i40 % 2;
            }
        }
        int i42 = f60766h;
        int i43 = i42 & 105;
        int i44 = -(-((i42 ^ 105) | i43));
        int i45 = (i43 & i44) + (i44 | i43);
        f60767i = i45 % 128;
        int i46 = i45 % 2;
        return Boolean.FALSE;
    }

    public static /* synthetic */ String f(Object[] objArr) {
        String str = (String) objArr[0];
        Terminal terminal = (Terminal) objArr[1];
        int i10 = f60766h;
        int i11 = i10 ^ 103;
        int i12 = ((i10 & 103) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f60767i = i14 % 128;
        int i15 = i14 % 2;
        int i16 = setY.setY[terminal.ordinal()];
        if (i16 == 1) {
            String str2 = f60764f.get(str);
            int i17 = f60767i;
            int i18 = (i17 & 101) + (i17 | 101);
            f60766h = i18 % 128;
            if (i18 % 2 == 0) {
                return str2;
            }
            throw null;
        }
        if (i16 != 2) {
            int i19 = f60766h;
            int i20 = (i19 ^ 55) + ((i19 & 55) << 1);
            f60767i = i20 % 128;
            int i21 = i20 % 2;
            return null;
        }
        String str3 = f60763e.get(str);
        int i22 = f60766h;
        int i23 = i22 & 67;
        int i24 = (i22 ^ 67) | i23;
        int i25 = (i23 & i24) + (i24 | i23);
        f60767i = i25 % 128;
        int i26 = i25 % 2;
        return str3;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0490  */
    public static /* synthetic */ Object g(Object[] objArr) throws Exception {
        a aVar;
        setTransitionAlpha settransitionalpha;
        byte[] bArr;
        char c10;
        getDetailsFieldTextSizeSp getdetailsfieldtextsizesp;
        getDetailsFieldTextSizeSp getdetailsfieldtextsizesp2;
        getDetailsFieldTextSizeSp getdetailsfieldtextsizesp3;
        getDetailsFieldTextSizeSp getdetailsfieldtextsizesp4;
        byte[] onFocusChangeListener;
        getDetailsFieldTextSizeSp navigationOnClickListener;
        int i10;
        int i11;
        setTransitionAlpha settransitionalpha2 = (setTransitionAlpha) objArr[0];
        setPictureListener setpicturelistener = (setPictureListener) objArr[1];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[2];
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[3];
        values valuesVar = (values) objArr[4];
        Continuation continuation = (Continuation) objArr[5];
        if (!(continuation instanceof a) || (i11 = (i10 = (aVar = (a) continuation).f60779x0) & Integer.MIN_VALUE) == 0) {
            aVar = settransitionalpha2.new a(continuation);
        } else {
            int iIdentityHashCode = System.identityHashCode(settransitionalpha2);
            int i12 = -(-(i10 * (-622)));
            int i13 = ((i12 << 1) - (~(-i12))) - 1;
            int i14 = ~i10;
            int i15 = i14 & Integer.MAX_VALUE;
            int i16 = i15 | ((~i14) & Integer.MIN_VALUE);
            int i17 = i14 & Integer.MIN_VALUE;
            int i18 = (i16 ^ i17) | (i16 & i17);
            int i19 = ~iIdentityHashCode;
            int i20 = (i18 & i19) | ((~i18) & iIdentityHashCode);
            int i21 = i18 & iIdentityHashCode;
            int i22 = (i20 ^ i21) | (i20 & i21);
            int i23 = ~i22;
            int i24 = -(-(((i22 | i23) & i23) * 623));
            int i25 = (i13 & i24) + (i13 | i24);
            int i26 = i15 | i11;
            int i27 = Integer.MAX_VALUE & i10;
            int i28 = ~((i26 ^ i27) | (i26 & i27));
            int i29 = ((i19 ^ i28) | (i19 & i28)) * (-623);
            int i30 = ((i25 | i29) << 1) - (i29 ^ i25);
            int i31 = i14 ^ Integer.MIN_VALUE;
            int i32 = (i31 & i17) | (i31 ^ i17);
            int i33 = ~i32;
            int i34 = (i32 | i33) & i33;
            int i35 = (i14 | i10) & i14;
            int i36 = ~((i35 & iIdentityHashCode) | (i35 ^ iIdentityHashCode));
            int i37 = (i34 & i36) | (i34 ^ i36);
            int i38 = Integer.MIN_VALUE & iIdentityHashCode;
            int i39 = (~i38) & (iIdentityHashCode | Integer.MIN_VALUE);
            int i40 = ~((i38 & i39) | (i39 ^ i38));
            int i41 = i37 & i40;
            aVar.f60779x0 = (i30 - (~(-(-((((i37 | i40) & (~i41)) | i41) * 623))))) - 1;
        }
        Object obj = aVar.v0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i42 = aVar.f60779x0;
        if (i42 == 0) {
            ResultKt.throwOnFailure(obj);
            setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
            setTitleMarginTop settitlemargintop = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener));
            setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(Terminal) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop}, 2113948533, -2113948530, System.identityHashCode(settitlemargintop))}, -157457190, 157457205, (int) System.currentTimeMillis());
            byte[] bArr2 = (byte[]) setPictureListener.setY(new Object[]{setpicturelistener}, -87887370, 87887376, System.identityHashCode(setpicturelistener));
            byte[] bArr3 = (((byte[]) setPictureListener.setY(new Object[]{setpicturelistener}, 2106619938, -2106619931, System.identityHashCode(setpicturelistener))) == null || !((Boolean) setPictureListener.setY(new Object[]{setpicturelistener}, -800777879, 800777887, System.identityHashCode(setpicturelistener))).booleanValue()) ? new byte[0] : (byte[]) setPictureListener.setY(new Object[]{setpicturelistener}, 2106619938, -2106619931, System.identityHashCode(setpicturelistener));
            Intrinsics.checkNotNull(bArr3);
            byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(bArr2, bArr3);
            getValue getvalue = settransitionalpha2.f60768a;
            writeReplace writereplace = new writeReplace(bArrPlus);
            aVar.f60772p0 = settransitionalpha2;
            aVar.f60773q0 = setpicturelistener;
            aVar.f60774r0 = getbeeponfailure;
            aVar.f60775s0 = getbeeponfailure2;
            aVar.f60776t0 = valuesVar;
            aVar.f60777u0 = bArrPlus;
            aVar.f60779x0 = 1;
            Object onFocusChangeListener2 = getvalue.setOnFocusChangeListener(writereplace, aVar);
            if (onFocusChangeListener2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            settransitionalpha = settransitionalpha2;
            bArr = bArrPlus;
            obj = onFocusChangeListener2;
        } else {
            if (i42 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = aVar.f60777u0;
            valuesVar = aVar.f60776t0;
            getbeeponfailure2 = aVar.f60775s0;
            getbeeponfailure = aVar.f60774r0;
            setpicturelistener = aVar.f60773q0;
            settransitionalpha = aVar.f60772p0;
            ResultKt.throwOnFailure(obj);
        }
        setRotationX setrotationx = (setRotationX) obj;
        setScreenReaderFocusable setscreenreaderfocusable = new setScreenReaderFocusable(b(), setrotationx.setNavigationOnClickListener());
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
                setY(new Object[]{settransitionalpha, (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, -1977481372, 1977481379, System.identityHashCode(settransitionalpha));
                return null;
            }
            if (((setItemChecked) setRotationX.setX(new Object[]{setrotationx}, 2020716727, -2020716721, System.identityHashCode(setrotationx))) != setItemChecked.setDividerPadding) {
                return null;
            }
            getEmvLibVersion.Companion companion = getEmvLibVersion.INSTANCE;
            getEmvLibVersion getemvlibversion = (getEmvLibVersion) getEmvLibVersion.Companion.setOnFocusChangeListener(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, 617595066, -617595066, (int) System.currentTimeMillis());
            setTitleMarginTop settitlemargintop2 = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener));
            if (((Boolean) setY(new Object[]{getemvlibversion, (Terminal) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop2}, 2113948533, -2113948530, System.identityHashCode(settitlemargintop2))}, -2056659557, 2056659574, (int) System.currentTimeMillis())).booleanValue()) {
                return setscreenreaderfocusable;
            }
            setY(new Object[]{settransitionalpha, (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, -1977481372, 1977481379, System.identityHashCode(settransitionalpha));
            return null;
        }
        setTitleMarginTop settitlemargintop3 = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener));
        Terminal terminal = (Terminal) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop3}, 2113948533, -2113948530, System.identityHashCode(settitlemargintop3));
        setTitleMarginTop settitlemargintop4 = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener));
        setFontFeatureSettings setfontfeaturesettings = (setFontFeatureSettings) values.setY(new Object[]{valuesVar, terminal, (setBackgroundTintList) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop4}, 423062029, -423062025, System.identityHashCode(settitlemargintop4)), (md) setPictureListener.setY(new Object[]{setpicturelistener}, 1661100660, -1661100656, System.identityHashCode(setpicturelistener))}, -1159783560, 1159783561, System.identityHashCode(valuesVar));
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
        } else {
            Object[] objArr4 = new Object[1];
            objArr4[c10] = setfontfeaturesettings;
            Object[] objArr5 = new Object[1];
            objArr5[c10] = Boolean.valueOf(((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(objArr4, 1612421959, -1612421951, System.identityHashCode(setfontfeaturesettings))).booleanValue());
            getdetailsfieldtextsizesp3 = (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(objArr5, -772901588, 772901588, (int) System.currentTimeMillis());
        }
        getdetailsfieldtextsizespArr2[2] = getdetailsfieldtextsizesp3;
        if (setfontfeaturesettings == null) {
            getdetailsfieldtextsizesp4 = null;
        } else {
            Object[] objArr6 = new Object[1];
            objArr6[c10] = setfontfeaturesettings;
            Object[] objArr7 = new Object[1];
            objArr7[c10] = Boolean.valueOf(((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(objArr6, -2133249192, 2133249203, System.identityHashCode(setfontfeaturesettings))).booleanValue());
            getdetailsfieldtextsizesp4 = (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(objArr7, -772901588, 772901588, (int) System.currentTimeMillis());
        }
        getdetailsfieldtextsizespArr2[3] = getdetailsfieldtextsizesp4;
        if (setfontfeaturesettings == null) {
            navigationOnClickListener = null;
        } else {
            Object[] objArr8 = new Object[1];
            objArr8[c10] = setfontfeaturesettings;
            cs csVar = (cs) setFontFeatureSettings.setCompoundDrawableTintBlendMode(objArr8, -1608275827, 1608275837, System.identityHashCode(setfontfeaturesettings));
            if (csVar == null || (onFocusChangeListener = csVar.setOnFocusChangeListener()) == null) {
                navigationOnClickListener = null;
            } else {
                navigationOnClickListener = setInputExtras.setNavigationOnClickListener(onFocusChangeListener);
            }
        }
        getdetailsfieldtextsizespArr2[4] = navigationOnClickListener;
        setTitleMarginTop settitlemargintop5 = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener));
        getdetailsfieldtextsizespArr2[5] = setInputExtras.setNavigationOnClickListener(((setBackgroundTintList) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop5}, 423062029, -423062025, System.identityHashCode(settitlemargintop5))).setY());
        setTitleMarginTop settitlemargintop6 = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener));
        getdetailsfieldtextsizespArr2[6] = setLogo.setX(((Terminal) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop6}, 2113948533, -2113948530, System.identityHashCode(settitlemargintop6))).setY());
        SouthPacificEndpoint.setX(new Object[]{10007, new TerminalLogger(getdetailsfieldtextsizespArr2, null, 2, null), 4}, 1336485880, -1336485874, 10007);
        getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScreenReaderFocusable.setCompoundDrawableTintBlendMode(new Object[]{setscreenreaderfocusable}, 2060907440, -2060907440, System.identityHashCode(setscreenreaderfocusable));
        if (getbeeponfailure3 != null) {
            setTitleMarginTop settitlemargintop7 = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener));
            setY(new Object[]{settransitionalpha, getbeeponfailure3, (Terminal) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop7}, 2113948533, -2113948530, System.identityHashCode(settitlemargintop7))}, 452206678, -452206673, System.identityHashCode(settransitionalpha));
        }
        getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setScreenReaderFocusable.setCompoundDrawableTintBlendMode(new Object[]{setscreenreaderfocusable}, 2060907440, -2060907440, System.identityHashCode(setscreenreaderfocusable));
        setTitleMarginTop settitlemargintop8 = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener));
        if (!((Boolean) setY(new Object[]{settransitionalpha, getbeeponfailure4, (Terminal) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop8}, 2113948533, -2113948530, System.identityHashCode(settitlemargintop8))}, 1712111104, -1712111089, System.identityHashCode(settransitionalpha))).booleanValue()) {
            SouthPacificEndpoint.setX(new Object[]{10013, null, 6}, 1336485880, -1336485874, 10013);
            setY(new Object[]{settransitionalpha, setpicturelistener, setContentCaptureSession.setNavigationOnClickListener}, 1272265101, -1272265091, System.identityHashCode(settransitionalpha));
            return null;
        }
        setTitleMarginTop settitlemargintop9 = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener));
        if (!((Boolean) setY(new Object[]{(Terminal) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop9}, 2113948533, -2113948530, System.identityHashCode(settitlemargintop9)), setscreenreaderfocusable}, 499889079, -499889078, (int) System.currentTimeMillis())).booleanValue()) {
            SouthPacificEndpoint.setX(new Object[]{10014, null, 6}, 1336485880, -1336485874, 10014);
            setY(new Object[]{settransitionalpha, setpicturelistener, setContentCaptureSession.setOnFocusChangeListener}, 1272265101, -1272265091, System.identityHashCode(settransitionalpha));
            return null;
        }
        getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) setScreenReaderFocusable.setCompoundDrawableTintBlendMode(new Object[]{setscreenreaderfocusable}, 2060907440, -2060907440, System.identityHashCode(setscreenreaderfocusable));
        Intrinsics.checkNotNull(getbeeponfailure5);
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis());
        getBeepOnFailure getbeeponfailure6 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 1895833701, -1895833678, System.identityHashCode(getbeeponfailure5));
        Intrinsics.checkNotNull(getbeeponfailure6);
        byte[] bArr4 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 252497730, -252497710, System.identityHashCode(getbeeponfailure6));
        if (((Boolean) setY(new Object[]{bArr4, bArr}, 2101038130, -2101038118, (int) System.currentTimeMillis())).booleanValue() || ((Boolean) setY(new Object[]{setpicturelistener}, -144152420, 144152420, (int) System.currentTimeMillis())).booleanValue()) {
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
        setY(new Object[]{settransitionalpha, null}, -1977481372, 1977481379, System.identityHashCode(settransitionalpha));
        return null;
    }

    public static /* synthetic */ void h(Object[] objArr) throws Exception {
        setTransitionAlpha settransitionalpha = (setTransitionAlpha) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        Terminal terminal = (Terminal) objArr[2];
        int i10 = f60767i;
        int i11 = (i10 ^ 41) + ((i10 & 41) << 1);
        f60766h = i11 % 128;
        int i12 = i11 % 2;
        setAnimation setanimation = setAnimation.INSTANCE;
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis())}, -990392770, 990392791, System.identityHashCode(getbeeponfailure));
        if (getbeeponfailure2 != null) {
            int i13 = f60767i;
            int i14 = (i13 ^ 73) + ((i13 & 73) << 1);
            f60766h = i14 % 128;
            int i15 = i14 % 2;
            getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2, setAnimation.CardScheme()}, -990392770, 990392791, System.identityHashCode(getbeeponfailure2));
            if (getbeeponfailure3 != null) {
                int i16 = f60766h;
                int i17 = i16 & 43;
                int i18 = i17 + ((i16 ^ 43) | i17);
                f60767i = i18 % 128;
                if (i18 % 2 == 0) {
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3, g9.f55644p0}, -2036793125, 2036793133, System.identityHashCode(getbeeponfailure3));
                    int i19 = 94 / 0;
                } else {
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3, g9.f55644p0}, -2036793125, 2036793133, System.identityHashCode(getbeeponfailure3));
                }
                int i20 = f60766h;
                int i21 = ((i20 | 73) << 1) - (i20 ^ 73);
                f60767i = i21 % 128;
                int i22 = i21 % 2;
            }
        }
        ((Boolean) setY(new Object[]{settransitionalpha, getbeeponfailure}, -504629490, 504629499, System.identityHashCode(settransitionalpha))).booleanValue();
        if (terminal == Terminal.KERNEL_EFTPOS) {
            int i23 = f60766h;
            int i24 = (i23 & 93) + (i23 | 93);
            f60767i = i24 % 128;
            if (i24 % 2 == 0) {
                getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, h9.f56164p0}, -2036793125, 2036793133, System.identityHashCode(getbeeponfailure));
                throw null;
            }
            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, h9.f56164p0}, -2036793125, 2036793133, System.identityHashCode(getbeeponfailure));
            getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis())}, -990392770, 990392791, System.identityHashCode(getbeeponfailure));
            if (getbeeponfailure4 != null) {
                at atVar = new at(getbeeponfailure4);
                at.setOnFocusChangeListener(new Object[]{atVar}, -1365675383, 1365675383, System.identityHashCode(atVar));
                int i25 = f60766h;
                int i26 = (i25 | 19) << 1;
                int i27 = -(((~i25) & 19) | (i25 & (-20)));
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                f60767i = i28 % 128;
                int i29 = i28 % 2;
            }
        }
        int i30 = f60767i;
        int i31 = i30 ^ 119;
        int i32 = ((i30 & 119) | i31) << 1;
        int i33 = -i31;
        int i34 = (i32 & i33) + (i32 | i33);
        f60766h = i34 % 128;
        if (i34 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void i(Object[] objArr) throws Exception {
        setTransitionAlpha settransitionalpha = (setTransitionAlpha) objArr[0];
        setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) objArr[1];
        int i10 = f60766h;
        int i11 = i10 ^ 81;
        int i12 = -(-((i10 & 81) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f60767i = i13 % 128;
        int i14 = i13 % 2;
        ez.setY sety = ez.setDividerPadding;
        setY(new Object[]{settransitionalpha, setcontentcapturesession, (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis())}, -283897412, 283897418, System.identityHashCode(settransitionalpha));
        int i15 = f60767i;
        int i16 = ((i15 ^ 38) + ((i15 & 38) << 1)) - 1;
        f60766h = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0510  */
    /* JADX WARN: Code duplicated, block: B:104:0x0523  */
    /* JADX WARN: Code duplicated, block: B:107:0x0529  */
    /* JADX WARN: Code duplicated, block: B:108:0x052b  */
    /* JADX WARN: Code duplicated, block: B:110:0x052f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0552  */
    /* JADX WARN: Code duplicated, block: B:117:0x0567  */
    /* JADX WARN: Code duplicated, block: B:118:0x0569  */
    /* JADX WARN: Code duplicated, block: B:122:0x0579 A[LOOP:1: B:77:0x0366->B:122:0x0579, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:130:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:138:0x062f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0640  */
    /* JADX WARN: Code duplicated, block: B:141:0x0653  */
    /* JADX WARN: Code duplicated, block: B:142:0x0657  */
    /* JADX WARN: Code duplicated, block: B:153:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:155:0x06da  */
    /* JADX WARN: Code duplicated, block: B:156:0x06de  */
    /* JADX WARN: Code duplicated, block: B:18:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:192:0x033e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x057c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x057c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x058f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:22:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:48:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:50:0x020a  */
    /* JADX WARN: Code duplicated, block: B:51:0x020e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0315  */
    /* JADX WARN: Code duplicated, block: B:69:0x033a  */
    /* JADX WARN: Code duplicated, block: B:84:0x03c7 A[PHI: r3 r5
      0x03c7: PHI (r3v100 java.lang.String) = (r3v65 java.lang.String), (r3v102 java.lang.String) binds: [B:86:0x040a, B:82:0x03c4] A[DONT_GENERATE, DONT_INLINE]
      0x03c7: PHI (r5v40 com.mypinpad.tsdk.i.getBeepOnFailure) = (r5v36 com.mypinpad.tsdk.i.getBeepOnFailure), (r5v42 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:86:0x040a, B:82:0x03c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x040c A[PHI: r5
      0x040c: PHI (r5v37 com.mypinpad.tsdk.i.getBeepOnFailure) = (r5v36 com.mypinpad.tsdk.i.getBeepOnFailure), (r5v42 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:86:0x040a, B:82:0x03c4] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Boolean bool;
        setContentCaptureSession setcontentcapturesession;
        int i13;
        int i14;
        int i15;
        int i16;
        getBeepOnFailure getbeeponfailure;
        String str;
        int i17;
        boolean z10;
        int i18;
        boolean z11;
        boolean zAreEqual;
        int i19;
        boolean z12;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = ~i11;
        int i25 = ~i12;
        int i26 = (~(i24 | i10)) | (~(i24 | i25)) | (~(i25 | i10));
        int i27 = ~i10;
        int i28 = (((~(i27 | i25)) | (~(i11 | i25))) * 590) + (i26 * (-1180)) + (((~(i12 | i27 | i11)) | i26) * 590) + (i11 * 591) + (i10 * (-589));
        List<String> list = f60765g;
        switch (i28) {
            case 1:
                return c(objArr);
            case 2:
                i(objArr);
                return null;
            case 3:
                return g(objArr);
            case 4:
                return d(objArr);
            case 5:
                h(objArr);
                return null;
            case 6:
                setTransitionAlpha settransitionalpha = (setTransitionAlpha) objArr[0];
                setContentCaptureSession setcontentcapturesession2 = (setContentCaptureSession) objArr[1];
                byte[] bArr = (byte[]) objArr[2];
                eu euVar = settransitionalpha.f60770c;
                setHighlightColor sethighlightcolor = new setHighlightColor();
                fd fdVar = fd.END_APPLICATION;
                activateSession activatesession = activateSession.ERROR_OTHER_CARD;
                bool = null;
                int i29 = f60766h + 99;
                f60767i = i29 % 128;
                int i30 = i29 % 2;
                return bool;
            case 7:
                setTransitionAlpha settransitionalpha2 = (setTransitionAlpha) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int i31 = f60766h;
                int i32 = (((i31 | 7) << 1) - (~(-(((~i31) & 7) | (i31 & (-8)))))) - 1;
                int i33 = i32 % 128;
                f60767i = i33;
                int i34 = i32 % 2;
                if (bArr2 != null) {
                    int i35 = ((i33 | 91) << 1) - (i33 ^ 91);
                    f60766h = i35 % 128;
                    int i36 = i35 % 2;
                    setcontentcapturesession = setContentCaptureSession.setLayoutAnimation;
                    int i37 = f60767i;
                    int i38 = i37 & 107;
                    int i39 = ((i37 | 107) & (~i38)) + (i38 << 1);
                    f60766h = i39 % 128;
                    int i40 = i39 % 2;
                } else {
                    setcontentcapturesession = setContentCaptureSession.setOnLongClickListener;
                    int i41 = f60767i;
                    int i42 = ((i41 | 107) << 1) - (i41 ^ 107);
                    f60766h = i42 % 128;
                    int i43 = i42 % 2;
                }
                setY(new Object[]{settransitionalpha2, setcontentcapturesession, bArr2}, -283897412, 283897418, System.identityHashCode(settransitionalpha2));
                int i44 = f60766h + 111;
                f60767i = i44 % 128;
                int i45 = i44 % 2;
                return null;
            case 8:
                return f(objArr);
            case 9:
                return e(objArr);
            case 10:
                setTransitionAlpha settransitionalpha3 = (setTransitionAlpha) objArr[0];
                setPictureListener setpicturelistener = (setPictureListener) objArr[1];
                setContentCaptureSession setcontentcapturesession3 = (setContentCaptureSession) objArr[2];
                int i46 = f60766h;
                int i47 = i46 & 99;
                int i48 = ((i46 ^ 99) | i47) << 1;
                int i49 = -((i46 | 99) & (~i47));
                int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                f60767i = i50 % 128;
                int i51 = i50 % 2;
                if (((Boolean) setY(new Object[]{setpicturelistener}, 368134735, -368134722, (int) System.currentTimeMillis())).booleanValue()) {
                    int i52 = f60766h;
                    int i53 = i52 ^ 107;
                    int i54 = (((i52 & 107) | i53) << 1) - i53;
                    f60767i = i54 % 128;
                    if (i54 % 2 == 0) {
                        setY(new Object[]{settransitionalpha3, setcontentcapturesession3}, -519898057, 519898059, (int) System.currentTimeMillis());
                        int i55 = 44 / 0;
                    } else {
                        setY(new Object[]{settransitionalpha3, setcontentcapturesession3}, -519898057, 519898059, (int) System.currentTimeMillis());
                    }
                    int i56 = f60767i + 110;
                    i13 = (i56 ^ (-1)) + (i56 << 1);
                } else {
                    eu euVar2 = settransitionalpha3.f60770c;
                    int i57 = f60767i;
                    i13 = ((i57 ^ 77) - (~((i57 & 77) << 1))) - 1;
                }
                f60766h = i13 % 128;
                int i58 = i13 % 2;
                return null;
            case 11:
                return a(objArr);
            case 12:
                byte[] bArr3 = (byte[]) objArr[0];
                byte[] bArr4 = (byte[]) objArr[1];
                int i59 = f60766h;
                int i60 = i59 & 113;
                int i61 = -(-((i59 ^ 113) | i60));
                int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                f60767i = i62 % 128;
                int i63 = i62 % 2;
                if (!((Boolean) setInputExtras.setDividerPadding(new Object[]{bArr3, bArr4}, -481646848, 481646868, (int) System.currentTimeMillis())).booleanValue()) {
                    int i64 = f60766h + 33;
                    f60767i = i64 % 128;
                    int i65 = i64 % 2;
                    if (!((Boolean) setInputExtras.setDividerPadding(new Object[]{bArr4, bArr3}, -481646848, 481646868, (int) System.currentTimeMillis())).booleanValue()) {
                        int i66 = f60767i;
                        int i67 = i66 ^ 11;
                        int i68 = ((((i66 & 11) | i67) << 1) - (~(-i67))) - 1;
                        f60766h = i68 % 128;
                        if (i68 % 2 != 0) {
                            throw null;
                        }
                        bool = Boolean.FALSE;
                    } else {
                        int i69 = f60767i;
                        i14 = (i69 & 125) + (i69 | 125);
                        f60766h = i14 % 128;
                        if (i14 % 2 == 0) {
                            throw null;
                        }
                        bool = Boolean.TRUE;
                    }
                } else {
                    int i610 = f60767i;
                    i14 = (i610 & 125) + (i610 | 125);
                    f60766h = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                    bool = Boolean.TRUE;
                }
                return bool;
            case 13:
                setPictureListener setpicturelistener2 = (setPictureListener) objArr[0];
                int i70 = f60767i + 59;
                f60766h = i70 % 128;
                if (i70 % 2 != 0) {
                    setTitleMarginTop settitlemargintop = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener2}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener2));
                    int i71 = 35 / 0;
                    if (((Terminal) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop}, 2113948533, -2113948530, System.identityHashCode(settitlemargintop))) == Terminal.KERNEL_EFTPOS) {
                        int i72 = (-2) - ((f60767i + 92) ^ (-1));
                        f60766h = i72 % 128;
                        int i73 = i72 % 2;
                        bool = Boolean.TRUE;
                    } else {
                        int i74 = f60766h;
                        i15 = ((i74 | 65) << 1) - (((~i74) & 65) | (i74 & (-66)));
                        f60767i = i15 % 128;
                        if (i15 % 2 != 0) {
                            throw null;
                        }
                        bool = Boolean.FALSE;
                    }
                } else {
                    setTitleMarginTop settitlemargintop2 = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener2}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener2));
                    if (((Terminal) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop2}, 2113948533, -2113948530, System.identityHashCode(settitlemargintop2))) == Terminal.KERNEL_EFTPOS) {
                        int i75 = (-2) - ((f60767i + 92) ^ (-1));
                        f60766h = i75 % 128;
                        int i76 = i75 % 2;
                        bool = Boolean.TRUE;
                    } else {
                        int i77 = f60766h;
                        i15 = ((i77 | 65) << 1) - (((~i77) & 65) | (i77 & (-66)));
                        f60767i = i15 % 128;
                        if (i15 % 2 != 0) {
                            throw null;
                        }
                        bool = Boolean.FALSE;
                    }
                }
                return bool;
            case 14:
                setTransitionAlpha settransitionalpha4 = (setTransitionAlpha) objArr[0];
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[1];
                Terminal terminal = (Terminal) objArr[2];
                int i78 = 865402441;
                int i79 = -865402437;
                setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
                String str2 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                TransactionFailed transactionFailedCardScheme = setAnimation.CardScheme();
                boolean zAreEqual2 = Intrinsics.areEqual(str2, (String) TransactionFailed.setX(new Object[]{transactionFailedCardScheme}, 1914607362, -1914607356, System.identityHashCode(transactionFailedCardScheme)));
                setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
                String str3 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2));
                List list2 = (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure2));
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                int i80 = f60767i;
                int i81 = (i80 ^ 43) + ((i80 & 43) << 1);
                f60766h = i81 % 128;
                int i82 = i81 % 2;
                while (!(!it.hasNext())) {
                    System.identityHashCode(settransitionalpha4);
                    System.identityHashCode(settransitionalpha4);
                    Object next = it.next();
                    getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) next;
                    if (terminal == Terminal.KERNEL_EFTPOS) {
                        int i83 = f60766h + 35;
                        f60767i = i83 % 128;
                        int i84 = i83 % 2;
                        setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, i78, -865402437, System.identityHashCode(getbeeponfailure3));
                        if (list.contains((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3)))) {
                            System.identityHashCode(settransitionalpha4);
                            System.identityHashCode(settransitionalpha4);
                        } else {
                            int i85 = f60766h;
                            int i86 = i85 & 11;
                            int i87 = ((i85 ^ 11) | i86) << 1;
                            int i88 = -((i85 | 11) & (~i86));
                            int i89 = (i87 ^ i88) + ((i88 & i87) << 1);
                            int i90 = i89 % 128;
                            f60767i = i90;
                            int i91 = i89 % 2;
                            i21 = (-2) - ((i90 + 78) ^ (-1));
                            f60766h = i21 % 128;
                            if (i21 % 2 == 0) {
                                arrayList.add(next);
                                throw null;
                            }
                            arrayList.add(next);
                        }
                    } else {
                        int i810 = f60766h;
                        int i811 = i810 & 11;
                        int i812 = ((i810 ^ 11) | i811) << 1;
                        int i813 = -((i810 | 11) & (~i811));
                        int i814 = (i812 ^ i813) + ((i813 & i812) << 1);
                        int i92 = i814 % 128;
                        f60767i = i92;
                        int i93 = i814 % 2;
                        i21 = (-2) - ((i92 + 78) ^ (-1));
                        f60766h = i21 % 128;
                        if (i21 % 2 == 0) {
                            arrayList.add(next);
                            throw null;
                        }
                        arrayList.add(next);
                    }
                    i78 = 865402441;
                }
                if (arrayList.isEmpty()) {
                    int i94 = f60766h;
                    int i95 = i94 & 61;
                    int i96 = -(-((i94 ^ 61) | i95));
                    i16 = (i95 ^ i96) + ((i96 & i95) << 1);
                    f60767i = i16 % 128;
                    if (i16 % 2 == 0) {
                        int i97 = 96 / 0;
                        bool = Boolean.TRUE;
                    } else {
                        bool = Boolean.TRUE;
                    }
                } else {
                    int i98 = f60766h;
                    int i99 = ((i98 & (-84)) | ((~i98) & 83)) + ((i98 & 83) << 1);
                    f60767i = i99 % 128;
                    if (i99 % 2 == 0) {
                        arrayList.iterator();
                        throw null;
                    }
                    Iterator it2 = arrayList.iterator();
                    System.identityHashCode(settransitionalpha4);
                    System.identityHashCode(settransitionalpha4);
                    while (true) {
                        if (!(!it2.hasNext())) {
                            int i100 = f60767i;
                            int i101 = i100 & 43;
                            int i102 = i100 | 43;
                            int i103 = (i101 ^ i102) + ((i102 & i101) << 1);
                            f60766h = i103 % 128;
                            if (i103 % 2 != 0) {
                                getbeeponfailure = (getBeepOnFailure) it2.next();
                                setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, i79, System.identityHashCode(getbeeponfailure));
                                str = (String) setY(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4)), terminal}, -806679780, 806679788, (int) System.currentTimeMillis());
                                int i104 = 46 / 0;
                                if (str == null) {
                                    setScrollContainer setscrollcontainer5 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                    str = f60762d.get((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer5}, -888877733, 888877739, System.identityHashCode(setscrollcontainer5)));
                                    int i105 = f60766h;
                                    int i106 = (i105 & (-80)) | ((~i105) & 79);
                                    int i107 = -(-((i105 & 79) << 1));
                                    i17 = (i106 ^ i107) + ((i107 & i106) << 1);
                                    f60767i = i17 % 128;
                                } else {
                                    int i108 = f60767i;
                                    int i109 = i108 & 81;
                                    int i110 = ((i108 ^ 81) | i109) << 1;
                                    int i111 = -((i108 | 81) & (~i109));
                                    i17 = (i110 ^ i111) + ((i111 & i110) << 1);
                                    f60766h = i17 % 128;
                                }
                            } else {
                                getbeeponfailure = (getBeepOnFailure) it2.next();
                                setScrollContainer setscrollcontainer6 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                str = (String) setY(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer6}, -888877733, 888877739, System.identityHashCode(setscrollcontainer6)), terminal}, -806679780, 806679788, (int) System.currentTimeMillis());
                                if (str == null) {
                                    setScrollContainer setscrollcontainer7 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                    str = f60762d.get((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer7}, -888877733, 888877739, System.identityHashCode(setscrollcontainer7)));
                                    int i1010 = f60766h;
                                    int i1011 = (i1010 & (-80)) | ((~i1010) & 79);
                                    int i1012 = -(-((i1010 & 79) << 1));
                                    i17 = (i1011 ^ i1012) + ((i1012 & i1011) << 1);
                                    f60767i = i17 % 128;
                                } else {
                                    int i1013 = f60767i;
                                    int i1014 = i1013 & 81;
                                    int i112 = ((i1013 ^ 81) | i1014) << 1;
                                    int i113 = -((i1013 | 81) & (~i1014));
                                    i17 = (i112 ^ i113) + ((i113 & i112) << 1);
                                    f60766h = i17 % 128;
                                }
                            }
                            int i114 = i17 % 2;
                            if (str == null) {
                                int i115 = f60767i;
                                int i116 = i115 & 115;
                                int i117 = (((~i116) & (i115 | 115)) - (~(i116 << 1))) - 1;
                                f60766h = i117 % 128;
                                int i118 = i117 % 2;
                                int i119 = (i115 ^ 31) + ((i115 & 31) << 1);
                                f60766h = i119 % 128;
                                int i120 = i119 % 2;
                                z10 = true;
                            } else {
                                int i121 = f60767i + 9;
                                f60766h = i121 % 128;
                                int i122 = i121 % 2;
                                z10 = false;
                            }
                            if (zAreEqual2) {
                                i18 = -865402437;
                            } else {
                                System.identityHashCode(settransitionalpha4);
                                System.identityHashCode(settransitionalpha4);
                                setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                                i18 = -865402437;
                                setScrollContainer setscrollcontainer8 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                if (((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer8}, -888877733, 888877739, System.identityHashCode(setscrollcontainer8)), terminal}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue()) {
                                    int i123 = f60767i;
                                    int i124 = i123 ^ 71;
                                    int i125 = ((((i123 & 71) | i124) << 1) - (~(-i124))) - 1;
                                    f60766h = i125 % 128;
                                    int i126 = i125 % 2;
                                    z11 = false;
                                }
                                zAreEqual = Intrinsics.areEqual(str3, str);
                                if (!(!z10)) {
                                    int i127 = f60766h;
                                    i20 = ((i127 & (-86)) | ((~i127) & 85)) + ((i127 & 85) << 1);
                                    f60767i = i20 % 128;
                                    if (i20 % 2 == 0) {
                                        int i128 = 15 / 0;
                                        if (!z11) {
                                            if (!zAreEqual) {
                                            }
                                        }
                                        int i129 = f60766h;
                                        int i130 = i129 & 31;
                                        int i131 = (((i129 | 31) & (~i130)) - (~(i130 << 1))) - 1;
                                        int i132 = i131 % 128;
                                        f60767i = i132;
                                        int i133 = i131 % 2;
                                        int i134 = i132 & 119;
                                        int i135 = (i132 | 119) & (~i134);
                                        int i136 = -(-(i134 << 1));
                                        int i137 = (i135 ^ i136) + ((i136 & i135) << 1);
                                        f60766h = i137 % 128;
                                        int i138 = i137 % 2;
                                        bool = Boolean.FALSE;
                                    } else {
                                        if (!z11) {
                                            if (!zAreEqual) {
                                            }
                                        }
                                        int i1210 = f60766h;
                                        int i139 = i1210 & 31;
                                        int i1310 = (((i1210 | 31) & (~i139)) - (~(i139 << 1))) - 1;
                                        int i1311 = i1310 % 128;
                                        f60767i = i1311;
                                        int i1312 = i1310 % 2;
                                        int i1313 = i1311 & 119;
                                        int i1314 = (i1311 | 119) & (~i1313);
                                        int i1315 = -(-(i1313 << 1));
                                        int i1316 = (i1314 ^ i1315) + ((i1315 & i1314) << 1);
                                        f60766h = i1316 % 128;
                                        int i1317 = i1316 % 2;
                                        bool = Boolean.FALSE;
                                    }
                                    if (!(!((Boolean) setY(new Object[]{settransitionalpha4, getbeeponfailure, terminal}, -1561211127, 1561211141, System.identityHashCode(settransitionalpha4))).booleanValue())) {
                                        int i140 = f60767i;
                                        int i141 = i140 & 101;
                                        int i142 = (i140 | 101) & (~i141);
                                        int i143 = i141 << 1;
                                        i19 = ((i142 | i143) << 1) - (i142 ^ i143);
                                        int i144 = i19 % 128;
                                        f60766h = i144;
                                        if (i19 % 2 != 0) {
                                            z12 = false;
                                        } else {
                                            z12 = true;
                                        }
                                        int i145 = ((i144 & 85) - (~(i144 | 85))) - 1;
                                        f60767i = i145 % 128;
                                        int i146 = i145 % 2;
                                        if (!z12) {
                                            i79 = i18;
                                        }
                                    }
                                    int i1211 = f60766h;
                                    int i1318 = i1211 & 31;
                                    int i1319 = (((i1211 | 31) & (~i1318)) - (~(i1318 << 1))) - 1;
                                    int i13110 = i1319 % 128;
                                    f60767i = i13110;
                                    int i13111 = i1319 % 2;
                                    int i13112 = i13110 & 119;
                                    int i13113 = (i13110 | 119) & (~i13112);
                                    int i13114 = -(-(i13112 << 1));
                                    int i13115 = (i13113 ^ i13114) + ((i13114 & i13113) << 1);
                                    f60766h = i13115 % 128;
                                    int i13116 = i13115 % 2;
                                    bool = Boolean.FALSE;
                                } else if (!zAreEqual) {
                                    if (!(!((Boolean) setY(new Object[]{settransitionalpha4, getbeeponfailure, terminal}, -1561211127, 1561211141, System.identityHashCode(settransitionalpha4))).booleanValue())) {
                                        int i147 = f60767i;
                                        int i148 = i147 & 101;
                                        int i149 = (i147 | 101) & (~i148);
                                        int i1410 = i148 << 1;
                                        i19 = ((i149 | i1410) << 1) - (i149 ^ i1410);
                                        int i1411 = i19 % 128;
                                        f60766h = i1411;
                                        if (i19 % 2 != 0) {
                                            z12 = false;
                                        } else {
                                            z12 = true;
                                        }
                                        int i1412 = ((i1411 & 85) - (~(i1411 | 85))) - 1;
                                        f60767i = i1412 % 128;
                                        int i1413 = i1412 % 2;
                                        if (!z12) {
                                            i79 = i18;
                                        }
                                    }
                                    int i1212 = f60766h;
                                    int i13117 = i1212 & 31;
                                    int i13118 = (((i1212 | 31) & (~i13117)) - (~(i13117 << 1))) - 1;
                                    int i13119 = i13118 % 128;
                                    f60767i = i13119;
                                    int i131110 = i13118 % 2;
                                    int i131111 = i13119 & 119;
                                    int i131112 = (i13119 | 119) & (~i131111);
                                    int i131113 = -(-(i131111 << 1));
                                    int i131114 = (i131112 ^ i131113) + ((i131113 & i131112) << 1);
                                    f60766h = i131114 % 128;
                                    int i131115 = i131114 % 2;
                                    bool = Boolean.FALSE;
                                }
                                int i150 = f60767i;
                                int i151 = i150 & 27;
                                int i152 = -(-((i150 ^ 27) | i151));
                                int i153 = ((i151 | i152) << 1) - (i152 ^ i151);
                                f60766h = i153 % 128;
                                int i154 = i153 % 2;
                                int i1213 = f60766h;
                                int i131116 = i1213 & 31;
                                int i131117 = (((i1213 | 31) & (~i131116)) - (~(i131116 << 1))) - 1;
                                int i131118 = i131117 % 128;
                                f60767i = i131118;
                                int i131119 = i131117 % 2;
                                int i1311110 = i131118 & 119;
                                int i1311111 = (i131118 | 119) & (~i1311110);
                                int i1311112 = -(-(i1311110 << 1));
                                int i1311113 = (i1311111 ^ i1311112) + ((i1311112 & i1311111) << 1);
                                f60766h = i1311113 % 128;
                                int i1311114 = i1311113 % 2;
                                bool = Boolean.FALSE;
                            }
                            int i155 = f60767i;
                            int i156 = (i155 & 43) + (i155 | 43);
                            f60766h = i156 % 128;
                            int i157 = i156 % 2;
                            z11 = true;
                            zAreEqual = Intrinsics.areEqual(str3, str);
                            if (!(!z10)) {
                                int i1214 = f60766h;
                                i20 = ((i1214 & (-86)) | ((~i1214) & 85)) + ((i1214 & 85) << 1);
                                f60767i = i20 % 128;
                                if (i20 % 2 == 0) {
                                    int i1215 = 15 / 0;
                                    if (!z11) {
                                        if (!zAreEqual) {
                                        }
                                    }
                                    int i1216 = f60766h;
                                    int i1311115 = i1216 & 31;
                                    int i1311116 = (((i1216 | 31) & (~i1311115)) - (~(i1311115 << 1))) - 1;
                                    int i1311117 = i1311116 % 128;
                                    f60767i = i1311117;
                                    int i1311118 = i1311116 % 2;
                                    int i1311119 = i1311117 & 119;
                                    int i13111110 = (i1311117 | 119) & (~i1311119);
                                    int i13111111 = -(-(i1311119 << 1));
                                    int i13111112 = (i13111110 ^ i13111111) + ((i13111111 & i13111110) << 1);
                                    f60766h = i13111112 % 128;
                                    int i13111113 = i13111112 % 2;
                                    bool = Boolean.FALSE;
                                } else {
                                    if (!z11) {
                                        if (!zAreEqual) {
                                        }
                                    }
                                    int i1217 = f60766h;
                                    int i13111114 = i1217 & 31;
                                    int i13111115 = (((i1217 | 31) & (~i13111114)) - (~(i13111114 << 1))) - 1;
                                    int i13111116 = i13111115 % 128;
                                    f60767i = i13111116;
                                    int i13111117 = i13111115 % 2;
                                    int i13111118 = i13111116 & 119;
                                    int i13111119 = (i13111116 | 119) & (~i13111118);
                                    int i131111110 = -(-(i13111118 << 1));
                                    int i131111111 = (i13111119 ^ i131111110) + ((i131111110 & i13111119) << 1);
                                    f60766h = i131111111 % 128;
                                    int i131111112 = i131111111 % 2;
                                    bool = Boolean.FALSE;
                                }
                                if (!(!((Boolean) setY(new Object[]{settransitionalpha4, getbeeponfailure, terminal}, -1561211127, 1561211141, System.identityHashCode(settransitionalpha4))).booleanValue())) {
                                    int i1414 = f60767i;
                                    int i1415 = i1414 & 101;
                                    int i1416 = (i1414 | 101) & (~i1415);
                                    int i1417 = i1415 << 1;
                                    i19 = ((i1416 | i1417) << 1) - (i1416 ^ i1417);
                                    int i1418 = i19 % 128;
                                    f60766h = i1418;
                                    if (i19 % 2 != 0) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    int i1419 = ((i1418 & 85) - (~(i1418 | 85))) - 1;
                                    f60767i = i1419 % 128;
                                    int i14110 = i1419 % 2;
                                    if (!z12) {
                                        i79 = i18;
                                    }
                                }
                                int i1218 = f60766h;
                                int i131111113 = i1218 & 31;
                                int i131111114 = (((i1218 | 31) & (~i131111113)) - (~(i131111113 << 1))) - 1;
                                int i131111115 = i131111114 % 128;
                                f60767i = i131111115;
                                int i131111116 = i131111114 % 2;
                                int i131111117 = i131111115 & 119;
                                int i131111118 = (i131111115 | 119) & (~i131111117);
                                int i131111119 = -(-(i131111117 << 1));
                                int i1311111110 = (i131111118 ^ i131111119) + ((i131111119 & i131111118) << 1);
                                f60766h = i1311111110 % 128;
                                int i1311111111 = i1311111110 % 2;
                                bool = Boolean.FALSE;
                            } else if (!zAreEqual) {
                                if (!(!((Boolean) setY(new Object[]{settransitionalpha4, getbeeponfailure, terminal}, -1561211127, 1561211141, System.identityHashCode(settransitionalpha4))).booleanValue())) {
                                    int i14111 = f60767i;
                                    int i14112 = i14111 & 101;
                                    int i14113 = (i14111 | 101) & (~i14112);
                                    int i14114 = i14112 << 1;
                                    i19 = ((i14113 | i14114) << 1) - (i14113 ^ i14114);
                                    int i14115 = i19 % 128;
                                    f60766h = i14115;
                                    if (i19 % 2 != 0) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    int i14116 = ((i14115 & 85) - (~(i14115 | 85))) - 1;
                                    f60767i = i14116 % 128;
                                    int i14117 = i14116 % 2;
                                    if (!z12) {
                                        i79 = i18;
                                    }
                                }
                                int i1219 = f60766h;
                                int i1311111112 = i1219 & 31;
                                int i1311111113 = (((i1219 | 31) & (~i1311111112)) - (~(i1311111112 << 1))) - 1;
                                int i1311111114 = i1311111113 % 128;
                                f60767i = i1311111114;
                                int i1311111115 = i1311111113 % 2;
                                int i1311111116 = i1311111114 & 119;
                                int i1311111117 = (i1311111114 | 119) & (~i1311111116);
                                int i1311111118 = -(-(i1311111116 << 1));
                                int i1311111119 = (i1311111117 ^ i1311111118) + ((i1311111118 & i1311111117) << 1);
                                f60766h = i1311111119 % 128;
                                int i13111111110 = i1311111119 % 2;
                                bool = Boolean.FALSE;
                            }
                            int i158 = f60767i;
                            int i159 = i158 & 27;
                            int i1510 = -(-((i158 ^ 27) | i159));
                            int i1511 = ((i159 | i1510) << 1) - (i1510 ^ i159);
                            f60766h = i1511 % 128;
                            int i1512 = i1511 % 2;
                            int i12110 = f60766h;
                            int i13111111111 = i12110 & 31;
                            int i13111111112 = (((i12110 | 31) & (~i13111111111)) - (~(i13111111111 << 1))) - 1;
                            int i13111111113 = i13111111112 % 128;
                            f60767i = i13111111113;
                            int i13111111114 = i13111111112 % 2;
                            int i13111111115 = i13111111113 & 119;
                            int i13111111116 = (i13111111113 | 119) & (~i13111111115);
                            int i13111111117 = -(-(i13111111115 << 1));
                            int i13111111118 = (i13111111116 ^ i13111111117) + ((i13111111117 & i13111111116) << 1);
                            f60766h = i13111111118 % 128;
                            int i13111111119 = i13111111118 % 2;
                            bool = Boolean.FALSE;
                        } else {
                            int i910 = f60766h;
                            int i911 = i910 & 61;
                            int i912 = -(-((i910 ^ 61) | i911));
                            i16 = (i911 ^ i912) + ((i912 & i911) << 1);
                            f60767i = i16 % 128;
                            if (i16 % 2 == 0) {
                                int i913 = 96 / 0;
                                bool = Boolean.TRUE;
                            } else {
                                bool = Boolean.TRUE;
                            }
                        }
                    }
                }
                return bool;
            case 15:
                bool = Boolean.FALSE;
                setTransitionAlpha settransitionalpha5 = (setTransitionAlpha) objArr[0];
                getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) objArr[1];
                Terminal terminal2 = (Terminal) objArr[2];
                int i160 = f60766h + 93;
                f60767i = i160 % 128;
                if (i160 % 2 == 0) {
                    throw null;
                }
                if (getbeeponfailure4 == null || !((Boolean) setAllCaps.setY(new Object[]{getbeeponfailure4, terminal2, list}, 783379485, -783379485, (int) System.currentTimeMillis())).booleanValue()) {
                    int i161 = f60766h;
                    int i162 = ((i161 & 49) - (~(i161 | 49))) - 1;
                    f60767i = i162 % 128;
                    if (i162 % 2 == 0) {
                        throw null;
                    }
                } else if (terminal2 != Terminal.KERNEL_3) {
                    int i163 = f60767i;
                    int i164 = i163 & 123;
                    int i165 = (i163 ^ 123) | i164;
                    int i166 = (i164 & i165) + (i165 | i164);
                    f60766h = i166 % 128;
                    if (i166 % 2 != 0) {
                        ((Boolean) setY(new Object[]{settransitionalpha5, getbeeponfailure4, terminal2}, -1561211127, 1561211141, System.identityHashCode(settransitionalpha5))).booleanValue();
                        throw null;
                    }
                    if (((Boolean) setY(new Object[]{settransitionalpha5, getbeeponfailure4, terminal2}, -1561211127, 1561211141, System.identityHashCode(settransitionalpha5))).booleanValue()) {
                        int i167 = f60766h;
                        i22 = (i167 & 41) + (i167 | 41);
                        f60767i = i22 % 128;
                        if (i22 % 2 != 0) {
                            throw null;
                        }
                        bool = Boolean.TRUE;
                    } else {
                        int i168 = f60766h;
                        int i169 = ((i168 & (-34)) | ((~i168) & 33)) + ((i168 & 33) << 1);
                        int i170 = i169 % 128;
                        f60767i = i170;
                        int i171 = i169 % 2;
                        int i172 = i170 + 87;
                        f60766h = i172 % 128;
                        if (i172 % 2 != 0) {
                            int i173 = 79 / 0;
                        }
                    }
                } else {
                    int i1610 = f60766h;
                    i22 = (i1610 & 41) + (i1610 | 41);
                    f60767i = i22 % 128;
                    if (i22 % 2 != 0) {
                        throw null;
                    }
                    bool = Boolean.TRUE;
                }
                return bool;
            case 16:
                setTextColor settextcolor = new setTextColor(null, null, null, null, false, false, null, null, false, null, setMaxLines.setX, false, null, null, 15359, null);
                int i174 = f60766h;
                int i175 = i174 ^ 111;
                int i176 = ((i174 & 111) | i175) << 1;
                int i177 = -i175;
                int i178 = ((i176 | i177) << 1) - (i176 ^ i177);
                f60767i = i178 % 128;
                if (i178 % 2 != 0) {
                    return settextcolor;
                }
                int i179 = 73 / 0;
                return settextcolor;
            case 17:
                getEmvLibVersion getemvlibversion = (getEmvLibVersion) objArr[0];
                Terminal terminal3 = (Terminal) objArr[1];
                int i180 = f60766h + 9;
                f60767i = i180 % 128;
                if (i180 % 2 != 0) {
                    if (getemvlibversion == getEmvLibVersion.setOnLongClickListener) {
                        if (terminal3 == Terminal.KERNEL_EFTPOS) {
                            int i181 = f60767i;
                            int i182 = i181 ^ 29;
                            int i183 = (i181 & 29) << 1;
                            int i184 = ((i182 | i183) << 1) - (i182 ^ i183);
                            f60766h = i184 % 128;
                            int i185 = i184 % 2;
                            i23 = i181 + 5;
                            f60766h = i23 % 128;
                            if (i23 % 2 != 0) {
                                int i186 = 37 / 0;
                            }
                            bool = Boolean.FALSE;
                        }
                    }
                    return bool;
                }
                int i187 = 95 / 0;
                if (getemvlibversion == getEmvLibVersion.setOnLongClickListener) {
                    if (terminal3 == Terminal.KERNEL_EFTPOS) {
                        int i188 = f60767i;
                        int i189 = i188 ^ 29;
                        int i1810 = (i188 & 29) << 1;
                        int i1811 = ((i189 | i1810) << 1) - (i189 ^ i1810);
                        f60766h = i1811 % 128;
                        int i1812 = i1811 % 2;
                        i23 = i188 + 5;
                        f60766h = i23 % 128;
                        if (i23 % 2 != 0) {
                            int i1813 = 37 / 0;
                        }
                        bool = Boolean.FALSE;
                    }
                }
                return bool;
                int i190 = f60766h;
                int i191 = i190 & 7;
                int i192 = -(-((i190 ^ 7) | i191));
                int i193 = (i191 & i192) + (i192 | i191);
                f60767i = i193 % 128;
                if (i193 % 2 == 0) {
                    throw null;
                }
                bool = Boolean.TRUE;
                return bool;
            default:
                setPictureListener setpicturelistener3 = (setPictureListener) objArr[0];
                int i194 = f60766h;
                int i195 = i194 & 107;
                int i196 = (i195 - (~(-(-((i194 ^ 107) | i195))))) - 1;
                f60767i = i196 % 128;
                int i197 = i196 % 2;
                setTitleMarginTop settitlemargintop3 = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener3}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener3));
                if (((Terminal) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop3}, 2113948533, -2113948530, System.identityHashCode(settitlemargintop3))) == Terminal.KERNEL_3) {
                    int i198 = f60766h;
                    int i199 = (i198 & 53) + (i198 | 53);
                    int i200 = i199 % 128;
                    f60767i = i200;
                    int i201 = i199 % 2;
                    int i202 = (i200 & (-10)) | ((~i200) & 9);
                    int i203 = -(-((i200 & 9) << 1));
                    int i204 = (i202 & i203) + (i203 | i202);
                    f60766h = i204 % 128;
                    int i205 = i204 % 2;
                    bool = Boolean.TRUE;
                } else {
                    int i206 = f60767i;
                    int i207 = i206 ^ 65;
                    int i208 = ((i206 & 65) | i207) << 1;
                    int i209 = -i207;
                    int i210 = ((i208 | i209) << 1) - (i208 ^ i209);
                    f60766h = i210 % 128;
                    if (i210 % 2 != 0) {
                        throw null;
                    }
                    bool = Boolean.FALSE;
                }
                return bool;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.setNextFocusForwardId
    @Nullable
    public final Object setY(@NotNull setPictureListener setpicturelistener, @Nullable getBeepOnFailure getbeeponfailure, @Nullable getBeepOnFailure getbeeponfailure2, @NotNull values valuesVar, @NotNull Continuation<? super setScreenReaderFocusable> continuation) {
        return setY(new Object[]{this, setpicturelistener, getbeeponfailure, getbeeponfailure2, valuesVar, continuation}, -2098094371, 2098094374, System.identityHashCode(this));
    }
}
