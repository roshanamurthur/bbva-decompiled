package com.bbva.sdkcatalog.openpay.plugin;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import j6.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import z6.f;
import z6.g;
import z6.h;
import z6.i;
import z6.j;
import z6.k;
import z6.l;
import z6.m;
import z6.n;

/* JADX INFO: compiled from: OpenPayCommandFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/OpenPayCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "<init>", "()V", "Companion", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OpenPayCommandFactory extends CommandFactory {

    @NotNull
    public static final String COMMAND_APPLY_TRANSACTION_REFUND = "applytransactionrefund";

    @NotNull
    public static final String COMMAND_CHECK_PAYMENT_LINK = "checkpaymentlink";

    @NotNull
    public static final String COMMAND_CHECK_TAP_ON_PHONE_MOBILE_CAPABILITIES = "checktaponphonemobilecapabilities";

    @NotNull
    public static final String COMMAND_CONNECT_TO_BLUETOOTH_DEVICE = "connecttobluetoothdevice";

    @NotNull
    public static final String COMMAND_CREATE_PAYMENT_LINK = "createpaymentlink";

    @NotNull
    public static final String COMMAND_EXECUTE_CHARGE = "executecharge";

    @NotNull
    public static final String COMMAND_EXECUTE_TAP_ON_PHONE_CHARGE = "executetaponphonecharge";

    @NotNull
    public static final String COMMAND_EXECUTE_TAP_ON_PHONE_REFUND_CHARGE = "executetaponphonerefundcharge";

    @NotNull
    public static final String COMMAND_GET_PAYMENT_PLANS = "getpaymentplans";

    @NotNull
    public static final String COMMAND_INIT_SDK = "initsdk";

    @NotNull
    public static final String COMMAND_INIT_TAP_ON_PHONE = "inittaponphone";

    @NotNull
    public static final String COMMAND_LIST_TRANSACTIONS = "listtransactions";

    @NotNull
    public static final String COMMAND_PAYMENT_LINK_LISTING = "paymentlinklisting";

    @NotNull
    public static final String COMMAND_REFUND_PAYMENT_LINK = "refundpaymentlink";

    @NotNull
    public static final String COMMAND_SCAN_NEW_DEVICES = "scannewdevices";

    @NotNull
    public static final String COMMAND_SEND_VOUCHER = "sendvoucher";

    @NotNull
    public static final String COMMAND_UPDATE_PAYMENT_LINK = "updatepaymentlink";

    public OpenPayCommandFactory() {
        int i10 = 5;
        addCommandProvider(COMMAND_INIT_SDK, new z6.d(i10));
        addCommandProvider(COMMAND_SCAN_NEW_DEVICES, new j6.c(i10));
        int i11 = 4;
        addCommandProvider(COMMAND_CONNECT_TO_BLUETOOTH_DEVICE, new j6.d(i11));
        addCommandProvider(COMMAND_EXECUTE_CHARGE, new e(i11));
        int i12 = 3;
        addCommandProvider(COMMAND_APPLY_TRANSACTION_REFUND, new j(i12));
        addCommandProvider(COMMAND_LIST_TRANSACTIONS, new k(i12));
        addCommandProvider(COMMAND_GET_PAYMENT_PLANS, new m(i12));
        addCommandProvider(COMMAND_CREATE_PAYMENT_LINK, new n(i10));
        addCommandProvider(COMMAND_CHECK_PAYMENT_LINK, new z6.a(7));
        int i13 = 6;
        addCommandProvider(COMMAND_UPDATE_PAYMENT_LINK, new l(i13));
        addCommandProvider(COMMAND_REFUND_PAYMENT_LINK, new z6.e(i10));
        addCommandProvider(COMMAND_PAYMENT_LINK_LISTING, new f(8));
        addCommandProvider(COMMAND_SEND_VOUCHER, new g(8));
        addCommandProvider(COMMAND_INIT_TAP_ON_PHONE, new h(i13));
        addCommandProvider(COMMAND_EXECUTE_TAP_ON_PHONE_CHARGE, new i(i10));
        addCommandProvider(COMMAND_EXECUTE_TAP_ON_PHONE_REFUND_CHARGE, new j6.a(i11));
        addCommandProvider(COMMAND_CHECK_TAP_ON_PHONE_MOBILE_CAPABILITIES, new j6.b(i13));
    }
}
