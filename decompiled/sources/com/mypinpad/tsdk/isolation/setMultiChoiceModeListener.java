package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/mypinpad/security/implementation/crypto/HKDFKeyGenerator;", "", "", "keyId", "", "keySize", "deriveKey", "", "isSharedSecretSet", "", "junkify", "secret", "setSharedSecret", "sharedSecret", "[B", "<init>", "()V", "Companion", "android-security-module.implementation"}, k = 1, mv = {1, 5, 1})
public final class setMultiChoiceModeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60153b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60154c = 1;

    @NotNull
    public static final setOnFocusChangeListener setOnFocusChangeListener = new setOnFocusChangeListener(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public byte[] f60155a = new byte[0];

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/setMultiChoiceModeListener$setOnFocusChangeListener;", "", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class setOnFocusChangeListener {
        public setOnFocusChangeListener() {
        }

        public /* synthetic */ setOnFocusChangeListener(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i10 = f60154c;
        int i11 = (((i10 & (-14)) | ((~i10) & 13)) - (~(-(-((i10 & 13) << 1))))) - 1;
        f60153b = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
    
        if (r8.f60155a.length != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        if (r8.f60155a.length != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.setMultiChoiceModeListener.f60154c;
        r5 = r7 & 99;
        r4 = (((r7 ^ 99) | r5) << 1) - ((r7 | 99) & (~r5));
        com.mypinpad.tsdk.isolation.setMultiChoiceModeListener.f60153b = r4 % 128;
        r4 = r4 % 2;
        r7 = new com.mypinpad.tsdk.isolation.ami(new com.mypinpad.tsdk.isolation.alp());
        com.mypinpad.tsdk.isolation.ami.setDividerPadding(new java.lang.Object[]{r7, new com.mypinpad.tsdk.isolation.anp(r8.f60155a, r10, new byte[0])}, -1157420496, 1157420497, java.lang.System.identityHashCode(r7));
        r10 = new byte[32];
        ((java.lang.Integer) com.mypinpad.tsdk.isolation.ami.setDividerPadding(new java.lang.Object[]{r7, r10, 32}, 1036326691, -1036326691, 32)).intValue();
        r7 = com.mypinpad.tsdk.isolation.setMultiChoiceModeListener.f60153b;
        r8 = (((r7 | 118) << 1) - (r7 ^ 118)) - 1;
        com.mypinpad.tsdk.isolation.setMultiChoiceModeListener.f60154c = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0106, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.setMultiChoiceModeListener.f60154c;
        r8 = (((r7 ^ 91) | (r7 & 91)) << 1) - (((~r7) & 91) | (r7 & (-92)));
        com.mypinpad.tsdk.isolation.setMultiChoiceModeListener.f60153b = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x011e, code lost:
    
        throw new com.mypinpad.tsdk.isolation.setImageAlpha();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setX(java.lang.Object[] r7, int r8, int r9, int r10) throws com.mypinpad.tsdk.isolation.setImageAlpha {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setMultiChoiceModeListener.setX(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static /* synthetic */ byte[] setY(setMultiChoiceModeListener setmultichoicemodelistener, byte[] bArr) {
        return (byte[]) setX(new Object[]{setmultichoicemodelistener, bArr}, 393644320, -393644319, (int) System.currentTimeMillis());
    }

    public final boolean setCompoundDrawableTintBlendMode() {
        return ((Boolean) setX(new Object[]{this}, 352617956, -352617954, System.identityHashCode(this))).booleanValue();
    }

    public final void setDividerPadding(@NotNull byte[] bArr) throws setImageAlpha {
        setX(new Object[]{this, bArr}, -1043927957, 1043927957, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener() throws setImageAlpha {
        setX(new Object[]{this}, 804740668, -804740665, System.identityHashCode(this));
    }
}
