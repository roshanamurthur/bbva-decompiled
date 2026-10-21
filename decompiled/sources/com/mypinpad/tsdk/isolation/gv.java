package com.mypinpad.tsdk.isolation;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0016J\u0006\u0010=\u001a\u00020-J\u0010\u0010>\u001a\u00020?2\u0006\u0010<\u001a\u00020\u0016H\u0002J\b\u0010@\u001a\u00020;H\u0016J\u0018\u0010A\u001a\u00020;2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0014J\u0018\u0010F\u001a\u00020;2\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010'J\u0018\u0010F\u001a\u00020;2\u0006\u0010J\u001a\u00020H2\b\u0010K\u001a\u0004\u0018\u000103J\u0006\u0010L\u001a\u00020;J\u0006\u0010M\u001a\u00020;J\u001a\u0010N\u001a\u00020?2\u0006\u0010O\u001a\u00020'2\b\u0010P\u001a\u0004\u0018\u00010QH\u0014J\u000e\u0010R\u001a\u00020;2\u0006\u0010S\u001a\u00020TJ\u000e\u0010U\u001a\u00020;2\u0006\u0010V\u001a\u00020WJ\u000e\u0010X\u001a\u00020;2\u0006\u0010Y\u001a\u00020ZJ\u000e\u0010[\u001a\u00020;2\u0006\u0010\\\u001a\u00020?J\"\u0010]\u001a\u00020;2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020a2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010ZJ'\u0010c\u001a\u00020;2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010<\u001a\u0004\u0018\u00010\u00162\u0006\u0010d\u001a\u000203¢\u0006\u0002\u0010eJ\u0010\u0010f\u001a\u00020?2\u0006\u0010O\u001a\u00020'H\u0002R\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR%\u0010\u001f\u001a\u00020 X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0011\u00108\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b9\u00105\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006g"}, d2 = {"Lcom/mypinpad/softpos/emv/terminal/kernel/kernel2/cache/Kernel2Database;", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/database/KernelDatabase;", EventDataKeys.Analytics.ANALYTICS_ID, "Lcom/mypinpad/softpos/emv/terminal/common/kernel/model/ApplicationId;", "publicKeyCertificateManager", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/security/cacertificate/PublicKeyCertificateManager;", "secureRandomGenerator", "Lcom/mypinpad/softpos/emv/integration/security/SecureRandomGenerator;", "(Lcom/mypinpad/softpos/emv/terminal/common/kernel/model/ApplicationId;Lcom/mypinpad/softpos/emv/terminal/kernel/common/security/cacertificate/PublicKeyCertificateManager;Lcom/mypinpad/softpos/emv/integration/security/SecureRandomGenerator;)V", "acType", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/AcTypeEnum;", "getAcType", "()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/AcTypeEnum;", "setAcType", "(Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/AcTypeEnum;)V", "activeTag", "", "getActiveTag", "()Ljava/lang/String;", "setActiveTag", "(Ljava/lang/String;)V", "databaseID", "", "getDatabaseID", "()I", "dekDetSessionIDs", "", "kernelId", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelId;", "getKernelId", "()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelId;", "odaStatus", "Lkotlin/UByte;", "getOdaStatus-w2LRezQ", "()B", "setOdaStatus-7apg3OU", "(B)V", "B", "onlineRequest", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;", "getOnlineRequest", "()Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;", "setOnlineRequest", "(Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;)V", "readerContactlessTransactionLimit", "", "getReaderContactlessTransactionLimit", "()J", "setReaderContactlessTransactionLimit", "(J)V", "tagsToReadYet", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvList;", "getTagsToReadYet", "()Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvList;", "tagsToWriteAfterGenAcYet", "getTagsToWriteAfterGenAcYet", "tagsToWriteBeforeGenAcYet", "getTagsToWriteBeforeGenAcYet", "addDekDetSessionID", "", "sessionID", "getTimeoutValue", "isValidDekDetSessionID", "", "junkifySensitiveData", "loadKernelDefaultConfigurationDataObjects", "transactionType", "Lcom/mypinpad/softpos/emv/terminal/transaction/model/TransactionType;", "configProvider", "Lcom/mypinpad/softpos/emv/terminal/config/TerminalConfigurationProvider;", "packRelatedDataTag", "tagToPack", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/meta/EmvTagMeta;", "tagListForPack", "destinationTag", "sourceTags", "prepareNotEmptyDataToSend", "preparePresentAndKnownDataToSend", "saveTlv", "tlv", "parentTemplate", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/meta/DataTemplate;", "updateCvmOutcomeParameter", "cvmEnum", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelCvm;", "updateFieldOffRequest", "fieldOffRequest", "", "updateLanguagePreference", "languagePref", "", "updateReceiptValue", net.ipsoft.amelia.sdk.internal.c.c.f84805j, "updateUserInterfaceRequestData", "kernelMessage", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelMessageIdentifierEnum;", "kernelStatus", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelStatusEnum;", "holdTime", "updateWithDetData", "detData", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvList;)V", "validateAfl", "kernel-mastercard"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class gv extends setScrollBarDefaultDelayBeforeFade {
    public static int I = 0;
    public static int J = 1;

    @NotNull
    public final setMaxWidth A;

    @Nullable
    public String B;
    public setFitsSystemWindows C;
    public byte D;

    @NotNull
    public final setMaxWidth E;

    @NotNull
    public final setMaxWidth F;
    public long G;

    @Nullable
    public getBeepOnFailure H;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f56091x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Terminal f56092y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final ArrayList f56093z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/z;", "", "setX", "(Lcom/mypinpad/tsdk/i/z;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<z, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56094q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56095r0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ setTransitionVisibility f56096p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(setTransitionVisibility settransitionvisibility) {
            super(1);
            this.f56096p0 = settransitionvisibility;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11) {
            int i12 = ~i10;
            int i13 = (i12 * 677) + (i11 * (-676)) + (i10 * 678);
            int i14 = ~i11;
            if (((~(i10 | i14)) * 677) + ((i12 | i14) * (-677)) + i13 != 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i15 = f56094q0;
                int i16 = i15 & 23;
                int i17 = ((i15 | 23) & (~i16)) + (i16 << 1);
                f56095r0 = i17 % 128;
                z zVar = (z) obj;
                if (i17 % 2 != 0) {
                    System.identityHashCode(aVar);
                    a(new Object[]{aVar, zVar}, 1403800035, -1403800034);
                    return Unit.INSTANCE;
                }
                System.identityHashCode(aVar);
                a(new Object[]{aVar, zVar}, 1403800035, -1403800034);
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            a aVar2 = (a) objArr[0];
            z zVar2 = (z) objArr[1];
            int i18 = f56095r0;
            int i19 = i18 & 109;
            int i20 = ((i18 ^ 109) | i19) << 1;
            int i21 = -((i18 | 109) & (~i19));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f56094q0 = i22 % 128;
            int i23 = i22 % 2;
            Intrinsics.checkNotNullParameter(zVar2, "");
            z.setY(new Object[]{zVar2, aVar2.f56096p0}, 1357340711, -1357340703, System.identityHashCode(zVar2));
            int i24 = f56094q0;
            int i25 = (((i24 & (-124)) | ((~i24) & 123)) - (~(-(-((i24 & 123) << 1))))) - 1;
            f56095r0 = i25 % 128;
            if (i25 % 2 != 0) {
                return null;
            }
            int i26 = 26 / 0;
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(z zVar) {
            Object[] objArr = {this, zVar};
            System.identityHashCode(this);
            return a(objArr, 1198494065, -1198494065);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/af;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/af;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends Lambda implements Function1<af, Unit> {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f56097t0 = 0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f56098u0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ activateSession f56099p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ValueQualifier f56100q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ byte[] f56101r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ gv f56102s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(activateSession activatesession, ValueQualifier valueQualifier, byte[] bArr, gv gvVar) {
            super(1);
            this.f56099p0 = activatesession;
            this.f56100q0 = valueQualifier;
            this.f56101r0 = bArr;
            this.f56102s0 = gvVar;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = (((~(i13 | i11)) | (~(i13 | i12))) * (-566)) + (i11 * (-565)) + (i10 * 567);
            int i15 = ~i11;
            if (((~(i15 | i13 | i12)) * 566) + ((~(i10 | i15)) * 566) + i14 != 1) {
                b bVar = (b) objArr[0];
                Object obj = objArr[1];
                int i16 = f56098u0;
                int i17 = (i16 | 95) << 1;
                int i18 = -(((~i16) & 95) | (i16 & (-96)));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                f56097t0 = i19 % 128;
                int i20 = i19 % 2;
                a(new Object[]{bVar, (af) obj}, 20610792, -20610791, System.identityHashCode(bVar));
                Unit unit = Unit.INSTANCE;
                int i21 = f56098u0;
                int i22 = i21 & 101;
                int i23 = (i21 | 101) & (~i22);
                int i24 = -(-(i22 << 1));
                int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                f56097t0 = i25 % 128;
                if (i25 % 2 == 0) {
                    return unit;
                }
                throw null;
            }
            b bVar2 = (b) objArr[0];
            af afVar = (af) objArr[1];
            int i26 = f56098u0;
            int i27 = ((i26 & 16) + (i26 | 16)) - 1;
            f56097t0 = i27 % 128;
            int i28 = i27 % 2;
            Intrinsics.checkNotNullParameter(afVar, "");
            af.setDividerPadding(new Object[]{afVar, bVar2.f56099p0}, 1583481674, -1583481662, System.identityHashCode(afVar));
            af.setDividerPadding(new Object[]{afVar, bVar2.f56100q0}, 1991488095, -1991488092, System.identityHashCode(afVar));
            byte[] bArr = bVar2.f56101r0;
            if (bArr == null) {
                int i29 = f56097t0;
                int i30 = i29 & 107;
                int i31 = -(-(i29 | 107));
                int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                f56098u0 = i32 % 128;
                int i33 = i32 % 2;
                setAnimation setanimation = setAnimation.INSTANCE;
                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1773023437, 1773023670, (int) System.currentTimeMillis());
                gv gvVar = bVar2.f56102s0;
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, transactionFailed}, 1509579822, -1509579760, System.identityHashCode(gvVar));
                Intrinsics.checkNotNull(getbeeponfailure);
                bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                int i34 = f56098u0;
                int i35 = (i34 & (-112)) | ((~i34) & 111);
                int i36 = -(-((i34 & 111) << 1));
                int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                f56097t0 = i37 % 128;
                int i38 = i37 % 2;
            } else {
                int i39 = f56097t0 + 21;
                f56098u0 = i39 % 128;
                int i40 = i39 % 2;
            }
            af.setDividerPadding(new Object[]{afVar, bArr}, -730300567, 730300574, System.identityHashCode(afVar));
            int i41 = f56098u0;
            int i42 = (-2) - (((i41 ^ 112) + ((i41 & 112) << 1)) ^ (-1));
            f56097t0 = i42 % 128;
            int i43 = i42 % 2;
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(af afVar) {
            return a(new Object[]{this, afVar}, -994349013, 994349013, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/z;", "", "setY", "(Lcom/mypinpad/tsdk/i/z;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class c extends Lambda implements Function1<z, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ byte f56103p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(byte b10) {
            super(1);
            this.f56103p0 = b10;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ((~(i10 | i11 | i12)) * (-301)) + (i11 * 302) + (i10 * (-300));
            int i14 = ~i11;
            if ((((~((~i10) | i12)) | i14) * 301) + (((~(i14 | i12)) | (~((~i12) | i10))) * (-301)) + i13 == 1) {
                c cVar = (c) objArr[0];
                a(new Object[]{cVar, (z) objArr[1]}, -2102504447, 2102504447, System.identityHashCode(cVar));
                return Unit.INSTANCE;
            }
            c cVar2 = (c) objArr[0];
            z zVar = (z) objArr[1];
            Intrinsics.checkNotNullParameter(zVar, "");
            z.setY(new Object[]{zVar, Byte.valueOf(cVar2.f56103p0)}, -48425587, 48425602, System.identityHashCode(zVar));
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(z zVar) {
            return a(new Object[]{this, zVar}, 1150381573, -1150381572, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/z;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/z;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class d extends Lambda implements Function1<z, Unit> {
        public d() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = ((~(i13 | i14)) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + (i11 * (-209)) + (i10 * (-209));
            int i16 = ~i12;
            if ((((~(i10 | i14 | i12)) | (~(i11 | i13 | i16))) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + (((~(i14 | i16)) | (~(i13 | i12))) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + i15 != 1) {
                d dVar = (d) objArr[0];
                a(new Object[]{dVar, (z) objArr[1]}, -786118429, 786118430, System.identityHashCode(dVar));
                return Unit.INSTANCE;
            }
            d dVar2 = (d) objArr[0];
            z zVar = (z) objArr[1];
            Intrinsics.checkNotNullParameter(zVar, "");
            dVar2.getClass();
            z.setY(new Object[]{zVar, Boolean.TRUE}, -699002700, 699002705, System.identityHashCode(zVar));
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(z zVar) {
            return a(new Object[]{this, zVar}, 529432890, -529432890, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/af;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/af;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class e extends Lambda implements Function1<af, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ byte[] f56104p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(byte[] bArr) {
            super(1);
            this.f56104p0 = bArr;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = i13 | i14;
            int i16 = ~(i15 | i12);
            int i17 = ~i12;
            if ((((~(i10 | i14 | i12)) | (~(i11 | i13 | i12)) | (~(i15 | i17))) * 920) + (((~i15) | (~(i13 | i17))) * 920) + ((i16 | (~(i14 | i17 | i10))) * 920) + (i11 * (-919)) + (i10 * (-919)) != 1) {
                e eVar = (e) objArr[0];
                a(new Object[]{eVar, (af) objArr[1]}, 1016900353, -1016900352, System.identityHashCode(eVar));
                return Unit.INSTANCE;
            }
            e eVar2 = (e) objArr[0];
            af afVar = (af) objArr[1];
            Intrinsics.checkNotNullParameter(afVar, "");
            af.setDividerPadding(new Object[]{afVar, eVar2.f56104p0}, -1405137347, 1405137361, System.identityHashCode(afVar));
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(af afVar) {
            return a(new Object[]{this, afVar}, 152907882, -152907882, System.identityHashCode(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv(@NotNull setBackgroundTintList setbackgroundtintlist, @Nullable di diVar, @NotNull component17 component17Var) {
        super(setbackgroundtintlist, diVar);
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        this.f56091x = ((Integer) setInputExtras.setDividerPadding(new Object[]{component17Var.setCompoundDrawableTintBlendMode(4)}, -1792313771, 1792313778, (int) System.currentTimeMillis())).intValue();
        this.f56092y = Terminal.KERNEL_2;
        this.f56093z = new ArrayList();
        this.A = new setMaxWidth();
        this.D = UByte.m5545constructorimpl((byte) 0);
        this.E = new setMaxWidth();
        this.F = new setMaxWidth();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:17:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:19:0x0121  */
    /* JADX WARN: Code duplicated, block: B:21:0x014f  */
    /* JADX WARN: Code duplicated, block: B:23:0x015c  */
    /* JADX WARN: Code duplicated, block: B:26:0x019e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0201  */
    /* JADX WARN: Code duplicated, block: B:30:0x021c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0267  */
    /* JADX WARN: Code duplicated, block: B:35:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:44:0x0304  */
    /* JADX WARN: Code duplicated, block: B:45:0x0307  */
    /* JADX WARN: Code duplicated, block: B:47:0x031b A[PHI: r7
      0x031b: PHI (r7v12 boolean) = (r7v11 boolean), (r7v25 boolean) binds: [B:46:0x0319, B:42:0x0301] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0384  */
    /* JADX WARN: Code duplicated, block: B:52:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:55:0x03e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:58:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:60:0x0407  */
    /* JADX WARN: Code duplicated, block: B:63:0x047d  */
    /* JADX WARN: Code duplicated, block: B:65:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x055e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0569  */
    /* JADX WARN: Code duplicated, block: B:75:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:79:0x0637  */
    /* JADX WARN: Code duplicated, block: B:81:0x0646  */
    /* JADX WARN: Code duplicated, block: B:82:0x069a  */
    /* JADX WARN: Code duplicated, block: B:86:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:89:0x0838  */
    /* JADX WARN: Code duplicated, block: B:92:0x0890  */
    /* JADX WARN: Code duplicated, block: B:94:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:95:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:97:0x094a  */
    public static /* synthetic */ Boolean Z(Object[] objArr) throws Exception {
        int i10;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        setScrollContainer setscrollcontainer;
        int i11;
        setScrollContainer setscrollcontainer2;
        setScrollContainer setscrollcontainer3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        setScrollContainer setscrollcontainer4;
        String str;
        TransactionFailed transactionFailed;
        setScrollContainer setscrollcontainer5;
        setScrollContainer setscrollcontainer6;
        setScrollContainer setscrollcontainer7;
        int i18;
        int i19;
        int i20;
        gv gvVar = (gv) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        TerminalCreationFailure terminalCreationFailure = (TerminalCreationFailure) objArr[2];
        int i21 = J;
        int i22 = i21 & 113;
        int i23 = (i21 | 113) & (~i22);
        int i24 = -(-(i22 << 1));
        int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
        I = i25 % 128;
        if (i25 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getbeeponfailure, "");
            setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
            setScrollContainer setscrollcontainer8 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            ((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener, gvVar, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer8}, -888877733, 888877739, System.identityHashCode(setscrollcontainer8)), setTextSize.setCompoundDrawableTintBlendMode, Terminal.KERNEL_2}, -1916735797, 1916735800, (int) System.currentTimeMillis())).booleanValue();
            setScrollContainer setscrollcontainer9 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            gvVar.setDividerPadding((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer9}, -888877733, 888877739, System.identityHashCode(setscrollcontainer9)));
            throw null;
        }
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
        setOnGenericMotionListener setongenericmotionlistener2 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
        setScrollContainer setscrollcontainer10 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
        String str2 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer10}, -888877733, 888877739, System.identityHashCode(setscrollcontainer10));
        setTextSize settextsize = setTextSize.setCompoundDrawableTintBlendMode;
        Terminal terminal = Terminal.KERNEL_2;
        boolean zBooleanValue3 = ((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener2, gvVar, str2, settextsize, terminal}, -1916735797, 1916735800, (int) System.currentTimeMillis())).booleanValue();
        setScrollContainer setscrollcontainer11 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
        boolean dividerPadding = gvVar.setDividerPadding((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer11}, -888877733, 888877739, System.identityHashCode(setscrollcontainer11)));
        if (dividerPadding) {
            int i26 = J;
            int i27 = i26 & 121;
            int i28 = i26 | 121;
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            I = i29 % 128;
            int i30 = i29 % 2;
            setScrollContainer setscrollcontainer12 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            if (((setPressed) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer12}, -1730794875, 1730794879, System.identityHashCode(setscrollcontainer12))) == setPressed.setOnFocusChangeListener) {
                int i31 = I;
                int i32 = (i31 & 33) + (i31 | 33);
                J = i32 % 128;
                if (i32 % 2 == 0) {
                    throw null;
                }
                if (!(!zBooleanValue3)) {
                    if (dividerPadding) {
                        int i33 = J;
                        int i34 = i33 & 37;
                        i10 = (i34 - (~(-(-((i33 ^ 37) | i34))))) - 1;
                        I = i10 % 128;
                        if (i10 % 2 != 0) {
                            zBooleanValue = ((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -32940825, 32940851, System.identityHashCode(getbeeponfailure))).booleanValue();
                            if (terminalCreationFailure != null) {
                                int i35 = I;
                                int i36 = (i35 & (-34)) | ((~i35) & 33);
                                int i37 = (i35 & 33) << 1;
                                int i38 = (i36 & i37) + (i37 | i36);
                                J = i38 % 128;
                                int i39 = i38 % 2;
                                setScrollContainer setscrollcontainer13 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                zBooleanValue2 = ((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener2, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer13}, -888877733, 888877739, System.identityHashCode(setscrollcontainer13)), terminalCreationFailure, terminal}, 1653596604, -1653596598, System.identityHashCode(setongenericmotionlistener2))).booleanValue();
                                int i40 = I;
                                int i41 = (i40 & (-106)) | ((~i40) & 105);
                                int i42 = -(-((i40 & 105) << 1));
                                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                                J = i43 % 128;
                                int i44 = i43 % 2;
                            } else {
                                zBooleanValue2 = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -32940825, 32940851, System.identityHashCode(getbeeponfailure))).booleanValue();
                            if (terminalCreationFailure != null) {
                                int i310 = I;
                                int i311 = (i310 & (-34)) | ((~i310) & 33);
                                int i312 = (i310 & 33) << 1;
                                int i313 = (i311 & i312) + (i312 | i311);
                                J = i313 % 128;
                                int i314 = i313 % 2;
                                setScrollContainer setscrollcontainer14 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                zBooleanValue2 = ((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener2, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer14}, -888877733, 888877739, System.identityHashCode(setscrollcontainer14)), terminalCreationFailure, terminal}, 1653596604, -1653596598, System.identityHashCode(setongenericmotionlistener2))).booleanValue();
                                int i45 = I;
                                int i46 = (i45 & (-106)) | ((~i45) & 105);
                                int i47 = -(-((i45 & 105) << 1));
                                int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                                J = i48 % 128;
                                int i49 = i48 % 2;
                            } else {
                                zBooleanValue2 = true;
                            }
                        }
                        setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        if (!gvVar.UiMessageCallbackKtWhenMappings((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)))) {
                            int i50 = J;
                            int i51 = (i50 & (-106)) | ((~i50) & 105);
                            int i52 = -(-((i50 & 105) << 1));
                            int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                            I = i53 % 128;
                            int i54 = i53 % 2;
                            setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            if (gvVar.getNavBarTitleString((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4)))) {
                                if (zBooleanValue3) {
                                    int i55 = J;
                                    int i56 = i55 ^ 19;
                                    int i57 = (((i55 & 19) | i56) << 1) - i56;
                                    i11 = i57 % 128;
                                    I = i11;
                                    int i58 = i57 % 2;
                                    if (zBooleanValue) {
                                        int i59 = ((i11 | 79) << 1) - (i11 ^ 79);
                                        J = i59 % 128;
                                        int i60 = i59 % 2;
                                        if (zBooleanValue2) {
                                            int i61 = ((i11 & 9) - (~(i11 | 9))) - 1;
                                            J = i61 % 128;
                                            int i62 = i61 % 2;
                                            gvVar.setCompoundDrawableTintBlendMode(getbeeponfailure);
                                            int i63 = J;
                                            int i64 = ((((i63 ^ 53) | (i63 & 53)) << 1) - (~(-(((~i63) & 53) | (i63 & (-54)))))) - 1;
                                            I = i64 % 128;
                                            int i65 = i64 % 2;
                                        }
                                    }
                                }
                            }
                        } else if (zBooleanValue3) {
                            int i510 = J;
                            int i511 = i510 ^ 19;
                            int i512 = (((i510 & 19) | i511) << 1) - i511;
                            i11 = i512 % 128;
                            I = i11;
                            int i513 = i512 % 2;
                            if (zBooleanValue) {
                                int i514 = ((i11 | 79) << 1) - (i11 ^ 79);
                                J = i514 % 128;
                                int i66 = i514 % 2;
                                if (zBooleanValue2) {
                                    int i67 = ((i11 & 9) - (~(i11 | 9))) - 1;
                                    J = i67 % 128;
                                    int i68 = i67 % 2;
                                    gvVar.setCompoundDrawableTintBlendMode(getbeeponfailure);
                                    int i69 = J;
                                    int i610 = ((((i69 ^ 53) | (i69 & 53)) << 1) - (~(-(((~i69) & 53) | (i69 & (-54)))))) - 1;
                                    I = i610 % 128;
                                    int i611 = i610 % 2;
                                }
                            }
                        }
                        setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        if (!gvVar.UiMessageCallbackKtWhenMappings((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)))) {
                            i17 = J + 115;
                            I = i17 % 128;
                            if (i17 % 2 != 0) {
                                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                                setScrollContainer setscrollcontainer15 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                SouthPacificEndpoint.setX(new Object[]{11572, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer15}, -888877733, 888877739, System.identityHashCode(setscrollcontainer15))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 5}, 1336485880, -1336485874, 11572);
                            } else {
                                SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                                setScrollContainer setscrollcontainer16 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                SouthPacificEndpoint.setX(new Object[]{20033, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer16}, -888877733, 888877739, System.identityHashCode(setscrollcontainer16))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20033);
                            }
                        }
                        setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        if (!gvVar.getNavBarTitleString((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3)))) {
                            int i70 = I;
                            i16 = (i70 ^ 123) + ((i70 & 123) << 1);
                            J = i16 % 128;
                            if (i16 % 2 == 0) {
                                SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                                setScrollContainer setscrollcontainer17 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                SouthPacificEndpoint.setX(new Object[]{24231, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer17}, -888877733, 888877739, System.identityHashCode(setscrollcontainer17))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 24231);
                            } else {
                                SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
                                setScrollContainer setscrollcontainer18 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                SouthPacificEndpoint.setX(new Object[]{20035, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer18}, -888877733, 888877739, System.identityHashCode(setscrollcontainer18))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20035);
                            }
                            int i71 = J;
                            int i72 = (((i71 | 12) << 1) - (i71 ^ 12)) - 1;
                            I = i72 % 128;
                            int i73 = i72 % 2;
                        }
                        if (!zBooleanValue3) {
                            int iIdentityHashCode = System.identityHashCode(gvVar);
                            int i74 = ~iIdentityHashCode;
                            int i75 = (-1963049579) ^ i74;
                            int i76 = i74 & (-1963049579);
                            int i77 = (i76 & i75) | (i75 ^ i76);
                            int i78 = ~i77;
                            int i79 = (i77 | i78) & i78;
                            int i80 = -(-(((i79 & (-1324176939)) | ((~i79) & (-1324176939)) | (i79 & 1324176938)) * (-235)));
                            int i81 = (((-1493847909) ^ i80) | ((-1493847909) & i80)) << 1;
                            int i82 = -(((~i80) & (-1493847909)) | (i80 & 1493847908));
                            int i83 = ((i81 | i82) << 1) - (i82 ^ i81);
                            int i84 = ~(((-1963049579) & iIdentityHashCode) | ((-1963049579) ^ iIdentityHashCode));
                            int i85 = ((~i84) & (-1324176939)) | (1324176938 & i84);
                            int i86 = i84 & (-1324176939);
                            int i87 = ((i86 & i85) | (i85 ^ i86)) * (-470);
                            int i88 = i83 & i87;
                            int i89 = -(-((i87 ^ i83) | i88));
                            int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
                            int i91 = (-1140933163) & iIdentityHashCode;
                            int i92 = ((-1140933163) | iIdentityHashCode) & (~i91);
                            int i93 = (i92 & i91) | (i92 ^ i91);
                            int i94 = ~i93;
                            int i95 = (i93 | i94) & i94;
                            int i96 = ((~i95) & (-2146293355)) | (2146293354 & i95);
                            int i97 = i95 & (-2146293355);
                            int i98 = -(-(((i97 & i96) | (i96 ^ i97)) * 235));
                            int i99 = ((i90 ^ i98) | (i90 & i98)) << 1;
                            int i100 = -((i98 & (~i90)) | ((~i98) & i90));
                            i13 = (i99 & i100) + (i100 | i99);
                            int iIdentityHashCode2 = System.identityHashCode(gvVar);
                            int i101 = ((~iIdentityHashCode2) & 218765546) | ((-218765547) & iIdentityHashCode2);
                            int i102 = 218765546 & iIdentityHashCode2;
                            int i103 = -(-(((~((i101 & i102) | (i101 ^ i102))) | (-673879656)) * (-658)));
                            int i104 = (-645137204) & i103;
                            int i105 = i104 + ((i103 ^ (-645137204)) | i104);
                            int i106 = ((i105 | (-395085023)) << 1) - ((-395085023) ^ i105);
                            int i107 = (i106 ^ (-1)) + (i106 << 1);
                            int i108 = iIdentityHashCode2 ^ 218765546;
                            int i109 = ~((i108 & i102) | (i108 ^ i102));
                            int i110 = ((~i109) & (-757767920)) | (757767919 & i109);
                            int i111 = i109 & (-757767920);
                            int i112 = -(-(((i111 & i110) | (i110 ^ i111)) * 658));
                            i14 = (i107 | i112) << 1;
                            i15 = -((i112 & (~i107)) | ((~i112) & i107));
                            if (i13 <= ((i14 | i15) << 1) - (i15 ^ i14)) {
                                SouthPacificEndpoint southPacificEndpoint5 = SouthPacificEndpoint.setX;
                                setScrollContainer setscrollcontainer19 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                SouthPacificEndpoint.setX(new Object[]{9039, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer19}, -888877733, 888877739, System.identityHashCode(setscrollcontainer19))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 9039);
                            } else {
                                SouthPacificEndpoint southPacificEndpoint6 = SouthPacificEndpoint.setX;
                                setScrollContainer setscrollcontainer20 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                SouthPacificEndpoint.setX(new Object[]{20036, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer20}, -888877733, 888877739, System.identityHashCode(setscrollcontainer20))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20036);
                            }
                        }
                        if (!zBooleanValue) {
                            int i113 = J;
                            i12 = (i113 ^ 41) + ((i113 & 41) << 1);
                            I = i12 % 128;
                            if (i12 % 2 != 0) {
                                SouthPacificEndpoint southPacificEndpoint7 = SouthPacificEndpoint.setX;
                                setScrollContainer setscrollcontainer21 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                SouthPacificEndpoint.setX(new Object[]{30541, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer21}, -888877733, 888877739, System.identityHashCode(setscrollcontainer21))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 2}, 1336485880, -1336485874, 30541);
                            } else {
                                SouthPacificEndpoint southPacificEndpoint8 = SouthPacificEndpoint.setX;
                                setScrollContainer setscrollcontainer22 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                SouthPacificEndpoint.setX(new Object[]{20037, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer22}, -888877733, 888877739, System.identityHashCode(setscrollcontainer22))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20037);
                            }
                        }
                        if (!zBooleanValue2) {
                            int i114 = J;
                            int i115 = (-2) - ((((i114 | 64) << 1) - (i114 ^ 64)) ^ (-1));
                            I = i115 % 128;
                            int i116 = i115 % 2;
                            SouthPacificEndpoint southPacificEndpoint9 = SouthPacificEndpoint.setX;
                            setScrollContainer setscrollcontainer23 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            SouthPacificEndpoint.setX(new Object[]{20034, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer23}, -888877733, 888877739, System.identityHashCode(setscrollcontainer23))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20034);
                            int i117 = I;
                            int i118 = (((i117 | 108) << 1) - (i117 ^ 108)) - 1;
                            J = i118 % 128;
                            int i119 = i118 % 2;
                        }
                        int i120 = I;
                        int i121 = i120 & 5;
                        int i122 = i120 | 5;
                        int i123 = ((i121 | i122) << 1) - (i122 ^ i121);
                        J = i123 % 128;
                        int i124 = i123 % 2;
                        return Boolean.FALSE;
                    }
                    setscrollcontainer5 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    if (gvVar.setY((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer5}, -888877733, 888877739, System.identityHashCode(setscrollcontainer5)))) {
                        int i125 = I + 73;
                        J = i125 % 128;
                        int i126 = i125 % 2;
                        setscrollcontainer6 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        if (gvVar.getNavBarTitleString((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer6}, -888877733, 888877739, System.identityHashCode(setscrollcontainer6)))) {
                            int i127 = J + 115;
                            i20 = i127 % 128;
                            I = i20;
                            int i128 = i127 % 2;
                            if (!(!zBooleanValue3)) {
                                int i129 = i20 & 107;
                                int i130 = (i20 ^ 107) | i129;
                                int i131 = ((i129 | i130) << 1) - (i129 ^ i130);
                                J = i131 % 128;
                                int i132 = i131 % 2;
                                gvVar.setCompoundDrawableTintBlendMode(getbeeponfailure);
                                int i133 = J + 101;
                                I = i133 % 128;
                                int i134 = i133 % 2;
                            }
                        }
                        setscrollcontainer7 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        if (!gvVar.getNavBarTitleString((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer7}, -888877733, 888877739, System.identityHashCode(setscrollcontainer7)))) {
                            int i135 = I + 63;
                            J = i135 % 128;
                            int i136 = i135 % 2;
                            SouthPacificEndpoint southPacificEndpoint10 = SouthPacificEndpoint.setX;
                            setScrollContainer setscrollcontainer24 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            SouthPacificEndpoint.setX(new Object[]{20035, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer24}, -888877733, 888877739, System.identityHashCode(setscrollcontainer24))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20035);
                            int i137 = I;
                            int i138 = i137 & 21;
                            int i139 = (i137 ^ 21) | i138;
                            int i140 = (i138 & i139) + (i139 | i138);
                            J = i140 % 128;
                            int i141 = i140 % 2;
                        }
                        if (!zBooleanValue3) {
                            int i142 = I;
                            int i143 = ((i142 ^ 17) | (i142 & 17)) << 1;
                            int i144 = -(((~i142) & 17) | (i142 & (-18)));
                            i19 = (i143 & i144) + (i144 | i143);
                            J = i19 % 128;
                            if (i19 % 2 == 0) {
                                SouthPacificEndpoint southPacificEndpoint11 = SouthPacificEndpoint.setX;
                                setScrollContainer setscrollcontainer25 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                SouthPacificEndpoint.setX(new Object[]{29193, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer25}, -888877733, 888877739, System.identityHashCode(setscrollcontainer25))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 5}, 1336485880, -1336485874, 29193);
                            } else {
                                SouthPacificEndpoint southPacificEndpoint12 = SouthPacificEndpoint.setX;
                                setScrollContainer setscrollcontainer26 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                SouthPacificEndpoint.setX(new Object[]{20036, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer26}, -888877733, 888877739, System.identityHashCode(setscrollcontainer26))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20036);
                            }
                            int i145 = I;
                            int i146 = (i145 ^ 5) + ((i145 & 5) << 1);
                            J = i146 % 128;
                            int i147 = i146 % 2;
                        }
                        int i148 = I;
                        i18 = (i148 & 19) + (i148 | 19);
                        J = i18 % 128;
                        if (i18 % 2 != 0) {
                            return Boolean.FALSE;
                        }
                        throw null;
                    }
                    setScrollContainer setscrollcontainer27 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer27}, -888877733, 888877739, System.identityHashCode(setscrollcontainer27));
                    setAnimation setanimation = setAnimation.INSTANCE;
                    transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis());
                    if (!(!Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))))) {
                        int i149 = I;
                        int i150 = (((i149 & (-90)) | ((~i149) & 89)) - (~((i149 & 89) << 1))) - 1;
                        J = i150 % 128;
                        int i151 = i150 % 2;
                        if (!((Boolean) setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1428186637, -1428186616, (int) System.currentTimeMillis())).booleanValue()) {
                            int i152 = J;
                            int i153 = (i152 & 55) + (i152 | 55);
                            I = i153 % 128;
                            int i154 = i153 % 2;
                            SouthPacificEndpoint southPacificEndpoint13 = SouthPacificEndpoint.setX;
                            setScrollContainer setscrollcontainer28 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            SouthPacificEndpoint.setX(new Object[]{20038, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer28}, -888877733, 888877739, System.identityHashCode(setscrollcontainer28))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20038);
                            int i155 = J;
                            int i156 = (((i155 | 57) << 1) - (~(-(((~i155) & 57) | (i155 & (-58)))))) - 1;
                            I = i156 % 128;
                            int i157 = i156 % 2;
                            return Boolean.FALSE;
                        }
                    }
                }
            } else {
                if (dividerPadding) {
                    int i315 = J;
                    int i316 = i315 & 37;
                    i10 = (i316 - (~(-(-((i315 ^ 37) | i316))))) - 1;
                    I = i10 % 128;
                    if (i10 % 2 != 0) {
                        zBooleanValue = ((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -32940825, 32940851, System.identityHashCode(getbeeponfailure))).booleanValue();
                        if (terminalCreationFailure != null) {
                            int i317 = I;
                            int i318 = (i317 & (-34)) | ((~i317) & 33);
                            int i319 = (i317 & 33) << 1;
                            int i3110 = (i318 & i319) + (i319 | i318);
                            J = i3110 % 128;
                            int i3111 = i3110 % 2;
                            setScrollContainer setscrollcontainer110 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            zBooleanValue2 = ((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener2, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer110}, -888877733, 888877739, System.identityHashCode(setscrollcontainer110)), terminalCreationFailure, terminal}, 1653596604, -1653596598, System.identityHashCode(setongenericmotionlistener2))).booleanValue();
                            int i410 = I;
                            int i411 = (i410 & (-106)) | ((~i410) & 105);
                            int i412 = -(-((i410 & 105) << 1));
                            int i413 = ((i411 | i412) << 1) - (i412 ^ i411);
                            J = i413 % 128;
                            int i414 = i413 % 2;
                        } else {
                            zBooleanValue2 = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -32940825, 32940851, System.identityHashCode(getbeeponfailure))).booleanValue();
                        if (terminalCreationFailure != null) {
                            int i3112 = I;
                            int i3113 = (i3112 & (-34)) | ((~i3112) & 33);
                            int i3114 = (i3112 & 33) << 1;
                            int i3115 = (i3113 & i3114) + (i3114 | i3113);
                            J = i3115 % 128;
                            int i3116 = i3115 % 2;
                            setScrollContainer setscrollcontainer111 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            zBooleanValue2 = ((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener2, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer111}, -888877733, 888877739, System.identityHashCode(setscrollcontainer111)), terminalCreationFailure, terminal}, 1653596604, -1653596598, System.identityHashCode(setongenericmotionlistener2))).booleanValue();
                            int i415 = I;
                            int i416 = (i415 & (-106)) | ((~i415) & 105);
                            int i417 = -(-((i415 & 105) << 1));
                            int i418 = ((i416 | i417) << 1) - (i417 ^ i416);
                            J = i418 % 128;
                            int i419 = i418 % 2;
                        } else {
                            zBooleanValue2 = true;
                        }
                    }
                    setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    if (!gvVar.UiMessageCallbackKtWhenMappings((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)))) {
                        int i515 = J;
                        int i516 = (i515 & (-106)) | ((~i515) & 105);
                        int i517 = -(-((i515 & 105) << 1));
                        int i518 = ((i516 | i517) << 1) - (i517 ^ i516);
                        I = i518 % 128;
                        int i519 = i518 % 2;
                        setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        if (gvVar.getNavBarTitleString((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4)))) {
                            if (zBooleanValue3) {
                                int i5110 = J;
                                int i5111 = i5110 ^ 19;
                                int i5112 = (((i5110 & 19) | i5111) << 1) - i5111;
                                i11 = i5112 % 128;
                                I = i11;
                                int i5113 = i5112 % 2;
                                if (zBooleanValue) {
                                    int i5114 = ((i11 | 79) << 1) - (i11 ^ 79);
                                    J = i5114 % 128;
                                    int i612 = i5114 % 2;
                                    if (zBooleanValue2) {
                                        int i613 = ((i11 & 9) - (~(i11 | 9))) - 1;
                                        J = i613 % 128;
                                        int i614 = i613 % 2;
                                        gvVar.setCompoundDrawableTintBlendMode(getbeeponfailure);
                                        int i615 = J;
                                        int i616 = ((((i615 ^ 53) | (i615 & 53)) << 1) - (~(-(((~i615) & 53) | (i615 & (-54)))))) - 1;
                                        I = i616 % 128;
                                        int i617 = i616 % 2;
                                    }
                                }
                            }
                        }
                    } else if (zBooleanValue3) {
                        int i5115 = J;
                        int i5116 = i5115 ^ 19;
                        int i5117 = (((i5115 & 19) | i5116) << 1) - i5116;
                        i11 = i5117 % 128;
                        I = i11;
                        int i5118 = i5117 % 2;
                        if (zBooleanValue) {
                            int i5119 = ((i11 | 79) << 1) - (i11 ^ 79);
                            J = i5119 % 128;
                            int i618 = i5119 % 2;
                            if (zBooleanValue2) {
                                int i619 = ((i11 & 9) - (~(i11 | 9))) - 1;
                                J = i619 % 128;
                                int i6110 = i619 % 2;
                                gvVar.setCompoundDrawableTintBlendMode(getbeeponfailure);
                                int i6111 = J;
                                int i6112 = ((((i6111 ^ 53) | (i6111 & 53)) << 1) - (~(-(((~i6111) & 53) | (i6111 & (-54)))))) - 1;
                                I = i6112 % 128;
                                int i6113 = i6112 % 2;
                            }
                        }
                    }
                    setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    if (!gvVar.UiMessageCallbackKtWhenMappings((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)))) {
                        i17 = J + 115;
                        I = i17 % 128;
                        if (i17 % 2 != 0) {
                            SouthPacificEndpoint southPacificEndpoint14 = SouthPacificEndpoint.setX;
                            setScrollContainer setscrollcontainer112 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            SouthPacificEndpoint.setX(new Object[]{11572, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer112}, -888877733, 888877739, System.identityHashCode(setscrollcontainer112))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 5}, 1336485880, -1336485874, 11572);
                        } else {
                            SouthPacificEndpoint southPacificEndpoint15 = SouthPacificEndpoint.setX;
                            setScrollContainer setscrollcontainer113 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            SouthPacificEndpoint.setX(new Object[]{20033, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer113}, -888877733, 888877739, System.identityHashCode(setscrollcontainer113))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20033);
                        }
                    }
                    setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    if (!gvVar.getNavBarTitleString((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3)))) {
                        int i710 = I;
                        i16 = (i710 ^ 123) + ((i710 & 123) << 1);
                        J = i16 % 128;
                        if (i16 % 2 == 0) {
                            SouthPacificEndpoint southPacificEndpoint16 = SouthPacificEndpoint.setX;
                            setScrollContainer setscrollcontainer114 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            SouthPacificEndpoint.setX(new Object[]{24231, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer114}, -888877733, 888877739, System.identityHashCode(setscrollcontainer114))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 24231);
                        } else {
                            SouthPacificEndpoint southPacificEndpoint17 = SouthPacificEndpoint.setX;
                            setScrollContainer setscrollcontainer115 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            SouthPacificEndpoint.setX(new Object[]{20035, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer115}, -888877733, 888877739, System.identityHashCode(setscrollcontainer115))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20035);
                        }
                        int i711 = J;
                        int i712 = (((i711 | 12) << 1) - (i711 ^ 12)) - 1;
                        I = i712 % 128;
                        int i713 = i712 % 2;
                    }
                    if (!zBooleanValue3) {
                        int iIdentityHashCode3 = System.identityHashCode(gvVar);
                        int i714 = ~iIdentityHashCode3;
                        int i715 = (-1963049579) ^ i714;
                        int i716 = i714 & (-1963049579);
                        int i717 = (i716 & i715) | (i715 ^ i716);
                        int i718 = ~i717;
                        int i719 = (i717 | i718) & i718;
                        int i810 = -(-(((i719 & (-1324176939)) | ((~i719) & (-1324176939)) | (i719 & 1324176938)) * (-235)));
                        int i811 = (((-1493847909) ^ i810) | ((-1493847909) & i810)) << 1;
                        int i812 = -(((~i810) & (-1493847909)) | (i810 & 1493847908));
                        int i813 = ((i811 | i812) << 1) - (i812 ^ i811);
                        int i814 = ~(((-1963049579) & iIdentityHashCode3) | ((-1963049579) ^ iIdentityHashCode3));
                        int i815 = ((~i814) & (-1324176939)) | (1324176938 & i814);
                        int i816 = i814 & (-1324176939);
                        int i817 = ((i816 & i815) | (i815 ^ i816)) * (-470);
                        int i818 = i813 & i817;
                        int i819 = -(-((i817 ^ i813) | i818));
                        int i910 = ((i818 | i819) << 1) - (i819 ^ i818);
                        int i911 = (-1140933163) & iIdentityHashCode3;
                        int i912 = ((-1140933163) | iIdentityHashCode3) & (~i911);
                        int i913 = (i912 & i911) | (i912 ^ i911);
                        int i914 = ~i913;
                        int i915 = (i913 | i914) & i914;
                        int i916 = ((~i915) & (-2146293355)) | (2146293354 & i915);
                        int i917 = i915 & (-2146293355);
                        int i918 = -(-(((i917 & i916) | (i916 ^ i917)) * 235));
                        int i919 = ((i910 ^ i918) | (i910 & i918)) << 1;
                        int i1010 = -((i918 & (~i910)) | ((~i918) & i910));
                        i13 = (i919 & i1010) + (i1010 | i919);
                        int iIdentityHashCode4 = System.identityHashCode(gvVar);
                        int i1011 = ((~iIdentityHashCode4) & 218765546) | ((-218765547) & iIdentityHashCode4);
                        int i1012 = 218765546 & iIdentityHashCode4;
                        int i1013 = -(-(((~((i1011 & i1012) | (i1011 ^ i1012))) | (-673879656)) * (-658)));
                        int i1014 = (-645137204) & i1013;
                        int i1015 = i1014 + ((i1013 ^ (-645137204)) | i1014);
                        int i1016 = ((i1015 | (-395085023)) << 1) - ((-395085023) ^ i1015);
                        int i1017 = (i1016 ^ (-1)) + (i1016 << 1);
                        int i1018 = iIdentityHashCode4 ^ 218765546;
                        int i1019 = ~((i1018 & i1012) | (i1018 ^ i1012));
                        int i1110 = ((~i1019) & (-757767920)) | (757767919 & i1019);
                        int i1111 = i1019 & (-757767920);
                        int i1112 = -(-(((i1111 & i1110) | (i1110 ^ i1111)) * 658));
                        i14 = (i1017 | i1112) << 1;
                        i15 = -((i1112 & (~i1017)) | ((~i1112) & i1017));
                        if (i13 <= ((i14 | i15) << 1) - (i15 ^ i14)) {
                            SouthPacificEndpoint southPacificEndpoint18 = SouthPacificEndpoint.setX;
                            setScrollContainer setscrollcontainer116 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            SouthPacificEndpoint.setX(new Object[]{9039, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer116}, -888877733, 888877739, System.identityHashCode(setscrollcontainer116))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 9039);
                        } else {
                            SouthPacificEndpoint southPacificEndpoint19 = SouthPacificEndpoint.setX;
                            setScrollContainer setscrollcontainer29 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            SouthPacificEndpoint.setX(new Object[]{20036, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer29}, -888877733, 888877739, System.identityHashCode(setscrollcontainer29))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20036);
                        }
                    }
                    if (!zBooleanValue) {
                        int i1113 = J;
                        i12 = (i1113 ^ 41) + ((i1113 & 41) << 1);
                        I = i12 % 128;
                        if (i12 % 2 != 0) {
                            SouthPacificEndpoint southPacificEndpoint20 = SouthPacificEndpoint.setX;
                            setScrollContainer setscrollcontainer210 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            SouthPacificEndpoint.setX(new Object[]{30541, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer210}, -888877733, 888877739, System.identityHashCode(setscrollcontainer210))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 2}, 1336485880, -1336485874, 30541);
                        } else {
                            SouthPacificEndpoint southPacificEndpoint21 = SouthPacificEndpoint.setX;
                            setScrollContainer setscrollcontainer211 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            SouthPacificEndpoint.setX(new Object[]{20037, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer211}, -888877733, 888877739, System.identityHashCode(setscrollcontainer211))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20037);
                        }
                    }
                    if (!zBooleanValue2) {
                        int i1114 = J;
                        int i1115 = (-2) - ((((i1114 | 64) << 1) - (i1114 ^ 64)) ^ (-1));
                        I = i1115 % 128;
                        int i1116 = i1115 % 2;
                        SouthPacificEndpoint southPacificEndpoint22 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer212 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{20034, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer212}, -888877733, 888877739, System.identityHashCode(setscrollcontainer212))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20034);
                        int i1117 = I;
                        int i1118 = (((i1117 | 108) << 1) - (i1117 ^ 108)) - 1;
                        J = i1118 % 128;
                        int i1119 = i1118 % 2;
                    }
                    int i1210 = I;
                    int i1211 = i1210 & 5;
                    int i1212 = i1210 | 5;
                    int i1213 = ((i1211 | i1212) << 1) - (i1212 ^ i1211);
                    J = i1213 % 128;
                    int i1214 = i1213 % 2;
                    return Boolean.FALSE;
                }
                setscrollcontainer5 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                if (gvVar.setY((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer5}, -888877733, 888877739, System.identityHashCode(setscrollcontainer5)))) {
                    int i1215 = I + 73;
                    J = i1215 % 128;
                    int i1216 = i1215 % 2;
                    setscrollcontainer6 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    if (gvVar.getNavBarTitleString((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer6}, -888877733, 888877739, System.identityHashCode(setscrollcontainer6)))) {
                        int i1217 = J + 115;
                        i20 = i1217 % 128;
                        I = i20;
                        int i1218 = i1217 % 2;
                        if (!(!zBooleanValue3)) {
                            int i1219 = i20 & 107;
                            int i1310 = (i20 ^ 107) | i1219;
                            int i1311 = ((i1219 | i1310) << 1) - (i1219 ^ i1310);
                            J = i1311 % 128;
                            int i1312 = i1311 % 2;
                            gvVar.setCompoundDrawableTintBlendMode(getbeeponfailure);
                            int i1313 = J + 101;
                            I = i1313 % 128;
                            int i1314 = i1313 % 2;
                        }
                    }
                    setscrollcontainer7 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    if (!gvVar.getNavBarTitleString((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer7}, -888877733, 888877739, System.identityHashCode(setscrollcontainer7)))) {
                        int i1315 = I + 63;
                        J = i1315 % 128;
                        int i1316 = i1315 % 2;
                        SouthPacificEndpoint southPacificEndpoint110 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer213 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{20035, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer213}, -888877733, 888877739, System.identityHashCode(setscrollcontainer213))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20035);
                        int i1317 = I;
                        int i1318 = i1317 & 21;
                        int i1319 = (i1317 ^ 21) | i1318;
                        int i1410 = (i1318 & i1319) + (i1319 | i1318);
                        J = i1410 % 128;
                        int i1411 = i1410 % 2;
                    }
                    if (!zBooleanValue3) {
                        int i1412 = I;
                        int i1413 = ((i1412 ^ 17) | (i1412 & 17)) << 1;
                        int i1414 = -(((~i1412) & 17) | (i1412 & (-18)));
                        i19 = (i1413 & i1414) + (i1414 | i1413);
                        J = i19 % 128;
                        if (i19 % 2 == 0) {
                            SouthPacificEndpoint southPacificEndpoint111 = SouthPacificEndpoint.setX;
                            setScrollContainer setscrollcontainer214 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            SouthPacificEndpoint.setX(new Object[]{29193, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer214}, -888877733, 888877739, System.identityHashCode(setscrollcontainer214))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 5}, 1336485880, -1336485874, 29193);
                        } else {
                            SouthPacificEndpoint southPacificEndpoint112 = SouthPacificEndpoint.setX;
                            setScrollContainer setscrollcontainer215 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            SouthPacificEndpoint.setX(new Object[]{20036, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer215}, -888877733, 888877739, System.identityHashCode(setscrollcontainer215))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20036);
                        }
                        int i1415 = I;
                        int i1416 = (i1415 ^ 5) + ((i1415 & 5) << 1);
                        J = i1416 % 128;
                        int i1417 = i1416 % 2;
                    }
                    int i1418 = I;
                    i18 = (i1418 & 19) + (i1418 | 19);
                    J = i18 % 128;
                    if (i18 % 2 != 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
                setScrollContainer setscrollcontainer216 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer216}, -888877733, 888877739, System.identityHashCode(setscrollcontainer216));
                setAnimation setanimation2 = setAnimation.INSTANCE;
                transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis());
                if (!(!Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))))) {
                    int i1419 = I;
                    int i158 = (((i1419 & (-90)) | ((~i1419) & 89)) - (~((i1419 & 89) << 1))) - 1;
                    J = i158 % 128;
                    int i159 = i158 % 2;
                    if (!((Boolean) setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1428186637, -1428186616, (int) System.currentTimeMillis())).booleanValue()) {
                        int i1510 = J;
                        int i1511 = (i1510 & 55) + (i1510 | 55);
                        I = i1511 % 128;
                        int i1512 = i1511 % 2;
                        SouthPacificEndpoint southPacificEndpoint113 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer217 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{20038, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer217}, -888877733, 888877739, System.identityHashCode(setscrollcontainer217))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20038);
                        int i1513 = J;
                        int i1514 = (((i1513 | 57) << 1) - (~(-(((~i1513) & 57) | (i1513 & (-58)))))) - 1;
                        I = i1514 % 128;
                        int i1515 = i1514 % 2;
                        return Boolean.FALSE;
                    }
                }
            }
        } else {
            if (dividerPadding) {
                int i3117 = J;
                int i3118 = i3117 & 37;
                i10 = (i3118 - (~(-(-((i3117 ^ 37) | i3118))))) - 1;
                I = i10 % 128;
                if (i10 % 2 != 0) {
                    zBooleanValue = ((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -32940825, 32940851, System.identityHashCode(getbeeponfailure))).booleanValue();
                    if (terminalCreationFailure != null) {
                        int i3119 = I;
                        int i31110 = (i3119 & (-34)) | ((~i3119) & 33);
                        int i31111 = (i3119 & 33) << 1;
                        int i31112 = (i31110 & i31111) + (i31111 | i31110);
                        J = i31112 % 128;
                        int i31113 = i31112 % 2;
                        setScrollContainer setscrollcontainer117 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        zBooleanValue2 = ((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener2, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer117}, -888877733, 888877739, System.identityHashCode(setscrollcontainer117)), terminalCreationFailure, terminal}, 1653596604, -1653596598, System.identityHashCode(setongenericmotionlistener2))).booleanValue();
                        int i4110 = I;
                        int i4111 = (i4110 & (-106)) | ((~i4110) & 105);
                        int i4112 = -(-((i4110 & 105) << 1));
                        int i4113 = ((i4111 | i4112) << 1) - (i4112 ^ i4111);
                        J = i4113 % 128;
                        int i4114 = i4113 % 2;
                    } else {
                        zBooleanValue2 = false;
                    }
                } else {
                    zBooleanValue = ((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -32940825, 32940851, System.identityHashCode(getbeeponfailure))).booleanValue();
                    if (terminalCreationFailure != null) {
                        int i31114 = I;
                        int i31115 = (i31114 & (-34)) | ((~i31114) & 33);
                        int i31116 = (i31114 & 33) << 1;
                        int i31117 = (i31115 & i31116) + (i31116 | i31115);
                        J = i31117 % 128;
                        int i31118 = i31117 % 2;
                        setScrollContainer setscrollcontainer118 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        zBooleanValue2 = ((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener2, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer118}, -888877733, 888877739, System.identityHashCode(setscrollcontainer118)), terminalCreationFailure, terminal}, 1653596604, -1653596598, System.identityHashCode(setongenericmotionlistener2))).booleanValue();
                        int i4115 = I;
                        int i4116 = (i4115 & (-106)) | ((~i4115) & 105);
                        int i4117 = -(-((i4115 & 105) << 1));
                        int i4118 = ((i4116 | i4117) << 1) - (i4117 ^ i4116);
                        J = i4118 % 128;
                        int i4119 = i4118 % 2;
                    } else {
                        zBooleanValue2 = true;
                    }
                }
                setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                if (!gvVar.UiMessageCallbackKtWhenMappings((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)))) {
                    int i5120 = J;
                    int i5121 = (i5120 & (-106)) | ((~i5120) & 105);
                    int i5122 = -(-((i5120 & 105) << 1));
                    int i5123 = ((i5121 | i5122) << 1) - (i5122 ^ i5121);
                    I = i5123 % 128;
                    int i5124 = i5123 % 2;
                    setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    if (gvVar.getNavBarTitleString((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4)))) {
                        if (zBooleanValue3) {
                            int i51110 = J;
                            int i51111 = i51110 ^ 19;
                            int i51112 = (((i51110 & 19) | i51111) << 1) - i51111;
                            i11 = i51112 % 128;
                            I = i11;
                            int i51113 = i51112 % 2;
                            if (zBooleanValue) {
                                int i51114 = ((i11 | 79) << 1) - (i11 ^ 79);
                                J = i51114 % 128;
                                int i6114 = i51114 % 2;
                                if (zBooleanValue2) {
                                    int i6115 = ((i11 & 9) - (~(i11 | 9))) - 1;
                                    J = i6115 % 128;
                                    int i6116 = i6115 % 2;
                                    gvVar.setCompoundDrawableTintBlendMode(getbeeponfailure);
                                    int i6117 = J;
                                    int i6118 = ((((i6117 ^ 53) | (i6117 & 53)) << 1) - (~(-(((~i6117) & 53) | (i6117 & (-54)))))) - 1;
                                    I = i6118 % 128;
                                    int i6119 = i6118 % 2;
                                }
                            }
                        }
                    }
                } else if (zBooleanValue3) {
                    int i51115 = J;
                    int i51116 = i51115 ^ 19;
                    int i51117 = (((i51115 & 19) | i51116) << 1) - i51116;
                    i11 = i51117 % 128;
                    I = i11;
                    int i51118 = i51117 % 2;
                    if (zBooleanValue) {
                        int i51119 = ((i11 | 79) << 1) - (i11 ^ 79);
                        J = i51119 % 128;
                        int i61110 = i51119 % 2;
                        if (zBooleanValue2) {
                            int i61111 = ((i11 & 9) - (~(i11 | 9))) - 1;
                            J = i61111 % 128;
                            int i61112 = i61111 % 2;
                            gvVar.setCompoundDrawableTintBlendMode(getbeeponfailure);
                            int i61113 = J;
                            int i61114 = ((((i61113 ^ 53) | (i61113 & 53)) << 1) - (~(-(((~i61113) & 53) | (i61113 & (-54)))))) - 1;
                            I = i61114 % 128;
                            int i61115 = i61114 % 2;
                        }
                    }
                }
                setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                if (!gvVar.UiMessageCallbackKtWhenMappings((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)))) {
                    i17 = J + 115;
                    I = i17 % 128;
                    if (i17 % 2 != 0) {
                        SouthPacificEndpoint southPacificEndpoint114 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer119 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{11572, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer119}, -888877733, 888877739, System.identityHashCode(setscrollcontainer119))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 5}, 1336485880, -1336485874, 11572);
                    } else {
                        SouthPacificEndpoint southPacificEndpoint115 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer1110 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{20033, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer1110}, -888877733, 888877739, System.identityHashCode(setscrollcontainer1110))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20033);
                    }
                }
                setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                if (!gvVar.getNavBarTitleString((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3)))) {
                    int i7110 = I;
                    i16 = (i7110 ^ 123) + ((i7110 & 123) << 1);
                    J = i16 % 128;
                    if (i16 % 2 == 0) {
                        SouthPacificEndpoint southPacificEndpoint116 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer1111 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{24231, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer1111}, -888877733, 888877739, System.identityHashCode(setscrollcontainer1111))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 24231);
                    } else {
                        SouthPacificEndpoint southPacificEndpoint117 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer1112 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{20035, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer1112}, -888877733, 888877739, System.identityHashCode(setscrollcontainer1112))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20035);
                    }
                    int i7111 = J;
                    int i7112 = (((i7111 | 12) << 1) - (i7111 ^ 12)) - 1;
                    I = i7112 % 128;
                    int i7113 = i7112 % 2;
                }
                if (!zBooleanValue3) {
                    int iIdentityHashCode5 = System.identityHashCode(gvVar);
                    int i7114 = ~iIdentityHashCode5;
                    int i7115 = (-1963049579) ^ i7114;
                    int i7116 = i7114 & (-1963049579);
                    int i7117 = (i7116 & i7115) | (i7115 ^ i7116);
                    int i7118 = ~i7117;
                    int i7119 = (i7117 | i7118) & i7118;
                    int i8110 = -(-(((i7119 & (-1324176939)) | ((~i7119) & (-1324176939)) | (i7119 & 1324176938)) * (-235)));
                    int i8111 = (((-1493847909) ^ i8110) | ((-1493847909) & i8110)) << 1;
                    int i8112 = -(((~i8110) & (-1493847909)) | (i8110 & 1493847908));
                    int i8113 = ((i8111 | i8112) << 1) - (i8112 ^ i8111);
                    int i8114 = ~(((-1963049579) & iIdentityHashCode5) | ((-1963049579) ^ iIdentityHashCode5));
                    int i8115 = ((~i8114) & (-1324176939)) | (1324176938 & i8114);
                    int i8116 = i8114 & (-1324176939);
                    int i8117 = ((i8116 & i8115) | (i8115 ^ i8116)) * (-470);
                    int i8118 = i8113 & i8117;
                    int i8119 = -(-((i8117 ^ i8113) | i8118));
                    int i9110 = ((i8118 | i8119) << 1) - (i8119 ^ i8118);
                    int i9111 = (-1140933163) & iIdentityHashCode5;
                    int i9112 = ((-1140933163) | iIdentityHashCode5) & (~i9111);
                    int i9113 = (i9112 & i9111) | (i9112 ^ i9111);
                    int i9114 = ~i9113;
                    int i9115 = (i9113 | i9114) & i9114;
                    int i9116 = ((~i9115) & (-2146293355)) | (2146293354 & i9115);
                    int i9117 = i9115 & (-2146293355);
                    int i9118 = -(-(((i9117 & i9116) | (i9116 ^ i9117)) * 235));
                    int i9119 = ((i9110 ^ i9118) | (i9110 & i9118)) << 1;
                    int i10110 = -((i9118 & (~i9110)) | ((~i9118) & i9110));
                    i13 = (i9119 & i10110) + (i10110 | i9119);
                    int iIdentityHashCode6 = System.identityHashCode(gvVar);
                    int i10111 = ((~iIdentityHashCode6) & 218765546) | ((-218765547) & iIdentityHashCode6);
                    int i10112 = 218765546 & iIdentityHashCode6;
                    int i10113 = -(-(((~((i10111 & i10112) | (i10111 ^ i10112))) | (-673879656)) * (-658)));
                    int i10114 = (-645137204) & i10113;
                    int i10115 = i10114 + ((i10113 ^ (-645137204)) | i10114);
                    int i10116 = ((i10115 | (-395085023)) << 1) - ((-395085023) ^ i10115);
                    int i10117 = (i10116 ^ (-1)) + (i10116 << 1);
                    int i10118 = iIdentityHashCode6 ^ 218765546;
                    int i10119 = ~((i10118 & i10112) | (i10118 ^ i10112));
                    int i11110 = ((~i10119) & (-757767920)) | (757767919 & i10119);
                    int i11111 = i10119 & (-757767920);
                    int i11112 = -(-(((i11111 & i11110) | (i11110 ^ i11111)) * 658));
                    i14 = (i10117 | i11112) << 1;
                    i15 = -((i11112 & (~i10117)) | ((~i11112) & i10117));
                    if (i13 <= ((i14 | i15) << 1) - (i15 ^ i14)) {
                        SouthPacificEndpoint southPacificEndpoint118 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer1113 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{9039, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer1113}, -888877733, 888877739, System.identityHashCode(setscrollcontainer1113))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 9039);
                    } else {
                        SouthPacificEndpoint southPacificEndpoint119 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer218 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{20036, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer218}, -888877733, 888877739, System.identityHashCode(setscrollcontainer218))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20036);
                    }
                }
                if (!zBooleanValue) {
                    int i11113 = J;
                    i12 = (i11113 ^ 41) + ((i11113 & 41) << 1);
                    I = i12 % 128;
                    if (i12 % 2 != 0) {
                        SouthPacificEndpoint southPacificEndpoint23 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer219 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{30541, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer219}, -888877733, 888877739, System.identityHashCode(setscrollcontainer219))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 2}, 1336485880, -1336485874, 30541);
                    } else {
                        SouthPacificEndpoint southPacificEndpoint24 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer2110 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{20037, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2110}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2110))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20037);
                    }
                }
                if (!zBooleanValue2) {
                    int i11114 = J;
                    int i11115 = (-2) - ((((i11114 | 64) << 1) - (i11114 ^ 64)) ^ (-1));
                    I = i11115 % 128;
                    int i11116 = i11115 % 2;
                    SouthPacificEndpoint southPacificEndpoint25 = SouthPacificEndpoint.setX;
                    setScrollContainer setscrollcontainer2111 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    SouthPacificEndpoint.setX(new Object[]{20034, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2111}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2111))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20034);
                    int i11117 = I;
                    int i11118 = (((i11117 | 108) << 1) - (i11117 ^ 108)) - 1;
                    J = i11118 % 128;
                    int i11119 = i11118 % 2;
                }
                int i12110 = I;
                int i12111 = i12110 & 5;
                int i12112 = i12110 | 5;
                int i12113 = ((i12111 | i12112) << 1) - (i12112 ^ i12111);
                J = i12113 % 128;
                int i12114 = i12113 % 2;
                return Boolean.FALSE;
            }
            setscrollcontainer5 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            if (gvVar.setY((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer5}, -888877733, 888877739, System.identityHashCode(setscrollcontainer5)))) {
                int i12115 = I + 73;
                J = i12115 % 128;
                int i12116 = i12115 % 2;
                setscrollcontainer6 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                if (gvVar.getNavBarTitleString((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer6}, -888877733, 888877739, System.identityHashCode(setscrollcontainer6)))) {
                    int i12117 = J + 115;
                    i20 = i12117 % 128;
                    I = i20;
                    int i12118 = i12117 % 2;
                    if (!(!zBooleanValue3)) {
                        int i12119 = i20 & 107;
                        int i13110 = (i20 ^ 107) | i12119;
                        int i13111 = ((i12119 | i13110) << 1) - (i12119 ^ i13110);
                        J = i13111 % 128;
                        int i13112 = i13111 % 2;
                        gvVar.setCompoundDrawableTintBlendMode(getbeeponfailure);
                        int i13113 = J + 101;
                        I = i13113 % 128;
                        int i13114 = i13113 % 2;
                    }
                }
                setscrollcontainer7 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                if (!gvVar.getNavBarTitleString((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer7}, -888877733, 888877739, System.identityHashCode(setscrollcontainer7)))) {
                    int i13115 = I + 63;
                    J = i13115 % 128;
                    int i13116 = i13115 % 2;
                    SouthPacificEndpoint southPacificEndpoint1110 = SouthPacificEndpoint.setX;
                    setScrollContainer setscrollcontainer2112 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    SouthPacificEndpoint.setX(new Object[]{20035, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2112}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2112))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20035);
                    int i13117 = I;
                    int i13118 = i13117 & 21;
                    int i13119 = (i13117 ^ 21) | i13118;
                    int i14110 = (i13118 & i13119) + (i13119 | i13118);
                    J = i14110 % 128;
                    int i14111 = i14110 % 2;
                }
                if (!zBooleanValue3) {
                    int i14112 = I;
                    int i14113 = ((i14112 ^ 17) | (i14112 & 17)) << 1;
                    int i14114 = -(((~i14112) & 17) | (i14112 & (-18)));
                    i19 = (i14113 & i14114) + (i14114 | i14113);
                    J = i19 % 128;
                    if (i19 % 2 == 0) {
                        SouthPacificEndpoint southPacificEndpoint1111 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer2113 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{29193, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2113}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2113))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 5}, 1336485880, -1336485874, 29193);
                    } else {
                        SouthPacificEndpoint southPacificEndpoint1112 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer2114 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{20036, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2114}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2114))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20036);
                    }
                    int i14115 = I;
                    int i14116 = (i14115 ^ 5) + ((i14115 & 5) << 1);
                    J = i14116 % 128;
                    int i14117 = i14116 % 2;
                }
                int i14118 = I;
                i18 = (i14118 & 19) + (i14118 | 19);
                J = i18 % 128;
                if (i18 % 2 != 0) {
                    return Boolean.FALSE;
                }
                throw null;
            }
            setScrollContainer setscrollcontainer2115 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2115}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2115));
            setAnimation setanimation3 = setAnimation.INSTANCE;
            transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis());
            if (!(!Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))))) {
                int i14119 = I;
                int i1516 = (((i14119 & (-90)) | ((~i14119) & 89)) - (~((i14119 & 89) << 1))) - 1;
                J = i1516 % 128;
                int i1517 = i1516 % 2;
                if (!((Boolean) setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1428186637, -1428186616, (int) System.currentTimeMillis())).booleanValue()) {
                    int i1518 = J;
                    int i1519 = (i1518 & 55) + (i1518 | 55);
                    I = i1519 % 128;
                    int i15110 = i1519 % 2;
                    SouthPacificEndpoint southPacificEndpoint1113 = SouthPacificEndpoint.setX;
                    setScrollContainer setscrollcontainer2116 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    SouthPacificEndpoint.setX(new Object[]{20038, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2116}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2116))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20038);
                    int i15111 = J;
                    int i15112 = (((i15111 | 57) << 1) - (~(-(((~i15111) & 57) | (i15111 & (-58)))))) - 1;
                    I = i15112 % 128;
                    int i15113 = i15112 % 2;
                    return Boolean.FALSE;
                }
            }
        }
        int i160 = I;
        int i161 = i160 & 43;
        int i162 = (((i160 | 43) & (~i161)) - (~(i161 << 1))) - 1;
        J = i162 % 128;
        int i163 = i162 % 2;
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:18:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:21:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:23:0x010d  */
    /* JADX WARN: Code duplicated, block: B:25:0x011c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0243 A[PHI: r6 r8
      0x0243: PHI (r6v22 com.mypinpad.tsdk.i.getBeepOnFailure) = (r6v21 com.mypinpad.tsdk.i.getBeepOnFailure), (r6v40 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:36:0x0240, B:33:0x01d0] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r8v14 boolean) = (r8v13 boolean), (r8v30 boolean) binds: [B:36:0x0240, B:33:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0252  */
    /* JADX WARN: Code duplicated, block: B:43:0x0278  */
    /* JADX WARN: Code duplicated, block: B:69:0x051e  */
    /* JADX WARN: Code duplicated, block: B:72:0x02fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x02fd A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0088, code lost:
    
        if (((java.lang.Boolean) setOnFocusChangeListener(new java.lang.Object[]{r1, java.lang.Integer.valueOf(r13)}, -2008906042, 2008906051, r13)).booleanValue() == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void c0(java.lang.Object[] r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.gv.c0(java.lang.Object[]):void");
    }

    public static /* synthetic */ void d0(Object[] objArr) {
        gv gvVar = (gv) objArr[0];
        md mdVar = (md) objArr[1];
        setTop settop = (setTop) objArr[2];
        int i10 = J;
        int i11 = i10 ^ 39;
        int i12 = ((i10 & 39) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        I = i14 % 128;
        int i15 = i14 % 2;
        Intrinsics.checkNotNullParameter(mdVar, "");
        Intrinsics.checkNotNullParameter(settop, "");
        super.setOnFocusChangeListener(mdVar, settop);
        setBackground navBarTitleString = gvVar.getNavBarTitleString();
        setMaxWidth setmaxwidth = (setMaxWidth) setBackground.setX(new Object[]{navBarTitleString, mdVar}, -1192893685, 1192893685, System.identityHashCode(navBarTitleString));
        Iterator<getBeepOnFailure> it = ((setMaxWidth) gy.setDividerPadding(new Object[0], -1346593006, 1346593006, (int) System.currentTimeMillis())).iterator();
        int i16 = J;
        int i17 = i16 & 29;
        int i18 = -(-((i16 ^ 29) | i17));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        I = i19 % 128;
        int i20 = i19 % 2;
        while (it.hasNext()) {
            int i21 = I;
            int i22 = ((i21 ^ 35) | (i21 & 35)) << 1;
            int i23 = -(((~i21) & 35) | (i21 & (-36)));
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            J = i24 % 128;
            if (i24 % 2 == 0) {
                getBeepOnFailure next = it.next();
                setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer))}, 1248486622, -1248486599, System.identityHashCode(setmaxwidth))).booleanValue();
                throw null;
            }
            getBeepOnFailure next2 = it.next();
            setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next2}, 865402441, -865402437, System.identityHashCode(next2));
            if (((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2))}, 1248486622, -1248486599, System.identityHashCode(setmaxwidth))).booleanValue()) {
                ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, next2}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
                int i25 = I;
                int i26 = i25 ^ 5;
                int i27 = -(-((i25 & 5) << 1));
                int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                J = i28 % 128;
                int i29 = i28 % 2;
            }
            int i30 = I;
            int i31 = (i30 ^ 123) + ((i30 & 123) << 1);
            J = i31 % 128;
            int i32 = i31 % 2;
        }
        getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -667894813, 667895009, (int) System.currentTimeMillis());
        ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{setcompounddrawabletintblendmode, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), "01", Terminal.KERNEL_2}, -1778552586, 1778552596, System.identityHashCode(setcompounddrawabletintblendmode))}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
        int i33 = J;
        int i34 = (i33 & (-24)) | ((~i33) & 23);
        int i35 = -(-((i33 & 23) << 1));
        int i36 = (i34 & i35) + (i35 | i34);
        I = i36 % 128;
        int i37 = i36 % 2;
    }

    public static /* synthetic */ void e0(Object[] objArr) throws Exception {
        byte[] bArr;
        getBeepOnFailure getbeeponfailure;
        gv gvVar = (gv) objArr[0];
        TransactionFailed transactionFailed = (TransactionFailed) objArr[1];
        int i10 = 2;
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[2];
        int i11 = I;
        int i12 = (i11 & 13) + (i11 | 13);
        J = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(transactionFailed, "");
        getBeepOnFailure dividerPadding = gvVar.setDividerPadding(transactionFailed);
        int i14 = 5;
        if (dividerPadding == null) {
            int i15 = J;
            int i16 = (i15 ^ 115) + ((i15 & 115) << 1);
            I = i16 % 128;
            int i17 = i16 % 2;
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
            gvVar.setCompoundDrawableTintBlendMode((getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), null, null, Boolean.FALSE, 30}, -976227287, 976227290, 30));
            dividerPadding = gvVar.setDividerPadding(transactionFailed);
            int i18 = I + 65;
            J = i18 % 128;
            int i19 = i18 % 2;
        }
        ArrayList arrayList = new ArrayList();
        getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
        if (getbeeponfailure2 == null) {
            int i20 = J;
            int i21 = (i20 | 37) << 1;
            int i22 = ~i20;
            int i23 = -((i20 & (-38)) | (37 & i22));
            int i24 = ((i21 | i23) << 1) - (i23 ^ i21);
            I = i24 % 128;
            int i25 = i24 % 2;
            int i26 = ((((i20 ^ 47) | (i20 & 47)) << 1) - (~(-((i20 & (-48)) | (i22 & 47))))) - 1;
            I = i26 % 128;
            int i27 = i26 % 2;
            bArr = null;
        } else {
            bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2));
            int i28 = J;
            int i29 = i28 & 121;
            int i30 = ((i28 | 121) & (~i29)) + (i29 << 1);
            I = i30 % 128;
            int i31 = i30 % 2;
        }
        Iterator<getBeepOnFailure> it = ((setMaxWidth) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{bArr, 0}, 896036021, -896036014, 0)).iterator();
        int i32 = J;
        int i33 = ((i32 ^ 27) | (i32 & 27)) << 1;
        int i34 = -(((~i32) & 27) | (i32 & (-28)));
        int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
        I = i35 % 128;
        int i36 = i35 % 2;
        while (!(!it.hasNext())) {
            int i37 = J;
            int i38 = (i37 | 107) << 1;
            int i39 = -(i37 ^ 107);
            int i40 = (i38 & i39) + (i39 | i38);
            I = i40 % 128;
            int i41 = i40 % i10;
            getBeepOnFailure next = it.next();
            setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
            getBeepOnFailure layoutAnimation = gvVar.setLayoutAnimation((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)));
            if (layoutAnimation == null) {
                int i42 = I + 67;
                J = i42 % 128;
                int i43 = i42 % i10;
                setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                Object[] objArr2 = new Object[i14];
                objArr2[0] = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2));
                objArr2[1] = null;
                objArr2[i10] = null;
                objArr2[3] = Boolean.FALSE;
                objArr2[4] = 30;
                getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(objArr2, -976227287, 976227290, 30);
                int i44 = J;
                int i45 = ((i44 ^ 57) - (~(-(-((i44 & 57) << 1))))) - 1;
                I = i45 % 128;
                int i46 = i45 % i10;
                getbeeponfailure = getbeeponfailure3;
            } else {
                byte[] bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{layoutAnimation}, 252497730, -252497710, System.identityHashCode(layoutAnimation));
                byte[] bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
                setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3)), bArrCopyOf, null, Boolean.FALSE, 28}, -976227287, 976227290, 28);
                int i47 = J + 17;
                I = i47 % 128;
                int i48 = i47 % 2;
            }
            setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
            setImageTintList setimagetintlist2 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 1115257939, -1115257923, System.identityHashCode(next));
            setFocusable setfocusable = (setFocusable) setImageTintList.setX(new Object[]{setimagetintlist2}, 290021075, -290021067, System.identityHashCode(setimagetintlist2));
            int iIntValue = ((Integer) setFocusable.setOnFocusChangeListener(new Object[]{setfocusable}, -1668155176, 1668155184, System.identityHashCode(setfocusable))).intValue();
            setImageTintList.setX(new Object[]{setimagetintlist, Integer.valueOf(iIntValue)}, -2003004454, 2003004454, iIntValue);
            arrayList.add((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)));
            int i49 = I;
            int i50 = ((i49 ^ 7) | (i49 & 7)) << 1;
            int i51 = -(((~i49) & 7) | (i49 & (-8)));
            int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
            J = i52 % 128;
            i10 = 2;
            int i53 = i52 % 2;
            i14 = 5;
        }
        if (dividerPadding != null) {
            int i54 = J;
            int i55 = i54 & 91;
            int i56 = (i54 | 91) & (~i55);
            int i57 = i55 << 1;
            int i58 = ((i56 | i57) << 1) - (i56 ^ i57);
            I = i58 % 128;
            int i59 = i58 % i10;
            byte[] bArr3 = (byte[]) setInputExtras.setDividerPadding(new Object[]{arrayList}, -822524174, 822524177, (int) System.currentTimeMillis());
            Object[] objArr3 = new Object[i10];
            objArr3[0] = dividerPadding;
            objArr3[1] = bArr3;
            getBeepOnFailure.setOnFocusChangeListener(objArr3, 1851855986, -1851855964, System.identityHashCode(dividerPadding));
            int i60 = I;
            int i61 = i60 & 35;
            int i62 = (((i60 ^ 35) | i61) << 1) - ((i60 | 35) & (~i61));
            J = i62 % 128;
            int i63 = i62 % i10;
        }
        int i64 = J;
        int i65 = i64 ^ 123;
        int i66 = (i64 & 123) << 1;
        int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
        I = i67 % 128;
        if (i67 % i10 != 0) {
            int i68 = 88 / 0;
        }
    }

    public static /* synthetic */ void f0(Object[] objArr) throws Exception {
        getBeepOnFailure next;
        gv gvVar = (gv) objArr[0];
        setMaxWidth setmaxwidth = new setMaxWidth();
        setAnimation setanimation = setAnimation.INSTANCE;
        getBeepOnFailure dividerPadding = gvVar.setDividerPadding((TransactionFailed) setAnimation.setY(new Object[0], 1645572272, -1645572135, (int) System.currentTimeMillis()));
        Intrinsics.checkNotNull(dividerPadding);
        setMaxWidth setmaxwidth2 = gvVar.A;
        Iterator<getBeepOnFailure> it = setmaxwidth2.iterator();
        int i10 = J;
        int i11 = (i10 & (-30)) | ((~i10) & 29);
        int i12 = (i10 & 29) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        I = i13 % 128;
        while (true) {
            int i14 = 2;
            int i15 = i13 % 2;
            while (true) {
                if (!it.hasNext()) {
                    setmaxwidth2.removeAll(setmaxwidth);
                    int i16 = I + 125;
                    J = i16 % 128;
                    int i17 = i16 % i14;
                    return;
                }
                int i18 = I;
                int i19 = ((i18 ^ 12) + ((i18 & 12) << 1)) - 1;
                J = i19 % 128;
                if (i19 % i14 != 0) {
                    next = it.next();
                    setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                    if (!gvVar.setY((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)))) {
                        break;
                    }
                    int i20 = J;
                    int i21 = i20 & 97;
                    int i22 = i21 + ((i20 ^ 97) | i21);
                    I = i22 % 128;
                    int i23 = i22 % i14;
                    Object[] objArr2 = new Object[i14];
                    objArr2[0] = setmaxwidth;
                    objArr2[1] = next;
                    ((Boolean) setMaxWidth.setX(objArr2, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
                    setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                    getBeepOnFailure layoutAnimation = gvVar.setLayoutAnimation((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)));
                    Intrinsics.checkNotNull(layoutAnimation);
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{dividerPadding, layoutAnimation}, 1215253814, -1215253809, System.identityHashCode(dividerPadding));
                    int i24 = I;
                    int i25 = (i24 & (-26)) | ((~i24) & 25);
                    int i26 = (i24 & 25) << 1;
                    int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                    J = i27 % 128;
                    int i28 = i27 % 2;
                    i14 = 2;
                } else {
                    next = it.next();
                    setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                    int i29 = 85 / 0;
                    if (!gvVar.setY((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3)))) {
                        break;
                    }
                    int i210 = J;
                    int i211 = i210 & 97;
                    int i212 = i211 + ((i210 ^ 97) | i211);
                    I = i212 % 128;
                    int i213 = i212 % i14;
                    Object[] objArr3 = new Object[i14];
                    objArr3[0] = setmaxwidth;
                    objArr3[1] = next;
                    ((Boolean) setMaxWidth.setX(objArr3, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
                    setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                    getBeepOnFailure layoutAnimation2 = gvVar.setLayoutAnimation((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4)));
                    Intrinsics.checkNotNull(layoutAnimation2);
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{dividerPadding, layoutAnimation2}, 1215253814, -1215253809, System.identityHashCode(dividerPadding));
                    int i214 = I;
                    int i215 = (i214 & (-26)) | ((~i214) & 25);
                    int i216 = (i214 & 25) << 1;
                    int i217 = ((i215 | i216) << 1) - (i216 ^ i215);
                    J = i217 % 128;
                    int i218 = i217 % 2;
                    i14 = 2;
                }
            }
            setScrollContainer setscrollcontainer5 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
            if (gvVar.setDividerPadding((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer5}, -888877733, 888877739, System.identityHashCode(setscrollcontainer5)))) {
                int i30 = I;
                int i31 = i30 & 45;
                int i32 = i31 + ((i30 ^ 45) | i31);
                J = i32 % 128;
                if (i32 % 2 == 0) {
                    ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, next}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
                    setScrollContainer setscrollcontainer6 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{dividerPadding, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer6}, -888877733, 888877739, System.identityHashCode(setscrollcontainer6)), null, null, Boolean.TRUE, 115}, -976227287, 976227290, 115)}, 1215253814, -1215253809, System.identityHashCode(dividerPadding));
                } else {
                    ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, next}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
                    setScrollContainer setscrollcontainer7 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{dividerPadding, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer7}, -888877733, 888877739, System.identityHashCode(setscrollcontainer7)), null, null, Boolean.FALSE, 30}, -976227287, 976227290, 30)}, 1215253814, -1215253809, System.identityHashCode(dividerPadding));
                }
            }
            int i33 = I;
            int i34 = i33 & 115;
            int i35 = -(-(i33 | 115));
            i13 = ((i34 | i35) << 1) - (i35 ^ i34);
            J = i13 % 128;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x01d4 A[PHI: r10
      0x01d4: PHI (r10v9 com.mypinpad.tsdk.i.getBeepOnFailure) = (r10v8 com.mypinpad.tsdk.i.getBeepOnFailure), (r10v12 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:26:0x01d2, B:23:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:75:0x0438 A[PHI: r4
      0x0438: PHI (r4v47 com.mypinpad.tsdk.i.getBeepOnFailure) = (r4v37 com.mypinpad.tsdk.i.getBeepOnFailure), (r4v48 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:73:0x03e3, B:70:0x03d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x05e4, code lost:
    
        if (r0 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x05e7, code lost:
    
        if (r0 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x05e9, code lost:
    
        r2 = r1 ^ 87;
        r1 = -(-((r1 & 87) << 1));
        r3 = ((r2 | r1) << 1) - (r1 ^ r2);
        com.mypinpad.tsdk.isolation.gv.I = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x05fb, code lost:
    
        if ((r3 % 2) != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0600, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0601, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r0 = com.mypinpad.tsdk.isolation.gv.I;
        r1 = r0 | 65;
        r2 = r1 << 1;
        r0 = -((~(r0 & 65)) & r1);
        r1 = (r2 & r0) + (r0 | r2);
        com.mypinpad.tsdk.isolation.gv.J = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object setOnFocusChangeListener(java.lang.Object[] r16, int r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 2186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.gv.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static /* synthetic */ void u(Object[] objArr) {
        gv gvVar = (gv) objArr[0];
        setFitsSystemWindows setfitssystemwindows = (setFitsSystemWindows) objArr[1];
        int i10 = J + 125;
        I = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setfitssystemwindows, "");
            gvVar.C = setfitssystemwindows;
        } else {
            Intrinsics.checkNotNullParameter(setfitssystemwindows, "");
            gvVar.C = setfitssystemwindows;
            throw null;
        }
    }

    @JvmName(name = "getTagsToWriteAfterGenAcYet")
    @NotNull
    public final setMaxWidth TransactionResult() {
        return (setMaxWidth) setOnFocusChangeListener(new Object[]{this}, -595845106, 595845122, System.identityHashCode(this));
    }

    @JvmName(name = "getTagsToReadYet")
    @NotNull
    public final setMaxWidth getSuppressed() {
        return (setMaxWidth) setOnFocusChangeListener(new Object[]{this}, -836208544, 836208569, System.identityHashCode(this));
    }

    @JvmName(name = "getAcType")
    @NotNull
    public final setFitsSystemWindows printStackTrace() {
        return (setFitsSystemWindows) setOnFocusChangeListener(new Object[]{this}, 326807100, -326807083, System.identityHashCode(this));
    }

    public final void setAdapter() {
        setOnFocusChangeListener(new Object[]{this}, -1470087264, 1470087294, System.identityHashCode(this));
    }

    @JvmName(name = "setActiveTag")
    public final void setAlwaysDrawnWithCacheEnabled(@Nullable String str) {
        setOnFocusChangeListener(new Object[]{this, str}, -64680794, 64680813, System.identityHashCode(this));
    }

    public final void setCacheColorHint() {
        setOnFocusChangeListener(new Object[]{this}, 808449255, -808449235, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade
    public final boolean setCompoundDrawableTintBlendMode(@NotNull getBeepOnFailure getbeeponfailure, @Nullable TerminalCreationFailure terminalCreationFailure) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, getbeeponfailure, terminalCreationFailure}, -714005946, 714005949, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "getReaderContactlessTransactionLimit")
    public final long setCursorVisible() {
        return ((Long) setOnFocusChangeListener(new Object[]{this}, 1364874083, -1364874072, System.identityHashCode(this))).longValue();
    }

    public final void setDividerPadding(@NotNull TransactionFailed transactionFailed, @Nullable setMaxWidth setmaxwidth) {
        setOnFocusChangeListener(new Object[]{this, transactionFailed, setmaxwidth}, 579017734, -579017711, System.identityHashCode(this));
    }

    public final void setEllipsize() {
        setOnFocusChangeListener(new Object[]{this}, -1843643373, 1843643374, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade, com.mypinpad.tsdk.isolation.getRrn
    public final void setLayoutAnimation() {
        setOnFocusChangeListener(new Object[]{this}, -1458301643, 1458301675, System.identityHashCode(this));
    }

    @JvmName(name = "getActiveTag")
    @Nullable
    public final String setMaxEms() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -1126898243, 1126898267, System.identityHashCode(this));
    }

    @JvmName(name = "getOnlineRequest")
    @Nullable
    public final getBeepOnFailure setScroller() {
        return (getBeepOnFailure) setOnFocusChangeListener(new Object[]{this}, -977058734, 977058760, System.identityHashCode(this));
    }

    public final long setSmoothScrollbarEnabled() {
        return ((Long) setOnFocusChangeListener(new Object[]{this}, 1910996851, -1910996837, System.identityHashCode(this))).longValue();
    }

    @JvmName(name = "getOdaStatus-w2LRezQ")
    public final byte setTextSelectHandleRight() {
        return ((Byte) setOnFocusChangeListener(new Object[]{this}, -1980384064, 1980384093, System.identityHashCode(this))).byteValue();
    }

    @JvmName(name = "getTagsToWriteBeforeGenAcYet")
    @NotNull
    public final setMaxWidth setViewTranslationCallback() {
        return (setMaxWidth) setOnFocusChangeListener(new Object[]{this}, -242476784, 242476788, System.identityHashCode(this));
    }

    public final void setX(@NotNull setTransitionVisibility settransitionvisibility) {
        setOnFocusChangeListener(new Object[]{this, settransitionvisibility}, -564445698, 564445698, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull TransactionFailed transactionFailed, @Nullable getBeepOnFailure getbeeponfailure) {
        setOnFocusChangeListener(new Object[]{this, transactionFailed, getbeeponfailure}, -909813507, 909813520, System.identityHashCode(this));
    }

    public final void setDividerPadding(int i10) {
        setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, -56098110, 56098122, i10);
    }

    @JvmName(name = "setOnlineRequest")
    public final void setX(@Nullable getBeepOnFailure getbeeponfailure) {
        setOnFocusChangeListener(new Object[]{this, getbeeponfailure}, 319442889, -319442867, System.identityHashCode(this));
    }

    @JvmName(name = "setReaderContactlessTransactionLimit")
    public final void setY(long j10) {
        setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10)}, 1340203425, -1340203407, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@Nullable Integer num, @Nullable Integer num2, @NotNull setMaxWidth setmaxwidth) {
        setOnFocusChangeListener(new Object[]{this, num, num2, setmaxwidth}, -1273972116, 1273972121, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade
    @JvmName(name = "getKernelId")
    @NotNull
    public final Terminal setDividerPadding() {
        return (Terminal) setOnFocusChangeListener(new Object[]{this}, 1558052061, -1558052051, System.identityHashCode(this));
    }

    @JvmName(name = "getDatabaseID")
    public final int setX() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -747611684, 747611692, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setOdaStatus-7apg3OU")
    public final void setY(byte b10) {
        setOnFocusChangeListener(new Object[]{this, Byte.valueOf(b10)}, -73894317, 73894323, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull activateSession activatesession, @NotNull ValueQualifier valueQualifier, @Nullable byte[] bArr) {
        setOnFocusChangeListener(new Object[]{this, activatesession, valueQualifier, bArr}, 387831959, -387831928, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(byte b10) {
        setOnFocusChangeListener(new Object[]{this, Byte.valueOf(b10)}, -1428488013, 1428488028, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull byte[] bArr) {
        setOnFocusChangeListener(new Object[]{this, bArr}, 345045286, -345045259, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade
    public final void setOnFocusChangeListener(@NotNull md mdVar, @NotNull setTop settop) {
        setOnFocusChangeListener(new Object[]{this, mdVar, settop}, 693389153, -693389146, System.identityHashCode(this));
    }

    @JvmName(name = "setAcType")
    public final void setOnFocusChangeListener(@NotNull setFitsSystemWindows setfitssystemwindows) {
        setOnFocusChangeListener(new Object[]{this, setfitssystemwindows}, 68662447, -68662445, System.identityHashCode(this));
    }
}
