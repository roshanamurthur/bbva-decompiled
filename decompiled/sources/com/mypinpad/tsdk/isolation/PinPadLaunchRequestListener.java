package com.mypinpad.tsdk.isolation;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001<B\u0017\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\b:\u0010;J\u001e\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JV\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J.\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0002J \u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0002J\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002Jb\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H\u0002J\u001c\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u0010\r\u001a\u00020\fJ\u0014\u0010%\u001a\u0004\u0018\u00010 2\b\u0010$\u001a\u0004\u0018\u00010\bH\u0002J\u0014\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010&\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010(\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010)\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\fJ\u0012\u0010*\u001a\u00020\u00162\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u000e\u0010,\u001a\u0004\u0018\u00010+*\u00020\u000eH\u0002J\u0010\u0010.\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010-H\u0002J\f\u0010.\u001a\u00020\n*\u00020/H\u0002J\f\u0010.\u001a\u000201*\u000200H\u0002J\u000e\u00103\u001a\u000202*\u0004\u0018\u00010\fH\u0002R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/mypinpad/softpos/emv/terminal/TerminalOutcomeBuilder;", "Lcom/mypinpad/softpos/emv/terminal/entrypoint/TerminalOutcomeBuilderProvider;", "Lcom/mypinpad/softpos/emv/terminal/entrypoint/model/TerminalProcessingOutcome;", "terminalProcessingOutcome", "Lkotlin/Pair;", "Lcom/mypinpad/softpos/emv/integration/contract/EmvTerminalOutcome;", "Lcom/mypinpad/softpos/emv/terminal/entrypoint/TerminalOutcomeBuilderProvider$FeedbackTone;", "buildCvmOutcome", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;", "onlineRequest", "Lcom/mypinpad/softpos/emv/integration/contract/UiMessageId;", "uiMessageId", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/response/outcome/UserInterfaceRequest;", "uiRequest", "", EventDataKeys.Analytics.ANALYTICS_ID, "Lcom/mypinpad/softpos/emv/integration/transaction/model/CardScheme;", "cardScheme", "discretionaryTagList", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/response/outcome/ErrorIndication;", "errorIndication", "buildDeclineRequestOutcome", "", "isError", "buildFinishedOutcome", "buildTerminalOutcome", "Lcom/mypinpad/softpos/emv/integration/contract/TransactionCancelledOutcome;", "buildTransactionCancelledOutcome", "Lcom/mypinpad/softpos/emv/integration/contract/TransactionError;", "buildTransactionError", "approved", "error", "Lcom/mypinpad/softpos/emv/integration/security/EncryptedTag;", "emvTagList", "buildTransactionFinishedOutcome", "buildUiOutcome", "tlv", "encryptTlv", "uiStatus", "getBeep", "getUiMessageId", "isPresentCardAgainUIRequest", "isRefund", "Lcom/mypinpad/softpos/emv/integration/transaction/model/Currency;", "mapToCurrency", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/CardScheme;", "mapToPublic", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelMessageIdentifierEnum;", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/ValueQualifier;", "Lcom/mypinpad/softpos/emv/integration/contract/ValueQualifier;", "Lcom/mypinpad/softpos/emv/integration/contract/UiRequestData;", "mapToUiRequestData", "Lcom/mypinpad/softpos/emv/terminal/TerminalOutcomeFactory;", "outcomeFactory", "Lcom/mypinpad/softpos/emv/terminal/TerminalOutcomeFactory;", "Lcom/mypinpad/softpos/emv/integration/security/SecureEncryptor;", "secureEncryptor", "Lcom/mypinpad/softpos/emv/integration/security/SecureEncryptor;", "<init>", "(Lcom/mypinpad/softpos/emv/integration/security/SecureEncryptor;Lcom/mypinpad/softpos/emv/terminal/TerminalOutcomeFactory;)V", "Companion", "emv-payment-terminal_release"}, k = 1, mv = {1, 5, 1})
public final class PinPadLaunchRequestListener implements setFastScrollEnabled {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f51793c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f51794d = 1;

    @NotNull
    public static final setY setY = new setY(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final component15 f51795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setCompoundDrawableTintList f51796b;

    public /* synthetic */ class setX {
        public static final /* synthetic */ int[] getNavBarTitleString;
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;
        public static final /* synthetic */ int[] setDividerPadding;
        public static final /* synthetic */ int[] setNavigationOnClickListener;
        public static final /* synthetic */ int[] setOnDragListener;
        public static final /* synthetic */ int[] setOnFocusChangeListener;
        public static final /* synthetic */ int[] setOnLongClickListener;
        public static final /* synthetic */ int[] setX;
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[fd.valuesCustom().length];
            iArr[fd.TRY_AGAIN.ordinal()] = 1;
            iArr[fd.TRY_ANOTHER_INTERFACE.ordinal()] = 2;
            iArr[fd.DECLINED.ordinal()] = 3;
            iArr[fd.END_APPLICATION.ordinal()] = 4;
            iArr[fd.APPROVED.ordinal()] = 5;
            iArr[fd.ONLINE_REQUEST.ordinal()] = 6;
            iArr[fd.N_A.ordinal()] = 7;
            iArr[fd.UI_REQUEST.ordinal()] = 8;
            iArr[fd.SELECT_NEXT.ordinal()] = 9;
            setY = iArr;
            int[] iArr2 = new int[setClipChildren.values().length];
            iArr2[setClipChildren.setX.ordinal()] = 1;
            iArr2[setClipChildren.setNavigationOnClickListener.ordinal()] = 2;
            iArr2[setClipChildren.setZ.ordinal()] = 3;
            iArr2[setClipChildren.setOnLongClickListener.ordinal()] = 4;
            setOnFocusChangeListener = iArr2;
            int[] iArr3 = new int[setContentCaptureSession.values().length];
            iArr3[setContentCaptureSession.setOnDragListener.ordinal()] = 1;
            iArr3[setContentCaptureSession.setLayoutAnimation.ordinal()] = 2;
            iArr3[setContentCaptureSession.setAlwaysDrawnWithCacheEnabled.ordinal()] = 3;
            iArr3[setContentCaptureSession.UiMessageCallbackKtWhenMappings.ordinal()] = 4;
            iArr3[setContentCaptureSession.setCompoundDrawableTintBlendMode.ordinal()] = 5;
            iArr3[setContentCaptureSession.setDividerPadding.ordinal()] = 6;
            setX = iArr3;
            int[] iArr4 = new int[setDrawSelectorOnTop.values().length];
            iArr4[setDrawSelectorOnTop.setLayoutAnimation.ordinal()] = 1;
            iArr4[setDrawSelectorOnTop.setNavigationOnClickListener.ordinal()] = 2;
            setCompoundDrawableTintBlendMode = iArr4;
            int[] iArr5 = new int[activateSession.valuesCustom().length];
            iArr5[activateSession.N_A.ordinal()] = 1;
            iArr5[activateSession.PRESENT_CARD.ordinal()] = 2;
            iArr5[activateSession.ERROR_OTHER_CARD.ordinal()] = 3;
            iArr5[activateSession.CLEAR_DISPLAY.ordinal()] = 4;
            iArr5[activateSession.APPROVED.ordinal()] = 5;
            iArr5[activateSession.PRESENT_CARD_AGAIN.ordinal()] = 6;
            iArr5[activateSession.APPROVED_SIGN.ordinal()] = 7;
            iArr5[activateSession.NOT_AUTHORISED.ordinal()] = 8;
            iArr5[activateSession.SEE_PHONE.ordinal()] = 9;
            iArr5[activateSession.AUTHORISING_PLEASE_WAIT.ordinal()] = 10;
            iArr5[activateSession.CARD_READ_OK.ordinal()] = 11;
            iArr5[activateSession.INSERT_CARD.ordinal()] = 12;
            setDividerPadding = iArr5;
            int[] iArr6 = new int[setTransitionVisibility.values().length];
            iArr6[setTransitionVisibility.setDividerPadding.ordinal()] = 1;
            iArr6[setTransitionVisibility.setOnDragListener.ordinal()] = 2;
            iArr6[setTransitionVisibility.setOnFocusChangeListener.ordinal()] = 3;
            iArr6[setTransitionVisibility.setY.ordinal()] = 4;
            iArr6[setTransitionVisibility.setX.ordinal()] = 5;
            setNavigationOnClickListener = iArr6;
            int[] iArr7 = new int[getINVALID_MERCHANT_IDannotations.values().length];
            iArr7[getINVALID_MERCHANT_IDannotations.setNavigationOnClickListener.ordinal()] = 1;
            iArr7[getINVALID_MERCHANT_IDannotations.setCompoundDrawableTintBlendMode.ordinal()] = 2;
            iArr7[getINVALID_MERCHANT_IDannotations.setX.ordinal()] = 3;
            iArr7[getINVALID_MERCHANT_IDannotations.setDividerPadding.ordinal()] = 4;
            iArr7[getINVALID_MERCHANT_IDannotations.setOnFocusChangeListener.ordinal()] = 5;
            iArr7[getINVALID_MERCHANT_IDannotations.setY.ordinal()] = 6;
            iArr7[getINVALID_MERCHANT_IDannotations.setLayoutAnimation.ordinal()] = 7;
            iArr7[getINVALID_MERCHANT_IDannotations.setOnLongClickListener.ordinal()] = 8;
            iArr7[getINVALID_MERCHANT_IDannotations.getNavBarTitleString.ordinal()] = 9;
            getNavBarTitleString = iArr7;
            int[] iArr8 = new int[setSelector.valuesCustom().length];
            iArr8[setSelector.NONE.ordinal()] = 1;
            iArr8[setSelector.AMOUNT.ordinal()] = 2;
            iArr8[setSelector.BALANCE.ordinal()] = 3;
            setOnLongClickListener = iArr8;
            int[] iArr9 = new int[component14.values().length];
            iArr9[component14.setCompoundDrawableTintBlendMode.ordinal()] = 1;
            setOnDragListener = iArr9;
            int i10 = (((1 & (-18)) | ((~1) & 17)) - (~(-(-((1 & 17) << 1))))) - 1;
            int i11 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }
    }

    static {
        int i10 = f51793c;
        int i11 = (i10 & 81) + (i10 | 81);
        f51794d = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public PinPadLaunchRequestListener(@NotNull component15 component15Var, @NotNull setCompoundDrawableTintList setcompounddrawabletintlist) {
        Intrinsics.checkNotNullParameter(component15Var, "");
        Intrinsics.checkNotNullParameter(setcompounddrawabletintlist, "");
        this.f51795a = component15Var;
        this.f51796b = setcompounddrawabletintlist;
    }

    public static /* synthetic */ Pair a(Object[] objArr) {
        int i10;
        PinPadLaunchRequestListener pinPadLaunchRequestListener = (PinPadLaunchRequestListener) objArr[0];
        setTextColor settextcolor = (setTextColor) objArr[1];
        int i11 = f51794d;
        int i12 = i11 & 47;
        int i13 = (((i11 | 47) & (~i12)) - (~(-(-(i12 << 1))))) - 1;
        f51793c = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        byte[] bArr = (byte[]) ((byte[]) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, 126546075, -126546062, System.identityHashCode(settextcolor))).clone();
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, 1683071809, -1683071803, System.identityHashCode(settextcolor));
        if (settransitionvisibility == null) {
            int i14 = f51793c;
            int i15 = (((i14 | 84) << 1) - (i14 ^ 84)) - 1;
            f51794d = i15 % 128;
            int i16 = i15 % 2;
            i10 = -1;
        } else {
            i10 = setX.setNavigationOnClickListener[settransitionvisibility.ordinal()];
            int i17 = f51793c;
            int i18 = (i17 ^ 78) + ((i17 & 78) << 1);
            int i19 = (i18 ^ (-1)) + (i18 << 1);
            f51794d = i19 % 128;
            int i20 = i19 % 2;
        }
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            setCompoundDrawableTintList setcompounddrawabletintlist = pinPadLaunchRequestListener.f51796b;
            component16 component16VarB = pinPadLaunchRequestListener.b((getBeepOnFailure) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, 754032766, -754032759, System.identityHashCode(settextcolor)));
            byte[] bArr2 = (byte[]) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -812158645, 812158649, System.identityHashCode(settextcolor));
            Intrinsics.checkNotNull(bArr2);
            Pair pair = new Pair((description) setCompoundDrawableTintList.setY(new Object[]{setcompounddrawabletintlist, component16VarB, bArr, bArr2}, -1458464409, 1458464411, System.identityHashCode(setcompounddrawabletintlist)), null);
            int i21 = f51793c;
            int i22 = ((i21 ^ 75) | (i21 & 75)) << 1;
            int i23 = -(((~i21) & 75) | (i21 & (-76)));
            int i24 = (i22 & i23) + (i23 | i22);
            f51794d = i24 % 128;
            if (i24 % 2 != 0) {
                return pair;
            }
            throw null;
        }
        if (i10 == 4) {
            if (((TransactionProcessingResult) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1579460462, 1579460474, System.identityHashCode(settextcolor))) == null) {
                setCompoundDrawableTintList setcompounddrawabletintlist2 = pinPadLaunchRequestListener.f51796b;
                Pair pair2 = new Pair((setHovered) setCompoundDrawableTintList.setY(new Object[]{setcompounddrawabletintlist2, bArr}, -595954644, 595954645, System.identityHashCode(setcompounddrawabletintlist2)), null);
                int i25 = f51793c;
                int i26 = i25 & 111;
                int i27 = (((i25 | 111) & (~i26)) - (~(-(-(i26 << 1))))) - 1;
                f51794d = i27 % 128;
                int i28 = i27 % 2;
                return pair2;
            }
            setCompoundDrawableTintList setcompounddrawabletintlist3 = pinPadLaunchRequestListener.f51796b;
            component16 component16VarB2 = pinPadLaunchRequestListener.b((getBeepOnFailure) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, 754032766, -754032759, System.identityHashCode(settextcolor)));
            byte[] bArr3 = (byte[]) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -812158645, 812158649, System.identityHashCode(settextcolor));
            Intrinsics.checkNotNull(bArr3);
            Pair pair3 = new Pair((component21) setCompoundDrawableTintList.setY(new Object[]{setcompounddrawabletintlist3, component16VarB2, bArr, bArr3}, -1156313229, 1156313240, System.identityHashCode(setcompounddrawabletintlist3)), null);
            int i29 = f51794d;
            int i30 = (-2) - ((-1) ^ ((i29 ^ 32) + ((i29 & 32) << 1)));
            f51793c = i30 % 128;
            if (i30 % 2 == 0) {
                return pair3;
            }
            throw null;
        }
        if (i10 != 5) {
            setClipChildren setclipchildren = setClipChildren.setNavigationOnClickListener;
            l lVar = (l) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1276529327, 1276529329, System.identityHashCode(settextcolor));
            byte[] bArr4 = (byte[]) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -812158645, 812158649, System.identityHashCode(settextcolor));
            Intrinsics.checkNotNull(bArr4);
            Pair pair4 = (Pair) setX(new Object[]{pinPadLaunchRequestListener, Boolean.FALSE, setclipchildren, lVar, Boolean.TRUE, bArr4, (SessionActivationFailureCause) setX(new Object[]{(getINVALID_MERCHANT_IDannotations) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1739710066, 1739710067, System.identityHashCode(settextcolor))}, -242084793, 242084798, (int) System.currentTimeMillis()), null}, 1111848557, -1111848555, (int) System.currentTimeMillis());
            int i31 = f51793c;
            int i32 = i31 & 73;
            int i33 = (i31 ^ 73) | i32;
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            f51794d = i34 % 128;
            if (i34 % 2 == 0) {
                int i35 = 71 / 0;
            }
            return pair4;
        }
        setCompoundDrawableTintList setcompounddrawabletintlist4 = pinPadLaunchRequestListener.f51796b;
        component16 component16VarB3 = pinPadLaunchRequestListener.b((getBeepOnFailure) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, 754032766, -754032759, System.identityHashCode(settextcolor)));
        byte[] bArr5 = (byte[]) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -812158645, 812158649, System.identityHashCode(settextcolor));
        Intrinsics.checkNotNull(bArr5);
        Pair pair5 = new Pair((setHintTextColor) setCompoundDrawableTintList.setY(new Object[]{setcompounddrawabletintlist4, component16VarB3, bArr, bArr5}, 1631740554, -1631740545, System.identityHashCode(setcompounddrawabletintlist4)), null);
        int i36 = f51793c;
        int i37 = i36 ^ 115;
        int i38 = ((i36 & 115) | i37) << 1;
        int i39 = -i37;
        int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
        f51794d = i40 % 128;
        if (i40 % 2 == 0) {
            int i41 = 13 / 0;
        }
        return pair5;
    }

    public static setProgressTintList c(l lVar) {
        return (setProgressTintList) setX(new Object[]{lVar}, 1337548972, -1337548958, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0393  */
    public static /* synthetic */ Pair d(Object[] objArr) {
        activateSession activatesession;
        setClipChildren setclipchildren;
        activateSession activatesession2;
        setClipChildren setclipchildren2;
        setItemChecked setitemchecked;
        setDrawSelectorOnTop setdrawselectorontop;
        boolean z10;
        activateSession activatesession3;
        setClipChildren setclipchildren3;
        PinPadLaunchRequestListener pinPadLaunchRequestListener = (PinPadLaunchRequestListener) objArr[0];
        setTextColor settextcolor = (setTextColor) objArr[1];
        int i10 = f51794d;
        int i11 = i10 | 65;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 65)) & i11);
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f51793c = i14 % 128;
        if (i14 % 2 != 0) {
            Intrinsics.checkNotNullParameter(settextcolor, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(settextcolor, "");
        fd fdVar = (fd) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, 581561028, -581561023, System.identityHashCode(settextcolor));
        switch (fdVar == null ? -1 : setX.setY[fdVar.ordinal()]) {
            case -1:
            case 9:
                int i15 = f51793c;
                int i16 = (i15 ^ 111) + ((i15 & 111) << 1);
                f51794d = i16 % 128;
                if (i16 % 2 != 0) {
                    return null;
                }
                throw null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                setCompoundDrawableTintList setcompounddrawabletintlist = pinPadLaunchRequestListener.f51796b;
                Pair pair = new Pair((setAccessibilityHeading) setCompoundDrawableTintList.setY(new Object[]{setcompounddrawabletintlist, setClipChildren.setOnLongClickListener, (setProgressTintList) setY.setOnFocusChangeListener(new Object[0], 651979883, -651979883, (int) System.currentTimeMillis())}, -192762444, 192762448, System.identityHashCode(setcompounddrawabletintlist)), setFastScrollEnabled.setY.setDividerPadding);
                int i17 = f51793c;
                int i18 = i17 & 45;
                int i19 = (i17 | 45) & (~i18);
                int i20 = -(-(i18 << 1));
                int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                f51794d = i21 % 128;
                int i22 = i21 % 2;
                return pair;
            case 2:
                l lVar = (l) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1276529327, 1276529329, System.identityHashCode(settextcolor));
                if (lVar == null) {
                    int i23 = f51794d;
                    int i24 = i23 & 43;
                    int i25 = -(-((i23 ^ 43) | i24));
                    int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                    f51793c = i26 % 128;
                    if (i26 % 2 != 0) {
                        int i27 = 21 / 0;
                    }
                    activatesession = null;
                } else {
                    activatesession = (activateSession) l.setX(new Object[]{lVar}, 1218780914, -1218780912, System.identityHashCode(lVar));
                    int i28 = f51794d;
                    int i29 = ((i28 & 84) + (i28 | 84)) - 1;
                    f51793c = i29 % 128;
                    int i30 = i29 % 2;
                }
                if (activatesession == null) {
                    int i31 = f51794d;
                    int i32 = ((i31 ^ 48) + ((i31 & 48) << 1)) - 1;
                    f51793c = i32 % 128;
                    if (i32 % 2 != 0) {
                        setClipChildren setclipchildren4 = setClipChildren.setOnFocusChangeListener;
                        throw null;
                    }
                    setclipchildren = setClipChildren.setX;
                } else {
                    setclipchildren = (setClipChildren) setX(new Object[]{activatesession}, 1407033929, -1407033923, (int) System.currentTimeMillis());
                }
                l lVar2 = (l) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1276529327, 1276529329, System.identityHashCode(settextcolor));
                byte[] bArr = (byte[]) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -812158645, 812158649, System.identityHashCode(settextcolor));
                Intrinsics.checkNotNull(bArr);
                Pair pair2 = (Pair) setX(new Object[]{pinPadLaunchRequestListener, Boolean.FALSE, setclipchildren, lVar2, Boolean.TRUE, bArr, (SessionActivationFailureCause) setX(new Object[]{(getINVALID_MERCHANT_IDannotations) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1739710066, 1739710067, System.identityHashCode(settextcolor))}, -242084793, 242084798, (int) System.currentTimeMillis()), (setSaveFromParentEnabled) setX(new Object[]{setclipchildren, (f) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -668238458, 668238469, System.identityHashCode(settextcolor))}, 1201137531, -1201137530, (int) System.currentTimeMillis())}, 1111848557, -1111848555, (int) System.currentTimeMillis());
                int i33 = f51794d;
                int i34 = i33 & 19;
                int i35 = (i33 | 19) & (~i34);
                int i36 = -(-(i34 << 1));
                int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
                f51793c = i37 % 128;
                if (i37 % 2 != 0) {
                    int i38 = 35 / 0;
                }
                return pair2;
            case 3:
                l lVar3 = (l) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1276529327, 1276529329, System.identityHashCode(settextcolor));
                if (lVar3 == null) {
                    int i39 = f51793c + 23;
                    int i40 = i39 % 128;
                    f51794d = i40;
                    int i41 = i39 % 2;
                    int i42 = i40 & 81;
                    int i43 = (((i40 | 81) & (~i42)) - (~(-(-(i42 << 1))))) - 1;
                    f51793c = i43 % 128;
                    int i44 = i43 % 2;
                    activatesession2 = null;
                } else {
                    activatesession2 = (activateSession) l.setX(new Object[]{lVar3}, 1218780914, -1218780912, System.identityHashCode(lVar3));
                }
                if (activatesession2 == null) {
                    int i45 = f51794d;
                    int i46 = i45 & 29;
                    int i47 = (i45 ^ 29) | i46;
                    int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                    f51793c = i48 % 128;
                    int i49 = i48 % 2;
                    setclipchildren2 = setClipChildren.setNavigationOnClickListener;
                    int i50 = f51793c;
                    int i51 = (i50 & 73) + (i50 | 73);
                    f51794d = i51 % 128;
                    int i52 = i51 % 2;
                } else {
                    setclipchildren2 = (setClipChildren) setX(new Object[]{activatesession2}, 1407033929, -1407033923, (int) System.currentTimeMillis());
                    int i53 = f51793c + 67;
                    f51794d = i53 % 128;
                    int i54 = i53 % 2;
                }
                if (((SessionActivationFailureCause) setX(new Object[]{(getINVALID_MERCHANT_IDannotations) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1739710066, 1739710067, System.identityHashCode(settextcolor))}, -242084793, 242084798, (int) System.currentTimeMillis())) == SessionActivationFailureCause.getNavBarTitleString) {
                    int i55 = f51794d;
                    int i56 = i55 & 45;
                    int i57 = -(-((i55 ^ 45) | i56));
                    int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
                    f51793c = i58 % 128;
                    int i59 = i58 % 2;
                    if (((setMaxLines) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1588451735, 1588451749, System.identityHashCode(settextcolor))) == setMaxLines.setCompoundDrawableTintBlendMode) {
                        int i60 = (-2) - ((f51793c + 94) ^ (-1));
                        f51794d = i60 % 128;
                        if (i60 % 2 != 0) {
                            return (Pair) setX(new Object[]{pinPadLaunchRequestListener, settextcolor}, -247178099, 247178106, System.identityHashCode(pinPadLaunchRequestListener));
                        }
                        throw null;
                    }
                }
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, 754032766, -754032759, System.identityHashCode(settextcolor));
                l lVar4 = (l) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1276529327, 1276529329, System.identityHashCode(settextcolor));
                byte[] bArr2 = (byte[]) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, 126546075, -126546062, System.identityHashCode(settextcolor));
                SessionActivationFailureCause sessionActivationFailureCause = (SessionActivationFailureCause) setX(new Object[]{(getINVALID_MERCHANT_IDannotations) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1739710066, 1739710067, System.identityHashCode(settextcolor))}, -242084793, 242084798, (int) System.currentTimeMillis());
                byte[] bArr3 = (byte[]) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -812158645, 812158649, System.identityHashCode(settextcolor));
                Intrinsics.checkNotNull(bArr3);
                return (Pair) setX(new Object[]{pinPadLaunchRequestListener, getbeeponfailure, setclipchildren2, lVar4, bArr2, sessionActivationFailureCause, bArr3, (f) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -668238458, 668238469, System.identityHashCode(settextcolor))}, 932908597, -932908584, System.identityHashCode(pinPadLaunchRequestListener));
            case 4:
                setClipChildren setclipchildren5 = (setClipChildren) setX(new Object[]{settextcolor}, 852777617, -852777602, (int) System.currentTimeMillis());
                f fVar = (f) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -668238458, 668238469, System.identityHashCode(settextcolor));
                if (fVar == null) {
                    int i61 = f51793c;
                    int i62 = i61 | 19;
                    int i63 = i62 << 1;
                    int i64 = -((~(i61 & 19)) & i62);
                    int i65 = (i63 & i64) + (i64 | i63);
                    int i66 = i65 % 128;
                    f51794d = i66;
                    int i67 = i65 % 2;
                    int i68 = ((i66 | 103) << 1) - (i66 ^ 103);
                    f51793c = i68 % 128;
                    int i69 = i68 % 2;
                    setitemchecked = null;
                } else {
                    setitemchecked = (setItemChecked) f.setOnFocusChangeListener(new Object[]{fVar}, -507364128, 507364135, System.identityHashCode(fVar));
                    int i70 = f51794d + 11;
                    f51793c = i70 % 128;
                    int i71 = i70 % 2;
                }
                if (setitemchecked == setItemChecked.setX) {
                    setCompoundDrawableTintList setcompounddrawabletintlist2 = pinPadLaunchRequestListener.f51796b;
                    return new Pair((setMapTrackballToArrowKeys) setCompoundDrawableTintList.setY(new Object[]{setcompounddrawabletintlist2, e((getINVALID_MERCHANT_IDannotations) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1739710066, 1739710067, System.identityHashCode(settextcolor)))}, 593147367, -593147360, System.identityHashCode(setcompounddrawabletintlist2)), setFastScrollEnabled.setY.setDividerPadding);
                }
                if (fVar == null) {
                    int i72 = f51794d;
                    int i73 = (i72 & 99) + (i72 | 99);
                    int i74 = i73 % 128;
                    f51793c = i74;
                    if (i73 % 2 != 0) {
                        throw null;
                    }
                    int i75 = ((i74 & (-66)) | ((~i74) & 65)) + ((i74 & 65) << 1);
                    f51794d = i75 % 128;
                    int i76 = i75 % 2;
                    setdrawselectorontop = null;
                } else {
                    setdrawselectorontop = (setDrawSelectorOnTop) f.setOnFocusChangeListener(new Object[]{fVar}, -1978094169, 1978094175, System.identityHashCode(fVar));
                }
                if (setdrawselectorontop == setDrawSelectorOnTop.setOnFocusChangeListener) {
                    int i77 = f51793c;
                    int i78 = ((i77 ^ 15) | (i77 & 15)) << 1;
                    int i79 = -(((~i77) & 15) | (i77 & (-16)));
                    int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                    f51794d = i80 % 128;
                    int i81 = i80 % 2;
                    return (Pair) setX(new Object[]{pinPadLaunchRequestListener}, -658650800, 658650800, System.identityHashCode(pinPadLaunchRequestListener));
                }
                if (fVar != null) {
                    int i82 = f51793c;
                    int i83 = i82 & 101;
                    int i84 = (i83 - (~(-(-((i82 ^ 101) | i83))))) - 1;
                    f51794d = i84 % 128;
                    int i85 = i84 % 2;
                    if (((setItemChecked) f.setOnFocusChangeListener(new Object[]{fVar}, -507364128, 507364135, System.identityHashCode(fVar))) == setItemChecked.setDividerPadding) {
                        int i86 = f51794d;
                        int i87 = i86 ^ 77;
                        int i88 = (i86 & 77) << 1;
                        int i89 = (i87 ^ i88) + ((i88 & i87) << 1);
                        f51793c = i89 % 128;
                        int i90 = i89 % 2;
                        if (((setContentCaptureSession) f.setOnFocusChangeListener(new Object[]{fVar}, 1210785074, -1210785072, System.identityHashCode(fVar))) == setContentCaptureSession.setCompoundDrawableTintBlendMode) {
                            System.identityHashCode(pinPadLaunchRequestListener);
                            System.identityHashCode(pinPadLaunchRequestListener);
                            if (((setDrawSelectorOnTop) f.setOnFocusChangeListener(new Object[]{fVar}, -1978094169, 1978094175, System.identityHashCode(fVar))) == setDrawSelectorOnTop.setDividerPadding) {
                                z10 = false;
                            }
                        }
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                Pair pair3 = (Pair) setX(new Object[]{pinPadLaunchRequestListener, settextcolor, Boolean.valueOf(z10), setclipchildren5}, 349927566, -349927550, System.identityHashCode(pinPadLaunchRequestListener));
                int i91 = f51793c;
                int i92 = ((i91 ^ 85) | (i91 & 85)) << 1;
                int i93 = -(((~i91) & 85) | (i91 & (-86)));
                int i94 = (i92 & i93) + (i93 | i92);
                f51794d = i94 % 128;
                if (i94 % 2 != 0) {
                    return pair3;
                }
                throw null;
            case 5:
                l lVar5 = (l) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1276529327, 1276529329, System.identityHashCode(settextcolor));
                if (lVar5 == null) {
                    int i95 = f51794d + 77;
                    f51793c = i95 % 128;
                    if (i95 % 2 != 0) {
                        throw null;
                    }
                    activatesession3 = null;
                } else {
                    activatesession3 = (activateSession) l.setX(new Object[]{lVar5}, 1218780914, -1218780912, System.identityHashCode(lVar5));
                    int i96 = f51794d;
                    int i97 = (i96 & 112) + (i96 | 112);
                    int i98 = (i97 ^ (-1)) + (i97 << 1);
                    f51793c = i98 % 128;
                    int i99 = i98 % 2;
                }
                if (activatesession3 == null) {
                    int i100 = f51794d;
                    int i101 = (((i100 | 10) << 1) - (i100 ^ 10)) - 1;
                    f51793c = i101 % 128;
                    if (i101 % 2 != 0) {
                        setclipchildren3 = setClipChildren.setDividerPadding;
                        int i102 = 4 / 0;
                    } else {
                        setclipchildren3 = setClipChildren.setDividerPadding;
                    }
                    int i103 = f51793c;
                    int i104 = (((i103 & (-64)) | ((~i103) & 63)) - (~(-(-((i103 & 63) << 1))))) - 1;
                    f51794d = i104 % 128;
                    int i105 = i104 % 2;
                } else {
                    setclipchildren3 = (setClipChildren) setX(new Object[]{activatesession3}, 1407033929, -1407033923, (int) System.currentTimeMillis());
                    int i106 = f51794d;
                    int i107 = i106 ^ 37;
                    int i108 = (i106 & 37) << 1;
                    int i109 = ((i107 | i108) << 1) - (i108 ^ i107);
                    f51793c = i109 % 128;
                    int i110 = i109 % 2;
                }
                l lVar6 = (l) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1276529327, 1276529329, System.identityHashCode(settextcolor));
                byte[] bArr4 = (byte[]) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -812158645, 812158649, System.identityHashCode(settextcolor));
                Intrinsics.checkNotNull(bArr4);
                Pair pair4 = (Pair) setX(new Object[]{pinPadLaunchRequestListener, Boolean.TRUE, setclipchildren3, lVar6, Boolean.FALSE, bArr4, (SessionActivationFailureCause) setX(new Object[]{(getINVALID_MERCHANT_IDannotations) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1739710066, 1739710067, System.identityHashCode(settextcolor))}, -242084793, 242084798, (int) System.currentTimeMillis()), null}, 1111848557, -1111848555, (int) System.currentTimeMillis());
                int i111 = f51793c;
                int i112 = i111 & 39;
                int i113 = (i111 ^ 39) | i112;
                int i114 = ((i112 | i113) << 1) - (i113 ^ i112);
                f51794d = i114 % 128;
                int i115 = i114 % 2;
                return pair4;
            case 6:
                Pair pair5 = (Pair) setX(new Object[]{pinPadLaunchRequestListener, settextcolor}, -247178099, 247178106, System.identityHashCode(pinPadLaunchRequestListener));
                int i116 = (-2) - ((f51794d + 86) ^ (-1));
                f51793c = i116 % 128;
                if (i116 % 2 == 0) {
                    return pair5;
                }
                throw null;
            case 7:
            case 8:
                l lVar7 = (l) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1276529327, 1276529329, System.identityHashCode(settextcolor));
                if (lVar7 == null) {
                    throw new setIndeterminateDrawable(3028, null, null, 6, null);
                }
                setClipChildren setclipchildren6 = (setClipChildren) setX(new Object[]{(activateSession) l.setX(new Object[]{lVar7}, 1218780914, -1218780912, System.identityHashCode(lVar7))}, 1407033929, -1407033923, (int) System.currentTimeMillis());
                setCompoundDrawableTintList setcompounddrawabletintlist3 = pinPadLaunchRequestListener.f51796b;
                Pair pair6 = new Pair((setAccessibilityHeading) setCompoundDrawableTintList.setY(new Object[]{setcompounddrawabletintlist3, setclipchildren6, c(lVar7)}, -192762444, 192762448, System.identityHashCode(setcompounddrawabletintlist3)), null);
                int i117 = f51793c;
                int i118 = (((i117 | 68) << 1) - (i117 ^ 68)) - 1;
                f51794d = i118 % 128;
                int i119 = i118 % 2;
                return pair6;
        }
    }

    public static SessionActivationFailureCause e(getINVALID_MERCHANT_IDannotations getinvalid_merchant_idannotations) {
        return (SessionActivationFailureCause) setX(new Object[]{getinvalid_merchant_idannotations}, -242084793, 242084798, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r1 == 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51794d;
        r10 = (-2) - (((r10 ^ 34) + ((r10 & 34) << 1)) ^ (-1));
        com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51793c = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        r10 = com.mypinpad.tsdk.i.PinPadLaunchRequestListener.setX.setCompoundDrawableTintBlendMode[((com.mypinpad.tsdk.isolation.setDrawSelectorOnTop) com.mypinpad.tsdk.isolation.f.setOnFocusChangeListener(new java.lang.Object[]{r10}, -1978094169, 1978094175, java.lang.System.identityHashCode(r10))).ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
    
        if (r10 == 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
    
        if (r10 == 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51793c;
        r0 = r10 & 77;
        r10 = -(-((r10 ^ 77) | r0));
        r1 = (r0 ^ r10) + ((r10 & r0) << 1);
        com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51794d = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.setSaveFromParentEnabled.setLayoutAnimation;
        r0 = com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51794d;
        r1 = r0 ^ 115;
        r0 = (((r0 & 115) | r1) << 1) - r1;
        com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51793c = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        if ((r0 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.setSaveFromParentEnabled.setCompoundDrawableTintBlendMode;
        r0 = com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51794d;
        r1 = (r0 & 57) + (r0 | 57);
        com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51793c = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c9, code lost:
    
        switch(com.mypinpad.tsdk.i.PinPadLaunchRequestListener.setX.setX[((com.mypinpad.tsdk.isolation.setContentCaptureSession) com.mypinpad.tsdk.isolation.f.setOnFocusChangeListener(new java.lang.Object[]{r10}, 1210785074, -1210785072, java.lang.System.identityHashCode(r10))).ordinal()]) {
            case 1: goto L44;
            case 2: goto L44;
            case 3: goto L44;
            case 4: goto L32;
            case 5: goto L28;
            case 6: goto L28;
            default: goto L26;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.setSaveFromParentEnabled.setY;
        r0 = com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51794d;
        r1 = r0 | 5;
        r3 = ((r1 << 1) - (~(-((~(r0 & 5)) & r1)))) - 1;
        com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51793c = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e2, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51794d;
        r0 = r10 & 59;
        r10 = (r10 ^ 59) | r0;
        r1 = (r0 & r10) + (r10 | r0);
        com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51793c = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f2, code lost:
    
        if ((r1 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f4, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0106, code lost:
    
        if (((com.mypinpad.tsdk.isolation.setDrawSelectorOnTop) com.mypinpad.tsdk.isolation.f.setOnFocusChangeListener(new java.lang.Object[]{r10}, -1978094169, 1978094175, java.lang.System.identityHashCode(r10))) != com.mypinpad.tsdk.isolation.setDrawSelectorOnTop.setOnLongClickListener) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0108, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51794d;
        r0 = r10 & 65;
        r10 = (r10 ^ 65) | r0;
        r1 = ((r0 | r10) << 1) - (r10 ^ r0);
        com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51793c = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0119, code lost:
    
        if ((r1 % 2) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011d, code lost:
    
        return com.mypinpad.tsdk.isolation.setSaveFromParentEnabled.setX;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011e, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.setSaveFromParentEnabled.setX;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0120, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0121, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.setSaveFromParentEnabled.setOnFocusChangeListener;
        r0 = com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51794d;
        r1 = r0 & 123;
        r1 = r1 + ((r0 ^ 123) | r1);
        com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51793c = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0130, code lost:
    
        if ((r1 % 2) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0132, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0133, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0134, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.setSaveFromParentEnabled.setDividerPadding;
        r0 = com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51794d;
        r1 = (r0 ^ 53) + ((r0 & 53) << 1);
        com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51793c = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0143, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0144, code lost:
    
        r10 = (-2) - ((r4 + 78) ^ (-1));
        com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51793c = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014f, code lost:
    
        if ((r10 % 2) != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0151, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0152, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r10 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r10 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        r4 = r3 ^ 19;
        r3 = -(-((r3 & 19) << 1));
        r6 = (r4 ^ r3) + ((r3 & r4) << 1);
        com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f51794d = r6 % 128;
        r6 = r6 % 2;
        r1 = com.mypinpad.tsdk.i.PinPadLaunchRequestListener.setX.setOnFocusChangeListener[r1.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
    
        if (r1 == 1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.mypinpad.tsdk.isolation.setSaveFromParentEnabled f(java.lang.Object[] r10) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.PinPadLaunchRequestListener.f(java.lang.Object[]):com.mypinpad.tsdk.i.setSaveFromParentEnabled");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x004b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0061  */
    public static /* synthetic */ Pair g(Object[] objArr) {
        setFastScrollEnabled.setY sety;
        PinPadLaunchRequestListener pinPadLaunchRequestListener = (PinPadLaunchRequestListener) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        setClipChildren setclipchildren = (setClipChildren) objArr[2];
        l lVar = (l) objArr[3];
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        byte[] bArr = (byte[]) objArr[5];
        SessionActivationFailureCause sessionActivationFailureCause = (SessionActivationFailureCause) objArr[6];
        setSaveFromParentEnabled setsavefromparentenabled = (setSaveFromParentEnabled) objArr[7];
        component16 component16Var = (component16) objArr[8];
        int i10 = f51793c + 33;
        int i11 = i10 % 128;
        f51794d = i11;
        if (i10 % 2 == 0) {
            int i12 = 52 / 0;
            if (zBooleanValue2) {
                sety = setFastScrollEnabled.setY.setDividerPadding;
                int i13 = f51794d;
                int i14 = i13 & 121;
                int i15 = -(-((i13 ^ 121) | i14));
                int i16 = (i14 & i15) + (i15 | i14);
                f51793c = i16 % 128;
                int i17 = i16 % 2;
            } else {
                int i18 = i11 & 117;
                int i19 = (i11 | 117) & (~i18);
                int i20 = -(-(i18 << 1));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                f51793c = i21 % 128;
                int i22 = i21 % 2;
                sety = null;
            }
        } else if (zBooleanValue2) {
            sety = setFastScrollEnabled.setY.setDividerPadding;
            int i110 = f51794d;
            int i111 = i110 & 121;
            int i112 = -(-((i110 ^ 121) | i111));
            int i113 = (i111 & i112) + (i112 | i111);
            f51793c = i113 % 128;
            int i114 = i113 % 2;
        } else {
            int i115 = i11 & 117;
            int i116 = (i11 | 117) & (~i115);
            int i23 = -(-(i115 << 1));
            int i24 = ((i116 | i23) << 1) - (i23 ^ i116);
            f51793c = i24 % 128;
            int i25 = i24 % 2;
            sety = null;
        }
        setCompoundDrawableTintList setcompounddrawabletintlist = pinPadLaunchRequestListener.f51796b;
        Pair pair = new Pair((setSystemGestureExclusionRects) setCompoundDrawableTintList.setY(new Object[]{setcompounddrawabletintlist, setclipchildren, c(lVar), Boolean.valueOf(zBooleanValue), bArr, sessionActivationFailureCause, setsavefromparentenabled, component16Var}, 148661860, -148661850, System.identityHashCode(setcompounddrawabletintlist)), sety);
        int i26 = f51793c;
        int i27 = (i26 & 99) + (i26 | 99);
        f51794d = i27 % 128;
        if (i27 % 2 != 0) {
            return pair;
        }
        throw null;
    }

    public static Pair h(Object[] objArr) {
        setClipChildren setclipchildren;
        PinPadLaunchRequestListener pinPadLaunchRequestListener = (PinPadLaunchRequestListener) objArr[0];
        l lVar = (l) objArr[1];
        int i10 = f51794d;
        int i11 = ((i10 & 2) + (i10 | 2)) - 1;
        f51793c = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(lVar, "");
            ValueQualifier.Companion companion = ValueQualifier.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(lVar, "");
        setClipChildren setclipchildren2 = (setClipChildren) setX(new Object[]{(activateSession) l.setX(new Object[]{lVar}, 1218780914, -1218780912, System.identityHashCode(lVar))}, 1407033929, -1407033923, (int) System.currentTimeMillis());
        if (((ValueQualifier) l.setX(new Object[]{lVar}, 854075334, -854075329, System.identityHashCode(lVar))) == ValueQualifier.setCompoundDrawableTintBlendMode) {
            int i12 = f51794d;
            int i13 = i12 & 9;
            int i14 = ((i12 ^ 9) | i13) << 1;
            int i15 = -((i12 | 9) & (~i13));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            f51793c = i16 % 128;
            if (i16 % 2 != 0) {
                setclipchildren = setClipChildren.setZ;
                int i17 = 59 / 0;
            } else {
                setclipchildren = setClipChildren.setZ;
            }
            setclipchildren2 = setclipchildren;
            int i18 = f51794d + 91;
            f51793c = i18 % 128;
            int i19 = i18 % 2;
        } else {
            int i20 = f51793c;
            int i21 = ((i20 | 75) << 1) - (i20 ^ 75);
            f51794d = i21 % 128;
            int i22 = i21 % 2;
        }
        setCompoundDrawableTintList setcompounddrawabletintlist = pinPadLaunchRequestListener.f51796b;
        Pair pair = new Pair((setAccessibilityHeading) setCompoundDrawableTintList.setY(new Object[]{setcompounddrawabletintlist, setclipchildren2, c(lVar)}, -192762444, 192762448, System.identityHashCode(setcompounddrawabletintlist)), (setFastScrollEnabled.setY) setX(new Object[]{setclipchildren2}, -1992638282, 1992638290, (int) System.currentTimeMillis()));
        int i23 = f51794d;
        int i24 = i23 & 55;
        int i25 = i24 + ((i23 ^ 55) | i24);
        f51793c = i25 % 128;
        int i26 = i25 % 2;
        return pair;
    }

    public static /* synthetic */ setClipChildren i(Object[] objArr) {
        activateSession activatesession = (activateSession) objArr[0];
        int i10 = f51793c;
        int i11 = i10 & 37;
        int i12 = (((i10 ^ 37) | i11) << 1) - ((i10 | 37) & (~i11));
        f51794d = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = setX.setDividerPadding[activatesession.ordinal()];
            throw null;
        }
        switch (setX.setDividerPadding[activatesession.ordinal()]) {
            case 1:
                setClipChildren setclipchildren = setClipChildren.setAlwaysDrawnWithCacheEnabled;
                int i14 = f51793c + 89;
                f51794d = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 32 / 0;
                }
                return setclipchildren;
            case 2:
                setClipChildren setclipchildren2 = setClipChildren.setOnFocusChangeListener;
                int i16 = f51793c;
                int i17 = ((i16 & 7) - (~(i16 | 7))) - 1;
                f51794d = i17 % 128;
                if (i17 % 2 != 0) {
                    return setclipchildren2;
                }
                throw null;
            case 3:
                setClipChildren setclipchildren3 = setClipChildren.setX;
                int i18 = f51793c;
                int i19 = (i18 ^ 41) + ((i18 & 41) << 1);
                f51794d = i19 % 128;
                int i20 = i19 % 2;
                return setclipchildren3;
            case 4:
                setClipChildren setclipchildren4 = setClipChildren.setCompoundDrawableTintBlendMode;
                int i21 = f51793c;
                int i22 = i21 & 105;
                int i23 = -(-(i21 | 105));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                f51794d = i24 % 128;
                int i25 = i24 % 2;
                return setclipchildren4;
            case 5:
                setClipChildren setclipchildren5 = setClipChildren.setDividerPadding;
                int i26 = f51794d;
                int i27 = ((i26 | 103) << 1) - (i26 ^ 103);
                f51793c = i27 % 128;
                int i28 = i27 % 2;
                return setclipchildren5;
            case 6:
                setClipChildren setclipchildren6 = setClipChildren.setOnLongClickListener;
                int i29 = f51793c;
                int i30 = ((i29 | 115) << 1) - (i29 ^ 115);
                f51794d = i30 % 128;
                int i31 = i30 % 2;
                return setclipchildren6;
            case 7:
                setClipChildren setclipchildren7 = setClipChildren.setOnDragListener;
                int i32 = f51794d;
                int i33 = ((i32 ^ 86) + ((i32 & 86) << 1)) - 1;
                f51793c = i33 % 128;
                int i34 = i33 % 2;
                return setclipchildren7;
            case 8:
                setClipChildren setclipchildren8 = setClipChildren.setNavigationOnClickListener;
                int i35 = f51794d;
                int i36 = ((i35 | 2) << 1) - (i35 ^ 2);
                int i37 = (i36 ^ (-1)) + (i36 << 1);
                f51793c = i37 % 128;
                int i38 = i37 % 2;
                return setclipchildren8;
            case 9:
                setClipChildren setclipchildren9 = setClipChildren.getNavBarTitleString;
                int i39 = f51793c;
                int i40 = i39 ^ 29;
                int i41 = (i39 & 29) << 1;
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                f51794d = i42 % 128;
                if (i42 % 2 != 0) {
                    return setclipchildren9;
                }
                throw null;
            case 10:
                setClipChildren setclipchildren10 = setClipChildren.setTextAlignment;
                int i43 = f51793c;
                int i44 = (i43 ^ 66) + ((i43 & 66) << 1);
                int i45 = (i44 ^ (-1)) + (i44 << 1);
                f51794d = i45 % 128;
                if (i45 % 2 != 0) {
                    return setclipchildren10;
                }
                throw null;
            case 11:
                setClipChildren setclipchildren11 = setClipChildren.setZ;
                int i46 = f51793c;
                int i47 = (i46 | 65) << 1;
                int i48 = -(((~i46) & 65) | (i46 & (-66)));
                int i49 = (i47 & i48) + (i48 | i47);
                f51794d = i49 % 128;
                int i50 = i49 % 2;
                return setclipchildren11;
            case 12:
                setClipChildren setclipchildren12 = setClipChildren.setLayoutAnimation;
                int i51 = f51794d;
                int i52 = i51 & 69;
                int i53 = (i51 | 69) & (~i52);
                int i54 = i52 << 1;
                int i55 = ((i53 | i54) << 1) - (i53 ^ i54);
                f51793c = i55 % 128;
                if (i55 % 2 != 0) {
                    int i56 = 68 / 0;
                }
                return setclipchildren12;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ Pair j(Object[] objArr) {
        PinPadLaunchRequestListener pinPadLaunchRequestListener = (PinPadLaunchRequestListener) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        setClipChildren setclipchildren = (setClipChildren) objArr[2];
        l lVar = (l) objArr[3];
        byte[] bArr = (byte[]) objArr[4];
        SessionActivationFailureCause sessionActivationFailureCause = (SessionActivationFailureCause) objArr[5];
        byte[] bArr2 = (byte[]) objArr[6];
        f fVar = (f) objArr[7];
        int i10 = f51794d;
        int i11 = i10 ^ 97;
        int i12 = (i10 & 97) << 1;
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        f51793c = i13 % 128;
        int i14 = i13 % 2;
        if (sessionActivationFailureCause != SessionActivationFailureCause.getNavBarTitleString) {
            setSaveFromParentEnabled setsavefromparentenabled = (setSaveFromParentEnabled) setX(new Object[]{setclipchildren, fVar}, 1201137531, -1201137530, (int) System.currentTimeMillis());
            component16 component16Var = (component16) setX(new Object[]{pinPadLaunchRequestListener, getbeeponfailure}, -919311258, 919311267, System.identityHashCode(pinPadLaunchRequestListener));
            Boolean bool = Boolean.FALSE;
            Pair pair = (Pair) setX(new Object[]{pinPadLaunchRequestListener, bool, setclipchildren, lVar, bool, bArr2, sessionActivationFailureCause, setsavefromparentenabled, component16Var}, -664016437, 664016448, System.identityHashCode(pinPadLaunchRequestListener));
            int i15 = f51794d;
            int i16 = i15 & 19;
            int i17 = (((i15 ^ 19) | i16) << 1) - ((i15 | 19) & (~i16));
            f51793c = i17 % 128;
            int i18 = i17 % 2;
            return pair;
        }
        int i19 = f51793c;
        int i20 = (((i19 | 114) << 1) - (i19 ^ 114)) - 1;
        f51794d = i20 % 128;
        if (i20 % 2 == 0) {
            throw null;
        }
        if (getbeeponfailure == null) {
            throw new setIndeterminateDrawable(3025, null, null, 6, null);
        }
        setCompoundDrawableTintList setcompounddrawabletintlist = pinPadLaunchRequestListener.f51796b;
        Pair pair2 = new Pair((setAutoSizeTextTypeUniformWithConfiguration) setCompoundDrawableTintList.setY(new Object[]{setcompounddrawabletintlist, pinPadLaunchRequestListener.b(getbeeponfailure), bArr, bArr2}, -2025331163, 2025331169, System.identityHashCode(setcompounddrawabletintlist)), null);
        int i21 = f51793c;
        int i22 = ((i21 & 68) + (i21 | 68)) - 1;
        f51794d = i22 % 128;
        int i23 = i22 % 2;
        return pair2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x008f A[PHI: r10
      0x008f: PHI (r10v17 com.mypinpad.tsdk.i.component14) = (r10v8 com.mypinpad.tsdk.i.component14), (r10v23 com.mypinpad.tsdk.i.component14) binds: [B:8:0x0073, B:5:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0075 A[PHI: r10
      0x0075: PHI (r10v9 com.mypinpad.tsdk.i.component14) = (r10v8 com.mypinpad.tsdk.i.component14), (r10v23 com.mypinpad.tsdk.i.component14) binds: [B:8:0x0073, B:5:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ component14 k(Object[] objArr) {
        component14 component14Var;
        byte[] bArr = (byte[]) objArr[0];
        int i10 = f51794d;
        int i11 = i10 ^ 65;
        int i12 = ((((i10 & 65) | i11) << 1) - (~(-i11))) - 1;
        f51793c = i12 % 128;
        int i13 = -1;
        if (i12 % 2 != 0) {
            component14.Companion companion = component14.INSTANCE;
            int iIntValue = ((Integer) setInputExtras.setDividerPadding(new Object[]{bArr}, -1792313771, 1792313778, (int) System.currentTimeMillis())).intValue();
            component14Var = (component14) component14.Companion.setX(new Object[]{Integer.valueOf(iIntValue)}, -700745811, 700745811, iIntValue);
            int i14 = 29 / 0;
            if (component14Var == null) {
                int i15 = f51794d;
                int i16 = ((i15 | 17) << 1) - (i15 ^ 17);
                int i17 = i16 % 128;
                f51793c = i17;
                int i18 = i16 % 2;
                int i19 = (i17 & 91) + (i17 | 91);
                f51794d = i19 % 128;
                int i20 = i19 % 2;
            } else {
                int i21 = setX.setOnDragListener[component14Var.ordinal()];
                int i22 = f51793c;
                int i23 = (-2) - (((i22 ^ 82) + ((i22 & 82) << 1)) ^ (-1));
                f51794d = i23 % 128;
                int i24 = i23 % 2;
                i13 = i21;
            }
        } else {
            component14.Companion companion2 = component14.INSTANCE;
            int iIntValue2 = ((Integer) setInputExtras.setDividerPadding(new Object[]{bArr}, -1792313771, 1792313778, (int) System.currentTimeMillis())).intValue();
            component14Var = (component14) component14.Companion.setX(new Object[]{Integer.valueOf(iIntValue2)}, -700745811, 700745811, iIntValue2);
            if (component14Var == null) {
                int i110 = f51794d;
                int i111 = ((i110 | 17) << 1) - (i110 ^ 17);
                int i112 = i111 % 128;
                f51793c = i112;
                int i113 = i111 % 2;
                int i114 = (i112 & 91) + (i112 | 91);
                f51794d = i114 % 128;
                int i25 = i114 % 2;
            } else {
                int i26 = setX.setOnDragListener[component14Var.ordinal()];
                int i27 = f51793c;
                int i28 = (-2) - (((i27 ^ 82) + ((i27 & 82) << 1)) ^ (-1));
                f51794d = i28 % 128;
                int i29 = i28 % 2;
                i13 = i26;
            }
        }
        if (i13 != 1) {
            int i30 = f51794d;
            int i31 = ((i30 ^ 44) + ((i30 & 44) << 1)) - 1;
            f51793c = i31 % 128;
            int i32 = i31 % 2;
            return component14Var;
        }
        int i33 = f51793c;
        int i34 = i33 ^ 93;
        int i35 = (i33 & 93) << 1;
        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
        f51794d = i36 % 128;
        if (i36 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ SessionActivationFailureCause l(Object[] objArr) {
        int i10;
        getINVALID_MERCHANT_IDannotations getinvalid_merchant_idannotations = (getINVALID_MERCHANT_IDannotations) objArr[0];
        int i11 = f51793c;
        int i12 = i11 & 83;
        int i13 = (i12 - (~((i11 ^ 83) | i12))) - 1;
        f51794d = i13 % 128;
        int i14 = i13 % 2;
        if (getinvalid_merchant_idannotations == null) {
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i15 = ~iCurrentTimeMillis;
            int i16 = ~i15;
            int i17 = (1071308789 & i16) | ((-1071308790) & i15);
            int i18 = 1071308789 & i15;
            int i19 = ~((i18 & i17) | (i17 ^ i18));
            int i20 = i19 & 680134724;
            int i21 = (i19 | 680134724) & (~i20);
            int i22 = (i21 & i20) | (i21 ^ i20);
            int i23 = (-1016781382) ^ iCurrentTimeMillis;
            int i24 = iCurrentTimeMillis & (-1016781382);
            int i25 = -(-(((~((i24 & i23) | (i23 ^ i24))) | i22) * (-68)));
            int i26 = ((~i25) & 252796233) | ((-252796234) & i25);
            int i27 = (i25 & 252796233) << 1;
            int i28 = (i26 & i27) + (i27 | i26);
            int i29 = (i16 & 734662132) | (i15 & (-734662133)) | (734662132 & i15);
            int i30 = i29 & (-1016781382);
            int i31 = (i29 | (-1016781382)) & (~i30);
            int i32 = -(-((~((i31 & i30) | (i31 ^ i30))) * (-68)));
            int i33 = i28 & i32;
            int i34 = -(-((i32 ^ i28) | i33));
            int i35 = (i33 & i34) + (i34 | i33);
            int i36 = i15 | 1016781381;
            int i37 = ~i36;
            int i38 = (i36 | i37) & i37;
            int i39 = ((734662132 & i38) | ((~i38) & 734662132) | ((-734662133) & i38)) * 68;
            int i40 = i35 & i39;
            int i41 = -(-((i39 ^ i35) | i40));
            int i42 = (i40 & i41) + (i41 | i40);
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i43 = 1975367662 & iCurrentTimeMillis2;
            int i44 = (1975367662 | iCurrentTimeMillis2) & (~i43);
            int i45 = -(-((~((i44 & i43) | (i44 ^ i43))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
            int i46 = ((~i45) & 33239732) | ((-33239733) & i45);
            int i47 = (i45 & 33239732) << 1;
            int i48 = (i46 & i47) + (i47 | i46);
            int i49 = i48 ^ (-97821000);
            int i50 = -(-(((-97821000) & i48) << 1));
            int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
            int i52 = ~iCurrentTimeMillis2;
            int i53 = 364128228 & i52;
            int i54 = ((i52 | 364128228) & (~i53)) | i53;
            int i55 = i54 ^ 1974056078;
            int i56 = i54 & 1974056078;
            int i57 = ~((i56 & i55) | (i55 ^ i56));
            int i58 = 362816644 & i57;
            int i59 = (i57 | 362816644) & (~i58);
            int i60 = ((i59 & i58) | (i59 ^ i58)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
            int i61 = i51 & i60;
            int i62 = (i60 ^ i51) | i61;
            if (i42 > ((i61 | i62) << 1) - (i62 ^ i61)) {
                throw null;
            }
            i10 = -1;
        } else {
            i10 = setX.getNavBarTitleString[getinvalid_merchant_idannotations.ordinal()];
            int i63 = f51794d;
            int i64 = (((i63 | 84) << 1) - (i63 ^ 84)) - 1;
            f51793c = i64 % 128;
            int i65 = i64 % 2;
        }
        switch (i10) {
            case -1:
                int i66 = f51793c + 93;
                f51794d = i66 % 128;
                int i67 = i66 % 2;
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                SessionActivationFailureCause sessionActivationFailureCause = SessionActivationFailureCause.setNavigationOnClickListener;
                int i68 = f51793c + 60;
                int i69 = (i68 ^ (-1)) + (i68 << 1);
                f51794d = i69 % 128;
                if (i69 % 2 == 0) {
                    int i70 = 5 / 0;
                }
                return sessionActivationFailureCause;
            case 2:
                SessionActivationFailureCause sessionActivationFailureCause2 = SessionActivationFailureCause.setY;
                int i71 = f51794d;
                int i72 = i71 & 61;
                int i73 = i71 | 61;
                int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                f51793c = i74 % 128;
                int i75 = i74 % 2;
                return sessionActivationFailureCause2;
            case 3:
                SessionActivationFailureCause sessionActivationFailureCause3 = SessionActivationFailureCause.setOnFocusChangeListener;
                int i76 = f51794d;
                int i77 = ((i76 ^ 69) | (i76 & 69)) << 1;
                int i78 = -(((~i76) & 69) | (i76 & (-70)));
                int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
                f51793c = i79 % 128;
                int i80 = i79 % 2;
                return sessionActivationFailureCause3;
            case 4:
                SessionActivationFailureCause sessionActivationFailureCause4 = SessionActivationFailureCause.setCompoundDrawableTintBlendMode;
                int i81 = f51794d;
                int i82 = i81 ^ 101;
                int i83 = -(-((i81 & 101) << 1));
                int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                f51793c = i84 % 128;
                if (i84 % 2 == 0) {
                    return sessionActivationFailureCause4;
                }
                throw null;
            case 5:
                SessionActivationFailureCause sessionActivationFailureCause5 = SessionActivationFailureCause.setDividerPadding;
                int i85 = f51794d;
                int i86 = i85 & 99;
                int i87 = (((i85 | 99) & (~i86)) - (~(-(-(i86 << 1))))) - 1;
                f51793c = i87 % 128;
                if (i87 % 2 != 0) {
                    int i88 = 19 / 0;
                }
                return sessionActivationFailureCause5;
            case 6:
                SessionActivationFailureCause sessionActivationFailureCause6 = SessionActivationFailureCause.setX;
                int i89 = f51794d;
                int i90 = ((i89 ^ 40) + ((i89 & 40) << 1)) - 1;
                f51793c = i90 % 128;
                if (i90 % 2 == 0) {
                    return sessionActivationFailureCause6;
                }
                throw null;
            case 7:
                SessionActivationFailureCause sessionActivationFailureCause7 = SessionActivationFailureCause.setLayoutAnimation;
                int i91 = f51794d + 101;
                f51793c = i91 % 128;
                if (i91 % 2 == 0) {
                    return sessionActivationFailureCause7;
                }
                throw null;
            case 8:
                SessionActivationFailureCause sessionActivationFailureCause8 = SessionActivationFailureCause.setOnDragListener;
                int i92 = f51794d;
                int i93 = i92 & 17;
                int i94 = ((i92 ^ 17) | i93) << 1;
                int i95 = -((i92 | 17) & (~i93));
                int i96 = (i94 ^ i95) + ((i95 & i94) << 1);
                f51793c = i96 % 128;
                if (i96 % 2 == 0) {
                    return sessionActivationFailureCause8;
                }
                throw null;
            case 9:
                SessionActivationFailureCause sessionActivationFailureCause9 = SessionActivationFailureCause.getNavBarTitleString;
                int i97 = f51793c;
                int i98 = (((i97 | 104) << 1) - (i97 ^ 104)) - 1;
                f51794d = i98 % 128;
                if (i98 % 2 != 0) {
                    return sessionActivationFailureCause9;
                }
                throw null;
        }
    }

    public static Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object dividerPadding;
        int i13;
        Object objValueOf;
        activateSession activatesession;
        int i14;
        int i15 = ~i11;
        int i16 = (((~((~i12) | i15)) | (~(i15 | i10))) * (-245)) + (i11 * 246) + (i10 * (-244));
        int i17 = ~(i15 | i12);
        int i18 = -1;
        switch (((i10 | i17) * 245) + (i17 * (-245)) + i16) {
            case 1:
                return f(objArr);
            case 2:
                PinPadLaunchRequestListener pinPadLaunchRequestListener = (PinPadLaunchRequestListener) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                setClipChildren setclipchildren = (setClipChildren) objArr[2];
                l lVar = (l) objArr[3];
                boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
                byte[] bArr = (byte[]) objArr[5];
                SessionActivationFailureCause sessionActivationFailureCause = (SessionActivationFailureCause) objArr[6];
                setSaveFromParentEnabled setsavefromparentenabled = (setSaveFromParentEnabled) objArr[7];
                int i19 = f51794d + 114;
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                f51793c = i20 % 128;
                int i21 = i20 % 2;
                Pair pair = (Pair) setX(new Object[]{pinPadLaunchRequestListener, Boolean.valueOf(zBooleanValue), setclipchildren, lVar, Boolean.valueOf(zBooleanValue2), bArr, sessionActivationFailureCause, setsavefromparentenabled, null}, -664016437, 664016448, System.identityHashCode(pinPadLaunchRequestListener));
                int i22 = f51794d;
                int i23 = (((i22 ^ 41) | (i22 & 41)) << 1) - (((~i22) & 41) | (i22 & (-42)));
                f51793c = i23 % 128;
                int i24 = i23 % 2;
                return pair;
            case 3:
                return k(objArr);
            case 4:
                return d(objArr);
            case 5:
                return l(objArr);
            case 6:
                return i(objArr);
            case 7:
                return a(objArr);
            case 8:
                setClipChildren setclipchildren2 = (setClipChildren) objArr[0];
                int i25 = f51794d;
                int i26 = i25 & 7;
                int i27 = i26 + ((i25 ^ 7) | i26);
                int i28 = i27 % 128;
                f51793c = i28;
                int i29 = i27 % 2;
                if (setclipchildren2 == null) {
                    int i30 = i28 & 95;
                    int i31 = (i28 ^ 95) | i30;
                    int i32 = (i30 & i31) + (i30 | i31);
                    int i33 = i32 % 128;
                    f51794d = i33;
                    int i34 = i32 % 2;
                    int i35 = i33 + 5;
                    f51793c = i35 % 128;
                    int i36 = i35 % 2;
                } else {
                    i18 = setX.setOnFocusChangeListener[setclipchildren2.ordinal()];
                    int i37 = f51794d;
                    int i38 = (i37 & 79) + (i37 | 79);
                    f51793c = i38 % 128;
                    int i39 = i38 % 2;
                }
                if (i18 == 3) {
                    dividerPadding = setFastScrollEnabled.setY.setCompoundDrawableTintBlendMode;
                    int i40 = f51793c;
                    int i41 = i40 & 77;
                    i13 = i41 + ((i40 ^ 77) | i41);
                    f51794d = i13 % 128;
                } else {
                    if (i18 != 4) {
                        int i42 = f51794d;
                        int i43 = i42 & 25;
                        int i44 = (i42 ^ 25) | i43;
                        int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                        f51793c = i45 % 128;
                        int i46 = i45 % 2;
                        dividerPadding = null;
                        return dividerPadding;
                    }
                    dividerPadding = setFastScrollEnabled.setY.setDividerPadding;
                    int i47 = f51794d;
                    i13 = (((i47 ^ 21) | (i47 & 21)) << 1) - (((~i47) & 21) | (i47 & (-22)));
                    f51793c = i13 % 128;
                }
                int i48 = i13 % 2;
                return dividerPadding;
            case 9:
                PinPadLaunchRequestListener pinPadLaunchRequestListener2 = (PinPadLaunchRequestListener) objArr[0];
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
                int i49 = f51794d;
                int i50 = i49 & 41;
                int i51 = (i49 ^ 41) | i50;
                int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                int i53 = i52 % 128;
                f51793c = i53;
                int i54 = i52 % 2;
                if (getbeeponfailure == null) {
                    int i55 = i53 & 49;
                    int i56 = -(-((i53 ^ 49) | i55));
                    int i57 = (i55 & i56) + (i55 | i56);
                    f51794d = i57 % 128;
                    if (i57 % 2 == 0) {
                        throw null;
                    }
                    dividerPadding = null;
                } else {
                    dividerPadding = pinPadLaunchRequestListener2.f51795a.setDividerPadding((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 243863605, -243863605, System.identityHashCode(getbeeponfailure)));
                    System.identityHashCode(pinPadLaunchRequestListener2);
                    System.identityHashCode(pinPadLaunchRequestListener2);
                }
                return dividerPadding;
            case 10:
                return h(objArr);
            case 11:
                return g(objArr);
            case 12:
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[0];
                int i58 = f51794d;
                int i59 = i58 + 87;
                f51793c = i59 % 128;
                int i60 = i59 % 2;
                if (getbeeponfailure2 == null) {
                    int i61 = i58 ^ 87;
                    int i62 = ((i58 & 87) | i61) << 1;
                    int i63 = -i61;
                    int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
                    int i65 = i64 % 128;
                    f51793c = i65;
                    boolean z10 = i64 % 2 != 0;
                    int i66 = (((i65 ^ 91) | (i65 & 91)) << 1) - (((~i65) & 91) | (i65 & (-92)));
                    f51794d = i66 % 128;
                    int i67 = i66 % 2;
                    objValueOf = Boolean.valueOf(z10);
                } else {
                    setAnimation setanimation = setAnimation.INSTANCE;
                    getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2, (TransactionFailed) setAnimation.setY(new Object[0], -705722506, 705722524, (int) System.currentTimeMillis())}, -990392770, 990392791, System.identityHashCode(getbeeponfailure2));
                    if (getbeeponfailure3 == null) {
                        int i68 = f51793c + 81;
                        f51794d = i68 % 128;
                        int i69 = i68 % 2;
                    } else {
                        byte[] bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3));
                        if (bArr2 == null) {
                            int i70 = f51794d;
                            int i71 = (((i70 & (-106)) | ((~i70) & 105)) - (~(-(-((i70 & 105) << 1))))) - 1;
                            f51793c = i71 % 128;
                            objValueOf = Boolean.valueOf(!(i71 % 2 == 0));
                        } else {
                            byte b10 = bArr2[0];
                            component13.Companion companion = component13.INSTANCE;
                            if (((component13) component13.Companion.setDividerPadding(new Object[]{Byte.valueOf(b10)}, 961284563, -961284563, (int) System.currentTimeMillis())) == component13.setNavigationOnClickListener) {
                                int i72 = f51793c;
                                int i73 = i72 & 27;
                                int i74 = i73 + ((i72 ^ 27) | i73);
                                f51794d = i74 % 128;
                                int i75 = i74 % 2;
                                int i76 = (-2) - ((((i72 | 106) << 1) - (i72 ^ 106)) ^ (-1));
                                f51794d = i76 % 128;
                                int i77 = i76 % 2;
                                objValueOf = Boolean.TRUE;
                            } else {
                                int i78 = f51793c;
                                int i79 = ((i78 | 109) << 1) - (i78 ^ 109);
                                f51794d = i79 % 128;
                                int i80 = i79 % 2;
                            }
                        }
                    }
                    objValueOf = Boolean.FALSE;
                }
                return objValueOf;
            case 13:
                return j(objArr);
            case 14:
                l lVar2 = (l) objArr[0];
                if (lVar2 == null) {
                    objValueOf = (setProgressTintList) setY.setOnFocusChangeListener(new Object[0], 651979883, -651979883, (int) System.currentTimeMillis());
                    return objValueOf;
                }
                long jLongValue = ((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) l.setX(new Object[]{lVar2}, -1193387599, 1193387606, System.identityHashCode(lVar2))}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue();
                byte[] bArr3 = (byte[]) l.setX(new Object[]{lVar2}, -1465947066, 1465947070, System.identityHashCode(lVar2));
                Long lValueOf = bArr3 == null ? null : Long.valueOf(((Long) setInputExtras.setDividerPadding(new Object[]{bArr3}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue());
                setOnItemLongClickListener setonitemlongclicklistener = (setOnItemLongClickListener) setX(new Object[]{(setSelector) l.setX(new Object[]{lVar2}, -971999203, 971999203, System.identityHashCode(lVar2))}, 186207205, -186207188, (int) System.currentTimeMillis());
                byte[] bArr4 = (byte[]) l.setX(new Object[]{lVar2}, 1618171821, -1618171812, System.identityHashCode(lVar2));
                return new setProgressTintList(jLongValue, lValueOf, setonitemlongclicklistener, bArr4 == null ? null : (component14) setX(new Object[]{bArr4}, 2125483562, -2125483559, (int) System.currentTimeMillis()), (byte[]) l.setX(new Object[]{lVar2}, 37049979, -37049969, System.identityHashCode(lVar2)));
            case 15:
                setTextColor settextcolor = (setTextColor) objArr[0];
                int i81 = f51794d;
                int i82 = (-2) - (((i81 & 78) + (i81 | 78)) ^ (-1));
                f51793c = i82 % 128;
                int i83 = i82 % 2;
                l lVar3 = (l) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1276529327, 1276529329, System.identityHashCode(settextcolor));
                if (lVar3 == null) {
                    int i84 = f51793c;
                    int i85 = i84 & 115;
                    int i86 = (i84 | 115) & (~i85);
                    int i87 = -(-(i85 << 1));
                    int i88 = (i86 ^ i87) + ((i86 & i87) << 1);
                    int i89 = i88 % 128;
                    f51794d = i89;
                    if (i88 % 2 == 0) {
                        throw null;
                    }
                    int i90 = i89 & 5;
                    int i91 = (i89 ^ 5) | i90;
                    int i92 = (i90 & i91) + (i91 | i90);
                    f51793c = i92 % 128;
                    int i93 = i92 % 2;
                    activatesession = null;
                } else {
                    activatesession = (activateSession) l.setX(new Object[]{lVar3}, 1218780914, -1218780912, System.identityHashCode(lVar3));
                    int i94 = f51794d;
                    int i95 = i94 & 115;
                    int i96 = (((i94 ^ 115) | i95) << 1) - ((i94 | 115) & (~i95));
                    f51793c = i96 % 128;
                    int i97 = i96 % 2;
                }
                if (activatesession == null) {
                    int i98 = f51793c;
                    int i99 = (i98 | 99) << 1;
                    int i100 = -(((~i98) & 99) | (i98 & (-100)));
                    int i101 = ((i99 | i100) << 1) - (i100 ^ i99);
                    int i102 = i101 % 128;
                    f51794d = i102;
                    if (i101 % 2 == 0) {
                        throw null;
                    }
                    int i103 = (i102 | 49) << 1;
                    int i104 = -(((~i102) & 49) | (i102 & (-50)));
                    int i105 = (i103 ^ i104) + ((i104 & i103) << 1);
                    f51793c = i105 % 128;
                    int i106 = i105 % 2;
                    i14 = -1;
                } else {
                    i14 = setX.setDividerPadding[activatesession.ordinal()];
                    int i107 = f51794d;
                    int i108 = (i107 ^ 107) + ((i107 & 107) << 1);
                    f51793c = i108 % 128;
                    int i109 = i108 % 2;
                }
                if (i14 == -1 || i14 == 1 || i14 == 2) {
                    objValueOf = setClipChildren.setIncludeFontPadding;
                    int i110 = f51793c;
                    int i111 = i110 ^ 15;
                    int i112 = (i110 & 15) << 1;
                    int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                    f51794d = i113 % 128;
                    int i114 = i113 % 2;
                } else {
                    objValueOf = (setClipChildren) setX(new Object[]{activatesession}, 1407033929, -1407033923, (int) System.currentTimeMillis());
                    int i115 = f51794d + 37;
                    f51793c = i115 % 128;
                    if (i115 % 2 != 0) {
                        throw null;
                    }
                }
                return objValueOf;
            case 16:
                PinPadLaunchRequestListener pinPadLaunchRequestListener3 = (PinPadLaunchRequestListener) objArr[0];
                setTextColor settextcolor2 = (setTextColor) objArr[1];
                boolean zBooleanValue3 = ((Boolean) objArr[2]).booleanValue();
                setClipChildren setclipchildren3 = (setClipChildren) objArr[3];
                int i116 = f51794d;
                int i117 = i116 & 51;
                int i118 = i116 | 51;
                int i119 = (i117 ^ i118) + ((i117 & i118) << 1);
                f51793c = i119 % 128;
                int i120 = i119 % 2;
                if (((SessionActivationFailureCause) setX(new Object[]{(getINVALID_MERCHANT_IDannotations) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor2}, -1739710066, 1739710067, System.identityHashCode(settextcolor2))}, -242084793, 242084798, (int) System.currentTimeMillis())) == SessionActivationFailureCause.setLayoutAnimation) {
                    int i121 = f51793c;
                    int i122 = i121 | 115;
                    int i123 = i122 << 1;
                    int i124 = -((~(i121 & 115)) & i122);
                    int i125 = ((i123 | i124) << 1) - (i123 ^ i124);
                    f51794d = i125 % 128;
                    int i126 = i125 % 2;
                    if (setclipchildren3 == setClipChildren.setCompoundDrawableTintBlendMode) {
                        int i127 = f51793c;
                        int i128 = (((i127 ^ 57) | (i127 & 57)) << 1) - ((i127 & (-58)) | (57 & (~i127)));
                        f51794d = i128 % 128;
                        if (i128 % 2 == 0) {
                            ((Boolean) setX(new Object[]{(getBeepOnFailure) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor2}, 754032766, -754032759, System.identityHashCode(settextcolor2))}, -435315405, 435315417, (int) System.currentTimeMillis())).booleanValue();
                            throw null;
                        }
                        if (((Boolean) setX(new Object[]{(getBeepOnFailure) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor2}, 754032766, -754032759, System.identityHashCode(settextcolor2))}, -435315405, 435315417, (int) System.currentTimeMillis())).booleanValue() && !(!zBooleanValue3)) {
                            int i129 = f51794d + 97;
                            f51793c = i129 % 128;
                            int i130 = i129 % 2;
                            getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor2}, 754032766, -754032759, System.identityHashCode(settextcolor2));
                            if (getbeeponfailure4 == null) {
                                throw new setIndeterminateDrawable(3025, null, null, 6, null);
                            }
                            setCompoundDrawableTintList setcompounddrawabletintlist = pinPadLaunchRequestListener3.f51796b;
                            component16 component16VarB = pinPadLaunchRequestListener3.b(getbeeponfailure4);
                            byte[] bArr5 = (byte[]) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor2}, 126546075, -126546062, System.identityHashCode(settextcolor2));
                            byte[] bArr6 = (byte[]) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor2}, -812158645, 812158649, System.identityHashCode(settextcolor2));
                            Intrinsics.checkNotNull(bArr6);
                            Pair pair2 = new Pair((setSelectionAfterHeaderView) setCompoundDrawableTintList.setY(new Object[]{setcompounddrawabletintlist, component16VarB, bArr5, bArr6}, -437051737, 437051740, System.identityHashCode(setcompounddrawabletintlist)), null);
                            int i131 = f51793c + 13;
                            f51794d = i131 % 128;
                            if (i131 % 2 != 0) {
                                return pair2;
                            }
                            throw null;
                        }
                    }
                }
                l lVar4 = (l) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor2}, -1276529327, 1276529329, System.identityHashCode(settextcolor2));
                byte[] bArr7 = (byte[]) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor2}, -812158645, 812158649, System.identityHashCode(settextcolor2));
                Intrinsics.checkNotNull(bArr7);
                objValueOf = (Pair) setX(new Object[]{pinPadLaunchRequestListener3, Boolean.FALSE, setclipchildren3, lVar4, Boolean.valueOf(zBooleanValue3), bArr7, (SessionActivationFailureCause) setX(new Object[]{(getINVALID_MERCHANT_IDannotations) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor2}, -1739710066, 1739710067, System.identityHashCode(settextcolor2))}, -242084793, 242084798, (int) System.currentTimeMillis()), (setSaveFromParentEnabled) setX(new Object[]{setclipchildren3, (f) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor2}, -668238458, 668238469, System.identityHashCode(settextcolor2))}, 1201137531, -1201137530, (int) System.currentTimeMillis())}, 1111848557, -1111848555, (int) System.currentTimeMillis());
                int i132 = f51794d;
                int i133 = ((i132 | 25) << 1) - (i132 ^ 25);
                f51793c = i133 % 128;
                if (i133 % 2 != 0) {
                    throw null;
                }
                return objValueOf;
            case 17:
                setSelector setselector = (setSelector) objArr[0];
                int i134 = f51794d;
                int i135 = i134 & 61;
                int i136 = ((((i134 ^ 61) | i135) << 1) - (~(-((i134 | 61) & (~i135))))) - 1;
                f51793c = i136 % 128;
                int i137 = i136 % 2;
                int i138 = setX.setOnLongClickListener[setselector.ordinal()];
                if (i138 == 1) {
                    objValueOf = setOnItemLongClickListener.setOnFocusChangeListener;
                    int i139 = f51793c;
                    int i140 = ((i139 ^ 61) | (i139 & 61)) << 1;
                    int i141 = -(((~i139) & 61) | (i139 & (-62)));
                    int i142 = (i140 ^ i141) + ((i141 & i140) << 1);
                    f51794d = i142 % 128;
                    int i143 = i142 % 2;
                } else if (i138 == 2) {
                    objValueOf = setOnItemLongClickListener.setDividerPadding;
                    int i144 = f51793c + 13;
                    f51794d = i144 % 128;
                    if (i144 % 2 == 0) {
                        int i145 = 69 / 0;
                    }
                } else {
                    if (i138 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objValueOf = setOnItemLongClickListener.setY;
                    int i146 = f51794d;
                    int i147 = (i146 & 115) + (i146 | 115);
                    f51793c = i147 % 128;
                    int i148 = i147 % 2;
                }
                return objValueOf;
            default:
                setCompoundDrawableTintList setcompounddrawabletintlist2 = ((PinPadLaunchRequestListener) objArr[0]).f51796b;
                Pair pair3 = new Pair((getId) setCompoundDrawableTintList.setY(new Object[]{setcompounddrawabletintlist2}, -507292573, 507292581, System.identityHashCode(setcompounddrawabletintlist2)), setFastScrollEnabled.setY.setDividerPadding);
                int i149 = f51793c;
                int i150 = (i149 ^ 117) + ((i149 & 117) << 1);
                f51794d = i150 % 128;
                int i151 = i150 % 2;
                return pair3;
        }
    }

    public final component16 b(getBeepOnFailure getbeeponfailure) {
        return (component16) setX(new Object[]{this, getbeeponfailure}, -919311258, 919311267, System.identityHashCode(this));
    }

    @NotNull
    public final Pair<setSystemGestureExclusionRects, setFastScrollEnabled.setY> setY(@NotNull l lVar) {
        return (Pair) setX(new Object[]{this, lVar}, -687603644, 687603654, System.identityHashCode(this));
    }

    @Nullable
    public final Pair<setSystemGestureExclusionRects, setFastScrollEnabled.setY> setY(@NotNull setTextColor settextcolor) {
        return (Pair) setX(new Object[]{this, settextcolor}, 928347527, -928347523, System.identityHashCode(this));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/PinPadLaunchRequestListener$setY;", "", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
    public static final class setY {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f51797a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f51798b = 1;

        public setY() {
        }

        public /* synthetic */ setY(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            if ((((~(i10 | i12)) | i11) * 272) + (((~(i13 | i12)) | (~(i13 | i11))) * (-272)) + (((~((~i11) | i13 | (~i12))) | (~(i10 | i11 | i12))) * (-272)) + (i11 * (-271)) + (i10 * 273) == 1) {
                setProgressTintList setprogresstintlist = new setProgressTintList(3L, null, setOnItemLongClickListener.setOnFocusChangeListener, null, null);
                int i14 = f51797a + 83;
                f51798b = i14 % 128;
                if (i14 % 2 != 0) {
                    return setprogresstintlist;
                }
                int i15 = 72 / 0;
                return setprogresstintlist;
            }
            int i16 = f51797a;
            int i17 = (i16 & 41) + (i16 | 41);
            f51798b = i17 % 128;
            int i18 = i17 % 2;
            setProgressTintList setprogresstintlist2 = (setProgressTintList) setOnFocusChangeListener(new Object[0], 423506970, -423506969, (int) System.currentTimeMillis());
            int i19 = f51798b + 19;
            f51797a = i19 % 128;
            int i20 = i19 % 2;
            return setprogresstintlist2;
        }

        public static final /* synthetic */ setProgressTintList setOnFocusChangeListener() {
            return (setProgressTintList) setOnFocusChangeListener(new Object[0], 651979883, -651979883, (int) System.currentTimeMillis());
        }
    }
}
