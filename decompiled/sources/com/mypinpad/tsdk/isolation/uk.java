package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00017B\u0081\u0001\u0012\u0006\u0010/\u001a\u00020.\u0012\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\f0\u001fj\u0002`1\u0012\u0006\u00104\u001a\u000203\u0012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\f0\u001f\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u001f\u0012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u001f\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0$\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b5\u00106J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u000bH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u000eH\u0014J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0010H\u0014J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0012H\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0014H\u0014J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0016H\u0014J\b\u0010\u0018\u001a\u00020\fH\u0014J\b\u0010\u0019\u001a\u00020\fH\u0014J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u001bH\u0016J\u000e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u001dR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"R\u0018\u0010)\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00068"}, d2 = {"Lcom/mypinpad/tsdk/internal/terminal/transaction/TransactionOutcomeListener;", "Lcom/mypinpad/tsdk/internal/emvlib/OutcomeListener;", "Lcom/mypinpad/softpos/emv/integration/contract/TransactionError;", "error", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkTransactionNotAuthorisedReason;", "getErrorOtherCardResult", "getNotAuthorisedResult", "Lcom/mypinpad/softpos/emv/integration/contract/TransactionFinishedOutcome;", "outcome", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkTransactionNotAuthorised;", "getTransactionNotAuthorised", "Lcom/mypinpad/softpos/emv/integration/contract/DeclineRequestOutcome;", "", "handleDeclineRequestOutcome", "Lcom/mypinpad/softpos/emv/integration/contract/IllegalStateOutcome;", "handleIllegalStateOutcome", "Lcom/mypinpad/softpos/emv/integration/contract/OnlineRequestOutcome;", "handleOnlineRequestOutcome", "Lcom/mypinpad/softpos/emv/integration/contract/OnlineRequestWithPinOutcome;", "handleOnlineRequestWithPinOutcome", "Lcom/mypinpad/softpos/emv/integration/contract/PinRequestOutcome;", "handlePinRequestOutcome", "Lcom/mypinpad/softpos/emv/integration/contract/SignatureRequestOutcome;", "handleSignatureRequestOutcome", "handleTimeoutTransactionOutcome", "handleTransactionCancelledOutcome", "handleTransactionFinishedOutcome", "Lcom/mypinpad/softpos/emv/integration/contract/EmvTerminalOutcome;", "onTerminalOutcome", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkTransactionFailed;", "setProcessingError", "Lkotlin/Function1;", "", "onOnlineRequest", "Lkotlin/jvm/functions/Function1;", "onOnlineRequestWithPin", "Lkotlin/Function0;", "onPinRequest", "Lkotlin/jvm/functions/Function0;", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkTransactionResult;", "onTransactionResult", "processingError", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkTransactionFailed;", "Lcom/mypinpad/tsdk/internal/terminal/transaction/TransactionCompletedBuilder;", "transactionCompletedBuilder", "Lcom/mypinpad/tsdk/internal/terminal/transaction/TransactionCompletedBuilder;", "Lcom/mypinpad/common/threading/ExecutionContext;", "context", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkUiMessage;", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/OnSdkUiMessage;", "onSdkUiMessage", "Ljava/util/UUID;", "transactionId", "<init>", "(Lcom/mypinpad/common/threading/ExecutionContext;Lkotlin/jvm/functions/Function1;Ljava/util/UUID;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/mypinpad/tsdk/internal/terminal/transaction/TransactionCompletedBuilder;)V", "Companion", "sdk-android_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionOutcomeListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionOutcomeListener.kt\ncom/mypinpad/tsdk/internal/terminal/transaction/TransactionOutcomeListener\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,216:1\n7#2,8:217\n7#2,8:225\n7#2,8:233\n*S KotlinDebug\n*F\n+ 1 TransactionOutcomeListener.kt\ncom/mypinpad/tsdk/internal/terminal/transaction/TransactionOutcomeListener\n*L\n80#1:217,8\n92#1:225,8\n123#1:233,8\n*E\n"})
public final class uk extends nh {

    @NotNull
    public static final setOnFocusChangeListener setX = new setOnFocusChangeListener(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f61325t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f61326u = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Function1<rs, Unit> f61327n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Function1<byte[], Unit> f61328o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Function1<byte[], Unit> f61329p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f61330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final uj f61331r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public rw f61332s;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setDividerPadding", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ rw f61334q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rw rwVar) {
            super(0);
            this.f61334q0 = rwVar;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-520)) + (i10 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY);
            int i14 = ~i12;
            int i15 = ((i11 | i12) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (((~(i14 | i11)) | i10) * (-1042)) + i13;
            int i16 = ~i10;
            if ((((~(i10 | i14 | i11)) | (~(i12 | i16)) | (~((~i11) | i16))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i15 != 1) {
                a aVar = (a) objArr[0];
                uk.setCompoundDrawableTintBlendMode(uk.this).invoke(aVar.f61334q0);
                return null;
            }
            a aVar2 = (a) objArr[0];
            a(new Object[]{aVar2}, -109637863, 109637863, System.identityHashCode(aVar2));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, -1479095297, 1479095298, System.identityHashCode(this));
        }
    }

    public /* synthetic */ class setCompoundDrawableTintBlendMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f61335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f61336b;
        public static final /* synthetic */ int[] setDividerPadding;
        public static final /* synthetic */ int[] setOnFocusChangeListener;

        static {
            int[] iArr = new int[setClipChildren.values().length];
            try {
                iArr[setClipChildren.setNavigationOnClickListener.ordinal()] = 1;
                int i10 = (0 - (-52)) - 1;
                f61336b = i10 % 128;
                int i11 = i10 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setClipChildren.setX.ordinal()] = 2;
                int i12 = f61336b;
                int i13 = i12 & 95;
                int i14 = ((i12 ^ 95) | i13) << 1;
                int i15 = -((i12 | 95) & (~i13));
                int i16 = (i14 & i15) + (i15 | i14);
                f61335a = i16 % 128;
                int i17 = i16 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            setOnFocusChangeListener = iArr;
            int[] iArr2 = new int[setSaveFromParentEnabled.values().length];
            try {
                iArr2[setSaveFromParentEnabled.setX.ordinal()] = 1;
                int i18 = f61335a;
                int i19 = ((i18 & (-32)) | ((~i18) & 31)) + ((i18 & 31) << 1);
                f61336b = i19 % 128;
                int i20 = i19 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[setSaveFromParentEnabled.setOnFocusChangeListener.ordinal()] = 2;
                int i21 = f61335a;
                int i22 = i21 & 5;
                int i23 = -(-((i21 ^ 5) | i22));
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                f61336b = i24 % 128;
                int i25 = i24 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[setSaveFromParentEnabled.setY.ordinal()] = 3;
                int i26 = f61335a;
                int i27 = ((i26 ^ 98) + ((i26 & 98) << 1)) - 1;
                f61336b = i27 % 128;
                int i28 = i27 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[setSaveFromParentEnabled.setDividerPadding.ordinal()] = 4;
                int i29 = f61335a + 49;
                f61336b = i29 % 128;
                int i30 = i29 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[setSaveFromParentEnabled.setLayoutAnimation.ordinal()] = 5;
                int i31 = f61336b;
                int i32 = ((i31 & (-54)) | ((~i31) & 53)) + ((i31 & 53) << 1);
                f61335a = i32 % 128;
                int i33 = i32 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[setSaveFromParentEnabled.setCompoundDrawableTintBlendMode.ordinal()] = 6;
                int i34 = f61336b;
                int i35 = (i34 ^ 61) + ((i34 & 61) << 1);
                f61335a = i35 % 128;
                int i36 = i35 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            setDividerPadding = iArr2;
            int i37 = f61335a;
            int i38 = ((i37 ^ 44) + ((i37 & 44) << 1)) - 1;
            f61336b = i38 % 128;
            int i39 = i38 % 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/uk$setOnFocusChangeListener;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class setOnFocusChangeListener {
        public setOnFocusChangeListener() {
        }

        public /* synthetic */ setOnFocusChangeListener(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i10 = f61326u;
        int i11 = ((i10 ^ 91) | (i10 & 91)) << 1;
        int i12 = -(((~i10) & 91) | (i10 & (-92)));
        int i13 = (i11 & i12) + (i12 | i11);
        f61325t = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uk(@NotNull setVisibility setvisibility, @NotNull Function1<? super sa, Unit> function1, @NotNull UUID uuid, @NotNull Function1<? super rs, Unit> function2, @NotNull Function1<? super byte[], Unit> function3, @NotNull Function1<? super byte[], Unit> function4, @NotNull Function0<Unit> function0, @NotNull uj ujVar) {
        super(setvisibility, function1, uuid);
        Intrinsics.checkNotNullParameter(setvisibility, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function3, "");
        Intrinsics.checkNotNullParameter(function4, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(ujVar, "");
        this.f61327n = function2;
        this.f61328o = function3;
        this.f61329p = function4;
        this.f61330q = function0;
        this.f61331r = ujVar;
    }

    public static final /* synthetic */ Function1 setCompoundDrawableTintBlendMode(uk ukVar) {
        return (Function1) setDividerPadding(new Object[]{ukVar}, 525427595, -525427587, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x055e, code lost:
    
        if (r2 != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0566, code lost:
    
        if (r2 != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0568, code lost:
    
        r0.f61327n.invoke(r2);
        r0 = com.mypinpad.tsdk.isolation.uk.f61325t;
        r1 = r0 & 117;
        r0 = ((r0 | 117) & (~r1)) + (r1 << 1);
        com.mypinpad.tsdk.isolation.uk.f61326u = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0596, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.setSelectedGroup.setOnFocusChangeListener(new java.lang.Object[]{r1}, 1719180190, -1719180185, java.lang.System.identityHashCode(r1))).booleanValue() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0598, code lost:
    
        r3 = r1.setNavigationOnClickListener();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r3);
        r2 = new com.mypinpad.tsdk.isolation.rp(com.mypinpad.tsdk.isolation.nc.setY(r3));
        r3 = com.mypinpad.tsdk.isolation.uk.f61325t;
        r4 = r3 & 119;
        r3 = (r3 ^ 119) | r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x05af, code lost:
    
        r4 = r4 + r3;
        com.mypinpad.tsdk.isolation.uk.f61326u = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x05b6, code lost:
    
        r2 = (com.mypinpad.tsdk.isolation.rt) setDividerPadding(new java.lang.Object[]{r1}, 1912784125, -1912784111, (int) java.lang.System.currentTimeMillis());
        r3 = com.mypinpad.tsdk.isolation.uk.f61325t + 50;
        r4 = r3 ^ (-1);
        r3 = r3 << 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x05d3, code lost:
    
        r3 = r0.f61327n;
        r4 = (byte[]) com.mypinpad.tsdk.isolation.setSelectedGroup.setOnFocusChangeListener(new java.lang.Object[]{r1}, -758206076, 758206077, java.lang.System.identityHashCode(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x05e9, code lost:
    
        if (r4 != null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x05eb, code lost:
    
        r4 = com.mypinpad.tsdk.isolation.uk.f61326u + 85;
        r5 = r4 % 128;
        com.mypinpad.tsdk.isolation.uk.f61325t = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x05f4, code lost:
    
        if ((r4 % 2) == 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x05f6, code lost:
    
        r4 = new byte[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x05f9, code lost:
    
        r4 = new byte[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x05fb, code lost:
    
        r6 = r5 & 115;
        r5 = (r5 ^ 115) | r6;
        r7 = (r6 & r5) + (r5 | r6);
        com.mypinpad.tsdk.isolation.uk.f61326u = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0609, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.nh.setDividerPadding((com.mypinpad.tsdk.isolation.setClipChildren) com.mypinpad.tsdk.isolation.setSelectedGroup.setOnFocusChangeListener(new java.lang.Object[]{r1}, -648065664, 648065668, java.lang.System.identityHashCode(r1)), (com.mypinpad.tsdk.isolation.setProgressTintList) com.mypinpad.tsdk.isolation.setSelectedGroup.setOnFocusChangeListener(new java.lang.Object[]{r1}, -1836225693, 1836225693, java.lang.System.identityHashCode(r1)));
        r0 = r0.f61331r;
        r3.invoke((com.mypinpad.tsdk.isolation.rr) com.mypinpad.tsdk.isolation.uj.setY(new java.lang.Object[]{r0, r2, r4, r1}, 1616775831, -1616775829, java.lang.System.identityHashCode(r0)));
        r0 = com.mypinpad.tsdk.isolation.uk.f61326u;
        r1 = r0 & 43;
        r1 = (r1 - (~(-(-((r0 ^ 43) | r1))))) - 1;
        com.mypinpad.tsdk.isolation.uk.f61325t = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0665, code lost:
    
        if ((r1 % 2) == 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0667, code lost:
    
        r8 = 51 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setDividerPadding(java.lang.Object[] r16, int r17, int r18, int r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.uk.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.nh
    public final void setOnDragListener() throws Throwable {
        setDividerPadding(new Object[]{this}, 1760035476, -1760035465, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.nh
    public final void setOnFocusChangeListener(@NotNull setHintTextColor sethinttextcolor) throws Throwable {
        setDividerPadding(new Object[]{this, sethinttextcolor}, 1721573451, -1721573444, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.nh
    public final void setX() throws Throwable {
        setDividerPadding(new Object[]{this}, -1359183407, 1359183407, System.identityHashCode(this));
    }

    public final void setY(@NotNull rw rwVar) {
        setDividerPadding(new Object[]{this, rwVar}, 575726012, -575726002, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.nh
    public final void setCompoundDrawableTintBlendMode(@NotNull setStateDescription setstatedescription) throws Throwable {
        setDividerPadding(new Object[]{this, setstatedescription}, 478851878, -478851869, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.nh
    public final void setOnFocusChangeListener(@NotNull setHovered sethovered) throws Throwable {
        setDividerPadding(new Object[]{this, sethovered}, 770294111, -770294107, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.nh
    public final void setX(@NotNull setSelectedGroup setselectedgroup) throws Throwable {
        setDividerPadding(new Object[]{this, setselectedgroup}, -705997901, 705997904, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.nh
    public final void setCompoundDrawableTintBlendMode(@NotNull setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) throws Throwable {
        setDividerPadding(new Object[]{this, setautosizetexttypeuniformwithconfiguration}, 144865747, -144865735, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.nh
    public final void setOnFocusChangeListener(@NotNull description descriptionVar) throws Throwable {
        setDividerPadding(new Object[]{this, descriptionVar}, 1905026916, -1905026910, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.nh, com.mypinpad.tsdk.isolation.component20
    public final void setCompoundDrawableTintBlendMode(@NotNull setSystemGestureExclusionRects setsystemgestureexclusionrects) throws Throwable {
        setDividerPadding(new Object[]{this, setsystemgestureexclusionrects}, -690345073, 690345078, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.nh
    public final void setDividerPadding(@NotNull component21 component21Var) throws Throwable {
        setDividerPadding(new Object[]{this, component21Var}, -681383606, 681383619, System.identityHashCode(this));
    }
}
