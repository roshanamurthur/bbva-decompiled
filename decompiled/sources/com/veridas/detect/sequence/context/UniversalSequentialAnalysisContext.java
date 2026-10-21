package com.veridas.detect.sequence.context;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.salesforce.marketingcloud.storage.db.i;
import com.veridas.detect.DetectionMode;
import com.veridas.detect.Request;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.detect.sequence.score.Score;
import com.veridas.detect.spatial.SpatialDetectionResult;
import com.veridas.detect.spatial.SpatialObjectDetector;
import com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory;
import com.veridas.math.geometry.Rectangle;
import com.veridas.vdlibraryimageprocessing.VDConstantDefinition;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UniversalSequentialAnalysisContext.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\bZ\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005BÇ\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0015\u0012\b\b\u0002\u0010#\u001a\u00020\u0006\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u000104\u0012\b\b\u0002\u0010C\u001a\u00020<\u0012\b\b\u0002\u0010G\u001a\u00020\u0006\u0012\b\b\u0002\u0010O\u001a\u00020H\u0012\b\b\u0002\u0010S\u001a\u00020H\u0012\b\b\u0002\u0010W\u001a\u00020H\u0012\b\b\u0002\u0010[\u001a\u00020\u0006\u0012\b\b\u0002\u0010c\u001a\u00020\\\u0012\b\b\u0002\u0010g\u001a\u00020\u0006\u0012\b\b\u0002\u0010k\u001a\u00020\u0006\u0012\b\b\u0002\u0010o\u001a\u00020<\u0012\b\b\u0002\u0010s\u001a\u00020<\u0012\b\b\u0002\u0010w\u001a\u00020<\u0012\b\b\u0002\u0010\u007f\u001a\u00020x\u0012\f\b\u0002\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0080\u0001\u0012\f\b\u0002\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0088\u0001\u0012\t\b\u0002\u0010\u0093\u0001\u001a\u00020x\u0012\t\b\u0002\u0010\u0097\u0001\u001a\u00020\u0006\u0012\t\b\u0002\u0010\u009b\u0001\u001a\u00020\u0006\u0012\t\b\u0002\u0010\u009f\u0001\u001a\u00020H\u0012\t\b\u0002\u0010£\u0001\u001a\u00020H\u0012\t\b\u0002\u0010¦\u0001\u001a\u00020<\u0012\t\b\u0002\u0010©\u0001\u001a\u00020<\u0012\t\b\u0002\u0010¬\u0001\u001a\u00020<\u0012\t\b\u0002\u0010¯\u0001\u001a\u00020<\u0012\n\b\u0002\u0010·\u0001\u001a\u00030°\u0001\u0012\t\b\u0002\u0010»\u0001\u001a\u00020H\u0012\u0010\b\u0002\u0010Ã\u0001\u001a\t\u0012\u0004\u0012\u00020\\0¼\u0001\u0012\t\b\u0002\u0010Ç\u0001\u001a\u00020H\u0012\f\b\u0002\u0010Î\u0001\u001a\u0005\u0018\u00010È\u0001\u0012\f\b\u0002\u0010Ö\u0001\u001a\u0005\u0018\u00010Ï\u0001\u0012\u0017\b\u0002\u0010Ü\u0001\u001a\u0010\u0012\u0004\u0012\u00020\\\u0012\u0005\u0012\u00030È\u00010×\u0001\u0012\n\b\u0002\u0010à\u0001\u001a\u00030°\u0001\u0012\t\b\u0002\u0010ã\u0001\u001a\u00020<\u0012\t\b\u0002\u0010æ\u0001\u001a\u00020<\u0012\t\b\u0002\u0010é\u0001\u001a\u00020<\u0012\t\b\u0002\u0010ì\u0001\u001a\u00020<\u0012\t\b\u0002\u0010ï\u0001\u001a\u00020<\u0012\t\b\u0002\u0010ò\u0001\u001a\u00020<\u0012\t\b\u0002\u0010õ\u0001\u001a\u00020<\u0012\t\b\u0002\u0010ø\u0001\u001a\u00020<\u0012\t\b\u0002\u0010ü\u0001\u001a\u00020<\u0012\t\b\u0002\u0010\u0080\u0002\u001a\u00020<\u0012\t\b\u0002\u0010\u0084\u0002\u001a\u00020<\u0012\t\b\u0002\u0010\u0087\u0002\u001a\u00020H\u0012\t\b\u0002\u0010\u008a\u0002\u001a\u00020H\u0012\t\b\u0002\u0010\u008c\u0002\u001a\u00020<\u0012\t\b\u0002\u0010\u008f\u0002\u001a\u00020<\u0012\t\b\u0002\u0010\u0092\u0002\u001a\u00020<\u0012\t\b\u0002\u0010\u0095\u0002\u001a\u00020<\u0012\t\b\u0002\u0010\u0098\u0002\u001a\u00020<\u0012\t\b\u0002\u0010\u009b\u0002\u001a\u00020H\u0012\t\b\u0002\u0010\u009f\u0002\u001a\u00020H\u0012\t\b\u0002\u0010£\u0002\u001a\u00020H\u0012\t\b\u0002\u0010§\u0002\u001a\u00020<\u0012\t\b\u0002\u0010ª\u0002\u001a\u00020<\u0012\t\b\u0002\u0010®\u0002\u001a\u00020H¢\u0006\u0006\b¯\u0002\u0010°\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J'\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010+\u001a\u0004\u0018\u00010$8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u00103\u001a\u0004\u0018\u00010,8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010;\u001a\u0004\u0018\u0001048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bD\u0010\u001e\u001a\u0004\bE\u0010 \"\u0004\bF\u0010\"R\"\u0010O\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010S\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bP\u0010J\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010NR\"\u0010W\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bT\u0010J\u001a\u0004\bU\u0010L\"\u0004\bV\u0010NR\"\u0010[\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bX\u0010\u001e\u001a\u0004\bY\u0010 \"\u0004\bZ\u0010\"R\"\u0010c\u001a\u00020\\8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010g\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bd\u0010\u001e\u001a\u0004\be\u0010 \"\u0004\bf\u0010\"R\"\u0010k\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bh\u0010\u001e\u001a\u0004\bi\u0010 \"\u0004\bj\u0010\"R\"\u0010o\u001a\u00020<8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bl\u0010>\u001a\u0004\bm\u0010@\"\u0004\bn\u0010BR\"\u0010s\u001a\u00020<8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bp\u0010>\u001a\u0004\bq\u0010@\"\u0004\br\u0010BR\"\u0010w\u001a\u00020<8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bt\u0010>\u001a\u0004\bu\u0010@\"\u0004\bv\u0010BR\"\u0010\u007f\u001a\u00020x8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R,\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R,\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R&\u0010\u0093\u0001\u001a\u00020x8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010z\u001a\u0005\b\u0091\u0001\u0010|\"\u0005\b\u0092\u0001\u0010~R&\u0010\u0097\u0001\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010\u001e\u001a\u0005\b\u0095\u0001\u0010 \"\u0005\b\u0096\u0001\u0010\"R&\u0010\u009b\u0001\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010\u001e\u001a\u0005\b\u0099\u0001\u0010 \"\u0005\b\u009a\u0001\u0010\"R&\u0010\u009f\u0001\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010J\u001a\u0005\b\u009d\u0001\u0010L\"\u0005\b\u009e\u0001\u0010NR&\u0010£\u0001\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b \u0001\u0010J\u001a\u0005\b¡\u0001\u0010L\"\u0005\b¢\u0001\u0010NR\u001d\u0010¦\u0001\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b¤\u0001\u0010>\u001a\u0005\b¥\u0001\u0010@R\u001d\u0010©\u0001\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b§\u0001\u0010>\u001a\u0005\b¨\u0001\u0010@R%\u0010¬\u0001\u001a\u00020<8\u0016@\u0016X\u0096\u000e¢\u0006\u0014\n\u0004\b\n\u0010>\u001a\u0005\bª\u0001\u0010@\"\u0005\b«\u0001\u0010BR%\u0010¯\u0001\u001a\u00020<8\u0016@\u0016X\u0096\u000e¢\u0006\u0014\n\u0004\b>\u0010>\u001a\u0005\b\u00ad\u0001\u0010@\"\u0005\b®\u0001\u0010BR*\u0010·\u0001\u001a\u00030°\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R&\u0010»\u0001\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b¸\u0001\u0010J\u001a\u0005\b¹\u0001\u0010L\"\u0005\bº\u0001\u0010NR0\u0010Ã\u0001\u001a\t\u0012\u0004\u0012\u00020\\0¼\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R&\u0010Ç\u0001\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\bÄ\u0001\u0010J\u001a\u0005\bÅ\u0001\u0010L\"\u0005\bÆ\u0001\u0010NR+\u0010Î\u0001\u001a\u0005\u0018\u00010È\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\bJ\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R,\u0010Ö\u0001\u001a\u0005\u0018\u00010Ï\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\bÐ\u0001\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001\"\u0006\bÔ\u0001\u0010Õ\u0001R-\u0010Ü\u0001\u001a\u0010\u0012\u0004\u0012\u00020\\\u0012\u0005\u0012\u00030È\u00010×\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001R*\u0010à\u0001\u001a\u00030°\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\bÝ\u0001\u0010²\u0001\u001a\u0006\bÞ\u0001\u0010´\u0001\"\u0006\bß\u0001\u0010¶\u0001R\u001d\u0010ã\u0001\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bá\u0001\u0010>\u001a\u0005\bâ\u0001\u0010@R\u001d\u0010æ\u0001\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bä\u0001\u0010>\u001a\u0005\bå\u0001\u0010@R\u001d\u0010é\u0001\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bç\u0001\u0010>\u001a\u0005\bè\u0001\u0010@R\u001d\u0010ì\u0001\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bê\u0001\u0010>\u001a\u0005\bë\u0001\u0010@R\u001d\u0010ï\u0001\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bí\u0001\u0010>\u001a\u0005\bî\u0001\u0010@R\u001d\u0010ò\u0001\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bð\u0001\u0010>\u001a\u0005\bñ\u0001\u0010@R\u001d\u0010õ\u0001\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bó\u0001\u0010>\u001a\u0005\bô\u0001\u0010@R\u001d\u0010ø\u0001\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bö\u0001\u0010>\u001a\u0005\b÷\u0001\u0010@R&\u0010ü\u0001\u001a\u00020<8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\bù\u0001\u0010>\u001a\u0005\bú\u0001\u0010@\"\u0005\bû\u0001\u0010BR&\u0010\u0080\u0002\u001a\u00020<8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\bý\u0001\u0010>\u001a\u0005\bþ\u0001\u0010@\"\u0005\bÿ\u0001\u0010BR&\u0010\u0084\u0002\u001a\u00020<8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u0081\u0002\u0010>\u001a\u0005\b\u0082\u0002\u0010@\"\u0005\b\u0083\u0002\u0010BR\u001d\u0010\u0087\u0002\u001a\u00020H8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0085\u0002\u0010J\u001a\u0005\b\u0086\u0002\u0010LR\u001d\u0010\u008a\u0002\u001a\u00020H8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0088\u0002\u0010J\u001a\u0005\b\u0089\u0002\u0010LR\u001c\u0010\u008c\u0002\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\r\n\u0004\b\u001e\u0010>\u001a\u0005\b\u008b\u0002\u0010@R\u001d\u0010\u008f\u0002\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u008d\u0002\u0010>\u001a\u0005\b\u008e\u0002\u0010@R\u001d\u0010\u0092\u0002\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0090\u0002\u0010>\u001a\u0005\b\u0091\u0002\u0010@R\u001d\u0010\u0095\u0002\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0093\u0002\u0010>\u001a\u0005\b\u0094\u0002\u0010@R\u001d\u0010\u0098\u0002\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0096\u0002\u0010>\u001a\u0005\b\u0097\u0002\u0010@R\u001d\u0010\u009b\u0002\u001a\u00020H8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0099\u0002\u0010J\u001a\u0005\b\u009a\u0002\u0010LR&\u0010\u009f\u0002\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u009c\u0002\u0010J\u001a\u0005\b\u009d\u0002\u0010L\"\u0005\b\u009e\u0002\u0010NR&\u0010£\u0002\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b \u0002\u0010J\u001a\u0005\b¡\u0002\u0010L\"\u0005\b¢\u0002\u0010NR&\u0010§\u0002\u001a\u00020<8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b¤\u0002\u0010>\u001a\u0005\b¥\u0002\u0010@\"\u0005\b¦\u0002\u0010BR\u001d\u0010ª\u0002\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b¨\u0002\u0010>\u001a\u0005\b©\u0002\u0010@R&\u0010®\u0002\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b«\u0002\u0010J\u001a\u0005\b¬\u0002\u0010L\"\u0005\b\u00ad\u0002\u0010N¨\u0006±\u0002"}, d2 = {"Lcom/veridas/detect/sequence/context/UniversalSequentialAnalysisContext;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "Lcom/veridas/detect/sequence/context/IntelligentSequentialAnalysisContext;", "Lcom/veridas/detect/sequence/context/ImageFaceSequentialAnalysisContext;", "Lcom/veridas/detect/sequence/context/VideoFaceSequentialAnalysisContext;", "", "hasHit", "isWarmupActive", "isWarmupEndReached", "C", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "visitor", "accept", "(Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;)Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "Lcom/veridas/detect/sequence/score/Score;", "a", "Lcom/veridas/detect/sequence/score/Score;", "getScore", "()Lcom/veridas/detect/sequence/score/Score;", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$AnalysisType;", "b", "Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$AnalysisType;", "getAnalysisType", "()Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$AnalysisType;", "setAnalysisType", "(Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$AnalysisType;)V", "analysisType", "c", "Z", "getAnalyze", "()Z", "setAnalyze", "(Z)V", "analyze", "Lcom/veridas/math/geometry/Rectangle;", "d", "Lcom/veridas/math/geometry/Rectangle;", "getBestDetectionResult", "()Lcom/veridas/math/geometry/Rectangle;", "setBestDetectionResult", "(Lcom/veridas/math/geometry/Rectangle;)V", "bestDetectionResult", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "e", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "getDetector", "()Lcom/veridas/detect/spatial/SpatialObjectDetector;", "setDetector", "(Lcom/veridas/detect/spatial/SpatialObjectDetector;)V", "detector", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "f", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "getDetectionResult", "()Lcom/veridas/detect/spatial/SpatialDetectionResult;", "setDetectionResult", "(Lcom/veridas/detect/spatial/SpatialDetectionResult;)V", "detectionResult", "", "g", "D", "getFps", "()D", "setFps", "(D)V", "fps", "h", "getInitialized", "setInitialized", "initialized", "", "i", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIteration", "()I", "setIteration", "(I)V", "iteration", "j", "getLightBlobDetectionFrameCount", "setLightBlobDetectionFrameCount", "lightBlobDetectionFrameCount", "k", "getLightBlobDetectionInterval", "setLightBlobDetectionInterval", "lightBlobDetectionInterval", "l", "getLightBlobDetected", "setLightBlobDetected", "lightBlobDetected", "", "m", "Ljava/lang/String;", "getObjectData", "()Ljava/lang/String;", "setObjectData", "(Ljava/lang/String;)V", "objectData", "n", "getObjectDetected", "setObjectDetected", "objectDetected", "o", "getObjectLost", "setObjectLost", "objectLost", "p", "getProgress", "setProgress", "progress", "q", "getProgressMax", "setProgressMax", "progressMax", "r", "getProgressThreshold", "setProgressThreshold", "progressThreshold", "Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;", "s", "Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;", "getProximity", "()Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;", "setProximity", "(Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;)V", i.a.f65026x, "Lcom/veridas/detect/Request;", "t", "Lcom/veridas/detect/Request;", "getRequest", "()Lcom/veridas/detect/Request;", "setRequest", "(Lcom/veridas/detect/Request;)V", "request", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "u", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "getResult", "()Lcom/veridas/detect/sequence/SequentialDetectionResult;", "setResult", "(Lcom/veridas/detect/sequence/SequentialDetectionResult;)V", "result", SharedPrefsStorage.VERSION_KEY, "getViewportProximity", "setViewportProximity", "viewportProximity", "w", "getWarmup", "setWarmup", "warmup", "x", "getWarmupComplete", "setWarmupComplete", "warmupComplete", "y", "getWarmupFrameCount", "setWarmupFrameCount", "warmupFrameCount", "z", "getWarmupMaxFrameCount", "setWarmupMaxFrameCount", "warmupMaxFrameCount", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getCaptureTime", "captureTime", "B", "getCenteredTime", "centeredTime", "getCaptureMaxFrameCount", "setCaptureMaxFrameCount", "captureMaxFrameCount", "getCenteredMaxFrameCount", "setCenteredMaxFrameCount", "centeredMaxFrameCount", "Lcom/veridas/detect/DetectionMode;", ExifInterface.LONGITUDE_EAST, "Lcom/veridas/detect/DetectionMode;", "getDetectionMode", "()Lcom/veridas/detect/DetectionMode;", "setDetectionMode", "(Lcom/veridas/detect/DetectionMode;)V", "detectionMode", "F", "getDetectionModeIndex", "setDetectionModeIndex", "detectionModeIndex", "", "G", "Ljava/util/List;", "getDocumentIds", "()Ljava/util/List;", "setDocumentIds", "(Ljava/util/List;)V", "documentIds", "H", "getDocumentIndex", "setDocumentIndex", "documentIndex", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext$DocumentDetectorElement;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext$DocumentDetectorElement;", "getDocumentDetectorElement", "()Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext$DocumentDetectorElement;", "setDocumentDetectorElement", "(Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext$DocumentDetectorElement;)V", "documentDetectorElement", "Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "J", "Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "getDocumentDetectorFactory", "()Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "setDocumentDetectorFactory", "(Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;)V", "documentDetectorFactory", "", "K", "Ljava/util/Map;", "getDocumentMap", "()Ljava/util/Map;", "documentMap", "L", "getLastDetectionMode", "setLastDetectionMode", "lastDetectionMode", "M", "getFramesForPictureVeryCloseMultiplier", "framesForPictureVeryCloseMultiplier", "N", "getFramesForPictureMiddleDistanceMultiplier", "framesForPictureMiddleDistanceMultiplier", "O", "getFramesForPictureFarMultiplier", "framesForPictureFarMultiplier", "P", "getFramesForPictureExtremelyFarMultiplier", "framesForPictureExtremelyFarMultiplier", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "getFramesForPictureNotCenteredMultiplier", "framesForPictureNotCenteredMultiplier", "R", "getMinimumFaceFractionNormal", "minimumFaceFractionNormal", ExifInterface.LATITUDE_SOUTH, "getMinimumFaceFractionTight", "minimumFaceFractionTight", ExifInterface.GPS_DIRECTION_TRUE, "getTimeForPicture", "timeForPicture", "U", "getMaximumFaceDistanceToCenter", "setMaximumFaceDistanceToCenter", "maximumFaceDistanceToCenter", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getMinimumFaceFraction", "setMinimumFaceFraction", "minimumFaceFraction", ExifInterface.LONGITUDE_WEST, "getRelativeDistanceToCenter", "setRelativeDistanceToCenter", "relativeDistanceToCenter", "X", "getRectangleDetectionCycleCount", "rectangleDetectionCycleCount", "Y", "getRectangleDetectionSwitchLimit", "rectangleDetectionSwitchLimit", "getRequiredHitsMultiplier", "requiredHitsMultiplier", "a0", "getScaleInitialValue", "scaleInitialValue", "b0", "getScaleMax", "scaleMax", "c0", "getScaleMin", "scaleMin", "d0", "getScaleStep", "scaleStep", "e0", "getStuckHitLimit", "stuckHitLimit", "f0", "getCycle", "setCycle", "cycle", "g0", "getRectangleDetected", "setRectangleDetected", "rectangleDetected", "h0", "getScale", "setScale", ImageScaleTypeHandler.ID, "i0", "getEmptyFrameTime", "emptyFrameTime", "j0", "getEmptyFrameLimit", "setEmptyFrameLimit", "emptyFrameLimit", "<init>", "(Lcom/veridas/detect/sequence/score/Score;Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$AnalysisType;ZLcom/veridas/math/geometry/Rectangle;Lcom/veridas/detect/spatial/SpatialObjectDetector;Lcom/veridas/detect/spatial/SpatialDetectionResult;DZIIIZLjava/lang/String;ZZDDDLcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;Lcom/veridas/detect/Request;Lcom/veridas/detect/sequence/SequentialDetectionResult;Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;ZZIIDDDDLcom/veridas/detect/DetectionMode;ILjava/util/List;ILcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext$DocumentDetectorElement;Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;Ljava/util/Map;Lcom/veridas/detect/DetectionMode;DDDDDDDDDDDIIDDDDDIIIDDI)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class UniversalSequentialAnalysisContext implements SequentialAnalysisContext, DocumentSequentialAnalysisContext, IntelligentSequentialAnalysisContext, ImageFaceSequentialAnalysisContext, VideoFaceSequentialAnalysisContext {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final double captureTime;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public final double centeredTime;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public double captureMaxFrameCount;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public double centeredMaxFrameCount;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public DetectionMode detectionMode;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public int detectionModeIndex;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public List<String> documentIds;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public int documentIndex;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public DocumentSequentialAnalysisContext.DocumentDetectorElement documentDetectorElement;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    public SpatialObjectDetectorFactory documentDetectorFactory;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public final Map<String, DocumentSequentialAnalysisContext.DocumentDetectorElement> documentMap;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public DetectionMode lastDetectionMode;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public final double framesForPictureVeryCloseMultiplier;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public final double framesForPictureMiddleDistanceMultiplier;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public final double framesForPictureFarMultiplier;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public final double framesForPictureExtremelyFarMultiplier;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public final double framesForPictureNotCenteredMultiplier;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public final double minimumFaceFractionNormal;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public final double minimumFaceFractionTight;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public final double timeForPicture;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public double maximumFaceDistanceToCenter;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public double minimumFaceFraction;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public double relativeDistanceToCenter;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public final int rectangleDetectionCycleCount;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public final int rectangleDetectionSwitchLimit;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public final double requiredHitsMultiplier;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Score score;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    public final double scaleInitialValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public VDConstantDefinition.AnalysisType analysisType;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    public final double scaleMax;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean analyze;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    public final double scaleMin;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Rectangle bestDetectionResult;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    public final double scaleStep;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SpatialObjectDetector detector;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    public final int stuckHitLimit;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SpatialDetectionResult detectionResult;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    public int cycle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public double fps;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    public int rectangleDetected;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean initialized;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    public double scale;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int iteration;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public final double emptyFrameTime;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int lightBlobDetectionFrameCount;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public int emptyFrameLimit;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int lightBlobDetectionInterval;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean lightBlobDetected;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public String objectData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean objectDetected;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean objectLost;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public double progress;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public double progressMax;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public double progressThreshold;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public VDConstantDefinition.TemplateProximity proximity;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Request request;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SequentialDetectionResult result;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public VDConstantDefinition.TemplateProximity viewportProximity;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public boolean warmup;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public boolean warmupComplete;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public int warmupFrameCount;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public int warmupMaxFrameCount;

    public UniversalSequentialAnalysisContext(@NotNull Score score, @NotNull VDConstantDefinition.AnalysisType analysisType, boolean z10, @Nullable Rectangle rectangle, @Nullable SpatialObjectDetector spatialObjectDetector, @Nullable SpatialDetectionResult spatialDetectionResult, double d2, boolean z11, int i10, int i11, int i12, boolean z12, @NotNull String objectData, boolean z13, boolean z14, double d3, double d7, double d10, @NotNull VDConstantDefinition.TemplateProximity proximity, @Nullable Request request, @Nullable SequentialDetectionResult sequentialDetectionResult, @NotNull VDConstantDefinition.TemplateProximity viewportProximity, boolean z15, boolean z16, int i13, int i14, double d11, double d12, double d13, double d14, @NotNull DetectionMode detectionMode, int i15, @NotNull List<String> documentIds, int i16, @Nullable DocumentSequentialAnalysisContext.DocumentDetectorElement documentDetectorElement, @Nullable SpatialObjectDetectorFactory spatialObjectDetectorFactory, @NotNull Map<String, DocumentSequentialAnalysisContext.DocumentDetectorElement> documentMap, @NotNull DetectionMode lastDetectionMode, double d15, double d16, double d17, double d18, double d19, double d20, double d21, double d22, double d23, double d24, double d25, int i17, int i18, double d26, double d27, double d28, double d29, double d30, int i19, int i20, int i21, double d31, double d32, int i22) {
        Intrinsics.checkNotNullParameter(score, "score");
        Intrinsics.checkNotNullParameter(analysisType, "analysisType");
        Intrinsics.checkNotNullParameter(objectData, "objectData");
        Intrinsics.checkNotNullParameter(proximity, "proximity");
        Intrinsics.checkNotNullParameter(viewportProximity, "viewportProximity");
        Intrinsics.checkNotNullParameter(detectionMode, "detectionMode");
        Intrinsics.checkNotNullParameter(documentIds, "documentIds");
        Intrinsics.checkNotNullParameter(documentMap, "documentMap");
        Intrinsics.checkNotNullParameter(lastDetectionMode, "lastDetectionMode");
        this.score = score;
        this.analysisType = analysisType;
        this.analyze = z10;
        this.bestDetectionResult = rectangle;
        this.detector = spatialObjectDetector;
        this.detectionResult = spatialDetectionResult;
        this.fps = d2;
        this.initialized = z11;
        this.iteration = i10;
        this.lightBlobDetectionFrameCount = i11;
        this.lightBlobDetectionInterval = i12;
        this.lightBlobDetected = z12;
        this.objectData = objectData;
        this.objectDetected = z13;
        this.objectLost = z14;
        this.progress = d3;
        this.progressMax = d7;
        this.progressThreshold = d10;
        this.proximity = proximity;
        this.request = request;
        this.result = sequentialDetectionResult;
        this.viewportProximity = viewportProximity;
        this.warmup = z15;
        this.warmupComplete = z16;
        this.warmupFrameCount = i13;
        this.warmupMaxFrameCount = i14;
        this.captureTime = d11;
        this.centeredTime = d12;
        this.captureMaxFrameCount = d13;
        this.centeredMaxFrameCount = d14;
        this.detectionMode = detectionMode;
        this.detectionModeIndex = i15;
        this.documentIds = documentIds;
        this.documentIndex = i16;
        this.documentDetectorElement = documentDetectorElement;
        this.documentDetectorFactory = spatialObjectDetectorFactory;
        this.documentMap = documentMap;
        this.lastDetectionMode = lastDetectionMode;
        this.framesForPictureVeryCloseMultiplier = d15;
        this.framesForPictureMiddleDistanceMultiplier = d16;
        this.framesForPictureFarMultiplier = d17;
        this.framesForPictureExtremelyFarMultiplier = d18;
        this.framesForPictureNotCenteredMultiplier = d19;
        this.minimumFaceFractionNormal = d20;
        this.minimumFaceFractionTight = d21;
        this.timeForPicture = d22;
        this.maximumFaceDistanceToCenter = d23;
        this.minimumFaceFraction = d24;
        this.relativeDistanceToCenter = d25;
        this.rectangleDetectionCycleCount = i17;
        this.rectangleDetectionSwitchLimit = i18;
        this.requiredHitsMultiplier = d26;
        this.scaleInitialValue = d27;
        this.scaleMax = d28;
        this.scaleMin = d29;
        this.scaleStep = d30;
        this.stuckHitLimit = i19;
        this.cycle = i20;
        this.rectangleDetected = i21;
        this.scale = d31;
        this.emptyFrameTime = d32;
        this.emptyFrameLimit = i22;
        if (getLightBlobDetectionInterval() < 0) {
            throw new IllegalArgumentException("The brightnessDetectionInterval parameter must be equal to or larger then 0.".toString());
        }
        if (getWarmupMaxFrameCount() < 0) {
            throw new IllegalArgumentException("The warmupMaxFrameCount parameter must be equal to or larger then 0.".toString());
        }
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    @NotNull
    public <C extends SequentialAnalysisContext> C accept(@NotNull SequentialAnalysisContextVisitor<C> visitor) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type C of com.veridas.detect.sequence.context.UniversalSequentialAnalysisContext.accept");
        visitor.visit(this);
        return this;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    @NotNull
    public VDConstantDefinition.AnalysisType getAnalysisType() {
        return this.analysisType;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public boolean getAnalyze() {
        return this.analyze;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    @Nullable
    public Rectangle getBestDetectionResult() {
        return this.bestDetectionResult;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    public double getCaptureMaxFrameCount() {
        return this.captureMaxFrameCount;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    public double getCaptureTime() {
        return this.captureTime;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    public double getCenteredMaxFrameCount() {
        return this.centeredMaxFrameCount;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    public double getCenteredTime() {
        return this.centeredTime;
    }

    @Override // com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext
    public int getCycle() {
        return this.cycle;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    @NotNull
    public DetectionMode getDetectionMode() {
        return this.detectionMode;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    public int getDetectionModeIndex() {
        return this.detectionModeIndex;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    @Nullable
    public SpatialDetectionResult getDetectionResult() {
        return this.detectionResult;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    @Nullable
    public SpatialObjectDetector getDetector() {
        return this.detector;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    @Nullable
    public DocumentSequentialAnalysisContext.DocumentDetectorElement getDocumentDetectorElement() {
        return this.documentDetectorElement;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    @Nullable
    public SpatialObjectDetectorFactory getDocumentDetectorFactory() {
        return this.documentDetectorFactory;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    @NotNull
    public List<String> getDocumentIds() {
        return this.documentIds;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    public int getDocumentIndex() {
        return this.documentIndex;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    @NotNull
    public Map<String, DocumentSequentialAnalysisContext.DocumentDetectorElement> getDocumentMap() {
        return this.documentMap;
    }

    @Override // com.veridas.detect.sequence.context.VideoFaceSequentialAnalysisContext
    public int getEmptyFrameLimit() {
        return this.emptyFrameLimit;
    }

    @Override // com.veridas.detect.sequence.context.VideoFaceSequentialAnalysisContext
    public double getEmptyFrameTime() {
        return this.emptyFrameTime;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public double getFps() {
        return this.fps;
    }

    @Override // com.veridas.detect.sequence.context.ImageFaceSequentialAnalysisContext
    public double getFramesForPictureExtremelyFarMultiplier() {
        return this.framesForPictureExtremelyFarMultiplier;
    }

    @Override // com.veridas.detect.sequence.context.ImageFaceSequentialAnalysisContext
    public double getFramesForPictureFarMultiplier() {
        return this.framesForPictureFarMultiplier;
    }

    @Override // com.veridas.detect.sequence.context.ImageFaceSequentialAnalysisContext
    public double getFramesForPictureMiddleDistanceMultiplier() {
        return this.framesForPictureMiddleDistanceMultiplier;
    }

    @Override // com.veridas.detect.sequence.context.ImageFaceSequentialAnalysisContext
    public double getFramesForPictureNotCenteredMultiplier() {
        return this.framesForPictureNotCenteredMultiplier;
    }

    @Override // com.veridas.detect.sequence.context.ImageFaceSequentialAnalysisContext
    public double getFramesForPictureVeryCloseMultiplier() {
        return this.framesForPictureVeryCloseMultiplier;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public boolean getInitialized() {
        return this.initialized;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public int getIteration() {
        return this.iteration;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    @NotNull
    public DetectionMode getLastDetectionMode() {
        return this.lastDetectionMode;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public boolean getLightBlobDetected() {
        return this.lightBlobDetected;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public int getLightBlobDetectionFrameCount() {
        return this.lightBlobDetectionFrameCount;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public int getLightBlobDetectionInterval() {
        return this.lightBlobDetectionInterval;
    }

    @Override // com.veridas.detect.sequence.context.ImageFaceSequentialAnalysisContext
    public double getMaximumFaceDistanceToCenter() {
        return this.maximumFaceDistanceToCenter;
    }

    @Override // com.veridas.detect.sequence.context.ImageFaceSequentialAnalysisContext
    public double getMinimumFaceFraction() {
        return this.minimumFaceFraction;
    }

    @Override // com.veridas.detect.sequence.context.ImageFaceSequentialAnalysisContext
    public double getMinimumFaceFractionNormal() {
        return this.minimumFaceFractionNormal;
    }

    @Override // com.veridas.detect.sequence.context.ImageFaceSequentialAnalysisContext
    public double getMinimumFaceFractionTight() {
        return this.minimumFaceFractionTight;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    @NotNull
    public String getObjectData() {
        return this.objectData;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public boolean getObjectDetected() {
        return this.objectDetected;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public boolean getObjectLost() {
        return this.objectLost;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public double getProgress() {
        return this.progress;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public double getProgressMax() {
        return this.progressMax;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public double getProgressThreshold() {
        return this.progressThreshold;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    @NotNull
    public VDConstantDefinition.TemplateProximity getProximity() {
        return this.proximity;
    }

    @Override // com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext
    public int getRectangleDetected() {
        return this.rectangleDetected;
    }

    @Override // com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext
    public int getRectangleDetectionCycleCount() {
        return this.rectangleDetectionCycleCount;
    }

    @Override // com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext
    public int getRectangleDetectionSwitchLimit() {
        return this.rectangleDetectionSwitchLimit;
    }

    @Override // com.veridas.detect.sequence.context.ImageFaceSequentialAnalysisContext
    public double getRelativeDistanceToCenter() {
        return this.relativeDistanceToCenter;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    @Nullable
    public Request getRequest() {
        return this.request;
    }

    @Override // com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext
    public double getRequiredHitsMultiplier() {
        return this.requiredHitsMultiplier;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    @Nullable
    public SequentialDetectionResult getResult() {
        return this.result;
    }

    @Override // com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext
    public double getScale() {
        return this.scale;
    }

    @Override // com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext
    public double getScaleInitialValue() {
        return this.scaleInitialValue;
    }

    @Override // com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext
    public double getScaleMax() {
        return this.scaleMax;
    }

    @Override // com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext
    public double getScaleMin() {
        return this.scaleMin;
    }

    @Override // com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext
    public double getScaleStep() {
        return this.scaleStep;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    @NotNull
    public Score getScore() {
        return this.score;
    }

    @Override // com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext
    public int getStuckHitLimit() {
        return this.stuckHitLimit;
    }

    @Override // com.veridas.detect.sequence.context.ImageFaceSequentialAnalysisContext
    public double getTimeForPicture() {
        return this.timeForPicture;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    @NotNull
    public VDConstantDefinition.TemplateProximity getViewportProximity() {
        return this.viewportProximity;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public boolean getWarmup() {
        return this.warmup;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public boolean getWarmupComplete() {
        return this.warmupComplete;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public int getWarmupFrameCount() {
        return this.warmupFrameCount;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public int getWarmupMaxFrameCount() {
        return this.warmupMaxFrameCount;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public boolean hasHit() {
        Rectangle bestDetectionResult = getBestDetectionResult();
        if (bestDetectionResult != null) {
            return bestDetectionResult.isNotEmpty();
        }
        return false;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public boolean isWarmupActive() {
        return getWarmup() && getWarmupMaxFrameCount() > 0 && getWarmupFrameCount() <= getWarmupMaxFrameCount();
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public boolean isWarmupEndReached() {
        return !getWarmup() || getWarmupFrameCount() >= getWarmupMaxFrameCount();
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setAnalysisType(@NotNull VDConstantDefinition.AnalysisType analysisType) {
        Intrinsics.checkNotNullParameter(analysisType, "<set-?>");
        this.analysisType = analysisType;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setAnalyze(boolean z10) {
        this.analyze = z10;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setBestDetectionResult(@Nullable Rectangle rectangle) {
        this.bestDetectionResult = rectangle;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    public void setCaptureMaxFrameCount(double d2) {
        this.captureMaxFrameCount = d2;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    public void setCenteredMaxFrameCount(double d2) {
        this.centeredMaxFrameCount = d2;
    }

    @Override // com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext
    public void setCycle(int i10) {
        this.cycle = i10;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    public void setDetectionMode(@NotNull DetectionMode detectionMode) {
        Intrinsics.checkNotNullParameter(detectionMode, "<set-?>");
        this.detectionMode = detectionMode;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    public void setDetectionModeIndex(int i10) {
        this.detectionModeIndex = i10;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setDetectionResult(@Nullable SpatialDetectionResult spatialDetectionResult) {
        this.detectionResult = spatialDetectionResult;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setDetector(@Nullable SpatialObjectDetector spatialObjectDetector) {
        this.detector = spatialObjectDetector;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    public void setDocumentDetectorElement(@Nullable DocumentSequentialAnalysisContext.DocumentDetectorElement documentDetectorElement) {
        this.documentDetectorElement = documentDetectorElement;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    public void setDocumentDetectorFactory(@Nullable SpatialObjectDetectorFactory spatialObjectDetectorFactory) {
        this.documentDetectorFactory = spatialObjectDetectorFactory;
    }

    public void setDocumentIds(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.documentIds = list;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    public void setDocumentIndex(int i10) {
        this.documentIndex = i10;
    }

    @Override // com.veridas.detect.sequence.context.VideoFaceSequentialAnalysisContext
    public void setEmptyFrameLimit(int i10) {
        this.emptyFrameLimit = i10;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setFps(double d2) {
        this.fps = d2;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setInitialized(boolean z10) {
        this.initialized = z10;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setIteration(int i10) {
        this.iteration = i10;
    }

    @Override // com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext
    public void setLastDetectionMode(@NotNull DetectionMode detectionMode) {
        Intrinsics.checkNotNullParameter(detectionMode, "<set-?>");
        this.lastDetectionMode = detectionMode;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setLightBlobDetected(boolean z10) {
        this.lightBlobDetected = z10;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setLightBlobDetectionFrameCount(int i10) {
        this.lightBlobDetectionFrameCount = i10;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setLightBlobDetectionInterval(int i10) {
        this.lightBlobDetectionInterval = i10;
    }

    @Override // com.veridas.detect.sequence.context.ImageFaceSequentialAnalysisContext
    public void setMaximumFaceDistanceToCenter(double d2) {
        this.maximumFaceDistanceToCenter = d2;
    }

    @Override // com.veridas.detect.sequence.context.ImageFaceSequentialAnalysisContext
    public void setMinimumFaceFraction(double d2) {
        this.minimumFaceFraction = d2;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setObjectData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.objectData = str;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setObjectDetected(boolean z10) {
        this.objectDetected = z10;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setObjectLost(boolean z10) {
        this.objectLost = z10;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setProgress(double d2) {
        this.progress = d2;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setProgressMax(double d2) {
        this.progressMax = d2;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setProgressThreshold(double d2) {
        this.progressThreshold = d2;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setProximity(@NotNull VDConstantDefinition.TemplateProximity templateProximity) {
        Intrinsics.checkNotNullParameter(templateProximity, "<set-?>");
        this.proximity = templateProximity;
    }

    @Override // com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext
    public void setRectangleDetected(int i10) {
        this.rectangleDetected = i10;
    }

    @Override // com.veridas.detect.sequence.context.ImageFaceSequentialAnalysisContext
    public void setRelativeDistanceToCenter(double d2) {
        this.relativeDistanceToCenter = d2;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setRequest(@Nullable Request request) {
        this.request = request;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setResult(@Nullable SequentialDetectionResult sequentialDetectionResult) {
        this.result = sequentialDetectionResult;
    }

    @Override // com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext
    public void setScale(double d2) {
        this.scale = d2;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setViewportProximity(@NotNull VDConstantDefinition.TemplateProximity templateProximity) {
        Intrinsics.checkNotNullParameter(templateProximity, "<set-?>");
        this.viewportProximity = templateProximity;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setWarmup(boolean z10) {
        this.warmup = z10;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setWarmupComplete(boolean z10) {
        this.warmupComplete = z10;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setWarmupFrameCount(int i10) {
        this.warmupFrameCount = i10;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContext
    public void setWarmupMaxFrameCount(int i10) {
        this.warmupMaxFrameCount = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UniversalSequentialAnalysisContext(Score score, VDConstantDefinition.AnalysisType analysisType, boolean z10, Rectangle rectangle, SpatialObjectDetector spatialObjectDetector, SpatialDetectionResult spatialDetectionResult, double d2, boolean z11, int i10, int i11, int i12, boolean z12, String str, boolean z13, boolean z14, double d3, double d7, double d10, VDConstantDefinition.TemplateProximity templateProximity, Request request, SequentialDetectionResult sequentialDetectionResult, VDConstantDefinition.TemplateProximity templateProximity2, boolean z15, boolean z16, int i13, int i14, double d11, double d12, double d13, double d14, DetectionMode detectionMode, int i15, List list, int i16, DocumentSequentialAnalysisContext.DocumentDetectorElement documentDetectorElement, SpatialObjectDetectorFactory spatialObjectDetectorFactory, Map map, DetectionMode detectionMode2, double d15, double d16, double d17, double d18, double d19, double d20, double d21, double d22, double d23, double d24, double d25, int i17, int i18, double d26, double d27, double d28, double d29, double d30, int i19, int i20, int i21, double d31, double d32, int i22, int i23, int i24, DefaultConstructorMarker defaultConstructorMarker) {
        VDConstantDefinition.AnalysisType analysisType2 = (i23 & 2) != 0 ? VDConstantDefinition.AnalysisType.NONE : analysisType;
        boolean z17 = (i23 & 4) != 0 ? false : z10;
        Rectangle rectangle2 = (i23 & 8) != 0 ? null : rectangle;
        SpatialObjectDetector spatialObjectDetector2 = (i23 & 16) != 0 ? null : spatialObjectDetector;
        SpatialDetectionResult spatialDetectionResult2 = (i23 & 32) != 0 ? null : spatialDetectionResult;
        double d33 = (i23 & 64) != 0 ? 0.0d : d2;
        boolean z18 = (i23 & 128) != 0 ? false : z11;
        int i25 = (i23 & 256) != 0 ? 0 : i10;
        int i26 = (i23 & 512) != 0 ? 0 : i11;
        int i27 = (i23 & 1024) != 0 ? 0 : i12;
        boolean z19 = (i23 & 2048) != 0 ? false : z12;
        String str2 = (i23 & 4096) != 0 ? "" : str;
        boolean z20 = (i23 & 8192) != 0 ? false : z13;
        boolean z21 = (i23 & 16384) != 0 ? false : z14;
        double d34 = (i23 & 32768) != 0 ? 0.0d : d3;
        double d35 = (i23 & 65536) != 0 ? 0.0d : d7;
        double d36 = (i23 & 131072) != 0 ? 0.0d : d10;
        VDConstantDefinition.TemplateProximity templateProximity3 = (i23 & 262144) != 0 ? VDConstantDefinition.TemplateProximity.NOT_FOUND : templateProximity;
        Request request2 = (i23 & 524288) != 0 ? null : request;
        SequentialDetectionResult sequentialDetectionResult2 = (i23 & 1048576) != 0 ? null : sequentialDetectionResult;
        VDConstantDefinition.TemplateProximity templateProximity4 = (i23 & 2097152) != 0 ? VDConstantDefinition.TemplateProximity.NONE : templateProximity2;
        boolean z22 = (i23 & 4194304) != 0 ? false : z15;
        boolean z23 = (i23 & 8388608) != 0 ? false : z16;
        int i28 = (i23 & 16777216) != 0 ? 0 : i13;
        int i29 = (i23 & 33554432) != 0 ? 0 : i14;
        double d37 = (i23 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? 0.0d : d11;
        double d38 = (i23 & 134217728) != 0 ? 0.0d : d12;
        double d39 = (i23 & 268435456) != 0 ? 0.0d : d13;
        double d40 = (i23 & PKIFailureInfo.duplicateCertReq) != 0 ? 0.0d : d14;
        DetectionMode detectionMode3 = (i23 & 1073741824) != 0 ? DetectionMode.NONE : detectionMode;
        int i30 = (i23 & Integer.MIN_VALUE) != 0 ? 0 : i15;
        List arrayList = (i24 & 1) != 0 ? new ArrayList() : list;
        int i31 = (i24 & 2) != 0 ? 0 : i16;
        DocumentSequentialAnalysisContext.DocumentDetectorElement documentDetectorElement2 = (i24 & 4) != 0 ? null : documentDetectorElement;
        SpatialObjectDetectorFactory spatialObjectDetectorFactory2 = (i24 & 8) != 0 ? null : spatialObjectDetectorFactory;
        Map linkedHashMap = (i24 & 16) != 0 ? new LinkedHashMap() : map;
        DetectionMode detectionMode4 = (i24 & 32) != 0 ? DetectionMode.NONE : detectionMode2;
        double d41 = (i24 & 64) != 0 ? 0.0d : d15;
        int i32 = i30;
        double d42 = (i24 & 128) != 0 ? 0.0d : d16;
        double d43 = (i24 & 256) != 0 ? 0.0d : d17;
        double d44 = (i24 & 512) != 0 ? 0.0d : d18;
        double d45 = (i24 & 1024) != 0 ? 0.0d : d19;
        double d46 = (i24 & 2048) != 0 ? 0.0d : d20;
        double d47 = (i24 & 4096) != 0 ? 0.0d : d21;
        double d48 = (i24 & 8192) != 0 ? 0.0d : d22;
        double d49 = (i24 & 16384) != 0 ? 0.0d : d23;
        double d50 = (i24 & 32768) != 0 ? 0.0d : d24;
        double d51 = (i24 & 65536) != 0 ? 0.0d : d25;
        int i33 = (i24 & 131072) != 0 ? 0 : i17;
        int i34 = (i24 & 262144) != 0 ? 0 : i18;
        double d52 = (i24 & 524288) != 0 ? 1.0d : d26;
        double d53 = (i24 & 1048576) != 0 ? 0.0d : d27;
        this(score, analysisType2, z17, rectangle2, spatialObjectDetector2, spatialDetectionResult2, d33, z18, i25, i26, i27, z19, str2, z20, z21, d34, d35, d36, templateProximity3, request2, sequentialDetectionResult2, templateProximity4, z22, z23, i28, i29, d37, d38, d39, d40, detectionMode3, i32, arrayList, i31, documentDetectorElement2, spatialObjectDetectorFactory2, linkedHashMap, detectionMode4, d41, d42, d43, d44, d45, d46, d47, d48, d49, d50, d51, i33, i34, d52, d53, (i24 & 2097152) != 0 ? 0.0d : d28, (i24 & 4194304) != 0 ? 0.0d : d29, (i24 & 8388608) != 0 ? 0.0d : d30, (i24 & 16777216) != 0 ? 0 : i19, (i24 & 33554432) != 0 ? 0 : i20, (i24 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? 0 : i21, (i24 & 134217728) != 0 ? d53 : d31, (i24 & 268435456) != 0 ? 0.0d : d32, (i24 & PKIFailureInfo.duplicateCertReq) != 0 ? 0 : i22);
    }
}
