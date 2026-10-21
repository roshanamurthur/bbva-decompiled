package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import dk.e;
import ek.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001bB'\u0012\u0006\u0010Q\u001a\u00020P\u0012\u0006\u0010Y\u001a\u00020X\u0012\u0006\u0010^\u001a\u00020]\u0012\u0006\u0010T\u001a\u00020S¢\u0006\u0004\b`\u0010aJ\u0006\u0010\u0003\u001a\u00020\u0002JE\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002JO\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\b2\b\u0010!\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0017\u0010\"J(\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00160%j\b\u0012\u0004\u0012\u00020\u0016`&2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010*\u001a\u0004\u0018\u00010\u00162\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160(H\u0002J!\u0010,\u001a\u0004\u0018\u00010\u001c2\u0006\u0010+\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b,\u0010-J\u0012\u0010/\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010\bH\u0002J\u0014\u00100\u001a\u0004\u0018\u00010\b2\b\u0010.\u001a\u0004\u0018\u00010\bH\u0002J\b\u00101\u001a\u00020\u0002H\u0002J&\u00108\u001a\u00020\u00022\u0006\u00103\u001a\u0002022\b\b\u0002\u00105\u001a\u0002042\n\b\u0002\u00107\u001a\u0004\u0018\u000106H\u0002J\b\u00109\u001a\u00020\u0002H\u0002J\u0012\u0010:\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u000106H\u0002J5\u0010;\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b;\u0010<J9\u0010=\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u0012\u0010@\u001a\u00020?2\b\u0010.\u001a\u0004\u0018\u00010\bH\u0002J\u0013\u0010A\u001a\u00020#H\u0082@ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u0010\u0010D\u001a\u00020?2\u0006\u0010C\u001a\u00020\bH\u0002J\u0010\u0010G\u001a\u00020?2\u0006\u0010F\u001a\u00020EH\u0002J\u0018\u0010J\u001a\u00020?2\u0006\u0010I\u001a\u00020H2\u0006\u0010F\u001a\u00020EH\u0002J\u0010\u0010K\u001a\u00020?2\u0006\u0010$\u001a\u00020#H\u0002J\u0010\u0010L\u001a\u00020?2\u0006\u0010$\u001a\u00020#H\u0002R\u001e\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010[\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/combinationselection/CombinationSelection;", "", "", "clearCandidateList", "Lcom/mypinpad/softpos/emv/terminal/entrypoint/model/TerminalProcessingState;", "parentState", "Lcom/mypinpad/softpos/emv/terminal/transaction/model/TransactionRequest;", "transaction", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;", "issuerAuthData", "scriptData", "Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/preprocessing/PreProcessingResponse;", "preprocessingResponse", "Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/combinationselection/CombinationSelectionResponse;", "combinationSelection", "(Lcom/mypinpad/softpos/emv/terminal/entrypoint/model/TerminalProcessingState;Lcom/mypinpad/softpos/emv/terminal/transaction/model/TransactionRequest;Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/preprocessing/PreProcessingResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "combinationSelectionFromA", "(Lcom/mypinpad/softpos/emv/terminal/transaction/model/TransactionRequest;Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/preprocessing/PreProcessingResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "combinationSelectionFromB", "combinationSelectionFromC", "(Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/preprocessing/PreProcessingResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "directoryEntry", "Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/combinationselection/model/CandidateCombination;", "getCandidate", "Lcom/mypinpad/softpos/emv/terminal/common/kernel/model/ApplicationId;", "applicationId", "Lcom/mypinpad/softpos/emv/terminal/config/model/TransactionConfiguration;", "transactionConfiguration", "", "kernelIdByte", "adfTlv", "priorityIndicatorTag", "extendedSelectionTag", "proprietaryDataTag", "(Lcom/mypinpad/softpos/emv/terminal/common/kernel/model/ApplicationId;Lcom/mypinpad/softpos/emv/terminal/config/model/TransactionConfiguration;Ljava/lang/Byte;Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;)Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/combinationselection/model/CandidateCombination;", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/response/CardResponse;", "ppseResponse", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getCandidateList", "", "applicationCandidates", "getHighestPriorityCandidate", "listTlvData", "getKernelIdByte", "(Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;Lcom/mypinpad/softpos/emv/terminal/config/model/TransactionConfiguration;)Ljava/lang/Byte;", "tlv", "getPriorityIndicator", "getProprietaryData", "postEmptyCandidateListOutcome", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/Level2Error;", "l2Error", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/Level3Error;", "l3Error", "", "sw12", "postEndApplicationErrorOutcome", "postParsingErrorOutcome", "postTryAnotherCardOutcome", "processCandidates", "(Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/preprocessing/PreProcessingResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processCandidatesByConfiguration", "(Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/preprocessing/PreProcessingResponse;Lcom/mypinpad/softpos/emv/terminal/transaction/model/TransactionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "removeInvalidRelaxedTags", "selectPPSE", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bf0c", "validate61InBF0C", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/response/emv/EmvSelectApplicationResponse;", "selectResponse", "validateApplicationSelectionMandatoryFields", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelId;", "kernelId", "validateApplicationSelectionResponse", "validatePpseResponse", "validatePpseResponseTags", "", "candidateList", "Ljava/util/List;", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/CardProcessor;", "cardProcessor", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/CardProcessor;", "Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/combinationselection/KernelTransactionConfigurationProvider;", "config", "Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/combinationselection/KernelTransactionConfigurationProvider;", "filteringSelectorMismatched", "Z", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/KernelQ;", "kernelQ", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/KernelQ;", "lastSelectedCandidate", "Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/combinationselection/model/CandidateCombination;", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/GenericOutcomeProcessor;", "outcomeProcessor", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/GenericOutcomeProcessor;", "<init>", "(Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/CardProcessor;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/KernelQ;Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/GenericOutcomeProcessor;Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/combinationselection/KernelTransactionConfigurationProvider;)V", "Companion"}, k = 1, mv = {1, 5, 1})
public final class setAdjustViewBounds {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final byte[] f58236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final List<String> f58237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f58238j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f58239k = 1;

    @NotNull
    public static final setOnFocusChangeListener setY = new setOnFocusChangeListener(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final getValue f58240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTextKeepState f58241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final eu f58242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final exceptionHandler f58243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public List<setPictureListener> f58244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public setPictureListener f58245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f58246g;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/i/setAdjustViewBounds$setOnFocusChangeListener;", "", "", "", "getNavBarTitleString", "Ljava/util/List;", "setY", "", "setOnLongClickListener", "[B", "setCompoundDrawableTintBlendMode", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
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
            int[] iArr = new int[setMaxLines.values().length];
            iArr[setMaxLines.setOnFocusChangeListener.ordinal()] = 1;
            iArr[setMaxLines.setY.ordinal()] = 2;
            iArr[setMaxLines.setX.ordinal()] = 3;
            setY = iArr;
            int i10 = 0 - (-112);
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            int i12 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }
    }

    static {
        byte[] bytes = "2PAY.SYS.DDF01".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        f58236h = bytes;
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1711803826, 1711803947, (int) System.currentTimeMillis());
        String str = (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed));
        TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 1723373489, -1723373305, (int) System.currentTimeMillis());
        String str2 = (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2));
        TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], -817759528, 817759728, (int) System.currentTimeMillis());
        String str3 = (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3));
        TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], -1333173903, 1333173904, (int) System.currentTimeMillis());
        f58237i = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str, str2, str3, (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))});
        int i10 = f58238j;
        int i11 = i10 & 49;
        int i12 = (((i10 | 49) & (~i11)) - (~(i11 << 1))) - 1;
        f58239k = i12 % 128;
        int i13 = i12 % 2;
    }

    public setAdjustViewBounds(@NotNull getValue getvalue, @NotNull setTextKeepState settextkeepstate, @NotNull eu euVar, @NotNull exceptionHandler exceptionhandler) {
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(euVar, "");
        Intrinsics.checkNotNullParameter(exceptionhandler, "");
        this.f58240a = getvalue;
        this.f58241b = settextkeepstate;
        this.f58242c = euVar;
        this.f58243d = exceptionhandler;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:104:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:52:0x042b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0495  */
    /* JADX WARN: Code duplicated, block: B:56:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:60:0x050b  */
    /* JADX WARN: Code duplicated, block: B:62:0x053c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0714  */
    /* JADX WARN: Code duplicated, block: B:89:0x074f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0767  */
    /* JADX WARN: Code duplicated, block: B:92:0x076f  */
    /* JADX WARN: Code duplicated, block: B:96:0x077e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0107  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x07c6 -> B:102:0x07cd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x06be -> B:82:0x06c8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x07af -> B:34:0x02a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object a(java.lang.Object[] r41) {
        /*
            Method dump skipped, instruction units count: 2137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setAdjustViewBounds.a(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ getBeepOnFailure b(Object[] objArr) throws Exception {
        getBeepOnFailure getbeeponfailure;
        Object dividerPadding;
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[0];
        int i10 = f58239k;
        int i11 = i10 + 45;
        f58238j = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (getbeeponfailure2 == null) {
            int i12 = ((i10 & 107) - (~(i10 | 107))) - 1;
            f58238j = i12 % 128;
            int i13 = i12 % 2;
            getbeeponfailure = null;
        } else {
            getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2, setAnimation.setSmoothScrollbarEnabled()}, -990392770, 990392791, System.identityHashCode(getbeeponfailure2));
            int i14 = f58239k;
            int i15 = ((((i14 ^ 57) | (i14 & 57)) << 1) - (~(-(((~i14) & 57) | (i14 & (-58)))))) - 1;
            f58238j = i15 % 128;
            int i16 = i15 % 2;
        }
        if (getbeeponfailure != null) {
            int i17 = f58239k;
            int i18 = i17 & 121;
            int i19 = (i17 ^ 121) | i18;
            int i20 = (i18 & i19) + (i19 | i18);
            f58238j = i20 % 128;
            int i21 = i20 % 2;
            return getbeeponfailure;
        }
        int i22 = f58239k;
        int i23 = (i22 & 85) + (i22 | 85);
        f58238j = i23 % 128;
        if (i23 % 2 != 0) {
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
            TransactionFailed smoothScrollbarEnabled = setAnimation.setSmoothScrollbarEnabled();
            dividerPadding = getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{smoothScrollbarEnabled}, 1914607362, -1914607356, System.identityHashCode(smoothScrollbarEnabled)), new byte[0], null, Boolean.TRUE, 29}, -976227287, 976227290, 29);
        } else {
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
            TransactionFailed smoothScrollbarEnabled2 = setAnimation.setSmoothScrollbarEnabled();
            dividerPadding = getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{smoothScrollbarEnabled2}, 1914607362, -1914607356, System.identityHashCode(smoothScrollbarEnabled2)), new byte[0], null, Boolean.FALSE, 28}, -976227287, 976227290, 28);
        }
        getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) dividerPadding;
        int i24 = f58238j;
        int i25 = i24 & 79;
        int i26 = i25 + ((i24 ^ 79) | i25);
        f58239k = i26 % 128;
        int i27 = i26 % 2;
        return getbeeponfailure3;
    }

    public static /* synthetic */ Object c(Object[] objArr) {
        setAdjustViewBounds setadjustviewbounds = (setAdjustViewBounds) objArr[0];
        Continuation continuation = (Continuation) objArr[1];
        int i10 = f58239k;
        int i11 = i10 & 35;
        int i12 = i11 + ((i10 ^ 35) | i11);
        f58238j = i12 % 128;
        int i13 = i12 % 2;
        Object compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds, null, null, null, null, continuation}, -303261944, 303261946, System.identityHashCode(setadjustviewbounds));
        int i14 = f58238j;
        int i15 = i14 ^ 35;
        int i16 = ((i14 & 35) | i15) << 1;
        int i17 = -i15;
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        f58239k = i18 % 128;
        if (i18 % 2 != 0) {
            return compoundDrawableTintBlendMode;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0193  */
    /* JADX WARN: Code duplicated, block: B:34:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:40:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x031b A[SYNTHETIC] */
    public static /* synthetic */ setPictureListener d(Object[] objArr) {
        byte[] bArr;
        getDetailsFieldTextSizeSp getdetailsfieldtextsizesp;
        getBeepOnFailure getbeeponfailure;
        int i10;
        Iterator<T> it;
        int i11;
        int i12;
        int i13;
        getDetailsFieldTextSizeSp getdetailsfieldtextsizesp2;
        setAdjustViewBounds setadjustviewbounds = (setAdjustViewBounds) objArr[0];
        int i14 = 1;
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[1];
        me meVar = (me) objArr[2];
        int i15 = f58238j;
        int i16 = ((i15 | 67) << 1) - (i15 ^ 67);
        f58239k = i16 % 128;
        int i17 = i16 % 2;
        getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2, setAnimation.setMinHeight()}, -990392770, 990392791, System.identityHashCode(getbeeponfailure2));
        if (getbeeponfailure3 == null) {
            int i18 = f58238j;
            int i19 = i18 & 47;
            int i20 = (i18 ^ 47) | i19;
            int i21 = (i19 & i20) + (i20 | i19);
            f58239k = i21 % 128;
            if (i21 % 2 == 0) {
                throw null;
            }
            bArr = null;
        } else {
            bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3));
            int i22 = f58238j;
            int i23 = i22 & 109;
            int i24 = -(-((i22 ^ 109) | i23));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            f58239k = i25 % 128;
            int i26 = i25 % 2;
        }
        if (bArr != null) {
            int i27 = f58238j;
            int i28 = i27 & 79;
            int i29 = (i27 ^ 79) | i28;
            int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
            f58239k = i30 % 128;
            int i31 = i30 % 2;
            setBackgroundTintList.Companion companion = setBackgroundTintList.INSTANCE;
            if (((Boolean) setBackgroundTintList.Companion.setX(new Object[]{bArr}, -456981728, 456981729, (int) System.currentTimeMillis())).booleanValue()) {
                setBackgroundTintList setbackgroundtintlist = new setBackgroundTintList(bArr);
                setMax y7 = setadjustviewbounds.f58243d.setY(setbackgroundtintlist, meVar.setCompoundDrawableTintBlendMode(), meVar.setOnLongClickListener());
                if (y7 == null) {
                    int i32 = f58239k + 61;
                    f58238j = i32 % 128;
                    if (i32 % 2 != 0) {
                        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                        SouthPacificEndpoint.setX(new Object[]{17066, (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{bArr}, -1588575357, 1588575372, (int) System.currentTimeMillis()), 2}, 1336485880, -1336485874, 17066);
                        return null;
                    }
                    SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{10022, (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{bArr}, -1588575357, 1588575372, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 10022);
                    return null;
                }
                if (meVar.setOnLongClickListener().isEmpty()) {
                    getbeeponfailure = getbeeponfailure3;
                    int i33 = f58239k + 101;
                    f58238j = i33 % 128;
                    i10 = 2;
                    int i34 = i33 % 2;
                } else {
                    int i35 = f58239k;
                    int i36 = (i35 & 86) + (i35 | 86);
                    int i37 = (i36 ^ (-1)) + (i36 << 1);
                    f58238j = i37 % 128;
                    if (i37 % 2 == 0) {
                        int i38 = (i35 & (-42)) | (41 & (~i35));
                        int i39 = -(-((i35 & 41) << 1));
                        int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
                        f58238j = i40 % 128;
                        int i41 = i40 % 2;
                        List<String> onLongClickListener = meVar.setOnLongClickListener();
                        if (onLongClickListener instanceof Collection) {
                            int i42 = f58239k;
                            int i43 = i42 & 5;
                            int i44 = (i43 - (~((i42 ^ 5) | i43))) - 1;
                            f58238j = i44 % 128;
                            int i45 = i44 % 2;
                            if (!onLongClickListener.isEmpty()) {
                                it = onLongClickListener.iterator();
                                int i46 = f58239k + 126;
                                int i47 = (i46 ^ (-1)) + (i46 << 1);
                                f58238j = i47 % 128;
                                int i48 = i47 % 2;
                                while (true) {
                                    if (it.hasNext()) {
                                        int iIdentityHashCode = System.identityHashCode(setadjustviewbounds);
                                        int i49 = ~iIdentityHashCode;
                                        int i50 = i49 & (-2982751);
                                        int i51 = ~(((~i50) & (i49 | (-2982751))) | i50);
                                        int i52 = 2162766 & i51;
                                        int i53 = (i51 | 2162766) & (~i52);
                                        int i54 = ((i53 & i52) | (i53 ^ i52)) * (-712);
                                        int i55 = 300056928 & i54;
                                        int i56 = -(-((i54 ^ 300056928) | i55));
                                        int i57 = (i55 & i56) + (i56 | i55);
                                        int i58 = (-123946192) | i49;
                                        int i59 = (i58 & (-2982751)) | (i58 ^ (-2982751));
                                        int i60 = ~i59;
                                        int i61 = (i59 | i60) & i60;
                                        int i62 = ~(((-819985) ^ iIdentityHashCode) | ((-819985) & iIdentityHashCode));
                                        int i63 = i61 & i62;
                                        int i64 = (~i63) & (i61 | i62);
                                        int i65 = ((i63 & i64) | (i64 ^ i63)) * (-712);
                                        int i66 = i57 & i65;
                                        int i67 = ((i57 ^ i65) | i66) << i14;
                                        int i68 = -((i65 | i57) & (~i66));
                                        int i69 = ((i67 | i68) << i14) - (i68 ^ i67);
                                        int i70 = (i49 | iIdentityHashCode) & i49;
                                        int i71 = (2982750 & i70) | ((-2982751) & (~i70));
                                        int i72 = i70 & (-2982751);
                                        int i73 = (i72 & i71) | (i71 ^ i72);
                                        int i74 = ~i73;
                                        int i75 = (i73 | i74) & i74;
                                        int i76 = (-123946192) ^ i75;
                                        int i77 = i75 & (-123946192);
                                        int i78 = -(~(-(-(((i77 & i76) | (i76 ^ i77)) * 712))));
                                        i11 = (-2) - ((((i69 | i78) << i14) - (i78 ^ i69)) ^ (-1));
                                        int iIdentityHashCode2 = System.identityHashCode(setadjustviewbounds);
                                        int i79 = ~iIdentityHashCode2;
                                        int i80 = (-1985538166) & i79;
                                        int i81 = ((-1985538166) ^ i79) | i80;
                                        int i82 = (i81 & (-1709563488)) | (1709563487 & (~i81)) | (i81 & 1709563487);
                                        int i83 = ~i82;
                                        int i84 = (i82 | i83) & i83;
                                        int i85 = ~i79;
                                        int i86 = ((-1709563488) & i85) | (i79 & 1709563487);
                                        int i87 = (-1709563488) & i79;
                                        int i88 = (i86 ^ i87) | (i86 & i87);
                                        int i89 = i88 & 1985538165;
                                        int i90 = ~(((~i89) & (i88 | 1985538165)) | i89);
                                        int i91 = i84 & i90;
                                        getbeeponfailure = getbeeponfailure3;
                                        int i92 = (i90 | i84) & (~i91);
                                        int i93 = ((i92 & i91) | (i92 ^ i91)) * (-184);
                                        int i94 = (-1893736844) & i93;
                                        int i95 = ((i93 | (-1893736844)) & (~i94)) + (i94 << 1);
                                        int i96 = ((-1985538166) & i85) | (i79 & 1985538165);
                                        int i97 = (i96 & i80) | (i96 ^ i80);
                                        int i98 = ~i97;
                                        int i99 = (i97 | i98) & i98;
                                        int i100 = 1681967189 & i99;
                                        int i101 = (i99 | 1681967189) & (~i100);
                                        int i102 = (i101 & i100) | (i101 ^ i100);
                                        int i103 = (iIdentityHashCode2 | i79) & i79;
                                        int i104 = (-1709563488) & i103;
                                        int i105 = (i103 | (-1709563488)) & (~i104);
                                        int i106 = (i105 & i104) | (i105 ^ i104);
                                        int i107 = ~i106;
                                        int i108 = (i106 | i107) & i107;
                                        int i109 = i102 ^ i108;
                                        int i110 = i108 & i102;
                                        int i111 = ((i110 & i109) | (i109 ^ i110)) * 184;
                                        i12 = ((i95 ^ i111) | (i95 & i111)) << 1;
                                        i13 = -(((~i95) & i111) | ((~i111) & i95));
                                        if (i11 <= ((i12 & i13) + (i13 | i12)) - (-1049553736)) {
                                            int i112 = 71 / 0;
                                            if (Intrinsics.areEqual((String) it.next(), (String) setMax.setX(new Object[]{y7}, -1935099766, 1935099774, System.identityHashCode(y7)))) {
                                                int i113 = f58238j;
                                                int i114 = i113 + 83;
                                                f58239k = i114 % 128;
                                                int i115 = i114 % 2;
                                                int i116 = (((i113 & (-18)) | ((~i113) & 17)) - (~((i113 & 17) << 1))) - 1;
                                                f58239k = i116 % 128;
                                                int i117 = i116 % 2;
                                                int i118 = ((i113 | 87) << 1) - (i113 ^ 87);
                                                f58239k = i118 % 128;
                                                int i119 = i118 % 2;
                                                i10 = 2;
                                            } else {
                                                int i120 = f58238j;
                                                int i121 = i120 & 103;
                                                int i122 = (~i121) & (i120 | 103);
                                                int i123 = i121 << 1;
                                                int i124 = (i122 ^ i123) + ((i123 & i122) << 1);
                                                f58239k = i124 % 128;
                                                int i125 = i124 % 2;
                                                int i126 = (i120 | 107) << 1;
                                                int i127 = -(((~i120) & 107) | (i120 & (-108)));
                                                int i128 = (i126 ^ i127) + ((i127 & i126) << 1);
                                                f58239k = i128 % 128;
                                                int i129 = i128 % 2;
                                                getbeeponfailure3 = getbeeponfailure;
                                                i14 = 1;
                                            }
                                        } else if (Intrinsics.areEqual((String) it.next(), (String) setMax.setX(new Object[]{y7}, -1935099766, 1935099774, System.identityHashCode(y7)))) {
                                            int i1110 = f58238j;
                                            int i1111 = i1110 + 83;
                                            f58239k = i1111 % 128;
                                            int i1112 = i1111 % 2;
                                            int i1113 = (((i1110 & (-18)) | ((~i1110) & 17)) - (~((i1110 & 17) << 1))) - 1;
                                            f58239k = i1113 % 128;
                                            int i1114 = i1113 % 2;
                                            int i1115 = ((i1110 | 87) << 1) - (i1110 ^ 87);
                                            f58239k = i1115 % 128;
                                            int i1116 = i1115 % 2;
                                            i10 = 2;
                                        } else {
                                            int i1210 = f58238j;
                                            int i1211 = i1210 & 103;
                                            int i1212 = (~i1211) & (i1210 | 103);
                                            int i1213 = i1211 << 1;
                                            int i1214 = (i1212 ^ i1213) + ((i1213 & i1212) << 1);
                                            f58239k = i1214 % 128;
                                            int i1215 = i1214 % 2;
                                            int i1216 = (i1210 | 107) << 1;
                                            int i1217 = -(((~i1210) & 107) | (i1210 & (-108)));
                                            int i1218 = (i1216 ^ i1217) + ((i1217 & i1216) << 1);
                                            f58239k = i1218 % 128;
                                            int i1219 = i1218 % 2;
                                            getbeeponfailure3 = getbeeponfailure;
                                            i14 = 1;
                                        }
                                    }
                                }
                            }
                        } else {
                            it = onLongClickListener.iterator();
                            int i410 = f58239k + 126;
                            int i411 = (i410 ^ (-1)) + (i410 << 1);
                            f58238j = i411 % 128;
                            int i412 = i411 % 2;
                            while (true) {
                                if (it.hasNext()) {
                                    int iIdentityHashCode3 = System.identityHashCode(setadjustviewbounds);
                                    int i413 = ~iIdentityHashCode3;
                                    int i510 = i413 & (-2982751);
                                    int i511 = ~(((~i510) & (i413 | (-2982751))) | i510);
                                    int i512 = 2162766 & i511;
                                    int i513 = (i511 | 2162766) & (~i512);
                                    int i514 = ((i513 & i512) | (i513 ^ i512)) * (-712);
                                    int i515 = 300056928 & i514;
                                    int i516 = -(-((i514 ^ 300056928) | i515));
                                    int i517 = (i515 & i516) + (i516 | i515);
                                    int i518 = (-123946192) | i413;
                                    int i519 = (i518 & (-2982751)) | (i518 ^ (-2982751));
                                    int i610 = ~i519;
                                    int i611 = (i519 | i610) & i610;
                                    int i612 = ~(((-819985) ^ iIdentityHashCode3) | ((-819985) & iIdentityHashCode3));
                                    int i613 = i611 & i612;
                                    int i614 = (~i613) & (i611 | i612);
                                    int i615 = ((i613 & i614) | (i614 ^ i613)) * (-712);
                                    int i616 = i517 & i615;
                                    int i617 = ((i517 ^ i615) | i616) << i14;
                                    int i618 = -((i615 | i517) & (~i616));
                                    int i619 = ((i617 | i618) << i14) - (i618 ^ i617);
                                    int i710 = (i413 | iIdentityHashCode3) & i413;
                                    int i711 = (2982750 & i710) | ((-2982751) & (~i710));
                                    int i712 = i710 & (-2982751);
                                    int i713 = (i712 & i711) | (i711 ^ i712);
                                    int i714 = ~i713;
                                    int i715 = (i713 | i714) & i714;
                                    int i716 = (-123946192) ^ i715;
                                    int i717 = i715 & (-123946192);
                                    int i718 = -(~(-(-(((i717 & i716) | (i716 ^ i717)) * 712))));
                                    i11 = (-2) - ((((i619 | i718) << i14) - (i718 ^ i619)) ^ (-1));
                                    int iIdentityHashCode4 = System.identityHashCode(setadjustviewbounds);
                                    int i719 = ~iIdentityHashCode4;
                                    int i810 = (-1985538166) & i719;
                                    int i811 = ((-1985538166) ^ i719) | i810;
                                    int i812 = (i811 & (-1709563488)) | (1709563487 & (~i811)) | (i811 & 1709563487);
                                    int i813 = ~i812;
                                    int i814 = (i812 | i813) & i813;
                                    int i815 = ~i719;
                                    int i816 = ((-1709563488) & i815) | (i719 & 1709563487);
                                    int i817 = (-1709563488) & i719;
                                    int i818 = (i816 ^ i817) | (i816 & i817);
                                    int i819 = i818 & 1985538165;
                                    int i910 = ~(((~i819) & (i818 | 1985538165)) | i819);
                                    int i911 = i814 & i910;
                                    getbeeponfailure = getbeeponfailure3;
                                    int i912 = (i910 | i814) & (~i911);
                                    int i913 = ((i912 & i911) | (i912 ^ i911)) * (-184);
                                    int i914 = (-1893736844) & i913;
                                    int i915 = ((i913 | (-1893736844)) & (~i914)) + (i914 << 1);
                                    int i916 = ((-1985538166) & i815) | (i719 & 1985538165);
                                    int i917 = (i916 & i810) | (i916 ^ i810);
                                    int i918 = ~i917;
                                    int i919 = (i917 | i918) & i918;
                                    int i1010 = 1681967189 & i919;
                                    int i1011 = (i919 | 1681967189) & (~i1010);
                                    int i1012 = (i1011 & i1010) | (i1011 ^ i1010);
                                    int i1013 = (iIdentityHashCode4 | i719) & i719;
                                    int i1014 = (-1709563488) & i1013;
                                    int i1015 = (i1013 | (-1709563488)) & (~i1014);
                                    int i1016 = (i1015 & i1014) | (i1015 ^ i1014);
                                    int i1017 = ~i1016;
                                    int i1018 = (i1016 | i1017) & i1017;
                                    int i1019 = i1012 ^ i1018;
                                    int i1117 = i1018 & i1012;
                                    int i1118 = ((i1117 & i1019) | (i1019 ^ i1117)) * 184;
                                    i12 = ((i915 ^ i1118) | (i915 & i1118)) << 1;
                                    i13 = -(((~i915) & i1118) | ((~i1118) & i915));
                                    if (i11 <= ((i12 & i13) + (i13 | i12)) - (-1049553736)) {
                                        int i1119 = 71 / 0;
                                        if (Intrinsics.areEqual((String) it.next(), (String) setMax.setX(new Object[]{y7}, -1935099766, 1935099774, System.identityHashCode(y7)))) {
                                            int i12110 = f58238j;
                                            int i12111 = i12110 & 103;
                                            int i12112 = (~i12111) & (i12110 | 103);
                                            int i12113 = i12111 << 1;
                                            int i12114 = (i12112 ^ i12113) + ((i12113 & i12112) << 1);
                                            f58239k = i12114 % 128;
                                            int i12115 = i12114 % 2;
                                            int i12116 = (i12110 | 107) << 1;
                                            int i12117 = -(((~i12110) & 107) | (i12110 & (-108)));
                                            int i12118 = (i12116 ^ i12117) + ((i12117 & i12116) << 1);
                                            f58239k = i12118 % 128;
                                            int i12119 = i12118 % 2;
                                            getbeeponfailure3 = getbeeponfailure;
                                            i14 = 1;
                                        } else {
                                            int i11110 = f58238j;
                                            int i11111 = i11110 + 83;
                                            f58239k = i11111 % 128;
                                            int i11112 = i11111 % 2;
                                            int i11113 = (((i11110 & (-18)) | ((~i11110) & 17)) - (~((i11110 & 17) << 1))) - 1;
                                            f58239k = i11113 % 128;
                                            int i11114 = i11113 % 2;
                                            int i11115 = ((i11110 | 87) << 1) - (i11110 ^ 87);
                                            f58239k = i11115 % 128;
                                            int i11116 = i11115 % 2;
                                            i10 = 2;
                                        }
                                    } else if (Intrinsics.areEqual((String) it.next(), (String) setMax.setX(new Object[]{y7}, -1935099766, 1935099774, System.identityHashCode(y7)))) {
                                        int i121110 = f58238j;
                                        int i121111 = i121110 & 103;
                                        int i121112 = (~i121111) & (i121110 | 103);
                                        int i121113 = i121111 << 1;
                                        int i121114 = (i121112 ^ i121113) + ((i121113 & i121112) << 1);
                                        f58239k = i121114 % 128;
                                        int i121115 = i121114 % 2;
                                        int i121116 = (i121110 | 107) << 1;
                                        int i121117 = -(((~i121110) & 107) | (i121110 & (-108)));
                                        int i121118 = (i121116 ^ i121117) + ((i121117 & i121116) << 1);
                                        f58239k = i121118 % 128;
                                        int i121119 = i121118 % 2;
                                        getbeeponfailure3 = getbeeponfailure;
                                        i14 = 1;
                                    } else {
                                        int i11117 = f58238j;
                                        int i11118 = i11117 + 83;
                                        f58239k = i11118 % 128;
                                        int i11119 = i11118 % 2;
                                        int i111110 = (((i11117 & (-18)) | ((~i11117) & 17)) - (~((i11117 & 17) << 1))) - 1;
                                        f58239k = i111110 % 128;
                                        int i111111 = i111110 % 2;
                                        int i111112 = ((i11117 | 87) << 1) - (i11117 ^ 87);
                                        f58239k = i111112 % 128;
                                        int i111113 = i111112 % 2;
                                        i10 = 2;
                                    }
                                }
                            }
                        }
                        int i130 = f58238j;
                        int i131 = i130 & 65;
                        int i132 = ((((i130 ^ 65) | i131) << 1) - (~(-((i130 | 65) & (~i131))))) - 1;
                        f58239k = i132 % 128;
                        int i133 = i132 % 2;
                        SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                        spreadBuilder.add((getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{bArr}, -1588575357, 1588575372, (int) System.currentTimeMillis()));
                        String str = (String) setMax.setX(new Object[]{y7}, -1935099766, 1935099774, System.identityHashCode(y7));
                        if (str == null) {
                            int i134 = f58239k;
                            int i135 = (((i134 ^ 85) | (i134 & 85)) << 1) - (((~i134) & 85) | (i134 & (-86)));
                            f58238j = i135 % 128;
                            getdetailsfieldtextsizesp2 = null;
                            if (i135 % 2 != 0) {
                                throw null;
                            }
                        } else {
                            getdetailsfieldtextsizesp2 = (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{str}, 1240364979, -1240364979, (int) System.currentTimeMillis());
                            int i136 = f58239k;
                            int i137 = (i136 & 69) + (i136 | 69);
                            f58238j = i137 % 128;
                            int i138 = i137 % 2;
                        }
                        spreadBuilder.add(getdetailsfieldtextsizesp2);
                        List<String> onLongClickListener2 = meVar.setOnLongClickListener();
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(onLongClickListener2, 10));
                        Iterator<T> it2 = onLongClickListener2.iterator();
                        int i139 = f58238j;
                        int i140 = i139 & 49;
                        int i141 = (i139 | 49) & (~i140);
                        int i142 = i140 << 1;
                        int i143 = ((i141 | i142) << 1) - (i141 ^ i142);
                        f58239k = i143 % 128;
                        int i144 = i143 % 2;
                        while (it2.hasNext()) {
                            int i145 = f58239k;
                            int i146 = i145 & 45;
                            int i147 = (i145 | 45) & (~i146);
                            int i148 = i146 << 1;
                            int i149 = (i147 ^ i148) + ((i147 & i148) << 1);
                            f58238j = i149 % 128;
                            if (i149 % 2 != 0) {
                                arrayList.add((getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) it2.next()}, 1240364979, -1240364979, (int) System.currentTimeMillis()));
                                throw null;
                            }
                            arrayList.add((getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) it2.next()}, 1240364979, -1240364979, (int) System.currentTimeMillis()));
                            int i150 = f58239k;
                            int i151 = (i150 & 5) + (i150 | 5);
                            f58238j = i151 % 128;
                            int i152 = i151 % 2;
                        }
                        Object[] array = arrayList.toArray(new getDetailsFieldTextSizeSp[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        spreadBuilder.addSpread(array);
                        SouthPacificEndpoint.setX(new Object[]{10024, new TerminalLogger((getDetailsFieldTextSizeSp[]) spreadBuilder.toArray(new getDetailsFieldTextSizeSp[spreadBuilder.size()]), null, 2, null), 4}, 1336485880, -1336485874, 10024);
                        setadjustviewbounds.f58246g = true;
                        int i153 = f58239k;
                        int i154 = (i153 ^ 73) + ((i153 & 73) << 1);
                        f58238j = i154 % 128;
                        if (i154 % 2 == 0) {
                            return null;
                        }
                        throw null;
                    }
                    i10 = 2;
                    getbeeponfailure = getbeeponfailure3;
                }
                Object[] objArr2 = new Object[i10];
                objArr2[0] = getbeeponfailure2;
                objArr2[1] = y7;
                Byte b10 = (Byte) setCompoundDrawableTintBlendMode(objArr2, -1804855957, 1804855982, (int) System.currentTimeMillis());
                getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setCompoundDrawableTintBlendMode(new Object[]{getbeeponfailure2}, -123663007, 123663025, (int) System.currentTimeMillis());
                setAnimation setanimation = setAnimation.INSTANCE;
                setPictureListener setpicturelistener = (setPictureListener) setCompoundDrawableTintBlendMode(new Object[]{setbackgroundtintlist, y7, b10, getbeeponfailure, getbeeponfailure4, (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2, (TransactionFailed) setAnimation.setY(new Object[0], -2100658796, 2100658798, (int) System.currentTimeMillis())}, -990392770, 990392791, System.identityHashCode(getbeeponfailure2)), (getBeepOnFailure) setCompoundDrawableTintBlendMode(new Object[]{getbeeponfailure2}, 1819313767, -1819313746, (int) System.currentTimeMillis())}, 813908195, -813908187, (int) System.currentTimeMillis());
                int i155 = f58239k;
                int i156 = i155 | 5;
                int i157 = i156 << 1;
                int i158 = -((~(i155 & 5)) & i156);
                int i159 = (i157 & i158) + (i158 | i157);
                f58238j = i159 % 128;
                int i160 = i159 % 2;
                return setpicturelistener;
            }
        }
        SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
        if (bArr == null) {
            int i161 = f58239k + 39;
            int i162 = i161 % 128;
            f58238j = i162;
            if (i161 % 2 != 0) {
                throw null;
            }
            int i163 = i162 & 61;
            int i164 = (i162 ^ 61) | i163;
            int i165 = (i163 ^ i164) + ((i163 & i164) << 1);
            f58239k = i165 % 128;
            int i166 = i165 % 2;
            getdetailsfieldtextsizesp = null;
        } else {
            getdetailsfieldtextsizesp = (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{bArr}, -1588575357, 1588575372, (int) System.currentTimeMillis());
            System.identityHashCode(setadjustviewbounds);
            System.identityHashCode(setadjustviewbounds);
        }
        SouthPacificEndpoint.setX(new Object[]{10021, getdetailsfieldtextsizesp, 4}, 1336485880, -1336485874, 10021);
        int i167 = f58238j;
        int i168 = (i167 & 75) + (i167 | 75);
        f58239k = i168 % 128;
        if (i168 % 2 != 0) {
            return null;
        }
        int i169 = 5 / 0;
        return null;
    }

    public static /* synthetic */ Object e(Object[] objArr) {
        setAdjustViewBounds setadjustviewbounds = (setAdjustViewBounds) objArr[0];
        setMaxLines setmaxlines = (setMaxLines) objArr[1];
        me meVar = (me) objArr[2];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[3];
        values valuesVar = (values) objArr[4];
        Continuation continuation = (Continuation) objArr[5];
        int i10 = f58239k;
        int i11 = i10 & 15;
        int i12 = (i10 ^ 15) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        f58238j = i13 % 128;
        int i14 = i13 % 2;
        Object compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds, setmaxlines, meVar, getbeeponfailure, null, valuesVar, continuation}, -1028118866, 1028118896, System.identityHashCode(setadjustviewbounds));
        int i15 = f58238j + 87;
        f58239k = i15 % 128;
        if (i15 % 2 != 0) {
            return compoundDrawableTintBlendMode;
        }
        throw null;
    }

    public static /* synthetic */ void f(Object[] objArr) {
        byte[] bArr;
        setAdjustViewBounds setadjustviewbounds = (setAdjustViewBounds) objArr[0];
        setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) objArr[1];
        setDrawSelectorOnTop setdrawselectorontop = (setDrawSelectorOnTop) objArr[2];
        byte[] bArr2 = (byte[]) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i10 = f58239k;
        int i11 = ((i10 & (-100)) | ((~i10) & 99)) + ((i10 & 99) << 1);
        f58238j = i11 % 128;
        int i12 = i11 % 2;
        if ((iIntValue & 2) != 0) {
            int i13 = i10 | 59;
            int i14 = i13 << 1;
            int i15 = -(i13 & (~(i10 & 59)));
            int i16 = (i14 & i15) + (i15 | i14);
            f58238j = i16 % 128;
            if (i16 % 2 != 0) {
                ez.setY sety = ez.setDividerPadding;
                throw null;
            }
            ez.setY sety2 = ez.setDividerPadding;
            setdrawselectorontop = (setDrawSelectorOnTop) ez.setY.setX(new Object[0], 254417, -254416, (int) System.currentTimeMillis());
        }
        if ((iIntValue & 4) != 0) {
            int i17 = f58239k;
            int i18 = ((((i17 ^ 39) | (i17 & 39)) << 1) - (~(-(((~i17) & 39) | (i17 & (-40)))))) - 1;
            f58238j = i18 % 128;
            if (i18 % 2 != 0) {
                ez.setY sety3 = ez.setDividerPadding;
                bArr = (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis());
                int i19 = 83 / 0;
            } else {
                ez.setY sety4 = ez.setDividerPadding;
                bArr = (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis());
            }
            bArr2 = bArr;
        }
        setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds, setcontentcapturesession, setdrawselectorontop, bArr2}, -531740334, 531740339, System.identityHashCode(setadjustviewbounds));
        int i20 = f58239k;
        int i21 = ((i20 | 41) << 1) - (i20 ^ 41);
        f58238j = i21 % 128;
        if (i21 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x038a  */
    public static /* synthetic */ setPictureListener g(Object[] objArr) {
        int i10;
        boolean z10;
        List list = (List) objArr[0];
        int i11 = f58239k;
        int i12 = i11 & 37;
        int i13 = i11 | 37;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f58238j = i14 % 128;
        int i15 = i14 % 2;
        Object objFirst = null;
        if (list.size() == 1) {
            int i16 = f58238j;
            int i17 = (((i16 & (-70)) | ((~i16) & 69)) - (~((i16 & 69) << 1))) - 1;
            f58239k = i17 % 128;
            if (i17 % 2 == 0) {
                throw null;
            }
            setPictureListener setpicturelistener = (setPictureListener) CollectionsKt___CollectionsKt.first(list);
            int i18 = f58239k;
            int i19 = i18 & 9;
            int i20 = ((i18 ^ 9) | i19) << 1;
            int i21 = -((i18 | 9) & (~i19));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f58238j = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 63 / 0;
            }
            return setpicturelistener;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        int i24 = f58238j + 9;
        f58239k = i24 % 128;
        int i25 = i24 % 2;
        for (Object obj : list2) {
            int i26 = f58239k;
            int i27 = i26 ^ 121;
            int i28 = -(-((i26 & 121) << 1));
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            f58238j = i29 % 128;
            int i30 = i29 % 2;
            setPictureListener setpicturelistener2 = (setPictureListener) obj;
            if (((Integer) setPictureListener.setY(new Object[]{setpicturelistener2}, 1071875703, -1071875698, System.identityHashCode(setpicturelistener2))).intValue() > 0) {
                int i31 = f58238j + 95;
                f58239k = i31 % 128;
                if (i31 % 2 != 0 ? (((Integer) setPictureListener.setY(new Object[]{setpicturelistener2}, 1071875703, -1071875698, System.identityHashCode(setpicturelistener2))).intValue() & 15) == 0 : (((Integer) setPictureListener.setY(new Object[]{setpicturelistener2}, 1071875703, -1071875698, System.identityHashCode(setpicturelistener2))).intValue() & 126) == 0) {
                    int i32 = f58239k;
                    int i33 = (((i32 ^ 81) | (i32 & 81)) << 1) - ((81 & (~i32)) | (i32 & (-82)));
                    f58238j = i33 % 128;
                    int i34 = i33 % 2;
                    z10 = false;
                } else {
                    int i35 = f58238j;
                    int i36 = i35 & 39;
                    int i37 = (i35 | 39) & (~i36);
                    int i38 = i36 << 1;
                    int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
                    int i40 = i39 % 128;
                    f58239k = i40;
                    int i41 = i39 % 2;
                    int i42 = ((i40 ^ 17) | (i40 & 17)) << 1;
                    int i43 = -(((~i40) & 17) | (i40 & (-18)));
                    int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                    f58238j = i44 % 128;
                    int i45 = i44 % 2;
                    z10 = true;
                }
            } else {
                int i310 = f58239k;
                int i311 = (((i310 ^ 81) | (i310 & 81)) << 1) - ((81 & (~i310)) | (i310 & (-82)));
                f58238j = i311 % 128;
                int i312 = i311 % 2;
                z10 = false;
            }
            if (!(!z10)) {
                int i46 = f58239k;
                int i47 = ((i46 & (-66)) | ((~i46) & 65)) + ((i46 & 65) << 1);
                f58238j = i47 % 128;
                int i48 = i47 % 2;
                arrayList.add(obj);
                int i49 = f58238j;
                int i50 = ((((i49 ^ 15) | (i49 & 15)) << 1) - (~(-(((~i49) & 15) | (i49 & (-16)))))) - 1;
                f58239k = i50 % 128;
                int i51 = i50 % 2;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list2.iterator();
        int i52 = f58239k + 25;
        f58238j = i52 % 128;
        int i53 = i52 % 2;
        while (it.hasNext()) {
            int i54 = f58238j;
            int i55 = i54 & 125;
            int i56 = -(-((i54 ^ 125) | i55));
            int i57 = (i55 & i56) + (i56 | i55);
            f58239k = i57 % 128;
            if (i57 % 2 == 0) {
                setPictureListener setpicturelistener3 = (setPictureListener) it.next();
                ((Integer) setPictureListener.setY(new Object[]{setpicturelistener3}, 1071875703, -1071875698, System.identityHashCode(setpicturelistener3))).intValue();
                throw null;
            }
            Object next = it.next();
            setPictureListener setpicturelistener4 = (setPictureListener) next;
            if (((Integer) setPictureListener.setY(new Object[]{setpicturelistener4}, 1071875703, -1071875698, System.identityHashCode(setpicturelistener4))).intValue() == 0 || (((Integer) setPictureListener.setY(new Object[]{setpicturelistener4}, 1071875703, -1071875698, System.identityHashCode(setpicturelistener4))).intValue() & 15) == 0) {
                int i58 = f58239k + 105;
                int i59 = i58 % 128;
                f58238j = i59;
                int i60 = i58 % 2;
                int i61 = (i59 & 99) + (i59 | 99);
                f58239k = i61 % 128;
                int i62 = i61 % 2;
                arrayList2.add(next);
                int i63 = f58238j;
                int i64 = i63 & 27;
                int i65 = (i63 | 27) & (~i64);
                int i66 = i64 << 1;
                i10 = (i65 & i66) + (i65 | i66);
            } else {
                int i67 = f58238j;
                i10 = ((i67 | 125) << 1) - (i67 ^ 125);
            }
            f58239k = i10 % 128;
            int i68 = i10 % 2;
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.mypinpad.tsdk.i.setAdjustViewBounds.4
            public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr2, int i69, int i70, int i71) {
                Object obj2 = objArr2[1];
                setPictureListener setpicturelistener5 = (setPictureListener) obj2;
                setPictureListener setpicturelistener6 = (setPictureListener) objArr2[2];
                return Integer.valueOf(e.compareValues(Integer.valueOf(((Integer) setPictureListener.setY(new Object[]{setpicturelistener5}, 1071875703, -1071875698, System.identityHashCode(setpicturelistener5))).intValue() & 15), Integer.valueOf(((Integer) setPictureListener.setY(new Object[]{setpicturelistener6}, 1071875703, -1071875698, System.identityHashCode(setpicturelistener6))).intValue() & 15)));
            }

            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ((Integer) setOnFocusChangeListener(new Object[]{this, t10, t11}, -1361830447, 1361830447, System.identityHashCode(this))).intValue();
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = listSortedWith.iterator();
        int i69 = f58238j;
        int i70 = i69 & 97;
        int i71 = (i69 ^ 97) | i70;
        int i72 = i70 & i71;
        while (true) {
            int i73 = i72 + (i71 | i70);
            f58239k = i73 % 128;
            int i74 = i73 % 2;
            if (!it2.hasNext()) {
                break;
            }
            int i75 = f58239k;
            int i76 = ((i75 & 11) - (~(i75 | 11))) - 1;
            f58238j = i76 % 128;
            int i77 = i76 % 2;
            Object next2 = it2.next();
            setPictureListener setpicturelistener5 = (setPictureListener) next2;
            Integer numValueOf = Integer.valueOf(((Integer) setPictureListener.setY(new Object[]{setpicturelistener5}, 1071875703, -1071875698, System.identityHashCode(setpicturelistener5))).intValue() & 15);
            Object arrayList3 = linkedHashMap.get(numValueOf);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList3);
                int i78 = f58238j;
                int i79 = i78 ^ 111;
                int i80 = ((i78 & 111) | i79) << 1;
                int i81 = -i79;
                int i82 = (i80 ^ i81) + ((i80 & i81) << 1);
                f58239k = i82 % 128;
                int i83 = i82 % 2;
            }
            ((List) arrayList3).add(next2);
            int i84 = f58238j;
            int i85 = i84 & 81;
            i71 = (i84 | 81) & (~i85);
            i70 = i85 << 1;
            i72 = i71 & i70;
        }
        if (linkedHashMap.isEmpty()) {
            int i86 = f58238j;
            int i87 = i86 & 51;
            int i88 = i87 + ((i86 ^ 51) | i87);
            f58239k = i88 % 128;
            int i89 = i88 % 2;
            if (arrayList2.isEmpty()) {
                int i90 = f58239k;
                int i91 = (i90 ^ 61) + ((i90 & 61) << 1);
                f58238j = i91 % 128;
                if (i91 % 2 == 0) {
                    SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{"No suitable application found for combination selection"}, -1475632754, 1475632759, (int) System.currentTimeMillis());
                    return null;
                }
                SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{"No suitable application found for combination selection"}, -1475632754, 1475632759, (int) System.currentTimeMillis());
                throw null;
            }
            objFirst = CollectionsKt___CollectionsKt.first((List<? extends Object>) arrayList2);
            int i92 = f58238j;
            int i93 = i92 & 15;
            int i94 = i93 + ((i92 ^ 15) | i93);
            f58239k = i94 % 128;
            int i95 = i94 % 2;
        } else {
            int iIntValue = ((Number) linkedHashMap.keySet().iterator().next()).intValue();
            int i96 = f58238j;
            int i97 = (((i96 ^ 43) | (i96 & 43)) << 1) - (((~i96) & 43) | (i96 & (-44)));
            f58239k = i97 % 128;
            int i98 = i97 % 2;
            for (Object obj2 : arrayList) {
                int i99 = f58239k;
                int i100 = ((i99 ^ 125) | (i99 & 125)) << 1;
                int i101 = -(((~i99) & 125) | (i99 & (-126)));
                int i102 = ((i100 | i101) << 1) - (i101 ^ i100);
                f58238j = i102 % 128;
                int i103 = i102 % 2;
                setPictureListener setpicturelistener6 = (setPictureListener) obj2;
                if ((((Integer) setPictureListener.setY(new Object[]{setpicturelistener6}, 1071875703, -1071875698, System.identityHashCode(setpicturelistener6))).intValue() & 15) == iIntValue) {
                    int i104 = f58239k;
                    int i105 = i104 & 85;
                    int i106 = i105 + ((i104 ^ 85) | i105);
                    f58238j = i106 % 128;
                    int i107 = i106 % 2;
                    int i108 = ((i104 | 71) << 1) - (i104 ^ 71);
                    int i109 = i108 % 128;
                    f58238j = i109;
                    if (i108 % 2 != 0) {
                        int i110 = 32 / 0;
                    }
                    int i111 = i109 & 123;
                    int i112 = i111 + ((i109 ^ 123) | i111);
                    f58239k = i112 % 128;
                    int i113 = i112 % 2;
                    objFirst = obj2;
                } else {
                    int i114 = f58238j;
                    int i115 = (-2) - (((i114 & 84) + (i114 | 84)) ^ (-1));
                    f58239k = i115 % 128;
                    int i116 = i115 % 2;
                }
            }
            int i117 = f58238j;
            int i118 = i117 ^ 35;
            int i119 = ((i117 & 35) | i118) << 1;
            int i120 = -i118;
            int i121 = ((i119 | i120) << 1) - (i119 ^ i120);
            f58239k = i121 % 128;
            int i122 = i121 % 2;
        }
        setPictureListener setpicturelistener7 = (setPictureListener) objFirst;
        int i123 = f58239k;
        int i124 = ((((i123 ^ 71) | (i123 & 71)) << 1) - (~(-(((~i123) & 71) | (i123 & (-72)))))) - 1;
        f58238j = i124 % 128;
        int i125 = i124 % 2;
        return setpicturelistener7;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0550 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:105:0x0551  */
    /* JADX WARN: Code duplicated, block: B:43:0x023e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0267  */
    /* JADX WARN: Code duplicated, block: B:46:0x028c  */
    /* JADX WARN: Code duplicated, block: B:48:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x035d  */
    /* JADX WARN: Code duplicated, block: B:52:0x036f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0370  */
    /* JADX WARN: Code duplicated, block: B:54:0x0371  */
    /* JADX WARN: Code duplicated, block: B:56:0x0373  */
    /* JADX WARN: Code duplicated, block: B:59:0x03ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:66:0x03d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x044f  */
    /* JADX WARN: Code duplicated, block: B:77:0x049b  */
    /* JADX WARN: Code duplicated, block: B:79:0x04a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:8:0x0077  */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0544, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x03ce, code lost:
    
        if (r1 == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x03d3, code lost:
    
        if (r1 == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x03d5, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.setAdjustViewBounds.f58239k;
        r3 = r1 & 83;
        r1 = -(-((r1 ^ 83) | r3));
        r4 = ((r3 | r1) << 1) - (r1 ^ r3);
        com.mypinpad.tsdk.isolation.setAdjustViewBounds.f58238j = r4 % 128;
        r1 = 2;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x03ea, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.setAdjustViewBounds.f58239k + 17;
        com.mypinpad.tsdk.isolation.setAdjustViewBounds.f58238j = r3 % 128;
        r3 = r3 % 2;
        r13.f57636p0 = null;
        r13.f57637q0 = null;
        r13.f57638r0 = null;
        r13.f57639s0 = null;
        r13.f57640t0 = null;
        r13.f57641u0 = null;
        r13.v0 = null;
        r13.f57644y0 = 4;
        r10 = setCompoundDrawableTintBlendMode(new java.lang.Object[]{r14, r12, r9, r7, r13}, -972750399, 972750411, java.lang.System.identityHashCode(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0421, code lost:
    
        if (r10 != r11) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0423, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.setAdjustViewBounds.f58238j + 45;
        r1 = r0 % 128;
        com.mypinpad.tsdk.isolation.setAdjustViewBounds.f58239k = r1;
        r0 = r0 % 2;
        r0 = r1 & 109;
        r1 = (r1 | 109) & (~r0);
        r0 = r0 << 1;
        r2 = (r1 & r0) + (r0 | r1);
        com.mypinpad.tsdk.isolation.setAdjustViewBounds.f58238j = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x043e, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x04ff, code lost:
    
        if (r10 == r11) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0502, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x052d, code lost:
    
        if (r10 == r11) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x052f, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.setAdjustViewBounds.f58238j;
        r1 = r0 & 1;
        r0 = -(-(r0 | 1));
        r2 = (r1 & r0) + (r0 | r1);
        com.mypinpad.tsdk.isolation.setAdjustViewBounds.f58239k = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0540, code lost:
    
        if ((r2 % 2) == 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0542, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object h(java.lang.Object[] r20) {
        /*
            Method dump skipped, instruction units count: 1362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setAdjustViewBounds.h(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Boolean i(Object[] objArr) {
        Terminal terminal = (Terminal) objArr[0];
        setScreenReaderFocusable setscreenreaderfocusable = (setScreenReaderFocusable) objArr[1];
        int i10 = f58238j;
        int i11 = (i10 ^ 7) + ((i10 & 7) << 1);
        f58239k = i11 % 128;
        if (i11 % 2 == 0) {
            Terminal.Companion companion = Terminal.INSTANCE;
            throw null;
        }
        if (terminal == Terminal.KERNEL_3) {
            int i12 = f58239k;
            int i13 = ((i12 | 69) << 1) - (i12 ^ 69);
            f58238j = i13 % 128;
            int i14 = i13 % 2;
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScreenReaderFocusable.setCompoundDrawableTintBlendMode(new Object[]{setscreenreaderfocusable}, 891387550, -891387549, System.identityHashCode(setscreenreaderfocusable));
            if (getbeeponfailure == null) {
                int i15 = f58238j;
                int i16 = (i15 & (-30)) | ((~i15) & 29);
                int i17 = -(-((i15 & 29) << 1));
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                int i19 = i18 % 128;
                f58239k = i19;
                int i20 = i18 % 2;
                int i21 = ((i19 | 110) << 1) - (i19 ^ 110);
                int i22 = (i21 ^ (-1)) + (i21 << 1);
                f58238j = i22 % 128;
                int i23 = i22 % 2;
                return Boolean.FALSE;
            }
            bj bjVar = new bj(getbeeponfailure);
            bo boVar = (bo) ((setImageTintList) w.setX(new Object[]{bjVar}, 1693919772, -1693919769, System.identityHashCode(bjVar)));
            setMaxWidth setmaxwidth = (setMaxWidth) ((List) bo.setY(new Object[]{boVar}, -1194860115, 1194860115, System.identityHashCode(boVar)));
            setAnimation setanimation = setAnimation.INSTANCE;
            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -692948779, 692948802, (int) System.currentTimeMillis());
            if (((getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -480651882, 480651889, System.identityHashCode(setmaxwidth))) == null) {
                int i24 = f58239k;
                int i25 = i24 & 41;
                int i26 = ((i24 ^ 41) | i25) << 1;
                int i27 = -((~i25) & (i24 | 41));
                int i28 = (i26 & i27) + (i26 | i27);
                f58238j = i28 % 128;
                boolean z10 = i28 % 2 != 0;
                int i29 = i24 + 125;
                f58238j = i29 % 128;
                int i30 = i29 % 2;
                return Boolean.valueOf(z10);
            }
        }
        boolean zBooleanValue = ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{setscreenreaderfocusable}, -2006010085, 2006010086, (int) System.currentTimeMillis())).booleanValue();
        int i31 = f58239k;
        int i32 = ((i31 & (-112)) | ((~i31) & 111)) + ((i31 & 111) << 1);
        f58238j = i32 % 128;
        int i33 = i32 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:45:0x021e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0221  */
    /* JADX WARN: Code duplicated, block: B:49:0x0234  */
    /* JADX WARN: Code duplicated, block: B:52:0x0243  */
    /* JADX WARN: Code duplicated, block: B:54:0x0263  */
    /* JADX WARN: Code duplicated, block: B:56:0x0296 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0297  */
    /* JADX WARN: Code duplicated, block: B:58:0x0298  */
    /* JADX WARN: Code duplicated, block: B:60:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x02d7  */
    public static /* synthetic */ Byte j(Object[] objArr) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        setMax setmax = (setMax) objArr[1];
        int i14 = f58238j;
        int i15 = i14 & 5;
        int i16 = -(-((i14 ^ 5) | i15));
        int i17 = (i15 & i16) + (i16 | i15);
        f58239k = i17 % 128;
        int i18 = i17 % 2;
        setAnimation setanimation = setAnimation.INSTANCE;
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, (TransactionFailed) setAnimation.setY(new Object[0], -628551892, 628552140, (int) System.currentTimeMillis())}, -990392770, 990392791, System.identityHashCode(getbeeponfailure));
        if (((Terminal) setMax.setX(new Object[]{setmax}, -1116972605, 1116972608, System.identityHashCode(setmax))) == Terminal.KERNEL_3) {
            int i19 = f58238j;
            int i20 = (i19 | 55) << 1;
            int i21 = -(i19 ^ 55);
            int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
            f58239k = i22 % 128;
            if (i22 % 2 == 0) {
                throw null;
            }
            int i23 = i19 + 97;
            f58239k = i23 % 128;
            if (i23 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (((Terminal) setMax.setX(new Object[]{setmax}, -1116972605, 1116972608, System.identityHashCode(setmax))) == Terminal.KERNEL_2) {
            int i24 = f58239k;
            int i25 = i24 & 123;
            int i26 = ((i24 ^ 123) | i25) << 1;
            int i27 = -((i24 | 123) & (~i25));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            f58238j = i28 % 128;
            int i29 = i28 % 2;
            setVerticalScrollBarEnabled setverticalscrollbarenabled = setVerticalScrollBarEnabled.INSTANCE;
            Byte bValueOf = Byte.valueOf(((Byte) setVerticalScrollBarEnabled.setY(new Object[]{getbeeponfailure2}, -1247990827, 1247990827, (int) System.currentTimeMillis())).byteValue());
            int i30 = f58238j;
            int i31 = i30 & 17;
            int i32 = (i30 | 17) & (~i31);
            int i33 = i31 << 1;
            int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
            f58239k = i34 % 128;
            int i35 = i34 % 2;
            return bValueOf;
        }
        Byte bValueOf2 = (byte) 0;
        if (getbeeponfailure2 != null) {
            int i36 = f58238j;
            int i37 = ((i36 & 62) + (i36 | 62)) - 1;
            f58239k = i37 % 128;
            int i38 = i37 % 2;
            if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2))).length == 0) {
                int i39 = f58238j;
                int i40 = (((i39 ^ 29) | (i39 & 29)) << 1) - (((~i39) & 29) | (i39 & (-30)));
                int i41 = i40 % 128;
                f58239k = i41;
                int i42 = i40 % 2;
                int i43 = i41 & 55;
                int i44 = ((i41 ^ 55) | i43) << 1;
                int i45 = -((i41 | 55) & (~i43));
                int i46 = (i44 & i45) + (i45 | i44);
                f58238j = i46 % 128;
                int i47 = i46 % 2;
                z10 = true;
            } else {
                int i48 = f58239k;
                int i49 = (i48 & (-30)) | ((~i48) & 29);
                int i50 = (i48 & 29) << 1;
                int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
                f58238j = i51 % 128;
                int i52 = i51 % 2;
                z10 = false;
            }
            if (!z10) {
                int i53 = f58239k;
                int i54 = i53 & 103;
                int i55 = (i53 | 103) & (~i54);
                int i56 = i54 << 1;
                int i57 = (i55 ^ i56) + ((i55 & i56) << 1);
                f58238j = i57 % 128;
                if (i57 % 2 == 0 ? ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2))).length <= 8 : ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2))).length <= 79) {
                    byte[] bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2));
                    byte b10 = bArr[0];
                    byte b11 = (byte) (b10 & Constants.CVR_B2b87_11_RFU);
                    if (b11 != 0) {
                        int i58 = f58239k;
                        int i59 = i58 & 53;
                        int i60 = (((~i59) & (i58 | 53)) - (~(-(-(i59 << 1))))) - 1;
                        f58238j = i60 % 128;
                        if (i60 % 2 == 0 ? b11 == 64 : ((byte) (b10 & 43)) == 3) {
                            bValueOf2 = Byte.valueOf(((Byte) setLogo.setY(new Object[]{Byte.valueOf(b10), 5, 6}, -1812187572, 1812187578, 5)).byteValue());
                            int i61 = f58239k;
                            int i62 = (i61 & (-32)) | ((~i61) & 31);
                            int i63 = -(-((i61 & 31) << 1));
                            int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
                            f58238j = i64 % 128;
                            int i65 = i64 % 2;
                        }
                    } else {
                        bValueOf2 = Byte.valueOf(((Byte) setLogo.setY(new Object[]{Byte.valueOf(b10), 5, 6}, -1812187572, 1812187578, 5)).byteValue());
                        int i66 = f58239k;
                        int i67 = (i66 & (-32)) | ((~i66) & 31);
                        int i68 = -(-((i66 & 31) << 1));
                        int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                        f58238j = i69 % 128;
                        int i610 = i69 % 2;
                    }
                    byte b12 = bArr[0];
                    byte b13 = (byte) (b12 & Constants.CVR_B2b87_11_RFU);
                    if (b13 != -128) {
                        int i70 = f58239k;
                        int i71 = i70 ^ 75;
                        int i72 = (i70 & 75) << 1;
                        int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                        f58238j = i73 % 128;
                        int i74 = i73 % 2;
                        if (b13 == -64) {
                            if (bArr.length < 3) {
                                int i75 = f58238j;
                                int i76 = i75 & 65;
                                i13 = (i76 - (~(-(-((i75 ^ 65) | i76))))) - 1;
                                int i77 = i13 % 128;
                                f58239k = i77;
                                if (i13 % 2 == 0) {
                                    int i78 = 45 / 0;
                                }
                                int i79 = (i77 ^ 53) + ((i77 & 53) << 1);
                                f58238j = i79 % 128;
                                int i80 = i79 % 2;
                                return null;
                            }
                            if (((Byte) setLogo.setY(new Object[]{Byte.valueOf(b12), 5, 6}, -1812187572, 1812187578, 5)).byteValue() == 0) {
                                int i81 = f58239k;
                                int i82 = (i81 | 103) << 1;
                                int i83 = -((i81 & (-104)) | ((~i81) & 103));
                                int i84 = (i82 & i83) + (i82 | i83);
                                f58238j = i84 % 128;
                                int i85 = i84 % 2;
                                int i86 = i81 ^ 97;
                                int i87 = (((i81 & 97) | i86) << 1) - i86;
                                f58238j = i87 % 128;
                                int i88 = i87 % 2;
                                int i89 = i81 & 115;
                                int i90 = (i81 | 115) & (~i89);
                                int i91 = i89 << 1;
                                i12 = (i90 & i91) + (i90 | i91);
                                f58238j = i12 % 128;
                                if (i12 % 2 == 0) {
                                    return null;
                                }
                                throw null;
                            }
                            int i92 = f58239k;
                            int i93 = (((i92 | 88) << 1) - (i92 ^ 88)) - 1;
                            f58238j = i93 % 128;
                            int i94 = i93 % 2;
                            int i95 = i92 & 105;
                            int i96 = (i92 | 105) & (~i95);
                            int i97 = i95 << 1;
                            i10 = (i96 ^ i97) + ((i96 & i97) << 1);
                            f58238j = i10 % 128;
                            if (i10 % 2 != 0) {
                                byte b14 = bArr[1];
                                byte b15 = bArr[0];
                                int i98 = b14 ^ b15;
                                int i99 = b15 & b14;
                                byte b16 = (byte) ((i99 & i98) | (i98 ^ i99));
                                byte b17 = bArr[3];
                                int i100 = b16 & b17;
                                int i101 = (b16 | b17) & (~i100);
                                i11 = (i101 & i100) | (i101 ^ i100);
                            } else {
                                byte b18 = bArr[0];
                                byte b19 = bArr[1];
                                byte b20 = (byte) ((b18 & b19) | (b18 ^ b19));
                                byte b21 = bArr[2];
                                i11 = (b20 & b21) | (b20 ^ b21);
                            }
                            bValueOf2 = Byte.valueOf((byte) i11);
                        }
                    } else {
                        if (bArr.length < 3) {
                            int i710 = f58238j;
                            int i711 = i710 & 65;
                            i13 = (i711 - (~(-(-((i710 ^ 65) | i711))))) - 1;
                            int i712 = i13 % 128;
                            f58239k = i712;
                            if (i13 % 2 == 0) {
                                int i713 = 45 / 0;
                            }
                            int i714 = (i712 ^ 53) + ((i712 & 53) << 1);
                            f58238j = i714 % 128;
                            int i810 = i714 % 2;
                            return null;
                        }
                        if (((Byte) setLogo.setY(new Object[]{Byte.valueOf(b12), 5, 6}, -1812187572, 1812187578, 5)).byteValue() == 0) {
                            int i811 = f58239k;
                            int i812 = (i811 | 103) << 1;
                            int i813 = -((i811 & (-104)) | ((~i811) & 103));
                            int i814 = (i812 & i813) + (i812 | i813);
                            f58238j = i814 % 128;
                            int i815 = i814 % 2;
                            int i816 = i811 ^ 97;
                            int i817 = (((i811 & 97) | i816) << 1) - i816;
                            f58238j = i817 % 128;
                            int i818 = i817 % 2;
                            int i819 = i811 & 115;
                            int i910 = (i811 | 115) & (~i819);
                            int i911 = i819 << 1;
                            i12 = (i910 & i911) + (i910 | i911);
                            f58238j = i12 % 128;
                            if (i12 % 2 == 0) {
                                return null;
                            }
                            throw null;
                        }
                        int i912 = f58239k;
                        int i913 = (((i912 | 88) << 1) - (i912 ^ 88)) - 1;
                        f58238j = i913 % 128;
                        int i914 = i913 % 2;
                        int i915 = i912 & 105;
                        int i916 = (i912 | 105) & (~i915);
                        int i917 = i915 << 1;
                        i10 = (i916 ^ i917) + ((i916 & i917) << 1);
                        f58238j = i10 % 128;
                        if (i10 % 2 != 0) {
                            byte b110 = bArr[1];
                            byte b111 = bArr[0];
                            int i918 = b110 ^ b111;
                            int i919 = b111 & b110;
                            byte b112 = (byte) ((i919 & i918) | (i918 ^ i919));
                            byte b113 = bArr[3];
                            int i102 = b112 & b113;
                            int i103 = (b112 | b113) & (~i102);
                            i11 = (i103 & i102) | (i103 ^ i102);
                        } else {
                            byte b114 = bArr[0];
                            byte b115 = bArr[1];
                            byte b22 = (byte) ((b114 & b115) | (b114 ^ b115));
                            byte b23 = bArr[2];
                            i11 = (b22 & b23) | (b22 ^ b23);
                        }
                        bValueOf2 = Byte.valueOf((byte) i11);
                    }
                    int i104 = f58238j;
                    int i105 = i104 & 29;
                    int i106 = ((i104 ^ 29) | i105) << 1;
                    int i107 = -((i104 | 29) & (~i105));
                    int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                    f58239k = i108 % 128;
                    if (i108 % 2 != 0) {
                        return bValueOf2;
                    }
                    throw null;
                }
            }
        }
        int i109 = f58238j;
        int i110 = (i109 & 35) + (i109 | 35);
        f58239k = i110 % 128;
        if (i110 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ setPictureListener k(Object[] objArr) {
        Terminal terminal;
        setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) objArr[0];
        setMax setmax = (setMax) objArr[1];
        Byte b10 = (Byte) objArr[2];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[3];
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[4];
        getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) objArr[5];
        getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) objArr[6];
        int i10 = f58239k;
        int i11 = (i10 & (-68)) | ((~i10) & 67);
        int i12 = (i10 & 67) << 1;
        int i13 = (i11 & i12) + (i11 | i12);
        f58238j = i13 % 128;
        int i14 = i13 % 2;
        if (b10 == null) {
            int i15 = i10 & 41;
            int i16 = (i10 ^ 41) | i15;
            int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
            int i18 = i17 % 128;
            f58238j = i18;
            int i19 = i17 % 2;
            int i20 = (-2) - (((i18 & 110) + (i18 | 110)) ^ (-1));
            f58239k = i20 % 128;
            int i21 = i20 % 2;
            terminal = null;
        } else {
            byte bByteValue = b10.byteValue();
            Terminal.Companion companion = Terminal.INSTANCE;
            terminal = (Terminal) Terminal.Companion.setDividerPadding(new Object[]{Byte.valueOf(bByteValue)}, -670685073, 670685073, (int) System.currentTimeMillis());
            int i22 = f58239k;
            int i23 = (i22 ^ 95) + ((i22 & 95) << 1);
            f58238j = i23 % 128;
            int i24 = i23 % 2;
        }
        if (terminal == null) {
            int i25 = f58238j;
            int i26 = i25 & 35;
            int i27 = i26 + ((i25 ^ 35) | i26);
            f58239k = i27 % 128;
            int i28 = i27 % 2;
            Terminal terminal2 = (Terminal) setMax.setX(new Object[]{setmax}, -1116972605, 1116972608, System.identityHashCode(setmax));
            int i29 = f58238j + 101;
            f58239k = i29 % 128;
            int i30 = i29 % 2;
            terminal = terminal2;
        } else {
            int i31 = f58238j;
            int i32 = ((i31 | 89) << 1) - (i31 ^ 89);
            f58239k = i32 % 128;
            int i33 = i32 % 2;
        }
        if (terminal.setCompoundDrawableTintBlendMode()) {
            setPictureListener setpicturelistener = new setPictureListener(setmax.setX(), setmax.setLayoutAnimation(), new setTitleMarginTop(terminal, setbackgroundtintlist, getbeeponfailure, getbeeponfailure2, getbeeponfailure3, getbeeponfailure4, null, null, 192, null));
            int i34 = f58239k + 35;
            f58238j = i34 % 128;
            if (i34 % 2 == 0) {
                return setpicturelistener;
            }
            throw null;
        }
        int i35 = f58239k;
        int i36 = i35 ^ 81;
        int i37 = ((i35 & 81) | i36) << 1;
        int i38 = -i36;
        int i39 = (i37 & i38) + (i37 | i38);
        int i40 = i39 % 128;
        f58238j = i40;
        if (i39 % 2 != 0) {
            throw null;
        }
        int i41 = i40 + 9;
        f58239k = i41 % 128;
        if (i41 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x007b  */
    /* JADX WARN: Code duplicated, block: B:12:0x00c9  */
    public static /* synthetic */ Boolean l(Object[] objArr) {
        setAdjustViewBounds setadjustviewbounds = (setAdjustViewBounds) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        int i10 = f58239k;
        int i11 = (i10 & 88) + (i10 | 88);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f58238j = i12 % 128;
        int i13 = i12 % 2;
        if (!(!((Boolean) setRotationX.setX(new Object[]{setrotationx}, -268504199, 268504206, System.identityHashCode(setrotationx))).booleanValue())) {
            if (((Boolean) setCompoundDrawableTintBlendMode(new Object[]{setrotationx}, -645595916, 645595922, (int) System.currentTimeMillis())).booleanValue()) {
                int i14 = f58238j;
                int i15 = i14 & 99;
                int i16 = ((i14 ^ 99) | i15) << 1;
                int i17 = -((i14 | 99) & (~i15));
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                f58239k = i18 % 128;
                int i19 = i18 % 2;
                return Boolean.TRUE;
            }
            int i20 = f58239k;
            int i21 = i20 ^ 87;
            int i22 = -(-((i20 & 87) << 1));
            int i23 = (i21 & i22) + (i22 | i21);
            f58238j = i23 % 128;
            int i24 = i23 % 2;
            setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds}, -1248398686, 1248398706, System.identityHashCode(setadjustviewbounds));
            int i25 = f58239k;
            int i26 = ((i25 | 49) << 1) - (i25 ^ 49);
            f58238j = i26 % 128;
            if (i26 % 2 == 0) {
                return Boolean.FALSE;
            }
            int i27 = 77 / 0;
            return Boolean.FALSE;
        }
        int i28 = f58238j;
        int i29 = (i28 ^ 31) + ((i28 & 31) << 1);
        f58239k = i29 % 128;
        if (i29 % 2 == 0) {
            int i30 = 38 / 0;
            if (((setItemChecked) setRotationX.setX(new Object[]{setrotationx}, 2020716727, -2020716721, System.identityHashCode(setrotationx))) != setItemChecked.setDividerPadding) {
                int i31 = f58238j;
                int i32 = i31 & 55;
                int i33 = -(-((i31 ^ 55) | i32));
                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                f58239k = i34 % 128;
                int i35 = i34 % 2;
            } else {
                setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds, (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, -2124921404, 2124921432, System.identityHashCode(setadjustviewbounds));
                int i36 = f58238j + 76;
                int i37 = (i36 ^ (-1)) + (i36 << 1);
                f58239k = i37 % 128;
                int i38 = i37 % 2;
            }
        } else if (((setItemChecked) setRotationX.setX(new Object[]{setrotationx}, 2020716727, -2020716721, System.identityHashCode(setrotationx))) != setItemChecked.setDividerPadding) {
            int i39 = f58238j;
            int i310 = i39 & 55;
            int i311 = -(-((i39 ^ 55) | i310));
            int i312 = (i310 ^ i311) + ((i311 & i310) << 1);
            f58239k = i312 % 128;
            int i313 = i312 % 2;
        } else {
            setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds, (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, -2124921404, 2124921432, System.identityHashCode(setadjustviewbounds));
            int i314 = f58238j + 76;
            int i315 = (i314 ^ (-1)) + (i314 << 1);
            f58239k = i315 % 128;
            int i316 = i315 % 2;
        }
        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
        SouthPacificEndpoint.setX(new Object[]{10008, (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, -1588575357, 1588575372, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 10008);
        int i40 = f58239k + 115;
        f58238j = i40 % 128;
        if (i40 % 2 == 0) {
            return Boolean.FALSE;
        }
        int i41 = 64 / 0;
        return Boolean.FALSE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x015f, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0162, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0164, code lost:
    
        r3 = r11 & 67;
        r2 = ((r11 ^ 67) | r3) << 1;
        r11 = -((r11 | 67) & (~r3));
        r3 = (r2 & r11) + (r11 | r2);
        r11 = r3 % 128;
        com.mypinpad.tsdk.isolation.setAdjustViewBounds.f58238j = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0178, code lost:
    
        if ((r3 % 2) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x017b, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x017c, code lost:
    
        r2 = (r11 & 91) + (r11 | 91);
        com.mypinpad.tsdk.isolation.setAdjustViewBounds.f58239k = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x018a, code lost:
    
        return java.lang.Boolean.valueOf(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean m(java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setAdjustViewBounds.m(java.lang.Object[]):java.lang.Boolean");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x005e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0042  */
    public static /* synthetic */ Boolean n(Object[] objArr) {
        boolean z10;
        boolean z11;
        setRotationX setrotationx = (setRotationX) objArr[0];
        int i10 = f58239k + 118;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f58238j = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 22 / 0;
            if (((byte[]) setRotationX.setX(new Object[]{setrotationx}, -918913871, 918913871, System.identityHashCode(setrotationx))).length == 0) {
                int i13 = f58239k;
                int i14 = ((i13 & 120) + (i13 | 120)) - 1;
                int i15 = i14 % 128;
                f58238j = i15;
                int i16 = i14 % 2;
                int i17 = ((i15 ^ 30) + ((i15 & 30) << 1)) - 1;
                f58239k = i17 % 128;
                int i18 = i17 % 2;
                z10 = true;
            } else {
                int i19 = f58239k;
                int i20 = i19 ^ 7;
                int i21 = (i19 & 7) << 1;
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                f58238j = i22 % 128;
                int i23 = i22 % 2;
                z10 = false;
            }
        } else if (((byte[]) setRotationX.setX(new Object[]{setrotationx}, -918913871, 918913871, System.identityHashCode(setrotationx))).length == 0) {
            int i110 = f58239k;
            int i111 = ((i110 & 120) + (i110 | 120)) - 1;
            int i112 = i111 % 128;
            f58238j = i112;
            int i113 = i111 % 2;
            int i114 = ((i112 ^ 30) + ((i112 & 30) << 1)) - 1;
            f58239k = i114 % 128;
            int i115 = i114 % 2;
            z10 = true;
        } else {
            int i116 = f58239k;
            int i24 = i116 ^ 7;
            int i25 = (i116 & 7) << 1;
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            f58238j = i26 % 128;
            int i27 = i26 % 2;
            z10 = false;
        }
        if (!z10) {
            int i28 = f58238j;
            int i29 = i28 & 47;
            int i30 = i29 + ((i28 ^ 47) | i29);
            int i31 = i30 % 128;
            f58239k = i31;
            int i32 = i30 % 2;
            int i33 = ~i31;
            int i34 = (i31 & (-108)) | (i33 & 107);
            int i35 = -(-((i31 & 107) << 1));
            int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
            f58238j = i36 % 128;
            int i37 = i36 % 2;
            int i38 = ((i31 & (-50)) | (i33 & 49)) + ((i31 & 49) << 1);
            f58238j = i38 % 128;
            int i39 = i38 % 2;
            String str = (String) getPinPadLandscape.setY(new Object[]{Byte.valueOf(((byte[]) setRotationX.setX(new Object[]{setrotationx}, -918913871, 918913871, System.identityHashCode(setrotationx)))[0])}, 1862949367, -1862949363, (int) System.currentTimeMillis());
            setAnimation setanimation = setAnimation.INSTANCE;
            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
            if (!(!Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))))) {
                int i40 = f58239k;
                int i41 = ((i40 ^ 1) | (i40 & 1)) << 1;
                int i42 = -(((~i40) & 1) | (i40 & (-2)));
                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                f58238j = i43 % 128;
                if (i43 % 2 == 0) {
                    setMaxWidth onDragListener = setrotationx.setOnDragListener();
                    TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
                    getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setMaxWidth.setX(new Object[]{onDragListener, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -480651882, 480651889, System.identityHashCode(onDragListener));
                    if (getbeeponfailure == null) {
                        int i44 = f58238j;
                        int i45 = (-2) - ((((i44 | 76) << 1) - (i44 ^ 76)) ^ (-1));
                        f58239k = i45 % 128;
                        int i46 = i45 % 2;
                        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                        TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
                        SouthPacificEndpoint.setX(new Object[]{10008, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 10008);
                        int i47 = f58239k;
                        int i48 = i47 & 59;
                        int i49 = (i48 - (~(-(-((i47 ^ 59) | i48))))) - 1;
                        f58238j = i49 % 128;
                        int i50 = i49 % 2;
                        return Boolean.FALSE;
                    }
                    getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, setAnimation.CardScheme()}, -990392770, 990392791, System.identityHashCode(getbeeponfailure));
                    if (getbeeponfailure2 == null) {
                        int i51 = f58239k;
                        int i52 = i51 & 25;
                        int i53 = ((i51 ^ 25) | i52) << 1;
                        int i54 = -((i51 | 25) & (~i52));
                        int i55 = (i53 & i54) + (i54 | i53);
                        f58238j = i55 % 128;
                        if (i55 % 2 != 0) {
                            SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                            TransactionFailed transactionFailedCardScheme = setAnimation.CardScheme();
                            SouthPacificEndpoint.setX(new Object[]{13729, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailedCardScheme}, 1914607362, -1914607356, System.identityHashCode(transactionFailedCardScheme))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 5}, 1336485880, -1336485874, 13729);
                            return Boolean.TRUE;
                        }
                        SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                        TransactionFailed transactionFailedCardScheme2 = setAnimation.CardScheme();
                        SouthPacificEndpoint.setX(new Object[]{10008, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailedCardScheme2}, 1914607362, -1914607356, System.identityHashCode(transactionFailedCardScheme2))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 10008);
                        return Boolean.FALSE;
                    }
                    if (!((Boolean) setCompoundDrawableTintBlendMode(new Object[]{getbeeponfailure2}, 2097075690, -2097075690, (int) System.currentTimeMillis())).booleanValue()) {
                        int i56 = f58239k;
                        int i57 = i56 & 5;
                        int i58 = (i56 ^ 5) | i57;
                        int i59 = (i57 & i58) + (i58 | i57);
                        f58238j = i59 % 128;
                        int i60 = i59 % 2;
                        SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
                        TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], -578632495, 578632574, (int) System.currentTimeMillis());
                        SouthPacificEndpoint.setX(new Object[]{10008, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 10008);
                        int i61 = f58238j + 33;
                        f58239k = i61 % 128;
                        if (i61 % 2 != 0) {
                            return Boolean.FALSE;
                        }
                        throw null;
                    }
                    List list = (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure2));
                    ArrayList arrayList = new ArrayList();
                    int i62 = f58238j;
                    int i63 = ((i62 & 120) + (i62 | 120)) - 1;
                    f58239k = i63 % 128;
                    int i64 = i63 % 2;
                    for (Object obj : list) {
                        int i65 = f58239k;
                        int i66 = ((i65 | 115) << 1) - (i65 ^ 115);
                        f58238j = i66 % 128;
                        int i67 = i66 % 2;
                        getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) obj;
                        setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, -865402437, System.identityHashCode(getbeeponfailure3));
                        String str2 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                        setAnimation setanimation2 = setAnimation.INSTANCE;
                        TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[0], -578632495, 578632574, (int) System.currentTimeMillis());
                        if (Intrinsics.areEqual(str2, (String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5)))) {
                            int i68 = f58239k;
                            int i69 = ((i68 ^ 25) | (i68 & 25)) << 1;
                            int i70 = -(((~i68) & 25) | (i68 & (-26)));
                            int i71 = (i69 & i70) + (i70 | i69);
                            f58238j = i71 % 128;
                            if (i71 % 2 != 0) {
                                arrayList.add(obj);
                                throw null;
                            }
                            arrayList.add(obj);
                            int i72 = f58238j;
                            int i73 = ((i72 ^ 100) + ((i72 & 100) << 1)) - 1;
                            f58239k = i73 % 128;
                            int i74 = i73 % 2;
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                    while (!(!it.hasNext())) {
                        int i75 = f58238j;
                        int i76 = (((i75 & (-74)) | ((~i75) & 73)) - (~((i75 & 73) << 1))) - 1;
                        f58239k = i76 % 128;
                        if (i76 % 2 == 0) {
                            getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) it.next();
                            arrayList2.add((getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4, setAnimation.setMinHeight()}, -990392770, 990392791, System.identityHashCode(getbeeponfailure4)));
                            throw null;
                        }
                        getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) it.next();
                        arrayList2.add((getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5, setAnimation.setMinHeight()}, -990392770, 990392791, System.identityHashCode(getbeeponfailure5)));
                    }
                    List listFilterNotNull = CollectionsKt___CollectionsKt.filterNotNull(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    int i77 = f58239k;
                    int i78 = i77 ^ 69;
                    int i79 = ((i77 & 69) | i78) << 1;
                    int i80 = -i78;
                    int i81 = (i79 & i80) + (i79 | i80);
                    f58238j = i81 % 128;
                    int i82 = i81 % 2;
                    for (Object obj2 : listFilterNotNull) {
                        int i83 = f58239k;
                        int i84 = i83 & 23;
                        int i85 = -(-((i83 ^ 23) | i84));
                        int i86 = ((i84 | i85) << 1) - (i85 ^ i84);
                        f58238j = i86 % 128;
                        int i87 = i86 % 2;
                        getBeepOnFailure getbeeponfailure6 = (getBeepOnFailure) obj2;
                        setBackgroundTintList.Companion companion = setBackgroundTintList.INSTANCE;
                        if (((Boolean) setBackgroundTintList.Companion.setX(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 252497730, -252497710, System.identityHashCode(getbeeponfailure6))}, -456981728, 456981729, (int) System.currentTimeMillis())).booleanValue()) {
                            int i88 = f58238j;
                            int i89 = ((i88 ^ 57) - (~((i88 & 57) << 1))) - 1;
                            f58239k = i89 % 128;
                            if (i89 % 2 == 0) {
                                arrayList3.add(obj2);
                                int i90 = 2 / 0;
                            } else {
                                arrayList3.add(obj2);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    int i91 = f58238j + 11;
                    f58239k = i91 % 128;
                    int i92 = i91 % 2;
                    while (!(!it2.hasNext())) {
                        int i93 = f58239k;
                        int i94 = i93 & 89;
                        int i95 = (i93 | 89) & (~i94);
                        int i96 = i94 << 1;
                        int i97 = (i95 ^ i96) + ((i95 & i96) << 1);
                        f58238j = i97 % 128;
                        if (i97 % 2 != 0) {
                            getBeepOnFailure getbeeponfailure7 = (getBeepOnFailure) it2.next();
                            arrayList4.add((String) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure7}, 252497730, -252497710, System.identityHashCode(getbeeponfailure7))}, 1609250238, -1609250236, (int) System.currentTimeMillis()));
                            int i98 = 85 / 0;
                        } else {
                            getBeepOnFailure getbeeponfailure8 = (getBeepOnFailure) it2.next();
                            arrayList4.add((String) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure8}, 252497730, -252497710, System.identityHashCode(getbeeponfailure8))}, 1609250238, -1609250236, (int) System.currentTimeMillis()));
                        }
                        int i99 = f58239k;
                        int i100 = (i99 | 61) << 1;
                        int i101 = -(((~i99) & 61) | (i99 & (-62)));
                        int i102 = (i100 & i101) + (i101 | i100);
                        f58238j = i102 % 128;
                        int i103 = i102 % 2;
                    }
                    List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"A0000000041010", "A0000000043060", "B012345678"});
                    if (arrayList4.isEmpty()) {
                        int i104 = f58239k;
                        int i105 = i104 & 15;
                        int i106 = (i104 | 15) & (~i105);
                        int i107 = i105 << 1;
                        int i108 = (i106 & i107) + (i106 | i107);
                        f58238j = i108 % 128;
                        int i109 = i108 % 2;
                        z11 = false;
                        break;
                    }
                    int i117 = f58239k;
                    int i118 = i117 & 109;
                    int i119 = (i118 - (~(-(-((i117 ^ 109) | i118))))) - 1;
                    f58238j = i119 % 128;
                    int i120 = i119 % 2;
                    Iterator it3 = arrayList4.iterator();
                    int i121 = f58238j;
                    int i122 = i121 ^ 107;
                    int i123 = ((i121 & 107) | i122) << 1;
                    int i124 = -i122;
                    int i125 = (i123 ^ i124) + ((i123 & i124) << 1);
                    f58239k = i125 % 128;
                    int i126 = i125 % 2;
                    while (true) {
                        if (!it3.hasNext()) {
                            int i1010 = f58239k;
                            int i1011 = i1010 & 15;
                            int i1012 = (i1010 | 15) & (~i1011);
                            int i1013 = i1011 << 1;
                            int i1014 = (i1012 & i1013) + (i1012 | i1013);
                            f58238j = i1014 % 128;
                            int i1015 = i1014 % 2;
                            z11 = false;
                            break;
                        }
                        int i127 = f58238j;
                        int i128 = i127 & 97;
                        int i129 = -(-(i127 | 97));
                        int i130 = (i128 ^ i129) + ((i129 & i128) << 1);
                        f58239k = i130 % 128;
                        if (i130 % 2 == 0) {
                            listListOf.contains((String) it3.next());
                            throw null;
                        }
                        if (listListOf.contains((String) it3.next())) {
                            int i131 = f58238j;
                            int i132 = i131 & 27;
                            int i133 = i131 | 27;
                            int i134 = ((i132 | i133) << 1) - (i133 ^ i132);
                            f58239k = i134 % 128;
                            int i135 = i134 % 2;
                            z11 = true;
                            break;
                        }
                    }
                    if (!(!z11)) {
                        int i136 = f58238j + 67;
                        f58239k = i136 % 128;
                        if (i136 % 2 == 0) {
                            setMaxWidth onDragListener2 = setrotationx.setOnDragListener();
                            setAnimation setanimation3 = setAnimation.INSTANCE;
                            TransactionFailed transactionFailed6 = (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis());
                            throw null;
                        }
                        setMaxWidth onDragListener3 = setrotationx.setOnDragListener();
                        setAnimation setanimation4 = setAnimation.INSTANCE;
                        TransactionFailed transactionFailed7 = (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis());
                        if (((getBeepOnFailure) setMaxWidth.setX(new Object[]{onDragListener3, (String) TransactionFailed.setX(new Object[]{transactionFailed7}, 1914607362, -1914607356, System.identityHashCode(transactionFailed7))}, -480651882, 480651889, System.identityHashCode(onDragListener3))) == null) {
                            SouthPacificEndpoint southPacificEndpoint5 = SouthPacificEndpoint.setX;
                            TransactionFailed transactionFailed8 = (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis());
                            SouthPacificEndpoint.setX(new Object[]{10008, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed8}, 1914607362, -1914607356, System.identityHashCode(transactionFailed8))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 10008);
                            return Boolean.FALSE;
                        }
                    }
                    int i137 = f58239k;
                    int i138 = i137 & 115;
                    int i139 = (i138 - (~(-(-((i137 ^ 115) | i138))))) - 1;
                    f58238j = i139 % 128;
                    if (i139 % 2 == 0) {
                        return Boolean.TRUE;
                    }
                    throw null;
                }
            }
        } else {
            int i140 = f58238j + 87;
            f58239k = i140 % 128;
            int i141 = i140 % 2;
        }
        int i142 = f58239k;
        int i143 = (i142 & (-80)) | ((~i142) & 79);
        int i144 = -(-((i142 & 79) << 1));
        int i145 = (i143 & i144) + (i144 | i143);
        f58238j = i145 % 128;
        if (i145 % 2 != 0) {
            SouthPacificEndpoint southPacificEndpoint6 = SouthPacificEndpoint.setX;
            setAnimation setanimation5 = setAnimation.INSTANCE;
            TransactionFailed transactionFailed9 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
            SouthPacificEndpoint.setX(new Object[]{10300, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed9}, 1914607362, -1914607356, System.identityHashCode(transactionFailed9))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 3}, 1336485880, -1336485874, 10300);
        } else {
            SouthPacificEndpoint southPacificEndpoint7 = SouthPacificEndpoint.setX;
            setAnimation setanimation6 = setAnimation.INSTANCE;
            TransactionFailed transactionFailed10 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
            SouthPacificEndpoint.setX(new Object[]{10008, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed10}, 1914607362, -1914607356, System.identityHashCode(transactionFailed10))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 10008);
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x009d  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:24:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0133  */
    /* JADX WARN: Code duplicated, block: B:30:0x0143  */
    /* JADX WARN: Code duplicated, block: B:31:0x0145  */
    /* JADX WARN: Code duplicated, block: B:34:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0159 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x015b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0182  */
    /* JADX WARN: Code duplicated, block: B:40:0x0184  */
    /* JADX WARN: Code duplicated, block: B:43:0x0194  */
    /* JADX WARN: Code duplicated, block: B:44:0x0196  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x027e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0109 -> B:25:0x010c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object o(java.lang.Object[] r24) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setAdjustViewBounds.o(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Object p(Object[] objArr) {
        setAdjustViewBounds setadjustviewbounds = (setAdjustViewBounds) objArr[0];
        values valuesVar = (values) objArr[1];
        Continuation continuation = (Continuation) objArr[2];
        int i10 = f58238j;
        int i11 = i10 & 117;
        int i12 = i11 + ((i10 ^ 117) | i11);
        f58239k = i12 % 128;
        if (i12 % 2 != 0) {
            return setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds, valuesVar, continuation}, 1442300379, -1442300355, (int) System.currentTimeMillis());
        }
        setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds, valuesVar, continuation}, 1442300379, -1442300355, (int) System.currentTimeMillis());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:33:0x01eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:35:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:50:0x0290  */
    /* JADX WARN: Code duplicated, block: B:9:0x00bb  */
    public static /* synthetic */ Object q(Object[] objArr) {
        q8 q8Var;
        Object obj;
        setPictureListener setpicturelistener;
        setScreenReaderFocusable setscreenreaderfocusable;
        int i10;
        int i11;
        setAdjustViewBounds setadjustviewbounds = (setAdjustViewBounds) objArr[0];
        me meVar = (me) objArr[1];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[2];
        values valuesVar = (values) objArr[4];
        Continuation continuation = (Continuation) objArr[5];
        int i12 = f58239k;
        int i13 = ((i12 ^ 85) - (~(-(-((i12 & 85) << 1))))) - 1;
        int i14 = i13 % 128;
        f58238j = i14;
        if (i13 % 2 != 0) {
            boolean z10 = continuation instanceof q8;
            throw null;
        }
        if (continuation instanceof q8) {
            q8 q8Var2 = (q8) continuation;
            int i15 = q8Var2.f57820s0;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                int i16 = (i14 ^ 115) + ((i14 & 115) << 1);
                f58239k = i16 % 128;
                int i17 = i16 % 2;
                int iIdentityHashCode = System.identityHashCode(setadjustviewbounds);
                int i18 = -(-(i15 * (-215)));
                int i19 = Integer.MIN_VALUE & i18;
                int i20 = (i18 ^ Integer.MIN_VALUE) | i19;
                int i21 = (i19 & i20) + (i19 | i20);
                int i22 = (Integer.MIN_VALUE ^ iIdentityHashCode) | (Integer.MIN_VALUE & iIdentityHashCode);
                int i23 = ~i22;
                int i24 = -(-((i23 & (i22 | i23)) * 216));
                int i25 = i21 & i24;
                int i26 = (i25 - (~(-(-((i21 ^ i24) | i25))))) - 1;
                int i27 = ~i15;
                int i28 = (Integer.MIN_VALUE ^ i27) | (i27 & Integer.MIN_VALUE);
                int i29 = ~iIdentityHashCode;
                int i30 = i28 & i29;
                int i31 = (~i30) & (i28 | i29);
                int i32 = (-2) - ((i26 - (~(-(-(((i31 & i30) | (i31 ^ i30)) * (-216)))))) ^ (-1));
                int i33 = i29 ^ Integer.MIN_VALUE;
                int i34 = i29 & Integer.MIN_VALUE;
                int i35 = (i33 & i34) | (i33 ^ i34);
                int i36 = ~i35;
                int i37 = (i35 | i36) & i36;
                q8Var2.f57820s0 = (((i37 & i15) | (i15 ^ i37)) * 216) + i32;
                int i38 = f58239k;
                int i39 = i38 | 17;
                int i40 = i39 << 1;
                int i41 = -((~(i38 & 17)) & i39);
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                f58238j = i42 % 128;
                int i43 = i42 % 2;
                q8Var = q8Var2;
            } else {
                q8 q8Var3 = new q8(setadjustviewbounds, continuation);
                int i44 = f58239k;
                int i45 = i44 & 115;
                int i46 = i45 + ((i44 ^ 115) | i45);
                f58238j = i46 % 128;
                int i47 = i46 % 2;
                q8Var = q8Var3;
            }
        } else {
            q8 q8Var4 = new q8(setadjustviewbounds, continuation);
            int i48 = f58239k;
            int i49 = i48 & 115;
            int i410 = i49 + ((i48 ^ 115) | i49);
            f58238j = i410 % 128;
            int i411 = i410 % 2;
            q8Var = q8Var4;
        }
        Object compoundDrawableTintBlendMode = q8Var.f57818q0;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i50 = q8Var.f57820s0;
        if (i50 != 0) {
            if (i50 != 1) {
                if (i50 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i51 = f58238j + 37;
                f58239k = i51 % 128;
                int i52 = i51 % 2;
                int i53 = f58238j;
                i11 = (((i53 & (-80)) | ((~i53) & 79)) - (~(-(-((i53 & 79) << 1))))) - 1;
                f58239k = i11 % 128;
                if (i11 % 2 == 0) {
                    int i54 = 50 / 0;
                }
                return compoundDrawableTintBlendMode;
            }
            setpicturelistener = q8Var.f57817p0;
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            int i55 = f58238j;
            int i56 = (i55 & (-90)) | ((~i55) & 89);
            int i57 = -(-((i55 & 89) << 1));
            int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
            f58239k = i58 % 128;
            int i59 = i58 % 2;
            obj = compoundDrawableTintBlendMode;
            setscreenreaderfocusable = (setScreenReaderFocusable) obj;
            if (setscreenreaderfocusable == null) {
                getDetailsFieldTextColor getdetailsfieldtextcolor = new getDetailsFieldTextColor(setscreenreaderfocusable, (md) setPictureListener.setY(new Object[]{setpicturelistener}, 1661100660, -1661100656, System.identityHashCode(setpicturelistener)), (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener)));
                int i60 = f58239k;
                int i61 = (((i60 & (-84)) | ((~i60) & 83)) - (~((i60 & 83) << 1))) - 1;
                f58238j = i61 % 128;
                int i62 = i61 % 2;
                return getdetailsfieldtextcolor;
            }
            int i63 = f58238j;
            int i64 = (i63 | 59) << 1;
            int i65 = -(i63 ^ 59);
            int i66 = (i64 ^ i65) + ((i64 & i65) << 1);
            f58239k = i66 % 128;
            int i67 = i66 % 2;
            int i68 = i63 & 45;
            int i69 = ((i63 ^ 45) | i68) << 1;
            int i70 = -((i63 | 45) & (~i68));
            i10 = ((i69 | i70) << 1) - (i70 ^ i69);
            f58239k = i10 % 128;
            if (i10 % 2 != 0) {
                return null;
            }
            throw null;
        }
        ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
        if (getbeeponfailure == null) {
            q8Var.f57820s0 = 2;
            compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds, meVar, getbeeponfailure, null, valuesVar, q8Var}, 1249112654, -1249112640, System.identityHashCode(setadjustviewbounds));
            if (compoundDrawableTintBlendMode == coroutine_suspended) {
                int i71 = f58239k;
                int i72 = i71 ^ 47;
                int i73 = ((((i71 & 47) | i72) << 1) - (~(-i72))) - 1;
                f58238j = i73 % 128;
                if (i73 % 2 == 0) {
                    return coroutine_suspended;
                }
                throw null;
            }
            int i510 = f58238j;
            i11 = (((i510 & (-80)) | ((~i510) & 79)) - (~(-(-((i510 & 79) << 1))))) - 1;
            f58239k = i11 % 128;
            if (i11 % 2 == 0) {
                int i511 = 50 / 0;
            }
            return compoundDrawableTintBlendMode;
        }
        int i74 = f58239k;
        int i75 = (i74 & (-40)) | ((~i74) & 39);
        int i76 = -(-((i74 & 39) << 1));
        int i77 = (i75 & i76) + (i76 | i75);
        f58238j = i77 % 128;
        if (i77 % 2 != 0) {
            setPictureListener setpicturelistener2 = setadjustviewbounds.f58245f;
            throw null;
        }
        setPictureListener setpicturelistener3 = setadjustviewbounds.f58245f;
        if (setpicturelistener3 == null) {
            throw new setIndeterminateDrawable(3019, null, null, 6, null);
        }
        setHeight setheight = setHeight.INSTANCE;
        setTitleMarginTop settitlemargintop = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener3}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener3));
        setNextFocusForwardId setnextfocusforwardid = (setNextFocusForwardId) setHeight.setOnFocusChangeListener(new Object[]{(Terminal) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop}, 2113948533, -2113948530, System.identityHashCode(settitlemargintop)), setadjustviewbounds.f58240a, setadjustviewbounds.f58241b, setadjustviewbounds.f58242c}, -623003752, 623003752, (int) System.currentTimeMillis());
        q8Var.f57817p0 = setpicturelistener3;
        q8Var.f57820s0 = 1;
        Object y7 = setnextfocusforwardid.setY(setpicturelistener3, getbeeponfailure, null, valuesVar, q8Var);
        if (y7 == coroutine_suspended) {
            int i78 = f58238j;
            int i79 = (((i78 ^ 75) | (i78 & 75)) << 1) - (((~i78) & 75) | (i78 & (-76)));
            int i80 = i79 % 128;
            f58239k = i80;
            int i81 = i79 % 2;
            int i82 = i80 & 31;
            int i83 = ((i80 ^ 31) | i82) << 1;
            int i84 = -((i80 | 31) & (~i82));
            int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
            f58238j = i85 % 128;
            int i86 = i85 % 2;
            return coroutine_suspended;
        }
        obj = y7;
        setpicturelistener = setpicturelistener3;
        setscreenreaderfocusable = (setScreenReaderFocusable) obj;
        if (setscreenreaderfocusable == null) {
            getDetailsFieldTextColor getdetailsfieldtextcolor2 = new getDetailsFieldTextColor(setscreenreaderfocusable, (md) setPictureListener.setY(new Object[]{setpicturelistener}, 1661100660, -1661100656, System.identityHashCode(setpicturelistener)), (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener)));
            int i610 = f58239k;
            int i611 = (((i610 & (-84)) | ((~i610) & 83)) - (~((i610 & 83) << 1))) - 1;
            f58238j = i611 % 128;
            int i612 = i611 % 2;
            return getdetailsfieldtextcolor2;
        }
        int i613 = f58238j;
        int i614 = (i613 | 59) << 1;
        int i615 = -(i613 ^ 59);
        int i616 = (i614 ^ i615) + ((i614 & i615) << 1);
        f58239k = i616 % 128;
        int i617 = i616 % 2;
        int i618 = i613 & 45;
        int i619 = ((i613 ^ 45) | i618) << 1;
        int i710 = -((i613 | 45) & (~i618));
        i10 = ((i619 | i710) << 1) - (i710 ^ i619);
        f58239k = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void r(Object[] objArr) {
        setDrawSelectorOnTop setdrawselectorontop;
        setAdjustViewBounds setadjustviewbounds = (setAdjustViewBounds) objArr[0];
        int i10 = f58239k;
        int i11 = ((i10 ^ 110) + ((i10 & 110) << 1)) - 1;
        f58238j = i11 % 128;
        int i12 = i11 % 2;
        setContentCaptureSession setcontentcapturesession = setContentCaptureSession.UiMessageCallbackKtWhenMappings;
        if (setadjustviewbounds.f58246g) {
            int i13 = f58239k + 61;
            f58238j = i13 % 128;
            if (i13 % 2 != 0) {
                setDrawSelectorOnTop.Companion companion = setDrawSelectorOnTop.INSTANCE;
                throw null;
            }
            setdrawselectorontop = setDrawSelectorOnTop.setOnLongClickListener;
            int i14 = f58238j;
            int i15 = i14 & 103;
            int i16 = i15 + ((i14 ^ 103) | i15);
            f58239k = i16 % 128;
            int i17 = i16 % 2;
        } else {
            ez.setY sety = ez.setDividerPadding;
            setdrawselectorontop = (setDrawSelectorOnTop) ez.setY.setX(new Object[0], 254417, -254416, (int) System.currentTimeMillis());
            int i18 = (-2) - ((f58239k + 18) ^ (-1));
            f58238j = i18 % 128;
            int i19 = i18 % 2;
        }
        setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds, setcontentcapturesession, setdrawselectorontop, null, 4}, -1418313559, 1418313562, 4);
        int i20 = f58238j + 37;
        f58239k = i20 % 128;
        int i21 = i20 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:? A[LOOP:0: B:19:0x00c7->B:138:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:23:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e1  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object compoundDrawableTintBlendMode;
        setTitleMarginTop settitlemargintop;
        setContentCaptureSession setcontentcapturesession;
        String str;
        TransactionFailed transactionFailed;
        int i13;
        int i14 = (i11 * 825) + (i10 * 1649);
        int i15 = ~i11;
        switch ((((~i10) | i15) * 824) + ((i11 | i10) * (-1648)) + ((i10 | i15) * (-824)) + i14) {
            case 1:
                return m(objArr);
            case 2:
                return q(objArr);
            case 3:
                f(objArr);
                return null;
            case 4:
                return p(objArr);
            case 5:
                setAdjustViewBounds setadjustviewbounds = (setAdjustViewBounds) objArr[0];
                setContentCaptureSession setcontentcapturesession2 = (setContentCaptureSession) objArr[1];
                setDrawSelectorOnTop setdrawselectorontop = (setDrawSelectorOnTop) objArr[2];
                byte[] bArr = (byte[]) objArr[3];
                eu euVar = setadjustviewbounds.f58242c;
                setHighlightColor sethighlightcolor = new setHighlightColor();
                fd fdVar = fd.END_APPLICATION;
                activateSession activatesession = activateSession.ERROR_OTHER_CARD;
                int i16 = f58238j + 23;
                f58239k = i16 % 128;
                int i17 = i16 % 2;
                return null;
            case 6:
                return n(objArr);
            case 7:
                return c(objArr);
            case 8:
                return k(objArr);
            case 9:
                Object onFocusChangeListener = ((setAdjustViewBounds) objArr[0]).f58240a.setOnFocusChangeListener(new writeReplace(f58236h), (Continuation) objArr[1]);
                int i18 = f58239k;
                int i19 = i18 & 49;
                int i20 = ((i18 ^ 49) | i19) << 1;
                int i21 = -((i18 | 49) & (~i19));
                int i22 = (i20 & i21) + (i21 | i20);
                f58238j = i22 % 128;
                int i23 = i22 % 2;
                return onFocusChangeListener;
            case 10:
                setAdjustViewBounds setadjustviewbounds2 = (setAdjustViewBounds) objArr[0];
                Continuation continuation = (Continuation) objArr[1];
                int i24 = f58239k;
                int i25 = (i24 ^ 43) + ((i24 & 43) << 1);
                f58238j = i25 % 128;
                int i26 = i25 % 2;
                Object compoundDrawableTintBlendMode2 = setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds2, null, null, null, null, continuation}, 1516463928, -1516463913, System.identityHashCode(setadjustviewbounds2));
                int i27 = f58238j + 19;
                f58239k = i27 % 128;
                if (i27 % 2 != 0) {
                    return compoundDrawableTintBlendMode2;
                }
                int i28 = 83 / 0;
                return compoundDrawableTintBlendMode2;
            case 11:
                return i(objArr);
            case 12:
                return o(objArr);
            case 13:
                return e(objArr);
            case 14:
                return h(objArr);
            case 15:
                return a(objArr);
            case 16:
                r(objArr);
                return null;
            case 17:
                return l(objArr);
            case 18:
                return b(objArr);
            case 19:
                setAdjustViewBounds setadjustviewbounds3 = (setAdjustViewBounds) objArr[0];
                int i29 = f58238j;
                int i30 = i29 | 35;
                int i31 = (i30 << 1) - ((~(i29 & 35)) & i30);
                int i32 = i31 % 128;
                f58239k = i32;
                int i33 = i31 % 2;
                List<setPictureListener> list = setadjustviewbounds3.f58244e;
                if (list != null) {
                    int i34 = i32 & 27;
                    int i35 = -(-(i32 | 27));
                    int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                    f58238j = i36 % 128;
                    if (i36 % 2 != 0) {
                        list.clear();
                        throw null;
                    }
                    list.clear();
                }
                int i37 = f58239k;
                int i38 = i37 & 25;
                int i39 = ((i37 ^ 25) | i38) << 1;
                int i40 = -((i37 | 25) & (~i38));
                int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                f58238j = i41 % 128;
                if (i41 % 2 == 0) {
                    return null;
                }
                int i42 = 46 / 0;
                return null;
            case 20:
                setAdjustViewBounds setadjustviewbounds4 = (setAdjustViewBounds) objArr[0];
                System.identityHashCode(setadjustviewbounds4);
                System.identityHashCode(setadjustviewbounds4);
                setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds4, setContentCaptureSession.setNavigationOnClickListener, null, null, 6}, -1418313559, 1418313562, 6);
                int i43 = f58239k;
                int i44 = ((i43 | 9) << 1) - (i43 ^ 9);
                f58238j = i44 % 128;
                if (i44 % 2 == 0) {
                    return null;
                }
                throw null;
            case 21:
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
                int i45 = f58238j;
                int i46 = ((i45 | 17) << 1) - (i45 ^ 17);
                f58239k = i46 % 128;
                int i47 = i46 % 2;
                if (getbeeponfailure == null) {
                    int i48 = i45 + 38;
                    int i49 = (i48 ^ (-1)) + (i48 << 1);
                    f58239k = i49 % 128;
                    if (i49 % 2 == 0) {
                        int i50 = 71 / 0;
                    }
                    int i51 = i45 & 105;
                    int i52 = (i51 - (~((i45 ^ 105) | i51))) - 1;
                    f58239k = i52 % 128;
                    if (i52 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                setAnimation setanimation = setAnimation.INSTANCE;
                compoundDrawableTintBlendMode = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, (TransactionFailed) setAnimation.setY(new Object[0], 277670663, -277670583, (int) System.currentTimeMillis())}, -990392770, 990392791, System.identityHashCode(getbeeponfailure));
                int i53 = f58238j + 9;
                f58239k = i53 % 128;
                if (i53 % 2 == 0) {
                    throw null;
                }
                break;
            case 22:
                setAdjustViewBounds setadjustviewbounds5 = (setAdjustViewBounds) objArr[0];
                setRotationX setrotationx = (setRotationX) objArr[1];
                me meVar = (me) objArr[2];
                ArrayList arrayList = new ArrayList();
                setLayerPaint setlayerpaint = new setLayerPaint(setrotationx.setNavigationOnClickListener());
                setMaxWidth setmaxwidth = (setMaxWidth) setLayerPaint.setOnFocusChangeListener(new Object[]{setlayerpaint, f58237i}, -656320915, 656320915, System.identityHashCode(setlayerpaint));
                if (setmaxwidth.size() == 0) {
                    throw new TerminalCreationFailureCause(null, 1, null);
                }
                Iterator<getBeepOnFailure> it = setmaxwidth.iterator();
                int i54 = f58238j;
                int i55 = (i54 & (-50)) | ((~i54) & 49);
                int i56 = -(-((i54 & 49) << 1));
                int i57 = (i55 & i56) + (i56 | i55);
                f58239k = i57 % 128;
                while (true) {
                    int i58 = i57 % 2;
                    if (!it.hasNext()) {
                        int i59 = f58239k + 115;
                        f58238j = i59 % 128;
                        int i60 = i59 % 2;
                        return arrayList;
                    }
                    int i61 = f58238j;
                    int i62 = i61 & 23;
                    int i63 = (i61 ^ 23) | i62;
                    int i64 = (i62 & i63) + (i63 | i62);
                    f58239k = i64 % 128;
                    int i65 = i64 % 2;
                    setPictureListener setpicturelistener = (setPictureListener) setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds5, it.next(), meVar}, -461688415, 461688441, System.identityHashCode(setadjustviewbounds5));
                    SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                    if (setpicturelistener == null) {
                        int i66 = f58239k + 123;
                        int i67 = i66 % 128;
                        f58238j = i67;
                        int i68 = i66 % 2;
                        int i69 = (i67 & 14) + (i67 | 14);
                        int i70 = (i69 ^ (-1)) + (i69 << 1);
                        f58239k = i70 % 128;
                        int i71 = i70 % 2;
                        settitlemargintop = null;
                    } else {
                        settitlemargintop = (setTitleMarginTop) setPictureListener.setY(new Object[]{setpicturelistener}, 1835080131, -1835080129, System.identityHashCode(setpicturelistener));
                        int i72 = f58239k;
                        int i73 = (i72 & 75) + (i72 | 75);
                        f58238j = i73 % 128;
                        int i74 = i73 % 2;
                    }
                    SouthPacificEndpoint.setX(new Object[]{10010, settitlemargintop, 4}, 1336485880, -1336485874, 10010);
                    if (setpicturelistener != null) {
                        int i75 = f58238j;
                        int i76 = i75 & 91;
                        int i77 = ((i75 | 91) & (~i76)) + (i76 << 1);
                        f58239k = i77 % 128;
                        int i78 = i77 % 2;
                        arrayList.add(setpicturelistener);
                        int i79 = f58238j;
                        int i80 = i79 & 27;
                        int i81 = ((((i79 ^ 27) | i80) << 1) - (~(-((i79 | 27) & (~i80))))) - 1;
                        f58239k = i81 % 128;
                        int i82 = i81 % 2;
                    }
                    int i83 = f58239k;
                    int i84 = i83 & 11;
                    int i85 = -(-(i83 | 11));
                    i57 = (i84 & i85) + (i85 | i84);
                    f58238j = i57 % 128;
                }
                break;
            case 23:
                setAdjustViewBounds setadjustviewbounds6 = (setAdjustViewBounds) objArr[0];
                Continuation continuation2 = (Continuation) objArr[1];
                int i86 = f58238j;
                int i87 = i86 & 121;
                int i88 = (i86 | 121) & (~i87);
                int i89 = -(-(i87 << 1));
                int i90 = ((i88 | i89) << 1) - (i88 ^ i89);
                f58239k = i90 % 128;
                int i91 = i90 % 2;
                Object compoundDrawableTintBlendMode3 = setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds6, null, null, null, null, continuation2}, 1249112654, -1249112640, System.identityHashCode(setadjustviewbounds6));
                int i92 = f58238j;
                int i93 = i92 & 81;
                int i94 = -(-((i92 ^ 81) | i93));
                int i95 = (i93 ^ i94) + ((i94 & i93) << 1);
                f58239k = i95 % 128;
                int i96 = i95 % 2;
                return compoundDrawableTintBlendMode3;
            case 24:
                setAdjustViewBounds setadjustviewbounds7 = (setAdjustViewBounds) objArr[0];
                values valuesVar = (values) objArr[1];
                Continuation continuation3 = (Continuation) objArr[2];
                int i97 = f58238j;
                int i98 = (((i97 & (-48)) | ((~i97) & 47)) - (~((i97 & 47) << 1))) - 1;
                f58239k = i98 % 128;
                int i99 = i98 % 2;
                Object compoundDrawableTintBlendMode4 = setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds7, null, null, valuesVar, continuation3}, -972750399, 972750411, System.identityHashCode(setadjustviewbounds7));
                int i100 = f58238j;
                int i101 = ((i100 | 77) << 1) - (i100 ^ 77);
                f58239k = i101 % 128;
                int i102 = i101 % 2;
                return compoundDrawableTintBlendMode4;
            case 25:
                return j(objArr);
            case 26:
                return d(objArr);
            case 27:
                setAdjustViewBounds setadjustviewbounds8 = (setAdjustViewBounds) objArr[0];
                Continuation continuation4 = (Continuation) objArr[1];
                int i103 = f58239k;
                int i104 = i103 & 55;
                int i105 = -(-((i103 ^ 55) | i104));
                int i106 = ((i104 | i105) << 1) - (i105 ^ i104);
                f58238j = i106 % 128;
                if (i106 % 2 != 0) {
                    setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds8, null, null, null, continuation4}, -972750399, 972750411, System.identityHashCode(setadjustviewbounds8));
                    throw null;
                }
                Object compoundDrawableTintBlendMode5 = setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds8, null, null, null, continuation4}, -972750399, 972750411, System.identityHashCode(setadjustviewbounds8));
                int i107 = f58238j;
                int i108 = ((i107 | 92) << 1) - (i107 ^ 92);
                int i109 = (i108 ^ (-1)) + (i108 << 1);
                f58239k = i109 % 128;
                if (i109 % 2 != 0) {
                    return compoundDrawableTintBlendMode5;
                }
                int i110 = 98 / 0;
                return compoundDrawableTintBlendMode5;
            case 28:
                setAdjustViewBounds setadjustviewbounds9 = (setAdjustViewBounds) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int i111 = f58238j;
                int i112 = i111 + 69;
                f58239k = i112 % 128;
                int i113 = i112 % 2;
                if (bArr2 != null) {
                    int i114 = (i111 ^ 29) + ((i111 & 29) << 1);
                    f58239k = i114 % 128;
                    int i115 = i114 % 2;
                    setcontentcapturesession = setContentCaptureSession.setLayoutAnimation;
                    int i116 = f58239k;
                    int i117 = (i116 & 123) + (i116 | 123);
                    f58238j = i117 % 128;
                    int i118 = i117 % 2;
                } else {
                    setcontentcapturesession = setContentCaptureSession.setOnLongClickListener;
                    int i119 = f58238j + 55;
                    f58239k = i119 % 128;
                    int i120 = i119 % 2;
                }
                setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds9, setcontentcapturesession, null, bArr2, 2}, -1418313559, 1418313562, 2);
                int i121 = f58239k;
                int i122 = i121 & 11;
                int i123 = ((((i121 ^ 11) | i122) << 1) - (~(-((i121 | 11) & (~i122))))) - 1;
                f58238j = i123 % 128;
                if (i123 % 2 == 0) {
                    return null;
                }
                throw null;
            case 29:
                return g(objArr);
            case 30:
                setAdjustViewBounds setadjustviewbounds10 = (setAdjustViewBounds) objArr[0];
                setMaxLines setmaxlines = (setMaxLines) objArr[1];
                me meVar2 = (me) objArr[2];
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[3];
                values valuesVar2 = (values) objArr[5];
                Continuation continuation5 = (Continuation) objArr[6];
                int i124 = f58239k;
                int i125 = i124 & 21;
                int i126 = (~i125) & (i124 | 21);
                int i127 = i125 << 1;
                int i128 = ((i126 | i127) << 1) - (i127 ^ i126);
                f58238j = i128 % 128;
                int i129 = i128 % 2;
                int i130 = setY.setY[setmaxlines.ordinal()];
                if (i130 == 1) {
                    compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds10, meVar2, getbeeponfailure2, null, valuesVar2, continuation5}, 1249112654, -1249112640, System.identityHashCode(setadjustviewbounds10));
                    int i131 = f58239k;
                    int i132 = i131 & 19;
                    int i133 = i132 + ((i131 ^ 19) | i132);
                    f58238j = i133 % 128;
                    if (i133 % 2 != 0) {
                        throw null;
                    }
                } else if (i130 != 2) {
                    if (i130 != 3) {
                        throw new setIndeterminateDrawable(3018, null, null, 6, null);
                    }
                    compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds10, valuesVar2, continuation5}, 1725672486, -1725672482, System.identityHashCode(setadjustviewbounds10));
                    int i134 = f58238j;
                    int i135 = i134 & 121;
                    int i136 = -(-((i134 ^ 121) | i135));
                    int i137 = (i135 & i136) + (i136 | i135);
                    f58239k = i137 % 128;
                    int i138 = i137 % 2;
                } else {
                    compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds10, meVar2, getbeeponfailure2, valuesVar2, continuation5}, -1686316718, 1686316749, (int) System.currentTimeMillis());
                    int i139 = f58239k;
                    int i140 = i139 & 101;
                    int i141 = (i140 - (~(-(-((i139 ^ 101) | i140))))) - 1;
                    f58238j = i141 % 128;
                    int i142 = i141 % 2;
                }
                break;
            case 31:
                setAdjustViewBounds setadjustviewbounds11 = (setAdjustViewBounds) objArr[0];
                me meVar3 = (me) objArr[1];
                getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) objArr[2];
                values valuesVar3 = (values) objArr[3];
                Continuation continuation6 = (Continuation) objArr[4];
                int i143 = f58239k;
                int i144 = ((i143 ^ 55) | (i143 & 55)) << 1;
                int i145 = -((i143 & (-56)) | (55 & (~i143)));
                int i146 = ((i144 | i145) << 1) - (i145 ^ i144);
                f58238j = i146 % 128;
                Object[] objArr2 = new Object[6];
                if (i146 % 2 == 0) {
                    objArr2[0] = setadjustviewbounds11;
                    objArr2[1] = meVar3;
                    objArr2[2] = getbeeponfailure3;
                    objArr2[3] = null;
                    objArr2[4] = valuesVar3;
                    objArr2[5] = continuation6;
                    return setCompoundDrawableTintBlendMode(objArr2, -303261944, 303261946, System.identityHashCode(setadjustviewbounds11));
                }
                objArr2[0] = setadjustviewbounds11;
                objArr2[1] = meVar3;
                objArr2[2] = getbeeponfailure3;
                objArr2[3] = null;
                objArr2[4] = valuesVar3;
                objArr2[5] = continuation6;
                setCompoundDrawableTintBlendMode(objArr2, -303261944, 303261946, System.identityHashCode(setadjustviewbounds11));
                throw null;
            default:
                getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) objArr[0];
                int i147 = f58238j;
                int i148 = (i147 & 37) + (i147 | 37);
                f58239k = i148 % 128;
                int i149 = i148 % 2;
                if (((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure4))).isEmpty()) {
                    int i150 = f58238j;
                    int i151 = ((i150 & 82) + (i150 | 82)) - 1;
                    f58239k = i151 % 128;
                    int i152 = i151 % 2;
                    int i153 = (-2) - (((i150 & 36) + (i150 | 36)) ^ (-1));
                    f58239k = i153 % 128;
                    int i154 = i153 % 2;
                } else {
                    List<getBeepOnFailure> list2 = (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure4));
                    if (!(!(list2 instanceof Collection))) {
                        int i155 = f58239k;
                        int i156 = (i155 & (-110)) | ((~i155) & 109);
                        int i157 = (i155 & 109) << 1;
                        int i158 = (i156 ^ i157) + ((i157 & i156) << 1);
                        f58238j = i158 % 128;
                        if (i158 % 2 != 0) {
                            list2.isEmpty();
                            throw null;
                        }
                        if (!list2.isEmpty()) {
                            int i159 = f58239k;
                            int i160 = i159 & 103;
                            int i161 = -(-(i159 | 103));
                            int i162 = ((i160 | i161) << 1) - (i161 ^ i160);
                            f58238j = i162 % 128;
                            int i163 = i162 % 2;
                            for (getBeepOnFailure getbeeponfailure5 : list2) {
                                int i164 = f58239k;
                                int i165 = ((i164 ^ 43) | (i164 & 43)) << 1;
                                int i166 = -(((~i164) & 43) | (i164 & (-44)));
                                int i167 = ((i165 | i166) << 1) - (i166 ^ i165);
                                f58238j = i167 % 128;
                                int i168 = i167 % 2;
                                setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5}, 865402441, -865402437, System.identityHashCode(getbeeponfailure5));
                                str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                                setAnimation setanimation2 = setAnimation.INSTANCE;
                                transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -578632495, 578632574, (int) System.currentTimeMillis());
                                if (!Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                                    int i169 = f58239k;
                                    int i170 = i169 & 47;
                                    int i171 = -(-(i169 | 47));
                                    int i172 = ((i170 | i171) << 1) - (i171 ^ i170);
                                    int i173 = i172 % 128;
                                    f58238j = i173;
                                    int i174 = i172 % 2;
                                    int i175 = i173 + 77;
                                    f58239k = i175 % 128;
                                    int i176 = i175 % 2;
                                    compoundDrawableTintBlendMode = Boolean.TRUE;
                                    break;
                                }
                            }
                        }
                        int i177 = f58239k;
                        int i178 = i177 & 11;
                        i13 = (i178 - (~((i177 ^ 11) | i178))) - 1;
                        f58238j = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i179 = 33 / 0;
                        }
                    } else {
                        int i1510 = f58239k;
                        int i1610 = i1510 & 103;
                        int i1611 = -(-(i1510 | 103));
                        int i1612 = ((i1610 | i1611) << 1) - (i1611 ^ i1610);
                        f58238j = i1612 % 128;
                        int i1613 = i1612 % 2;
                        while (r0.hasNext()) {
                            int i1614 = f58239k;
                            int i1615 = ((i1614 ^ 43) | (i1614 & 43)) << 1;
                            int i1616 = -(((~i1614) & 43) | (i1614 & (-44)));
                            int i1617 = ((i1615 | i1616) << 1) - (i1616 ^ i1615);
                            f58238j = i1617 % 128;
                            int i1618 = i1617 % 2;
                            setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5}, 865402441, -865402437, System.identityHashCode(getbeeponfailure5));
                            str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2));
                            setAnimation setanimation3 = setAnimation.INSTANCE;
                            transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -578632495, 578632574, (int) System.currentTimeMillis());
                            if (!Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                                int i1619 = f58239k;
                                int i1710 = i1619 & 47;
                                int i1711 = -(-(i1619 | 47));
                                int i1712 = ((i1710 | i1711) << 1) - (i1711 ^ i1710);
                                int i1713 = i1712 % 128;
                                f58238j = i1713;
                                int i1714 = i1712 % 2;
                                int i1715 = i1713 + 77;
                                f58239k = i1715 % 128;
                                int i1716 = i1715 % 2;
                                compoundDrawableTintBlendMode = Boolean.TRUE;
                                break;
                            }
                        }
                        int i1717 = f58239k;
                        int i1718 = i1717 & 11;
                        i13 = (i1718 - (~((i1717 ^ 11) | i1718))) - 1;
                        f58238j = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i1719 = 33 / 0;
                        }
                    }
                }
                compoundDrawableTintBlendMode = Boolean.FALSE;
                break;
        }
        return compoundDrawableTintBlendMode;
    }

    public final void setDividerPadding() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, 730478759, -730478740, System.identityHashCode(this));
    }
}
