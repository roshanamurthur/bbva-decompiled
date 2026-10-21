package com.bbva.gp2.android.product.mobilepayment.plugin;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.gp2.android.product.mobilepayment.plugin.command.DeleteDeviceCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.command.DeleteDeviceLocalCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.command.EnableCardsCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.command.GetCardStatusCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.command.GetFavoriteCardCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.command.GetTransactionHistoryCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.command.InitializeCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.command.IsCdcvmForLvtCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.command.IsNfcPaymentAppCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.command.PaymentAuthenticatedCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.command.SetCdcvmForLvtCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.command.SetFavoriteCardCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.command.SetNfcPaymentAppCommand;
import j6.a;
import j6.b;
import j6.c;
import j6.d;
import j6.e;
import kotlin.Metadata;
import z6.f;
import z6.g;
import z6.h;
import z6.i;
import z6.j;
import z6.k;
import z6.m;
import z6.n;

/* JADX INFO: compiled from: MobilePaymentCommandFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/plugin/MobilePaymentCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "<init>", "()V", "payments-mobilepayment-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MobilePaymentCommandFactory extends CommandFactory {
    public MobilePaymentCommandFactory() {
        int i10 = 2;
        addCommandProvider(DeleteDeviceCommand.ID, new f(i10));
        addCommandProvider("deletedevicelocal", new a(i10));
        int i11 = 3;
        addCommandProvider(EnableCardsCommand.ID, new b(i11));
        addCommandProvider("getcardstatus", new c(i10));
        addCommandProvider(GetFavoriteCardCommand.ID, new d(i10));
        addCommandProvider(GetTransactionHistoryCommand.ID, new e(i10));
        int i12 = 1;
        addCommandProvider("initialize", new j(i12));
        addCommandProvider(PaymentAuthenticatedCommand.ID, new k(i12));
        addCommandProvider(IsNfcPaymentAppCommand.ID, new m(i12));
        addCommandProvider(SetFavoriteCardCommand.ID, new n(i10));
        addCommandProvider(SetNfcPaymentAppCommand.ID, new g(i11));
        addCommandProvider(SetCdcvmForLvtCommand.ID, new h(i10));
        addCommandProvider(IsCdcvmForLvtCommand.ID, new i(i12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractCommand _init_$lambda$0() {
        return new DeleteDeviceCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractCommand _init_$lambda$1() {
        return new DeleteDeviceLocalCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractCommand _init_$lambda$10() {
        return new SetNfcPaymentAppCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractCommand _init_$lambda$11() {
        return new SetCdcvmForLvtCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractCommand _init_$lambda$12() {
        return new IsCdcvmForLvtCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractCommand _init_$lambda$2() {
        return new EnableCardsCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractCommand _init_$lambda$3() {
        return new GetCardStatusCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractCommand _init_$lambda$4() {
        return new GetFavoriteCardCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractCommand _init_$lambda$5() {
        return new GetTransactionHistoryCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractCommand _init_$lambda$6() {
        return new InitializeCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractCommand _init_$lambda$7() {
        return new PaymentAuthenticatedCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractCommand _init_$lambda$8() {
        return new IsNfcPaymentAppCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractCommand _init_$lambda$9() {
        return new SetFavoriteCardCommand();
    }
}
