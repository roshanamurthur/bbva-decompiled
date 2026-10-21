package com.bbva.sl.ar.android.secsdk.fido.ui;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoAuthenticatorType;
import com.bbva.sl.ar.android.secsdk.fido.tools.FidoConfig;
import com.noknok.android.client.appsdk.AsmSelectionUI;
import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class FidoSelectionUIHandler extends AsmSelectionUI {
    private static final int CANCELLED_INDEX = -1;
    private boolean didCancel;
    private FidoSdk.FidoUISelectionListener listener;
    private FidoAuthenticatorType selectedAuthenticator;
    private Map<FidoAuthenticatorType, Integer> selectionMap = new HashMap();
    private List<FidoAuthenticatorType> selectionList = new ArrayList();
    private final Object lock = new Object();

    public FidoSelectionUIHandler(FidoSdk.FidoUISelectionListener fidoUISelectionListener) {
        this.listener = fidoUISelectionListener;
    }

    private Handler mainHandler() {
        return new Handler(Looper.getMainLooper());
    }

    private void processSelectionList(List<List<AuthenticatorInfo>> list) {
        this.selectionMap.clear();
        this.selectionList.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!list.get(i10).isEmpty()) {
                AuthenticatorInfo authenticatorInfo = list.get(i10).get(0);
                for (FidoAuthenticatorType fidoAuthenticatorType : (FidoAuthenticatorType[]) FidoAuthenticatorType.class.getEnumConstants()) {
                    if (fidoAuthenticatorType.matchesAaid(authenticatorInfo.aaid)) {
                        this.selectionMap.put(fidoAuthenticatorType, Integer.valueOf(i10));
                        this.selectionList.add(fidoAuthenticatorType);
                    }
                }
            }
        }
    }

    @Override // com.noknok.android.client.appsdk.AsmSelectionUI
    public int openUI(Context context, List<List<AuthenticatorInfo>> list, AsmSelectionUI.OperationType operationType, boolean z10) {
        if (this.listener == null || list == null || list.isEmpty()) {
            return -1;
        }
        if (list.size() == 1 && list.get(0) != null && list.get(0).size() == 1) {
            return 0;
        }
        this.didCancel = true;
        processSelectionList(list);
        mainHandler().post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.ui.FidoSelectionUIHandler.1
            @Override // java.lang.Runnable
            public void run() {
                FidoSelectionUIHandler.this.listener.selectAuthenticator(FidoSelectionUIHandler.this.selectionList, new FidoSdk.FidoUISelectionCallback() { // from class: com.bbva.sl.ar.android.secsdk.fido.ui.FidoSelectionUIHandler.1.1
                    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoUISelectionCallback
                    public void didCancel() {
                        synchronized (FidoSelectionUIHandler.this.lock) {
                            FidoSelectionUIHandler.this.didCancel = true;
                            FidoSelectionUIHandler.this.lock.notify();
                        }
                    }

                    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoUISelectionCallback
                    public void didSelect(FidoAuthenticatorType fidoAuthenticatorType) {
                        synchronized (FidoSelectionUIHandler.this.lock) {
                            FidoSelectionUIHandler.this.selectedAuthenticator = fidoAuthenticatorType;
                            FidoSelectionUIHandler.this.didCancel = false;
                            FidoSelectionUIHandler.this.lock.notify();
                        }
                    }
                });
            }
        });
        synchronized (this.lock) {
            try {
                this.lock.wait((long) (((Double) FidoConfig.getProperty(FidoConfig.Property.SELECTION_TIMEOUT)).doubleValue() * 1000.0d));
            } catch (InterruptedException unused) {
            }
            if (this.didCancel) {
                this.listener.selectionTimeout();
                return -1;
            }
            return this.selectionMap.get(this.selectedAuthenticator).intValue();
        }
    }
}
