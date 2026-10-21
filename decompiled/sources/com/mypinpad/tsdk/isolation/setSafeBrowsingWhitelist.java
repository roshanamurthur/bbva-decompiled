package com.mypinpad.tsdk.isolation;

import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0013J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0013J\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0013J\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0013J\u000e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0013J&\u0010\u001f\u001a\u00020\u00112\n\u0010 \u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010!\u001a\u00020\nH\u0002J\u000e\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0013J\u0016\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0013J\u000e\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0013J\u000e\u0010)\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0013R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00060\u0007j\u0002`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00060\u0007j\u0002`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/mypinpad/softpos/emv/terminal/common/utils/log/TransactionLog;", "", "()V", "DATE_FORMAT", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "additional", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "isEnabled", "", "()Z", "setEnabled", "(Z)V", LogKeysKt.LOG, "signal", ClearCommand.ID, "", "getAdditional", "", "getLog", "getSignal", "logAdditional", "message", "logCardRequest", "request", "logCardResponse", "logDek", "dek", "logDet", "det", "logMessage", "logDestination", "includeTimestamp", "logOut", "outcome", "logSignalTagOverride", "label", "value", "logUiRequest", "uiMessage", "logUnexpectedDek", "common"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setSafeBrowsingWhitelist {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final StringBuilder f60425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final StringBuilder f60426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final StringBuilder f60427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60428d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60429e = 1;

    @NotNull
    public static final setSafeBrowsingWhitelist setX = new setSafeBrowsingWhitelist();

    static {
        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        f60425a = new StringBuilder();
        f60426b = new StringBuilder();
        f60427c = new StringBuilder();
        int i10 = f60429e + 117;
        f60428d = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:29:0x0200  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        boolean z10;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ((~(i13 | i14)) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + (i11 * (-209)) + (i10 * (-209));
        int i16 = ~i12;
        int i17 = (((~(i10 | i14 | i12)) | (~(i11 | i13 | i16))) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + (((~(i14 | i16)) | (~(i13 | i12))) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + i15;
        StringBuilder sb2 = f60427c;
        StringBuilder sb3 = f60425a;
        switch (i17) {
            case 1:
                String str = (String) objArr[0];
                int i18 = f60428d;
                int i19 = ((i18 | 44) << 1) - (i18 ^ 44);
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                f60429e = i20 % 128;
                if (i20 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    int i21 = 80 / 0;
                    if (l.isBlank(str)) {
                        int i22 = f60428d;
                        int i23 = i22 & 29;
                        int i24 = (i23 - (~((i22 ^ 29) | i23))) - 1;
                        f60429e = i24 % 128;
                        int i25 = i24 % 2;
                        z10 = false;
                    } else {
                        int i26 = f60429e + 120;
                        int i27 = (i26 ^ (-1)) + (i26 << 1);
                        f60428d = i27 % 128;
                        int i28 = i27 % 2;
                        z10 = true;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(str, "");
                    if (l.isBlank(str)) {
                        int i29 = f60428d;
                        int i210 = i29 & 29;
                        int i211 = (i210 - (~((i29 ^ 29) | i210))) - 1;
                        f60429e = i211 % 128;
                        int i212 = i211 % 2;
                        z10 = false;
                    } else {
                        int i213 = f60429e + 120;
                        int i214 = (i213 ^ (-1)) + (i213 << 1);
                        f60428d = i214 % 128;
                        int i215 = i214 % 2;
                        z10 = true;
                    }
                }
                if (!(!z10)) {
                    int i30 = f60429e;
                    int i31 = i30 & 9;
                    int i32 = (i30 ^ 9) | i31;
                    int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                    f60428d = i33 % 128;
                    int i34 = i33 % 2;
                    Intrinsics.stringPlus("--OUT -> \n", str);
                    setCompoundDrawableTintBlendMode(new Object[0], -1418316966, 1418316968, (int) System.currentTimeMillis());
                    int i35 = f60428d;
                    int i36 = (-2) - (((i35 & 26) + (i35 | 26)) ^ (-1));
                    f60429e = i36 % 128;
                    int i37 = i36 % 2;
                }
                int i38 = f60429e;
                int i39 = (((i38 | 50) << 1) - (i38 ^ 50)) - 1;
                f60428d = i39 % 128;
                if (i39 % 2 != 0) {
                    throw null;
                }
                return null;
            case 2:
                int i40 = f60429e;
                int i41 = i40 & 31;
                int i42 = (i40 | 31) & (~i41);
                int i43 = -(-(i41 << 1));
                int i44 = (i42 & i43) + (i42 | i43);
                f60428d = i44 % 128;
                if (i44 % 2 == 0) {
                    Unit unit = Unit.INSTANCE;
                    setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
                    return null;
                }
                Unit unit2 = Unit.INSTANCE;
                setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
                throw null;
            case 3:
                int i45 = f60428d;
                int i46 = ((i45 & (-38)) | ((~i45) & 37)) + ((i45 & 37) << 1);
                f60429e = i46 % 128;
                int i47 = i46 % 2;
                h.clear(sb3);
                h.clear(f60426b);
                h.clear(sb2);
                int i48 = f60428d;
                int i49 = ((((i48 ^ 39) | (i48 & 39)) << 1) - (~(-(((~i48) & 39) | (i48 & (-40)))))) - 1;
                f60429e = i49 % 128;
                int i50 = i49 % 2;
                return null;
            case 4:
                int i51 = f60429e;
                int i52 = i51 ^ 77;
                int i53 = -(-((i51 & 77) << 1));
                int i54 = (i52 & i53) + (i53 | i52);
                f60428d = i54 % 128;
                int i55 = i54 % 2;
                setCompoundDrawableTintBlendMode(new Object[0], -1418316966, 1418316968, (int) System.currentTimeMillis());
                int i56 = f60429e;
                int i57 = (((i56 & (-38)) | ((~i56) & 37)) - (~(-(-((i56 & 37) << 1))))) - 1;
                f60428d = i57 % 128;
                if (i57 % 2 != 0) {
                    throw null;
                }
                return null;
            case 5:
                String str2 = (String) objArr[1];
                Intrinsics.checkNotNullParameter(str2, "");
                StringBuilder sb4 = new StringBuilder("RAPDU -> ");
                sb4.append(str2);
                sb4.append('\n');
                setCompoundDrawableTintBlendMode(new Object[]{sb3, sb4.toString()}, 564015428, -564015424, (int) System.currentTimeMillis());
                int i58 = f60429e;
                int i59 = i58 & 1;
                int i60 = (i59 - (~(-(-((i58 ^ 1) | i59))))) - 1;
                f60428d = i60 % 128;
                int i61 = i60 % 2;
                return null;
            case 6:
                String str3 = (String) objArr[0];
                int i62 = f60429e + 109;
                f60428d = i62 % 128;
                int i63 = i62 % 2;
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.stringPlus("---MSG -> \n", str3);
                setCompoundDrawableTintBlendMode(new Object[0], -1418316966, 1418316968, (int) System.currentTimeMillis());
                int i64 = f60429e;
                int i65 = i64 & 75;
                int i66 = ((i64 ^ 75) | i65) << 1;
                int i67 = -((i64 | 75) & (~i65));
                int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                f60428d = i68 % 128;
                if (i68 % 2 != 0) {
                    throw null;
                }
                return null;
            case 7:
                String str4 = (String) objArr[1];
                int i69 = f60429e;
                int i70 = i69 & 45;
                int i71 = -(-((i69 ^ 45) | i70));
                int i72 = (i70 ^ i71) + ((i71 & i70) << 1);
                f60428d = i72 % 128;
                int i73 = i72 % 2;
                Intrinsics.checkNotNullParameter(str4, "");
                setCompoundDrawableTintBlendMode(new Object[]{sb2, str4}, 564015428, -564015424, (int) System.currentTimeMillis());
                int i74 = f60428d;
                int i75 = i74 & 47;
                int i76 = -(-((i74 ^ 47) | i75));
                int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
                f60429e = i77 % 128;
                int i78 = i77 % 2;
                return null;
            default:
                String str5 = (String) objArr[1];
                Intrinsics.checkNotNullParameter(str5, "");
                StringBuilder sb5 = new StringBuilder("CAPDU -> ");
                sb5.append(str5);
                sb5.append('\n');
                setCompoundDrawableTintBlendMode(new Object[]{sb3, sb5.toString()}, 564015428, -564015424, (int) System.currentTimeMillis());
                int i79 = f60429e;
                int i80 = i79 & 23;
                int i81 = (((i79 | 23) & (~i80)) - (~(i80 << 1))) - 1;
                f60428d = i81 % 128;
                int i82 = i81 % 2;
                return null;
        }
    }

    public static void setY(@NotNull String str) {
        setCompoundDrawableTintBlendMode(new Object[]{str}, 1025379401, -1025379400, (int) System.currentTimeMillis());
    }

    public final void setDividerPadding(@NotNull String str) {
        setCompoundDrawableTintBlendMode(new Object[]{this, str}, -223244018, 223244023, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull String str) {
        setCompoundDrawableTintBlendMode(new Object[]{this, str}, -1329885597, 1329885604, System.identityHashCode(this));
    }

    public final void setX(@NotNull String str) {
        setCompoundDrawableTintBlendMode(new Object[]{this, str}, -1913298289, 1913298289, System.identityHashCode(this));
    }

    public static void setDividerPadding() {
        setCompoundDrawableTintBlendMode(new Object[0], 1531836137, -1531836134, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(@NotNull String str) {
        setCompoundDrawableTintBlendMode(new Object[]{str}, 2134864921, -2134864915, (int) System.currentTimeMillis());
    }
}
