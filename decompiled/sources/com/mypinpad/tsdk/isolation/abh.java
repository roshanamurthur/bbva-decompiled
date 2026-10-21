package com.mypinpad.tsdk.isolation;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB3\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u0002\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/i/abh;", "Lcom/mypinpad/tsdk/i/abe;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "p0", "Ljavax/net/ssl/SSLSocketFactory;", "p1", "p2", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "setY_"}, k = 1, mv = {1, 6, 0})
public final class abh extends abe {

    /* JADX INFO: renamed from: setY_, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.abh$setY_, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/platform/android/StandardAndroidSocketAdapter$Companion;", "", "()V", "buildIfSupported", "Lokhttp3/internal/platform/android/SocketAdapter;", "packageName", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52295a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52296b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ abg setDividerPadding() {
            return (abg) setOnFocusChangeListener(new Object[0], -1619128344, 1619128345, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * 965) + ((i10 * (-963)) - 964);
            int i14 = ~i10;
            int i15 = ~i11;
            if ((((~(i10 | i15)) | (~((~i12) | i15))) * (-964)) + ((i14 | (~(i15 | i12))) * (-964)) + i13 == 1) {
                int i16 = f52295a + 123;
                f52296b = i16 % 128;
                int i17 = i16 % 2;
                abg abgVar = (abg) setOnFocusChangeListener(new Object[]{"com.android.org.conscrypt"}, 1449855497, -1449855497, (int) System.currentTimeMillis());
                int i18 = f52296b;
                int i19 = i18 ^ 91;
                int i20 = ((i18 & 91) | i19) << 1;
                int i21 = -i19;
                int i22 = (i20 & i21) + (i20 | i21);
                f52295a = i22 % 128;
                int i23 = i22 % 2;
                return abgVar;
            }
            String str = (String) objArr[0];
            int i24 = f52295a;
            int i25 = i24 & 27;
            int i26 = -(-(i24 | 27));
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            f52296b = i27 % 128;
            abh abhVar = null;
            try {
                if (i27 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Class.forName(Intrinsics.stringPlus(str, ".OpenSSLSocketImpl"));
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Intrinsics.checkNotNullParameter(str, "");
                Class<?> cls = Class.forName(Intrinsics.stringPlus(str, ".OpenSSLSocketImpl"));
                Class<?> cls2 = Class.forName(Intrinsics.stringPlus(str, ".OpenSSLSocketFactoryImpl"));
                Class<?> cls3 = Class.forName(Intrinsics.stringPlus(str, ".SSLParametersImpl"));
                Intrinsics.checkNotNullExpressionValue(cls3, "");
                abh abhVar2 = new abh(cls, cls2, cls3);
                int i28 = f52295a;
                int i29 = ((i28 ^ 111) | (i28 & 111)) << 1;
                int i30 = -(((~i28) & 111) | (i28 & (-112)));
                int i31 = (i29 & i30) + (i30 | i29);
                f52296b = i31 % 128;
                int i32 = i31 % 2;
                abhVar = abhVar2;
                int i33 = f52295a + 115;
                f52296b = i33 % 128;
                int i34 = i33 % 2;
                return abhVar;
            } catch (Exception e5) {
                aaw.setOnFocusChangeListener setonfocuschangelistener = aaw.setCompoundDrawableTintBlendMode;
                aaw.setCompoundDrawableTintBlendMode(new Object[]{"unable to load android socket classes", 5, e5}, 1271727973, -1271727970, 5);
            }
        }
    }

    static {
        int i10 = 1 + 17;
        int i11 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abh(@NotNull Class<? super SSLSocket> cls, @NotNull Class<? super SSLSocketFactory> cls2, @NotNull Class<?> cls3) {
        super(cls);
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(cls2, "");
        Intrinsics.checkNotNullParameter(cls3, "");
    }
}
