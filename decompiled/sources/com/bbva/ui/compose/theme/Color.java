package com.bbva.ui.compose.theme;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorKt;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0003\bÜ\u0001\bÇ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u001d\u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u001d\u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u001d\u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R\u001d\u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u001d\u0010(\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R\u001d\u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u001d\u0010.\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u001d\u00101\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R\u001d\u00104\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R\u001d\u00107\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u001d\u0010:\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R\u001d\u0010=\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R\u001d\u0010@\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006R\u001d\u0010C\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R\u001d\u0010F\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0006R\u001d\u0010I\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R\u001d\u0010L\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006R\u001d\u0010O\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bM\u0010\u0004\u001a\u0004\bN\u0010\u0006R\u001d\u0010R\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bP\u0010\u0004\u001a\u0004\bQ\u0010\u0006R\u001d\u0010U\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bS\u0010\u0004\u001a\u0004\bT\u0010\u0006R\u001d\u0010X\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bV\u0010\u0004\u001a\u0004\bW\u0010\u0006R\u001d\u0010[\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bY\u0010\u0004\u001a\u0004\bZ\u0010\u0006R\u001d\u0010^\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\\\u0010\u0004\u001a\u0004\b]\u0010\u0006R\u001d\u0010a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b_\u0010\u0004\u001a\u0004\b`\u0010\u0006R\u001d\u0010d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bb\u0010\u0004\u001a\u0004\bc\u0010\u0006R\u001d\u0010g\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\be\u0010\u0004\u001a\u0004\bf\u0010\u0006R\u001d\u0010j\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bh\u0010\u0004\u001a\u0004\bi\u0010\u0006R\u001d\u0010m\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bk\u0010\u0004\u001a\u0004\bl\u0010\u0006R\u001d\u0010o\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u0004\u001a\u0004\bn\u0010\u0006R\u001d\u0010r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bp\u0010\u0004\u001a\u0004\bq\u0010\u0006R\u001d\u0010u\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bs\u0010\u0004\u001a\u0004\bt\u0010\u0006R\u001d\u0010x\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bv\u0010\u0004\u001a\u0004\bw\u0010\u0006R\u001d\u0010{\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\by\u0010\u0004\u001a\u0004\bz\u0010\u0006R\u001d\u0010~\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b|\u0010\u0004\u001a\u0004\b}\u0010\u0006R\u001f\u0010\u0081\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b\u007f\u0010\u0004\u001a\u0005\b\u0080\u0001\u0010\u0006R \u0010\u0084\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u0004\u001a\u0005\b\u0083\u0001\u0010\u0006R \u0010\u0087\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0004\u001a\u0005\b\u0086\u0001\u0010\u0006R \u0010\u008a\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\u0004\u001a\u0005\b\u0089\u0001\u0010\u0006R \u0010\u008d\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0004\u001a\u0005\b\u008c\u0001\u0010\u0006R \u0010\u0090\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0004\u001a\u0005\b\u008f\u0001\u0010\u0006R \u0010\u0093\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0004\u001a\u0005\b\u0092\u0001\u0010\u0006R \u0010\u0096\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\u0004\u001a\u0005\b\u0095\u0001\u0010\u0006R \u0010\u0099\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0004\u001a\u0005\b\u0098\u0001\u0010\u0006R \u0010\u009c\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010\u0004\u001a\u0005\b\u009b\u0001\u0010\u0006R \u0010\u009f\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0004\u001a\u0005\b\u009e\u0001\u0010\u0006R \u0010¢\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b \u0001\u0010\u0004\u001a\u0005\b¡\u0001\u0010\u0006R \u0010¥\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b£\u0001\u0010\u0004\u001a\u0005\b¤\u0001\u0010\u0006R \u0010¨\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¦\u0001\u0010\u0004\u001a\u0005\b§\u0001\u0010\u0006R \u0010«\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b©\u0001\u0010\u0004\u001a\u0005\bª\u0001\u0010\u0006R \u0010®\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¬\u0001\u0010\u0004\u001a\u0005\b\u00ad\u0001\u0010\u0006R \u0010±\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¯\u0001\u0010\u0004\u001a\u0005\b°\u0001\u0010\u0006R \u0010´\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b²\u0001\u0010\u0004\u001a\u0005\b³\u0001\u0010\u0006R \u0010·\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bµ\u0001\u0010\u0004\u001a\u0005\b¶\u0001\u0010\u0006R \u0010º\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¸\u0001\u0010\u0004\u001a\u0005\b¹\u0001\u0010\u0006R \u0010½\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b»\u0001\u0010\u0004\u001a\u0005\b¼\u0001\u0010\u0006R \u0010À\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¾\u0001\u0010\u0004\u001a\u0005\b¿\u0001\u0010\u0006R \u0010Ã\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bÁ\u0001\u0010\u0004\u001a\u0005\bÂ\u0001\u0010\u0006R \u0010Æ\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bÄ\u0001\u0010\u0004\u001a\u0005\bÅ\u0001\u0010\u0006R \u0010É\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bÇ\u0001\u0010\u0004\u001a\u0005\bÈ\u0001\u0010\u0006R \u0010Ì\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bÊ\u0001\u0010\u0004\u001a\u0005\bË\u0001\u0010\u0006R \u0010Ï\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bÍ\u0001\u0010\u0004\u001a\u0005\bÎ\u0001\u0010\u0006R \u0010Ò\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bÐ\u0001\u0010\u0004\u001a\u0005\bÑ\u0001\u0010\u0006R \u0010Õ\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bÓ\u0001\u0010\u0004\u001a\u0005\bÔ\u0001\u0010\u0006R \u0010Ø\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bÖ\u0001\u0010\u0004\u001a\u0005\b×\u0001\u0010\u0006R \u0010Û\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bÙ\u0001\u0010\u0004\u001a\u0005\bÚ\u0001\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Þ\u0001"}, d2 = {"Lcom/bbva/ui/compose/theme/Color;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getSky10-0d7_KjU", "()J", "Sky10", "b", "getSky40-0d7_KjU", "Sky40", "c", "getBlue40-0d7_KjU", "Blue40", "d", "getBlue60-0d7_KjU", "Blue60", "e", "getCoreBlue40-0d7_KjU", "CoreBlue40", "f", "getCoreBlue60-0d7_KjU", "CoreBlue60", "g", "getCoreBlue70-0d7_KjU", "CoreBlue70", "h", "getCoreBlue80-0d7_KjU", "CoreBlue80", "i", "getAqua10-0d7_KjU", "Aqua10", "j", "getAqua20-0d7_KjU", "Aqua20", "k", "getAqua40-0d7_KjU", "Aqua40", "l", "getAqua60-0d7_KjU", "Aqua60", "m", "getAqua70-0d7_KjU", "Aqua70", "n", "getAqua80-0d7_KjU", "Aqua80", "o", "getNeutralGrey10-0d7_KjU", "NeutralGrey10", "p", "getNeutralGrey20-0d7_KjU", "NeutralGrey20", "q", "getNeutralGrey40-0d7_KjU", "NeutralGrey40", "r", "getNeutralGrey50-0d7_KjU", "NeutralGrey50", "s", "getNeutralGrey70-0d7_KjU", "NeutralGrey70", "t", "getNeutralGrey100-0d7_KjU", "NeutralGrey100", "u", "getNeutralBlue10-0d7_KjU", "NeutralBlue10", SharedPrefsStorage.VERSION_KEY, "getNeutralBlue20-0d7_KjU", "NeutralBlue20", "w", "getNeutralBlue30-0d7_KjU", "NeutralBlue30", "x", "getNeutralBlue40-0d7_KjU", "NeutralBlue40", "y", "getNeutralBlue50-0d7_KjU", "NeutralBlue50", "z", "getNeutralBlue60-0d7_KjU", "NeutralBlue60", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getNeutralBlue70-0d7_KjU", "NeutralBlue70", "B", "getNeutralBlue80-0d7_KjU", "NeutralBlue80", "C", "getNeutralBlue90-0d7_KjU", "NeutralBlue90", "D", "getNeutralBlue100-0d7_KjU", "NeutralBlue100", ExifInterface.LONGITUDE_EAST, "getRed10-0d7_KjU", "Red10", "F", "getRed20-0d7_KjU", "Red20", "G", "getRed40-0d7_KjU", "Red40", "H", "getRed60-0d7_KjU", "Red60", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getRed70-0d7_KjU", "Red70", "getRed80-0d7_KjU", "Red80", "K", "getOrange10-0d7_KjU", "Orange10", "L", "getOrange20-0d7_KjU", "Orange20", "M", "getOrange40-0d7_KjU", "Orange40", "N", "getOrange60-0d7_KjU", "Orange60", "O", "getOrange70-0d7_KjU", "Orange70", "P", "getYellow10-0d7_KjU", "Yellow10", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "getYellow20-0d7_KjU", "Yellow20", "R", "getYellow40-0d7_KjU", "Yellow40", ExifInterface.LATITUDE_SOUTH, "getYellow60-0d7_KjU", "Yellow60", ExifInterface.GPS_DIRECTION_TRUE, "getYellow70-0d7_KjU", "Yellow70", "U", "getYellow80-0d7_KjU", "Yellow80", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getGreen10-0d7_KjU", "Green10", ExifInterface.LONGITUDE_WEST, "getGreen20-0d7_KjU", "Green20", "X", "getGreen40-0d7_KjU", "Green40", "Y", "getGreen60-0d7_KjU", "Green60", "Z", "getGreen70-0d7_KjU", "Green70", "a0", "getGreen80-0d7_KjU", "Green80", "b0", "getPink10-0d7_KjU", "Pink10", "c0", "getPink20-0d7_KjU", "Pink20", "d0", "getPink40-0d7_KjU", "Pink40", "e0", "getPink60-0d7_KjU", "Pink60", "f0", "getPink70-0d7_KjU", "Pink70", "g0", "getPurple10-0d7_KjU", "Purple10", "h0", "getPurple20-0d7_KjU", "Purple20", "i0", "getPurple40-0d7_KjU", "Purple40", "j0", "getPurple60-0d7_KjU", "Purple60", "k0", "getPurple70-0d7_KjU", "Purple70", "l0", "getSand10-0d7_KjU", "Sand10", "m0", "getSand20-0d7_KjU", "Sand20", "n0", "getSand40-0d7_KjU", "Sand40", "o0", "getSand60-0d7_KjU", "Sand60", "p0", "getSand70-0d7_KjU", "Sand70", "q0", "getSand80-0d7_KjU", "Sand80", "r0", "getWhite-0d7_KjU", "White", "s0", "getBlack-0d7_KjU", "Black", "t0", "getTransparent-0d7_KjU", "Transparent", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
public final class Color {
    public static final int $stable = 0;

    @NotNull
    public static final Color INSTANCE = new Color();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final long Sky10 = ColorKt.Color(4292144636L);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final long Sky40 = ColorKt.Color(4284202751L);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final long Blue40 = ColorKt.Color(4283016678L);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final long Blue60 = ColorKt.Color(4279858104L);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final long CoreBlue40 = ColorKt.Color(4279526565L);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final long CoreBlue60 = ColorKt.Color(4278207617L);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final long CoreBlue70 = ColorKt.Color(4278465123L);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final long CoreBlue80 = ColorKt.Color(4278657350L);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final long Aqua10 = ColorKt.Color(4293589498L);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final long Aqua20 = ColorKt.Color(4284138692L);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final long Aqua40 = ColorKt.Color(4281191629L);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final long Aqua60 = ColorKt.Color(4278363557L);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static final long Aqua70 = ColorKt.Color(4278355076L);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final long Aqua80 = ColorKt.Color(4278217836L);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final long NeutralGrey10 = ColorKt.Color(4294243572L);

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final long NeutralGrey20 = ColorKt.Color(4293519849L);

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final long NeutralGrey40 = ColorKt.Color(4292072403L);

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final long NeutralGrey50 = ColorKt.Color(4290624957L);

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final long NeutralGrey70 = ColorKt.Color(4284900966L);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final long NeutralGrey100 = ColorKt.Color(4279374354L);

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final long NeutralBlue10 = ColorKt.Color(4293323499L);

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final long NeutralBlue20 = ColorKt.Color(4289443516L);

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final long NeutralBlue30 = ColorKt.Color(4286023826L);

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final long NeutralBlue40 = ColorKt.Color(4283262322L);

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final long NeutralBlue50 = ColorKt.Color(4281222226L);

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final long NeutralBlue60 = ColorKt.Color(4280102973L);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final long NeutralBlue70 = ColorKt.Color(4279444272L);

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public static final long NeutralBlue80 = ColorKt.Color(4279114277L);

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public static final long NeutralBlue90 = ColorKt.Color(4278784022L);

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public static final long NeutralBlue100 = ColorKt.Color(4278520591L);

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public static final long Red10 = ColorKt.Color(4294762463L);

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public static final long Red20 = ColorKt.Color(4294285209L);

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public static final long Red40 = ColorKt.Color(4294139489L);

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public static final long Red60 = ColorKt.Color(4292102992L);

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public static final long Red70 = ColorKt.Color(4291507514L);

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public static final long Red80 = ColorKt.Color(4287110962L);

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public static final long Orange10 = ColorKt.Color(4294830040L);

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public static final long Orange20 = ColorKt.Color(4294619775L);

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public static final long Orange40 = ColorKt.Color(4294412603L);

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public static final long Orange60 = ColorKt.Color(4292375340L);

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public static final long Orange70 = ColorKt.Color(4291187458L);

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public static final long Yellow10 = ColorKt.Color(4294899164L);

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public static final long Yellow20 = ColorKt.Color(4294631054L);

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public static final long Yellow40 = ColorKt.Color(4294495569L);

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public static final long Yellow60 = ColorKt.Color(4291073845L);

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public static final long Yellow70 = ColorKt.Color(4288441345L);

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public static final long Yellow80 = ColorKt.Color(4285878529L);

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public static final long Green10 = ColorKt.Color(4292472800L);

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public static final long Green20 = ColorKt.Color(4287154842L);

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public static final long Green40 = ColorKt.Color(4282953316L);

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public static final long Green60 = ColorKt.Color(4281896271L);

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public static final long Green70 = ColorKt.Color(4280777278L);

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    public static final long Green80 = ColorKt.Color(4280113966L);

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    public static final long Pink10 = ColorKt.Color(4294827256L);

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    public static final long Pink20 = ColorKt.Color(4294620144L);

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    public static final long Pink40 = ColorKt.Color(4294413288L);

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    public static final long Pink60 = ColorKt.Color(4291127737L);

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    public static final long Pink70 = ColorKt.Color(4289549217L);

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    public static final long Purple10 = ColorKt.Color(4292728823L);

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    public static final long Purple20 = ColorKt.Color(4290160878L);

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public static final long Purple40 = ColorKt.Color(4287593189L);

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public static final long Purple60 = ColorKt.Color(4286343879L);

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public static final long Purple70 = ColorKt.Color(4284961976L);

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    public static final long Sand10 = ColorKt.Color(4294175701L);

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    public static final long Sand20 = ColorKt.Color(4293318053L);

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public static final long Sand40 = ColorKt.Color(4292394613L);

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    public static final long Sand60 = ColorKt.Color(4290223710L);

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public static final long Sand70 = ColorKt.Color(4287524898L);

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public static final long Sand80 = ColorKt.Color(4285026841L);

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public static final long White = ColorKt.Color(4294967295L);

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public static final long Black = ColorKt.Color(4278190080L);

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public static final long Transparent = ColorKt.Color(0);

    /* JADX INFO: renamed from: getAqua10-0d7_KjU, reason: not valid java name */
    public final long m4990getAqua100d7_KjU() {
        return Aqua10;
    }

    /* JADX INFO: renamed from: getAqua20-0d7_KjU, reason: not valid java name */
    public final long m4991getAqua200d7_KjU() {
        return Aqua20;
    }

    /* JADX INFO: renamed from: getAqua40-0d7_KjU, reason: not valid java name */
    public final long m4992getAqua400d7_KjU() {
        return Aqua40;
    }

    /* JADX INFO: renamed from: getAqua60-0d7_KjU, reason: not valid java name */
    public final long m4993getAqua600d7_KjU() {
        return Aqua60;
    }

    /* JADX INFO: renamed from: getAqua70-0d7_KjU, reason: not valid java name */
    public final long m4994getAqua700d7_KjU() {
        return Aqua70;
    }

    /* JADX INFO: renamed from: getAqua80-0d7_KjU, reason: not valid java name */
    public final long m4995getAqua800d7_KjU() {
        return Aqua80;
    }

    /* JADX INFO: renamed from: getBlack-0d7_KjU, reason: not valid java name */
    public final long m4996getBlack0d7_KjU() {
        return Black;
    }

    /* JADX INFO: renamed from: getBlue40-0d7_KjU, reason: not valid java name */
    public final long m4997getBlue400d7_KjU() {
        return Blue40;
    }

    /* JADX INFO: renamed from: getBlue60-0d7_KjU, reason: not valid java name */
    public final long m4998getBlue600d7_KjU() {
        return Blue60;
    }

    /* JADX INFO: renamed from: getCoreBlue40-0d7_KjU, reason: not valid java name */
    public final long m4999getCoreBlue400d7_KjU() {
        return CoreBlue40;
    }

    /* JADX INFO: renamed from: getCoreBlue60-0d7_KjU, reason: not valid java name */
    public final long m5000getCoreBlue600d7_KjU() {
        return CoreBlue60;
    }

    /* JADX INFO: renamed from: getCoreBlue70-0d7_KjU, reason: not valid java name */
    public final long m5001getCoreBlue700d7_KjU() {
        return CoreBlue70;
    }

    /* JADX INFO: renamed from: getCoreBlue80-0d7_KjU, reason: not valid java name */
    public final long m5002getCoreBlue800d7_KjU() {
        return CoreBlue80;
    }

    /* JADX INFO: renamed from: getGreen10-0d7_KjU, reason: not valid java name */
    public final long m5003getGreen100d7_KjU() {
        return Green10;
    }

    /* JADX INFO: renamed from: getGreen20-0d7_KjU, reason: not valid java name */
    public final long m5004getGreen200d7_KjU() {
        return Green20;
    }

    /* JADX INFO: renamed from: getGreen40-0d7_KjU, reason: not valid java name */
    public final long m5005getGreen400d7_KjU() {
        return Green40;
    }

    /* JADX INFO: renamed from: getGreen60-0d7_KjU, reason: not valid java name */
    public final long m5006getGreen600d7_KjU() {
        return Green60;
    }

    /* JADX INFO: renamed from: getGreen70-0d7_KjU, reason: not valid java name */
    public final long m5007getGreen700d7_KjU() {
        return Green70;
    }

    /* JADX INFO: renamed from: getGreen80-0d7_KjU, reason: not valid java name */
    public final long m5008getGreen800d7_KjU() {
        return Green80;
    }

    /* JADX INFO: renamed from: getNeutralBlue10-0d7_KjU, reason: not valid java name */
    public final long m5009getNeutralBlue100d7_KjU() {
        return NeutralBlue10;
    }

    /* JADX INFO: renamed from: getNeutralBlue100-0d7_KjU, reason: not valid java name */
    public final long m5010getNeutralBlue1000d7_KjU() {
        return NeutralBlue100;
    }

    /* JADX INFO: renamed from: getNeutralBlue20-0d7_KjU, reason: not valid java name */
    public final long m5011getNeutralBlue200d7_KjU() {
        return NeutralBlue20;
    }

    /* JADX INFO: renamed from: getNeutralBlue30-0d7_KjU, reason: not valid java name */
    public final long m5012getNeutralBlue300d7_KjU() {
        return NeutralBlue30;
    }

    /* JADX INFO: renamed from: getNeutralBlue40-0d7_KjU, reason: not valid java name */
    public final long m5013getNeutralBlue400d7_KjU() {
        return NeutralBlue40;
    }

    /* JADX INFO: renamed from: getNeutralBlue50-0d7_KjU, reason: not valid java name */
    public final long m5014getNeutralBlue500d7_KjU() {
        return NeutralBlue50;
    }

    /* JADX INFO: renamed from: getNeutralBlue60-0d7_KjU, reason: not valid java name */
    public final long m5015getNeutralBlue600d7_KjU() {
        return NeutralBlue60;
    }

    /* JADX INFO: renamed from: getNeutralBlue70-0d7_KjU, reason: not valid java name */
    public final long m5016getNeutralBlue700d7_KjU() {
        return NeutralBlue70;
    }

    /* JADX INFO: renamed from: getNeutralBlue80-0d7_KjU, reason: not valid java name */
    public final long m5017getNeutralBlue800d7_KjU() {
        return NeutralBlue80;
    }

    /* JADX INFO: renamed from: getNeutralBlue90-0d7_KjU, reason: not valid java name */
    public final long m5018getNeutralBlue900d7_KjU() {
        return NeutralBlue90;
    }

    /* JADX INFO: renamed from: getNeutralGrey10-0d7_KjU, reason: not valid java name */
    public final long m5019getNeutralGrey100d7_KjU() {
        return NeutralGrey10;
    }

    /* JADX INFO: renamed from: getNeutralGrey100-0d7_KjU, reason: not valid java name */
    public final long m5020getNeutralGrey1000d7_KjU() {
        return NeutralGrey100;
    }

    /* JADX INFO: renamed from: getNeutralGrey20-0d7_KjU, reason: not valid java name */
    public final long m5021getNeutralGrey200d7_KjU() {
        return NeutralGrey20;
    }

    /* JADX INFO: renamed from: getNeutralGrey40-0d7_KjU, reason: not valid java name */
    public final long m5022getNeutralGrey400d7_KjU() {
        return NeutralGrey40;
    }

    /* JADX INFO: renamed from: getNeutralGrey50-0d7_KjU, reason: not valid java name */
    public final long m5023getNeutralGrey500d7_KjU() {
        return NeutralGrey50;
    }

    /* JADX INFO: renamed from: getNeutralGrey70-0d7_KjU, reason: not valid java name */
    public final long m5024getNeutralGrey700d7_KjU() {
        return NeutralGrey70;
    }

    /* JADX INFO: renamed from: getOrange10-0d7_KjU, reason: not valid java name */
    public final long m5025getOrange100d7_KjU() {
        return Orange10;
    }

    /* JADX INFO: renamed from: getOrange20-0d7_KjU, reason: not valid java name */
    public final long m5026getOrange200d7_KjU() {
        return Orange20;
    }

    /* JADX INFO: renamed from: getOrange40-0d7_KjU, reason: not valid java name */
    public final long m5027getOrange400d7_KjU() {
        return Orange40;
    }

    /* JADX INFO: renamed from: getOrange60-0d7_KjU, reason: not valid java name */
    public final long m5028getOrange600d7_KjU() {
        return Orange60;
    }

    /* JADX INFO: renamed from: getOrange70-0d7_KjU, reason: not valid java name */
    public final long m5029getOrange700d7_KjU() {
        return Orange70;
    }

    /* JADX INFO: renamed from: getPink10-0d7_KjU, reason: not valid java name */
    public final long m5030getPink100d7_KjU() {
        return Pink10;
    }

    /* JADX INFO: renamed from: getPink20-0d7_KjU, reason: not valid java name */
    public final long m5031getPink200d7_KjU() {
        return Pink20;
    }

    /* JADX INFO: renamed from: getPink40-0d7_KjU, reason: not valid java name */
    public final long m5032getPink400d7_KjU() {
        return Pink40;
    }

    /* JADX INFO: renamed from: getPink60-0d7_KjU, reason: not valid java name */
    public final long m5033getPink600d7_KjU() {
        return Pink60;
    }

    /* JADX INFO: renamed from: getPink70-0d7_KjU, reason: not valid java name */
    public final long m5034getPink700d7_KjU() {
        return Pink70;
    }

    /* JADX INFO: renamed from: getPurple10-0d7_KjU, reason: not valid java name */
    public final long m5035getPurple100d7_KjU() {
        return Purple10;
    }

    /* JADX INFO: renamed from: getPurple20-0d7_KjU, reason: not valid java name */
    public final long m5036getPurple200d7_KjU() {
        return Purple20;
    }

    /* JADX INFO: renamed from: getPurple40-0d7_KjU, reason: not valid java name */
    public final long m5037getPurple400d7_KjU() {
        return Purple40;
    }

    /* JADX INFO: renamed from: getPurple60-0d7_KjU, reason: not valid java name */
    public final long m5038getPurple600d7_KjU() {
        return Purple60;
    }

    /* JADX INFO: renamed from: getPurple70-0d7_KjU, reason: not valid java name */
    public final long m5039getPurple700d7_KjU() {
        return Purple70;
    }

    /* JADX INFO: renamed from: getRed10-0d7_KjU, reason: not valid java name */
    public final long m5040getRed100d7_KjU() {
        return Red10;
    }

    /* JADX INFO: renamed from: getRed20-0d7_KjU, reason: not valid java name */
    public final long m5041getRed200d7_KjU() {
        return Red20;
    }

    /* JADX INFO: renamed from: getRed40-0d7_KjU, reason: not valid java name */
    public final long m5042getRed400d7_KjU() {
        return Red40;
    }

    /* JADX INFO: renamed from: getRed60-0d7_KjU, reason: not valid java name */
    public final long m5043getRed600d7_KjU() {
        return Red60;
    }

    /* JADX INFO: renamed from: getRed70-0d7_KjU, reason: not valid java name */
    public final long m5044getRed700d7_KjU() {
        return Red70;
    }

    /* JADX INFO: renamed from: getRed80-0d7_KjU, reason: not valid java name */
    public final long m5045getRed800d7_KjU() {
        return Red80;
    }

    /* JADX INFO: renamed from: getSand10-0d7_KjU, reason: not valid java name */
    public final long m5046getSand100d7_KjU() {
        return Sand10;
    }

    /* JADX INFO: renamed from: getSand20-0d7_KjU, reason: not valid java name */
    public final long m5047getSand200d7_KjU() {
        return Sand20;
    }

    /* JADX INFO: renamed from: getSand40-0d7_KjU, reason: not valid java name */
    public final long m5048getSand400d7_KjU() {
        return Sand40;
    }

    /* JADX INFO: renamed from: getSand60-0d7_KjU, reason: not valid java name */
    public final long m5049getSand600d7_KjU() {
        return Sand60;
    }

    /* JADX INFO: renamed from: getSand70-0d7_KjU, reason: not valid java name */
    public final long m5050getSand700d7_KjU() {
        return Sand70;
    }

    /* JADX INFO: renamed from: getSand80-0d7_KjU, reason: not valid java name */
    public final long m5051getSand800d7_KjU() {
        return Sand80;
    }

    /* JADX INFO: renamed from: getSky10-0d7_KjU, reason: not valid java name */
    public final long m5052getSky100d7_KjU() {
        return Sky10;
    }

    /* JADX INFO: renamed from: getSky40-0d7_KjU, reason: not valid java name */
    public final long m5053getSky400d7_KjU() {
        return Sky40;
    }

    /* JADX INFO: renamed from: getTransparent-0d7_KjU, reason: not valid java name */
    public final long m5054getTransparent0d7_KjU() {
        return Transparent;
    }

    /* JADX INFO: renamed from: getWhite-0d7_KjU, reason: not valid java name */
    public final long m5055getWhite0d7_KjU() {
        return White;
    }

    /* JADX INFO: renamed from: getYellow10-0d7_KjU, reason: not valid java name */
    public final long m5056getYellow100d7_KjU() {
        return Yellow10;
    }

    /* JADX INFO: renamed from: getYellow20-0d7_KjU, reason: not valid java name */
    public final long m5057getYellow200d7_KjU() {
        return Yellow20;
    }

    /* JADX INFO: renamed from: getYellow40-0d7_KjU, reason: not valid java name */
    public final long m5058getYellow400d7_KjU() {
        return Yellow40;
    }

    /* JADX INFO: renamed from: getYellow60-0d7_KjU, reason: not valid java name */
    public final long m5059getYellow600d7_KjU() {
        return Yellow60;
    }

    /* JADX INFO: renamed from: getYellow70-0d7_KjU, reason: not valid java name */
    public final long m5060getYellow700d7_KjU() {
        return Yellow70;
    }

    /* JADX INFO: renamed from: getYellow80-0d7_KjU, reason: not valid java name */
    public final long m5061getYellow800d7_KjU() {
        return Yellow80;
    }
}
