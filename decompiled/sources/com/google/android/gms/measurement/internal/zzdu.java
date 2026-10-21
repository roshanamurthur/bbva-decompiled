package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzmt;
import com.google.android.gms.internal.measurement.zzmw;
import com.google.android.gms.internal.measurement.zzmz;
import com.google.android.gms.internal.measurement.zznc;
import com.google.android.gms.internal.measurement.zznf;
import com.google.android.gms.internal.measurement.zzni;
import com.google.android.gms.internal.measurement.zznl;
import com.google.android.gms.internal.measurement.zzno;
import com.google.android.gms.internal.measurement.zznr;
import com.google.android.gms.internal.measurement.zznu;
import com.google.android.gms.internal.measurement.zznx;
import com.google.android.gms.internal.measurement.zzoa;
import com.google.android.gms.internal.measurement.zzod;
import com.google.android.gms.internal.measurement.zzog;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzom;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpb;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpk;
import com.google.android.gms.internal.measurement.zzpn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
@VisibleForTesting
public final class zzdu {
    public static final zzdt zzA;
    public static final zzdt zzB;
    public static final zzdt zzC;
    public static final zzdt zzD;
    public static final zzdt zzE;
    public static final zzdt zzF;
    public static final zzdt zzG;
    public static final zzdt zzH;
    public static final zzdt zzI;
    public static final zzdt zzJ;
    public static final zzdt zzK;
    public static final zzdt zzL;
    public static final zzdt zzM;
    public static final zzdt zzN;
    public static final zzdt zzO;
    public static final zzdt zzP;
    public static final zzdt zzQ;
    public static final zzdt zzR;
    public static final zzdt zzS;
    public static final zzdt zzT;
    public static final zzdt zzU;
    public static final zzdt zzV;
    public static final zzdt zzW;
    public static final zzdt zzX;
    public static final zzdt zzY;
    public static final zzdt zzZ;
    public static final zzdt zzaa;
    public static final zzdt zzab;
    public static final zzdt zzac;
    public static final zzdt zzad;
    public static final zzdt zzae;
    public static final zzdt zzaf;
    public static final zzdt zzag;
    public static final zzdt zzah;
    public static final zzdt zzai;
    public static final zzdt zzaj;
    public static final zzdt zzak;
    public static final zzdt zzal;
    public static final zzdt zzam;
    public static final zzdt zzan;
    public static final zzdt zzao;
    public static final zzdt zzap;
    public static final zzdt zzaq;
    public static final zzdt zzar;
    public static final zzdt zzas;
    public static final zzdt zzat;
    public static final zzdt zzau;
    public static final zzdt zzav;
    public static final zzdt zzaw;
    public static final zzdt zzax;
    public static final zzdt zzj;
    public static final zzdt zzk;
    public static final zzdt zzl;
    public static final zzdt zzm;
    public static final zzdt zzn;
    public static final zzdt zzo;
    public static final zzdt zzp;
    public static final zzdt zzq;
    public static final zzdt zzr;
    public static final zzdt zzs;
    public static final zzdt zzt;
    public static final zzdt zzu;
    public static final zzdt zzv;
    public static final zzdt zzw;
    public static final zzdt zzx;
    public static final zzdt zzy;
    public static final zzdt zzz;
    private static final List zzay = Collections.synchronizedList(new ArrayList());
    private static final Set zzaz = Collections.synchronizedSet(new HashSet());
    public static final zzdt zza = zza("measurement.ad_id_cache_time", 10000L, 10000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzaw
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(zznf.zzb());
        }
    });
    public static final zzdt zzb = zza("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbh
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(zznf.zzl());
        }
    });
    public static final zzdt zzc = zza("measurement.config.cache_time", 86400000L, 3600000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzaz
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(zznf.zzd());
        }
    });
    public static final zzdt zzd = zza("measurement.config.url_scheme", ProxyConfig.MATCH_HTTPS, ProxyConfig.MATCH_HTTPS, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbl
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return zznf.zzJ();
        }
    });
    public static final zzdt zze = zza("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbx
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return zznf.zzI();
        }
    });
    public static final zzdt zzf = zza("measurement.upload.max_bundles", 100, 100, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcj
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Integer.valueOf((int) zznf.zzv());
        }
    });
    public static final zzdt zzg = zza("measurement.upload.max_batch_size", 65536, 65536, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcv
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Integer.valueOf((int) zznf.zzD());
        }
    });
    public static final zzdt zzh = zza("measurement.upload.max_bundle_size", 65536, 65536, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdh
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Integer.valueOf((int) zznf.zzu());
        }
    });
    public static final zzdt zzi = zza("measurement.upload.max_events_per_bundle", 1000, 1000, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdl
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Integer.valueOf((int) zznf.zzy());
        }
    });

    static {
        Integer numValueOf = Integer.valueOf(AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength);
        zzj = zza("measurement.upload.max_events_per_day", numValueOf, numValueOf, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdm
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznf.zzz());
            }
        });
        zzk = zza("measurement.upload.max_error_events_per_day", 1000, 1000, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbs
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznf.zzx());
            }
        });
        zzl = zza("measurement.upload.max_public_events_per_day", 50000, 50000, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcd
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznf.zzA());
            }
        });
        zzm = zza("measurement.upload.max_conversions_per_day", 10000, 10000, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzco
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznf.zzw());
            }
        });
        zzn = zza("measurement.upload.max_realtime_events_per_day", 10, 10, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcz
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznf.zzC());
            }
        });
        zzo = zza("measurement.store.max_stored_events_per_app", numValueOf, numValueOf, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdk
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznf.zzg());
            }
        });
        zzp = zza("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdn
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return zznf.zzK();
            }
        });
        zzq = zza("measurement.upload.backoff_period", 43200000L, 43200000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdo
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznf.zzr());
            }
        });
        zzr = zza("measurement.upload.window_interval", 3600000L, 3600000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdp
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznf.zzG());
            }
        });
        zzs = zza("measurement.upload.interval", 3600000L, 3600000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzax
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznf.zzt());
            }
        });
        zzt = zza("measurement.upload.realtime_upload_interval", 10000L, 10000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzay
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznf.zzm());
            }
        });
        zzu = zza("measurement.upload.debug_upload_interval", 1000L, 1000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzba
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznf.zze());
            }
        });
        zzv = zza("measurement.upload.minimum_delay", 500L, 500L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbb
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznf.zzk());
            }
        });
        zzw = zza("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbc
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznf.zzj());
            }
        });
        zzx = zza("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbd
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznf.zzp());
            }
        });
        zzy = zza("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbe
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznf.zzn());
            }
        });
        zzz = zza("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbf
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznf.zzs());
            }
        });
        zzA = zza("measurement.upload.retry_time", 1800000L, 1800000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbg
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznf.zzF());
            }
        });
        zzB = zza("measurement.upload.retry_count", 6, 6, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbi
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznf.zzE());
            }
        });
        zzC = zza("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbj
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznf.zzB());
            }
        });
        zzD = zza("measurement.lifetimevalue.max_currency_tracked", 4, 4, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbk
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznf.zzf());
            }
        });
        zzE = zza("measurement.audience.filter_result_max_count", 200, 200, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbm
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznf.zzi());
            }
        });
        zzF = zza("measurement.upload.max_public_user_properties", 25, 25, null);
        zzG = zza("measurement.upload.max_event_name_cardinality", 500, 500, null);
        zzH = zza("measurement.upload.max_public_event_params", 25, 25, null);
        zzI = zza("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbn
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznf.zzo());
            }
        });
        Boolean bool = Boolean.FALSE;
        zzJ = zza("measurement.test.boolean_flag", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbo
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzop.zzg());
            }
        });
        zzK = zza("measurement.test.string_flag", "---", "---", new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbp
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return zzop.zzf();
            }
        });
        zzL = zza("measurement.test.long_flag", -1L, -1L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbq
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zzop.zzd());
            }
        });
        zzM = zza("measurement.test.int_flag", -2, -2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbr
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zzop.zzc());
            }
        });
        Double dValueOf = Double.valueOf(-3.0d);
        zzN = zza("measurement.test.double_flag", dValueOf, dValueOf, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbt
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Double.valueOf(zzop.zzb());
            }
        });
        zzO = zza("measurement.experiment.max_ids", 50, 50, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbu
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznf.zzh());
            }
        });
        zzP = zza("measurement.max_bundles_per_iteration", 100, 100, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbv
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zznf.zzc());
            }
        });
        zzQ = zza("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbw
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(zznf.zzq());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        zzR = zza("measurement.validation.internal_limits_internal_event_params", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzby
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzom.zzc());
            }
        });
        zzS = zza("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbz
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzov.zzc());
            }
        });
        zzT = zza("measurement.quality.checksum", bool, bool, null);
        zzU = zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzca
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzoa.zze());
            }
        });
        zzV = zza("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcb
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzoa.zzd());
            }
        });
        zzW = zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcc
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzoa.zzf());
            }
        });
        zzX = zza("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzce
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzpk.zzc());
            }
        });
        zzY = zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcf
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzog.zzc());
            }
        });
        zzZ = zza("measurement.lifecycle.app_in_background_parameter", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcg
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzoj.zzc());
            }
        });
        zzaa = zza("measurement.integration.disable_firebase_instance_id", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzch
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzph.zzd());
            }
        });
        zzab = zza("measurement.collection.service.update_with_analytics_fix", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzci
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzpn.zzc());
            }
        });
        zzac = zza("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzck
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zznu.zzd());
            }
        });
        zzad = zza("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcl
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzod.zzd());
            }
        });
        zzae = zza("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcm
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzoy.zzc());
            }
        });
        zzaf = zza("measurement.upload.file_truncate_fix", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcn
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zznr.zzc());
            }
        });
        zzag = zza("measurement.collection.synthetic_data_mitigation", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcp
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzpe.zzc());
            }
        });
        zzah = zza("measurement.androidId.delete_feature", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcq
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzmw.zzc());
            }
        });
        zzai = zza("measurement.service.storage_consent_support_version", 203600, 203600, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcr
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) zzni.zzb());
            }
        });
        zzaj = zza("measurement.client.click_identifier_control.dev", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcs
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzmz.zzc());
            }
        });
        zzak = zza("measurement.service.click_identifier_control", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzct
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zznc.zzc());
            }
        });
        zzal = zza("measurement.client.consent.gmpappid_worker_thread_fix", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcu
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zznx.zzd());
            }
        });
        zzam = zza("measurement.module.pixie.fix_array", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcw
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzos.zzd());
            }
        });
        zzan = zza("measurement.adid_zero.service", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcx
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzmt.zze());
            }
        });
        zzao = zza("measurement.adid_zero.remove_lair_if_adidzero_false", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcy
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzmt.zzg());
            }
        });
        zzap = zza("measurement.adid_zero.remove_lair_if_userid_cleared", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzda
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzmt.zzh());
            }
        });
        zzaq = zza("measurement.adid_zero.remove_lair_on_id_value_change_only", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdb
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzmt.zzi());
            }
        });
        zzar = zza("measurement.adid_zero.adid_uid", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdc
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzmt.zzf());
            }
        });
        zzas = zza("measurement.adid_zero.app_instance_id_fix", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdd
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzmt.zzd());
            }
        });
        zzat = zza("measurement.service.refactor.package_side_screen", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzde
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzpb.zzd());
            }
        });
        zzau = zza("measurement.enhanced_campaign.service", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdf
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zznl.zze());
            }
        });
        zzav = zza("measurement.enhanced_campaign.client", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdg
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zznl.zzd());
            }
        });
        zzaw = zza("measurement.service.store_null_safelist", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdi
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzno.zzd());
            }
        });
        zzax = zza("measurement.service.store_safelist", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdj
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(zzno.zze());
            }
        });
    }

    @VisibleForTesting
    public static zzdt zza(String str, Object obj, Object obj2, zzdq zzdqVar) {
        zzdt zzdtVar = new zzdt(str, obj, obj2, zzdqVar, null);
        zzay.add(zzdtVar);
        return zzdtVar;
    }

    public static Map zzc(Context context) {
        com.google.android.gms.internal.measurement.zzha zzhaVarZza = com.google.android.gms.internal.measurement.zzha.zza(context.getContentResolver(), com.google.android.gms.internal.measurement.zzhk.zza("com.google.android.gms.measurement"));
        return zzhaVarZza == null ? Collections.emptyMap() : zzhaVarZza.zzc();
    }
}
