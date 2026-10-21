package com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.response;

/* JADX INFO: loaded from: classes7.dex */
public enum STATUS {
    messageWasSuccessful(0),
    ErrorMessage(1),
    invalidData(2),
    timeout(6),
    contactless(22),
    cardRemoved(23),
    cardNotSuppoted(25),
    invalidApplication(26),
    cardExpired(29),
    wrongDate(30),
    wrongCheckValue(51),
    wrongKeys(52),
    wrongCryptoHSM(53),
    encryptionLimitExceeded(54),
    wrongCommand(60),
    initializedKeysWrongCommand(61),
    notInitKeys(62),
    readCardError(63),
    cardDoesNotMatchStartAgain(64),
    incorrectDataForEncryption(65),
    sdkIntanceMissing(70),
    errorNetworkConnection(71),
    errorDeviceStateFailure(72),
    errorInternal(73),
    errorUnsupportedAndroidOsVersion(74),
    errorInitializedInstance(75),
    paperlessPrinter(80),
    otherPrinterProblem(81),
    printerParametersNotConfigured(82),
    lastTransactionIsNotRegistered(83),
    printerVoltageIsTooLow(84),
    printerisbusy(85),
    theformatofprintdatapacketerror(86),
    printermalfunctions(87),
    printeroverheats(88),
    printingisunfinished(89),
    cutjamerror(90),
    coveropenerror(91),
    theprinterhasnotinstalledfontlibrary(92),
    datapackageistoolong(93),
    errornopermission(94),
    printerdisabled(95),
    noNFC(96),
    NFCDisabled(97),
    NFCEnabled(98),
    errorNotDefinedCancelFromPinPad(99),
    fingerRetvalNotOpen(101),
    fingerRetvalTypeError(102),
    fingerRetvalDeviceBusy(103),
    fingerRetvalCapetureError(104);

    private final int AssetInjection;

    STATUS(int i10) {
        this.AssetInjection = i10;
    }

    public final int getValue() {
        return this.AssetInjection;
    }
}
