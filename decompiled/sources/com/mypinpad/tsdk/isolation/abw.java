package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0003H\u0011¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u0000H\u0017¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0010H\u0087\u0002¢\u0006\u0004\b\u0007\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0011¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u0006\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0006\u0010\u001eJ/\u0010\u0007\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0007\u0010!J/\u0010\u0004\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0004\u0010\"J\u0015\u0010\u0007\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010#J\u001a\u0010%\u001a\u00020 2\b\u0010\u000b\u001a\u0004\u0018\u00010$H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010\u0015J\u000f\u0010(\u001a\u00020\u0003H\u0017¢\u0006\u0004\b(\u0010\u0005J\u0017\u0010+\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100R\u001a\u0010\u0012\u001a\u00020\u00168\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b\f\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00108\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b\u0012\u0010\u0015\"\u0004\b\u0006\u00104R$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0005\"\u0004\b\u0006\u00108R\u0011\u0010\u0007\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b9\u0010\u0015"}, d2 = {"Lcom/mypinpad/tsdk/i/abw;", "Ljava/io/Serializable;", "", "", "setOnFocusChangeListener", "()Ljava/lang/String;", "setX", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/abw;", "setNavigationOnClickListener", "setOnDragListener", "p0", "setDividerPadding", "(Ljava/lang/String;)Lcom/mypinpad/tsdk/i/abw;", "setLayoutAnimation", "getNavBarTitleString", "", "", "setY", "(I)B", "UiMessageCallbackKtWhenMappings", "()I", "", "setZ", "()[B", "setAlwaysDrawnWithCacheEnabled", "Lcom/mypinpad/tsdk/i/abx;", "p1", "p2", "", "(Lcom/mypinpad/tsdk/i/abx;I)V", "p3", "", "(Lcom/mypinpad/tsdk/i/abw;I)Z", "(I[BII)Z", "(Lcom/mypinpad/tsdk/i/abw;)Z", "", "equals", "(Ljava/lang/Object;)Z", GenerateActivationFormCommand.HASH_CODE, "toString", "Ljava/io/ObjectInputStream;", "in", "readObject", "(Ljava/io/ObjectInputStream;)V", "Ljava/io/ObjectOutputStream;", "out", "writeObject", "(Ljava/io/ObjectOutputStream;)V", "[B", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "(I)V", "r0", "Ljava/lang/String;", "setTextAlignment", "(Ljava/lang/String;)V", "setOnLongClickListener", "<init>", "([B)V"}, k = 1, mv = {1, 5, 1})
public class abw implements Serializable, Comparable<abw> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f52350s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52351t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setY;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public transient int setOnFocusChangeListener;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public transient String setX;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final abw setOnFocusChangeListener = new abw(new byte[0]);

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.abw$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\b\u0016J\u0014\u0010\u0013\u001a\u00020\u00042\n\u0010\u0017\u001a\u00020\u0018\"\u00020\u0019H\u0007J%\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0016J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b!J\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\tH\u0007J\f\u0010\u000b\u001a\u00020\u0004*\u00020\tH\u0007J\u001b\u0010\"\u001a\u00020\u0004*\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\rJ\f\u0010\u0011\u001a\u00020\u0004*\u00020\tH\u0007J\u0019\u0010#\u001a\u00020\u0004*\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u001eJ\u0011\u0010$\u001a\u00020\u0004*\u00020\u0015H\u0007¢\u0006\u0002\b\u0013J%\u0010$\u001a\u00020\u0004*\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lokio/ByteString$Companion;", "", "()V", "EMPTY", "Lokio/ByteString;", "serialVersionUID", "", "decodeBase64", "string", "", "-deprecated_decodeBase64", "decodeHex", "-deprecated_decodeHex", "encodeString", "charset", "Ljava/nio/charset/Charset;", "-deprecated_encodeString", "encodeUtf8", "-deprecated_encodeUtf8", "of", "buffer", "Ljava/nio/ByteBuffer;", "-deprecated_of", "data", "", "", "array", TypedValues.CycleType.S_WAVE_OFFSET, "", "byteCount", "read", "inputstream", "Ljava/io/InputStream;", "-deprecated_read", "encode", "readByteString", "toByteString", "okio"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52355a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52356b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ abw a(Object[] objArr) {
            String str = (String) objArr[0];
            int i10 = f52356b;
            int i11 = i10 & 9;
            int i12 = -(-((i10 ^ 9) | i11));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            f52355a = i13 % 128;
            if (i13 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            byte[] bArr = (byte[]) acx.setX(new Object[]{str}, -732811547, 732811548, (int) System.currentTimeMillis());
            if (bArr == null) {
                int i14 = f52355a;
                int i15 = (((i14 | 74) << 1) - (i14 ^ 74)) - 1;
                f52356b = i15 % 128;
                int i16 = i15 % 2;
                return null;
            }
            abw abwVar = new abw(bArr);
            int i17 = f52356b;
            int i18 = ((((i17 ^ 111) | (i17 & 111)) << 1) - (~(-(((~i17) & 111) | (i17 & (-112)))))) - 1;
            f52355a = i18 % 128;
            if (i18 % 2 == 0) {
                return abwVar;
            }
            throw null;
        }

        @JvmStatic
        @JvmName(name = "read")
        @NotNull
        public static abw setCompoundDrawableTintBlendMode(@NotNull InputStream inputStream, int i10) throws IOException {
            return (abw) setOnFocusChangeListener(new Object[]{inputStream, Integer.valueOf(i10)}, 1943804390, -1943804390, i10);
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException {
            abw abwVar;
            int i13 = (i11 * (-520)) + (i10 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY);
            int i14 = ~i12;
            int i15 = ((i11 | i12) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (((~(i14 | i11)) | i10) * (-1042)) + i13;
            int i16 = ~i10;
            int i17 = (((~(i10 | i14 | i11)) | (~(i12 | i16)) | (~((~i11) | i16))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i15;
            int i18 = 0;
            int i19 = 1;
            switch (i17) {
                case 1:
                    return a(objArr);
                case 2:
                    byte[] bArr = (byte[]) objArr[0];
                    Intrinsics.checkNotNullParameter(bArr, "");
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                    Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
                    abwVar = new abw(bArrCopyOf);
                    int i20 = f52355a + 115;
                    f52356b = i20 % 128;
                    int i21 = i20 % 2;
                    break;
                case 3:
                    byte[] bArr2 = (byte[]) objArr[0];
                    ((Number) objArr[1]).intValue();
                    int iIntValue = ((Number) objArr[2]).intValue();
                    Intrinsics.checkNotNullParameter(bArr2, "");
                    acv.setOnFocusChangeListener(new Object[]{Long.valueOf(bArr2.length), 0L, Long.valueOf(iIntValue)}, 1264570852, -1264570848, (int) System.currentTimeMillis());
                    abwVar = new abw(ArraysKt___ArraysJvmKt.copyOfRange(bArr2, 0, iIntValue));
                    int i22 = f52355a;
                    int i23 = i22 ^ 59;
                    int i24 = -(-((i22 & 59) << 1));
                    int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                    f52356b = i25 % 128;
                    if (i25 % 2 == 0) {
                        int i26 = 17 / 0;
                    }
                    break;
                case 4:
                    String str = (String) objArr[0];
                    int i27 = f52355a;
                    int i28 = (i27 ^ 9) + ((i27 & 9) << 1);
                    f52356b = i28 % 128;
                    int i29 = i28 % 2;
                    Intrinsics.checkNotNullParameter(str, "");
                    if (str.length() % 2 != 0) {
                        int i30 = f52355a;
                        int i31 = i30 & 1;
                        int i32 = (i30 ^ 1) | i31;
                        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                        f52356b = i33 % 128;
                        int i34 = i33 % 2;
                        throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected hex string: ", str).toString());
                    }
                    int i35 = f52355a;
                    int i36 = i35 ^ 59;
                    int i37 = (i35 & 59) << 1;
                    int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
                    f52356b = i38 % 128;
                    int i39 = i38 % 2;
                    int i40 = ((((i35 ^ 49) | (i35 & 49)) << 1) - (~(-(((~i35) & 49) | (i35 & (-50)))))) - 1;
                    f52356b = i40 % 128;
                    int i41 = i40 % 2;
                    int length = str.length() / 2;
                    byte[] bArr3 = new byte[length];
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i42 = length * 246;
                    int i43 = 244 ^ i42;
                    int i44 = (i42 & 244) << 1;
                    int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                    int i46 = ~length;
                    int i47 = (length | i46) & i46;
                    int i48 = ~iCurrentTimeMillis;
                    int i49 = (i48 | iCurrentTimeMillis) & i48;
                    int i50 = ((~i49) & i47) | ((~i47) & i49);
                    int i51 = i47 & i49;
                    int i52 = -(-((~((i51 & i50) | (i50 ^ i51))) * (-245)));
                    int i53 = i45 ^ i52;
                    int i54 = -(-((i52 & i45) << 1));
                    int i55 = (i53 & i54) + (i54 | i53);
                    int i56 = (i46 & i48) | ((~i46) & iCurrentTimeMillis);
                    int i57 = i46 & iCurrentTimeMillis;
                    int i58 = (i56 & i57) | (i56 ^ i57);
                    int i59 = ~i58;
                    int i60 = -(-(((i58 | i59) & i59) * (-245)));
                    int i61 = (i55 & i60) + (i60 | i55);
                    int i62 = (~i57) & (iCurrentTimeMillis | i46);
                    int i63 = ~((i62 & i57) | (i62 ^ i57));
                    int i64 = -(-((i63 | (i63 ^ (-1))) * 245));
                    int i65 = i61 & i64;
                    int i66 = i64 | i61;
                    int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                    if (i67 >= 0) {
                        int i68 = 0;
                        while (true) {
                            int i69 = (i68 & 81) | ((~i68) & (-82));
                            int i70 = (i68 & (-82)) << i19;
                            int i71 = (i69 & i70) + (i69 | i70);
                            int i72 = i71 & 83;
                            int i73 = (i71 ^ 83) | i72;
                            int i74 = ((i72 | i73) << i19) - (i72 ^ i73);
                            int i75 = i68 << 1;
                            Object[] objArr2 = new Object[i19];
                            objArr2[i18] = Character.valueOf(str.charAt(i75));
                            int iIntValue2 = ((Integer) ada.setY(objArr2, 1252622540, -1252622537, (int) System.currentTimeMillis())).intValue() << 4;
                            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                            int i76 = -(-(i75 * (-112)));
                            int i77 = (((-112) | i76) << 1) - (i76 ^ (-112));
                            int i78 = ~i75;
                            int i79 = (i78 | i75) & i78;
                            int i80 = ~iCurrentTimeMillis2;
                            int i81 = ~(i79 | i80);
                            int i82 = ((~i81) & i19) | (i81 & (-2));
                            int i83 = i81 & i19;
                            int i84 = ((i82 ^ i83) | (i83 & i82)) * 226;
                            int i85 = i77 | i84;
                            int i86 = i85 << 1;
                            int i87 = -((~(i77 & i84)) & i85);
                            int i88 = ((i86 | i87) << i19) - (i86 ^ i87);
                            int i89 = ((-2) & i78) | (i75 & 1);
                            int i90 = i75 & (-2);
                            int i91 = ~((i89 ^ i90) | (i89 & i90));
                            int i92 = ((-2) & i80) | (iCurrentTimeMillis2 & 1);
                            int i93 = (-2) & iCurrentTimeMillis2;
                            int i94 = (~((i92 ^ i93) | (i92 & i93))) | i91;
                            int i95 = i78 & i80;
                            int i96 = (i80 | i78) & (~i95);
                            int i97 = (i96 & i95) | (i96 ^ i95);
                            int i98 = i97 & 1;
                            int i99 = (i97 | i19) & (~i98);
                            int i100 = (i99 & i98) | (i99 ^ i98);
                            int i101 = ~i100;
                            int i102 = (i100 | i101) & i101;
                            int i103 = i94 ^ i102;
                            int i104 = i102 & i94;
                            int i105 = -(-(((i104 & i103) | (i103 ^ i104)) * (-113)));
                            int i106 = ((i88 | i105) << i19) - (i105 ^ i88);
                            int i107 = i79 & iCurrentTimeMillis2;
                            int i108 = (~i107) & (iCurrentTimeMillis2 | i79);
                            int i109 = -(~((~((i107 & i108) | (i108 ^ i107))) * 113));
                            char cCharAt = str.charAt(((i106 ^ i109) + ((i109 & i106) << i19)) - i19);
                            Object[] objArr3 = new Object[i19];
                            objArr3[i18] = Character.valueOf(cCharAt);
                            int iIntValue3 = ((Integer) ada.setY(objArr3, 1252622540, -1252622537, (int) System.currentTimeMillis())).intValue();
                            int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                            int i110 = iIntValue3 * (-755);
                            int i111 = -(-(iIntValue2 * (-755)));
                            int i112 = ((i110 | i111) << i19) - (i110 ^ i111);
                            int i113 = ~iIntValue3;
                            int i114 = ~iIntValue2;
                            int i115 = ((~i114) & i113) | ((~i113) & i114);
                            int i116 = i113 & i114;
                            int i117 = (i115 & i116) | (i115 ^ i116);
                            int i118 = ~i117;
                            int i119 = -(-(((i117 | i118) & i118) * 1512));
                            int i120 = (((~i119) & i112) | ((~i112) & i119)) + ((i112 & i119) << i19);
                            int i121 = ~(i113 | i114);
                            int i122 = iIntValue3 & iIntValue2;
                            int i123 = (~i122) & (iIntValue3 | iIntValue2);
                            int i124 = (i123 ^ i122) | (i123 & i122);
                            int i125 = ~((i124 ^ iCurrentTimeMillis3) | (i124 & iCurrentTimeMillis3));
                            int i126 = i121 & i125;
                            int i127 = (~i126) & (i121 | i125);
                            int i128 = ((i126 & i127) | (i127 ^ i126)) * (-756);
                            int i129 = i120 & i128;
                            int i130 = i129 + ((i128 ^ i120) | i129);
                            int i131 = (iIntValue3 & i114) | (iIntValue2 & i113);
                            int i132 = (i131 & i122) | (i131 ^ i122);
                            int i133 = ~iCurrentTimeMillis3;
                            int i134 = ((~i133) & i132) | ((~i132) & i133);
                            int i135 = i132 & i133;
                            int i136 = ((i135 & i134) | (i134 ^ i135)) * 756;
                            bArr3[i68] = (byte) ((i130 ^ i136) + ((i136 & i130) << 1));
                            if (i74 <= i67) {
                                i68 = i74;
                                i18 = 0;
                                i19 = 1;
                            }
                        }
                    }
                    abw abwVar2 = new abw(bArr3);
                    int i137 = f52356b;
                    int i138 = (i137 & 68) + (i137 | 68);
                    int i139 = (i138 ^ (-1)) + (i138 << 1);
                    f52355a = i139 % 128;
                    if (i139 % 2 == 0) {
                        return abwVar2;
                    }
                    throw null;
                case 5:
                    byte[] bArr4 = (byte[]) objArr[0];
                    int i140 = f52355a;
                    int i141 = (i140 & 52) + (i140 | 52);
                    int i142 = (i141 ^ (-1)) + (i141 << 1);
                    f52356b = i142 % 128;
                    abw abwVar3 = (abw) (i142 % 2 == 0 ? setOnFocusChangeListener(new Object[]{bArr4, 1, Integer.valueOf(bArr4.length)}, 64237411, -64237408, 1) : setOnFocusChangeListener(new Object[]{bArr4, 0, Integer.valueOf(bArr4.length)}, 64237411, -64237408, 0));
                    int i143 = f52356b;
                    int i144 = (i143 & 63) + (i143 | 63);
                    f52355a = i144 % 128;
                    if (i144 % 2 == 0) {
                        return abwVar3;
                    }
                    throw null;
                case 6:
                    String str2 = (String) objArr[0];
                    Intrinsics.checkNotNullParameter(str2, "");
                    abwVar = new abw((byte[]) acw.setDividerPadding(new Object[]{str2}, 211431428, -211431427, (int) System.currentTimeMillis()));
                    abw.setX(new Object[]{abwVar, str2}, 737029192, -737029180, System.identityHashCode(abwVar));
                    int i145 = f52356b;
                    int i146 = (i145 & 45) + (i145 | 45);
                    f52355a = i146 % 128;
                    if (i146 % 2 != 0) {
                        throw null;
                    }
                    break;
                case 7:
                    String str3 = (String) objArr[0];
                    Charset charset = (Charset) objArr[1];
                    Intrinsics.checkNotNullParameter(str3, "");
                    Intrinsics.checkNotNullParameter(charset, "");
                    byte[] bytes = str3.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    abw abwVar4 = new abw(bytes);
                    int i147 = f52356b;
                    int i148 = (i147 & 39) + (i147 | 39);
                    f52355a = i148 % 128;
                    int i149 = i148 % 2;
                    return abwVar4;
                default:
                    InputStream inputStream = (InputStream) objArr[0];
                    int iIntValue4 = ((Number) objArr[1]).intValue();
                    int i150 = f52356b;
                    int i151 = i150 & 117;
                    int i152 = -(-((i150 ^ 117) | i151));
                    int i153 = (i151 & i152) + (i152 | i151);
                    f52355a = i153 % 128;
                    int i154 = i153 % 2;
                    Intrinsics.checkNotNullParameter(inputStream, "");
                    if (iIntValue4 >= 0) {
                        int i155 = f52356b;
                        int i156 = (i155 & (-54)) | ((~i155) & 53);
                        int i157 = (i155 & 53) << 1;
                        int i158 = (i156 & i157) + (i157 | i156);
                        int i159 = i158 % 128;
                        f52355a = i159;
                        boolean z10 = i158 % 2 == 0;
                        int i160 = ((i159 ^ 118) + ((i159 & 118) << 1)) - 1;
                        int i161 = i160 % 128;
                        f52356b = i161;
                        int i162 = i160 % 2;
                        if (z10) {
                            byte[] bArr5 = new byte[iIntValue4];
                            int i163 = i161 & 23;
                            int i164 = (i161 | 23) & (~i163);
                            int i165 = i163 << 1;
                            int i166 = (i164 ^ i165) + ((i165 & i164) << 1);
                            f52355a = i166 % 128;
                            int i167 = i166 % 2;
                            while (i18 < iIntValue4) {
                                int i168 = f52356b;
                                int i169 = i168 & 47;
                                int i170 = (i169 - (~(-(-((i168 ^ 47) | i169))))) - 1;
                                f52355a = i170 % 128;
                                int i171 = i170 % 2;
                                int i172 = -i18;
                                int i173 = i172 * 765;
                                int i174 = -(-(iIntValue4 * (-1527)));
                                int i175 = i173 ^ i174;
                                int i176 = -(-((i173 & i174) << 1));
                                int i177 = ((i175 | i176) << 1) - (i176 ^ i175);
                                int i178 = ~iIntValue4;
                                int i179 = i178 ^ i172;
                                int i180 = ~i172;
                                int i181 = i178 & i172;
                                int i182 = ~(i179 | i181);
                                int i183 = -(-(((i182 & iIntValue4) | (iIntValue4 ^ i182)) * 764));
                                int i184 = (i177 ^ i183) + ((i177 & i183) << 1);
                                int i185 = ~(i180 | iIntValue4);
                                int i186 = i178 & iIntValue4;
                                int i187 = (~i186) & (i178 | iIntValue4);
                                int i188 = ~((i186 & i187) | (i187 ^ i186));
                                int i189 = i185 & i188;
                                int i190 = (i188 | i185) & (~i189);
                                int i191 = ((i190 & i189) | (i190 ^ i189)) * (-1528);
                                int i192 = ((i184 ^ i191) | (i184 & i191)) << 1;
                                int i193 = -((i191 & (~i184)) | ((~i191) & i184));
                                int i194 = (i192 ^ i193) + ((i193 & i192) << 1);
                                int i195 = ~((i179 & i181) | (i179 ^ i181));
                                int i196 = i185 ^ i195;
                                int i197 = i185 & i195;
                                int i198 = (i197 & i196) | (i196 ^ i197);
                                int i199 = ~(((i172 | i178) & (~i181)) | i181);
                                int i200 = ((~i199) & i198) | ((~i198) & i199);
                                int i201 = i199 & i198;
                                int i202 = ((i201 & i200) | (i200 ^ i201)) * 764;
                                int i203 = i194 & i202;
                                int i204 = inputStream.read(bArr5, i18, (i203 - (~(-(-((i202 ^ i194) | i203))))) - 1);
                                if (i204 == -1) {
                                    throw new EOFException();
                                }
                                int i205 = i204 * 630;
                                int i206 = -(-(i18 * (-628)));
                                int i207 = i205 ^ i206;
                                int i208 = ((i205 & i206) | i207) << 1;
                                int i209 = -i207;
                                int i210 = (i208 & i209) + (i208 | i209);
                                int i211 = ~i18;
                                int i212 = i211 * (-629);
                                int i213 = (i210 ^ i212) + ((i212 & i210) << 1);
                                int i214 = ~i204;
                                int i215 = i214 ^ i211;
                                int i216 = i211 & i214;
                                int i217 = -(-((~((i216 & i215) | (i215 ^ i216))) * (-629)));
                                int i218 = i213 & i217;
                                int i219 = (((i213 ^ i217) | i218) << 1) - ((i217 | i213) & (~i218));
                                int i220 = i18 & i214;
                                int i221 = (i18 | i214) & (~i220);
                                int i222 = -(-(((i221 & i220) | (i221 ^ i220)) * 629));
                                int i223 = i219 ^ i222;
                                int i224 = ((i222 & i219) | i223) << 1;
                                int i225 = -i223;
                                i18 = ((i224 & i225) << 1) + (i224 ^ i225);
                                int i226 = f52355a;
                                int i227 = (i226 ^ 65) + ((i226 & 65) << 1);
                                f52356b = i227 % 128;
                                int i228 = i227 % 2;
                            }
                            abw abwVar5 = new abw(bArr5);
                            int i229 = f52355a;
                            int i230 = ((i229 | 105) << 1) - (i229 ^ 105);
                            f52356b = i230 % 128;
                            int i231 = i230 % 2;
                            return abwVar5;
                        }
                    } else {
                        int i232 = f52356b;
                        int i233 = i232 ^ 9;
                        int i234 = -(-((i232 & 9) << 1));
                        int i235 = ((i233 | i234) << 1) - (i234 ^ i233);
                        f52355a = i235 % 128;
                        int i236 = i235 % 2;
                    }
                    throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Integer.valueOf(iIntValue4)).toString());
            }
            return abwVar;
        }

        @JvmStatic
        @Nullable
        public static abw setX(@NotNull String str) {
            return (abw) setOnFocusChangeListener(new Object[]{str}, 1346172271, -1346172270, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ abw setY(byte[] bArr) {
            return (abw) setOnFocusChangeListener(new Object[]{bArr}, -1017512087, 1017512092, (int) System.currentTimeMillis());
        }

        @JvmStatic
        @NotNull
        public static abw setCompoundDrawableTintBlendMode(@NotNull String str) {
            return (abw) setOnFocusChangeListener(new Object[]{str}, 948642662, -948642658, (int) System.currentTimeMillis());
        }

        @JvmStatic
        @NotNull
        public static abw setCompoundDrawableTintBlendMode(@NotNull byte... bArr) {
            return (abw) setOnFocusChangeListener(new Object[]{bArr}, -1322912439, 1322912441, (int) System.currentTimeMillis());
        }

        @JvmStatic
        @JvmName(name = "encodeString")
        @NotNull
        public static abw setOnFocusChangeListener(@NotNull String str, @NotNull Charset charset) {
            return (abw) setOnFocusChangeListener(new Object[]{str, charset}, -1333891698, 1333891705, (int) System.currentTimeMillis());
        }

        @JvmStatic
        @NotNull
        public static abw setOnFocusChangeListener(@NotNull String str) {
            return (abw) setOnFocusChangeListener(new Object[]{str}, 1688839712, -1688839706, (int) System.currentTimeMillis());
        }
    }

    static {
        int i10 = f52350s0 + 11;
        f52351t0 = i10 % 128;
        int i11 = i10 % 2;
    }

    public abw(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.setY = bArr;
    }

    public static /* synthetic */ Integer a(Object[] objArr) throws NoSuchAlgorithmException {
        abw abwVar = (abw) objArr[0];
        abw abwVar2 = (abw) objArr[1];
        int i10 = f52350s0 + 19;
        f52351t0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(abwVar2, "");
        int iIntValue = ((Integer) setX(new Object[]{abwVar}, -1716166708, 1716166712, System.identityHashCode(abwVar))).intValue();
        int iIntValue2 = ((Integer) setX(new Object[]{abwVar2}, -1716166708, 1716166712, System.identityHashCode(abwVar2))).intValue();
        int iMin = Math.min(iIntValue, iIntValue2);
        int i12 = f52350s0;
        int i13 = i12 | 95;
        int i14 = ((i13 << 1) - (~(-((~(i12 & 95)) & i13)))) - 1;
        f52351t0 = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 0;
        while (i16 < iMin) {
            int i17 = f52350s0;
            int i18 = i17 & 93;
            int i19 = (i17 | 93) & (~i18);
            int i20 = i18 << 1;
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            f52351t0 = i21 % 128;
            int i22 = i21 % 2;
            int iByteValue = ((Byte) setX(new Object[]{abwVar, Integer.valueOf(i16)}, 2055130869, -2055130861, i16)).byteValue() & 255;
            int iByteValue2 = ((Byte) setX(new Object[]{abwVar2, Integer.valueOf(i16)}, 2055130869, -2055130861, i16)).byteValue() & 255;
            if (iByteValue != iByteValue2) {
                if (iByteValue >= iByteValue2) {
                    int i23 = f52351t0 + 43;
                    f52350s0 = i23 % 128;
                    if (i23 % 2 == 0) {
                        return 1;
                    }
                    throw null;
                }
                int i24 = f52351t0 + 35;
                int i25 = i24 % 128;
                f52350s0 = i25;
                int i26 = i24 % 2;
                int i27 = ((((i25 ^ 37) | (i25 & 37)) << 1) - (~(-(((~i25) & 37) | (i25 & (-38)))))) - 1;
                f52351t0 = i27 % 128;
                int i28 = i27 % 2;
                return -1;
            }
            int i29 = f52351t0;
            int i30 = (i29 ^ 125) + ((i29 & 125) << 1);
            int i31 = i30 % 128;
            f52350s0 = i31;
            int i32 = i30 % 2;
            int i33 = i16 & 1;
            i16 = ((i16 ^ 1) | i33) + i33;
            int i34 = i31 ^ 7;
            int i35 = -(-((i31 & 7) << 1));
            int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
            f52351t0 = i36 % 128;
            int i37 = i36 % 2;
        }
        if (iIntValue == iIntValue2) {
            int i38 = f52351t0;
            int i39 = (i38 ^ 51) + ((i38 & 51) << 1);
            f52350s0 = i39 % 128;
            int i40 = i39 % 2;
            int i41 = ((i38 ^ 11) | (i38 & 11)) << 1;
            int i42 = -(((~i38) & 11) | (i38 & (-12)));
            int i43 = (i41 & i42) + (i42 | i41);
            f52350s0 = i43 % 128;
            if (i43 % 2 == 0) {
                return 0;
            }
            throw null;
        }
        if (iIntValue >= iIntValue2) {
            int i44 = f52350s0;
            int i45 = i44 & 113;
            int i46 = ((((i44 ^ 113) | i45) << 1) - (~(-((i44 | 113) & (~i45))))) - 1;
            f52351t0 = i46 % 128;
            int i47 = i46 % 2;
            return 1;
        }
        int iIdentityHashCode = System.identityHashCode(abwVar);
        int i48 = ~iIdentityHashCode;
        int i49 = ((-671613764) & iIdentityHashCode) | (671613763 & i48);
        int i50 = iIdentityHashCode & 671613763;
        int i51 = (-716559702) - (~(((i49 & i50) | (i49 ^ i50)) * 988));
        int i52 = ~((1391807640 & i48) | ((~i48) & (-1391807641)) | (i48 & (-1391807641)));
        int i53 = 1085539480 & i52;
        int i54 = (i52 | 1085539480) & (~i53);
        int i55 = -(-(((i54 & i53) | (i54 ^ i53)) * (-1976)));
        int i56 = (i51 & i55) + (i55 | i51);
        int i57 = 977881923 & iIdentityHashCode;
        int i58 = (iIdentityHashCode | 977881923) & (~i57);
        int i59 = (i58 & i57) | (i58 ^ i57);
        int i60 = ~i59;
        int i61 = (i59 | i60) & i60;
        int i62 = 671613763 & i61;
        int i63 = (i61 | 671613763) & (~i62);
        int i64 = (i63 & i62) | (i63 ^ i62);
        int i65 = ((-977881924) & i48) | (i48 ^ (-977881924));
        int i66 = ~i65;
        int i67 = (i65 | i66) & i66;
        int i68 = i64 & i67;
        int i69 = (i64 | i67) & (~i68);
        int i70 = -(-(((i69 & i68) | (i69 ^ i68)) * 988));
        int i71 = (i56 ^ i70) + ((i70 & i56) << 1);
        int iIdentityHashCode2 = System.identityHashCode(abwVar);
        int i72 = (-1073808673) & iIdentityHashCode2;
        int i73 = ((-1073808673) | iIdentityHashCode2) & (~i72);
        int i74 = ~((i73 & i72) | (i73 ^ i72));
        int i75 = ~iIdentityHashCode2;
        int i76 = i75 & (i75 | iIdentityHashCode2);
        int i77 = i76 & 1342549944;
        int i78 = (i76 | 1342549944) & (~i77);
        int i79 = (i78 & i77) | (i78 ^ i77);
        int i80 = i79 & (-961342172);
        int i81 = (i79 | (-961342172)) & (~i80);
        int i82 = ~((i81 & i80) | (i81 ^ i80));
        int i83 = -(-(((i74 & i82) | ((~i82) & i74) | ((~i74) & i82)) * (-318)));
        int i84 = ((-2112044796) & i83) + (i83 | (-2112044796));
        int i85 = 1342549944 & iIdentityHashCode2;
        int i86 = (~i85) & (1342549944 | iIdentityHashCode2);
        int i87 = (i85 & i86) | (i86 ^ i85);
        int i88 = ~i87;
        int i89 = (i87 | i88) & i88;
        int i90 = (-2035150844) & i89;
        int i91 = (i89 | (-2035150844)) & (~i90);
        int i92 = (((i91 & i90) | (i91 ^ i90)) * (-318)) + i84;
        int i93 = (-1342549945) ^ iIdentityHashCode2;
        int i94 = iIdentityHashCode2 & (-1342549945);
        int i95 = (i94 & i93) | (i93 ^ i94);
        int i96 = ~i95;
        int i97 = (i95 | i96) & i96;
        int i98 = 961342171 & i97;
        int i99 = (i97 | 961342171) & (~i98);
        int i100 = -(-(((i99 & i98) | (i99 ^ i98)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
        int i101 = i92 ^ i100;
        int i102 = ((i100 & i92) | i101) << 1;
        int i103 = -i101;
        if (i71 <= ((i102 | i103) << 1) - (i102 ^ i103)) {
            int i104 = 11 / 0;
        }
        int i105 = f52350s0;
        int i106 = i105 & 9;
        int i107 = i106 + ((i105 ^ 9) | i106);
        f52351t0 = i107 % 128;
        int i108 = i107 % 2;
        return -1;
    }

    public static /* synthetic */ void b(Object[] objArr) {
        abw abwVar = (abw) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f52350s0;
        int i11 = (i10 & (-122)) | ((~i10) & 121);
        int i12 = (i10 & 121) << 1;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        f52351t0 = i13 % 128;
        int i14 = i13 % 2;
        abwVar.setOnFocusChangeListener = iIntValue;
        if (i14 == 0) {
            throw null;
        }
        int i15 = i10 & 45;
        int i16 = -(-(i10 | 45));
        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
        f52351t0 = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
    }

    private final void readObject(ObjectInputStream in2) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i10 = f52351t0;
        int i11 = (i10 ^ 45) + ((i10 & 45) << 1);
        f52350s0 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = in2.readInt();
            abw abwVar = (abw) Companion.setOnFocusChangeListener(new Object[]{in2, Integer.valueOf(i12)}, 1943804390, -1943804390, i12);
            Field declaredField = abw.class.getDeclaredField("p0");
            declaredField.setAccessible(false);
            declaredField.set(this, abwVar.setY);
            return;
        }
        int i13 = in2.readInt();
        abw abwVar2 = (abw) Companion.setOnFocusChangeListener(new Object[]{in2, Integer.valueOf(i13)}, 1943804390, -1943804390, i13);
        Field declaredField2 = abw.class.getDeclaredField("p0");
        declaredField2.setAccessible(true);
        declaredField2.set(this, abwVar2.setY);
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException {
        abw dividerPadding;
        switch (((i10 | (~(i11 | (~i12)))) * 56) + ((~(i10 | i11)) * (-56)) + (((~(i10 | i12)) | i11) * 56) + (i11 * (-55)) + (i10 * (-55))) {
            case 1:
                b(objArr);
                return null;
            case 2:
                return a(objArr);
            case 3:
                abw abwVar = (abw) objArr[0];
                abw abwVar2 = (abw) objArr[1];
                int i13 = f52351t0 + 66;
                int i14 = (i13 ^ (-1)) + (i13 << 1);
                f52350s0 = i14 % 128;
                int i15 = i14 % 2;
                Intrinsics.checkNotNullParameter(abwVar2, "");
                boolean compoundDrawableTintBlendMode = abwVar.setCompoundDrawableTintBlendMode(abwVar2, ((Integer) setX(new Object[]{abwVar2}, -1716166708, 1716166712, System.identityHashCode(abwVar2))).intValue());
                int i16 = f52350s0;
                int i17 = i16 & 111;
                int i18 = i17 + ((i16 ^ 111) | i17);
                f52351t0 = i18 % 128;
                int i19 = i18 % 2;
                return Boolean.valueOf(compoundDrawableTintBlendMode);
            case 4:
                abw abwVar3 = (abw) objArr[0];
                int i20 = f52351t0 + 63;
                f52350s0 = i20 % 128;
                int i21 = i20 % 2;
                int iUiMessageCallbackKtWhenMappings = abwVar3.UiMessageCallbackKtWhenMappings();
                int i22 = (-2) - ((f52350s0 + 110) ^ (-1));
                f52351t0 = i22 % 128;
                int i23 = i22 % 2;
                return Integer.valueOf(iUiMessageCallbackKtWhenMappings);
            case 5:
                abw abwVar4 = (abw) objArr[0];
                int i24 = f52350s0;
                int i25 = ((i24 | 55) << 1) - (i24 ^ 55);
                f52351t0 = i25 % 128;
                if (i25 % 2 == 0) {
                    abwVar4.setDividerPadding(McElieceCCA2KeyGenParameterSpec.SHA1);
                    throw null;
                }
                dividerPadding = abwVar4.setDividerPadding(McElieceCCA2KeyGenParameterSpec.SHA1);
                int i26 = f52350s0;
                int i27 = i26 ^ 111;
                int i28 = ((((i26 & 111) | i27) << 1) - (~(-i27))) - 1;
                f52351t0 = i28 % 128;
                if (i28 % 2 == 0) {
                    throw null;
                }
                break;
            case 6:
                abw abwVar5 = (abw) objArr[0];
                int i29 = f52350s0;
                int i30 = ((i29 ^ 16) + ((i29 & 16) << 1)) - 1;
                f52351t0 = i30 % 128;
                int i31 = i30 % 2;
                dividerPadding = abwVar5.setDividerPadding("MD5");
                int i32 = f52350s0;
                int i33 = i32 ^ 71;
                int i34 = (i32 & 71) << 1;
                int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                f52351t0 = i35 % 128;
                if (i35 % 2 == 0) {
                    throw null;
                }
                break;
            case 7:
                abw abwVar6 = (abw) objArr[0];
                int i36 = f52351t0 + 95;
                f52350s0 = i36 % 128;
                int i37 = i36 % 2;
                String str = (String) setX(new Object[]{abwVar6}, -1583623979, 1583623988, System.identityHashCode(abwVar6));
                if (str == null) {
                    System.identityHashCode(abwVar6);
                    System.identityHashCode(abwVar6);
                    str = (String) acw.setDividerPadding(new Object[]{abwVar6.setAlwaysDrawnWithCacheEnabled()}, 1446332990, -1446332990, (int) System.currentTimeMillis());
                    setX(new Object[]{abwVar6, str}, 737029192, -737029180, System.identityHashCode(abwVar6));
                    int i38 = f52351t0;
                    int i39 = (i38 ^ 41) + ((i38 & 41) << 1);
                    f52350s0 = i39 % 128;
                    int i40 = i39 % 2;
                }
                String str2 = str;
                int i41 = f52351t0;
                int i42 = i41 & 123;
                int i43 = ((i41 ^ 123) | i42) << 1;
                int i44 = -((i41 | 123) & (~i42));
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                f52350s0 = i45 % 128;
                int i46 = i45 % 2;
                return str2;
            case 8:
                abw abwVar7 = (abw) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i47 = f52351t0;
                int i48 = (i47 | 45) << 1;
                int i49 = -(((~i47) & 45) | (i47 & (-46)));
                int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                f52350s0 = i50 % 128;
                int i51 = i50 % 2;
                byte y7 = abwVar7.setY(iIntValue);
                int i52 = f52351t0;
                int i53 = ((i52 | 105) << 1) - (i52 ^ 105);
                f52350s0 = i53 % 128;
                if (i53 % 2 == 0) {
                    return Byte.valueOf(y7);
                }
                throw null;
            case 9:
                abw abwVar8 = (abw) objArr[0];
                int iIdentityHashCode = System.identityHashCode(abwVar8);
                int i54 = ~iIdentityHashCode;
                int i55 = (i54 & (-134811657)) | ((-134811657) ^ i54);
                int i56 = ~i55;
                int i57 = (i55 | i56) & i56;
                int i58 = i57 & 1073284;
                int i59 = (i57 | 1073284) & (~i58);
                int i60 = ((i59 & i58) | (i59 ^ i58)) * (-591);
                int i61 = ((-1162640122) ^ i60) + ((i60 & (-1162640122)) << 1);
                int i62 = iIdentityHashCode & 55764869;
                int i63 = -(-((((iIdentityHashCode | 55764869) & (~i62)) | i62 | (-189503242)) * 591));
                int i64 = i61 & i63;
                int i65 = (i63 | i61) & (~i64);
                int i66 = i64 << 1;
                int i67 = (i65 ^ i66) + ((i65 & i66) << 1);
                int i68 = ~System.identityHashCode(abwVar8);
                int i69 = ((~i68) & (-393955249)) | (393955248 & i68);
                int i70 = i68 & (-393955249);
                int i71 = (i70 & i69) | (i69 ^ i70);
                int i72 = i71 * 495;
                int i73 = ((-1836900110) & i72) + (i72 | (-1836900110));
                int i74 = ~i71;
                int i75 = (-2004830134) & i74;
                int i76 = (i74 | (-2004830134)) & (~i75);
                int i77 = -(~(((i76 & i75) | (i76 ^ i75)) * 495));
                if (i67 > ((i73 & i77) + (i77 | i73)) - 1) {
                    return abwVar8.setX;
                }
                String str3 = abwVar8.setX;
                throw null;
            case 10:
                abw abwVar9 = (abw) objArr[0];
                int i78 = f52350s0;
                int i79 = ((i78 | 91) << 1) - (i78 ^ 91);
                f52351t0 = i79 % 128;
                int i80 = i79 % 2;
                int i81 = abwVar9.setOnFocusChangeListener;
                int i82 = i78 + 85;
                f52351t0 = i82 % 128;
                int i83 = i82 % 2;
                return Integer.valueOf(i81);
            case 11:
                abw abwVar10 = (abw) objArr[0];
                int i84 = f52350s0;
                int i85 = (i84 ^ 7) + ((i84 & 7) << 1);
                int i86 = i85 % 128;
                f52351t0 = i86;
                int i87 = i85 % 2;
                byte[] bArr = abwVar10.setY;
                int i88 = i86 + 91;
                f52350s0 = i88 % 128;
                int i89 = i88 % 2;
                return bArr;
            case 12:
                abw abwVar11 = (abw) objArr[0];
                String str4 = (String) objArr[1];
                int i90 = f52350s0;
                int i91 = (i90 & 27) + (i90 | 27);
                f52351t0 = i91 % 128;
                int i92 = i91 % 2;
                abwVar11.setX = str4;
                int i93 = i90 & 63;
                int i94 = i93 + ((i90 ^ 63) | i93);
                f52351t0 = i94 % 128;
                if (i94 % 2 != 0) {
                    return null;
                }
                throw null;
            default:
                abw abwVar12 = (abw) objArr[0];
                int i95 = f52350s0;
                int i96 = i95 & 9;
                int i97 = (i95 | 9) & (~i96);
                int i98 = i96 << 1;
                int i99 = ((i97 | i98) << 1) - (i97 ^ i98);
                f52351t0 = i99 % 128;
                int i100 = i99 % 2;
                abw dividerPadding2 = abwVar12.setDividerPadding("SHA-256");
                int i101 = f52351t0;
                int i102 = i101 ^ 63;
                int i103 = ((i101 & 63) | i102) << 1;
                int i104 = -i102;
                int i105 = ((i103 | i104) << 1) - (i103 ^ i104);
                f52350s0 = i105 % 128;
                int i106 = i105 % 2;
                return dividerPadding2;
        }
        return dividerPadding;
    }

    private final void writeObject(ObjectOutputStream out) throws IOException {
        int i10 = f52351t0;
        int i11 = i10 & 57;
        int i12 = (i10 | 57) & (~i11);
        int i13 = i11 << 1;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f52350s0 = i14 % 128;
        if (i14 % 2 == 0) {
            out.writeInt(this.setY.length);
            out.write(this.setY);
        } else {
            out.writeInt(this.setY.length);
            out.write(this.setY);
            int i15 = 20 / 0;
        }
    }

    public int UiMessageCallbackKtWhenMappings() throws NoSuchAlgorithmException {
        int i10 = f52350s0 + 77;
        f52351t0 = i10 % 128;
        int i11 = i10 % 2;
        int length = ((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this))).length;
        int i12 = f52351t0;
        int i13 = (i12 & 33) + (i12 | 33);
        f52350s0 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 80 / 0;
        }
        return length;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(abw abwVar) {
        int i10 = f52350s0;
        int i11 = i10 & 63;
        int i12 = i11 + ((i10 ^ 63) | i11);
        f52351t0 = i12 % 128;
        int i13 = i12 % 2;
        int iIntValue = ((Integer) setX(new Object[]{this, abwVar}, 535264389, -535264387, System.identityHashCode(this))).intValue();
        int i14 = f52351t0 + 51;
        f52350s0 = i14 % 128;
        int i15 = i14 % 2;
        return iIntValue;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:20:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:22:0x00f1  */
    public boolean equals(@Nullable Object p4) {
        int i10;
        int i11 = f52350s0;
        int i12 = i11 ^ 27;
        int i13 = ((((i11 & 27) | i12) << 1) - (~(-i12))) - 1;
        int i14 = i13 % 128;
        f52351t0 = i14;
        int i15 = i13 % 2;
        if (p4 == this) {
            int i16 = i14 ^ 15;
            int i17 = -(-((i14 & 15) << 1));
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            int i19 = i18 % 128;
            f52350s0 = i19;
            int i20 = i18 % 2;
            int i21 = (i19 ^ 81) + ((i19 & 81) << 1);
            f52351t0 = i21 % 128;
            if (i21 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(p4 instanceof abw)) {
            int i22 = i11 & 49;
            int i23 = (i11 ^ 49) | i22;
            int i24 = (i22 & i23) + (i22 | i23);
            f52351t0 = i24 % 128;
            int i25 = i24 % 2;
            return false;
        }
        int i26 = ((i11 | 111) << 1) - (i11 ^ 111);
        f52351t0 = i26 % 128;
        if (i26 % 2 == 0) {
            abw abwVar = (abw) p4;
            int i27 = 20 / 0;
            if (((Integer) setX(new Object[]{abwVar}, -1716166708, 1716166712, System.identityHashCode(abwVar))).intValue() == ((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this))).length) {
                if (((abw) p4).setOnFocusChangeListener(0, (byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this)), 0, ((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this))).length)) {
                    int i28 = f52350s0 + 85;
                    int i29 = i28 % 128;
                    f52351t0 = i29;
                    int i30 = i28 % 2;
                    int i31 = ((i29 ^ 89) | (i29 & 89)) << 1;
                    int i32 = -(((~i29) & 89) | (i29 & (-90)));
                    i10 = ((i31 | i32) << 1) - (i31 ^ i32);
                    f52350s0 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i33 = 87 / 0;
                    }
                    return true;
                }
            }
        } else {
            abw abwVar2 = (abw) p4;
            if (((Integer) setX(new Object[]{abwVar2}, -1716166708, 1716166712, System.identityHashCode(abwVar2))).intValue() == ((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this))).length) {
                if (((abw) p4).setOnFocusChangeListener(0, (byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this)), 0, ((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this))).length)) {
                    int i210 = f52350s0 + 85;
                    int i211 = i210 % 128;
                    f52351t0 = i211;
                    int i34 = i210 % 2;
                    int i35 = ((i211 ^ 89) | (i211 & 89)) << 1;
                    int i36 = -(((~i211) & 89) | (i211 & (-90)));
                    i10 = ((i35 | i36) << 1) - (i35 ^ i36);
                    f52350s0 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i37 = 87 / 0;
                    }
                    return true;
                }
            }
        }
        int i38 = f52350s0;
        int i39 = ((i38 & 90) + (i38 | 90)) - 1;
        f52351t0 = i39 % 128;
        if (i39 % 2 == 0) {
            int i40 = 54 / 0;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x01e4  */
    @NotNull
    public abw getNavBarTitleString() {
        int i10 = f52351t0;
        int i11 = (i10 & 1) + (i10 | 1);
        f52350s0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        while (i13 < ((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this))).length) {
            int i14 = f52351t0;
            int i15 = ((i14 ^ 23) | (i14 & 23)) << 1;
            int i16 = -(((~i14) & 23) | (i14 & (-24)));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            f52350s0 = i17 % 128;
            int i18 = i17 % 2;
            byte b10 = ((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this)))[i13];
            byte b11 = 65;
            if (b10 >= 65) {
                int i19 = f52350s0;
                int i20 = ((i19 | 90) << 1) - (i19 ^ 90);
                int i21 = (i20 ^ (-1)) + (i20 << 1);
                f52351t0 = i21 % 128;
                int i22 = i21 % 2;
                if (b10 <= 90) {
                    byte[] bArr = (byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this));
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                    Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i23 = i13 * 339;
                    int i24 = (-337) & i23;
                    int i25 = ((i23 | (-337)) & (~i24)) + (i24 << 1);
                    int i26 = ~iIdentityHashCode;
                    int i27 = ((~i26) & (-2)) | (i26 & 1);
                    int i28 = (-2) & i26;
                    int i29 = ~((i27 & i28) | (i27 ^ i28));
                    int i30 = (~i13) | 1;
                    int i31 = (i30 | (~i30)) & (~i30);
                    int i32 = ((~i31) & i29) | ((~i29) & i31);
                    int i33 = i29 & i31;
                    int i34 = (i33 & i32) | (i32 ^ i33);
                    int i35 = ~iIdentityHashCode;
                    int i36 = (i35 & 1) | (iIdentityHashCode & (-2));
                    int i37 = iIdentityHashCode & 1;
                    int i38 = (i25 - (~((i34 | (~((i36 & i37) | (i36 ^ i37)))) * (-338)))) - 1;
                    int i39 = (~(((-2) ^ i13) | ((-2) & i13))) * 338;
                    int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
                    int i41 = (i35 | iIdentityHashCode) & i26;
                    int i42 = ((~i41) & (-2)) | (i41 & 1);
                    int i43 = i41 & (-2);
                    int i44 = ~((i43 & i42) | (i42 ^ i43));
                    int i45 = (i13 ^ 1) | (i13 & 1);
                    int i46 = i45 & iIdentityHashCode;
                    int i47 = (iIdentityHashCode | i45) & (~i46);
                    int i48 = ~((i47 & i46) | (i47 ^ i46));
                    int i49 = i44 & i48;
                    int i50 = (i48 | i44) & (~i49);
                    int i51 = -(-(((i50 & i49) | (i50 ^ i49)) * 338));
                    int i52 = i40 & i51;
                    int i53 = ((i51 | i40) & (~i52)) + (i52 << 1);
                    int i54 = b10 & 32;
                    int i55 = (b10 | 32) & (~i54);
                    int i56 = i54 << 1;
                    bArrCopyOf[i13] = (byte) ((i55 & i56) + (i55 | i56));
                    int i57 = f52351t0 + 93;
                    f52350s0 = i57 % 128;
                    int i58 = i57 % 2;
                    while (i53 < bArrCopyOf.length) {
                        int i59 = f52351t0;
                        int i60 = (i59 ^ 95) + ((i59 & 95) << 1);
                        f52350s0 = i60 % 128;
                        int i61 = i60 % 2;
                        byte b12 = bArrCopyOf[i53];
                        if (b12 >= b11) {
                            int i62 = i59 & 25;
                            int i63 = i62 + ((i59 ^ 25) | i62);
                            f52350s0 = i63 % 128;
                            int i64 = i63 % 2;
                            if (b12 > 90) {
                                int iIdentityHashCode2 = System.identityHashCode(this);
                                int i65 = -(-(i53 * TypedValues.MotionType.TYPE_EASING));
                                int i66 = 302 ^ i65;
                                int i67 = ((i65 & 302) | i66) << 1;
                                int i68 = -i66;
                                int i69 = (i67 & i68) + (i67 | i68);
                                int i70 = ~iIdentityHashCode2;
                                int i71 = (-2) & i70;
                                int i72 = (~i71) & ((-2) | i70);
                                int i73 = (i71 & i72) | (i72 ^ i71);
                                int i74 = (i73 | (~i73)) & (~i73);
                                int i75 = i53 & i74;
                                int i76 = (i74 | i53) & (~i75);
                                int i77 = ((i76 & i75) | (i76 ^ i75)) * (-602);
                                int i78 = i69 & i77;
                                int i79 = (((i69 ^ i77) | i78) << 1) - ((i77 | i69) & (~i78));
                                int i80 = ~i53;
                                int i81 = (-2) ^ i80;
                                int i82 = (-2) & i80;
                                int i83 = ~((i81 & i82) | (i81 ^ i82));
                                int i84 = (-2) ^ iIdentityHashCode2;
                                int i85 = ~iIdentityHashCode2;
                                int i86 = iIdentityHashCode2 & (-2);
                                int i87 = ~((i86 & i84) | (i84 ^ i86));
                                int i88 = i83 & i87;
                                int i89 = (i87 | i83) & (~i88);
                                int i90 = i70 ^ 1;
                                int i91 = i70 & 1;
                                int i92 = (i91 & i90) | (i90 ^ i91);
                                int i93 = (i92 & i53) | (i92 ^ i53);
                                int i94 = -(-(((i89 & i88) | (i89 ^ i88) | ((i93 | (~i93)) & (~i93))) * (-301)));
                                int i95 = (i79 ^ i94) + ((i94 & i79) << 1);
                                int i96 = (i85 & i80) | ((~i85) & i53);
                                int i97 = i85 & i53;
                                int i98 = -(-((~((i96 & i97) | (i96 ^ i97))) * 301));
                                int i99 = ((~i98) & i95) | ((~i95) & i98);
                                int i100 = -(-((i98 & i95) << 1));
                                i53 = (i99 & i100) + (i100 | i99);
                                int i101 = f52351t0;
                                int i102 = (i101 & 39) + (i101 | 39);
                                f52350s0 = i102 % 128;
                                int i103 = i102 % 2;
                            } else {
                                int iIdentityHashCode3 = System.identityHashCode(this);
                                int i104 = b12 * (-67);
                                int i105 = (2208 ^ i104) + ((i104 & 2208) << 1);
                                int i106 = ~b12;
                                int i107 = ((-33) ^ i106) | ((-33) & i106);
                                int i108 = ~iIdentityHashCode3;
                                int i109 = i107 & i108;
                                int i110 = (i107 | i108) & (~i109);
                                int i111 = ~((i110 & i109) | (i110 ^ i109));
                                int i112 = 32 & b12;
                                int i113 = i112 | ((~i112) & (32 | b12));
                                int i114 = ((~i113) | i113) & (~i113);
                                int i115 = (i114 & i111) | (i111 ^ i114);
                                int i116 = (b12 & i108) | (iIdentityHashCode3 & i106);
                                int i117 = iIdentityHashCode3 & b12;
                                int i118 = -(-(((~((i117 & i116) | (i116 ^ i117))) | i115) * (-68)));
                                int i119 = i105 & i118;
                                int i120 = (i118 | i105) & (~i119);
                                int i121 = -(-(i119 << 1));
                                int i122 = ((i120 | i121) << 1) - (i120 ^ i121);
                                int i123 = (-33) & i108;
                                int i124 = (~i123) & ((-33) | i108);
                                int i125 = (i123 & i124) | (i124 ^ i123);
                                int i126 = i125 & b12;
                                int i127 = -(-((~(((i125 | b12) & (~i126)) | i126)) * (-68)));
                                int i128 = i122 & i127;
                                int i129 = (i127 ^ i122) | i128;
                                int i130 = ((i128 | i129) << 1) - (i129 ^ i128);
                                int i131 = (~b12) & (b12 | i106);
                                int i132 = ((~i108) & i131) | ((~i131) & i108);
                                int i133 = i131 & i108;
                                int i134 = ~((i133 & i132) | (i132 ^ i133));
                                int i135 = ((i134 & (-33)) | ((-33) ^ i134)) * 68;
                                int i136 = i130 ^ i135;
                                bArrCopyOf[i53] = (byte) (((((i135 & i130) | i136) << 1) - (~(-i136))) - 1);
                                int i137 = i53 ^ 1;
                                int i138 = (i53 & 1) << 1;
                                i53 = (i137 ^ i138) + ((i137 & i138) << 1);
                                int i139 = f52351t0 + 79;
                                f52350s0 = i139 % 128;
                                int i140 = i139 % 2;
                            }
                        } else {
                            int iIdentityHashCode4 = System.identityHashCode(this);
                            int i610 = -(-(i53 * TypedValues.MotionType.TYPE_EASING));
                            int i611 = 302 ^ i610;
                            int i612 = ((i610 & 302) | i611) << 1;
                            int i613 = -i611;
                            int i614 = (i612 & i613) + (i612 | i613);
                            int i710 = ~iIdentityHashCode4;
                            int i711 = (-2) & i710;
                            int i712 = (~i711) & ((-2) | i710);
                            int i713 = (i711 & i712) | (i712 ^ i711);
                            int i714 = (i713 | (~i713)) & (~i713);
                            int i715 = i53 & i714;
                            int i716 = (i714 | i53) & (~i715);
                            int i717 = ((i716 & i715) | (i716 ^ i715)) * (-602);
                            int i718 = i614 & i717;
                            int i719 = (((i614 ^ i717) | i718) << 1) - ((i717 | i614) & (~i718));
                            int i810 = ~i53;
                            int i811 = (-2) ^ i810;
                            int i812 = (-2) & i810;
                            int i813 = ~((i811 & i812) | (i811 ^ i812));
                            int i814 = (-2) ^ iIdentityHashCode4;
                            int i815 = ~iIdentityHashCode4;
                            int i816 = iIdentityHashCode4 & (-2);
                            int i817 = ~((i816 & i814) | (i814 ^ i816));
                            int i818 = i813 & i817;
                            int i819 = (i817 | i813) & (~i818);
                            int i910 = i710 ^ 1;
                            int i911 = i710 & 1;
                            int i912 = (i911 & i910) | (i910 ^ i911);
                            int i913 = (i912 & i53) | (i912 ^ i53);
                            int i914 = -(-(((i819 & i818) | (i819 ^ i818) | ((i913 | (~i913)) & (~i913))) * (-301)));
                            int i915 = (i719 ^ i914) + ((i914 & i719) << 1);
                            int i916 = (i815 & i810) | ((~i815) & i53);
                            int i917 = i815 & i53;
                            int i918 = -(-((~((i916 & i917) | (i916 ^ i917))) * 301));
                            int i919 = ((~i918) & i915) | ((~i915) & i918);
                            int i1010 = -(-((i918 & i915) << 1));
                            i53 = (i919 & i1010) + (i1010 | i919);
                            int i1011 = f52351t0;
                            int i1012 = (i1011 & 39) + (i1011 | 39);
                            f52350s0 = i1012 % 128;
                            int i1013 = i1012 % 2;
                        }
                        b11 = 65;
                    }
                    abw abwVar = new abw(bArrCopyOf);
                    int i141 = f52351t0;
                    int i142 = (i141 | 95) << 1;
                    int i143 = -(((~i141) & 95) | (i141 & (-96)));
                    int i144 = ((i142 | i143) << 1) - (i143 ^ i142);
                    f52350s0 = i144 % 128;
                    int i145 = i144 % 2;
                    return abwVar;
                }
            }
            int i146 = i13 ^ 1;
            i13 = (((i13 & 1) | i146) << 1) - i146;
            int i147 = f52351t0;
            int i148 = i147 & 41;
            int i149 = (i147 ^ 41) | i148;
            int i150 = (i148 & i149) + (i149 | i148);
            f52350s0 = i150 % 128;
            int i151 = i150 % 2;
        }
        System.identityHashCode(this);
        System.identityHashCode(this);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        r1 = java.util.Arrays.hashCode((byte[]) setX(new java.lang.Object[]{r7}, 57927053, -57927042, java.lang.System.identityHashCode(r7)));
        setX(new java.lang.Object[]{r7, java.lang.Integer.valueOf(r1)}, 1825942741, -1825942740, r1);
        r3 = com.mypinpad.tsdk.isolation.abw.f52350s0;
        r4 = r3 ^ 61;
        r3 = ((((r3 & 61) | r4) << 1) - (~(-r4))) - 1;
        com.mypinpad.tsdk.isolation.abw.f52351t0 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a1, code lost:
    
        if ((r3 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a3, code lost:
    
        r0 = 85 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0035, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.abw.f52351t0;
        r4 = (((r3 | 78) << 1) - (r3 ^ 78)) - 1;
        r2 = r4 % 128;
        com.mypinpad.tsdk.isolation.abw.f52350s0 = r2;
        r4 = r4 % 2;
        r3 = (r2 & 13) + (r2 | 13);
        com.mypinpad.tsdk.isolation.abw.f52351t0 = r3 % 128;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() throws java.security.NoSuchAlgorithmException {
        /*
            r7 = this;
            int r0 = com.mypinpad.tsdk.isolation.abw.f52351t0
            r1 = r0 ^ 47
            r2 = r0 & 47
            r1 = r1 | r2
            r2 = 1
            int r1 = r1 << r2
            r3 = r0 & (-48)
            int r0 = ~r0
            r4 = 47
            r0 = r0 & r4
            r0 = r0 | r3
            int r1 = r1 - r0
            int r0 = r1 % 128
            com.mypinpad.tsdk.isolation.abw.f52350s0 = r0
            r0 = 2
            int r1 = r1 % r0
            r3 = 647169731(0x269306c3, float:1.0202007E-15)
            r4 = -647169721(0xffffffffd96cf947, float:-4.168886E15)
            r5 = 0
            if (r1 == 0) goto L38
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r5] = r7
            int r6 = java.lang.System.identityHashCode(r7)
            java.lang.Object r1 = setX(r1, r4, r3, r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3 = 50
            int r3 = r3 / r5
            if (r1 == 0) goto L65
            goto L4c
        L38:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r5] = r7
            int r6 = java.lang.System.identityHashCode(r7)
            java.lang.Object r1 = setX(r1, r4, r3, r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 == 0) goto L65
        L4c:
            int r3 = com.mypinpad.tsdk.isolation.abw.f52351t0
            r4 = r3 | 78
            int r4 = r4 << r2
            r3 = r3 ^ 78
            int r4 = r4 - r3
            int r4 = r4 - r2
            int r2 = r4 % 128
            com.mypinpad.tsdk.isolation.abw.f52350s0 = r2
            int r4 = r4 % r0
            r3 = r2 & 13
            r2 = r2 | 13
            int r3 = r3 + r2
            int r2 = r3 % 128
            com.mypinpad.tsdk.isolation.abw.f52351t0 = r2
            int r3 = r3 % r0
            return r1
        L65:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r5] = r7
            int r3 = java.lang.System.identityHashCode(r7)
            r4 = 57927053(0x373e58d, float:7.1674793E-37)
            r6 = -57927042(0xfffffffffc8c1a7e, float:-5.819671E36)
            java.lang.Object r1 = setX(r1, r4, r6, r3)
            byte[] r1 = (byte[]) r1
            int r1 = java.util.Arrays.hashCode(r1)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r5] = r7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3[r2] = r4
            r4 = 1825942741(0x6cd5acd5, float:2.066539E27)
            r6 = -1825942740(0xffffffff932a532c, float:-2.1498024E-27)
            setX(r3, r4, r6, r1)
            int r3 = com.mypinpad.tsdk.isolation.abw.f52350s0
            r4 = r3 ^ 61
            r3 = r3 & 61
            r3 = r3 | r4
            int r3 = r3 << r2
            int r4 = -r4
            int r4 = ~r4
            int r3 = r3 - r4
            int r3 = r3 - r2
            int r2 = r3 % 128
            com.mypinpad.tsdk.isolation.abw.f52351t0 = r2
            int r3 = r3 % r0
            if (r3 != 0) goto La6
            r0 = 85
            int r0 = r0 / r5
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.abw.hashCode():int");
    }

    @NotNull
    public byte[] setAlwaysDrawnWithCacheEnabled() throws NoSuchAlgorithmException {
        int i10 = f52350s0;
        int i11 = i10 & 103;
        int i12 = (i10 ^ 103) | i11;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f52351t0 = i13 % 128;
        int i14 = i13 % 2;
        byte[] bArr = (byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this));
        int i15 = f52351t0;
        int i16 = ((i15 ^ 15) | (i15 & 15)) << 1;
        int i17 = -(((~i15) & 15) | (i15 & (-16)));
        int i18 = (i16 & i17) + (i16 | i17);
        f52350s0 = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = 21 / 0;
        }
        return bArr;
    }

    public boolean setCompoundDrawableTintBlendMode(@NotNull abw abwVar, int i10) throws NoSuchAlgorithmException {
        boolean onFocusChangeListener;
        int i11 = f52350s0;
        int i12 = i11 ^ 65;
        int i13 = -(-((i11 & 65) << 1));
        int i14 = (i12 & i13) + (i13 | i12);
        f52351t0 = i14 % 128;
        if (i14 % 2 == 0) {
            Intrinsics.checkNotNullParameter(abwVar, "");
            onFocusChangeListener = abwVar.setOnFocusChangeListener(0, (byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this)), 1, i10);
        } else {
            Intrinsics.checkNotNullParameter(abwVar, "");
            onFocusChangeListener = abwVar.setOnFocusChangeListener(0, (byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this)), 0, i10);
        }
        int i15 = f52350s0;
        int i16 = (((i15 | 108) << 1) - (i15 ^ 108)) - 1;
        f52351t0 = i16 % 128;
        int i17 = i16 % 2;
        return onFocusChangeListener;
    }

    @NotNull
    public abw setDividerPadding(@NotNull String p4) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(p4, "");
        MessageDigest messageDigest = MessageDigest.getInstance(p4);
        messageDigest.update((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this)), 0, ((Integer) setX(new Object[]{this}, -1716166708, 1716166712, System.identityHashCode(this))).intValue());
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        abw abwVar = new abw(bArrDigest);
        System.identityHashCode(this);
        System.identityHashCode(this);
        return abwVar;
    }

    @NotNull
    public String setLayoutAnimation() throws NoSuchAlgorithmException {
        int i10 = f52351t0 + 22;
        int i11 = 1;
        int i12 = (i10 ^ (-1)) + (i10 << 1);
        f52350s0 = i12 % 128;
        int i13 = i12 % 2;
        char[] cArr = new char[((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this))).length << 1];
        byte[] bArr = (byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this));
        int length = bArr.length;
        int i14 = f52350s0 + 49;
        f52351t0 = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 0;
        int i17 = 0;
        while (i16 < length) {
            int i18 = ((-1) << i11) - ((f52350s0 + 68) ^ (-1));
            f52351t0 = i18 % 128;
            int i19 = i18 % 2;
            byte b10 = bArr[i16];
            int i20 = i16 | 68;
            int i21 = i20 << 1;
            int i22 = -((~(i16 & 68)) & i20);
            int i23 = (i21 ^ i22) + ((i22 & i21) << i11);
            int i24 = i23 & (-67);
            i16 = (((i23 | (-67)) & (~i24)) - (~(i24 << i11))) - 1;
            int iIdentityHashCode = System.identityHashCode(this);
            int i25 = -(-(i17 * (-183)));
            int i26 = (((-183) ^ i25) | ((-183) & i25)) << i11;
            int i27 = -((i25 & 182) | ((-183) & (~i25)));
            int i28 = (i26 ^ i27) + ((i27 & i26) << i11);
            int i29 = ~iIdentityHashCode;
            int i30 = ((-2) ^ i29) | ((-2) & i29);
            int i31 = i30 ^ i17;
            int i32 = ~i17;
            int i33 = i30 & i17;
            int i34 = ~((i33 & i31) | (i31 ^ i33));
            int i35 = i32 & i29;
            int i36 = (~i35) & (i32 | i29);
            int i37 = (i36 ^ i35) | (i35 & i36);
            int i38 = i37 & 1;
            int i39 = (~i38) & (i37 | i11);
            int i40 = ~((i39 & i38) | (i39 ^ i38));
            int i41 = -(-(((i40 & i34) | ((~i40) & i34) | ((~i34) & i40)) * (-184)));
            int i42 = (i28 & i41) + (i41 | i28);
            int i43 = ~i17;
            int i44 = (i32 | i17) & i43;
            int i45 = (-2) & i44;
            int i46 = (i44 | (-2)) & (~i45);
            int i47 = ~((i46 & i45) | (i46 ^ i45));
            int i48 = ~((~iIdentityHashCode) | (-2));
            int i49 = (i47 & i48) | ((~i48) & i47) | ((~i47) & i48);
            int i50 = (iIdentityHashCode | i29) & (~iIdentityHashCode);
            int i51 = ((~i50) & i43) | ((~i43) & i50);
            int i52 = i43 & i50;
            int i53 = ~((i52 & i51) | (i51 ^ i52));
            int i54 = i49 & i53;
            int i55 = (i53 | i49) & (~i54);
            int i56 = (((i55 & i54) | (i55 ^ i54)) * 184) + i42;
            int i57 = i17 & 1;
            int i58 = (~i57) & (i17 | 1);
            int i59 = (i56 - (~(-(~(-(-(((i57 & i58) | (i58 ^ i57)) * 184))))))) - i11;
            int i60 = (i59 ^ (-1)) + (i59 << i11);
            cArr[i17] = ((char[]) ada.setY(new Object[0], 772600238, -772600237, (int) System.currentTimeMillis()))[(b10 >> 4) & 15];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i61 = i60 * 85;
            int i62 = ((85 | i61) << i11) - (i61 ^ 85);
            int i63 = ~i60;
            int i64 = ~i60;
            int i65 = i64 | i60;
            int i66 = i63 & i65;
            int i67 = (-2) ^ i66;
            int i68 = i66 & (-2);
            int i69 = ~((i67 ^ i68) | (i68 & i67));
            int i70 = ~iIdentityHashCode2;
            int i71 = ~(((-2) ^ i70) | ((-2) & i70));
            int i72 = i69 & i71;
            int i73 = (i69 | i71) & (~i72);
            int i74 = (i73 & i72) | (i73 ^ i72);
            int i75 = i64 ^ i70;
            int i76 = ~i70;
            int i77 = i64 & i70;
            int i78 = ~((i75 ^ i77) | (i75 & i77));
            int i79 = i74 ^ i78;
            int i80 = i74 & i78;
            int i81 = (i80 & i79) | (i79 ^ i80);
            int i82 = (i64 & 1) | (i60 & (-2));
            int i83 = i60 & 1;
            int i84 = i82 | i83;
            int i85 = i84 & iIdentityHashCode2;
            byte[] bArr2 = bArr;
            int i86 = (~i85) & (i84 | iIdentityHashCode2);
            int i87 = ~((i86 ^ i85) | (i85 & i86));
            int i88 = length;
            int i89 = -(-(((i87 & i81) | ((~i87) & i81) | ((~i81) & i87)) * (-84)));
            int i90 = ((~i89) & i62) | ((~i62) & i89);
            int i91 = (i89 & i62) << 1;
            int i92 = (i90 ^ i91) + ((i91 & i90) << 1);
            int i93 = (~i60) & i65;
            int i94 = ~iIdentityHashCode2;
            int i95 = (i93 & i94) | ((~i93) & iIdentityHashCode2);
            int i96 = iIdentityHashCode2 & i93;
            int i97 = ~((i96 & i95) | (i95 ^ i96));
            int i98 = ((~i97) & 1) | (i97 & (-2));
            int i99 = i97 & 1;
            int i100 = (i99 & i98) | (i98 ^ i99);
            int i101 = (i70 & i64) | (i60 & i76);
            int i102 = i70 & i60;
            int i103 = ~((i101 & i102) | (i101 ^ i102));
            int i104 = i100 ^ i103;
            int i105 = i100 & i103;
            int i106 = -(-(((i105 & i104) | (i104 ^ i105)) * (-84)));
            int i107 = ((((~i106) & i92) | ((~i92) & i106)) - (~(-(-((i106 & i92) << 1))))) - 1;
            int i108 = (i94 ^ i60) | (i94 & i60);
            int i109 = (i108 | (~i108)) & (~i108);
            int i110 = (i82 ^ i83) | (i82 & i83);
            int i111 = (i110 | (~i110)) & (~i110);
            int i112 = ((~i111) & i109) | ((~i109) & i111);
            int i113 = i109 & i111;
            int i114 = -(-(((i113 & i112) | (i112 ^ i113)) * 84));
            int i115 = i107 & i114;
            int i116 = (i114 ^ i107) | i115;
            i17 = (i115 ^ i116) + ((i116 & i115) << 1);
            cArr[i60] = ((char[]) ada.setY(new Object[0], 772600238, -772600237, (int) System.currentTimeMillis()))[b10 & 15];
            int i117 = f52351t0;
            int i118 = ((i117 ^ 96) + ((i117 & 96) << 1)) - 1;
            f52350s0 = i118 % 128;
            int i119 = i118 % 2;
            length = i88;
            bArr = bArr2;
            i11 = 1;
        }
        String strConcatToString = l.concatToString(cArr);
        int i120 = f52350s0;
        int i121 = (i120 ^ 35) + ((i120 & 35) << 1);
        f52351t0 = i121 % 128;
        if (i121 % 2 != 0) {
            return strConcatToString;
        }
        throw null;
    }

    @NotNull
    public final abw setNavigationOnClickListener() {
        return (abw) setX(new Object[]{this}, 1977252024, -1977252019, System.identityHashCode(this));
    }

    @NotNull
    public final abw setOnDragListener() {
        return (abw) setX(new Object[]{this}, 401421820, -401421820, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007f  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:24:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00df  */
    public boolean setOnFocusChangeListener(int p4, @NotNull byte[] p10, int p11, int p12) throws NoSuchAlgorithmException {
        boolean z10;
        int i10;
        int i11 = f52350s0;
        int i12 = ((i11 ^ 58) + ((i11 & 58) << 1)) - 1;
        f52351t0 = i12 % 128;
        if (i12 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p10, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(p10, "");
        if (p4 >= 0) {
            int length = ((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this))).length;
            int i13 = -p12;
            int i14 = length ^ i13;
            int i15 = ((length & i13) | i14) << 1;
            int i16 = -i14;
            if (p4 <= (i15 ^ i16) + ((i15 & i16) << 1)) {
                int i17 = f52351t0;
                int i18 = (i17 & (-58)) | ((~i17) & 57);
                int i19 = (i17 & 57) << 1;
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                int i21 = i20 % 128;
                f52350s0 = i21;
                int i22 = i20 % 2;
                if (p11 >= 0) {
                    int i23 = i21 & 107;
                    int i24 = (i21 | 107) & (~i23);
                    int i25 = -(-(i23 << 1));
                    int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                    f52351t0 = i26 % 128;
                    if (i26 % 2 != 0) {
                        int length2 = p10.length;
                        int i27 = -(~i13);
                        int i28 = ((length2 | i27) << 1) - (length2 ^ i27);
                        if (p11 <= (i28 ^ (-1)) + (i28 << 1)) {
                            if (((Boolean) acv.setOnFocusChangeListener(new Object[]{(byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this)), Integer.valueOf(p4), p10, Integer.valueOf(p11), Integer.valueOf(p12)}, -55821670, 55821672, p4)).booleanValue()) {
                                int i29 = f52350s0;
                                int i30 = i29 & 39;
                                int i31 = -(-(i29 | 39));
                                int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
                                f52351t0 = i32 % 128;
                                z10 = !(i32 % 2 == 0);
                                int i33 = i29 + 68;
                                i10 = (i33 ^ (-1)) + (i33 << 1);
                                f52351t0 = i10 % 128;
                                if (i10 % 2 != 0) {
                                    return z10;
                                }
                                throw null;
                            }
                        }
                    } else if (p11 <= (p10.length >>> p12)) {
                        if (((Boolean) acv.setOnFocusChangeListener(new Object[]{(byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this)), Integer.valueOf(p4), p10, Integer.valueOf(p11), Integer.valueOf(p12)}, -55821670, 55821672, p4)).booleanValue()) {
                            int i210 = f52350s0;
                            int i34 = i210 & 39;
                            int i35 = -(-(i210 | 39));
                            int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
                            f52351t0 = i36 % 128;
                            z10 = !(i36 % 2 == 0);
                            int i37 = i210 + 68;
                            i10 = (i37 ^ (-1)) + (i37 << 1);
                            f52351t0 = i10 % 128;
                            if (i10 % 2 != 0) {
                                return z10;
                            }
                            throw null;
                        }
                    }
                }
            }
        }
        int i38 = f52351t0;
        int i39 = i38 & 79;
        int i40 = ((i38 ^ 79) | i39) << 1;
        int i41 = -((i38 | 79) & (~i39));
        int i42 = (i40 & i41) + (i41 | i40);
        f52350s0 = i42 % 128;
        int i43 = i42 % 2;
        return false;
    }

    @JvmName(name = "setOnLongClickListener")
    public final int setOnLongClickListener() {
        return ((Integer) setX(new Object[]{this}, -1716166708, 1716166712, System.identityHashCode(this))).intValue();
    }

    public byte setY(int p4) throws NoSuchAlgorithmException {
        byte b10;
        int i10 = f52351t0;
        int i11 = (i10 & (-58)) | ((~i10) & 57);
        int i12 = -(-((i10 & 57) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f52350s0 = i13 % 128;
        if (i13 % 2 != 0) {
            b10 = ((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this)))[p4];
            int i14 = 34 / 0;
        } else {
            b10 = ((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this)))[p4];
        }
        int i15 = f52350s0;
        int i16 = i15 & 41;
        int i17 = i16 + ((i15 ^ 41) | i16);
        f52351t0 = i17 % 128;
        int i18 = i17 % 2;
        return b10;
    }

    @NotNull
    public byte[] setZ() {
        int i10 = f52351t0;
        int i11 = i10 & 113;
        int i12 = i11 + ((i10 ^ 113) | i11);
        f52350s0 = i12 % 128;
        int i13 = i12 % 2;
        byte[] bArr = (byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this));
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        int i14 = f52351t0;
        int i15 = i14 & 3;
        int i16 = ((i14 ^ 3) | i15) << 1;
        int i17 = -((i14 | 3) & (~i15));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        f52350s0 = i18 % 128;
        int i19 = i18 % 2;
        return bArrCopyOf;
    }

    @NotNull
    public String toString() throws NoSuchAlgorithmException {
        boolean z10;
        abw abwVar;
        int i10 = f52350s0 + 71;
        f52351t0 = i10 % 128;
        int i11 = i10 % 2;
        if (((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this))).length == 0) {
            int i12 = f52351t0;
            int i13 = ((-1) << 1) - ((((i12 | 22) << 1) - (i12 ^ 22)) ^ (-1));
            int i14 = i13 % 128;
            f52350s0 = i14;
            z10 = i13 % 2 == 0;
            int i15 = i14 & 85;
            int i16 = (i14 | 85) & (~i15);
            int i17 = i15 << 1;
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            f52351t0 = i18 % 128;
            int i19 = i18 % 2;
        } else {
            int i20 = f52350s0 + 111;
            f52351t0 = i20 % 128;
            int i21 = i20 % 2;
            z10 = false;
        }
        if (!(!z10)) {
            int i22 = f52351t0;
            int i23 = ((i22 ^ 122) + ((i22 & 122) << 1)) - 1;
            f52350s0 = i23 % 128;
            int i24 = i23 % 2;
            int i25 = i22 ^ 101;
            int i26 = ((i22 & 101) | i25) << 1;
            int i27 = -i25;
            int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
            f52350s0 = i28 % 128;
            int i29 = i28 % 2;
            return "[size=0]";
        }
        int iIntValue = ((Integer) ada.setY(new Object[]{(byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this))}, 1784419523, -1784419523, (int) System.currentTimeMillis())).intValue();
        if (iIntValue != -1) {
            String str = (String) setX(new Object[]{this}, -623922005, 623922012, System.identityHashCode(this));
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = str.substring(0, iIntValue);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String strReplace$default = l.replace$default(l.replace$default(l.replace$default(strSubstring, "\\", "\\\\", false, 4, (Object) null), RootService.LINE_BREAK, "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
            if (iIntValue >= str.length()) {
                StringBuilder sb2 = new StringBuilder("[text=");
                sb2.append(strReplace$default);
                sb2.append(AbstractJsonLexerKt.END_LIST);
                String string = sb2.toString();
                int i30 = f52350s0 + 33;
                f52351t0 = i30 % 128;
                if (i30 % 2 == 0) {
                    int i31 = 28 / 0;
                }
                return string;
            }
            StringBuilder sb3 = new StringBuilder("[size=");
            sb3.append(((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this))).length);
            sb3.append(" text=");
            sb3.append(strReplace$default);
            sb3.append("…]");
            String string2 = sb3.toString();
            int i32 = f52350s0;
            int i33 = i32 & 81;
            int i34 = ((i32 ^ 81) | i33) << 1;
            int i35 = -((i32 | 81) & (~i33));
            int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
            f52351t0 = i36 % 128;
            if (i36 % 2 == 0) {
                int i37 = 12 / 0;
            }
            return string2;
        }
        int i38 = f52351t0 + 59;
        f52350s0 = i38 % 128;
        int i39 = i38 % 2;
        if (((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this))).length <= 64) {
            StringBuilder sb4 = new StringBuilder("[hex=");
            sb4.append(setLayoutAnimation());
            sb4.append(AbstractJsonLexerKt.END_LIST);
            String string3 = sb4.toString();
            int i40 = f52350s0;
            int i41 = i40 & 53;
            int i42 = ((i40 | 53) & (~i41)) + (i41 << 1);
            f52351t0 = i42 % 128;
            if (i42 % 2 != 0) {
                return string3;
            }
            throw null;
        }
        StringBuilder sb5 = new StringBuilder("[size=");
        sb5.append(((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this))).length);
        sb5.append(" hex=");
        int iIntValue2 = ((Integer) acv.setOnFocusChangeListener(new Object[]{this}, -1666208994, 1666208999, (int) System.currentTimeMillis())).intValue();
        if (iIntValue2 <= ((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this))).length) {
            int i43 = f52350s0;
            int i44 = (i43 & (-14)) | ((~i43) & 13);
            int i45 = (i43 & 13) << 1;
            int i46 = (i44 & i45) + (i45 | i44);
            int i47 = i46 % 128;
            f52351t0 = i47;
            if (i46 % 2 != 0) {
                if (iIntValue2 < 0) {
                    int i48 = i47 & 85;
                    int i49 = i48 + ((i47 ^ 85) | i48);
                    f52350s0 = i49 % 128;
                    int i50 = i49 % 2;
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                }
                int i51 = i47 & 19;
                int i52 = (i51 - (~((i47 ^ 19) | i51))) - 1;
                f52350s0 = i52 % 128;
                int i53 = i52 % 2;
                int i54 = i47 & 119;
                int i55 = (((i47 ^ 119) | i54) << 1) - ((i47 | 119) & (~i54));
                f52350s0 = i55 % 128;
                int i56 = i55 % 2;
                if (iIntValue2 == ((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this))).length) {
                    int i57 = f52351t0;
                    int i58 = i57 + 101;
                    f52350s0 = i58 % 128;
                    if (i58 % 2 != 0) {
                        throw null;
                    }
                    int i59 = i57 & 109;
                    int i60 = ((i57 | 109) & (~i59)) + (i59 << 1);
                    f52350s0 = i60 % 128;
                    int i61 = i60 % 2;
                    abwVar = this;
                } else {
                    abwVar = new abw(ArraysKt___ArraysJvmKt.copyOfRange(setDividerPadding(), 0, iIntValue2));
                    int i62 = f52350s0 + 123;
                    f52351t0 = i62 % 128;
                    int i63 = i62 % 2;
                }
                sb5.append(abwVar.setLayoutAnimation());
                sb5.append("…]");
                String string4 = sb5.toString();
                int i64 = f52350s0;
                int i65 = i64 & 73;
                int i66 = (i65 - (~((i64 ^ 73) | i65))) - 1;
                f52351t0 = i66 % 128;
                int i67 = i66 % 2;
                return string4;
            }
        } else {
            System.identityHashCode(this);
            System.identityHashCode(this);
        }
        StringBuilder sb6 = new StringBuilder("endIndex > length(");
        sb6.append(((byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this))).length);
        sb6.append(RootService.CLOSE_BRACKET);
        throw new IllegalArgumentException(sb6.toString().toString());
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final byte[] setDividerPadding() throws NoSuchAlgorithmException {
        return (byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this));
    }

    public final boolean setCompoundDrawableTintBlendMode(@NotNull abw p4) {
        return ((Boolean) setX(new Object[]{this, p4}, -262670654, 262670657, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setY")
    public final int setY() {
        return ((Integer) setX(new Object[]{this}, -647169721, 647169731, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "getByte")
    public final byte setCompoundDrawableTintBlendMode(int p4) {
        return ((Byte) setX(new Object[]{this, Integer.valueOf(p4)}, 2055130869, -2055130861, p4)).byteValue();
    }

    @NotNull
    public final abw setCompoundDrawableTintBlendMode() {
        return (abw) setX(new Object[]{this}, -1846270851, 1846270857, System.identityHashCode(this));
    }

    @NotNull
    public final String setOnFocusChangeListener() {
        return (String) setX(new Object[]{this}, -623922005, 623922012, System.identityHashCode(this));
    }

    @NotNull
    public String setX() {
        int i10 = f52350s0;
        int i11 = (i10 & (-6)) | ((~i10) & 5);
        int i12 = -(-((i10 & 5) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        f52351t0 = i13 % 128;
        if (i13 % 2 != 0) {
            return (String) acx.setX(new Object[]{(byte[]) setX(new Object[]{this}, 57927053, -57927042, System.identityHashCode(this))}, -1739718784, 1739718784, (int) System.currentTimeMillis());
        }
        throw null;
    }

    public void setX(@NotNull abx abxVar, int i10) {
        int i11 = f52350s0;
        int i12 = (i11 & (-74)) | ((~i11) & 73);
        int i13 = (i11 & 73) << 1;
        int i14 = (i12 & i13) + (i13 | i12);
        f52351t0 = i14 % 128;
        int i15 = i14 % 2;
        Intrinsics.checkNotNullParameter(abxVar, "");
        ada.setY(new Object[]{this, abxVar, 0, Integer.valueOf(i10)}, -1883142877, 1883142882, 0);
        int i16 = f52351t0;
        int i17 = i16 & 97;
        int i18 = i16 | 97;
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        f52350s0 = i19 % 128;
        if (i19 % 2 != 0) {
            throw null;
        }
    }

    @JvmName(name = "setX")
    public final void setX(@Nullable String str) throws NoSuchAlgorithmException {
        setX(new Object[]{this, str}, 737029192, -737029180, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    public final void setX(int i10) throws NoSuchAlgorithmException {
        setX(new Object[]{this, Integer.valueOf(i10)}, 1825942741, -1825942740, i10);
    }
}
