package androidx.compose.material3.tokens;

import androidx.compose.ui.graphics.ColorKt;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.esotericsoftware.asm.Opcodes;
import com.veridas.detect.ImageAnalysisKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PaletteTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0003\bô\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\bô\u0001\u0010õ\u0001R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R \u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R \u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R \u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010(\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R \u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R \u0010.\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R \u00101\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R \u00104\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R \u00107\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R \u0010:\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R \u0010=\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R \u0010@\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006R \u0010C\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R \u0010F\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0006R \u0010I\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R \u0010L\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006R \u0010O\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bM\u0010\u0004\u001a\u0004\bN\u0010\u0006R \u0010R\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bP\u0010\u0004\u001a\u0004\bQ\u0010\u0006R \u0010U\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bS\u0010\u0004\u001a\u0004\bT\u0010\u0006R \u0010X\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bV\u0010\u0004\u001a\u0004\bW\u0010\u0006R \u0010[\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bY\u0010\u0004\u001a\u0004\bZ\u0010\u0006R \u0010^\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\\\u0010\u0004\u001a\u0004\b]\u0010\u0006R \u0010a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b_\u0010\u0004\u001a\u0004\b`\u0010\u0006R \u0010d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bb\u0010\u0004\u001a\u0004\bc\u0010\u0006R \u0010g\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\be\u0010\u0004\u001a\u0004\bf\u0010\u0006R \u0010j\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bh\u0010\u0004\u001a\u0004\bi\u0010\u0006R \u0010m\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bk\u0010\u0004\u001a\u0004\bl\u0010\u0006R \u0010o\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0004\u001a\u0004\bn\u0010\u0006R \u0010r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bp\u0010\u0004\u001a\u0004\bq\u0010\u0006R \u0010u\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bs\u0010\u0004\u001a\u0004\bt\u0010\u0006R \u0010x\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bv\u0010\u0004\u001a\u0004\bw\u0010\u0006R \u0010{\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\by\u0010\u0004\u001a\u0004\bz\u0010\u0006R \u0010~\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b|\u0010\u0004\u001a\u0004\b}\u0010\u0006R\"\u0010\u0081\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0004\b\u007f\u0010\u0004\u001a\u0005\b\u0080\u0001\u0010\u0006R#\u0010\u0084\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u0004\u001a\u0005\b\u0083\u0001\u0010\u0006R#\u0010\u0087\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0004\u001a\u0005\b\u0086\u0001\u0010\u0006R#\u0010\u008a\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\u0004\u001a\u0005\b\u0089\u0001\u0010\u0006R#\u0010\u008d\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0004\u001a\u0005\b\u008c\u0001\u0010\u0006R#\u0010\u0090\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0004\u001a\u0005\b\u008f\u0001\u0010\u0006R#\u0010\u0093\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0004\u001a\u0005\b\u0092\u0001\u0010\u0006R#\u0010\u0096\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\u0004\u001a\u0005\b\u0095\u0001\u0010\u0006R#\u0010\u0099\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0004\u001a\u0005\b\u0098\u0001\u0010\u0006R#\u0010\u009c\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010\u0004\u001a\u0005\b\u009b\u0001\u0010\u0006R#\u0010\u009f\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0004\u001a\u0005\b\u009e\u0001\u0010\u0006R#\u0010¢\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b \u0001\u0010\u0004\u001a\u0005\b¡\u0001\u0010\u0006R#\u0010¥\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b£\u0001\u0010\u0004\u001a\u0005\b¤\u0001\u0010\u0006R#\u0010¨\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¦\u0001\u0010\u0004\u001a\u0005\b§\u0001\u0010\u0006R#\u0010«\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b©\u0001\u0010\u0004\u001a\u0005\bª\u0001\u0010\u0006R#\u0010®\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¬\u0001\u0010\u0004\u001a\u0005\b\u00ad\u0001\u0010\u0006R#\u0010±\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¯\u0001\u0010\u0004\u001a\u0005\b°\u0001\u0010\u0006R#\u0010´\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b²\u0001\u0010\u0004\u001a\u0005\b³\u0001\u0010\u0006R#\u0010·\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bµ\u0001\u0010\u0004\u001a\u0005\b¶\u0001\u0010\u0006R#\u0010º\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¸\u0001\u0010\u0004\u001a\u0005\b¹\u0001\u0010\u0006R#\u0010½\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b»\u0001\u0010\u0004\u001a\u0005\b¼\u0001\u0010\u0006R#\u0010À\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¾\u0001\u0010\u0004\u001a\u0005\b¿\u0001\u0010\u0006R#\u0010Ã\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÁ\u0001\u0010\u0004\u001a\u0005\bÂ\u0001\u0010\u0006R#\u0010Æ\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÄ\u0001\u0010\u0004\u001a\u0005\bÅ\u0001\u0010\u0006R#\u0010É\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÇ\u0001\u0010\u0004\u001a\u0005\bÈ\u0001\u0010\u0006R#\u0010Ì\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÊ\u0001\u0010\u0004\u001a\u0005\bË\u0001\u0010\u0006R#\u0010Ï\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÍ\u0001\u0010\u0004\u001a\u0005\bÎ\u0001\u0010\u0006R#\u0010Ò\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÐ\u0001\u0010\u0004\u001a\u0005\bÑ\u0001\u0010\u0006R#\u0010Õ\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÓ\u0001\u0010\u0004\u001a\u0005\bÔ\u0001\u0010\u0006R#\u0010Ø\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÖ\u0001\u0010\u0004\u001a\u0005\b×\u0001\u0010\u0006R#\u0010Û\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÙ\u0001\u0010\u0004\u001a\u0005\bÚ\u0001\u0010\u0006R#\u0010Þ\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÜ\u0001\u0010\u0004\u001a\u0005\bÝ\u0001\u0010\u0006R#\u0010á\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bß\u0001\u0010\u0004\u001a\u0005\bà\u0001\u0010\u0006R#\u0010ä\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bâ\u0001\u0010\u0004\u001a\u0005\bã\u0001\u0010\u0006R#\u0010ç\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bå\u0001\u0010\u0004\u001a\u0005\bæ\u0001\u0010\u0006R#\u0010ê\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bè\u0001\u0010\u0004\u001a\u0005\bé\u0001\u0010\u0006R#\u0010í\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bë\u0001\u0010\u0004\u001a\u0005\bì\u0001\u0010\u0006R#\u0010ð\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bî\u0001\u0010\u0004\u001a\u0005\bï\u0001\u0010\u0006R#\u0010ó\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bñ\u0001\u0010\u0004\u001a\u0005\bò\u0001\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006ö\u0001"}, d2 = {"Landroidx/compose/material3/tokens/PaletteTokens;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getBlack-0d7_KjU", "()J", "Black", "b", "getError0-0d7_KjU", "Error0", "c", "getError10-0d7_KjU", "Error10", "d", "getError100-0d7_KjU", "Error100", "e", "getError20-0d7_KjU", "Error20", "f", "getError30-0d7_KjU", "Error30", "g", "getError40-0d7_KjU", "Error40", "h", "getError50-0d7_KjU", "Error50", "i", "getError60-0d7_KjU", "Error60", "j", "getError70-0d7_KjU", "Error70", "k", "getError80-0d7_KjU", "Error80", "l", "getError90-0d7_KjU", "Error90", "m", "getError95-0d7_KjU", "Error95", "n", "getError99-0d7_KjU", "Error99", "o", "getNeutral0-0d7_KjU", "Neutral0", "p", "getNeutral10-0d7_KjU", "Neutral10", "q", "getNeutral100-0d7_KjU", "Neutral100", "r", "getNeutral20-0d7_KjU", "Neutral20", "s", "getNeutral30-0d7_KjU", "Neutral30", "t", "getNeutral40-0d7_KjU", "Neutral40", "u", "getNeutral50-0d7_KjU", "Neutral50", SharedPrefsStorage.VERSION_KEY, "getNeutral60-0d7_KjU", "Neutral60", "w", "getNeutral70-0d7_KjU", "Neutral70", "x", "getNeutral80-0d7_KjU", "Neutral80", "y", "getNeutral90-0d7_KjU", "Neutral90", "z", "getNeutral95-0d7_KjU", "Neutral95", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getNeutral99-0d7_KjU", "Neutral99", "B", "getNeutralVariant0-0d7_KjU", "NeutralVariant0", "C", "getNeutralVariant10-0d7_KjU", "NeutralVariant10", "D", "getNeutralVariant100-0d7_KjU", "NeutralVariant100", ExifInterface.LONGITUDE_EAST, "getNeutralVariant20-0d7_KjU", "NeutralVariant20", "F", "getNeutralVariant30-0d7_KjU", "NeutralVariant30", "G", "getNeutralVariant40-0d7_KjU", "NeutralVariant40", "H", "getNeutralVariant50-0d7_KjU", "NeutralVariant50", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getNeutralVariant60-0d7_KjU", "NeutralVariant60", "getNeutralVariant70-0d7_KjU", "NeutralVariant70", "K", "getNeutralVariant80-0d7_KjU", "NeutralVariant80", "L", "getNeutralVariant90-0d7_KjU", "NeutralVariant90", "M", "getNeutralVariant95-0d7_KjU", "NeutralVariant95", "N", "getNeutralVariant99-0d7_KjU", "NeutralVariant99", "O", "getPrimary0-0d7_KjU", "Primary0", "P", "getPrimary10-0d7_KjU", "Primary10", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "getPrimary100-0d7_KjU", "Primary100", "R", "getPrimary20-0d7_KjU", "Primary20", ExifInterface.LATITUDE_SOUTH, "getPrimary30-0d7_KjU", "Primary30", ExifInterface.GPS_DIRECTION_TRUE, "getPrimary40-0d7_KjU", "Primary40", "U", "getPrimary50-0d7_KjU", "Primary50", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getPrimary60-0d7_KjU", "Primary60", ExifInterface.LONGITUDE_WEST, "getPrimary70-0d7_KjU", "Primary70", "X", "getPrimary80-0d7_KjU", "Primary80", "Y", "getPrimary90-0d7_KjU", "Primary90", "Z", "getPrimary95-0d7_KjU", "Primary95", "a0", "getPrimary99-0d7_KjU", "Primary99", "b0", "getSecondary0-0d7_KjU", "Secondary0", "c0", "getSecondary10-0d7_KjU", "Secondary10", "d0", "getSecondary100-0d7_KjU", "Secondary100", "e0", "getSecondary20-0d7_KjU", "Secondary20", "f0", "getSecondary30-0d7_KjU", "Secondary30", "g0", "getSecondary40-0d7_KjU", "Secondary40", "h0", "getSecondary50-0d7_KjU", "Secondary50", "i0", "getSecondary60-0d7_KjU", "Secondary60", "j0", "getSecondary70-0d7_KjU", "Secondary70", "k0", "getSecondary80-0d7_KjU", "Secondary80", "l0", "getSecondary90-0d7_KjU", "Secondary90", "m0", "getSecondary95-0d7_KjU", "Secondary95", "n0", "getSecondary99-0d7_KjU", "Secondary99", "o0", "getTertiary0-0d7_KjU", "Tertiary0", "p0", "getTertiary10-0d7_KjU", "Tertiary10", "q0", "getTertiary100-0d7_KjU", "Tertiary100", "r0", "getTertiary20-0d7_KjU", "Tertiary20", "s0", "getTertiary30-0d7_KjU", "Tertiary30", "t0", "getTertiary40-0d7_KjU", "Tertiary40", "u0", "getTertiary50-0d7_KjU", "Tertiary50", "v0", "getTertiary60-0d7_KjU", "Tertiary60", "w0", "getTertiary70-0d7_KjU", "Tertiary70", "x0", "getTertiary80-0d7_KjU", "Tertiary80", "y0", "getTertiary90-0d7_KjU", "Tertiary90", "z0", "getTertiary95-0d7_KjU", "Tertiary95", "A0", "getTertiary99-0d7_KjU", "Tertiary99", "B0", "getWhite-0d7_KjU", "White", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class PaletteTokens {

    @NotNull
    public static final PaletteTokens INSTANCE = new PaletteTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final long Black = ColorKt.Color$default(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final long Error0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final long Error10 = ColorKt.Color$default(65, 14, 11, 0, 8, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final long Error100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final long Error20 = ColorKt.Color$default(96, 20, 16, 0, 8, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final long Error30 = ColorKt.Color$default(140, 29, 24, 0, 8, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final long Error40 = ColorKt.Color$default(179, 38, 30, 0, 8, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final long Error50 = ColorKt.Color$default(220, 54, 46, 0, 8, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final long Error60 = ColorKt.Color$default(228, 105, 98, 0, 8, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final long Error70 = ColorKt.Color$default(236, 146, 142, 0, 8, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final long Error80 = ColorKt.Color$default(242, 184, 181, 0, 8, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final long Error90 = ColorKt.Color$default(249, 222, 220, 0, 8, null);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static final long Error95 = ColorKt.Color$default(252, 238, 238, 0, 8, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final long Error99 = ColorKt.Color$default(255, 251, 249, 0, 8, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final long Neutral0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final long Neutral10 = ColorKt.Color$default(28, 27, 31, 0, 8, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final long Neutral100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final long Neutral20 = ColorKt.Color$default(49, 48, 51, 0, 8, null);

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final long Neutral30 = ColorKt.Color$default(72, 70, 73, 0, 8, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final long Neutral40 = ColorKt.Color$default(96, 93, 98, 0, 8, null);

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final long Neutral50 = ColorKt.Color$default(120, 117, 121, 0, 8, null);

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final long Neutral60 = ColorKt.Color$default(147, 144, 148, 0, 8, null);

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final long Neutral70 = ColorKt.Color$default(174, 170, 174, 0, 8, null);

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final long Neutral80 = ColorKt.Color$default(201, Opcodes.MULTIANEWARRAY, 202, 0, 8, null);

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final long Neutral90 = ColorKt.Color$default(ImageAnalysisKt.OVER_EXPOSED_THRESHOLD, 225, 229, 0, 8, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final long Neutral95 = ColorKt.Color$default(244, 239, 244, 0, 8, null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final long Neutral99 = ColorKt.Color$default(255, 251, 254, 0, 8, null);

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public static final long NeutralVariant0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public static final long NeutralVariant10 = ColorKt.Color$default(29, 26, 34, 0, 8, null);

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public static final long NeutralVariant100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public static final long NeutralVariant20 = ColorKt.Color$default(50, 47, 55, 0, 8, null);

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public static final long NeutralVariant30 = ColorKt.Color$default(73, 69, 79, 0, 8, null);

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public static final long NeutralVariant40 = ColorKt.Color$default(96, 93, 102, 0, 8, null);

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public static final long NeutralVariant50 = ColorKt.Color$default(121, 116, 126, 0, 8, null);

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public static final long NeutralVariant60 = ColorKt.Color$default(147, 143, 153, 0, 8, null);

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public static final long NeutralVariant70 = ColorKt.Color$default(174, 169, 180, 0, 8, null);

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public static final long NeutralVariant80 = ColorKt.Color$default(202, 196, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 0, 8, null);

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public static final long NeutralVariant90 = ColorKt.Color$default(231, 224, 236, 0, 8, null);

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public static final long NeutralVariant95 = ColorKt.Color$default(245, 238, 250, 0, 8, null);

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public static final long NeutralVariant99 = ColorKt.Color$default(255, 251, 254, 0, 8, null);

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public static final long Primary0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public static final long Primary10 = ColorKt.Color$default(33, 0, 93, 0, 8, null);

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public static final long Primary100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public static final long Primary20 = ColorKt.Color$default(56, 30, 114, 0, 8, null);

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public static final long Primary30 = ColorKt.Color$default(79, 55, 139, 0, 8, null);

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public static final long Primary40 = ColorKt.Color$default(103, 80, 164, 0, 8, null);

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public static final long Primary50 = ColorKt.Color$default(127, 103, 190, 0, 8, null);

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public static final long Primary60 = ColorKt.Color$default(154, 130, 219, 0, 8, null);

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public static final long Primary70 = ColorKt.Color$default(182, 157, 248, 0, 8, null);

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public static final long Primary80 = ColorKt.Color$default(ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 188, 255, 0, 8, null);

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public static final long Primary90 = ColorKt.Color$default(234, 221, 255, 0, 8, null);

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public static final long Primary95 = ColorKt.Color$default(246, 237, 255, 0, 8, null);

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    public static final long Primary99 = ColorKt.Color$default(255, 251, 254, 0, 8, null);

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    public static final long Secondary0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    public static final long Secondary10 = ColorKt.Color$default(29, 25, 43, 0, 8, null);

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    public static final long Secondary100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    public static final long Secondary20 = ColorKt.Color$default(51, 45, 65, 0, 8, null);

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    public static final long Secondary30 = ColorKt.Color$default(74, 68, 88, 0, 8, null);

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    public static final long Secondary40 = ColorKt.Color$default(98, 91, 113, 0, 8, null);

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    public static final long Secondary50 = ColorKt.Color$default(122, 114, 137, 0, 8, null);

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public static final long Secondary60 = ColorKt.Color$default(149, 141, 165, 0, 8, null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public static final long Secondary70 = ColorKt.Color$default(176, 167, 192, 0, 8, null);

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public static final long Secondary80 = ColorKt.Color$default(204, Opcodes.MONITORENTER, 220, 0, 8, null);

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    public static final long Secondary90 = ColorKt.Color$default(232, 222, 248, 0, 8, null);

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    public static final long Secondary95 = ColorKt.Color$default(246, 237, 255, 0, 8, null);

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public static final long Secondary99 = ColorKt.Color$default(255, 251, 254, 0, 8, null);

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    public static final long Tertiary0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public static final long Tertiary10 = ColorKt.Color$default(49, 17, 29, 0, 8, null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public static final long Tertiary100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public static final long Tertiary20 = ColorKt.Color$default(73, 37, 50, 0, 8, null);

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public static final long Tertiary30 = ColorKt.Color$default(99, 59, 72, 0, 8, null);

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public static final long Tertiary40 = ColorKt.Color$default(125, 82, 96, 0, 8, null);

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public static final long Tertiary50 = ColorKt.Color$default(152, 105, 119, 0, 8, null);

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public static final long Tertiary60 = ColorKt.Color$default(181, 131, 146, 0, 8, null);

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    public static final long Tertiary70 = ColorKt.Color$default(ErrorCodes.ERR_CRY_IO_PROPERTIES, 157, 172, 0, 8, null);

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    public static final long Tertiary80 = ColorKt.Color$default(239, 184, 200, 0, 8, null);

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    public static final long Tertiary90 = ColorKt.Color$default(255, 216, 228, 0, 8, null);

    /* JADX INFO: renamed from: z0, reason: collision with root package name and from kotlin metadata */
    public static final long Tertiary95 = ColorKt.Color$default(255, 236, 241, 0, 8, null);

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public static final long Tertiary99 = ColorKt.Color$default(255, 251, 250, 0, 8, null);

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    public static final long White = ColorKt.Color$default(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: getBlack-0d7_KjU, reason: not valid java name */
    public final long m1833getBlack0d7_KjU() {
        return Black;
    }

    /* JADX INFO: renamed from: getError0-0d7_KjU, reason: not valid java name */
    public final long m1834getError00d7_KjU() {
        return Error0;
    }

    /* JADX INFO: renamed from: getError10-0d7_KjU, reason: not valid java name */
    public final long m1835getError100d7_KjU() {
        return Error10;
    }

    /* JADX INFO: renamed from: getError100-0d7_KjU, reason: not valid java name */
    public final long m1836getError1000d7_KjU() {
        return Error100;
    }

    /* JADX INFO: renamed from: getError20-0d7_KjU, reason: not valid java name */
    public final long m1837getError200d7_KjU() {
        return Error20;
    }

    /* JADX INFO: renamed from: getError30-0d7_KjU, reason: not valid java name */
    public final long m1838getError300d7_KjU() {
        return Error30;
    }

    /* JADX INFO: renamed from: getError40-0d7_KjU, reason: not valid java name */
    public final long m1839getError400d7_KjU() {
        return Error40;
    }

    /* JADX INFO: renamed from: getError50-0d7_KjU, reason: not valid java name */
    public final long m1840getError500d7_KjU() {
        return Error50;
    }

    /* JADX INFO: renamed from: getError60-0d7_KjU, reason: not valid java name */
    public final long m1841getError600d7_KjU() {
        return Error60;
    }

    /* JADX INFO: renamed from: getError70-0d7_KjU, reason: not valid java name */
    public final long m1842getError700d7_KjU() {
        return Error70;
    }

    /* JADX INFO: renamed from: getError80-0d7_KjU, reason: not valid java name */
    public final long m1843getError800d7_KjU() {
        return Error80;
    }

    /* JADX INFO: renamed from: getError90-0d7_KjU, reason: not valid java name */
    public final long m1844getError900d7_KjU() {
        return Error90;
    }

    /* JADX INFO: renamed from: getError95-0d7_KjU, reason: not valid java name */
    public final long m1845getError950d7_KjU() {
        return Error95;
    }

    /* JADX INFO: renamed from: getError99-0d7_KjU, reason: not valid java name */
    public final long m1846getError990d7_KjU() {
        return Error99;
    }

    /* JADX INFO: renamed from: getNeutral0-0d7_KjU, reason: not valid java name */
    public final long m1847getNeutral00d7_KjU() {
        return Neutral0;
    }

    /* JADX INFO: renamed from: getNeutral10-0d7_KjU, reason: not valid java name */
    public final long m1848getNeutral100d7_KjU() {
        return Neutral10;
    }

    /* JADX INFO: renamed from: getNeutral100-0d7_KjU, reason: not valid java name */
    public final long m1849getNeutral1000d7_KjU() {
        return Neutral100;
    }

    /* JADX INFO: renamed from: getNeutral20-0d7_KjU, reason: not valid java name */
    public final long m1850getNeutral200d7_KjU() {
        return Neutral20;
    }

    /* JADX INFO: renamed from: getNeutral30-0d7_KjU, reason: not valid java name */
    public final long m1851getNeutral300d7_KjU() {
        return Neutral30;
    }

    /* JADX INFO: renamed from: getNeutral40-0d7_KjU, reason: not valid java name */
    public final long m1852getNeutral400d7_KjU() {
        return Neutral40;
    }

    /* JADX INFO: renamed from: getNeutral50-0d7_KjU, reason: not valid java name */
    public final long m1853getNeutral500d7_KjU() {
        return Neutral50;
    }

    /* JADX INFO: renamed from: getNeutral60-0d7_KjU, reason: not valid java name */
    public final long m1854getNeutral600d7_KjU() {
        return Neutral60;
    }

    /* JADX INFO: renamed from: getNeutral70-0d7_KjU, reason: not valid java name */
    public final long m1855getNeutral700d7_KjU() {
        return Neutral70;
    }

    /* JADX INFO: renamed from: getNeutral80-0d7_KjU, reason: not valid java name */
    public final long m1856getNeutral800d7_KjU() {
        return Neutral80;
    }

    /* JADX INFO: renamed from: getNeutral90-0d7_KjU, reason: not valid java name */
    public final long m1857getNeutral900d7_KjU() {
        return Neutral90;
    }

    /* JADX INFO: renamed from: getNeutral95-0d7_KjU, reason: not valid java name */
    public final long m1858getNeutral950d7_KjU() {
        return Neutral95;
    }

    /* JADX INFO: renamed from: getNeutral99-0d7_KjU, reason: not valid java name */
    public final long m1859getNeutral990d7_KjU() {
        return Neutral99;
    }

    /* JADX INFO: renamed from: getNeutralVariant0-0d7_KjU, reason: not valid java name */
    public final long m1860getNeutralVariant00d7_KjU() {
        return NeutralVariant0;
    }

    /* JADX INFO: renamed from: getNeutralVariant10-0d7_KjU, reason: not valid java name */
    public final long m1861getNeutralVariant100d7_KjU() {
        return NeutralVariant10;
    }

    /* JADX INFO: renamed from: getNeutralVariant100-0d7_KjU, reason: not valid java name */
    public final long m1862getNeutralVariant1000d7_KjU() {
        return NeutralVariant100;
    }

    /* JADX INFO: renamed from: getNeutralVariant20-0d7_KjU, reason: not valid java name */
    public final long m1863getNeutralVariant200d7_KjU() {
        return NeutralVariant20;
    }

    /* JADX INFO: renamed from: getNeutralVariant30-0d7_KjU, reason: not valid java name */
    public final long m1864getNeutralVariant300d7_KjU() {
        return NeutralVariant30;
    }

    /* JADX INFO: renamed from: getNeutralVariant40-0d7_KjU, reason: not valid java name */
    public final long m1865getNeutralVariant400d7_KjU() {
        return NeutralVariant40;
    }

    /* JADX INFO: renamed from: getNeutralVariant50-0d7_KjU, reason: not valid java name */
    public final long m1866getNeutralVariant500d7_KjU() {
        return NeutralVariant50;
    }

    /* JADX INFO: renamed from: getNeutralVariant60-0d7_KjU, reason: not valid java name */
    public final long m1867getNeutralVariant600d7_KjU() {
        return NeutralVariant60;
    }

    /* JADX INFO: renamed from: getNeutralVariant70-0d7_KjU, reason: not valid java name */
    public final long m1868getNeutralVariant700d7_KjU() {
        return NeutralVariant70;
    }

    /* JADX INFO: renamed from: getNeutralVariant80-0d7_KjU, reason: not valid java name */
    public final long m1869getNeutralVariant800d7_KjU() {
        return NeutralVariant80;
    }

    /* JADX INFO: renamed from: getNeutralVariant90-0d7_KjU, reason: not valid java name */
    public final long m1870getNeutralVariant900d7_KjU() {
        return NeutralVariant90;
    }

    /* JADX INFO: renamed from: getNeutralVariant95-0d7_KjU, reason: not valid java name */
    public final long m1871getNeutralVariant950d7_KjU() {
        return NeutralVariant95;
    }

    /* JADX INFO: renamed from: getNeutralVariant99-0d7_KjU, reason: not valid java name */
    public final long m1872getNeutralVariant990d7_KjU() {
        return NeutralVariant99;
    }

    /* JADX INFO: renamed from: getPrimary0-0d7_KjU, reason: not valid java name */
    public final long m1873getPrimary00d7_KjU() {
        return Primary0;
    }

    /* JADX INFO: renamed from: getPrimary10-0d7_KjU, reason: not valid java name */
    public final long m1874getPrimary100d7_KjU() {
        return Primary10;
    }

    /* JADX INFO: renamed from: getPrimary100-0d7_KjU, reason: not valid java name */
    public final long m1875getPrimary1000d7_KjU() {
        return Primary100;
    }

    /* JADX INFO: renamed from: getPrimary20-0d7_KjU, reason: not valid java name */
    public final long m1876getPrimary200d7_KjU() {
        return Primary20;
    }

    /* JADX INFO: renamed from: getPrimary30-0d7_KjU, reason: not valid java name */
    public final long m1877getPrimary300d7_KjU() {
        return Primary30;
    }

    /* JADX INFO: renamed from: getPrimary40-0d7_KjU, reason: not valid java name */
    public final long m1878getPrimary400d7_KjU() {
        return Primary40;
    }

    /* JADX INFO: renamed from: getPrimary50-0d7_KjU, reason: not valid java name */
    public final long m1879getPrimary500d7_KjU() {
        return Primary50;
    }

    /* JADX INFO: renamed from: getPrimary60-0d7_KjU, reason: not valid java name */
    public final long m1880getPrimary600d7_KjU() {
        return Primary60;
    }

    /* JADX INFO: renamed from: getPrimary70-0d7_KjU, reason: not valid java name */
    public final long m1881getPrimary700d7_KjU() {
        return Primary70;
    }

    /* JADX INFO: renamed from: getPrimary80-0d7_KjU, reason: not valid java name */
    public final long m1882getPrimary800d7_KjU() {
        return Primary80;
    }

    /* JADX INFO: renamed from: getPrimary90-0d7_KjU, reason: not valid java name */
    public final long m1883getPrimary900d7_KjU() {
        return Primary90;
    }

    /* JADX INFO: renamed from: getPrimary95-0d7_KjU, reason: not valid java name */
    public final long m1884getPrimary950d7_KjU() {
        return Primary95;
    }

    /* JADX INFO: renamed from: getPrimary99-0d7_KjU, reason: not valid java name */
    public final long m1885getPrimary990d7_KjU() {
        return Primary99;
    }

    /* JADX INFO: renamed from: getSecondary0-0d7_KjU, reason: not valid java name */
    public final long m1886getSecondary00d7_KjU() {
        return Secondary0;
    }

    /* JADX INFO: renamed from: getSecondary10-0d7_KjU, reason: not valid java name */
    public final long m1887getSecondary100d7_KjU() {
        return Secondary10;
    }

    /* JADX INFO: renamed from: getSecondary100-0d7_KjU, reason: not valid java name */
    public final long m1888getSecondary1000d7_KjU() {
        return Secondary100;
    }

    /* JADX INFO: renamed from: getSecondary20-0d7_KjU, reason: not valid java name */
    public final long m1889getSecondary200d7_KjU() {
        return Secondary20;
    }

    /* JADX INFO: renamed from: getSecondary30-0d7_KjU, reason: not valid java name */
    public final long m1890getSecondary300d7_KjU() {
        return Secondary30;
    }

    /* JADX INFO: renamed from: getSecondary40-0d7_KjU, reason: not valid java name */
    public final long m1891getSecondary400d7_KjU() {
        return Secondary40;
    }

    /* JADX INFO: renamed from: getSecondary50-0d7_KjU, reason: not valid java name */
    public final long m1892getSecondary500d7_KjU() {
        return Secondary50;
    }

    /* JADX INFO: renamed from: getSecondary60-0d7_KjU, reason: not valid java name */
    public final long m1893getSecondary600d7_KjU() {
        return Secondary60;
    }

    /* JADX INFO: renamed from: getSecondary70-0d7_KjU, reason: not valid java name */
    public final long m1894getSecondary700d7_KjU() {
        return Secondary70;
    }

    /* JADX INFO: renamed from: getSecondary80-0d7_KjU, reason: not valid java name */
    public final long m1895getSecondary800d7_KjU() {
        return Secondary80;
    }

    /* JADX INFO: renamed from: getSecondary90-0d7_KjU, reason: not valid java name */
    public final long m1896getSecondary900d7_KjU() {
        return Secondary90;
    }

    /* JADX INFO: renamed from: getSecondary95-0d7_KjU, reason: not valid java name */
    public final long m1897getSecondary950d7_KjU() {
        return Secondary95;
    }

    /* JADX INFO: renamed from: getSecondary99-0d7_KjU, reason: not valid java name */
    public final long m1898getSecondary990d7_KjU() {
        return Secondary99;
    }

    /* JADX INFO: renamed from: getTertiary0-0d7_KjU, reason: not valid java name */
    public final long m1899getTertiary00d7_KjU() {
        return Tertiary0;
    }

    /* JADX INFO: renamed from: getTertiary10-0d7_KjU, reason: not valid java name */
    public final long m1900getTertiary100d7_KjU() {
        return Tertiary10;
    }

    /* JADX INFO: renamed from: getTertiary100-0d7_KjU, reason: not valid java name */
    public final long m1901getTertiary1000d7_KjU() {
        return Tertiary100;
    }

    /* JADX INFO: renamed from: getTertiary20-0d7_KjU, reason: not valid java name */
    public final long m1902getTertiary200d7_KjU() {
        return Tertiary20;
    }

    /* JADX INFO: renamed from: getTertiary30-0d7_KjU, reason: not valid java name */
    public final long m1903getTertiary300d7_KjU() {
        return Tertiary30;
    }

    /* JADX INFO: renamed from: getTertiary40-0d7_KjU, reason: not valid java name */
    public final long m1904getTertiary400d7_KjU() {
        return Tertiary40;
    }

    /* JADX INFO: renamed from: getTertiary50-0d7_KjU, reason: not valid java name */
    public final long m1905getTertiary500d7_KjU() {
        return Tertiary50;
    }

    /* JADX INFO: renamed from: getTertiary60-0d7_KjU, reason: not valid java name */
    public final long m1906getTertiary600d7_KjU() {
        return Tertiary60;
    }

    /* JADX INFO: renamed from: getTertiary70-0d7_KjU, reason: not valid java name */
    public final long m1907getTertiary700d7_KjU() {
        return Tertiary70;
    }

    /* JADX INFO: renamed from: getTertiary80-0d7_KjU, reason: not valid java name */
    public final long m1908getTertiary800d7_KjU() {
        return Tertiary80;
    }

    /* JADX INFO: renamed from: getTertiary90-0d7_KjU, reason: not valid java name */
    public final long m1909getTertiary900d7_KjU() {
        return Tertiary90;
    }

    /* JADX INFO: renamed from: getTertiary95-0d7_KjU, reason: not valid java name */
    public final long m1910getTertiary950d7_KjU() {
        return Tertiary95;
    }

    /* JADX INFO: renamed from: getTertiary99-0d7_KjU, reason: not valid java name */
    public final long m1911getTertiary990d7_KjU() {
        return Tertiary99;
    }

    /* JADX INFO: renamed from: getWhite-0d7_KjU, reason: not valid java name */
    public final long m1912getWhite0d7_KjU() {
        return White;
    }
}
