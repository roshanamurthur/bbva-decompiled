package com.mypinpad.tsdk.api.models;

import c2.b;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.esotericsoftware.asm.Opcodes;
import com.mypinpad.tsdk.isolation.tk;
import com.vierge.bluetoothlibrary.BluetoothState;
import fi.a;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001Bi\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\u0010\u001d\u001a\u00060\u0017j\u0002`\u0018\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010'\u001a\u00020\"\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020+\u0012\b\b\u0002\u00106\u001a\u000201\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u000107¢\u0006\u0004\b=\u0010>J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u001d\u001a\u00060\u0017j\u0002`\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0004R\u001a\u0010'\u001a\u00020\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010\u0004R \u00100\u001a\b\u0012\u0004\u0012\u00020\u00020+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00106\u001a\u0002018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010<\u001a\u0004\u0018\u0001078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;"}, d2 = {"Lcom/mypinpad/tsdk/api/models/TransactionParameters;", "", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", GenerateActivationFormCommand.HASH_CODE, "()I", "", "a", "J", "getAmount", "()J", PushConstants.AMOUNT, "b", "Ljava/lang/Long;", "getAmountOther", "()Ljava/lang/Long;", "amountOther", "Lcom/mypinpad/tsdk/api/models/Iso4217Currency;", "Lcom/mypinpad/tsdk/api/models/Currency;", "c", "Lcom/mypinpad/tsdk/api/models/Iso4217Currency;", "getCurrency", "()Lcom/mypinpad/tsdk/api/models/Iso4217Currency;", "currency", "d", "Ljava/lang/String;", "getDetails", ErrorBundle.DETAIL_ENTRY, "Lcom/mypinpad/tsdk/api/models/TransactionType;", "e", "Lcom/mypinpad/tsdk/api/models/TransactionType;", "getType", "()Lcom/mypinpad/tsdk/api/models/TransactionType;", "type", "f", "getRrn", "rrn", "", "g", "Ljava/util/List;", "getApplicationFilteringSelectors", "()Ljava/util/List;", "applicationFilteringSelectors", "", "h", "[B", "getMetadata", "()[B", "metadata", "Ljava/util/UUID;", "i", "Ljava/util/UUID;", "getGatewayId", "()Ljava/util/UUID;", "gatewayId", "<init>", "(JLjava/lang/Long;Lcom/mypinpad/tsdk/api/models/Iso4217Currency;Ljava/lang/String;Lcom/mypinpad/tsdk/api/models/TransactionType;Ljava/lang/String;Ljava/util/List;[BLjava/util/UUID;)V"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTerminalTransactionParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalTransactionParams.kt\ncom/mypinpad/tsdk/api/models/TransactionParameters\n+ 2 DebugFunctions.kt\ncom/mypinpad/tsdk/common/buildconstants/DebugFunctionsKt\n*L\n1#1,90:1\n30#2:91\n14#2:92\n*S KotlinDebug\n*F\n+ 1 TerminalTransactionParams.kt\ncom/mypinpad/tsdk/api/models/TransactionParameters\n*L\n46#1:91\n46#1:92\n*E\n"})
public final class TransactionParameters {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f51714j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f51715k = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long amountOther;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Iso4217Currency currency;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String details;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TransactionType type;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String rrn;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> applicationFilteringSelectors;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] metadata;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final UUID gatewayId;

    @JvmOverloads
    public TransactionParameters(long j10, @Nullable Long l6, @NotNull Iso4217Currency iso4217Currency, @Nullable String str, @NotNull TransactionType transactionType, @NotNull String str2, @NotNull List<String> list, @NotNull byte[] bArr, @Nullable UUID uuid) {
        Intrinsics.checkNotNullParameter(iso4217Currency, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.amount = j10;
        this.amountOther = l6;
        this.currency = iso4217Currency;
        this.details = str;
        this.type = transactionType;
        this.rrn = str2;
        this.applicationFilteringSelectors = list;
        this.metadata = bArr;
        this.gatewayId = uuid;
        tk.setY(str2);
        tk.setCompoundDrawableTintBlendMode(bArr);
    }

    public final boolean equals(@Nullable Object other) {
        Class<?> cls;
        int i10 = f51714j;
        int i11 = (i10 ^ 105) + ((i10 & 105) << 1);
        int i12 = i11 % 128;
        f51715k = i12;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            int i13 = i12 & 31;
            int i14 = ((((i12 ^ 31) | i13) << 1) - (~(-((~i13) & (i12 | 31))))) - 1;
            f51714j = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((i12 | 63) << 1) - (i12 ^ 63);
            f51714j = i16 % 128;
            int i17 = i16 % 2;
            return true;
        }
        if (other != null) {
            int i18 = i10 & 83;
            int i19 = i18 + ((i10 ^ 83) | i18);
            f51715k = i19 % 128;
            int i20 = i19 % 2;
            cls = other.getClass();
            int i21 = f51714j;
            int i22 = i21 ^ 31;
            int i23 = (((i21 & 31) | i22) << 1) - i22;
            f51715k = i23 % 128;
            int i24 = i23 % 2;
        } else {
            int i25 = i10 & 91;
            int i26 = (((i10 | 91) & (~i25)) - (~(-(-(i25 << 1))))) - 1;
            f51715k = i26 % 128;
            int i27 = i26 % 2;
            cls = null;
        }
        if (!Intrinsics.areEqual(TransactionParameters.class, cls)) {
            int i28 = f51714j;
            int i29 = (((i28 & (-64)) | ((~i28) & 63)) - (~(-(-((i28 & 63) << 1))))) - 1;
            f51715k = i29 % 128;
            int i30 = i29 % 2;
            int i31 = (i28 & (-98)) | ((~i28) & 97);
            int i32 = -(-((i28 & 97) << 1));
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            f51715k = i33 % 128;
            int i34 = i33 % 2;
            return false;
        }
        Intrinsics.checkNotNull(other, "");
        TransactionParameters transactionParameters = (TransactionParameters) other;
        if (this.amount != transactionParameters.amount) {
            int i35 = f51714j;
            int i36 = (((i35 ^ 21) | (i35 & 21)) << 1) - (((~i35) & 21) | (i35 & (-22)));
            int i37 = i36 % 128;
            f51715k = i37;
            int i38 = i36 % 2;
            int i39 = ((i37 & 120) + (i37 | 120)) - 1;
            f51714j = i39 % 128;
            int i40 = i39 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.amountOther, transactionParameters.amountOther)) {
            int i41 = f51715k;
            int i42 = i41 & 101;
            int i43 = i42 + ((i41 ^ 101) | i42);
            f51714j = i43 % 128;
            int i44 = i43 % 2;
            int i45 = ((i41 ^ 69) | (i41 & 69)) << 1;
            int i46 = -(((~i41) & 69) | (i41 & (-70)));
            int i47 = (i45 & i46) + (i46 | i45);
            f51714j = i47 % 128;
            if (i47 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.currency, transactionParameters.currency)) {
            int i48 = f51715k;
            int i49 = i48 + 1;
            f51714j = i49 % 128;
            int i50 = i49 % 2;
            int i51 = i48 & 21;
            int i52 = ((i48 | 21) & (~i51)) + (i51 << 1);
            f51714j = i52 % 128;
            if (i52 % 2 != 0) {
                int i53 = 97 / 0;
            }
            return false;
        }
        if (this.type != transactionParameters.type) {
            int i54 = f51714j;
            int i55 = i54 & 101;
            int i56 = i55 + ((i54 ^ 101) | i55);
            f51715k = i56 % 128;
            int i57 = i56 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.rrn, transactionParameters.rrn)) {
            int i58 = f51714j + 67;
            int i59 = i58 % 128;
            f51715k = i59;
            int i60 = i58 % 2;
            int i61 = ((i59 & (-58)) | ((~i59) & 57)) + ((i59 & 57) << 1);
            f51714j = i61 % 128;
            if (i61 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.applicationFilteringSelectors, transactionParameters.applicationFilteringSelectors)) {
            int i62 = f51715k;
            int i63 = ((((i62 ^ 67) | (i62 & 67)) << 1) - (~(-((67 & (~i62)) | (i62 & (-68)))))) - 1;
            f51714j = i63 % 128;
            boolean z10 = i63 % 2 != 0;
            int i64 = i62 ^ 19;
            int i65 = ((((i62 & 19) | i64) << 1) - (~(-i64))) - 1;
            f51714j = i65 % 128;
            if (i65 % 2 != 0) {
                int i66 = 96 / 0;
            }
            return z10;
        }
        if (!Arrays.equals(this.metadata, transactionParameters.metadata)) {
            int i67 = f51715k;
            int i68 = (i67 & 18) + (i67 | 18);
            int i69 = (i68 ^ (-1)) + (i68 << 1);
            f51714j = i69 % 128;
            int i70 = i69 % 2;
            int i71 = i67 & 29;
            int i72 = (((i67 | 29) & (~i71)) - (~(-(-(i71 << 1))))) - 1;
            f51714j = i72 % 128;
            int i73 = i72 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.gatewayId, transactionParameters.gatewayId)) {
            int i74 = f51714j;
            int i75 = ((i74 | 53) << 1) - (i74 ^ 53);
            f51715k = i75 % 128;
            int i76 = i75 % 2;
            return true;
        }
        int i77 = f51715k;
        int i78 = (i77 ^ 31) + ((i77 & 31) << 1);
        int i79 = i78 % 128;
        f51714j = i79;
        int i80 = i78 % 2;
        int i81 = i79 + 21;
        f51715k = i81 % 128;
        int i82 = i81 % 2;
        return false;
    }

    @JvmName(name = "getAmount")
    public final long getAmount() {
        int i10 = f51714j;
        int i11 = i10 + 103;
        f51715k = i11 % 128;
        int i12 = i11 % 2;
        int i13 = ((i10 | 83) << 1) - (i10 ^ 83);
        f51715k = i13 % 128;
        int i14 = i13 % 2;
        return this.amount;
    }

    @JvmName(name = "getAmountOther")
    @Nullable
    public final Long getAmountOther() {
        int i10 = f51714j;
        int i11 = (i10 ^ 1) + ((i10 & 1) << 1);
        int i12 = i11 % 128;
        f51715k = i12;
        int i13 = i11 % 2;
        int i14 = (((i12 ^ 87) | (i12 & 87)) << 1) - (((~i12) & 87) | (i12 & (-88)));
        f51714j = i14 % 128;
        int i15 = i14 % 2;
        return this.amountOther;
    }

    @JvmName(name = "getApplicationFilteringSelectors")
    @NotNull
    public final List<String> getApplicationFilteringSelectors() {
        int i10 = f51714j;
        int i11 = i10 & 99;
        int i12 = (i11 - (~((i10 ^ 99) | i11))) - 1;
        f51715k = i12 % 128;
        if (i12 % 2 != 0) {
            return this.applicationFilteringSelectors;
        }
        throw null;
    }

    @JvmName(name = "getCurrency")
    @NotNull
    public final Iso4217Currency getCurrency() {
        int i10 = f51715k;
        int i11 = i10 ^ 75;
        int i12 = -(-((i10 & 75) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        f51714j = i14;
        int i15 = i13 % 2;
        int i16 = i14 + 41;
        f51715k = i16 % 128;
        if (i16 % 2 != 0) {
            return this.currency;
        }
        throw null;
    }

    @JvmName(name = "getDetails")
    @Nullable
    public final String getDetails() {
        int i10 = f51715k;
        int i11 = i10 & 65;
        int i12 = (((i10 | 65) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
        f51714j = i12 % 128;
        if (i12 % 2 == 0) {
            return this.details;
        }
        throw null;
    }

    @JvmName(name = "getGatewayId")
    @Nullable
    public final UUID getGatewayId() {
        int i10 = f51715k + 117;
        f51714j = i10 % 128;
        if (i10 % 2 == 0) {
            return this.gatewayId;
        }
        throw null;
    }

    @JvmName(name = "getMetadata")
    @NotNull
    public final byte[] getMetadata() {
        int i10 = f51715k;
        int i11 = i10 ^ 37;
        int i12 = (i10 & 37) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        f51714j = i14;
        int i15 = i13 % 2;
        int i16 = i14 & 123;
        int i17 = (i14 ^ 123) | i16;
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        f51715k = i18 % 128;
        int i19 = i18 % 2;
        return this.metadata;
    }

    @JvmName(name = "getRrn")
    @NotNull
    public final String getRrn() {
        int i10 = f51715k;
        int i11 = i10 & 33;
        int i12 = i11 + ((i10 ^ 33) | i11);
        f51714j = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 98 / 0;
        }
        int i14 = i10 + 113;
        f51714j = i14 % 128;
        int i15 = i14 % 2;
        return this.rrn;
    }

    @JvmName(name = "getType")
    @NotNull
    public final TransactionType getType() {
        int i10 = f51715k;
        int i11 = i10 & 65;
        int i12 = (((i10 ^ 65) | i11) << 1) - ((i10 | 65) & (~i11));
        int i13 = i12 % 128;
        f51714j = i13;
        int i14 = i12 % 2;
        int i15 = i13 + 93;
        f51715k = i15 % 128;
        if (i15 % 2 != 0) {
            return this.type;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i10 = f51714j + 113;
        f51715k = i10 % 128;
        int i11 = i10 % 2;
        int iA = a.a(this.amount);
        int i12 = iA * 31;
        int iHashCode2 = 0;
        Long l6 = this.amountOther;
        if (l6 != null) {
            int i13 = f51714j + 122;
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            f51715k = i14 % 128;
            int i15 = i14 % 2;
            iHashCode = l6.hashCode();
            int i16 = f51714j;
            int i17 = (((i16 | 122) << 1) - (i16 ^ 122)) - 1;
            f51715k = i17 % 128;
            int i18 = i17 % 2;
        } else {
            int i19 = f51714j;
            int i20 = (i19 ^ 61) + ((i19 & 61) << 1);
            f51715k = i20 % 128;
            int i21 = i20 % 2;
            iHashCode = 0;
        }
        int iIdentityHashCode = System.identityHashCode(this);
        int i22 = ((iHashCode * (-244)) - (~(iA * 7626))) - 1;
        int i23 = ~i12;
        int i24 = ~iIdentityHashCode;
        int i25 = ~(((~i24) & i23) | ((~i23) & i24) | (i23 & i24));
        int i26 = (i12 | (~i12)) & i23;
        int i27 = i26 ^ iHashCode;
        int i28 = i26 & iHashCode;
        int i29 = (i27 & i28) | (i27 ^ i28);
        int i30 = (i29 | (~i29)) & (~i29);
        int i31 = ((~i30) & i25) | ((~i25) & i30);
        int i32 = i25 & i30;
        int i33 = -(-(((i32 & i31) | (i31 ^ i32)) * (-245)));
        int i34 = (((i22 ^ i33) | (i22 & i33)) << 1) - (((~i22) & i33) | ((~i33) & i22));
        int i35 = (i26 & i24) | ((~i26) & iIdentityHashCode);
        int i36 = i26 & iIdentityHashCode;
        int i37 = (i36 & i35) | (i35 ^ i36);
        int i38 = ((i37 | (~i37)) & (~i37)) * (-245);
        int i39 = (i34 ^ i38) + ((i38 & i34) << 1);
        int i40 = (i23 & iIdentityHashCode) | (i23 ^ iIdentityHashCode);
        int i41 = (i40 | (~i40)) & (~i40);
        int i42 = ((i41 & iHashCode) | (iHashCode ^ i41)) * 245;
        int iE = b.e(((~i42) & i39) | ((~i39) & i42), ~((i42 & i39) << 1), 1, 31);
        int i43 = -(~(-(-this.currency.hashCode())));
        int i44 = (((iE | i43) << 1) - (iE ^ i43)) - 1;
        int i45 = i44 * 31;
        int iHashCode3 = this.type.hashCode();
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i46 = iHashCode3 * 253;
        int i47 = i44 * 7843;
        int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
        int i49 = ~iHashCode3;
        int i50 = ~iHashCode3;
        int i51 = i49 & (i50 | iHashCode3);
        int i52 = ~i45;
        int i53 = ~i45;
        int i54 = i52 & (i53 | i45);
        int i55 = i51 & i54;
        int i56 = (i51 | i54) & (~i55);
        int i57 = ~((i56 & i55) | (i56 ^ i55));
        int i58 = ~iIdentityHashCode2;
        int i59 = i53 ^ i58;
        int i60 = i53 & i58;
        int i61 = ~((i59 & i60) | (i59 ^ i60));
        int i62 = ((~i61) & i57) | ((~i57) & i61);
        int i63 = i57 & i61;
        int i64 = (i63 & i62) | (i62 ^ i63);
        int i65 = iHashCode3 & i45;
        int i66 = (~i65) & (iHashCode3 | i45);
        int i67 = (i66 & i65) | (i66 ^ i65);
        int i68 = ~((i67 & iIdentityHashCode2) | (i67 ^ iIdentityHashCode2));
        int i69 = i64 ^ i68;
        int i70 = i64 & i68;
        int i71 = -(-(((i70 & i69) | (i69 ^ i70)) * (-252)));
        int i72 = i48 ^ i71;
        int i73 = -(-((i71 & i48) << 1));
        int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
        int i75 = -(-(((iHashCode3 ^ i45) | i65) * (-252)));
        int i76 = ((((i74 ^ i75) | (i74 & i75)) << 1) - (~(-((i75 & (~i74)) | ((~i75) & i74))))) - 1;
        int i77 = (~iIdentityHashCode2) & (i58 | iIdentityHashCode2);
        int i78 = i53 & i77;
        int i79 = (i77 | i53) & (~i78);
        int i80 = (i79 & i78) | (i79 ^ i78) | iHashCode3;
        int i81 = (i80 | (~i80)) & (~i80);
        int i82 = (i45 & i50) | (iHashCode3 & i53);
        int i83 = (i82 & i65) | (i82 ^ i65);
        int i84 = i83 & iIdentityHashCode2;
        int i85 = (i83 | iIdentityHashCode2) & (~i84);
        int i86 = (i85 & i84) | (i85 ^ i84);
        int i87 = (i86 | (~i86)) & (~i86);
        int i88 = i81 & i87;
        int i89 = (i87 | i81) & (~i88);
        int i90 = ((((i89 & i88) | (i89 ^ i88)) * 252) + i76) * 31;
        int iHashCode4 = this.rrn.hashCode();
        int i91 = (i90 & iHashCode4) + (i90 | iHashCode4);
        int i92 = i91 * 31;
        int iHashCode5 = this.applicationFilteringSelectors.hashCode();
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i93 = ((-1) << 1) - (((iHashCode5 * 370) - (~(i91 * 11470))) ^ (-1));
        int i94 = (iHashCode5 ^ i92) | (iHashCode5 & i92);
        int i95 = (~iIdentityHashCode3) & ((~iIdentityHashCode3) | iIdentityHashCode3);
        int i96 = i94 ^ i95;
        int i97 = ~i95;
        int i98 = i94 & i95;
        int i99 = -(-(((i98 & i96) | (i96 ^ i98)) * (-369)));
        int i100 = ((((i93 ^ i99) | (i93 & i99)) << 1) - (~(-(((~i93) & i99) | ((~i99) & i93))))) - 1;
        int i101 = ~iHashCode5;
        int i102 = ~((i101 & i97) | ((~i101) & i95) | (i101 & i95));
        int i103 = i92 ^ i102;
        int i104 = i102 & i92;
        int i105 = (i100 - (~(-(~(((i104 & i103) | (i103 ^ i104)) * (-369)))))) - 2;
        int i106 = ~i92;
        int i107 = i106 ^ iHashCode5;
        int i108 = i106 & iHashCode5;
        int i109 = ~((i108 & i107) | (i107 ^ i108));
        int i110 = iHashCode5 & iIdentityHashCode3;
        int i111 = ((iHashCode5 | iIdentityHashCode3) & (~i110)) | i110;
        int i112 = (i111 | (~i111)) & (~i111);
        int i113 = i109 & i112;
        int i114 = (i112 | i109) & (~i113);
        int i115 = (i114 & i113) | (i114 ^ i113);
        int i116 = (i101 & i97) | ((~i101) & i95);
        int i117 = i101 & i95;
        int i118 = (i117 & i116) | (i116 ^ i117);
        int i119 = i118 ^ i92;
        int i120 = i92 & i118;
        int i121 = (i120 & i119) | (i119 ^ i120);
        int i122 = (i121 | (~i121)) & (~i121);
        int i123 = i115 & i122;
        int i124 = (i122 | i115) & (~i123);
        int i125 = -(-(((i124 & i123) | (i124 ^ i123)) * 369));
        int i126 = i105 & i125;
        int i127 = (((i125 | i105) & (~i126)) + (i126 << 1)) * 31;
        int iHashCode6 = Arrays.hashCode(this.metadata);
        int i128 = (i127 & iHashCode6) + (i127 | iHashCode6);
        int i129 = i128 * 31;
        UUID uuid = this.gatewayId;
        if (uuid != null) {
            int i130 = f51714j;
            int i131 = i130 & 65;
            int i132 = (i130 | 65) & (~i131);
            int i133 = i131 << 1;
            int i134 = ((i132 | i133) << 1) - (i132 ^ i133);
            f51715k = i134 % 128;
            if (i134 % 2 == 0) {
                uuid.hashCode();
                throw null;
            }
            iHashCode2 = uuid.hashCode();
            int i135 = f51715k;
            int i136 = i135 & 31;
            int i137 = -(-(31 | i135));
            int i138 = (i136 & i137) + (i137 | i136);
            f51714j = i138 % 128;
            int i139 = i138 % 2;
        } else {
            int i140 = f51715k;
            int i141 = (i140 ^ 62) + ((i140 & 62) << 1);
            int i142 = (i141 ^ (-1)) + (i141 << 1);
            f51714j = i142 % 128;
            int i143 = i142 % 2;
        }
        int iIdentityHashCode4 = System.identityHashCode(this);
        int i144 = iHashCode2 * Opcodes.INSTANCEOF;
        int i145 = -(~(-(-(i128 * 5983))));
        int i146 = (i144 ^ i145) + ((i145 & i144) << 1);
        int i147 = (i146 ^ (-1)) + (i146 << 1);
        int i148 = ~iIdentityHashCode4;
        int i149 = ~iHashCode2;
        int i150 = ~(i149 | i129);
        int i151 = -(-(((i150 & i148) | (i148 ^ i150)) * (-192)));
        int i152 = i147 & i151;
        int i153 = ((i147 ^ i151) | i152) << 1;
        int i154 = -((i147 | i151) & (~i152));
        int i155 = (i153 ^ i154) + ((i154 & i153) << 1);
        int i156 = ~iHashCode2;
        int i157 = i156 | iHashCode2;
        int i158 = i149 & i157;
        int i159 = ~i129;
        int i160 = ~((i158 & i159) | ((~i159) & i158) | ((~i158) & i159));
        int i161 = ~i129;
        int i162 = i161 & i148;
        int i163 = (i148 | i161) & (~i162);
        int i164 = ~((i163 & i162) | (i163 ^ i162));
        int i165 = i160 ^ i164;
        int i166 = i164 & i160;
        int i167 = (((i166 & i165) | (i165 ^ i166)) * (-384)) + i155;
        int i168 = i149 & i157;
        int i169 = i168 ^ i161;
        int i170 = i168 & i161;
        int i171 = (i170 & i169) | (i169 ^ i170);
        int i172 = i171 & iIdentityHashCode4;
        int i173 = ((i171 | iIdentityHashCode4) & (~i172)) | i172;
        int i174 = (i173 | (~i173)) & (~i173);
        int i175 = ~iIdentityHashCode4;
        int i176 = i161 & i175;
        int i177 = ((i175 | i161) & (~i176)) | i176;
        int i178 = ~((i156 & i177) | ((~i177) & iHashCode2) | (i177 & iHashCode2));
        int i179 = i174 & i178;
        int i180 = ((i178 | i174) & (~i179)) | i179;
        int i181 = iHashCode2 & i129;
        int i182 = (i129 | iHashCode2) & (~i181);
        int i183 = (i182 & i181) | (i182 ^ i181);
        int i184 = i183 ^ iIdentityHashCode4;
        int i185 = i183 & iIdentityHashCode4;
        int i186 = ((~((i185 & i184) | (i184 ^ i185))) | i180) * 192;
        int i187 = i167 & i186;
        int i188 = (i187 - (~((i186 ^ i167) | i187))) - 1;
        int i189 = f51714j + 51;
        f51715k = i189 % 128;
        if (i189 % 2 != 0) {
            return i188;
        }
        throw null;
    }

    @NotNull
    public final String toString() {
        int i10 = f51715k;
        int i11 = i10 & 83;
        int i12 = -(-((i10 ^ 83) | i11));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        f51714j = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        int i14 = (i10 & 105) + (i10 | 105);
        f51714j = i14 % 128;
        if (i14 % 2 == 0) {
            return "";
        }
        throw null;
    }

    public /* synthetic */ TransactionParameters(long j10, Long l6, Iso4217Currency iso4217Currency, String str, TransactionType transactionType, String str2, List list, byte[] bArr, UUID uuid, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, l6, iso4217Currency, (i10 & 8) != 0 ? null : str, transactionType, str2, (i10 & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 128) != 0 ? new byte[0] : bArr, (i10 & 256) != 0 ? null : uuid);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransactionParameters(long j10, @Nullable Long l6, @NotNull Iso4217Currency iso4217Currency, @NotNull TransactionType transactionType, @NotNull String str) {
        this(j10, l6, iso4217Currency, null, transactionType, str, null, null, null, 456, null);
        Intrinsics.checkNotNullParameter(iso4217Currency, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransactionParameters(long j10, @Nullable Long l6, @NotNull Iso4217Currency iso4217Currency, @Nullable String str, @NotNull TransactionType transactionType, @NotNull String str2) {
        this(j10, l6, iso4217Currency, str, transactionType, str2, null, null, null, 448, null);
        Intrinsics.checkNotNullParameter(iso4217Currency, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransactionParameters(long j10, @Nullable Long l6, @NotNull Iso4217Currency iso4217Currency, @Nullable String str, @NotNull TransactionType transactionType, @NotNull String str2, @NotNull List<String> list) {
        this(j10, l6, iso4217Currency, str, transactionType, str2, list, null, null, BluetoothState.REQUEST_CONNECT_DEVICE, null);
        Intrinsics.checkNotNullParameter(iso4217Currency, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransactionParameters(long j10, @Nullable Long l6, @NotNull Iso4217Currency iso4217Currency, @Nullable String str, @NotNull TransactionType transactionType, @NotNull String str2, @NotNull List<String> list, @NotNull byte[] bArr) {
        this(j10, l6, iso4217Currency, str, transactionType, str2, list, bArr, null, 256, null);
        Intrinsics.checkNotNullParameter(iso4217Currency, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(bArr, "");
    }
}
