package com.viergegroup.sdk.taptophone.vierge.models;

import com.bbva.ocrcard.utils.ConstantsKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import com.noknok.android.passportsdksvc.PassportSDKIntentActivity;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.util.EglobalUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bq\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010!\n\u0002\b_\n\u0002\u0010%\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0003\b\u0092\u0001\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010Ø\u0004\u001a\u00030\u009e\u0002J\u0010\u0010Ù\u0004\u001a\u00020\u00042\u0007\u0010Ú\u0004\u001a\u00020\u0004J\u001a\u0010Û\u0004\u001a\u00030Ü\u00042\u0007\u0010Ú\u0004\u001a\u00020\u00042\u0007\u0010Ý\u0004\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001a\u0010<\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001a\u0010E\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001a\u0010H\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001a\u0010K\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001a\u0010N\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001a\u0010Q\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR\u001a\u0010T\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001a\u0010W\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR\u001a\u0010Z\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\bR\u001a\u0010]\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0006\"\u0004\b_\u0010\bR\u001a\u0010`\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010\bR\u001a\u0010c\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0006\"\u0004\be\u0010\bR\u001a\u0010f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR\u001a\u0010i\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR\u001a\u0010l\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0006\"\u0004\bn\u0010\bR\u001a\u0010o\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0006\"\u0004\bq\u0010\bR\u001a\u0010r\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0006\"\u0004\bt\u0010\bR\u001a\u0010u\u001a\u00020vX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001a\u0010{\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010\u0006\"\u0004\b}\u0010\bR\u001b\u0010~\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010\u0006\"\u0005\b\u0080\u0001\u0010\bR\u001d\u0010\u0081\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u0006\"\u0005\b\u0083\u0001\u0010\bR\u001d\u0010\u0084\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010\u0006\"\u0005\b\u0086\u0001\u0010\bR\u001d\u0010\u0087\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010\u0006\"\u0005\b\u0089\u0001\u0010\bR\u001d\u0010\u008a\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010\u0006\"\u0005\b\u008c\u0001\u0010\bR\u001d\u0010\u008d\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010\u0006\"\u0005\b\u008f\u0001\u0010\bR&\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040\u0091\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001d\u0010\u0096\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010\u0006\"\u0005\b\u0098\u0001\u0010\bR\u001d\u0010\u0099\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010\u0006\"\u0005\b\u009b\u0001\u0010\bR\u001d\u0010\u009c\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010\u0006\"\u0005\b\u009e\u0001\u0010\bR\u001d\u0010\u009f\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b \u0001\u0010\u0006\"\u0005\b¡\u0001\u0010\bR&\u0010¢\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040\u0091\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b£\u0001\u0010\u0093\u0001\"\u0006\b¤\u0001\u0010\u0095\u0001R\u001d\u0010¥\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¦\u0001\u0010\u0006\"\u0005\b§\u0001\u0010\bR\u001d\u0010¨\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b©\u0001\u0010\u0006\"\u0005\bª\u0001\u0010\bR\u001d\u0010«\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¬\u0001\u0010\u0006\"\u0005\b\u00ad\u0001\u0010\bR\u001d\u0010®\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0001\u0010\u0006\"\u0005\b°\u0001\u0010\bR\u001d\u0010±\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0001\u0010\u0006\"\u0005\b³\u0001\u0010\bR\u001d\u0010´\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bµ\u0001\u0010\u0006\"\u0005\b¶\u0001\u0010\bR\u001d\u0010·\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¸\u0001\u0010\u0006\"\u0005\b¹\u0001\u0010\bR\u001d\u0010º\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b»\u0001\u0010\u0006\"\u0005\b¼\u0001\u0010\bR\u001d\u0010½\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¾\u0001\u0010\u0006\"\u0005\b¿\u0001\u0010\bR\u001d\u0010À\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÁ\u0001\u0010\u0006\"\u0005\bÂ\u0001\u0010\bR\u001d\u0010Ã\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÄ\u0001\u0010\u0006\"\u0005\bÅ\u0001\u0010\bR\u001d\u0010Æ\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÇ\u0001\u0010\u0006\"\u0005\bÈ\u0001\u0010\bR\u001d\u0010É\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÊ\u0001\u0010\u0006\"\u0005\bË\u0001\u0010\bR\u001d\u0010Ì\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÍ\u0001\u0010\u0006\"\u0005\bÎ\u0001\u0010\bR\u001d\u0010Ï\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÐ\u0001\u0010\u0006\"\u0005\bÑ\u0001\u0010\bR\u001d\u0010Ò\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÓ\u0001\u0010\u0006\"\u0005\bÔ\u0001\u0010\bR\u001d\u0010Õ\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÖ\u0001\u0010\u0006\"\u0005\b×\u0001\u0010\bR\u001d\u0010Ø\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÙ\u0001\u0010\u0006\"\u0005\bÚ\u0001\u0010\bR\u001d\u0010Û\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÜ\u0001\u0010\u0006\"\u0005\bÝ\u0001\u0010\bR\u001d\u0010Þ\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bß\u0001\u0010\u0006\"\u0005\bà\u0001\u0010\bR\u001d\u0010á\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bâ\u0001\u0010\u0006\"\u0005\bã\u0001\u0010\bR\u001d\u0010ä\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bå\u0001\u0010\u0006\"\u0005\bæ\u0001\u0010\bR\u001d\u0010ç\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bè\u0001\u0010\u0006\"\u0005\bé\u0001\u0010\bR\u001d\u0010ê\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bë\u0001\u0010\u0006\"\u0005\bì\u0001\u0010\bR\u001d\u0010í\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bî\u0001\u0010\u0006\"\u0005\bï\u0001\u0010\bR,\u0010ð\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040ñ\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bò\u0001\u0010ó\u0001\"\u0006\bô\u0001\u0010õ\u0001R\u001d\u0010ö\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b÷\u0001\u0010\u0006\"\u0005\bø\u0001\u0010\bR\u001d\u0010ù\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bú\u0001\u0010\u0006\"\u0005\bû\u0001\u0010\bR\u001d\u0010ü\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bý\u0001\u0010\u0006\"\u0005\bþ\u0001\u0010\bR\u001d\u0010ÿ\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0002\u0010\u0006\"\u0005\b\u0081\u0002\u0010\bR \u0010\u0082\u0002\u001a\u00030\u0083\u0002X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R\u001d\u0010\u0088\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0002\u0010\u0006\"\u0005\b\u008a\u0002\u0010\bR\u001d\u0010\u008b\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0002\u0010\u0006\"\u0005\b\u008d\u0002\u0010\bR\u001d\u0010\u008e\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0002\u0010\u0006\"\u0005\b\u0090\u0002\u0010\bR\u001d\u0010\u0091\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0002\u0010\u0006\"\u0005\b\u0093\u0002\u0010\bR\u001d\u0010\u0094\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0002\u0010\u0006\"\u0005\b\u0096\u0002\u0010\bR\u001d\u0010\u0097\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0002\u0010\u0006\"\u0005\b\u0099\u0002\u0010\bR\u001d\u0010\u009a\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0002\u0010\u0006\"\u0005\b\u009c\u0002\u0010\bR \u0010\u009d\u0002\u001a\u00030\u009e\u0002X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009f\u0002\u0010 \u0002\"\u0006\b¡\u0002\u0010¢\u0002R \u0010£\u0002\u001a\u00030¤\u0002X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¥\u0002\u0010¦\u0002\"\u0006\b§\u0002\u0010¨\u0002R\u001d\u0010©\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bª\u0002\u0010\u0006\"\u0005\b«\u0002\u0010\bR\u001d\u0010¬\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0002\u0010\u0006\"\u0005\b®\u0002\u0010\bR\u001d\u0010¯\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b°\u0002\u0010\u0006\"\u0005\b±\u0002\u0010\bR\u001d\u0010²\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b³\u0002\u0010\u0006\"\u0005\b´\u0002\u0010\bR\u001d\u0010µ\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¶\u0002\u0010\u0006\"\u0005\b·\u0002\u0010\bR\u001d\u0010¸\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¹\u0002\u0010\u0006\"\u0005\bº\u0002\u0010\bR\u001d\u0010»\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¼\u0002\u0010\u0006\"\u0005\b½\u0002\u0010\bR\u001d\u0010¾\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¿\u0002\u0010\u0006\"\u0005\bÀ\u0002\u0010\bR\u001d\u0010Á\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÂ\u0002\u0010\u0006\"\u0005\bÃ\u0002\u0010\bR\u001d\u0010Ä\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÅ\u0002\u0010\u0006\"\u0005\bÆ\u0002\u0010\bR\u001d\u0010Ç\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÈ\u0002\u0010\u0006\"\u0005\bÉ\u0002\u0010\bR\u001d\u0010Ê\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bË\u0002\u0010\u0006\"\u0005\bÌ\u0002\u0010\bR\u001d\u0010Í\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÎ\u0002\u0010\u0006\"\u0005\bÏ\u0002\u0010\bR\u001d\u0010Ð\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÑ\u0002\u0010\u0006\"\u0005\bÒ\u0002\u0010\bR\u001d\u0010Ó\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÔ\u0002\u0010\u0006\"\u0005\bÕ\u0002\u0010\bR\u001d\u0010Ö\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b×\u0002\u0010\u0006\"\u0005\bØ\u0002\u0010\bR\u001d\u0010Ù\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÚ\u0002\u0010\u0006\"\u0005\bÛ\u0002\u0010\bR\u001d\u0010Ü\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÝ\u0002\u0010\u0006\"\u0005\bÞ\u0002\u0010\bR\u001d\u0010ß\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bà\u0002\u0010\u0006\"\u0005\bá\u0002\u0010\bR\u001d\u0010â\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bã\u0002\u0010\u0006\"\u0005\bä\u0002\u0010\bR\u001d\u0010å\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bæ\u0002\u0010\u0006\"\u0005\bç\u0002\u0010\bR \u0010è\u0002\u001a\u00030é\u0002X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bê\u0002\u0010ë\u0002\"\u0006\bì\u0002\u0010í\u0002R\u001d\u0010î\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bï\u0002\u0010\u0006\"\u0005\bð\u0002\u0010\bR\u001d\u0010ñ\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bò\u0002\u0010\u0006\"\u0005\bó\u0002\u0010\bR\u001d\u0010ô\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bõ\u0002\u0010\u0006\"\u0005\bö\u0002\u0010\bR\u001d\u0010÷\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bø\u0002\u0010\u0006\"\u0005\bù\u0002\u0010\bR\u001d\u0010ú\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bû\u0002\u0010\u0006\"\u0005\bü\u0002\u0010\bR\u001d\u0010ý\u0002\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bþ\u0002\u0010\u0006\"\u0005\bÿ\u0002\u0010\bR\u001d\u0010\u0080\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0003\u0010\u0006\"\u0005\b\u0082\u0003\u0010\bR\u001d\u0010\u0083\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0003\u0010\u0006\"\u0005\b\u0085\u0003\u0010\bR\u001d\u0010\u0086\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0003\u0010\u0006\"\u0005\b\u0088\u0003\u0010\bR \u0010\u0089\u0003\u001a\u00030\u008a\u0003X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008b\u0003\u0010\u008c\u0003\"\u0006\b\u008d\u0003\u0010\u008e\u0003R\u001d\u0010\u008f\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0003\u0010\u0006\"\u0005\b\u0091\u0003\u0010\bR\u001d\u0010\u0092\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0003\u0010\u0006\"\u0005\b\u0094\u0003\u0010\bR\u001d\u0010\u0095\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0003\u0010\u0006\"\u0005\b\u0097\u0003\u0010\bR \u0010\u0098\u0003\u001a\u00030\u0099\u0003X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009a\u0003\u0010\u009b\u0003\"\u0006\b\u009c\u0003\u0010\u009d\u0003R\u001d\u0010\u009e\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0003\u0010\u0006\"\u0005\b \u0003\u0010\bR\u001d\u0010¡\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0003\u0010\u0006\"\u0005\b£\u0003\u0010\bR\u001d\u0010¤\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¥\u0003\u0010\u0006\"\u0005\b¦\u0003\u0010\bR\u001d\u0010§\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0003\u0010\u0006\"\u0005\b©\u0003\u0010\bR\u001d\u0010ª\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b«\u0003\u0010\u0006\"\u0005\b¬\u0003\u0010\bR\u001d\u0010\u00ad\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b®\u0003\u0010\u0006\"\u0005\b¯\u0003\u0010\bR\u001d\u0010°\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b±\u0003\u0010\u0006\"\u0005\b²\u0003\u0010\bR\u001d\u0010³\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b´\u0003\u0010\u0006\"\u0005\bµ\u0003\u0010\bR\u001d\u0010¶\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b·\u0003\u0010\u0006\"\u0005\b¸\u0003\u0010\bR\u001d\u0010¹\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bº\u0003\u0010\u0006\"\u0005\b»\u0003\u0010\bR\u001d\u0010¼\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b½\u0003\u0010\u0006\"\u0005\b¾\u0003\u0010\bR\u001d\u0010¿\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÀ\u0003\u0010\u0006\"\u0005\bÁ\u0003\u0010\bR\u001d\u0010Â\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÃ\u0003\u0010\u0006\"\u0005\bÄ\u0003\u0010\bR\u001d\u0010Å\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÆ\u0003\u0010\u0006\"\u0005\bÇ\u0003\u0010\bR\u001d\u0010È\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÉ\u0003\u0010\u0006\"\u0005\bÊ\u0003\u0010\bR\u001d\u0010Ë\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÌ\u0003\u0010\u0006\"\u0005\bÍ\u0003\u0010\bR\u001d\u0010Î\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÏ\u0003\u0010\u0006\"\u0005\bÐ\u0003\u0010\bR\u001d\u0010Ñ\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÒ\u0003\u0010\u0006\"\u0005\bÓ\u0003\u0010\bR\u001d\u0010Ô\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÕ\u0003\u0010\u0006\"\u0005\bÖ\u0003\u0010\bR\u001d\u0010×\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bØ\u0003\u0010\u0006\"\u0005\bÙ\u0003\u0010\bR\u001d\u0010Ú\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÛ\u0003\u0010\u0006\"\u0005\bÜ\u0003\u0010\bR\u001d\u0010Ý\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÞ\u0003\u0010\u0006\"\u0005\bß\u0003\u0010\bR\u001d\u0010à\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bá\u0003\u0010\u0006\"\u0005\bâ\u0003\u0010\bR\u001d\u0010ã\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bä\u0003\u0010\u0006\"\u0005\bå\u0003\u0010\bR\u001d\u0010æ\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bç\u0003\u0010\u0006\"\u0005\bè\u0003\u0010\bR\u001d\u0010é\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bê\u0003\u0010\u0006\"\u0005\bë\u0003\u0010\bR\u001d\u0010ì\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bí\u0003\u0010\u0006\"\u0005\bî\u0003\u0010\bR\u001d\u0010ï\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bð\u0003\u0010\u0006\"\u0005\bñ\u0003\u0010\bR\u001d\u0010ò\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bó\u0003\u0010\u0006\"\u0005\bô\u0003\u0010\bR\u001d\u0010õ\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bö\u0003\u0010\u0006\"\u0005\b÷\u0003\u0010\bR\u001d\u0010ø\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bù\u0003\u0010\u0006\"\u0005\bú\u0003\u0010\bR\u001d\u0010û\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bü\u0003\u0010\u0006\"\u0005\bý\u0003\u0010\bR\u001d\u0010þ\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÿ\u0003\u0010\u0006\"\u0005\b\u0080\u0004\u0010\bR\u001d\u0010\u0081\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0004\u0010\u0006\"\u0005\b\u0083\u0004\u0010\bR\u001d\u0010\u0084\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0004\u0010\u0006\"\u0005\b\u0086\u0004\u0010\bR\u001d\u0010\u0087\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0004\u0010\u0006\"\u0005\b\u0089\u0004\u0010\bR\u001d\u0010\u008a\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0004\u0010\u0006\"\u0005\b\u008c\u0004\u0010\bR\u001d\u0010\u008d\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0004\u0010\u0006\"\u0005\b\u008f\u0004\u0010\bR\u001d\u0010\u0090\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0004\u0010\u0006\"\u0005\b\u0092\u0004\u0010\bR\u001d\u0010\u0093\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0004\u0010\u0006\"\u0005\b\u0095\u0004\u0010\bR\u001d\u0010\u0096\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0004\u0010\u0006\"\u0005\b\u0098\u0004\u0010\bR\u001d\u0010\u0099\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0004\u0010\u0006\"\u0005\b\u009b\u0004\u0010\bR\u001d\u0010\u009c\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0004\u0010\u0006\"\u0005\b\u009e\u0004\u0010\bR\u001d\u0010\u009f\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b \u0004\u0010\u0006\"\u0005\b¡\u0004\u0010\bR\u001d\u0010¢\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b£\u0004\u0010\u0006\"\u0005\b¤\u0004\u0010\bR\u001d\u0010¥\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¦\u0004\u0010\u0006\"\u0005\b§\u0004\u0010\bR\u001d\u0010¨\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b©\u0004\u0010\u0006\"\u0005\bª\u0004\u0010\bR \u0010«\u0004\u001a\u00030¬\u0004X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u00ad\u0004\u0010®\u0004\"\u0006\b¯\u0004\u0010°\u0004R\u001d\u0010±\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0004\u0010\u0006\"\u0005\b³\u0004\u0010\bR\u001d\u0010´\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bµ\u0004\u0010\u0006\"\u0005\b¶\u0004\u0010\bR\u001d\u0010·\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¸\u0004\u0010\u0006\"\u0005\b¹\u0004\u0010\bR\u001d\u0010º\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b»\u0004\u0010\u0006\"\u0005\b¼\u0004\u0010\bR\u001d\u0010½\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¾\u0004\u0010\u0006\"\u0005\b¿\u0004\u0010\bR\u001d\u0010À\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÁ\u0004\u0010\u0006\"\u0005\bÂ\u0004\u0010\bR\u001d\u0010Ã\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÄ\u0004\u0010\u0006\"\u0005\bÅ\u0004\u0010\bR\u001d\u0010Æ\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÇ\u0004\u0010\u0006\"\u0005\bÈ\u0004\u0010\bR\u001d\u0010É\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÊ\u0004\u0010\u0006\"\u0005\bË\u0004\u0010\bR\u001d\u0010Ì\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÍ\u0004\u0010\u0006\"\u0005\bÎ\u0004\u0010\bR\u001d\u0010Ï\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÐ\u0004\u0010\u0006\"\u0005\bÑ\u0004\u0010\bR\u001d\u0010Ò\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÓ\u0004\u0010\u0006\"\u0005\bÔ\u0004\u0010\bR\u001d\u0010Õ\u0004\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÖ\u0004\u0010\u0006\"\u0005\b×\u0004\u0010\b¨\u0006Þ\u0004"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionResponseOpenPay;", "", "()V", "accessMediumIdentifier", "", "getAccessMediumIdentifier", "()Ljava/lang/String;", "setAccessMediumIdentifier", "(Ljava/lang/String;)V", "accountId", "getAccountId", "setAccountId", "acquiringInstitutionIdentificationCode", "getAcquiringInstitutionIdentificationCode", "setAcquiringInstitutionIdentificationCode", "additionalAmounts", "getAdditionalAmounts", "setAdditionalAmounts", PassportSDKIntentActivity.ADDITIONAL_DATA, "getAdditionalData", "setAdditionalData", "additionalErrorFlagRequestInTransaction", "getAdditionalErrorFlagRequestInTransaction", "setAdditionalErrorFlagRequestInTransaction", "additionalInfoIndicatorC0", "getAdditionalInfoIndicatorC0", "setAdditionalInfoIndicatorC0", "additionalResponseDate", "getAdditionalResponseDate", "setAdditionalResponseDate", "addlData", "getAddlData", "setAddlData", "aip", "getAip", "setAip", "applPanSeqNum", "getApplPanSeqNum", "setApplPanSeqNum", "applicationVersionNumber", "getApplicationVersionNumber", "setApplicationVersionNumber", "arpc", "getArpc", "setArpc", "arqc", "getArqc", "setArqc", "arqcVerify", "getArqcVerify", "setArqcVerify", SqlContracts.BulletEntry.ATC, "getAtc", "setAtc", "atcCZ", "getAtcCZ", "setAtcCZ", "attendedTerminal", "getAttendedTerminal", "setAttendedTerminal", "authenticationCollectorIndicator", "getAuthenticationCollectorIndicator", "setAuthenticationCollectorIndicator", "authorizationIdResponse", "getAuthorizationIdResponse", "setAuthorizationIdResponse", "authorizationIndicators", "getAuthorizationIndicators", "setAuthorizationIndicators", "authorizationModeIdentifier", "getAuthorizationModeIdentifier", "setAuthorizationModeIdentifier", "binsTableVersion", "getBinsTableVersion", "setBinsTableVersion", "binsUpdateFlag", "getBinsUpdateFlag", "setBinsUpdateFlag", "bitmapB2", "getBitmapB2", "setBitmapB2", "bitmapB3", "getBitmapB3", "setBitmapB3", "captureDate", "getCaptureDate", "setCaptureDate", "cardAcceptorIdCode", "getCardAcceptorIdCode", "setCardAcceptorIdCode", "cardAcceptorNameAndLocation", "getCardAcceptorNameAndLocation", "setCardAcceptorNameAndLocation", "cardAcceptorTerminalId", "getCardAcceptorTerminalId", "setCardAcceptorTerminalId", "cardBin", "getCardBin", "setCardBin", "cardCaptureCapacityIndicator", "getCardCaptureCapacityIndicator", "setCardCaptureCapacityIndicator", "cardExpirationDate", "getCardExpirationDate", "setCardExpirationDate", "cardIssuerCategoryResponseCodeData", "getCardIssuerCategoryResponseCodeData", "setCardIssuerCategoryResponseCodeData", "cardIssuerCode", "getCardIssuerCode", "setCardIssuerCode", ConstantsKt.CARD_NUMBER, "getCardNumber", "setCardNumber", "cardPresenceIndicator", "getCardPresenceIndicator", "setCardPresenceIndicator", ConstantsKt.CARD_TYPE, "Lcom/viergegroup/sdk/taptophone/vierge/models/CardType;", "getCardType", "()Lcom/viergegroup/sdk/taptophone/vierge/models/CardType;", "setCardType", "(Lcom/viergegroup/sdk/taptophone/vierge/models/CardType;)V", "cardVerificationFlag", "getCardVerificationFlag", "setCardVerificationFlag", "cardholderAuthenticationData", "getCardholderAuthenticationData", "setCardholderAuthenticationData", "cardholderPresenceIndicator", "getCardholderPresenceIndicator", "setCardholderPresenceIndicator", "cavvAvvValidationResult", "getCavvAvvValidationResult", "setCavvAvvValidationResult", "cavvCardholderAuthVerValue", "getCavvCardholderAuthVerValue", "setCavvCardholderAuthVerValue", "checkValueEW", "getCheckValueEW", "setCheckValueEW", "checkValueEX", "getCheckValueEX", "setCheckValueEX", "chipherDataBlocks", "", "getChipherDataBlocks", "()Ljava/util/List;", "setChipherDataBlocks", "(Ljava/util/List;)V", "cipherConfiguration", "getCipherConfiguration", "setCipherConfiguration", "cipherCounter", "getCipherCounter", "setCipherCounter", "cipherData", "getCipherData", "setCipherData", "cityExension", "getCityExension", "setCityExension", "clearCipherBlocks", "getClearCipherBlocks", "setClearCipherBlocks", "clearCipherDataEZ", "getClearCipherDataEZ", "setClearCipherDataEZ", "clearCvvLength", "getClearCvvLength", "setClearCvvLength", "clearTrack2", "getClearTrack2", "setClearTrack2", "commercialReferences", "getCommercialReferences", "setCommercialReferences", "completeTrack2Data", "getCompleteTrack2Data", "setCompleteTrack2Data", "counterOfRebroadcastTxn", "getCounterOfRebroadcastTxn", "setCounterOfRebroadcastTxn", "crc32EW", "getCrc32EW", "setCrc32EW", "crc32EX", "getCrc32EX", "setCrc32EX", "crc32EZ", "getCrc32EZ", "setCrc32EZ", "criptoInfoData", "getCriptoInfoData", "setCriptoInfoData", "cv2PresentIndicator", "getCv2PresentIndicator", "setCv2PresentIndicator", "cvmResults", "getCvmResults", "setCvmResults", ConstantsKt.CVV, "getCvv", "setCvv", "cvv2cvc2Result", "getCvv2cvc2Result", "setCvv2cvc2Result", "cvvFlag", "getCvvFlag", "setCvvFlag", "dataElements", "getDataElements", "setDataElements", "dataSuspect", "getDataSuspect", "setDataSuspect", "deferral", "getDeferral", "setDeferral", "devInfo", "getDevInfo", "setDevInfo", "dfName", "getDfName", "setDfName", "dfNameLength", "getDfNameLength", "setDfNameLength", "eCommerceIndicator", "getECommerceIndicator", "setECommerceIndicator", "emvData", "getEmvData", "setEmvData", "emvIssAuthData", "getEmvIssAuthData", "setEmvIssAuthData", "emvLocalTransactionDate", "getEmvLocalTransactionDate", "setEmvLocalTransactionDate", "emvTagsMap", "", "getEmvTagsMap", "()Ljava/util/Map;", "setEmvTagsMap", "(Ljava/util/Map;)V", "emvTermSerialNumber", "getEmvTermSerialNumber", "setEmvTermSerialNumber", "emvTerminalCapabilities", "getEmvTerminalCapabilities", "setEmvTerminalCapabilities", "emvTerminalType", "getEmvTerminalType", "setEmvTerminalType", "emvTransactionType", "getEmvTransactionType", "setEmvTransactionType", "errorCode", "", "getErrorCode", "()I", "setErrorCode", "(I)V", "errorMessage", "getErrorMessage", "setErrorMessage", "failCipherCounter", "getFailCipherCounter", "setFailCipherCounter", "fileFlagUses", "getFileFlagUses", "setFileFlagUses", "fillerC4", "getFillerC4", "setFillerC4", "flagRequestNewKey", "getFlagRequestNewKey", "setFlagRequestNewKey", "flagTrack2", "getFlagTrack2", "setFlagTrack2", "formFactrInd", "getFormFactrInd", "setFormFactrInd", "hasChip", "", "getHasChip", "()Z", "setHasChip", "(Z)V", "hostType", "Lcom/viergegroup/sdk/taptophone/vierge/models/HostType;", "getHostType", "()Lcom/viergegroup/sdk/taptophone/vierge/models/HostType;", "setHostType", "(Lcom/viergegroup/sdk/taptophone/vierge/models/HostType;)V", "identificationMethodCardHolder", "getIdentificationMethodCardHolder", "setIdentificationMethodCardHolder", "indicatorCE", "getIndicatorCE", "setIndicatorCE", "isoASCII", "getIsoASCII", "setIsoASCII", "isoRCIndicator", "getIsoRCIndicator", "setIsoRCIndicator", "issApplData", "getIssApplData", "setIssApplData", "issApplDataLength", "getIssApplDataLength", "setIssApplDataLength", "issAuthData", "getIssAuthData", "setIssAuthData", "issAuthDataLength", "getIssAuthDataLength", "setIssAuthDataLength", "issScriptData", "getIssScriptData", "setIssScriptData", "issScriptDataLength", "getIssScriptDataLength", "setIssScriptDataLength", "keySerialNumber", "getKeySerialNumber", "setKeySerialNumber", "keyUpdateFlag", "getKeyUpdateFlag", "setKeyUpdateFlag", "ksnEX", "getKsnEX", "setKsnEX", "lastEmvStat", "getLastEmvStat", "setLastEmvStat", "lastPan4Digits", "getLastPan4Digits", "setLastPan4Digits", "localBinsTableIdPrimary", "getLocalBinsTableIdPrimary", "setLocalBinsTableIdPrimary", "localBinsTableIdSecondary", "getLocalBinsTableIdSecondary", "setLocalBinsTableIdSecondary", "localTransactionDate", "getLocalTransactionDate", "setLocalTransactionDate", "localTransactionTime", "getLocalTransactionTime", "setLocalTransactionTime", "merchantCurrencyCode", "getMerchantCurrencyCode", "setMerchantCurrencyCode", "merchantPostalCode", "getMerchantPostalCode", "setMerchantPostalCode", "merchantType", "Lcom/viergegroup/sdk/taptophone/vierge/models/MerchantType;", "getMerchantType", "()Lcom/viergegroup/sdk/taptophone/vierge/models/MerchantType;", "setMerchantType", "(Lcom/viergegroup/sdk/taptophone/vierge/models/MerchantType;)V", "merchantTypeCode", "getMerchantTypeCode", "setMerchantTypeCode", "messageType", "getMessageType", "setMessageType", "networkManagmentInformationCode", "getNetworkManagmentInformationCode", "setNetworkManagmentInformationCode", "newKeyRequestStatusEX", "getNewKeyRequestStatusEX", "setNewKeyRequestStatusEX", "numberOfPayments", "getNumberOfPayments", "setNumberOfPayments", "originalDataElements", "getOriginalDataElements", "setOriginalDataElements", "originalRrn", "getOriginalRrn", "setOriginalRrn", "otherAmount", "getOtherAmount", "setOtherAmount", "paymentPlanCode", "getPaymentPlanCode", "setPaymentPlanCode", "paymentPlanType", "Lcom/viergegroup/sdk/taptophone/vierge/models/PaymentPlanType;", "getPaymentPlanType", "()Lcom/viergegroup/sdk/taptophone/vierge/models/PaymentPlanType;", "setPaymentPlanType", "(Lcom/viergegroup/sdk/taptophone/vierge/models/PaymentPlanType;)V", "paymentQ6Data", "getPaymentQ6Data", "setPaymentQ6Data", "pekEX", "getPekEX", "setPekEX", "pointOfServiceConditionCode", "getPointOfServiceConditionCode", "setPointOfServiceConditionCode", "pointOfServiceEntryMode", "Lcom/viergegroup/sdk/taptophone/vierge/models/PointOfServiceEntryMode;", "getPointOfServiceEntryMode", "()Lcom/viergegroup/sdk/taptophone/vierge/models/PointOfServiceEntryMode;", "setPointOfServiceEntryMode", "(Lcom/viergegroup/sdk/taptophone/vierge/models/PointOfServiceEntryMode;)V", "pointOfServiceEntryModeCode", "getPointOfServiceEntryModeCode", "setPointOfServiceEntryModeCode", "posEntryMode", "getPosEntryMode", "setPosEntryMode", "posInvoiceData", "getPosInvoiceData", "setPosInvoiceData", "posPreauthorizationAndChargeBackData", "getPosPreauthorizationAndChargeBackData", "setPosPreauthorizationAndChargeBackData", "posSettlementData", "getPosSettlementData", "setPosSettlementData", "postalCode", "getPostalCode", "setPostalCode", "processingCode", "getProcessingCode", "setProcessingCode", "propensityFlagTradeFraud", "getPropensityFlagTradeFraud", "setPropensityFlagTradeFraud", "randomTkCipherEW", "getRandomTkCipherEW", "setRandomTkCipherEW", "readCardMode", "getReadCardMode", "setReadCardMode", "receivingInstitutionIdCode", "getReceivingInstitutionIdCode", "setReceivingInstitutionIdCode", "replacementAmounts", "getReplacementAmounts", "setReplacementAmounts", "responseCode", "getResponseCode", "setResponseCode", "retailerData", "getRetailerData", "setRetailerData", "routingCode", "getRoutingCode", "setRoutingCode", "routingIndicator", "getRoutingIndicator", "setRoutingIndicator", "rrn", "getRrn", "setRrn", "rsaPaddingEW", "getRsaPaddingEW", "setRsaPaddingEW", "rsaVersionEW", "getRsaVersionEW", "setRsaVersionEW", "rsnOnlyCode", "getRsnOnlyCode", "setRsnOnlyCode", "saleForcedOrSAF", "getSaleForcedOrSAF", "setSaleForcedOrSAF", "settlementDate", "getSettlementDate", "setSettlementDate", "specialData", "getSpecialData", "setSpecialData", "statusCodeOfRebroadcastTxn", "getStatusCodeOfRebroadcastTxn", "setStatusCodeOfRebroadcastTxn", "statusIndicatorC4", "getStatusIndicatorC4", "setStatusIndicatorC4", "systemTraceAuditNumber", "getSystemTraceAuditNumber", "setSystemTraceAuditNumber", "terminalActivationByCardholder", "getTerminalActivationByCardholder", "setTerminalActivationByCardholder", "terminalAddressBranch", "getTerminalAddressBranch", "setTerminalAddressBranch", "terminalCountryCode", "getTerminalCountryCode", "setTerminalCountryCode", "terminalData", "getTerminalData", "setTerminalData", "terminalEntryCapabilities", "getTerminalEntryCapabilities", "setTerminalEntryCapabilities", "terminalLocator", "getTerminalLocator", "setTerminalLocator", "terminalOperationIndex", "getTerminalOperationIndex", "setTerminalOperationIndex", "terminalSerialNumber", "getTerminalSerialNumber", "setTerminalSerialNumber", "terminalSoftwareVersion", "getTerminalSoftwareVersion", "setTerminalSoftwareVersion", "tkEW", "getTkEW", "setTkEW", "tokenEZ", "getTokenEZ", "setTokenEZ", "tokenEZ2", "getTokenEZ2", "setTokenEZ2", "tokenOpenPay", "getTokenOpenPay", "setTokenOpenPay", "track1Flag", "getTrack1Flag", "setTrack1Flag", EglobalUtils.TRACK2, "getTrack2", "setTrack2", "track2Length", "getTrack2Length", "setTrack2Length", "transDate", "getTransDate", "setTransDate", "transactionAmount", "getTransactionAmount", "setTransactionAmount", "transactionCurrencyCode", "getTransactionCurrencyCode", "setTransactionCurrencyCode", "transactionDateTime", "getTransactionDateTime", "setTransactionDateTime", "transactionSecurityLevel", "getTransactionSecurityLevel", "setTransactionSecurityLevel", "transactionType", "Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionType;", "getTransactionType", "()Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionType;", "setTransactionType", "(Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionType;)V", "transactionTypeCode", "getTransactionTypeCode", "setTransactionTypeCode", "transferDataIndicator", "getTransferDataIndicator", "setTransferDataIndicator", "transmisionDateAndTime", "getTransmisionDateAndTime", "setTransmisionDateAndTime", "tvr", "getTvr", "setTvr", "unpredictableNumber", "getUnpredictableNumber", "setUnpredictableNumber", "userField1B2", "getUserField1B2", "setUserField1B2", "userField1B3", "getUserField1B3", "setUserField1B3", "userField1B5", "getUserField1B5", "setUserField1B5", "userField1C0", "getUserField1C0", "setUserField1C0", "userField2B3", "getUserField2B3", "setUserField2B3", "userFieldACICZ", "getUserFieldACICZ", "setUserFieldACICZ", "userFieldQ1", "getUserFieldQ1", "setUserFieldQ1", "xid", "getXid", "setXid", "applyForReverse", "getField", "fieldName", "setField", "", "value", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TransactionResponseOpenPay {
    private int errorCode;
    private boolean hasChip;

    @NotNull
    private String errorMessage = "";

    @NotNull
    private HostType hostType = HostType.TestingDUKPTHost;

    @NotNull
    private MerchantType merchantType = MerchantType.Undefined;

    @NotNull
    private TransactionType transactionType = TransactionType.Undefined;

    @NotNull
    private PointOfServiceEntryMode pointOfServiceEntryMode = PointOfServiceEntryMode.Undefined;

    @NotNull
    private CardType cardType = CardType.Undefined;

    @NotNull
    private PaymentPlanType paymentPlanType = PaymentPlanType.Undefined;

    @NotNull
    private String tokenEZ = "";

    @NotNull
    private String tokenEZ2 = "";

    @NotNull
    private String tokenOpenPay = "";

    @NotNull
    private String messageType = "";

    @NotNull
    private String cardBin = "";

    @NotNull
    private String cardNumber = "";

    @NotNull
    private String cardExpirationDate = "";

    @NotNull
    private String processingCode = "";

    @NotNull
    private String transactionAmount = "";

    @NotNull
    private String transmisionDateAndTime = "";

    @NotNull
    private String systemTraceAuditNumber = "";

    @NotNull
    private String localTransactionTime = "";

    @NotNull
    private String localTransactionDate = "";

    @NotNull
    private String settlementDate = "";

    @NotNull
    private String captureDate = "";

    @NotNull
    private String merchantTypeCode = "";

    @NotNull
    private String merchantCurrencyCode = "";

    @NotNull
    private String pointOfServiceEntryModeCode = "";

    @NotNull
    private String pointOfServiceConditionCode = "";

    @NotNull
    private String clearTrack2 = "";

    @NotNull
    private String track2 = "";

    @NotNull
    private String cvv = "";

    @NotNull
    private String acquiringInstitutionIdentificationCode = "";

    @NotNull
    private String rrn = "";

    @NotNull
    private String authorizationIdResponse = "";

    @NotNull
    private String originalRrn = "";

    @NotNull
    private String responseCode = "";

    @NotNull
    private String cardAcceptorTerminalId = "";

    @NotNull
    private String cardAcceptorIdCode = "";

    @NotNull
    private String cardAcceptorNameAndLocation = "";

    @NotNull
    private String additionalResponseDate = "";

    @NotNull
    private String retailerData = "";

    @NotNull
    private String transactionCurrencyCode = "";

    @NotNull
    private String additionalAmounts = "";

    @NotNull
    private String terminalData = "";

    @NotNull
    private String cardIssuerCategoryResponseCodeData = "";

    @NotNull
    private String postalCode = "";

    @NotNull
    private String additionalData = "";

    @NotNull
    private String dataElements = "";

    @NotNull
    private String networkManagmentInformationCode = "";

    @NotNull
    private String originalDataElements = "";

    @NotNull
    private String replacementAmounts = "";

    @NotNull
    private String receivingInstitutionIdCode = "";

    @NotNull
    private String accountId = "";

    @NotNull
    private String terminalAddressBranch = "";

    @NotNull
    private String authorizationIndicators = "";

    @NotNull
    private String cardIssuerCode = "";

    @NotNull
    private String posInvoiceData = "";

    @NotNull
    private String specialData = "";

    @NotNull
    private String posSettlementData = "";

    @NotNull
    private String posPreauthorizationAndChargeBackData = "";

    @NotNull
    private String commercialReferences = "";

    @NotNull
    private String authorizationModeIdentifier = "";

    @NotNull
    private String userFieldQ1 = "";

    @NotNull
    private String accessMediumIdentifier = "";

    @NotNull
    private String deferral = "";

    @NotNull
    private String numberOfPayments = "";

    @NotNull
    private String paymentPlanCode = "";

    @NotNull
    private String paymentQ6Data = "";

    @NotNull
    private String additionalErrorFlagRequestInTransaction = "";

    @NotNull
    private String routingCode = "";

    @NotNull
    private String cardVerificationFlag = "";

    @NotNull
    private String cityExension = "";

    @NotNull
    private String completeTrack2Data = "";

    @NotNull
    private String fileFlagUses = "";

    @NotNull
    private String userField1C0 = " ";

    @NotNull
    private String cvv2cvc2Result = "";

    @NotNull
    private String statusCodeOfRebroadcastTxn = "";

    @NotNull
    private String counterOfRebroadcastTxn = "";

    @NotNull
    private String merchantPostalCode = "";

    @NotNull
    private String eCommerceIndicator = "";

    @NotNull
    private String saleForcedOrSAF = "";

    @NotNull
    private String cv2PresentIndicator = "";

    @NotNull
    private String additionalInfoIndicatorC0 = "";

    @NotNull
    private String authenticationCollectorIndicator = "";

    @NotNull
    private String propensityFlagTradeFraud = "";

    @NotNull
    private String cavvAvvValidationResult = "";

    @NotNull
    private String attendedTerminal = "";

    @NotNull
    private String terminalOperationIndex = "";

    @NotNull
    private String terminalLocator = "";

    @NotNull
    private String cardholderPresenceIndicator = "";

    @NotNull
    private String cardPresenceIndicator = "";

    @NotNull
    private String cardCaptureCapacityIndicator = "";

    @NotNull
    private String statusIndicatorC4 = "";

    @NotNull
    private String transactionSecurityLevel = "";

    @NotNull
    private String routingIndicator = "";

    @NotNull
    private String terminalActivationByCardholder = "";

    @NotNull
    private String transferDataIndicator = "";

    @NotNull
    private String identificationMethodCardHolder = "";

    @NotNull
    private String fillerC4 = "";

    @NotNull
    private String xid = "";

    @NotNull
    private String cavvCardholderAuthVerValue = "";

    @NotNull
    private String indicatorCE = "";

    @NotNull
    private String cardholderAuthenticationData = "";

    @NotNull
    private String atcCZ = "";

    @NotNull
    private String formFactrInd = "";

    @NotNull
    private String userFieldACICZ = "";

    @NotNull
    private String pekEX = "";

    @NotNull
    private String ksnEX = "";

    @NotNull
    private String checkValueEX = "";

    @NotNull
    private String newKeyRequestStatusEX = "";

    @NotNull
    private String crc32EX = "";

    @NotNull
    private String tkEW = "";

    @NotNull
    private String randomTkCipherEW = "";

    @NotNull
    private String rsaVersionEW = "";

    @NotNull
    private String rsaPaddingEW = "";

    @NotNull
    private String checkValueEW = "";

    @NotNull
    private String crc32EW = "";

    @NotNull
    private String terminalSoftwareVersion = "";

    @NotNull
    private String terminalSerialNumber = "";

    @NotNull
    private String cipherConfiguration = "";

    @NotNull
    private String localBinsTableIdPrimary = "";

    @NotNull
    private String localBinsTableIdSecondary = "";

    @NotNull
    private String binsTableVersion = "";

    @NotNull
    private String flagRequestNewKey = "";

    @NotNull
    private List<String> clearCipherBlocks = new ArrayList();

    @NotNull
    private List<String> chipherDataBlocks = new ArrayList();

    @NotNull
    private String clearCipherDataEZ = "";

    @NotNull
    private String keySerialNumber = "";

    @NotNull
    private String cipherCounter = "";

    @NotNull
    private String failCipherCounter = "";

    @NotNull
    private String flagTrack2 = "";

    @NotNull
    private String readCardMode = "";

    @NotNull
    private String track2Length = "";

    @NotNull
    private String cvvFlag = "";

    @NotNull
    private String clearCvvLength = "";

    @NotNull
    private String track1Flag = "";

    @NotNull
    private String cipherData = "";

    @NotNull
    private String lastPan4Digits = "";

    @NotNull
    private String crc32EZ = "";

    @NotNull
    private String bitmapB2 = "";

    @NotNull
    private String userField1B2 = "";

    @NotNull
    private String criptoInfoData = "";

    @NotNull
    private String tvr = "";

    @NotNull
    private String otherAmount = "";

    @NotNull
    private String aip = "";

    @NotNull
    private String arqc = "";

    @NotNull
    private String atc = "";

    @NotNull
    private String terminalCountryCode = "";

    @NotNull
    private String transDate = "";

    @NotNull
    private String transactionTypeCode = "";

    @NotNull
    private String emvTransactionType = "";

    @NotNull
    private String unpredictableNumber = "";

    @NotNull
    private String issApplDataLength = "";

    @NotNull
    private String issApplData = "";

    @NotNull
    private String bitmapB3 = "";

    @NotNull
    private String emvTermSerialNumber = "";

    @NotNull
    private String emvTerminalCapabilities = "";

    @NotNull
    private String userField1B3 = "";

    @NotNull
    private String userField2B3 = "";

    @NotNull
    private String emvLocalTransactionDate = "";

    @NotNull
    private String emvTerminalType = "";

    @NotNull
    private String applicationVersionNumber = "";

    @NotNull
    private String cvmResults = "";

    @NotNull
    private String dfNameLength = "";

    @NotNull
    private String dfName = "";

    @NotNull
    private String posEntryMode = "";

    @NotNull
    private String terminalEntryCapabilities = "";

    @NotNull
    private String lastEmvStat = "";

    @NotNull
    private String dataSuspect = "";

    @NotNull
    private String applPanSeqNum = "";

    @NotNull
    private String devInfo = "";

    @NotNull
    private String rsnOnlyCode = "";

    @NotNull
    private String arqcVerify = "";

    @NotNull
    private String isoRCIndicator = "";

    @NotNull
    private String userField1B5 = "";

    @NotNull
    private String emvIssAuthData = "";

    @NotNull
    private String issAuthData = "";

    @NotNull
    private String arpc = "";

    @NotNull
    private String addlData = "";

    @NotNull
    private String issAuthDataLength = "";

    @NotNull
    private String issScriptDataLength = "";

    @NotNull
    private String issScriptData = "";

    @NotNull
    private String keyUpdateFlag = "";

    @NotNull
    private String binsUpdateFlag = "";

    @NotNull
    private String isoASCII = "";

    @NotNull
    private String emvData = "";

    @NotNull
    private Map<String, String> emvTagsMap = new LinkedHashMap();

    @NotNull
    private String transactionDateTime = "";

    public final boolean applyForReverse() {
        return this.transactionType.getTransactionMessageType() == TransactionMessageType.Financial;
    }

    @NotNull
    public final String getAccessMediumIdentifier() {
        return this.accessMediumIdentifier;
    }

    @NotNull
    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    public final String getAcquiringInstitutionIdentificationCode() {
        return this.acquiringInstitutionIdentificationCode;
    }

    @NotNull
    public final String getAdditionalAmounts() {
        return this.additionalAmounts;
    }

    @NotNull
    public final String getAdditionalData() {
        return this.additionalData;
    }

    @NotNull
    public final String getAdditionalErrorFlagRequestInTransaction() {
        return this.additionalErrorFlagRequestInTransaction;
    }

    @NotNull
    public final String getAdditionalInfoIndicatorC0() {
        return this.additionalInfoIndicatorC0;
    }

    @NotNull
    public final String getAdditionalResponseDate() {
        return this.additionalResponseDate;
    }

    @NotNull
    public final String getAddlData() {
        return this.addlData;
    }

    @NotNull
    public final String getAip() {
        return this.aip;
    }

    @NotNull
    public final String getApplPanSeqNum() {
        return this.applPanSeqNum;
    }

    @NotNull
    public final String getApplicationVersionNumber() {
        return this.applicationVersionNumber;
    }

    @NotNull
    public final String getArpc() {
        return this.arpc;
    }

    @NotNull
    public final String getArqc() {
        return this.arqc;
    }

    @NotNull
    public final String getArqcVerify() {
        return this.arqcVerify;
    }

    @NotNull
    public final String getAtc() {
        return this.atc;
    }

    @NotNull
    public final String getAtcCZ() {
        return this.atcCZ;
    }

    @NotNull
    public final String getAttendedTerminal() {
        return this.attendedTerminal;
    }

    @NotNull
    public final String getAuthenticationCollectorIndicator() {
        return this.authenticationCollectorIndicator;
    }

    @NotNull
    public final String getAuthorizationIdResponse() {
        return this.authorizationIdResponse;
    }

    @NotNull
    public final String getAuthorizationIndicators() {
        return this.authorizationIndicators;
    }

    @NotNull
    public final String getAuthorizationModeIdentifier() {
        return this.authorizationModeIdentifier;
    }

    @NotNull
    public final String getBinsTableVersion() {
        return this.binsTableVersion;
    }

    @NotNull
    public final String getBinsUpdateFlag() {
        return this.binsUpdateFlag;
    }

    @NotNull
    public final String getBitmapB2() {
        return this.bitmapB2;
    }

    @NotNull
    public final String getBitmapB3() {
        return this.bitmapB3;
    }

    @NotNull
    public final String getCaptureDate() {
        return this.captureDate;
    }

    @NotNull
    public final String getCardAcceptorIdCode() {
        return this.cardAcceptorIdCode;
    }

    @NotNull
    public final String getCardAcceptorNameAndLocation() {
        return this.cardAcceptorNameAndLocation;
    }

    @NotNull
    public final String getCardAcceptorTerminalId() {
        return this.cardAcceptorTerminalId;
    }

    @NotNull
    public final String getCardBin() {
        return this.cardBin;
    }

    @NotNull
    public final String getCardCaptureCapacityIndicator() {
        return this.cardCaptureCapacityIndicator;
    }

    @NotNull
    public final String getCardExpirationDate() {
        return this.cardExpirationDate;
    }

    @NotNull
    public final String getCardIssuerCategoryResponseCodeData() {
        return this.cardIssuerCategoryResponseCodeData;
    }

    @NotNull
    public final String getCardIssuerCode() {
        return this.cardIssuerCode;
    }

    @NotNull
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @NotNull
    public final String getCardPresenceIndicator() {
        return this.cardPresenceIndicator;
    }

    @NotNull
    public final CardType getCardType() {
        return this.cardType;
    }

    @NotNull
    public final String getCardVerificationFlag() {
        return this.cardVerificationFlag;
    }

    @NotNull
    public final String getCardholderAuthenticationData() {
        return this.cardholderAuthenticationData;
    }

    @NotNull
    public final String getCardholderPresenceIndicator() {
        return this.cardholderPresenceIndicator;
    }

    @NotNull
    public final String getCavvAvvValidationResult() {
        return this.cavvAvvValidationResult;
    }

    @NotNull
    public final String getCavvCardholderAuthVerValue() {
        return this.cavvCardholderAuthVerValue;
    }

    @NotNull
    public final String getCheckValueEW() {
        return this.checkValueEW;
    }

    @NotNull
    public final String getCheckValueEX() {
        return this.checkValueEX;
    }

    @NotNull
    public final List<String> getChipherDataBlocks() {
        return this.chipherDataBlocks;
    }

    @NotNull
    public final String getCipherConfiguration() {
        return this.cipherConfiguration;
    }

    @NotNull
    public final String getCipherCounter() {
        return this.cipherCounter;
    }

    @NotNull
    public final String getCipherData() {
        return this.cipherData;
    }

    @NotNull
    public final String getCityExension() {
        return this.cityExension;
    }

    @NotNull
    public final List<String> getClearCipherBlocks() {
        return this.clearCipherBlocks;
    }

    @NotNull
    public final String getClearCipherDataEZ() {
        return this.clearCipherDataEZ;
    }

    @NotNull
    public final String getClearCvvLength() {
        return this.clearCvvLength;
    }

    @NotNull
    public final String getClearTrack2() {
        return this.clearTrack2;
    }

    @NotNull
    public final String getCommercialReferences() {
        return this.commercialReferences;
    }

    @NotNull
    public final String getCompleteTrack2Data() {
        return this.completeTrack2Data;
    }

    @NotNull
    public final String getCounterOfRebroadcastTxn() {
        return this.counterOfRebroadcastTxn;
    }

    @NotNull
    public final String getCrc32EW() {
        return this.crc32EW;
    }

    @NotNull
    public final String getCrc32EX() {
        return this.crc32EX;
    }

    @NotNull
    public final String getCrc32EZ() {
        return this.crc32EZ;
    }

    @NotNull
    public final String getCriptoInfoData() {
        return this.criptoInfoData;
    }

    @NotNull
    public final String getCv2PresentIndicator() {
        return this.cv2PresentIndicator;
    }

    @NotNull
    public final String getCvmResults() {
        return this.cvmResults;
    }

    @NotNull
    public final String getCvv() {
        return this.cvv;
    }

    @NotNull
    public final String getCvv2cvc2Result() {
        return this.cvv2cvc2Result;
    }

    @NotNull
    public final String getCvvFlag() {
        return this.cvvFlag;
    }

    @NotNull
    public final String getDataElements() {
        return this.dataElements;
    }

    @NotNull
    public final String getDataSuspect() {
        return this.dataSuspect;
    }

    @NotNull
    public final String getDeferral() {
        return this.deferral;
    }

    @NotNull
    public final String getDevInfo() {
        return this.devInfo;
    }

    @NotNull
    public final String getDfName() {
        return this.dfName;
    }

    @NotNull
    public final String getDfNameLength() {
        return this.dfNameLength;
    }

    @NotNull
    public final String getECommerceIndicator() {
        return this.eCommerceIndicator;
    }

    @NotNull
    public final String getEmvData() {
        return this.emvData;
    }

    @NotNull
    public final String getEmvIssAuthData() {
        return this.emvIssAuthData;
    }

    @NotNull
    public final String getEmvLocalTransactionDate() {
        return this.emvLocalTransactionDate;
    }

    @NotNull
    public final Map<String, String> getEmvTagsMap() {
        return this.emvTagsMap;
    }

    @NotNull
    public final String getEmvTermSerialNumber() {
        return this.emvTermSerialNumber;
    }

    @NotNull
    public final String getEmvTerminalCapabilities() {
        return this.emvTerminalCapabilities;
    }

    @NotNull
    public final String getEmvTerminalType() {
        return this.emvTerminalType;
    }

    @NotNull
    public final String getEmvTransactionType() {
        return this.emvTransactionType;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final String getFailCipherCounter() {
        return this.failCipherCounter;
    }

    @NotNull
    public final String getField(@NotNull String fieldName) throws IllegalAccessException, NoSuchFieldException {
        Intrinsics.checkNotNullParameter(fieldName, "");
        Field declaredField = TransactionResponseOpenPay.class.getDeclaredField(fieldName);
        Intrinsics.checkNotNullExpressionValue(declaredField, "");
        Object obj = declaredField.get(this);
        Intrinsics.checkNotNull(obj);
        return (String) obj;
    }

    @NotNull
    public final String getFileFlagUses() {
        return this.fileFlagUses;
    }

    @NotNull
    public final String getFillerC4() {
        return this.fillerC4;
    }

    @NotNull
    public final String getFlagRequestNewKey() {
        return this.flagRequestNewKey;
    }

    @NotNull
    public final String getFlagTrack2() {
        return this.flagTrack2;
    }

    @NotNull
    public final String getFormFactrInd() {
        return this.formFactrInd;
    }

    public final boolean getHasChip() {
        return this.hasChip;
    }

    @NotNull
    public final HostType getHostType() {
        return this.hostType;
    }

    @NotNull
    public final String getIdentificationMethodCardHolder() {
        return this.identificationMethodCardHolder;
    }

    @NotNull
    public final String getIndicatorCE() {
        return this.indicatorCE;
    }

    @NotNull
    public final String getIsoASCII() {
        return this.isoASCII;
    }

    @NotNull
    public final String getIsoRCIndicator() {
        return this.isoRCIndicator;
    }

    @NotNull
    public final String getIssApplData() {
        return this.issApplData;
    }

    @NotNull
    public final String getIssApplDataLength() {
        return this.issApplDataLength;
    }

    @NotNull
    public final String getIssAuthData() {
        return this.issAuthData;
    }

    @NotNull
    public final String getIssAuthDataLength() {
        return this.issAuthDataLength;
    }

    @NotNull
    public final String getIssScriptData() {
        return this.issScriptData;
    }

    @NotNull
    public final String getIssScriptDataLength() {
        return this.issScriptDataLength;
    }

    @NotNull
    public final String getKeySerialNumber() {
        return this.keySerialNumber;
    }

    @NotNull
    public final String getKeyUpdateFlag() {
        return this.keyUpdateFlag;
    }

    @NotNull
    public final String getKsnEX() {
        return this.ksnEX;
    }

    @NotNull
    public final String getLastEmvStat() {
        return this.lastEmvStat;
    }

    @NotNull
    public final String getLastPan4Digits() {
        return this.lastPan4Digits;
    }

    @NotNull
    public final String getLocalBinsTableIdPrimary() {
        return this.localBinsTableIdPrimary;
    }

    @NotNull
    public final String getLocalBinsTableIdSecondary() {
        return this.localBinsTableIdSecondary;
    }

    @NotNull
    public final String getLocalTransactionDate() {
        return this.localTransactionDate;
    }

    @NotNull
    public final String getLocalTransactionTime() {
        return this.localTransactionTime;
    }

    @NotNull
    public final String getMerchantCurrencyCode() {
        return this.merchantCurrencyCode;
    }

    @NotNull
    public final String getMerchantPostalCode() {
        return this.merchantPostalCode;
    }

    @NotNull
    public final MerchantType getMerchantType() {
        return this.merchantType;
    }

    @NotNull
    public final String getMerchantTypeCode() {
        return this.merchantTypeCode;
    }

    @NotNull
    public final String getMessageType() {
        return this.messageType;
    }

    @NotNull
    public final String getNetworkManagmentInformationCode() {
        return this.networkManagmentInformationCode;
    }

    @NotNull
    public final String getNewKeyRequestStatusEX() {
        return this.newKeyRequestStatusEX;
    }

    @NotNull
    public final String getNumberOfPayments() {
        return this.numberOfPayments;
    }

    @NotNull
    public final String getOriginalDataElements() {
        return this.originalDataElements;
    }

    @NotNull
    public final String getOriginalRrn() {
        return this.originalRrn;
    }

    @NotNull
    public final String getOtherAmount() {
        return this.otherAmount;
    }

    @NotNull
    public final String getPaymentPlanCode() {
        return this.paymentPlanCode;
    }

    @NotNull
    public final PaymentPlanType getPaymentPlanType() {
        return this.paymentPlanType;
    }

    @NotNull
    public final String getPaymentQ6Data() {
        return this.paymentQ6Data;
    }

    @NotNull
    public final String getPekEX() {
        return this.pekEX;
    }

    @NotNull
    public final String getPointOfServiceConditionCode() {
        return this.pointOfServiceConditionCode;
    }

    @NotNull
    public final PointOfServiceEntryMode getPointOfServiceEntryMode() {
        return this.pointOfServiceEntryMode;
    }

    @NotNull
    public final String getPointOfServiceEntryModeCode() {
        return this.pointOfServiceEntryModeCode;
    }

    @NotNull
    public final String getPosEntryMode() {
        return this.posEntryMode;
    }

    @NotNull
    public final String getPosInvoiceData() {
        return this.posInvoiceData;
    }

    @NotNull
    public final String getPosPreauthorizationAndChargeBackData() {
        return this.posPreauthorizationAndChargeBackData;
    }

    @NotNull
    public final String getPosSettlementData() {
        return this.posSettlementData;
    }

    @NotNull
    public final String getPostalCode() {
        return this.postalCode;
    }

    @NotNull
    public final String getProcessingCode() {
        return this.processingCode;
    }

    @NotNull
    public final String getPropensityFlagTradeFraud() {
        return this.propensityFlagTradeFraud;
    }

    @NotNull
    public final String getRandomTkCipherEW() {
        return this.randomTkCipherEW;
    }

    @NotNull
    public final String getReadCardMode() {
        return this.readCardMode;
    }

    @NotNull
    public final String getReceivingInstitutionIdCode() {
        return this.receivingInstitutionIdCode;
    }

    @NotNull
    public final String getReplacementAmounts() {
        return this.replacementAmounts;
    }

    @NotNull
    public final String getResponseCode() {
        return this.responseCode;
    }

    @NotNull
    public final String getRetailerData() {
        return this.retailerData;
    }

    @NotNull
    public final String getRoutingCode() {
        return this.routingCode;
    }

    @NotNull
    public final String getRoutingIndicator() {
        return this.routingIndicator;
    }

    @NotNull
    public final String getRrn() {
        return this.rrn;
    }

    @NotNull
    public final String getRsaPaddingEW() {
        return this.rsaPaddingEW;
    }

    @NotNull
    public final String getRsaVersionEW() {
        return this.rsaVersionEW;
    }

    @NotNull
    public final String getRsnOnlyCode() {
        return this.rsnOnlyCode;
    }

    @NotNull
    public final String getSaleForcedOrSAF() {
        return this.saleForcedOrSAF;
    }

    @NotNull
    public final String getSettlementDate() {
        return this.settlementDate;
    }

    @NotNull
    public final String getSpecialData() {
        return this.specialData;
    }

    @NotNull
    public final String getStatusCodeOfRebroadcastTxn() {
        return this.statusCodeOfRebroadcastTxn;
    }

    @NotNull
    public final String getStatusIndicatorC4() {
        return this.statusIndicatorC4;
    }

    @NotNull
    public final String getSystemTraceAuditNumber() {
        return this.systemTraceAuditNumber;
    }

    @NotNull
    public final String getTerminalActivationByCardholder() {
        return this.terminalActivationByCardholder;
    }

    @NotNull
    public final String getTerminalAddressBranch() {
        return this.terminalAddressBranch;
    }

    @NotNull
    public final String getTerminalCountryCode() {
        return this.terminalCountryCode;
    }

    @NotNull
    public final String getTerminalData() {
        return this.terminalData;
    }

    @NotNull
    public final String getTerminalEntryCapabilities() {
        return this.terminalEntryCapabilities;
    }

    @NotNull
    public final String getTerminalLocator() {
        return this.terminalLocator;
    }

    @NotNull
    public final String getTerminalOperationIndex() {
        return this.terminalOperationIndex;
    }

    @NotNull
    public final String getTerminalSerialNumber() {
        return this.terminalSerialNumber;
    }

    @NotNull
    public final String getTerminalSoftwareVersion() {
        return this.terminalSoftwareVersion;
    }

    @NotNull
    public final String getTkEW() {
        return this.tkEW;
    }

    @NotNull
    public final String getTokenEZ() {
        return this.tokenEZ;
    }

    @NotNull
    public final String getTokenEZ2() {
        return this.tokenEZ2;
    }

    @NotNull
    public final String getTokenOpenPay() {
        return this.tokenOpenPay;
    }

    @NotNull
    public final String getTrack1Flag() {
        return this.track1Flag;
    }

    @NotNull
    public final String getTrack2() {
        return this.track2;
    }

    @NotNull
    public final String getTrack2Length() {
        return this.track2Length;
    }

    @NotNull
    public final String getTransDate() {
        return this.transDate;
    }

    @NotNull
    public final String getTransactionAmount() {
        return this.transactionAmount;
    }

    @NotNull
    public final String getTransactionCurrencyCode() {
        return this.transactionCurrencyCode;
    }

    @NotNull
    public final String getTransactionDateTime() {
        return this.transactionDateTime;
    }

    @NotNull
    public final String getTransactionSecurityLevel() {
        return this.transactionSecurityLevel;
    }

    @NotNull
    public final TransactionType getTransactionType() {
        return this.transactionType;
    }

    @NotNull
    public final String getTransactionTypeCode() {
        return this.transactionTypeCode;
    }

    @NotNull
    public final String getTransferDataIndicator() {
        return this.transferDataIndicator;
    }

    @NotNull
    public final String getTransmisionDateAndTime() {
        return this.transmisionDateAndTime;
    }

    @NotNull
    public final String getTvr() {
        return this.tvr;
    }

    @NotNull
    public final String getUnpredictableNumber() {
        return this.unpredictableNumber;
    }

    @NotNull
    public final String getUserField1B2() {
        return this.userField1B2;
    }

    @NotNull
    public final String getUserField1B3() {
        return this.userField1B3;
    }

    @NotNull
    public final String getUserField1B5() {
        return this.userField1B5;
    }

    @NotNull
    public final String getUserField1C0() {
        return this.userField1C0;
    }

    @NotNull
    public final String getUserField2B3() {
        return this.userField2B3;
    }

    @NotNull
    public final String getUserFieldACICZ() {
        return this.userFieldACICZ;
    }

    @NotNull
    public final String getUserFieldQ1() {
        return this.userFieldQ1;
    }

    @NotNull
    public final String getXid() {
        return this.xid;
    }

    public final void setAccessMediumIdentifier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accessMediumIdentifier = str;
    }

    public final void setAccountId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
    }

    public final void setAcquiringInstitutionIdentificationCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.acquiringInstitutionIdentificationCode = str;
    }

    public final void setAdditionalAmounts(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.additionalAmounts = str;
    }

    public final void setAdditionalData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.additionalData = str;
    }

    public final void setAdditionalErrorFlagRequestInTransaction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.additionalErrorFlagRequestInTransaction = str;
    }

    public final void setAdditionalInfoIndicatorC0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.additionalInfoIndicatorC0 = str;
    }

    public final void setAdditionalResponseDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.additionalResponseDate = str;
    }

    public final void setAddlData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.addlData = str;
    }

    public final void setAip(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.aip = str;
    }

    public final void setApplPanSeqNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.applPanSeqNum = str;
    }

    public final void setApplicationVersionNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.applicationVersionNumber = str;
    }

    public final void setArpc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.arpc = str;
    }

    public final void setArqc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.arqc = str;
    }

    public final void setArqcVerify(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.arqcVerify = str;
    }

    public final void setAtc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.atc = str;
    }

    public final void setAtcCZ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.atcCZ = str;
    }

    public final void setAttendedTerminal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.attendedTerminal = str;
    }

    public final void setAuthenticationCollectorIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.authenticationCollectorIndicator = str;
    }

    public final void setAuthorizationIdResponse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.authorizationIdResponse = str;
    }

    public final void setAuthorizationIndicators(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.authorizationIndicators = str;
    }

    public final void setAuthorizationModeIdentifier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.authorizationModeIdentifier = str;
    }

    public final void setBinsTableVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.binsTableVersion = str;
    }

    public final void setBinsUpdateFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.binsUpdateFlag = str;
    }

    public final void setBitmapB2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bitmapB2 = str;
    }

    public final void setBitmapB3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bitmapB3 = str;
    }

    public final void setCaptureDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.captureDate = str;
    }

    public final void setCardAcceptorIdCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cardAcceptorIdCode = str;
    }

    public final void setCardAcceptorNameAndLocation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cardAcceptorNameAndLocation = str;
    }

    public final void setCardAcceptorTerminalId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cardAcceptorTerminalId = str;
    }

    public final void setCardBin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cardBin = str;
    }

    public final void setCardCaptureCapacityIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cardCaptureCapacityIndicator = str;
    }

    public final void setCardExpirationDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cardExpirationDate = str;
    }

    public final void setCardIssuerCategoryResponseCodeData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cardIssuerCategoryResponseCodeData = str;
    }

    public final void setCardIssuerCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cardIssuerCode = str;
    }

    public final void setCardNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cardNumber = str;
    }

    public final void setCardPresenceIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cardPresenceIndicator = str;
    }

    public final void setCardType(@NotNull CardType cardType) {
        Intrinsics.checkNotNullParameter(cardType, "");
        this.cardType = cardType;
    }

    public final void setCardVerificationFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cardVerificationFlag = str;
    }

    public final void setCardholderAuthenticationData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cardholderAuthenticationData = str;
    }

    public final void setCardholderPresenceIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cardholderPresenceIndicator = str;
    }

    public final void setCavvAvvValidationResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cavvAvvValidationResult = str;
    }

    public final void setCavvCardholderAuthVerValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cavvCardholderAuthVerValue = str;
    }

    public final void setCheckValueEW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.checkValueEW = str;
    }

    public final void setCheckValueEX(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.checkValueEX = str;
    }

    public final void setChipherDataBlocks(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chipherDataBlocks = list;
    }

    public final void setCipherConfiguration(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cipherConfiguration = str;
    }

    public final void setCipherCounter(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cipherCounter = str;
    }

    public final void setCipherData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cipherData = str;
    }

    public final void setCityExension(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cityExension = str;
    }

    public final void setClearCipherBlocks(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.clearCipherBlocks = list;
    }

    public final void setClearCipherDataEZ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.clearCipherDataEZ = str;
    }

    public final void setClearCvvLength(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.clearCvvLength = str;
    }

    public final void setClearTrack2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.clearTrack2 = str;
    }

    public final void setCommercialReferences(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.commercialReferences = str;
    }

    public final void setCompleteTrack2Data(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.completeTrack2Data = str;
    }

    public final void setCounterOfRebroadcastTxn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.counterOfRebroadcastTxn = str;
    }

    public final void setCrc32EW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.crc32EW = str;
    }

    public final void setCrc32EX(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.crc32EX = str;
    }

    public final void setCrc32EZ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.crc32EZ = str;
    }

    public final void setCriptoInfoData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.criptoInfoData = str;
    }

    public final void setCv2PresentIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cv2PresentIndicator = str;
    }

    public final void setCvmResults(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cvmResults = str;
    }

    public final void setCvv(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cvv = str;
    }

    public final void setCvv2cvc2Result(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cvv2cvc2Result = str;
    }

    public final void setCvvFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cvvFlag = str;
    }

    public final void setDataElements(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dataElements = str;
    }

    public final void setDataSuspect(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dataSuspect = str;
    }

    public final void setDeferral(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deferral = str;
    }

    public final void setDevInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.devInfo = str;
    }

    public final void setDfName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dfName = str;
    }

    public final void setDfNameLength(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dfNameLength = str;
    }

    public final void setECommerceIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eCommerceIndicator = str;
    }

    public final void setEmvData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.emvData = str;
    }

    public final void setEmvIssAuthData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.emvIssAuthData = str;
    }

    public final void setEmvLocalTransactionDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.emvLocalTransactionDate = str;
    }

    public final void setEmvTagsMap(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.emvTagsMap = map;
    }

    public final void setEmvTermSerialNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.emvTermSerialNumber = str;
    }

    public final void setEmvTerminalCapabilities(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.emvTerminalCapabilities = str;
    }

    public final void setEmvTerminalType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.emvTerminalType = str;
    }

    public final void setEmvTransactionType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.emvTransactionType = str;
    }

    public final void setErrorCode(int i10) {
        this.errorCode = i10;
    }

    public final void setErrorMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.errorMessage = str;
    }

    public final void setFailCipherCounter(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.failCipherCounter = str;
    }

    public final void setField(@NotNull String fieldName, @NotNull String value) throws IllegalAccessException, NoSuchFieldException {
        Intrinsics.checkNotNullParameter(fieldName, "");
        Intrinsics.checkNotNullParameter(value, "");
        Field declaredField = TransactionResponseOpenPay.class.getDeclaredField(fieldName);
        Intrinsics.checkNotNullExpressionValue(declaredField, "");
        declaredField.set(this, value);
    }

    public final void setFileFlagUses(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fileFlagUses = str;
    }

    public final void setFillerC4(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fillerC4 = str;
    }

    public final void setFlagRequestNewKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.flagRequestNewKey = str;
    }

    public final void setFlagTrack2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.flagTrack2 = str;
    }

    public final void setFormFactrInd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.formFactrInd = str;
    }

    public final void setHasChip(boolean z10) {
        this.hasChip = z10;
    }

    public final void setHostType(@NotNull HostType hostType) {
        Intrinsics.checkNotNullParameter(hostType, "");
        this.hostType = hostType;
    }

    public final void setIdentificationMethodCardHolder(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.identificationMethodCardHolder = str;
    }

    public final void setIndicatorCE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.indicatorCE = str;
    }

    public final void setIsoASCII(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isoASCII = str;
    }

    public final void setIsoRCIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isoRCIndicator = str;
    }

    public final void setIssApplData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.issApplData = str;
    }

    public final void setIssApplDataLength(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.issApplDataLength = str;
    }

    public final void setIssAuthData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.issAuthData = str;
    }

    public final void setIssAuthDataLength(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.issAuthDataLength = str;
    }

    public final void setIssScriptData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.issScriptData = str;
    }

    public final void setIssScriptDataLength(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.issScriptDataLength = str;
    }

    public final void setKeySerialNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.keySerialNumber = str;
    }

    public final void setKeyUpdateFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.keyUpdateFlag = str;
    }

    public final void setKsnEX(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ksnEX = str;
    }

    public final void setLastEmvStat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lastEmvStat = str;
    }

    public final void setLastPan4Digits(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lastPan4Digits = str;
    }

    public final void setLocalBinsTableIdPrimary(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.localBinsTableIdPrimary = str;
    }

    public final void setLocalBinsTableIdSecondary(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.localBinsTableIdSecondary = str;
    }

    public final void setLocalTransactionDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.localTransactionDate = str;
    }

    public final void setLocalTransactionTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.localTransactionTime = str;
    }

    public final void setMerchantCurrencyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.merchantCurrencyCode = str;
    }

    public final void setMerchantPostalCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.merchantPostalCode = str;
    }

    public final void setMerchantType(@NotNull MerchantType merchantType) {
        Intrinsics.checkNotNullParameter(merchantType, "");
        this.merchantType = merchantType;
    }

    public final void setMerchantTypeCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.merchantTypeCode = str;
    }

    public final void setMessageType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.messageType = str;
    }

    public final void setNetworkManagmentInformationCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.networkManagmentInformationCode = str;
    }

    public final void setNewKeyRequestStatusEX(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.newKeyRequestStatusEX = str;
    }

    public final void setNumberOfPayments(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.numberOfPayments = str;
    }

    public final void setOriginalDataElements(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originalDataElements = str;
    }

    public final void setOriginalRrn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originalRrn = str;
    }

    public final void setOtherAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.otherAmount = str;
    }

    public final void setPaymentPlanCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentPlanCode = str;
    }

    public final void setPaymentPlanType(@NotNull PaymentPlanType paymentPlanType) {
        Intrinsics.checkNotNullParameter(paymentPlanType, "");
        this.paymentPlanType = paymentPlanType;
    }

    public final void setPaymentQ6Data(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentQ6Data = str;
    }

    public final void setPekEX(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pekEX = str;
    }

    public final void setPointOfServiceConditionCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pointOfServiceConditionCode = str;
    }

    public final void setPointOfServiceEntryMode(@NotNull PointOfServiceEntryMode pointOfServiceEntryMode) {
        Intrinsics.checkNotNullParameter(pointOfServiceEntryMode, "");
        this.pointOfServiceEntryMode = pointOfServiceEntryMode;
    }

    public final void setPointOfServiceEntryModeCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pointOfServiceEntryModeCode = str;
    }

    public final void setPosEntryMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posEntryMode = str;
    }

    public final void setPosInvoiceData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posInvoiceData = str;
    }

    public final void setPosPreauthorizationAndChargeBackData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posPreauthorizationAndChargeBackData = str;
    }

    public final void setPosSettlementData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posSettlementData = str;
    }

    public final void setPostalCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.postalCode = str;
    }

    public final void setProcessingCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.processingCode = str;
    }

    public final void setPropensityFlagTradeFraud(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.propensityFlagTradeFraud = str;
    }

    public final void setRandomTkCipherEW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.randomTkCipherEW = str;
    }

    public final void setReadCardMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.readCardMode = str;
    }

    public final void setReceivingInstitutionIdCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.receivingInstitutionIdCode = str;
    }

    public final void setReplacementAmounts(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.replacementAmounts = str;
    }

    public final void setResponseCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.responseCode = str;
    }

    public final void setRetailerData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.retailerData = str;
    }

    public final void setRoutingCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.routingCode = str;
    }

    public final void setRoutingIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.routingIndicator = str;
    }

    public final void setRrn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rrn = str;
    }

    public final void setRsaPaddingEW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rsaPaddingEW = str;
    }

    public final void setRsaVersionEW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rsaVersionEW = str;
    }

    public final void setRsnOnlyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rsnOnlyCode = str;
    }

    public final void setSaleForcedOrSAF(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.saleForcedOrSAF = str;
    }

    public final void setSettlementDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.settlementDate = str;
    }

    public final void setSpecialData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.specialData = str;
    }

    public final void setStatusCodeOfRebroadcastTxn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.statusCodeOfRebroadcastTxn = str;
    }

    public final void setStatusIndicatorC4(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.statusIndicatorC4 = str;
    }

    public final void setSystemTraceAuditNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.systemTraceAuditNumber = str;
    }

    public final void setTerminalActivationByCardholder(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.terminalActivationByCardholder = str;
    }

    public final void setTerminalAddressBranch(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.terminalAddressBranch = str;
    }

    public final void setTerminalCountryCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.terminalCountryCode = str;
    }

    public final void setTerminalData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.terminalData = str;
    }

    public final void setTerminalEntryCapabilities(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.terminalEntryCapabilities = str;
    }

    public final void setTerminalLocator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.terminalLocator = str;
    }

    public final void setTerminalOperationIndex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.terminalOperationIndex = str;
    }

    public final void setTerminalSerialNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.terminalSerialNumber = str;
    }

    public final void setTerminalSoftwareVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.terminalSoftwareVersion = str;
    }

    public final void setTkEW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tkEW = str;
    }

    public final void setTokenEZ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenEZ = str;
    }

    public final void setTokenEZ2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenEZ2 = str;
    }

    public final void setTokenOpenPay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenOpenPay = str;
    }

    public final void setTrack1Flag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.track1Flag = str;
    }

    public final void setTrack2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.track2 = str;
    }

    public final void setTrack2Length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.track2Length = str;
    }

    public final void setTransDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transDate = str;
    }

    public final void setTransactionAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transactionAmount = str;
    }

    public final void setTransactionCurrencyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transactionCurrencyCode = str;
    }

    public final void setTransactionDateTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transactionDateTime = str;
    }

    public final void setTransactionSecurityLevel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transactionSecurityLevel = str;
    }

    public final void setTransactionType(@NotNull TransactionType transactionType) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        this.transactionType = transactionType;
    }

    public final void setTransactionTypeCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transactionTypeCode = str;
    }

    public final void setTransferDataIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transferDataIndicator = str;
    }

    public final void setTransmisionDateAndTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transmisionDateAndTime = str;
    }

    public final void setTvr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tvr = str;
    }

    public final void setUnpredictableNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unpredictableNumber = str;
    }

    public final void setUserField1B2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userField1B2 = str;
    }

    public final void setUserField1B3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userField1B3 = str;
    }

    public final void setUserField1B5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userField1B5 = str;
    }

    public final void setUserField1C0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userField1C0 = str;
    }

    public final void setUserField2B3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userField2B3 = str;
    }

    public final void setUserFieldACICZ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userFieldACICZ = str;
    }

    public final void setUserFieldQ1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userFieldQ1 = str;
    }

    public final void setXid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.xid = str;
    }
}
