package com.bbva.ui.compose.theme;

import androidx.collection.j;
import androidx.collection.k;
import androidx.compose.material.Colors;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.contacts.ContactAccessor;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.nativesettings.common.Constants;
import com.bbva.slidemenuview.decorator.SustainabilityDecorator;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallback;
import com.bbva.ui.component.menu.model.BaseMenuItem;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.dynamiclinks.DynamicLink;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes9.dex */
@Immutable
@Metadata(d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0003\b\u008f\u0001\b\u0087\b\u0018\u00002\u00020\u0001: ë\u0001ì\u0001í\u0001î\u0001ï\u0001ð\u0001ñ\u0001ò\u0001ó\u0001ô\u0001õ\u0001ö\u0001÷\u0001ø\u0001ù\u0001ú\u0001B\u0089\u0002\u0012\u0006\u0010D\u001a\u00020\u0002\u0012\u0006\u0010E\u001a\u00020\u0004\u0012\u0006\u0010F\u001a\u00020\u0004\u0012\u0006\u0010G\u001a\u00020\u0004\u0012\u0006\u0010H\u001a\u00020\u0004\u0012\u0006\u0010I\u001a\u00020\u0004\u0012\u0006\u0010J\u001a\u00020\u0004\u0012\u0006\u0010K\u001a\u00020\u0004\u0012\u0006\u0010L\u001a\u00020\u0004\u0012\u0006\u0010M\u001a\u00020\u0004\u0012\u0006\u0010N\u001a\u00020\u0004\u0012\u0006\u0010O\u001a\u00020\u0004\u0012\u0006\u0010P\u001a\u00020\u0004\u0012\u0006\u0010Q\u001a\u00020\u0004\u0012\u0006\u0010R\u001a\u00020\u0004\u0012\u0006\u0010S\u001a\u00020\u0004\u0012\u0006\u0010T\u001a\u00020$\u0012\u0006\u0010U\u001a\u00020&\u0012\u0006\u0010V\u001a\u00020(\u0012\u0006\u0010W\u001a\u00020*\u0012\u0006\u0010X\u001a\u00020,\u0012\u0006\u0010Y\u001a\u00020.\u0012\u0006\u0010Z\u001a\u000200\u0012\u0006\u0010[\u001a\u000202\u0012\u0006\u0010\\\u001a\u000204\u0012\u0006\u0010]\u001a\u000206\u0012\u0006\u0010^\u001a\u000208\u0012\u0006\u0010_\u001a\u00020:\u0012\u0006\u0010`\u001a\u00020<\u0012\u0006\u0010a\u001a\u00020>\u0012\u0006\u0010b\u001a\u00020@\u0012\u0006\u0010c\u001a\u00020B¢\u0006\u0006\bé\u0001\u0010ê\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0016\u0010\u0007\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0006J\u0016\u0010\r\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u0006J\u0016\u0010\u000f\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0006J\u0016\u0010\u0011\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u0016\u0010\u0013\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0006J\u0016\u0010\u0015\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0006J\u0016\u0010\u0017\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0006J\u0016\u0010\u0019\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0006J\u0016\u0010\u001b\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0006J\u0016\u0010\u001d\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u0006J\u0016\u0010\u001f\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u0006J\u0016\u0010!\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0006J\u0016\u0010#\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u0006J\t\u0010%\u001a\u00020$HÆ\u0003J\t\u0010'\u001a\u00020&HÆ\u0003J\t\u0010)\u001a\u00020(HÆ\u0003J\t\u0010+\u001a\u00020*HÆ\u0003J\t\u0010-\u001a\u00020,HÆ\u0003J\t\u0010/\u001a\u00020.HÆ\u0003J\t\u00101\u001a\u000200HÆ\u0003J\t\u00103\u001a\u000202HÆ\u0003J\t\u00105\u001a\u000204HÆ\u0003J\t\u00107\u001a\u000206HÆ\u0003J\t\u00109\u001a\u000208HÆ\u0003J\t\u0010;\u001a\u00020:HÆ\u0003J\t\u0010=\u001a\u00020<HÆ\u0003J\t\u0010?\u001a\u00020>HÆ\u0003J\t\u0010A\u001a\u00020@HÆ\u0003J\t\u0010C\u001a\u00020BHÆ\u0003JÓ\u0002\u0010f\u001a\u00020\u00002\b\b\u0002\u0010D\u001a\u00020\u00022\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u00042\b\b\u0002\u0010J\u001a\u00020\u00042\b\b\u0002\u0010K\u001a\u00020\u00042\b\b\u0002\u0010L\u001a\u00020\u00042\b\b\u0002\u0010M\u001a\u00020\u00042\b\b\u0002\u0010N\u001a\u00020\u00042\b\b\u0002\u0010O\u001a\u00020\u00042\b\b\u0002\u0010P\u001a\u00020\u00042\b\b\u0002\u0010Q\u001a\u00020\u00042\b\b\u0002\u0010R\u001a\u00020\u00042\b\b\u0002\u0010S\u001a\u00020\u00042\b\b\u0002\u0010T\u001a\u00020$2\b\b\u0002\u0010U\u001a\u00020&2\b\b\u0002\u0010V\u001a\u00020(2\b\b\u0002\u0010W\u001a\u00020*2\b\b\u0002\u0010X\u001a\u00020,2\b\b\u0002\u0010Y\u001a\u00020.2\b\b\u0002\u0010Z\u001a\u0002002\b\b\u0002\u0010[\u001a\u0002022\b\b\u0002\u0010\\\u001a\u0002042\b\b\u0002\u0010]\u001a\u0002062\b\b\u0002\u0010^\u001a\u0002082\b\b\u0002\u0010_\u001a\u00020:2\b\b\u0002\u0010`\u001a\u00020<2\b\b\u0002\u0010a\u001a\u00020>2\b\b\u0002\u0010b\u001a\u00020@2\b\b\u0002\u0010c\u001a\u00020BHÆ\u0001ø\u0001\u0001¢\u0006\u0004\bd\u0010eJ\t\u0010h\u001a\u00020gHÖ\u0001J\t\u0010j\u001a\u00020iHÖ\u0001J\u0013\u0010m\u001a\u00020l2\b\u0010k\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010D\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001d\u0010E\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010\u0006R\u001d\u0010F\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bu\u0010s\u001a\u0004\bv\u0010\u0006R\u001d\u0010G\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bw\u0010s\u001a\u0004\bx\u0010\u0006R\u001d\u0010H\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\by\u0010s\u001a\u0004\bz\u0010\u0006R\u001d\u0010I\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b{\u0010s\u001a\u0004\b|\u0010\u0006R\u001d\u0010J\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b}\u0010s\u001a\u0004\b~\u0010\u0006R\u001e\u0010K\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\r\n\u0004\b\u007f\u0010s\u001a\u0005\b\u0080\u0001\u0010\u0006R\u001f\u0010L\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010s\u001a\u0005\b\u0082\u0001\u0010\u0006R\u001f\u0010M\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010s\u001a\u0005\b\u0084\u0001\u0010\u0006R\u001f\u0010N\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010s\u001a\u0005\b\u0086\u0001\u0010\u0006R\u001f\u0010O\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010s\u001a\u0005\b\u0088\u0001\u0010\u0006R\u001f\u0010P\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010s\u001a\u0005\b\u008a\u0001\u0010\u0006R\u001f\u0010Q\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010s\u001a\u0005\b\u008c\u0001\u0010\u0006R\u001f\u0010R\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010s\u001a\u0005\b\u008e\u0001\u0010\u0006R\u001f\u0010S\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010s\u001a\u0005\b\u0090\u0001\u0010\u0006R\u001b\u0010T\u001a\u00020$8\u0006¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001b\u0010U\u001a\u00020&8\u0006¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001b\u0010V\u001a\u00020(8\u0006¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001b\u0010W\u001a\u00020*8\u0006¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u001b\u0010X\u001a\u00020,8\u0006¢\u0006\u0010\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R\u001b\u0010Y\u001a\u00020.8\u0006¢\u0006\u0010\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R\u001b\u0010Z\u001a\u0002008\u0006¢\u0006\u0010\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R\u001b\u0010[\u001a\u0002028\u0006¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R\u001b\u0010\\\u001a\u0002048\u0006¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u001b\u0010]\u001a\u0002068\u0006¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R\u001b\u0010^\u001a\u0002088\u0006¢\u0006\u0010\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001R\u001b\u0010_\u001a\u00020:8\u0006¢\u0006\u0010\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001R\u001b\u0010`\u001a\u00020<8\u0006¢\u0006\u0010\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u001b\u0010a\u001a\u00020>8\u0006¢\u0006\u0010\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R\u001b\u0010b\u001a\u00020@8\u0006¢\u0006\u0010\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001R\u001b\u0010c\u001a\u00020B8\u0006¢\u0006\u0010\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0019\u0010Ò\u0001\u001a\u00020\u00048Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\u001a\u0005\bÑ\u0001\u0010\u0006R\u0019\u0010Ô\u0001\u001a\u00020\u00048Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\u001a\u0005\bÓ\u0001\u0010\u0006R\u0019\u0010Ö\u0001\u001a\u00020\u00048Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\u001a\u0005\bÕ\u0001\u0010\u0006R\u0019\u0010Ø\u0001\u001a\u00020\u00048Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\u001a\u0005\b×\u0001\u0010\u0006R\u0019\u0010Ú\u0001\u001a\u00020\u00048Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\u001a\u0005\bÙ\u0001\u0010\u0006R\u0019\u0010Ü\u0001\u001a\u00020\u00048Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010\u0006R\u0019\u0010Þ\u0001\u001a\u00020\u00048Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\u001a\u0005\bÝ\u0001\u0010\u0006R\u0019\u0010à\u0001\u001a\u00020\u00048Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\u001a\u0005\bß\u0001\u0010\u0006R\u0019\u0010â\u0001\u001a\u00020\u00048Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\u001a\u0005\bá\u0001\u0010\u0006R\u0019\u0010ä\u0001\u001a\u00020\u00048Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\u001a\u0005\bã\u0001\u0010\u0006R\u0019\u0010æ\u0001\u001a\u00020\u00048Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\u001a\u0005\bå\u0001\u0010\u0006R\u0014\u0010ç\u0001\u001a\u00020l8F¢\u0006\b\u001a\u0006\bç\u0001\u0010è\u0001\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006û\u0001"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors;", "", "Landroidx/compose/material/Colors;", "component1", "Landroidx/compose/ui/graphics/Color;", "component2-0d7_KjU", "()J", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "component6-0d7_KjU", "component6", "component7-0d7_KjU", "component7", "component8-0d7_KjU", "component8", "component9-0d7_KjU", "component9", "component10-0d7_KjU", "component10", "component11-0d7_KjU", "component11", "component12-0d7_KjU", "component12", "component13-0d7_KjU", "component13", "component14-0d7_KjU", "component14", "component15-0d7_KjU", "component15", "component16-0d7_KjU", "component16", "Lcom/bbva/ui/compose/theme/ExtendedColors$Surface;", "component17", "Lcom/bbva/ui/compose/theme/ExtendedColors$Support;", "component18", "Lcom/bbva/ui/compose/theme/ExtendedColors$Badge;", "component19", "Lcom/bbva/ui/compose/theme/ExtendedColors$Notification;", "component20", "Lcom/bbva/ui/compose/theme/ExtendedColors$Format;", "component21", "Lcom/bbva/ui/compose/theme/ExtendedColors$Rating;", "component22", "Lcom/bbva/ui/compose/theme/ExtendedColors$Categories;", "component23", "Lcom/bbva/ui/compose/theme/ExtendedColors$Process;", "component24", "Lcom/bbva/ui/compose/theme/ExtendedColors$Risk;", "component25", "Lcom/bbva/ui/compose/theme/ExtendedColors$Data;", "component26", "Lcom/bbva/ui/compose/theme/ExtendedColors$Locations;", "component27", "Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent;", "component28", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta;", "component29", "Lcom/bbva/ui/compose/theme/ExtendedColors$Selection;", "component30", "Lcom/bbva/ui/compose/theme/ExtendedColors$Link;", "component31", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form;", "component32", "colors", "toolBar", "emphasis", "emphasisVariant", "surfaceComponent", "loginProgressIndicatorBackground", "loginProgressIndicatorOverlap", "shimmerBase", "shimmerHighlight", "androidStatusBarColor", "textPrimary", "textPrimaryInverse", "textSecondary", "textSecondaryInverse", "textUncovered", "textIncome", "surface", "support", "badge", "notification", "format", "rating", ContactAccessor.CATEGORIES, "process", "risk", "data", "locations", "emergent", "cta", "selection", DynamicLink.Builder.KEY_LINK, "form", "copy-5u6CDpA", "(Landroidx/compose/material/Colors;JJJJJJJJJJJJJJJLcom/bbva/ui/compose/theme/ExtendedColors$Surface;Lcom/bbva/ui/compose/theme/ExtendedColors$Support;Lcom/bbva/ui/compose/theme/ExtendedColors$Badge;Lcom/bbva/ui/compose/theme/ExtendedColors$Notification;Lcom/bbva/ui/compose/theme/ExtendedColors$Format;Lcom/bbva/ui/compose/theme/ExtendedColors$Rating;Lcom/bbva/ui/compose/theme/ExtendedColors$Categories;Lcom/bbva/ui/compose/theme/ExtendedColors$Process;Lcom/bbva/ui/compose/theme/ExtendedColors$Risk;Lcom/bbva/ui/compose/theme/ExtendedColors$Data;Lcom/bbva/ui/compose/theme/ExtendedColors$Locations;Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent;Lcom/bbva/ui/compose/theme/ExtendedColors$Cta;Lcom/bbva/ui/compose/theme/ExtendedColors$Selection;Lcom/bbva/ui/compose/theme/ExtendedColors$Link;Lcom/bbva/ui/compose/theme/ExtendedColors$Form;)Lcom/bbva/ui/compose/theme/ExtendedColors;", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Landroidx/compose/material/Colors;", "getColors", "()Landroidx/compose/material/Colors;", "b", "J", "getToolBar-0d7_KjU", "c", "getEmphasis-0d7_KjU", "d", "getEmphasisVariant-0d7_KjU", "e", "getSurfaceComponent-0d7_KjU", "f", "getLoginProgressIndicatorBackground-0d7_KjU", "g", "getLoginProgressIndicatorOverlap-0d7_KjU", "h", "getShimmerBase-0d7_KjU", "i", "getShimmerHighlight-0d7_KjU", "j", "getAndroidStatusBarColor-0d7_KjU", "k", "getTextPrimary-0d7_KjU", "l", "getTextPrimaryInverse-0d7_KjU", "m", "getTextSecondary-0d7_KjU", "n", "getTextSecondaryInverse-0d7_KjU", "o", "getTextUncovered-0d7_KjU", "p", "getTextIncome-0d7_KjU", "q", "Lcom/bbva/ui/compose/theme/ExtendedColors$Surface;", "getSurface", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Surface;", "r", "Lcom/bbva/ui/compose/theme/ExtendedColors$Support;", "getSupport", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Support;", "s", "Lcom/bbva/ui/compose/theme/ExtendedColors$Badge;", "getBadge", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Badge;", "t", "Lcom/bbva/ui/compose/theme/ExtendedColors$Notification;", "getNotification", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Notification;", "u", "Lcom/bbva/ui/compose/theme/ExtendedColors$Format;", "getFormat", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Format;", SharedPrefsStorage.VERSION_KEY, "Lcom/bbva/ui/compose/theme/ExtendedColors$Rating;", "getRating", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Rating;", "w", "Lcom/bbva/ui/compose/theme/ExtendedColors$Categories;", "getCategories", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Categories;", "x", "Lcom/bbva/ui/compose/theme/ExtendedColors$Process;", "getProcess", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Process;", "y", "Lcom/bbva/ui/compose/theme/ExtendedColors$Risk;", "getRisk", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Risk;", "z", "Lcom/bbva/ui/compose/theme/ExtendedColors$Data;", "getData", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Data;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/bbva/ui/compose/theme/ExtendedColors$Locations;", "getLocations", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Locations;", "B", "Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent;", "getEmergent", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent;", "C", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta;", "getCta", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Cta;", "D", "Lcom/bbva/ui/compose/theme/ExtendedColors$Selection;", "getSelection", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Selection;", ExifInterface.LONGITUDE_EAST, "Lcom/bbva/ui/compose/theme/ExtendedColors$Link;", "getLink", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Link;", "F", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form;", "getForm", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Form;", "getPrimary-0d7_KjU", "primary", "getPrimaryVariant-0d7_KjU", "primaryVariant", "getSecondary-0d7_KjU", "secondary", "getSecondaryVariant-0d7_KjU", "secondaryVariant", "getBackground-0d7_KjU", "background", "getError-0d7_KjU", "error", "getOnPrimary-0d7_KjU", "onPrimary", "getOnSecondary-0d7_KjU", "onSecondary", "getOnBackground-0d7_KjU", "onBackground", "getOnSurface-0d7_KjU", "onSurface", "getOnError-0d7_KjU", "onError", "isLight", "()Z", "<init>", "(Landroidx/compose/material/Colors;JJJJJJJJJJJJJJJLcom/bbva/ui/compose/theme/ExtendedColors$Surface;Lcom/bbva/ui/compose/theme/ExtendedColors$Support;Lcom/bbva/ui/compose/theme/ExtendedColors$Badge;Lcom/bbva/ui/compose/theme/ExtendedColors$Notification;Lcom/bbva/ui/compose/theme/ExtendedColors$Format;Lcom/bbva/ui/compose/theme/ExtendedColors$Rating;Lcom/bbva/ui/compose/theme/ExtendedColors$Categories;Lcom/bbva/ui/compose/theme/ExtendedColors$Process;Lcom/bbva/ui/compose/theme/ExtendedColors$Risk;Lcom/bbva/ui/compose/theme/ExtendedColors$Data;Lcom/bbva/ui/compose/theme/ExtendedColors$Locations;Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent;Lcom/bbva/ui/compose/theme/ExtendedColors$Cta;Lcom/bbva/ui/compose/theme/ExtendedColors$Selection;Lcom/bbva/ui/compose/theme/ExtendedColors$Link;Lcom/bbva/ui/compose/theme/ExtendedColors$Form;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Badge", "Categories", "Cta", "Data", "Emergent", "Form", "Format", "Link", "Locations", "Notification", "Process", "Rating", "Risk", "Selection", "Support", "Surface", "ui_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class ExtendedColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Locations locations;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Emergent emergent;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final Cta cta;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Selection selection;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final Link link;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final Form form;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Colors colors;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long toolBar;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long emphasis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long emphasisVariant;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long surfaceComponent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long loginProgressIndicatorBackground;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final long loginProgressIndicatorOverlap;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final long shimmerBase;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final long shimmerHighlight;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final long androidStatusBarColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final long textPrimary;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final long textPrimaryInverse;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final long textSecondary;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final long textSecondaryInverse;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final long textUncovered;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final long textIncome;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Surface surface;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Support support;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Badge badge;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Notification notification;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Format format;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Rating rating;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Categories categories;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Process process;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Risk risk;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Data data;

    /* JADX INFO: compiled from: Color.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0006()*+,-B7\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006."}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Badge;", "", "Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Info;", "a", "Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Info;", "getInfo", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Info;", "info", "Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Success;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Success;", "getSuccess", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Success;", "success", "Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Warning;", "c", "Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Warning;", "getWarning", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Warning;", "warning", "Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Error;", "d", "Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Error;", "getError", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Error;", "error", "Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Off;", "e", "Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Off;", "getOff", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Off;", DebugKt.DEBUG_PROPERTY_VALUE_OFF, "Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Sustainability;", "f", "Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Sustainability;", "getSustainability", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Sustainability;", SustainabilityDecorator.SUSTAINABILITY, "<init>", "(Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Info;Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Success;Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Warning;Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Error;Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Off;Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Sustainability;)V", "Error", "Info", "Off", "Success", "Sustainability", "Warning", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Badge {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Info info;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Success success;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Warning warning;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Error error;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Off off;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Sustainability sustainability;

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Error;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getBackground-0d7_KjU", "()J", "background", "b", "getText-0d7_KjU", "text", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Error {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long background;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long text;

            public Error(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.background = j10;
                this.text = j11;
            }

            /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
            public final long getBackground() {
                return this.background;
            }

            /* JADX INFO: renamed from: getText-0d7_KjU, reason: not valid java name and from getter */
            public final long getText() {
                return this.text;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Info;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getBackground-0d7_KjU", "()J", "background", "b", "getText-0d7_KjU", "text", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Info {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long background;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long text;

            public Info(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.background = j10;
                this.text = j11;
            }

            /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
            public final long getBackground() {
                return this.background;
            }

            /* JADX INFO: renamed from: getText-0d7_KjU, reason: not valid java name and from getter */
            public final long getText() {
                return this.text;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Off;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getBackground-0d7_KjU", "()J", "background", "b", "getText-0d7_KjU", "text", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Off {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long background;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long text;

            public Off(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.background = j10;
                this.text = j11;
            }

            /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
            public final long getBackground() {
                return this.background;
            }

            /* JADX INFO: renamed from: getText-0d7_KjU, reason: not valid java name and from getter */
            public final long getText() {
                return this.text;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Success;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getBackground-0d7_KjU", "()J", "background", "b", "getText-0d7_KjU", "text", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Success {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long background;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long text;

            public Success(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.background = j10;
                this.text = j11;
            }

            /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
            public final long getBackground() {
                return this.background;
            }

            /* JADX INFO: renamed from: getText-0d7_KjU, reason: not valid java name and from getter */
            public final long getText() {
                return this.text;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Sustainability;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getBackground-0d7_KjU", "()J", "background", "b", "getText-0d7_KjU", "text", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Sustainability {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long background;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long text;

            public Sustainability(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.background = j10;
                this.text = j11;
            }

            /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
            public final long getBackground() {
                return this.background;
            }

            /* JADX INFO: renamed from: getText-0d7_KjU, reason: not valid java name and from getter */
            public final long getText() {
                return this.text;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Badge$Warning;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getBackground-0d7_KjU", "()J", "background", "b", "getText-0d7_KjU", "text", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Warning {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long background;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long text;

            public Warning(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.background = j10;
                this.text = j11;
            }

            /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
            public final long getBackground() {
                return this.background;
            }

            /* JADX INFO: renamed from: getText-0d7_KjU, reason: not valid java name and from getter */
            public final long getText() {
                return this.text;
            }
        }

        public Badge(@NotNull Info info, @NotNull Success success, @NotNull Warning warning, @NotNull Error error, @NotNull Off off, @NotNull Sustainability sustainability) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(success, "success");
            Intrinsics.checkNotNullParameter(warning, "warning");
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(off, "off");
            Intrinsics.checkNotNullParameter(sustainability, "sustainability");
            this.info = info;
            this.success = success;
            this.warning = warning;
            this.error = error;
            this.off = off;
            this.sustainability = sustainability;
        }

        @NotNull
        public final Error getError() {
            return this.error;
        }

        @NotNull
        public final Info getInfo() {
            return this.info;
        }

        @NotNull
        public final Off getOff() {
            return this.off;
        }

        @NotNull
        public final Success getSuccess() {
            return this.success;
        }

        @NotNull
        public final Sustainability getSustainability() {
            return this.sustainability;
        }

        @NotNull
        public final Warning getWarning() {
            return this.warning;
        }
    }

    /* JADX INFO: compiled from: Color.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\bP\b\u0007\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\u0006\u00101\u001a\u00020\u0002\u0012\u0006\u00104\u001a\u00020\u0002\u0012\u0006\u00107\u001a\u00020\u0002\u0012\u0006\u0010:\u001a\u00020\u0002\u0012\u0006\u0010=\u001a\u00020\u0002\u0012\u0006\u0010@\u001a\u00020\u0002\u0012\u0006\u0010C\u001a\u00020\u0002\u0012\u0006\u0010F\u001a\u00020\u0002\u0012\u0006\u0010I\u001a\u00020\u0002\u0012\u0006\u0010L\u001a\u00020\u0002\u0012\u0006\u0010O\u001a\u00020\u0002¢\u0006\u0004\bP\u0010QR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u001d\u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u001d\u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u001d\u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R\u001d\u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u001d\u0010(\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R\u001d\u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u001d\u0010.\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u001d\u00101\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R\u001d\u00104\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R\u001d\u00107\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u001d\u0010:\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R\u001d\u0010=\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R\u001d\u0010@\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006R\u001d\u0010C\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R\u001d\u0010F\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0006R\u001d\u0010I\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R\u001d\u0010L\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006R\u001d\u0010O\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bM\u0010\u0004\u001a\u0004\bN\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006R"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Categories;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getExpectedExpenses-0d7_KjU", "()J", "expectedExpenses", "b", "getExpectedIncome-0d7_KjU", "expectedIncome", "c", "getTransportation-0d7_KjU", "transportation", "d", "getOtherIncomes-0d7_KjU", "otherIncomes", "e", "getLeisure-0d7_KjU", "leisure", "f", "getHome-0d7_KjU", Constants.HOME, "g", "getFinancing-0d7_KjU", "financing", "h", "getPublicAdministration-0d7_KjU", "publicAdministration", "i", "getEducation-0d7_KjU", "education", "j", "getHealthBeauty-0d7_KjU", "healthBeauty", "k", "getSalariesRentsSubsidies-0d7_KjU", "salariesRentsSubsidies", "l", "getTravel-0d7_KjU", "travel", "m", "getSaving-0d7_KjU", "saving", "n", "getInvestment-0d7_KjU", "investment", "o", "getShopping-0d7_KjU", "shopping", "p", "getNgoAssociations-0d7_KjU", "ngoAssociations", "q", "getSustainability-0d7_KjU", SustainabilityDecorator.SUSTAINABILITY, "r", "getCashFinancialServices-0d7_KjU", "cashFinancialServices", "s", "getCashTransfersChecks-0d7_KjU", "cashTransfersChecks", "t", "getCollectionInvoicesRemittances-0d7_KjU", "collectionInvoicesRemittances", "u", "getOthers-0d7_KjU", "others", SharedPrefsStorage.VERSION_KEY, "getPoints-0d7_KjU", "points", "w", "getOfferDiscountRefound-0d7_KjU", "offerDiscountRefound", "x", "getFinancingSkipPayments-0d7_KjU", "financingSkipPayments", "y", "getCombinedPromotions-0d7_KjU", "combinedPromotions", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Categories {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final long expectedExpenses;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final long expectedIncome;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final long transportation;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final long otherIncomes;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final long leisure;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final long home;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public final long financing;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public final long publicAdministration;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public final long education;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public final long healthBeauty;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        public final long salariesRentsSubsidies;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public final long travel;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public final long saving;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public final long investment;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        public final long shopping;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        public final long ngoAssociations;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        public final long sustainability;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        public final long cashFinancialServices;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        public final long cashTransfersChecks;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        public final long collectionInvoicesRemittances;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        public final long others;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        public final long points;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        public final long offerDiscountRefound;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        public final long financingSkipPayments;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        public final long combinedPromotions;

        public Categories(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, DefaultConstructorMarker defaultConstructorMarker) {
            this.expectedExpenses = j10;
            this.expectedIncome = j11;
            this.transportation = j12;
            this.otherIncomes = j13;
            this.leisure = j14;
            this.home = j15;
            this.financing = j16;
            this.publicAdministration = j17;
            this.education = j18;
            this.healthBeauty = j19;
            this.salariesRentsSubsidies = j20;
            this.travel = j21;
            this.saving = j22;
            this.investment = j23;
            this.shopping = j24;
            this.ngoAssociations = j25;
            this.sustainability = j26;
            this.cashFinancialServices = j27;
            this.cashTransfersChecks = j28;
            this.collectionInvoicesRemittances = j29;
            this.others = j30;
            this.points = j31;
            this.offerDiscountRefound = j32;
            this.financingSkipPayments = j33;
            this.combinedPromotions = j34;
        }

        /* JADX INFO: renamed from: getCashFinancialServices-0d7_KjU, reason: not valid java name and from getter */
        public final long getCashFinancialServices() {
            return this.cashFinancialServices;
        }

        /* JADX INFO: renamed from: getCashTransfersChecks-0d7_KjU, reason: not valid java name and from getter */
        public final long getCashTransfersChecks() {
            return this.cashTransfersChecks;
        }

        /* JADX INFO: renamed from: getCollectionInvoicesRemittances-0d7_KjU, reason: not valid java name and from getter */
        public final long getCollectionInvoicesRemittances() {
            return this.collectionInvoicesRemittances;
        }

        /* JADX INFO: renamed from: getCombinedPromotions-0d7_KjU, reason: not valid java name and from getter */
        public final long getCombinedPromotions() {
            return this.combinedPromotions;
        }

        /* JADX INFO: renamed from: getEducation-0d7_KjU, reason: not valid java name and from getter */
        public final long getEducation() {
            return this.education;
        }

        /* JADX INFO: renamed from: getExpectedExpenses-0d7_KjU, reason: not valid java name and from getter */
        public final long getExpectedExpenses() {
            return this.expectedExpenses;
        }

        /* JADX INFO: renamed from: getExpectedIncome-0d7_KjU, reason: not valid java name and from getter */
        public final long getExpectedIncome() {
            return this.expectedIncome;
        }

        /* JADX INFO: renamed from: getFinancing-0d7_KjU, reason: not valid java name and from getter */
        public final long getFinancing() {
            return this.financing;
        }

        /* JADX INFO: renamed from: getFinancingSkipPayments-0d7_KjU, reason: not valid java name and from getter */
        public final long getFinancingSkipPayments() {
            return this.financingSkipPayments;
        }

        /* JADX INFO: renamed from: getHealthBeauty-0d7_KjU, reason: not valid java name and from getter */
        public final long getHealthBeauty() {
            return this.healthBeauty;
        }

        /* JADX INFO: renamed from: getHome-0d7_KjU, reason: not valid java name and from getter */
        public final long getHome() {
            return this.home;
        }

        /* JADX INFO: renamed from: getInvestment-0d7_KjU, reason: not valid java name and from getter */
        public final long getInvestment() {
            return this.investment;
        }

        /* JADX INFO: renamed from: getLeisure-0d7_KjU, reason: not valid java name and from getter */
        public final long getLeisure() {
            return this.leisure;
        }

        /* JADX INFO: renamed from: getNgoAssociations-0d7_KjU, reason: not valid java name and from getter */
        public final long getNgoAssociations() {
            return this.ngoAssociations;
        }

        /* JADX INFO: renamed from: getOfferDiscountRefound-0d7_KjU, reason: not valid java name and from getter */
        public final long getOfferDiscountRefound() {
            return this.offerDiscountRefound;
        }

        /* JADX INFO: renamed from: getOtherIncomes-0d7_KjU, reason: not valid java name and from getter */
        public final long getOtherIncomes() {
            return this.otherIncomes;
        }

        /* JADX INFO: renamed from: getOthers-0d7_KjU, reason: not valid java name and from getter */
        public final long getOthers() {
            return this.others;
        }

        /* JADX INFO: renamed from: getPoints-0d7_KjU, reason: not valid java name and from getter */
        public final long getPoints() {
            return this.points;
        }

        /* JADX INFO: renamed from: getPublicAdministration-0d7_KjU, reason: not valid java name and from getter */
        public final long getPublicAdministration() {
            return this.publicAdministration;
        }

        /* JADX INFO: renamed from: getSalariesRentsSubsidies-0d7_KjU, reason: not valid java name and from getter */
        public final long getSalariesRentsSubsidies() {
            return this.salariesRentsSubsidies;
        }

        /* JADX INFO: renamed from: getSaving-0d7_KjU, reason: not valid java name and from getter */
        public final long getSaving() {
            return this.saving;
        }

        /* JADX INFO: renamed from: getShopping-0d7_KjU, reason: not valid java name and from getter */
        public final long getShopping() {
            return this.shopping;
        }

        /* JADX INFO: renamed from: getSustainability-0d7_KjU, reason: not valid java name and from getter */
        public final long getSustainability() {
            return this.sustainability;
        }

        /* JADX INFO: renamed from: getTransportation-0d7_KjU, reason: not valid java name and from getter */
        public final long getTransportation() {
            return this.transportation;
        }

        /* JADX INFO: renamed from: getTravel-0d7_KjU, reason: not valid java name and from getter */
        public final long getTravel() {
            return this.travel;
        }
    }

    /* JADX INFO: compiled from: Color.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0006()*+,-B7\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006."}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Cta;", "", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Main;", "a", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Main;", "getMain", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Main;", "main", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary;", "getComplementary", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary;", "complementary", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Positive;", "c", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Positive;", "getPositive", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Positive;", "positive", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Negative;", "d", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Negative;", "getNegative", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Negative;", "negative", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Disabled;", "e", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Disabled;", "getDisabled", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Disabled;", BaseMenuItem.STATE_DISABLED, "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Multistep;", "f", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Multistep;", "getMultistep", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Multistep;", "multistep", "<init>", "(Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Main;Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary;Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Positive;Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Negative;Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Disabled;Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Multistep;)V", "Complementary", "Disabled", "Main", "Multistep", "Negative", "Positive", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Cta {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Main main;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Complementary complementary;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Positive positive;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Negative negative;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Disabled disabled;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Multistep multistep;

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary;", "", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary$Background;", "a", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary$Background;", "getBackground", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary$Background;", "background", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary$Text;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary$Text;", "getText", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary$Text;", "text", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary$Border;", "c", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary$Border;", "getBorder", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary$Border;", OutlinedTextFieldKt.BorderId, "<init>", "(Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary$Background;Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary$Text;Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary$Border;)V", "Background", "Border", "Text", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Complementary {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Background background;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Text text;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Border border;

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary$Background;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getPressed-0d7_KjU", "()J", "pressed", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Background {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long pressed;

                public Background(long j10, DefaultConstructorMarker defaultConstructorMarker) {
                    this.pressed = j10;
                }

                /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
                public final long getPressed() {
                    return this.pressed;
                }
            }

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary$Border;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Border {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                public Border(long j10, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }
            }

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Complementary$Text;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Text {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long pressed;

                public Text(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.pressed = j11;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
                public final long getPressed() {
                    return this.pressed;
                }
            }

            public Complementary(@NotNull Background background, @NotNull Text text, @NotNull Border border) {
                Intrinsics.checkNotNullParameter(background, "background");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(border, "border");
                this.background = background;
                this.text = text;
                this.border = border;
            }

            @NotNull
            public final Background getBackground() {
                return this.background;
            }

            @NotNull
            public final Border getBorder() {
                return this.border;
            }

            @NotNull
            public final Text getText() {
                return this.text;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Disabled;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getBackground-0d7_KjU", "()J", "background", "b", "getText-0d7_KjU", "text", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Disabled {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long background;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long text;

            public Disabled(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.background = j10;
                this.text = j11;
            }

            /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
            public final long getBackground() {
                return this.background;
            }

            /* JADX INFO: renamed from: getText-0d7_KjU, reason: not valid java name and from getter */
            public final long getText() {
                return this.text;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Main;", "", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Main$Background;", "a", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Main$Background;", "getBackground", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Main$Background;", "background", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Main$Text;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Main$Text;", "getText", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Main$Text;", "text", "<init>", "(Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Main$Background;Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Main$Text;)V", "Background", "Text", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Main {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Background background;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Text text;

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Main$Background;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Background {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long pressed;

                public Background(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.pressed = j11;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
                public final long getPressed() {
                    return this.pressed;
                }
            }

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Main$Text;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "c", "getPreloading-0d7_KjU", "preloading", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Text {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long pressed;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                public final long preloading;

                public Text(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.pressed = j11;
                    this.preloading = j12;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getPreloading-0d7_KjU, reason: not valid java name and from getter */
                public final long getPreloading() {
                    return this.preloading;
                }

                /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
                public final long getPressed() {
                    return this.pressed;
                }
            }

            public Main(@NotNull Background background, @NotNull Text text) {
                Intrinsics.checkNotNullParameter(background, "background");
                Intrinsics.checkNotNullParameter(text, "text");
                this.background = background;
                this.text = text;
            }

            @NotNull
            public final Background getBackground() {
                return this.background;
            }

            @NotNull
            public final Text getText() {
                return this.text;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Multistep;", "", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Multistep$Background;", "a", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Multistep$Background;", "getBackground", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Multistep$Background;", "background", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Multistep$Text;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Multistep$Text;", "getText", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Multistep$Text;", "text", "<init>", "(Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Multistep$Background;Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Multistep$Text;)V", "Background", "Text", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Multistep {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Background background;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Text text;

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Multistep$Background;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Background {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long pressed;

                public Background(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.pressed = j11;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
                public final long getPressed() {
                    return this.pressed;
                }
            }

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Multistep$Text;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Text {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long pressed;

                public Text(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.pressed = j11;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
                public final long getPressed() {
                    return this.pressed;
                }
            }

            public Multistep(@NotNull Background background, @NotNull Text text) {
                Intrinsics.checkNotNullParameter(background, "background");
                Intrinsics.checkNotNullParameter(text, "text");
                this.background = background;
                this.text = text;
            }

            @NotNull
            public final Background getBackground() {
                return this.background;
            }

            @NotNull
            public final Text getText() {
                return this.text;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Negative;", "", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Negative$Background;", "a", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Negative$Background;", "getBackground", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Negative$Background;", "background", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Negative$Text;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Negative$Text;", "getText", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Negative$Text;", "text", "<init>", "(Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Negative$Background;Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Negative$Text;)V", "Background", "Text", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Negative {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Background background;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Text text;

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Negative$Background;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Background {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long pressed;

                public Background(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.pressed = j11;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
                public final long getPressed() {
                    return this.pressed;
                }
            }

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Negative$Text;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "c", "getPreloading-0d7_KjU", "preloading", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Text {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long pressed;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                public final long preloading;

                public Text(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.pressed = j11;
                    this.preloading = j12;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getPreloading-0d7_KjU, reason: not valid java name and from getter */
                public final long getPreloading() {
                    return this.preloading;
                }

                /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
                public final long getPressed() {
                    return this.pressed;
                }
            }

            public Negative(@NotNull Background background, @NotNull Text text) {
                Intrinsics.checkNotNullParameter(background, "background");
                Intrinsics.checkNotNullParameter(text, "text");
                this.background = background;
                this.text = text;
            }

            @NotNull
            public final Background getBackground() {
                return this.background;
            }

            @NotNull
            public final Text getText() {
                return this.text;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Positive;", "", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Positive$Background;", "a", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Positive$Background;", "getBackground", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Positive$Background;", "background", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Positive$Text;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Positive$Text;", "getText", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Positive$Text;", "text", "<init>", "(Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Positive$Background;Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Positive$Text;)V", "Background", "Text", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Positive {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Background background;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Text text;

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Positive$Background;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Background {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long pressed;

                public Background(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.pressed = j11;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
                public final long getPressed() {
                    return this.pressed;
                }
            }

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Cta$Positive$Text;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Text {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long pressed;

                public Text(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.pressed = j11;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
                public final long getPressed() {
                    return this.pressed;
                }
            }

            public Positive(@NotNull Background background, @NotNull Text text) {
                Intrinsics.checkNotNullParameter(background, "background");
                Intrinsics.checkNotNullParameter(text, "text");
                this.background = background;
                this.text = text;
            }

            @NotNull
            public final Background getBackground() {
                return this.background;
            }

            @NotNull
            public final Text getText() {
                return this.text;
            }
        }

        public Cta(@NotNull Main main, @NotNull Complementary complementary, @NotNull Positive positive, @NotNull Negative negative, @NotNull Disabled disabled, @NotNull Multistep multistep) {
            Intrinsics.checkNotNullParameter(main, "main");
            Intrinsics.checkNotNullParameter(complementary, "complementary");
            Intrinsics.checkNotNullParameter(positive, "positive");
            Intrinsics.checkNotNullParameter(negative, "negative");
            Intrinsics.checkNotNullParameter(disabled, "disabled");
            Intrinsics.checkNotNullParameter(multistep, "multistep");
            this.main = main;
            this.complementary = complementary;
            this.positive = positive;
            this.negative = negative;
            this.disabled = disabled;
            this.multistep = multistep;
        }

        @NotNull
        public final Complementary getComplementary() {
            return this.complementary;
        }

        @NotNull
        public final Disabled getDisabled() {
            return this.disabled;
        }

        @NotNull
        public final Main getMain() {
            return this.main;
        }

        @NotNull
        public final Multistep getMultistep() {
            return this.multistep;
        }

        @NotNull
        public final Negative getNegative() {
            return this.negative;
        }

        @NotNull
        public final Positive getPositive() {
            return this.positive;
        }
    }

    /* JADX INFO: compiled from: Color.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Data;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getAxis01-0d7_KjU", "()J", "axis01", "b", "getAxis02-0d7_KjU", "axis02", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Data {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final long axis01;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final long axis02;

        public Data(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this.axis01 = j10;
            this.axis02 = j11;
        }

        /* JADX INFO: renamed from: getAxis01-0d7_KjU, reason: not valid java name and from getter */
        public final long getAxis01() {
            return this.axis01;
        }

        /* JADX INFO: renamed from: getAxis02-0d7_KjU, reason: not valid java name and from getter */
        public final long getAxis02() {
            return this.axis02;
        }
    }

    /* JADX INFO: compiled from: Color.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent;", "", "Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent$Main;", "a", "Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent$Main;", "getMain", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent$Main;", "main", "<init>", "(Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent$Main;)V", "Main", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Emergent {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Main main;

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent$Main;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getText-0d7_KjU", "()J", "text", "Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent$Main$Background;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent$Main$Background;", "getBackground", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent$Main$Background;", "background", "Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent$Main$Link;", "c", "Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent$Main$Link;", "getLink", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent$Main$Link;", DynamicLink.Builder.KEY_LINK, "<init>", "(JLcom/bbva/ui/compose/theme/ExtendedColors$Emergent$Main$Background;Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent$Main$Link;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Background", "Link", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Main {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long text;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Background background;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Link link;

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent$Main$Background;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Background {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long pressed;

                public Background(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.pressed = j11;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
                public final long getPressed() {
                    return this.pressed;
                }
            }

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Emergent$Main$Link;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Link {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long pressed;

                public Link(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.pressed = j11;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
                public final long getPressed() {
                    return this.pressed;
                }
            }

            public Main(long j10, Background background, Link link, DefaultConstructorMarker defaultConstructorMarker) {
                Intrinsics.checkNotNullParameter(background, "background");
                Intrinsics.checkNotNullParameter(link, "link");
                this.text = j10;
                this.background = background;
                this.link = link;
            }

            @NotNull
            public final Background getBackground() {
                return this.background;
            }

            @NotNull
            public final Link getLink() {
                return this.link;
            }

            /* JADX INFO: renamed from: getText-0d7_KjU, reason: not valid java name and from getter */
            public final long getText() {
                return this.text;
            }
        }

        public Emergent(@NotNull Main main) {
            Intrinsics.checkNotNullParameter(main, "main");
            this.main = main;
        }

        @NotNull
        public final Main getMain() {
            return this.main;
        }
    }

    /* JADX INFO: compiled from: Color.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Form;", "", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input;", "a", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input;", "getInput", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input;", "input", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector;", "getSelector", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector;", "selector", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Switch;", "c", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Switch;", "getSwitch", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Switch;", "switch", "<init>", "(Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input;Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector;Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Switch;)V", "Input", "Selector", "Switch", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Form {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Input input;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Selector selector;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Switch switch;

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0007./01234B?\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010%\u001a\u00020 \u0012\u0006\u0010+\u001a\u00020&¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u00065"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input;", "", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Background;", "a", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Background;", "getBackground", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Background;", "background", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Placeholder;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Placeholder;", "getPlaceholder", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Placeholder;", "placeholder", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$FieldText;", "c", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$FieldText;", "getFieldText", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$FieldText;", "fieldText", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$HintText;", "d", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$HintText;", "getHintText", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$HintText;", "hintText", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Icon;", "e", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Icon;", "getIcon", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Icon;", "icon", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$AddIcon;", "f", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$AddIcon;", "getAddIcon", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$AddIcon;", "addIcon", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Border;", "g", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Border;", "getBorder", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Border;", OutlinedTextFieldKt.BorderId, "<init>", "(Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Background;Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Placeholder;Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$FieldText;Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$HintText;Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Icon;Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$AddIcon;Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Border;)V", "AddIcon", "Background", "Border", "FieldText", "HintText", "Icon", "Placeholder", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Input {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Background background;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Placeholder placeholder;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final FieldText fieldText;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final HintText hintText;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Icon icon;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final AddIcon addIcon;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Border border;

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$AddIcon;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getError-0d7_KjU", "error", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class AddIcon {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long error;

                public AddIcon(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.error = j11;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name and from getter */
                public final long getError() {
                    return this.error;
                }
            }

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Background;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getError-0d7_KjU", "error", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Background {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long error;

                public Background(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.error = j11;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name and from getter */
                public final long getError() {
                    return this.error;
                }
            }

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Border;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getInactive-0d7_KjU", "()J", "inactive", "b", "getActive-0d7_KjU", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "c", "getError-0d7_KjU", "error", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Border {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long inactive;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long active;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                public final long error;

                public Border(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
                    this.inactive = j10;
                    this.active = j11;
                    this.error = j12;
                }

                /* JADX INFO: renamed from: getActive-0d7_KjU, reason: not valid java name and from getter */
                public final long getActive() {
                    return this.active;
                }

                /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name and from getter */
                public final long getError() {
                    return this.error;
                }

                /* JADX INFO: renamed from: getInactive-0d7_KjU, reason: not valid java name and from getter */
                public final long getInactive() {
                    return this.inactive;
                }
            }

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$FieldText;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getError-0d7_KjU", "error", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class FieldText {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long error;

                public FieldText(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.error = j11;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name and from getter */
                public final long getError() {
                    return this.error;
                }
            }

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$HintText;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getError-0d7_KjU", "error", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class HintText {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long error;

                public HintText(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.error = j11;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name and from getter */
                public final long getError() {
                    return this.error;
                }
            }

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Icon;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getReadOnly-0d7_KjU", "readOnly", "c", "getError-0d7_KjU", "error", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Icon {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long readOnly;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                public final long error;

                public Icon(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.readOnly = j11;
                    this.error = j12;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name and from getter */
                public final long getError() {
                    return this.error;
                }

                /* JADX INFO: renamed from: getReadOnly-0d7_KjU, reason: not valid java name and from getter */
                public final long getReadOnly() {
                    return this.readOnly;
                }
            }

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Input$Placeholder;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getError-0d7_KjU", "error", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Placeholder {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long error;

                public Placeholder(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.error = j11;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name and from getter */
                public final long getError() {
                    return this.error;
                }
            }

            public Input(@NotNull Background background, @NotNull Placeholder placeholder, @NotNull FieldText fieldText, @NotNull HintText hintText, @NotNull Icon icon, @NotNull AddIcon addIcon, @NotNull Border border) {
                Intrinsics.checkNotNullParameter(background, "background");
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                Intrinsics.checkNotNullParameter(fieldText, "fieldText");
                Intrinsics.checkNotNullParameter(hintText, "hintText");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(addIcon, "addIcon");
                Intrinsics.checkNotNullParameter(border, "border");
                this.background = background;
                this.placeholder = placeholder;
                this.fieldText = fieldText;
                this.hintText = hintText;
                this.icon = icon;
                this.addIcon = addIcon;
                this.border = border;
            }

            @NotNull
            public final AddIcon getAddIcon() {
                return this.addIcon;
            }

            @NotNull
            public final Background getBackground() {
                return this.background;
            }

            @NotNull
            public final Border getBorder() {
                return this.border;
            }

            @NotNull
            public final FieldText getFieldText() {
                return this.fieldText;
            }

            @NotNull
            public final HintText getHintText() {
                return this.hintText;
            }

            @NotNull
            public final Icon getIcon() {
                return this.icon;
            }

            @NotNull
            public final Placeholder getPlaceholder() {
                return this.placeholder;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector;", "", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector$Background;", "a", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector$Background;", "getBackground", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector$Background;", "background", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector$Border;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector$Border;", "getBorder", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector$Border;", OutlinedTextFieldKt.BorderId, "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector$Check;", "c", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector$Check;", "getCheck", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector$Check;", "check", "<init>", "(Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector$Background;Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector$Border;Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector$Check;)V", "Background", "Border", "Check", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Selector {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Background background;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Border border;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Check check;

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector$Background;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getAlternative-0d7_KjU", "alternative", "c", "getError-0d7_KjU", "error", "d", "getContrast-0d7_KjU", "contrast", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Background {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long alternative;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                public final long error;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                public final long contrast;

                public Background(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.alternative = j11;
                    this.error = j12;
                    this.contrast = j13;
                }

                /* JADX INFO: renamed from: getAlternative-0d7_KjU, reason: not valid java name and from getter */
                public final long getAlternative() {
                    return this.alternative;
                }

                /* JADX INFO: renamed from: getContrast-0d7_KjU, reason: not valid java name and from getter */
                public final long getContrast() {
                    return this.contrast;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name and from getter */
                public final long getError() {
                    return this.error;
                }
            }

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector$Border;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getError-0d7_KjU", "error", "c", "getContrast-0d7_KjU", "contrast", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Border {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long error;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                public final long contrast;

                public Border(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.error = j11;
                    this.contrast = j12;
                }

                /* JADX INFO: renamed from: getContrast-0d7_KjU, reason: not valid java name and from getter */
                public final long getContrast() {
                    return this.contrast;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name and from getter */
                public final long getError() {
                    return this.error;
                }
            }

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Selector$Check;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getReadOnly-0d7_KjU", "readOnly", "c", "getContrast-0d7_KjU", "contrast", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Check {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long readOnly;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                public final long contrast;

                public Check(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.readOnly = j11;
                    this.contrast = j12;
                }

                /* JADX INFO: renamed from: getContrast-0d7_KjU, reason: not valid java name and from getter */
                public final long getContrast() {
                    return this.contrast;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getReadOnly-0d7_KjU, reason: not valid java name and from getter */
                public final long getReadOnly() {
                    return this.readOnly;
                }
            }

            public Selector(@NotNull Background background, @NotNull Border border, @NotNull Check check) {
                Intrinsics.checkNotNullParameter(background, "background");
                Intrinsics.checkNotNullParameter(border, "border");
                Intrinsics.checkNotNullParameter(check, "check");
                this.background = background;
                this.border = border;
                this.check = check;
            }

            @NotNull
            public final Background getBackground() {
                return this.background;
            }

            @NotNull
            public final Border getBorder() {
                return this.border;
            }

            @NotNull
            public final Check getCheck() {
                return this.check;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Switch;", "", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Switch$Background;", "a", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Switch$Background;", "getBackground", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Switch$Background;", "background", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Switch$Handle;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Switch$Handle;", "getHandle", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Switch$Handle;", "handle", "<init>", "(Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Switch$Background;Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Switch$Handle;)V", "Background", "Handle", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Switch {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Background background;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Handle handle;

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Switch$Background;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getOn-0d7_KjU", "()J", DebugKt.DEBUG_PROPERTY_VALUE_ON, "b", "getOff-0d7_KjU", DebugKt.DEBUG_PROPERTY_VALUE_OFF, "c", "getContrast-0d7_KjU", "contrast", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Background {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long on;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long off;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                public final long contrast;

                public Background(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
                    this.on = j10;
                    this.off = j11;
                    this.contrast = j12;
                }

                /* JADX INFO: renamed from: getContrast-0d7_KjU, reason: not valid java name and from getter */
                public final long getContrast() {
                    return this.contrast;
                }

                /* JADX INFO: renamed from: getOff-0d7_KjU, reason: not valid java name and from getter */
                public final long getOff() {
                    return this.off;
                }

                /* JADX INFO: renamed from: getOn-0d7_KjU, reason: not valid java name and from getter */
                public final long getOn() {
                    return this.on;
                }
            }

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Form$Switch$Handle;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getOn-0d7_KjU", "()J", DebugKt.DEBUG_PROPERTY_VALUE_ON, "b", "getOff-0d7_KjU", DebugKt.DEBUG_PROPERTY_VALUE_OFF, "c", "getContrast-0d7_KjU", "contrast", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Handle {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long on;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long off;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                public final long contrast;

                public Handle(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
                    this.on = j10;
                    this.off = j11;
                    this.contrast = j12;
                }

                /* JADX INFO: renamed from: getContrast-0d7_KjU, reason: not valid java name and from getter */
                public final long getContrast() {
                    return this.contrast;
                }

                /* JADX INFO: renamed from: getOff-0d7_KjU, reason: not valid java name and from getter */
                public final long getOff() {
                    return this.off;
                }

                /* JADX INFO: renamed from: getOn-0d7_KjU, reason: not valid java name and from getter */
                public final long getOn() {
                    return this.on;
                }
            }

            public Switch(@NotNull Background background, @NotNull Handle handle) {
                Intrinsics.checkNotNullParameter(background, "background");
                Intrinsics.checkNotNullParameter(handle, "handle");
                this.background = background;
                this.handle = handle;
            }

            @NotNull
            public final Background getBackground() {
                return this.background;
            }

            @NotNull
            public final Handle getHandle() {
                return this.handle;
            }
        }

        public Form(@NotNull Input input, @NotNull Selector selector, @NotNull Switch r4) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(selector, "selector");
            Intrinsics.checkNotNullParameter(r4, "switch");
            this.input = input;
            this.selector = selector;
            this.switch = r4;
        }

        @NotNull
        public final Input getInput() {
            return this.input;
        }

        @NotNull
        public final Selector getSelector() {
            return this.selector;
        }

        @NotNull
        public final Switch getSwitch() {
            return this.switch;
        }
    }

    /* JADX INFO: compiled from: Color.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Format;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDivider-0d7_KjU", "()J", "divider", "b", "getBullet-0d7_KjU", SqlContracts.BulletEntry.TABLE_NAME, "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Format {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final long divider;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final long bullet;

        public Format(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this.divider = j10;
            this.bullet = j11;
        }

        /* JADX INFO: renamed from: getBullet-0d7_KjU, reason: not valid java name and from getter */
        public final long getBullet() {
            return this.bullet;
        }

        /* JADX INFO: renamed from: getDivider-0d7_KjU, reason: not valid java name and from getter */
        public final long getDivider() {
            return this.divider;
        }
    }

    /* JADX INFO: compiled from: Color.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0006()*+,-B7\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006."}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Link;", "", "Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Main;", "a", "Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Main;", "getMain", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Main;", "main", "Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Complementary;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Complementary;", "getComplementary", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Complementary;", "complementary", "Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Highlight;", "c", "Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Highlight;", "getHighlight", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Highlight;", "highlight", "Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Negative;", "d", "Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Negative;", "getNegative", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Negative;", "negative", "Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Inverse;", "e", "Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Inverse;", "getInverse", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Inverse;", "inverse", "Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Image;", "f", "Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Image;", "getImage", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Image;", AuthConstants.IMAGE, "<init>", "(Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Main;Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Complementary;Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Highlight;Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Negative;Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Inverse;Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Image;)V", "Complementary", "Highlight", "Image", "Inverse", "Main", "Negative", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Link {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Main main;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Complementary complementary;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Highlight highlight;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Negative negative;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Inverse inverse;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Image image;

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Complementary;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Complementary {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long pressed;

            public Complementary(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
                this.pressed = j11;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }

            /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
            public final long getPressed() {
                return this.pressed;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Highlight;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Highlight {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long pressed;

            public Highlight(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
                this.pressed = j11;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }

            /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
            public final long getPressed() {
                return this.pressed;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Image;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Image {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long pressed;

            public Image(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
                this.pressed = j11;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }

            /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
            public final long getPressed() {
                return this.pressed;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Inverse;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Inverse {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long pressed;

            public Inverse(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
                this.pressed = j11;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }

            /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
            public final long getPressed() {
                return this.pressed;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Main;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getPressed-0d7_KjU", "()J", "pressed", "b", "getDefault-0d7_KjU", "default", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Main {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long pressed;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long default;

            public Main(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.pressed = j10;
                this.default = j11;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }

            /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
            public final long getPressed() {
                return this.pressed;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Link$Negative;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Negative {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long pressed;

            public Negative(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
                this.pressed = j11;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }

            /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
            public final long getPressed() {
                return this.pressed;
            }
        }

        public Link(@NotNull Main main, @NotNull Complementary complementary, @NotNull Highlight highlight, @NotNull Negative negative, @NotNull Inverse inverse, @NotNull Image image) {
            Intrinsics.checkNotNullParameter(main, "main");
            Intrinsics.checkNotNullParameter(complementary, "complementary");
            Intrinsics.checkNotNullParameter(highlight, "highlight");
            Intrinsics.checkNotNullParameter(negative, "negative");
            Intrinsics.checkNotNullParameter(inverse, "inverse");
            Intrinsics.checkNotNullParameter(image, "image");
            this.main = main;
            this.complementary = complementary;
            this.highlight = highlight;
            this.negative = negative;
            this.inverse = inverse;
            this.image = image;
        }

        @NotNull
        public final Complementary getComplementary() {
            return this.complementary;
        }

        @NotNull
        public final Highlight getHighlight() {
            return this.highlight;
        }

        @NotNull
        public final Image getImage() {
            return this.image;
        }

        @NotNull
        public final Inverse getInverse() {
            return this.inverse;
        }

        @NotNull
        public final Main getMain() {
            return this.main;
        }

        @NotNull
        public final Negative getNegative() {
            return this.negative;
        }
    }

    /* JADX INFO: compiled from: Color.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Locations;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getUser-0d7_KjU", "()J", "user", "Lcom/bbva/ui/compose/theme/ExtendedColors$Locations$Pins;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Locations$Pins;", "getPins", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Locations$Pins;", "pins", "<init>", "(JLcom/bbva/ui/compose/theme/ExtendedColors$Locations$Pins;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Pins", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Locations {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final long user;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Pins pins;

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Locations$Pins;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getIcon-0d7_KjU", "()J", "icon", "Lcom/bbva/ui/compose/theme/ExtendedColors$Locations$Pins$Background;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Locations$Pins$Background;", "getBackground", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Locations$Pins$Background;", "background", "Lcom/bbva/ui/compose/theme/ExtendedColors$Locations$Pins$Text;", "c", "Lcom/bbva/ui/compose/theme/ExtendedColors$Locations$Pins$Text;", "getText", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Locations$Pins$Text;", "text", "<init>", "(JLcom/bbva/ui/compose/theme/ExtendedColors$Locations$Pins$Background;Lcom/bbva/ui/compose/theme/ExtendedColors$Locations$Pins$Text;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Background", "Text", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Pins {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long icon;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Background background;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Text text;

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Locations$Pins$Background;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "c", "getSelected-0d7_KjU", "selected", "d", "getSelectedPressed-0d7_KjU", "selectedPressed", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Background {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long pressed;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                public final long selected;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                public final long selectedPressed;

                public Background(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.pressed = j11;
                    this.selected = j12;
                    this.selectedPressed = j13;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
                public final long getPressed() {
                    return this.pressed;
                }

                /* JADX INFO: renamed from: getSelected-0d7_KjU, reason: not valid java name and from getter */
                public final long getSelected() {
                    return this.selected;
                }

                /* JADX INFO: renamed from: getSelectedPressed-0d7_KjU, reason: not valid java name and from getter */
                public final long getSelectedPressed() {
                    return this.selectedPressed;
                }
            }

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Locations$Pins$Text;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "c", "getSelected-0d7_KjU", "selected", "d", "getSelectedPressed-0d7_KjU", "selectedPressed", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Text {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long default;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long pressed;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                public final long selected;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                public final long selectedPressed;

                public Text(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
                    this.default = j10;
                    this.pressed = j11;
                    this.selected = j12;
                    this.selectedPressed = j13;
                }

                /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
                public final long getDefault() {
                    return this.default;
                }

                /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
                public final long getPressed() {
                    return this.pressed;
                }

                /* JADX INFO: renamed from: getSelected-0d7_KjU, reason: not valid java name and from getter */
                public final long getSelected() {
                    return this.selected;
                }

                /* JADX INFO: renamed from: getSelectedPressed-0d7_KjU, reason: not valid java name and from getter */
                public final long getSelectedPressed() {
                    return this.selectedPressed;
                }
            }

            public Pins(long j10, Background background, Text text, DefaultConstructorMarker defaultConstructorMarker) {
                Intrinsics.checkNotNullParameter(background, "background");
                Intrinsics.checkNotNullParameter(text, "text");
                this.icon = j10;
                this.background = background;
                this.text = text;
            }

            @NotNull
            public final Background getBackground() {
                return this.background;
            }

            /* JADX INFO: renamed from: getIcon-0d7_KjU, reason: not valid java name and from getter */
            public final long getIcon() {
                return this.icon;
            }

            @NotNull
            public final Text getText() {
                return this.text;
            }
        }

        public Locations(long j10, Pins pins, DefaultConstructorMarker defaultConstructorMarker) {
            Intrinsics.checkNotNullParameter(pins, "pins");
            this.user = j10;
            this.pins = pins;
        }

        @NotNull
        public final Pins getPins() {
            return this.pins;
        }

        /* JADX INFO: renamed from: getUser-0d7_KjU, reason: not valid java name and from getter */
        public final long getUser() {
            return this.user;
        }
    }

    /* JADX INFO: compiled from: Color.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Notification;", "", "Lcom/bbva/ui/compose/theme/ExtendedColors$Notification$Alert;", "a", "Lcom/bbva/ui/compose/theme/ExtendedColors$Notification$Alert;", "getAlert", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Notification$Alert;", "alert", "Lcom/bbva/ui/compose/theme/ExtendedColors$Notification$Info;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Notification$Info;", "getInfo", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Notification$Info;", "info", "<init>", "(Lcom/bbva/ui/compose/theme/ExtendedColors$Notification$Alert;Lcom/bbva/ui/compose/theme/ExtendedColors$Notification$Info;)V", "Alert", "Info", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Notification {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Alert alert;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Info info;

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Notification$Alert;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getBackground-0d7_KjU", "()J", "background", "b", "getText-0d7_KjU", "text", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Alert {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long background;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long text;

            public Alert(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.background = j10;
                this.text = j11;
            }

            /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
            public final long getBackground() {
                return this.background;
            }

            /* JADX INFO: renamed from: getText-0d7_KjU, reason: not valid java name and from getter */
            public final long getText() {
                return this.text;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Notification$Info;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getBackground-0d7_KjU", "()J", "background", "b", "getText-0d7_KjU", "text", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Info {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long background;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long text;

            public Info(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.background = j10;
                this.text = j11;
            }

            /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
            public final long getBackground() {
                return this.background;
            }

            /* JADX INFO: renamed from: getText-0d7_KjU, reason: not valid java name and from getter */
            public final long getText() {
                return this.text;
            }
        }

        public Notification(@NotNull Alert alert, @NotNull Info info) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            Intrinsics.checkNotNullParameter(info, "info");
            this.alert = alert;
            this.info = info;
        }

        @NotNull
        public final Alert getAlert() {
            return this.alert;
        }

        @NotNull
        public final Info getInfo() {
            return this.info;
        }
    }

    /* JADX INFO: compiled from: Color.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Process;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getPending-0d7_KjU", "()J", "pending", "b", "getInProgress-0d7_KjU", TohuCallback.IN_PROGRESS_RESULT, "c", "getAlert-0d7_KjU", "alert", "d", "getWarning-0d7_KjU", "warning", "e", "getCompleted-0d7_KjU", "completed", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Process {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final long pending;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final long inProgress;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final long alert;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final long warning;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final long completed;

        public Process(long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
            this.pending = j10;
            this.inProgress = j11;
            this.alert = j12;
            this.warning = j13;
            this.completed = j14;
        }

        /* JADX INFO: renamed from: getAlert-0d7_KjU, reason: not valid java name and from getter */
        public final long getAlert() {
            return this.alert;
        }

        /* JADX INFO: renamed from: getCompleted-0d7_KjU, reason: not valid java name and from getter */
        public final long getCompleted() {
            return this.completed;
        }

        /* JADX INFO: renamed from: getInProgress-0d7_KjU, reason: not valid java name and from getter */
        public final long getInProgress() {
            return this.inProgress;
        }

        /* JADX INFO: renamed from: getPending-0d7_KjU, reason: not valid java name and from getter */
        public final long getPending() {
            return this.pending;
        }

        /* JADX INFO: renamed from: getWarning-0d7_KjU, reason: not valid java name and from getter */
        public final long getWarning() {
            return this.warning;
        }
    }

    /* JADX INFO: compiled from: Color.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Rating;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getStars-0d7_KjU", "()J", "stars", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Rating {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final long stars;

        public Rating(long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this.stars = j10;
        }

        /* JADX INFO: renamed from: getStars-0d7_KjU, reason: not valid java name and from getter */
        public final long getStars() {
            return this.stars;
        }
    }

    /* JADX INFO: compiled from: Color.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Risk;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getLevelOne-0d7_KjU", "()J", "levelOne", "b", "getLevelTwo-0d7_KjU", "levelTwo", "c", "getLevelThree-0d7_KjU", "levelThree", "d", "getLevelFour-0d7_KjU", "levelFour", "e", "getLevelFive-0d7_KjU", "levelFive", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Risk {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final long levelOne;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final long levelTwo;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final long levelThree;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final long levelFour;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final long levelFive;

        public Risk(long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
            this.levelOne = j10;
            this.levelTwo = j11;
            this.levelThree = j12;
            this.levelFour = j13;
            this.levelFive = j14;
        }

        /* JADX INFO: renamed from: getLevelFive-0d7_KjU, reason: not valid java name and from getter */
        public final long getLevelFive() {
            return this.levelFive;
        }

        /* JADX INFO: renamed from: getLevelFour-0d7_KjU, reason: not valid java name and from getter */
        public final long getLevelFour() {
            return this.levelFour;
        }

        /* JADX INFO: renamed from: getLevelOne-0d7_KjU, reason: not valid java name and from getter */
        public final long getLevelOne() {
            return this.levelOne;
        }

        /* JADX INFO: renamed from: getLevelThree-0d7_KjU, reason: not valid java name and from getter */
        public final long getLevelThree() {
            return this.levelThree;
        }

        /* JADX INFO: renamed from: getLevelTwo-0d7_KjU, reason: not valid java name and from getter */
        public final long getLevelTwo() {
            return this.levelTwo;
        }
    }

    /* JADX INFO: compiled from: Color.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Selection;", "", "Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction01;", "a", "Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction01;", "getInteraction01", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction01;", "interaction01", "Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction02;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction02;", "getInteraction02", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction02;", "interaction02", "<init>", "(Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction01;Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction02;)V", "Interaction01", "Interaction02", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Selection {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Interaction01 interaction01;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Interaction02 interaction02;

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction01;", "", "Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction01$Background;", "a", "Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction01$Background;", "getBackground", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction01$Background;", "background", "Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction01$Text;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction01$Text;", "getText", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction01$Text;", "text", "<init>", "(Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction01$Background;Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction01$Text;)V", "Background", "Text", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Interaction01 {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Background background;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Text text;

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction01$Background;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getSelected-0d7_KjU", "()J", "selected", "b", "getSelectedPressed-0d7_KjU", "selectedPressed", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Background {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long selected;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long selectedPressed;

                public Background(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                    this.selected = j10;
                    this.selectedPressed = j11;
                }

                /* JADX INFO: renamed from: getSelected-0d7_KjU, reason: not valid java name and from getter */
                public final long getSelected() {
                    return this.selected;
                }

                /* JADX INFO: renamed from: getSelectedPressed-0d7_KjU, reason: not valid java name and from getter */
                public final long getSelectedPressed() {
                    return this.selectedPressed;
                }
            }

            /* JADX INFO: compiled from: Color.kt */
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction01$Text;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getSelected-0d7_KjU", "()J", "selected", "b", "getSelectedPressed-0d7_KjU", "selectedPressed", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
            public static final class Text {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final long selected;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final long selectedPressed;

                public Text(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                    this.selected = j10;
                    this.selectedPressed = j11;
                }

                /* JADX INFO: renamed from: getSelected-0d7_KjU, reason: not valid java name and from getter */
                public final long getSelected() {
                    return this.selected;
                }

                /* JADX INFO: renamed from: getSelectedPressed-0d7_KjU, reason: not valid java name and from getter */
                public final long getSelectedPressed() {
                    return this.selectedPressed;
                }
            }

            public Interaction01(@NotNull Background background, @NotNull Text text) {
                Intrinsics.checkNotNullParameter(background, "background");
                Intrinsics.checkNotNullParameter(text, "text");
                this.background = background;
                this.text = text;
            }

            @NotNull
            public final Background getBackground() {
                return this.background;
            }

            @NotNull
            public final Text getText() {
                return this.text;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Selection$Interaction02;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getSelected-0d7_KjU", "()J", "selected", "b", "getSelectedPressed-0d7_KjU", "selectedPressed", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Interaction02 {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long selected;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long selectedPressed;

            public Interaction02(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.selected = j10;
                this.selectedPressed = j11;
            }

            /* JADX INFO: renamed from: getSelected-0d7_KjU, reason: not valid java name and from getter */
            public final long getSelected() {
                return this.selected;
            }

            /* JADX INFO: renamed from: getSelectedPressed-0d7_KjU, reason: not valid java name and from getter */
            public final long getSelectedPressed() {
                return this.selectedPressed;
            }
        }

        public Selection(@NotNull Interaction01 interaction01, @NotNull Interaction02 interaction02) {
            Intrinsics.checkNotNullParameter(interaction01, "interaction01");
            Intrinsics.checkNotNullParameter(interaction02, "interaction02");
            this.interaction01 = interaction01;
            this.interaction02 = interaction02;
        }

        @NotNull
        public final Interaction01 getInteraction01() {
            return this.interaction01;
        }

        @NotNull
        public final Interaction02 getInteraction02() {
            return this.interaction02;
        }
    }

    /* JADX INFO: compiled from: Color.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0006()*+,-B7\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006."}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Support;", "", "Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Info;", "a", "Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Info;", "getInfo", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Info;", "info", "Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Success;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Success;", "getSuccess", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Success;", "success", "Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Warning;", "c", "Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Warning;", "getWarning", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Warning;", "warning", "Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Error;", "d", "Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Error;", "getError", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Error;", "error", "Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Pending;", "e", "Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Pending;", "getPending", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Pending;", "pending", "Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Sustainability;", "f", "Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Sustainability;", "getSustainability", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Sustainability;", SustainabilityDecorator.SUSTAINABILITY, "<init>", "(Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Info;Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Success;Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Warning;Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Error;Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Pending;Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Sustainability;)V", "Error", "Info", "Pending", "Success", "Sustainability", "Warning", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Support {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Info info;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Success success;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Warning warning;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Error error;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Pending pending;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Sustainability sustainability;

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Error;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Error {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            public Error(long j10, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Info;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Info {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            public Info(long j10, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Pending;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Pending {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            public Pending(long j10, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Success;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Success {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            public Success(long j10, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Sustainability;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Sustainability {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            public Sustainability(long j10, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Support$Warning;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Warning {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            public Warning(long j10, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }
        }

        public Support(@NotNull Info info, @NotNull Success success, @NotNull Warning warning, @NotNull Error error, @NotNull Pending pending, @NotNull Sustainability sustainability) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(success, "success");
            Intrinsics.checkNotNullParameter(warning, "warning");
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(pending, "pending");
            Intrinsics.checkNotNullParameter(sustainability, "sustainability");
            this.info = info;
            this.success = success;
            this.warning = warning;
            this.error = error;
            this.pending = pending;
            this.sustainability = sustainability;
        }

        @NotNull
        public final Error getError() {
            return this.error;
        }

        @NotNull
        public final Info getInfo() {
            return this.info;
        }

        @NotNull
        public final Pending getPending() {
            return this.pending;
        }

        @NotNull
        public final Success getSuccess() {
            return this.success;
        }

        @NotNull
        public final Sustainability getSustainability() {
            return this.sustainability;
        }

        @NotNull
        public final Warning getWarning() {
            return this.warning;
        }
    }

    /* JADX INFO: compiled from: Color.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\b456789:;BG\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010%\u001a\u00020 \u0012\u0006\u0010+\u001a\u00020&\u0012\u0006\u00101\u001a\u00020,¢\u0006\u0004\b2\u00103R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u0006<"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Surface;", "", "Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Ambient;", "a", "Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Ambient;", "getAmbient", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Ambient;", "ambient", "Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Alternative;", "b", "Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Alternative;", "getAlternative", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Alternative;", "alternative", "Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Contrast;", "c", "Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Contrast;", "getContrast", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Contrast;", "contrast", "Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Info;", "d", "Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Info;", "getInfo", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Info;", "info", "Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Success;", "e", "Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Success;", "getSuccess", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Success;", "success", "Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Warning;", "f", "Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Warning;", "getWarning", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Warning;", "warning", "Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Error;", "g", "Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Error;", "getError", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Error;", "error", "Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Sustainability;", "h", "Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Sustainability;", "getSustainability", "()Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Sustainability;", SustainabilityDecorator.SUSTAINABILITY, "<init>", "(Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Ambient;Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Alternative;Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Contrast;Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Info;Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Success;Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Warning;Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Error;Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Sustainability;)V", "Alternative", "Ambient", ExifInterface.TAG_CONTRAST, "Error", "Info", "Success", "Sustainability", "Warning", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Surface {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Ambient ambient;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Alternative alternative;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Contrast contrast;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Info info;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Success success;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Warning warning;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Error error;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Sustainability sustainability;

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Alternative;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "c", "getPreloading-0d7_KjU", "preloading", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Alternative {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long pressed;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            public final long preloading;

            public Alternative(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
                this.pressed = j11;
                this.preloading = j12;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }

            /* JADX INFO: renamed from: getPreloading-0d7_KjU, reason: not valid java name and from getter */
            public final long getPreloading() {
                return this.preloading;
            }

            /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
            public final long getPressed() {
                return this.pressed;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Ambient;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "c", "getPreloading-0d7_KjU", "preloading", "d", "getOverlay-0d7_KjU", "overlay", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Ambient {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long pressed;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            public final long preloading;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            public final long overlay;

            public Ambient(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
                this.pressed = j11;
                this.preloading = j12;
                this.overlay = j13;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }

            /* JADX INFO: renamed from: getOverlay-0d7_KjU, reason: not valid java name and from getter */
            public final long getOverlay() {
                return this.overlay;
            }

            /* JADX INFO: renamed from: getPreloading-0d7_KjU, reason: not valid java name and from getter */
            public final long getPreloading() {
                return this.preloading;
            }

            /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
            public final long getPressed() {
                return this.pressed;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Contrast;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPressed-0d7_KjU", "pressed", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Contrast {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long pressed;

            public Contrast(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
                this.pressed = j11;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }

            /* JADX INFO: renamed from: getPressed-0d7_KjU, reason: not valid java name and from getter */
            public final long getPressed() {
                return this.pressed;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Error;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPreloading-0d7_KjU", "preloading", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Error {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long preloading;

            public Error(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
                this.preloading = j11;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }

            /* JADX INFO: renamed from: getPreloading-0d7_KjU, reason: not valid java name and from getter */
            public final long getPreloading() {
                return this.preloading;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Info;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPreloading-0d7_KjU", "preloading", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Info {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long preloading;

            public Info(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
                this.preloading = j11;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }

            /* JADX INFO: renamed from: getPreloading-0d7_KjU, reason: not valid java name and from getter */
            public final long getPreloading() {
                return this.preloading;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Success;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPreloading-0d7_KjU", "preloading", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Success {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long preloading;

            public Success(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
                this.preloading = j11;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }

            /* JADX INFO: renamed from: getPreloading-0d7_KjU, reason: not valid java name and from getter */
            public final long getPreloading() {
                return this.preloading;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Sustainability;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPreloading-0d7_KjU", "preloading", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Sustainability {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long preloading;

            public Sustainability(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
                this.preloading = j11;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }

            /* JADX INFO: renamed from: getPreloading-0d7_KjU, reason: not valid java name and from getter */
            public final long getPreloading() {
                return this.preloading;
            }
        }

        /* JADX INFO: compiled from: Color.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/bbva/ui/compose/theme/ExtendedColors$Surface$Warning;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefault-0d7_KjU", "()J", "default", "b", "getPreloading-0d7_KjU", "preloading", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class Warning {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final long default;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final long preloading;

            public Warning(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
                this.default = j10;
                this.preloading = j11;
            }

            /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
            public final long getDefault() {
                return this.default;
            }

            /* JADX INFO: renamed from: getPreloading-0d7_KjU, reason: not valid java name and from getter */
            public final long getPreloading() {
                return this.preloading;
            }
        }

        public Surface(@NotNull Ambient ambient, @NotNull Alternative alternative, @NotNull Contrast contrast, @NotNull Info info, @NotNull Success success, @NotNull Warning warning, @NotNull Error error, @NotNull Sustainability sustainability) {
            Intrinsics.checkNotNullParameter(ambient, "ambient");
            Intrinsics.checkNotNullParameter(alternative, "alternative");
            Intrinsics.checkNotNullParameter(contrast, "contrast");
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(success, "success");
            Intrinsics.checkNotNullParameter(warning, "warning");
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(sustainability, "sustainability");
            this.ambient = ambient;
            this.alternative = alternative;
            this.contrast = contrast;
            this.info = info;
            this.success = success;
            this.warning = warning;
            this.error = error;
            this.sustainability = sustainability;
        }

        @NotNull
        public final Alternative getAlternative() {
            return this.alternative;
        }

        @NotNull
        public final Ambient getAmbient() {
            return this.ambient;
        }

        @NotNull
        public final Contrast getContrast() {
            return this.contrast;
        }

        @NotNull
        public final Error getError() {
            return this.error;
        }

        @NotNull
        public final Info getInfo() {
            return this.info;
        }

        @NotNull
        public final Success getSuccess() {
            return this.success;
        }

        @NotNull
        public final Sustainability getSustainability() {
            return this.sustainability;
        }

        @NotNull
        public final Warning getWarning() {
            return this.warning;
        }
    }

    public ExtendedColors(Colors colors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, Surface surface, Support support, Badge badge, Notification notification, Format format, Rating rating, Categories categories, Process process, Risk risk, Data data, Locations locations, Emergent emergent, Cta cta, Selection selection, Link link, Form form, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(support, "support");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(process, "process");
        Intrinsics.checkNotNullParameter(risk, "risk");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(locations, "locations");
        Intrinsics.checkNotNullParameter(emergent, "emergent");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(form, "form");
        this.colors = colors;
        this.toolBar = j10;
        this.emphasis = j11;
        this.emphasisVariant = j12;
        this.surfaceComponent = j13;
        this.loginProgressIndicatorBackground = j14;
        this.loginProgressIndicatorOverlap = j15;
        this.shimmerBase = j16;
        this.shimmerHighlight = j17;
        this.androidStatusBarColor = j18;
        this.textPrimary = j19;
        this.textPrimaryInverse = j20;
        this.textSecondary = j21;
        this.textSecondaryInverse = j22;
        this.textUncovered = j23;
        this.textIncome = j24;
        this.surface = surface;
        this.support = support;
        this.badge = badge;
        this.notification = notification;
        this.format = format;
        this.rating = rating;
        this.categories = categories;
        this.process = process;
        this.risk = risk;
        this.data = data;
        this.locations = locations;
        this.emergent = emergent;
        this.cta = cta;
        this.selection = selection;
        this.link = link;
        this.form = form;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Colors getColors() {
        return this.colors;
    }

    /* JADX INFO: renamed from: component10-0d7_KjU, reason: not valid java name and from getter */
    public final long getAndroidStatusBarColor() {
        return this.androidStatusBarColor;
    }

    /* JADX INFO: renamed from: component11-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextPrimary() {
        return this.textPrimary;
    }

    /* JADX INFO: renamed from: component12-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextPrimaryInverse() {
        return this.textPrimaryInverse;
    }

    /* JADX INFO: renamed from: component13-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextSecondary() {
        return this.textSecondary;
    }

    /* JADX INFO: renamed from: component14-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextSecondaryInverse() {
        return this.textSecondaryInverse;
    }

    /* JADX INFO: renamed from: component15-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextUncovered() {
        return this.textUncovered;
    }

    /* JADX INFO: renamed from: component16-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextIncome() {
        return this.textIncome;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Surface getSurface() {
        return this.surface;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Support getSupport() {
        return this.support;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getToolBar() {
        return this.toolBar;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Notification getNotification() {
        return this.notification;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Format getFormat() {
        return this.format;
    }

    @NotNull
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Rating getRating() {
        return this.rating;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Categories getCategories() {
        return this.categories;
    }

    @NotNull
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Process getProcess() {
        return this.process;
    }

    @NotNull
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Risk getRisk() {
        return this.risk;
    }

    @NotNull
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Locations getLocations() {
        return this.locations;
    }

    @NotNull
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Emergent getEmergent() {
        return this.emergent;
    }

    @NotNull
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Cta getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getEmphasis() {
        return this.emphasis;
    }

    @NotNull
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Selection getSelection() {
        return this.selection;
    }

    @NotNull
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Link getLink() {
        return this.link;
    }

    @NotNull
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Form getForm() {
        return this.form;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getEmphasisVariant() {
        return this.emphasisVariant;
    }

    /* JADX INFO: renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceComponent() {
        return this.surfaceComponent;
    }

    /* JADX INFO: renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
    public final long getLoginProgressIndicatorBackground() {
        return this.loginProgressIndicatorBackground;
    }

    /* JADX INFO: renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
    public final long getLoginProgressIndicatorOverlap() {
        return this.loginProgressIndicatorOverlap;
    }

    /* JADX INFO: renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
    public final long getShimmerBase() {
        return this.shimmerBase;
    }

    /* JADX INFO: renamed from: component9-0d7_KjU, reason: not valid java name and from getter */
    public final long getShimmerHighlight() {
        return this.shimmerHighlight;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-5u6CDpA, reason: not valid java name */
    public final ExtendedColors m5078copy5u6CDpA(@NotNull Colors colors, long toolBar, long emphasis, long emphasisVariant, long surfaceComponent, long loginProgressIndicatorBackground, long loginProgressIndicatorOverlap, long shimmerBase, long shimmerHighlight, long androidStatusBarColor, long textPrimary, long textPrimaryInverse, long textSecondary, long textSecondaryInverse, long textUncovered, long textIncome, @NotNull Surface surface, @NotNull Support support, @NotNull Badge badge, @NotNull Notification notification, @NotNull Format format, @NotNull Rating rating, @NotNull Categories categories, @NotNull Process process, @NotNull Risk risk, @NotNull Data data, @NotNull Locations locations, @NotNull Emergent emergent, @NotNull Cta cta, @NotNull Selection selection, @NotNull Link link, @NotNull Form form) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(support, "support");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(process, "process");
        Intrinsics.checkNotNullParameter(risk, "risk");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(locations, "locations");
        Intrinsics.checkNotNullParameter(emergent, "emergent");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(form, "form");
        return new ExtendedColors(colors, toolBar, emphasis, emphasisVariant, surfaceComponent, loginProgressIndicatorBackground, loginProgressIndicatorOverlap, shimmerBase, shimmerHighlight, androidStatusBarColor, textPrimary, textPrimaryInverse, textSecondary, textSecondaryInverse, textUncovered, textIncome, surface, support, badge, notification, format, rating, categories, process, risk, data, locations, emergent, cta, selection, link, form, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedColors)) {
            return false;
        }
        ExtendedColors extendedColors = (ExtendedColors) other;
        return Intrinsics.areEqual(this.colors, extendedColors.colors) && androidx.compose.ui.graphics.Color.m2509equalsimpl0(this.toolBar, extendedColors.toolBar) && androidx.compose.ui.graphics.Color.m2509equalsimpl0(this.emphasis, extendedColors.emphasis) && androidx.compose.ui.graphics.Color.m2509equalsimpl0(this.emphasisVariant, extendedColors.emphasisVariant) && androidx.compose.ui.graphics.Color.m2509equalsimpl0(this.surfaceComponent, extendedColors.surfaceComponent) && androidx.compose.ui.graphics.Color.m2509equalsimpl0(this.loginProgressIndicatorBackground, extendedColors.loginProgressIndicatorBackground) && androidx.compose.ui.graphics.Color.m2509equalsimpl0(this.loginProgressIndicatorOverlap, extendedColors.loginProgressIndicatorOverlap) && androidx.compose.ui.graphics.Color.m2509equalsimpl0(this.shimmerBase, extendedColors.shimmerBase) && androidx.compose.ui.graphics.Color.m2509equalsimpl0(this.shimmerHighlight, extendedColors.shimmerHighlight) && androidx.compose.ui.graphics.Color.m2509equalsimpl0(this.androidStatusBarColor, extendedColors.androidStatusBarColor) && androidx.compose.ui.graphics.Color.m2509equalsimpl0(this.textPrimary, extendedColors.textPrimary) && androidx.compose.ui.graphics.Color.m2509equalsimpl0(this.textPrimaryInverse, extendedColors.textPrimaryInverse) && androidx.compose.ui.graphics.Color.m2509equalsimpl0(this.textSecondary, extendedColors.textSecondary) && androidx.compose.ui.graphics.Color.m2509equalsimpl0(this.textSecondaryInverse, extendedColors.textSecondaryInverse) && androidx.compose.ui.graphics.Color.m2509equalsimpl0(this.textUncovered, extendedColors.textUncovered) && androidx.compose.ui.graphics.Color.m2509equalsimpl0(this.textIncome, extendedColors.textIncome) && Intrinsics.areEqual(this.surface, extendedColors.surface) && Intrinsics.areEqual(this.support, extendedColors.support) && Intrinsics.areEqual(this.badge, extendedColors.badge) && Intrinsics.areEqual(this.notification, extendedColors.notification) && Intrinsics.areEqual(this.format, extendedColors.format) && Intrinsics.areEqual(this.rating, extendedColors.rating) && Intrinsics.areEqual(this.categories, extendedColors.categories) && Intrinsics.areEqual(this.process, extendedColors.process) && Intrinsics.areEqual(this.risk, extendedColors.risk) && Intrinsics.areEqual(this.data, extendedColors.data) && Intrinsics.areEqual(this.locations, extendedColors.locations) && Intrinsics.areEqual(this.emergent, extendedColors.emergent) && Intrinsics.areEqual(this.cta, extendedColors.cta) && Intrinsics.areEqual(this.selection, extendedColors.selection) && Intrinsics.areEqual(this.link, extendedColors.link) && Intrinsics.areEqual(this.form, extendedColors.form);
    }

    /* JADX INFO: renamed from: getAndroidStatusBarColor-0d7_KjU, reason: not valid java name */
    public final long m5079getAndroidStatusBarColor0d7_KjU() {
        return this.androidStatusBarColor;
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m5080getBackground0d7_KjU() {
        return this.colors.m706getBackground0d7_KjU();
    }

    @NotNull
    public final Badge getBadge() {
        return this.badge;
    }

    @NotNull
    public final Categories getCategories() {
        return this.categories;
    }

    @NotNull
    public final Colors getColors() {
        return this.colors;
    }

    @NotNull
    public final Cta getCta() {
        return this.cta;
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final Emergent getEmergent() {
        return this.emergent;
    }

    /* JADX INFO: renamed from: getEmphasis-0d7_KjU, reason: not valid java name */
    public final long m5081getEmphasis0d7_KjU() {
        return this.emphasis;
    }

    /* JADX INFO: renamed from: getEmphasisVariant-0d7_KjU, reason: not valid java name */
    public final long m5082getEmphasisVariant0d7_KjU() {
        return this.emphasisVariant;
    }

    /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m5083getError0d7_KjU() {
        return this.colors.m707getError0d7_KjU();
    }

    @NotNull
    public final Form getForm() {
        return this.form;
    }

    @NotNull
    public final Format getFormat() {
        return this.format;
    }

    @NotNull
    public final Link getLink() {
        return this.link;
    }

    @NotNull
    public final Locations getLocations() {
        return this.locations;
    }

    /* JADX INFO: renamed from: getLoginProgressIndicatorBackground-0d7_KjU, reason: not valid java name */
    public final long m5084getLoginProgressIndicatorBackground0d7_KjU() {
        return this.loginProgressIndicatorBackground;
    }

    /* JADX INFO: renamed from: getLoginProgressIndicatorOverlap-0d7_KjU, reason: not valid java name */
    public final long m5085getLoginProgressIndicatorOverlap0d7_KjU() {
        return this.loginProgressIndicatorOverlap;
    }

    @NotNull
    public final Notification getNotification() {
        return this.notification;
    }

    /* JADX INFO: renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m5086getOnBackground0d7_KjU() {
        return this.colors.m708getOnBackground0d7_KjU();
    }

    /* JADX INFO: renamed from: getOnError-0d7_KjU, reason: not valid java name */
    public final long m5087getOnError0d7_KjU() {
        return this.colors.m709getOnError0d7_KjU();
    }

    /* JADX INFO: renamed from: getOnPrimary-0d7_KjU, reason: not valid java name */
    public final long m5088getOnPrimary0d7_KjU() {
        return this.colors.m710getOnPrimary0d7_KjU();
    }

    /* JADX INFO: renamed from: getOnSecondary-0d7_KjU, reason: not valid java name */
    public final long m5089getOnSecondary0d7_KjU() {
        return this.colors.m711getOnSecondary0d7_KjU();
    }

    /* JADX INFO: renamed from: getOnSurface-0d7_KjU, reason: not valid java name */
    public final long m5090getOnSurface0d7_KjU() {
        return this.colors.m712getOnSurface0d7_KjU();
    }

    /* JADX INFO: renamed from: getPrimary-0d7_KjU, reason: not valid java name */
    public final long m5091getPrimary0d7_KjU() {
        return this.colors.m713getPrimary0d7_KjU();
    }

    /* JADX INFO: renamed from: getPrimaryVariant-0d7_KjU, reason: not valid java name */
    public final long m5092getPrimaryVariant0d7_KjU() {
        return this.colors.m714getPrimaryVariant0d7_KjU();
    }

    @NotNull
    public final Process getProcess() {
        return this.process;
    }

    @NotNull
    public final Rating getRating() {
        return this.rating;
    }

    @NotNull
    public final Risk getRisk() {
        return this.risk;
    }

    /* JADX INFO: renamed from: getSecondary-0d7_KjU, reason: not valid java name */
    public final long m5093getSecondary0d7_KjU() {
        return this.colors.m715getSecondary0d7_KjU();
    }

    /* JADX INFO: renamed from: getSecondaryVariant-0d7_KjU, reason: not valid java name */
    public final long m5094getSecondaryVariant0d7_KjU() {
        return this.colors.m716getSecondaryVariant0d7_KjU();
    }

    @NotNull
    public final Selection getSelection() {
        return this.selection;
    }

    /* JADX INFO: renamed from: getShimmerBase-0d7_KjU, reason: not valid java name */
    public final long m5095getShimmerBase0d7_KjU() {
        return this.shimmerBase;
    }

    /* JADX INFO: renamed from: getShimmerHighlight-0d7_KjU, reason: not valid java name */
    public final long m5096getShimmerHighlight0d7_KjU() {
        return this.shimmerHighlight;
    }

    @NotNull
    public final Support getSupport() {
        return this.support;
    }

    @NotNull
    public final Surface getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: getSurfaceComponent-0d7_KjU, reason: not valid java name */
    public final long m5097getSurfaceComponent0d7_KjU() {
        return this.surfaceComponent;
    }

    /* JADX INFO: renamed from: getTextIncome-0d7_KjU, reason: not valid java name */
    public final long m5098getTextIncome0d7_KjU() {
        return this.textIncome;
    }

    /* JADX INFO: renamed from: getTextPrimary-0d7_KjU, reason: not valid java name */
    public final long m5099getTextPrimary0d7_KjU() {
        return this.textPrimary;
    }

    /* JADX INFO: renamed from: getTextPrimaryInverse-0d7_KjU, reason: not valid java name */
    public final long m5100getTextPrimaryInverse0d7_KjU() {
        return this.textPrimaryInverse;
    }

    /* JADX INFO: renamed from: getTextSecondary-0d7_KjU, reason: not valid java name */
    public final long m5101getTextSecondary0d7_KjU() {
        return this.textSecondary;
    }

    /* JADX INFO: renamed from: getTextSecondaryInverse-0d7_KjU, reason: not valid java name */
    public final long m5102getTextSecondaryInverse0d7_KjU() {
        return this.textSecondaryInverse;
    }

    /* JADX INFO: renamed from: getTextUncovered-0d7_KjU, reason: not valid java name */
    public final long m5103getTextUncovered0d7_KjU() {
        return this.textUncovered;
    }

    /* JADX INFO: renamed from: getToolBar-0d7_KjU, reason: not valid java name */
    public final long m5104getToolBar0d7_KjU() {
        return this.toolBar;
    }

    public int hashCode() {
        return this.form.hashCode() + ((this.link.hashCode() + ((this.selection.hashCode() + ((this.cta.hashCode() + ((this.emergent.hashCode() + ((this.locations.hashCode() + ((this.data.hashCode() + ((this.risk.hashCode() + ((this.process.hashCode() + ((this.categories.hashCode() + ((this.rating.hashCode() + ((this.format.hashCode() + ((this.notification.hashCode() + ((this.badge.hashCode() + ((this.support.hashCode() + ((this.surface.hashCode() + j.a(this.textIncome, j.a(this.textUncovered, j.a(this.textSecondaryInverse, j.a(this.textSecondary, j.a(this.textPrimaryInverse, j.a(this.textPrimary, j.a(this.androidStatusBarColor, j.a(this.shimmerHighlight, j.a(this.shimmerBase, j.a(this.loginProgressIndicatorOverlap, j.a(this.loginProgressIndicatorBackground, j.a(this.surfaceComponent, j.a(this.emphasisVariant, j.a(this.emphasis, j.a(this.toolBar, this.colors.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean isLight() {
        return this.colors.isLight();
    }

    @NotNull
    public String toString() {
        String strM2516toStringimpl = androidx.compose.ui.graphics.Color.m2516toStringimpl(this.toolBar);
        String strM2516toStringimpl2 = androidx.compose.ui.graphics.Color.m2516toStringimpl(this.emphasis);
        String strM2516toStringimpl3 = androidx.compose.ui.graphics.Color.m2516toStringimpl(this.emphasisVariant);
        String strM2516toStringimpl4 = androidx.compose.ui.graphics.Color.m2516toStringimpl(this.surfaceComponent);
        String strM2516toStringimpl5 = androidx.compose.ui.graphics.Color.m2516toStringimpl(this.loginProgressIndicatorBackground);
        String strM2516toStringimpl6 = androidx.compose.ui.graphics.Color.m2516toStringimpl(this.loginProgressIndicatorOverlap);
        String strM2516toStringimpl7 = androidx.compose.ui.graphics.Color.m2516toStringimpl(this.shimmerBase);
        String strM2516toStringimpl8 = androidx.compose.ui.graphics.Color.m2516toStringimpl(this.shimmerHighlight);
        String strM2516toStringimpl9 = androidx.compose.ui.graphics.Color.m2516toStringimpl(this.androidStatusBarColor);
        String strM2516toStringimpl10 = androidx.compose.ui.graphics.Color.m2516toStringimpl(this.textPrimary);
        String strM2516toStringimpl11 = androidx.compose.ui.graphics.Color.m2516toStringimpl(this.textPrimaryInverse);
        String strM2516toStringimpl12 = androidx.compose.ui.graphics.Color.m2516toStringimpl(this.textSecondary);
        String strM2516toStringimpl13 = androidx.compose.ui.graphics.Color.m2516toStringimpl(this.textSecondaryInverse);
        String strM2516toStringimpl14 = androidx.compose.ui.graphics.Color.m2516toStringimpl(this.textUncovered);
        String strM2516toStringimpl15 = androidx.compose.ui.graphics.Color.m2516toStringimpl(this.textIncome);
        StringBuilder sb2 = new StringBuilder("ExtendedColors(colors=");
        sb2.append(this.colors);
        sb2.append(", toolBar=");
        sb2.append(strM2516toStringimpl);
        sb2.append(", emphasis=");
        k.e(sb2, strM2516toStringimpl2, ", emphasisVariant=", strM2516toStringimpl3, ", surfaceComponent=");
        k.e(sb2, strM2516toStringimpl4, ", loginProgressIndicatorBackground=", strM2516toStringimpl5, ", loginProgressIndicatorOverlap=");
        k.e(sb2, strM2516toStringimpl6, ", shimmerBase=", strM2516toStringimpl7, ", shimmerHighlight=");
        k.e(sb2, strM2516toStringimpl8, ", androidStatusBarColor=", strM2516toStringimpl9, ", textPrimary=");
        k.e(sb2, strM2516toStringimpl10, ", textPrimaryInverse=", strM2516toStringimpl11, ", textSecondary=");
        k.e(sb2, strM2516toStringimpl12, ", textSecondaryInverse=", strM2516toStringimpl13, ", textUncovered=");
        k.e(sb2, strM2516toStringimpl14, ", textIncome=", strM2516toStringimpl15, ", surface=");
        sb2.append(this.surface);
        sb2.append(", support=");
        sb2.append(this.support);
        sb2.append(", badge=");
        sb2.append(this.badge);
        sb2.append(", notification=");
        sb2.append(this.notification);
        sb2.append(", format=");
        sb2.append(this.format);
        sb2.append(", rating=");
        sb2.append(this.rating);
        sb2.append(", categories=");
        sb2.append(this.categories);
        sb2.append(", process=");
        sb2.append(this.process);
        sb2.append(", risk=");
        sb2.append(this.risk);
        sb2.append(", data=");
        sb2.append(this.data);
        sb2.append(", locations=");
        sb2.append(this.locations);
        sb2.append(", emergent=");
        sb2.append(this.emergent);
        sb2.append(", cta=");
        sb2.append(this.cta);
        sb2.append(", selection=");
        sb2.append(this.selection);
        sb2.append(", link=");
        sb2.append(this.link);
        sb2.append(", form=");
        sb2.append(this.form);
        sb2.append(")");
        return sb2.toString();
    }
}
