package okio;

import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.o1;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.v;
import androidx.camera.core.processing.f;
import androidx.compose.animation.core.AnimationKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.networkplugin.command.impl.HeadCommand;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Typography;
import net.lingala.zip4j.util.InternalZipConstants;
import okhttp3.internal.connection.RealConnection;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0092\u0001B\t¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\b\u0010\u0005\u001a\u00020\u0000H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0000H\u0016J\b\u0010\t\u001a\u00020\u0000H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0001H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J$\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J \u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\fJ\u001a\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0012J\u0016\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u001a\u001a\u00020\fJ\b\u0010\u001c\u001a\u00020\u001bH\u0016J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\fH\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\"\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020\fH\u0016J\b\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020#H\u0016J\b\u0010(\u001a\u00020\fH\u0016J\b\u0010)\u001a\u00020\fH\u0016J\b\u0010*\u001a\u00020\fH\u0016J\b\u0010,\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020+2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010/\u001a\u00020#2\u0006\u0010.\u001a\u00020-H\u0016J\u0018\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u00103\u001a\u00020\f2\u0006\u00100\u001a\u000202H\u0016J\b\u00105\u001a\u000204H\u0016J\u0010\u00105\u001a\u0002042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u00108\u001a\u0002042\u0006\u00107\u001a\u000206H\u0016J\u0018\u00108\u001a\u0002042\u0006\u0010\r\u001a\u00020\f2\u0006\u00107\u001a\u000206H\u0016J\n\u00109\u001a\u0004\u0018\u000104H\u0016J\b\u0010:\u001a\u000204H\u0016J\u0010\u0010:\u001a\u0002042\u0006\u0010;\u001a\u00020\fH\u0016J\b\u0010<\u001a\u00020#H\u0016J\b\u0010>\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020=2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010?\u001a\u00020#2\u0006\u00100\u001a\u00020=H\u0016J\u0010\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020=H\u0016J \u0010?\u001a\u00020#2\u0006\u00100\u001a\u00020=2\u0006\u0010\u0015\u001a\u00020#2\u0006\u0010\r\u001a\u00020#H\u0016J\u0010\u0010?\u001a\u00020#2\u0006\u00100\u001a\u00020@H\u0016J\u0006\u0010A\u001a\u00020\u000eJ\u0010\u0010B\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010D\u001a\u00020\u00002\u0006\u0010C\u001a\u00020+H\u0016J \u0010D\u001a\u00020\u00002\u0006\u0010C\u001a\u00020+2\u0006\u0010\u0015\u001a\u00020#2\u0006\u0010\r\u001a\u00020#H\u0016J\u0010\u0010F\u001a\u00020\u00002\u0006\u0010E\u001a\u000204H\u0016J \u0010F\u001a\u00020\u00002\u0006\u0010E\u001a\u0002042\u0006\u0010G\u001a\u00020#2\u0006\u0010H\u001a\u00020#H\u0016J\u0010\u0010J\u001a\u00020\u00002\u0006\u0010I\u001a\u00020#H\u0016J\u0018\u0010K\u001a\u00020\u00002\u0006\u0010E\u001a\u0002042\u0006\u00107\u001a\u000206H\u0016J(\u0010K\u001a\u00020\u00002\u0006\u0010E\u001a\u0002042\u0006\u0010G\u001a\u00020#2\u0006\u0010H\u001a\u00020#2\u0006\u00107\u001a\u000206H\u0016J\u0010\u0010D\u001a\u00020\u00002\u0006\u0010L\u001a\u00020=H\u0016J \u0010D\u001a\u00020\u00002\u0006\u0010L\u001a\u00020=2\u0006\u0010\u0015\u001a\u00020#2\u0006\u0010\r\u001a\u00020#H\u0016J\u0010\u0010D\u001a\u00020#2\u0006\u0010L\u001a\u00020@H\u0016J\u0010\u0010N\u001a\u00020\f2\u0006\u0010L\u001a\u00020MH\u0016J\u0018\u0010D\u001a\u00020\u00002\u0006\u0010L\u001a\u00020M2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010P\u001a\u00020\u00002\u0006\u0010O\u001a\u00020#H\u0016J\u0010\u0010R\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020#H\u0016J\u0010\u0010S\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020#H\u0016J\u0010\u0010U\u001a\u00020\u00002\u0006\u0010T\u001a\u00020#H\u0016J\u0010\u0010V\u001a\u00020\u00002\u0006\u0010T\u001a\u00020#H\u0016J\u0010\u0010X\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\fH\u0016J\u0010\u0010Y\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\fH\u0016J\u0010\u0010Z\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\fH\u0016J\u0010\u0010[\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\fH\u0016J\u0017\u0010`\u001a\u00020]2\u0006\u0010\\\u001a\u00020#H\u0000¢\u0006\u0004\b^\u0010_J\u0018\u0010D\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010?\u001a\u00020\f2\u0006\u00100\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010a\u001a\u00020\f2\u0006\u0010O\u001a\u00020\u001bH\u0016J\u0018\u0010a\u001a\u00020\f2\u0006\u0010O\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020\fH\u0016J \u0010a\u001a\u00020\f2\u0006\u0010O\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020\f2\u0006\u0010c\u001a\u00020\fH\u0016J\u0010\u0010a\u001a\u00020\f2\u0006\u0010d\u001a\u00020+H\u0016J\u0018\u0010a\u001a\u00020\f2\u0006\u0010d\u001a\u00020+2\u0006\u0010b\u001a\u00020\fH\u0016J\u0010\u0010f\u001a\u00020\f2\u0006\u0010e\u001a\u00020+H\u0016J\u0018\u0010f\u001a\u00020\f2\u0006\u0010e\u001a\u00020+2\u0006\u0010b\u001a\u00020\fH\u0016J\u0018\u0010g\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010d\u001a\u00020+H\u0016J(\u0010g\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010d\u001a\u00020+2\u0006\u0010h\u001a\u00020#2\u0006\u0010\r\u001a\u00020#H\u0016J\b\u0010i\u001a\u00020\u000eH\u0016J\b\u0010j\u001a\u00020\nH\u0016J\b\u0010k\u001a\u00020\u000eH\u0016J\b\u0010m\u001a\u00020lH\u0016J\u0006\u0010n\u001a\u00020+J\u0006\u0010o\u001a\u00020+J\u0006\u0010p\u001a\u00020+J\u0006\u0010q\u001a\u00020+J\u000e\u0010s\u001a\u00020+2\u0006\u0010r\u001a\u00020+J\u000e\u0010t\u001a\u00020+2\u0006\u0010r\u001a\u00020+J\u000e\u0010u\u001a\u00020+2\u0006\u0010r\u001a\u00020+J\u0013\u0010x\u001a\u00020\n2\b\u0010w\u001a\u0004\u0018\u00010vH\u0096\u0002J\b\u0010y\u001a\u00020#H\u0016J\b\u0010z\u001a\u000204H\u0016J\u0006\u0010{\u001a\u00020\u0000J\b\u0010|\u001a\u00020\u0000H\u0016J\u0006\u0010}\u001a\u00020+J\u000e\u0010}\u001a\u00020+2\u0006\u0010\r\u001a\u00020#J\u0013\u0010\u0080\u0001\u001a\u00020~2\b\b\u0002\u0010\u007f\u001a\u00020~H\u0007J\u0013\u0010\u0081\u0001\u001a\u00020~2\b\b\u0002\u0010\u007f\u001a\u00020~H\u0007J\u0019\u0010\u001e\u001a\u00020\u001b2\u0007\u0010\u0082\u0001\u001a\u00020\fH\u0007¢\u0006\u0005\b\u0083\u0001\u0010\u001fJ\u0012\u0010\u0086\u0001\u001a\u00020\fH\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010]8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R2\u0010\u0086\u0001\u001a\u00020\f2\u0007\u0010\u0089\u0001\u001a\u00020\f8G@@X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u0086\u0001\u0010\u0085\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0016\u0010\u0005\u001a\u00020\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u0093\u0001"}, d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "buffer", "Ljava/io/OutputStream;", "outputStream", "emitCompleteSegments", "emit", "", "exhausted", "", "byteCount", "", "require", "request", "peek", "Ljava/io/InputStream;", "inputStream", "out", TypedValues.CycleType.S_WAVE_OFFSET, "copyTo", "writeTo", "input", "readFrom", "completeSegmentByteCount", "", "readByte", "pos", "getByte", "(J)B", "get", "", "readShort", "", "readInt", "readLong", "readShortLe", "readIntLe", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", "Lokio/ByteString;", "readByteString", "Lokio/Options;", "options", "select", "sink", "readFully", "Lokio/Sink;", "readAll", "", "readUtf8", "Ljava/nio/charset/Charset;", "charset", "readString", "readUtf8Line", "readUtf8LineStrict", "limit", "readUtf8CodePoint", "", "readByteArray", "read", "Ljava/nio/ByteBuffer;", ClearCommand.ID, "skip", "byteString", "write", "string", "writeUtf8", "beginIndex", "endIndex", "codePoint", "writeUtf8CodePoint", "writeString", "source", "Lokio/Source;", "writeAll", "b", "writeByte", "s", "writeShort", "writeShortLe", "i", "writeInt", "writeIntLe", SharedPrefsStorage.VERSION_KEY, "writeLong", "writeLongLe", "writeDecimalLong", "writeHexadecimalUnsignedLong", "minimumCapacity", "Lokio/Segment;", "writableSegment$okio", "(I)Lokio/Segment;", "writableSegment", "indexOf", "fromIndex", "toIndex", "bytes", "targetBytes", "indexOfElement", "rangeEquals", "bytesOffset", "flush", "isOpen", HearingDisabilitiesConstants.CLOSE_MODAL, "Lokio/Timeout;", "timeout", "md5", "sha1", "sha256", "sha512", "key", "hmacSha1", "hmacSha256", "hmacSha512", "", "other", "equals", GenerateActivationFormCommand.HASH_CODE, "toString", "copy", "clone", "snapshot", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "readUnsafe", "readAndWriteUnsafe", FirebaseAnalytics.Param.INDEX, "-deprecated_getByte", "-deprecated_size", "()J", "size", HeadCommand.ID, "Lokio/Segment;", "<set-?>", "p0", "J", "setSize$okio", "(J)V", "getBuffer", "()Lokio/Buffer;", "<init>", "()V", "UnsafeCursor", "okio"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 Buffer.kt\nokio/internal/-Buffer\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,641:1\n89#2:642\n86#2:675\n86#2:677\n74#2:737\n74#2:763\n83#2:802\n77#2:813\n89#2:1003\n74#2:1018\n86#2:1122\n89#2:1615\n244#3,32:643\n279#3,10:678\n292#3,18:688\n414#3,2:706\n112#3:708\n416#3:709\n114#3,18:710\n313#3,9:728\n322#3,15:738\n340#3,10:753\n350#3,3:764\n348#3,25:767\n376#3,10:792\n386#3:803\n384#3,9:804\n393#3,7:814\n391#3,20:821\n682#3,60:841\n745#3,56:901\n803#3:957\n806#3:958\n807#3,6:960\n817#3,7:966\n827#3,6:973\n835#3,5:979\n867#3,6:984\n877#3:990\n878#3,11:992\n889#3,5:1004\n898#3,9:1009\n908#3,61:1019\n633#3:1080\n636#3:1081\n637#3,5:1083\n644#3:1088\n647#3,7:1089\n656#3,20:1096\n420#3:1116\n423#3,5:1117\n428#3,10:1123\n439#3,7:1133\n444#3,2:1140\n973#3:1142\n974#3,87:1144\n1064#3,48:1231\n603#3:1279\n610#3,21:1280\n1115#3,7:1301\n1125#3,7:1308\n1135#3,4:1315\n1142#3,8:1319\n1153#3,10:1327\n1166#3,14:1337\n449#3,91:1351\n543#3,40:1442\n586#3:1482\n588#3,13:1484\n1183#3:1497\n1234#3:1498\n1235#3,39:1500\n1276#3,2:1539\n1278#3,4:1542\n1285#3,3:1546\n1289#3,4:1550\n112#3:1554\n1293#3,22:1555\n114#3,18:1577\n1319#3,2:1595\n1321#3,3:1598\n112#3:1601\n1324#3,13:1602\n1337#3,13:1616\n114#3,18:1629\n1354#3,2:1647\n1357#3:1650\n112#3:1651\n1358#3,50:1652\n114#3,18:1702\n1417#3,14:1720\n1434#3,32:1734\n1469#3,12:1766\n1484#3,18:1778\n1506#3:1796\n1507#3:1798\n1512#3,34:1799\n1#4:676\n1#4:959\n1#4:991\n1#4:1082\n1#4:1143\n1#4:1483\n1#4:1499\n1#4:1541\n1#4:1549\n1#4:1597\n1#4:1649\n1#4:1797\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer\n*L\n167#1:642\n197#1:675\n235#1:677\n261#1:737\n264#1:763\n267#1:802\n267#1:813\n335#1:1003\n338#1:1018\n374#1:1122\n483#1:1615\n181#1:643,32\n252#1:678,10\n255#1:688,18\n258#1:706,2\n258#1:708\n258#1:709\n258#1:710,18\n261#1:728,9\n261#1:738,15\n264#1:753,10\n264#1:764,3\n264#1:767,25\n267#1:792,10\n267#1:803\n267#1:804,9\n267#1:814,7\n267#1:821,20\n279#1:841,60\n282#1:901,56\n284#1:957\n287#1:958\n287#1:960,6\n289#1:966,7\n292#1:973,6\n295#1:979,5\n329#1:984,6\n335#1:990\n335#1:992,11\n335#1:1004,5\n338#1:1009,9\n338#1:1019,61\n340#1:1080\n343#1:1081\n343#1:1083,5\n345#1:1088\n348#1:1089,7\n351#1:1096,20\n371#1:1116\n374#1:1117,5\n374#1:1123,10\n376#1:1133,7\n379#1:1140,2\n384#1:1142\n384#1:1144,87\n387#1:1231,48\n410#1:1279\n416#1:1280,21\n437#1:1301,7\n441#1:1308,7\n443#1:1315,4\n445#1:1319,8\n449#1:1327,10\n453#1:1337,14\n457#1:1351,91\n460#1:1442,40\n463#1:1482\n463#1:1484,13\n465#1:1497\n465#1:1498\n465#1:1500,39\n467#1:1539,2\n467#1:1542,4\n477#1:1546,3\n477#1:1550,4\n477#1:1554\n477#1:1555,22\n477#1:1577,18\n483#1:1595,2\n483#1:1598,3\n483#1:1601\n483#1:1602,13\n483#1:1616,13\n483#1:1629,18\n488#1:1647,2\n488#1:1650\n488#1:1651\n488#1:1652,50\n488#1:1702,18\n498#1:1720,14\n568#1:1734,32\n570#1:1766,12\n578#1:1778,18\n586#1:1796\n586#1:1798\n588#1:1799,34\n287#1:959\n335#1:991\n343#1:1082\n384#1:1143\n463#1:1483\n465#1:1499\n467#1:1541\n477#1:1549\n483#1:1597\n488#1:1649\n586#1:1797\n*E\n"})
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {

    @JvmField
    @Nullable
    public Segment head;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public long size;

    /* JADX INFO: compiled from: Buffer.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006$"}, d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "", "next", "", TypedValues.CycleType.S_WAVE_OFFSET, "seek", "newSize", "resizeBuffer", "minByteCount", "expandBuffer", "", HearingDisabilitiesConstants.CLOSE_MODAL, "Lokio/Buffer;", "buffer", "Lokio/Buffer;", "", "readWrite", "Z", "Lokio/Segment;", "p0", "Lokio/Segment;", "getSegment$okio", "()Lokio/Segment;", "setSegment$okio", "(Lokio/Segment;)V", "segment", "J", "", "data", "[B", EventDataKeys.Lifecycle.LIFECYCLE_START, TransactionType.TRANSACTION_TYPE_DRSP_CODE, "end", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n+ 2 Buffer.kt\nokio/internal/-Buffer\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,641:1\n1567#2:642\n1568#2:644\n1572#2:645\n1573#2,68:647\n1644#2:715\n1645#2,32:717\n1677#2,18:750\n1698#2:768\n1699#2,18:770\n1721#2:788\n1723#2,7:790\n1#3:643\n1#3:646\n1#3:716\n1#3:769\n1#3:789\n86#4:749\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n*L\n628#1:642\n628#1:644\n630#1:645\n630#1:647,68\n632#1:715\n632#1:717,32\n632#1:750,18\n634#1:768\n634#1:770,18\n637#1:788\n637#1:790,7\n628#1:643\n630#1:646\n632#1:716\n634#1:769\n637#1:789\n632#1:749\n*E\n"})
    public static final class UnsafeCursor implements Closeable {

        @JvmField
        @Nullable
        public Buffer buffer;

        @JvmField
        @Nullable
        public byte[] data;

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Segment segment;

        @JvmField
        public boolean readWrite;

        @JvmField
        public long offset = -1;

        @JvmField
        public int start = -1;

        @JvmField
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.buffer = null;
            setSegment$okio(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final long expandBuffer(int minByteCount) {
            if (minByteCount <= 0) {
                throw new IllegalArgumentException(g0.c("minByteCount <= 0: ", minByteCount).toString());
            }
            if (minByteCount > 8192) {
                throw new IllegalArgumentException(g0.c("minByteCount > Segment.SIZE: ", minByteCount).toString());
            }
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
            }
            long size = buffer.size();
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(minByteCount);
            int i10 = 8192 - segmentWritableSegment$okio.limit;
            segmentWritableSegment$okio.limit = 8192;
            long j10 = i10;
            buffer.setSize$okio(size + j10);
            setSegment$okio(segmentWritableSegment$okio);
            this.offset = size;
            this.data = segmentWritableSegment$okio.data;
            this.start = 8192 - i10;
            this.end = 8192;
            return j10;
        }

        @Nullable
        /* JADX INFO: renamed from: getSegment$okio, reason: from getter */
        public final Segment getSegment() {
            return this.segment;
        }

        public final int next() {
            long j10 = this.offset;
            Buffer buffer = this.buffer;
            Intrinsics.checkNotNull(buffer);
            if (j10 == buffer.size()) {
                throw new IllegalStateException("no more bytes".toString());
            }
            long j11 = this.offset;
            return seek(j11 == -1 ? 0L : j11 + ((long) (this.end - this.start)));
        }

        public final long resizeBuffer(long newSize) {
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long size = buffer.size();
            if (newSize <= size) {
                if (newSize < 0) {
                    throw new IllegalArgumentException(v.c("newSize < 0: ", newSize).toString());
                }
                long j10 = size - newSize;
                while (j10 > 0) {
                    Segment segment = buffer.head;
                    Intrinsics.checkNotNull(segment);
                    Segment segment2 = segment.prev;
                    Intrinsics.checkNotNull(segment2);
                    int i10 = segment2.limit;
                    long j11 = i10 - segment2.pos;
                    if (j11 > j10) {
                        segment2.limit = i10 - ((int) j10);
                        break;
                    }
                    buffer.head = segment2.pop();
                    SegmentPool.recycle(segment2);
                    j10 -= j11;
                }
                setSegment$okio(null);
                this.offset = newSize;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (newSize > size) {
                long j12 = newSize - size;
                boolean z10 = true;
                while (j12 > 0) {
                    Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                    int iMin = (int) Math.min(j12, 8192 - segmentWritableSegment$okio.limit);
                    segmentWritableSegment$okio.limit += iMin;
                    j12 -= (long) iMin;
                    if (z10) {
                        setSegment$okio(segmentWritableSegment$okio);
                        this.offset = size;
                        this.data = segmentWritableSegment$okio.data;
                        int i11 = segmentWritableSegment$okio.limit;
                        this.start = i11 - iMin;
                        this.end = i11;
                        z10 = false;
                    }
                }
            }
            buffer.setSize$okio(newSize);
            return size;
        }

        public final int seek(long offset) {
            Segment segmentPush;
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (offset < -1 || offset > buffer.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + offset + " > size=" + buffer.size());
            }
            if (offset == -1 || offset == buffer.size()) {
                setSegment$okio(null);
                this.offset = offset;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = buffer.size();
            Segment segment = buffer.head;
            long j10 = 0;
            if (getSegment() != null) {
                long j11 = this.offset;
                int i10 = this.start;
                Segment segment2 = getSegment();
                Intrinsics.checkNotNull(segment2);
                long j12 = j11 - ((long) (i10 - segment2.pos));
                if (j12 > offset) {
                    segmentPush = segment;
                    segment = getSegment();
                    size = j12;
                } else {
                    segmentPush = getSegment();
                    j10 = j12;
                }
            } else {
                segmentPush = segment;
            }
            if (size - offset > offset - j10) {
                while (true) {
                    Intrinsics.checkNotNull(segmentPush);
                    int i11 = segmentPush.limit;
                    int i12 = segmentPush.pos;
                    if (offset < ((long) (i11 - i12)) + j10) {
                        break;
                    }
                    j10 += (long) (i11 - i12);
                    segmentPush = segmentPush.next;
                }
            } else {
                while (size > offset) {
                    Intrinsics.checkNotNull(segment);
                    segment = segment.prev;
                    Intrinsics.checkNotNull(segment);
                    size -= (long) (segment.limit - segment.pos);
                }
                j10 = size;
                segmentPush = segment;
            }
            if (this.readWrite) {
                Intrinsics.checkNotNull(segmentPush);
                if (segmentPush.shared) {
                    Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                    if (buffer.head == segmentPush) {
                        buffer.head = segmentUnsharedCopy;
                    }
                    segmentPush = segmentPush.push(segmentUnsharedCopy);
                    Segment segment3 = segmentPush.prev;
                    Intrinsics.checkNotNull(segment3);
                    segment3.pop();
                }
            }
            setSegment$okio(segmentPush);
            this.offset = offset;
            Intrinsics.checkNotNull(segmentPush);
            this.data = segmentPush.data;
            int i13 = segmentPush.pos + ((int) (offset - j10));
            this.start = i13;
            int i14 = segmentPush.limit;
            this.end = i14;
            return i14 - i13;
        }

        public final void setSegment$okio(@Nullable Segment segment) {
            this.segment = segment;
        }
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j10, long j11, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = buffer.size - j12;
        }
        return buffer.copyTo(outputStream, j12, j11);
    }

    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = buffer.size;
        }
        return buffer.writeTo(outputStream, j10);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @ReplaceWith(expression = "this[index]", imports = {}))
    @JvmName(name = "-deprecated_getByte")
    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m6201deprecated_getByte(long index) {
        return getByte(index);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    @JvmName(name = "-deprecated_size")
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    public final ByteString a(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i10 = segment.pos;
            messageDigest.update(bArr, i10, segment.limit - i10);
            Segment segment2 = segment.next;
            Intrinsics.checkNotNull(segment2);
            while (segment2 != segment) {
                byte[] bArr2 = segment2.data;
                int i11 = segment2.pos;
                messageDigest.update(bArr2, i11, segment2.limit - i11);
                segment2 = segment2.next;
                Intrinsics.checkNotNull(segment2);
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return new ByteString(bArrDigest);
    }

    public final ByteString b(String str, ByteString byteString) throws NoSuchAlgorithmException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.internalArray$okio(), str));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i10 = segment.pos;
                mac.update(bArr, i10, segment.limit - i10);
                Segment segment2 = segment.next;
                Intrinsics.checkNotNull(segment2);
                while (segment2 != segment) {
                    byte[] bArr2 = segment2.data;
                    int i11 = segment2.pos;
                    mac.update(bArr2, i11, segment2.limit - i11);
                    segment2 = segment2.next;
                    Intrinsics.checkNotNull(segment2);
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public final void c(InputStream inputStream, long j10, boolean z10) throws IOException {
        while (true) {
            if (j10 <= 0 && !z10) {
                return;
            }
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int i10 = inputStream.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(j10, 8192 - segmentWritableSegment$okio.limit));
            if (i10 == -1) {
                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                    this.head = segmentWritableSegment$okio.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio);
                }
                if (!z10) {
                    throw new EOFException();
                }
                return;
            }
            segmentWritableSegment$okio.limit += i10;
            long j11 = i10;
            this.size += j11;
            j10 -= j11;
        }
    }

    public final void clear() {
        skip(size());
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = segment.prev;
        Intrinsics.checkNotNull(segment2);
        int i10 = segment2.limit;
        if (i10 < 8192 && segment2.owner) {
            size -= (long) (i10 - segment2.pos);
        }
        return size;
    }

    @NotNull
    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() != 0) {
            Segment segment = this.head;
            Intrinsics.checkNotNull(segment);
            Segment segmentSharedCopy = segment.sharedCopy();
            buffer.head = segmentSharedCopy;
            segmentSharedCopy.prev = segmentSharedCopy;
            segmentSharedCopy.next = segmentSharedCopy;
            for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
                Segment segment3 = segmentSharedCopy.prev;
                Intrinsics.checkNotNull(segment3);
                Intrinsics.checkNotNull(segment2);
                segment3.push(segment2.sharedCopy());
            }
            buffer.setSize$okio(size());
        }
        return buffer;
    }

    @JvmOverloads
    @NotNull
    public final Buffer copyTo(@NotNull OutputStream out) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        return copyTo$default(this, out, 0L, 0L, 6, (Object) null);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer emit() {
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Buffer) {
            Buffer buffer = (Buffer) other;
            if (size() == buffer.size()) {
                if (size() == 0) {
                    return true;
                }
                Segment segment = this.head;
                Intrinsics.checkNotNull(segment);
                Segment segment2 = buffer.head;
                Intrinsics.checkNotNull(segment2);
                int i10 = segment.pos;
                int i11 = segment2.pos;
                long j10 = 0;
                while (j10 < size()) {
                    long jMin = Math.min(segment.limit - i10, segment2.limit - i11);
                    long j11 = 0;
                    while (j11 < jMin) {
                        int i12 = i10 + 1;
                        int i13 = i11 + 1;
                        if (segment.data[i10] == segment2.data[i11]) {
                            j11++;
                            i10 = i12;
                            i11 = i13;
                        }
                    }
                    if (i10 == segment.limit) {
                        segment = segment.next;
                        Intrinsics.checkNotNull(segment);
                        i10 = segment.pos;
                    }
                    if (i11 == segment2.limit) {
                        segment2 = segment2.next;
                        Intrinsics.checkNotNull(segment2);
                        i11 = segment2.pos;
                    }
                    j10 += jMin;
                }
                return true;
            }
        }
        return false;
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @JvmName(name = "getByte")
    public final byte getByte(long pos) {
        SegmentedByteString.checkOffsetAndCount(size(), pos, 1L);
        Segment segment = this.head;
        if (segment == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (size() - pos < pos) {
            long size = size();
            while (size > pos) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            Intrinsics.checkNotNull(segment);
            return segment.data[(int) ((((long) segment.pos) + pos) - size)];
        }
        long j10 = 0;
        while (true) {
            long j11 = ((long) (segment.limit - segment.pos)) + j10;
            if (j11 > pos) {
                Intrinsics.checkNotNull(segment);
                return segment.data[(int) ((((long) segment.pos) + pos) - j10)];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j10 = j11;
        }
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = segment.limit;
            for (int i12 = segment.pos; i12 < i11; i12++) {
                i10 = (i10 * 31) + segment.data[i12];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
        } while (segment != this.head);
        return i10;
    }

    @NotNull
    public final ByteString hmacSha1(@NotNull ByteString key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return b(InternalZipConstants.AES_MAC_ALGORITHM, key);
    }

    @NotNull
    public final ByteString hmacSha256(@NotNull ByteString key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return b("HmacSHA256", key);
    }

    @NotNull
    public final ByteString hmacSha512(@NotNull ByteString key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return b("HmacSHA512", key);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b10) {
        return indexOf(b10, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    @NotNull
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.Buffer.inputStream.1
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size(), Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream
            public int read() {
                Buffer buffer = Buffer.this;
                if (buffer.size() > 0) {
                    return buffer.readByte() & 255;
                }
                return -1;
            }

            @NotNull
            public String toString() {
                return Buffer.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(@NotNull byte[] sink, int offset, int byteCount) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                return Buffer.this.read(sink, offset, byteCount);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @NotNull
    public final ByteString md5() {
        return a("MD5");
    }

    @Override // okio.BufferedSink
    @NotNull
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.Buffer.outputStream.1
            @NotNull
            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int b10) {
                Buffer.this.writeByte(b10);
            }

            @Override // java.io.OutputStream
            public void write(@NotNull byte[] data, int offset, int byteCount) {
                Intrinsics.checkNotNullParameter(data, "data");
                Buffer.this.write(data, offset, byteCount);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }
        };
    }

    @Override // okio.BufferedSource
    @NotNull
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long offset, @NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return rangeEquals(offset, bytes, 0, bytes.size());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), segment.limit - segment.pos);
        sink.put(segment.data, segment.pos, iMin);
        int i10 = segment.pos + iMin;
        segment.pos = i10;
        this.size -= (long) iMin;
        if (i10 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @Override // okio.BufferedSource
    public long readAll(@NotNull Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        int i12 = i10 + 1;
        byte b10 = segment.data[i10];
        setSize$okio(size() - 1);
        if (i12 == i11) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i12;
        }
        return b10;
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString() {
        return readByteString(size());
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j10 = 0;
        long j11 = -7;
        boolean z11 = false;
        do {
            Segment segment = this.head;
            Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i11 = segment.pos;
            int i12 = segment.limit;
            while (i11 < i12) {
                byte b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j10 < okio.internal.Buffer.OVERFLOW_ZONE || (j10 == okio.internal.Buffer.OVERFLOW_ZONE && i13 < j11)) {
                        Buffer bufferWriteByte = new Buffer().writeDecimalLong(j10).writeByte((int) b10);
                        if (!z10) {
                            bufferWriteByte.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + bufferWriteByte.readUtf8());
                    }
                    j10 = (j10 * 10) + ((long) i13);
                } else {
                    if (b10 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j11--;
                    z10 = true;
                }
                i11++;
                i10++;
            }
            if (i11 == i12) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i11;
            }
            if (z11) {
                break;
            }
        } while (this.head != null);
        setSize$okio(size() - ((long) i10));
        if (i10 >= (z10 ? 2 : 1)) {
            return z10 ? j10 : -j10;
        }
        if (size() == 0) {
            throw new EOFException();
        }
        StringBuilder sbE = f.e(z10 ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
        sbE.append(SegmentedByteString.toHexString(getByte(0L)));
        throw new NumberFormatException(sbE.toString());
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream input) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        c(input, Long.MAX_VALUE, true);
        return this;
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull Buffer sink, long byteCount) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (size() >= byteCount) {
            sink.write(this, byteCount);
        } else {
            sink.write(this, size());
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() throws EOFException {
        int i10;
        if (size() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            Segment segment = this.head;
            Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i12 = segment.pos;
            int i13 = segment.limit;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        if (i11 != 0) {
                            z10 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + SegmentedByteString.toHexString(b10));
                    }
                    i10 = b10 - 55;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new Buffer().writeHexadecimalUnsignedLong(j10).writeByte((int) b10).readUtf8());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i12;
            }
            if (z10) {
                break;
            }
        } while (this.head != null);
        setSize$okio(size() - ((long) i11));
        return j10;
    }

    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        setSize$okio(size() - 4);
        if (i14 == i11) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i14;
        }
        return i15;
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readInt());
    }

    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        setSize$okio(size() - 8);
        if (i13 == i11) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i13;
        }
        return j11;
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readLong());
    }

    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        setSize$okio(size() - 2);
        if (i14 == i11) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i14;
        }
        return (short) i15;
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readShort());
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return readString(this.size, charset);
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8() {
        return readString(this.size, Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (size() == 0) {
            throw new EOFException();
        }
        byte b10 = getByte(0L);
        if ((b10 & 128) == 0) {
            i10 = b10 & 127;
            i12 = 0;
            i11 = 1;
        } else if ((b10 & 224) == 192) {
            i10 = b10 & 31;
            i11 = 2;
            i12 = 128;
        } else if ((b10 & Constants.CVR_B2b8765_1111_APP_DISABLED) == 224) {
            i10 = b10 & 15;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((b10 & 248) != 240) {
                skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i10 = b10 & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j10 = i11;
        if (size() < j10) {
            StringBuilder sbC = o1.c("size < ", i11, ": ");
            sbC.append(size());
            sbC.append(" (to read code point prefixed 0x");
            sbC.append(SegmentedByteString.toHexString(b10));
            sbC.append(RootService.CLOSE_BRACKET);
            throw new EOFException(sbC.toString());
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte b11 = getByte(j11);
            if ((b11 & Constants.CVR_B2b87_11_RFU) != 128) {
                skip(j11);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i10 = (i10 << 6) | (b11 & 63);
        }
        skip(j10);
        if (i10 > 1114111) {
            return Utf8.REPLACEMENT_CODE_POINT;
        }
        return ((55296 > i10 || i10 >= 57344) && i10 >= i12) ? i10 : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Override // okio.BufferedSource
    @Nullable
    public String readUtf8Line() throws EOFException {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public boolean request(long byteCount) {
        return this.size >= byteCount;
    }

    @Override // okio.BufferedSource
    public void require(long byteCount) throws EOFException {
        if (this.size < byteCount) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(@NotNull Options options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iSelectPrefix$default = okio.internal.Buffer.selectPrefix$default(this, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public final void setSize$okio(long j10) {
        this.size = j10;
    }

    @NotNull
    public final ByteString sha1() {
        return a(McElieceCCA2KeyGenParameterSpec.SHA1);
    }

    @NotNull
    public final ByteString sha256() {
        return a("SHA-256");
    }

    @NotNull
    public final ByteString sha512() {
        return a("SHA-512");
    }

    @JvmName(name = "size")
    public final long size() {
        return this.size;
    }

    @Override // okio.BufferedSource
    public void skip(long byteCount) throws EOFException {
        while (byteCount > 0) {
            Segment segment = this.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(byteCount, segment.limit - segment.pos);
            long j10 = iMin;
            setSize$okio(size() - j10);
            byteCount -= j10;
            int i10 = segment.pos + iMin;
            segment.pos = i10;
            if (i10 == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @NotNull
    public final ByteString snapshot() {
        if (size() <= 2147483647L) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @NotNull
    public String toString() {
        return snapshot().toString();
    }

    @NotNull
    public final Segment writableSegment$okio(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        Segment segment = this.head;
        if (segment != null) {
            Intrinsics.checkNotNull(segment);
            Segment segment2 = segment.prev;
            Intrinsics.checkNotNull(segment2);
            return (segment2.limit + minimumCapacity > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        this.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @Override // okio.BufferedSink
    public long writeAll(@NotNull Source source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this, SvgConstantsKt.SPECIFIED_FONT_FAMILY);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    @JvmOverloads
    @NotNull
    public final Buffer writeTo(@NotNull OutputStream out) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        return writeTo$default(this, out, 0L, 2, null);
    }

    @NotNull
    public Buffer clone() {
        return copy();
    }

    @JvmOverloads
    @NotNull
    public final Buffer copyTo(@NotNull OutputStream out, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        return copyTo$default(this, out, j10, 0L, 4, (Object) null);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b10, long fromIndex) {
        return indexOf(b10, fromIndex, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes, long fromIndex) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (fromIndex < 0) {
            throw new IllegalArgumentException(v.c("fromIndex < 0: ", fromIndex).toString());
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - fromIndex < fromIndex) {
            size = size();
            while (size > fromIndex) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (targetBytes.size() == 2) {
                byte b10 = targetBytes.getByte(0);
                byte b11 = targetBytes.getByte(1);
                while (size < size()) {
                    byte[] bArr = segment.data;
                    i10 = (int) ((((long) segment.pos) + fromIndex) - size);
                    int i12 = segment.limit;
                    while (true) {
                        if (i10 >= i12) {
                            size += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            Intrinsics.checkNotNull(segment);
                            fromIndex = size;
                        } else {
                            byte b12 = bArr[i10];
                            if (b12 == b10 || b12 == b11) {
                                i11 = segment.pos;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
            while (size < size()) {
                byte[] bArr2 = segment.data;
                i10 = (int) ((((long) segment.pos) + fromIndex) - size);
                int i13 = segment.limit;
                while (true) {
                    if (i10 < i13) {
                        byte b13 = bArr2[i10];
                        int length = bArrInternalArray$okio.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                i10++;
                            } else if (b13 == bArrInternalArray$okio[i14]) {
                                i11 = segment.pos;
                            } else {
                                i14++;
                            }
                        }
                    } else {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        Intrinsics.checkNotNull(segment);
                        fromIndex = size;
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j10 = ((long) (segment.limit - segment.pos)) + size;
            if (j10 > fromIndex) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j10;
        }
        if (targetBytes.size() == 2) {
            byte b14 = targetBytes.getByte(0);
            byte b15 = targetBytes.getByte(1);
            while (size < size()) {
                byte[] bArr3 = segment.data;
                i10 = (int) ((((long) segment.pos) + fromIndex) - size);
                int i15 = segment.limit;
                while (true) {
                    if (i10 >= i15) {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        Intrinsics.checkNotNull(segment);
                        fromIndex = size;
                    } else {
                        byte b16 = bArr3[i10];
                        if (b16 == b14 || b16 == b15) {
                            i11 = segment.pos;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
        while (size < size()) {
            byte[] bArr4 = segment.data;
            i10 = (int) ((((long) segment.pos) + fromIndex) - size);
            int i16 = segment.limit;
            while (true) {
                if (i10 < i16) {
                    byte b17 = bArr4[i10];
                    int length2 = bArrInternalArray$okio2.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length2) {
                            i10++;
                        } else if (b17 == bArrInternalArray$okio2[i17]) {
                            i11 = segment.pos;
                        } else {
                            i17++;
                        }
                    }
                } else {
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    fromIndex = size;
                }
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long offset, @NotNull ByteString bytes, int bytesOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || size() - offset < byteCount || bytes.size() - bytesOffset < byteCount) {
            return false;
        }
        for (int i10 = 0; i10 < byteCount; i10++) {
            if (getByte(((long) i10) + offset) != bytes.getByte(bytesOffset + i10)) {
                return false;
            }
        }
        return true;
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readAndWriteUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return okio.internal.Buffer.commonReadAndWriteUnsafe(this, unsafeCursor);
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(v.c("byteCount: ", byteCount).toString());
        }
        if (size() < byteCount) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) byteCount];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(v.c("byteCount: ", byteCount).toString());
        }
        if (size() < byteCount) {
            throw new EOFException();
        }
        if (byteCount < SvgConstantsKt.SPECIFIED_COLOR) {
            return new ByteString(readByteArray(byteCount));
        }
        ByteString byteStringSnapshot = snapshot((int) byteCount);
        skip(byteCount);
        return byteStringSnapshot;
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream input, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        if (byteCount < 0) {
            throw new IllegalArgumentException(v.c("byteCount < 0: ", byteCount).toString());
        }
        c(input, byteCount, false);
        return this;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(long byteCount, @NotNull Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(v.c("byteCount: ", byteCount).toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        if (byteCount == 0) {
            return "";
        }
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
        int i10 = segment.pos;
        if (((long) i10) + byteCount > segment.limit) {
            return new String(readByteArray(byteCount), charset);
        }
        int i11 = (int) byteCount;
        String str = new String(segment.data, i10, i11, charset);
        int i12 = segment.pos + i11;
        segment.pos = i12;
        this.size -= byteCount;
        if (i12 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return okio.internal.Buffer.commonReadUnsafe(this, unsafeCursor);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8(long byteCount) throws EOFException {
        return readString(byteCount, Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(v.c("limit < 0: ", limit).toString());
        }
        long j10 = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j10);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (j10 < size() && getByte(j10 - 1) == 13 && getByte(j10) == 10) {
            return okio.internal.Buffer.readUtf8Line(this, j10);
        }
        Buffer buffer = new Buffer();
        copyTo(buffer, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), limit) + " content=" + buffer.readByteString().hex() + Typography.ellipsis);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeByte(int b10) {
        Segment segmentWritableSegment$okio = writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i10 + 1;
        bArr[i10] = (byte) b10;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeDecimalLong(long v3) {
        boolean z10;
        if (v3 == 0) {
            return writeByte(48);
        }
        int i10 = 1;
        if (v3 < 0) {
            v3 = -v3;
            if (v3 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (v3 < 100000000) {
            if (v3 < 10000) {
                if (v3 >= 100) {
                    i10 = v3 < 1000 ? 3 : 4;
                } else if (v3 >= 10) {
                    i10 = 2;
                }
            } else if (v3 < AnimationKt.MillisToNanos) {
                i10 = v3 < 100000 ? 5 : 6;
            } else {
                i10 = v3 < 10000000 ? 7 : 8;
            }
        } else if (v3 < 1000000000000L) {
            if (v3 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i10 = v3 < 1000000000 ? 9 : 10;
            } else {
                i10 = v3 < 100000000000L ? 11 : 12;
            }
        } else if (v3 < 1000000000000000L) {
            if (v3 < 10000000000000L) {
                i10 = 13;
            } else {
                i10 = v3 < 100000000000000L ? 14 : 15;
            }
        } else if (v3 < 100000000000000000L) {
            i10 = v3 < 10000000000000000L ? 16 : 17;
        } else {
            i10 = v3 < 1000000000000000000L ? 18 : 19;
        }
        if (z10) {
            i10++;
        }
        Segment segmentWritableSegment$okio = writableSegment$okio(i10);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit + i10;
        while (v3 != 0) {
            long j10 = 10;
            i11--;
            bArr[i11] = okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (v3 % j10)];
            v3 /= j10;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i10;
        setSize$okio(size() + ((long) i10));
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeHexadecimalUnsignedLong(long v3) {
        if (v3 == 0) {
            return writeByte(48);
        }
        long j10 = (v3 >>> 1) | v3;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i10 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Segment segmentWritableSegment$okio = writableSegment$okio(i10);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (15 & v3)];
            v3 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i10;
        setSize$okio(size() + ((long) i10));
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeInt(int i10) {
        Segment segmentWritableSegment$okio = writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        segmentWritableSegment$okio.limit = i11 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeIntLe(int i10) {
        return writeInt(SegmentedByteString.reverseBytes(i10));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeLong(long v3) {
        Segment segmentWritableSegment$okio = writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((v3 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((v3 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((v3 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((v3 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((v3 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((v3 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((v3 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (v3 & 255);
        segmentWritableSegment$okio.limit = i10 + 8;
        setSize$okio(size() + 8);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeLongLe(long v3) {
        return writeLong(SegmentedByteString.reverseBytes(v3));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeShort(int s4) {
        Segment segmentWritableSegment$okio = writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((s4 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (s4 & 255);
        segmentWritableSegment$okio.limit = i10 + 2;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeShortLe(int s4) {
        return writeShort((int) SegmentedByteString.reverseBytes((short) s4));
    }

    @JvmOverloads
    @NotNull
    public final Buffer writeTo(@NotNull OutputStream out, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        SegmentedByteString.checkOffsetAndCount(this.size, 0L, byteCount);
        Segment segment = this.head;
        while (byteCount > 0) {
            Intrinsics.checkNotNull(segment);
            int iMin = (int) Math.min(byteCount, segment.limit - segment.pos);
            out.write(segment.data, segment.pos, iMin);
            int i10 = segment.pos + iMin;
            segment.pos = i10;
            long j10 = iMin;
            this.size -= j10;
            byteCount -= j10;
            if (i10 == segment.limit) {
                Segment segmentPop = segment.pop();
                this.head = segmentPop;
                SegmentPool.recycle(segment);
                segment = segmentPop;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8CodePoint(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
        } else if (codePoint < 2048) {
            Segment segmentWritableSegment$okio = writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i10 = segmentWritableSegment$okio.limit;
            bArr[i10] = (byte) ((codePoint >> 6) | 192);
            bArr[i10 + 1] = (byte) ((codePoint & 63) | 128);
            segmentWritableSegment$okio.limit = i10 + 2;
            setSize$okio(size() + 2);
        } else if (55296 <= codePoint && codePoint < 57344) {
            writeByte(63);
        } else if (codePoint < 65536) {
            Segment segmentWritableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i11 = segmentWritableSegment$okio2.limit;
            bArr2[i11] = (byte) ((codePoint >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((codePoint & 63) | 128);
            segmentWritableSegment$okio2.limit = i11 + 3;
            setSize$okio(size() + 3);
        } else {
            if (codePoint > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(codePoint));
            }
            Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
            byte[] bArr3 = segmentWritableSegment$okio3.data;
            int i12 = segmentWritableSegment$okio3.limit;
            bArr3[i12] = (byte) ((codePoint >> 18) | 240);
            bArr3[i12 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
            bArr3[i12 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr3[i12 + 3] = (byte) ((codePoint & 63) | 128);
            segmentWritableSegment$okio3.limit = i12 + 4;
            setSize$okio(size() + 4);
        }
        return this;
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return buffer.copyTo(buffer2, j10, j11);
    }

    @JvmOverloads
    @NotNull
    public final Buffer copyTo(@NotNull OutputStream out, long offset, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        SegmentedByteString.checkOffsetAndCount(this.size, offset, byteCount);
        if (byteCount == 0) {
            return this;
        }
        Segment segment = this.head;
        while (true) {
            Intrinsics.checkNotNull(segment);
            int i10 = segment.limit;
            int i11 = segment.pos;
            if (offset < i10 - i11) {
                break;
            }
            offset -= (long) (i10 - i11);
            segment = segment.next;
        }
        while (byteCount > 0) {
            Intrinsics.checkNotNull(segment);
            int i12 = (int) (((long) segment.pos) + offset);
            int iMin = (int) Math.min(segment.limit - i12, byteCount);
            out.write(segment.data, i12, iMin);
            byteCount -= (long) iMin;
            segment = segment.next;
            offset = 0;
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeString(@NotNull String string, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return writeString(string, 0, string.length(), charset);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return buffer.copyTo(buffer2, j10);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b10, long fromIndex, long toIndex) {
        Segment segment;
        int i10;
        long size = 0;
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        if (toIndex > size()) {
            toIndex = size();
        }
        if (fromIndex == toIndex || (segment = this.head) == null) {
            return -1L;
        }
        if (size() - fromIndex < fromIndex) {
            size = size();
            while (size > fromIndex) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            while (size < toIndex) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + toIndex) - size);
                i10 = (int) ((((long) segment.pos) + fromIndex) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                fromIndex = size;
            }
            return -1L;
        }
        while (true) {
            long j10 = ((long) (segment.limit - segment.pos)) + size;
            if (j10 > fromIndex) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j10;
        }
        while (size < toIndex) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + toIndex) - size);
            i10 = (int) ((((long) segment.pos) + fromIndex) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            fromIndex = size;
        }
        return -1L;
        return ((long) (i10 - segment.pos)) + size;
    }

    @NotNull
    public final ByteString snapshot(int byteCount) {
        if (byteCount == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(size(), 0L, byteCount);
        Segment segment = this.head;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < byteCount) {
            Intrinsics.checkNotNull(segment);
            int i13 = segment.limit;
            int i14 = segment.pos;
            if (i13 != i14) {
                i11 += i13 - i14;
                i12++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        Segment segment2 = this.head;
        int i15 = 0;
        while (i10 < byteCount) {
            Intrinsics.checkNotNull(segment2);
            bArr[i15] = segment2.data;
            i10 += segment2.limit - segment2.pos;
            iArr[i15] = Math.min(i10, byteCount);
            iArr[i15 + i12] = segment2.pos;
            segment2.shared = true;
            i15++;
            segment2 = segment2.next;
        }
        return new C0780SegmentedByteString(bArr, iArr);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8(@NotNull String string, int beginIndex, int endIndex) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(g0.c("beginIndex < 0: ", beginIndex).toString());
        }
        if (endIndex >= beginIndex) {
            if (endIndex > string.length()) {
                StringBuilder sbC = o1.c("endIndex > string.length: ", endIndex, " > ");
                sbC.append(string.length());
                throw new IllegalArgumentException(sbC.toString().toString());
            }
            while (beginIndex < endIndex) {
                char cCharAt2 = string.charAt(beginIndex);
                if (cCharAt2 < 128) {
                    Segment segmentWritableSegment$okio = writableSegment$okio(1);
                    byte[] bArr = segmentWritableSegment$okio.data;
                    int i10 = segmentWritableSegment$okio.limit - beginIndex;
                    int iMin = Math.min(endIndex, 8192 - i10);
                    int i11 = beginIndex + 1;
                    bArr[beginIndex + i10] = (byte) cCharAt2;
                    while (true) {
                        beginIndex = i11;
                        if (beginIndex >= iMin || (cCharAt = string.charAt(beginIndex)) >= 128) {
                            break;
                        }
                        i11 = beginIndex + 1;
                        bArr[beginIndex + i10] = (byte) cCharAt;
                    }
                    int i12 = segmentWritableSegment$okio.limit;
                    int i13 = (i10 + beginIndex) - i12;
                    segmentWritableSegment$okio.limit = i12 + i13;
                    setSize$okio(size() + ((long) i13));
                } else {
                    if (cCharAt2 < 2048) {
                        Segment segmentWritableSegment$okio2 = writableSegment$okio(2);
                        byte[] bArr2 = segmentWritableSegment$okio2.data;
                        int i14 = segmentWritableSegment$okio2.limit;
                        bArr2[i14] = (byte) ((cCharAt2 >> 6) | 192);
                        bArr2[i14 + 1] = (byte) ((cCharAt2 & '?') | 128);
                        segmentWritableSegment$okio2.limit = i14 + 2;
                        setSize$okio(size() + 2);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i15 = beginIndex + 1;
                        char cCharAt3 = i15 < endIndex ? string.charAt(i15) : (char) 0;
                        if (cCharAt2 <= 56319 && 56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i16 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
                            byte[] bArr3 = segmentWritableSegment$okio3.data;
                            int i17 = segmentWritableSegment$okio3.limit;
                            bArr3[i17] = (byte) ((i16 >> 18) | 240);
                            bArr3[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                            bArr3[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                            bArr3[i17 + 3] = (byte) ((i16 & 63) | 128);
                            segmentWritableSegment$okio3.limit = i17 + 4;
                            setSize$okio(size() + 4);
                            beginIndex += 2;
                        } else {
                            writeByte(63);
                            beginIndex = i15;
                        }
                    } else {
                        Segment segmentWritableSegment$okio4 = writableSegment$okio(3);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i18 = segmentWritableSegment$okio4.limit;
                        bArr4[i18] = (byte) ((cCharAt2 >> '\f') | 224);
                        bArr4[i18 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                        bArr4[i18 + 2] = (byte) ((cCharAt2 & '?') | 128);
                        segmentWritableSegment$okio4.limit = i18 + 3;
                        setSize$okio(size() + 3);
                    }
                    beginIndex++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(n1.e("endIndex < beginIndex: ", endIndex, " < ", beginIndex).toString());
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeString(@NotNull String string, int beginIndex, int endIndex, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(g0.c("beginIndex < 0: ", beginIndex).toString());
        }
        if (endIndex >= beginIndex) {
            if (endIndex <= string.length()) {
                if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
                    return writeUtf8(string, beginIndex, endIndex);
                }
                String strSubstring = string.substring(beginIndex, endIndex);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                byte[] bytes = strSubstring.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                return write(bytes, 0, bytes.length);
            }
            StringBuilder sbC = o1.c("endIndex > string.length: ", endIndex, " > ");
            sbC.append(string.length());
            throw new IllegalArgumentException(sbC.toString().toString());
        }
        throw new IllegalArgumentException(n1.e("endIndex < beginIndex: ", endIndex, " < ", beginIndex).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i10, 8192 - segmentWritableSegment$okio.limit);
            source.get(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
            i10 -= iMin;
            segmentWritableSegment$okio.limit += iMin;
        }
        this.size += (long) iRemaining;
        return iRemaining;
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] sink, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, offset, byteCount);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(byteCount, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i10 = segment.pos;
        ArraysKt___ArraysJvmKt.copyInto(bArr, sink, offset, i10, i10 + iMin);
        segment.pos += iMin;
        setSize$okio(size() - ((long) iMin));
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer out, long offset) {
        Intrinsics.checkNotNullParameter(out, "out");
        return copyTo(out, offset, this.size - offset);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer out, long offset, long byteCount) {
        Intrinsics.checkNotNullParameter(out, "out");
        SegmentedByteString.checkOffsetAndCount(size(), offset, byteCount);
        if (byteCount != 0) {
            out.setSize$okio(out.size() + byteCount);
            Segment segment = this.head;
            while (true) {
                Intrinsics.checkNotNull(segment);
                int i10 = segment.limit;
                int i11 = segment.pos;
                if (offset < i10 - i11) {
                    break;
                }
                offset -= (long) (i10 - i11);
                segment = segment.next;
            }
            while (byteCount > 0) {
                Intrinsics.checkNotNull(segment);
                Segment segmentSharedCopy = segment.sharedCopy();
                int i12 = segmentSharedCopy.pos + ((int) offset);
                segmentSharedCopy.pos = i12;
                segmentSharedCopy.limit = Math.min(i12 + ((int) byteCount), segmentSharedCopy.limit);
                Segment segment2 = out.head;
                if (segment2 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy;
                    out.head = segmentSharedCopy;
                } else {
                    Intrinsics.checkNotNull(segment2);
                    Segment segment3 = segment2.prev;
                    Intrinsics.checkNotNull(segment3);
                    segment3.push(segmentSharedCopy);
                }
                byteCount -= (long) (segmentSharedCopy.limit - segmentSharedCopy.pos);
                segment = segment.next;
                offset = 0;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull ByteString byteString, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(this, offset, byteCount);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull byte[] source, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = byteCount;
        SegmentedByteString.checkOffsetAndCount(source.length, offset, j10);
        int i10 = byteCount + offset;
        while (offset < i10) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i10 - offset, 8192 - segmentWritableSegment$okio.limit);
            int i11 = offset + iMin;
            ArraysKt___ArraysJvmKt.copyInto(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, offset, i11);
            segmentWritableSegment$okio.limit += iMin;
            offset = i11;
        }
        setSize$okio(size() + j10);
        return this;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    /* JADX INFO: renamed from: buffer */
    public Buffer getBufferField() {
        return this;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer getBuffer() {
        return this;
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(v.c("byteCount < 0: ", byteCount).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (byteCount > size()) {
            byteCount = size();
        }
        sink.write(this, byteCount);
        return byteCount;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull Source source, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        while (byteCount > 0) {
            long j10 = source.read(this, byteCount);
            if (j10 == -1) {
                throw new EOFException();
            }
            byteCount -= j10;
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes, long fromIndex) throws IOException {
        int i10;
        long j10 = fromIndex;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long size = 0;
        if (j10 >= 0) {
            Segment segment = this.head;
            if (segment != null) {
                if (size() - j10 < j10) {
                    size = size();
                    while (size > j10) {
                        segment = segment.prev;
                        Intrinsics.checkNotNull(segment);
                        size -= (long) (segment.limit - segment.pos);
                    }
                    byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                    byte b10 = bArrInternalArray$okio[0];
                    int size2 = bytes.size();
                    long size3 = (size() - ((long) size2)) + 1;
                    while (size < size3) {
                        byte[] bArr = segment.data;
                        long j11 = size3;
                        int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + size3) - size);
                        i10 = (int) ((((long) segment.pos) + j10) - size);
                        while (i10 < iMin) {
                            if (bArr[i10] == b10 && okio.internal.Buffer.rangeEquals(segment, i10 + 1, bArrInternalArray$okio, 1, size2)) {
                                return ((long) (i10 - segment.pos)) + size;
                            }
                            i10++;
                        }
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        Intrinsics.checkNotNull(segment);
                        j10 = size;
                        size3 = j11;
                    }
                } else {
                    while (true) {
                        long j12 = ((long) (segment.limit - segment.pos)) + size;
                        if (j12 > j10) {
                            break;
                        }
                        segment = segment.next;
                        Intrinsics.checkNotNull(segment);
                        size = j12;
                    }
                    byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
                    byte b11 = bArrInternalArray$okio2[0];
                    int size4 = bytes.size();
                    long size5 = (size() - ((long) size4)) + 1;
                    while (size < size5) {
                        byte[] bArr2 = segment.data;
                        int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + size5) - size);
                        i10 = (int) ((((long) segment.pos) + j10) - size);
                        while (i10 < iMin2) {
                            if (bArr2[i10] == b11 && okio.internal.Buffer.rangeEquals(segment, i10 + 1, bArrInternalArray$okio2, 1, size4)) {
                                return ((long) (i10 - segment.pos)) + size;
                            }
                            i10++;
                        }
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        Intrinsics.checkNotNull(segment);
                        j10 = size;
                    }
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(v.c("fromIndex < 0: ", j10).toString());
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long byteCount) {
        Segment segment;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != this) {
            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
            while (byteCount > 0) {
                Segment segment2 = source.head;
                Intrinsics.checkNotNull(segment2);
                int i10 = segment2.limit;
                Segment segment3 = source.head;
                Intrinsics.checkNotNull(segment3);
                if (byteCount < i10 - segment3.pos) {
                    Segment segment4 = this.head;
                    if (segment4 != null) {
                        Intrinsics.checkNotNull(segment4);
                        segment = segment4.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((((long) segment.limit) + byteCount) - ((long) (segment.shared ? 0 : segment.pos)) <= SvgConstantsKt.SPECIFIED_FONT_FAMILY) {
                            Segment segment5 = source.head;
                            Intrinsics.checkNotNull(segment5);
                            segment5.writeTo(segment, (int) byteCount);
                            source.setSize$okio(source.size() - byteCount);
                            setSize$okio(size() + byteCount);
                            return;
                        }
                    }
                    Segment segment6 = source.head;
                    Intrinsics.checkNotNull(segment6);
                    source.head = segment6.split((int) byteCount);
                }
                Segment segment7 = source.head;
                Intrinsics.checkNotNull(segment7);
                long j10 = segment7.limit - segment7.pos;
                source.head = segment7.pop();
                Segment segment8 = this.head;
                if (segment8 == null) {
                    this.head = segment7;
                    segment7.prev = segment7;
                    segment7.next = segment7;
                } else {
                    Intrinsics.checkNotNull(segment8);
                    Segment segment9 = segment8.prev;
                    Intrinsics.checkNotNull(segment9);
                    segment9.push(segment7).compact();
                }
                source.setSize$okio(source.size() - j10);
                setSize$okio(size() + j10);
                byteCount -= j10;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }
}
