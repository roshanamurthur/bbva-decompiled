package androidx.compose.material3;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TonalPalette.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0003\bÇ\u0001\b\u0000\u0018\u00002\u00020\u0001B¬\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\u0006\u00101\u001a\u00020\u0002\u0012\u0006\u00104\u001a\u00020\u0002\u0012\u0006\u00107\u001a\u00020\u0002\u0012\u0006\u0010:\u001a\u00020\u0002\u0012\u0006\u0010=\u001a\u00020\u0002\u0012\u0006\u0010@\u001a\u00020\u0002\u0012\u0006\u0010C\u001a\u00020\u0002\u0012\u0006\u0010F\u001a\u00020\u0002\u0012\u0006\u0010I\u001a\u00020\u0002\u0012\u0006\u0010L\u001a\u00020\u0002\u0012\u0006\u0010O\u001a\u00020\u0002\u0012\u0006\u0010R\u001a\u00020\u0002\u0012\u0006\u0010U\u001a\u00020\u0002\u0012\u0006\u0010X\u001a\u00020\u0002\u0012\u0006\u0010[\u001a\u00020\u0002\u0012\u0006\u0010^\u001a\u00020\u0002\u0012\u0006\u0010a\u001a\u00020\u0002\u0012\u0006\u0010d\u001a\u00020\u0002\u0012\u0006\u0010g\u001a\u00020\u0002\u0012\u0006\u0010j\u001a\u00020\u0002\u0012\u0006\u0010m\u001a\u00020\u0002\u0012\u0006\u0010o\u001a\u00020\u0002\u0012\u0006\u0010r\u001a\u00020\u0002\u0012\u0006\u0010u\u001a\u00020\u0002\u0012\u0006\u0010x\u001a\u00020\u0002\u0012\u0006\u0010{\u001a\u00020\u0002\u0012\u0006\u0010~\u001a\u00020\u0002\u0012\u0007\u0010\u0081\u0001\u001a\u00020\u0002\u0012\u0007\u0010\u0084\u0001\u001a\u00020\u0002\u0012\u0007\u0010\u0087\u0001\u001a\u00020\u0002\u0012\u0007\u0010\u008a\u0001\u001a\u00020\u0002\u0012\u0007\u0010\u008d\u0001\u001a\u00020\u0002\u0012\u0007\u0010\u0090\u0001\u001a\u00020\u0002\u0012\u0007\u0010\u0093\u0001\u001a\u00020\u0002\u0012\u0007\u0010\u0096\u0001\u001a\u00020\u0002\u0012\u0007\u0010\u0099\u0001\u001a\u00020\u0002\u0012\u0007\u0010\u009c\u0001\u001a\u00020\u0002\u0012\u0007\u0010\u009f\u0001\u001a\u00020\u0002\u0012\u0007\u0010¢\u0001\u001a\u00020\u0002\u0012\u0007\u0010¥\u0001\u001a\u00020\u0002\u0012\u0007\u0010¨\u0001\u001a\u00020\u0002\u0012\u0007\u0010«\u0001\u001a\u00020\u0002\u0012\u0007\u0010®\u0001\u001a\u00020\u0002\u0012\u0007\u0010±\u0001\u001a\u00020\u0002\u0012\u0007\u0010´\u0001\u001a\u00020\u0002\u0012\u0007\u0010·\u0001\u001a\u00020\u0002\u0012\u0007\u0010º\u0001\u001a\u00020\u0002\u0012\u0007\u0010½\u0001\u001a\u00020\u0002\u0012\u0007\u0010À\u0001\u001a\u00020\u0002\u0012\u0007\u0010Ã\u0001\u001a\u00020\u0002\u0012\u0007\u0010Æ\u0001\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0006\bÇ\u0001\u0010È\u0001R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R \u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R \u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R \u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010(\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R \u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R \u0010.\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R \u00101\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R \u00104\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R \u00107\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R \u0010:\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R \u0010=\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R \u0010@\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006R \u0010C\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R \u0010F\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0006R \u0010I\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R \u0010L\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006R \u0010O\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bM\u0010\u0004\u001a\u0004\bN\u0010\u0006R \u0010R\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bP\u0010\u0004\u001a\u0004\bQ\u0010\u0006R \u0010U\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bS\u0010\u0004\u001a\u0004\bT\u0010\u0006R \u0010X\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bV\u0010\u0004\u001a\u0004\bW\u0010\u0006R \u0010[\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bY\u0010\u0004\u001a\u0004\bZ\u0010\u0006R \u0010^\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\\\u0010\u0004\u001a\u0004\b]\u0010\u0006R \u0010a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b_\u0010\u0004\u001a\u0004\b`\u0010\u0006R \u0010d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bb\u0010\u0004\u001a\u0004\bc\u0010\u0006R \u0010g\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\be\u0010\u0004\u001a\u0004\bf\u0010\u0006R \u0010j\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bh\u0010\u0004\u001a\u0004\bi\u0010\u0006R \u0010m\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bk\u0010\u0004\u001a\u0004\bl\u0010\u0006R \u0010o\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0004\u001a\u0004\bn\u0010\u0006R \u0010r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bp\u0010\u0004\u001a\u0004\bq\u0010\u0006R \u0010u\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bs\u0010\u0004\u001a\u0004\bt\u0010\u0006R \u0010x\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bv\u0010\u0004\u001a\u0004\bw\u0010\u0006R \u0010{\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\by\u0010\u0004\u001a\u0004\bz\u0010\u0006R \u0010~\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b|\u0010\u0004\u001a\u0004\b}\u0010\u0006R\"\u0010\u0081\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0004\b\u007f\u0010\u0004\u001a\u0005\b\u0080\u0001\u0010\u0006R#\u0010\u0084\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u0004\u001a\u0005\b\u0083\u0001\u0010\u0006R#\u0010\u0087\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0004\u001a\u0005\b\u0086\u0001\u0010\u0006R#\u0010\u008a\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\u0004\u001a\u0005\b\u0089\u0001\u0010\u0006R#\u0010\u008d\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0004\u001a\u0005\b\u008c\u0001\u0010\u0006R#\u0010\u0090\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0004\u001a\u0005\b\u008f\u0001\u0010\u0006R#\u0010\u0093\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0004\u001a\u0005\b\u0092\u0001\u0010\u0006R#\u0010\u0096\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\u0004\u001a\u0005\b\u0095\u0001\u0010\u0006R#\u0010\u0099\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0004\u001a\u0005\b\u0098\u0001\u0010\u0006R#\u0010\u009c\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010\u0004\u001a\u0005\b\u009b\u0001\u0010\u0006R#\u0010\u009f\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0004\u001a\u0005\b\u009e\u0001\u0010\u0006R#\u0010¢\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b \u0001\u0010\u0004\u001a\u0005\b¡\u0001\u0010\u0006R#\u0010¥\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b£\u0001\u0010\u0004\u001a\u0005\b¤\u0001\u0010\u0006R#\u0010¨\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¦\u0001\u0010\u0004\u001a\u0005\b§\u0001\u0010\u0006R#\u0010«\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b©\u0001\u0010\u0004\u001a\u0005\bª\u0001\u0010\u0006R#\u0010®\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¬\u0001\u0010\u0004\u001a\u0005\b\u00ad\u0001\u0010\u0006R#\u0010±\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¯\u0001\u0010\u0004\u001a\u0005\b°\u0001\u0010\u0006R#\u0010´\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b²\u0001\u0010\u0004\u001a\u0005\b³\u0001\u0010\u0006R#\u0010·\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bµ\u0001\u0010\u0004\u001a\u0005\b¶\u0001\u0010\u0006R#\u0010º\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¸\u0001\u0010\u0004\u001a\u0005\b¹\u0001\u0010\u0006R#\u0010½\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b»\u0001\u0010\u0004\u001a\u0005\b¼\u0001\u0010\u0006R#\u0010À\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¾\u0001\u0010\u0004\u001a\u0005\b¿\u0001\u0010\u0006R#\u0010Ã\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÁ\u0001\u0010\u0004\u001a\u0005\bÂ\u0001\u0010\u0006R#\u0010Æ\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÄ\u0001\u0010\u0004\u001a\u0005\bÅ\u0001\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006É\u0001"}, d2 = {"Landroidx/compose/material3/TonalPalette;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getNeutral100-0d7_KjU", "()J", "neutral100", "b", "getNeutral99-0d7_KjU", "neutral99", "c", "getNeutral95-0d7_KjU", "neutral95", "d", "getNeutral90-0d7_KjU", "neutral90", "e", "getNeutral80-0d7_KjU", "neutral80", "f", "getNeutral70-0d7_KjU", "neutral70", "g", "getNeutral60-0d7_KjU", "neutral60", "h", "getNeutral50-0d7_KjU", "neutral50", "i", "getNeutral40-0d7_KjU", "neutral40", "j", "getNeutral30-0d7_KjU", "neutral30", "k", "getNeutral20-0d7_KjU", "neutral20", "l", "getNeutral10-0d7_KjU", "neutral10", "m", "getNeutral0-0d7_KjU", "neutral0", "n", "getNeutralVariant100-0d7_KjU", "neutralVariant100", "o", "getNeutralVariant99-0d7_KjU", "neutralVariant99", "p", "getNeutralVariant95-0d7_KjU", "neutralVariant95", "q", "getNeutralVariant90-0d7_KjU", "neutralVariant90", "r", "getNeutralVariant80-0d7_KjU", "neutralVariant80", "s", "getNeutralVariant70-0d7_KjU", "neutralVariant70", "t", "getNeutralVariant60-0d7_KjU", "neutralVariant60", "u", "getNeutralVariant50-0d7_KjU", "neutralVariant50", SharedPrefsStorage.VERSION_KEY, "getNeutralVariant40-0d7_KjU", "neutralVariant40", "w", "getNeutralVariant30-0d7_KjU", "neutralVariant30", "x", "getNeutralVariant20-0d7_KjU", "neutralVariant20", "y", "getNeutralVariant10-0d7_KjU", "neutralVariant10", "z", "getNeutralVariant0-0d7_KjU", "neutralVariant0", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getPrimary100-0d7_KjU", "primary100", "B", "getPrimary99-0d7_KjU", "primary99", "C", "getPrimary95-0d7_KjU", "primary95", "D", "getPrimary90-0d7_KjU", "primary90", ExifInterface.LONGITUDE_EAST, "getPrimary80-0d7_KjU", "primary80", "F", "getPrimary70-0d7_KjU", "primary70", "G", "getPrimary60-0d7_KjU", "primary60", "H", "getPrimary50-0d7_KjU", "primary50", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPrimary40-0d7_KjU", "primary40", "getPrimary30-0d7_KjU", "primary30", "K", "getPrimary20-0d7_KjU", "primary20", "L", "getPrimary10-0d7_KjU", "primary10", "M", "getPrimary0-0d7_KjU", "primary0", "N", "getSecondary100-0d7_KjU", "secondary100", "O", "getSecondary99-0d7_KjU", "secondary99", "P", "getSecondary95-0d7_KjU", "secondary95", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "getSecondary90-0d7_KjU", "secondary90", "R", "getSecondary80-0d7_KjU", "secondary80", ExifInterface.LATITUDE_SOUTH, "getSecondary70-0d7_KjU", "secondary70", ExifInterface.GPS_DIRECTION_TRUE, "getSecondary60-0d7_KjU", "secondary60", "U", "getSecondary50-0d7_KjU", "secondary50", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getSecondary40-0d7_KjU", "secondary40", ExifInterface.LONGITUDE_WEST, "getSecondary30-0d7_KjU", "secondary30", "X", "getSecondary20-0d7_KjU", "secondary20", "Y", "getSecondary10-0d7_KjU", "secondary10", "Z", "getSecondary0-0d7_KjU", "secondary0", "a0", "getTertiary100-0d7_KjU", "tertiary100", "b0", "getTertiary99-0d7_KjU", "tertiary99", "c0", "getTertiary95-0d7_KjU", "tertiary95", "d0", "getTertiary90-0d7_KjU", "tertiary90", "e0", "getTertiary80-0d7_KjU", "tertiary80", "f0", "getTertiary70-0d7_KjU", "tertiary70", "g0", "getTertiary60-0d7_KjU", "tertiary60", "h0", "getTertiary50-0d7_KjU", "tertiary50", "i0", "getTertiary40-0d7_KjU", "tertiary40", "j0", "getTertiary30-0d7_KjU", "tertiary30", "k0", "getTertiary20-0d7_KjU", "tertiary20", "l0", "getTertiary10-0d7_KjU", "tertiary10", "m0", "getTertiary0-0d7_KjU", "tertiary0", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class TonalPalette {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final long primary100;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public final long primary99;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final long primary95;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public final long primary90;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final long primary80;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final long primary70;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final long primary60;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final long primary50;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final long primary40;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public final long primary30;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public final long primary20;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final long primary10;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public final long primary0;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public final long secondary100;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public final long secondary99;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public final long secondary95;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public final long secondary90;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public final long secondary80;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public final long secondary70;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public final long secondary60;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public final long secondary50;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public final long secondary40;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public final long secondary30;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public final long secondary20;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public final long secondary10;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public final long secondary0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long neutral100;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    public final long tertiary100;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long neutral99;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    public final long tertiary99;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long neutral95;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    public final long tertiary95;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long neutral90;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    public final long tertiary90;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long neutral80;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    public final long tertiary80;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long neutral70;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    public final long tertiary70;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final long neutral60;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    public final long tertiary60;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final long neutral50;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    public final long tertiary50;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final long neutral40;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public final long tertiary40;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final long neutral30;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public final long tertiary30;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final long neutral20;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public final long tertiary20;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final long neutral10;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    public final long tertiary10;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final long neutral0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    public final long tertiary0;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final long neutralVariant100;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final long neutralVariant99;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final long neutralVariant95;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final long neutralVariant90;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final long neutralVariant80;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final long neutralVariant70;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final long neutralVariant60;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final long neutralVariant50;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final long neutralVariant40;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final long neutralVariant30;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final long neutralVariant20;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final long neutralVariant10;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final long neutralVariant0;

    public TonalPalette(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, long j63, long j64, long j65, long j66, long j67, long j68, long j69, long j70, long j71, long j72, long j73, long j74, DefaultConstructorMarker defaultConstructorMarker) {
        this.neutral100 = j10;
        this.neutral99 = j11;
        this.neutral95 = j12;
        this.neutral90 = j13;
        this.neutral80 = j14;
        this.neutral70 = j15;
        this.neutral60 = j16;
        this.neutral50 = j17;
        this.neutral40 = j18;
        this.neutral30 = j19;
        this.neutral20 = j20;
        this.neutral10 = j21;
        this.neutral0 = j22;
        this.neutralVariant100 = j23;
        this.neutralVariant99 = j24;
        this.neutralVariant95 = j25;
        this.neutralVariant90 = j26;
        this.neutralVariant80 = j27;
        this.neutralVariant70 = j28;
        this.neutralVariant60 = j29;
        this.neutralVariant50 = j30;
        this.neutralVariant40 = j31;
        this.neutralVariant30 = j32;
        this.neutralVariant20 = j33;
        this.neutralVariant10 = j34;
        this.neutralVariant0 = j35;
        this.primary100 = j36;
        this.primary99 = j37;
        this.primary95 = j38;
        this.primary90 = j39;
        this.primary80 = j40;
        this.primary70 = j41;
        this.primary60 = j42;
        this.primary50 = j43;
        this.primary40 = j44;
        this.primary30 = j45;
        this.primary20 = j46;
        this.primary10 = j47;
        this.primary0 = j48;
        this.secondary100 = j49;
        this.secondary99 = j50;
        this.secondary95 = j51;
        this.secondary90 = j52;
        this.secondary80 = j53;
        this.secondary70 = j54;
        this.secondary60 = j55;
        this.secondary50 = j56;
        this.secondary40 = j57;
        this.secondary30 = j58;
        this.secondary20 = j59;
        this.secondary10 = j60;
        this.secondary0 = j61;
        this.tertiary100 = j62;
        this.tertiary99 = j63;
        this.tertiary95 = j64;
        this.tertiary90 = j65;
        this.tertiary80 = j66;
        this.tertiary70 = j67;
        this.tertiary60 = j68;
        this.tertiary50 = j69;
        this.tertiary40 = j70;
        this.tertiary30 = j71;
        this.tertiary20 = j72;
        this.tertiary10 = j73;
        this.tertiary0 = j74;
    }

    /* JADX INFO: renamed from: getNeutral0-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutral0() {
        return this.neutral0;
    }

    /* JADX INFO: renamed from: getNeutral10-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutral10() {
        return this.neutral10;
    }

    /* JADX INFO: renamed from: getNeutral100-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutral100() {
        return this.neutral100;
    }

    /* JADX INFO: renamed from: getNeutral20-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutral20() {
        return this.neutral20;
    }

    /* JADX INFO: renamed from: getNeutral30-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutral30() {
        return this.neutral30;
    }

    /* JADX INFO: renamed from: getNeutral40-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutral40() {
        return this.neutral40;
    }

    /* JADX INFO: renamed from: getNeutral50-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutral50() {
        return this.neutral50;
    }

    /* JADX INFO: renamed from: getNeutral60-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutral60() {
        return this.neutral60;
    }

    /* JADX INFO: renamed from: getNeutral70-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutral70() {
        return this.neutral70;
    }

    /* JADX INFO: renamed from: getNeutral80-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutral80() {
        return this.neutral80;
    }

    /* JADX INFO: renamed from: getNeutral90-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutral90() {
        return this.neutral90;
    }

    /* JADX INFO: renamed from: getNeutral95-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutral95() {
        return this.neutral95;
    }

    /* JADX INFO: renamed from: getNeutral99-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutral99() {
        return this.neutral99;
    }

    /* JADX INFO: renamed from: getNeutralVariant0-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutralVariant0() {
        return this.neutralVariant0;
    }

    /* JADX INFO: renamed from: getNeutralVariant10-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutralVariant10() {
        return this.neutralVariant10;
    }

    /* JADX INFO: renamed from: getNeutralVariant100-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutralVariant100() {
        return this.neutralVariant100;
    }

    /* JADX INFO: renamed from: getNeutralVariant20-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutralVariant20() {
        return this.neutralVariant20;
    }

    /* JADX INFO: renamed from: getNeutralVariant30-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutralVariant30() {
        return this.neutralVariant30;
    }

    /* JADX INFO: renamed from: getNeutralVariant40-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutralVariant40() {
        return this.neutralVariant40;
    }

    /* JADX INFO: renamed from: getNeutralVariant50-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutralVariant50() {
        return this.neutralVariant50;
    }

    /* JADX INFO: renamed from: getNeutralVariant60-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutralVariant60() {
        return this.neutralVariant60;
    }

    /* JADX INFO: renamed from: getNeutralVariant70-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutralVariant70() {
        return this.neutralVariant70;
    }

    /* JADX INFO: renamed from: getNeutralVariant80-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutralVariant80() {
        return this.neutralVariant80;
    }

    /* JADX INFO: renamed from: getNeutralVariant90-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutralVariant90() {
        return this.neutralVariant90;
    }

    /* JADX INFO: renamed from: getNeutralVariant95-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutralVariant95() {
        return this.neutralVariant95;
    }

    /* JADX INFO: renamed from: getNeutralVariant99-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutralVariant99() {
        return this.neutralVariant99;
    }

    /* JADX INFO: renamed from: getPrimary0-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary0() {
        return this.primary0;
    }

    /* JADX INFO: renamed from: getPrimary10-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary10() {
        return this.primary10;
    }

    /* JADX INFO: renamed from: getPrimary100-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary100() {
        return this.primary100;
    }

    /* JADX INFO: renamed from: getPrimary20-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary20() {
        return this.primary20;
    }

    /* JADX INFO: renamed from: getPrimary30-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary30() {
        return this.primary30;
    }

    /* JADX INFO: renamed from: getPrimary40-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary40() {
        return this.primary40;
    }

    /* JADX INFO: renamed from: getPrimary50-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary50() {
        return this.primary50;
    }

    /* JADX INFO: renamed from: getPrimary60-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary60() {
        return this.primary60;
    }

    /* JADX INFO: renamed from: getPrimary70-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary70() {
        return this.primary70;
    }

    /* JADX INFO: renamed from: getPrimary80-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary80() {
        return this.primary80;
    }

    /* JADX INFO: renamed from: getPrimary90-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary90() {
        return this.primary90;
    }

    /* JADX INFO: renamed from: getPrimary95-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary95() {
        return this.primary95;
    }

    /* JADX INFO: renamed from: getPrimary99-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary99() {
        return this.primary99;
    }

    /* JADX INFO: renamed from: getSecondary0-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondary0() {
        return this.secondary0;
    }

    /* JADX INFO: renamed from: getSecondary10-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondary10() {
        return this.secondary10;
    }

    /* JADX INFO: renamed from: getSecondary100-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondary100() {
        return this.secondary100;
    }

    /* JADX INFO: renamed from: getSecondary20-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondary20() {
        return this.secondary20;
    }

    /* JADX INFO: renamed from: getSecondary30-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondary30() {
        return this.secondary30;
    }

    /* JADX INFO: renamed from: getSecondary40-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondary40() {
        return this.secondary40;
    }

    /* JADX INFO: renamed from: getSecondary50-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondary50() {
        return this.secondary50;
    }

    /* JADX INFO: renamed from: getSecondary60-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondary60() {
        return this.secondary60;
    }

    /* JADX INFO: renamed from: getSecondary70-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondary70() {
        return this.secondary70;
    }

    /* JADX INFO: renamed from: getSecondary80-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondary80() {
        return this.secondary80;
    }

    /* JADX INFO: renamed from: getSecondary90-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondary90() {
        return this.secondary90;
    }

    /* JADX INFO: renamed from: getSecondary95-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondary95() {
        return this.secondary95;
    }

    /* JADX INFO: renamed from: getSecondary99-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondary99() {
        return this.secondary99;
    }

    /* JADX INFO: renamed from: getTertiary0-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiary0() {
        return this.tertiary0;
    }

    /* JADX INFO: renamed from: getTertiary10-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiary10() {
        return this.tertiary10;
    }

    /* JADX INFO: renamed from: getTertiary100-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiary100() {
        return this.tertiary100;
    }

    /* JADX INFO: renamed from: getTertiary20-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiary20() {
        return this.tertiary20;
    }

    /* JADX INFO: renamed from: getTertiary30-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiary30() {
        return this.tertiary30;
    }

    /* JADX INFO: renamed from: getTertiary40-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiary40() {
        return this.tertiary40;
    }

    /* JADX INFO: renamed from: getTertiary50-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiary50() {
        return this.tertiary50;
    }

    /* JADX INFO: renamed from: getTertiary60-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiary60() {
        return this.tertiary60;
    }

    /* JADX INFO: renamed from: getTertiary70-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiary70() {
        return this.tertiary70;
    }

    /* JADX INFO: renamed from: getTertiary80-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiary80() {
        return this.tertiary80;
    }

    /* JADX INFO: renamed from: getTertiary90-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiary90() {
        return this.tertiary90;
    }

    /* JADX INFO: renamed from: getTertiary95-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiary95() {
        return this.tertiary95;
    }

    /* JADX INFO: renamed from: getTertiary99-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiary99() {
        return this.tertiary99;
    }
}
