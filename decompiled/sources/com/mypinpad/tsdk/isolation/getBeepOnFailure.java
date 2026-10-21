package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bk.g;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0016\u0018\u00002\u00020\u0001:\u0001YB)\b\u0012\u0012\u0006\u0010Q\u001a\u000209\u0012\u0006\u0010R\u001a\u00020E\u0012\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00020,\u0018\u000102¢\u0006\u0004\bT\u0010UB1\b\u0012\u0012\u0006\u0010:\u001a\u00020\u0002\u0012\u0006\u0010F\u001a\u00020\u000b\u0012\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020,\u0018\u000102\u0012\u0006\u0010V\u001a\u00020)¢\u0006\u0004\bT\u0010WB\t\b\u0014¢\u0006\u0004\bT\u0010XJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000J\u0014\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007J\b\u0010\n\u001a\u00020\u0000H\u0016J\u001a\u0010\u000f\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\rJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0014\u001a\u00020\u0002J\u0006\u0010\u0015\u001a\u00020\u0005J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\rH\u0002J\u0006\u0010\u0018\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0002J\u0006\u0010\u001b\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0002J)\u0010\"\u001a\u00020\u00052!\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00190\u001dJ\u0006\u0010#\u001a\u00020\u0005J\b\u0010$\u001a\u00020\u000bH\u0016J\u001c\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0&2\b\b\u0002\u0010%\u001a\u00020\rJ\b\u0010(\u001a\u00020\u0005H\u0002J)\u0010.\u001a\u00020\u00192\u0006\u0010*\u001a\u00020)2\u0012\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020,0+\"\u00020,¢\u0006\u0004\b.\u0010/J\u0006\u00100\u001a\u00020\u0019J\u0006\u00101\u001a\u00020\u0019R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u0000028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010@\u001a\n\u0012\u0004\u0012\u00020,\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u00104\"\u0004\bC\u0010DR\"\u0010F\u001a\u00020E8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010P\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006Z"}, d2 = {"Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvElement;", "", "toString", "newChild", "", "addChild", "", "newChildren", "addChildren", "clone", "", "rawTlv", "", "startPosition", "deserialize", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/meta/EmvTagMeta;", "emvTag", "getChild", FirebaseAnalytics.Param.INDEX, "tagName", "initChildren", "position", "initTagValue", "initialize", "", "isChildNotPresent", "junkify", "removeChild", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "tlv", "filter", "removeChildren", "removeEmptyChildrenTlv", "serialize", "startDepth", "Lkotlin/Pair;", "toPrintString", "updateValueWithCurrentChildrenList", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelId;", "kernelScope", "", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/UpdatePermission;", "requiredPermissions", "validate", "(Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelId;[Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/UpdatePermission;)Z", "validateValueFormat", "validateValueLength", "", "getChildrenList", "()Ljava/util/List;", "childrenList", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvList;", "childrenTlvList", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvList;", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvTag;", LogKeysKt.TAG, "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvTag;", "getTag", "()Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvTag;", "setTag", "(Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvTag;)V", "updatePermissions", "Ljava/util/List;", "getUpdatePermissions", "setUpdatePermissions", "(Ljava/util/List;)V", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvValue;", "value", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvValue;", "getValue", "()Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvValue;", "setValue", "(Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvValue;)V", "getValueData", "()[B", "setValueData", "([B)V", "valueData", "tlvTag", "tlvValue", "tlvUpdatePermissions", "<init>", "(Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvTag;Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvValue;Ljava/util/List;)V", "kernelId", "(Ljava/lang/String;[BLjava/util/List;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelId;)V", "()V", "Companion", "common"}, k = 1, mv = {1, 5, 1})
public class getBeepOnFailure extends setLeftTopRightBottom {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f55698f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f55699g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public setScrollContainer f55700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public setImageTintList f55701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public List<? extends setTextSize> f55702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final setMaxWidth f55703d;

    @NotNull
    public static final setCompoundDrawableTintBlendMode setOnFocusChangeListener = new setCompoundDrawableTintBlendMode(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final List<Terminal> f55697e = CollectionsKt__CollectionsKt.listOf((Object[]) new Terminal[]{Terminal.KERNEL_3, Terminal.KERNEL_4, Terminal.KERNEL_6});

    public static final class a extends Lambda implements Function1<getBeepOnFailure, Boolean> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55704q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55705r0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<getBeepOnFailure, Boolean> f55706p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super getBeepOnFailure, Boolean> function1) {
            super(1);
            this.f55706p0 = function1;
        }

        public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
            Boolean boolA;
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = ((~(i13 | i14)) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + (i11 * (-209)) + (i10 * (-209));
            int i16 = ~i12;
            if ((((~(i10 | i14 | i12)) | (~(i11 | i13 | i16))) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + (((~(i14 | i16)) | (~(i13 | i12))) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + i15 != 1) {
                a aVar = (a) objArr[0];
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
                int i17 = f55704q0;
                int i18 = (((i17 | 18) << 1) - (i17 ^ 18)) - 1;
                f55705r0 = i18 % 128;
                int i19 = i18 % 2;
                Intrinsics.checkNotNullParameter(getbeeponfailure, "");
                Boolean boolInvoke = aVar.f55706p0.invoke(getbeeponfailure);
                int i20 = f55705r0;
                int i21 = (i20 & 30) + (i20 | 30);
                int i22 = (i21 ^ (-1)) + (i21 << 1);
                f55704q0 = i22 % 128;
                int i23 = i22 % 2;
                return boolInvoke;
            }
            a aVar2 = (a) objArr[0];
            Object obj = objArr[1];
            int i24 = f55704q0 + 19;
            f55705r0 = i24 % 128;
            getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) obj;
            if (i24 % 2 == 0) {
                boolA = a(new Object[]{aVar2, getbeeponfailure2}, -1244403925, 1244403925, System.identityHashCode(aVar2));
                int i25 = 69 / 0;
            } else {
                boolA = a(new Object[]{aVar2, getbeeponfailure2}, -1244403925, 1244403925, System.identityHashCode(aVar2));
            }
            int i26 = f55705r0;
            int i27 = ((i26 ^ 2) + ((i26 & 2) << 1)) - 1;
            f55704q0 = i27 % 128;
            if (i27 % 2 == 0) {
                return boolA;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Boolean invoke(getBeepOnFailure getbeeponfailure) {
            return a(new Object[]{this, getbeeponfailure}, 1279776727, -1279776726, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\tJB\u0010\u0006\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0014J \u0010\u0006\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0005J\u0018\u0010\u0015\u001a\u00020\u00162\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\tJ\u001a\u0010\u0018\u001a\u00020\u00162\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\tJ$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\tH\u0002J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\u0006\u0010\u001c\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv$Companion;", "", "()V", "FF_PADDING_SUPPORTED_KERNELS", "", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelId;", "create", "Lkotlin/Pair;", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;", "", "rawTlv", "", "position", "tagLabel", "", "value", "kernelId", "updatePermissions", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/UpdatePermission;", "validate", "", "deserializeChildrenWithNoLengthAndValue", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvList;", "startPosition", "deserializeChildrenWithNoValue", "deserializeWithNoLengthAndValue", "deserializeWithNoValue", "newPosition", "invalidTag", "common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class setCompoundDrawableTintBlendMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f55707a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f55708b = 1;

        public setCompoundDrawableTintBlendMode() {
        }

        public /* synthetic */ setCompoundDrawableTintBlendMode(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ setMaxWidth setCompoundDrawableTintBlendMode(setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode, byte[] bArr) {
            return (setMaxWidth) setDividerPadding(new Object[]{setcompounddrawabletintblendmode, bArr}, 367993749, -367993745, (int) System.currentTimeMillis());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
            Object dividerPadding;
            int iIntValue;
            Pair pair;
            int i13 = ~i11;
            int i14 = (((~((~i10) | i12)) | i13) * (-318)) + (i11 * (-317)) + (i10 * 319);
            int i15 = ~(i13 | i12);
            int i16 = ~i12;
            String str = null;
            int i17 = 2;
            switch ((((~(i10 | i11 | i12)) | (~(i13 | i16 | i10))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + ((i15 | (~(i16 | i10 | i11))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + i14) {
                case 1:
                    byte[] bArr = (byte[]) objArr[0];
                    int i18 = f55707a;
                    int i19 = i18 & 73;
                    int i20 = -(-((i18 ^ 73) | i19));
                    int i21 = (i19 & i20) + (i20 | i19);
                    f55708b = i21 % 128;
                    if (i21 % 2 != 0) {
                        dividerPadding = setDividerPadding(new Object[]{bArr, 0}, 1761745221, -1761745219, 0);
                        break;
                    } else {
                        dividerPadding = setDividerPadding(new Object[]{bArr, 0}, 1761745221, -1761745219, 0);
                    }
                    Pair pair2 = (Pair) dividerPadding;
                    int i22 = f55707a;
                    int i23 = i22 & 19;
                    int i24 = -(-((i22 ^ 19) | i23));
                    int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                    f55708b = i25 % 128;
                    if (i25 % 2 != 0) {
                        return pair2;
                    }
                    throw null;
                case 2:
                    byte[] bArr2 = (byte[]) objArr[0];
                    int iIntValue2 = ((Number) objArr[1]).intValue();
                    getBeepOnFailure getbeeponfailure = new getBeepOnFailure();
                    Pair pair3 = new Pair(getbeeponfailure, Integer.valueOf(getbeeponfailure.setOnFocusChangeListener(bArr2, iIntValue2)));
                    int i26 = f55708b;
                    int i27 = (i26 & (-40)) | ((~i26) & 39);
                    int i28 = -(-((i26 & 39) << 1));
                    int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                    f55707a = i29 % 128;
                    int i30 = i29 % 2;
                    return pair3;
                case 3:
                    String str2 = (String) objArr[0];
                    byte[] bArr3 = (byte[]) objArr[1];
                    Terminal terminal = (Terminal) objArr[2];
                    boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
                    int iIntValue3 = ((Number) objArr[4]).intValue();
                    int i31 = f55707a;
                    int i32 = i31 & 91;
                    int i33 = ((i31 ^ 91) | i32) << 1;
                    int i34 = -((~i32) & (i31 | 91));
                    int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
                    f55708b = i35 % 128;
                    int i36 = i35 % 2;
                    if ((iIntValue3 & 2) != 0) {
                        int i37 = i31 & 93;
                        int i38 = (((i31 ^ 93) | i37) << 1) - ((i31 | 93) & (~i37));
                        int i39 = i38 % 128;
                        f55708b = i39;
                        bArr3 = i38 % 2 == 0 ? new byte[1] : new byte[0];
                        int i40 = (i39 ^ 56) + ((i39 & 56) << 1);
                        int i41 = (i40 ^ (-1)) + (i40 << 1);
                        f55707a = i41 % 128;
                        int i42 = i41 % 2;
                    }
                    if ((iIntValue3 & 4) != 0) {
                        int i43 = f55708b;
                        int i44 = ((i43 | 125) << 1) - (((~i43) & 125) | (i43 & (-126)));
                        f55707a = i44 % 128;
                        int i45 = i44 % 2;
                        setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                        terminal = (Terminal) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[0], -397700939, 397700950, (int) System.currentTimeMillis());
                        int i46 = f55707a + 59;
                        f55708b = i46 % 128;
                        int i47 = i46 % 2;
                    }
                    if ((iIntValue3 & 16) != 0) {
                        int i48 = f55707a;
                        int i49 = i48 ^ 9;
                        int i50 = (i48 & 9) << 1;
                        int i51 = (i49 & i50) + (i50 | i49);
                        f55708b = i51 % 128;
                        zBooleanValue = i51 % 2 != 0;
                    }
                    getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setDividerPadding(new Object[]{str2, bArr3, terminal, null, Boolean.valueOf(zBooleanValue)}, -1930792489, 1930792489, (int) System.currentTimeMillis());
                    int i52 = f55707a;
                    int i53 = (i52 | 61) << 1;
                    int i54 = -(i52 ^ 61);
                    int i55 = (i53 & i54) + (i54 | i53);
                    f55708b = i55 % 128;
                    int i56 = i55 % 2;
                    return getbeeponfailure2;
                case 4:
                    byte[] bArr4 = (byte[]) objArr[1];
                    int i57 = f55708b;
                    int i58 = i57 & 111;
                    int i59 = ((i57 | 111) & (~i58)) + (i58 << 1);
                    f55707a = i59 % 128;
                    return (setMaxWidth) (i59 % 2 != 0 ? setDividerPadding(new Object[]{bArr4, 1}, 896036021, -896036014, 1) : setDividerPadding(new Object[]{bArr4, 0}, 896036021, -896036014, 0));
                case 5:
                    setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
                    int i60 = f55707a + 37;
                    f55708b = i60 % 128;
                    if (i60 % 2 != 0) {
                        setAnimation setanimation = setAnimation.INSTANCE;
                        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 705922266, -705922214, (int) System.currentTimeMillis());
                        return (getBeepOnFailure) setDividerPadding(new Object[]{setcompounddrawabletintblendmode, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), "", Terminal.OTHER}, -1778552586, 1778552596, System.identityHashCode(setcompounddrawabletintblendmode));
                    }
                    setAnimation setanimation2 = setAnimation.INSTANCE;
                    TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 705922266, -705922214, (int) System.currentTimeMillis());
                    throw null;
                case 6:
                    byte[] bArr5 = (byte[]) objArr[0];
                    int i61 = f55707a + 21;
                    f55708b = i61 % 128;
                    int i62 = i61 % 2;
                    if (bArr5 == null) {
                        throw new setOnHierarchyChangeListener(2011, null == true ? 1 : 0, i17, null == true ? 1 : 0);
                    }
                    setMaxWidth setmaxwidth = new setMaxWidth();
                    int i63 = f55708b;
                    int i64 = ((i63 | 113) << 1) - (i63 ^ 113);
                    f55707a = i64 % 128;
                    int i65 = i64 % 2;
                    int i66 = 0;
                    while (i66 < bArr5.length) {
                        int i67 = f55707a;
                        int i68 = i67 ^ 49;
                        int i69 = ((((i67 & 49) | i68) << 1) - (~(-i68))) - 1;
                        f55708b = i69 % 128;
                        if (i69 % 2 == 0) {
                            Pair pair4 = (Pair) setDividerPadding(new Object[]{bArr5, Integer.valueOf(i66)}, 1715449782, -1715449773, i66);
                            iIntValue = ((Number) pair4.getSecond()).intValue();
                            ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) pair4.getFirst()}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
                            int i70 = 60 / 0;
                        } else {
                            Pair pair5 = (Pair) setDividerPadding(new Object[]{bArr5, Integer.valueOf(i66)}, 1715449782, -1715449773, i66);
                            iIntValue = ((Number) pair5.getSecond()).intValue();
                            ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) pair5.getFirst()}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
                        }
                        i66 = iIntValue;
                        int i71 = f55707a;
                        int i72 = (i71 ^ 107) + ((i71 & 107) << 1);
                        f55708b = i72 % 128;
                        int i73 = i72 % 2;
                    }
                    int i74 = f55708b;
                    int i75 = (-2) - (((i74 & 6) + (i74 | 6)) ^ (-1));
                    f55707a = i75 % 128;
                    int i76 = i75 % 2;
                    return setmaxwidth;
                case 7:
                    byte[] bArr6 = (byte[]) objArr[0];
                    ((Number) objArr[1]).intValue();
                    int i77 = f55708b + 47;
                    f55707a = i77 % 128;
                    if (i77 % 2 != 0) {
                        throw null;
                    }
                    if (bArr6 == null) {
                        throw new setOnHierarchyChangeListener(2011, null == true ? 1 : 0, i17, null == true ? 1 : 0);
                    }
                    setMaxWidth setmaxwidth2 = new setMaxWidth();
                    int i78 = f55707a;
                    int i79 = i78 & 21;
                    int i80 = i79 + ((i78 ^ 21) | i79);
                    f55708b = i80 % 128;
                    int i81 = i80 % 2;
                    int iIntValue4 = 0;
                    while (iIntValue4 < bArr6.length) {
                        int i82 = f55708b + 122;
                        int i83 = (i82 ^ (-1)) + (i82 << 1);
                        f55707a = i83 % 128;
                        if (i83 % 2 != 0) {
                            pair = (Pair) setDividerPadding(new Object[]{bArr6, Integer.valueOf(iIntValue4)}, 111463712, -111463704, iIntValue4);
                            setMaxWidth.setX(new Object[]{setmaxwidth2, (getBeepOnFailure) pair.getFirst(), Boolean.TRUE}, -333173787, 333173806, (int) System.currentTimeMillis());
                        } else {
                            pair = (Pair) setDividerPadding(new Object[]{bArr6, Integer.valueOf(iIntValue4)}, 111463712, -111463704, iIntValue4);
                            setMaxWidth.setX(new Object[]{setmaxwidth2, (getBeepOnFailure) pair.getFirst(), Boolean.TRUE}, -333173787, 333173806, (int) System.currentTimeMillis());
                        }
                        iIntValue4 = ((Number) pair.getSecond()).intValue();
                    }
                    int i84 = f55707a + 39;
                    f55708b = i84 % 128;
                    if (i84 % 2 != 0) {
                        return setmaxwidth2;
                    }
                    throw null;
                case 8:
                    byte[] bArr7 = (byte[]) objArr[0];
                    int iIntValue5 = ((Number) objArr[1]).intValue();
                    getBeepOnFailure getbeeponfailure3 = new getBeepOnFailure();
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3, new setScrollContainer()}, 686576922, -686576903, System.identityHashCode(getbeeponfailure3));
                    int onFocusChangeListener = ((setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, -865402437, System.identityHashCode(getbeeponfailure3))).setOnFocusChangeListener(bArr7, iIntValue5);
                    setKeyListener setkeylistener = setKeyListener.INSTANCE;
                    setScrollContainer dividerPadding2 = getbeeponfailure3.setDividerPadding();
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3, new setImageTintList((setFindListener) setKeyListener.setDividerPadding(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{dividerPadding2}, -888877733, 888877739, System.identityHashCode(dividerPadding2))}, -377194506, 377194507, (int) System.currentTimeMillis()))}, -1015234117, 1015234131, System.identityHashCode(getbeeponfailure3));
                    setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure3));
                    Pair pair6 = new Pair(getbeeponfailure3, Integer.valueOf(((Integer) setFocusable.setOnFocusChangeListener(new Object[]{(setFocusable) setImageTintList.setX(new Object[]{setimagetintlist}, 290021075, -290021067, System.identityHashCode(setimagetintlist)), bArr7, Integer.valueOf(onFocusChangeListener)}, -1501513269, 1501513279, onFocusChangeListener)).intValue()));
                    int i85 = f55707a;
                    int i86 = i85 & 83;
                    int i87 = i85 | 83;
                    int i88 = (i86 ^ i87) + ((i87 & i86) << 1);
                    f55708b = i88 % 128;
                    if (i88 % 2 != 0) {
                        return pair6;
                    }
                    int i89 = 85 / 0;
                    return pair6;
                case 9:
                    byte[] bArr8 = (byte[]) objArr[0];
                    int iIntValue6 = ((Number) objArr[1]).intValue();
                    setScrollContainer.Companion companion = setScrollContainer.INSTANCE;
                    Pair pair7 = (Pair) setScrollContainer.Companion.setDividerPadding(new Object[]{bArr8, Integer.valueOf(iIntValue6)}, -388954655, 388954655, iIntValue6);
                    setScrollContainer setscrollcontainer = (setScrollContainer) pair7.getFirst();
                    setKeyListener setkeylistener2 = setKeyListener.INSTANCE;
                    Pair pair8 = new Pair(new getBeepOnFailure(setscrollcontainer, new setImageTintList((setFindListener) setKeyListener.setDividerPadding(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer))}, -377194506, 377194507, (int) System.currentTimeMillis())), null == true ? 1 : 0, null == true ? 1 : 0), Integer.valueOf(((Number) pair7.getSecond()).intValue()));
                    int i90 = f55707a;
                    int i91 = i90 & 61;
                    int i92 = -(-((i90 ^ 61) | i91));
                    int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
                    f55708b = i93 % 128;
                    int i94 = i93 % 2;
                    return pair8;
                case 10:
                    String str3 = (String) objArr[1];
                    String str4 = (String) objArr[2];
                    Terminal terminal2 = (Terminal) objArr[3];
                    int i95 = f55708b;
                    int i96 = i95 & 25;
                    int i97 = ((i95 ^ 25) | i96) << 1;
                    int i98 = -((i95 | 25) & (~i96));
                    int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
                    f55707a = i99 % 128;
                    int i100 = i99 % 2;
                    Intrinsics.checkNotNullParameter(str4, "");
                    Intrinsics.checkNotNullParameter(terminal2, "");
                    getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setDividerPadding(new Object[]{str3, (byte[]) setInputExtras.setDividerPadding(new Object[]{str4}, -1768743273, 1768743278, (int) System.currentTimeMillis()), terminal2, Boolean.FALSE, 24}, -976227287, 976227290, 24);
                    int i101 = f55707a;
                    int i102 = (-2) - (((i101 ^ 44) + ((i101 & 44) << 1)) ^ (-1));
                    f55708b = i102 % 128;
                    if (i102 % 2 != 0) {
                        return getbeeponfailure4;
                    }
                    throw null;
                default:
                    String str5 = (String) objArr[0];
                    byte[] bArr9 = (byte[]) objArr[1];
                    Terminal terminal3 = (Terminal) objArr[2];
                    boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
                    int i103 = f55708b;
                    int i104 = ((i103 | 109) << 1) - (i103 ^ 109);
                    f55707a = i104 % 128;
                    int i105 = i104 % 2;
                    Intrinsics.checkNotNullParameter(terminal3, "");
                    if (str5 != null) {
                        int i106 = f55708b;
                        int i107 = i106 & 59;
                        int i108 = (((i106 | 59) & (~i107)) - (~(i107 << 1))) - 1;
                        f55707a = i108 % 128;
                        if (i108 % 2 != 0) {
                            throw null;
                        }
                        if (bArr9 != null) {
                            getBeepOnFailure getbeeponfailure5 = new getBeepOnFailure(str5, bArr9, null, terminal3, null);
                            if (zBooleanValue2) {
                                int i109 = f55708b;
                                int i110 = (i109 & 73) + (i109 | 73);
                                f55707a = i110 % 128;
                                int i111 = i110 % 2;
                                if (!((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5}, 610902136, -610902111, System.identityHashCode(getbeeponfailure5))).booleanValue()) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append((Object) str5);
                                    sb2.append(" : ");
                                    sb2.append((String) setInputExtras.setDividerPadding(new Object[]{bArr9}, 1609250238, -1609250236, (int) System.currentTimeMillis()));
                                    throw new setOnHierarchyChangeListener(2002, sb2.toString());
                                }
                            }
                            int i112 = f55707a;
                            int i113 = (((i112 | 16) << 1) - (i112 ^ 16)) - 1;
                            f55708b = i113 % 128;
                            int i114 = i113 % 2;
                            return getbeeponfailure5;
                        }
                    }
                    throw new setOnHierarchyChangeListener(2001, str, i17, null == true ? 1 : 0);
            }
        }

        @NotNull
        public static Pair<getBeepOnFailure, Integer> setOnFocusChangeListener(@Nullable byte[] bArr, int i10) {
            return (Pair) setDividerPadding(new Object[]{bArr, Integer.valueOf(i10)}, 1761745221, -1761745219, i10);
        }

        @NotNull
        public static setMaxWidth setY(@Nullable byte[] bArr) {
            return (setMaxWidth) setDividerPadding(new Object[]{bArr}, 800639242, -800639236, (int) System.currentTimeMillis());
        }

        @NotNull
        public final getBeepOnFailure setX() {
            return (getBeepOnFailure) setDividerPadding(new Object[]{this}, -1326528808, 1326528813, System.identityHashCode(this));
        }

        public static /* synthetic */ Pair setCompoundDrawableTintBlendMode(byte[] bArr) {
            return (Pair) setDividerPadding(new Object[]{bArr}, 2119034130, -2119034129, (int) System.currentTimeMillis());
        }

        @NotNull
        public static setMaxWidth setY(@Nullable byte[] bArr, int i10) {
            return (setMaxWidth) setDividerPadding(new Object[]{bArr, Integer.valueOf(i10)}, 896036021, -896036014, i10);
        }

        public static /* synthetic */ getBeepOnFailure setY(String str, byte[] bArr, Terminal terminal, boolean z10, int i10) {
            return (getBeepOnFailure) setDividerPadding(new Object[]{str, bArr, terminal, Boolean.valueOf(z10), Integer.valueOf(i10)}, -976227287, 976227290, i10);
        }

        @NotNull
        public final getBeepOnFailure setY(@Nullable String str, @NotNull String str2, @NotNull Terminal terminal) {
            return (getBeepOnFailure) setDividerPadding(new Object[]{this, str, str2, terminal}, -1778552586, 1778552596, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f55699g;
        int i11 = ((i10 & 29) - (~(i10 | 29))) - 1;
        f55698f = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public getBeepOnFailure() {
        this.f55703d = new setMaxWidth();
    }

    public static /* synthetic */ void a(Object[] objArr) throws Exception {
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        int i10 = f55699g;
        int i11 = i10 & 91;
        int i12 = (i11 - (~((i10 ^ 91) | i11))) - 1;
        f55698f = i12 % 128;
        if (i12 % 2 != 0) {
            getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) ((Pair) setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(byte[]) setOnFocusChangeListener(new Object[]{getbeeponfailure}, 243863605, -243863605, System.identityHashCode(getbeeponfailure)), 0}, 1761745221, -1761745219, 0)).getFirst();
            setOnFocusChangeListener(new Object[]{getbeeponfailure, (setImageTintList) setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure2))}, -1015234117, 1015234131, System.identityHashCode(getbeeponfailure));
        } else {
            getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) ((Pair) setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(byte[]) setOnFocusChangeListener(new Object[]{getbeeponfailure}, 243863605, -243863605, System.identityHashCode(getbeeponfailure)), 0}, 1761745221, -1761745219, 0)).getFirst();
            setOnFocusChangeListener(new Object[]{getbeeponfailure, (setImageTintList) setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure3))}, -1015234117, 1015234131, System.identityHashCode(getbeeponfailure));
        }
        int i13 = f55698f;
        int i14 = (i13 & 73) + (i13 | 73);
        f55699g = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ getBeepOnFailure b(Object[] objArr) {
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        TransactionFailed transactionFailed = (TransactionFailed) objArr[1];
        int i10 = f55698f;
        int i11 = (((i10 | 53) << 1) - (~(-(((~i10) & 53) | (i10 & (-54)))))) - 1;
        f55699g = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(transactionFailed, "");
            setMaxWidth setmaxwidth = getbeeponfailure.f55703d;
            return (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -480651882, 480651889, System.identityHashCode(setmaxwidth));
        }
        Intrinsics.checkNotNullParameter(transactionFailed, "");
        setMaxWidth setmaxwidth2 = getbeeponfailure.f55703d;
        throw null;
    }

    public static /* synthetic */ Pair c() {
        Pair pair = new Pair("", 0);
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i10 = f55698f;
        int i11 = i10 & 119;
        int i12 = i11 + ((i10 ^ 119) | i11);
        f55699g = i12 % 128;
        if (i12 % 2 != 0) {
            return pair;
        }
        throw null;
    }

    public static /* synthetic */ Object d(Object[] objArr) throws Exception {
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        int i10 = f55699g;
        int i11 = i10 & 1;
        int i12 = (i11 - (~(-(-((i10 ^ 1) | i11))))) - 1;
        f55698f = i12 % 128;
        if (i12 % 2 != 0) {
            setImageTintList setimagetintlist = (setImageTintList) setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
            throw null;
        }
        setImageTintList setimagetintlist2 = (setImageTintList) setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
        byte[] bArr = (byte[]) setImageTintList.setX(new Object[]{setimagetintlist2}, -1317873722, 1317873728, System.identityHashCode(setimagetintlist2));
        int i13 = f55699g;
        int i14 = i13 & 39;
        int i15 = -(-((i13 ^ 39) | i14));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        f55698f = i16 % 128;
        if (i16 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    public static /* synthetic */ getBeepOnFailure e(Object[] objArr) {
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        String str = (String) objArr[1];
        int i10 = f55698f;
        int i11 = i10 & 113;
        int i12 = (((i10 | 113) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
        f55699g = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        setMaxWidth setmaxwidth = getbeeponfailure.f55703d;
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth, str}, -480651882, 480651889, System.identityHashCode(setmaxwidth));
        int i14 = f55698f + 83;
        f55699g = i14 % 128;
        if (i14 % 2 != 0) {
            return getbeeponfailure2;
        }
        throw null;
    }

    public static /* synthetic */ Integer f(Object[] objArr) throws Exception {
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        setOnFocusChangeListener(new Object[]{getbeeponfailure, new setScrollContainer()}, 686576922, -686576903, System.identityHashCode(getbeeponfailure));
        int onFocusChangeListener = ((setScrollContainer) setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure))).setOnFocusChangeListener(bArr, iIntValue);
        setKeyListener setkeylistener = setKeyListener.INSTANCE;
        setScrollContainer dividerPadding = getbeeponfailure.setDividerPadding();
        setOnFocusChangeListener(new Object[]{getbeeponfailure, new setImageTintList((setFindListener) setKeyListener.setDividerPadding(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{dividerPadding}, -888877733, 888877739, System.identityHashCode(dividerPadding))}, -377194506, 377194507, (int) System.currentTimeMillis()))}, -1015234117, 1015234131, System.identityHashCode(getbeeponfailure));
        int onFocusChangeListener2 = ((setImageTintList) setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure))).setOnFocusChangeListener(bArr, onFocusChangeListener);
        int i10 = f55699g;
        int i11 = (i10 & (-14)) | ((~i10) & 13);
        int i12 = (i10 & 13) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f55698f = i13 % 128;
        if (i13 % 2 == 0) {
            return Integer.valueOf(onFocusChangeListener2);
        }
        int i14 = 64 / 0;
        return Integer.valueOf(onFocusChangeListener2);
    }

    public static /* synthetic */ Boolean g(Object[] objArr) throws Exception {
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        String str = (String) objArr[1];
        int i10 = f55698f;
        int i11 = i10 & 123;
        int i12 = ((i10 | 123) & (~i11)) + (i11 << 1);
        f55699g = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (getbeeponfailure.f55703d.size() <= 0) {
            int i14 = f55698f;
            int i15 = ((i14 | 97) << 1) - (i14 ^ 97);
            f55699g = i15 % 128;
            if (i15 % 2 != 0) {
                return Boolean.FALSE;
            }
            throw null;
        }
        int i16 = f55699g;
        int i17 = (i16 & 53) + (i16 | 53);
        f55698f = i17 % 128;
        int i18 = i17 % 2;
        setMaxWidth setmaxwidth = getbeeponfailure.f55703d;
        boolean zBooleanValue = ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, str}, 1949712751, -1949712727, System.identityHashCode(setmaxwidth))).booleanValue();
        setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1791457988, 1791458006, System.identityHashCode(getbeeponfailure));
        int i19 = (-2) - ((f55698f + 114) ^ (-1));
        f55699g = i19 % 128;
        int i20 = i19 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ void h(Object[] objArr) {
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        setImageTintList setimagetintlist = (setImageTintList) objArr[1];
        int i10 = f55699g;
        int i11 = ((i10 & 116) + (i10 | 116)) - 1;
        f55698f = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setimagetintlist, "");
            getbeeponfailure.f55701b = setimagetintlist;
            int i12 = 31 / 0;
        } else {
            Intrinsics.checkNotNullParameter(setimagetintlist, "");
            getbeeponfailure.f55701b = setimagetintlist;
        }
        int i13 = f55699g;
        int i14 = i13 & 59;
        int i15 = -(-((i13 ^ 59) | i14));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        f55698f = i16 % 128;
        int i17 = i16 % 2;
    }

    public static /* synthetic */ void i(Object[] objArr) throws Exception {
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        int i10 = f55698f;
        int i11 = i10 & 29;
        int i12 = (((i10 | 29) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
        f55699g = i12 % 128;
        int i13 = i12 % 2;
        if (getbeeponfailure.f55703d.size() > 0) {
            int i14 = f55698f;
            int i15 = i14 & 109;
            int i16 = i15 + ((i14 ^ 109) | i15);
            f55699g = i16 % 128;
            int i17 = i16 % 2;
            setMaxWidth setmaxwidth = getbeeponfailure.f55703d;
            if (i17 == 0) {
                setMaxWidth.setX(new Object[]{setmaxwidth}, -1326128514, 1326128523, System.identityHashCode(setmaxwidth));
                setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1791457988, 1791458006, System.identityHashCode(getbeeponfailure));
                throw null;
            }
            setMaxWidth.setX(new Object[]{setmaxwidth}, -1326128514, 1326128523, System.identityHashCode(setmaxwidth));
            setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1791457988, 1791458006, System.identityHashCode(getbeeponfailure));
            int i18 = f55698f + 33;
            f55699g = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = f55698f;
        int i21 = ((i20 | 73) << 1) - (i20 ^ 73);
        f55699g = i21 % 128;
        int i22 = i21 % 2;
    }

    public static /* synthetic */ void j(Object[] objArr) throws Exception {
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        Intrinsics.checkNotNullParameter(function1, "");
        g.removeAll((List) getbeeponfailure.f55703d, (Function1) new a(function1));
        setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1791457988, 1791458006, System.identityHashCode(getbeeponfailure));
        int i10 = f55698f;
        int i11 = (i10 ^ 87) + ((i10 & 87) << 1);
        f55699g = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 94 / 0;
        }
    }

    public static /* synthetic */ void k(Object[] objArr) throws Exception {
        getBeepOnFailure getbeeponfailure;
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[0];
        int i10 = f55699g;
        int i11 = i10 ^ 9;
        int i12 = (i10 & 9) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f55698f = i13 % 128;
        if (i13 % 2 != 0) {
            getbeeponfailure2.f55703d.clear();
            setScrollContainer setscrollcontainer = (setScrollContainer) setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
            ((Boolean) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -927948209, 927948212, System.identityHashCode(setscrollcontainer))).booleanValue();
            throw null;
        }
        getbeeponfailure2.f55703d.clear();
        setScrollContainer setscrollcontainer2 = (setScrollContainer) setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
        if (((Boolean) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -927948209, 927948212, System.identityHashCode(setscrollcontainer2))).booleanValue()) {
            int i14 = f55698f;
            int i15 = ((i14 & (-104)) | ((~i14) & 103)) + ((i14 & 103) << 1);
            f55699g = i15 % 128;
            int onFocusChangeListener = i15 % 2 == 0 ? 1 : 0;
            while (true) {
                setImageTintList setimagetintlist = (setImageTintList) setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure2));
                if (onFocusChangeListener >= ((Integer) setImageTintList.setX(new Object[]{setimagetintlist}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist))).intValue() || (onFocusChangeListener = (getbeeponfailure = new getBeepOnFailure()).setOnFocusChangeListener((byte[]) setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2)), onFocusChangeListener)) <= 0) {
                    break;
                }
                int i16 = f55698f;
                int i17 = (i16 ^ 23) + ((i16 & 23) << 1);
                f55699g = i17 % 128;
                if (i17 % 2 == 0) {
                    setMaxWidth.setX(new Object[]{getbeeponfailure2.f55703d, getbeeponfailure, Boolean.FALSE}, -333173787, 333173806, (int) System.currentTimeMillis());
                } else {
                    setMaxWidth.setX(new Object[]{getbeeponfailure2.f55703d, getbeeponfailure, Boolean.TRUE}, -333173787, 333173806, (int) System.currentTimeMillis());
                }
                int i18 = f55698f;
                int i19 = i18 & 15;
                int i20 = i19 + ((i18 ^ 15) | i19);
                f55699g = i20 % 128;
                int i21 = i20 % 2;
            }
        }
        int i22 = f55699g;
        int i23 = i22 & 67;
        int i24 = (i23 - (~((i22 ^ 67) | i23))) - 1;
        f55698f = i24 % 128;
        if (i24 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void l(Object[] objArr) {
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        setScrollContainer setscrollcontainer = (setScrollContainer) objArr[1];
        int i10 = f55698f;
        int i11 = (((i10 & (-116)) | ((~i10) & 115)) - (~((i10 & 115) << 1))) - 1;
        f55699g = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setscrollcontainer, "");
            getbeeponfailure.f55700a = setscrollcontainer;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setscrollcontainer, "");
        getbeeponfailure.f55700a = setscrollcontainer;
        int i12 = f55698f;
        int i13 = (((i12 | 101) << 1) - (~(-(i12 ^ 101)))) - 1;
        f55699g = i13 % 128;
        int i14 = i13 % 2;
    }

    public static /* synthetic */ void m(Object[] objArr) throws Exception {
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        getbeeponfailure.f55703d.clear();
        setImageTintList compoundDrawableTintBlendMode = getbeeponfailure.setCompoundDrawableTintBlendMode();
        setOnFocusChangeListener(new Object[]{getbeeponfailure, new setImageTintList((setFindListener) setImageTintList.setX(new Object[]{compoundDrawableTintBlendMode}, -352851471, 352851476, System.identityHashCode(compoundDrawableTintBlendMode)))}, -1015234117, 1015234131, System.identityHashCode(getbeeponfailure));
        int i10 = f55698f;
        int i11 = (i10 & 103) + (i10 | 103);
        f55699g = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ setImageTintList n(Object[] objArr) {
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        int iIdentityHashCode = System.identityHashCode(getbeeponfailure);
        int i10 = ~iIdentityHashCode;
        int i11 = (i10 | iIdentityHashCode) & i10;
        int i12 = ((~i11) & (-1113768001)) | (1113768000 & i11);
        int i13 = (-1113768001) & i11;
        int i14 = ((i12 & i13) | (i12 ^ i13)) * (-369);
        int i15 = (-1767514946) & i14;
        int i16 = (((-1767514946) ^ i14) | i15) << 1;
        int i17 = -((i14 | (-1767514946)) & (~i15));
        int i18 = (i16 & i17) + (i17 | i16);
        int i19 = (i10 & 1248248259) | (1248248259 ^ i10);
        int i20 = ~i19;
        int i21 = (i19 | i20) & i20;
        int i22 = -(-(((i21 & 152317339) | (152317339 ^ i21)) * (-369)));
        int i23 = ((~i22) & i18) | ((~i18) & i22);
        int i24 = -(-((i22 & i18) << 1));
        int i25 = (i23 & i24) + (i24 | i23);
        int i26 = (-1248248260) & iIdentityHashCode;
        int i27 = (iIdentityHashCode | (-1248248260)) & (~i26);
        int i28 = ~((i27 & i26) | (i27 ^ i26));
        int i29 = (i28 & 134480259) | (134480259 ^ i28);
        int i30 = 1248248259 & i11;
        int i31 = i30 | ((i11 | 1248248259) & (~i30));
        int i32 = i31 & 152317339;
        int i33 = (i31 | 152317339) & (~i32);
        int i34 = ~((i33 & i32) | (i33 ^ i32));
        int i35 = i29 ^ i34;
        int i36 = i29 & i34;
        int i37 = ((i36 & i35) | (i35 ^ i36)) * 369;
        int i38 = i25 & i37;
        int i39 = -(-((i37 ^ i25) | i38));
        int i40 = (i38 & i39) + (i39 | i38);
        int iIdentityHashCode2 = System.identityHashCode(getbeeponfailure);
        int i41 = ~iIdentityHashCode2;
        int i42 = 1158922315 ^ i41;
        int i43 = 1158922315 & i41;
        int i44 = ~((i42 & i43) | (i42 ^ i43));
        int i45 = (i44 & (-438900908)) | ((~i44) & (-438900908)) | (438900907 & i44);
        int i46 = (1158922315 & iIdentityHashCode2) | ((-1158922316) & i41) | ((-1158922316) & iIdentityHashCode2);
        int i47 = ~i46;
        int i48 = (i46 | i47) & i47;
        int i49 = ((i48 & i45) | (i45 ^ i48)) * (-564);
        int i50 = 50812979 & i49;
        int i51 = (i49 ^ 50812979) | i50;
        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
        int i53 = -(-((~((iIdentityHashCode2 & (-65548)) | ((-65548) ^ iIdentityHashCode2))) * 1128));
        int i54 = i52 ^ i53;
        int i55 = ((((i53 & i52) | i54) << 1) - (~(-i54))) - 1;
        int i56 = ~((i41 & (-438900908)) | ((-438900908) ^ i41));
        int i57 = -(-(((i56 & 1158856768) | (i56 ^ 1158856768)) * 564));
        int i58 = i55 & i57;
        int i59 = i58 + ((i55 ^ i57) | i58);
        setImageTintList setimagetintlist = getbeeponfailure.f55701b;
        if (i40 > i59) {
            throw null;
        }
        if (setimagetintlist != null) {
            int i60 = f55698f + 53;
            f55699g = i60 % 128;
            int i61 = i60 % 2;
            return setimagetintlist;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i62 = f55699g;
        int i63 = ((i62 | 11) << 1) - (i62 ^ 11);
        f55698f = i63 % 128;
        if (i63 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void o(Object[] objArr) throws Exception {
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[1];
        int i10 = f55699g;
        int i11 = (i10 & 7) + (i10 | 7);
        f55698f = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getbeeponfailure2, "");
            setMaxWidth setmaxwidth = getbeeponfailure.f55703d;
            ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, getbeeponfailure2}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
            setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1791457988, 1791458006, System.identityHashCode(getbeeponfailure));
            return;
        }
        Intrinsics.checkNotNullParameter(getbeeponfailure2, "");
        setMaxWidth setmaxwidth2 = getbeeponfailure.f55703d;
        ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth2, getbeeponfailure2}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth2))).booleanValue();
        setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1791457988, 1791458006, System.identityHashCode(getbeeponfailure));
        int i12 = 42 / 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        r1 = 97 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r4 = com.mypinpad.tsdk.isolation.getBeepOnFailure.f55699g;
        r0 = r4 & 23;
        r4 = (r4 | 23) & (~r0);
        r0 = -(-(r0 << 1));
        r1 = (r4 & r0) + (r4 | r0);
        com.mypinpad.tsdk.isolation.getBeepOnFailure.f55698f = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        r2 = (r1 & (-42)) | ((~r1) & 41);
        r1 = (r1 & 41) << 1;
        r3 = ((r2 | r1) << 1) - (r1 ^ r2);
        com.mypinpad.tsdk.isolation.getBeepOnFailure.f55699g = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if ((r3 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.mypinpad.tsdk.isolation.setScrollContainer p(java.lang.Object[] r4) {
        /*
            r0 = 0
            r4 = r4[r0]
            com.mypinpad.tsdk.i.getBeepOnFailure r4 = (com.mypinpad.tsdk.isolation.getBeepOnFailure) r4
            int r1 = com.mypinpad.tsdk.isolation.getBeepOnFailure.f55699g
            r2 = r1 ^ 111(0x6f, float:1.56E-43)
            r3 = r1 & 111(0x6f, float:1.56E-43)
            r2 = r2 | r3
            int r2 = r2 << 1
            r3 = r1 & (-112(0xffffffffffffff90, float:NaN))
            int r1 = ~r1
            r1 = r1 & 111(0x6f, float:1.56E-43)
            r1 = r1 | r3
            int r2 = r2 - r1
            int r1 = r2 % 128
            com.mypinpad.tsdk.isolation.getBeepOnFailure.f55698f = r1
            int r2 = r2 % 2
            com.mypinpad.tsdk.i.setScrollContainer r4 = r4.f55700a
            if (r2 == 0) goto L25
            r2 = 77
            int r2 = r2 / r0
            if (r4 == 0) goto L43
            goto L27
        L25:
            if (r4 == 0) goto L43
        L27:
            r2 = r1 & (-42)
            int r3 = ~r1
            r3 = r3 & 41
            r2 = r2 | r3
            r1 = r1 & 41
            int r1 = r1 << 1
            r3 = r2 | r1
            int r3 = r3 << 1
            r1 = r1 ^ r2
            int r3 = r3 - r1
            int r1 = r3 % 128
            com.mypinpad.tsdk.isolation.getBeepOnFailure.f55699g = r1
            int r3 = r3 % 2
            if (r3 != 0) goto L42
            r1 = 97
            int r1 = r1 / r0
        L42:
            return r4
        L43:
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            int r4 = com.mypinpad.tsdk.isolation.getBeepOnFailure.f55699g
            r0 = r4 & 23
            int r1 = ~r0
            r4 = r4 | 23
            r4 = r4 & r1
            int r0 = r0 << 1
            int r0 = -r0
            int r0 = -r0
            r1 = r4 & r0
            r4 = r4 | r0
            int r1 = r1 + r4
            int r4 = r1 % 128
            com.mypinpad.tsdk.isolation.getBeepOnFailure.f55698f = r4
            int r1 = r1 % 2
            r4 = 0
            if (r1 != 0) goto L62
            return r4
        L62:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getBeepOnFailure.p(java.lang.Object[]):com.mypinpad.tsdk.i.setScrollContainer");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0347  */
    /* JADX WARN: Code duplicated, block: B:49:0x0365  */
    public static /* synthetic */ Boolean q(Object[] objArr) throws Exception {
        boolean z10;
        setTextSize settextsize;
        setTextSize[] settextsizeArr;
        int length;
        boolean z11;
        int i10 = 0;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        Terminal terminal = (Terminal) objArr[1];
        setTextSize[] settextsizeArr2 = (setTextSize[]) objArr[2];
        int i11 = f55699g;
        int i12 = (i11 | 73) << 1;
        int i13 = -(((~i11) & 73) | (i11 & (-74)));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f55698f = i14 % 128;
        if (i14 % 2 != 0) {
            Intrinsics.checkNotNullParameter(terminal, "");
            Intrinsics.checkNotNullParameter(settextsizeArr2, "");
            setImageTintList setimagetintlist = (setImageTintList) setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
            ((Integer) setImageTintList.setX(new Object[]{setimagetintlist}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist))).intValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(terminal, "");
        Intrinsics.checkNotNullParameter(settextsizeArr2, "");
        setImageTintList setimagetintlist2 = (setImageTintList) setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
        if (((Integer) setImageTintList.setX(new Object[]{setimagetintlist2}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist2))).intValue() == 0) {
            int i15 = f55698f;
            int i16 = (i15 & 93) + (i15 | 93);
            int i17 = i16 % 128;
            f55699g = i17;
            int i18 = i16 % 2;
            int i19 = ((i17 ^ 29) | (i17 & 29)) << 1;
            int i20 = -(((~i17) & 29) | (i17 & (-30)));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f55698f = i21 % 128;
            int i22 = i21 % 2;
            return Boolean.TRUE;
        }
        setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
        setScrollContainer setscrollcontainer = (setScrollContainer) setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
        TransactionFailed transactionFailed = (TransactionFailed) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)), terminal}, 1668702711, -1668702709, (int) System.currentTimeMillis());
        if (transactionFailed == null) {
            int i23 = f55699g;
            int i24 = ((i23 ^ 7) | (i23 & 7)) << 1;
            int i25 = -((i23 & (-8)) | ((~i23) & 7));
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            f55698f = i26 % 128;
            int i27 = i26 % 2;
            int i28 = (-2) - ((i23 + 60) ^ (-1));
            f55698f = i28 % 128;
            int i29 = i28 % 2;
            return Boolean.TRUE;
        }
        setFindListener setfindlistener = (setFindListener) TransactionFailed.setX(new Object[]{transactionFailed}, -570885530, 570885532, System.identityHashCode(transactionFailed));
        int length2 = settextsizeArr2.length;
        int i30 = f55698f;
        int i31 = (i30 ^ 121) + ((i30 & 121) << 1);
        f55699g = i31 % 128;
        int i32 = i31 % 2;
        int i33 = 0;
        loop0: while (true) {
            if (i33 >= length2) {
                int i34 = f55699g;
                int i35 = (i34 & (-114)) | ((~i34) & 113);
                int i36 = (i34 & 113) << 1;
                int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                f55698f = i37 % 128;
                int i38 = i37 % 2;
                break;
            }
            int i39 = f55699g;
            int i40 = i39 ^ 85;
            int i41 = (i39 & 85) << 1;
            int i42 = ((i40 | i41) << 1) - (i40 ^ i41);
            f55698f = i42 % 128;
            if (i42 % 2 != 0) {
                settextsize = settextsizeArr2[i33];
                Object[] objArr2 = new Object[1];
                objArr2[i10] = transactionFailed;
                settextsizeArr = (setTextSize[]) TransactionFailed.setX(objArr2, -1568503950, 1568503957, System.identityHashCode(transactionFailed));
                length = settextsizeArr.length;
            } else {
                settextsize = settextsizeArr2[i33];
                Object[] objArr3 = new Object[1];
                objArr3[i10] = transactionFailed;
                settextsizeArr = (setTextSize[]) TransactionFailed.setX(objArr3, -1568503950, 1568503957, System.identityHashCode(transactionFailed));
                length = settextsizeArr.length;
            }
            int i43 = f55699g;
            int i44 = (i43 ^ 113) + ((i43 & 113) << 1);
            f55698f = i44 % 128;
            int i45 = i44 % 2;
            int i46 = i10;
            while (true) {
                if (i46 >= length) {
                    int i47 = f55698f;
                    int i48 = i47 & 87;
                    int i49 = (i47 | 87) & (~i48);
                    int i50 = -(-(i48 << 1));
                    int i51 = (i49 ^ i50) + ((i49 & i50) << 1);
                    int i52 = i51 % 128;
                    f55699g = i52;
                    int i53 = i51 % 2;
                    int i54 = ((i52 ^ 105) | (i52 & 105)) << 1;
                    int i55 = -(((~i52) & 105) | (i52 & (-106)));
                    int i56 = (i54 & i55) + (i55 | i54);
                    f55698f = i56 % 128;
                    if (i56 % 2 != 0) {
                        break loop0;
                    }
                    SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                    StringBuilder sb2 = new StringBuilder("Update permissions of tag '");
                    setScrollContainer setscrollcontainer2 = (setScrollContainer) setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    sb2.append((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)));
                    sb2.append("' are not matching required permissions: [");
                    sb2.append(ArraysKt___ArraysKt.joinToString$default(settextsizeArr2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                    sb2.append("], kernel ID: ");
                    sb2.append((String) getPinPadLandscape.setY(new Object[]{Byte.valueOf(terminal.setY())}, 1862949367, -1862949363, (int) System.currentTimeMillis()));
                    SouthPacificEndpoint.setX(new Object[]{sb2.toString()}, -1475632754, 1475632759, (int) System.currentTimeMillis());
                    int i57 = f55699g;
                    int i58 = (i57 & 54) + (i57 | 54);
                    int i59 = (i58 ^ (-1)) + (i58 << 1);
                    f55698f = i59 % 128;
                    if (i59 % 2 == 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
                System.identityHashCode(getbeeponfailure);
                System.identityHashCode(getbeeponfailure);
                if (settextsizeArr[i46] == settextsize) {
                    int i60 = f55698f;
                    int i61 = i60 & 81;
                    int i62 = (((i60 ^ 81) | i61) << 1) - ((~i61) & (i60 | 81));
                    int i63 = i62 % 128;
                    f55699g = i63;
                    int i64 = i62 % 2;
                    int i65 = i63 + 122;
                    int i66 = (i65 ^ (-1)) + (i65 << 1);
                    f55698f = i66 % 128;
                    int i67 = i66 % 2;
                    z11 = true;
                } else {
                    int i68 = f55698f + 1;
                    f55699g = i68 % 128;
                    int i69 = i68 % 2;
                    z11 = false;
                }
                if (!z11) {
                    int i70 = i46 + 8;
                    i46 = (i70 | (-7)) + (i70 & (-7));
                    System.identityHashCode(getbeeponfailure);
                    System.identityHashCode(getbeeponfailure);
                }
            }
            int i71 = f55698f;
            int i72 = (i71 & 59) + (i71 | 59);
            int i73 = i72 % 128;
            f55699g = i73;
            int i74 = i72 % 2;
            int i75 = (i73 ^ 35) + ((i73 & 35) << 1);
            int i76 = i75 % 128;
            f55698f = i76;
            int i77 = i75 % 2;
            i33++;
            int i78 = i76 + 34;
            int i79 = (i78 ^ (-1)) + (i78 << 1);
            f55699g = i79 % 128;
            int i80 = i79 % 2;
            i10 = 0;
        }
        if (setfindlistener.setX((byte[]) setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))) {
            int i81 = f55698f;
            int i82 = (i81 & (-24)) | ((~i81) & 23);
            int i83 = -(-((i81 & 23) << 1));
            int i84 = (i82 & i83) + (i83 | i82);
            f55699g = i84 % 128;
            if (i84 % 2 == 0) {
                int i85 = 19 / 0;
                if (!((Boolean) setFindListener.setY(new Object[]{setfindlistener, (byte[]) setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))}, -2109739487, 2109739489, System.identityHashCode(setfindlistener))).booleanValue()) {
                    int i86 = f55698f + 21;
                    f55699g = i86 % 128;
                    int i87 = i86 % 2;
                    z10 = false;
                } else {
                    int i88 = f55699g;
                    int i89 = i88 ^ 45;
                    int i90 = ((((i88 & 45) | i89) << 1) - (~(-i89))) - 1;
                    int i91 = i90 % 128;
                    f55698f = i91;
                    int i92 = i90 % 2;
                    int i93 = ((i91 & 86) + (i91 | 86)) - 1;
                    f55699g = i93 % 128;
                    int i94 = i93 % 2;
                    z10 = true;
                }
            } else if (((Boolean) setFindListener.setY(new Object[]{setfindlistener, (byte[]) setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))}, -2109739487, 2109739489, System.identityHashCode(setfindlistener))).booleanValue()) {
                int i810 = f55699g;
                int i811 = i810 ^ 45;
                int i95 = ((((i810 & 45) | i811) << 1) - (~(-i811))) - 1;
                int i96 = i95 % 128;
                f55698f = i96;
                int i97 = i95 % 2;
                int i98 = ((i96 & 86) + (i96 | 86)) - 1;
                f55699g = i98 % 128;
                int i99 = i98 % 2;
                z10 = true;
            } else {
                int i812 = f55698f + 21;
                f55699g = i812 % 128;
                int i813 = i812 % 2;
                z10 = false;
            }
        } else {
            int i814 = f55698f + 21;
            f55699g = i814 % 128;
            int i815 = i814 % 2;
            z10 = false;
        }
        if (!z10) {
            SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
            StringBuilder sb3 = new StringBuilder("Value in tag '");
            setScrollContainer setscrollcontainer3 = (setScrollContainer) setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            sb3.append((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3)));
            sb3.append("' is invalid for kernel ID: ");
            sb3.append((String) getPinPadLandscape.setY(new Object[]{Byte.valueOf(terminal.setY())}, 1862949367, -1862949363, (int) System.currentTimeMillis()));
            SouthPacificEndpoint.setX(new Object[]{sb3.toString()}, -1475632754, 1475632759, (int) System.currentTimeMillis());
            int i100 = f55698f;
            int i101 = i100 & 45;
            int i102 = (i100 ^ 45) | i101;
            int i103 = ((i101 | i102) << 1) - (i102 ^ i101);
            f55699g = i103 % 128;
            int i104 = i103 % 2;
        }
        int i105 = f55698f;
        int i106 = (i105 ^ 7) + ((i105 & 7) << 1);
        f55699g = i106 % 128;
        int i107 = i106 % 2;
        return Boolean.valueOf(z10);
    }

    public static /* synthetic */ Pair setCompoundDrawableTintBlendMode(getBeepOnFailure getbeeponfailure) {
        return (Pair) setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1674109266, 1674109269, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:116:0x04dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x04dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x04dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0450 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0450 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0361  */
    /* JADX WARN: Code duplicated, block: B:45:0x0364  */
    /* JADX WARN: Code duplicated, block: B:46:0x0394  */
    /* JADX WARN: Code duplicated, block: B:49:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x040d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0427  */
    /* JADX WARN: Code duplicated, block: B:59:0x043e  */
    /* JADX WARN: Code duplicated, block: B:64:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:66:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:68:0x0544  */
    /* JADX WARN: Code duplicated, block: B:70:0x056d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0617  */
    /* JADX WARN: Code duplicated, block: B:73:0x061a  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object objValueOf;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iIntValue;
        int i19;
        int i20;
        int i21;
        List<Terminal> list;
        boolean zBooleanValue;
        int i22;
        int i23 = (i11 * (-755)) + (i10 * (-755));
        int i24 = ~((~i10) | (~i11));
        int i25 = i10 | i11;
        int i26 = 0;
        switch (((i25 | (~i12)) * 756) + (((~(i25 | i12)) | i24) * (-756)) + (i24 * 1512) + i23) {
            case 1:
                return f(objArr);
            case 2:
                return g(objArr);
            case 3:
                int i27 = f55698f;
                int i28 = ((i27 ^ 77) | (i27 & 77)) << 1;
                int i29 = -(((~i27) & 77) | (i27 & (-78)));
                int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                f55699g = i30 % 128;
                int i31 = i30 % 2;
                Pair pair = (Pair) setOnFocusChangeListener(new Object[0], 934324872, -934324865, (int) System.currentTimeMillis());
                int i32 = f55698f + 35;
                f55699g = i32 % 128;
                int i33 = i32 % 2;
                return pair;
            case 4:
                return p(objArr);
            case 5:
                o(objArr);
                return null;
            case 6:
                k(objArr);
                return null;
            case 7:
                return c();
            case 8:
                j(objArr);
                return null;
            case 9:
                i(objArr);
                return null;
            case 10:
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
                int i34 = f55699g;
                int i35 = i34 & 19;
                int i36 = -(-((i34 ^ 19) | i35));
                int i37 = (i35 & i36) + (i35 | i36);
                f55698f = i37 % 128;
                int i38 = i37 % 2;
                List<? extends setTextSize> list2 = getbeeponfailure.f55702c;
                int i39 = i34 & 41;
                int i40 = i39 + ((i34 ^ 41) | i39);
                f55698f = i40 % 128;
                int i41 = i40 % 2;
                return list2;
            case 11:
                m(objArr);
                return null;
            case 12:
                return q(objArr);
            case 13:
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[0];
                int i42 = f55699g;
                int i43 = i42 & 21;
                int i44 = ((i42 ^ 21) | i43) << 1;
                int i45 = -((~i43) & (i42 | 21));
                int i46 = (i44 & i45) + (i44 | i45);
                f55698f = i46 % 128;
                int i47 = i46 % 2;
                objValueOf = getbeeponfailure2.f55703d;
                int i48 = i42 + 111;
                f55698f = i48 % 128;
                if (i48 % 2 != 0) {
                    throw null;
                }
                return objValueOf;
            case 14:
                h(objArr);
                return null;
            case 15:
                getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) objArr[0];
                List<? extends setTextSize> list3 = (List) objArr[1];
                int i49 = f55699g;
                int i50 = i49 & 111;
                int i51 = -(-((i49 ^ 111) | i50));
                int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
                f55698f = i52 % 128;
                int i53 = i52 % 2;
                getbeeponfailure3.f55702c = list3;
                int i54 = i49 + 43;
                f55698f = i54 % 128;
                int i55 = i54 % 2;
                return null;
            case 16:
                return n(objArr);
            case 17:
                getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) objArr[0];
                String str = (String) objArr[1];
                int i56 = f55698f;
                int i57 = (i56 ^ 41) + ((i56 & 41) << 1);
                f55699g = i57 % 128;
                int i58 = i57 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                setMaxWidth setmaxwidth = getbeeponfailure4.f55703d;
                boolean zBooleanValue2 = ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, str}, 1248486622, -1248486599, System.identityHashCode(setmaxwidth))).booleanValue();
                int i59 = f55699g;
                int i60 = i59 ^ 51;
                int i61 = ((i59 & 51) | i60) << 1;
                int i62 = -i60;
                int i63 = (i61 ^ i62) + ((i61 & i62) << 1);
                f55698f = i63 % 128;
                int i64 = i63 % 2;
                return Boolean.valueOf(zBooleanValue2);
            case 18:
                a(objArr);
                return null;
            case 19:
                l(objArr);
                return null;
            case 20:
                return d(objArr);
            case 21:
                return b(objArr);
            case 22:
                getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int i65 = f55698f + 41;
                f55699g = i65 % 128;
                int i66 = i65 % 2;
                Intrinsics.checkNotNullParameter(bArr, "");
                setImageTintList setimagetintlist = (setImageTintList) setOnFocusChangeListener(new Object[]{getbeeponfailure5}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure5));
                setImageTintList.setX(new Object[]{setimagetintlist, bArr}, -1398236510, 1398236511, System.identityHashCode(setimagetintlist));
                int i67 = f55699g;
                int i68 = (((i67 | 100) << 1) - (i67 ^ 100)) - 1;
                f55698f = i68 % 128;
                int i69 = i68 % 2;
                return null;
            case 23:
                return e(objArr);
            case 24:
                getBeepOnFailure getbeeponfailure6 = (getBeepOnFailure) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i70 = f55698f;
                int i71 = (i70 ^ 51) + ((i70 & 51) << 1);
                int i72 = i71 % 128;
                f55699g = i72;
                if (i71 % 2 != 0) {
                    if (bArr2 != null) {
                        if (bArr2.length == 0) {
                            int i73 = ((i72 | 35) << 1) - (i72 ^ 35);
                            f55698f = i73 % 128;
                            int i74 = i73 % 2;
                            int i75 = (i72 & (-120)) | ((~i72) & 119);
                            int i76 = -(-((i72 & 119) << 1));
                            int i77 = (i75 ^ i76) + ((i75 & i76) << 1);
                            f55698f = i77 % 128;
                            int i78 = i77 % 2;
                            int i79 = i72 & 101;
                            int i80 = (i72 ^ 101) | i79;
                            int i81 = (i79 ^ i80) + ((i79 & i80) << 1);
                            f55698f = i81 % 128;
                            int i82 = i81 % 2;
                        } else {
                            int i83 = i72 & 17;
                            int i84 = (i72 ^ 17) | i83;
                            int i85 = (i83 & i84) + (i83 | i84);
                            int i86 = i85 % 128;
                            f55698f = i86;
                            int i87 = i85 % 2;
                            int i88 = ((i86 | 87) << 1) - (i86 ^ 87);
                            int i89 = i88 % 128;
                            f55699g = i89;
                            int i90 = i88 % 2;
                            int i91 = i89 ^ 19;
                            int i92 = ((i89 & 19) | i91) << 1;
                            int i93 = -i91;
                            int i94 = (i92 & i93) + (i92 | i93);
                            int i95 = i94 % 128;
                            f55698f = i95;
                            int i96 = i94 % 2;
                            int i97 = (i95 ^ 99) + ((i95 & 99) << 1);
                            f55699g = i97 % 128;
                            int i98 = i97 % 2;
                            int i99 = ((i95 ^ 83) | (i95 & 83)) << 1;
                            int i100 = -(((~i95) & 83) | (i95 & (-84)));
                            int i101 = ((i99 | i100) << 1) - (i100 ^ i99);
                            f55699g = i101 % 128;
                            int i102 = i101 % 2;
                            i13 = ~iIntValue2;
                            i14 = iIntValue2;
                            while (i14 < bArr2.length) {
                                i20 = f55699g;
                                int i103 = i20 + 15;
                                f55698f = i103 % 128;
                                int i104 = i103 % 2;
                                if (bArr2[i14] != 0) {
                                    int i105 = i20 ^ 51;
                                    int i106 = ((i20 & 51) | i105) << 1;
                                    int i107 = -i105;
                                    int i108 = ((i106 | i107) << 1) - (i106 ^ i107);
                                    f55698f = i108 % 128;
                                    i21 = i108 % 2;
                                    list = f55697e;
                                    if (i21 != 0) {
                                        setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                                        int i109 = 53 / i26;
                                        if (!(!list.contains((Terminal) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[i26], -397700939, 397700950, (int) System.currentTimeMillis())))) {
                                            int i110 = f55699g;
                                            int i111 = i110 & 41;
                                            int i112 = i111 + ((i110 ^ 41) | i111);
                                            f55698f = i112 % 128;
                                            int i113 = i112 % 2;
                                            if (bArr2[i14] == -1) {
                                            }
                                        }
                                    } else {
                                        setOnGenericMotionListener setongenericmotionlistener2 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                                        if (!list.contains((Terminal) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[i26], -397700939, 397700950, (int) System.currentTimeMillis()))) {
                                            int i114 = f55699g;
                                            int i115 = i114 & 41;
                                            int i116 = i115 + ((i114 ^ 41) | i115);
                                            f55698f = i116 % 128;
                                            int i117 = i116 % 2;
                                            if (bArr2[i14] == -1) {
                                            }
                                        }
                                    }
                                    if (i14 < bArr2.length) {
                                        int i118 = f55699g;
                                        int i119 = i118 & 55;
                                        int i120 = -(-((i118 ^ 55) | i119));
                                        i19 = ((i119 | i120) << 1) - (i120 ^ i119);
                                        f55698f = i19 % 128;
                                        if (i19 % 2 == 0) {
                                            ((Integer) setOnFocusChangeListener(new Object[]{getbeeponfailure6, bArr2, Integer.valueOf(i14)}, 2026751476, -2026751475, i14)).intValue();
                                            setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 1947815615, -1947815609, System.identityHashCode(getbeeponfailure6));
                                            throw null;
                                        }
                                        iIntValue = ((Integer) setOnFocusChangeListener(new Object[]{getbeeponfailure6, bArr2, Integer.valueOf(i14)}, 2026751476, -2026751475, i14)).intValue();
                                        setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 1947815615, -1947815609, System.identityHashCode(getbeeponfailure6));
                                        int i121 = f55698f;
                                        int i122 = i121 & 105;
                                        int i123 = (i122 - (~((i121 ^ 105) | i122))) - 1;
                                        f55699g = i123 % 128;
                                        int i124 = i123 % 2;
                                        int i125 = ((i121 | 61) << 1) - (i121 ^ 61);
                                        f55699g = i125 % 128;
                                        int i126 = i125 % 2;
                                    } else {
                                        int i127 = 92878084 ^ iIntValue2;
                                        int i128 = 92878084 & iIntValue2;
                                        int i129 = ~((i127 & i128) | (i127 ^ i128));
                                        int i130 = (-53205579) & i129;
                                        int i131 = (i129 | (-53205579)) & (~i130);
                                        int i132 = (((i131 & i130) | (i131 ^ i130)) * (-964)) + 869596165;
                                        int i133 = 92878084 ^ i13;
                                        int i134 = 92878084 & i13;
                                        int i135 = ~((i134 & i133) | (i133 ^ i134));
                                        int i136 = -(-(((i135 & (-128712527)) | (i135 ^ (-128712527))) * (-964)));
                                        int i137 = i132 & i136;
                                        int i138 = (i136 ^ i132) | i137;
                                        i15 = (i137 ^ i138) + ((i138 & i137) << 1);
                                        int i139 = 1523152905 & iIntValue2;
                                        int i140 = (~i139) & (1523152905 | iIntValue2);
                                        int i141 = (i140 & i139) | (i140 ^ i139);
                                        int i142 = (i141 & 1798880938) | ((~i141) & (-1798880939));
                                        int i143 = i141 & (-1798880939);
                                        int i144 = ((i143 & i142) | (i142 ^ i143)) * (-627);
                                        int i145 = ((((~i144) & (-1116852452)) | (1116852451 & i144)) - (~(-(-((i144 & (-1116852452)) << 1))))) - 1;
                                        int i146 = (-1523152906) & i13;
                                        int i147 = i139 | i146;
                                        int i148 = (-1523152906) & iIntValue2;
                                        int i149 = ~((i147 & i148) | (i147 ^ i148));
                                        int i150 = 1798880938 ^ i149;
                                        int i151 = i149 & 1798880938;
                                        int i152 = -(~(-(-(((i151 & i150) | (i150 ^ i151)) * (-627)))));
                                        i16 = (-2) - ((-1) ^ ((i145 & i152) + (i152 | i145)));
                                        int i153 = ((~i13) & 1523152905) | i146;
                                        int i154 = 1523152905 & i13;
                                        i17 = ~((i154 & i153) | (i153 ^ i154));
                                        int i155 = (i13 & 1798880938) | (iIntValue2 & (-1798880939));
                                        int i156 = iIntValue2 & 1798880938;
                                        i18 = ~((i156 & i155) | (i155 ^ i156));
                                        if (i15 > (i16 - (~(((i17 & i18) | (i17 ^ i18)) * 627))) - 1) {
                                            throw null;
                                        }
                                        iIntValue = 0;
                                    }
                                    objValueOf = Integer.valueOf(iIntValue);
                                }
                                int i157 = i14 * (-622);
                                int i158 = 624 & i157;
                                int i159 = (((i157 | 624) & (~i158)) - (~(-(-(i158 << 1))))) - 1;
                                int i160 = ~i14;
                                int i161 = i160 ^ 1;
                                int i162 = i160 & 1;
                                int i163 = (i161 & i162) | (i161 ^ i162);
                                int i164 = i163 ^ iIntValue2;
                                int i165 = i163 & iIntValue2;
                                int i166 = -(-((~((i165 & i164) | (i164 ^ i165))) * 623));
                                int i167 = i159 & i166;
                                int i168 = (i159 ^ i166) | i167;
                                int i169 = (i167 & i168) + (i168 | i167);
                                int i170 = ~((-2) | i14);
                                int i171 = -(-(((i170 & i13) | (i13 ^ i170)) * (-623)));
                                int i172 = i169 & i171;
                                int i173 = (((i169 ^ i171) | i172) << 1) - ((i171 | i169) & (~i172));
                                int i174 = (i160 | i14) & i160;
                                int i175 = (i174 & 1) | (i174 ^ 1);
                                int i176 = ~i175;
                                int i177 = (i175 | i176) & i176;
                                int i178 = i160 & iIntValue2;
                                int i179 = (i160 | iIntValue2) & (~i178);
                                int i180 = ~((i179 & i178) | (i179 ^ i178));
                                int i181 = ((~i180) & i177) | ((~i177) & i180);
                                int i182 = i177 & i180;
                                int i183 = (i182 & i181) | (i181 ^ i182);
                                int i184 = (i13 & 1) | (iIntValue2 & (-2));
                                int i185 = iIntValue2 & 1;
                                int i186 = ~((i184 & i185) | (i184 ^ i185));
                                int i187 = -(-(((i183 & i186) | (i183 ^ i186)) * 623));
                                int i188 = ((~i187) & i173) | ((~i173) & i187);
                                int i189 = (i187 & i173) << 1;
                                i14 = ((i188 | i189) << 1) - (i189 ^ i188);
                                int i190 = f55699g + 31;
                                f55698f = i190 % 128;
                                int i191 = i190 % 2;
                                i26 = 0;
                            }
                            if (i14 < bArr2.length) {
                                int i1110 = f55699g;
                                int i1111 = i1110 & 55;
                                int i1210 = -(-((i1110 ^ 55) | i1111));
                                i19 = ((i1111 | i1210) << 1) - (i1210 ^ i1111);
                                f55698f = i19 % 128;
                                if (i19 % 2 == 0) {
                                    ((Integer) setOnFocusChangeListener(new Object[]{getbeeponfailure6, bArr2, Integer.valueOf(i14)}, 2026751476, -2026751475, i14)).intValue();
                                    setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 1947815615, -1947815609, System.identityHashCode(getbeeponfailure6));
                                    throw null;
                                }
                                iIntValue = ((Integer) setOnFocusChangeListener(new Object[]{getbeeponfailure6, bArr2, Integer.valueOf(i14)}, 2026751476, -2026751475, i14)).intValue();
                                setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 1947815615, -1947815609, System.identityHashCode(getbeeponfailure6));
                                int i1211 = f55698f;
                                int i1212 = i1211 & 105;
                                int i1213 = (i1212 - (~((i1211 ^ 105) | i1212))) - 1;
                                f55699g = i1213 % 128;
                                int i1214 = i1213 % 2;
                                int i1215 = ((i1211 | 61) << 1) - (i1211 ^ 61);
                                f55699g = i1215 % 128;
                                int i1216 = i1215 % 2;
                            } else {
                                int i1217 = 92878084 ^ iIntValue2;
                                int i1218 = 92878084 & iIntValue2;
                                int i1219 = ~((i1217 & i1218) | (i1217 ^ i1218));
                                int i1310 = (-53205579) & i1219;
                                int i1311 = (i1219 | (-53205579)) & (~i1310);
                                int i1312 = (((i1311 & i1310) | (i1311 ^ i1310)) * (-964)) + 869596165;
                                int i1313 = 92878084 ^ i13;
                                int i1314 = 92878084 & i13;
                                int i1315 = ~((i1314 & i1313) | (i1313 ^ i1314));
                                int i1316 = -(-(((i1315 & (-128712527)) | (i1315 ^ (-128712527))) * (-964)));
                                int i1317 = i1312 & i1316;
                                int i1318 = (i1316 ^ i1312) | i1317;
                                i15 = (i1317 ^ i1318) + ((i1318 & i1317) << 1);
                                int i1319 = 1523152905 & iIntValue2;
                                int i1410 = (~i1319) & (1523152905 | iIntValue2);
                                int i1411 = (i1410 & i1319) | (i1410 ^ i1319);
                                int i1412 = (i1411 & 1798880938) | ((~i1411) & (-1798880939));
                                int i1413 = i1411 & (-1798880939);
                                int i1414 = ((i1413 & i1412) | (i1412 ^ i1413)) * (-627);
                                int i1415 = ((((~i1414) & (-1116852452)) | (1116852451 & i1414)) - (~(-(-((i1414 & (-1116852452)) << 1))))) - 1;
                                int i1416 = (-1523152906) & i13;
                                int i1417 = i1319 | i1416;
                                int i1418 = (-1523152906) & iIntValue2;
                                int i1419 = ~((i1417 & i1418) | (i1417 ^ i1418));
                                int i1510 = 1798880938 ^ i1419;
                                int i1511 = i1419 & 1798880938;
                                int i1512 = -(~(-(-(((i1511 & i1510) | (i1510 ^ i1511)) * (-627)))));
                                i16 = (-2) - ((-1) ^ ((i1415 & i1512) + (i1512 | i1415)));
                                int i1513 = ((~i13) & 1523152905) | i1416;
                                int i1514 = 1523152905 & i13;
                                i17 = ~((i1514 & i1513) | (i1513 ^ i1514));
                                int i1515 = (i13 & 1798880938) | (iIntValue2 & (-1798880939));
                                int i1516 = iIntValue2 & 1798880938;
                                i18 = ~((i1516 & i1515) | (i1515 ^ i1516));
                                if (i15 > (i16 - (~(((i17 & i18) | (i17 ^ i18)) * 627))) - 1) {
                                    throw null;
                                }
                                iIntValue = 0;
                            }
                            objValueOf = Integer.valueOf(iIntValue);
                        }
                    }
                    return objValueOf;
                }
                int i192 = 38 / 0;
                if (bArr2 != null) {
                    if (bArr2.length == 0) {
                        int i710 = ((i72 | 35) << 1) - (i72 ^ 35);
                        f55698f = i710 % 128;
                        int i711 = i710 % 2;
                        int i712 = (i72 & (-120)) | ((~i72) & 119);
                        int i713 = -(-((i72 & 119) << 1));
                        int i714 = (i712 ^ i713) + ((i712 & i713) << 1);
                        f55698f = i714 % 128;
                        int i715 = i714 % 2;
                        int i716 = i72 & 101;
                        int i810 = (i72 ^ 101) | i716;
                        int i811 = (i716 ^ i810) + ((i716 & i810) << 1);
                        f55698f = i811 % 128;
                        int i812 = i811 % 2;
                    } else {
                        int i813 = i72 & 17;
                        int i814 = (i72 ^ 17) | i813;
                        int i815 = (i813 & i814) + (i813 | i814);
                        int i816 = i815 % 128;
                        f55698f = i816;
                        int i817 = i815 % 2;
                        int i818 = ((i816 | 87) << 1) - (i816 ^ 87);
                        int i819 = i818 % 128;
                        f55699g = i819;
                        int i910 = i818 % 2;
                        int i911 = i819 ^ 19;
                        int i912 = ((i819 & 19) | i911) << 1;
                        int i913 = -i911;
                        int i914 = (i912 & i913) + (i912 | i913);
                        int i915 = i914 % 128;
                        f55698f = i915;
                        int i916 = i914 % 2;
                        int i917 = (i915 ^ 99) + ((i915 & 99) << 1);
                        f55699g = i917 % 128;
                        int i918 = i917 % 2;
                        int i919 = ((i915 ^ 83) | (i915 & 83)) << 1;
                        int i1010 = -(((~i915) & 83) | (i915 & (-84)));
                        int i1011 = ((i919 | i1010) << 1) - (i1010 ^ i919);
                        f55699g = i1011 % 128;
                        int i1012 = i1011 % 2;
                        i13 = ~iIntValue2;
                        i14 = iIntValue2;
                        while (i14 < bArr2.length) {
                            i20 = f55699g;
                            int i1013 = i20 + 15;
                            f55698f = i1013 % 128;
                            int i1014 = i1013 % 2;
                            if (bArr2[i14] != 0) {
                                int i1015 = i20 ^ 51;
                                int i1016 = ((i20 & 51) | i1015) << 1;
                                int i1017 = -i1015;
                                int i1018 = ((i1016 | i1017) << 1) - (i1016 ^ i1017);
                                f55698f = i1018 % 128;
                                i21 = i1018 % 2;
                                list = f55697e;
                                if (i21 != 0) {
                                    setOnGenericMotionListener setongenericmotionlistener3 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                                    int i1019 = 53 / i26;
                                    if (!(!list.contains((Terminal) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[i26], -397700939, 397700950, (int) System.currentTimeMillis())))) {
                                        int i1112 = f55699g;
                                        int i1113 = i1112 & 41;
                                        int i1114 = i1113 + ((i1112 ^ 41) | i1113);
                                        f55698f = i1114 % 128;
                                        int i1115 = i1114 % 2;
                                        if (bArr2[i14] == -1) {
                                        }
                                    }
                                } else {
                                    setOnGenericMotionListener setongenericmotionlistener4 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                                    if (!list.contains((Terminal) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[i26], -397700939, 397700950, (int) System.currentTimeMillis()))) {
                                        int i1116 = f55699g;
                                        int i1117 = i1116 & 41;
                                        int i1118 = i1117 + ((i1116 ^ 41) | i1117);
                                        f55698f = i1118 % 128;
                                        int i1119 = i1118 % 2;
                                        if (bArr2[i14] == -1) {
                                        }
                                    }
                                }
                                if (i14 < bArr2.length) {
                                    int i11110 = f55699g;
                                    int i11111 = i11110 & 55;
                                    int i12110 = -(-((i11110 ^ 55) | i11111));
                                    i19 = ((i11111 | i12110) << 1) - (i12110 ^ i11111);
                                    f55698f = i19 % 128;
                                    if (i19 % 2 == 0) {
                                        ((Integer) setOnFocusChangeListener(new Object[]{getbeeponfailure6, bArr2, Integer.valueOf(i14)}, 2026751476, -2026751475, i14)).intValue();
                                        setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 1947815615, -1947815609, System.identityHashCode(getbeeponfailure6));
                                        throw null;
                                    }
                                    iIntValue = ((Integer) setOnFocusChangeListener(new Object[]{getbeeponfailure6, bArr2, Integer.valueOf(i14)}, 2026751476, -2026751475, i14)).intValue();
                                    setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 1947815615, -1947815609, System.identityHashCode(getbeeponfailure6));
                                    int i12111 = f55698f;
                                    int i12112 = i12111 & 105;
                                    int i12113 = (i12112 - (~((i12111 ^ 105) | i12112))) - 1;
                                    f55699g = i12113 % 128;
                                    int i12114 = i12113 % 2;
                                    int i12115 = ((i12111 | 61) << 1) - (i12111 ^ 61);
                                    f55699g = i12115 % 128;
                                    int i12116 = i12115 % 2;
                                } else {
                                    int i12117 = 92878084 ^ iIntValue2;
                                    int i12118 = 92878084 & iIntValue2;
                                    int i12119 = ~((i12117 & i12118) | (i12117 ^ i12118));
                                    int i13110 = (-53205579) & i12119;
                                    int i13111 = (i12119 | (-53205579)) & (~i13110);
                                    int i13112 = (((i13111 & i13110) | (i13111 ^ i13110)) * (-964)) + 869596165;
                                    int i13113 = 92878084 ^ i13;
                                    int i13114 = 92878084 & i13;
                                    int i13115 = ~((i13114 & i13113) | (i13113 ^ i13114));
                                    int i13116 = -(-(((i13115 & (-128712527)) | (i13115 ^ (-128712527))) * (-964)));
                                    int i13117 = i13112 & i13116;
                                    int i13118 = (i13116 ^ i13112) | i13117;
                                    i15 = (i13117 ^ i13118) + ((i13118 & i13117) << 1);
                                    int i13119 = 1523152905 & iIntValue2;
                                    int i14110 = (~i13119) & (1523152905 | iIntValue2);
                                    int i14111 = (i14110 & i13119) | (i14110 ^ i13119);
                                    int i14112 = (i14111 & 1798880938) | ((~i14111) & (-1798880939));
                                    int i14113 = i14111 & (-1798880939);
                                    int i14114 = ((i14113 & i14112) | (i14112 ^ i14113)) * (-627);
                                    int i14115 = ((((~i14114) & (-1116852452)) | (1116852451 & i14114)) - (~(-(-((i14114 & (-1116852452)) << 1))))) - 1;
                                    int i14116 = (-1523152906) & i13;
                                    int i14117 = i13119 | i14116;
                                    int i14118 = (-1523152906) & iIntValue2;
                                    int i14119 = ~((i14117 & i14118) | (i14117 ^ i14118));
                                    int i1517 = 1798880938 ^ i14119;
                                    int i1518 = i14119 & 1798880938;
                                    int i1519 = -(~(-(-(((i1518 & i1517) | (i1517 ^ i1518)) * (-627)))));
                                    i16 = (-2) - ((-1) ^ ((i14115 & i1519) + (i1519 | i14115)));
                                    int i15110 = ((~i13) & 1523152905) | i14116;
                                    int i15111 = 1523152905 & i13;
                                    i17 = ~((i15111 & i15110) | (i15110 ^ i15111));
                                    int i15112 = (i13 & 1798880938) | (iIntValue2 & (-1798880939));
                                    int i15113 = iIntValue2 & 1798880938;
                                    i18 = ~((i15113 & i15112) | (i15112 ^ i15113));
                                    if (i15 > (i16 - (~(((i17 & i18) | (i17 ^ i18)) * 627))) - 1) {
                                        throw null;
                                    }
                                    iIntValue = 0;
                                }
                                objValueOf = Integer.valueOf(iIntValue);
                            }
                            int i1520 = i14 * (-622);
                            int i1521 = 624 & i1520;
                            int i1522 = (((i1520 | 624) & (~i1521)) - (~(-(-(i1521 << 1))))) - 1;
                            int i1610 = ~i14;
                            int i1611 = i1610 ^ 1;
                            int i1612 = i1610 & 1;
                            int i1613 = (i1611 & i1612) | (i1611 ^ i1612);
                            int i1614 = i1613 ^ iIntValue2;
                            int i1615 = i1613 & iIntValue2;
                            int i1616 = -(-((~((i1615 & i1614) | (i1614 ^ i1615))) * 623));
                            int i1617 = i1522 & i1616;
                            int i1618 = (i1522 ^ i1616) | i1617;
                            int i1619 = (i1617 & i1618) + (i1618 | i1617);
                            int i1710 = ~((-2) | i14);
                            int i1711 = -(-(((i1710 & i13) | (i13 ^ i1710)) * (-623)));
                            int i1712 = i1619 & i1711;
                            int i1713 = (((i1619 ^ i1711) | i1712) << 1) - ((i1711 | i1619) & (~i1712));
                            int i1714 = (i1610 | i14) & i1610;
                            int i1715 = (i1714 & 1) | (i1714 ^ 1);
                            int i1716 = ~i1715;
                            int i1717 = (i1715 | i1716) & i1716;
                            int i1718 = i1610 & iIntValue2;
                            int i1719 = (i1610 | iIntValue2) & (~i1718);
                            int i1810 = ~((i1719 & i1718) | (i1719 ^ i1718));
                            int i1811 = ((~i1810) & i1717) | ((~i1717) & i1810);
                            int i1812 = i1717 & i1810;
                            int i1813 = (i1812 & i1811) | (i1811 ^ i1812);
                            int i1814 = (i13 & 1) | (iIntValue2 & (-2));
                            int i1815 = iIntValue2 & 1;
                            int i1816 = ~((i1814 & i1815) | (i1814 ^ i1815));
                            int i1817 = -(-(((i1813 & i1816) | (i1813 ^ i1816)) * 623));
                            int i1818 = ((~i1817) & i1713) | ((~i1713) & i1817);
                            int i1819 = (i1817 & i1713) << 1;
                            i14 = ((i1818 | i1819) << 1) - (i1819 ^ i1818);
                            int i193 = f55699g + 31;
                            f55698f = i193 % 128;
                            int i194 = i193 % 2;
                            i26 = 0;
                        }
                        if (i14 < bArr2.length) {
                            int i11112 = f55699g;
                            int i11113 = i11112 & 55;
                            int i121110 = -(-((i11112 ^ 55) | i11113));
                            i19 = ((i11113 | i121110) << 1) - (i121110 ^ i11113);
                            f55698f = i19 % 128;
                            if (i19 % 2 == 0) {
                                ((Integer) setOnFocusChangeListener(new Object[]{getbeeponfailure6, bArr2, Integer.valueOf(i14)}, 2026751476, -2026751475, i14)).intValue();
                                setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 1947815615, -1947815609, System.identityHashCode(getbeeponfailure6));
                                throw null;
                            }
                            iIntValue = ((Integer) setOnFocusChangeListener(new Object[]{getbeeponfailure6, bArr2, Integer.valueOf(i14)}, 2026751476, -2026751475, i14)).intValue();
                            setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 1947815615, -1947815609, System.identityHashCode(getbeeponfailure6));
                            int i121111 = f55698f;
                            int i121112 = i121111 & 105;
                            int i121113 = (i121112 - (~((i121111 ^ 105) | i121112))) - 1;
                            f55699g = i121113 % 128;
                            int i121114 = i121113 % 2;
                            int i121115 = ((i121111 | 61) << 1) - (i121111 ^ 61);
                            f55699g = i121115 % 128;
                            int i121116 = i121115 % 2;
                        } else {
                            int i121117 = 92878084 ^ iIntValue2;
                            int i121118 = 92878084 & iIntValue2;
                            int i121119 = ~((i121117 & i121118) | (i121117 ^ i121118));
                            int i131110 = (-53205579) & i121119;
                            int i131111 = (i121119 | (-53205579)) & (~i131110);
                            int i131112 = (((i131111 & i131110) | (i131111 ^ i131110)) * (-964)) + 869596165;
                            int i131113 = 92878084 ^ i13;
                            int i131114 = 92878084 & i13;
                            int i131115 = ~((i131114 & i131113) | (i131113 ^ i131114));
                            int i131116 = -(-(((i131115 & (-128712527)) | (i131115 ^ (-128712527))) * (-964)));
                            int i131117 = i131112 & i131116;
                            int i131118 = (i131116 ^ i131112) | i131117;
                            i15 = (i131117 ^ i131118) + ((i131118 & i131117) << 1);
                            int i131119 = 1523152905 & iIntValue2;
                            int i141110 = (~i131119) & (1523152905 | iIntValue2);
                            int i141111 = (i141110 & i131119) | (i141110 ^ i131119);
                            int i141112 = (i141111 & 1798880938) | ((~i141111) & (-1798880939));
                            int i141113 = i141111 & (-1798880939);
                            int i141114 = ((i141113 & i141112) | (i141112 ^ i141113)) * (-627);
                            int i141115 = ((((~i141114) & (-1116852452)) | (1116852451 & i141114)) - (~(-(-((i141114 & (-1116852452)) << 1))))) - 1;
                            int i141116 = (-1523152906) & i13;
                            int i141117 = i131119 | i141116;
                            int i141118 = (-1523152906) & iIntValue2;
                            int i141119 = ~((i141117 & i141118) | (i141117 ^ i141118));
                            int i15114 = 1798880938 ^ i141119;
                            int i15115 = i141119 & 1798880938;
                            int i15116 = -(~(-(-(((i15115 & i15114) | (i15114 ^ i15115)) * (-627)))));
                            i16 = (-2) - ((-1) ^ ((i141115 & i15116) + (i15116 | i141115)));
                            int i15117 = ((~i13) & 1523152905) | i141116;
                            int i15118 = 1523152905 & i13;
                            i17 = ~((i15118 & i15117) | (i15117 ^ i15118));
                            int i15119 = (i13 & 1798880938) | (iIntValue2 & (-1798880939));
                            int i151110 = iIntValue2 & 1798880938;
                            i18 = ~((i151110 & i15119) | (i15119 ^ i151110));
                            if (i15 > (i16 - (~(((i17 & i18) | (i17 ^ i18)) * 627))) - 1) {
                                throw null;
                            }
                            iIntValue = 0;
                        }
                        objValueOf = Integer.valueOf(iIntValue);
                    }
                }
                return objValueOf;
                int i195 = i72 ^ 119;
                int i196 = ((i72 & 119) | i195) << 1;
                int i197 = -i195;
                int i198 = (i196 & i197) + (i197 | i196);
                int i199 = i198 % 128;
                f55698f = i199;
                int i200 = i198 % 2;
                int i201 = (i199 & (-2)) | ((~i199) & 1);
                int i202 = (i199 & 1) << 1;
                int i203 = ((i201 | i202) << 1) - (i202 ^ i201);
                f55699g = i203 % 128;
                objValueOf = Integer.valueOf(i203 % 2 == 0 ? 1 : 0);
                return objValueOf;
            case 25:
                getBeepOnFailure getbeeponfailure7 = (getBeepOnFailure) objArr[0];
                int i204 = f55699g;
                int i205 = (((i204 | 8) << 1) - (i204 ^ 8)) - 1;
                f55698f = i205 % 128;
                if (i205 % 2 != 0) {
                    setImageTintList setimagetintlist2 = (setImageTintList) setOnFocusChangeListener(new Object[]{getbeeponfailure7}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure7));
                    zBooleanValue = ((Boolean) setImageTintList.setX(new Object[]{setimagetintlist2}, -941568259, 941568266, System.identityHashCode(setimagetintlist2))).booleanValue();
                    int i206 = 52 / 0;
                } else {
                    setImageTintList setimagetintlist3 = (setImageTintList) setOnFocusChangeListener(new Object[]{getbeeponfailure7}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure7));
                    zBooleanValue = ((Boolean) setImageTintList.setX(new Object[]{setimagetintlist3}, -941568259, 941568266, System.identityHashCode(setimagetintlist3))).booleanValue();
                }
                int i207 = f55699g;
                int i208 = ((i207 & 98) + (i207 | 98)) - 1;
                f55698f = i208 % 128;
                int i209 = i208 % 2;
                return Boolean.valueOf(zBooleanValue);
            case 26:
                getBeepOnFailure getbeeponfailure8 = (getBeepOnFailure) objArr[0];
                int i210 = f55699g + 29;
                f55698f = i210 % 128;
                int i211 = i210 % 2;
                setImageTintList setimagetintlist4 = (setImageTintList) setOnFocusChangeListener(new Object[]{getbeeponfailure8}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure8));
                boolean zBooleanValue3 = ((Boolean) setImageTintList.setX(new Object[]{setimagetintlist4}, -146487729, 146487733, System.identityHashCode(setimagetintlist4))).booleanValue();
                int i212 = f55698f;
                int i213 = (i212 & 23) + (i212 | 23);
                f55699g = i213 % 128;
                int i214 = i213 % 2;
                return Boolean.valueOf(zBooleanValue3);
            case 27:
                getBeepOnFailure getbeeponfailure9 = (getBeepOnFailure) objArr[0];
                int i215 = f55698f + 93;
                f55699g = i215 % 128;
                if (i215 % 2 == 0) {
                    setRemoteViewsAdapter.setX(new Object[]{(byte[]) setOnFocusChangeListener(new Object[]{getbeeponfailure9}, 252497730, -252497710, System.identityHashCode(getbeeponfailure9))}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                    ((List) setOnFocusChangeListener(new Object[]{getbeeponfailure9}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure9))).iterator();
                    throw null;
                }
                setRemoteViewsAdapter.setX(new Object[]{(byte[]) setOnFocusChangeListener(new Object[]{getbeeponfailure9}, 252497730, -252497710, System.identityHashCode(getbeeponfailure9))}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                int i216 = f55699g;
                int i217 = i216 ^ 1;
                int i218 = (((i216 & 1) | i217) << 1) - i217;
                f55698f = i218 % 128;
                int i219 = i218 % 2;
                for (getBeepOnFailure getbeeponfailure10 : (List) setOnFocusChangeListener(new Object[]{getbeeponfailure9}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure9))) {
                    int i220 = f55698f;
                    int i221 = i220 ^ 53;
                    int i222 = ((((i220 & 53) | i221) << 1) - (~(-i221))) - 1;
                    f55699g = i222 % 128;
                    int i223 = i222 % 2;
                    setOnFocusChangeListener(new Object[]{getbeeponfailure10}, 1006797251, -1006797224, System.identityHashCode(getbeeponfailure10));
                    int i224 = f55699g;
                    int i225 = ((i224 ^ 59) | (i224 & 59)) << 1;
                    int i226 = -(((~i224) & 59) | (i224 & (-60)));
                    int i227 = (i225 ^ i226) + ((i226 & i225) << 1);
                    f55698f = i227 % 128;
                    int i228 = i227 % 2;
                }
                int i229 = f55699g;
                int i230 = (i229 & 105) + (i229 | 105);
                f55698f = i230 % 128;
                int i231 = i230 % 2;
                return null;
            default:
                getBeepOnFailure getbeeponfailure11 = (getBeepOnFailure) objArr[0];
                ArrayList arrayList = new ArrayList();
                setScrollContainer setscrollcontainer = (setScrollContainer) setOnFocusChangeListener(new Object[]{getbeeponfailure11}, 865402441, -865402437, System.identityHashCode(getbeeponfailure11));
                arrayList.add((byte[]) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, 1634346618, -1634346618, System.identityHashCode(setscrollcontainer)));
                if (getbeeponfailure11.f55703d.size() > 0) {
                    setMaxWidth setmaxwidth2 = getbeeponfailure11.f55703d;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setmaxwidth2, 10));
                    Iterator<getBeepOnFailure> it = setmaxwidth2.iterator();
                    int i232 = f55698f;
                    int i233 = i232 ^ 35;
                    int i234 = -(-((i232 & 35) << 1));
                    int i235 = ((i233 | i234) << 1) - (i234 ^ i233);
                    f55699g = i235 % 128;
                    int i236 = i235 % 2;
                    int length = 0;
                    while (it.hasNext()) {
                        int i237 = f55698f;
                        int i238 = i237 & 121;
                        int i239 = ((((i237 ^ 121) | i238) << 1) - (~(-((i237 | 121) & (~i238))))) - 1;
                        f55699g = i239 % 128;
                        if (i239 % 2 == 0) {
                            getBeepOnFailure next = it.next();
                            byte[] bArr3 = (byte[]) setOnFocusChangeListener(new Object[]{next}, 243863605, -243863605, System.identityHashCode(next));
                            length <<= bArr3.length;
                            arrayList2.add(bArr3);
                        } else {
                            getBeepOnFailure next2 = it.next();
                            byte[] bArr4 = (byte[]) setOnFocusChangeListener(new Object[]{next2}, 243863605, -243863605, System.identityHashCode(next2));
                            length += bArr4.length;
                            arrayList2.add(bArr4);
                        }
                        int i240 = f55698f;
                        int i241 = i240 & 109;
                        int i242 = (((i240 | 109) & (~i241)) - (~(-(-(i241 << 1))))) - 1;
                        f55699g = i242 % 128;
                        int i243 = i242 % 2;
                    }
                    byte[] bArr5 = (byte[]) setInputExtras.setDividerPadding(new Object[]{arrayList2}, -822524174, 822524177, (int) System.currentTimeMillis());
                    setFocusable setfocusable = new setFocusable(length);
                    arrayList.add((byte[]) setFocusable.setOnFocusChangeListener(new Object[]{setfocusable}, 1803955216, -1803955212, System.identityHashCode(setfocusable)));
                    arrayList.add(bArr5);
                    int i244 = f55698f;
                    int i245 = i244 | 15;
                    int i246 = i245 << 1;
                    int i247 = -((~(i244 & 15)) & i245);
                    i22 = ((i246 | i247) << 1) - (i247 ^ i246);
                } else {
                    try {
                        arrayList.add(((setImageTintList) setOnFocusChangeListener(new Object[]{getbeeponfailure11}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure11))).setDividerPadding());
                        int i248 = f55698f;
                        i22 = (i248 ^ 119) + ((i248 & 119) << 1);
                    } catch (Exception e5) {
                        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                        SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Failed to serialize ", getbeeponfailure11)}, -1166612213, 1166612217, (int) System.currentTimeMillis());
                        throw e5;
                    }
                }
                f55699g = i22 % 128;
                int i249 = i22 % 2;
                byte[] bArr6 = (byte[]) setInputExtras.setDividerPadding(new Object[]{arrayList}, -822524174, 822524177, (int) System.currentTimeMillis());
                int i250 = f55699g;
                int i251 = (i250 & (-30)) | ((~i250) & 29);
                int i252 = (i250 & 29) << 1;
                int i253 = (i251 & i252) + (i252 | i251);
                f55698f = i253 % 128;
                int i254 = i253 % 2;
                return bArr6;
        }
    }

    public final boolean UiMessageCallbackKtWhenMappings() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -32940825, 32940851, System.identityHashCode(this))).booleanValue();
    }

    public final void getNavBarTitleString() throws Exception {
        setOnFocusChangeListener(new Object[]{this}, 1006797251, -1006797224, System.identityHashCode(this));
    }

    @Nullable
    public final getBeepOnFailure setDividerPadding(@NotNull TransactionFailed transactionFailed) {
        return (getBeepOnFailure) setOnFocusChangeListener(new Object[]{this, transactionFailed}, -990392770, 990392791, System.identityHashCode(this));
    }

    public final void setIncludeFontPadding() throws Exception {
        setOnFocusChangeListener(new Object[]{this}, 1947815615, -1947815609, System.identityHashCode(this));
    }

    @NotNull
    public getBeepOnFailure setNavigationOnClickListener() throws Exception {
        getBeepOnFailure getbeeponfailure = new getBeepOnFailure();
        ((Integer) setLeftTopRightBottom.setCompoundDrawableTintBlendMode(new Object[]{getbeeponfailure, (byte[]) setOnFocusChangeListener(new Object[]{this}, 243863605, -243863605, System.identityHashCode(this))}, -1162888331, 1162888331, (int) System.currentTimeMillis())).intValue();
        getbeeponfailure.f55702c = this.f55702c;
        int i10 = f55698f;
        int i11 = (i10 | 17) << 1;
        int i12 = -(((~i10) & 17) | (i10 & (-18)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f55699g = i13 % 128;
        int i14 = i13 % 2;
        return getbeeponfailure;
    }

    public final boolean setOnDragListener() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 610902136, -610902111, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final byte[] setOnLongClickListener() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 243863605, -243863605, System.identityHashCode(this));
    }

    public final void setTextAlignment() throws Exception {
        setOnFocusChangeListener(new Object[]{this}, 1679134524, -1679134515, System.identityHashCode(this));
    }

    @JvmName(name = "getUpdatePermissions")
    @Nullable
    public final List<setTextSize> setX() {
        return (List) setOnFocusChangeListener(new Object[]{this}, -1287464894, 1287464904, System.identityHashCode(this));
    }

    public final boolean setY(@NotNull String str) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, str}, 1551577786, -1551577784, System.identityHashCode(this))).booleanValue();
    }

    public final void setZ() throws Exception {
        setOnFocusChangeListener(new Object[]{this}, -838244475, 838244486, System.identityHashCode(this));
    }

    @NotNull
    public String toString() {
        int i10 = f55698f;
        int i11 = ((-1) << 1) - ((-1) ^ (((i10 | 64) << 1) - (i10 ^ 64)));
        f55699g = i11 % 128;
        int i12 = i11 % 2;
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i13 = f55699g + 115;
        f55698f = i13 % 128;
        if (i13 % 2 == 0) {
            return "";
        }
        throw null;
    }

    @JvmName(name = "getValue")
    @NotNull
    public final setImageTintList setCompoundDrawableTintBlendMode() throws Exception {
        return (setImageTintList) setOnFocusChangeListener(new Object[]{this}, 1115257939, -1115257923, System.identityHashCode(this));
    }

    @Nullable
    public final getBeepOnFailure setDividerPadding(@NotNull String str) {
        return (getBeepOnFailure) setOnFocusChangeListener(new Object[]{this, str}, 1895833701, -1895833678, System.identityHashCode(this));
    }

    public final boolean setY(@NotNull Terminal terminal, @NotNull setTextSize... settextsizeArr) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, terminal, settextsizeArr}, 1850304748, -1850304736, System.identityHashCode(this))).booleanValue();
    }

    public getBeepOnFailure(setScrollContainer setscrollcontainer, setImageTintList setimagetintlist, List<? extends setTextSize> list) throws Exception {
        this.f55703d = new setMaxWidth();
        setOnFocusChangeListener(new Object[]{this, setscrollcontainer}, 686576922, -686576903, System.identityHashCode(this));
        setOnFocusChangeListener(new Object[]{this, setimagetintlist}, -1015234117, 1015234131, System.identityHashCode(this));
        this.f55702c = list;
        setOnFocusChangeListener(new Object[]{this}, 1947815615, -1947815609, System.identityHashCode(this));
    }

    @JvmName(name = "setUpdatePermissions")
    public final void setDividerPadding(@Nullable List<? extends setTextSize> list) throws Exception {
        setOnFocusChangeListener(new Object[]{this, list}, 897972546, -897972531, System.identityHashCode(this));
    }

    @JvmName(name = "getChildrenList")
    @NotNull
    public final List<getBeepOnFailure> setY() {
        return (List) setOnFocusChangeListener(new Object[]{this}, -1797741519, 1797741532, System.identityHashCode(this));
    }

    @JvmName(name = "setValue")
    public final void setDividerPadding(@NotNull setImageTintList setimagetintlist) throws Exception {
        setOnFocusChangeListener(new Object[]{this, setimagetintlist}, -1015234117, 1015234131, System.identityHashCode(this));
    }

    @JvmName(name = "setTag")
    public final void setDividerPadding(@NotNull setScrollContainer setscrollcontainer) throws Exception {
        setOnFocusChangeListener(new Object[]{this, setscrollcontainer}, 686576922, -686576903, System.identityHashCode(this));
    }

    @JvmName(name = "getTag")
    @NotNull
    public final setScrollContainer setDividerPadding() throws Exception {
        return (setScrollContainer) setOnFocusChangeListener(new Object[]{this}, 865402441, -865402437, System.identityHashCode(this));
    }

    public getBeepOnFailure(String str, byte[] bArr, List list, Terminal terminal, DefaultConstructorMarker defaultConstructorMarker) {
        setScrollContainer setscrollcontainer = new setScrollContainer(str);
        setKeyListener setkeylistener = setKeyListener.INSTANCE;
        this(setscrollcontainer, new setImageTintList((setFindListener) setKeyListener.setDividerPadding(new Object[]{str, terminal}, -450333367, 450333367, (int) System.currentTimeMillis()), bArr), list);
    }

    public /* synthetic */ getBeepOnFailure(setScrollContainer setscrollcontainer, setImageTintList setimagetintlist, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(setscrollcontainer, setimagetintlist, list);
    }

    public final boolean setOnFocusChangeListener(@NotNull String str) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, str}, 256046810, -256046793, System.identityHashCode(this))).booleanValue();
    }

    public final void setOnFocusChangeListener(@NotNull getBeepOnFailure getbeeponfailure) throws Exception {
        setOnFocusChangeListener(new Object[]{this, getbeeponfailure}, 1215253814, -1215253809, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull Function1<? super getBeepOnFailure, Boolean> function1) throws Exception {
        setOnFocusChangeListener(new Object[]{this, function1}, -2036793125, 2036793133, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setLeftTopRightBottom
    public final int setOnFocusChangeListener(@Nullable byte[] bArr, int i10) throws Exception {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, bArr, Integer.valueOf(i10)}, 1325596026, -1325596002, i10)).intValue();
    }

    @JvmName(name = "setValueData")
    public final void setOnFocusChangeListener(@NotNull byte[] bArr) throws Exception {
        setOnFocusChangeListener(new Object[]{this, bArr}, 1851855986, -1851855964, System.identityHashCode(this));
    }

    @JvmName(name = "getValueData")
    @NotNull
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 252497730, -252497710, System.identityHashCode(this));
    }
}
