package com.viergegroup.sdk.taptophone.vierge.models;

import com.bbva.ocrcard.utils.ConstantsKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import com.mypinpad.tsdk.isolation.z1;
import com.noknok.android.passportsdksvc.PassportSDKIntentActivity;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.util.EglobalUtils;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\bt\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010!\n\u0002\bb\n\u0002\u0010%\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0003\b\u0086\u0001\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\b\u0010ã\u0004\u001a\u00030¦\u0002J\u0007\u0010ä\u0004\u001a\u00020\u0006J\u0010\u0010å\u0004\u001a\u00020\u00062\u0007\u0010æ\u0004\u001a\u00020\u0006J\u001a\u0010ç\u0004\u001a\u00030è\u00042\u0007\u0010æ\u0004\u001a\u00020\u00062\u0007\u0010é\u0004\u001a\u00020\u0006R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR\u001a\u0010#\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR\u001a\u0010&\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000b\"\u0004\b(\u0010\rR\u001a\u0010)\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000b\"\u0004\b+\u0010\rR\u001a\u0010,\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010\rR\u001a\u0010/\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\rR\u001a\u00102\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u000b\"\u0004\b4\u0010\rR\u001a\u00105\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u000b\"\u0004\b7\u0010\rR\u001a\u00108\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000b\"\u0004\b:\u0010\rR\u001a\u0010;\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u000b\"\u0004\b=\u0010\rR\u001a\u0010>\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u000b\"\u0004\b@\u0010\rR\u001a\u0010A\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000b\"\u0004\bC\u0010\rR\u001a\u0010D\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u000b\"\u0004\bF\u0010\rR\u001a\u0010G\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u000b\"\u0004\bI\u0010\rR\u001a\u0010J\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u000b\"\u0004\bL\u0010\rR\u001a\u0010M\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u000b\"\u0004\bO\u0010\rR\u001a\u0010P\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u000b\"\u0004\bR\u0010\rR\u001a\u0010S\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u000b\"\u0004\bU\u0010\rR\u001a\u0010V\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u000b\"\u0004\bX\u0010\rR\u001a\u0010Y\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u000b\"\u0004\b[\u0010\rR\u001a\u0010\\\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u000b\"\u0004\b^\u0010\rR\u001a\u0010_\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u000b\"\u0004\ba\u0010\rR\u001a\u0010b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u000b\"\u0004\bd\u0010\rR\u001a\u0010e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u000b\"\u0004\bg\u0010\rR\u001a\u0010h\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u000b\"\u0004\bj\u0010\rR\u001a\u0010k\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u000b\"\u0004\bm\u0010\rR\u001a\u0010n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u000b\"\u0004\bp\u0010\rR\u001a\u0010q\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010\u000b\"\u0004\bs\u0010\rR\u001a\u0010t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\u000b\"\u0004\bv\u0010\rR\u001a\u0010w\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010\u000b\"\u0004\by\u0010\rR\u001a\u0010z\u001a\u00020{X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u001d\u0010\u0080\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010\u000b\"\u0005\b\u0082\u0001\u0010\rR\u001d\u0010\u0083\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010\u000b\"\u0005\b\u0085\u0001\u0010\rR\u001d\u0010\u0086\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010\u000b\"\u0005\b\u0088\u0001\u0010\rR\u001d\u0010\u0089\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010\u000b\"\u0005\b\u008b\u0001\u0010\rR\u001d\u0010\u008c\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010\u000b\"\u0005\b\u008e\u0001\u0010\rR\u001d\u0010\u008f\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010\u000b\"\u0005\b\u0091\u0001\u0010\rR\u001d\u0010\u0092\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010\u000b\"\u0005\b\u0094\u0001\u0010\rR&\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0096\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001d\u0010\u009b\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010\u000b\"\u0005\b\u009d\u0001\u0010\rR\u001d\u0010\u009e\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0001\u0010\u000b\"\u0005\b \u0001\u0010\rR\u001d\u0010¡\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0001\u0010\u000b\"\u0005\b£\u0001\u0010\rR\u001d\u0010¤\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¥\u0001\u0010\u000b\"\u0005\b¦\u0001\u0010\rR&\u0010§\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0096\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¨\u0001\u0010\u0098\u0001\"\u0006\b©\u0001\u0010\u009a\u0001R\u001d\u0010ª\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b«\u0001\u0010\u000b\"\u0005\b¬\u0001\u0010\rR\u001d\u0010\u00ad\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b®\u0001\u0010\u000b\"\u0005\b¯\u0001\u0010\rR\u001d\u0010°\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b±\u0001\u0010\u000b\"\u0005\b²\u0001\u0010\rR\u001d\u0010³\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b´\u0001\u0010\u000b\"\u0005\bµ\u0001\u0010\rR\u001d\u0010¶\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b·\u0001\u0010\u000b\"\u0005\b¸\u0001\u0010\rR\u001d\u0010¹\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bº\u0001\u0010\u000b\"\u0005\b»\u0001\u0010\rR\u001d\u0010¼\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b½\u0001\u0010\u000b\"\u0005\b¾\u0001\u0010\rR\u001d\u0010¿\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÀ\u0001\u0010\u000b\"\u0005\bÁ\u0001\u0010\rR\u001d\u0010Â\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÃ\u0001\u0010\u000b\"\u0005\bÄ\u0001\u0010\rR\u001d\u0010Å\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÆ\u0001\u0010\u000b\"\u0005\bÇ\u0001\u0010\rR\u001d\u0010È\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÉ\u0001\u0010\u000b\"\u0005\bÊ\u0001\u0010\rR\u001d\u0010Ë\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÌ\u0001\u0010\u000b\"\u0005\bÍ\u0001\u0010\rR\u001d\u0010Î\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÏ\u0001\u0010\u000b\"\u0005\bÐ\u0001\u0010\rR\u001d\u0010Ñ\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÒ\u0001\u0010\u000b\"\u0005\bÓ\u0001\u0010\rR\u001d\u0010Ô\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÕ\u0001\u0010\u000b\"\u0005\bÖ\u0001\u0010\rR\u001d\u0010×\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bØ\u0001\u0010\u000b\"\u0005\bÙ\u0001\u0010\rR\u001d\u0010Ú\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÛ\u0001\u0010\u000b\"\u0005\bÜ\u0001\u0010\rR\u001d\u0010Ý\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÞ\u0001\u0010\u000b\"\u0005\bß\u0001\u0010\rR\u001d\u0010à\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bá\u0001\u0010\u000b\"\u0005\bâ\u0001\u0010\rR\u001d\u0010ã\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bä\u0001\u0010\u000b\"\u0005\bå\u0001\u0010\rR\u001d\u0010æ\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bç\u0001\u0010\u000b\"\u0005\bè\u0001\u0010\rR\u001d\u0010é\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bê\u0001\u0010\u000b\"\u0005\bë\u0001\u0010\rR\u001d\u0010ì\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bí\u0001\u0010\u000b\"\u0005\bî\u0001\u0010\rR\u001d\u0010ï\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bð\u0001\u0010\u000b\"\u0005\bñ\u0001\u0010\rR\u001d\u0010ò\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bó\u0001\u0010\u000b\"\u0005\bô\u0001\u0010\rR\u001d\u0010õ\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bö\u0001\u0010\u000b\"\u0005\b÷\u0001\u0010\rR,\u0010ø\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060ù\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bú\u0001\u0010û\u0001\"\u0006\bü\u0001\u0010ý\u0001R\u001d\u0010þ\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÿ\u0001\u0010\u000b\"\u0005\b\u0080\u0002\u0010\rR\u001d\u0010\u0081\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0002\u0010\u000b\"\u0005\b\u0083\u0002\u0010\rR\u001d\u0010\u0084\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0002\u0010\u000b\"\u0005\b\u0086\u0002\u0010\rR\u001d\u0010\u0087\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0002\u0010\u000b\"\u0005\b\u0089\u0002\u0010\rR\u001e\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002\"\u0006\b\u008c\u0002\u0010\u008d\u0002R\u001c\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0002\u0010\u000b\"\u0005\b\u008f\u0002\u0010\rR\u001d\u0010\u0090\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0002\u0010\u000b\"\u0005\b\u0092\u0002\u0010\rR\u001d\u0010\u0093\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0002\u0010\u000b\"\u0005\b\u0095\u0002\u0010\rR\u001d\u0010\u0096\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0002\u0010\u000b\"\u0005\b\u0098\u0002\u0010\rR\u001d\u0010\u0099\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0002\u0010\u000b\"\u0005\b\u009b\u0002\u0010\rR\u001d\u0010\u009c\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0002\u0010\u000b\"\u0005\b\u009e\u0002\u0010\rR\u001d\u0010\u009f\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b \u0002\u0010\u000b\"\u0005\b¡\u0002\u0010\rR\u001d\u0010¢\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b£\u0002\u0010\u000b\"\u0005\b¤\u0002\u0010\rR \u0010¥\u0002\u001a\u00030¦\u0002X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b§\u0002\u0010¨\u0002\"\u0006\b©\u0002\u0010ª\u0002R \u0010«\u0002\u001a\u00030¬\u0002X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u00ad\u0002\u0010®\u0002\"\u0006\b¯\u0002\u0010°\u0002R\u001d\u0010±\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0002\u0010\u000b\"\u0005\b³\u0002\u0010\rR\u001d\u0010´\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bµ\u0002\u0010\u000b\"\u0005\b¶\u0002\u0010\rR\u001d\u0010·\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¸\u0002\u0010\u000b\"\u0005\b¹\u0002\u0010\rR\u001d\u0010º\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b»\u0002\u0010\u000b\"\u0005\b¼\u0002\u0010\rR\u001d\u0010½\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¾\u0002\u0010\u000b\"\u0005\b¿\u0002\u0010\rR\u001d\u0010À\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÁ\u0002\u0010\u000b\"\u0005\bÂ\u0002\u0010\rR\u001d\u0010Ã\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÄ\u0002\u0010\u000b\"\u0005\bÅ\u0002\u0010\rR\u001d\u0010Æ\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÇ\u0002\u0010\u000b\"\u0005\bÈ\u0002\u0010\rR\u001d\u0010É\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÊ\u0002\u0010\u000b\"\u0005\bË\u0002\u0010\rR\u001d\u0010Ì\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÍ\u0002\u0010\u000b\"\u0005\bÎ\u0002\u0010\rR\u001d\u0010Ï\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÐ\u0002\u0010\u000b\"\u0005\bÑ\u0002\u0010\rR\u001d\u0010Ò\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÓ\u0002\u0010\u000b\"\u0005\bÔ\u0002\u0010\rR\u001d\u0010Õ\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÖ\u0002\u0010\u000b\"\u0005\b×\u0002\u0010\rR\u001d\u0010Ø\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÙ\u0002\u0010\u000b\"\u0005\bÚ\u0002\u0010\rR\u001d\u0010Û\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÜ\u0002\u0010\u000b\"\u0005\bÝ\u0002\u0010\rR\u001d\u0010Þ\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bß\u0002\u0010\u000b\"\u0005\bà\u0002\u0010\rR\u001d\u0010á\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bâ\u0002\u0010\u000b\"\u0005\bã\u0002\u0010\rR\u001d\u0010ä\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bå\u0002\u0010\u000b\"\u0005\bæ\u0002\u0010\rR\u001d\u0010ç\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bè\u0002\u0010\u000b\"\u0005\bé\u0002\u0010\rR\u001d\u0010ê\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bë\u0002\u0010\u000b\"\u0005\bì\u0002\u0010\rR\u001d\u0010í\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bî\u0002\u0010\u000b\"\u0005\bï\u0002\u0010\rR \u0010ð\u0002\u001a\u00030ñ\u0002X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bò\u0002\u0010ó\u0002\"\u0006\bô\u0002\u0010õ\u0002R\u001d\u0010ö\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b÷\u0002\u0010\u000b\"\u0005\bø\u0002\u0010\rR\u001d\u0010ù\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bú\u0002\u0010\u000b\"\u0005\bû\u0002\u0010\rR \u0010ü\u0002\u001a\u00030ý\u0002X\u0086.¢\u0006\u0012\n\u0000\u001a\u0006\bþ\u0002\u0010ÿ\u0002\"\u0006\b\u0080\u0003\u0010\u0081\u0003R\u001d\u0010\u0082\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0003\u0010\u000b\"\u0005\b\u0084\u0003\u0010\rR\u001d\u0010\u0085\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0003\u0010\u000b\"\u0005\b\u0087\u0003\u0010\rR\u001d\u0010\u0088\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0003\u0010\u000b\"\u0005\b\u008a\u0003\u0010\rR\u001d\u0010\u008b\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0003\u0010\u000b\"\u0005\b\u008d\u0003\u0010\rR\u001d\u0010\u008e\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0003\u0010\u000b\"\u0005\b\u0090\u0003\u0010\rR\u001d\u0010\u0091\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0003\u0010\u000b\"\u0005\b\u0093\u0003\u0010\rR\u001d\u0010\u0094\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0003\u0010\u000b\"\u0005\b\u0096\u0003\u0010\rR \u0010\u0097\u0003\u001a\u00030\u0098\u0003X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0099\u0003\u0010\u009a\u0003\"\u0006\b\u009b\u0003\u0010\u009c\u0003R\u001d\u0010\u009d\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0003\u0010\u000b\"\u0005\b\u009f\u0003\u0010\rR\u001d\u0010 \u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¡\u0003\u0010\u000b\"\u0005\b¢\u0003\u0010\rR\u001d\u0010£\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¤\u0003\u0010\u000b\"\u0005\b¥\u0003\u0010\rR \u0010¦\u0003\u001a\u00030§\u0003X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¨\u0003\u0010©\u0003\"\u0006\bª\u0003\u0010«\u0003R\u001d\u0010¬\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0003\u0010\u000b\"\u0005\b®\u0003\u0010\rR\u001d\u0010¯\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b°\u0003\u0010\u000b\"\u0005\b±\u0003\u0010\rR\u001d\u0010²\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b³\u0003\u0010\u000b\"\u0005\b´\u0003\u0010\rR\u001d\u0010µ\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¶\u0003\u0010\u000b\"\u0005\b·\u0003\u0010\rR\u001d\u0010¸\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¹\u0003\u0010\u000b\"\u0005\bº\u0003\u0010\rR\u001d\u0010»\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¼\u0003\u0010\u000b\"\u0005\b½\u0003\u0010\rR\u001d\u0010¾\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¿\u0003\u0010\u000b\"\u0005\bÀ\u0003\u0010\rR\u001d\u0010Á\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÂ\u0003\u0010\u000b\"\u0005\bÃ\u0003\u0010\rR\u001d\u0010Ä\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÅ\u0003\u0010\u000b\"\u0005\bÆ\u0003\u0010\rR\u001d\u0010Ç\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÈ\u0003\u0010\u000b\"\u0005\bÉ\u0003\u0010\rR\u001d\u0010Ê\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bË\u0003\u0010\u000b\"\u0005\bÌ\u0003\u0010\rR\u001d\u0010Í\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÎ\u0003\u0010\u000b\"\u0005\bÏ\u0003\u0010\rR\u001d\u0010Ð\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÑ\u0003\u0010\u000b\"\u0005\bÒ\u0003\u0010\rR\u001d\u0010Ó\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÔ\u0003\u0010\u000b\"\u0005\bÕ\u0003\u0010\rR\u001d\u0010Ö\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b×\u0003\u0010\u000b\"\u0005\bØ\u0003\u0010\rR\u001d\u0010Ù\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÚ\u0003\u0010\u000b\"\u0005\bÛ\u0003\u0010\rR\u001d\u0010Ü\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÝ\u0003\u0010\u000b\"\u0005\bÞ\u0003\u0010\rR\u001d\u0010ß\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bà\u0003\u0010\u000b\"\u0005\bá\u0003\u0010\rR\u001d\u0010â\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bã\u0003\u0010\u000b\"\u0005\bä\u0003\u0010\rR\u001d\u0010å\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bæ\u0003\u0010\u000b\"\u0005\bç\u0003\u0010\rR\u001d\u0010è\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bé\u0003\u0010\u000b\"\u0005\bê\u0003\u0010\rR\u001d\u0010ë\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bì\u0003\u0010\u000b\"\u0005\bí\u0003\u0010\rR\u001d\u0010î\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bï\u0003\u0010\u000b\"\u0005\bð\u0003\u0010\rR\u001d\u0010ñ\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bò\u0003\u0010\u000b\"\u0005\bó\u0003\u0010\rR\u001d\u0010ô\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bõ\u0003\u0010\u000b\"\u0005\bö\u0003\u0010\rR\u001d\u0010÷\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bø\u0003\u0010\u000b\"\u0005\bù\u0003\u0010\rR\u001d\u0010ú\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bû\u0003\u0010\u000b\"\u0005\bü\u0003\u0010\rR\u001d\u0010ý\u0003\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bþ\u0003\u0010\u000b\"\u0005\bÿ\u0003\u0010\rR\u001d\u0010\u0080\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0004\u0010\u000b\"\u0005\b\u0082\u0004\u0010\rR\u001d\u0010\u0083\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0004\u0010\u000b\"\u0005\b\u0085\u0004\u0010\rR\u001d\u0010\u0086\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0004\u0010\u000b\"\u0005\b\u0088\u0004\u0010\rR\u001d\u0010\u0089\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0004\u0010\u000b\"\u0005\b\u008b\u0004\u0010\rR\u001d\u0010\u008c\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0004\u0010\u000b\"\u0005\b\u008e\u0004\u0010\rR\u001d\u0010\u008f\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0004\u0010\u000b\"\u0005\b\u0091\u0004\u0010\rR\u001d\u0010\u0092\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0004\u0010\u000b\"\u0005\b\u0094\u0004\u0010\rR\u001d\u0010\u0095\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0004\u0010\u000b\"\u0005\b\u0097\u0004\u0010\rR\u001d\u0010\u0098\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0004\u0010\u000b\"\u0005\b\u009a\u0004\u0010\rR\u001d\u0010\u009b\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0004\u0010\u000b\"\u0005\b\u009d\u0004\u0010\rR\u001d\u0010\u009e\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0004\u0010\u000b\"\u0005\b \u0004\u0010\rR\u001d\u0010¡\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0004\u0010\u000b\"\u0005\b£\u0004\u0010\rR\u001d\u0010¤\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¥\u0004\u0010\u000b\"\u0005\b¦\u0004\u0010\rR\u001d\u0010§\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0004\u0010\u000b\"\u0005\b©\u0004\u0010\rR\u001d\u0010ª\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b«\u0004\u0010\u000b\"\u0005\b¬\u0004\u0010\rR \u0010\u00ad\u0004\u001a\u00030®\u0004X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¯\u0004\u0010°\u0004\"\u0006\b±\u0004\u0010²\u0004R\u001d\u0010³\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b´\u0004\u0010\u000b\"\u0005\bµ\u0004\u0010\rR \u0010¶\u0004\u001a\u00030·\u0004X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¸\u0004\u0010¹\u0004\"\u0006\bº\u0004\u0010»\u0004R\u001d\u0010¼\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b½\u0004\u0010\u000b\"\u0005\b¾\u0004\u0010\rR\u001d\u0010¿\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÀ\u0004\u0010\u000b\"\u0005\bÁ\u0004\u0010\rR\u001d\u0010Â\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÃ\u0004\u0010\u000b\"\u0005\bÄ\u0004\u0010\rR\u001d\u0010Å\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÆ\u0004\u0010\u000b\"\u0005\bÇ\u0004\u0010\rR\u001d\u0010È\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÉ\u0004\u0010\u000b\"\u0005\bÊ\u0004\u0010\rR\u001d\u0010Ë\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÌ\u0004\u0010\u000b\"\u0005\bÍ\u0004\u0010\rR\u001d\u0010Î\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÏ\u0004\u0010\u000b\"\u0005\bÐ\u0004\u0010\rR\u001d\u0010Ñ\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÒ\u0004\u0010\u000b\"\u0005\bÓ\u0004\u0010\rR\u001d\u0010Ô\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÕ\u0004\u0010\u000b\"\u0005\bÖ\u0004\u0010\rR\u001d\u0010×\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bØ\u0004\u0010\u000b\"\u0005\bÙ\u0004\u0010\rR\u001d\u0010Ú\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÛ\u0004\u0010\u000b\"\u0005\bÜ\u0004\u0010\rR\u001d\u0010Ý\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÞ\u0004\u0010\u000b\"\u0005\bß\u0004\u0010\rR\u001d\u0010à\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bá\u0004\u0010\u000b\"\u0005\bâ\u0004\u0010\r¨\u0006ê\u0004"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/BackendViergeResponseData;", "", "()V", "errorCode", "", "errorMessage", "", "errorStatus", "(ILjava/lang/String;Ljava/lang/String;)V", "accessMediumIdentifier", "getAccessMediumIdentifier", "()Ljava/lang/String;", "setAccessMediumIdentifier", "(Ljava/lang/String;)V", "accountId", "getAccountId", "setAccountId", "acquiringInstitutionIdentificationCode", "getAcquiringInstitutionIdentificationCode", "setAcquiringInstitutionIdentificationCode", "additionalAmounts", "getAdditionalAmounts", "setAdditionalAmounts", PassportSDKIntentActivity.ADDITIONAL_DATA, "getAdditionalData", "setAdditionalData", "additionalErrorFlagRequestInTransaction", "getAdditionalErrorFlagRequestInTransaction", "setAdditionalErrorFlagRequestInTransaction", "additionalInfoIndicatorC0", "getAdditionalInfoIndicatorC0", "setAdditionalInfoIndicatorC0", "additionalResponseDate", "getAdditionalResponseDate", "setAdditionalResponseDate", "addlData", "getAddlData", "setAddlData", "aip", "getAip", "setAip", "applPanSeqNum", "getApplPanSeqNum", "setApplPanSeqNum", "applicationVersionNumber", "getApplicationVersionNumber", "setApplicationVersionNumber", "arpc", "getArpc", "setArpc", "arqc", "getArqc", "setArqc", "arqcVerify", "getArqcVerify", "setArqcVerify", SqlContracts.BulletEntry.ATC, "getAtc", "setAtc", "atcCZ", "getAtcCZ", "setAtcCZ", "attendedTerminal", "getAttendedTerminal", "setAttendedTerminal", "authenticationCollectorIndicator", "getAuthenticationCollectorIndicator", "setAuthenticationCollectorIndicator", "authorizationIdResponse", "getAuthorizationIdResponse", "setAuthorizationIdResponse", "authorizationIndicators", "getAuthorizationIndicators", "setAuthorizationIndicators", "authorizationModeIdentifier", "getAuthorizationModeIdentifier", "setAuthorizationModeIdentifier", "binsTableVersion", "getBinsTableVersion", "setBinsTableVersion", "binsUpdateFlag", "getBinsUpdateFlag", "setBinsUpdateFlag", "bitmapB2", "getBitmapB2", "setBitmapB2", "bitmapB3", "getBitmapB3", "setBitmapB3", "captureDate", "getCaptureDate", "setCaptureDate", "cardAcceptorIdCode", "getCardAcceptorIdCode", "setCardAcceptorIdCode", "cardAcceptorNameAndLocation", "getCardAcceptorNameAndLocation", "setCardAcceptorNameAndLocation", "cardAcceptorTerminalId", "getCardAcceptorTerminalId", "setCardAcceptorTerminalId", "cardBin", "getCardBin", "setCardBin", "cardCaptureCapacityIndicator", "getCardCaptureCapacityIndicator", "setCardCaptureCapacityIndicator", "cardExpirationDate", "getCardExpirationDate", "setCardExpirationDate", "cardIssuerCategoryResponseCodeData", "getCardIssuerCategoryResponseCodeData", "setCardIssuerCategoryResponseCodeData", "cardIssuerCode", "getCardIssuerCode", "setCardIssuerCode", ConstantsKt.CARD_NUMBER, "getCardNumber", "setCardNumber", "cardPresenceIndicator", "getCardPresenceIndicator", "setCardPresenceIndicator", ConstantsKt.CARD_TYPE, "Lcom/viergegroup/sdk/taptophone/vierge/models/CardType;", "getCardType", "()Lcom/viergegroup/sdk/taptophone/vierge/models/CardType;", "setCardType", "(Lcom/viergegroup/sdk/taptophone/vierge/models/CardType;)V", "cardVerificationFlag", "getCardVerificationFlag", "setCardVerificationFlag", "cardholderAuthenticationData", "getCardholderAuthenticationData", "setCardholderAuthenticationData", "cardholderPresenceIndicator", "getCardholderPresenceIndicator", "setCardholderPresenceIndicator", "cavvAvvValidationResult", "getCavvAvvValidationResult", "setCavvAvvValidationResult", "cavvCardholderAuthVerValue", "getCavvCardholderAuthVerValue", "setCavvCardholderAuthVerValue", "checkValueEW", "getCheckValueEW", "setCheckValueEW", "checkValueEX", "getCheckValueEX", "setCheckValueEX", "chipherDataBlocks", "", "getChipherDataBlocks", "()Ljava/util/List;", "setChipherDataBlocks", "(Ljava/util/List;)V", "cipherConfiguration", "getCipherConfiguration", "setCipherConfiguration", "cipherCounter", "getCipherCounter", "setCipherCounter", "cipherData", "getCipherData", "setCipherData", "cityExension", "getCityExension", "setCityExension", "clearCipherBlocks", "getClearCipherBlocks", "setClearCipherBlocks", "clearCipherDataEZ", "getClearCipherDataEZ", "setClearCipherDataEZ", "clearCvvLength", "getClearCvvLength", "setClearCvvLength", "clearTrack2", "getClearTrack2", "setClearTrack2", "commercialReferences", "getCommercialReferences", "setCommercialReferences", "completeTrack2Data", "getCompleteTrack2Data", "setCompleteTrack2Data", "counterOfRebroadcastTxn", "getCounterOfRebroadcastTxn", "setCounterOfRebroadcastTxn", "crc32EW", "getCrc32EW", "setCrc32EW", "crc32EX", "getCrc32EX", "setCrc32EX", "crc32EZ", "getCrc32EZ", "setCrc32EZ", "criptoInfoData", "getCriptoInfoData", "setCriptoInfoData", "cv2PresentIndicator", "getCv2PresentIndicator", "setCv2PresentIndicator", "cvmResults", "getCvmResults", "setCvmResults", ConstantsKt.CVV, "getCvv", "setCvv", "cvv2cvc2Result", "getCvv2cvc2Result", "setCvv2cvc2Result", "cvvFlag", "getCvvFlag", "setCvvFlag", "dataElements", "getDataElements", "setDataElements", "dataSuspect", "getDataSuspect", "setDataSuspect", "deferral", "getDeferral", "setDeferral", "devInfo", "getDevInfo", "setDevInfo", "dfName", "getDfName", "setDfName", "dfNameLength", "getDfNameLength", "setDfNameLength", "discretionaryTagData", "getDiscretionaryTagData", "setDiscretionaryTagData", "eCommerceIndicator", "getECommerceIndicator", "setECommerceIndicator", "emvData", "getEmvData", "setEmvData", "emvIssAuthData", "getEmvIssAuthData", "setEmvIssAuthData", "emvLocalTransactionDate", "getEmvLocalTransactionDate", "setEmvLocalTransactionDate", "emvTagsMap", "", "getEmvTagsMap", "()Ljava/util/Map;", "setEmvTagsMap", "(Ljava/util/Map;)V", "emvTermSerialNumber", "getEmvTermSerialNumber", "setEmvTermSerialNumber", "emvTerminalCapabilities", "getEmvTerminalCapabilities", "setEmvTerminalCapabilities", "emvTerminalType", "getEmvTerminalType", "setEmvTerminalType", "emvTransactionType", "getEmvTransactionType", "setEmvTransactionType", "getErrorCode", "()I", "setErrorCode", "(I)V", "getErrorMessage", "setErrorMessage", "errorStatusCode", "getErrorStatusCode", "setErrorStatusCode", "failCipherCounter", "getFailCipherCounter", "setFailCipherCounter", "fileFlagUses", "getFileFlagUses", "setFileFlagUses", "fillerC4", "getFillerC4", "setFillerC4", "flagRequestNewKey", "getFlagRequestNewKey", "setFlagRequestNewKey", "flagTrack2", "getFlagTrack2", "setFlagTrack2", "formFactrInd", "getFormFactrInd", "setFormFactrInd", "hasChip", "", "getHasChip", "()Z", "setHasChip", "(Z)V", "hostType", "Lcom/viergegroup/sdk/taptophone/vierge/models/HostType;", "getHostType", "()Lcom/viergegroup/sdk/taptophone/vierge/models/HostType;", "setHostType", "(Lcom/viergegroup/sdk/taptophone/vierge/models/HostType;)V", "identificationMethodCardHolder", "getIdentificationMethodCardHolder", "setIdentificationMethodCardHolder", "indicatorCE", "getIndicatorCE", "setIndicatorCE", "isoASCII", "getIsoASCII", "setIsoASCII", "isoRCIndicator", "getIsoRCIndicator", "setIsoRCIndicator", "issApplData", "getIssApplData", "setIssApplData", "issApplDataLength", "getIssApplDataLength", "setIssApplDataLength", "issAuthData", "getIssAuthData", "setIssAuthData", "issAuthDataLength", "getIssAuthDataLength", "setIssAuthDataLength", "issScriptData", "getIssScriptData", "setIssScriptData", "issScriptDataLength", "getIssScriptDataLength", "setIssScriptDataLength", "keySerialNumber", "getKeySerialNumber", "setKeySerialNumber", "keyUpdateFlag", "getKeyUpdateFlag", "setKeyUpdateFlag", "ksnEX", "getKsnEX", "setKsnEX", "lastEmvStat", "getLastEmvStat", "setLastEmvStat", "lastPan4Digits", "getLastPan4Digits", "setLastPan4Digits", "localBinsTableIdPrimary", "getLocalBinsTableIdPrimary", "setLocalBinsTableIdPrimary", "localBinsTableIdSecondary", "getLocalBinsTableIdSecondary", "setLocalBinsTableIdSecondary", "localTransactionDate", "getLocalTransactionDate", "setLocalTransactionDate", "localTransactionTime", "getLocalTransactionTime", "setLocalTransactionTime", "merchantCurrencyCode", "getMerchantCurrencyCode", "setMerchantCurrencyCode", "merchantPostalCode", "getMerchantPostalCode", "setMerchantPostalCode", "merchantType", "Lcom/viergegroup/sdk/taptophone/vierge/models/MerchantType;", "getMerchantType", "()Lcom/viergegroup/sdk/taptophone/vierge/models/MerchantType;", "setMerchantType", "(Lcom/viergegroup/sdk/taptophone/vierge/models/MerchantType;)V", "merchantTypeCode", "getMerchantTypeCode", "setMerchantTypeCode", "messageType", "getMessageType", "setMessageType", "metadata", "", "getMetadata", "()[B", "setMetadata", "([B)V", "networkManagmentInformationCode", "getNetworkManagmentInformationCode", "setNetworkManagmentInformationCode", "newKeyRequestStatusEX", "getNewKeyRequestStatusEX", "setNewKeyRequestStatusEX", "numberOfPayments", "getNumberOfPayments", "setNumberOfPayments", "originalDataElements", "getOriginalDataElements", "setOriginalDataElements", "originalRrn", "getOriginalRrn", "setOriginalRrn", "otherAmount", "getOtherAmount", "setOtherAmount", "paymentPlanCode", "getPaymentPlanCode", "setPaymentPlanCode", "paymentPlanType", "Lcom/viergegroup/sdk/taptophone/vierge/models/PaymentPlanType;", "getPaymentPlanType", "()Lcom/viergegroup/sdk/taptophone/vierge/models/PaymentPlanType;", "setPaymentPlanType", "(Lcom/viergegroup/sdk/taptophone/vierge/models/PaymentPlanType;)V", "paymentQ6Data", "getPaymentQ6Data", "setPaymentQ6Data", "pekEX", "getPekEX", "setPekEX", "pointOfServiceConditionCode", "getPointOfServiceConditionCode", "setPointOfServiceConditionCode", "pointOfServiceEntryMode", "Lcom/viergegroup/sdk/taptophone/vierge/models/PointOfServiceEntryMode;", "getPointOfServiceEntryMode", "()Lcom/viergegroup/sdk/taptophone/vierge/models/PointOfServiceEntryMode;", "setPointOfServiceEntryMode", "(Lcom/viergegroup/sdk/taptophone/vierge/models/PointOfServiceEntryMode;)V", "pointOfServiceEntryModeCode", "getPointOfServiceEntryModeCode", "setPointOfServiceEntryModeCode", "posEntryMode", "getPosEntryMode", "setPosEntryMode", "posInvoiceData", "getPosInvoiceData", "setPosInvoiceData", "posPreauthorizationAndChargeBackData", "getPosPreauthorizationAndChargeBackData", "setPosPreauthorizationAndChargeBackData", "posSettlementData", "getPosSettlementData", "setPosSettlementData", "postalCode", "getPostalCode", "setPostalCode", "processingCode", "getProcessingCode", "setProcessingCode", "propensityFlagTradeFraud", "getPropensityFlagTradeFraud", "setPropensityFlagTradeFraud", "randomTkCipherEW", "getRandomTkCipherEW", "setRandomTkCipherEW", "readCardMode", "getReadCardMode", "setReadCardMode", "receivingInstitutionIdCode", "getReceivingInstitutionIdCode", "setReceivingInstitutionIdCode", "replacementAmounts", "getReplacementAmounts", "setReplacementAmounts", "responseCode", "getResponseCode", "setResponseCode", "retailerData", "getRetailerData", "setRetailerData", "routingCode", "getRoutingCode", "setRoutingCode", "routingIndicator", "getRoutingIndicator", "setRoutingIndicator", "rrn", "getRrn", "setRrn", "rsaPaddingEW", "getRsaPaddingEW", "setRsaPaddingEW", "rsaVersionEW", "getRsaVersionEW", "setRsaVersionEW", "rsnOnlyCode", "getRsnOnlyCode", "setRsnOnlyCode", "saleForcedOrSAF", "getSaleForcedOrSAF", "setSaleForcedOrSAF", "serviceTransactionId", "getServiceTransactionId", "setServiceTransactionId", "settlementDate", "getSettlementDate", "setSettlementDate", "specialData", "getSpecialData", "setSpecialData", "statusCodeOfRebroadcastTxn", "getStatusCodeOfRebroadcastTxn", "setStatusCodeOfRebroadcastTxn", "statusIndicatorC4", "getStatusIndicatorC4", "setStatusIndicatorC4", "systemTraceAuditNumber", "getSystemTraceAuditNumber", "setSystemTraceAuditNumber", "terminalActivationByCardholder", "getTerminalActivationByCardholder", "setTerminalActivationByCardholder", "terminalAddressBranch", "getTerminalAddressBranch", "setTerminalAddressBranch", "terminalCountryCode", "getTerminalCountryCode", "setTerminalCountryCode", "terminalData", "getTerminalData", "setTerminalData", "terminalEntryCapabilities", "getTerminalEntryCapabilities", "setTerminalEntryCapabilities", "terminalLocator", "getTerminalLocator", "setTerminalLocator", "terminalOperationIndex", "getTerminalOperationIndex", "setTerminalOperationIndex", "terminalSerialNumber", "getTerminalSerialNumber", "setTerminalSerialNumber", "terminalSoftwareVersion", "getTerminalSoftwareVersion", "setTerminalSoftwareVersion", "tkEW", "getTkEW", "setTkEW", "track1Flag", "getTrack1Flag", "setTrack1Flag", EglobalUtils.TRACK2, "getTrack2", "setTrack2", "track2Length", "getTrack2Length", "setTrack2Length", "transDate", "getTransDate", "setTransDate", "transactionAmount", "getTransactionAmount", "setTransactionAmount", "transactionCurrencyCode", "getTransactionCurrencyCode", "setTransactionCurrencyCode", "transactionDateTime", "Ljava/util/Date;", "getTransactionDateTime", "()Ljava/util/Date;", "setTransactionDateTime", "(Ljava/util/Date;)V", "transactionSecurityLevel", "getTransactionSecurityLevel", "setTransactionSecurityLevel", "transactionType", "Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionType;", "getTransactionType", "()Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionType;", "setTransactionType", "(Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionType;)V", "transactionTypeCode", "getTransactionTypeCode", "setTransactionTypeCode", "transferDataIndicator", "getTransferDataIndicator", "setTransferDataIndicator", "transmisionDateAndTime", "getTransmisionDateAndTime", "setTransmisionDateAndTime", "tvr", "getTvr", "setTvr", "unpredictableNumber", "getUnpredictableNumber", "setUnpredictableNumber", "userField1B2", "getUserField1B2", "setUserField1B2", "userField1B3", "getUserField1B3", "setUserField1B3", "userField1B5", "getUserField1B5", "setUserField1B5", "userField1C0", "getUserField1C0", "setUserField1C0", "userField2B3", "getUserField2B3", "setUserField2B3", "userFieldACICZ", "getUserFieldACICZ", "setUserFieldACICZ", "userFieldQ1", "getUserFieldQ1", "setUserFieldQ1", "xid", "getXid", "setXid", "applyForReverse", "describeError", "getField", "fieldName", "setField", "", "value", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BackendViergeResponseData {

    @NotNull
    public String A;

    @NotNull
    public String A0;

    @NotNull
    public String A1;

    @NotNull
    public String A2;

    @NotNull
    public String B;

    @NotNull
    public String B0;

    @NotNull
    public String B1;

    @NotNull
    public String B2;

    @NotNull
    public String C;

    @NotNull
    public String C0;

    @NotNull
    public String C1;

    @NotNull
    public Map<String, String> C2;

    @NotNull
    public String D;

    @NotNull
    public String D0;

    @NotNull
    public String D1;

    @NotNull
    public Date D2;

    @NotNull
    public String E;

    @NotNull
    public String E0;

    @NotNull
    public String E1;

    @NotNull
    public String E2;

    @NotNull
    public String F;

    @NotNull
    public String F0;

    @NotNull
    public String F1;

    @NotNull
    public String F2;

    @NotNull
    public String G;

    @NotNull
    public String G0;

    @NotNull
    public String G1;

    @NotNull
    public String H;

    @NotNull
    public String H0;

    @NotNull
    public String H1;

    @NotNull
    public String I;

    @NotNull
    public String I0;

    @NotNull
    public String I1;

    @NotNull
    public String J;

    @NotNull
    public String J0;

    @NotNull
    public String J1;

    @NotNull
    public String K;

    @NotNull
    public String K0;

    @NotNull
    public String K1;

    @NotNull
    public String L;

    @NotNull
    public String L0;

    @NotNull
    public String L1;

    @NotNull
    public String M;

    @NotNull
    public String M0;

    @NotNull
    public String M1;

    @NotNull
    public String N;

    @NotNull
    public String N0;

    @NotNull
    public String N1;

    @NotNull
    public String O;

    @NotNull
    public String O0;

    @NotNull
    public String O1;

    @NotNull
    public String P;

    @NotNull
    public String P0;

    @NotNull
    public String P1;

    @NotNull
    public String Q;

    @NotNull
    public String Q0;

    @NotNull
    public String Q1;

    @NotNull
    public String R;

    @NotNull
    public String R0;

    @NotNull
    public String R1;

    @NotNull
    public String S;

    @NotNull
    public String S0;

    @NotNull
    public String S1;

    @NotNull
    public String T;

    @NotNull
    public String T0;

    @NotNull
    public String T1;

    @NotNull
    public String U;

    @NotNull
    public String U0;

    @NotNull
    public String U1;

    @NotNull
    public String V;

    @NotNull
    public String V0;

    @NotNull
    public String V1;

    @NotNull
    public String W;

    @NotNull
    public String W0;

    @NotNull
    public String W1;

    @NotNull
    public String X;

    @NotNull
    public String X0;

    @NotNull
    public String X1;

    @NotNull
    public String Y;

    @NotNull
    public String Y0;

    @NotNull
    public String Y1;

    @NotNull
    public String Z;

    @NotNull
    public String Z0;

    @NotNull
    public String Z1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67869a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public String f67870a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    @NotNull
    public String f67871a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    @NotNull
    public String f67872a2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f67873b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public String f67874b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    @NotNull
    public String f67875b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    @NotNull
    public String f67876b2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f67877c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public String f67878c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    @NotNull
    public String f67879c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    @NotNull
    public String f67880c2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public HostType f67881d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public String f67882d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    @NotNull
    public String f67883d1;

    @NotNull
    public String d2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public MerchantType f67884e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public String f67885e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    @NotNull
    public String f67886e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    @NotNull
    public String f67887e2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public TransactionType f67888f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public String f67889f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    @NotNull
    public String f67890f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    @NotNull
    public String f67891f2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public PointOfServiceEntryMode f67892g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NotNull
    public String f67893g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    @NotNull
    public String f67894g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    @NotNull
    public String f67895g2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public CardType f67896h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @NotNull
    public String f67897h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    @NotNull
    public String f67898h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    @NotNull
    public String f67899h2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public PaymentPlanType f67900i;

    @NotNull
    public String i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    @NotNull
    public String f67901i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    @NotNull
    public String f67902i2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f67903j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @NotNull
    public String f67904j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    @NotNull
    public String f67905j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    @NotNull
    public String f67906j2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public String f67907k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @NotNull
    public String f67908k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    @NotNull
    public String f67909k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    @NotNull
    public String f67910k2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public String f67911l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @NotNull
    public String f67912l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    @NotNull
    public String f67913l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    @NotNull
    public String f67914l2;

    @NotNull
    public String m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @NotNull
    public String f67915m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    @NotNull
    public String f67916m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    @NotNull
    public String f67917m2;
    public byte[] metadata;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public String f67918n;

    @NotNull
    public String n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    @NotNull
    public String f67919n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    @NotNull
    public String f67920n2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public String f67921o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @NotNull
    public String f67922o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    @NotNull
    public String f67923o1;

    @NotNull
    public String o2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public String f67924p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public String f67925p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    public String f67926p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    public String f67927p2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public String f67928q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public String f67929q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    @NotNull
    public String f67930q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    @NotNull
    public String f67931q2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public String f67932r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public String f67933r0;

    @NotNull
    public String r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    @NotNull
    public String f67934r2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public String f67935s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public String f67936s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    @NotNull
    public List<String> f67937s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    @NotNull
    public String f67938s2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public String f67939t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public String f67940t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    @NotNull
    public List<String> f67941t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    @NotNull
    public String f67942t2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public String f67943u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public String f67944u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    @NotNull
    public String f67945u1;

    @NotNull
    public String u2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public String f67946v;

    @NotNull
    public String v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    @NotNull
    public String f67947v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    @NotNull
    public String f67948v2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public String f67949w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public String f67950w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    @NotNull
    public String f67951w1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    @NotNull
    public String f67952w2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public String f67953x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public String f67954x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @NotNull
    public String f67955x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @NotNull
    public String f67956x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public String f67957y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public String f67958y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @NotNull
    public String f67959y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @NotNull
    public String f67960y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public String f67961z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    @NotNull
    public String f67962z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    @NotNull
    public String f67963z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    @NotNull
    public String f67964z2;

    public BackendViergeResponseData() {
        this.f67873b = "";
        this.f67877c = "";
        this.f67881d = HostType.TestingDUKPTHost;
        this.f67884e = MerchantType.Undefined;
        this.f67888f = TransactionType.Undefined;
        this.f67892g = PointOfServiceEntryMode.Undefined;
        this.f67896h = CardType.Undefined;
        this.f67900i = PaymentPlanType.Undefined;
        this.f67907k = "";
        this.f67911l = "";
        this.m = "";
        this.f67918n = "";
        this.f67921o = "";
        this.f67924p = "";
        this.f67928q = "";
        this.f67932r = "";
        this.f67935s = "";
        this.f67939t = "";
        this.f67943u = "";
        this.f67946v = "";
        this.f67949w = "";
        this.f67953x = "";
        this.f67957y = "";
        this.f67961z = "";
        this.A = "";
        this.B = "";
        this.C = "";
        this.D = "";
        this.E = "";
        this.F = "";
        this.G = "";
        this.H = "";
        this.I = "";
        this.J = "";
        this.K = "";
        this.L = "";
        this.M = "";
        this.N = "";
        this.O = "";
        this.P = "";
        this.Q = "";
        this.R = "";
        this.S = "";
        this.T = "";
        this.U = "";
        this.V = "";
        this.W = "";
        this.X = "";
        this.Y = "";
        this.Z = "";
        this.f67870a0 = "";
        this.f67874b0 = "";
        this.f67878c0 = "";
        this.f67882d0 = "";
        this.f67885e0 = "";
        this.f67889f0 = "";
        this.f67893g0 = "";
        this.f67897h0 = "";
        this.i0 = "";
        this.f67904j0 = "";
        this.f67908k0 = "";
        this.f67912l0 = "";
        this.f67915m0 = "";
        this.n0 = "";
        this.f67922o0 = "";
        this.f67925p0 = "";
        this.f67929q0 = "";
        this.f67933r0 = "";
        this.f67936s0 = "";
        this.f67940t0 = "";
        this.f67944u0 = " ";
        this.v0 = "";
        this.f67950w0 = "";
        this.f67954x0 = "";
        this.f67958y0 = "";
        this.f67962z0 = "";
        this.A0 = "";
        this.B0 = "";
        this.C0 = "";
        this.D0 = "";
        this.E0 = "";
        this.F0 = "";
        this.G0 = "";
        this.H0 = "";
        this.I0 = "";
        this.J0 = "";
        this.K0 = "";
        this.L0 = "";
        this.M0 = "";
        this.N0 = "";
        this.O0 = "";
        this.P0 = "";
        this.Q0 = "";
        this.R0 = "";
        this.S0 = "";
        this.T0 = "";
        this.U0 = "";
        this.V0 = "";
        this.W0 = "";
        this.X0 = "";
        this.Y0 = "";
        this.Z0 = "";
        this.f67871a1 = "";
        this.f67875b1 = "";
        this.f67879c1 = "";
        this.f67883d1 = "";
        this.f67886e1 = "";
        this.f67890f1 = "";
        this.f67894g1 = "";
        this.f67898h1 = "";
        this.f67901i1 = "";
        this.f67905j1 = "";
        this.f67909k1 = "";
        this.f67913l1 = "";
        this.f67916m1 = "";
        this.f67919n1 = "";
        this.f67923o1 = "";
        this.f67926p1 = "";
        this.f67930q1 = "";
        this.r1 = "";
        this.f67937s1 = new ArrayList();
        this.f67941t1 = new ArrayList();
        this.f67945u1 = "";
        this.f67947v1 = "";
        this.f67951w1 = "";
        this.f67955x1 = "";
        this.f67959y1 = "";
        this.f67963z1 = "";
        this.A1 = "";
        this.B1 = "";
        this.C1 = "";
        this.D1 = "";
        this.E1 = "";
        this.F1 = "";
        this.G1 = "";
        this.H1 = "";
        this.I1 = "";
        this.J1 = "";
        this.K1 = "";
        this.L1 = "";
        this.M1 = "";
        this.N1 = "";
        this.O1 = "";
        this.P1 = "";
        this.Q1 = "";
        this.R1 = "";
        this.S1 = "";
        this.T1 = "";
        this.U1 = "";
        this.V1 = "";
        this.W1 = "";
        this.X1 = "";
        this.Y1 = "";
        this.Z1 = "";
        this.f67872a2 = "";
        this.f67876b2 = "";
        this.f67880c2 = "";
        this.d2 = "";
        this.f67887e2 = "";
        this.f67891f2 = "";
        this.f67895g2 = "";
        this.f67899h2 = "";
        this.f67902i2 = "";
        this.f67906j2 = "";
        this.f67910k2 = "";
        this.f67914l2 = "";
        this.f67917m2 = "";
        this.f67920n2 = "";
        this.o2 = "";
        this.f67927p2 = "";
        this.f67931q2 = "";
        this.f67934r2 = "";
        this.f67938s2 = "";
        this.f67942t2 = "";
        this.u2 = "";
        this.f67948v2 = "";
        this.f67952w2 = "";
        this.f67956x2 = "";
        this.f67960y2 = "";
        this.f67964z2 = "";
        this.A2 = "";
        this.B2 = "";
        this.C2 = new LinkedHashMap();
        this.D2 = new Date();
        this.E2 = "";
        this.F2 = "";
    }

    public final boolean applyForReverse() {
        return this.f67888f.getTransactionMessageType() == TransactionMessageType.Financial;
    }

    @NotNull
    public final String describeError() {
        return z1.c("ERRORCODE:[", this.f67869a, "] MSG:[", this.f67873b, Constant.BRACKET_CLOSE);
    }

    @NotNull
    /* JADX INFO: renamed from: getAccessMediumIdentifier, reason: from getter */
    public final String getF67904j0() {
        return this.f67904j0;
    }

    @NotNull
    /* JADX INFO: renamed from: getAccountId, reason: from getter */
    public final String getY() {
        return this.Y;
    }

    @NotNull
    /* JADX INFO: renamed from: getAcquiringInstitutionIdentificationCode, reason: from getter */
    public final String getD() {
        return this.D;
    }

    @NotNull
    /* JADX INFO: renamed from: getAdditionalAmounts, reason: from getter */
    public final String getO() {
        return this.O;
    }

    @NotNull
    /* JADX INFO: renamed from: getAdditionalData, reason: from getter */
    public final String getS() {
        return this.S;
    }

    @NotNull
    /* JADX INFO: renamed from: getAdditionalErrorFlagRequestInTransaction, reason: from getter */
    public final String getF67922o0() {
        return this.f67922o0;
    }

    @NotNull
    /* JADX INFO: renamed from: getAdditionalInfoIndicatorC0, reason: from getter */
    public final String getC0() {
        return this.C0;
    }

    @NotNull
    /* JADX INFO: renamed from: getAdditionalResponseDate, reason: from getter */
    public final String getL() {
        return this.L;
    }

    @NotNull
    /* JADX INFO: renamed from: getAddlData, reason: from getter */
    public final String getU2() {
        return this.u2;
    }

    @NotNull
    /* JADX INFO: renamed from: getAip, reason: from getter */
    public final String getM1() {
        return this.M1;
    }

    @NotNull
    /* JADX INFO: renamed from: getApplPanSeqNum, reason: from getter */
    public final String getF67914l2() {
        return this.f67914l2;
    }

    @NotNull
    /* JADX INFO: renamed from: getApplicationVersionNumber, reason: from getter */
    public final String getD2() {
        return this.d2;
    }

    @NotNull
    /* JADX INFO: renamed from: getArpc, reason: from getter */
    public final String getF67942t2() {
        return this.f67942t2;
    }

    @NotNull
    /* JADX INFO: renamed from: getArqc, reason: from getter */
    public final String getN1() {
        return this.N1;
    }

    @NotNull
    /* JADX INFO: renamed from: getArqcVerify, reason: from getter */
    public final String getO2() {
        return this.o2;
    }

    @NotNull
    /* JADX INFO: renamed from: getAtc, reason: from getter */
    public final String getO1() {
        return this.O1;
    }

    @NotNull
    /* JADX INFO: renamed from: getAtcCZ, reason: from getter */
    public final String getX0() {
        return this.X0;
    }

    @NotNull
    /* JADX INFO: renamed from: getAttendedTerminal, reason: from getter */
    public final String getG0() {
        return this.G0;
    }

    @NotNull
    /* JADX INFO: renamed from: getAuthenticationCollectorIndicator, reason: from getter */
    public final String getD0() {
        return this.D0;
    }

    @NotNull
    /* JADX INFO: renamed from: getAuthorizationIdResponse, reason: from getter */
    public final String getF() {
        return this.F;
    }

    @NotNull
    /* JADX INFO: renamed from: getAuthorizationIndicators, reason: from getter */
    public final String getF67870a0() {
        return this.f67870a0;
    }

    @NotNull
    /* JADX INFO: renamed from: getAuthorizationModeIdentifier, reason: from getter */
    public final String getF67897h0() {
        return this.f67897h0;
    }

    @NotNull
    /* JADX INFO: renamed from: getBinsTableVersion, reason: from getter */
    public final String getF67930q1() {
        return this.f67930q1;
    }

    @NotNull
    /* JADX INFO: renamed from: getBinsUpdateFlag, reason: from getter */
    public final String getF67964z2() {
        return this.f67964z2;
    }

    @NotNull
    /* JADX INFO: renamed from: getBitmapB2, reason: from getter */
    public final String getH1() {
        return this.H1;
    }

    @NotNull
    /* JADX INFO: renamed from: getBitmapB3, reason: from getter */
    public final String getW1() {
        return this.W1;
    }

    @NotNull
    /* JADX INFO: renamed from: getCaptureDate, reason: from getter */
    public final String getF67946v() {
        return this.f67946v;
    }

    @NotNull
    /* JADX INFO: renamed from: getCardAcceptorIdCode, reason: from getter */
    public final String getJ() {
        return this.J;
    }

    @NotNull
    /* JADX INFO: renamed from: getCardAcceptorNameAndLocation, reason: from getter */
    public final String getK() {
        return this.K;
    }

    @NotNull
    /* JADX INFO: renamed from: getCardAcceptorTerminalId, reason: from getter */
    public final String getI() {
        return this.I;
    }

    @NotNull
    /* JADX INFO: renamed from: getCardBin, reason: from getter */
    public final String getF67911l() {
        return this.f67911l;
    }

    @NotNull
    /* JADX INFO: renamed from: getCardCaptureCapacityIndicator, reason: from getter */
    public final String getL0() {
        return this.L0;
    }

    @NotNull
    /* JADX INFO: renamed from: getCardExpirationDate, reason: from getter */
    public final String getF67918n() {
        return this.f67918n;
    }

    @NotNull
    /* JADX INFO: renamed from: getCardIssuerCategoryResponseCodeData, reason: from getter */
    public final String getQ() {
        return this.Q;
    }

    @NotNull
    /* JADX INFO: renamed from: getCardIssuerCode, reason: from getter */
    public final String getF67874b0() {
        return this.f67874b0;
    }

    @NotNull
    /* JADX INFO: renamed from: getCardNumber, reason: from getter */
    public final String getM() {
        return this.m;
    }

    @NotNull
    /* JADX INFO: renamed from: getCardPresenceIndicator, reason: from getter */
    public final String getK0() {
        return this.K0;
    }

    @NotNull
    /* JADX INFO: renamed from: getCardType, reason: from getter */
    public final CardType getF67896h() {
        return this.f67896h;
    }

    @NotNull
    /* JADX INFO: renamed from: getCardVerificationFlag, reason: from getter */
    public final String getF67929q0() {
        return this.f67929q0;
    }

    @NotNull
    /* JADX INFO: renamed from: getCardholderAuthenticationData, reason: from getter */
    public final String getW0() {
        return this.W0;
    }

    @NotNull
    /* JADX INFO: renamed from: getCardholderPresenceIndicator, reason: from getter */
    public final String getJ0() {
        return this.J0;
    }

    @NotNull
    /* JADX INFO: renamed from: getCavvAvvValidationResult, reason: from getter */
    public final String getF0() {
        return this.F0;
    }

    @NotNull
    /* JADX INFO: renamed from: getCavvCardholderAuthVerValue, reason: from getter */
    public final String getU0() {
        return this.U0;
    }

    @NotNull
    /* JADX INFO: renamed from: getCheckValueEW, reason: from getter */
    public final String getF67905j1() {
        return this.f67905j1;
    }

    @NotNull
    /* JADX INFO: renamed from: getCheckValueEX, reason: from getter */
    public final String getF67879c1() {
        return this.f67879c1;
    }

    @NotNull
    public final List<String> getChipherDataBlocks() {
        return this.f67941t1;
    }

    @NotNull
    /* JADX INFO: renamed from: getCipherConfiguration, reason: from getter */
    public final String getF67919n1() {
        return this.f67919n1;
    }

    @NotNull
    /* JADX INFO: renamed from: getCipherCounter, reason: from getter */
    public final String getF67951w1() {
        return this.f67951w1;
    }

    @NotNull
    /* JADX INFO: renamed from: getCipherData, reason: from getter */
    public final String getE1() {
        return this.E1;
    }

    @NotNull
    /* JADX INFO: renamed from: getCityExension, reason: from getter */
    public final String getF67933r0() {
        return this.f67933r0;
    }

    @NotNull
    public final List<String> getClearCipherBlocks() {
        return this.f67937s1;
    }

    @NotNull
    /* JADX INFO: renamed from: getClearCipherDataEZ, reason: from getter */
    public final String getF67945u1() {
        return this.f67945u1;
    }

    @NotNull
    /* JADX INFO: renamed from: getClearCvvLength, reason: from getter */
    public final String getC1() {
        return this.C1;
    }

    @NotNull
    /* JADX INFO: renamed from: getClearTrack2, reason: from getter */
    public final String getA() {
        return this.A;
    }

    @NotNull
    /* JADX INFO: renamed from: getCommercialReferences, reason: from getter */
    public final String getF67893g0() {
        return this.f67893g0;
    }

    @NotNull
    /* JADX INFO: renamed from: getCompleteTrack2Data, reason: from getter */
    public final String getF67936s0() {
        return this.f67936s0;
    }

    @NotNull
    /* JADX INFO: renamed from: getCounterOfRebroadcastTxn, reason: from getter */
    public final String getF67954x0() {
        return this.f67954x0;
    }

    @NotNull
    /* JADX INFO: renamed from: getCrc32EW, reason: from getter */
    public final String getF67909k1() {
        return this.f67909k1;
    }

    @NotNull
    /* JADX INFO: renamed from: getCrc32EX, reason: from getter */
    public final String getF67886e1() {
        return this.f67886e1;
    }

    @NotNull
    /* JADX INFO: renamed from: getCrc32EZ, reason: from getter */
    public final String getG1() {
        return this.G1;
    }

    @NotNull
    /* JADX INFO: renamed from: getCriptoInfoData, reason: from getter */
    public final String getJ1() {
        return this.J1;
    }

    @NotNull
    /* JADX INFO: renamed from: getCv2PresentIndicator, reason: from getter */
    public final String getB0() {
        return this.B0;
    }

    @NotNull
    /* JADX INFO: renamed from: getCvmResults, reason: from getter */
    public final String getF67887e2() {
        return this.f67887e2;
    }

    @NotNull
    /* JADX INFO: renamed from: getCvv, reason: from getter */
    public final String getC() {
        return this.C;
    }

    @NotNull
    /* JADX INFO: renamed from: getCvv2cvc2Result, reason: from getter */
    public final String getV0() {
        return this.v0;
    }

    @NotNull
    /* JADX INFO: renamed from: getCvvFlag, reason: from getter */
    public final String getB1() {
        return this.B1;
    }

    @NotNull
    /* JADX INFO: renamed from: getDataElements, reason: from getter */
    public final String getT() {
        return this.T;
    }

    @NotNull
    /* JADX INFO: renamed from: getDataSuspect, reason: from getter */
    public final String getF67910k2() {
        return this.f67910k2;
    }

    @NotNull
    /* JADX INFO: renamed from: getDeferral, reason: from getter */
    public final String getF67908k0() {
        return this.f67908k0;
    }

    @NotNull
    /* JADX INFO: renamed from: getDevInfo, reason: from getter */
    public final String getF67917m2() {
        return this.f67917m2;
    }

    @NotNull
    /* JADX INFO: renamed from: getDfName, reason: from getter */
    public final String getF67895g2() {
        return this.f67895g2;
    }

    @NotNull
    /* JADX INFO: renamed from: getDfNameLength, reason: from getter */
    public final String getF67891f2() {
        return this.f67891f2;
    }

    @NotNull
    /* JADX INFO: renamed from: getDiscretionaryTagData, reason: from getter */
    public final String getF2() {
        return this.F2;
    }

    @NotNull
    /* JADX INFO: renamed from: getECommerceIndicator, reason: from getter */
    public final String getF67962z0() {
        return this.f67962z0;
    }

    @NotNull
    /* JADX INFO: renamed from: getEmvData, reason: from getter */
    public final String getB2() {
        return this.B2;
    }

    @NotNull
    /* JADX INFO: renamed from: getEmvIssAuthData, reason: from getter */
    public final String getF67934r2() {
        return this.f67934r2;
    }

    @NotNull
    /* JADX INFO: renamed from: getEmvLocalTransactionDate, reason: from getter */
    public final String getF67876b2() {
        return this.f67876b2;
    }

    @NotNull
    public final Map<String, String> getEmvTagsMap() {
        return this.C2;
    }

    @NotNull
    /* JADX INFO: renamed from: getEmvTermSerialNumber, reason: from getter */
    public final String getX1() {
        return this.X1;
    }

    @NotNull
    /* JADX INFO: renamed from: getEmvTerminalCapabilities, reason: from getter */
    public final String getY1() {
        return this.Y1;
    }

    @NotNull
    /* JADX INFO: renamed from: getEmvTerminalType, reason: from getter */
    public final String getF67880c2() {
        return this.f67880c2;
    }

    @NotNull
    /* JADX INFO: renamed from: getEmvTransactionType, reason: from getter */
    public final String getS1() {
        return this.S1;
    }

    /* JADX INFO: renamed from: getErrorCode, reason: from getter */
    public final int getF67869a() {
        return this.f67869a;
    }

    @NotNull
    /* JADX INFO: renamed from: getErrorMessage, reason: from getter */
    public final String getF67873b() {
        return this.f67873b;
    }

    @NotNull
    /* JADX INFO: renamed from: getErrorStatusCode, reason: from getter */
    public final String getF67877c() {
        return this.f67877c;
    }

    @NotNull
    /* JADX INFO: renamed from: getFailCipherCounter, reason: from getter */
    public final String getF67955x1() {
        return this.f67955x1;
    }

    @NotNull
    public final String getField(@NotNull String fieldName) throws IllegalAccessException, NoSuchFieldException {
        Intrinsics.checkNotNullParameter(fieldName, "");
        Field declaredField = BackendViergeResponseData.class.getDeclaredField(fieldName);
        Intrinsics.checkNotNullExpressionValue(declaredField, "");
        Object obj = declaredField.get(this);
        Intrinsics.checkNotNull(obj);
        return (String) obj;
    }

    @NotNull
    /* JADX INFO: renamed from: getFileFlagUses, reason: from getter */
    public final String getF67940t0() {
        return this.f67940t0;
    }

    @NotNull
    /* JADX INFO: renamed from: getFillerC4, reason: from getter */
    public final String getS0() {
        return this.S0;
    }

    @NotNull
    /* JADX INFO: renamed from: getFlagRequestNewKey, reason: from getter */
    public final String getR1() {
        return this.r1;
    }

    @NotNull
    /* JADX INFO: renamed from: getFlagTrack2, reason: from getter */
    public final String getF67959y1() {
        return this.f67959y1;
    }

    @NotNull
    /* JADX INFO: renamed from: getFormFactrInd, reason: from getter */
    public final String getY0() {
        return this.Y0;
    }

    /* JADX INFO: renamed from: getHasChip, reason: from getter */
    public final boolean getF67903j() {
        return this.f67903j;
    }

    @NotNull
    /* JADX INFO: renamed from: getHostType, reason: from getter */
    public final HostType getF67881d() {
        return this.f67881d;
    }

    @NotNull
    /* JADX INFO: renamed from: getIdentificationMethodCardHolder, reason: from getter */
    public final String getR0() {
        return this.R0;
    }

    @NotNull
    /* JADX INFO: renamed from: getIndicatorCE, reason: from getter */
    public final String getV0() {
        return this.V0;
    }

    @NotNull
    /* JADX INFO: renamed from: getIsoASCII, reason: from getter */
    public final String getA2() {
        return this.A2;
    }

    @NotNull
    /* JADX INFO: renamed from: getIsoRCIndicator, reason: from getter */
    public final String getF67927p2() {
        return this.f67927p2;
    }

    @NotNull
    /* JADX INFO: renamed from: getIssApplData, reason: from getter */
    public final String getV1() {
        return this.V1;
    }

    @NotNull
    /* JADX INFO: renamed from: getIssApplDataLength, reason: from getter */
    public final String getU1() {
        return this.U1;
    }

    @NotNull
    /* JADX INFO: renamed from: getIssAuthData, reason: from getter */
    public final String getF67938s2() {
        return this.f67938s2;
    }

    @NotNull
    /* JADX INFO: renamed from: getIssAuthDataLength, reason: from getter */
    public final String getF67948v2() {
        return this.f67948v2;
    }

    @NotNull
    /* JADX INFO: renamed from: getIssScriptData, reason: from getter */
    public final String getF67956x2() {
        return this.f67956x2;
    }

    @NotNull
    /* JADX INFO: renamed from: getIssScriptDataLength, reason: from getter */
    public final String getF67952w2() {
        return this.f67952w2;
    }

    @NotNull
    /* JADX INFO: renamed from: getKeySerialNumber, reason: from getter */
    public final String getF67947v1() {
        return this.f67947v1;
    }

    @NotNull
    /* JADX INFO: renamed from: getKeyUpdateFlag, reason: from getter */
    public final String getF67960y2() {
        return this.f67960y2;
    }

    @NotNull
    /* JADX INFO: renamed from: getKsnEX, reason: from getter */
    public final String getF67875b1() {
        return this.f67875b1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLastEmvStat, reason: from getter */
    public final String getF67906j2() {
        return this.f67906j2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLastPan4Digits, reason: from getter */
    public final String getF1() {
        return this.F1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLocalBinsTableIdPrimary, reason: from getter */
    public final String getF67923o1() {
        return this.f67923o1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLocalBinsTableIdSecondary, reason: from getter */
    public final String getF67926p1() {
        return this.f67926p1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLocalTransactionDate, reason: from getter */
    public final String getF67939t() {
        return this.f67939t;
    }

    @NotNull
    /* JADX INFO: renamed from: getLocalTransactionTime, reason: from getter */
    public final String getF67935s() {
        return this.f67935s;
    }

    @NotNull
    /* JADX INFO: renamed from: getMerchantCurrencyCode, reason: from getter */
    public final String getF67953x() {
        return this.f67953x;
    }

    @NotNull
    /* JADX INFO: renamed from: getMerchantPostalCode, reason: from getter */
    public final String getF67958y0() {
        return this.f67958y0;
    }

    @NotNull
    /* JADX INFO: renamed from: getMerchantType, reason: from getter */
    public final MerchantType getF67884e() {
        return this.f67884e;
    }

    @NotNull
    /* JADX INFO: renamed from: getMerchantTypeCode, reason: from getter */
    public final String getF67949w() {
        return this.f67949w;
    }

    @NotNull
    /* JADX INFO: renamed from: getMessageType, reason: from getter */
    public final String getF67907k() {
        return this.f67907k;
    }

    @NotNull
    public final byte[] getMetadata() {
        byte[] bArr = this.metadata;
        if (bArr != null) {
            return bArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getNetworkManagmentInformationCode, reason: from getter */
    public final String getU() {
        return this.U;
    }

    @NotNull
    /* JADX INFO: renamed from: getNewKeyRequestStatusEX, reason: from getter */
    public final String getF67883d1() {
        return this.f67883d1;
    }

    @NotNull
    /* JADX INFO: renamed from: getNumberOfPayments, reason: from getter */
    public final String getF67912l0() {
        return this.f67912l0;
    }

    @NotNull
    /* JADX INFO: renamed from: getOriginalDataElements, reason: from getter */
    public final String getV() {
        return this.V;
    }

    @NotNull
    /* JADX INFO: renamed from: getOriginalRrn, reason: from getter */
    public final String getG() {
        return this.G;
    }

    @NotNull
    /* JADX INFO: renamed from: getOtherAmount, reason: from getter */
    public final String getL1() {
        return this.L1;
    }

    @NotNull
    /* JADX INFO: renamed from: getPaymentPlanCode, reason: from getter */
    public final String getF67915m0() {
        return this.f67915m0;
    }

    @NotNull
    /* JADX INFO: renamed from: getPaymentPlanType, reason: from getter */
    public final PaymentPlanType getF67900i() {
        return this.f67900i;
    }

    @NotNull
    /* JADX INFO: renamed from: getPaymentQ6Data, reason: from getter */
    public final String getN0() {
        return this.n0;
    }

    @NotNull
    /* JADX INFO: renamed from: getPekEX, reason: from getter */
    public final String getF67871a1() {
        return this.f67871a1;
    }

    @NotNull
    /* JADX INFO: renamed from: getPointOfServiceConditionCode, reason: from getter */
    public final String getF67961z() {
        return this.f67961z;
    }

    @NotNull
    /* JADX INFO: renamed from: getPointOfServiceEntryMode, reason: from getter */
    public final PointOfServiceEntryMode getF67892g() {
        return this.f67892g;
    }

    @NotNull
    /* JADX INFO: renamed from: getPointOfServiceEntryModeCode, reason: from getter */
    public final String getF67957y() {
        return this.f67957y;
    }

    @NotNull
    /* JADX INFO: renamed from: getPosEntryMode, reason: from getter */
    public final String getF67899h2() {
        return this.f67899h2;
    }

    @NotNull
    /* JADX INFO: renamed from: getPosInvoiceData, reason: from getter */
    public final String getF67878c0() {
        return this.f67878c0;
    }

    @NotNull
    /* JADX INFO: renamed from: getPosPreauthorizationAndChargeBackData, reason: from getter */
    public final String getF67889f0() {
        return this.f67889f0;
    }

    @NotNull
    /* JADX INFO: renamed from: getPosSettlementData, reason: from getter */
    public final String getF67885e0() {
        return this.f67885e0;
    }

    @NotNull
    /* JADX INFO: renamed from: getPostalCode, reason: from getter */
    public final String getR() {
        return this.R;
    }

    @NotNull
    /* JADX INFO: renamed from: getProcessingCode, reason: from getter */
    public final String getF67921o() {
        return this.f67921o;
    }

    @NotNull
    /* JADX INFO: renamed from: getPropensityFlagTradeFraud, reason: from getter */
    public final String getE0() {
        return this.E0;
    }

    @NotNull
    /* JADX INFO: renamed from: getRandomTkCipherEW, reason: from getter */
    public final String getF67894g1() {
        return this.f67894g1;
    }

    @NotNull
    /* JADX INFO: renamed from: getReadCardMode, reason: from getter */
    public final String getF67963z1() {
        return this.f67963z1;
    }

    @NotNull
    /* JADX INFO: renamed from: getReceivingInstitutionIdCode, reason: from getter */
    public final String getX() {
        return this.X;
    }

    @NotNull
    /* JADX INFO: renamed from: getReplacementAmounts, reason: from getter */
    public final String getW() {
        return this.W;
    }

    @NotNull
    /* JADX INFO: renamed from: getResponseCode, reason: from getter */
    public final String getH() {
        return this.H;
    }

    @NotNull
    /* JADX INFO: renamed from: getRetailerData, reason: from getter */
    public final String getM() {
        return this.M;
    }

    @NotNull
    /* JADX INFO: renamed from: getRoutingCode, reason: from getter */
    public final String getF67925p0() {
        return this.f67925p0;
    }

    @NotNull
    /* JADX INFO: renamed from: getRoutingIndicator, reason: from getter */
    public final String getO0() {
        return this.O0;
    }

    @NotNull
    /* JADX INFO: renamed from: getRrn, reason: from getter */
    public final String getE() {
        return this.E;
    }

    @NotNull
    /* JADX INFO: renamed from: getRsaPaddingEW, reason: from getter */
    public final String getF67901i1() {
        return this.f67901i1;
    }

    @NotNull
    /* JADX INFO: renamed from: getRsaVersionEW, reason: from getter */
    public final String getF67898h1() {
        return this.f67898h1;
    }

    @NotNull
    /* JADX INFO: renamed from: getRsnOnlyCode, reason: from getter */
    public final String getF67920n2() {
        return this.f67920n2;
    }

    @NotNull
    /* JADX INFO: renamed from: getSaleForcedOrSAF, reason: from getter */
    public final String getA0() {
        return this.A0;
    }

    @NotNull
    /* JADX INFO: renamed from: getServiceTransactionId, reason: from getter */
    public final String getE2() {
        return this.E2;
    }

    @NotNull
    /* JADX INFO: renamed from: getSettlementDate, reason: from getter */
    public final String getF67943u() {
        return this.f67943u;
    }

    @NotNull
    /* JADX INFO: renamed from: getSpecialData, reason: from getter */
    public final String getF67882d0() {
        return this.f67882d0;
    }

    @NotNull
    /* JADX INFO: renamed from: getStatusCodeOfRebroadcastTxn, reason: from getter */
    public final String getF67950w0() {
        return this.f67950w0;
    }

    @NotNull
    /* JADX INFO: renamed from: getStatusIndicatorC4, reason: from getter */
    public final String getM0() {
        return this.M0;
    }

    @NotNull
    /* JADX INFO: renamed from: getSystemTraceAuditNumber, reason: from getter */
    public final String getF67932r() {
        return this.f67932r;
    }

    @NotNull
    /* JADX INFO: renamed from: getTerminalActivationByCardholder, reason: from getter */
    public final String getP0() {
        return this.P0;
    }

    @NotNull
    /* JADX INFO: renamed from: getTerminalAddressBranch, reason: from getter */
    public final String getZ() {
        return this.Z;
    }

    @NotNull
    /* JADX INFO: renamed from: getTerminalCountryCode, reason: from getter */
    public final String getP1() {
        return this.P1;
    }

    @NotNull
    /* JADX INFO: renamed from: getTerminalData, reason: from getter */
    public final String getP() {
        return this.P;
    }

    @NotNull
    /* JADX INFO: renamed from: getTerminalEntryCapabilities, reason: from getter */
    public final String getF67902i2() {
        return this.f67902i2;
    }

    @NotNull
    /* JADX INFO: renamed from: getTerminalLocator, reason: from getter */
    public final String getI0() {
        return this.I0;
    }

    @NotNull
    /* JADX INFO: renamed from: getTerminalOperationIndex, reason: from getter */
    public final String getH0() {
        return this.H0;
    }

    @NotNull
    /* JADX INFO: renamed from: getTerminalSerialNumber, reason: from getter */
    public final String getF67916m1() {
        return this.f67916m1;
    }

    @NotNull
    /* JADX INFO: renamed from: getTerminalSoftwareVersion, reason: from getter */
    public final String getF67913l1() {
        return this.f67913l1;
    }

    @NotNull
    /* JADX INFO: renamed from: getTkEW, reason: from getter */
    public final String getF67890f1() {
        return this.f67890f1;
    }

    @NotNull
    /* JADX INFO: renamed from: getTrack1Flag, reason: from getter */
    public final String getD1() {
        return this.D1;
    }

    @NotNull
    /* JADX INFO: renamed from: getTrack2, reason: from getter */
    public final String getB() {
        return this.B;
    }

    @NotNull
    /* JADX INFO: renamed from: getTrack2Length, reason: from getter */
    public final String getA1() {
        return this.A1;
    }

    @NotNull
    /* JADX INFO: renamed from: getTransDate, reason: from getter */
    public final String getQ1() {
        return this.Q1;
    }

    @NotNull
    /* JADX INFO: renamed from: getTransactionAmount, reason: from getter */
    public final String getF67924p() {
        return this.f67924p;
    }

    @NotNull
    /* JADX INFO: renamed from: getTransactionCurrencyCode, reason: from getter */
    public final String getN() {
        return this.N;
    }

    @NotNull
    /* JADX INFO: renamed from: getTransactionDateTime, reason: from getter */
    public final Date getD2() {
        return this.D2;
    }

    @NotNull
    /* JADX INFO: renamed from: getTransactionSecurityLevel, reason: from getter */
    public final String getN0() {
        return this.N0;
    }

    @NotNull
    /* JADX INFO: renamed from: getTransactionType, reason: from getter */
    public final TransactionType getF67888f() {
        return this.f67888f;
    }

    @NotNull
    /* JADX INFO: renamed from: getTransactionTypeCode, reason: from getter */
    public final String getR1() {
        return this.R1;
    }

    @NotNull
    /* JADX INFO: renamed from: getTransferDataIndicator, reason: from getter */
    public final String getQ0() {
        return this.Q0;
    }

    @NotNull
    /* JADX INFO: renamed from: getTransmisionDateAndTime, reason: from getter */
    public final String getF67928q() {
        return this.f67928q;
    }

    @NotNull
    /* JADX INFO: renamed from: getTvr, reason: from getter */
    public final String getK1() {
        return this.K1;
    }

    @NotNull
    /* JADX INFO: renamed from: getUnpredictableNumber, reason: from getter */
    public final String getT1() {
        return this.T1;
    }

    @NotNull
    /* JADX INFO: renamed from: getUserField1B2, reason: from getter */
    public final String getI1() {
        return this.I1;
    }

    @NotNull
    /* JADX INFO: renamed from: getUserField1B3, reason: from getter */
    public final String getZ1() {
        return this.Z1;
    }

    @NotNull
    /* JADX INFO: renamed from: getUserField1B5, reason: from getter */
    public final String getF67931q2() {
        return this.f67931q2;
    }

    @NotNull
    /* JADX INFO: renamed from: getUserField1C0, reason: from getter */
    public final String getF67944u0() {
        return this.f67944u0;
    }

    @NotNull
    /* JADX INFO: renamed from: getUserField2B3, reason: from getter */
    public final String getF67872a2() {
        return this.f67872a2;
    }

    @NotNull
    /* JADX INFO: renamed from: getUserFieldACICZ, reason: from getter */
    public final String getZ0() {
        return this.Z0;
    }

    @NotNull
    /* JADX INFO: renamed from: getUserFieldQ1, reason: from getter */
    public final String getI0() {
        return this.i0;
    }

    @NotNull
    /* JADX INFO: renamed from: getXid, reason: from getter */
    public final String getT0() {
        return this.T0;
    }

    public final void setAccessMediumIdentifier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67904j0 = str;
    }

    public final void setAccountId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.Y = str;
    }

    public final void setAcquiringInstitutionIdentificationCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.D = str;
    }

    public final void setAdditionalAmounts(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.O = str;
    }

    public final void setAdditionalData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.S = str;
    }

    public final void setAdditionalErrorFlagRequestInTransaction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67922o0 = str;
    }

    public final void setAdditionalInfoIndicatorC0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.C0 = str;
    }

    public final void setAdditionalResponseDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.L = str;
    }

    public final void setAddlData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.u2 = str;
    }

    public final void setAip(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.M1 = str;
    }

    public final void setApplPanSeqNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67914l2 = str;
    }

    public final void setApplicationVersionNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.d2 = str;
    }

    public final void setArpc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67942t2 = str;
    }

    public final void setArqc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.N1 = str;
    }

    public final void setArqcVerify(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.o2 = str;
    }

    public final void setAtc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.O1 = str;
    }

    public final void setAtcCZ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.X0 = str;
    }

    public final void setAttendedTerminal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.G0 = str;
    }

    public final void setAuthenticationCollectorIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.D0 = str;
    }

    public final void setAuthorizationIdResponse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.F = str;
    }

    public final void setAuthorizationIndicators(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67870a0 = str;
    }

    public final void setAuthorizationModeIdentifier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67897h0 = str;
    }

    public final void setBinsTableVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67930q1 = str;
    }

    public final void setBinsUpdateFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67964z2 = str;
    }

    public final void setBitmapB2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.H1 = str;
    }

    public final void setBitmapB3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.W1 = str;
    }

    public final void setCaptureDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67946v = str;
    }

    public final void setCardAcceptorIdCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.J = str;
    }

    public final void setCardAcceptorNameAndLocation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.K = str;
    }

    public final void setCardAcceptorTerminalId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.I = str;
    }

    public final void setCardBin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67911l = str;
    }

    public final void setCardCaptureCapacityIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.L0 = str;
    }

    public final void setCardExpirationDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67918n = str;
    }

    public final void setCardIssuerCategoryResponseCodeData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.Q = str;
    }

    public final void setCardIssuerCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67874b0 = str;
    }

    public final void setCardNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.m = str;
    }

    public final void setCardPresenceIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.K0 = str;
    }

    public final void setCardType(@NotNull CardType cardType) {
        Intrinsics.checkNotNullParameter(cardType, "");
        this.f67896h = cardType;
    }

    public final void setCardVerificationFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67929q0 = str;
    }

    public final void setCardholderAuthenticationData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.W0 = str;
    }

    public final void setCardholderPresenceIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.J0 = str;
    }

    public final void setCavvAvvValidationResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.F0 = str;
    }

    public final void setCavvCardholderAuthVerValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.U0 = str;
    }

    public final void setCheckValueEW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67905j1 = str;
    }

    public final void setCheckValueEX(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67879c1 = str;
    }

    public final void setChipherDataBlocks(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.f67941t1 = list;
    }

    public final void setCipherConfiguration(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67919n1 = str;
    }

    public final void setCipherCounter(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67951w1 = str;
    }

    public final void setCipherData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.E1 = str;
    }

    public final void setCityExension(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67933r0 = str;
    }

    public final void setClearCipherBlocks(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.f67937s1 = list;
    }

    public final void setClearCipherDataEZ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67945u1 = str;
    }

    public final void setClearCvvLength(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.C1 = str;
    }

    public final void setClearTrack2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.A = str;
    }

    public final void setCommercialReferences(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67893g0 = str;
    }

    public final void setCompleteTrack2Data(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67936s0 = str;
    }

    public final void setCounterOfRebroadcastTxn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67954x0 = str;
    }

    public final void setCrc32EW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67909k1 = str;
    }

    public final void setCrc32EX(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67886e1 = str;
    }

    public final void setCrc32EZ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.G1 = str;
    }

    public final void setCriptoInfoData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.J1 = str;
    }

    public final void setCv2PresentIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.B0 = str;
    }

    public final void setCvmResults(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67887e2 = str;
    }

    public final void setCvv(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.C = str;
    }

    public final void setCvv2cvc2Result(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.v0 = str;
    }

    public final void setCvvFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.B1 = str;
    }

    public final void setDataElements(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.T = str;
    }

    public final void setDataSuspect(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67910k2 = str;
    }

    public final void setDeferral(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67908k0 = str;
    }

    public final void setDevInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67917m2 = str;
    }

    public final void setDfName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67895g2 = str;
    }

    public final void setDfNameLength(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67891f2 = str;
    }

    public final void setDiscretionaryTagData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.F2 = str;
    }

    public final void setECommerceIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67962z0 = str;
    }

    public final void setEmvData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.B2 = str;
    }

    public final void setEmvIssAuthData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67934r2 = str;
    }

    public final void setEmvLocalTransactionDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67876b2 = str;
    }

    public final void setEmvTagsMap(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.C2 = map;
    }

    public final void setEmvTermSerialNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.X1 = str;
    }

    public final void setEmvTerminalCapabilities(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.Y1 = str;
    }

    public final void setEmvTerminalType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67880c2 = str;
    }

    public final void setEmvTransactionType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.S1 = str;
    }

    public final void setErrorCode(int i10) {
        this.f67869a = i10;
    }

    public final void setErrorMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67873b = str;
    }

    public final void setErrorStatusCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67877c = str;
    }

    public final void setFailCipherCounter(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67955x1 = str;
    }

    public final void setField(@NotNull String fieldName, @NotNull String value) throws IllegalAccessException, NoSuchFieldException {
        Intrinsics.checkNotNullParameter(fieldName, "");
        Intrinsics.checkNotNullParameter(value, "");
        Field declaredField = BackendViergeResponseData.class.getDeclaredField(fieldName);
        Intrinsics.checkNotNullExpressionValue(declaredField, "");
        declaredField.set(this, value);
    }

    public final void setFileFlagUses(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67940t0 = str;
    }

    public final void setFillerC4(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.S0 = str;
    }

    public final void setFlagRequestNewKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.r1 = str;
    }

    public final void setFlagTrack2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67959y1 = str;
    }

    public final void setFormFactrInd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.Y0 = str;
    }

    public final void setHasChip(boolean z10) {
        this.f67903j = z10;
    }

    public final void setHostType(@NotNull HostType hostType) {
        Intrinsics.checkNotNullParameter(hostType, "");
        this.f67881d = hostType;
    }

    public final void setIdentificationMethodCardHolder(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.R0 = str;
    }

    public final void setIndicatorCE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.V0 = str;
    }

    public final void setIsoASCII(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.A2 = str;
    }

    public final void setIsoRCIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67927p2 = str;
    }

    public final void setIssApplData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.V1 = str;
    }

    public final void setIssApplDataLength(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.U1 = str;
    }

    public final void setIssAuthData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67938s2 = str;
    }

    public final void setIssAuthDataLength(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67948v2 = str;
    }

    public final void setIssScriptData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67956x2 = str;
    }

    public final void setIssScriptDataLength(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67952w2 = str;
    }

    public final void setKeySerialNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67947v1 = str;
    }

    public final void setKeyUpdateFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67960y2 = str;
    }

    public final void setKsnEX(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67875b1 = str;
    }

    public final void setLastEmvStat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67906j2 = str;
    }

    public final void setLastPan4Digits(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.F1 = str;
    }

    public final void setLocalBinsTableIdPrimary(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67923o1 = str;
    }

    public final void setLocalBinsTableIdSecondary(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67926p1 = str;
    }

    public final void setLocalTransactionDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67939t = str;
    }

    public final void setLocalTransactionTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67935s = str;
    }

    public final void setMerchantCurrencyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67953x = str;
    }

    public final void setMerchantPostalCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67958y0 = str;
    }

    public final void setMerchantType(@NotNull MerchantType merchantType) {
        Intrinsics.checkNotNullParameter(merchantType, "");
        this.f67884e = merchantType;
    }

    public final void setMerchantTypeCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67949w = str;
    }

    public final void setMessageType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67907k = str;
    }

    public final void setMetadata(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.metadata = bArr;
    }

    public final void setNetworkManagmentInformationCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.U = str;
    }

    public final void setNewKeyRequestStatusEX(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67883d1 = str;
    }

    public final void setNumberOfPayments(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67912l0 = str;
    }

    public final void setOriginalDataElements(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.V = str;
    }

    public final void setOriginalRrn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.G = str;
    }

    public final void setOtherAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.L1 = str;
    }

    public final void setPaymentPlanCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67915m0 = str;
    }

    public final void setPaymentPlanType(@NotNull PaymentPlanType paymentPlanType) {
        Intrinsics.checkNotNullParameter(paymentPlanType, "");
        this.f67900i = paymentPlanType;
    }

    public final void setPaymentQ6Data(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.n0 = str;
    }

    public final void setPekEX(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67871a1 = str;
    }

    public final void setPointOfServiceConditionCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67961z = str;
    }

    public final void setPointOfServiceEntryMode(@NotNull PointOfServiceEntryMode pointOfServiceEntryMode) {
        Intrinsics.checkNotNullParameter(pointOfServiceEntryMode, "");
        this.f67892g = pointOfServiceEntryMode;
    }

    public final void setPointOfServiceEntryModeCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67957y = str;
    }

    public final void setPosEntryMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67899h2 = str;
    }

    public final void setPosInvoiceData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67878c0 = str;
    }

    public final void setPosPreauthorizationAndChargeBackData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67889f0 = str;
    }

    public final void setPosSettlementData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67885e0 = str;
    }

    public final void setPostalCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.R = str;
    }

    public final void setProcessingCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67921o = str;
    }

    public final void setPropensityFlagTradeFraud(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.E0 = str;
    }

    public final void setRandomTkCipherEW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67894g1 = str;
    }

    public final void setReadCardMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67963z1 = str;
    }

    public final void setReceivingInstitutionIdCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.X = str;
    }

    public final void setReplacementAmounts(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.W = str;
    }

    public final void setResponseCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.H = str;
    }

    public final void setRetailerData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.M = str;
    }

    public final void setRoutingCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67925p0 = str;
    }

    public final void setRoutingIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.O0 = str;
    }

    public final void setRrn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.E = str;
    }

    public final void setRsaPaddingEW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67901i1 = str;
    }

    public final void setRsaVersionEW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67898h1 = str;
    }

    public final void setRsnOnlyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67920n2 = str;
    }

    public final void setSaleForcedOrSAF(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.A0 = str;
    }

    public final void setServiceTransactionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.E2 = str;
    }

    public final void setSettlementDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67943u = str;
    }

    public final void setSpecialData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67882d0 = str;
    }

    public final void setStatusCodeOfRebroadcastTxn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67950w0 = str;
    }

    public final void setStatusIndicatorC4(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.M0 = str;
    }

    public final void setSystemTraceAuditNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67932r = str;
    }

    public final void setTerminalActivationByCardholder(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.P0 = str;
    }

    public final void setTerminalAddressBranch(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.Z = str;
    }

    public final void setTerminalCountryCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.P1 = str;
    }

    public final void setTerminalData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.P = str;
    }

    public final void setTerminalEntryCapabilities(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67902i2 = str;
    }

    public final void setTerminalLocator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.I0 = str;
    }

    public final void setTerminalOperationIndex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.H0 = str;
    }

    public final void setTerminalSerialNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67916m1 = str;
    }

    public final void setTerminalSoftwareVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67913l1 = str;
    }

    public final void setTkEW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67890f1 = str;
    }

    public final void setTrack1Flag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.D1 = str;
    }

    public final void setTrack2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.B = str;
    }

    public final void setTrack2Length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.A1 = str;
    }

    public final void setTransDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.Q1 = str;
    }

    public final void setTransactionAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67924p = str;
    }

    public final void setTransactionCurrencyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.N = str;
    }

    public final void setTransactionDateTime(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "");
        this.D2 = date;
    }

    public final void setTransactionSecurityLevel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.N0 = str;
    }

    public final void setTransactionType(@NotNull TransactionType transactionType) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        this.f67888f = transactionType;
    }

    public final void setTransactionTypeCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.R1 = str;
    }

    public final void setTransferDataIndicator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.Q0 = str;
    }

    public final void setTransmisionDateAndTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67928q = str;
    }

    public final void setTvr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.K1 = str;
    }

    public final void setUnpredictableNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.T1 = str;
    }

    public final void setUserField1B2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.I1 = str;
    }

    public final void setUserField1B3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.Z1 = str;
    }

    public final void setUserField1B5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67931q2 = str;
    }

    public final void setUserField1C0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67944u0 = str;
    }

    public final void setUserField2B3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67872a2 = str;
    }

    public final void setUserFieldACICZ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.Z0 = str;
    }

    public final void setUserFieldQ1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.i0 = str;
    }

    public final void setXid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.T0 = str;
    }

    public BackendViergeResponseData(int i10, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f67873b = "";
        this.f67877c = "";
        this.f67881d = HostType.TestingDUKPTHost;
        this.f67884e = MerchantType.Undefined;
        this.f67888f = TransactionType.Undefined;
        this.f67892g = PointOfServiceEntryMode.Undefined;
        this.f67896h = CardType.Undefined;
        this.f67900i = PaymentPlanType.Undefined;
        this.f67907k = "";
        this.f67911l = "";
        this.m = "";
        this.f67918n = "";
        this.f67921o = "";
        this.f67924p = "";
        this.f67928q = "";
        this.f67932r = "";
        this.f67935s = "";
        this.f67939t = "";
        this.f67943u = "";
        this.f67946v = "";
        this.f67949w = "";
        this.f67953x = "";
        this.f67957y = "";
        this.f67961z = "";
        this.A = "";
        this.B = "";
        this.C = "";
        this.D = "";
        this.E = "";
        this.F = "";
        this.G = "";
        this.H = "";
        this.I = "";
        this.J = "";
        this.K = "";
        this.L = "";
        this.M = "";
        this.N = "";
        this.O = "";
        this.P = "";
        this.Q = "";
        this.R = "";
        this.S = "";
        this.T = "";
        this.U = "";
        this.V = "";
        this.W = "";
        this.X = "";
        this.Y = "";
        this.Z = "";
        this.f67870a0 = "";
        this.f67874b0 = "";
        this.f67878c0 = "";
        this.f67882d0 = "";
        this.f67885e0 = "";
        this.f67889f0 = "";
        this.f67893g0 = "";
        this.f67897h0 = "";
        this.i0 = "";
        this.f67904j0 = "";
        this.f67908k0 = "";
        this.f67912l0 = "";
        this.f67915m0 = "";
        this.n0 = "";
        this.f67922o0 = "";
        this.f67925p0 = "";
        this.f67929q0 = "";
        this.f67933r0 = "";
        this.f67936s0 = "";
        this.f67940t0 = "";
        this.f67944u0 = " ";
        this.v0 = "";
        this.f67950w0 = "";
        this.f67954x0 = "";
        this.f67958y0 = "";
        this.f67962z0 = "";
        this.A0 = "";
        this.B0 = "";
        this.C0 = "";
        this.D0 = "";
        this.E0 = "";
        this.F0 = "";
        this.G0 = "";
        this.H0 = "";
        this.I0 = "";
        this.J0 = "";
        this.K0 = "";
        this.L0 = "";
        this.M0 = "";
        this.N0 = "";
        this.O0 = "";
        this.P0 = "";
        this.Q0 = "";
        this.R0 = "";
        this.S0 = "";
        this.T0 = "";
        this.U0 = "";
        this.V0 = "";
        this.W0 = "";
        this.X0 = "";
        this.Y0 = "";
        this.Z0 = "";
        this.f67871a1 = "";
        this.f67875b1 = "";
        this.f67879c1 = "";
        this.f67883d1 = "";
        this.f67886e1 = "";
        this.f67890f1 = "";
        this.f67894g1 = "";
        this.f67898h1 = "";
        this.f67901i1 = "";
        this.f67905j1 = "";
        this.f67909k1 = "";
        this.f67913l1 = "";
        this.f67916m1 = "";
        this.f67919n1 = "";
        this.f67923o1 = "";
        this.f67926p1 = "";
        this.f67930q1 = "";
        this.r1 = "";
        this.f67937s1 = new ArrayList();
        this.f67941t1 = new ArrayList();
        this.f67945u1 = "";
        this.f67947v1 = "";
        this.f67951w1 = "";
        this.f67955x1 = "";
        this.f67959y1 = "";
        this.f67963z1 = "";
        this.A1 = "";
        this.B1 = "";
        this.C1 = "";
        this.D1 = "";
        this.E1 = "";
        this.F1 = "";
        this.G1 = "";
        this.H1 = "";
        this.I1 = "";
        this.J1 = "";
        this.K1 = "";
        this.L1 = "";
        this.M1 = "";
        this.N1 = "";
        this.O1 = "";
        this.P1 = "";
        this.Q1 = "";
        this.R1 = "";
        this.S1 = "";
        this.T1 = "";
        this.U1 = "";
        this.V1 = "";
        this.W1 = "";
        this.X1 = "";
        this.Y1 = "";
        this.Z1 = "";
        this.f67872a2 = "";
        this.f67876b2 = "";
        this.f67880c2 = "";
        this.d2 = "";
        this.f67887e2 = "";
        this.f67891f2 = "";
        this.f67895g2 = "";
        this.f67899h2 = "";
        this.f67902i2 = "";
        this.f67906j2 = "";
        this.f67910k2 = "";
        this.f67914l2 = "";
        this.f67917m2 = "";
        this.f67920n2 = "";
        this.o2 = "";
        this.f67927p2 = "";
        this.f67931q2 = "";
        this.f67934r2 = "";
        this.f67938s2 = "";
        this.f67942t2 = "";
        this.u2 = "";
        this.f67948v2 = "";
        this.f67952w2 = "";
        this.f67956x2 = "";
        this.f67960y2 = "";
        this.f67964z2 = "";
        this.A2 = "";
        this.B2 = "";
        this.C2 = new LinkedHashMap();
        this.D2 = new Date();
        this.E2 = "";
        this.F2 = "";
        this.f67873b = str;
        this.f67869a = i10;
        this.f67877c = str2;
    }
}
