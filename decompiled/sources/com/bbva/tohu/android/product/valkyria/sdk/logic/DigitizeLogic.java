package com.bbva.tohu.android.product.valkyria.sdk.logic;

import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.DetectedRootedDeviceException;
import com.bbva.tohu.android.core.exceptions.DeviceNoElegibleException;
import com.bbva.tohu.android.core.exceptions.InternalErrorException;
import com.bbva.tohu.android.core.exceptions.LoginNeededException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.Armadillo401Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu403Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu412Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu423Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu503Exception;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.response.Response;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TemporaryUnavailableException;
import com.bbva.tohu.android.product.valkyria.sdk.export.requests.Card;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.Digitize;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.DigitizeCard;
import com.bbva.tohu.android.product.valkyria.sdk.services.BackendService;
import com.bbva.tohu.android.product.valkyria.sdk.services.CredentialService;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DigitizeLogic {
    private static final String TAG = "DigitizeLogic";
    private BackendService backendService;
    private CredentialService credentialService;

    public DigitizeLogic(BackendService backendService, CredentialService credentialService) {
        this.backendService = backendService;
        this.credentialService = credentialService;
    }

    private Response<Digitize> callHubDigitize(List<Card> list, String str) throws LoginNeededException, NetworkNotPresentException, InternalErrorException, DetectedRootedDeviceException, CryptoInitException, DeviceNoElegibleException, TemporaryUnavailableException {
        try {
            return this.backendService.digitize(list, this.credentialService.getJwt(str));
        } catch (Armadillo401Exception unused) {
            throw new LoginNeededException();
        } catch (Tohu403Exception unused2) {
            throw new LoginNeededException();
        } catch (Tohu412Exception e5) {
            throw new DeviceNoElegibleException(e5);
        } catch (Tohu423Exception e7) {
            e7.getMessage();
            throw new DetectedRootedDeviceException();
        } catch (Tohu503Exception e10) {
            throw new TemporaryUnavailableException(e10);
        } catch (TohuBackendException e11) {
            throw new InternalErrorException(e11);
        }
    }

    public List<DigitizeCard> doDigitize(List<Card> list, String str) throws LoginNeededException, NetworkNotPresentException, InternalErrorException, DetectedRootedDeviceException, CryptoInitException, TemporaryUnavailableException, DeviceNoElegibleException {
        return callHubDigitize(list, str).getData().getCards();
    }
}
