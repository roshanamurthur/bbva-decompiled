package com.vasco.digipass.sdk.responses;

/* JADX INFO: loaded from: classes9.dex */
public class DigipassPropertiesResponse extends DigipassResponse {
    private boolean A;
    private byte B;
    private byte C;
    private byte D;
    private boolean E;
    private boolean F;
    private boolean G;
    private Application H;
    private byte I;
    private byte J;
    private byte K;
    private byte L;
    private boolean M;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f65808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f65809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f65810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f65811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f65812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f65813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f65814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f65815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte f65816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f65817l;
    private byte m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte f65818n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte f65819o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private byte f65820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f65821q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f65822r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f65823s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f65824t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f65825u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Application[] f65826v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f65827w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private byte[] f65828x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f65829y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private byte f65830z;

    public static class Application {
        private String authenticationMode;
        private boolean checkDigit;
        private byte[] codeword;
        private byte dataFieldNumber;
        private byte[] dataFieldsMaxLength;
        private byte[] dataFieldsMinLength;
        private boolean dpPlus;
        private boolean enabled;
        private boolean eventBased;
        private long eventCounter;
        private int hostCodeLength;
        private byte index;
        private long lastTimeUsed;
        private String name;
        private byte outputType;
        private int responseLength;
        private boolean scoreCapable;
        private boolean timeBased;
        private int timeStep;

        public String getAuthenticationMode() {
            return this.authenticationMode;
        }

        public byte[] getCodeword() {
            return this.codeword;
        }

        public byte getDataFieldNumber() {
            return this.dataFieldNumber;
        }

        public byte[] getDataFieldsMaxLength() {
            return this.dataFieldsMaxLength;
        }

        public byte[] getDataFieldsMinLength() {
            return this.dataFieldsMinLength;
        }

        public long getEventCounter() {
            return this.eventCounter;
        }

        public int getHostCodeLength() {
            return this.hostCodeLength;
        }

        public byte getIndex() {
            return this.index;
        }

        public long getLastTimeUsed() {
            return this.lastTimeUsed;
        }

        public String getName() {
            return this.name;
        }

        public byte getOutputType() {
            return this.outputType;
        }

        public int getResponseLength() {
            return this.responseLength;
        }

        public int getTimeStep() {
            return this.timeStep;
        }

        public boolean isCheckDigit() {
            return this.checkDigit;
        }

        public boolean isDpPlus() {
            return this.dpPlus;
        }

        public boolean isEnabled() {
            return this.enabled;
        }

        public boolean isEventBased() {
            return this.eventBased;
        }

        public boolean isScoreCapable() {
            return this.scoreCapable;
        }

        public boolean isTimeBased() {
            return this.timeBased;
        }

        public void setAuthenticationMode(String str) {
            this.authenticationMode = str;
        }

        public void setCheckDigit(boolean z10) {
            this.checkDigit = z10;
        }

        public void setCodeword(byte[] bArr) {
            this.codeword = bArr;
        }

        public void setDataFieldNumber(byte b10) {
            this.dataFieldNumber = b10;
        }

        public void setDataFieldsMaxLength(byte[] bArr) {
            this.dataFieldsMaxLength = bArr;
        }

        public void setDataFieldsMinLength(byte[] bArr) {
            this.dataFieldsMinLength = bArr;
        }

        public void setDpPlus(boolean z10) {
            this.dpPlus = z10;
        }

        public void setEnabled(boolean z10) {
            this.enabled = z10;
        }

        public void setEventBased(boolean z10) {
            this.eventBased = z10;
        }

        public void setEventCounter(long j10) {
            this.eventCounter = j10;
        }

        public void setHostCodeLength(int i10) {
            this.hostCodeLength = i10;
        }

        public void setIndex(byte b10) {
            this.index = b10;
        }

        public void setLastTimeUsed(long j10) {
            this.lastTimeUsed = j10;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setOutputType(byte b10) {
            this.outputType = b10;
        }

        public void setResponseLength(int i10) {
            this.responseLength = i10;
        }

        public void setScoreCapable(boolean z10) {
            this.scoreCapable = z10;
        }

        public void setTimeBased(boolean z10) {
            this.timeBased = z10;
        }

        public void setTimeStep(int i10) {
            this.timeStep = i10;
        }
    }

    public DigipassPropertiesResponse(int i10) {
        super(i10);
    }

    public Application getActivationCryptoApplication() {
        return this.H;
    }

    public Application[] getApplications() {
        return this.f65826v;
    }

    public byte getCreationVersion() {
        return this.D;
    }

    public byte getDeviceIdBitsNumber() {
        return this.I;
    }

    public byte getDeviceType() {
        return this.J;
    }

    public int getIterationNumber() {
        return this.f65829y;
    }

    public byte getIterationPower() {
        return this.f65830z;
    }

    public byte[] getMasterKey() {
        return this.f65828x;
    }

    public byte getPasswordCheckLevel() {
        return this.f65816k;
    }

    public byte getPasswordFatal() {
        return this.m;
    }

    public byte getPasswordFatalCounter() {
        return this.f65818n;
    }

    public int getPasswordMaxLength() {
        return this.f65814i;
    }

    public int getPasswordMinLength() {
        return this.f65813h;
    }

    public byte getPayloadKeyType() {
        return this.L;
    }

    public byte getPinVersion() {
        return this.C;
    }

    public byte getReactivationFatal() {
        return this.f65819o;
    }

    public byte getReactivationFatalCounter() {
        return this.f65820p;
    }

    public byte getSequenceNumber() {
        return this.K;
    }

    public String getSerialNumber() {
        return this.f65810e;
    }

    public byte getStatus() {
        return this.f65809d;
    }

    public byte getStorageVersion() {
        return this.B;
    }

    public long getUtcTime() {
        return this.f65827w;
    }

    public byte getVersion() {
        return this.f65808c;
    }

    public boolean isActivationCodeFormatHexa() {
        return this.f65824t;
    }

    public boolean isDpPlusHighSecurity() {
        return this.f65823s;
    }

    public boolean isHighSecurity() {
        return this.f65822r;
    }

    public boolean isMultiDeviceActivationEnabled() {
        return this.G;
    }

    public boolean isPasswordDerivationActivated() {
        return this.F;
    }

    @Deprecated
    public boolean isPasswordEnabled() {
        return this.f65811f;
    }

    public boolean isPasswordMandatory() {
        return this.f65811f;
    }

    public boolean isPasswordProtected() {
        return this.f65812g;
    }

    public boolean isPenaltyResetAction() {
        return this.f65817l;
    }

    public boolean isSecureChannelEnabled() {
        return this.M;
    }

    public boolean isTokenDerivationActivated() {
        return this.E;
    }

    public boolean isTokenDerivationSupported() {
        return this.f65821q;
    }

    public boolean isUseChecksumForActivationCode() {
        return this.f65825u;
    }

    public boolean isUseSecretDerivation() {
        return this.A;
    }

    public boolean isWeakPasswordControl() {
        return this.f65815j;
    }

    public void setActivationCodeFormatHexa(boolean z10) {
        this.f65824t = z10;
    }

    public void setActivationCryptoApplication(Application application) {
        this.H = application;
    }

    public void setApplications(Application[] applicationArr) {
        this.f65826v = applicationArr;
    }

    public void setCreationVersion(byte b10) {
        this.D = b10;
    }

    public void setDeviceIdBitsNumber(byte b10) {
        this.I = b10;
    }

    public void setDeviceType(byte b10) {
        this.J = b10;
    }

    public void setDpPlusHighSecurity(boolean z10) {
        this.f65823s = z10;
    }

    public void setHighSecurity(boolean z10) {
        this.f65822r = z10;
    }

    public void setIterationNumber(int i10) {
        this.f65829y = i10;
    }

    public void setIterationPower(byte b10) {
        this.f65830z = b10;
    }

    public void setMasterKey(byte[] bArr) {
        this.f65828x = bArr;
    }

    public void setMultiDeviceActivationEnabled(boolean z10) {
        this.G = z10;
    }

    public void setPasswordCheckLevel(byte b10) {
        this.f65816k = b10;
    }

    public void setPasswordDerivationActivated(boolean z10) {
        this.F = z10;
    }

    public void setPasswordFatal(byte b10) {
        this.m = b10;
    }

    public void setPasswordFatalCounter(byte b10) {
        this.f65818n = b10;
    }

    public void setPasswordMandatory(boolean z10) {
        this.f65811f = z10;
    }

    public void setPasswordMaxLength(int i10) {
        this.f65814i = i10;
    }

    public void setPasswordMinLength(int i10) {
        this.f65813h = i10;
    }

    public void setPasswordProtected(boolean z10) {
        this.f65812g = z10;
    }

    public void setPayloadKeyType(byte b10) {
        this.L = b10;
    }

    public void setPenaltyResetAction(boolean z10) {
        this.f65817l = z10;
    }

    public void setPinVersion(byte b10) {
        this.C = b10;
    }

    public void setReactivationFatal(byte b10) {
        this.f65819o = b10;
    }

    public void setReactivationFatalCounter(byte b10) {
        this.f65820p = b10;
    }

    public void setSecureChannelEnabled(boolean z10) {
        this.M = z10;
    }

    public void setSequenceNumber(byte b10) {
        this.K = b10;
    }

    public void setSerialNumber(String str) {
        this.f65810e = str;
    }

    public void setStatus(byte b10) {
        this.f65809d = b10;
    }

    public void setStorageVersion(byte b10) {
        this.B = b10;
    }

    public void setTokenDerivationActivated(boolean z10) {
        this.E = z10;
    }

    public void setTokenDerivationSupported(boolean z10) {
        this.f65821q = z10;
    }

    public void setUseChecksumForActivationCode(boolean z10) {
        this.f65825u = z10;
    }

    public void setUseSecretDerivation(boolean z10) {
        this.A = z10;
    }

    public void setUtcTime(long j10) {
        this.f65827w = j10;
    }

    public void setVersion(byte b10) {
        this.f65808c = b10;
    }

    public void setWeakPasswordControl(boolean z10) {
        this.f65815j = z10;
    }

    public DigipassPropertiesResponse(int i10, Throwable th2) {
        super(i10, th2);
    }
}
