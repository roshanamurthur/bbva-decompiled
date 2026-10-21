package com.bbva.ethermobilesdk.devicemanager.extension;

import com.bbva.ethermobilesdk.deviceinfo.data.NFCStatus;
import com.bbva.ethermobilesdk.devicemanager.model.output.NfcState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NfcStatus.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toDeviceManagerResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/NfcState;", "Lcom/bbva/ethermobilesdk/deviceinfo/data/NFCStatus;", "devicemanager_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NfcStatusKt {

    /* JADX INFO: compiled from: NfcStatus.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NFCStatus.values().length];
            try {
                iArr[NFCStatus.NOT_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NFCStatus.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NFCStatus.ON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final NfcState toDeviceManagerResponse(@NotNull NFCStatus nFCStatus) {
        Intrinsics.checkNotNullParameter(nFCStatus, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[nFCStatus.ordinal()];
        if (i10 == 1) {
            return NfcState.Inactive.INSTANCE;
        }
        if (i10 == 2) {
            return NfcState.Inactive.INSTANCE;
        }
        if (i10 == 3) {
            return NfcState.Active.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
