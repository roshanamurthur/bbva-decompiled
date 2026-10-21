package androidx.compose.material3.tokens;

import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TypeScaleTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0003\bÙ\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\bë\u0001\u0010ì\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR \u0010\u0013\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R \u0010\u001f\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR \u0010\"\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b!\u0010\fR \u0010%\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\fR\u0017\u0010(\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u0018R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R \u0010.\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010\n\u001a\u0004\b-\u0010\fR \u00101\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b0\u0010\fR \u00104\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b2\u0010\n\u001a\u0004\b3\u0010\fR\u0017\u00107\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b5\u0010\u0016\u001a\u0004\b6\u0010\u0018R\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R \u0010=\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010\n\u001a\u0004\b<\u0010\fR \u0010@\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b>\u0010\n\u001a\u0004\b?\u0010\fR \u0010C\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\bB\u0010\fR\u0017\u0010F\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bD\u0010\u0016\u001a\u0004\bE\u0010\u0018R\u0017\u0010I\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R \u0010L\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bJ\u0010\n\u001a\u0004\bK\u0010\fR \u0010O\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bN\u0010\fR \u0010R\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bP\u0010\n\u001a\u0004\bQ\u0010\fR\u0017\u0010U\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bS\u0010\u0016\u001a\u0004\bT\u0010\u0018R\u0017\u0010X\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010\u0004\u001a\u0004\bW\u0010\u0006R \u0010[\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bY\u0010\n\u001a\u0004\bZ\u0010\fR \u0010^\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\\\u0010\n\u001a\u0004\b]\u0010\fR \u0010a\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b_\u0010\n\u001a\u0004\b`\u0010\fR\u0017\u0010d\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bb\u0010\u0016\u001a\u0004\bc\u0010\u0018R\u0017\u0010g\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\be\u0010\u0004\u001a\u0004\bf\u0010\u0006R \u0010j\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bh\u0010\n\u001a\u0004\bi\u0010\fR \u0010m\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bk\u0010\n\u001a\u0004\bl\u0010\fR \u0010p\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bn\u0010\n\u001a\u0004\bo\u0010\fR\u0017\u0010s\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bq\u0010\u0016\u001a\u0004\br\u0010\u0018R\u0017\u0010u\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\bt\u0010\u0006R \u0010x\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bv\u0010\n\u001a\u0004\bw\u0010\fR \u0010{\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\by\u0010\n\u001a\u0004\bz\u0010\fR \u0010~\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b|\u0010\n\u001a\u0004\b}\u0010\fR\u0019\u0010\u0081\u0001\u001a\u00020\u00148\u0006¢\u0006\r\n\u0004\b\u007f\u0010\u0016\u001a\u0005\b\u0080\u0001\u0010\u0018R\u001a\u0010\u0084\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u0004\u001a\u0005\b\u0083\u0001\u0010\u0006R#\u0010\u0087\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\n\u001a\u0005\b\u0086\u0001\u0010\fR#\u0010\u008a\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\n\u001a\u0005\b\u0089\u0001\u0010\fR#\u0010\u008d\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\n\u001a\u0005\b\u008c\u0001\u0010\fR\u001a\u0010\u0090\u0001\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0016\u001a\u0005\b\u008f\u0001\u0010\u0018R\u001a\u0010\u0093\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0004\u001a\u0005\b\u0092\u0001\u0010\u0006R#\u0010\u0096\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\n\u001a\u0005\b\u0095\u0001\u0010\fR#\u0010\u0099\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\n\u001a\u0005\b\u0098\u0001\u0010\fR#\u0010\u009c\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010\n\u001a\u0005\b\u009b\u0001\u0010\fR\u001a\u0010\u009f\u0001\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0016\u001a\u0005\b\u009e\u0001\u0010\u0018R\u001a\u0010¢\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b \u0001\u0010\u0004\u001a\u0005\b¡\u0001\u0010\u0006R#\u0010¥\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b£\u0001\u0010\n\u001a\u0005\b¤\u0001\u0010\fR#\u0010¨\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¦\u0001\u0010\n\u001a\u0005\b§\u0001\u0010\fR#\u0010«\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b©\u0001\u0010\n\u001a\u0005\bª\u0001\u0010\fR\u001a\u0010®\u0001\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\b¬\u0001\u0010\u0016\u001a\u0005\b\u00ad\u0001\u0010\u0018R\u001a\u0010±\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¯\u0001\u0010\u0004\u001a\u0005\b°\u0001\u0010\u0006R#\u0010´\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b²\u0001\u0010\n\u001a\u0005\b³\u0001\u0010\fR#\u0010·\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bµ\u0001\u0010\n\u001a\u0005\b¶\u0001\u0010\fR#\u0010º\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¸\u0001\u0010\n\u001a\u0005\b¹\u0001\u0010\fR\u001a\u0010½\u0001\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\b»\u0001\u0010\u0016\u001a\u0005\b¼\u0001\u0010\u0018R\u001a\u0010À\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¾\u0001\u0010\u0004\u001a\u0005\b¿\u0001\u0010\u0006R#\u0010Ã\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÁ\u0001\u0010\n\u001a\u0005\bÂ\u0001\u0010\fR#\u0010Æ\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÄ\u0001\u0010\n\u001a\u0005\bÅ\u0001\u0010\fR#\u0010É\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÇ\u0001\u0010\n\u001a\u0005\bÈ\u0001\u0010\fR\u001a\u0010Ì\u0001\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\bÊ\u0001\u0010\u0016\u001a\u0005\bË\u0001\u0010\u0018R\u001a\u0010Ï\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÍ\u0001\u0010\u0004\u001a\u0005\bÎ\u0001\u0010\u0006R#\u0010Ò\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÐ\u0001\u0010\n\u001a\u0005\bÑ\u0001\u0010\fR#\u0010Õ\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÓ\u0001\u0010\n\u001a\u0005\bÔ\u0001\u0010\fR#\u0010Ø\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÖ\u0001\u0010\n\u001a\u0005\b×\u0001\u0010\fR\u001a\u0010Û\u0001\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\bÙ\u0001\u0010\u0016\u001a\u0005\bÚ\u0001\u0010\u0018R\u001a\u0010Þ\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÜ\u0001\u0010\u0004\u001a\u0005\bÝ\u0001\u0010\u0006R#\u0010á\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bß\u0001\u0010\n\u001a\u0005\bà\u0001\u0010\fR#\u0010ä\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bâ\u0001\u0010\n\u001a\u0005\bã\u0001\u0010\fR#\u0010ç\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bå\u0001\u0010\n\u001a\u0005\bæ\u0001\u0010\fR\u001a\u0010ê\u0001\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\bè\u0001\u0010\u0016\u001a\u0005\bé\u0001\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006í\u0001"}, d2 = {"Landroidx/compose/material3/tokens/TypeScaleTokens;", "", "Landroidx/compose/ui/text/font/GenericFontFamily;", "a", "Landroidx/compose/ui/text/font/GenericFontFamily;", "getBodyLargeFont", "()Landroidx/compose/ui/text/font/GenericFontFamily;", "BodyLargeFont", "Landroidx/compose/ui/unit/TextUnit;", "b", "J", "getBodyLargeLineHeight-XSAIIZE", "()J", "BodyLargeLineHeight", "c", "getBodyLargeSize-XSAIIZE", "BodyLargeSize", "d", "getBodyLargeTracking-XSAIIZE", "BodyLargeTracking", "Landroidx/compose/ui/text/font/FontWeight;", "e", "Landroidx/compose/ui/text/font/FontWeight;", "getBodyLargeWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "BodyLargeWeight", "f", "getBodyMediumFont", "BodyMediumFont", "g", "getBodyMediumLineHeight-XSAIIZE", "BodyMediumLineHeight", "h", "getBodyMediumSize-XSAIIZE", "BodyMediumSize", "i", "getBodyMediumTracking-XSAIIZE", "BodyMediumTracking", "j", "getBodyMediumWeight", "BodyMediumWeight", "k", "getBodySmallFont", "BodySmallFont", "l", "getBodySmallLineHeight-XSAIIZE", "BodySmallLineHeight", "m", "getBodySmallSize-XSAIIZE", "BodySmallSize", "n", "getBodySmallTracking-XSAIIZE", "BodySmallTracking", "o", "getBodySmallWeight", "BodySmallWeight", "p", "getDisplayLargeFont", "DisplayLargeFont", "q", "getDisplayLargeLineHeight-XSAIIZE", "DisplayLargeLineHeight", "r", "getDisplayLargeSize-XSAIIZE", "DisplayLargeSize", "s", "getDisplayLargeTracking-XSAIIZE", "DisplayLargeTracking", "t", "getDisplayLargeWeight", "DisplayLargeWeight", "u", "getDisplayMediumFont", "DisplayMediumFont", SharedPrefsStorage.VERSION_KEY, "getDisplayMediumLineHeight-XSAIIZE", "DisplayMediumLineHeight", "w", "getDisplayMediumSize-XSAIIZE", "DisplayMediumSize", "x", "getDisplayMediumTracking-XSAIIZE", "DisplayMediumTracking", "y", "getDisplayMediumWeight", "DisplayMediumWeight", "z", "getDisplaySmallFont", "DisplaySmallFont", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getDisplaySmallLineHeight-XSAIIZE", "DisplaySmallLineHeight", "B", "getDisplaySmallSize-XSAIIZE", "DisplaySmallSize", "C", "getDisplaySmallTracking-XSAIIZE", "DisplaySmallTracking", "D", "getDisplaySmallWeight", "DisplaySmallWeight", ExifInterface.LONGITUDE_EAST, "getHeadlineLargeFont", "HeadlineLargeFont", "F", "getHeadlineLargeLineHeight-XSAIIZE", "HeadlineLargeLineHeight", "G", "getHeadlineLargeSize-XSAIIZE", "HeadlineLargeSize", "H", "getHeadlineLargeTracking-XSAIIZE", "HeadlineLargeTracking", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getHeadlineLargeWeight", "HeadlineLargeWeight", "getHeadlineMediumFont", "HeadlineMediumFont", "K", "getHeadlineMediumLineHeight-XSAIIZE", "HeadlineMediumLineHeight", "L", "getHeadlineMediumSize-XSAIIZE", "HeadlineMediumSize", "M", "getHeadlineMediumTracking-XSAIIZE", "HeadlineMediumTracking", "N", "getHeadlineMediumWeight", "HeadlineMediumWeight", "O", "getHeadlineSmallFont", "HeadlineSmallFont", "P", "getHeadlineSmallLineHeight-XSAIIZE", "HeadlineSmallLineHeight", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "getHeadlineSmallSize-XSAIIZE", "HeadlineSmallSize", "R", "getHeadlineSmallTracking-XSAIIZE", "HeadlineSmallTracking", ExifInterface.LATITUDE_SOUTH, "getHeadlineSmallWeight", "HeadlineSmallWeight", ExifInterface.GPS_DIRECTION_TRUE, "getLabelLargeFont", "LabelLargeFont", "U", "getLabelLargeLineHeight-XSAIIZE", "LabelLargeLineHeight", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getLabelLargeSize-XSAIIZE", "LabelLargeSize", ExifInterface.LONGITUDE_WEST, "getLabelLargeTracking-XSAIIZE", "LabelLargeTracking", "X", "getLabelLargeWeight", "LabelLargeWeight", "Y", "getLabelMediumFont", "LabelMediumFont", "Z", "getLabelMediumLineHeight-XSAIIZE", "LabelMediumLineHeight", "a0", "getLabelMediumSize-XSAIIZE", "LabelMediumSize", "b0", "getLabelMediumTracking-XSAIIZE", "LabelMediumTracking", "c0", "getLabelMediumWeight", "LabelMediumWeight", "d0", "getLabelSmallFont", "LabelSmallFont", "e0", "getLabelSmallLineHeight-XSAIIZE", "LabelSmallLineHeight", "f0", "getLabelSmallSize-XSAIIZE", "LabelSmallSize", "g0", "getLabelSmallTracking-XSAIIZE", "LabelSmallTracking", "h0", "getLabelSmallWeight", "LabelSmallWeight", "i0", "getTitleLargeFont", "TitleLargeFont", "j0", "getTitleLargeLineHeight-XSAIIZE", "TitleLargeLineHeight", "k0", "getTitleLargeSize-XSAIIZE", "TitleLargeSize", "l0", "getTitleLargeTracking-XSAIIZE", "TitleLargeTracking", "m0", "getTitleLargeWeight", "TitleLargeWeight", "n0", "getTitleMediumFont", "TitleMediumFont", "o0", "getTitleMediumLineHeight-XSAIIZE", "TitleMediumLineHeight", "p0", "getTitleMediumSize-XSAIIZE", "TitleMediumSize", "q0", "getTitleMediumTracking-XSAIIZE", "TitleMediumTracking", "r0", "getTitleMediumWeight", "TitleMediumWeight", "s0", "getTitleSmallFont", "TitleSmallFont", "t0", "getTitleSmallLineHeight-XSAIIZE", "TitleSmallLineHeight", "u0", "getTitleSmallSize-XSAIIZE", "TitleSmallSize", "v0", "getTitleSmallTracking-XSAIIZE", "TitleSmallTracking", "w0", "getTitleSmallWeight", "TitleSmallWeight", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTypeScaleTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeScaleTokens.kt\nandroidx/compose/material3/tokens/TypeScaleTokens\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,100:1\n94#2,2:101\n*S KotlinDebug\n*F\n+ 1 TypeScaleTokens.kt\nandroidx/compose/material3/tokens/TypeScaleTokens\n*L\n42#1:101,2\n*E\n"})
public final class TypeScaleTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final long DisplaySmallLineHeight;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public static final long DisplaySmallSize;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public static final long DisplaySmallTracking;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public static final FontWeight DisplaySmallWeight;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public static final GenericFontFamily HeadlineLargeFont;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public static final long HeadlineLargeLineHeight;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public static final long HeadlineLargeSize;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public static final long HeadlineLargeTracking;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public static final FontWeight HeadlineLargeWeight;

    @NotNull
    public static final TypeScaleTokens INSTANCE = new TypeScaleTokens();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public static final GenericFontFamily HeadlineMediumFont;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public static final long HeadlineMediumLineHeight;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public static final long HeadlineMediumSize;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public static final long HeadlineMediumTracking;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    public static final FontWeight HeadlineMediumWeight;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    public static final GenericFontFamily HeadlineSmallFont;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public static final long HeadlineSmallLineHeight;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public static final long HeadlineSmallSize;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public static final long HeadlineSmallTracking;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public static final FontWeight HeadlineSmallWeight;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public static final GenericFontFamily LabelLargeFont;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public static final long LabelLargeLineHeight;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public static final long LabelLargeSize;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public static final long LabelLargeTracking;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @NotNull
    public static final FontWeight LabelLargeWeight;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @NotNull
    public static final GenericFontFamily LabelMediumFont;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public static final long LabelMediumLineHeight;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final GenericFontFamily BodyLargeFont;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    public static final long LabelMediumSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final long BodyLargeLineHeight;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    public static final long LabelMediumTracking;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final long BodyLargeSize;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final FontWeight LabelMediumWeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final long BodyLargeTracking;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final GenericFontFamily LabelSmallFont;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final FontWeight BodyLargeWeight;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    public static final long LabelSmallLineHeight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final GenericFontFamily BodyMediumFont;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    public static final long LabelSmallSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final long BodyMediumLineHeight;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    public static final long LabelSmallTracking;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final long BodyMediumSize;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final FontWeight LabelSmallWeight;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final long BodyMediumTracking;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    @NotNull
    public static final GenericFontFamily TitleLargeFont;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final FontWeight BodyMediumWeight;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public static final long TitleLargeLineHeight;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final GenericFontFamily BodySmallFont;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public static final long TitleLargeSize;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final long BodySmallLineHeight;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    public static final long TitleLargeTracking;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static final long BodySmallSize;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final FontWeight TitleLargeWeight;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final long BodySmallTracking;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    @NotNull
    public static final GenericFontFamily TitleMediumFont;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final FontWeight BodySmallWeight;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    public static final long TitleMediumLineHeight;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final GenericFontFamily DisplayLargeFont;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public static final long TitleMediumSize;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final long DisplayLargeLineHeight;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public static final long TitleMediumTracking;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final long DisplayLargeSize;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final FontWeight TitleMediumWeight;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final long DisplayLargeTracking;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final GenericFontFamily TitleSmallFont;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final FontWeight DisplayLargeWeight;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public static final long TitleSmallLineHeight;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final GenericFontFamily DisplayMediumFont;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public static final long TitleSmallSize;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final long DisplayMediumLineHeight;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public static final long TitleSmallTracking;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final long DisplayMediumSize;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final FontWeight TitleSmallWeight;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final long DisplayMediumTracking;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final FontWeight DisplayMediumWeight;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final GenericFontFamily DisplaySmallFont;

    static {
        TypefaceTokens typefaceTokens = TypefaceTokens.INSTANCE;
        BodyLargeFont = typefaceTokens.getPlain();
        BodyLargeLineHeight = TextUnitKt.getSp(24.0d);
        BodyLargeSize = TextUnitKt.getSp(16);
        BodyLargeTracking = TextUnitKt.getSp(0.5d);
        BodyLargeWeight = typefaceTokens.getWeightRegular();
        BodyMediumFont = typefaceTokens.getPlain();
        BodyMediumLineHeight = TextUnitKt.getSp(20.0d);
        BodyMediumSize = TextUnitKt.getSp(14);
        BodyMediumTracking = TextUnitKt.getSp(0.2d);
        BodyMediumWeight = typefaceTokens.getWeightRegular();
        BodySmallFont = typefaceTokens.getPlain();
        BodySmallLineHeight = TextUnitKt.getSp(16.0d);
        BodySmallSize = TextUnitKt.getSp(12);
        BodySmallTracking = TextUnitKt.getSp(0.4d);
        BodySmallWeight = typefaceTokens.getWeightRegular();
        DisplayLargeFont = typefaceTokens.getBrand();
        DisplayLargeLineHeight = TextUnitKt.getSp(64.0d);
        DisplayLargeSize = TextUnitKt.getSp(57);
        long sp = TextUnitKt.getSp(0.2d);
        TextUnitKt.m4583checkArithmeticR2X_6o(sp);
        DisplayLargeTracking = TextUnitKt.pack(TextUnit.m4568getRawTypeimpl(sp), -TextUnit.m4570getValueimpl(sp));
        DisplayLargeWeight = typefaceTokens.getWeightRegular();
        DisplayMediumFont = typefaceTokens.getBrand();
        DisplayMediumLineHeight = TextUnitKt.getSp(52.0d);
        DisplayMediumSize = TextUnitKt.getSp(45);
        DisplayMediumTracking = TextUnitKt.getSp(0.0d);
        DisplayMediumWeight = typefaceTokens.getWeightRegular();
        DisplaySmallFont = typefaceTokens.getBrand();
        DisplaySmallLineHeight = TextUnitKt.getSp(44.0d);
        DisplaySmallSize = TextUnitKt.getSp(36);
        DisplaySmallTracking = TextUnitKt.getSp(0.0d);
        DisplaySmallWeight = typefaceTokens.getWeightRegular();
        HeadlineLargeFont = typefaceTokens.getBrand();
        HeadlineLargeLineHeight = TextUnitKt.getSp(40.0d);
        HeadlineLargeSize = TextUnitKt.getSp(32);
        HeadlineLargeTracking = TextUnitKt.getSp(0.0d);
        HeadlineLargeWeight = typefaceTokens.getWeightRegular();
        HeadlineMediumFont = typefaceTokens.getBrand();
        HeadlineMediumLineHeight = TextUnitKt.getSp(36.0d);
        HeadlineMediumSize = TextUnitKt.getSp(28);
        HeadlineMediumTracking = TextUnitKt.getSp(0.0d);
        HeadlineMediumWeight = typefaceTokens.getWeightRegular();
        HeadlineSmallFont = typefaceTokens.getBrand();
        HeadlineSmallLineHeight = TextUnitKt.getSp(32.0d);
        HeadlineSmallSize = TextUnitKt.getSp(24);
        HeadlineSmallTracking = TextUnitKt.getSp(0.0d);
        HeadlineSmallWeight = typefaceTokens.getWeightRegular();
        LabelLargeFont = typefaceTokens.getPlain();
        LabelLargeLineHeight = TextUnitKt.getSp(20.0d);
        LabelLargeSize = TextUnitKt.getSp(14);
        LabelLargeTracking = TextUnitKt.getSp(0.1d);
        LabelLargeWeight = typefaceTokens.getWeightMedium();
        LabelMediumFont = typefaceTokens.getPlain();
        LabelMediumLineHeight = TextUnitKt.getSp(16.0d);
        LabelMediumSize = TextUnitKt.getSp(12);
        LabelMediumTracking = TextUnitKt.getSp(0.5d);
        LabelMediumWeight = typefaceTokens.getWeightMedium();
        LabelSmallFont = typefaceTokens.getPlain();
        LabelSmallLineHeight = TextUnitKt.getSp(16.0d);
        LabelSmallSize = TextUnitKt.getSp(11);
        LabelSmallTracking = TextUnitKt.getSp(0.5d);
        LabelSmallWeight = typefaceTokens.getWeightMedium();
        TitleLargeFont = typefaceTokens.getBrand();
        TitleLargeLineHeight = TextUnitKt.getSp(28.0d);
        TitleLargeSize = TextUnitKt.getSp(22);
        TitleLargeTracking = TextUnitKt.getSp(0.0d);
        TitleLargeWeight = typefaceTokens.getWeightRegular();
        TitleMediumFont = typefaceTokens.getPlain();
        TitleMediumLineHeight = TextUnitKt.getSp(24.0d);
        TitleMediumSize = TextUnitKt.getSp(16);
        TitleMediumTracking = TextUnitKt.getSp(0.2d);
        TitleMediumWeight = typefaceTokens.getWeightMedium();
        TitleSmallFont = typefaceTokens.getPlain();
        TitleSmallLineHeight = TextUnitKt.getSp(20.0d);
        TitleSmallSize = TextUnitKt.getSp(14);
        TitleSmallTracking = TextUnitKt.getSp(0.1d);
        TitleSmallWeight = typefaceTokens.getWeightMedium();
    }

    @NotNull
    public final GenericFontFamily getBodyLargeFont() {
        return BodyLargeFont;
    }

    /* JADX INFO: renamed from: getBodyLargeLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2013getBodyLargeLineHeightXSAIIZE() {
        return BodyLargeLineHeight;
    }

    /* JADX INFO: renamed from: getBodyLargeSize-XSAIIZE, reason: not valid java name */
    public final long m2014getBodyLargeSizeXSAIIZE() {
        return BodyLargeSize;
    }

    /* JADX INFO: renamed from: getBodyLargeTracking-XSAIIZE, reason: not valid java name */
    public final long m2015getBodyLargeTrackingXSAIIZE() {
        return BodyLargeTracking;
    }

    @NotNull
    public final FontWeight getBodyLargeWeight() {
        return BodyLargeWeight;
    }

    @NotNull
    public final GenericFontFamily getBodyMediumFont() {
        return BodyMediumFont;
    }

    /* JADX INFO: renamed from: getBodyMediumLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2016getBodyMediumLineHeightXSAIIZE() {
        return BodyMediumLineHeight;
    }

    /* JADX INFO: renamed from: getBodyMediumSize-XSAIIZE, reason: not valid java name */
    public final long m2017getBodyMediumSizeXSAIIZE() {
        return BodyMediumSize;
    }

    /* JADX INFO: renamed from: getBodyMediumTracking-XSAIIZE, reason: not valid java name */
    public final long m2018getBodyMediumTrackingXSAIIZE() {
        return BodyMediumTracking;
    }

    @NotNull
    public final FontWeight getBodyMediumWeight() {
        return BodyMediumWeight;
    }

    @NotNull
    public final GenericFontFamily getBodySmallFont() {
        return BodySmallFont;
    }

    /* JADX INFO: renamed from: getBodySmallLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2019getBodySmallLineHeightXSAIIZE() {
        return BodySmallLineHeight;
    }

    /* JADX INFO: renamed from: getBodySmallSize-XSAIIZE, reason: not valid java name */
    public final long m2020getBodySmallSizeXSAIIZE() {
        return BodySmallSize;
    }

    /* JADX INFO: renamed from: getBodySmallTracking-XSAIIZE, reason: not valid java name */
    public final long m2021getBodySmallTrackingXSAIIZE() {
        return BodySmallTracking;
    }

    @NotNull
    public final FontWeight getBodySmallWeight() {
        return BodySmallWeight;
    }

    @NotNull
    public final GenericFontFamily getDisplayLargeFont() {
        return DisplayLargeFont;
    }

    /* JADX INFO: renamed from: getDisplayLargeLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2022getDisplayLargeLineHeightXSAIIZE() {
        return DisplayLargeLineHeight;
    }

    /* JADX INFO: renamed from: getDisplayLargeSize-XSAIIZE, reason: not valid java name */
    public final long m2023getDisplayLargeSizeXSAIIZE() {
        return DisplayLargeSize;
    }

    /* JADX INFO: renamed from: getDisplayLargeTracking-XSAIIZE, reason: not valid java name */
    public final long m2024getDisplayLargeTrackingXSAIIZE() {
        return DisplayLargeTracking;
    }

    @NotNull
    public final FontWeight getDisplayLargeWeight() {
        return DisplayLargeWeight;
    }

    @NotNull
    public final GenericFontFamily getDisplayMediumFont() {
        return DisplayMediumFont;
    }

    /* JADX INFO: renamed from: getDisplayMediumLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2025getDisplayMediumLineHeightXSAIIZE() {
        return DisplayMediumLineHeight;
    }

    /* JADX INFO: renamed from: getDisplayMediumSize-XSAIIZE, reason: not valid java name */
    public final long m2026getDisplayMediumSizeXSAIIZE() {
        return DisplayMediumSize;
    }

    /* JADX INFO: renamed from: getDisplayMediumTracking-XSAIIZE, reason: not valid java name */
    public final long m2027getDisplayMediumTrackingXSAIIZE() {
        return DisplayMediumTracking;
    }

    @NotNull
    public final FontWeight getDisplayMediumWeight() {
        return DisplayMediumWeight;
    }

    @NotNull
    public final GenericFontFamily getDisplaySmallFont() {
        return DisplaySmallFont;
    }

    /* JADX INFO: renamed from: getDisplaySmallLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2028getDisplaySmallLineHeightXSAIIZE() {
        return DisplaySmallLineHeight;
    }

    /* JADX INFO: renamed from: getDisplaySmallSize-XSAIIZE, reason: not valid java name */
    public final long m2029getDisplaySmallSizeXSAIIZE() {
        return DisplaySmallSize;
    }

    /* JADX INFO: renamed from: getDisplaySmallTracking-XSAIIZE, reason: not valid java name */
    public final long m2030getDisplaySmallTrackingXSAIIZE() {
        return DisplaySmallTracking;
    }

    @NotNull
    public final FontWeight getDisplaySmallWeight() {
        return DisplaySmallWeight;
    }

    @NotNull
    public final GenericFontFamily getHeadlineLargeFont() {
        return HeadlineLargeFont;
    }

    /* JADX INFO: renamed from: getHeadlineLargeLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2031getHeadlineLargeLineHeightXSAIIZE() {
        return HeadlineLargeLineHeight;
    }

    /* JADX INFO: renamed from: getHeadlineLargeSize-XSAIIZE, reason: not valid java name */
    public final long m2032getHeadlineLargeSizeXSAIIZE() {
        return HeadlineLargeSize;
    }

    /* JADX INFO: renamed from: getHeadlineLargeTracking-XSAIIZE, reason: not valid java name */
    public final long m2033getHeadlineLargeTrackingXSAIIZE() {
        return HeadlineLargeTracking;
    }

    @NotNull
    public final FontWeight getHeadlineLargeWeight() {
        return HeadlineLargeWeight;
    }

    @NotNull
    public final GenericFontFamily getHeadlineMediumFont() {
        return HeadlineMediumFont;
    }

    /* JADX INFO: renamed from: getHeadlineMediumLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2034getHeadlineMediumLineHeightXSAIIZE() {
        return HeadlineMediumLineHeight;
    }

    /* JADX INFO: renamed from: getHeadlineMediumSize-XSAIIZE, reason: not valid java name */
    public final long m2035getHeadlineMediumSizeXSAIIZE() {
        return HeadlineMediumSize;
    }

    /* JADX INFO: renamed from: getHeadlineMediumTracking-XSAIIZE, reason: not valid java name */
    public final long m2036getHeadlineMediumTrackingXSAIIZE() {
        return HeadlineMediumTracking;
    }

    @NotNull
    public final FontWeight getHeadlineMediumWeight() {
        return HeadlineMediumWeight;
    }

    @NotNull
    public final GenericFontFamily getHeadlineSmallFont() {
        return HeadlineSmallFont;
    }

    /* JADX INFO: renamed from: getHeadlineSmallLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2037getHeadlineSmallLineHeightXSAIIZE() {
        return HeadlineSmallLineHeight;
    }

    /* JADX INFO: renamed from: getHeadlineSmallSize-XSAIIZE, reason: not valid java name */
    public final long m2038getHeadlineSmallSizeXSAIIZE() {
        return HeadlineSmallSize;
    }

    /* JADX INFO: renamed from: getHeadlineSmallTracking-XSAIIZE, reason: not valid java name */
    public final long m2039getHeadlineSmallTrackingXSAIIZE() {
        return HeadlineSmallTracking;
    }

    @NotNull
    public final FontWeight getHeadlineSmallWeight() {
        return HeadlineSmallWeight;
    }

    @NotNull
    public final GenericFontFamily getLabelLargeFont() {
        return LabelLargeFont;
    }

    /* JADX INFO: renamed from: getLabelLargeLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2040getLabelLargeLineHeightXSAIIZE() {
        return LabelLargeLineHeight;
    }

    /* JADX INFO: renamed from: getLabelLargeSize-XSAIIZE, reason: not valid java name */
    public final long m2041getLabelLargeSizeXSAIIZE() {
        return LabelLargeSize;
    }

    /* JADX INFO: renamed from: getLabelLargeTracking-XSAIIZE, reason: not valid java name */
    public final long m2042getLabelLargeTrackingXSAIIZE() {
        return LabelLargeTracking;
    }

    @NotNull
    public final FontWeight getLabelLargeWeight() {
        return LabelLargeWeight;
    }

    @NotNull
    public final GenericFontFamily getLabelMediumFont() {
        return LabelMediumFont;
    }

    /* JADX INFO: renamed from: getLabelMediumLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2043getLabelMediumLineHeightXSAIIZE() {
        return LabelMediumLineHeight;
    }

    /* JADX INFO: renamed from: getLabelMediumSize-XSAIIZE, reason: not valid java name */
    public final long m2044getLabelMediumSizeXSAIIZE() {
        return LabelMediumSize;
    }

    /* JADX INFO: renamed from: getLabelMediumTracking-XSAIIZE, reason: not valid java name */
    public final long m2045getLabelMediumTrackingXSAIIZE() {
        return LabelMediumTracking;
    }

    @NotNull
    public final FontWeight getLabelMediumWeight() {
        return LabelMediumWeight;
    }

    @NotNull
    public final GenericFontFamily getLabelSmallFont() {
        return LabelSmallFont;
    }

    /* JADX INFO: renamed from: getLabelSmallLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2046getLabelSmallLineHeightXSAIIZE() {
        return LabelSmallLineHeight;
    }

    /* JADX INFO: renamed from: getLabelSmallSize-XSAIIZE, reason: not valid java name */
    public final long m2047getLabelSmallSizeXSAIIZE() {
        return LabelSmallSize;
    }

    /* JADX INFO: renamed from: getLabelSmallTracking-XSAIIZE, reason: not valid java name */
    public final long m2048getLabelSmallTrackingXSAIIZE() {
        return LabelSmallTracking;
    }

    @NotNull
    public final FontWeight getLabelSmallWeight() {
        return LabelSmallWeight;
    }

    @NotNull
    public final GenericFontFamily getTitleLargeFont() {
        return TitleLargeFont;
    }

    /* JADX INFO: renamed from: getTitleLargeLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2049getTitleLargeLineHeightXSAIIZE() {
        return TitleLargeLineHeight;
    }

    /* JADX INFO: renamed from: getTitleLargeSize-XSAIIZE, reason: not valid java name */
    public final long m2050getTitleLargeSizeXSAIIZE() {
        return TitleLargeSize;
    }

    /* JADX INFO: renamed from: getTitleLargeTracking-XSAIIZE, reason: not valid java name */
    public final long m2051getTitleLargeTrackingXSAIIZE() {
        return TitleLargeTracking;
    }

    @NotNull
    public final FontWeight getTitleLargeWeight() {
        return TitleLargeWeight;
    }

    @NotNull
    public final GenericFontFamily getTitleMediumFont() {
        return TitleMediumFont;
    }

    /* JADX INFO: renamed from: getTitleMediumLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2052getTitleMediumLineHeightXSAIIZE() {
        return TitleMediumLineHeight;
    }

    /* JADX INFO: renamed from: getTitleMediumSize-XSAIIZE, reason: not valid java name */
    public final long m2053getTitleMediumSizeXSAIIZE() {
        return TitleMediumSize;
    }

    /* JADX INFO: renamed from: getTitleMediumTracking-XSAIIZE, reason: not valid java name */
    public final long m2054getTitleMediumTrackingXSAIIZE() {
        return TitleMediumTracking;
    }

    @NotNull
    public final FontWeight getTitleMediumWeight() {
        return TitleMediumWeight;
    }

    @NotNull
    public final GenericFontFamily getTitleSmallFont() {
        return TitleSmallFont;
    }

    /* JADX INFO: renamed from: getTitleSmallLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2055getTitleSmallLineHeightXSAIIZE() {
        return TitleSmallLineHeight;
    }

    /* JADX INFO: renamed from: getTitleSmallSize-XSAIIZE, reason: not valid java name */
    public final long m2056getTitleSmallSizeXSAIIZE() {
        return TitleSmallSize;
    }

    /* JADX INFO: renamed from: getTitleSmallTracking-XSAIIZE, reason: not valid java name */
    public final long m2057getTitleSmallTrackingXSAIIZE() {
        return TitleSmallTracking;
    }

    @NotNull
    public final FontWeight getTitleSmallWeight() {
        return TitleSmallWeight;
    }
}
